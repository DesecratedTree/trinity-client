/* Class246 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.InputStream;

public class Class246 implements Interface14 {
	Color aColor6561;
	Font aFont6562;
	FontMetrics aFontMetrics6563;
	Image anImage6564;
	Image anImage6565;
	int anInt6566;
	Image anImage6567;
	Image anImage6568;
	Image anImage6569;
	Image anImage6570;
	Image anImage6571;
	int anInt6572;
	Image anImage6573;
	boolean aBoolean6574;
	boolean aBoolean6575;
	int anInt6576;
	int anInt6577;
	Image anImage6578;
	int anInt6579;
	int anInt6580;
	boolean aBoolean6581;
	int anInt6582;
	int anInt6583;
	Image anImage6584;
	int anInt6585;
	static int anInt6586;

	public int method195() {
		return 100;
	}

	final int method2448(int i, int i_0_) {
		try {
			if (((Class246) this).aBoolean6575)
				return (-1969079741 * Class300.anInt3058 - i) / 2;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kh.r(").append(')').toString());
		}
	}

	final int method2449(int i, int i_1_) {
		try {
			if (((Class246) this).aBoolean6574)
				return (Class146.anInt1615 * -1548608507 - i) / 2;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kh.j(").append(')').toString());
		}
	}

	public void method196(boolean bool, int i) {
		try {
			if (!((Class246) this).aBoolean6581 && ((Class246) this).aFont6562 == null) {
				try {
					String[] strings = Class226.method2309(client.aString8964, ',', (byte) -2);
					if (23 != strings.length)
						((Class246) this).aBoolean6581 = true;
					((Class246) this).aBoolean6575 = Boolean.parseBoolean(strings[0]);
					((Class246) this).aBoolean6574 = Boolean.parseBoolean(strings[1]);
					((Class246) this).anInt6577 = (Class204.method2185(strings[2], (byte) -97) * 1569505781);
					((Class246) this).anInt6576 = (Class204.method2185(strings[3], (byte) -11) * -1568942051);
					((Class246) this).anInt6579 = (Class204.method2185(strings[4], (byte) -75) * -515813395);
					((Class246) this).anInt6580 = (Class204.method2185(strings[5], (byte) -11) * -294649369);
					((Class246) this).anInt6566 = (Class204.method2185(strings[6], (byte) -8) * 1859821005);
					((Class246) this).anInt6582 = (Class204.method2185(strings[7], (byte) -15) * 417529401);
					((Class246) this).anInt6583 = (Class204.method2185(strings[8], (byte) -14) * -422354117);
					((Class246) this).anInt6572 = (Class204.method2185(strings[9], (byte) -46) * 1378743129);
					String string = strings[10];
					int i_2_ = Class204.method2185(strings[11], (byte) -105);
					int i_3_ = Class16.method449(strings[12].substring(2), 16, -1306186069);
					((Class246) this).aFont6562 = new Font(string, 0, i_2_);
					((Class246) this).aFontMetrics6563 = Class475.aCanvas5700.getFontMetrics(((Class246) this).aFont6562);
					((Class246) this).aColor6561 = new Color(i_3_);
					MediaTracker mediatracker = new MediaTracker(Class475.aCanvas5700);
					((Class246) this).anImage6565 = method2450(strings[13], (short) -6240);
					mediatracker.addImage(((Class246) this).anImage6565, 0);
					((Class246) this).anImage6567 = method2450(strings[14], (short) -5786);
					mediatracker.addImage(((Class246) this).anImage6567, 1);
					((Class246) this).anImage6584 = method2450(strings[15], (short) -7404);
					mediatracker.addImage(((Class246) this).anImage6584, 2);
					((Class246) this).anImage6568 = method2450(strings[16], (short) 1365);
					mediatracker.addImage(((Class246) this).anImage6568, 3);
					((Class246) this).anImage6569 = method2450(strings[17], (short) -14251);
					mediatracker.addImage(((Class246) this).anImage6569, 4);
					((Class246) this).anImage6570 = method2450(strings[18], (short) -22880);
					mediatracker.addImage(((Class246) this).anImage6570, 5);
					((Class246) this).anImage6578 = method2450(strings[19], (short) 7010);
					mediatracker.addImage(((Class246) this).anImage6578, 6);
					((Class246) this).anImage6571 = method2450(strings[20], (short) 1918);
					mediatracker.addImage(((Class246) this).anImage6571, 7);
					((Class246) this).anImage6573 = method2450(strings[21], (short) 9565);
					mediatracker.addImage(((Class246) this).anImage6573, 8);
					mediatracker.waitForAll();
					((Class246) this).anInt6585 = (Class204.method2185(strings[22], (byte) -77) * -23173277);
				} catch (Exception exception) {
					((Class246) this).aBoolean6581 = true;
				}
			}
			if (((Class246) this).aBoolean6581)
				method2451(-1390004513);
			else {
				Graphics graphics = Class475.aCanvas5700.getGraphics();
				if (null != graphics) {
					try {
						int i_4_ = Class239.aClass240_2592.method2388((byte) -11);
						String string = Class239.aClass240_2592.method2393((byte) 0);
						if (Class464_Sub18.anImage8701 == null)
							Class464_Sub18.anImage8701 = (Class475.aCanvas5700.createImage(Class300.anInt3058 * -1969079741, -1548608507 * Class146.anInt1615));
						Graphics graphics_5_ = Class464_Sub18.anImage8701.getGraphics();
						graphics_5_.setColor(Color.BLACK);
						graphics_5_.fillRect(0, 0, Class300.anInt3058 * -1969079741, -1548608507 * Class146.anInt1615);
						int i_6_ = ((Class246) this).anImage6578.getWidth(null);
						int i_7_ = ((Class246) this).anImage6571.getWidth(null);
						int i_8_ = ((Class246) this).anImage6573.getWidth(null);
						int i_9_ = ((Class246) this).anImage6578.getHeight(null);
						int i_10_ = ((Class246) this).anImage6571.getHeight(null);
						int i_11_ = ((Class246) this).anImage6573.getHeight(null);
						graphics_5_.drawImage(((Class246) this).anImage6578, (method2448(i_6_, 1300214499) + ((Class246) this).anInt6566 * -297560315 - -513835533 * ((Class246) this).anInt6583 / 2), (method2449(i_9_, 1082028011) + ((Class246) this).anInt6582 * -919760887), null);
						int i_12_ = (((Class246) this).anInt6566 * -297560315 - -513835533 * ((Class246) this).anInt6583 / 2 + i_6_);
						int i_13_ = (((Class246) this).anInt6583 * -513835533 / 2 + ((Class246) this).anInt6566 * -297560315);
						for (int i_14_ = i_12_; i_14_ <= i_13_; i_14_ += i_8_)
							graphics_5_.drawImage(((Class246) this).anImage6573, (method2448(i_6_, 2123939337) + -297560315 * ((Class246) this).anInt6566 + i_14_), (method2449(i_11_, 1082028011) + ((Class246) this).anInt6582 * -919760887), null);
						graphics_5_.drawImage(((Class246) this).anImage6571, (method2448(i_7_, 1734012674) + -297560315 * ((Class246) this).anInt6566 + -513835533 * ((Class246) this).anInt6583 / 2), (method2449(i_10_, 1082028011) + ((Class246) this).anInt6582 * -919760887), null);
						int i_15_ = ((Class246) this).anImage6584.getWidth(null);
						int i_16_ = ((Class246) this).anImage6584.getHeight(null);
						int i_17_ = ((Class246) this).anImage6568.getWidth(null);
						int i_18_ = ((Class246) this).anImage6568.getHeight(null);
						int i_19_ = ((Class246) this).anImage6570.getHeight(null);
						int i_20_ = ((Class246) this).anImage6569.getWidth(null);
						int i_21_ = ((Class246) this).anImage6569.getHeight(null);
						int i_22_ = ((Class246) this).anImage6570.getWidth(null);
						int i_23_ = ((Class246) this).anImage6565.getWidth(null);
						int i_24_ = ((Class246) this).anImage6567.getWidth(null);
						int i_25_ = (method2448((-1932040731 * ((Class246) this).anInt6579), 1248529886) + 1775182429 * ((Class246) this).anInt6577);
						int i_26_ = (method2449((-870350377 * ((Class246) this).anInt6580), 1082028011) + 2095950389 * ((Class246) this).anInt6576);
						graphics_5_.drawImage(((Class246) this).anImage6584, i_25_, ((-870350377 * ((Class246) this).anInt6580) - i_16_) / 2 + i_26_, null);
						graphics_5_.drawImage(((Class246) this).anImage6568, (i_25_ + -1932040731 * ((Class246) this).anInt6579 - i_17_), i_26_ + (-870350377 * ((Class246) this).anInt6580 - i_18_) / 2, null);
						if (((Class246) this).anImage6564 == null)
							((Class246) this).anImage6564 = (Class475.aCanvas5700.createImage((((Class246) this).anInt6579 * -1932040731 - i_15_ - i_17_), -870350377 * ((Class246) this).anInt6580));
						Graphics graphics_27_ = ((Class246) this).anImage6564.getGraphics();
						for (int i_28_ = 0; i_28_ < (-1932040731 * ((Class246) this).anInt6579 - i_15_ - i_17_); i_28_ += i_20_)
							graphics_27_.drawImage((((Class246) this).anImage6569), i_28_, 0, null);
						for (int i_29_ = 0; i_29_ < (-1932040731 * ((Class246) this).anInt6579 - i_15_ - i_17_); i_29_ += i_22_)
							graphics_27_.drawImage((((Class246) this).anImage6570), i_29_, (((Class246) this).anInt6580 * -870350377) - i_19_, null);
						int i_30_ = i_4_ * (-1932040731 * ((Class246) this).anInt6579 - i_15_ - i_17_) / 100;
						if (i_30_ > 0) {
							Image image = (Class475.aCanvas5700.createImage(i_30_, (-870350377 * ((Class246) this).anInt6580 - i_21_ - i_19_)));
							int i_31_ = image.getWidth(null);
							Graphics graphics_32_ = image.getGraphics();
							int i_33_ = (96358987 * ((Class246) this).anInt6585 * Class129.method1556(-865445024) / 10 % i_23_);
							for (int i_34_ = i_33_ - i_23_; i_34_ < i_31_; i_34_ += i_23_)
								graphics_32_.drawImage((((Class246) this).anImage6565), i_34_, 0, null);
							graphics_27_.drawImage(image, 0, i_21_, null);
						}
						int i_35_ = i_30_;
						i_30_ = (((Class246) this).anInt6579 * -1932040731 - i_15_ - i_17_ - i_30_);
						if (i_30_ > 0) {
							Image image = (Class475.aCanvas5700.createImage(i_30_, (((Class246) this).anInt6580 * -870350377 - i_21_ - i_19_)));
							int i_36_ = image.getWidth(null);
							Graphics graphics_37_ = image.getGraphics();
							for (int i_38_ = 0; i_38_ < i_36_; i_38_ += i_24_)
								graphics_37_.drawImage((((Class246) this).anImage6567), i_38_, 0, null);
							graphics_27_.drawImage(image, i_35_, i_21_, null);
						}
						graphics_5_.drawImage(((Class246) this).anImage6564, i_25_ + i_15_, i_26_, null);
						graphics_5_.setFont(((Class246) this).aFont6562);
						graphics_5_.setColor(((Class246) this).aColor6561);
						graphics_5_.drawString(string, i_25_ + (((Class246) this).anInt6579 * -1932040731 - ((Class246) this).aFontMetrics6563.stringWidth(string)) / 2, (4 + (i_26_ + (((Class246) this).anInt6580 * -870350377 / 2)) + 1476207849 * ((Class246) this).anInt6572));
						graphics.drawImage(Class464_Sub18.anImage8701, 0, 0, null);
					} catch (Exception exception) {
						((Class246) this).aBoolean6581 = true;
					}
				} else
					Class475.aCanvas5700.repaint();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kh.i(").append(')').toString());
		}
	}

	Image method2450(String string, short i) throws IOException {
		try {
			Image image;
			try {
				InputStream inputstream = Class293.anApplet6804.getClass().getClassLoader().getResourceAsStream(string);
				byte[] is = new byte[4000];
				int i_39_ = 0;
				int i_40_;
				while ((i_40_ = inputstream.read()) != -1)
					is[i_39_++] = (byte) i_40_;
				Image image_41_ = Toolkit.getDefaultToolkit().createImage(is);
				image = image_41_;
			} catch (Exception exception) {
				throw new IOException();
			}
			return image;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kh.p(").append(')').toString());
		}
	}

	void method2451(int i) {
		try {
			Class6.method403(Class239.aClass240_2592.method2388((byte) -43), Class239.aClass240_2592.method2393((byte) 0), client.aColorArray9005[client.anInt8957 * -1667441567], client.aColorArray9006[-1667441567 * client.anInt8957], client.aColorArray9007[client.anInt8957 * -1667441567], 65536);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kh.o(").append(')').toString());
		}
	}

	public void method203(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kh.f(").append(')').toString());
		}
	}

	public void method209(byte i) {
		try {
			Class146.method1732((byte) -3);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kh.s(").append(')').toString());
		}
	}

	public boolean method198(long l) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kh.w(").append(')').toString());
		}
	}

	public void method194() {
		/* empty */
	}

	public int method212(int i) {
		try {
			return 100;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kh.z(").append(')').toString());
		}
	}

	public int method199(int i) {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kh.n(").append(')').toString());
		}
	}

	public void method208() {
		/* empty */
	}

	public void method200(boolean bool) {
		if (!((Class246) this).aBoolean6581 && ((Class246) this).aFont6562 == null) {
			try {
				String[] strings = Class226.method2309(client.aString8964, ',', (byte) -103);
				if (23 != strings.length)
					((Class246) this).aBoolean6581 = true;
				((Class246) this).aBoolean6575 = Boolean.parseBoolean(strings[0]);
				((Class246) this).aBoolean6574 = Boolean.parseBoolean(strings[1]);
				((Class246) this).anInt6577 = Class204.method2185(strings[2], (byte) -80) * 1569505781;
				((Class246) this).anInt6576 = (Class204.method2185(strings[3], (byte) -61) * -1568942051);
				((Class246) this).anInt6579 = Class204.method2185(strings[4], (byte) -72) * -515813395;
				((Class246) this).anInt6580 = Class204.method2185(strings[5], (byte) -13) * -294649369;
				((Class246) this).anInt6566 = Class204.method2185(strings[6], (byte) -67) * 1859821005;
				((Class246) this).anInt6582 = Class204.method2185(strings[7], (byte) -99) * 417529401;
				((Class246) this).anInt6583 = Class204.method2185(strings[8], (byte) -7) * -422354117;
				((Class246) this).anInt6572 = Class204.method2185(strings[9], (byte) -9) * 1378743129;
				String string = strings[10];
				int i = Class204.method2185(strings[11], (byte) -88);
				int i_42_ = Class16.method449(strings[12].substring(2), 16, 1283740655);
				((Class246) this).aFont6562 = new Font(string, 0, i);
				((Class246) this).aFontMetrics6563 = Class475.aCanvas5700.getFontMetrics(((Class246) this).aFont6562);
				((Class246) this).aColor6561 = new Color(i_42_);
				MediaTracker mediatracker = new MediaTracker(Class475.aCanvas5700);
				((Class246) this).anImage6565 = method2450(strings[13], (short) -25034);
				mediatracker.addImage(((Class246) this).anImage6565, 0);
				((Class246) this).anImage6567 = method2450(strings[14], (short) -19383);
				mediatracker.addImage(((Class246) this).anImage6567, 1);
				((Class246) this).anImage6584 = method2450(strings[15], (short) 18026);
				mediatracker.addImage(((Class246) this).anImage6584, 2);
				((Class246) this).anImage6568 = method2450(strings[16], (short) -12884);
				mediatracker.addImage(((Class246) this).anImage6568, 3);
				((Class246) this).anImage6569 = method2450(strings[17], (short) -24939);
				mediatracker.addImage(((Class246) this).anImage6569, 4);
				((Class246) this).anImage6570 = method2450(strings[18], (short) 12564);
				mediatracker.addImage(((Class246) this).anImage6570, 5);
				((Class246) this).anImage6578 = method2450(strings[19], (short) 1871);
				mediatracker.addImage(((Class246) this).anImage6578, 6);
				((Class246) this).anImage6571 = method2450(strings[20], (short) 9959);
				mediatracker.addImage(((Class246) this).anImage6571, 7);
				((Class246) this).anImage6573 = method2450(strings[21], (short) 22936);
				mediatracker.addImage(((Class246) this).anImage6573, 8);
				mediatracker.waitForAll();
				((Class246) this).anInt6585 = Class204.method2185(strings[22], (byte) -69) * -23173277;
			} catch (Exception exception) {
				((Class246) this).aBoolean6581 = true;
			}
		}
		if (((Class246) this).aBoolean6581)
			method2451(-1390004513);
		else {
			Graphics graphics = Class475.aCanvas5700.getGraphics();
			if (null != graphics) {
				try {
					int i = Class239.aClass240_2592.method2388((byte) -45);
					String string = Class239.aClass240_2592.method2393((byte) 0);
					if (Class464_Sub18.anImage8701 == null)
						Class464_Sub18.anImage8701 = (Class475.aCanvas5700.createImage(Class300.anInt3058 * -1969079741, -1548608507 * Class146.anInt1615));
					Graphics graphics_43_ = Class464_Sub18.anImage8701.getGraphics();
					graphics_43_.setColor(Color.BLACK);
					graphics_43_.fillRect(0, 0, Class300.anInt3058 * -1969079741, -1548608507 * Class146.anInt1615);
					int i_44_ = ((Class246) this).anImage6578.getWidth(null);
					int i_45_ = ((Class246) this).anImage6571.getWidth(null);
					int i_46_ = ((Class246) this).anImage6573.getWidth(null);
					int i_47_ = ((Class246) this).anImage6578.getHeight(null);
					int i_48_ = ((Class246) this).anImage6571.getHeight(null);
					int i_49_ = ((Class246) this).anImage6573.getHeight(null);
					graphics_43_.drawImage(((Class246) this).anImage6578, (method2448(i_44_, 1258749024) + ((Class246) this).anInt6566 * -297560315 - -513835533 * ((Class246) this).anInt6583 / 2), (method2449(i_47_, 1082028011) + ((Class246) this).anInt6582 * -919760887), null);
					int i_50_ = (((Class246) this).anInt6566 * -297560315 - -513835533 * ((Class246) this).anInt6583 / 2 + i_44_);
					int i_51_ = (((Class246) this).anInt6583 * -513835533 / 2 + ((Class246) this).anInt6566 * -297560315);
					for (int i_52_ = i_50_; i_52_ <= i_51_; i_52_ += i_46_)
						graphics_43_.drawImage(((Class246) this).anImage6573, (method2448(i_44_, 1867568470) + -297560315 * ((Class246) this).anInt6566 + i_52_), (method2449(i_49_, 1082028011) + (((Class246) this).anInt6582 * -919760887)), null);
					graphics_43_.drawImage(((Class246) this).anImage6571, (method2448(i_45_, 1967997948) + -297560315 * ((Class246) this).anInt6566 + -513835533 * ((Class246) this).anInt6583 / 2), (method2449(i_48_, 1082028011) + ((Class246) this).anInt6582 * -919760887), null);
					int i_53_ = ((Class246) this).anImage6584.getWidth(null);
					int i_54_ = ((Class246) this).anImage6584.getHeight(null);
					int i_55_ = ((Class246) this).anImage6568.getWidth(null);
					int i_56_ = ((Class246) this).anImage6568.getHeight(null);
					int i_57_ = ((Class246) this).anImage6570.getHeight(null);
					int i_58_ = ((Class246) this).anImage6569.getWidth(null);
					int i_59_ = ((Class246) this).anImage6569.getHeight(null);
					int i_60_ = ((Class246) this).anImage6570.getWidth(null);
					int i_61_ = ((Class246) this).anImage6565.getWidth(null);
					int i_62_ = ((Class246) this).anImage6567.getWidth(null);
					int i_63_ = (method2448((-1932040731 * ((Class246) this).anInt6579), 1300042292) + 1775182429 * ((Class246) this).anInt6577);
					int i_64_ = (method2449(-870350377 * ((Class246) this).anInt6580, 1082028011) + 2095950389 * ((Class246) this).anInt6576);
					graphics_43_.drawImage(((Class246) this).anImage6584, i_63_, ((-870350377 * ((Class246) this).anInt6580) - i_54_) / 2 + i_64_, null);
					graphics_43_.drawImage(((Class246) this).anImage6568, (i_63_ + -1932040731 * ((Class246) this).anInt6579 - i_55_), i_64_ + (-870350377 * ((Class246) this).anInt6580 - i_56_) / 2, null);
					if (((Class246) this).anImage6564 == null)
						((Class246) this).anImage6564 = (Class475.aCanvas5700.createImage((((Class246) this).anInt6579 * -1932040731 - i_53_ - i_55_), -870350377 * ((Class246) this).anInt6580));
					Graphics graphics_65_ = ((Class246) this).anImage6564.getGraphics();
					for (int i_66_ = 0; i_66_ < (-1932040731 * ((Class246) this).anInt6579 - i_53_ - i_55_); i_66_ += i_58_)
						graphics_65_.drawImage(((Class246) this).anImage6569, i_66_, 0, null);
					for (int i_67_ = 0; i_67_ < (-1932040731 * ((Class246) this).anInt6579 - i_53_ - i_55_); i_67_ += i_60_)
						graphics_65_.drawImage(((Class246) this).anImage6570, i_67_, (((Class246) this).anInt6580 * -870350377) - i_57_, null);
					int i_68_ = i * (-1932040731 * ((Class246) this).anInt6579 - i_53_ - i_55_) / 100;
					if (i_68_ > 0) {
						Image image = (Class475.aCanvas5700.createImage(i_68_, (-870350377 * ((Class246) this).anInt6580 - i_59_ - i_57_)));
						int i_69_ = image.getWidth(null);
						Graphics graphics_70_ = image.getGraphics();
						int i_71_ = (96358987 * ((Class246) this).anInt6585 * Class129.method1556(-594989928) / 10 % i_61_);
						for (int i_72_ = i_71_ - i_61_; i_72_ < i_69_; i_72_ += i_61_)
							graphics_70_.drawImage((((Class246) this).anImage6565), i_72_, 0, null);
						graphics_65_.drawImage(image, 0, i_59_, null);
					}
					int i_73_ = i_68_;
					i_68_ = (((Class246) this).anInt6579 * -1932040731 - i_53_ - i_55_ - i_68_);
					if (i_68_ > 0) {
						Image image = (Class475.aCanvas5700.createImage(i_68_, (((Class246) this).anInt6580 * -870350377 - i_59_ - i_57_)));
						int i_74_ = image.getWidth(null);
						Graphics graphics_75_ = image.getGraphics();
						for (int i_76_ = 0; i_76_ < i_74_; i_76_ += i_62_)
							graphics_75_.drawImage((((Class246) this).anImage6567), i_76_, 0, null);
						graphics_65_.drawImage(image, i_73_, i_59_, null);
					}
					graphics_43_.drawImage(((Class246) this).anImage6564, i_63_ + i_53_, i_64_, null);
					graphics_43_.setFont(((Class246) this).aFont6562);
					graphics_43_.setColor(((Class246) this).aColor6561);
					graphics_43_.drawString(string, i_63_ + (((Class246) this).anInt6579 * -1932040731 - ((Class246) this).aFontMetrics6563.stringWidth(string)) / 2, (4 + (i_64_ + ((Class246) this).anInt6580 * -870350377 / 2) + 1476207849 * ((Class246) this).anInt6572));
					graphics.drawImage(Class464_Sub18.anImage8701, 0, 0, null);
				} catch (Exception exception) {
					((Class246) this).aBoolean6581 = true;
				}
			} else
				Class475.aCanvas5700.repaint();
		}
	}

	public void method201(boolean bool) {
		if (!((Class246) this).aBoolean6581 && ((Class246) this).aFont6562 == null) {
			try {
				String[] strings = Class226.method2309(client.aString8964, ',', (byte) -114);
				if (23 != strings.length)
					((Class246) this).aBoolean6581 = true;
				((Class246) this).aBoolean6575 = Boolean.parseBoolean(strings[0]);
				((Class246) this).aBoolean6574 = Boolean.parseBoolean(strings[1]);
				((Class246) this).anInt6577 = (Class204.method2185(strings[2], (byte) -128) * 1569505781);
				((Class246) this).anInt6576 = (Class204.method2185(strings[3], (byte) -74) * -1568942051);
				((Class246) this).anInt6579 = Class204.method2185(strings[4], (byte) -75) * -515813395;
				((Class246) this).anInt6580 = (Class204.method2185(strings[5], (byte) -111) * -294649369);
				((Class246) this).anInt6566 = Class204.method2185(strings[6], (byte) -66) * 1859821005;
				((Class246) this).anInt6582 = Class204.method2185(strings[7], (byte) -99) * 417529401;
				((Class246) this).anInt6583 = Class204.method2185(strings[8], (byte) -67) * -422354117;
				((Class246) this).anInt6572 = Class204.method2185(strings[9], (byte) -7) * 1378743129;
				String string = strings[10];
				int i = Class204.method2185(strings[11], (byte) -49);
				int i_77_ = Class16.method449(strings[12].substring(2), 16, -1647237346);
				((Class246) this).aFont6562 = new Font(string, 0, i);
				((Class246) this).aFontMetrics6563 = Class475.aCanvas5700.getFontMetrics(((Class246) this).aFont6562);
				((Class246) this).aColor6561 = new Color(i_77_);
				MediaTracker mediatracker = new MediaTracker(Class475.aCanvas5700);
				((Class246) this).anImage6565 = method2450(strings[13], (short) 16665);
				mediatracker.addImage(((Class246) this).anImage6565, 0);
				((Class246) this).anImage6567 = method2450(strings[14], (short) -18032);
				mediatracker.addImage(((Class246) this).anImage6567, 1);
				((Class246) this).anImage6584 = method2450(strings[15], (short) 2572);
				mediatracker.addImage(((Class246) this).anImage6584, 2);
				((Class246) this).anImage6568 = method2450(strings[16], (short) -4445);
				mediatracker.addImage(((Class246) this).anImage6568, 3);
				((Class246) this).anImage6569 = method2450(strings[17], (short) -12323);
				mediatracker.addImage(((Class246) this).anImage6569, 4);
				((Class246) this).anImage6570 = method2450(strings[18], (short) -1741);
				mediatracker.addImage(((Class246) this).anImage6570, 5);
				((Class246) this).anImage6578 = method2450(strings[19], (short) 3138);
				mediatracker.addImage(((Class246) this).anImage6578, 6);
				((Class246) this).anImage6571 = method2450(strings[20], (short) -8044);
				mediatracker.addImage(((Class246) this).anImage6571, 7);
				((Class246) this).anImage6573 = method2450(strings[21], (short) 10397);
				mediatracker.addImage(((Class246) this).anImage6573, 8);
				mediatracker.waitForAll();
				((Class246) this).anInt6585 = (Class204.method2185(strings[22], (byte) -123) * -23173277);
			} catch (Exception exception) {
				((Class246) this).aBoolean6581 = true;
			}
		}
		if (((Class246) this).aBoolean6581)
			method2451(-1390004513);
		else {
			Graphics graphics = Class475.aCanvas5700.getGraphics();
			if (null != graphics) {
				try {
					int i = Class239.aClass240_2592.method2388((byte) -46);
					String string = Class239.aClass240_2592.method2393((byte) 0);
					if (Class464_Sub18.anImage8701 == null)
						Class464_Sub18.anImage8701 = (Class475.aCanvas5700.createImage(Class300.anInt3058 * -1969079741, -1548608507 * Class146.anInt1615));
					Graphics graphics_78_ = Class464_Sub18.anImage8701.getGraphics();
					graphics_78_.setColor(Color.BLACK);
					graphics_78_.fillRect(0, 0, Class300.anInt3058 * -1969079741, -1548608507 * Class146.anInt1615);
					int i_79_ = ((Class246) this).anImage6578.getWidth(null);
					int i_80_ = ((Class246) this).anImage6571.getWidth(null);
					int i_81_ = ((Class246) this).anImage6573.getWidth(null);
					int i_82_ = ((Class246) this).anImage6578.getHeight(null);
					int i_83_ = ((Class246) this).anImage6571.getHeight(null);
					int i_84_ = ((Class246) this).anImage6573.getHeight(null);
					graphics_78_.drawImage(((Class246) this).anImage6578, (method2448(i_79_, 2045908869) + ((Class246) this).anInt6566 * -297560315 - -513835533 * ((Class246) this).anInt6583 / 2), (method2449(i_82_, 1082028011) + ((Class246) this).anInt6582 * -919760887), null);
					int i_85_ = (((Class246) this).anInt6566 * -297560315 - -513835533 * ((Class246) this).anInt6583 / 2 + i_79_);
					int i_86_ = (((Class246) this).anInt6583 * -513835533 / 2 + ((Class246) this).anInt6566 * -297560315);
					for (int i_87_ = i_85_; i_87_ <= i_86_; i_87_ += i_81_)
						graphics_78_.drawImage(((Class246) this).anImage6573, (method2448(i_79_, 1738416840) + -297560315 * ((Class246) this).anInt6566 + i_87_), (method2449(i_84_, 1082028011) + (((Class246) this).anInt6582 * -919760887)), null);
					graphics_78_.drawImage(((Class246) this).anImage6571, (method2448(i_80_, 2144335930) + -297560315 * ((Class246) this).anInt6566 + -513835533 * ((Class246) this).anInt6583 / 2), (method2449(i_83_, 1082028011) + ((Class246) this).anInt6582 * -919760887), null);
					int i_88_ = ((Class246) this).anImage6584.getWidth(null);
					int i_89_ = ((Class246) this).anImage6584.getHeight(null);
					int i_90_ = ((Class246) this).anImage6568.getWidth(null);
					int i_91_ = ((Class246) this).anImage6568.getHeight(null);
					int i_92_ = ((Class246) this).anImage6570.getHeight(null);
					int i_93_ = ((Class246) this).anImage6569.getWidth(null);
					int i_94_ = ((Class246) this).anImage6569.getHeight(null);
					int i_95_ = ((Class246) this).anImage6570.getWidth(null);
					int i_96_ = ((Class246) this).anImage6565.getWidth(null);
					int i_97_ = ((Class246) this).anImage6567.getWidth(null);
					int i_98_ = (method2448((-1932040731 * ((Class246) this).anInt6579), 1234655120) + 1775182429 * ((Class246) this).anInt6577);
					int i_99_ = (method2449(-870350377 * ((Class246) this).anInt6580, 1082028011) + 2095950389 * ((Class246) this).anInt6576);
					graphics_78_.drawImage(((Class246) this).anImage6584, i_98_, ((-870350377 * ((Class246) this).anInt6580) - i_89_) / 2 + i_99_, null);
					graphics_78_.drawImage(((Class246) this).anImage6568, (i_98_ + -1932040731 * ((Class246) this).anInt6579 - i_90_), i_99_ + (-870350377 * ((Class246) this).anInt6580 - i_91_) / 2, null);
					if (((Class246) this).anImage6564 == null)
						((Class246) this).anImage6564 = (Class475.aCanvas5700.createImage((((Class246) this).anInt6579 * -1932040731 - i_88_ - i_90_), -870350377 * ((Class246) this).anInt6580));
					Graphics graphics_100_ = ((Class246) this).anImage6564.getGraphics();
					for (int i_101_ = 0; i_101_ < (-1932040731 * ((Class246) this).anInt6579 - i_88_ - i_90_); i_101_ += i_93_)
						graphics_100_.drawImage(((Class246) this).anImage6569, i_101_, 0, null);
					for (int i_102_ = 0; i_102_ < (-1932040731 * ((Class246) this).anInt6579 - i_88_ - i_90_); i_102_ += i_95_)
						graphics_100_.drawImage(((Class246) this).anImage6570, i_102_, (((Class246) this).anInt6580 * -870350377) - i_92_, null);
					int i_103_ = i * (-1932040731 * ((Class246) this).anInt6579 - i_88_ - i_90_) / 100;
					if (i_103_ > 0) {
						Image image = (Class475.aCanvas5700.createImage(i_103_, (-870350377 * ((Class246) this).anInt6580 - i_94_ - i_92_)));
						int i_104_ = image.getWidth(null);
						Graphics graphics_105_ = image.getGraphics();
						int i_106_ = (96358987 * ((Class246) this).anInt6585 * Class129.method1556(-1507721702) / 10 % i_96_);
						for (int i_107_ = i_106_ - i_96_; i_107_ < i_104_; i_107_ += i_96_)
							graphics_105_.drawImage((((Class246) this).anImage6565), i_107_, 0, null);
						graphics_100_.drawImage(image, 0, i_94_, null);
					}
					int i_108_ = i_103_;
					i_103_ = (((Class246) this).anInt6579 * -1932040731 - i_88_ - i_90_ - i_103_);
					if (i_103_ > 0) {
						Image image = (Class475.aCanvas5700.createImage(i_103_, (((Class246) this).anInt6580 * -870350377 - i_94_ - i_92_)));
						int i_109_ = image.getWidth(null);
						Graphics graphics_110_ = image.getGraphics();
						for (int i_111_ = 0; i_111_ < i_109_; i_111_ += i_97_)
							graphics_110_.drawImage((((Class246) this).anImage6567), i_111_, 0, null);
						graphics_100_.drawImage(image, i_108_, i_94_, null);
					}
					graphics_78_.drawImage(((Class246) this).anImage6564, i_98_ + i_88_, i_99_, null);
					graphics_78_.setFont(((Class246) this).aFont6562);
					graphics_78_.setColor(((Class246) this).aColor6561);
					graphics_78_.drawString(string, i_98_ + (((Class246) this).anInt6579 * -1932040731 - ((Class246) this).aFontMetrics6563.stringWidth(string)) / 2, (4 + (i_99_ + ((Class246) this).anInt6580 * -870350377 / 2) + 1476207849 * ((Class246) this).anInt6572));
					graphics.drawImage(Class464_Sub18.anImage8701, 0, 0, null);
				} catch (Exception exception) {
					((Class246) this).aBoolean6581 = true;
				}
			} else
				Class475.aCanvas5700.repaint();
		}
	}

	public void method202(boolean bool) {
		if (!((Class246) this).aBoolean6581 && ((Class246) this).aFont6562 == null) {
			try {
				String[] strings = Class226.method2309(client.aString8964, ',', (byte) -10);
				if (23 != strings.length)
					((Class246) this).aBoolean6581 = true;
				((Class246) this).aBoolean6575 = Boolean.parseBoolean(strings[0]);
				((Class246) this).aBoolean6574 = Boolean.parseBoolean(strings[1]);
				((Class246) this).anInt6577 = Class204.method2185(strings[2], (byte) -97) * 1569505781;
				((Class246) this).anInt6576 = (Class204.method2185(strings[3], (byte) -113) * -1568942051);
				((Class246) this).anInt6579 = Class204.method2185(strings[4], (byte) -93) * -515813395;
				((Class246) this).anInt6580 = Class204.method2185(strings[5], (byte) -11) * -294649369;
				((Class246) this).anInt6566 = Class204.method2185(strings[6], (byte) -65) * 1859821005;
				((Class246) this).anInt6582 = Class204.method2185(strings[7], (byte) -69) * 417529401;
				((Class246) this).anInt6583 = (Class204.method2185(strings[8], (byte) -114) * -422354117);
				((Class246) this).anInt6572 = Class204.method2185(strings[9], (byte) -78) * 1378743129;
				String string = strings[10];
				int i = Class204.method2185(strings[11], (byte) -72);
				int i_112_ = Class16.method449(strings[12].substring(2), 16, 657745813);
				((Class246) this).aFont6562 = new Font(string, 0, i);
				((Class246) this).aFontMetrics6563 = Class475.aCanvas5700.getFontMetrics(((Class246) this).aFont6562);
				((Class246) this).aColor6561 = new Color(i_112_);
				MediaTracker mediatracker = new MediaTracker(Class475.aCanvas5700);
				((Class246) this).anImage6565 = method2450(strings[13], (short) 9700);
				mediatracker.addImage(((Class246) this).anImage6565, 0);
				((Class246) this).anImage6567 = method2450(strings[14], (short) -4560);
				mediatracker.addImage(((Class246) this).anImage6567, 1);
				((Class246) this).anImage6584 = method2450(strings[15], (short) 12102);
				mediatracker.addImage(((Class246) this).anImage6584, 2);
				((Class246) this).anImage6568 = method2450(strings[16], (short) 17352);
				mediatracker.addImage(((Class246) this).anImage6568, 3);
				((Class246) this).anImage6569 = method2450(strings[17], (short) -18828);
				mediatracker.addImage(((Class246) this).anImage6569, 4);
				((Class246) this).anImage6570 = method2450(strings[18], (short) -4852);
				mediatracker.addImage(((Class246) this).anImage6570, 5);
				((Class246) this).anImage6578 = method2450(strings[19], (short) -19197);
				mediatracker.addImage(((Class246) this).anImage6578, 6);
				((Class246) this).anImage6571 = method2450(strings[20], (short) -6586);
				mediatracker.addImage(((Class246) this).anImage6571, 7);
				((Class246) this).anImage6573 = method2450(strings[21], (short) -5594);
				mediatracker.addImage(((Class246) this).anImage6573, 8);
				mediatracker.waitForAll();
				((Class246) this).anInt6585 = Class204.method2185(strings[22], (byte) -39) * -23173277;
			} catch (Exception exception) {
				((Class246) this).aBoolean6581 = true;
			}
		}
		if (((Class246) this).aBoolean6581)
			method2451(-1390004513);
		else {
			Graphics graphics = Class475.aCanvas5700.getGraphics();
			if (null != graphics) {
				try {
					int i = Class239.aClass240_2592.method2388((byte) -55);
					String string = Class239.aClass240_2592.method2393((byte) 0);
					if (Class464_Sub18.anImage8701 == null)
						Class464_Sub18.anImage8701 = (Class475.aCanvas5700.createImage(Class300.anInt3058 * -1969079741, -1548608507 * Class146.anInt1615));
					Graphics graphics_113_ = Class464_Sub18.anImage8701.getGraphics();
					graphics_113_.setColor(Color.BLACK);
					graphics_113_.fillRect(0, 0, Class300.anInt3058 * -1969079741, -1548608507 * Class146.anInt1615);
					int i_114_ = ((Class246) this).anImage6578.getWidth(null);
					int i_115_ = ((Class246) this).anImage6571.getWidth(null);
					int i_116_ = ((Class246) this).anImage6573.getWidth(null);
					int i_117_ = ((Class246) this).anImage6578.getHeight(null);
					int i_118_ = ((Class246) this).anImage6571.getHeight(null);
					int i_119_ = ((Class246) this).anImage6573.getHeight(null);
					graphics_113_.drawImage(((Class246) this).anImage6578, (method2448(i_114_, 1387128676) + ((Class246) this).anInt6566 * -297560315 - -513835533 * ((Class246) this).anInt6583 / 2), (method2449(i_117_, 1082028011) + ((Class246) this).anInt6582 * -919760887), null);
					int i_120_ = (((Class246) this).anInt6566 * -297560315 - -513835533 * ((Class246) this).anInt6583 / 2 + i_114_);
					int i_121_ = (((Class246) this).anInt6583 * -513835533 / 2 + ((Class246) this).anInt6566 * -297560315);
					for (int i_122_ = i_120_; i_122_ <= i_121_; i_122_ += i_116_)
						graphics_113_.drawImage(((Class246) this).anImage6573, (method2448(i_114_, 1290041810) + -297560315 * ((Class246) this).anInt6566 + i_122_), (method2449(i_119_, 1082028011) + ((Class246) this).anInt6582 * -919760887), null);
					graphics_113_.drawImage(((Class246) this).anImage6571, (method2448(i_115_, 1199003214) + -297560315 * ((Class246) this).anInt6566 + -513835533 * ((Class246) this).anInt6583 / 2), (method2449(i_118_, 1082028011) + ((Class246) this).anInt6582 * -919760887), null);
					int i_123_ = ((Class246) this).anImage6584.getWidth(null);
					int i_124_ = ((Class246) this).anImage6584.getHeight(null);
					int i_125_ = ((Class246) this).anImage6568.getWidth(null);
					int i_126_ = ((Class246) this).anImage6568.getHeight(null);
					int i_127_ = ((Class246) this).anImage6570.getHeight(null);
					int i_128_ = ((Class246) this).anImage6569.getWidth(null);
					int i_129_ = ((Class246) this).anImage6569.getHeight(null);
					int i_130_ = ((Class246) this).anImage6570.getWidth(null);
					int i_131_ = ((Class246) this).anImage6565.getWidth(null);
					int i_132_ = ((Class246) this).anImage6567.getWidth(null);
					int i_133_ = (method2448((-1932040731 * ((Class246) this).anInt6579), 1605783200) + 1775182429 * ((Class246) this).anInt6577);
					int i_134_ = (method2449(-870350377 * ((Class246) this).anInt6580, 1082028011) + 2095950389 * ((Class246) this).anInt6576);
					graphics_113_.drawImage(((Class246) this).anImage6584, i_133_, ((-870350377 * ((Class246) this).anInt6580) - i_124_) / 2 + i_134_, null);
					graphics_113_.drawImage(((Class246) this).anImage6568, (i_133_ + -1932040731 * ((Class246) this).anInt6579 - i_125_), i_134_ + (-870350377 * ((Class246) this).anInt6580 - i_126_) / 2, null);
					if (((Class246) this).anImage6564 == null)
						((Class246) this).anImage6564 = (Class475.aCanvas5700.createImage((((Class246) this).anInt6579 * -1932040731 - i_123_ - i_125_), -870350377 * ((Class246) this).anInt6580));
					Graphics graphics_135_ = ((Class246) this).anImage6564.getGraphics();
					for (int i_136_ = 0; i_136_ < (-1932040731 * ((Class246) this).anInt6579 - i_123_ - i_125_); i_136_ += i_128_)
						graphics_135_.drawImage(((Class246) this).anImage6569, i_136_, 0, null);
					for (int i_137_ = 0; i_137_ < (-1932040731 * ((Class246) this).anInt6579 - i_123_ - i_125_); i_137_ += i_130_)
						graphics_135_.drawImage(((Class246) this).anImage6570, i_137_, (((Class246) this).anInt6580 * -870350377) - i_127_, null);
					int i_138_ = i * (-1932040731 * ((Class246) this).anInt6579 - i_123_ - i_125_) / 100;
					if (i_138_ > 0) {
						Image image = (Class475.aCanvas5700.createImage(i_138_, (-870350377 * ((Class246) this).anInt6580 - i_129_ - i_127_)));
						int i_139_ = image.getWidth(null);
						Graphics graphics_140_ = image.getGraphics();
						int i_141_ = (96358987 * ((Class246) this).anInt6585 * Class129.method1556(-750792430) / 10 % i_131_);
						for (int i_142_ = i_141_ - i_131_; i_142_ < i_139_; i_142_ += i_131_)
							graphics_140_.drawImage((((Class246) this).anImage6565), i_142_, 0, null);
						graphics_135_.drawImage(image, 0, i_129_, null);
					}
					int i_143_ = i_138_;
					i_138_ = (((Class246) this).anInt6579 * -1932040731 - i_123_ - i_125_ - i_138_);
					if (i_138_ > 0) {
						Image image = (Class475.aCanvas5700.createImage(i_138_, (((Class246) this).anInt6580 * -870350377 - i_129_ - i_127_)));
						int i_144_ = image.getWidth(null);
						Graphics graphics_145_ = image.getGraphics();
						for (int i_146_ = 0; i_146_ < i_144_; i_146_ += i_132_)
							graphics_145_.drawImage((((Class246) this).anImage6567), i_146_, 0, null);
						graphics_135_.drawImage(image, i_143_, i_129_, null);
					}
					graphics_113_.drawImage(((Class246) this).anImage6564, i_133_ + i_123_, i_134_, null);
					graphics_113_.setFont(((Class246) this).aFont6562);
					graphics_113_.setColor(((Class246) this).aColor6561);
					graphics_113_.drawString(string, i_133_ + (((Class246) this).anInt6579 * -1932040731 - ((Class246) this).aFontMetrics6563.stringWidth(string)) / 2, (4 + (i_134_ + ((Class246) this).anInt6580 * -870350377 / 2) + 1476207849 * ((Class246) this).anInt6572));
					graphics.drawImage(Class464_Sub18.anImage8701, 0, 0, null);
				} catch (Exception exception) {
					((Class246) this).aBoolean6581 = true;
				}
			} else
				Class475.aCanvas5700.repaint();
		}
	}

	public void method204() {
		Class146.method1732((byte) 22);
	}

	Class246() {
		/* empty */
	}

	public void method206() {
		/* empty */
	}

	public boolean method211(long l) {
		return true;
	}

	public void method207() {
		/* empty */
	}

	public int method197() {
		return 100;
	}

	public int method210() {
		return 100;
	}

	public boolean method205(long l) {
		return true;
	}

	public boolean method213(long l) {
		return true;
	}

	public int method214() {
		return 0;
	}

	static final void method2452(Class430 class430, int i) throws Exception_Sub4 {
		try {
			((Class430) class430).anInt4376 -= -1265050756;
			int i_147_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_148_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			int i_149_ = (((Class430) class430).anIntArray4387[2 + 1632830751 * ((Class430) class430).anInt4376]);
			Class260 class260 = Class260.method2577((float) i_147_, (float) i_148_, (float) i_149_);
			Class401_Sub1.aClass145_Sub1_8249.method1678(class260, (byte) -81);
			class260.method2550();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kh.aiz(").append(')').toString());
		}
	}

	static final void method2453(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1182 = Class288.method2886(string, class430, 1724575446);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kh.mx(").append(')').toString());
		}
	}
}
