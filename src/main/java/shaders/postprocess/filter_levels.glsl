#extension GL_ARB_texture_rectangle : enable

uniform float paramsGamma;
uniform vec4 paramsRanges;
uniform sampler2DRect sceneTex;

void main() {
    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;
    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);
    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);
    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));
    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);
    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);
    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);
}