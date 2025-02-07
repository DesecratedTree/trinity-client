#extension GL_ARB_texture_rectangle : enable

uniform vec3 params;
uniform vec3 dimScale;
uniform sampler2D bloomTex;
uniform sampler2DRect sceneTex;
const vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);

void main() {
    vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);
    vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);
    float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;
    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);
    gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);
}
