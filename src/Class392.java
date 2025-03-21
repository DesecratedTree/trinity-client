/* Class392 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class392 implements Interface25 {
	static int anInt6792;
	static Class357 aClass357_6793;

	public void method295(boolean bool) {
		/* empty */
	}

	public void method293(int i, int i_0_, int i_1_, int i_2_) {
		try {
			int i_3_ = i >> 16;
			int i_4_ = i & 0xffff;
			synchronized (Class393.aQueue4064) {
				Class393.aQueue4064.add(Class386.method4439(i_3_, i_4_, i_0_, i_1_, -2034517636));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qf.j(").append(')').toString());
		}
	}

	public void method294(int i, int i_5_, int i_6_) {
		int i_7_ = i >> 16;
		int i_8_ = i & 0xffff;
		synchronized (Class393.aQueue4064) {
			Class393.aQueue4064.add(Class386.method4439(i_7_, i_8_, i_5_, i_6_, -1917561549));
		}
	}

	public void method292(boolean bool, int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qf.r(").append(')').toString());
		}
	}

	public void method296(boolean bool) {
		/* empty */
	}

	static final void method4608(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			int i_9_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (i_9_ == IComponentDefinitions.anInt1327 * -1166511997 || i_9_ == IComponentDefinitions.anInt1173 * -2112094707 || i_9_ == IComponentDefinitions.anInt1174 * 2036851291)
				iComponentDefinitions.anInt1291 = i_9_ * 7338993;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qf.im(").append(')').toString());
		}
	}

	static final void method4609(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			Class1 class1 = Class426.method5317(1780618600);
			Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.FRIEND_QUICK_CHAT_PACKET, class1.aClass488_22, 1657658158);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 32);
			int i_10_ = (-824785231 * class330_sub34.aClass330_Sub46_Sub2_7729.offset);
			class330_sub34.aClass330_Sub46_Sub2_7729.addString(string, (byte) -119);
			class330_sub34.aClass330_Sub46_Sub2_7729.addShort(((Class430) class430).aClass209_4385.anInt1981 * 1955043023, (byte) 117);
			((Class430) class430).aClass209_4385.aClass330_Sub36_Sub4_1982.method3450(class330_sub34.aClass330_Sub46_Sub2_7729, ((Class430) class430).aClass209_4385.anIntArray1983, (byte) 59);
			class330_sub34.aClass330_Sub46_Sub2_7729.method3751((class330_sub34.aClass330_Sub46_Sub2_7729.offset * -824785231) - i_10_, -386967251);
			class1.method378(class330_sub34, -1125676812);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qf.adf(").append(')').toString());
		}
	}

	static final void method4610(Class432_Sub1 class432_sub1, Class430 class430, int i) {
		try {
			boolean bool = false;
			int i_11_ = 0;
			int i_12_ = 0;
			int i_13_ = 0;
			int i_14_ = 0;
			if (null != class432_sub1.aClass80Array8656) {
				for (int i_15_ = 0; i_15_ < class432_sub1.aClass80Array8656.length; i_15_++) {
					Class80 class80 = class432_sub1.aClass80Array8656[i_15_];
					if (class80.aBoolean671) {
						int i_16_;
						int i_17_;
						if (class80.anInt668 < class80.anInt669) {
							i_16_ = class80.anInt668 - class80.anInt673;
							i_17_ = class80.anInt673 + class80.anInt669;
						} else {
							i_16_ = class80.anInt669 - class80.anInt673;
							i_17_ = class80.anInt668 + class80.anInt673;
						}
						int i_18_;
						int i_19_;
						if (class80.anInt672 < class80.anInt670) {
							i_18_ = class80.anInt672 - class80.anInt673;
							i_19_ = class80.anInt673 + class80.anInt670;
						} else {
							i_18_ = class80.anInt670 - class80.anInt673;
							i_19_ = class80.anInt673 + class80.anInt672;
						}
						if (!bool || i_16_ < i_11_)
							i_11_ = i_16_;
						if (!bool || i_18_ < i_12_)
							i_12_ = i_18_;
						if (!bool || i_17_ > i_13_)
							i_13_ = i_17_;
						if (!bool || i_19_ > i_14_)
							i_14_ = i_19_;
						bool = true;
					}
				}
			}
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = bool ? 1 : 0;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_11_;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_12_;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_13_;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_14_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qf.ari(").append(')').toString());
		}
	}

	static final void method4611(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class301.method2978(iComponentDefinitions, class120, class430, (byte) 5);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qf.ih(").append(')').toString());
		}
	}

	static final void method4612(Class430 class430, int i) throws Exception_Sub4 {
		try {
			Class401_Sub1.aClass145_Sub1_8249.method1719((float) (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) / 1000.0F, -88299728);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qf.aic(").append(')').toString());
		}
	}

	static void method4613(int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, Class330_Sub36_Sub13 class330_sub36_sub13, Class263 class263, Class524 class524, int i_26_, int i_27_, int i_28_) {
		try {
			if (i > i_21_ && i < i_23_ + i_21_ && i_20_ > i_25_ - -2093225349 * class524.anInt6033 - 1 && i_20_ < i_25_ + 143160877 * class524.anInt6035)
				i_26_ = i_27_;
			String string = Class401.method4715(class330_sub36_sub13, 817335418);
			class263.method2606(string, 3 + i_21_, i_25_, i_26_, 0, client.aRandom9066, Class382.anInt6680 * -74764097, Class_na.aClass61Array9725, Class444.anIntArray4495, -1490561740);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qf.am(").append(')').toString());
		}
	}

	static final void method4614(Class430 class430, int i) {
		try {
			int i_29_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_29_, -636062148);
			Class120 class120 = Class3.aClass120Array56[i_29_ >> 16];
			Class_na.method3515(iComponentDefinitions, class120, class430, (byte) 30);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qf.gc(").append(')').toString());
		}
	}
}
