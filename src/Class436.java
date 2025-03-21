/* Class436 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class436 {
	Class367 aClass367_4425;
	Class367 aClass367_4426 = new Class367(64);
	IndexTable aClass280_4427;

	public Class440 method5570(int i, int i_0_) {
		try {
			Class440 class440;
			synchronized (((Class436) this).aClass367_4426) {
				class440 = (Class440) ((Class436) this).aClass367_4426.get((long) i);
			}
			if (class440 != null)
				return class440;
			byte[] is;
			synchronized (((Class436) this).aClass280_4427) {
				is = (((Class436) this).aClass280_4427.getFile(Class103.aClass103_936.method1228(i, -1282308389), Class103.aClass103_936.method1227(i, (byte) 81)));
			}
			class440 = new Class440();
			class440.anInt4459 = -787806945 * i;
			((Class440) class440).aClass436_4458 = this;
			if (null != is)
				class440.method5601(new Buffer(is), 1039140702);
			class440.method5605(1771702874);
			synchronized (((Class436) this).aClass367_4426) {
				((Class436) this).aClass367_4426.put(class440, (long) i);
			}
			return class440;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sb.r(").append(')').toString());
		}
	}

	public void method5571(int i, int i_1_) {
		try {
			synchronized (((Class436) this).aClass367_4426) {
				((Class436) this).aClass367_4426.method4292(i, (byte) 36);
			}
			synchronized (((Class436) this).aClass367_4425) {
				((Class436) this).aClass367_4425.method4292(i, (byte) 76);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sb.p(").append(')').toString());
		}
	}

	public void method5572(int i) {
		try {
			synchronized (((Class436) this).aClass367_4426) {
				((Class436) this).aClass367_4426.method4296(77203997);
			}
			synchronized (((Class436) this).aClass367_4425) {
				((Class436) this).aClass367_4425.method4296(328490044);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sb.o(").append(')').toString());
		}
	}

	public Class436(Class435 class435, Class454 class454, IndexTable class280, IndexTable class280_2_, IndexTable class280_3_) {
		((Class436) this).aClass367_4425 = new Class367(100);
		((Class436) this).aClass280_4427 = class280;
		if (null != ((Class436) this).aClass280_4427) {
			int i = ((Class436) this).aClass280_4427.method2764(1283392631) - 1;
			Class103.aClass103_936.method1226((byte) 0);
			((Class436) this).aClass280_4427.method2763(i, -2055639482);
		}
		Class76_Sub2.method913(class280_2_, class280_3_, 2, -1973767305);
	}

	public void method5573(short i) {
		try {
			synchronized (((Class436) this).aClass367_4426) {
				((Class436) this).aClass367_4426.method4298((byte) 46);
			}
			synchronized (((Class436) this).aClass367_4425) {
				((Class436) this).aClass367_4425.method4298((byte) 4);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sb.i(").append(')').toString());
		}
	}

	public Class330_Sub36_Sub5 method5574(int i, int i_4_) {
		try {
			Class330_Sub36_Sub5 class330_sub36_sub5;
			synchronized (((Class436) this).aClass367_4425) {
				class330_sub36_sub5 = ((Class330_Sub36_Sub5) ((Class436) this).aClass367_4425.get((long) i));
				if (class330_sub36_sub5 == null) {
					class330_sub36_sub5 = new Class330_Sub36_Sub5(i);
					((Class436) this).aClass367_4425.put(class330_sub36_sub5, (long) i);
				}
				if (!class330_sub36_sub5.method3458(1748918469)) {
					Class330_Sub36_Sub5 class330_sub36_sub5_5_ = null;
					return class330_sub36_sub5_5_;
				}
			}
			return class330_sub36_sub5;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sb.j(").append(')').toString());
		}
	}

	public static Class387 method5575(Class_ra class_ra, int i, int i_6_, int i_7_, int i_8_, int i_9_, Class387 class387, int i_10_, int i_11_, int i_12_, int i_13_, Class477 class477, byte i_14_) {
		try {
			if (null == class387)
				return null;
			int i_15_ = 2055;
			if (class477 != null) {
				i_15_ |= class477.method5975(-586180680);
				i_15_ &= ~0x200;
			}
			long l = (((long) i_11_ << 48) + (((long) i_10_ << 32) + (long) (i_9_ + (i_12_ << 16) + (i_13_ << 24))));
			Class387 class387_16_;
			synchronized (Class459.aClass367_5566) {
				class387_16_ = (Class387) Class459.aClass367_5566.get(l);
			}
			if (null == class387_16_ || class_ra.ct(class387_16_.m(), i_15_) != 0) {
				if (null != class387_16_)
					i_15_ = class_ra.cd(i_15_, class387_16_.m());
				int i_17_;
				if (1 == i_9_)
					i_17_ = 9;
				else if (2 == i_9_)
					i_17_ = 12;
				else if (3 == i_9_)
					i_17_ = 15;
				else if (4 == i_9_)
					i_17_ = 18;
				else
					i_17_ = 21;
				int i_18_ = 3;
				int[] is = { 64, 96, 128 };
				Model class98 = new Model(i_18_ * i_17_ + 1, 2 * (i_18_ * i_17_) - i_17_, 0);
				int i_19_ = class98.method1189(0, 0, 0);
				int[][] is_20_ = new int[i_18_][i_17_];
				for (int i_21_ = 0; i_21_ < i_18_; i_21_++) {
					int i_22_ = is[i_21_];
					int i_23_ = is[i_21_];
					for (int i_24_ = 0; i_24_ < i_17_; i_24_++) {
						int i_25_ = (i_24_ << 14) / i_17_;
						int i_26_ = Class257.anIntArray2683[i_25_] * i_22_ >> 14;
						int i_27_ = Class257.anIntArray2684[i_25_] * i_23_ >> 14;
						is_20_[i_21_][i_24_] = class98.method1189(i_26_, 0, i_27_);
					}
				}
				for (int i_28_ = 0; i_28_ < i_18_; i_28_++) {
					int i_29_ = (256 * i_28_ + 128) / i_18_;
					int i_30_ = 256 - i_29_;
					byte i_31_ = (byte) (i_29_ * i_13_ + i_30_ * i_12_ >> 8);
					short i_32_ = (short) ((((i_29_ * (i_11_ & 0x7f) + (i_10_ & 0x7f) * i_30_) & 0x7f00) + (((i_30_ * (i_10_ & 0x380) + i_29_ * (i_11_ & 0x380)) & 0x38000) + ((i_29_ * (i_11_ & 0xfc00) + i_30_ * (i_10_ & 0xfc00)) & 0xfc0000))) >> 8);
					for (int i_33_ = 0; i_33_ < i_17_; i_33_++) {
						if (0 == i_28_)
							class98.method1190(i_19_, is_20_[0][(i_33_ + 1) % i_17_], is_20_[0][i_33_], (byte) 1, (byte) -1, i_32_, i_31_, (short) -1);
						else {
							class98.method1190(is_20_[i_28_ - 1][i_33_], (is_20_[i_28_ - 1][(1 + i_33_) % i_17_]), (is_20_[i_28_][(i_33_ + 1) % i_17_]), (byte) 1, (byte) -1, i_32_, i_31_, (short) -1);
							class98.method1190(is_20_[i_28_ - 1][i_33_], (is_20_[i_28_][(1 + i_33_) % i_17_]), is_20_[i_28_][i_33_], (byte) 1, (byte) -1, i_32_, i_31_, (short) -1);
						}
					}
				}
				class387_16_ = class_ra.cb(class98, i_15_, -832647419 * Class459.anInt5567, 64, 768);
				synchronized (Class459.aClass367_5566) {
					Class459.aClass367_5566.put(class387_16_, l);
				}
			}
			int i_34_ = class387.RA();
			int i_35_ = class387.ya();
			int i_36_ = class387.AA();
			int i_37_ = class387.ha();
			if (null != class477) {
				class387_16_ = class387_16_.method4446((byte) 3, i_15_, true);
				class387_16_.oa(i_35_ - i_34_ >> 1, 128, i_37_ - i_36_ >> 1);
				class387_16_.ia(i_34_ + i_35_ >> 1, 0, i_37_ + i_36_ >> 1);
				class477.method5977(class387_16_, -1602451758);
			} else {
				class387_16_ = class387_16_.method4446((byte) 3, i_15_, true);
				class387_16_.oa(i_35_ - i_34_ >> 1, 128, i_37_ - i_36_ >> 1);
				class387_16_.ia(i_34_ + i_35_ >> 1, 0, i_36_ + i_37_ >> 1);
			}
			if (i_6_ != 0)
				class387_16_.t(i_6_);
			if (i_7_ != 0)
				class387_16_.EA(i_7_);
			if (i_8_ != 0)
				class387_16_.ia(0, i_8_, 0);
			return class387_16_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sb.r(").append(')').toString());
		}
	}

	static void method5576(Class_ra class_ra, int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, byte i_43_) {
		try {
			class_ra.method4789(i, i_38_, i_39_, i_40_, i_41_, 463754225);
			class_ra.method4789(i + 1, i_38_ + 1, i_39_ - 2, 16, i_42_, 463754225);
			class_ra.method4788(i + 1, i_38_ + 18, i_39_ - 2, i_40_ - 19, i_42_, (byte) -55);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sb.ah(").append(')').toString());
		}
	}

	public static byte[] method5577(File file, int i) {
		try {
			return Class396.method4653(file, (int) file.length(), 978957823);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sb.i(").append(')').toString());
		}
	}

	static final void method5578(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub10_7873.method5771(-318107161) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sb.aqr(").append(')').toString());
		}
	}

	static final void method5579(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1330 = Class288.method2886(string, class430, 1916679088);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sb.ny(").append(')').toString());
		}
	}
}
