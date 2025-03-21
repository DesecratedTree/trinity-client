/* Class412 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.management.GarbageCollectorMXBean;

public class Class412 {
	public Class365 aClass365_4246;
	public Interface20 anInterface20_4247;
	public Interface20 anInterface20_4248;
	public Interface20 anInterface20_4249;
	public Class365 aClass365_4250;
	public Interface20 anInterface20_4251;
	public Class365 aClass365_4252;
	public int anInt4253;
	public int anInt4254;
	public boolean aBoolean4255;
	static int anInt4256;
	static GarbageCollectorMXBean aGarbageCollectorMXBean4257;
	public static Class154 aClass154_4258;

	void method5234(Buffer class330_sub46, byte i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(-169445277);
				if (0 == i_0_) {
					if (i <= 9)
						throw new IllegalStateException();
					break;
				}
				if (i_0_ == 1)
					anInterface20_4251 = Class297.method2965(class330_sub46, (byte) -1);
				else if (2 == i_0_)
					anInterface20_4249 = Class297.method2965(class330_sub46, (byte) 50);
				else if (i_0_ == 3)
					anInterface20_4248 = Class297.method2965(class330_sub46, (byte) -63);
				else if (i_0_ == 4)
					anInterface20_4247 = Class297.method2965(class330_sub46, (byte) -45);
				else if (5 == i_0_)
					aClass365_4250 = IsaacCipher.method6052(class330_sub46, -1615091388);
				else if (6 == i_0_)
					aClass365_4252 = IsaacCipher.method6052(class330_sub46, -1630669571);
				else if (i_0_ == 7)
					aClass365_4246 = IsaacCipher.method6052(class330_sub46, -1807956549);
				else if (i_0_ == 8)
					Class297.method2965(class330_sub46, (byte) -48);
				else if (i_0_ == 9)
					Class297.method2965(class330_sub46, (byte) -21);
				else if (10 == i_0_)
					Class297.method2965(class330_sub46, (byte) 3);
				else if (11 == i_0_)
					aBoolean4255 = true;
				else if (i_0_ == 12)
					anInt4253 = class330_sub46.readInt((byte) 83) * -1554314719;
				else if (13 == i_0_)
					anInt4254 = class330_sub46.readInt((byte) 71) * -1853261185;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rd.r(").append(')').toString());
		}
	}

	public Class412(IndexTable class280) {
		byte[] is = class280.method2761(41549091 * Class420.aClass420_4305.anInt4307, 1972904746);
		method5234(new Buffer(is), (byte) 113);
	}

	static final void method5235(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			iComponentDefinitions.aBoolean1270 = (((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]) == 1;
			Class404.method4738(iComponentDefinitions, 1150942058);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rd.eb(").append(')').toString());
		}
	}

	static final void method5236(Class430 class430, int i) {
		try {
			Class112.method1379(961447076);
			Class484.aBoolean5807 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rd.afv(").append(')').toString());
		}
	}

	static int method5237(NPC class432_sub1_sub1_sub1_sub2, int i) {
		try {
			Class551 class551 = class432_sub1_sub1_sub1_sub2.aClass551_10251;
			if (class551.anIntArray6326 != null) {
				class551 = class551.method6371(Class158.aClass561_6474, (byte) 114);
				if (class551 == null)
					return -1;
			}
			int i_1_ = 439966927 * class551.anInt6341;
			Class364 class364 = class432_sub1_sub1_sub1_sub2.method5436(1582279048);
			int i_2_ = class432_sub1_sub1_sub1_sub2.aClass477_Sub3_10039.method5967((byte) -81);
			if (-1 == i_2_ || (class432_sub1_sub1_sub1_sub2.aClass477_Sub3_10039.aBoolean8752))
				i_1_ = -1778637787 * class551.anInt6339;
			else if (i_2_ == class364.anInt3818 * 702160037 || i_2_ == 1110452161 * class364.anInt3819 || 1886047885 * class364.anInt3821 == i_2_ || i_2_ == 1164735859 * class364.anInt3851)
				i_1_ = class551.anInt6342 * -49424971;
			else if (i_2_ == class364.anInt3822 * 1853423603 || class364.anInt3823 * 187748475 == i_2_ || -828007095 * class364.anInt3825 == i_2_ || class364.anInt3824 * 17130543 == i_2_)
				i_1_ = -1078791669 * class551.anInt6355;
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rd.w(").append(')').toString());
		}
	}
}
