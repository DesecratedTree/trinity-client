/* Class330 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330 {
	public Class330 aClass330_3340;
	public long aLong3341;
	public Class330 aClass330_3342;

	public boolean method3251(int i) {
		try {
			if (null == aClass330_3342)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nt.q(").append(')').toString());
		}
	}

	public void method3252(int i) {
		try {
			if (aClass330_3342 != null) {
				aClass330_3342.aClass330_3340 = aClass330_3340;
				aClass330_3340.aClass330_3342 = aClass330_3342;
				aClass330_3340 = null;
				aClass330_3342 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nt.k(").append(')').toString());
		}
	}

	static final void method3253(Class430 class430, int i) {
		try {
			Class330_Sub36_Sub12 class330_sub36_sub12 = Class354.method4083(((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]);
			if (null == class330_sub36_sub12 || null == class330_sub36_sub12.aString9705)
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
			else
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = class330_sub36_sub12.aString9705;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nt.aer(").append(')').toString());
		}
	}

	static final void method3254(Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1, Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		try {
			int i_8_ = class432_sub1_sub1_sub1_0_.method5435(-1957771775);
			if (-1 != i_8_) {
				Object object = null;
				Class61 class61 = (Class61) client.aClass367_8974.get((long) i_8_);
				if (class61 == null) {
					Class87[] class87s = Class53.method641(Class540.aClass280_6249, i_8_, 0);
					if (class87s == null)
						return;
					class61 = Class361.aClass_ra3793.bw(class87s[0], true);
					client.aClass367_8974.put(class61, (long) i_8_);
				}
				Class260 class260 = class432_sub1_sub1_sub1.method5346().aClass260_2606;
				Class208.method2205(class432_sub1_sub1_sub1.aByte8658, (int) class260.aFloat2716, (int) class260.aFloat2711, class432_sub1_sub1_sub1.method5453(-1438798617) * 256, 0, false, 1536669850);
				int i_9_ = (int) (client.aFloatArray9253[0] + (float) i_1_ - 18.0F);
				int i_10_ = (int) (client.aFloatArray9253[1] + (float) i_2_ - 16.0F - 54.0F);
				i_9_ += i / 4 * 18;
				i_10_ += 18 * (i % 4);
				class61.method687(i_9_, i_10_);
				if (class432_sub1_sub1_sub1 == class432_sub1_sub1_sub1_0_)
					Class361.aClass_ra3793.method4788(i_9_ - 1, i_10_ - 1, 18, 18, -256, (byte) 45);
				Class325_Sub1 class325_sub1 = Class_ra_Sub3.method5213(62408225);
				((Class325_Sub1) class325_sub1).aClass432_Sub1_Sub1_Sub1_7475 = class432_sub1_sub1_sub1_0_;
				((Class325_Sub1) class325_sub1).anInt7474 = 258727071 * i_9_;
				((Class325_Sub1) class325_sub1).anInt7473 = i_10_ * -256858983;
				((Class325_Sub1) class325_sub1).anInt7471 = (i_9_ + 16) * -1640406511;
				((Class325_Sub1) class325_sub1).anInt7477 = 371545091 * (16 + i_10_);
				client.aClass467_9096.method5852(class325_sub1, (byte) 1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nt.js(").append(')').toString());
		}
	}

	static final void method3255(IComponentDefinitions[] class114s, int i, byte i_11_) {
		try {
			for (int i_12_ = 0; i_12_ < class114s.length; i_12_++) {
				IComponentDefinitions iComponentDefinitions = class114s[i_12_];
				if (iComponentDefinitions == null) {
					if (i_11_ <= 0)
						throw new IllegalStateException();
				} else if (i != 861085587 * iComponentDefinitions.anInt1211) {
					if (i_11_ <= 0) {
						/* empty */
					}
				} else if (client.method3918(iComponentDefinitions)) {
					if (i_11_ <= 0)
						throw new IllegalStateException();
				} else {
					if (1849136745 * iComponentDefinitions.anInt1198 == 0) {
						method3255(class114s, 751119487 * iComponentDefinitions.anInt1196, (byte) 26);
						if (null != iComponentDefinitions.aClass114Array1219)
							method3255(iComponentDefinitions.aClass114Array1219, 751119487 * iComponentDefinitions.anInt1196, (byte) 97);
						Class330_Sub48 class330_sub48 = ((Class330_Sub48) (client.aClass497_9284.method6094((long) (751119487 * iComponentDefinitions.anInt1196))));
						if (null != class330_sub48)
							Class355_Sub1.method4131((class330_sub48.anInt7859 * 856598855), 525040242);
					}
					if (6 == iComponentDefinitions.anInt1198 * 1849136745 && 53799397 * iComponentDefinitions.anInt1345 != -1) {
						if (null == iComponentDefinitions.aClass477_1344) {
							iComponentDefinitions.aClass477_1344 = new Class477_Sub1();
							iComponentDefinitions.aClass477_1344.method5988(((iComponentDefinitions.anInt1345) * 53799397), (byte) -49);
						}
						if ((iComponentDefinitions.aClass477_1344.method5981(1872757809 * client.anInt9210, 1936866212)) && iComponentDefinitions.aClass477_1344.method5978((byte) -78))
							iComponentDefinitions.aClass477_1344.method5979((byte) 73);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nt.lf(").append(')').toString());
		}
	}

	static final void method3256(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = -1600154343 * iComponentDefinitions.anInt1209;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nt.pw(").append(')').toString());
		}
	}

	public static String method3257(byte[] is, int i, int i_13_, int i_14_) {
		try {
			char[] cs = new char[i_13_];
			int i_15_ = 0;
			int i_16_ = i;
			int i_17_ = i_13_ + i;
			while (i_16_ < i_17_) {
				int i_18_ = is[i_16_++] & 0xff;
				int i_19_;
				if (i_18_ < 128) {
					if (i_18_ == 0)
						i_19_ = 65533;
					else
						i_19_ = i_18_;
				} else if (i_18_ < 192)
					i_19_ = 65533;
				else if (i_18_ < 224) {
					if (i_16_ < i_17_ && 128 == (is[i_16_] & 0xc0)) {
						i_19_ = (i_18_ & 0x1f) << 6 | is[i_16_++] & 0x3f;
						if (i_19_ < 128)
							i_19_ = 65533;
					} else
						i_19_ = 65533;
				} else if (i_18_ < 240) {
					if (1 + i_16_ < i_17_ && 128 == (is[i_16_] & 0xc0) && 128 == (is[1 + i_16_] & 0xc0)) {
						i_19_ = ((i_18_ & 0xf) << 12 | (is[i_16_++] & 0x3f) << 6 | is[i_16_++] & 0x3f);
						if (i_19_ < 2048)
							i_19_ = 65533;
					} else
						i_19_ = 65533;
				} else if (i_18_ < 248) {
					if (2 + i_16_ < i_17_ && 128 == (is[i_16_] & 0xc0) && 128 == (is[1 + i_16_] & 0xc0) && 128 == (is[i_16_ + 2] & 0xc0)) {
						i_19_ = ((i_18_ & 0x7) << 18 | (is[i_16_++] & 0x3f) << 12 | (is[i_16_++] & 0x3f) << 6 | is[i_16_++] & 0x3f);
						if (i_19_ < 65536 || i_19_ > 1114111)
							i_19_ = 65533;
						else
							i_19_ = 65533;
					} else
						i_19_ = 65533;
				} else
					i_19_ = 65533;
				cs[i_15_++] = (char) i_19_;
			}
			return new String(cs, 0, i_15_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nt.i(").append(')').toString());
		}
	}

	static void method3258(int i, int i_20_, int i_21_) {
		try {
			if (Class396.aClass417_4108.aBoolean4285 || (1 != Class484.anInt5786 * -2008486989 && (!Class211.aBoolean2061 || -2008486989 * Class484.anInt5786 != 2 || !(((Class330_Sub36_Sub10) Class422.aClass330_Sub36_Sub10_4321).aString9689.equals(Class526.aClass526_6145.method6257(Class429.aClass454_4369, 991479434)))))) {
				Class524 class524 = Class359.method4239((byte) 96);
				int i_22_ = (class524.method6240(Class526.aClass526_6062.method6257(Class429.aClass454_4369, 991479434), -838393369));
				int i_23_;
				if (!Class484.aBoolean5783) {
					for (Class330_Sub36_Sub10 class330_sub36_sub10 = ((Class330_Sub36_Sub10) Class484.aClass471_5791.method5869(539664854)); class330_sub36_sub10 != null; class330_sub36_sub10 = ((Class330_Sub36_Sub10) Class484.aClass471_5791.method5873((byte) -34))) {
						int i_24_ = Class7.method409(class330_sub36_sub10, class524, 936672521);
						if (i_24_ > i_22_)
							i_22_ = i_24_;
					}
					i_22_ += 8;
					i_23_ = 21 + (Class484.anInt5779 * 1764744137 * (Class484.anInt5786 * -2008486989));
					Class406.anInt4194 = -1970095465 * ((Class484.anInt5786 * -2008486989 * (Class484.anInt5779 * 1764744137)) + (Class484.aBoolean5807 ? 26 : 22));
				} else {
					for (Class330_Sub36_Sub13 class330_sub36_sub13 = ((Class330_Sub36_Sub13) Class484.aClass472_5793.method5884((byte) 61)); class330_sub36_sub13 != null; class330_sub36_sub13 = ((Class330_Sub36_Sub13) Class484.aClass472_5793.method5886((short) 8192))) {
						int i_25_;
						if (-213703795 * ((Class330_Sub36_Sub13) class330_sub36_sub13).anInt9715 == 1)
							i_25_ = Class7.method409(((Class330_Sub36_Sub10) (((Class330_Sub36_Sub13) class330_sub36_sub13).aClass472_9716.aClass330_Sub36_5613.aClass330_Sub36_7735)), class524, 936672521);
						else
							i_25_ = Class20.method465(class330_sub36_sub13, class524, (byte) -44);
						if (i_25_ > i_22_)
							i_22_ = i_25_;
					}
					i_22_ += 8;
					i_23_ = (Class484.anInt5790 * -1388920107 * (Class484.anInt5779 * 1764744137)) + 21;
					Class406.anInt4194 = -1970095465 * ((Class484.aBoolean5807 ? 26 : 22) + (Class484.anInt5779 * 1764744137 * (Class484.anInt5790 * -1388920107)));
				}
				i_22_ += 10;
				int i_26_ = i - i_22_ / 2;
				if (i_26_ + i_22_ > Class300.anInt3058 * -1969079741)
					i_26_ = Class300.anInt3058 * -1969079741 - i_22_;
				if (i_26_ < 0)
					i_26_ = 0;
				int i_27_ = i_20_;
				if (i_23_ + i_27_ > -1548608507 * Class146.anInt1615)
					i_27_ = Class146.anInt1615 * -1548608507 - i_23_;
				if (i_27_ < 0)
					i_27_ = 0;
				Class89.anInt736 = 1493650107 * i_26_;
				Class85.anInt713 = 1257661377 * i_27_;
				Class550.anInt6288 = 966269611 * i_22_;
				Class484.anInt5809 = (int) (Math.random() * 24.0) * 960875785;
				Class484.aBoolean5782 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nt.n(").append(')').toString());
		}
	}
}
