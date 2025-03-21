/* Class372 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class372 {
	public int anInt3870;
	public int anInt3871;
	public int anInt3872 = 677000621;
	public int anInt3873 = 486595863;
	int anInt3874;
	public int anInt3875;
	public int anInt3876;
	public int anInt3877;
	public static int anInt3878 = 0;
	public static int anInt3879 = 1;
	public static int anInt3880 = 2;
	public int anInt3881;
	public int anInt3882;
	public boolean aBoolean3883;
	public boolean aBoolean3884;
	public boolean aBoolean3885;
	public String[] aStringArray3886;
	public String aString3887;
	int anInt3888;
	int anInt3889;
	public int anInt3890 = 1581815515;
	int anInt3891;
	public int anInt3892;
	int anInt3893;
	int anInt3894;
	int anInt3895;
	int anInt3896;
	public int[] anIntArray3897;
	public int anInt3898;
	public int anInt3899;
	public int anInt3900;
	public int anInt3901;
	public int anInt3902;
	public int anInt3903;
	Class380 aClass380_3904;
	public int anInt3905;
	int anInt3906;
	Class497 aClass497_3907;
	public int[] anIntArray3908;
	public String aString3909;
	public boolean aBoolean3910;
	public int anInt3911;
	public byte[] aByteArray3912;

	void method4323(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(2000564667);
				if (i_0_ == 0) {
					if (i <= -127654579) {
						/* empty */
					}
					break;
				}
				method4330(class330_sub46, i_0_, (byte) -32);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pm.r(").append(')').toString());
		}
	}

	void method4324(byte i) {
		try {
			if (null != anIntArray3897) {
				for (int i_1_ = 0; i_1_ < anIntArray3897.length; i_1_ += 2) {
					if (anIntArray3897[i_1_] < 2083089585 * anInt3898)
						anInt3898 = anIntArray3897[i_1_] * -1838850991;
					else if (anIntArray3897[i_1_] > anInt3870 * 1744437513)
						anInt3870 = anIntArray3897[i_1_] * -64365255;
					if (anIntArray3897[i_1_ + 1] < 821827611 * anInt3899)
						anInt3899 = anIntArray3897[1 + i_1_] * -1259470317;
					else if (anIntArray3897[1 + i_1_] > anInt3892 * 1993049113)
						anInt3892 = 1910609961 * anIntArray3897[1 + i_1_];
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pm.i(").append(')').toString());
		}
	}

	Class372() {
		anInt3876 = 0;
		aBoolean3883 = true;
		aBoolean3884 = false;
		aBoolean3885 = true;
		aStringArray3886 = new String[5];
		((Class372) this).anInt3888 = -362382671;
		((Class372) this).anInt3891 = 442955573;
		((Class372) this).anInt3874 = 1923910461;
		((Class372) this).anInt3895 = 450614983;
		((Class372) this).anInt3896 = 118327061;
		anInt3898 = -308632657;
		anInt3899 = -888013331;
		anInt3870 = -2147483648;
		anInt3892 = -2147483648;
		anInt3875 = 204834757;
		anInt3881 = 1462107865;
		anInt3905 = 1489385389;
		aBoolean3910 = true;
		anInt3911 = 1428486861;
	}

	public Class61 method4325(Class_ra class_ra, boolean bool, int i) {
		try {
			int i_2_ = bool ? anInt3873 * 1889129817 : -19592741 * anInt3872;
			int i_3_ = i_2_ | 1409150453 * class_ra.anInt4226 << 29;
			Class61 class61 = (Class61) ((Class380) ((Class372) this).aClass380_3904).aClass367_3956.get((long) i_3_);
			if (class61 != null)
				return class61;
			if (!((Class380) ((Class372) this).aClass380_3904).aClass280_3955.method2750(i_2_, -2047380682))
				return null;
			Class87 class87 = Class53.method643((((Class380) (((Class372) this).aClass380_3904)).aClass280_3955), i_2_, 0);
			if (class87 != null) {
				class61 = class_ra.bw(class87, true);
				((Class380) ((Class372) this).aClass380_3904).aClass367_3956.put(class61, (long) i_3_);
			}
			return class61;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pm.o(").append(')').toString());
		}
	}

	public Class61 method4326(Class_ra class_ra, int i) {
		try {
			Class61 class61 = ((Class61) (((Class380) ((Class372) this).aClass380_3904).aClass367_3956.get((long) (((Class372) this).anInt3888 * 48918959 | 0x20000 | class_ra.anInt4226 * 1409150453 << 29))));
			if (class61 != null)
				return class61;
			((Class380) ((Class372) this).aClass380_3904).aClass280_3955.method2750(48918959 * ((Class372) this).anInt3888, -120682835);
			Class87 class87 = Class53.method643((((Class380) ((Class372) this).aClass380_3904).aClass280_3955), ((Class372) this).anInt3888 * 48918959, 0);
			if (class87 != null) {
				class61 = class_ra.bw(class87, true);
				((Class380) ((Class372) this).aClass380_3904).aClass367_3956.put(class61, (long) (((Class372) this).anInt3888 * 48918959 | 0x20000 | class_ra.anInt4226 * 1409150453 << 29));
			}
			return class61;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pm.s(").append(')').toString());
		}
	}

	public boolean method4327(Interface29 interface29, byte i) {
		try {
			int i_4_;
			if (-2039751701 * ((Class372) this).anInt3874 != -1)
				i_4_ = interface29.method306((((Class372) this).anInt3874 * -2039751701), 1619870058);
			else if (1428495587 * ((Class372) this).anInt3891 != -1)
				i_4_ = interface29.method310((1428495587 * ((Class372) this).anInt3891), -206932563);
			else
				return true;
			if (i_4_ < 1321135331 * ((Class372) this).anInt3889 || i_4_ > ((Class372) this).anInt3906 * -1889215397)
				return false;
			boolean bool = false;
			int i_5_;
			if (-1 != 2124443587 * ((Class372) this).anInt3896)
				i_5_ = interface29.method306((((Class372) this).anInt3896 * 2124443587), 1337149542);
			else if (-1 != ((Class372) this).anInt3895 * -75500279)
				i_5_ = interface29.method310((-75500279 * ((Class372) this).anInt3895), -698312864);
			else
				return true;
			if (i_5_ < -450224631 * ((Class372) this).anInt3893 || i_5_ > 1798303739 * ((Class372) this).anInt3894)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pm.p(").append(')').toString());
		}
	}

	public String method4328(int i, String string, short i_6_) {
		try {
			if (null == ((Class372) this).aClass497_3907)
				return string;
			Class330_Sub35 class330_sub35 = ((Class330_Sub35) ((Class372) this).aClass497_3907.method6094((long) i));
			if (class330_sub35 == null)
				return string;
			return (String) class330_sub35.anObject7733;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pm.z(").append(')').toString());
		}
	}

	public int method4329(int i, int i_7_, byte i_8_) {
		try {
			if (null == ((Class372) this).aClass497_3907)
				return i_7_;
			Class330_Sub23 class330_sub23 = ((Class330_Sub23) ((Class372) this).aClass497_3907.method6094((long) i));
			if (class330_sub23 == null)
				return i_7_;
			return 393599711 * class330_sub23.anInt7693;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pm.f(").append(')').toString());
		}
	}

	void method4330(Buffer class330_sub46, int i, byte i_9_) {
		try {
			if (i == 1)
				anInt3872 = class330_sub46.readBigSmart(-577601803) * -677000621;
			else if (i == 2)
				anInt3873 = class330_sub46.readBigSmart(-1908790669) * -486595863;
			else if (i == 3)
				aString3909 = class330_sub46.readString(325970162);
			else if (i == 4)
				anInt3903 = class330_sub46.readUnsignedTriByte(-1401356047) * -1318240935;
			else if (i == 5)
				anInt3890 = class330_sub46.readUnsignedTriByte(-1401356047) * -1581815515;
			else if (6 == i)
				anInt3876 = class330_sub46.readUnsignedByte(2014080775) * 1505362493;
			else if (i == 7) {
				int i_10_ = class330_sub46.readUnsignedByte(2143527396);
				if ((i_10_ & 0x1) == 0)
					aBoolean3883 = false;
				if ((i_10_ & 0x2) == 2)
					aBoolean3884 = true;
			} else if (i == 8)
				aBoolean3885 = class330_sub46.readUnsignedByte(907770993) == 1;
			else if (9 == i) {
				((Class372) this).anInt3891 = class330_sub46.readUnsignedShort(1342964642) * -442955573;
				if (65535 == ((Class372) this).anInt3891 * 1428495587)
					((Class372) this).anInt3891 = 442955573;
				((Class372) this).anInt3874 = class330_sub46.readUnsignedShort(170515208) * -1923910461;
				if (65535 == -2039751701 * ((Class372) this).anInt3874)
					((Class372) this).anInt3874 = 1923910461;
				((Class372) this).anInt3889 = class330_sub46.readInt((byte) 111) * 1761458379;
				((Class372) this).anInt3906 = class330_sub46.readInt((byte) 22) * 1180496851;
			} else if (i >= 10 && i <= 14)
				aStringArray3886[i - 10] = class330_sub46.readString(82855978);
			else if (15 == i) {
				int i_11_ = class330_sub46.readUnsignedByte(153164434);
				anIntArray3897 = new int[2 * i_11_];
				for (int i_12_ = 0; i_12_ < i_11_ * 2; i_12_++)
					anIntArray3897[i_12_] = class330_sub46.readShort(-1100583751);
				anInt3900 = class330_sub46.readInt((byte) 14) * 2141503733;
				int i_13_ = class330_sub46.readUnsignedByte(2105735674);
				anIntArray3908 = new int[i_13_];
				for (int i_14_ = 0; i_14_ < anIntArray3908.length; i_14_++)
					anIntArray3908[i_14_] = class330_sub46.readInt((byte) 43);
				aByteArray3912 = new byte[i_11_];
				for (int i_15_ = 0; i_15_ < i_11_; i_15_++)
					aByteArray3912[i_15_] = class330_sub46.readByte((byte) 77);
			} else if (i == 16)
				aBoolean3910 = false;
			else if (17 == i)
				aString3887 = class330_sub46.readString(502067190);
			else if (i == 18)
				((Class372) this).anInt3888 = class330_sub46.readBigSmart(-569831587) * 362382671;
			else if (i == 19)
				anInt3911 = class330_sub46.readUnsignedShort(140069511) * -1428486861;
			else if (i == 20) {
				((Class372) this).anInt3895 = class330_sub46.readUnsignedShort(180131240) * -450614983;
				if (65535 == ((Class372) this).anInt3895 * -75500279)
					((Class372) this).anInt3895 = 450614983;
				((Class372) this).anInt3896 = class330_sub46.readUnsignedShort(629494147) * -118327061;
				if (((Class372) this).anInt3896 * 2124443587 == 65535)
					((Class372) this).anInt3896 = 118327061;
				((Class372) this).anInt3893 = class330_sub46.readInt((byte) 19) * -2055679943;
				((Class372) this).anInt3894 = class330_sub46.readInt((byte) 123) * -381304013;
			} else if (21 == i)
				anInt3882 = class330_sub46.readInt((byte) 44) * 2090622183;
			else if (i == 22)
				anInt3902 = class330_sub46.readInt((byte) 59) * 1392471131;
			else if (i == 23) {
				anInt3875 = class330_sub46.readUnsignedByte(625213365) * -204834757;
				anInt3881 = class330_sub46.readUnsignedByte(1729049609) * -1462107865;
				anInt3905 = class330_sub46.readUnsignedByte(1156429839) * -1489385389;
			} else if (i == 24) {
				anInt3901 = class330_sub46.readShort(-1100583751) * -934666081;
				anInt3877 = class330_sub46.readShort(-1100583751) * -2136416211;
			} else if (i == 249) {
				int i_16_ = class330_sub46.readUnsignedByte(333318408);
				if (null == ((Class372) this).aClass497_3907) {
					int i_17_ = Class136.method1594(i_16_, 1578674157);
					((Class372) this).aClass497_3907 = new Class497(i_17_);
				}
				for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
					boolean bool = class330_sub46.readUnsignedByte(1846155766) == 1;
					int i_19_ = class330_sub46.readUnsignedTriByte(-1401356047);
					Class330 class330;
					if (bool)
						class330 = new Class330_Sub35(class330_sub46.readString(811077390));
					else
						class330 = new Class330_Sub23(class330_sub46.readInt((byte) 33));
					((Class372) this).aClass497_3907.method6097(class330, (long) i_19_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pm.j(").append(')').toString());
		}
	}

	static final void method4331(Class430 class430, int i) {
		try {
			int i_20_ = (((Class430) class430).anIntArray4394[-54918871 * ((Class430) class430).anInt4397]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = ((NPC) ((Class430) class430).aClass432_Sub1_Sub1_Sub1_4396).aClass67_10260.method792(i_20_, (byte) -12);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pm.aw(").append(')').toString());
		}
	}

	static final void method4332(Class430 class430, byte i) {
		try {
			int i_21_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_21_, 509679726);
			Class120 class120 = Class3.aClass120Array56[i_21_ >> 16];
			Class439.method5599(iComponentDefinitions, class120, true, 1, class430, (byte) 36);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pm.hx(").append(')').toString());
		}
	}

	static final void method4333(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_22_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_23_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			Class330_Sub36_Sub9 class330_sub36_sub9 = Class370.aClass268_6770.method2659(i_22_, 1405861724);
			int i_24_ = class330_sub36_sub9.anIntArray9684[i_23_];
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_24_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pm.acu(").append(')').toString());
		}
	}

	static final void method4334(Class430 class430, byte i) {
		try {
			Class401_Sub1.aClass145_Sub1_8249.method1686(-865924631);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pm.aiy(").append(')').toString());
		}
	}

	public static int method4335(byte i) {
		try {
			Canvas canvas = new Canvas();
			canvas.setSize(100, 100);
			Class_ra class_ra = Class95_Sub22.method1173(0, canvas, null, null, 0, -1927888963);
			long l = Class312.method3111((byte) 5);
			for (int i_25_ = 0; i_25_ < 10000; i_25_++)
				class_ra.bk(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
			int i_26_ = (int) (Class312.method3111((byte) 72) - l);
			class_ra.method4789(0, 0, 100, 100, -16777216, 463754225);
			class_ra.method4781(628001038);
			return i_26_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pm.j(").append(')').toString());
		}
	}
}
