/* Class_ra_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class Class_ra_Sub3 extends Class_ra {
	int anInt8614;
	int anInt8615;
	boolean aBoolean8616;
	float[][] aFloatArrayArray8617;
	int anInt8618;
	int anInt8619;
	float[] aFloatArray8620;
	int anInt8621;
	int anInt8622;
	int anInt8623;
	int anInt8624;
	int anInt8625;
	int anInt8626;
	int anInt8627;
	int anInt8628;
	Class247 aClass247_8629;
	int[] anIntArray8630;
	Class61 aClass61_8631;
	Class249 aClass249_8632;
	Class249 aClass249_8633;
	Class249 aClass249_8634;
	int anInt8635;
	int anInt8636;
	float aFloat8637;
	int anInt8638;
	float aFloat8639;
	float aFloat8640;
	float aFloat8641;
	float aFloat8642;
	float aFloat8643;
	Class367 aClass367_8644;
	int anInt8645;
	int anInt8646;
	Class6[] aClass6Array8647;
	boolean aBoolean8648 = false;
	Class367 aClass367_8649;
	int anInt8650;
	int anInt8651;
	public static Class330_Sub39 aClass330_Sub39_8652;

	public void L() {
		((Class_ra_Sub3) this).anInt8621 = 0;
		((Class_ra_Sub3) this).anInt8623 = 0;
		((Class_ra_Sub3) this).anInt8635 = ((Class_ra_Sub3) this).anInt8618 * 1677671663;
		((Class_ra_Sub3) this).anInt8624 = -1710096567 * ((Class_ra_Sub3) this).anInt8619;
		method5195();
	}

	Class_ra_Sub3(Interface_ma interface_ma) {
		super(interface_ma);
		((Class_ra_Sub3) this).aBoolean8616 = false;
		((Class_ra_Sub3) this).anInt8621 = 0;
		((Class_ra_Sub3) this).anInt8635 = 0;
		((Class_ra_Sub3) this).anInt8623 = 0;
		((Class_ra_Sub3) this).anInt8624 = 0;
		((Class_ra_Sub3) this).anInt8628 = -749379659;
		((Class_ra_Sub3) this).anInt8646 = 797653894;
		((Class_ra_Sub3) this).anInt8645 = 2136332630;
		((Class_ra_Sub3) this).aFloatArrayArray8617 = new float[6][4];
		((Class_ra_Sub3) this).aFloat8637 = 1.0F;
		((Class_ra_Sub3) this).aFloat8639 = 0.0F;
		((Class_ra_Sub3) this).aClass367_8649 = new Class367(16);
		((Class_ra_Sub3) this).anInt8651 = -1024940763;
		try {
			((Class_ra_Sub3) this).aClass367_8644 = new Class367(6291456, 256);
			((Class_ra_Sub3) this).aClass247_8629 = new Class247();
			((Class_ra_Sub3) this).aClass249_8632 = new Class249();
			((Class_ra_Sub3) this).aClass249_8633 = new Class249();
			((Class_ra_Sub3) this).aClass249_8634 = new Class249();
			method5199(1);
			method5208(0);
			Class318.method3166(true, true, -1368286637);
			((Class_ra_Sub3) this).aBoolean8616 = true;
			((Class_ra_Sub3) this).anInt8615 = (int) Class312.method3111((byte) 88) * 79801423;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method4781(628001038);
			throw new RuntimeException("");
		}
	}

	public void ga(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null && (i >= ((Class_ra_Sub3) this).anInt8621 * 512290825 && i < -1071049483 * ((Class_ra_Sub3) this).anInt8635)) {
			if (i_0_ < ((Class_ra_Sub3) this).anInt8623 * -1679642481) {
				i_1_ -= ((Class_ra_Sub3) this).anInt8623 * -1679642481 - i_0_;
				i_0_ = -1679642481 * ((Class_ra_Sub3) this).anInt8623;
			}
			if (i_1_ + i_0_ > ((Class_ra_Sub3) this).anInt8624 * 31822541)
				i_1_ = ((Class_ra_Sub3) this).anInt8624 * 31822541 - i_0_;
			int i_4_ = i + -1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_0_;
			int i_5_ = i_2_ >>> 24;
			if (i_3_ == 0 || 1 == i_3_ && i_5_ == 255) {
				for (int i_6_ = 0; i_6_ < i_1_; i_6_++)
					((Class_ra_Sub3) this).anIntArray8630[i_4_ + i_6_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618)] = i_2_;
			} else if (1 == i_3_) {
				i_2_ = ((i_5_ << 24) + (((i_2_ & 0xff00ff) * i_5_ >> 8 & 0xff00ff) + ((i_2_ & 0xff00) * i_5_ >> 8 & 0xff00)));
				int i_7_ = 256 - i_5_;
				for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
					int i_9_ = i_4_ + (((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_8_);
					int i_10_ = ((Class_ra_Sub3) this).anIntArray8630[i_9_];
					i_10_ = ((i_7_ * (i_10_ & 0xff00) >> 8 & 0xff00) + (i_7_ * (i_10_ & 0xff00ff) >> 8 & 0xff00ff));
					((Class_ra_Sub3) this).anIntArray8630[i_9_] = i_10_ + i_2_;
				}
			} else if (2 == i_3_) {
				for (int i_11_ = 0; i_11_ < i_1_; i_11_++) {
					int i_12_ = (i_11_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933) + i_4_);
					int i_13_ = ((Class_ra_Sub3) this).anIntArray8630[i_12_];
					int i_14_ = i_13_ + i_2_;
					int i_15_ = (i_2_ & 0xff00ff) + (i_13_ & 0xff00ff);
					i_13_ = (i_14_ - i_15_ & 0x10000) + (i_15_ & 0x1000100);
					((Class_ra_Sub3) this).anIntArray8630[i_12_] = i_14_ - i_13_ | i_13_ - (i_13_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void w(int i, int i_16_) throws Exception_Sub1 {
		aClass76_Sub1_4234.method883(i, i_16_);
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) -22105);
	}

	public void G(int i, int i_17_, int i_18_, int i_19_, int i_20_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null && (i >= ((Class_ra_Sub3) this).anInt8621 * 512290825 && i < -1071049483 * ((Class_ra_Sub3) this).anInt8635)) {
			if (i_17_ < ((Class_ra_Sub3) this).anInt8623 * -1679642481) {
				i_18_ -= ((Class_ra_Sub3) this).anInt8623 * -1679642481 - i_17_;
				i_17_ = -1679642481 * ((Class_ra_Sub3) this).anInt8623;
			}
			if (i_18_ + i_17_ > ((Class_ra_Sub3) this).anInt8624 * 31822541)
				i_18_ = ((Class_ra_Sub3) this).anInt8624 * 31822541 - i_17_;
			int i_21_ = i + -1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_17_;
			int i_22_ = i_19_ >>> 24;
			if (i_20_ == 0 || 1 == i_20_ && i_22_ == 255) {
				for (int i_23_ = 0; i_23_ < i_18_; i_23_++)
					((Class_ra_Sub3) this).anIntArray8630[i_21_ + i_23_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618)] = i_19_;
			} else if (1 == i_20_) {
				i_19_ = ((i_22_ << 24) + (((i_19_ & 0xff00ff) * i_22_ >> 8 & 0xff00ff) + ((i_19_ & 0xff00) * i_22_ >> 8 & 0xff00)));
				int i_24_ = 256 - i_22_;
				for (int i_25_ = 0; i_25_ < i_18_; i_25_++) {
					int i_26_ = i_21_ + (((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_25_);
					int i_27_ = ((Class_ra_Sub3) this).anIntArray8630[i_26_];
					i_27_ = ((i_24_ * (i_27_ & 0xff00) >> 8 & 0xff00) + (i_24_ * (i_27_ & 0xff00ff) >> 8 & 0xff00ff));
					((Class_ra_Sub3) this).anIntArray8630[i_26_] = i_27_ + i_19_;
				}
			} else if (2 == i_20_) {
				for (int i_28_ = 0; i_28_ < i_18_; i_28_++) {
					int i_29_ = (i_28_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933) + i_21_);
					int i_30_ = ((Class_ra_Sub3) this).anIntArray8630[i_29_];
					int i_31_ = i_30_ + i_19_;
					int i_32_ = (i_19_ & 0xff00ff) + (i_30_ & 0xff00ff);
					i_30_ = (i_31_ - i_32_ & 0x10000) + (i_32_ & 0x1000100);
					((Class_ra_Sub3) this).anIntArray8630[i_29_] = i_31_ - i_30_ | i_30_ - (i_30_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public Interface8_Impl1_Impl1 kb(int i, int i_33_, int i_34_) {
		return new Class43(i, i_33_);
	}

	public void g(int i) {
		int i_35_ = i - -2005538129 * ((Class_ra_Sub3) this).anInt8615;
		for (Class330_Sub13 class330_sub13 = (Class330_Sub13) ((Class_ra_Sub3) this).aClass367_8644.method4287(-597749787); null != class330_sub13; class330_sub13 = (Class330_Sub13) ((Class_ra_Sub3) this).aClass367_8644.method4291(-1947425629)) {
			if (((Class330_Sub13) class330_sub13).aBoolean7602) {
				((Class330_Sub13) class330_sub13).anInt7604 += i_35_;
				int i_36_ = ((Class330_Sub13) class330_sub13).anInt7604 / 50;
				if (i_36_ > 0) {
					Class56 class56 = anInterface_ma4227.method221((((Class330_Sub13) class330_sub13).anInt7601), -153326671);
					float f = (float) (-1963453415 * class56.anInt532);
					class330_sub13.method3310((int) (f * ((float) i_35_ / 1000.0F * (float) class56.aByte531 / 64.0F)), (int) ((float) class56.aByte530 * ((float) i_35_ / 1000.0F) / 64.0F * f));
					((Class330_Sub13) class330_sub13).anInt7604 -= i_36_ * 50;
				}
				((Class330_Sub13) class330_sub13).aBoolean7602 = false;
			}
		}
		((Class_ra_Sub3) this).anInt8615 = i * 79801423;
		((Class_ra_Sub3) this).aClass367_8649.method4292(5, (byte) 53);
		((Class_ra_Sub3) this).aClass367_8644.method4292(5, (byte) 5);
	}

	public int za() {
		return 0;
	}

	boolean method5187() {
		return ((Class_ra_Sub3) this).aBoolean8648;
	}

	void method5188() {
		((Class_ra_Sub3) this).aClass249_8632.method2508(((Class_ra_Sub3) this).aClass247_8629);
		((Class_ra_Sub3) this).aClass249_8634.method2510(((Class_ra_Sub3) this).aClass249_8632);
		((Class_ra_Sub3) this).aClass249_8634.method2483(((Class_ra_Sub3) this).aClass249_8633);
		((Class_ra_Sub3) this).aClass249_8634.method2499(((Class_ra_Sub3) this).aFloatArrayArray8617[0]);
		((Class_ra_Sub3) this).aClass249_8634.method2500(((Class_ra_Sub3) this).aFloatArrayArray8617[1]);
		((Class_ra_Sub3) this).aClass249_8634.method2497(((Class_ra_Sub3) this).aFloatArrayArray8617[2]);
		((Class_ra_Sub3) this).aClass249_8634.method2515(((Class_ra_Sub3) this).aFloatArrayArray8617[3]);
		((Class_ra_Sub3) this).aClass249_8634.method2512(((Class_ra_Sub3) this).aFloatArrayArray8617[4]);
		((Class_ra_Sub3) this).aClass249_8634.method2498(((Class_ra_Sub3) this).aFloatArrayArray8617[5]);
		float f = ((Class_ra_Sub3) this).aClass249_8633.method2496();
		float f_37_ = (((f - 255.0F) * ((Class_ra_Sub3) this).aClass249_8633.aFloatArray2631[10]) + ((Class_ra_Sub3) this).aClass249_8633.aFloatArray2631[14]);
		float f_38_ = (((Class_ra_Sub3) this).aClass249_8633.aFloatArray2631[14] + f * (((Class_ra_Sub3) this).aClass249_8633.aFloatArray2631[10]));
		float f_39_ = f_38_ - f_37_;
		for (int i = 0; i < ((Class_ra_Sub3) this).anInt8650 * -595900225; i++) {
			Class6 class6 = ((Class_ra_Sub3) this).aClass6Array8647[i];
			((Class6) class6).aFloat87 = f_37_;
			((Class6) class6).aFloat104 = f_39_;
		}
	}

	boolean method5189(int i) {
		Class56 class56 = anInterface_ma4227.method221(i, 1602848613);
		return anInterface_ma4227.method237(i, Class377.aClass377_3935, 0.7F, -1963453415 * class56.anInt532, -1963453415 * class56.anInt532, true, 2136268831);
	}

	int method5190(int i) {
		return (anInterface_ma4227.method221(i, 1785397636).anInt532 * -1963453415);
	}

	Class369 method5191(int i) {
		return anInterface_ma4227.method221(i, 1805175994).aClass369_524;
	}

	int method5192(int i) {
		return anInterface_ma4227.method221(i, -1397727724).aShort523 & 0xffff;
	}

	boolean method5193(int i) {
		return (anInterface_ma4227.method221(i, -1141970423).aBoolean536 || anInterface_ma4227.method221(i, 1558671525).aBoolean537);
	}

	public boolean a() {
		return false;
	}

	public boolean e() {
		return false;
	}

	public boolean t() {
		return true;
	}

	public Class387 hs(Model class98, int i, int i_40_, int i_41_, int i_42_) {
		return new Class387_Sub3(this, class98, i, i_41_, i_42_, i_40_);
	}

	public boolean en() {
		return false;
	}

	public boolean y() {
		return false;
	}

	void method5194(int i, int i_43_, int[] is, float[] fs) {
		((Class_ra_Sub3) this).anInt8618 = -29235085 * i;
		((Class_ra_Sub3) this).anInt8619 = i_43_ * 1870465245;
		((Class_ra_Sub3) this).anIntArray8630 = is;
		((Class_ra_Sub3) this).aFloatArray8620 = fs;
		for (int i_44_ = 0; i_44_ < -595900225 * ((Class_ra_Sub3) this).anInt8650; i_44_++)
			((Class_ra_Sub3) this).aClass6Array8647[i_44_].method401(-1526325919);
		L();
		au();
	}

	public boolean al() {
		return false;
	}

	public void fw(int i, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_) {
		if (null != ((Class_ra_Sub3) this).anIntArray8630) {
			if (i < ((Class_ra_Sub3) this).anInt8621 * 512290825) {
				i_46_ -= ((Class_ra_Sub3) this).anInt8621 * 512290825 - i;
				i = 512290825 * ((Class_ra_Sub3) this).anInt8621;
			}
			if (i_45_ < ((Class_ra_Sub3) this).anInt8623 * -1679642481) {
				i_47_ -= ((Class_ra_Sub3) this).anInt8623 * -1679642481 - i_45_;
				i_45_ = -1679642481 * ((Class_ra_Sub3) this).anInt8623;
			}
			if (i_46_ + i > ((Class_ra_Sub3) this).anInt8635 * -1071049483)
				i_46_ = -1071049483 * ((Class_ra_Sub3) this).anInt8635 - i;
			if (i_45_ + i_47_ > ((Class_ra_Sub3) this).anInt8624 * 31822541)
				i_47_ = 31822541 * ((Class_ra_Sub3) this).anInt8624 - i_45_;
			if (i_46_ > 0 && i_47_ > 0 && i <= -1071049483 * ((Class_ra_Sub3) this).anInt8635 && i_45_ <= ((Class_ra_Sub3) this).anInt8624 * 31822541) {
				int i_50_ = ((Class_ra_Sub3) this).anInt8618 * -1504772933 - i_46_;
				int i_51_ = i + i_45_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618);
				int i_52_ = i_48_ >>> 24;
				if (0 == i_49_ || i_49_ == 1 && i_52_ == 255) {
					int i_53_ = i_46_ >> 3;
					int i_54_ = i_46_ & 0x7;
					i_46_ = i_51_ - 1;
					for (int i_55_ = -i_47_; i_55_ < 0; i_55_++) {
						if (i_53_ > 0) {
							i = i_53_;
							do {
								((Class_ra_Sub3) this).anIntArray8630[++i_46_] = i_48_;
								((Class_ra_Sub3) this).anIntArray8630[++i_46_] = i_48_;
								((Class_ra_Sub3) this).anIntArray8630[++i_46_] = i_48_;
								((Class_ra_Sub3) this).anIntArray8630[++i_46_] = i_48_;
								((Class_ra_Sub3) this).anIntArray8630[++i_46_] = i_48_;
								((Class_ra_Sub3) this).anIntArray8630[++i_46_] = i_48_;
								((Class_ra_Sub3) this).anIntArray8630[++i_46_] = i_48_;
								((Class_ra_Sub3) this).anIntArray8630[++i_46_] = i_48_;
							} while (--i > 0);
						}
						if (i_54_ > 0) {
							i = i_54_;
							do
								((Class_ra_Sub3) this).anIntArray8630[++i_46_] = i_48_;
							while (--i > 0);
						}
						i_46_ += i_50_;
					}
				} else if (i_49_ == 1) {
					i_48_ = ((((i_48_ & ~0xff00ff) >>> 8) * i_52_ & ~0xff00ff) + (i_52_ * (i_48_ & 0xff00ff) >> 8 & 0xff00ff));
					int i_56_ = 256 - i_52_;
					for (int i_57_ = 0; i_57_ < i_47_; i_57_++) {
						for (int i_58_ = -i_46_; i_58_ < 0; i_58_++) {
							int i_59_ = ((Class_ra_Sub3) this).anIntArray8630[i_51_];
							i_59_ = (((i_59_ & 0xff00ff) * i_56_ >> 8 & 0xff00ff) + (((i_59_ & ~0xff00ff) >>> 8) * i_56_ & ~0xff00ff));
							((Class_ra_Sub3) this).anIntArray8630[i_51_++] = i_48_ + i_59_;
						}
						i_51_ += i_50_;
					}
				} else if (2 == i_49_) {
					for (int i_60_ = 0; i_60_ < i_47_; i_60_++) {
						for (int i_61_ = -i_46_; i_61_ < 0; i_61_++) {
							int i_62_ = ((Class_ra_Sub3) this).anIntArray8630[i_51_];
							int i_63_ = i_48_ + i_62_;
							int i_64_ = (i_48_ & 0xff00ff) + (i_62_ & 0xff00ff);
							i_62_ = (i_63_ - i_64_ & 0x10000) + (i_64_ & 0x1000100);
							((Class_ra_Sub3) this).anIntArray8630[i_51_++] = i_63_ - i_62_ | i_62_ - (i_62_ >>> 8);
						}
						i_51_ += i_50_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public boolean aw() {
		return true;
	}

	public void dh(boolean bool) {
		/* empty */
	}

	Class_ra_Sub3(Canvas canvas, Interface_ma interface_ma, int i, int i_65_) {
		this(interface_ma);
		try {
			method4780(canvas, i, i_65_, (short) -15369);
			method4784(canvas, -1246938796);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method4781(628001038);
			throw new RuntimeException("");
		}
	}

	public void ca() {
		/* empty */
	}

	public Class247 cq() {
		return new Class247(((Class_ra_Sub3) this).aClass247_8629);
	}

	public void am() {
		/* empty */
	}

	void iy(float f, float f_66_, float f_67_, float f_68_, float f_69_, float f_70_) {
		/* empty */
	}

	void method5195() {
		int i = (((Class_ra_Sub3) this).anInt8635 * -1071049483 - ((Class_ra_Sub3) this).anInt8621 * 512290825);
		int i_71_ = (((Class_ra_Sub3) this).anInt8624 * 31822541 - ((Class_ra_Sub3) this).anInt8623 * -1679642481);
		float f = (((Class_ra_Sub3) this).aFloat8640 = (float) (52203499 * ((Class_ra_Sub3) this).anInt8638) / 2.0F);
		float f_72_ = (((Class_ra_Sub3) this).aFloat8642 = (float) (1426128991 * ((Class_ra_Sub3) this).anInt8614) / 2.0F);
		((Class_ra_Sub3) this).aFloat8641 = (float) (960350685 * ((Class_ra_Sub3) this).anInt8636) + f;
		((Class_ra_Sub3) this).aFloat8643 = (float) (1359775523 * ((Class_ra_Sub3) this).anInt8622) + f_72_;
		for (int i_73_ = 0; i_73_ < ((Class_ra_Sub3) this).anInt8650 * -595900225; i_73_++) {
			Class6 class6 = ((Class_ra_Sub3) this).aClass6Array8647[i_73_];
			Class38 class38 = ((Class6) class6).aClass38_94;
			((Class38) class38).aFloat391 = f;
			((Class38) class38).aFloat420 = f_72_;
			((Class38) class38).aFloat411 = (((Class_ra_Sub3) this).aFloat8641 - (float) (512290825 * ((Class_ra_Sub3) this).anInt8621));
			((Class38) class38).aFloat392 = (((Class_ra_Sub3) this).aFloat8643 - (float) (((Class_ra_Sub3) this).anInt8623 * -1679642481));
			((Class38) class38).anInt396 = i;
			((Class38) class38).anInt397 = i_71_;
		}
		int i_74_ = (512290825 * ((Class_ra_Sub3) this).anInt8621 + (((Class_ra_Sub3) this).anInt8623 * -1679642481 * (((Class_ra_Sub3) this).anInt8618 * -1504772933)));
		for (int i_75_ = -1679642481 * ((Class_ra_Sub3) this).anInt8623; i_75_ < ((Class_ra_Sub3) this).anInt8624 * 31822541; i_75_++) {
			for (int i_76_ = 0; i_76_ < ((Class_ra_Sub3) this).anInt8650 * -595900225; i_76_++)
				((Class38) ((Class6) (((Class_ra_Sub3) this).aClass6Array8647[i_76_])).aClass38_94).anIntArray389[i_75_ - ((Class_ra_Sub3) this).anInt8623 * -1679642481] = i_74_;
			i_74_ += ((Class_ra_Sub3) this).anInt8618 * -1504772933;
		}
	}

	void method5196(boolean bool, boolean bool_77_, boolean bool_78_, Class325_Sub3_Sub1 class325_sub3_sub1, int i, int i_79_, float f, int i_80_) {
		int i_81_ = class325_sub3_sub1.anInt9492;
		int i_82_ = i_80_;
		i_80_ <<= 1;
		if (-1 == i_81_)
			method5210(bool_77_, i, i_79_, f, i_82_, class325_sub3_sub1.anInt9490, 1);
		else {
			if (i_81_ != ((Class_ra_Sub3) this).anInt8651 * 29299027) {
				Class61 class61 = (Class61) ((Class_ra_Sub3) this).aClass367_8649.get((long) i_81_);
				if (class61 == null) {
					int[] is = method5209(i_81_);
					if (is != null) {
						int i_83_ = ((anInterface_ma4227.method221(i_81_, 781652132).anInt532) * -1963453415);
						class61 = method4795(is, 0, i_83_, i_83_, i_83_, (byte) -67);
						((Class_ra_Sub3) this).aClass367_8649.put(class61, (long) i_81_);
					} else
						return;
				}
				((Class_ra_Sub3) this).anInt8651 = 1024940763 * i_81_;
				((Class_ra_Sub3) this).aClass61_8631 = class61;
			}
			i_80_++;
			((Class61_Sub3) ((Class_ra_Sub3) this).aClass61_8631).method742(bool, bool_77_, bool_78_, i - i_82_, i_79_ - i_82_, f, i_80_, i_80_, 0, class325_sub3_sub1.anInt9490, 1, 1, false);
		}
	}

	public void id() {
		/* empty */
	}

	public void GA(float f, float f_84_) {
		((Class_ra_Sub3) this).aFloat8637 = f_84_ - f;
		((Class_ra_Sub3) this).aFloat8639 = f + f_84_ - 1.0F;
		for (int i = 0; i < -595900225 * ((Class_ra_Sub3) this).anInt8650; i++) {
			Class6 class6 = ((Class_ra_Sub3) this).aClass6Array8647[i];
			Class38 class38 = ((Class6) class6).aClass38_94;
			((Class38) class38).aFloat395 = ((Class_ra_Sub3) this).aFloat8637;
			((Class38) class38).aFloat394 = ((Class_ra_Sub3) this).aFloat8639;
		}
	}

	void gn(int i, int i_85_, int i_86_, int i_87_, int i_88_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null) {
			if (i_86_ < 0)
				i_86_ = -i_86_;
			int i_89_ = i_85_ - i_86_;
			if (i_89_ < ((Class_ra_Sub3) this).anInt8623 * -1679642481)
				i_89_ = ((Class_ra_Sub3) this).anInt8623 * -1679642481;
			int i_90_ = i_86_ + i_85_ + 1;
			if (i_90_ > ((Class_ra_Sub3) this).anInt8624 * 31822541)
				i_90_ = 31822541 * ((Class_ra_Sub3) this).anInt8624;
			int i_91_ = i_89_;
			int i_92_ = i_86_ * i_86_;
			int i_93_ = 0;
			int i_94_ = i_85_ - i_91_;
			int i_95_ = i_94_ * i_94_;
			int i_96_ = i_95_ - i_94_;
			if (i_85_ > i_90_)
				i_85_ = i_90_;
			int i_97_ = i_87_ >>> 24;
			if (0 == i_88_ || 1 == i_88_ && i_97_ == 255) {
				while (i_91_ < i_85_) {
					for (/**/; i_96_ <= i_92_ || i_95_ <= i_92_; i_96_ += i_93_++ + i_93_)
						i_95_ += i_93_ + i_93_;
					int i_98_ = 1 + (i - i_93_);
					if (i_98_ < ((Class_ra_Sub3) this).anInt8621 * 512290825)
						i_98_ = 512290825 * ((Class_ra_Sub3) this).anInt8621;
					int i_99_ = i + i_93_;
					if (i_99_ > -1071049483 * ((Class_ra_Sub3) this).anInt8635)
						i_99_ = ((Class_ra_Sub3) this).anInt8635 * -1071049483;
					int i_100_ = i_98_ + (-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_91_);
					for (int i_101_ = i_98_; i_101_ < i_99_; i_101_++)
						((Class_ra_Sub3) this).anIntArray8630[i_100_++] = i_87_;
					i_91_++;
					i_95_ -= i_94_-- + i_94_;
					i_96_ -= i_94_ + i_94_;
				}
				i_93_ = i_86_;
				i_94_ = i_91_ - i_85_;
				i_96_ = i_94_ * i_94_ + i_92_;
				i_95_ = i_96_ - i_93_;
				i_96_ -= i_94_;
				while (i_91_ < i_90_) {
					for (/**/; i_96_ > i_92_ && i_95_ > i_92_; i_95_ -= i_93_ + i_93_)
						i_96_ -= i_93_-- + i_93_;
					int i_102_ = i - i_93_;
					if (i_102_ < ((Class_ra_Sub3) this).anInt8621 * 512290825)
						i_102_ = ((Class_ra_Sub3) this).anInt8621 * 512290825;
					int i_103_ = i + i_93_;
					if (i_103_ > -1071049483 * ((Class_ra_Sub3) this).anInt8635 - 1)
						i_103_ = (((Class_ra_Sub3) this).anInt8635 * -1071049483 - 1);
					int i_104_ = i_102_ + (-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_91_);
					for (int i_105_ = i_102_; i_105_ <= i_103_; i_105_++)
						((Class_ra_Sub3) this).anIntArray8630[i_104_++] = i_87_;
					i_91_++;
					i_96_ += i_94_ + i_94_;
					i_95_ += i_94_++ + i_94_;
				}
			} else if (1 == i_88_) {
				i_87_ = ((i_97_ * (i_87_ & 0xff00) >> 8 & 0xff00) + ((i_87_ & 0xff00ff) * i_97_ >> 8 & 0xff00ff) + (i_97_ << 24));
				int i_106_ = 256 - i_97_;
				while (i_91_ < i_85_) {
					for (/**/; i_96_ <= i_92_ || i_95_ <= i_92_; i_96_ += i_93_++ + i_93_)
						i_95_ += i_93_ + i_93_;
					int i_107_ = 1 + (i - i_93_);
					if (i_107_ < ((Class_ra_Sub3) this).anInt8621 * 512290825)
						i_107_ = 512290825 * ((Class_ra_Sub3) this).anInt8621;
					int i_108_ = i + i_93_;
					if (i_108_ > ((Class_ra_Sub3) this).anInt8635 * -1071049483)
						i_108_ = -1071049483 * ((Class_ra_Sub3) this).anInt8635;
					int i_109_ = (i_91_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618) + i_107_);
					for (int i_110_ = i_107_; i_110_ < i_108_; i_110_++) {
						int i_111_ = ((Class_ra_Sub3) this).anIntArray8630[i_109_];
						i_111_ = (((i_111_ & 0xff00ff) * i_106_ >> 8 & 0xff00ff) + ((i_111_ & 0xff00) * i_106_ >> 8 & 0xff00));
						((Class_ra_Sub3) this).anIntArray8630[i_109_++] = i_111_ + i_87_;
					}
					i_91_++;
					i_95_ -= i_94_-- + i_94_;
					i_96_ -= i_94_ + i_94_;
				}
				i_93_ = i_86_;
				i_94_ = -i_94_;
				i_96_ = i_92_ + i_94_ * i_94_;
				i_95_ = i_96_ - i_93_;
				i_96_ -= i_94_;
				while (i_91_ < i_90_) {
					for (/**/; i_96_ > i_92_ && i_95_ > i_92_; i_95_ -= i_93_ + i_93_)
						i_96_ -= i_93_-- + i_93_;
					int i_112_ = i - i_93_;
					if (i_112_ < 512290825 * ((Class_ra_Sub3) this).anInt8621)
						i_112_ = 512290825 * ((Class_ra_Sub3) this).anInt8621;
					int i_113_ = i + i_93_;
					if (i_113_ > ((Class_ra_Sub3) this).anInt8635 * -1071049483 - 1)
						i_113_ = (((Class_ra_Sub3) this).anInt8635 * -1071049483 - 1);
					int i_114_ = i_112_ + (-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_91_);
					for (int i_115_ = i_112_; i_115_ <= i_113_; i_115_++) {
						int i_116_ = ((Class_ra_Sub3) this).anIntArray8630[i_114_];
						i_116_ = ((i_106_ * (i_116_ & 0xff00ff) >> 8 & 0xff00ff) + (i_106_ * (i_116_ & 0xff00) >> 8 & 0xff00));
						((Class_ra_Sub3) this).anIntArray8630[i_114_++] = i_87_ + i_116_;
					}
					i_91_++;
					i_96_ += i_94_ + i_94_;
					i_95_ += i_94_++ + i_94_;
				}
			} else if (2 == i_88_) {
				while (i_91_ < i_85_) {
					for (/**/; i_96_ <= i_92_ || i_95_ <= i_92_; i_96_ += i_93_++ + i_93_)
						i_95_ += i_93_ + i_93_;
					int i_117_ = 1 + (i - i_93_);
					if (i_117_ < 512290825 * ((Class_ra_Sub3) this).anInt8621)
						i_117_ = 512290825 * ((Class_ra_Sub3) this).anInt8621;
					int i_118_ = i + i_93_;
					if (i_118_ > ((Class_ra_Sub3) this).anInt8635 * -1071049483)
						i_118_ = -1071049483 * ((Class_ra_Sub3) this).anInt8635;
					int i_119_ = ((((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_91_) + i_117_);
					for (int i_120_ = i_117_; i_120_ < i_118_; i_120_++) {
						int i_121_ = ((Class_ra_Sub3) this).anIntArray8630[i_119_];
						int i_122_ = i_87_ + i_121_;
						int i_123_ = (i_121_ & 0xff00ff) + (i_87_ & 0xff00ff);
						i_121_ = (i_122_ - i_123_ & 0x10000) + (i_123_ & 0x1000100);
						((Class_ra_Sub3) this).anIntArray8630[i_119_++] = i_122_ - i_121_ | i_121_ - (i_121_ >>> 8);
					}
					i_91_++;
					i_95_ -= i_94_-- + i_94_;
					i_96_ -= i_94_ + i_94_;
				}
				i_93_ = i_86_;
				i_94_ = -i_94_;
				i_96_ = i_92_ + i_94_ * i_94_;
				i_95_ = i_96_ - i_93_;
				i_96_ -= i_94_;
				while (i_91_ < i_90_) {
					for (/**/; i_96_ > i_92_ && i_95_ > i_92_; i_95_ -= i_93_ + i_93_)
						i_96_ -= i_93_-- + i_93_;
					int i_124_ = i - i_93_;
					if (i_124_ < ((Class_ra_Sub3) this).anInt8621 * 512290825)
						i_124_ = ((Class_ra_Sub3) this).anInt8621 * 512290825;
					int i_125_ = i_93_ + i;
					if (i_125_ > ((Class_ra_Sub3) this).anInt8635 * -1071049483 - 1)
						i_125_ = (-1071049483 * ((Class_ra_Sub3) this).anInt8635 - 1);
					int i_126_ = (i_91_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618) + i_124_);
					for (int i_127_ = i_124_; i_127_ <= i_125_; i_127_++) {
						int i_128_ = ((Class_ra_Sub3) this).anIntArray8630[i_126_];
						int i_129_ = i_87_ + i_128_;
						int i_130_ = (i_87_ & 0xff00ff) + (i_128_ & 0xff00ff);
						i_128_ = (i_129_ - i_130_ & 0x10000) + (i_130_ & 0x1000100);
						((Class_ra_Sub3) this).anIntArray8630[i_126_++] = i_129_ - i_128_ | i_128_ - (i_128_ >>> 8);
					}
					i_91_++;
					i_96_ += i_94_ + i_94_;
					i_95_ += i_94_++ + i_94_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void jc(float f, float f_131_, float f_132_, float f_133_, float f_134_, float f_135_) {
		/* empty */
	}

	void method5197() {
		if (null != ((Class_ra_Sub3) this).aFloatArray8620) {
			if (((Class_ra_Sub3) this).anInt8621 * 512290825 == 0 && (-1504772933 * ((Class_ra_Sub3) this).anInt8618 == -1071049483 * ((Class_ra_Sub3) this).anInt8635) && 0 == ((Class_ra_Sub3) this).anInt8623 * -1679642481 && (((Class_ra_Sub3) this).anInt8619 * 1229852533 == 31822541 * ((Class_ra_Sub3) this).anInt8624)) {
				int i = ((Class_ra_Sub3) this).aFloatArray8620.length;
				int i_136_ = i - (i & 0x7);
				int i_137_ = 0;
				while (i_137_ < i_136_) {
					((Class_ra_Sub3) this).aFloatArray8620[i_137_++] = 2.14748365E9F;
					((Class_ra_Sub3) this).aFloatArray8620[i_137_++] = 2.14748365E9F;
					((Class_ra_Sub3) this).aFloatArray8620[i_137_++] = 2.14748365E9F;
					((Class_ra_Sub3) this).aFloatArray8620[i_137_++] = 2.14748365E9F;
					((Class_ra_Sub3) this).aFloatArray8620[i_137_++] = 2.14748365E9F;
					((Class_ra_Sub3) this).aFloatArray8620[i_137_++] = 2.14748365E9F;
					((Class_ra_Sub3) this).aFloatArray8620[i_137_++] = 2.14748365E9F;
					((Class_ra_Sub3) this).aFloatArray8620[i_137_++] = 2.14748365E9F;
				}
				while (i_137_ < i)
					((Class_ra_Sub3) this).aFloatArray8620[i_137_++] = 2.14748365E9F;
			} else {
				int i = (((Class_ra_Sub3) this).anInt8635 * -1071049483 - 512290825 * ((Class_ra_Sub3) this).anInt8621);
				int i_138_ = (((Class_ra_Sub3) this).anInt8624 * 31822541 - ((Class_ra_Sub3) this).anInt8623 * -1679642481);
				int i_139_ = -1504772933 * ((Class_ra_Sub3) this).anInt8618 - i;
				int i_140_ = (((Class_ra_Sub3) this).anInt8621 * 512290825 + (((Class_ra_Sub3) this).anInt8623 * -1679642481 * (-1504772933 * ((Class_ra_Sub3) this).anInt8618)));
				int i_141_ = i >> 3;
				int i_142_ = i & 0x7;
				i = i_140_ - 1;
				for (int i_143_ = -i_138_; i_143_ < 0; i_143_++) {
					if (i_141_ > 0) {
						int i_144_ = i_141_;
						do {
							((Class_ra_Sub3) this).aFloatArray8620[++i] = 2.14748365E9F;
							((Class_ra_Sub3) this).aFloatArray8620[++i] = 2.14748365E9F;
							((Class_ra_Sub3) this).aFloatArray8620[++i] = 2.14748365E9F;
							((Class_ra_Sub3) this).aFloatArray8620[++i] = 2.14748365E9F;
							((Class_ra_Sub3) this).aFloatArray8620[++i] = 2.14748365E9F;
							((Class_ra_Sub3) this).aFloatArray8620[++i] = 2.14748365E9F;
							((Class_ra_Sub3) this).aFloatArray8620[++i] = 2.14748365E9F;
							((Class_ra_Sub3) this).aFloatArray8620[++i] = 2.14748365E9F;
						} while (--i_144_ > 0);
					}
					if (i_142_ > 0) {
						int i_145_ = i_142_;
						do
							((Class_ra_Sub3) this).aFloatArray8620[++i] = 2.14748365E9F;
						while (--i_145_ > 0);
					}
					i += i_139_;
				}
			}
		}
	}

	public void o(int i, int i_146_, int i_147_, int i_148_) {
		if (512290825 * ((Class_ra_Sub3) this).anInt8621 < i)
			((Class_ra_Sub3) this).anInt8621 = 1907727929 * i;
		if (((Class_ra_Sub3) this).anInt8623 * -1679642481 < i_146_)
			((Class_ra_Sub3) this).anInt8623 = 766013039 * i_146_;
		if (((Class_ra_Sub3) this).anInt8635 * -1071049483 > i_147_)
			((Class_ra_Sub3) this).anInt8635 = -711985315 * i_147_;
		if (31822541 * ((Class_ra_Sub3) this).anInt8624 > i_148_)
			((Class_ra_Sub3) this).anInt8624 = -550983163 * i_148_;
		method5195();
	}

	public void qa(int[] is) {
		is[0] = 512290825 * ((Class_ra_Sub3) this).anInt8621;
		is[1] = ((Class_ra_Sub3) this).anInt8623 * -1679642481;
		is[2] = -1071049483 * ((Class_ra_Sub3) this).anInt8635;
		is[3] = 31822541 * ((Class_ra_Sub3) this).anInt8624;
	}

	public void ba(int i, int i_149_) {
		if (0 != (i & 0x1))
			B(0, 0, ((Class_ra_Sub3) this).anInt8618 * -1504772933, 1229852533 * ((Class_ra_Sub3) this).anInt8619, i_149_, 0);
		if (0 != (i & 0x2))
			method5197();
	}

	public void kr(boolean bool) {
		Class6 class6 = method5206(Thread.currentThread());
		((Class6) class6).aBoolean111 = bool;
	}

	public void B(int i, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_) {
		if (null != ((Class_ra_Sub3) this).anIntArray8630) {
			if (i < ((Class_ra_Sub3) this).anInt8621 * 512290825) {
				i_151_ -= ((Class_ra_Sub3) this).anInt8621 * 512290825 - i;
				i = 512290825 * ((Class_ra_Sub3) this).anInt8621;
			}
			if (i_150_ < ((Class_ra_Sub3) this).anInt8623 * -1679642481) {
				i_152_ -= ((Class_ra_Sub3) this).anInt8623 * -1679642481 - i_150_;
				i_150_ = -1679642481 * ((Class_ra_Sub3) this).anInt8623;
			}
			if (i_151_ + i > ((Class_ra_Sub3) this).anInt8635 * -1071049483)
				i_151_ = -1071049483 * ((Class_ra_Sub3) this).anInt8635 - i;
			if (i_150_ + i_152_ > ((Class_ra_Sub3) this).anInt8624 * 31822541)
				i_152_ = 31822541 * ((Class_ra_Sub3) this).anInt8624 - i_150_;
			if (i_151_ > 0 && i_152_ > 0 && i <= -1071049483 * ((Class_ra_Sub3) this).anInt8635 && i_150_ <= ((Class_ra_Sub3) this).anInt8624 * 31822541) {
				int i_155_ = ((Class_ra_Sub3) this).anInt8618 * -1504772933 - i_151_;
				int i_156_ = i + i_150_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618);
				int i_157_ = i_153_ >>> 24;
				if (0 == i_154_ || i_154_ == 1 && i_157_ == 255) {
					int i_158_ = i_151_ >> 3;
					int i_159_ = i_151_ & 0x7;
					i_151_ = i_156_ - 1;
					for (int i_160_ = -i_152_; i_160_ < 0; i_160_++) {
						if (i_158_ > 0) {
							i = i_158_;
							do {
								((Class_ra_Sub3) this).anIntArray8630[++i_151_] = i_153_;
								((Class_ra_Sub3) this).anIntArray8630[++i_151_] = i_153_;
								((Class_ra_Sub3) this).anIntArray8630[++i_151_] = i_153_;
								((Class_ra_Sub3) this).anIntArray8630[++i_151_] = i_153_;
								((Class_ra_Sub3) this).anIntArray8630[++i_151_] = i_153_;
								((Class_ra_Sub3) this).anIntArray8630[++i_151_] = i_153_;
								((Class_ra_Sub3) this).anIntArray8630[++i_151_] = i_153_;
								((Class_ra_Sub3) this).anIntArray8630[++i_151_] = i_153_;
							} while (--i > 0);
						}
						if (i_159_ > 0) {
							i = i_159_;
							do
								((Class_ra_Sub3) this).anIntArray8630[++i_151_] = i_153_;
							while (--i > 0);
						}
						i_151_ += i_155_;
					}
				} else if (i_154_ == 1) {
					i_153_ = ((((i_153_ & ~0xff00ff) >>> 8) * i_157_ & ~0xff00ff) + (i_157_ * (i_153_ & 0xff00ff) >> 8 & 0xff00ff));
					int i_161_ = 256 - i_157_;
					for (int i_162_ = 0; i_162_ < i_152_; i_162_++) {
						for (int i_163_ = -i_151_; i_163_ < 0; i_163_++) {
							int i_164_ = (((Class_ra_Sub3) this).anIntArray8630[i_156_]);
							i_164_ = (((i_164_ & 0xff00ff) * i_161_ >> 8 & 0xff00ff) + (((i_164_ & ~0xff00ff) >>> 8) * i_161_ & ~0xff00ff));
							((Class_ra_Sub3) this).anIntArray8630[i_156_++] = i_153_ + i_164_;
						}
						i_156_ += i_155_;
					}
				} else if (2 == i_154_) {
					for (int i_165_ = 0; i_165_ < i_152_; i_165_++) {
						for (int i_166_ = -i_151_; i_166_ < 0; i_166_++) {
							int i_167_ = (((Class_ra_Sub3) this).anIntArray8630[i_156_]);
							int i_168_ = i_153_ + i_167_;
							int i_169_ = (i_153_ & 0xff00ff) + (i_167_ & 0xff00ff);
							i_167_ = (i_168_ - i_169_ & 0x10000) + (i_169_ & 0x1000100);
							((Class_ra_Sub3) this).anIntArray8630[i_156_++] = i_168_ - i_167_ | i_167_ - (i_167_ >>> 8);
						}
						i_156_ += i_155_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void ds() {
		/* empty */
	}

	void CA(int i, int i_170_, int i_171_, int i_172_, int i_173_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null) {
			if (i_171_ < 0)
				i_171_ = -i_171_;
			int i_174_ = i_170_ - i_171_;
			if (i_174_ < ((Class_ra_Sub3) this).anInt8623 * -1679642481)
				i_174_ = ((Class_ra_Sub3) this).anInt8623 * -1679642481;
			int i_175_ = i_171_ + i_170_ + 1;
			if (i_175_ > ((Class_ra_Sub3) this).anInt8624 * 31822541)
				i_175_ = 31822541 * ((Class_ra_Sub3) this).anInt8624;
			int i_176_ = i_174_;
			int i_177_ = i_171_ * i_171_;
			int i_178_ = 0;
			int i_179_ = i_170_ - i_176_;
			int i_180_ = i_179_ * i_179_;
			int i_181_ = i_180_ - i_179_;
			if (i_170_ > i_175_)
				i_170_ = i_175_;
			int i_182_ = i_172_ >>> 24;
			if (0 == i_173_ || 1 == i_173_ && i_182_ == 255) {
				while (i_176_ < i_170_) {
					for (/**/; i_181_ <= i_177_ || i_180_ <= i_177_; i_181_ += i_178_++ + i_178_)
						i_180_ += i_178_ + i_178_;
					int i_183_ = 1 + (i - i_178_);
					if (i_183_ < ((Class_ra_Sub3) this).anInt8621 * 512290825)
						i_183_ = 512290825 * ((Class_ra_Sub3) this).anInt8621;
					int i_184_ = i + i_178_;
					if (i_184_ > -1071049483 * ((Class_ra_Sub3) this).anInt8635)
						i_184_ = ((Class_ra_Sub3) this).anInt8635 * -1071049483;
					int i_185_ = i_183_ + (-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_176_);
					for (int i_186_ = i_183_; i_186_ < i_184_; i_186_++)
						((Class_ra_Sub3) this).anIntArray8630[i_185_++] = i_172_;
					i_176_++;
					i_180_ -= i_179_-- + i_179_;
					i_181_ -= i_179_ + i_179_;
				}
				i_178_ = i_171_;
				i_179_ = i_176_ - i_170_;
				i_181_ = i_179_ * i_179_ + i_177_;
				i_180_ = i_181_ - i_178_;
				i_181_ -= i_179_;
				while (i_176_ < i_175_) {
					for (/**/; i_181_ > i_177_ && i_180_ > i_177_; i_180_ -= i_178_ + i_178_)
						i_181_ -= i_178_-- + i_178_;
					int i_187_ = i - i_178_;
					if (i_187_ < ((Class_ra_Sub3) this).anInt8621 * 512290825)
						i_187_ = ((Class_ra_Sub3) this).anInt8621 * 512290825;
					int i_188_ = i + i_178_;
					if (i_188_ > -1071049483 * ((Class_ra_Sub3) this).anInt8635 - 1)
						i_188_ = (((Class_ra_Sub3) this).anInt8635 * -1071049483 - 1);
					int i_189_ = i_187_ + (-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_176_);
					for (int i_190_ = i_187_; i_190_ <= i_188_; i_190_++)
						((Class_ra_Sub3) this).anIntArray8630[i_189_++] = i_172_;
					i_176_++;
					i_181_ += i_179_ + i_179_;
					i_180_ += i_179_++ + i_179_;
				}
			} else if (1 == i_173_) {
				i_172_ = ((i_182_ * (i_172_ & 0xff00) >> 8 & 0xff00) + ((i_172_ & 0xff00ff) * i_182_ >> 8 & 0xff00ff) + (i_182_ << 24));
				int i_191_ = 256 - i_182_;
				while (i_176_ < i_170_) {
					for (/**/; i_181_ <= i_177_ || i_180_ <= i_177_; i_181_ += i_178_++ + i_178_)
						i_180_ += i_178_ + i_178_;
					int i_192_ = 1 + (i - i_178_);
					if (i_192_ < ((Class_ra_Sub3) this).anInt8621 * 512290825)
						i_192_ = 512290825 * ((Class_ra_Sub3) this).anInt8621;
					int i_193_ = i + i_178_;
					if (i_193_ > ((Class_ra_Sub3) this).anInt8635 * -1071049483)
						i_193_ = -1071049483 * ((Class_ra_Sub3) this).anInt8635;
					int i_194_ = (i_176_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618) + i_192_);
					for (int i_195_ = i_192_; i_195_ < i_193_; i_195_++) {
						int i_196_ = ((Class_ra_Sub3) this).anIntArray8630[i_194_];
						i_196_ = (((i_196_ & 0xff00ff) * i_191_ >> 8 & 0xff00ff) + ((i_196_ & 0xff00) * i_191_ >> 8 & 0xff00));
						((Class_ra_Sub3) this).anIntArray8630[i_194_++] = i_196_ + i_172_;
					}
					i_176_++;
					i_180_ -= i_179_-- + i_179_;
					i_181_ -= i_179_ + i_179_;
				}
				i_178_ = i_171_;
				i_179_ = -i_179_;
				i_181_ = i_177_ + i_179_ * i_179_;
				i_180_ = i_181_ - i_178_;
				i_181_ -= i_179_;
				while (i_176_ < i_175_) {
					for (/**/; i_181_ > i_177_ && i_180_ > i_177_; i_180_ -= i_178_ + i_178_)
						i_181_ -= i_178_-- + i_178_;
					int i_197_ = i - i_178_;
					if (i_197_ < 512290825 * ((Class_ra_Sub3) this).anInt8621)
						i_197_ = 512290825 * ((Class_ra_Sub3) this).anInt8621;
					int i_198_ = i + i_178_;
					if (i_198_ > ((Class_ra_Sub3) this).anInt8635 * -1071049483 - 1)
						i_198_ = (((Class_ra_Sub3) this).anInt8635 * -1071049483 - 1);
					int i_199_ = i_197_ + (-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_176_);
					for (int i_200_ = i_197_; i_200_ <= i_198_; i_200_++) {
						int i_201_ = ((Class_ra_Sub3) this).anIntArray8630[i_199_];
						i_201_ = ((i_191_ * (i_201_ & 0xff00ff) >> 8 & 0xff00ff) + (i_191_ * (i_201_ & 0xff00) >> 8 & 0xff00));
						((Class_ra_Sub3) this).anIntArray8630[i_199_++] = i_172_ + i_201_;
					}
					i_176_++;
					i_181_ += i_179_ + i_179_;
					i_180_ += i_179_++ + i_179_;
				}
			} else if (2 == i_173_) {
				while (i_176_ < i_170_) {
					for (/**/; i_181_ <= i_177_ || i_180_ <= i_177_; i_181_ += i_178_++ + i_178_)
						i_180_ += i_178_ + i_178_;
					int i_202_ = 1 + (i - i_178_);
					if (i_202_ < 512290825 * ((Class_ra_Sub3) this).anInt8621)
						i_202_ = 512290825 * ((Class_ra_Sub3) this).anInt8621;
					int i_203_ = i + i_178_;
					if (i_203_ > ((Class_ra_Sub3) this).anInt8635 * -1071049483)
						i_203_ = -1071049483 * ((Class_ra_Sub3) this).anInt8635;
					int i_204_ = ((((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_176_) + i_202_);
					for (int i_205_ = i_202_; i_205_ < i_203_; i_205_++) {
						int i_206_ = ((Class_ra_Sub3) this).anIntArray8630[i_204_];
						int i_207_ = i_172_ + i_206_;
						int i_208_ = (i_206_ & 0xff00ff) + (i_172_ & 0xff00ff);
						i_206_ = (i_207_ - i_208_ & 0x10000) + (i_208_ & 0x1000100);
						((Class_ra_Sub3) this).anIntArray8630[i_204_++] = i_207_ - i_206_ | i_206_ - (i_206_ >>> 8);
					}
					i_176_++;
					i_180_ -= i_179_-- + i_179_;
					i_181_ -= i_179_ + i_179_;
				}
				i_178_ = i_171_;
				i_179_ = -i_179_;
				i_181_ = i_177_ + i_179_ * i_179_;
				i_180_ = i_181_ - i_178_;
				i_181_ -= i_179_;
				while (i_176_ < i_175_) {
					for (/**/; i_181_ > i_177_ && i_180_ > i_177_; i_180_ -= i_178_ + i_178_)
						i_181_ -= i_178_-- + i_178_;
					int i_209_ = i - i_178_;
					if (i_209_ < ((Class_ra_Sub3) this).anInt8621 * 512290825)
						i_209_ = ((Class_ra_Sub3) this).anInt8621 * 512290825;
					int i_210_ = i_178_ + i;
					if (i_210_ > ((Class_ra_Sub3) this).anInt8635 * -1071049483 - 1)
						i_210_ = (-1071049483 * ((Class_ra_Sub3) this).anInt8635 - 1);
					int i_211_ = (i_176_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618) + i_209_);
					for (int i_212_ = i_209_; i_212_ <= i_210_; i_212_++) {
						int i_213_ = ((Class_ra_Sub3) this).anIntArray8630[i_211_];
						int i_214_ = i_172_ + i_213_;
						int i_215_ = (i_172_ & 0xff00ff) + (i_213_ & 0xff00ff);
						i_213_ = (i_214_ - i_215_ & 0x10000) + (i_215_ & 0x1000100);
						((Class_ra_Sub3) this).anIntArray8630[i_211_++] = i_214_ - i_213_ | i_213_ - (i_213_ >>> 8);
					}
					i_176_++;
					i_181_ += i_179_ + i_179_;
					i_180_ += i_179_++ + i_179_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void XA(int i, int i_216_, int i_217_, int i_218_, int i_219_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null && (i_216_ >= -1679642481 * ((Class_ra_Sub3) this).anInt8623 && i_216_ < 31822541 * ((Class_ra_Sub3) this).anInt8624)) {
			if (i < 512290825 * ((Class_ra_Sub3) this).anInt8621) {
				i_217_ -= 512290825 * ((Class_ra_Sub3) this).anInt8621 - i;
				i = ((Class_ra_Sub3) this).anInt8621 * 512290825;
			}
			if (i_217_ + i > -1071049483 * ((Class_ra_Sub3) this).anInt8635)
				i_217_ = ((Class_ra_Sub3) this).anInt8635 * -1071049483 - i;
			int i_220_ = -1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_216_ + i;
			int i_221_ = i_218_ >>> 24;
			if (i_219_ == 0 || i_219_ == 1 && i_221_ == 255) {
				for (int i_222_ = 0; i_222_ < i_217_; i_222_++)
					((Class_ra_Sub3) this).anIntArray8630[i_222_ + i_220_] = i_218_;
			} else if (i_219_ == 1) {
				i_218_ = ((i_221_ << 24) + (((i_218_ & 0xff00ff) * i_221_ >> 8 & 0xff00ff) + (i_221_ * (i_218_ & 0xff00) >> 8 & 0xff00)));
				int i_223_ = 256 - i_221_;
				for (int i_224_ = 0; i_224_ < i_217_; i_224_++) {
					int i_225_ = (((Class_ra_Sub3) this).anIntArray8630[i_224_ + i_220_]);
					i_225_ = (((i_225_ & 0xff00) * i_223_ >> 8 & 0xff00) + ((i_225_ & 0xff00ff) * i_223_ >> 8 & 0xff00ff));
					((Class_ra_Sub3) this).anIntArray8630[i_224_ + i_220_] = i_218_ + i_225_;
				}
			} else if (i_219_ == 2) {
				for (int i_226_ = 0; i_226_ < i_217_; i_226_++) {
					int i_227_ = (((Class_ra_Sub3) this).anIntArray8630[i_226_ + i_220_]);
					int i_228_ = i_227_ + i_218_;
					int i_229_ = (i_227_ & 0xff00ff) + (i_218_ & 0xff00ff);
					i_227_ = (i_228_ - i_229_ & 0x10000) + (i_229_ & 0x1000100);
					((Class_ra_Sub3) this).anIntArray8630[i_220_ + i_226_] = i_228_ - i_227_ | i_227_ - (i_227_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	Class76_Sub1 ak(Canvas canvas, int i, int i_230_) {
		return Class330_Sub26.method3394(this, canvas, i, i_230_, 1898719342);
	}

	public void ae(int i, int i_231_, int i_232_, int i_233_) {
		((Class_ra_Sub3) this).anInt8636 = i * 1238685301;
		((Class_ra_Sub3) this).anInt8622 = -780345205 * i_231_;
		((Class_ra_Sub3) this).anInt8638 = i_232_ * -1098702653;
		((Class_ra_Sub3) this).anInt8614 = 1394695071 * i_233_;
		method5195();
	}

	void method5198(int i, int i_234_, int i_235_, int i_236_, int i_237_, int i_238_, int i_239_, int i_240_) {
		if (null != ((Class_ra_Sub3) this).anIntArray8630 && (i >= 512290825 * ((Class_ra_Sub3) this).anInt8621 && i < -1071049483 * ((Class_ra_Sub3) this).anInt8635)) {
			int i_241_ = ((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_234_ + i;
			int i_242_ = i_236_ >>> 24;
			int i_243_ = i_238_ + i_239_;
			int i_244_ = i_240_ % i_243_;
			if (i_237_ == 0 || i_237_ == 1 && 255 == i_242_) {
				int i_245_ = 0;
				while (i_245_ < i_235_) {
					if ((i_245_ + i_234_ >= ((Class_ra_Sub3) this).anInt8623 * -1679642481) && (i_234_ + i_245_ < ((Class_ra_Sub3) this).anInt8624 * 31822541) && i_244_ < i_238_)
						((Class_ra_Sub3) this).anIntArray8630[(i_241_ + i_245_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933))] = i_236_;
					i_245_++;
					i_244_ = ++i_244_ % i_243_;
				}
			} else if (1 == i_237_) {
				i_236_ = (i_242_ << 24) + (((i_236_ & 0xff00) * i_242_ >> 8 & 0xff00) + (i_242_ * (i_236_ & 0xff00ff) >> 8 & 0xff00ff));
				int i_246_ = 256 - i_242_;
				int i_247_ = 0;
				while (i_247_ < i_235_) {
					if ((i_247_ + i_234_ >= ((Class_ra_Sub3) this).anInt8623 * -1679642481) && (i_234_ + i_247_ < 31822541 * ((Class_ra_Sub3) this).anInt8624) && i_244_ < i_238_) {
						int i_248_ = (i_241_ + i_247_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933));
						int i_249_ = ((Class_ra_Sub3) this).anIntArray8630[i_248_];
						i_249_ = (((i_249_ & 0xff00) * i_246_ >> 8 & 0xff00) + (i_246_ * (i_249_ & 0xff00ff) >> 8 & 0xff00ff));
						((Class_ra_Sub3) this).anIntArray8630[i_248_] = i_249_ + i_236_;
					}
					i_247_++;
					i_244_ = ++i_244_ % i_243_;
				}
			} else if (i_237_ == 2) {
				int i_250_ = 0;
				while (i_250_ < i_235_) {
					if ((i_234_ + i_250_ >= ((Class_ra_Sub3) this).anInt8623 * -1679642481) && (i_234_ + i_250_ < 31822541 * ((Class_ra_Sub3) this).anInt8624) && i_244_ < i_238_) {
						int i_251_ = i_250_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933) + i_241_;
						int i_252_ = ((Class_ra_Sub3) this).anIntArray8630[i_251_];
						int i_253_ = i_236_ + i_252_;
						int i_254_ = (i_236_ & 0xff00ff) + (i_252_ & 0xff00ff);
						i_252_ = (i_253_ - i_254_ & 0x10000) + (i_254_ & 0x1000100);
						((Class_ra_Sub3) this).anIntArray8630[i_251_] = i_253_ - i_252_ | i_252_ - (i_252_ >>> 8);
					}
					i_250_++;
					i_244_ = ++i_244_ % i_243_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void br(int i, int i_255_, int i_256_, int i_257_, int i_258_, int i_259_) {
		if (null != ((Class_ra_Sub3) this).anIntArray8630) {
			i_256_ -= i;
			i_257_ -= i_255_;
			if (i_257_ == 0) {
				if (i_256_ >= 0)
					XA(i, i_255_, i_256_ + 1, i_258_, i_259_);
				else
					XA(i_256_ + i, i_255_, -i_256_ + 1, i_258_, i_259_);
			} else if (0 == i_256_) {
				if (i_257_ >= 0)
					G(i, i_255_, i_257_ + 1, i_258_, i_259_);
				else
					G(i, i_257_ + i_255_, -i_257_ + 1, i_258_, i_259_);
			} else {
				if (i_257_ + i_256_ < 0) {
					i += i_256_;
					i_256_ = -i_256_;
					i_255_ += i_257_;
					i_257_ = -i_257_;
				}
				if (i_256_ > i_257_) {
					i_255_ <<= 16;
					i_255_ += 32768;
					i_257_ <<= 16;
					int i_260_ = (int) Math.floor(0.5 + ((double) i_257_ / (double) i_256_));
					i_256_ += i;
					if (i < 512290825 * ((Class_ra_Sub3) this).anInt8621) {
						i_255_ += i_260_ * ((((Class_ra_Sub3) this).anInt8621 * 512290825) - i);
						i = ((Class_ra_Sub3) this).anInt8621 * 512290825;
					}
					if (i_256_ >= -1071049483 * ((Class_ra_Sub3) this).anInt8635)
						i_256_ = (((Class_ra_Sub3) this).anInt8635 * -1071049483 - 1);
					int i_261_ = i_258_ >>> 24;
					if (i_259_ == 0 || 1 == i_259_ && 255 == i_261_) {
						for (/**/; i <= i_256_; i++) {
							int i_262_ = i_255_ >> 16;
							if (i_262_ >= (-1679642481 * ((Class_ra_Sub3) this).anInt8623) && i_262_ < (((Class_ra_Sub3) this).anInt8624 * 31822541))
								((Class_ra_Sub3) this).anIntArray8630[i_262_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933) + i] = i_258_;
							i_255_ += i_260_;
						}
					} else if (i_259_ == 1) {
						i_258_ = (((i_258_ & 0xff00ff) * i_261_ >> 8 & 0xff00ff) + ((i_258_ & 0xff00) * i_261_ >> 8 & 0xff00) + (i_261_ << 24));
						int i_263_ = 256 - i_261_;
						for (/**/; i <= i_256_; i++) {
							int i_264_ = i_255_ >> 16;
							if (i_264_ >= (((Class_ra_Sub3) this).anInt8623 * -1679642481) && i_264_ < 31822541 * (((Class_ra_Sub3) this).anInt8624)) {
								int i_265_ = i + (i_264_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933));
								int i_266_ = (((Class_ra_Sub3) this).anIntArray8630[i_265_]);
								i_266_ = ((i_263_ * (i_266_ & 0xff00ff) >> 8 & 0xff00ff) + (i_263_ * (i_266_ & 0xff00) >> 8 & 0xff00));
								((Class_ra_Sub3) this).anIntArray8630[i_265_] = i_266_ + i_258_;
							}
							i_255_ += i_260_;
						}
					} else if (2 == i_259_) {
						for (/**/; i <= i_256_; i++) {
							int i_267_ = i_255_ >> 16;
							if (i_267_ >= (-1679642481 * ((Class_ra_Sub3) this).anInt8623) && i_267_ < (((Class_ra_Sub3) this).anInt8624 * 31822541)) {
								int i_268_ = i + (((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_267_);
								int i_269_ = (((Class_ra_Sub3) this).anIntArray8630[i_268_]);
								int i_270_ = i_269_ + i_258_;
								int i_271_ = ((i_269_ & 0xff00ff) + (i_258_ & 0xff00ff));
								i_269_ = ((i_270_ - i_271_ & 0x10000) + (i_271_ & 0x1000100));
								((Class_ra_Sub3) this).anIntArray8630[i_268_] = i_270_ - i_269_ | i_269_ - (i_269_ >>> 8);
							}
							i_255_ += i_260_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_256_ <<= 16;
					int i_272_ = (int) Math.floor((double) i_256_ / (double) i_257_ + 0.5);
					i_257_ += i_255_;
					if (i_255_ < -1679642481 * ((Class_ra_Sub3) this).anInt8623) {
						i += (((Class_ra_Sub3) this).anInt8623 * -1679642481 - i_255_) * i_272_;
						i_255_ = ((Class_ra_Sub3) this).anInt8623 * -1679642481;
					}
					if (i_257_ >= ((Class_ra_Sub3) this).anInt8624 * 31822541)
						i_257_ = 31822541 * ((Class_ra_Sub3) this).anInt8624 - 1;
					int i_273_ = i_258_ >>> 24;
					if (i_259_ == 0 || 1 == i_259_ && i_273_ == 255) {
						for (/**/; i_255_ <= i_257_; i_255_++) {
							int i_274_ = i >> 16;
							if (i_274_ >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i_274_ < -1071049483 * ((Class_ra_Sub3) this).anInt8635)
								((Class_ra_Sub3) this).anIntArray8630[(-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_255_) + i_274_] = i_258_;
							i += i_272_;
						}
					} else if (1 == i_259_) {
						i_258_ = (((i_258_ & 0xff00) * i_273_ >> 8 & 0xff00) + ((i_258_ & 0xff00ff) * i_273_ >> 8 & 0xff00ff) + (i_273_ << 24));
						int i_275_ = 256 - i_273_;
						for (/**/; i_255_ <= i_257_; i_255_++) {
							int i_276_ = i >> 16;
							if (i_276_ >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i_276_ < -1071049483 * ((Class_ra_Sub3) this).anInt8635) {
								int i_277_ = ((-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_255_) + i_276_);
								int i_278_ = (((Class_ra_Sub3) this).anIntArray8630[i_277_]);
								i_278_ = ((i_275_ * (i_278_ & 0xff00) >> 8 & 0xff00) + (i_275_ * (i_278_ & 0xff00ff) >> 8 & 0xff00ff));
								((Class_ra_Sub3) this).anIntArray8630[i_276_ + (((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_255_)] = i_258_ + i_278_;
							}
							i += i_272_;
						}
					} else if (i_259_ == 2) {
						for (/**/; i_255_ <= i_257_; i_255_++) {
							int i_279_ = i >> 16;
							if (i_279_ >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i_279_ < (((Class_ra_Sub3) this).anInt8635 * -1071049483)) {
								int i_280_ = (i_279_ + (((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_255_));
								int i_281_ = (((Class_ra_Sub3) this).anIntArray8630[i_280_]);
								int i_282_ = i_258_ + i_281_;
								int i_283_ = ((i_281_ & 0xff00ff) + (i_258_ & 0xff00ff));
								i_281_ = (i_283_ & 0x1000100) + (i_282_ - i_283_ & 0x10000);
								((Class_ra_Sub3) this).anIntArray8630[i_280_] = i_282_ - i_281_ | i_281_ - (i_281_ >>> 8);
							}
							i += i_272_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void bz(int i, int i_284_, int i_285_, int i_286_, int i_287_, int i_288_, int i_289_, int i_290_, int i_291_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null) {
			i_285_ -= i;
			i_286_ -= i_284_;
			if (0 == i_286_) {
				if (i_285_ >= 0)
					method5203(i, i_284_, i_285_ + 1, i_287_, i_288_, i_289_, i_290_, i_291_);
				else {
					int i_292_ = i_290_ + i_289_;
					i_291_ %= i_292_;
					i_291_ = i_289_ + i_292_ - i_291_ - (1 + -i_285_) % i_292_;
					i_291_ %= i_292_;
					if (i_291_ < 0)
						i_291_ += i_292_;
					method5203(i_285_ + i, i_284_, 1 + -i_285_, i_287_, i_288_, i_289_, i_290_, i_291_);
				}
			} else if (i_285_ == 0) {
				if (i_286_ >= 0)
					method5198(i, i_284_, 1 + i_286_, i_287_, i_288_, i_289_, i_290_, i_291_);
				else {
					int i_293_ = i_289_ + i_290_;
					i_291_ %= i_293_;
					i_291_ = i_289_ + i_293_ - i_291_ - (-i_286_ + 1) % i_293_;
					i_291_ %= i_293_;
					if (i_291_ < 0)
						i_291_ += i_293_;
					method5198(i, i_286_ + i_284_, 1 + -i_286_, i_287_, i_288_, i_289_, i_290_, i_291_);
				}
			} else {
				i_291_ <<= 8;
				i_289_ <<= 8;
				i_290_ <<= 8;
				int i_294_ = i_289_ + i_290_;
				i_291_ %= i_294_;
				if (i_286_ + i_285_ < 0) {
					int i_295_ = (int) (Math.sqrt((double) (i_285_ * i_285_ + i_286_ * i_286_)) * 256.0);
					int i_296_ = i_295_ % i_294_;
					i_291_ = i_289_ + i_294_ - i_291_ - i_296_;
					i_291_ %= i_294_;
					if (i_291_ < 0)
						i_291_ += i_294_;
					i += i_285_;
					i_285_ = -i_285_;
					i_284_ += i_286_;
					i_286_ = -i_286_;
				}
				if (i_285_ > i_286_) {
					i_284_ <<= 16;
					i_284_ += 32768;
					i_286_ <<= 16;
					int i_297_ = (int) Math.floor((double) i_286_ / (double) i_285_ + 0.5);
					i_285_ += i;
					int i_298_ = i_287_ >>> 24;
					int i_299_ = (int) Math.sqrt((double) ((i_297_ >> 8) * (i_297_ >> 8) + 65536));
					if (i_288_ == 0 || i_288_ == 1 && i_298_ == 255) {
						while (i <= i_285_) {
							int i_300_ = i_284_ >> 16;
							if (i >= (((Class_ra_Sub3) this).anInt8621 * 512290825) && i < (-1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_300_ >= (((Class_ra_Sub3) this).anInt8623 * -1679642481) && i_300_ < (((Class_ra_Sub3) this).anInt8624 * 31822541) && i_291_ < i_289_)
								((Class_ra_Sub3) this).anIntArray8630[i_300_ * (-1504772933 * (((Class_ra_Sub3) this).anInt8618)) + i] = i_287_;
							i_284_ += i_297_;
							i++;
							i_291_ += i_299_;
							i_291_ %= i_294_;
						}
					} else if (i_288_ == 1) {
						i_287_ = (((i_287_ & 0xff00ff) * i_298_ >> 8 & 0xff00ff) + ((i_287_ & 0xff00) * i_298_ >> 8 & 0xff00) + (i_298_ << 24));
						int i_301_ = 256 - i_298_;
						while (i <= i_285_) {
							int i_302_ = i_284_ >> 16;
							if (i >= (((Class_ra_Sub3) this).anInt8621 * 512290825) && i < (-1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_302_ >= (((Class_ra_Sub3) this).anInt8623 * -1679642481) && i_302_ < (((Class_ra_Sub3) this).anInt8624 * 31822541) && i_291_ < i_289_) {
								int i_303_ = i + (-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_302_);
								int i_304_ = (((Class_ra_Sub3) this).anIntArray8630[i_303_]);
								i_304_ = (((i_304_ & 0xff00ff) * i_301_ >> 8 & 0xff00ff) + (i_301_ * (i_304_ & 0xff00) >> 8 & 0xff00));
								((Class_ra_Sub3) this).anIntArray8630[i_303_] = i_287_ + i_304_;
							}
							i_284_ += i_297_;
							i++;
							i_291_ += i_299_;
							i_291_ %= i_294_;
						}
					} else if (i_288_ == 2) {
						while (i <= i_285_) {
							int i_305_ = i_284_ >> 16;
							if (i >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i < (-1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_305_ >= (((Class_ra_Sub3) this).anInt8623 * -1679642481) && i_305_ < (((Class_ra_Sub3) this).anInt8624 * 31822541) && i_291_ < i_289_) {
								int i_306_ = i + (i_305_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933));
								int i_307_ = (((Class_ra_Sub3) this).anIntArray8630[i_306_]);
								int i_308_ = i_287_ + i_307_;
								int i_309_ = ((i_307_ & 0xff00ff) + (i_287_ & 0xff00ff));
								i_307_ = (i_309_ & 0x1000100) + (i_308_ - i_309_ & 0x10000);
								((Class_ra_Sub3) this).anIntArray8630[i_306_] = i_308_ - i_307_ | i_307_ - (i_307_ >>> 8);
							}
							i_284_ += i_297_;
							i++;
							i_291_ += i_299_;
							i_291_ %= i_294_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_285_ <<= 16;
					int i_310_ = (int) Math.floor((double) i_285_ / (double) i_286_ + 0.5);
					i_286_ += i_284_;
					int i_311_ = i_287_ >>> 24;
					int i_312_ = (int) Math.sqrt((double) (65536 + (i_310_ >> 8) * (i_310_ >> 8)));
					if (0 == i_288_ || 1 == i_288_ && 255 == i_311_) {
						while (i_284_ <= i_286_) {
							int i_313_ = i >> 16;
							if (i_284_ >= (-1679642481 * ((Class_ra_Sub3) this).anInt8623) && i_284_ < 31822541 * (((Class_ra_Sub3) this).anInt8624) && i_313_ >= (((Class_ra_Sub3) this).anInt8621 * 512290825) && i_313_ < (((Class_ra_Sub3) this).anInt8635 * -1071049483) && i_291_ < i_289_)
								((Class_ra_Sub3) this).anIntArray8630[(-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_284_) + i_313_] = i_287_;
							i += i_310_;
							i_284_++;
							i_291_ += i_312_;
							i_291_ %= i_294_;
						}
					} else if (1 == i_288_) {
						i_287_ = ((i_311_ * (i_287_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_287_ & 0xff00) * i_311_ >> 8 & 0xff00) + (i_311_ << 24));
						int i_314_ = 256 - i_311_;
						while (i_284_ <= i_286_) {
							int i_315_ = i >> 16;
							if (i_284_ >= (-1679642481 * ((Class_ra_Sub3) this).anInt8623) && i_284_ < (((Class_ra_Sub3) this).anInt8624 * 31822541) && i_315_ >= 512290825 * ((Class_ra_Sub3) this).anInt8621 && i_315_ < -1071049483 * ((Class_ra_Sub3) this).anInt8635 && i_291_ < i_289_) {
								int i_316_ = (i_284_ * ((((Class_ra_Sub3) this).anInt8618) * -1504772933) + i_315_);
								int i_317_ = (((Class_ra_Sub3) this).anIntArray8630[i_316_]);
								i_317_ = (((i_317_ & 0xff00ff) * i_314_ >> 8 & 0xff00ff) + (i_314_ * (i_317_ & 0xff00) >> 8 & 0xff00));
								((Class_ra_Sub3) this).anIntArray8630[i_315_ + i_284_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618)] = i_287_ + i_317_;
							}
							i += i_310_;
							i_284_++;
							i_291_ += i_312_;
							i_291_ %= i_294_;
						}
					} else if (i_288_ == 2) {
						while (i_284_ <= i_286_) {
							int i_318_ = i >> 16;
							if (i_284_ >= (-1679642481 * ((Class_ra_Sub3) this).anInt8623) && i_284_ < (((Class_ra_Sub3) this).anInt8624 * 31822541) && i_318_ >= (((Class_ra_Sub3) this).anInt8621 * 512290825) && i_318_ < -1071049483 * ((Class_ra_Sub3) this).anInt8635 && i_291_ < i_289_) {
								int i_319_ = (i_318_ + (-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_284_));
								int i_320_ = (((Class_ra_Sub3) this).anIntArray8630[i_319_]);
								int i_321_ = i_320_ + i_287_;
								int i_322_ = ((i_287_ & 0xff00ff) + (i_320_ & 0xff00ff));
								i_320_ = ((i_321_ - i_322_ & 0x10000) + (i_322_ & 0x1000100));
								((Class_ra_Sub3) this).anIntArray8630[i_319_] = i_321_ - i_320_ | i_320_ - (i_320_ >>> 8);
							}
							i += i_310_;
							i_284_++;
							i_291_ += i_312_;
							i_291_ %= i_294_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void bi(int i, int i_323_, int i_324_, int i_325_, int i_326_, int i_327_, Class_ta class_ta, int i_328_, int i_329_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null) {
			Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
			int[] is = ((Class_ta_Sub3) class_ta_sub3).anIntArray8661;
			int[] is_330_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8662;
			int i_331_ = (((Class_ra_Sub3) this).anInt8623 * -1679642481 > i_329_ ? -1679642481 * ((Class_ra_Sub3) this).anInt8623 : i_329_);
			int i_332_ = ((31822541 * ((Class_ra_Sub3) this).anInt8624 < is.length + i_329_) ? ((Class_ra_Sub3) this).anInt8624 * 31822541 : is.length + i_329_);
			i_324_ -= i;
			i_325_ -= i_323_;
			if (i_325_ + i_324_ < 0) {
				i += i_324_;
				i_324_ = -i_324_;
				i_323_ += i_325_;
				i_325_ = -i_325_;
			}
			if (i_324_ > i_325_) {
				i_323_ <<= 16;
				i_323_ += 32768;
				i_325_ <<= 16;
				int i_333_ = (int) Math.floor((double) i_325_ / (double) i_324_ + 0.5);
				i_324_ += i;
				if (i < ((Class_ra_Sub3) this).anInt8621 * 512290825) {
					i_323_ += (512290825 * ((Class_ra_Sub3) this).anInt8621 - i) * i_333_;
					i = ((Class_ra_Sub3) this).anInt8621 * 512290825;
				}
				if (i_324_ >= -1071049483 * ((Class_ra_Sub3) this).anInt8635)
					i_324_ = ((Class_ra_Sub3) this).anInt8635 * -1071049483 - 1;
				int i_334_ = i_326_ >>> 24;
				if (i_327_ == 0 || i_327_ == 1 && i_334_ == 255) {
					for (/**/; i <= i_324_; i++) {
						int i_335_ = i_323_ >> 16;
						int i_336_ = i_335_ - i_329_;
						if (i_335_ >= i_331_ && i_335_ < i_332_) {
							int i_337_ = is[i_336_] + i_328_;
							if (i >= i_337_ && i < is_330_[i_336_] + i_337_)
								((Class_ra_Sub3) this).anIntArray8630[i_335_ * (-1504772933 * (((Class_ra_Sub3) this).anInt8618)) + i] = i_326_;
						}
						i_323_ += i_333_;
					}
				} else if (i_327_ == 1) {
					i_326_ = ((i_334_ * (i_326_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_326_ & 0xff00) * i_334_ >> 8 & 0xff00) + (i_334_ << 24));
					int i_338_ = 256 - i_334_;
					for (/**/; i <= i_324_; i++) {
						int i_339_ = i_323_ >> 16;
						int i_340_ = i_339_ - i_329_;
						if (i_339_ >= i_331_ && i_339_ < i_332_) {
							int i_341_ = is[i_340_] + i_328_;
							if (i >= i_341_ && i < i_341_ + is_330_[i_340_]) {
								int i_342_ = ((-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_339_) + i);
								int i_343_ = (((Class_ra_Sub3) this).anIntArray8630[i_342_]);
								i_343_ = ((i_338_ * (i_343_ & 0xff00) >> 8 & 0xff00) + (i_338_ * (i_343_ & 0xff00ff) >> 8 & 0xff00ff));
								((Class_ra_Sub3) this).anIntArray8630[i_342_] = i_343_ + i_326_;
							}
						}
						i_323_ += i_333_;
					}
				} else if (2 == i_327_) {
					for (/**/; i <= i_324_; i++) {
						int i_344_ = i_323_ >> 16;
						int i_345_ = i_344_ - i_329_;
						if (i_344_ >= i_331_ && i_344_ < i_332_) {
							int i_346_ = i_328_ + is[i_345_];
							if (i >= i_346_ && i < is_330_[i_345_] + i_346_) {
								int i_347_ = i + (i_344_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933));
								int i_348_ = (((Class_ra_Sub3) this).anIntArray8630[i_347_]);
								int i_349_ = i_348_ + i_326_;
								int i_350_ = ((i_326_ & 0xff00ff) + (i_348_ & 0xff00ff));
								i_348_ = ((i_349_ - i_350_ & 0x10000) + (i_350_ & 0x1000100));
								((Class_ra_Sub3) this).anIntArray8630[i_347_] = i_349_ - i_348_ | i_348_ - (i_348_ >>> 8);
							}
						}
						i_323_ += i_333_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_324_ <<= 16;
				int i_351_ = (int) Math.floor((double) i_324_ / (double) i_325_ + 0.5);
				i_325_ += i_323_;
				if (i_323_ < i_331_) {
					i += i_351_ * (i_331_ - i_323_);
					i_323_ = i_331_;
				}
				if (i_325_ >= i_332_)
					i_325_ = i_332_ - 1;
				int i_352_ = i_326_ >>> 24;
				if (i_327_ == 0 || 1 == i_327_ && 255 == i_352_) {
					for (/**/; i_323_ <= i_325_; i_323_++) {
						int i_353_ = i >> 16;
						int i_354_ = i_323_ - i_329_;
						int i_355_ = i_328_ + is[i_354_];
						if ((i_353_ >= ((Class_ra_Sub3) this).anInt8621 * 512290825) && i_353_ < (-1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_353_ >= i_355_ && i_353_ < i_355_ + is_330_[i_354_])
							((Class_ra_Sub3) this).anIntArray8630[(((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_323_) + i_353_] = i_326_;
						i += i_351_;
					}
				} else if (i_327_ == 1) {
					i_326_ = (((i_326_ & 0xff00ff) * i_352_ >> 8 & 0xff00ff) + ((i_326_ & 0xff00) * i_352_ >> 8 & 0xff00) + (i_352_ << 24));
					int i_356_ = 256 - i_352_;
					for (/**/; i_323_ <= i_325_; i_323_++) {
						int i_357_ = i >> 16;
						int i_358_ = i_323_ - i_329_;
						int i_359_ = i_328_ + is[i_358_];
						if ((i_357_ >= ((Class_ra_Sub3) this).anInt8621 * 512290825) && i_357_ < (((Class_ra_Sub3) this).anInt8635 * -1071049483) && i_357_ >= i_359_ && i_357_ < i_359_ + is_330_[i_358_]) {
							int i_360_ = (i_323_ * (-1504772933 * (((Class_ra_Sub3) this).anInt8618)) + i_357_);
							int i_361_ = (((Class_ra_Sub3) this).anIntArray8630[i_360_]);
							i_361_ = (((i_361_ & 0xff00ff) * i_356_ >> 8 & 0xff00ff) + (i_356_ * (i_361_ & 0xff00) >> 8 & 0xff00));
							((Class_ra_Sub3) this).anIntArray8630[(i_357_ + i_323_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933))] = i_326_ + i_361_;
						}
						i += i_351_;
					}
				} else if (2 == i_327_) {
					for (/**/; i_323_ <= i_325_; i_323_++) {
						int i_362_ = i >> 16;
						int i_363_ = i_323_ - i_329_;
						int i_364_ = is[i_363_] + i_328_;
						if ((i_362_ >= 512290825 * ((Class_ra_Sub3) this).anInt8621) && i_362_ < (-1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_362_ >= i_364_ && i_362_ < i_364_ + is_330_[i_363_]) {
							int i_365_ = ((((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_323_) + i_362_);
							int i_366_ = (((Class_ra_Sub3) this).anIntArray8630[i_365_]);
							int i_367_ = i_366_ + i_326_;
							int i_368_ = (i_326_ & 0xff00ff) + (i_366_ & 0xff00ff);
							i_366_ = (i_368_ & 0x1000100) + (i_367_ - i_368_ & 0x10000);
							((Class_ra_Sub3) this).anIntArray8630[i_365_] = i_367_ - i_366_ | i_366_ - (i_366_ >>> 8);
						}
						i += i_351_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void fq(int i, int i_369_, int i_370_, int i_371_, int i_372_, int i_373_) {
		XA(i, i_369_, i_370_, i_372_, i_373_);
		XA(i, i_371_ + i_369_ - 1, i_370_, i_372_, i_373_);
		G(i, 1 + i_369_, i_371_ - 2, i_372_, i_373_);
		G(i_370_ + i - 1, 1 + i_369_, i_371_ - 2, i_372_, i_373_);
	}

	public int bp(int i, int i_374_, int i_375_, int i_376_, int i_377_, int i_378_) {
		int i_379_ = 0;
		float f = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[10] * (float) i_375_) + (((float) i * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[2]) + ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[14] + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[6] * (float) i_374_)));
		float f_380_ = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[2] * (float) i_376_) + ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[14] + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[6] * (float) i_377_) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[10] * (float) i_378_));
		float f_381_ = (((float) i_374_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[7]) + (((float) i * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[3]) + ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[15]) + (float) i_375_ * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[11]));
		float f_382_ = (((float) i_377_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[7]) + ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[3] * (float) i_376_) + ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[15]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[11] * (float) i_378_));
		if (f < -f_381_ && f_380_ < -f_382_)
			i_379_ |= 0x10;
		else if (f > f_381_ && f_380_ > f_382_)
			i_379_ |= 0x20;
		float f_383_ = (((float) i_374_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[4]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[12] + (float) i * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[0])) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[8] * (float) i_375_));
		float f_384_ = (((float) i_377_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[4]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[12] + (float) i_376_ * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[0])) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[8] * (float) i_378_));
		if (f_383_ < -f_381_ && f_384_ < -f_382_)
			i_379_ |= 0x1;
		if (f_383_ > f_381_ && f_384_ > f_382_)
			i_379_ |= 0x2;
		float f_385_ = (((float) i * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[1]) + ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[13] + ((float) i_374_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[5]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[9] * (float) i_375_));
		float f_386_ = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[9] * (float) i_378_) + ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[5] * (float) i_377_) + ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[1] * (float) i_376_) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[13]))));
		if (f_385_ < -f_381_ && f_386_ < -f_382_)
			i_379_ |= 0x4;
		if (f_385_ > f_381_ && f_386_ > f_382_)
			i_379_ |= 0x8;
		return i_379_;
	}

	public Class_v bx(int i) {
		return null;
	}

	public void bm(Class_v class_v) {
		/* empty */
	}

	public Class61 bn(int i, int i_387_, boolean bool, boolean bool_388_) {
		if (bool)
			return new Class61_Sub3_Sub2(this, i, i_387_);
		return new Class61_Sub3_Sub1(this, i, i_387_);
	}

	public Class61 bu(int[] is, int i, int i_389_, int i_390_, int i_391_, boolean bool) {
		boolean bool_392_ = false;
		int i_393_ = i;
		while_118_: for (int i_394_ = 0; i_394_ < i_391_; i_394_++) {
			for (int i_395_ = 0; i_395_ < i_390_; i_395_++) {
				int i_396_ = is[i_393_++] >>> 24;
				if (i_396_ != 0 && i_396_ != 255) {
					bool_392_ = true;
					break while_118_;
				}
			}
		}
		if (bool_392_)
			return new Class61_Sub3_Sub2(this, is, i, i_389_, i_390_, i_391_, bool);
		return new Class61_Sub3_Sub1(this, is, i, i_389_, i_390_, i_391_, bool);
	}

	public Class61 bw(Class87 class87, boolean bool) {
		int i = class87.method986();
		int i_397_ = class87.method994();
		Class61_Sub3 class61_sub3;
		if (bool && !class87.method985() && class87.method1044()) {
			Class87_Sub2 class87_sub2 = (Class87_Sub2) class87;
			int[] is = new int[class87_sub2.anIntArray7113.length];
			byte[] is_398_ = new byte[i_397_ * i];
			for (int i_399_ = 0; i_399_ < i_397_; i_399_++) {
				int i_400_ = i_399_ * i;
				for (int i_401_ = 0; i_401_ < i; i_401_++)
					is_398_[i_401_ + i_400_] = class87_sub2.aByteArray7114[i_401_ + i_400_];
			}
			for (int i_402_ = 0; i_402_ < class87_sub2.anIntArray7113.length; i_402_++)
				is[i_402_] = class87_sub2.anIntArray7113[i_402_];
			class61_sub3 = new Class61_Sub3_Sub3(this, is_398_, is, i, i_397_);
		} else {
			int[] is = class87.method1031(false);
			if (class87.method985())
				class61_sub3 = new Class61_Sub3_Sub2(this, is, i, i_397_);
			else
				class61_sub3 = new Class61_Sub3_Sub1(this, is, i, i_397_);
		}
		class61_sub3.method717(class87.method983(), class87.method990(), class87.method989(), class87.method991());
		return class61_sub3;
	}

	public void ke() {
		((Class_ra_Sub3) this).anInt8621 = 0;
		((Class_ra_Sub3) this).anInt8623 = 0;
		((Class_ra_Sub3) this).anInt8635 = ((Class_ra_Sub3) this).anInt8618 * 1677671663;
		((Class_ra_Sub3) this).anInt8624 = -1710096567 * ((Class_ra_Sub3) this).anInt8619;
		method5195();
	}

	public void be(int i, int i_403_, int i_404_, int i_405_, int i_406_, int i_407_, Class_ta class_ta, int i_408_, int i_409_, int i_410_, int i_411_, int i_412_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null) {
			Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
			int[] is = ((Class_ta_Sub3) class_ta_sub3).anIntArray8661;
			int[] is_413_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8662;
			int i_414_ = (((Class_ra_Sub3) this).anInt8623 * -1679642481 > i_409_ ? ((Class_ra_Sub3) this).anInt8623 * -1679642481 : i_409_);
			int i_415_ = ((((Class_ra_Sub3) this).anInt8624 * 31822541 < is.length + i_409_) ? ((Class_ra_Sub3) this).anInt8624 * 31822541 : is.length + i_409_);
			i_412_ <<= 8;
			i_410_ <<= 8;
			i_411_ <<= 8;
			int i_416_ = i_410_ + i_411_;
			i_412_ %= i_416_;
			i_404_ -= i;
			i_405_ -= i_403_;
			if (i_405_ + i_404_ < 0) {
				int i_417_ = (int) (Math.sqrt((double) (i_405_ * i_405_ + i_404_ * i_404_)) * 256.0);
				int i_418_ = i_417_ % i_416_;
				i_412_ = i_410_ + i_416_ - i_412_ - i_418_;
				i_412_ %= i_416_;
				if (i_412_ < 0)
					i_412_ += i_416_;
				i += i_404_;
				i_404_ = -i_404_;
				i_403_ += i_405_;
				i_405_ = -i_405_;
			}
			if (i_404_ > i_405_) {
				i_403_ <<= 16;
				i_403_ += 32768;
				i_405_ <<= 16;
				int i_419_ = (int) Math.floor(0.5 + ((double) i_405_ / (double) i_404_));
				i_404_ += i;
				int i_420_ = i_406_ >>> 24;
				int i_421_ = (int) Math.sqrt((double) (65536 + (i_419_ >> 8) * (i_419_ >> 8)));
				if (i_407_ == 0 || 1 == i_407_ && i_420_ == 255) {
					while (i <= i_404_) {
						int i_422_ = i_403_ >> 16;
						int i_423_ = i_422_ - i_409_;
						if (i >= 512290825 * ((Class_ra_Sub3) this).anInt8621 && i < (((Class_ra_Sub3) this).anInt8635 * -1071049483) && i_422_ >= i_414_ && i_422_ < i_415_ && i_412_ < i_410_) {
							int i_424_ = i_408_ + is[i_423_];
							if (i >= i_424_ && i < i_424_ + is_413_[i_423_])
								((Class_ra_Sub3) this).anIntArray8630[(((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_422_) + i] = i_406_;
						}
						i_403_ += i_419_;
						i++;
						i_412_ += i_421_;
						i_412_ %= i_416_;
					}
				} else if (i_407_ == 1) {
					i_406_ = (((i_406_ & 0xff00ff) * i_420_ >> 8 & 0xff00ff) + (i_420_ * (i_406_ & 0xff00) >> 8 & 0xff00) + (i_420_ << 24));
					int i_425_ = 256 - i_420_;
					while (i <= i_404_) {
						int i_426_ = i_403_ >> 16;
						int i_427_ = i_426_ - i_409_;
						if (i >= ((Class_ra_Sub3) this).anInt8621 * 512290825 && i < (-1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_426_ >= i_414_ && i_426_ < i_415_ && i_412_ < i_410_) {
							int i_428_ = is[i_427_] + i_408_;
							if (i >= i_428_ && i < is_413_[i_427_] + i_428_) {
								int i_429_ = ((i_426_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618)) + i);
								int i_430_ = (((Class_ra_Sub3) this).anIntArray8630[i_429_]);
								i_430_ = (((i_430_ & 0xff00) * i_425_ >> 8 & 0xff00) + ((i_430_ & 0xff00ff) * i_425_ >> 8 & 0xff00ff));
								((Class_ra_Sub3) this).anIntArray8630[i_429_] = i_430_ + i_406_;
							}
						}
						i_403_ += i_419_;
						i++;
						i_412_ += i_421_;
						i_412_ %= i_416_;
					}
				} else if (i_407_ == 2) {
					while (i <= i_404_) {
						int i_431_ = i_403_ >> 16;
						int i_432_ = i_431_ - i_409_;
						if (i >= 512290825 * ((Class_ra_Sub3) this).anInt8621 && i < (-1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_431_ >= i_414_ && i_431_ < i_415_ && i_412_ < i_410_) {
							int i_433_ = is[i_432_] + i_408_;
							if (i >= i_433_ && i < i_433_ + is_413_[i_432_]) {
								int i_434_ = i + (-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_431_);
								int i_435_ = (((Class_ra_Sub3) this).anIntArray8630[i_434_]);
								int i_436_ = i_435_ + i_406_;
								int i_437_ = ((i_406_ & 0xff00ff) + (i_435_ & 0xff00ff));
								i_435_ = (i_437_ & 0x1000100) + (i_436_ - i_437_ & 0x10000);
								((Class_ra_Sub3) this).anIntArray8630[i_434_] = i_436_ - i_435_ | i_435_ - (i_435_ >>> 8);
							}
						}
						i_403_ += i_419_;
						i++;
						i_412_ += i_421_;
						i_412_ %= i_416_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_404_ <<= 16;
				int i_438_ = (int) Math.floor((double) i_404_ / (double) i_405_ + 0.5);
				int i_439_ = (int) Math.sqrt((double) (65536 + (i_438_ >> 8) * (i_438_ >> 8)));
				i_405_ += i_403_;
				int i_440_ = i_406_ >>> 24;
				if (0 == i_407_ || 1 == i_407_ && 255 == i_440_) {
					while (i_403_ <= i_405_) {
						int i_441_ = i >> 16;
						int i_442_ = i_403_ - i_409_;
						if (i_403_ >= i_414_ && i_403_ < i_415_ && i_441_ >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i_441_ < (((Class_ra_Sub3) this).anInt8635 * -1071049483) && i_412_ < i_410_ && i_441_ >= is[i_442_] + i_408_ && i_441_ < is[i_442_] + i_408_ + is_413_[i_442_])
							((Class_ra_Sub3) this).anIntArray8630[(((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_403_) + i_441_] = i_406_;
						i += i_438_;
						i_403_++;
						i_412_ += i_439_;
						i_412_ %= i_416_;
					}
				} else if (1 == i_407_) {
					i_406_ = ((i_440_ * (i_406_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_406_ & 0xff00) * i_440_ >> 8 & 0xff00) + (i_440_ << 24));
					int i_443_ = 256 - i_440_;
					while (i_403_ <= i_405_) {
						int i_444_ = i >> 16;
						int i_445_ = i_403_ - i_409_;
						if (i_403_ >= i_414_ && i_403_ < i_415_ && i_444_ >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i_444_ < (((Class_ra_Sub3) this).anInt8635 * -1071049483) && i_412_ < i_410_ && i_444_ >= is[i_445_] + i_408_ && i_444_ < is_413_[i_445_] + (is[i_445_] + i_408_)) {
							int i_446_ = i_444_ + (((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_403_);
							int i_447_ = (((Class_ra_Sub3) this).anIntArray8630[i_446_]);
							i_447_ = ((i_443_ * (i_447_ & 0xff00ff) >> 8 & 0xff00ff) + (i_443_ * (i_447_ & 0xff00) >> 8 & 0xff00));
							((Class_ra_Sub3) this).anIntArray8630[(((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_403_) + i_444_] = i_406_ + i_447_;
						}
						i += i_438_;
						i_403_++;
						i_412_ += i_439_;
						i_412_ %= i_416_;
					}
				} else if (2 == i_407_) {
					while (i_403_ <= i_405_) {
						int i_448_ = i >> 16;
						int i_449_ = i_403_ - i_409_;
						if (i_403_ >= i_414_ && i_403_ < i_415_ && i_448_ >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i_448_ < (-1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_412_ < i_410_ && i_448_ >= is[i_449_] + i_408_ && (i_448_ < i_408_ + is[i_449_] + is_413_[i_449_])) {
							int i_450_ = i_448_ + (-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_403_);
							int i_451_ = (((Class_ra_Sub3) this).anIntArray8630[i_450_]);
							int i_452_ = i_451_ + i_406_;
							int i_453_ = (i_451_ & 0xff00ff) + (i_406_ & 0xff00ff);
							i_451_ = (i_453_ & 0x1000100) + (i_452_ - i_453_ & 0x10000);
							((Class_ra_Sub3) this).anIntArray8630[i_450_] = i_452_ - i_451_ | i_451_ - (i_451_ >>> 8);
						}
						i += i_438_;
						i_403_++;
						i_412_ += i_439_;
						i_412_ %= i_416_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void DA(int i, Class_ta class_ta, int i_454_, int i_455_) {
		if (null != ((Class_ra_Sub3) this).anIntArray8630) {
			Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
			int[] is = ((Class_ta_Sub3) class_ta_sub3).anIntArray8661;
			int[] is_456_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8662;
			int i_457_;
			if (((Class_ra_Sub3) this).anInt8624 * 31822541 < is.length + i_455_)
				i_457_ = 31822541 * ((Class_ra_Sub3) this).anInt8624 - i_455_;
			else
				i_457_ = is.length;
			int i_458_;
			if (-1679642481 * ((Class_ra_Sub3) this).anInt8623 > i_455_) {
				i_458_ = -1679642481 * ((Class_ra_Sub3) this).anInt8623 - i_455_;
				i_455_ = -1679642481 * ((Class_ra_Sub3) this).anInt8623;
			} else
				i_458_ = 0;
			if (i_457_ - i_458_ > 0) {
				int i_459_ = -1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_455_;
				for (int i_460_ = i_458_; i_460_ < i_457_; i_460_++) {
					int i_461_ = is[i_460_] + i_454_;
					int i_462_ = is_456_[i_460_];
					if (((Class_ra_Sub3) this).anInt8621 * 512290825 > i_461_) {
						i_462_ -= (512290825 * ((Class_ra_Sub3) this).anInt8621 - i_461_);
						i_461_ = ((Class_ra_Sub3) this).anInt8621 * 512290825;
					}
					if (-1071049483 * ((Class_ra_Sub3) this).anInt8635 < i_461_ + i_462_)
						i_462_ = (-1071049483 * ((Class_ra_Sub3) this).anInt8635 - i_461_);
					i_461_ += i_459_;
					for (int i_463_ = -i_462_; i_463_ < 0; i_463_++)
						((Class_ra_Sub3) this).anIntArray8630[i_461_++] = i;
					i_459_ += ((Class_ra_Sub3) this).anInt8618 * -1504772933;
				}
			}
		}
	}

	public Class263 ce(Class524 class524, Class87_Sub2[] class87_sub2s, boolean bool) {
		int[] is = new int[class87_sub2s.length];
		int[] is_464_ = new int[class87_sub2s.length];
		boolean bool_465_ = false;
		for (int i = 0; i < class87_sub2s.length; i++) {
			is[i] = class87_sub2s[i].method986();
			is_464_[i] = class87_sub2s[i].method994();
			if (class87_sub2s[i].method985())
				bool_465_ = true;
		}
		if (bool) {
			if (bool_465_)
				return new Class263_Sub2(this, class524, class87_sub2s, is, is_464_);
			return new Class263_Sub3(this, class524, class87_sub2s, is, is_464_);
		}
		if (bool_465_)
			throw new IllegalArgumentException("");
		return new Class263_Sub4(this, class524, class87_sub2s, is, is_464_);
	}

	public boolean at() {
		return false;
	}

	public Class387 cb(Model class98, int i, int i_466_, int i_467_, int i_468_) {
		return new Class387_Sub3(this, class98, i, i_467_, i_468_, i_466_);
	}

	public void fv(int[] is) {
		is[0] = 512290825 * ((Class_ra_Sub3) this).anInt8621;
		is[1] = ((Class_ra_Sub3) this).anInt8623 * -1679642481;
		is[2] = -1071049483 * ((Class_ra_Sub3) this).anInt8635;
		is[3] = 31822541 * ((Class_ra_Sub3) this).anInt8624;
	}

	public void df() {
		/* empty */
	}

	public Class_xa cn(int i, int i_469_, int[][] is, int[][] is_470_, int i_471_, int i_472_, int i_473_) {
		return new Class_xa_Sub3(this, i_472_, i_473_, i, i_469_, is, is_470_, i_471_);
	}

	public Class249 cz() {
		Class6 class6 = method5206(Thread.currentThread());
		return ((Class6) class6).aClass249_95;
	}

	public Class247 cj() {
		Class6 class6 = method5206(Thread.currentThread());
		return ((Class6) class6).aClass247_83;
	}

	public int cr() {
		return 0;
	}

	public void ki(int i, int i_474_, int i_475_, int i_476_, int i_477_, int i_478_, Class_ta class_ta, int i_479_, int i_480_, int i_481_, int i_482_, int i_483_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null) {
			Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
			int[] is = ((Class_ta_Sub3) class_ta_sub3).anIntArray8661;
			int[] is_484_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8662;
			int i_485_ = (((Class_ra_Sub3) this).anInt8623 * -1679642481 > i_480_ ? ((Class_ra_Sub3) this).anInt8623 * -1679642481 : i_480_);
			int i_486_ = ((((Class_ra_Sub3) this).anInt8624 * 31822541 < is.length + i_480_) ? ((Class_ra_Sub3) this).anInt8624 * 31822541 : is.length + i_480_);
			i_483_ <<= 8;
			i_481_ <<= 8;
			i_482_ <<= 8;
			int i_487_ = i_481_ + i_482_;
			i_483_ %= i_487_;
			i_475_ -= i;
			i_476_ -= i_474_;
			if (i_476_ + i_475_ < 0) {
				int i_488_ = (int) (Math.sqrt((double) (i_476_ * i_476_ + i_475_ * i_475_)) * 256.0);
				int i_489_ = i_488_ % i_487_;
				i_483_ = i_481_ + i_487_ - i_483_ - i_489_;
				i_483_ %= i_487_;
				if (i_483_ < 0)
					i_483_ += i_487_;
				i += i_475_;
				i_475_ = -i_475_;
				i_474_ += i_476_;
				i_476_ = -i_476_;
			}
			if (i_475_ > i_476_) {
				i_474_ <<= 16;
				i_474_ += 32768;
				i_476_ <<= 16;
				int i_490_ = (int) Math.floor(0.5 + ((double) i_476_ / (double) i_475_));
				i_475_ += i;
				int i_491_ = i_477_ >>> 24;
				int i_492_ = (int) Math.sqrt((double) (65536 + (i_490_ >> 8) * (i_490_ >> 8)));
				if (i_478_ == 0 || 1 == i_478_ && i_491_ == 255) {
					while (i <= i_475_) {
						int i_493_ = i_474_ >> 16;
						int i_494_ = i_493_ - i_480_;
						if (i >= 512290825 * ((Class_ra_Sub3) this).anInt8621 && i < (((Class_ra_Sub3) this).anInt8635 * -1071049483) && i_493_ >= i_485_ && i_493_ < i_486_ && i_483_ < i_481_) {
							int i_495_ = i_479_ + is[i_494_];
							if (i >= i_495_ && i < i_495_ + is_484_[i_494_])
								((Class_ra_Sub3) this).anIntArray8630[(((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_493_) + i] = i_477_;
						}
						i_474_ += i_490_;
						i++;
						i_483_ += i_492_;
						i_483_ %= i_487_;
					}
				} else if (i_478_ == 1) {
					i_477_ = (((i_477_ & 0xff00ff) * i_491_ >> 8 & 0xff00ff) + (i_491_ * (i_477_ & 0xff00) >> 8 & 0xff00) + (i_491_ << 24));
					int i_496_ = 256 - i_491_;
					while (i <= i_475_) {
						int i_497_ = i_474_ >> 16;
						int i_498_ = i_497_ - i_480_;
						if (i >= ((Class_ra_Sub3) this).anInt8621 * 512290825 && i < (-1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_497_ >= i_485_ && i_497_ < i_486_ && i_483_ < i_481_) {
							int i_499_ = is[i_498_] + i_479_;
							if (i >= i_499_ && i < is_484_[i_498_] + i_499_) {
								int i_500_ = ((i_497_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618)) + i);
								int i_501_ = (((Class_ra_Sub3) this).anIntArray8630[i_500_]);
								i_501_ = (((i_501_ & 0xff00) * i_496_ >> 8 & 0xff00) + ((i_501_ & 0xff00ff) * i_496_ >> 8 & 0xff00ff));
								((Class_ra_Sub3) this).anIntArray8630[i_500_] = i_501_ + i_477_;
							}
						}
						i_474_ += i_490_;
						i++;
						i_483_ += i_492_;
						i_483_ %= i_487_;
					}
				} else if (i_478_ == 2) {
					while (i <= i_475_) {
						int i_502_ = i_474_ >> 16;
						int i_503_ = i_502_ - i_480_;
						if (i >= 512290825 * ((Class_ra_Sub3) this).anInt8621 && i < (-1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_502_ >= i_485_ && i_502_ < i_486_ && i_483_ < i_481_) {
							int i_504_ = is[i_503_] + i_479_;
							if (i >= i_504_ && i < i_504_ + is_484_[i_503_]) {
								int i_505_ = i + (-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_502_);
								int i_506_ = (((Class_ra_Sub3) this).anIntArray8630[i_505_]);
								int i_507_ = i_506_ + i_477_;
								int i_508_ = ((i_477_ & 0xff00ff) + (i_506_ & 0xff00ff));
								i_506_ = (i_508_ & 0x1000100) + (i_507_ - i_508_ & 0x10000);
								((Class_ra_Sub3) this).anIntArray8630[i_505_] = i_507_ - i_506_ | i_506_ - (i_506_ >>> 8);
							}
						}
						i_474_ += i_490_;
						i++;
						i_483_ += i_492_;
						i_483_ %= i_487_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_475_ <<= 16;
				int i_509_ = (int) Math.floor((double) i_475_ / (double) i_476_ + 0.5);
				int i_510_ = (int) Math.sqrt((double) (65536 + (i_509_ >> 8) * (i_509_ >> 8)));
				i_476_ += i_474_;
				int i_511_ = i_477_ >>> 24;
				if (0 == i_478_ || 1 == i_478_ && 255 == i_511_) {
					while (i_474_ <= i_476_) {
						int i_512_ = i >> 16;
						int i_513_ = i_474_ - i_480_;
						if (i_474_ >= i_485_ && i_474_ < i_486_ && i_512_ >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i_512_ < (((Class_ra_Sub3) this).anInt8635 * -1071049483) && i_483_ < i_481_ && i_512_ >= is[i_513_] + i_479_ && i_512_ < is[i_513_] + i_479_ + is_484_[i_513_])
							((Class_ra_Sub3) this).anIntArray8630[(((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_474_) + i_512_] = i_477_;
						i += i_509_;
						i_474_++;
						i_483_ += i_510_;
						i_483_ %= i_487_;
					}
				} else if (1 == i_478_) {
					i_477_ = ((i_511_ * (i_477_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_477_ & 0xff00) * i_511_ >> 8 & 0xff00) + (i_511_ << 24));
					int i_514_ = 256 - i_511_;
					while (i_474_ <= i_476_) {
						int i_515_ = i >> 16;
						int i_516_ = i_474_ - i_480_;
						if (i_474_ >= i_485_ && i_474_ < i_486_ && i_515_ >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i_515_ < (((Class_ra_Sub3) this).anInt8635 * -1071049483) && i_483_ < i_481_ && i_515_ >= is[i_516_] + i_479_ && i_515_ < is_484_[i_516_] + (is[i_516_] + i_479_)) {
							int i_517_ = i_515_ + (((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_474_);
							int i_518_ = (((Class_ra_Sub3) this).anIntArray8630[i_517_]);
							i_518_ = ((i_514_ * (i_518_ & 0xff00ff) >> 8 & 0xff00ff) + (i_514_ * (i_518_ & 0xff00) >> 8 & 0xff00));
							((Class_ra_Sub3) this).anIntArray8630[(((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_474_) + i_515_] = i_477_ + i_518_;
						}
						i += i_509_;
						i_474_++;
						i_483_ += i_510_;
						i_483_ %= i_487_;
					}
				} else if (2 == i_478_) {
					while (i_474_ <= i_476_) {
						int i_519_ = i >> 16;
						int i_520_ = i_474_ - i_480_;
						if (i_474_ >= i_485_ && i_474_ < i_486_ && i_519_ >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i_519_ < (-1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_483_ < i_481_ && i_519_ >= is[i_520_] + i_479_ && (i_519_ < i_479_ + is[i_520_] + is_484_[i_520_])) {
							int i_521_ = i_519_ + (-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_474_);
							int i_522_ = (((Class_ra_Sub3) this).anIntArray8630[i_521_]);
							int i_523_ = i_522_ + i_477_;
							int i_524_ = (i_522_ & 0xff00ff) + (i_477_ & 0xff00ff);
							i_522_ = (i_524_ & 0x1000100) + (i_523_ - i_524_ & 0x10000);
							((Class_ra_Sub3) this).anIntArray8630[i_521_] = i_523_ - i_522_ | i_522_ - (i_522_ >>> 8);
						}
						i += i_509_;
						i_474_++;
						i_483_ += i_510_;
						i_483_ %= i_487_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public boolean iv() {
		return false;
	}

	public Class76_Sub2 jp() {
		return new Class76_Sub2_Sub1(this);
	}

	void method5199(int i) {
		((Class_ra_Sub3) this).anInt8650 = i * -76798145;
		((Class_ra_Sub3) this).aClass6Array8647 = new Class6[((Class_ra_Sub3) this).anInt8650 * -595900225];
		for (int i_525_ = 0; i_525_ < ((Class_ra_Sub3) this).anInt8650 * -595900225; i_525_++)
			((Class_ra_Sub3) this).aClass6Array8647[i_525_] = new Class6(this);
	}

	public void cm(Class81 class81) {
		method5200(((Class_ra_Sub3) this).anIntArray8630 != null, null != ((Class_ra_Sub3) this).aFloatArray8620, false, class81);
	}

	void method5200(boolean bool, boolean bool_526_, boolean bool_527_, Class81 class81) {
		Class6 class6 = method5206(Thread.currentThread());
		for (Class325_Sub3_Sub1 class325_sub3_sub1 = ((Class325_Sub3_Sub1) class81.aClass461_675.method5694(1464376272)); class325_sub3_sub1 != null; class325_sub3_sub1 = ((Class325_Sub3_Sub1) class81.aClass461_675.method5695(-938927049))) {
			int i = class325_sub3_sub1.anInt9497 >> 12;
			int i_528_ = class325_sub3_sub1.anInt9493 >> 12;
			int i_529_ = class325_sub3_sub1.anInt9489 >> 12;
			float f = ((float) i_529_ * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[10]) + ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[2] * (float) i) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[6]) * (float) i_528_) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[14]));
			float f_530_ = (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[15] + ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[7] * (float) i_528_) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[3]) * (float) i + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[11]) * (float) i_529_));
			if (!(f < -f_530_)) {
				float f_531_ = (f * ((Class_ra_Sub3) this).aFloat8637 / f_530_ + ((Class_ra_Sub3) this).aFloat8639);
				if (!(f > ((Class6) class6).aFloat87)) {
					float f_532_ = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[8]) * (float) i_529_ + ((float) i * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[0]) + (float) i_528_ * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[4])) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[12]));
					float f_533_ = ((float) i * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[1]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[5]) * (float) i_528_ + (float) i_529_ * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[9]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[13]));
					if (!(f_532_ < -f_530_) && !(f_532_ > f_530_) && !(f_533_ < -f_530_) && !(f_533_ > f_530_)) {
						float f_534_ = (float) class325_sub3_sub1.anInt9494 / 4096.0F;
						float f_535_ = ((((Class_ra_Sub3) this).aClass249_8633.aFloatArray2631[0]) * f_534_ + f_532_);
						float f_536_ = (f_534_ * (((Class_ra_Sub3) this).aClass249_8633.aFloatArray2631[3]) + f_530_);
						float f_537_ = ((f_532_ * ((Class_ra_Sub3) this).aFloat8640 / f_530_) + ((Class_ra_Sub3) this).aFloat8641);
						float f_538_ = (((Class_ra_Sub3) this).aFloat8643 + (((Class_ra_Sub3) this).aFloat8642 * f_533_ / f_530_));
						float f_539_ = (((Class_ra_Sub3) this).aFloat8641 + (((Class_ra_Sub3) this).aFloat8640 * f_535_ / f_536_));
						method5196(bool, bool_526_, bool_527_, class325_sub3_sub1, (int) f_537_, (int) f_538_, f_531_, (int) (f_539_ < f_537_ ? f_537_ - f_539_ : f_539_ - f_537_));
					}
				}
			}
		}
	}

	public void fb(int i, int i_540_, int i_541_, int i_542_, int i_543_, int i_544_, byte[] is, int i_545_, int i_546_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null && (i_541_ > 0 && i_542_ > 0)) {
			int i_547_ = 0;
			int i_548_ = 0;
			int i_549_ = (i_545_ << 16) / i_541_;
			int i_550_ = (is.length / i_545_ << 16) / i_542_;
			int i_551_ = (i_540_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933) + i);
			int i_552_ = ((Class_ra_Sub3) this).anInt8618 * -1504772933 - i_541_;
			if (i_540_ + i_542_ > ((Class_ra_Sub3) this).anInt8624 * 31822541)
				i_542_ -= (i_540_ + i_542_ - 31822541 * ((Class_ra_Sub3) this).anInt8624);
			if (i_540_ < ((Class_ra_Sub3) this).anInt8623 * -1679642481) {
				int i_553_ = ((Class_ra_Sub3) this).anInt8623 * -1679642481 - i_540_;
				i_542_ -= i_553_;
				i_551_ += i_553_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618);
				i_548_ += i_550_ * i_553_;
			}
			if (i + i_541_ > -1071049483 * ((Class_ra_Sub3) this).anInt8635) {
				int i_554_ = (i + i_541_ - -1071049483 * ((Class_ra_Sub3) this).anInt8635);
				i_541_ -= i_554_;
				i_552_ += i_554_;
			}
			if (i < 512290825 * ((Class_ra_Sub3) this).anInt8621) {
				int i_555_ = ((Class_ra_Sub3) this).anInt8621 * 512290825 - i;
				i_541_ -= i_555_;
				i_551_ += i_555_;
				i_547_ += i_549_ * i_555_;
				i_552_ += i_555_;
			}
			int i_556_ = i_543_ >>> 24;
			int i_557_ = i_544_ >>> 24;
			if (i_546_ == 0 || 1 == i_546_ && 255 == i_556_ && i_557_ == 255) {
				int i_558_ = i_547_;
				for (int i_559_ = -i_542_; i_559_ < 0; i_559_++) {
					int i_560_ = i_545_ * (i_548_ >> 16);
					for (int i_561_ = -i_541_; i_561_ < 0; i_561_++) {
						if (0 != is[(i_547_ >> 16) + i_560_])
							((Class_ra_Sub3) this).anIntArray8630[i_551_++] = i_544_;
						else
							((Class_ra_Sub3) this).anIntArray8630[i_551_++] = i_543_;
						i_547_ += i_549_;
					}
					i_548_ += i_550_;
					i_547_ = i_558_;
					i_551_ += i_552_;
				}
			} else if (i_546_ == 1) {
				int i_562_ = i_547_;
				for (int i_563_ = -i_542_; i_563_ < 0; i_563_++) {
					int i_564_ = i_545_ * (i_548_ >> 16);
					for (int i_565_ = -i_541_; i_565_ < 0; i_565_++) {
						int i_566_ = i_543_;
						if (0 != is[(i_547_ >> 16) + i_564_])
							i_566_ = i_544_;
						int i_567_ = i_566_ >>> 24;
						int i_568_ = 255 - i_567_;
						int i_569_ = ((Class_ra_Sub3) this).anIntArray8630[i_551_];
						((Class_ra_Sub3) this).anIntArray8630[i_551_++] = (((i_567_ * (i_566_ & 0xff00) + (i_569_ & 0xff00) * i_568_) & 0xff0000) + ((i_568_ * (i_569_ & 0xff00ff) + (i_566_ & 0xff00ff) * i_567_) & ~0xff00ff)) >> 8;
						i_547_ += i_549_;
					}
					i_548_ += i_550_;
					i_547_ = i_562_;
					i_551_ += i_552_;
				}
			} else if (i_546_ == 2) {
				int i_570_ = i_547_;
				for (int i_571_ = -i_542_; i_571_ < 0; i_571_++) {
					int i_572_ = (i_548_ >> 16) * i_545_;
					for (int i_573_ = -i_541_; i_573_ < 0; i_573_++) {
						int i_574_ = i_543_;
						if (is[i_572_ + (i_547_ >> 16)] != 0)
							i_574_ = i_544_;
						if (i_574_ != 0) {
							int i_575_ = (((Class_ra_Sub3) this).anIntArray8630[i_551_]);
							int i_576_ = i_575_ + i_574_;
							int i_577_ = (i_574_ & 0xff00ff) + (i_575_ & 0xff00ff);
							i_575_ = (i_576_ - i_577_ & 0x10000) + (i_577_ & 0x1000100);
							((Class_ra_Sub3) this).anIntArray8630[i_551_++] = i_576_ - i_575_ | i_575_ - (i_575_ >>> 8);
						} else
							i_551_++;
						i_547_ += i_549_;
					}
					i_548_ += i_550_;
					i_547_ = i_570_;
					i_551_ += i_552_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void method5201(boolean bool, boolean bool_578_, boolean bool_579_, int i, int i_580_, float f, int i_581_, int i_582_, int i_583_, int i_584_, int i_585_, int i_586_) {
		if (0 != i_581_ && 0 != i_582_) {
			if (65535 != i_583_) {
				Class56 class56 = anInterface_ma4227.method221(i_583_, -714431671);
				if (!class56.aBoolean533) {
					if (29299027 * ((Class_ra_Sub3) this).anInt8651 != i_583_) {
						Class61 class61 = (Class61) ((Class_ra_Sub3) this).aClass367_8649.get((long) i_583_);
						if (null == class61) {
							int[] is = method5209(i_583_);
							if (null == is)
								return;
							int i_587_ = ((anInterface_ma4227.method221(i_583_, 1032948580).anInt532) * -1963453415);
							class61 = method4795(is, 0, i_587_, i_587_, i_587_, (byte) -128);
							((Class_ra_Sub3) this).aClass367_8649.put(class61, (long) i_583_);
						}
						((Class_ra_Sub3) this).anInt8651 = i_583_ * 1024940763;
						((Class_ra_Sub3) this).aClass61_8631 = class61;
					}
					((Class61_Sub3) ((Class_ra_Sub3) this).aClass61_8631).method742(bool, bool_578_, bool_579_, i - i_581_, i_580_ - i_582_, f, i_581_ << 1, i_582_ << 1, i_585_, i_584_, i_586_, 1, Class369.aClass369_6817 != class56.aClass369_524);
					return;
				}
			}
			method5210(bool_578_, i, i_580_, f, i_581_, i_584_, i_586_);
		}
	}

	public Class61 ha(int i, int i_588_, boolean bool, boolean bool_589_) {
		if (bool)
			return new Class61_Sub3_Sub2(this, i, i_588_);
		return new Class61_Sub3_Sub1(this, i, i_588_);
	}

	public void RA(boolean bool) {
		Class6 class6 = method5206(Thread.currentThread());
		((Class6) class6).aBoolean111 = bool;
	}

	void cc(float f, float f_590_, float f_591_, float f_592_, float f_593_, float f_594_) {
		/* empty */
	}

	public void ci(Class249 class249) {
		((Class_ra_Sub3) this).aClass249_8633.method2510(class249);
		method5188();
	}

	public void gz(int i, int i_595_, int i_596_, int i_597_, int i_598_, int i_599_) {
		if (null != ((Class_ra_Sub3) this).anIntArray8630) {
			i_596_ -= i;
			i_597_ -= i_595_;
			if (i_597_ == 0) {
				if (i_596_ >= 0)
					XA(i, i_595_, i_596_ + 1, i_598_, i_599_);
				else
					XA(i_596_ + i, i_595_, -i_596_ + 1, i_598_, i_599_);
			} else if (0 == i_596_) {
				if (i_597_ >= 0)
					G(i, i_595_, i_597_ + 1, i_598_, i_599_);
				else
					G(i, i_597_ + i_595_, -i_597_ + 1, i_598_, i_599_);
			} else {
				if (i_597_ + i_596_ < 0) {
					i += i_596_;
					i_596_ = -i_596_;
					i_595_ += i_597_;
					i_597_ = -i_597_;
				}
				if (i_596_ > i_597_) {
					i_595_ <<= 16;
					i_595_ += 32768;
					i_597_ <<= 16;
					int i_600_ = (int) Math.floor(0.5 + ((double) i_597_ / (double) i_596_));
					i_596_ += i;
					if (i < 512290825 * ((Class_ra_Sub3) this).anInt8621) {
						i_595_ += i_600_ * ((((Class_ra_Sub3) this).anInt8621 * 512290825) - i);
						i = ((Class_ra_Sub3) this).anInt8621 * 512290825;
					}
					if (i_596_ >= -1071049483 * ((Class_ra_Sub3) this).anInt8635)
						i_596_ = (((Class_ra_Sub3) this).anInt8635 * -1071049483 - 1);
					int i_601_ = i_598_ >>> 24;
					if (i_599_ == 0 || 1 == i_599_ && 255 == i_601_) {
						for (/**/; i <= i_596_; i++) {
							int i_602_ = i_595_ >> 16;
							if (i_602_ >= (-1679642481 * ((Class_ra_Sub3) this).anInt8623) && i_602_ < (((Class_ra_Sub3) this).anInt8624 * 31822541))
								((Class_ra_Sub3) this).anIntArray8630[i_602_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933) + i] = i_598_;
							i_595_ += i_600_;
						}
					} else if (i_599_ == 1) {
						i_598_ = (((i_598_ & 0xff00ff) * i_601_ >> 8 & 0xff00ff) + ((i_598_ & 0xff00) * i_601_ >> 8 & 0xff00) + (i_601_ << 24));
						int i_603_ = 256 - i_601_;
						for (/**/; i <= i_596_; i++) {
							int i_604_ = i_595_ >> 16;
							if (i_604_ >= (((Class_ra_Sub3) this).anInt8623 * -1679642481) && i_604_ < 31822541 * (((Class_ra_Sub3) this).anInt8624)) {
								int i_605_ = i + (i_604_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933));
								int i_606_ = (((Class_ra_Sub3) this).anIntArray8630[i_605_]);
								i_606_ = ((i_603_ * (i_606_ & 0xff00ff) >> 8 & 0xff00ff) + (i_603_ * (i_606_ & 0xff00) >> 8 & 0xff00));
								((Class_ra_Sub3) this).anIntArray8630[i_605_] = i_606_ + i_598_;
							}
							i_595_ += i_600_;
						}
					} else if (2 == i_599_) {
						for (/**/; i <= i_596_; i++) {
							int i_607_ = i_595_ >> 16;
							if (i_607_ >= (-1679642481 * ((Class_ra_Sub3) this).anInt8623) && i_607_ < (((Class_ra_Sub3) this).anInt8624 * 31822541)) {
								int i_608_ = i + (((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_607_);
								int i_609_ = (((Class_ra_Sub3) this).anIntArray8630[i_608_]);
								int i_610_ = i_609_ + i_598_;
								int i_611_ = ((i_609_ & 0xff00ff) + (i_598_ & 0xff00ff));
								i_609_ = ((i_610_ - i_611_ & 0x10000) + (i_611_ & 0x1000100));
								((Class_ra_Sub3) this).anIntArray8630[i_608_] = i_610_ - i_609_ | i_609_ - (i_609_ >>> 8);
							}
							i_595_ += i_600_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_596_ <<= 16;
					int i_612_ = (int) Math.floor((double) i_596_ / (double) i_597_ + 0.5);
					i_597_ += i_595_;
					if (i_595_ < -1679642481 * ((Class_ra_Sub3) this).anInt8623) {
						i += (((Class_ra_Sub3) this).anInt8623 * -1679642481 - i_595_) * i_612_;
						i_595_ = ((Class_ra_Sub3) this).anInt8623 * -1679642481;
					}
					if (i_597_ >= ((Class_ra_Sub3) this).anInt8624 * 31822541)
						i_597_ = 31822541 * ((Class_ra_Sub3) this).anInt8624 - 1;
					int i_613_ = i_598_ >>> 24;
					if (i_599_ == 0 || 1 == i_599_ && i_613_ == 255) {
						for (/**/; i_595_ <= i_597_; i_595_++) {
							int i_614_ = i >> 16;
							if (i_614_ >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i_614_ < -1071049483 * ((Class_ra_Sub3) this).anInt8635)
								((Class_ra_Sub3) this).anIntArray8630[(-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_595_) + i_614_] = i_598_;
							i += i_612_;
						}
					} else if (1 == i_599_) {
						i_598_ = (((i_598_ & 0xff00) * i_613_ >> 8 & 0xff00) + ((i_598_ & 0xff00ff) * i_613_ >> 8 & 0xff00ff) + (i_613_ << 24));
						int i_615_ = 256 - i_613_;
						for (/**/; i_595_ <= i_597_; i_595_++) {
							int i_616_ = i >> 16;
							if (i_616_ >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i_616_ < -1071049483 * ((Class_ra_Sub3) this).anInt8635) {
								int i_617_ = ((-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_595_) + i_616_);
								int i_618_ = (((Class_ra_Sub3) this).anIntArray8630[i_617_]);
								i_618_ = ((i_615_ * (i_618_ & 0xff00) >> 8 & 0xff00) + (i_615_ * (i_618_ & 0xff00ff) >> 8 & 0xff00ff));
								((Class_ra_Sub3) this).anIntArray8630[i_616_ + (((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_595_)] = i_598_ + i_618_;
							}
							i += i_612_;
						}
					} else if (i_599_ == 2) {
						for (/**/; i_595_ <= i_597_; i_595_++) {
							int i_619_ = i >> 16;
							if (i_619_ >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i_619_ < (((Class_ra_Sub3) this).anInt8635 * -1071049483)) {
								int i_620_ = (i_619_ + (((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_595_));
								int i_621_ = (((Class_ra_Sub3) this).anIntArray8630[i_620_]);
								int i_622_ = i_598_ + i_621_;
								int i_623_ = ((i_621_ & 0xff00ff) + (i_598_ & 0xff00ff));
								i_621_ = (i_623_ & 0x1000100) + (i_622_ - i_623_ & 0x10000);
								((Class_ra_Sub3) this).anIntArray8630[i_620_] = i_622_ - i_621_ | i_621_ - (i_621_ >>> 8);
							}
							i += i_612_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void IA(float f) {
		((Class_ra_Sub3) this).anInt8645 = -1109799723 * (int) (f * 65535.0F);
	}

	public void m(int i, float f, float f_624_, float f_625_, float f_626_, float f_627_) {
		((Class_ra_Sub3) this).anInt8628 = (int) (65535.0F * f) * -557706933;
		((Class_ra_Sub3) this).anInt8646 = (int) (f_624_ * 65535.0F) * -781081669;
		float f_628_ = (float) Math.sqrt((double) (f_627_ * f_627_ + (f_626_ * f_626_ + f_625_ * f_625_)));
		((Class_ra_Sub3) this).anInt8625 = 1565949885 * (int) (65535.0F * f_625_ / f_628_);
		((Class_ra_Sub3) this).anInt8626 = 951383331 * (int) (f_626_ * 65535.0F / f_628_);
		((Class_ra_Sub3) this).anInt8627 = -2011013933 * (int) (65535.0F * f_627_ / f_628_);
	}

	public void J(int i) {
		/* empty */
	}

	public Class263 ho(Class524 class524, Class87_Sub2[] class87_sub2s, boolean bool) {
		int[] is = new int[class87_sub2s.length];
		int[] is_629_ = new int[class87_sub2s.length];
		boolean bool_630_ = false;
		for (int i = 0; i < class87_sub2s.length; i++) {
			is[i] = class87_sub2s[i].method986();
			is_629_[i] = class87_sub2s[i].method994();
			if (class87_sub2s[i].method985())
				bool_630_ = true;
		}
		if (bool) {
			if (bool_630_)
				return new Class263_Sub2(this, class524, class87_sub2s, is, is_629_);
			return new Class263_Sub3(this, class524, class87_sub2s, is, is_629_);
		}
		if (bool_630_)
			throw new IllegalArgumentException("");
		return new Class263_Sub4(this, class524, class87_sub2s, is, is_629_);
	}

	public void gq(int i, int i_631_, int i_632_, int i_633_, int i_634_, int i_635_, int i_636_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null) {
			Class6 class6 = method5206(Thread.currentThread());
			Class38 class38 = ((Class6) class6).aClass38_94;
			int i_637_ = i_632_ - i;
			int i_638_ = i_633_ - i_631_;
			int i_639_ = i_637_ >= 0 ? i_637_ : -i_637_;
			int i_640_ = i_638_ >= 0 ? i_638_ : -i_638_;
			int i_641_ = i_639_;
			if (i_641_ < i_640_)
				i_641_ = i_640_;
			if (0 != i_641_) {
				int i_642_ = (i_637_ << 16) / i_641_;
				int i_643_ = (i_638_ << 16) / i_641_;
				i_637_ += i_642_ >> 16;
				i_638_ += i_643_ >> 16;
				if (i_643_ <= i_642_)
					i_642_ = -i_642_;
				else
					i_643_ = -i_643_;
				int i_644_ = i_643_ * i_635_ >> 17;
				int i_645_ = i_643_ * i_635_ + 1 >> 17;
				int i_646_ = i_635_ * i_642_ >> 17;
				int i_647_ = 1 + i_635_ * i_642_ >> 17;
				i -= class38.method534();
				i_631_ -= class38.method537();
				int i_648_ = i_644_ + i;
				int i_649_ = i - i_645_;
				int i_650_ = i_637_ + i - i_645_;
				int i_651_ = i_637_ + i + i_644_;
				int i_652_ = i_646_ + i_631_;
				int i_653_ = i_631_ - i_647_;
				int i_654_ = i_631_ + i_638_ - i_647_;
				int i_655_ = i_631_ + i_638_ + i_646_;
				if (i_636_ == 0)
					((Class38) class38).anInt402 = 0;
				else if (i_636_ == 1)
					((Class38) class38).anInt402 = 255 - (i_634_ >>> 24);
				else
					throw new IllegalArgumentException();
				RA(false);
				((Class38) class38).aBoolean387 = (i_648_ < 0 || i_648_ > ((Class38) class38).anInt396 || i_649_ < 0 || i_649_ > ((Class38) class38).anInt396 || i_650_ < 0 || i_650_ > ((Class38) class38).anInt396);
				class38.method539(true, false, false, (float) i_652_, (float) i_653_, (float) i_654_, (float) i_648_, (float) i_649_, (float) i_650_, 100.0F, 100.0F, 100.0F, i_634_);
				((Class38) class38).aBoolean387 = (i_648_ < 0 || i_648_ > ((Class38) class38).anInt396 || i_650_ < 0 || i_650_ > ((Class38) class38).anInt396 || i_651_ < 0 || i_651_ > ((Class38) class38).anInt396);
				class38.method539(true, false, false, (float) i_652_, (float) i_654_, (float) i_655_, (float) i_648_, (float) i_650_, (float) i_651_, 100.0F, 100.0F, 100.0F, i_634_);
				RA(true);
			}
		}
	}

	public void js(int i, int i_656_, int i_657_, int i_658_) {
		/* empty */
	}

	public void cf(Class92 class92) {
		/* empty */
	}

	public Class76_Sub2 jw() {
		return new Class76_Sub2_Sub1(this);
	}

	public Class92 iq(int i, int i_659_, int i_660_, int i_661_, int i_662_, int i_663_) {
		return null;
	}

	public boolean cg() {
		return false;
	}

	public boolean ky() {
		return false;
	}

	public void by(int i, int i_664_, int i_665_, int i_666_, int i_667_, int i_668_, int i_669_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null) {
			Class6 class6 = method5206(Thread.currentThread());
			Class38 class38 = ((Class6) class6).aClass38_94;
			int i_670_ = i_665_ - i;
			int i_671_ = i_666_ - i_664_;
			int i_672_ = i_670_ >= 0 ? i_670_ : -i_670_;
			int i_673_ = i_671_ >= 0 ? i_671_ : -i_671_;
			int i_674_ = i_672_;
			if (i_674_ < i_673_)
				i_674_ = i_673_;
			if (0 != i_674_) {
				int i_675_ = (i_670_ << 16) / i_674_;
				int i_676_ = (i_671_ << 16) / i_674_;
				i_670_ += i_675_ >> 16;
				i_671_ += i_676_ >> 16;
				if (i_676_ <= i_675_)
					i_675_ = -i_675_;
				else
					i_676_ = -i_676_;
				int i_677_ = i_676_ * i_668_ >> 17;
				int i_678_ = i_676_ * i_668_ + 1 >> 17;
				int i_679_ = i_668_ * i_675_ >> 17;
				int i_680_ = 1 + i_668_ * i_675_ >> 17;
				i -= class38.method534();
				i_664_ -= class38.method537();
				int i_681_ = i_677_ + i;
				int i_682_ = i - i_678_;
				int i_683_ = i_670_ + i - i_678_;
				int i_684_ = i_670_ + i + i_677_;
				int i_685_ = i_679_ + i_664_;
				int i_686_ = i_664_ - i_680_;
				int i_687_ = i_664_ + i_671_ - i_680_;
				int i_688_ = i_664_ + i_671_ + i_679_;
				if (i_669_ == 0)
					((Class38) class38).anInt402 = 0;
				else if (i_669_ == 1)
					((Class38) class38).anInt402 = 255 - (i_667_ >>> 24);
				else
					throw new IllegalArgumentException();
				RA(false);
				((Class38) class38).aBoolean387 = (i_681_ < 0 || i_681_ > ((Class38) class38).anInt396 || i_682_ < 0 || i_682_ > ((Class38) class38).anInt396 || i_683_ < 0 || i_683_ > ((Class38) class38).anInt396);
				class38.method539(true, false, false, (float) i_685_, (float) i_686_, (float) i_687_, (float) i_681_, (float) i_682_, (float) i_683_, 100.0F, 100.0F, 100.0F, i_667_);
				((Class38) class38).aBoolean387 = (i_681_ < 0 || i_681_ > ((Class38) class38).anInt396 || i_683_ < 0 || i_683_ > ((Class38) class38).anInt396 || i_684_ < 0 || i_684_ > ((Class38) class38).anInt396);
				class38.method539(true, false, false, (float) i_685_, (float) i_687_, (float) i_688_, (float) i_681_, (float) i_683_, (float) i_684_, 100.0F, 100.0F, 100.0F, i_667_);
				RA(true);
			}
		}
	}

	public void ja(int i, Class77 class77) {
		for (int i_689_ = 0; i_689_ < ((Class_ra_Sub3) this).aClass6Array8647.length; i_689_++) {
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_689_]).anInt90 = 428165519 * ((Class6) (((Class_ra_Sub3) this).aClass6Array8647[i_689_])).anInt88;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_689_]).anInt92 = 1365791405 * i;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_689_]).anInt88 = class77.anInt652 * -194741821;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_689_]).anInt93 = class77.anInt650 * -2137611395;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_689_]).aBoolean91 = true;
		}
	}

	public boolean ac() {
		return false;
	}

	public void dz(int i, Class77 class77) {
		Class6 class6 = method5206(Thread.currentThread());
		((Class6) class6).anInt92 = i * 1365791405;
		((Class6) class6).anInt88 = -194741821 * class77.anInt652;
		((Class6) class6).anInt93 = -2137611395 * class77.anInt650;
	}

	public boolean cu() {
		return false;
	}

	public void bk(int i, int i_690_, float f, int i_691_, int i_692_, float f_693_, int i_694_, int i_695_, float f_696_, int i_697_, int i_698_, int i_699_, int i_700_) {
		boolean bool = ((Class_ra_Sub3) this).anIntArray8630 != null;
		boolean bool_701_ = ((Class_ra_Sub3) this).aFloatArray8620 != null;
		if (bool || bool_701_) {
			Class6 class6 = method5206(Thread.currentThread());
			Class38 class38 = ((Class6) class6).aClass38_94;
			((Class38) class38).aBoolean384 = false;
			i -= ((Class_ra_Sub3) this).anInt8621 * 512290825;
			i_691_ -= ((Class_ra_Sub3) this).anInt8621 * 512290825;
			i_694_ -= ((Class_ra_Sub3) this).anInt8621 * 512290825;
			i_690_ -= ((Class_ra_Sub3) this).anInt8623 * -1679642481;
			i_692_ -= ((Class_ra_Sub3) this).anInt8623 * -1679642481;
			i_695_ -= ((Class_ra_Sub3) this).anInt8623 * -1679642481;
			((Class38) class38).aBoolean387 = (i < 0 || i > ((Class38) class38).anInt396 || i_691_ < 0 || i_691_ > ((Class38) class38).anInt396 || i_694_ < 0 || i_694_ > ((Class38) class38).anInt396);
			int i_702_ = i_697_ >>> 24;
			if (i_700_ == 0 || 1 == i_700_ && 255 == i_702_) {
				((Class38) class38).anInt402 = 0;
				((Class38) class38).aBoolean383 = false;
				class38.method538(bool, bool_701_, false, (float) i_690_, (float) i_692_, (float) i_695_, (float) i, (float) i_691_, (float) i_694_, f, f_693_, f_696_, i_697_, i_698_, i_699_);
			} else if (i_700_ == 1) {
				((Class38) class38).anInt402 = 255 - i_702_;
				((Class38) class38).aBoolean383 = false;
				class38.method538(bool, bool_701_, false, (float) i_690_, (float) i_692_, (float) i_695_, (float) i, (float) i_691_, (float) i_694_, f, f_693_, f_696_, i_697_, i_698_, i_699_);
			} else if (2 == i_700_) {
				((Class38) class38).anInt402 = 128;
				((Class38) class38).aBoolean383 = true;
				class38.method538(bool, bool_701_, false, (float) i_690_, (float) i_692_, (float) i_695_, (float) i, (float) i_691_, (float) i_694_, f, f_693_, f_696_, i_697_, i_698_, i_699_);
			} else
				throw new IllegalArgumentException();
			((Class38) class38).aBoolean384 = true;
		}
	}

	public void method_do(float f, float f_703_, float f_704_, float[] fs) {
		float f_705_ = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[7] * f_703_) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[15] + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[3] * f)) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[11] * f_704_));
		float f_706_ = (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[12] + f * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[0] + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[4] * f_703_) + (f_704_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[8]));
		float f_707_ = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[5] * f_703_) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[1] * f + ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[13]) + (f_704_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[9]));
		float f_708_ = ((f_703_ * ((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[6]) + (((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[14] + f * (((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[2])) + (((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[10] * f_704_));
		fs[0] = (((Class_ra_Sub3) this).aFloat8641 + ((Class_ra_Sub3) this).aFloat8640 * f_706_ / f_705_);
		fs[1] = (((Class_ra_Sub3) this).aFloat8642 * f_707_ / f_705_ + ((Class_ra_Sub3) this).aFloat8643);
		fs[2] = f_708_;
	}

	public Class_xa hp(int i, int i_709_, int[][] is, int[][] is_710_, int i_711_, int i_712_, int i_713_) {
		return new Class_xa_Sub3(this, i_712_, i_713_, i, i_709_, is, is_710_, i_711_);
	}

	public Class76_Sub2 ag() {
		return new Class76_Sub2_Sub1(this);
	}

	Interface8_Impl1_Impl2 method5202(int i, int i_714_) {
		return new Class12(i, i_714_);
	}

	public Interface8_Impl1_Impl2 az(int i, int i_715_, Class72 class72, Class86 class86, int i_716_) {
		return method5202(i, i_715_);
	}

	public void fl(int[] is) {
		is[0] = 512290825 * ((Class_ra_Sub3) this).anInt8621;
		is[1] = ((Class_ra_Sub3) this).anInt8623 * -1679642481;
		is[2] = -1071049483 * ((Class_ra_Sub3) this).anInt8635;
		is[3] = 31822541 * ((Class_ra_Sub3) this).anInt8624;
	}

	public Class51 dt() {
		return new Class51(0, "Pure Java", 1, "CPU", 0L);
	}

	public Class51 dq() {
		return new Class51(0, "Pure Java", 1, "CPU", 0L);
	}

	void dv(int i, int i_717_) throws Exception_Sub1 {
		aClass76_Sub1_4234.method883(i, i_717_);
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) 9872);
	}

	public Class76_Sub2 jk() {
		return new Class76_Sub2_Sub1(this);
	}

	void dj(int i, int i_718_) throws Exception_Sub1 {
		aClass76_Sub1_4234.method883(i, i_718_);
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) -2280);
	}

	void dl(int i, int i_719_) throws Exception_Sub1 {
		aClass76_Sub1_4234.method883(i, i_719_);
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) -5235);
	}

	void dm(int i, int i_720_) throws Exception_Sub1 {
		aClass76_Sub1_4234.method883(i, i_720_);
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) -8253);
	}

	public void dy() {
		/* empty */
	}

	public void dx() {
		/* empty */
	}

	void dd() {
		if (((Class_ra_Sub3) this).aBoolean8616) {
			Class95_Sub12.method1137(true, false, -989563379);
			((Class_ra_Sub3) this).aBoolean8616 = false;
		}
		((Class_ra_Sub3) this).aBoolean8648 = true;
	}

	public boolean v() {
		return false;
	}

	public boolean ex() {
		return false;
	}

	void di() {
		if (((Class_ra_Sub3) this).aBoolean8616) {
			Class95_Sub12.method1137(true, false, -1644503685);
			((Class_ra_Sub3) this).aBoolean8616 = false;
		}
		((Class_ra_Sub3) this).aBoolean8648 = true;
	}

	public Class_ta ch(int i, int i_721_, int[] is, int[] is_722_) {
		return new Class_ta_Sub3(i, i_721_, is, is_722_);
	}

	public void dw(int i) {
		int i_723_ = i - -2005538129 * ((Class_ra_Sub3) this).anInt8615;
		for (Class330_Sub13 class330_sub13 = (Class330_Sub13) ((Class_ra_Sub3) this).aClass367_8644.method4287(-597749787); null != class330_sub13; class330_sub13 = (Class330_Sub13) ((Class_ra_Sub3) this).aClass367_8644.method4291(-1947425629)) {
			if (((Class330_Sub13) class330_sub13).aBoolean7602) {
				((Class330_Sub13) class330_sub13).anInt7604 += i_723_;
				int i_724_ = ((Class330_Sub13) class330_sub13).anInt7604 / 50;
				if (i_724_ > 0) {
					Class56 class56 = anInterface_ma4227.method221((((Class330_Sub13) class330_sub13).anInt7601), -987025858);
					float f = (float) (-1963453415 * class56.anInt532);
					class330_sub13.method3310((int) (f * ((float) i_723_ / 1000.0F * (float) class56.aByte531 / 64.0F)), (int) ((float) class56.aByte530 * ((float) i_723_ / 1000.0F) / 64.0F * f));
					((Class330_Sub13) class330_sub13).anInt7604 -= i_724_ * 50;
				}
				((Class330_Sub13) class330_sub13).aBoolean7602 = false;
			}
		}
		((Class_ra_Sub3) this).anInt8615 = i * 79801423;
		((Class_ra_Sub3) this).aClass367_8649.method4292(5, (byte) 37);
		((Class_ra_Sub3) this).aClass367_8644.method4292(5, (byte) 53);
	}

	public boolean ed() {
		return false;
	}

	public int[] ar(int i, int i_725_, int i_726_, int i_727_) {
		if (((Class_ra_Sub3) this).anIntArray8630 == null)
			throw new IllegalStateException("");
		int[] is = new int[i_726_ * i_727_];
		int i_728_ = 0;
		for (int i_729_ = 0; i_729_ < i_727_; i_729_++) {
			int i_730_ = ((i_729_ + i_725_) * (((Class_ra_Sub3) this).anInt8618 * -1504772933) + i);
			for (int i_731_ = 0; i_731_ < i_726_; i_731_++)
				is[i_728_++] = ((Class_ra_Sub3) this).anIntArray8630[i_731_ + i_730_];
		}
		return is;
	}

	public void au() {
		((Class_ra_Sub3) this).anInt8636 = 0;
		((Class_ra_Sub3) this).anInt8622 = 0;
		((Class_ra_Sub3) this).anInt8638 = -1418534287 * ((Class_ra_Sub3) this).anInt8618;
		((Class_ra_Sub3) this).anInt8614 = 873410731 * ((Class_ra_Sub3) this).anInt8619;
		method5195();
	}

	void dc(int i, int i_732_) throws Exception_Sub1 {
		aClass76_Sub1_4234.method883(i, i_732_);
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) 27937);
	}

	public Class92 iu(Class92 class92, Class92 class92_733_, float f, Class92 class92_734_) {
		return null;
	}

	public boolean ea() {
		return false;
	}

	public Interface8_Impl1_Impl1 av(int i, int i_735_, int i_736_) {
		return new Class43(i, i_735_);
	}

	public void hr(int i, Class_ta class_ta, int i_737_, int i_738_) {
		if (null != ((Class_ra_Sub3) this).anIntArray8630) {
			Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
			int[] is = ((Class_ta_Sub3) class_ta_sub3).anIntArray8661;
			int[] is_739_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8662;
			int i_740_;
			if (((Class_ra_Sub3) this).anInt8624 * 31822541 < is.length + i_738_)
				i_740_ = 31822541 * ((Class_ra_Sub3) this).anInt8624 - i_738_;
			else
				i_740_ = is.length;
			int i_741_;
			if (-1679642481 * ((Class_ra_Sub3) this).anInt8623 > i_738_) {
				i_741_ = -1679642481 * ((Class_ra_Sub3) this).anInt8623 - i_738_;
				i_738_ = -1679642481 * ((Class_ra_Sub3) this).anInt8623;
			} else
				i_741_ = 0;
			if (i_740_ - i_741_ > 0) {
				int i_742_ = -1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_738_;
				for (int i_743_ = i_741_; i_743_ < i_740_; i_743_++) {
					int i_744_ = is[i_743_] + i_737_;
					int i_745_ = is_739_[i_743_];
					if (((Class_ra_Sub3) this).anInt8621 * 512290825 > i_744_) {
						i_745_ -= (512290825 * ((Class_ra_Sub3) this).anInt8621 - i_744_);
						i_744_ = ((Class_ra_Sub3) this).anInt8621 * 512290825;
					}
					if (-1071049483 * ((Class_ra_Sub3) this).anInt8635 < i_744_ + i_745_)
						i_745_ = (-1071049483 * ((Class_ra_Sub3) this).anInt8635 - i_744_);
					i_744_ += i_742_;
					for (int i_746_ = -i_745_; i_746_ < 0; i_746_++)
						((Class_ra_Sub3) this).anIntArray8630[i_744_++] = i;
					i_742_ += ((Class_ra_Sub3) this).anInt8618 * -1504772933;
				}
			}
		}
	}

	public boolean el() {
		return false;
	}

	public boolean ku() {
		return false;
	}

	public boolean eh() {
		return false;
	}

	public void kn(Class81 class81) {
		method5200(((Class_ra_Sub3) this).anIntArray8630 != null, null != ((Class_ra_Sub3) this).aFloatArray8620, false, class81);
	}

	public boolean er() {
		return false;
	}

	public void ib(int i, int i_747_, int i_748_) {
		for (int i_749_ = 0; i_749_ < ((Class_ra_Sub3) this).aClass6Array8647.length; i_749_++) {
			Class6 class6 = ((Class_ra_Sub3) this).aClass6Array8647[i_749_];
			((Class6) class6).anInt88 = (i & 0xffffff) * -1381026891;
			int i_750_ = ((Class6) class6).anInt88 * 536502941 >>> 16 & 0xff;
			if (i_750_ < 2)
				i_750_ = 2;
			int i_751_ = 536502941 * ((Class6) class6).anInt88 >> 8 & 0xff;
			if (i_751_ < 2)
				i_751_ = 2;
			int i_752_ = ((Class6) class6).anInt88 * 536502941 & 0xff;
			if (i_752_ < 2)
				i_752_ = 2;
			((Class6) class6).anInt88 = (i_750_ << 16 | i_751_ << 8 | i_752_) * -1381026891;
			if (i_747_ < 0)
				((Class6) class6).aBoolean86 = false;
			else
				((Class6) class6).aBoolean86 = true;
		}
	}

	public boolean ee() {
		return false;
	}

	public boolean ez() {
		return false;
	}

	public boolean ev() {
		return false;
	}

	public boolean ep() {
		return false;
	}

	public Class61 hk(int i, int i_753_, int i_754_, int i_755_, boolean bool) {
		if (null == ((Class_ra_Sub3) this).anIntArray8630)
			throw new IllegalStateException("");
		int[] is = new int[i_755_ * i_754_];
		int i_756_ = i + i_753_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933);
		int i_757_ = ((Class_ra_Sub3) this).anInt8618 * -1504772933 - i_754_;
		for (int i_758_ = 0; i_758_ < i_755_; i_758_++) {
			int i_759_ = i_758_ * i_754_;
			for (int i_760_ = 0; i_760_ < i_754_; i_760_++)
				is[i_760_ + i_759_] = ((Class_ra_Sub3) this).anIntArray8630[i_756_++];
			i_756_ += i_757_;
		}
		if (bool)
			return new Class61_Sub3_Sub2(this, is, i_754_, i_755_);
		return new Class61_Sub3_Sub1(this, is, i_754_, i_755_);
	}

	public boolean et() {
		return false;
	}

	public boolean ey() {
		return false;
	}

	public boolean eq() {
		return false;
	}

	public boolean ek() {
		return false;
	}

	public boolean eg() {
		return true;
	}

	public void cy(int i) {
		Class387_Sub3.anInt8166 = Class387_Sub3.anInt8222 = i;
		if (-595900225 * ((Class_ra_Sub3) this).anInt8650 > 1)
			throw new IllegalStateException();
		method5199(-595900225 * ((Class_ra_Sub3) this).anInt8650);
		method5208(0);
	}

	public void ef(boolean bool) {
		/* empty */
	}

	public void eu(boolean bool) {
		/* empty */
	}

	Class76_Sub1 es(Canvas canvas, int i, int i_761_) {
		return Class330_Sub26.method3394(this, canvas, i, i_761_, 87336488);
	}

	Class76_Sub1 fu(Canvas canvas, int i, int i_762_) {
		return Class330_Sub26.method3394(this, canvas, i, i_762_, 1346063531);
	}

	Class76_Sub1 ft(Canvas canvas, int i, int i_763_) {
		return Class330_Sub26.method3394(this, canvas, i, i_763_, -79830240);
	}

	void method5203(int i, int i_764_, int i_765_, int i_766_, int i_767_, int i_768_, int i_769_, int i_770_) {
		if (null != ((Class_ra_Sub3) this).anIntArray8630 && (i_764_ >= ((Class_ra_Sub3) this).anInt8623 * -1679642481 && i_764_ < ((Class_ra_Sub3) this).anInt8624 * 31822541)) {
			int i_771_ = i + i_764_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618);
			int i_772_ = i_766_ >>> 24;
			int i_773_ = i_768_ + i_769_;
			int i_774_ = i_770_ % i_773_;
			if (i_767_ == 0 || i_767_ == 1 && i_772_ == 255) {
				int i_775_ = 0;
				while (i_775_ < i_765_) {
					if ((i + i_775_ >= ((Class_ra_Sub3) this).anInt8621 * 512290825) && (i + i_775_ < ((Class_ra_Sub3) this).anInt8635 * -1071049483) && i_774_ < i_768_)
						((Class_ra_Sub3) this).anIntArray8630[i_775_ + i_771_] = i_766_;
					i_775_++;
					i_774_ = ++i_774_ % i_773_;
				}
			} else if (1 == i_767_) {
				i_766_ = (((i_766_ & 0xff00) * i_772_ >> 8 & 0xff00) + (i_772_ * (i_766_ & 0xff00ff) >> 8 & 0xff00ff) + (i_772_ << 24));
				int i_776_ = 256 - i_772_;
				int i_777_ = 0;
				while (i_777_ < i_765_) {
					if ((i + i_777_ >= 512290825 * ((Class_ra_Sub3) this).anInt8621) && (i + i_777_ < ((Class_ra_Sub3) this).anInt8635 * -1071049483) && i_774_ < i_768_) {
						int i_778_ = (((Class_ra_Sub3) this).anIntArray8630[i_771_ + i_777_]);
						i_778_ = ((i_776_ * (i_778_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_778_ & 0xff00) * i_776_ >> 8 & 0xff00));
						((Class_ra_Sub3) this).anIntArray8630[i_771_ + i_777_] = i_778_ + i_766_;
					}
					i_777_++;
					i_774_ = ++i_774_ % i_773_;
				}
			} else if (2 == i_767_) {
				int i_779_ = 0;
				while (i_779_ < i_765_) {
					if ((i_779_ + i >= ((Class_ra_Sub3) this).anInt8621 * 512290825) && (i_779_ + i < -1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_774_ < i_768_) {
						int i_780_ = (((Class_ra_Sub3) this).anIntArray8630[i_779_ + i_771_]);
						int i_781_ = i_766_ + i_780_;
						int i_782_ = (i_780_ & 0xff00ff) + (i_766_ & 0xff00ff);
						i_780_ = (i_781_ - i_782_ & 0x10000) + (i_782_ & 0x1000100);
						((Class_ra_Sub3) this).anIntArray8630[i_771_ + i_779_] = i_781_ - i_780_ | i_780_ - (i_780_ >>> 8);
					}
					i_779_++;
					i_774_ = ++i_774_ % i_773_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public boolean eb() {
		return false;
	}

	public int[] fm(int i, int i_783_, int i_784_, int i_785_) {
		if (((Class_ra_Sub3) this).anIntArray8630 == null)
			throw new IllegalStateException("");
		int[] is = new int[i_784_ * i_785_];
		int i_786_ = 0;
		for (int i_787_ = 0; i_787_ < i_785_; i_787_++) {
			int i_788_ = ((i_787_ + i_783_) * (((Class_ra_Sub3) this).anInt8618 * -1504772933) + i);
			for (int i_789_ = 0; i_789_ < i_784_; i_789_++)
				is[i_786_++] = ((Class_ra_Sub3) this).anIntArray8630[i_789_ + i_788_];
		}
		return is;
	}

	public void fr() {
		/* empty */
	}

	public void method5204(int[] is) {
		is[0] = ((Class_ra_Sub3) this).anInt8618 * -1504772933;
		is[1] = 1229852533 * ((Class_ra_Sub3) this).anInt8619;
	}

	public void method5205(int[] is) {
		is[0] = ((Class_ra_Sub3) this).anInt8618 * -1504772933;
		is[1] = 1229852533 * ((Class_ra_Sub3) this).anInt8619;
	}

	public void je(int i, Class77 class77) {
		Class6 class6 = method5206(Thread.currentThread());
		((Class6) class6).anInt92 = i * 1365791405;
		((Class6) class6).anInt88 = -194741821 * class77.anInt652;
		((Class6) class6).anInt93 = -2137611395 * class77.anInt650;
	}

	void de() {
		if (((Class_ra_Sub3) this).aBoolean8616) {
			Class95_Sub12.method1137(true, false, -1033810037);
			((Class_ra_Sub3) this).aBoolean8616 = false;
		}
		((Class_ra_Sub3) this).aBoolean8648 = true;
	}

	public int ln() {
		return 0;
	}

	public void fj(int i, int i_790_, int i_791_, int i_792_) {
		((Class_ra_Sub3) this).anInt8636 = i * 1238685301;
		((Class_ra_Sub3) this).anInt8622 = -780345205 * i_790_;
		((Class_ra_Sub3) this).anInt8638 = i_791_ * -1098702653;
		((Class_ra_Sub3) this).anInt8614 = 1394695071 * i_792_;
		method5195();
	}

	public void fa(int i, int i_793_, int i_794_, int i_795_) {
		((Class_ra_Sub3) this).anInt8636 = i * 1238685301;
		((Class_ra_Sub3) this).anInt8622 = -780345205 * i_793_;
		((Class_ra_Sub3) this).anInt8638 = i_794_ * -1098702653;
		((Class_ra_Sub3) this).anInt8614 = 1394695071 * i_795_;
		method5195();
	}

	public void fz(float f, float f_796_) {
		((Class_ra_Sub3) this).aFloat8637 = f_796_ - f;
		((Class_ra_Sub3) this).aFloat8639 = f + f_796_ - 1.0F;
		for (int i = 0; i < -595900225 * ((Class_ra_Sub3) this).anInt8650; i++) {
			Class6 class6 = ((Class_ra_Sub3) this).aClass6Array8647[i];
			Class38 class38 = ((Class6) class6).aClass38_94;
			((Class38) class38).aFloat395 = ((Class_ra_Sub3) this).aFloat8637;
			((Class38) class38).aFloat394 = ((Class_ra_Sub3) this).aFloat8639;
		}
	}

	public boolean ew() {
		return false;
	}

	public void fy(int i, int i_797_, int i_798_, int i_799_) {
		if (512290825 * ((Class_ra_Sub3) this).anInt8621 < i)
			((Class_ra_Sub3) this).anInt8621 = 1907727929 * i;
		if (((Class_ra_Sub3) this).anInt8623 * -1679642481 < i_797_)
			((Class_ra_Sub3) this).anInt8623 = 766013039 * i_797_;
		if (((Class_ra_Sub3) this).anInt8635 * -1071049483 > i_798_)
			((Class_ra_Sub3) this).anInt8635 = -711985315 * i_798_;
		if (31822541 * ((Class_ra_Sub3) this).anInt8624 > i_799_)
			((Class_ra_Sub3) this).anInt8624 = -550983163 * i_799_;
		method5195();
	}

	public void fe(int i, int i_800_, int i_801_, int i_802_) {
		if (512290825 * ((Class_ra_Sub3) this).anInt8621 < i)
			((Class_ra_Sub3) this).anInt8621 = 1907727929 * i;
		if (((Class_ra_Sub3) this).anInt8623 * -1679642481 < i_800_)
			((Class_ra_Sub3) this).anInt8623 = 766013039 * i_800_;
		if (((Class_ra_Sub3) this).anInt8635 * -1071049483 > i_801_)
			((Class_ra_Sub3) this).anInt8635 = -711985315 * i_801_;
		if (31822541 * ((Class_ra_Sub3) this).anInt8624 > i_802_)
			((Class_ra_Sub3) this).anInt8624 = -550983163 * i_802_;
		method5195();
	}

	Class6 method5206(Runnable runnable) {
		for (int i = 0; i < -595900225 * ((Class_ra_Sub3) this).anInt8650; i++) {
			if ((((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i]).aRunnable101) == runnable)
				return ((Class_ra_Sub3) this).aClass6Array8647[i];
		}
		return null;
	}

	public int gf(int i, int i_803_, int i_804_, int i_805_, int i_806_, int i_807_) {
		int i_808_ = 0;
		float f = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[10] * (float) i_804_) + (((float) i * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[2]) + ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[14] + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[6] * (float) i_803_)));
		float f_809_ = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[2] * (float) i_805_) + ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[14] + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[6] * (float) i_806_) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[10] * (float) i_807_));
		float f_810_ = (((float) i_803_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[7]) + (((float) i * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[3]) + ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[15]) + (float) i_804_ * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[11]));
		float f_811_ = (((float) i_806_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[7]) + ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[3] * (float) i_805_) + ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[15]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[11] * (float) i_807_));
		if (f < -f_810_ && f_809_ < -f_811_)
			i_808_ |= 0x10;
		else if (f > f_810_ && f_809_ > f_811_)
			i_808_ |= 0x20;
		float f_812_ = (((float) i_803_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[4]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[12] + (float) i * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[0])) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[8] * (float) i_804_));
		float f_813_ = (((float) i_806_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[4]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[12] + (float) i_805_ * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[0])) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[8] * (float) i_807_));
		if (f_812_ < -f_810_ && f_813_ < -f_811_)
			i_808_ |= 0x1;
		if (f_812_ > f_810_ && f_813_ > f_811_)
			i_808_ |= 0x2;
		float f_814_ = (((float) i * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[1]) + ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[13] + ((float) i_803_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[5]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[9] * (float) i_804_));
		float f_815_ = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[9] * (float) i_807_) + ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[5] * (float) i_806_) + ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[1] * (float) i_805_) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[13]))));
		if (f_814_ < -f_810_ && f_815_ < -f_811_)
			i_808_ |= 0x4;
		if (f_814_ > f_810_ && f_815_ > f_811_)
			i_808_ |= 0x8;
		return i_808_;
	}

	public void dk(int i) {
		int i_816_ = i - -2005538129 * ((Class_ra_Sub3) this).anInt8615;
		for (Class330_Sub13 class330_sub13 = (Class330_Sub13) ((Class_ra_Sub3) this).aClass367_8644.method4287(-597749787); null != class330_sub13; class330_sub13 = (Class330_Sub13) ((Class_ra_Sub3) this).aClass367_8644.method4291(-1947425629)) {
			if (((Class330_Sub13) class330_sub13).aBoolean7602) {
				((Class330_Sub13) class330_sub13).anInt7604 += i_816_;
				int i_817_ = ((Class330_Sub13) class330_sub13).anInt7604 / 50;
				if (i_817_ > 0) {
					Class56 class56 = anInterface_ma4227.method221((((Class330_Sub13) class330_sub13).anInt7601), -495242425);
					float f = (float) (-1963453415 * class56.anInt532);
					class330_sub13.method3310((int) (f * ((float) i_816_ / 1000.0F * (float) class56.aByte531 / 64.0F)), (int) ((float) class56.aByte530 * ((float) i_816_ / 1000.0F) / 64.0F * f));
					((Class330_Sub13) class330_sub13).anInt7604 -= i_817_ * 50;
				}
				((Class330_Sub13) class330_sub13).aBoolean7602 = false;
			}
		}
		((Class_ra_Sub3) this).anInt8615 = i * 79801423;
		((Class_ra_Sub3) this).aClass367_8649.method4292(5, (byte) 37);
		((Class_ra_Sub3) this).aClass367_8644.method4292(5, (byte) 64);
	}

	public void ff(int[] is) {
		is[0] = 512290825 * ((Class_ra_Sub3) this).anInt8621;
		is[1] = ((Class_ra_Sub3) this).anInt8623 * -1679642481;
		is[2] = -1071049483 * ((Class_ra_Sub3) this).anInt8635;
		is[3] = 31822541 * ((Class_ra_Sub3) this).anInt8624;
	}

	public void fi(int i, int i_818_) {
		if (0 != (i & 0x1))
			B(0, 0, ((Class_ra_Sub3) this).anInt8618 * -1504772933, 1229852533 * ((Class_ra_Sub3) this).anInt8619, i_818_, 0);
		if (0 != (i & 0x2))
			method5197();
	}

	public void fn(int i, int i_819_) {
		if (0 != (i & 0x1))
			B(0, 0, ((Class_ra_Sub3) this).anInt8618 * -1504772933, 1229852533 * ((Class_ra_Sub3) this).anInt8619, i_819_, 0);
		if (0 != (i & 0x2))
			method5197();
	}

	public void fd(int i, int i_820_, int i_821_, int i_822_, int i_823_, int i_824_) {
		if (null != ((Class_ra_Sub3) this).anIntArray8630) {
			if (i < ((Class_ra_Sub3) this).anInt8621 * 512290825) {
				i_821_ -= ((Class_ra_Sub3) this).anInt8621 * 512290825 - i;
				i = 512290825 * ((Class_ra_Sub3) this).anInt8621;
			}
			if (i_820_ < ((Class_ra_Sub3) this).anInt8623 * -1679642481) {
				i_822_ -= ((Class_ra_Sub3) this).anInt8623 * -1679642481 - i_820_;
				i_820_ = -1679642481 * ((Class_ra_Sub3) this).anInt8623;
			}
			if (i_821_ + i > ((Class_ra_Sub3) this).anInt8635 * -1071049483)
				i_821_ = -1071049483 * ((Class_ra_Sub3) this).anInt8635 - i;
			if (i_820_ + i_822_ > ((Class_ra_Sub3) this).anInt8624 * 31822541)
				i_822_ = 31822541 * ((Class_ra_Sub3) this).anInt8624 - i_820_;
			if (i_821_ > 0 && i_822_ > 0 && i <= -1071049483 * ((Class_ra_Sub3) this).anInt8635 && i_820_ <= ((Class_ra_Sub3) this).anInt8624 * 31822541) {
				int i_825_ = ((Class_ra_Sub3) this).anInt8618 * -1504772933 - i_821_;
				int i_826_ = i + i_820_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618);
				int i_827_ = i_823_ >>> 24;
				if (0 == i_824_ || i_824_ == 1 && i_827_ == 255) {
					int i_828_ = i_821_ >> 3;
					int i_829_ = i_821_ & 0x7;
					i_821_ = i_826_ - 1;
					for (int i_830_ = -i_822_; i_830_ < 0; i_830_++) {
						if (i_828_ > 0) {
							i = i_828_;
							do {
								((Class_ra_Sub3) this).anIntArray8630[++i_821_] = i_823_;
								((Class_ra_Sub3) this).anIntArray8630[++i_821_] = i_823_;
								((Class_ra_Sub3) this).anIntArray8630[++i_821_] = i_823_;
								((Class_ra_Sub3) this).anIntArray8630[++i_821_] = i_823_;
								((Class_ra_Sub3) this).anIntArray8630[++i_821_] = i_823_;
								((Class_ra_Sub3) this).anIntArray8630[++i_821_] = i_823_;
								((Class_ra_Sub3) this).anIntArray8630[++i_821_] = i_823_;
								((Class_ra_Sub3) this).anIntArray8630[++i_821_] = i_823_;
							} while (--i > 0);
						}
						if (i_829_ > 0) {
							i = i_829_;
							do
								((Class_ra_Sub3) this).anIntArray8630[++i_821_] = i_823_;
							while (--i > 0);
						}
						i_821_ += i_825_;
					}
				} else if (i_824_ == 1) {
					i_823_ = ((((i_823_ & ~0xff00ff) >>> 8) * i_827_ & ~0xff00ff) + (i_827_ * (i_823_ & 0xff00ff) >> 8 & 0xff00ff));
					int i_831_ = 256 - i_827_;
					for (int i_832_ = 0; i_832_ < i_822_; i_832_++) {
						for (int i_833_ = -i_821_; i_833_ < 0; i_833_++) {
							int i_834_ = (((Class_ra_Sub3) this).anIntArray8630[i_826_]);
							i_834_ = (((i_834_ & 0xff00ff) * i_831_ >> 8 & 0xff00ff) + (((i_834_ & ~0xff00ff) >>> 8) * i_831_ & ~0xff00ff));
							((Class_ra_Sub3) this).anIntArray8630[i_826_++] = i_823_ + i_834_;
						}
						i_826_ += i_825_;
					}
				} else if (2 == i_824_) {
					for (int i_835_ = 0; i_835_ < i_822_; i_835_++) {
						for (int i_836_ = -i_821_; i_836_ < 0; i_836_++) {
							int i_837_ = (((Class_ra_Sub3) this).anIntArray8630[i_826_]);
							int i_838_ = i_823_ + i_837_;
							int i_839_ = (i_823_ & 0xff00ff) + (i_837_ & 0xff00ff);
							i_837_ = (i_838_ - i_839_ & 0x10000) + (i_839_ & 0x1000100);
							((Class_ra_Sub3) this).anIntArray8630[i_826_++] = i_838_ - i_837_ | i_837_ - (i_837_ >>> 8);
						}
						i_826_ += i_825_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void fx(int i, int i_840_, int i_841_, int i_842_, int i_843_, int i_844_) {
		if (null != ((Class_ra_Sub3) this).anIntArray8630) {
			if (i < ((Class_ra_Sub3) this).anInt8621 * 512290825) {
				i_841_ -= ((Class_ra_Sub3) this).anInt8621 * 512290825 - i;
				i = 512290825 * ((Class_ra_Sub3) this).anInt8621;
			}
			if (i_840_ < ((Class_ra_Sub3) this).anInt8623 * -1679642481) {
				i_842_ -= ((Class_ra_Sub3) this).anInt8623 * -1679642481 - i_840_;
				i_840_ = -1679642481 * ((Class_ra_Sub3) this).anInt8623;
			}
			if (i_841_ + i > ((Class_ra_Sub3) this).anInt8635 * -1071049483)
				i_841_ = -1071049483 * ((Class_ra_Sub3) this).anInt8635 - i;
			if (i_840_ + i_842_ > ((Class_ra_Sub3) this).anInt8624 * 31822541)
				i_842_ = 31822541 * ((Class_ra_Sub3) this).anInt8624 - i_840_;
			if (i_841_ > 0 && i_842_ > 0 && i <= -1071049483 * ((Class_ra_Sub3) this).anInt8635 && i_840_ <= ((Class_ra_Sub3) this).anInt8624 * 31822541) {
				int i_845_ = ((Class_ra_Sub3) this).anInt8618 * -1504772933 - i_841_;
				int i_846_ = i + i_840_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618);
				int i_847_ = i_843_ >>> 24;
				if (0 == i_844_ || i_844_ == 1 && i_847_ == 255) {
					int i_848_ = i_841_ >> 3;
					int i_849_ = i_841_ & 0x7;
					i_841_ = i_846_ - 1;
					for (int i_850_ = -i_842_; i_850_ < 0; i_850_++) {
						if (i_848_ > 0) {
							i = i_848_;
							do {
								((Class_ra_Sub3) this).anIntArray8630[++i_841_] = i_843_;
								((Class_ra_Sub3) this).anIntArray8630[++i_841_] = i_843_;
								((Class_ra_Sub3) this).anIntArray8630[++i_841_] = i_843_;
								((Class_ra_Sub3) this).anIntArray8630[++i_841_] = i_843_;
								((Class_ra_Sub3) this).anIntArray8630[++i_841_] = i_843_;
								((Class_ra_Sub3) this).anIntArray8630[++i_841_] = i_843_;
								((Class_ra_Sub3) this).anIntArray8630[++i_841_] = i_843_;
								((Class_ra_Sub3) this).anIntArray8630[++i_841_] = i_843_;
							} while (--i > 0);
						}
						if (i_849_ > 0) {
							i = i_849_;
							do
								((Class_ra_Sub3) this).anIntArray8630[++i_841_] = i_843_;
							while (--i > 0);
						}
						i_841_ += i_845_;
					}
				} else if (i_844_ == 1) {
					i_843_ = ((((i_843_ & ~0xff00ff) >>> 8) * i_847_ & ~0xff00ff) + (i_847_ * (i_843_ & 0xff00ff) >> 8 & 0xff00ff));
					int i_851_ = 256 - i_847_;
					for (int i_852_ = 0; i_852_ < i_842_; i_852_++) {
						for (int i_853_ = -i_841_; i_853_ < 0; i_853_++) {
							int i_854_ = (((Class_ra_Sub3) this).anIntArray8630[i_846_]);
							i_854_ = (((i_854_ & 0xff00ff) * i_851_ >> 8 & 0xff00ff) + (((i_854_ & ~0xff00ff) >>> 8) * i_851_ & ~0xff00ff));
							((Class_ra_Sub3) this).anIntArray8630[i_846_++] = i_843_ + i_854_;
						}
						i_846_ += i_845_;
					}
				} else if (2 == i_844_) {
					for (int i_855_ = 0; i_855_ < i_842_; i_855_++) {
						for (int i_856_ = -i_841_; i_856_ < 0; i_856_++) {
							int i_857_ = (((Class_ra_Sub3) this).anIntArray8630[i_846_]);
							int i_858_ = i_843_ + i_857_;
							int i_859_ = (i_843_ & 0xff00ff) + (i_857_ & 0xff00ff);
							i_857_ = (i_858_ - i_859_ & 0x10000) + (i_859_ & 0x1000100);
							((Class_ra_Sub3) this).anIntArray8630[i_846_++] = i_858_ - i_857_ | i_857_ - (i_857_ >>> 8);
						}
						i_846_ += i_845_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public boolean ei() {
		return false;
	}

	public void fp(int i, int i_860_, int i_861_, int i_862_, int i_863_, int i_864_, byte[] is, int i_865_, int i_866_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null && (i_861_ > 0 && i_862_ > 0)) {
			int i_867_ = 0;
			int i_868_ = 0;
			int i_869_ = (i_865_ << 16) / i_861_;
			int i_870_ = (is.length / i_865_ << 16) / i_862_;
			int i_871_ = (i_860_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933) + i);
			int i_872_ = ((Class_ra_Sub3) this).anInt8618 * -1504772933 - i_861_;
			if (i_860_ + i_862_ > ((Class_ra_Sub3) this).anInt8624 * 31822541)
				i_862_ -= (i_860_ + i_862_ - 31822541 * ((Class_ra_Sub3) this).anInt8624);
			if (i_860_ < ((Class_ra_Sub3) this).anInt8623 * -1679642481) {
				int i_873_ = ((Class_ra_Sub3) this).anInt8623 * -1679642481 - i_860_;
				i_862_ -= i_873_;
				i_871_ += i_873_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618);
				i_868_ += i_870_ * i_873_;
			}
			if (i + i_861_ > -1071049483 * ((Class_ra_Sub3) this).anInt8635) {
				int i_874_ = (i + i_861_ - -1071049483 * ((Class_ra_Sub3) this).anInt8635);
				i_861_ -= i_874_;
				i_872_ += i_874_;
			}
			if (i < 512290825 * ((Class_ra_Sub3) this).anInt8621) {
				int i_875_ = ((Class_ra_Sub3) this).anInt8621 * 512290825 - i;
				i_861_ -= i_875_;
				i_871_ += i_875_;
				i_867_ += i_869_ * i_875_;
				i_872_ += i_875_;
			}
			int i_876_ = i_863_ >>> 24;
			int i_877_ = i_864_ >>> 24;
			if (i_866_ == 0 || 1 == i_866_ && 255 == i_876_ && i_877_ == 255) {
				int i_878_ = i_867_;
				for (int i_879_ = -i_862_; i_879_ < 0; i_879_++) {
					int i_880_ = i_865_ * (i_868_ >> 16);
					for (int i_881_ = -i_861_; i_881_ < 0; i_881_++) {
						if (0 != is[(i_867_ >> 16) + i_880_])
							((Class_ra_Sub3) this).anIntArray8630[i_871_++] = i_864_;
						else
							((Class_ra_Sub3) this).anIntArray8630[i_871_++] = i_863_;
						i_867_ += i_869_;
					}
					i_868_ += i_870_;
					i_867_ = i_878_;
					i_871_ += i_872_;
				}
			} else if (i_866_ == 1) {
				int i_882_ = i_867_;
				for (int i_883_ = -i_862_; i_883_ < 0; i_883_++) {
					int i_884_ = i_865_ * (i_868_ >> 16);
					for (int i_885_ = -i_861_; i_885_ < 0; i_885_++) {
						int i_886_ = i_863_;
						if (0 != is[(i_867_ >> 16) + i_884_])
							i_886_ = i_864_;
						int i_887_ = i_886_ >>> 24;
						int i_888_ = 255 - i_887_;
						int i_889_ = ((Class_ra_Sub3) this).anIntArray8630[i_871_];
						((Class_ra_Sub3) this).anIntArray8630[i_871_++] = (((i_887_ * (i_886_ & 0xff00) + (i_889_ & 0xff00) * i_888_) & 0xff0000) + ((i_888_ * (i_889_ & 0xff00ff) + (i_886_ & 0xff00ff) * i_887_) & ~0xff00ff)) >> 8;
						i_867_ += i_869_;
					}
					i_868_ += i_870_;
					i_867_ = i_882_;
					i_871_ += i_872_;
				}
			} else if (i_866_ == 2) {
				int i_890_ = i_867_;
				for (int i_891_ = -i_862_; i_891_ < 0; i_891_++) {
					int i_892_ = (i_868_ >> 16) * i_865_;
					for (int i_893_ = -i_861_; i_893_ < 0; i_893_++) {
						int i_894_ = i_863_;
						if (is[i_892_ + (i_867_ >> 16)] != 0)
							i_894_ = i_864_;
						if (i_894_ != 0) {
							int i_895_ = (((Class_ra_Sub3) this).anIntArray8630[i_871_]);
							int i_896_ = i_895_ + i_894_;
							int i_897_ = (i_894_ & 0xff00ff) + (i_895_ & 0xff00ff);
							i_895_ = (i_896_ - i_897_ & 0x10000) + (i_897_ & 0x1000100);
							((Class_ra_Sub3) this).anIntArray8630[i_871_++] = i_896_ - i_895_ | i_895_ - (i_895_ >>> 8);
						} else
							i_871_++;
						i_867_ += i_869_;
					}
					i_868_ += i_870_;
					i_867_ = i_890_;
					i_871_ += i_872_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public int cd(int i, int i_898_) {
		return i | i_898_;
	}

	public void gb(int i, int i_899_, int i_900_, int i_901_, int i_902_, int i_903_, byte[] is, int i_904_, int i_905_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null && (i_900_ > 0 && i_901_ > 0)) {
			int i_906_ = 0;
			int i_907_ = 0;
			int i_908_ = (i_904_ << 16) / i_900_;
			int i_909_ = (is.length / i_904_ << 16) / i_901_;
			int i_910_ = (i_899_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933) + i);
			int i_911_ = ((Class_ra_Sub3) this).anInt8618 * -1504772933 - i_900_;
			if (i_899_ + i_901_ > ((Class_ra_Sub3) this).anInt8624 * 31822541)
				i_901_ -= (i_899_ + i_901_ - 31822541 * ((Class_ra_Sub3) this).anInt8624);
			if (i_899_ < ((Class_ra_Sub3) this).anInt8623 * -1679642481) {
				int i_912_ = ((Class_ra_Sub3) this).anInt8623 * -1679642481 - i_899_;
				i_901_ -= i_912_;
				i_910_ += i_912_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618);
				i_907_ += i_909_ * i_912_;
			}
			if (i + i_900_ > -1071049483 * ((Class_ra_Sub3) this).anInt8635) {
				int i_913_ = (i + i_900_ - -1071049483 * ((Class_ra_Sub3) this).anInt8635);
				i_900_ -= i_913_;
				i_911_ += i_913_;
			}
			if (i < 512290825 * ((Class_ra_Sub3) this).anInt8621) {
				int i_914_ = ((Class_ra_Sub3) this).anInt8621 * 512290825 - i;
				i_900_ -= i_914_;
				i_910_ += i_914_;
				i_906_ += i_908_ * i_914_;
				i_911_ += i_914_;
			}
			int i_915_ = i_902_ >>> 24;
			int i_916_ = i_903_ >>> 24;
			if (i_905_ == 0 || 1 == i_905_ && 255 == i_915_ && i_916_ == 255) {
				int i_917_ = i_906_;
				for (int i_918_ = -i_901_; i_918_ < 0; i_918_++) {
					int i_919_ = i_904_ * (i_907_ >> 16);
					for (int i_920_ = -i_900_; i_920_ < 0; i_920_++) {
						if (0 != is[(i_906_ >> 16) + i_919_])
							((Class_ra_Sub3) this).anIntArray8630[i_910_++] = i_903_;
						else
							((Class_ra_Sub3) this).anIntArray8630[i_910_++] = i_902_;
						i_906_ += i_908_;
					}
					i_907_ += i_909_;
					i_906_ = i_917_;
					i_910_ += i_911_;
				}
			} else if (i_905_ == 1) {
				int i_921_ = i_906_;
				for (int i_922_ = -i_901_; i_922_ < 0; i_922_++) {
					int i_923_ = i_904_ * (i_907_ >> 16);
					for (int i_924_ = -i_900_; i_924_ < 0; i_924_++) {
						int i_925_ = i_902_;
						if (0 != is[(i_906_ >> 16) + i_923_])
							i_925_ = i_903_;
						int i_926_ = i_925_ >>> 24;
						int i_927_ = 255 - i_926_;
						int i_928_ = ((Class_ra_Sub3) this).anIntArray8630[i_910_];
						((Class_ra_Sub3) this).anIntArray8630[i_910_++] = (((i_926_ * (i_925_ & 0xff00) + (i_928_ & 0xff00) * i_927_) & 0xff0000) + ((i_927_ * (i_928_ & 0xff00ff) + (i_925_ & 0xff00ff) * i_926_) & ~0xff00ff)) >> 8;
						i_906_ += i_908_;
					}
					i_907_ += i_909_;
					i_906_ = i_921_;
					i_910_ += i_911_;
				}
			} else if (i_905_ == 2) {
				int i_929_ = i_906_;
				for (int i_930_ = -i_901_; i_930_ < 0; i_930_++) {
					int i_931_ = (i_907_ >> 16) * i_904_;
					for (int i_932_ = -i_900_; i_932_ < 0; i_932_++) {
						int i_933_ = i_902_;
						if (is[i_931_ + (i_906_ >> 16)] != 0)
							i_933_ = i_903_;
						if (i_933_ != 0) {
							int i_934_ = (((Class_ra_Sub3) this).anIntArray8630[i_910_]);
							int i_935_ = i_934_ + i_933_;
							int i_936_ = (i_933_ & 0xff00ff) + (i_934_ & 0xff00ff);
							i_934_ = (i_935_ - i_936_ & 0x10000) + (i_936_ & 0x1000100);
							((Class_ra_Sub3) this).anIntArray8630[i_910_++] = i_935_ - i_934_ | i_934_ - (i_934_ >>> 8);
						} else
							i_910_++;
						i_906_ += i_908_;
					}
					i_907_ += i_909_;
					i_906_ = i_929_;
					i_910_ += i_911_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public Class_xa hx(int i, int i_937_, int[][] is, int[][] is_938_, int i_939_, int i_940_, int i_941_) {
		return new Class_xa_Sub3(this, i_940_, i_941_, i, i_937_, is, is_938_, i_939_);
	}

	public void gd(int i, int i_942_, int i_943_, int i_944_, int i_945_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null && (i_942_ >= -1679642481 * ((Class_ra_Sub3) this).anInt8623 && i_942_ < 31822541 * ((Class_ra_Sub3) this).anInt8624)) {
			if (i < 512290825 * ((Class_ra_Sub3) this).anInt8621) {
				i_943_ -= 512290825 * ((Class_ra_Sub3) this).anInt8621 - i;
				i = ((Class_ra_Sub3) this).anInt8621 * 512290825;
			}
			if (i_943_ + i > -1071049483 * ((Class_ra_Sub3) this).anInt8635)
				i_943_ = ((Class_ra_Sub3) this).anInt8635 * -1071049483 - i;
			int i_946_ = -1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_942_ + i;
			int i_947_ = i_944_ >>> 24;
			if (i_945_ == 0 || i_945_ == 1 && i_947_ == 255) {
				for (int i_948_ = 0; i_948_ < i_943_; i_948_++)
					((Class_ra_Sub3) this).anIntArray8630[i_948_ + i_946_] = i_944_;
			} else if (i_945_ == 1) {
				i_944_ = ((i_947_ << 24) + (((i_944_ & 0xff00ff) * i_947_ >> 8 & 0xff00ff) + (i_947_ * (i_944_ & 0xff00) >> 8 & 0xff00)));
				int i_949_ = 256 - i_947_;
				for (int i_950_ = 0; i_950_ < i_943_; i_950_++) {
					int i_951_ = (((Class_ra_Sub3) this).anIntArray8630[i_950_ + i_946_]);
					i_951_ = (((i_951_ & 0xff00) * i_949_ >> 8 & 0xff00) + ((i_951_ & 0xff00ff) * i_949_ >> 8 & 0xff00ff));
					((Class_ra_Sub3) this).anIntArray8630[i_950_ + i_946_] = i_944_ + i_951_;
				}
			} else if (i_945_ == 2) {
				for (int i_952_ = 0; i_952_ < i_943_; i_952_++) {
					int i_953_ = (((Class_ra_Sub3) this).anIntArray8630[i_952_ + i_946_]);
					int i_954_ = i_953_ + i_944_;
					int i_955_ = (i_953_ & 0xff00ff) + (i_944_ & 0xff00ff);
					i_953_ = (i_954_ - i_955_ & 0x10000) + (i_955_ & 0x1000100);
					((Class_ra_Sub3) this).anIntArray8630[i_946_ + i_952_] = i_954_ - i_953_ | i_953_ - (i_953_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void gp(Class_v class_v) {
		/* empty */
	}

	public void r(int i, int i_956_, int i_957_, int i_958_) {
		if (i < 0)
			i = 0;
		if (i_956_ < 0)
			i_956_ = 0;
		if (i_957_ > ((Class_ra_Sub3) this).anInt8618 * -1504772933)
			i_957_ = ((Class_ra_Sub3) this).anInt8618 * -1504772933;
		if (i_958_ > ((Class_ra_Sub3) this).anInt8619 * 1229852533)
			i_958_ = ((Class_ra_Sub3) this).anInt8619 * 1229852533;
		((Class_ra_Sub3) this).anInt8621 = i * 1907727929;
		((Class_ra_Sub3) this).anInt8635 = i_957_ * -711985315;
		((Class_ra_Sub3) this).anInt8623 = i_956_ * 766013039;
		((Class_ra_Sub3) this).anInt8624 = -550983163 * i_958_;
		method5195();
	}

	public void gj(int i, int i_959_, int i_960_, int i_961_, int i_962_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null && (i >= ((Class_ra_Sub3) this).anInt8621 * 512290825 && i < -1071049483 * ((Class_ra_Sub3) this).anInt8635)) {
			if (i_959_ < ((Class_ra_Sub3) this).anInt8623 * -1679642481) {
				i_960_ -= ((Class_ra_Sub3) this).anInt8623 * -1679642481 - i_959_;
				i_959_ = -1679642481 * ((Class_ra_Sub3) this).anInt8623;
			}
			if (i_960_ + i_959_ > ((Class_ra_Sub3) this).anInt8624 * 31822541)
				i_960_ = ((Class_ra_Sub3) this).anInt8624 * 31822541 - i_959_;
			int i_963_ = i + -1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_959_;
			int i_964_ = i_961_ >>> 24;
			if (i_962_ == 0 || 1 == i_962_ && i_964_ == 255) {
				for (int i_965_ = 0; i_965_ < i_960_; i_965_++)
					((Class_ra_Sub3) this).anIntArray8630[(i_963_ + i_965_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618))] = i_961_;
			} else if (1 == i_962_) {
				i_961_ = ((i_964_ << 24) + (((i_961_ & 0xff00ff) * i_964_ >> 8 & 0xff00ff) + ((i_961_ & 0xff00) * i_964_ >> 8 & 0xff00)));
				int i_966_ = 256 - i_964_;
				for (int i_967_ = 0; i_967_ < i_960_; i_967_++) {
					int i_968_ = i_963_ + (((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_967_);
					int i_969_ = ((Class_ra_Sub3) this).anIntArray8630[i_968_];
					i_969_ = ((i_966_ * (i_969_ & 0xff00) >> 8 & 0xff00) + (i_966_ * (i_969_ & 0xff00ff) >> 8 & 0xff00ff));
					((Class_ra_Sub3) this).anIntArray8630[i_968_] = i_969_ + i_961_;
				}
			} else if (2 == i_962_) {
				for (int i_970_ = 0; i_970_ < i_960_; i_970_++) {
					int i_971_ = (i_970_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933) + i_963_);
					int i_972_ = ((Class_ra_Sub3) this).anIntArray8630[i_971_];
					int i_973_ = i_972_ + i_961_;
					int i_974_ = (i_961_ & 0xff00ff) + (i_972_ & 0xff00ff);
					i_972_ = (i_973_ - i_974_ & 0x10000) + (i_974_ & 0x1000100);
					((Class_ra_Sub3) this).anIntArray8630[i_971_] = i_973_ - i_972_ | i_972_ - (i_972_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void gl(int i, int i_975_, int i_976_, int i_977_, int i_978_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null && (i >= ((Class_ra_Sub3) this).anInt8621 * 512290825 && i < -1071049483 * ((Class_ra_Sub3) this).anInt8635)) {
			if (i_975_ < ((Class_ra_Sub3) this).anInt8623 * -1679642481) {
				i_976_ -= ((Class_ra_Sub3) this).anInt8623 * -1679642481 - i_975_;
				i_975_ = -1679642481 * ((Class_ra_Sub3) this).anInt8623;
			}
			if (i_976_ + i_975_ > ((Class_ra_Sub3) this).anInt8624 * 31822541)
				i_976_ = ((Class_ra_Sub3) this).anInt8624 * 31822541 - i_975_;
			int i_979_ = i + -1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_975_;
			int i_980_ = i_977_ >>> 24;
			if (i_978_ == 0 || 1 == i_978_ && i_980_ == 255) {
				for (int i_981_ = 0; i_981_ < i_976_; i_981_++)
					((Class_ra_Sub3) this).anIntArray8630[(i_979_ + i_981_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618))] = i_977_;
			} else if (1 == i_978_) {
				i_977_ = ((i_980_ << 24) + (((i_977_ & 0xff00ff) * i_980_ >> 8 & 0xff00ff) + ((i_977_ & 0xff00) * i_980_ >> 8 & 0xff00)));
				int i_982_ = 256 - i_980_;
				for (int i_983_ = 0; i_983_ < i_976_; i_983_++) {
					int i_984_ = i_979_ + (((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_983_);
					int i_985_ = ((Class_ra_Sub3) this).anIntArray8630[i_984_];
					i_985_ = ((i_982_ * (i_985_ & 0xff00) >> 8 & 0xff00) + (i_982_ * (i_985_ & 0xff00ff) >> 8 & 0xff00ff));
					((Class_ra_Sub3) this).anIntArray8630[i_984_] = i_985_ + i_977_;
				}
			} else if (2 == i_978_) {
				for (int i_986_ = 0; i_986_ < i_976_; i_986_++) {
					int i_987_ = (i_986_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933) + i_979_);
					int i_988_ = ((Class_ra_Sub3) this).anIntArray8630[i_987_];
					int i_989_ = i_988_ + i_977_;
					int i_990_ = (i_977_ & 0xff00ff) + (i_988_ & 0xff00ff);
					i_988_ = (i_989_ - i_990_ & 0x10000) + (i_990_ & 0x1000100);
					((Class_ra_Sub3) this).anIntArray8630[i_987_] = i_989_ - i_988_ | i_988_ - (i_988_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void dg(int i, Class77 class77) {
		for (int i_991_ = 0; i_991_ < ((Class_ra_Sub3) this).aClass6Array8647.length; i_991_++) {
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_991_]).anInt90 = 428165519 * ((Class6) (((Class_ra_Sub3) this).aClass6Array8647[i_991_])).anInt88;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_991_]).anInt92 = 1365791405 * i;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_991_]).anInt88 = class77.anInt652 * -194741821;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_991_]).anInt93 = class77.anInt650 * -2137611395;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_991_]).aBoolean91 = true;
		}
	}

	public void cw(Class247 class247) {
		((Class_ra_Sub3) this).aClass247_8629 = class247;
		method5188();
	}

	public void gw(int i, int i_992_, int i_993_, int i_994_, int i_995_, int i_996_, Class_ta class_ta, int i_997_, int i_998_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null) {
			Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
			int[] is = ((Class_ta_Sub3) class_ta_sub3).anIntArray8661;
			int[] is_999_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8662;
			int i_1000_ = (((Class_ra_Sub3) this).anInt8623 * -1679642481 > i_998_ ? -1679642481 * ((Class_ra_Sub3) this).anInt8623 : i_998_);
			int i_1001_ = ((31822541 * ((Class_ra_Sub3) this).anInt8624 < is.length + i_998_) ? ((Class_ra_Sub3) this).anInt8624 * 31822541 : is.length + i_998_);
			i_993_ -= i;
			i_994_ -= i_992_;
			if (i_994_ + i_993_ < 0) {
				i += i_993_;
				i_993_ = -i_993_;
				i_992_ += i_994_;
				i_994_ = -i_994_;
			}
			if (i_993_ > i_994_) {
				i_992_ <<= 16;
				i_992_ += 32768;
				i_994_ <<= 16;
				int i_1002_ = (int) Math.floor((double) i_994_ / (double) i_993_ + 0.5);
				i_993_ += i;
				if (i < ((Class_ra_Sub3) this).anInt8621 * 512290825) {
					i_992_ += (512290825 * ((Class_ra_Sub3) this).anInt8621 - i) * i_1002_;
					i = ((Class_ra_Sub3) this).anInt8621 * 512290825;
				}
				if (i_993_ >= -1071049483 * ((Class_ra_Sub3) this).anInt8635)
					i_993_ = ((Class_ra_Sub3) this).anInt8635 * -1071049483 - 1;
				int i_1003_ = i_995_ >>> 24;
				if (i_996_ == 0 || i_996_ == 1 && i_1003_ == 255) {
					for (/**/; i <= i_993_; i++) {
						int i_1004_ = i_992_ >> 16;
						int i_1005_ = i_1004_ - i_998_;
						if (i_1004_ >= i_1000_ && i_1004_ < i_1001_) {
							int i_1006_ = is[i_1005_] + i_997_;
							if (i >= i_1006_ && i < is_999_[i_1005_] + i_1006_)
								((Class_ra_Sub3) this).anIntArray8630[i_1004_ * (-1504772933 * (((Class_ra_Sub3) this).anInt8618)) + i] = i_995_;
						}
						i_992_ += i_1002_;
					}
				} else if (i_996_ == 1) {
					i_995_ = ((i_1003_ * (i_995_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_995_ & 0xff00) * i_1003_ >> 8 & 0xff00) + (i_1003_ << 24));
					int i_1007_ = 256 - i_1003_;
					for (/**/; i <= i_993_; i++) {
						int i_1008_ = i_992_ >> 16;
						int i_1009_ = i_1008_ - i_998_;
						if (i_1008_ >= i_1000_ && i_1008_ < i_1001_) {
							int i_1010_ = is[i_1009_] + i_997_;
							if (i >= i_1010_ && i < i_1010_ + is_999_[i_1009_]) {
								int i_1011_ = ((-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_1008_) + i);
								int i_1012_ = (((Class_ra_Sub3) this).anIntArray8630[i_1011_]);
								i_1012_ = ((i_1007_ * (i_1012_ & 0xff00) >> 8 & 0xff00) + (i_1007_ * (i_1012_ & 0xff00ff) >> 8 & 0xff00ff));
								((Class_ra_Sub3) this).anIntArray8630[i_1011_] = i_1012_ + i_995_;
							}
						}
						i_992_ += i_1002_;
					}
				} else if (2 == i_996_) {
					for (/**/; i <= i_993_; i++) {
						int i_1013_ = i_992_ >> 16;
						int i_1014_ = i_1013_ - i_998_;
						if (i_1013_ >= i_1000_ && i_1013_ < i_1001_) {
							int i_1015_ = i_997_ + is[i_1014_];
							if (i >= i_1015_ && i < is_999_[i_1014_] + i_1015_) {
								int i_1016_ = i + (i_1013_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933));
								int i_1017_ = (((Class_ra_Sub3) this).anIntArray8630[i_1016_]);
								int i_1018_ = i_1017_ + i_995_;
								int i_1019_ = ((i_995_ & 0xff00ff) + (i_1017_ & 0xff00ff));
								i_1017_ = ((i_1018_ - i_1019_ & 0x10000) + (i_1019_ & 0x1000100));
								((Class_ra_Sub3) this).anIntArray8630[i_1016_] = i_1018_ - i_1017_ | i_1017_ - (i_1017_ >>> 8);
							}
						}
						i_992_ += i_1002_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_993_ <<= 16;
				int i_1020_ = (int) Math.floor((double) i_993_ / (double) i_994_ + 0.5);
				i_994_ += i_992_;
				if (i_992_ < i_1000_) {
					i += i_1020_ * (i_1000_ - i_992_);
					i_992_ = i_1000_;
				}
				if (i_994_ >= i_1001_)
					i_994_ = i_1001_ - 1;
				int i_1021_ = i_995_ >>> 24;
				if (i_996_ == 0 || 1 == i_996_ && 255 == i_1021_) {
					for (/**/; i_992_ <= i_994_; i_992_++) {
						int i_1022_ = i >> 16;
						int i_1023_ = i_992_ - i_998_;
						int i_1024_ = i_997_ + is[i_1023_];
						if ((i_1022_ >= ((Class_ra_Sub3) this).anInt8621 * 512290825) && i_1022_ < (-1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_1022_ >= i_1024_ && i_1022_ < i_1024_ + is_999_[i_1023_])
							((Class_ra_Sub3) this).anIntArray8630[(((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_992_) + i_1022_] = i_995_;
						i += i_1020_;
					}
				} else if (i_996_ == 1) {
					i_995_ = (((i_995_ & 0xff00ff) * i_1021_ >> 8 & 0xff00ff) + ((i_995_ & 0xff00) * i_1021_ >> 8 & 0xff00) + (i_1021_ << 24));
					int i_1025_ = 256 - i_1021_;
					for (/**/; i_992_ <= i_994_; i_992_++) {
						int i_1026_ = i >> 16;
						int i_1027_ = i_992_ - i_998_;
						int i_1028_ = i_997_ + is[i_1027_];
						if ((i_1026_ >= ((Class_ra_Sub3) this).anInt8621 * 512290825) && i_1026_ < (((Class_ra_Sub3) this).anInt8635 * -1071049483) && i_1026_ >= i_1028_ && i_1026_ < i_1028_ + is_999_[i_1027_]) {
							int i_1029_ = (i_992_ * (-1504772933 * (((Class_ra_Sub3) this).anInt8618)) + i_1026_);
							int i_1030_ = (((Class_ra_Sub3) this).anIntArray8630[i_1029_]);
							i_1030_ = (((i_1030_ & 0xff00ff) * i_1025_ >> 8 & 0xff00ff) + (i_1025_ * (i_1030_ & 0xff00) >> 8 & 0xff00));
							((Class_ra_Sub3) this).anIntArray8630[(i_1026_ + i_992_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933))] = i_995_ + i_1030_;
						}
						i += i_1020_;
					}
				} else if (2 == i_996_) {
					for (/**/; i_992_ <= i_994_; i_992_++) {
						int i_1031_ = i >> 16;
						int i_1032_ = i_992_ - i_998_;
						int i_1033_ = is[i_1032_] + i_997_;
						if ((i_1031_ >= 512290825 * ((Class_ra_Sub3) this).anInt8621) && i_1031_ < (-1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_1031_ >= i_1033_ && i_1031_ < i_1033_ + is_999_[i_1032_]) {
							int i_1034_ = ((((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_992_) + i_1031_);
							int i_1035_ = (((Class_ra_Sub3) this).anIntArray8630[i_1034_]);
							int i_1036_ = i_1035_ + i_995_;
							int i_1037_ = (i_995_ & 0xff00ff) + (i_1035_ & 0xff00ff);
							i_1035_ = (i_1037_ & 0x1000100) + (i_1036_ - i_1037_ & 0x10000);
							((Class_ra_Sub3) this).anIntArray8630[i_1034_] = i_1036_ - i_1035_ | i_1035_ - (i_1035_ >>> 8);
						}
						i += i_1020_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void ge(int i, int i_1038_, int i_1039_, int i_1040_, int i_1041_, int i_1042_, int i_1043_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null) {
			Class6 class6 = method5206(Thread.currentThread());
			Class38 class38 = ((Class6) class6).aClass38_94;
			int i_1044_ = i_1039_ - i;
			int i_1045_ = i_1040_ - i_1038_;
			int i_1046_ = i_1044_ >= 0 ? i_1044_ : -i_1044_;
			int i_1047_ = i_1045_ >= 0 ? i_1045_ : -i_1045_;
			int i_1048_ = i_1046_;
			if (i_1048_ < i_1047_)
				i_1048_ = i_1047_;
			if (0 != i_1048_) {
				int i_1049_ = (i_1044_ << 16) / i_1048_;
				int i_1050_ = (i_1045_ << 16) / i_1048_;
				i_1044_ += i_1049_ >> 16;
				i_1045_ += i_1050_ >> 16;
				if (i_1050_ <= i_1049_)
					i_1049_ = -i_1049_;
				else
					i_1050_ = -i_1050_;
				int i_1051_ = i_1050_ * i_1042_ >> 17;
				int i_1052_ = i_1050_ * i_1042_ + 1 >> 17;
				int i_1053_ = i_1042_ * i_1049_ >> 17;
				int i_1054_ = 1 + i_1042_ * i_1049_ >> 17;
				i -= class38.method534();
				i_1038_ -= class38.method537();
				int i_1055_ = i_1051_ + i;
				int i_1056_ = i - i_1052_;
				int i_1057_ = i_1044_ + i - i_1052_;
				int i_1058_ = i_1044_ + i + i_1051_;
				int i_1059_ = i_1053_ + i_1038_;
				int i_1060_ = i_1038_ - i_1054_;
				int i_1061_ = i_1038_ + i_1045_ - i_1054_;
				int i_1062_ = i_1038_ + i_1045_ + i_1053_;
				if (i_1043_ == 0)
					((Class38) class38).anInt402 = 0;
				else if (i_1043_ == 1)
					((Class38) class38).anInt402 = 255 - (i_1041_ >>> 24);
				else
					throw new IllegalArgumentException();
				RA(false);
				((Class38) class38).aBoolean387 = (i_1055_ < 0 || i_1055_ > ((Class38) class38).anInt396 || i_1056_ < 0 || i_1056_ > ((Class38) class38).anInt396 || i_1057_ < 0 || i_1057_ > ((Class38) class38).anInt396);
				class38.method539(true, false, false, (float) i_1059_, (float) i_1060_, (float) i_1061_, (float) i_1055_, (float) i_1056_, (float) i_1057_, 100.0F, 100.0F, 100.0F, i_1041_);
				((Class38) class38).aBoolean387 = (i_1055_ < 0 || i_1055_ > ((Class38) class38).anInt396 || i_1057_ < 0 || i_1057_ > ((Class38) class38).anInt396 || i_1058_ < 0 || i_1058_ > ((Class38) class38).anInt396);
				class38.method539(true, false, false, (float) i_1059_, (float) i_1061_, (float) i_1062_, (float) i_1055_, (float) i_1057_, (float) i_1058_, 100.0F, 100.0F, 100.0F, i_1041_);
				RA(true);
			}
		}
	}

	public void gh(int i, int i_1063_, int i_1064_, int i_1065_, int i_1066_, int i_1067_, int i_1068_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null) {
			Class6 class6 = method5206(Thread.currentThread());
			Class38 class38 = ((Class6) class6).aClass38_94;
			int i_1069_ = i_1064_ - i;
			int i_1070_ = i_1065_ - i_1063_;
			int i_1071_ = i_1069_ >= 0 ? i_1069_ : -i_1069_;
			int i_1072_ = i_1070_ >= 0 ? i_1070_ : -i_1070_;
			int i_1073_ = i_1071_;
			if (i_1073_ < i_1072_)
				i_1073_ = i_1072_;
			if (0 != i_1073_) {
				int i_1074_ = (i_1069_ << 16) / i_1073_;
				int i_1075_ = (i_1070_ << 16) / i_1073_;
				i_1069_ += i_1074_ >> 16;
				i_1070_ += i_1075_ >> 16;
				if (i_1075_ <= i_1074_)
					i_1074_ = -i_1074_;
				else
					i_1075_ = -i_1075_;
				int i_1076_ = i_1075_ * i_1067_ >> 17;
				int i_1077_ = i_1075_ * i_1067_ + 1 >> 17;
				int i_1078_ = i_1067_ * i_1074_ >> 17;
				int i_1079_ = 1 + i_1067_ * i_1074_ >> 17;
				i -= class38.method534();
				i_1063_ -= class38.method537();
				int i_1080_ = i_1076_ + i;
				int i_1081_ = i - i_1077_;
				int i_1082_ = i_1069_ + i - i_1077_;
				int i_1083_ = i_1069_ + i + i_1076_;
				int i_1084_ = i_1078_ + i_1063_;
				int i_1085_ = i_1063_ - i_1079_;
				int i_1086_ = i_1063_ + i_1070_ - i_1079_;
				int i_1087_ = i_1063_ + i_1070_ + i_1078_;
				if (i_1068_ == 0)
					((Class38) class38).anInt402 = 0;
				else if (i_1068_ == 1)
					((Class38) class38).anInt402 = 255 - (i_1066_ >>> 24);
				else
					throw new IllegalArgumentException();
				RA(false);
				((Class38) class38).aBoolean387 = (i_1080_ < 0 || i_1080_ > ((Class38) class38).anInt396 || i_1081_ < 0 || i_1081_ > ((Class38) class38).anInt396 || i_1082_ < 0 || i_1082_ > ((Class38) class38).anInt396);
				class38.method539(true, false, false, (float) i_1084_, (float) i_1085_, (float) i_1086_, (float) i_1080_, (float) i_1081_, (float) i_1082_, 100.0F, 100.0F, 100.0F, i_1066_);
				((Class38) class38).aBoolean387 = (i_1080_ < 0 || i_1080_ > ((Class38) class38).anInt396 || i_1082_ < 0 || i_1082_ > ((Class38) class38).anInt396 || i_1083_ < 0 || i_1083_ > ((Class38) class38).anInt396);
				class38.method539(true, false, false, (float) i_1084_, (float) i_1086_, (float) i_1087_, (float) i_1080_, (float) i_1082_, (float) i_1083_, 100.0F, 100.0F, 100.0F, i_1066_);
				RA(true);
			}
		}
	}

	public Class330_Sub14 method4799(int i, int i_1088_, int i_1089_, int i_1090_, int i_1091_, float f) {
		return null;
	}

	public void gu(int i, int i_1092_, int i_1093_, int i_1094_, int i_1095_, int i_1096_, int i_1097_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null) {
			Class6 class6 = method5206(Thread.currentThread());
			Class38 class38 = ((Class6) class6).aClass38_94;
			int i_1098_ = i_1093_ - i;
			int i_1099_ = i_1094_ - i_1092_;
			int i_1100_ = i_1098_ >= 0 ? i_1098_ : -i_1098_;
			int i_1101_ = i_1099_ >= 0 ? i_1099_ : -i_1099_;
			int i_1102_ = i_1100_;
			if (i_1102_ < i_1101_)
				i_1102_ = i_1101_;
			if (0 != i_1102_) {
				int i_1103_ = (i_1098_ << 16) / i_1102_;
				int i_1104_ = (i_1099_ << 16) / i_1102_;
				i_1098_ += i_1103_ >> 16;
				i_1099_ += i_1104_ >> 16;
				if (i_1104_ <= i_1103_)
					i_1103_ = -i_1103_;
				else
					i_1104_ = -i_1104_;
				int i_1105_ = i_1104_ * i_1096_ >> 17;
				int i_1106_ = i_1104_ * i_1096_ + 1 >> 17;
				int i_1107_ = i_1096_ * i_1103_ >> 17;
				int i_1108_ = 1 + i_1096_ * i_1103_ >> 17;
				i -= class38.method534();
				i_1092_ -= class38.method537();
				int i_1109_ = i_1105_ + i;
				int i_1110_ = i - i_1106_;
				int i_1111_ = i_1098_ + i - i_1106_;
				int i_1112_ = i_1098_ + i + i_1105_;
				int i_1113_ = i_1107_ + i_1092_;
				int i_1114_ = i_1092_ - i_1108_;
				int i_1115_ = i_1092_ + i_1099_ - i_1108_;
				int i_1116_ = i_1092_ + i_1099_ + i_1107_;
				if (i_1097_ == 0)
					((Class38) class38).anInt402 = 0;
				else if (i_1097_ == 1)
					((Class38) class38).anInt402 = 255 - (i_1095_ >>> 24);
				else
					throw new IllegalArgumentException();
				RA(false);
				((Class38) class38).aBoolean387 = (i_1109_ < 0 || i_1109_ > ((Class38) class38).anInt396 || i_1110_ < 0 || i_1110_ > ((Class38) class38).anInt396 || i_1111_ < 0 || i_1111_ > ((Class38) class38).anInt396);
				class38.method539(true, false, false, (float) i_1113_, (float) i_1114_, (float) i_1115_, (float) i_1109_, (float) i_1110_, (float) i_1111_, 100.0F, 100.0F, 100.0F, i_1095_);
				((Class38) class38).aBoolean387 = (i_1109_ < 0 || i_1109_ > ((Class38) class38).anInt396 || i_1111_ < 0 || i_1111_ > ((Class38) class38).anInt396 || i_1112_ < 0 || i_1112_ > ((Class38) class38).anInt396);
				class38.method539(true, false, false, (float) i_1113_, (float) i_1115_, (float) i_1116_, (float) i_1109_, (float) i_1111_, (float) i_1112_, 100.0F, 100.0F, 100.0F, i_1095_);
				RA(true);
			}
		}
	}

	public Class92 cl(int i, int i_1117_, int i_1118_, int i_1119_, int i_1120_, int i_1121_) {
		return null;
	}

	public int gv(int i, int i_1122_, int i_1123_, int i_1124_, int i_1125_, int i_1126_) {
		int i_1127_ = 0;
		float f = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[10] * (float) i_1123_) + (((float) i * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[2]) + ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[14] + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[6] * (float) i_1122_)));
		float f_1128_ = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[2] * (float) i_1124_) + ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[14] + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[6] * (float) i_1125_) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[10] * (float) i_1126_));
		float f_1129_ = (((float) i_1122_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[7]) + (((float) i * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[3]) + ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[15]) + (float) i_1123_ * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[11]));
		float f_1130_ = (((float) i_1125_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[7]) + ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[3] * (float) i_1124_) + ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[15]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[11] * (float) i_1126_));
		if (f < -f_1129_ && f_1128_ < -f_1130_)
			i_1127_ |= 0x10;
		else if (f > f_1129_ && f_1128_ > f_1130_)
			i_1127_ |= 0x20;
		float f_1131_ = (((float) i_1122_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[4]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[12] + (float) i * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[0])) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[8] * (float) i_1123_));
		float f_1132_ = (((float) i_1125_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[4]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[12] + (float) i_1124_ * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[0])) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[8] * (float) i_1126_));
		if (f_1131_ < -f_1129_ && f_1132_ < -f_1130_)
			i_1127_ |= 0x1;
		if (f_1131_ > f_1129_ && f_1132_ > f_1130_)
			i_1127_ |= 0x2;
		float f_1133_ = (((float) i * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[1]) + ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[13] + ((float) i_1122_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[5]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[9] * (float) i_1123_));
		float f_1134_ = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[9] * (float) i_1126_) + ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[5] * (float) i_1125_) + ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[1] * (float) i_1124_) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[13]))));
		if (f_1133_ < -f_1129_ && f_1134_ < -f_1130_)
			i_1127_ |= 0x4;
		if (f_1133_ > f_1129_ && f_1134_ > f_1130_)
			i_1127_ |= 0x8;
		return i_1127_;
	}

	public void c(int i, int i_1135_, int i_1136_) {
		for (int i_1137_ = 0; i_1137_ < ((Class_ra_Sub3) this).aClass6Array8647.length; i_1137_++) {
			Class6 class6 = ((Class_ra_Sub3) this).aClass6Array8647[i_1137_];
			((Class6) class6).anInt88 = (i & 0xffffff) * -1381026891;
			int i_1138_ = ((Class6) class6).anInt88 * 536502941 >>> 16 & 0xff;
			if (i_1138_ < 2)
				i_1138_ = 2;
			int i_1139_ = 536502941 * ((Class6) class6).anInt88 >> 8 & 0xff;
			if (i_1139_ < 2)
				i_1139_ = 2;
			int i_1140_ = ((Class6) class6).anInt88 * 536502941 & 0xff;
			if (i_1140_ < 2)
				i_1140_ = 2;
			((Class6) class6).anInt88 = (i_1138_ << 16 | i_1139_ << 8 | i_1140_) * -1381026891;
			if (i_1135_ < 0)
				((Class6) class6).aBoolean86 = false;
			else
				((Class6) class6).aBoolean86 = true;
		}
	}

	public Class_v gs(int i) {
		return null;
	}

	public void dr(float f, float f_1141_, float f_1142_, float[] fs) {
		float f_1143_ = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[10] * f_1142_) + ((f_1141_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[6]) + (f * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[2]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[14]))));
		float f_1144_ = (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[15] + f * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[3] + (f_1141_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[7]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[11] * f_1142_));
		if (f_1143_ < -f_1144_ || f_1143_ > f_1144_) {
			float[] fs_1145_ = fs;
			float[] fs_1146_ = fs;
			fs[2] = Float.NaN;
			fs_1146_[1] = Float.NaN;
			fs_1145_[0] = Float.NaN;
		} else {
			float f_1147_ = ((f_1141_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[4]) + (f * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[0]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[12])) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[8] * f_1142_));
			if (f_1147_ < -f_1144_ || f_1147_ > f_1144_) {
				float[] fs_1148_ = fs;
				float[] fs_1149_ = fs;
				fs[2] = Float.NaN;
				fs_1149_[1] = Float.NaN;
				fs_1148_[0] = Float.NaN;
			} else {
				float f_1150_ = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[13]) + f * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[1]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[5]) * f_1141_ + f_1142_ * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[9]));
				if (f_1150_ < -f_1144_ || f_1150_ > f_1144_) {
					float[] fs_1151_ = fs;
					float[] fs_1152_ = fs;
					fs[2] = Float.NaN;
					fs_1152_[1] = Float.NaN;
					fs_1151_[0] = Float.NaN;
				} else {
					float f_1153_ = ((((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[14]) + f * (((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[2]) + f_1141_ * (((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[6]) + (((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[10]) * f_1142_);
					fs[0] = (((Class_ra_Sub3) this).aFloat8641 + (((Class_ra_Sub3) this).aFloat8640 * f_1147_ / f_1144_));
					fs[1] = (((Class_ra_Sub3) this).aFloat8643 + (((Class_ra_Sub3) this).aFloat8642 * f_1150_ / f_1144_));
					fs[2] = f_1153_;
				}
			}
		}
	}

	public void gc(Class_v class_v) {
		/* empty */
	}

	public void du() {
		/* empty */
	}

	public void gk(int i, int i_1154_, int i_1155_, int i_1156_, int i_1157_, int i_1158_, int i_1159_, int i_1160_, int i_1161_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null) {
			i_1155_ -= i;
			i_1156_ -= i_1154_;
			if (0 == i_1156_) {
				if (i_1155_ >= 0)
					method5203(i, i_1154_, i_1155_ + 1, i_1157_, i_1158_, i_1159_, i_1160_, i_1161_);
				else {
					int i_1162_ = i_1160_ + i_1159_;
					i_1161_ %= i_1162_;
					i_1161_ = (i_1159_ + i_1162_ - i_1161_ - (1 + -i_1155_) % i_1162_);
					i_1161_ %= i_1162_;
					if (i_1161_ < 0)
						i_1161_ += i_1162_;
					method5203(i_1155_ + i, i_1154_, 1 + -i_1155_, i_1157_, i_1158_, i_1159_, i_1160_, i_1161_);
				}
			} else if (i_1155_ == 0) {
				if (i_1156_ >= 0)
					method5198(i, i_1154_, 1 + i_1156_, i_1157_, i_1158_, i_1159_, i_1160_, i_1161_);
				else {
					int i_1163_ = i_1159_ + i_1160_;
					i_1161_ %= i_1163_;
					i_1161_ = (i_1159_ + i_1163_ - i_1161_ - (-i_1156_ + 1) % i_1163_);
					i_1161_ %= i_1163_;
					if (i_1161_ < 0)
						i_1161_ += i_1163_;
					method5198(i, i_1156_ + i_1154_, 1 + -i_1156_, i_1157_, i_1158_, i_1159_, i_1160_, i_1161_);
				}
			} else {
				i_1161_ <<= 8;
				i_1159_ <<= 8;
				i_1160_ <<= 8;
				int i_1164_ = i_1159_ + i_1160_;
				i_1161_ %= i_1164_;
				if (i_1156_ + i_1155_ < 0) {
					int i_1165_ = (int) (Math.sqrt((double) (i_1155_ * i_1155_ + i_1156_ * i_1156_)) * 256.0);
					int i_1166_ = i_1165_ % i_1164_;
					i_1161_ = i_1159_ + i_1164_ - i_1161_ - i_1166_;
					i_1161_ %= i_1164_;
					if (i_1161_ < 0)
						i_1161_ += i_1164_;
					i += i_1155_;
					i_1155_ = -i_1155_;
					i_1154_ += i_1156_;
					i_1156_ = -i_1156_;
				}
				if (i_1155_ > i_1156_) {
					i_1154_ <<= 16;
					i_1154_ += 32768;
					i_1156_ <<= 16;
					int i_1167_ = (int) Math.floor((double) i_1156_ / (double) i_1155_ + 0.5);
					i_1155_ += i;
					int i_1168_ = i_1157_ >>> 24;
					int i_1169_ = (int) Math.sqrt((double) ((i_1167_ >> 8) * (i_1167_ >> 8) + 65536));
					if (i_1158_ == 0 || i_1158_ == 1 && i_1168_ == 255) {
						while (i <= i_1155_) {
							int i_1170_ = i_1154_ >> 16;
							if (i >= (((Class_ra_Sub3) this).anInt8621 * 512290825) && i < (-1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_1170_ >= (((Class_ra_Sub3) this).anInt8623 * -1679642481) && i_1170_ < (((Class_ra_Sub3) this).anInt8624 * 31822541) && i_1161_ < i_1159_)
								((Class_ra_Sub3) this).anIntArray8630[i_1170_ * (-1504772933 * (((Class_ra_Sub3) this).anInt8618)) + i] = i_1157_;
							i_1154_ += i_1167_;
							i++;
							i_1161_ += i_1169_;
							i_1161_ %= i_1164_;
						}
					} else if (i_1158_ == 1) {
						i_1157_ = (((i_1157_ & 0xff00ff) * i_1168_ >> 8 & 0xff00ff) + ((i_1157_ & 0xff00) * i_1168_ >> 8 & 0xff00) + (i_1168_ << 24));
						int i_1171_ = 256 - i_1168_;
						while (i <= i_1155_) {
							int i_1172_ = i_1154_ >> 16;
							if (i >= (((Class_ra_Sub3) this).anInt8621 * 512290825) && i < (-1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_1172_ >= (((Class_ra_Sub3) this).anInt8623 * -1679642481) && i_1172_ < (((Class_ra_Sub3) this).anInt8624 * 31822541) && i_1161_ < i_1159_) {
								int i_1173_ = i + (-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_1172_);
								int i_1174_ = (((Class_ra_Sub3) this).anIntArray8630[i_1173_]);
								i_1174_ = (((i_1174_ & 0xff00ff) * i_1171_ >> 8 & 0xff00ff) + (i_1171_ * (i_1174_ & 0xff00) >> 8 & 0xff00));
								((Class_ra_Sub3) this).anIntArray8630[i_1173_] = i_1157_ + i_1174_;
							}
							i_1154_ += i_1167_;
							i++;
							i_1161_ += i_1169_;
							i_1161_ %= i_1164_;
						}
					} else if (i_1158_ == 2) {
						while (i <= i_1155_) {
							int i_1175_ = i_1154_ >> 16;
							if (i >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i < (-1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_1175_ >= (((Class_ra_Sub3) this).anInt8623 * -1679642481) && i_1175_ < (((Class_ra_Sub3) this).anInt8624 * 31822541) && i_1161_ < i_1159_) {
								int i_1176_ = i + (i_1175_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933));
								int i_1177_ = (((Class_ra_Sub3) this).anIntArray8630[i_1176_]);
								int i_1178_ = i_1157_ + i_1177_;
								int i_1179_ = ((i_1177_ & 0xff00ff) + (i_1157_ & 0xff00ff));
								i_1177_ = ((i_1179_ & 0x1000100) + (i_1178_ - i_1179_ & 0x10000));
								((Class_ra_Sub3) this).anIntArray8630[i_1176_] = i_1178_ - i_1177_ | i_1177_ - (i_1177_ >>> 8);
							}
							i_1154_ += i_1167_;
							i++;
							i_1161_ += i_1169_;
							i_1161_ %= i_1164_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1155_ <<= 16;
					int i_1180_ = (int) Math.floor((double) i_1155_ / (double) i_1156_ + 0.5);
					i_1156_ += i_1154_;
					int i_1181_ = i_1157_ >>> 24;
					int i_1182_ = (int) Math.sqrt((double) (65536 + ((i_1180_ >> 8) * (i_1180_ >> 8))));
					if (0 == i_1158_ || 1 == i_1158_ && 255 == i_1181_) {
						while (i_1154_ <= i_1156_) {
							int i_1183_ = i >> 16;
							if (i_1154_ >= (-1679642481 * ((Class_ra_Sub3) this).anInt8623) && i_1154_ < 31822541 * (((Class_ra_Sub3) this).anInt8624) && i_1183_ >= (((Class_ra_Sub3) this).anInt8621 * 512290825) && i_1183_ < (((Class_ra_Sub3) this).anInt8635 * -1071049483) && i_1161_ < i_1159_)
								((Class_ra_Sub3) this).anIntArray8630[(-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_1154_) + i_1183_] = i_1157_;
							i += i_1180_;
							i_1154_++;
							i_1161_ += i_1182_;
							i_1161_ %= i_1164_;
						}
					} else if (1 == i_1158_) {
						i_1157_ = ((i_1181_ * (i_1157_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1157_ & 0xff00) * i_1181_ >> 8 & 0xff00) + (i_1181_ << 24));
						int i_1184_ = 256 - i_1181_;
						while (i_1154_ <= i_1156_) {
							int i_1185_ = i >> 16;
							if (i_1154_ >= (-1679642481 * ((Class_ra_Sub3) this).anInt8623) && i_1154_ < (((Class_ra_Sub3) this).anInt8624 * 31822541) && i_1185_ >= 512290825 * ((Class_ra_Sub3) this).anInt8621 && i_1185_ < -1071049483 * ((Class_ra_Sub3) this).anInt8635 && i_1161_ < i_1159_) {
								int i_1186_ = ((i_1154_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933)) + i_1185_);
								int i_1187_ = (((Class_ra_Sub3) this).anIntArray8630[i_1186_]);
								i_1187_ = (((i_1187_ & 0xff00ff) * i_1184_ >> 8 & 0xff00ff) + (i_1184_ * (i_1187_ & 0xff00) >> 8 & 0xff00));
								((Class_ra_Sub3) this).anIntArray8630[i_1185_ + i_1154_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618)] = i_1157_ + i_1187_;
							}
							i += i_1180_;
							i_1154_++;
							i_1161_ += i_1182_;
							i_1161_ %= i_1164_;
						}
					} else if (i_1158_ == 2) {
						while (i_1154_ <= i_1156_) {
							int i_1188_ = i >> 16;
							if (i_1154_ >= (-1679642481 * ((Class_ra_Sub3) this).anInt8623) && i_1154_ < (((Class_ra_Sub3) this).anInt8624 * 31822541) && i_1188_ >= (((Class_ra_Sub3) this).anInt8621 * 512290825) && i_1188_ < -1071049483 * ((Class_ra_Sub3) this).anInt8635 && i_1161_ < i_1159_) {
								int i_1189_ = (i_1188_ + (-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_1154_));
								int i_1190_ = (((Class_ra_Sub3) this).anIntArray8630[i_1189_]);
								int i_1191_ = i_1190_ + i_1157_;
								int i_1192_ = ((i_1157_ & 0xff00ff) + (i_1190_ & 0xff00ff));
								i_1190_ = ((i_1191_ - i_1192_ & 0x10000) + (i_1192_ & 0x1000100));
								((Class_ra_Sub3) this).anIntArray8630[i_1189_] = i_1191_ - i_1190_ | i_1190_ - (i_1190_ >>> 8);
							}
							i += i_1180_;
							i_1154_++;
							i_1161_ += i_1182_;
							i_1161_ %= i_1164_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public Class61 hz(int i, int i_1193_, boolean bool, boolean bool_1194_) {
		if (bool)
			return new Class61_Sub3_Sub2(this, i, i_1193_);
		return new Class61_Sub3_Sub1(this, i, i_1193_);
	}

	public Class61 hm(int[] is, int i, int i_1195_, int i_1196_, int i_1197_, boolean bool) {
		boolean bool_1198_ = false;
		int i_1199_ = i;
		while_119_: for (int i_1200_ = 0; i_1200_ < i_1197_; i_1200_++) {
			for (int i_1201_ = 0; i_1201_ < i_1196_; i_1201_++) {
				int i_1202_ = is[i_1199_++] >>> 24;
				if (i_1202_ != 0 && i_1202_ != 255) {
					bool_1198_ = true;
					break while_119_;
				}
			}
		}
		if (bool_1198_)
			return new Class61_Sub3_Sub2(this, is, i, i_1195_, i_1196_, i_1197_, bool);
		return new Class61_Sub3_Sub1(this, is, i, i_1195_, i_1196_, i_1197_, bool);
	}

	public Class61 hv(int[] is, int i, int i_1203_, int i_1204_, int i_1205_, boolean bool) {
		boolean bool_1206_ = false;
		int i_1207_ = i;
		while_120_: for (int i_1208_ = 0; i_1208_ < i_1205_; i_1208_++) {
			for (int i_1209_ = 0; i_1209_ < i_1204_; i_1209_++) {
				int i_1210_ = is[i_1207_++] >>> 24;
				if (i_1210_ != 0 && i_1210_ != 255) {
					bool_1206_ = true;
					break while_120_;
				}
			}
		}
		if (bool_1206_)
			return new Class61_Sub3_Sub2(this, is, i, i_1203_, i_1204_, i_1205_, bool);
		return new Class61_Sub3_Sub1(this, is, i, i_1203_, i_1204_, i_1205_, bool);
	}

	public Class61 hi(Class87 class87, boolean bool) {
		int i = class87.method986();
		int i_1211_ = class87.method994();
		Class61_Sub3 class61_sub3;
		if (bool && !class87.method985() && class87.method1044()) {
			Class87_Sub2 class87_sub2 = (Class87_Sub2) class87;
			int[] is = new int[class87_sub2.anIntArray7113.length];
			byte[] is_1212_ = new byte[i_1211_ * i];
			for (int i_1213_ = 0; i_1213_ < i_1211_; i_1213_++) {
				int i_1214_ = i_1213_ * i;
				for (int i_1215_ = 0; i_1215_ < i; i_1215_++)
					is_1212_[i_1215_ + i_1214_] = class87_sub2.aByteArray7114[i_1215_ + i_1214_];
			}
			for (int i_1216_ = 0; i_1216_ < class87_sub2.anIntArray7113.length; i_1216_++)
				is[i_1216_] = class87_sub2.anIntArray7113[i_1216_];
			class61_sub3 = new Class61_Sub3_Sub3(this, is_1212_, is, i, i_1211_);
		} else {
			int[] is = class87.method1031(false);
			if (class87.method985())
				class61_sub3 = new Class61_Sub3_Sub2(this, is, i, i_1211_);
			else
				class61_sub3 = new Class61_Sub3_Sub1(this, is, i, i_1211_);
		}
		class61_sub3.method717(class87.method983(), class87.method990(), class87.method989(), class87.method991());
		return class61_sub3;
	}

	public Class61 hq(Class87 class87, boolean bool) {
		int i = class87.method986();
		int i_1217_ = class87.method994();
		Class61_Sub3 class61_sub3;
		if (bool && !class87.method985() && class87.method1044()) {
			Class87_Sub2 class87_sub2 = (Class87_Sub2) class87;
			int[] is = new int[class87_sub2.anIntArray7113.length];
			byte[] is_1218_ = new byte[i_1217_ * i];
			for (int i_1219_ = 0; i_1219_ < i_1217_; i_1219_++) {
				int i_1220_ = i_1219_ * i;
				for (int i_1221_ = 0; i_1221_ < i; i_1221_++)
					is_1218_[i_1221_ + i_1220_] = class87_sub2.aByteArray7114[i_1221_ + i_1220_];
			}
			for (int i_1222_ = 0; i_1222_ < class87_sub2.anIntArray7113.length; i_1222_++)
				is[i_1222_] = class87_sub2.anIntArray7113[i_1222_];
			class61_sub3 = new Class61_Sub3_Sub3(this, is_1218_, is, i, i_1217_);
		} else {
			int[] is = class87.method1031(false);
			if (class87.method985())
				class61_sub3 = new Class61_Sub3_Sub2(this, is, i, i_1217_);
			else
				class61_sub3 = new Class61_Sub3_Sub1(this, is, i, i_1217_);
		}
		class61_sub3.method717(class87.method983(), class87.method990(), class87.method989(), class87.method991());
		return class61_sub3;
	}

	public Interface8_Impl1_Impl1 ah(int i, int i_1223_) {
		return new Class43(i, i_1223_);
	}

	public Class61 hl(int i, int i_1224_, int i_1225_, int i_1226_, boolean bool) {
		if (null == ((Class_ra_Sub3) this).anIntArray8630)
			throw new IllegalStateException("");
		int[] is = new int[i_1226_ * i_1225_];
		int i_1227_ = i + i_1224_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933);
		int i_1228_ = ((Class_ra_Sub3) this).anInt8618 * -1504772933 - i_1225_;
		for (int i_1229_ = 0; i_1229_ < i_1226_; i_1229_++) {
			int i_1230_ = i_1229_ * i_1225_;
			for (int i_1231_ = 0; i_1231_ < i_1225_; i_1231_++)
				is[i_1231_ + i_1230_] = ((Class_ra_Sub3) this).anIntArray8630[i_1227_++];
			i_1227_ += i_1228_;
		}
		if (bool)
			return new Class61_Sub3_Sub2(this, is, i_1225_, i_1226_);
		return new Class61_Sub3_Sub1(this, is, i_1225_, i_1226_);
	}

	public Class61 hf(int i, int i_1232_, int i_1233_, int i_1234_, boolean bool) {
		if (null == ((Class_ra_Sub3) this).anIntArray8630)
			throw new IllegalStateException("");
		int[] is = new int[i_1234_ * i_1233_];
		int i_1235_ = i + i_1232_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933);
		int i_1236_ = ((Class_ra_Sub3) this).anInt8618 * -1504772933 - i_1233_;
		for (int i_1237_ = 0; i_1237_ < i_1234_; i_1237_++) {
			int i_1238_ = i_1237_ * i_1233_;
			for (int i_1239_ = 0; i_1239_ < i_1233_; i_1239_++)
				is[i_1239_ + i_1238_] = ((Class_ra_Sub3) this).anIntArray8630[i_1235_++];
			i_1235_ += i_1236_;
		}
		if (bool)
			return new Class61_Sub3_Sub2(this, is, i_1233_, i_1234_);
		return new Class61_Sub3_Sub1(this, is, i_1233_, i_1234_);
	}

	public Class61 ht(int i, int i_1240_, int i_1241_, int i_1242_, boolean bool) {
		if (null == ((Class_ra_Sub3) this).anIntArray8630)
			throw new IllegalStateException("");
		int[] is = new int[i_1242_ * i_1241_];
		int i_1243_ = i + i_1240_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933);
		int i_1244_ = ((Class_ra_Sub3) this).anInt8618 * -1504772933 - i_1241_;
		for (int i_1245_ = 0; i_1245_ < i_1242_; i_1245_++) {
			int i_1246_ = i_1245_ * i_1241_;
			for (int i_1247_ = 0; i_1247_ < i_1241_; i_1247_++)
				is[i_1247_ + i_1246_] = ((Class_ra_Sub3) this).anIntArray8630[i_1243_++];
			i_1243_ += i_1244_;
		}
		if (bool)
			return new Class61_Sub3_Sub2(this, is, i_1241_, i_1242_);
		return new Class61_Sub3_Sub1(this, is, i_1241_, i_1242_);
	}

	public Class_ta hc(int i, int i_1248_, int[] is, int[] is_1249_) {
		return new Class_ta_Sub3(i, i_1248_, is, is_1249_);
	}

	public Class_ta hy(int i, int i_1250_, int[] is, int[] is_1251_) {
		return new Class_ta_Sub3(i, i_1250_, is, is_1251_);
	}

	public void hu(int i, Class_ta class_ta, int i_1252_, int i_1253_) {
		if (null != ((Class_ra_Sub3) this).anIntArray8630) {
			Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
			int[] is = ((Class_ta_Sub3) class_ta_sub3).anIntArray8661;
			int[] is_1254_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8662;
			int i_1255_;
			if (((Class_ra_Sub3) this).anInt8624 * 31822541 < is.length + i_1253_)
				i_1255_ = 31822541 * ((Class_ra_Sub3) this).anInt8624 - i_1253_;
			else
				i_1255_ = is.length;
			int i_1256_;
			if (-1679642481 * ((Class_ra_Sub3) this).anInt8623 > i_1253_) {
				i_1256_ = -1679642481 * ((Class_ra_Sub3) this).anInt8623 - i_1253_;
				i_1253_ = -1679642481 * ((Class_ra_Sub3) this).anInt8623;
			} else
				i_1256_ = 0;
			if (i_1255_ - i_1256_ > 0) {
				int i_1257_ = -1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_1253_;
				for (int i_1258_ = i_1256_; i_1258_ < i_1255_; i_1258_++) {
					int i_1259_ = is[i_1258_] + i_1252_;
					int i_1260_ = is_1254_[i_1258_];
					if (((Class_ra_Sub3) this).anInt8621 * 512290825 > i_1259_) {
						i_1260_ -= (512290825 * ((Class_ra_Sub3) this).anInt8621 - i_1259_);
						i_1259_ = ((Class_ra_Sub3) this).anInt8621 * 512290825;
					}
					if (-1071049483 * ((Class_ra_Sub3) this).anInt8635 < i_1259_ + i_1260_)
						i_1260_ = (-1071049483 * ((Class_ra_Sub3) this).anInt8635 - i_1259_);
					i_1259_ += i_1257_;
					for (int i_1261_ = -i_1260_; i_1261_ < 0; i_1261_++)
						((Class_ra_Sub3) this).anIntArray8630[i_1259_++] = i;
					i_1257_ += ((Class_ra_Sub3) this).anInt8618 * -1504772933;
				}
			}
		}
	}

	public void fo(int i, int i_1262_, int i_1263_, int i_1264_) {
		((Class_ra_Sub3) this).anInt8636 = i * 1238685301;
		((Class_ra_Sub3) this).anInt8622 = -780345205 * i_1262_;
		((Class_ra_Sub3) this).anInt8638 = i_1263_ * -1098702653;
		((Class_ra_Sub3) this).anInt8614 = 1394695071 * i_1264_;
		method5195();
	}

	public boolean ay() {
		return false;
	}

	public void hw(int i) {
		Class387_Sub3.anInt8166 = Class387_Sub3.anInt8222 = i;
		if (-595900225 * ((Class_ra_Sub3) this).anInt8650 > 1)
			throw new IllegalStateException();
		method5199(-595900225 * ((Class_ra_Sub3) this).anInt8650);
		method5208(0);
	}

	public void hn(int i) {
		Class387_Sub3.anInt8166 = Class387_Sub3.anInt8222 = i;
		if (-595900225 * ((Class_ra_Sub3) this).anInt8650 > 1)
			throw new IllegalStateException();
		method5199(-595900225 * ((Class_ra_Sub3) this).anInt8650);
		method5208(0);
	}

	public int dp() {
		return 0;
	}

	public Class387 hg(Model class98, int i, int i_1265_, int i_1266_, int i_1267_) {
		return new Class387_Sub3(this, class98, i, i_1266_, i_1267_, i_1265_);
	}

	public Class387 hb(Model class98, int i, int i_1268_, int i_1269_, int i_1270_) {
		return new Class387_Sub3(this, class98, i, i_1269_, i_1270_, i_1268_);
	}

	public int he(int i, int i_1271_) {
		i |= 0x20800;
		return i & i_1271_ ^ i_1271_;
	}

	public int hd(int i, int i_1272_) {
		return i | i_1272_;
	}

	public int hj(int i, int i_1273_) {
		return i | i_1273_;
	}

	public void gx(int i, int i_1274_, int i_1275_, int i_1276_, int i_1277_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null && (i_1274_ >= -1679642481 * ((Class_ra_Sub3) this).anInt8623 && i_1274_ < 31822541 * ((Class_ra_Sub3) this).anInt8624)) {
			if (i < 512290825 * ((Class_ra_Sub3) this).anInt8621) {
				i_1275_ -= 512290825 * ((Class_ra_Sub3) this).anInt8621 - i;
				i = ((Class_ra_Sub3) this).anInt8621 * 512290825;
			}
			if (i_1275_ + i > -1071049483 * ((Class_ra_Sub3) this).anInt8635)
				i_1275_ = ((Class_ra_Sub3) this).anInt8635 * -1071049483 - i;
			int i_1278_ = -1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_1274_ + i;
			int i_1279_ = i_1276_ >>> 24;
			if (i_1277_ == 0 || i_1277_ == 1 && i_1279_ == 255) {
				for (int i_1280_ = 0; i_1280_ < i_1275_; i_1280_++)
					((Class_ra_Sub3) this).anIntArray8630[i_1280_ + i_1278_] = i_1276_;
			} else if (i_1277_ == 1) {
				i_1276_ = ((i_1279_ << 24) + (((i_1276_ & 0xff00ff) * i_1279_ >> 8 & 0xff00ff) + (i_1279_ * (i_1276_ & 0xff00) >> 8 & 0xff00)));
				int i_1281_ = 256 - i_1279_;
				for (int i_1282_ = 0; i_1282_ < i_1275_; i_1282_++) {
					int i_1283_ = (((Class_ra_Sub3) this).anIntArray8630[i_1282_ + i_1278_]);
					i_1283_ = (((i_1283_ & 0xff00) * i_1281_ >> 8 & 0xff00) + ((i_1283_ & 0xff00ff) * i_1281_ >> 8 & 0xff00ff));
					((Class_ra_Sub3) this).anIntArray8630[i_1282_ + i_1278_] = i_1276_ + i_1283_;
				}
			} else if (i_1277_ == 2) {
				for (int i_1284_ = 0; i_1284_ < i_1275_; i_1284_++) {
					int i_1285_ = (((Class_ra_Sub3) this).anIntArray8630[i_1284_ + i_1278_]);
					int i_1286_ = i_1285_ + i_1276_;
					int i_1287_ = (i_1285_ & 0xff00ff) + (i_1276_ & 0xff00ff);
					i_1285_ = (i_1286_ - i_1287_ & 0x10000) + (i_1287_ & 0x1000100);
					((Class_ra_Sub3) this).anIntArray8630[i_1278_ + i_1284_] = i_1286_ - i_1285_ | i_1285_ - (i_1285_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public Class92 cp(Class92 class92, Class92 class92_1288_, float f, Class92 class92_1289_) {
		return null;
	}

	public Class330_Sub14 method5207(int i, int i_1290_, int i_1291_, int i_1292_, int i_1293_, float f) {
		return null;
	}

	public void ii(int i, Class330_Sub14[] class330_sub14s) {
		/* empty */
	}

	public Class249 cs() {
		return new Class249(((Class_ra_Sub3) this).aClass249_8633);
	}

	public Class247 ih() {
		return new Class247(((Class_ra_Sub3) this).aClass247_8629);
	}

	public Class249 ic() {
		return new Class249(((Class_ra_Sub3) this).aClass249_8633);
	}

	public Class_v gi(int i) {
		return null;
	}

	public void fh(int i, int i_1294_, int i_1295_, int i_1296_) {
		if (512290825 * ((Class_ra_Sub3) this).anInt8621 < i)
			((Class_ra_Sub3) this).anInt8621 = 1907727929 * i;
		if (((Class_ra_Sub3) this).anInt8623 * -1679642481 < i_1294_)
			((Class_ra_Sub3) this).anInt8623 = 766013039 * i_1294_;
		if (((Class_ra_Sub3) this).anInt8635 * -1071049483 > i_1295_)
			((Class_ra_Sub3) this).anInt8635 = -711985315 * i_1295_;
		if (31822541 * ((Class_ra_Sub3) this).anInt8624 > i_1296_)
			((Class_ra_Sub3) this).anInt8624 = -550983163 * i_1296_;
		method5195();
	}

	public void ck(int i, Class330_Sub14[] class330_sub14s) {
		/* empty */
	}

	void method5208(int i) {
		((Class_ra_Sub3) this).aClass6Array8647[i].method402(Thread.currentThread(), (byte) -46);
	}

	public Class61 bj(int i, int i_1297_, int i_1298_, int i_1299_, boolean bool) {
		if (null == ((Class_ra_Sub3) this).anIntArray8630)
			throw new IllegalStateException("");
		int[] is = new int[i_1299_ * i_1298_];
		int i_1300_ = i + i_1297_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933);
		int i_1301_ = ((Class_ra_Sub3) this).anInt8618 * -1504772933 - i_1298_;
		for (int i_1302_ = 0; i_1302_ < i_1299_; i_1302_++) {
			int i_1303_ = i_1302_ * i_1298_;
			for (int i_1304_ = 0; i_1304_ < i_1298_; i_1304_++)
				is[i_1304_ + i_1303_] = ((Class_ra_Sub3) this).anIntArray8630[i_1300_++];
			i_1300_ += i_1301_;
		}
		if (bool)
			return new Class61_Sub3_Sub2(this, is, i_1298_, i_1299_);
		return new Class61_Sub3_Sub1(this, is, i_1298_, i_1299_);
	}

	int[] method5209(int i) {
		Class330_Sub13 class330_sub13;
		synchronized (((Class_ra_Sub3) this).aClass367_8644) {
			class330_sub13 = ((Class330_Sub13) ((Class_ra_Sub3) this).aClass367_8644.get((long) i | ~0x7fffffffffffffffL));
			if (null == class330_sub13) {
				Class56 class56 = anInterface_ma4227.method221(i, 50750209);
				int i_1305_ = class56.anInt532 * -1963453415;
				if (!anInterface_ma4227.method237(i, Class377.aClass377_3935, 0.7F, i_1305_, i_1305_, true, 2141049440)) {
					int[] is = null;
					return is;
				}
				int[] is;
				if (class56.aClass369_524 == Class369.aClass369_6817)
					is = anInterface_ma4227.method231(i, 0.7F, i_1305_, i_1305_, true, 1430007319);
				else
					is = anInterface_ma4227.method220(i, 0.7F, i_1305_, i_1305_, true, -1671756861);
				class330_sub13 = new Class330_Sub13(i, i_1305_, is, (class56.aClass369_524 != Class369.aClass369_6815));
				((Class_ra_Sub3) this).aClass367_8644.method4299(class330_sub13, (long) i | ~0x7fffffffffffffffL, i_1305_ * i_1305_, (byte) -30);
			}
		}
		((Class330_Sub13) class330_sub13).aBoolean7602 = true;
		return class330_sub13.method3309();
	}

	public void bl(int i, int i_1306_, int i_1307_, int i_1308_, int i_1309_, int i_1310_) {
		XA(i, i_1306_, i_1307_, i_1309_, i_1310_);
		XA(i, i_1308_ + i_1306_ - 1, i_1307_, i_1309_, i_1310_);
		G(i, 1 + i_1306_, i_1308_ - 2, i_1309_, i_1310_);
		G(i_1307_ + i - 1, 1 + i_1306_, i_1308_ - 2, i_1309_, i_1310_);
	}

	public void l() {
		/* empty */
	}

	public void ir(Class249 class249) {
		((Class_ra_Sub3) this).aClass249_8633.method2510(class249);
		method5188();
	}

	public Class249 io() {
		return new Class249(((Class_ra_Sub3) this).aClass249_8633);
	}

	void method5210(boolean bool, int i, int i_1311_, float f, int i_1312_, int i_1313_, int i_1314_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null) {
			if (i_1312_ < 0)
				i_1312_ = -i_1312_;
			int i_1315_ = i_1311_ - i_1312_;
			if (i_1315_ < -1679642481 * ((Class_ra_Sub3) this).anInt8623)
				i_1315_ = -1679642481 * ((Class_ra_Sub3) this).anInt8623;
			int i_1316_ = i_1311_ + i_1312_ + 1;
			if (i_1316_ > ((Class_ra_Sub3) this).anInt8624 * 31822541)
				i_1316_ = 31822541 * ((Class_ra_Sub3) this).anInt8624;
			int i_1317_ = i_1315_;
			int i_1318_ = i_1312_ * i_1312_;
			int i_1319_ = 0;
			int i_1320_ = i_1311_ - i_1317_;
			int i_1321_ = i_1320_ * i_1320_;
			int i_1322_ = i_1321_ - i_1320_;
			if (i_1311_ > i_1316_)
				i_1311_ = i_1316_;
			int i_1323_ = i_1313_ >>> 24;
			if (i_1314_ == 0 || 1 == i_1314_ && i_1323_ == 255) {
				while (i_1317_ < i_1311_) {
					for (/**/; i_1322_ <= i_1318_ || i_1321_ <= i_1318_; i_1322_ += i_1319_++ + i_1319_)
						i_1321_ += i_1319_ + i_1319_;
					int i_1324_ = i - i_1319_ + 1;
					if (i_1324_ < 512290825 * ((Class_ra_Sub3) this).anInt8621)
						i_1324_ = 512290825 * ((Class_ra_Sub3) this).anInt8621;
					int i_1325_ = i + i_1319_;
					if (i_1325_ > ((Class_ra_Sub3) this).anInt8635 * -1071049483)
						i_1325_ = -1071049483 * ((Class_ra_Sub3) this).anInt8635;
					int i_1326_ = ((((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_1317_) + i_1324_);
					for (int i_1327_ = i_1324_; i_1327_ < i_1325_; i_1327_++) {
						if (!bool || f < (((Class_ra_Sub3) this).aFloatArray8620[i_1326_]))
							((Class_ra_Sub3) this).anIntArray8630[i_1326_] = i_1313_;
						i_1326_++;
					}
					i_1317_++;
					i_1321_ -= i_1320_-- + i_1320_;
					i_1322_ -= i_1320_ + i_1320_;
				}
				i_1319_ = i_1312_;
				i_1320_ = i_1317_ - i_1311_;
				i_1322_ = i_1320_ * i_1320_ + i_1318_;
				i_1321_ = i_1322_ - i_1319_;
				i_1322_ -= i_1320_;
				while (i_1317_ < i_1316_) {
					for (/**/; i_1322_ > i_1318_ && i_1321_ > i_1318_; i_1321_ -= i_1319_ + i_1319_)
						i_1322_ -= i_1319_-- + i_1319_;
					int i_1328_ = i - i_1319_;
					if (i_1328_ < ((Class_ra_Sub3) this).anInt8621 * 512290825)
						i_1328_ = ((Class_ra_Sub3) this).anInt8621 * 512290825;
					int i_1329_ = i_1319_ + i;
					if (i_1329_ > ((Class_ra_Sub3) this).anInt8635 * -1071049483 - 1)
						i_1329_ = (-1071049483 * ((Class_ra_Sub3) this).anInt8635 - 1);
					int i_1330_ = ((((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_1317_) + i_1328_);
					for (int i_1331_ = i_1328_; i_1331_ <= i_1329_; i_1331_++) {
						if (!bool || f < (((Class_ra_Sub3) this).aFloatArray8620[i_1330_]))
							((Class_ra_Sub3) this).anIntArray8630[i_1330_] = i_1313_;
						i_1330_++;
					}
					i_1317_++;
					i_1322_ += i_1320_ + i_1320_;
					i_1321_ += i_1320_++ + i_1320_;
				}
			} else if (1 == i_1314_) {
				i_1313_ = (((i_1313_ & 0xff00) * i_1323_ >> 8 & 0xff00) + (i_1323_ * (i_1313_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1323_ << 24));
				int i_1332_ = 256 - i_1323_;
				while (i_1317_ < i_1311_) {
					for (/**/; i_1322_ <= i_1318_ || i_1321_ <= i_1318_; i_1322_ += i_1319_++ + i_1319_)
						i_1321_ += i_1319_ + i_1319_;
					int i_1333_ = 1 + (i - i_1319_);
					if (i_1333_ < ((Class_ra_Sub3) this).anInt8621 * 512290825)
						i_1333_ = 512290825 * ((Class_ra_Sub3) this).anInt8621;
					int i_1334_ = i + i_1319_;
					if (i_1334_ > ((Class_ra_Sub3) this).anInt8635 * -1071049483)
						i_1334_ = -1071049483 * ((Class_ra_Sub3) this).anInt8635;
					int i_1335_ = (i_1317_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618) + i_1333_);
					for (int i_1336_ = i_1333_; i_1336_ < i_1334_; i_1336_++) {
						if (!bool || f < (((Class_ra_Sub3) this).aFloatArray8620[i_1335_])) {
							int i_1337_ = (((Class_ra_Sub3) this).anIntArray8630[i_1335_]);
							i_1337_ = (((i_1337_ & 0xff00ff) * i_1332_ >> 8 & 0xff00ff) + ((i_1337_ & 0xff00) * i_1332_ >> 8 & 0xff00));
							((Class_ra_Sub3) this).anIntArray8630[i_1335_] = i_1337_ + i_1313_;
						}
						i_1335_++;
					}
					i_1317_++;
					i_1321_ -= i_1320_-- + i_1320_;
					i_1322_ -= i_1320_ + i_1320_;
				}
				i_1319_ = i_1312_;
				i_1320_ = -i_1320_;
				i_1322_ = i_1318_ + i_1320_ * i_1320_;
				i_1321_ = i_1322_ - i_1319_;
				i_1322_ -= i_1320_;
				while (i_1317_ < i_1316_) {
					for (/**/; i_1322_ > i_1318_ && i_1321_ > i_1318_; i_1321_ -= i_1319_ + i_1319_)
						i_1322_ -= i_1319_-- + i_1319_;
					int i_1338_ = i - i_1319_;
					if (i_1338_ < ((Class_ra_Sub3) this).anInt8621 * 512290825)
						i_1338_ = 512290825 * ((Class_ra_Sub3) this).anInt8621;
					int i_1339_ = i_1319_ + i;
					if (i_1339_ > ((Class_ra_Sub3) this).anInt8635 * -1071049483 - 1)
						i_1339_ = (((Class_ra_Sub3) this).anInt8635 * -1071049483 - 1);
					int i_1340_ = (i_1317_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933) + i_1338_);
					for (int i_1341_ = i_1338_; i_1341_ <= i_1339_; i_1341_++) {
						if (!bool || f < (((Class_ra_Sub3) this).aFloatArray8620[i_1340_])) {
							int i_1342_ = (((Class_ra_Sub3) this).anIntArray8630[i_1340_]);
							i_1342_ = (((i_1342_ & 0xff00ff) * i_1332_ >> 8 & 0xff00ff) + (i_1332_ * (i_1342_ & 0xff00) >> 8 & 0xff00));
							((Class_ra_Sub3) this).anIntArray8630[i_1340_] = i_1313_ + i_1342_;
						}
						i_1340_++;
					}
					i_1317_++;
					i_1322_ += i_1320_ + i_1320_;
					i_1321_ += i_1320_++ + i_1320_;
				}
			} else if (i_1314_ == 2) {
				while (i_1317_ < i_1311_) {
					for (/**/; i_1322_ <= i_1318_ || i_1321_ <= i_1318_; i_1322_ += i_1319_++ + i_1319_)
						i_1321_ += i_1319_ + i_1319_;
					int i_1343_ = 1 + (i - i_1319_);
					if (i_1343_ < ((Class_ra_Sub3) this).anInt8621 * 512290825)
						i_1343_ = 512290825 * ((Class_ra_Sub3) this).anInt8621;
					int i_1344_ = i + i_1319_;
					if (i_1344_ > ((Class_ra_Sub3) this).anInt8635 * -1071049483)
						i_1344_ = -1071049483 * ((Class_ra_Sub3) this).anInt8635;
					int i_1345_ = ((((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_1317_) + i_1343_);
					for (int i_1346_ = i_1343_; i_1346_ < i_1344_; i_1346_++) {
						if (!bool || f < (((Class_ra_Sub3) this).aFloatArray8620[i_1345_])) {
							int i_1347_ = (((Class_ra_Sub3) this).anIntArray8630[i_1345_]);
							int i_1348_ = i_1347_ + i_1313_;
							int i_1349_ = (i_1313_ & 0xff00ff) + (i_1347_ & 0xff00ff);
							i_1347_ = (i_1349_ & 0x1000100) + (i_1348_ - i_1349_ & 0x10000);
							((Class_ra_Sub3) this).anIntArray8630[i_1345_] = i_1348_ - i_1347_ | i_1347_ - (i_1347_ >>> 8);
						}
						i_1345_++;
					}
					i_1317_++;
					i_1321_ -= i_1320_-- + i_1320_;
					i_1322_ -= i_1320_ + i_1320_;
				}
				i_1319_ = i_1312_;
				i_1320_ = -i_1320_;
				i_1322_ = i_1320_ * i_1320_ + i_1318_;
				i_1321_ = i_1322_ - i_1319_;
				i_1322_ -= i_1320_;
				while (i_1317_ < i_1316_) {
					for (/**/; i_1322_ > i_1318_ && i_1321_ > i_1318_; i_1321_ -= i_1319_ + i_1319_)
						i_1322_ -= i_1319_-- + i_1319_;
					int i_1350_ = i - i_1319_;
					if (i_1350_ < ((Class_ra_Sub3) this).anInt8621 * 512290825)
						i_1350_ = 512290825 * ((Class_ra_Sub3) this).anInt8621;
					int i_1351_ = i_1319_ + i;
					if (i_1351_ > ((Class_ra_Sub3) this).anInt8635 * -1071049483 - 1)
						i_1351_ = (-1071049483 * ((Class_ra_Sub3) this).anInt8635 - 1);
					int i_1352_ = i_1350_ + (((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_1317_);
					for (int i_1353_ = i_1350_; i_1353_ <= i_1351_; i_1353_++) {
						if (!bool || f < (((Class_ra_Sub3) this).aFloatArray8620[i_1352_])) {
							int i_1354_ = (((Class_ra_Sub3) this).anIntArray8630[i_1352_]);
							int i_1355_ = i_1354_ + i_1313_;
							int i_1356_ = (i_1354_ & 0xff00ff) + (i_1313_ & 0xff00ff);
							i_1354_ = ((i_1355_ - i_1356_ & 0x10000) + (i_1356_ & 0x1000100));
							((Class_ra_Sub3) this).anIntArray8630[i_1352_] = i_1355_ - i_1354_ | i_1354_ - (i_1354_ >>> 8);
						}
						i_1352_++;
					}
					i_1317_++;
					i_1322_ += i_1320_ + i_1320_;
					i_1321_ += i_1320_++ + i_1320_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void ij(float f) {
		((Class_ra_Sub3) this).anInt8645 = -1109799723 * (int) (f * 65535.0F);
	}

	public void ia(float f) {
		((Class_ra_Sub3) this).anInt8645 = -1109799723 * (int) (f * 65535.0F);
	}

	public void ik(int i, float f, float f_1357_, float f_1358_, float f_1359_, float f_1360_) {
		((Class_ra_Sub3) this).anInt8628 = (int) (65535.0F * f) * -557706933;
		((Class_ra_Sub3) this).anInt8646 = (int) (f_1357_ * 65535.0F) * -781081669;
		float f_1361_ = (float) Math.sqrt((double) (f_1360_ * f_1360_ + (f_1359_ * f_1359_ + f_1358_ * f_1358_)));
		((Class_ra_Sub3) this).anInt8625 = 1565949885 * (int) (65535.0F * f_1358_ / f_1361_);
		((Class_ra_Sub3) this).anInt8626 = 951383331 * (int) (f_1359_ * 65535.0F / f_1361_);
		((Class_ra_Sub3) this).anInt8627 = -2011013933 * (int) (65535.0F * f_1360_ / f_1361_);
	}

	public void iz(int i, float f, float f_1362_, float f_1363_, float f_1364_, float f_1365_) {
		((Class_ra_Sub3) this).anInt8628 = (int) (65535.0F * f) * -557706933;
		((Class_ra_Sub3) this).anInt8646 = (int) (f_1362_ * 65535.0F) * -781081669;
		float f_1366_ = (float) Math.sqrt((double) (f_1365_ * f_1365_ + (f_1364_ * f_1364_ + f_1363_ * f_1363_)));
		((Class_ra_Sub3) this).anInt8625 = 1565949885 * (int) (65535.0F * f_1363_ / f_1366_);
		((Class_ra_Sub3) this).anInt8626 = 951383331 * (int) (f_1364_ * 65535.0F / f_1366_);
		((Class_ra_Sub3) this).anInt8627 = -2011013933 * (int) (65535.0F * f_1365_ / f_1366_);
	}

	public void il(int i) {
		/* empty */
	}

	public void iw(int i) {
		/* empty */
	}

	public void fc(int i, int i_1367_, int i_1368_, int i_1369_) {
		if (i < 0)
			i = 0;
		if (i_1367_ < 0)
			i_1367_ = 0;
		if (i_1368_ > ((Class_ra_Sub3) this).anInt8618 * -1504772933)
			i_1368_ = ((Class_ra_Sub3) this).anInt8618 * -1504772933;
		if (i_1369_ > ((Class_ra_Sub3) this).anInt8619 * 1229852533)
			i_1369_ = ((Class_ra_Sub3) this).anInt8619 * 1229852533;
		((Class_ra_Sub3) this).anInt8621 = i * 1907727929;
		((Class_ra_Sub3) this).anInt8635 = i_1368_ * -711985315;
		((Class_ra_Sub3) this).anInt8623 = i_1367_ * 766013039;
		((Class_ra_Sub3) this).anInt8624 = -550983163 * i_1369_;
		method5195();
	}

	public Class61 gt(int i, int i_1370_, boolean bool, boolean bool_1371_) {
		if (bool)
			return new Class61_Sub3_Sub2(this, i, i_1370_);
		return new Class61_Sub3_Sub1(this, i, i_1370_);
	}

	public void ig(int i, int i_1372_, int i_1373_) {
		for (int i_1374_ = 0; i_1374_ < ((Class_ra_Sub3) this).aClass6Array8647.length; i_1374_++) {
			Class6 class6 = ((Class_ra_Sub3) this).aClass6Array8647[i_1374_];
			((Class6) class6).anInt88 = (i & 0xffffff) * -1381026891;
			int i_1375_ = ((Class6) class6).anInt88 * 536502941 >>> 16 & 0xff;
			if (i_1375_ < 2)
				i_1375_ = 2;
			int i_1376_ = 536502941 * ((Class6) class6).anInt88 >> 8 & 0xff;
			if (i_1376_ < 2)
				i_1376_ = 2;
			int i_1377_ = ((Class6) class6).anInt88 * 536502941 & 0xff;
			if (i_1377_ < 2)
				i_1377_ = 2;
			((Class6) class6).anInt88 = (i_1375_ << 16 | i_1376_ << 8 | i_1377_) * -1381026891;
			if (i_1372_ < 0)
				((Class6) class6).aBoolean86 = false;
			else
				((Class6) class6).aBoolean86 = true;
		}
	}

	public Class92 ix(int i, int i_1378_, int i_1379_, int i_1380_, int i_1381_, int i_1382_) {
		return null;
	}

	public Class61 gm(int i, int i_1383_, boolean bool, boolean bool_1384_) {
		if (bool)
			return new Class61_Sub3_Sub2(this, i, i_1383_);
		return new Class61_Sub3_Sub1(this, i, i_1383_);
	}

	public Class92 ip(int i, int i_1385_, int i_1386_, int i_1387_, int i_1388_, int i_1389_) {
		return null;
	}

	void u() {
		if (((Class_ra_Sub3) this).aBoolean8616) {
			Class95_Sub12.method1137(true, false, 966191256);
			((Class_ra_Sub3) this).aBoolean8616 = false;
		}
		((Class_ra_Sub3) this).aBoolean8648 = true;
	}

	public Class92 in(Class92 class92, Class92 class92_1390_, float f, Class92 class92_1391_) {
		return null;
	}

	public void is(Class92 class92) {
		/* empty */
	}

	public void gr(int i, int i_1392_, int i_1393_, int i_1394_, int i_1395_, int i_1396_) {
		if (null != ((Class_ra_Sub3) this).anIntArray8630) {
			i_1393_ -= i;
			i_1394_ -= i_1392_;
			if (i_1394_ == 0) {
				if (i_1393_ >= 0)
					XA(i, i_1392_, i_1393_ + 1, i_1395_, i_1396_);
				else
					XA(i_1393_ + i, i_1392_, -i_1393_ + 1, i_1395_, i_1396_);
			} else if (0 == i_1393_) {
				if (i_1394_ >= 0)
					G(i, i_1392_, i_1394_ + 1, i_1395_, i_1396_);
				else
					G(i, i_1394_ + i_1392_, -i_1394_ + 1, i_1395_, i_1396_);
			} else {
				if (i_1394_ + i_1393_ < 0) {
					i += i_1393_;
					i_1393_ = -i_1393_;
					i_1392_ += i_1394_;
					i_1394_ = -i_1394_;
				}
				if (i_1393_ > i_1394_) {
					i_1392_ <<= 16;
					i_1392_ += 32768;
					i_1394_ <<= 16;
					int i_1397_ = (int) Math.floor(0.5 + ((double) i_1394_ / (double) i_1393_));
					i_1393_ += i;
					if (i < 512290825 * ((Class_ra_Sub3) this).anInt8621) {
						i_1392_ += i_1397_ * ((((Class_ra_Sub3) this).anInt8621 * 512290825) - i);
						i = ((Class_ra_Sub3) this).anInt8621 * 512290825;
					}
					if (i_1393_ >= -1071049483 * ((Class_ra_Sub3) this).anInt8635)
						i_1393_ = (((Class_ra_Sub3) this).anInt8635 * -1071049483 - 1);
					int i_1398_ = i_1395_ >>> 24;
					if (i_1396_ == 0 || 1 == i_1396_ && 255 == i_1398_) {
						for (/**/; i <= i_1393_; i++) {
							int i_1399_ = i_1392_ >> 16;
							if (i_1399_ >= (-1679642481 * ((Class_ra_Sub3) this).anInt8623) && i_1399_ < (((Class_ra_Sub3) this).anInt8624 * 31822541))
								((Class_ra_Sub3) this).anIntArray8630[(i_1399_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933)) + i] = i_1395_;
							i_1392_ += i_1397_;
						}
					} else if (i_1396_ == 1) {
						i_1395_ = (((i_1395_ & 0xff00ff) * i_1398_ >> 8 & 0xff00ff) + ((i_1395_ & 0xff00) * i_1398_ >> 8 & 0xff00) + (i_1398_ << 24));
						int i_1400_ = 256 - i_1398_;
						for (/**/; i <= i_1393_; i++) {
							int i_1401_ = i_1392_ >> 16;
							if (i_1401_ >= (((Class_ra_Sub3) this).anInt8623 * -1679642481) && i_1401_ < 31822541 * (((Class_ra_Sub3) this).anInt8624)) {
								int i_1402_ = i + (i_1401_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933));
								int i_1403_ = (((Class_ra_Sub3) this).anIntArray8630[i_1402_]);
								i_1403_ = ((i_1400_ * (i_1403_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1400_ * (i_1403_ & 0xff00) >> 8 & 0xff00));
								((Class_ra_Sub3) this).anIntArray8630[i_1402_] = i_1403_ + i_1395_;
							}
							i_1392_ += i_1397_;
						}
					} else if (2 == i_1396_) {
						for (/**/; i <= i_1393_; i++) {
							int i_1404_ = i_1392_ >> 16;
							if (i_1404_ >= (-1679642481 * ((Class_ra_Sub3) this).anInt8623) && i_1404_ < (((Class_ra_Sub3) this).anInt8624 * 31822541)) {
								int i_1405_ = i + (((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_1404_);
								int i_1406_ = (((Class_ra_Sub3) this).anIntArray8630[i_1405_]);
								int i_1407_ = i_1406_ + i_1395_;
								int i_1408_ = ((i_1406_ & 0xff00ff) + (i_1395_ & 0xff00ff));
								i_1406_ = ((i_1407_ - i_1408_ & 0x10000) + (i_1408_ & 0x1000100));
								((Class_ra_Sub3) this).anIntArray8630[i_1405_] = i_1407_ - i_1406_ | i_1406_ - (i_1406_ >>> 8);
							}
							i_1392_ += i_1397_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1393_ <<= 16;
					int i_1409_ = (int) Math.floor((double) i_1393_ / (double) i_1394_ + 0.5);
					i_1394_ += i_1392_;
					if (i_1392_ < -1679642481 * ((Class_ra_Sub3) this).anInt8623) {
						i += (((Class_ra_Sub3) this).anInt8623 * -1679642481 - i_1392_) * i_1409_;
						i_1392_ = ((Class_ra_Sub3) this).anInt8623 * -1679642481;
					}
					if (i_1394_ >= ((Class_ra_Sub3) this).anInt8624 * 31822541)
						i_1394_ = 31822541 * ((Class_ra_Sub3) this).anInt8624 - 1;
					int i_1410_ = i_1395_ >>> 24;
					if (i_1396_ == 0 || 1 == i_1396_ && i_1410_ == 255) {
						for (/**/; i_1392_ <= i_1394_; i_1392_++) {
							int i_1411_ = i >> 16;
							if (i_1411_ >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i_1411_ < -1071049483 * ((Class_ra_Sub3) this).anInt8635)
								((Class_ra_Sub3) this).anIntArray8630[(-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_1392_) + i_1411_] = i_1395_;
							i += i_1409_;
						}
					} else if (1 == i_1396_) {
						i_1395_ = (((i_1395_ & 0xff00) * i_1410_ >> 8 & 0xff00) + ((i_1395_ & 0xff00ff) * i_1410_ >> 8 & 0xff00ff) + (i_1410_ << 24));
						int i_1412_ = 256 - i_1410_;
						for (/**/; i_1392_ <= i_1394_; i_1392_++) {
							int i_1413_ = i >> 16;
							if (i_1413_ >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i_1413_ < -1071049483 * ((Class_ra_Sub3) this).anInt8635) {
								int i_1414_ = ((-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_1392_) + i_1413_);
								int i_1415_ = (((Class_ra_Sub3) this).anIntArray8630[i_1414_]);
								i_1415_ = ((i_1412_ * (i_1415_ & 0xff00) >> 8 & 0xff00) + (i_1412_ * (i_1415_ & 0xff00ff) >> 8 & 0xff00ff));
								((Class_ra_Sub3) this).anIntArray8630[(i_1413_ + (((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_1392_))] = i_1395_ + i_1415_;
							}
							i += i_1409_;
						}
					} else if (i_1396_ == 2) {
						for (/**/; i_1392_ <= i_1394_; i_1392_++) {
							int i_1416_ = i >> 16;
							if (i_1416_ >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i_1416_ < (((Class_ra_Sub3) this).anInt8635 * -1071049483)) {
								int i_1417_ = (i_1416_ + (((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_1392_));
								int i_1418_ = (((Class_ra_Sub3) this).anIntArray8630[i_1417_]);
								int i_1419_ = i_1395_ + i_1418_;
								int i_1420_ = ((i_1418_ & 0xff00ff) + (i_1395_ & 0xff00ff));
								i_1418_ = ((i_1420_ & 0x1000100) + (i_1419_ - i_1420_ & 0x10000));
								((Class_ra_Sub3) this).anIntArray8630[i_1417_] = i_1419_ - i_1418_ | i_1418_ - (i_1418_ >>> 8);
							}
							i += i_1409_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public boolean it() {
		return false;
	}

	public boolean em() {
		return false;
	}

	public boolean ie() {
		return false;
	}

	public Class51 f() {
		return new Class51(0, "Pure Java", 1, "CPU", 0L);
	}

	public void kl(Class247 class247) {
		((Class_ra_Sub3) this).aClass247_8629 = class247;
		method5188();
	}

	void ju(float f, float f_1421_, float f_1422_, float f_1423_, float f_1424_, float f_1425_) {
		/* empty */
	}

	public void jn(int i, int i_1426_, int i_1427_, int i_1428_) {
		/* empty */
	}

	public void jg(int i, int i_1429_, int i_1430_, int i_1431_) {
		/* empty */
	}

	public void ji(int i, int i_1432_, int i_1433_, int i_1434_) {
		/* empty */
	}

	public void db(int i, int i_1435_, int i_1436_, int i_1437_) {
		/* empty */
	}

	public void jt() {
		/* empty */
	}

	public void eo(boolean bool) {
		/* empty */
	}

	public void jm(int i, Class77 class77) {
		for (int i_1438_ = 0; i_1438_ < ((Class_ra_Sub3) this).aClass6Array8647.length; i_1438_++) {
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1438_]).anInt90 = 428165519 * ((Class6) (((Class_ra_Sub3) this).aClass6Array8647[i_1438_])).anInt88;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1438_]).anInt92 = 1365791405 * i;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1438_]).anInt88 = class77.anInt652 * -194741821;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1438_]).anInt93 = class77.anInt650 * -2137611395;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1438_]).aBoolean91 = true;
		}
	}

	public void jo(int i, Class77 class77) {
		for (int i_1439_ = 0; i_1439_ < ((Class_ra_Sub3) this).aClass6Array8647.length; i_1439_++) {
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1439_]).anInt90 = 428165519 * ((Class6) (((Class_ra_Sub3) this).aClass6Array8647[i_1439_])).anInt88;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1439_]).anInt92 = 1365791405 * i;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1439_]).anInt88 = class77.anInt652 * -194741821;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1439_]).anInt93 = class77.anInt650 * -2137611395;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1439_]).aBoolean91 = true;
		}
	}

	public void jf(int i, Class77 class77) {
		for (int i_1440_ = 0; i_1440_ < ((Class_ra_Sub3) this).aClass6Array8647.length; i_1440_++) {
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1440_]).anInt90 = 428165519 * ((Class6) (((Class_ra_Sub3) this).aClass6Array8647[i_1440_])).anInt88;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1440_]).anInt92 = 1365791405 * i;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1440_]).anInt88 = class77.anInt652 * -194741821;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1440_]).anInt93 = class77.anInt650 * -2137611395;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1440_]).aBoolean91 = true;
		}
	}

	public void jb(int i, Class77 class77) {
		for (int i_1441_ = 0; i_1441_ < ((Class_ra_Sub3) this).aClass6Array8647.length; i_1441_++) {
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1441_]).anInt90 = 428165519 * ((Class6) (((Class_ra_Sub3) this).aClass6Array8647[i_1441_])).anInt88;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1441_]).anInt92 = 1365791405 * i;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1441_]).anInt88 = class77.anInt652 * -194741821;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1441_]).anInt93 = class77.anInt650 * -2137611395;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i_1441_]).aBoolean91 = true;
		}
	}

	public void jj(int i, Class77 class77) {
		Class6 class6 = method5206(Thread.currentThread());
		((Class6) class6).anInt92 = i * 1365791405;
		((Class6) class6).anInt88 = -194741821 * class77.anInt652;
		((Class6) class6).anInt93 = -2137611395 * class77.anInt650;
	}

	public void method4803(int[] is) {
		is[0] = ((Class_ra_Sub3) this).anInt8618 * -1504772933;
		is[1] = 1229852533 * ((Class_ra_Sub3) this).anInt8619;
	}

	public void jq(int i, Class77 class77) {
		Class6 class6 = method5206(Thread.currentThread());
		((Class6) class6).anInt92 = i * 1365791405;
		((Class6) class6).anInt88 = -194741821 * class77.anInt652;
		((Class6) class6).anInt93 = -2137611395 * class77.anInt650;
	}

	public void jh() {
		for (int i = 0; i < ((Class_ra_Sub3) this).aClass6Array8647.length; i++) {
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i]).anInt88 = (((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i]).anInt90) * 1394455919;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i]).aBoolean91 = false;
		}
	}

	public void jr(int i, int i_1442_, float f, int i_1443_, int i_1444_, float f_1445_, int i_1446_, int i_1447_, float f_1448_, int i_1449_, int i_1450_, int i_1451_, int i_1452_) {
		boolean bool = ((Class_ra_Sub3) this).anIntArray8630 != null;
		boolean bool_1453_ = ((Class_ra_Sub3) this).aFloatArray8620 != null;
		if (bool || bool_1453_) {
			Class6 class6 = method5206(Thread.currentThread());
			Class38 class38 = ((Class6) class6).aClass38_94;
			((Class38) class38).aBoolean384 = false;
			i -= ((Class_ra_Sub3) this).anInt8621 * 512290825;
			i_1443_ -= ((Class_ra_Sub3) this).anInt8621 * 512290825;
			i_1446_ -= ((Class_ra_Sub3) this).anInt8621 * 512290825;
			i_1442_ -= ((Class_ra_Sub3) this).anInt8623 * -1679642481;
			i_1444_ -= ((Class_ra_Sub3) this).anInt8623 * -1679642481;
			i_1447_ -= ((Class_ra_Sub3) this).anInt8623 * -1679642481;
			((Class38) class38).aBoolean387 = (i < 0 || i > ((Class38) class38).anInt396 || i_1443_ < 0 || i_1443_ > ((Class38) class38).anInt396 || i_1446_ < 0 || i_1446_ > ((Class38) class38).anInt396);
			int i_1454_ = i_1449_ >>> 24;
			if (i_1452_ == 0 || 1 == i_1452_ && 255 == i_1454_) {
				((Class38) class38).anInt402 = 0;
				((Class38) class38).aBoolean383 = false;
				class38.method538(bool, bool_1453_, false, (float) i_1442_, (float) i_1444_, (float) i_1447_, (float) i, (float) i_1443_, (float) i_1446_, f, f_1445_, f_1448_, i_1449_, i_1450_, i_1451_);
			} else if (i_1452_ == 1) {
				((Class38) class38).anInt402 = 255 - i_1454_;
				((Class38) class38).aBoolean383 = false;
				class38.method538(bool, bool_1453_, false, (float) i_1442_, (float) i_1444_, (float) i_1447_, (float) i, (float) i_1443_, (float) i_1446_, f, f_1445_, f_1448_, i_1449_, i_1450_, i_1451_);
			} else if (2 == i_1452_) {
				((Class38) class38).anInt402 = 128;
				((Class38) class38).aBoolean383 = true;
				class38.method538(bool, bool_1453_, false, (float) i_1442_, (float) i_1444_, (float) i_1447_, (float) i, (float) i_1443_, (float) i_1446_, f, f_1445_, f_1448_, i_1449_, i_1450_, i_1451_);
			} else
				throw new IllegalArgumentException();
			((Class38) class38).aBoolean384 = true;
		}
	}

	public void jd(float f, float f_1455_, float f_1456_, float[] fs) {
		float f_1457_ = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[7] * f_1455_) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[15] + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[3] * f)) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[11] * f_1456_));
		float f_1458_ = (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[12] + f * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[0] + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[4] * f_1455_) + (f_1456_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[8]));
		float f_1459_ = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[5] * f_1455_) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[1] * f + ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[13]) + (f_1456_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[9]));
		float f_1460_ = ((f_1455_ * ((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[6]) + (((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[14] + f * (((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[2])) + (((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[10] * f_1456_));
		fs[0] = (((Class_ra_Sub3) this).aFloat8641 + ((Class_ra_Sub3) this).aFloat8640 * f_1458_ / f_1457_);
		fs[1] = (((Class_ra_Sub3) this).aFloat8642 * f_1459_ / f_1457_ + ((Class_ra_Sub3) this).aFloat8643);
		fs[2] = f_1460_;
	}

	public void jz(float f, float f_1461_, float f_1462_, float[] fs) {
		float f_1463_ = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[7] * f_1461_) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[15] + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[3] * f)) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[11] * f_1462_));
		float f_1464_ = (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[12] + f * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[0] + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[4] * f_1461_) + (f_1462_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[8]));
		float f_1465_ = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[5] * f_1461_) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[1] * f + ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[13]) + (f_1462_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[9]));
		float f_1466_ = ((f_1461_ * ((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[6]) + (((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[14] + f * (((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[2])) + (((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[10] * f_1462_));
		fs[0] = (((Class_ra_Sub3) this).aFloat8641 + ((Class_ra_Sub3) this).aFloat8640 * f_1464_ / f_1463_);
		fs[1] = (((Class_ra_Sub3) this).aFloat8642 * f_1465_ / f_1463_ + ((Class_ra_Sub3) this).aFloat8643);
		fs[2] = f_1466_;
	}

	public void jl(float f, float f_1467_, float f_1468_, float[] fs) {
		float f_1469_ = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[10] * f_1468_) + ((f_1467_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[6]) + (f * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[2]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[14]))));
		float f_1470_ = (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[15] + f * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[3] + (f_1467_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[7]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[11] * f_1468_));
		if (f_1469_ < -f_1470_ || f_1469_ > f_1470_) {
			float[] fs_1471_ = fs;
			float[] fs_1472_ = fs;
			fs[2] = Float.NaN;
			fs_1472_[1] = Float.NaN;
			fs_1471_[0] = Float.NaN;
		} else {
			float f_1473_ = ((f_1467_ * ((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[4]) + (f * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[0]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[12])) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[8] * f_1468_));
			if (f_1473_ < -f_1470_ || f_1473_ > f_1470_) {
				float[] fs_1474_ = fs;
				float[] fs_1475_ = fs;
				fs[2] = Float.NaN;
				fs_1475_[1] = Float.NaN;
				fs_1474_[0] = Float.NaN;
			} else {
				float f_1476_ = ((((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[13]) + f * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[1]) + (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[5]) * f_1467_ + f_1468_ * (((Class_ra_Sub3) this).aClass249_8634.aFloatArray2631[9]));
				if (f_1476_ < -f_1470_ || f_1476_ > f_1470_) {
					float[] fs_1477_ = fs;
					float[] fs_1478_ = fs;
					fs[2] = Float.NaN;
					fs_1478_[1] = Float.NaN;
					fs_1477_[0] = Float.NaN;
				} else {
					float f_1479_ = ((((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[14]) + f * (((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[2]) + f_1467_ * (((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[6]) + (((Class_ra_Sub3) this).aClass249_8632.aFloatArray2631[10]) * f_1468_);
					fs[0] = (((Class_ra_Sub3) this).aFloat8641 + (((Class_ra_Sub3) this).aFloat8640 * f_1473_ / f_1470_));
					fs[1] = (((Class_ra_Sub3) this).aFloat8643 + (((Class_ra_Sub3) this).aFloat8642 * f_1476_ / f_1470_));
					fs[2] = f_1479_;
				}
			}
		}
	}

	public void method_if(int i, int i_1480_, int i_1481_) {
		for (int i_1482_ = 0; i_1482_ < ((Class_ra_Sub3) this).aClass6Array8647.length; i_1482_++) {
			Class6 class6 = ((Class_ra_Sub3) this).aClass6Array8647[i_1482_];
			((Class6) class6).anInt88 = (i & 0xffffff) * -1381026891;
			int i_1483_ = ((Class6) class6).anInt88 * 536502941 >>> 16 & 0xff;
			if (i_1483_ < 2)
				i_1483_ = 2;
			int i_1484_ = 536502941 * ((Class6) class6).anInt88 >> 8 & 0xff;
			if (i_1484_ < 2)
				i_1484_ = 2;
			int i_1485_ = ((Class6) class6).anInt88 * 536502941 & 0xff;
			if (i_1485_ < 2)
				i_1485_ = 2;
			((Class6) class6).anInt88 = (i_1483_ << 16 | i_1484_ << 8 | i_1485_) * -1381026891;
			if (i_1480_ < 0)
				((Class6) class6).aBoolean86 = false;
			else
				((Class6) class6).aBoolean86 = true;
		}
	}

	public Class76_Sub2 jy() {
		return new Class76_Sub2_Sub1(this);
	}

	public boolean ej() {
		return false;
	}

	public void im() {
		/* empty */
	}

	public Class76_Sub2 jv() {
		return new Class76_Sub2_Sub1(this);
	}

	public void go(Class_v class_v) {
		/* empty */
	}

	public Interface8_Impl1_Impl2 jx(int i, int i_1486_, Class72 class72, Class86 class86, int i_1487_) {
		return method5202(i, i_1486_);
	}

	public Interface8_Impl1_Impl1 kp(int i, int i_1488_) {
		return new Class43(i, i_1488_);
	}

	public Interface8_Impl1_Impl1 kh(int i, int i_1489_, int i_1490_) {
		return new Class43(i, i_1489_);
	}

	public Interface8_Impl1_Impl1 kv(int i, int i_1491_, int i_1492_) {
		return new Class43(i, i_1491_);
	}

	public boolean kj() {
		return true;
	}

	public boolean ka() {
		return true;
	}

	public boolean km() {
		return true;
	}

	public int ct(int i, int i_1493_) {
		i |= 0x20800;
		return i & i_1493_ ^ i_1493_;
	}

	public void fg(int i, int i_1494_, int i_1495_, int i_1496_) {
		if (i < 0)
			i = 0;
		if (i_1494_ < 0)
			i_1494_ = 0;
		if (i_1495_ > ((Class_ra_Sub3) this).anInt8618 * -1504772933)
			i_1495_ = ((Class_ra_Sub3) this).anInt8618 * -1504772933;
		if (i_1496_ > ((Class_ra_Sub3) this).anInt8619 * 1229852533)
			i_1496_ = ((Class_ra_Sub3) this).anInt8619 * 1229852533;
		((Class_ra_Sub3) this).anInt8621 = i * 1907727929;
		((Class_ra_Sub3) this).anInt8635 = i_1495_ * -711985315;
		((Class_ra_Sub3) this).anInt8623 = i_1494_ * 766013039;
		((Class_ra_Sub3) this).anInt8624 = -550983163 * i_1496_;
		method5195();
	}

	public void kt(int i, int i_1497_, int i_1498_, int i_1499_, int i_1500_, int i_1501_, Class_ta class_ta, int i_1502_, int i_1503_, int i_1504_, int i_1505_, int i_1506_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null) {
			Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
			int[] is = ((Class_ta_Sub3) class_ta_sub3).anIntArray8661;
			int[] is_1507_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8662;
			int i_1508_ = (((Class_ra_Sub3) this).anInt8623 * -1679642481 > i_1503_ ? ((Class_ra_Sub3) this).anInt8623 * -1679642481 : i_1503_);
			int i_1509_ = ((((Class_ra_Sub3) this).anInt8624 * 31822541 < is.length + i_1503_) ? ((Class_ra_Sub3) this).anInt8624 * 31822541 : is.length + i_1503_);
			i_1506_ <<= 8;
			i_1504_ <<= 8;
			i_1505_ <<= 8;
			int i_1510_ = i_1504_ + i_1505_;
			i_1506_ %= i_1510_;
			i_1498_ -= i;
			i_1499_ -= i_1497_;
			if (i_1499_ + i_1498_ < 0) {
				int i_1511_ = (int) (Math.sqrt((double) (i_1499_ * i_1499_ + i_1498_ * i_1498_)) * 256.0);
				int i_1512_ = i_1511_ % i_1510_;
				i_1506_ = i_1504_ + i_1510_ - i_1506_ - i_1512_;
				i_1506_ %= i_1510_;
				if (i_1506_ < 0)
					i_1506_ += i_1510_;
				i += i_1498_;
				i_1498_ = -i_1498_;
				i_1497_ += i_1499_;
				i_1499_ = -i_1499_;
			}
			if (i_1498_ > i_1499_) {
				i_1497_ <<= 16;
				i_1497_ += 32768;
				i_1499_ <<= 16;
				int i_1513_ = (int) Math.floor(0.5 + ((double) i_1499_ / (double) i_1498_));
				i_1498_ += i;
				int i_1514_ = i_1500_ >>> 24;
				int i_1515_ = (int) Math.sqrt((double) (65536 + (i_1513_ >> 8) * (i_1513_ >> 8)));
				if (i_1501_ == 0 || 1 == i_1501_ && i_1514_ == 255) {
					while (i <= i_1498_) {
						int i_1516_ = i_1497_ >> 16;
						int i_1517_ = i_1516_ - i_1503_;
						if (i >= 512290825 * ((Class_ra_Sub3) this).anInt8621 && i < (((Class_ra_Sub3) this).anInt8635 * -1071049483) && i_1516_ >= i_1508_ && i_1516_ < i_1509_ && i_1506_ < i_1504_) {
							int i_1518_ = i_1502_ + is[i_1517_];
							if (i >= i_1518_ && i < i_1518_ + is_1507_[i_1517_])
								((Class_ra_Sub3) this).anIntArray8630[(((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_1516_) + i] = i_1500_;
						}
						i_1497_ += i_1513_;
						i++;
						i_1506_ += i_1515_;
						i_1506_ %= i_1510_;
					}
				} else if (i_1501_ == 1) {
					i_1500_ = (((i_1500_ & 0xff00ff) * i_1514_ >> 8 & 0xff00ff) + (i_1514_ * (i_1500_ & 0xff00) >> 8 & 0xff00) + (i_1514_ << 24));
					int i_1519_ = 256 - i_1514_;
					while (i <= i_1498_) {
						int i_1520_ = i_1497_ >> 16;
						int i_1521_ = i_1520_ - i_1503_;
						if (i >= ((Class_ra_Sub3) this).anInt8621 * 512290825 && i < (-1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_1520_ >= i_1508_ && i_1520_ < i_1509_ && i_1506_ < i_1504_) {
							int i_1522_ = is[i_1521_] + i_1502_;
							if (i >= i_1522_ && i < is_1507_[i_1521_] + i_1522_) {
								int i_1523_ = ((i_1520_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618)) + i);
								int i_1524_ = (((Class_ra_Sub3) this).anIntArray8630[i_1523_]);
								i_1524_ = (((i_1524_ & 0xff00) * i_1519_ >> 8 & 0xff00) + ((i_1524_ & 0xff00ff) * i_1519_ >> 8 & 0xff00ff));
								((Class_ra_Sub3) this).anIntArray8630[i_1523_] = i_1524_ + i_1500_;
							}
						}
						i_1497_ += i_1513_;
						i++;
						i_1506_ += i_1515_;
						i_1506_ %= i_1510_;
					}
				} else if (i_1501_ == 2) {
					while (i <= i_1498_) {
						int i_1525_ = i_1497_ >> 16;
						int i_1526_ = i_1525_ - i_1503_;
						if (i >= 512290825 * ((Class_ra_Sub3) this).anInt8621 && i < (-1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_1525_ >= i_1508_ && i_1525_ < i_1509_ && i_1506_ < i_1504_) {
							int i_1527_ = is[i_1526_] + i_1502_;
							if (i >= i_1527_ && i < i_1527_ + is_1507_[i_1526_]) {
								int i_1528_ = i + (-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_1525_);
								int i_1529_ = (((Class_ra_Sub3) this).anIntArray8630[i_1528_]);
								int i_1530_ = i_1529_ + i_1500_;
								int i_1531_ = ((i_1500_ & 0xff00ff) + (i_1529_ & 0xff00ff));
								i_1529_ = ((i_1531_ & 0x1000100) + (i_1530_ - i_1531_ & 0x10000));
								((Class_ra_Sub3) this).anIntArray8630[i_1528_] = i_1530_ - i_1529_ | i_1529_ - (i_1529_ >>> 8);
							}
						}
						i_1497_ += i_1513_;
						i++;
						i_1506_ += i_1515_;
						i_1506_ %= i_1510_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_1498_ <<= 16;
				int i_1532_ = (int) Math.floor((double) i_1498_ / (double) i_1499_ + 0.5);
				int i_1533_ = (int) Math.sqrt((double) (65536 + (i_1532_ >> 8) * (i_1532_ >> 8)));
				i_1499_ += i_1497_;
				int i_1534_ = i_1500_ >>> 24;
				if (0 == i_1501_ || 1 == i_1501_ && 255 == i_1534_) {
					while (i_1497_ <= i_1499_) {
						int i_1535_ = i >> 16;
						int i_1536_ = i_1497_ - i_1503_;
						if (i_1497_ >= i_1508_ && i_1497_ < i_1509_ && i_1535_ >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i_1535_ < (((Class_ra_Sub3) this).anInt8635 * -1071049483) && i_1506_ < i_1504_ && i_1535_ >= is[i_1536_] + i_1502_ && (i_1535_ < is[i_1536_] + i_1502_ + is_1507_[i_1536_]))
							((Class_ra_Sub3) this).anIntArray8630[(((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_1497_) + i_1535_] = i_1500_;
						i += i_1532_;
						i_1497_++;
						i_1506_ += i_1533_;
						i_1506_ %= i_1510_;
					}
				} else if (1 == i_1501_) {
					i_1500_ = ((i_1534_ * (i_1500_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1500_ & 0xff00) * i_1534_ >> 8 & 0xff00) + (i_1534_ << 24));
					int i_1537_ = 256 - i_1534_;
					while (i_1497_ <= i_1499_) {
						int i_1538_ = i >> 16;
						int i_1539_ = i_1497_ - i_1503_;
						if (i_1497_ >= i_1508_ && i_1497_ < i_1509_ && i_1538_ >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i_1538_ < (((Class_ra_Sub3) this).anInt8635 * -1071049483) && i_1506_ < i_1504_ && i_1538_ >= is[i_1539_] + i_1502_ && i_1538_ < is_1507_[i_1539_] + (is[i_1539_] + i_1502_)) {
							int i_1540_ = i_1538_ + (((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_1497_);
							int i_1541_ = (((Class_ra_Sub3) this).anIntArray8630[i_1540_]);
							i_1541_ = ((i_1537_ * (i_1541_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1537_ * (i_1541_ & 0xff00) >> 8 & 0xff00));
							((Class_ra_Sub3) this).anIntArray8630[(((Class_ra_Sub3) this).anInt8618 * -1504772933 * i_1497_) + i_1538_] = i_1500_ + i_1541_;
						}
						i += i_1532_;
						i_1497_++;
						i_1506_ += i_1533_;
						i_1506_ %= i_1510_;
					}
				} else if (2 == i_1501_) {
					while (i_1497_ <= i_1499_) {
						int i_1542_ = i >> 16;
						int i_1543_ = i_1497_ - i_1503_;
						if (i_1497_ >= i_1508_ && i_1497_ < i_1509_ && i_1542_ >= (512290825 * ((Class_ra_Sub3) this).anInt8621) && i_1542_ < (-1071049483 * ((Class_ra_Sub3) this).anInt8635) && i_1506_ < i_1504_ && i_1542_ >= is[i_1543_] + i_1502_ && (i_1542_ < i_1502_ + is[i_1543_] + is_1507_[i_1543_])) {
							int i_1544_ = i_1542_ + (-1504772933 * ((Class_ra_Sub3) this).anInt8618 * i_1497_);
							int i_1545_ = (((Class_ra_Sub3) this).anIntArray8630[i_1544_]);
							int i_1546_ = i_1545_ + i_1500_;
							int i_1547_ = (i_1545_ & 0xff00ff) + (i_1500_ & 0xff00ff);
							i_1545_ = (i_1547_ & 0x1000100) + (i_1546_ - i_1547_ & 0x10000);
							((Class_ra_Sub3) this).anIntArray8630[i_1544_] = i_1546_ - i_1545_ | i_1545_ - (i_1545_ >>> 8);
						}
						i += i_1532_;
						i_1497_++;
						i_1506_ += i_1533_;
						i_1506_ %= i_1510_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void dn() {
		if (((Class_ra_Sub3) this).aBoolean8616) {
			Class95_Sub12.method1137(true, false, -1538880482);
			((Class_ra_Sub3) this).aBoolean8616 = false;
		}
		((Class_ra_Sub3) this).aBoolean8648 = true;
	}

	public Class249 kc() {
		Class6 class6 = method5206(Thread.currentThread());
		return ((Class6) class6).aClass249_95;
	}

	public Class249 kf() {
		Class6 class6 = method5206(Thread.currentThread());
		return ((Class6) class6).aClass249_95;
	}

	public Class247 kx() {
		Class6 class6 = method5206(Thread.currentThread());
		return ((Class6) class6).aClass247_83;
	}

	public Class247 kw() {
		Class6 class6 = method5206(Thread.currentThread());
		return ((Class6) class6).aClass247_83;
	}

	public void O() {
		for (int i = 0; i < ((Class_ra_Sub3) this).aClass6Array8647.length; i++) {
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i]).anInt88 = (((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i]).anInt90) * 1394455919;
			((Class6) ((Class_ra_Sub3) this).aClass6Array8647[i]).aBoolean91 = false;
		}
	}

	public void kk() {
		((Class_ra_Sub3) this).anInt8636 = 0;
		((Class_ra_Sub3) this).anInt8622 = 0;
		((Class_ra_Sub3) this).anInt8638 = -1418534287 * ((Class_ra_Sub3) this).anInt8618;
		((Class_ra_Sub3) this).anInt8614 = 873410731 * ((Class_ra_Sub3) this).anInt8619;
		method5195();
	}

	public void kq() {
		((Class_ra_Sub3) this).anInt8636 = 0;
		((Class_ra_Sub3) this).anInt8622 = 0;
		((Class_ra_Sub3) this).anInt8638 = -1418534287 * ((Class_ra_Sub3) this).anInt8618;
		((Class_ra_Sub3) this).anInt8614 = 873410731 * ((Class_ra_Sub3) this).anInt8619;
		method5195();
	}

	public boolean ec() {
		return false;
	}

	public void kg() {
		((Class_ra_Sub3) this).anInt8636 = 0;
		((Class_ra_Sub3) this).anInt8622 = 0;
		((Class_ra_Sub3) this).anInt8638 = -1418534287 * ((Class_ra_Sub3) this).anInt8618;
		((Class_ra_Sub3) this).anInt8614 = 873410731 * ((Class_ra_Sub3) this).anInt8619;
		method5195();
	}

	public void ko() {
		((Class_ra_Sub3) this).anInt8621 = 0;
		((Class_ra_Sub3) this).anInt8623 = 0;
		((Class_ra_Sub3) this).anInt8635 = ((Class_ra_Sub3) this).anInt8618 * 1677671663;
		((Class_ra_Sub3) this).anInt8624 = -1710096567 * ((Class_ra_Sub3) this).anInt8619;
		method5195();
	}

	public void kz() {
		((Class_ra_Sub3) this).anInt8621 = 0;
		((Class_ra_Sub3) this).anInt8623 = 0;
		((Class_ra_Sub3) this).anInt8635 = ((Class_ra_Sub3) this).anInt8618 * 1677671663;
		((Class_ra_Sub3) this).anInt8624 = -1710096567 * ((Class_ra_Sub3) this).anInt8619;
		method5195();
	}

	public void N(int i, int i_1548_, int i_1549_, int i_1550_, int i_1551_, int i_1552_, byte[] is, int i_1553_, int i_1554_) {
		if (((Class_ra_Sub3) this).anIntArray8630 != null && (i_1549_ > 0 && i_1550_ > 0)) {
			int i_1555_ = 0;
			int i_1556_ = 0;
			int i_1557_ = (i_1553_ << 16) / i_1549_;
			int i_1558_ = (is.length / i_1553_ << 16) / i_1550_;
			int i_1559_ = (i_1548_ * (((Class_ra_Sub3) this).anInt8618 * -1504772933) + i);
			int i_1560_ = ((Class_ra_Sub3) this).anInt8618 * -1504772933 - i_1549_;
			if (i_1548_ + i_1550_ > ((Class_ra_Sub3) this).anInt8624 * 31822541)
				i_1550_ -= (i_1548_ + i_1550_ - 31822541 * ((Class_ra_Sub3) this).anInt8624);
			if (i_1548_ < ((Class_ra_Sub3) this).anInt8623 * -1679642481) {
				int i_1561_ = ((Class_ra_Sub3) this).anInt8623 * -1679642481 - i_1548_;
				i_1550_ -= i_1561_;
				i_1559_ += i_1561_ * (-1504772933 * ((Class_ra_Sub3) this).anInt8618);
				i_1556_ += i_1558_ * i_1561_;
			}
			if (i + i_1549_ > -1071049483 * ((Class_ra_Sub3) this).anInt8635) {
				int i_1562_ = (i + i_1549_ - -1071049483 * ((Class_ra_Sub3) this).anInt8635);
				i_1549_ -= i_1562_;
				i_1560_ += i_1562_;
			}
			if (i < 512290825 * ((Class_ra_Sub3) this).anInt8621) {
				int i_1563_ = ((Class_ra_Sub3) this).anInt8621 * 512290825 - i;
				i_1549_ -= i_1563_;
				i_1559_ += i_1563_;
				i_1555_ += i_1557_ * i_1563_;
				i_1560_ += i_1563_;
			}
			int i_1564_ = i_1551_ >>> 24;
			int i_1565_ = i_1552_ >>> 24;
			if (i_1554_ == 0 || 1 == i_1554_ && 255 == i_1564_ && i_1565_ == 255) {
				int i_1566_ = i_1555_;
				for (int i_1567_ = -i_1550_; i_1567_ < 0; i_1567_++) {
					int i_1568_ = i_1553_ * (i_1556_ >> 16);
					for (int i_1569_ = -i_1549_; i_1569_ < 0; i_1569_++) {
						if (0 != is[(i_1555_ >> 16) + i_1568_])
							((Class_ra_Sub3) this).anIntArray8630[i_1559_++] = i_1552_;
						else
							((Class_ra_Sub3) this).anIntArray8630[i_1559_++] = i_1551_;
						i_1555_ += i_1557_;
					}
					i_1556_ += i_1558_;
					i_1555_ = i_1566_;
					i_1559_ += i_1560_;
				}
			} else if (i_1554_ == 1) {
				int i_1570_ = i_1555_;
				for (int i_1571_ = -i_1550_; i_1571_ < 0; i_1571_++) {
					int i_1572_ = i_1553_ * (i_1556_ >> 16);
					for (int i_1573_ = -i_1549_; i_1573_ < 0; i_1573_++) {
						int i_1574_ = i_1551_;
						if (0 != is[(i_1555_ >> 16) + i_1572_])
							i_1574_ = i_1552_;
						int i_1575_ = i_1574_ >>> 24;
						int i_1576_ = 255 - i_1575_;
						int i_1577_ = ((Class_ra_Sub3) this).anIntArray8630[i_1559_];
						((Class_ra_Sub3) this).anIntArray8630[i_1559_++] = (((i_1575_ * (i_1574_ & 0xff00) + (i_1577_ & 0xff00) * i_1576_) & 0xff0000) + ((i_1576_ * (i_1577_ & 0xff00ff) + (i_1574_ & 0xff00ff) * i_1575_) & ~0xff00ff)) >> 8;
						i_1555_ += i_1557_;
					}
					i_1556_ += i_1558_;
					i_1555_ = i_1570_;
					i_1559_ += i_1560_;
				}
			} else if (i_1554_ == 2) {
				int i_1578_ = i_1555_;
				for (int i_1579_ = -i_1550_; i_1579_ < 0; i_1579_++) {
					int i_1580_ = (i_1556_ >> 16) * i_1553_;
					for (int i_1581_ = -i_1549_; i_1581_ < 0; i_1581_++) {
						int i_1582_ = i_1551_;
						if (is[i_1580_ + (i_1555_ >> 16)] != 0)
							i_1582_ = i_1552_;
						if (i_1582_ != 0) {
							int i_1583_ = (((Class_ra_Sub3) this).anIntArray8630[i_1559_]);
							int i_1584_ = i_1583_ + i_1582_;
							int i_1585_ = (i_1582_ & 0xff00ff) + (i_1583_ & 0xff00ff);
							i_1583_ = ((i_1584_ - i_1585_ & 0x10000) + (i_1585_ & 0x1000100));
							((Class_ra_Sub3) this).anIntArray8630[i_1559_++] = i_1584_ - i_1583_ | i_1583_ - (i_1583_ >>> 8);
						} else
							i_1559_++;
						i_1555_ += i_1557_;
					}
					i_1556_ += i_1558_;
					i_1555_ = i_1578_;
					i_1559_ += i_1560_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void kd(Class247 class247) {
		((Class_ra_Sub3) this).aClass247_8629 = class247;
		method5188();
	}

	public void ks(boolean bool) {
		Class6 class6 = method5206(Thread.currentThread());
		((Class6) class6).aBoolean111 = bool;
	}

	public void lp(boolean bool) {
		Class6 class6 = method5206(Thread.currentThread());
		((Class6) class6).aBoolean111 = bool;
	}

	public int lo() {
		return 0;
	}

	static void method5211(byte i) {
		try {
			if (Class5.anInt75 * 486565601 < 102)
				Class5.anInt75 += 1236545222;
			if (-1 != 1087765821 * Class5.anInt79 && (Class5.aLong74 * 2639683168909447821L < Class312.method3111((byte) 87))) {
				for (int i_1586_ = 1087765821 * Class5.anInt79; i_1586_ < Class380.aStringArray3960.length; i_1586_++) {
					if (Class380.aStringArray3960[i_1586_].startsWith("pause")) {
						int i_1587_ = 5;
						try {
							i_1587_ = Integer.parseInt(Class380.aStringArray3960[i_1586_].substring(6));
						} catch (Exception exception) {
							/* empty */
						}
						Class56.panelBoxMessage(new StringBuilder().append("Pausing for ").append(i_1587_).append(" seconds...").toString(), 496170579);
						Class5.anInt79 = 1934803477 * (i_1586_ + 1);
						Class5.aLong74 = ((Class312.method3111((byte) 45) + (long) (1000 * i_1587_)) * -942728182570139579L);
						return;
					}
					Class5.aString73 = Class380.aStringArray3960[i_1586_];
					Class201.method2164(false, (byte) 10);
				}
				Class5.anInt79 = -1934803477;
			}
			if (0 != 40356559 * client.mouseNotches) {
				Class5.anInt77 -= client.mouseNotches * -974352267;
				if (Class5.anInt77 * 1888787583 >= -1970400951 * Class5.anInt71)
					Class5.anInt77 = -1288794569 * Class5.anInt71 - 1587487615;
				if (Class5.anInt77 * 1888787583 < 0)
					Class5.anInt77 = 0;
				client.mouseNotches = 0;
			}
			for (int i_1588_ = 0; i_1588_ < -774446383 * client.anInt9000; i_1588_++) {
				Interface18 interface18 = client.anInterface18Array9001[i_1588_];
				int i_1589_ = interface18.method264((byte) 0);
				char c = interface18.method270(2125862514);
				int i_1590_ = interface18.method268((byte) -2);
				if (i_1589_ == 84)
					Class201.method2164(false, (byte) 10);
				if (80 == i_1589_)
					Class201.method2164(true, (byte) 10);
				else if (66 == i_1589_ && 0 != (i_1590_ & 0x4)) {
					if (Class391.aClipboard4063 != null) {
						String string = "";
						for (int i_1591_ = Class5.aStringArray68.length - 1; i_1591_ >= 0; i_1591_--) {
							if (null != Class5.aStringArray68[i_1591_] && Class5.aStringArray68[i_1591_].length() > 0)
								string = new StringBuilder().append(string).append(Class5.aStringArray68[i_1591_]).append('\n').toString();
						}
						Class391.aClipboard4063.setContents(new StringSelection(string), null);
					}
				} else if (i_1589_ == 67 && (i_1590_ & 0x4) != 0) {
					if (null != Class391.aClipboard4063) {
						try {
							Transferable transferable = Class391.aClipboard4063.getContents(null);
							if (transferable != null) {
								String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
								if (null != string) {
									String[] strings = Class226.method2309(string, '\n', (byte) -79);
									Class352.method4072(strings, -2039971238);
								}
							}
						} catch (Exception exception) {
							/* empty */
						}
					}
				} else if (i_1589_ == 85 && Class5.anInt76 * -1474537995 > 0) {
					Class5.aString73 = new StringBuilder().append(Class5.aString73.substring(0, (Class5.anInt76 * -1474537995) - 1)).append(Class5.aString73.substring(Class5.anInt76 * -1474537995)).toString();
					Class5.anInt76 -= 616558173;
				} else if (101 == i_1589_ && (-1474537995 * Class5.anInt76 < Class5.aString73.length()))
					Class5.aString73 = new StringBuilder().append(Class5.aString73.substring(0, -1474537995 * Class5.anInt76)).append(Class5.aString73.substring(1 + (-1474537995 * (Class5.anInt76)))).toString();
				else if (i_1589_ == 96 && -1474537995 * Class5.anInt76 > 0)
					Class5.anInt76 -= 616558173;
				else if (97 == i_1589_ && (Class5.anInt76 * -1474537995 < Class5.aString73.length()))
					Class5.anInt76 += 616558173;
				else if (102 == i_1589_)
					Class5.anInt76 = 0;
				else if (i_1589_ == 103)
					Class5.anInt76 = Class5.aString73.length() * 616558173;
				else if (i_1589_ == 104 && (Class5.anInt72 * -356771275 < Class5.aStringArray68.length)) {
					Class5.anInt72 += -1286739939;
					Class64.method773(536357521);
					Class5.anInt76 = Class5.aString73.length() * 616558173;
				} else if (i_1589_ == 105 && Class5.anInt72 * -356771275 > 0) {
					Class5.anInt72 -= -1286739939;
					Class64.method773(536357521);
					Class5.anInt76 = Class5.aString73.length() * 616558173;
				} else if (Class263.method2614(c, 1123940032) || "\\/.:, _-+[]~@".indexOf(c) != -1) {
					Class5.aString73 = new StringBuilder().append(Class5.aString73.substring(0, -1474537995 * Class5.anInt76)).append(client.anInterface18Array9001[i_1588_].method270(1715018809)).append(Class5.aString73.substring(-1474537995 * Class5.anInt76)).toString();
					Class5.anInt76 += 616558173;
				}
			}
			client.anInt9000 = 0;
			client.anInt9003 = 0;
			Class464.method5726(-1398862787);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yx.z(").append(')').toString());
		}
	}

	public static void method5212(Player class432_sub1_sub1_sub1_sub1, int i) {
		try {
			Class330_Sub20 class330_sub20 = ((Class330_Sub20) (Class330_Sub20.aClass497_7651.method6094((long) (class432_sub1_sub1_sub1_sub1.anInt10008 * -1654044763))));
			if (null == class330_sub20)
				Class_ra.method4809(class432_sub1_sub1_sub1_sub1.aByte8658, (class432_sub1_sub1_sub1_sub1.anIntArray10018[0]), (class432_sub1_sub1_sub1_sub1.anIntArray10059[0]), 0, null, null, class432_sub1_sub1_sub1_sub1, -467956056);
			else
				class330_sub20.method3373((byte) -31);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yx.z(").append(')').toString());
		}
	}

	static Class325_Sub1 method5213(int i) {
		try {
			Class325_Sub1 class325_sub1 = ((Class325_Sub1) Class325_Sub1.aClass467_7476.method5853((byte) 14));
			if (class325_sub1 != null) {
				Class325_Sub1.anInt7472 -= 1606647021;
				return class325_sub1;
			}
			return new Class325_Sub1();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yx.j(").append(')').toString());
		}
	}

	static boolean method5214(int i) {
		try {
			boolean bool;
			try {
				Class557 class557 = new Class557();
				byte[] is = class557.method6452(Class248.aByteArray6592, (short) 32128);
				Class306.method3052(is, 1808341042);
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yx.p(").append(')').toString());
		}
	}

	static final void method5215(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = ((Class432_Sub1) ((Class430) class430).anInterface2_4389).method5363(-1876483656);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yx.arv(").append(')').toString());
		}
	}

	static final void method5216(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class515.method6205(iComponentDefinitions, class120, class430, 505514871);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yx.ha(").append(')').toString());
		}
	}

	static void method5217(int i, String string, int i_1592_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(2, (long) i);
			class330_sub36_sub3.method3445((byte) 0);
			((Class330_Sub36_Sub3) class330_sub36_sub3).aString9649 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yx.aj(").append(')').toString());
		}
	}

	static boolean method5218(Class330_Sub46_Sub2 class330_sub46_sub2, int i, int i_1593_) {
		try {
			int i_1594_ = class330_sub46_sub2.readBits(2);
			if (i_1594_ == 0) {
				if (class330_sub46_sub2.readBits(1) != 0)
					method5218(class330_sub46_sub2, i, 1988269557);
				int i_1595_ = class330_sub46_sub2.readBits(6);
				int i_1596_ = class330_sub46_sub2.readBits(6);
				boolean bool = class330_sub46_sub2.readBits(1) == 1;
				if (bool)
					Class15.anIntArray196[(Class15.anInt197 += 1507365673) * 614054169 - 1] = i;
				if (client.players[i] != null)
					throw new RuntimeException();
				Class26 class26 = Class15.aClass26Array198[i];
				Player class432_sub1_sub1_sub1_sub1 = (client.players[i] = (new Player(client.aClass304_9030.method3023(-400722441))));
				class432_sub1_sub1_sub1_sub1.anInt10008 = i * 662194221;
				if (null != Class15.aClass330_Sub46Array191[i])
					class432_sub1_sub1_sub1_sub1.sendAppearance(Class15.aClass330_Sub46Array191[i], 774123157);
				class432_sub1_sub1_sub1_sub1.method5411((181663117 * (((Class26) class26).anInt310)), true, -99369797);
				class432_sub1_sub1_sub1_sub1.anInt10028 = 431770291 * ((Class26) class26).anInt309;
				int i_1597_ = -96106209 * ((Class26) class26).anInt313;
				int i_1598_ = i_1597_ >> 28;
				int i_1599_ = i_1597_ >> 14 & 0xff;
				int i_1600_ = i_1597_ & 0xff;
				Class381 class381 = client.aClass304_9030.method3022(-1066348782);
				int i_1601_ = (i_1595_ + (i_1599_ << 6) - -1261027839 * class381.gameSceneBaseX);
				int i_1602_ = (i_1596_ + (i_1600_ << 6) - -1542584207 * class381.gameSceneBaseY);
				class432_sub1_sub1_sub1_sub1.aBoolean10234 = ((Class26) class26).aBoolean312;
				class432_sub1_sub1_sub1_sub1.aBoolean10247 = ((Class26) class26).aBoolean311;
				class432_sub1_sub1_sub1_sub1.aByteArray10017[0] = Class15.aByteArray190[i];
				class432_sub1_sub1_sub1_sub1.aByte8658 = class432_sub1_sub1_sub1_sub1.aByte8654 = (byte) i_1598_;
				if (client.aClass304_9030.method2995(665548251).method2788(i_1601_, i_1602_, (byte) -72))
					class432_sub1_sub1_sub1_sub1.aByte8654++;
				class432_sub1_sub1_sub1_sub1.method5463(i_1601_, i_1602_, (short) 1007);
				class432_sub1_sub1_sub1_sub1.aBoolean10243 = false;
				Class15.aClass26Array198[i] = null;
				return true;
			}
			if (i_1594_ == 1) {
				int i_1603_ = class330_sub46_sub2.readBits(2);
				int i_1604_ = (-96106209 * ((Class26) Class15.aClass26Array198[i]).anInt313);
				((Class26) Class15.aClass26Array198[i]).anInt313 = 992654047 * ((i_1604_ & 0xfffffff) + ((i_1603_ + (i_1604_ >> 28) & 0x3) << 28));
				return false;
			}
			if (2 == i_1594_) {
				int i_1605_ = class330_sub46_sub2.readBits(5);
				int i_1606_ = i_1605_ >> 3;
				int i_1607_ = i_1605_ & 0x7;
				int i_1608_ = (((Class26) Class15.aClass26Array198[i]).anInt313 * -96106209);
				int i_1609_ = (i_1608_ >> 28) + i_1606_ & 0x3;
				int i_1610_ = i_1608_ >> 14 & 0xff;
				int i_1611_ = i_1608_ & 0xff;
				if (0 == i_1607_) {
					i_1610_--;
					i_1611_--;
				}
				if (1 == i_1607_)
					i_1611_--;
				if (2 == i_1607_) {
					i_1610_++;
					i_1611_--;
				}
				if (3 == i_1607_)
					i_1610_--;
				if (4 == i_1607_)
					i_1610_++;
				if (i_1607_ == 5) {
					i_1610_--;
					i_1611_++;
				}
				if (6 == i_1607_)
					i_1611_++;
				if (7 == i_1607_) {
					i_1610_++;
					i_1611_++;
				}
				((Class26) Class15.aClass26Array198[i]).anInt313 = (((i_1610_ << 14) + (i_1609_ << 28) + i_1611_) * 992654047);
				return false;
			}
			int i_1612_ = class330_sub46_sub2.readBits(18);
			int i_1613_ = i_1612_ >> 16;
			int i_1614_ = i_1612_ >> 8 & 0xff;
			int i_1615_ = i_1612_ & 0xff;
			int i_1616_ = ((Class26) Class15.aClass26Array198[i]).anInt313 * -96106209;
			int i_1617_ = (i_1616_ >> 28) + i_1613_ & 0x3;
			int i_1618_ = (i_1616_ >> 14) + i_1614_ & 0xff;
			int i_1619_ = i_1615_ + i_1616_ & 0xff;
			((Class26) Class15.aClass26Array198[i]).anInt313 = ((i_1618_ << 14) + (i_1617_ << 28) + i_1619_) * 992654047;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yx.s(").append(')').toString());
		}
	}
}
