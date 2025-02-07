#version 110

out vec3 fragColor;

void main() {
    fragColor = gl_Color;
    gl_Position = gl_ProjectionMatrix * gl_ModelViewMatrix * gl_Vertex;
}