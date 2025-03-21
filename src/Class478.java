/* Class478 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class478 {
	int anInt5719;
	int anInt5720;
	int anInt5721;
	boolean aBoolean5722 = false;
	Class330_Sub36_Sub5 aClass330_Sub36_Sub5_5723;
	Class330_Sub36_Sub5 aClass330_Sub36_Sub5_5724;
	public static Class499 aClass499_5725;

	final boolean method6005(Class436 class436, Class440 class440, int i, int i_0_, int[] is, byte i_1_) {
		try {
			if (!((Class478) this).aBoolean5722) {
				if (i >= is.length)
					return false;
				((Class478) this).anInt5720 = -625635085 * is[i];
				((Class478) this).aClass330_Sub36_Sub5_5724 = class436.method5574((((Class478) this).anInt5720 * 1306527803) >> 16, 1847913673);
				((Class478) this).anInt5720 = -625635085 * (1306527803 * ((Class478) this).anInt5720 & 0xffff);
				if (null != ((Class478) this).aClass330_Sub36_Sub5_5724) {
					if (class440.aBoolean4479 && i_0_ != -1 && i_0_ < is.length) {
						((Class478) this).anInt5719 = -929094627 * is[i_0_];
						((Class478) this).aClass330_Sub36_Sub5_5723 = class436.method5574((((Class478) this).anInt5719 * 792772149) >> 16, 689385543);
						((Class478) this).anInt5719 = (((Class478) this).anInt5719 * 792772149 & 0xffff) * -929094627;
					}
					if (class440.aBoolean4473)
						((Class478) this).anInt5721 = (313174579 * (((Class478) this).anInt5721 * 1506304251 | 0x200));
					if (((Class478) this).aClass330_Sub36_Sub5_5724.method3459(1306527803 * ((Class478) this).anInt5720, -1884426096))
						((Class478) this).anInt5721 = (313174579 * (((Class478) this).anInt5721 * 1506304251 | 0x80));
					if (((Class478) this).aClass330_Sub36_Sub5_5724.method3461(((Class478) this).anInt5720 * 1306527803, -2105702940))
						((Class478) this).anInt5721 = (313174579 * (((Class478) this).anInt5721 * 1506304251 | 0x100));
					if (((Class478) this).aClass330_Sub36_Sub5_5724.method3460(1306527803 * ((Class478) this).anInt5720, -2044283094))
						((Class478) this).anInt5721 = (((Class478) this).anInt5721 * 1506304251 | 0x400) * 313174579;
					if (null != ((Class478) this).aClass330_Sub36_Sub5_5723) {
						if (((Class478) this).aClass330_Sub36_Sub5_5723.method3459(((Class478) this).anInt5719 * 792772149, -1575691487))
							((Class478) this).anInt5721 = (313174579 * (1506304251 * ((Class478) this).anInt5721 | 0x80));
						if (((Class478) this).aClass330_Sub36_Sub5_5723.method3461(792772149 * ((Class478) this).anInt5719, 906931948))
							((Class478) this).anInt5721 = (313174579 * (1506304251 * ((Class478) this).anInt5721 | 0x100));
						if (((Class478) this).aClass330_Sub36_Sub5_5723.method3460(792772149 * ((Class478) this).anInt5719, -2069271692))
							((Class478) this).anInt5721 = (1506304251 * ((Class478) this).anInt5721 | 0x400) * 313174579;
					}
					((Class478) this).anInt5721 = ((((Class478) this).anInt5721 * 1506304251 | 0x20) * 313174579);
					((Class478) this).aBoolean5722 = true;
					return true;
				}
				return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tu.r(").append(')').toString());
		}
	}

	final void method6006(byte i) {
		try {
			((Class478) this).aBoolean5722 = false;
			((Class478) this).anInt5721 = 0;
			((Class478) this).aClass330_Sub36_Sub5_5723 = null;
			((Class478) this).aClass330_Sub36_Sub5_5724 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tu.j(").append(')').toString());
		}
	}

	Class478() {
		/* empty */
	}

	static final void method6007(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			if ((((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]) <= (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]))
				((Class430) class430).anInt4397 += (1996761881 * (((Class430) class430).anIntArray4394[-54918871 * ((Class430) class430).anInt4397]));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tu.ax(").append(')').toString());
		}
	}

	static final void method6008(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= -1265050756;
			client.aShort9191 = (short) (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			if (client.aShort9191 <= 0)
				client.aShort9191 = (short) 1;
			client.aShort9203 = (short) (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			if (client.aShort9203 <= 0)
				client.aShort9203 = (short) 32767;
			else if (client.aShort9203 < client.aShort9191)
				client.aShort9203 = client.aShort9191;
			client.aShort9249 = (short) (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 2]);
			if (client.aShort9249 <= 0)
				client.aShort9249 = (short) 1;
			client.aShort8965 = (short) (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 3]);
			if (client.aShort8965 <= 0)
				client.aShort8965 = (short) 32767;
			else if (client.aShort8965 < client.aShort9249)
				client.aShort8965 = client.aShort9249;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tu.amq(").append(')').toString());
		}
	}

	static final void method6009(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			iComponentDefinitions.aBoolean1357 = (((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]) == 1;
			Class404.method4738(iComponentDefinitions, 1235808731);
			if (-1 == -790144721 * iComponentDefinitions.anInt1287 && !class120.aBoolean1402)
				Class64.method778(751119487 * iComponentDefinitions.anInt1196, (byte) 122);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tu.ef(").append(')').toString());
		}
	}
}
