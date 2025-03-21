/* Class201_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class201_Sub1 extends Class201 {
	public int anInt8935;
	public int anInt8936;

	public Class198 method161() {
		return Class198.aClass198_1922;
	}

	public Class198 method159(byte i) {
		try {
			return Class198.aClass198_1922;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abg.j(").append(')').toString());
		}
	}

	public Class198 method160() {
		return Class198.aClass198_1922;
	}

	Class201_Sub1(Class195 class195, Class211 class211, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		super(class195, class211, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
		anInt8936 = i_7_ * 526207693;
		anInt8935 = 1958850271 * i_8_;
	}

	static void method2166(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abg.r(").append(')').toString());
		}
	}

	static final void method2167(Class430 class430, byte i) {
		try {
			int i_9_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_9_, 798051424);
			Class120 class120 = Class3.aClass120Array56[i_9_ >> 16];
			Class154.method1818(iComponentDefinitions, class120, class430, (byte) 6);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abg.mv(").append(')').toString());
		}
	}

	static final void method2168(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			if (-1 != iComponentDefinitions.anInt1335 * -1053848421)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 115606283 * iComponentDefinitions.anInt1336;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abg.qq(").append(')').toString());
		}
	}

	static void method2169(IComponentDefinitions iComponentDefinitions, Class122 class122, int i, int i_10_, int i_11_, int i_12_, int i_13_, long l) {
		try {
			int i_14_ = i_11_ * i_11_ + i_12_ * i_12_;
			if ((long) i_14_ <= l) {
				int i_15_;
				if (-1551406343 * Class147.anInt1621 == 5)
					i_15_ = (int) client.aFloat9141 & 0x3fff;
				else
					i_15_ = (-603680235 * client.anInt9149 + (int) client.aFloat9141) & 0x3fff;
				int i_16_ = Class257.anIntArray2683[i_15_];
				int i_17_ = Class257.anIntArray2684[i_15_];
				if (5 != Class147.anInt1621 * -1551406343) {
					i_16_ = 256 * i_16_ / (256 + 1113850905 * client.anInt9063);
					i_17_ = i_17_ * 256 / (256 + client.anInt9063 * 1113850905);
				}
				int i_18_ = i_16_ * i_12_ + i_11_ * i_17_ >> 14;
				int i_19_ = i_12_ * i_17_ - i_16_ * i_11_ >> 14;
				Class61 class61 = Class12.aClass61Array10077[i_13_];
				int i_20_ = class61.method681();
				int i_21_ = class61.method682();
				int i_22_ = i_18_ + iComponentDefinitions.anInt1210 * -681123409 / 2 - i_20_ / 2;
				int i_23_ = i_20_ + i_22_;
				int i_24_ = -i_19_ + 694142557 * iComponentDefinitions.anInt1348 / 2 - i_21_;
				int i_25_ = i_21_ + i_24_;
				if (!class122.method1450(i_22_, i_24_, (byte) 111) || !class122.method1450(i_23_, i_24_, (byte) -55) || !class122.method1450(i_22_, i_25_, (byte) -22) || !class122.method1450(i_23_, i_25_, (byte) 17)) {
					double d = Math.atan2((double) i_18_, (double) i_19_);
					int i_26_ = Math.min(-681123409 * iComponentDefinitions.anInt1210 / 2, iComponentDefinitions.anInt1348 * 694142557 / 2);
					i_26_ -= 6;
					int i_27_ = (int) (Math.sin(d) * (double) i_26_);
					int i_28_ = (int) (Math.cos(d) * (double) i_26_);
					Class231.aClass61Array6766[i_13_].method695((float) i_27_ + ((float) i + (float) (iComponentDefinitions.anInt1210 * -681123409) / 2.0F), ((float) (iComponentDefinitions.anInt1348 * 694142557) / 2.0F + (float) i_10_ - (float) i_28_), 4096, (int) (65535.0 * (-d / 6.283185307179586)));
				} else
					class61.method689(i + i_22_, i_24_ + i_10_, class122.aClass_ta1408, i, i_10_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abg.u(").append(')').toString());
		}
	}
}
