/* Class524 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;
import java.awt.Rectangle;

public class Class524 {
	public int anInt6030;
	byte[][] aByteArrayArray6031;
	static String[] aStringArray6032 = new String[100];
	public int anInt6033;
	byte[] aByteArray6034;
	public int anInt6035;

	Class524(byte[] is) {
		Buffer class330_sub46 = new Buffer(is);
		int i = class330_sub46.readUnsignedByte(73371845);
		if (i != 0)
			throw new RuntimeException("");
		boolean bool = class330_sub46.readUnsignedByte(1853911395) == 1;
		((Class524) this).aByteArray6034 = new byte[256];
		class330_sub46.readBytes(((Class524) this).aByteArray6034, 0, 256, 1274334002);
		if (bool) {
			int[] is_0_ = new int[256];
			int[] is_1_ = new int[256];
			for (int i_2_ = 0; i_2_ < 256; i_2_++)
				is_0_[i_2_] = class330_sub46.readUnsignedByte(404093276);
			for (int i_3_ = 0; i_3_ < 256; i_3_++)
				is_1_[i_3_] = class330_sub46.readUnsignedByte(1799313809);
			byte[][] is_4_ = new byte[256][];
			for (int i_5_ = 0; i_5_ < 256; i_5_++) {
				is_4_[i_5_] = new byte[is_0_[i_5_]];
				byte i_6_ = 0;
				for (int i_7_ = 0; i_7_ < is_4_[i_5_].length; i_7_++) {
					i_6_ += class330_sub46.readByte((byte) -4);
					is_4_[i_5_][i_7_] = i_6_;
				}
			}
			byte[][] is_8_ = new byte[256][];
			for (int i_9_ = 0; i_9_ < 256; i_9_++) {
				is_8_[i_9_] = new byte[is_0_[i_9_]];
				byte i_10_ = 0;
				for (int i_11_ = 0; i_11_ < is_8_[i_9_].length; i_11_++) {
					i_10_ += class330_sub46.readByte((byte) -22);
					is_8_[i_9_][i_11_] = i_10_;
				}
			}
			((Class524) this).aByteArrayArray6031 = new byte[256][256];
			for (int i_12_ = 0; i_12_ < 256; i_12_++) {
				if (i_12_ != 32) {
					for (int i_13_ = 0; i_13_ < 256; i_13_++) {
						if (i_13_ != 32)
							((Class524) this).aByteArrayArray6031[i_12_][i_13_] = (byte) Class105.method1310(is_4_, is_8_, is_1_, (((Class524) this).aByteArray6034), is_0_, i_12_, i_13_, (byte) -40);
					}
				}
			}
			anInt6030 = -1700956515 * (is_1_[32] + is_0_[32]);
		} else
			anInt6030 = class330_sub46.readUnsignedByte(-39509533) * -1700956515;
		class330_sub46.readUnsignedByte(672795436);
		class330_sub46.readUnsignedByte(-129219704);
		anInt6033 = class330_sub46.readUnsignedByte(1632989591) * 1989764275;
		anInt6035 = class330_sub46.readUnsignedByte(1635495176) * 1214073253;
	}

	public int method6240(String string, int i) {
		try {
			return method6248(string, null, -1774747465);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vs.s(").append(')').toString());
		}
	}

	public int method6241(int i, int i_14_) {
		try {
			return ((Class524) this).aByteArray6034[i] & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vs.o(").append(')').toString());
		}
	}

	public Point method6242(String string, int i, int i_15_, int i_16_, Interface30[] interface30s, int i_17_) {
		try {
			if (i_16_ <= 0)
				return new Point(0, -2093225349 * anInt6033 + i_15_);
			if (i_16_ > string.length())
				i_16_ = string.length();
			if (i_15_ == 0)
				i_15_ = anInt6030 * 35438517;
			int i_18_ = method6245(string, new int[] { i }, aStringArray6032, interface30s, false, -1743176441);
			int i_19_ = 0;
			for (int i_20_ = 0; i_20_ < i_18_; i_20_++) {
				int i_21_ = aStringArray6032[i_20_].length();
				if (i_21_ + i_19_ > i_16_ || i_20_ == i_18_ - 1 && i_16_ == string.length()) {
					String string_22_ = string.substring(i_19_, i_16_);
					if (string_22_.endsWith("<br>")) {
						string_22_ = "";
						i_19_ += i_21_;
						i_20_++;
					}
					int i_23_ = method6248(string_22_, interface30s, -1867621405);
					int i_24_ = i_20_ * i_15_ + -2093225349 * anInt6033;
					return new Point(i_23_, i_24_);
				}
				i_19_ += i_21_;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vs.q(").append(')').toString());
		}
	}

	public int method6243(String string, int i, int i_25_, int i_26_, int i_27_, Interface30[] interface30s, int i_28_) {
		try {
			if (i_25_ == 0)
				i_25_ = 35438517 * anInt6030;
			int i_29_ = method6244(string, new int[] { i }, aStringArray6032, interface30s, 1780988145);
			if (i_29_ == 0)
				return 0;
			if (i_27_ < 0)
				i_27_ = 0;
			i_27_ /= i_25_;
			if (i_27_ >= i_29_)
				i_27_ = i_29_ - 1;
			String string_30_ = aStringArray6032[i_27_];
			int i_31_ = 0;
			int i_32_ = 0;
			int i_33_;
			for (i_33_ = 0; i_33_ < i_26_ && i_31_ < string_30_.length(); i_33_ = method6248(string_30_.substring(0, ++i_31_), interface30s, -480261031))
				i_32_ = i_33_;
			if (i_31_ == string_30_.length() && string_30_.endsWith("<br>"))
				i_31_ -= 4;
			if (i_26_ - i_32_ < i_33_ - i_26_)
				i_31_--;
			for (int i_34_ = 0; i_34_ < i_27_; i_34_++)
				i_31_ += aStringArray6032[i_34_].length();
			return i_31_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vs.u(").append(')').toString());
		}
	}

	public int method6244(String string, int[] is, String[] strings, Interface30[] interface30s, int i) {
		try {
			return method6245(string, is, strings, interface30s, true, -1975373308);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vs.w(").append(')').toString());
		}
	}

	int method6245(String string, int[] is, String[] strings, Interface30[] interface30s, boolean bool, int i) {
		try {
			if (null == string)
				return 0;
			int i_35_ = 0;
			int i_36_ = 0;
			int i_37_ = -1;
			int i_38_ = 0;
			int i_39_ = 0;
			int i_40_ = -1;
			int i_41_ = -1;
			int i_42_ = 0;
			int i_43_ = string.length();
			for (int i_44_ = 0; i_44_ < i_43_; i_44_++) {
				int i_45_ = (ItemEquipDefinitions.method6216(string.charAt(i_44_), -2036175662) & 0xff);
				int i_46_ = 0;
				if (i_45_ == 60)
					i_40_ = i_44_;
				else {
					int i_47_;
					if (-1 != i_40_) {
						if (i_45_ != 62) {
							if (i >= -1676046053) {
								/* empty */
							}
							continue;
						}
						i_47_ = i_40_;
						String string_48_ = string.substring(i_40_ + 1, i_44_);
						i_40_ = -1;
						if (string_48_.equals("br")) {
							strings[i_42_] = string.substring(i_36_, 1 + i_44_);
							if (++i_42_ >= strings.length)
								return 0;
							i_36_ = i_44_ + 1;
							i_35_ = 0;
							i_37_ = -1;
							i_41_ = -1;
							continue;
						}
						if (string_48_.equals("lt")) {
							i_46_ += method6241(60, -1850026793);
							if (null != ((Class524) this).aByteArrayArray6031 && i_41_ != -1)
								i_46_ += (((Class524) this).aByteArrayArray6031[i_41_][60]);
							i_41_ = 60;
						} else if (string_48_.equals("gt")) {
							i_46_ += method6241(62, -1604514117);
							if (((Class524) this).aByteArrayArray6031 != null && -1 != i_41_)
								i_46_ += (((Class524) this).aByteArrayArray6031[i_41_][62]);
							i_41_ = 62;
						} else if (string_48_.equals("nbsp")) {
							i_46_ += method6241(160, -1547339744);
							if (null != ((Class524) this).aByteArrayArray6031 && -1 != i_41_)
								i_46_ += (((Class524) this).aByteArrayArray6031[i_41_][160]);
							i_41_ = 160;
						} else if (string_48_.equals("shy")) {
							i_46_ += method6241(173, -1795071349);
							if (null != ((Class524) this).aByteArrayArray6031 && i_41_ != -1)
								i_46_ += (((Class524) this).aByteArrayArray6031[i_41_][173]);
							i_41_ = 173;
						} else if (string_48_.equals("times")) {
							i_46_ += method6241(215, -1600259427);
							if (((Class524) this).aByteArrayArray6031 != null && -1 != i_41_)
								i_46_ += (((Class524) this).aByteArrayArray6031[i_41_][215]);
							i_41_ = 215;
						} else if (string_48_.equals("euro")) {
							i_46_ += method6241(8364, -1644532263);
							if (null != ((Class524) this).aByteArrayArray6031 && -1 != i_41_)
								i_46_ += (((Class524) this).aByteArrayArray6031[i_41_][8364]);
							i_41_ = 8364;
						} else if (string_48_.equals("copy")) {
							i_46_ += method6241(169, -2013742664);
							if (null != ((Class524) this).aByteArrayArray6031 && -1 != i_41_)
								i_46_ += (((Class524) this).aByteArrayArray6031[i_41_][169]);
							i_41_ = 169;
						} else if (string_48_.equals("reg")) {
							i_46_ += method6241(174, -2098046533);
							if (((Class524) this).aByteArrayArray6031 != null && -1 != i_41_)
								i_46_ += (((Class524) this).aByteArrayArray6031[i_41_][174]);
							i_41_ = 174;
						} else if (string_48_.startsWith("img=") && interface30s != null) {
							try {
								int i_49_ = Class204.method2185(string_48_.substring(4), (byte) -61);
								i_46_ += interface30s[i_49_].method318();
								i_41_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						}
						i_45_ = -1;
					} else {
						i_47_ = i_44_;
						i_46_ += method6241(i_45_, -1580242009);
						if (((Class524) this).aByteArrayArray6031 != null && i_41_ != -1)
							i_46_ += (((Class524) this).aByteArrayArray6031[i_41_][i_45_]);
						i_41_ = i_45_;
					}
					if (i_46_ > 0) {
						i_35_ += i_46_;
						if (null != is) {
							if (32 == i_45_) {
								i_37_ = i_44_;
								i_38_ = i_35_;
								i_39_ = bool ? 1 : 0;
							}
							if (i_35_ > is[(i_42_ < is.length ? i_42_ : is.length - 1)]) {
								if (i_37_ >= 0) {
									strings[i_42_] = string.substring(i_36_, 1 + i_37_ - i_39_);
									if (++i_42_ >= strings.length)
										return 0;
									i_36_ = 1 + i_37_;
									i_37_ = -1;
									i_35_ -= i_38_;
									i_41_ = -1;
								} else {
									strings[i_42_] = string.substring(i_36_, i_47_);
									if (++i_42_ >= strings.length)
										return 0;
									i_36_ = i_47_;
									i_37_ = -1;
									i_35_ = i_46_;
									i_41_ = -1;
								}
							}
							if (i_45_ == 45) {
								i_37_ = i_44_;
								i_38_ = i_35_;
								i_39_ = 0;
							}
						}
					}
				}
			}
			if (string.length() > i_36_) {
				strings[i_42_] = string.substring(i_36_, string.length());
				i_42_++;
			}
			return i_42_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vs.n(").append(')').toString());
		}
	}

	public int method6246(String string, int i, Interface30[] interface30s, byte i_50_) {
		try {
			int i_51_ = method6244(string, new int[] { i }, aStringArray6032, interface30s, 1596377651);
			int i_52_ = 0;
			for (int i_53_ = 0; i_53_ < i_51_; i_53_++) {
				int i_54_ = method6248(aStringArray6032[i_53_], interface30s, -1981663298);
				if (i_54_ > i_52_)
					i_52_ = i_54_;
			}
			return i_52_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vs.l(").append(')').toString());
		}
	}

	public int method6247(String string, int i, int i_55_, Interface30[] interface30s, int i_56_) {
		try {
			if (0 == i_55_)
				i_55_ = anInt6030 * 35438517;
			int i_57_ = method6244(string, new int[] { i }, aStringArray6032, interface30s, 813727579);
			int i_58_ = (i_57_ - 1) * i_55_;
			return anInt6033 * -2093225349 + i_58_ + 143160877 * anInt6035;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vs.k(").append(')').toString());
		}
	}

	public int method6248(String string, Interface30[] interface30s, int i) {
		try {
			if (string == null)
				return 0;
			int i_59_ = -1;
			int i_60_ = -1;
			int i_61_ = 0;
			int i_62_ = string.length();
			for (int i_63_ = 0; i_63_ < i_62_; i_63_++) {
				char c = string.charAt(i_63_);
				if (c == 60)
					i_59_ = i_63_;
				else {
					if (62 == c && -1 != i_59_) {
						String string_64_ = string.substring(i_59_ + 1, i_63_);
						i_59_ = -1;
						if (string_64_.equals("lt"))
							c = '<';
						else if (string_64_.equals("gt"))
							c = '>';
						else if (string_64_.equals("nbsp"))
							c = '\u00a0';
						else if (string_64_.equals("shy"))
							c = '\u00ad';
						else if (string_64_.equals("times"))
							c = '\u00d7';
						else if (string_64_.equals("euro"))
							c = '\u20ac';
						else if (string_64_.equals("copy"))
							c = '\u00a9';
						else if (string_64_.equals("reg"))
							c = '\u00ae';
						else {
							if (string_64_.startsWith("img=") && null != interface30s) {
								try {
									int i_65_ = (Class204.method2185(string_64_.substring(4), (byte) -10));
									i_61_ += interface30s[i_65_].method318();
									i_60_ = -1;
								} catch (Exception exception) {
									/* empty */
								}
							}
							continue;
						}
					}
					if (-1 == i_59_) {
						i_61_ += ((((Class524) this).aByteArray6034[ItemEquipDefinitions.method6216(c, -238617280) & 0xff]) & 0xff);
						if (((Class524) this).aByteArrayArray6031 != null && -1 != i_60_)
							i_61_ += (((Class524) this).aByteArrayArray6031[i_60_][c]);
						i_60_ = c;
					}
				}
			}
			return i_61_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vs.f(").append(')').toString());
		}
	}

	public String method6249(String string, int i, Interface30[] interface30s, int i_66_) {
		try {
			if (method6248(string, interface30s, -232280159) <= i)
				return string;
			i -= method6248("...", null, -1003403732);
			int i_67_ = -1;
			int i_68_ = -1;
			int i_69_ = 0;
			int i_70_ = string.length();
			String string_71_ = "";
			for (int i_72_ = 0; i_72_ < i_70_; i_72_++) {
				char c = string.charAt(i_72_);
				if (60 == c)
					i_67_ = i_72_;
				else {
					if (62 == c && -1 != i_67_) {
						String string_73_ = string.substring(1 + i_67_, i_72_);
						i_67_ = -1;
						if (string_73_.equals("lt"))
							c = '<';
						else if (string_73_.equals("gt"))
							c = '>';
						else if (string_73_.equals("nbsp"))
							c = '\u00a0';
						else if (string_73_.equals("shy"))
							c = '\u00ad';
						else if (string_73_.equals("times"))
							c = '\u00d7';
						else if (string_73_.equals("euro"))
							c = '\u20ac';
						else if (string_73_.equals("copy"))
							c = '\u00a9';
						else if (string_73_.equals("reg"))
							c = '\u00ae';
						else {
							if (string_73_.startsWith("img=") && interface30s != null) {
								try {
									int i_74_ = (Class204.method2185(string_73_.substring(4), (byte) -31));
									i_69_ += interface30s[i_74_].method318();
									i_68_ = -1;
									if (i_69_ > i)
										return new StringBuilder().append(string_71_).append("...").toString();
									string_71_ = string.substring(0, i_72_ + 1);
								} catch (Exception exception) {
									/* empty */
								}
							}
							continue;
						}
					}
					if (i_67_ == -1) {
						i_69_ += ((((Class524) this).aByteArray6034[ItemEquipDefinitions.method6216(c, 934780369) & 0xff]) & 0xff);
						if (null != ((Class524) this).aByteArrayArray6031 && -1 != i_68_)
							i_69_ += (((Class524) this).aByteArrayArray6031[i_68_][c]);
						i_68_ = c;
						int i_75_ = i_69_;
						if (null != ((Class524) this).aByteArrayArray6031)
							i_75_ += (((Class524) this).aByteArrayArray6031[c][46]);
						if (i_75_ > i)
							return new StringBuilder().append(string_71_).append("...").toString();
						string_71_ = string.substring(0, i_72_ + 1);
					}
				}
			}
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vs.z(").append(')').toString());
		}
	}

	public int method6250(int i, char c, byte i_76_) {
		try {
			if (((Class524) this).aByteArrayArray6031 != null)
				return ((Class524) this).aByteArrayArray6031[i][c];
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vs.p(").append(')').toString());
		}
	}

	public int method6251(String string, int i, Interface30[] interface30s, int i_77_) {
		try {
			return method6244(string, new int[] { i }, aStringArray6032, interface30s, 825091338);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vs.b(").append(')').toString());
		}
	}

	static final void method6252(int i, int i_78_, int i_79_, int i_80_, byte i_81_) {
		try {
			for (int i_82_ = 0; i_82_ < 197858337 * client.anInt9213; i_82_++) {
				Rectangle rectangle = client.aRectangleArray9252[i_82_];
				if (rectangle.width + rectangle.x > i && rectangle.x < i + i_79_ && rectangle.height + rectangle.y > i_78_ && rectangle.y < i_80_ + i_78_)
					client.aBooleanArray9230[i_82_] = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vs.ka(").append(')').toString());
		}
	}

	static void method6253(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 - 1] = (Class131.aClass407_1502.method4752((((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 - 1]), -2036141784).aBoolean4101) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vs.o(").append(')').toString());
		}
	}

	static void method6254(byte i) {
		try {
			client.aClass304_9030.method3003(-450519937);
			Class_ta.method5674((byte) 1);
			Class50.method632(true, (byte) 11);
			Class479.method6012((byte) 125);
			System.gc();
			Class361.aClass_ra3793.ba(2, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vs.lt(").append(')').toString());
		}
	}
}
