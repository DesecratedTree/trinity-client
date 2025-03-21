/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class76 {
	public abstract int method855();

	public abstract int method856();

	public abstract int method857();

	public abstract void method179();

	abstract boolean method174();

	Class76() {
		/* empty */
	}

	public abstract void method180();

	public abstract int method858();

	public abstract int method859();

	public abstract int method860();

	abstract boolean method176();

	public abstract int method861();

	abstract boolean method862();

	abstract boolean method182();

	abstract boolean method178();

	abstract boolean method863();

	public abstract int method864();

	public abstract void method185();

	public abstract void method183();

	public abstract void method181();

	abstract boolean method865();

	public static void method866(Class_ra class_ra, IndexTable class280, int i) {
		try {
			Class87[] class87s = Class53.method641(class280, Class95_Sub8.anInt7158 * -1191183221, 0);
			Class203.aClass61Array6791 = new Class61[class87s.length];
			for (int i_0_ = 0; i_0_ < class87s.length; i_0_++)
				Class203.aClass61Array6791[i_0_] = class_ra.bw(class87s[i_0_], true);
			class87s = Class53.method641(class280, Class212.anInt6532 * -1286474675, 0);
			Class434.aClass61Array6559 = new Class61[class87s.length];
			for (int i_1_ = 0; i_1_ < class87s.length; i_1_++)
				Class434.aClass61Array6559[i_1_] = class_ra.bw(class87s[i_1_], true);
			class87s = Class53.method641(class280, OutputStream_Sub1.anInt12 * 957483893, 0);
			Class125.aClass61Array1457 = new Class61[class87s.length];
			for (int i_2_ = 0; i_2_ < class87s.length; i_2_++)
				Class125.aClass61Array1457[i_2_] = class_ra.bw(class87s[i_2_], true);
			class87s = Class53.method641(class280, -614008721 * Class508.anInt5945, 0);
			Class12.aClass61Array10077 = new Class61[class87s.length];
			for (int i_3_ = 0; i_3_ < class87s.length; i_3_++)
				Class12.aClass61Array10077[i_3_] = class_ra.bw(class87s[i_3_], true);
			class87s = Class53.method641(class280, -2023017727 * Class367.anInt3864, 0);
			Class_v.aClass61Array7960 = new Class61[class87s.length];
			int i_4_ = 25;
			for (int i_5_ = 0; i_5_ < class87s.length; i_5_++) {
				class87s[i_5_].method996(-i_4_ + (int) (Math.random() * (double) i_4_ * 2.0), -i_4_ + (int) (Math.random() * (double) i_4_ * 2.0), -i_4_ + (int) (Math.random() * (double) i_4_ * 2.0));
				Class_v.aClass61Array7960[i_5_] = class_ra.bw(class87s[i_5_], true);
			}
			class87s = Class53.method641(class280, -645517749 * Class_ta.anInt5568, 0);
			Class507.aClass61Array5940 = new Class61[class87s.length];
			for (int i_6_ = 0; i_6_ < class87s.length; i_6_++)
				Class507.aClass61Array5940[i_6_] = class_ra.bw(class87s[i_6_], true);
			class87s = Class53.method641(class280, -1412510307 * Class125.anInt1455, 0);
			Class76_Sub1.aClass61Array7097 = new Class61[class87s.length];
			i_4_ = 12;
			for (int i_7_ = 0; i_7_ < class87s.length; i_7_++) {
				class87s[i_7_].method996(-i_4_ + (int) (Math.random() * (double) i_4_ * 2.0), -i_4_ + (int) (Math.random() * (double) i_4_ * 2.0), -i_4_ + (int) (Math.random() * (double) i_4_ * 2.0));
				Class76_Sub1.aClass61Array7097[i_7_] = class_ra.bw(class87s[i_7_], true);
			}
			class87s = Class53.method641(class280, -542773511 * Class220.anInt2186, 0);
			Class57.aClass61Array6599 = new Class61[class87s.length];
			i_4_ = 12;
			for (int i_8_ = 0; i_8_ < class87s.length; i_8_++) {
				class87s[i_8_].method996(-i_4_ + (int) (Math.random() * (double) i_4_ * 2.0), -i_4_ + (int) (Math.random() * (double) i_4_ * 2.0), -i_4_ + (int) (Math.random() * (double) i_4_ * 2.0));
				Class57.aClass61Array6599[i_8_] = class_ra.bw(class87s[i_8_], true);
			}
			Class116.aClass61_1376 = class_ra.bw(Class53.method643(class280, (Class125.anInt1456 * 1869380893), 0), true);
			Class271.aClass61_2757 = class_ra.bw(Class53.method643(class280, (1616466847 * Class101.anInt6457), 0), true);
			class87s = Class53.method641(class280, Class537.anInt6238 * -721711285, 0);
			Class231.aClass61Array6766 = new Class61[class87s.length];
			for (int i_9_ = 0; i_9_ < class87s.length; i_9_++)
				Class231.aClass61Array6766[i_9_] = class_ra.bw(class87s[i_9_], true);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("db.f(").append(')').toString());
		}
	}

	static void method867(Class120 class120, IComponentDefinitions iComponentDefinitions, int i) {
		try {
			if (null != iComponentDefinitions) {
				if (-1 != iComponentDefinitions.anInt1287 * -790144721) {
					IComponentDefinitions class114_10_ = (class120.aClass114Array1400[iComponentDefinitions.anInt1211 * 861085587 & 0xffff]);
					if (class114_10_ != null) {
						if (class114_10_.aClass114Array1347 == class114_10_.aClass114Array1219) {
							class114_10_.aClass114Array1219 = (new IComponentDefinitions[class114_10_.aClass114Array1347.length]);
							class114_10_.aClass114Array1219[0] = iComponentDefinitions;
							Class453.method5641(class114_10_.aClass114Array1347, 0, class114_10_.aClass114Array1219, 1, iComponentDefinitions.anInt1287 * -790144721);
							Class453.method5641(class114_10_.aClass114Array1347, -790144721 * iComponentDefinitions.anInt1287 + 1, class114_10_.aClass114Array1219, -790144721 * iComponentDefinitions.anInt1287 + 1, (class114_10_.aClass114Array1347.length - -790144721 * iComponentDefinitions.anInt1287 - 1));
						} else {
							int i_11_ = 0;
							IComponentDefinitions[] class114s;
							for (class114s = class114_10_.aClass114Array1219; i_11_ < class114s.length; i_11_++) {
								if (class114s[i_11_] == iComponentDefinitions) {
									if (i >= 16711935)
										throw new IllegalStateException();
									break;
								}
							}
							if (i_11_ < class114s.length) {
								Class453.method5641(class114s, 0, class114s, 1, i_11_);
								class114s[0] = iComponentDefinitions;
							}
						}
					}
				} else {
					IComponentDefinitions[] class114s = class120.method1441(889022062);
					int i_12_;
					for (i_12_ = 0; i_12_ < class114s.length; i_12_++) {
						if (iComponentDefinitions == class114s[i_12_]) {
							if (i >= 16711935) {
								/* empty */
							}
							break;
						}
					}
					if (i_12_ < class114s.length) {
						Class453.method5641(class114s, 0, class114s, 1, i_12_);
						class114s[0] = iComponentDefinitions;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("db.x(").append(')').toString());
		}
	}

	static final void method868(Class430 class430, int i) {
		try {
			int i_13_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_13_, -1131309815);
			Class120 class120 = Class3.aClass120Array56[i_13_ >> 16];
			Class20.method467(iComponentDefinitions, class120, class430, (byte) 68);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("db.ju(").append(')').toString());
		}
	}

	static final void method869(Class430 class430, byte i) {
		try {
			int i_14_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_14_, -1077289156);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = iComponentDefinitions.anInt1209 * -1600154343;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("db.rd(").append(')').toString());
		}
	}

	static final void method870(Class430 class430, byte i) {
		try {
			int i_15_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class330_Sub36_Sub4 class330_sub36_sub4 = Class2.aClass523_44.method6233(i_15_, 1876775533);
			if (null == class330_sub36_sub4.anIntArray9661)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = class330_sub36_sub4.anIntArray9661.length;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("db.adr(").append(')').toString());
		}
	}

	static final void method871(Class430 class430, int i) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub2_7868, (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) == 1 ? 1 : 0, 80503668);
			Class22.method473((byte) 73);
			client.aClass304_9030.method3008(1829482511).method4582(1284915251);
			Class435.method5568(1140387205);
			client.aBoolean9194 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("db.ake(").append(')').toString());
		}
	}

	static final void method872(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class432_Sub1_Sub5_Sub1.method5547(2109592419).method297((short) 7361);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("db.ajn(").append(')').toString());
		}
	}
}
