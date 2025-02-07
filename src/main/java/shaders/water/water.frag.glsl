varying vec3 wvVertex;
varying float waterDepth;
uniform vec3 sunDir;
uniform vec4 sunColour;
uniform float sunExponent;
uniform float breakWaterDepth;
uniform float breakWaterOffset;
uniform sampler3D normalSampler;
uniform samplerCube envMapSampler;
void main() {
    vec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;
    wnNormal.xyz = 2.0*wnNormal.xyz-1.0;
    vec3 wnVector = normalize(wvVertex);
    vec3 wnReflection = reflect(wnVector, wnNormal.xyz);
    vec3 envColour = textureCube(envMapSampler, wnReflection).rgb;
    vec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);
    float shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);
    float ndote = dot(wnVector, wnNormal.xyz);
    float fresnel = pow(1.0-abs(ndote), 2.0);
    vec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;
    gl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);
}
