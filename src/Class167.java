/* Class167 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class167 {
	Class471 aClass471_1701;
	long aLong1702;
	long aLong1703 = -7856911686468016557L;
	static int anInt1704 = 1;
	static int anInt1705 = 2;
	static int anInt1706 = 3;
	static int anInt1707 = 4;

	void method2017(Buffer class330_sub46, int i) {
		try {
			((Class167) this).aLong1702 = class330_sub46.readLong(-321376315) * 6954024809789619667L;
			((Class167) this).aLong1703 = class330_sub46.readLong(603441022) * 7856911686468016557L;
			for (int i_0_ = class330_sub46.readUnsignedByte(1416651188); 0 != i_0_; i_0_ = class330_sub46.readUnsignedByte(419018896)) {
				Class330_Sub26 class330_sub26;
				if (i_0_ == 1)
					class330_sub26 = new Class330_Sub26_Sub2(this);
				else if (4 == i_0_)
					class330_sub26 = new Class330_Sub26_Sub3(this);
				else if (i_0_ == 3)
					class330_sub26 = new Class330_Sub26_Sub1(this);
				else if (2 == i_0_)
					class330_sub26 = new Class330_Sub26_Sub4(this);
				else
					throw new RuntimeException("");
				class330_sub26.method3388(class330_sub46, 1871164005);
				((Class167) this).aClass471_1701.method5878(class330_sub26, (short) 8192);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gv.r(").append(')').toString());
		}
	}

	public void method2018(Class330_Sub39 class330_sub39, int i) {
		try {
			if ((class330_sub39.aLong3341 * -6154793640677333111L != ((Class167) this).aLong1702 * 3720148998382346843L) || ((3114108088645606387L * ((Class330_Sub39) class330_sub39).aLong7762) != -1673868425232633307L * ((Class167) this).aLong1703))
				throw new RuntimeException("");
			for (Class330_Sub26 class330_sub26 = (Class330_Sub26) ((Class167) this).aClass471_1701.method5869(539664854); class330_sub26 != null; class330_sub26 = (Class330_Sub26) ((Class167) this).aClass471_1701.method5873((byte) -99))
				class330_sub26.method3389(class330_sub39, -119734827);
			((Class330_Sub39) class330_sub39).aLong7762 += 6220279094848042299L;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gv.j(").append(')').toString());
		}
	}

	public Class167(Buffer class330_sub46) {
		((Class167) this).aClass471_1701 = new Class471();
		method2017(class330_sub46, 1300969322);
	}

	static final void method2019(Class430 class430, int i) {
		try {
			int i_1_ = (((Class430) class430).anIntArray4394[((Class430) class430).anInt4397 * -54918871]);
			ClientScript class330_sub36_sub8 = Class327.method3240(i_1_, (byte) 102);
			if (class330_sub36_sub8 == null)
				throw new RuntimeException();
			int[] is = new int[class330_sub36_sub8.anInt9676 * 452911023];
			Object[] objects = new Object[class330_sub36_sub8.anInt9672 * 1732863009];
			long[] ls = new long[class330_sub36_sub8.anInt9671 * 1270502353];
			for (int i_2_ = 0; i_2_ < 637305345 * class330_sub36_sub8.anInt9678; i_2_++)
				is[i_2_] = (((Class430) class430).anIntArray4387[i_2_ + (((Class430) class430).anInt4376 * 1632830751 - class330_sub36_sub8.anInt9678 * 637305345)]);
			for (int i_3_ = 0; i_3_ < -1357107577 * class330_sub36_sub8.anInt9680; i_3_++)
				objects[i_3_] = (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 * -1378875437 - -1357107577 * class330_sub36_sub8.anInt9680 + i_3_)]);
			for (int i_4_ = 0; i_4_ < -701900361 * class330_sub36_sub8.anInt9677; i_4_++)
				ls[i_4_] = (((Class430) class430).aLongArray4379[(i_4_ + (-1969146619 * ((Class430) class430).anInt4380 - class330_sub36_sub8.anInt9677 * -701900361))]);
			((Class430) class430).anInt4376 -= class330_sub36_sub8.anInt9678 * 1401386207;
			((Class430) class430).anInt4378 -= -447946243 * class330_sub36_sub8.anInt9680;
			((Class430) class430).anInt4380 -= class330_sub36_sub8.anInt9677 * -1799958389;
			Class433 class433 = new Class433();
			((Class433) class433).aClass330_Sub36_Sub8_4413 = ((Class430) class430).aClass330_Sub36_Sub8_4393;
			((Class433) class433).anInt4411 = -1576801321 * ((Class430) class430).anInt4397;
			((Class433) class433).anIntArray4412 = ((Class430) class430).anIntArray4388;
			((Class433) class433).anObjectArray4410 = ((Class430) class430).anObjectArray4375;
			((Class433) class433).aLongArray4414 = ((Class430) class430).aLongArray4372;
			if (821898631 * ((Class430) class430).anInt4371 >= ((Class430) class430).aClass433Array4382.length)
				throw new RuntimeException();
			((Class430) class430).aClass433Array4382[((((Class430) class430).anInt4371 += 1914243127) * 821898631 - 1)] = class433;
			((Class430) class430).aClass330_Sub36_Sub8_4393 = class330_sub36_sub8;
			((Class430) class430).aClass445Array4383 = (((Class430) class430).aClass330_Sub36_Sub8_4393.aClass445Array9670);
			((Class430) class430).anIntArray4394 = (((Class430) class430).aClass330_Sub36_Sub8_4393.anIntArray9673);
			((Class430) class430).anInt4397 = -1996761881;
			((Class430) class430).anIntArray4388 = is;
			((Class430) class430).anObjectArray4375 = objects;
			((Class430) class430).aLongArray4372 = ls;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gv.az(").append(')').toString());
		}
	}

	static final void method2020(Class430 class430, short i) {
		try {
			Class166_Sub1.method1998((byte) 89);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gv.ahm(").append(')').toString());
		}
	}

	static final void method2021(Class430 class430, int i) {
		try {
			int i_5_ = ((client.anIntArrayArrayArray9082[(((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)])]).length >> 1);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gv.afy(").append(')').toString());
		}
	}

	static final void method2022(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			boolean bool = ((((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) == 1);
			Class2.method393(string, bool, -769212662);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class440.anInt4482 * -2048805097;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gv.adk(").append(')').toString());
		}
	}

	public static String method2023(Object[] objects, int i, int i_6_, byte i_7_) {
		try {
			if (i_6_ == 0)
				return "";
			if (1 == i_6_) {
				CharSequence charsequence = (CharSequence) objects[i];
				if (null == charsequence)
					return "null";
				return charsequence.toString();
			}
			int i_8_ = i + i_6_;
			int i_9_ = 0;
			for (int i_10_ = i; i_10_ < i_8_; i_10_++) {
				CharSequence charsequence = (CharSequence) objects[i_10_];
				if (charsequence == null)
					i_9_ += 4;
				else
					i_9_ += charsequence.length();
			}
			StringBuilder stringbuilder = new StringBuilder(i_9_);
			for (int i_11_ = i; i_11_ < i_8_; i_11_++) {
				CharSequence charsequence = (CharSequence) objects[i_11_];
				if (charsequence == null)
					stringbuilder.append("null");
				else
					stringbuilder.append(charsequence);
			}
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gv.j(").append(')').toString());
		}
	}

	static Class330_Sub36_Sub3 method2024(int i) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = ((Class330_Sub36_Sub3) Class330_Sub36_Sub3.aClass472_9625.method5884((byte) 73));
			if (null == class330_sub36_sub3) {
				if (i != -848220559) {
					/* empty */
				}
			} else {
				class330_sub36_sub3.method3252(-2102594038);
				class330_sub36_sub3.method3439((byte) -110);
				return class330_sub36_sub3;
			}
			do {
				class330_sub36_sub3 = (Class330_Sub36_Sub3) Class330_Sub36_Sub3.aClass472_9652.method5884((byte) 53);
				if (class330_sub36_sub3 == null)
					return null;
				if (class330_sub36_sub3.method3447((byte) 1) > Class312.method3111((byte) 47))
					return null;
				class330_sub36_sub3.method3252(1574058307);
				class330_sub36_sub3.method3439((byte) -112);
			} while ((class330_sub36_sub3.aLong7734 * -6756588965814089169L & ~0x7fffffffffffffffL) == 0L);
			return class330_sub36_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gv.i(").append(')').toString());
		}
	}
}
