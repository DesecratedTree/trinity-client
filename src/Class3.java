/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class3 {
	static Class367 aClass367_45 = new Class367(4);
	int anInt46;
	public int anInt47;
	int anInt48;
	public int anInt49;
	public int anInt50;
	public int anInt51;
	public int anInt52 = -424526809;
	public int anInt53;
	int anInt54;
	int anInt55;
	public static Class120[] aClass120Array56;

	Class3() {
		/* empty */
	}

	public static void method395(int i) {
		try {
			try {
				if (1 == MusicManager.currentState * 242692185) {
					int i_0_ = Class110.aClass330_Sub40_Sub2_1155.method3587(403726384);
					if (i_0_ > 0 && Class110.aClass330_Sub40_Sub2_1155.method3595(-321319511)) {
						i_0_ -= Class457.anInt6843 * -1233412307;
						if (i_0_ < 0)
							i_0_ = 0;
						Class110.aClass330_Sub40_Sub2_1155.method3586(i_0_, 1952336281);
						return;
					}
					Class110.aClass330_Sub40_Sub2_1155.method3594(-1751696781);
					Class110.aClass330_Sub40_Sub2_1155.method3618(-563589403);
					if (Class110.musicArchive != null)
						MusicManager.currentState = -1477824558;
					else
						MusicManager.currentState = 0;
					MusicManager.currentMusicFile = null;
					Class57.aClass305_6600 = null;
				}
				if (3 == MusicManager.currentState * 242692185) {
					int i_1_ = Class110.aClass330_Sub40_Sub2_1155.method3587(421276588);
					if (i_1_ < Class121.volume * -509814145 && Class110.aClass330_Sub40_Sub2_1155.method3595(-1279566032)) {
						i_1_ += Class559.anInt6433 * -1271508923;
						if (i_1_ > Class121.volume * -509814145)
							i_1_ = -509814145 * Class121.volume;
						Class110.aClass330_Sub40_Sub2_1155.method3586(i_1_, 2044039117);
					} else {
						Class559.anInt6433 = 0;
						MusicManager.currentState = 0;
					}
				}
			} catch (Exception exception) {
				exception.printStackTrace();
				Class110.aClass330_Sub40_Sub2_1155.method3594(-2054639592);
				Class121.method1448((byte) -102);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ad.u(").append(')').toString());
		}
	}

	public static Class501[] method396(Class504 class504, int i) {
		try {
			int[] is = class504.method6136(-1963123436);
			Class501[] class501s = new Class501[is.length >> 2];
			for (int i_2_ = 0; i_2_ < class501s.length; i_2_++) {
				Class501 class501 = new Class501();
				class501s[i_2_] = class501;
				class501.anInt5897 = 928772647 * is[i_2_ << 2];
				class501.anInt5896 = -804044951 * is[1 + (i_2_ << 2)];
				class501.anInt5895 = is[2 + (i_2_ << 2)] * -1391181797;
				((Class501) class501).anInt5898 = 306602795 * is[3 + (i_2_ << 2)];
			}
			return class501s;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ad.r(").append(')').toString());
		}
	}

	static synchronized Class_ra method397(int i, Canvas canvas, Interface_ma interface_ma, IndexTable class280, int i_3_, int i_4_, int i_5_, byte i_6_) {
		try {
			if (0 == i)
				return Class553.method6395(canvas, interface_ma, i_4_, i_5_, -211584025);
			if (i == 2)
				return Class330_Sub9.method3283(canvas, interface_ma, i_4_, i_5_, 1328829902);
			if (i == 1)
				return Class63.method770(canvas, interface_ma, i_3_);
			if (i == 5)
				return Class269.method2664(canvas, interface_ma, class280, i_3_);
			if (3 == i)
				return Class225.method2304(canvas, interface_ma, class280, i_3_);
			throw new IllegalArgumentException("");
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ad.i(").append(')').toString());
		}
	}
}
