/* Class330_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public abstract class Class330_Sub31 extends Class330 {
	int anInt7723;
	OggStreamState anOggStreamState7724;

	void method3410(OggPacket oggpacket, byte i) {
		try {
			method3411(oggpacket, 975492153);
			((Class330_Sub31) this).anInt7723 += -818353419;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adl.r(").append(')').toString());
		}
	}

	abstract void method3411(OggPacket oggpacket, int i);

	abstract void method3412(OggPacket oggpacket);

	abstract void method3413(int i);

	Class330_Sub31(OggStreamState oggstreamstate) {
		((Class330_Sub31) this).anOggStreamState7724 = oggstreamstate;
	}

	abstract void method3414();

	abstract void method3415();

	static final void method3416(IComponentDefinitions iComponentDefinitions, Class430 class430, int i) {
		try {
			Class524 class524 = iComponentDefinitions.method1405(Class219.aClass230_2183, client.anInterface12_9243, 2134561875);
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			int i_1_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			int i_2_ = class524.method6243(iComponentDefinitions.aString1266, iComponentDefinitions.anInt1210 * -681123409, iComponentDefinitions.anInt1267 * -427156389, i_1_, i_0_, Class57.aClass61Array6599, -1718536581);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adl.qv(").append(')').toString());
		}
	}

	public static final void logout(boolean lobby, int i) {
		try {
			Class1[] class1s = client.aClass1Array8963;
			for (int i_3_ = 0; i_3_ < class1s.length; i_3_++) {
				Class1 class1 = class1s[i_3_];
				try {
					class1.method381(1906300241);
				} catch (IOException ioexception) {
					/* empty */
				}
				class1.method379(1175619289);
			}
			Class149_Sub1.method1766(859078960);
			Class50.method632(false, (byte) -81);
			client.aClass304_9030.method3003(230127954);
			client.aClass304_9030.method3028(-48236021);
			Class517.method6212(false, -546665429);
			Class456.method5656(1372225037);
			Class400.method4704(2, (byte) 71);
			Class333.musicId = 1299321823;
			Class333.aBoolean3354 = false;
			Class479.method6014(-1890487234);
			Class481.method6020(true, -1727423015);
			Class523.method6237((short) -172);
			Class386.method4438(127580599);
			Class500.method6121((byte) 0);
			if (lobby)
				Class227.method2311(4, -1188873169);
			else {
				Class227.method2311(6, -1188873169);
				try {
					Class492.method6078(Class293.anApplet6804, "loggedout", (byte) 1);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adl.gu(").append(')').toString());
		}
	}

	static final void method3418(IComponentDefinitions iComponentDefinitions, Class430 class430, int i) {
		try {
			int i_4_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			int i_5_ = ((((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) - 1);
			if (-276075115 * iComponentDefinitions.anInt1238 != 2)
				throw new RuntimeException("");
			Class551 class551 = Class158_Sub3.aClass553_8875.method6392((-1576413395 * (iComponentDefinitions.anInt1239)), 1057823395);
			if (iComponentDefinitions.aClass538_1362 == null)
				iComponentDefinitions.aClass538_1362 = new Class538(class551, false);
			iComponentDefinitions.aClass538_1362.aLong6242 = Class116.method1418(735911697) * 7415089317549594679L;
			if (i_5_ < 0 || i_5_ >= class551.anIntArray6297.length)
				throw new RuntimeException("");
			iComponentDefinitions.aClass538_1362.anIntArray6240[i_5_] = i_4_;
			Class404.method4738(iComponentDefinitions, 1351443670);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adl.qg(").append(')').toString());
		}
	}
}
