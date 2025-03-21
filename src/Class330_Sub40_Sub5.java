/* Class330_Sub40_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub40_Sub5 extends Class330_Sub40 {
	Class471 aClass471_9790 = new Class471();
	Class330_Sub40_Sub2 aClass330_Sub40_Sub2_9791;
	Class330_Sub40_Sub4 aClass330_Sub40_Sub4_9792 = new Class330_Sub40_Sub4();

	Class330_Sub40_Sub5(Class330_Sub40_Sub2 class330_sub40_sub2) {
		((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791 = class330_sub40_sub2;
	}

	int method3560() {
		return 0;
	}

	Class330_Sub40 method3550() {
		try {
			Class330_Sub5 class330_sub5;
			do {
				class330_sub5 = (Class330_Sub5) ((Class330_Sub40_Sub5) this).aClass471_9790.method5873((byte) -74);
				if (class330_sub5 == null)
					return null;
			} while (((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539 == null);
			return ((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aix.i(").append(')').toString());
		}
	}

	void method3555(int i) {
		try {
			((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub4_9792.method3555(i);
			while_23_: for (Class330_Sub5 class330_sub5 = (Class330_Sub5) ((Class330_Sub40_Sub5) this).aClass471_9790.method5869(539664854); null != class330_sub5; class330_sub5 = (Class330_Sub5) ((Class330_Sub40_Sub5) this).aClass471_9790.method5873((byte) -33)) {
				if (!((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791.method3611(class330_sub5, -965767348)) {
					int i_0_ = i;
					while_21_: do {
						do {
							if (i_0_ <= 1803195735 * ((Class330_Sub5) class330_sub5).anInt7540)
								break while_21_;
							method3691(class330_sub5, 1803195735 * ((Class330_Sub5) class330_sub5).anInt7540, 1372352093);
							i_0_ -= 1803195735 * ((Class330_Sub5) class330_sub5).anInt7540;
						} while (!((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791.method3612(class330_sub5, null, 0, i_0_, 2101735582));
						continue while_23_;
					} while (false);
					method3691(class330_sub5, i_0_, 1560741852);
					((Class330_Sub5) class330_sub5).anInt7540 -= i_0_ * 800400999;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aix.f(").append(')').toString());
		}
	}

	void method3564(int[] is, int i, int i_1_) {
		try {
			((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub4_9792.method3564(is, i, i_1_);
			while_26_: for (Class330_Sub5 class330_sub5 = (Class330_Sub5) ((Class330_Sub40_Sub5) this).aClass471_9790.method5869(539664854); null != class330_sub5; class330_sub5 = (Class330_Sub5) ((Class330_Sub40_Sub5) this).aClass471_9790.method5873((byte) -69)) {
				if (!((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791.method3611(class330_sub5, -1601055801)) {
					int i_2_ = i;
					int i_3_ = i_1_;
					while_24_: do {
						do {
							if (i_3_ <= (((Class330_Sub5) class330_sub5).anInt7540 * 1803195735))
								break while_24_;
							method3690(class330_sub5, is, i_2_, (((Class330_Sub5) class330_sub5).anInt7540) * 1803195735, i_3_ + i_2_, -1833183526);
							i_2_ += 1803195735 * ((Class330_Sub5) class330_sub5).anInt7540;
							i_3_ -= (((Class330_Sub5) class330_sub5).anInt7540 * 1803195735);
						} while (!((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791.method3612(class330_sub5, is, i_2_, i_3_, 1991346893));
						continue while_26_;
					} while (false);
					method3690(class330_sub5, is, i_2_, i_3_, i_3_ + i_2_, -1257988015);
					((Class330_Sub5) class330_sub5).anInt7540 -= 800400999 * i_3_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aix.s(").append(')').toString());
		}
	}

	Class330_Sub40 method3559() {
		Class330_Sub5 class330_sub5;
		do {
			class330_sub5 = (Class330_Sub5) ((Class330_Sub40_Sub5) this).aClass471_9790.method5873((byte) -26);
			if (class330_sub5 == null)
				return null;
		} while (((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539 == null);
		return ((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539;
	}

	void method3690(Class330_Sub5 class330_sub5, int[] is, int i, int i_4_, int i_5_, int i_6_) {
		try {
			if (((((Class330_Sub40_Sub2) ((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791).anIntArray9764[((Class330_Sub5) class330_sub5).anInt7536 * 411186681]) & 0x4) != 0 && (((Class330_Sub5) class330_sub5).anInt7535 * 1867175843 < 0)) {
				int i_7_ = ((((Class330_Sub40_Sub2) (((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791)).anIntArray9758[(((Class330_Sub5) class330_sub5).anInt7536 * 411186681)]) / Class296.anInt3047);
				for (;;) {
					int i_8_ = ((i_7_ + 1048575 - (((Class330_Sub5) class330_sub5).anInt7542 * 1459084597)) / i_7_);
					if (i_8_ > i_4_) {
						if (i_6_ < 736749756)
							break;
						return;
					}
					((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539.method3564(is, i, i_8_);
					i += i_8_;
					i_4_ -= i_8_;
					((Class330_Sub5) class330_sub5).anInt7542 += (i_8_ * i_7_ - 1048576) * 171396381;
					int i_9_ = Class296.anInt3047 / 100;
					int i_10_ = 262144 / i_7_;
					if (i_10_ < i_9_)
						i_9_ = i_10_;
					Class330_Sub40_Sub3 class330_sub40_sub3 = (((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539);
					if ((((Class330_Sub40_Sub2) (((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791)).anIntArray9766[(((Class330_Sub5) class330_sub5).anInt7536 * 411186681)]) == 0)
						((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539 = (((Class330_Sub5) class330_sub5).aClass330_Sub29_Sub1_7523.method3403(class330_sub40_sub3.method3633((byte) 53), class330_sub40_sub3.method3644(1859454861), class330_sub40_sub3.method3627((short) 255)));
					else {
						((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539 = (((Class330_Sub5) class330_sub5).aClass330_Sub29_Sub1_7523.method3403(class330_sub40_sub3.method3633((byte) 72), 0, class330_sub40_sub3.method3627((short) 255)));
						((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791.method3599(class330_sub5, (((Class330_Sub11) (((Class330_Sub5) class330_sub5).aClass330_Sub11_7522)).aShortArray7593[(((Class330_Sub5) class330_sub5).anInt7526 * -1928305117)]) < 0, 1320231002);
						((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539.method3630(i_9_, class330_sub40_sub3.method3644(1859454861), -2134132629);
					}
					if ((((Class330_Sub11) ((Class330_Sub5) class330_sub5).aClass330_Sub11_7522).aShortArray7593[(-1928305117 * ((Class330_Sub5) class330_sub5).anInt7526)]) < 0)
						((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539.method3624(-1, -1139535845);
					class330_sub40_sub3.method3631(i_9_, -1246830196);
					class330_sub40_sub3.method3564(is, i, i_5_ - i);
					if (class330_sub40_sub3.method3623(1036782539))
						((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub4_9792.method3684(class330_sub40_sub3);
				}
				((Class330_Sub5) class330_sub5).anInt7542 += 171396381 * (i_4_ * i_7_);
			}
			((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539.method3564(is, i, i_4_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aix.ai(").append(')').toString());
		}
	}

	void method3691(Class330_Sub5 class330_sub5, int i, int i_11_) {
		try {
			if (0 != ((((Class330_Sub40_Sub2) ((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791).anIntArray9764[411186681 * ((Class330_Sub5) class330_sub5).anInt7536]) & 0x4) && (((Class330_Sub5) class330_sub5).anInt7535 * 1867175843 < 0)) {
				int i_12_ = ((((Class330_Sub40_Sub2) (((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791)).anIntArray9758[(411186681 * ((Class330_Sub5) class330_sub5).anInt7536)]) / Class296.anInt3047);
				int i_13_ = ((i_12_ + 1048575 - (1459084597 * ((Class330_Sub5) class330_sub5).anInt7542)) / i_12_);
				((Class330_Sub5) class330_sub5).anInt7542 = 171396381 * (i_12_ * i + 1459084597 * (((Class330_Sub5) class330_sub5).anInt7542) & 0xfffff);
				if (i_13_ <= i) {
					Class330_Sub40_Sub3 class330_sub40_sub3 = (((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539);
					if (0 == (((Class330_Sub40_Sub2) (((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791)).anIntArray9766[(411186681 * ((Class330_Sub5) class330_sub5).anInt7536)]))
						((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539 = (((Class330_Sub5) class330_sub5).aClass330_Sub29_Sub1_7523.method3403(class330_sub40_sub3.method3633((byte) 85), class330_sub40_sub3.method3644(1859454861), class330_sub40_sub3.method3627((short) 255)));
					else {
						((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539 = (((Class330_Sub5) class330_sub5).aClass330_Sub29_Sub1_7523.method3403(class330_sub40_sub3.method3633((byte) 13), 0, class330_sub40_sub3.method3627((short) 255)));
						((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791.method3599(class330_sub5, (((Class330_Sub11) (((Class330_Sub5) class330_sub5).aClass330_Sub11_7522)).aShortArray7593[(((Class330_Sub5) class330_sub5).anInt7526 * -1928305117)]) < 0, -456516366);
					}
					if ((((Class330_Sub11) ((Class330_Sub5) class330_sub5).aClass330_Sub11_7522).aShortArray7593[(-1928305117 * ((Class330_Sub5) class330_sub5).anInt7526)]) < 0)
						((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539.method3624(-1, -582230240);
					i = (((Class330_Sub5) class330_sub5).anInt7542 * 1459084597 / i_12_);
				}
			}
			((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539.method3555(i);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aix.as(").append(')').toString());
		}
	}

	Class330_Sub40 method3556() {
		Class330_Sub5 class330_sub5 = (Class330_Sub5) ((Class330_Sub40_Sub5) this).aClass471_9790.method5869(539664854);
		if (null == class330_sub5)
			return null;
		if (((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539 != null)
			return ((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539;
		return method3550();
	}

	int method3554() {
		return 0;
	}

	Class330_Sub40 method3558() {
		Class330_Sub5 class330_sub5;
		do {
			class330_sub5 = (Class330_Sub5) ((Class330_Sub40_Sub5) this).aClass471_9790.method5873((byte) -65);
			if (class330_sub5 == null)
				return null;
		} while (((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539 == null);
		return ((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539;
	}

	Class330_Sub40 method3557() {
		Class330_Sub5 class330_sub5;
		do {
			class330_sub5 = (Class330_Sub5) ((Class330_Sub40_Sub5) this).aClass471_9790.method5873((byte) -22);
			if (class330_sub5 == null)
				return null;
		} while (((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539 == null);
		return ((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539;
	}

	void method3566(int i) {
		((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub4_9792.method3555(i);
		while_29_: for (Class330_Sub5 class330_sub5 = (Class330_Sub5) ((Class330_Sub40_Sub5) this).aClass471_9790.method5869(539664854); null != class330_sub5; class330_sub5 = (Class330_Sub5) ((Class330_Sub40_Sub5) this).aClass471_9790.method5873((byte) -64)) {
			if (!((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791.method3611(class330_sub5, 462527280)) {
				int i_14_ = i;
				while_27_: do {
					do {
						if (i_14_ <= (1803195735 * ((Class330_Sub5) class330_sub5).anInt7540))
							break while_27_;
						method3691(class330_sub5, 1803195735 * ((Class330_Sub5) class330_sub5).anInt7540, 1388443797);
						i_14_ -= (1803195735 * ((Class330_Sub5) class330_sub5).anInt7540);
					} while (!((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791.method3612(class330_sub5, null, 0, i_14_, 2087698757));
					continue while_29_;
				} while (false);
				method3691(class330_sub5, i_14_, 2097970565);
				((Class330_Sub5) class330_sub5).anInt7540 -= i_14_ * 800400999;
			}
		}
	}

	int method3570() {
		return 0;
	}

	int method3553() {
		return 0;
	}

	int method3562() {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aix.p(").append(')').toString());
		}
	}

	void method3569(int i) {
		((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub4_9792.method3555(i);
		while_32_: for (Class330_Sub5 class330_sub5 = (Class330_Sub5) ((Class330_Sub40_Sub5) this).aClass471_9790.method5869(539664854); null != class330_sub5; class330_sub5 = (Class330_Sub5) ((Class330_Sub40_Sub5) this).aClass471_9790.method5873((byte) 7)) {
			if (!((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791.method3611(class330_sub5, 1479685115)) {
				int i_15_ = i;
				while_30_: do {
					do {
						if (i_15_ <= (1803195735 * ((Class330_Sub5) class330_sub5).anInt7540))
							break while_30_;
						method3691(class330_sub5, 1803195735 * ((Class330_Sub5) class330_sub5).anInt7540, 1026875439);
						i_15_ -= (1803195735 * ((Class330_Sub5) class330_sub5).anInt7540);
					} while (!((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791.method3612(class330_sub5, null, 0, i_15_, 2120604415));
					continue while_32_;
				} while (false);
				method3691(class330_sub5, i_15_, 1954500226);
				((Class330_Sub5) class330_sub5).anInt7540 -= i_15_ * 800400999;
			}
		}
	}

	int method3561() {
		return 0;
	}

	void method3565(int[] is, int i, int i_16_) {
		((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub4_9792.method3564(is, i, i_16_);
		while_35_: for (Class330_Sub5 class330_sub5 = (Class330_Sub5) ((Class330_Sub40_Sub5) this).aClass471_9790.method5869(539664854); null != class330_sub5; class330_sub5 = (Class330_Sub5) ((Class330_Sub40_Sub5) this).aClass471_9790.method5873((byte) -106)) {
			if (!((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791.method3611(class330_sub5, 55499316)) {
				int i_17_ = i;
				int i_18_ = i_16_;
				while_33_: do {
					do {
						if (i_18_ <= (((Class330_Sub5) class330_sub5).anInt7540 * 1803195735))
							break while_33_;
						method3690(class330_sub5, is, i_17_, (((Class330_Sub5) class330_sub5).anInt7540 * 1803195735), i_18_ + i_17_, -144222394);
						i_17_ += (1803195735 * ((Class330_Sub5) class330_sub5).anInt7540);
						i_18_ -= (((Class330_Sub5) class330_sub5).anInt7540 * 1803195735);
					} while (!((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791.method3612(class330_sub5, is, i_17_, i_18_, 2132514001));
					continue while_35_;
				} while (false);
				method3690(class330_sub5, is, i_17_, i_18_, i_18_ + i_17_, -2100751959);
				((Class330_Sub5) class330_sub5).anInt7540 -= 800400999 * i_18_;
			}
		}
	}

	int method3567() {
		return 0;
	}

	Class330_Sub40 method3552() {
		try {
			Class330_Sub5 class330_sub5 = (Class330_Sub5) ((Class330_Sub40_Sub5) this).aClass471_9790.method5869(539664854);
			if (null == class330_sub5)
				return null;
			if (((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539 != null)
				return (((Class330_Sub5) class330_sub5).aClass330_Sub40_Sub3_7539);
			return method3550();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aix.j(").append(')').toString());
		}
	}

	void method3568(int i) {
		((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub4_9792.method3555(i);
		while_38_: for (Class330_Sub5 class330_sub5 = (Class330_Sub5) ((Class330_Sub40_Sub5) this).aClass471_9790.method5869(539664854); null != class330_sub5; class330_sub5 = (Class330_Sub5) ((Class330_Sub40_Sub5) this).aClass471_9790.method5873((byte) -90)) {
			if (!((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791.method3611(class330_sub5, 1936310998)) {
				int i_19_ = i;
				while_36_: do {
					do {
						if (i_19_ <= (1803195735 * ((Class330_Sub5) class330_sub5).anInt7540))
							break while_36_;
						method3691(class330_sub5, 1803195735 * ((Class330_Sub5) class330_sub5).anInt7540, 1830218343);
						i_19_ -= (1803195735 * ((Class330_Sub5) class330_sub5).anInt7540);
					} while (!((Class330_Sub40_Sub5) this).aClass330_Sub40_Sub2_9791.method3612(class330_sub5, null, 0, i_19_, 2016203598));
					continue while_38_;
				} while (false);
				method3691(class330_sub5, i_19_, 2139688655);
				((Class330_Sub5) class330_sub5).anInt7540 -= i_19_ * 800400999;
			}
		}
	}
}
