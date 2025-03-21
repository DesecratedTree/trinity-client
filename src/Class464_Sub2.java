/* Class464_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class464_Sub2 extends Class464 {
	public static int anInt8663 = 0;
	public static int anInt8664 = 1;

	void method5719(int i) {
		anInt5587 = i * 1558443671;
	}

	int method5718() {
		return 1;
	}

	public Class464_Sub2(Class330_Sub50 class330_sub50) {
		super(class330_sub50);
	}

	void method5721(int i) {
		anInt5587 = i * 1558443671;
	}

	int method5716(int i, int i_0_) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aey.j(").append(')').toString());
		}
	}

	public int method5736(byte i) {
		try {
			return anInt5587 * 295364903;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aey.b(").append(')').toString());
		}
	}

	int method5715(int i) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aey.r(").append(')').toString());
		}
	}

	void method5722(int i, byte i_1_) {
		try {
			anInt5587 = i * 1558443671;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aey.p(").append(')').toString());
		}
	}

	int method5714(int i) {
		return 1;
	}

	public void method5737(int i) {
		try {
			if (295364903 * anInt5587 != 1 && 295364903 * anInt5587 != 0)
				anInt5587 = method5715(582265491) * 1558443671;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aey.l(").append(')').toString());
		}
	}

	public Class464_Sub2(int i, Class330_Sub50 class330_sub50) {
		super(i, class330_sub50);
	}

	void method5720(int i) {
		anInt5587 = i * 1558443671;
	}

	static final void method5738(Class430 class430, byte i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_2_, 1273143978);
			Class307.method3076(iComponentDefinitions, class430, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aey.qn(").append(')').toString());
		}
	}

	static void method5739(File file, int i) {
		try {
			Class317.aFile3276 = file;
			if (!Class317.aFile3276.exists())
				throw new RuntimeException("");
			Class317.aBoolean3275 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aey.r(").append(')').toString());
		}
	}

	static void method5740(int i) {
		try {
			if (Class361.aClass_ra3793 != null) {
				client.aClass304_9030.method3003(50776472);
				Class_ta.method5674((byte) 1);
				Class112.method1379(51990841);
				Class110.method1357((byte) 42);
				client.aClass304_9030.method3005(-2047823349);
				Class285_Sub1.method2865((short) -12399);
				Class50.method632(false, (byte) -12);
				Class95_Sub7.method1124(553546010);
				Class517.method6212(true, 1271174264);
				Class421.method5293((byte) 122);
				Class330_Sub9.method3286(1199215044);
				for (int i_3_ = 0; i_3_ < client.aClass327Array8999.length; i_3_++) {
					if (client.aClass327Array8999[i_3_] == null) {
						/* empty */
					}
				}
				for (int i_4_ = 0; i_4_ < 2048; i_4_++) {
					Player class432_sub1_sub1_sub1_sub1 = client.players[i_4_];
					if (class432_sub1_sub1_sub1_sub1 != null) {
						for (int i_5_ = 0; i_5_ < (class432_sub1_sub1_sub1_sub1.aClass387Array10066).length; i_5_++)
							class432_sub1_sub1_sub1_sub1.aClass387Array10066[i_5_] = null;
					}
				}
				for (int i_6_ = 0; i_6_ < client.anInt9232 * -1183709625; i_6_++) {
					NPC class432_sub1_sub1_sub1_sub2 = ((NPC) client.aClass330_Sub35Array9015[i_6_].anObject7733);
					if (class432_sub1_sub1_sub1_sub2 != null) {
						for (int i_7_ = 0; i_7_ < (class432_sub1_sub1_sub1_sub2.aClass387Array10066).length; i_7_++)
							class432_sub1_sub1_sub1_sub2.aClass387Array10066[i_7_] = null;
					}
				}
				client.aClass497_9216.method6100(65280);
				Class361.aClass_ra3793.method4781(628001038);
				Class361.aClass_ra3793 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aey.fw(").append(')').toString());
		}
	}
}
