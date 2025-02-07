#extension GL_ARB_texture_rectangle : enable
uniform vec4 paramsWeightings;
uniform sampler2DRect sceneTex;
uniform sampler3D remap_1, remap_2, remap_3, remap_4;

void main() {
    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;
    col = clamp(col,0.0,1.0);
    vec3 outCol = col * paramsWeightings.x;
    //Clamp the colour coords so we sample correctly
    float minC = 0.03125; // 0.5/16.0
    float maxC = 0.96875; // 1.0-(0.5/16.0)
    col = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);

    outCol += texture3D(remap_1, col).rgb * paramsWeightings.y;
    outCol += texture3D(remap_2, col).rgb * paramsWeightings.z;

    gl_FragColor = vec4(outCol, 1.0);
}