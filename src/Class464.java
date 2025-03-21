/* Class464 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class464 {
	protected static int anInt5586 = 2;
	protected int anInt5587;
	protected static int anInt5588 = 1;
	protected Class330_Sub50 aClass330_Sub50_5589;
	public static int anInt5590 = 3;

	abstract int method5714(int i);

	Class464(int i, Class330_Sub50 class330_sub50) {
		anInt5587 = 1558443671 * i;
		aClass330_Sub50_5589 = class330_sub50;
	}

	abstract int method5715(int i);

	abstract int method5716(int i, int i_0_);

	void method5717(int i, int i_1_) {
		try {
			if (method5716(i, 1342763126) != 3)
				method5722(i, (byte) -78);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tg.i(").append(')').toString());
		}
	}

	Class464(Class330_Sub50 class330_sub50) {
		aClass330_Sub50_5589 = class330_sub50;
		anInt5587 = method5715(-1311375066) * 1558443671;
	}

	abstract int method5718();

	abstract void method5719(int i);

	abstract void method5720(int i);

	abstract void method5721(int i);

	abstract void method5722(int i, byte i_2_);

	static final void method5723(int i, byte i_3_) {
		try {
			client.anIntArray9108 = new int[i];
			client.anIntArray8973 = new int[i];
			client.anIntArray8952 = new int[i];
			client.anIntArray9169 = new int[i];
			client.anIntArray9112 = new int[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tg.if(").append(')').toString());
		}
	}

	static final void method5724(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		try {
			for (Class325_Sub6 class325_sub6 = ((Class325_Sub6) client.aClass467_9061.method5854(-247660382)); null != class325_sub6; class325_sub6 = ((Class325_Sub6) client.aClass467_9061.method5857(-1623155263))) {
				if (client.anInt8981 * 822953439 >= ((Class325_Sub6) class325_sub6).anInt7494 * 177144309)
					class325_sub6.method3204(-936336537);
				else {
					Class281.method2791(((Class325_Sub6) class325_sub6).anInt7491 * -27411823, 256 + ((((Class325_Sub6) class325_sub6).anInt7490 * -1398157749) << 9), (((Class325_Sub6) class325_sub6).anInt7492 * 542627361 << 9) + 256, ((Class325_Sub6) class325_sub6).anInt7493 * 222254846, (byte) -14);
					Class166_Sub3_Sub2.aClass263_9483.method2595(((Class325_Sub6) class325_sub6).aString7496, (int) ((float) i + client.aFloatArray9253[0]), (int) ((float) i_4_ + client.aFloatArray9253[1]), ~0xffffff | (((Class325_Sub6) class325_sub6).anInt7495 * 1649028783), 0, 972363368);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tg.jn(").append(')').toString());
		}
	}

	static final void method5725(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		try {
			int i_17_ = i_15_ - 334;
			if (i_17_ < 0)
				i_17_ = 0;
			else if (i_17_ > 100)
				i_17_ = 100;
			int i_18_ = (client.aShort9245 + (client.aShort9016 - client.aShort9245) * i_17_ / 100);
			i_14_ = i_18_ * i_14_ >> 8;
			int i_19_ = 16384 - i_12_ & 0x3fff;
			int i_20_ = 16384 - i_13_ & 0x3fff;
			int i_21_ = 0;
			int i_22_ = 0;
			int i_23_ = i_14_;
			if (i_19_ != 0) {
				i_22_ = Class257.anIntArray2683[i_19_] * -i_23_ >> 14;
				i_23_ = Class257.anIntArray2684[i_19_] * i_23_ >> 14;
			}
			if (0 != i_20_) {
				i_21_ = Class257.anIntArray2683[i_20_] * i_23_ >> 14;
				i_23_ = Class257.anIntArray2684[i_20_] * i_23_ >> 14;
			}
			Class471.anInt5612 = (i - i_21_) * -106940035;
			Gfx.anInt578 = -568170765 * (i_10_ - i_22_);
			Class325_Sub3.anInt7484 = 1872779603 * (i_11_ - i_23_);
			Class321.anInt7018 = i_12_ * -1105882715;
			Class145_Sub1.anInt7266 = i_13_ * -1543696161;
			Class119.anInt1399 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tg.jh(").append(')').toString());
		}
	}

	public static void method5726(int i) {
		try {
			for (int i_24_ = 0; i_24_ < 113; i_24_++)
				client.aBooleanArray9230[i_24_] = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tg.lj(").append(')').toString());
		}
	}

	static final void method5727(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub26_7901.method5830(574708379);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tg.amh(").append(')').toString());
		}
	}

	static String method5728(String string, int i) {
		try {
			String string_25_ = null;
			int i_26_ = string.indexOf("--> ");
			if (i_26_ >= 0) {
				string_25_ = string.substring(0, 4 + i_26_);
				string = string.substring(i_26_ + 4);
			}
			if (string.startsWith("directlogin ")) {
				int i_27_ = string.indexOf(" ", "directlogin ".length());
				if (i_27_ >= 0) {
					int i_28_ = string.length();
					string = new StringBuilder().append(string.substring(0, i_27_)).append(" ").toString();
					for (int i_29_ = i_27_ + 1; i_29_ < i_28_; i_29_++)
						string = new StringBuilder().append(string).append("*").toString();
				}
			}
			if (string_25_ != null)
				return new StringBuilder().append(string_25_).append(string).toString();
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tg.q(").append(')').toString());
		}
	}

	static void method5729(Class_ra class_ra, int i) {
		try {
			if ((Class484.anInt5786 * -2008486989 >= 2 || client.aBoolean9150) && client.aClass114_9165 == null) {
				String string;
				if (client.aBoolean9150 && -2008486989 * Class484.anInt5786 < 2)
					string = new StringBuilder().append(client.aString9152).append(Class526.aClass526_6173.method6257(Class429.aClass454_4369, 991479434)).append(client.aString9154).append(" ").append(Class215.aString2082).toString();
				else if (Class366.method4277(2065958819) && Class484.anInt5786 * -2008486989 > 2)
					string = Class50.method627((Class418.aClass330_Sub36_Sub10_4298), 1378307875);
				else {
					Class330_Sub36_Sub10 class330_sub36_sub10 = Class418.aClass330_Sub36_Sub10_4298;
					if (class330_sub36_sub10 == null)
						return;
					string = Class50.method627(class330_sub36_sub10, -1119774512);
					int[] is = Class22.method471(class330_sub36_sub10, 1955685818);
					if (is != null)
						string = new StringBuilder().append(string).append(Class431.method5343(is, 615974039)).toString();
				}
				if (Class484.anInt5786 * -2008486989 > 2)
					string = new StringBuilder().append(string).append(Class146.method1738(16777215, -849826454)).append(" / ").append(Class484.anInt5786 * -2008486989 - 2).append(Class526.aClass526_6178.method6257(Class429.aClass454_4369, 991479434)).toString();
				if (null != Class484.aClass114_5789) {
					Class263 class263 = (Class484.aClass114_5789.method1390(Class219.aClass230_2183, client.anInterface12_9243, -228156246));
					if (class263 == null)
						class263 = Class166_Sub3_Sub2.aClass263_9483;
					class263.method2611(string, 486793747 * Class484.anInt5798, Class484.anInt5799 * -1268126925, Class484.aClass114_5789.anInt1210 * -681123409, 694142557 * Class484.aClass114_5789.anInt1348, Class484.aClass114_5789.anInt1224 * -421168987, -1651839469 * Class484.aClass114_5789.anInt1233, 654960235 * Class484.aClass114_5789.anInt1268, -831570027 * Class484.aClass114_5789.anInt1279, client.aRandom9066, -74764097 * Class382.anInt6680, client.anIntArray8955, Class_na.aClass61Array9725, Class444.anIntArray4495, -1762763703);
					Class524.method6252(client.anIntArray8955[0], client.anIntArray8955[1], client.anIntArray8955[2], client.anIntArray8955[3], (byte) -55);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tg.az(").append(')').toString());
		}
	}
}
