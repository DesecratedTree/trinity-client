/* Class230 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class230 {
	IndexTable aClass280_2440;
	IndexTable aClass280_2441;
	Class367 aClass367_2442 = new Class367(20);
	int[] anIntArray2443;
	Map aMap2444 = null;
	static int anInt2445;
	public static Interface_ma anInterface_ma2446;
	public static byte[][] aByteArrayArray2447;

	public void method2327(short i) {
		try {
			((Class230) this).aClass367_2442.method4296(520759046);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jq.l(").append(')').toString());
		}
	}

	public void method2328(byte i) {
		try {
			((Class230) this).aMap2444 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jq.j(").append(')').toString());
		}
	}

	public int method2329(byte i) {
		try {
			return method2335(false, -14102233);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jq.i(").append(')').toString());
		}
	}

	public int method2330(int i) {
		try {
			if (null == ((Class230) this).anIntArray2443)
				return 0;
			return ((Class230) this).anIntArray2443.length * 2;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jq.o(").append(')').toString());
		}
	}

	public Object method2331(Interface12 interface12, int i, boolean bool, boolean bool_0_, byte i_1_) {
		try {
			Class485 class485 = method2336(interface12, i, bool, bool_0_, -189977195);
			if (class485 == null)
				return null;
			return class485.anObject5824;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jq.s(").append(')').toString());
		}
	}

	public void method2332(Interface12 interface12, int i) {
		try {
			((Class230) this).aMap2444 = new HashMap(((Class230) this).anIntArray2443.length);
			for (int i_2_ = 0; i_2_ < ((Class230) this).anIntArray2443.length; i_2_++) {
				int i_3_ = ((Class230) this).anIntArray2443[i_2_];
				Class524 class524 = Class375.method4356(((Class230) this).aClass280_2441, i_3_, -1641316415);
				byte[] is = ((Class230) this).aClass280_2440.method2761(i_3_, 2089232975);
				Object object = interface12.method170(is, class524, true, -1035322106);
				((Class230) this).aMap2444.put(Integer.valueOf(i_2_), new Class485(object, class524));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jq.r(").append(')').toString());
		}
	}

	public Class524 method2333(Interface12 interface12, int i, int i_4_) {
		try {
			Class485 class485 = method2336(interface12, i, true, true, -189977195);
			if (class485 == null)
				return null;
			return (Class524) class485.anObject5823;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jq.f(").append(')').toString());
		}
	}

	public void method2334(int i) {
		try {
			((Class230) this).aClass367_2442.method4298((byte) 99);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jq.w(").append(')').toString());
		}
	}

	public int method2335(boolean bool, int i) {
		try {
			if (null == ((Class230) this).anIntArray2443)
				return 0;
			if (!bool && null != ((Class230) this).aMap2444)
				return 2 * ((Class230) this).anIntArray2443.length;
			int i_5_ = 0;
			for (int i_6_ = 0; i_6_ < ((Class230) this).anIntArray2443.length; i_6_++) {
				int i_7_ = ((Class230) this).anIntArray2443[i_6_];
				if (((Class230) this).aClass280_2440.method2750(i_7_, -796275983))
					i_5_++;
				if (((Class230) this).aClass280_2441.method2750(i_7_, 1304927200))
					i_5_++;
			}
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jq.p(").append(')').toString());
		}
	}

	Class485 method2336(Interface12 interface12, int i, boolean bool, boolean bool_8_, int i_9_) {
		try {
			if (i == -1)
				return null;
			if (((Class230) this).anIntArray2443 != null) {
				for (int i_10_ = 0; i_10_ < ((Class230) this).anIntArray2443.length; i_10_++) {
					if (i == ((Class230) this).anIntArray2443[i_10_])
						return (Class485) ((Class230) this).aMap2444.get(Integer.valueOf(i_10_));
				}
			}
			Class485 class485 = ((Class485) ((Class230) this).aClass367_2442.get((long) (i << 1 | (bool_8_ ? 1 : 0))));
			if (null != class485) {
				if (bool && null == class485.anObject5823) {
					Class524 class524 = Class375.method4356(((Class230) this).aClass280_2441, i, -1641316415);
					if (null == class524)
						return null;
					class485.anObject5823 = class524;
				}
				return class485;
			}
			byte[] is = ((Class230) this).aClass280_2440.method2761(i, 2130049196);
			if (is == null)
				return null;
			Class524 class524 = Class375.method4356(((Class230) this).aClass280_2441, i, -1641316415);
			if (null == class524)
				return null;
			if (bool)
				class485 = new Class485(interface12.method170(is, class524, bool_8_, 264194540), class524);
			else
				class485 = new Class485(interface12.method170(is, class524, bool_8_, -1760059040), null);
			((Class230) this).aClass367_2442.put(class485, (long) (i << 1 | (bool_8_ ? 1 : 0)));
			return class485;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jq.z(").append(')').toString());
		}
	}

	public Class230(IndexTable class280, IndexTable class280_11_, int[] is) {
		((Class230) this).aClass280_2440 = class280;
		((Class230) this).aClass280_2441 = class280_11_;
		if (null != is)
			((Class230) this).anIntArray2443 = is;
		else
			((Class230) this).anIntArray2443 = null;
	}

	public void method2337(int i, int i_12_) {
		try {
			((Class230) this).aClass367_2442.method4292(i, (byte) 27);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jq.n(").append(')').toString());
		}
	}

	public static final int method2338(int i, int i_13_, int i_14_, int i_15_) {
		try {
			if (i_14_ > 243)
				i_13_ >>= 4;
			else if (i_14_ > 217)
				i_13_ >>= 3;
			else if (i_14_ > 192)
				i_13_ >>= 2;
			else if (i_14_ > 179)
				i_13_ >>= 1;
			return ((i & 0xff) >> 2 << 10) + (i_13_ >> 5 << 7) + (i_14_ >> 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jq.k(").append(')').toString());
		}
	}

	public static void method2339(Class545 class545, int i, int i_16_, int i_17_) {
		try {
			Class430 class430 = Class325_Sub6.method3229((byte) 100);
			Class217.method2252(class545, i, i_16_, class430, -1618875482);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jq.n(").append(')').toString());
		}
	}

	static final void method2340(Class430 class430, int i) {
		try {
			int i_18_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_18_, -426233197);
			Class120 class120 = Class3.aClass120Array56[i_18_ >> 16];
			Class391.method4603(iComponentDefinitions, class120, class430, -1210377693);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jq.hc(").append(')').toString());
		}
	}

	static final void method2341(Class430 class430, int i) {
		try {
			int i_19_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_19_, 1498606163);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = iComponentDefinitions.anInt1211 * 861085587;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jq.rm(").append(')').toString());
		}
	}

	public static boolean method2342(byte i, int i_20_) {
		try {
			int i_21_ = i & 0xff;
			if (0 == i_21_)
				return false;
			if (i_21_ >= 128 && i_21_ < 160 && '\0' == Class458.aCharArray5564[i_21_ - 128])
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jq.i(").append(')').toString());
		}
	}

	static final void method2343(boolean largeView, int i) {
		try {
			client.anInt9022 = 0;
			client.anInt9019 = 0;
			client.anInt8996 += -1017538359;
			Class359.method4238((byte) 2);
			Class468.method5862(largeView, 791376098);
			Class2.decodeNpcMasks(1382868750);
			boolean bool_22_ = false;
			for (int i_23_ = 0; i_23_ < client.anInt9022 * 1143933639; i_23_++) {
				int i_24_ = client.anIntArray9021[i_23_];
				Class330_Sub35 class330_sub35 = ((Class330_Sub35) client.aClass497_9014.method6094((long) i_24_));
				NPC class432_sub1_sub1_sub1_sub2 = ((NPC) class330_sub35.anObject7733);
				if (-395183177 * class432_sub1_sub1_sub1_sub2.anInt10069 != client.anInt8996 * 1570636153) {
					if (Class484.aBoolean5782 && Class378.method4380(i_24_, -1137361974))
						Class513.method6194((byte) -25);
					if (class432_sub1_sub1_sub1_sub2.aClass551_10251.method6372((byte) 37))
						Class324.method3202(class432_sub1_sub1_sub1_sub2, -1493180928);
					class432_sub1_sub1_sub1_sub2.method5475(null, 1918950667);
					class330_sub35.method3252(-816582589);
					bool_22_ = true;
				}
			}
			if (bool_22_) {
				int i_25_ = -1183709625 * client.anInt9232;
				client.anInt9232 = client.aClass497_9014.method6096(940963698) * 93438839;
				int i_26_ = 0;
				Iterator iterator = client.aClass497_9014.iterator();
				while (iterator.hasNext()) {
					Class330_Sub35 class330_sub35 = (Class330_Sub35) iterator.next();
					client.aClass330_Sub35Array9015[i_26_++] = class330_sub35;
				}
				for (int i_27_ = -1183709625 * client.anInt9232; i_27_ < i_25_; i_27_++)
					client.aClass330_Sub35Array9015[i_27_] = null;
			}
			if (-275392715 * ((Class1) client.aClass1_9025).anInt26 != (((Class1) client.aClass1_9025).aClass330_Sub46_Sub2_17.offset) * -824785231)
				throw new RuntimeException(new StringBuilder().append((((Class1) client.aClass1_9025).aClass330_Sub46_Sub2_17.offset) * -824785231).append(" ").append(-275392715 * (((Class1) client.aClass1_9025).anInt26)).toString());
			for (int i_28_ = 0; i_28_ < client.anInt9017 * -823688441; i_28_++) {
				if (client.aClass497_9014.method6094((long) client.anIntArray9018[i_28_]) == null)
					throw new RuntimeException(new StringBuilder().append(i_28_).append(" ").append(client.anInt9017 * -823688441).toString());
			}
			if (0 != (client.anInt9232 * -1183709625 - -823688441 * client.anInt9017))
				throw new RuntimeException(new StringBuilder().append("").append(-1183709625 * client.anInt9232 - (client.anInt9017 * -823688441)).toString());
			for (int i_29_ = 0; i_29_ < client.anInt9232 * -1183709625; i_29_++) {
				if (-395183177 * ((Class432_Sub1_Sub1_Sub1) (client.aClass330_Sub35Array9015[i_29_].anObject7733)).anInt10069 != client.anInt8996 * 1570636153)
					throw new RuntimeException(new StringBuilder().append("").append(((Class432_Sub1_Sub1_Sub1) (client.aClass330_Sub35Array9015[i_29_].anObject7733)).anInt10008 * -1654044763).toString());
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jq.jx(").append(')').toString());
		}
	}

	public static final void method2344(String string, byte i) {
		try {
			if (string != null) {
				String string_30_ = Class531.method6297(string, -1727356092);
				if (string_30_ != null) {
					for (int i_31_ = 0; i_31_ < client.anInt9256 * 652732387; i_31_++) {
						Class99 class99 = client.aClass99Array9259[i_31_];
						String string_32_ = class99.aString915;
						String string_33_ = Class531.method6297(string_32_, -1622823747);
						if (Class432_Sub1_Sub5_Sub2.method5553(string, string_30_, string_32_, string_33_, 62316653)) {
							client.anInt9256 -= -192113205;
							for (int i_34_ = i_31_; i_34_ < client.anInt9256 * 652732387; i_34_++)
								client.aClass99Array9259[i_34_] = client.aClass99Array9259[1 + i_34_];
							client.anInt9023 = client.anInt9268 * 640746829;
							Class1 class1 = Class426.method5317(1723765424);
							Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.REMOVE_FRIEND_PACKET, class1.aClass488_22, 141943473);
							class330_sub34.aClass330_Sub46_Sub2_7729.addByte(Class57.method659(string, -874804490), (byte) 36);
							class330_sub34.aClass330_Sub46_Sub2_7729.addString(string, (byte) -61);
							class1.method378(class330_sub34, -79279530);
							break;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jq.mc(").append(')').toString());
		}
	}

	static final void method2345(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class120.method1443(iComponentDefinitions, class120, class430, -71999207);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jq.kr(").append(')').toString());
		}
	}
}
