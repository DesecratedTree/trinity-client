/* Class562 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Desktop;
import java.net.URI;

public class Class562 {
	static Class562 aClass562_6435 = new Class562();
	static Class562 aClass562_6436 = new Class562();
	public static IndexTable aClass280_6437;

	Class562() {
		/* empty */
	}

	public static void method6471(String string, boolean bool, boolean bool_0_, String string_1_, boolean bool_2_, boolean bool_3_, byte i) {
		try {
			if (bool) {
				do {
					if (!bool_2_ && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
						try {
							Desktop.getDesktop().browse(new URI(string));
						} catch (Exception exception) {
							break;
						}
						return;
					}
				} while (false);
				if (Class212.aString6533.startsWith("win") && !bool_2_)
					RuntimeException_Sub2.method6482(string, 0, 358284561);
				else if (Class212.aString6533.startsWith("mac"))
					Class239.method2379(string, 1, string_1_, (byte) 0);
				else
					RuntimeException_Sub2.method6482(string, 2, -1592822800);
			} else
				RuntimeException_Sub2.method6482(string, 3, 351553780);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("z.j(").append(')').toString());
		}
	}

	public static void method6472(byte i) {
		try {
			Class333.aClass316Array3347 = new Class316[50];
			Class333.anInt3360 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("z.z(").append(')').toString());
		}
	}

	public static byte[] method6473(byte[] is, int i, int i_4_, byte i_5_) {
		try {
			byte[] is_6_;
			if (i > 0) {
				is_6_ = new byte[i_4_];
				for (int i_7_ = 0; i_7_ < i_4_; i_7_++)
					is_6_[i_7_] = is[i + i_7_];
			} else
				is_6_ = is;
			Class502 class502 = new Class502();
			class502.method6130(1744702071);
			class502.method6128(is_6_, (long) (i_4_ * 8));
			byte[] is_8_ = new byte[64];
			class502.method6131(is_8_, 0, 97356391);
			return is_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("z.o(").append(')').toString());
		}
	}

	static final boolean method6474(int[][] is, int[][] is_9_, int i, int i_10_, int i_11_, int i_12_, int i_13_, short i_14_) {
		try {
			for (int i_15_ = i_10_; i_15_ <= i_12_; i_15_++) {
				for (int i_16_ = i_11_; i_16_ <= i_13_; i_16_++) {
					if (i == is[i_15_][i_16_] && is_9_[i_15_][i_16_] <= 1)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("z.it(").append(')').toString());
		}
	}

	static final void method6475(IComponentDefinitions[] class114s, int i, byte i_17_) {
		try {
			for (int i_18_ = 0; i_18_ < class114s.length; i_18_++) {
				IComponentDefinitions iComponentDefinitions = class114s[i_18_];
				if (iComponentDefinitions == null) {
					if (i_17_ >= 0)
						throw new IllegalStateException();
				} else {
					if (iComponentDefinitions.anInt1198 * 1849136745 == 0) {
						if (iComponentDefinitions.aClass114Array1219 != null)
							method6475(iComponentDefinitions.aClass114Array1219, i, (byte) -48);
						Class330_Sub48 class330_sub48 = ((Class330_Sub48) (client.aClass497_9284.method6094((long) (iComponentDefinitions.anInt1196 * 751119487))));
						if (null != class330_sub48)
							Class527.method6268((class330_sub48.anInt7859 * 856598855), i, (byte) 125);
					}
					if (0 == i && null != iComponentDefinitions.anObjectArray1330) {
						Class330_Sub42 class330_sub42 = new Class330_Sub42();
						class330_sub42.aClass114_7809 = iComponentDefinitions;
						class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1330;
						Class117.method1423(class330_sub42, -1631194987);
					}
					if (1 == i && null != iComponentDefinitions.anObjectArray1288) {
						if (iComponentDefinitions.anInt1287 * -790144721 >= 0) {
							IComponentDefinitions class114_19_ = Class95.method1101((751119487 * iComponentDefinitions.anInt1196), -1797245165);
							if (class114_19_ == null || class114_19_.aClass114Array1347 == null || (-790144721 * iComponentDefinitions.anInt1287 >= class114_19_.aClass114Array1347.length))
								continue;
							if ((class114_19_.aClass114Array1347[-790144721 * iComponentDefinitions.anInt1287]) != iComponentDefinitions) {
								if (i_17_ >= 0)
									throw new IllegalStateException();
								continue;
							}
						}
						Class330_Sub42 class330_sub42 = new Class330_Sub42();
						class330_sub42.aClass114_7809 = iComponentDefinitions;
						class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1288;
						Class117.method1423(class330_sub42, -1631194987);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("z.lk(").append(')').toString());
		}
	}

	static float method6476(float f, float f_20_, float f_21_, float f_22_, float f_23_, float f_24_, int i, int i_25_) {
		try {
			float f_26_ = 0.0F;
			float f_27_ = f_22_ - f;
			float f_28_ = f_23_ - f_20_;
			float f_29_ = f_24_ - f_21_;
			float f_30_ = 0.0F;
			float f_31_ = 0.0F;
			float f_32_ = 0.0F;
			Class356 class356 = client.aClass304_9030.method3023(-400722441);
			for (/**/; f_26_ < 1.1F; f_26_ += 0.1F) {
				float f_33_ = f_27_ * f_26_ + f;
				float f_34_ = f_20_ + f_28_ * f_26_;
				float f_35_ = f_21_ + f_29_ * f_26_;
				int i_36_ = (int) f_33_ >> 9;
				int i_37_ = (int) f_35_ >> 9;
				if (i_36_ > 0 && i_37_ > 0 && i_36_ < client.aClass304_9030.method2990(-1101883407) && i_37_ < client.aClass304_9030.method3033((byte) -52)) {
					int i_38_ = (Class263_Sub2.myPlayer.aByte8658);
					if (i_38_ < 3 && ((client.aClass304_9030.method2995(751555154).aByteArrayArrayArray2916[1][i_36_][i_37_]) & 0x2) != 0)
						i_38_++;
					int i_39_ = class356.aClass_xaArray3701[i_38_].method6416((int) f_33_, (int) f_35_, 113779001);
					if ((float) i_39_ < f_34_) {
						if (i >= 2)
							return (f_26_ - 0.1F + method6476(f_30_, f_31_, f_32_, f_33_, f_34_, f_35_, i - 1, 1655677594) * 0.1F);
						return f_26_;
					}
				}
				f_30_ = f_33_;
				f_31_ = f_34_;
				f_32_ = f_35_;
			}
			return -1.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("z.bu(").append(')').toString());
		}
	}

	static final void method6477(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class450.method5630(iComponentDefinitions, class120, class430, -835107449);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("z.hf(").append(')').toString());
		}
	}
}
