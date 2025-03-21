/* Class511 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.util.Random;

public class Class511 {
	public static int anInt5948;
	public static int[] anIntArray5949;
	static int anInt5950;
	public static Class330_Sub40_Sub4 aClass330_Sub40_Sub4_5951;
	static int anInt5952 = 12;
	static Class273 aClass273_5953 = new Class273(16, Class271.aClass271_2755);
	public static int[] anIntArray5954;
	static int anInt5955;

	public static byte[] method6176(int i, byte i_0_) {
		try {
			byte[] is = (byte[]) aClass273_5953.method2680(Integer.valueOf(i), -1987371737);
			if (is == null) {
				is = new byte[512];
				Random random = new Random((long) i);
				for (int i_1_ = 0; i_1_ < 255; i_1_++)
					is[i_1_] = (byte) i_1_;
				for (int i_2_ = 0; i_2_ < 255; i_2_++) {
					int i_3_ = 255 - i_2_;
					int i_4_ = Class9.method423(random, i_3_, (byte) -76);
					byte i_5_ = is[i_4_];
					is[i_4_] = is[i_3_];
					is[i_3_] = is[511 - i_2_] = i_5_;
				}
				aClass273_5953.method2676(Integer.valueOf(i), is, -1635122196);
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vd.j(").append(')').toString());
		}
	}

	public static Class204 method6177(Buffer class330_sub46, int i) {
		try {
			int i_6_ = class330_sub46.readBigSmart(-1760047126);
			Class195 class195 = (Class457.method5665(-1882618819)[class330_sub46.readUnsignedByte(2012445262)]);
			Class211 class211 = (Class7.method412((byte) -108)[class330_sub46.readUnsignedByte(83864914)]);
			int i_7_ = class330_sub46.readShort(-1100583751);
			int i_8_ = class330_sub46.readShort(-1100583751);
			return new Class204(i_6_, class195, class211, i_7_, i_8_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vd.r(").append(')').toString());
		}
	}

	public static void method6178(int i, int i_9_, byte i_10_) {
		try {
			if (i != -1507352525 * anInt5948) {
				anIntArray5949 = new int[i];
				for (int i_11_ = 0; i_11_ < i; i_11_++)
					anIntArray5949[i_11_] = (i_11_ << 12) / i;
				anInt5948 = i * -1881384197;
			}
			if (i_9_ != -871786603 * anInt5950) {
				if (anInt5948 * -1507352525 != i_9_) {
					anIntArray5954 = new int[i_9_];
					for (int i_12_ = 0; i_12_ < i_9_; i_12_++)
						anIntArray5954[i_12_] = (i_12_ << 12) / i_9_;
				} else
					anIntArray5954 = anIntArray5949;
				anInt5950 = -1659044931 * i_9_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vd.r(").append(')').toString());
		}
	}

	static void method6179(IndexTable class280, int musicId, int i_13_, int volume, boolean bool, long l) {
		try {
			Class475.method5941(class280, musicId, i_13_, volume, bool, l, 0, 1020645039);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vd.p(").append(')').toString());
		}
	}

	Class511() throws Throwable {
		throw new Error();
	}

	public static Class207 method6180(int i, byte i_15_) {
		try {
			Class207 class207 = (Class207) Class207.aClass367_1943.get((long) i);
			if (null != class207)
				return class207;
			byte[] is = Class207.aClass280_1942.getFile(0, i);
			class207 = new Class207();
			if (null != is)
				class207.method2190(new Buffer(is), i, -1524880943);
			Class207.aClass367_1943.put(class207, (long) i);
			return class207;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vd.j(").append(')').toString());
		}
	}

	static final void method6181(int i, Class497 class497, byte i_16_) {
		try {
			if (i != -1 && class497.method6094((long) i) == null)
				class497.method6097(new Class330(), (long) i);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vd.f(").append(')').toString());
		}
	}

	public static void method6182(Buffer class330_sub46, int i) {
		try {
			byte[] is = new byte[24];
			try {
				Class332.aClass489_6607.method6055(0L);
				Class332.aClass489_6607.method6060(is, (short) 255);
				int i_17_;
				for (i_17_ = 0; i_17_ < 24; i_17_++) {
					if (is[i_17_] != 0) {
						if (i == 1130245832)
							throw new IllegalStateException();
						break;
					}
				}
				if (i_17_ >= 24)
					throw new IOException();
			} catch (Exception exception) {
				for (int i_18_ = 0; i_18_ < 24; i_18_++)
					is[i_18_] = (byte) -1;
			}
			class330_sub46.method3749(is, 0, 24, (byte) 14);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vd.n(").append(')').toString());
		}
	}

	static final void method6183(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class422.method5296(iComponentDefinitions, class120, class430, -341598374);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vd.ig(").append(')').toString());
		}
	}

	static boolean method6184(int i) {
		try {
			return Class5.aBoolean70;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vd.s(").append(')').toString());
		}
	}

	static final void method6185(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			int i_19_ = ((((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) - 1);
			if (i_19_ < 0 || i_19_ > 9)
				((Class430) class430).anInt4378 -= 2087905371;
			else
				iComponentDefinitions.method1394(i_19_, (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]), 86971073);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vd.iu(").append(')').toString());
		}
	}

	public static void method6186(Class330 class330, Class330 class330_20_, int i) {
		try {
			if (class330.aClass330_3342 != null)
				class330.method3252(-2098604255);
			class330.aClass330_3342 = class330_20_.aClass330_3342;
			class330.aClass330_3340 = class330_20_;
			class330.aClass330_3342.aClass330_3340 = class330;
			class330.aClass330_3340.aClass330_3342 = class330;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vd.p(").append(')').toString());
		}
	}
}
