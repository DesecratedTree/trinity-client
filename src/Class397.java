/* Class397 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public abstract class Class397 {
	long aLong4109;
	long aLong4110;
	Class471 aClass471_4111 = new Class471();
	int anInt4112;
	int anInt4113;

	void method4656(int i) {
		try {
			if (method4663(-136796357)) {
				Class330_Sub34 class330_sub34 = null;
				int i_0_ = 0;
				int i_1_ = 0;
				int i_2_ = 0;
				Iterator iterator = ((Class397) this).aClass471_4111.iterator();
				while (iterator.hasNext()) {
					Class330_Sub44 class330_sub44 = (Class330_Sub44) iterator.next();
					if (null != class330_sub34 && (-824785231 * (class330_sub34.aClass330_Sub46_Sub2_7729.offset) - i_0_) >= 252 - (6 + method4660(733068164))) {
						if (i == 35438517) {
							/* empty */
						}
						break;
					}
					class330_sub44.method3252(-495503643);
					int i_3_ = class330_sub44.method3711(505802267);
					if (i_3_ < -1)
						i_3_ = -1;
					else if (i_3_ > 65534)
						i_3_ = 65534;
					int i_4_ = class330_sub44.method3710((byte) -92);
					if (i_4_ < -1)
						i_4_ = -1;
					else if (i_4_ > 65534)
						i_4_ = 65534;
					if (((Class397) this).anInt4112 * -1192266825 == i_4_ && ((Class397) this).anInt4113 * 2090226447 == i_3_)
						class330_sub44.method3714(-585860093);
					else {
						if (null == class330_sub34) {
							class330_sub34 = method4664(473915597);
							class330_sub34.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 53);
							i_0_ = -824785231 * (class330_sub34.aClass330_Sub46_Sub2_7729.offset);
							class330_sub34.aClass330_Sub46_Sub2_7729.offset += 647201954;
							i_1_ = 0;
							i_2_ = 0;
						}
						int i_5_;
						int i_6_;
						int i_7_;
						if (8681372172046252423L * ((Class397) this).aLong4109 != -1L) {
							i_5_ = i_4_ - (((Class397) this).anInt4112 * -1192266825);
							i_6_ = i_3_ - (((Class397) this).anInt4113 * 2090226447);
							i_7_ = (int) ((class330_sub44.method3724(-2040230020) - (8681372172046252423L * ((Class397) this).aLong4109)) / 20L);
							i_1_ += (class330_sub44.method3724(1639110254) - (8681372172046252423L * ((Class397) this).aLong4109)) % 20L;
						} else {
							i_5_ = i_4_;
							i_6_ = i_3_;
							i_7_ = 2147483647;
						}
						((Class397) this).anInt4112 = -2107188729 * i_4_;
						((Class397) this).anInt4113 = i_3_ * 1027357679;
						if (i_7_ < 8 && i_5_ >= -32 && i_5_ <= 31 && i_6_ >= -32 && i_6_ <= 31) {
							i_5_ += 32;
							i_6_ += 32;
							class330_sub34.aClass330_Sub46_Sub2_7729.addShort(i_6_ + ((i_5_ << 6) + (i_7_ << 12)), (byte) 63);
						} else if (i_7_ < 32 && i_5_ >= -128 && i_5_ <= 127 && i_6_ >= -128 && i_6_ <= 127) {
							i_5_ += 128;
							i_6_ += 128;
							class330_sub34.aClass330_Sub46_Sub2_7729.addByte(i_7_ + 128, (byte) 57);
							class330_sub34.aClass330_Sub46_Sub2_7729.addShort(i_6_ + (i_5_ << 8), (byte) 95);
						} else if (i_7_ < 32) {
							class330_sub34.aClass330_Sub46_Sub2_7729.addByte(192 + i_7_, (byte) 37);
							if (-1 == i_4_ || -1 == i_3_)
								class330_sub34.aClass330_Sub46_Sub2_7729.addInt(-2147483648, 1965508160);
							else
								class330_sub34.aClass330_Sub46_Sub2_7729.addInt(i_4_ | i_3_ << 16, 1965508160);
						} else {
							class330_sub34.aClass330_Sub46_Sub2_7729.addShort(57344 + (i_7_ & 0x1fff), (byte) 24);
							if (-1 == i_4_ || i_3_ == -1)
								class330_sub34.aClass330_Sub46_Sub2_7729.addInt(-2147483648, 1965508160);
							else
								class330_sub34.aClass330_Sub46_Sub2_7729.addInt(i_4_ | i_3_ << 16, 1965508160);
						}
						i_2_++;
						method4661(class330_sub34.aClass330_Sub46_Sub2_7729, class330_sub44, (byte) -65);
						((Class397) this).aLong4109 = (class330_sub44.method3724(178194263) * 2239718308571069495L);
						class330_sub44.method3714(-1011690686);
					}
				}
				if (null != class330_sub34) {
					class330_sub34.aClass330_Sub46_Sub2_7729.method3751(-824785231 * (class330_sub34.aClass330_Sub46_Sub2_7729.offset) - i_0_, -681932400);
					int i_8_ = (class330_sub34.aClass330_Sub46_Sub2_7729.offset * -824785231);
					class330_sub34.aClass330_Sub46_Sub2_7729.offset = i_0_ * 323600977;
					class330_sub34.aClass330_Sub46_Sub2_7729.addByte(i_1_ / i_2_, (byte) 66);
					class330_sub34.aClass330_Sub46_Sub2_7729.addByte(i_1_ % i_2_, (byte) 62);
					class330_sub34.aClass330_Sub46_Sub2_7729.offset = 323600977 * i_8_;
					client.aClass1_9025.method378(class330_sub34, -862066837);
				}
			}
			method4662(579715627);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qk.r(").append(')').toString());
		}
	}

	abstract Class330_Sub34 method4657();

	abstract void method4658(Buffer class330_sub46, Class330_Sub44 class330_sub44);

	int method4659(Class330_Sub44 class330_sub44, int i, int i_9_) {
		try {
			long l;
			if (((Class397) this).aLong4110 * 5668916175289180147L == -1L)
				l = (long) i;
			else {
				l = (class330_sub44.method3724(-1517548867) - ((Class397) this).aLong4110 * 5668916175289180147L);
				if (l > (long) i)
					l = (long) i;
			}
			((Class397) this).aLong4110 = (class330_sub44.method3724(-534298900) * -5123444428344471237L);
			return (int) l;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qk.p(").append(')').toString());
		}
	}

	abstract int method4660(int i);

	abstract void method4661(Buffer class330_sub46, Class330_Sub44 class330_sub44, byte i);

	abstract void method4662(int i);

	abstract boolean method4663(int i);

	abstract Class330_Sub34 method4664(int i);

	abstract void method4665();

	abstract void method4666();

	abstract boolean method4667();

	abstract boolean method4668();

	void method4669(int i) {
		try {
			((Class397) this).aClass471_4111.method5866(613065745);
			((Class397) this).aLong4110 = 5123444428344471237L;
			((Class397) this).aLong4109 = -2239718308571069495L;
			((Class397) this).anInt4112 = 2107188729;
			((Class397) this).anInt4113 = -1027357679;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qk.j(").append(')').toString());
		}
	}

	abstract int method4670();

	abstract int method4671();

	abstract void method4672(Buffer class330_sub46, Class330_Sub44 class330_sub44);

	void method4673(Class330_Sub44 class330_sub44, byte i) {
		try {
			((Class397) this).aClass471_4111.method5878(class330_sub44, (short) 8192);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qk.i(").append(')').toString());
		}
	}

	abstract void method4674();

	Class397() {
		((Class397) this).aLong4110 = 5123444428344471237L;
		((Class397) this).aLong4109 = -2239718308571069495L;
		((Class397) this).anInt4112 = 2107188729;
		((Class397) this).anInt4113 = -1027357679;
	}

	abstract Class330_Sub34 method4675();

	abstract void method4676(Buffer class330_sub46, Class330_Sub44 class330_sub44);

	static final void method4677(Class430 class430, int i) {
		try {
			int i_10_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_10_, -1535049165);
			Class120 class120 = Class3.aClass120Array56[i_10_ >> 16];
			Class404.method4734(iComponentDefinitions, class120, class430, 2137973521);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qk.eh(").append(')').toString());
		}
	}

	public static Class487 method4678(String string, int i, int i_11_) {
		try {
			Class487_Sub1 class487_sub1 = new Class487_Sub1();
			((Class487) class487_sub1).aString5827 = string;
			((Class487) class487_sub1).anInt5826 = 844913665 * i;
			return class487_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qk.r(").append(')').toString());
		}
	}

	static short[][] method4679(float[][] fs, short[][] is, byte i) {
		try {
			for (int i_12_ = 0; i_12_ < fs.length; i_12_++) {
				for (int i_13_ = 0; i_13_ < is[i_12_].length; i_13_++)
					is[i_12_][i_13_] = (short) (int) (fs[i_12_][i_13_] * 16383.0F);
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qk.n(").append(')').toString());
		}
	}
}
