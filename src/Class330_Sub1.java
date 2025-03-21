/* Class330_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub1 extends Class330 {
	int[] anIntArray7497;
	static Class367 aClass367_7498;
	static int anInt7499;
	int[] anIntArray7500 = { -1 };
	static Class497 aClass497_7501 = new Class497(32);

	long method3259(int[] is, int i, int[] is_0_, boolean bool, int i_1_) {
		try {
			long[] ls = Buffer.aLongArray7850;
			long l = -1L;
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
			for (int i_2_ = 0; i_2_ < is.length; i_2_++) {
				l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_2_] >> 24)) & 0xffL)];
				l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_2_] >> 16)) & 0xffL)];
				l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_2_] >> 8)) & 0xffL)];
				l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_2_]) & 0xffL)];
			}
			if (null != is_0_) {
				for (int i_3_ = 0; i_3_ < 5; i_3_++)
					l = l >>> 8 ^ ls[(int) ((l ^ (long) is_0_[i_3_]) & 0xffL)];
			}
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aca.l(").append(')').toString());
		}
	}

	final Class387 method3260(Class_ra class_ra, int i, Class477 class477, int i_4_, boolean bool, Class408 class408, byte i_5_) {
		try {
			Class387 class387 = null;
			int i_6_ = i;
			Class364 class364 = null;
			if (-1 != i_4_)
				class364 = Class102.aClass362_924.method4254(i_4_, 113028296);
			int[] is = ((Class330_Sub1) this).anIntArray7500;
			if (null != class364 && null != class364.anIntArray3813) {
				is = new int[class364.anIntArray3813.length];
				for (int i_7_ = 0; i_7_ < class364.anIntArray3813.length; i_7_++) {
					int i_8_ = class364.anIntArray3813[i_7_];
					if (i_8_ >= 0 && i_8_ < ((Class330_Sub1) this).anIntArray7500.length)
						is[i_7_] = ((Class330_Sub1) this).anIntArray7500[i_8_];
					else
						is[i_7_] = -1;
				}
			}
			if (class477 != null)
				i_6_ |= class477.method5975(-205650189);
			long l = method3259(is, i_4_, null != class408 ? class408.anIntArray4205 : null, bool, 1414352065);
			if (null != aClass367_7498)
				class387 = (Class387) aClass367_7498.get(l);
			if (class387 == null || class_ra.ct(class387.m(), i_6_) != 0) {
				if (null != class387)
					i_6_ = class_ra.cd(i_6_, class387.m());
				int i_9_ = i_6_;
				boolean bool_10_ = false;
				for (int i_11_ = 0; i_11_ < is.length; i_11_++) {
					if (is[i_11_] == -1) {
						if (i_5_ <= 0)
							throw new IllegalStateException();
					} else if (!Class556.aClass510_6392.getItemDefinitions(is[i_11_], (byte) -73).missingFile(bool, null, 500491407))
						bool_10_ = true;
				}
				if (bool_10_)
					return null;
				Model[] class98s = new Model[is.length];
				for (int i_12_ = 0; i_12_ < is.length; i_12_++) {
					if (-1 == is[i_12_]) {
						if (i_5_ <= 0) {
							/* empty */
						}
					} else
						class98s[i_12_] = Class556.aClass510_6392.getItemDefinitions(is[i_12_], (byte) -58).getEquipmentInformation(bool, null, 1444633947);
				}
				if (null != class364 && null != class364.anIntArrayArray3807) {
					for (int i_13_ = 0; i_13_ < class364.anIntArrayArray3807.length; i_13_++) {
						if (class364.anIntArrayArray3807[i_13_] != null) {
							if (null == class98s[i_13_]) {
								if (i_5_ <= 0)
									throw new IllegalStateException();
							} else {
								int i_14_ = class364.anIntArrayArray3807[i_13_][0];
								int i_15_ = class364.anIntArrayArray3807[i_13_][1];
								int i_16_ = class364.anIntArrayArray3807[i_13_][2];
								int i_17_ = class364.anIntArrayArray3807[i_13_][3];
								int i_18_ = class364.anIntArrayArray3807[i_13_][4];
								int i_19_ = class364.anIntArrayArray3807[i_13_][5];
								if (0 != i_17_ || i_18_ != 0 || 0 != i_19_)
									class98s[i_13_].method1195(i_17_, i_18_, i_19_);
								if (i_14_ != 0 || 0 != i_15_ || i_16_ != 0)
									class98s[i_13_].method1194(i_14_, i_15_, i_16_);
							}
						}
					}
				}
				Model class98 = new Model(class98s, class98s.length);
				if (class408 != null)
					i_9_ |= 0x4000;
				class387 = class_ra.cb(class98, i_9_, -2023460339 * anInt7499, 66, 850);
				if (class408 != null) {
					for (int i_20_ = 0; i_20_ < 10; i_20_++) {
						for (int i_21_ = 0; (i_21_ < Class408.modelColors[i_20_].length); i_21_++) {
							if (class408.anIntArray4205[i_20_] < (Class408.modifiedModelColors[i_20_][i_21_]).length)
								class387.color((Class408.modelColors[i_20_][i_21_]), (Class408.modifiedModelColors[i_20_][i_21_][class408.anIntArray4205[i_20_]]));
						}
					}
				}
				if (null != aClass367_7498) {
					class387.KA(i_6_);
					aClass367_7498.put(class387, l);
				}
			}
			if (null == class477)
				return class387;
			Class387 class387_22_ = class387.method4446((byte) 1, i_6_, true);
			class477.method5976(class387_22_, 0, 603913132);
			return class387_22_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aca.b(").append(')').toString());
		}
	}

	static {
		aClass367_7498 = new Class367(10);
	}

	Class330_Sub1() {
		((Class330_Sub1) this).anIntArray7497 = new int[] { 0 };
	}

	static final void method3261(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1326 = Class288.method2886(string, class430, 1976553059);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aca.ol(").append(')').toString());
		}
	}
}
