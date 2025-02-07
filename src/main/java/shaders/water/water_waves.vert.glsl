uniform float time;
uniform float scale;
varying vec3 wvVertex;
varying float waterDepth;
void main() {
    waterDepth = gl_MultiTexCoord0.z;
    vec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;
    wvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);
    wvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);
    wvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);
    gl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;
    gl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;
    gl_TexCoord[0].z = time;
    gl_TexCoord[0].w = 1.0;
    gl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);
    gl_Position = ftransform();
}
