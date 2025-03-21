/* Class169 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class169 implements Interface23 {
	IndexTable aClass280_6760;
	IndexTable aClass280_6761;
	Class367 aClass367_6762 = new Class367(64);

	public Class169(Class435 class435, Class454 class454, IndexTable class280, IndexTable class280_0_) {
		((Class169) this).aClass280_6760 = class280;
		((Class169) this).aClass280_6761 = class280_0_;
		((Class169) this).aClass280_6760.method2763((-989081113 * (Class103.aClass103_950.anInt982)), -2096614565);
	}

	public void method2028(int i, int i_1_) {
		try {
			synchronized (((Class169) this).aClass367_6762) {
				((Class169) this).aClass367_6762.method4292(i, (byte) 2);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gx.i(").append(')').toString());
		}
	}

	public void method2029(byte i) {
		try {
			synchronized (((Class169) this).aClass367_6762) {
				((Class169) this).aClass367_6762.method4296(1498518940);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gx.p(").append(')').toString());
		}
	}

	public void method2030(int i) {
		try {
			synchronized (((Class169) this).aClass367_6762) {
				((Class169) this).aClass367_6762.method4298((byte) 56);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gx.j(").append(')').toString());
		}
	}

	public Class151 method2031(int i, byte i_2_) {
		try {
			Class151 class151;
			synchronized (((Class169) this).aClass367_6762) {
				class151 = (Class151) ((Class169) this).aClass367_6762.get((long) i);
			}
			if (null != class151)
				return class151;
			byte[] is;
			synchronized (((Class169) this).aClass280_6760) {
				is = (((Class169) this).aClass280_6760.getFile(-989081113 * Class103.aClass103_950.anInt982, i));
			}
			class151 = new Class151();
			((Class151) class151).aClass169_6661 = this;
			if (null != is)
				class151.method1774(new Buffer(is), (byte) 70);
			synchronized (((Class169) this).aClass367_6762) {
				((Class169) this).aClass367_6762.put(class151, (long) i);
			}
			return class151;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gx.r(").append(')').toString());
		}
	}

	public static Class350 method2032(Component component, boolean bool, byte i) {
		try {
			return new Class350_Sub1(component, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gx.r(").append(')').toString());
		}
	}

	static final void method2033(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			IndexTable.method2782(iComponentDefinitions, class120, class430, -1440813916);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gx.np(").append(')').toString());
		}
	}

	static final void method2034(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class404.method4734(iComponentDefinitions, class120, class430, 2137973521);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gx.ei(").append(')').toString());
		}
	}

	static final void method2035(Class430 class430, int i) {
		try {
			Class416.method5256((((Class430) class430).aClass432_Sub1_Sub2_Sub1_4390), (((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]), 2006105946);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (int) client.aFloatArray9253[0];
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (int) client.aFloatArray9253[1];
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (int) client.aFloatArray9253[2];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gx.arj(").append(')').toString());
		}
	}
}
