

public class Class119 {
	public boolean aBoolean1403;
	WidgetConfig[] aClass105Array1404;
	public WidgetConfig[] components;

	public WidgetConfig[] method1295(byte i) {
		try {
			return (null == ((Class119) this).aClass105Array1404 ? components : ((Class119) this).aClass105Array1404);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ev.a(").append(')').toString());
		}
	}

	public WidgetConfig[] method1296(byte i) {
		try {
			if (((Class119) this).aClass105Array1404 == null) {
				int i_0_ = components.length;
				((Class119) this).aClass105Array1404 = new WidgetConfig[i_0_];
				System.arraycopy(components, 0, ((Class119) this).aClass105Array1404, 0, components.length);
			}
			return ((Class119) this).aClass105Array1404;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ev.f(").append(')').toString());
		}
	}

	public WidgetConfig method1297(int i, short i_1_) {
		try {
			/*if (components[0].uid * -440872681 >>> 16 != i >>> 16)
				throw new IllegalArgumentException();*/
			return components[i & 0xffff];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ev.b(").append(')').toString());
		}
	}

	Class119(boolean bool, WidgetConfig[] class105s) {
		components = class105s;
		aBoolean1403 = bool;
	}

	static final void method1298(WidgetConfig class105, Class119 class119, ClientScript2 class403, byte i) {
		try {
			class105.anInt1184 = 939239877;
			class105.anInt1151 = -127794683 * client.playerIndex;
			class105.anInt1140 = 0;
			if (-1 == class105.anInt1154 * -1309843523 && !class119.aBoolean1403)
				Preference.method5623(class105.uid * -440872681, 1429753437);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ev.iz(").append(')').toString());
		}
	}

	static final void method1299(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.preferences.aClass422_Sub8_7566.method5654(-1747444886);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ev.akh(").append(')').toString());
		}
	}

	public static void method1300(int i, int i_2_) {
		try {
			Class298_Sub49 class298_sub49 = ((Class298_Sub49) Class423.aClass437_5354.method5812((long) i));
			if (null != class298_sub49) {
				((Class298_Sub49) class298_sub49).aBoolean7592 = !((Class298_Sub49) class298_sub49).aBoolean7592;
				((Class298_Sub49) class298_sub49).aClass308_Sub1_7591.method3776(((Class298_Sub49) class298_sub49).aBoolean7592, -480568150);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ev.f(").append(')').toString());
		}
	}

	static long method1301(Interface3 interface3, int i, int i_3_, int i_4_) {
		try {
			long l = 4194304L;
			long l_5_ = -9223372036854775808L;
			ObjectConfig class432 = client.aClass283_8716.method2641(-1623210152).getObjectDefinitions(interface3.method32((byte) 18));
			long l_6_ = (long) (i | i_3_ << 7 | interface3.method29(726839210) << 14 | interface3.method30((short) 11182) << 20 | 0x40000000);
			if (0 == 1532834983 * class432.optionType)
				l_6_ |= l_5_;
			if (class432.opcode75V * 512737201 == 1)
				l_6_ |= l;
			l_6_ |= (long) interface3.method32((byte) 34) << 32;
			return l_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ev.c(").append(')').toString());
		}
	}

	static final void method1302(ClientScript2 class403, int i) {
		try {
			int i_7_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			WidgetConfig class105 = Class50.getIComponentDefinitions(i_7_, (byte) 0);
			Class119 class119 = Class389.aClass119Array4165[i_7_ >> 16];
			Class410.method4981(class105, class119, class403, (byte) -31);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ev.dl(").append(')').toString());
		}
	}

	static void method1303(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 - 2] = (Class316.aClass362_3318.method4307((((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 - 2]), 245040087).anIntArray4016[(((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 1])]);
			((ClientScript2) class403).anInt5239 -= -391880689;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ev.u(").append(')').toString());
		}
	}

	static final void method1304(int i) {
		try {
			client.anInt8870 = -221729505;
			client.anInt8724 = -1334571751;
			Class298_Sub37.anIntArrayArray7407 = null;
			Class128_Sub1.aClass298_Sub53_8555 = null;
			Class228.method2117(416919128);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ev.gj(").append(')').toString());
		}
	}
}
