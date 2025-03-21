/* Class315 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class315 {
	static Class396[] aClass396Array3257;

	abstract void method3122();

	abstract long method3123();

	abstract void method3124(byte i);

	abstract long method3125(byte i);

	abstract int method3126(long l);

	abstract void method3127();

	Class315() {
		/* empty */
	}

	abstract void method3128();

	abstract void method3129();

	abstract long method3130();

	abstract long method3131();

	abstract int method3132(long l);

	abstract long method3133();

	abstract long method3134(int i);

	final int method3135(long l) {
		try {
			long l_0_ = method3125((byte) 1);
			if (l_0_ > 0L)
				Class464_Sub21.method5813(l_0_);
			return method3126(l);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nc.j(").append(')').toString());
		}
	}

	static final void method3136(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class128.method1554(iComponentDefinitions, class120, class430, 2001768343);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nc.js(").append(')').toString());
		}
	}

	static final void method3137(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_1_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_2_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_1_ | i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nc.zq(").append(')').toString());
		}
	}

	static final void method3138(Class430 class430, int i) throws Exception_Sub4 {
		try {
			((Class430) class430).anInt4376 -= 124953757;
			int i_3_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_4_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			int i_5_ = (((Class430) class430).anIntArray4387[2 + ((Class430) class430).anInt4376 * 1632830751]);
			float f = (float) (2.0 * Math.atan((double) ((float) i_3_ / 2.0F / (float) i_5_)));
			float f_6_ = (float) (2.0 * Math.atan((double) ((float) i_4_ / 2.0F / (float) i_5_)));
			Class401_Sub1.aClass145_Sub1_8249.method1690(f, f_6_, -1943771105);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nc.ahe(").append(')').toString());
		}
	}

	static void method3139(IComponentDefinitions iComponentDefinitions, Class_ta class_ta, int i, int i_7_, int i_8_, int i_9_, int i_10_, String string, Class263 class263, Class524 class524, int i_11_, int i_12_) {
		try {
			int i_13_;
			if (5 == -1551406343 * Class147.anInt1621)
				i_13_ = (int) client.aFloat9141 & 0x3fff;
			else
				i_13_ = ((int) client.aFloat9141 + client.anInt9149 * -603680235 & 0x3fff);
			int i_14_ = (Math.max(-681123409 * iComponentDefinitions.anInt1210 / 2, iComponentDefinitions.anInt1348 * 694142557 / 2) + 10);
			int i_15_ = i_8_ * i_8_ + i_9_ * i_9_;
			if (i_15_ <= i_14_ * i_14_) {
				int i_16_ = Class257.anIntArray2683[i_13_];
				int i_17_ = Class257.anIntArray2684[i_13_];
				if (-1551406343 * Class147.anInt1621 != 5) {
					i_16_ = 256 * i_16_ / (256 + 1113850905 * client.anInt9063);
					i_17_ = i_17_ * 256 / (client.anInt9063 * 1113850905 + 256);
				}
				int i_18_ = i_17_ * i_8_ + i_16_ * i_9_ >> 14;
				int i_19_ = i_17_ * i_9_ - i_8_ * i_16_ >> 14;
				int i_20_ = class524.method6246(string, 100, null, (byte) 63);
				int i_21_ = class524.method6247(string, 100, 0, null, 992044790);
				i_18_ -= i_20_ / 2;
				if (i_18_ >= -(-681123409 * iComponentDefinitions.anInt1210) && i_18_ <= -681123409 * iComponentDefinitions.anInt1210 && i_19_ >= -(694142557 * iComponentDefinitions.anInt1348) && i_19_ <= iComponentDefinitions.anInt1348 * 694142557)
					class263.method2613(string, (-681123409 * iComponentDefinitions.anInt1210 / 2 + (i + i_18_)), (i_7_ + iComponentDefinitions.anInt1348 * 694142557 / 2 - i_19_ - i_10_ - i_21_), i_20_, 50, i_11_, 0, 1, 0, 0, null, null, class_ta, i, i_7_, (byte) 7);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nc.g(").append(')').toString());
		}
	}

	static Class201 method3140(Buffer class330_sub46, byte i) {
		try {
			Class195 class195 = (Class457.method5665(-1882618819)[class330_sub46.readUnsignedByte(1574690307)]);
			Class211 class211 = (Class7.method412((byte) -11)[class330_sub46.readUnsignedByte(-313066287)]);
			int i_22_ = class330_sub46.readShort(-1100583751);
			int i_23_ = class330_sub46.readShort(-1100583751);
			int i_24_ = class330_sub46.readUnsignedShort(1726962080);
			int i_25_ = class330_sub46.readUnsignedShort(-47446329);
			int i_26_ = class330_sub46.readShort(-1100583751);
			int i_27_ = class330_sub46.readBigSmart(-1494086047);
			int i_28_ = class330_sub46.readInt((byte) 13);
			return new Class201(class195, class211, i_22_, i_23_, i_24_, i_25_, i_26_, i_27_, i_28_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nc.r(").append(')').toString());
		}
	}
}
