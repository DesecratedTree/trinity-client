/* Class200 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.Socket;

public class Class200 implements Interface10 {
	public int anInt6499;
	static Socket aSocket6500;

	Class200(int i) {
		anInt6499 = 740455895 * i;
	}

	public Class198 method161() {
		return Class198.aClass198_1915;
	}

	public Class198 method160() {
		return Class198.aClass198_1915;
	}

	public Class198 method159(byte i) {
		try {
			return Class198.aClass198_1915;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ik.j(").append(')').toString());
		}
	}

	static void method2160(Class_ra class_ra, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		try {
			Class356 class356 = client.aClass304_9030.method3023(-400722441);
			Interface2 interface2 = (Interface2) class356.method4154(i, i_0_, i_1_, -2040838155);
			if (interface2 != null) {
				Class473 class473 = (client.aClass304_9030.method3025((byte) 13).method5705(interface2.method34((short) -24174), (byte) -49));
				int i_7_ = interface2.method33((byte) -60) & 0x3;
				int i_8_ = interface2.method21(1020268653);
				if (-573273839 * class473.anInt5652 != -1)
					Class503.method6135(class_ra, class473, i_7_, i_2_, i_3_, (byte) -106);
				else {
					int i_9_ = i_4_;
					if (class473.anInt5637 * -1012368965 > 0)
						i_9_ = i_5_;
					if (-344921723 * Class476.aClass476_6883.anInt6882 == i_8_ || (Class476.aClass476_6880.anInt6882 * -344921723 == i_8_)) {
						if (0 == i_7_)
							class_ra.method4801(i_2_, i_3_, 4, i_9_, -1069480736);
						else if (1 == i_7_)
							class_ra.method4792(i_2_, i_3_, 4, i_9_, (short) 255);
						else if (2 == i_7_)
							class_ra.method4801(i_2_ + 3, i_3_, 4, i_9_, 1523652092);
						else if (i_7_ == 3)
							class_ra.method4792(i_2_, i_3_ + 3, 4, i_9_, (short) 255);
					}
					if (-344921723 * Class476.aClass476_6881.anInt6882 == i_8_) {
						if (i_7_ == 0)
							class_ra.method4789(i_2_, i_3_, 1, 1, i_9_, 463754225);
						else if (1 == i_7_)
							class_ra.method4789(3 + i_2_, i_3_, 1, 1, i_9_, 463754225);
						else if (i_7_ == 2)
							class_ra.method4789(i_2_ + 3, 3 + i_3_, 1, 1, i_9_, 463754225);
						else if (i_7_ == 3)
							class_ra.method4789(i_2_, 3 + i_3_, 1, 1, i_9_, 463754225);
					}
					if (i_8_ == -344921723 * Class476.aClass476_6880.anInt6882) {
						if (0 == i_7_)
							class_ra.method4792(i_2_, i_3_, 4, i_9_, (short) 255);
						else if (1 == i_7_)
							class_ra.method4801(3 + i_2_, i_3_, 4, i_9_, -1247675111);
						else if (2 == i_7_)
							class_ra.method4792(i_2_, 3 + i_3_, 4, i_9_, (short) 255);
						else if (3 == i_7_)
							class_ra.method4801(i_2_, i_3_, 4, i_9_, -901910703);
					}
				}
			}
			interface2 = (Interface2) class356.method4158(i, i_0_, i_1_, client.anInterface19_9266, (byte) 46);
			if (interface2 != null) {
				Class473 class473 = (client.aClass304_9030.method3025((byte) 13).method5705(interface2.method34((short) -21493), (byte) -63));
				int i_10_ = interface2.method33((byte) -108) & 0x3;
				int i_11_ = interface2.method21(1020268653);
				if (class473.anInt5652 * -573273839 != -1)
					Class503.method6135(class_ra, class473, i_10_, i_2_, i_3_, (byte) -79);
				else if (Class476.aClass476_6902.anInt6882 * -344921723 == i_11_) {
					int i_12_ = -1118482;
					if (class473.anInt5637 * -1012368965 > 0)
						i_12_ = -1179648;
					if (i_10_ == 0 || i_10_ == 2)
						class_ra.method4791(i_2_, i_3_ + 3, i_2_ + 3, i_3_, i_12_, (byte) -94);
					else
						class_ra.method4791(i_2_, i_3_, 3 + i_2_, 3 + i_3_, i_12_, (byte) -94);
				}
			}
			interface2 = (Interface2) class356.method4177(i, i_0_, i_1_, 1315717432);
			if (interface2 != null) {
				Class473 class473 = (client.aClass304_9030.method3025((byte) 13).method5705(interface2.method34((short) -19202), (byte) -13));
				int i_13_ = interface2.method33((byte) -119) & 0x3;
				if (-1 != class473.anInt5652 * -573273839)
					Class503.method6135(class_ra, class473, i_13_, i_2_, i_3_, (byte) -10);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ik.z(").append(')').toString());
		}
	}

	static void sendGlobalConfig(int i, int i_14_, byte i_15_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(1, (long) i);
			class330_sub36_sub3.method3445((byte) 0);
			((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629 = i_14_ * 229745735;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ik.as(").append(')').toString());
		}
	}
}
