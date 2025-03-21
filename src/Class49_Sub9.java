/* Class49_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class49_Sub9 extends Class49 {
	boolean aBoolean7090 = false;
	static String aString7091 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
	static String aString7092 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
	boolean aBoolean7093 = false;
	Class28 aClass28_7094;
	Class47 aClass47_7095;

	void method620(int i, int i_0_) {
		if (((Class49_Sub9) this).aBoolean7090) {
			int i_1_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_2_ = i_0_ & 0xffff;
			float f_3_ = (float) (i_0_ >> 16 & 0x3) / 8.0F;
			int i_4_ = ((Class28) ((Class49_Sub9) this).aClass28_7094).anInt333;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "time"), (float) (i_1_ * ((Class_ra_Sub1) (((Class49_Sub9) this).aClass_ra_Sub1_478)).anInt8304 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "breakWaterDepth"), (float) i_2_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "breakWaterOffset"), f_3_);
		}
	}

	boolean method601() {
		return ((Class49_Sub9) this).aBoolean7093;
	}

	void method603() {
		if (((Class49_Sub9) this).aBoolean7090) {
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4843(0);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4844(null);
			OpenGL.glUseProgram(0);
			((Class49_Sub9) this).aBoolean7090 = false;
		}
	}

	void method608(boolean bool) {
		/* empty */
	}

	void method613() {
		if (((Class49_Sub9) this).aBoolean7090) {
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4843(0);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4844(null);
			OpenGL.glUseProgram(0);
			((Class49_Sub9) this).aBoolean7090 = false;
		}
	}

	void method606(int i, int i_5_) {
		if (((Class49_Sub9) this).aBoolean7090) {
			int i_6_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_7_ = i_5_ & 0xffff;
			float f_8_ = (float) (i_5_ >> 16 & 0x3) / 8.0F;
			int i_9_ = ((Class28) ((Class49_Sub9) this).aClass28_7094).anInt333;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "time"), (float) (i_6_ * ((Class_ra_Sub1) (((Class49_Sub9) this).aClass_ra_Sub1_478)).anInt8304 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "breakWaterDepth"), (float) i_7_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "breakWaterOffset"), f_8_);
		}
	}

	void method600(Class36 class36, int i) {
		if (!((Class49_Sub9) this).aBoolean7090) {
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4844(class36);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4836(i);
		}
	}

	boolean method605() {
		return ((Class49_Sub9) this).aBoolean7093;
	}

	void method604() {
		if (((Class49_Sub9) this).aBoolean7090) {
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4843(0);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4844(null);
			OpenGL.glUseProgram(0);
			((Class49_Sub9) this).aBoolean7090 = false;
		}
	}

	void method609(boolean bool) {
		Class36_Sub3 class36_sub3 = ((Class49_Sub9) this).aClass_ra_Sub1_478.method4832();
		if (((Class49_Sub9) this).aBoolean7093 && class36_sub3 != null) {
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4844(class36_sub3);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4843(0);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub9) this).aClass47_7095).aClass36_Sub2_459);
			int i = ((Class28) ((Class49_Sub9) this).aClass28_7094).anInt333;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class_ra_Sub1) ((Class49_Sub9) this).aClass_ra_Sub1_478).aFloatArray8366[0]), -(((Class_ra_Sub1) ((Class49_Sub9) this).aClass_ra_Sub1_478).aFloatArray8366[1]), -(((Class_ra_Sub1) ((Class49_Sub9) this).aClass_ra_Sub1_478).aFloatArray8366[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class_ra_Sub1) ((Class49_Sub9) this).aClass_ra_Sub1_478).aFloat8250), (((Class_ra_Sub1) ((Class49_Sub9) this).aClass_ra_Sub1_478).aFloat8370), (((Class_ra_Sub1) ((Class49_Sub9) this).aClass_ra_Sub1_478).aFloat8371), 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(((Class_ra_Sub1) (((Class49_Sub9) this).aClass_ra_Sub1_478)).aFloatArray8366[1]) * 928.0F);
			((Class49_Sub9) this).aBoolean7090 = true;
		}
	}

	void method610(boolean bool) {
		/* empty */
	}

	void method607(boolean bool) {
		/* empty */
	}

	void method612(boolean bool) {
		/* empty */
	}

	void method617(int i, int i_10_) {
		if (((Class49_Sub9) this).aBoolean7090) {
			int i_11_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_12_ = i_10_ & 0xffff;
			float f_13_ = (float) (i_10_ >> 16 & 0x3) / 8.0F;
			int i_14_ = ((Class28) ((Class49_Sub9) this).aClass28_7094).anInt333;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_14_, "time"), (float) (i_11_ * ((Class_ra_Sub1) (((Class49_Sub9) this).aClass_ra_Sub1_478)).anInt8304 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_14_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_14_, "breakWaterDepth"), (float) i_12_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_14_, "breakWaterOffset"), f_13_);
		}
	}

	void method602(boolean bool) {
		Class36_Sub3 class36_sub3 = ((Class49_Sub9) this).aClass_ra_Sub1_478.method4832();
		if (((Class49_Sub9) this).aBoolean7093 && class36_sub3 != null) {
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4844(class36_sub3);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4843(0);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub9) this).aClass47_7095).aClass36_Sub2_459);
			int i = ((Class28) ((Class49_Sub9) this).aClass28_7094).anInt333;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class_ra_Sub1) ((Class49_Sub9) this).aClass_ra_Sub1_478).aFloatArray8366[0]), -(((Class_ra_Sub1) ((Class49_Sub9) this).aClass_ra_Sub1_478).aFloatArray8366[1]), -(((Class_ra_Sub1) ((Class49_Sub9) this).aClass_ra_Sub1_478).aFloatArray8366[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class_ra_Sub1) ((Class49_Sub9) this).aClass_ra_Sub1_478).aFloat8250), (((Class_ra_Sub1) ((Class49_Sub9) this).aClass_ra_Sub1_478).aFloat8370), (((Class_ra_Sub1) ((Class49_Sub9) this).aClass_ra_Sub1_478).aFloat8371), 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(((Class_ra_Sub1) (((Class49_Sub9) this).aClass_ra_Sub1_478)).aFloatArray8366[1]) * 928.0F);
			((Class49_Sub9) this).aBoolean7090 = true;
		}
	}

	boolean method611() {
		return ((Class49_Sub9) this).aBoolean7093;
	}

	void method615(Class36 class36, int i) {
		if (!((Class49_Sub9) this).aBoolean7090) {
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4844(class36);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4836(i);
		}
	}

	void method616(Class36 class36, int i) {
		if (!((Class49_Sub9) this).aBoolean7090) {
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4844(class36);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4836(i);
		}
	}

	Class49_Sub9(Class_ra_Sub1 class_ra_sub1, Class47 class47) {
		super(class_ra_sub1);
		((Class49_Sub9) this).aClass47_7095 = class47;
		if ((((Class47) ((Class49_Sub9) this).aClass47_7095).aClass36_Sub2_459 != null) && (((Class_ra_Sub1) ((Class49_Sub9) this).aClass_ra_Sub1_478).aBoolean8426) && (((Class_ra_Sub1) ((Class49_Sub9) this).aClass_ra_Sub1_478).aBoolean8355)) {
			Class35 class35 = (Class35.method506(((Class49_Sub9) this).aClass_ra_Sub1_478, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
			Class35 class35_15_ = (Class35.method506(((Class49_Sub9) this).aClass_ra_Sub1_478, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
			((Class49_Sub9) this).aClass28_7094 = Class28.method496(((Class49_Sub9) this).aClass_ra_Sub1_478, new Class35[] { class35, class35_15_ });
			((Class49_Sub9) this).aBoolean7093 = ((Class49_Sub9) this).aClass28_7094 != null;
		}
	}

	void method618(int i, int i_16_) {
		if (((Class49_Sub9) this).aBoolean7090) {
			int i_17_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_18_ = i_16_ & 0xffff;
			float f_19_ = (float) (i_16_ >> 16 & 0x3) / 8.0F;
			int i_20_ = ((Class28) ((Class49_Sub9) this).aClass28_7094).anInt333;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_20_, "time"), (float) (i_17_ * ((Class_ra_Sub1) (((Class49_Sub9) this).aClass_ra_Sub1_478)).anInt8304 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_20_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_20_, "breakWaterDepth"), (float) i_18_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_20_, "breakWaterOffset"), f_19_);
		}
	}

	void method619(int i, int i_21_) {
		if (((Class49_Sub9) this).aBoolean7090) {
			int i_22_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_23_ = i_21_ & 0xffff;
			float f_24_ = (float) (i_21_ >> 16 & 0x3) / 8.0F;
			int i_25_ = ((Class28) ((Class49_Sub9) this).aClass28_7094).anInt333;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_25_, "time"), (float) (i_22_ * ((Class_ra_Sub1) (((Class49_Sub9) this).aClass_ra_Sub1_478)).anInt8304 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_25_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_25_, "breakWaterDepth"), (float) i_23_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_25_, "breakWaterOffset"), f_24_);
		}
	}

	void method614() {
		if (((Class49_Sub9) this).aBoolean7090) {
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4843(0);
			((Class49_Sub9) this).aClass_ra_Sub1_478.method4844(null);
			OpenGL.glUseProgram(0);
			((Class49_Sub9) this).aBoolean7090 = false;
		}
	}

	void method621(int i, int i_26_) {
		if (((Class49_Sub9) this).aBoolean7090) {
			int i_27_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_28_ = i_26_ & 0xffff;
			float f_29_ = (float) (i_26_ >> 16 & 0x3) / 8.0F;
			int i_30_ = ((Class28) ((Class49_Sub9) this).aClass28_7094).anInt333;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_30_, "time"), (float) (i_27_ * ((Class_ra_Sub1) (((Class49_Sub9) this).aClass_ra_Sub1_478)).anInt8304 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_30_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_30_, "breakWaterDepth"), (float) i_28_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_30_, "breakWaterOffset"), f_29_);
		}
	}
}
