/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class59 {
	static String aString551 = "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";
	Class_ra_Sub1 aClass_ra_Sub1_552;
	Class28 aClass28_553;

	Class59(Class_ra_Sub1 class_ra_sub1) {
		((Class59) this).aClass_ra_Sub1_552 = class_ra_sub1;
	}

	boolean method669(Class36_Sub2 class36_sub2, Class36_Sub2 class36_sub2_0_, float f) {
		if (!method670())
			return false;
		Class76_Sub2_Sub2 class76_sub2_sub2 = (((Class_ra_Sub1) ((Class59) this).aClass_ra_Sub1_552).aClass76_Sub2_Sub2_8434);
		Class330_Sub36_Sub17 class330_sub36_sub17 = new Class330_Sub36_Sub17(((Class59) this).aClass_ra_Sub1_552, Class72.aClass72_620, Class86.aClass86_714, ((Class36_Sub2) class36_sub2).anInt7022, (((Class36_Sub2) class36_sub2).anInt7021));
		boolean bool = false;
		((Class59) this).aClass_ra_Sub1_552.method4785(class76_sub2_sub2, (byte) 1);
		class76_sub2_sub2.method901(0, class330_sub36_sub17);
		if (class76_sub2_sub2.method902()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, ((Class36_Sub2) class36_sub2).anInt7022, ((Class36_Sub2) class36_sub2).anInt7021);
			OpenGL.glUseProgram(((Class28) ((Class59) this).aClass28_553).anInt333);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation((((Class28) (((Class59) this).aClass28_553)).anInt333), "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation((((Class28) (((Class59) this).aClass28_553)).anInt333), "rcpRelief"), 1.0F / f);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation((((Class28) ((Class59) this).aClass28_553).anInt333), "sampleSize"), 1.0F / (float) ((Class36_Sub2) class36_sub2_0_).anInt7022, 1.0F / (float) ((Class36_Sub2) class36_sub2_0_).anInt7021);
			for (int i = 0; i < ((Class36_Sub2) class36_sub2).anInt7023; i++) {
				float f_1_ = ((float) i / (float) ((Class36_Sub2) class36_sub2).anInt7023);
				((Class59) this).aClass_ra_Sub1_552.method4844(class36_sub2_0_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, f_1_);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, f_1_);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, f_1_);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, f_1_);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				class36_sub2.method531(0, 0, i, ((Class36_Sub2) class36_sub2).anInt7022, ((Class36_Sub2) class36_sub2).anInt7021, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			bool = true;
		}
		class76_sub2_sub2.method901(0, null);
		((Class59) this).aClass_ra_Sub1_552.method4802(class76_sub2_sub2, (byte) 0);
		return bool;
	}

	boolean method670() {
		if (((Class_ra_Sub1) ((Class59) this).aClass_ra_Sub1_552).aBoolean8429 && (((Class_ra_Sub1) ((Class59) this).aClass_ra_Sub1_552).aBoolean8355) && ((Class59) this).aClass28_553 == null) {
			Class35 class35 = (Class35.method506(((Class59) this).aClass_ra_Sub1_552, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class35 != null)
				((Class59) this).aClass28_553 = Class28.method496(((Class59) this).aClass_ra_Sub1_552, new Class35[] { class35 });
		}
		return ((Class59) this).aClass28_553 != null;
	}
}
