/* Class135 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class135 {
	Class497 aClass497_1519;
	Class330_Sub15[] aClass330_Sub15Array1520;
	Interface5 anInterface5_1521;

	public Class330_Sub15 method1579(int i, int i_0_) {
		try {
			if (i >= ((Class135) this).aClass330_Sub15Array1520.length)
				return null;
			return ((Class135) this).aClass330_Sub15Array1520[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fk.r(").append(')').toString());
		}
	}

	public Class330_Sub15 method1580(String string, byte i) {
		try {
			long l = ((Class135) this).anInterface5_1521.method68(string, 2054191954);
			for (Class330_Sub15 class330_sub15 = ((Class330_Sub15) ((Class135) this).aClass497_1519.method6094(l)); null != class330_sub15; class330_sub15 = (Class330_Sub15) ((Class135) this).aClass497_1519.method6095(431045678)) {
				if (((Class330_Sub15) class330_sub15).aString7609.equals(string))
					return class330_sub15;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fk.j(").append(')').toString());
		}
	}

	void method1581(int i, byte i_1_) {
		try {
			Class330_Sub15 class330_sub15 = method1579(i, 1439297907);
			if (class330_sub15 != null) {
				class330_sub15.method3252(669167766);
				((Class135) this).aClass330_Sub15Array1520[816422875 * ((Class330_Sub15) class330_sub15).anInt7610] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fk.i(").append(')').toString());
		}
	}

	public Class135(int i, Interface5 interface5) {
		int i_2_;
		for (i_2_ = 1; i_2_ < i; i_2_ += i_2_) {
			/* empty */
		}
		((Class135) this).aClass497_1519 = new Class497(i_2_);
		((Class135) this).aClass330_Sub15Array1520 = new Class330_Sub15[i_2_];
		((Class135) this).anInterface5_1521 = interface5;
	}

	public void method1582(int i, String string, Class330_Sub15 class330_sub15, int i_3_) {
		try {
			Class330_Sub15 class330_sub15_4_ = method1580(string, (byte) -128);
			if (class330_sub15_4_ != null && i != (((Class330_Sub15) class330_sub15_4_).anInt7610 * 816422875))
				throw new IllegalArgumentException(string);
			method1581(i, (byte) 117);
			if (i >= ((Class135) this).aClass330_Sub15Array1520.length) {
				int i_5_;
				for (i_5_ = ((Class135) this).aClass330_Sub15Array1520.length; i >= i_5_; i_5_ += i_5_) {
					/* empty */
				}
				((Class135) this).aClass497_1519 = new Class497(i_5_);
				for (int i_6_ = 0; i_6_ < ((Class135) this).aClass330_Sub15Array1520.length; i_6_++) {
					Class330_Sub15 class330_sub15_7_ = ((Class135) this).aClass330_Sub15Array1520[i_6_];
					if (null != class330_sub15_7_)
						((Class135) this).aClass497_1519.method6097(class330_sub15_7_, (-6154793640677333111L * class330_sub15_7_.aLong3341));
				}
				Class330_Sub15[] class330_sub15s = new Class330_Sub15[i_5_];
				for (int i_8_ = 0; i_8_ < ((Class135) this).aClass330_Sub15Array1520.length; i_8_++)
					class330_sub15s[i_8_] = ((Class135) this).aClass330_Sub15Array1520[i_8_];
				((Class135) this).aClass330_Sub15Array1520 = class330_sub15s;
			}
			((Class330_Sub15) class330_sub15).anInt7610 = i * -1223605165;
			((Class330_Sub15) class330_sub15).aString7609 = string;
			((Class135) this).aClass497_1519.method6097(class330_sub15, ((Class135) this).anInterface5_1521.method68(string, 2110969517));
			((Class135) this).aClass330_Sub15Array1520[i] = class330_sub15;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fk.p(").append(')').toString());
		}
	}

	static final void method1583(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			((Class430) class430).anInt4376 -= 1514958270;
			int i_9_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_10_ = (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = string.indexOf(i_9_, i_10_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fk.aax(").append(')').toString());
		}
	}

	static final void method1584(Class430 class430, int i) {
		try {
			int i_11_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			int i_12_ = client.aClass286Array9234[i_11_].method2868(401952846);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_12_ == 2 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fk.yo(").append(')').toString());
		}
	}

	public static final void method1585(String string, int i, int i_13_) {
		try {
			Class1 class1 = Class426.method5317(1765610418);
			Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.FRIENDS_CHAT_RANK_PACKET, class1.aClass488_22, 581176510);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(1 + Class57.method659(string, -1087782953), (byte) 93);
			class330_sub34.aClass330_Sub46_Sub2_7729.addString(string, (byte) -86);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(i, (byte) 70);
			class1.method378(class330_sub34, -494476027);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fk.mu(").append(')').toString());
		}
	}

	static final void method1586(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class220.method2262(iComponentDefinitions, class120, class430, 1032565);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fk.ok(").append(')').toString());
		}
	}
}
