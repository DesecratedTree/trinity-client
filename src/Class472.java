/* Class472 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class472 implements Iterable {
	public Class330_Sub36 aClass330_Sub36_5613 = new Class330_Sub36();
	Class330_Sub36 aClass330_Sub36_5614;

	public void method5883(Class330_Sub36 class330_sub36, int i) {
		try {
			if (class330_sub36.aClass330_Sub36_7736 != null)
				class330_sub36.method3439((byte) -123);
			class330_sub36.aClass330_Sub36_7736 = aClass330_Sub36_5613.aClass330_Sub36_7736;
			class330_sub36.aClass330_Sub36_7735 = aClass330_Sub36_5613;
			class330_sub36.aClass330_Sub36_7736.aClass330_Sub36_7735 = class330_sub36;
			class330_sub36.aClass330_Sub36_7735.aClass330_Sub36_7736 = class330_sub36;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("to.j(").append(')').toString());
		}
	}

	public Class330_Sub36 method5884(byte i) {
		try {
			return method5885(null, (byte) -115);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("to.s(").append(')').toString());
		}
	}

	Class330_Sub36 method5885(Class330_Sub36 class330_sub36, byte i) {
		try {
			Class330_Sub36 class330_sub36_0_;
			if (class330_sub36 == null)
				class330_sub36_0_ = aClass330_Sub36_5613.aClass330_Sub36_7735;
			else
				class330_sub36_0_ = class330_sub36;
			if (aClass330_Sub36_5613 == class330_sub36_0_) {
				((Class472) this).aClass330_Sub36_5614 = null;
				return null;
			}
			((Class472) this).aClass330_Sub36_5614 = class330_sub36_0_.aClass330_Sub36_7735;
			return class330_sub36_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("to.f(").append(')').toString());
		}
	}

	public Class330_Sub36 method5886(short i) {
		try {
			Class330_Sub36 class330_sub36 = ((Class472) this).aClass330_Sub36_5614;
			if (aClass330_Sub36_5613 == class330_sub36) {
				((Class472) this).aClass330_Sub36_5614 = null;
				return null;
			}
			((Class472) this).aClass330_Sub36_5614 = class330_sub36.aClass330_Sub36_7735;
			return class330_sub36;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("to.z(").append(')').toString());
		}
	}

	public int method5887(int i) {
		try {
			int i_1_ = 0;
			for (Class330_Sub36 class330_sub36 = aClass330_Sub36_5613.aClass330_Sub36_7735; class330_sub36 != aClass330_Sub36_5613; class330_sub36 = class330_sub36.aClass330_Sub36_7735)
				i_1_++;
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("to.w(").append(')').toString());
		}
	}

	public Iterator iterator() {
		try {
			return new Class479(this);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("to.iterator(").append(')').toString());
		}
	}

	public Class330_Sub36 method5888(int i) {
		try {
			Class330_Sub36 class330_sub36 = aClass330_Sub36_5613.aClass330_Sub36_7735;
			if (aClass330_Sub36_5613 == class330_sub36)
				return null;
			class330_sub36.method3439((byte) -38);
			return class330_sub36;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("to.o(").append(')').toString());
		}
	}

	public Class472() {
		aClass330_Sub36_5613.aClass330_Sub36_7735 = aClass330_Sub36_5613;
		aClass330_Sub36_5613.aClass330_Sub36_7736 = aClass330_Sub36_5613;
	}

	public void method5889(int i) {
		try {
			while (aClass330_Sub36_5613 != aClass330_Sub36_5613.aClass330_Sub36_7735)
				aClass330_Sub36_5613.aClass330_Sub36_7735.method3439((byte) -16);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("to.r(").append(')').toString());
		}
	}

	public static void method5890(IndexTable class280, int i) {
		try {
			Class125.anInt1451 = class280.method2754("p11_full", 323600977) * 962642559;
			Class125.anInt1452 = class280.method2754("p12_full", 323600977) * -176479269;
			Class125.anInt1453 = class280.method2754("b12_full", 323600977) * 1497104439;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("to.r(").append(')').toString());
		}
	}

	public static void method5891(String string, byte i) {
		try {
			if (client.aBoolean9150 && (Class503.anInt5916 * -1357430571 & 0x18) != 0) {
				boolean bool = false;
				int i_2_ = Class15.anInt192 * -1468156857;
				int[] is = Class15.anIntArray187;
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
					Player class432_sub1_sub1_sub1_sub1 = (client.players[is[i_3_]]);
					if (class432_sub1_sub1_sub1_sub1.aString10221 != null && class432_sub1_sub1_sub1_sub1.aString10221.equalsIgnoreCase(string) && (((Class263_Sub2.myPlayer == class432_sub1_sub1_sub1_sub1) && (-1357430571 * Class503.anInt5916 & 0x10) != 0) || ((Class503.anInt5916 * -1357430571 & 0x8) != 0))) {
						Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.INTERFACE_ON_PLAYER_PACKET, (client.aClass1_9025.aClass488_22), 219564089);
						class330_sub34.aClass330_Sub46_Sub2_7729.addLEShortA(client.anInt9104 * -830961233, -177405465);
						class330_sub34.aClass330_Sub46_Sub2_7729.addInt(651152399 * Class368.anInt3869, 1965508160);
						class330_sub34.aClass330_Sub46_Sub2_7729.addLEShort(is[i_3_], -676872267);
						class330_sub34.aClass330_Sub46_Sub2_7729.addByteA(0, (byte) -12);
						class330_sub34.aClass330_Sub46_Sub2_7729.addLEShort(client.anInt9151 * -1732113251, -676872267);
						client.aClass1_9025.method378(class330_sub34, -1229357745);
						int i_4_ = class432_sub1_sub1_sub1_sub1.method5453(-429665138);
						Class263_Sub2.method2622(class432_sub1_sub1_sub1_sub1.anIntArray10018[0], class432_sub1_sub1_sub1_sub1.anIntArray10059[0], true, Class274.method2704((class432_sub1_sub1_sub1_sub1.anIntArray10018[0]), (class432_sub1_sub1_sub1_sub1.anIntArray10059[0]), i_4_, i_4_, 0, (short) 8960), 2021620088);
						bool = true;
						break;
					}
				}
				if (!bool)
					Class475_Sub2.method5952(4, new StringBuilder().append(Class526.aClass526_6201.method6257(Class429.aClass454_4369, 991479434)).append(string).toString(), -494832051);
				if (client.aBoolean9150)
					Class490.method6071(-1799482790);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("to.ky(").append(')').toString());
		}
	}

	static final void method5892(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.method3924(iComponentDefinitions).method3265((byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("to.qu(").append(')').toString());
		}
	}
}
