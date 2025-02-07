/* Class298_Sub37_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class WorldMapArea extends Class298_Sub37 {
	int anInt9639 = 1105193455;
	public String fileName;
	public String arenaName;
	Class453 areaBounds;
	public int id;
	public int anInt9644;
	public int anInt9645 = 715250349;
	public int toY;
	public int toX;
	boolean display;
	public int fromY;
	public int fromX = 1438003712;

	boolean method3450(int i, int i_0_, byte i_1_) {
		try {
			for (WorldMapAreaBound class298_sub42 = (WorldMapAreaBound) ((WorldMapArea) this).areaBounds.method5939(1766612795); null != class298_sub42; class298_sub42 = (WorldMapAreaBound) ((WorldMapArea) this).areaBounds.method5944(49146)) {
				if (class298_sub42.method3521(i, i_0_, 2010350354))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aiu.a(").append(')').toString());
		}
	}

	public boolean method3451(int i, int i_2_, int[] is, int i_3_) {
		try {
			for (WorldMapAreaBound class298_sub42 = (WorldMapAreaBound) ((WorldMapArea) this).areaBounds.method5939(1766612795); class298_sub42 != null; class298_sub42 = (WorldMapAreaBound) ((WorldMapArea) this).areaBounds.method5944(49146)) {
				if (class298_sub42.method3522(i, i_2_, (byte) -59)) {
					class298_sub42.method3523(i, i_2_, is, 798889931);
					return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aiu.f(").append(')').toString());
		}
	}

	public boolean method3452(int i, int i_4_, int[] is, int i_5_) {
		try {
			for (WorldMapAreaBound class298_sub42 = (WorldMapAreaBound) ((WorldMapArea) this).areaBounds.method5939(1766612795); class298_sub42 != null; class298_sub42 = (WorldMapAreaBound) ((WorldMapArea) this).areaBounds.method5944(49146)) {
				if (class298_sub42.method3521(i, i_4_, 1017053502)) {
					class298_sub42.method3524(i, i_4_, is, -1549696053);
					return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aiu.b(").append(')').toString());
		}
	}

	public boolean method3453(int i, int i_6_, int i_7_, int[] is, int i_8_) {
		try {
			for (WorldMapAreaBound class298_sub42 = (WorldMapAreaBound) ((WorldMapArea) this).areaBounds.method5939(1766612795); class298_sub42 != null; class298_sub42 = (WorldMapAreaBound) ((WorldMapArea) this).areaBounds.method5944(49146)) {
				if (class298_sub42.method3520(i, i_6_, i_7_, 985092463)) {
					class298_sub42.method3524(i_6_, i_7_, is, -2077374034);
					return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aiu.p(").append(')').toString());
		}
	}

	void method3454(int i) {
		try {
			fromX = 1438003712;
			toX = 0;
			fromY = 1374107136;
			toY = 0;
			for (WorldMapAreaBound class298_sub42 = (WorldMapAreaBound) ((WorldMapArea) this).areaBounds.method5939(1766612795); class298_sub42 != null; class298_sub42 = (WorldMapAreaBound) ((WorldMapArea) this).areaBounds.method5944(49146)) {
				if (((WorldMapAreaBound) class298_sub42).fromX * 1528024175 < 1364716801 * fromX)
					fromX = (((WorldMapAreaBound) class298_sub42).fromX * -878769809);
				if (((WorldMapAreaBound) class298_sub42).toX * 37578241 > toX * -2052483955)
					toX = (((WorldMapAreaBound) class298_sub42).toX * -1211577275);
				if (50981941 * ((WorldMapAreaBound) class298_sub42).fromY < fromY * 1345239131)
					fromY = -608005457 * (((WorldMapAreaBound) class298_sub42).fromY);
				if (1374138429 * ((WorldMapAreaBound) class298_sub42).toY > 929385381 * toY)
					toY = (-1870852423 * ((WorldMapAreaBound) class298_sub42).toY);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aiu.i(").append(')').toString());
		}
	}

	WorldMapArea(int key, String fileNamev, String arenaNamev, int i_10_, int i_11_, boolean displayv, int i_12_, int i_13_) {
		toX = 0;
		fromY = 1374107136;
		toY = 0;
		((WorldMapArea) this).display = true;
		id = -1929943701 * key;
		fileName = fileNamev;
		arenaName = arenaNamev;
		anInt9644 = i_10_ * 350230413;
		((WorldMapArea) this).anInt9639 = -1105193455 * i_11_;
		((WorldMapArea) this).display = displayv;
		anInt9645 = i_12_ * -715250349;
		if (1110271707 * anInt9645 == 255)
			anInt9645 = 0;
		Class94.method1020(i_13_, 1337257918);
		((WorldMapArea) this).areaBounds = new Class453();
	}

	public static final void method3455(int i, int i_14_) {
		try {
			if (StanceConfig.aClass298_Sub25_3757 != null && (i >= 0 && i < 649879491 * (StanceConfig.aClass298_Sub25_3757.anInt7356))) {
				Class163 class163 = StanceConfig.aClass298_Sub25_3757.aClass163Array7359[i];
				if (-1 == class163.aByte1683) {
					Class25 class25 = Class429.method5760((short) 512);
					Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2045, class25.aClass449_330, (byte) 120);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(2 + Class58.method693(class163.aString1681, 1064865624));
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShort(i, 16711935);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeString(class163.aString1681, 2115033353);
					class25.method390(class298_sub36, (byte) -90);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aiu.mo(").append(')').toString());
		}
	}
}
