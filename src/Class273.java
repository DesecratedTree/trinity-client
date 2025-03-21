/* Class273 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Map;

public final class Class273 {
	int anInt2758;
	AbstractQueue_Sub1 anAbstractQueue_Sub1_2759;
	AbstractQueue_Sub1 anAbstractQueue_Sub1_2760;
	long aLong2761;
	Class271 aClass271_2762;
	Map aMap2763;

	public Object method2674(Object object, int i) {
		try {
			synchronized (this) {
				if (-1L != ((Class273) this).aLong2761 * -5428598357119944393L)
					method2679((short) 4095);
				Class288 class288 = (Class288) ((Class273) this).aMap2763.remove(object);
				if (class288 != null) {
					((Class273) this).anAbstractQueue_Sub1_2759.remove(class288);
					if (method2675((byte) -50))
						((Class273) this).anAbstractQueue_Sub1_2760.remove(class288);
					Object object_0_ = ((Class288) class288).anObject2951;
					return object_0_;
				}
				Object object_1_ = null;
				return object_1_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lj.p(").append(')').toString());
		}
	}

	boolean method2675(byte i) {
		try {
			return ((Class273) this).anInt2758 * -1286678403 != -1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lj.r(").append(')').toString());
		}
	}

	public Object method2676(Object object, Object object_2_, int i) {
		try {
			synchronized (this) {
				if (-1L != ((Class273) this).aLong2761 * -5428598357119944393L)
					method2679((short) 4095);
				Class288 class288 = (Class288) ((Class273) this).aMap2763.get(object);
				if (class288 != null) {
					Object object_3_ = ((Class288) class288).anObject2951;
					((Class288) class288).anObject2951 = object_2_;
					method2677(class288, false, 1312741157);
					Object object_4_ = object_3_;
					return object_4_;
				}
				if (method2675((byte) -55) && (((Class273) this).aMap2763.size() == ((Class273) this).anInt2758 * -1286678403)) {
					Class288 class288_5_ = (Class288) ((Class273) this).anAbstractQueue_Sub1_2760.remove();
					((Class273) this).aMap2763.remove(((Class288) class288_5_).anObject2952);
					((Class273) this).anAbstractQueue_Sub1_2759.remove(class288_5_);
				}
				Class288 class288_6_ = new Class288(object_2_, object);
				((Class273) this).aMap2763.put(object, class288_6_);
				method2677(class288_6_, true, 1673824885);
				Object object_7_ = null;
				return object_7_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lj.i(").append(')').toString());
		}
	}

	void method2677(Class288 class288, boolean bool, int i) {
		try {
			if (!bool) {
				((Class273) this).anAbstractQueue_Sub1_2759.remove(class288);
				if (method2675((byte) -86) && !((Class273) this).anAbstractQueue_Sub1_2760.remove(class288))
					throw new IllegalStateException("");
			}
			((Class288) class288).aLong2953 = System.currentTimeMillis() * -6491415923264622733L;
			if (method2675((byte) -5)) {
				switch (((Class271) ((Class273) this).aClass271_2762).anInt2753 * 1382426651) {
				case 1:
					((Class288) class288).aLong2954 = (((Class288) class288).aLong2953 * 9102800332700574737L);
					break;
				case 0:
					((Class288) class288).aLong2954 += 5253132899669824163L;
					break;
				}
				((Class273) this).anAbstractQueue_Sub1_2760.add(class288);
			}
			((Class273) this).anAbstractQueue_Sub1_2759.add(class288);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lj.o(").append(')').toString());
		}
	}

	public void method2678(int i) {
		try {
			synchronized (this) {
				((Class273) this).aMap2763.clear();
				((Class273) this).anAbstractQueue_Sub1_2759.clear();
				if (method2675((byte) -57))
					((Class273) this).anAbstractQueue_Sub1_2760.clear();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lj.f(").append(')').toString());
		}
	}

	void method2679(short i) {
		try {
			if (-5428598357119944393L * ((Class273) this).aLong2761 == -1L)
				throw new IllegalStateException("");
			long l = (System.currentTimeMillis() - ((Class273) this).aLong2761 * -5428598357119944393L);
			while_77_: do {
				for (;;) {
					if (((Class273) this).anAbstractQueue_Sub1_2759.isEmpty())
						break while_77_;
					Class288 class288 = ((Class288) ((Class273) this).anAbstractQueue_Sub1_2759.peek());
					if (((Class288) class288).aLong2953 * 870820241587588539L >= l)
						break;
					((Class273) this).aMap2763.remove(((Class288) class288).anObject2952);
					((Class273) this).anAbstractQueue_Sub1_2759.remove(class288);
					if (method2675((byte) -127))
						((Class273) this).anAbstractQueue_Sub1_2760.remove(class288);
				}
				break;
			} while (false);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lj.s(").append(')').toString());
		}
	}

	public Class273(int i, Class271 class271) {
		this(-1L, i, class271);
	}

	public Object method2680(Object object, int i) {
		try {
			synchronized (this) {
				if (-5428598357119944393L * ((Class273) this).aLong2761 != -1L)
					method2679((short) 4095);
				Class288 class288 = (Class288) ((Class273) this).aMap2763.get(object);
				if (class288 == null) {
					Object object_8_ = null;
					return object_8_;
				}
				method2677(class288, false, 940462608);
				Object object_9_ = ((Class288) class288).anObject2951;
				return object_9_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lj.j(").append(')').toString());
		}
	}

	Class273(long l, int i, Class271 class271) {
		((Class273) this).aLong2761 = l * -6662316179537376121L;
		((Class273) this).anInt2758 = 1673748693 * i;
		((Class273) this).aClass271_2762 = class271;
		if (((Class273) this).anInt2758 * -1286678403 == -1) {
			((Class273) this).aMap2763 = new HashMap(64);
			((Class273) this).anAbstractQueue_Sub1_2759 = new AbstractQueue_Sub1(64);
			((Class273) this).anAbstractQueue_Sub1_2760 = null;
		} else {
			if (((Class273) this).aClass271_2762 == null)
				throw new IllegalArgumentException("");
			((Class273) this).aMap2763 = new HashMap(((Class273) this).anInt2758 * -1286678403);
			((Class273) this).anAbstractQueue_Sub1_2759 = new AbstractQueue_Sub1(((Class273) this).anInt2758 * -1286678403);
			((Class273) this).anAbstractQueue_Sub1_2760 = new AbstractQueue_Sub1(((Class273) this).anInt2758 * -1286678403);
		}
	}

	static final void method2681(Class430 class430, byte i) {
		try {
			boolean bool = true;
			if (client.aBoolean9198) {
				try {
					Object object = Class232.aClass232_2456.method2356(1860764593);
					if (object != null)
						bool = ((Boolean) object).booleanValue();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = bool ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lj.apc(").append(')').toString());
		}
	}

	static final void method2682(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub12_7906.method5783((byte) 0) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lj.apg(").append(')').toString());
		}
	}

	public static void method2683(String string, int i, int i_10_) {
		try {
			if (null == Class507.aClass498_5937)
				Class507.aClass498_5937 = new Class498();
			Class507.aClass498_5937.aString5886 = string;
			Class507.aClass498_5937.anInt5889 = -1143720213 * (i + 1099);
			Class507.aClass498_5937.anInt5887 = 1405932864 + Class507.aClass498_5937.anInt5889 * 116751407;
			Class507.aClass498_5937.anInt5885 = -1149535984 + 523924231 * Class507.aClass498_5937.anInt5889;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lj.i(").append(')').toString());
		}
	}
}
