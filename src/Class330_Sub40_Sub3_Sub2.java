/* Class330_Sub40_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub40_Sub3_Sub2 extends Class330_Sub40_Sub3 {
	static int anInt10175 = 128;

	public synchronized void method3564(int[] is, int i, int i_0_) throws IllegalStateException {
		if (((Class330_Sub40_Sub3_Sub2) this).anInt9773 * 1488581567 == 0 && ((Class330_Sub40_Sub3_Sub2) this).anInt9771 * 424994781 == 0)
			method3555(i_0_);
		else {
			int i_1_ = ((Class330_Sub40_Sub3_Sub2) this).anInt9777 * 216574687 << 8;
			int i_2_ = (((Class330_Sub40_Sub3_Sub2) this).anInt9779 * 2094253865 << 8);
			int i_3_ = ((Class330_Sub29_Sub1_Sub1) ((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770).method3407() << 8;
			int i_4_ = i_2_ - i_1_;
			if (i_4_ <= 0)
				((Class330_Sub40_Sub3_Sub2) this).anInt9781 = 0;
			int i_5_ = i;
			i_0_ += i;
			if (((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905 < 0) {
				if (((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319 > 0)
					((Class330_Sub40_Sub3_Sub2) this).anInt9782 = 0;
				else {
					method3641((short) 23176);
					method3252(-913250190);
					return;
				}
			}
			if (((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905 >= i_3_) {
				if (((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319 < 0)
					((Class330_Sub40_Sub3_Sub2) this).anInt9782 = (i_3_ - 1) * 2144077895;
				else {
					method3641((short) 20067);
					method3252(-1506814629);
					return;
				}
			}
			if (((Class330_Sub40_Sub3_Sub2) this).anInt9781 * -1618882239 < 0) {
				if (((Class330_Sub40_Sub3_Sub2) this).aBoolean9784) {
					if (((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319 < 0) {
						i_5_ = method3666(is, i_5_, i_1_, i_0_, (((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9777) * 216574687]));
						if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905) >= i_1_)
							return;
						((Class330_Sub40_Sub3_Sub2) this).anInt9782 = (i_1_ + i_1_ - 1 - (((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905)) * 2144077895;
						((Class330_Sub40_Sub3_Sub2) this).anInt9772 = -(((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 1);
					}
					for (;;) {
						i_5_ = method3665(is, i_5_, i_2_, i_0_, (((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9779) * 2094253865 - 1]));
						if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905) < i_2_)
							break;
						((Class330_Sub40_Sub3_Sub2) this).anInt9782 = (i_2_ + i_2_ - 1 - (((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905)) * 2144077895;
						((Class330_Sub40_Sub3_Sub2) this).anInt9772 = -(((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 1);
						i_5_ = method3666(is, i_5_, i_1_, i_0_, (((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9777) * 216574687]));
						if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905) >= i_1_)
							break;
						((Class330_Sub40_Sub3_Sub2) this).anInt9782 = (i_1_ + i_1_ - 1 - (((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905)) * 2144077895;
						((Class330_Sub40_Sub3_Sub2) this).anInt9772 = -(((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 1);
					}
				} else if ((((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319) < 0) {
					for (;;) {
						i_5_ = method3666(is, i_5_, i_1_, i_0_, (((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9779) * 2094253865 - 1]));
						if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905) >= i_1_)
							break;
						((Class330_Sub40_Sub3_Sub2) this).anInt9782 = ((i_2_ - 1 - (i_2_ - 1 - (((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905) % i_4_) * 2144077895);
					}
				} else {
					for (;;) {
						i_5_ = method3665(is, i_5_, i_2_, i_0_, (((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9777) * 216574687]));
						if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905) < i_2_)
							break;
						((Class330_Sub40_Sub3_Sub2) this).anInt9782 = (i_1_ + ((((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905) - i_1_) % i_4_) * 2144077895;
					}
				}
			} else {
				do {
					if ((((Class330_Sub40_Sub3_Sub2) this).anInt9781 * -1618882239) > 0) {
						if (((Class330_Sub40_Sub3_Sub2) this).aBoolean9784) {
							if ((((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319) < 0) {
								i_5_ = method3666(is, i_5_, i_1_, i_0_, (((Class330_Sub29_Sub1_Sub1) ((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9777 * 216574687)]));
								if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905 >= i_1_)
									return;
								((Class330_Sub40_Sub3_Sub2) this).anInt9782 = ((i_1_ + i_1_ - 1 - (((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905) * 2144077895);
								((Class330_Sub40_Sub3_Sub2) this).anInt9772 = -((((Class330_Sub40_Sub3_Sub2) this).anInt9772) * 1);
								if ((((Class330_Sub40_Sub3_Sub2) this).anInt9781 -= 1578352321) * -1618882239 == 0)
									break;
							}
							do {
								i_5_ = method3665(is, i_5_, i_2_, i_0_, (((Class330_Sub29_Sub1_Sub1) ((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9779 * 2094253865) - 1]));
								if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905 < i_2_)
									return;
								((Class330_Sub40_Sub3_Sub2) this).anInt9782 = ((i_2_ + i_2_ - 1 - (((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905) * 2144077895);
								((Class330_Sub40_Sub3_Sub2) this).anInt9772 = -((((Class330_Sub40_Sub3_Sub2) this).anInt9772) * 1);
								if ((((Class330_Sub40_Sub3_Sub2) this).anInt9781 -= 1578352321) * -1618882239 == 0)
									break;
								i_5_ = method3666(is, i_5_, i_1_, i_0_, (((Class330_Sub29_Sub1_Sub1) ((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9777 * 216574687)]));
								if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905 >= i_1_)
									return;
								((Class330_Sub40_Sub3_Sub2) this).anInt9782 = ((i_1_ + i_1_ - 1 - (((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905) * 2144077895);
								((Class330_Sub40_Sub3_Sub2) this).anInt9772 = -((((Class330_Sub40_Sub3_Sub2) this).anInt9772) * 1);
							} while ((((Class330_Sub40_Sub3_Sub2) this).anInt9781 -= 1578352321) * -1618882239 != 0);
						} else if ((((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319) < 0) {
							for (;;) {
								i_5_ = method3666(is, i_5_, i_1_, i_0_, (((Class330_Sub29_Sub1_Sub1) ((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9779 * 2094253865) - 1]));
								if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905 >= i_1_)
									return;
								int i_6_ = ((i_2_ - 1 - (((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905) / i_4_);
								if (i_6_ >= (((Class330_Sub40_Sub3_Sub2) this).anInt9781) * -1618882239) {
									((Class330_Sub40_Sub3_Sub2) this).anInt9782 += i_4_ * (((Class330_Sub40_Sub3_Sub2) this).anInt9781 * -1618882239) * 2144077895;
									((Class330_Sub40_Sub3_Sub2) this).anInt9781 = 0;
									break;
								}
								((Class330_Sub40_Sub3_Sub2) this).anInt9782 += i_4_ * i_6_ * 2144077895;
								((Class330_Sub40_Sub3_Sub2) this).anInt9781 -= i_6_ * 1578352321;
							}
						} else {
							for (;;) {
								i_5_ = method3665(is, i_5_, i_2_, i_0_, (((Class330_Sub29_Sub1_Sub1) ((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9777 * 216574687)]));
								if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905 < i_2_)
									return;
								int i_7_ = (((((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905 - i_1_) / i_4_);
								if (i_7_ >= (((Class330_Sub40_Sub3_Sub2) this).anInt9781) * -1618882239) {
									((Class330_Sub40_Sub3_Sub2) this).anInt9782 -= i_4_ * (((Class330_Sub40_Sub3_Sub2) this).anInt9781 * -1618882239) * 2144077895;
									((Class330_Sub40_Sub3_Sub2) this).anInt9781 = 0;
									break;
								}
								((Class330_Sub40_Sub3_Sub2) this).anInt9782 -= i_4_ * i_7_ * 2144077895;
								((Class330_Sub40_Sub3_Sub2) this).anInt9781 -= i_7_ * 1578352321;
							}
						}
					}
				} while (false);
				if (((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319 < 0) {
					method3666(is, i_5_, 0, i_0_, 0.0F);
					if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905) < 0) {
						((Class330_Sub40_Sub3_Sub2) this).anInt9782 = -2144077895;
						method3641((short) 602);
						method3252(-636363635);
					}
				} else {
					method3665(is, i_5_, i_3_, i_0_, 0.0F);
					if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905) >= i_3_) {
						((Class330_Sub40_Sub3_Sub2) this).anInt9782 = i_3_ * 2144077895;
						method3641((short) -30769);
						method3252(507747260);
					}
				}
			}
		}
	}

	int method3665(int[] is, int i, int i_8_, int i_9_, float f) {
		while_59_: do {
			do {
				if (((Class330_Sub40_Sub3_Sub2) this).anInt9771 * 424994781 <= 0)
					break while_59_;
				int i_10_ = i + (((Class330_Sub40_Sub3_Sub2) this).anInt9771 * 424994781);
				if (i_10_ > i_9_)
					i_10_ = i_9_;
				((Class330_Sub40_Sub3_Sub2) this).anInt9771 += i * 807250037;
				if ((((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319 == 256) && ((((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905) & 0xff) == 0) {
					if (Class296.aBoolean3023)
						i = method3680(0.0F, ((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408(), is, (((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905, i, (((Class330_Sub40_Sub3_Sub2) this).anInt9783) * 1694000393, (((Class330_Sub40_Sub3_Sub2) this).anInt9776) * 111438813, (((Class330_Sub40_Sub3_Sub2) this).anInt9785) * 1941232607, (((Class330_Sub40_Sub3_Sub2) this).anInt9780) * -2020606751, 0, i_10_, i_8_, this);
					else
						i = method3682(((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408(), is, (((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905, i, (((Class330_Sub40_Sub3_Sub2) this).anInt9775) * -2092094291, (((Class330_Sub40_Sub3_Sub2) this).anInt9778) * 241122819, 0, i_10_, i_8_, this);
				} else if (Class296.aBoolean3023)
					i = method3674(0.0F, 0, ((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408(), is, (((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905), i, (((Class330_Sub40_Sub3_Sub2) this).anInt9783 * 1694000393), (((Class330_Sub40_Sub3_Sub2) this).anInt9776 * 111438813), (((Class330_Sub40_Sub3_Sub2) this).anInt9785 * 1941232607), (((Class330_Sub40_Sub3_Sub2) this).anInt9780 * -2020606751), 0, i_10_, i_8_, this, (((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319), f);
				else
					i = method3673(0.0F, 0, ((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408(), is, (((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905), i, (((Class330_Sub40_Sub3_Sub2) this).anInt9775 * -2092094291), (((Class330_Sub40_Sub3_Sub2) this).anInt9778 * 241122819), 0, i_10_, i_8_, this, (((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319), f);
				((Class330_Sub40_Sub3_Sub2) this).anInt9771 -= i * 807250037;
				if (((Class330_Sub40_Sub3_Sub2) this).anInt9771 * 424994781 != 0)
					return i;
			} while (!method3634(902497150));
			return i_9_;
		} while (false);
		if (((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319 == 256 && (((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905 & 0xff) == 0) {
			if (Class296.aBoolean3023)
				return method3667(0.0F, ((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408(), is, (((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905), i, (((Class330_Sub40_Sub3_Sub2) this).anInt9783 * 1694000393), (((Class330_Sub40_Sub3_Sub2) this).anInt9776 * 111438813), 0, i_9_, i_8_, this);
			return (method3679(((Class330_Sub29_Sub1_Sub1) ((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770).method3408(), is, ((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905, i, ((Class330_Sub40_Sub3_Sub2) this).anInt9775 * -2092094291, 0, i_9_, i_8_, this));
		}
		if (Class296.aBoolean3023)
			return (method3669(0.0F, 0, ((Class330_Sub29_Sub1_Sub1) ((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770).method3408(), is, ((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905, i, ((Class330_Sub40_Sub3_Sub2) this).anInt9783 * 1694000393, ((Class330_Sub40_Sub3_Sub2) this).anInt9776 * 111438813, 0, i_9_, i_8_, this, ((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319, f));
		return (method3678(0.0F, 0, ((Class330_Sub29_Sub1_Sub1) ((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770).method3408(), is, ((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905, i, ((Class330_Sub40_Sub3_Sub2) this).anInt9775 * -2092094291, 0, i_9_, i_8_, this, ((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319, f));
	}

	int method3666(int[] is, int i, int i_11_, int i_12_, float f) {
		while_60_: do {
			do {
				if (((Class330_Sub40_Sub3_Sub2) this).anInt9771 * 424994781 <= 0)
					break while_60_;
				int i_13_ = i + (((Class330_Sub40_Sub3_Sub2) this).anInt9771 * 424994781);
				if (i_13_ > i_12_)
					i_13_ = i_12_;
				((Class330_Sub40_Sub3_Sub2) this).anInt9771 += i * 807250037;
				if ((((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319 == -256) && ((((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905) & 0xff) == 0) {
					if (Class296.aBoolean3023)
						i = method3672(0.0F, ((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408(), is, (((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905, i, (((Class330_Sub40_Sub3_Sub2) this).anInt9783) * 1694000393, (((Class330_Sub40_Sub3_Sub2) this).anInt9776) * 111438813, (((Class330_Sub40_Sub3_Sub2) this).anInt9785) * 1941232607, (((Class330_Sub40_Sub3_Sub2) this).anInt9780) * -2020606751, 0, i_13_, i_11_, this);
					else
						i = method3681(((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408(), is, (((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905, i, (((Class330_Sub40_Sub3_Sub2) this).anInt9775) * -2092094291, (((Class330_Sub40_Sub3_Sub2) this).anInt9778) * 241122819, 0, i_13_, i_11_, this);
				} else if (Class296.aBoolean3023)
					i = method3676(0.0F, 0, ((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408(), is, (((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905), i, (((Class330_Sub40_Sub3_Sub2) this).anInt9783 * 1694000393), (((Class330_Sub40_Sub3_Sub2) this).anInt9776 * 111438813), (((Class330_Sub40_Sub3_Sub2) this).anInt9785 * 1941232607), (((Class330_Sub40_Sub3_Sub2) this).anInt9780 * -2020606751), 0, i_13_, i_11_, this, (((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319), f);
				else
					i = method3675(0.0F, 0, ((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408(), is, (((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905), i, (((Class330_Sub40_Sub3_Sub2) this).anInt9775 * -2092094291), (((Class330_Sub40_Sub3_Sub2) this).anInt9778 * 241122819), 0, i_13_, i_11_, this, (((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319), f);
				((Class330_Sub40_Sub3_Sub2) this).anInt9771 -= i * 807250037;
				if (((Class330_Sub40_Sub3_Sub2) this).anInt9771 * 424994781 != 0)
					return i;
			} while (!method3634(-428424081));
			return i_12_;
		} while (false);
		if (((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319 == -256 && (((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905 & 0xff) == 0) {
			if (Class296.aBoolean3023)
				return method3668(0.0F, ((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408(), is, (((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905), i, (((Class330_Sub40_Sub3_Sub2) this).anInt9783 * 1694000393), (((Class330_Sub40_Sub3_Sub2) this).anInt9776 * 111438813), 0, i_12_, i_11_, this);
			return (method3677(((Class330_Sub29_Sub1_Sub1) ((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770).method3408(), is, ((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905, i, ((Class330_Sub40_Sub3_Sub2) this).anInt9775 * -2092094291, 0, i_12_, i_11_, this));
		}
		if (Class296.aBoolean3023)
			return (method3671(0.0F, 0, ((Class330_Sub29_Sub1_Sub1) ((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770).method3408(), is, ((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905, i, ((Class330_Sub40_Sub3_Sub2) this).anInt9783 * 1694000393, ((Class330_Sub40_Sub3_Sub2) this).anInt9776 * 111438813, 0, i_12_, i_11_, this, ((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319, f));
		return (method3670(0.0F, 0, ((Class330_Sub29_Sub1_Sub1) ((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770).method3408(), is, ((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905, i, ((Class330_Sub40_Sub3_Sub2) this).anInt9775 * -2092094291, 0, i_12_, i_11_, this, ((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319, f));
	}

	static int method3667(float f, float[] fs, int[] is, int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, Class330_Sub40_Sub3_Sub2 class330_sub40_sub3_sub2) {
		i >>= 8;
		i_19_ >>= 8;
		i_15_ <<= 2;
		i_16_ <<= 2;
		i_15_ *= 128;
		i_16_ *= 128;
		if ((i_17_ = i_14_ + i_19_ - i) > i_18_)
			i_17_ = i_18_;
		i_14_ <<= 1;
		i_17_ <<= 1;
		i_17_ -= 6;
		while (i_14_ < i_17_) {
			f = fs[i++];
			is[i_14_++] += f * (float) i_15_;
			is[i_14_++] += f * (float) i_16_;
			f = fs[i++];
			is[i_14_++] += f * (float) i_15_;
			is[i_14_++] += f * (float) i_16_;
			f = fs[i++];
			is[i_14_++] += f * (float) i_15_;
			is[i_14_++] += f * (float) i_16_;
			f = fs[i++];
			is[i_14_++] += f * (float) i_15_;
			is[i_14_++] += f * (float) i_16_;
		}
		i_17_ += 6;
		while (i_14_ < i_17_) {
			f = fs[i++];
			is[i_14_++] += f * (float) i_15_;
			is[i_14_++] += f * (float) i_16_;
		}
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9782 = (i << 8) * 2144077895;
		return i_14_ >> 1;
	}

	static int method3668(float f, float[] fs, int[] is, int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, Class330_Sub40_Sub3_Sub2 class330_sub40_sub3_sub2) {
		i >>= 8;
		i_25_ >>= 8;
		i_21_ <<= 2;
		i_22_ <<= 2;
		i_21_ *= 128;
		i_22_ *= 128;
		if ((i_23_ = i_20_ + i - (i_25_ - 1)) > i_24_)
			i_23_ = i_24_;
		i_20_ <<= 1;
		i_23_ <<= 1;
		i_23_ -= 6;
		while (i_20_ < i_23_) {
			f = fs[i--];
			is[i_20_++] += f * (float) i_21_;
			is[i_20_++] += f * (float) i_22_;
			f = fs[i--];
			is[i_20_++] += f * (float) i_21_;
			is[i_20_++] += f * (float) i_22_;
			f = fs[i--];
			is[i_20_++] += f * (float) i_21_;
			is[i_20_++] += f * (float) i_22_;
			f = fs[i--];
			is[i_20_++] += f * (float) i_21_;
			is[i_20_++] += f * (float) i_22_;
		}
		i_23_ += 6;
		while (i_20_ < i_23_) {
			f = fs[i--];
			is[i_20_++] += f * (float) i_21_;
			is[i_20_++] += f * (float) i_22_;
		}
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9782 = (i << 8) * 2144077895;
		return i_20_ >> 1;
	}

	static int method3669(float f, int i, float[] fs, int[] is, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, Class330_Sub40_Sub3_Sub2 class330_sub40_sub3_sub2, int i_33_, float f_34_) {
		i_28_ *= 128;
		i_29_ *= 128;
		if (i_33_ == 0 || (i_30_ = i_27_ + (i_32_ - i_26_ + i_33_ - 257) / i_33_) > i_31_)
			i_30_ = i_31_;
		i_27_ <<= 1;
		i_30_ <<= 1;
		while (i_27_ < i_30_) {
			i = i_26_ >> 8;
			f = fs[i];
			f = f * 256.0F + (fs[i + 1] - f) * (float) (i_26_ & 0xff);
			is[i_27_++] += (int) (f * (float) i_28_) >> 6;
			is[i_27_++] += (int) (f * (float) i_29_) >> 6;
			i_26_ += i_33_;
		}
		if (i_33_ == 0 || ((i_30_ = (i_27_ >> 1) + (i_32_ - i_26_ + i_33_ - 1) / i_33_) > i_31_))
			i_30_ = i_31_;
		i_30_ <<= 1;
		while (i_27_ < i_30_) {
			f = fs[i_26_ >> 8];
			f = f * 256.0F + (f_34_ - f) * (float) (i_26_ & 0xff);
			is[i_27_++] += (int) (f * (float) i_28_) >> 6;
			is[i_27_++] += (int) (f * (float) i_29_) >> 6;
			i_26_ += i_33_;
		}
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9782 = i_26_ * 2144077895;
		return i_27_ >> 1;
	}

	static int method3670(float f, int i, float[] fs, int[] is, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, Class330_Sub40_Sub3_Sub2 class330_sub40_sub3_sub2, int i_41_, float f_42_) {
		i_37_ *= 128;
		if (i_41_ == 0 || (i_38_ = i_36_ + (i_40_ + 256 - i_35_ + i_41_) / i_41_) > i_39_)
			i_38_ = i_39_;
		while (i_36_ < i_38_) {
			i = i_35_ >> 8;
			f = fs[i - 1];
			is[i_36_++] += (int) ((f * 256.0F + (fs[i] - f) * (float) (i_35_ & 0xff)) * (float) i_37_) >> 6;
			i_35_ += i_41_;
		}
		if (i_41_ == 0 || (i_38_ = i_36_ + (i_40_ - i_35_ + i_41_) / i_41_) > i_39_)
			i_38_ = i_39_;
		f = f_42_;
		while (i_36_ < i_38_) {
			is[i_36_++] += (int) ((f * 256.0F + (fs[i_35_ >> 8] - f) * (float) (i_35_ & 0xff)) * (float) i_37_) >> 6;
			i_35_ += i_41_;
		}
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9782 = i_35_ * 2144077895;
		return i_36_;
	}

	static int method3671(float f, int i, float[] fs, int[] is, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, Class330_Sub40_Sub3_Sub2 class330_sub40_sub3_sub2, int i_50_, float f_51_) {
		i_45_ *= 128;
		i_46_ *= 128;
		if (i_50_ == 0 || (i_47_ = i_44_ + (i_49_ + 256 - i_43_ + i_50_) / i_50_) > i_48_)
			i_47_ = i_48_;
		i_44_ <<= 1;
		i_47_ <<= 1;
		while (i_44_ < i_47_) {
			i = i_43_ >> 8;
			f = fs[i - 1];
			f = f * 256.0F + (fs[i] - f) * (float) (i_43_ & 0xff);
			is[i_44_++] += (int) (f * (float) i_45_) >> 6;
			is[i_44_++] += (int) (f * (float) i_46_) >> 6;
			i_43_ += i_50_;
		}
		if (i_50_ == 0 || ((i_47_ = (i_44_ >> 1) + (i_49_ - i_43_ + i_50_) / i_50_) > i_48_))
			i_47_ = i_48_;
		i_47_ <<= 1;
		while (i_44_ < i_47_) {
			f = f_51_ * 256.0F + (fs[i_43_ >> 8] - f_51_) * (float) (i_43_ & 0xff);
			is[i_44_++] += (int) (f * (float) i_45_) >> 6;
			is[i_44_++] += (int) (f * (float) i_46_) >> 6;
			i_43_ += i_50_;
		}
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9782 = i_43_ * 2144077895;
		return i_44_ >> 1;
	}

	static int method3672(float f, float[] fs, int[] is, int i, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, Class330_Sub40_Sub3_Sub2 class330_sub40_sub3_sub2) {
		i >>= 8;
		i_59_ >>= 8;
		i_53_ <<= 2;
		i_54_ <<= 2;
		i_55_ <<= 2;
		i_56_ <<= 2;
		i_53_ *= 128;
		i_55_ *= 128;
		i_54_ *= 128;
		i_56_ *= 128;
		if ((i_57_ = i_52_ + i - (i_59_ - 1)) > i_58_)
			i_57_ = i_58_;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9775 += (((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9778 * 241122819 * (i_57_ - i_52_) * 1875449637);
		i_52_ <<= 1;
		i_57_ <<= 1;
		i_57_ -= 6;
		while (i_52_ < i_57_) {
			f = fs[i--];
			is[i_52_++] += f * (float) i_53_;
			i_53_ += i_55_;
			is[i_52_++] += f * (float) i_54_;
			i_54_ += i_56_;
			f = fs[i--];
			is[i_52_++] += f * (float) i_53_;
			i_53_ += i_55_;
			is[i_52_++] += f * (float) i_54_;
			i_54_ += i_56_;
			f = fs[i--];
			is[i_52_++] += f * (float) i_53_;
			i_53_ += i_55_;
			is[i_52_++] += f * (float) i_54_;
			i_54_ += i_56_;
			f = fs[i--];
			is[i_52_++] += f * (float) i_53_;
			i_53_ += i_55_;
			is[i_52_++] += f * (float) i_54_;
			i_54_ += i_56_;
		}
		i_57_ += 6;
		while (i_52_ < i_57_) {
			f = fs[i--];
			is[i_52_++] += f * (float) i_53_;
			i_53_ += i_55_;
			is[i_52_++] += f * (float) i_54_;
			i_54_ += i_56_;
		}
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9783 = (i_53_ / 128 >> 2) * -1883326151;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9776 = (i_54_ / 128 >> 2) * -1178319755;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9782 = (i << 8) * 2144077895;
		return i_52_ >> 1;
	}

	static int method3673(float f, int i, float[] fs, int[] is, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, Class330_Sub40_Sub3_Sub2 class330_sub40_sub3_sub2, int i_67_, float f_68_) {
		i_62_ *= 128;
		i_63_ *= 128;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9783 -= (((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9785 * 1941232607 * i_61_ * -1883326151);
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9776 -= (((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9780 * -2020606751 * i_61_ * -1178319755);
		if (i_67_ == 0 || (i_64_ = i_61_ + (i_66_ - i_60_ + i_67_ - 257) / i_67_) > i_65_)
			i_64_ = i_65_;
		while (i_61_ < i_64_) {
			i = i_60_ >> 8;
			f = fs[i];
			is[i_61_++] += (int) ((f * 256.0F + (fs[i + 1] - f) * (float) (i_60_ & 0xff)) * (float) i_62_) >> 6;
			i_62_ += i_63_;
			i_60_ += i_67_;
		}
		if (i_67_ == 0 || (i_64_ = i_61_ + (i_66_ - i_60_ + i_67_ - 1) / i_67_) > i_65_)
			i_64_ = i_65_;
		while (i_61_ < i_64_) {
			f = fs[i_60_ >> 8];
			is[i_61_++] += (int) ((f * 256.0F + (f_68_ - f) * (float) (i_60_ & 0xff)) * (float) i_62_) >> 6;
			i_62_ += i_63_;
			i_60_ += i_67_;
		}
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9783 += (((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9785 * 1941232607 * i_61_ * -1883326151);
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9776 += (((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9780 * -2020606751 * i_61_ * -1178319755);
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9775 = i_62_ / 128 * 1875449637;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9782 = i_60_ * 2144077895;
		return i_61_;
	}

	static int method3674(float f, int i, float[] fs, int[] is, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, Class330_Sub40_Sub3_Sub2 class330_sub40_sub3_sub2, int i_78_, float f_79_) {
		i_71_ *= 128;
		i_73_ *= 128;
		i_72_ *= 128;
		i_74_ *= 128;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9775 -= (((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9778 * 241122819 * i_70_ * 1875449637);
		if (i_78_ == 0 || (i_75_ = i_70_ + (i_77_ - i_69_ + i_78_ - 257) / i_78_) > i_76_)
			i_75_ = i_76_;
		i_70_ <<= 1;
		i_75_ <<= 1;
		while (i_70_ < i_75_) {
			i = i_69_ >> 8;
			f = fs[i];
			f = f * 256.0F + (fs[i + 1] - f) * (float) (i_69_ & 0xff);
			is[i_70_++] += (int) (f * (float) i_71_) >> 6;
			i_71_ += i_73_;
			is[i_70_++] += (int) (f * (float) i_72_) >> 6;
			i_72_ += i_74_;
			i_69_ += i_78_;
		}
		if (i_78_ == 0 || ((i_75_ = (i_70_ >> 1) + (i_77_ - i_69_ + i_78_ - 1) / i_78_) > i_76_))
			i_75_ = i_76_;
		i_75_ <<= 1;
		while (i_70_ < i_75_) {
			f = fs[i_69_ >> 8];
			f = f * 256.0F + (f_79_ - f) * (float) (i_69_ & 0xff);
			is[i_70_++] += (int) (f * (float) i_71_) >> 6;
			i_71_ += i_73_;
			is[i_70_++] += (int) (f * (float) i_72_) >> 6;
			i_72_ += i_74_;
			i_69_ += i_78_;
		}
		i_70_ >>= 1;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9775 += (((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9778 * 241122819 * i_70_ * 1875449637);
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9783 = i_71_ / 128 * -1883326151;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9776 = i_72_ / 128 * -1178319755;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9782 = i_69_ * 2144077895;
		return i_70_;
	}

	static int method3675(float f, int i, float[] fs, int[] is, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, Class330_Sub40_Sub3_Sub2 class330_sub40_sub3_sub2, int i_87_, float f_88_) {
		i_82_ *= 128;
		i_83_ *= 128;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9783 -= (((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9785 * 1941232607 * i_81_ * -1883326151);
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9776 -= (((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9780 * -2020606751 * i_81_ * -1178319755);
		if (i_87_ == 0 || (i_84_ = i_81_ + (i_86_ + 256 - i_80_ + i_87_) / i_87_) > i_85_)
			i_84_ = i_85_;
		while (i_81_ < i_84_) {
			i = i_80_ >> 8;
			f = fs[i - 1];
			is[i_81_++] += (int) ((f * 256.0F + (fs[i] - f) * (float) (i_80_ & 0xff)) * (float) i_82_) >> 6;
			i_82_ += i_83_;
			i_80_ += i_87_;
		}
		if (i_87_ == 0 || (i_84_ = i_81_ + (i_86_ - i_80_ + i_87_) / i_87_) > i_85_)
			i_84_ = i_85_;
		f = f_88_;
		while (i_81_ < i_84_) {
			is[i_81_++] += (int) ((f * 256.0F + (fs[i_80_ >> 8] - f) * (float) (i_80_ & 0xff)) * (float) i_82_) >> 6;
			i_82_ += i_83_;
			i_80_ += i_87_;
		}
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9783 += (((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9785 * 1941232607 * i_81_ * -1883326151);
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9776 += (((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9780 * -2020606751 * i_81_ * -1178319755);
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9775 = i_82_ / 128 * 1875449637;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9782 = i_80_ * 2144077895;
		return i_81_;
	}

	static int method3676(float f, int i, float[] fs, int[] is, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_, Class330_Sub40_Sub3_Sub2 class330_sub40_sub3_sub2, int i_98_, float f_99_) {
		i_91_ *= 128;
		i_93_ *= 128;
		i_92_ *= 128;
		i_94_ *= 128;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9775 -= (((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9778 * 241122819 * i_90_ * 1875449637);
		if (i_98_ == 0 || (i_95_ = i_90_ + (i_97_ + 256 - i_89_ + i_98_) / i_98_) > i_96_)
			i_95_ = i_96_;
		i_90_ <<= 1;
		i_95_ <<= 1;
		while (i_90_ < i_95_) {
			i = i_89_ >> 8;
			f = fs[i - 1];
			f = f * 256.0F + (fs[i] - f) * (float) (i_89_ & 0xff);
			is[i_90_++] += (int) (f * (float) i_91_) >> 6;
			i_91_ += i_93_;
			is[i_90_++] += (int) (f * (float) i_92_) >> 6;
			i_92_ += i_94_;
			i_89_ += i_98_;
		}
		if (i_98_ == 0 || ((i_95_ = (i_90_ >> 1) + (i_97_ - i_89_ + i_98_) / i_98_) > i_96_))
			i_95_ = i_96_;
		i_95_ <<= 1;
		while (i_90_ < i_95_) {
			f = f_99_ * 256.0F + (fs[i_89_ >> 8] - f_99_) * (float) (i_89_ & 0xff);
			is[i_90_++] += (int) (f * (float) i_91_) >> 6;
			i_91_ += i_93_;
			is[i_90_++] += (int) (f * (float) i_92_) >> 6;
			i_92_ += i_94_;
			i_89_ += i_98_;
		}
		i_90_ >>= 1;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9775 += (((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9778 * 241122819 * i_90_ * 1875449637);
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9783 = i_91_ / 128 * -1883326151;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9776 = i_92_ / 128 * -1178319755;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9782 = i_89_ * 2144077895;
		return i_90_;
	}

	public synchronized void method3565(int[] is, int i, int i_100_) throws IllegalStateException {
		if (((Class330_Sub40_Sub3_Sub2) this).anInt9773 * 1488581567 == 0 && ((Class330_Sub40_Sub3_Sub2) this).anInt9771 * 424994781 == 0)
			method3555(i_100_);
		else {
			int i_101_ = ((Class330_Sub40_Sub3_Sub2) this).anInt9777 * 216574687 << 8;
			int i_102_ = (((Class330_Sub40_Sub3_Sub2) this).anInt9779 * 2094253865 << 8);
			int i_103_ = (((Class330_Sub29_Sub1_Sub1) ((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770).method3407() << 8);
			int i_104_ = i_102_ - i_101_;
			if (i_104_ <= 0)
				((Class330_Sub40_Sub3_Sub2) this).anInt9781 = 0;
			int i_105_ = i;
			i_100_ += i;
			if (((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905 < 0) {
				if (((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319 > 0)
					((Class330_Sub40_Sub3_Sub2) this).anInt9782 = 0;
				else {
					method3641((short) -3241);
					method3252(582241104);
					return;
				}
			}
			if (((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905 >= i_103_) {
				if (((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319 < 0)
					((Class330_Sub40_Sub3_Sub2) this).anInt9782 = (i_103_ - 1) * 2144077895;
				else {
					method3641((short) -769);
					method3252(-764524253);
					return;
				}
			}
			if (((Class330_Sub40_Sub3_Sub2) this).anInt9781 * -1618882239 < 0) {
				if (((Class330_Sub40_Sub3_Sub2) this).aBoolean9784) {
					if (((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319 < 0) {
						i_105_ = method3666(is, i_105_, i_101_, i_100_, (((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9777) * 216574687]));
						if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905) >= i_101_)
							return;
						((Class330_Sub40_Sub3_Sub2) this).anInt9782 = (i_101_ + i_101_ - 1 - (((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905)) * 2144077895;
						((Class330_Sub40_Sub3_Sub2) this).anInt9772 = -(((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 1);
					}
					for (;;) {
						i_105_ = method3665(is, i_105_, i_102_, i_100_, (((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9779) * 2094253865 - 1]));
						if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905) < i_102_)
							break;
						((Class330_Sub40_Sub3_Sub2) this).anInt9782 = (i_102_ + i_102_ - 1 - (((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905)) * 2144077895;
						((Class330_Sub40_Sub3_Sub2) this).anInt9772 = -(((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 1);
						i_105_ = method3666(is, i_105_, i_101_, i_100_, (((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9777) * 216574687]));
						if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905) >= i_101_)
							break;
						((Class330_Sub40_Sub3_Sub2) this).anInt9782 = (i_101_ + i_101_ - 1 - (((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905)) * 2144077895;
						((Class330_Sub40_Sub3_Sub2) this).anInt9772 = -(((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 1);
					}
				} else if ((((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319) < 0) {
					for (;;) {
						i_105_ = method3666(is, i_105_, i_101_, i_100_, (((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9779) * 2094253865 - 1]));
						if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905) >= i_101_)
							break;
						((Class330_Sub40_Sub3_Sub2) this).anInt9782 = ((i_102_ - 1 - (i_102_ - 1 - (((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905) % i_104_) * 2144077895);
					}
				} else {
					for (;;) {
						i_105_ = method3665(is, i_105_, i_102_, i_100_, (((Class330_Sub29_Sub1_Sub1) (((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770)).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9777) * 216574687]));
						if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905) < i_102_)
							break;
						((Class330_Sub40_Sub3_Sub2) this).anInt9782 = (i_101_ + ((((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905) - i_101_) % i_104_) * 2144077895;
					}
				}
			} else {
				do {
					if ((((Class330_Sub40_Sub3_Sub2) this).anInt9781 * -1618882239) > 0) {
						if (((Class330_Sub40_Sub3_Sub2) this).aBoolean9784) {
							if ((((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319) < 0) {
								i_105_ = method3666(is, i_105_, i_101_, i_100_, (((Class330_Sub29_Sub1_Sub1) ((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9777 * 216574687)]));
								if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905 >= i_101_)
									return;
								((Class330_Sub40_Sub3_Sub2) this).anInt9782 = ((i_101_ + i_101_ - 1 - (((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905) * 2144077895);
								((Class330_Sub40_Sub3_Sub2) this).anInt9772 = -((((Class330_Sub40_Sub3_Sub2) this).anInt9772) * 1);
								if ((((Class330_Sub40_Sub3_Sub2) this).anInt9781 -= 1578352321) * -1618882239 == 0)
									break;
							}
							do {
								i_105_ = method3665(is, i_105_, i_102_, i_100_, (((Class330_Sub29_Sub1_Sub1) ((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9779 * 2094253865) - 1]));
								if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905 < i_102_)
									return;
								((Class330_Sub40_Sub3_Sub2) this).anInt9782 = ((i_102_ + i_102_ - 1 - (((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905) * 2144077895);
								((Class330_Sub40_Sub3_Sub2) this).anInt9772 = -((((Class330_Sub40_Sub3_Sub2) this).anInt9772) * 1);
								if ((((Class330_Sub40_Sub3_Sub2) this).anInt9781 -= 1578352321) * -1618882239 == 0)
									break;
								i_105_ = method3666(is, i_105_, i_101_, i_100_, (((Class330_Sub29_Sub1_Sub1) ((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9777 * 216574687)]));
								if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905 >= i_101_)
									return;
								((Class330_Sub40_Sub3_Sub2) this).anInt9782 = ((i_101_ + i_101_ - 1 - (((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905) * 2144077895);
								((Class330_Sub40_Sub3_Sub2) this).anInt9772 = -((((Class330_Sub40_Sub3_Sub2) this).anInt9772) * 1);
							} while ((((Class330_Sub40_Sub3_Sub2) this).anInt9781 -= 1578352321) * -1618882239 != 0);
						} else if ((((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319) < 0) {
							for (;;) {
								i_105_ = method3666(is, i_105_, i_101_, i_100_, (((Class330_Sub29_Sub1_Sub1) ((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9779 * 2094253865) - 1]));
								if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905 >= i_101_)
									return;
								int i_106_ = ((i_102_ - 1 - (((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905) / i_104_);
								if (i_106_ >= (((Class330_Sub40_Sub3_Sub2) this).anInt9781) * -1618882239) {
									((Class330_Sub40_Sub3_Sub2) this).anInt9782 += (i_104_ * (((Class330_Sub40_Sub3_Sub2) this).anInt9781 * -1618882239) * 2144077895);
									((Class330_Sub40_Sub3_Sub2) this).anInt9781 = 0;
									break;
								}
								((Class330_Sub40_Sub3_Sub2) this).anInt9782 += i_104_ * i_106_ * 2144077895;
								((Class330_Sub40_Sub3_Sub2) this).anInt9781 -= i_106_ * 1578352321;
							}
						} else {
							for (;;) {
								i_105_ = method3665(is, i_105_, i_102_, i_100_, (((Class330_Sub29_Sub1_Sub1) ((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770).method3408()[(((Class330_Sub40_Sub3_Sub2) this).anInt9777 * 216574687)]));
								if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905 < i_102_)
									return;
								int i_107_ = (((((Class330_Sub40_Sub3_Sub2) this).anInt9782) * -558816905 - i_101_) / i_104_);
								if (i_107_ >= (((Class330_Sub40_Sub3_Sub2) this).anInt9781) * -1618882239) {
									((Class330_Sub40_Sub3_Sub2) this).anInt9782 -= (i_104_ * (((Class330_Sub40_Sub3_Sub2) this).anInt9781 * -1618882239) * 2144077895);
									((Class330_Sub40_Sub3_Sub2) this).anInt9781 = 0;
									break;
								}
								((Class330_Sub40_Sub3_Sub2) this).anInt9782 -= i_104_ * i_107_ * 2144077895;
								((Class330_Sub40_Sub3_Sub2) this).anInt9781 -= i_107_ * 1578352321;
							}
						}
					}
				} while (false);
				if (((Class330_Sub40_Sub3_Sub2) this).anInt9772 * 598541319 < 0) {
					method3666(is, i_105_, 0, i_100_, 0.0F);
					if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905) < 0) {
						((Class330_Sub40_Sub3_Sub2) this).anInt9782 = -2144077895;
						method3641((short) 2383);
						method3252(1429281465);
					}
				} else {
					method3665(is, i_105_, i_103_, i_100_, 0.0F);
					if ((((Class330_Sub40_Sub3_Sub2) this).anInt9782 * -558816905) >= i_103_) {
						((Class330_Sub40_Sub3_Sub2) this).anInt9782 = i_103_ * 2144077895;
						method3641((short) 5129);
						method3252(-1497588800);
					}
				}
			}
		}
	}

	static int method3677(float[] fs, int[] is, int i, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_, Class330_Sub40_Sub3_Sub2 class330_sub40_sub3_sub2) {
		i >>= 8;
		i_112_ >>= 8;
		i_109_ <<= 2;
		i_109_ *= 128;
		if ((i_110_ = i_108_ + i - (i_112_ - 1)) > i_111_)
			i_110_ = i_111_;
		i_110_ -= 3;
		while (i_108_ < i_110_) {
			is[i_108_++] += fs[i--] * (float) i_109_;
			is[i_108_++] += fs[i--] * (float) i_109_;
			is[i_108_++] += fs[i--] * (float) i_109_;
			is[i_108_++] += fs[i--] * (float) i_109_;
		}
		i_110_ += 3;
		while (i_108_ < i_110_)
			is[i_108_++] += fs[i--] * (float) i_109_;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9782 = (i << 8) * 2144077895;
		return i_108_;
	}

	Class330_Sub40_Sub3_Sub2(Class330_Sub29_Sub1_Sub1 class330_sub29_sub1_sub1, int i, int i_113_, int i_114_) {
		((Class330_Sub40_Sub3_Sub2) this).aClass330_Sub29_7770 = class330_sub29_sub1_sub1;
		((Class330_Sub40_Sub3_Sub2) this).anInt9777 = class330_sub29_sub1_sub1.anInt9588 * 132368147;
		((Class330_Sub40_Sub3_Sub2) this).anInt9779 = (((Class330_Sub29_Sub1_Sub1) class330_sub29_sub1_sub1).anInt9587 * 76055237);
		((Class330_Sub40_Sub3_Sub2) this).aBoolean9784 = class330_sub29_sub1_sub1.aBoolean9589;
		((Class330_Sub40_Sub3_Sub2) this).anInt9772 = i * -542430793;
		((Class330_Sub40_Sub3_Sub2) this).anInt9773 = i_113_ * 1089731647;
		((Class330_Sub40_Sub3_Sub2) this).anInt9774 = i_114_ * -2142407929;
		((Class330_Sub40_Sub3_Sub2) this).anInt9782 = 0;
		method3635((byte) 55);
	}

	static int method3678(float f, int i, float[] fs, int[] is, int i_115_, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, Class330_Sub40_Sub3_Sub2 class330_sub40_sub3_sub2, int i_121_, float f_122_) {
		i_117_ *= 128;
		if (i_121_ == 0 || ((i_118_ = i_116_ + (i_120_ - i_115_ + i_121_ - 257) / i_121_) > i_119_))
			i_118_ = i_119_;
		while (i_116_ < i_118_) {
			i = i_115_ >> 8;
			f = fs[i];
			is[i_116_++] += (int) ((f * 256.0F + (fs[i + 1] - f) * (float) (i_115_ & 0xff)) * (float) i_117_) >> 6;
			i_115_ += i_121_;
		}
		if (i_121_ == 0 || ((i_118_ = i_116_ + (i_120_ - i_115_ + i_121_ - 1) / i_121_) > i_119_))
			i_118_ = i_119_;
		while (i_116_ < i_118_) {
			f = fs[i_115_ >> 8];
			is[i_116_++] += (int) ((f * 256.0F + (f_122_ - f) * (float) (i_115_ & 0xff)) * (float) i_117_) >> 6;
			i_115_ += i_121_;
		}
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9782 = i_115_ * 2144077895;
		return i_116_;
	}

	static int method3679(float[] fs, int[] is, int i, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, Class330_Sub40_Sub3_Sub2 class330_sub40_sub3_sub2) {
		i >>= 8;
		i_127_ >>= 8;
		i_124_ <<= 2;
		i_124_ *= 128;
		if ((i_125_ = i_123_ + i_127_ - i) > i_126_)
			i_125_ = i_126_;
		i_125_ -= 3;
		while (i_123_ < i_125_) {
			is[i_123_++] += fs[i++] * (float) i_124_;
			is[i_123_++] += fs[i++] * (float) i_124_;
			is[i_123_++] += fs[i++] * (float) i_124_;
			is[i_123_++] += fs[i++] * (float) i_124_;
		}
		i_125_ += 3;
		while (i_123_ < i_125_)
			is[i_123_++] += fs[i++] * (float) i_124_;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9782 = (i << 8) * 2144077895;
		return i_123_;
	}

	static int method3680(float f, float[] fs, int[] is, int i, int i_128_, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_, int i_134_, int i_135_, Class330_Sub40_Sub3_Sub2 class330_sub40_sub3_sub2) {
		i >>= 8;
		i_135_ >>= 8;
		i_129_ <<= 2;
		i_130_ <<= 2;
		i_131_ <<= 2;
		i_132_ <<= 2;
		i_129_ *= 128;
		i_131_ *= 128;
		i_130_ *= 128;
		i_132_ *= 128;
		if ((i_133_ = i_128_ + i_135_ - i) > i_134_)
			i_133_ = i_134_;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9775 += (((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9778 * 241122819 * (i_133_ - i_128_) * 1875449637);
		i_128_ <<= 1;
		i_133_ <<= 1;
		i_133_ -= 6;
		while (i_128_ < i_133_) {
			f = fs[i++];
			is[i_128_++] += f * (float) i_129_;
			i_129_ += i_131_;
			is[i_128_++] += f * (float) i_130_;
			i_130_ += i_132_;
			f = fs[i++];
			is[i_128_++] += f * (float) i_129_;
			i_129_ += i_131_;
			is[i_128_++] += f * (float) i_130_;
			i_130_ += i_132_;
			f = fs[i++];
			is[i_128_++] += f * (float) i_129_;
			i_129_ += i_131_;
			is[i_128_++] += f * (float) i_130_;
			i_130_ += i_132_;
			f = fs[i++];
			is[i_128_++] += f * (float) i_129_;
			i_129_ += i_131_;
			is[i_128_++] += f * (float) i_130_;
			i_130_ += i_132_;
		}
		i_133_ += 6;
		while (i_128_ < i_133_) {
			f = fs[i++];
			is[i_128_++] += f * (float) i_129_;
			i_129_ += i_131_;
			is[i_128_++] += f * (float) i_130_;
			i_130_ += i_132_;
		}
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9783 = (i_129_ / 128 >> 2) * -1883326151;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9776 = (i_130_ / 128 >> 2) * -1178319755;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9782 = (i << 8) * 2144077895;
		return i_128_ >> 1;
	}

	static int method3681(float[] fs, int[] is, int i, int i_136_, int i_137_, int i_138_, int i_139_, int i_140_, int i_141_, Class330_Sub40_Sub3_Sub2 class330_sub40_sub3_sub2) {
		i >>= 8;
		i_141_ >>= 8;
		i_137_ <<= 2;
		i_138_ <<= 2;
		i_137_ *= 128;
		i_138_ *= 128;
		if ((i_139_ = i_136_ + i - (i_141_ - 1)) > i_140_)
			i_139_ = i_140_;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9783 += (((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9785 * 1941232607 * (i_139_ - i_136_) * -1883326151);
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9776 += (((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9780 * -2020606751 * (i_139_ - i_136_) * -1178319755);
		i_139_ -= 3;
		while (i_136_ < i_139_) {
			is[i_136_++] += fs[i--] * (float) i_137_;
			i_137_ += i_138_;
			is[i_136_++] += fs[i--] * (float) i_137_;
			i_137_ += i_138_;
			is[i_136_++] += fs[i--] * (float) i_137_;
			i_137_ += i_138_;
			is[i_136_++] += fs[i--] * (float) i_137_;
			i_137_ += i_138_;
		}
		i_139_ += 3;
		while (i_136_ < i_139_) {
			is[i_136_++] += fs[i--] * (float) i_137_;
			i_137_ += i_138_;
		}
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9775 = (i_137_ / 128 >> 2) * 1875449637;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9782 = (i << 8) * 2144077895;
		return i_136_;
	}

	static int method3682(float[] fs, int[] is, int i, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_, Class330_Sub40_Sub3_Sub2 class330_sub40_sub3_sub2) {
		i >>= 8;
		i_147_ >>= 8;
		i_143_ <<= 2;
		i_144_ <<= 2;
		i_143_ *= 128;
		i_144_ *= 128;
		if ((i_145_ = i_142_ + i_147_ - i) > i_146_)
			i_145_ = i_146_;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9783 += (((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9785 * 1941232607 * (i_145_ - i_142_) * -1883326151);
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9776 += (((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9780 * -2020606751 * (i_145_ - i_142_) * -1178319755);
		i_145_ -= 3;
		while (i_142_ < i_145_) {
			is[i_142_++] += fs[i++] * (float) i_143_;
			i_143_ += i_144_;
			is[i_142_++] += fs[i++] * (float) i_143_;
			i_143_ += i_144_;
			is[i_142_++] += fs[i++] * (float) i_143_;
			i_143_ += i_144_;
			is[i_142_++] += fs[i++] * (float) i_143_;
			i_143_ += i_144_;
		}
		i_145_ += 3;
		while (i_142_ < i_145_) {
			is[i_142_++] += fs[i++] * (float) i_143_;
			i_143_ += i_144_;
		}
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9775 = (i_143_ / 128 >> 2) * 1875449637;
		((Class330_Sub40_Sub3_Sub2) class330_sub40_sub3_sub2).anInt9782 = (i << 8) * 2144077895;
		return i_142_;
	}
}
