/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Stack;

public class Class110 {
	static IndexTable aClass280_1153;
	static IndexTable aClass280_1154;
	static Class330_Sub40_Sub2 aClass330_Sub40_Sub2_1155;
	static int anInt1156 = 2;
	static int anInt1157 = 1;
	static int anInt1159 = 3;
	static IndexTable aClass280_1160;
	static IndexTable musicArchive;
	static int anInt1162 = 0;
	public static Class531 aClass531_1163;

	Class110() throws Throwable {
		throw new Error();
	}

	static Class344[] method1356(int i) {
		try {
			return (new Class344[] { Class344.aClass344_6811, Class344.aClass344_6813 });
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("el.r(").append(')').toString());
		}
	}

	public static void method1357(byte i) {
		try {
			synchronized (Class353.aStack3488) {
				Class353.aStack3488 = new Stack();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("el.i(").append(')').toString());
		}
	}

	public static void method1358(int i) {
		try {
			Class424.aClass378_4326.method4379(1988507329);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("el.r(").append(')').toString());
		}
	}

	static final void method1359(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class170.method2044(iComponentDefinitions, class120, class430, -1191354716);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("el.ly(").append(')').toString());
		}
	}

	static final void method1360(Class430 class430, byte i) throws Exception_Sub4 {
		try {
			((Class430) class430).anInt4376 -= -1265050756;
			int i_0_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_1_ = (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			int i_2_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 2]);
			int i_3_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 3]);
			Class260 class260 = Class260.method2577((float) i_0_, (float) i_1_, (float) i_2_);
			if (-1.0F == class260.aFloat2716)
				class260.aFloat2716 = Float.POSITIVE_INFINITY;
			if (class260.aFloat2715 == -1.0F)
				class260.aFloat2715 = Float.POSITIVE_INFINITY;
			if (-1.0F == class260.aFloat2711)
				class260.aFloat2711 = Float.POSITIVE_INFINITY;
			Class401_Sub1.aClass145_Sub1_8249.method1676(class260, -1767383005);
			Class401_Sub1.aClass145_Sub1_8249.method1675((float) i_3_ / 1000.0F, 1410416661);
			class260.method2550();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("el.aii(").append(')').toString());
		}
	}

	static final void method1361(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = ((Class263_Sub2.myPlayer.aClass408_10240) != null && (Class263_Sub2.myPlayer.aClass408_10240.aBoolean4213)) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("el.uq(").append(')').toString());
		}
	}

	static final void method1362(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, byte i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1319 = Class288.method2886(string, class430, 1596860548);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("el.lm(").append(')').toString());
		}
	}

	public static void method1363(Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1, int[] is, int[] is_4_, int[] is_5_, byte i) {
		try {
			for (int i_6_ = 0; i_6_ < is.length; i_6_++) {
				int i_7_ = is[i_6_];
				int i_8_ = is_5_[i_6_];
				int i_9_ = is_4_[i_6_];
				for (int i_10_ = 0; (i_8_ != 0 && i_10_ < (class432_sub1_sub1_sub1.aClass477_Sub2_Sub1Array10019).length); i_8_ >>>= 1) {
					if (0 == (i_8_ & 0x1)) {
						if (i >= 1) {
							/* empty */
						}
					} else if (-1 == i_7_)
						class432_sub1_sub1_sub1.aClass477_Sub2_Sub1Array10019[i_10_] = null;
					else {
						Class440 class440 = Class201.aClass436_6511.method5570(i_7_, 1513096957);
						int i_11_ = class440.anInt4472 * -2030693815;
						Class477_Sub2_Sub1 class477_sub2_sub1 = (class432_sub1_sub1_sub1.aClass477_Sub2_Sub1Array10019[i_10_]);
						if (class477_sub2_sub1 != null && class477_sub2_sub1.method5966(-894265972)) {
							if (i_7_ == class477_sub2_sub1.method5967((byte) -98)) {
								if (0 == i_11_) {
									class432_sub1_sub1_sub1.aClass477_Sub2_Sub1Array10019[i_10_] = null;
									class477_sub2_sub1 = null;
								} else if (1 == i_11_) {
									class477_sub2_sub1.method5979((byte) 16);
									class477_sub2_sub1.anInt9940 = i_9_ * -682475581;
								} else if (2 == i_11_)
									class477_sub2_sub1.method5980((byte) 18);
							} else if (class440.anInt4470 * -233463405 >= ((class477_sub2_sub1.method5986((byte) -35).anInt4470) * -233463405)) {
								class432_sub1_sub1_sub1.aClass477_Sub2_Sub1Array10019[i_10_] = null;
								class477_sub2_sub1 = null;
							}
						}
						if (null == class477_sub2_sub1 || !class477_sub2_sub1.method5966(2030690102)) {
							class477_sub2_sub1 = class432_sub1_sub1_sub1.aClass477_Sub2_Sub1Array10019[i_10_] = (new Class477_Sub2_Sub1(class432_sub1_sub1_sub1));
							class477_sub2_sub1.method5988(i_7_, (byte) -15);
							class477_sub2_sub1.anInt9940 = -682475581 * i_9_;
						}
					}
					i_10_++;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("el.ic(").append(')').toString());
		}
	}
}
