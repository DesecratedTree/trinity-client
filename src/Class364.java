/* Class364 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class364 {
	public int[][] anIntArrayArray3807;
	public int anInt3808 = -1044166969;
	public int[] anIntArray3809 = null;
	Class362 aClass362_3810;
	int anInt3811;
	public int anInt3812;
	public int[] anIntArray3813;
	public int anInt3814;
	public int anInt3815;
	public int anInt3816;
	public int anInt3817;
	public int anInt3818;
	public int anInt3819;
	public boolean aBoolean3820;
	public int anInt3821;
	public int anInt3822;
	public int anInt3823;
	public int anInt3824;
	public int anInt3825;
	public int anInt3826;
	public int anInt3827;
	public int anInt3828;
	public int anInt3829;
	public int anInt3830;
	public int anInt3831;
	public int anInt3832;
	public int[] anIntArray3833 = null;
	public int anInt3834;
	public int[] anIntArray3835;
	public int anInt3836;
	public int anInt3837;
	public int anInt3838;
	public int anInt3839;
	public int anInt3840;
	public int anInt3841;
	public int anInt3842;
	public int anInt3843;
	public int anInt3844;
	public int[][] anIntArrayArray3845;
	Class247[] aClass247Array3846;
	public int anInt3847;
	public int anInt3848;
	public int anInt3849;
	public int anInt3850;
	public int anInt3851;

	Class364() {
		((Class364) this).anInt3811 = 0;
		anInt3812 = 1331636975;
		anInt3829 = -615449949;
		anInt3814 = 2147463957;
		anInt3815 = 252551167;
		anInt3836 = 546296015;
		anInt3817 = 58140531;
		anInt3818 = -552626989;
		anInt3819 = -360704065;
		anInt3851 = 89409605;
		anInt3821 = -729064517;
		anInt3822 = -700625211;
		anInt3823 = 812740941;
		anInt3824 = -869688015;
		anInt3825 = -53339385;
		anInt3826 = -1796583105;
		anInt3827 = -587202403;
		anInt3828 = -215239235;
		anInt3840 = -1279366641;
		anInt3830 = -1072250975;
		anInt3831 = -236977777;
		anInt3832 = 0;
		anInt3844 = 0;
		anInt3834 = 0;
		anInt3837 = 0;
		anInt3841 = 0;
		anInt3842 = 0;
		anInt3843 = 0;
		anInt3838 = 0;
		anInt3816 = 0;
		anInt3839 = 0;
		anInt3847 = 0;
		anInt3848 = 0;
		anInt3849 = 2000831419;
		anInt3850 = -348578065;
		aBoolean3820 = true;
	}

	void method4263(Buffer class330_sub46, int i, short i_0_) {
		try {
			if (1 == i) {
				anInt3808 = class330_sub46.readBigSmart(-576116940) * 1044166969;
				anInt3814 = class330_sub46.readBigSmart(-1585061554) * -2147463957;
			} else if (i == 2)
				anInt3822 = class330_sub46.readBigSmart(-1411553350) * 700625211;
			else if (3 == i)
				anInt3823 = class330_sub46.readBigSmart(-1480499342) * -812740941;
			else if (i == 4)
				anInt3824 = class330_sub46.readBigSmart(-540782746) * 869688015;
			else if (5 == i)
				anInt3825 = class330_sub46.readBigSmart(-1496081365) * 53339385;
			else if (i == 6)
				anInt3818 = class330_sub46.readBigSmart(-1050933577) * 552626989;
			else if (7 == i)
				anInt3819 = class330_sub46.readBigSmart(-1385428941) * 360704065;
			else if (8 == i)
				anInt3851 = class330_sub46.readBigSmart(-1004150763) * -89409605;
			else if (i == 9)
				anInt3821 = class330_sub46.readBigSmart(-2038630014) * 729064517;
			else if (26 == i) {
				anInt3832 = (short) (class330_sub46.readUnsignedByte(1776683059) * 4) * -109170651;
				anInt3844 = ((short) (class330_sub46.readUnsignedByte(-16697713) * 4) * 1051178953);
			} else if (i == 27) {
				if (null == anIntArrayArray3807)
					anIntArrayArray3807 = (new int[(((Class362) ((Class364) this).aClass362_3810).aClass421_3797.disabledEquipmentSlots).length][]);
				int i_1_ = class330_sub46.readUnsignedByte(1043550624);
				anIntArrayArray3807[i_1_] = new int[6];
				for (int i_2_ = 0; i_2_ < 6; i_2_++)
					anIntArrayArray3807[i_1_][i_2_] = class330_sub46.readShort(-1100583751);
			} else if (28 == i) {
				int i_3_ = class330_sub46.readUnsignedByte(1871450145);
				anIntArray3813 = new int[i_3_];
				for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
					anIntArray3813[i_4_] = class330_sub46.readUnsignedByte(1477043522);
					if (255 == anIntArray3813[i_4_])
						anIntArray3813[i_4_] = -1;
				}
			} else if (i == 29)
				anInt3841 = class330_sub46.readUnsignedByte(898391674) * 775082289;
			else if (i == 30)
				anInt3842 = class330_sub46.readUnsignedShort(293525829) * -661182735;
			else if (31 == i)
				anInt3843 = class330_sub46.readUnsignedByte(-49694834) * 374989353;
			else if (i == 32)
				anInt3838 = class330_sub46.readUnsignedShort(1356091463) * -991881321;
			else if (i == 33)
				anInt3816 = class330_sub46.readShort(-1100583751) * -279967911;
			else if (i == 34)
				anInt3839 = class330_sub46.readUnsignedByte(1337624526) * 579715627;
			else if (i == 35)
				anInt3847 = class330_sub46.readUnsignedShort(1933644625) * 597670617;
			else if (36 == i)
				anInt3848 = class330_sub46.readShort(-1100583751) * -745954091;
			else if (37 == i)
				anInt3849 = class330_sub46.readUnsignedByte(890749434) * -2000831419;
			else if (i == 38)
				anInt3812 = class330_sub46.readBigSmart(-1678557745) * -1331636975;
			else if (i == 39)
				anInt3829 = class330_sub46.readBigSmart(-1400370243) * 615449949;
			else if (i == 40)
				anInt3815 = class330_sub46.readBigSmart(-730405997) * -252551167;
			else if (41 == i)
				anInt3836 = class330_sub46.readBigSmart(-548138118) * -546296015;
			else if (i == 42)
				anInt3817 = class330_sub46.readBigSmart(-1294998486) * -58140531;
			else if (i == 43)
				class330_sub46.readUnsignedShort(2137503065);
			else if (44 == i)
				class330_sub46.readUnsignedShort(-352491944);
			else if (i == 45)
				anInt3850 = class330_sub46.readUnsignedShort(420530526) * 348578065;
			else if (46 == i)
				anInt3826 = class330_sub46.readBigSmart(-1145522059) * 1796583105;
			else if (i == 47)
				anInt3827 = class330_sub46.readBigSmart(-1365262005) * 587202403;
			else if (i == 48)
				anInt3828 = class330_sub46.readBigSmart(-1533647488) * 215239235;
			else if (i == 49)
				anInt3840 = class330_sub46.readBigSmart(-1591346907) * 1279366641;
			else if (50 == i)
				anInt3830 = class330_sub46.readBigSmart(-910694591) * 1072250975;
			else if (i == 51)
				anInt3831 = class330_sub46.readBigSmart(-830976505) * 236977777;
			else if (i == 52) {
				int i_5_ = class330_sub46.readUnsignedByte(2038938932);
				anIntArray3809 = new int[i_5_];
				anIntArray3833 = new int[i_5_];
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
					anIntArray3809[i_6_] = class330_sub46.readBigSmart(-760383607);
					int i_7_ = class330_sub46.readUnsignedByte(242614240);
					anIntArray3833[i_6_] = i_7_;
					((Class364) this).anInt3811 += -242728075 * i_7_;
				}
			} else if (53 == i)
				aBoolean3820 = false;
			else if (54 == i) {
				anInt3834 = ((class330_sub46.readUnsignedByte(2097990924) << 6) * -203965911);
				anInt3837 = ((class330_sub46.readUnsignedByte(1165314998) << 6) * -1564485995);
			} else if (i == 55) {
				if (null == anIntArray3835)
					anIntArray3835 = (new int[(((Class362) ((Class364) this).aClass362_3810).aClass421_3797.disabledEquipmentSlots).length]);
				int i_8_ = class330_sub46.readUnsignedByte(1617720532);
				anIntArray3835[i_8_] = class330_sub46.readUnsignedShort(-171514234);
			} else if (i == 56) {
				if (anIntArrayArray3845 == null)
					anIntArrayArray3845 = (new int[(((Class362) ((Class364) this).aClass362_3810).aClass421_3797.disabledEquipmentSlots).length][]);
				int i_9_ = class330_sub46.readUnsignedByte(796499186);
				anIntArrayArray3845[i_9_] = new int[3];
				for (int i_10_ = 0; i_10_ < 3; i_10_++)
					anIntArrayArray3845[i_9_][i_10_] = class330_sub46.readShort(-1100583751);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pe.j(").append(')').toString());
		}
	}

	public boolean method4264(int i, int i_11_) {
		try {
			if (i == -1)
				return false;
			if (i == 1662674185 * anInt3808)
				return true;
			if (null != anIntArray3809) {
				for (int i_12_ = 0; i_12_ < anIntArray3809.length; i_12_++) {
					if (anIntArray3809[i_12_] == i)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pe.p(").append(')').toString());
		}
	}

	public Class247[] method4265(int i) {
		try {
			if (null != ((Class364) this).aClass247Array3846)
				return ((Class364) this).aClass247Array3846;
			if (null == anIntArrayArray3807)
				return null;
			((Class364) this).aClass247Array3846 = new Class247[anIntArrayArray3807.length];
			for (int i_13_ = 0; i_13_ < anIntArrayArray3807.length; i_13_++) {
				int i_14_ = 0;
				int i_15_ = 0;
				int i_16_ = 0;
				int i_17_ = 0;
				int i_18_ = 0;
				int i_19_ = 0;
				if (anIntArrayArray3807[i_13_] != null) {
					i_14_ = anIntArrayArray3807[i_13_][0];
					i_15_ = anIntArrayArray3807[i_13_][1];
					i_16_ = anIntArrayArray3807[i_13_][2];
					i_17_ = anIntArrayArray3807[i_13_][3] << 3;
					i_18_ = anIntArrayArray3807[i_13_][4] << 3;
					i_19_ = anIntArrayArray3807[i_13_][5] << 3;
				}
				if (0 == i_14_ && 0 == i_15_ && 0 == i_16_ && i_17_ == 0 && 0 == i_18_ && 0 == i_19_) {
					if (i == 1644604508) {
						/* empty */
					}
				} else {
					Class247 class247 = (((Class364) this).aClass247Array3846[i_13_] = new Class247());
					if (0 != i_19_)
						class247.method2462(0.0F, 0.0F, 1.0F, Class257.method2541(i_19_));
					if (0 != i_17_)
						class247.method2462(1.0F, 0.0F, 0.0F, Class257.method2541(i_17_));
					if (0 != i_18_)
						class247.method2462(0.0F, 1.0F, 0.0F, Class257.method2541(i_18_));
					class247.method2474((float) i_14_, (float) i_15_, (float) i_16_);
				}
			}
			return ((Class364) this).aClass247Array3846;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pe.o(").append(')').toString());
		}
	}

	public int[] method4266(byte i) {
		try {
			Class497 class497 = new Class497(16);
			Class511.method6181(1662674185 * anInt3808, class497, (byte) -78);
			if (null != anIntArray3809) {
				int[] is = anIntArray3809;
				for (int i_20_ = 0; i_20_ < is.length; i_20_++) {
					int i_21_ = is[i_20_];
					Class511.method6181(i_21_, class497, (byte) -77);
				}
			}
			Class511.method6181(-1649099791 * anInt3812, class497, (byte) -42);
			Class511.method6181(anInt3829 * -659327243, class497, (byte) -27);
			Class511.method6181(anInt3814 * 441580483, class497, (byte) -65);
			Class511.method6181(anInt3815 * -1290952703, class497, (byte) -33);
			Class511.method6181(119327185 * anInt3836, class497, (byte) -92);
			Class511.method6181(1083222597 * anInt3817, class497, (byte) -63);
			Class511.method6181(702160037 * anInt3818, class497, (byte) -127);
			Class511.method6181(anInt3819 * 1110452161, class497, (byte) -6);
			Class511.method6181(1164735859 * anInt3851, class497, (byte) -45);
			Class511.method6181(anInt3821 * 1886047885, class497, (byte) -81);
			Class511.method6181(anInt3822 * 1853423603, class497, (byte) -58);
			Class511.method6181(187748475 * anInt3823, class497, (byte) -55);
			Class511.method6181(17130543 * anInt3824, class497, (byte) -14);
			Class511.method6181(anInt3825 * -828007095, class497, (byte) -35);
			Class511.method6181(27779393 * anInt3826, class497, (byte) -74);
			Class511.method6181(-923174325 * anInt3827, class497, (byte) -92);
			Class511.method6181(anInt3828 * -1549872533, class497, (byte) -34);
			Class511.method6181(1660861201 * anInt3840, class497, (byte) -80);
			Class511.method6181(anInt3830 * 789126047, class497, (byte) -79);
			Class511.method6181(2015625873 * anInt3831, class497, (byte) -116);
			int[] is = new int[class497.method6096(-780566500)];
			int i_22_ = 0;
			Iterator iterator = class497.iterator();
			while (iterator.hasNext()) {
				Class330 class330 = (Class330) iterator.next();
				is[i_22_++] = (int) (class330.aLong3341 * -6154793640677333111L);
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pe.s(").append(')').toString());
		}
	}

	void method4267(Buffer class330_sub46, byte i) {
		try {
			for (;;) {
				int i_23_ = class330_sub46.readUnsignedByte(262430065);
				if (i_23_ == 0) {
					if (i != -1) {
						/* empty */
					}
					break;
				}
				method4263(class330_sub46, i_23_, (short) 255);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pe.r(").append(')').toString());
		}
	}

	public int method4268(int i) {
		try {
			if (-1 != anInt3808 * 1662674185)
				return 1662674185 * anInt3808;
			if (anIntArray3809 != null) {
				int i_24_ = (int) (Math.random() * (double) (-842910499 * ((Class364) this).anInt3811));
				int i_25_;
				for (i_25_ = 0; i_24_ >= anIntArray3833[i_25_]; i_25_++)
					i_24_ -= anIntArray3833[i_25_];
				return anIntArray3809[i_25_];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pe.i(").append(')').toString());
		}
	}
}
