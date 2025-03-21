/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

public class Class34 {
	Buffer aBuffer360;
	Class_ra_Sub1 aClass_ra_Sub1_361;

	void method505(byte[] is, int i) {
		if (((Class34) this).aBuffer360 == null || ((Class34) this).aBuffer360.r() < i)
			((Class34) this).aBuffer360 = ((Class_ra_Sub1) ((Class34) this).aClass_ra_Sub1_361).aNativeHeap8308.j(i, false);
		((Class34) this).aBuffer360.i(is, 0, 0, i);
	}

	Class34(Class_ra_Sub1 class_ra_sub1, Buffer buffer) {
		((Class34) this).aClass_ra_Sub1_361 = class_ra_sub1;
		((Class34) this).aBuffer360 = buffer;
	}

	Class34(Class_ra_Sub1 class_ra_sub1, byte[] is, int i) {
		((Class34) this).aClass_ra_Sub1_361 = class_ra_sub1;
		((Class34) this).aBuffer360 = ((Class_ra_Sub1) ((Class34) this).aClass_ra_Sub1_361).aNativeHeap8308.j(i, false);
		if (is != null)
			((Class34) this).aBuffer360.i(is, 0, 0, i);
	}
}
