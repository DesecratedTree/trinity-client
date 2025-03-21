/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class47 {
	static int anInt458 = 128;
	Class36_Sub2 aClass36_Sub2_459;
	static int anInt460 = 128;
	Class36_Sub1[] aClass36_Sub1Array461 = null;
	boolean aBoolean462;
	static int anInt463 = 4000;
	Class36_Sub2 aClass36_Sub2_464 = null;
	Class36_Sub1[] aClass36_Sub1Array465 = null;
	Class36_Sub2 aClass36_Sub2_466 = null;
	static int anInt467 = 16;
	static Object anObject468;
	static Object anObject469;
	static Object anObject470;

	Class47(Class_ra_Sub1 class_ra_sub1) {
		((Class47) this).aClass36_Sub2_459 = null;
		((Class47) this).aBoolean462 = ((Class_ra_Sub1) class_ra_sub1).aBoolean8419;
		method596(class_ra_sub1);
		if (!((Class47) this).aBoolean462) {
			((Class47) this).aClass36_Sub1Array461 = new Class36_Sub1[16];
			for (int i = 0; i < 16; i++) {
				byte[] is = Class535.method6312(anObject468, i * 32768, 32768, -2137022791);
				((Class47) this).aClass36_Sub1Array461[i] = new Class36_Sub1(class_ra_sub1, 3553, Class72.aClass72_613, Class86.aClass86_714, 128, 128, true, is, Class72.aClass72_613, false);
			}
			((Class47) this).aClass36_Sub1Array465 = new Class36_Sub1[16];
			for (int i = 0; i < 16; i++) {
				byte[] is = Class535.method6312(anObject469, i * 32768, 32768, 1628337887);
				((Class47) this).aClass36_Sub1Array465[i] = new Class36_Sub1(class_ra_sub1, 3553, Class72.aClass72_613, Class86.aClass86_714, 128, 128, true, is, Class72.aClass72_613, false);
			}
		} else {
			byte[] is = Class400.method4707(anObject468, false, -214151596);
			((Class47) this).aClass36_Sub2_464 = new Class36_Sub2(class_ra_sub1, Class72.aClass72_613, Class86.aClass86_714, 128, 128, 16, is, Class72.aClass72_613);
			is = Class400.method4707(anObject469, false, -984741985);
			((Class47) this).aClass36_Sub2_466 = new Class36_Sub2(class_ra_sub1, Class72.aClass72_613, Class86.aClass86_714, 128, 128, 16, is, Class72.aClass72_613);
			Class59 class59 = ((Class_ra_Sub1) class_ra_sub1).aClass59_8292;
			if (class59.method670()) {
				is = Class400.method4707(anObject470, false, -1297273772);
				((Class47) this).aClass36_Sub2_459 = new Class36_Sub2(class_ra_sub1, Class72.aClass72_620, Class86.aClass86_714, 128, 128, 16);
				Class36_Sub2 class36_sub2 = new Class36_Sub2(class_ra_sub1, Class72.aClass72_612, Class86.aClass86_714, 128, 128, 16, is, Class72.aClass72_612);
				if (!class59.method669(((Class47) this).aClass36_Sub2_459, class36_sub2, 2.0F)) {
					((Class47) this).aClass36_Sub2_459.method510();
					((Class47) this).aClass36_Sub2_459 = null;
				} else
					((Class47) this).aClass36_Sub2_459.method516();
				class36_sub2.method510();
			}
		}
	}

	static void method596(Class_ra_Sub1 class_ra_sub1) {
		if (anObject468 == null) {
			Class223_Sub2_Sub2 class223_sub2_sub2 = new Class223_Sub2_Sub2();
			byte[] is = class223_sub2_sub2.method2297(128, 128, 16);
			anObject468 = Class433.method5557(is, false, (byte) 20);
		}
		if (anObject469 == null) {
			Class223_Sub1_Sub2 class223_sub1_sub2 = new Class223_Sub1_Sub2();
			byte[] is = class223_sub1_sub2.method2292(128, 128, 16);
			anObject469 = Class433.method5557(is, false, (byte) 16);
		}
		Class59 class59 = ((Class_ra_Sub1) class_ra_sub1).aClass59_8292;
		if (class59.method670() && anObject470 == null) {
			byte[] is = Class319.method3169(128, 128, 16, 8, new Class335_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject470 = Class433.method5557(is, false, (byte) 1);
		}
	}
}
