/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Frame;
import java.io.File;

import javax.swing.JFileChooser;

public class Class19 implements Runnable {
	boolean aBoolean239;
	String aString240;
	File aFile241 = null;
	boolean aBoolean242 = false;
	static String aString243;

	public boolean method454(int i) {
		try {
			return ((Class19) this).aBoolean242;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("at.j(").append(')').toString());
		}
	}

	public File method455(int i) {
		try {
			return ((Class19) this).aFile241;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("at.r(").append(')').toString());
		}
	}

	public Class19(String string, boolean bool) {
		((Class19) this).aString240 = string;
		((Class19) this).aBoolean239 = bool;
		new Thread(this).start();
	}

	boolean method456(int i) {
		try {
			return ((Class19) this).aBoolean239;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("at.i(").append(')').toString());
		}
	}

	public void run() {
		try {
			Container container = Class432_Sub1_Sub3_Sub1.method5526((byte) 124);
			Frame frame = null;
			if (null != Class267.aFrame2740)
				frame = Class267.aFrame2740;
			else {
				for (/**/; null != container; container = container.getParent()) {
					if (container instanceof Frame) {
						frame = (Frame) container;
						break;
					}
				}
			}
			if (null == frame)
				throw new RuntimeException("");
			JFileChooser jfilechooser = new JFileChooser("");
			jfilechooser.setDialogTitle(((Class19) this).aString240);
			jfilechooser.setFileFilter(new FileFilter_Sub1(this, this));
			jfilechooser.setFileSelectionMode(1);
			jfilechooser.setAcceptAllFileFilterUsed(false);
			int i = jfilechooser.showOpenDialog(frame);
			if (0 == i)
				((Class19) this).aFile241 = jfilechooser.getSelectedFile();
			((Class19) this).aBoolean242 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("at.run(").append(')').toString());
		}
	}

	public static void method457(int i, String string, int i_0_, short i_1_) {
		try {
			ClientScript class330_sub36_sub8 = IsaacCipher.method6051(Class545.aClass545_6994, i, -1, (byte) -66);
			if (null != class330_sub36_sub8) {
				Class430 class430 = Class325_Sub6.method3229((byte) 71);
				((Class430) class430).anIntArray4388 = new int[class330_sub36_sub8.anInt9676 * 452911023];
				((Class430) class430).anObjectArray4375 = new String[class330_sub36_sub8.anInt9672 * 1732863009];
				((Class430) class430).anObjectArray4375[0] = string;
				((Class430) class430).anIntArray4388[0] = i_0_;
				Class330_Sub12.method3302(class330_sub36_sub8, 200000, class430, -1871065489);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("at.b(").append(')').toString());
		}
	}

	static final void method458(Class430 class430, int i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (2 == -843487341 * client.anInt9257 && i_2_ >= 0 && i_2_ < 652732387 * client.anInt9256)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = client.aClass99Array9259[i_2_].anInt914 * -164277611;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("at.xg(").append(')').toString());
		}
	}

	static final void method459(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_3_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_4_ = (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			Class458.method5670(i_3_, i_4_ >> 14 & 0x3fff, i_4_ & 0x3fff, false, -1491137655);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("at.aed(").append(')').toString());
		}
	}

	static final void method460(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub18_7877.method5801((byte) 7);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("at.alm(").append(')').toString());
		}
	}

	static final void method461(Class430 class430, int i) {
		try {
			if (Class401_Sub1.aClass145_Sub1_8249.method1718(2126958485) != Class146.aClass146_1609)
				throw new RuntimeException();
			Class475_Sub2 class475_sub2 = ((Class475_Sub2) Class401_Sub1.aClass145_Sub1_8249.method1715(1760245012));
			class475_sub2.method5948(Class374.aClass245_6659, -1, (short) -5463);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("at.aha(").append(')').toString());
		}
	}

	static void method462(int i) {
		try {
			Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.SCREEN_PACKET, client.aClass1_9025.aClass488_22, 2093421754);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(Class545.method6347(1079239502), (byte) 78);
			class330_sub34.aClass330_Sub46_Sub2_7729.addShort(Class300.anInt3058 * -1969079741, (byte) 54);
			class330_sub34.aClass330_Sub46_Sub2_7729.addShort(Class146.anInt1615 * -1548608507, (byte) 51);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(Class448.aClass330_Sub50_5555.aClass464_Sub9_7874.method5766((byte) 1), (byte) 9);
			client.aClass1_9025.method378(class330_sub34, -524378012);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("at.ga(").append(')').toString());
		}
	}

	public static Class501[] method463(int i) {
		try {
			if (null == Class317.aClass501Array3278) {
				Class501[] class501s = Class3.method396(Class203.aClass504_6790, 16711935);
				Class501[] class501s_5_ = new Class501[class501s.length];
				int i_6_ = 0;
				int i_7_ = Class448.aClass330_Sub50_5555.aClass464_Sub5_7890.method5754(-1866616639);
				while_62_: for (int i_8_ = 0; i_8_ < class501s.length; i_8_++) {
					Class501 class501 = class501s[i_8_];
					if (class501.anInt5895 * 1069390355 > 0 && 1069390355 * class501.anInt5895 < 24) {
						if (i <= -120809114) {
							/* empty */
						}
					} else if (class501.anInt5897 * -1152098921 >= 800) {
						if (1804419289 * class501.anInt5896 < 600) {
							if (i <= -120809114) {
								/* empty */
							}
						} else {
							if (i_7_ == 2) {
								if (-1152098921 * class501.anInt5897 > 800)
									continue;
								if (class501.anInt5896 * 1804419289 > 600) {
									if (i <= -120809114)
										throw new IllegalStateException();
									continue;
								}
							}
							if (1 == i_7_) {
								if (-1152098921 * class501.anInt5897 > 1024)
									continue;
								if (1804419289 * class501.anInt5896 > 768) {
									if (i <= -120809114) {
										/* empty */
									}
									continue;
								}
							}
							for (int i_9_ = 0; i_9_ < i_6_; i_9_++) {
								Class501 class501_10_ = class501s_5_[i_9_];
								if ((-1152098921 * class501.anInt5897 == -1152098921 * class501_10_.anInt5897) && (1804419289 * class501.anInt5896 == (1804419289 * class501_10_.anInt5896))) {
									if (1069390355 * class501.anInt5895 > 1069390355 * class501_10_.anInt5895)
										class501s_5_[i_9_] = class501;
									continue while_62_;
								}
							}
							class501s_5_[i_6_] = class501;
							i_6_++;
						}
					}
				}
				Class317.aClass501Array3278 = new Class501[i_6_];
				System.arraycopy(class501s_5_, 0, Class317.aClass501Array3278, 0, i_6_);
				int[] is = new int[Class317.aClass501Array3278.length];
				for (int i_11_ = 0; i_11_ < Class317.aClass501Array3278.length; i_11_++) {
					Class501 class501 = Class317.aClass501Array3278[i_11_];
					is[i_11_] = 1804419289 * class501.anInt5896 * (class501.anInt5897 * -1152098921);
				}
				Class398.method4686(is, Class317.aClass501Array3278, -1552717966);
			}
			return Class317.aClass501Array3278;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("at.hm(").append(')').toString());
		}
	}
}
