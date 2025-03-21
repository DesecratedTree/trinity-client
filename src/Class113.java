/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public class Class113 {
	Class104[] aClass104Array1165;
	String aString1166;
	static int anInt1167 = 256;
	static int anInt1168 = 4;
	Class104[] aClass104Array1169;
	Class118[] aClass118Array1170;
	static int anInt1171 = 2;

	void method1382(byte[] is, int i) throws Exception_Sub3 {
		try {
			Class115 class115 = new Class115(is);
			int i_0_ = class115.method1413(-1703485212);
			if (i_0_ != 4)
				throw new Exception_Sub3(this, i_0_, 4);
			((Class113) this).aString1166 = class115.method1414(6389687);
			((Class113) this).aClass104Array1165 = new Class104[class115.method1413(1239041316)];
			((Class113) this).aClass104Array1169 = new Class104[class115.method1413(111054093)];
			((Class113) this).aClass118Array1170 = new Class118[class115.method1413(39232375)];
			for (int i_1_ = 0; i_1_ < ((Class113) this).aClass104Array1165.length; i_1_++) {
				((Class113) this).aClass104Array1165[i_1_] = new Class104();
				((Class113) this).aClass104Array1165[i_1_].method1242(class115, (byte) 60);
			}
			for (int i_2_ = 0; i_2_ < ((Class113) this).aClass104Array1169.length; i_2_++) {
				((Class113) this).aClass104Array1169[i_2_] = new Class104();
				((Class113) this).aClass104Array1169[i_2_].method1242(class115, (byte) 66);
			}
			for (int i_3_ = 0; i_3_ < ((Class113) this).aClass118Array1170.length; i_3_++) {
				((Class113) this).aClass118Array1170[i_3_] = new Class118();
				((Class113) this).aClass118Array1170[i_3_].method1427(class115, -1923739953);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eo.r(").append(')').toString());
		}
	}

	public Class113(byte[] is) throws Exception_Sub3 {
		method1382(is, -1263523592);
	}

	static final void method1383(Class430 class430, byte i) {
		try {
			int i_4_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_4_, 1200779758);
			int i_5_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			i_5_--;
			if (null == iComponentDefinitions.aStringArray1284 || i_5_ >= iComponentDefinitions.aStringArray1284.length || iComponentDefinitions.aStringArray1284[i_5_] == null)
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
			else
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = iComponentDefinitions.aStringArray1284[i_5_];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eo.su(").append(')').toString());
		}
	}

	public static void method1384(int i) {
		try {
			if (null == Class130.aFrame1498) {
				int i_6_ = client.anInt6611 * -1722268593;
				int i_7_ = 1819216065 * client.anInt6612;
				int i_8_ = (-1408375895 * client.anInt6609 - -1969079741 * Class300.anInt3058 - i_6_);
				int i_9_ = (Class520.anInt6017 * 394893517 - -1548608507 * Class146.anInt1615 - i_7_);
				if (i_6_ > 0 || i_8_ > 0 || i_7_ > 0 || i_9_ > 0) {
					try {
						Container container = Class432_Sub1_Sub3_Sub1.method5526((byte) 85);
						int i_10_ = 0;
						int i_11_ = 0;
						if (Class267.aFrame2740 == container) {
							Insets insets = Class267.aFrame2740.getInsets();
							i_10_ = insets.left;
							i_11_ = insets.top;
						}
						Graphics graphics = container.getGraphics();
						graphics.setColor(Color.black);
						if (i_6_ > 0)
							graphics.fillRect(i_10_, i_11_, i_6_, Class520.anInt6017 * 394893517);
						if (i_7_ > 0)
							graphics.fillRect(i_10_, i_11_, -1408375895 * client.anInt6609, i_7_);
						if (i_8_ > 0)
							graphics.fillRect((-1408375895 * client.anInt6609 + i_10_ - i_8_), i_11_, i_8_, Class520.anInt6017 * 394893517);
						if (i_9_ > 0)
							graphics.fillRect(i_10_, (i_11_ + 394893517 * Class520.anInt6017 - i_9_), client.anInt6609 * -1408375895, i_9_);
					} catch (Exception exception) {
						/* empty */
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eo.gr(").append(')').toString());
		}
	}

	public static final int method1385(String string, byte i) {
		try {
			if (null == string)
				return -1;
			for (int i_12_ = 0; i_12_ < client.anInt9256 * 652732387; i_12_++) {
				if (string.equalsIgnoreCase(client.aClass99Array9259[i_12_].aString915))
					return i_12_;
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eo.mz(").append(')').toString());
		}
	}

	public static String method1386(Buffer class330_sub46, int i) {
		try {
			String string;
			try {
				int i_13_ = class330_sub46.readSmart(-967628430);
				if (i_13_ > 32767)
					i_13_ = 32767;
				byte[] is = new byte[i_13_];
				class330_sub46.offset += (Class142.aClass143_1567.method1657(class330_sub46.payload, -824785231 * class330_sub46.offset, is, 0, i_13_, -779423509)) * 323600977;
				String string_14_ = Class125.method1525(is, 0, i_13_, (byte) 1);
				string = string_14_;
			} catch (Exception exception) {
				string = "Cabbage";
			}
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eo.i(").append(')').toString());
		}
	}
}
