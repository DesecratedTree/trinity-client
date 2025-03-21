/* Class451 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class451 implements Interface17 {
	Class_ra aClass_ra6641;
	static int anInt6642;
	public static int anInt6643;

	public Object method262(int[] is, int i, int i_0_, int i_1_, int i_2_, boolean bool) {
		return ((Class451) this).aClass_ra6641.bu(is, i, i_0_, i_1_, i_2_, false);
	}

	public Object method263(int[] is, int i, int i_3_, int i_4_, int i_5_, boolean bool) {
		return ((Class451) this).aClass_ra6641.bu(is, i, i_3_, i_4_, i_5_, false);
	}

	Class451() {
		/* empty */
	}

	public Object method260(int[] is, int i, int i_6_, int i_7_, int i_8_, boolean bool) {
		return ((Class451) this).aClass_ra6641.bu(is, i, i_6_, i_7_, i_8_, false);
	}

	public Object method261(int[] is, int i, int i_9_, int i_10_, int i_11_, boolean bool, int i_12_) {
		try {
			return ((Class451) this).aClass_ra6641.bu(is, i, i_9_, i_10_, i_11_, false);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sr.r(").append(')').toString());
		}
	}

	public static String method5631(long l, int i, boolean bool, Class454 class454, int i_13_) {
		try {
			char c = ',';
			char c_14_ = '.';
			if (Class454.aClass454_6832 == class454) {
				c = '.';
				c_14_ = ',';
			}
			if (Class454.aClass454_6830 == class454)
				c_14_ = '\u00a0';
			boolean bool_15_ = false;
			if (l < 0L) {
				bool_15_ = true;
				l = -l;
			}
			StringBuilder stringbuilder = new StringBuilder(26);
			if (i > 0) {
				for (int i_16_ = 0; i_16_ < i; i_16_++) {
					int i_17_ = (int) l;
					l /= 10L;
					stringbuilder.append((char) (48 + i_17_ - (int) l * 10));
				}
				stringbuilder.append(c);
			}
			int i_18_ = 0;
			for (;;) {
				int i_19_ = (int) l;
				l /= 10L;
				stringbuilder.append((char) (48 + i_19_ - (int) l * 10));
				if (l == 0L) {
					if (i_13_ >= 438991284) {
						/* empty */
					}
					break;
				}
				if (bool && ++i_18_ % 3 == 0)
					stringbuilder.append(c_14_);
			}
			if (bool_15_)
				stringbuilder.append('-');
			return stringbuilder.reverse().toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sr.o(").append(')').toString());
		}
	}

	static final void method5632(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class152.method1784(iComponentDefinitions, class120, class430, (byte) -103);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sr.dw(").append(')').toString());
		}
	}

	static void method5633(int i) {
		try {
			int i_20_ = 0;
			if (null != Class448.aClass330_Sub50_5555)
				i_20_ = Class448.aClass330_Sub50_5555.aClass464_Sub5_7890.method5754(-1923330549);
			if (i_20_ == 2) {
				int i_21_ = (-1408375895 * client.anInt6609 > 800 ? 800 : client.anInt6609 * -1408375895);
				int i_22_ = (394893517 * Class520.anInt6017 > 600 ? 600 : 394893517 * Class520.anInt6017);
				Class300.anInt3058 = 944530027 * i_21_;
				client.anInt6611 = ((client.anInt6609 * -1408375895 - i_21_) / 2 * -759672145);
				Class146.anInt1615 = i_22_ * -343519027;
				client.anInt6612 = 0;
			} else if (i_20_ == 1) {
				int i_23_ = (client.anInt6609 * -1408375895 > 1024 ? 1024 : client.anInt6609 * -1408375895);
				int i_24_ = (394893517 * Class520.anInt6017 > 768 ? 768 : 394893517 * Class520.anInt6017);
				Class300.anInt3058 = 944530027 * i_23_;
				client.anInt6611 = -759672145 * ((-1408375895 * client.anInt6609 - i_23_) / 2);
				Class146.anInt1615 = i_24_ * -343519027;
				client.anInt6612 = 0;
			} else {
				Class300.anInt3058 = client.anInt6609 * -920594013;
				client.anInt6611 = 0;
				Class146.anInt1615 = Class520.anInt6017 * 54357033;
				client.anInt6612 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sr.gz(").append(')').toString());
		}
	}

	static final void method5634(Class430 class430, int i) {
		try {
			int i_25_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_25_, -1518736658);
			Class120 class120 = Class3.aClass120Array56[i_25_ >> 16];
			Class153.method1792(iComponentDefinitions, class120, class430, -182537974);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sr.nx(").append(')').toString());
		}
	}
}
