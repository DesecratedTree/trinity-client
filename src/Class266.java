/* Class266 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public abstract class Class266 implements Interface9 {
	static int anInt6489 = 34962;
	int anInt6490 = -1;
	Class_ra_Sub2_Sub1 aClass_ra_Sub2_Sub1_6491;
	int anInt6492;
	boolean aBoolean6493;
	int anInt6494;
	static int[] anIntArray6495 = new int[1];
	int anInt6496;
	NativeHeapBuffer aNativeHeapBuffer6497;
	static int anInt6498 = 34963;

	void method2645() {
		if (((Class266) this).anInt6490 < 0) {
			if (((Class_ra_Sub2_Sub1) ((Class266) this).aClass_ra_Sub2_Sub1_6491).aBoolean9879) {
				OpenGL.glGenBuffersARB(1, anIntArray6495, 0);
				((Class266) this).anInt6490 = anIntArray6495[0];
				OpenGL.glBindBufferARB(((Class266) this).anInt6492, ((Class266) this).anInt6490);
			} else
				((Class266) this).anInt6490 = 0;
		}
	}

	Class266(Class_ra_Sub2_Sub1 class_ra_sub2_sub1, int i, boolean bool) {
		((Class266) this).aClass_ra_Sub2_Sub1_6491 = class_ra_sub2_sub1;
		((Class266) this).anInt6492 = i;
		((Class266) this).aBoolean6493 = bool;
	}

	long method2646() {
		return (((Class266) this).anInt6490 == 0 ? ((Class266) this).aNativeHeapBuffer6497.j() : 0L);
	}

	public boolean method98(int i, int i_0_, long l) {
		method2645();
		if (((Class266) this).anInt6490 > 0) {
			OpenGL.glBindBufferARB(((Class266) this).anInt6492, ((Class266) this).anInt6490);
			OpenGL.glBufferSubDataARBa(((Class266) this).anInt6492, i, i_0_, l);
		} else
			((Class266) this).aNativeHeapBuffer6497.j.copy(((Class266) this).aNativeHeapBuffer6497.j() + (long) i, l, i_0_);
		return true;
	}

	void method148(int i) {
		if (i > ((Class266) this).anInt6496) {
			method2645();
			if (((Class266) this).anInt6490 > 0) {
				OpenGL.glBindBufferARB(((Class266) this).anInt6492, ((Class266) this).anInt6490);
				OpenGL.glBufferDataARBub(((Class266) this).anInt6492, i, null, 0, (((Class266) this).aBoolean6493 ? 35040 : 35044));
				((Class266) this).aClass_ra_Sub2_Sub1_6491.anInt8466 += i - ((Class266) this).anInt6496;
			} else
				((Class266) this).aNativeHeapBuffer6497 = ((Class266) this).aClass_ra_Sub2_Sub1_6491.method4908(i, false);
			((Class266) this).anInt6496 = i;
		}
		((Class266) this).anInt6494 = i;
	}

	public long method94(int i, int i_1_) {
		OpenGL.glBindBufferARB(((Class266) this).anInt6492, ((Class266) this).anInt6490);
		return (OpenGL.glMapBufferARB(((Class266) this).anInt6492, 35001) + (long) i);
	}

	public int method93() {
		return ((Class266) this).anInt6494;
	}

	public boolean method97(int i, int i_2_, long l) {
		method2645();
		if (((Class266) this).anInt6490 > 0) {
			OpenGL.glBindBufferARB(((Class266) this).anInt6492, ((Class266) this).anInt6490);
			OpenGL.glBufferSubDataARBa(((Class266) this).anInt6492, i, i_2_, l);
		} else
			((Class266) this).aNativeHeapBuffer6497.j.copy(((Class266) this).aNativeHeapBuffer6497.j() + (long) i, l, i_2_);
		return true;
	}

	void method53() {
		if (((Class266) this).anInt6490 > 0) {
			((Class266) this).aClass_ra_Sub2_Sub1_6491.method5154(((Class266) this).anInt6490, ((Class266) this).anInt6494);
			((Class266) this).anInt6490 = -1;
		}
	}

	public void method103() {
		OpenGL.glUnmapBufferARB(((Class266) this).anInt6492);
	}

	public int method100() {
		return ((Class266) this).anInt6494;
	}

	public int method96() {
		return ((Class266) this).anInt6494;
	}

	void method2647() {
		if (((Class_ra_Sub2_Sub1) ((Class266) this).aClass_ra_Sub2_Sub1_6491).aBoolean9879)
			OpenGL.glBindBufferARB(((Class266) this).anInt6492, ((Class266) this).anInt6490);
	}

	public void method95() {
		OpenGL.glUnmapBufferARB(((Class266) this).anInt6492);
	}

	public boolean method99(int i, int i_3_, long l) {
		method2645();
		if (((Class266) this).anInt6490 > 0) {
			OpenGL.glBindBufferARB(((Class266) this).anInt6492, ((Class266) this).anInt6490);
			OpenGL.glBufferSubDataARBa(((Class266) this).anInt6492, i, i_3_, l);
		} else
			((Class266) this).aNativeHeapBuffer6497.j.copy(((Class266) this).aNativeHeapBuffer6497.j() + (long) i, l, i_3_);
		return true;
	}

	public long method101(int i, int i_4_) {
		OpenGL.glBindBufferARB(((Class266) this).anInt6492, ((Class266) this).anInt6490);
		return (OpenGL.glMapBufferARB(((Class266) this).anInt6492, 35001) + (long) i);
	}

	public long method102(int i, int i_5_) {
		OpenGL.glBindBufferARB(((Class266) this).anInt6492, ((Class266) this).anInt6490);
		return (OpenGL.glMapBufferARB(((Class266) this).anInt6492, 35001) + (long) i);
	}

	public long method92(int i, int i_6_) {
		OpenGL.glBindBufferARB(((Class266) this).anInt6492, ((Class266) this).anInt6490);
		return (OpenGL.glMapBufferARB(((Class266) this).anInt6492, 35001) + (long) i);
	}
}
