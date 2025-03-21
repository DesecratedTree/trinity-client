/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

public class Class8 {
	static String aString129 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7";
	static int anInt130 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".length();
	int[] anIntArray131;
	boolean aBoolean132 = false;
	Class61[] aClass61Array133;
	int[] anIntArray134;
	static int[] anIntArray135 = new int[256];
	int anInt136;
	int anInt137;

	static {
		for (int i = 0; i < 256; i++) {
			int i_0_ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".indexOf(i);
			if (i_0_ == -1)
				i_0_ = 74;
			anIntArray135[i] = i_0_;
		}
	}

	int method415() {
		return ((Class8) this).anInt137;
	}

	void method416(Class_ra class_ra, Font font, FontMetrics fontmetrics, char c, int i, boolean bool) {
		int i_1_ = fontmetrics.charWidth(c);
		int i_2_ = i_1_;
		if (bool) {
			try {
				if (c == '/')
					bool = false;
				if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k' || c == 'x' || c == 'y' || c == 'A' || c == 'V' || c == 'W')
					i_1_++;
			} catch (Exception exception) {
				/* empty */
			}
		}
		int i_3_ = fontmetrics.getMaxAscent();
		int i_4_ = fontmetrics.getMaxAscent() + fontmetrics.getMaxDescent();
		int i_5_ = fontmetrics.getHeight();
		Image image = Class475.aCanvas5700.createImage(i_1_, i_4_);
		Graphics graphics = image.getGraphics();
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, i_1_, i_4_);
		graphics.setColor(Color.white);
		graphics.setFont(font);
		graphics.drawString(new StringBuilder().append(c).append("").toString(), 0, i_3_);
		if (bool)
			graphics.drawString(new StringBuilder().append(c).append("").toString(), 1, i_3_);
		int[] is = new int[i_1_ * i_4_];
		PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_1_, i_4_, is, 0, i_1_);
		try {
			pixelgrabber.grabPixels();
		} catch (Exception exception) {
			/* empty */
		}
		image.flush();
		Object object = null;
		int i_6_ = 0;
		while_20_: for (int i_7_ = 0; i_7_ < i_4_; i_7_++) {
			for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
				int i_9_ = is[i_8_ + i_7_ * i_1_];
				if ((i_9_ & 0xffffff) != 0) {
					i_6_ = i_7_;
					break while_20_;
				}
			}
		}
		for (int i_10_ = 0; i_10_ < is.length; i_10_++) {
			if ((is[i_10_] & 0xffffff) == 0)
				is[i_10_] = 0;
		}
		((Class8) this).anInt137 = i_3_ - i_6_;
		((Class8) this).anInt136 = i_5_;
		((Class8) this).anIntArray134[i] = i_2_;
		((Class8) this).aClass61Array133[i] = class_ra.method4795(is, 0, i_1_, i_1_, i_4_, (byte) -96);
	}

	int method417(String string) {
		int i = 0;
		for (int i_11_ = 0; i_11_ < string.length(); i_11_++) {
			int i_12_ = anIntArray135[string.charAt(i_11_)];
			i += ((Class8) this).anIntArray134[i_12_];
		}
		return i;
	}

	void method418(Class_ra class_ra, String string, int i, int i_13_, int i_14_, boolean bool) {
		int i_15_ = method417(string) / 2;
		class_ra.qa(((Class8) this).anIntArray131);
		if (i - i_15_ <= ((Class8) this).anIntArray131[2] && i + i_15_ >= ((Class8) this).anIntArray131[0] && (i_13_ - ((Class8) this).anInt137 <= ((Class8) this).anIntArray131[3]) && (i_13_ + ((Class8) this).anInt136 >= ((Class8) this).anIntArray131[1]))
			method419(class_ra, string, ((Class8) this).anIntArray131, i - i_15_, i_13_, i_14_, bool);
	}

	void method419(Class_ra class_ra, String string, int[] is, int i, int i_16_, int i_17_, boolean bool) {
		if (i_17_ == 0)
			bool = false;
		i_17_ |= ~0xffffff;
		for (int i_18_ = 0; i_18_ < string.length(); i_18_++) {
			int i_19_ = anIntArray135[string.charAt(i_18_)];
			if (bool)
				((Class8) this).aClass61Array133[i_19_].method688(i + 1, i_16_ + 1, 0, -16777216, 1);
			((Class8) this).aClass61Array133[i_19_].method688(i, i_16_, 0, i_17_, 1);
			i += ((Class8) this).anIntArray134[i_19_];
		}
	}

	int method420() {
		return ((Class8) this).anInt136 - 1;
	}

	Class8(Class_ra class_ra, int i, boolean bool, Component component) {
		((Class8) this).anIntArray131 = new int[4];
		((Class8) this).aBoolean132 = false;
		((Class8) this).aClass61Array133 = new Class61[256];
		((Class8) this).anIntArray134 = new int[256];
		Font font = new Font("Helvetica", bool ? 1 : 0, i);
		FontMetrics fontmetrics = component.getFontMetrics(font);
		for (int i_20_ = 0; i_20_ < anInt130; i_20_++)
			method416(class_ra, font, fontmetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".charAt(i_20_), i_20_, false);
		if (bool && ((Class8) this).aBoolean132) {
			((Class8) this).aBoolean132 = false;
			font = new Font("Helvetica", 0, i);
			fontmetrics = component.getFontMetrics(font);
			for (int i_21_ = 0; i_21_ < anInt130; i_21_++)
				method416(class_ra, font, fontmetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".charAt(i_21_), i_21_, false);
			if (!((Class8) this).aBoolean132) {
				((Class8) this).aBoolean132 = false;
				for (int i_22_ = 0; i_22_ < anInt130; i_22_++)
					method416(class_ra, font, fontmetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".charAt(i_22_), i_22_, true);
			}
		}
	}
}
