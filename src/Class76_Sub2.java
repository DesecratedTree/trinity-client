/* Class76_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class76_Sub2 extends Class76 {
	protected static int anInt7098 = 4;

	public abstract boolean method899();

	public abstract void method900(Interface8_Impl1_Impl1 interface8_impl1_impl1);

	public abstract void method901(int i, Interface8_Impl1_Impl2 interface8_impl1_impl2);

	public abstract boolean method902();

	public abstract void method903(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_);

	public abstract boolean method904();

	public abstract void method905(int i, Interface8_Impl1_Impl2 interface8_impl1_impl2);

	public abstract void method906(Interface8_Impl1_Impl1 interface8_impl1_impl1);

	Class76_Sub2() {
		/* empty */
	}

	public abstract boolean method907();

	public abstract boolean method908();

	public abstract void method909(int i, Interface8_Impl1_Impl2 interface8_impl1_impl2);

	public abstract void method910(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool, boolean bool_11_);

	static final void method911(int i) {
		try {
			int i_12_ = Class15.anInt192 * -1468156857;
			int[] is = Class15.anIntArray187;
			for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
				Player class432_sub1_sub1_sub1_sub1 = client.players[is[i_13_]];
				if (class432_sub1_sub1_sub1_sub1 != null)
					Class520.method6223(class432_sub1_sub1_sub1_sub1, false, 1434126461);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yu.hg(").append(')').toString());
		}
	}

	static final void method912(Class330_Sub46_Sub2 class330_sub46_sub2, byte i) {
		try {
			for (int i_14_ = 0; i_14_ < 614054169 * Class15.anInt197; i_14_++) {
				int i_15_ = Class15.anIntArray196[i_14_];
				Player class432_sub1_sub1_sub1_sub1 = client.players[i_15_];
				int i_16_ = class330_sub46_sub2.readUnsignedByte(692596640);
				if ((i_16_ & 0x8) != 0)
					i_16_ += class330_sub46_sub2.readUnsignedByte(-227538399) << 8;
				if (0 != (i_16_ & 0x2000))
					i_16_ += class330_sub46_sub2.readUnsignedByte(942202636) << 16;
				Class103.decodePlayerMasks(class330_sub46_sub2, i_15_, class432_sub1_sub1_sub1_sub1, i_16_, -235483894);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yu.f(").append(')').toString());
		}
	}

	public static void method913(IndexTable class280, IndexTable class280_17_, int i, int i_18_) {
		try {
			Class330_Sub36_Sub5.aClass280_9664 = class280;
			Class469.aClass280_5609 = class280_17_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yu.r(").append(')').toString());
		}
	}

	static final void method914(Class430 class430, byte i) {
		try {
			int i_19_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class330_Sub36_Sub12 class330_sub36_sub12 = Class354.method4083(i_19_);
			if (null == class330_sub36_sub12)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = class330_sub36_sub12.anInt9710 * -1315354427;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yu.aee(").append(')').toString());
		}
	}
}
