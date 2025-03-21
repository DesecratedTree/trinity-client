/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class106 {
	IndexTable aClass280_1000;
	static int anInt1001 = 1;
	static int anInt1002 = 2;
	static int anInt1003 = 0;
	Class305 aClass305_1004 = null;
	Class330_Sub6 aClass330_Sub6_1005;
	Class330_Sub40_Sub2 aClass330_Sub40_Sub2_1006;
	public int anInt1007;
	int anInt1008 = 0;
	public static Class330_Sub39 aClass330_Sub39_1009;

	Class330_Sub40_Sub2 method1316(int i) {
		try {
			return ((Class106) this).aClass330_Sub40_Sub2_1006;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eh.r(").append(')').toString());
		}
	}

	public boolean method1317(int i) {
		try {
			Class121.method1448((byte) -43);
			if (0 == 476023425 * ((Class106) this).anInt1008) {
				((Class106) this).aClass330_Sub6_1005 = ResourceLoader.getFile((((Class106) this).aClass280_1000), -943311587 * anInt1007, 0);
				if (((Class106) this).aClass330_Sub6_1005 == null)
					return false;
				((Class106) this).aClass305_1004 = new Class305(Class110.aClass280_1154, Class110.aClass280_1153);
				((Class106) this).anInt1008 = -470895231;
			}
			if (1 == ((Class106) this).anInt1008 * 476023425) {
				if (!((Class106) this).aClass330_Sub40_Sub2_1006.method3615(((Class106) this).aClass330_Sub6_1005, Class110.aClass280_1160, ((Class106) this).aClass305_1004, 22050, (short) 4394))
					return false;
				((Class106) this).anInt1008 = -941790462;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eh.i(").append(')').toString());
		}
	}

	public boolean method1318(int i) {
		try {
			return ((Class106) this).anInt1008 * 476023425 == 2;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eh.p(").append(')').toString());
		}
	}

	Class330_Sub6 method1319(int i) {
		try {
			return ((Class106) this).aClass330_Sub6_1005;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eh.j(").append(')').toString());
		}
	}

	public Class106(IndexTable class280, int i) {
		((Class106) this).aClass280_1000 = class280;
		anInt1007 = i * 1834497333;
		((Class106) this).aClass330_Sub40_Sub2_1006 = new Class330_Sub40_Sub2();
		((Class106) this).aClass330_Sub40_Sub2_1006.method3596(9, 128, -1706195171);
	}

	static void method1320(int i) {
		try {
			Class360.password = "";
			Class360.username = "";
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eh.k(").append(')').toString());
		}
	}

	static final void method1321(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			Class336.method3944(Class263_Sub2.myPlayer, (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]), (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]), 1491184698);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eh.sw(").append(')').toString());
		}
	}

	static Class330_Sub50 method1322(byte i) {
		try {
			Class490 class490 = null;
			Class330_Sub50 class330_sub50 = new Class330_Sub50(client.aClass435_9146, 0);
			try {
				class490 = Preferences.loadPreferences("", client.aClass435_9146.aString4422, false, 1838828905);
				byte[] is = new byte[(int) class490.method6066(1742373643)];
				int i_0_;
				for (int i_1_ = 0; i_1_ < is.length; i_1_ += i_0_) {
					i_0_ = class490.method6067(is, i_1_, is.length - i_1_, (byte) 26);
					if (-1 == i_0_)
						throw new IOException();
				}
				class330_sub50 = new Class330_Sub50(new Buffer(is), client.aClass435_9146, 0);
			} catch (Exception exception) {
				/* empty */
			}
			try {
				if (null != class490)
					class490.method6064(-1999184267);
			} catch (Exception exception) {
				/* empty */
			}
			return class330_sub50;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eh.r(").append(')').toString());
		}
	}

	public static Class460[] method1323(int i) {
		try {
			return (new Class460[] { Class460.aClass460_6847, Class460.aClass460_6853, Class460.aClass460_6849, Class460.aClass460_6845, Class460.aClass460_6846, Class460.aClass460_6854, Class460.aClass460_6850, Class460.aClass460_6848, Class460.aClass460_6851, Class460.aClass460_6852 });
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eh.r(").append(')').toString());
		}
	}

	static final void method1324(Class430 class430, byte i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = ((Class430) class430).aClass154_4391.aStringArray1657[i_2_];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eh.xx(").append(')').toString());
		}
	}

	static int method1325(byte[] is, int i, int i_3_, int i_4_) {
		try {
			int i_5_ = -1;
			for (int i_6_ = i; i_6_ < i_3_; i_6_++)
				i_5_ = i_5_ >>> 8 ^ (Buffer.anIntArray7845[(i_5_ ^ is[i_6_]) & 0xff]);
			i_5_ ^= 0xffffffff;
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eh.r(").append(')').toString());
		}
	}

	static final void method1326(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub5_7890.method5753((byte) -33) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eh.aqu(").append(')').toString());
		}
	}

	static final void method1327(Class430 class430, int i) {
		try {
			IComponentDefinitions iComponentDefinitions = Class95.method1101((((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]), 1925508587);
			if (null == iComponentDefinitions.aClass114Array1347)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
			else {
				int i_7_ = iComponentDefinitions.aClass114Array1347.length;
				for (int i_8_ = 0; i_8_ < iComponentDefinitions.aClass114Array1347.length; i_8_++) {
					if (iComponentDefinitions.aClass114Array1347[i_8_] == null) {
						i_7_ = i_8_;
						break;
					}
				}
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = i_7_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eh.sn(").append(')').toString());
		}
	}
}
