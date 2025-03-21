/* Class437 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class437 {
	byte[] aByteArray4428;
	int anInt4429;
	int anInt4430;
	public int anInt4431 = 872235369;
	short[] aShortArray4432;
	byte[] aByteArray4433;
	int anInt4434;
	short[] aShortArray4435;
	short[] aShortArray4436;
	int anInt4437;
	int anInt4438 = 629044864;
	short[] aShortArray4439;
	int anInt4440;
	int anInt4441;
	Class416 aClass416_4442;
	public boolean aBoolean4443;
	public byte aByte4444;
	int anInt4445;

	void method5580(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(484941882);
				if (0 == i_0_) {
					if (i != -1903137404)
						throw new IllegalStateException();
					break;
				}
				method5582(class330_sub46, i_0_, (byte) 1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sc.r(").append(')').toString());
		}
	}

	public final Class387 method5581(Class_ra class_ra, int i, boolean bool, Class_xa class_xa, Class_xa class_xa_1_, int i_2_, int i_3_, int i_4_, Class477 class477, byte i_5_, int i_6_) {
		try {
			int i_7_ = i;
			bool = bool & 0 != aByte4444;
			if (null != class477)
				i_7_ |= class477.method5975(-1898478740);
			if (bool)
				i_7_ = i_7_ | (aByte4444 == 3 ? 7 : 2);
			if (128 != ((Class437) this).anInt4434 * -1716137083)
				i_7_ |= 0x2;
			if (128 != ((Class437) this).anInt4438 * -119357211 || 0 != ((Class437) this).anInt4440 * -79842923)
				i_7_ |= 0x5;
			Class387 class387;
			synchronized (((Class416) ((Class437) this).aClass416_4442).aClass367_4270) {
				class387 = ((Class387) (((Class416) ((Class437) this).aClass416_4442).aClass367_4270.get((long) ((((Class437) this).anInt4429 = -816416815 * ((((Class437) this).anInt4429 * 1683439921) | (class_ra.anInt4226 * 1409150453) << 29)) * 1683439921))));
			}
			if (class387 == null || class_ra.ct(class387.m(), i_7_) != 0) {
				if (class387 != null)
					i_7_ = class_ra.cd(i_7_, class387.m());
				int i_8_ = i_7_;
				if (((Class437) this).aShortArray4439 != null)
					i_8_ |= 0x4000;
				if (null != ((Class437) this).aShortArray4432)
					i_8_ |= 0x8000;
				Model class98 = Model.loadModel((((Class416) ((Class437) this).aClass416_4442).aClass280_4268), (((Class437) this).anInt4430 * 306867259), 0);
				if (class98 == null)
					return null;
				if (class98.anInt881 < 13)
					class98.method1196(2);
				class387 = class_ra.cb(class98, i_8_, (((Class416) ((Class437) this).aClass416_4442).anInt4269 * -965990281), 47553259 * ((Class437) this).anInt4441 + 64, (((Class437) this).anInt4437 * -892747371 + 850));
				if (null != ((Class437) this).aShortArray4439) {
					for (int i_9_ = 0; i_9_ < ((Class437) this).aShortArray4439.length; i_9_++)
						class387.color(((Class437) this).aShortArray4439[i_9_], ((Class437) this).aShortArray4436[i_9_]);
				}
				if (null != ((Class437) this).aShortArray4432) {
					for (int i_10_ = 0; i_10_ < ((Class437) this).aShortArray4432.length; i_10_++)
						class387.paintTexture(((Class437) this).aShortArray4432[i_10_], ((Class437) this).aShortArray4435[i_10_]);
				}
				class387.KA(i_7_);
				synchronized (((Class416) ((Class437) this).aClass416_4442).aClass367_4270) {
					((Class416) ((Class437) this).aClass416_4442).aClass367_4270.put(class387, (long) ((((Class437) this).anInt4429 = ((1683439921 * ((Class437) this).anInt4429 | 1409150453 * class_ra.anInt4226 << 29) * -816416815)) * 1683439921));
				}
			}
			Class387 class387_11_ = class387.method4446(i_5_, i_7_, true);
			if (class477 != null)
				class477.method5976(class387_11_, 0, -1413412499);
			if (-119357211 * ((Class437) this).anInt4438 != 128 || ((Class437) this).anInt4434 * -1716137083 != 128)
				class387_11_.oa(-119357211 * ((Class437) this).anInt4438, ((Class437) this).anInt4434 * -1716137083, -119357211 * ((Class437) this).anInt4438);
			if (0 != -79842923 * ((Class437) this).anInt4440) {
				if (90 == ((Class437) this).anInt4440 * -79842923)
					class387_11_.f(4096);
				if (-79842923 * ((Class437) this).anInt4440 == 180)
					class387_11_.f(8192);
				if (270 == ((Class437) this).anInt4440 * -79842923)
					class387_11_.f(12288);
			}
			if (bool)
				class387_11_.pa(aByte4444, 800486617 * ((Class437) this).anInt4445, class_xa, class_xa_1_, i_2_, i_3_, i_4_);
			class387_11_.KA(i);
			return class387_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sc.p(").append(')').toString());
		}
	}

	Class437() {
		((Class437) this).anInt4434 = 1989584512;
		((Class437) this).anInt4440 = 0;
		((Class437) this).anInt4441 = 0;
		((Class437) this).anInt4437 = 0;
		aBoolean4443 = false;
		aByte4444 = (byte) 0;
		((Class437) this).anInt4445 = 1571632279;
	}

	void method5582(Buffer class330_sub46, int i, byte i_12_) {
		try {
			if (i == 1)
				((Class437) this).anInt4430 = class330_sub46.readBigSmart(-1078653859) * 2094107891;
			else if (i == 2)
				anInt4431 = class330_sub46.readBigSmart(-605738838) * -872235369;
			else if (i == 4)
				((Class437) this).anInt4438 = class330_sub46.readUnsignedShort(1598413038) * 1179319533;
			else if (5 == i)
				((Class437) this).anInt4434 = class330_sub46.readUnsignedShort(2110142118) * -856871603;
			else if (6 == i)
				((Class437) this).anInt4440 = class330_sub46.readUnsignedShort(1472025292) * -138079811;
			else if (i == 7)
				((Class437) this).anInt4441 = class330_sub46.readUnsignedByte(739105383) * -102548029;
			else if (8 == i)
				((Class437) this).anInt4437 = class330_sub46.readUnsignedByte(1269607296) * -2071952963;
			else if (i == 9) {
				aByte4444 = (byte) 3;
				((Class437) this).anInt4445 = -1547268832;
			} else if (i == 10)
				aBoolean4443 = true;
			else if (i == 11)
				aByte4444 = (byte) 1;
			else if (12 == i)
				aByte4444 = (byte) 4;
			else if (13 == i)
				aByte4444 = (byte) 5;
			else if (14 == i) {
				aByte4444 = (byte) 2;
				((Class437) this).anInt4445 = class330_sub46.readUnsignedByte(146115784) * 1389062400;
			} else if (i == 15) {
				aByte4444 = (byte) 3;
				((Class437) this).anInt4445 = class330_sub46.readUnsignedShort(1226535303) * -1571632279;
			} else if (16 == i) {
				aByte4444 = (byte) 3;
				((Class437) this).anInt4445 = class330_sub46.readInt((byte) 55) * -1571632279;
			} else if (i == 40) {
				int i_13_ = class330_sub46.readUnsignedByte(-81905362);
				((Class437) this).aShortArray4439 = new short[i_13_];
				((Class437) this).aShortArray4436 = new short[i_13_];
				for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
					((Class437) this).aShortArray4439[i_14_] = (short) class330_sub46.readUnsignedShort(2022578343);
					((Class437) this).aShortArray4436[i_14_] = (short) class330_sub46.readUnsignedShort(1264227146);
				}
			} else if (41 == i) {
				int i_15_ = class330_sub46.readUnsignedByte(-155536163);
				((Class437) this).aShortArray4432 = new short[i_15_];
				((Class437) this).aShortArray4435 = new short[i_15_];
				for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
					((Class437) this).aShortArray4432[i_16_] = (short) class330_sub46.readUnsignedShort(1745293830);
					((Class437) this).aShortArray4435[i_16_] = (short) class330_sub46.readUnsignedShort(1615081081);
				}
			} else if (i == 44) {
				int i_17_ = class330_sub46.readUnsignedShort(-139446380);
				int i_18_ = 0;
				for (int i_19_ = i_17_; i_19_ > 0; i_19_ >>= 1)
					i_18_++;
				((Class437) this).aByteArray4428 = new byte[i_18_];
				byte i_20_ = 0;
				for (int i_21_ = 0; i_21_ < i_18_; i_21_++) {
					if ((i_17_ & 1 << i_21_) > 0) {
						((Class437) this).aByteArray4428[i_21_] = i_20_;
						i_20_++;
					} else
						((Class437) this).aByteArray4428[i_21_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_22_ = class330_sub46.readUnsignedShort(2040826442);
				int i_23_ = 0;
				for (int i_24_ = i_22_; i_24_ > 0; i_24_ >>= 1)
					i_23_++;
				((Class437) this).aByteArray4433 = new byte[i_23_];
				byte i_25_ = 0;
				for (int i_26_ = 0; i_26_ < i_23_; i_26_++) {
					if ((i_22_ & 1 << i_26_) > 0) {
						((Class437) this).aByteArray4433[i_26_] = i_25_;
						i_25_++;
					} else
						((Class437) this).aByteArray4433[i_26_] = (byte) -1;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sc.j(").append(')').toString());
		}
	}

	public final Class387 method5583(Class_ra class_ra, int i, Class477 class477, byte i_27_, int i_28_) {
		try {
			return method5581(class_ra, i, false, null, null, 0, 0, 0, class477, i_27_, 1588941804);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sc.i(").append(')').toString());
		}
	}

	public final boolean method5584(byte i) {
		try {
			if (306867259 * ((Class437) this).anInt4430 == -1)
				return true;
			return (((Class416) ((Class437) this).aClass416_4442).aClass280_4268.hasStoredFile(306867259 * ((Class437) this).anInt4430, 0, (byte) 32));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sc.o(").append(')').toString());
		}
	}

	public static int method5585(int i, int i_29_, byte i_30_) {
		try {
			int i_31_ = 1;
			for (/**/; i_29_ > 1; i_29_ >>= 1) {
				if (0 != (i_29_ & 0x1))
					i_31_ *= i;
				i *= i;
			}
			if (1 == i_29_)
				return i * i_31_;
			return i_31_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sc.r(").append(')').toString());
		}
	}

	static final void method5586(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4380 -= -96952422;
			if ((((Class430) class430).aLongArray4379[-1969146619 * ((Class430) class430).anInt4380]) >= (((Class430) class430).aLongArray4379[1 + -1969146619 * ((Class430) class430).anInt4380]))
				((Class430) class430).anInt4397 += (1996761881 * (((Class430) class430).anIntArray4394[((Class430) class430).anInt4397 * -54918871]));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sc.bz(").append(')').toString());
		}
	}

	public static final void method5587(int i, int i_32_, int i_33_, int i_34_, int i_35_, boolean bool, byte i_36_) {
		try {
			Class204_Sub1.anInt8947 = i * 802944399;
			Class151.anInt6671 = -952384087 * i_32_;
			Class432_Sub1_Sub5_Sub1.anInt9963 = i_33_ * 895395433;
			Class511.anInt5955 = 681202613 * i_34_;
			Class544.anInt6257 = -826955353 * i_35_;
			if (bool && 1945660951 * Class544.anInt6257 >= 100) {
				Class471.anInt5612 = 1671718400 * Class204_Sub1.anInt8947 + -1606845184;
				Class325_Sub3.anInt7484 = -1604758784 + Class151.anInt6671 * 1268332032;
				Gfx.anInt578 = ((Class431.method5342(Class471.anInt5612 * -1795110955, (1947030235 * Class325_Sub3.anInt7484), Class85.anInt712 * -127654579, 1996761881) - 1521043929 * Class432_Sub1_Sub5_Sub1.anInt9963) * -568170765);
			}
			Class147.anInt1621 = -1659001381;
			Class439.anInt4456 = 1180637393;
			Class457.anInt6844 = 1651776935;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sc.ho(").append(')').toString());
		}
	}

	static final void method5588(Class430 class430, int i) {
		try {
			Class330_Sub18.method3342(true, -1060259017);
			client.aClass304_9030.method3032(2010795984);
			Class435.method5568(2080594140);
			client.aBoolean9194 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sc.apt(").append(')').toString());
		}
	}

	static int method5589(Class401_Sub1 class401_sub1, Class401_Sub1 class401_sub1_37_, int i, boolean bool, int i_38_) {
		try {
			if (i == 1) {
				int i_39_ = class401_sub1.anInt4133 * -1767069987;
				int i_40_ = -1767069987 * class401_sub1_37_.anInt4133;
				if (!bool) {
					if (-1 == i_39_)
						i_39_ = 2001;
					if (-1 == i_40_)
						i_40_ = 2001;
				}
				return i_39_ - i_40_;
			}
			if (2 == i)
				return Class145.method1725((class401_sub1.method4720(340999652).aString4107), (class401_sub1_37_.method4720(399957554).aString4107), Class429.aClass454_4369, -976946917);
			if (i == 3) {
				if (class401_sub1.aString8246.equals("-")) {
					if (class401_sub1_37_.aString8246.equals("-"))
						return 0;
					return bool ? -1 : 1;
				}
				if (class401_sub1_37_.aString8246.equals("-"))
					return bool ? 1 : -1;
				return Class145.method1725(class401_sub1.aString8246, class401_sub1_37_.aString8246, Class429.aClass454_4369, -1686677015);
			}
			if (4 == i)
				return (class401_sub1.method4712((byte) 90) ? class401_sub1_37_.method4712((byte) 6) ? 0 : 1 : class401_sub1_37_.method4712((byte) -15) ? -1 : 0);
			if (i == 5)
				return (class401_sub1.method4709(-1921738938) ? class401_sub1_37_.method4709(-1265694133) ? 0 : 1 : class401_sub1_37_.method4709(-1311720046) ? -1 : 0);
			if (6 == i)
				return (class401_sub1.method4710((byte) 113) ? class401_sub1_37_.method4710((byte) 113) ? 0 : 1 : class401_sub1_37_.method4710((byte) 113) ? -1 : 0);
			if (i == 7)
				return (class401_sub1.method4711((byte) -64) ? class401_sub1_37_.method4711((byte) -3) ? 0 : 1 : class401_sub1_37_.method4711((byte) -33) ? -1 : 0);
			if (i == 8) {
				int i_41_ = class401_sub1.anInt8248 * 284224351;
				int i_42_ = 284224351 * class401_sub1_37_.anInt8248;
				if (bool) {
					if (i_41_ == 1000)
						i_41_ = -1;
					if (1000 == i_42_)
						i_42_ = -1;
				} else {
					if (-1 == i_41_)
						i_41_ = 1000;
					if (-1 == i_42_)
						i_42_ = 1000;
				}
				return i_41_ - i_42_;
			}
			return (class401_sub1.anInt8245 * -1759169697 - class401_sub1_37_.anInt8245 * -1759169697);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sc.b(").append(')').toString());
		}
	}

	static final void method5590(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sc.agi(").append(')').toString());
		}
	}
}
