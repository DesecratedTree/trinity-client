#extension GL_ARB_texture_rectangle : enable
uniform vec4 paramsWeightings;
uniform sampler2DRect sceneTex;
uniform sampler2D remap_1, remap_2, remap_3, remap_4;

vec3 remap_uv(vec3 in_coord) {
    float Scale = 15.0 / 16.0;
    float IntB = floor(in_coord.b * 14.9999) / 16.0;
    float FracB = in_coord.b * 15.0 - IntB * 16.0;
    float U = IntB + in_coord.r * Scale / 16.0;
    float V = in_coord.g * Scale;
    return vec3(U,V,FracB);
}

void main() {
    vec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);
    vec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);
    vec3 UVFrac = remap_uv(outCol);
    vec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);
    vec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);
    outCol *= paramsWeightings.x;

    outCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;
    outCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;

    gl_FragColor = vec4(outCol, 1.0);
}