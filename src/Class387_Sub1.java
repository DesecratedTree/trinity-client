/* Class387_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class387_Sub1 extends Class387 {
	int[] anIntArray8010;
	static int anInt8011 = 7;
	Class_ra_Sub2 aClass_ra_Sub2_8012;
	int anInt8013;
	int anInt8014 = 0;
	short aShort8015;
	short[] aShortArray8016;
	int[][] anIntArrayArray8017;
	short[] aShortArray8018;
	static int anInt8019 = 4;
	int[] anIntArray8020;
	Class173 aClass173_8021;
	int[][] anIntArrayArray8022;
	short[] aShortArray8023;
	short[] aShortArray8024;
	short[] aShortArray8025;
	Class93[] aClass93Array8026;
	int anInt8027;
	short[] aShortArray8028;
	int[] anIntArray8029;
	byte[] aByteArray8030;
	float[] aFloatArray8031;
	short[] aShortArray8032;
	Class206 aClass206_8033;
	int anInt8034;
	int anInt8035;
	short[] modelColors;
	byte[] aByteArray8037;
	int anInt8038;
	short[] aShortArray8039;
	short[] aShortArray8040;
	short[] modelTextures;
	boolean aBoolean8042;
	boolean aBoolean8043;
	int anInt8044 = 0;
	Class173 aClass173_8045;
	Class173 aClass173_8046;
	Class173 aClass173_8047;
	boolean aBoolean8048;
	boolean aBoolean8049;
	Class165 aClass165_8050;
	int[] anIntArray8051;
	short[] aShortArray8052;
	float[] aFloatArray8053;
	int anInt8054;
	int anInt8055;
	int anInt8056;
	int anInt8057;
	int anInt8058;
	int anInt8059;
	int anInt8060;
	int anInt8061;
	int[] anIntArray8062;
	int[] anIntArray8063;
	int[] anIntArray8064;
	int[] anIntArray8065;
	boolean aBoolean8066;
	boolean aBoolean8067;
	Class64[] aClass64Array8068;
	int anInt8069;
	Class185[] aClass185Array8070;
	Class177[] aClass177Array8071;
	int[][] anIntArrayArray8072;
	long[] aLongArray8073;
	float[] aFloatArray8074;
	short[] aShortArray8075;
	int[] anIntArray8076;
	int[] anIntArray8077;
	int anInt8078;
	int[] anIntArray8079;
	int anInt8080;
	int anInt8081;
	int[] anIntArray8082;
	short aShort8083;
	static Class172 aClass172_8084;

	Class387_Sub1(Class_ra_Sub2 class_ra_sub2, Model class98, int i, int i_0_, int i_1_, int i_2_) {
		this(class_ra_sub2, i, i_2_, true, false);
		Interface_ma interface_ma = class_ra_sub2.anInterface_ma4227;
		int[] is = new int[class98.anInt904];
		((Class387_Sub1) this).anIntArray8082 = new int[class98.anInt874 + 1];
		for (int i_3_ = 0; i_3_ < class98.anInt904; i_3_++) {
			if (class98.aByteArray884 == null || class98.aByteArray884[i_3_] != 2) {
				if (class98.aShortArray896 != null && class98.aShortArray896[i_3_] != -1) {
					Class56 class56 = interface_ma.method221((class98.aShortArray896[i_3_] & 0xffff), -639060841);
					if (((((Class387_Sub1) this).anInt8081 & 0x40) == 0 || !class56.aBoolean533) && class56.aBoolean519)
						continue;
				}
				is[((Class387_Sub1) this).anInt8034++] = i_3_;
				((Class387_Sub1) this).anIntArray8082[(class98.aShortArray888[i_3_])]++;
				((Class387_Sub1) this).anIntArray8082[(class98.aShortArray907[i_3_])]++;
				((Class387_Sub1) this).anIntArray8082[(class98.aShortArray883[i_3_])]++;
			}
		}
		((Class387_Sub1) this).anInt8035 = ((Class387_Sub1) this).anInt8034;
		long[] ls = new long[((Class387_Sub1) this).anInt8034];
		boolean bool = (((Class387_Sub1) this).anInt8013 & 0x100) != 0;
		for (int i_4_ = 0; i_4_ < ((Class387_Sub1) this).anInt8034; i_4_++) {
			int i_5_ = is[i_4_];
			Class56 class56 = null;
			int i_6_ = 0;
			int i_7_ = 0;
			int i_8_ = 0;
			int i_9_ = 0;
			if (class98.aClass94Array908 != null) {
				boolean bool_10_ = false;
				for (int i_11_ = 0; i_11_ < class98.aClass94Array908.length; i_11_++) {
					Class94 class94 = class98.aClass94Array908[i_11_];
					if (i_5_ == class94.anInt848 * -1401356047) {
						Class207 class207 = Class511.method6180((class94.anInt850 * 1490212127), (byte) 94);
						if (class207.aBoolean1948)
							bool_10_ = true;
						if (class207.anInt1950 * 1569869573 != -1) {
							Class56 class56_12_ = interface_ma.method221((class207.anInt1950 * 1569869573), -1696547101);
							if (class56_12_.aClass369_524 == Class369.aClass369_6817)
								((Class387_Sub1) this).aBoolean8067 = true;
						}
					}
				}
				if (bool_10_) {
					ls[i_4_] = 9223372036854775807L;
					((Class387_Sub1) this).anInt8035--;
					continue;
				}
			}
			int i_13_ = -1;
			if (class98.aShortArray896 != null) {
				i_13_ = class98.aShortArray896[i_5_];
				if (i_13_ != -1) {
					class56 = interface_ma.method221(i_13_ & 0xffff, 459494880);
					if ((((Class387_Sub1) this).anInt8081 & 0x40) == 0 || !class56.aBoolean533) {
						i_8_ = class56.aByte525;
						i_9_ = class56.aByte526;
					} else {
						i_13_ = -1;
						class56 = null;
					}
				}
			}
			boolean bool_14_ = ((class98.aByteArray876 != null && class98.aByteArray876[i_5_] != 0) || (class56 != null && class56.aClass369_524 != Class369.aClass369_6818));
			if ((bool || bool_14_) && class98.aByteArray885 != null)
				i_6_ += class98.aByteArray885[i_5_] << 17;
			if (bool_14_)
				i_6_ += 65536;
			i_6_ += (i_8_ & 0xff) << 8;
			i_6_ += i_9_ & 0xff;
			i_7_ += (i_13_ & 0xffff) << 16;
			i_7_ += i_4_ & 0xffff;
			ls[i_4_] = ((long) i_6_ << 32) + (long) i_7_;
			((Class387_Sub1) this).aBoolean8067 |= bool_14_;
			Class387_Sub1 class387_sub1_15_ = this;
			((Class387_Sub1) class387_sub1_15_).aBoolean8042 = (((Class387_Sub1) class387_sub1_15_).aBoolean8042 | (class56 != null && (class56.aByte531 != 0 || class56.aByte530 != 0)));
		}
		Class390.method4600(ls, is, (byte) -12);
		((Class387_Sub1) this).anInt8014 = class98.anInt897;
		((Class387_Sub1) this).anInt8044 = class98.anInt874;
		((Class387_Sub1) this).anIntArray8065 = class98.anIntArray875;
		((Class387_Sub1) this).anIntArray8020 = class98.anIntArray889;
		((Class387_Sub1) this).anIntArray8051 = class98.anIntArray877;
		((Class387_Sub1) this).aShortArray8023 = class98.aShortArray879;
		Class194[] class194s = new Class194[((Class387_Sub1) this).anInt8044];
		((Class387_Sub1) this).aClass93Array8026 = class98.aClass93Array878;
		((Class387_Sub1) this).aClass64Array8068 = class98.aClass64Array893;
		if (class98.aClass94Array908 != null) {
			((Class387_Sub1) this).anInt8069 = class98.aClass94Array908.length;
			((Class387_Sub1) this).aClass185Array8070 = new Class185[((Class387_Sub1) this).anInt8069];
			((Class387_Sub1) this).aClass177Array8071 = new Class177[((Class387_Sub1) this).anInt8069];
			for (int i_16_ = 0; i_16_ < ((Class387_Sub1) this).anInt8069; i_16_++) {
				Class94 class94 = class98.aClass94Array908[i_16_];
				Class207 class207 = Class511.method6180(class94.anInt850 * 1490212127, (byte) 55);
				int i_17_ = -1;
				for (int i_18_ = 0; i_18_ < ((Class387_Sub1) this).anInt8034; i_18_++) {
					if (is[i_18_] == class94.anInt848 * -1401356047) {
						i_17_ = i_18_;
						break;
					}
				}
				int i_19_ = (Console.colorArray[(class98.aShortArray873[class94.anInt848 * -1401356047] & 0xffff)]) & 0xffffff;
				i_19_ = i_19_ | 255 - (class98.aByteArray876 != null ? (class98.aByteArray876[class94.anInt848 * -1401356047]) : 0) << 24;
				((Class387_Sub1) this).aClass185Array8070[i_16_] = (new Class185(i_17_, class98.aShortArray888[class94.anInt848 * -1401356047], class98.aShortArray907[class94.anInt848 * -1401356047], class98.aShortArray883[class94.anInt848 * -1401356047], class207.anInt1945 * 1234206275, class207.anInt1946 * -1366680355, class207.anInt1950 * 1569869573, class207.anInt1941 * -384448259, class207.anInt1947 * 1238436903, class207.aBoolean1948, class207.aBoolean1949, class94.anInt849 * 1518395751));
				((Class387_Sub1) this).aClass177Array8071[i_16_] = new Class177(i_19_);
			}
		}
		int i_20_ = ((Class387_Sub1) this).anInt8034 * 3;
		((Class387_Sub1) this).aShortArray8025 = new short[i_20_];
		((Class387_Sub1) this).aShortArray8075 = new short[i_20_];
		((Class387_Sub1) this).aShortArray8032 = new short[i_20_];
		((Class387_Sub1) this).aShortArray8028 = new short[i_20_];
		((Class387_Sub1) this).aShortArray8024 = new short[i_20_];
		((Class387_Sub1) this).aByteArray8030 = new byte[i_20_];
		((Class387_Sub1) this).aFloatArray8031 = new float[i_20_];
		((Class387_Sub1) this).aFloatArray8053 = new float[i_20_];
		((Class387_Sub1) this).modelColors = new short[((Class387_Sub1) this).anInt8034];
		((Class387_Sub1) this).aByteArray8037 = new byte[((Class387_Sub1) this).anInt8034];
		((Class387_Sub1) this).aShortArray8016 = new short[((Class387_Sub1) this).anInt8034];
		((Class387_Sub1) this).aShortArray8039 = new short[((Class387_Sub1) this).anInt8034];
		((Class387_Sub1) this).aShortArray8040 = new short[((Class387_Sub1) this).anInt8034];
		((Class387_Sub1) this).modelTextures = new short[((Class387_Sub1) this).anInt8034];
		if (class98.aShortArray892 != null)
			((Class387_Sub1) this).aShortArray8018 = new short[((Class387_Sub1) this).anInt8034];
		((Class387_Sub1) this).aShort8015 = (short) i_0_;
		((Class387_Sub1) this).aShort8083 = (short) i_1_;
		((Class387_Sub1) this).aShortArray8052 = new short[i_20_];
		((Class387_Sub1) this).aLongArray8073 = new long[i_20_];
		int i_21_ = 0;
		for (int i_22_ = 0; i_22_ < class98.anInt874; i_22_++) {
			int i_23_ = ((Class387_Sub1) this).anIntArray8082[i_22_];
			((Class387_Sub1) this).anIntArray8082[i_22_] = i_21_;
			i_21_ += i_23_;
			class194s[i_22_] = new Class194();
		}
		((Class387_Sub1) this).anIntArray8082[class98.anInt874] = i_21_;
		Class97 class97 = method4444(class98, is, ((Class387_Sub1) this).anInt8034);
		Class190[] class190s = new Class190[class98.anInt904];
		for (int i_24_ = 0; i_24_ < class98.anInt904; i_24_++) {
			short i_25_ = class98.aShortArray888[i_24_];
			short i_26_ = class98.aShortArray907[i_24_];
			short i_27_ = class98.aShortArray883[i_24_];
			int i_28_ = (((Class387_Sub1) this).anIntArray8065[i_26_] - ((Class387_Sub1) this).anIntArray8065[i_25_]);
			int i_29_ = (((Class387_Sub1) this).anIntArray8020[i_26_] - ((Class387_Sub1) this).anIntArray8020[i_25_]);
			int i_30_ = (((Class387_Sub1) this).anIntArray8051[i_26_] - ((Class387_Sub1) this).anIntArray8051[i_25_]);
			int i_31_ = (((Class387_Sub1) this).anIntArray8065[i_27_] - ((Class387_Sub1) this).anIntArray8065[i_25_]);
			int i_32_ = (((Class387_Sub1) this).anIntArray8020[i_27_] - ((Class387_Sub1) this).anIntArray8020[i_25_]);
			int i_33_ = (((Class387_Sub1) this).anIntArray8051[i_27_] - ((Class387_Sub1) this).anIntArray8051[i_25_]);
			int i_34_ = i_29_ * i_33_ - i_32_ * i_30_;
			int i_35_ = i_30_ * i_31_ - i_33_ * i_28_;
			int i_36_;
			for (i_36_ = i_28_ * i_32_ - i_31_ * i_29_; (i_34_ > 8192 || i_35_ > 8192 || i_36_ > 8192 || i_34_ < -8192 || i_35_ < -8192 || i_36_ < -8192); i_36_ >>= 1) {
				i_34_ >>= 1;
				i_35_ >>= 1;
			}
			int i_37_ = (int) Math.sqrt((double) (i_34_ * i_34_ + i_35_ * i_35_ + i_36_ * i_36_));
			if (i_37_ <= 0)
				i_37_ = 1;
			i_34_ = i_34_ * 256 / i_37_;
			i_35_ = i_35_ * 256 / i_37_;
			i_36_ = i_36_ * 256 / i_37_;
			byte i_38_ = (class98.aByteArray884 == null ? (byte) 0 : class98.aByteArray884[i_24_]);
			if (i_38_ == 0) {
				Class194 class194 = class194s[i_25_];
				((Class194) class194).anInt1886 += i_34_;
				((Class194) class194).anInt1884 += i_35_;
				((Class194) class194).anInt1885 += i_36_;
				((Class194) class194).anInt1883++;
				class194 = class194s[i_26_];
				((Class194) class194).anInt1886 += i_34_;
				((Class194) class194).anInt1884 += i_35_;
				((Class194) class194).anInt1885 += i_36_;
				((Class194) class194).anInt1883++;
				class194 = class194s[i_27_];
				((Class194) class194).anInt1886 += i_34_;
				((Class194) class194).anInt1884 += i_35_;
				((Class194) class194).anInt1885 += i_36_;
				((Class194) class194).anInt1883++;
			} else if (i_38_ == 1) {
				Class190 class190 = class190s[i_24_] = new Class190();
				((Class190) class190).anInt1859 = i_34_;
				((Class190) class190).anInt1857 = i_35_;
				((Class190) class190).anInt1858 = i_36_;
			}
		}
		for (int i_39_ = 0; i_39_ < ((Class387_Sub1) this).anInt8034; i_39_++) {
			int i_40_ = is[i_39_];
			int i_41_ = class98.aShortArray873[i_40_] & 0xffff;
			int i_42_;
			if (class98.aByteArray887 == null)
				i_42_ = -1;
			else
				i_42_ = class98.aByteArray887[i_40_];
			int i_43_;
			if (class98.aByteArray876 == null)
				i_43_ = 0;
			else
				i_43_ = class98.aByteArray876[i_40_] & 0xff;
			short i_44_ = (class98.aShortArray896 == null ? (short) -1 : class98.aShortArray896[i_40_]);
			if (i_44_ != -1 && (((Class387_Sub1) this).anInt8081 & 0x40) != 0) {
				Class56 class56 = interface_ma.method221(i_44_ & 0xffff, 643017709);
				if (class56.aBoolean533)
					i_44_ = (short) -1;
			}
			float f = 0.0F;
			float f_45_ = 0.0F;
			float f_46_ = 0.0F;
			float f_47_ = 0.0F;
			float f_48_ = 0.0F;
			float f_49_ = 0.0F;
			int i_50_ = 0;
			int i_51_ = 0;
			int i_52_ = 0;
			if (i_44_ != -1) {
				if (i_42_ == -1) {
					f = 0.0F;
					f_45_ = 1.0F;
					f_46_ = 1.0F;
					f_47_ = 1.0F;
					i_50_ = 1;
					f_48_ = 0.0F;
					f_49_ = 0.0F;
					i_51_ = 2;
				} else {
					i_42_ &= 0xff;
					byte i_53_ = class98.aByteArray894[i_42_];
					if (i_53_ == 0) {
						short i_54_ = class98.aShortArray888[i_40_];
						short i_55_ = class98.aShortArray907[i_40_];
						short i_56_ = class98.aShortArray883[i_40_];
						short i_57_ = class98.aShortArray895[i_42_];
						short i_58_ = class98.aShortArray903[i_42_];
						short i_59_ = class98.aShortArray886[i_42_];
						float f_60_ = (float) class98.anIntArray875[i_57_];
						float f_61_ = (float) class98.anIntArray889[i_57_];
						float f_62_ = (float) class98.anIntArray877[i_57_];
						float f_63_ = (float) class98.anIntArray875[i_58_] - f_60_;
						float f_64_ = (float) class98.anIntArray889[i_58_] - f_61_;
						float f_65_ = (float) class98.anIntArray877[i_58_] - f_62_;
						float f_66_ = (float) class98.anIntArray875[i_59_] - f_60_;
						float f_67_ = (float) class98.anIntArray889[i_59_] - f_61_;
						float f_68_ = (float) class98.anIntArray877[i_59_] - f_62_;
						float f_69_ = (float) class98.anIntArray875[i_54_] - f_60_;
						float f_70_ = (float) class98.anIntArray889[i_54_] - f_61_;
						float f_71_ = (float) class98.anIntArray877[i_54_] - f_62_;
						float f_72_ = (float) class98.anIntArray875[i_55_] - f_60_;
						float f_73_ = (float) class98.anIntArray889[i_55_] - f_61_;
						float f_74_ = (float) class98.anIntArray877[i_55_] - f_62_;
						float f_75_ = (float) class98.anIntArray875[i_56_] - f_60_;
						float f_76_ = (float) class98.anIntArray889[i_56_] - f_61_;
						float f_77_ = (float) class98.anIntArray877[i_56_] - f_62_;
						float f_78_ = f_64_ * f_68_ - f_65_ * f_67_;
						float f_79_ = f_65_ * f_66_ - f_63_ * f_68_;
						float f_80_ = f_63_ * f_67_ - f_64_ * f_66_;
						float f_81_ = f_67_ * f_80_ - f_68_ * f_79_;
						float f_82_ = f_68_ * f_78_ - f_66_ * f_80_;
						float f_83_ = f_66_ * f_79_ - f_67_ * f_78_;
						float f_84_ = 1.0F / (f_81_ * f_63_ + f_82_ * f_64_ + f_83_ * f_65_);
						f = ((f_81_ * f_69_ + f_82_ * f_70_ + f_83_ * f_71_) * f_84_);
						f_46_ = (f_81_ * f_72_ + f_82_ * f_73_ + f_83_ * f_74_) * f_84_;
						f_48_ = (f_81_ * f_75_ + f_82_ * f_76_ + f_83_ * f_77_) * f_84_;
						f_81_ = f_64_ * f_80_ - f_65_ * f_79_;
						f_82_ = f_65_ * f_78_ - f_63_ * f_80_;
						f_83_ = f_63_ * f_79_ - f_64_ * f_78_;
						f_84_ = 1.0F / (f_81_ * f_66_ + f_82_ * f_67_ + f_83_ * f_68_);
						f_45_ = (f_81_ * f_69_ + f_82_ * f_70_ + f_83_ * f_71_) * f_84_;
						f_47_ = (f_81_ * f_72_ + f_82_ * f_73_ + f_83_ * f_74_) * f_84_;
						f_49_ = (f_81_ * f_75_ + f_82_ * f_76_ + f_83_ * f_77_) * f_84_;
					} else {
						short i_85_ = class98.aShortArray888[i_40_];
						short i_86_ = class98.aShortArray907[i_40_];
						short i_87_ = class98.aShortArray883[i_40_];
						int i_88_ = class97.anIntArray867[i_42_];
						int i_89_ = class97.anIntArray870[i_42_];
						int i_90_ = class97.anIntArray869[i_42_];
						float[] fs = class97.aFloatArrayArray868[i_42_];
						byte i_91_ = class98.aByteArray905[i_42_];
						float f_92_ = (float) class98.anIntArray901[i_42_] / 256.0F;
						if (i_53_ == 1) {
							float f_93_ = ((float) class98.anIntArray900[i_42_] / 1024.0F);
							method4492(class98.anIntArray875[i_85_], class98.anIntArray889[i_85_], class98.anIntArray877[i_85_], i_88_, i_89_, i_90_, fs, f_93_, i_91_, f_92_, ((Class387_Sub1) this).aFloatArray8074);
							f = ((Class387_Sub1) this).aFloatArray8074[0];
							f_45_ = ((Class387_Sub1) this).aFloatArray8074[1];
							method4492(class98.anIntArray875[i_86_], class98.anIntArray889[i_86_], class98.anIntArray877[i_86_], i_88_, i_89_, i_90_, fs, f_93_, i_91_, f_92_, ((Class387_Sub1) this).aFloatArray8074);
							f_46_ = ((Class387_Sub1) this).aFloatArray8074[0];
							f_47_ = ((Class387_Sub1) this).aFloatArray8074[1];
							method4492(class98.anIntArray875[i_87_], class98.anIntArray889[i_87_], class98.anIntArray877[i_87_], i_88_, i_89_, i_90_, fs, f_93_, i_91_, f_92_, ((Class387_Sub1) this).aFloatArray8074);
							f_48_ = ((Class387_Sub1) this).aFloatArray8074[0];
							f_49_ = ((Class387_Sub1) this).aFloatArray8074[1];
							float f_94_ = f_93_ / 2.0F;
							if ((i_91_ & 0x1) == 0) {
								if (f_46_ - f > f_94_) {
									f_46_ -= f_93_;
									i_50_ = 1;
								} else if (f - f_46_ > f_94_) {
									f_46_ += f_93_;
									i_50_ = 2;
								}
								if (f_48_ - f > f_94_) {
									f_48_ -= f_93_;
									i_51_ = 1;
								} else if (f - f_48_ > f_94_) {
									f_48_ += f_93_;
									i_51_ = 2;
								}
							} else {
								if (f_47_ - f_45_ > f_94_) {
									f_47_ -= f_93_;
									i_50_ = 1;
								} else if (f_45_ - f_47_ > f_94_) {
									f_47_ += f_93_;
									i_50_ = 2;
								}
								if (f_49_ - f_45_ > f_94_) {
									f_49_ -= f_93_;
									i_51_ = 1;
								} else if (f_45_ - f_49_ > f_94_) {
									f_49_ += f_93_;
									i_51_ = 2;
								}
							}
						} else if (i_53_ == 2) {
							float f_95_ = ((float) class98.anIntArray902[i_42_] / 256.0F);
							float f_96_ = ((float) class98.anIntArray872[i_42_] / 256.0F);
							int i_97_ = (class98.anIntArray875[i_86_] - class98.anIntArray875[i_85_]);
							int i_98_ = (class98.anIntArray889[i_86_] - class98.anIntArray889[i_85_]);
							int i_99_ = (class98.anIntArray877[i_86_] - class98.anIntArray877[i_85_]);
							int i_100_ = (class98.anIntArray875[i_87_] - class98.anIntArray875[i_85_]);
							int i_101_ = (class98.anIntArray889[i_87_] - class98.anIntArray889[i_85_]);
							int i_102_ = (class98.anIntArray877[i_87_] - class98.anIntArray877[i_85_]);
							int i_103_ = i_98_ * i_102_ - i_101_ * i_99_;
							int i_104_ = i_99_ * i_100_ - i_102_ * i_97_;
							int i_105_ = i_97_ * i_101_ - i_100_ * i_98_;
							float f_106_ = 64.0F / (float) class98.anIntArray898[i_42_];
							float f_107_ = 64.0F / (float) class98.anIntArray899[i_42_];
							float f_108_ = 64.0F / (float) class98.anIntArray900[i_42_];
							float f_109_ = (((float) i_103_ * fs[0] + (float) i_104_ * fs[1] + (float) i_105_ * fs[2]) / f_106_);
							float f_110_ = (((float) i_103_ * fs[3] + (float) i_104_ * fs[4] + (float) i_105_ * fs[5]) / f_107_);
							float f_111_ = (((float) i_103_ * fs[6] + (float) i_104_ * fs[7] + (float) i_105_ * fs[8]) / f_108_);
							i_52_ = method4442(f_109_, f_110_, f_111_);
							method4443(class98.anIntArray875[i_85_], class98.anIntArray889[i_85_], class98.anIntArray877[i_85_], i_88_, i_89_, i_90_, i_52_, fs, i_91_, f_92_, f_95_, f_96_, ((Class387_Sub1) this).aFloatArray8074);
							f = ((Class387_Sub1) this).aFloatArray8074[0];
							f_45_ = ((Class387_Sub1) this).aFloatArray8074[1];
							method4443(class98.anIntArray875[i_86_], class98.anIntArray889[i_86_], class98.anIntArray877[i_86_], i_88_, i_89_, i_90_, i_52_, fs, i_91_, f_92_, f_95_, f_96_, ((Class387_Sub1) this).aFloatArray8074);
							f_46_ = ((Class387_Sub1) this).aFloatArray8074[0];
							f_47_ = ((Class387_Sub1) this).aFloatArray8074[1];
							method4443(class98.anIntArray875[i_87_], class98.anIntArray889[i_87_], class98.anIntArray877[i_87_], i_88_, i_89_, i_90_, i_52_, fs, i_91_, f_92_, f_95_, f_96_, ((Class387_Sub1) this).aFloatArray8074);
							f_48_ = ((Class387_Sub1) this).aFloatArray8074[0];
							f_49_ = ((Class387_Sub1) this).aFloatArray8074[1];
						} else if (i_53_ == 3) {
							method4441(class98.anIntArray875[i_85_], class98.anIntArray889[i_85_], class98.anIntArray877[i_85_], i_88_, i_89_, i_90_, fs, i_91_, f_92_, ((Class387_Sub1) this).aFloatArray8074);
							f = ((Class387_Sub1) this).aFloatArray8074[0];
							f_45_ = ((Class387_Sub1) this).aFloatArray8074[1];
							method4441(class98.anIntArray875[i_86_], class98.anIntArray889[i_86_], class98.anIntArray877[i_86_], i_88_, i_89_, i_90_, fs, i_91_, f_92_, ((Class387_Sub1) this).aFloatArray8074);
							f_46_ = ((Class387_Sub1) this).aFloatArray8074[0];
							f_47_ = ((Class387_Sub1) this).aFloatArray8074[1];
							method4441(class98.anIntArray875[i_87_], class98.anIntArray889[i_87_], class98.anIntArray877[i_87_], i_88_, i_89_, i_90_, fs, i_91_, f_92_, ((Class387_Sub1) this).aFloatArray8074);
							f_48_ = ((Class387_Sub1) this).aFloatArray8074[0];
							f_49_ = ((Class387_Sub1) this).aFloatArray8074[1];
							if ((i_91_ & 0x1) == 0) {
								if (f_46_ - f > 0.5F) {
									f_46_--;
									i_50_ = 1;
								} else if (f - f_46_ > 0.5F) {
									f_46_++;
									i_50_ = 2;
								}
								if (f_48_ - f > 0.5F) {
									f_48_--;
									i_51_ = 1;
								} else if (f - f_48_ > 0.5F) {
									f_48_++;
									i_51_ = 2;
								}
							} else {
								if (f_47_ - f_45_ > 0.5F) {
									f_47_--;
									i_50_ = 1;
								} else if (f_45_ - f_47_ > 0.5F) {
									f_47_++;
									i_50_ = 2;
								}
								if (f_49_ - f_45_ > 0.5F) {
									f_49_--;
									i_51_ = 1;
								} else if (f_45_ - f_49_ > 0.5F) {
									f_49_++;
									i_51_ = 2;
								}
							}
						}
					}
				}
			}
			byte i_112_;
			if (class98.aByteArray884 == null)
				i_112_ = (byte) 0;
			else
				i_112_ = class98.aByteArray884[i_40_];
			if (i_112_ == 0) {
				long l = ((long) (i_42_ << 2) + (((long) (i_52_ << 24) + (long) (i_41_ << 8) + (long) i_43_) << 32));
				short i_113_ = class98.aShortArray888[i_40_];
				short i_114_ = class98.aShortArray907[i_40_];
				short i_115_ = class98.aShortArray883[i_40_];
				Class194 class194 = class194s[i_113_];
				((Class387_Sub1) this).aShortArray8016[i_39_] = method4493(class98, i_113_, i_39_, l, ((Class194) class194).anInt1886, ((Class194) class194).anInt1884, ((Class194) class194).anInt1885, ((Class194) class194).anInt1883, f, f_45_);
				class194 = class194s[i_114_];
				((Class387_Sub1) this).aShortArray8039[i_39_] = method4493(class98, i_114_, i_39_, l + (long) i_50_, ((Class194) class194).anInt1886, ((Class194) class194).anInt1884, ((Class194) class194).anInt1885, ((Class194) class194).anInt1883, f_46_, f_47_);
				class194 = class194s[i_115_];
				((Class387_Sub1) this).aShortArray8040[i_39_] = method4493(class98, i_115_, i_39_, l + (long) i_51_, ((Class194) class194).anInt1886, ((Class194) class194).anInt1884, ((Class194) class194).anInt1885, ((Class194) class194).anInt1883, f_48_, f_49_);
			} else if (i_112_ == 1) {
				Class190 class190 = class190s[i_40_];
				long l = ((long) ((i_42_ << 2) + (((Class190) class190).anInt1859 > 0 ? 1024 : 2048) + (((Class190) class190).anInt1857 + 256 << 12) + (((Class190) class190).anInt1858 + 256 << 22)) + (((long) (i_52_ << 24) + (long) (i_41_ << 8) + (long) i_43_) << 32));
				((Class387_Sub1) this).aShortArray8016[i_39_] = method4493(class98, class98.aShortArray888[i_40_], i_39_, l, ((Class190) class190).anInt1859, ((Class190) class190).anInt1857, ((Class190) class190).anInt1858, 0, f, f_45_);
				((Class387_Sub1) this).aShortArray8039[i_39_] = method4493(class98, class98.aShortArray907[i_40_], i_39_, l + (long) i_50_, ((Class190) class190).anInt1859, ((Class190) class190).anInt1857, ((Class190) class190).anInt1858, 0, f_46_, f_47_);
				((Class387_Sub1) this).aShortArray8040[i_39_] = method4493(class98, class98.aShortArray883[i_40_], i_39_, l + (long) i_51_, ((Class190) class190).anInt1859, ((Class190) class190).anInt1857, ((Class190) class190).anInt1858, 0, f_48_, f_49_);
			}
			if (class98.aByteArray876 != null)
				((Class387_Sub1) this).aByteArray8037[i_39_] = class98.aByteArray876[i_40_];
			if (class98.aShortArray892 != null)
				((Class387_Sub1) this).aShortArray8018[i_39_] = class98.aShortArray892[i_40_];
			((Class387_Sub1) this).modelColors[i_39_] = class98.aShortArray873[i_40_];
			((Class387_Sub1) this).modelTextures[i_39_] = i_44_;
		}
		if (((Class387_Sub1) this).anInt8035 > 0) {
			int i_116_ = 1;
			short i_117_ = ((Class387_Sub1) this).modelTextures[0];
			for (int i_118_ = 0; i_118_ < ((Class387_Sub1) this).anInt8035; i_118_++) {
				short i_119_ = ((Class387_Sub1) this).modelTextures[i_118_];
				if (i_119_ != i_117_) {
					i_116_++;
					i_117_ = i_119_;
				}
			}
			((Class387_Sub1) this).anIntArray8063 = new int[i_116_];
			((Class387_Sub1) this).anIntArray8064 = new int[i_116_];
			((Class387_Sub1) this).anIntArray8062 = new int[i_116_ + 1];
			((Class387_Sub1) this).anIntArray8062[0] = 0;
			int i_120_ = ((Class387_Sub1) this).anInt8038;
			int i_121_ = 0;
			i_116_ = 0;
			i_117_ = ((Class387_Sub1) this).modelTextures[0];
			for (int i_122_ = 0; i_122_ < ((Class387_Sub1) this).anInt8035; i_122_++) {
				short i_123_ = ((Class387_Sub1) this).modelTextures[i_122_];
				if (i_123_ != i_117_) {
					((Class387_Sub1) this).anIntArray8063[i_116_] = i_120_;
					((Class387_Sub1) this).anIntArray8064[i_116_] = i_121_ - i_120_ + 1;
					((Class387_Sub1) this).anIntArray8062[++i_116_] = i_122_;
					i_120_ = ((Class387_Sub1) this).anInt8038;
					i_121_ = 0;
					i_117_ = i_123_;
				}
				int i_124_ = ((Class387_Sub1) this).aShortArray8016[i_122_];
				if (i_124_ < i_120_)
					i_120_ = i_124_;
				if (i_124_ > i_121_)
					i_121_ = i_124_;
				i_124_ = ((Class387_Sub1) this).aShortArray8039[i_122_];
				if (i_124_ < i_120_)
					i_120_ = i_124_;
				if (i_124_ > i_121_)
					i_121_ = i_124_;
				i_124_ = ((Class387_Sub1) this).aShortArray8040[i_122_];
				if (i_124_ < i_120_)
					i_120_ = i_124_;
				if (i_124_ > i_121_)
					i_121_ = i_124_;
			}
			((Class387_Sub1) this).anIntArray8063[i_116_] = i_120_;
			((Class387_Sub1) this).anIntArray8064[i_116_] = i_121_ - i_120_ + 1;
			((Class387_Sub1) this).anIntArray8062[++i_116_] = ((Class387_Sub1) this).anInt8035;
		}
		((Class387_Sub1) this).aLongArray8073 = null;
		((Class387_Sub1) this).aShortArray8025 = method4494(((Class387_Sub1) this).aShortArray8025, ((Class387_Sub1) this).anInt8038);
		((Class387_Sub1) this).aShortArray8075 = method4494(((Class387_Sub1) this).aShortArray8075, ((Class387_Sub1) this).anInt8038);
		((Class387_Sub1) this).aShortArray8032 = method4494(((Class387_Sub1) this).aShortArray8032, ((Class387_Sub1) this).anInt8038);
		((Class387_Sub1) this).aShortArray8028 = method4494(((Class387_Sub1) this).aShortArray8028, ((Class387_Sub1) this).anInt8038);
		((Class387_Sub1) this).aShortArray8024 = method4494(((Class387_Sub1) this).aShortArray8024, ((Class387_Sub1) this).anInt8038);
		((Class387_Sub1) this).aByteArray8030 = method4496(((Class387_Sub1) this).aByteArray8030, ((Class387_Sub1) this).anInt8038);
		((Class387_Sub1) this).aFloatArray8031 = method4495(((Class387_Sub1) this).aFloatArray8031, ((Class387_Sub1) this).anInt8038);
		((Class387_Sub1) this).aFloatArray8053 = method4495(((Class387_Sub1) this).aFloatArray8053, ((Class387_Sub1) this).anInt8038);
		if (class98.anIntArray880 != null && Class160.method1903(i, ((Class387_Sub1) this).anInt8081))
			((Class387_Sub1) this).anIntArrayArray8022 = class98.method1197(false);
		if (class98.aClass94Array908 != null && Class160.method1904(i, ((Class387_Sub1) this).anInt8081))
			((Class387_Sub1) this).anIntArrayArray8072 = class98.method1193();
		if (class98.anIntArray890 != null && Class160.method1902(i, ((Class387_Sub1) this).anInt8081)) {
			int i_125_ = 0;
			int[] is_126_ = new int[256];
			for (int i_127_ = 0; i_127_ < ((Class387_Sub1) this).anInt8034; i_127_++) {
				int i_128_ = class98.anIntArray890[is[i_127_]];
				if (i_128_ >= 0) {
					is_126_[i_128_]++;
					if (i_128_ > i_125_)
						i_125_ = i_128_;
				}
			}
			((Class387_Sub1) this).anIntArrayArray8017 = new int[i_125_ + 1][];
			for (int i_129_ = 0; i_129_ <= i_125_; i_129_++) {
				((Class387_Sub1) this).anIntArrayArray8017[i_129_] = new int[is_126_[i_129_]];
				is_126_[i_129_] = 0;
			}
			for (int i_130_ = 0; i_130_ < ((Class387_Sub1) this).anInt8034; i_130_++) {
				int i_131_ = class98.anIntArray890[is[i_130_]];
				if (i_131_ >= 0)
					((Class387_Sub1) this).anIntArrayArray8017[i_131_][is_126_[i_131_]++] = i_130_;
			}
		}
	}

	short method4493(Model class98, int i, int i_132_, long l, int i_133_, int i_134_, int i_135_, int i_136_, float f, float f_137_) {
		int i_138_ = ((Class387_Sub1) this).anIntArray8082[i];
		int i_139_ = ((Class387_Sub1) this).anIntArray8082[i + 1];
		int i_140_ = 0;
		for (int i_141_ = i_138_; i_141_ < i_139_; i_141_++) {
			short i_142_ = ((Class387_Sub1) this).aShortArray8052[i_141_];
			if (i_142_ == 0) {
				i_140_ = i_141_;
				break;
			}
			if (((Class387_Sub1) this).aLongArray8073[i_141_] == l)
				return (short) (i_142_ - 1);
		}
		((Class387_Sub1) this).aShortArray8052[i_140_] = (short) (((Class387_Sub1) this).anInt8038 + 1);
		((Class387_Sub1) this).aLongArray8073[i_140_] = l;
		((Class387_Sub1) this).aShortArray8075[(((Class387_Sub1) this).anInt8038)] = (short) i_132_;
		((Class387_Sub1) this).aShortArray8025[(((Class387_Sub1) this).anInt8038)] = (short) i;
		((Class387_Sub1) this).aShortArray8032[(((Class387_Sub1) this).anInt8038)] = (short) i_133_;
		((Class387_Sub1) this).aShortArray8028[(((Class387_Sub1) this).anInt8038)] = (short) i_134_;
		((Class387_Sub1) this).aShortArray8024[(((Class387_Sub1) this).anInt8038)] = (short) i_135_;
		((Class387_Sub1) this).aByteArray8030[((Class387_Sub1) this).anInt8038] = (byte) i_136_;
		((Class387_Sub1) this).aFloatArray8031[(((Class387_Sub1) this).anInt8038)] = f;
		((Class387_Sub1) this).aFloatArray8053[(((Class387_Sub1) this).anInt8038)] = f_137_;
		return (short) ((Class387_Sub1) this).anInt8038++;
	}

	public int RA() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8058;
	}

	static short[] method4494(short[] is, int i) {
		short[] is_143_ = new short[i];
		System.arraycopy(is, 0, is_143_, 0, i);
		return is_143_;
	}

	static float[] method4495(float[] fs, int i) {
		float[] fs_144_ = new float[i];
		System.arraycopy(fs, 0, fs_144_, 0, i);
		return fs_144_;
	}

	static byte[] method4496(byte[] is, int i) {
		byte[] is_145_ = new byte[i];
		System.arraycopy(is, 0, is_145_, 0, i);
		return is_145_;
	}

	public void bf(int i) {
		int i_146_ = Class257.anIntArray2683[i];
		int i_147_ = Class257.anIntArray2684[i];
		for (int i_148_ = 0; i_148_ < ((Class387_Sub1) this).anInt8044; i_148_++) {
			int i_149_ = ((((Class387_Sub1) this).anIntArray8020[i_148_] * i_146_ + ((Class387_Sub1) this).anIntArray8065[i_148_] * i_147_) >> 14);
			((Class387_Sub1) this).anIntArray8020[i_148_] = ((((Class387_Sub1) this).anIntArray8020[i_148_] * i_147_ - ((Class387_Sub1) this).anIntArray8065[i_148_] * i_146_) >> 14);
			((Class387_Sub1) this).anIntArray8065[i_148_] = i_149_;
		}
		method4498();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public Class387 method4446(byte i, int i_150_, boolean bool) {
		boolean bool_151_ = false;
		Class387_Sub1 class387_sub1_152_;
		Class387_Sub1 class387_sub1_153_;
		if (i > 0 && i <= 7) {
			class387_sub1_153_ = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass387_Sub1Array8609[i - 1]);
			class387_sub1_152_ = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass387_Sub1Array8534[i - 1]);
			bool_151_ = true;
		} else
			class387_sub1_152_ = class387_sub1_153_ = new Class387_Sub1(((Class387_Sub1) this).aClass_ra_Sub2_8012, 0, 0, true, false);
		return method4497(class387_sub1_152_, class387_sub1_153_, i_150_, bool_151_, bool);
	}

	Class387 method4497(Class387_Sub1 class387_sub1_154_, Class387_Sub1 class387_sub1_155_, int i, boolean bool, boolean bool_156_) {
		((Class387_Sub1) class387_sub1_154_).anInt8013 = i;
		((Class387_Sub1) class387_sub1_154_).anInt8081 = ((Class387_Sub1) this).anInt8081;
		((Class387_Sub1) class387_sub1_154_).aShort8015 = ((Class387_Sub1) this).aShort8015;
		((Class387_Sub1) class387_sub1_154_).aShort8083 = ((Class387_Sub1) this).aShort8083;
		((Class387_Sub1) class387_sub1_154_).anInt8014 = ((Class387_Sub1) this).anInt8014;
		((Class387_Sub1) class387_sub1_154_).anInt8044 = ((Class387_Sub1) this).anInt8044;
		((Class387_Sub1) class387_sub1_154_).anInt8038 = ((Class387_Sub1) this).anInt8038;
		((Class387_Sub1) class387_sub1_154_).anInt8034 = ((Class387_Sub1) this).anInt8034;
		((Class387_Sub1) class387_sub1_154_).anInt8035 = ((Class387_Sub1) this).anInt8035;
		((Class387_Sub1) class387_sub1_154_).anInt8069 = ((Class387_Sub1) this).anInt8069;
		if ((i & 0x100) != 0)
			((Class387_Sub1) class387_sub1_154_).aBoolean8067 = true;
		else
			((Class387_Sub1) class387_sub1_154_).aBoolean8067 = ((Class387_Sub1) this).aBoolean8067;
		((Class387_Sub1) class387_sub1_154_).aBoolean8042 = ((Class387_Sub1) this).aBoolean8042;
		boolean bool_157_ = Class160.method1878(i, ((Class387_Sub1) this).anInt8081);
		boolean bool_158_ = Class160.method1879(i, ((Class387_Sub1) this).anInt8081);
		boolean bool_159_ = Class160.method1880(i, ((Class387_Sub1) this).anInt8081);
		boolean bool_160_ = bool_157_ | bool_158_ | bool_159_;
		if (bool_160_) {
			if (bool_157_) {
				if (((Class387_Sub1) class387_sub1_155_).anIntArray8065 == null || ((((Class387_Sub1) class387_sub1_155_).anIntArray8065).length < ((Class387_Sub1) this).anInt8014))
					((Class387_Sub1) class387_sub1_154_).anIntArray8065 = ((Class387_Sub1) class387_sub1_155_).anIntArray8065 = new int[((Class387_Sub1) this).anInt8014];
				else
					((Class387_Sub1) class387_sub1_154_).anIntArray8065 = ((Class387_Sub1) class387_sub1_155_).anIntArray8065;
			} else
				((Class387_Sub1) class387_sub1_154_).anIntArray8065 = ((Class387_Sub1) this).anIntArray8065;
			if (bool_158_) {
				if (((Class387_Sub1) class387_sub1_155_).anIntArray8020 == null || ((((Class387_Sub1) class387_sub1_155_).anIntArray8020).length < ((Class387_Sub1) this).anInt8014))
					((Class387_Sub1) class387_sub1_154_).anIntArray8020 = ((Class387_Sub1) class387_sub1_155_).anIntArray8020 = new int[((Class387_Sub1) this).anInt8014];
				else
					((Class387_Sub1) class387_sub1_154_).anIntArray8020 = ((Class387_Sub1) class387_sub1_155_).anIntArray8020;
			} else
				((Class387_Sub1) class387_sub1_154_).anIntArray8020 = ((Class387_Sub1) this).anIntArray8020;
			if (bool_159_) {
				if (((Class387_Sub1) class387_sub1_155_).anIntArray8051 == null || ((((Class387_Sub1) class387_sub1_155_).anIntArray8051).length < ((Class387_Sub1) this).anInt8014))
					((Class387_Sub1) class387_sub1_154_).anIntArray8051 = ((Class387_Sub1) class387_sub1_155_).anIntArray8051 = new int[((Class387_Sub1) this).anInt8014];
				else
					((Class387_Sub1) class387_sub1_154_).anIntArray8051 = ((Class387_Sub1) class387_sub1_155_).anIntArray8051;
			} else
				((Class387_Sub1) class387_sub1_154_).anIntArray8051 = ((Class387_Sub1) this).anIntArray8051;
			for (int i_161_ = 0; i_161_ < ((Class387_Sub1) this).anInt8014; i_161_++) {
				if (bool_157_)
					((Class387_Sub1) class387_sub1_154_).anIntArray8065[i_161_] = ((Class387_Sub1) this).anIntArray8065[i_161_];
				if (bool_158_)
					((Class387_Sub1) class387_sub1_154_).anIntArray8020[i_161_] = ((Class387_Sub1) this).anIntArray8020[i_161_];
				if (bool_159_)
					((Class387_Sub1) class387_sub1_154_).anIntArray8051[i_161_] = ((Class387_Sub1) this).anIntArray8051[i_161_];
			}
		} else {
			((Class387_Sub1) class387_sub1_154_).anIntArray8065 = ((Class387_Sub1) this).anIntArray8065;
			((Class387_Sub1) class387_sub1_154_).anIntArray8020 = ((Class387_Sub1) this).anIntArray8020;
			((Class387_Sub1) class387_sub1_154_).anIntArray8051 = ((Class387_Sub1) this).anIntArray8051;
		}
		if (Class160.method1892(i, ((Class387_Sub1) this).anInt8081)) {
			((Class387_Sub1) class387_sub1_154_).aClass173_8045 = ((Class387_Sub1) class387_sub1_155_).aClass173_8045;
			((Class173) ((Class387_Sub1) class387_sub1_154_).aClass173_8045).anInterface9_Impl1_1733 = (((Class173) ((Class387_Sub1) this).aClass173_8045).anInterface9_Impl1_1733);
			((Class173) ((Class387_Sub1) class387_sub1_154_).aClass173_8045).aBoolean1732 = (((Class173) ((Class387_Sub1) this).aClass173_8045).aBoolean1732);
			((Class173) ((Class387_Sub1) class387_sub1_154_).aClass173_8045).aBoolean1731 = true;
		} else if (Class160.method1899(i, ((Class387_Sub1) this).anInt8081))
			((Class387_Sub1) class387_sub1_154_).aClass173_8045 = ((Class387_Sub1) this).aClass173_8045;
		else
			((Class387_Sub1) class387_sub1_154_).aClass173_8045 = null;
		if (Class160.method1883(i, ((Class387_Sub1) this).anInt8081)) {
			if (((Class387_Sub1) class387_sub1_155_).modelColors == null || (((Class387_Sub1) class387_sub1_155_).modelColors.length < ((Class387_Sub1) this).anInt8034))
				((Class387_Sub1) class387_sub1_154_).modelColors = ((Class387_Sub1) class387_sub1_155_).modelColors = new short[((Class387_Sub1) this).anInt8034];
			else
				((Class387_Sub1) class387_sub1_154_).modelColors = ((Class387_Sub1) class387_sub1_155_).modelColors;
			for (int i_162_ = 0; i_162_ < ((Class387_Sub1) this).anInt8034; i_162_++)
				((Class387_Sub1) class387_sub1_154_).modelColors[i_162_] = ((Class387_Sub1) this).modelColors[i_162_];
		} else
			((Class387_Sub1) class387_sub1_154_).modelColors = ((Class387_Sub1) this).modelColors;
		if (Class160.method1884(i, ((Class387_Sub1) this).anInt8081)) {
			if (((Class387_Sub1) class387_sub1_155_).aByteArray8037 == null || (((Class387_Sub1) class387_sub1_155_).aByteArray8037.length < ((Class387_Sub1) this).anInt8034))
				((Class387_Sub1) class387_sub1_154_).aByteArray8037 = ((Class387_Sub1) class387_sub1_155_).aByteArray8037 = new byte[((Class387_Sub1) this).anInt8034];
			else
				((Class387_Sub1) class387_sub1_154_).aByteArray8037 = ((Class387_Sub1) class387_sub1_155_).aByteArray8037;
			for (int i_163_ = 0; i_163_ < ((Class387_Sub1) this).anInt8034; i_163_++)
				((Class387_Sub1) class387_sub1_154_).aByteArray8037[i_163_] = ((Class387_Sub1) this).aByteArray8037[i_163_];
		} else
			((Class387_Sub1) class387_sub1_154_).aByteArray8037 = ((Class387_Sub1) this).aByteArray8037;
		if (Class160.method1908(i, ((Class387_Sub1) this).anInt8081)) {
			((Class387_Sub1) class387_sub1_154_).aClass173_8046 = ((Class387_Sub1) class387_sub1_155_).aClass173_8046;
			((Class173) ((Class387_Sub1) class387_sub1_154_).aClass173_8046).anInterface9_Impl1_1733 = (((Class173) ((Class387_Sub1) this).aClass173_8046).anInterface9_Impl1_1733);
			((Class173) ((Class387_Sub1) class387_sub1_154_).aClass173_8046).aBoolean1732 = (((Class173) ((Class387_Sub1) this).aClass173_8046).aBoolean1732);
			((Class173) ((Class387_Sub1) class387_sub1_154_).aClass173_8046).aBoolean1731 = true;
		} else if (Class160.method1889(i, ((Class387_Sub1) this).anInt8081))
			((Class387_Sub1) class387_sub1_154_).aClass173_8046 = ((Class387_Sub1) this).aClass173_8046;
		else
			((Class387_Sub1) class387_sub1_154_).aClass173_8046 = null;
		if (Class160.method1882(i, ((Class387_Sub1) this).anInt8081)) {
			if (((Class387_Sub1) class387_sub1_155_).aShortArray8032 == null || (((Class387_Sub1) class387_sub1_155_).aShortArray8032.length < ((Class387_Sub1) this).anInt8038)) {
				int i_164_ = ((Class387_Sub1) this).anInt8038;
				((Class387_Sub1) class387_sub1_154_).aShortArray8032 = ((Class387_Sub1) class387_sub1_155_).aShortArray8032 = new short[i_164_];
				((Class387_Sub1) class387_sub1_154_).aShortArray8028 = ((Class387_Sub1) class387_sub1_155_).aShortArray8028 = new short[i_164_];
				((Class387_Sub1) class387_sub1_154_).aShortArray8024 = ((Class387_Sub1) class387_sub1_155_).aShortArray8024 = new short[i_164_];
			} else {
				((Class387_Sub1) class387_sub1_154_).aShortArray8032 = ((Class387_Sub1) class387_sub1_155_).aShortArray8032;
				((Class387_Sub1) class387_sub1_154_).aShortArray8028 = ((Class387_Sub1) class387_sub1_155_).aShortArray8028;
				((Class387_Sub1) class387_sub1_154_).aShortArray8024 = ((Class387_Sub1) class387_sub1_155_).aShortArray8024;
			}
			if (((Class387_Sub1) this).aClass206_8033 != null) {
				if (((Class387_Sub1) class387_sub1_155_).aClass206_8033 == null)
					((Class387_Sub1) class387_sub1_155_).aClass206_8033 = new Class206();
				Class206 class206 = (((Class387_Sub1) class387_sub1_154_).aClass206_8033 = ((Class387_Sub1) class387_sub1_155_).aClass206_8033);
				if (((Class206) class206).aShortArray1938 == null || (((Class206) class206).aShortArray1938.length < ((Class387_Sub1) this).anInt8038)) {
					int i_165_ = ((Class387_Sub1) this).anInt8038;
					((Class206) class206).aShortArray1938 = new short[i_165_];
					((Class206) class206).aShortArray1937 = new short[i_165_];
					((Class206) class206).aShortArray1939 = new short[i_165_];
					((Class206) class206).aByteArray1940 = new byte[i_165_];
				}
				for (int i_166_ = 0; i_166_ < ((Class387_Sub1) this).anInt8038; i_166_++) {
					((Class387_Sub1) class387_sub1_154_).aShortArray8032[i_166_] = ((Class387_Sub1) this).aShortArray8032[i_166_];
					((Class387_Sub1) class387_sub1_154_).aShortArray8028[i_166_] = ((Class387_Sub1) this).aShortArray8028[i_166_];
					((Class387_Sub1) class387_sub1_154_).aShortArray8024[i_166_] = ((Class387_Sub1) this).aShortArray8024[i_166_];
					((Class206) class206).aShortArray1938[i_166_] = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1938[i_166_]);
					((Class206) class206).aShortArray1937[i_166_] = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1937[i_166_]);
					((Class206) class206).aShortArray1939[i_166_] = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1939[i_166_]);
					((Class206) class206).aByteArray1940[i_166_] = (((Class206) ((Class387_Sub1) this).aClass206_8033).aByteArray1940[i_166_]);
				}
			} else {
				((Class387_Sub1) class387_sub1_154_).aClass206_8033 = null;
				for (int i_167_ = 0; i_167_ < ((Class387_Sub1) this).anInt8038; i_167_++) {
					((Class387_Sub1) class387_sub1_154_).aShortArray8032[i_167_] = ((Class387_Sub1) this).aShortArray8032[i_167_];
					((Class387_Sub1) class387_sub1_154_).aShortArray8028[i_167_] = ((Class387_Sub1) this).aShortArray8028[i_167_];
					((Class387_Sub1) class387_sub1_154_).aShortArray8024[i_167_] = ((Class387_Sub1) this).aShortArray8024[i_167_];
				}
			}
			((Class387_Sub1) class387_sub1_154_).aByteArray8030 = ((Class387_Sub1) this).aByteArray8030;
		} else {
			((Class387_Sub1) class387_sub1_154_).aClass206_8033 = ((Class387_Sub1) this).aClass206_8033;
			((Class387_Sub1) class387_sub1_154_).aShortArray8032 = ((Class387_Sub1) this).aShortArray8032;
			((Class387_Sub1) class387_sub1_154_).aShortArray8028 = ((Class387_Sub1) this).aShortArray8028;
			((Class387_Sub1) class387_sub1_154_).aShortArray8024 = ((Class387_Sub1) this).aShortArray8024;
			((Class387_Sub1) class387_sub1_154_).aByteArray8030 = ((Class387_Sub1) this).aByteArray8030;
		}
		if (Class160.method1893(i, ((Class387_Sub1) this).anInt8081)) {
			((Class387_Sub1) class387_sub1_154_).aClass173_8047 = ((Class387_Sub1) class387_sub1_155_).aClass173_8047;
			((Class173) ((Class387_Sub1) class387_sub1_154_).aClass173_8047).anInterface9_Impl1_1733 = (((Class173) ((Class387_Sub1) this).aClass173_8047).anInterface9_Impl1_1733);
			((Class173) ((Class387_Sub1) class387_sub1_154_).aClass173_8047).aBoolean1732 = (((Class173) ((Class387_Sub1) this).aClass173_8047).aBoolean1732);
			((Class173) ((Class387_Sub1) class387_sub1_154_).aClass173_8047).aBoolean1731 = true;
		} else if (Class160.method1888(i, ((Class387_Sub1) this).anInt8081))
			((Class387_Sub1) class387_sub1_154_).aClass173_8047 = ((Class387_Sub1) this).aClass173_8047;
		else
			((Class387_Sub1) class387_sub1_154_).aClass173_8047 = null;
		if (Class160.method1906(i, ((Class387_Sub1) this).anInt8081)) {
			if (((Class387_Sub1) class387_sub1_155_).aFloatArray8031 == null || (((Class387_Sub1) class387_sub1_155_).aFloatArray8031.length < ((Class387_Sub1) this).anInt8034)) {
				int i_168_ = ((Class387_Sub1) this).anInt8038;
				((Class387_Sub1) class387_sub1_154_).aFloatArray8031 = ((Class387_Sub1) class387_sub1_155_).aFloatArray8031 = new float[i_168_];
				((Class387_Sub1) class387_sub1_154_).aFloatArray8053 = ((Class387_Sub1) class387_sub1_155_).aFloatArray8053 = new float[i_168_];
			} else {
				((Class387_Sub1) class387_sub1_154_).aFloatArray8031 = ((Class387_Sub1) class387_sub1_155_).aFloatArray8031;
				((Class387_Sub1) class387_sub1_154_).aFloatArray8053 = ((Class387_Sub1) class387_sub1_155_).aFloatArray8053;
			}
			for (int i_169_ = 0; i_169_ < ((Class387_Sub1) this).anInt8038; i_169_++) {
				((Class387_Sub1) class387_sub1_154_).aFloatArray8031[i_169_] = ((Class387_Sub1) this).aFloatArray8031[i_169_];
				((Class387_Sub1) class387_sub1_154_).aFloatArray8053[i_169_] = ((Class387_Sub1) this).aFloatArray8053[i_169_];
			}
		} else {
			((Class387_Sub1) class387_sub1_154_).aFloatArray8031 = ((Class387_Sub1) this).aFloatArray8031;
			((Class387_Sub1) class387_sub1_154_).aFloatArray8053 = ((Class387_Sub1) this).aFloatArray8053;
		}
		if (Class160.method1894(i, ((Class387_Sub1) this).anInt8081)) {
			((Class387_Sub1) class387_sub1_154_).aClass173_8021 = ((Class387_Sub1) class387_sub1_155_).aClass173_8021;
			((Class173) ((Class387_Sub1) class387_sub1_154_).aClass173_8021).anInterface9_Impl1_1733 = (((Class173) ((Class387_Sub1) this).aClass173_8021).anInterface9_Impl1_1733);
			((Class173) ((Class387_Sub1) class387_sub1_154_).aClass173_8021).aBoolean1732 = (((Class173) ((Class387_Sub1) this).aClass173_8021).aBoolean1732);
			((Class173) ((Class387_Sub1) class387_sub1_154_).aClass173_8021).aBoolean1731 = true;
		} else if (Class160.method1890(i, ((Class387_Sub1) this).anInt8081))
			((Class387_Sub1) class387_sub1_154_).aClass173_8021 = ((Class387_Sub1) this).aClass173_8021;
		else
			((Class387_Sub1) class387_sub1_154_).aClass173_8021 = null;
		if (Class160.method1910(i, ((Class387_Sub1) this).anInt8081)) {
			if (((Class387_Sub1) class387_sub1_155_).aShortArray8016 == null || (((Class387_Sub1) class387_sub1_155_).aShortArray8016.length < ((Class387_Sub1) this).anInt8034)) {
				int i_170_ = ((Class387_Sub1) this).anInt8034;
				((Class387_Sub1) class387_sub1_154_).aShortArray8016 = ((Class387_Sub1) class387_sub1_155_).aShortArray8016 = new short[i_170_];
				((Class387_Sub1) class387_sub1_154_).aShortArray8039 = ((Class387_Sub1) class387_sub1_155_).aShortArray8039 = new short[i_170_];
				((Class387_Sub1) class387_sub1_154_).aShortArray8040 = ((Class387_Sub1) class387_sub1_155_).aShortArray8040 = new short[i_170_];
			} else {
				((Class387_Sub1) class387_sub1_154_).aShortArray8016 = ((Class387_Sub1) class387_sub1_155_).aShortArray8016;
				((Class387_Sub1) class387_sub1_154_).aShortArray8039 = ((Class387_Sub1) class387_sub1_155_).aShortArray8039;
				((Class387_Sub1) class387_sub1_154_).aShortArray8040 = ((Class387_Sub1) class387_sub1_155_).aShortArray8040;
			}
			for (int i_171_ = 0; i_171_ < ((Class387_Sub1) this).anInt8034; i_171_++) {
				((Class387_Sub1) class387_sub1_154_).aShortArray8016[i_171_] = ((Class387_Sub1) this).aShortArray8016[i_171_];
				((Class387_Sub1) class387_sub1_154_).aShortArray8039[i_171_] = ((Class387_Sub1) this).aShortArray8039[i_171_];
				((Class387_Sub1) class387_sub1_154_).aShortArray8040[i_171_] = ((Class387_Sub1) this).aShortArray8040[i_171_];
			}
		} else {
			((Class387_Sub1) class387_sub1_154_).aShortArray8016 = ((Class387_Sub1) this).aShortArray8016;
			((Class387_Sub1) class387_sub1_154_).aShortArray8039 = ((Class387_Sub1) this).aShortArray8039;
			((Class387_Sub1) class387_sub1_154_).aShortArray8040 = ((Class387_Sub1) this).aShortArray8040;
		}
		if (Class160.method1895(i, ((Class387_Sub1) this).anInt8081)) {
			((Class387_Sub1) class387_sub1_154_).aClass165_8050 = ((Class387_Sub1) class387_sub1_155_).aClass165_8050;
			((Class165) ((Class387_Sub1) class387_sub1_154_).aClass165_8050).anInterface9_Impl2_1698 = (((Class165) ((Class387_Sub1) this).aClass165_8050).anInterface9_Impl2_1698);
			((Class165) ((Class387_Sub1) class387_sub1_154_).aClass165_8050).aBoolean1697 = (((Class165) ((Class387_Sub1) this).aClass165_8050).aBoolean1697);
			((Class165) ((Class387_Sub1) class387_sub1_154_).aClass165_8050).aBoolean1696 = true;
		} else if (Class160.method1891(i, ((Class387_Sub1) this).anInt8081))
			((Class387_Sub1) class387_sub1_154_).aClass165_8050 = ((Class387_Sub1) this).aClass165_8050;
		else
			((Class387_Sub1) class387_sub1_154_).aClass165_8050 = null;
		if (Class160.method1898(i, ((Class387_Sub1) this).anInt8081)) {
			if (((Class387_Sub1) class387_sub1_155_).modelTextures == null || (((Class387_Sub1) class387_sub1_155_).modelTextures.length < ((Class387_Sub1) this).anInt8034)) {
				int i_172_ = ((Class387_Sub1) this).anInt8034;
				((Class387_Sub1) class387_sub1_154_).modelTextures = ((Class387_Sub1) class387_sub1_155_).modelTextures = new short[i_172_];
			} else
				((Class387_Sub1) class387_sub1_154_).modelTextures = ((Class387_Sub1) class387_sub1_155_).modelTextures;
			for (int i_173_ = 0; i_173_ < ((Class387_Sub1) this).anInt8034; i_173_++)
				((Class387_Sub1) class387_sub1_154_).modelTextures[i_173_] = ((Class387_Sub1) this).modelTextures[i_173_];
		} else
			((Class387_Sub1) class387_sub1_154_).modelTextures = ((Class387_Sub1) this).modelTextures;
		if (Class160.method1886(i, ((Class387_Sub1) this).anInt8081)) {
			if (((Class387_Sub1) class387_sub1_155_).aClass177Array8071 == null || ((((Class387_Sub1) class387_sub1_155_).aClass177Array8071).length < ((Class387_Sub1) this).anInt8069)) {
				int i_174_ = ((Class387_Sub1) this).anInt8069;
				((Class387_Sub1) class387_sub1_154_).aClass177Array8071 = ((Class387_Sub1) class387_sub1_155_).aClass177Array8071 = new Class177[i_174_];
				for (int i_175_ = 0; i_175_ < ((Class387_Sub1) this).anInt8069; i_175_++)
					((Class387_Sub1) class387_sub1_154_).aClass177Array8071[i_175_] = ((Class387_Sub1) this).aClass177Array8071[i_175_].method2052();
			} else {
				((Class387_Sub1) class387_sub1_154_).aClass177Array8071 = ((Class387_Sub1) class387_sub1_155_).aClass177Array8071;
				for (int i_176_ = 0; i_176_ < ((Class387_Sub1) this).anInt8069; i_176_++)
					((Class387_Sub1) class387_sub1_154_).aClass177Array8071[i_176_].method2051(((Class387_Sub1) this).aClass177Array8071[i_176_]);
			}
		} else
			((Class387_Sub1) class387_sub1_154_).aClass177Array8071 = ((Class387_Sub1) this).aClass177Array8071;
		((Class387_Sub1) class387_sub1_154_).aClass185Array8070 = ((Class387_Sub1) this).aClass185Array8070;
		if (((Class387_Sub1) this).aBoolean8043) {
			((Class387_Sub1) class387_sub1_154_).anInt8027 = ((Class387_Sub1) this).anInt8027;
			((Class387_Sub1) class387_sub1_154_).anInt8054 = ((Class387_Sub1) this).anInt8054;
			((Class387_Sub1) class387_sub1_154_).anInt8058 = ((Class387_Sub1) this).anInt8058;
			((Class387_Sub1) class387_sub1_154_).anInt8059 = ((Class387_Sub1) this).anInt8059;
			((Class387_Sub1) class387_sub1_154_).anInt8056 = ((Class387_Sub1) this).anInt8056;
			((Class387_Sub1) class387_sub1_154_).anInt8057 = ((Class387_Sub1) this).anInt8057;
			((Class387_Sub1) class387_sub1_154_).anInt8060 = ((Class387_Sub1) this).anInt8060;
			((Class387_Sub1) class387_sub1_154_).anInt8078 = ((Class387_Sub1) this).anInt8078;
			((Class387_Sub1) class387_sub1_154_).aBoolean8043 = true;
		} else
			((Class387_Sub1) class387_sub1_154_).aBoolean8043 = false;
		((Class387_Sub1) class387_sub1_154_).anIntArrayArray8022 = ((Class387_Sub1) this).anIntArrayArray8022;
		((Class387_Sub1) class387_sub1_154_).anIntArrayArray8017 = ((Class387_Sub1) this).anIntArrayArray8017;
		((Class387_Sub1) class387_sub1_154_).anIntArrayArray8072 = ((Class387_Sub1) this).anIntArrayArray8072;
		((Class387_Sub1) class387_sub1_154_).aShortArray8052 = ((Class387_Sub1) this).aShortArray8052;
		((Class387_Sub1) class387_sub1_154_).anIntArray8082 = ((Class387_Sub1) this).anIntArray8082;
		((Class387_Sub1) class387_sub1_154_).aShortArray8025 = ((Class387_Sub1) this).aShortArray8025;
		((Class387_Sub1) class387_sub1_154_).aShortArray8075 = ((Class387_Sub1) this).aShortArray8075;
		((Class387_Sub1) class387_sub1_154_).aShortArray8023 = ((Class387_Sub1) this).aShortArray8023;
		((Class387_Sub1) class387_sub1_154_).aShortArray8018 = ((Class387_Sub1) this).aShortArray8018;
		((Class387_Sub1) class387_sub1_154_).anIntArray8062 = ((Class387_Sub1) this).anIntArray8062;
		((Class387_Sub1) class387_sub1_154_).anIntArray8064 = ((Class387_Sub1) this).anIntArray8064;
		((Class387_Sub1) class387_sub1_154_).anIntArray8063 = ((Class387_Sub1) this).anIntArray8063;
		((Class387_Sub1) class387_sub1_154_).aClass93Array8026 = ((Class387_Sub1) this).aClass93Array8026;
		((Class387_Sub1) class387_sub1_154_).aClass64Array8068 = ((Class387_Sub1) this).aClass64Array8068;
		return class387_sub1_154_;
	}

	void method4489() {
		/* empty */
	}

	void method4498() {
		if (((Class387_Sub1) this).aClass173_8045 != null)
			((Class173) ((Class387_Sub1) this).aClass173_8045).aBoolean1732 = false;
	}

	public void EA(int i) {
		int i_177_ = Class257.anIntArray2683[i];
		int i_178_ = Class257.anIntArray2684[i];
		for (int i_179_ = 0; i_179_ < ((Class387_Sub1) this).anInt8044; i_179_++) {
			int i_180_ = ((((Class387_Sub1) this).anIntArray8020[i_179_] * i_177_ + ((Class387_Sub1) this).anIntArray8065[i_179_] * i_178_) >> 14);
			((Class387_Sub1) this).anIntArray8020[i_179_] = ((((Class387_Sub1) this).anIntArray8020[i_179_] * i_178_ - ((Class387_Sub1) this).anIntArray8065[i_179_] * i_177_) >> 14);
			((Class387_Sub1) this).anIntArray8065[i_179_] = i_180_;
		}
		method4498();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	void method4499() {
		if ((((Class387_Sub1) this).anInt8081 & 0x37) != 0) {
			if (((Class387_Sub1) this).aClass173_8047 != null)
				((Class173) ((Class387_Sub1) this).aClass173_8047).aBoolean1732 = false;
		} else if (((Class387_Sub1) this).aClass173_8046 != null)
			((Class173) ((Class387_Sub1) this).aClass173_8046).aBoolean1732 = false;
	}

	void method4500() {
		if (((Class387_Sub1) this).aClass165_8050 != null)
			((Class165) ((Class387_Sub1) this).aClass165_8050).aBoolean1697 = false;
	}

	public void f(int i) {
		int i_181_ = Class257.anIntArray2683[i];
		int i_182_ = Class257.anIntArray2684[i];
		for (int i_183_ = 0; i_183_ < ((Class387_Sub1) this).anInt8044; i_183_++) {
			int i_184_ = ((((Class387_Sub1) this).anIntArray8051[i_183_] * i_181_ + ((Class387_Sub1) this).anIntArray8065[i_183_] * i_182_) >> 14);
			((Class387_Sub1) this).anIntArray8051[i_183_] = ((((Class387_Sub1) this).anIntArray8051[i_183_] * i_182_ - ((Class387_Sub1) this).anIntArray8065[i_183_] * i_181_) >> 14);
			((Class387_Sub1) this).anIntArray8065[i_183_] = i_184_;
		}
		method4498();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public int n() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8027;
	}

	public void t(int i) {
		int i_185_ = Class257.anIntArray2683[i];
		int i_186_ = Class257.anIntArray2684[i];
		for (int i_187_ = 0; i_187_ < ((Class387_Sub1) this).anInt8044; i_187_++) {
			int i_188_ = ((((Class387_Sub1) this).anIntArray8020[i_187_] * i_186_ - ((Class387_Sub1) this).anIntArray8051[i_187_] * i_185_) >> 14);
			((Class387_Sub1) this).anIntArray8051[i_187_] = ((((Class387_Sub1) this).anIntArray8020[i_187_] * i_185_ + ((Class387_Sub1) this).anIntArray8051[i_187_] * i_186_) >> 14);
			((Class387_Sub1) this).anIntArray8020[i_187_] = i_188_;
		}
		method4498();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public boolean i() {
		return ((Class387_Sub1) this).aBoolean8067;
	}

	public void ia(int i, int i_189_, int i_190_) {
		for (int i_191_ = 0; i_191_ < ((Class387_Sub1) this).anInt8044; i_191_++) {
			if (i != 0)
				((Class387_Sub1) this).anIntArray8065[i_191_] += i;
			if (i_189_ != 0)
				((Class387_Sub1) this).anIntArray8020[i_191_] += i_189_;
			if (i_190_ != 0)
				((Class387_Sub1) this).anIntArray8051[i_191_] += i_190_;
		}
		method4498();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public void wa() {
		for (int i = 0; i < ((Class387_Sub1) this).anInt8044; i++)
			((Class387_Sub1) this).anIntArray8051[i] = -((Class387_Sub1) this).anIntArray8051[i];
		for (int i = 0; i < ((Class387_Sub1) this).anInt8038; i++)
			((Class387_Sub1) this).aShortArray8024[i] = (short) -((Class387_Sub1) this).aShortArray8024[i];
		for (int i = 0; i < ((Class387_Sub1) this).anInt8034; i++) {
			short i_192_ = ((Class387_Sub1) this).aShortArray8016[i];
			((Class387_Sub1) this).aShortArray8016[i] = ((Class387_Sub1) this).aShortArray8040[i];
			((Class387_Sub1) this).aShortArray8040[i] = i_192_;
		}
		method4498();
		method4499();
		method4500();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public void pa(int i, int i_193_, Class_xa class_xa, Class_xa class_xa_194_, int i_195_, int i_196_, int i_197_) {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		int i_198_ = i_195_ + ((Class387_Sub1) this).anInt8058;
		int i_199_ = i_195_ + ((Class387_Sub1) this).anInt8059;
		int i_200_ = i_197_ + ((Class387_Sub1) this).anInt8060;
		int i_201_ = i_197_ + ((Class387_Sub1) this).anInt8078;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_198_ >= 0 && ((i_199_ + class_xa.anInt6395 * 550173571 >> class_xa.anInt6396 * -1066304221) < class_xa.anInt6397 * 1972554729) && i_200_ >= 0 && ((i_201_ + class_xa.anInt6395 * 550173571 >> class_xa.anInt6396 * -1066304221) < class_xa.anInt6393 * 24567321))) {
			if (i == 4 || i == 5) {
				if (class_xa_194_ == null || (i_198_ < 0 || ((i_199_ + class_xa_194_.anInt6395 * 550173571 >> class_xa_194_.anInt6396 * -1066304221) >= class_xa_194_.anInt6397 * 1972554729) || i_200_ < 0 || ((i_201_ + class_xa_194_.anInt6395 * 550173571 >> class_xa_194_.anInt6396 * -1066304221) >= class_xa_194_.anInt6393 * 24567321)))
					return;
			} else {
				i_198_ >>= class_xa.anInt6396 * -1066304221;
				i_199_ = (i_199_ + (class_xa.anInt6395 * 550173571 - 1) >> class_xa.anInt6396 * -1066304221);
				i_200_ >>= class_xa.anInt6396 * -1066304221;
				i_201_ = (i_201_ + (class_xa.anInt6395 * 550173571 - 1) >> class_xa.anInt6396 * -1066304221);
				if (class_xa.method6417(i_198_, i_200_, -775390957) == i_196_ && (class_xa.method6417(i_199_, i_200_, -1902262142) == i_196_) && class_xa.method6417(i_198_, i_201_, 495253824) == i_196_ && (class_xa.method6417(i_199_, i_201_, 1365236568) == i_196_))
					return;
			}
			if (i == 1) {
				for (int i_202_ = 0; i_202_ < ((Class387_Sub1) this).anInt8044; i_202_++)
					((Class387_Sub1) this).anIntArray8020[i_202_] = (((Class387_Sub1) this).anIntArray8020[i_202_] + class_xa.method6416(((((Class387_Sub1) this).anIntArray8065[i_202_]) + i_195_), ((((Class387_Sub1) this).anIntArray8051[i_202_]) + i_197_), -61158529) - i_196_);
			} else if (i == 2) {
				int i_203_ = ((Class387_Sub1) this).anInt8056;
				if (i_203_ == 0)
					return;
				for (int i_204_ = 0; i_204_ < ((Class387_Sub1) this).anInt8044; i_204_++) {
					int i_205_ = (((Class387_Sub1) this).anIntArray8020[i_204_] << 16) / i_203_;
					if (i_205_ < i_193_)
						((Class387_Sub1) this).anIntArray8020[i_204_] = (((Class387_Sub1) this).anIntArray8020[i_204_] + (class_xa.method6416((((Class387_Sub1) this).anIntArray8065[i_204_]) + i_195_, (((Class387_Sub1) this).anIntArray8051[i_204_]) + i_197_, -1919827665) - i_196_) * (i_193_ - i_205_) / i_193_);
				}
			} else if (i == 3) {
				int i_206_ = (i_193_ & 0xff) * 4;
				int i_207_ = (i_193_ >> 8 & 0xff) * 4;
				int i_208_ = (i_193_ >> 16 & 0xff) << 6;
				int i_209_ = (i_193_ >> 24 & 0xff) << 6;
				if (i_195_ - (i_206_ >> 1) < 0 || (i_195_ + (i_206_ >> 1) + class_xa.anInt6395 * 550173571 >= (class_xa.anInt6397 * 1972554729 << class_xa.anInt6396 * -1066304221)) || i_197_ - (i_207_ >> 1) < 0 || (i_197_ + (i_207_ >> 1) + class_xa.anInt6395 * 550173571 >= (class_xa.anInt6393 * 24567321 << class_xa.anInt6396 * -1066304221)))
					return;
				method4447(class_xa, i_195_, i_196_, i_197_, i_206_, i_207_, i_208_, i_209_);
			} else if (i == 4) {
				int i_210_ = (((Class387_Sub1) this).anInt8057 - ((Class387_Sub1) this).anInt8056);
				for (int i_211_ = 0; i_211_ < ((Class387_Sub1) this).anInt8044; i_211_++)
					((Class387_Sub1) this).anIntArray8020[i_211_] = (((Class387_Sub1) this).anIntArray8020[i_211_] + (class_xa_194_.method6416((((Class387_Sub1) this).anIntArray8065[i_211_]) + i_195_, (((Class387_Sub1) this).anIntArray8051[i_211_]) + i_197_, 1797138981) - i_196_) + i_210_);
			} else if (i == 5) {
				int i_212_ = (((Class387_Sub1) this).anInt8057 - ((Class387_Sub1) this).anInt8056);
				for (int i_213_ = 0; i_213_ < ((Class387_Sub1) this).anInt8044; i_213_++) {
					int i_214_ = (((Class387_Sub1) this).anIntArray8065[i_213_] + i_195_);
					int i_215_ = (((Class387_Sub1) this).anIntArray8051[i_213_] + i_197_);
					int i_216_ = class_xa.method6416(i_214_, i_215_, -1872441530);
					int i_217_ = class_xa_194_.method6416(i_214_, i_215_, -1339832005);
					int i_218_ = i_216_ - i_217_ - i_193_;
					((Class387_Sub1) this).anIntArray8020[i_213_] = ((((Class387_Sub1) this).anIntArray8020[i_213_] << 8) / i_212_ * i_218_ >> 8) - (i_196_ - i_216_);
				}
			}
			method4498();
			((Class387_Sub1) this).aBoolean8043 = false;
		}
	}

	void method4501() {
		int i = 32767;
		int i_219_ = 32767;
		int i_220_ = 32767;
		int i_221_ = -32768;
		int i_222_ = -32768;
		int i_223_ = -32768;
		int i_224_ = 0;
		int i_225_ = 0;
		for (int i_226_ = 0; i_226_ < ((Class387_Sub1) this).anInt8044; i_226_++) {
			int i_227_ = ((Class387_Sub1) this).anIntArray8065[i_226_];
			int i_228_ = ((Class387_Sub1) this).anIntArray8020[i_226_];
			int i_229_ = ((Class387_Sub1) this).anIntArray8051[i_226_];
			if (i_227_ < i)
				i = i_227_;
			if (i_227_ > i_221_)
				i_221_ = i_227_;
			if (i_228_ < i_219_)
				i_219_ = i_228_;
			if (i_228_ > i_222_)
				i_222_ = i_228_;
			if (i_229_ < i_220_)
				i_220_ = i_229_;
			if (i_229_ > i_223_)
				i_223_ = i_229_;
			int i_230_ = i_227_ * i_227_ + i_229_ * i_229_;
			if (i_230_ > i_224_)
				i_224_ = i_230_;
			i_230_ = i_227_ * i_227_ + i_229_ * i_229_ + i_228_ * i_228_;
			if (i_230_ > i_225_)
				i_225_ = i_230_;
		}
		((Class387_Sub1) this).anInt8058 = i;
		((Class387_Sub1) this).anInt8059 = i_221_;
		((Class387_Sub1) this).anInt8056 = i_219_;
		((Class387_Sub1) this).anInt8057 = i_222_;
		((Class387_Sub1) this).anInt8060 = i_220_;
		((Class387_Sub1) this).anInt8078 = i_223_;
		((Class387_Sub1) this).anInt8054 = (int) (Math.sqrt((double) i_224_) + 0.99);
		((Class387_Sub1) this).anInt8027 = (int) (Math.sqrt((double) i_225_) + 0.99);
		((Class387_Sub1) this).aBoolean8043 = true;
	}

	boolean method4502(int i, int i_231_, int i_232_, int i_233_, Class247 class247, boolean bool, int i_234_) {
		Class249 class249 = ((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8576;
		class249.method2508(class247);
		class249.method2483(((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass249_8492);
		boolean bool_235_ = false;
		float f = 3.4028235E38F;
		float f_236_ = -3.4028235E38F;
		float f_237_ = 3.4028235E38F;
		float f_238_ = -3.4028235E38F;
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		int i_239_ = ((((Class387_Sub1) this).anInt8059 - ((Class387_Sub1) this).anInt8058) >> 1);
		int i_240_ = ((((Class387_Sub1) this).anInt8057 - ((Class387_Sub1) this).anInt8056) >> 1);
		int i_241_ = ((((Class387_Sub1) this).anInt8078 - ((Class387_Sub1) this).anInt8060) >> 1);
		int i_242_ = ((Class387_Sub1) this).anInt8058 + i_239_;
		int i_243_ = ((Class387_Sub1) this).anInt8056 + i_240_;
		int i_244_ = ((Class387_Sub1) this).anInt8060 + i_241_;
		int i_245_ = i_242_ - (i_239_ << i_234_);
		int i_246_ = i_243_ - (i_240_ << i_234_);
		int i_247_ = i_244_ - (i_241_ << i_234_);
		int i_248_ = i_242_ + (i_239_ << i_234_);
		int i_249_ = i_243_ + (i_240_ << i_234_);
		int i_250_ = i_244_ + (i_241_ << i_234_);
		((Class387_Sub1) this).anIntArray8077[0] = i_245_;
		((Class387_Sub1) this).anIntArray8029[0] = i_246_;
		((Class387_Sub1) this).anIntArray8079[0] = i_247_;
		((Class387_Sub1) this).anIntArray8077[1] = i_248_;
		((Class387_Sub1) this).anIntArray8029[1] = i_246_;
		((Class387_Sub1) this).anIntArray8079[1] = i_247_;
		((Class387_Sub1) this).anIntArray8077[2] = i_245_;
		((Class387_Sub1) this).anIntArray8029[2] = i_249_;
		((Class387_Sub1) this).anIntArray8079[2] = i_247_;
		((Class387_Sub1) this).anIntArray8077[3] = i_248_;
		((Class387_Sub1) this).anIntArray8029[3] = i_249_;
		((Class387_Sub1) this).anIntArray8079[3] = i_247_;
		((Class387_Sub1) this).anIntArray8077[4] = i_245_;
		((Class387_Sub1) this).anIntArray8029[4] = i_246_;
		((Class387_Sub1) this).anIntArray8079[4] = i_250_;
		((Class387_Sub1) this).anIntArray8077[5] = i_248_;
		((Class387_Sub1) this).anIntArray8029[5] = i_246_;
		((Class387_Sub1) this).anIntArray8079[5] = i_250_;
		((Class387_Sub1) this).anIntArray8077[6] = i_245_;
		((Class387_Sub1) this).anIntArray8029[6] = i_249_;
		((Class387_Sub1) this).anIntArray8079[6] = i_250_;
		((Class387_Sub1) this).anIntArray8077[7] = i_248_;
		((Class387_Sub1) this).anIntArray8029[7] = i_249_;
		((Class387_Sub1) this).anIntArray8079[7] = i_250_;
		for (int i_251_ = 0; i_251_ < 8; i_251_++) {
			float f_252_ = (float) ((Class387_Sub1) this).anIntArray8077[i_251_];
			float f_253_ = (float) ((Class387_Sub1) this).anIntArray8029[i_251_];
			float f_254_ = (float) ((Class387_Sub1) this).anIntArray8079[i_251_];
			float f_255_ = (class249.aFloatArray2631[2] * f_252_ + class249.aFloatArray2631[6] * f_253_ + class249.aFloatArray2631[10] * f_254_ + class249.aFloatArray2631[14]);
			float f_256_ = (class249.aFloatArray2631[3] * f_252_ + class249.aFloatArray2631[7] * f_253_ + class249.aFloatArray2631[11] * f_254_ + class249.aFloatArray2631[15]);
			if (f_255_ >= -f_256_) {
				float f_257_ = (class249.aFloatArray2631[0] * f_252_ + class249.aFloatArray2631[4] * f_253_ + class249.aFloatArray2631[8] * f_254_ + class249.aFloatArray2631[12]);
				float f_258_ = (class249.aFloatArray2631[1] * f_252_ + class249.aFloatArray2631[5] * f_253_ + class249.aFloatArray2631[9] * f_254_ + class249.aFloatArray2631[13]);
				float f_259_ = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aFloat8495 + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505 * f_257_ / f_256_));
				float f_260_ = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aFloat8497 + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8498 * f_258_ / f_256_));
				if (f_259_ < f)
					f = f_259_;
				if (f_259_ > f_236_)
					f_236_ = f_259_;
				if (f_260_ < f_237_)
					f_237_ = f_260_;
				if (f_260_ > f_238_)
					f_238_ = f_260_;
				bool_235_ = true;
			}
		}
		int i_261_ = i + i_232_;
		int i_262_ = i_231_ + i_233_;
		if (bool_235_ && (float) i_261_ > f && (float) i < f_236_ && (float) i_262_ > f_237_ && (float) i_231_ < f_238_) {
			if (bool)
				return true;
			if (((Class387_Sub1) this).anIntArray8010.length < ((Class387_Sub1) this).anInt8038) {
				((Class387_Sub1) this).anIntArray8010 = new int[((Class387_Sub1) this).anInt8038];
				((Class387_Sub1) this).anIntArray8076 = new int[((Class387_Sub1) this).anInt8038];
			}
			for (int i_263_ = 0; i_263_ < ((Class387_Sub1) this).anInt8044; i_263_++) {
				float f_264_ = (float) ((Class387_Sub1) this).anIntArray8065[i_263_];
				float f_265_ = (float) ((Class387_Sub1) this).anIntArray8020[i_263_];
				float f_266_ = (float) ((Class387_Sub1) this).anIntArray8051[i_263_];
				float f_267_ = (class249.aFloatArray2631[2] * f_264_ + class249.aFloatArray2631[6] * f_265_ + class249.aFloatArray2631[10] * f_266_ + class249.aFloatArray2631[14]);
				float f_268_ = (class249.aFloatArray2631[3] * f_264_ + class249.aFloatArray2631[7] * f_265_ + class249.aFloatArray2631[11] * f_266_ + class249.aFloatArray2631[15]);
				if (f_267_ >= -f_268_) {
					float f_269_ = (class249.aFloatArray2631[0] * f_264_ + class249.aFloatArray2631[4] * f_265_ + class249.aFloatArray2631[8] * f_266_ + class249.aFloatArray2631[12]);
					float f_270_ = (class249.aFloatArray2631[1] * f_264_ + class249.aFloatArray2631[5] * f_265_ + class249.aFloatArray2631[9] * f_266_ + class249.aFloatArray2631[13]);
					int i_271_ = ((Class387_Sub1) this).anIntArray8082[i_263_];
					int i_272_ = ((Class387_Sub1) this).anIntArray8082[i_263_ + 1];
					for (int i_273_ = i_271_; i_273_ < i_272_; i_273_++) {
						int i_274_ = (((Class387_Sub1) this).aShortArray8052[i_273_] - 1);
						if (i_274_ == -1)
							break;
						((Class387_Sub1) this).anIntArray8010[i_274_] = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8495) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505 * f_269_ / f_268_));
						((Class387_Sub1) this).anIntArray8076[i_274_] = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8497) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8498 * f_270_ / f_268_));
					}
				} else {
					int i_275_ = ((Class387_Sub1) this).anIntArray8082[i_263_];
					int i_276_ = ((Class387_Sub1) this).anIntArray8082[i_263_ + 1];
					for (int i_277_ = i_275_; i_277_ < i_276_; i_277_++) {
						int i_278_ = (((Class387_Sub1) this).aShortArray8052[i_277_] - 1);
						if (i_278_ == -1)
							break;
						((Class387_Sub1) this).anIntArray8010[(((Class387_Sub1) this).aShortArray8052[i_277_] - 1)] = -999999;
					}
				}
			}
			for (int i_279_ = 0; i_279_ < ((Class387_Sub1) this).anInt8034; i_279_++) {
				if (((((Class387_Sub1) this).anIntArray8010[((Class387_Sub1) this).aShortArray8016[i_279_]]) != -999999) && ((((Class387_Sub1) this).anIntArray8010[((Class387_Sub1) this).aShortArray8039[i_279_]]) != -999999) && ((((Class387_Sub1) this).anIntArray8010[((Class387_Sub1) this).aShortArray8040[i_279_]]) != -999999) && (method4513(i, i_231_, i_261_, i_262_, (((Class387_Sub1) this).anIntArray8076[((Class387_Sub1) this).aShortArray8016[i_279_]]), (((Class387_Sub1) this).anIntArray8076[((Class387_Sub1) this).aShortArray8039[i_279_]]), (((Class387_Sub1) this).anIntArray8076[((Class387_Sub1) this).aShortArray8040[i_279_]]), (((Class387_Sub1) this).anIntArray8010[((Class387_Sub1) this).aShortArray8016[i_279_]]), (((Class387_Sub1) this).anIntArray8010[((Class387_Sub1) this).aShortArray8039[i_279_]]), (((Class387_Sub1) this).anIntArray8010[((Class387_Sub1) this).aShortArray8040[i_279_]]))))
					return true;
			}
		}
		return false;
	}

	public boolean dp() {
		return ((Class387_Sub1) this).aBoolean8042;
	}

	public void KA(int i) {
		if (((Class387_Sub1) this).aClass173_8045 != null)
			((Class173) ((Class387_Sub1) this).aClass173_8045).aBoolean1731 = Class160.method1892(i, ((Class387_Sub1) this).anInt8081);
		if (((Class387_Sub1) this).aClass173_8021 != null)
			((Class173) ((Class387_Sub1) this).aClass173_8021).aBoolean1731 = Class160.method1894(i, ((Class387_Sub1) this).anInt8081);
		if (((Class387_Sub1) this).aClass173_8046 != null)
			((Class173) ((Class387_Sub1) this).aClass173_8046).aBoolean1731 = Class160.method1908(i, ((Class387_Sub1) this).anInt8081);
		if (((Class387_Sub1) this).aClass173_8047 != null)
			((Class173) ((Class387_Sub1) this).aClass173_8047).aBoolean1731 = Class160.method1893(i, ((Class387_Sub1) this).anInt8081);
		((Class387_Sub1) this).anInt8013 = i;
		if (((Class387_Sub1) this).aClass206_8033 != null && (((Class387_Sub1) this).anInt8013 & 0x10000) == 0) {
			((Class387_Sub1) this).aShortArray8032 = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1938);
			((Class387_Sub1) this).aShortArray8028 = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1937);
			((Class387_Sub1) this).aShortArray8024 = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1939);
			((Class387_Sub1) this).aByteArray8030 = (((Class206) ((Class387_Sub1) this).aClass206_8033).aByteArray1940);
			((Class387_Sub1) this).aClass206_8033 = null;
		}
		((Class387_Sub1) this).aBoolean8066 = true;
		method4510();
	}

	public void method4491() {
		if (((Class387_Sub1) this).anInt8038 > 0 && ((Class387_Sub1) this).anInt8035 > 0) {
			method4512();
			method4504();
			method4510();
		}
	}

	public void dh(short i, short i_280_) {
		for (int i_281_ = 0; i_281_ < ((Class387_Sub1) this).anInt8034; i_281_++) {
			if (((Class387_Sub1) this).modelColors[i_281_] == i)
				((Class387_Sub1) this).modelColors[i_281_] = i_280_;
		}
		if (((Class387_Sub1) this).aClass185Array8070 != null) {
			for (int i_282_ = 0; i_282_ < ((Class387_Sub1) this).anInt8069; i_282_++) {
				Class185 class185 = ((Class387_Sub1) this).aClass185Array8070[i_282_];
				Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_282_];
				((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | ((Console.colorArray[(((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		method4507();
	}

	public int cs() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8060;
	}

	public int AA() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8060;
	}

	public int ha() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8078;
	}

	public void method4490(Class387 class387, int i, int i_283_, int i_284_, boolean bool) {
		Class387_Sub1 class387_sub1_285_ = (Class387_Sub1) class387;
		if (((Class387_Sub1) this).anInt8034 != 0 && ((Class387_Sub1) class387_sub1_285_).anInt8034 != 0) {
			int i_286_ = ((Class387_Sub1) class387_sub1_285_).anInt8044;
			int[] is = ((Class387_Sub1) class387_sub1_285_).anIntArray8065;
			int[] is_287_ = ((Class387_Sub1) class387_sub1_285_).anIntArray8020;
			int[] is_288_ = ((Class387_Sub1) class387_sub1_285_).anIntArray8051;
			short[] is_289_ = ((Class387_Sub1) class387_sub1_285_).aShortArray8032;
			short[] is_290_ = ((Class387_Sub1) class387_sub1_285_).aShortArray8028;
			short[] is_291_ = ((Class387_Sub1) class387_sub1_285_).aShortArray8024;
			byte[] is_292_ = ((Class387_Sub1) class387_sub1_285_).aByteArray8030;
			short[] is_293_;
			short[] is_294_;
			short[] is_295_;
			byte[] is_296_;
			if (((Class387_Sub1) this).aClass206_8033 != null) {
				is_293_ = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1938);
				is_294_ = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1937);
				is_295_ = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1939);
				is_296_ = (((Class206) ((Class387_Sub1) this).aClass206_8033).aByteArray1940);
			} else {
				is_293_ = null;
				is_294_ = null;
				is_295_ = null;
				is_296_ = null;
			}
			short[] is_297_;
			short[] is_298_;
			short[] is_299_;
			byte[] is_300_;
			if (((Class387_Sub1) class387_sub1_285_).aClass206_8033 != null) {
				is_297_ = ((Class206) (((Class387_Sub1) class387_sub1_285_).aClass206_8033)).aShortArray1938;
				is_298_ = ((Class206) (((Class387_Sub1) class387_sub1_285_).aClass206_8033)).aShortArray1937;
				is_299_ = ((Class206) (((Class387_Sub1) class387_sub1_285_).aClass206_8033)).aShortArray1939;
				is_300_ = ((Class206) (((Class387_Sub1) class387_sub1_285_).aClass206_8033)).aByteArray1940;
			} else {
				is_297_ = null;
				is_298_ = null;
				is_299_ = null;
				is_300_ = null;
			}
			int[] is_301_ = ((Class387_Sub1) class387_sub1_285_).anIntArray8082;
			short[] is_302_ = ((Class387_Sub1) class387_sub1_285_).aShortArray8052;
			if (!((Class387_Sub1) class387_sub1_285_).aBoolean8043)
				class387_sub1_285_.method4501();
			int i_303_ = ((Class387_Sub1) class387_sub1_285_).anInt8056;
			int i_304_ = ((Class387_Sub1) class387_sub1_285_).anInt8057;
			int i_305_ = ((Class387_Sub1) class387_sub1_285_).anInt8058;
			int i_306_ = ((Class387_Sub1) class387_sub1_285_).anInt8059;
			int i_307_ = ((Class387_Sub1) class387_sub1_285_).anInt8060;
			int i_308_ = ((Class387_Sub1) class387_sub1_285_).anInt8078;
			for (int i_309_ = 0; i_309_ < ((Class387_Sub1) this).anInt8044; i_309_++) {
				int i_310_ = ((Class387_Sub1) this).anIntArray8020[i_309_] - i_283_;
				if (i_310_ >= i_303_ && i_310_ <= i_304_) {
					int i_311_ = ((Class387_Sub1) this).anIntArray8065[i_309_] - i;
					if (i_311_ >= i_305_ && i_311_ <= i_306_) {
						int i_312_ = (((Class387_Sub1) this).anIntArray8051[i_309_] - i_284_);
						if (i_312_ >= i_307_ && i_312_ <= i_308_) {
							int i_313_ = -1;
							int i_314_ = (((Class387_Sub1) this).anIntArray8082[i_309_]);
							int i_315_ = (((Class387_Sub1) this).anIntArray8082[i_309_ + 1]);
							for (int i_316_ = i_314_; i_316_ < i_315_; i_316_++) {
								i_313_ = (((Class387_Sub1) this).aShortArray8052[i_316_]) - 1;
								if (i_313_ == -1 || (((Class387_Sub1) this).aByteArray8030[i_313_]) != 0)
									break;
							}
							if (i_313_ != -1) {
								for (int i_317_ = 0; i_317_ < i_286_; i_317_++) {
									if (i_311_ == is[i_317_] && i_312_ == is_288_[i_317_] && i_310_ == is_287_[i_317_]) {
										int i_318_ = -1;
										i_314_ = is_301_[i_317_];
										i_315_ = is_301_[i_317_ + 1];
										for (int i_319_ = i_314_; i_319_ < i_315_; i_319_++) {
											i_318_ = is_302_[i_319_] - 1;
											if (i_318_ == -1 || is_292_[i_318_] != 0)
												break;
										}
										if (i_318_ != -1) {
											if (is_293_ == null) {
												((Class387_Sub1) this).aClass206_8033 = new Class206();
												is_293_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aShortArray1938 = (Class263_Sub4.method2637((((Class387_Sub1) this).aShortArray8032), 1950115293));
												is_294_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aShortArray1937 = (Class263_Sub4.method2637((((Class387_Sub1) this).aShortArray8028), 1814615697));
												is_295_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aShortArray1939 = (Class263_Sub4.method2637((((Class387_Sub1) this).aShortArray8024), 1468741137));
												is_296_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aByteArray1940 = (IcmpService_Sub1.method6479((((Class387_Sub1) this).aByteArray8030), (byte) 2));
											}
											if (is_297_ == null) {
												Class206 class206 = (((Class387_Sub1) class387_sub1_285_).aClass206_8033 = new Class206());
												is_297_ = ((Class206) class206).aShortArray1938 = (Class263_Sub4.method2637(is_289_, 2132385099));
												is_298_ = ((Class206) class206).aShortArray1937 = (Class263_Sub4.method2637(is_290_, 2075427839));
												is_299_ = ((Class206) class206).aShortArray1939 = (Class263_Sub4.method2637(is_291_, 2147380625));
												is_300_ = ((Class206) class206).aByteArray1940 = (IcmpService_Sub1.method6479(is_292_, (byte) 2));
											}
											short i_320_ = (((Class387_Sub1) this).aShortArray8032[i_313_]);
											short i_321_ = (((Class387_Sub1) this).aShortArray8028[i_313_]);
											short i_322_ = (((Class387_Sub1) this).aShortArray8024[i_313_]);
											byte i_323_ = (((Class387_Sub1) this).aByteArray8030[i_313_]);
											i_314_ = is_301_[i_317_];
											i_315_ = is_301_[i_317_ + 1];
											for (int i_324_ = i_314_; i_324_ < i_315_; i_324_++) {
												int i_325_ = is_302_[i_324_] - 1;
												if (i_325_ == -1)
													break;
												if (is_300_[i_325_] != 0) {
													is_297_[i_325_] += i_320_;
													is_298_[i_325_] += i_321_;
													is_299_[i_325_] += i_322_;
													is_300_[i_325_] += i_323_;
												}
											}
											i_320_ = is_289_[i_318_];
											i_321_ = is_290_[i_318_];
											i_322_ = is_291_[i_318_];
											i_323_ = is_292_[i_318_];
											i_314_ = (((Class387_Sub1) this).anIntArray8082[i_309_]);
											i_315_ = (((Class387_Sub1) this).anIntArray8082[i_309_ + 1]);
											for (int i_326_ = i_314_; i_326_ < i_315_; i_326_++) {
												int i_327_ = ((((Class387_Sub1) this).aShortArray8052[i_326_]) - 1);
												if (i_327_ == -1)
													break;
												if (is_296_[i_327_] != 0) {
													is_293_[i_327_] += i_320_;
													is_294_[i_327_] += i_321_;
													is_295_[i_327_] += i_322_;
													is_296_[i_327_] += i_323_;
												}
											}
											class387_sub1_285_.method4499();
											method4499();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void p(int i) {
		((Class387_Sub1) this).aShort8015 = (short) i;
		method4507();
	}

	public void Q(int i) {
		((Class387_Sub1) this).aShort8083 = (short) i;
		method4498();
		method4499();
	}

	public int c() {
		return ((Class387_Sub1) this).aShort8015;
	}

	public void bs(int i) {
		int i_328_ = Class257.anIntArray2683[i];
		int i_329_ = Class257.anIntArray2684[i];
		for (int i_330_ = 0; i_330_ < ((Class387_Sub1) this).anInt8044; i_330_++) {
			int i_331_ = ((((Class387_Sub1) this).anIntArray8051[i_330_] * i_328_ + ((Class387_Sub1) this).anIntArray8065[i_330_] * i_329_) >> 14);
			((Class387_Sub1) this).anIntArray8051[i_330_] = ((((Class387_Sub1) this).anIntArray8051[i_330_] * i_329_ - ((Class387_Sub1) this).anIntArray8065[i_330_] * i_328_) >> 14);
			((Class387_Sub1) this).anIntArray8065[i_330_] = i_331_;
		}
		for (int i_332_ = 0; i_332_ < ((Class387_Sub1) this).anInt8038; i_332_++) {
			int i_333_ = ((((Class387_Sub1) this).aShortArray8024[i_332_] * i_328_ + ((Class387_Sub1) this).aShortArray8032[i_332_] * i_329_) >> 14);
			((Class387_Sub1) this).aShortArray8024[i_332_] = (short) (((((Class387_Sub1) this).aShortArray8024[i_332_] * i_329_) - (((Class387_Sub1) this).aShortArray8032[i_332_] * i_328_)) >> 14);
			((Class387_Sub1) this).aShortArray8032[i_332_] = (short) i_333_;
		}
		method4498();
		method4499();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	void method4472() {
		/* empty */
	}

	public boolean method4487() {
		if (((Class387_Sub1) this).modelTextures == null)
			return true;
		for (int i = 0; i < ((Class387_Sub1) this).modelTextures.length; i++) {
			if (((Class387_Sub1) this).modelTextures[i] != -1 && !(((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass188_8552.method2095(((Class387_Sub1) this).modelTextures[i], -1)))
				return false;
		}
		return true;
	}

	public void paintTexture(short modelTexture, short modifiedModelTexture) {
		Interface_ma interface_ma = ((Class387_Sub1) this).aClass_ra_Sub2_8012.anInterface_ma4227;
		for (int i_335_ = 0; i_335_ < ((Class387_Sub1) this).anInt8034; i_335_++) {
			if (((Class387_Sub1) this).modelTextures[i_335_] == modelTexture)
				((Class387_Sub1) this).modelTextures[i_335_] = modifiedModelTexture;
		}
		byte i_336_ = 0;
		byte i_337_ = 0;
		if (modelTexture != -1) {
			Class56 class56 = interface_ma.method221(modelTexture & 0xffff, -724901614);
			i_336_ = class56.aByte529;
			i_337_ = class56.aByte534;
		}
		byte i_338_ = 0;
		byte i_339_ = 0;
		if (modifiedModelTexture != -1) {
			Class56 class56 = interface_ma.method221(modifiedModelTexture & 0xffff, -1426124732);
			i_338_ = class56.aByte529;
			i_339_ = class56.aByte534;
			if (class56.aByte531 != 0 || class56.aByte530 != 0)
				((Class387_Sub1) this).aBoolean8042 = true;
		}
		if (i_336_ != i_338_ | i_337_ != i_339_) {
			if (((Class387_Sub1) this).aClass185Array8070 != null) {
				for (int i_340_ = 0; i_340_ < ((Class387_Sub1) this).anInt8069; i_340_++) {
					Class185 class185 = ((Class387_Sub1) this).aClass185Array8070[i_340_];
					Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_340_];
					((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | ((Console.colorArray[(((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff]) & 0xffffff));
				}
			}
			method4507();
		}
	}

	public int N() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8054;
	}

	public boolean method4462() {
		if (((Class387_Sub1) this).modelTextures == null)
			return true;
		for (int i = 0; i < ((Class387_Sub1) this).modelTextures.length; i++) {
			if (((Class387_Sub1) this).modelTextures[i] != -1 && !(((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass188_8552.method2095(((Class387_Sub1) this).modelTextures[i], -1)))
				return false;
		}
		return true;
	}

	public int ya() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8059;
	}

	void method4455() {
		/* empty */
	}

	void method4448() {
		/* empty */
	}

	boolean ea() {
		if (((Class387_Sub1) this).anIntArrayArray8022 == null)
			return false;
		for (int i = 0; i < ((Class387_Sub1) this).anInt8014; i++) {
			((Class387_Sub1) this).anIntArray8065[i] <<= 4;
			((Class387_Sub1) this).anIntArray8020[i] <<= 4;
			((Class387_Sub1) this).anIntArray8051[i] <<= 4;
		}
		((Class387_Sub1) this).anInt8080 = 0;
		((Class387_Sub1) this).anInt8061 = 0;
		((Class387_Sub1) this).anInt8055 = 0;
		return true;
	}

	public int ca() {
		return ((Class387_Sub1) this).aShort8015;
	}

	void w(int i, int i_341_, int i_342_, int i_343_) {
		if (i == 0) {
			int i_344_ = 0;
			((Class387_Sub1) this).anInt8080 = 0;
			((Class387_Sub1) this).anInt8061 = 0;
			((Class387_Sub1) this).anInt8055 = 0;
			for (int i_345_ = 0; i_345_ < ((Class387_Sub1) this).anInt8044; i_345_++) {
				((Class387_Sub1) this).anInt8080 += ((Class387_Sub1) this).anIntArray8065[i_345_];
				((Class387_Sub1) this).anInt8061 += ((Class387_Sub1) this).anIntArray8020[i_345_];
				((Class387_Sub1) this).anInt8055 += ((Class387_Sub1) this).anIntArray8051[i_345_];
				i_344_++;
			}
			if (i_344_ > 0) {
				((Class387_Sub1) this).anInt8080 = ((Class387_Sub1) this).anInt8080 / i_344_ + i_341_;
				((Class387_Sub1) this).anInt8061 = ((Class387_Sub1) this).anInt8061 / i_344_ + i_342_;
				((Class387_Sub1) this).anInt8055 = ((Class387_Sub1) this).anInt8055 / i_344_ + i_343_;
			} else {
				((Class387_Sub1) this).anInt8080 = i_341_;
				((Class387_Sub1) this).anInt8061 = i_342_;
				((Class387_Sub1) this).anInt8055 = i_343_;
			}
		} else if (i == 1) {
			for (int i_346_ = 0; i_346_ < ((Class387_Sub1) this).anInt8044; i_346_++) {
				((Class387_Sub1) this).anIntArray8065[i_346_] += i_341_;
				((Class387_Sub1) this).anIntArray8020[i_346_] += i_342_;
				((Class387_Sub1) this).anIntArray8051[i_346_] += i_343_;
			}
		} else if (i == 2) {
			for (int i_347_ = 0; i_347_ < ((Class387_Sub1) this).anInt8044; i_347_++) {
				((Class387_Sub1) this).anIntArray8065[i_347_] -= ((Class387_Sub1) this).anInt8080;
				((Class387_Sub1) this).anIntArray8020[i_347_] -= ((Class387_Sub1) this).anInt8061;
				((Class387_Sub1) this).anIntArray8051[i_347_] -= ((Class387_Sub1) this).anInt8055;
				if (i_343_ != 0) {
					int i_348_ = Class257.anIntArray2683[i_343_];
					int i_349_ = Class257.anIntArray2684[i_343_];
					int i_350_ = (((((Class387_Sub1) this).anIntArray8020[i_347_] * i_348_) + (((Class387_Sub1) this).anIntArray8065[i_347_] * i_349_) + 16383) >> 14);
					((Class387_Sub1) this).anIntArray8020[i_347_] = ((((Class387_Sub1) this).anIntArray8020[i_347_] * i_349_) - (((Class387_Sub1) this).anIntArray8065[i_347_] * i_348_) + 16383) >> 14;
					((Class387_Sub1) this).anIntArray8065[i_347_] = i_350_;
				}
				if (i_341_ != 0) {
					int i_351_ = Class257.anIntArray2683[i_341_];
					int i_352_ = Class257.anIntArray2684[i_341_];
					int i_353_ = (((((Class387_Sub1) this).anIntArray8020[i_347_] * i_352_) - (((Class387_Sub1) this).anIntArray8051[i_347_] * i_351_) + 16383) >> 14);
					((Class387_Sub1) this).anIntArray8051[i_347_] = ((((Class387_Sub1) this).anIntArray8020[i_347_] * i_351_) + (((Class387_Sub1) this).anIntArray8051[i_347_] * i_352_) + 16383) >> 14;
					((Class387_Sub1) this).anIntArray8020[i_347_] = i_353_;
				}
				if (i_342_ != 0) {
					int i_354_ = Class257.anIntArray2683[i_342_];
					int i_355_ = Class257.anIntArray2684[i_342_];
					int i_356_ = (((((Class387_Sub1) this).anIntArray8051[i_347_] * i_354_) + (((Class387_Sub1) this).anIntArray8065[i_347_] * i_355_) + 16383) >> 14);
					((Class387_Sub1) this).anIntArray8051[i_347_] = ((((Class387_Sub1) this).anIntArray8051[i_347_] * i_355_) - (((Class387_Sub1) this).anIntArray8065[i_347_] * i_354_) + 16383) >> 14;
					((Class387_Sub1) this).anIntArray8065[i_347_] = i_356_;
				}
				((Class387_Sub1) this).anIntArray8065[i_347_] += ((Class387_Sub1) this).anInt8080;
				((Class387_Sub1) this).anIntArray8020[i_347_] += ((Class387_Sub1) this).anInt8061;
				((Class387_Sub1) this).anIntArray8051[i_347_] += ((Class387_Sub1) this).anInt8055;
			}
		} else if (i == 3) {
			for (int i_357_ = 0; i_357_ < ((Class387_Sub1) this).anInt8044; i_357_++) {
				((Class387_Sub1) this).anIntArray8065[i_357_] -= ((Class387_Sub1) this).anInt8080;
				((Class387_Sub1) this).anIntArray8020[i_357_] -= ((Class387_Sub1) this).anInt8061;
				((Class387_Sub1) this).anIntArray8051[i_357_] -= ((Class387_Sub1) this).anInt8055;
				((Class387_Sub1) this).anIntArray8065[i_357_] = (((Class387_Sub1) this).anIntArray8065[i_357_] * i_341_ / 128);
				((Class387_Sub1) this).anIntArray8020[i_357_] = (((Class387_Sub1) this).anIntArray8020[i_357_] * i_342_ / 128);
				((Class387_Sub1) this).anIntArray8051[i_357_] = (((Class387_Sub1) this).anIntArray8051[i_357_] * i_343_ / 128);
				((Class387_Sub1) this).anIntArray8065[i_357_] += ((Class387_Sub1) this).anInt8080;
				((Class387_Sub1) this).anIntArray8020[i_357_] += ((Class387_Sub1) this).anInt8061;
				((Class387_Sub1) this).anIntArray8051[i_357_] += ((Class387_Sub1) this).anInt8055;
			}
		} else if (i == 5) {
			for (int i_358_ = 0; i_358_ < ((Class387_Sub1) this).anInt8034; i_358_++) {
				int i_359_ = ((((Class387_Sub1) this).aByteArray8037[i_358_] & 0xff) + i_341_ * 8);
				if (i_359_ < 0)
					i_359_ = 0;
				else if (i_359_ > 255)
					i_359_ = 255;
				((Class387_Sub1) this).aByteArray8037[i_358_] = (byte) i_359_;
			}
			if (((Class387_Sub1) this).aClass185Array8070 != null) {
				for (int i_360_ = 0; i_360_ < ((Class387_Sub1) this).anInt8069; i_360_++) {
					Class185 class185 = ((Class387_Sub1) this).aClass185Array8070[i_360_];
					Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_360_];
					((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & 0xffffff | 255 - ((((Class387_Sub1) this).aByteArray8037[((Class185) class185).modelColorIndex]) & 0xff) << 24);
				}
			}
			method4507();
		} else if (i == 7) {
			for (int i_361_ = 0; i_361_ < ((Class387_Sub1) this).anInt8034; i_361_++) {
				int i_362_ = ((Class387_Sub1) this).modelColors[i_361_] & 0xffff;
				int i_363_ = i_362_ >> 10 & 0x3f;
				int i_364_ = i_362_ >> 7 & 0x7;
				int i_365_ = i_362_ & 0x7f;
				i_363_ = i_363_ + i_341_ & 0x3f;
				i_364_ += i_342_ / 4;
				if (i_364_ < 0)
					i_364_ = 0;
				else if (i_364_ > 7)
					i_364_ = 7;
				i_365_ += i_343_;
				if (i_365_ < 0)
					i_365_ = 0;
				else if (i_365_ > 127)
					i_365_ = 127;
				((Class387_Sub1) this).modelColors[i_361_] = (short) (i_363_ << 10 | i_364_ << 7 | i_365_);
			}
			if (((Class387_Sub1) this).aClass185Array8070 != null) {
				for (int i_366_ = 0; i_366_ < ((Class387_Sub1) this).anInt8069; i_366_++) {
					Class185 class185 = ((Class387_Sub1) this).aClass185Array8070[i_366_];
					Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_366_];
					((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | ((Console.colorArray[(((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff]) & 0xffffff));
				}
			}
			method4507();
		} else if (i == 8) {
			for (int i_367_ = 0; i_367_ < ((Class387_Sub1) this).anInt8069; i_367_++) {
				Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_367_];
				((Class177) class177).anInt1751 += i_341_;
				((Class177) class177).anInt1748 += i_342_;
			}
		} else if (i == 10) {
			for (int i_368_ = 0; i_368_ < ((Class387_Sub1) this).anInt8069; i_368_++) {
				Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_368_];
				((Class177) class177).anInt1752 = ((Class177) class177).anInt1752 * i_341_ >> 7;
				((Class177) class177).anInt1749 = ((Class177) class177).anInt1749 * i_342_ >> 7;
			}
		} else if (i == 9) {
			for (int i_369_ = 0; i_369_ < ((Class387_Sub1) this).anInt8069; i_369_++) {
				Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_369_];
				((Class177) class177).anInt1753 = ((Class177) class177).anInt1753 + i_341_ & 0x3fff;
			}
		}
	}

	void method4470(int i, int[] is, int i_370_, int i_371_, int i_372_, int i_373_, boolean bool) {
		int i_374_ = is.length;
		if (i == 0) {
			i_370_ <<= 4;
			i_371_ <<= 4;
			i_372_ <<= 4;
			int i_375_ = 0;
			((Class387_Sub1) this).anInt8080 = 0;
			((Class387_Sub1) this).anInt8061 = 0;
			((Class387_Sub1) this).anInt8055 = 0;
			for (int i_376_ = 0; i_376_ < i_374_; i_376_++) {
				int i_377_ = is[i_376_];
				if (i_377_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_378_ = ((Class387_Sub1) this).anIntArrayArray8022[i_377_];
					for (int i_379_ = 0; i_379_ < is_378_.length; i_379_++) {
						int i_380_ = is_378_[i_379_];
						((Class387_Sub1) this).anInt8080 += ((Class387_Sub1) this).anIntArray8065[i_380_];
						((Class387_Sub1) this).anInt8061 += ((Class387_Sub1) this).anIntArray8020[i_380_];
						((Class387_Sub1) this).anInt8055 += ((Class387_Sub1) this).anIntArray8051[i_380_];
						i_375_++;
					}
				}
			}
			if (i_375_ > 0) {
				((Class387_Sub1) this).anInt8080 = ((Class387_Sub1) this).anInt8080 / i_375_ + i_370_;
				((Class387_Sub1) this).anInt8061 = ((Class387_Sub1) this).anInt8061 / i_375_ + i_371_;
				((Class387_Sub1) this).anInt8055 = ((Class387_Sub1) this).anInt8055 / i_375_ + i_372_;
			} else {
				((Class387_Sub1) this).anInt8080 = i_370_;
				((Class387_Sub1) this).anInt8061 = i_371_;
				((Class387_Sub1) this).anInt8055 = i_372_;
			}
		} else if (i == 1) {
			i_370_ <<= 4;
			i_371_ <<= 4;
			i_372_ <<= 4;
			for (int i_381_ = 0; i_381_ < i_374_; i_381_++) {
				int i_382_ = is[i_381_];
				if (i_382_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_383_ = ((Class387_Sub1) this).anIntArrayArray8022[i_382_];
					for (int i_384_ = 0; i_384_ < is_383_.length; i_384_++) {
						int i_385_ = is_383_[i_384_];
						((Class387_Sub1) this).anIntArray8065[i_385_] += i_370_;
						((Class387_Sub1) this).anIntArray8020[i_385_] += i_371_;
						((Class387_Sub1) this).anIntArray8051[i_385_] += i_372_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_386_ = 0; i_386_ < i_374_; i_386_++) {
				int i_387_ = is[i_386_];
				if (i_387_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_388_ = ((Class387_Sub1) this).anIntArrayArray8022[i_387_];
					if ((i_373_ & 0x1) == 0) {
						for (int i_389_ = 0; i_389_ < is_388_.length; i_389_++) {
							int i_390_ = is_388_[i_389_];
							((Class387_Sub1) this).anIntArray8065[i_390_] -= ((Class387_Sub1) this).anInt8080;
							((Class387_Sub1) this).anIntArray8020[i_390_] -= ((Class387_Sub1) this).anInt8061;
							((Class387_Sub1) this).anIntArray8051[i_390_] -= ((Class387_Sub1) this).anInt8055;
							if (i_372_ != 0) {
								int i_391_ = Class257.anIntArray2683[i_372_];
								int i_392_ = Class257.anIntArray2684[i_372_];
								int i_393_ = (((((Class387_Sub1) this).anIntArray8020[i_390_]) * i_391_ + (((Class387_Sub1) this).anIntArray8065[i_390_]) * i_392_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8020[i_390_] = ((((Class387_Sub1) this).anIntArray8020[i_390_]) * i_392_ - (((Class387_Sub1) this).anIntArray8065[i_390_]) * i_391_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8065[i_390_] = i_393_;
							}
							if (i_370_ != 0) {
								int i_394_ = Class257.anIntArray2683[i_370_];
								int i_395_ = Class257.anIntArray2684[i_370_];
								int i_396_ = (((((Class387_Sub1) this).anIntArray8020[i_390_]) * i_395_ - (((Class387_Sub1) this).anIntArray8051[i_390_]) * i_394_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8051[i_390_] = ((((Class387_Sub1) this).anIntArray8020[i_390_]) * i_394_ + (((Class387_Sub1) this).anIntArray8051[i_390_]) * i_395_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8020[i_390_] = i_396_;
							}
							if (i_371_ != 0) {
								int i_397_ = Class257.anIntArray2683[i_371_];
								int i_398_ = Class257.anIntArray2684[i_371_];
								int i_399_ = (((((Class387_Sub1) this).anIntArray8051[i_390_]) * i_397_ + (((Class387_Sub1) this).anIntArray8065[i_390_]) * i_398_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8051[i_390_] = ((((Class387_Sub1) this).anIntArray8051[i_390_]) * i_398_ - (((Class387_Sub1) this).anIntArray8065[i_390_]) * i_397_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8065[i_390_] = i_399_;
							}
							((Class387_Sub1) this).anIntArray8065[i_390_] += ((Class387_Sub1) this).anInt8080;
							((Class387_Sub1) this).anIntArray8020[i_390_] += ((Class387_Sub1) this).anInt8061;
							((Class387_Sub1) this).anIntArray8051[i_390_] += ((Class387_Sub1) this).anInt8055;
						}
					} else {
						for (int i_400_ = 0; i_400_ < is_388_.length; i_400_++) {
							int i_401_ = is_388_[i_400_];
							((Class387_Sub1) this).anIntArray8065[i_401_] -= ((Class387_Sub1) this).anInt8080;
							((Class387_Sub1) this).anIntArray8020[i_401_] -= ((Class387_Sub1) this).anInt8061;
							((Class387_Sub1) this).anIntArray8051[i_401_] -= ((Class387_Sub1) this).anInt8055;
							if (i_370_ != 0) {
								int i_402_ = Class257.anIntArray2683[i_370_];
								int i_403_ = Class257.anIntArray2684[i_370_];
								int i_404_ = (((((Class387_Sub1) this).anIntArray8020[i_401_]) * i_403_ - (((Class387_Sub1) this).anIntArray8051[i_401_]) * i_402_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8051[i_401_] = ((((Class387_Sub1) this).anIntArray8020[i_401_]) * i_402_ + (((Class387_Sub1) this).anIntArray8051[i_401_]) * i_403_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8020[i_401_] = i_404_;
							}
							if (i_372_ != 0) {
								int i_405_ = Class257.anIntArray2683[i_372_];
								int i_406_ = Class257.anIntArray2684[i_372_];
								int i_407_ = (((((Class387_Sub1) this).anIntArray8020[i_401_]) * i_405_ + (((Class387_Sub1) this).anIntArray8065[i_401_]) * i_406_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8020[i_401_] = ((((Class387_Sub1) this).anIntArray8020[i_401_]) * i_406_ - (((Class387_Sub1) this).anIntArray8065[i_401_]) * i_405_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8065[i_401_] = i_407_;
							}
							if (i_371_ != 0) {
								int i_408_ = Class257.anIntArray2683[i_371_];
								int i_409_ = Class257.anIntArray2684[i_371_];
								int i_410_ = (((((Class387_Sub1) this).anIntArray8051[i_401_]) * i_408_ + (((Class387_Sub1) this).anIntArray8065[i_401_]) * i_409_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8051[i_401_] = ((((Class387_Sub1) this).anIntArray8051[i_401_]) * i_409_ - (((Class387_Sub1) this).anIntArray8065[i_401_]) * i_408_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8065[i_401_] = i_410_;
							}
							((Class387_Sub1) this).anIntArray8065[i_401_] += ((Class387_Sub1) this).anInt8080;
							((Class387_Sub1) this).anIntArray8020[i_401_] += ((Class387_Sub1) this).anInt8061;
							((Class387_Sub1) this).anIntArray8051[i_401_] += ((Class387_Sub1) this).anInt8055;
						}
					}
				}
			}
			if (bool) {
				for (int i_411_ = 0; i_411_ < i_374_; i_411_++) {
					int i_412_ = is[i_411_];
					if (i_412_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_413_ = (((Class387_Sub1) this).anIntArrayArray8022[i_412_]);
						for (int i_414_ = 0; i_414_ < is_413_.length; i_414_++) {
							int i_415_ = is_413_[i_414_];
							int i_416_ = (((Class387_Sub1) this).anIntArray8082[i_415_]);
							int i_417_ = (((Class387_Sub1) this).anIntArray8082[i_415_ + 1]);
							for (int i_418_ = i_416_; i_418_ < i_417_; i_418_++) {
								int i_419_ = ((((Class387_Sub1) this).aShortArray8052[i_418_]) - 1);
								if (i_419_ == -1)
									break;
								if (i_372_ != 0) {
									int i_420_ = Class257.anIntArray2683[i_372_];
									int i_421_ = Class257.anIntArray2684[i_372_];
									int i_422_ = (((((Class387_Sub1) this).aShortArray8028[i_419_]) * i_420_ + ((((Class387_Sub1) this).aShortArray8032[i_419_]) * i_421_) + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8028[i_419_] = (short) ((((((Class387_Sub1) this).aShortArray8028[i_419_]) * i_421_) - (((Class387_Sub1) this).aShortArray8032[i_419_]) * i_420_ + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8032[i_419_] = (short) i_422_;
								}
								if (i_370_ != 0) {
									int i_423_ = Class257.anIntArray2683[i_370_];
									int i_424_ = Class257.anIntArray2684[i_370_];
									int i_425_ = (((((Class387_Sub1) this).aShortArray8028[i_419_]) * i_424_ - ((((Class387_Sub1) this).aShortArray8024[i_419_]) * i_423_) + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8024[i_419_] = (short) ((((((Class387_Sub1) this).aShortArray8028[i_419_]) * i_423_) + (((Class387_Sub1) this).aShortArray8024[i_419_]) * i_424_ + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8028[i_419_] = (short) i_425_;
								}
								if (i_371_ != 0) {
									int i_426_ = Class257.anIntArray2683[i_371_];
									int i_427_ = Class257.anIntArray2684[i_371_];
									int i_428_ = (((((Class387_Sub1) this).aShortArray8024[i_419_]) * i_426_ + ((((Class387_Sub1) this).aShortArray8032[i_419_]) * i_427_) + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8024[i_419_] = (short) ((((((Class387_Sub1) this).aShortArray8024[i_419_]) * i_427_) - (((Class387_Sub1) this).aShortArray8032[i_419_]) * i_426_ + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8032[i_419_] = (short) i_428_;
								}
							}
						}
					}
				}
				method4499();
			}
		} else if (i == 3) {
			for (int i_429_ = 0; i_429_ < i_374_; i_429_++) {
				int i_430_ = is[i_429_];
				if (i_430_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_431_ = ((Class387_Sub1) this).anIntArrayArray8022[i_430_];
					for (int i_432_ = 0; i_432_ < is_431_.length; i_432_++) {
						int i_433_ = is_431_[i_432_];
						((Class387_Sub1) this).anIntArray8065[i_433_] -= ((Class387_Sub1) this).anInt8080;
						((Class387_Sub1) this).anIntArray8020[i_433_] -= ((Class387_Sub1) this).anInt8061;
						((Class387_Sub1) this).anIntArray8051[i_433_] -= ((Class387_Sub1) this).anInt8055;
						((Class387_Sub1) this).anIntArray8065[i_433_] = (((Class387_Sub1) this).anIntArray8065[i_433_] * i_370_) >> 7;
						((Class387_Sub1) this).anIntArray8020[i_433_] = (((Class387_Sub1) this).anIntArray8020[i_433_] * i_371_) >> 7;
						((Class387_Sub1) this).anIntArray8051[i_433_] = (((Class387_Sub1) this).anIntArray8051[i_433_] * i_372_) >> 7;
						((Class387_Sub1) this).anIntArray8065[i_433_] += ((Class387_Sub1) this).anInt8080;
						((Class387_Sub1) this).anIntArray8020[i_433_] += ((Class387_Sub1) this).anInt8061;
						((Class387_Sub1) this).anIntArray8051[i_433_] += ((Class387_Sub1) this).anInt8055;
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub1) this).anIntArrayArray8017 != null) {
				boolean bool_434_ = false;
				for (int i_435_ = 0; i_435_ < i_374_; i_435_++) {
					int i_436_ = is[i_435_];
					if (i_436_ < ((Class387_Sub1) this).anIntArrayArray8017.length) {
						int[] is_437_ = (((Class387_Sub1) this).anIntArrayArray8017[i_436_]);
						for (int i_438_ = 0; i_438_ < is_437_.length; i_438_++) {
							int i_439_ = is_437_[i_438_];
							int i_440_ = (((((Class387_Sub1) this).aByteArray8037[i_439_]) & 0xff) + i_370_ * 8);
							if (i_440_ < 0)
								i_440_ = 0;
							else if (i_440_ > 255)
								i_440_ = 255;
							((Class387_Sub1) this).aByteArray8037[i_439_] = (byte) i_440_;
						}
						bool_434_ = bool_434_ | is_437_.length > 0;
					}
				}
				if (bool_434_) {
					if (((Class387_Sub1) this).aClass185Array8070 != null) {
						for (int i_441_ = 0; i_441_ < ((Class387_Sub1) this).anInt8069; i_441_++) {
							Class185 class185 = (((Class387_Sub1) this).aClass185Array8070[i_441_]);
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[i_441_]);
							((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & 0xffffff | 255 - ((((Class387_Sub1) this).aByteArray8037[((Class185) class185).modelColorIndex]) & 0xff) << 24);
						}
					}
					method4507();
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub1) this).anIntArrayArray8017 != null) {
				boolean bool_442_ = false;
				for (int i_443_ = 0; i_443_ < i_374_; i_443_++) {
					int i_444_ = is[i_443_];
					if (i_444_ < ((Class387_Sub1) this).anIntArrayArray8017.length) {
						int[] is_445_ = (((Class387_Sub1) this).anIntArrayArray8017[i_444_]);
						for (int i_446_ = 0; i_446_ < is_445_.length; i_446_++) {
							int i_447_ = is_445_[i_446_];
							int i_448_ = ((((Class387_Sub1) this).modelColors[i_447_]) & 0xffff);
							int i_449_ = i_448_ >> 10 & 0x3f;
							int i_450_ = i_448_ >> 7 & 0x7;
							int i_451_ = i_448_ & 0x7f;
							i_449_ = i_449_ + i_370_ & 0x3f;
							i_450_ += i_371_ / 4;
							if (i_450_ < 0)
								i_450_ = 0;
							else if (i_450_ > 7)
								i_450_ = 7;
							i_451_ += i_372_;
							if (i_451_ < 0)
								i_451_ = 0;
							else if (i_451_ > 127)
								i_451_ = 127;
							((Class387_Sub1) this).modelColors[i_447_] = (short) (i_449_ << 10 | i_450_ << 7 | i_451_);
						}
						bool_442_ = bool_442_ | is_445_.length > 0;
					}
				}
				if (bool_442_) {
					if (((Class387_Sub1) this).aClass185Array8070 != null) {
						for (int i_452_ = 0; i_452_ < ((Class387_Sub1) this).anInt8069; i_452_++) {
							Class185 class185 = (((Class387_Sub1) this).aClass185Array8070[i_452_]);
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[i_452_]);
							((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | (Console.colorArray[((((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff)]) & 0xffffff);
						}
					}
					method4507();
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_453_ = 0; i_453_ < i_374_; i_453_++) {
					int i_454_ = is[i_453_];
					if (i_454_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_455_ = (((Class387_Sub1) this).anIntArrayArray8072[i_454_]);
						for (int i_456_ = 0; i_456_ < is_455_.length; i_456_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_455_[i_456_]]);
							((Class177) class177).anInt1751 += i_370_;
							((Class177) class177).anInt1748 += i_371_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_457_ = 0; i_457_ < i_374_; i_457_++) {
					int i_458_ = is[i_457_];
					if (i_458_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_459_ = (((Class387_Sub1) this).anIntArrayArray8072[i_458_]);
						for (int i_460_ = 0; i_460_ < is_459_.length; i_460_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_459_[i_460_]]);
							((Class177) class177).anInt1752 = (((Class177) class177).anInt1752 * i_370_ >> 7);
							((Class177) class177).anInt1749 = (((Class177) class177).anInt1749 * i_371_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_461_ = 0; i_461_ < i_374_; i_461_++) {
					int i_462_ = is[i_461_];
					if (i_462_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_463_ = (((Class387_Sub1) this).anIntArrayArray8072[i_462_]);
						for (int i_464_ = 0; i_464_ < is_463_.length; i_464_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_463_[i_464_]]);
							((Class177) class177).anInt1753 = (((Class177) class177).anInt1753 + i_370_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public int cm() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8056;
	}

	public void method4488(Class247 class247, int i, boolean bool) {
		if (((Class387_Sub1) this).aShortArray8023 != null) {
			Class247 class247_465_ = class247;
			if (bool) {
				class247_465_ = ((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aClass247_8513;
				class247_465_.method2458(class247);
			}
			float[] fs = new float[3];
			for (int i_466_ = 0; i_466_ < ((Class387_Sub1) this).anInt8044; i_466_++) {
				if ((i & ((Class387_Sub1) this).aShortArray8023[i_466_]) != 0) {
					class247_465_.method2465((float) ((Class387_Sub1) this).anIntArray8065[i_466_], (float) ((Class387_Sub1) this).anIntArray8020[i_466_], (float) ((Class387_Sub1) this).anIntArray8051[i_466_], fs);
					((Class387_Sub1) this).anIntArray8065[i_466_] = (int) fs[0];
					((Class387_Sub1) this).anIntArray8020[i_466_] = (int) fs[1];
					((Class387_Sub1) this).anIntArray8051[i_466_] = (int) fs[2];
				}
			}
		}
	}

	public Class64[] method4445() {
		return ((Class387_Sub1) this).aClass64Array8068;
	}

	public int ah() {
		return ((Class387_Sub1) this).anInt8013;
	}

	public void method4463(Class247 class247) {
		Class249 class249 = ((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8576;
		class249.method2508(class247);
		if (((Class387_Sub1) this).aClass93Array8026 != null) {
			for (int i = 0; i < ((Class387_Sub1) this).aClass93Array8026.length; i++) {
				Class93 class93 = ((Class387_Sub1) this).aClass93Array8026[i];
				Class93 class93_467_ = class93;
				if (class93.aClass93_833 != null)
					class93_467_ = class93.aClass93_833;
				class93_467_.anInt838 = ((int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub1) this).anIntArray8065[class93.anInt841 * -1670679901])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub1) this).anIntArray8020[(class93.anInt841 * -1670679901)])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub1) this).anIntArray8051[(class93.anInt841 * -1670679901)])))) * 432673201);
				class93_467_.anInt832 = ((int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub1) this).anIntArray8065[class93.anInt841 * -1670679901])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub1) this).anIntArray8020[(class93.anInt841 * -1670679901)])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub1) this).anIntArray8051[(class93.anInt841 * -1670679901)])))) * -1138862783);
				class93_467_.anInt840 = ((int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub1) this).anIntArray8065[class93.anInt841 * -1670679901])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub1) this).anIntArray8020[(class93.anInt841 * -1670679901)])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub1) this).anIntArray8051[(class93.anInt841 * -1670679901)])))) * -555868357);
				class93_467_.anInt837 = ((int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub1) this).anIntArray8065[class93.anInt835 * -614748507])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub1) this).anIntArray8020[(class93.anInt835 * -614748507)])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub1) this).anIntArray8051[(class93.anInt835 * -614748507)])))) * -707023853);
				class93_467_.anInt842 = ((int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub1) this).anIntArray8065[class93.anInt835 * -614748507])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub1) this).anIntArray8020[(class93.anInt835 * -614748507)])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub1) this).anIntArray8051[(class93.anInt835 * -614748507)])))) * -648890367);
				class93_467_.anInt845 = ((int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub1) this).anIntArray8065[class93.anInt835 * -614748507])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub1) this).anIntArray8020[(class93.anInt835 * -614748507)])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub1) this).anIntArray8051[(class93.anInt835 * -614748507)])))) * -1672139309);
				class93_467_.anInt839 = (int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub1) this).anIntArray8065[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub1) this).anIntArray8020[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub1) this).anIntArray8051[(class93.anInt836 * -878748965)])))) * 488615051;
				class93_467_.anInt844 = (int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub1) this).anIntArray8065[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub1) this).anIntArray8020[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub1) this).anIntArray8051[(class93.anInt836 * -878748965)])))) * 197668655;
				class93_467_.anInt846 = (int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub1) this).anIntArray8065[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub1) this).anIntArray8020[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub1) this).anIntArray8051[(class93.anInt836 * -878748965)])))) * 471540135;
			}
		}
		if (((Class387_Sub1) this).aClass64Array8068 != null) {
			for (int i = 0; i < ((Class387_Sub1) this).aClass64Array8068.length; i++) {
				Class64 class64 = ((Class387_Sub1) this).aClass64Array8068[i];
				Class64 class64_468_ = class64;
				if (class64.aClass64_562 != null)
					class64_468_ = class64.aClass64_562;
				if (class64.aClass249_568 != null)
					class64.aClass249_568.method2510(class249);
				else
					class64.aClass249_568 = new Class249(class249);
				class64_468_.anInt565 = ((int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub1) this).anIntArray8065[class64.anInt566 * 1669844747])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub1) this).anIntArray8020[(class64.anInt566 * 1669844747)])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub1) this).anIntArray8051[(class64.anInt566 * 1669844747)])))) * -686746519);
				class64_468_.anInt563 = ((int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub1) this).anIntArray8065[class64.anInt566 * 1669844747])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub1) this).anIntArray8020[(class64.anInt566 * 1669844747)])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub1) this).anIntArray8051[(class64.anInt566 * 1669844747)])))) * -635472619);
				class64_468_.anInt567 = ((int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub1) this).anIntArray8065[class64.anInt566 * 1669844747])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub1) this).anIntArray8020[(class64.anInt566 * 1669844747)])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub1) this).anIntArray8051[(class64.anInt566 * 1669844747)])))) * 1225142127);
			}
		}
	}

	public boolean method4458(int i, int i_469_, Class247 class247, boolean bool, int i_470_) {
		return method4502(i, i_469_, 0, 0, class247, bool, i_470_);
	}

	public void cl(int i) {
		((Class387_Sub1) this).aShort8015 = (short) i;
		method4507();
	}

	public void method4460(byte i, byte[] is) {
		if (is == null) {
			for (int i_471_ = 0; i_471_ < ((Class387_Sub1) this).anInt8034; i_471_++)
				((Class387_Sub1) this).aByteArray8037[i_471_] = i;
		} else {
			for (int i_472_ = 0; i_472_ < ((Class387_Sub1) this).anInt8034; i_472_++) {
				int i_473_ = 255 - ((255 - (is[i_472_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class387_Sub1) this).aByteArray8037[i_472_] = (byte) i_473_;
			}
		}
		method4507();
	}

	public Class_na ga(Class_na class_na) {
		if (((Class387_Sub1) this).anInt8038 == 0)
			return null;
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		int i;
		int i_474_;
		if ((((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8541) > 0) {
			i = ((((Class387_Sub1) this).anInt8058 - ((((Class387_Sub1) this).anInt8057 * ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8541) >> 8)) >> ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8536);
			i_474_ = ((((Class387_Sub1) this).anInt8059 - ((((Class387_Sub1) this).anInt8056 * ((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).anInt8541) >> 8)) >> ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8536);
		} else {
			i = ((((Class387_Sub1) this).anInt8058 - ((((Class387_Sub1) this).anInt8056 * ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8541) >> 8)) >> ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8536);
			i_474_ = ((((Class387_Sub1) this).anInt8059 - ((((Class387_Sub1) this).anInt8057 * ((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).anInt8541) >> 8)) >> ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8536);
		}
		int i_475_;
		int i_476_;
		if ((((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8599) > 0) {
			i_475_ = ((((Class387_Sub1) this).anInt8060 - ((((Class387_Sub1) this).anInt8057 * ((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).anInt8599) >> 8)) >> ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8536);
			i_476_ = ((((Class387_Sub1) this).anInt8078 - ((((Class387_Sub1) this).anInt8056 * ((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).anInt8599) >> 8)) >> ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8536);
		} else {
			i_475_ = ((((Class387_Sub1) this).anInt8060 - ((((Class387_Sub1) this).anInt8056 * ((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).anInt8599) >> 8)) >> ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8536);
			i_476_ = ((((Class387_Sub1) this).anInt8078 - ((((Class387_Sub1) this).anInt8057 * ((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).anInt8599) >> 8)) >> ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8536);
		}
		int i_477_ = i_474_ - i + 1;
		int i_478_ = i_476_ - i_475_ + 1;
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		Class_na_Sub1 class_na_sub1_479_;
		if (class_na_sub1 != null && class_na_sub1.method3528(i_477_, i_478_)) {
			class_na_sub1_479_ = class_na_sub1;
			class_na_sub1_479_.method3525();
		} else
			class_na_sub1_479_ = new Class_na_Sub1(((Class387_Sub1) this).aClass_ra_Sub2_8012, i_477_, i_478_);
		class_na_sub1_479_.method3524(i, i_475_, i_474_, i_476_);
		method4508(class_na_sub1_479_);
		return class_na_sub1_479_;
	}

	public void method4475(Class247 class247, Class80 class80, int i) {
		if (aClass172_8084 != null)
			aClass172_8084.method2048();
		if (class80 != null)
			class80.aBoolean671 = false;
		if (((Class387_Sub1) this).anInt8038 != 0) {
			Class249 class249 = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass249_8488);
			Class249 class249_480_ = ((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8576;
			Class249 class249_481_ = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass249_8479);
			class249_480_.method2508(class247);
			class249_481_.method2510(class249_480_);
			class249_481_.method2483(((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aClass249_8492);
			if (!((Class387_Sub1) this).aBoolean8043)
				method4501();
			float[] fs = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aFloatArray8481);
			class249_480_.method2511(0.0F, (float) ((Class387_Sub1) this).anInt8056, 0.0F, fs);
			float f = fs[0];
			float f_482_ = fs[1];
			float f_483_ = fs[2];
			class249_480_.method2511(0.0F, (float) ((Class387_Sub1) this).anInt8057, 0.0F, fs);
			float f_484_ = fs[0];
			float f_485_ = fs[1];
			float f_486_ = fs[2];
			for (int i_487_ = 0; i_487_ < 6; i_487_++) {
				float[] fs_488_ = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aFloatArrayArray8494[i_487_]);
				float f_489_ = (fs_488_[0] * f + fs_488_[1] * f_482_ + fs_488_[2] * f_483_ + fs_488_[3] + (float) ((Class387_Sub1) this).anInt8054);
				float f_490_ = (fs_488_[0] * f_484_ + fs_488_[1] * f_485_ + fs_488_[2] * f_486_ + fs_488_[3] + (float) ((Class387_Sub1) this).anInt8054);
				if (f_489_ < 0.0F && f_490_ < 0.0F)
					return;
			}
			if (class80 != null) {
				boolean bool = false;
				boolean bool_491_ = true;
				int i_492_ = ((((Class387_Sub1) this).anInt8058 + ((Class387_Sub1) this).anInt8059) >> 1);
				int i_493_ = ((((Class387_Sub1) this).anInt8060 + ((Class387_Sub1) this).anInt8078) >> 1);
				int i_494_ = i_492_;
				int i_495_ = ((Class387_Sub1) this).anInt8056;
				int i_496_ = i_493_;
				float f_497_ = (class249_481_.aFloatArray2631[0] * (float) i_494_ + class249_481_.aFloatArray2631[4] * (float) i_495_ + class249_481_.aFloatArray2631[8] * (float) i_496_ + class249_481_.aFloatArray2631[12]);
				float f_498_ = (class249_481_.aFloatArray2631[1] * (float) i_494_ + class249_481_.aFloatArray2631[5] * (float) i_495_ + class249_481_.aFloatArray2631[9] * (float) i_496_ + class249_481_.aFloatArray2631[13]);
				float f_499_ = (class249_481_.aFloatArray2631[2] * (float) i_494_ + class249_481_.aFloatArray2631[6] * (float) i_495_ + class249_481_.aFloatArray2631[10] * (float) i_496_ + class249_481_.aFloatArray2631[14]);
				float f_500_ = (class249_481_.aFloatArray2631[3] * (float) i_494_ + class249_481_.aFloatArray2631[7] * (float) i_495_ + class249_481_.aFloatArray2631[11] * (float) i_496_ + class249_481_.aFloatArray2631[15]);
				if (f_499_ >= -f_500_) {
					class80.anInt669 = (int) ((((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aFloat8495) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505) * f_497_ / f_500_);
					class80.anInt670 = (int) ((((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aFloat8497) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8498) * f_498_ / f_500_);
				} else
					bool = true;
				i_494_ = i_492_;
				i_495_ = ((Class387_Sub1) this).anInt8057;
				i_496_ = i_493_;
				float f_501_ = (class249_481_.aFloatArray2631[0] * (float) i_494_ + class249_481_.aFloatArray2631[4] * (float) i_495_ + class249_481_.aFloatArray2631[8] * (float) i_496_ + class249_481_.aFloatArray2631[12]);
				float f_502_ = (class249_481_.aFloatArray2631[1] * (float) i_494_ + class249_481_.aFloatArray2631[5] * (float) i_495_ + class249_481_.aFloatArray2631[9] * (float) i_496_ + class249_481_.aFloatArray2631[13]);
				float f_503_ = (class249_481_.aFloatArray2631[2] * (float) i_494_ + class249_481_.aFloatArray2631[6] * (float) i_495_ + class249_481_.aFloatArray2631[10] * (float) i_496_ + class249_481_.aFloatArray2631[14]);
				float f_504_ = (class249_481_.aFloatArray2631[3] * (float) i_494_ + class249_481_.aFloatArray2631[7] * (float) i_495_ + class249_481_.aFloatArray2631[11] * (float) i_496_ + class249_481_.aFloatArray2631[15]);
				if (f_503_ >= -f_504_) {
					class80.anInt668 = (int) ((((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aFloat8495) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505) * f_501_ / f_504_);
					class80.anInt672 = (int) ((((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aFloat8497) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8498) * f_502_ / f_504_);
				} else
					bool = true;
				if (bool) {
					if (f_499_ < -f_500_ && f_503_ < -f_504_)
						bool_491_ = false;
					else if (f_499_ < -f_500_) {
						float f_505_ = (f_499_ + f_500_) / (f_503_ + f_504_) - 1.0F;
						float f_506_ = f_497_ + f_505_ * (f_501_ - f_497_);
						float f_507_ = f_498_ + f_505_ * (f_502_ - f_498_);
						float f_508_ = f_500_ + f_505_ * (f_504_ - f_500_);
						class80.anInt669 = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8495) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505 * f_506_ / f_508_));
						class80.anInt670 = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8497) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8498 * f_507_ / f_508_));
					} else if (f_503_ < -f_504_) {
						float f_509_ = (f_503_ + f_504_) / (f_499_ + f_500_) - 1.0F;
						float f_510_ = f_501_ + f_509_ * (f_497_ - f_501_);
						float f_511_ = f_502_ + f_509_ * (f_498_ - f_502_);
						float f_512_ = f_504_ + f_509_ * (f_500_ - f_504_);
						class80.anInt668 = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8495) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505 * f_510_ / f_512_));
						class80.anInt672 = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8497) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8498 * f_511_ / f_512_));
					}
				}
				if (bool_491_) {
					if (f_499_ / f_500_ > f_503_ / f_504_) {
						float f_513_ = (f_497_ + (class249.aFloatArray2631[0] * (float) ((Class387_Sub1) this).anInt8054) + class249.aFloatArray2631[12]);
						float f_514_ = (f_500_ + (class249.aFloatArray2631[3] * (float) ((Class387_Sub1) this).anInt8054) + class249.aFloatArray2631[15]);
						class80.anInt673 = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8495) - (float) class80.anInt669 + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505 * f_513_ / f_514_));
					} else {
						float f_515_ = (f_501_ + (class249.aFloatArray2631[0] * (float) ((Class387_Sub1) this).anInt8054) + class249.aFloatArray2631[12]);
						float f_516_ = (f_504_ + (class249.aFloatArray2631[3] * (float) ((Class387_Sub1) this).anInt8054) + class249.aFloatArray2631[15]);
						class80.anInt673 = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8495) - (float) class80.anInt668 + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505 * f_515_ / f_516_));
					}
					class80.aBoolean671 = true;
				}
			}
			((Class387_Sub1) this).aClass_ra_Sub2_8012.method4990(i);
			method4509(class247);
			((Class387_Sub1) this).aClass_ra_Sub2_8012.method4990(0);
			class249_480_.method2508(class247);
			class249_480_.method2483(((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8472);
			method4503(class249_480_);
		}
	}

	void method4503(Class249 class249) {
		if (((Class387_Sub1) this).aClass185Array8070 != null) {
			((Class387_Sub1) this).aClass_ra_Sub2_8012.RA(!((Class387_Sub1) this).aBoolean8067);
			Class247 class247 = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass247_8513);
			Class126 class126 = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass126_8562);
			for (int i = 0; i < ((Class387_Sub1) this).anInt8069; i++) {
				Class185 class185 = ((Class387_Sub1) this).aClass185Array8070[i];
				Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i];
				if (!((Class185) class185).aBoolean1821 || !((Class387_Sub1) this).aClass_ra_Sub2_8012.cg()) {
					float f = ((float) ((((Class387_Sub1) this).anIntArray8065[((Class185) class185).anInt1816]) + (((Class387_Sub1) this).anIntArray8065[((Class185) class185).anInt1815]) + (((Class387_Sub1) this).anIntArray8065[((Class185) class185).anInt1814])) * 0.3333333F);
					float f_517_ = ((float) ((((Class387_Sub1) this).anIntArray8020[((Class185) class185).anInt1816]) + (((Class387_Sub1) this).anIntArray8020[((Class185) class185).anInt1815]) + (((Class387_Sub1) this).anIntArray8020[((Class185) class185).anInt1814])) * 0.3333333F);
					float f_518_ = ((float) ((((Class387_Sub1) this).anIntArray8051[((Class185) class185).anInt1816]) + (((Class387_Sub1) this).anIntArray8051[((Class185) class185).anInt1815]) + (((Class387_Sub1) this).anIntArray8051[((Class185) class185).anInt1814])) * 0.3333333F);
					float f_519_ = (class249.aFloatArray2631[0] * f + class249.aFloatArray2631[4] * f_517_ + class249.aFloatArray2631[8] * f_518_ + class249.aFloatArray2631[12]);
					float f_520_ = (class249.aFloatArray2631[1] * f + class249.aFloatArray2631[5] * f_517_ + class249.aFloatArray2631[9] * f_518_ + class249.aFloatArray2631[13]);
					float f_521_ = (class249.aFloatArray2631[2] * f + class249.aFloatArray2631[6] * f_517_ + class249.aFloatArray2631[10] * f_518_ + class249.aFloatArray2631[14]);
					float f_522_ = ((float) (1.0 / Math.sqrt((double) (f_519_ * f_519_ + f_520_ * f_520_ + f_521_ * f_521_))) * (float) ((Class185) class185).anInt1822);
					class247.method2475(((Class177) class177).anInt1753, (((Class177) class177).anInt1752 * ((Class185) class185).aShort1818) >> 7, (((Class177) class177).anInt1749 * ((Class185) class185).aShort1819) >> 7, (f_519_ + (float) ((Class177) class177).anInt1751 - f_519_ * f_522_), (f_520_ + (float) ((Class177) class177).anInt1748 - f_520_ * f_522_), f_521_ - f_521_ * f_522_);
					class247.method2467(((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aClass247_8596);
					((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass249_8479.method2508(class247);
					class126.method1532(((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aClass249_8479);
					class126.aClass249_1460.method2516();
					class126.anInt1462 = ((Class177) class177).anInt1750;
					class126.anInterface11_Impl3_1461 = ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass188_8552.method2093(((Class185) class185).aShort1820);
					class126.method1533();
				}
			}
			((Class387_Sub1) this).aClass_ra_Sub2_8012.RA(true);
		}
	}

	boolean method4504() {
		if (((Class165) ((Class387_Sub1) this).aClass165_8050).aBoolean1697)
			return true;
		if ((((Class165) ((Class387_Sub1) this).aClass165_8050).anInterface9_Impl2_1695) == null)
			((Class165) ((Class387_Sub1) this).aClass165_8050).anInterface9_Impl2_1695 = ((Class387_Sub1) this).aClass_ra_Sub2_8012.method4975(false);
		Interface9_Impl2 interface9_impl2 = (((Class165) ((Class387_Sub1) this).aClass165_8050).anInterface9_Impl2_1695);
		interface9_impl2.method148(((Class387_Sub1) this).anInt8035 * 6);
		Unsafe unsafe = ((Class387_Sub1) this).aClass_ra_Sub2_8012.anUnsafe8461;
		if (unsafe != null) {
			int i = ((Class387_Sub1) this).anInt8035 * 6;
			long l = interface9_impl2.method94(0, i);
			if (l == 0L)
				return false;
			for (int i_523_ = 0; i_523_ < ((Class387_Sub1) this).anInt8035; i_523_++) {
				unsafe.putShort(l, (((Class387_Sub1) this).aShortArray8016[i_523_]));
				l += 2L;
				unsafe.putShort(l, (((Class387_Sub1) this).aShortArray8039[i_523_]));
				l += 2L;
				unsafe.putShort(l, (((Class387_Sub1) this).aShortArray8040[i_523_]));
				l += 2L;
			}
			interface9_impl2.method95();
			((Class165) ((Class387_Sub1) this).aClass165_8050).anInterface9_Impl2_1698 = interface9_impl2;
			((Class165) ((Class387_Sub1) this).aClass165_8050).aBoolean1697 = true;
			((Class387_Sub1) this).aBoolean8066 = true;
			return true;
		}
		ByteBuffer bytebuffer = ((Class387_Sub1) this).aClass_ra_Sub2_8012.aByteBuffer8458;
		bytebuffer.clear();
		for (int i = 0; i < ((Class387_Sub1) this).anInt8035; i++) {
			bytebuffer.putShort(((Class387_Sub1) this).aShortArray8016[i]);
			bytebuffer.putShort(((Class387_Sub1) this).aShortArray8039[i]);
			bytebuffer.putShort(((Class387_Sub1) this).aShortArray8040[i]);
		}
		if (interface9_impl2.method97(0, bytebuffer.position(), (((Class387_Sub1) this).aClass_ra_Sub2_8012.aLong8459))) {
			((Class165) ((Class387_Sub1) this).aClass165_8050).anInterface9_Impl2_1698 = interface9_impl2;
			((Class165) ((Class387_Sub1) this).aClass165_8050).aBoolean1697 = true;
			((Class387_Sub1) this).aBoolean8066 = true;
			return true;
		}
		return false;
	}

	public int o() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8057;
	}

	public Class64[] method4452() {
		return ((Class387_Sub1) this).aClass64Array8068;
	}

	int method4505(int i, int i_524_) {
		i_524_ = i_524_ * (i & 0x7f) >> 7;
		if (i_524_ < 2)
			i_524_ = 2;
		else if (i_524_ > 126)
			i_524_ = 126;
		return (i & 0xff80) + i_524_;
	}

	int method4506(int i, short i_525_, int i_526_) {
		int i_527_ = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anIntArray8467[method4505(i, i_526_)]);
		if (i_525_ != -1) {
			Class56 class56 = ((Class387_Sub1) this).aClass_ra_Sub2_8012.anInterface_ma4227.method221(i_525_ & 0xffff, 1811558887);
			int i_528_ = class56.aByte529 & 0xff;
			if (i_528_ != 0) {
				int i_529_ = 131586 * i_526_;
				if (i_528_ == 256)
					i_527_ = i_529_;
				else {
					int i_530_ = i_528_;
					int i_531_ = 256 - i_528_;
					i_527_ = ((((i_529_ & 0xff00ff) * i_530_ + (i_527_ & 0xff00ff) * i_531_) & ~0xff00ff) + (((i_529_ & 0xff00) * i_530_ + (i_527_ & 0xff00) * i_531_) & 0xff0000)) >> 8;
				}
			}
			int i_532_ = class56.aByte534 & 0xff;
			if (i_532_ != 0) {
				i_532_ += 256;
				int i_533_ = ((i_527_ & 0xff0000) >> 16) * i_532_;
				if (i_533_ > 65535)
					i_533_ = 65535;
				int i_534_ = ((i_527_ & 0xff00) >> 8) * i_532_;
				if (i_534_ > 65535)
					i_534_ = 65535;
				int i_535_ = (i_527_ & 0xff) * i_532_;
				if (i_535_ > 65535)
					i_535_ = 65535;
				i_527_ = (i_533_ << 8 & 0xff0000) + (i_534_ & 0xff00) + (i_535_ >> 8);
			}
		}
		return i_527_ & 0xffffff;
	}

	public void bi(int i, int i_536_, int i_537_) {
		for (int i_538_ = 0; i_538_ < ((Class387_Sub1) this).anInt8044; i_538_++) {
			if (i != 0)
				((Class387_Sub1) this).anIntArray8065[i_538_] += i;
			if (i_536_ != 0)
				((Class387_Sub1) this).anIntArray8020[i_538_] += i_536_;
			if (i_537_ != 0)
				((Class387_Sub1) this).anIntArray8051[i_538_] += i_537_;
		}
		method4498();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public void method4466(Class387 class387, int i, int i_539_, int i_540_, boolean bool) {
		Class387_Sub1 class387_sub1_541_ = (Class387_Sub1) class387;
		if (((Class387_Sub1) this).anInt8034 != 0 && ((Class387_Sub1) class387_sub1_541_).anInt8034 != 0) {
			int i_542_ = ((Class387_Sub1) class387_sub1_541_).anInt8044;
			int[] is = ((Class387_Sub1) class387_sub1_541_).anIntArray8065;
			int[] is_543_ = ((Class387_Sub1) class387_sub1_541_).anIntArray8020;
			int[] is_544_ = ((Class387_Sub1) class387_sub1_541_).anIntArray8051;
			short[] is_545_ = ((Class387_Sub1) class387_sub1_541_).aShortArray8032;
			short[] is_546_ = ((Class387_Sub1) class387_sub1_541_).aShortArray8028;
			short[] is_547_ = ((Class387_Sub1) class387_sub1_541_).aShortArray8024;
			byte[] is_548_ = ((Class387_Sub1) class387_sub1_541_).aByteArray8030;
			short[] is_549_;
			short[] is_550_;
			short[] is_551_;
			byte[] is_552_;
			if (((Class387_Sub1) this).aClass206_8033 != null) {
				is_549_ = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1938);
				is_550_ = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1937);
				is_551_ = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1939);
				is_552_ = (((Class206) ((Class387_Sub1) this).aClass206_8033).aByteArray1940);
			} else {
				is_549_ = null;
				is_550_ = null;
				is_551_ = null;
				is_552_ = null;
			}
			short[] is_553_;
			short[] is_554_;
			short[] is_555_;
			byte[] is_556_;
			if (((Class387_Sub1) class387_sub1_541_).aClass206_8033 != null) {
				is_553_ = ((Class206) (((Class387_Sub1) class387_sub1_541_).aClass206_8033)).aShortArray1938;
				is_554_ = ((Class206) (((Class387_Sub1) class387_sub1_541_).aClass206_8033)).aShortArray1937;
				is_555_ = ((Class206) (((Class387_Sub1) class387_sub1_541_).aClass206_8033)).aShortArray1939;
				is_556_ = ((Class206) (((Class387_Sub1) class387_sub1_541_).aClass206_8033)).aByteArray1940;
			} else {
				is_553_ = null;
				is_554_ = null;
				is_555_ = null;
				is_556_ = null;
			}
			int[] is_557_ = ((Class387_Sub1) class387_sub1_541_).anIntArray8082;
			short[] is_558_ = ((Class387_Sub1) class387_sub1_541_).aShortArray8052;
			if (!((Class387_Sub1) class387_sub1_541_).aBoolean8043)
				class387_sub1_541_.method4501();
			int i_559_ = ((Class387_Sub1) class387_sub1_541_).anInt8056;
			int i_560_ = ((Class387_Sub1) class387_sub1_541_).anInt8057;
			int i_561_ = ((Class387_Sub1) class387_sub1_541_).anInt8058;
			int i_562_ = ((Class387_Sub1) class387_sub1_541_).anInt8059;
			int i_563_ = ((Class387_Sub1) class387_sub1_541_).anInt8060;
			int i_564_ = ((Class387_Sub1) class387_sub1_541_).anInt8078;
			for (int i_565_ = 0; i_565_ < ((Class387_Sub1) this).anInt8044; i_565_++) {
				int i_566_ = ((Class387_Sub1) this).anIntArray8020[i_565_] - i_539_;
				if (i_566_ >= i_559_ && i_566_ <= i_560_) {
					int i_567_ = ((Class387_Sub1) this).anIntArray8065[i_565_] - i;
					if (i_567_ >= i_561_ && i_567_ <= i_562_) {
						int i_568_ = (((Class387_Sub1) this).anIntArray8051[i_565_] - i_540_);
						if (i_568_ >= i_563_ && i_568_ <= i_564_) {
							int i_569_ = -1;
							int i_570_ = (((Class387_Sub1) this).anIntArray8082[i_565_]);
							int i_571_ = (((Class387_Sub1) this).anIntArray8082[i_565_ + 1]);
							for (int i_572_ = i_570_; i_572_ < i_571_; i_572_++) {
								i_569_ = (((Class387_Sub1) this).aShortArray8052[i_572_]) - 1;
								if (i_569_ == -1 || (((Class387_Sub1) this).aByteArray8030[i_569_]) != 0)
									break;
							}
							if (i_569_ != -1) {
								for (int i_573_ = 0; i_573_ < i_542_; i_573_++) {
									if (i_567_ == is[i_573_] && i_568_ == is_544_[i_573_] && i_566_ == is_543_[i_573_]) {
										int i_574_ = -1;
										i_570_ = is_557_[i_573_];
										i_571_ = is_557_[i_573_ + 1];
										for (int i_575_ = i_570_; i_575_ < i_571_; i_575_++) {
											i_574_ = is_558_[i_575_] - 1;
											if (i_574_ == -1 || is_548_[i_574_] != 0)
												break;
										}
										if (i_574_ != -1) {
											if (is_549_ == null) {
												((Class387_Sub1) this).aClass206_8033 = new Class206();
												is_549_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aShortArray1938 = (Class263_Sub4.method2637((((Class387_Sub1) this).aShortArray8032), 1762849454));
												is_550_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aShortArray1937 = (Class263_Sub4.method2637((((Class387_Sub1) this).aShortArray8028), 1940891339));
												is_551_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aShortArray1939 = (Class263_Sub4.method2637((((Class387_Sub1) this).aShortArray8024), 2080051765));
												is_552_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aByteArray1940 = (IcmpService_Sub1.method6479((((Class387_Sub1) this).aByteArray8030), (byte) 2));
											}
											if (is_553_ == null) {
												Class206 class206 = (((Class387_Sub1) class387_sub1_541_).aClass206_8033 = new Class206());
												is_553_ = ((Class206) class206).aShortArray1938 = (Class263_Sub4.method2637(is_545_, 1412897576));
												is_554_ = ((Class206) class206).aShortArray1937 = (Class263_Sub4.method2637(is_546_, 1954935584));
												is_555_ = ((Class206) class206).aShortArray1939 = (Class263_Sub4.method2637(is_547_, 1726172372));
												is_556_ = ((Class206) class206).aByteArray1940 = (IcmpService_Sub1.method6479(is_548_, (byte) 2));
											}
											short i_576_ = (((Class387_Sub1) this).aShortArray8032[i_569_]);
											short i_577_ = (((Class387_Sub1) this).aShortArray8028[i_569_]);
											short i_578_ = (((Class387_Sub1) this).aShortArray8024[i_569_]);
											byte i_579_ = (((Class387_Sub1) this).aByteArray8030[i_569_]);
											i_570_ = is_557_[i_573_];
											i_571_ = is_557_[i_573_ + 1];
											for (int i_580_ = i_570_; i_580_ < i_571_; i_580_++) {
												int i_581_ = is_558_[i_580_] - 1;
												if (i_581_ == -1)
													break;
												if (is_556_[i_581_] != 0) {
													is_553_[i_581_] += i_576_;
													is_554_[i_581_] += i_577_;
													is_555_[i_581_] += i_578_;
													is_556_[i_581_] += i_579_;
												}
											}
											i_576_ = is_545_[i_574_];
											i_577_ = is_546_[i_574_];
											i_578_ = is_547_[i_574_];
											i_579_ = is_548_[i_574_];
											i_570_ = (((Class387_Sub1) this).anIntArray8082[i_565_]);
											i_571_ = (((Class387_Sub1) this).anIntArray8082[i_565_ + 1]);
											for (int i_582_ = i_570_; i_582_ < i_571_; i_582_++) {
												int i_583_ = ((((Class387_Sub1) this).aShortArray8052[i_582_]) - 1);
												if (i_583_ == -1)
													break;
												if (is_552_[i_583_] != 0) {
													is_549_[i_583_] += i_576_;
													is_550_[i_583_] += i_577_;
													is_551_[i_583_] += i_578_;
													is_552_[i_583_] += i_579_;
												}
											}
											class387_sub1_541_.method4499();
											method4499();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void method4467(Class387 class387, int i, int i_584_, int i_585_, boolean bool) {
		Class387_Sub1 class387_sub1_586_ = (Class387_Sub1) class387;
		if (((Class387_Sub1) this).anInt8034 != 0 && ((Class387_Sub1) class387_sub1_586_).anInt8034 != 0) {
			int i_587_ = ((Class387_Sub1) class387_sub1_586_).anInt8044;
			int[] is = ((Class387_Sub1) class387_sub1_586_).anIntArray8065;
			int[] is_588_ = ((Class387_Sub1) class387_sub1_586_).anIntArray8020;
			int[] is_589_ = ((Class387_Sub1) class387_sub1_586_).anIntArray8051;
			short[] is_590_ = ((Class387_Sub1) class387_sub1_586_).aShortArray8032;
			short[] is_591_ = ((Class387_Sub1) class387_sub1_586_).aShortArray8028;
			short[] is_592_ = ((Class387_Sub1) class387_sub1_586_).aShortArray8024;
			byte[] is_593_ = ((Class387_Sub1) class387_sub1_586_).aByteArray8030;
			short[] is_594_;
			short[] is_595_;
			short[] is_596_;
			byte[] is_597_;
			if (((Class387_Sub1) this).aClass206_8033 != null) {
				is_594_ = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1938);
				is_595_ = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1937);
				is_596_ = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1939);
				is_597_ = (((Class206) ((Class387_Sub1) this).aClass206_8033).aByteArray1940);
			} else {
				is_594_ = null;
				is_595_ = null;
				is_596_ = null;
				is_597_ = null;
			}
			short[] is_598_;
			short[] is_599_;
			short[] is_600_;
			byte[] is_601_;
			if (((Class387_Sub1) class387_sub1_586_).aClass206_8033 != null) {
				is_598_ = ((Class206) (((Class387_Sub1) class387_sub1_586_).aClass206_8033)).aShortArray1938;
				is_599_ = ((Class206) (((Class387_Sub1) class387_sub1_586_).aClass206_8033)).aShortArray1937;
				is_600_ = ((Class206) (((Class387_Sub1) class387_sub1_586_).aClass206_8033)).aShortArray1939;
				is_601_ = ((Class206) (((Class387_Sub1) class387_sub1_586_).aClass206_8033)).aByteArray1940;
			} else {
				is_598_ = null;
				is_599_ = null;
				is_600_ = null;
				is_601_ = null;
			}
			int[] is_602_ = ((Class387_Sub1) class387_sub1_586_).anIntArray8082;
			short[] is_603_ = ((Class387_Sub1) class387_sub1_586_).aShortArray8052;
			if (!((Class387_Sub1) class387_sub1_586_).aBoolean8043)
				class387_sub1_586_.method4501();
			int i_604_ = ((Class387_Sub1) class387_sub1_586_).anInt8056;
			int i_605_ = ((Class387_Sub1) class387_sub1_586_).anInt8057;
			int i_606_ = ((Class387_Sub1) class387_sub1_586_).anInt8058;
			int i_607_ = ((Class387_Sub1) class387_sub1_586_).anInt8059;
			int i_608_ = ((Class387_Sub1) class387_sub1_586_).anInt8060;
			int i_609_ = ((Class387_Sub1) class387_sub1_586_).anInt8078;
			for (int i_610_ = 0; i_610_ < ((Class387_Sub1) this).anInt8044; i_610_++) {
				int i_611_ = ((Class387_Sub1) this).anIntArray8020[i_610_] - i_584_;
				if (i_611_ >= i_604_ && i_611_ <= i_605_) {
					int i_612_ = ((Class387_Sub1) this).anIntArray8065[i_610_] - i;
					if (i_612_ >= i_606_ && i_612_ <= i_607_) {
						int i_613_ = (((Class387_Sub1) this).anIntArray8051[i_610_] - i_585_);
						if (i_613_ >= i_608_ && i_613_ <= i_609_) {
							int i_614_ = -1;
							int i_615_ = (((Class387_Sub1) this).anIntArray8082[i_610_]);
							int i_616_ = (((Class387_Sub1) this).anIntArray8082[i_610_ + 1]);
							for (int i_617_ = i_615_; i_617_ < i_616_; i_617_++) {
								i_614_ = (((Class387_Sub1) this).aShortArray8052[i_617_]) - 1;
								if (i_614_ == -1 || (((Class387_Sub1) this).aByteArray8030[i_614_]) != 0)
									break;
							}
							if (i_614_ != -1) {
								for (int i_618_ = 0; i_618_ < i_587_; i_618_++) {
									if (i_612_ == is[i_618_] && i_613_ == is_589_[i_618_] && i_611_ == is_588_[i_618_]) {
										int i_619_ = -1;
										i_615_ = is_602_[i_618_];
										i_616_ = is_602_[i_618_ + 1];
										for (int i_620_ = i_615_; i_620_ < i_616_; i_620_++) {
											i_619_ = is_603_[i_620_] - 1;
											if (i_619_ == -1 || is_593_[i_619_] != 0)
												break;
										}
										if (i_619_ != -1) {
											if (is_594_ == null) {
												((Class387_Sub1) this).aClass206_8033 = new Class206();
												is_594_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aShortArray1938 = (Class263_Sub4.method2637((((Class387_Sub1) this).aShortArray8032), 1837889535));
												is_595_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aShortArray1937 = (Class263_Sub4.method2637((((Class387_Sub1) this).aShortArray8028), 1678772099));
												is_596_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aShortArray1939 = (Class263_Sub4.method2637((((Class387_Sub1) this).aShortArray8024), 1481146845));
												is_597_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aByteArray1940 = (IcmpService_Sub1.method6479((((Class387_Sub1) this).aByteArray8030), (byte) 2));
											}
											if (is_598_ == null) {
												Class206 class206 = (((Class387_Sub1) class387_sub1_586_).aClass206_8033 = new Class206());
												is_598_ = ((Class206) class206).aShortArray1938 = (Class263_Sub4.method2637(is_590_, 1824430421));
												is_599_ = ((Class206) class206).aShortArray1937 = (Class263_Sub4.method2637(is_591_, 1483035051));
												is_600_ = ((Class206) class206).aShortArray1939 = (Class263_Sub4.method2637(is_592_, 1549000936));
												is_601_ = ((Class206) class206).aByteArray1940 = (IcmpService_Sub1.method6479(is_593_, (byte) 2));
											}
											short i_621_ = (((Class387_Sub1) this).aShortArray8032[i_614_]);
											short i_622_ = (((Class387_Sub1) this).aShortArray8028[i_614_]);
											short i_623_ = (((Class387_Sub1) this).aShortArray8024[i_614_]);
											byte i_624_ = (((Class387_Sub1) this).aByteArray8030[i_614_]);
											i_615_ = is_602_[i_618_];
											i_616_ = is_602_[i_618_ + 1];
											for (int i_625_ = i_615_; i_625_ < i_616_; i_625_++) {
												int i_626_ = is_603_[i_625_] - 1;
												if (i_626_ == -1)
													break;
												if (is_601_[i_626_] != 0) {
													is_598_[i_626_] += i_621_;
													is_599_[i_626_] += i_622_;
													is_600_[i_626_] += i_623_;
													is_601_[i_626_] += i_624_;
												}
											}
											i_621_ = is_590_[i_619_];
											i_622_ = is_591_[i_619_];
											i_623_ = is_592_[i_619_];
											i_624_ = is_593_[i_619_];
											i_615_ = (((Class387_Sub1) this).anIntArray8082[i_610_]);
											i_616_ = (((Class387_Sub1) this).anIntArray8082[i_610_ + 1]);
											for (int i_627_ = i_615_; i_627_ < i_616_; i_627_++) {
												int i_628_ = ((((Class387_Sub1) this).aShortArray8052[i_627_]) - 1);
												if (i_628_ == -1)
													break;
												if (is_597_[i_628_] != 0) {
													is_594_[i_628_] += i_621_;
													is_595_[i_628_] += i_622_;
													is_596_[i_628_] += i_623_;
													is_597_[i_628_] += i_624_;
												}
											}
											class387_sub1_586_.method4499();
											method4499();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public Class387 method4468(byte i, int i_629_, boolean bool) {
		boolean bool_630_ = false;
		Class387_Sub1 class387_sub1_631_;
		Class387_Sub1 class387_sub1_632_;
		if (i > 0 && i <= 7) {
			class387_sub1_632_ = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass387_Sub1Array8609[i - 1]);
			class387_sub1_631_ = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass387_Sub1Array8534[i - 1]);
			bool_630_ = true;
		} else
			class387_sub1_631_ = class387_sub1_632_ = new Class387_Sub1(((Class387_Sub1) this).aClass_ra_Sub2_8012, 0, 0, true, false);
		return method4497(class387_sub1_631_, class387_sub1_632_, i_629_, bool_630_, bool);
	}

	public void ck(int i) {
		((Class387_Sub1) this).aShort8015 = (short) i;
		method4507();
	}

	public int av() {
		return ((Class387_Sub1) this).anInt8013;
	}

	public void dm(int i, int i_633_, int i_634_, int i_635_) {
		for (int i_636_ = 0; i_636_ < ((Class387_Sub1) this).anInt8034; i_636_++) {
			int i_637_ = ((Class387_Sub1) this).modelColors[i_636_] & 0xffff;
			int i_638_ = i_637_ >> 10 & 0x3f;
			int i_639_ = i_637_ >> 7 & 0x7;
			int i_640_ = i_637_ & 0x7f;
			if (i != -1)
				i_638_ += (i - i_638_) * i_635_ >> 7;
			if (i_633_ != -1)
				i_639_ += (i_633_ - i_639_) * i_635_ >> 7;
			if (i_634_ != -1)
				i_640_ += (i_634_ - i_640_) * i_635_ >> 7;
			((Class387_Sub1) this).modelColors[i_636_] = (short) (i_638_ << 10 | i_639_ << 7 | i_640_);
		}
		if (((Class387_Sub1) this).aClass185Array8070 != null) {
			for (int i_641_ = 0; i_641_ < ((Class387_Sub1) this).anInt8069; i_641_++) {
				Class185 class185 = ((Class387_Sub1) this).aClass185Array8070[i_641_];
				Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_641_];
				((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | ((Console.colorArray[(((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		method4507();
	}

	public int am() {
		return ((Class387_Sub1) this).anInt8013;
	}

	public void au(int i) {
		if (((Class387_Sub1) this).aClass173_8045 != null)
			((Class173) ((Class387_Sub1) this).aClass173_8045).aBoolean1731 = Class160.method1892(i, ((Class387_Sub1) this).anInt8081);
		if (((Class387_Sub1) this).aClass173_8021 != null)
			((Class173) ((Class387_Sub1) this).aClass173_8021).aBoolean1731 = Class160.method1894(i, ((Class387_Sub1) this).anInt8081);
		if (((Class387_Sub1) this).aClass173_8046 != null)
			((Class173) ((Class387_Sub1) this).aClass173_8046).aBoolean1731 = Class160.method1908(i, ((Class387_Sub1) this).anInt8081);
		if (((Class387_Sub1) this).aClass173_8047 != null)
			((Class173) ((Class387_Sub1) this).aClass173_8047).aBoolean1731 = Class160.method1893(i, ((Class387_Sub1) this).anInt8081);
		((Class387_Sub1) this).anInt8013 = i;
		if (((Class387_Sub1) this).aClass206_8033 != null && (((Class387_Sub1) this).anInt8013 & 0x10000) == 0) {
			((Class387_Sub1) this).aShortArray8032 = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1938);
			((Class387_Sub1) this).aShortArray8028 = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1937);
			((Class387_Sub1) this).aShortArray8024 = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1939);
			((Class387_Sub1) this).aByteArray8030 = (((Class206) ((Class387_Sub1) this).aClass206_8033).aByteArray1940);
			((Class387_Sub1) this).aClass206_8033 = null;
		}
		((Class387_Sub1) this).aBoolean8066 = true;
		method4510();
	}

	public void PA(int i, int i_642_, int i_643_, int i_644_) {
		for (int i_645_ = 0; i_645_ < ((Class387_Sub1) this).anInt8034; i_645_++) {
			int i_646_ = ((Class387_Sub1) this).modelColors[i_645_] & 0xffff;
			int i_647_ = i_646_ >> 10 & 0x3f;
			int i_648_ = i_646_ >> 7 & 0x7;
			int i_649_ = i_646_ & 0x7f;
			if (i != -1)
				i_647_ += (i - i_647_) * i_644_ >> 7;
			if (i_642_ != -1)
				i_648_ += (i_642_ - i_648_) * i_644_ >> 7;
			if (i_643_ != -1)
				i_649_ += (i_643_ - i_649_) * i_644_ >> 7;
			((Class387_Sub1) this).modelColors[i_645_] = (short) (i_647_ << 10 | i_648_ << 7 | i_649_);
		}
		if (((Class387_Sub1) this).aClass185Array8070 != null) {
			for (int i_650_ = 0; i_650_ < ((Class387_Sub1) this).anInt8069; i_650_++) {
				Class185 class185 = ((Class387_Sub1) this).aClass185Array8070[i_650_];
				Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_650_];
				((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | ((Console.colorArray[(((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		method4507();
	}

	public void ao(int i) {
		int i_651_ = Class257.anIntArray2683[i];
		int i_652_ = Class257.anIntArray2684[i];
		for (int i_653_ = 0; i_653_ < ((Class387_Sub1) this).anInt8044; i_653_++) {
			int i_654_ = ((((Class387_Sub1) this).anIntArray8051[i_653_] * i_651_ + ((Class387_Sub1) this).anIntArray8065[i_653_] * i_652_) >> 14);
			((Class387_Sub1) this).anIntArray8051[i_653_] = ((((Class387_Sub1) this).anIntArray8051[i_653_] * i_652_ - ((Class387_Sub1) this).anIntArray8065[i_653_] * i_651_) >> 14);
			((Class387_Sub1) this).anIntArray8065[i_653_] = i_654_;
		}
		for (int i_655_ = 0; i_655_ < ((Class387_Sub1) this).anInt8038; i_655_++) {
			int i_656_ = ((((Class387_Sub1) this).aShortArray8024[i_655_] * i_651_ + ((Class387_Sub1) this).aShortArray8032[i_655_] * i_652_) >> 14);
			((Class387_Sub1) this).aShortArray8024[i_655_] = (short) (((((Class387_Sub1) this).aShortArray8024[i_655_] * i_652_) - (((Class387_Sub1) this).aShortArray8032[i_655_] * i_651_)) >> 14);
			((Class387_Sub1) this).aShortArray8032[i_655_] = (short) i_656_;
		}
		method4498();
		method4499();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public void bg(int i) {
		int i_657_ = Class257.anIntArray2683[i];
		int i_658_ = Class257.anIntArray2684[i];
		for (int i_659_ = 0; i_659_ < ((Class387_Sub1) this).anInt8044; i_659_++) {
			int i_660_ = ((((Class387_Sub1) this).anIntArray8051[i_659_] * i_657_ + ((Class387_Sub1) this).anIntArray8065[i_659_] * i_658_) >> 14);
			((Class387_Sub1) this).anIntArray8051[i_659_] = ((((Class387_Sub1) this).anIntArray8051[i_659_] * i_658_ - ((Class387_Sub1) this).anIntArray8065[i_659_] * i_657_) >> 14);
			((Class387_Sub1) this).anIntArray8065[i_659_] = i_660_;
		}
		for (int i_661_ = 0; i_661_ < ((Class387_Sub1) this).anInt8038; i_661_++) {
			int i_662_ = ((((Class387_Sub1) this).aShortArray8024[i_661_] * i_657_ + ((Class387_Sub1) this).aShortArray8032[i_661_] * i_658_) >> 14);
			((Class387_Sub1) this).aShortArray8024[i_661_] = (short) (((((Class387_Sub1) this).aShortArray8024[i_661_] * i_658_) - (((Class387_Sub1) this).aShortArray8032[i_661_] * i_657_)) >> 14);
			((Class387_Sub1) this).aShortArray8032[i_661_] = (short) i_662_;
		}
		method4498();
		method4499();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public void method4465(Class247 class247) {
		Class249 class249 = ((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8576;
		class249.method2508(class247);
		if (((Class387_Sub1) this).aClass93Array8026 != null) {
			for (int i = 0; i < ((Class387_Sub1) this).aClass93Array8026.length; i++) {
				Class93 class93 = ((Class387_Sub1) this).aClass93Array8026[i];
				Class93 class93_663_ = class93;
				if (class93.aClass93_833 != null)
					class93_663_ = class93.aClass93_833;
				class93_663_.anInt838 = ((int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub1) this).anIntArray8065[class93.anInt841 * -1670679901])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub1) this).anIntArray8020[(class93.anInt841 * -1670679901)])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub1) this).anIntArray8051[(class93.anInt841 * -1670679901)])))) * 432673201);
				class93_663_.anInt832 = ((int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub1) this).anIntArray8065[class93.anInt841 * -1670679901])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub1) this).anIntArray8020[(class93.anInt841 * -1670679901)])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub1) this).anIntArray8051[(class93.anInt841 * -1670679901)])))) * -1138862783);
				class93_663_.anInt840 = ((int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub1) this).anIntArray8065[class93.anInt841 * -1670679901])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub1) this).anIntArray8020[(class93.anInt841 * -1670679901)])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub1) this).anIntArray8051[(class93.anInt841 * -1670679901)])))) * -555868357);
				class93_663_.anInt837 = ((int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub1) this).anIntArray8065[class93.anInt835 * -614748507])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub1) this).anIntArray8020[(class93.anInt835 * -614748507)])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub1) this).anIntArray8051[(class93.anInt835 * -614748507)])))) * -707023853);
				class93_663_.anInt842 = ((int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub1) this).anIntArray8065[class93.anInt835 * -614748507])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub1) this).anIntArray8020[(class93.anInt835 * -614748507)])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub1) this).anIntArray8051[(class93.anInt835 * -614748507)])))) * -648890367);
				class93_663_.anInt845 = ((int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub1) this).anIntArray8065[class93.anInt835 * -614748507])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub1) this).anIntArray8020[(class93.anInt835 * -614748507)])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub1) this).anIntArray8051[(class93.anInt835 * -614748507)])))) * -1672139309);
				class93_663_.anInt839 = (int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub1) this).anIntArray8065[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub1) this).anIntArray8020[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub1) this).anIntArray8051[(class93.anInt836 * -878748965)])))) * 488615051;
				class93_663_.anInt844 = (int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub1) this).anIntArray8065[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub1) this).anIntArray8020[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub1) this).anIntArray8051[(class93.anInt836 * -878748965)])))) * 197668655;
				class93_663_.anInt846 = (int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub1) this).anIntArray8065[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub1) this).anIntArray8020[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub1) this).anIntArray8051[(class93.anInt836 * -878748965)])))) * 471540135;
			}
		}
		if (((Class387_Sub1) this).aClass64Array8068 != null) {
			for (int i = 0; i < ((Class387_Sub1) this).aClass64Array8068.length; i++) {
				Class64 class64 = ((Class387_Sub1) this).aClass64Array8068[i];
				Class64 class64_664_ = class64;
				if (class64.aClass64_562 != null)
					class64_664_ = class64.aClass64_562;
				if (class64.aClass249_568 != null)
					class64.aClass249_568.method2510(class249);
				else
					class64.aClass249_568 = new Class249(class249);
				class64_664_.anInt565 = ((int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub1) this).anIntArray8065[class64.anInt566 * 1669844747])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub1) this).anIntArray8020[(class64.anInt566 * 1669844747)])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub1) this).anIntArray8051[(class64.anInt566 * 1669844747)])))) * -686746519);
				class64_664_.anInt563 = ((int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub1) this).anIntArray8065[class64.anInt566 * 1669844747])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub1) this).anIntArray8020[(class64.anInt566 * 1669844747)])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub1) this).anIntArray8051[(class64.anInt566 * 1669844747)])))) * -635472619);
				class64_664_.anInt567 = ((int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub1) this).anIntArray8065[class64.anInt566 * 1669844747])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub1) this).anIntArray8020[(class64.anInt566 * 1669844747)])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub1) this).anIntArray8051[(class64.anInt566 * 1669844747)])))) * 1225142127);
			}
		}
	}

	public void bo(int i) {
		int i_665_ = Class257.anIntArray2683[i];
		int i_666_ = Class257.anIntArray2684[i];
		for (int i_667_ = 0; i_667_ < ((Class387_Sub1) this).anInt8044; i_667_++) {
			int i_668_ = ((((Class387_Sub1) this).anIntArray8051[i_667_] * i_665_ + ((Class387_Sub1) this).anIntArray8065[i_667_] * i_666_) >> 14);
			((Class387_Sub1) this).anIntArray8051[i_667_] = ((((Class387_Sub1) this).anIntArray8051[i_667_] * i_666_ - ((Class387_Sub1) this).anIntArray8065[i_667_] * i_665_) >> 14);
			((Class387_Sub1) this).anIntArray8065[i_667_] = i_668_;
		}
		for (int i_669_ = 0; i_669_ < ((Class387_Sub1) this).anInt8038; i_669_++) {
			int i_670_ = ((((Class387_Sub1) this).aShortArray8024[i_669_] * i_665_ + ((Class387_Sub1) this).aShortArray8032[i_669_] * i_666_) >> 14);
			((Class387_Sub1) this).aShortArray8024[i_669_] = (short) (((((Class387_Sub1) this).aShortArray8024[i_669_] * i_666_) - (((Class387_Sub1) this).aShortArray8032[i_669_] * i_665_)) >> 14);
			((Class387_Sub1) this).aShortArray8032[i_669_] = (short) i_670_;
		}
		method4498();
		method4499();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public void bt(int i) {
		int i_671_ = Class257.anIntArray2683[i];
		int i_672_ = Class257.anIntArray2684[i];
		for (int i_673_ = 0; i_673_ < ((Class387_Sub1) this).anInt8044; i_673_++) {
			int i_674_ = ((((Class387_Sub1) this).anIntArray8051[i_673_] * i_671_ + ((Class387_Sub1) this).anIntArray8065[i_673_] * i_672_) >> 14);
			((Class387_Sub1) this).anIntArray8051[i_673_] = ((((Class387_Sub1) this).anIntArray8051[i_673_] * i_672_ - ((Class387_Sub1) this).anIntArray8065[i_673_] * i_671_) >> 14);
			((Class387_Sub1) this).anIntArray8065[i_673_] = i_674_;
		}
		for (int i_675_ = 0; i_675_ < ((Class387_Sub1) this).anInt8038; i_675_++) {
			int i_676_ = ((((Class387_Sub1) this).aShortArray8024[i_675_] * i_671_ + ((Class387_Sub1) this).aShortArray8032[i_675_] * i_672_) >> 14);
			((Class387_Sub1) this).aShortArray8024[i_675_] = (short) (((((Class387_Sub1) this).aShortArray8024[i_675_] * i_672_) - (((Class387_Sub1) this).aShortArray8032[i_675_] * i_671_)) >> 14);
			((Class387_Sub1) this).aShortArray8032[i_675_] = (short) i_676_;
		}
		method4498();
		method4499();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public void bc(int i) {
		int i_677_ = Class257.anIntArray2683[i];
		int i_678_ = Class257.anIntArray2684[i];
		for (int i_679_ = 0; i_679_ < ((Class387_Sub1) this).anInt8044; i_679_++) {
			int i_680_ = ((((Class387_Sub1) this).anIntArray8020[i_679_] * i_678_ - ((Class387_Sub1) this).anIntArray8051[i_679_] * i_677_) >> 14);
			((Class387_Sub1) this).anIntArray8051[i_679_] = ((((Class387_Sub1) this).anIntArray8020[i_679_] * i_677_ + ((Class387_Sub1) this).anIntArray8051[i_679_] * i_678_) >> 14);
			((Class387_Sub1) this).anIntArray8020[i_679_] = i_680_;
		}
		method4498();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public void by(int i, int i_681_, Class_xa class_xa, Class_xa class_xa_682_, int i_683_, int i_684_, int i_685_) {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		int i_686_ = i_683_ + ((Class387_Sub1) this).anInt8058;
		int i_687_ = i_683_ + ((Class387_Sub1) this).anInt8059;
		int i_688_ = i_685_ + ((Class387_Sub1) this).anInt8060;
		int i_689_ = i_685_ + ((Class387_Sub1) this).anInt8078;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_686_ >= 0 && ((i_687_ + class_xa.anInt6395 * 550173571 >> class_xa.anInt6396 * -1066304221) < class_xa.anInt6397 * 1972554729) && i_688_ >= 0 && ((i_689_ + class_xa.anInt6395 * 550173571 >> class_xa.anInt6396 * -1066304221) < class_xa.anInt6393 * 24567321))) {
			if (i == 4 || i == 5) {
				if (class_xa_682_ == null || (i_686_ < 0 || ((i_687_ + class_xa_682_.anInt6395 * 550173571 >> class_xa_682_.anInt6396 * -1066304221) >= class_xa_682_.anInt6397 * 1972554729) || i_688_ < 0 || ((i_689_ + class_xa_682_.anInt6395 * 550173571 >> class_xa_682_.anInt6396 * -1066304221) >= class_xa_682_.anInt6393 * 24567321)))
					return;
			} else {
				i_686_ >>= class_xa.anInt6396 * -1066304221;
				i_687_ = (i_687_ + (class_xa.anInt6395 * 550173571 - 1) >> class_xa.anInt6396 * -1066304221);
				i_688_ >>= class_xa.anInt6396 * -1066304221;
				i_689_ = (i_689_ + (class_xa.anInt6395 * 550173571 - 1) >> class_xa.anInt6396 * -1066304221);
				if (class_xa.method6417(i_686_, i_688_, 1008467058) == i_684_ && (class_xa.method6417(i_687_, i_688_, -1889681399) == i_684_) && (class_xa.method6417(i_686_, i_689_, -1060142183) == i_684_) && (class_xa.method6417(i_687_, i_689_, -525258275) == i_684_))
					return;
			}
			if (i == 1) {
				for (int i_690_ = 0; i_690_ < ((Class387_Sub1) this).anInt8044; i_690_++)
					((Class387_Sub1) this).anIntArray8020[i_690_] = (((Class387_Sub1) this).anIntArray8020[i_690_] + class_xa.method6416(((((Class387_Sub1) this).anIntArray8065[i_690_]) + i_683_), ((((Class387_Sub1) this).anIntArray8051[i_690_]) + i_685_), 1800833256) - i_684_);
			} else if (i == 2) {
				int i_691_ = ((Class387_Sub1) this).anInt8056;
				if (i_691_ == 0)
					return;
				for (int i_692_ = 0; i_692_ < ((Class387_Sub1) this).anInt8044; i_692_++) {
					int i_693_ = (((Class387_Sub1) this).anIntArray8020[i_692_] << 16) / i_691_;
					if (i_693_ < i_681_)
						((Class387_Sub1) this).anIntArray8020[i_692_] = (((Class387_Sub1) this).anIntArray8020[i_692_] + (class_xa.method6416((((Class387_Sub1) this).anIntArray8065[i_692_]) + i_683_, (((Class387_Sub1) this).anIntArray8051[i_692_]) + i_685_, -1539177000) - i_684_) * (i_681_ - i_693_) / i_681_);
				}
			} else if (i == 3) {
				int i_694_ = (i_681_ & 0xff) * 4;
				int i_695_ = (i_681_ >> 8 & 0xff) * 4;
				int i_696_ = (i_681_ >> 16 & 0xff) << 6;
				int i_697_ = (i_681_ >> 24 & 0xff) << 6;
				if (i_683_ - (i_694_ >> 1) < 0 || (i_683_ + (i_694_ >> 1) + class_xa.anInt6395 * 550173571 >= (class_xa.anInt6397 * 1972554729 << class_xa.anInt6396 * -1066304221)) || i_685_ - (i_695_ >> 1) < 0 || (i_685_ + (i_695_ >> 1) + class_xa.anInt6395 * 550173571 >= (class_xa.anInt6393 * 24567321 << class_xa.anInt6396 * -1066304221)))
					return;
				method4447(class_xa, i_683_, i_684_, i_685_, i_694_, i_695_, i_696_, i_697_);
			} else if (i == 4) {
				int i_698_ = (((Class387_Sub1) this).anInt8057 - ((Class387_Sub1) this).anInt8056);
				for (int i_699_ = 0; i_699_ < ((Class387_Sub1) this).anInt8044; i_699_++)
					((Class387_Sub1) this).anIntArray8020[i_699_] = (((Class387_Sub1) this).anIntArray8020[i_699_] + (class_xa_682_.method6416((((Class387_Sub1) this).anIntArray8065[i_699_]) + i_683_, (((Class387_Sub1) this).anIntArray8051[i_699_]) + i_685_, -1158412862) - i_684_) + i_698_);
			} else if (i == 5) {
				int i_700_ = (((Class387_Sub1) this).anInt8057 - ((Class387_Sub1) this).anInt8056);
				for (int i_701_ = 0; i_701_ < ((Class387_Sub1) this).anInt8044; i_701_++) {
					int i_702_ = (((Class387_Sub1) this).anIntArray8065[i_701_] + i_683_);
					int i_703_ = (((Class387_Sub1) this).anIntArray8051[i_701_] + i_685_);
					int i_704_ = class_xa.method6416(i_702_, i_703_, -2139982536);
					int i_705_ = class_xa_682_.method6416(i_702_, i_703_, -62007628);
					int i_706_ = i_704_ - i_705_ - i_681_;
					((Class387_Sub1) this).anIntArray8020[i_701_] = ((((Class387_Sub1) this).anIntArray8020[i_701_] << 8) / i_700_ * i_706_ >> 8) - (i_684_ - i_704_);
				}
			}
			method4498();
			((Class387_Sub1) this).aBoolean8043 = false;
		}
	}

	public void bl(int i) {
		int i_707_ = Class257.anIntArray2683[i];
		int i_708_ = Class257.anIntArray2684[i];
		for (int i_709_ = 0; i_709_ < ((Class387_Sub1) this).anInt8044; i_709_++) {
			int i_710_ = ((((Class387_Sub1) this).anIntArray8020[i_709_] * i_707_ + ((Class387_Sub1) this).anIntArray8065[i_709_] * i_708_) >> 14);
			((Class387_Sub1) this).anIntArray8020[i_709_] = ((((Class387_Sub1) this).anIntArray8020[i_709_] * i_708_ - ((Class387_Sub1) this).anIntArray8065[i_709_] * i_707_) >> 14);
			((Class387_Sub1) this).anIntArray8065[i_709_] = i_710_;
		}
		method4498();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public int cg() {
		return ((Class387_Sub1) this).aShort8015;
	}

	public void da(short i, short i_711_) {
		for (int i_712_ = 0; i_712_ < ((Class387_Sub1) this).anInt8034; i_712_++) {
			if (((Class387_Sub1) this).modelColors[i_712_] == i)
				((Class387_Sub1) this).modelColors[i_712_] = i_711_;
		}
		if (((Class387_Sub1) this).aClass185Array8070 != null) {
			for (int i_713_ = 0; i_713_ < ((Class387_Sub1) this).anInt8069; i_713_++) {
				Class185 class185 = ((Class387_Sub1) this).aClass185Array8070[i_713_];
				Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_713_];
				((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | ((Console.colorArray[(((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		method4507();
	}

	public byte[] dg() {
		return ((Class387_Sub1) this).aByteArray8037;
	}

	public void be(int i, int i_714_, int i_715_) {
		for (int i_716_ = 0; i_716_ < ((Class387_Sub1) this).anInt8044; i_716_++) {
			if (i != 128)
				((Class387_Sub1) this).anIntArray8065[i_716_] = ((Class387_Sub1) this).anIntArray8065[i_716_] * i >> 7;
			if (i_714_ != 128)
				((Class387_Sub1) this).anIntArray8020[i_716_] = (((Class387_Sub1) this).anIntArray8020[i_716_] * i_714_ >> 7);
			if (i_715_ != 128)
				((Class387_Sub1) this).anIntArray8051[i_716_] = (((Class387_Sub1) this).anIntArray8051[i_716_] * i_715_ >> 7);
		}
		method4498();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public void method4479() {
		if (((Class387_Sub1) this).anInt8038 > 0 && ((Class387_Sub1) this).anInt8035 > 0) {
			method4512();
			method4504();
			method4510();
		}
	}

	public int cw() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8057;
	}

	void e(int i, int[] is, int i_717_, int i_718_, int i_719_, boolean bool, int i_720_, int[] is_721_) {
		int i_722_ = is.length;
		if (i == 0) {
			i_717_ <<= 4;
			i_718_ <<= 4;
			i_719_ <<= 4;
			int i_723_ = 0;
			((Class387_Sub1) this).anInt8080 = 0;
			((Class387_Sub1) this).anInt8061 = 0;
			((Class387_Sub1) this).anInt8055 = 0;
			for (int i_724_ = 0; i_724_ < i_722_; i_724_++) {
				int i_725_ = is[i_724_];
				if (i_725_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_726_ = ((Class387_Sub1) this).anIntArrayArray8022[i_725_];
					for (int i_727_ = 0; i_727_ < is_726_.length; i_727_++) {
						int i_728_ = is_726_[i_727_];
						if (((Class387_Sub1) this).aShortArray8023 == null || (i_720_ & (((Class387_Sub1) this).aShortArray8023[i_728_])) != 0) {
							((Class387_Sub1) this).anInt8080 += (((Class387_Sub1) this).anIntArray8065[i_728_]);
							((Class387_Sub1) this).anInt8061 += (((Class387_Sub1) this).anIntArray8020[i_728_]);
							((Class387_Sub1) this).anInt8055 += (((Class387_Sub1) this).anIntArray8051[i_728_]);
							i_723_++;
						}
					}
				}
			}
			if (i_723_ > 0) {
				((Class387_Sub1) this).anInt8080 = ((Class387_Sub1) this).anInt8080 / i_723_ + i_717_;
				((Class387_Sub1) this).anInt8061 = ((Class387_Sub1) this).anInt8061 / i_723_ + i_718_;
				((Class387_Sub1) this).anInt8055 = ((Class387_Sub1) this).anInt8055 / i_723_ + i_719_;
				((Class387_Sub1) this).aBoolean8048 = true;
			} else {
				((Class387_Sub1) this).anInt8080 = i_717_;
				((Class387_Sub1) this).anInt8061 = i_718_;
				((Class387_Sub1) this).anInt8055 = i_719_;
			}
		} else if (i == 1) {
			if (is_721_ != null) {
				int i_729_ = ((is_721_[0] * i_717_ + is_721_[1] * i_718_ + is_721_[2] * i_719_ + 8192) >> 14);
				int i_730_ = ((is_721_[3] * i_717_ + is_721_[4] * i_718_ + is_721_[5] * i_719_ + 8192) >> 14);
				int i_731_ = ((is_721_[6] * i_717_ + is_721_[7] * i_718_ + is_721_[8] * i_719_ + 8192) >> 14);
				i_717_ = i_729_;
				i_718_ = i_730_;
				i_719_ = i_731_;
			}
			i_717_ <<= 4;
			i_718_ <<= 4;
			i_719_ <<= 4;
			for (int i_732_ = 0; i_732_ < i_722_; i_732_++) {
				int i_733_ = is[i_732_];
				if (i_733_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_734_ = ((Class387_Sub1) this).anIntArrayArray8022[i_733_];
					for (int i_735_ = 0; i_735_ < is_734_.length; i_735_++) {
						int i_736_ = is_734_[i_735_];
						if (((Class387_Sub1) this).aShortArray8023 == null || (i_720_ & (((Class387_Sub1) this).aShortArray8023[i_736_])) != 0) {
							((Class387_Sub1) this).anIntArray8065[i_736_] += i_717_;
							((Class387_Sub1) this).anIntArray8020[i_736_] += i_718_;
							((Class387_Sub1) this).anIntArray8051[i_736_] += i_719_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_721_ != null) {
				int i_737_ = is_721_[9] << 4;
				int i_738_ = is_721_[10] << 4;
				int i_739_ = is_721_[11] << 4;
				int i_740_ = is_721_[12] << 4;
				int i_741_ = is_721_[13] << 4;
				int i_742_ = is_721_[14] << 4;
				if (((Class387_Sub1) this).aBoolean8048) {
					int i_743_ = ((is_721_[0] * ((Class387_Sub1) this).anInt8080 + is_721_[3] * ((Class387_Sub1) this).anInt8061 + is_721_[6] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					int i_744_ = ((is_721_[1] * ((Class387_Sub1) this).anInt8080 + is_721_[4] * ((Class387_Sub1) this).anInt8061 + is_721_[7] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					int i_745_ = ((is_721_[2] * ((Class387_Sub1) this).anInt8080 + is_721_[5] * ((Class387_Sub1) this).anInt8061 + is_721_[8] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					i_743_ += i_740_;
					i_744_ += i_741_;
					i_745_ += i_742_;
					((Class387_Sub1) this).anInt8080 = i_743_;
					((Class387_Sub1) this).anInt8061 = i_744_;
					((Class387_Sub1) this).anInt8055 = i_745_;
					((Class387_Sub1) this).aBoolean8048 = false;
				}
				int[] is_746_ = new int[9];
				int i_747_ = Class257.anIntArray2684[i_717_];
				int i_748_ = Class257.anIntArray2683[i_717_];
				int i_749_ = Class257.anIntArray2684[i_718_];
				int i_750_ = Class257.anIntArray2683[i_718_];
				int i_751_ = Class257.anIntArray2684[i_719_];
				int i_752_ = Class257.anIntArray2683[i_719_];
				int i_753_ = i_748_ * i_751_ + 8192 >> 14;
				int i_754_ = i_748_ * i_752_ + 8192 >> 14;
				is_746_[0] = i_749_ * i_751_ + i_750_ * i_754_ + 8192 >> 14;
				is_746_[1] = -i_749_ * i_752_ + i_750_ * i_753_ + 8192 >> 14;
				is_746_[2] = i_750_ * i_747_ + 8192 >> 14;
				is_746_[3] = i_747_ * i_752_ + 8192 >> 14;
				is_746_[4] = i_747_ * i_751_ + 8192 >> 14;
				is_746_[5] = -i_748_;
				is_746_[6] = -i_750_ * i_751_ + i_749_ * i_754_ + 8192 >> 14;
				is_746_[7] = i_750_ * i_752_ + i_749_ * i_753_ + 8192 >> 14;
				is_746_[8] = i_749_ * i_747_ + 8192 >> 14;
				int i_755_ = ((is_746_[0] * -((Class387_Sub1) this).anInt8080 + is_746_[1] * -((Class387_Sub1) this).anInt8061 + is_746_[2] * -((Class387_Sub1) this).anInt8055 + 8192) >> 14);
				int i_756_ = ((is_746_[3] * -((Class387_Sub1) this).anInt8080 + is_746_[4] * -((Class387_Sub1) this).anInt8061 + is_746_[5] * -((Class387_Sub1) this).anInt8055 + 8192) >> 14);
				int i_757_ = ((is_746_[6] * -((Class387_Sub1) this).anInt8080 + is_746_[7] * -((Class387_Sub1) this).anInt8061 + is_746_[8] * -((Class387_Sub1) this).anInt8055 + 8192) >> 14);
				int i_758_ = i_755_ + ((Class387_Sub1) this).anInt8080;
				int i_759_ = i_756_ + ((Class387_Sub1) this).anInt8061;
				int i_760_ = i_757_ + ((Class387_Sub1) this).anInt8055;
				int[] is_761_ = new int[9];
				for (int i_762_ = 0; i_762_ < 3; i_762_++) {
					for (int i_763_ = 0; i_763_ < 3; i_763_++) {
						int i_764_ = 0;
						for (int i_765_ = 0; i_765_ < 3; i_765_++)
							i_764_ += (is_746_[i_762_ * 3 + i_765_] * is_721_[i_763_ * 3 + i_765_]);
						is_761_[i_762_ * 3 + i_763_] = i_764_ + 8192 >> 14;
					}
				}
				int i_766_ = ((is_746_[0] * i_740_ + is_746_[1] * i_741_ + is_746_[2] * i_742_ + 8192) >> 14);
				int i_767_ = ((is_746_[3] * i_740_ + is_746_[4] * i_741_ + is_746_[5] * i_742_ + 8192) >> 14);
				int i_768_ = ((is_746_[6] * i_740_ + is_746_[7] * i_741_ + is_746_[8] * i_742_ + 8192) >> 14);
				i_766_ += i_758_;
				i_767_ += i_759_;
				i_768_ += i_760_;
				int[] is_769_ = new int[9];
				for (int i_770_ = 0; i_770_ < 3; i_770_++) {
					for (int i_771_ = 0; i_771_ < 3; i_771_++) {
						int i_772_ = 0;
						for (int i_773_ = 0; i_773_ < 3; i_773_++)
							i_772_ += (is_721_[i_770_ * 3 + i_773_] * is_761_[i_771_ + i_773_ * 3]);
						is_769_[i_770_ * 3 + i_771_] = i_772_ + 8192 >> 14;
					}
				}
				int i_774_ = ((is_721_[0] * i_766_ + is_721_[1] * i_767_ + is_721_[2] * i_768_ + 8192) >> 14);
				int i_775_ = ((is_721_[3] * i_766_ + is_721_[4] * i_767_ + is_721_[5] * i_768_ + 8192) >> 14);
				int i_776_ = ((is_721_[6] * i_766_ + is_721_[7] * i_767_ + is_721_[8] * i_768_ + 8192) >> 14);
				i_774_ += i_737_;
				i_775_ += i_738_;
				i_776_ += i_739_;
				for (int i_777_ = 0; i_777_ < i_722_; i_777_++) {
					int i_778_ = is[i_777_];
					if (i_778_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_779_ = (((Class387_Sub1) this).anIntArrayArray8022[i_778_]);
						for (int i_780_ = 0; i_780_ < is_779_.length; i_780_++) {
							int i_781_ = is_779_[i_780_];
							if (((Class387_Sub1) this).aShortArray8023 == null || ((i_720_ & (((Class387_Sub1) this).aShortArray8023[i_781_])) != 0)) {
								int i_782_ = (is_769_[0] * (((Class387_Sub1) this).anIntArray8065[i_781_]) + is_769_[1] * (((Class387_Sub1) this).anIntArray8020[i_781_]) + is_769_[2] * (((Class387_Sub1) this).anIntArray8051[i_781_]) + 8192) >> 14;
								int i_783_ = (is_769_[3] * (((Class387_Sub1) this).anIntArray8065[i_781_]) + is_769_[4] * (((Class387_Sub1) this).anIntArray8020[i_781_]) + is_769_[5] * (((Class387_Sub1) this).anIntArray8051[i_781_]) + 8192) >> 14;
								int i_784_ = (is_769_[6] * (((Class387_Sub1) this).anIntArray8065[i_781_]) + is_769_[7] * (((Class387_Sub1) this).anIntArray8020[i_781_]) + is_769_[8] * (((Class387_Sub1) this).anIntArray8051[i_781_]) + 8192) >> 14;
								i_782_ += i_774_;
								i_783_ += i_775_;
								i_784_ += i_776_;
								((Class387_Sub1) this).anIntArray8065[i_781_] = i_782_;
								((Class387_Sub1) this).anIntArray8020[i_781_] = i_783_;
								((Class387_Sub1) this).anIntArray8051[i_781_] = i_784_;
							}
						}
					}
				}
			} else {
				for (int i_785_ = 0; i_785_ < i_722_; i_785_++) {
					int i_786_ = is[i_785_];
					if (i_786_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_787_ = (((Class387_Sub1) this).anIntArrayArray8022[i_786_]);
						for (int i_788_ = 0; i_788_ < is_787_.length; i_788_++) {
							int i_789_ = is_787_[i_788_];
							if (((Class387_Sub1) this).aShortArray8023 == null || ((i_720_ & (((Class387_Sub1) this).aShortArray8023[i_789_])) != 0)) {
								((Class387_Sub1) this).anIntArray8065[i_789_] -= ((Class387_Sub1) this).anInt8080;
								((Class387_Sub1) this).anIntArray8020[i_789_] -= ((Class387_Sub1) this).anInt8061;
								((Class387_Sub1) this).anIntArray8051[i_789_] -= ((Class387_Sub1) this).anInt8055;
								if (i_719_ != 0) {
									int i_790_ = Class257.anIntArray2683[i_719_];
									int i_791_ = Class257.anIntArray2684[i_719_];
									int i_792_ = ((((Class387_Sub1) this).anIntArray8020[i_789_]) * i_790_ + (((Class387_Sub1) this).anIntArray8065[i_789_]) * i_791_ + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8020[i_789_] = ((((Class387_Sub1) this).anIntArray8020[i_789_]) * i_791_ - (((Class387_Sub1) this).anIntArray8065[i_789_]) * i_790_ + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8065[i_789_] = i_792_;
								}
								if (i_717_ != 0) {
									int i_793_ = Class257.anIntArray2683[i_717_];
									int i_794_ = Class257.anIntArray2684[i_717_];
									int i_795_ = ((((Class387_Sub1) this).anIntArray8020[i_789_]) * i_794_ - (((Class387_Sub1) this).anIntArray8051[i_789_]) * i_793_ + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8051[i_789_] = ((((Class387_Sub1) this).anIntArray8020[i_789_]) * i_793_ + (((Class387_Sub1) this).anIntArray8051[i_789_]) * i_794_ + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8020[i_789_] = i_795_;
								}
								if (i_718_ != 0) {
									int i_796_ = Class257.anIntArray2683[i_718_];
									int i_797_ = Class257.anIntArray2684[i_718_];
									int i_798_ = ((((Class387_Sub1) this).anIntArray8051[i_789_]) * i_796_ + (((Class387_Sub1) this).anIntArray8065[i_789_]) * i_797_ + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8051[i_789_] = ((((Class387_Sub1) this).anIntArray8051[i_789_]) * i_797_ - (((Class387_Sub1) this).anIntArray8065[i_789_]) * i_796_ + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8065[i_789_] = i_798_;
								}
								((Class387_Sub1) this).anIntArray8065[i_789_] += ((Class387_Sub1) this).anInt8080;
								((Class387_Sub1) this).anIntArray8020[i_789_] += ((Class387_Sub1) this).anInt8061;
								((Class387_Sub1) this).anIntArray8051[i_789_] += ((Class387_Sub1) this).anInt8055;
							}
						}
					}
				}
				if (bool) {
					for (int i_799_ = 0; i_799_ < i_722_; i_799_++) {
						int i_800_ = is[i_799_];
						if (i_800_ < (((Class387_Sub1) this).anIntArrayArray8022).length) {
							int[] is_801_ = (((Class387_Sub1) this).anIntArrayArray8022[i_800_]);
							for (int i_802_ = 0; i_802_ < is_801_.length; i_802_++) {
								int i_803_ = is_801_[i_802_];
								if ((((Class387_Sub1) this).aShortArray8023 == null) || ((i_720_ & (((Class387_Sub1) this).aShortArray8023[i_803_])) != 0)) {
									int i_804_ = (((Class387_Sub1) this).anIntArray8082[i_803_]);
									int i_805_ = (((Class387_Sub1) this).anIntArray8082[i_803_ + 1]);
									for (int i_806_ = i_804_; i_806_ < i_805_; i_806_++) {
										int i_807_ = ((((Class387_Sub1) this).aShortArray8052[i_806_]) - 1);
										if (i_807_ == -1)
											break;
										if (i_719_ != 0) {
											int i_808_ = (Class257.anIntArray2683[i_719_]);
											int i_809_ = (Class257.anIntArray2684[i_719_]);
											int i_810_ = ((((((Class387_Sub1) this).aShortArray8028[i_807_]) * i_808_) + (((Class387_Sub1) this).aShortArray8032[i_807_]) * i_809_ + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8028[i_807_] = (short) (((((Class387_Sub1) this).aShortArray8028[i_807_]) * i_809_ - (((Class387_Sub1) this).aShortArray8032[i_807_]) * i_808_ + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8032[i_807_] = (short) i_810_;
										}
										if (i_717_ != 0) {
											int i_811_ = (Class257.anIntArray2683[i_717_]);
											int i_812_ = (Class257.anIntArray2684[i_717_]);
											int i_813_ = ((((((Class387_Sub1) this).aShortArray8028[i_807_]) * i_812_) - (((Class387_Sub1) this).aShortArray8024[i_807_]) * i_811_ + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8024[i_807_] = (short) (((((Class387_Sub1) this).aShortArray8028[i_807_]) * i_811_ + (((Class387_Sub1) this).aShortArray8024[i_807_]) * i_812_ + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8028[i_807_] = (short) i_813_;
										}
										if (i_718_ != 0) {
											int i_814_ = (Class257.anIntArray2683[i_718_]);
											int i_815_ = (Class257.anIntArray2684[i_718_]);
											int i_816_ = ((((((Class387_Sub1) this).aShortArray8024[i_807_]) * i_814_) + (((Class387_Sub1) this).aShortArray8032[i_807_]) * i_815_ + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8024[i_807_] = (short) (((((Class387_Sub1) this).aShortArray8024[i_807_]) * i_815_ - (((Class387_Sub1) this).aShortArray8032[i_807_]) * i_814_ + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8032[i_807_] = (short) i_816_;
										}
									}
								}
							}
						}
					}
					method4499();
				}
			}
		} else if (i == 3) {
			if (is_721_ != null) {
				int i_817_ = is_721_[9] << 4;
				int i_818_ = is_721_[10] << 4;
				int i_819_ = is_721_[11] << 4;
				int i_820_ = is_721_[12] << 4;
				int i_821_ = is_721_[13] << 4;
				int i_822_ = is_721_[14] << 4;
				if (((Class387_Sub1) this).aBoolean8048) {
					int i_823_ = ((is_721_[0] * ((Class387_Sub1) this).anInt8080 + is_721_[3] * ((Class387_Sub1) this).anInt8061 + is_721_[6] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					int i_824_ = ((is_721_[1] * ((Class387_Sub1) this).anInt8080 + is_721_[4] * ((Class387_Sub1) this).anInt8061 + is_721_[7] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					int i_825_ = ((is_721_[2] * ((Class387_Sub1) this).anInt8080 + is_721_[5] * ((Class387_Sub1) this).anInt8061 + is_721_[8] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					i_823_ += i_820_;
					i_824_ += i_821_;
					i_825_ += i_822_;
					((Class387_Sub1) this).anInt8080 = i_823_;
					((Class387_Sub1) this).anInt8061 = i_824_;
					((Class387_Sub1) this).anInt8055 = i_825_;
					((Class387_Sub1) this).aBoolean8048 = false;
				}
				int i_826_ = i_717_ << 15 >> 7;
				int i_827_ = i_718_ << 15 >> 7;
				int i_828_ = i_719_ << 15 >> 7;
				int i_829_ = i_826_ * -((Class387_Sub1) this).anInt8080 + 8192 >> 14;
				int i_830_ = i_827_ * -((Class387_Sub1) this).anInt8061 + 8192 >> 14;
				int i_831_ = i_828_ * -((Class387_Sub1) this).anInt8055 + 8192 >> 14;
				int i_832_ = i_829_ + ((Class387_Sub1) this).anInt8080;
				int i_833_ = i_830_ + ((Class387_Sub1) this).anInt8061;
				int i_834_ = i_831_ + ((Class387_Sub1) this).anInt8055;
				int[] is_835_ = new int[9];
				is_835_[0] = i_826_ * is_721_[0] + 8192 >> 14;
				is_835_[1] = i_826_ * is_721_[3] + 8192 >> 14;
				is_835_[2] = i_826_ * is_721_[6] + 8192 >> 14;
				is_835_[3] = i_827_ * is_721_[1] + 8192 >> 14;
				is_835_[4] = i_827_ * is_721_[4] + 8192 >> 14;
				is_835_[5] = i_827_ * is_721_[7] + 8192 >> 14;
				is_835_[6] = i_828_ * is_721_[2] + 8192 >> 14;
				is_835_[7] = i_828_ * is_721_[5] + 8192 >> 14;
				is_835_[8] = i_828_ * is_721_[8] + 8192 >> 14;
				int i_836_ = i_826_ * i_820_ + 8192 >> 14;
				int i_837_ = i_827_ * i_821_ + 8192 >> 14;
				int i_838_ = i_828_ * i_822_ + 8192 >> 14;
				i_836_ += i_832_;
				i_837_ += i_833_;
				i_838_ += i_834_;
				int[] is_839_ = new int[9];
				for (int i_840_ = 0; i_840_ < 3; i_840_++) {
					for (int i_841_ = 0; i_841_ < 3; i_841_++) {
						int i_842_ = 0;
						for (int i_843_ = 0; i_843_ < 3; i_843_++)
							i_842_ += (is_721_[i_840_ * 3 + i_843_] * is_835_[i_841_ + i_843_ * 3]);
						is_839_[i_840_ * 3 + i_841_] = i_842_ + 8192 >> 14;
					}
				}
				int i_844_ = ((is_721_[0] * i_836_ + is_721_[1] * i_837_ + is_721_[2] * i_838_ + 8192) >> 14);
				int i_845_ = ((is_721_[3] * i_836_ + is_721_[4] * i_837_ + is_721_[5] * i_838_ + 8192) >> 14);
				int i_846_ = ((is_721_[6] * i_836_ + is_721_[7] * i_837_ + is_721_[8] * i_838_ + 8192) >> 14);
				i_844_ += i_817_;
				i_845_ += i_818_;
				i_846_ += i_819_;
				for (int i_847_ = 0; i_847_ < i_722_; i_847_++) {
					int i_848_ = is[i_847_];
					if (i_848_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_849_ = (((Class387_Sub1) this).anIntArrayArray8022[i_848_]);
						for (int i_850_ = 0; i_850_ < is_849_.length; i_850_++) {
							int i_851_ = is_849_[i_850_];
							if (((Class387_Sub1) this).aShortArray8023 == null || ((i_720_ & (((Class387_Sub1) this).aShortArray8023[i_851_])) != 0)) {
								int i_852_ = (is_839_[0] * (((Class387_Sub1) this).anIntArray8065[i_851_]) + is_839_[1] * (((Class387_Sub1) this).anIntArray8020[i_851_]) + is_839_[2] * (((Class387_Sub1) this).anIntArray8051[i_851_]) + 8192) >> 14;
								int i_853_ = (is_839_[3] * (((Class387_Sub1) this).anIntArray8065[i_851_]) + is_839_[4] * (((Class387_Sub1) this).anIntArray8020[i_851_]) + is_839_[5] * (((Class387_Sub1) this).anIntArray8051[i_851_]) + 8192) >> 14;
								int i_854_ = (is_839_[6] * (((Class387_Sub1) this).anIntArray8065[i_851_]) + is_839_[7] * (((Class387_Sub1) this).anIntArray8020[i_851_]) + is_839_[8] * (((Class387_Sub1) this).anIntArray8051[i_851_]) + 8192) >> 14;
								i_852_ += i_844_;
								i_853_ += i_845_;
								i_854_ += i_846_;
								((Class387_Sub1) this).anIntArray8065[i_851_] = i_852_;
								((Class387_Sub1) this).anIntArray8020[i_851_] = i_853_;
								((Class387_Sub1) this).anIntArray8051[i_851_] = i_854_;
							}
						}
					}
				}
			} else {
				for (int i_855_ = 0; i_855_ < i_722_; i_855_++) {
					int i_856_ = is[i_855_];
					if (i_856_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_857_ = (((Class387_Sub1) this).anIntArrayArray8022[i_856_]);
						for (int i_858_ = 0; i_858_ < is_857_.length; i_858_++) {
							int i_859_ = is_857_[i_858_];
							if (((Class387_Sub1) this).aShortArray8023 == null || ((i_720_ & (((Class387_Sub1) this).aShortArray8023[i_859_])) != 0)) {
								((Class387_Sub1) this).anIntArray8065[i_859_] -= ((Class387_Sub1) this).anInt8080;
								((Class387_Sub1) this).anIntArray8020[i_859_] -= ((Class387_Sub1) this).anInt8061;
								((Class387_Sub1) this).anIntArray8051[i_859_] -= ((Class387_Sub1) this).anInt8055;
								((Class387_Sub1) this).anIntArray8065[i_859_] = (((Class387_Sub1) this).anIntArray8065[i_859_]) * i_717_ >> 7;
								((Class387_Sub1) this).anIntArray8020[i_859_] = (((Class387_Sub1) this).anIntArray8020[i_859_]) * i_718_ >> 7;
								((Class387_Sub1) this).anIntArray8051[i_859_] = (((Class387_Sub1) this).anIntArray8051[i_859_]) * i_719_ >> 7;
								((Class387_Sub1) this).anIntArray8065[i_859_] += ((Class387_Sub1) this).anInt8080;
								((Class387_Sub1) this).anIntArray8020[i_859_] += ((Class387_Sub1) this).anInt8061;
								((Class387_Sub1) this).anIntArray8051[i_859_] += ((Class387_Sub1) this).anInt8055;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub1) this).anIntArrayArray8017 != null) {
				boolean bool_860_ = false;
				for (int i_861_ = 0; i_861_ < i_722_; i_861_++) {
					int i_862_ = is[i_861_];
					if (i_862_ < ((Class387_Sub1) this).anIntArrayArray8017.length) {
						int[] is_863_ = (((Class387_Sub1) this).anIntArrayArray8017[i_862_]);
						for (int i_864_ = 0; i_864_ < is_863_.length; i_864_++) {
							int i_865_ = is_863_[i_864_];
							if (((Class387_Sub1) this).aShortArray8018 == null || ((i_720_ & (((Class387_Sub1) this).aShortArray8018[i_865_])) != 0)) {
								int i_866_ = (((((Class387_Sub1) this).aByteArray8037[i_865_]) & 0xff) + i_717_ * 8);
								if (i_866_ < 0)
									i_866_ = 0;
								else if (i_866_ > 255)
									i_866_ = 255;
								((Class387_Sub1) this).aByteArray8037[i_865_] = (byte) i_866_;
							}
						}
						bool_860_ = bool_860_ | is_863_.length > 0;
					}
				}
				if (bool_860_) {
					if (((Class387_Sub1) this).aClass185Array8070 != null) {
						for (int i_867_ = 0; i_867_ < ((Class387_Sub1) this).anInt8069; i_867_++) {
							Class185 class185 = (((Class387_Sub1) this).aClass185Array8070[i_867_]);
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[i_867_]);
							((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & 0xffffff | 255 - ((((Class387_Sub1) this).aByteArray8037[((Class185) class185).modelColorIndex]) & 0xff) << 24);
						}
					}
					method4507();
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub1) this).anIntArrayArray8017 != null) {
				boolean bool_868_ = false;
				for (int i_869_ = 0; i_869_ < i_722_; i_869_++) {
					int i_870_ = is[i_869_];
					if (i_870_ < ((Class387_Sub1) this).anIntArrayArray8017.length) {
						int[] is_871_ = (((Class387_Sub1) this).anIntArrayArray8017[i_870_]);
						for (int i_872_ = 0; i_872_ < is_871_.length; i_872_++) {
							int i_873_ = is_871_[i_872_];
							if (((Class387_Sub1) this).aShortArray8018 == null || ((i_720_ & (((Class387_Sub1) this).aShortArray8018[i_873_])) != 0)) {
								int i_874_ = ((((Class387_Sub1) this).modelColors[i_873_]) & 0xffff);
								int i_875_ = i_874_ >> 10 & 0x3f;
								int i_876_ = i_874_ >> 7 & 0x7;
								int i_877_ = i_874_ & 0x7f;
								i_875_ = i_875_ + i_717_ & 0x3f;
								i_876_ += i_718_ / 4;
								if (i_876_ < 0)
									i_876_ = 0;
								else if (i_876_ > 7)
									i_876_ = 7;
								i_877_ += i_719_;
								if (i_877_ < 0)
									i_877_ = 0;
								else if (i_877_ > 127)
									i_877_ = 127;
								((Class387_Sub1) this).modelColors[i_873_] = (short) (i_875_ << 10 | i_876_ << 7 | i_877_);
							}
						}
						bool_868_ = bool_868_ | is_871_.length > 0;
					}
				}
				if (bool_868_) {
					if (((Class387_Sub1) this).aClass185Array8070 != null) {
						for (int i_878_ = 0; i_878_ < ((Class387_Sub1) this).anInt8069; i_878_++) {
							Class185 class185 = (((Class387_Sub1) this).aClass185Array8070[i_878_]);
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[i_878_]);
							((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | (Console.colorArray[((((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff)]) & 0xffffff);
						}
					}
					method4507();
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_879_ = 0; i_879_ < i_722_; i_879_++) {
					int i_880_ = is[i_879_];
					if (i_880_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_881_ = (((Class387_Sub1) this).anIntArrayArray8072[i_880_]);
						for (int i_882_ = 0; i_882_ < is_881_.length; i_882_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_881_[i_882_]]);
							((Class177) class177).anInt1751 += i_717_;
							((Class177) class177).anInt1748 += i_718_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_883_ = 0; i_883_ < i_722_; i_883_++) {
					int i_884_ = is[i_883_];
					if (i_884_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_885_ = (((Class387_Sub1) this).anIntArrayArray8072[i_884_]);
						for (int i_886_ = 0; i_886_ < is_885_.length; i_886_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_885_[i_886_]]);
							((Class177) class177).anInt1752 = (((Class177) class177).anInt1752 * i_717_ >> 7);
							((Class177) class177).anInt1749 = (((Class177) class177).anInt1749 * i_718_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_887_ = 0; i_887_ < i_722_; i_887_++) {
					int i_888_ = is[i_887_];
					if (i_888_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_889_ = (((Class387_Sub1) this).anIntArrayArray8072[i_888_]);
						for (int i_890_ = 0; i_890_ < is_889_.length; i_890_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_889_[i_890_]]);
							((Class177) class177).anInt1753 = (((Class177) class177).anInt1753 + i_717_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public void dj(short i, short i_891_) {
		Interface_ma interface_ma = ((Class387_Sub1) this).aClass_ra_Sub2_8012.anInterface_ma4227;
		for (int i_892_ = 0; i_892_ < ((Class387_Sub1) this).anInt8034; i_892_++) {
			if (((Class387_Sub1) this).modelTextures[i_892_] == i)
				((Class387_Sub1) this).modelTextures[i_892_] = i_891_;
		}
		byte i_893_ = 0;
		byte i_894_ = 0;
		if (i != -1) {
			Class56 class56 = interface_ma.method221(i & 0xffff, 1227065629);
			i_893_ = class56.aByte529;
			i_894_ = class56.aByte534;
		}
		byte i_895_ = 0;
		byte i_896_ = 0;
		if (i_891_ != -1) {
			Class56 class56 = interface_ma.method221(i_891_ & 0xffff, -676681102);
			i_895_ = class56.aByte529;
			i_896_ = class56.aByte534;
			if (class56.aByte531 != 0 || class56.aByte530 != 0)
				((Class387_Sub1) this).aBoolean8042 = true;
		}
		if (i_893_ != i_895_ | i_894_ != i_896_) {
			if (((Class387_Sub1) this).aClass185Array8070 != null) {
				for (int i_897_ = 0; i_897_ < ((Class387_Sub1) this).anInt8069; i_897_++) {
					Class185 class185 = ((Class387_Sub1) this).aClass185Array8070[i_897_];
					Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_897_];
					((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | ((Console.colorArray[(((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff]) & 0xffffff));
				}
			}
			method4507();
		}
	}

	void method4474(int i, int[] is, int i_898_, int i_899_, int i_900_, int i_901_, boolean bool) {
		int i_902_ = is.length;
		if (i == 0) {
			i_898_ <<= 4;
			i_899_ <<= 4;
			i_900_ <<= 4;
			int i_903_ = 0;
			((Class387_Sub1) this).anInt8080 = 0;
			((Class387_Sub1) this).anInt8061 = 0;
			((Class387_Sub1) this).anInt8055 = 0;
			for (int i_904_ = 0; i_904_ < i_902_; i_904_++) {
				int i_905_ = is[i_904_];
				if (i_905_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_906_ = ((Class387_Sub1) this).anIntArrayArray8022[i_905_];
					for (int i_907_ = 0; i_907_ < is_906_.length; i_907_++) {
						int i_908_ = is_906_[i_907_];
						((Class387_Sub1) this).anInt8080 += ((Class387_Sub1) this).anIntArray8065[i_908_];
						((Class387_Sub1) this).anInt8061 += ((Class387_Sub1) this).anIntArray8020[i_908_];
						((Class387_Sub1) this).anInt8055 += ((Class387_Sub1) this).anIntArray8051[i_908_];
						i_903_++;
					}
				}
			}
			if (i_903_ > 0) {
				((Class387_Sub1) this).anInt8080 = ((Class387_Sub1) this).anInt8080 / i_903_ + i_898_;
				((Class387_Sub1) this).anInt8061 = ((Class387_Sub1) this).anInt8061 / i_903_ + i_899_;
				((Class387_Sub1) this).anInt8055 = ((Class387_Sub1) this).anInt8055 / i_903_ + i_900_;
			} else {
				((Class387_Sub1) this).anInt8080 = i_898_;
				((Class387_Sub1) this).anInt8061 = i_899_;
				((Class387_Sub1) this).anInt8055 = i_900_;
			}
		} else if (i == 1) {
			i_898_ <<= 4;
			i_899_ <<= 4;
			i_900_ <<= 4;
			for (int i_909_ = 0; i_909_ < i_902_; i_909_++) {
				int i_910_ = is[i_909_];
				if (i_910_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_911_ = ((Class387_Sub1) this).anIntArrayArray8022[i_910_];
					for (int i_912_ = 0; i_912_ < is_911_.length; i_912_++) {
						int i_913_ = is_911_[i_912_];
						((Class387_Sub1) this).anIntArray8065[i_913_] += i_898_;
						((Class387_Sub1) this).anIntArray8020[i_913_] += i_899_;
						((Class387_Sub1) this).anIntArray8051[i_913_] += i_900_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_914_ = 0; i_914_ < i_902_; i_914_++) {
				int i_915_ = is[i_914_];
				if (i_915_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_916_ = ((Class387_Sub1) this).anIntArrayArray8022[i_915_];
					if ((i_901_ & 0x1) == 0) {
						for (int i_917_ = 0; i_917_ < is_916_.length; i_917_++) {
							int i_918_ = is_916_[i_917_];
							((Class387_Sub1) this).anIntArray8065[i_918_] -= ((Class387_Sub1) this).anInt8080;
							((Class387_Sub1) this).anIntArray8020[i_918_] -= ((Class387_Sub1) this).anInt8061;
							((Class387_Sub1) this).anIntArray8051[i_918_] -= ((Class387_Sub1) this).anInt8055;
							if (i_900_ != 0) {
								int i_919_ = Class257.anIntArray2683[i_900_];
								int i_920_ = Class257.anIntArray2684[i_900_];
								int i_921_ = (((((Class387_Sub1) this).anIntArray8020[i_918_]) * i_919_ + (((Class387_Sub1) this).anIntArray8065[i_918_]) * i_920_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8020[i_918_] = ((((Class387_Sub1) this).anIntArray8020[i_918_]) * i_920_ - (((Class387_Sub1) this).anIntArray8065[i_918_]) * i_919_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8065[i_918_] = i_921_;
							}
							if (i_898_ != 0) {
								int i_922_ = Class257.anIntArray2683[i_898_];
								int i_923_ = Class257.anIntArray2684[i_898_];
								int i_924_ = (((((Class387_Sub1) this).anIntArray8020[i_918_]) * i_923_ - (((Class387_Sub1) this).anIntArray8051[i_918_]) * i_922_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8051[i_918_] = ((((Class387_Sub1) this).anIntArray8020[i_918_]) * i_922_ + (((Class387_Sub1) this).anIntArray8051[i_918_]) * i_923_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8020[i_918_] = i_924_;
							}
							if (i_899_ != 0) {
								int i_925_ = Class257.anIntArray2683[i_899_];
								int i_926_ = Class257.anIntArray2684[i_899_];
								int i_927_ = (((((Class387_Sub1) this).anIntArray8051[i_918_]) * i_925_ + (((Class387_Sub1) this).anIntArray8065[i_918_]) * i_926_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8051[i_918_] = ((((Class387_Sub1) this).anIntArray8051[i_918_]) * i_926_ - (((Class387_Sub1) this).anIntArray8065[i_918_]) * i_925_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8065[i_918_] = i_927_;
							}
							((Class387_Sub1) this).anIntArray8065[i_918_] += ((Class387_Sub1) this).anInt8080;
							((Class387_Sub1) this).anIntArray8020[i_918_] += ((Class387_Sub1) this).anInt8061;
							((Class387_Sub1) this).anIntArray8051[i_918_] += ((Class387_Sub1) this).anInt8055;
						}
					} else {
						for (int i_928_ = 0; i_928_ < is_916_.length; i_928_++) {
							int i_929_ = is_916_[i_928_];
							((Class387_Sub1) this).anIntArray8065[i_929_] -= ((Class387_Sub1) this).anInt8080;
							((Class387_Sub1) this).anIntArray8020[i_929_] -= ((Class387_Sub1) this).anInt8061;
							((Class387_Sub1) this).anIntArray8051[i_929_] -= ((Class387_Sub1) this).anInt8055;
							if (i_898_ != 0) {
								int i_930_ = Class257.anIntArray2683[i_898_];
								int i_931_ = Class257.anIntArray2684[i_898_];
								int i_932_ = (((((Class387_Sub1) this).anIntArray8020[i_929_]) * i_931_ - (((Class387_Sub1) this).anIntArray8051[i_929_]) * i_930_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8051[i_929_] = ((((Class387_Sub1) this).anIntArray8020[i_929_]) * i_930_ + (((Class387_Sub1) this).anIntArray8051[i_929_]) * i_931_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8020[i_929_] = i_932_;
							}
							if (i_900_ != 0) {
								int i_933_ = Class257.anIntArray2683[i_900_];
								int i_934_ = Class257.anIntArray2684[i_900_];
								int i_935_ = (((((Class387_Sub1) this).anIntArray8020[i_929_]) * i_933_ + (((Class387_Sub1) this).anIntArray8065[i_929_]) * i_934_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8020[i_929_] = ((((Class387_Sub1) this).anIntArray8020[i_929_]) * i_934_ - (((Class387_Sub1) this).anIntArray8065[i_929_]) * i_933_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8065[i_929_] = i_935_;
							}
							if (i_899_ != 0) {
								int i_936_ = Class257.anIntArray2683[i_899_];
								int i_937_ = Class257.anIntArray2684[i_899_];
								int i_938_ = (((((Class387_Sub1) this).anIntArray8051[i_929_]) * i_936_ + (((Class387_Sub1) this).anIntArray8065[i_929_]) * i_937_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8051[i_929_] = ((((Class387_Sub1) this).anIntArray8051[i_929_]) * i_937_ - (((Class387_Sub1) this).anIntArray8065[i_929_]) * i_936_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8065[i_929_] = i_938_;
							}
							((Class387_Sub1) this).anIntArray8065[i_929_] += ((Class387_Sub1) this).anInt8080;
							((Class387_Sub1) this).anIntArray8020[i_929_] += ((Class387_Sub1) this).anInt8061;
							((Class387_Sub1) this).anIntArray8051[i_929_] += ((Class387_Sub1) this).anInt8055;
						}
					}
				}
			}
			if (bool) {
				for (int i_939_ = 0; i_939_ < i_902_; i_939_++) {
					int i_940_ = is[i_939_];
					if (i_940_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_941_ = (((Class387_Sub1) this).anIntArrayArray8022[i_940_]);
						for (int i_942_ = 0; i_942_ < is_941_.length; i_942_++) {
							int i_943_ = is_941_[i_942_];
							int i_944_ = (((Class387_Sub1) this).anIntArray8082[i_943_]);
							int i_945_ = (((Class387_Sub1) this).anIntArray8082[i_943_ + 1]);
							for (int i_946_ = i_944_; i_946_ < i_945_; i_946_++) {
								int i_947_ = ((((Class387_Sub1) this).aShortArray8052[i_946_]) - 1);
								if (i_947_ == -1)
									break;
								if (i_900_ != 0) {
									int i_948_ = Class257.anIntArray2683[i_900_];
									int i_949_ = Class257.anIntArray2684[i_900_];
									int i_950_ = (((((Class387_Sub1) this).aShortArray8028[i_947_]) * i_948_ + ((((Class387_Sub1) this).aShortArray8032[i_947_]) * i_949_) + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8028[i_947_] = (short) ((((((Class387_Sub1) this).aShortArray8028[i_947_]) * i_949_) - (((Class387_Sub1) this).aShortArray8032[i_947_]) * i_948_ + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8032[i_947_] = (short) i_950_;
								}
								if (i_898_ != 0) {
									int i_951_ = Class257.anIntArray2683[i_898_];
									int i_952_ = Class257.anIntArray2684[i_898_];
									int i_953_ = (((((Class387_Sub1) this).aShortArray8028[i_947_]) * i_952_ - ((((Class387_Sub1) this).aShortArray8024[i_947_]) * i_951_) + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8024[i_947_] = (short) ((((((Class387_Sub1) this).aShortArray8028[i_947_]) * i_951_) + (((Class387_Sub1) this).aShortArray8024[i_947_]) * i_952_ + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8028[i_947_] = (short) i_953_;
								}
								if (i_899_ != 0) {
									int i_954_ = Class257.anIntArray2683[i_899_];
									int i_955_ = Class257.anIntArray2684[i_899_];
									int i_956_ = (((((Class387_Sub1) this).aShortArray8024[i_947_]) * i_954_ + ((((Class387_Sub1) this).aShortArray8032[i_947_]) * i_955_) + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8024[i_947_] = (short) ((((((Class387_Sub1) this).aShortArray8024[i_947_]) * i_955_) - (((Class387_Sub1) this).aShortArray8032[i_947_]) * i_954_ + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8032[i_947_] = (short) i_956_;
								}
							}
						}
					}
				}
				method4499();
			}
		} else if (i == 3) {
			for (int i_957_ = 0; i_957_ < i_902_; i_957_++) {
				int i_958_ = is[i_957_];
				if (i_958_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_959_ = ((Class387_Sub1) this).anIntArrayArray8022[i_958_];
					for (int i_960_ = 0; i_960_ < is_959_.length; i_960_++) {
						int i_961_ = is_959_[i_960_];
						((Class387_Sub1) this).anIntArray8065[i_961_] -= ((Class387_Sub1) this).anInt8080;
						((Class387_Sub1) this).anIntArray8020[i_961_] -= ((Class387_Sub1) this).anInt8061;
						((Class387_Sub1) this).anIntArray8051[i_961_] -= ((Class387_Sub1) this).anInt8055;
						((Class387_Sub1) this).anIntArray8065[i_961_] = (((Class387_Sub1) this).anIntArray8065[i_961_] * i_898_) >> 7;
						((Class387_Sub1) this).anIntArray8020[i_961_] = (((Class387_Sub1) this).anIntArray8020[i_961_] * i_899_) >> 7;
						((Class387_Sub1) this).anIntArray8051[i_961_] = (((Class387_Sub1) this).anIntArray8051[i_961_] * i_900_) >> 7;
						((Class387_Sub1) this).anIntArray8065[i_961_] += ((Class387_Sub1) this).anInt8080;
						((Class387_Sub1) this).anIntArray8020[i_961_] += ((Class387_Sub1) this).anInt8061;
						((Class387_Sub1) this).anIntArray8051[i_961_] += ((Class387_Sub1) this).anInt8055;
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub1) this).anIntArrayArray8017 != null) {
				boolean bool_962_ = false;
				for (int i_963_ = 0; i_963_ < i_902_; i_963_++) {
					int i_964_ = is[i_963_];
					if (i_964_ < ((Class387_Sub1) this).anIntArrayArray8017.length) {
						int[] is_965_ = (((Class387_Sub1) this).anIntArrayArray8017[i_964_]);
						for (int i_966_ = 0; i_966_ < is_965_.length; i_966_++) {
							int i_967_ = is_965_[i_966_];
							int i_968_ = (((((Class387_Sub1) this).aByteArray8037[i_967_]) & 0xff) + i_898_ * 8);
							if (i_968_ < 0)
								i_968_ = 0;
							else if (i_968_ > 255)
								i_968_ = 255;
							((Class387_Sub1) this).aByteArray8037[i_967_] = (byte) i_968_;
						}
						bool_962_ = bool_962_ | is_965_.length > 0;
					}
				}
				if (bool_962_) {
					if (((Class387_Sub1) this).aClass185Array8070 != null) {
						for (int i_969_ = 0; i_969_ < ((Class387_Sub1) this).anInt8069; i_969_++) {
							Class185 class185 = (((Class387_Sub1) this).aClass185Array8070[i_969_]);
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[i_969_]);
							((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & 0xffffff | 255 - ((((Class387_Sub1) this).aByteArray8037[((Class185) class185).modelColorIndex]) & 0xff) << 24);
						}
					}
					method4507();
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub1) this).anIntArrayArray8017 != null) {
				boolean bool_970_ = false;
				for (int i_971_ = 0; i_971_ < i_902_; i_971_++) {
					int i_972_ = is[i_971_];
					if (i_972_ < ((Class387_Sub1) this).anIntArrayArray8017.length) {
						int[] is_973_ = (((Class387_Sub1) this).anIntArrayArray8017[i_972_]);
						for (int i_974_ = 0; i_974_ < is_973_.length; i_974_++) {
							int i_975_ = is_973_[i_974_];
							int i_976_ = ((((Class387_Sub1) this).modelColors[i_975_]) & 0xffff);
							int i_977_ = i_976_ >> 10 & 0x3f;
							int i_978_ = i_976_ >> 7 & 0x7;
							int i_979_ = i_976_ & 0x7f;
							i_977_ = i_977_ + i_898_ & 0x3f;
							i_978_ += i_899_ / 4;
							if (i_978_ < 0)
								i_978_ = 0;
							else if (i_978_ > 7)
								i_978_ = 7;
							i_979_ += i_900_;
							if (i_979_ < 0)
								i_979_ = 0;
							else if (i_979_ > 127)
								i_979_ = 127;
							((Class387_Sub1) this).modelColors[i_975_] = (short) (i_977_ << 10 | i_978_ << 7 | i_979_);
						}
						bool_970_ = bool_970_ | is_973_.length > 0;
					}
				}
				if (bool_970_) {
					if (((Class387_Sub1) this).aClass185Array8070 != null) {
						for (int i_980_ = 0; i_980_ < ((Class387_Sub1) this).anInt8069; i_980_++) {
							Class185 class185 = (((Class387_Sub1) this).aClass185Array8070[i_980_]);
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[i_980_]);
							((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | (Console.colorArray[((((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff)]) & 0xffffff);
						}
					}
					method4507();
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_981_ = 0; i_981_ < i_902_; i_981_++) {
					int i_982_ = is[i_981_];
					if (i_982_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_983_ = (((Class387_Sub1) this).anIntArrayArray8072[i_982_]);
						for (int i_984_ = 0; i_984_ < is_983_.length; i_984_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_983_[i_984_]]);
							((Class177) class177).anInt1751 += i_898_;
							((Class177) class177).anInt1748 += i_899_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_985_ = 0; i_985_ < i_902_; i_985_++) {
					int i_986_ = is[i_985_];
					if (i_986_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_987_ = (((Class387_Sub1) this).anIntArrayArray8072[i_986_]);
						for (int i_988_ = 0; i_988_ < is_987_.length; i_988_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_987_[i_988_]]);
							((Class177) class177).anInt1752 = (((Class177) class177).anInt1752 * i_898_ >> 7);
							((Class177) class177).anInt1749 = (((Class177) class177).anInt1749 * i_899_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_989_ = 0; i_989_ < i_902_; i_989_++) {
					int i_990_ = is[i_989_];
					if (i_990_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_991_ = (((Class387_Sub1) this).anIntArrayArray8072[i_990_]);
						for (int i_992_ = 0; i_992_ < is_991_.length; i_992_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_991_[i_992_]]);
							((Class177) class177).anInt1753 = (((Class177) class177).anInt1753 + i_898_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void method4451(int i, int[] is, int i_993_, int i_994_, int i_995_, int i_996_, boolean bool) {
		int i_997_ = is.length;
		if (i == 0) {
			i_993_ <<= 4;
			i_994_ <<= 4;
			i_995_ <<= 4;
			int i_998_ = 0;
			((Class387_Sub1) this).anInt8080 = 0;
			((Class387_Sub1) this).anInt8061 = 0;
			((Class387_Sub1) this).anInt8055 = 0;
			for (int i_999_ = 0; i_999_ < i_997_; i_999_++) {
				int i_1000_ = is[i_999_];
				if (i_1000_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_1001_ = ((Class387_Sub1) this).anIntArrayArray8022[i_1000_];
					for (int i_1002_ = 0; i_1002_ < is_1001_.length; i_1002_++) {
						int i_1003_ = is_1001_[i_1002_];
						((Class387_Sub1) this).anInt8080 += ((Class387_Sub1) this).anIntArray8065[i_1003_];
						((Class387_Sub1) this).anInt8061 += ((Class387_Sub1) this).anIntArray8020[i_1003_];
						((Class387_Sub1) this).anInt8055 += ((Class387_Sub1) this).anIntArray8051[i_1003_];
						i_998_++;
					}
				}
			}
			if (i_998_ > 0) {
				((Class387_Sub1) this).anInt8080 = ((Class387_Sub1) this).anInt8080 / i_998_ + i_993_;
				((Class387_Sub1) this).anInt8061 = ((Class387_Sub1) this).anInt8061 / i_998_ + i_994_;
				((Class387_Sub1) this).anInt8055 = ((Class387_Sub1) this).anInt8055 / i_998_ + i_995_;
			} else {
				((Class387_Sub1) this).anInt8080 = i_993_;
				((Class387_Sub1) this).anInt8061 = i_994_;
				((Class387_Sub1) this).anInt8055 = i_995_;
			}
		} else if (i == 1) {
			i_993_ <<= 4;
			i_994_ <<= 4;
			i_995_ <<= 4;
			for (int i_1004_ = 0; i_1004_ < i_997_; i_1004_++) {
				int i_1005_ = is[i_1004_];
				if (i_1005_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_1006_ = ((Class387_Sub1) this).anIntArrayArray8022[i_1005_];
					for (int i_1007_ = 0; i_1007_ < is_1006_.length; i_1007_++) {
						int i_1008_ = is_1006_[i_1007_];
						((Class387_Sub1) this).anIntArray8065[i_1008_] += i_993_;
						((Class387_Sub1) this).anIntArray8020[i_1008_] += i_994_;
						((Class387_Sub1) this).anIntArray8051[i_1008_] += i_995_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1009_ = 0; i_1009_ < i_997_; i_1009_++) {
				int i_1010_ = is[i_1009_];
				if (i_1010_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_1011_ = ((Class387_Sub1) this).anIntArrayArray8022[i_1010_];
					if ((i_996_ & 0x1) == 0) {
						for (int i_1012_ = 0; i_1012_ < is_1011_.length; i_1012_++) {
							int i_1013_ = is_1011_[i_1012_];
							((Class387_Sub1) this).anIntArray8065[i_1013_] -= ((Class387_Sub1) this).anInt8080;
							((Class387_Sub1) this).anIntArray8020[i_1013_] -= ((Class387_Sub1) this).anInt8061;
							((Class387_Sub1) this).anIntArray8051[i_1013_] -= ((Class387_Sub1) this).anInt8055;
							if (i_995_ != 0) {
								int i_1014_ = Class257.anIntArray2683[i_995_];
								int i_1015_ = Class257.anIntArray2684[i_995_];
								int i_1016_ = (((((Class387_Sub1) this).anIntArray8020[i_1013_]) * i_1014_ + (((Class387_Sub1) this).anIntArray8065[i_1013_]) * i_1015_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8020[i_1013_] = ((((Class387_Sub1) this).anIntArray8020[i_1013_]) * i_1015_ - (((Class387_Sub1) this).anIntArray8065[i_1013_]) * i_1014_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8065[i_1013_] = i_1016_;
							}
							if (i_993_ != 0) {
								int i_1017_ = Class257.anIntArray2683[i_993_];
								int i_1018_ = Class257.anIntArray2684[i_993_];
								int i_1019_ = (((((Class387_Sub1) this).anIntArray8020[i_1013_]) * i_1018_ - (((Class387_Sub1) this).anIntArray8051[i_1013_]) * i_1017_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8051[i_1013_] = ((((Class387_Sub1) this).anIntArray8020[i_1013_]) * i_1017_ + (((Class387_Sub1) this).anIntArray8051[i_1013_]) * i_1018_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8020[i_1013_] = i_1019_;
							}
							if (i_994_ != 0) {
								int i_1020_ = Class257.anIntArray2683[i_994_];
								int i_1021_ = Class257.anIntArray2684[i_994_];
								int i_1022_ = (((((Class387_Sub1) this).anIntArray8051[i_1013_]) * i_1020_ + (((Class387_Sub1) this).anIntArray8065[i_1013_]) * i_1021_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8051[i_1013_] = ((((Class387_Sub1) this).anIntArray8051[i_1013_]) * i_1021_ - (((Class387_Sub1) this).anIntArray8065[i_1013_]) * i_1020_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8065[i_1013_] = i_1022_;
							}
							((Class387_Sub1) this).anIntArray8065[i_1013_] += ((Class387_Sub1) this).anInt8080;
							((Class387_Sub1) this).anIntArray8020[i_1013_] += ((Class387_Sub1) this).anInt8061;
							((Class387_Sub1) this).anIntArray8051[i_1013_] += ((Class387_Sub1) this).anInt8055;
						}
					} else {
						for (int i_1023_ = 0; i_1023_ < is_1011_.length; i_1023_++) {
							int i_1024_ = is_1011_[i_1023_];
							((Class387_Sub1) this).anIntArray8065[i_1024_] -= ((Class387_Sub1) this).anInt8080;
							((Class387_Sub1) this).anIntArray8020[i_1024_] -= ((Class387_Sub1) this).anInt8061;
							((Class387_Sub1) this).anIntArray8051[i_1024_] -= ((Class387_Sub1) this).anInt8055;
							if (i_993_ != 0) {
								int i_1025_ = Class257.anIntArray2683[i_993_];
								int i_1026_ = Class257.anIntArray2684[i_993_];
								int i_1027_ = (((((Class387_Sub1) this).anIntArray8020[i_1024_]) * i_1026_ - (((Class387_Sub1) this).anIntArray8051[i_1024_]) * i_1025_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8051[i_1024_] = ((((Class387_Sub1) this).anIntArray8020[i_1024_]) * i_1025_ + (((Class387_Sub1) this).anIntArray8051[i_1024_]) * i_1026_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8020[i_1024_] = i_1027_;
							}
							if (i_995_ != 0) {
								int i_1028_ = Class257.anIntArray2683[i_995_];
								int i_1029_ = Class257.anIntArray2684[i_995_];
								int i_1030_ = (((((Class387_Sub1) this).anIntArray8020[i_1024_]) * i_1028_ + (((Class387_Sub1) this).anIntArray8065[i_1024_]) * i_1029_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8020[i_1024_] = ((((Class387_Sub1) this).anIntArray8020[i_1024_]) * i_1029_ - (((Class387_Sub1) this).anIntArray8065[i_1024_]) * i_1028_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8065[i_1024_] = i_1030_;
							}
							if (i_994_ != 0) {
								int i_1031_ = Class257.anIntArray2683[i_994_];
								int i_1032_ = Class257.anIntArray2684[i_994_];
								int i_1033_ = (((((Class387_Sub1) this).anIntArray8051[i_1024_]) * i_1031_ + (((Class387_Sub1) this).anIntArray8065[i_1024_]) * i_1032_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8051[i_1024_] = ((((Class387_Sub1) this).anIntArray8051[i_1024_]) * i_1032_ - (((Class387_Sub1) this).anIntArray8065[i_1024_]) * i_1031_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8065[i_1024_] = i_1033_;
							}
							((Class387_Sub1) this).anIntArray8065[i_1024_] += ((Class387_Sub1) this).anInt8080;
							((Class387_Sub1) this).anIntArray8020[i_1024_] += ((Class387_Sub1) this).anInt8061;
							((Class387_Sub1) this).anIntArray8051[i_1024_] += ((Class387_Sub1) this).anInt8055;
						}
					}
				}
			}
			if (bool) {
				for (int i_1034_ = 0; i_1034_ < i_997_; i_1034_++) {
					int i_1035_ = is[i_1034_];
					if (i_1035_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_1036_ = (((Class387_Sub1) this).anIntArrayArray8022[i_1035_]);
						for (int i_1037_ = 0; i_1037_ < is_1036_.length; i_1037_++) {
							int i_1038_ = is_1036_[i_1037_];
							int i_1039_ = (((Class387_Sub1) this).anIntArray8082[i_1038_]);
							int i_1040_ = (((Class387_Sub1) this).anIntArray8082[i_1038_ + 1]);
							for (int i_1041_ = i_1039_; i_1041_ < i_1040_; i_1041_++) {
								int i_1042_ = ((((Class387_Sub1) this).aShortArray8052[i_1041_]) - 1);
								if (i_1042_ == -1)
									break;
								if (i_995_ != 0) {
									int i_1043_ = Class257.anIntArray2683[i_995_];
									int i_1044_ = Class257.anIntArray2684[i_995_];
									int i_1045_ = (((((Class387_Sub1) this).aShortArray8028[i_1042_]) * i_1043_ + (((Class387_Sub1) this).aShortArray8032[i_1042_]) * i_1044_ + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8028[i_1042_] = (short) (((((Class387_Sub1) this).aShortArray8028[i_1042_]) * i_1044_ - (((Class387_Sub1) this).aShortArray8032[i_1042_]) * i_1043_ + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8032[i_1042_] = (short) i_1045_;
								}
								if (i_993_ != 0) {
									int i_1046_ = Class257.anIntArray2683[i_993_];
									int i_1047_ = Class257.anIntArray2684[i_993_];
									int i_1048_ = (((((Class387_Sub1) this).aShortArray8028[i_1042_]) * i_1047_ - (((Class387_Sub1) this).aShortArray8024[i_1042_]) * i_1046_ + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8024[i_1042_] = (short) (((((Class387_Sub1) this).aShortArray8028[i_1042_]) * i_1046_ + (((Class387_Sub1) this).aShortArray8024[i_1042_]) * i_1047_ + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8028[i_1042_] = (short) i_1048_;
								}
								if (i_994_ != 0) {
									int i_1049_ = Class257.anIntArray2683[i_994_];
									int i_1050_ = Class257.anIntArray2684[i_994_];
									int i_1051_ = (((((Class387_Sub1) this).aShortArray8024[i_1042_]) * i_1049_ + (((Class387_Sub1) this).aShortArray8032[i_1042_]) * i_1050_ + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8024[i_1042_] = (short) (((((Class387_Sub1) this).aShortArray8024[i_1042_]) * i_1050_ - (((Class387_Sub1) this).aShortArray8032[i_1042_]) * i_1049_ + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8032[i_1042_] = (short) i_1051_;
								}
							}
						}
					}
				}
				method4499();
			}
		} else if (i == 3) {
			for (int i_1052_ = 0; i_1052_ < i_997_; i_1052_++) {
				int i_1053_ = is[i_1052_];
				if (i_1053_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_1054_ = ((Class387_Sub1) this).anIntArrayArray8022[i_1053_];
					for (int i_1055_ = 0; i_1055_ < is_1054_.length; i_1055_++) {
						int i_1056_ = is_1054_[i_1055_];
						((Class387_Sub1) this).anIntArray8065[i_1056_] -= ((Class387_Sub1) this).anInt8080;
						((Class387_Sub1) this).anIntArray8020[i_1056_] -= ((Class387_Sub1) this).anInt8061;
						((Class387_Sub1) this).anIntArray8051[i_1056_] -= ((Class387_Sub1) this).anInt8055;
						((Class387_Sub1) this).anIntArray8065[i_1056_] = (((Class387_Sub1) this).anIntArray8065[i_1056_] * i_993_) >> 7;
						((Class387_Sub1) this).anIntArray8020[i_1056_] = (((Class387_Sub1) this).anIntArray8020[i_1056_] * i_994_) >> 7;
						((Class387_Sub1) this).anIntArray8051[i_1056_] = (((Class387_Sub1) this).anIntArray8051[i_1056_] * i_995_) >> 7;
						((Class387_Sub1) this).anIntArray8065[i_1056_] += ((Class387_Sub1) this).anInt8080;
						((Class387_Sub1) this).anIntArray8020[i_1056_] += ((Class387_Sub1) this).anInt8061;
						((Class387_Sub1) this).anIntArray8051[i_1056_] += ((Class387_Sub1) this).anInt8055;
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub1) this).anIntArrayArray8017 != null) {
				boolean bool_1057_ = false;
				for (int i_1058_ = 0; i_1058_ < i_997_; i_1058_++) {
					int i_1059_ = is[i_1058_];
					if (i_1059_ < ((Class387_Sub1) this).anIntArrayArray8017.length) {
						int[] is_1060_ = (((Class387_Sub1) this).anIntArrayArray8017[i_1059_]);
						for (int i_1061_ = 0; i_1061_ < is_1060_.length; i_1061_++) {
							int i_1062_ = is_1060_[i_1061_];
							int i_1063_ = (((((Class387_Sub1) this).aByteArray8037[i_1062_]) & 0xff) + i_993_ * 8);
							if (i_1063_ < 0)
								i_1063_ = 0;
							else if (i_1063_ > 255)
								i_1063_ = 255;
							((Class387_Sub1) this).aByteArray8037[i_1062_] = (byte) i_1063_;
						}
						bool_1057_ = bool_1057_ | is_1060_.length > 0;
					}
				}
				if (bool_1057_) {
					if (((Class387_Sub1) this).aClass185Array8070 != null) {
						for (int i_1064_ = 0; i_1064_ < ((Class387_Sub1) this).anInt8069; i_1064_++) {
							Class185 class185 = (((Class387_Sub1) this).aClass185Array8070[i_1064_]);
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[i_1064_]);
							((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & 0xffffff | 255 - ((((Class387_Sub1) this).aByteArray8037[((Class185) class185).modelColorIndex]) & 0xff) << 24);
						}
					}
					method4507();
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub1) this).anIntArrayArray8017 != null) {
				boolean bool_1065_ = false;
				for (int i_1066_ = 0; i_1066_ < i_997_; i_1066_++) {
					int i_1067_ = is[i_1066_];
					if (i_1067_ < ((Class387_Sub1) this).anIntArrayArray8017.length) {
						int[] is_1068_ = (((Class387_Sub1) this).anIntArrayArray8017[i_1067_]);
						for (int i_1069_ = 0; i_1069_ < is_1068_.length; i_1069_++) {
							int i_1070_ = is_1068_[i_1069_];
							int i_1071_ = ((((Class387_Sub1) this).modelColors[i_1070_]) & 0xffff);
							int i_1072_ = i_1071_ >> 10 & 0x3f;
							int i_1073_ = i_1071_ >> 7 & 0x7;
							int i_1074_ = i_1071_ & 0x7f;
							i_1072_ = i_1072_ + i_993_ & 0x3f;
							i_1073_ += i_994_ / 4;
							if (i_1073_ < 0)
								i_1073_ = 0;
							else if (i_1073_ > 7)
								i_1073_ = 7;
							i_1074_ += i_995_;
							if (i_1074_ < 0)
								i_1074_ = 0;
							else if (i_1074_ > 127)
								i_1074_ = 127;
							((Class387_Sub1) this).modelColors[i_1070_] = (short) (i_1072_ << 10 | i_1073_ << 7 | i_1074_);
						}
						bool_1065_ = bool_1065_ | is_1068_.length > 0;
					}
				}
				if (bool_1065_) {
					if (((Class387_Sub1) this).aClass185Array8070 != null) {
						for (int i_1075_ = 0; i_1075_ < ((Class387_Sub1) this).anInt8069; i_1075_++) {
							Class185 class185 = (((Class387_Sub1) this).aClass185Array8070[i_1075_]);
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[i_1075_]);
							((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | (Console.colorArray[((((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff)]) & 0xffffff);
						}
					}
					method4507();
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_1076_ = 0; i_1076_ < i_997_; i_1076_++) {
					int i_1077_ = is[i_1076_];
					if (i_1077_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_1078_ = (((Class387_Sub1) this).anIntArrayArray8072[i_1077_]);
						for (int i_1079_ = 0; i_1079_ < is_1078_.length; i_1079_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_1078_[i_1079_]]);
							((Class177) class177).anInt1751 += i_993_;
							((Class177) class177).anInt1748 += i_994_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_1080_ = 0; i_1080_ < i_997_; i_1080_++) {
					int i_1081_ = is[i_1080_];
					if (i_1081_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_1082_ = (((Class387_Sub1) this).anIntArrayArray8072[i_1081_]);
						for (int i_1083_ = 0; i_1083_ < is_1082_.length; i_1083_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_1082_[i_1083_]]);
							((Class177) class177).anInt1752 = (((Class177) class177).anInt1752 * i_993_ >> 7);
							((Class177) class177).anInt1749 = (((Class177) class177).anInt1749 * i_994_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_1084_ = 0; i_1084_ < i_997_; i_1084_++) {
					int i_1085_ = is[i_1084_];
					if (i_1085_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_1086_ = (((Class387_Sub1) this).anIntArrayArray8072[i_1085_]);
						for (int i_1087_ = 0; i_1087_ < is_1086_.length; i_1087_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_1086_[i_1087_]]);
							((Class177) class177).anInt1753 = (((Class177) class177).anInt1753 + i_993_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public int ct() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8058;
	}

	public void method4477(Class247 class247, int i, boolean bool) {
		if (((Class387_Sub1) this).aShortArray8023 != null) {
			Class247 class247_1088_ = class247;
			if (bool) {
				class247_1088_ = ((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aClass247_8513;
				class247_1088_.method2458(class247);
			}
			float[] fs = new float[3];
			for (int i_1089_ = 0; i_1089_ < ((Class387_Sub1) this).anInt8044; i_1089_++) {
				if ((i & ((Class387_Sub1) this).aShortArray8023[i_1089_]) != 0) {
					class247_1088_.method2465((float) (((Class387_Sub1) this).anIntArray8065[i_1089_]), (float) (((Class387_Sub1) this).anIntArray8020[i_1089_]), (float) (((Class387_Sub1) this).anIntArray8051[i_1089_]), fs);
					((Class387_Sub1) this).anIntArray8065[i_1089_] = (int) fs[0];
					((Class387_Sub1) this).anIntArray8020[i_1089_] = (int) fs[1];
					((Class387_Sub1) this).anIntArray8051[i_1089_] = (int) fs[2];
				}
			}
		}
	}

	public void method4478(Class247 class247, int i, boolean bool) {
		if (((Class387_Sub1) this).aShortArray8023 != null) {
			Class247 class247_1090_ = class247;
			if (bool) {
				class247_1090_ = ((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aClass247_8513;
				class247_1090_.method2458(class247);
			}
			float[] fs = new float[3];
			for (int i_1091_ = 0; i_1091_ < ((Class387_Sub1) this).anInt8044; i_1091_++) {
				if ((i & ((Class387_Sub1) this).aShortArray8023[i_1091_]) != 0) {
					class247_1090_.method2465((float) (((Class387_Sub1) this).anIntArray8065[i_1091_]), (float) (((Class387_Sub1) this).anIntArray8020[i_1091_]), (float) (((Class387_Sub1) this).anIntArray8051[i_1091_]), fs);
					((Class387_Sub1) this).anIntArray8065[i_1091_] = (int) fs[0];
					((Class387_Sub1) this).anIntArray8020[i_1091_] = (int) fs[1];
					((Class387_Sub1) this).anIntArray8051[i_1091_] = (int) fs[2];
				}
			}
		}
	}

	void en(int i, int[] is, int i_1092_, int i_1093_, int i_1094_, boolean bool, int i_1095_, int[] is_1096_) {
		int i_1097_ = is.length;
		if (i == 0) {
			i_1092_ <<= 4;
			i_1093_ <<= 4;
			i_1094_ <<= 4;
			int i_1098_ = 0;
			((Class387_Sub1) this).anInt8080 = 0;
			((Class387_Sub1) this).anInt8061 = 0;
			((Class387_Sub1) this).anInt8055 = 0;
			for (int i_1099_ = 0; i_1099_ < i_1097_; i_1099_++) {
				int i_1100_ = is[i_1099_];
				if (i_1100_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_1101_ = ((Class387_Sub1) this).anIntArrayArray8022[i_1100_];
					for (int i_1102_ = 0; i_1102_ < is_1101_.length; i_1102_++) {
						int i_1103_ = is_1101_[i_1102_];
						if (((Class387_Sub1) this).aShortArray8023 == null || (i_1095_ & (((Class387_Sub1) this).aShortArray8023[i_1103_])) != 0) {
							((Class387_Sub1) this).anInt8080 += (((Class387_Sub1) this).anIntArray8065[i_1103_]);
							((Class387_Sub1) this).anInt8061 += (((Class387_Sub1) this).anIntArray8020[i_1103_]);
							((Class387_Sub1) this).anInt8055 += (((Class387_Sub1) this).anIntArray8051[i_1103_]);
							i_1098_++;
						}
					}
				}
			}
			if (i_1098_ > 0) {
				((Class387_Sub1) this).anInt8080 = ((Class387_Sub1) this).anInt8080 / i_1098_ + i_1092_;
				((Class387_Sub1) this).anInt8061 = ((Class387_Sub1) this).anInt8061 / i_1098_ + i_1093_;
				((Class387_Sub1) this).anInt8055 = ((Class387_Sub1) this).anInt8055 / i_1098_ + i_1094_;
				((Class387_Sub1) this).aBoolean8048 = true;
			} else {
				((Class387_Sub1) this).anInt8080 = i_1092_;
				((Class387_Sub1) this).anInt8061 = i_1093_;
				((Class387_Sub1) this).anInt8055 = i_1094_;
			}
		} else if (i == 1) {
			if (is_1096_ != null) {
				int i_1104_ = ((is_1096_[0] * i_1092_ + is_1096_[1] * i_1093_ + is_1096_[2] * i_1094_ + 8192) >> 14);
				int i_1105_ = ((is_1096_[3] * i_1092_ + is_1096_[4] * i_1093_ + is_1096_[5] * i_1094_ + 8192) >> 14);
				int i_1106_ = ((is_1096_[6] * i_1092_ + is_1096_[7] * i_1093_ + is_1096_[8] * i_1094_ + 8192) >> 14);
				i_1092_ = i_1104_;
				i_1093_ = i_1105_;
				i_1094_ = i_1106_;
			}
			i_1092_ <<= 4;
			i_1093_ <<= 4;
			i_1094_ <<= 4;
			for (int i_1107_ = 0; i_1107_ < i_1097_; i_1107_++) {
				int i_1108_ = is[i_1107_];
				if (i_1108_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_1109_ = ((Class387_Sub1) this).anIntArrayArray8022[i_1108_];
					for (int i_1110_ = 0; i_1110_ < is_1109_.length; i_1110_++) {
						int i_1111_ = is_1109_[i_1110_];
						if (((Class387_Sub1) this).aShortArray8023 == null || (i_1095_ & (((Class387_Sub1) this).aShortArray8023[i_1111_])) != 0) {
							((Class387_Sub1) this).anIntArray8065[i_1111_] += i_1092_;
							((Class387_Sub1) this).anIntArray8020[i_1111_] += i_1093_;
							((Class387_Sub1) this).anIntArray8051[i_1111_] += i_1094_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1096_ != null) {
				int i_1112_ = is_1096_[9] << 4;
				int i_1113_ = is_1096_[10] << 4;
				int i_1114_ = is_1096_[11] << 4;
				int i_1115_ = is_1096_[12] << 4;
				int i_1116_ = is_1096_[13] << 4;
				int i_1117_ = is_1096_[14] << 4;
				if (((Class387_Sub1) this).aBoolean8048) {
					int i_1118_ = ((is_1096_[0] * ((Class387_Sub1) this).anInt8080 + is_1096_[3] * ((Class387_Sub1) this).anInt8061 + is_1096_[6] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					int i_1119_ = ((is_1096_[1] * ((Class387_Sub1) this).anInt8080 + is_1096_[4] * ((Class387_Sub1) this).anInt8061 + is_1096_[7] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					int i_1120_ = ((is_1096_[2] * ((Class387_Sub1) this).anInt8080 + is_1096_[5] * ((Class387_Sub1) this).anInt8061 + is_1096_[8] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					i_1118_ += i_1115_;
					i_1119_ += i_1116_;
					i_1120_ += i_1117_;
					((Class387_Sub1) this).anInt8080 = i_1118_;
					((Class387_Sub1) this).anInt8061 = i_1119_;
					((Class387_Sub1) this).anInt8055 = i_1120_;
					((Class387_Sub1) this).aBoolean8048 = false;
				}
				int[] is_1121_ = new int[9];
				int i_1122_ = Class257.anIntArray2684[i_1092_];
				int i_1123_ = Class257.anIntArray2683[i_1092_];
				int i_1124_ = Class257.anIntArray2684[i_1093_];
				int i_1125_ = Class257.anIntArray2683[i_1093_];
				int i_1126_ = Class257.anIntArray2684[i_1094_];
				int i_1127_ = Class257.anIntArray2683[i_1094_];
				int i_1128_ = i_1123_ * i_1126_ + 8192 >> 14;
				int i_1129_ = i_1123_ * i_1127_ + 8192 >> 14;
				is_1121_[0] = i_1124_ * i_1126_ + i_1125_ * i_1129_ + 8192 >> 14;
				is_1121_[1] = -i_1124_ * i_1127_ + i_1125_ * i_1128_ + 8192 >> 14;
				is_1121_[2] = i_1125_ * i_1122_ + 8192 >> 14;
				is_1121_[3] = i_1122_ * i_1127_ + 8192 >> 14;
				is_1121_[4] = i_1122_ * i_1126_ + 8192 >> 14;
				is_1121_[5] = -i_1123_;
				is_1121_[6] = -i_1125_ * i_1126_ + i_1124_ * i_1129_ + 8192 >> 14;
				is_1121_[7] = i_1125_ * i_1127_ + i_1124_ * i_1128_ + 8192 >> 14;
				is_1121_[8] = i_1124_ * i_1122_ + 8192 >> 14;
				int i_1130_ = ((is_1121_[0] * -((Class387_Sub1) this).anInt8080 + is_1121_[1] * -((Class387_Sub1) this).anInt8061 + is_1121_[2] * -((Class387_Sub1) this).anInt8055 + 8192) >> 14);
				int i_1131_ = ((is_1121_[3] * -((Class387_Sub1) this).anInt8080 + is_1121_[4] * -((Class387_Sub1) this).anInt8061 + is_1121_[5] * -((Class387_Sub1) this).anInt8055 + 8192) >> 14);
				int i_1132_ = ((is_1121_[6] * -((Class387_Sub1) this).anInt8080 + is_1121_[7] * -((Class387_Sub1) this).anInt8061 + is_1121_[8] * -((Class387_Sub1) this).anInt8055 + 8192) >> 14);
				int i_1133_ = i_1130_ + ((Class387_Sub1) this).anInt8080;
				int i_1134_ = i_1131_ + ((Class387_Sub1) this).anInt8061;
				int i_1135_ = i_1132_ + ((Class387_Sub1) this).anInt8055;
				int[] is_1136_ = new int[9];
				for (int i_1137_ = 0; i_1137_ < 3; i_1137_++) {
					for (int i_1138_ = 0; i_1138_ < 3; i_1138_++) {
						int i_1139_ = 0;
						for (int i_1140_ = 0; i_1140_ < 3; i_1140_++)
							i_1139_ += (is_1121_[i_1137_ * 3 + i_1140_] * is_1096_[i_1138_ * 3 + i_1140_]);
						is_1136_[i_1137_ * 3 + i_1138_] = i_1139_ + 8192 >> 14;
					}
				}
				int i_1141_ = ((is_1121_[0] * i_1115_ + is_1121_[1] * i_1116_ + is_1121_[2] * i_1117_ + 8192) >> 14);
				int i_1142_ = ((is_1121_[3] * i_1115_ + is_1121_[4] * i_1116_ + is_1121_[5] * i_1117_ + 8192) >> 14);
				int i_1143_ = ((is_1121_[6] * i_1115_ + is_1121_[7] * i_1116_ + is_1121_[8] * i_1117_ + 8192) >> 14);
				i_1141_ += i_1133_;
				i_1142_ += i_1134_;
				i_1143_ += i_1135_;
				int[] is_1144_ = new int[9];
				for (int i_1145_ = 0; i_1145_ < 3; i_1145_++) {
					for (int i_1146_ = 0; i_1146_ < 3; i_1146_++) {
						int i_1147_ = 0;
						for (int i_1148_ = 0; i_1148_ < 3; i_1148_++)
							i_1147_ += (is_1096_[i_1145_ * 3 + i_1148_] * is_1136_[i_1146_ + i_1148_ * 3]);
						is_1144_[i_1145_ * 3 + i_1146_] = i_1147_ + 8192 >> 14;
					}
				}
				int i_1149_ = ((is_1096_[0] * i_1141_ + is_1096_[1] * i_1142_ + is_1096_[2] * i_1143_ + 8192) >> 14);
				int i_1150_ = ((is_1096_[3] * i_1141_ + is_1096_[4] * i_1142_ + is_1096_[5] * i_1143_ + 8192) >> 14);
				int i_1151_ = ((is_1096_[6] * i_1141_ + is_1096_[7] * i_1142_ + is_1096_[8] * i_1143_ + 8192) >> 14);
				i_1149_ += i_1112_;
				i_1150_ += i_1113_;
				i_1151_ += i_1114_;
				for (int i_1152_ = 0; i_1152_ < i_1097_; i_1152_++) {
					int i_1153_ = is[i_1152_];
					if (i_1153_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_1154_ = (((Class387_Sub1) this).anIntArrayArray8022[i_1153_]);
						for (int i_1155_ = 0; i_1155_ < is_1154_.length; i_1155_++) {
							int i_1156_ = is_1154_[i_1155_];
							if (((Class387_Sub1) this).aShortArray8023 == null || ((i_1095_ & (((Class387_Sub1) this).aShortArray8023[i_1156_])) != 0)) {
								int i_1157_ = (is_1144_[0] * (((Class387_Sub1) this).anIntArray8065[i_1156_]) + is_1144_[1] * (((Class387_Sub1) this).anIntArray8020[i_1156_]) + is_1144_[2] * (((Class387_Sub1) this).anIntArray8051[i_1156_]) + 8192) >> 14;
								int i_1158_ = (is_1144_[3] * (((Class387_Sub1) this).anIntArray8065[i_1156_]) + is_1144_[4] * (((Class387_Sub1) this).anIntArray8020[i_1156_]) + is_1144_[5] * (((Class387_Sub1) this).anIntArray8051[i_1156_]) + 8192) >> 14;
								int i_1159_ = (is_1144_[6] * (((Class387_Sub1) this).anIntArray8065[i_1156_]) + is_1144_[7] * (((Class387_Sub1) this).anIntArray8020[i_1156_]) + is_1144_[8] * (((Class387_Sub1) this).anIntArray8051[i_1156_]) + 8192) >> 14;
								i_1157_ += i_1149_;
								i_1158_ += i_1150_;
								i_1159_ += i_1151_;
								((Class387_Sub1) this).anIntArray8065[i_1156_] = i_1157_;
								((Class387_Sub1) this).anIntArray8020[i_1156_] = i_1158_;
								((Class387_Sub1) this).anIntArray8051[i_1156_] = i_1159_;
							}
						}
					}
				}
			} else {
				for (int i_1160_ = 0; i_1160_ < i_1097_; i_1160_++) {
					int i_1161_ = is[i_1160_];
					if (i_1161_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_1162_ = (((Class387_Sub1) this).anIntArrayArray8022[i_1161_]);
						for (int i_1163_ = 0; i_1163_ < is_1162_.length; i_1163_++) {
							int i_1164_ = is_1162_[i_1163_];
							if (((Class387_Sub1) this).aShortArray8023 == null || ((i_1095_ & (((Class387_Sub1) this).aShortArray8023[i_1164_])) != 0)) {
								((Class387_Sub1) this).anIntArray8065[i_1164_] -= ((Class387_Sub1) this).anInt8080;
								((Class387_Sub1) this).anIntArray8020[i_1164_] -= ((Class387_Sub1) this).anInt8061;
								((Class387_Sub1) this).anIntArray8051[i_1164_] -= ((Class387_Sub1) this).anInt8055;
								if (i_1094_ != 0) {
									int i_1165_ = Class257.anIntArray2683[i_1094_];
									int i_1166_ = Class257.anIntArray2684[i_1094_];
									int i_1167_ = ((((Class387_Sub1) this).anIntArray8020[i_1164_]) * i_1165_ + ((((Class387_Sub1) this).anIntArray8065[i_1164_]) * i_1166_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8020[i_1164_] = ((((Class387_Sub1) this).anIntArray8020[i_1164_]) * i_1166_ - ((((Class387_Sub1) this).anIntArray8065[i_1164_]) * i_1165_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8065[i_1164_] = i_1167_;
								}
								if (i_1092_ != 0) {
									int i_1168_ = Class257.anIntArray2683[i_1092_];
									int i_1169_ = Class257.anIntArray2684[i_1092_];
									int i_1170_ = ((((Class387_Sub1) this).anIntArray8020[i_1164_]) * i_1169_ - ((((Class387_Sub1) this).anIntArray8051[i_1164_]) * i_1168_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8051[i_1164_] = ((((Class387_Sub1) this).anIntArray8020[i_1164_]) * i_1168_ + ((((Class387_Sub1) this).anIntArray8051[i_1164_]) * i_1169_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8020[i_1164_] = i_1170_;
								}
								if (i_1093_ != 0) {
									int i_1171_ = Class257.anIntArray2683[i_1093_];
									int i_1172_ = Class257.anIntArray2684[i_1093_];
									int i_1173_ = ((((Class387_Sub1) this).anIntArray8051[i_1164_]) * i_1171_ + ((((Class387_Sub1) this).anIntArray8065[i_1164_]) * i_1172_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8051[i_1164_] = ((((Class387_Sub1) this).anIntArray8051[i_1164_]) * i_1172_ - ((((Class387_Sub1) this).anIntArray8065[i_1164_]) * i_1171_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8065[i_1164_] = i_1173_;
								}
								((Class387_Sub1) this).anIntArray8065[i_1164_] += ((Class387_Sub1) this).anInt8080;
								((Class387_Sub1) this).anIntArray8020[i_1164_] += ((Class387_Sub1) this).anInt8061;
								((Class387_Sub1) this).anIntArray8051[i_1164_] += ((Class387_Sub1) this).anInt8055;
							}
						}
					}
				}
				if (bool) {
					for (int i_1174_ = 0; i_1174_ < i_1097_; i_1174_++) {
						int i_1175_ = is[i_1174_];
						if (i_1175_ < (((Class387_Sub1) this).anIntArrayArray8022).length) {
							int[] is_1176_ = (((Class387_Sub1) this).anIntArrayArray8022[i_1175_]);
							for (int i_1177_ = 0; i_1177_ < is_1176_.length; i_1177_++) {
								int i_1178_ = is_1176_[i_1177_];
								if ((((Class387_Sub1) this).aShortArray8023 == null) || ((i_1095_ & (((Class387_Sub1) this).aShortArray8023[i_1178_])) != 0)) {
									int i_1179_ = (((Class387_Sub1) this).anIntArray8082[i_1178_]);
									int i_1180_ = (((Class387_Sub1) this).anIntArray8082[i_1178_ + 1]);
									for (int i_1181_ = i_1179_; i_1181_ < i_1180_; i_1181_++) {
										int i_1182_ = ((((Class387_Sub1) this).aShortArray8052[i_1181_]) - 1);
										if (i_1182_ == -1)
											break;
										if (i_1094_ != 0) {
											int i_1183_ = (Class257.anIntArray2683[i_1094_]);
											int i_1184_ = (Class257.anIntArray2684[i_1094_]);
											int i_1185_ = (((((Class387_Sub1) this).aShortArray8028[i_1182_]) * i_1183_ + (((Class387_Sub1) this).aShortArray8032[i_1182_]) * i_1184_ + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8028[i_1182_] = (short) ((((((Class387_Sub1) this).aShortArray8028[i_1182_]) * i_1184_) - ((((Class387_Sub1) this).aShortArray8032[i_1182_]) * i_1183_) + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8032[i_1182_] = (short) i_1185_;
										}
										if (i_1092_ != 0) {
											int i_1186_ = (Class257.anIntArray2683[i_1092_]);
											int i_1187_ = (Class257.anIntArray2684[i_1092_]);
											int i_1188_ = (((((Class387_Sub1) this).aShortArray8028[i_1182_]) * i_1187_ - (((Class387_Sub1) this).aShortArray8024[i_1182_]) * i_1186_ + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8024[i_1182_] = (short) ((((((Class387_Sub1) this).aShortArray8028[i_1182_]) * i_1186_) + ((((Class387_Sub1) this).aShortArray8024[i_1182_]) * i_1187_) + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8028[i_1182_] = (short) i_1188_;
										}
										if (i_1093_ != 0) {
											int i_1189_ = (Class257.anIntArray2683[i_1093_]);
											int i_1190_ = (Class257.anIntArray2684[i_1093_]);
											int i_1191_ = (((((Class387_Sub1) this).aShortArray8024[i_1182_]) * i_1189_ + (((Class387_Sub1) this).aShortArray8032[i_1182_]) * i_1190_ + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8024[i_1182_] = (short) ((((((Class387_Sub1) this).aShortArray8024[i_1182_]) * i_1190_) - ((((Class387_Sub1) this).aShortArray8032[i_1182_]) * i_1189_) + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8032[i_1182_] = (short) i_1191_;
										}
									}
								}
							}
						}
					}
					method4499();
				}
			}
		} else if (i == 3) {
			if (is_1096_ != null) {
				int i_1192_ = is_1096_[9] << 4;
				int i_1193_ = is_1096_[10] << 4;
				int i_1194_ = is_1096_[11] << 4;
				int i_1195_ = is_1096_[12] << 4;
				int i_1196_ = is_1096_[13] << 4;
				int i_1197_ = is_1096_[14] << 4;
				if (((Class387_Sub1) this).aBoolean8048) {
					int i_1198_ = ((is_1096_[0] * ((Class387_Sub1) this).anInt8080 + is_1096_[3] * ((Class387_Sub1) this).anInt8061 + is_1096_[6] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					int i_1199_ = ((is_1096_[1] * ((Class387_Sub1) this).anInt8080 + is_1096_[4] * ((Class387_Sub1) this).anInt8061 + is_1096_[7] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					int i_1200_ = ((is_1096_[2] * ((Class387_Sub1) this).anInt8080 + is_1096_[5] * ((Class387_Sub1) this).anInt8061 + is_1096_[8] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					i_1198_ += i_1195_;
					i_1199_ += i_1196_;
					i_1200_ += i_1197_;
					((Class387_Sub1) this).anInt8080 = i_1198_;
					((Class387_Sub1) this).anInt8061 = i_1199_;
					((Class387_Sub1) this).anInt8055 = i_1200_;
					((Class387_Sub1) this).aBoolean8048 = false;
				}
				int i_1201_ = i_1092_ << 15 >> 7;
				int i_1202_ = i_1093_ << 15 >> 7;
				int i_1203_ = i_1094_ << 15 >> 7;
				int i_1204_ = i_1201_ * -((Class387_Sub1) this).anInt8080 + 8192 >> 14;
				int i_1205_ = i_1202_ * -((Class387_Sub1) this).anInt8061 + 8192 >> 14;
				int i_1206_ = i_1203_ * -((Class387_Sub1) this).anInt8055 + 8192 >> 14;
				int i_1207_ = i_1204_ + ((Class387_Sub1) this).anInt8080;
				int i_1208_ = i_1205_ + ((Class387_Sub1) this).anInt8061;
				int i_1209_ = i_1206_ + ((Class387_Sub1) this).anInt8055;
				int[] is_1210_ = new int[9];
				is_1210_[0] = i_1201_ * is_1096_[0] + 8192 >> 14;
				is_1210_[1] = i_1201_ * is_1096_[3] + 8192 >> 14;
				is_1210_[2] = i_1201_ * is_1096_[6] + 8192 >> 14;
				is_1210_[3] = i_1202_ * is_1096_[1] + 8192 >> 14;
				is_1210_[4] = i_1202_ * is_1096_[4] + 8192 >> 14;
				is_1210_[5] = i_1202_ * is_1096_[7] + 8192 >> 14;
				is_1210_[6] = i_1203_ * is_1096_[2] + 8192 >> 14;
				is_1210_[7] = i_1203_ * is_1096_[5] + 8192 >> 14;
				is_1210_[8] = i_1203_ * is_1096_[8] + 8192 >> 14;
				int i_1211_ = i_1201_ * i_1195_ + 8192 >> 14;
				int i_1212_ = i_1202_ * i_1196_ + 8192 >> 14;
				int i_1213_ = i_1203_ * i_1197_ + 8192 >> 14;
				i_1211_ += i_1207_;
				i_1212_ += i_1208_;
				i_1213_ += i_1209_;
				int[] is_1214_ = new int[9];
				for (int i_1215_ = 0; i_1215_ < 3; i_1215_++) {
					for (int i_1216_ = 0; i_1216_ < 3; i_1216_++) {
						int i_1217_ = 0;
						for (int i_1218_ = 0; i_1218_ < 3; i_1218_++)
							i_1217_ += (is_1096_[i_1215_ * 3 + i_1218_] * is_1210_[i_1216_ + i_1218_ * 3]);
						is_1214_[i_1215_ * 3 + i_1216_] = i_1217_ + 8192 >> 14;
					}
				}
				int i_1219_ = ((is_1096_[0] * i_1211_ + is_1096_[1] * i_1212_ + is_1096_[2] * i_1213_ + 8192) >> 14);
				int i_1220_ = ((is_1096_[3] * i_1211_ + is_1096_[4] * i_1212_ + is_1096_[5] * i_1213_ + 8192) >> 14);
				int i_1221_ = ((is_1096_[6] * i_1211_ + is_1096_[7] * i_1212_ + is_1096_[8] * i_1213_ + 8192) >> 14);
				i_1219_ += i_1192_;
				i_1220_ += i_1193_;
				i_1221_ += i_1194_;
				for (int i_1222_ = 0; i_1222_ < i_1097_; i_1222_++) {
					int i_1223_ = is[i_1222_];
					if (i_1223_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_1224_ = (((Class387_Sub1) this).anIntArrayArray8022[i_1223_]);
						for (int i_1225_ = 0; i_1225_ < is_1224_.length; i_1225_++) {
							int i_1226_ = is_1224_[i_1225_];
							if (((Class387_Sub1) this).aShortArray8023 == null || ((i_1095_ & (((Class387_Sub1) this).aShortArray8023[i_1226_])) != 0)) {
								int i_1227_ = (is_1214_[0] * (((Class387_Sub1) this).anIntArray8065[i_1226_]) + is_1214_[1] * (((Class387_Sub1) this).anIntArray8020[i_1226_]) + is_1214_[2] * (((Class387_Sub1) this).anIntArray8051[i_1226_]) + 8192) >> 14;
								int i_1228_ = (is_1214_[3] * (((Class387_Sub1) this).anIntArray8065[i_1226_]) + is_1214_[4] * (((Class387_Sub1) this).anIntArray8020[i_1226_]) + is_1214_[5] * (((Class387_Sub1) this).anIntArray8051[i_1226_]) + 8192) >> 14;
								int i_1229_ = (is_1214_[6] * (((Class387_Sub1) this).anIntArray8065[i_1226_]) + is_1214_[7] * (((Class387_Sub1) this).anIntArray8020[i_1226_]) + is_1214_[8] * (((Class387_Sub1) this).anIntArray8051[i_1226_]) + 8192) >> 14;
								i_1227_ += i_1219_;
								i_1228_ += i_1220_;
								i_1229_ += i_1221_;
								((Class387_Sub1) this).anIntArray8065[i_1226_] = i_1227_;
								((Class387_Sub1) this).anIntArray8020[i_1226_] = i_1228_;
								((Class387_Sub1) this).anIntArray8051[i_1226_] = i_1229_;
							}
						}
					}
				}
			} else {
				for (int i_1230_ = 0; i_1230_ < i_1097_; i_1230_++) {
					int i_1231_ = is[i_1230_];
					if (i_1231_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_1232_ = (((Class387_Sub1) this).anIntArrayArray8022[i_1231_]);
						for (int i_1233_ = 0; i_1233_ < is_1232_.length; i_1233_++) {
							int i_1234_ = is_1232_[i_1233_];
							if (((Class387_Sub1) this).aShortArray8023 == null || ((i_1095_ & (((Class387_Sub1) this).aShortArray8023[i_1234_])) != 0)) {
								((Class387_Sub1) this).anIntArray8065[i_1234_] -= ((Class387_Sub1) this).anInt8080;
								((Class387_Sub1) this).anIntArray8020[i_1234_] -= ((Class387_Sub1) this).anInt8061;
								((Class387_Sub1) this).anIntArray8051[i_1234_] -= ((Class387_Sub1) this).anInt8055;
								((Class387_Sub1) this).anIntArray8065[i_1234_] = (((Class387_Sub1) this).anIntArray8065[i_1234_]) * i_1092_ >> 7;
								((Class387_Sub1) this).anIntArray8020[i_1234_] = (((Class387_Sub1) this).anIntArray8020[i_1234_]) * i_1093_ >> 7;
								((Class387_Sub1) this).anIntArray8051[i_1234_] = (((Class387_Sub1) this).anIntArray8051[i_1234_]) * i_1094_ >> 7;
								((Class387_Sub1) this).anIntArray8065[i_1234_] += ((Class387_Sub1) this).anInt8080;
								((Class387_Sub1) this).anIntArray8020[i_1234_] += ((Class387_Sub1) this).anInt8061;
								((Class387_Sub1) this).anIntArray8051[i_1234_] += ((Class387_Sub1) this).anInt8055;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub1) this).anIntArrayArray8017 != null) {
				boolean bool_1235_ = false;
				for (int i_1236_ = 0; i_1236_ < i_1097_; i_1236_++) {
					int i_1237_ = is[i_1236_];
					if (i_1237_ < ((Class387_Sub1) this).anIntArrayArray8017.length) {
						int[] is_1238_ = (((Class387_Sub1) this).anIntArrayArray8017[i_1237_]);
						for (int i_1239_ = 0; i_1239_ < is_1238_.length; i_1239_++) {
							int i_1240_ = is_1238_[i_1239_];
							if (((Class387_Sub1) this).aShortArray8018 == null || ((i_1095_ & (((Class387_Sub1) this).aShortArray8018[i_1240_])) != 0)) {
								int i_1241_ = (((((Class387_Sub1) this).aByteArray8037[i_1240_]) & 0xff) + i_1092_ * 8);
								if (i_1241_ < 0)
									i_1241_ = 0;
								else if (i_1241_ > 255)
									i_1241_ = 255;
								((Class387_Sub1) this).aByteArray8037[i_1240_] = (byte) i_1241_;
							}
						}
						bool_1235_ = bool_1235_ | is_1238_.length > 0;
					}
				}
				if (bool_1235_) {
					if (((Class387_Sub1) this).aClass185Array8070 != null) {
						for (int i_1242_ = 0; i_1242_ < ((Class387_Sub1) this).anInt8069; i_1242_++) {
							Class185 class185 = (((Class387_Sub1) this).aClass185Array8070[i_1242_]);
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[i_1242_]);
							((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & 0xffffff | 255 - ((((Class387_Sub1) this).aByteArray8037[((Class185) class185).modelColorIndex]) & 0xff) << 24);
						}
					}
					method4507();
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub1) this).anIntArrayArray8017 != null) {
				boolean bool_1243_ = false;
				for (int i_1244_ = 0; i_1244_ < i_1097_; i_1244_++) {
					int i_1245_ = is[i_1244_];
					if (i_1245_ < ((Class387_Sub1) this).anIntArrayArray8017.length) {
						int[] is_1246_ = (((Class387_Sub1) this).anIntArrayArray8017[i_1245_]);
						for (int i_1247_ = 0; i_1247_ < is_1246_.length; i_1247_++) {
							int i_1248_ = is_1246_[i_1247_];
							if (((Class387_Sub1) this).aShortArray8018 == null || ((i_1095_ & (((Class387_Sub1) this).aShortArray8018[i_1248_])) != 0)) {
								int i_1249_ = ((((Class387_Sub1) this).modelColors[i_1248_]) & 0xffff);
								int i_1250_ = i_1249_ >> 10 & 0x3f;
								int i_1251_ = i_1249_ >> 7 & 0x7;
								int i_1252_ = i_1249_ & 0x7f;
								i_1250_ = i_1250_ + i_1092_ & 0x3f;
								i_1251_ += i_1093_ / 4;
								if (i_1251_ < 0)
									i_1251_ = 0;
								else if (i_1251_ > 7)
									i_1251_ = 7;
								i_1252_ += i_1094_;
								if (i_1252_ < 0)
									i_1252_ = 0;
								else if (i_1252_ > 127)
									i_1252_ = 127;
								((Class387_Sub1) this).modelColors[i_1248_] = (short) (i_1250_ << 10 | i_1251_ << 7 | i_1252_);
							}
						}
						bool_1243_ = bool_1243_ | is_1246_.length > 0;
					}
				}
				if (bool_1243_) {
					if (((Class387_Sub1) this).aClass185Array8070 != null) {
						for (int i_1253_ = 0; i_1253_ < ((Class387_Sub1) this).anInt8069; i_1253_++) {
							Class185 class185 = (((Class387_Sub1) this).aClass185Array8070[i_1253_]);
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[i_1253_]);
							((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | (Console.colorArray[((((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff)]) & 0xffffff);
						}
					}
					method4507();
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_1254_ = 0; i_1254_ < i_1097_; i_1254_++) {
					int i_1255_ = is[i_1254_];
					if (i_1255_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_1256_ = (((Class387_Sub1) this).anIntArrayArray8072[i_1255_]);
						for (int i_1257_ = 0; i_1257_ < is_1256_.length; i_1257_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_1256_[i_1257_]]);
							((Class177) class177).anInt1751 += i_1092_;
							((Class177) class177).anInt1748 += i_1093_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_1258_ = 0; i_1258_ < i_1097_; i_1258_++) {
					int i_1259_ = is[i_1258_];
					if (i_1259_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_1260_ = (((Class387_Sub1) this).anIntArrayArray8072[i_1259_]);
						for (int i_1261_ = 0; i_1261_ < is_1260_.length; i_1261_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_1260_[i_1261_]]);
							((Class177) class177).anInt1752 = (((Class177) class177).anInt1752 * i_1092_ >> 7);
							((Class177) class177).anInt1749 = (((Class177) class177).anInt1749 * i_1093_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_1262_ = 0; i_1262_ < i_1097_; i_1262_++) {
					int i_1263_ = is[i_1262_];
					if (i_1263_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_1264_ = (((Class387_Sub1) this).anIntArrayArray8072[i_1263_]);
						for (int i_1265_ = 0; i_1265_ < is_1264_.length; i_1265_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_1264_[i_1265_]]);
							((Class177) class177).anInt1753 = (((Class177) class177).anInt1753 + i_1092_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public void method4461(Class247 class247, Class80 class80, int i) {
		if (aClass172_8084 != null)
			aClass172_8084.method2048();
		if (class80 != null)
			class80.aBoolean671 = false;
		if (((Class387_Sub1) this).anInt8038 != 0) {
			Class249 class249 = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass249_8488);
			Class249 class249_1266_ = ((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8576;
			Class249 class249_1267_ = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass249_8479);
			class249_1266_.method2508(class247);
			class249_1267_.method2510(class249_1266_);
			class249_1267_.method2483(((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aClass249_8492);
			if (!((Class387_Sub1) this).aBoolean8043)
				method4501();
			float[] fs = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aFloatArray8481);
			class249_1266_.method2511(0.0F, (float) ((Class387_Sub1) this).anInt8056, 0.0F, fs);
			float f = fs[0];
			float f_1268_ = fs[1];
			float f_1269_ = fs[2];
			class249_1266_.method2511(0.0F, (float) ((Class387_Sub1) this).anInt8057, 0.0F, fs);
			float f_1270_ = fs[0];
			float f_1271_ = fs[1];
			float f_1272_ = fs[2];
			for (int i_1273_ = 0; i_1273_ < 6; i_1273_++) {
				float[] fs_1274_ = (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloatArrayArray8494[i_1273_]);
				float f_1275_ = (fs_1274_[0] * f + fs_1274_[1] * f_1268_ + fs_1274_[2] * f_1269_ + fs_1274_[3] + (float) ((Class387_Sub1) this).anInt8054);
				float f_1276_ = (fs_1274_[0] * f_1270_ + fs_1274_[1] * f_1271_ + fs_1274_[2] * f_1272_ + fs_1274_[3] + (float) ((Class387_Sub1) this).anInt8054);
				if (f_1275_ < 0.0F && f_1276_ < 0.0F)
					return;
			}
			if (class80 != null) {
				boolean bool = false;
				boolean bool_1277_ = true;
				int i_1278_ = ((((Class387_Sub1) this).anInt8058 + ((Class387_Sub1) this).anInt8059) >> 1);
				int i_1279_ = ((((Class387_Sub1) this).anInt8060 + ((Class387_Sub1) this).anInt8078) >> 1);
				int i_1280_ = i_1278_;
				int i_1281_ = ((Class387_Sub1) this).anInt8056;
				int i_1282_ = i_1279_;
				float f_1283_ = (class249_1267_.aFloatArray2631[0] * (float) i_1280_ + class249_1267_.aFloatArray2631[4] * (float) i_1281_ + class249_1267_.aFloatArray2631[8] * (float) i_1282_ + class249_1267_.aFloatArray2631[12]);
				float f_1284_ = (class249_1267_.aFloatArray2631[1] * (float) i_1280_ + class249_1267_.aFloatArray2631[5] * (float) i_1281_ + class249_1267_.aFloatArray2631[9] * (float) i_1282_ + class249_1267_.aFloatArray2631[13]);
				float f_1285_ = (class249_1267_.aFloatArray2631[2] * (float) i_1280_ + class249_1267_.aFloatArray2631[6] * (float) i_1281_ + class249_1267_.aFloatArray2631[10] * (float) i_1282_ + class249_1267_.aFloatArray2631[14]);
				float f_1286_ = (class249_1267_.aFloatArray2631[3] * (float) i_1280_ + class249_1267_.aFloatArray2631[7] * (float) i_1281_ + class249_1267_.aFloatArray2631[11] * (float) i_1282_ + class249_1267_.aFloatArray2631[15]);
				if (f_1285_ >= -f_1286_) {
					class80.anInt669 = (int) ((((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aFloat8495) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505) * f_1283_ / f_1286_);
					class80.anInt670 = (int) ((((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aFloat8497) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8498) * f_1284_ / f_1286_);
				} else
					bool = true;
				i_1280_ = i_1278_;
				i_1281_ = ((Class387_Sub1) this).anInt8057;
				i_1282_ = i_1279_;
				float f_1287_ = (class249_1267_.aFloatArray2631[0] * (float) i_1280_ + class249_1267_.aFloatArray2631[4] * (float) i_1281_ + class249_1267_.aFloatArray2631[8] * (float) i_1282_ + class249_1267_.aFloatArray2631[12]);
				float f_1288_ = (class249_1267_.aFloatArray2631[1] * (float) i_1280_ + class249_1267_.aFloatArray2631[5] * (float) i_1281_ + class249_1267_.aFloatArray2631[9] * (float) i_1282_ + class249_1267_.aFloatArray2631[13]);
				float f_1289_ = (class249_1267_.aFloatArray2631[2] * (float) i_1280_ + class249_1267_.aFloatArray2631[6] * (float) i_1281_ + class249_1267_.aFloatArray2631[10] * (float) i_1282_ + class249_1267_.aFloatArray2631[14]);
				float f_1290_ = (class249_1267_.aFloatArray2631[3] * (float) i_1280_ + class249_1267_.aFloatArray2631[7] * (float) i_1281_ + class249_1267_.aFloatArray2631[11] * (float) i_1282_ + class249_1267_.aFloatArray2631[15]);
				if (f_1289_ >= -f_1290_) {
					class80.anInt668 = (int) ((((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aFloat8495) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505) * f_1287_ / f_1290_);
					class80.anInt672 = (int) ((((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aFloat8497) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8498) * f_1288_ / f_1290_);
				} else
					bool = true;
				if (bool) {
					if (f_1285_ < -f_1286_ && f_1289_ < -f_1290_)
						bool_1277_ = false;
					else if (f_1285_ < -f_1286_) {
						float f_1291_ = (f_1285_ + f_1286_) / (f_1289_ + f_1290_) - 1.0F;
						float f_1292_ = f_1283_ + f_1291_ * (f_1287_ - f_1283_);
						float f_1293_ = f_1284_ + f_1291_ * (f_1288_ - f_1284_);
						float f_1294_ = f_1286_ + f_1291_ * (f_1290_ - f_1286_);
						class80.anInt669 = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8495) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505 * f_1292_ / f_1294_));
						class80.anInt670 = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8497) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8498 * f_1293_ / f_1294_));
					} else if (f_1289_ < -f_1290_) {
						float f_1295_ = (f_1289_ + f_1290_) / (f_1285_ + f_1286_) - 1.0F;
						float f_1296_ = f_1287_ + f_1295_ * (f_1283_ - f_1287_);
						float f_1297_ = f_1288_ + f_1295_ * (f_1284_ - f_1288_);
						float f_1298_ = f_1290_ + f_1295_ * (f_1286_ - f_1290_);
						class80.anInt668 = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8495) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505 * f_1296_ / f_1298_));
						class80.anInt672 = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8497) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8498 * f_1297_ / f_1298_));
					}
				}
				if (bool_1277_) {
					if (f_1285_ / f_1286_ > f_1289_ / f_1290_) {
						float f_1299_ = (f_1283_ + (class249.aFloatArray2631[0] * (float) ((Class387_Sub1) this).anInt8054) + class249.aFloatArray2631[12]);
						float f_1300_ = (f_1286_ + (class249.aFloatArray2631[3] * (float) ((Class387_Sub1) this).anInt8054) + class249.aFloatArray2631[15]);
						class80.anInt673 = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8495) - (float) class80.anInt669 + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505 * f_1299_ / f_1300_));
					} else {
						float f_1301_ = (f_1287_ + (class249.aFloatArray2631[0] * (float) ((Class387_Sub1) this).anInt8054) + class249.aFloatArray2631[12]);
						float f_1302_ = (f_1290_ + (class249.aFloatArray2631[3] * (float) ((Class387_Sub1) this).anInt8054) + class249.aFloatArray2631[15]);
						class80.anInt673 = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8495) - (float) class80.anInt668 + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505 * f_1301_ / f_1302_));
					}
					class80.aBoolean671 = true;
				}
			}
			((Class387_Sub1) this).aClass_ra_Sub2_8012.method4990(i);
			method4509(class247);
			((Class387_Sub1) this).aClass_ra_Sub2_8012.method4990(0);
			class249_1266_.method2508(class247);
			class249_1266_.method2483(((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8472);
			method4503(class249_1266_);
		}
	}

	public void method4440(Class247 class247, Class80 class80, int i) {
		if (aClass172_8084 != null)
			aClass172_8084.method2048();
		if (class80 != null)
			class80.aBoolean671 = false;
		if (((Class387_Sub1) this).anInt8038 != 0) {
			Class249 class249 = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass249_8488);
			Class249 class249_1303_ = ((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8576;
			Class249 class249_1304_ = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass249_8479);
			class249_1303_.method2508(class247);
			class249_1304_.method2510(class249_1303_);
			class249_1304_.method2483(((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aClass249_8492);
			if (!((Class387_Sub1) this).aBoolean8043)
				method4501();
			float[] fs = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aFloatArray8481);
			class249_1303_.method2511(0.0F, (float) ((Class387_Sub1) this).anInt8056, 0.0F, fs);
			float f = fs[0];
			float f_1305_ = fs[1];
			float f_1306_ = fs[2];
			class249_1303_.method2511(0.0F, (float) ((Class387_Sub1) this).anInt8057, 0.0F, fs);
			float f_1307_ = fs[0];
			float f_1308_ = fs[1];
			float f_1309_ = fs[2];
			for (int i_1310_ = 0; i_1310_ < 6; i_1310_++) {
				float[] fs_1311_ = (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloatArrayArray8494[i_1310_]);
				float f_1312_ = (fs_1311_[0] * f + fs_1311_[1] * f_1305_ + fs_1311_[2] * f_1306_ + fs_1311_[3] + (float) ((Class387_Sub1) this).anInt8054);
				float f_1313_ = (fs_1311_[0] * f_1307_ + fs_1311_[1] * f_1308_ + fs_1311_[2] * f_1309_ + fs_1311_[3] + (float) ((Class387_Sub1) this).anInt8054);
				if (f_1312_ < 0.0F && f_1313_ < 0.0F)
					return;
			}
			if (class80 != null) {
				boolean bool = false;
				boolean bool_1314_ = true;
				int i_1315_ = ((((Class387_Sub1) this).anInt8058 + ((Class387_Sub1) this).anInt8059) >> 1);
				int i_1316_ = ((((Class387_Sub1) this).anInt8060 + ((Class387_Sub1) this).anInt8078) >> 1);
				int i_1317_ = i_1315_;
				int i_1318_ = ((Class387_Sub1) this).anInt8056;
				int i_1319_ = i_1316_;
				float f_1320_ = (class249_1304_.aFloatArray2631[0] * (float) i_1317_ + class249_1304_.aFloatArray2631[4] * (float) i_1318_ + class249_1304_.aFloatArray2631[8] * (float) i_1319_ + class249_1304_.aFloatArray2631[12]);
				float f_1321_ = (class249_1304_.aFloatArray2631[1] * (float) i_1317_ + class249_1304_.aFloatArray2631[5] * (float) i_1318_ + class249_1304_.aFloatArray2631[9] * (float) i_1319_ + class249_1304_.aFloatArray2631[13]);
				float f_1322_ = (class249_1304_.aFloatArray2631[2] * (float) i_1317_ + class249_1304_.aFloatArray2631[6] * (float) i_1318_ + class249_1304_.aFloatArray2631[10] * (float) i_1319_ + class249_1304_.aFloatArray2631[14]);
				float f_1323_ = (class249_1304_.aFloatArray2631[3] * (float) i_1317_ + class249_1304_.aFloatArray2631[7] * (float) i_1318_ + class249_1304_.aFloatArray2631[11] * (float) i_1319_ + class249_1304_.aFloatArray2631[15]);
				if (f_1322_ >= -f_1323_) {
					class80.anInt669 = (int) ((((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aFloat8495) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505) * f_1320_ / f_1323_);
					class80.anInt670 = (int) ((((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aFloat8497) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8498) * f_1321_ / f_1323_);
				} else
					bool = true;
				i_1317_ = i_1315_;
				i_1318_ = ((Class387_Sub1) this).anInt8057;
				i_1319_ = i_1316_;
				float f_1324_ = (class249_1304_.aFloatArray2631[0] * (float) i_1317_ + class249_1304_.aFloatArray2631[4] * (float) i_1318_ + class249_1304_.aFloatArray2631[8] * (float) i_1319_ + class249_1304_.aFloatArray2631[12]);
				float f_1325_ = (class249_1304_.aFloatArray2631[1] * (float) i_1317_ + class249_1304_.aFloatArray2631[5] * (float) i_1318_ + class249_1304_.aFloatArray2631[9] * (float) i_1319_ + class249_1304_.aFloatArray2631[13]);
				float f_1326_ = (class249_1304_.aFloatArray2631[2] * (float) i_1317_ + class249_1304_.aFloatArray2631[6] * (float) i_1318_ + class249_1304_.aFloatArray2631[10] * (float) i_1319_ + class249_1304_.aFloatArray2631[14]);
				float f_1327_ = (class249_1304_.aFloatArray2631[3] * (float) i_1317_ + class249_1304_.aFloatArray2631[7] * (float) i_1318_ + class249_1304_.aFloatArray2631[11] * (float) i_1319_ + class249_1304_.aFloatArray2631[15]);
				if (f_1326_ >= -f_1327_) {
					class80.anInt668 = (int) ((((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aFloat8495) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505) * f_1324_ / f_1327_);
					class80.anInt672 = (int) ((((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aFloat8497) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8498) * f_1325_ / f_1327_);
				} else
					bool = true;
				if (bool) {
					if (f_1322_ < -f_1323_ && f_1326_ < -f_1327_)
						bool_1314_ = false;
					else if (f_1322_ < -f_1323_) {
						float f_1328_ = (f_1322_ + f_1323_) / (f_1326_ + f_1327_) - 1.0F;
						float f_1329_ = f_1320_ + f_1328_ * (f_1324_ - f_1320_);
						float f_1330_ = f_1321_ + f_1328_ * (f_1325_ - f_1321_);
						float f_1331_ = f_1323_ + f_1328_ * (f_1327_ - f_1323_);
						class80.anInt669 = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8495) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505 * f_1329_ / f_1331_));
						class80.anInt670 = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8497) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8498 * f_1330_ / f_1331_));
					} else if (f_1326_ < -f_1327_) {
						float f_1332_ = (f_1326_ + f_1327_) / (f_1322_ + f_1323_) - 1.0F;
						float f_1333_ = f_1324_ + f_1332_ * (f_1320_ - f_1324_);
						float f_1334_ = f_1325_ + f_1332_ * (f_1321_ - f_1325_);
						float f_1335_ = f_1327_ + f_1332_ * (f_1323_ - f_1327_);
						class80.anInt668 = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8495) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505 * f_1333_ / f_1335_));
						class80.anInt672 = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8497) + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8498 * f_1334_ / f_1335_));
					}
				}
				if (bool_1314_) {
					if (f_1322_ / f_1323_ > f_1326_ / f_1327_) {
						float f_1336_ = (f_1320_ + (class249.aFloatArray2631[0] * (float) ((Class387_Sub1) this).anInt8054) + class249.aFloatArray2631[12]);
						float f_1337_ = (f_1323_ + (class249.aFloatArray2631[3] * (float) ((Class387_Sub1) this).anInt8054) + class249.aFloatArray2631[15]);
						class80.anInt673 = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8495) - (float) class80.anInt669 + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505 * f_1336_ / f_1337_));
					} else {
						float f_1338_ = (f_1324_ + (class249.aFloatArray2631[0] * (float) ((Class387_Sub1) this).anInt8054) + class249.aFloatArray2631[12]);
						float f_1339_ = (f_1327_ + (class249.aFloatArray2631[3] * (float) ((Class387_Sub1) this).anInt8054) + class249.aFloatArray2631[15]);
						class80.anInt673 = (int) ((((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8495) - (float) class80.anInt668 + (((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aFloat8505 * f_1338_ / f_1339_));
					}
					class80.aBoolean671 = true;
				}
			}
			((Class387_Sub1) this).aClass_ra_Sub2_8012.method4990(i);
			method4509(class247);
			((Class387_Sub1) this).aClass_ra_Sub2_8012.method4990(0);
			class249_1303_.method2508(class247);
			class249_1303_.method2483(((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8472);
			method4503(class249_1303_);
		}
	}

	public boolean method4469(int i, int i_1340_, Class247 class247, boolean bool, int i_1341_) {
		return method4502(i, i_1340_, 0, 0, class247, bool, i_1341_);
	}

	public void method4481(Class247 class247, int i, boolean bool) {
		if (((Class387_Sub1) this).aShortArray8023 != null) {
			Class247 class247_1342_ = class247;
			if (bool) {
				class247_1342_ = ((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aClass247_8513;
				class247_1342_.method2458(class247);
			}
			float[] fs = new float[3];
			for (int i_1343_ = 0; i_1343_ < ((Class387_Sub1) this).anInt8044; i_1343_++) {
				if ((i & ((Class387_Sub1) this).aShortArray8023[i_1343_]) != 0) {
					class247_1342_.method2465((float) (((Class387_Sub1) this).anIntArray8065[i_1343_]), (float) (((Class387_Sub1) this).anIntArray8020[i_1343_]), (float) (((Class387_Sub1) this).anIntArray8051[i_1343_]), fs);
					((Class387_Sub1) this).anIntArray8065[i_1343_] = (int) fs[0];
					((Class387_Sub1) this).anIntArray8020[i_1343_] = (int) fs[1];
					((Class387_Sub1) this).anIntArray8051[i_1343_] = (int) fs[2];
				}
			}
		}
	}

	public Class_na ce(Class_na class_na) {
		if (((Class387_Sub1) this).anInt8038 == 0)
			return null;
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		int i;
		int i_1344_;
		if ((((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8541) > 0) {
			i = ((((Class387_Sub1) this).anInt8058 - ((((Class387_Sub1) this).anInt8057 * ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8541) >> 8)) >> ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8536);
			i_1344_ = ((((Class387_Sub1) this).anInt8059 - ((((Class387_Sub1) this).anInt8056 * ((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).anInt8541) >> 8)) >> ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8536);
		} else {
			i = ((((Class387_Sub1) this).anInt8058 - ((((Class387_Sub1) this).anInt8056 * ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8541) >> 8)) >> ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8536);
			i_1344_ = ((((Class387_Sub1) this).anInt8059 - ((((Class387_Sub1) this).anInt8057 * ((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).anInt8541) >> 8)) >> ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8536);
		}
		int i_1345_;
		int i_1346_;
		if ((((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8599) > 0) {
			i_1345_ = ((((Class387_Sub1) this).anInt8060 - ((((Class387_Sub1) this).anInt8057 * ((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).anInt8599) >> 8)) >> ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8536);
			i_1346_ = ((((Class387_Sub1) this).anInt8078 - ((((Class387_Sub1) this).anInt8056 * ((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).anInt8599) >> 8)) >> ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8536);
		} else {
			i_1345_ = ((((Class387_Sub1) this).anInt8060 - ((((Class387_Sub1) this).anInt8056 * ((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).anInt8599) >> 8)) >> ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8536);
			i_1346_ = ((((Class387_Sub1) this).anInt8078 - ((((Class387_Sub1) this).anInt8057 * ((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).anInt8599) >> 8)) >> ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8536);
		}
		int i_1347_ = i_1344_ - i + 1;
		int i_1348_ = i_1346_ - i_1345_ + 1;
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		Class_na_Sub1 class_na_sub1_1349_;
		if (class_na_sub1 != null && class_na_sub1.method3528(i_1347_, i_1348_)) {
			class_na_sub1_1349_ = class_na_sub1;
			class_na_sub1_1349_.method3525();
		} else
			class_na_sub1_1349_ = new Class_na_Sub1(((Class387_Sub1) this).aClass_ra_Sub2_8012, i_1347_, i_1348_);
		class_na_sub1_1349_.method3524(i, i_1345_, i_1344_, i_1346_);
		method4508(class_na_sub1_1349_);
		return class_na_sub1_1349_;
	}

	public int cz() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8054;
	}

	public int cj() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8027;
	}

	public int cy() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8027;
	}

	public int cb() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8027;
	}

	public void bk(int i) {
		int i_1350_ = Class257.anIntArray2683[i];
		int i_1351_ = Class257.anIntArray2684[i];
		for (int i_1352_ = 0; i_1352_ < ((Class387_Sub1) this).anInt8044; i_1352_++) {
			int i_1353_ = ((((Class387_Sub1) this).anIntArray8020[i_1352_] * i_1350_ + ((Class387_Sub1) this).anIntArray8065[i_1352_] * i_1351_) >> 14);
			((Class387_Sub1) this).anIntArray8020[i_1352_] = ((((Class387_Sub1) this).anIntArray8020[i_1352_] * i_1351_ - ((Class387_Sub1) this).anIntArray8065[i_1352_] * i_1350_) >> 14);
			((Class387_Sub1) this).anIntArray8065[i_1352_] = i_1353_;
		}
		method4498();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public int cd() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8059;
	}

	public int co() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8056;
	}

	public void br(int i) {
		int i_1354_ = Class257.anIntArray2683[i];
		int i_1355_ = Class257.anIntArray2684[i];
		for (int i_1356_ = 0; i_1356_ < ((Class387_Sub1) this).anInt8044; i_1356_++) {
			int i_1357_ = ((((Class387_Sub1) this).anIntArray8020[i_1356_] * i_1354_ + ((Class387_Sub1) this).anIntArray8065[i_1356_] * i_1355_) >> 14);
			((Class387_Sub1) this).anIntArray8020[i_1356_] = ((((Class387_Sub1) this).anIntArray8020[i_1356_] * i_1355_ - ((Class387_Sub1) this).anIntArray8065[i_1356_] * i_1354_) >> 14);
			((Class387_Sub1) this).anIntArray8065[i_1356_] = i_1357_;
		}
		method4498();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	Class387_Sub1(Class_ra_Sub2 class_ra_sub2, int i, int i_1358_, boolean bool, boolean bool_1359_) {
		((Class387_Sub1) this).anInt8038 = 0;
		((Class387_Sub1) this).anInt8034 = 0;
		((Class387_Sub1) this).anInt8035 = 0;
		((Class387_Sub1) this).aBoolean8049 = false;
		((Class387_Sub1) this).aBoolean8066 = true;
		((Class387_Sub1) this).aBoolean8067 = false;
		((Class387_Sub1) this).aBoolean8042 = false;
		((Class387_Sub1) this).aBoolean8043 = false;
		((Class387_Sub1) this).aFloatArray8074 = new float[2];
		((Class387_Sub1) this).anIntArray8010 = new int[1];
		((Class387_Sub1) this).anIntArray8076 = new int[1];
		((Class387_Sub1) this).anIntArray8077 = new int[8];
		((Class387_Sub1) this).anIntArray8029 = new int[8];
		((Class387_Sub1) this).anIntArray8079 = new int[8];
		((Class387_Sub1) this).aClass_ra_Sub2_8012 = class_ra_sub2;
		((Class387_Sub1) this).anInt8013 = i;
		((Class387_Sub1) this).anInt8081 = i_1358_;
		((Class387_Sub1) this).aBoolean8049 = bool_1359_;
		if (bool || Class160.method1899(((Class387_Sub1) this).anInt8013, ((Class387_Sub1) this).anInt8081))
			((Class387_Sub1) this).aClass173_8045 = new Class173(Class160.method1892((((Class387_Sub1) this).anInt8013), (((Class387_Sub1) this).anInt8081)));
		if (bool || Class160.method1890(((Class387_Sub1) this).anInt8013, ((Class387_Sub1) this).anInt8081))
			((Class387_Sub1) this).aClass173_8021 = new Class173(Class160.method1894((((Class387_Sub1) this).anInt8013), (((Class387_Sub1) this).anInt8081)));
		if (bool || Class160.method1889(((Class387_Sub1) this).anInt8013, ((Class387_Sub1) this).anInt8081))
			((Class387_Sub1) this).aClass173_8046 = new Class173(Class160.method1908((((Class387_Sub1) this).anInt8013), (((Class387_Sub1) this).anInt8081)));
		if (bool || Class160.method1888(((Class387_Sub1) this).anInt8013, ((Class387_Sub1) this).anInt8081))
			((Class387_Sub1) this).aClass173_8047 = new Class173(Class160.method1893((((Class387_Sub1) this).anInt8013), (((Class387_Sub1) this).anInt8081)));
		if (bool || Class160.method1891(((Class387_Sub1) this).anInt8013, ((Class387_Sub1) this).anInt8081))
			((Class387_Sub1) this).aClass165_8050 = new Class165(Class160.method1895((((Class387_Sub1) this).anInt8013), (((Class387_Sub1) this).anInt8081)));
		if (bool && bool_1359_) {
			((Class173) ((Class387_Sub1) this).aClass173_8045).anInterface9_Impl1_1734 = ((Class173) ((Class387_Sub1) this).aClass173_8045).anInterface9_Impl1_1733 = ((Class387_Sub1) this).aClass_ra_Sub2_8012.method4976(((Class387_Sub1) this).aBoolean8049);
			((Class173) ((Class387_Sub1) this).aClass173_8021).anInterface9_Impl1_1734 = ((Class173) ((Class387_Sub1) this).aClass173_8021).anInterface9_Impl1_1733 = ((Class387_Sub1) this).aClass_ra_Sub2_8012.method4976(((Class387_Sub1) this).aBoolean8049);
			((Class173) ((Class387_Sub1) this).aClass173_8046).anInterface9_Impl1_1734 = ((Class173) ((Class387_Sub1) this).aClass173_8046).anInterface9_Impl1_1733 = ((Class387_Sub1) this).aClass_ra_Sub2_8012.method4976(((Class387_Sub1) this).aBoolean8049);
			((Class173) ((Class387_Sub1) this).aClass173_8047).anInterface9_Impl1_1734 = ((Class173) ((Class387_Sub1) this).aClass173_8047).anInterface9_Impl1_1733 = ((Class387_Sub1) this).aClass_ra_Sub2_8012.method4976(((Class387_Sub1) this).aBoolean8049);
		}
	}

	public int cq() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8057;
	}

	public int ci() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8057;
	}

	void method4507() {
		if (((Class387_Sub1) this).aClass173_8046 != null)
			((Class173) ((Class387_Sub1) this).aClass173_8046).aBoolean1732 = false;
	}

	public int cr() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8078;
	}

	public void cv(int i) {
		((Class387_Sub1) this).aShort8015 = (short) i;
		method4507();
	}

	void ka() {
		for (int i = 0; i < ((Class387_Sub1) this).anInt8014; i++) {
			((Class387_Sub1) this).anIntArray8065[i] = ((Class387_Sub1) this).anIntArray8065[i] + 7 >> 4;
			((Class387_Sub1) this).anIntArray8020[i] = ((Class387_Sub1) this).anIntArray8020[i] + 7 >> 4;
			((Class387_Sub1) this).anIntArray8051[i] = ((Class387_Sub1) this).anIntArray8051[i] + 7 >> 4;
		}
		method4498();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public void cp(int i) {
		((Class387_Sub1) this).aShort8015 = (short) i;
		method4507();
	}

	void method4508(Class_na_Sub1 class_na_sub1) {
		if (((Class387_Sub1) this).anIntArray8010.length < ((Class387_Sub1) this).anInt8038) {
			((Class387_Sub1) this).anIntArray8010 = new int[((Class387_Sub1) this).anInt8038];
			((Class387_Sub1) this).anIntArray8076 = new int[((Class387_Sub1) this).anInt8038];
		}
		for (int i = 0; i < ((Class387_Sub1) this).anInt8044; i++) {
			int i_1360_ = (((((Class387_Sub1) this).anIntArray8065[i] - ((((Class387_Sub1) this).anIntArray8020[i] * ((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).anInt8541) >> 8)) >> ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8536) - ((Class_na_Sub1) class_na_sub1).anInt10158);
			int i_1361_ = (((((Class387_Sub1) this).anIntArray8051[i] - ((((Class387_Sub1) this).anIntArray8020[i] * ((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).anInt8599) >> 8)) >> ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8536) - ((Class_na_Sub1) class_na_sub1).anInt10156);
			int i_1362_ = ((Class387_Sub1) this).anIntArray8082[i];
			int i_1363_ = ((Class387_Sub1) this).anIntArray8082[i + 1];
			for (int i_1364_ = i_1362_; i_1364_ < i_1363_; i_1364_++) {
				int i_1365_ = ((Class387_Sub1) this).aShortArray8052[i_1364_] - 1;
				if (i_1365_ == -1)
					break;
				((Class387_Sub1) this).anIntArray8010[i_1365_] = i_1360_;
				((Class387_Sub1) this).anIntArray8076[i_1365_] = i_1361_;
			}
		}
		for (int i = 0; i < ((Class387_Sub1) this).anInt8035; i++) {
			if (((Class387_Sub1) this).aByteArray8037 == null || ((Class387_Sub1) this).aByteArray8037[i] <= 128) {
				short i_1366_ = ((Class387_Sub1) this).aShortArray8016[i];
				short i_1367_ = ((Class387_Sub1) this).aShortArray8039[i];
				short i_1368_ = ((Class387_Sub1) this).aShortArray8040[i];
				int i_1369_ = ((Class387_Sub1) this).anIntArray8010[i_1366_];
				int i_1370_ = ((Class387_Sub1) this).anIntArray8010[i_1367_];
				int i_1371_ = ((Class387_Sub1) this).anIntArray8010[i_1368_];
				int i_1372_ = ((Class387_Sub1) this).anIntArray8076[i_1366_];
				int i_1373_ = ((Class387_Sub1) this).anIntArray8076[i_1367_];
				int i_1374_ = ((Class387_Sub1) this).anIntArray8076[i_1368_];
				if (((i_1369_ - i_1370_) * (i_1373_ - i_1374_) - (i_1373_ - i_1372_) * (i_1371_ - i_1370_)) > 0)
					class_na_sub1.method3527(i_1372_, i_1373_, i_1374_, i_1369_, i_1370_, i_1371_);
			}
		}
	}

	public void cu(int i) {
		((Class387_Sub1) this).aShort8083 = (short) i;
		method4498();
		method4499();
	}

	public Class64[] method4484() {
		return ((Class387_Sub1) this).aClass64Array8068;
	}

	public void cf(int i) {
		((Class387_Sub1) this).aShort8083 = (short) i;
		method4498();
		method4499();
	}

	public int cx() {
		return ((Class387_Sub1) this).aShort8015;
	}

	public int cc() {
		return ((Class387_Sub1) this).aShort8015;
	}

	public int db() {
		return ((Class387_Sub1) this).aShort8083;
	}

	public int ds() {
		return ((Class387_Sub1) this).aShort8083;
	}

	void method4509(Class247 class247) {
		if (((Class387_Sub1) this).anInt8035 != 0 && (method4512() && method4504())) {
			if (aClass172_8084 == null) {
				/* empty */
			}
			((Class387_Sub1) this).aClass_ra_Sub2_8012.method5013();
			Class140 class140 = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass140_8474);
			((Class387_Sub1) this).aClass_ra_Sub2_8012.method5081(0, (((Class173) ((Class387_Sub1) this).aClass173_8045).anInterface9_Impl1_1733));
			((Class387_Sub1) this).aClass_ra_Sub2_8012.method5081(1, (((Class173) ((Class387_Sub1) this).aClass173_8046).anInterface9_Impl1_1733));
			((Class387_Sub1) this).aClass_ra_Sub2_8012.method5081(2, (((Class173) ((Class387_Sub1) this).aClass173_8021).anInterface9_Impl1_1733));
			((Class387_Sub1) this).aClass_ra_Sub2_8012.method4979(((Class165) ((Class387_Sub1) this).aClass165_8050).anInterface9_Impl2_1698);
			((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8576.method2508(class247);
			class140.method1618(((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8576);
			class140.aClass249_1546.method2516();
			if (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aBoolean8571) {
				Class77 class77 = ((Class387_Sub1) this).aClass_ra_Sub2_8012.method4969();
				class140.aClass261_1551.method2588(0.0F, 1.0F, 0.0F, (float) -(((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).anInt8573));
				class140.aClass261_1551.method2583(3.0F / (float) (class77.anInt650 * -348036733));
				class140.aClass260_1547.method2553(((float) (class77.anInt652 * -576105833 >> 16 & 0xff) / 255.0F), ((float) (class77.anInt652 * -576105833 >> 8 & 0xff) / 255.0F), ((float) (class77.anInt652 * -576105833 >> 0 & 0xff) / 255.0F));
			} else {
				class140.aClass261_1551.method2588(0.0F, 0.0F, 0.0F, 0.0F);
				class140.aClass260_1547.method2553(0.0F, 0.0F, 0.0F);
			}
			if (((Class387_Sub1) this).aClass_ra_Sub2_8012.anInt8578 > 0) {
				class140.aClass261_1548.method2588(0.0F, 0.0F, 1.0F, -(((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8580));
				class140.aClass260_1549.method2553((float) ((((Class387_Sub1) this).aClass_ra_Sub2_8012.anInt8476) >> 16 & 0xff) / 255.0F, (float) ((((Class387_Sub1) this).aClass_ra_Sub2_8012.anInt8476) >> 8 & 0xff) / 255.0F, (float) ((((Class387_Sub1) this).aClass_ra_Sub2_8012.anInt8476) >> 0 & 0xff) / 255.0F);
				((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8576.method2508(class247);
				((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8576.method2501();
				class140.aClass261_1551.method2589(((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8576);
				((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8576.method2508(class247);
				((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8576.method2483(((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8472);
				((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8576.method2501();
				class140.aClass261_1548.method2589(((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8576);
				class140.aClass261_1548.method2583(1.0F / ((((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8581) - (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8580)));
			} else {
				class140.aClass261_1548.method2588(0.0F, 0.0F, 0.0F, 0.0F);
				class140.aClass260_1549.method2553(0.0F, 0.0F, 0.0F);
			}
			if ((((Class387_Sub1) this).anInt8081 & 0x37) == 0) {
				((Class387_Sub1) this).aClass_ra_Sub2_8012.method4978(((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aClass184_8604);
				if (((Class387_Sub1) this).aClass_ra_Sub2_8012.aBoolean8601)
					((Class387_Sub1) this).aClass_ra_Sub2_8012.method4995(false);
				for (int i = 0; i < ((Class387_Sub1) this).anIntArray8063.length; i++) {
					int i_1375_ = ((Class387_Sub1) this).anIntArray8062[i];
					int i_1376_ = ((Class387_Sub1) this).anIntArray8062[i + 1];
					int i_1377_ = (((Class387_Sub1) this).modelTextures[i_1375_] & 0xffff);
					boolean bool = false;
					if (i_1377_ != 65535) {
						class140.anInterface11_Impl3_1540 = ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass188_8552.method2093(i_1377_);
						Class56 class56 = ((Class387_Sub1) this).aClass_ra_Sub2_8012.anInterface_ma4227.method221(i_1377_, -679695367);
						bool = !Class376.method4368(class56.aByte525, -1500938962);
						class140.aClass249_1546.aFloatArray2631[12] = ((float) ((((Class387_Sub1) this).aClass_ra_Sub2_8012.anInt8588) % 128000) / 1000.0F * (float) class56.aByte531 / 64.0F % 1.0F);
						class140.aClass249_1546.aFloatArray2631[13] = ((float) ((((Class387_Sub1) this).aClass_ra_Sub2_8012.anInt8588) % 128000) / 1000.0F * (float) class56.aByte530 / 64.0F % 1.0F);
					} else {
						class140.anInterface11_Impl3_1540 = (((Class387_Sub1) this).aClass_ra_Sub2_8012.anInterface11_Impl3_8551);
						float[] fs = class140.aClass249_1546.aFloatArray2631;
						class140.aClass249_1546.aFloatArray2631[13] = 0.0F;
						fs[12] = 0.0F;
					}
					class140.anInt1555 = ((Class387_Sub1) this).anIntArray8063[i];
					class140.anInt1556 = ((Class387_Sub1) this).anIntArray8064[i];
					class140.anInt1557 = i_1375_ * 3;
					class140.anInt1552 = i_1376_ - i_1375_;
					class140.method1619(bool);
				}
			} else {
				((Class387_Sub1) this).aClass_ra_Sub2_8012.method5081(3, (((Class173) ((Class387_Sub1) this).aClass173_8047).anInterface9_Impl1_1733));
				((Class387_Sub1) this).aClass_ra_Sub2_8012.method4978(((Class_ra_Sub2) (((Class387_Sub1) this).aClass_ra_Sub2_8012)).aClass184_8605);
				Class247 class247_1378_ = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass247_8513);
				class247_1378_.method2454(class247);
				class247_1378_.method2459();
				int i = 0;
				if (((Class387_Sub1) this).aClass_ra_Sub2_8012.aBoolean8601)
					((Class387_Sub1) this).aClass_ra_Sub2_8012.method4995(true);
				else {
					class140.aClass260_1542.method2553((((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloatArray8525[0]), (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloatArray8525[1]), (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloatArray8525[2]));
					class140.aClass260_1542.method2575(class247_1378_);
					class140.aClass260_1544.method2553((((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8489 * (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8530)), (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8489 * (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8500)), (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8489 * (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8532)));
					class140.aClass260_1543.method2553((-(((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8535) * (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8530)), (-(((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8535) * (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8500)), (-(((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8535) * (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8532)));
					class140.aClass260_1553.method2553((((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8533 * (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8530)), (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8533 * (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8500)), (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8533 * (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8532)));
					if (((Class387_Sub1) this).aClass_ra_Sub2_8012.anInt8537 > 0) {
						i = (((Class387_Sub1) this).aClass_ra_Sub2_8012.anInt8537);
						Class260 class260 = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass260_8544);
						for (int i_1379_ = 0; i_1379_ < i; i_1379_++) {
							Class330_Sub14 class330_sub14 = (((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass330_Sub14Array8607[i_1379_]);
							int i_1380_ = class330_sub14.method3313(-1528495372);
							class260.method2582(class330_sub14.aClass260_7608);
							class260.method2573(class247_1378_);
							class140.aFloatArray1539[i_1379_ * 4 + 0] = class260.aFloat2716;
							class140.aFloatArray1539[i_1379_ * 4 + 1] = class260.aFloat2715;
							class140.aFloatArray1539[i_1379_ * 4 + 2] = class260.aFloat2711;
							class140.aFloatArray1539[i_1379_ * 4 + 3] = (float) (class330_sub14.method3316((byte) -11) * class330_sub14.method3316((byte) -10));
							float f = (class330_sub14.method3317(1109174114) / 255.0F);
							class140.aFloatArray1538[i_1379_ * 4 + 0] = (float) (i_1380_ >> 16 & 0xff) * f;
							class140.aFloatArray1538[i_1379_ * 4 + 1] = (float) (i_1380_ >> 8 & 0xff) * f;
							class140.aFloatArray1538[i_1379_ * 4 + 2] = (float) (i_1380_ & 0xff) * f;
							class140.aFloatArray1538[i_1379_ * 4 + 3] = 1.0F;
						}
					}
				}
				for (int i_1381_ = 0; i_1381_ < ((Class387_Sub1) this).anIntArray8063.length; i_1381_++) {
					int i_1382_ = ((Class387_Sub1) this).anIntArray8062[i_1381_];
					int i_1383_ = ((Class387_Sub1) this).anIntArray8062[i_1381_ + 1];
					int i_1384_ = (((Class387_Sub1) this).modelTextures[i_1382_] & 0xffff);
					byte i_1385_ = 11;
					if (i_1384_ != 65535) {
						class140.anInterface11_Impl3_1540 = ((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass188_8552.method2093(i_1384_);
						Class56 class56 = ((Class387_Sub1) this).aClass_ra_Sub2_8012.anInterface_ma4227.method221(i_1384_, 1186661787);
						i_1385_ = class56.aByte525;
						class140.method1617(class56);
						class140.aClass249_1546.aFloatArray2631[12] = ((float) ((((Class387_Sub1) this).aClass_ra_Sub2_8012.anInt8588) % 128000) / 1000.0F * (float) class56.aByte531 / 64.0F % 1.0F);
						class140.aClass249_1546.aFloatArray2631[13] = ((float) ((((Class387_Sub1) this).aClass_ra_Sub2_8012.anInt8588) % 128000) / 1000.0F * (float) class56.aByte530 / 64.0F % 1.0F);
					} else {
						class140.anInterface11_Impl3_1540 = (((Class387_Sub1) this).aClass_ra_Sub2_8012.anInterface11_Impl3_8551);
						float[] fs = class140.aClass249_1546.aFloatArray2631;
						class140.aClass249_1546.aFloatArray2631[13] = 0.0F;
						fs[12] = 0.0F;
					}
					class140.anInt1555 = ((Class387_Sub1) this).anIntArray8063[i_1381_];
					class140.anInt1556 = ((Class387_Sub1) this).anIntArray8064[i_1381_];
					class140.anInt1557 = i_1382_ * 3;
					class140.anInt1552 = i_1383_ - i_1382_;
					switch (i_1385_) {
					case 5:
						if (!((Class387_Sub1) this).aClass_ra_Sub2_8012.aBoolean8601) {
							Class164_Sub1_Sub1 class164_sub1_sub1 = (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass164_Sub1_Sub1_8565);
							Class56 class56 = ((Class387_Sub1) this).aClass_ra_Sub2_8012.anInterface_ma4227.method221(i_1384_, -985508744);
							class164_sub1_sub1.method1952(class56.aByte526, (class56.anInt527 * -2120684159), 203281509);
							class164_sub1_sub1.aClass249_9446.method2508(class247);
							class164_sub1_sub1.aClass249_9437.method2508(class247);
							class164_sub1_sub1.aClass249_9437.method2483(((Class387_Sub1) this).aClass_ra_Sub2_8012.aClass249_8493);
							class164_sub1_sub1.anInt9445 = (((Class387_Sub1) this).anIntArray8063[i_1381_]) * -1189846023;
							class164_sub1_sub1.anInt9431 = (((Class387_Sub1) this).anIntArray8064[i_1381_]) * 1904336151;
							class164_sub1_sub1.anInt9447 = i_1382_ * -19494437;
							class164_sub1_sub1.anInt9448 = (i_1383_ - i_1382_) * 2094958721;
							class164_sub1_sub1.method1953(16711935);
						} else
							class140.method1620(i);
						break;
					case 1:
						class140.aClass260_1536.method2553((((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass249_8473.aFloatArray2631[12]), (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass249_8473.aFloatArray2631[13]), (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass249_8473.aFloatArray2631[14]));
						class140.aClass260_1536.method2573(class247_1378_);
						class140.method1621(i);
						break;
					default:
						class140.method1620(i);
						break;
					case 7:
						class140.aClass260_1536.method2553((((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass249_8473.aFloatArray2631[12]), (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass249_8473.aFloatArray2631[13]), (((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass249_8473.aFloatArray2631[14]));
						class140.aClass260_1536.method2573(class247_1378_);
						class140.aClass249_1554.method2508(class247);
						class140.anInterface11_Impl1_1550 = ((Class387_Sub1) this).aClass_ra_Sub2_8012.method5012();
						class140.method1622(i);
						break;
					case 6:
						class140.method1619(!Class376.method4368(i_1385_, -1929117257));
					}
				}
			}
			method4510();
		}
	}

	void method4473(int i, int[] is, int i_1386_, int i_1387_, int i_1388_, int i_1389_, boolean bool) {
		int i_1390_ = is.length;
		if (i == 0) {
			i_1386_ <<= 4;
			i_1387_ <<= 4;
			i_1388_ <<= 4;
			int i_1391_ = 0;
			((Class387_Sub1) this).anInt8080 = 0;
			((Class387_Sub1) this).anInt8061 = 0;
			((Class387_Sub1) this).anInt8055 = 0;
			for (int i_1392_ = 0; i_1392_ < i_1390_; i_1392_++) {
				int i_1393_ = is[i_1392_];
				if (i_1393_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_1394_ = ((Class387_Sub1) this).anIntArrayArray8022[i_1393_];
					for (int i_1395_ = 0; i_1395_ < is_1394_.length; i_1395_++) {
						int i_1396_ = is_1394_[i_1395_];
						((Class387_Sub1) this).anInt8080 += ((Class387_Sub1) this).anIntArray8065[i_1396_];
						((Class387_Sub1) this).anInt8061 += ((Class387_Sub1) this).anIntArray8020[i_1396_];
						((Class387_Sub1) this).anInt8055 += ((Class387_Sub1) this).anIntArray8051[i_1396_];
						i_1391_++;
					}
				}
			}
			if (i_1391_ > 0) {
				((Class387_Sub1) this).anInt8080 = ((Class387_Sub1) this).anInt8080 / i_1391_ + i_1386_;
				((Class387_Sub1) this).anInt8061 = ((Class387_Sub1) this).anInt8061 / i_1391_ + i_1387_;
				((Class387_Sub1) this).anInt8055 = ((Class387_Sub1) this).anInt8055 / i_1391_ + i_1388_;
			} else {
				((Class387_Sub1) this).anInt8080 = i_1386_;
				((Class387_Sub1) this).anInt8061 = i_1387_;
				((Class387_Sub1) this).anInt8055 = i_1388_;
			}
		} else if (i == 1) {
			i_1386_ <<= 4;
			i_1387_ <<= 4;
			i_1388_ <<= 4;
			for (int i_1397_ = 0; i_1397_ < i_1390_; i_1397_++) {
				int i_1398_ = is[i_1397_];
				if (i_1398_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_1399_ = ((Class387_Sub1) this).anIntArrayArray8022[i_1398_];
					for (int i_1400_ = 0; i_1400_ < is_1399_.length; i_1400_++) {
						int i_1401_ = is_1399_[i_1400_];
						((Class387_Sub1) this).anIntArray8065[i_1401_] += i_1386_;
						((Class387_Sub1) this).anIntArray8020[i_1401_] += i_1387_;
						((Class387_Sub1) this).anIntArray8051[i_1401_] += i_1388_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1402_ = 0; i_1402_ < i_1390_; i_1402_++) {
				int i_1403_ = is[i_1402_];
				if (i_1403_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_1404_ = ((Class387_Sub1) this).anIntArrayArray8022[i_1403_];
					if ((i_1389_ & 0x1) == 0) {
						for (int i_1405_ = 0; i_1405_ < is_1404_.length; i_1405_++) {
							int i_1406_ = is_1404_[i_1405_];
							((Class387_Sub1) this).anIntArray8065[i_1406_] -= ((Class387_Sub1) this).anInt8080;
							((Class387_Sub1) this).anIntArray8020[i_1406_] -= ((Class387_Sub1) this).anInt8061;
							((Class387_Sub1) this).anIntArray8051[i_1406_] -= ((Class387_Sub1) this).anInt8055;
							if (i_1388_ != 0) {
								int i_1407_ = Class257.anIntArray2683[i_1388_];
								int i_1408_ = Class257.anIntArray2684[i_1388_];
								int i_1409_ = (((((Class387_Sub1) this).anIntArray8020[i_1406_]) * i_1407_ + (((Class387_Sub1) this).anIntArray8065[i_1406_]) * i_1408_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8020[i_1406_] = ((((Class387_Sub1) this).anIntArray8020[i_1406_]) * i_1408_ - (((Class387_Sub1) this).anIntArray8065[i_1406_]) * i_1407_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8065[i_1406_] = i_1409_;
							}
							if (i_1386_ != 0) {
								int i_1410_ = Class257.anIntArray2683[i_1386_];
								int i_1411_ = Class257.anIntArray2684[i_1386_];
								int i_1412_ = (((((Class387_Sub1) this).anIntArray8020[i_1406_]) * i_1411_ - (((Class387_Sub1) this).anIntArray8051[i_1406_]) * i_1410_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8051[i_1406_] = ((((Class387_Sub1) this).anIntArray8020[i_1406_]) * i_1410_ + (((Class387_Sub1) this).anIntArray8051[i_1406_]) * i_1411_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8020[i_1406_] = i_1412_;
							}
							if (i_1387_ != 0) {
								int i_1413_ = Class257.anIntArray2683[i_1387_];
								int i_1414_ = Class257.anIntArray2684[i_1387_];
								int i_1415_ = (((((Class387_Sub1) this).anIntArray8051[i_1406_]) * i_1413_ + (((Class387_Sub1) this).anIntArray8065[i_1406_]) * i_1414_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8051[i_1406_] = ((((Class387_Sub1) this).anIntArray8051[i_1406_]) * i_1414_ - (((Class387_Sub1) this).anIntArray8065[i_1406_]) * i_1413_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8065[i_1406_] = i_1415_;
							}
							((Class387_Sub1) this).anIntArray8065[i_1406_] += ((Class387_Sub1) this).anInt8080;
							((Class387_Sub1) this).anIntArray8020[i_1406_] += ((Class387_Sub1) this).anInt8061;
							((Class387_Sub1) this).anIntArray8051[i_1406_] += ((Class387_Sub1) this).anInt8055;
						}
					} else {
						for (int i_1416_ = 0; i_1416_ < is_1404_.length; i_1416_++) {
							int i_1417_ = is_1404_[i_1416_];
							((Class387_Sub1) this).anIntArray8065[i_1417_] -= ((Class387_Sub1) this).anInt8080;
							((Class387_Sub1) this).anIntArray8020[i_1417_] -= ((Class387_Sub1) this).anInt8061;
							((Class387_Sub1) this).anIntArray8051[i_1417_] -= ((Class387_Sub1) this).anInt8055;
							if (i_1386_ != 0) {
								int i_1418_ = Class257.anIntArray2683[i_1386_];
								int i_1419_ = Class257.anIntArray2684[i_1386_];
								int i_1420_ = (((((Class387_Sub1) this).anIntArray8020[i_1417_]) * i_1419_ - (((Class387_Sub1) this).anIntArray8051[i_1417_]) * i_1418_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8051[i_1417_] = ((((Class387_Sub1) this).anIntArray8020[i_1417_]) * i_1418_ + (((Class387_Sub1) this).anIntArray8051[i_1417_]) * i_1419_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8020[i_1417_] = i_1420_;
							}
							if (i_1388_ != 0) {
								int i_1421_ = Class257.anIntArray2683[i_1388_];
								int i_1422_ = Class257.anIntArray2684[i_1388_];
								int i_1423_ = (((((Class387_Sub1) this).anIntArray8020[i_1417_]) * i_1421_ + (((Class387_Sub1) this).anIntArray8065[i_1417_]) * i_1422_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8020[i_1417_] = ((((Class387_Sub1) this).anIntArray8020[i_1417_]) * i_1422_ - (((Class387_Sub1) this).anIntArray8065[i_1417_]) * i_1421_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8065[i_1417_] = i_1423_;
							}
							if (i_1387_ != 0) {
								int i_1424_ = Class257.anIntArray2683[i_1387_];
								int i_1425_ = Class257.anIntArray2684[i_1387_];
								int i_1426_ = (((((Class387_Sub1) this).anIntArray8051[i_1417_]) * i_1424_ + (((Class387_Sub1) this).anIntArray8065[i_1417_]) * i_1425_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray8051[i_1417_] = ((((Class387_Sub1) this).anIntArray8051[i_1417_]) * i_1425_ - (((Class387_Sub1) this).anIntArray8065[i_1417_]) * i_1424_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray8065[i_1417_] = i_1426_;
							}
							((Class387_Sub1) this).anIntArray8065[i_1417_] += ((Class387_Sub1) this).anInt8080;
							((Class387_Sub1) this).anIntArray8020[i_1417_] += ((Class387_Sub1) this).anInt8061;
							((Class387_Sub1) this).anIntArray8051[i_1417_] += ((Class387_Sub1) this).anInt8055;
						}
					}
				}
			}
			if (bool) {
				for (int i_1427_ = 0; i_1427_ < i_1390_; i_1427_++) {
					int i_1428_ = is[i_1427_];
					if (i_1428_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_1429_ = (((Class387_Sub1) this).anIntArrayArray8022[i_1428_]);
						for (int i_1430_ = 0; i_1430_ < is_1429_.length; i_1430_++) {
							int i_1431_ = is_1429_[i_1430_];
							int i_1432_ = (((Class387_Sub1) this).anIntArray8082[i_1431_]);
							int i_1433_ = (((Class387_Sub1) this).anIntArray8082[i_1431_ + 1]);
							for (int i_1434_ = i_1432_; i_1434_ < i_1433_; i_1434_++) {
								int i_1435_ = ((((Class387_Sub1) this).aShortArray8052[i_1434_]) - 1);
								if (i_1435_ == -1)
									break;
								if (i_1388_ != 0) {
									int i_1436_ = Class257.anIntArray2683[i_1388_];
									int i_1437_ = Class257.anIntArray2684[i_1388_];
									int i_1438_ = (((((Class387_Sub1) this).aShortArray8028[i_1435_]) * i_1436_ + (((Class387_Sub1) this).aShortArray8032[i_1435_]) * i_1437_ + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8028[i_1435_] = (short) (((((Class387_Sub1) this).aShortArray8028[i_1435_]) * i_1437_ - (((Class387_Sub1) this).aShortArray8032[i_1435_]) * i_1436_ + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8032[i_1435_] = (short) i_1438_;
								}
								if (i_1386_ != 0) {
									int i_1439_ = Class257.anIntArray2683[i_1386_];
									int i_1440_ = Class257.anIntArray2684[i_1386_];
									int i_1441_ = (((((Class387_Sub1) this).aShortArray8028[i_1435_]) * i_1440_ - (((Class387_Sub1) this).aShortArray8024[i_1435_]) * i_1439_ + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8024[i_1435_] = (short) (((((Class387_Sub1) this).aShortArray8028[i_1435_]) * i_1439_ + (((Class387_Sub1) this).aShortArray8024[i_1435_]) * i_1440_ + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8028[i_1435_] = (short) i_1441_;
								}
								if (i_1387_ != 0) {
									int i_1442_ = Class257.anIntArray2683[i_1387_];
									int i_1443_ = Class257.anIntArray2684[i_1387_];
									int i_1444_ = (((((Class387_Sub1) this).aShortArray8024[i_1435_]) * i_1442_ + (((Class387_Sub1) this).aShortArray8032[i_1435_]) * i_1443_ + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8024[i_1435_] = (short) (((((Class387_Sub1) this).aShortArray8024[i_1435_]) * i_1443_ - (((Class387_Sub1) this).aShortArray8032[i_1435_]) * i_1442_ + 16383) >> 14);
									((Class387_Sub1) this).aShortArray8032[i_1435_] = (short) i_1444_;
								}
							}
						}
					}
				}
				method4499();
			}
		} else if (i == 3) {
			for (int i_1445_ = 0; i_1445_ < i_1390_; i_1445_++) {
				int i_1446_ = is[i_1445_];
				if (i_1446_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_1447_ = ((Class387_Sub1) this).anIntArrayArray8022[i_1446_];
					for (int i_1448_ = 0; i_1448_ < is_1447_.length; i_1448_++) {
						int i_1449_ = is_1447_[i_1448_];
						((Class387_Sub1) this).anIntArray8065[i_1449_] -= ((Class387_Sub1) this).anInt8080;
						((Class387_Sub1) this).anIntArray8020[i_1449_] -= ((Class387_Sub1) this).anInt8061;
						((Class387_Sub1) this).anIntArray8051[i_1449_] -= ((Class387_Sub1) this).anInt8055;
						((Class387_Sub1) this).anIntArray8065[i_1449_] = (((Class387_Sub1) this).anIntArray8065[i_1449_] * i_1386_) >> 7;
						((Class387_Sub1) this).anIntArray8020[i_1449_] = (((Class387_Sub1) this).anIntArray8020[i_1449_] * i_1387_) >> 7;
						((Class387_Sub1) this).anIntArray8051[i_1449_] = (((Class387_Sub1) this).anIntArray8051[i_1449_] * i_1388_) >> 7;
						((Class387_Sub1) this).anIntArray8065[i_1449_] += ((Class387_Sub1) this).anInt8080;
						((Class387_Sub1) this).anIntArray8020[i_1449_] += ((Class387_Sub1) this).anInt8061;
						((Class387_Sub1) this).anIntArray8051[i_1449_] += ((Class387_Sub1) this).anInt8055;
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub1) this).anIntArrayArray8017 != null) {
				boolean bool_1450_ = false;
				for (int i_1451_ = 0; i_1451_ < i_1390_; i_1451_++) {
					int i_1452_ = is[i_1451_];
					if (i_1452_ < ((Class387_Sub1) this).anIntArrayArray8017.length) {
						int[] is_1453_ = (((Class387_Sub1) this).anIntArrayArray8017[i_1452_]);
						for (int i_1454_ = 0; i_1454_ < is_1453_.length; i_1454_++) {
							int i_1455_ = is_1453_[i_1454_];
							int i_1456_ = (((((Class387_Sub1) this).aByteArray8037[i_1455_]) & 0xff) + i_1386_ * 8);
							if (i_1456_ < 0)
								i_1456_ = 0;
							else if (i_1456_ > 255)
								i_1456_ = 255;
							((Class387_Sub1) this).aByteArray8037[i_1455_] = (byte) i_1456_;
						}
						bool_1450_ = bool_1450_ | is_1453_.length > 0;
					}
				}
				if (bool_1450_) {
					if (((Class387_Sub1) this).aClass185Array8070 != null) {
						for (int i_1457_ = 0; i_1457_ < ((Class387_Sub1) this).anInt8069; i_1457_++) {
							Class185 class185 = (((Class387_Sub1) this).aClass185Array8070[i_1457_]);
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[i_1457_]);
							((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & 0xffffff | 255 - ((((Class387_Sub1) this).aByteArray8037[((Class185) class185).modelColorIndex]) & 0xff) << 24);
						}
					}
					method4507();
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub1) this).anIntArrayArray8017 != null) {
				boolean bool_1458_ = false;
				for (int i_1459_ = 0; i_1459_ < i_1390_; i_1459_++) {
					int i_1460_ = is[i_1459_];
					if (i_1460_ < ((Class387_Sub1) this).anIntArrayArray8017.length) {
						int[] is_1461_ = (((Class387_Sub1) this).anIntArrayArray8017[i_1460_]);
						for (int i_1462_ = 0; i_1462_ < is_1461_.length; i_1462_++) {
							int i_1463_ = is_1461_[i_1462_];
							int i_1464_ = ((((Class387_Sub1) this).modelColors[i_1463_]) & 0xffff);
							int i_1465_ = i_1464_ >> 10 & 0x3f;
							int i_1466_ = i_1464_ >> 7 & 0x7;
							int i_1467_ = i_1464_ & 0x7f;
							i_1465_ = i_1465_ + i_1386_ & 0x3f;
							i_1466_ += i_1387_ / 4;
							if (i_1466_ < 0)
								i_1466_ = 0;
							else if (i_1466_ > 7)
								i_1466_ = 7;
							i_1467_ += i_1388_;
							if (i_1467_ < 0)
								i_1467_ = 0;
							else if (i_1467_ > 127)
								i_1467_ = 127;
							((Class387_Sub1) this).modelColors[i_1463_] = (short) (i_1465_ << 10 | i_1466_ << 7 | i_1467_);
						}
						bool_1458_ = bool_1458_ | is_1461_.length > 0;
					}
				}
				if (bool_1458_) {
					if (((Class387_Sub1) this).aClass185Array8070 != null) {
						for (int i_1468_ = 0; i_1468_ < ((Class387_Sub1) this).anInt8069; i_1468_++) {
							Class185 class185 = (((Class387_Sub1) this).aClass185Array8070[i_1468_]);
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[i_1468_]);
							((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | (Console.colorArray[((((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff)]) & 0xffffff);
						}
					}
					method4507();
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_1469_ = 0; i_1469_ < i_1390_; i_1469_++) {
					int i_1470_ = is[i_1469_];
					if (i_1470_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_1471_ = (((Class387_Sub1) this).anIntArrayArray8072[i_1470_]);
						for (int i_1472_ = 0; i_1472_ < is_1471_.length; i_1472_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_1471_[i_1472_]]);
							((Class177) class177).anInt1751 += i_1386_;
							((Class177) class177).anInt1748 += i_1387_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_1473_ = 0; i_1473_ < i_1390_; i_1473_++) {
					int i_1474_ = is[i_1473_];
					if (i_1474_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_1475_ = (((Class387_Sub1) this).anIntArrayArray8072[i_1474_]);
						for (int i_1476_ = 0; i_1476_ < is_1475_.length; i_1476_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_1475_[i_1476_]]);
							((Class177) class177).anInt1752 = (((Class177) class177).anInt1752 * i_1386_ >> 7);
							((Class177) class177).anInt1749 = (((Class177) class177).anInt1749 * i_1387_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_1477_ = 0; i_1477_ < i_1390_; i_1477_++) {
					int i_1478_ = is[i_1477_];
					if (i_1478_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_1479_ = (((Class387_Sub1) this).anIntArrayArray8072[i_1478_]);
						for (int i_1480_ = 0; i_1480_ < is_1479_.length; i_1480_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_1479_[i_1480_]]);
							((Class177) class177).anInt1753 = (((Class177) class177).anInt1753 + i_1386_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void method4510() {
		if (((Class387_Sub1) this).aBoolean8066) {
			((Class387_Sub1) this).aBoolean8066 = false;
			if (((Class387_Sub1) this).aClass93Array8026 == null && ((Class387_Sub1) this).aClass64Array8068 == null && ((Class387_Sub1) this).aClass185Array8070 == null && !Class160.method1881(((Class387_Sub1) this).anInt8013, ((Class387_Sub1) this).anInt8081)) {
				boolean bool = false;
				boolean bool_1481_ = false;
				boolean bool_1482_ = false;
				if (((Class387_Sub1) this).anIntArray8065 != null && !Class160.method1896(((Class387_Sub1) this).anInt8013, (((Class387_Sub1) this).anInt8081))) {
					if (((Class387_Sub1) this).aClass173_8045 == null || ((Class387_Sub1) this).aClass173_8045.method2050()) {
						if (!((Class387_Sub1) this).aBoolean8043)
							method4501();
						bool = true;
					} else
						((Class387_Sub1) this).aBoolean8066 = true;
				}
				if (((Class387_Sub1) this).anIntArray8020 != null && !Class160.method1897(((Class387_Sub1) this).anInt8013, (((Class387_Sub1) this).anInt8081))) {
					if (((Class387_Sub1) this).aClass173_8045 == null || ((Class387_Sub1) this).aClass173_8045.method2050()) {
						if (!((Class387_Sub1) this).aBoolean8043)
							method4501();
						bool_1481_ = true;
					} else
						((Class387_Sub1) this).aBoolean8066 = true;
				}
				if (((Class387_Sub1) this).anIntArray8051 != null && !Class160.method1909(((Class387_Sub1) this).anInt8013, (((Class387_Sub1) this).anInt8081))) {
					if (((Class387_Sub1) this).aClass173_8045 == null || ((Class387_Sub1) this).aClass173_8045.method2050()) {
						if (!((Class387_Sub1) this).aBoolean8043)
							method4501();
						bool_1482_ = true;
					} else
						((Class387_Sub1) this).aBoolean8066 = true;
				}
				if (bool)
					((Class387_Sub1) this).anIntArray8065 = null;
				if (bool_1481_)
					((Class387_Sub1) this).anIntArray8020 = null;
				if (bool_1482_)
					((Class387_Sub1) this).anIntArray8051 = null;
			}
			if (((Class387_Sub1) this).aShortArray8052 != null && ((Class387_Sub1) this).anIntArray8065 == null && ((Class387_Sub1) this).anIntArray8020 == null && ((Class387_Sub1) this).anIntArray8051 == null) {
				((Class387_Sub1) this).aShortArray8052 = null;
				((Class387_Sub1) this).anIntArray8082 = null;
			}
			while_115_: do {
				if (((Class387_Sub1) this).aByteArray8030 != null && !Class160.method1885(((Class387_Sub1) this).anInt8013, (((Class387_Sub1) this).anInt8081))) {
					do {
						if ((((Class387_Sub1) this).anInt8081 & 0x37) != 0) {
							if (((Class387_Sub1) this).aClass173_8047 != null && !((Class387_Sub1) this).aClass173_8047.method2050())
								break;
						} else if ((((Class387_Sub1) this).aClass173_8046 != null) && !((Class387_Sub1) this).aClass173_8046.method2050())
							break;
						((Class387_Sub1) this).aShortArray8024 = null;
						((Class387_Sub1) this).aShortArray8028 = null;
						((Class387_Sub1) this).aShortArray8032 = null;
						((Class387_Sub1) this).aByteArray8030 = null;
						break while_115_;
					} while (false);
					((Class387_Sub1) this).aBoolean8066 = true;
				}
			} while (false);
			if (((Class387_Sub1) this).modelColors != null && !Class160.method1911(((Class387_Sub1) this).anInt8013, ((Class387_Sub1) this).anInt8081)) {
				if (((Class387_Sub1) this).aClass173_8046 == null || ((Class387_Sub1) this).aClass173_8046.method2050())
					((Class387_Sub1) this).modelColors = null;
				else
					((Class387_Sub1) this).aBoolean8066 = true;
			}
			if (((Class387_Sub1) this).aByteArray8037 != null && !Class160.method1900(((Class387_Sub1) this).anInt8013, ((Class387_Sub1) this).anInt8081)) {
				if (((Class387_Sub1) this).aClass173_8046 == null || ((Class387_Sub1) this).aClass173_8046.method2050())
					((Class387_Sub1) this).aByteArray8037 = null;
				else
					((Class387_Sub1) this).aBoolean8066 = true;
			}
			if (((Class387_Sub1) this).aFloatArray8031 != null && !Class160.method1901(((Class387_Sub1) this).anInt8013, ((Class387_Sub1) this).anInt8081)) {
				if (((Class387_Sub1) this).aClass173_8021 == null || ((Class387_Sub1) this).aClass173_8021.method2050()) {
					((Class387_Sub1) this).aFloatArray8053 = null;
					((Class387_Sub1) this).aFloatArray8031 = null;
				} else
					((Class387_Sub1) this).aBoolean8066 = true;
			}
			if (((Class387_Sub1) this).modelTextures != null && !Class160.method1905(((Class387_Sub1) this).anInt8013, ((Class387_Sub1) this).anInt8081)) {
				if (((Class387_Sub1) this).aClass173_8046 == null || ((Class387_Sub1) this).aClass173_8046.method2050())
					((Class387_Sub1) this).modelTextures = null;
				else
					((Class387_Sub1) this).aBoolean8066 = true;
			}
			if (((Class387_Sub1) this).aShortArray8016 != null && !Class160.method1907(((Class387_Sub1) this).anInt8013, ((Class387_Sub1) this).anInt8081)) {
				if ((((Class387_Sub1) this).aClass165_8050 == null || ((Class387_Sub1) this).aClass165_8050.method1963()) && (((Class387_Sub1) this).aClass173_8046 == null || ((Class387_Sub1) this).aClass173_8046.method2050())) {
					((Class387_Sub1) this).aShortArray8040 = null;
					((Class387_Sub1) this).aShortArray8039 = null;
					((Class387_Sub1) this).aShortArray8016 = null;
				} else
					((Class387_Sub1) this).aBoolean8066 = true;
			}
			if (((Class387_Sub1) this).aShortArray8025 != null) {
				if (((Class387_Sub1) this).aClass173_8045 == null || ((Class387_Sub1) this).aClass173_8045.method2050())
					((Class387_Sub1) this).aShortArray8025 = null;
				else
					((Class387_Sub1) this).aBoolean8066 = true;
			}
			if (((Class387_Sub1) this).aShortArray8075 != null) {
				if (((Class387_Sub1) this).aClass173_8046 == null || ((Class387_Sub1) this).aClass173_8046.method2050())
					((Class387_Sub1) this).aShortArray8075 = null;
				else
					((Class387_Sub1) this).aBoolean8066 = true;
			}
			if (((Class387_Sub1) this).anIntArrayArray8017 != null && !Class160.method1902(((Class387_Sub1) this).anInt8013, ((Class387_Sub1) this).anInt8081)) {
				((Class387_Sub1) this).anIntArrayArray8017 = null;
				((Class387_Sub1) this).aShortArray8018 = null;
			}
			if (((Class387_Sub1) this).anIntArrayArray8022 != null && !Class160.method1903(((Class387_Sub1) this).anInt8013, ((Class387_Sub1) this).anInt8081)) {
				((Class387_Sub1) this).anIntArrayArray8022 = null;
				((Class387_Sub1) this).aShortArray8023 = null;
			}
			if (((Class387_Sub1) this).anIntArrayArray8072 != null && !Class160.method1904(((Class387_Sub1) this).anInt8013, ((Class387_Sub1) this).anInt8081))
				((Class387_Sub1) this).anIntArrayArray8072 = null;
			if (((Class387_Sub1) this).anIntArray8062 != null && (((Class387_Sub1) this).anInt8013 & 0x800) == 0 && (((Class387_Sub1) this).anInt8013 & 0x40000) == 0) {
				((Class387_Sub1) this).anIntArray8062 = null;
				((Class387_Sub1) this).anIntArray8064 = null;
				((Class387_Sub1) this).anIntArray8063 = null;
			}
		}
	}

	public void method_do(short i, short i_1483_) {
		for (int i_1484_ = 0; i_1484_ < ((Class387_Sub1) this).anInt8034; i_1484_++) {
			if (((Class387_Sub1) this).modelColors[i_1484_] == i)
				((Class387_Sub1) this).modelColors[i_1484_] = i_1483_;
		}
		if (((Class387_Sub1) this).aClass185Array8070 != null) {
			for (int i_1485_ = 0; i_1485_ < ((Class387_Sub1) this).anInt8069; i_1485_++) {
				Class185 class185 = ((Class387_Sub1) this).aClass185Array8070[i_1485_];
				Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_1485_];
				((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | ((Console.colorArray[(((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		method4507();
	}

	public Class93[] method4476() {
		return ((Class387_Sub1) this).aClass93Array8026;
	}

	public int cn() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8059;
	}

	public void dt(short i, short i_1486_) {
		for (int i_1487_ = 0; i_1487_ < ((Class387_Sub1) this).anInt8034; i_1487_++) {
			if (((Class387_Sub1) this).modelColors[i_1487_] == i)
				((Class387_Sub1) this).modelColors[i_1487_] = i_1486_;
		}
		if (((Class387_Sub1) this).aClass185Array8070 != null) {
			for (int i_1488_ = 0; i_1488_ < ((Class387_Sub1) this).anInt8069; i_1488_++) {
				Class185 class185 = ((Class387_Sub1) this).aClass185Array8070[i_1488_];
				Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_1488_];
				((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | ((Console.colorArray[(((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		method4507();
	}

	public void dq(short i, short i_1489_) {
		for (int i_1490_ = 0; i_1490_ < ((Class387_Sub1) this).anInt8034; i_1490_++) {
			if (((Class387_Sub1) this).modelColors[i_1490_] == i)
				((Class387_Sub1) this).modelColors[i_1490_] = i_1489_;
		}
		if (((Class387_Sub1) this).aClass185Array8070 != null) {
			for (int i_1491_ = 0; i_1491_ < ((Class387_Sub1) this).anInt8069; i_1491_++) {
				Class185 class185 = ((Class387_Sub1) this).aClass185Array8070[i_1491_];
				Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_1491_];
				((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | ((Console.colorArray[(((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		method4507();
	}

	public void method4482(byte i, byte[] is) {
		if (is == null) {
			for (int i_1492_ = 0; i_1492_ < ((Class387_Sub1) this).anInt8034; i_1492_++)
				((Class387_Sub1) this).aByteArray8037[i_1492_] = i;
		} else {
			for (int i_1493_ = 0; i_1493_ < ((Class387_Sub1) this).anInt8034; i_1493_++) {
				int i_1494_ = 255 - ((255 - (is[i_1493_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class387_Sub1) this).aByteArray8037[i_1493_] = (byte) i_1494_;
			}
		}
		method4507();
	}
	
	public int YA() {
		if (!((Class387_Sub1) this).aBoolean8043)
			method4501();
		return ((Class387_Sub1) this).anInt8056;
	}
	
	public boolean u() {
		return ((Class387_Sub1) this).aBoolean8042;
	}
	
	public void color(short modelColor, short modifiedModelColor) {
		for (int i_1496_ = 0; i_1496_ < ((Class387_Sub1) this).anInt8034; i_1496_++) {
			//((Class387_Sub1) this).modelColors[i_1496_] = -525;
			if (((Class387_Sub1) this).modelColors[i_1496_] == modelColor)
				((Class387_Sub1) this).modelColors[i_1496_] = modifiedModelColor;
						//20000;
				//(short) (modifiedModelColor + 10000 > Short.MAX_VALUE ? modifiedModelColor : modifiedModelColor + 10000);
		}
		if (((Class387_Sub1) this).aClass185Array8070 != null) {
			for (int index = 0; index < ((Class387_Sub1) this).anInt8069; index++) {
				Class185 class185 = ((Class387_Sub1) this).aClass185Array8070[index];
				Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[index];
				((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | ((Console.colorArray[(((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		method4507();
	}

	public void du(int i, int i_1498_, int i_1499_, int i_1500_) {
		for (int i_1501_ = 0; i_1501_ < ((Class387_Sub1) this).anInt8034; i_1501_++) {
			int i_1502_ = ((Class387_Sub1) this).modelColors[i_1501_] & 0xffff;
			int i_1503_ = i_1502_ >> 10 & 0x3f;
			int i_1504_ = i_1502_ >> 7 & 0x7;
			int i_1505_ = i_1502_ & 0x7f;
			if (i != -1)
				i_1503_ += (i - i_1503_) * i_1500_ >> 7;
			if (i_1498_ != -1)
				i_1504_ += (i_1498_ - i_1504_) * i_1500_ >> 7;
			if (i_1499_ != -1)
				i_1505_ += (i_1499_ - i_1505_) * i_1500_ >> 7;
			((Class387_Sub1) this).modelColors[i_1501_] = (short) (i_1503_ << 10 | i_1504_ << 7 | i_1505_);
		}
		if (((Class387_Sub1) this).aClass185Array8070 != null) {
			for (int i_1506_ = 0; i_1506_ < ((Class387_Sub1) this).anInt8069; i_1506_++) {
				Class185 class185 = ((Class387_Sub1) this).aClass185Array8070[i_1506_];
				Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_1506_];
				((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | ((Console.colorArray[(((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		method4507();
	}

	public void df(int i, int i_1507_, int i_1508_, int i_1509_) {
		for (int i_1510_ = 0; i_1510_ < ((Class387_Sub1) this).anInt8034; i_1510_++) {
			int i_1511_ = ((Class387_Sub1) this).modelColors[i_1510_] & 0xffff;
			int i_1512_ = i_1511_ >> 10 & 0x3f;
			int i_1513_ = i_1511_ >> 7 & 0x7;
			int i_1514_ = i_1511_ & 0x7f;
			if (i != -1)
				i_1512_ += (i - i_1512_) * i_1509_ >> 7;
			if (i_1507_ != -1)
				i_1513_ += (i_1507_ - i_1513_) * i_1509_ >> 7;
			if (i_1508_ != -1)
				i_1514_ += (i_1508_ - i_1514_) * i_1509_ >> 7;
			((Class387_Sub1) this).modelColors[i_1510_] = (short) (i_1512_ << 10 | i_1513_ << 7 | i_1514_);
		}
		if (((Class387_Sub1) this).aClass185Array8070 != null) {
			for (int i_1515_ = 0; i_1515_ < ((Class387_Sub1) this).anInt8069; i_1515_++) {
				Class185 class185 = ((Class387_Sub1) this).aClass185Array8070[i_1515_];
				Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_1515_];
				((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | ((Console.colorArray[(((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		method4507();
	}

	public Class64[] method4485() {
		return ((Class387_Sub1) this).aClass64Array8068;
	}

	public Class93[] method4483() {
		return ((Class387_Sub1) this).aClass93Array8026;
	}

	void method4511() {
		if (((Class387_Sub1) this).aClass173_8045 != null)
			((Class387_Sub1) this).aClass173_8045.method2049();
		if (((Class387_Sub1) this).aClass173_8021 != null)
			((Class387_Sub1) this).aClass173_8021.method2049();
		if (((Class387_Sub1) this).aClass173_8046 != null)
			((Class387_Sub1) this).aClass173_8046.method2049();
		if (((Class387_Sub1) this).aClass173_8047 != null)
			((Class387_Sub1) this).aClass173_8047.method2049();
		if (((Class387_Sub1) this).aClass165_8050 != null)
			((Class387_Sub1) this).aClass165_8050.method1964();
	}

	boolean method4512() {
		boolean bool = !((Class173) ((Class387_Sub1) this).aClass173_8046).aBoolean1732;
		boolean bool_1516_ = ((((Class387_Sub1) this).anInt8081 & 0x37) != 0 && !(((Class173) ((Class387_Sub1) this).aClass173_8047).aBoolean1732));
		boolean bool_1517_ = !((Class173) ((Class387_Sub1) this).aClass173_8045).aBoolean1732;
		boolean bool_1518_ = !((Class173) ((Class387_Sub1) this).aClass173_8021).aBoolean1732;
		if (!bool_1517_ && !bool && !bool_1516_ && !bool_1518_)
			return true;
		boolean bool_1519_ = true;
		if (bool_1517_ && ((Class387_Sub1) this).aShortArray8025 != null) {
			if ((((Class173) ((Class387_Sub1) this).aClass173_8045).anInterface9_Impl1_1734) == null)
				((Class173) ((Class387_Sub1) this).aClass173_8045).anInterface9_Impl1_1734 = ((Class387_Sub1) this).aClass_ra_Sub2_8012.method4976(((Class387_Sub1) this).aBoolean8049);
			Interface9_Impl1 interface9_impl1 = (((Class173) ((Class387_Sub1) this).aClass173_8045).anInterface9_Impl1_1734);
			interface9_impl1.method142(((Class387_Sub1) this).anInt8038 * 12, 12);
			Unsafe unsafe = ((Class387_Sub1) this).aClass_ra_Sub2_8012.anUnsafe8461;
			if (unsafe != null) {
				int i = ((Class387_Sub1) this).anInt8038 * 12;
				long l = interface9_impl1.method94(0, i);
				for (int i_1520_ = 0; i_1520_ < ((Class387_Sub1) this).anInt8038; i_1520_++) {
					short i_1521_ = ((Class387_Sub1) this).aShortArray8025[i_1520_];
					unsafe.putFloat(l, (float) (((Class387_Sub1) this).anIntArray8065[i_1521_]));
					l += 4L;
					unsafe.putFloat(l, (float) (((Class387_Sub1) this).anIntArray8020[i_1521_]));
					l += 4L;
					unsafe.putFloat(l, (float) (((Class387_Sub1) this).anIntArray8051[i_1521_]));
					l += 4L;
				}
				interface9_impl1.method95();
			} else {
				ByteBuffer bytebuffer = (((Class387_Sub1) this).aClass_ra_Sub2_8012.aByteBuffer8458);
				bytebuffer.clear();
				for (int i = 0; i < ((Class387_Sub1) this).anInt8038; i++) {
					bytebuffer.putFloat((float) ((Class387_Sub1) this).anIntArray8065[(((Class387_Sub1) this).aShortArray8025[i])]);
					bytebuffer.putFloat((float) ((Class387_Sub1) this).anIntArray8020[(((Class387_Sub1) this).aShortArray8025[i])]);
					bytebuffer.putFloat((float) ((Class387_Sub1) this).anIntArray8051[(((Class387_Sub1) this).aShortArray8025[i])]);
				}
				interface9_impl1.method97(0, bytebuffer.position(), (((Class387_Sub1) this).aClass_ra_Sub2_8012.aLong8459));
			}
			((Class173) ((Class387_Sub1) this).aClass173_8045).anInterface9_Impl1_1733 = interface9_impl1;
			((Class173) ((Class387_Sub1) this).aClass173_8045).aBoolean1732 = true;
		}
		if (bool) {
			if ((((Class173) ((Class387_Sub1) this).aClass173_8046).anInterface9_Impl1_1734) == null)
				((Class173) ((Class387_Sub1) this).aClass173_8046).anInterface9_Impl1_1734 = ((Class387_Sub1) this).aClass_ra_Sub2_8012.method4976(((Class387_Sub1) this).aBoolean8049);
			Interface9_Impl1 interface9_impl1 = (((Class173) ((Class387_Sub1) this).aClass173_8046).anInterface9_Impl1_1734);
			interface9_impl1.method142(((Class387_Sub1) this).anInt8038 * 4, 4);
			Unsafe unsafe = ((Class387_Sub1) this).aClass_ra_Sub2_8012.anUnsafe8461;
			if (unsafe != null) {
				int i = ((Class387_Sub1) this).anInt8038 * 4;
				long l = interface9_impl1.method94(0, i);
				if ((((Class387_Sub1) this).anInt8081 & 0x37) == 0) {
					short[] is;
					short[] is_1522_;
					short[] is_1523_;
					byte[] is_1524_;
					if (((Class387_Sub1) this).aClass206_8033 != null) {
						is = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aShortArray1938;
						is_1522_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aShortArray1937;
						is_1523_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aShortArray1939;
						is_1524_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aByteArray1940;
					} else {
						is = ((Class387_Sub1) this).aShortArray8032;
						is_1522_ = ((Class387_Sub1) this).aShortArray8028;
						is_1523_ = ((Class387_Sub1) this).aShortArray8024;
						is_1524_ = ((Class387_Sub1) this).aByteArray8030;
					}
					float f = ((((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8489) * 768.0F / (float) ((Class387_Sub1) this).aShort8083);
					float f_1525_ = ((((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8535) * 768.0F / (float) ((Class387_Sub1) this).aShort8083);
					for (int i_1526_ = 0; i_1526_ < ((Class387_Sub1) this).anInt8038; i_1526_++) {
						short i_1527_ = ((Class387_Sub1) this).aShortArray8075[i_1526_];
						int i_1528_ = method4506((((Class387_Sub1) this).modelColors[i_1527_]) & 0xffff, (((Class387_Sub1) this).modelTextures[i_1527_]), ((Class387_Sub1) this).aShort8015);
						float f_1529_ = ((float) (i_1528_ >> 16 & 0xff) * (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8530));
						float f_1530_ = ((float) (i_1528_ >> 8 & 0xff) * (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8500));
						float f_1531_ = ((float) (i_1528_ & 0xff) * (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8532));
						byte i_1532_ = is_1524_[i_1526_];
						float f_1533_;
						if (i_1532_ == 0)
							f_1533_ = (((((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloatArray8525[0]) * (float) is[i_1526_] + (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloatArray8525[1]) * (float) is_1522_[i_1526_] + (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloatArray8525[2]) * (float) is_1523_[i_1526_]) * 0.0026041667F);
						else
							f_1533_ = (((((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloatArray8525[0]) * (float) is[i_1526_] + (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloatArray8525[1]) * (float) is_1522_[i_1526_] + (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloatArray8525[2]) * (float) is_1523_[i_1526_]) / ((float) i_1532_ * 256.0F));
						float f_1534_ = ((((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8533) + f_1533_ * (f_1533_ < 0.0F ? f_1525_ : f));
						int i_1535_ = (int) (f_1529_ * f_1534_);
						if (i_1535_ < 0)
							i_1535_ = 0;
						else if (i_1535_ > 255)
							i_1535_ = 255;
						int i_1536_ = (int) (f_1530_ * f_1534_);
						if (i_1536_ < 0)
							i_1536_ = 0;
						else if (i_1536_ > 255)
							i_1536_ = 255;
						int i_1537_ = (int) (f_1531_ * f_1534_);
						if (i_1537_ < 0)
							i_1537_ = 0;
						else if (i_1537_ > 255)
							i_1537_ = 255;
						unsafe.putInt(l, (255 - (((Class387_Sub1) this).aByteArray8037[i_1527_]) << 24 | i_1535_ << 16 | i_1536_ << 8 | i_1537_));
						l += 4L;
					}
				} else {
					for (int i_1538_ = 0; i_1538_ < ((Class387_Sub1) this).anInt8038; i_1538_++) {
						short i_1539_ = ((Class387_Sub1) this).aShortArray8075[i_1538_];
						int i_1540_ = (255 - (((Class387_Sub1) this).aByteArray8037[i_1539_]) << 24 | method4506(((((Class387_Sub1) this).modelColors[i_1539_]) & 0xffff), (((Class387_Sub1) this).modelTextures[i_1539_]), (((Class387_Sub1) this).aShort8015)));
						unsafe.putInt(l, i_1540_);
						l += 4L;
					}
				}
				interface9_impl1.method95();
			} else {
				ByteBuffer bytebuffer = (((Class387_Sub1) this).aClass_ra_Sub2_8012.aByteBuffer8458);
				bytebuffer.clear();
				if ((((Class387_Sub1) this).anInt8081 & 0x37) == 0) {
					short[] is;
					short[] is_1541_;
					short[] is_1542_;
					byte[] is_1543_;
					if (((Class387_Sub1) this).aClass206_8033 != null) {
						is = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aShortArray1938;
						is_1541_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aShortArray1937;
						is_1542_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aShortArray1939;
						is_1543_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aByteArray1940;
					} else {
						is = ((Class387_Sub1) this).aShortArray8032;
						is_1541_ = ((Class387_Sub1) this).aShortArray8028;
						is_1542_ = ((Class387_Sub1) this).aShortArray8024;
						is_1543_ = ((Class387_Sub1) this).aByteArray8030;
					}
					float f = ((((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8489) * 768.0F / (float) ((Class387_Sub1) this).aShort8083);
					float f_1544_ = ((((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8535) * 768.0F / (float) ((Class387_Sub1) this).aShort8083);
					for (int i = 0; i < ((Class387_Sub1) this).anInt8038; i++) {
						short i_1545_ = ((Class387_Sub1) this).aShortArray8075[i];
						int i_1546_ = method4506((((Class387_Sub1) this).modelColors[i_1545_]) & 0xffff, (((Class387_Sub1) this).modelTextures[i_1545_]), ((Class387_Sub1) this).aShort8015);
						float f_1547_ = ((float) (i_1546_ >> 16 & 0xff) * (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8530));
						float f_1548_ = ((float) (i_1546_ >> 8 & 0xff) * (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8500));
						float f_1549_ = ((float) (i_1546_ & 0xff) * (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8532));
						byte i_1550_ = is_1543_[i];
						float f_1551_;
						if (i_1550_ == 0)
							f_1551_ = ((((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloatArray8525[0]) * (float) is[i] + ((((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloatArray8525[1]) * (float) is_1541_[i]) + ((((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloatArray8525[2]) * (float) is_1542_[i])) * 0.0026041667F;
						else
							f_1551_ = (((((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloatArray8525[0]) * (float) is[i] + (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloatArray8525[1]) * (float) is_1541_[i] + (((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloatArray8525[2]) * (float) is_1542_[i]) / ((float) i_1550_ * 256.0F));
						float f_1552_ = ((((Class387_Sub1) this).aClass_ra_Sub2_8012.aFloat8533) + f_1551_ * (f_1551_ < 0.0F ? f_1544_ : f));
						int i_1553_ = (int) (f_1547_ * f_1552_);
						if (i_1553_ < 0)
							i_1553_ = 0;
						else if (i_1553_ > 255)
							i_1553_ = 255;
						int i_1554_ = (int) (f_1548_ * f_1552_);
						if (i_1554_ < 0)
							i_1554_ = 0;
						else if (i_1554_ > 255)
							i_1554_ = 255;
						int i_1555_ = (int) (f_1549_ * f_1552_);
						if (i_1555_ < 0)
							i_1555_ = 0;
						else if (i_1555_ > 255)
							i_1555_ = 255;
						bytebuffer.putInt((255 - (((Class387_Sub1) this).aByteArray8037[i_1545_]) << 24) | i_1553_ << 16 | i_1554_ << 8 | i_1555_);
					}
				} else {
					for (int i = 0; i < ((Class387_Sub1) this).anInt8038; i++) {
						short i_1556_ = ((Class387_Sub1) this).aShortArray8075[i];
						int i_1557_ = (255 - (((Class387_Sub1) this).aByteArray8037[i_1556_]) << 24 | method4506(((((Class387_Sub1) this).modelColors[i_1556_]) & 0xffff), (((Class387_Sub1) this).modelTextures[i_1556_]), (((Class387_Sub1) this).aShort8015)));
						bytebuffer.putInt(i_1557_);
					}
				}
				interface9_impl1.method97(0, bytebuffer.position(), (((Class387_Sub1) this).aClass_ra_Sub2_8012.aLong8459));
			}
			((Class173) ((Class387_Sub1) this).aClass173_8046).anInterface9_Impl1_1733 = interface9_impl1;
			((Class173) ((Class387_Sub1) this).aClass173_8046).aBoolean1732 = true;
		}
		if (bool_1516_) {
			if ((((Class173) ((Class387_Sub1) this).aClass173_8047).anInterface9_Impl1_1734) == null)
				((Class173) ((Class387_Sub1) this).aClass173_8047).anInterface9_Impl1_1734 = ((Class387_Sub1) this).aClass_ra_Sub2_8012.method4976(((Class387_Sub1) this).aBoolean8049);
			Interface9_Impl1 interface9_impl1 = (((Class173) ((Class387_Sub1) this).aClass173_8047).anInterface9_Impl1_1734);
			interface9_impl1.method142(((Class387_Sub1) this).anInt8038 * 12, 12);
			short[] is;
			short[] is_1558_;
			short[] is_1559_;
			byte[] is_1560_;
			if (((Class387_Sub1) this).aClass206_8033 != null) {
				is = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1938);
				is_1558_ = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1937);
				is_1559_ = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1939);
				is_1560_ = (((Class206) ((Class387_Sub1) this).aClass206_8033).aByteArray1940);
			} else {
				is = ((Class387_Sub1) this).aShortArray8032;
				is_1558_ = ((Class387_Sub1) this).aShortArray8028;
				is_1559_ = ((Class387_Sub1) this).aShortArray8024;
				is_1560_ = ((Class387_Sub1) this).aByteArray8030;
			}
			float f = 3.0F / (float) ((Class387_Sub1) this).aShort8083;
			float f_1561_ = 3.0F / (float) (((Class387_Sub1) this).aShort8083 + ((Class387_Sub1) this).aShort8083 / 2);
			Unsafe unsafe = ((Class387_Sub1) this).aClass_ra_Sub2_8012.anUnsafe8461;
			if (unsafe != null) {
				int i = ((Class387_Sub1) this).anInt8038 * 12;
				long l = interface9_impl1.method94(0, i);
				for (int i_1562_ = 0; i_1562_ < ((Class387_Sub1) this).anInt8038; i_1562_++) {
					float f_1563_ = (is_1560_[i_1562_] == 0 ? f_1561_ : f / (float) is_1560_[i_1562_]);
					float f_1564_ = (float) is[i_1562_] * f_1563_;
					float f_1565_ = (float) is_1558_[i_1562_] * f_1563_;
					float f_1566_ = (float) is_1559_[i_1562_] * f_1563_;
					unsafe.putFloat(l, f_1564_);
					l += 4L;
					unsafe.putFloat(l, f_1565_);
					l += 4L;
					unsafe.putFloat(l, f_1566_);
					l += 4L;
				}
				interface9_impl1.method95();
			} else {
				ByteBuffer bytebuffer = (((Class387_Sub1) this).aClass_ra_Sub2_8012.aByteBuffer8458);
				bytebuffer.clear();
				for (int i = 0; i < ((Class387_Sub1) this).anInt8038; i++) {
					float f_1567_ = is_1560_[i] == 0 ? f_1561_ : f / (float) is_1560_[i];
					float f_1568_ = (float) is[i] * f_1567_;
					float f_1569_ = (float) is_1558_[i] * f_1567_;
					float f_1570_ = (float) is_1559_[i] * f_1567_;
					bytebuffer.putFloat(f_1568_);
					bytebuffer.putFloat(f_1569_);
					bytebuffer.putFloat(f_1570_);
				}
				interface9_impl1.method97(0, bytebuffer.position(), (((Class387_Sub1) this).aClass_ra_Sub2_8012.aLong8459));
			}
			((Class173) ((Class387_Sub1) this).aClass173_8047).anInterface9_Impl1_1733 = interface9_impl1;
			((Class173) ((Class387_Sub1) this).aClass173_8047).aBoolean1732 = true;
		}
		if (bool_1518_) {
			if ((((Class173) ((Class387_Sub1) this).aClass173_8021).anInterface9_Impl1_1734) == null)
				((Class173) ((Class387_Sub1) this).aClass173_8021).anInterface9_Impl1_1734 = ((Class387_Sub1) this).aClass_ra_Sub2_8012.method4976(((Class387_Sub1) this).aBoolean8049);
			Interface9_Impl1 interface9_impl1 = (((Class173) ((Class387_Sub1) this).aClass173_8021).anInterface9_Impl1_1734);
			interface9_impl1.method142(((Class387_Sub1) this).anInt8038 * 8, 8);
			Unsafe unsafe = ((Class387_Sub1) this).aClass_ra_Sub2_8012.anUnsafe8461;
			if (unsafe != null) {
				int i = ((Class387_Sub1) this).anInt8038 * 8;
				long l = interface9_impl1.method94(0, i);
				for (int i_1571_ = 0; i_1571_ < ((Class387_Sub1) this).anInt8038; i_1571_++) {
					unsafe.putFloat(l, (((Class387_Sub1) this).aFloatArray8031[i_1571_]));
					l += 4L;
					unsafe.putFloat(l, (((Class387_Sub1) this).aFloatArray8053[i_1571_]));
					l += 4L;
				}
				interface9_impl1.method95();
			} else {
				ByteBuffer bytebuffer = (((Class387_Sub1) this).aClass_ra_Sub2_8012.aByteBuffer8458);
				bytebuffer.clear();
				for (int i = 0; i < ((Class387_Sub1) this).anInt8038; i++) {
					bytebuffer.putFloat(((Class387_Sub1) this).aFloatArray8031[i]);
					bytebuffer.putFloat(((Class387_Sub1) this).aFloatArray8053[i]);
				}
				interface9_impl1.method97(0, bytebuffer.position(), (((Class387_Sub1) this).aClass_ra_Sub2_8012.aLong8459));
			}
			((Class173) ((Class387_Sub1) this).aClass173_8021).anInterface9_Impl1_1733 = interface9_impl1;
			((Class173) ((Class387_Sub1) this).aClass173_8021).aBoolean1732 = true;
		}
		return bool_1519_;
	}

	public void S(int i) {
		int i_1572_ = Class257.anIntArray2683[i];
		int i_1573_ = Class257.anIntArray2684[i];
		for (int i_1574_ = 0; i_1574_ < ((Class387_Sub1) this).anInt8044; i_1574_++) {
			int i_1575_ = ((((Class387_Sub1) this).anIntArray8051[i_1574_] * i_1572_ + ((Class387_Sub1) this).anIntArray8065[i_1574_] * i_1573_) >> 14);
			((Class387_Sub1) this).anIntArray8051[i_1574_] = ((((Class387_Sub1) this).anIntArray8051[i_1574_] * i_1573_ - ((Class387_Sub1) this).anIntArray8065[i_1574_] * i_1572_) >> 14);
			((Class387_Sub1) this).anIntArray8065[i_1574_] = i_1575_;
		}
		for (int i_1576_ = 0; i_1576_ < ((Class387_Sub1) this).anInt8038; i_1576_++) {
			int i_1577_ = ((((Class387_Sub1) this).aShortArray8024[i_1576_] * i_1572_ + (((Class387_Sub1) this).aShortArray8032[i_1576_] * i_1573_)) >> 14);
			((Class387_Sub1) this).aShortArray8024[i_1576_] = (short) (((((Class387_Sub1) this).aShortArray8024[i_1576_] * i_1573_) - (((Class387_Sub1) this).aShortArray8032[i_1576_] * i_1572_)) >> 14);
			((Class387_Sub1) this).aShortArray8032[i_1576_] = (short) i_1577_;
		}
		method4498();
		method4499();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public boolean method4471() {
		if (((Class387_Sub1) this).modelTextures == null)
			return true;
		for (int i = 0; i < ((Class387_Sub1) this).modelTextures.length; i++) {
			if (((Class387_Sub1) this).modelTextures[i] != -1 && !(((Class_ra_Sub2) ((Class387_Sub1) this).aClass_ra_Sub2_8012).aClass188_8552.method2095(((Class387_Sub1) this).modelTextures[i], -1)))
				return false;
		}
		return true;
	}

	public boolean dw() {
		return ((Class387_Sub1) this).aBoolean8042;
	}

	public void ed(int i) {
		int i_1578_ = Class257.anIntArray2683[i];
		int i_1579_ = Class257.anIntArray2684[i];
		for (int i_1580_ = 0; i_1580_ < ((Class387_Sub1) this).anInt8044; i_1580_++) {
			int i_1581_ = ((((Class387_Sub1) this).anIntArray8051[i_1580_] * i_1578_ + ((Class387_Sub1) this).anIntArray8065[i_1580_] * i_1579_) >> 14);
			((Class387_Sub1) this).anIntArray8051[i_1580_] = ((((Class387_Sub1) this).anIntArray8051[i_1580_] * i_1579_ - ((Class387_Sub1) this).anIntArray8065[i_1580_] * i_1578_) >> 14);
			((Class387_Sub1) this).anIntArray8065[i_1580_] = i_1581_;
		}
		method4498();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public void ej() {
		for (int i = 0; i < ((Class387_Sub1) this).anInt8044; i++)
			((Class387_Sub1) this).anIntArray8051[i] = -((Class387_Sub1) this).anIntArray8051[i];
		for (int i = 0; i < ((Class387_Sub1) this).anInt8038; i++)
			((Class387_Sub1) this).aShortArray8024[i] = (short) -((Class387_Sub1) this).aShortArray8024[i];
		for (int i = 0; i < ((Class387_Sub1) this).anInt8034; i++) {
			short i_1582_ = ((Class387_Sub1) this).aShortArray8016[i];
			((Class387_Sub1) this).aShortArray8016[i] = ((Class387_Sub1) this).aShortArray8040[i];
			((Class387_Sub1) this).aShortArray8040[i] = i_1582_;
		}
		method4498();
		method4499();
		method4500();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public boolean ew() {
		return ((Class387_Sub1) this).aBoolean8067;
	}

	public int m() {
		return ((Class387_Sub1) this).anInt8013;
	}

	public boolean em() {
		return ((Class387_Sub1) this).aBoolean8067;
	}

	boolean method4513(int i, int i_1583_, int i_1584_, int i_1585_, int i_1586_, int i_1587_, int i_1588_, int i_1589_, int i_1590_, int i_1591_) {
		if (i_1585_ < i_1586_ && i_1585_ < i_1587_ && i_1585_ < i_1588_)
			return false;
		if (i_1583_ > i_1586_ && i_1583_ > i_1587_ && i_1583_ > i_1588_)
			return false;
		if (i_1584_ < i_1589_ && i_1584_ < i_1590_ && i_1584_ < i_1591_)
			return false;
		if (i > i_1589_ && i > i_1590_ && i > i_1591_)
			return false;
		return true;
	}

	boolean ei() {
		if (((Class387_Sub1) this).anIntArrayArray8022 == null)
			return false;
		for (int i = 0; i < ((Class387_Sub1) this).anInt8014; i++) {
			((Class387_Sub1) this).anIntArray8065[i] <<= 4;
			((Class387_Sub1) this).anIntArray8020[i] <<= 4;
			((Class387_Sub1) this).anIntArray8051[i] <<= 4;
		}
		((Class387_Sub1) this).anInt8080 = 0;
		((Class387_Sub1) this).anInt8061 = 0;
		((Class387_Sub1) this).anInt8055 = 0;
		return true;
	}

	void er(int i, int[] is, int i_1592_, int i_1593_, int i_1594_, boolean bool, int i_1595_, int[] is_1596_) {
		int i_1597_ = is.length;
		if (i == 0) {
			i_1592_ <<= 4;
			i_1593_ <<= 4;
			i_1594_ <<= 4;
			int i_1598_ = 0;
			((Class387_Sub1) this).anInt8080 = 0;
			((Class387_Sub1) this).anInt8061 = 0;
			((Class387_Sub1) this).anInt8055 = 0;
			for (int i_1599_ = 0; i_1599_ < i_1597_; i_1599_++) {
				int i_1600_ = is[i_1599_];
				if (i_1600_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_1601_ = ((Class387_Sub1) this).anIntArrayArray8022[i_1600_];
					for (int i_1602_ = 0; i_1602_ < is_1601_.length; i_1602_++) {
						int i_1603_ = is_1601_[i_1602_];
						if (((Class387_Sub1) this).aShortArray8023 == null || (i_1595_ & (((Class387_Sub1) this).aShortArray8023[i_1603_])) != 0) {
							((Class387_Sub1) this).anInt8080 += (((Class387_Sub1) this).anIntArray8065[i_1603_]);
							((Class387_Sub1) this).anInt8061 += (((Class387_Sub1) this).anIntArray8020[i_1603_]);
							((Class387_Sub1) this).anInt8055 += (((Class387_Sub1) this).anIntArray8051[i_1603_]);
							i_1598_++;
						}
					}
				}
			}
			if (i_1598_ > 0) {
				((Class387_Sub1) this).anInt8080 = ((Class387_Sub1) this).anInt8080 / i_1598_ + i_1592_;
				((Class387_Sub1) this).anInt8061 = ((Class387_Sub1) this).anInt8061 / i_1598_ + i_1593_;
				((Class387_Sub1) this).anInt8055 = ((Class387_Sub1) this).anInt8055 / i_1598_ + i_1594_;
				((Class387_Sub1) this).aBoolean8048 = true;
			} else {
				((Class387_Sub1) this).anInt8080 = i_1592_;
				((Class387_Sub1) this).anInt8061 = i_1593_;
				((Class387_Sub1) this).anInt8055 = i_1594_;
			}
		} else if (i == 1) {
			if (is_1596_ != null) {
				int i_1604_ = ((is_1596_[0] * i_1592_ + is_1596_[1] * i_1593_ + is_1596_[2] * i_1594_ + 8192) >> 14);
				int i_1605_ = ((is_1596_[3] * i_1592_ + is_1596_[4] * i_1593_ + is_1596_[5] * i_1594_ + 8192) >> 14);
				int i_1606_ = ((is_1596_[6] * i_1592_ + is_1596_[7] * i_1593_ + is_1596_[8] * i_1594_ + 8192) >> 14);
				i_1592_ = i_1604_;
				i_1593_ = i_1605_;
				i_1594_ = i_1606_;
			}
			i_1592_ <<= 4;
			i_1593_ <<= 4;
			i_1594_ <<= 4;
			for (int i_1607_ = 0; i_1607_ < i_1597_; i_1607_++) {
				int i_1608_ = is[i_1607_];
				if (i_1608_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_1609_ = ((Class387_Sub1) this).anIntArrayArray8022[i_1608_];
					for (int i_1610_ = 0; i_1610_ < is_1609_.length; i_1610_++) {
						int i_1611_ = is_1609_[i_1610_];
						if (((Class387_Sub1) this).aShortArray8023 == null || (i_1595_ & (((Class387_Sub1) this).aShortArray8023[i_1611_])) != 0) {
							((Class387_Sub1) this).anIntArray8065[i_1611_] += i_1592_;
							((Class387_Sub1) this).anIntArray8020[i_1611_] += i_1593_;
							((Class387_Sub1) this).anIntArray8051[i_1611_] += i_1594_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1596_ != null) {
				int i_1612_ = is_1596_[9] << 4;
				int i_1613_ = is_1596_[10] << 4;
				int i_1614_ = is_1596_[11] << 4;
				int i_1615_ = is_1596_[12] << 4;
				int i_1616_ = is_1596_[13] << 4;
				int i_1617_ = is_1596_[14] << 4;
				if (((Class387_Sub1) this).aBoolean8048) {
					int i_1618_ = ((is_1596_[0] * ((Class387_Sub1) this).anInt8080 + is_1596_[3] * ((Class387_Sub1) this).anInt8061 + is_1596_[6] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					int i_1619_ = ((is_1596_[1] * ((Class387_Sub1) this).anInt8080 + is_1596_[4] * ((Class387_Sub1) this).anInt8061 + is_1596_[7] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					int i_1620_ = ((is_1596_[2] * ((Class387_Sub1) this).anInt8080 + is_1596_[5] * ((Class387_Sub1) this).anInt8061 + is_1596_[8] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					i_1618_ += i_1615_;
					i_1619_ += i_1616_;
					i_1620_ += i_1617_;
					((Class387_Sub1) this).anInt8080 = i_1618_;
					((Class387_Sub1) this).anInt8061 = i_1619_;
					((Class387_Sub1) this).anInt8055 = i_1620_;
					((Class387_Sub1) this).aBoolean8048 = false;
				}
				int[] is_1621_ = new int[9];
				int i_1622_ = Class257.anIntArray2684[i_1592_];
				int i_1623_ = Class257.anIntArray2683[i_1592_];
				int i_1624_ = Class257.anIntArray2684[i_1593_];
				int i_1625_ = Class257.anIntArray2683[i_1593_];
				int i_1626_ = Class257.anIntArray2684[i_1594_];
				int i_1627_ = Class257.anIntArray2683[i_1594_];
				int i_1628_ = i_1623_ * i_1626_ + 8192 >> 14;
				int i_1629_ = i_1623_ * i_1627_ + 8192 >> 14;
				is_1621_[0] = i_1624_ * i_1626_ + i_1625_ * i_1629_ + 8192 >> 14;
				is_1621_[1] = -i_1624_ * i_1627_ + i_1625_ * i_1628_ + 8192 >> 14;
				is_1621_[2] = i_1625_ * i_1622_ + 8192 >> 14;
				is_1621_[3] = i_1622_ * i_1627_ + 8192 >> 14;
				is_1621_[4] = i_1622_ * i_1626_ + 8192 >> 14;
				is_1621_[5] = -i_1623_;
				is_1621_[6] = -i_1625_ * i_1626_ + i_1624_ * i_1629_ + 8192 >> 14;
				is_1621_[7] = i_1625_ * i_1627_ + i_1624_ * i_1628_ + 8192 >> 14;
				is_1621_[8] = i_1624_ * i_1622_ + 8192 >> 14;
				int i_1630_ = ((is_1621_[0] * -((Class387_Sub1) this).anInt8080 + is_1621_[1] * -((Class387_Sub1) this).anInt8061 + is_1621_[2] * -((Class387_Sub1) this).anInt8055 + 8192) >> 14);
				int i_1631_ = ((is_1621_[3] * -((Class387_Sub1) this).anInt8080 + is_1621_[4] * -((Class387_Sub1) this).anInt8061 + is_1621_[5] * -((Class387_Sub1) this).anInt8055 + 8192) >> 14);
				int i_1632_ = ((is_1621_[6] * -((Class387_Sub1) this).anInt8080 + is_1621_[7] * -((Class387_Sub1) this).anInt8061 + is_1621_[8] * -((Class387_Sub1) this).anInt8055 + 8192) >> 14);
				int i_1633_ = i_1630_ + ((Class387_Sub1) this).anInt8080;
				int i_1634_ = i_1631_ + ((Class387_Sub1) this).anInt8061;
				int i_1635_ = i_1632_ + ((Class387_Sub1) this).anInt8055;
				int[] is_1636_ = new int[9];
				for (int i_1637_ = 0; i_1637_ < 3; i_1637_++) {
					for (int i_1638_ = 0; i_1638_ < 3; i_1638_++) {
						int i_1639_ = 0;
						for (int i_1640_ = 0; i_1640_ < 3; i_1640_++)
							i_1639_ += (is_1621_[i_1637_ * 3 + i_1640_] * is_1596_[i_1638_ * 3 + i_1640_]);
						is_1636_[i_1637_ * 3 + i_1638_] = i_1639_ + 8192 >> 14;
					}
				}
				int i_1641_ = ((is_1621_[0] * i_1615_ + is_1621_[1] * i_1616_ + is_1621_[2] * i_1617_ + 8192) >> 14);
				int i_1642_ = ((is_1621_[3] * i_1615_ + is_1621_[4] * i_1616_ + is_1621_[5] * i_1617_ + 8192) >> 14);
				int i_1643_ = ((is_1621_[6] * i_1615_ + is_1621_[7] * i_1616_ + is_1621_[8] * i_1617_ + 8192) >> 14);
				i_1641_ += i_1633_;
				i_1642_ += i_1634_;
				i_1643_ += i_1635_;
				int[] is_1644_ = new int[9];
				for (int i_1645_ = 0; i_1645_ < 3; i_1645_++) {
					for (int i_1646_ = 0; i_1646_ < 3; i_1646_++) {
						int i_1647_ = 0;
						for (int i_1648_ = 0; i_1648_ < 3; i_1648_++)
							i_1647_ += (is_1596_[i_1645_ * 3 + i_1648_] * is_1636_[i_1646_ + i_1648_ * 3]);
						is_1644_[i_1645_ * 3 + i_1646_] = i_1647_ + 8192 >> 14;
					}
				}
				int i_1649_ = ((is_1596_[0] * i_1641_ + is_1596_[1] * i_1642_ + is_1596_[2] * i_1643_ + 8192) >> 14);
				int i_1650_ = ((is_1596_[3] * i_1641_ + is_1596_[4] * i_1642_ + is_1596_[5] * i_1643_ + 8192) >> 14);
				int i_1651_ = ((is_1596_[6] * i_1641_ + is_1596_[7] * i_1642_ + is_1596_[8] * i_1643_ + 8192) >> 14);
				i_1649_ += i_1612_;
				i_1650_ += i_1613_;
				i_1651_ += i_1614_;
				for (int i_1652_ = 0; i_1652_ < i_1597_; i_1652_++) {
					int i_1653_ = is[i_1652_];
					if (i_1653_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_1654_ = (((Class387_Sub1) this).anIntArrayArray8022[i_1653_]);
						for (int i_1655_ = 0; i_1655_ < is_1654_.length; i_1655_++) {
							int i_1656_ = is_1654_[i_1655_];
							if (((Class387_Sub1) this).aShortArray8023 == null || ((i_1595_ & (((Class387_Sub1) this).aShortArray8023[i_1656_])) != 0)) {
								int i_1657_ = (is_1644_[0] * (((Class387_Sub1) this).anIntArray8065[i_1656_]) + is_1644_[1] * (((Class387_Sub1) this).anIntArray8020[i_1656_]) + is_1644_[2] * (((Class387_Sub1) this).anIntArray8051[i_1656_]) + 8192) >> 14;
								int i_1658_ = (is_1644_[3] * (((Class387_Sub1) this).anIntArray8065[i_1656_]) + is_1644_[4] * (((Class387_Sub1) this).anIntArray8020[i_1656_]) + is_1644_[5] * (((Class387_Sub1) this).anIntArray8051[i_1656_]) + 8192) >> 14;
								int i_1659_ = (is_1644_[6] * (((Class387_Sub1) this).anIntArray8065[i_1656_]) + is_1644_[7] * (((Class387_Sub1) this).anIntArray8020[i_1656_]) + is_1644_[8] * (((Class387_Sub1) this).anIntArray8051[i_1656_]) + 8192) >> 14;
								i_1657_ += i_1649_;
								i_1658_ += i_1650_;
								i_1659_ += i_1651_;
								((Class387_Sub1) this).anIntArray8065[i_1656_] = i_1657_;
								((Class387_Sub1) this).anIntArray8020[i_1656_] = i_1658_;
								((Class387_Sub1) this).anIntArray8051[i_1656_] = i_1659_;
							}
						}
					}
				}
			} else {
				for (int i_1660_ = 0; i_1660_ < i_1597_; i_1660_++) {
					int i_1661_ = is[i_1660_];
					if (i_1661_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_1662_ = (((Class387_Sub1) this).anIntArrayArray8022[i_1661_]);
						for (int i_1663_ = 0; i_1663_ < is_1662_.length; i_1663_++) {
							int i_1664_ = is_1662_[i_1663_];
							if (((Class387_Sub1) this).aShortArray8023 == null || ((i_1595_ & (((Class387_Sub1) this).aShortArray8023[i_1664_])) != 0)) {
								((Class387_Sub1) this).anIntArray8065[i_1664_] -= ((Class387_Sub1) this).anInt8080;
								((Class387_Sub1) this).anIntArray8020[i_1664_] -= ((Class387_Sub1) this).anInt8061;
								((Class387_Sub1) this).anIntArray8051[i_1664_] -= ((Class387_Sub1) this).anInt8055;
								if (i_1594_ != 0) {
									int i_1665_ = Class257.anIntArray2683[i_1594_];
									int i_1666_ = Class257.anIntArray2684[i_1594_];
									int i_1667_ = ((((Class387_Sub1) this).anIntArray8020[i_1664_]) * i_1665_ + ((((Class387_Sub1) this).anIntArray8065[i_1664_]) * i_1666_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8020[i_1664_] = ((((Class387_Sub1) this).anIntArray8020[i_1664_]) * i_1666_ - ((((Class387_Sub1) this).anIntArray8065[i_1664_]) * i_1665_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8065[i_1664_] = i_1667_;
								}
								if (i_1592_ != 0) {
									int i_1668_ = Class257.anIntArray2683[i_1592_];
									int i_1669_ = Class257.anIntArray2684[i_1592_];
									int i_1670_ = ((((Class387_Sub1) this).anIntArray8020[i_1664_]) * i_1669_ - ((((Class387_Sub1) this).anIntArray8051[i_1664_]) * i_1668_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8051[i_1664_] = ((((Class387_Sub1) this).anIntArray8020[i_1664_]) * i_1668_ + ((((Class387_Sub1) this).anIntArray8051[i_1664_]) * i_1669_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8020[i_1664_] = i_1670_;
								}
								if (i_1593_ != 0) {
									int i_1671_ = Class257.anIntArray2683[i_1593_];
									int i_1672_ = Class257.anIntArray2684[i_1593_];
									int i_1673_ = ((((Class387_Sub1) this).anIntArray8051[i_1664_]) * i_1671_ + ((((Class387_Sub1) this).anIntArray8065[i_1664_]) * i_1672_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8051[i_1664_] = ((((Class387_Sub1) this).anIntArray8051[i_1664_]) * i_1672_ - ((((Class387_Sub1) this).anIntArray8065[i_1664_]) * i_1671_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8065[i_1664_] = i_1673_;
								}
								((Class387_Sub1) this).anIntArray8065[i_1664_] += ((Class387_Sub1) this).anInt8080;
								((Class387_Sub1) this).anIntArray8020[i_1664_] += ((Class387_Sub1) this).anInt8061;
								((Class387_Sub1) this).anIntArray8051[i_1664_] += ((Class387_Sub1) this).anInt8055;
							}
						}
					}
				}
				if (bool) {
					for (int i_1674_ = 0; i_1674_ < i_1597_; i_1674_++) {
						int i_1675_ = is[i_1674_];
						if (i_1675_ < (((Class387_Sub1) this).anIntArrayArray8022).length) {
							int[] is_1676_ = (((Class387_Sub1) this).anIntArrayArray8022[i_1675_]);
							for (int i_1677_ = 0; i_1677_ < is_1676_.length; i_1677_++) {
								int i_1678_ = is_1676_[i_1677_];
								if ((((Class387_Sub1) this).aShortArray8023 == null) || ((i_1595_ & (((Class387_Sub1) this).aShortArray8023[i_1678_])) != 0)) {
									int i_1679_ = (((Class387_Sub1) this).anIntArray8082[i_1678_]);
									int i_1680_ = (((Class387_Sub1) this).anIntArray8082[i_1678_ + 1]);
									for (int i_1681_ = i_1679_; i_1681_ < i_1680_; i_1681_++) {
										int i_1682_ = ((((Class387_Sub1) this).aShortArray8052[i_1681_]) - 1);
										if (i_1682_ == -1)
											break;
										if (i_1594_ != 0) {
											int i_1683_ = (Class257.anIntArray2683[i_1594_]);
											int i_1684_ = (Class257.anIntArray2684[i_1594_]);
											int i_1685_ = (((((Class387_Sub1) this).aShortArray8028[i_1682_]) * i_1683_ + (((Class387_Sub1) this).aShortArray8032[i_1682_]) * i_1684_ + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8028[i_1682_] = (short) ((((((Class387_Sub1) this).aShortArray8028[i_1682_]) * i_1684_) - ((((Class387_Sub1) this).aShortArray8032[i_1682_]) * i_1683_) + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8032[i_1682_] = (short) i_1685_;
										}
										if (i_1592_ != 0) {
											int i_1686_ = (Class257.anIntArray2683[i_1592_]);
											int i_1687_ = (Class257.anIntArray2684[i_1592_]);
											int i_1688_ = (((((Class387_Sub1) this).aShortArray8028[i_1682_]) * i_1687_ - (((Class387_Sub1) this).aShortArray8024[i_1682_]) * i_1686_ + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8024[i_1682_] = (short) ((((((Class387_Sub1) this).aShortArray8028[i_1682_]) * i_1686_) + ((((Class387_Sub1) this).aShortArray8024[i_1682_]) * i_1687_) + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8028[i_1682_] = (short) i_1688_;
										}
										if (i_1593_ != 0) {
											int i_1689_ = (Class257.anIntArray2683[i_1593_]);
											int i_1690_ = (Class257.anIntArray2684[i_1593_]);
											int i_1691_ = (((((Class387_Sub1) this).aShortArray8024[i_1682_]) * i_1689_ + (((Class387_Sub1) this).aShortArray8032[i_1682_]) * i_1690_ + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8024[i_1682_] = (short) ((((((Class387_Sub1) this).aShortArray8024[i_1682_]) * i_1690_) - ((((Class387_Sub1) this).aShortArray8032[i_1682_]) * i_1689_) + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8032[i_1682_] = (short) i_1691_;
										}
									}
								}
							}
						}
					}
					method4499();
				}
			}
		} else if (i == 3) {
			if (is_1596_ != null) {
				int i_1692_ = is_1596_[9] << 4;
				int i_1693_ = is_1596_[10] << 4;
				int i_1694_ = is_1596_[11] << 4;
				int i_1695_ = is_1596_[12] << 4;
				int i_1696_ = is_1596_[13] << 4;
				int i_1697_ = is_1596_[14] << 4;
				if (((Class387_Sub1) this).aBoolean8048) {
					int i_1698_ = ((is_1596_[0] * ((Class387_Sub1) this).anInt8080 + is_1596_[3] * ((Class387_Sub1) this).anInt8061 + is_1596_[6] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					int i_1699_ = ((is_1596_[1] * ((Class387_Sub1) this).anInt8080 + is_1596_[4] * ((Class387_Sub1) this).anInt8061 + is_1596_[7] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					int i_1700_ = ((is_1596_[2] * ((Class387_Sub1) this).anInt8080 + is_1596_[5] * ((Class387_Sub1) this).anInt8061 + is_1596_[8] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					i_1698_ += i_1695_;
					i_1699_ += i_1696_;
					i_1700_ += i_1697_;
					((Class387_Sub1) this).anInt8080 = i_1698_;
					((Class387_Sub1) this).anInt8061 = i_1699_;
					((Class387_Sub1) this).anInt8055 = i_1700_;
					((Class387_Sub1) this).aBoolean8048 = false;
				}
				int i_1701_ = i_1592_ << 15 >> 7;
				int i_1702_ = i_1593_ << 15 >> 7;
				int i_1703_ = i_1594_ << 15 >> 7;
				int i_1704_ = i_1701_ * -((Class387_Sub1) this).anInt8080 + 8192 >> 14;
				int i_1705_ = i_1702_ * -((Class387_Sub1) this).anInt8061 + 8192 >> 14;
				int i_1706_ = i_1703_ * -((Class387_Sub1) this).anInt8055 + 8192 >> 14;
				int i_1707_ = i_1704_ + ((Class387_Sub1) this).anInt8080;
				int i_1708_ = i_1705_ + ((Class387_Sub1) this).anInt8061;
				int i_1709_ = i_1706_ + ((Class387_Sub1) this).anInt8055;
				int[] is_1710_ = new int[9];
				is_1710_[0] = i_1701_ * is_1596_[0] + 8192 >> 14;
				is_1710_[1] = i_1701_ * is_1596_[3] + 8192 >> 14;
				is_1710_[2] = i_1701_ * is_1596_[6] + 8192 >> 14;
				is_1710_[3] = i_1702_ * is_1596_[1] + 8192 >> 14;
				is_1710_[4] = i_1702_ * is_1596_[4] + 8192 >> 14;
				is_1710_[5] = i_1702_ * is_1596_[7] + 8192 >> 14;
				is_1710_[6] = i_1703_ * is_1596_[2] + 8192 >> 14;
				is_1710_[7] = i_1703_ * is_1596_[5] + 8192 >> 14;
				is_1710_[8] = i_1703_ * is_1596_[8] + 8192 >> 14;
				int i_1711_ = i_1701_ * i_1695_ + 8192 >> 14;
				int i_1712_ = i_1702_ * i_1696_ + 8192 >> 14;
				int i_1713_ = i_1703_ * i_1697_ + 8192 >> 14;
				i_1711_ += i_1707_;
				i_1712_ += i_1708_;
				i_1713_ += i_1709_;
				int[] is_1714_ = new int[9];
				for (int i_1715_ = 0; i_1715_ < 3; i_1715_++) {
					for (int i_1716_ = 0; i_1716_ < 3; i_1716_++) {
						int i_1717_ = 0;
						for (int i_1718_ = 0; i_1718_ < 3; i_1718_++)
							i_1717_ += (is_1596_[i_1715_ * 3 + i_1718_] * is_1710_[i_1716_ + i_1718_ * 3]);
						is_1714_[i_1715_ * 3 + i_1716_] = i_1717_ + 8192 >> 14;
					}
				}
				int i_1719_ = ((is_1596_[0] * i_1711_ + is_1596_[1] * i_1712_ + is_1596_[2] * i_1713_ + 8192) >> 14);
				int i_1720_ = ((is_1596_[3] * i_1711_ + is_1596_[4] * i_1712_ + is_1596_[5] * i_1713_ + 8192) >> 14);
				int i_1721_ = ((is_1596_[6] * i_1711_ + is_1596_[7] * i_1712_ + is_1596_[8] * i_1713_ + 8192) >> 14);
				i_1719_ += i_1692_;
				i_1720_ += i_1693_;
				i_1721_ += i_1694_;
				for (int i_1722_ = 0; i_1722_ < i_1597_; i_1722_++) {
					int i_1723_ = is[i_1722_];
					if (i_1723_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_1724_ = (((Class387_Sub1) this).anIntArrayArray8022[i_1723_]);
						for (int i_1725_ = 0; i_1725_ < is_1724_.length; i_1725_++) {
							int i_1726_ = is_1724_[i_1725_];
							if (((Class387_Sub1) this).aShortArray8023 == null || ((i_1595_ & (((Class387_Sub1) this).aShortArray8023[i_1726_])) != 0)) {
								int i_1727_ = (is_1714_[0] * (((Class387_Sub1) this).anIntArray8065[i_1726_]) + is_1714_[1] * (((Class387_Sub1) this).anIntArray8020[i_1726_]) + is_1714_[2] * (((Class387_Sub1) this).anIntArray8051[i_1726_]) + 8192) >> 14;
								int i_1728_ = (is_1714_[3] * (((Class387_Sub1) this).anIntArray8065[i_1726_]) + is_1714_[4] * (((Class387_Sub1) this).anIntArray8020[i_1726_]) + is_1714_[5] * (((Class387_Sub1) this).anIntArray8051[i_1726_]) + 8192) >> 14;
								int i_1729_ = (is_1714_[6] * (((Class387_Sub1) this).anIntArray8065[i_1726_]) + is_1714_[7] * (((Class387_Sub1) this).anIntArray8020[i_1726_]) + is_1714_[8] * (((Class387_Sub1) this).anIntArray8051[i_1726_]) + 8192) >> 14;
								i_1727_ += i_1719_;
								i_1728_ += i_1720_;
								i_1729_ += i_1721_;
								((Class387_Sub1) this).anIntArray8065[i_1726_] = i_1727_;
								((Class387_Sub1) this).anIntArray8020[i_1726_] = i_1728_;
								((Class387_Sub1) this).anIntArray8051[i_1726_] = i_1729_;
							}
						}
					}
				}
			} else {
				for (int i_1730_ = 0; i_1730_ < i_1597_; i_1730_++) {
					int i_1731_ = is[i_1730_];
					if (i_1731_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_1732_ = (((Class387_Sub1) this).anIntArrayArray8022[i_1731_]);
						for (int i_1733_ = 0; i_1733_ < is_1732_.length; i_1733_++) {
							int i_1734_ = is_1732_[i_1733_];
							if (((Class387_Sub1) this).aShortArray8023 == null || ((i_1595_ & (((Class387_Sub1) this).aShortArray8023[i_1734_])) != 0)) {
								((Class387_Sub1) this).anIntArray8065[i_1734_] -= ((Class387_Sub1) this).anInt8080;
								((Class387_Sub1) this).anIntArray8020[i_1734_] -= ((Class387_Sub1) this).anInt8061;
								((Class387_Sub1) this).anIntArray8051[i_1734_] -= ((Class387_Sub1) this).anInt8055;
								((Class387_Sub1) this).anIntArray8065[i_1734_] = (((Class387_Sub1) this).anIntArray8065[i_1734_]) * i_1592_ >> 7;
								((Class387_Sub1) this).anIntArray8020[i_1734_] = (((Class387_Sub1) this).anIntArray8020[i_1734_]) * i_1593_ >> 7;
								((Class387_Sub1) this).anIntArray8051[i_1734_] = (((Class387_Sub1) this).anIntArray8051[i_1734_]) * i_1594_ >> 7;
								((Class387_Sub1) this).anIntArray8065[i_1734_] += ((Class387_Sub1) this).anInt8080;
								((Class387_Sub1) this).anIntArray8020[i_1734_] += ((Class387_Sub1) this).anInt8061;
								((Class387_Sub1) this).anIntArray8051[i_1734_] += ((Class387_Sub1) this).anInt8055;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub1) this).anIntArrayArray8017 != null) {
				boolean bool_1735_ = false;
				for (int i_1736_ = 0; i_1736_ < i_1597_; i_1736_++) {
					int i_1737_ = is[i_1736_];
					if (i_1737_ < ((Class387_Sub1) this).anIntArrayArray8017.length) {
						int[] is_1738_ = (((Class387_Sub1) this).anIntArrayArray8017[i_1737_]);
						for (int i_1739_ = 0; i_1739_ < is_1738_.length; i_1739_++) {
							int i_1740_ = is_1738_[i_1739_];
							if (((Class387_Sub1) this).aShortArray8018 == null || ((i_1595_ & (((Class387_Sub1) this).aShortArray8018[i_1740_])) != 0)) {
								int i_1741_ = (((((Class387_Sub1) this).aByteArray8037[i_1740_]) & 0xff) + i_1592_ * 8);
								if (i_1741_ < 0)
									i_1741_ = 0;
								else if (i_1741_ > 255)
									i_1741_ = 255;
								((Class387_Sub1) this).aByteArray8037[i_1740_] = (byte) i_1741_;
							}
						}
						bool_1735_ = bool_1735_ | is_1738_.length > 0;
					}
				}
				if (bool_1735_) {
					if (((Class387_Sub1) this).aClass185Array8070 != null) {
						for (int i_1742_ = 0; i_1742_ < ((Class387_Sub1) this).anInt8069; i_1742_++) {
							Class185 class185 = (((Class387_Sub1) this).aClass185Array8070[i_1742_]);
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[i_1742_]);
							((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & 0xffffff | 255 - ((((Class387_Sub1) this).aByteArray8037[((Class185) class185).modelColorIndex]) & 0xff) << 24);
						}
					}
					method4507();
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub1) this).anIntArrayArray8017 != null) {
				boolean bool_1743_ = false;
				for (int i_1744_ = 0; i_1744_ < i_1597_; i_1744_++) {
					int i_1745_ = is[i_1744_];
					if (i_1745_ < ((Class387_Sub1) this).anIntArrayArray8017.length) {
						int[] is_1746_ = (((Class387_Sub1) this).anIntArrayArray8017[i_1745_]);
						for (int i_1747_ = 0; i_1747_ < is_1746_.length; i_1747_++) {
							int i_1748_ = is_1746_[i_1747_];
							if (((Class387_Sub1) this).aShortArray8018 == null || ((i_1595_ & (((Class387_Sub1) this).aShortArray8018[i_1748_])) != 0)) {
								int i_1749_ = ((((Class387_Sub1) this).modelColors[i_1748_]) & 0xffff);
								int i_1750_ = i_1749_ >> 10 & 0x3f;
								int i_1751_ = i_1749_ >> 7 & 0x7;
								int i_1752_ = i_1749_ & 0x7f;
								i_1750_ = i_1750_ + i_1592_ & 0x3f;
								i_1751_ += i_1593_ / 4;
								if (i_1751_ < 0)
									i_1751_ = 0;
								else if (i_1751_ > 7)
									i_1751_ = 7;
								i_1752_ += i_1594_;
								if (i_1752_ < 0)
									i_1752_ = 0;
								else if (i_1752_ > 127)
									i_1752_ = 127;
								((Class387_Sub1) this).modelColors[i_1748_] = (short) (i_1750_ << 10 | i_1751_ << 7 | i_1752_);
							}
						}
						bool_1743_ = bool_1743_ | is_1746_.length > 0;
					}
				}
				if (bool_1743_) {
					if (((Class387_Sub1) this).aClass185Array8070 != null) {
						for (int i_1753_ = 0; i_1753_ < ((Class387_Sub1) this).anInt8069; i_1753_++) {
							Class185 class185 = (((Class387_Sub1) this).aClass185Array8070[i_1753_]);
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[i_1753_]);
							((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | (Console.colorArray[((((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff)]) & 0xffffff);
						}
					}
					method4507();
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_1754_ = 0; i_1754_ < i_1597_; i_1754_++) {
					int i_1755_ = is[i_1754_];
					if (i_1755_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_1756_ = (((Class387_Sub1) this).anIntArrayArray8072[i_1755_]);
						for (int i_1757_ = 0; i_1757_ < is_1756_.length; i_1757_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_1756_[i_1757_]]);
							((Class177) class177).anInt1751 += i_1592_;
							((Class177) class177).anInt1748 += i_1593_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_1758_ = 0; i_1758_ < i_1597_; i_1758_++) {
					int i_1759_ = is[i_1758_];
					if (i_1759_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_1760_ = (((Class387_Sub1) this).anIntArrayArray8072[i_1759_]);
						for (int i_1761_ = 0; i_1761_ < is_1760_.length; i_1761_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_1760_[i_1761_]]);
							((Class177) class177).anInt1752 = (((Class177) class177).anInt1752 * i_1592_ >> 7);
							((Class177) class177).anInt1749 = (((Class177) class177).anInt1749 * i_1593_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_1762_ = 0; i_1762_ < i_1597_; i_1762_++) {
					int i_1763_ = is[i_1762_];
					if (i_1763_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_1764_ = (((Class387_Sub1) this).anIntArrayArray8072[i_1763_]);
						for (int i_1765_ = 0; i_1765_ < is_1764_.length; i_1765_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_1764_[i_1765_]]);
							((Class177) class177).anInt1753 = (((Class177) class177).anInt1753 + i_1592_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public byte[] dz() {
		return ((Class387_Sub1) this).aByteArray8037;
	}

	void ee(int i, int[] is, int i_1766_, int i_1767_, int i_1768_, boolean bool, int i_1769_, int[] is_1770_) {
		int i_1771_ = is.length;
		if (i == 0) {
			i_1766_ <<= 4;
			i_1767_ <<= 4;
			i_1768_ <<= 4;
			int i_1772_ = 0;
			((Class387_Sub1) this).anInt8080 = 0;
			((Class387_Sub1) this).anInt8061 = 0;
			((Class387_Sub1) this).anInt8055 = 0;
			for (int i_1773_ = 0; i_1773_ < i_1771_; i_1773_++) {
				int i_1774_ = is[i_1773_];
				if (i_1774_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_1775_ = ((Class387_Sub1) this).anIntArrayArray8022[i_1774_];
					for (int i_1776_ = 0; i_1776_ < is_1775_.length; i_1776_++) {
						int i_1777_ = is_1775_[i_1776_];
						if (((Class387_Sub1) this).aShortArray8023 == null || (i_1769_ & (((Class387_Sub1) this).aShortArray8023[i_1777_])) != 0) {
							((Class387_Sub1) this).anInt8080 += (((Class387_Sub1) this).anIntArray8065[i_1777_]);
							((Class387_Sub1) this).anInt8061 += (((Class387_Sub1) this).anIntArray8020[i_1777_]);
							((Class387_Sub1) this).anInt8055 += (((Class387_Sub1) this).anIntArray8051[i_1777_]);
							i_1772_++;
						}
					}
				}
			}
			if (i_1772_ > 0) {
				((Class387_Sub1) this).anInt8080 = ((Class387_Sub1) this).anInt8080 / i_1772_ + i_1766_;
				((Class387_Sub1) this).anInt8061 = ((Class387_Sub1) this).anInt8061 / i_1772_ + i_1767_;
				((Class387_Sub1) this).anInt8055 = ((Class387_Sub1) this).anInt8055 / i_1772_ + i_1768_;
				((Class387_Sub1) this).aBoolean8048 = true;
			} else {
				((Class387_Sub1) this).anInt8080 = i_1766_;
				((Class387_Sub1) this).anInt8061 = i_1767_;
				((Class387_Sub1) this).anInt8055 = i_1768_;
			}
		} else if (i == 1) {
			if (is_1770_ != null) {
				int i_1778_ = ((is_1770_[0] * i_1766_ + is_1770_[1] * i_1767_ + is_1770_[2] * i_1768_ + 8192) >> 14);
				int i_1779_ = ((is_1770_[3] * i_1766_ + is_1770_[4] * i_1767_ + is_1770_[5] * i_1768_ + 8192) >> 14);
				int i_1780_ = ((is_1770_[6] * i_1766_ + is_1770_[7] * i_1767_ + is_1770_[8] * i_1768_ + 8192) >> 14);
				i_1766_ = i_1778_;
				i_1767_ = i_1779_;
				i_1768_ = i_1780_;
			}
			i_1766_ <<= 4;
			i_1767_ <<= 4;
			i_1768_ <<= 4;
			for (int i_1781_ = 0; i_1781_ < i_1771_; i_1781_++) {
				int i_1782_ = is[i_1781_];
				if (i_1782_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
					int[] is_1783_ = ((Class387_Sub1) this).anIntArrayArray8022[i_1782_];
					for (int i_1784_ = 0; i_1784_ < is_1783_.length; i_1784_++) {
						int i_1785_ = is_1783_[i_1784_];
						if (((Class387_Sub1) this).aShortArray8023 == null || (i_1769_ & (((Class387_Sub1) this).aShortArray8023[i_1785_])) != 0) {
							((Class387_Sub1) this).anIntArray8065[i_1785_] += i_1766_;
							((Class387_Sub1) this).anIntArray8020[i_1785_] += i_1767_;
							((Class387_Sub1) this).anIntArray8051[i_1785_] += i_1768_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1770_ != null) {
				int i_1786_ = is_1770_[9] << 4;
				int i_1787_ = is_1770_[10] << 4;
				int i_1788_ = is_1770_[11] << 4;
				int i_1789_ = is_1770_[12] << 4;
				int i_1790_ = is_1770_[13] << 4;
				int i_1791_ = is_1770_[14] << 4;
				if (((Class387_Sub1) this).aBoolean8048) {
					int i_1792_ = ((is_1770_[0] * ((Class387_Sub1) this).anInt8080 + is_1770_[3] * ((Class387_Sub1) this).anInt8061 + is_1770_[6] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					int i_1793_ = ((is_1770_[1] * ((Class387_Sub1) this).anInt8080 + is_1770_[4] * ((Class387_Sub1) this).anInt8061 + is_1770_[7] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					int i_1794_ = ((is_1770_[2] * ((Class387_Sub1) this).anInt8080 + is_1770_[5] * ((Class387_Sub1) this).anInt8061 + is_1770_[8] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					i_1792_ += i_1789_;
					i_1793_ += i_1790_;
					i_1794_ += i_1791_;
					((Class387_Sub1) this).anInt8080 = i_1792_;
					((Class387_Sub1) this).anInt8061 = i_1793_;
					((Class387_Sub1) this).anInt8055 = i_1794_;
					((Class387_Sub1) this).aBoolean8048 = false;
				}
				int[] is_1795_ = new int[9];
				int i_1796_ = Class257.anIntArray2684[i_1766_];
				int i_1797_ = Class257.anIntArray2683[i_1766_];
				int i_1798_ = Class257.anIntArray2684[i_1767_];
				int i_1799_ = Class257.anIntArray2683[i_1767_];
				int i_1800_ = Class257.anIntArray2684[i_1768_];
				int i_1801_ = Class257.anIntArray2683[i_1768_];
				int i_1802_ = i_1797_ * i_1800_ + 8192 >> 14;
				int i_1803_ = i_1797_ * i_1801_ + 8192 >> 14;
				is_1795_[0] = i_1798_ * i_1800_ + i_1799_ * i_1803_ + 8192 >> 14;
				is_1795_[1] = -i_1798_ * i_1801_ + i_1799_ * i_1802_ + 8192 >> 14;
				is_1795_[2] = i_1799_ * i_1796_ + 8192 >> 14;
				is_1795_[3] = i_1796_ * i_1801_ + 8192 >> 14;
				is_1795_[4] = i_1796_ * i_1800_ + 8192 >> 14;
				is_1795_[5] = -i_1797_;
				is_1795_[6] = -i_1799_ * i_1800_ + i_1798_ * i_1803_ + 8192 >> 14;
				is_1795_[7] = i_1799_ * i_1801_ + i_1798_ * i_1802_ + 8192 >> 14;
				is_1795_[8] = i_1798_ * i_1796_ + 8192 >> 14;
				int i_1804_ = ((is_1795_[0] * -((Class387_Sub1) this).anInt8080 + is_1795_[1] * -((Class387_Sub1) this).anInt8061 + is_1795_[2] * -((Class387_Sub1) this).anInt8055 + 8192) >> 14);
				int i_1805_ = ((is_1795_[3] * -((Class387_Sub1) this).anInt8080 + is_1795_[4] * -((Class387_Sub1) this).anInt8061 + is_1795_[5] * -((Class387_Sub1) this).anInt8055 + 8192) >> 14);
				int i_1806_ = ((is_1795_[6] * -((Class387_Sub1) this).anInt8080 + is_1795_[7] * -((Class387_Sub1) this).anInt8061 + is_1795_[8] * -((Class387_Sub1) this).anInt8055 + 8192) >> 14);
				int i_1807_ = i_1804_ + ((Class387_Sub1) this).anInt8080;
				int i_1808_ = i_1805_ + ((Class387_Sub1) this).anInt8061;
				int i_1809_ = i_1806_ + ((Class387_Sub1) this).anInt8055;
				int[] is_1810_ = new int[9];
				for (int i_1811_ = 0; i_1811_ < 3; i_1811_++) {
					for (int i_1812_ = 0; i_1812_ < 3; i_1812_++) {
						int i_1813_ = 0;
						for (int i_1814_ = 0; i_1814_ < 3; i_1814_++)
							i_1813_ += (is_1795_[i_1811_ * 3 + i_1814_] * is_1770_[i_1812_ * 3 + i_1814_]);
						is_1810_[i_1811_ * 3 + i_1812_] = i_1813_ + 8192 >> 14;
					}
				}
				int i_1815_ = ((is_1795_[0] * i_1789_ + is_1795_[1] * i_1790_ + is_1795_[2] * i_1791_ + 8192) >> 14);
				int i_1816_ = ((is_1795_[3] * i_1789_ + is_1795_[4] * i_1790_ + is_1795_[5] * i_1791_ + 8192) >> 14);
				int i_1817_ = ((is_1795_[6] * i_1789_ + is_1795_[7] * i_1790_ + is_1795_[8] * i_1791_ + 8192) >> 14);
				i_1815_ += i_1807_;
				i_1816_ += i_1808_;
				i_1817_ += i_1809_;
				int[] is_1818_ = new int[9];
				for (int i_1819_ = 0; i_1819_ < 3; i_1819_++) {
					for (int i_1820_ = 0; i_1820_ < 3; i_1820_++) {
						int i_1821_ = 0;
						for (int i_1822_ = 0; i_1822_ < 3; i_1822_++)
							i_1821_ += (is_1770_[i_1819_ * 3 + i_1822_] * is_1810_[i_1820_ + i_1822_ * 3]);
						is_1818_[i_1819_ * 3 + i_1820_] = i_1821_ + 8192 >> 14;
					}
				}
				int i_1823_ = ((is_1770_[0] * i_1815_ + is_1770_[1] * i_1816_ + is_1770_[2] * i_1817_ + 8192) >> 14);
				int i_1824_ = ((is_1770_[3] * i_1815_ + is_1770_[4] * i_1816_ + is_1770_[5] * i_1817_ + 8192) >> 14);
				int i_1825_ = ((is_1770_[6] * i_1815_ + is_1770_[7] * i_1816_ + is_1770_[8] * i_1817_ + 8192) >> 14);
				i_1823_ += i_1786_;
				i_1824_ += i_1787_;
				i_1825_ += i_1788_;
				for (int i_1826_ = 0; i_1826_ < i_1771_; i_1826_++) {
					int i_1827_ = is[i_1826_];
					if (i_1827_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_1828_ = (((Class387_Sub1) this).anIntArrayArray8022[i_1827_]);
						for (int i_1829_ = 0; i_1829_ < is_1828_.length; i_1829_++) {
							int i_1830_ = is_1828_[i_1829_];
							if (((Class387_Sub1) this).aShortArray8023 == null || ((i_1769_ & (((Class387_Sub1) this).aShortArray8023[i_1830_])) != 0)) {
								int i_1831_ = (is_1818_[0] * (((Class387_Sub1) this).anIntArray8065[i_1830_]) + is_1818_[1] * (((Class387_Sub1) this).anIntArray8020[i_1830_]) + is_1818_[2] * (((Class387_Sub1) this).anIntArray8051[i_1830_]) + 8192) >> 14;
								int i_1832_ = (is_1818_[3] * (((Class387_Sub1) this).anIntArray8065[i_1830_]) + is_1818_[4] * (((Class387_Sub1) this).anIntArray8020[i_1830_]) + is_1818_[5] * (((Class387_Sub1) this).anIntArray8051[i_1830_]) + 8192) >> 14;
								int i_1833_ = (is_1818_[6] * (((Class387_Sub1) this).anIntArray8065[i_1830_]) + is_1818_[7] * (((Class387_Sub1) this).anIntArray8020[i_1830_]) + is_1818_[8] * (((Class387_Sub1) this).anIntArray8051[i_1830_]) + 8192) >> 14;
								i_1831_ += i_1823_;
								i_1832_ += i_1824_;
								i_1833_ += i_1825_;
								((Class387_Sub1) this).anIntArray8065[i_1830_] = i_1831_;
								((Class387_Sub1) this).anIntArray8020[i_1830_] = i_1832_;
								((Class387_Sub1) this).anIntArray8051[i_1830_] = i_1833_;
							}
						}
					}
				}
			} else {
				for (int i_1834_ = 0; i_1834_ < i_1771_; i_1834_++) {
					int i_1835_ = is[i_1834_];
					if (i_1835_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_1836_ = (((Class387_Sub1) this).anIntArrayArray8022[i_1835_]);
						for (int i_1837_ = 0; i_1837_ < is_1836_.length; i_1837_++) {
							int i_1838_ = is_1836_[i_1837_];
							if (((Class387_Sub1) this).aShortArray8023 == null || ((i_1769_ & (((Class387_Sub1) this).aShortArray8023[i_1838_])) != 0)) {
								((Class387_Sub1) this).anIntArray8065[i_1838_] -= ((Class387_Sub1) this).anInt8080;
								((Class387_Sub1) this).anIntArray8020[i_1838_] -= ((Class387_Sub1) this).anInt8061;
								((Class387_Sub1) this).anIntArray8051[i_1838_] -= ((Class387_Sub1) this).anInt8055;
								if (i_1768_ != 0) {
									int i_1839_ = Class257.anIntArray2683[i_1768_];
									int i_1840_ = Class257.anIntArray2684[i_1768_];
									int i_1841_ = ((((Class387_Sub1) this).anIntArray8020[i_1838_]) * i_1839_ + ((((Class387_Sub1) this).anIntArray8065[i_1838_]) * i_1840_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8020[i_1838_] = ((((Class387_Sub1) this).anIntArray8020[i_1838_]) * i_1840_ - ((((Class387_Sub1) this).anIntArray8065[i_1838_]) * i_1839_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8065[i_1838_] = i_1841_;
								}
								if (i_1766_ != 0) {
									int i_1842_ = Class257.anIntArray2683[i_1766_];
									int i_1843_ = Class257.anIntArray2684[i_1766_];
									int i_1844_ = ((((Class387_Sub1) this).anIntArray8020[i_1838_]) * i_1843_ - ((((Class387_Sub1) this).anIntArray8051[i_1838_]) * i_1842_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8051[i_1838_] = ((((Class387_Sub1) this).anIntArray8020[i_1838_]) * i_1842_ + ((((Class387_Sub1) this).anIntArray8051[i_1838_]) * i_1843_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8020[i_1838_] = i_1844_;
								}
								if (i_1767_ != 0) {
									int i_1845_ = Class257.anIntArray2683[i_1767_];
									int i_1846_ = Class257.anIntArray2684[i_1767_];
									int i_1847_ = ((((Class387_Sub1) this).anIntArray8051[i_1838_]) * i_1845_ + ((((Class387_Sub1) this).anIntArray8065[i_1838_]) * i_1846_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8051[i_1838_] = ((((Class387_Sub1) this).anIntArray8051[i_1838_]) * i_1846_ - ((((Class387_Sub1) this).anIntArray8065[i_1838_]) * i_1845_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray8065[i_1838_] = i_1847_;
								}
								((Class387_Sub1) this).anIntArray8065[i_1838_] += ((Class387_Sub1) this).anInt8080;
								((Class387_Sub1) this).anIntArray8020[i_1838_] += ((Class387_Sub1) this).anInt8061;
								((Class387_Sub1) this).anIntArray8051[i_1838_] += ((Class387_Sub1) this).anInt8055;
							}
						}
					}
				}
				if (bool) {
					for (int i_1848_ = 0; i_1848_ < i_1771_; i_1848_++) {
						int i_1849_ = is[i_1848_];
						if (i_1849_ < (((Class387_Sub1) this).anIntArrayArray8022).length) {
							int[] is_1850_ = (((Class387_Sub1) this).anIntArrayArray8022[i_1849_]);
							for (int i_1851_ = 0; i_1851_ < is_1850_.length; i_1851_++) {
								int i_1852_ = is_1850_[i_1851_];
								if ((((Class387_Sub1) this).aShortArray8023 == null) || ((i_1769_ & (((Class387_Sub1) this).aShortArray8023[i_1852_])) != 0)) {
									int i_1853_ = (((Class387_Sub1) this).anIntArray8082[i_1852_]);
									int i_1854_ = (((Class387_Sub1) this).anIntArray8082[i_1852_ + 1]);
									for (int i_1855_ = i_1853_; i_1855_ < i_1854_; i_1855_++) {
										int i_1856_ = ((((Class387_Sub1) this).aShortArray8052[i_1855_]) - 1);
										if (i_1856_ == -1)
											break;
										if (i_1768_ != 0) {
											int i_1857_ = (Class257.anIntArray2683[i_1768_]);
											int i_1858_ = (Class257.anIntArray2684[i_1768_]);
											int i_1859_ = (((((Class387_Sub1) this).aShortArray8028[i_1856_]) * i_1857_ + (((Class387_Sub1) this).aShortArray8032[i_1856_]) * i_1858_ + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8028[i_1856_] = (short) ((((((Class387_Sub1) this).aShortArray8028[i_1856_]) * i_1858_) - ((((Class387_Sub1) this).aShortArray8032[i_1856_]) * i_1857_) + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8032[i_1856_] = (short) i_1859_;
										}
										if (i_1766_ != 0) {
											int i_1860_ = (Class257.anIntArray2683[i_1766_]);
											int i_1861_ = (Class257.anIntArray2684[i_1766_]);
											int i_1862_ = (((((Class387_Sub1) this).aShortArray8028[i_1856_]) * i_1861_ - (((Class387_Sub1) this).aShortArray8024[i_1856_]) * i_1860_ + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8024[i_1856_] = (short) ((((((Class387_Sub1) this).aShortArray8028[i_1856_]) * i_1860_) + ((((Class387_Sub1) this).aShortArray8024[i_1856_]) * i_1861_) + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8028[i_1856_] = (short) i_1862_;
										}
										if (i_1767_ != 0) {
											int i_1863_ = (Class257.anIntArray2683[i_1767_]);
											int i_1864_ = (Class257.anIntArray2684[i_1767_]);
											int i_1865_ = (((((Class387_Sub1) this).aShortArray8024[i_1856_]) * i_1863_ + (((Class387_Sub1) this).aShortArray8032[i_1856_]) * i_1864_ + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8024[i_1856_] = (short) ((((((Class387_Sub1) this).aShortArray8024[i_1856_]) * i_1864_) - ((((Class387_Sub1) this).aShortArray8032[i_1856_]) * i_1863_) + 16383) >> 14);
											((Class387_Sub1) this).aShortArray8032[i_1856_] = (short) i_1865_;
										}
									}
								}
							}
						}
					}
					method4499();
				}
			}
		} else if (i == 3) {
			if (is_1770_ != null) {
				int i_1866_ = is_1770_[9] << 4;
				int i_1867_ = is_1770_[10] << 4;
				int i_1868_ = is_1770_[11] << 4;
				int i_1869_ = is_1770_[12] << 4;
				int i_1870_ = is_1770_[13] << 4;
				int i_1871_ = is_1770_[14] << 4;
				if (((Class387_Sub1) this).aBoolean8048) {
					int i_1872_ = ((is_1770_[0] * ((Class387_Sub1) this).anInt8080 + is_1770_[3] * ((Class387_Sub1) this).anInt8061 + is_1770_[6] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					int i_1873_ = ((is_1770_[1] * ((Class387_Sub1) this).anInt8080 + is_1770_[4] * ((Class387_Sub1) this).anInt8061 + is_1770_[7] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					int i_1874_ = ((is_1770_[2] * ((Class387_Sub1) this).anInt8080 + is_1770_[5] * ((Class387_Sub1) this).anInt8061 + is_1770_[8] * ((Class387_Sub1) this).anInt8055 + 8192) >> 14);
					i_1872_ += i_1869_;
					i_1873_ += i_1870_;
					i_1874_ += i_1871_;
					((Class387_Sub1) this).anInt8080 = i_1872_;
					((Class387_Sub1) this).anInt8061 = i_1873_;
					((Class387_Sub1) this).anInt8055 = i_1874_;
					((Class387_Sub1) this).aBoolean8048 = false;
				}
				int i_1875_ = i_1766_ << 15 >> 7;
				int i_1876_ = i_1767_ << 15 >> 7;
				int i_1877_ = i_1768_ << 15 >> 7;
				int i_1878_ = i_1875_ * -((Class387_Sub1) this).anInt8080 + 8192 >> 14;
				int i_1879_ = i_1876_ * -((Class387_Sub1) this).anInt8061 + 8192 >> 14;
				int i_1880_ = i_1877_ * -((Class387_Sub1) this).anInt8055 + 8192 >> 14;
				int i_1881_ = i_1878_ + ((Class387_Sub1) this).anInt8080;
				int i_1882_ = i_1879_ + ((Class387_Sub1) this).anInt8061;
				int i_1883_ = i_1880_ + ((Class387_Sub1) this).anInt8055;
				int[] is_1884_ = new int[9];
				is_1884_[0] = i_1875_ * is_1770_[0] + 8192 >> 14;
				is_1884_[1] = i_1875_ * is_1770_[3] + 8192 >> 14;
				is_1884_[2] = i_1875_ * is_1770_[6] + 8192 >> 14;
				is_1884_[3] = i_1876_ * is_1770_[1] + 8192 >> 14;
				is_1884_[4] = i_1876_ * is_1770_[4] + 8192 >> 14;
				is_1884_[5] = i_1876_ * is_1770_[7] + 8192 >> 14;
				is_1884_[6] = i_1877_ * is_1770_[2] + 8192 >> 14;
				is_1884_[7] = i_1877_ * is_1770_[5] + 8192 >> 14;
				is_1884_[8] = i_1877_ * is_1770_[8] + 8192 >> 14;
				int i_1885_ = i_1875_ * i_1869_ + 8192 >> 14;
				int i_1886_ = i_1876_ * i_1870_ + 8192 >> 14;
				int i_1887_ = i_1877_ * i_1871_ + 8192 >> 14;
				i_1885_ += i_1881_;
				i_1886_ += i_1882_;
				i_1887_ += i_1883_;
				int[] is_1888_ = new int[9];
				for (int i_1889_ = 0; i_1889_ < 3; i_1889_++) {
					for (int i_1890_ = 0; i_1890_ < 3; i_1890_++) {
						int i_1891_ = 0;
						for (int i_1892_ = 0; i_1892_ < 3; i_1892_++)
							i_1891_ += (is_1770_[i_1889_ * 3 + i_1892_] * is_1884_[i_1890_ + i_1892_ * 3]);
						is_1888_[i_1889_ * 3 + i_1890_] = i_1891_ + 8192 >> 14;
					}
				}
				int i_1893_ = ((is_1770_[0] * i_1885_ + is_1770_[1] * i_1886_ + is_1770_[2] * i_1887_ + 8192) >> 14);
				int i_1894_ = ((is_1770_[3] * i_1885_ + is_1770_[4] * i_1886_ + is_1770_[5] * i_1887_ + 8192) >> 14);
				int i_1895_ = ((is_1770_[6] * i_1885_ + is_1770_[7] * i_1886_ + is_1770_[8] * i_1887_ + 8192) >> 14);
				i_1893_ += i_1866_;
				i_1894_ += i_1867_;
				i_1895_ += i_1868_;
				for (int i_1896_ = 0; i_1896_ < i_1771_; i_1896_++) {
					int i_1897_ = is[i_1896_];
					if (i_1897_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_1898_ = (((Class387_Sub1) this).anIntArrayArray8022[i_1897_]);
						for (int i_1899_ = 0; i_1899_ < is_1898_.length; i_1899_++) {
							int i_1900_ = is_1898_[i_1899_];
							if (((Class387_Sub1) this).aShortArray8023 == null || ((i_1769_ & (((Class387_Sub1) this).aShortArray8023[i_1900_])) != 0)) {
								int i_1901_ = (is_1888_[0] * (((Class387_Sub1) this).anIntArray8065[i_1900_]) + is_1888_[1] * (((Class387_Sub1) this).anIntArray8020[i_1900_]) + is_1888_[2] * (((Class387_Sub1) this).anIntArray8051[i_1900_]) + 8192) >> 14;
								int i_1902_ = (is_1888_[3] * (((Class387_Sub1) this).anIntArray8065[i_1900_]) + is_1888_[4] * (((Class387_Sub1) this).anIntArray8020[i_1900_]) + is_1888_[5] * (((Class387_Sub1) this).anIntArray8051[i_1900_]) + 8192) >> 14;
								int i_1903_ = (is_1888_[6] * (((Class387_Sub1) this).anIntArray8065[i_1900_]) + is_1888_[7] * (((Class387_Sub1) this).anIntArray8020[i_1900_]) + is_1888_[8] * (((Class387_Sub1) this).anIntArray8051[i_1900_]) + 8192) >> 14;
								i_1901_ += i_1893_;
								i_1902_ += i_1894_;
								i_1903_ += i_1895_;
								((Class387_Sub1) this).anIntArray8065[i_1900_] = i_1901_;
								((Class387_Sub1) this).anIntArray8020[i_1900_] = i_1902_;
								((Class387_Sub1) this).anIntArray8051[i_1900_] = i_1903_;
							}
						}
					}
				}
			} else {
				for (int i_1904_ = 0; i_1904_ < i_1771_; i_1904_++) {
					int i_1905_ = is[i_1904_];
					if (i_1905_ < ((Class387_Sub1) this).anIntArrayArray8022.length) {
						int[] is_1906_ = (((Class387_Sub1) this).anIntArrayArray8022[i_1905_]);
						for (int i_1907_ = 0; i_1907_ < is_1906_.length; i_1907_++) {
							int i_1908_ = is_1906_[i_1907_];
							if (((Class387_Sub1) this).aShortArray8023 == null || ((i_1769_ & (((Class387_Sub1) this).aShortArray8023[i_1908_])) != 0)) {
								((Class387_Sub1) this).anIntArray8065[i_1908_] -= ((Class387_Sub1) this).anInt8080;
								((Class387_Sub1) this).anIntArray8020[i_1908_] -= ((Class387_Sub1) this).anInt8061;
								((Class387_Sub1) this).anIntArray8051[i_1908_] -= ((Class387_Sub1) this).anInt8055;
								((Class387_Sub1) this).anIntArray8065[i_1908_] = (((Class387_Sub1) this).anIntArray8065[i_1908_]) * i_1766_ >> 7;
								((Class387_Sub1) this).anIntArray8020[i_1908_] = (((Class387_Sub1) this).anIntArray8020[i_1908_]) * i_1767_ >> 7;
								((Class387_Sub1) this).anIntArray8051[i_1908_] = (((Class387_Sub1) this).anIntArray8051[i_1908_]) * i_1768_ >> 7;
								((Class387_Sub1) this).anIntArray8065[i_1908_] += ((Class387_Sub1) this).anInt8080;
								((Class387_Sub1) this).anIntArray8020[i_1908_] += ((Class387_Sub1) this).anInt8061;
								((Class387_Sub1) this).anIntArray8051[i_1908_] += ((Class387_Sub1) this).anInt8055;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub1) this).anIntArrayArray8017 != null) {
				boolean bool_1909_ = false;
				for (int i_1910_ = 0; i_1910_ < i_1771_; i_1910_++) {
					int i_1911_ = is[i_1910_];
					if (i_1911_ < ((Class387_Sub1) this).anIntArrayArray8017.length) {
						int[] is_1912_ = (((Class387_Sub1) this).anIntArrayArray8017[i_1911_]);
						for (int i_1913_ = 0; i_1913_ < is_1912_.length; i_1913_++) {
							int i_1914_ = is_1912_[i_1913_];
							if (((Class387_Sub1) this).aShortArray8018 == null || ((i_1769_ & (((Class387_Sub1) this).aShortArray8018[i_1914_])) != 0)) {
								int i_1915_ = (((((Class387_Sub1) this).aByteArray8037[i_1914_]) & 0xff) + i_1766_ * 8);
								if (i_1915_ < 0)
									i_1915_ = 0;
								else if (i_1915_ > 255)
									i_1915_ = 255;
								((Class387_Sub1) this).aByteArray8037[i_1914_] = (byte) i_1915_;
							}
						}
						bool_1909_ = bool_1909_ | is_1912_.length > 0;
					}
				}
				if (bool_1909_) {
					if (((Class387_Sub1) this).aClass185Array8070 != null) {
						for (int i_1916_ = 0; i_1916_ < ((Class387_Sub1) this).anInt8069; i_1916_++) {
							Class185 class185 = (((Class387_Sub1) this).aClass185Array8070[i_1916_]);
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[i_1916_]);
							((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & 0xffffff | 255 - ((((Class387_Sub1) this).aByteArray8037[((Class185) class185).modelColorIndex]) & 0xff) << 24);
						}
					}
					method4507();
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub1) this).anIntArrayArray8017 != null) {
				boolean bool_1917_ = false;
				for (int i_1918_ = 0; i_1918_ < i_1771_; i_1918_++) {
					int i_1919_ = is[i_1918_];
					if (i_1919_ < ((Class387_Sub1) this).anIntArrayArray8017.length) {
						int[] is_1920_ = (((Class387_Sub1) this).anIntArrayArray8017[i_1919_]);
						for (int i_1921_ = 0; i_1921_ < is_1920_.length; i_1921_++) {
							int i_1922_ = is_1920_[i_1921_];
							if (((Class387_Sub1) this).aShortArray8018 == null || ((i_1769_ & (((Class387_Sub1) this).aShortArray8018[i_1922_])) != 0)) {
								int i_1923_ = ((((Class387_Sub1) this).modelColors[i_1922_]) & 0xffff);
								int i_1924_ = i_1923_ >> 10 & 0x3f;
								int i_1925_ = i_1923_ >> 7 & 0x7;
								int i_1926_ = i_1923_ & 0x7f;
								i_1924_ = i_1924_ + i_1766_ & 0x3f;
								i_1925_ += i_1767_ / 4;
								if (i_1925_ < 0)
									i_1925_ = 0;
								else if (i_1925_ > 7)
									i_1925_ = 7;
								i_1926_ += i_1768_;
								if (i_1926_ < 0)
									i_1926_ = 0;
								else if (i_1926_ > 127)
									i_1926_ = 127;
								((Class387_Sub1) this).modelColors[i_1922_] = (short) (i_1924_ << 10 | i_1925_ << 7 | i_1926_);
							}
						}
						bool_1917_ = bool_1917_ | is_1920_.length > 0;
					}
				}
				if (bool_1917_) {
					if (((Class387_Sub1) this).aClass185Array8070 != null) {
						for (int i_1927_ = 0; i_1927_ < ((Class387_Sub1) this).anInt8069; i_1927_++) {
							Class185 class185 = (((Class387_Sub1) this).aClass185Array8070[i_1927_]);
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[i_1927_]);
							((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | (Console.colorArray[((((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff)]) & 0xffffff);
						}
					}
					method4507();
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_1928_ = 0; i_1928_ < i_1771_; i_1928_++) {
					int i_1929_ = is[i_1928_];
					if (i_1929_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_1930_ = (((Class387_Sub1) this).anIntArrayArray8072[i_1929_]);
						for (int i_1931_ = 0; i_1931_ < is_1930_.length; i_1931_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_1930_[i_1931_]]);
							((Class177) class177).anInt1751 += i_1766_;
							((Class177) class177).anInt1748 += i_1767_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_1932_ = 0; i_1932_ < i_1771_; i_1932_++) {
					int i_1933_ = is[i_1932_];
					if (i_1933_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_1934_ = (((Class387_Sub1) this).anIntArrayArray8072[i_1933_]);
						for (int i_1935_ = 0; i_1935_ < is_1934_.length; i_1935_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_1934_[i_1935_]]);
							((Class177) class177).anInt1752 = (((Class177) class177).anInt1752 * i_1766_ >> 7);
							((Class177) class177).anInt1749 = (((Class177) class177).anInt1749 * i_1767_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub1) this).anIntArrayArray8072 != null) {
				for (int i_1936_ = 0; i_1936_ < i_1771_; i_1936_++) {
					int i_1937_ = is[i_1936_];
					if (i_1937_ < ((Class387_Sub1) this).anIntArrayArray8072.length) {
						int[] is_1938_ = (((Class387_Sub1) this).anIntArrayArray8072[i_1937_]);
						for (int i_1939_ = 0; i_1939_ < is_1938_.length; i_1939_++) {
							Class177 class177 = (((Class387_Sub1) this).aClass177Array8071[is_1938_[i_1939_]]);
							((Class177) class177).anInt1753 = (((Class177) class177).anInt1753 + i_1766_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public boolean el() {
		return ((Class387_Sub1) this).aBoolean8067;
	}

	public byte[] as() {
		return ((Class387_Sub1) this).aByteArray8037;
	}

	public void method4480(Class387 class387, int i, int i_1940_, int i_1941_, boolean bool) {
		Class387_Sub1 class387_sub1_1942_ = (Class387_Sub1) class387;
		if (((Class387_Sub1) this).anInt8034 != 0 && ((Class387_Sub1) class387_sub1_1942_).anInt8034 != 0) {
			int i_1943_ = ((Class387_Sub1) class387_sub1_1942_).anInt8044;
			int[] is = ((Class387_Sub1) class387_sub1_1942_).anIntArray8065;
			int[] is_1944_ = ((Class387_Sub1) class387_sub1_1942_).anIntArray8020;
			int[] is_1945_ = ((Class387_Sub1) class387_sub1_1942_).anIntArray8051;
			short[] is_1946_ = ((Class387_Sub1) class387_sub1_1942_).aShortArray8032;
			short[] is_1947_ = ((Class387_Sub1) class387_sub1_1942_).aShortArray8028;
			short[] is_1948_ = ((Class387_Sub1) class387_sub1_1942_).aShortArray8024;
			byte[] is_1949_ = ((Class387_Sub1) class387_sub1_1942_).aByteArray8030;
			short[] is_1950_;
			short[] is_1951_;
			short[] is_1952_;
			byte[] is_1953_;
			if (((Class387_Sub1) this).aClass206_8033 != null) {
				is_1950_ = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1938);
				is_1951_ = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1937);
				is_1952_ = (((Class206) ((Class387_Sub1) this).aClass206_8033).aShortArray1939);
				is_1953_ = (((Class206) ((Class387_Sub1) this).aClass206_8033).aByteArray1940);
			} else {
				is_1950_ = null;
				is_1951_ = null;
				is_1952_ = null;
				is_1953_ = null;
			}
			short[] is_1954_;
			short[] is_1955_;
			short[] is_1956_;
			byte[] is_1957_;
			if (((Class387_Sub1) class387_sub1_1942_).aClass206_8033 != null) {
				is_1954_ = ((Class206) (((Class387_Sub1) class387_sub1_1942_).aClass206_8033)).aShortArray1938;
				is_1955_ = ((Class206) (((Class387_Sub1) class387_sub1_1942_).aClass206_8033)).aShortArray1937;
				is_1956_ = ((Class206) (((Class387_Sub1) class387_sub1_1942_).aClass206_8033)).aShortArray1939;
				is_1957_ = ((Class206) (((Class387_Sub1) class387_sub1_1942_).aClass206_8033)).aByteArray1940;
			} else {
				is_1954_ = null;
				is_1955_ = null;
				is_1956_ = null;
				is_1957_ = null;
			}
			int[] is_1958_ = ((Class387_Sub1) class387_sub1_1942_).anIntArray8082;
			short[] is_1959_ = ((Class387_Sub1) class387_sub1_1942_).aShortArray8052;
			if (!((Class387_Sub1) class387_sub1_1942_).aBoolean8043)
				class387_sub1_1942_.method4501();
			int i_1960_ = ((Class387_Sub1) class387_sub1_1942_).anInt8056;
			int i_1961_ = ((Class387_Sub1) class387_sub1_1942_).anInt8057;
			int i_1962_ = ((Class387_Sub1) class387_sub1_1942_).anInt8058;
			int i_1963_ = ((Class387_Sub1) class387_sub1_1942_).anInt8059;
			int i_1964_ = ((Class387_Sub1) class387_sub1_1942_).anInt8060;
			int i_1965_ = ((Class387_Sub1) class387_sub1_1942_).anInt8078;
			for (int i_1966_ = 0; i_1966_ < ((Class387_Sub1) this).anInt8044; i_1966_++) {
				int i_1967_ = ((Class387_Sub1) this).anIntArray8020[i_1966_] - i_1940_;
				if (i_1967_ >= i_1960_ && i_1967_ <= i_1961_) {
					int i_1968_ = ((Class387_Sub1) this).anIntArray8065[i_1966_] - i;
					if (i_1968_ >= i_1962_ && i_1968_ <= i_1963_) {
						int i_1969_ = (((Class387_Sub1) this).anIntArray8051[i_1966_] - i_1941_);
						if (i_1969_ >= i_1964_ && i_1969_ <= i_1965_) {
							int i_1970_ = -1;
							int i_1971_ = (((Class387_Sub1) this).anIntArray8082[i_1966_]);
							int i_1972_ = (((Class387_Sub1) this).anIntArray8082[i_1966_ + 1]);
							for (int i_1973_ = i_1971_; i_1973_ < i_1972_; i_1973_++) {
								i_1970_ = (((Class387_Sub1) this).aShortArray8052[i_1973_]) - 1;
								if (i_1970_ == -1 || (((Class387_Sub1) this).aByteArray8030[i_1970_]) != 0)
									break;
							}
							if (i_1970_ != -1) {
								for (int i_1974_ = 0; i_1974_ < i_1943_; i_1974_++) {
									if (i_1968_ == is[i_1974_] && i_1969_ == is_1945_[i_1974_] && i_1967_ == is_1944_[i_1974_]) {
										int i_1975_ = -1;
										i_1971_ = is_1958_[i_1974_];
										i_1972_ = is_1958_[i_1974_ + 1];
										for (int i_1976_ = i_1971_; i_1976_ < i_1972_; i_1976_++) {
											i_1975_ = is_1959_[i_1976_] - 1;
											if (i_1975_ == -1 || is_1949_[i_1975_] != 0)
												break;
										}
										if (i_1975_ != -1) {
											if (is_1950_ == null) {
												((Class387_Sub1) this).aClass206_8033 = new Class206();
												is_1950_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aShortArray1938 = (Class263_Sub4.method2637((((Class387_Sub1) this).aShortArray8032), 2139551579));
												is_1951_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aShortArray1937 = (Class263_Sub4.method2637((((Class387_Sub1) this).aShortArray8028), 1998022131));
												is_1952_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aShortArray1939 = (Class263_Sub4.method2637((((Class387_Sub1) this).aShortArray8024), 1723588614));
												is_1953_ = ((Class206) (((Class387_Sub1) this).aClass206_8033)).aByteArray1940 = (IcmpService_Sub1.method6479((((Class387_Sub1) this).aByteArray8030), (byte) 2));
											}
											if (is_1954_ == null) {
												Class206 class206 = (((Class387_Sub1) class387_sub1_1942_).aClass206_8033 = new Class206());
												is_1954_ = ((Class206) class206).aShortArray1938 = (Class263_Sub4.method2637(is_1946_, 1566623775));
												is_1955_ = ((Class206) class206).aShortArray1937 = (Class263_Sub4.method2637(is_1947_, 1512013429));
												is_1956_ = ((Class206) class206).aShortArray1939 = (Class263_Sub4.method2637(is_1948_, 1903748505));
												is_1957_ = ((Class206) class206).aByteArray1940 = (IcmpService_Sub1.method6479(is_1949_, (byte) 2));
											}
											short i_1977_ = (((Class387_Sub1) this).aShortArray8032[i_1970_]);
											short i_1978_ = (((Class387_Sub1) this).aShortArray8028[i_1970_]);
											short i_1979_ = (((Class387_Sub1) this).aShortArray8024[i_1970_]);
											byte i_1980_ = (((Class387_Sub1) this).aByteArray8030[i_1970_]);
											i_1971_ = is_1958_[i_1974_];
											i_1972_ = is_1958_[i_1974_ + 1];
											for (int i_1981_ = i_1971_; i_1981_ < i_1972_; i_1981_++) {
												int i_1982_ = is_1959_[i_1981_] - 1;
												if (i_1982_ == -1)
													break;
												if (is_1957_[i_1982_] != 0) {
													is_1954_[i_1982_] += i_1977_;
													is_1955_[i_1982_] += i_1978_;
													is_1956_[i_1982_] += i_1979_;
													is_1957_[i_1982_] += i_1980_;
												}
											}
											i_1977_ = is_1946_[i_1975_];
											i_1978_ = is_1947_[i_1975_];
											i_1979_ = is_1948_[i_1975_];
											i_1980_ = is_1949_[i_1975_];
											i_1971_ = (((Class387_Sub1) this).anIntArray8082[i_1966_]);
											i_1972_ = (((Class387_Sub1) this).anIntArray8082[i_1966_ + 1]);
											for (int i_1983_ = i_1971_; i_1983_ < i_1972_; i_1983_++) {
												int i_1984_ = ((((Class387_Sub1) this).aShortArray8052[i_1983_]) - 1);
												if (i_1984_ == -1)
													break;
												if (is_1953_[i_1984_] != 0) {
													is_1950_[i_1984_] += i_1977_;
													is_1951_[i_1984_] += i_1978_;
													is_1952_[i_1984_] += i_1979_;
													is_1953_[i_1984_] += i_1980_;
												}
											}
											class387_sub1_1942_.method4499();
											method4499();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public int ar() {
		return ((Class387_Sub1) this).anInt8013;
	}

	public void oa(int i, int i_1985_, int i_1986_) {
		for (int i_1987_ = 0; i_1987_ < ((Class387_Sub1) this).anInt8044; i_1987_++) {
			if (i != 128)
				((Class387_Sub1) this).anIntArray8065[i_1987_] = ((Class387_Sub1) this).anIntArray8065[i_1987_] * i >> 7;
			if (i_1985_ != 128)
				((Class387_Sub1) this).anIntArray8020[i_1987_] = (((Class387_Sub1) this).anIntArray8020[i_1987_] * i_1985_ >> 7);
			if (i_1986_ != 128)
				((Class387_Sub1) this).anIntArray8051[i_1987_] = (((Class387_Sub1) this).anIntArray8051[i_1987_] * i_1986_ >> 7);
		}
		method4498();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public byte[] dr() {
		return ((Class387_Sub1) this).aByteArray8037;
	}

	public void dl(short i, short i_1988_) {
		Interface_ma interface_ma = ((Class387_Sub1) this).aClass_ra_Sub2_8012.anInterface_ma4227;
		for (int i_1989_ = 0; i_1989_ < ((Class387_Sub1) this).anInt8034; i_1989_++) {
			if (((Class387_Sub1) this).modelTextures[i_1989_] == i)
				((Class387_Sub1) this).modelTextures[i_1989_] = i_1988_;
		}
		byte i_1990_ = 0;
		byte i_1991_ = 0;
		if (i != -1) {
			Class56 class56 = interface_ma.method221(i & 0xffff, 528599723);
			i_1990_ = class56.aByte529;
			i_1991_ = class56.aByte534;
		}
		byte i_1992_ = 0;
		byte i_1993_ = 0;
		if (i_1988_ != -1) {
			Class56 class56 = interface_ma.method221(i_1988_ & 0xffff, -802687006);
			i_1992_ = class56.aByte529;
			i_1993_ = class56.aByte534;
			if (class56.aByte531 != 0 || class56.aByte530 != 0)
				((Class387_Sub1) this).aBoolean8042 = true;
		}
		if (i_1990_ != i_1992_ | i_1991_ != i_1993_) {
			if (((Class387_Sub1) this).aClass185Array8070 != null) {
				for (int i_1994_ = 0; i_1994_ < ((Class387_Sub1) this).anInt8069; i_1994_++) {
					Class185 class185 = ((Class387_Sub1) this).aClass185Array8070[i_1994_];
					Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_1994_];
					((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | ((Console.colorArray[(((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff]) & 0xffffff));
				}
			}
			method4507();
		}
	}

	void bx() {
		for (int i = 0; i < ((Class387_Sub1) this).anInt8014; i++) {
			((Class387_Sub1) this).anIntArray8065[i] = ((Class387_Sub1) this).anIntArray8065[i] + 7 >> 4;
			((Class387_Sub1) this).anIntArray8020[i] = ((Class387_Sub1) this).anIntArray8020[i] + 7 >> 4;
			((Class387_Sub1) this).anIntArray8051[i] = ((Class387_Sub1) this).anIntArray8051[i] + 7 >> 4;
		}
		method4498();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	public int Z() {
		return ((Class387_Sub1) this).aShort8083;
	}

	public void method4486(byte i, byte[] is) {
		if (is == null) {
			for (int i_1995_ = 0; i_1995_ < ((Class387_Sub1) this).anInt8034; i_1995_++)
				((Class387_Sub1) this).aByteArray8037[i_1995_] = i;
		} else {
			for (int i_1996_ = 0; i_1996_ < ((Class387_Sub1) this).anInt8034; i_1996_++) {
				int i_1997_ = 255 - ((255 - (is[i_1996_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class387_Sub1) this).aByteArray8037[i_1996_] = (byte) i_1997_;
			}
		}
		method4507();
	}

	public void bz(int i, int i_1998_, int i_1999_) {
		for (int i_2000_ = 0; i_2000_ < ((Class387_Sub1) this).anInt8044; i_2000_++) {
			if (i != 0)
				((Class387_Sub1) this).anIntArray8065[i_2000_] += i;
			if (i_1998_ != 0)
				((Class387_Sub1) this).anIntArray8020[i_2000_] += i_1998_;
			if (i_1999_ != 0)
				((Class387_Sub1) this).anIntArray8051[i_2000_] += i_1999_;
		}
		method4498();
		((Class387_Sub1) this).aBoolean8043 = false;
	}

	void bu(int i, int i_2001_, int i_2002_, int i_2003_) {
		if (i == 0) {
			int i_2004_ = 0;
			((Class387_Sub1) this).anInt8080 = 0;
			((Class387_Sub1) this).anInt8061 = 0;
			((Class387_Sub1) this).anInt8055 = 0;
			for (int i_2005_ = 0; i_2005_ < ((Class387_Sub1) this).anInt8044; i_2005_++) {
				((Class387_Sub1) this).anInt8080 += ((Class387_Sub1) this).anIntArray8065[i_2005_];
				((Class387_Sub1) this).anInt8061 += ((Class387_Sub1) this).anIntArray8020[i_2005_];
				((Class387_Sub1) this).anInt8055 += ((Class387_Sub1) this).anIntArray8051[i_2005_];
				i_2004_++;
			}
			if (i_2004_ > 0) {
				((Class387_Sub1) this).anInt8080 = ((Class387_Sub1) this).anInt8080 / i_2004_ + i_2001_;
				((Class387_Sub1) this).anInt8061 = ((Class387_Sub1) this).anInt8061 / i_2004_ + i_2002_;
				((Class387_Sub1) this).anInt8055 = ((Class387_Sub1) this).anInt8055 / i_2004_ + i_2003_;
			} else {
				((Class387_Sub1) this).anInt8080 = i_2001_;
				((Class387_Sub1) this).anInt8061 = i_2002_;
				((Class387_Sub1) this).anInt8055 = i_2003_;
			}
		} else if (i == 1) {
			for (int i_2006_ = 0; i_2006_ < ((Class387_Sub1) this).anInt8044; i_2006_++) {
				((Class387_Sub1) this).anIntArray8065[i_2006_] += i_2001_;
				((Class387_Sub1) this).anIntArray8020[i_2006_] += i_2002_;
				((Class387_Sub1) this).anIntArray8051[i_2006_] += i_2003_;
			}
		} else if (i == 2) {
			for (int i_2007_ = 0; i_2007_ < ((Class387_Sub1) this).anInt8044; i_2007_++) {
				((Class387_Sub1) this).anIntArray8065[i_2007_] -= ((Class387_Sub1) this).anInt8080;
				((Class387_Sub1) this).anIntArray8020[i_2007_] -= ((Class387_Sub1) this).anInt8061;
				((Class387_Sub1) this).anIntArray8051[i_2007_] -= ((Class387_Sub1) this).anInt8055;
				if (i_2003_ != 0) {
					int i_2008_ = Class257.anIntArray2683[i_2003_];
					int i_2009_ = Class257.anIntArray2684[i_2003_];
					int i_2010_ = (((((Class387_Sub1) this).anIntArray8020[i_2007_] * i_2008_) + (((Class387_Sub1) this).anIntArray8065[i_2007_] * i_2009_) + 16383) >> 14);
					((Class387_Sub1) this).anIntArray8020[i_2007_] = ((((Class387_Sub1) this).anIntArray8020[i_2007_] * i_2009_) - (((Class387_Sub1) this).anIntArray8065[i_2007_] * i_2008_) + 16383) >> 14;
					((Class387_Sub1) this).anIntArray8065[i_2007_] = i_2010_;
				}
				if (i_2001_ != 0) {
					int i_2011_ = Class257.anIntArray2683[i_2001_];
					int i_2012_ = Class257.anIntArray2684[i_2001_];
					int i_2013_ = (((((Class387_Sub1) this).anIntArray8020[i_2007_] * i_2012_) - (((Class387_Sub1) this).anIntArray8051[i_2007_] * i_2011_) + 16383) >> 14);
					((Class387_Sub1) this).anIntArray8051[i_2007_] = ((((Class387_Sub1) this).anIntArray8020[i_2007_] * i_2011_) + (((Class387_Sub1) this).anIntArray8051[i_2007_] * i_2012_) + 16383) >> 14;
					((Class387_Sub1) this).anIntArray8020[i_2007_] = i_2013_;
				}
				if (i_2002_ != 0) {
					int i_2014_ = Class257.anIntArray2683[i_2002_];
					int i_2015_ = Class257.anIntArray2684[i_2002_];
					int i_2016_ = (((((Class387_Sub1) this).anIntArray8051[i_2007_] * i_2014_) + (((Class387_Sub1) this).anIntArray8065[i_2007_] * i_2015_) + 16383) >> 14);
					((Class387_Sub1) this).anIntArray8051[i_2007_] = ((((Class387_Sub1) this).anIntArray8051[i_2007_] * i_2015_) - (((Class387_Sub1) this).anIntArray8065[i_2007_] * i_2014_) + 16383) >> 14;
					((Class387_Sub1) this).anIntArray8065[i_2007_] = i_2016_;
				}
				((Class387_Sub1) this).anIntArray8065[i_2007_] += ((Class387_Sub1) this).anInt8080;
				((Class387_Sub1) this).anIntArray8020[i_2007_] += ((Class387_Sub1) this).anInt8061;
				((Class387_Sub1) this).anIntArray8051[i_2007_] += ((Class387_Sub1) this).anInt8055;
			}
		} else if (i == 3) {
			for (int i_2017_ = 0; i_2017_ < ((Class387_Sub1) this).anInt8044; i_2017_++) {
				((Class387_Sub1) this).anIntArray8065[i_2017_] -= ((Class387_Sub1) this).anInt8080;
				((Class387_Sub1) this).anIntArray8020[i_2017_] -= ((Class387_Sub1) this).anInt8061;
				((Class387_Sub1) this).anIntArray8051[i_2017_] -= ((Class387_Sub1) this).anInt8055;
				((Class387_Sub1) this).anIntArray8065[i_2017_] = (((Class387_Sub1) this).anIntArray8065[i_2017_] * i_2001_ / 128);
				((Class387_Sub1) this).anIntArray8020[i_2017_] = (((Class387_Sub1) this).anIntArray8020[i_2017_] * i_2002_ / 128);
				((Class387_Sub1) this).anIntArray8051[i_2017_] = (((Class387_Sub1) this).anIntArray8051[i_2017_] * i_2003_ / 128);
				((Class387_Sub1) this).anIntArray8065[i_2017_] += ((Class387_Sub1) this).anInt8080;
				((Class387_Sub1) this).anIntArray8020[i_2017_] += ((Class387_Sub1) this).anInt8061;
				((Class387_Sub1) this).anIntArray8051[i_2017_] += ((Class387_Sub1) this).anInt8055;
			}
		} else if (i == 5) {
			for (int i_2018_ = 0; i_2018_ < ((Class387_Sub1) this).anInt8034; i_2018_++) {
				int i_2019_ = ((((Class387_Sub1) this).aByteArray8037[i_2018_] & 0xff) + i_2001_ * 8);
				if (i_2019_ < 0)
					i_2019_ = 0;
				else if (i_2019_ > 255)
					i_2019_ = 255;
				((Class387_Sub1) this).aByteArray8037[i_2018_] = (byte) i_2019_;
			}
			if (((Class387_Sub1) this).aClass185Array8070 != null) {
				for (int i_2020_ = 0; i_2020_ < ((Class387_Sub1) this).anInt8069; i_2020_++) {
					Class185 class185 = ((Class387_Sub1) this).aClass185Array8070[i_2020_];
					Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_2020_];
					((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & 0xffffff | 255 - ((((Class387_Sub1) this).aByteArray8037[((Class185) class185).modelColorIndex]) & 0xff) << 24);
				}
			}
			method4507();
		} else if (i == 7) {
			for (int i_2021_ = 0; i_2021_ < ((Class387_Sub1) this).anInt8034; i_2021_++) {
				int i_2022_ = ((Class387_Sub1) this).modelColors[i_2021_] & 0xffff;
				int i_2023_ = i_2022_ >> 10 & 0x3f;
				int i_2024_ = i_2022_ >> 7 & 0x7;
				int i_2025_ = i_2022_ & 0x7f;
				i_2023_ = i_2023_ + i_2001_ & 0x3f;
				i_2024_ += i_2002_ / 4;
				if (i_2024_ < 0)
					i_2024_ = 0;
				else if (i_2024_ > 7)
					i_2024_ = 7;
				i_2025_ += i_2003_;
				if (i_2025_ < 0)
					i_2025_ = 0;
				else if (i_2025_ > 127)
					i_2025_ = 127;
				((Class387_Sub1) this).modelColors[i_2021_] = (short) (i_2023_ << 10 | i_2024_ << 7 | i_2025_);
			}
			if (((Class387_Sub1) this).aClass185Array8070 != null) {
				for (int i_2026_ = 0; i_2026_ < ((Class387_Sub1) this).anInt8069; i_2026_++) {
					Class185 class185 = ((Class387_Sub1) this).aClass185Array8070[i_2026_];
					Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_2026_];
					((Class177) class177).anInt1750 = (((Class177) class177).anInt1750 & ~0xffffff | ((Console.colorArray[(((Class387_Sub1) this).modelColors[((Class185) class185).modelColorIndex]) & 0xffff]) & 0xffffff));
				}
			}
			method4507();
		} else if (i == 8) {
			for (int i_2027_ = 0; i_2027_ < ((Class387_Sub1) this).anInt8069; i_2027_++) {
				Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_2027_];
				((Class177) class177).anInt1751 += i_2001_;
				((Class177) class177).anInt1748 += i_2002_;
			}
		} else if (i == 10) {
			for (int i_2028_ = 0; i_2028_ < ((Class387_Sub1) this).anInt8069; i_2028_++) {
				Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_2028_];
				((Class177) class177).anInt1752 = ((Class177) class177).anInt1752 * i_2001_ >> 7;
				((Class177) class177).anInt1749 = ((Class177) class177).anInt1749 * i_2002_ >> 7;
			}
		} else if (i == 9) {
			for (int i_2029_ = 0; i_2029_ < ((Class387_Sub1) this).anInt8069; i_2029_++) {
				Class177 class177 = ((Class387_Sub1) this).aClass177Array8071[i_2029_];
				((Class177) class177).anInt1753 = ((Class177) class177).anInt1753 + i_2001_ & 0x3fff;
			}
		}
	}

	public Class93[] method4464() {
		return ((Class387_Sub1) this).aClass93Array8026;
	}
}
