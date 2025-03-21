/* Class150_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class150_Sub2 extends Class150 {
	Class123 aClass123_7267;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7268;
	Class105 aClass105_7269;
	public static int anInt7270;
	public static Class61 aClass61_7271;

	boolean method1770(int i) throws Exception_Sub2 {
		try {
			((Class150_Sub2) this).aClass105_7269 = aClass_ra_Sub2_1625.method4888("BatchedSprite");
			((Class150_Sub2) this).aClass330_Sub15_Sub1_7268 = ((Class150_Sub2) this).aClass105_7269.method1295("SpriteSampler", (byte) -48);
			((Class150_Sub2) this).aClass123_7267 = ((Class150_Sub2) this).aClass105_7269.method1254("Normal", -154624755);
			((Class150_Sub2) this).aClass105_7269.method1258(((Class150_Sub2) this).aClass123_7267);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aax.i(").append(')').toString());
		}
	}

	public Class150_Sub2(Class_ra_Sub2 class_ra_sub2) throws Exception_Sub2 {
		super(class_ra_sub2);
		method1770(361672607);
	}

	public void method1768() {
		try {
			((Class150_Sub2) this).aClass105_7269.method1249();
			((Class150_Sub2) this).aClass105_7269.method1270(((Class150_Sub2) this).aClass330_Sub15_Sub1_7268, 0, anInterface11_Impl3_1624, (byte) 47);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aax.r(").append(')').toString());
		}
	}

	public void method1769() {
		((Class150_Sub2) this).aClass105_7269.method1249();
		((Class150_Sub2) this).aClass105_7269.method1270(((Class150_Sub2) this).aClass330_Sub15_Sub1_7268, 0, anInterface11_Impl3_1624, (byte) 117);
	}

	public static final void method1771(int i) {
		try {
			String string = (null != Class19.aString243 ? Class19.aString243 : Class228.method2315(-997158659));
			Class532.openLink(string, false, Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-924684780) == 5, client.aBoolean9042, client.aBoolean8966, 1546339936);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aax.ft(").append(')').toString());
		}
	}

	public static void method1772(Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1, int[] is, int i, boolean bool, byte i_0_) {
		try {
			if (null != class432_sub1_sub1_sub1.anIntArray10030) {
				boolean bool_1_ = true;
				for (int i_2_ = 0; i_2_ < class432_sub1_sub1_sub1.anIntArray10030.length; i_2_++) {
					if (is[i_2_] != class432_sub1_sub1_sub1.anIntArray10030[i_2_]) {
						bool_1_ = false;
						break;
					}
				}
				Class477 class477 = class432_sub1_sub1_sub1.aClass477_10032;
				if (bool_1_ && class477.method5966(-262563346)) {
					Class440 class440 = class432_sub1_sub1_sub1.aClass477_10032.method5986((byte) -83);
					int i_3_ = -2030693815 * class440.anInt4472;
					if (1 == i_3_)
						class477.method5989(i, -1634891627);
					if (i_3_ == 2)
						class477.method5980((byte) 56);
				}
			}
			boolean bool_4_ = true;
			for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
				if (is[i_5_] != -1)
					bool_4_ = false;
				if (class432_sub1_sub1_sub1.anIntArray10030 == null || -1 == class432_sub1_sub1_sub1.anIntArray10030[i_5_] || ((Class201.aClass436_6511.method5570(is[i_5_], -185548523).anInt4470) * -233463405 >= (Class201.aClass436_6511.method5570(class432_sub1_sub1_sub1.anIntArray10030[i_5_], 921514568).anInt4470) * -233463405)) {
					class432_sub1_sub1_sub1.anIntArray10030 = is;
					class432_sub1_sub1_sub1.aClass477_10032.method5968(i, -1958240973);
					if (bool)
						class432_sub1_sub1_sub1.anInt10006 = -443009881 * class432_sub1_sub1_sub1.anInt10056;
				}
			}
			if (bool_4_) {
				class432_sub1_sub1_sub1.anIntArray10030 = is;
				class432_sub1_sub1_sub1.aClass477_10032.method5968(i, -1958240973);
				if (bool)
					class432_sub1_sub1_sub1.anInt10006 = class432_sub1_sub1_sub1.anInt10056 * -443009881;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aax.kv(").append(')').toString());
		}
	}

	static final void method1773(Class430 class430, int i) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub26_7901, (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]), -1715859229);
			Class435.method5568(1149899447);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aax.aku(").append(')').toString());
		}
	}
}
