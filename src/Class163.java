/* Class163 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class163 {
	IndexTable aClass280_1690;
	IndexTable aClass280_1691;
	Class152 aClass152_1692;
	static String aString1693;

	public Interface7 method1919(Interface10 interface10, byte i) {
		try {
			if (interface10 == null)
				return null;
			Class198 class198 = interface10.method159((byte) 0);
			if (Class198.aClass198_1915 == class198)
				return new Class168((Class200) interface10);
			if (class198 == Class198.aClass198_1918)
				return new Class156(method1920((short) 11339), (Class214) interface10);
			if (class198 == Class198.aClass198_1920)
				return new Class149(((Class163) this).aClass280_1690, (Class204) interface10);
			if (class198 == Class198.aClass198_1916)
				return new Class149_Sub1(((Class163) this).aClass280_1690, (Class204_Sub1) interface10);
			if (class198 == Class198.aClass198_1919)
				return new Class158_Sub1(((Class163) this).aClass280_1690, ((Class163) this).aClass280_1691, (Class201_Sub3) interface10);
			if (class198 == Class198.aClass198_1922)
				return new Class158_Sub2(((Class163) this).aClass280_1690, ((Class163) this).aClass280_1691, (Class201_Sub1) interface10);
			if (class198 == Class198.aClass198_1917)
				return new Class158_Sub3(((Class163) this).aClass280_1690, ((Class163) this).aClass280_1691, (Class201_Sub2) interface10);
			if (class198 == Class198.aClass198_1921)
				return new Class162(((Class163) this).aClass280_1690, ((Class163) this).aClass280_1691, (Class205) interface10);
			if (Class198.aClass198_1914 == class198)
				return new Class157(((Class163) this).aClass280_1690, (Class212) interface10);
			if (class198 == Class198.aClass198_1923)
				return new Class158_Sub3_Sub1(((Class163) this).aClass280_1690, ((Class163) this).aClass280_1691, ((Class201_Sub2_Sub1) interface10));
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gr.r(").append(')').toString());
		}
	}

	Class152 method1920(short i) {
		try {
			if (((Class163) this).aClass152_1692 == null)
				((Class163) this).aClass152_1692 = new Class152();
			return ((Class163) this).aClass152_1692;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gr.j(").append(')').toString());
		}
	}

	public Class163(IndexTable class280, IndexTable class280_0_) {
		((Class163) this).aClass280_1690 = class280;
		((Class163) this).aClass280_1691 = class280_0_;
	}

	static void method1921(Class330_Sub42 class330_sub42, int i, byte i_1_) {
		try {
			Object[] objects = class330_sub42.anObjectArray7817;
			int i_2_ = ((Integer) objects[0]).intValue();
			ClientScript class330_sub36_sub8 = Class327.method3240(i_2_, (byte) 48);
			if (null != class330_sub36_sub8) {
				Class430 class430 = Class325_Sub6.method3229((byte) 105);
				((Class430) class430).anIntArray4388 = new int[class330_sub36_sub8.anInt9676 * 452911023];
				int i_3_ = 0;
				((Class430) class430).anObjectArray4375 = new String[1732863009 * class330_sub36_sub8.anInt9672];
				int i_4_ = 0;
				((Class430) class430).aLongArray4372 = new long[class330_sub36_sub8.anInt9671 * 1270502353];
				int i_5_ = 0;
				for (int i_6_ = 1; i_6_ < objects.length; i_6_++) {
					if (objects[i_6_] instanceof Integer) {
						int i_7_ = ((Integer) objects[i_6_]).intValue();
						if (i_7_ == -2147483647)
							i_7_ = 2021932339 * class330_sub42.anInt7807;
						if (-2147483646 == i_7_)
							i_7_ = 390581697 * class330_sub42.anInt7811;
						if (-2147483645 == i_7_)
							i_7_ = (null != class330_sub42.aClass114_7809 ? 751119487 * (class330_sub42.aClass114_7809.anInt1196) : -1);
						if (i_7_ == -2147483644)
							i_7_ = class330_sub42.anInt7812 * -1521391619;
						if (i_7_ == -2147483643)
							i_7_ = (class330_sub42.aClass114_7809 != null ? (class330_sub42.aClass114_7809.anInt1287 * -790144721) : -1);
						if (i_7_ == -2147483642)
							i_7_ = (class330_sub42.aClass114_7813 != null ? (class330_sub42.aClass114_7813.anInt1196 * 751119487) : -1);
						if (-2147483641 == i_7_)
							i_7_ = (null != class330_sub42.aClass114_7813 ? -790144721 * (class330_sub42.aClass114_7813.anInt1287) : -1);
						if (-2147483640 == i_7_)
							i_7_ = 915415955 * class330_sub42.anInt7814;
						if (-2147483639 == i_7_)
							i_7_ = class330_sub42.anInt7815 * 1903582027;
						((Class430) class430).anIntArray4388[i_3_++] = i_7_;
					} else if (objects[i_6_] instanceof String) {
						String string = (String) objects[i_6_];
						if (string.equals("event_opbase"))
							string = class330_sub42.aString7816;
						((Class430) class430).anObjectArray4375[i_4_++] = string;
					} else if (objects[i_6_] instanceof Long) {
						long l = ((Long) objects[i_6_]).longValue();
						((Class430) class430).aLongArray4372[i_5_++] = l;
					}
				}
				((Class430) class430).anInt4377 = (-1164806363 * ((Class330_Sub42) class330_sub42).anInt7810);
				Class330_Sub12.method3302(class330_sub36_sub8, i, class430, -1350615529);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gr.s(").append(')').toString());
		}
	}

	static final void method1922(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, byte i) {
		try {
			iComponentDefinitions.aBoolean1251 = (((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]) == 1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gr.cu(").append(')').toString());
		}
	}

	static final void method1923(Class430 class430, int i) {
		try {
			int i_8_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class372 class372 = Class79.aClass380_666.method4387(i_8_, (byte) -4);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = class372.anInt3872 * -19592741;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gr.aoq(").append(')').toString());
		}
	}

	static final void method1924(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class146.method1737(iComponentDefinitions, class120, class430, -591748167);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gr.fa(").append(')').toString());
		}
	}

	static final void method1925(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Gfx.method789(iComponentDefinitions, class120, class430, 153316994);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gr.jb(").append(')').toString());
		}
	}

	static final void method1926(Class430 class430, int i) {
		try {
			int i_9_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_9_, 1499078895);
			Class120 class120 = Class3.aClass120Array56[i_9_ >> 16];
			Class110.method1362(iComponentDefinitions, class120, class430, (byte) 93);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gr.lg(").append(')').toString());
		}
	}
}
