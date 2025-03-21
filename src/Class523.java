/* Class523 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class523 {
	IndexTable aClass280_6022;
	IndexTable aClass280_6023;
	Interface24 anInterface24_6024;
	public int anInt6025;
	Class367 aClass367_6026;
	static int anInt6027 = 1;
	public int anInt6028 = 0;
	static int anInt6029 = 32768;

	String method6232(Class390 class390, int[] is, long l) {
		try {
			if (null != ((Class523) this).anInterface24_6024) {
				String string = ((Class523) this).anInterface24_6024.method291(class390, is, l);
				if (null != string)
					return string;
			}
			return Long.toString(l);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vq.j(").append(')').toString());
		}
	}

	public Class523(Class454 class454, IndexTable class280, IndexTable class280_0_, Interface24 interface24) {
		anInt6025 = 0;
		((Class523) this).aClass367_6026 = new Class367(64);
		((Class523) this).anInterface24_6024 = null;
		((Class523) this).aClass280_6023 = class280;
		((Class523) this).aClass280_6022 = class280_0_;
		((Class523) this).anInterface24_6024 = interface24;
		if (null != ((Class523) this).aClass280_6023)
			anInt6028 = (((Class523) this).aClass280_6023.method2763(1, -2011177170) * 775281281);
		if (((Class523) this).aClass280_6022 != null)
			anInt6025 = (((Class523) this).aClass280_6022.method2763(1, -2144968860) * 155922749);
	}

	public Class330_Sub36_Sub4 method6233(int i, int i_1_) {
		try {
			Class330_Sub36_Sub4 class330_sub36_sub4 = ((Class330_Sub36_Sub4) ((Class523) this).aClass367_6026.get((long) i));
			if (class330_sub36_sub4 != null)
				return class330_sub36_sub4;
			byte[] is;
			if (i >= 32768)
				is = ((Class523) this).aClass280_6022.getFile(1, i & 0x7fff);
			else
				is = ((Class523) this).aClass280_6023.getFile(1, i);
			class330_sub36_sub4 = new Class330_Sub36_Sub4();
			((Class330_Sub36_Sub4) class330_sub36_sub4).aClass523_9657 = this;
			if (is != null)
				class330_sub36_sub4.method3456(new Buffer(is), (byte) 16);
			if (i >= 32768)
				class330_sub36_sub4.method3454(-1156308730);
			((Class523) this).aClass367_6026.put(class330_sub36_sub4, (long) i);
			return class330_sub36_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vq.r(").append(')').toString());
		}
	}

	static final void method6234(Class430 class430, byte i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4394[-54918871 * ((Class430) class430).anInt4397]);
			Integer integer = (Integer) Class332.anObjectArray6640[i_2_];
			if (integer == null) {
				Class535 class535 = Class95_Sub7.aClass536_7157.method6315(i_2_, -1210051099);
				if ('i' == class535.aChar6227 || '1' == class535.aChar6227)
					((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
				else
					((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
			} else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = integer.intValue();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vq.bp(").append(')').toString());
		}
	}

	static final void method6235(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = iComponentDefinitions.anInt1226 * -84166611;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vq.py(").append(')').toString());
		}
	}

	public static final int method6236(int i, int i_3_, int i_4_) {
		try {
			if (i == -2)
				return 12345678;
			if (i == -1) {
				if (i_3_ < 2)
					i_3_ = 2;
				else if (i_3_ > 126)
					i_3_ = 126;
				return i_3_;
			}
			i_3_ = (i & 0x7f) * i_3_ >> 7;
			if (i_3_ < 2)
				i_3_ = 2;
			else if (i_3_ > 126)
				i_3_ = 126;
			return (i & 0xff80) + i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vq.b(").append(')').toString());
		}
	}

	static void method6237(short i) {
		try {
			Class517.method6212(false, -609754562);
			if (Class354_Sub1.anInt7979 * -32500741 >= 0 && Class354_Sub1.anInt7979 * -32500741 != 0) {
				Class171.method2046(-32500741 * Class354_Sub1.anInt7979, false, 1961370808);
				if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(1171803612) != Class354_Sub1.anInt7979 * -32500741) {
					switch (Class354_Sub1.anInt7979 * -32500741) {
					case 1:
						Class136.method1591(Class533.aClass533_6907, -1186656177);
						break;
					case 2:
						Class136.method1591(Class533.aClass533_6908, -1053212406);
						break;
					case 3:
						Class136.method1591(Class533.aClass533_6912, 1305710235);
						break;
					}
				}
				Class354_Sub1.anInt7979 = -44039987;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vq.cq(").append(')').toString());
		}
	}

	public static void method6238(int i) {
		try {
			synchronized (Class393.aQueue4064) {
				for (;;) {
					Class330_Sub44_Sub1 class330_sub44_sub1 = (Class330_Sub44_Sub1) Class393.aQueue4064.poll();
					if (null == class330_sub44_sub1) {
						break;
					}
					class330_sub44_sub1.method3714(-1378139739);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vq.s(").append(')').toString());
		}
	}

	static final void method6239(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_5_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_6_ = (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			Class506 class506 = Class211.aClass505_2062.method6140(i_5_, 2000983847);
			if ('s' == class506.aChar5921) {
				/* empty */
			}
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = class506.method6144(i_6_, (byte) -9);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vq.vi(").append(')').toString());
		}
	}
}
