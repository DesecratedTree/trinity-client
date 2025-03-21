/* Class330_Sub36_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub36_Sub5 extends Class330_Sub36 {
	byte[][] aByteArrayArray9663;
	static IndexTable aClass280_9664;
	Class84[] aClass84Array9665;
	int anInt9666;

	public boolean method3458(int i) {
		try {
			if (null != ((Class330_Sub36_Sub5) this).aClass84Array9665)
				return true;
			if (null == ((Class330_Sub36_Sub5) this).aByteArrayArray9663) {
				synchronized (aClass280_9664) {
					if (!aClass280_9664.method2777((289708399 * ((Class330_Sub36_Sub5) this).anInt9666), (byte) 34)) {
						boolean bool = false;
						return bool;
					}
					int[] is = aClass280_9664.method2762((289708399 * ((Class330_Sub36_Sub5) this).anInt9666), (byte) -5);
					((Class330_Sub36_Sub5) this).aByteArrayArray9663 = new byte[is.length][];
					for (int i_0_ = 0; i_0_ < is.length; i_0_++)
						((Class330_Sub36_Sub5) this).aByteArrayArray9663[i_0_] = aClass280_9664.getFile((((Class330_Sub36_Sub5) this).anInt9666 * 289708399), is[i_0_]);
				}
			}
			boolean bool = true;
			for (int i_1_ = 0; (i_1_ < ((Class330_Sub36_Sub5) this).aByteArrayArray9663.length); i_1_++) {
				byte[] is = ((Class330_Sub36_Sub5) this).aByteArrayArray9663[i_1_];
				Buffer class330_sub46 = new Buffer(is);
				class330_sub46.offset = 323600977;
				int i_2_ = class330_sub46.readUnsignedShort(-92317940);
				synchronized (Class469.aClass280_5609) {
					bool &= Class469.aClass280_5609.method2750(i_2_, 496157488);
				}
			}
			if (!bool)
				return false;
			Class471 class471 = new Class471();
			int[] is;
			synchronized (aClass280_9664) {
				int i_3_ = aClass280_9664.method2763((((Class330_Sub36_Sub5) this).anInt9666) * 289708399, -2116078017);
				((Class330_Sub36_Sub5) this).aClass84Array9665 = new Class84[i_3_];
				is = aClass280_9664.method2762((289708399 * (((Class330_Sub36_Sub5) this).anInt9666)), (byte) -36);
			}
			for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
				byte[] is_5_ = ((Class330_Sub36_Sub5) this).aByteArrayArray9663[i_4_];
				Buffer class330_sub46 = new Buffer(is_5_);
				class330_sub46.offset = 323600977;
				int i_6_ = class330_sub46.readUnsignedShort(1887268214);
				Class330_Sub18 class330_sub18 = null;
				for (Class330_Sub18 class330_sub18_7_ = (Class330_Sub18) class471.method5869(539664854); null != class330_sub18_7_; class330_sub18_7_ = (Class330_Sub18) class471.method5873((byte) -46)) {
					if ((1159733723 * ((Class330_Sub18) class330_sub18_7_).anInt7633) == i_6_) {
						class330_sub18 = class330_sub18_7_;
						break;
					}
				}
				if (null == class330_sub18) {
					synchronized (Class469.aClass280_5609) {
						class330_sub18 = new Class330_Sub18(i_6_, (Class469.aClass280_5609.method2761(i_6_, 96349284)));
					}
					class471.method5878(class330_sub18, (short) 8192);
				}
				((Class330_Sub36_Sub5) this).aClass84Array9665[is[i_4_]] = new Class84(is_5_, class330_sub18);
			}
			((Class330_Sub36_Sub5) this).aByteArrayArray9663 = null;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajc.j(").append(')').toString());
		}
	}

	public Class330_Sub36_Sub5(int i) {
		((Class330_Sub36_Sub5) this).anInt9666 = i * -160242289;
	}

	public boolean method3459(int i, int i_8_) {
		try {
			return (((Class84) ((Class330_Sub36_Sub5) this).aClass84Array9665[i]).aBoolean699);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajc.p(").append(')').toString());
		}
	}

	public boolean method3460(int i, int i_9_) {
		try {
			return (((Class84) ((Class330_Sub36_Sub5) this).aClass84Array9665[i]).aBoolean700);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajc.o(").append(')').toString());
		}
	}

	public boolean method3461(int i, int i_10_) {
		try {
			return (((Class84) ((Class330_Sub36_Sub5) this).aClass84Array9665[i]).aBoolean698);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajc.i(").append(')').toString());
		}
	}

	static void method3462(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, Class330_Sub36_Sub10 class330_sub36_sub10, Class263 class263, Class524 class524, int i_17_, int i_18_, int i_19_) {
		try {
			if (i > i_12_ && i < i_12_ + i_14_ && i_11_ > i_16_ - -2093225349 * class524.anInt6033 - 1 && i_11_ < 143160877 * class524.anInt6035 + i_16_ && ((Class330_Sub36_Sub10) class330_sub36_sub10).aBoolean9692)
				i_17_ = i_18_;
			int[] is = Class22.method471(class330_sub36_sub10, 1955685818);
			String string = Class50.method627(class330_sub36_sub10, -170465427);
			if (is != null)
				string = new StringBuilder().append(string).append(Class431.method5343(is, -1461194327)).toString();
			class263.method2606(string, i_12_ + 3, i_16_, i_17_, 0, client.aRandom9066, -74764097 * Class382.anInt6680, Class_na.aClass61Array9725, Class444.anIntArray4495, -1490561740);
			if (((Class330_Sub36_Sub10) class330_sub36_sub10).aBoolean9696)
				Class271.aClass61_2757.method687(i_12_ + 5 + class524.method6240(string, -838393369), i_16_ - class524.anInt6033 * -2093225349);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajc.ar(").append(')').toString());
		}
	}
}
