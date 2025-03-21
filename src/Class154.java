/* Class154 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class154 {
	public byte aByte1635;
	long[] aLongArray1636;
	boolean aBoolean1637;
	public byte aByte1638;
	static byte aByte1639 = 127;
	public String aString1640;
	int anInt1641;
	public boolean aBoolean1642;
	int anInt1643 = 0;
	public byte aByte1644;
	public byte aByte1645;
	public static byte aByte1646 = -1;
	public int anInt1647;
	long aLong1648;
	public int anInt1649;
	int[] anIntArray1650;
	int[] anIntArray1651;
	public int[] anIntArray1652;
	public int anInt1653;
	public byte[] aByteArray1654;
	public int anInt1655;
	long[] aLongArray1656;
	public String[] aStringArray1657;
	public String[] aStringArray1658;
	Class497 aClass497_1659;
	static byte aByte1660 = 125;
	static byte aByte1661 = 126;
	boolean aBoolean1662;
	static byte aByte1663 = 0;
	static int anInt1664 = 5;

	void method1797(int i, byte i_0_) {
		try {
			anInt1655 -= 510780239;
			if (0 == anInt1655 * 1688032175) {
				((Class154) this).aLongArray1656 = null;
				aStringArray1658 = null;
			} else {
				if (((Class154) this).aLongArray1656 != null)
					Class453.method5639(((Class154) this).aLongArray1656, 1 + i, ((Class154) this).aLongArray1656, i, anInt1655 * 1688032175 - i);
				if (null != aStringArray1658)
					Class453.method5641(aStringArray1658, 1 + i, aStringArray1658, i, 1688032175 * anInt1655 - i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.q(").append(')').toString());
		}
	}

	void method1798(int i, int i_1_) {
		try {
			if (((Class154) this).aBoolean1662) {
				if (null != ((Class154) this).aLongArray1656)
					Class453.method5639(((Class154) this).aLongArray1656, 0, (((Class154) this).aLongArray1656 = new long[i]), 0, 1688032175 * anInt1655);
				else
					((Class154) this).aLongArray1656 = new long[i];
			}
			if (((Class154) this).aBoolean1637) {
				if (aStringArray1658 != null)
					Class453.method5641(aStringArray1658, 0, aStringArray1658 = new String[i], 0, 1688032175 * anInt1655);
				else
					aStringArray1658 = new String[i];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.j(").append(')').toString());
		}
	}

	public int method1799(String string, int i) {
		try {
			if (null == string || string.length() == 0)
				return -1;
			for (int i_2_ = 0; i_2_ < 1425443787 * anInt1647; i_2_++) {
				if (aStringArray1657[i_2_].equals(string))
					return i_2_;
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.i(").append(')').toString());
		}
	}

	public Integer method1800(int i, int i_3_, int i_4_, byte i_5_) {
		try {
			if (((Class154) this).aClass497_1659 == null)
				return null;
			Class330 class330 = ((Class154) this).aClass497_1659.method6094((long) i);
			if (null == class330 || !(class330 instanceof Class330_Sub23))
				return null;
			int i_6_ = i_4_ == 31 ? -1 : (1 << 1 + i_4_) - 1;
			return new Integer(((((Class330_Sub23) class330).anInt7693 * 393599711) & i_6_) >>> i_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.s(").append(')').toString());
		}
	}

	public Long method1801(int i, int i_7_) {
		try {
			if (null == ((Class154) this).aClass497_1659)
				return null;
			Class330 class330 = ((Class154) this).aClass497_1659.method6094((long) i);
			if (null == class330 || !(class330 instanceof Class330_Sub22))
				return null;
			return new Long(((Class330_Sub22) class330).aLong7692 * -4509106026118440599L);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.f(").append(')').toString());
		}
	}

	public int[] method1802(int i) {
		try {
			if (null == ((Class154) this).anIntArray1650) {
				String[] strings = new String[anInt1647 * 1425443787];
				((Class154) this).anIntArray1650 = new int[1425443787 * anInt1647];
				for (int i_8_ = 0; i_8_ < 1425443787 * anInt1647; i_8_++) {
					strings[i_8_] = aStringArray1657[i_8_];
					((Class154) this).anIntArray1650[i_8_] = i_8_;
				}
				Class105.method1308(strings, ((Class154) this).anIntArray1650, -345551316);
			}
			return ((Class154) this).anIntArray1650;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.w(").append(')').toString());
		}
	}

	void method1803(long l, String string, int i, int i_9_) {
		try {
			if (string != null && string.length() == 0)
				string = null;
			if (((Class154) this).aBoolean1662 != l > 0L)
				throw new RuntimeException("");
			if ((null != string) != ((Class154) this).aBoolean1637)
				throw new RuntimeException("");
			if (l > 0L && (null == ((Class154) this).aLongArray1636 || (1425443787 * anInt1647 >= ((Class154) this).aLongArray1636.length)) || (null != string && (null == aStringArray1657 || anInt1647 * 1425443787 >= aStringArray1657.length)))
				method1812(5 + 1425443787 * anInt1647, -1618544187);
			if (((Class154) this).aLongArray1636 != null)
				((Class154) this).aLongArray1636[1425443787 * anInt1647] = l;
			if (null != aStringArray1657)
				aStringArray1657[anInt1647 * 1425443787] = string;
			if (anInt1653 * -1964238475 == -1) {
				anInt1653 = -1625675713 * anInt1647;
				aByteArray1654[1425443787 * anInt1647] = (byte) 126;
			} else
				aByteArray1654[anInt1647 * 1425443787] = (byte) 0;
			((Class154) this).anIntArray1651[anInt1647 * 1425443787] = 0;
			anIntArray1652[anInt1647 * 1425443787] = i;
			anInt1647 += -1707425309;
			((Class154) this).anIntArray1650 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.n(").append(')').toString());
		}
	}

	void method1804(int i, byte i_10_) {
		try {
			if (i < 0 || i >= 1425443787 * anInt1647)
				throw new RuntimeException("");
			anInt1647 -= -1707425309;
			((Class154) this).anIntArray1650 = null;
			if (0 == 1425443787 * anInt1647) {
				((Class154) this).aLongArray1636 = null;
				aStringArray1657 = null;
				aByteArray1654 = null;
				((Class154) this).anIntArray1651 = null;
				anIntArray1652 = null;
				anInt1653 = 791728419;
				anInt1649 = 896100441;
			} else {
				Class453.method5638(aByteArray1654, 1 + i, aByteArray1654, i, anInt1647 * 1425443787 - i);
				Class453.method5642(((Class154) this).anIntArray1651, 1 + i, ((Class154) this).anIntArray1651, i, anInt1647 * 1425443787 - i);
				Class453.method5642(anIntArray1652, 1 + i, anIntArray1652, i, anInt1647 * 1425443787 - i);
				if (((Class154) this).aLongArray1636 != null)
					Class453.method5639(((Class154) this).aLongArray1636, 1 + i, ((Class154) this).aLongArray1636, i, 1425443787 * anInt1647 - i);
				if (null != aStringArray1657)
					Class453.method5641(aStringArray1657, i + 1, aStringArray1657, i, anInt1647 * 1425443787 - i);
				if (i == -1964238475 * anInt1653 || -1697603561 * anInt1649 == i)
					method1813(112931592);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.l(").append(')').toString());
		}
	}

	void method1805(long l, String string, int i) {
		try {
			if (string != null && string.length() == 0)
				string = null;
			if (l > 0L != ((Class154) this).aBoolean1662)
				throw new RuntimeException("");
			if ((null != string) != ((Class154) this).aBoolean1637)
				throw new RuntimeException("");
			if (l > 0L && (null == ((Class154) this).aLongArray1656 || (1688032175 * anInt1655 >= ((Class154) this).aLongArray1656.length)) || (null != string && (null == aStringArray1658 || 1688032175 * anInt1655 >= aStringArray1658.length)))
				method1798(5 + 1688032175 * anInt1655, -85497674);
			if (null != ((Class154) this).aLongArray1656)
				((Class154) this).aLongArray1656[1688032175 * anInt1655] = l;
			if (null != aStringArray1658)
				aStringArray1658[anInt1655 * 1688032175] = string;
			anInt1655 += 510780239;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.k(").append(')').toString());
		}
	}

	public Integer method1806(int i, byte i_11_) {
		try {
			if (((Class154) this).aClass497_1659 == null)
				return null;
			Class330 class330 = ((Class154) this).aClass497_1659.method6094((long) i);
			if (class330 == null || !(class330 instanceof Class330_Sub23))
				return null;
			return new Integer(393599711 * ((Class330_Sub23) class330).anInt7693);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.o(").append(')').toString());
		}
	}

	int method1807(int i, byte i_12_, int i_13_) {
		try {
			if (i_12_ == 126 || 127 == i_12_)
				return -1;
			if (i == -1964238475 * anInt1653 && (-1 == anInt1649 * -1697603561 || aByteArray1654[-1697603561 * anInt1649] < 125))
				return -1;
			if (i_12_ == aByteArray1654[i])
				return -1;
			aByteArray1654[i] = i_12_;
			method1813(112931592);
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.u(").append(')').toString());
		}
	}

	boolean method1808(int i, int i_14_, int i_15_, int i_16_, int i_17_) {
		try {
			int i_18_ = (1 << i_15_) - 1;
			int i_19_ = i_16_ == 31 ? -1 : (1 << i_16_ + 1) - 1;
			int i_20_ = i_19_ ^ i_18_;
			i_14_ <<= i_15_;
			i_14_ &= i_20_;
			if (null != ((Class154) this).aClass497_1659) {
				Class330 class330 = ((Class154) this).aClass497_1659.method6094((long) i);
				if (null != class330) {
					if (class330 instanceof Class330_Sub23) {
						Class330_Sub23 class330_sub23 = (Class330_Sub23) class330;
						if ((class330_sub23.anInt7693 * 393599711 & i_20_) == i_14_)
							return false;
						Class330_Sub23 class330_sub23_21_;
						(class330_sub23_21_ = class330_sub23).anInt7693 = (class330_sub23_21_.anInt7693 * 393599711 & (i_20_ ^ 0xffffffff)) * -457940705;
						Class330_Sub23 class330_sub23_22_;
						(class330_sub23_22_ = class330_sub23).anInt7693 = (-457940705 * (393599711 * class330_sub23_22_.anInt7693 | i_14_));
						return true;
					}
					class330.method3252(-2084258202);
				}
			} else
				((Class154) this).aClass497_1659 = new Class497(4);
			((Class154) this).aClass497_1659.method6097(new Class330_Sub23(i_14_), (long) i);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.d(").append(')').toString());
		}
	}

	boolean method1809(int i, int i_23_, int i_24_) {
		try {
			if (null != ((Class154) this).aClass497_1659) {
				Class330 class330 = ((Class154) this).aClass497_1659.method6094((long) i);
				if (null != class330) {
					if (class330 instanceof Class330_Sub23) {
						Class330_Sub23 class330_sub23 = (Class330_Sub23) class330;
						if (i_23_ == class330_sub23.anInt7693 * 393599711)
							return false;
						class330_sub23.anInt7693 = -457940705 * i_23_;
						return true;
					}
					class330.method3252(-1681535914);
				}
			} else
				((Class154) this).aClass497_1659 = new Class497(4);
			((Class154) this).aClass497_1659.method6097(new Class330_Sub23(i_23_), (long) i);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.g(").append(')').toString());
		}
	}

	boolean method1810(int i, long l) {
		try {
			if (((Class154) this).aClass497_1659 != null) {
				Class330 class330 = ((Class154) this).aClass497_1659.method6094((long) i);
				if (null != class330) {
					if (class330 instanceof Class330_Sub22) {
						Class330_Sub22 class330_sub22 = (Class330_Sub22) class330;
						if (class330_sub22.aLong7692 * -4509106026118440599L == l)
							return false;
						class330_sub22.aLong7692 = 2625245114264389337L * l;
						return true;
					}
					class330.method3252(612428669);
				}
			} else
				((Class154) this).aClass497_1659 = new Class497(4);
			((Class154) this).aClass497_1659.method6097(new Class330_Sub22(l), (long) i);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.c(").append(')').toString());
		}
	}

	void method1811(Buffer class330_sub46, int i) {
		try {
			int i_25_ = class330_sub46.readUnsignedByte(1075117659);
			if (i_25_ < 1 || i_25_ > 5)
				throw new RuntimeException(new StringBuilder().append("").append(i_25_).toString());
			int i_26_ = class330_sub46.readUnsignedByte(422492806);
			if (0 != (i_26_ & 0x1))
				((Class154) this).aBoolean1662 = true;
			if ((i_26_ & 0x2) != 0)
				((Class154) this).aBoolean1637 = true;
			if (!((Class154) this).aBoolean1662) {
				((Class154) this).aLongArray1636 = null;
				((Class154) this).aLongArray1656 = null;
			}
			if (!((Class154) this).aBoolean1637) {
				aStringArray1657 = null;
				aStringArray1658 = null;
			}
			((Class154) this).anInt1643 = class330_sub46.readInt((byte) 108) * 2099976099;
			((Class154) this).anInt1641 = class330_sub46.readInt((byte) 66) * 239350163;
			if (i_25_ <= 3 && 0 != -606104421 * ((Class154) this).anInt1641)
				((Class154) this).anInt1641 += 1745862368;
			anInt1647 = class330_sub46.readUnsignedShort(1924824369) * -1707425309;
			anInt1655 = class330_sub46.readUnsignedByte(2145051414) * 510780239;
			aString1640 = class330_sub46.readString(1335890066);
			if (i_25_ >= 4)
				class330_sub46.readInt((byte) 63);
			aBoolean1642 = class330_sub46.readUnsignedByte(1824142558) == 1;
			aByte1638 = class330_sub46.readByte((byte) -31);
			aByte1644 = class330_sub46.readByte((byte) 56);
			aByte1645 = class330_sub46.readByte((byte) -15);
			aByte1635 = class330_sub46.readByte((byte) -43);
			if (1425443787 * anInt1647 > 0) {
				if (((Class154) this).aBoolean1662 && (null == ((Class154) this).aLongArray1636 || (((Class154) this).aLongArray1636.length < 1425443787 * anInt1647)))
					((Class154) this).aLongArray1636 = new long[anInt1647 * 1425443787];
				if (((Class154) this).aBoolean1637 && (null == aStringArray1657 || aStringArray1657.length < anInt1647 * 1425443787))
					aStringArray1657 = new String[1425443787 * anInt1647];
				if (aByteArray1654 == null || aByteArray1654.length < 1425443787 * anInt1647)
					aByteArray1654 = new byte[1425443787 * anInt1647];
				if (null == ((Class154) this).anIntArray1651 || (((Class154) this).anIntArray1651.length < anInt1647 * 1425443787))
					((Class154) this).anIntArray1651 = new int[1425443787 * anInt1647];
				if (null == anIntArray1652 || anIntArray1652.length < 1425443787 * anInt1647)
					anIntArray1652 = new int[1425443787 * anInt1647];
				for (int i_27_ = 0; i_27_ < anInt1647 * 1425443787; i_27_++) {
					if (((Class154) this).aBoolean1662)
						((Class154) this).aLongArray1636[i_27_] = class330_sub46.readLong(-344476850);
					if (((Class154) this).aBoolean1637)
						aStringArray1657[i_27_] = class330_sub46.method3761(1945513232);
					aByteArray1654[i_27_] = class330_sub46.readByte((byte) -16);
					if (i_25_ >= 2)
						((Class154) this).anIntArray1651[i_27_] = class330_sub46.readInt((byte) 87);
					if (i_25_ >= 5)
						anIntArray1652[i_27_] = class330_sub46.readUnsignedShort(600640112);
					else
						anIntArray1652[i_27_] = 0;
				}
				method1813(112931592);
			}
			if (1688032175 * anInt1655 > 0) {
				if (((Class154) this).aBoolean1662 && (((Class154) this).aLongArray1656 == null || (((Class154) this).aLongArray1656.length < anInt1655 * 1688032175)))
					((Class154) this).aLongArray1656 = new long[1688032175 * anInt1655];
				if (((Class154) this).aBoolean1637 && (null == aStringArray1658 || aStringArray1658.length < anInt1655 * 1688032175))
					aStringArray1658 = new String[anInt1655 * 1688032175];
				for (int i_28_ = 0; i_28_ < anInt1655 * 1688032175; i_28_++) {
					if (((Class154) this).aBoolean1662)
						((Class154) this).aLongArray1656[i_28_] = class330_sub46.readLong(-62924618);
					if (((Class154) this).aBoolean1637)
						aStringArray1658[i_28_] = class330_sub46.method3761(2021076509);
				}
			}
			if (i_25_ >= 3) {
				int i_29_ = class330_sub46.readUnsignedShort(857113077);
				if (i_29_ > 0) {
					((Class154) this).aClass497_1659 = new Class497(i_29_ < 16 ? Class136.method1594(i_29_, 1860956109) : 16);
					while (i_29_-- > 0) {
						int i_30_ = class330_sub46.readInt((byte) 79);
						int i_31_ = i_30_ & 0x3fffffff;
						int i_32_ = i_30_ >>> 30;
						if (0 == i_32_) {
							int i_33_ = class330_sub46.readInt((byte) 121);
							((Class154) this).aClass497_1659.method6097(new Class330_Sub23(i_33_), (long) i_31_);
						} else if (i_32_ == 1) {
							long l = class330_sub46.readLong(-2118139348);
							((Class154) this).aClass497_1659.method6097(new Class330_Sub22(l), (long) i_31_);
						} else if (2 == i_32_) {
							String string = class330_sub46.readString(1696221985);
							((Class154) this).aClass497_1659.method6097(new Class330_Sub35(string), (long) i_31_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.e(").append(')').toString());
		}
	}

	void method1812(int i, int i_34_) {
		try {
			if (((Class154) this).aBoolean1662) {
				if (null != ((Class154) this).aLongArray1636)
					Class453.method5639(((Class154) this).aLongArray1636, 0, (((Class154) this).aLongArray1636 = new long[i]), 0, 1425443787 * anInt1647);
				else
					((Class154) this).aLongArray1636 = new long[i];
			}
			if (((Class154) this).aBoolean1637) {
				if (null != aStringArray1657)
					Class453.method5641(aStringArray1657, 0, aStringArray1657 = new String[i], 0, anInt1647 * 1425443787);
				else
					aStringArray1657 = new String[i];
			}
			if (aByteArray1654 != null)
				Class453.method5638(aByteArray1654, 0, aByteArray1654 = new byte[i], 0, anInt1647 * 1425443787);
			else
				aByteArray1654 = new byte[i];
			if (null != ((Class154) this).anIntArray1651)
				Class453.method5642(((Class154) this).anIntArray1651, 0, (((Class154) this).anIntArray1651 = new int[i]), 0, 1425443787 * anInt1647);
			else
				((Class154) this).anIntArray1651 = new int[i];
			if (anIntArray1652 != null)
				Class453.method5642(anIntArray1652, 0, anIntArray1652 = new int[i], 0, anInt1647 * 1425443787);
			else
				anIntArray1652 = new int[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.r(").append(')').toString());
		}
	}

	void method1813(int i) {
		try {
			if (anInt1647 * 1425443787 == 0) {
				anInt1653 = 791728419;
				anInt1649 = 896100441;
			} else {
				anInt1653 = 791728419;
				anInt1649 = 896100441;
				int i_35_ = 0;
				byte i_36_ = aByteArray1654[0];
				for (int i_37_ = 1; i_37_ < anInt1647 * 1425443787; i_37_++) {
					if (aByteArray1654[i_37_] > i_36_) {
						if (125 == i_36_)
							anInt1649 = -896100441 * i_35_;
						i_35_ = i_37_;
						i_36_ = aByteArray1654[i_37_];
					} else if (anInt1649 * -1697603561 == -1 && aByteArray1654[i_37_] == 125)
						anInt1649 = i_37_ * -896100441;
				}
				anInt1653 = i_35_ * -791728419;
				if (-1964238475 * anInt1653 != -1)
					aByteArray1654[-1964238475 * anInt1653] = (byte) 126;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.b(").append(')').toString());
		}
	}

	boolean method1814(int i, String string, int i_38_) {
		try {
			if (null == string)
				string = "";
			else if (string.length() > 80)
				string = string.substring(0, 80);
			if (null != ((Class154) this).aClass497_1659) {
				Class330 class330 = ((Class154) this).aClass497_1659.method6094((long) i);
				if (null != class330) {
					if (class330 instanceof Class330_Sub35) {
						Class330_Sub35 class330_sub35 = (Class330_Sub35) class330;
						if (class330_sub35.anObject7733 instanceof String) {
							if (string.equals(class330_sub35.anObject7733))
								return false;
							class330_sub35.method3252(1601631902);
							class330_sub35.method3252(-590527831);
							((Class154) this).aClass497_1659.method6097(new Class330_Sub35(string), (class330_sub35.aLong3341 * -6154793640677333111L));
							return true;
						}
					}
					class330.method3252(-2129185818);
				}
			} else
				((Class154) this).aClass497_1659 = new Class497(4);
			((Class154) this).aClass497_1659.method6097(new Class330_Sub35(string), (long) i);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.a(").append(')').toString());
		}
	}

	public Class154(Buffer class330_sub46) {
		aString1640 = null;
		((Class154) this).anInt1641 = 0;
		anInt1653 = 791728419;
		anInt1649 = 896100441;
		method1811(class330_sub46, 527769308);
	}

	int method1815(int i, int i_39_, int i_40_, int i_41_, int i_42_) {
		try {
			int i_43_ = (1 << i_40_) - 1;
			int i_44_ = 31 == i_41_ ? -1 : (1 << 1 + i_41_) - 1;
			int i_45_ = i_44_ ^ i_43_;
			i_39_ <<= i_40_;
			i_39_ &= i_45_;
			int i_46_ = ((Class154) this).anIntArray1651[i];
			if ((i_46_ & i_45_) == i_39_)
				return -1;
			i_46_ &= i_45_ ^ 0xffffffff;
			((Class154) this).anIntArray1651[i] = i_46_ | i_39_;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.x(").append(')').toString());
		}
	}

	public int method1816(int i, int i_47_, int i_48_, byte i_49_) {
		try {
			int i_50_ = i_48_ == 31 ? -1 : (1 << 1 + i_48_) - 1;
			return (((Class154) this).anIntArray1651[i] & i_50_) >>> i_47_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.p(").append(')').toString());
		}
	}

	public String method1817(int i, byte i_51_) {
		try {
			if (null == ((Class154) this).aClass497_1659)
				return null;
			Class330 class330 = ((Class154) this).aClass497_1659.method6094((long) i);
			if (null == class330 || !(class330 instanceof Class330_Sub35))
				return null;
			return (String) ((Class330_Sub35) class330).anObject7733;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.z(").append(')').toString());
		}
	}

	static final void method1818(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, byte i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			int[] is = Class278.method2740(string, class430, (byte) 0);
			if (is != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1318 = Class288.method2886(string, class430, 1304112104);
			iComponentDefinitions.anIntArray1309 = is;
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.mm(").append(')').toString());
		}
	}

	static final void method1819(Class430 class430, int i) {
		try {
			Class401_Sub1 class401_sub1 = Class426.method5318(275028254);
			if (null != class401_sub1) {
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = class401_sub1.anInt8245 * -1759169697;
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 551859137 * class401_sub1.anInt4131;
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = class401_sub1.aString8246;
				Class396 class396 = class401_sub1.method4720(-841263739);
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = class396.anInt4106 * 550219725;
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = class396.aString4107;
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = class401_sub1.anInt4133 * -1767069987;
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = class401_sub1.anInt8248 * 284224351;
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = class401_sub1.aString8247;
			} else {
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.anu(").append(')').toString());
		}
	}

	static final void method1820(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_52_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_53_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class99.method1206(i_52_, i_53_, true, (byte) 91);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.ur(").append(')').toString());
		}
	}

	public static void method1821(String string, int i) {
		try {
			Class5.aString73 = string;
			Class5.anInt76 = Class5.aString73.length() * 616558173;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.n(").append(')').toString());
		}
	}

	static final void method1822(Class430 class430, byte i) {
		try {
			Class416.method5256(((Class432_Sub1) ((Class430) class430).anInterface2_4389), (((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]), 999151532);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (int) client.aFloatArray9253[0];
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (int) client.aFloatArray9253[1];
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (int) client.aFloatArray9253[2];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gg.arn(").append(')').toString());
		}
	}
}
