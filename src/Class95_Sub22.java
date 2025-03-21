/* Class95_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

public class Class95_Sub22 extends Class95 {
	int anInt7205;
	int anInt7206;
	int anInt7207;
	int anInt7208;
	int anInt7209;
	public static Class13[] aClass13Array7210;

	Class95_Sub22(Buffer class330_sub46) {
		super(class330_sub46);
		((Class95_Sub22) this).anInt7208 = class330_sub46.readUnsignedShort(500501546) * -1710774151;
		int i = class330_sub46.readUnsignedByte(307508583);
		if (0 != (i & 0x1)) {
			((Class95_Sub22) this).anInt7209 = class330_sub46.readUnsignedShort(1319649896) * 688460305;
			((Class95_Sub22) this).anInt7207 = class330_sub46.readUnsignedShort(1767418454) * -1977595469;
		} else {
			((Class95_Sub22) this).anInt7209 = -688460305;
			((Class95_Sub22) this).anInt7207 = 1977595469;
		}
		if (0 != (i & 0x2)) {
			((Class95_Sub22) this).anInt7206 = class330_sub46.readUnsignedShort(1513092076) * 916383967;
			((Class95_Sub22) this).anInt7205 = class330_sub46.readUnsignedShort(281619915) * 438070755;
		} else {
			((Class95_Sub22) this).anInt7206 = -916383967;
			((Class95_Sub22) this).anInt7205 = -438070755;
		}
		if (0 != (i & 0x4)) {
			int i_0_ = class330_sub46.readUnsignedShort(1120305462);
			int i_1_ = class330_sub46.readUnsignedShort(-284253566);
			int i_2_ = i_0_ * 255 / i_1_;
			if (i_0_ > 0 && i_2_ < 1) {
				boolean bool = true;
			}
		}
	}

	public void method1095(int i) {
		try {
			Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1 = Class96.aClass85Array854[1852195273 * ((Class95_Sub22) this).anInt7208].method973(-1160484525);
			class432_sub1_sub1_sub1.method5423(((Class95_Sub22) this).anInt7209 * 282599153, ((Class95_Sub22) this).anInt7207 * -771256965, ((Class95_Sub22) this).anInt7206 * -949038305, ((Class95_Sub22) this).anInt7205 * -1374797877, 822953439 * client.anInt8981, 0, -152047037);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zw.j(").append(')').toString());
		}
	}

	public void method1099() {
		Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1 = Class96.aClass85Array854[1852195273 * ((Class95_Sub22) this).anInt7208].method973(-1160484525);
		class432_sub1_sub1_sub1.method5423(((Class95_Sub22) this).anInt7209 * 282599153, ((Class95_Sub22) this).anInt7207 * -771256965, ((Class95_Sub22) this).anInt7206 * -949038305, ((Class95_Sub22) this).anInt7205 * -1374797877, 822953439 * client.anInt8981, 0, 905153212);
	}

	public void method1098() {
		Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1 = Class96.aClass85Array854[1852195273 * ((Class95_Sub22) this).anInt7208].method973(-1160484525);
		class432_sub1_sub1_sub1.method5423(((Class95_Sub22) this).anInt7209 * 282599153, ((Class95_Sub22) this).anInt7207 * -771256965, ((Class95_Sub22) this).anInt7206 * -949038305, ((Class95_Sub22) this).anInt7205 * -1374797877, 822953439 * client.anInt8981, 0, -1317730056);
	}

	public void method1100() {
		Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1 = Class96.aClass85Array854[1852195273 * ((Class95_Sub22) this).anInt7208].method973(-1160484525);
		class432_sub1_sub1_sub1.method5423(((Class95_Sub22) this).anInt7209 * 282599153, ((Class95_Sub22) this).anInt7207 * -771256965, ((Class95_Sub22) this).anInt7206 * -949038305, ((Class95_Sub22) this).anInt7205 * -1374797877, 822953439 * client.anInt8981, 0, 1941356402);
	}

	static final void method1172(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub3_7880.method5742(481121493) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zw.aqj(").append(')').toString());
		}
	}

	public static Class_ra method1173(int i, Canvas canvas, Interface_ma interface_ma, IndexTable class280, int i_3_, int i_4_) {
		try {
			int i_5_ = 0;
			int i_6_ = 0;
			if (null != canvas) {
				Dimension dimension = canvas.getSize();
				i_5_ = dimension.width;
				i_6_ = dimension.height;
			}
			return Class3.method397(i, canvas, interface_ma, class280, i_3_, i_5_, i_6_, (byte) -3);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zw.j(").append(')').toString());
		}
	}

	static final void method1174(Class430 class430, int i) {
		try {
			int i_7_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.GE_SELECT_PACKET, client.aClass1_9025.aClass488_22, 1289794868);
			class330_sub34.aClass330_Sub46_Sub2_7729.addShort(i_7_, (byte) 100);
			client.aClass1_9025.method378(class330_sub34, -1505831772);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zw.sv(").append(')').toString());
		}
	}

	public static void method1175(String string, boolean bool, Class_ra class_ra, Class263 class263, Class524 class524, int i) {
		try {
			boolean bool_8_ = !Class227.aBoolean2424 || Class532.method6299((byte) 13);
			if (bool_8_) {
				if (Class227.aBoolean2424 && bool_8_) {
					class524 = Class18.aClass524_236;
					class263 = class_ra.ce(class524, Class366.aClass87_Sub2Array3857, true);
					int i_9_ = class524.method6246(string, 250, null, (byte) 21);
					int i_10_ = class524.method6247(string, 250, 35438517 * class524.anInt6030, null, 1274617093);
					int i_11_ = Class18.aClass87_235.method986();
					int i_12_ = i_11_ + 4;
					i_9_ += i_12_ * 2;
					i_10_ += i_12_ * 2;
					if (i_9_ < 1140682019 * Class18.anInt230)
						i_9_ = 1140682019 * Class18.anInt230;
					if (i_10_ < 1645823231 * Class18.anInt234)
						i_10_ = Class18.anInt234 * 1645823231;
					int i_13_ = (Class18.aClass195_233.method2137(i_9_, (64571523 * (client.anInt9207)), 1097467466) + Class156.anInt6464 * 212158559);
					int i_14_ = (Class18.aClass211_231.method2221(i_10_, (1108170155 * (client.anInt9118)), (byte) -113) + Class18.anInt232 * 1280884245);
					class_ra.bw(Class13.aClass87_174, false).method694(i_13_ + Class536.aClass87_6233.method986(), i_14_ + Class536.aClass87_6233.method994(), i_9_ - Class536.aClass87_6233.method986() * 2, i_10_ - Class536.aClass87_6233.method994() * 2, 1, -1, 0);
					class_ra.bw(Class536.aClass87_6233, true).method687(i_13_, i_14_);
					Class536.aClass87_6233.method998();
					class_ra.bw(Class536.aClass87_6233, true).method687(i_9_ + i_13_ - i_11_, i_14_);
					Class536.aClass87_6233.method999();
					class_ra.bw(Class536.aClass87_6233, true).method687(i_13_ + i_9_ - i_11_, i_10_ + i_14_ - i_11_);
					Class536.aClass87_6233.method998();
					class_ra.bw(Class536.aClass87_6233, true).method687(i_13_, i_10_ + i_14_ - i_11_);
					Class536.aClass87_6233.method999();
					class_ra.bw(Class18.aClass87_235, true).method721(i_13_, i_14_ + Class536.aClass87_6233.method994(), i_11_, i_10_ - Class536.aClass87_6233.method994() * 2);
					Class18.aClass87_235.method1000();
					class_ra.bw(Class18.aClass87_235, true).method721(i_13_ + Class536.aClass87_6233.method986(), i_14_, i_9_ - Class536.aClass87_6233.method986() * 2, i_11_);
					Class18.aClass87_235.method1000();
					class_ra.bw(Class18.aClass87_235, true).method721(i_13_ + i_9_ - i_11_, i_14_ + Class536.aClass87_6233.method994(), i_11_, i_10_ - Class536.aClass87_6233.method994() * 2);
					Class18.aClass87_235.method1000();
					class_ra.bw(Class18.aClass87_235, true).method721(i_13_ + Class536.aClass87_6233.method986(), i_14_ + i_10_ - i_11_, i_9_ - Class536.aClass87_6233.method986() * 2, i_11_);
					Class18.aClass87_235.method1000();
					class263.method2613(string, i_12_ + i_13_, i_14_ + i_12_, i_9_ - i_12_ * 2, i_10_ - i_12_ * 2, (1381613007 * Class463.anInt5585 | ~0xffffff), -1, 1, 1, 0, null, null, null, 0, 0, (byte) 90);
					Class524.method6252(i_13_, i_14_, i_9_, i_10_, (byte) 49);
				} else {
					int i_15_ = class524.method6246(string, 250, null, (byte) 81);
					int i_16_ = (class524.method6251(string, 250, null, -2036792645) * 13);
					int i_17_ = 4;
					int i_18_ = 6 + i_17_;
					int i_19_ = i_17_ + 6;
					class_ra.B(i_18_ - i_17_, i_19_ - i_17_, i_17_ + (i_15_ + i_17_), i_17_ + (i_16_ + i_17_), -16777216, 0);
					class_ra.bl(i_18_ - i_17_, i_19_ - i_17_, i_15_ + i_17_ + i_17_, i_16_ + i_17_ + i_17_, -1, 0);
					class263.method2613(string, i_18_, i_19_, i_15_, i_16_, -1, -1, 1, 1, 0, null, null, null, 0, 0, (byte) 88);
					Class524.method6252(i_18_ - i_17_, i_19_ - i_17_, i_17_ + i_15_ + i_17_, i_17_ + (i_17_ + i_16_), (byte) -17);
				}
				if (bool) {
					try {
						class_ra.method4804();
						class_ra.method4786(421463875);
					} catch (Exception_Sub1 exception_sub1) {
						/* empty */
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zw.i(").append(')').toString());
		}
	}
}
