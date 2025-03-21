/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

import jaggl.OpenGL;

public abstract class Class46 {
	static int anInt449 = 34963;
	boolean aBoolean450 = false;
	static int anInt451 = 34962;
	Class_ra_Sub1 aClass_ra_Sub1_452;
	int anInt453;
	int anInt454;
	boolean aBoolean455;
	int anInt456;
	static int[] anIntArray457 = new int[1];

	abstract void method592();

	abstract void method593();

	void method594(byte[] is, int i) {
		method593();
		if (i > ((Class46) this).anInt454) {
			OpenGL.glBufferDataARBub(((Class46) this).anInt456, i, is, 0, (((Class46) this).aBoolean455 ? 35040 : 35044));
			((Class_ra_Sub1) ((Class46) this).aClass_ra_Sub1_452).anInt8311 += i - ((Class46) this).anInt454;
			((Class46) this).anInt454 = i;
		} else
			OpenGL.glBufferSubDataARBub(((Class46) this).anInt456, 0, i, is, 0);
	}

	abstract void method595();

	Class46(Class_ra_Sub1 class_ra_sub1, int i, byte[] is, int i_0_, boolean bool) {
		((Class46) this).aClass_ra_Sub1_452 = class_ra_sub1;
		((Class46) this).anInt456 = i;
		((Class46) this).anInt454 = i_0_;
		((Class46) this).aBoolean455 = bool;
		OpenGL.glGenBuffersARB(1, anIntArray457, 0);
		((Class46) this).anInt453 = anIntArray457[0];
		method593();
		OpenGL.glBufferDataARBub(i, ((Class46) this).anInt454, is, 0, ((Class46) this).aBoolean455 ? 35040 : 35044);
		((Class_ra_Sub1) ((Class46) this).aClass_ra_Sub1_452).anInt8311 += ((Class46) this).anInt454;
	}

	Class46(Class_ra_Sub1 class_ra_sub1, int i, Buffer buffer, int i_1_, boolean bool) {
		((Class46) this).aClass_ra_Sub1_452 = class_ra_sub1;
		((Class46) this).anInt456 = i;
		((Class46) this).anInt454 = i_1_;
		((Class46) this).aBoolean455 = bool;
		OpenGL.glGenBuffersARB(1, anIntArray457, 0);
		((Class46) this).anInt453 = anIntArray457[0];
		method593();
		OpenGL.glBufferDataARBa(i, ((Class46) this).anInt454, buffer.j(), ((Class46) this).aBoolean455 ? 35040 : 35044);
		((Class_ra_Sub1) ((Class46) this).aClass_ra_Sub1_452).anInt8311 += ((Class46) this).anInt454;
	}
}
