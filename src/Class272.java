/* Class272 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class272 implements Interface8_Impl1_Impl2_Impl1 {
	int anInt10288;
	Class287_Sub1 aClass287_Sub1_10289;

	public int method60() {
		return ((Class272) this).aClass287_Sub1_10289.method108();
	}

	public int method54() {
		return ((Class272) this).aClass287_Sub1_10289.method137();
	}

	Class272(Class287_Sub1 class287_sub1, int i) {
		((Class272) this).anInt10288 = i;
		((Class272) this).aClass287_Sub1_10289 = class287_sub1;
	}

	public void method217(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, (((Class287_Sub1) ((Class272) this).aClass287_Sub1_10289).anInt6554), (((Class287_Sub1) ((Class272) this).aClass287_Sub1_10289).anInt6551), ((Class272) this).anInt10288);
	}

	public void method215(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, (((Class287_Sub1) ((Class272) this).aClass287_Sub1_10289).anInt6554), (((Class287_Sub1) ((Class272) this).aClass287_Sub1_10289).anInt6551), ((Class272) this).anInt10288);
	}

	public int method58() {
		return ((Class272) this).aClass287_Sub1_10289.method137();
	}

	public int method55() {
		return ((Class272) this).aClass287_Sub1_10289.method108();
	}

	public int method56() {
		return ((Class272) this).aClass287_Sub1_10289.method137();
	}

	public int method59() {
		return ((Class272) this).aClass287_Sub1_10289.method108();
	}

	public int method57() {
		return ((Class272) this).aClass287_Sub1_10289.method137();
	}

	public int method61() {
		return ((Class272) this).aClass287_Sub1_10289.method108();
	}

	public void method52() {
		/* empty */
	}

	public void method53() {
		/* empty */
	}

	public void method216(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, (((Class287_Sub1) ((Class272) this).aClass287_Sub1_10289).anInt6554), (((Class287_Sub1) ((Class272) this).aClass287_Sub1_10289).anInt6551), ((Class272) this).anInt10288);
	}
}
