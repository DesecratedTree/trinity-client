/* Class421 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class421 {
	public int anInt4310;
	public static int anInt4311 = 1;
	static int anInt4312 = 2;
	public int[] disabledEquipmentSlots;
	public int[] anIntArray4314;
	public static int anInt4315 = 0;
	public int anInt4316 = -1229296089;
	public int[] anIntArray4317;
	static int anInt4318;

	public Class421(IndexTable class280) {
		anInt4310 = -116583003;
		byte[] is = class280.method2761(41549091 * Class420.aClass420_4304.anInt4307, 138881788);
		method5290(new Buffer(is), (byte) 93);
		if (null == disabledEquipmentSlots)
			throw new RuntimeException("");
	}

	void method5290(Buffer class330_sub46, byte i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(-281673718);
				if (i_0_ == 0) {
					if (i <= 48)
						throw new IllegalStateException();
					break;
				}
				if (i_0_ == 1) {
					int i_1_ = class330_sub46.readUnsignedByte(1084570019);
					disabledEquipmentSlots = new int[i_1_];
					int i_2_ = 0;
					for (/**/; i_2_ < disabledEquipmentSlots.length; i_2_++) {
						disabledEquipmentSlots[i_2_] = class330_sub46.readUnsignedByte(1417909650);
						if (0 == disabledEquipmentSlots[i_2_]) {
							if (i <= 48)
								throw new IllegalStateException();
						} else if (2 == disabledEquipmentSlots[i_2_])
							continue;
					}
				} else if (3 == i_0_)
					anInt4316 = class330_sub46.readUnsignedByte(1714233563) * 1229296089;
				else if (4 == i_0_)
					anInt4310 = class330_sub46.readUnsignedByte(1654635025) * 116583003;
				else if (i_0_ == 5) {
					anIntArray4314 = new int[class330_sub46.readUnsignedByte(1358843741)];
					for (int i_3_ = 0; i_3_ < anIntArray4314.length; i_3_++)
						anIntArray4314[i_3_] = class330_sub46.readUnsignedByte(1853410600);
				} else if (6 == i_0_) {
					anIntArray4317 = new int[class330_sub46.readUnsignedByte(871826655)];
					for (int i_4_ = 0; i_4_ < anIntArray4317.length; i_4_++)
						anIntArray4317[i_4_] = class330_sub46.readUnsignedByte(811767119);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rn.r(").append(')').toString());
		}
	}

	public static String method5291(String string, char c, String string_5_, int i) {
		try {
			int i_6_ = string.length();
			int i_7_ = string_5_.length();
			int i_8_ = i_6_;
			int i_9_ = i_7_ - 1;
			if (i_9_ != 0) {
				int i_10_ = 0;
				for (;;) {
					i_10_ = string.indexOf(c, i_10_);
					if (i_10_ < 0) {
						if (i == -1390004513) {
							/* empty */
						}
						break;
					}
					i_10_++;
					i_8_ += i_9_;
				}
			}
			StringBuilder stringbuilder = new StringBuilder(i_8_);
			int i_11_ = 0;
			for (;;) {
				int i_12_ = string.indexOf(c, i_11_);
				if (i_12_ < 0) {
					if (i == -1390004513) {
						/* empty */
					}
					break;
				}
				stringbuilder.append(string.substring(i_11_, i_12_));
				stringbuilder.append(string_5_);
				i_11_ = 1 + i_12_;
			}
			stringbuilder.append(string.substring(i_11_));
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rn.x(").append(')').toString());
		}
	}

	static final void method5292(Class430 class430, int i) {
		try {
			int i_13_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_13_, 1531826820);
			Class120 class120 = Class3.aClass120Array56[i_13_ >> 16];
			Class403.method4733(iComponentDefinitions, class120, class430, 474610730);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rn.fc(").append(')').toString());
		}
	}

	public static void method5293(byte i) {
		try {
			if (1044891335 * Class352.anInt3486 != -1) {
				Class458.method5670(1044891335 * Class352.anInt3486, -1, -1, false, -527208967);
				Class352.anInt3486 = 2114381065;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rn.ci(").append(')').toString());
		}
	}

	static final void method5294(Class430 class430, int i) {
		try {
			int i_14_ = (((Class430) class430).anIntArray4394[-54918871 * ((Class430) class430).anInt4397]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = ((Player) ((Class430) class430).aClass432_Sub1_Sub1_Sub1_4396).aClass65_10249.method782(i_14_, (byte) 18);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rn.at(").append(')').toString());
		}
	}
}
