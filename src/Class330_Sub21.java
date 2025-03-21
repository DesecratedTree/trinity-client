/* Class330_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub21 extends Class330 {
	float aFloat7684;
	Class208 aClass208_7685;
	int anInt7686;
	int anInt7687;
	float aFloat7688;
	int anInt7689;
	Class64 aClass64_7690;
	static float[] aFloatArray7691 = new float[3];

	void method3375(byte i) {
		try {
			((Class330_Sub21) this).anInt7686 = ((Class330_Sub21) this).aClass64_7690.anInt565 * -897116981;
			((Class330_Sub21) this).anInt7687 = 1064544023 * ((Class330_Sub21) this).aClass64_7690.anInt563;
			((Class330_Sub21) this).anInt7689 = -541011853 * ((Class330_Sub21) this).aClass64_7690.anInt567;
			if (null != ((Class330_Sub21) this).aClass64_7690.aClass249_568)
				((Class330_Sub21) this).aClass64_7690.aClass249_568.method2488((float) (2018198101 * (((Class330_Sub21) this).aClass208_7685.anInt1970)), (float) (-460016343 * (((Class330_Sub21) this).aClass208_7685.anInt1953)), (float) (-602604801 * (((Class330_Sub21) this).aClass208_7685.anInt1972)), aFloatArray7691);
			((Class330_Sub21) this).aFloat7684 = aFloatArray7691[0];
			((Class330_Sub21) this).aFloat7688 = aFloatArray7691[2];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adb.r(").append(')').toString());
		}
	}

	Class330_Sub21(Class64 class64, Class388 class388) {
		((Class330_Sub21) this).aClass64_7690 = class64;
		((Class330_Sub21) this).aClass208_7685 = ((Class330_Sub21) this).aClass64_7690.method771(-1907493266);
		method3375((byte) 105);
	}
}
