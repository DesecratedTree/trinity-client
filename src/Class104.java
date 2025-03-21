/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class104 {
	Class109 aClass109_985;
	public int[] anIntArray986;
	int anInt987 = -216756457;
	String aString988;
	String aString989;
	Class109 aClass109_990;
	public int[] anIntArray991;

	void method1242(Class115 class115, byte i) {
		try {
			int i_0_ = class115.method1413(1257772905);
			((Class104) this).aClass109_985 = Class464_Sub3.method5747(1683689676)[i_0_];
			if (((Class104) this).aClass109_985 == Class109.aClass109_1028) {
				int i_1_ = class115.method1413(-126767267);
				((Class104) this).aClass109_990 = Class464_Sub3.method5747(-1515913361)[i_1_];
				((Class104) this).anInt987 = class115.method1413(1728965477) * 216756457;
			}
			((Class104) this).aString988 = class115.method1414(-561731319);
			((Class104) this).aString989 = class115.method1414(1649217217);
			int i_2_ = class115.method1413(952116555);
			anIntArray986 = new int[i_2_];
			anIntArray991 = new int[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
				anIntArray986[i_3_] = class115.method1413(586790087);
				anIntArray991[i_3_] = class115.method1413(-399861530);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ef.r(").append(')').toString());
		}
	}

	Class104() {
		/* empty */
	}

	public static int method1243(CharSequence charsequence, int i) {
		try {
			int i_4_ = charsequence.length();
			int i_5_ = 0;
			for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
				char c = charsequence.charAt(i_6_);
				if (c <= '\u007f')
					i_5_++;
				else if (c <= '\u07ff')
					i_5_ += 2;
				else
					i_5_ += 3;
			}
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ef.r(").append(')').toString());
		}
	}

	static final void method1244(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 124953757;
			long l = (long) (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			long l_7_ = (long) (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			long l_8_ = (long) (((Class430) class430).anIntArray4387[2 + 1632830751 * ((Class430) class430).anInt4376]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (int) (l_8_ * l / l_7_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ef.zv(").append(')').toString());
		}
	}

	static final void method1245(Class430 class430, int i) {
		try {
			int i_9_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (i_9_ >= 1 && i_9_ <= 2)
				Class96.method1182(i_9_, -1, -1, false, 434078138);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ef.afu(").append(')').toString());
		}
	}

	public static int method1246(long l) {
		try {
			return (int) (l / 86400000L) - 11745;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ef.o(").append(')').toString());
		}
	}

	static final void method1247(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub13_7893.method5785(-391830017) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ef.apn(").append(')').toString());
		}
	}

	static final void method1248(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = ((Class430) class430).aClass154_4391.aByte1644;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ef.xu(").append(')').toString());
		}
	}
}
