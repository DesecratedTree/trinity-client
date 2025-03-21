/* Class330_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub22 extends Class330 {
	public long aLong7692;

	public Class330_Sub22(long l) {
		aLong7692 = l * 2625245114264389337L;
	}

	static final void method3376(Class430 class430, byte i) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub17_7910, (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) == 1 ? 1 : 0, -673737262);
			Class376.method4366((byte) -111);
			Class435.method5568(1289932142);
			client.aBoolean9194 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adc.akr(").append(')').toString());
		}
	}

	public static void method3377(int i, byte i_0_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(6, (long) i);
			class330_sub36_sub3.method3444(1908091451);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adc.n(").append(')').toString());
		}
	}

	public static int[][] method3378(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, float f, boolean bool, int i_6_) {
		try {
			int[][] is = new int[i_1_][i];
			Class330_Sub49_Sub1 class330_sub49_sub1 = new Class330_Sub49_Sub1();
			((Class330_Sub49_Sub1) class330_sub49_sub1).aBoolean9853 = bool;
			((Class330_Sub49_Sub1) class330_sub49_sub1).anInt9850 = -1729067529 * i_3_;
			((Class330_Sub49_Sub1) class330_sub49_sub1).anInt9851 = 2097991757 * i_4_;
			((Class330_Sub49_Sub1) class330_sub49_sub1).anInt9852 = i_5_ * 1604891311;
			((Class330_Sub49_Sub1) class330_sub49_sub1).anInt9846 = 2005552645 * (int) (f * 4096.0F);
			class330_sub49_sub1.method3850(981708906);
			Class511.method6178(i, i_1_, (byte) 24);
			for (int i_7_ = 0; i_7_ < i_1_; i_7_++)
				class330_sub49_sub1.method3849(i_7_, is[i_7_], (byte) -118);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adc.s(").append(')').toString());
		}
	}
}
