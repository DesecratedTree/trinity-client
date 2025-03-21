/* Class375 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class375 {
	static int anInt3913 = 70;
	public static int anInt3914 = -1;
	public static int anInt3915 = 0;
	public int anInt3916;
	static int anInt3917 = 16777215;
	public static int anInt3918 = 1;
	public boolean aBoolean3919 = false;
	public int anInt3920 = 281833479;
	public int anInt3921 = -90615957;
	public int anInt3922 = -622835378;
	public int anInt3923;
	int anInt3924;
	public int anInt3925;
	int anInt3926 = 1216895641;
	int anInt3927;
	Class368 aClass368_3928;
	public int anInt3929;
	String aString3930;
	public int anInt3931;
	int anInt3932;
	public static Class330_Sub51 aClass330_Sub51_3933;

	void method4346(Buffer class330_sub46, byte i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(1703899005);
				if (0 == i_0_) {
					if (i != 1) {
						/* empty */
					}
					break;
				}
				method4348(class330_sub46, i_0_, 2063937262);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pp.r(").append(')').toString());
		}
	}

	public String method4347(int i, int i_1_) {
		try {
			String string = ((Class375) this).aString3930;
			for (;;) {
				int i_2_ = string.indexOf("%1");
				if (i_2_ < 0) {
					if (i_1_ == 222966871) {
						/* empty */
					}
					break;
				}
				string = new StringBuilder().append(string.substring(0, i_2_)).append(Class76_Sub1.method886(i, false, 177889397)).append(string.substring(i_2_ + 2)).toString();
			}
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pp.i(").append(')').toString());
		}
	}

	void method4348(Buffer class330_sub46, int i, int i_3_) {
		try {
			if (i == 1)
				anInt3920 = class330_sub46.readBigSmart(-2078069175) * -281833479;
			else if (i == 2) {
				anInt3921 = class330_sub46.readUnsignedTriByte(-1401356047) * -1704546155;
				aBoolean3919 = true;
			} else if (i == 3)
				((Class375) this).anInt3926 = class330_sub46.readBigSmart(-1947376245) * -1216895641;
			else if (i == 4)
				((Class375) this).anInt3932 = class330_sub46.readBigSmart(-1199503832) * 756671549;
			else if (i == 5)
				((Class375) this).anInt3924 = class330_sub46.readBigSmart(-807083553) * 1213353249;
			else if (6 == i)
				((Class375) this).anInt3927 = class330_sub46.readBigSmart(-1993789025) * 1935391607;
			else if (7 == i)
				anInt3923 = class330_sub46.readShort(-1100583751) * 681479;
			else if (8 == i)
				((Class375) this).aString3930 = class330_sub46.readJagString((byte) 6);
			else if (9 == i)
				anInt3922 = class330_sub46.readUnsignedShort(-341402732) * -1665527891;
			else if (10 == i)
				anInt3925 = class330_sub46.readShort(-1100583751) * 800413495;
			else if (i == 11)
				anInt3929 = 0;
			else if (12 == i)
				anInt3931 = class330_sub46.readUnsignedByte(1881491178) * -1556297739;
			else if (13 == i)
				anInt3916 = class330_sub46.readShort(-1100583751) * 1593495413;
			else if (i == 14)
				anInt3929 = class330_sub46.readUnsignedShort(179940236) * -827603453;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pp.j(").append(')').toString());
		}
	}

	public Class61 method4349(Class_ra class_ra, int i) {
		try {
			if (((Class375) this).anInt3932 * 250270485 < 0)
				return null;
			Class61 class61 = ((Class61) (((Class368) ((Class375) this).aClass368_3928).aClass367_3868.get((long) (250270485 * ((Class375) this).anInt3932))));
			if (null == class61) {
				method4351(class_ra, -1056264315);
				class61 = (Class61) (((Class368) ((Class375) this).aClass368_3928).aClass367_3868.get((long) (250270485 * ((Class375) this).anInt3932)));
			}
			return class61;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pp.s(").append(')').toString());
		}
	}

	public Class61 method4350(Class_ra class_ra, byte i) {
		try {
			if (((Class375) this).anInt3927 * 1271238215 < 0)
				return null;
			Class61 class61 = ((Class61) (((Class368) ((Class375) this).aClass368_3928).aClass367_3868.get((long) (1271238215 * ((Class375) this).anInt3927))));
			if (null == class61) {
				method4351(class_ra, -1056264315);
				class61 = (Class61) (((Class368) ((Class375) this).aClass368_3928).aClass367_3868.get((long) (((Class375) this).anInt3927 * 1271238215)));
			}
			return class61;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pp.f(").append(')').toString());
		}
	}

	Class375() {
		((Class375) this).anInt3924 = -1213353249;
		((Class375) this).anInt3932 = -756671549;
		((Class375) this).anInt3927 = -1935391607;
		anInt3923 = 0;
		anInt3925 = 0;
		anInt3929 = 827603453;
		((Class375) this).aString3930 = "";
		anInt3931 = 1556297739;
		anInt3916 = 0;
	}

	void method4351(Class_ra class_ra, int i) {
		try {
			IndexTable class280 = ((Class368) ((Class375) this).aClass368_3928).aClass280_3866;
			if (310027863 * ((Class375) this).anInt3926 >= 0 && (((Class368) ((Class375) this).aClass368_3928).aClass367_3868.get((long) (310027863 * ((Class375) this).anInt3926))) == null && class280.method2750(((Class375) this).anInt3926 * 310027863, -1250408718)) {
				Class87 class87 = Class53.method640(class280, (310027863 * ((Class375) this).anInt3926));
				((Class368) ((Class375) this).aClass368_3928).aClass367_3868.put(class_ra.bw(class87, true), (long) (((Class375) this).anInt3926 * 310027863));
			}
			if (((Class375) this).anInt3924 * -142772511 >= 0 && ((((Class368) ((Class375) this).aClass368_3928).aClass367_3868.get((long) (-142772511 * ((Class375) this).anInt3924))) == null) && class280.method2750((-142772511 * ((Class375) this).anInt3924), 1787500949)) {
				Class87 class87 = Class53.method640(class280, (-142772511 * ((Class375) this).anInt3924));
				((Class368) ((Class375) this).aClass368_3928).aClass367_3868.put(class_ra.bw(class87, true), (long) (-142772511 * ((Class375) this).anInt3924));
			}
			if (((Class375) this).anInt3932 * 250270485 >= 0 && (((Class368) ((Class375) this).aClass368_3928).aClass367_3868.get((long) (250270485 * ((Class375) this).anInt3932))) == null && class280.method2750(((Class375) this).anInt3932 * 250270485, -1710823701)) {
				Class87 class87 = Class53.method640(class280, (((Class375) this).anInt3932 * 250270485));
				((Class368) ((Class375) this).aClass368_3928).aClass367_3868.put(class_ra.bw(class87, true), (long) (((Class375) this).anInt3932 * 250270485));
			}
			if (((Class375) this).anInt3927 * 1271238215 >= 0 && ((((Class368) ((Class375) this).aClass368_3928).aClass367_3868.get((long) (((Class375) this).anInt3927 * 1271238215))) == null) && class280.method2750((((Class375) this).anInt3927 * 1271238215), 2060077652)) {
				Class87 class87 = Class53.method640(class280, (1271238215 * ((Class375) this).anInt3927));
				((Class368) ((Class375) this).aClass368_3928).aClass367_3868.put(class_ra.bw(class87, true), (long) (((Class375) this).anInt3927 * 1271238215));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pp.z(").append(')').toString());
		}
	}

	public Class61 method4352(Class_ra class_ra, int i) {
		try {
			if (310027863 * ((Class375) this).anInt3926 < 0)
				return null;
			Class61 class61 = ((Class61) (((Class368) ((Class375) this).aClass368_3928).aClass367_3868.get((long) (310027863 * ((Class375) this).anInt3926))));
			if (null == class61) {
				method4351(class_ra, -1056264315);
				class61 = (Class61) (((Class368) ((Class375) this).aClass368_3928).aClass367_3868.get((long) (((Class375) this).anInt3926 * 310027863)));
			}
			return class61;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pp.p(").append(')').toString());
		}
	}

	public Class61 method4353(Class_ra class_ra, int i) {
		try {
			if (((Class375) this).anInt3924 * -142772511 < 0)
				return null;
			Class61 class61 = ((Class61) (((Class368) ((Class375) this).aClass368_3928).aClass367_3868.get((long) (((Class375) this).anInt3924 * -142772511))));
			if (class61 == null) {
				method4351(class_ra, -1056264315);
				class61 = (Class61) (((Class368) ((Class375) this).aClass368_3928).aClass367_3868.get((long) (-142772511 * ((Class375) this).anInt3924)));
			}
			return class61;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pp.o(").append(')').toString());
		}
	}

	static final void method4354(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			iComponentDefinitions.anInt1222 = 16391575 * (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			iComponentDefinitions.anInt1223 = ((((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]) * -376211351);
			Class404.method4738(iComponentDefinitions, 1853630794);
			if (0 == iComponentDefinitions.anInt1198 * 1849136745)
				Class156.method1829(class120, iComponentDefinitions, false, -1108085448);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pp.fy(").append(')').toString());
		}
	}

	static final void method4355(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class503.aString5915 != null && Class503.aString5915.equalsIgnoreCase(string))
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 1;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pp.vn(").append(')').toString());
		}
	}

	public static Class524 method4356(IndexTable class280, int i, int i_4_) {
		try {
			byte[] is = class280.method2761(i, 835736041);
			if (is == null)
				return null;
			return new Class524(is);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pp.j(").append(')').toString());
		}
	}

	static boolean method4357(int i, int i_5_) {
		try {
			return 6 == i || i == 15 || 11 == i || i == 1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pp.fr(").append(')').toString());
		}
	}

	static void method4358(Class_ra class_ra, int i, int i_6_, IComponentDefinitions iComponentDefinitions, int i_7_, int i_8_) {
		try {
			for (int i_9_ = 7; i_9_ >= 0; i_9_--) {
				for (int i_10_ = 127; i_10_ >= 0; i_10_--) {
					int i_11_ = ((i_7_ & 0x3f) << 10 | (i_9_ & 0x7) << 7 | i_10_ & 0x7f);
					Class318.method3166(false, true, -1368286637);
					int i_12_ = Console.colorArray[i_11_];
					Class95_Sub12.method1137(false, true, -1101523945);
					class_ra.B(((-681123409 * iComponentDefinitions.anInt1210 * i_10_ >> 7) + i), i_6_ + ((7 - i_9_) * (694142557 * iComponentDefinitions.anInt1348) >> 3), (-681123409 * iComponentDefinitions.anInt1210 >> 7) + 1, (iComponentDefinitions.anInt1348 * 694142557 >> 3) + 1, ~0xffffff | i_12_, 0);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pp.j(").append(')').toString());
		}
	}
}
