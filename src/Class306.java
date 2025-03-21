/* Class306 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Class306 {
	Class306() throws Throwable {
		throw new Error();
	}

	static final void method3051(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_0_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_1_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			if (i_0_ > 700 || i_1_ > 700)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 256;
			double d = ((Math.random() * (double) (i_1_ + i_0_) - (double) i_0_ + 800.0) / 100.0);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (int) (Math.pow(2.0, d) + 0.5);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mt.zl(").append(')').toString());
		}
	}

	static Class61 method3052(byte[] is, int i) {
		try {
			if (is == null)
				throw new RuntimeException("");
			Class61 class61;
			for (;;) {
				try {
					Image image = Toolkit.getDefaultToolkit().createImage(is);
					MediaTracker mediatracker = new MediaTracker(Class293.anApplet6804);
					mediatracker.addImage(image, 0);
					mediatracker.waitForAll();
					int i_2_ = image.getWidth(Class293.anApplet6804);
					int i_3_ = image.getHeight(Class293.anApplet6804);
					if (mediatracker.isErrorAny() || i_2_ < 0 || i_3_ < 0)
						throw new RuntimeException("");
					int[] is_4_ = new int[i_3_ * i_2_];
					PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_2_, i_3_, is_4_, 0, i_2_);
					pixelgrabber.grabPixels();
					class61 = Class361.aClass_ra3793.method4795(is_4_, 0, i_2_, i_2_, i_3_, (byte) -78);
					break;
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
			return class61;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mt.o(").append(')').toString());
		}
	}

	static final void method3053(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 124953757;
			int i_5_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_6_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			int i_7_ = (((Class430) class430).anIntArray4387[2 + ((Class430) class430).anInt4376 * 1632830751]);
			long l = Class394.method4631(0, 0, 12, i_5_, i_6_, i_7_, (byte) -87);
			int i_8_ = Class104.method1246(l);
			if (i_7_ < 1970)
				i_8_--;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mt.amz(").append(')').toString());
		}
	}

	static final void method3054(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub30_7898.method5841(-1894008956);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mt.alq(").append(')').toString());
		}
	}

	static void method3055(int i, String string, boolean bool, short i_9_) {
		try {
			Class132.method1566((byte) -108);
			Class464_Sub2.method5740(-1549941192);
			Class170.method2043(1414512035);
			Class297.method2968(i, string, bool, -1726204187);
			Class219.aClass230_2183.method2328((byte) -59);
			Class219.aClass230_2183.method2332(client.anInterface12_9243, 2076618772);
			Class385.method4423(Class361.aClass_ra3793, 541999997);
			Class76.method866(Class361.aClass_ra3793, Class540.aClass280_6249, 953650434);
			Class112.method1379(-1431934078);
			Class148.method1755(Class57.aClass61Array6599, -2133542290);
			Class464.method5726(-1833811463);
			Class22.method473((byte) -26);
			if (6 == client.anInt8995 * -296919301)
				Class227.method2311(5, -1188873169);
			else if (15 == client.anInt8995 * -296919301)
				Class227.method2311(19, -1188873169);
			else if (-296919301 * client.anInt8995 == 11)
				Class227.method2311(7, -1188873169);
			else if (1 == -296919301 * client.anInt8995)
				Class227.method2311(16, -1188873169);
			else if (-296919301 * client.anInt8995 == 2 || 10 == -296919301 * client.anInt8995)
				Class330_Sub9.method3286(-732857675);
			else if (-296919301 * client.anInt8995 == 14)
				Class227.method2311(17, -1188873169);
			else if (16 == client.anInt8995 * -296919301)
				Class481.method6020(false, 1296254468);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mt.fq(").append(')').toString());
		}
	}

	static final void method3056(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class419.method5276(iComponentDefinitions, class120, class430, 1325668833);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mt.fk(").append(')').toString());
		}
	}
}
