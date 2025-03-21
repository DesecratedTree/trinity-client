/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class77 {
	int anInt649;
	public int anInt650;
	public int anInt651;
	public int anInt652;
	public int anInt653;
	public int anInt654;
	public int anInt655;

	public Class77() {
		/* empty */
	}

	public Class77(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		anInt652 = -1037349593 * i;
		anInt650 = -2010008277 * i_0_;
		anInt651 = -533215263 * i_1_;
		((Class77) this).anInt649 = -1372711841 * i_2_;
		anInt653 = -1441052161 * i_3_;
		anInt654 = -1973971575 * i_4_;
		anInt655 = 414539137 * i_5_;
	}

	public boolean method925(Class77 class77_6_, int i) {
		try {
			return (class77_6_.anInt652 * -576105833 == -576105833 * anInt652 && (-348036733 * anInt650 == class77_6_.anInt650 * -348036733) && (-892945375 * anInt651 == -892945375 * class77_6_.anInt651) && (((Class77) this).anInt649 * -400210017 == -400210017 * ((Class77) class77_6_).anInt649) && (anInt653 * -1132415489 == class77_6_.anInt653 * -1132415489) && (-238980935 * anInt654 == class77_6_.anInt654 * -238980935) && (-1743723903 * class77_6_.anInt655 == anInt655 * -1743723903));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dc.r(").append(')').toString());
		}
	}

	public static void method926(int[] is, Object[] objects, int i, int i_7_, int i_8_) {
		try {
			if (i < i_7_) {
				int i_9_ = (i_7_ + i) / 2;
				int i_10_ = i;
				int i_11_ = is[i_9_];
				is[i_9_] = is[i_7_];
				is[i_7_] = i_11_;
				Object object = objects[i_9_];
				objects[i_9_] = objects[i_7_];
				objects[i_7_] = object;
				int i_12_ = i_11_ == 2147483647 ? 0 : 1;
				for (int i_13_ = i; i_13_ < i_7_; i_13_++) {
					if (is[i_13_] < i_11_ + (i_13_ & i_12_)) {
						int i_14_ = is[i_13_];
						is[i_13_] = is[i_10_];
						is[i_10_] = i_14_;
						Object object_15_ = objects[i_13_];
						objects[i_13_] = objects[i_10_];
						objects[i_10_++] = object_15_;
					}
				}
				is[i_7_] = is[i_10_];
				is[i_10_] = i_11_;
				objects[i_7_] = objects[i_10_];
				objects[i_10_] = object;
				method926(is, objects, i, i_10_ - 1, 274180082);
				method926(is, objects, 1 + i_10_, i_7_, 2044493331);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dc.w(").append(')').toString());
		}
	}

	static final void method927(Class430 class430, int i) {
		try {
			int i_16_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.anIntArray9117[i_16_];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dc.tu(").append(')').toString());
		}
	}

	static final void method928(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class291.aByte2979;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dc.wq(").append(')').toString());
		}
	}

	static final void method929(Class430 class430, byte i) {
		try {
			int i_17_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (-1 != client.windowPaneId * 1522181389) {
				if (i_17_ == 0) {
					((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 1522181389 * client.windowPaneId;
					return;
				}
				i_17_--;
			}
			Class330_Sub48 class330_sub48 = (Class330_Sub48) client.aClass497_9284.method6099((byte) 34);
			while (i_17_-- > 0)
				class330_sub48 = ((Class330_Sub48) client.aClass497_9284.method6098((short) -32768));
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 856598855 * class330_sub48.anInt7859;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dc.ano(").append(')').toString());
		}
	}

	static final void method930(Class430 class430, int i) {
		try {
			if (Class503.aBoolean5914 && null != Class130.aFrame1498)
				Class96.method1182(Class448.aClass330_Sub50_5555.aClass464_Sub8_7897.method5763(849297921), -1, -1, false, -931827158);
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			boolean bool = ((((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) == 1);
			String string_18_ = new StringBuilder().append(Class228.method2315(-997158659)).append(string).toString();
			Class532.openLink(string_18_, bool, (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(13750689) == 5), client.aBoolean9042, client.aBoolean8966, 1045765320);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dc.afn(").append(')').toString());
		}
	}
}
