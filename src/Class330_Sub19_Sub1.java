/* Class330_Sub19_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class330_Sub19_Sub1 extends Class330_Sub19 {
	static float aFloat9549;
	static float aFloat9550 = 0.25F;
	static String aString9551 = "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";
	Class76_Sub2_Sub2 aClass76_Sub2_Sub2_9552;
	static String aString9553 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
	Class76_Sub2_Sub2 aClass76_Sub2_Sub2_9554;
	int anInt9555;
	static String aString9556 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n";
	static String aString9557 = "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
	static float aFloat9558 = 1.0F;
	Class36_Sub1 aClass36_Sub1_9559;
	Class36_Sub1 aClass36_Sub1_9560;
	Class36_Sub1[] aClass36_Sub1Array9561;
	static int anInt9562 = 256;
	int anInt9563;
	int anInt9564;
	int anInt9565;
	Class28 aClass28_9566;
	Class28 aClass28_9567;
	Class28 aClass28_9568;
	Class28 aClass28_9569;

	Class330_Sub19_Sub1(Class_ra_Sub1 class_ra_sub1) {
		super(class_ra_sub1);
	}

	void method3351(int i) {
		OpenGL.glUseProgram(0);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4843(1);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(null);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4843(0);
	}

	boolean method3345() {
		return ((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552 != null;
	}

	Class86 method3354() {
		return Class86.aClass86_716;
	}

	void method3349(int i, int i_0_) {
		((Class330_Sub19_Sub1) this).anInt9564 = i;
		((Class330_Sub19_Sub1) this).anInt9563 = i_0_;
		int i_1_ = Class385.method4425(((Class330_Sub19_Sub1) this).anInt9564, (short) 1619);
		int i_2_ = Class385.method4425(((Class330_Sub19_Sub1) this).anInt9563, (short) 25598);
		if (((Class330_Sub19_Sub1) this).anInt9555 != i_1_ || ((Class330_Sub19_Sub1) this).anInt9565 != i_2_) {
			if (((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561 != null) {
				for (int i_3_ = 0; i_3_ < (((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561).length; i_3_++)
					((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561[i_3_].method509();
				((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561 = null;
			}
			if (i_1_ > 256 || i_2_ > 256) {
				int i_4_ = i_1_;
				int i_5_ = i_2_;
				int i_6_ = 0;
				while (i_4_ > 256 || i_5_ > 256) {
					if (i_4_ > 256)
						i_4_ >>= 1;
					if (i_5_ > 256)
						i_5_ >>= 1;
					i_6_++;
				}
				if (((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9554 == null)
					((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9554 = new Class76_Sub2_Sub2(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647);
				((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561 = new Class36_Sub1[i_6_];
				i_4_ = i_1_;
				i_5_ = i_2_;
				i_6_ = 0;
				while (i_4_ > 256 || i_5_ > 256) {
					((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561[i_6_++] = new Class36_Sub1((((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647), 3553, Class72.aClass72_620, Class86.aClass86_716, i_4_, i_5_);
					if (i_4_ > 256)
						i_4_ >>= 1;
					if (i_5_ > 256)
						i_5_ >>= 1;
				}
			} else
				((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9554 = null;
			((Class330_Sub19_Sub1) this).anInt9555 = i_1_;
			((Class330_Sub19_Sub1) this).anInt9565 = i_2_;
		}
	}

	boolean method3369() {
		return (((Class_ra_Sub1) ((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647).aBoolean8429 && ((Class_ra_Sub1) (((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647)).aBoolean8355 && ((Class_ra_Sub1) (((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647)).aBoolean8389);
	}

	Class86 method3370() {
		return Class86.aClass86_716;
	}

	void method3363() {
		((Class330_Sub19_Sub1) this).anInt9565 = -1;
		((Class330_Sub19_Sub1) this).anInt9555 = -1;
		((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9554 = null;
		((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561 = null;
		((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552 = null;
		((Class330_Sub19_Sub1) this).aClass36_Sub1_9559 = null;
		((Class330_Sub19_Sub1) this).aClass36_Sub1_9560 = null;
		((Class330_Sub19_Sub1) this).aClass28_9569 = null;
		((Class330_Sub19_Sub1) this).aClass28_9568 = null;
		((Class330_Sub19_Sub1) this).aClass28_9567 = null;
		((Class330_Sub19_Sub1) this).aClass28_9566 = null;
	}

	void method3352(int i, Class36_Sub1 class36_sub1, Class36_Sub1 class36_sub1_7_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561 != null) {
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4785(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9554, (byte) 1);
			int i_8_ = Class385.method4425(((Class330_Sub19_Sub1) this).anInt9564, (short) 4170);
			int i_9_ = Class385.method4425(((Class330_Sub19_Sub1) this).anInt9563, (short) 30339);
			int i_10_ = 0;
			while (i_8_ > 256 || i_9_ > 256) {
				OpenGL.glViewport(0, 0, i_8_, i_9_);
				((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9554.method901(0, ((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561[i_10_].method523(0));
				if (i_10_ == 0) {
					((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(class36_sub1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (((Class330_Sub19_Sub1) this).anInt9564), 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (((Class330_Sub19_Sub1) this).anInt9564), (float) (((Class330_Sub19_Sub1) this).anInt9563));
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) (((Class330_Sub19_Sub1) this).anInt9563));
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561[i_10_ - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (i_8_ > 256)
					i_8_ >>= 1;
				if (i_9_ > 256)
					i_9_ >>= 1;
				i_10_++;
			}
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4802(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9554, (byte) 0);
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561[i_10_ - 1]);
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4785(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552, (byte) 1);
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method918(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_11_ = (((Class28) ((Class330_Sub19_Sub1) this).aClass28_9568).anInt333);
			OpenGL.glUseProgram(i_11_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_11_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_11_, "params"), aFloat9549, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(class36_sub1);
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4785(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552, (byte) 1);
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method918(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_12_ = (((Class28) ((Class330_Sub19_Sub1) this).aClass28_9569).anInt333);
			OpenGL.glUseProgram(i_12_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_12_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_12_, "params"), aFloat9549, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) ((Class330_Sub19_Sub1) this).anInt9564, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) ((Class330_Sub19_Sub1) this).anInt9564, (float) (((Class330_Sub19_Sub1) this).anInt9563));
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) (((Class330_Sub19_Sub1) this).anInt9563));
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method918(1);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(((Class330_Sub19_Sub1) this).aClass36_Sub1_9559);
		int i_13_ = ((Class28) ((Class330_Sub19_Sub1) this).aClass28_9566).anInt333;
		OpenGL.glUseProgram(i_13_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_13_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_13_, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method918(0);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(((Class330_Sub19_Sub1) this).aClass36_Sub1_9560);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_13_, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4802(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552, (byte) 0);
		int i_14_ = ((Class28) ((Class330_Sub19_Sub1) this).aClass28_9567).anInt333;
		OpenGL.glUseProgram(i_14_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_14_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_14_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_14_, "params"), aFloat9550, aFloat9558, 0.0F);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4843(1);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(((Class330_Sub19_Sub1) this).aClass36_Sub1_9559);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4843(0);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(class36_sub1);
	}

	boolean method3360() {
		if ((((Class_ra_Sub1) ((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647).aBoolean8429) && ((Class_ra_Sub1) ((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647).aBoolean8355 && ((Class_ra_Sub1) (((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647)).aBoolean8389) {
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552 = new Class76_Sub2_Sub2(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647);
			((Class330_Sub19_Sub1) this).aClass36_Sub1_9559 = new Class36_Sub1((((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647), 3553, Class72.aClass72_620, Class86.aClass86_716, 256, 256);
			((Class330_Sub19_Sub1) this).aClass36_Sub1_9559.method518(false, false);
			((Class330_Sub19_Sub1) this).aClass36_Sub1_9560 = new Class36_Sub1((((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647), 3553, Class72.aClass72_620, Class86.aClass86_716, 256, 256);
			((Class330_Sub19_Sub1) this).aClass36_Sub1_9560.method518(false, false);
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4785(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552, (byte) 1);
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method901(0, ((Class330_Sub19_Sub1) this).aClass36_Sub1_9559.method523(0));
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method901(1, ((Class330_Sub19_Sub1) this).aClass36_Sub1_9560.method523(0));
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method918(0);
			if (!((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method902()) {
				((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4802(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552, (byte) 0);
				return false;
			}
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4802(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552, (byte) 0);
			((Class330_Sub19_Sub1) this).aClass28_9569 = (Class28.method496(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, (new Class35[] { Class35.method506(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class330_Sub19_Sub1) this).aClass28_9568 = (Class28.method496(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, (new Class35[] { Class35.method506(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class330_Sub19_Sub1) this).aClass28_9567 = (Class28.method496(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, (new Class35[] { Class35.method506(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") })));
			((Class330_Sub19_Sub1) this).aClass28_9566 = (Class28.method496(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, (new Class35[] { Class35.method506(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (((Class330_Sub19_Sub1) this).aClass28_9568 != null && ((Class330_Sub19_Sub1) this).aClass28_9569 != null && ((Class330_Sub19_Sub1) this).aClass28_9567 != null && ((Class330_Sub19_Sub1) this).aClass28_9566 != null);
		}
		return false;
	}

	boolean method3361() {
		return ((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552 != null;
	}

	boolean method3348() {
		return ((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552 != null;
	}

	boolean method3350() {
		return ((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552 != null;
	}

	boolean method3358() {
		if ((((Class_ra_Sub1) ((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647).aBoolean8429) && ((Class_ra_Sub1) ((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647).aBoolean8355 && ((Class_ra_Sub1) (((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647)).aBoolean8389) {
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552 = new Class76_Sub2_Sub2(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647);
			((Class330_Sub19_Sub1) this).aClass36_Sub1_9559 = new Class36_Sub1((((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647), 3553, Class72.aClass72_620, Class86.aClass86_716, 256, 256);
			((Class330_Sub19_Sub1) this).aClass36_Sub1_9559.method518(false, false);
			((Class330_Sub19_Sub1) this).aClass36_Sub1_9560 = new Class36_Sub1((((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647), 3553, Class72.aClass72_620, Class86.aClass86_716, 256, 256);
			((Class330_Sub19_Sub1) this).aClass36_Sub1_9560.method518(false, false);
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4785(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552, (byte) 1);
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method901(0, ((Class330_Sub19_Sub1) this).aClass36_Sub1_9559.method523(0));
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method901(1, ((Class330_Sub19_Sub1) this).aClass36_Sub1_9560.method523(0));
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method918(0);
			if (!((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method902()) {
				((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4802(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552, (byte) 0);
				return false;
			}
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4802(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552, (byte) 0);
			((Class330_Sub19_Sub1) this).aClass28_9569 = (Class28.method496(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, (new Class35[] { Class35.method506(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class330_Sub19_Sub1) this).aClass28_9568 = (Class28.method496(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, (new Class35[] { Class35.method506(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class330_Sub19_Sub1) this).aClass28_9567 = (Class28.method496(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, (new Class35[] { Class35.method506(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") })));
			((Class330_Sub19_Sub1) this).aClass28_9566 = (Class28.method496(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, (new Class35[] { Class35.method506(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (((Class330_Sub19_Sub1) this).aClass28_9568 != null && ((Class330_Sub19_Sub1) this).aClass28_9569 != null && ((Class330_Sub19_Sub1) this).aClass28_9567 != null && ((Class330_Sub19_Sub1) this).aClass28_9566 != null);
		}
		return false;
	}

	boolean method3359() {
		if ((((Class_ra_Sub1) ((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647).aBoolean8429) && ((Class_ra_Sub1) ((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647).aBoolean8355 && ((Class_ra_Sub1) (((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647)).aBoolean8389) {
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552 = new Class76_Sub2_Sub2(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647);
			((Class330_Sub19_Sub1) this).aClass36_Sub1_9559 = new Class36_Sub1((((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647), 3553, Class72.aClass72_620, Class86.aClass86_716, 256, 256);
			((Class330_Sub19_Sub1) this).aClass36_Sub1_9559.method518(false, false);
			((Class330_Sub19_Sub1) this).aClass36_Sub1_9560 = new Class36_Sub1((((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647), 3553, Class72.aClass72_620, Class86.aClass86_716, 256, 256);
			((Class330_Sub19_Sub1) this).aClass36_Sub1_9560.method518(false, false);
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4785(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552, (byte) 1);
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method901(0, ((Class330_Sub19_Sub1) this).aClass36_Sub1_9559.method523(0));
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method901(1, ((Class330_Sub19_Sub1) this).aClass36_Sub1_9560.method523(0));
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method918(0);
			if (!((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method902()) {
				((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4802(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552, (byte) 0);
				return false;
			}
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4802(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552, (byte) 0);
			((Class330_Sub19_Sub1) this).aClass28_9569 = (Class28.method496(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, (new Class35[] { Class35.method506(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class330_Sub19_Sub1) this).aClass28_9568 = (Class28.method496(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, (new Class35[] { Class35.method506(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class330_Sub19_Sub1) this).aClass28_9567 = (Class28.method496(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, (new Class35[] { Class35.method506(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") })));
			((Class330_Sub19_Sub1) this).aClass28_9566 = (Class28.method496(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, (new Class35[] { Class35.method506(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (((Class330_Sub19_Sub1) this).aClass28_9568 != null && ((Class330_Sub19_Sub1) this).aClass28_9569 != null && ((Class330_Sub19_Sub1) this).aClass28_9567 != null && ((Class330_Sub19_Sub1) this).aClass28_9566 != null);
		}
		return false;
	}

	void method3367(int i, int i_15_) {
		((Class330_Sub19_Sub1) this).anInt9564 = i;
		((Class330_Sub19_Sub1) this).anInt9563 = i_15_;
		int i_16_ = Class385.method4425(((Class330_Sub19_Sub1) this).anInt9564, (short) 29603);
		int i_17_ = Class385.method4425(((Class330_Sub19_Sub1) this).anInt9563, (short) 19473);
		if (((Class330_Sub19_Sub1) this).anInt9555 != i_16_ || ((Class330_Sub19_Sub1) this).anInt9565 != i_17_) {
			if (((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561 != null) {
				for (int i_18_ = 0; i_18_ < (((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561).length; i_18_++)
					((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561[i_18_].method509();
				((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561 = null;
			}
			if (i_16_ > 256 || i_17_ > 256) {
				int i_19_ = i_16_;
				int i_20_ = i_17_;
				int i_21_ = 0;
				while (i_19_ > 256 || i_20_ > 256) {
					if (i_19_ > 256)
						i_19_ >>= 1;
					if (i_20_ > 256)
						i_20_ >>= 1;
					i_21_++;
				}
				if (((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9554 == null)
					((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9554 = new Class76_Sub2_Sub2(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647);
				((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561 = new Class36_Sub1[i_21_];
				i_19_ = i_16_;
				i_20_ = i_17_;
				i_21_ = 0;
				while (i_19_ > 256 || i_20_ > 256) {
					((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561[i_21_++] = new Class36_Sub1((((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647), 3553, Class72.aClass72_620, Class86.aClass86_716, i_19_, i_20_);
					if (i_19_ > 256)
						i_19_ >>= 1;
					if (i_20_ > 256)
						i_20_ >>= 1;
				}
			} else
				((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9554 = null;
			((Class330_Sub19_Sub1) this).anInt9555 = i_16_;
			((Class330_Sub19_Sub1) this).anInt9565 = i_17_;
		}
	}

	void method3357() {
		((Class330_Sub19_Sub1) this).anInt9565 = -1;
		((Class330_Sub19_Sub1) this).anInt9555 = -1;
		((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9554 = null;
		((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561 = null;
		((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552 = null;
		((Class330_Sub19_Sub1) this).aClass36_Sub1_9559 = null;
		((Class330_Sub19_Sub1) this).aClass36_Sub1_9560 = null;
		((Class330_Sub19_Sub1) this).aClass28_9569 = null;
		((Class330_Sub19_Sub1) this).aClass28_9568 = null;
		((Class330_Sub19_Sub1) this).aClass28_9567 = null;
		((Class330_Sub19_Sub1) this).aClass28_9566 = null;
	}

	void method3362() {
		((Class330_Sub19_Sub1) this).anInt9565 = -1;
		((Class330_Sub19_Sub1) this).anInt9555 = -1;
		((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9554 = null;
		((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561 = null;
		((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552 = null;
		((Class330_Sub19_Sub1) this).aClass36_Sub1_9559 = null;
		((Class330_Sub19_Sub1) this).aClass36_Sub1_9560 = null;
		((Class330_Sub19_Sub1) this).aClass28_9569 = null;
		((Class330_Sub19_Sub1) this).aClass28_9568 = null;
		((Class330_Sub19_Sub1) this).aClass28_9567 = null;
		((Class330_Sub19_Sub1) this).aClass28_9566 = null;
	}

	static {
		aFloat9549 = 1.0F;
	}

	void method3364(int i, int i_22_) {
		((Class330_Sub19_Sub1) this).anInt9564 = i;
		((Class330_Sub19_Sub1) this).anInt9563 = i_22_;
		int i_23_ = Class385.method4425(((Class330_Sub19_Sub1) this).anInt9564, (short) 16953);
		int i_24_ = Class385.method4425(((Class330_Sub19_Sub1) this).anInt9563, (short) 15445);
		if (((Class330_Sub19_Sub1) this).anInt9555 != i_23_ || ((Class330_Sub19_Sub1) this).anInt9565 != i_24_) {
			if (((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561 != null) {
				for (int i_25_ = 0; i_25_ < (((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561).length; i_25_++)
					((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561[i_25_].method509();
				((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561 = null;
			}
			if (i_23_ > 256 || i_24_ > 256) {
				int i_26_ = i_23_;
				int i_27_ = i_24_;
				int i_28_ = 0;
				while (i_26_ > 256 || i_27_ > 256) {
					if (i_26_ > 256)
						i_26_ >>= 1;
					if (i_27_ > 256)
						i_27_ >>= 1;
					i_28_++;
				}
				if (((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9554 == null)
					((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9554 = new Class76_Sub2_Sub2(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647);
				((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561 = new Class36_Sub1[i_28_];
				i_26_ = i_23_;
				i_27_ = i_24_;
				i_28_ = 0;
				while (i_26_ > 256 || i_27_ > 256) {
					((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561[i_28_++] = new Class36_Sub1((((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647), 3553, Class72.aClass72_620, Class86.aClass86_716, i_26_, i_27_);
					if (i_26_ > 256)
						i_26_ >>= 1;
					if (i_27_ > 256)
						i_27_ >>= 1;
				}
			} else
				((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9554 = null;
			((Class330_Sub19_Sub1) this).anInt9555 = i_23_;
			((Class330_Sub19_Sub1) this).anInt9565 = i_24_;
		}
	}

	void method3365(int i, Class36_Sub1 class36_sub1, Class36_Sub1 class36_sub1_29_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561 != null) {
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4785(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9554, (byte) 1);
			int i_30_ = Class385.method4425(((Class330_Sub19_Sub1) this).anInt9564, (short) 7546);
			int i_31_ = Class385.method4425(((Class330_Sub19_Sub1) this).anInt9563, (short) 3084);
			int i_32_ = 0;
			while (i_30_ > 256 || i_31_ > 256) {
				OpenGL.glViewport(0, 0, i_30_, i_31_);
				((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9554.method901(0, ((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561[i_32_].method523(0));
				if (i_32_ == 0) {
					((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(class36_sub1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (((Class330_Sub19_Sub1) this).anInt9564), 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (((Class330_Sub19_Sub1) this).anInt9564), (float) (((Class330_Sub19_Sub1) this).anInt9563));
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) (((Class330_Sub19_Sub1) this).anInt9563));
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561[i_32_ - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (i_30_ > 256)
					i_30_ >>= 1;
				if (i_31_ > 256)
					i_31_ >>= 1;
				i_32_++;
			}
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4802(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9554, (byte) 0);
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(((Class330_Sub19_Sub1) this).aClass36_Sub1Array9561[i_32_ - 1]);
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4785(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552, (byte) 1);
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method918(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_33_ = (((Class28) ((Class330_Sub19_Sub1) this).aClass28_9568).anInt333);
			OpenGL.glUseProgram(i_33_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_33_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_33_, "params"), aFloat9549, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(class36_sub1);
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4785(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552, (byte) 1);
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method918(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_34_ = (((Class28) ((Class330_Sub19_Sub1) this).aClass28_9569).anInt333);
			OpenGL.glUseProgram(i_34_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_34_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_34_, "params"), aFloat9549, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) ((Class330_Sub19_Sub1) this).anInt9564, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) ((Class330_Sub19_Sub1) this).anInt9564, (float) (((Class330_Sub19_Sub1) this).anInt9563));
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) (((Class330_Sub19_Sub1) this).anInt9563));
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method918(1);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(((Class330_Sub19_Sub1) this).aClass36_Sub1_9559);
		int i_35_ = ((Class28) ((Class330_Sub19_Sub1) this).aClass28_9566).anInt333;
		OpenGL.glUseProgram(i_35_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_35_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_35_, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method918(0);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(((Class330_Sub19_Sub1) this).aClass36_Sub1_9560);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_35_, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4802(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552, (byte) 0);
		int i_36_ = ((Class28) ((Class330_Sub19_Sub1) this).aClass28_9567).anInt333;
		OpenGL.glUseProgram(i_36_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_36_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_36_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_36_, "params"), aFloat9550, aFloat9558, 0.0F);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4843(1);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(((Class330_Sub19_Sub1) this).aClass36_Sub1_9559);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4843(0);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(class36_sub1);
	}

	Class86 method3371() {
		return Class86.aClass86_716;
	}

	void method3368(int i) {
		OpenGL.glUseProgram(0);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4843(1);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(null);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4843(0);
	}

	Class86 method3372() {
		return Class86.aClass86_716;
	}

	boolean method3347() {
		if ((((Class_ra_Sub1) ((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647).aBoolean8429) && ((Class_ra_Sub1) ((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647).aBoolean8355 && ((Class_ra_Sub1) (((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647)).aBoolean8389) {
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552 = new Class76_Sub2_Sub2(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647);
			((Class330_Sub19_Sub1) this).aClass36_Sub1_9559 = new Class36_Sub1((((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647), 3553, Class72.aClass72_620, Class86.aClass86_716, 256, 256);
			((Class330_Sub19_Sub1) this).aClass36_Sub1_9559.method518(false, false);
			((Class330_Sub19_Sub1) this).aClass36_Sub1_9560 = new Class36_Sub1((((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647), 3553, Class72.aClass72_620, Class86.aClass86_716, 256, 256);
			((Class330_Sub19_Sub1) this).aClass36_Sub1_9560.method518(false, false);
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4785(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552, (byte) 1);
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method901(0, ((Class330_Sub19_Sub1) this).aClass36_Sub1_9559.method523(0));
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method901(1, ((Class330_Sub19_Sub1) this).aClass36_Sub1_9560.method523(0));
			((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method918(0);
			if (!((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552.method902()) {
				((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4802(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552, (byte) 0);
				return false;
			}
			((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4802(((Class330_Sub19_Sub1) this).aClass76_Sub2_Sub2_9552, (byte) 0);
			((Class330_Sub19_Sub1) this).aClass28_9569 = (Class28.method496(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, (new Class35[] { Class35.method506(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class330_Sub19_Sub1) this).aClass28_9568 = (Class28.method496(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, (new Class35[] { Class35.method506(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class330_Sub19_Sub1) this).aClass28_9567 = (Class28.method496(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, (new Class35[] { Class35.method506(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") })));
			((Class330_Sub19_Sub1) this).aClass28_9566 = (Class28.method496(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, (new Class35[] { Class35.method506(((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (((Class330_Sub19_Sub1) this).aClass28_9568 != null && ((Class330_Sub19_Sub1) this).aClass28_9569 != null && ((Class330_Sub19_Sub1) this).aClass28_9567 != null && ((Class330_Sub19_Sub1) this).aClass28_9566 != null);
		}
		return false;
	}

	void method3346(int i) {
		OpenGL.glUseProgram(0);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4843(1);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(null);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4843(0);
	}

	void method3366(int i) {
		OpenGL.glUseProgram(0);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4843(1);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4844(null);
		((Class330_Sub19_Sub1) this).aClass_ra_Sub1_7647.method4843(0);
	}
}
