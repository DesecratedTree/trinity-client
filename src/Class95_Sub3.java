/* Class95_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class95_Sub3 extends Class95 {
	int anInt7121;
	static int anInt7122 = 1;
	int anInt7123;
	int anInt7124;
	int anInt7125;
	static int anInt7126 = 0;
	int anInt7127;
	int anInt7128;
	int anInt7129;
	int anInt7130;
	int anInt7131;
	int anInt7132;
	int anInt7133;
	int anInt7134;
	int anInt7135;

	Class95_Sub3(Buffer class330_sub46, int i, int i_0_) {
		super(class330_sub46);
		if (0 == i) {
			int i_1_ = class330_sub46.readInt((byte) 108);
			((Class95_Sub3) this).anInt7121 = (i_1_ >>> 16) * -965007875;
			((Class95_Sub3) this).anInt7131 = (i_1_ & 0xffff) * 1445521713;
			((Class95_Sub3) this).anInt7124 = -217526261;
		} else {
			((Class95_Sub3) this).anInt7121 = 965007875;
			((Class95_Sub3) this).anInt7131 = -1445521713;
			((Class95_Sub3) this).anInt7124 = class330_sub46.readUnsignedShort(-421967354) * 217526261;
		}
		if (0 == i_0_) {
			int i_2_ = class330_sub46.readInt((byte) 105);
			((Class95_Sub3) this).anInt7129 = (i_2_ >>> 16) * 103980577;
			((Class95_Sub3) this).anInt7130 = (i_2_ & 0xffff) * 1214436757;
			((Class95_Sub3) this).anInt7123 = -130571519;
		} else {
			((Class95_Sub3) this).anInt7129 = -103980577;
			((Class95_Sub3) this).anInt7130 = -1214436757;
			((Class95_Sub3) this).anInt7123 = class330_sub46.readUnsignedShort(753892096) * 130571519;
		}
		if (0 == i && 0 == i_0_)
			((Class95_Sub3) this).anInt7132 = class330_sub46.readUnsignedByte(-104973052) * -621291839;
		else
			((Class95_Sub3) this).anInt7132 = 621291839;
		((Class95_Sub3) this).anInt7125 = class330_sub46.readUnsignedShort(1991424883) * 719743759;
		((Class95_Sub3) this).anInt7127 = class330_sub46.readUnsignedByte(941496691) * -1198821177;
		((Class95_Sub3) this).anInt7128 = class330_sub46.readUnsignedByte(1306363313) * -1840391287;
		((Class95_Sub3) this).anInt7133 = class330_sub46.readUnsignedTriByte(-1401356047) * 674332561;
		((Class95_Sub3) this).anInt7134 = class330_sub46.readUnsignedShort(1686421556) * 1244903957;
		((Class95_Sub3) this).anInt7135 = class330_sub46.readUnsignedByte(1100239917) * 252707241;
	}

	boolean method1097(int i) {
		try {
			Class437 class437 = Class136.aClass416_1527.method5254((1171334127 * (((Class95_Sub3) this).anInt7125)), 1701653816);
			boolean bool = class437.method5584((byte) -125);
			Class440 class440 = Class201.aClass436_6511.method5570(class437.anInt4431 * 1258856743, -69118074);
			bool &= class440.method5600(2134034420);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aag.p(").append(')').toString());
		}
	}

	public void method1095(int i) {
		try {
			int i_3_;
			int i_4_;
			int i_5_;
			if (((Class95_Sub3) this).anInt7121 * 1806294869 >= 0) {
				i_3_ = 256 + 1405004288 * ((Class95_Sub3) this).anInt7121;
				i_4_ = 256 + ((Class95_Sub3) this).anInt7131 * -140533248;
				i_5_ = ((Class95_Sub3) this).anInt7132 * 505526593;
			} else {
				Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1 = Class96.aClass85Array854[1645003869 * ((Class95_Sub3) this).anInt7124].method973(-1160484525);
				Class260 class260 = class432_sub1_sub1_sub1.method5346().aClass260_2606;
				i_3_ = (int) class260.aFloat2716;
				i_4_ = (int) class260.aFloat2711;
				i_5_ = class432_sub1_sub1_sub1.aByte8658;
			}
			int i_6_;
			int i_7_;
			if (((Class95_Sub3) this).anInt7131 * -1040461871 >= 0) {
				i_6_ = 256 + ((Class95_Sub3) this).anInt7129 * 1087095296;
				i_7_ = ((Class95_Sub3) this).anInt7130 * 26966528 + 256;
			} else {
				Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1 = Class96.aClass85Array854[-2123455745 * ((Class95_Sub3) this).anInt7123].method973(-1160484525);
				Class260 class260 = class432_sub1_sub1_sub1.method5346().aClass260_2606;
				i_6_ = (int) class260.aFloat2716;
				i_7_ = (int) class260.aFloat2711;
				if (i_5_ < 0)
					i_5_ = class432_sub1_sub1_sub1.aByte8658;
			}
			int i_8_ = ((Class95_Sub3) this).anInt7135 * -809749863 << 2;
			Class432_Sub1_Sub1_Sub2 class432_sub1_sub1_sub2 = (new Class432_Sub1_Sub1_Sub2(client.aClass304_9030.method3023(-400722441), 1171334127 * ((Class95_Sub3) this).anInt7125, i_5_, i_5_, i_3_, i_4_, 1745375479 * ((Class95_Sub3) this).anInt7127 << 2, 822953439 * client.anInt8981, (((Class95_Sub3) this).anInt7133 * -2065358479 + client.anInt8981 * 822953439), ((Class95_Sub3) this).anInt7134 * -659471043, i_8_, 1 + 1645003869 * ((Class95_Sub3) this).anInt7124, 1 + ((Class95_Sub3) this).anInt7123 * -2123455745, ((Class95_Sub3) this).anInt7128 * 1520503481 << 2, false, 0, 0));
			class432_sub1_sub1_sub2.method5498(i_6_, i_7_, 1520503481 * ((Class95_Sub3) this).anInt7128 << 2, (-2065358479 * ((Class95_Sub3) this).anInt7133 + 822953439 * client.anInt8981), 1222236922);
			client.aClass471_9139.method5878(new Class330_Sub36_Sub11(class432_sub1_sub1_sub2), (short) 8192);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aag.j(").append(')').toString());
		}
	}

	public void method1100() {
		int i;
		int i_9_;
		int i_10_;
		if (((Class95_Sub3) this).anInt7121 * 1806294869 >= 0) {
			i = 256 + 1405004288 * ((Class95_Sub3) this).anInt7121;
			i_9_ = 256 + ((Class95_Sub3) this).anInt7131 * -140533248;
			i_10_ = ((Class95_Sub3) this).anInt7132 * 505526593;
		} else {
			Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1 = Class96.aClass85Array854[1645003869 * ((Class95_Sub3) this).anInt7124].method973(-1160484525);
			Class260 class260 = class432_sub1_sub1_sub1.method5346().aClass260_2606;
			i = (int) class260.aFloat2716;
			i_9_ = (int) class260.aFloat2711;
			i_10_ = class432_sub1_sub1_sub1.aByte8658;
		}
		int i_11_;
		int i_12_;
		if (((Class95_Sub3) this).anInt7131 * -1040461871 >= 0) {
			i_11_ = 256 + ((Class95_Sub3) this).anInt7129 * 1087095296;
			i_12_ = ((Class95_Sub3) this).anInt7130 * 26966528 + 256;
		} else {
			Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1 = Class96.aClass85Array854[-2123455745 * ((Class95_Sub3) this).anInt7123].method973(-1160484525);
			Class260 class260 = class432_sub1_sub1_sub1.method5346().aClass260_2606;
			i_11_ = (int) class260.aFloat2716;
			i_12_ = (int) class260.aFloat2711;
			if (i_10_ < 0)
				i_10_ = class432_sub1_sub1_sub1.aByte8658;
		}
		int i_13_ = ((Class95_Sub3) this).anInt7135 * -809749863 << 2;
		Class432_Sub1_Sub1_Sub2 class432_sub1_sub1_sub2 = (new Class432_Sub1_Sub1_Sub2(client.aClass304_9030.method3023(-400722441), 1171334127 * ((Class95_Sub3) this).anInt7125, i_10_, i_10_, i, i_9_, 1745375479 * ((Class95_Sub3) this).anInt7127 << 2, 822953439 * client.anInt8981, (((Class95_Sub3) this).anInt7133 * -2065358479 + client.anInt8981 * 822953439), ((Class95_Sub3) this).anInt7134 * -659471043, i_13_, 1 + 1645003869 * ((Class95_Sub3) this).anInt7124, 1 + ((Class95_Sub3) this).anInt7123 * -2123455745, ((Class95_Sub3) this).anInt7128 * 1520503481 << 2, false, 0, 0));
		class432_sub1_sub1_sub2.method5498(i_11_, i_12_, 1520503481 * ((Class95_Sub3) this).anInt7128 << 2, (-2065358479 * ((Class95_Sub3) this).anInt7133 + 822953439 * client.anInt8981), -296788785);
		client.aClass471_9139.method5878(new Class330_Sub36_Sub11(class432_sub1_sub1_sub2), (short) 8192);
	}

	public void method1098() {
		int i;
		int i_14_;
		int i_15_;
		if (((Class95_Sub3) this).anInt7121 * 1806294869 >= 0) {
			i = 256 + 1405004288 * ((Class95_Sub3) this).anInt7121;
			i_14_ = 256 + ((Class95_Sub3) this).anInt7131 * -140533248;
			i_15_ = ((Class95_Sub3) this).anInt7132 * 505526593;
		} else {
			Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1 = Class96.aClass85Array854[1645003869 * ((Class95_Sub3) this).anInt7124].method973(-1160484525);
			Class260 class260 = class432_sub1_sub1_sub1.method5346().aClass260_2606;
			i = (int) class260.aFloat2716;
			i_14_ = (int) class260.aFloat2711;
			i_15_ = class432_sub1_sub1_sub1.aByte8658;
		}
		int i_16_;
		int i_17_;
		if (((Class95_Sub3) this).anInt7131 * -1040461871 >= 0) {
			i_16_ = 256 + ((Class95_Sub3) this).anInt7129 * 1087095296;
			i_17_ = ((Class95_Sub3) this).anInt7130 * 26966528 + 256;
		} else {
			Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1 = Class96.aClass85Array854[-2123455745 * ((Class95_Sub3) this).anInt7123].method973(-1160484525);
			Class260 class260 = class432_sub1_sub1_sub1.method5346().aClass260_2606;
			i_16_ = (int) class260.aFloat2716;
			i_17_ = (int) class260.aFloat2711;
			if (i_15_ < 0)
				i_15_ = class432_sub1_sub1_sub1.aByte8658;
		}
		int i_18_ = ((Class95_Sub3) this).anInt7135 * -809749863 << 2;
		Class432_Sub1_Sub1_Sub2 class432_sub1_sub1_sub2 = (new Class432_Sub1_Sub1_Sub2(client.aClass304_9030.method3023(-400722441), 1171334127 * ((Class95_Sub3) this).anInt7125, i_15_, i_15_, i, i_14_, 1745375479 * ((Class95_Sub3) this).anInt7127 << 2, 822953439 * client.anInt8981, (((Class95_Sub3) this).anInt7133 * -2065358479 + client.anInt8981 * 822953439), ((Class95_Sub3) this).anInt7134 * -659471043, i_18_, 1 + 1645003869 * ((Class95_Sub3) this).anInt7124, 1 + ((Class95_Sub3) this).anInt7123 * -2123455745, ((Class95_Sub3) this).anInt7128 * 1520503481 << 2, false, 0, 0));
		class432_sub1_sub1_sub2.method5498(i_16_, i_17_, 1520503481 * ((Class95_Sub3) this).anInt7128 << 2, (-2065358479 * ((Class95_Sub3) this).anInt7133 + 822953439 * client.anInt8981), -2084501140);
		client.aClass471_9139.method5878(new Class330_Sub36_Sub11(class432_sub1_sub1_sub2), (short) 8192);
	}

	public void method1099() {
		int i;
		int i_19_;
		int i_20_;
		if (((Class95_Sub3) this).anInt7121 * 1806294869 >= 0) {
			i = 256 + 1405004288 * ((Class95_Sub3) this).anInt7121;
			i_19_ = 256 + ((Class95_Sub3) this).anInt7131 * -140533248;
			i_20_ = ((Class95_Sub3) this).anInt7132 * 505526593;
		} else {
			Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1 = Class96.aClass85Array854[1645003869 * ((Class95_Sub3) this).anInt7124].method973(-1160484525);
			Class260 class260 = class432_sub1_sub1_sub1.method5346().aClass260_2606;
			i = (int) class260.aFloat2716;
			i_19_ = (int) class260.aFloat2711;
			i_20_ = class432_sub1_sub1_sub1.aByte8658;
		}
		int i_21_;
		int i_22_;
		if (((Class95_Sub3) this).anInt7131 * -1040461871 >= 0) {
			i_21_ = 256 + ((Class95_Sub3) this).anInt7129 * 1087095296;
			i_22_ = ((Class95_Sub3) this).anInt7130 * 26966528 + 256;
		} else {
			Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1 = Class96.aClass85Array854[-2123455745 * ((Class95_Sub3) this).anInt7123].method973(-1160484525);
			Class260 class260 = class432_sub1_sub1_sub1.method5346().aClass260_2606;
			i_21_ = (int) class260.aFloat2716;
			i_22_ = (int) class260.aFloat2711;
			if (i_20_ < 0)
				i_20_ = class432_sub1_sub1_sub1.aByte8658;
		}
		int i_23_ = ((Class95_Sub3) this).anInt7135 * -809749863 << 2;
		Class432_Sub1_Sub1_Sub2 class432_sub1_sub1_sub2 = (new Class432_Sub1_Sub1_Sub2(client.aClass304_9030.method3023(-400722441), 1171334127 * ((Class95_Sub3) this).anInt7125, i_20_, i_20_, i, i_19_, 1745375479 * ((Class95_Sub3) this).anInt7127 << 2, 822953439 * client.anInt8981, (((Class95_Sub3) this).anInt7133 * -2065358479 + client.anInt8981 * 822953439), ((Class95_Sub3) this).anInt7134 * -659471043, i_23_, 1 + 1645003869 * ((Class95_Sub3) this).anInt7124, 1 + ((Class95_Sub3) this).anInt7123 * -2123455745, ((Class95_Sub3) this).anInt7128 * 1520503481 << 2, false, 0, 0));
		class432_sub1_sub1_sub2.method5498(i_21_, i_22_, 1520503481 * ((Class95_Sub3) this).anInt7128 << 2, (-2065358479 * ((Class95_Sub3) this).anInt7133 + 822953439 * client.anInt8981), 1048798493);
		client.aClass471_9139.method5878(new Class330_Sub36_Sub11(class432_sub1_sub1_sub2), (short) 8192);
	}

	boolean method1111() {
		Class437 class437 = Class136.aClass416_1527.method5254(1171334127 * ((Class95_Sub3) this).anInt7125, -1510480095);
		boolean bool = class437.method5584((byte) -31);
		Class440 class440 = Class201.aClass436_6511.method5570(class437.anInt4431 * 1258856743, -1408324732);
		bool &= class440.method5600(2097210661);
		return bool;
	}

	boolean method1112() {
		Class437 class437 = Class136.aClass416_1527.method5254(1171334127 * ((Class95_Sub3) this).anInt7125, 1395166200);
		boolean bool = class437.method5584((byte) -10);
		Class440 class440 = Class201.aClass436_6511.method5570(class437.anInt4431 * 1258856743, 658479723);
		bool &= class440.method5600(2033844314);
		return bool;
	}

	boolean method1113() {
		Class437 class437 = Class136.aClass416_1527.method5254(1171334127 * ((Class95_Sub3) this).anInt7125, -1622236372);
		boolean bool = class437.method5584((byte) -88);
		Class440 class440 = Class201.aClass436_6511.method5570(class437.anInt4431 * 1258856743, -1285754425);
		bool &= class440.method5600(792072944);
		return bool;
	}

	static final int method1114(Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1, byte i) {
		try {
			if (class432_sub1_sub1_sub1.anInt10051 * 1733505955 == 0)
				return 0;
			if (-1 != class432_sub1_sub1_sub1.anInt10028 * -2029779553) {
				Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1_24_ = null;
				if (-2029779553 * class432_sub1_sub1_sub1.anInt10028 < 32768) {
					Class330_Sub35 class330_sub35 = ((Class330_Sub35) (client.aClass497_9014.method6094((long) (class432_sub1_sub1_sub1.anInt10028 * -2029779553))));
					if (null != class330_sub35)
						class432_sub1_sub1_sub1_24_ = ((Class432_Sub1_Sub1_Sub1) class330_sub35.anObject7733);
				} else if (-2029779553 * class432_sub1_sub1_sub1.anInt10028 >= 32768)
					class432_sub1_sub1_sub1_24_ = (client.players[(class432_sub1_sub1_sub1.anInt10028 * -2029779553 - 32768)]);
				if (class432_sub1_sub1_sub1_24_ != null) {
					Class260 class260 = Class260.method2561(class432_sub1_sub1_sub1.method5346().aClass260_2606, (class432_sub1_sub1_sub1_24_.method5346().aClass260_2606));
					int i_25_ = (int) class260.aFloat2716;
					int i_26_ = (int) class260.aFloat2711;
					if (0 != i_25_ || i_26_ != 0)
						class432_sub1_sub1_sub1.method5410((int) (Math.atan2((double) i_25_, (double) i_26_) * 2607.5945876176133) & 0x3fff, (byte) -44);
				}
			}
			if (class432_sub1_sub1_sub1 instanceof Player) {
				Player class432_sub1_sub1_sub1_sub1 = (Player) class432_sub1_sub1_sub1;
				if (-1 != -1136372835 * class432_sub1_sub1_sub1_sub1.anInt10232 && ((815331179 * class432_sub1_sub1_sub1_sub1.anInt10056 == 0) || (-265950655 * class432_sub1_sub1_sub1_sub1.anInt10060) > 0)) {
					class432_sub1_sub1_sub1_sub1.method5410(-1136372835 * class432_sub1_sub1_sub1_sub1.anInt10232, (byte) -95);
					class432_sub1_sub1_sub1_sub1.anInt10232 = 194786635;
				}
			} else if (class432_sub1_sub1_sub1 instanceof NPC) {
				NPC class432_sub1_sub1_sub1_sub2 = (NPC) class432_sub1_sub1_sub1;
				if (1770044399 * class432_sub1_sub1_sub1_sub2.anInt10261 != -1 && ((815331179 * class432_sub1_sub1_sub1_sub2.anInt10056 == 0) || (class432_sub1_sub1_sub1_sub2.anInt10060 * -265950655) > 0)) {
					Class260 class260 = (class432_sub1_sub1_sub1_sub2.method5346().aClass260_2606);
					Class381 class381 = client.aClass304_9030.method3022(1660793861);
					int i_27_ = ((int) class260.aFloat2716 - ((class432_sub1_sub1_sub1_sub2.anInt10261 * -2135167232) - -700579584 * class381.gameSceneBaseX - class381.gameSceneBaseX * -700579584));
					int i_28_ = ((int) class260.aFloat2711 - ((1362326784 * class432_sub1_sub1_sub1_sub2.anInt10252) - 235434240 * class381.gameSceneBaseY - 235434240 * class381.gameSceneBaseY));
					if (0 != i_27_ || 0 != i_28_)
						class432_sub1_sub1_sub1_sub2.method5410((int) (Math.atan2((double) i_27_, (double) i_28_) * 2607.5945876176133) & 0x3fff, (byte) -42);
					class432_sub1_sub1_sub1_sub2.anInt10261 = 1889414385;
				}
			}
			return class432_sub1_sub1_sub1.method5412(1946076715);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aag.hp(").append(')').toString());
		}
	}
}
