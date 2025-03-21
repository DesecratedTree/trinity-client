/* Class497 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public final class Class497 implements Iterable {
	Class330 aClass330_5877;
	Class330[] aClass330Array5878;
	long aLong5879;
	Class330 aClass330_5880;
	int anInt5881 = 0;
	int anInt5882;
	public static Class267 aClass267_5883;
	public static Class552 aClass552_5884;

	public int method6093(Class330[] class330s, int i) {
		try {
			int i_0_ = 0;
			for (int i_1_ = 0; i_1_ < 1545037013 * ((Class497) this).anInt5882; i_1_++) {
				Class330 class330 = ((Class497) this).aClass330Array5878[i_1_];
				for (Class330 class330_2_ = class330.aClass330_3340; class330 != class330_2_; class330_2_ = class330_2_.aClass330_3340)
					class330s[i_0_++] = class330_2_;
			}
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("un.i(").append(')').toString());
		}
	}

	public Class330 method6094(long l) {
		try {
			((Class497) this).aLong5879 = l * 1960471358239686723L;
			Class330 class330 = (((Class497) this).aClass330Array5878[(int) (l & (long) (1545037013 * ((Class497) this).anInt5882 - 1))]);
			for (((Class497) this).aClass330_5880 = class330.aClass330_3340; class330 != ((Class497) this).aClass330_5880; ((Class497) this).aClass330_5880 = ((Class497) this).aClass330_5880.aClass330_3340) {
				if ((-6154793640677333111L * ((Class497) this).aClass330_5880.aLong3341) == l) {
					Class330 class330_3_ = ((Class497) this).aClass330_5880;
					((Class497) this).aClass330_5880 = ((Class497) this).aClass330_5880.aClass330_3340;
					return class330_3_;
				}
			}
			((Class497) this).aClass330_5880 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("un.r(").append(')').toString());
		}
	}

	public Class330 method6095(int i) {
		try {
			if (null == ((Class497) this).aClass330_5880)
				return null;
			for (Class330 class330 = (((Class497) this).aClass330Array5878[(int) ((7173598194773920875L * ((Class497) this).aLong5879) & (long) ((1545037013 * ((Class497) this).anInt5882) - 1))]); ((Class497) this).aClass330_5880 != class330; ((Class497) this).aClass330_5880 = ((Class497) this).aClass330_5880.aClass330_3340) {
				if (7173598194773920875L * ((Class497) this).aLong5879 == (((Class497) this).aClass330_5880.aLong3341 * -6154793640677333111L)) {
					Class330 class330_4_ = ((Class497) this).aClass330_5880;
					((Class497) this).aClass330_5880 = ((Class497) this).aClass330_5880.aClass330_3340;
					return class330_4_;
				}
			}
			((Class497) this).aClass330_5880 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("un.j(").append(')').toString());
		}
	}

	public int method6096(int i) {
		try {
			int i_5_ = 0;
			for (int i_6_ = 0; i_6_ < 1545037013 * ((Class497) this).anInt5882; i_6_++) {
				Class330 class330 = ((Class497) this).aClass330Array5878[i_6_];
				for (Class330 class330_7_ = class330.aClass330_3340; class330_7_ != class330; class330_7_ = class330_7_.aClass330_3340)
					i_5_++;
			}
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("un.p(").append(')').toString());
		}
	}

	public void method6097(Class330 class330, long l) {
		try {
			if (class330.aClass330_3342 != null)
				class330.method3252(-1770588869);
			Class330 class330_8_ = (((Class497) this).aClass330Array5878[(int) (l & (long) (1545037013 * ((Class497) this).anInt5882 - 1))]);
			class330.aClass330_3342 = class330_8_.aClass330_3342;
			class330.aClass330_3340 = class330_8_;
			class330.aClass330_3342.aClass330_3340 = class330;
			class330.aClass330_3340.aClass330_3342 = class330;
			class330.aLong3341 = -1420004262915178823L * l;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("un.o(").append(')').toString());
		}
	}

	public Class330 method6098(short i) {
		try {
			if (-1080765369 * ((Class497) this).anInt5881 > 0 && (((Class497) this).aClass330_5877 != (((Class497) this).aClass330Array5878[-1080765369 * ((Class497) this).anInt5881 - 1]))) {
				Class330 class330 = ((Class497) this).aClass330_5877;
				((Class497) this).aClass330_5877 = class330.aClass330_3340;
				return class330;
			}
			while_99_: do {
				Class330 class330;
				do {
					if (-1080765369 * ((Class497) this).anInt5881 >= 1545037013 * ((Class497) this).anInt5882)
						break while_99_;
					class330 = (((Class497) this).aClass330Array5878[((((Class497) this).anInt5881 += -778267273) * -1080765369) - 1].aClass330_3340);
				} while (class330 == (((Class497) this).aClass330Array5878[((Class497) this).anInt5881 * -1080765369 - 1]));
				((Class497) this).aClass330_5877 = class330.aClass330_3340;
				return class330;
			} while (false);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("un.z(").append(')').toString());
		}
	}

	public Iterator iterator() {
		try {
			return new Class508(this);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("un.iterator(").append(')').toString());
		}
	}

	public Class330 method6099(byte i) {
		try {
			((Class497) this).anInt5881 = 0;
			return method6098((short) -32768);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("un.f(").append(')').toString());
		}
	}

	public Class497(int i) {
		((Class497) this).anInt5882 = i * 1844884605;
		((Class497) this).aClass330Array5878 = new Class330[i];
		for (int i_9_ = 0; i_9_ < i; i_9_++) {
			Class330 class330 = ((Class497) this).aClass330Array5878[i_9_] = new Class330();
			class330.aClass330_3340 = class330;
			class330.aClass330_3342 = class330;
		}
	}

	public void method6100(int i) {
		try {
			for (int i_10_ = 0; i_10_ < ((Class497) this).anInt5882 * 1545037013; i_10_++) {
				Class330 class330 = ((Class497) this).aClass330Array5878[i_10_];
				for (;;) {
					Class330 class330_11_ = class330.aClass330_3340;
					if (class330_11_ == class330) {
						if (i != 65280)
							throw new IllegalStateException();
						break;
					}
					class330_11_.method3252(-487261948);
				}
			}
			((Class497) this).aClass330_5880 = null;
			((Class497) this).aClass330_5877 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("un.s(").append(')').toString());
		}
	}

	static final void method6101(Class430 class430, int i) {
		try {
			int i_12_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.aClass75Array8982[i_12_].aBoolean648 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("un.xo(").append(')').toString());
		}
	}

	static boolean method6102(IComponentDefinitions iComponentDefinitions, int i) {
		try {
			Class330_Sub2 class330_sub2 = client.method3924(iComponentDefinitions);
			if (class330_sub2.method3268((byte) 69) > 0)
				return true;
			if (class330_sub2.method3267(516693227))
				return true;
			if (iComponentDefinitions.aClass114_1252 != null)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("un.li(").append(')').toString());
		}
	}

	static void method6103(Player class432_sub1_sub1_sub1_sub1, boolean bool, int i) {
		try {
			if (-2008486989 * Class484.anInt5786 < 403) {
				if (class432_sub1_sub1_sub1_sub1 == Class263_Sub2.myPlayer) {
					if (client.aBoolean9150 && (-1357430571 * Class503.anInt5916 & 0x10) != 0)
						Class360.method4241(client.aString9152, new StringBuilder().append(client.aString9154).append(" ").append(Class215.aString2082).append(" ").append(Class146.method1738(16777215, -849826454)).append(Class526.aClass526_6179.method6257(Class429.aClass454_4369, 991479434)).toString(), -2126481065 * Class271.anInt2756, 16, -1, 0L, 0, 0, true, false, (long) (class432_sub1_sub1_sub1_sub1.anInt10008 * -1654044763), false, (short) 140);
				} else {
					String string;
					if (0 == (18091633 * class432_sub1_sub1_sub1_sub1.anInt10231)) {
						boolean bool_13_ = true;
						if (-1 != (-695019623 * (Class263_Sub2.myPlayer.anInt10230)) && -1 != (class432_sub1_sub1_sub1_sub1.anInt10230 * -695019623)) {
							int i_14_ = (((Class263_Sub2.myPlayer.anInt10230) * -695019623 < (class432_sub1_sub1_sub1_sub1.anInt10230 * -695019623)) ? (-695019623 * (Class263_Sub2.myPlayer.anInt10230)) : -695019623 * (class432_sub1_sub1_sub1_sub1.anInt10230));
							int i_15_ = ((Class263_Sub2.myPlayer.anInt10228) * -650833685 - (class432_sub1_sub1_sub1_sub1.anInt10228 * -650833685));
							if (i_15_ < 0)
								i_15_ = -i_15_;
							if (i_15_ > i_14_)
								bool_13_ = false;
						}
						String string_16_ = (Class435.aClass435_4416 == client.aClass435_9146 ? (Class526.aClass526_6170.method6257(Class429.aClass454_4369, 991479434)) : (Class526.aClass526_6168.method6257(Class429.aClass454_4369, 991479434)));
						if ((-650833685 * class432_sub1_sub1_sub1_sub1.anInt10228) >= (-282848135 * class432_sub1_sub1_sub1_sub1.anInt10229))
							string = new StringBuilder().append(class432_sub1_sub1_sub1_sub1.method5471(true, 1482921348)).append(bool_13_ ? (Class557.method6454((class432_sub1_sub1_sub1_sub1.anInt10228) * -650833685, (Class263_Sub2.myPlayer.anInt10228) * -650833685, -1798420104)) : Class146.method1738(16777215, -849826454)).append(Class215.aString2080).append(string_16_).append(-650833685 * (class432_sub1_sub1_sub1_sub1.anInt10228)).append(Class215.aString2078).toString();
						else
							string = new StringBuilder().append(class432_sub1_sub1_sub1_sub1.method5471(true, 1476832245)).append(bool_13_ ? (Class557.method6454((class432_sub1_sub1_sub1_sub1.anInt10228) * -650833685, (Class263_Sub2.myPlayer.anInt10228) * -650833685, -1798420104)) : Class146.method1738(16777215, -849826454)).append(Class215.aString2080).append(string_16_).append(class432_sub1_sub1_sub1_sub1.anInt10228 * -650833685).append("+").append((-282848135 * (class432_sub1_sub1_sub1_sub1.anInt10229)) - (-650833685 * (class432_sub1_sub1_sub1_sub1.anInt10228))).append(Class215.aString2078).toString();
					} else if ((18091633 * class432_sub1_sub1_sub1_sub1.anInt10231) == -1)
						string = class432_sub1_sub1_sub1_sub1.method5471(true, 1445902852);
					else
						string = new StringBuilder().append(class432_sub1_sub1_sub1_sub1.method5471(true, 1872088037)).append(Class215.aString2080).append(Class526.aClass526_6194.method6257(Class429.aClass454_4369, 991479434)).append(class432_sub1_sub1_sub1_sub1.anInt10231 * 18091633).append(Class215.aString2078).toString();
					if (client.aBoolean9150 && !bool && (-1357430571 * Class503.anInt5916 & 0x8) != 0)
						Class360.method4241(client.aString9152, new StringBuilder().append(client.aString9154).append(" ").append(Class215.aString2082).append(" ").append(Class146.method1738(16777215, -849826454)).append(string).toString(), Class271.anInt2756 * -2126481065, 15, -1, (long) (-1654044763 * (class432_sub1_sub1_sub1_sub1.anInt10008)), 0, 0, true, false, (long) (-1654044763 * (class432_sub1_sub1_sub1_sub1.anInt10008)), false, (short) 140);
					if (!bool) {
						for (int i_17_ = 7; i_17_ >= 0; i_17_--) {
							if (client.aStringArray9167[i_17_] != null) {
								short i_18_ = 0;
								if ((Class435.aClass435_4421 == client.aClass435_9146) && (client.aStringArray9167[i_17_].equalsIgnoreCase(Class526.aClass526_6163.method6257(Class429.aClass454_4369, 991479434)))) {
									if (client.aBoolean9130 && ((-650833685 * (class432_sub1_sub1_sub1_sub1.anInt10228)) > (Class263_Sub2.myPlayer.anInt10228) * -650833685))
										i_18_ = (short) 2000;
									if ((Class263_Sub2.myPlayer.anInt10246) * -1019945531 != 0 && (class432_sub1_sub1_sub1_sub1.anInt10246) * -1019945531 != 0) {
										if ((-1019945531 * (Class263_Sub2.myPlayer.anInt10246)) == (-1019945531 * (class432_sub1_sub1_sub1_sub1.anInt10246)))
											i_18_ = (short) 2000;
										else
											i_18_ = (short) 0;
									} else if (class432_sub1_sub1_sub1_sub1.aBoolean10247)
										i_18_ = (short) 2000;
								} else if (client.aBooleanArray9136[i_17_])
									i_18_ = (short) 2000;
								short i_19_ = (short) (client.aShortArray9133[i_17_] + i_18_);
								int i_20_ = (-1 != client.anIntArray9134[i_17_] ? client.anIntArray9134[i_17_] : client.anInt9148 * 1985599555);
								Class360.method4241(client.aStringArray9167[i_17_], new StringBuilder().append(Class146.method1738(16777215, -849826454)).append(string).toString(), i_20_, i_19_, -1, (long) (-1654044763 * (class432_sub1_sub1_sub1_sub1.anInt10008)), 0, 0, true, false, (long) (-1654044763 * (class432_sub1_sub1_sub1_sub1.anInt10008)), false, (short) 140);
							}
						}
					} else
						Class360.method4241(new StringBuilder().append(Class146.method1738(13421772, -849826454)).append(string).toString(), "", -1, -1, 0, 0L, 0, 0, false, true, (long) (-1654044763 * (class432_sub1_sub1_sub1_sub1.anInt10008)), false, (short) 140);
					if (!bool) {
						for (Class330_Sub36_Sub10 class330_sub36_sub10 = ((Class330_Sub36_Sub10) Class484.aClass471_5791.method5869(539664854)); null != class330_sub36_sub10; class330_sub36_sub10 = ((Class330_Sub36_Sub10) Class484.aClass471_5791.method5873((byte) -69))) {
							if (23 == (((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9699 * 400571611)) {
								((Class330_Sub36_Sub10) class330_sub36_sub10).aString9700 = new StringBuilder().append(Class146.method1738(16777215, -849826454)).append(string).toString();
								break;
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("un.by(").append(')').toString());
		}
	}

	static final void method6104(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class330_Sub31.method3418(iComponentDefinitions, class430, -2109098938);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("un.qs(").append(')').toString());
		}
	}

	public static Class353 method6105(boolean bool, byte i) {
		try {
			synchronized (Class353.aStack3488) {
				Class353 class353;
				if (Class353.aStack3488.isEmpty())
					class353 = new Class353();
				else
					class353 = (Class353) Class353.aStack3488.pop();
				((Class353) class353).aBoolean3487 = bool;
				Class353 class353_21_ = class353;
				return class353_21_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("un.r(").append(')').toString());
		}
	}

	static final void method6106(Class430 class430, int i) {
		try {
			Class521.method6224(-294721568);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("un.agw(").append(')').toString());
		}
	}
}
