/* Class123_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class123_Sub2 extends Class123 {
	static int[] anIntArray8889;
	static int anInt8890 = 35632;
	static int anInt8891 = 13;
	Class_ra_Sub2_Sub1 aClass_ra_Sub2_Sub1_8892;
	Class105_Sub2 aClass105_Sub2_8893;
	int[] anIntArray8894;
	boolean aBoolean8895;
	int anInt8896;
	int[] anIntArray8897;
	static int anInt8898 = 35633;
	float[] aFloatArray8899;
	static float[] aFloatArray8900;
	static boolean aBoolean8901;
	float[] aFloatArray8902;
	float[] aFloatArray8903;
	float[] aFloatArray8904;
	String aString8905;
	int anInt8906 = 0;
	String aString8907;
	int anInt8908 = 0;

	void method1490(int i, Class249 class249) {
		OpenGL.glUniform3fv(i, 3, class249.method2503(aFloatArray8900), 0);
	}

	Class123_Sub2(Class_ra_Sub2_Sub1 class_ra_sub2_sub1, Class118 class118) {
		((Class123_Sub2) this).anInt8896 = 0;
		((Class123_Sub2) this).aBoolean8895 = false;
		((Class123_Sub2) this).anIntArray8897 = new int[13];
		aString6481 = class118.aString1391;
		StringBuilder stringbuilder = new StringBuilder();
		if (class118.aString1388 != null) {
			aString6480 = class118.aString1388;
			if (class118.aClass100Array1392 != null) {
				Class100[] class100s = class118.aClass100Array1392;
				for (int i = 0; i < class100s.length; i++) {
					Class100 class100 = class100s[i];
					stringbuilder.append(new StringBuilder().append("#define ").append(class100.aString919).append(" ").append(class100.aString920).append('\n').toString());
				}
			}
			stringbuilder.append(new String(class_ra_sub2_sub1.method5148(aString6480)));
			((Class123_Sub2) this).aString8905 = stringbuilder.toString();
		}
		if (class118.aString1390 != null) {
			aString6482 = class118.aString1390;
			stringbuilder.setLength(0);
			if (class118.aClass100Array1389 != null) {
				Class100[] class100s = class118.aClass100Array1389;
				for (int i = 0; i < class100s.length; i++) {
					Class100 class100 = class100s[i];
					stringbuilder.append(new StringBuilder().append("#define ").append(class100.aString919).append(" ").append(class100.aString920).append('\n').toString());
				}
			}
			stringbuilder.append(new String(class_ra_sub2_sub1.method5148(aString6482)));
			((Class123_Sub2) this).aString8907 = stringbuilder.toString();
		}
		Class453.method5643(((Class123_Sub2) this).anIntArray8897, 0, ((Class123_Sub2) this).anIntArray8897.length, -1);
	}

	static {
		aBoolean8901 = !Class123_Sub2.class.desiredAssertionStatus();
		anIntArray8889 = new int[2];
		aFloatArray8900 = new float[16];
	}

	public boolean method1454() {
		if (((Class123_Sub2) this).aBoolean8895)
			return true;
		((Class_ra_Sub2_Sub1) ((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892).aClass123_Sub2_9875 = null;
		((Class123_Sub2) this).anInt8908 = method1518(35633, ((Class123_Sub2) this).aString8905, aString6480);
		((Class123_Sub2) this).anInt8896 = method1518(35632, ((Class123_Sub2) this).aString8907, aString6482);
		if (((Class123_Sub2) this).anInt8908 == 0 || ((Class123_Sub2) this).anInt8896 == 0) {
			if (((Class123_Sub2) this).anInt8908 != 0)
				OpenGL.glDeleteShader(((Class123_Sub2) this).anInt8908);
			if (((Class123_Sub2) this).anInt8896 != 0)
				OpenGL.glDeleteShader(((Class123_Sub2) this).anInt8896);
			return false;
		}
		((Class123_Sub2) this).anInt8906 = OpenGL.glCreateProgram();
		if (((Class123_Sub2) this).anInt8908 != 0)
			OpenGL.glAttachShader(((Class123_Sub2) this).anInt8906, ((Class123_Sub2) this).anInt8908);
		if (((Class123_Sub2) this).anInt8896 != 0)
			OpenGL.glAttachShader(((Class123_Sub2) this).anInt8906, ((Class123_Sub2) this).anInt8896);
		OpenGL.glLinkProgram(((Class123_Sub2) this).anInt8906);
		OpenGL.glGetProgramiv(((Class123_Sub2) this).anInt8906, 35714, anIntArray8889, 0);
		if (anIntArray8889[0] == 0) {
			if (((Class123_Sub2) this).anInt8908 != 0) {
				OpenGL.glDetachShader(((Class123_Sub2) this).anInt8906, ((Class123_Sub2) this).anInt8908);
				OpenGL.glDeleteShader(((Class123_Sub2) this).anInt8908);
			}
			if (((Class123_Sub2) this).anInt8896 != 0) {
				OpenGL.glDetachShader(((Class123_Sub2) this).anInt8906, ((Class123_Sub2) this).anInt8896);
				OpenGL.glDeleteShader(((Class123_Sub2) this).anInt8896);
			}
			OpenGL.glDeleteProgram(((Class123_Sub2) this).anInt8906);
			return false;
		}
		OpenGL.glUseProgram(((Class123_Sub2) this).anInt8906);
		int i = -1;
		for (int i_0_ = 0; i_0_ < ((Class123_Sub2) this).aClass105_Sub2_8893.method1255((byte) -26); i_0_++) {
			if (((Class123_Sub2) this).aClass105_Sub2_8893.method1256(i_0_, -1260254540) == this) {
				i = i_0_;
				break;
			}
		}
		if (i == -1)
			return false;
		int i_1_ = 0;
		int i_2_ = 0;
		for (int i_3_ = 0; i_3_ < ((Class123_Sub2) this).aClass105_Sub2_8893.method1282((byte) 4); i_3_++) {
			Class330_Sub15_Sub1 class330_sub15_sub1 = ((Class123_Sub2) this).aClass105_Sub2_8893.method1298(i_3_, -929781559);
			if (class330_sub15_sub1 != null) {
				class330_sub15_sub1.method3329(i);
				Class109 class109 = class330_sub15_sub1.method3323(1632830751);
				int i_4_ = (((Class330_Sub15_Sub1_Sub1) (Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).anIntArray10129[i]);
				if (class109 == Class109.aClass109_1050 || class109 == Class109.aClass109_1096 || class109 == Class109.aClass109_1149 || class109 == Class109.aClass109_1052 || class109 == Class109.aClass109_1027)
					i_1_ = Math.max(i_4_, i_1_);
				else
					i_2_ = Math.max(i_4_, i_2_);
			}
		}
		for (int i_5_ = 0; i_5_ < ((Class123_Sub2) this).aClass105_Sub2_8893.method1279(-498540798); i_5_++) {
			Class330_Sub15_Sub1 class330_sub15_sub1 = ((Class123_Sub2) this).aClass105_Sub2_8893.method1280(i_5_, -1974573142);
			if (class330_sub15_sub1 != null) {
				class330_sub15_sub1.method3329(i);
				Class109 class109 = class330_sub15_sub1.method3323(1632830751);
				int i_6_ = (((Class330_Sub15_Sub1_Sub1) (Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).anIntArray10129[i]);
				if (class109 == Class109.aClass109_1050 || class109 == Class109.aClass109_1096 || class109 == Class109.aClass109_1149 || class109 == Class109.aClass109_1052 || class109 == Class109.aClass109_1027)
					i_1_ = Math.max(i_6_, i_1_);
				else
					i_2_ = Math.max(i_6_, i_2_);
			}
		}
		((Class123_Sub2) this).aFloatArray8903 = new float[i_1_ + 1];
		((Class123_Sub2) this).aFloatArray8902 = new float[i_1_ + 1];
		((Class123_Sub2) this).aFloatArray8899 = new float[i_1_ + 1];
		((Class123_Sub2) this).aFloatArray8904 = new float[i_1_ + 1];
		((Class123_Sub2) this).anIntArray8894 = new int[i_2_ + 1];
		for (int i_7_ = 0; i_7_ < ((Class123_Sub2) this).anIntArray8894.length; i_7_++)
			((Class123_Sub2) this).anIntArray8894[i_7_] = -1;
		((Class123_Sub2) this).aString8905 = null;
		((Class123_Sub2) this).aString8907 = null;
		((Class123_Sub2) this).aBoolean8895 = true;
		return true;
	}

	void method1456(Class330_Sub15_Sub1 class330_sub15_sub1, float f, float f_8_) {
		int i = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i != -1) {
			if (((Class123_Sub2) this).aFloatArray8903[i] != f || ((Class123_Sub2) this).aFloatArray8902[i] != f_8_) {
				((Class123_Sub2) this).aFloatArray8903[i] = f;
				((Class123_Sub2) this).aFloatArray8902[i] = f_8_;
				if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1149)
					throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
				OpenGL.glUniform2f(i, f, f_8_);
			}
		}
	}

	void method1489(Class330_Sub15_Sub1 class330_sub15_sub1, Class249 class249) {
		if (!aBoolean8901 && (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1069))
			throw new AssertionError();
		int i = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class249.method2514(aFloatArray8900), 0);
	}

	void method1471(Class330_Sub15_Sub1 class330_sub15_sub1, float f) {
		int i = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i != -1) {
			if (((Class123_Sub2) this).aFloatArray8903[i] != f) {
				((Class123_Sub2) this).aFloatArray8903[i] = f;
				if ((class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1050) && (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1096))
					throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
				OpenGL.glUniform1f(i, f);
			}
		}
	}

	void method1496(int i, Class249 class249) {
		OpenGL.glUniform2fv(i, 4, class249.method2505(aFloatArray8900), 0);
	}

	void method1460(Class330_Sub15_Sub1 class330_sub15_sub1, Class249 class249) {
		if (!aBoolean8901 && (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1116))
			throw new AssertionError();
		int i = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i != -1)
			OpenGL.glUniform2fv(i, 4, class249.method2505(aFloatArray8900), 0);
	}

	void method1461(Class330_Sub15_Sub1 class330_sub15_sub1, Class249 class249) {
		if (!aBoolean8901 && (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1069))
			throw new AssertionError();
		int i = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class249.method2514(aFloatArray8900), 0);
	}

	void method1462(Class330_Sub15_Sub1 class330_sub15_sub1, int i, Interface11 interface11) {
		int i_9_ = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i_9_ != -1) {
			if (interface11 == null)
				interface11 = (((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.anInterface11_Impl3_8551);
			if (i < ((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.anInt8592) {
				((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.method4955(i);
				((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.method4956(interface11);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture((((Class287) (Class287) interface11).anInt6554), (((Class287) (Class287) interface11).anInt6551));
			}
			if (((Class123_Sub2) this).anIntArray8894[i_9_] != i) {
				((Class123_Sub2) this).anIntArray8894[i_9_] = i;
				OpenGL.glUniform1i(i_9_, i);
			}
		}
	}

	void method1463(int i, float f, float f_10_, float f_11_) {
		OpenGL.glUniform3f(i, f, f_10_, f_11_);
	}

	void method1464(int i, float f, float f_12_, float f_13_, float f_14_) {
		OpenGL.glUniform4f(i, f, f_12_, f_13_, f_14_);
	}

	void method1488(int i, float[] fs, int i_15_) {
		OpenGL.glUniform4fv(i, i_15_, fs, 0);
	}

	void method1498(int i, Class249 class249) {
		OpenGL.glUniform3fv(i, 3, class249.method2503(aFloatArray8900), 0);
	}

	void method1480(int i, float f, float f_16_, float f_17_, float f_18_) {
		OpenGL.glUniform4f(i, f, f_16_, f_17_, f_18_);
	}

	void method1467(int i, Class249 class249) {
		OpenGL.glUniform4fv(i, 4, class249.method2514(aFloatArray8900), 0);
	}

	void method1484(Class330_Sub15_Sub1 class330_sub15_sub1, Class249 class249) {
		if (!aBoolean8901 && (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1069))
			throw new AssertionError();
		int i = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class249.method2514(aFloatArray8900), 0);
	}

	public void method53() {
		if (((Class123_Sub2) this).anInt8906 != 0) {
			((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.method5146(((Class123_Sub2) this).anInt8906);
			if (((Class123_Sub2) this).anInt8908 != 0)
				((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.method5145((long) ((Class123_Sub2) this).anInt8908);
			if (((Class123_Sub2) this).anInt8896 != 0)
				((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.method5145((long) ((Class123_Sub2) this).anInt8896);
			((Class123_Sub2) this).anInt8906 = 0;
			((Class123_Sub2) this).anInt8908 = 0;
			((Class123_Sub2) this).anInt8896 = 0;
		}
	}

	void method1494(Class330_Sub15_Sub1 class330_sub15_sub1, float[] fs, int i) {
		int i_19_ = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i_19_ != -1)
			OpenGL.glUniform4fv(i_19_, i, fs, 0);
	}

	public void method52() {
		if (((Class123_Sub2) this).anInt8906 != 0) {
			((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.method5146(((Class123_Sub2) this).anInt8906);
			if (((Class123_Sub2) this).anInt8908 != 0)
				((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.method5145((long) ((Class123_Sub2) this).anInt8908);
			if (((Class123_Sub2) this).anInt8896 != 0)
				((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.method5145((long) ((Class123_Sub2) this).anInt8896);
			((Class123_Sub2) this).anInt8906 = 0;
			((Class123_Sub2) this).anInt8908 = 0;
			((Class123_Sub2) this).anInt8896 = 0;
		}
	}

	void method1475(Class330_Sub15_Sub1 class330_sub15_sub1, float f, float f_20_, float f_21_, float f_22_) {
		int i = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i != -1) {
			if (((Class123_Sub2) this).aFloatArray8903[i] != f || ((Class123_Sub2) this).aFloatArray8902[i] != f_20_ || ((Class123_Sub2) this).aFloatArray8899[i] != f_21_ || ((Class123_Sub2) this).aFloatArray8904[i] != f_22_) {
				((Class123_Sub2) this).aFloatArray8903[i] = f;
				((Class123_Sub2) this).aFloatArray8902[i] = f_20_;
				((Class123_Sub2) this).aFloatArray8899[i] = f_21_;
				((Class123_Sub2) this).aFloatArray8904[i] = f_22_;
				if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1027)
					throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
				OpenGL.glUniform4f(i, f, f_20_, f_21_, f_22_);
			}
		}
	}

	int method1518(int i, String string, String string_23_) {
		if (string == null)
			return 0;
		int i_24_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_24_, string);
		OpenGL.glCompileShader(i_24_);
		OpenGL.glGetShaderiv(i_24_, 35713, anIntArray8889, 0);
		if (anIntArray8889[0] == 0) {
			OpenGL.glDeleteShader(i_24_);
			i_24_ = 0;
		}
		return i_24_;
	}

	public boolean method1469() {
		if (((Class123_Sub2) this).aBoolean8895)
			return true;
		((Class_ra_Sub2_Sub1) ((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892).aClass123_Sub2_9875 = null;
		((Class123_Sub2) this).anInt8908 = method1518(35633, ((Class123_Sub2) this).aString8905, aString6480);
		((Class123_Sub2) this).anInt8896 = method1518(35632, ((Class123_Sub2) this).aString8907, aString6482);
		if (((Class123_Sub2) this).anInt8908 == 0 || ((Class123_Sub2) this).anInt8896 == 0) {
			if (((Class123_Sub2) this).anInt8908 != 0)
				OpenGL.glDeleteShader(((Class123_Sub2) this).anInt8908);
			if (((Class123_Sub2) this).anInt8896 != 0)
				OpenGL.glDeleteShader(((Class123_Sub2) this).anInt8896);
			return false;
		}
		((Class123_Sub2) this).anInt8906 = OpenGL.glCreateProgram();
		if (((Class123_Sub2) this).anInt8908 != 0)
			OpenGL.glAttachShader(((Class123_Sub2) this).anInt8906, ((Class123_Sub2) this).anInt8908);
		if (((Class123_Sub2) this).anInt8896 != 0)
			OpenGL.glAttachShader(((Class123_Sub2) this).anInt8906, ((Class123_Sub2) this).anInt8896);
		OpenGL.glLinkProgram(((Class123_Sub2) this).anInt8906);
		OpenGL.glGetProgramiv(((Class123_Sub2) this).anInt8906, 35714, anIntArray8889, 0);
		if (anIntArray8889[0] == 0) {
			if (((Class123_Sub2) this).anInt8908 != 0) {
				OpenGL.glDetachShader(((Class123_Sub2) this).anInt8906, ((Class123_Sub2) this).anInt8908);
				OpenGL.glDeleteShader(((Class123_Sub2) this).anInt8908);
			}
			if (((Class123_Sub2) this).anInt8896 != 0) {
				OpenGL.glDetachShader(((Class123_Sub2) this).anInt8906, ((Class123_Sub2) this).anInt8896);
				OpenGL.glDeleteShader(((Class123_Sub2) this).anInt8896);
			}
			OpenGL.glDeleteProgram(((Class123_Sub2) this).anInt8906);
			return false;
		}
		OpenGL.glUseProgram(((Class123_Sub2) this).anInt8906);
		int i = -1;
		for (int i_25_ = 0; i_25_ < ((Class123_Sub2) this).aClass105_Sub2_8893.method1255((byte) 22); i_25_++) {
			if (((Class123_Sub2) this).aClass105_Sub2_8893.method1256(i_25_, -508368673) == this) {
				i = i_25_;
				break;
			}
		}
		if (i == -1)
			return false;
		int i_26_ = 0;
		int i_27_ = 0;
		for (int i_28_ = 0; i_28_ < ((Class123_Sub2) this).aClass105_Sub2_8893.method1282((byte) 4); i_28_++) {
			Class330_Sub15_Sub1 class330_sub15_sub1 = ((Class123_Sub2) this).aClass105_Sub2_8893.method1298(i_28_, -929781559);
			if (class330_sub15_sub1 != null) {
				class330_sub15_sub1.method3329(i);
				Class109 class109 = class330_sub15_sub1.method3323(1632830751);
				int i_29_ = (((Class330_Sub15_Sub1_Sub1) (Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).anIntArray10129[i]);
				if (class109 == Class109.aClass109_1050 || class109 == Class109.aClass109_1096 || class109 == Class109.aClass109_1149 || class109 == Class109.aClass109_1052 || class109 == Class109.aClass109_1027)
					i_26_ = Math.max(i_29_, i_26_);
				else
					i_27_ = Math.max(i_29_, i_27_);
			}
		}
		for (int i_30_ = 0; i_30_ < ((Class123_Sub2) this).aClass105_Sub2_8893.method1279(373853230); i_30_++) {
			Class330_Sub15_Sub1 class330_sub15_sub1 = ((Class123_Sub2) this).aClass105_Sub2_8893.method1280(i_30_, -436882078);
			if (class330_sub15_sub1 != null) {
				class330_sub15_sub1.method3329(i);
				Class109 class109 = class330_sub15_sub1.method3323(1632830751);
				int i_31_ = (((Class330_Sub15_Sub1_Sub1) (Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).anIntArray10129[i]);
				if (class109 == Class109.aClass109_1050 || class109 == Class109.aClass109_1096 || class109 == Class109.aClass109_1149 || class109 == Class109.aClass109_1052 || class109 == Class109.aClass109_1027)
					i_26_ = Math.max(i_31_, i_26_);
				else
					i_27_ = Math.max(i_31_, i_27_);
			}
		}
		((Class123_Sub2) this).aFloatArray8903 = new float[i_26_ + 1];
		((Class123_Sub2) this).aFloatArray8902 = new float[i_26_ + 1];
		((Class123_Sub2) this).aFloatArray8899 = new float[i_26_ + 1];
		((Class123_Sub2) this).aFloatArray8904 = new float[i_26_ + 1];
		((Class123_Sub2) this).anIntArray8894 = new int[i_27_ + 1];
		for (int i_32_ = 0; i_32_ < ((Class123_Sub2) this).anIntArray8894.length; i_32_++)
			((Class123_Sub2) this).anIntArray8894[i_32_] = -1;
		((Class123_Sub2) this).aString8905 = null;
		((Class123_Sub2) this).aString8907 = null;
		((Class123_Sub2) this).aBoolean8895 = true;
		return true;
	}

	void method1455(Class330_Sub15_Sub1 class330_sub15_sub1, float f) {
		int i = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i != -1) {
			if (((Class123_Sub2) this).aFloatArray8903[i] != f) {
				((Class123_Sub2) this).aFloatArray8903[i] = f;
				if ((class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1050) && (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1096))
					throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
				OpenGL.glUniform1f(i, f);
			}
		}
	}

	void method1468(int i, int i_33_, Interface11 interface11) {
		((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.method4955(i_33_);
		((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.method4956(interface11);
		OpenGL.glUniform1i(i, i_33_);
	}

	void method1473(Class330_Sub15_Sub1 class330_sub15_sub1, float f) {
		int i = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i != -1) {
			if (((Class123_Sub2) this).aFloatArray8903[i] != f) {
				((Class123_Sub2) this).aFloatArray8903[i] = f;
				if ((class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1050) && (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1096))
					throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
				OpenGL.glUniform1f(i, f);
			}
		}
	}

	void method1474(Class330_Sub15_Sub1 class330_sub15_sub1, float f, float f_34_, float f_35_) {
		int i = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i != -1) {
			if (((Class123_Sub2) this).aFloatArray8903[i] != f || ((Class123_Sub2) this).aFloatArray8902[i] != f_34_ || ((Class123_Sub2) this).aFloatArray8899[i] != f_35_) {
				((Class123_Sub2) this).aFloatArray8903[i] = f;
				((Class123_Sub2) this).aFloatArray8902[i] = f_34_;
				((Class123_Sub2) this).aFloatArray8899[i] = f_35_;
				if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1052)
					throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
				OpenGL.glUniform3f(i, f, f_34_, f_35_);
			}
		}
	}

	void method1452(Class330_Sub15_Sub1 class330_sub15_sub1, float f, float f_36_, float f_37_) {
		int i = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i != -1) {
			if (((Class123_Sub2) this).aFloatArray8903[i] != f || ((Class123_Sub2) this).aFloatArray8902[i] != f_36_ || ((Class123_Sub2) this).aFloatArray8899[i] != f_37_) {
				((Class123_Sub2) this).aFloatArray8903[i] = f;
				((Class123_Sub2) this).aFloatArray8902[i] = f_36_;
				((Class123_Sub2) this).aFloatArray8899[i] = f_37_;
				if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1052)
					throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
				OpenGL.glUniform3f(i, f, f_36_, f_37_);
			}
		}
	}

	void method1476(Class330_Sub15_Sub1 class330_sub15_sub1, float f, float f_38_, float f_39_, float f_40_) {
		int i = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i != -1) {
			if (((Class123_Sub2) this).aFloatArray8903[i] != f || ((Class123_Sub2) this).aFloatArray8902[i] != f_38_ || ((Class123_Sub2) this).aFloatArray8899[i] != f_39_ || ((Class123_Sub2) this).aFloatArray8904[i] != f_40_) {
				((Class123_Sub2) this).aFloatArray8903[i] = f;
				((Class123_Sub2) this).aFloatArray8902[i] = f_38_;
				((Class123_Sub2) this).aFloatArray8899[i] = f_39_;
				((Class123_Sub2) this).aFloatArray8904[i] = f_40_;
				if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1027)
					throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
				OpenGL.glUniform4f(i, f, f_38_, f_39_, f_40_);
			}
		}
	}

	void method1477(Class330_Sub15_Sub1 class330_sub15_sub1, float[] fs, int i) {
		int i_41_ = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i_41_ != -1)
			OpenGL.glUniform4fv(i_41_, i, fs, 0);
	}

	void method1479(Class330_Sub15_Sub1 class330_sub15_sub1, float[] fs, int i) {
		int i_42_ = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i_42_ != -1)
			OpenGL.glUniform4fv(i_42_, i, fs, 0);
	}

	void method1501(Class330_Sub15_Sub1 class330_sub15_sub1, Class249 class249) {
		if (!aBoolean8901 && (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1116))
			throw new AssertionError();
		int i = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i != -1)
			OpenGL.glUniform2fv(i, 4, class249.method2505(aFloatArray8900), 0);
	}

	void method1495(Class330_Sub15_Sub1 class330_sub15_sub1, float[] fs, int i) {
		int i_43_ = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i_43_ != -1)
			OpenGL.glUniform4fv(i_43_, i, fs, 0);
	}

	void method1466(int i, Class249 class249) {
		OpenGL.glUniform2fv(i, 4, class249.method2505(aFloatArray8900), 0);
	}

	void method1483(Class330_Sub15_Sub1 class330_sub15_sub1, Class249 class249) {
		if (!aBoolean8901 && (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1069))
			throw new AssertionError();
		int i = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class249.method2514(aFloatArray8900), 0);
	}

	void method1481(int i, Class249 class249) {
		OpenGL.glUniform2fv(i, 4, class249.method2505(aFloatArray8900), 0);
	}

	void method1485(Class330_Sub15_Sub1 class330_sub15_sub1, int i, Interface11 interface11) {
		int i_44_ = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i_44_ != -1) {
			if (interface11 == null)
				interface11 = (((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.anInterface11_Impl3_8551);
			if (i < ((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.anInt8592) {
				((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.method4955(i);
				((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.method4956(interface11);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture((((Class287) (Class287) interface11).anInt6554), (((Class287) (Class287) interface11).anInt6551));
			}
			if (((Class123_Sub2) this).anIntArray8894[i_44_] != i) {
				((Class123_Sub2) this).anIntArray8894[i_44_] = i;
				OpenGL.glUniform1i(i_44_, i);
			}
		}
	}

	void method1486(Class330_Sub15_Sub1 class330_sub15_sub1, int i, Interface11 interface11) {
		int i_45_ = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i_45_ != -1) {
			if (interface11 == null)
				interface11 = (((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.anInterface11_Impl3_8551);
			if (i < ((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.anInt8592) {
				((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.method4955(i);
				((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.method4956(interface11);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture((((Class287) (Class287) interface11).anInt6554), (((Class287) (Class287) interface11).anInt6551));
			}
			if (((Class123_Sub2) this).anIntArray8894[i_45_] != i) {
				((Class123_Sub2) this).anIntArray8894[i_45_] = i;
				OpenGL.glUniform1i(i_45_, i);
			}
		}
	}

	void method1487(int i, float f, float f_46_, float f_47_) {
		OpenGL.glUniform3f(i, f, f_46_, f_47_);
	}

	void method1497(Class330_Sub15_Sub1 class330_sub15_sub1, Class249 class249) {
		if (!aBoolean8901 && (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1116))
			throw new AssertionError();
		int i = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i != -1)
			OpenGL.glUniform2fv(i, 4, class249.method2505(aFloatArray8900), 0);
	}

	void method1472(int i, float f, float f_48_, float f_49_) {
		OpenGL.glUniform3f(i, f, f_48_, f_49_);
	}

	void method1482(int i, float f, float f_50_, float f_51_, float f_52_) {
		OpenGL.glUniform4f(i, f, f_50_, f_51_, f_52_);
	}

	void method1503(int i, float f, float f_53_, float f_54_, float f_55_) {
		OpenGL.glUniform4f(i, f, f_53_, f_54_, f_55_);
	}

	Class123_Sub2(Class_ra_Sub2_Sub1 class_ra_sub2_sub1, Class105_Sub2 class105_sub2, Class118 class118) {
		this(class_ra_sub2_sub1, class118);
		((Class123_Sub2) this).aClass105_Sub2_8893 = class105_sub2;
		((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892 = class_ra_sub2_sub1;
	}

	void method1493(int i, float[] fs, int i_56_) {
		OpenGL.glUniform4fv(i, i_56_, fs, 0);
	}

	void method1465(int i, float f, float f_57_, float f_58_) {
		OpenGL.glUniform3f(i, f, f_57_, f_58_);
	}

	void method1453(int i, Class249 class249) {
		OpenGL.glUniform2fv(i, 4, class249.method2505(aFloatArray8900), 0);
	}

	void method1457(Class330_Sub15_Sub1 class330_sub15_sub1, float f, float f_59_, float f_60_) {
		int i = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i != -1) {
			if (((Class123_Sub2) this).aFloatArray8903[i] != f || ((Class123_Sub2) this).aFloatArray8902[i] != f_59_ || ((Class123_Sub2) this).aFloatArray8899[i] != f_60_) {
				((Class123_Sub2) this).aFloatArray8903[i] = f;
				((Class123_Sub2) this).aFloatArray8902[i] = f_59_;
				((Class123_Sub2) this).aFloatArray8899[i] = f_60_;
				if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1052)
					throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
				OpenGL.glUniform3f(i, f, f_59_, f_60_);
			}
		}
	}

	void method1492(int i, Class249 class249) {
		OpenGL.glUniform2fv(i, 4, class249.method2505(aFloatArray8900), 0);
	}

	void method1500(Class330_Sub15_Sub1 class330_sub15_sub1, float f, float f_61_) {
		int i = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i != -1) {
			if (((Class123_Sub2) this).aFloatArray8903[i] != f || ((Class123_Sub2) this).aFloatArray8902[i] != f_61_) {
				((Class123_Sub2) this).aFloatArray8903[i] = f;
				((Class123_Sub2) this).aFloatArray8902[i] = f_61_;
				if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1149)
					throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
				OpenGL.glUniform2f(i, f, f_61_);
			}
		}
	}

	void method1499(int i, int i_62_, Interface11 interface11) {
		((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.method4955(i_62_);
		((Class123_Sub2) this).aClass_ra_Sub2_Sub1_8892.method4956(interface11);
		OpenGL.glUniform1i(i, i_62_);
	}

	void method1458(Class330_Sub15_Sub1 class330_sub15_sub1, float f) {
		int i = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i != -1) {
			if (((Class123_Sub2) this).aFloatArray8903[i] != f) {
				((Class123_Sub2) this).aFloatArray8903[i] = f;
				if ((class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1050) && (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1096))
					throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
				OpenGL.glUniform1f(i, f);
			}
		}
	}

	void method1478(int i, Class249 class249) {
		OpenGL.glUniform4fv(i, 4, class249.method2514(aFloatArray8900), 0);
	}

	void method1502(int i, Class249 class249) {
		OpenGL.glUniform4fv(i, 4, class249.method2514(aFloatArray8900), 0);
	}

	void method1459(int i, Class249 class249) {
		OpenGL.glUniform4fv(i, 4, class249.method2514(aFloatArray8900), 0);
	}

	void method1504(int i, Class249 class249) {
		OpenGL.glUniform4fv(i, 4, class249.method2514(aFloatArray8900), 0);
	}

	void method1470(Class330_Sub15_Sub1 class330_sub15_sub1, float f) {
		int i = ((Class330_Sub15_Sub1_Sub1) class330_sub15_sub1).method3333();
		if (i != -1) {
			if (((Class123_Sub2) this).aFloatArray8903[i] != f) {
				((Class123_Sub2) this).aFloatArray8903[i] = f;
				if ((class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1050) && (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1096))
					throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
				OpenGL.glUniform1f(i, f);
			}
		}
	}
}
