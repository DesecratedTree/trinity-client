/* Class214 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class214 implements Interface10 {
	public int anInt6534;
	public Class195 aClass195_6535;
	public Class211 aClass211_6536;
	public int anInt6537;
	public int anInt6538;
	public int anInt6539;
	public int anInt6540;
	public int anInt6541;
	public int anInt6542;
	public int anInt6543;
	public boolean aBoolean6544;

	Class214(int i, Class195 class195, Class211 class211, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool) {
		anInt6534 = 1923184693 * i;
		aClass195_6535 = class195;
		aClass211_6536 = class211;
		anInt6537 = 479794159 * i_0_;
		anInt6543 = -1744249647 * i_1_;
		anInt6541 = 636233519 * i_2_;
		anInt6542 = i_3_ * -394692083;
		anInt6538 = i_4_ * 336288129;
		anInt6539 = i_5_ * 446689657;
		anInt6540 = 555214917 * i_6_;
		aBoolean6544 = bool;
	}

	public Class198 method159(byte i) {
		try {
			return Class198.aClass198_1918;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("iz.j(").append(')').toString());
		}
	}

	public Class198 method160() {
		return Class198.aClass198_1918;
	}

	public Class198 method161() {
		return Class198.aClass198_1918;
	}

	static final void method2233(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 124953757;
			client.anInt9227 = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]) * 742657285;
			Class355.aClass496_3639 = Class501.method6123((((Class430) class430).anIntArray4387[1 + (((Class430) class430).anInt4376 * 1632830751)]), (byte) -31);
			if (Class355.aClass496_3639 == null)
				Class355.aClass496_3639 = Class496.aClass496_5874;
			client.anInt9264 = ((((Class430) class430).anIntArray4387[2 + ((Class430) class430).anInt4376 * 1632830751]) * 1370679235);
			Class1 class1 = Class426.method5317(2120305279);
			Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2541, class1.aClass488_22, 385206242);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(1708636109 * client.anInt9227, (byte) 92);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(Class355.aClass496_3639.anInt5876 * 353109981, (byte) 106);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(-451821333 * client.anInt9264, (byte) 127);
			class1.method378(class330_sub34, -1700130675);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("iz.acv(").append(')').toString());
		}
	}

	static final void method2234(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			int i_7_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (iComponentDefinitions.anInt1229 * 1765410959 != i_7_) {
				iComponentDefinitions.anInt1229 = i_7_ * 877008495;
				Class404.method4738(iComponentDefinitions, 1572765708);
			}
			if (-790144721 * iComponentDefinitions.anInt1287 == -1 && !class120.aBoolean1402)
				Class313.method3118(751119487 * iComponentDefinitions.anInt1196, 448400124);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("iz.dl(").append(')').toString());
		}
	}

	public static boolean method2235(int i, int i_8_, int i_9_) {
		try {
			if (!Class484.aBoolean5782)
				return false;
			int i_10_ = i >> 16;
			int i_11_ = i & 0xffff;
			if (null == Class3.aClass120Array56[i_10_] || (Class3.aClass120Array56[i_10_].aClass114Array1400[i_11_] == null))
				return false;
			IComponentDefinitions iComponentDefinitions = Class3.aClass120Array56[i_10_].aClass114Array1400[i_11_];
			if (-1 != i_8_ || iComponentDefinitions.anInt1198 * 1849136745 != 0) {
				for (Class330_Sub36_Sub10 class330_sub36_sub10 = ((Class330_Sub36_Sub10) Class484.aClass471_5791.method5869(539664854)); class330_sub36_sub10 != null; class330_sub36_sub10 = ((Class330_Sub36_Sub10) Class484.aClass471_5791.method5873((byte) -33))) {
					if (i_8_ == 272300729 * ((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9688 && ((((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9694) * -1302892359 == iComponentDefinitions.anInt1196 * 751119487) && (400571611 * ((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9699 == 58 || (400571611 * ((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9699 == 1007) || 25 == (((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9699 * 400571611) || 57 == (((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9699 * 400571611) || (400571611 * ((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9699 == 30)))
						return true;
				}
			} else {
				for (Class330_Sub36_Sub10 class330_sub36_sub10 = ((Class330_Sub36_Sub10) Class484.aClass471_5791.method5869(539664854)); null != class330_sub36_sub10; class330_sub36_sub10 = ((Class330_Sub36_Sub10) Class484.aClass471_5791.method5873((byte) -121))) {
					if ((((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9699) * 400571611 == 58 || 1007 == ((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9699 * 400571611 || (((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9699) * 400571611 == 25 || 57 == 400571611 * ((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9699 || (400571611 * ((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9699 == 30)) {
						for (IComponentDefinitions class114_12_ = (Class95.method1101(-1302892359 * (((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9694), 831955338)); null != class114_12_; class114_12_ = Class433.method5561((Class3.aClass120Array56[((class114_12_.anInt1196) * 751119487) >> 16]), class114_12_, 1540601132)) {
							if (751119487 * class114_12_.anInt1196 == iComponentDefinitions.anInt1196 * 751119487)
								return true;
						}
					}
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("iz.aj(").append(')').toString());
		}
	}
}
