/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class10 {
	int anInt153;
	float aFloat154 = 1.0F;
	float aFloat155 = 1.0F;
	int anInt156;
	int anInt157;
	int anInt158;
	int anInt159;
	int anInt160;
	float aFloat161;
	int anInt162;
	int anInt163;

	Class10 method424(int i) {
		try {
			return new Class10(((Class10) this).anInt163 * 1548605205, ((Class10) this).aFloat154, ((Class10) this).aFloat155, ((Class10) this).anInt159 * 647335565, 1511969625 * ((Class10) this).anInt157, -492325789 * ((Class10) this).anInt158);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ak.r(").append(')').toString());
		}
	}

	Class10(int i, float f, float f_0_, int i_1_, int i_2_, int i_3_) {
		((Class10) this).anInt163 = i * 680837181;
		((Class10) this).aFloat154 = f;
		((Class10) this).aFloat155 = f_0_;
		((Class10) this).anInt159 = i_1_ * 1013441605;
		((Class10) this).anInt157 = i_2_ * 1685996777;
		((Class10) this).anInt158 = 800091467 * i_3_;
	}

	void method425(Class10 class10_4_, int i) {
		try {
			((Class10) this).aFloat154 = ((Class10) class10_4_).aFloat154;
			((Class10) this).aFloat155 = ((Class10) class10_4_).aFloat155;
			((Class10) this).anInt159 = 1 * ((Class10) class10_4_).anInt159;
			((Class10) this).anInt157 = ((Class10) class10_4_).anInt157 * 1;
			((Class10) this).anInt163 = 1 * ((Class10) class10_4_).anInt163;
			((Class10) this).anInt158 = ((Class10) class10_4_).anInt158 * 1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ak.j(").append(')').toString());
		}
	}

	Class10(int i) {
		((Class10) this).anInt163 = i * 680837181;
	}

	public static void method426(boolean bool, int i) {
		try {
			if (1909266069 * client.anInt8987 != 1 && 1909266069 * client.anInt8987 != 2) {
				if (!bool) {
					Class95[] class95s = Class467.aClass95Array5599;
					for (int i_5_ = 0; i_5_ < class95s.length; i_5_++) {
						Class95 class95 = class95s[i_5_];
						class95.method1096(1779244518);
					}
					if (Class96.anInt864 * 412691243 != -1) {
						Class365.method4271(-1586241968);
						Class333.musicId = 1299321823;
						Class18.method452(Class96.anInt864 * 412691243, 255, 50, 700681306);
					}
				}
				client.anInt8987 = 122422461;
				Class140_Sub1.anIntArrayArray7262 = null;
				Class444.aClass330_Sub46_4496 = null;
				client.aBoolean9039 = false;
				if (-495682499 * Class96.anInt852 > 0)
					Class230.method2339(Class545.aClass545_7010, -495682499 * Class96.anInt852, -1, 360281091);
				Class515.method6204(742822054);
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2473, client.aClass1_9025.aClass488_22, 1578916159);
				class330_sub34.aClass330_Sub46_Sub2_7729.addByte(bool ? 1 : 0, (byte) 14);
				client.aClass1_9025.method378(class330_sub34, -1697077815);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ak.o(").append(')').toString());
		}
	}

	public static int method427(int i, int i_6_, boolean bool, boolean bool_7_, int i_8_) {
		try {
			Class330_Sub1 class330_sub1 = Class321.method3178(i, bool_7_, (short) 3513);
			if (class330_sub1 == null)
				return 0;
			int i_9_ = 0;
			for (int i_10_ = 0; i_10_ < ((Class330_Sub1) class330_sub1).anIntArray7500.length; i_10_++) {
				if (((Class330_Sub1) class330_sub1).anIntArray7500[i_10_] >= 0 && (((Class330_Sub1) class330_sub1).anIntArray7500[i_10_] < 1665394075 * Class556.aClass510_6392.anInt6777)) {
					ItemDefinitions itemDefinitions = Class556.aClass510_6392.getItemDefinitions((((Class330_Sub1) class330_sub1).anIntArray7500[i_10_]), (byte) -75);
					int i_11_ = itemDefinitions.method6287(i_6_, (Class301.aClass543_3059.method6339(i_6_, -1764913508).anInt6235) * -735399997, -1497870693);
					if (bool)
						i_9_ += i_11_ * (((Class330_Sub1) class330_sub1).anIntArray7497[i_10_]);
					else
						i_9_ += i_11_;
				}
			}
			return i_9_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ak.p(").append(')').toString());
		}
	}
}
