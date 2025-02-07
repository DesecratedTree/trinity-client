uniform vec3 params;
uniform sampler2D sceneTex;
const vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);
void main() {
    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);
    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));
}
