/* Class534 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class534 implements Interface23 {
	Class367 aClass367_6786 = new Class367(64);
	IndexTable aClass280_6787;
	public static Class412 aClass412_6788;

	public Class534(Class435 class435, Class454 class454, IndexTable class280) {
		((Class534) this).aClass280_6787 = class280;
		((Class534) this).aClass280_6787.method2763((-989081113 * (Class103.aClass103_929.anInt982)), -2024541320);
	}

	public Class330_Sub36_Sub1 method6305(int i, byte i_0_) {
		try {
			Class330_Sub36_Sub1 class330_sub36_sub1;
			synchronized (((Class534) this).aClass367_6786) {
				class330_sub36_sub1 = ((Class330_Sub36_Sub1) ((Class534) this).aClass367_6786.get((long) i));
			}
			if (null != class330_sub36_sub1)
				return class330_sub36_sub1;
			byte[] is;
			synchronized (((Class534) this).aClass280_6787) {
				is = (((Class534) this).aClass280_6787.getFile(Class103.aClass103_929.anInt982 * -989081113, i));
			}
			class330_sub36_sub1 = new Class330_Sub36_Sub1();
			if (null != is)
				class330_sub36_sub1.method3441(new Buffer(is), (byte) 0);
			synchronized (((Class534) this).aClass367_6786) {
				((Class534) this).aClass367_6786.put(class330_sub36_sub1, (long) i);
			}
			return class330_sub36_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wd.r(").append(')').toString());
		}
	}

	public static void method6306(int i, boolean bool, int i_1_, boolean bool_2_, int i_3_) {
		try {
			Class512.method6192(0, Class507.aClass401_Sub1Array5935.length - 1, i, bool, i_1_, bool_2_, -2071045247);
			Class507.anInt5931 = 0;
			Class507.aClass422_5938 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wd.w(").append(')').toString());
		}
	}

	static final void method6307(Class430 class430, int i) {
		try {
			int i_4_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			ItemDefinitions itemDefinitions = Class556.aClass510_6392.getItemDefinitions(i_4_, (byte) 7);
			int i_5_;
			if (itemDefinitions.aBoolean6716)
				i_5_ = -881260187 * itemDefinitions.anInt6713;
			else if (itemDefinitions.aBoolean6707)
				i_5_ = 266533345 * aClass412_6788.anInt4253;
			else
				i_5_ = aClass412_6788.anInt4254 * -1925692033;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wd.aba(").append(')').toString());
		}
	}
}
