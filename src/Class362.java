/* Class362 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class362 {
	public static Class364 aClass364_3794 = new Class364();
	Class367 aClass367_3795 = new Class367(64);
	static int anInt3796;
	Class421 aClass421_3797;
	IndexTable aClass280_3798;
	static Class8 aClass8_3799;

	public void method4251(byte i) {
		try {
			synchronized (((Class362) this).aClass367_3795) {
				((Class362) this).aClass367_3795.method4296(-582320513);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pb.p(").append(')').toString());
		}
	}

	public void method4252(int i, byte i_0_) {
		try {
			synchronized (((Class362) this).aClass367_3795) {
				((Class362) this).aClass367_3795.method4292(i, (byte) 43);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pb.i(").append(')').toString());
		}
	}

	public Class362(Class435 class435, Class454 class454, IndexTable class280, Class421 class421) {
		((Class362) this).aClass280_3798 = class280;
		((Class362) this).aClass280_3798.method2763((Class103.aClass103_956.anInt982) * -989081113, -2135927003);
		((Class362) this).aClass421_3797 = class421;
	}

	public void method4253(int i) {
		try {
			synchronized (((Class362) this).aClass367_3795) {
				((Class362) this).aClass367_3795.method4298((byte) 44);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pb.j(").append(')').toString());
		}
	}

	public Class364 method4254(int i, int i_1_) {
		try {
			Class364 class364;
			synchronized (((Class362) this).aClass367_3795) {
				class364 = (Class364) ((Class362) this).aClass367_3795.get((long) i);
			}
			if (class364 != null)
				return class364;
			byte[] is;
			synchronized (((Class362) this).aClass280_3798) {
				is = (((Class362) this).aClass280_3798.getFile(-989081113 * Class103.aClass103_956.anInt982, i));
			}
			class364 = new Class364();
			((Class364) class364).aClass362_3810 = this;
			if (null != is)
				class364.method4267(new Buffer(is), (byte) -1);
			synchronized (((Class362) this).aClass367_3795) {
				((Class362) this).aClass367_3795.put(class364, (long) i);
			}
			return class364;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pb.r(").append(')').toString());
		}
	}

	static final void method4255(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class385.method4427(string, 1 == i_2_, 1560581462);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = -2048805097 * Class440.anInt4482;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pb.abp(").append(')').toString());
		}
	}

	static final void method4256(Class430 class430, byte i) {
		try {
			int i_3_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Character.toLowerCase((char) i_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pb.aaq(").append(')').toString());
		}
	}

	public static final int method4257(int i) {
		try {
			return (int) (1000000000L / (-3139639382665622347L * Class332.aLong6602));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pb.ac(").append(')').toString());
		}
	}
}
