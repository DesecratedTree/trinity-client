/* Class515 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class515 {
	Class367 aClass367_5971 = new Class367(64);
	IndexTable aClass280_5972;
	public int anInt5973;

	public Class515(Class435 class435, Class454 class454, IndexTable class280) {
		((Class515) this).aClass280_5972 = class280;
		anInt5973 = (((Class515) this).aClass280_5972.method2763(((Class103.aClass103_937.anInt982) * -989081113), -2110543536) * 275238147);
	}

	public Class514 method6203(int i, byte i_0_) {
		try {
			Class514 class514;
			synchronized (((Class515) this).aClass367_5971) {
				class514 = (Class514) ((Class515) this).aClass367_5971.get((long) i);
			}
			if (null != class514)
				return class514;
			byte[] is;
			synchronized (((Class515) this).aClass280_5972) {
				is = (((Class515) this).aClass280_5972.getFile(Class103.aClass103_937.anInt982 * -989081113, i));
			}
			class514 = new Class514();
			if (null != is)
				class514.method6199(new Buffer(is), -1724361798);
			synchronized (((Class515) this).aClass367_5971) {
				((Class515) this).aClass367_5971.put(class514, (long) i);
			}
			return class514;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vh.r(").append(')').toString());
		}
	}

	public static void method6204(int i) {
		try {
			Class96.aClass497_857.method6100(65280);
			Class96.aClass471_856.method5866(613065745);
			Class96.aClass79Array853 = null;
			Class96.aClass85Array854 = null;
			Class96.aClass88Array855 = null;
			Class96.aClass89Array862 = null;
			Class467.aClass95Array5599 = null;
			Class96.anInt858 = 651206033;
			Class96.anInt863 = 0;
			Class96.anInt860 = 0;
			Class532.aClass78_6455 = null;
			Class96.anInt852 = -1363868437;
			Class96.anInt864 = -1342454659;
			if (Class96.aBoolean861) {
				client.aShort9249 = Class96.aShort865;
				client.aShort8965 = Class13.aShort175;
				client.aShort9191 = Class96.aShort859;
				client.aShort9203 = Class139.aShort1535;
				Class96.aBoolean861 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vh.i(").append(')').toString());
		}
	}

	static final void method6205(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			iComponentDefinitions.aBoolean1265 = (((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]) == 1;
			Class404.method4738(iComponentDefinitions, 394346896);
			if (iComponentDefinitions.anInt1287 * -790144721 == -1 && !class120.aBoolean1402)
				Class149.method1764(iComponentDefinitions.anInt1196 * 751119487, 1329699269);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vh.gm(").append(')').toString());
		}
	}
}
