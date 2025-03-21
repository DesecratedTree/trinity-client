/* Class394 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class394 {
	float aFloat4070;
	float aFloat4071;
	float aFloat4072;
	float aFloat4073;
	Class260 aClass260_4074;
	int anInt4075;
	int anInt4076;
	Class92 aClass92_4077;
	float aFloat4078;
	float aFloat4079;
	int anInt4080;
	Class308 aClass308_4081;
	public static client aClient4082;

	void method4620(Class394 class394_0_, byte i) {
		try {
			((Class394) this).anInt4080 = ((Class394) class394_0_).anInt4080 * 1;
			((Class394) this).aFloat4071 = ((Class394) class394_0_).aFloat4071;
			((Class394) this).aFloat4072 = ((Class394) class394_0_).aFloat4072;
			((Class394) this).aFloat4070 = ((Class394) class394_0_).aFloat4070;
			((Class394) this).aClass260_4074.method2582(((Class394) class394_0_).aClass260_4074);
			((Class394) this).anInt4075 = ((Class394) class394_0_).anInt4075 * 1;
			((Class394) this).anInt4076 = 1 * ((Class394) class394_0_).anInt4076;
			((Class394) this).aClass92_4077 = ((Class394) class394_0_).aClass92_4077;
			((Class394) this).aFloat4073 = ((Class394) class394_0_).aFloat4073;
			((Class394) this).aFloat4079 = ((Class394) class394_0_).aFloat4079;
			((Class394) this).aFloat4078 = ((Class394) class394_0_).aFloat4078;
			((Class394) this).aClass308_4081 = ((Class394) class394_0_).aClass308_4081;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qh.j(").append(')').toString());
		}
	}

	public Class394(Buffer class330_sub46, Class389 class389) {
		method4621(class330_sub46, class389, -1336222368);
	}

	public void method4621(Buffer class330_sub46, Class389 class389, int i) {
		try {
			int i_1_ = class330_sub46.readUnsignedByte(611304848);
			if (Class448.aClass330_Sub50_5555.aClass464_Sub2_7868.method5736((byte) 0) == 1 && Class361.aClass_ra3793.cr() > 0) {
				if (0 != (i_1_ & 0x1))
					((Class394) this).anInt4080 = class330_sub46.readInt((byte) 116) * 2006064067;
				else
					((Class394) this).anInt4080 = Class389.anInt4030 * 1094759045;
				if (0 != (i_1_ & 0x2))
					((Class394) this).aFloat4071 = ((float) class330_sub46.readUnsignedShort(710869081) / 256.0F);
				else
					((Class394) this).aFloat4071 = 1.1523438F;
				if ((i_1_ & 0x4) != 0)
					((Class394) this).aFloat4072 = (float) class330_sub46.readUnsignedShort(28671638) / 256.0F;
				else
					((Class394) this).aFloat4072 = 0.69921875F;
				if (0 != (i_1_ & 0x8))
					((Class394) this).aFloat4070 = ((float) class330_sub46.readUnsignedShort(548533644) / 256.0F);
				else
					((Class394) this).aFloat4070 = 1.2F;
			} else {
				if (0 != (i_1_ & 0x1))
					class330_sub46.readInt((byte) 47);
				if (0 != (i_1_ & 0x2))
					class330_sub46.readUnsignedShort(1196205047);
				if ((i_1_ & 0x4) != 0)
					class330_sub46.readUnsignedShort(414225799);
				if ((i_1_ & 0x8) != 0)
					class330_sub46.readUnsignedShort(1242208948);
				((Class394) this).anInt4080 = 1094759045 * Class389.anInt4030;
				((Class394) this).aFloat4070 = 1.2F;
				((Class394) this).aFloat4072 = 0.69921875F;
				((Class394) this).aFloat4071 = 1.1523438F;
			}
			if ((i_1_ & 0x10) != 0)
				((Class394) this).aClass260_4074 = (Class260.method2577((float) class330_sub46.readShort(-1100583751), (float) class330_sub46.readShort(-1100583751), (float) class330_sub46.readShort(-1100583751)));
			else
				((Class394) this).aClass260_4074 = Class260.method2577(-50.0F, -60.0F, -50.0F);
			if (0 != (i_1_ & 0x20))
				((Class394) this).anInt4075 = class330_sub46.readInt((byte) 74) * 448711777;
			else
				((Class394) this).anInt4075 = Class389.anInt4032 * -796223;
			if (0 != (i_1_ & 0x40))
				((Class394) this).anInt4076 = class330_sub46.readUnsignedShort(721256539) * 1905755757;
			else
				((Class394) this).anInt4076 = 0;
			if ((i_1_ & 0x80) != 0) {
				int i_2_ = class330_sub46.readUnsignedShort(1967249978);
				int i_3_ = class330_sub46.readUnsignedShort(926325521);
				int i_4_ = class330_sub46.readUnsignedShort(238475685);
				int i_5_ = class330_sub46.readUnsignedShort(349608184);
				int i_6_ = class330_sub46.readUnsignedShort(1244404082);
				int i_7_ = class330_sub46.readUnsignedShort(1907820569);
				((Class394) this).aClass92_4077 = class389.method4579(i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, (byte) -25);
			} else
				((Class394) this).aClass92_4077 = Class389.aClass92_4018;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qh.p(").append(')').toString());
		}
	}

	public void method4622(Buffer class330_sub46, int i) {
		try {
			((Class394) this).aFloat4073 = (float) (class330_sub46.readUnsignedByte(379453161) * 8) / 255.0F;
			((Class394) this).aFloat4079 = (float) (class330_sub46.readUnsignedByte(1194215653) * 8) / 255.0F;
			((Class394) this).aFloat4078 = (float) (class330_sub46.readUnsignedByte(859528611) * 8) / 255.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qh.o(").append(')').toString());
		}
	}

	public void method4623(Buffer class330_sub46, Class389 class389, byte i) {
		try {
			int i_8_ = class330_sub46.readUnsignedShort(2143273692);
			int i_9_ = class330_sub46.readShort(-1100583751);
			int i_10_ = class330_sub46.readShort(-1100583751);
			int i_11_ = class330_sub46.readShort(-1100583751);
			int i_12_ = class330_sub46.readUnsignedShort(1319051336);
			Class406.anInt4195 = i_12_ * -1208605175;
			((Class394) this).aClass308_4081 = class389.method4587(i_8_, i_9_, i_10_, i_11_, 1286236960);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qh.s(").append(')').toString());
		}
	}

	boolean method4624(Class394 class394_13_, byte i) {
		try {
			return ((482946283 * ((Class394) this).anInt4080 == 482946283 * ((Class394) class394_13_).anInt4080) && (((Class394) this).aFloat4071 == ((Class394) class394_13_).aFloat4071) && (((Class394) class394_13_).aFloat4072 == ((Class394) this).aFloat4072) && (((Class394) class394_13_).aFloat4070 == ((Class394) this).aFloat4070) && (((Class394) this).aFloat4079 == ((Class394) class394_13_).aFloat4079) && (((Class394) class394_13_).aFloat4073 == ((Class394) this).aFloat4073) && (((Class394) class394_13_).aFloat4078 == ((Class394) this).aFloat4078) && (1843189665 * ((Class394) class394_13_).anInt4075 == 1843189665 * ((Class394) this).anInt4075) && (1946776421 * ((Class394) class394_13_).anInt4076 == ((Class394) this).anInt4076 * 1946776421) && (((Class394) this).aClass92_4077 == ((Class394) class394_13_).aClass92_4077) && (((Class394) this).aClass308_4081 == ((Class394) class394_13_).aClass308_4081));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qh.f(").append(')').toString());
		}
	}

	public Class308 method4625(byte i) {
		try {
			return ((Class394) this).aClass308_4081;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qh.w(").append(')').toString());
		}
	}

	void method4626(Class_ra class_ra, Class394 class394_14_, Class394 class394_15_, float f, int i) {
		try {
			((Class394) this).anInt4080 = Class442.method5612((482946283 * ((Class394) class394_14_).anInt4080), (482946283 * ((Class394) class394_15_).anInt4080), f * 255.0F, -1027106511) * 2006064067;
			((Class394) this).aFloat4072 = (((Class394) class394_14_).aFloat4072 + (((Class394) class394_15_).aFloat4072 - ((Class394) class394_14_).aFloat4072) * f);
			((Class394) this).aFloat4070 = (f * (((Class394) class394_15_).aFloat4070 - ((Class394) class394_14_).aFloat4070) + ((Class394) class394_14_).aFloat4070);
			((Class394) this).aFloat4071 = (f * (((Class394) class394_15_).aFloat4071 - ((Class394) class394_14_).aFloat4071) + ((Class394) class394_14_).aFloat4071);
			((Class394) this).aFloat4078 = (((Class394) class394_14_).aFloat4078 + (((Class394) class394_15_).aFloat4078 - ((Class394) class394_14_).aFloat4078) * f);
			((Class394) this).aFloat4073 = (((Class394) class394_14_).aFloat4073 + f * (((Class394) class394_15_).aFloat4073 - ((Class394) class394_14_).aFloat4073));
			((Class394) this).aFloat4079 = ((((Class394) class394_15_).aFloat4079 - ((Class394) class394_14_).aFloat4079) * f + ((Class394) class394_14_).aFloat4079);
			((Class394) this).anInt4075 = Class442.method5612((1843189665 * ((Class394) class394_14_).anInt4075), (((Class394) class394_15_).anInt4075 * 1843189665), 255.0F * f, -1027106511) * 448711777;
			((Class394) this).anInt4076 = (1905755757 * (int) ((float) ((1946776421 * ((Class394) class394_15_).anInt4076) - 1946776421 * (((Class394) class394_14_).anInt4076)) * f + (float) (1946776421 * (((Class394) class394_14_).anInt4076))));
			if (((Class394) class394_15_).aClass92_4077 != ((Class394) class394_14_).aClass92_4077)
				((Class394) this).aClass92_4077 = class_ra.cp(((Class394) class394_14_).aClass92_4077, ((Class394) class394_15_).aClass92_4077, f, ((Class394) this).aClass92_4077);
			if (((Class394) class394_15_).aClass308_4081 != ((Class394) class394_14_).aClass308_4081) {
				if (null == ((Class394) class394_14_).aClass308_4081) {
					((Class394) this).aClass308_4081 = ((Class394) class394_15_).aClass308_4081;
					if (((Class394) this).aClass308_4081 != null)
						((Class394) this).aClass308_4081.method3083((int) (f * 255.0F), 0, (short) -29335);
				} else {
					((Class394) this).aClass308_4081 = ((Class394) class394_14_).aClass308_4081;
					if (((Class394) this).aClass308_4081 != null)
						((Class394) this).aClass308_4081.method3083((int) (255.0F * f), 255, (short) -14081);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qh.i(").append(')').toString());
		}
	}

	void method4627(int i) {
		try {
			((Class394) this).anInt4080 = Class389.anInt4030 * 1094759045;
			((Class394) this).aClass260_4074 = Class260.method2577(-50.0F, -60.0F, -50.0F);
			((Class394) this).aFloat4071 = 1.1523438F;
			((Class394) this).aFloat4072 = 0.69921875F;
			((Class394) this).aFloat4070 = 1.2F;
			((Class394) this).anInt4075 = Class389.anInt4032 * -796223;
			((Class394) this).anInt4076 = 0;
			((Class394) this).aClass92_4077 = Class389.aClass92_4018;
			((Class394) this).aFloat4073 = 1.0F;
			((Class394) this).aFloat4079 = 0.25F;
			((Class394) this).aFloat4078 = 1.0F;
			((Class394) this).aClass308_4081 = Class389.aClass308_4019;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qh.r(").append(')').toString());
		}
	}

	public Class394() {
		method4627(-690027286);
	}

	public int method4628(byte i) {
		try {
			return 1843189665 * ((Class394) this).anInt4075;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qh.z(").append(')').toString());
		}
	}

	static final void method4629(Class430 class430, int i) {
		try {
			Class1 class1 = Class426.method5317(2090874676);
			Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.QUICK_CHAT_PACKET, class1.aClass488_22, 2012265974);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 10);
			int i_16_ = (class330_sub34.aClass330_Sub46_Sub2_7729.offset * -824785231);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(1, (byte) 51);
			class330_sub34.aClass330_Sub46_Sub2_7729.addShort(((Class430) class430).aClass209_4385.anInt1981 * 1955043023, (byte) 81);
			((Class430) class430).aClass209_4385.aClass330_Sub36_Sub4_1982.method3450(class330_sub34.aClass330_Sub46_Sub2_7729, ((Class430) class430).aClass209_4385.anIntArray1983, (byte) 11);
			class330_sub34.aClass330_Sub46_Sub2_7729.method3751((class330_sub34.aClass330_Sub46_Sub2_7729.offset * -824785231) - i_16_, 1286488270);
			class1.method378(class330_sub34, -1254933758);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qh.adj(").append(')').toString());
		}
	}

	static final void method4630(Class430 class430, byte i) {
		try {
			int i_17_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub3_7880.method5716(i_17_, -921769091);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qh.aqp(").append(')').toString());
		}
	}

	public static long method4631(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, byte i_23_) {
		try {
			Class528.aCalendar6217.clear();
			Class528.aCalendar6217.set(i_22_, i_21_, i_20_, i_19_, i_18_, i);
			return Class528.aCalendar6217.getTime().getTime();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qh.w(").append(')').toString());
		}
	}

	public static Class558 method4632(int i, byte i_24_) {
		try {
			Class558[] class558s = Class252.method2526((byte) 15);
			Class558[] class558s_25_ = class558s;
			for (int i_26_ = 0; i_26_ < class558s_25_.length; i_26_++) {
				Class558 class558 = class558s_25_[i_26_];
				if (((Class558) class558).anInt6416 * 1039687081 == i)
					return class558;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qh.j(").append(')').toString());
		}
	}
}
