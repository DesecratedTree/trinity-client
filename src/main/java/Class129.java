/* Class129 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public class Class129 implements Interface6 {
	Class134 aClass134_6378;
	Class140 aClass140_6379;
	static int anInt6380;

	Class129(Class140 class140, Class134 class134) {
		((Class129) this).aClass134_6378 = class134;
		((Class129) this).aClass140_6379 = class140;
	}

	public boolean method52(int i) {
		try {
			return ((Class129) this).aClass140_6379.method1553(2031023614);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ff.b(").append(')').toString());
		}
	}

	public void method58(boolean bool, byte i) {
		try {
			Class142 class142 = (((Class129) this).aClass140_6379.method1552(((Class129) this).aClass134_6378.anInt6341 * 1310361017, -257545820));
			if (class142 != null) {
				int i_0_ = ((((Class129) this).aClass134_6378.aClass139_6336.method1545((-1635817177 * ((Class129) this).aClass134_6378.anInt6339), client.WIDTH * 775068819, -2108328767)) + (-740662509 * ((Class129) this).aClass134_6378.anInt6333));
				int i_1_ = ((((Class129) this).aClass134_6378.aClass133_6337.method1482((-1725730589 * ((Class129) this).aClass134_6378.anInt6340), client.HEIGHT * -791746413, -1943367798)) + (((Class129) this).aClass134_6378.anInt6335 * -1129431703));
				if (((Class129) this).aClass134_6378.aBoolean6342)
					FloorOverlay.graphics.method5019(i_0_, i_1_, (-1635817177 * ((Class129) this).aClass134_6378.anInt6339), (((Class129) this).aClass134_6378.anInt6340 * -1725730589), 80994107 * ((Class129) this).aClass134_6378.anInt6338, 0);
				i_1_ += method1443(Class101.aClass264_1084, ((Class142) class142).aString1553, i_0_, i_1_, 5, 1663137711) * 12;
				i_1_ += 8;
				if (((Class129) this).aClass134_6378.aBoolean6342)
					FloorOverlay.graphics.method5091(i_0_, i_1_, (((Class129) this).aClass134_6378.anInt6339 * -1635817177) + i_0_ - 1, i_1_, 80994107 * ((Class129) this).aClass134_6378.anInt6338, 0);
				i_1_ = ++i_1_ + method1443(Class101.aClass264_1084, ((Class142) class142).aString1554, i_0_, i_1_, 5, 1663137711) * 12;
				i_1_ += 5;
				i_1_ += method1443(Class101.aClass264_1084, ((Class142) class142).aString1552, i_0_, i_1_, 5, 1663137711) * 12;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ff.f(").append(')').toString());
		}
	}

	int method1443(Class264 class264, String string, int i, int i_2_, int i_3_, int i_4_) {
		try {
			return (class264.method2475(string, i + i_3_, i_2_ + i_3_, (((Class129) this).aClass134_6378.anInt6339 * -1635817177 - 2 * i_3_), (-1725730589 * ((Class129) this).aClass134_6378.anInt6340 - i_3_ * 2), ((Class129) this).aClass134_6378.anInt6332 * 1824777445, ((Class129) this).aClass134_6378.anInt6334 * 1690804891, 0, 0, 0, null, null, null, 0, 0, -45995166));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ff.x(").append(')').toString());
		}
	}

	public void method55() {
		/* empty */
	}

	public void method56(boolean bool) {
		Class142 class142 = ((Class129) this).aClass140_6379.method1552(((((Class129) this).aClass134_6378.anInt6341) * 1310361017), 869274917);
		if (class142 != null) {
			int i = ((((Class129) this).aClass134_6378.aClass139_6336.method1545(-1635817177 * ((Class129) this).aClass134_6378.anInt6339, client.WIDTH * 775068819, -1777840883)) + -740662509 * ((Class129) this).aClass134_6378.anInt6333);
			int i_5_ = ((((Class129) this).aClass134_6378.aClass133_6337.method1482(-1725730589 * ((Class129) this).aClass134_6378.anInt6340, client.HEIGHT * -791746413, -1715547706)) + ((Class129) this).aClass134_6378.anInt6335 * -1129431703);
			if (((Class129) this).aClass134_6378.aBoolean6342)
				FloorOverlay.graphics.method5019(i, i_5_, -1635817177 * ((Class129) this).aClass134_6378.anInt6339, ((Class129) this).aClass134_6378.anInt6340 * -1725730589, 80994107 * ((Class129) this).aClass134_6378.anInt6338, 0);
			i_5_ += method1443(Class101.aClass264_1084, ((Class142) class142).aString1553, i, i_5_, 5, 1663137711) * 12;
			i_5_ += 8;
			if (((Class129) this).aClass134_6378.aBoolean6342)
				FloorOverlay.graphics.method5091(i, i_5_, (((Class129) this).aClass134_6378.anInt6339 * -1635817177 + i - 1), i_5_, 80994107 * ((Class129) this).aClass134_6378.anInt6338, 0);
			i_5_ = ++i_5_ + method1443(Class101.aClass264_1084, ((Class142) class142).aString1554, i, i_5_, 5, 1663137711) * 12;
			i_5_ += 5;
			i_5_ += method1443(Class101.aClass264_1084, ((Class142) class142).aString1552, i, i_5_, 5, 1663137711) * 12;
		}
	}

	public boolean method57() {
		return ((Class129) this).aClass140_6379.method1553(2130772218);
	}

	public boolean method54() {
		return ((Class129) this).aClass140_6379.method1553(1856893340);
	}

	public boolean method59() {
		return ((Class129) this).aClass140_6379.method1553(1503133948);
	}

	public void method53(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ff.a(").append(')').toString());
		}
	}

	static final void method1444(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			WidgetConfig class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			FloorUnderlay.method5887(class105, class119, class403, -352941486);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ff.kr(").append(')').toString());
		}
	}

	static final void method1445(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.isMemberWorld ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ff.th(").append(')').toString());
		}
	}

	static void method1446(int i, int mode, int i_7_, int i_8_, boolean bool, byte i_9_) {
		try {
			if (Class452.fullScreen && Class231.fullScreenFrame != null && (3 != mode || -1012194159 * Class431.anInt6502 != i_7_ || 1953279233 * TextureLoader.anInt6465 != i_8_)) {
				Class93.method1010(Class389.aClass457_4164, Class231.fullScreenFrame, 1593156326);
				Class231.fullScreenFrame = null;
			}
			if (Class452.fullScreen && 3 == mode && null == Class231.fullScreenFrame) {
				Class231.fullScreenFrame = Class409.method4976(Class389.aClass457_4164, i_7_, i_8_, 0, 0, -1107425870);
				if (null != Class231.fullScreenFrame) {
					Class431.anInt6502 = i_7_ * -660267919;
					TextureLoader.anInt6465 = -2089004287 * i_8_;
					Class3.savePreferences(656179282);
				}
			}
			if (mode == 3 && (!Class452.fullScreen || Class231.fullScreenFrame == null))
				method1446(i, Class422_Sub25.preferences.displayMode.get((byte) 118), -1, -1, true, (byte) 24);
			else {
				Container container = Class318.method3874((byte) 31);
				if (Class231.fullScreenFrame != null) {
					Class78.anInt733 = i_7_ * 1325868603;
					client.anInt6472 = -2115832951 * i_8_;
				} else if (null != Class298_Sub36.frame) {
					Insets insets = Class298_Sub36.frame.getInsets();
					Class78.anInt733 = (Class298_Sub36.frame.getSize().width - (insets.left + insets.right)) * 1325868603;
					client.anInt6472 = (Class298_Sub36.frame.getSize().height - (insets.top + insets.bottom)) * -2115832951;
				} else {
					Class78.anInt733 = container.getSize().width * 1325868603;
					client.anInt6472 = container.getSize().height * -2115832951;
				}
				if (Class78.anInt733 * -639974669 <= 0)
					Class78.anInt733 = 1325868603;
				if (1282634425 * client.anInt6472 <= 0)
					client.anInt6472 = -2115832951;
				if (1 != mode)
					GrabFolder.method2283((byte) 3);
				else {
					Class462.screenWidth = client.WIDTH * -1494558011;
					client.anInt6473 = (Class78.anInt733 * -639974669 - 775068819 * client.WIDTH) / 2 * -753018213;
					Class298_Sub40_Sub9.screenHeight = -909258791 * client.HEIGHT;
					client.anInt6474 = 0;
				}
				if (Class242.aClass401_2708 != Class401.aClass401_6557 && -2110394505 * Class462.screenWidth < 1024 && Class298_Sub40_Sub9.screenHeight * -1111710645 >= 768) {
					/* empty */
				}
				if (!bool) {
					Class52_Sub2_Sub1.aCanvas9079.setSize(Class462.screenWidth * -2110394505, -1111710645 * Class298_Sub40_Sub9.screenHeight);
					FloorOverlay.graphics.method5173(Class52_Sub2_Sub1.aCanvas9079, -2110394505 * Class462.screenWidth, Class298_Sub40_Sub9.screenHeight * -1111710645, (byte) 20);
					if (Class298_Sub36.frame == container) {
						Insets insets = Class298_Sub36.frame.getInsets();
						Class52_Sub2_Sub1.aCanvas9079.setLocation(1898544019 * client.anInt6473 + insets.left, insets.top + client.anInt6474 * 540368727);
					} else
						Class52_Sub2_Sub1.aCanvas9079.setLocation(1898544019 * client.anInt6473, client.anInt6474 * 540368727);
				} else
					Class335.method4086(1305054317);
				if (mode >= 2)
					client.resizable = true;
				else
					client.resizable = false;
				Class502.method6232(-375091038);
				if (-1 != -257444687 * client.WINDOW_PANE_ID)
					Class257.method2453(true, (byte) 8);
				if (client.aClass25_8711.method387(537308016) != null && Class435.method5804(client.anInt8752 * -1233866115, (byte) 76))
					Class326.method3974(-2137735375);
				for (int i_10_ = 0; i_10_ < 113; i_10_++)
					client.aBooleanArray8900[i_10_] = true;
				client.aBoolean6471 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ff.gq(").append(')').toString());
		}
	}

	static final int method1447(int i, int i_11_, int i_12_) {
		try {
			int i_13_ = i + i_11_ * 57;
			i_13_ = i_13_ << 13 ^ i_13_;
			int i_14_ = (1376312589 + i_13_ * (789221 + 15731 * (i_13_ * i_13_)) & 0x7fffffff);
			return i_14_ >> 19 & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ff.l(").append(')').toString());
		}
	}
}
