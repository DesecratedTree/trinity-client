/* Class404 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class404 {
	public static int anInt4139 = -2;
	public static int anInt4140 = -3;
	public static int anInt4141 = -4;
	public static int anInt4142 = -5;
	public static int anInt4143 = 1;
	public static int anInt4144 = 53;
	public static int anInt4145 = 3;
	public static int anInt4146 = 6;
	public static int anInt4147 = 35;
	public static int anInt4148 = 9;
	public static int anInt4149 = 7;
	public static int anInt4150 = 21;
	public static int anInt4151 = 23;
	public static int anInt4152 = 29;
	public static int anInt4153 = 2;
	public static int anInt4154 = 45;
	public static int anInt4155 = 15;
	public static int anInt4156 = 48;
	public static int anInt4157 = 49;
	public static int anInt4158 = 52;
	public static int anInt4159 = 42;
	public static int anInt4160;
	public static int anInt4161;
	public static Class457 aClass457_4162;

	Class404() throws Throwable {
		throw new Error();
	}

	static final void method4734(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			iComponentDefinitions.aBoolean1253 = (((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]) == 1;
			method4738(iComponentDefinitions, 903695907);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qu.em(").append(')').toString());
		}
	}

	static final void method4735(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class153.method1792(iComponentDefinitions, class120, class430, -429858330);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qu.na(").append(')').toString());
		}
	}

	static final void method4736(Class430 class430, short i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, -1292339506);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = -76375931 * iComponentDefinitions.anInt1296;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qu.rk(").append(')').toString());
		}
	}

	static int method4737(CharSequence charsequence, char c, byte i) {
		try {
			int i_1_ = 0;
			int i_2_ = charsequence.length();
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
				if (charsequence.charAt(i_3_) == c)
					i_1_++;
			}
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qu.r(").append(')').toString());
		}
	}

	public static void method4738(IComponentDefinitions iComponentDefinitions, int i) {
		try {
			if (-2106964703 * iComponentDefinitions.anInt1359 == 2054732627 * client.anInt9214)
				client.aBooleanArray9230[-1533268733 * iComponentDefinitions.anInt1358] = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qu.lz(").append(')').toString());
		}
	}

	public static int method4739(int i, int i_4_) {
		try {
			double d = (double) (i >> 16 & 0xff) / 256.0;
			double d_5_ = (double) (i >> 8 & 0xff) / 256.0;
			double d_6_ = (double) (i & 0xff) / 256.0;
			double d_7_ = d;
			if (d_5_ < d_7_)
				d_7_ = d_5_;
			if (d_6_ < d_7_)
				d_7_ = d_6_;
			double d_8_ = d;
			if (d_5_ > d_8_)
				d_8_ = d_5_;
			if (d_6_ > d_8_)
				d_8_ = d_6_;
			double d_9_ = 0.0;
			double d_10_ = 0.0;
			double d_11_ = (d_8_ + d_7_) / 2.0;
			if (d_8_ != d_7_) {
				if (d_11_ < 0.5)
					d_10_ = (d_8_ - d_7_) / (d_7_ + d_8_);
				if (d_11_ >= 0.5)
					d_10_ = (d_8_ - d_7_) / (2.0 - d_8_ - d_7_);
				if (d == d_8_)
					d_9_ = (d_5_ - d_6_) / (d_8_ - d_7_);
				else if (d_5_ == d_8_)
					d_9_ = (d_6_ - d) / (d_8_ - d_7_) + 2.0;
				else if (d_8_ == d_6_)
					d_9_ = (d - d_5_) / (d_8_ - d_7_) + 4.0;
			}
			d_9_ /= 6.0;
			int i_12_ = (int) (256.0 * d_9_);
			int i_13_ = (int) (d_10_ * 256.0);
			int i_14_ = (int) (256.0 * d_11_);
			if (i_13_ < 0)
				i_13_ = 0;
			else if (i_13_ > 255)
				i_13_ = 255;
			if (i_14_ < 0)
				i_14_ = 0;
			else if (i_14_ > 255)
				i_14_ = 255;
			if (i_14_ > 243)
				i_13_ >>= 4;
			else if (i_14_ > 217)
				i_13_ >>= 3;
			else if (i_14_ > 192)
				i_13_ >>= 2;
			else if (i_14_ > 179)
				i_13_ >>= 1;
			return ((i_14_ >> 1) + ((i_13_ >> 5 << 7) + ((i_12_ & 0xff) >> 2 << 10)));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qu.n(").append(')').toString());
		}
	}
}
