/* Class188 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class188 {
	Class_ra_Sub2 aClass_ra_Sub2_1852;
	Interface_ma anInterface_ma1853;
	Class367 aClass367_1854 = new Class367(6291456, 256);

	Interface11_Impl3 method2093(int i) {
		return method2094(i, -1);
	}

	Interface11_Impl3 method2094(int i, int i_0_) {
		long l = (long) (i_0_ << 16 | i);
		Interface11_Impl3 interface11_impl3 = ((Interface11_Impl3) ((Class188) this).aClass367_1854.get(l));
		if (interface11_impl3 != null)
			return interface11_impl3;
		if (!method2095(i, i_0_))
			return null;
		Class56 class56 = ((Class188) this).anInterface_ma1853.method221(i, -813319685);
		if (i_0_ == -1)
			i_0_ = class56.anInt532 * -1963453415;
		Interface11_Impl3 interface11_impl3_1_;
		if (!class56.aBoolean508 || !((Class188) this).aClass_ra_Sub2_1852.cg()) {
			int[] is;
			if (class56.aClass369_524 == Class369.aClass369_6817 || !Class376.method4368(class56.aByte525, -1670036614))
				is = ((Class188) this).anInterface_ma1853.method231(i, 0.7F, i_0_, i_0_, false, 112182405);
			else
				is = ((Class188) this).anInterface_ma1853.method220(i, 0.7F, i_0_, i_0_, true, -1960772341);
			interface11_impl3_1_ = ((Class188) this).aClass_ra_Sub2_1852.method4944(i_0_, i_0_, true, is);
		} else {
			float[] fs = ((Class188) this).anInterface_ma1853.method222(i, 0.7F, i_0_, i_0_, false, (short) 255);
			interface11_impl3_1_ = ((Class188) this).aClass_ra_Sub2_1852.method4946(Class72.aClass72_620, i_0_, i_0_, true, fs);
		}
		interface11_impl3_1_.method109(class56.aBoolean536, class56.aBoolean537);
		((Class188) this).aClass367_1854.method4299(interface11_impl3_1_, l, i_0_ * i_0_, (byte) -14);
		return interface11_impl3_1_;
	}

	Class188(Class_ra_Sub2 class_ra_sub2, Interface_ma interface_ma) {
		((Class188) this).aClass_ra_Sub2_1852 = class_ra_sub2;
		((Class188) this).anInterface_ma1853 = interface_ma;
	}

	boolean method2095(int i, int i_2_) {
		Class56 class56 = ((Class188) this).anInterface_ma1853.method221(i, -151610705);
		if (i_2_ == -1)
			i_2_ = class56.anInt532 * -1963453415;
		if (!class56.aBoolean508 || !((Class188) this).aClass_ra_Sub2_1852.cg()) {
			if (class56.aClass369_524 == Class369.aClass369_6817 || !Class376.method4368(class56.aByte525, -1335288073))
				return (((Class188) this).anInterface_ma1853.method237(i, Class377.aClass377_3935, 0.7F, i_2_, i_2_, false, 2134928037));
			return (((Class188) this).anInterface_ma1853.method237(i, Class377.aClass377_3934, 0.7F, i_2_, i_2_, true, 2144547057));
		}
		return (((Class188) this).anInterface_ma1853.method237(i, Class377.aClass377_3936, 0.7F, i_2_, i_2_, false, 2141126910));
	}

	void method2096() {
		((Class188) this).aClass367_1854.method4298((byte) 118);
	}

	void method2097() {
		((Class188) this).aClass367_1854.method4292(5, (byte) 122);
	}
}
