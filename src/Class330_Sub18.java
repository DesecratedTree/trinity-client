/* Class330_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub18 extends Class330 {
	public static int anInt7630 = 8;
	public static int anInt7631 = 1;
	public static int anInt7632 = 2;
	int anInt7633;
	public static int anInt7634 = 5;
	public static int anInt7635 = 3;
	public static int anInt7636 = 0;
	static int anInt7637 = 6;
	public static int anInt7638 = 9;
	public static int anInt7639 = 10;
	int anInt7640;
	int[] anIntArray7641;
	int[] anIntArray7642;
	int[][] anIntArrayArray7643;
	boolean[] aBooleanArray7644;
	public static int anInt7645 = 7;

	Class330_Sub18(int i, byte[] is) {
		((Class330_Sub18) this).anInt7633 = -1711476141 * i;
		Buffer class330_sub46 = new Buffer(is);
		((Class330_Sub18) this).anInt7640 = class330_sub46.readUnsignedShort(1428570095) * -1779301901;
		((Class330_Sub18) this).anIntArray7642 = new int[1664515899 * ((Class330_Sub18) this).anInt7640];
		((Class330_Sub18) this).anIntArrayArray7643 = new int[1664515899 * ((Class330_Sub18) this).anInt7640][];
		((Class330_Sub18) this).aBooleanArray7644 = new boolean[((Class330_Sub18) this).anInt7640 * 1664515899];
		((Class330_Sub18) this).anIntArray7641 = new int[((Class330_Sub18) this).anInt7640 * 1664515899];
		for (int i_0_ = 0; i_0_ < ((Class330_Sub18) this).anInt7640 * 1664515899; i_0_++) {
			((Class330_Sub18) this).anIntArray7642[i_0_] = class330_sub46.readUnsignedByte(1121978661);
			if (6 == ((Class330_Sub18) this).anIntArray7642[i_0_])
				((Class330_Sub18) this).anIntArray7642[i_0_] = 2;
		}
		for (int i_1_ = 0; i_1_ < ((Class330_Sub18) this).anInt7640 * 1664515899; i_1_++)
			((Class330_Sub18) this).aBooleanArray7644[i_1_] = class330_sub46.readUnsignedByte(2065880094) == 1;
		for (int i_2_ = 0; i_2_ < 1664515899 * ((Class330_Sub18) this).anInt7640; i_2_++)
			((Class330_Sub18) this).anIntArray7641[i_2_] = class330_sub46.readUnsignedShort(588361147);
		for (int i_3_ = 0; i_3_ < ((Class330_Sub18) this).anInt7640 * 1664515899; i_3_++)
			((Class330_Sub18) this).anIntArrayArray7643[i_3_] = new int[class330_sub46.readSmart(232057517)];
		for (int i_4_ = 0; i_4_ < 1664515899 * ((Class330_Sub18) this).anInt7640; i_4_++) {
			for (int i_5_ = 0; (i_5_ < ((Class330_Sub18) this).anIntArrayArray7643[i_4_].length); i_5_++)
				((Class330_Sub18) this).anIntArrayArray7643[i_4_][i_5_] = class330_sub46.readSmart(-359897616);
		}
	}

	public static void method3342(boolean bool, int i) {
		try {
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub20_7888), 1, 1643393160);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub20_7889), 1, 426637317);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub6_7882), 0, 2125089922);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub3_7880), 0, 1479435987);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub27_7881), 0, -154770496);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub4_7883), 0, -31466921);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub11_7879), 0, -8393597);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub22_7892), 0, -1979288907);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub28_7885), 0, -429956049);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub13_7893), 0, 2122942101);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub2_7868), 0, 950009946);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub25_7896), 0, 3138234);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub9_7899), 0, -2145296168);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub9_7874), 0, -881429868);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub12_7906), 0, -1958194477);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub18_7877, -1961860223 * Class134.aClass134_1515.anInt1516, -576790075);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub21_7875), 0, -1844529967);
			if (Class361.aClass_ra3793 != null && Class361.aClass_ra3793.v() && Class361.aClass_ra3793.cg())
				Class361.aClass_ra3793.ca();
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub7_7891), 0, 219989694);
			Class325.method3212(1675488771);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub5_7890), 2, 879987659);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub16_7900), 1, -329193915);
			Class22.method473((byte) -31);
			client.aClass304_9030.method3008(1875739763).method4582(1636586836);
			client.aBoolean8992 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acy.l(").append(')').toString());
		}
	}

	static final void method3343(Class430 class430, int i) {
		try {
			int i_6_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_6_, -1061433034);
			Class120 class120 = Class3.aClass120Array56[i_6_ >> 16];
			Class146.method1737(iComponentDefinitions, class120, class430, -591748167);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acy.fj(").append(')').toString());
		}
	}

	public static void method3344(int i, int i_7_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(3, (long) i);
			class330_sub36_sub3.method3444(1908091451);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acy.s(").append(')').toString());
		}
	}
}
