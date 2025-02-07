#extension GL_ARB_texture_rectangle : enable

uniform vec3 params;
uniform sampler2DRect sceneTex;
const vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);

void main() {
    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);
    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));
}