/* Class49_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class49_Sub6 extends Class49 {
	boolean aBoolean7071 = false;
	Class47 aClass47_7072;
	Class28 aClass28_7073;
	static String aString7074 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
	boolean aBoolean7075 = false;
	static String aString7076 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";

	boolean method601() {
		return ((Class49_Sub6) this).aBoolean7075;
	}

	void method612(boolean bool) {
		/* empty */
	}

	void method602(boolean bool) {
		Class36_Sub3 class36_sub3 = ((Class49_Sub6) this).aClass_ra_Sub1_478.method4832();
		if (((Class49_Sub6) this).aBoolean7075 && class36_sub3 != null) {
			float f = (1.0F + (1.0F - Math.abs(((Class_ra_Sub1) (((Class49_Sub6) this).aClass_ra_Sub1_478)).aFloatArray8366[1])) * 2.0F);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4844(class36_sub3);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4843(0);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub6) this).aClass47_7072).aClass36_Sub2_459);
			int i = ((Class28) ((Class49_Sub6) this).aClass28_7073).anInt333;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class_ra_Sub1) ((Class49_Sub6) this).aClass_ra_Sub1_478).aFloatArray8366[0]), -(((Class_ra_Sub1) ((Class49_Sub6) this).aClass_ra_Sub1_478).aFloatArray8366[1]), -(((Class_ra_Sub1) ((Class49_Sub6) this).aClass_ra_Sub1_478).aFloatArray8366[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class_ra_Sub1) ((Class49_Sub6) this).aClass_ra_Sub1_478).aFloat8250) * f, (((Class_ra_Sub1) ((Class49_Sub6) this).aClass_ra_Sub1_478).aFloat8370) * f, (((Class_ra_Sub1) ((Class49_Sub6) this).aClass_ra_Sub1_478).aFloat8371) * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(((Class_ra_Sub1) (((Class49_Sub6) this).aClass_ra_Sub1_478)).aFloatArray8366[1]) * 928.0F);
			((Class49_Sub6) this).aBoolean7071 = true;
		}
	}

	void method608(boolean bool) {
		/* empty */
	}

	void method604() {
		if (((Class49_Sub6) this).aBoolean7071) {
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4843(0);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4844(null);
			OpenGL.glUseProgram(0);
			((Class49_Sub6) this).aBoolean7071 = false;
		}
	}

	void method613() {
		if (((Class49_Sub6) this).aBoolean7071) {
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4843(0);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4844(null);
			OpenGL.glUseProgram(0);
			((Class49_Sub6) this).aBoolean7071 = false;
		}
	}

	void method600(Class36 class36, int i) {
		if (!((Class49_Sub6) this).aBoolean7071) {
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4844(class36);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4836(i);
		}
	}

	void method614() {
		if (((Class49_Sub6) this).aBoolean7071) {
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4843(0);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4844(null);
			OpenGL.glUseProgram(0);
			((Class49_Sub6) this).aBoolean7071 = false;
		}
	}

	void method620(int i, int i_0_) {
		if (((Class49_Sub6) this).aBoolean7071) {
			int i_1_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_2_ = i_0_ & 0xffff;
			float f_3_ = (float) (i_0_ >> 16 & 0x3) / 8.0F;
			float f_4_ = (float) (i_0_ >> 19 & 0xf) / 16.0F;
			float f_5_ = (float) (i_0_ >> 23 & 0xf) / 16.0F;
			int i_6_ = i_0_ >> 27 & 0xf;
			int i_7_ = ((Class28) ((Class49_Sub6) this).aClass28_7073).anInt333;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "time"), (float) (i_1_ * ((Class_ra_Sub1) (((Class49_Sub6) this).aClass_ra_Sub1_478)).anInt8304 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "breakWaterDepth"), (float) i_2_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "breakWaterOffset"), f_3_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_7_, "waveIntensity"), f_5_, f_4_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "waveExponent"), (float) i_6_);
		}
	}

	void method609(boolean bool) {
		Class36_Sub3 class36_sub3 = ((Class49_Sub6) this).aClass_ra_Sub1_478.method4832();
		if (((Class49_Sub6) this).aBoolean7075 && class36_sub3 != null) {
			float f = (1.0F + (1.0F - Math.abs(((Class_ra_Sub1) (((Class49_Sub6) this).aClass_ra_Sub1_478)).aFloatArray8366[1])) * 2.0F);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4844(class36_sub3);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4843(0);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub6) this).aClass47_7072).aClass36_Sub2_459);
			int i = ((Class28) ((Class49_Sub6) this).aClass28_7073).anInt333;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class_ra_Sub1) ((Class49_Sub6) this).aClass_ra_Sub1_478).aFloatArray8366[0]), -(((Class_ra_Sub1) ((Class49_Sub6) this).aClass_ra_Sub1_478).aFloatArray8366[1]), -(((Class_ra_Sub1) ((Class49_Sub6) this).aClass_ra_Sub1_478).aFloatArray8366[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class_ra_Sub1) ((Class49_Sub6) this).aClass_ra_Sub1_478).aFloat8250) * f, (((Class_ra_Sub1) ((Class49_Sub6) this).aClass_ra_Sub1_478).aFloat8370) * f, (((Class_ra_Sub1) ((Class49_Sub6) this).aClass_ra_Sub1_478).aFloat8371) * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(((Class_ra_Sub1) (((Class49_Sub6) this).aClass_ra_Sub1_478)).aFloatArray8366[1]) * 928.0F);
			((Class49_Sub6) this).aBoolean7071 = true;
		}
	}

	boolean method611() {
		return ((Class49_Sub6) this).aBoolean7075;
	}

	boolean method605() {
		return ((Class49_Sub6) this).aBoolean7075;
	}

	void method606(int i, int i_8_) {
		if (((Class49_Sub6) this).aBoolean7071) {
			int i_9_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_10_ = i_8_ & 0xffff;
			float f_11_ = (float) (i_8_ >> 16 & 0x3) / 8.0F;
			float f_12_ = (float) (i_8_ >> 19 & 0xf) / 16.0F;
			float f_13_ = (float) (i_8_ >> 23 & 0xf) / 16.0F;
			int i_14_ = i_8_ >> 27 & 0xf;
			int i_15_ = ((Class28) ((Class49_Sub6) this).aClass28_7073).anInt333;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "time"), (float) (i_9_ * ((Class_ra_Sub1) (((Class49_Sub6) this).aClass_ra_Sub1_478)).anInt8304 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "breakWaterDepth"), (float) i_10_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "breakWaterOffset"), f_11_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_15_, "waveIntensity"), f_13_, f_12_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "waveExponent"), (float) i_14_);
		}
	}

	void method610(boolean bool) {
		/* empty */
	}

	void method619(int i, int i_16_) {
		if (((Class49_Sub6) this).aBoolean7071) {
			int i_17_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_18_ = i_16_ & 0xffff;
			float f_19_ = (float) (i_16_ >> 16 & 0x3) / 8.0F;
			float f_20_ = (float) (i_16_ >> 19 & 0xf) / 16.0F;
			float f_21_ = (float) (i_16_ >> 23 & 0xf) / 16.0F;
			int i_22_ = i_16_ >> 27 & 0xf;
			int i_23_ = ((Class28) ((Class49_Sub6) this).aClass28_7073).anInt333;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_, "time"), (float) (i_17_ * ((Class_ra_Sub1) (((Class49_Sub6) this).aClass_ra_Sub1_478)).anInt8304 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_, "breakWaterDepth"), (float) i_18_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_, "breakWaterOffset"), f_19_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_23_, "waveIntensity"), f_21_, f_20_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_, "waveExponent"), (float) i_22_);
		}
	}

	void method603() {
		if (((Class49_Sub6) this).aBoolean7071) {
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4843(0);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4844(null);
			OpenGL.glUseProgram(0);
			((Class49_Sub6) this).aBoolean7071 = false;
		}
	}

	void method615(Class36 class36, int i) {
		if (!((Class49_Sub6) this).aBoolean7071) {
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4844(class36);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4836(i);
		}
	}

	void method616(Class36 class36, int i) {
		if (!((Class49_Sub6) this).aBoolean7071) {
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4844(class36);
			((Class49_Sub6) this).aClass_ra_Sub1_478.method4836(i);
		}
	}

	void method617(int i, int i_24_) {
		if (((Class49_Sub6) this).aBoolean7071) {
			int i_25_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_26_ = i_24_ & 0xffff;
			float f_27_ = (float) (i_24_ >> 16 & 0x3) / 8.0F;
			float f_28_ = (float) (i_24_ >> 19 & 0xf) / 16.0F;
			float f_29_ = (float) (i_24_ >> 23 & 0xf) / 16.0F;
			int i_30_ = i_24_ >> 27 & 0xf;
			int i_31_ = ((Class28) ((Class49_Sub6) this).aClass28_7073).anInt333;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_31_, "time"), (float) (i_25_ * ((Class_ra_Sub1) (((Class49_Sub6) this).aClass_ra_Sub1_478)).anInt8304 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_31_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_31_, "breakWaterDepth"), (float) i_26_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_31_, "breakWaterOffset"), f_27_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_31_, "waveIntensity"), f_29_, f_28_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_31_, "waveExponent"), (float) i_30_);
		}
	}

	void method618(int i, int i_32_) {
		if (((Class49_Sub6) this).aBoolean7071) {
			int i_33_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_34_ = i_32_ & 0xffff;
			float f_35_ = (float) (i_32_ >> 16 & 0x3) / 8.0F;
			float f_36_ = (float) (i_32_ >> 19 & 0xf) / 16.0F;
			float f_37_ = (float) (i_32_ >> 23 & 0xf) / 16.0F;
			int i_38_ = i_32_ >> 27 & 0xf;
			int i_39_ = ((Class28) ((Class49_Sub6) this).aClass28_7073).anInt333;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_39_, "time"), (float) (i_33_ * ((Class_ra_Sub1) (((Class49_Sub6) this).aClass_ra_Sub1_478)).anInt8304 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_39_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_39_, "breakWaterDepth"), (float) i_34_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_39_, "breakWaterOffset"), f_35_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_39_, "waveIntensity"), f_37_, f_36_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_39_, "waveExponent"), (float) i_38_);
		}
	}

	Class49_Sub6(Class_ra_Sub1 class_ra_sub1, Class47 class47) {
		super(class_ra_sub1);
		((Class49_Sub6) this).aClass47_7072 = class47;
		if ((((Class47) ((Class49_Sub6) this).aClass47_7072).aClass36_Sub2_459 != null) && (((Class_ra_Sub1) ((Class49_Sub6) this).aClass_ra_Sub1_478).aBoolean8426) && (((Class_ra_Sub1) ((Class49_Sub6) this).aClass_ra_Sub1_478).aBoolean8355)) {
			Class35 class35 = (Class35.method506(((Class49_Sub6) this).aClass_ra_Sub1_478, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
			Class35 class35_40_ = (Class35.method506(((Class49_Sub6) this).aClass_ra_Sub1_478, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
			((Class49_Sub6) this).aClass28_7073 = Class28.method496(((Class49_Sub6) this).aClass_ra_Sub1_478, new Class35[] { class35, class35_40_ });
			((Class49_Sub6) this).aBoolean7075 = ((Class49_Sub6) this).aClass28_7073 != null;
		}
	}

	void method607(boolean bool) {
		/* empty */
	}

	void method621(int i, int i_41_) {
		if (((Class49_Sub6) this).aBoolean7071) {
			int i_42_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_43_ = i_41_ & 0xffff;
			float f_44_ = (float) (i_41_ >> 16 & 0x3) / 8.0F;
			float f_45_ = (float) (i_41_ >> 19 & 0xf) / 16.0F;
			float f_46_ = (float) (i_41_ >> 23 & 0xf) / 16.0F;
			int i_47_ = i_41_ >> 27 & 0xf;
			int i_48_ = ((Class28) ((Class49_Sub6) this).aClass28_7073).anInt333;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_48_, "time"), (float) (i_42_ * ((Class_ra_Sub1) (((Class49_Sub6) this).aClass_ra_Sub1_478)).anInt8304 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_48_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_48_, "breakWaterDepth"), (float) i_43_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_48_, "breakWaterOffset"), f_44_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_48_, "waveIntensity"), f_46_, f_45_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_48_, "waveExponent"), (float) i_47_);
		}
	}
}
