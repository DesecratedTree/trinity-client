/* Class546 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class546 {
	int anInt6258;
	static int anInt6259 = 0;
	Class539[] aClass539Array6260;
	IndexTable aClass280_6261;

	Class539 method6350(int i, int i_0_, byte i_1_) {
		try {
			if (-1 == ((Class546) this).anInt6258 * -2052203573)
				return new Class539(false, new Class548[0]);
			Class548 class548 = new Class548(((Class546) this).anInt6258 * -2052203573, i, i_0_);
			return new Class539(false, new Class548[] { class548 });
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wp.r(").append(')').toString());
		}
	}

	public Class542 method6351(int i, int i_2_) {
		try {
			byte[] is = ((Class546) this).aClass280_6261.getFile(i, 0);
			Class542 class542 = new Class542();
			class542.method6335(new Buffer(is), 1859886289);
			return class542;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wp.j(").append(')').toString());
		}
	}

	public Class548[] method6352(int i, byte i_3_) {
		try {
			if (i < 0 || i >= ((Class546) this).aClass539Array6260.length)
				return (((Class539) method6350(0, 0, (byte) 7)).aClass548Array6246);
			Class539 class539 = ((Class546) this).aClass539Array6260[i];
			if (!((Class539) class539).aBoolean6245 || ((Class539) class539).aClass548Array6246.length <= 1)
				return ((Class539) class539).aClass548Array6246;
			int i_4_ = ((Class546) this).anInt6258 * -2052203573 == -1 ? 0 : 1;
			Random random = new Random();
			Class548[] class548s = (new Class548[((Class539) class539).aClass548Array6246.length]);
			System.arraycopy(((Class539) class539).aClass548Array6246, 0, class548s, 0, class548s.length);
			for (int i_5_ = i_4_; i_5_ < class548s.length; i_5_++) {
				int i_6_ = (Class9.method423(random, class548s.length - i_4_, (byte) -57) + i_4_);
				Class548 class548 = ((Class539) class539).aClass548Array6246[i_5_];
				class548s[i_5_] = class548s[i_6_];
				class548s[i_6_] = class548;
			}
			return class548s;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wp.i(").append(')').toString());
		}
	}

	public boolean method6353(int i) {
		try {
			return -2052203573 * ((Class546) this).anInt6258 != -1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wp.p(").append(')').toString());
		}
	}

	public Class546(Class435 class435, Class454 class454, IndexTable class280) {
		((Class546) this).aClass280_6261 = class280;
		Buffer class330_sub46 = new Buffer(((Class546) this).aClass280_6261.getFile(0, 0));
		int i = ((class330_sub46.payload == null || class330_sub46.payload.length < 1) ? -1 : class330_sub46.readUnsignedByte(1910478454));
		if (i < 4) {
			((Class546) this).aClass539Array6260 = new Class539[0];
			((Class546) this).anInt6258 = -457503203;
		} else {
			int i_7_ = class330_sub46.readUnsignedByte(-59563274);
			Class198[] class198s = Class477.method5991(-1913687013);
			boolean bool = true;
			if (i_7_ != class198s.length)
				bool = false;
			else {
				for (int i_8_ = 0; i_8_ < class198s.length; i_8_++) {
					int i_9_ = class330_sub46.readUnsignedByte(1936332582);
					if (class198s[i_8_].anInt1924 * -1733542099 != i_9_) {
						bool = false;
						break;
					}
				}
			}
			if (bool) {
				int i_10_ = class330_sub46.readUnsignedByte(946016435);
				int i_11_ = class330_sub46.readUnsignedByte(271665175);
				int i_12_;
				int i_13_;
				if (i > 2) {
					((Class546) this).anInt6258 = class330_sub46.readShort(-1100583751) * 457503203;
					i_12_ = class330_sub46.readUnsignedTriByte(-1401356047);
					i_13_ = class330_sub46.readUnsignedShort(1753303885);
				} else {
					((Class546) this).anInt6258 = -457503203;
					i_12_ = 0;
					i_13_ = 0;
				}
				((Class546) this).aClass539Array6260 = new Class539[i_11_ + 1];
				for (int i_14_ = 0; i_14_ < i_10_; i_14_++) {
					int i_15_ = class330_sub46.readUnsignedByte(1879415788);
					boolean bool_16_ = class330_sub46.readUnsignedByte(1787680740) == 1;
					int i_17_ = class330_sub46.readUnsignedShort(88583319);
					Class548[] class548s;
					if (-1 == -2052203573 * ((Class546) this).anInt6258) {
						class548s = new Class548[i_17_];
						for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
							int i_19_ = class330_sub46.readUnsignedShort(849943233);
							int i_20_ = class330_sub46.readUnsignedTriByte(-1401356047);
							int i_21_ = class330_sub46.readUnsignedShort(463511609);
							class548s[i_18_] = new Class548(i_19_, i_20_, i_21_);
						}
						((Class546) this).aClass539Array6260[i_15_] = new Class539(bool_16_, class548s);
					} else {
						class548s = new Class548[i_17_ + 1];
						class548s[0] = new Class548((-2052203573 * ((Class546) this).anInt6258), i_12_, i_13_);
						for (int i_22_ = 0; i_22_ < i_17_; i_22_++) {
							int i_23_ = class330_sub46.readUnsignedShort(-426081100);
							int i_24_ = class330_sub46.readUnsignedTriByte(-1401356047);
							int i_25_ = class330_sub46.readUnsignedShort(-361614569);
							class548s[i_22_ + 1] = new Class548(i_23_, i_24_, i_25_);
						}
					}
					((Class546) this).aClass539Array6260[i_15_] = new Class539(bool_16_, class548s);
				}
				for (int i_26_ = 0; i_26_ < i_11_ + 1; i_26_++) {
					if (null == ((Class546) this).aClass539Array6260[i_26_])
						((Class546) this).aClass539Array6260[i_26_] = method6350(i_12_, i_13_, (byte) 16);
				}
			} else {
				((Class546) this).aClass539Array6260 = new Class539[0];
				((Class546) this).anInt6258 = -457503203;
			}
		}
	}

	public static boolean method6354(IndexTable class280, IndexTable class280_27_, IndexTable class280_28_, Class330_Sub40_Sub2 class330_sub40_sub2, Class296 class296, int i) {
		try {
			Class110.aClass280_1160 = class280;
			Class110.aClass280_1153 = class280_27_;
			Class110.aClass280_1154 = class280_28_;
			Class110.aClass330_Sub40_Sub2_1155 = class330_sub40_sub2;
			Class539.aClass296_6244 = class296;
			Class85.anIntArray711 = new int[16];
			for (int i_29_ = 0; i_29_ < 16; i_29_++)
				Class85.anIntArray711[i_29_] = 255;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wp.r(").append(')').toString());
		}
	}
}
