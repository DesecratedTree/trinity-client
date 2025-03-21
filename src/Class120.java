/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120 {
	public IComponentDefinitions[] aClass114Array1400;
	IComponentDefinitions[] aClass114Array1401;
	public boolean aBoolean1402;

	public IComponentDefinitions method1440(int i, byte i_0_) {
		try {
			if ((i & 0xffff) >= aClass114Array1400.length)
				return null;
			if (i >>> 16 != aClass114Array1400[0].anInt1196 * 751119487 >>> 16)
				throw new IllegalArgumentException();
			return aClass114Array1400[i & 0xffff];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ev.i(").append(')').toString());
		}
	}

	public IComponentDefinitions[] method1441(int i) {
		try {
			if (null == ((Class120) this).aClass114Array1401) {
				int i_1_ = aClass114Array1400.length;
				((Class120) this).aClass114Array1401 = new IComponentDefinitions[i_1_];
				System.arraycopy(aClass114Array1400, 0, ((Class120) this).aClass114Array1401, 0, aClass114Array1400.length);
			}
			return ((Class120) this).aClass114Array1401;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ev.j(").append(')').toString());
		}
	}

	Class120(boolean bool, IComponentDefinitions[] class114s) {
		aClass114Array1400 = class114s;
		aBoolean1402 = bool;
	}

	public IComponentDefinitions[] method1442(byte i) {
		try {
			return (null == ((Class120) this).aClass114Array1401 ? aClass114Array1400 : ((Class120) this).aClass114Array1401);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ev.r(").append(')').toString());
		}
	}

	static final void method1443(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1295 = Class288.method2886(string, class430, 1417883268);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ev.kd(").append(')').toString());
		}
	}

	static final void method1444(Class430 class430, int i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (Class556.aClass510_6392.getItemDefinitions(i_2_, (byte) -77).aBoolean6707) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ev.abt(").append(')').toString());
		}
	}
}
