/* Class330_Sub15_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class330_Sub15_Sub1_Sub1 extends Class330_Sub15_Sub1 {
	int[] anIntArray10129 = null;
	Class105_Sub2 aClass105_Sub2_10130;

	Class330_Sub15_Sub1_Sub1(Class105_Sub2 class105_sub2, Class104 class104) {
		super(class104);
		((Class330_Sub15_Sub1_Sub1) this).aClass105_Sub2_10130 = class105_sub2;
	}

	final int method3333() {
		return (((Class330_Sub15_Sub1_Sub1) this).anIntArray10129[((Class330_Sub15_Sub1_Sub1) this).aClass105_Sub2_10130.method1260((short) 11701)]);
	}

	public boolean method3329(int i) {
		if (((Class330_Sub15_Sub1_Sub1) this).anIntArray10129 == null)
			((Class330_Sub15_Sub1_Sub1) this).anIntArray10129 = new int[((Class330_Sub15_Sub1_Sub1) this).aClass105_Sub2_10130.method1255((byte) -96)];
		Class123_Sub2 class123_sub2 = ((Class123_Sub2) ((Class330_Sub15_Sub1_Sub1) this).aClass105_Sub2_10130.method1256(i, 1454171623));
		((Class330_Sub15_Sub1_Sub1) this).anIntArray10129[i] = OpenGL.glGetUniformLocation((((Class123_Sub2) class123_sub2).anInt8906), method3324((byte) 22));
		return ((Class330_Sub15_Sub1_Sub1) this).anIntArray10129[i] != -1;
	}

	public final int method3328(int i) {
		return ((Class330_Sub15_Sub1_Sub1) this).anIntArray10129[i];
	}

	public boolean method3322(int i) {
		if (((Class330_Sub15_Sub1_Sub1) this).anIntArray10129 == null)
			((Class330_Sub15_Sub1_Sub1) this).anIntArray10129 = new int[((Class330_Sub15_Sub1_Sub1) this).aClass105_Sub2_10130.method1255((byte) 62)];
		Class123_Sub2 class123_sub2 = ((Class123_Sub2) ((Class330_Sub15_Sub1_Sub1) this).aClass105_Sub2_10130.method1256(i, 221882929));
		((Class330_Sub15_Sub1_Sub1) this).anIntArray10129[i] = OpenGL.glGetUniformLocation((((Class123_Sub2) class123_sub2).anInt8906), method3324((byte) -60));
		return ((Class330_Sub15_Sub1_Sub1) this).anIntArray10129[i] != -1;
	}

	public final int method3327(int i) {
		return ((Class330_Sub15_Sub1_Sub1) this).anIntArray10129[i];
	}

	public final int method3331(int i) {
		return ((Class330_Sub15_Sub1_Sub1) this).anIntArray10129[i];
	}

	public final int method3330(int i) {
		return ((Class330_Sub15_Sub1_Sub1) this).anIntArray10129[i];
	}
}
