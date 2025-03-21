/* Class387_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaggl.OpenGL;

public class Class387_Sub2 extends Class387 {
	Interface3 anInterface3_8085;
	static int anInt8086 = 7;
	Class37 aClass37_8087;
	static int anInt8088 = 2;
	int anInt8089;
	static int anInt8090 = 8;
	static int anInt8091 = 16;
	Class_ra_Sub1 aClass_ra_Sub1_8092;
	int anInt8093;
	int anInt8094;
	short[] aShortArray8095;
	short aShort8096;
	short aShort8097;
	boolean aBoolean8098 = false;
	short aShort8099;
	short aShort8100;
	static int anInt8101;
	int[] anIntArray8102;
	static int[] anIntArray8103;
	int[] anIntArray8104;
	Class44 aClass44_8105;
	short[] aShortArray8106;
	int anInt8107;
	short[] aShortArray8108;
	short[] aShortArray8109;
	int[] anIntArray8110;
	static int anInt8111;
	Class68 aClass68_8112;
	int[][] anIntArrayArray8113;
	float[] aFloatArray8114;
	int anInt8115;
	int anInt8116;
	short[] modelColors;
	byte[] aByteArray8118;
	short[] aShortArray8119;
	short[] aShortArray8120;
	short[] aShortArray8121;
	short[] modelTextures;
	int[][] anIntArrayArray8123;
	short[] aShortArray8124;
	Class44 aClass44_8125;
	boolean aBoolean8126;
	Class44 aClass44_8127;
	Class44 aClass44_8128;
	float[] aFloatArray8129;
	int anInt8130;
	Interface1 anInterface1_8131;
	boolean aBoolean8132;
	int anInt8133;
	int anInt8134;
	Class93[] aClass93Array8135;
	byte[] aByteArray8136;
	static int anInt8137 = 4;
	byte aByte8138;
	static int anInt8139 = 4;
	short aShort8140;
	short aShort8141;
	int[] anIntArray8142;
	int[] anIntArray8143;
	short[] aShortArray8144;
	short aShort8145;
	Class64[] aClass64Array8146;
	int anInt8147;
	Class52[] aClass52Array8148;
	Class40[] aClass40Array8149;
	int[][] anIntArrayArray8150;
	static long[] aLongArray8151;
	static float[] aFloatArray8152 = new float[2];
	boolean aBoolean8153 = false;
	static int[] anIntArray8154;
	static int[] anIntArray8155;
	short aShort8156;
	static int anInt8157 = 1;
	static int anInt8158;
	static boolean aBoolean8159;

	public Class93[] method4464() {
		return ((Class387_Sub2) this).aClass93Array8135;
	}

	Class387_Sub2(Class_ra_Sub1 class_ra_sub1, Model class98, int i, int i_0_, int i_1_, int i_2_) {
		((Class387_Sub2) this).anInt8115 = 0;
		((Class387_Sub2) this).anInt8130 = 0;
		((Class387_Sub2) this).anInt8107 = 0;
		((Class387_Sub2) this).anInt8089 = 0;
		((Class387_Sub2) this).anInt8116 = 0;
		((Class387_Sub2) this).aBoolean8132 = true;
		((Class387_Sub2) this).aBoolean8126 = false;
		((Class387_Sub2) this).aClass_ra_Sub1_8092 = class_ra_sub1;
		((Class387_Sub2) this).anInt8093 = i;
		((Class387_Sub2) this).anInt8094 = i_2_;
		if (Class41.method573(i, i_2_))
			((Class387_Sub2) this).aClass44_8125 = new Class44(null, 5126, 3, 0);
		if (Class41.method559(i, i_2_))
			((Class387_Sub2) this).aClass44_8128 = new Class44(null, 5126, 2, 0);
		if (Class41.method562(i, i_2_))
			((Class387_Sub2) this).aClass44_8127 = new Class44(null, 5126, 3, 0);
		if (Class41.method558(i, i_2_))
			((Class387_Sub2) this).aClass44_8105 = new Class44(null, 5121, 4, 0);
		if (Class41.method560(i, i_2_))
			((Class387_Sub2) this).aClass37_8087 = new Class37();
		Interface_ma interface_ma = class_ra_sub1.anInterface_ma4227;
		int[] is = new int[class98.anInt904];
		((Class387_Sub2) this).anIntArray8143 = new int[class98.anInt874 + 1];
		for (int i_3_ = 0; i_3_ < class98.anInt904; i_3_++) {
			if (class98.aByteArray884 == null || class98.aByteArray884[i_3_] != 2) {
				if (class98.aShortArray896 != null && class98.aShortArray896[i_3_] != -1) {
					Class56 class56 = interface_ma.method221((class98.aShortArray896[i_3_] & 0xffff), -438811300);
					if (((((Class387_Sub2) this).anInt8094 & 0x40) == 0 || !class56.aBoolean533) && class56.aBoolean519)
						continue;
				}
				is[((Class387_Sub2) this).anInt8089++] = i_3_;
				((Class387_Sub2) this).anIntArray8143[(class98.aShortArray888[i_3_])]++;
				((Class387_Sub2) this).anIntArray8143[(class98.aShortArray907[i_3_])]++;
				((Class387_Sub2) this).anIntArray8143[(class98.aShortArray883[i_3_])]++;
			}
		}
		((Class387_Sub2) this).anInt8116 = ((Class387_Sub2) this).anInt8089;
		long[] ls = new long[((Class387_Sub2) this).anInt8089];
		boolean bool = (((Class387_Sub2) this).anInt8093 & 0x100) != 0;
		for (int i_4_ = 0; i_4_ < ((Class387_Sub2) this).anInt8089; i_4_++) {
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
						Class207 class207 = Class511.method6180((class94.anInt850 * 1490212127), (byte) 16);
						if (class207.aBoolean1948)
							bool_10_ = true;
						if (class207.anInt1950 * 1569869573 != -1) {
							Class56 class56_12_ = interface_ma.method221((class207.anInt1950 * 1569869573), -1471943564);
							if (class56_12_.aClass369_524 == Class369.aClass369_6817)
								((Class387_Sub2) this).aBoolean8098 = true;
						}
					}
				}
				if (bool_10_) {
					ls[i_4_] = 9223372036854775807L;
					((Class387_Sub2) this).anInt8116--;
					continue;
				}
			}
			int i_13_ = -1;
			if (class98.aShortArray896 != null) {
				i_13_ = class98.aShortArray896[i_5_];
				if (i_13_ != -1) {
					class56 = interface_ma.method221(i_13_ & 0xffff, -1851971027);
					if ((((Class387_Sub2) this).anInt8094 & 0x40) == 0 || !class56.aBoolean533) {
						i_8_ = class56.aByte525;
						i_9_ = class56.aByte526;
						if (class56.aByte531 != 0 || class56.aByte530 != 0)
							((Class387_Sub2) this).aBoolean8153 = true;
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
			((Class387_Sub2) this).aBoolean8098 |= bool_14_;
			Class387_Sub2 class387_sub2_15_ = this;
			((Class387_Sub2) class387_sub2_15_).aBoolean8153 = (((Class387_Sub2) class387_sub2_15_).aBoolean8153 | (class56 != null && (class56.aByte531 != 0 || class56.aByte530 != 0)));
		}
		Class390.method4600(ls, is, (byte) 64);
		((Class387_Sub2) this).anInt8115 = class98.anInt897;
		((Class387_Sub2) this).anInt8130 = class98.anInt874;
		((Class387_Sub2) this).anIntArray8102 = class98.anIntArray875;
		((Class387_Sub2) this).anIntArray8110 = class98.anIntArray889;
		((Class387_Sub2) this).anIntArray8104 = class98.anIntArray877;
		((Class387_Sub2) this).aShortArray8106 = class98.aShortArray879;
		Class45[] class45s = new Class45[((Class387_Sub2) this).anInt8130];
		((Class387_Sub2) this).aClass93Array8135 = class98.aClass93Array878;
		((Class387_Sub2) this).aClass64Array8146 = class98.aClass64Array893;
		if (class98.aClass94Array908 != null) {
			((Class387_Sub2) this).anInt8147 = class98.aClass94Array908.length;
			((Class387_Sub2) this).aClass52Array8148 = new Class52[((Class387_Sub2) this).anInt8147];
			((Class387_Sub2) this).aClass40Array8149 = new Class40[((Class387_Sub2) this).anInt8147];
			for (int i_16_ = 0; i_16_ < ((Class387_Sub2) this).anInt8147; i_16_++) {
				Class94 class94 = class98.aClass94Array908[i_16_];
				Class207 class207 = Class511.method6180(class94.anInt850 * 1490212127, (byte) 65);
				int i_17_ = -1;
				for (int i_18_ = 0; i_18_ < ((Class387_Sub2) this).anInt8089; i_18_++) {
					if (is[i_18_] == class94.anInt848 * -1401356047) {
						i_17_ = i_18_;
						break;
					}
				}
				int i_19_ = (Console.colorArray[(class98.aShortArray873[class94.anInt848 * -1401356047] & 0xffff)]) & 0xffffff;
				i_19_ = i_19_ | 255 - (class98.aByteArray876 != null ? (class98.aByteArray876[class94.anInt848 * -1401356047]) : 0) << 24;
				((Class387_Sub2) this).aClass52Array8148[i_16_] = (new Class52(i_17_, class98.aShortArray888[class94.anInt848 * -1401356047], class98.aShortArray907[class94.anInt848 * -1401356047], class98.aShortArray883[class94.anInt848 * -1401356047], class207.anInt1945 * 1234206275, class207.anInt1946 * -1366680355, class207.anInt1950 * 1569869573, class207.anInt1941 * -384448259, class207.anInt1947 * 1238436903, class207.aBoolean1948, class207.aBoolean1949, class94.anInt849 * 1518395751));
				((Class387_Sub2) this).aClass40Array8149[i_16_] = new Class40(i_19_);
			}
		}
		int i_20_ = ((Class387_Sub2) this).anInt8089 * 3;
		((Class387_Sub2) this).aShortArray8108 = new short[i_20_];
		((Class387_Sub2) this).aShortArray8109 = new short[i_20_];
		((Class387_Sub2) this).aShortArray8095 = new short[i_20_];
		((Class387_Sub2) this).aByteArray8118 = new byte[i_20_];
		((Class387_Sub2) this).aFloatArray8129 = new float[i_20_];
		((Class387_Sub2) this).aFloatArray8114 = new float[i_20_];
		((Class387_Sub2) this).modelColors = new short[((Class387_Sub2) this).anInt8089];
		((Class387_Sub2) this).aByteArray8136 = new byte[((Class387_Sub2) this).anInt8089];
		((Class387_Sub2) this).aShortArray8119 = new short[((Class387_Sub2) this).anInt8089];
		((Class387_Sub2) this).aShortArray8120 = new short[((Class387_Sub2) this).anInt8089];
		((Class387_Sub2) this).aShortArray8121 = new short[((Class387_Sub2) this).anInt8089];
		((Class387_Sub2) this).modelTextures = new short[((Class387_Sub2) this).anInt8089];
		if (class98.aShortArray892 != null)
			((Class387_Sub2) this).aShortArray8124 = new short[((Class387_Sub2) this).anInt8089];
		((Class387_Sub2) this).aShort8096 = (short) i_0_;
		((Class387_Sub2) this).aShort8099 = (short) i_1_;
		((Class387_Sub2) this).aShortArray8144 = new short[i_20_];
		aLongArray8151 = new long[i_20_];
		int i_21_ = 0;
		for (int i_22_ = 0; i_22_ < class98.anInt874; i_22_++) {
			int i_23_ = ((Class387_Sub2) this).anIntArray8143[i_22_];
			((Class387_Sub2) this).anIntArray8143[i_22_] = i_21_;
			i_21_ += i_23_;
			class45s[i_22_] = new Class45();
		}
		((Class387_Sub2) this).anIntArray8143[class98.anInt874] = i_21_;
		Class97 class97 = method4444(class98, is, ((Class387_Sub2) this).anInt8089);
		Class39[] class39s = new Class39[class98.anInt904];
		for (int i_24_ = 0; i_24_ < class98.anInt904; i_24_++) {
			short i_25_ = class98.aShortArray888[i_24_];
			short i_26_ = class98.aShortArray907[i_24_];
			short i_27_ = class98.aShortArray883[i_24_];
			int i_28_ = (((Class387_Sub2) this).anIntArray8102[i_26_] - ((Class387_Sub2) this).anIntArray8102[i_25_]);
			int i_29_ = (((Class387_Sub2) this).anIntArray8110[i_26_] - ((Class387_Sub2) this).anIntArray8110[i_25_]);
			int i_30_ = (((Class387_Sub2) this).anIntArray8104[i_26_] - ((Class387_Sub2) this).anIntArray8104[i_25_]);
			int i_31_ = (((Class387_Sub2) this).anIntArray8102[i_27_] - ((Class387_Sub2) this).anIntArray8102[i_25_]);
			int i_32_ = (((Class387_Sub2) this).anIntArray8110[i_27_] - ((Class387_Sub2) this).anIntArray8110[i_25_]);
			int i_33_ = (((Class387_Sub2) this).anIntArray8104[i_27_] - ((Class387_Sub2) this).anIntArray8104[i_25_]);
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
				Class45 class45 = class45s[i_25_];
				((Class45) class45).anInt446 += i_34_;
				((Class45) class45).anInt448 += i_35_;
				((Class45) class45).anInt447 += i_36_;
				((Class45) class45).anInt445++;
				class45 = class45s[i_26_];
				((Class45) class45).anInt446 += i_34_;
				((Class45) class45).anInt448 += i_35_;
				((Class45) class45).anInt447 += i_36_;
				((Class45) class45).anInt445++;
				class45 = class45s[i_27_];
				((Class45) class45).anInt446 += i_34_;
				((Class45) class45).anInt448 += i_35_;
				((Class45) class45).anInt447 += i_36_;
				((Class45) class45).anInt445++;
			} else if (i_38_ == 1) {
				Class39 class39 = class39s[i_24_] = new Class39();
				((Class39) class39).anInt422 = i_34_;
				((Class39) class39).anInt423 = i_35_;
				((Class39) class39).anInt421 = i_36_;
			}
		}
		for (int i_39_ = 0; i_39_ < ((Class387_Sub2) this).anInt8089; i_39_++) {
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
			if (i_44_ != -1 && (((Class387_Sub2) this).anInt8094 & 0x40) != 0) {
				Class56 class56 = interface_ma.method221(i_44_ & 0xffff, 1002807613);
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
							method4492(class98.anIntArray875[i_85_], class98.anIntArray889[i_85_], class98.anIntArray877[i_85_], i_88_, i_89_, i_90_, fs, f_93_, i_91_, f_92_, aFloatArray8152);
							f = aFloatArray8152[0];
							f_45_ = aFloatArray8152[1];
							method4492(class98.anIntArray875[i_86_], class98.anIntArray889[i_86_], class98.anIntArray877[i_86_], i_88_, i_89_, i_90_, fs, f_93_, i_91_, f_92_, aFloatArray8152);
							f_46_ = aFloatArray8152[0];
							f_47_ = aFloatArray8152[1];
							method4492(class98.anIntArray875[i_87_], class98.anIntArray889[i_87_], class98.anIntArray877[i_87_], i_88_, i_89_, i_90_, fs, f_93_, i_91_, f_92_, aFloatArray8152);
							f_48_ = aFloatArray8152[0];
							f_49_ = aFloatArray8152[1];
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
							method4443(class98.anIntArray875[i_85_], class98.anIntArray889[i_85_], class98.anIntArray877[i_85_], i_88_, i_89_, i_90_, i_52_, fs, i_91_, f_92_, f_95_, f_96_, aFloatArray8152);
							f = aFloatArray8152[0];
							f_45_ = aFloatArray8152[1];
							method4443(class98.anIntArray875[i_86_], class98.anIntArray889[i_86_], class98.anIntArray877[i_86_], i_88_, i_89_, i_90_, i_52_, fs, i_91_, f_92_, f_95_, f_96_, aFloatArray8152);
							f_46_ = aFloatArray8152[0];
							f_47_ = aFloatArray8152[1];
							method4443(class98.anIntArray875[i_87_], class98.anIntArray889[i_87_], class98.anIntArray877[i_87_], i_88_, i_89_, i_90_, i_52_, fs, i_91_, f_92_, f_95_, f_96_, aFloatArray8152);
							f_48_ = aFloatArray8152[0];
							f_49_ = aFloatArray8152[1];
						} else if (i_53_ == 3) {
							method4441(class98.anIntArray875[i_85_], class98.anIntArray889[i_85_], class98.anIntArray877[i_85_], i_88_, i_89_, i_90_, fs, i_91_, f_92_, aFloatArray8152);
							f = aFloatArray8152[0];
							f_45_ = aFloatArray8152[1];
							method4441(class98.anIntArray875[i_86_], class98.anIntArray889[i_86_], class98.anIntArray877[i_86_], i_88_, i_89_, i_90_, fs, i_91_, f_92_, aFloatArray8152);
							f_46_ = aFloatArray8152[0];
							f_47_ = aFloatArray8152[1];
							method4441(class98.anIntArray875[i_87_], class98.anIntArray889[i_87_], class98.anIntArray877[i_87_], i_88_, i_89_, i_90_, fs, i_91_, f_92_, aFloatArray8152);
							f_48_ = aFloatArray8152[0];
							f_49_ = aFloatArray8152[1];
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
				Class45 class45 = class45s[i_113_];
				((Class387_Sub2) this).aShortArray8119[i_39_] = method4514(class98, i_113_, l, ((Class45) class45).anInt446, ((Class45) class45).anInt448, ((Class45) class45).anInt447, ((Class45) class45).anInt445, f, f_45_);
				class45 = class45s[i_114_];
				((Class387_Sub2) this).aShortArray8120[i_39_] = method4514(class98, i_114_, l + (long) i_50_, ((Class45) class45).anInt446, ((Class45) class45).anInt448, ((Class45) class45).anInt447, ((Class45) class45).anInt445, f_46_, f_47_);
				class45 = class45s[i_115_];
				((Class387_Sub2) this).aShortArray8121[i_39_] = method4514(class98, i_115_, l + (long) i_51_, ((Class45) class45).anInt446, ((Class45) class45).anInt448, ((Class45) class45).anInt447, ((Class45) class45).anInt445, f_48_, f_49_);
			} else if (i_112_ == 1) {
				Class39 class39 = class39s[i_40_];
				long l = ((long) ((i_42_ << 2) + (((Class39) class39).anInt422 > 0 ? 1024 : 2048) + (((Class39) class39).anInt423 + 256 << 12) + (((Class39) class39).anInt421 + 256 << 22)) + (((long) (i_52_ << 24) + (long) (i_41_ << 8) + (long) i_43_) << 32));
				((Class387_Sub2) this).aShortArray8119[i_39_] = method4514(class98, class98.aShortArray888[i_40_], l, ((Class39) class39).anInt422, ((Class39) class39).anInt423, ((Class39) class39).anInt421, 0, f, f_45_);
				((Class387_Sub2) this).aShortArray8120[i_39_] = method4514(class98, class98.aShortArray907[i_40_], l + (long) i_50_, ((Class39) class39).anInt422, ((Class39) class39).anInt423, ((Class39) class39).anInt421, 0, f_46_, f_47_);
				((Class387_Sub2) this).aShortArray8121[i_39_] = method4514(class98, class98.aShortArray883[i_40_], l + (long) i_51_, ((Class39) class39).anInt422, ((Class39) class39).anInt423, ((Class39) class39).anInt421, 0, f_48_, f_49_);
			}
			if (class98.aByteArray876 != null)
				((Class387_Sub2) this).aByteArray8136[i_39_] = class98.aByteArray876[i_40_];
			if (class98.aShortArray892 != null)
				((Class387_Sub2) this).aShortArray8124[i_39_] = class98.aShortArray892[i_40_];
			((Class387_Sub2) this).modelColors[i_39_] = class98.aShortArray873[i_40_];
			((Class387_Sub2) this).modelTextures[i_39_] = i_44_;
		}
		int i_116_ = 0;
		short i_117_ = -10000;
		for (int i_118_ = 0; i_118_ < ((Class387_Sub2) this).anInt8116; i_118_++) {
			short i_119_ = ((Class387_Sub2) this).modelTextures[i_118_];
			if (i_119_ != i_117_) {
				i_116_++;
				i_117_ = i_119_;
			}
		}
		((Class387_Sub2) this).anIntArray8142 = new int[i_116_ + 1];
		i_116_ = 0;
		i_117_ = (short) -10000;
		for (int i_120_ = 0; i_120_ < ((Class387_Sub2) this).anInt8116; i_120_++) {
			short i_121_ = ((Class387_Sub2) this).modelTextures[i_120_];
			if (i_121_ != i_117_) {
				((Class387_Sub2) this).anIntArray8142[i_116_++] = i_120_;
				i_117_ = i_121_;
			}
		}
		((Class387_Sub2) this).anIntArray8142[i_116_] = ((Class387_Sub2) this).anInt8116;
		aLongArray8151 = null;
		((Class387_Sub2) this).aShortArray8108 = method4516(((Class387_Sub2) this).aShortArray8108, ((Class387_Sub2) this).anInt8107);
		((Class387_Sub2) this).aShortArray8109 = method4516(((Class387_Sub2) this).aShortArray8109, ((Class387_Sub2) this).anInt8107);
		((Class387_Sub2) this).aShortArray8095 = method4516(((Class387_Sub2) this).aShortArray8095, ((Class387_Sub2) this).anInt8107);
		((Class387_Sub2) this).aByteArray8118 = method4515(((Class387_Sub2) this).aByteArray8118, ((Class387_Sub2) this).anInt8107);
		((Class387_Sub2) this).aFloatArray8129 = method4517(((Class387_Sub2) this).aFloatArray8129, ((Class387_Sub2) this).anInt8107);
		((Class387_Sub2) this).aFloatArray8114 = method4517(((Class387_Sub2) this).aFloatArray8114, ((Class387_Sub2) this).anInt8107);
		if (class98.anIntArray880 != null && Class41.method581(i, ((Class387_Sub2) this).anInt8094))
			((Class387_Sub2) this).anIntArrayArray8113 = class98.method1197(false);
		if (class98.aClass94Array908 != null && Class41.method574(i, ((Class387_Sub2) this).anInt8094))
			((Class387_Sub2) this).anIntArrayArray8150 = class98.method1193();
		if (class98.anIntArray890 != null && Class41.method571(i, ((Class387_Sub2) this).anInt8094)) {
			int i_122_ = 0;
			int[] is_123_ = new int[256];
			for (int i_124_ = 0; i_124_ < ((Class387_Sub2) this).anInt8089; i_124_++) {
				int i_125_ = class98.anIntArray890[is[i_124_]];
				if (i_125_ >= 0) {
					is_123_[i_125_]++;
					if (i_125_ > i_122_)
						i_122_ = i_125_;
				}
			}
			((Class387_Sub2) this).anIntArrayArray8123 = new int[i_122_ + 1][];
			for (int i_126_ = 0; i_126_ <= i_122_; i_126_++) {
				((Class387_Sub2) this).anIntArrayArray8123[i_126_] = new int[is_123_[i_126_]];
				is_123_[i_126_] = 0;
			}
			for (int i_127_ = 0; i_127_ < ((Class387_Sub2) this).anInt8089; i_127_++) {
				int i_128_ = class98.anIntArray890[is[i_127_]];
				if (i_128_ >= 0)
					((Class387_Sub2) this).anIntArrayArray8123[i_128_][is_123_[i_128_]++] = i_127_;
			}
		}
	}

	short method4514(Model class98, int i, long l, int i_129_, int i_130_, int i_131_, int i_132_, float f, float f_133_) {
		int i_134_ = ((Class387_Sub2) this).anIntArray8143[i];
		int i_135_ = ((Class387_Sub2) this).anIntArray8143[i + 1];
		int i_136_ = 0;
		for (int i_137_ = i_134_; i_137_ < i_135_; i_137_++) {
			short i_138_ = ((Class387_Sub2) this).aShortArray8144[i_137_];
			if (i_138_ == 0) {
				i_136_ = i_137_;
				break;
			}
			if (aLongArray8151[i_137_] == l)
				return (short) (i_138_ - 1);
		}
		((Class387_Sub2) this).aShortArray8144[i_136_] = (short) (((Class387_Sub2) this).anInt8107 + 1);
		aLongArray8151[i_136_] = l;
		((Class387_Sub2) this).aShortArray8108[(((Class387_Sub2) this).anInt8107)] = (short) i_129_;
		((Class387_Sub2) this).aShortArray8109[(((Class387_Sub2) this).anInt8107)] = (short) i_130_;
		((Class387_Sub2) this).aShortArray8095[(((Class387_Sub2) this).anInt8107)] = (short) i_131_;
		((Class387_Sub2) this).aByteArray8118[((Class387_Sub2) this).anInt8107] = (byte) i_132_;
		((Class387_Sub2) this).aFloatArray8129[(((Class387_Sub2) this).anInt8107)] = f;
		((Class387_Sub2) this).aFloatArray8114[(((Class387_Sub2) this).anInt8107)] = f_133_;
		return (short) ((Class387_Sub2) this).anInt8107++;
	}

	static byte[] method4515(byte[] is, int i) {
		byte[] is_139_ = new byte[i];
		System.arraycopy(is, 0, is_139_, 0, i);
		return is_139_;
	}

	static short[] method4516(short[] is, int i) {
		short[] is_140_ = new short[i];
		System.arraycopy(is, 0, is_140_, 0, i);
		return is_140_;
	}

	static float[] method4517(float[] fs, int i) {
		float[] fs_141_ = new float[i];
		System.arraycopy(fs, 0, fs_141_, 0, i);
		return fs_141_;
	}

	public int m() {
		return ((Class387_Sub2) this).anInt8093;
	}

	public void KA(int i) {
		((Class387_Sub2) this).anInt8093 = i;
		if (((Class387_Sub2) this).aClass68_8112 != null && (((Class387_Sub2) this).anInt8093 & 0x10000) == 0) {
			((Class387_Sub2) this).aShortArray8108 = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray582);
			((Class387_Sub2) this).aShortArray8109 = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray583);
			((Class387_Sub2) this).aShortArray8095 = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray584);
			((Class387_Sub2) this).aByteArray8118 = (((Class68) ((Class387_Sub2) this).aClass68_8112).aByteArray585);
			((Class387_Sub2) this).aClass68_8112 = null;
		}
		((Class387_Sub2) this).aBoolean8132 = true;
		method4518();
	}

	public void method4479() {
		if (((Class387_Sub2) this).anInt8107 > 0 && ((Class387_Sub2) this).anInt8116 > 0) {
			method4527(false);
			if ((((Class387_Sub2) this).aByte8138 & 0x10) == 0 && (((Class37) ((Class387_Sub2) this).aClass37_8087).anInterface3_382) == null)
				method4523(false);
			method4518();
		}
	}

	public Class387 method4446(byte i, int i_142_, boolean bool) {
		boolean bool_143_ = false;
		Class387_Sub2 class387_sub2_144_;
		Class387_Sub2 class387_sub2_145_;
		if (i > 0 && i <= 7) {
			class387_sub2_145_ = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass387_Sub2Array8433[i - 1]);
			class387_sub2_144_ = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass387_Sub2Array8432[i - 1]);
			bool_143_ = true;
		} else
			class387_sub2_144_ = class387_sub2_145_ = new Class387_Sub2(((Class387_Sub2) this).aClass_ra_Sub1_8092);
		return method4526(class387_sub2_144_, class387_sub2_145_, i_142_, bool_143_, bool);
	}

	public void bs(int i) {
		int i_146_ = Class257.anIntArray2683[i];
		int i_147_ = Class257.anIntArray2684[i];
		for (int i_148_ = 0; i_148_ < ((Class387_Sub2) this).anInt8130; i_148_++) {
			int i_149_ = ((((Class387_Sub2) this).anIntArray8104[i_148_] * i_146_ + ((Class387_Sub2) this).anIntArray8102[i_148_] * i_147_) >> 14);
			((Class387_Sub2) this).anIntArray8104[i_148_] = ((((Class387_Sub2) this).anIntArray8104[i_148_] * i_147_ - ((Class387_Sub2) this).anIntArray8102[i_148_] * i_146_) >> 14);
			((Class387_Sub2) this).anIntArray8102[i_148_] = i_149_;
		}
		for (int i_150_ = 0; i_150_ < ((Class387_Sub2) this).anInt8107; i_150_++) {
			int i_151_ = ((((Class387_Sub2) this).aShortArray8095[i_150_] * i_146_ + ((Class387_Sub2) this).aShortArray8108[i_150_] * i_147_) >> 14);
			((Class387_Sub2) this).aShortArray8095[i_150_] = (short) (((((Class387_Sub2) this).aShortArray8095[i_150_] * i_147_) - (((Class387_Sub2) this).aShortArray8108[i_150_] * i_146_)) >> 14);
			((Class387_Sub2) this).aShortArray8108[i_150_] = (short) i_151_;
		}
		if (((Class387_Sub2) this).aClass44_8127 == null && ((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass44_8127 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	void method4518() {
		if (((Class387_Sub2) this).aBoolean8132) {
			((Class387_Sub2) this).aBoolean8132 = false;
			if (((Class387_Sub2) this).aClass93Array8135 == null && ((Class387_Sub2) this).aClass64Array8146 == null && ((Class387_Sub2) this).aClass52Array8148 == null && !Class41.method552(((Class387_Sub2) this).anInt8093, ((Class387_Sub2) this).anInt8094)) {
				boolean bool = false;
				boolean bool_152_ = false;
				boolean bool_153_ = false;
				if (((Class387_Sub2) this).anIntArray8102 != null && !Class41.method563(((Class387_Sub2) this).anInt8093, ((Class387_Sub2) this).anInt8094)) {
					if (((Class387_Sub2) this).aClass44_8125 == null || (((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441) != null) {
						if (!((Class387_Sub2) this).aBoolean8126)
							method4528();
						bool = true;
					} else
						((Class387_Sub2) this).aBoolean8132 = true;
				}
				if (((Class387_Sub2) this).anIntArray8110 != null && !Class41.method565(((Class387_Sub2) this).anInt8093, ((Class387_Sub2) this).anInt8094)) {
					if (((Class387_Sub2) this).aClass44_8125 == null || (((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441) != null) {
						if (!((Class387_Sub2) this).aBoolean8126)
							method4528();
						bool_152_ = true;
					} else
						((Class387_Sub2) this).aBoolean8132 = true;
				}
				if (((Class387_Sub2) this).anIntArray8104 != null && !Class41.method566(((Class387_Sub2) this).anInt8093, ((Class387_Sub2) this).anInt8094)) {
					if (((Class387_Sub2) this).aClass44_8125 == null || (((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441) != null) {
						if (!((Class387_Sub2) this).aBoolean8126)
							method4528();
						bool_153_ = true;
					} else
						((Class387_Sub2) this).aBoolean8132 = true;
				}
				if (bool)
					((Class387_Sub2) this).anIntArray8102 = null;
				if (bool_152_)
					((Class387_Sub2) this).anIntArray8110 = null;
				if (bool_153_)
					((Class387_Sub2) this).anIntArray8104 = null;
			}
			if (((Class387_Sub2) this).aShortArray8144 != null && ((Class387_Sub2) this).anIntArray8102 == null && ((Class387_Sub2) this).anIntArray8110 == null && ((Class387_Sub2) this).anIntArray8104 == null) {
				((Class387_Sub2) this).aShortArray8144 = null;
				((Class387_Sub2) this).anIntArray8143 = null;
			}
			if (((Class387_Sub2) this).aByteArray8118 != null && !Class41.method567(((Class387_Sub2) this).anInt8093, ((Class387_Sub2) this).anInt8094)) {
				if (((Class387_Sub2) this).aClass44_8127 != null) {
					if ((((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441) != null) {
						((Class387_Sub2) this).aShortArray8095 = null;
						((Class387_Sub2) this).aShortArray8109 = null;
						((Class387_Sub2) this).aShortArray8108 = null;
						((Class387_Sub2) this).aByteArray8118 = null;
					} else
						((Class387_Sub2) this).aBoolean8132 = true;
				} else if (((Class387_Sub2) this).aClass44_8105 == null || (((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441) != null) {
					((Class387_Sub2) this).aShortArray8095 = null;
					((Class387_Sub2) this).aShortArray8109 = null;
					((Class387_Sub2) this).aShortArray8108 = null;
					((Class387_Sub2) this).aByteArray8118 = null;
				} else
					((Class387_Sub2) this).aBoolean8132 = true;
			}
			if (((Class387_Sub2) this).modelColors != null && !Class41.method568(((Class387_Sub2) this).anInt8093, ((Class387_Sub2) this).anInt8094)) {
				if (((Class387_Sub2) this).aClass44_8105 == null || (((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441) != null)
					((Class387_Sub2) this).modelColors = null;
				else
					((Class387_Sub2) this).aBoolean8132 = true;
			}
			if (((Class387_Sub2) this).aByteArray8136 != null && !Class41.method579(((Class387_Sub2) this).anInt8093, ((Class387_Sub2) this).anInt8094)) {
				if (((Class387_Sub2) this).aClass44_8105 == null || (((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441) != null)
					((Class387_Sub2) this).aByteArray8136 = null;
				else
					((Class387_Sub2) this).aBoolean8132 = true;
			}
			if (((Class387_Sub2) this).aFloatArray8129 != null && !Class41.method569(((Class387_Sub2) this).anInt8093, ((Class387_Sub2) this).anInt8094)) {
				if (((Class387_Sub2) this).aClass44_8128 == null || (((Class44) ((Class387_Sub2) this).aClass44_8128).anInterface1_441) != null) {
					((Class387_Sub2) this).aFloatArray8114 = null;
					((Class387_Sub2) this).aFloatArray8129 = null;
				} else
					((Class387_Sub2) this).aBoolean8132 = true;
			}
			if (((Class387_Sub2) this).modelTextures != null && !Class41.method576(((Class387_Sub2) this).anInt8093, ((Class387_Sub2) this).anInt8094)) {
				if (((Class387_Sub2) this).aClass44_8105 == null || (((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441) != null)
					((Class387_Sub2) this).modelTextures = null;
				else
					((Class387_Sub2) this).aBoolean8132 = true;
			}
			if (((Class387_Sub2) this).aShortArray8119 != null && !Class41.method572(((Class387_Sub2) this).anInt8093, ((Class387_Sub2) this).anInt8094)) {
				if ((((Class387_Sub2) this).aClass37_8087 == null || (((Class37) ((Class387_Sub2) this).aClass37_8087).anInterface3_382) != null) && (((Class387_Sub2) this).aClass44_8105 == null || (((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441) != null)) {
					((Class387_Sub2) this).aShortArray8121 = null;
					((Class387_Sub2) this).aShortArray8120 = null;
					((Class387_Sub2) this).aShortArray8119 = null;
				} else
					((Class387_Sub2) this).aBoolean8132 = true;
			}
			if (((Class387_Sub2) this).anIntArrayArray8123 != null && !Class41.method571(((Class387_Sub2) this).anInt8093, ((Class387_Sub2) this).anInt8094)) {
				((Class387_Sub2) this).anIntArrayArray8123 = null;
				((Class387_Sub2) this).aShortArray8124 = null;
			}
			if (((Class387_Sub2) this).anIntArrayArray8113 != null && !Class41.method581(((Class387_Sub2) this).anInt8093, ((Class387_Sub2) this).anInt8094)) {
				((Class387_Sub2) this).anIntArrayArray8113 = null;
				((Class387_Sub2) this).aShortArray8106 = null;
			}
			if (((Class387_Sub2) this).anIntArrayArray8150 != null && !Class41.method574(((Class387_Sub2) this).anInt8093, ((Class387_Sub2) this).anInt8094))
				((Class387_Sub2) this).anIntArrayArray8150 = null;
			if (((Class387_Sub2) this).anIntArray8142 != null && (((Class387_Sub2) this).anInt8093 & 0x800) == 0 && (((Class387_Sub2) this).anInt8093 & 0x40000) == 0)
				((Class387_Sub2) this).anIntArray8142 = null;
		}
	}

	public void f(int i) {
		int i_154_ = Class257.anIntArray2683[i];
		int i_155_ = Class257.anIntArray2684[i];
		for (int i_156_ = 0; i_156_ < ((Class387_Sub2) this).anInt8130; i_156_++) {
			int i_157_ = ((((Class387_Sub2) this).anIntArray8104[i_156_] * i_154_ + ((Class387_Sub2) this).anIntArray8102[i_156_] * i_155_) >> 14);
			((Class387_Sub2) this).anIntArray8104[i_156_] = ((((Class387_Sub2) this).anIntArray8104[i_156_] * i_155_ - ((Class387_Sub2) this).anIntArray8102[i_156_] * i_154_) >> 14);
			((Class387_Sub2) this).anIntArray8102[i_156_] = i_157_;
		}
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public void S(int i) {
		int i_158_ = Class257.anIntArray2683[i];
		int i_159_ = Class257.anIntArray2684[i];
		for (int i_160_ = 0; i_160_ < ((Class387_Sub2) this).anInt8130; i_160_++) {
			int i_161_ = ((((Class387_Sub2) this).anIntArray8104[i_160_] * i_158_ + ((Class387_Sub2) this).anIntArray8102[i_160_] * i_159_) >> 14);
			((Class387_Sub2) this).anIntArray8104[i_160_] = ((((Class387_Sub2) this).anIntArray8104[i_160_] * i_159_ - ((Class387_Sub2) this).anIntArray8102[i_160_] * i_158_) >> 14);
			((Class387_Sub2) this).anIntArray8102[i_160_] = i_161_;
		}
		for (int i_162_ = 0; i_162_ < ((Class387_Sub2) this).anInt8107; i_162_++) {
			int i_163_ = ((((Class387_Sub2) this).aShortArray8095[i_162_] * i_158_ + ((Class387_Sub2) this).aShortArray8108[i_162_] * i_159_) >> 14);
			((Class387_Sub2) this).aShortArray8095[i_162_] = (short) (((((Class387_Sub2) this).aShortArray8095[i_162_] * i_159_) - (((Class387_Sub2) this).aShortArray8108[i_162_] * i_158_)) >> 14);
			((Class387_Sub2) this).aShortArray8108[i_162_] = (short) i_163_;
		}
		if (((Class387_Sub2) this).aClass44_8127 == null && ((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass44_8127 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public void t(int i) {
		int i_164_ = Class257.anIntArray2683[i];
		int i_165_ = Class257.anIntArray2684[i];
		for (int i_166_ = 0; i_166_ < ((Class387_Sub2) this).anInt8130; i_166_++) {
			int i_167_ = ((((Class387_Sub2) this).anIntArray8110[i_166_] * i_165_ - ((Class387_Sub2) this).anIntArray8104[i_166_] * i_164_) >> 14);
			((Class387_Sub2) this).anIntArray8104[i_166_] = ((((Class387_Sub2) this).anIntArray8110[i_166_] * i_164_ + ((Class387_Sub2) this).anIntArray8104[i_166_] * i_165_) >> 14);
			((Class387_Sub2) this).anIntArray8110[i_166_] = i_167_;
		}
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public void EA(int i) {
		int i_168_ = Class257.anIntArray2683[i];
		int i_169_ = Class257.anIntArray2684[i];
		for (int i_170_ = 0; i_170_ < ((Class387_Sub2) this).anInt8130; i_170_++) {
			int i_171_ = ((((Class387_Sub2) this).anIntArray8110[i_170_] * i_168_ + ((Class387_Sub2) this).anIntArray8102[i_170_] * i_169_) >> 14);
			((Class387_Sub2) this).anIntArray8110[i_170_] = ((((Class387_Sub2) this).anIntArray8110[i_170_] * i_169_ - ((Class387_Sub2) this).anIntArray8102[i_170_] * i_168_) >> 14);
			((Class387_Sub2) this).anIntArray8102[i_170_] = i_171_;
		}
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public void ia(int i, int i_172_, int i_173_) {
		for (int i_174_ = 0; i_174_ < ((Class387_Sub2) this).anInt8130; i_174_++) {
			if (i != 0)
				((Class387_Sub2) this).anIntArray8102[i_174_] += i;
			if (i_172_ != 0)
				((Class387_Sub2) this).anIntArray8110[i_174_] += i_172_;
			if (i_173_ != 0)
				((Class387_Sub2) this).anIntArray8104[i_174_] += i_173_;
		}
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public int cx() {
		return ((Class387_Sub2) this).aShort8096;
	}

	public void cl(int i) {
		((Class387_Sub2) this).aShort8096 = (short) i;
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
	}

	int method4519(int i, short i_175_, int i_176_, byte i_177_) {
		int i_178_ = Console.colorArray[method4524(i, i_176_)];
		if (i_175_ != -1) {
			Class56 class56 = ((Class387_Sub2) this).aClass_ra_Sub1_8092.anInterface_ma4227.method221(i_175_ & 0xffff, -1612467206);
			int i_179_ = class56.aByte529 & 0xff;
			if (i_179_ != 0) {
				int i_180_;
				if (i_176_ < 0)
					i_180_ = 0;
				else if (i_176_ > 127)
					i_180_ = 16777215;
				else
					i_180_ = 131586 * i_176_;
				if (i_179_ == 256)
					i_178_ = i_180_;
				else {
					int i_181_ = i_179_;
					int i_182_ = 256 - i_179_;
					i_178_ = ((((i_180_ & 0xff00ff) * i_181_ + (i_178_ & 0xff00ff) * i_182_) & ~0xff00ff) + (((i_180_ & 0xff00) * i_181_ + (i_178_ & 0xff00) * i_182_) & 0xff0000)) >> 8;
				}
			}
			int i_183_ = class56.aByte534 & 0xff;
			if (i_183_ != 0) {
				i_183_ += 256;
				int i_184_ = ((i_178_ & 0xff0000) >> 16) * i_183_;
				if (i_184_ > 65535)
					i_184_ = 65535;
				int i_185_ = ((i_178_ & 0xff00) >> 8) * i_183_;
				if (i_185_ > 65535)
					i_185_ = 65535;
				int i_186_ = (i_178_ & 0xff) * i_183_;
				if (i_186_ > 65535)
					i_186_ = 65535;
				i_178_ = (i_184_ << 8 & 0xff0000) + (i_185_ & 0xff00) + (i_186_ >> 8);
			}
		}
		return i_178_ << 8 | 255 - (i_177_ & 0xff);
	}

	public boolean dw() {
		return ((Class387_Sub2) this).aBoolean8153;
	}

	public void oa(int i, int i_187_, int i_188_) {
		for (int i_189_ = 0; i_189_ < ((Class387_Sub2) this).anInt8130; i_189_++) {
			if (i != 128)
				((Class387_Sub2) this).anIntArray8102[i_189_] = ((Class387_Sub2) this).anIntArray8102[i_189_] * i >> 7;
			if (i_187_ != 128)
				((Class387_Sub2) this).anIntArray8110[i_189_] = (((Class387_Sub2) this).anIntArray8110[i_189_] * i_187_ >> 7);
			if (i_188_ != 128)
				((Class387_Sub2) this).anIntArray8104[i_189_] = (((Class387_Sub2) this).anIntArray8104[i_189_] * i_188_ >> 7);
		}
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public int n() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).anInt8133;
	}

	public int RA() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).aShort8145;
	}

	public int AA() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).aShort8140;
	}

	public int YA() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).aShort8097;
	}

	void method4520() {
		if (((Class387_Sub2) this).anInt8116 != 0) {
			if (((Class387_Sub2) this).aByte8138 != 0)
				method4527(true);
			method4527(false);
			if (((Class387_Sub2) this).aClass37_8087 != null) {
				if ((((Class37) ((Class387_Sub2) this).aClass37_8087).anInterface3_382) == null)
					method4523((((Class387_Sub2) this).aByte8138 & 0x10) != 0);
				if ((((Class37) ((Class387_Sub2) this).aClass37_8087).anInterface3_382) != null) {
					((Class387_Sub2) this).aClass_ra_Sub1_8092.method4854(((Class387_Sub2) this).aClass44_8127 != null);
					((Class387_Sub2) this).aClass_ra_Sub1_8092.method4869(((Class387_Sub2) this).aClass44_8125, ((Class387_Sub2) this).aClass44_8127, ((Class387_Sub2) this).aClass44_8105, ((Class387_Sub2) this).aClass44_8128);
					int i = ((Class387_Sub2) this).anIntArray8142.length - 1;
					for (int i_190_ = 0; i_190_ < i; i_190_++) {
						int i_191_ = ((Class387_Sub2) this).anIntArray8142[i_190_];
						int i_192_ = (((Class387_Sub2) this).anIntArray8142[i_190_ + 1]);
						int i_193_ = (((Class387_Sub2) this).modelTextures[i_191_] & 0xffff);
						if (i_193_ == 65535)
							i_193_ = -1;
						((Class387_Sub2) this).aClass_ra_Sub1_8092.method4871(i_193_, ((Class387_Sub2) this).aClass44_8127 != null);
						((Class387_Sub2) this).aClass_ra_Sub1_8092.method4837((((Class37) ((Class387_Sub2) this).aClass37_8087).anInterface3_382), 4, i_191_ * 3, (i_192_ - i_191_) * 3);
					}
				}
			}
			method4518();
		}
	}

	public byte[] dz() {
		return ((Class387_Sub2) this).aByteArray8136;
	}

	public int ha() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).aShort8141;
	}

	public void bg(int i) {
		int i_194_ = Class257.anIntArray2683[i];
		int i_195_ = Class257.anIntArray2684[i];
		for (int i_196_ = 0; i_196_ < ((Class387_Sub2) this).anInt8130; i_196_++) {
			int i_197_ = ((((Class387_Sub2) this).anIntArray8104[i_196_] * i_194_ + ((Class387_Sub2) this).anIntArray8102[i_196_] * i_195_) >> 14);
			((Class387_Sub2) this).anIntArray8104[i_196_] = ((((Class387_Sub2) this).anIntArray8104[i_196_] * i_195_ - ((Class387_Sub2) this).anIntArray8102[i_196_] * i_194_) >> 14);
			((Class387_Sub2) this).anIntArray8102[i_196_] = i_197_;
		}
		for (int i_198_ = 0; i_198_ < ((Class387_Sub2) this).anInt8107; i_198_++) {
			int i_199_ = ((((Class387_Sub2) this).aShortArray8095[i_198_] * i_194_ + ((Class387_Sub2) this).aShortArray8108[i_198_] * i_195_) >> 14);
			((Class387_Sub2) this).aShortArray8095[i_198_] = (short) (((((Class387_Sub2) this).aShortArray8095[i_198_] * i_195_) - (((Class387_Sub2) this).aShortArray8108[i_198_] * i_194_)) >> 14);
			((Class387_Sub2) this).aShortArray8108[i_198_] = (short) i_199_;
		}
		if (((Class387_Sub2) this).aClass44_8127 == null && ((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass44_8127 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public void Q(int i) {
		((Class387_Sub2) this).aShort8099 = (short) i;
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass44_8127 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = null;
	}

	public int cn() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).aShort8156;
	}

	public int Z() {
		return ((Class387_Sub2) this).aShort8099;
	}

	public void p(int i) {
		((Class387_Sub2) this).aShort8096 = (short) i;
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
	}

	public void color(short modelColor, short modifiedModelColor) {
		for (int i_201_ = 0; i_201_ < ((Class387_Sub2) this).anInt8089; i_201_++) {
			//((Class387_Sub2) this).modelColors[i_201_] = -525;
			if (((Class387_Sub2) this).modelColors[i_201_] == modelColor)
				((Class387_Sub2) this).modelColors[i_201_] = modifiedModelColor;
						//20000;
				//(short) (modifiedModelColor + 10000 > Short.MAX_VALUE ? modifiedModelColor : modifiedModelColor + 10000);
		}
		if (((Class387_Sub2) this).aClass52Array8148 != null) {
			for (int i_202_ = 0; i_202_ < ((Class387_Sub2) this).anInt8147; i_202_++) {
				Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_202_];
				Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_202_];
				((Class40) class40).anInt428 = (
						((Class40) class40).anInt428 & ~0xffffff | 
						((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
	}

	public void method4460(byte i, byte[] is) {
		if (is == null) {
			for (int i_203_ = 0; i_203_ < ((Class387_Sub2) this).anInt8089; i_203_++)
				((Class387_Sub2) this).aByteArray8136[i_203_] = i;
		} else {
			for (int i_204_ = 0; i_204_ < ((Class387_Sub2) this).anInt8089; i_204_++) {
				int i_205_ = 255 - ((255 - (is[i_204_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class387_Sub2) this).aByteArray8136[i_204_] = (byte) i_205_;
			}
		}
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
	}

	public boolean method4458(int i, int i_206_, Class247 class247, boolean bool, int i_207_) {
		Class249 class249 = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass249_8430);
		class249.method2508(class247);
		class249.method2483(((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass249_8422);
		boolean bool_208_ = false;
		int i_209_ = 2147483647;
		int i_210_ = -2147483648;
		int i_211_ = 2147483647;
		int i_212_ = -2147483648;
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		int i_213_ = ((((Class387_Sub2) this).aShort8156 - ((Class387_Sub2) this).aShort8145) >> 1);
		int i_214_ = ((((Class387_Sub2) this).aShort8100 - ((Class387_Sub2) this).aShort8097) >> 1);
		int i_215_ = ((((Class387_Sub2) this).aShort8141 - ((Class387_Sub2) this).aShort8140) >> 1);
		int i_216_ = ((Class387_Sub2) this).aShort8145 + i_213_;
		int i_217_ = ((Class387_Sub2) this).aShort8097 + i_214_;
		int i_218_ = ((Class387_Sub2) this).aShort8140 + i_215_;
		int i_219_ = i_216_ - (i_213_ << i_207_);
		int i_220_ = i_217_ - (i_214_ << i_207_);
		int i_221_ = i_218_ - (i_215_ << i_207_);
		int i_222_ = i_216_ + (i_213_ << i_207_);
		int i_223_ = i_217_ + (i_214_ << i_207_);
		int i_224_ = i_218_ + (i_215_ << i_207_);
		anIntArray8103[0] = i_219_;
		anIntArray8154[0] = i_220_;
		anIntArray8155[0] = i_221_;
		anIntArray8103[1] = i_222_;
		anIntArray8154[1] = i_220_;
		anIntArray8155[1] = i_221_;
		anIntArray8103[2] = i_219_;
		anIntArray8154[2] = i_223_;
		anIntArray8155[2] = i_221_;
		anIntArray8103[3] = i_222_;
		anIntArray8154[3] = i_223_;
		anIntArray8155[3] = i_221_;
		anIntArray8103[4] = i_219_;
		anIntArray8154[4] = i_220_;
		anIntArray8155[4] = i_224_;
		anIntArray8103[5] = i_222_;
		anIntArray8154[5] = i_220_;
		anIntArray8155[5] = i_224_;
		anIntArray8103[6] = i_219_;
		anIntArray8154[6] = i_223_;
		anIntArray8155[6] = i_224_;
		anIntArray8103[7] = i_222_;
		anIntArray8154[7] = i_223_;
		anIntArray8155[7] = i_224_;
		for (int i_225_ = 0; i_225_ < 8; i_225_++) {
			int i_226_ = anIntArray8103[i_225_];
			int i_227_ = anIntArray8154[i_225_];
			int i_228_ = anIntArray8155[i_225_];
			float f = (class249.aFloatArray2631[2] * (float) i_226_ + class249.aFloatArray2631[6] * (float) i_227_ + class249.aFloatArray2631[10] * (float) i_228_ + class249.aFloatArray2631[14]);
			float f_229_ = (class249.aFloatArray2631[3] * (float) i_226_ + class249.aFloatArray2631[7] * (float) i_227_ + class249.aFloatArray2631[11] * (float) i_228_ + class249.aFloatArray2631[15]);
			if (f >= -f_229_) {
				float f_230_ = (class249.aFloatArray2631[0] * (float) i_226_ + class249.aFloatArray2631[4] * (float) i_227_ + class249.aFloatArray2631[8] * (float) i_228_ + class249.aFloatArray2631[12]);
				float f_231_ = (class249.aFloatArray2631[1] * (float) i_226_ + class249.aFloatArray2631[5] * (float) i_227_ + class249.aFloatArray2631[9] * (float) i_228_ + class249.aFloatArray2631[13]);
				int i_232_ = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8337) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338) * f_230_ / f_229_);
				int i_233_ = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8339) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8340) * f_231_ / f_229_);
				if (i_232_ < i_209_)
					i_209_ = i_232_;
				if (i_232_ > i_210_)
					i_210_ = i_232_;
				if (i_233_ < i_211_)
					i_211_ = i_233_;
				if (i_233_ > i_212_)
					i_212_ = i_233_;
				bool_208_ = true;
			}
		}
		if (bool_208_ && i > i_209_ && i < i_210_ && i_206_ > i_211_ && i_206_ < i_212_) {
			if (bool)
				return true;
			if ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anIntArray8291).length < ((Class387_Sub2) this).anInt8107) {
				((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anIntArray8291 = new int[((Class387_Sub2) this).anInt8107];
				((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anIntArray8427 = new int[((Class387_Sub2) this).anInt8107];
			}
			int[] is = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anIntArray8291);
			int[] is_234_ = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anIntArray8427);
			for (int i_235_ = 0; i_235_ < ((Class387_Sub2) this).anInt8130; i_235_++) {
				int i_236_ = ((Class387_Sub2) this).anIntArray8102[i_235_];
				int i_237_ = ((Class387_Sub2) this).anIntArray8110[i_235_];
				int i_238_ = ((Class387_Sub2) this).anIntArray8104[i_235_];
				float f = (class249.aFloatArray2631[2] * (float) i_236_ + class249.aFloatArray2631[6] * (float) i_237_ + class249.aFloatArray2631[10] * (float) i_238_ + class249.aFloatArray2631[14]);
				float f_239_ = (class249.aFloatArray2631[3] * (float) i_236_ + class249.aFloatArray2631[7] * (float) i_237_ + class249.aFloatArray2631[11] * (float) i_238_ + class249.aFloatArray2631[15]);
				if (f >= -f_239_) {
					float f_240_ = (class249.aFloatArray2631[0] * (float) i_236_ + class249.aFloatArray2631[4] * (float) i_237_ + class249.aFloatArray2631[8] * (float) i_238_ + class249.aFloatArray2631[12]);
					float f_241_ = (class249.aFloatArray2631[1] * (float) i_236_ + class249.aFloatArray2631[5] * (float) i_237_ + class249.aFloatArray2631[9] * (float) i_238_ + class249.aFloatArray2631[13]);
					int i_242_ = ((Class387_Sub2) this).anIntArray8143[i_235_];
					int i_243_ = ((Class387_Sub2) this).anIntArray8143[i_235_ + 1];
					for (int i_244_ = i_242_; i_244_ < i_243_; i_244_++) {
						int i_245_ = (((Class387_Sub2) this).aShortArray8144[i_244_] - 1);
						if (i_245_ == -1)
							break;
						is[i_245_] = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8337) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338 * f_240_ / f_239_));
						is_234_[i_245_] = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8339) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8340 * f_241_ / f_239_));
					}
				} else {
					int i_246_ = ((Class387_Sub2) this).anIntArray8143[i_235_];
					int i_247_ = ((Class387_Sub2) this).anIntArray8143[i_235_ + 1];
					for (int i_248_ = i_246_; i_248_ < i_247_; i_248_++) {
						int i_249_ = (((Class387_Sub2) this).aShortArray8144[i_248_] - 1);
						if (i_249_ == -1)
							break;
						is[((Class387_Sub2) this).aShortArray8144[i_248_] - 1] = -999999;
					}
				}
			}
			for (int i_250_ = 0; i_250_ < ((Class387_Sub2) this).anInt8089; i_250_++) {
				if ((is[((Class387_Sub2) this).aShortArray8119[i_250_]] != -999999) && (is[((Class387_Sub2) this).aShortArray8120[i_250_]] != -999999) && (is[((Class387_Sub2) this).aShortArray8121[i_250_]] != -999999) && method4521(i, i_206_, is_234_[(((Class387_Sub2) this).aShortArray8119[i_250_])], is_234_[(((Class387_Sub2) this).aShortArray8120[i_250_])], is_234_[(((Class387_Sub2) this).aShortArray8121[i_250_])], is[(((Class387_Sub2) this).aShortArray8119[i_250_])], is[(((Class387_Sub2) this).aShortArray8120[i_250_])], is[(((Class387_Sub2) this).aShortArray8121[i_250_])]))
					return true;
			}
		}
		return false;
	}

	public void bo(int i) {
		int i_251_ = Class257.anIntArray2683[i];
		int i_252_ = Class257.anIntArray2684[i];
		for (int i_253_ = 0; i_253_ < ((Class387_Sub2) this).anInt8130; i_253_++) {
			int i_254_ = ((((Class387_Sub2) this).anIntArray8104[i_253_] * i_251_ + ((Class387_Sub2) this).anIntArray8102[i_253_] * i_252_) >> 14);
			((Class387_Sub2) this).anIntArray8104[i_253_] = ((((Class387_Sub2) this).anIntArray8104[i_253_] * i_252_ - ((Class387_Sub2) this).anIntArray8102[i_253_] * i_251_) >> 14);
			((Class387_Sub2) this).anIntArray8102[i_253_] = i_254_;
		}
		for (int i_255_ = 0; i_255_ < ((Class387_Sub2) this).anInt8107; i_255_++) {
			int i_256_ = ((((Class387_Sub2) this).aShortArray8095[i_255_] * i_251_ + ((Class387_Sub2) this).aShortArray8108[i_255_] * i_252_) >> 14);
			((Class387_Sub2) this).aShortArray8095[i_255_] = (short) (((((Class387_Sub2) this).aShortArray8095[i_255_] * i_252_) - (((Class387_Sub2) this).aShortArray8108[i_255_] * i_251_)) >> 14);
			((Class387_Sub2) this).aShortArray8108[i_255_] = (short) i_256_;
		}
		if (((Class387_Sub2) this).aClass44_8127 == null && ((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass44_8127 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public boolean i() {
		return ((Class387_Sub2) this).aBoolean8098;
	}

	public boolean u() {
		return ((Class387_Sub2) this).aBoolean8153;
	}

	public void method4481(Class247 class247, int i, boolean bool) {
		if (((Class387_Sub2) this).aShortArray8106 != null) {
			Class247 class247_257_ = class247;
			if (bool) {
				class247_257_ = ((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aClass247_8360;
				class247_257_.method2458(class247);
			}
			float[] fs = new float[3];
			for (int i_258_ = 0; i_258_ < ((Class387_Sub2) this).anInt8130; i_258_++) {
				if ((i & ((Class387_Sub2) this).aShortArray8106[i_258_]) != 0) {
					class247_257_.method2465((float) ((Class387_Sub2) this).anIntArray8102[i_258_], (float) ((Class387_Sub2) this).anIntArray8110[i_258_], (float) ((Class387_Sub2) this).anIntArray8104[i_258_], fs);
					((Class387_Sub2) this).anIntArray8102[i_258_] = (int) fs[0];
					((Class387_Sub2) this).anIntArray8110[i_258_] = (int) fs[1];
					((Class387_Sub2) this).anIntArray8104[i_258_] = (int) fs[2];
				}
			}
		}
	}

	public boolean el() {
		return ((Class387_Sub2) this).aBoolean8098;
	}

	boolean ea() {
		if (((Class387_Sub2) this).anIntArrayArray8113 == null)
			return false;
		for (int i = 0; i < ((Class387_Sub2) this).anInt8115; i++) {
			((Class387_Sub2) this).anIntArray8102[i] <<= 4;
			((Class387_Sub2) this).anIntArray8110[i] <<= 4;
			((Class387_Sub2) this).anIntArray8104[i] <<= 4;
		}
		anInt8101 = 0;
		anInt8111 = 0;
		anInt8158 = 0;
		return true;
	}

	void e(int i, int[] is, int i_259_, int i_260_, int i_261_, boolean bool, int i_262_, int[] is_263_) {
		int i_264_ = is.length;
		if (i == 0) {
			i_259_ <<= 4;
			i_260_ <<= 4;
			i_261_ <<= 4;
			int i_265_ = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (int i_266_ = 0; i_266_ < i_264_; i_266_++) {
				int i_267_ = is[i_266_];
				if (i_267_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_268_ = ((Class387_Sub2) this).anIntArrayArray8113[i_267_];
					for (int i_269_ = 0; i_269_ < is_268_.length; i_269_++) {
						int i_270_ = is_268_[i_269_];
						if (((Class387_Sub2) this).aShortArray8106 == null || (i_262_ & (((Class387_Sub2) this).aShortArray8106[i_270_])) != 0) {
							anInt8101 += (((Class387_Sub2) this).anIntArray8102[i_270_]);
							anInt8111 += (((Class387_Sub2) this).anIntArray8110[i_270_]);
							anInt8158 += (((Class387_Sub2) this).anIntArray8104[i_270_]);
							i_265_++;
						}
					}
				}
			}
			if (i_265_ > 0) {
				anInt8101 = anInt8101 / i_265_ + i_259_;
				anInt8111 = anInt8111 / i_265_ + i_260_;
				anInt8158 = anInt8158 / i_265_ + i_261_;
				aBoolean8159 = true;
			} else {
				anInt8101 = i_259_;
				anInt8111 = i_260_;
				anInt8158 = i_261_;
			}
		} else if (i == 1) {
			if (is_263_ != null) {
				int i_271_ = ((is_263_[0] * i_259_ + is_263_[1] * i_260_ + is_263_[2] * i_261_ + 8192) >> 14);
				int i_272_ = ((is_263_[3] * i_259_ + is_263_[4] * i_260_ + is_263_[5] * i_261_ + 8192) >> 14);
				int i_273_ = ((is_263_[6] * i_259_ + is_263_[7] * i_260_ + is_263_[8] * i_261_ + 8192) >> 14);
				i_259_ = i_271_;
				i_260_ = i_272_;
				i_261_ = i_273_;
			}
			i_259_ <<= 4;
			i_260_ <<= 4;
			i_261_ <<= 4;
			for (int i_274_ = 0; i_274_ < i_264_; i_274_++) {
				int i_275_ = is[i_274_];
				if (i_275_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_276_ = ((Class387_Sub2) this).anIntArrayArray8113[i_275_];
					for (int i_277_ = 0; i_277_ < is_276_.length; i_277_++) {
						int i_278_ = is_276_[i_277_];
						if (((Class387_Sub2) this).aShortArray8106 == null || (i_262_ & (((Class387_Sub2) this).aShortArray8106[i_278_])) != 0) {
							((Class387_Sub2) this).anIntArray8102[i_278_] += i_259_;
							((Class387_Sub2) this).anIntArray8110[i_278_] += i_260_;
							((Class387_Sub2) this).anIntArray8104[i_278_] += i_261_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_263_ != null) {
				int i_279_ = is_263_[9] << 4;
				int i_280_ = is_263_[10] << 4;
				int i_281_ = is_263_[11] << 4;
				int i_282_ = is_263_[12] << 4;
				int i_283_ = is_263_[13] << 4;
				int i_284_ = is_263_[14] << 4;
				if (aBoolean8159) {
					int i_285_ = ((is_263_[0] * anInt8101 + is_263_[3] * anInt8111 + is_263_[6] * anInt8158 + 8192) >> 14);
					int i_286_ = ((is_263_[1] * anInt8101 + is_263_[4] * anInt8111 + is_263_[7] * anInt8158 + 8192) >> 14);
					int i_287_ = ((is_263_[2] * anInt8101 + is_263_[5] * anInt8111 + is_263_[8] * anInt8158 + 8192) >> 14);
					i_285_ += i_282_;
					i_286_ += i_283_;
					i_287_ += i_284_;
					anInt8101 = i_285_;
					anInt8111 = i_286_;
					anInt8158 = i_287_;
					aBoolean8159 = false;
				}
				int[] is_288_ = new int[9];
				int i_289_ = Class257.anIntArray2684[i_259_];
				int i_290_ = Class257.anIntArray2683[i_259_];
				int i_291_ = Class257.anIntArray2684[i_260_];
				int i_292_ = Class257.anIntArray2683[i_260_];
				int i_293_ = Class257.anIntArray2684[i_261_];
				int i_294_ = Class257.anIntArray2683[i_261_];
				int i_295_ = i_290_ * i_293_ + 8192 >> 14;
				int i_296_ = i_290_ * i_294_ + 8192 >> 14;
				is_288_[0] = i_291_ * i_293_ + i_292_ * i_296_ + 8192 >> 14;
				is_288_[1] = -i_291_ * i_294_ + i_292_ * i_295_ + 8192 >> 14;
				is_288_[2] = i_292_ * i_289_ + 8192 >> 14;
				is_288_[3] = i_289_ * i_294_ + 8192 >> 14;
				is_288_[4] = i_289_ * i_293_ + 8192 >> 14;
				is_288_[5] = -i_290_;
				is_288_[6] = -i_292_ * i_293_ + i_291_ * i_296_ + 8192 >> 14;
				is_288_[7] = i_292_ * i_294_ + i_291_ * i_295_ + 8192 >> 14;
				is_288_[8] = i_291_ * i_289_ + 8192 >> 14;
				int i_297_ = (is_288_[0] * -anInt8101 + is_288_[1] * -anInt8111 + is_288_[2] * -anInt8158 + 8192) >> 14;
				int i_298_ = (is_288_[3] * -anInt8101 + is_288_[4] * -anInt8111 + is_288_[5] * -anInt8158 + 8192) >> 14;
				int i_299_ = (is_288_[6] * -anInt8101 + is_288_[7] * -anInt8111 + is_288_[8] * -anInt8158 + 8192) >> 14;
				int i_300_ = i_297_ + anInt8101;
				int i_301_ = i_298_ + anInt8111;
				int i_302_ = i_299_ + anInt8158;
				int[] is_303_ = new int[9];
				for (int i_304_ = 0; i_304_ < 3; i_304_++) {
					for (int i_305_ = 0; i_305_ < 3; i_305_++) {
						int i_306_ = 0;
						for (int i_307_ = 0; i_307_ < 3; i_307_++)
							i_306_ += (is_288_[i_304_ * 3 + i_307_] * is_263_[i_305_ * 3 + i_307_]);
						is_303_[i_304_ * 3 + i_305_] = i_306_ + 8192 >> 14;
					}
				}
				int i_308_ = ((is_288_[0] * i_282_ + is_288_[1] * i_283_ + is_288_[2] * i_284_ + 8192) >> 14);
				int i_309_ = ((is_288_[3] * i_282_ + is_288_[4] * i_283_ + is_288_[5] * i_284_ + 8192) >> 14);
				int i_310_ = ((is_288_[6] * i_282_ + is_288_[7] * i_283_ + is_288_[8] * i_284_ + 8192) >> 14);
				i_308_ += i_300_;
				i_309_ += i_301_;
				i_310_ += i_302_;
				int[] is_311_ = new int[9];
				for (int i_312_ = 0; i_312_ < 3; i_312_++) {
					for (int i_313_ = 0; i_313_ < 3; i_313_++) {
						int i_314_ = 0;
						for (int i_315_ = 0; i_315_ < 3; i_315_++)
							i_314_ += (is_263_[i_312_ * 3 + i_315_] * is_303_[i_313_ + i_315_ * 3]);
						is_311_[i_312_ * 3 + i_313_] = i_314_ + 8192 >> 14;
					}
				}
				int i_316_ = ((is_263_[0] * i_308_ + is_263_[1] * i_309_ + is_263_[2] * i_310_ + 8192) >> 14);
				int i_317_ = ((is_263_[3] * i_308_ + is_263_[4] * i_309_ + is_263_[5] * i_310_ + 8192) >> 14);
				int i_318_ = ((is_263_[6] * i_308_ + is_263_[7] * i_309_ + is_263_[8] * i_310_ + 8192) >> 14);
				i_316_ += i_279_;
				i_317_ += i_280_;
				i_318_ += i_281_;
				for (int i_319_ = 0; i_319_ < i_264_; i_319_++) {
					int i_320_ = is[i_319_];
					if (i_320_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_321_ = (((Class387_Sub2) this).anIntArrayArray8113[i_320_]);
						for (int i_322_ = 0; i_322_ < is_321_.length; i_322_++) {
							int i_323_ = is_321_[i_322_];
							if (((Class387_Sub2) this).aShortArray8106 == null || ((i_262_ & (((Class387_Sub2) this).aShortArray8106[i_323_])) != 0)) {
								int i_324_ = (is_311_[0] * (((Class387_Sub2) this).anIntArray8102[i_323_]) + is_311_[1] * (((Class387_Sub2) this).anIntArray8110[i_323_]) + is_311_[2] * (((Class387_Sub2) this).anIntArray8104[i_323_]) + 8192) >> 14;
								int i_325_ = (is_311_[3] * (((Class387_Sub2) this).anIntArray8102[i_323_]) + is_311_[4] * (((Class387_Sub2) this).anIntArray8110[i_323_]) + is_311_[5] * (((Class387_Sub2) this).anIntArray8104[i_323_]) + 8192) >> 14;
								int i_326_ = (is_311_[6] * (((Class387_Sub2) this).anIntArray8102[i_323_]) + is_311_[7] * (((Class387_Sub2) this).anIntArray8110[i_323_]) + is_311_[8] * (((Class387_Sub2) this).anIntArray8104[i_323_]) + 8192) >> 14;
								i_324_ += i_316_;
								i_325_ += i_317_;
								i_326_ += i_318_;
								((Class387_Sub2) this).anIntArray8102[i_323_] = i_324_;
								((Class387_Sub2) this).anIntArray8110[i_323_] = i_325_;
								((Class387_Sub2) this).anIntArray8104[i_323_] = i_326_;
							}
						}
					}
				}
			} else {
				for (int i_327_ = 0; i_327_ < i_264_; i_327_++) {
					int i_328_ = is[i_327_];
					if (i_328_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_329_ = (((Class387_Sub2) this).anIntArrayArray8113[i_328_]);
						for (int i_330_ = 0; i_330_ < is_329_.length; i_330_++) {
							int i_331_ = is_329_[i_330_];
							if (((Class387_Sub2) this).aShortArray8106 == null || ((i_262_ & (((Class387_Sub2) this).aShortArray8106[i_331_])) != 0)) {
								((Class387_Sub2) this).anIntArray8102[i_331_] -= anInt8101;
								((Class387_Sub2) this).anIntArray8110[i_331_] -= anInt8111;
								((Class387_Sub2) this).anIntArray8104[i_331_] -= anInt8158;
								if (i_261_ != 0) {
									int i_332_ = Class257.anIntArray2683[i_261_];
									int i_333_ = Class257.anIntArray2684[i_261_];
									int i_334_ = ((((Class387_Sub2) this).anIntArray8110[i_331_]) * i_332_ + (((Class387_Sub2) this).anIntArray8102[i_331_]) * i_333_ + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8110[i_331_] = ((((Class387_Sub2) this).anIntArray8110[i_331_]) * i_333_ - (((Class387_Sub2) this).anIntArray8102[i_331_]) * i_332_ + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8102[i_331_] = i_334_;
								}
								if (i_259_ != 0) {
									int i_335_ = Class257.anIntArray2683[i_259_];
									int i_336_ = Class257.anIntArray2684[i_259_];
									int i_337_ = ((((Class387_Sub2) this).anIntArray8110[i_331_]) * i_336_ - (((Class387_Sub2) this).anIntArray8104[i_331_]) * i_335_ + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8104[i_331_] = ((((Class387_Sub2) this).anIntArray8110[i_331_]) * i_335_ + (((Class387_Sub2) this).anIntArray8104[i_331_]) * i_336_ + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8110[i_331_] = i_337_;
								}
								if (i_260_ != 0) {
									int i_338_ = Class257.anIntArray2683[i_260_];
									int i_339_ = Class257.anIntArray2684[i_260_];
									int i_340_ = ((((Class387_Sub2) this).anIntArray8104[i_331_]) * i_338_ + (((Class387_Sub2) this).anIntArray8102[i_331_]) * i_339_ + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8104[i_331_] = ((((Class387_Sub2) this).anIntArray8104[i_331_]) * i_339_ - (((Class387_Sub2) this).anIntArray8102[i_331_]) * i_338_ + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8102[i_331_] = i_340_;
								}
								((Class387_Sub2) this).anIntArray8102[i_331_] += anInt8101;
								((Class387_Sub2) this).anIntArray8110[i_331_] += anInt8111;
								((Class387_Sub2) this).anIntArray8104[i_331_] += anInt8158;
							}
						}
					}
				}
				if (bool) {
					for (int i_341_ = 0; i_341_ < i_264_; i_341_++) {
						int i_342_ = is[i_341_];
						if (i_342_ < (((Class387_Sub2) this).anIntArrayArray8113).length) {
							int[] is_343_ = (((Class387_Sub2) this).anIntArrayArray8113[i_342_]);
							for (int i_344_ = 0; i_344_ < is_343_.length; i_344_++) {
								int i_345_ = is_343_[i_344_];
								if ((((Class387_Sub2) this).aShortArray8106 == null) || ((i_262_ & (((Class387_Sub2) this).aShortArray8106[i_345_])) != 0)) {
									int i_346_ = (((Class387_Sub2) this).anIntArray8143[i_345_]);
									int i_347_ = (((Class387_Sub2) this).anIntArray8143[i_345_ + 1]);
									for (int i_348_ = i_346_; i_348_ < i_347_; i_348_++) {
										int i_349_ = ((((Class387_Sub2) this).aShortArray8144[i_348_]) - 1);
										if (i_349_ == -1)
											break;
										if (i_261_ != 0) {
											int i_350_ = (Class257.anIntArray2683[i_261_]);
											int i_351_ = (Class257.anIntArray2684[i_261_]);
											int i_352_ = ((((((Class387_Sub2) this).aShortArray8109[i_349_]) * i_350_) + (((Class387_Sub2) this).aShortArray8108[i_349_]) * i_351_ + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8109[i_349_] = (short) (((((Class387_Sub2) this).aShortArray8109[i_349_]) * i_351_ - (((Class387_Sub2) this).aShortArray8108[i_349_]) * i_350_ + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8108[i_349_] = (short) i_352_;
										}
										if (i_259_ != 0) {
											int i_353_ = (Class257.anIntArray2683[i_259_]);
											int i_354_ = (Class257.anIntArray2684[i_259_]);
											int i_355_ = ((((((Class387_Sub2) this).aShortArray8109[i_349_]) * i_354_) - (((Class387_Sub2) this).aShortArray8095[i_349_]) * i_353_ + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8095[i_349_] = (short) (((((Class387_Sub2) this).aShortArray8109[i_349_]) * i_353_ + (((Class387_Sub2) this).aShortArray8095[i_349_]) * i_354_ + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8109[i_349_] = (short) i_355_;
										}
										if (i_260_ != 0) {
											int i_356_ = (Class257.anIntArray2683[i_260_]);
											int i_357_ = (Class257.anIntArray2684[i_260_]);
											int i_358_ = ((((((Class387_Sub2) this).aShortArray8095[i_349_]) * i_356_) + (((Class387_Sub2) this).aShortArray8108[i_349_]) * i_357_ + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8095[i_349_] = (short) (((((Class387_Sub2) this).aShortArray8095[i_349_]) * i_357_ - (((Class387_Sub2) this).aShortArray8108[i_349_]) * i_356_ + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8108[i_349_] = (short) i_358_;
										}
									}
								}
							}
						}
					}
					if (((Class387_Sub2) this).aClass44_8127 == null && ((Class387_Sub2) this).aClass44_8105 != null)
						((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
					if (((Class387_Sub2) this).aClass44_8127 != null)
						((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = null;
				}
			}
		} else if (i == 3) {
			if (is_263_ != null) {
				int i_359_ = is_263_[9] << 4;
				int i_360_ = is_263_[10] << 4;
				int i_361_ = is_263_[11] << 4;
				int i_362_ = is_263_[12] << 4;
				int i_363_ = is_263_[13] << 4;
				int i_364_ = is_263_[14] << 4;
				if (aBoolean8159) {
					int i_365_ = ((is_263_[0] * anInt8101 + is_263_[3] * anInt8111 + is_263_[6] * anInt8158 + 8192) >> 14);
					int i_366_ = ((is_263_[1] * anInt8101 + is_263_[4] * anInt8111 + is_263_[7] * anInt8158 + 8192) >> 14);
					int i_367_ = ((is_263_[2] * anInt8101 + is_263_[5] * anInt8111 + is_263_[8] * anInt8158 + 8192) >> 14);
					i_365_ += i_362_;
					i_366_ += i_363_;
					i_367_ += i_364_;
					anInt8101 = i_365_;
					anInt8111 = i_366_;
					anInt8158 = i_367_;
					aBoolean8159 = false;
				}
				int i_368_ = i_259_ << 15 >> 7;
				int i_369_ = i_260_ << 15 >> 7;
				int i_370_ = i_261_ << 15 >> 7;
				int i_371_ = i_368_ * -anInt8101 + 8192 >> 14;
				int i_372_ = i_369_ * -anInt8111 + 8192 >> 14;
				int i_373_ = i_370_ * -anInt8158 + 8192 >> 14;
				int i_374_ = i_371_ + anInt8101;
				int i_375_ = i_372_ + anInt8111;
				int i_376_ = i_373_ + anInt8158;
				int[] is_377_ = new int[9];
				is_377_[0] = i_368_ * is_263_[0] + 8192 >> 14;
				is_377_[1] = i_368_ * is_263_[3] + 8192 >> 14;
				is_377_[2] = i_368_ * is_263_[6] + 8192 >> 14;
				is_377_[3] = i_369_ * is_263_[1] + 8192 >> 14;
				is_377_[4] = i_369_ * is_263_[4] + 8192 >> 14;
				is_377_[5] = i_369_ * is_263_[7] + 8192 >> 14;
				is_377_[6] = i_370_ * is_263_[2] + 8192 >> 14;
				is_377_[7] = i_370_ * is_263_[5] + 8192 >> 14;
				is_377_[8] = i_370_ * is_263_[8] + 8192 >> 14;
				int i_378_ = i_368_ * i_362_ + 8192 >> 14;
				int i_379_ = i_369_ * i_363_ + 8192 >> 14;
				int i_380_ = i_370_ * i_364_ + 8192 >> 14;
				i_378_ += i_374_;
				i_379_ += i_375_;
				i_380_ += i_376_;
				int[] is_381_ = new int[9];
				for (int i_382_ = 0; i_382_ < 3; i_382_++) {
					for (int i_383_ = 0; i_383_ < 3; i_383_++) {
						int i_384_ = 0;
						for (int i_385_ = 0; i_385_ < 3; i_385_++)
							i_384_ += (is_263_[i_382_ * 3 + i_385_] * is_377_[i_383_ + i_385_ * 3]);
						is_381_[i_382_ * 3 + i_383_] = i_384_ + 8192 >> 14;
					}
				}
				int i_386_ = ((is_263_[0] * i_378_ + is_263_[1] * i_379_ + is_263_[2] * i_380_ + 8192) >> 14);
				int i_387_ = ((is_263_[3] * i_378_ + is_263_[4] * i_379_ + is_263_[5] * i_380_ + 8192) >> 14);
				int i_388_ = ((is_263_[6] * i_378_ + is_263_[7] * i_379_ + is_263_[8] * i_380_ + 8192) >> 14);
				i_386_ += i_359_;
				i_387_ += i_360_;
				i_388_ += i_361_;
				for (int i_389_ = 0; i_389_ < i_264_; i_389_++) {
					int i_390_ = is[i_389_];
					if (i_390_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_391_ = (((Class387_Sub2) this).anIntArrayArray8113[i_390_]);
						for (int i_392_ = 0; i_392_ < is_391_.length; i_392_++) {
							int i_393_ = is_391_[i_392_];
							if (((Class387_Sub2) this).aShortArray8106 == null || ((i_262_ & (((Class387_Sub2) this).aShortArray8106[i_393_])) != 0)) {
								int i_394_ = (is_381_[0] * (((Class387_Sub2) this).anIntArray8102[i_393_]) + is_381_[1] * (((Class387_Sub2) this).anIntArray8110[i_393_]) + is_381_[2] * (((Class387_Sub2) this).anIntArray8104[i_393_]) + 8192) >> 14;
								int i_395_ = (is_381_[3] * (((Class387_Sub2) this).anIntArray8102[i_393_]) + is_381_[4] * (((Class387_Sub2) this).anIntArray8110[i_393_]) + is_381_[5] * (((Class387_Sub2) this).anIntArray8104[i_393_]) + 8192) >> 14;
								int i_396_ = (is_381_[6] * (((Class387_Sub2) this).anIntArray8102[i_393_]) + is_381_[7] * (((Class387_Sub2) this).anIntArray8110[i_393_]) + is_381_[8] * (((Class387_Sub2) this).anIntArray8104[i_393_]) + 8192) >> 14;
								i_394_ += i_386_;
								i_395_ += i_387_;
								i_396_ += i_388_;
								((Class387_Sub2) this).anIntArray8102[i_393_] = i_394_;
								((Class387_Sub2) this).anIntArray8110[i_393_] = i_395_;
								((Class387_Sub2) this).anIntArray8104[i_393_] = i_396_;
							}
						}
					}
				}
			} else {
				for (int i_397_ = 0; i_397_ < i_264_; i_397_++) {
					int i_398_ = is[i_397_];
					if (i_398_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_399_ = (((Class387_Sub2) this).anIntArrayArray8113[i_398_]);
						for (int i_400_ = 0; i_400_ < is_399_.length; i_400_++) {
							int i_401_ = is_399_[i_400_];
							if (((Class387_Sub2) this).aShortArray8106 == null || ((i_262_ & (((Class387_Sub2) this).aShortArray8106[i_401_])) != 0)) {
								((Class387_Sub2) this).anIntArray8102[i_401_] -= anInt8101;
								((Class387_Sub2) this).anIntArray8110[i_401_] -= anInt8111;
								((Class387_Sub2) this).anIntArray8104[i_401_] -= anInt8158;
								((Class387_Sub2) this).anIntArray8102[i_401_] = (((Class387_Sub2) this).anIntArray8102[i_401_]) * i_259_ >> 7;
								((Class387_Sub2) this).anIntArray8110[i_401_] = (((Class387_Sub2) this).anIntArray8110[i_401_]) * i_260_ >> 7;
								((Class387_Sub2) this).anIntArray8104[i_401_] = (((Class387_Sub2) this).anIntArray8104[i_401_]) * i_261_ >> 7;
								((Class387_Sub2) this).anIntArray8102[i_401_] += anInt8101;
								((Class387_Sub2) this).anIntArray8110[i_401_] += anInt8111;
								((Class387_Sub2) this).anIntArray8104[i_401_] += anInt8158;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub2) this).anIntArrayArray8123 != null) {
				for (int i_402_ = 0; i_402_ < i_264_; i_402_++) {
					int i_403_ = is[i_402_];
					if (i_403_ < ((Class387_Sub2) this).anIntArrayArray8123.length) {
						int[] is_404_ = (((Class387_Sub2) this).anIntArrayArray8123[i_403_]);
						for (int i_405_ = 0; i_405_ < is_404_.length; i_405_++) {
							int i_406_ = is_404_[i_405_];
							if (((Class387_Sub2) this).aShortArray8124 == null || ((i_262_ & (((Class387_Sub2) this).aShortArray8124[i_406_])) != 0)) {
								int i_407_ = (((((Class387_Sub2) this).aByteArray8136[i_406_]) & 0xff) + i_259_ * 8);
								if (i_407_ < 0)
									i_407_ = 0;
								else if (i_407_ > 255)
									i_407_ = 255;
								((Class387_Sub2) this).aByteArray8136[i_406_] = (byte) i_407_;
								if (((Class387_Sub2) this).aClass44_8105 != null)
									((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
							}
						}
					}
				}
				if (((Class387_Sub2) this).aClass52Array8148 != null) {
					for (int i_408_ = 0; i_408_ < ((Class387_Sub2) this).anInt8147; i_408_++) {
						Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_408_];
						Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_408_];
						((Class40) class40).anInt428 = (((Class40) class40).anInt428 & 0xffffff | 255 - ((((Class387_Sub2) this).aByteArray8136[((Class52) class52).modelColorIndex]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub2) this).anIntArrayArray8123 != null) {
				for (int i_409_ = 0; i_409_ < i_264_; i_409_++) {
					int i_410_ = is[i_409_];
					if (i_410_ < ((Class387_Sub2) this).anIntArrayArray8123.length) {
						int[] is_411_ = (((Class387_Sub2) this).anIntArrayArray8123[i_410_]);
						for (int i_412_ = 0; i_412_ < is_411_.length; i_412_++) {
							int i_413_ = is_411_[i_412_];
							if (((Class387_Sub2) this).aShortArray8124 == null || ((i_262_ & (((Class387_Sub2) this).aShortArray8124[i_413_])) != 0)) {
								int i_414_ = ((((Class387_Sub2) this).modelColors[i_413_]) & 0xffff);
								int i_415_ = i_414_ >> 10 & 0x3f;
								int i_416_ = i_414_ >> 7 & 0x7;
								int i_417_ = i_414_ & 0x7f;
								i_415_ = i_415_ + i_259_ & 0x3f;
								i_416_ += i_260_ / 4;
								if (i_416_ < 0)
									i_416_ = 0;
								else if (i_416_ > 7)
									i_416_ = 7;
								i_417_ += i_261_;
								if (i_417_ < 0)
									i_417_ = 0;
								else if (i_417_ > 127)
									i_417_ = 127;
								((Class387_Sub2) this).modelColors[i_413_] = (short) (i_415_ << 10 | i_416_ << 7 | i_417_);
								if (((Class387_Sub2) this).aClass44_8105 != null)
									((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
							}
						}
					}
				}
				if (((Class387_Sub2) this).aClass52Array8148 != null) {
					for (int i_418_ = 0; i_418_ < ((Class387_Sub2) this).anInt8147; i_418_++) {
						Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_418_];
						Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_418_];
						((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_419_ = 0; i_419_ < i_264_; i_419_++) {
					int i_420_ = is[i_419_];
					if (i_420_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_421_ = (((Class387_Sub2) this).anIntArrayArray8150[i_420_]);
						for (int i_422_ = 0; i_422_ < is_421_.length; i_422_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_421_[i_422_]]);
							((Class40) class40).anInt425 += i_259_;
							((Class40) class40).anInt427 += i_260_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_423_ = 0; i_423_ < i_264_; i_423_++) {
					int i_424_ = is[i_423_];
					if (i_424_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_425_ = (((Class387_Sub2) this).anIntArrayArray8150[i_424_]);
						for (int i_426_ = 0; i_426_ < is_425_.length; i_426_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_425_[i_426_]]);
							((Class40) class40).anInt429 = ((Class40) class40).anInt429 * i_259_ >> 7;
							((Class40) class40).anInt426 = ((Class40) class40).anInt426 * i_260_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_427_ = 0; i_427_ < i_264_; i_427_++) {
					int i_428_ = is[i_427_];
					if (i_428_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_429_ = (((Class387_Sub2) this).anIntArrayArray8150[i_428_]);
						for (int i_430_ = 0; i_430_ < is_429_.length; i_430_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_429_[i_430_]]);
							((Class40) class40).anInt424 = (((Class40) class40).anInt424 + i_259_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void w(int i, int i_431_, int i_432_, int i_433_) {
		if (i == 0) {
			int i_434_ = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (int i_435_ = 0; i_435_ < ((Class387_Sub2) this).anInt8130; i_435_++) {
				anInt8101 += ((Class387_Sub2) this).anIntArray8102[i_435_];
				anInt8111 += ((Class387_Sub2) this).anIntArray8110[i_435_];
				anInt8158 += ((Class387_Sub2) this).anIntArray8104[i_435_];
				i_434_++;
			}
			if (i_434_ > 0) {
				anInt8101 = anInt8101 / i_434_ + i_431_;
				anInt8111 = anInt8111 / i_434_ + i_432_;
				anInt8158 = anInt8158 / i_434_ + i_433_;
			} else {
				anInt8101 = i_431_;
				anInt8111 = i_432_;
				anInt8158 = i_433_;
			}
		} else if (i == 1) {
			for (int i_436_ = 0; i_436_ < ((Class387_Sub2) this).anInt8130; i_436_++) {
				((Class387_Sub2) this).anIntArray8102[i_436_] += i_431_;
				((Class387_Sub2) this).anIntArray8110[i_436_] += i_432_;
				((Class387_Sub2) this).anIntArray8104[i_436_] += i_433_;
			}
		} else if (i == 2) {
			for (int i_437_ = 0; i_437_ < ((Class387_Sub2) this).anInt8130; i_437_++) {
				((Class387_Sub2) this).anIntArray8102[i_437_] -= anInt8101;
				((Class387_Sub2) this).anIntArray8110[i_437_] -= anInt8111;
				((Class387_Sub2) this).anIntArray8104[i_437_] -= anInt8158;
				if (i_433_ != 0) {
					int i_438_ = Class257.anIntArray2683[i_433_];
					int i_439_ = Class257.anIntArray2684[i_433_];
					int i_440_ = (((((Class387_Sub2) this).anIntArray8110[i_437_] * i_438_) + (((Class387_Sub2) this).anIntArray8102[i_437_] * i_439_) + 16383) >> 14);
					((Class387_Sub2) this).anIntArray8110[i_437_] = ((((Class387_Sub2) this).anIntArray8110[i_437_] * i_439_) - (((Class387_Sub2) this).anIntArray8102[i_437_] * i_438_) + 16383) >> 14;
					((Class387_Sub2) this).anIntArray8102[i_437_] = i_440_;
				}
				if (i_431_ != 0) {
					int i_441_ = Class257.anIntArray2683[i_431_];
					int i_442_ = Class257.anIntArray2684[i_431_];
					int i_443_ = (((((Class387_Sub2) this).anIntArray8110[i_437_] * i_442_) - (((Class387_Sub2) this).anIntArray8104[i_437_] * i_441_) + 16383) >> 14);
					((Class387_Sub2) this).anIntArray8104[i_437_] = ((((Class387_Sub2) this).anIntArray8110[i_437_] * i_441_) + (((Class387_Sub2) this).anIntArray8104[i_437_] * i_442_) + 16383) >> 14;
					((Class387_Sub2) this).anIntArray8110[i_437_] = i_443_;
				}
				if (i_432_ != 0) {
					int i_444_ = Class257.anIntArray2683[i_432_];
					int i_445_ = Class257.anIntArray2684[i_432_];
					int i_446_ = (((((Class387_Sub2) this).anIntArray8104[i_437_] * i_444_) + (((Class387_Sub2) this).anIntArray8102[i_437_] * i_445_) + 16383) >> 14);
					((Class387_Sub2) this).anIntArray8104[i_437_] = ((((Class387_Sub2) this).anIntArray8104[i_437_] * i_445_) - (((Class387_Sub2) this).anIntArray8102[i_437_] * i_444_) + 16383) >> 14;
					((Class387_Sub2) this).anIntArray8102[i_437_] = i_446_;
				}
				((Class387_Sub2) this).anIntArray8102[i_437_] += anInt8101;
				((Class387_Sub2) this).anIntArray8110[i_437_] += anInt8111;
				((Class387_Sub2) this).anIntArray8104[i_437_] += anInt8158;
			}
		} else if (i == 3) {
			for (int i_447_ = 0; i_447_ < ((Class387_Sub2) this).anInt8130; i_447_++) {
				((Class387_Sub2) this).anIntArray8102[i_447_] -= anInt8101;
				((Class387_Sub2) this).anIntArray8110[i_447_] -= anInt8111;
				((Class387_Sub2) this).anIntArray8104[i_447_] -= anInt8158;
				((Class387_Sub2) this).anIntArray8102[i_447_] = (((Class387_Sub2) this).anIntArray8102[i_447_] * i_431_ / 128);
				((Class387_Sub2) this).anIntArray8110[i_447_] = (((Class387_Sub2) this).anIntArray8110[i_447_] * i_432_ / 128);
				((Class387_Sub2) this).anIntArray8104[i_447_] = (((Class387_Sub2) this).anIntArray8104[i_447_] * i_433_ / 128);
				((Class387_Sub2) this).anIntArray8102[i_447_] += anInt8101;
				((Class387_Sub2) this).anIntArray8110[i_447_] += anInt8111;
				((Class387_Sub2) this).anIntArray8104[i_447_] += anInt8158;
			}
		} else if (i == 5) {
			for (int i_448_ = 0; i_448_ < ((Class387_Sub2) this).anInt8089; i_448_++) {
				int i_449_ = ((((Class387_Sub2) this).aByteArray8136[i_448_] & 0xff) + i_431_ * 8);
				if (i_449_ < 0)
					i_449_ = 0;
				else if (i_449_ > 255)
					i_449_ = 255;
				((Class387_Sub2) this).aByteArray8136[i_448_] = (byte) i_449_;
			}
			if (((Class387_Sub2) this).aClass44_8105 != null)
				((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
			if (((Class387_Sub2) this).aClass52Array8148 != null) {
				for (int i_450_ = 0; i_450_ < ((Class387_Sub2) this).anInt8147; i_450_++) {
					Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_450_];
					Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_450_];
					((Class40) class40).anInt428 = (((Class40) class40).anInt428 & 0xffffff | 255 - ((((Class387_Sub2) this).aByteArray8136[((Class52) class52).modelColorIndex]) & 0xff) << 24);
				}
			}
		} else if (i == 7) {
			for (int i_451_ = 0; i_451_ < ((Class387_Sub2) this).anInt8089; i_451_++) {
				int i_452_ = ((Class387_Sub2) this).modelColors[i_451_] & 0xffff;
				int i_453_ = i_452_ >> 10 & 0x3f;
				int i_454_ = i_452_ >> 7 & 0x7;
				int i_455_ = i_452_ & 0x7f;
				i_453_ = i_453_ + i_431_ & 0x3f;
				i_454_ += i_432_ / 4;
				if (i_454_ < 0)
					i_454_ = 0;
				else if (i_454_ > 7)
					i_454_ = 7;
				i_455_ += i_433_;
				if (i_455_ < 0)
					i_455_ = 0;
				else if (i_455_ > 127)
					i_455_ = 127;
				((Class387_Sub2) this).modelColors[i_451_] = (short) (i_453_ << 10 | i_454_ << 7 | i_455_);
			}
			if (((Class387_Sub2) this).aClass44_8105 != null)
				((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
			if (((Class387_Sub2) this).aClass52Array8148 != null) {
				for (int i_456_ = 0; i_456_ < ((Class387_Sub2) this).anInt8147; i_456_++) {
					Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_456_];
					Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_456_];
					((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_457_ = 0; i_457_ < ((Class387_Sub2) this).anInt8147; i_457_++) {
				Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_457_];
				((Class40) class40).anInt425 += i_431_;
				((Class40) class40).anInt427 += i_432_;
			}
		} else if (i == 10) {
			for (int i_458_ = 0; i_458_ < ((Class387_Sub2) this).anInt8147; i_458_++) {
				Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_458_];
				((Class40) class40).anInt429 = ((Class40) class40).anInt429 * i_431_ >> 7;
				((Class40) class40).anInt426 = ((Class40) class40).anInt426 * i_432_ >> 7;
			}
		} else if (i == 9) {
			for (int i_459_ = 0; i_459_ < ((Class387_Sub2) this).anInt8147; i_459_++) {
				Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_459_];
				((Class40) class40).anInt424 = ((Class40) class40).anInt424 + i_431_ & 0x3fff;
			}
		}
	}

	void method4470(int i, int[] is, int i_460_, int i_461_, int i_462_, int i_463_, boolean bool) {
		int i_464_ = is.length;
		if (i == 0) {
			i_460_ <<= 4;
			i_461_ <<= 4;
			i_462_ <<= 4;
			int i_465_ = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (int i_466_ = 0; i_466_ < i_464_; i_466_++) {
				int i_467_ = is[i_466_];
				if (i_467_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_468_ = ((Class387_Sub2) this).anIntArrayArray8113[i_467_];
					for (int i_469_ = 0; i_469_ < is_468_.length; i_469_++) {
						int i_470_ = is_468_[i_469_];
						anInt8101 += ((Class387_Sub2) this).anIntArray8102[i_470_];
						anInt8111 += ((Class387_Sub2) this).anIntArray8110[i_470_];
						anInt8158 += ((Class387_Sub2) this).anIntArray8104[i_470_];
						i_465_++;
					}
				}
			}
			if (i_465_ > 0) {
				anInt8101 = anInt8101 / i_465_ + i_460_;
				anInt8111 = anInt8111 / i_465_ + i_461_;
				anInt8158 = anInt8158 / i_465_ + i_462_;
			} else {
				anInt8101 = i_460_;
				anInt8111 = i_461_;
				anInt8158 = i_462_;
			}
		} else if (i == 1) {
			i_460_ <<= 4;
			i_461_ <<= 4;
			i_462_ <<= 4;
			for (int i_471_ = 0; i_471_ < i_464_; i_471_++) {
				int i_472_ = is[i_471_];
				if (i_472_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_473_ = ((Class387_Sub2) this).anIntArrayArray8113[i_472_];
					for (int i_474_ = 0; i_474_ < is_473_.length; i_474_++) {
						int i_475_ = is_473_[i_474_];
						((Class387_Sub2) this).anIntArray8102[i_475_] += i_460_;
						((Class387_Sub2) this).anIntArray8110[i_475_] += i_461_;
						((Class387_Sub2) this).anIntArray8104[i_475_] += i_462_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_476_ = 0; i_476_ < i_464_; i_476_++) {
				int i_477_ = is[i_476_];
				if (i_477_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_478_ = ((Class387_Sub2) this).anIntArrayArray8113[i_477_];
					if ((i_463_ & 0x1) == 0) {
						for (int i_479_ = 0; i_479_ < is_478_.length; i_479_++) {
							int i_480_ = is_478_[i_479_];
							((Class387_Sub2) this).anIntArray8102[i_480_] -= anInt8101;
							((Class387_Sub2) this).anIntArray8110[i_480_] -= anInt8111;
							((Class387_Sub2) this).anIntArray8104[i_480_] -= anInt8158;
							if (i_462_ != 0) {
								int i_481_ = Class257.anIntArray2683[i_462_];
								int i_482_ = Class257.anIntArray2684[i_462_];
								int i_483_ = (((((Class387_Sub2) this).anIntArray8110[i_480_]) * i_481_ + (((Class387_Sub2) this).anIntArray8102[i_480_]) * i_482_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8110[i_480_] = ((((Class387_Sub2) this).anIntArray8110[i_480_]) * i_482_ - (((Class387_Sub2) this).anIntArray8102[i_480_]) * i_481_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8102[i_480_] = i_483_;
							}
							if (i_460_ != 0) {
								int i_484_ = Class257.anIntArray2683[i_460_];
								int i_485_ = Class257.anIntArray2684[i_460_];
								int i_486_ = (((((Class387_Sub2) this).anIntArray8110[i_480_]) * i_485_ - (((Class387_Sub2) this).anIntArray8104[i_480_]) * i_484_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8104[i_480_] = ((((Class387_Sub2) this).anIntArray8110[i_480_]) * i_484_ + (((Class387_Sub2) this).anIntArray8104[i_480_]) * i_485_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8110[i_480_] = i_486_;
							}
							if (i_461_ != 0) {
								int i_487_ = Class257.anIntArray2683[i_461_];
								int i_488_ = Class257.anIntArray2684[i_461_];
								int i_489_ = (((((Class387_Sub2) this).anIntArray8104[i_480_]) * i_487_ + (((Class387_Sub2) this).anIntArray8102[i_480_]) * i_488_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8104[i_480_] = ((((Class387_Sub2) this).anIntArray8104[i_480_]) * i_488_ - (((Class387_Sub2) this).anIntArray8102[i_480_]) * i_487_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8102[i_480_] = i_489_;
							}
							((Class387_Sub2) this).anIntArray8102[i_480_] += anInt8101;
							((Class387_Sub2) this).anIntArray8110[i_480_] += anInt8111;
							((Class387_Sub2) this).anIntArray8104[i_480_] += anInt8158;
						}
					} else {
						for (int i_490_ = 0; i_490_ < is_478_.length; i_490_++) {
							int i_491_ = is_478_[i_490_];
							((Class387_Sub2) this).anIntArray8102[i_491_] -= anInt8101;
							((Class387_Sub2) this).anIntArray8110[i_491_] -= anInt8111;
							((Class387_Sub2) this).anIntArray8104[i_491_] -= anInt8158;
							if (i_460_ != 0) {
								int i_492_ = Class257.anIntArray2683[i_460_];
								int i_493_ = Class257.anIntArray2684[i_460_];
								int i_494_ = (((((Class387_Sub2) this).anIntArray8110[i_491_]) * i_493_ - (((Class387_Sub2) this).anIntArray8104[i_491_]) * i_492_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8104[i_491_] = ((((Class387_Sub2) this).anIntArray8110[i_491_]) * i_492_ + (((Class387_Sub2) this).anIntArray8104[i_491_]) * i_493_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8110[i_491_] = i_494_;
							}
							if (i_462_ != 0) {
								int i_495_ = Class257.anIntArray2683[i_462_];
								int i_496_ = Class257.anIntArray2684[i_462_];
								int i_497_ = (((((Class387_Sub2) this).anIntArray8110[i_491_]) * i_495_ + (((Class387_Sub2) this).anIntArray8102[i_491_]) * i_496_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8110[i_491_] = ((((Class387_Sub2) this).anIntArray8110[i_491_]) * i_496_ - (((Class387_Sub2) this).anIntArray8102[i_491_]) * i_495_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8102[i_491_] = i_497_;
							}
							if (i_461_ != 0) {
								int i_498_ = Class257.anIntArray2683[i_461_];
								int i_499_ = Class257.anIntArray2684[i_461_];
								int i_500_ = (((((Class387_Sub2) this).anIntArray8104[i_491_]) * i_498_ + (((Class387_Sub2) this).anIntArray8102[i_491_]) * i_499_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8104[i_491_] = ((((Class387_Sub2) this).anIntArray8104[i_491_]) * i_499_ - (((Class387_Sub2) this).anIntArray8102[i_491_]) * i_498_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8102[i_491_] = i_500_;
							}
							((Class387_Sub2) this).anIntArray8102[i_491_] += anInt8101;
							((Class387_Sub2) this).anIntArray8110[i_491_] += anInt8111;
							((Class387_Sub2) this).anIntArray8104[i_491_] += anInt8158;
						}
					}
				}
			}
			if (bool) {
				for (int i_501_ = 0; i_501_ < i_464_; i_501_++) {
					int i_502_ = is[i_501_];
					if (i_502_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_503_ = (((Class387_Sub2) this).anIntArrayArray8113[i_502_]);
						for (int i_504_ = 0; i_504_ < is_503_.length; i_504_++) {
							int i_505_ = is_503_[i_504_];
							int i_506_ = (((Class387_Sub2) this).anIntArray8143[i_505_]);
							int i_507_ = (((Class387_Sub2) this).anIntArray8143[i_505_ + 1]);
							for (int i_508_ = i_506_; i_508_ < i_507_; i_508_++) {
								int i_509_ = ((((Class387_Sub2) this).aShortArray8144[i_508_]) - 1);
								if (i_509_ == -1)
									break;
								if (i_462_ != 0) {
									int i_510_ = Class257.anIntArray2683[i_462_];
									int i_511_ = Class257.anIntArray2684[i_462_];
									int i_512_ = (((((Class387_Sub2) this).aShortArray8109[i_509_]) * i_510_ + ((((Class387_Sub2) this).aShortArray8108[i_509_]) * i_511_) + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8109[i_509_] = (short) ((((((Class387_Sub2) this).aShortArray8109[i_509_]) * i_511_) - (((Class387_Sub2) this).aShortArray8108[i_509_]) * i_510_ + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8108[i_509_] = (short) i_512_;
								}
								if (i_460_ != 0) {
									int i_513_ = Class257.anIntArray2683[i_460_];
									int i_514_ = Class257.anIntArray2684[i_460_];
									int i_515_ = (((((Class387_Sub2) this).aShortArray8109[i_509_]) * i_514_ - ((((Class387_Sub2) this).aShortArray8095[i_509_]) * i_513_) + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8095[i_509_] = (short) ((((((Class387_Sub2) this).aShortArray8109[i_509_]) * i_513_) + (((Class387_Sub2) this).aShortArray8095[i_509_]) * i_514_ + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8109[i_509_] = (short) i_515_;
								}
								if (i_461_ != 0) {
									int i_516_ = Class257.anIntArray2683[i_461_];
									int i_517_ = Class257.anIntArray2684[i_461_];
									int i_518_ = (((((Class387_Sub2) this).aShortArray8095[i_509_]) * i_516_ + ((((Class387_Sub2) this).aShortArray8108[i_509_]) * i_517_) + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8095[i_509_] = (short) ((((((Class387_Sub2) this).aShortArray8095[i_509_]) * i_517_) - (((Class387_Sub2) this).aShortArray8108[i_509_]) * i_516_ + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8108[i_509_] = (short) i_518_;
								}
							}
						}
					}
				}
				if (((Class387_Sub2) this).aClass44_8127 == null && ((Class387_Sub2) this).aClass44_8105 != null)
					((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
				if (((Class387_Sub2) this).aClass44_8127 != null)
					((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = null;
			}
		} else if (i == 3) {
			for (int i_519_ = 0; i_519_ < i_464_; i_519_++) {
				int i_520_ = is[i_519_];
				if (i_520_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_521_ = ((Class387_Sub2) this).anIntArrayArray8113[i_520_];
					for (int i_522_ = 0; i_522_ < is_521_.length; i_522_++) {
						int i_523_ = is_521_[i_522_];
						((Class387_Sub2) this).anIntArray8102[i_523_] -= anInt8101;
						((Class387_Sub2) this).anIntArray8110[i_523_] -= anInt8111;
						((Class387_Sub2) this).anIntArray8104[i_523_] -= anInt8158;
						((Class387_Sub2) this).anIntArray8102[i_523_] = (((Class387_Sub2) this).anIntArray8102[i_523_] * i_460_) >> 7;
						((Class387_Sub2) this).anIntArray8110[i_523_] = (((Class387_Sub2) this).anIntArray8110[i_523_] * i_461_) >> 7;
						((Class387_Sub2) this).anIntArray8104[i_523_] = (((Class387_Sub2) this).anIntArray8104[i_523_] * i_462_) >> 7;
						((Class387_Sub2) this).anIntArray8102[i_523_] += anInt8101;
						((Class387_Sub2) this).anIntArray8110[i_523_] += anInt8111;
						((Class387_Sub2) this).anIntArray8104[i_523_] += anInt8158;
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub2) this).anIntArrayArray8123 != null) {
				for (int i_524_ = 0; i_524_ < i_464_; i_524_++) {
					int i_525_ = is[i_524_];
					if (i_525_ < ((Class387_Sub2) this).anIntArrayArray8123.length) {
						int[] is_526_ = (((Class387_Sub2) this).anIntArrayArray8123[i_525_]);
						for (int i_527_ = 0; i_527_ < is_526_.length; i_527_++) {
							int i_528_ = is_526_[i_527_];
							int i_529_ = (((((Class387_Sub2) this).aByteArray8136[i_528_]) & 0xff) + i_460_ * 8);
							if (i_529_ < 0)
								i_529_ = 0;
							else if (i_529_ > 255)
								i_529_ = 255;
							((Class387_Sub2) this).aByteArray8136[i_528_] = (byte) i_529_;
						}
						if (is_526_.length > 0 && ((Class387_Sub2) this).aClass44_8105 != null)
							((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
					}
				}
				if (((Class387_Sub2) this).aClass52Array8148 != null) {
					for (int i_530_ = 0; i_530_ < ((Class387_Sub2) this).anInt8147; i_530_++) {
						Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_530_];
						Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_530_];
						((Class40) class40).anInt428 = (((Class40) class40).anInt428 & 0xffffff | 255 - ((((Class387_Sub2) this).aByteArray8136[((Class52) class52).modelColorIndex]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub2) this).anIntArrayArray8123 != null) {
				for (int i_531_ = 0; i_531_ < i_464_; i_531_++) {
					int i_532_ = is[i_531_];
					if (i_532_ < ((Class387_Sub2) this).anIntArrayArray8123.length) {
						int[] is_533_ = (((Class387_Sub2) this).anIntArrayArray8123[i_532_]);
						for (int i_534_ = 0; i_534_ < is_533_.length; i_534_++) {
							int i_535_ = is_533_[i_534_];
							int i_536_ = ((((Class387_Sub2) this).modelColors[i_535_]) & 0xffff);
							int i_537_ = i_536_ >> 10 & 0x3f;
							int i_538_ = i_536_ >> 7 & 0x7;
							int i_539_ = i_536_ & 0x7f;
							i_537_ = i_537_ + i_460_ & 0x3f;
							i_538_ += i_461_ / 4;
							if (i_538_ < 0)
								i_538_ = 0;
							else if (i_538_ > 7)
								i_538_ = 7;
							i_539_ += i_462_;
							if (i_539_ < 0)
								i_539_ = 0;
							else if (i_539_ > 127)
								i_539_ = 127;
							((Class387_Sub2) this).modelColors[i_535_] = (short) (i_537_ << 10 | i_538_ << 7 | i_539_);
						}
						if (is_533_.length > 0 && ((Class387_Sub2) this).aClass44_8105 != null)
							((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
					}
				}
				if (((Class387_Sub2) this).aClass52Array8148 != null) {
					for (int i_540_ = 0; i_540_ < ((Class387_Sub2) this).anInt8147; i_540_++) {
						Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_540_];
						Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_540_];
						((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_541_ = 0; i_541_ < i_464_; i_541_++) {
					int i_542_ = is[i_541_];
					if (i_542_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_543_ = (((Class387_Sub2) this).anIntArrayArray8150[i_542_]);
						for (int i_544_ = 0; i_544_ < is_543_.length; i_544_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_543_[i_544_]]);
							((Class40) class40).anInt425 += i_460_;
							((Class40) class40).anInt427 += i_461_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_545_ = 0; i_545_ < i_464_; i_545_++) {
					int i_546_ = is[i_545_];
					if (i_546_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_547_ = (((Class387_Sub2) this).anIntArrayArray8150[i_546_]);
						for (int i_548_ = 0; i_548_ < is_547_.length; i_548_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_547_[i_548_]]);
							((Class40) class40).anInt429 = ((Class40) class40).anInt429 * i_460_ >> 7;
							((Class40) class40).anInt426 = ((Class40) class40).anInt426 * i_461_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_549_ = 0; i_549_ < i_464_; i_549_++) {
					int i_550_ = is[i_549_];
					if (i_550_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_551_ = (((Class387_Sub2) this).anIntArrayArray8150[i_550_]);
						for (int i_552_ = 0; i_552_ < is_551_.length; i_552_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_551_[i_552_]]);
							((Class40) class40).anInt424 = (((Class40) class40).anInt424 + i_460_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public int co() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).aShort8097;
	}

	public void dt(short i, short i_553_) {
		for (int i_554_ = 0; i_554_ < ((Class387_Sub2) this).anInt8089; i_554_++) {
			if (((Class387_Sub2) this).modelColors[i_554_] == i)
				((Class387_Sub2) this).modelColors[i_554_] = i_553_;
		}
		if (((Class387_Sub2) this).aClass52Array8148 != null) {
			for (int i_555_ = 0; i_555_ < ((Class387_Sub2) this).anInt8147; i_555_++) {
				Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_555_];
				Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_555_];
				((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
	}

	public Class64[] method4445() {
		return ((Class387_Sub2) this).aClass64Array8146;
	}

	public int o() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).aShort8100;
	}

	public void method4463(Class247 class247) {
		Class249 class249 = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass249_8430);
		class249.method2508(class247);
		if (((Class387_Sub2) this).aClass93Array8135 != null) {
			for (int i = 0; i < ((Class387_Sub2) this).aClass93Array8135.length; i++) {
				Class93 class93 = ((Class387_Sub2) this).aClass93Array8135[i];
				Class93 class93_556_ = class93;
				if (class93.aClass93_833 != null)
					class93_556_ = class93.aClass93_833;
				class93_556_.anInt838 = ((int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub2) this).anIntArray8102[class93.anInt841 * -1670679901])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub2) this).anIntArray8110[(class93.anInt841 * -1670679901)])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub2) this).anIntArray8104[(class93.anInt841 * -1670679901)])))) * 432673201);
				class93_556_.anInt832 = ((int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub2) this).anIntArray8102[class93.anInt841 * -1670679901])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub2) this).anIntArray8110[(class93.anInt841 * -1670679901)])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub2) this).anIntArray8104[(class93.anInt841 * -1670679901)])))) * -1138862783);
				class93_556_.anInt840 = ((int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub2) this).anIntArray8102[class93.anInt841 * -1670679901])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub2) this).anIntArray8110[(class93.anInt841 * -1670679901)])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub2) this).anIntArray8104[(class93.anInt841 * -1670679901)])))) * -555868357);
				class93_556_.anInt837 = ((int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub2) this).anIntArray8102[class93.anInt835 * -614748507])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub2) this).anIntArray8110[(class93.anInt835 * -614748507)])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub2) this).anIntArray8104[(class93.anInt835 * -614748507)])))) * -707023853);
				class93_556_.anInt842 = ((int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub2) this).anIntArray8102[class93.anInt835 * -614748507])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub2) this).anIntArray8110[(class93.anInt835 * -614748507)])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub2) this).anIntArray8104[(class93.anInt835 * -614748507)])))) * -648890367);
				class93_556_.anInt845 = ((int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub2) this).anIntArray8102[class93.anInt835 * -614748507])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub2) this).anIntArray8110[(class93.anInt835 * -614748507)])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub2) this).anIntArray8104[(class93.anInt835 * -614748507)])))) * -1672139309);
				class93_556_.anInt839 = (int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub2) this).anIntArray8102[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub2) this).anIntArray8110[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub2) this).anIntArray8104[(class93.anInt836 * -878748965)])))) * 488615051;
				class93_556_.anInt844 = (int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub2) this).anIntArray8102[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub2) this).anIntArray8110[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub2) this).anIntArray8104[(class93.anInt836 * -878748965)])))) * 197668655;
				class93_556_.anInt846 = (int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub2) this).anIntArray8102[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub2) this).anIntArray8110[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub2) this).anIntArray8104[(class93.anInt836 * -878748965)])))) * 471540135;
			}
		}
		if (((Class387_Sub2) this).aClass64Array8146 != null) {
			for (int i = 0; i < ((Class387_Sub2) this).aClass64Array8146.length; i++) {
				Class64 class64 = ((Class387_Sub2) this).aClass64Array8146[i];
				Class64 class64_557_ = class64;
				if (class64.aClass64_562 != null)
					class64_557_ = class64.aClass64_562;
				if (class64.aClass249_568 != null)
					class64.aClass249_568.method2510(class249);
				else
					class64.aClass249_568 = new Class249(class249);
				class64_557_.anInt565 = ((int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub2) this).anIntArray8102[class64.anInt566 * 1669844747])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub2) this).anIntArray8110[(class64.anInt566 * 1669844747)])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub2) this).anIntArray8104[(class64.anInt566 * 1669844747)])))) * -686746519);
				class64_557_.anInt563 = ((int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub2) this).anIntArray8102[class64.anInt566 * 1669844747])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub2) this).anIntArray8110[(class64.anInt566 * 1669844747)])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub2) this).anIntArray8104[(class64.anInt566 * 1669844747)])))) * -635472619);
				class64_557_.anInt567 = ((int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub2) this).anIntArray8102[class64.anInt566 * 1669844747])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub2) this).anIntArray8110[(class64.anInt566 * 1669844747)])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub2) this).anIntArray8104[(class64.anInt566 * 1669844747)])))) * 1225142127);
			}
		}
	}

	boolean method4521(int i, int i_558_, int i_559_, int i_560_, int i_561_, int i_562_, int i_563_, int i_564_) {
		if (i_558_ < i_559_ && i_558_ < i_560_ && i_558_ < i_561_)
			return false;
		if (i_558_ > i_559_ && i_558_ > i_560_ && i_558_ > i_561_)
			return false;
		if (i < i_562_ && i < i_563_ && i < i_564_)
			return false;
		if (i > i_562_ && i > i_563_ && i > i_564_)
			return false;
		return true;
	}

	public Class_na ga(Class_na class_na) {
		if (((Class387_Sub2) this).anInt8107 == 0)
			return null;
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		int i;
		int i_565_;
		if ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8410) > 0) {
			i = ((((Class387_Sub2) this).aShort8145 - ((((Class387_Sub2) this).aShort8100 * ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8410) >> 8)) >> ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8296);
			i_565_ = ((((Class387_Sub2) this).aShort8156 - ((((Class387_Sub2) this).aShort8097 * ((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).anInt8410) >> 8)) >> ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8296);
		} else {
			i = ((((Class387_Sub2) this).aShort8145 - ((((Class387_Sub2) this).aShort8097 * ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8410) >> 8)) >> ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8296);
			i_565_ = ((((Class387_Sub2) this).aShort8156 - ((((Class387_Sub2) this).aShort8100 * ((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).anInt8410) >> 8)) >> ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8296);
		}
		int i_566_;
		int i_567_;
		if ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8379) > 0) {
			i_566_ = ((((Class387_Sub2) this).aShort8140 - ((((Class387_Sub2) this).aShort8100 * ((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).anInt8379) >> 8)) >> ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8296);
			i_567_ = ((((Class387_Sub2) this).aShort8141 - ((((Class387_Sub2) this).aShort8097 * ((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).anInt8379) >> 8)) >> ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8296);
		} else {
			i_566_ = ((((Class387_Sub2) this).aShort8140 - ((((Class387_Sub2) this).aShort8097 * ((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).anInt8379) >> 8)) >> ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8296);
			i_567_ = ((((Class387_Sub2) this).aShort8141 - ((((Class387_Sub2) this).aShort8100 * ((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).anInt8379) >> 8)) >> ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8296);
		}
		int i_568_ = i_565_ - i + 1;
		int i_569_ = i_567_ - i_566_ + 1;
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		Class_na_Sub2 class_na_sub2_570_;
		if (class_na_sub2 != null && class_na_sub2.method3531(i_568_, i_569_)) {
			class_na_sub2_570_ = class_na_sub2;
			class_na_sub2_570_.method3532();
		} else
			class_na_sub2_570_ = new Class_na_Sub2(((Class387_Sub2) this).aClass_ra_Sub1_8092, i_568_, i_569_);
		class_na_sub2_570_.method3530(i, i_566_, i_565_, i_567_);
		method4525(class_na_sub2_570_);
		return class_na_sub2_570_;
	}

	public int am() {
		return ((Class387_Sub2) this).anInt8093;
	}

	public void PA(int i, int i_571_, int i_572_, int i_573_) {
		for (int i_574_ = 0; i_574_ < ((Class387_Sub2) this).anInt8089; i_574_++) {
			int i_575_ = ((Class387_Sub2) this).modelColors[i_574_] & 0xffff;
			int i_576_ = i_575_ >> 10 & 0x3f;
			int i_577_ = i_575_ >> 7 & 0x7;
			int i_578_ = i_575_ & 0x7f;
			if (i != -1)
				i_576_ += (i - i_576_) * i_573_ >> 7;
			if (i_571_ != -1)
				i_577_ += (i_571_ - i_577_) * i_573_ >> 7;
			if (i_572_ != -1)
				i_578_ += (i_572_ - i_578_) * i_573_ >> 7;
			((Class387_Sub2) this).modelColors[i_574_] = (short) (i_576_ << 10 | i_577_ << 7 | i_578_);
		}
		if (((Class387_Sub2) this).aClass52Array8148 != null) {
			for (int i_579_ = 0; i_579_ < ((Class387_Sub2) this).anInt8147; i_579_++) {
				Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_579_];
				Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_579_];
				((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
	}

	void method4522(Class249 class249) {
		if (((Class387_Sub2) this).aClass52Array8148 != null) {
			Class249 class249_580_ = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass249_8269);
			((Class387_Sub2) this).aClass_ra_Sub1_8092.method4820();
			((Class387_Sub2) this).aClass_ra_Sub1_8092.RA(!((Class387_Sub2) this).aBoolean8098);
			((Class387_Sub2) this).aClass_ra_Sub1_8092.method4854(false);
			((Class387_Sub2) this).aClass_ra_Sub1_8092.method4869((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass44_8336), null, null, (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass44_8436));
			for (int i = 0; i < ((Class387_Sub2) this).anInt8147; i++) {
				Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i];
				Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i];
				if (!((Class52) class52).aBoolean501 || !((Class387_Sub2) this).aClass_ra_Sub1_8092.cg()) {
					float f = ((float) ((((Class387_Sub2) this).anIntArray8102[((Class52) class52).anInt502]) + (((Class387_Sub2) this).anIntArray8102[((Class52) class52).anInt494]) + (((Class387_Sub2) this).anIntArray8102[((Class52) class52).anInt496])) * 0.3333333F);
					float f_581_ = ((float) ((((Class387_Sub2) this).anIntArray8110[((Class52) class52).anInt502]) + (((Class387_Sub2) this).anIntArray8110[((Class52) class52).anInt494]) + (((Class387_Sub2) this).anIntArray8110[((Class52) class52).anInt496])) * 0.3333333F);
					float f_582_ = ((float) ((((Class387_Sub2) this).anIntArray8104[((Class52) class52).anInt502]) + (((Class387_Sub2) this).anIntArray8104[((Class52) class52).anInt494]) + (((Class387_Sub2) this).anIntArray8104[((Class52) class52).anInt496])) * 0.3333333F);
					float f_583_ = (class249.aFloatArray2631[0] * f + class249.aFloatArray2631[4] * f_581_ + class249.aFloatArray2631[8] * f_582_ + class249.aFloatArray2631[12]);
					float f_584_ = (class249.aFloatArray2631[1] * f + class249.aFloatArray2631[5] * f_581_ + class249.aFloatArray2631[9] * f_582_ + class249.aFloatArray2631[13]);
					float f_585_ = (class249.aFloatArray2631[2] * f + class249.aFloatArray2631[6] * f_581_ + class249.aFloatArray2631[10] * f_582_ + class249.aFloatArray2631[14]);
					float f_586_ = ((float) (1.0 / Math.sqrt((double) (f_583_ * f_583_ + f_584_ * f_584_ + f_585_ * f_585_))) * (float) ((Class52) class52).anInt500);
					class249_580_.method2507(((Class40) class40).anInt424, (((Class40) class40).anInt429 * ((Class52) class52).aShort497) >> 7, (((Class40) class40).anInt426 * ((Class52) class52).aShort493) >> 7, (f_583_ + (float) ((Class40) class40).anInt425 - f_583_ * f_586_), (f_584_ + (float) ((Class40) class40).anInt427 - f_584_ * f_586_), f_585_ - f_585_ * f_586_);
					((Class387_Sub2) this).aClass_ra_Sub1_8092.method4865(class249_580_);
					int i_587_ = ((Class40) class40).anInt428;
					OpenGL.glColor4ub((byte) (i_587_ >> 16), (byte) (i_587_ >> 8), (byte) i_587_, (byte) (i_587_ >> 24));
					((Class387_Sub2) this).aClass_ra_Sub1_8092.method4841(((Class52) class52).aShort499);
					((Class387_Sub2) this).aClass_ra_Sub1_8092.method4859(((Class52) class52).aByte498);
					((Class387_Sub2) this).aClass_ra_Sub1_8092.method4881(7, 0, 4);
				}
			}
			((Class387_Sub2) this).aClass_ra_Sub1_8092.RA(true);
			((Class387_Sub2) this).aClass_ra_Sub1_8092.method4876();
		}
	}

	void method4523(boolean bool) {
		if ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass330_Sub46_Sub1_8381.payload).length < ((Class387_Sub2) this).anInt8116 * 6)
			((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass330_Sub46_Sub1_8381 = new Class330_Sub46_Sub1((((Class387_Sub2) this).anInt8116 + 100) * 6);
		else
			((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass330_Sub46_Sub1_8381.offset = 0;
		Class330_Sub46_Sub1 class330_sub46_sub1 = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass330_Sub46_Sub1_8381);
		if (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aBoolean8407) {
			for (int i = 0; i < ((Class387_Sub2) this).anInt8116; i++) {
				class330_sub46_sub1.addShort((((Class387_Sub2) this).aShortArray8119[i]), (byte) 70);
				class330_sub46_sub1.addShort((((Class387_Sub2) this).aShortArray8120[i]), (byte) 101);
				class330_sub46_sub1.addShort((((Class387_Sub2) this).aShortArray8121[i]), (byte) 97);
			}
		} else {
			for (int i = 0; i < ((Class387_Sub2) this).anInt8116; i++) {
				class330_sub46_sub1.method3742((((Class387_Sub2) this).aShortArray8119[i]), (short) 22029);
				class330_sub46_sub1.method3742((((Class387_Sub2) this).aShortArray8120[i]), (short) 14302);
				class330_sub46_sub1.method3742((((Class387_Sub2) this).aShortArray8121[i]), (short) -16810);
			}
		}
		if (class330_sub46_sub1.offset * -824785231 != 0) {
			if (bool) {
				if (((Class387_Sub2) this).anInterface3_8085 == null)
					((Class387_Sub2) this).anInterface3_8085 = (((Class387_Sub2) this).aClass_ra_Sub1_8092.method4834(5123, class330_sub46_sub1.payload, class330_sub46_sub1.offset * -824785231, true));
				else
					((Class387_Sub2) this).anInterface3_8085.method42(5123, class330_sub46_sub1.payload, class330_sub46_sub1.offset * -824785231);
				((Class37) ((Class387_Sub2) this).aClass37_8087).anInterface3_382 = ((Class387_Sub2) this).anInterface3_8085;
			} else
				((Class37) ((Class387_Sub2) this).aClass37_8087).anInterface3_382 = (((Class387_Sub2) this).aClass_ra_Sub1_8092.method4834(5123, class330_sub46_sub1.payload, class330_sub46_sub1.offset * -824785231, false));
			if (!bool)
				((Class387_Sub2) this).aBoolean8132 = true;
		}
	}

	public void method4488(Class247 class247, int i, boolean bool) {
		if (((Class387_Sub2) this).aShortArray8106 != null) {
			Class247 class247_588_ = class247;
			if (bool) {
				class247_588_ = ((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aClass247_8360;
				class247_588_.method2458(class247);
			}
			float[] fs = new float[3];
			for (int i_589_ = 0; i_589_ < ((Class387_Sub2) this).anInt8130; i_589_++) {
				if ((i & ((Class387_Sub2) this).aShortArray8106[i_589_]) != 0) {
					class247_588_.method2465((float) ((Class387_Sub2) this).anIntArray8102[i_589_], (float) ((Class387_Sub2) this).anIntArray8110[i_589_], (float) ((Class387_Sub2) this).anIntArray8104[i_589_], fs);
					((Class387_Sub2) this).anIntArray8102[i_589_] = (int) fs[0];
					((Class387_Sub2) this).anIntArray8110[i_589_] = (int) fs[1];
					((Class387_Sub2) this).anIntArray8104[i_589_] = (int) fs[2];
				}
			}
		}
	}

	static final int method4524(int i, int i_590_) {
		i_590_ = i_590_ * (i & 0x7f) >> 7;
		if (i_590_ < 2)
			i_590_ = 2;
		else if (i_590_ > 126)
			i_590_ = 126;
		return (i & 0xff80) + i_590_;
	}

	static {
		anIntArray8103 = new int[8];
		anIntArray8154 = new int[8];
		anIntArray8155 = new int[8];
	}

	public void method4480(Class387 class387, int i, int i_591_, int i_592_, boolean bool) {
		Class387_Sub2 class387_sub2_593_ = (Class387_Sub2) class387;
		if (((Class387_Sub2) this).anInt8089 != 0 && ((Class387_Sub2) class387_sub2_593_).anInt8089 != 0) {
			int i_594_ = ((Class387_Sub2) class387_sub2_593_).anInt8130;
			int[] is = ((Class387_Sub2) class387_sub2_593_).anIntArray8102;
			int[] is_595_ = ((Class387_Sub2) class387_sub2_593_).anIntArray8110;
			int[] is_596_ = ((Class387_Sub2) class387_sub2_593_).anIntArray8104;
			short[] is_597_ = ((Class387_Sub2) class387_sub2_593_).aShortArray8108;
			short[] is_598_ = ((Class387_Sub2) class387_sub2_593_).aShortArray8109;
			short[] is_599_ = ((Class387_Sub2) class387_sub2_593_).aShortArray8095;
			byte[] is_600_ = ((Class387_Sub2) class387_sub2_593_).aByteArray8118;
			short[] is_601_;
			short[] is_602_;
			short[] is_603_;
			byte[] is_604_;
			if (((Class387_Sub2) this).aClass68_8112 != null) {
				is_601_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray582);
				is_602_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray583);
				is_603_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray584);
				is_604_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aByteArray585);
			} else {
				is_601_ = null;
				is_602_ = null;
				is_603_ = null;
				is_604_ = null;
			}
			short[] is_605_;
			short[] is_606_;
			short[] is_607_;
			byte[] is_608_;
			if (((Class387_Sub2) class387_sub2_593_).aClass68_8112 != null) {
				is_605_ = ((Class68) (((Class387_Sub2) class387_sub2_593_).aClass68_8112)).aShortArray582;
				is_606_ = ((Class68) (((Class387_Sub2) class387_sub2_593_).aClass68_8112)).aShortArray583;
				is_607_ = ((Class68) (((Class387_Sub2) class387_sub2_593_).aClass68_8112)).aShortArray584;
				is_608_ = ((Class68) (((Class387_Sub2) class387_sub2_593_).aClass68_8112)).aByteArray585;
			} else {
				is_605_ = null;
				is_606_ = null;
				is_607_ = null;
				is_608_ = null;
			}
			int[] is_609_ = ((Class387_Sub2) class387_sub2_593_).anIntArray8143;
			short[] is_610_ = ((Class387_Sub2) class387_sub2_593_).aShortArray8144;
			if (!((Class387_Sub2) class387_sub2_593_).aBoolean8126)
				class387_sub2_593_.method4528();
			int i_611_ = ((Class387_Sub2) class387_sub2_593_).aShort8097;
			int i_612_ = ((Class387_Sub2) class387_sub2_593_).aShort8100;
			int i_613_ = ((Class387_Sub2) class387_sub2_593_).aShort8145;
			int i_614_ = ((Class387_Sub2) class387_sub2_593_).aShort8156;
			int i_615_ = ((Class387_Sub2) class387_sub2_593_).aShort8140;
			int i_616_ = ((Class387_Sub2) class387_sub2_593_).aShort8141;
			for (int i_617_ = 0; i_617_ < ((Class387_Sub2) this).anInt8130; i_617_++) {
				int i_618_ = ((Class387_Sub2) this).anIntArray8110[i_617_] - i_591_;
				if (i_618_ >= i_611_ && i_618_ <= i_612_) {
					int i_619_ = ((Class387_Sub2) this).anIntArray8102[i_617_] - i;
					if (i_619_ >= i_613_ && i_619_ <= i_614_) {
						int i_620_ = (((Class387_Sub2) this).anIntArray8104[i_617_] - i_592_);
						if (i_620_ >= i_615_ && i_620_ <= i_616_) {
							int i_621_ = -1;
							int i_622_ = (((Class387_Sub2) this).anIntArray8143[i_617_]);
							int i_623_ = (((Class387_Sub2) this).anIntArray8143[i_617_ + 1]);
							for (int i_624_ = i_622_; i_624_ < i_623_; i_624_++) {
								i_621_ = (((Class387_Sub2) this).aShortArray8144[i_624_]) - 1;
								if (i_621_ == -1 || (((Class387_Sub2) this).aByteArray8118[i_621_]) != 0)
									break;
							}
							if (i_621_ != -1) {
								for (int i_625_ = 0; i_625_ < i_594_; i_625_++) {
									if (i_619_ == is[i_625_] && i_620_ == is_596_[i_625_] && i_618_ == is_595_[i_625_]) {
										int i_626_ = -1;
										i_622_ = is_609_[i_625_];
										i_623_ = is_609_[i_625_ + 1];
										for (int i_627_ = i_622_; i_627_ < i_623_; i_627_++) {
											i_626_ = is_610_[i_627_] - 1;
											if (i_626_ == -1 || is_600_[i_626_] != 0)
												break;
										}
										if (i_626_ != -1) {
											if (is_601_ == null) {
												((Class387_Sub2) this).aClass68_8112 = new Class68();
												is_601_ = ((Class68) (((Class387_Sub2) this).aClass68_8112)).aShortArray582 = (Class263_Sub4.method2637((((Class387_Sub2) this).aShortArray8108), 1711526308));
												is_602_ = ((Class68) (((Class387_Sub2) this).aClass68_8112)).aShortArray583 = (Class263_Sub4.method2637((((Class387_Sub2) this).aShortArray8109), 1570998322));
												is_603_ = ((Class68) (((Class387_Sub2) this).aClass68_8112)).aShortArray584 = (Class263_Sub4.method2637((((Class387_Sub2) this).aShortArray8095), 1429071895));
												is_604_ = ((Class68) (((Class387_Sub2) this).aClass68_8112)).aByteArray585 = (IcmpService_Sub1.method6479((((Class387_Sub2) this).aByteArray8118), (byte) 2));
											}
											if (is_605_ == null) {
												Class68 class68 = (((Class387_Sub2) class387_sub2_593_).aClass68_8112 = new Class68());
												is_605_ = ((Class68) class68).aShortArray582 = (Class263_Sub4.method2637(is_597_, 1575198567));
												is_606_ = ((Class68) class68).aShortArray583 = (Class263_Sub4.method2637(is_598_, 1454524598));
												is_607_ = ((Class68) class68).aShortArray584 = (Class263_Sub4.method2637(is_599_, 1650715229));
												is_608_ = ((Class68) class68).aByteArray585 = (IcmpService_Sub1.method6479(is_600_, (byte) 2));
											}
											short i_628_ = (((Class387_Sub2) this).aShortArray8108[i_621_]);
											short i_629_ = (((Class387_Sub2) this).aShortArray8109[i_621_]);
											short i_630_ = (((Class387_Sub2) this).aShortArray8095[i_621_]);
											byte i_631_ = (((Class387_Sub2) this).aByteArray8118[i_621_]);
											i_622_ = is_609_[i_625_];
											i_623_ = is_609_[i_625_ + 1];
											for (int i_632_ = i_622_; i_632_ < i_623_; i_632_++) {
												int i_633_ = is_610_[i_632_] - 1;
												if (i_633_ == -1)
													break;
												if (is_608_[i_633_] != 0) {
													is_605_[i_633_] += i_628_;
													is_606_[i_633_] += i_629_;
													is_607_[i_633_] += i_630_;
													is_608_[i_633_] += i_631_;
												}
											}
											i_628_ = is_597_[i_626_];
											i_629_ = is_598_[i_626_];
											i_630_ = is_599_[i_626_];
											i_631_ = is_600_[i_626_];
											i_622_ = (((Class387_Sub2) this).anIntArray8143[i_617_]);
											i_623_ = (((Class387_Sub2) this).anIntArray8143[i_617_ + 1]);
											for (int i_634_ = i_622_; i_634_ < i_623_; i_634_++) {
												int i_635_ = ((((Class387_Sub2) this).aShortArray8144[i_634_]) - 1);
												if (i_635_ == -1)
													break;
												if (is_604_[i_635_] != 0) {
													is_601_[i_635_] += i_628_;
													is_602_[i_635_] += i_629_;
													is_603_[i_635_] += i_630_;
													is_604_[i_635_] += i_631_;
												}
											}
											if ((((Class387_Sub2) this).aClass44_8127) == null && (((Class387_Sub2) this).aClass44_8105) != null)
												((Class44) (((Class387_Sub2) this).aClass44_8105)).anInterface1_441 = null;
											if ((((Class387_Sub2) this).aClass44_8127) != null)
												((Class44) (((Class387_Sub2) this).aClass44_8127)).anInterface1_441 = null;
											if ((((Class387_Sub2) class387_sub2_593_).aClass44_8127) == null && (((Class387_Sub2) class387_sub2_593_).aClass44_8105) != null)
												((Class44) (((Class387_Sub2) class387_sub2_593_).aClass44_8105)).anInterface1_441 = null;
											if ((((Class387_Sub2) class387_sub2_593_).aClass44_8127) != null)
												((Class44) (((Class387_Sub2) class387_sub2_593_).aClass44_8127)).anInterface1_441 = null;
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

	public boolean method4487() {
		if (((Class387_Sub2) this).modelTextures == null)
			return true;
		for (int i = 0; i < ((Class387_Sub2) this).modelTextures.length; i++) {
			if (((Class387_Sub2) this).modelTextures[i] != -1 && !(((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass73_8295.method835(((Class387_Sub2) this).modelTextures[i], -1)))
				return false;
		}
		return true;
	}

	public void method4467(Class387 class387, int i, int i_636_, int i_637_, boolean bool) {
		Class387_Sub2 class387_sub2_638_ = (Class387_Sub2) class387;
		if (((Class387_Sub2) this).anInt8089 != 0 && ((Class387_Sub2) class387_sub2_638_).anInt8089 != 0) {
			int i_639_ = ((Class387_Sub2) class387_sub2_638_).anInt8130;
			int[] is = ((Class387_Sub2) class387_sub2_638_).anIntArray8102;
			int[] is_640_ = ((Class387_Sub2) class387_sub2_638_).anIntArray8110;
			int[] is_641_ = ((Class387_Sub2) class387_sub2_638_).anIntArray8104;
			short[] is_642_ = ((Class387_Sub2) class387_sub2_638_).aShortArray8108;
			short[] is_643_ = ((Class387_Sub2) class387_sub2_638_).aShortArray8109;
			short[] is_644_ = ((Class387_Sub2) class387_sub2_638_).aShortArray8095;
			byte[] is_645_ = ((Class387_Sub2) class387_sub2_638_).aByteArray8118;
			short[] is_646_;
			short[] is_647_;
			short[] is_648_;
			byte[] is_649_;
			if (((Class387_Sub2) this).aClass68_8112 != null) {
				is_646_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray582);
				is_647_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray583);
				is_648_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray584);
				is_649_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aByteArray585);
			} else {
				is_646_ = null;
				is_647_ = null;
				is_648_ = null;
				is_649_ = null;
			}
			short[] is_650_;
			short[] is_651_;
			short[] is_652_;
			byte[] is_653_;
			if (((Class387_Sub2) class387_sub2_638_).aClass68_8112 != null) {
				is_650_ = ((Class68) (((Class387_Sub2) class387_sub2_638_).aClass68_8112)).aShortArray582;
				is_651_ = ((Class68) (((Class387_Sub2) class387_sub2_638_).aClass68_8112)).aShortArray583;
				is_652_ = ((Class68) (((Class387_Sub2) class387_sub2_638_).aClass68_8112)).aShortArray584;
				is_653_ = ((Class68) (((Class387_Sub2) class387_sub2_638_).aClass68_8112)).aByteArray585;
			} else {
				is_650_ = null;
				is_651_ = null;
				is_652_ = null;
				is_653_ = null;
			}
			int[] is_654_ = ((Class387_Sub2) class387_sub2_638_).anIntArray8143;
			short[] is_655_ = ((Class387_Sub2) class387_sub2_638_).aShortArray8144;
			if (!((Class387_Sub2) class387_sub2_638_).aBoolean8126)
				class387_sub2_638_.method4528();
			int i_656_ = ((Class387_Sub2) class387_sub2_638_).aShort8097;
			int i_657_ = ((Class387_Sub2) class387_sub2_638_).aShort8100;
			int i_658_ = ((Class387_Sub2) class387_sub2_638_).aShort8145;
			int i_659_ = ((Class387_Sub2) class387_sub2_638_).aShort8156;
			int i_660_ = ((Class387_Sub2) class387_sub2_638_).aShort8140;
			int i_661_ = ((Class387_Sub2) class387_sub2_638_).aShort8141;
			for (int i_662_ = 0; i_662_ < ((Class387_Sub2) this).anInt8130; i_662_++) {
				int i_663_ = ((Class387_Sub2) this).anIntArray8110[i_662_] - i_636_;
				if (i_663_ >= i_656_ && i_663_ <= i_657_) {
					int i_664_ = ((Class387_Sub2) this).anIntArray8102[i_662_] - i;
					if (i_664_ >= i_658_ && i_664_ <= i_659_) {
						int i_665_ = (((Class387_Sub2) this).anIntArray8104[i_662_] - i_637_);
						if (i_665_ >= i_660_ && i_665_ <= i_661_) {
							int i_666_ = -1;
							int i_667_ = (((Class387_Sub2) this).anIntArray8143[i_662_]);
							int i_668_ = (((Class387_Sub2) this).anIntArray8143[i_662_ + 1]);
							for (int i_669_ = i_667_; i_669_ < i_668_; i_669_++) {
								i_666_ = (((Class387_Sub2) this).aShortArray8144[i_669_]) - 1;
								if (i_666_ == -1 || (((Class387_Sub2) this).aByteArray8118[i_666_]) != 0)
									break;
							}
							if (i_666_ != -1) {
								for (int i_670_ = 0; i_670_ < i_639_; i_670_++) {
									if (i_664_ == is[i_670_] && i_665_ == is_641_[i_670_] && i_663_ == is_640_[i_670_]) {
										int i_671_ = -1;
										i_667_ = is_654_[i_670_];
										i_668_ = is_654_[i_670_ + 1];
										for (int i_672_ = i_667_; i_672_ < i_668_; i_672_++) {
											i_671_ = is_655_[i_672_] - 1;
											if (i_671_ == -1 || is_645_[i_671_] != 0)
												break;
										}
										if (i_671_ != -1) {
											if (is_646_ == null) {
												((Class387_Sub2) this).aClass68_8112 = new Class68();
												is_646_ = ((Class68) (((Class387_Sub2) this).aClass68_8112)).aShortArray582 = (Class263_Sub4.method2637((((Class387_Sub2) this).aShortArray8108), 1993273327));
												is_647_ = ((Class68) (((Class387_Sub2) this).aClass68_8112)).aShortArray583 = (Class263_Sub4.method2637((((Class387_Sub2) this).aShortArray8109), 2006989278));
												is_648_ = ((Class68) (((Class387_Sub2) this).aClass68_8112)).aShortArray584 = (Class263_Sub4.method2637((((Class387_Sub2) this).aShortArray8095), 2123123843));
												is_649_ = ((Class68) (((Class387_Sub2) this).aClass68_8112)).aByteArray585 = (IcmpService_Sub1.method6479((((Class387_Sub2) this).aByteArray8118), (byte) 2));
											}
											if (is_650_ == null) {
												Class68 class68 = (((Class387_Sub2) class387_sub2_638_).aClass68_8112 = new Class68());
												is_650_ = ((Class68) class68).aShortArray582 = (Class263_Sub4.method2637(is_642_, 1685405412));
												is_651_ = ((Class68) class68).aShortArray583 = (Class263_Sub4.method2637(is_643_, 1517185776));
												is_652_ = ((Class68) class68).aShortArray584 = (Class263_Sub4.method2637(is_644_, 1525886814));
												is_653_ = ((Class68) class68).aByteArray585 = (IcmpService_Sub1.method6479(is_645_, (byte) 2));
											}
											short i_673_ = (((Class387_Sub2) this).aShortArray8108[i_666_]);
											short i_674_ = (((Class387_Sub2) this).aShortArray8109[i_666_]);
											short i_675_ = (((Class387_Sub2) this).aShortArray8095[i_666_]);
											byte i_676_ = (((Class387_Sub2) this).aByteArray8118[i_666_]);
											i_667_ = is_654_[i_670_];
											i_668_ = is_654_[i_670_ + 1];
											for (int i_677_ = i_667_; i_677_ < i_668_; i_677_++) {
												int i_678_ = is_655_[i_677_] - 1;
												if (i_678_ == -1)
													break;
												if (is_653_[i_678_] != 0) {
													is_650_[i_678_] += i_673_;
													is_651_[i_678_] += i_674_;
													is_652_[i_678_] += i_675_;
													is_653_[i_678_] += i_676_;
												}
											}
											i_673_ = is_642_[i_671_];
											i_674_ = is_643_[i_671_];
											i_675_ = is_644_[i_671_];
											i_676_ = is_645_[i_671_];
											i_667_ = (((Class387_Sub2) this).anIntArray8143[i_662_]);
											i_668_ = (((Class387_Sub2) this).anIntArray8143[i_662_ + 1]);
											for (int i_679_ = i_667_; i_679_ < i_668_; i_679_++) {
												int i_680_ = ((((Class387_Sub2) this).aShortArray8144[i_679_]) - 1);
												if (i_680_ == -1)
													break;
												if (is_649_[i_680_] != 0) {
													is_646_[i_680_] += i_673_;
													is_647_[i_680_] += i_674_;
													is_648_[i_680_] += i_675_;
													is_649_[i_680_] += i_676_;
												}
											}
											if ((((Class387_Sub2) this).aClass44_8127) == null && (((Class387_Sub2) this).aClass44_8105) != null)
												((Class44) (((Class387_Sub2) this).aClass44_8105)).anInterface1_441 = null;
											if ((((Class387_Sub2) this).aClass44_8127) != null)
												((Class44) (((Class387_Sub2) this).aClass44_8127)).anInterface1_441 = null;
											if ((((Class387_Sub2) class387_sub2_638_).aClass44_8127) == null && (((Class387_Sub2) class387_sub2_638_).aClass44_8105) != null)
												((Class44) (((Class387_Sub2) class387_sub2_638_).aClass44_8105)).anInterface1_441 = null;
											if ((((Class387_Sub2) class387_sub2_638_).aClass44_8127) != null)
												((Class44) (((Class387_Sub2) class387_sub2_638_).aClass44_8127)).anInterface1_441 = null;
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

	public void br(int i) {
		int i_681_ = Class257.anIntArray2683[i];
		int i_682_ = Class257.anIntArray2684[i];
		for (int i_683_ = 0; i_683_ < ((Class387_Sub2) this).anInt8130; i_683_++) {
			int i_684_ = ((((Class387_Sub2) this).anIntArray8110[i_683_] * i_681_ + ((Class387_Sub2) this).anIntArray8102[i_683_] * i_682_) >> 14);
			((Class387_Sub2) this).anIntArray8110[i_683_] = ((((Class387_Sub2) this).anIntArray8110[i_683_] * i_682_ - ((Class387_Sub2) this).anIntArray8102[i_683_] * i_681_) >> 14);
			((Class387_Sub2) this).anIntArray8102[i_683_] = i_684_;
		}
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public int ah() {
		return ((Class387_Sub2) this).anInt8093;
	}

	public int av() {
		return ((Class387_Sub2) this).anInt8093;
	}

	public int ar() {
		return ((Class387_Sub2) this).anInt8093;
	}

	public boolean method4471() {
		if (((Class387_Sub2) this).modelTextures == null)
			return true;
		for (int i = 0; i < ((Class387_Sub2) this).modelTextures.length; i++) {
			if (((Class387_Sub2) this).modelTextures[i] != -1 && !(((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass73_8295.method835(((Class387_Sub2) this).modelTextures[i], -1)))
				return false;
		}
		return true;
	}

	public void au(int i) {
		((Class387_Sub2) this).anInt8093 = i;
		if (((Class387_Sub2) this).aClass68_8112 != null && (((Class387_Sub2) this).anInt8093 & 0x10000) == 0) {
			((Class387_Sub2) this).aShortArray8108 = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray582);
			((Class387_Sub2) this).aShortArray8109 = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray583);
			((Class387_Sub2) this).aShortArray8095 = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray584);
			((Class387_Sub2) this).aByteArray8118 = (((Class68) ((Class387_Sub2) this).aClass68_8112).aByteArray585);
			((Class387_Sub2) this).aClass68_8112 = null;
		}
		((Class387_Sub2) this).aBoolean8132 = true;
		method4518();
	}

	public boolean method4462() {
		if (((Class387_Sub2) this).modelTextures == null)
			return true;
		for (int i = 0; i < ((Class387_Sub2) this).modelTextures.length; i++) {
			if (((Class387_Sub2) this).modelTextures[i] != -1 && !(((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass73_8295.method835(((Class387_Sub2) this).modelTextures[i], -1)))
				return false;
		}
		return true;
	}

	public void ao(int i) {
		int i_685_ = Class257.anIntArray2683[i];
		int i_686_ = Class257.anIntArray2684[i];
		for (int i_687_ = 0; i_687_ < ((Class387_Sub2) this).anInt8130; i_687_++) {
			int i_688_ = ((((Class387_Sub2) this).anIntArray8104[i_687_] * i_685_ + ((Class387_Sub2) this).anIntArray8102[i_687_] * i_686_) >> 14);
			((Class387_Sub2) this).anIntArray8104[i_687_] = ((((Class387_Sub2) this).anIntArray8104[i_687_] * i_686_ - ((Class387_Sub2) this).anIntArray8102[i_687_] * i_685_) >> 14);
			((Class387_Sub2) this).anIntArray8102[i_687_] = i_688_;
		}
		for (int i_689_ = 0; i_689_ < ((Class387_Sub2) this).anInt8107; i_689_++) {
			int i_690_ = ((((Class387_Sub2) this).aShortArray8095[i_689_] * i_685_ + ((Class387_Sub2) this).aShortArray8108[i_689_] * i_686_) >> 14);
			((Class387_Sub2) this).aShortArray8095[i_689_] = (short) (((((Class387_Sub2) this).aShortArray8095[i_689_] * i_686_) - (((Class387_Sub2) this).aShortArray8108[i_689_] * i_685_)) >> 14);
			((Class387_Sub2) this).aShortArray8108[i_689_] = (short) i_690_;
		}
		if (((Class387_Sub2) this).aClass44_8127 == null && ((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass44_8127 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public int cz() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).anInt8134;
	}

	public void method4475(Class247 class247, Class80 class80, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (((Class387_Sub2) this).anInt8107 != 0) {
			Class249 class249 = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass249_8332);
			Class249 class249_691_ = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass249_8430);
			Class249 class249_692_ = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass249_8347);
			class249_691_.method2508(class247);
			class249_692_.method2510(class249_691_);
			class249_692_.method2483(((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aClass249_8422);
			if (!((Class387_Sub2) this).aBoolean8126)
				method4528();
			float[] fs = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloatArray8260);
			class249_691_.method2511(0.0F, (float) ((Class387_Sub2) this).aShort8097, 0.0F, fs);
			float f = fs[0];
			float f_693_ = fs[1];
			float f_694_ = fs[2];
			class249_691_.method2511(0.0F, (float) ((Class387_Sub2) this).aShort8100, 0.0F, fs);
			float f_695_ = fs[0];
			float f_696_ = fs[1];
			float f_697_ = fs[2];
			for (int i_698_ = 0; i_698_ < 6; i_698_++) {
				float[] fs_699_ = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloatArrayArray8303[i_698_]);
				float f_700_ = (fs_699_[0] * f + fs_699_[1] * f_693_ + fs_699_[2] * f_694_ + fs_699_[3] + (float) ((Class387_Sub2) this).anInt8134);
				float f_701_ = (fs_699_[0] * f_695_ + fs_699_[1] * f_696_ + fs_699_[2] * f_697_ + fs_699_[3] + (float) ((Class387_Sub2) this).anInt8134);
				if (f_700_ < 0.0F && f_701_ < 0.0F)
					return;
			}
			if (class80 != null) {
				boolean bool = false;
				boolean bool_702_ = true;
				int i_703_ = ((((Class387_Sub2) this).aShort8145 + ((Class387_Sub2) this).aShort8156) >> 1);
				int i_704_ = ((((Class387_Sub2) this).aShort8140 + ((Class387_Sub2) this).aShort8141) >> 1);
				int i_705_ = i_703_;
				short i_706_ = ((Class387_Sub2) this).aShort8097;
				int i_707_ = i_704_;
				float f_708_ = (class249_692_.aFloatArray2631[0] * (float) i_705_ + class249_692_.aFloatArray2631[4] * (float) i_706_ + class249_692_.aFloatArray2631[8] * (float) i_707_ + class249_692_.aFloatArray2631[12]);
				float f_709_ = (class249_692_.aFloatArray2631[1] * (float) i_705_ + class249_692_.aFloatArray2631[5] * (float) i_706_ + class249_692_.aFloatArray2631[9] * (float) i_707_ + class249_692_.aFloatArray2631[13]);
				float f_710_ = (class249_692_.aFloatArray2631[2] * (float) i_705_ + class249_692_.aFloatArray2631[6] * (float) i_706_ + class249_692_.aFloatArray2631[10] * (float) i_707_ + class249_692_.aFloatArray2631[14]);
				float f_711_ = (class249_692_.aFloatArray2631[3] * (float) i_705_ + class249_692_.aFloatArray2631[7] * (float) i_706_ + class249_692_.aFloatArray2631[11] * (float) i_707_ + class249_692_.aFloatArray2631[15]);
				if (f_710_ >= -f_711_) {
					class80.anInt669 = (int) ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloat8337) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338) * f_708_ / f_711_);
					class80.anInt670 = (int) ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloat8339) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8340) * f_709_ / f_711_);
				} else
					bool = true;
				i_705_ = i_703_;
				i_706_ = ((Class387_Sub2) this).aShort8100;
				i_707_ = i_704_;
				float f_712_ = (class249_692_.aFloatArray2631[0] * (float) i_705_ + class249_692_.aFloatArray2631[4] * (float) i_706_ + class249_692_.aFloatArray2631[8] * (float) i_707_ + class249_692_.aFloatArray2631[12]);
				float f_713_ = (class249_692_.aFloatArray2631[1] * (float) i_705_ + class249_692_.aFloatArray2631[5] * (float) i_706_ + class249_692_.aFloatArray2631[9] * (float) i_707_ + class249_692_.aFloatArray2631[13]);
				float f_714_ = (class249_692_.aFloatArray2631[2] * (float) i_705_ + class249_692_.aFloatArray2631[6] * (float) i_706_ + class249_692_.aFloatArray2631[10] * (float) i_707_ + class249_692_.aFloatArray2631[14]);
				float f_715_ = (class249_692_.aFloatArray2631[3] * (float) i_705_ + class249_692_.aFloatArray2631[7] * (float) i_706_ + class249_692_.aFloatArray2631[11] * (float) i_707_ + class249_692_.aFloatArray2631[15]);
				if (f_714_ >= -f_715_) {
					class80.anInt668 = (int) ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloat8337) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338) * f_712_ / f_715_);
					class80.anInt672 = (int) ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloat8339) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8340) * f_713_ / f_715_);
				} else
					bool = true;
				if (bool) {
					if (f_710_ < -f_711_ && f_714_ < -f_715_)
						bool_702_ = false;
					else if (f_710_ < -f_711_) {
						float f_716_ = (f_710_ + f_711_) / (f_714_ + f_715_) - 1.0F;
						float f_717_ = f_708_ + f_716_ * (f_712_ - f_708_);
						float f_718_ = f_709_ + f_716_ * (f_713_ - f_709_);
						float f_719_ = f_711_ + f_716_ * (f_715_ - f_711_);
						class80.anInt669 = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8337) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338 * f_717_ / f_719_));
						class80.anInt670 = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8339) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8340 * f_718_ / f_719_));
					} else if (f_714_ < -f_715_) {
						float f_720_ = (f_714_ + f_715_) / (f_710_ + f_711_) - 1.0F;
						float f_721_ = f_712_ + f_720_ * (f_708_ - f_712_);
						float f_722_ = f_713_ + f_720_ * (f_709_ - f_713_);
						float f_723_ = f_715_ + f_720_ * (f_711_ - f_715_);
						class80.anInt668 = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8337) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338 * f_721_ / f_723_));
						class80.anInt672 = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8339) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8340 * f_722_ / f_723_));
					}
				}
				if (bool_702_) {
					if (f_710_ / f_711_ > f_714_ / f_715_) {
						float f_724_ = (f_708_ + (class249.aFloatArray2631[0] * (float) ((Class387_Sub2) this).anInt8134) + class249.aFloatArray2631[12]);
						float f_725_ = (f_711_ + (class249.aFloatArray2631[3] * (float) ((Class387_Sub2) this).anInt8134) + class249.aFloatArray2631[15]);
						class80.anInt673 = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8337) - (float) class80.anInt669 + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338 * f_724_ / f_725_));
					} else {
						float f_726_ = (f_712_ + (class249.aFloatArray2631[0] * (float) ((Class387_Sub2) this).anInt8134) + class249.aFloatArray2631[12]);
						float f_727_ = (f_715_ + (class249.aFloatArray2631[3] * (float) ((Class387_Sub2) this).anInt8134) + class249.aFloatArray2631[15]);
						class80.anInt673 = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8337) - (float) class80.anInt668 + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338 * f_726_ / f_727_));
					}
					class80.aBoolean671 = true;
				}
			}
			((Class387_Sub2) this).aClass_ra_Sub1_8092.method4840();
			((Class387_Sub2) this).aClass_ra_Sub1_8092.method4821(class249_691_);
			method4520();
			((Class387_Sub2) this).aClass_ra_Sub1_8092.method4876();
			class249_691_.method2483(((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aClass249_8378);
			method4522(class249_691_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	void method4525(Class_na_Sub2 class_na_sub2) {
		if ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anIntArray8291).length < ((Class387_Sub2) this).anInt8107) {
			((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anIntArray8291 = new int[((Class387_Sub2) this).anInt8107];
			((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anIntArray8427 = new int[((Class387_Sub2) this).anInt8107];
		}
		int[] is = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anIntArray8291);
		int[] is_728_ = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anIntArray8427);
		for (int i = 0; i < ((Class387_Sub2) this).anInt8130; i++) {
			int i_729_ = (((((Class387_Sub2) this).anIntArray8102[i] - ((((Class387_Sub2) this).anIntArray8110[i] * ((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).anInt8410) >> 8)) >> ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8296) - ((Class_na_Sub2) class_na_sub2).anInt10165);
			int i_730_ = (((((Class387_Sub2) this).anIntArray8104[i] - ((((Class387_Sub2) this).anIntArray8110[i] * ((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).anInt8379) >> 8)) >> ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8296) - ((Class_na_Sub2) class_na_sub2).anInt10161);
			int i_731_ = ((Class387_Sub2) this).anIntArray8143[i];
			int i_732_ = ((Class387_Sub2) this).anIntArray8143[i + 1];
			for (int i_733_ = i_731_; i_733_ < i_732_; i_733_++) {
				int i_734_ = ((((Class387_Sub2) this).aShortArray8144[i_733_] & 0xffff) - 1);
				if (i_734_ == -1)
					break;
				is[i_734_] = i_729_;
				is_728_[i_734_] = i_730_;
			}
		}
		for (int i = 0; i < ((Class387_Sub2) this).anInt8116; i++) {
			if (((Class387_Sub2) this).aByteArray8136 == null || ((Class387_Sub2) this).aByteArray8136[i] <= 128) {
				int i_735_ = ((Class387_Sub2) this).aShortArray8119[i] & 0xffff;
				int i_736_ = ((Class387_Sub2) this).aShortArray8120[i] & 0xffff;
				int i_737_ = ((Class387_Sub2) this).aShortArray8121[i] & 0xffff;
				int i_738_ = is[i_735_];
				int i_739_ = is[i_736_];
				int i_740_ = is[i_737_];
				int i_741_ = is_728_[i_735_];
				int i_742_ = is_728_[i_736_];
				int i_743_ = is_728_[i_737_];
				if (((i_738_ - i_739_) * (i_742_ - i_743_) - (i_742_ - i_741_) * (i_740_ - i_739_)) > 0)
					class_na_sub2.method3529(i_741_, i_742_, i_743_, i_738_, i_739_, i_740_);
			}
		}
	}

	public void bc(int i) {
		int i_744_ = Class257.anIntArray2683[i];
		int i_745_ = Class257.anIntArray2684[i];
		for (int i_746_ = 0; i_746_ < ((Class387_Sub2) this).anInt8130; i_746_++) {
			int i_747_ = ((((Class387_Sub2) this).anIntArray8110[i_746_] * i_745_ - ((Class387_Sub2) this).anIntArray8104[i_746_] * i_744_) >> 14);
			((Class387_Sub2) this).anIntArray8104[i_746_] = ((((Class387_Sub2) this).anIntArray8110[i_746_] * i_744_ + ((Class387_Sub2) this).anIntArray8104[i_746_] * i_745_) >> 14);
			((Class387_Sub2) this).anIntArray8110[i_746_] = i_747_;
		}
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public void bf(int i) {
		int i_748_ = Class257.anIntArray2683[i];
		int i_749_ = Class257.anIntArray2684[i];
		for (int i_750_ = 0; i_750_ < ((Class387_Sub2) this).anInt8130; i_750_++) {
			int i_751_ = ((((Class387_Sub2) this).anIntArray8110[i_750_] * i_748_ + ((Class387_Sub2) this).anIntArray8102[i_750_] * i_749_) >> 14);
			((Class387_Sub2) this).anIntArray8110[i_750_] = ((((Class387_Sub2) this).anIntArray8110[i_750_] * i_749_ - ((Class387_Sub2) this).anIntArray8102[i_750_] * i_748_) >> 14);
			((Class387_Sub2) this).anIntArray8102[i_750_] = i_751_;
		}
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public void bl(int i) {
		int i_752_ = Class257.anIntArray2683[i];
		int i_753_ = Class257.anIntArray2684[i];
		for (int i_754_ = 0; i_754_ < ((Class387_Sub2) this).anInt8130; i_754_++) {
			int i_755_ = ((((Class387_Sub2) this).anIntArray8110[i_754_] * i_752_ + ((Class387_Sub2) this).anIntArray8102[i_754_] * i_753_) >> 14);
			((Class387_Sub2) this).anIntArray8110[i_754_] = ((((Class387_Sub2) this).anIntArray8110[i_754_] * i_753_ - ((Class387_Sub2) this).anIntArray8102[i_754_] * i_752_) >> 14);
			((Class387_Sub2) this).anIntArray8102[i_754_] = i_755_;
		}
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public void bk(int i) {
		int i_756_ = Class257.anIntArray2683[i];
		int i_757_ = Class257.anIntArray2684[i];
		for (int i_758_ = 0; i_758_ < ((Class387_Sub2) this).anInt8130; i_758_++) {
			int i_759_ = ((((Class387_Sub2) this).anIntArray8110[i_758_] * i_756_ + ((Class387_Sub2) this).anIntArray8102[i_758_] * i_757_) >> 14);
			((Class387_Sub2) this).anIntArray8110[i_758_] = ((((Class387_Sub2) this).anIntArray8110[i_758_] * i_757_ - ((Class387_Sub2) this).anIntArray8102[i_758_] * i_756_) >> 14);
			((Class387_Sub2) this).anIntArray8102[i_758_] = i_759_;
		}
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public int ya() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).aShort8156;
	}

	public void bi(int i, int i_760_, int i_761_) {
		for (int i_762_ = 0; i_762_ < ((Class387_Sub2) this).anInt8130; i_762_++) {
			if (i != 0)
				((Class387_Sub2) this).anIntArray8102[i_762_] += i;
			if (i_760_ != 0)
				((Class387_Sub2) this).anIntArray8110[i_762_] += i_760_;
			if (i_761_ != 0)
				((Class387_Sub2) this).anIntArray8104[i_762_] += i_761_;
		}
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public void method4491() {
		if (((Class387_Sub2) this).anInt8107 > 0 && ((Class387_Sub2) this).anInt8116 > 0) {
			method4527(false);
			if ((((Class387_Sub2) this).aByte8138 & 0x10) == 0 && (((Class37) ((Class387_Sub2) this).aClass37_8087).anInterface3_382) == null)
				method4523(false);
			method4518();
		}
	}

	public int cd() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).aShort8156;
	}

	public void by(int i, int i_763_, Class_xa class_xa, Class_xa class_xa_764_, int i_765_, int i_766_, int i_767_) {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		int i_768_ = i_765_ + ((Class387_Sub2) this).aShort8145;
		int i_769_ = i_765_ + ((Class387_Sub2) this).aShort8156;
		int i_770_ = i_767_ + ((Class387_Sub2) this).aShort8140;
		int i_771_ = i_767_ + ((Class387_Sub2) this).aShort8141;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_768_ >= 0 && ((i_769_ + class_xa.anInt6395 * 550173571 >> class_xa.anInt6396 * -1066304221) < class_xa.anInt6397 * 1972554729) && i_770_ >= 0 && ((i_771_ + class_xa.anInt6395 * 550173571 >> class_xa.anInt6396 * -1066304221) < class_xa.anInt6393 * 24567321))) {
			if (i == 4 || i == 5) {
				if (class_xa_764_ == null || (i_768_ < 0 || ((i_769_ + class_xa_764_.anInt6395 * 550173571 >> class_xa_764_.anInt6396 * -1066304221) >= class_xa_764_.anInt6397 * 1972554729) || i_770_ < 0 || ((i_771_ + class_xa_764_.anInt6395 * 550173571 >> class_xa_764_.anInt6396 * -1066304221) >= class_xa_764_.anInt6393 * 24567321)))
					return;
			} else {
				i_768_ >>= class_xa.anInt6396 * -1066304221;
				i_769_ = (i_769_ + (class_xa.anInt6395 * 550173571 - 1) >> class_xa.anInt6396 * -1066304221);
				i_770_ >>= class_xa.anInt6396 * -1066304221;
				i_771_ = (i_771_ + (class_xa.anInt6395 * 550173571 - 1) >> class_xa.anInt6396 * -1066304221);
				if (class_xa.method6417(i_768_, i_770_, 1669346661) == i_766_ && class_xa.method6417(i_769_, i_770_, 374823114) == i_766_ && class_xa.method6417(i_768_, i_771_, 613202000) == i_766_ && (class_xa.method6417(i_769_, i_771_, 1921271324) == i_766_))
					return;
			}
			if (i == 1) {
				for (int i_772_ = 0; i_772_ < ((Class387_Sub2) this).anInt8130; i_772_++)
					((Class387_Sub2) this).anIntArray8110[i_772_] = (((Class387_Sub2) this).anIntArray8110[i_772_] + class_xa.method6416(((((Class387_Sub2) this).anIntArray8102[i_772_]) + i_765_), ((((Class387_Sub2) this).anIntArray8104[i_772_]) + i_767_), -1377551655) - i_766_);
			} else if (i == 2) {
				int i_773_ = ((Class387_Sub2) this).aShort8097;
				if (i_773_ == 0)
					return;
				for (int i_774_ = 0; i_774_ < ((Class387_Sub2) this).anInt8130; i_774_++) {
					int i_775_ = (((Class387_Sub2) this).anIntArray8110[i_774_] << 16) / i_773_;
					if (i_775_ < i_763_)
						((Class387_Sub2) this).anIntArray8110[i_774_] = (((Class387_Sub2) this).anIntArray8110[i_774_] + (class_xa.method6416((((Class387_Sub2) this).anIntArray8102[i_774_]) + i_765_, (((Class387_Sub2) this).anIntArray8104[i_774_]) + i_767_, 204744446) - i_766_) * (i_763_ - i_775_) / i_763_);
				}
			} else if (i == 3) {
				int i_776_ = (i_763_ & 0xff) * 4;
				int i_777_ = (i_763_ >> 8 & 0xff) * 4;
				int i_778_ = (i_763_ >> 16 & 0xff) << 6;
				int i_779_ = (i_763_ >> 24 & 0xff) << 6;
				if (i_765_ - (i_776_ >> 1) < 0 || (i_765_ + (i_776_ >> 1) + class_xa.anInt6395 * 550173571 >= (class_xa.anInt6397 * 1972554729 << class_xa.anInt6396 * -1066304221)) || i_767_ - (i_777_ >> 1) < 0 || (i_767_ + (i_777_ >> 1) + class_xa.anInt6395 * 550173571 >= (class_xa.anInt6393 * 24567321 << class_xa.anInt6396 * -1066304221)))
					return;
				method4447(class_xa, i_765_, i_766_, i_767_, i_776_, i_777_, i_778_, i_779_);
			} else if (i == 4) {
				int i_780_ = (((Class387_Sub2) this).aShort8100 - ((Class387_Sub2) this).aShort8097);
				for (int i_781_ = 0; i_781_ < ((Class387_Sub2) this).anInt8130; i_781_++)
					((Class387_Sub2) this).anIntArray8110[i_781_] = (((Class387_Sub2) this).anIntArray8110[i_781_] + (class_xa_764_.method6416((((Class387_Sub2) this).anIntArray8102[i_781_]) + i_765_, (((Class387_Sub2) this).anIntArray8104[i_781_]) + i_767_, -1744871713) - i_766_) + i_780_);
			} else if (i == 5) {
				int i_782_ = (((Class387_Sub2) this).aShort8100 - ((Class387_Sub2) this).aShort8097);
				for (int i_783_ = 0; i_783_ < ((Class387_Sub2) this).anInt8130; i_783_++) {
					int i_784_ = (((Class387_Sub2) this).anIntArray8102[i_783_] + i_765_);
					int i_785_ = (((Class387_Sub2) this).anIntArray8104[i_783_] + i_767_);
					int i_786_ = class_xa.method6416(i_784_, i_785_, -1182302202);
					int i_787_ = class_xa_764_.method6416(i_784_, i_785_, -1203357873);
					int i_788_ = i_786_ - i_787_ - i_763_;
					((Class387_Sub2) this).anIntArray8110[i_783_] = ((((Class387_Sub2) this).anIntArray8110[i_783_] << 8) / i_782_ * i_788_ >> 8) - (i_766_ - i_786_);
				}
			}
			if (((Class387_Sub2) this).aClass44_8125 != null)
				((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
			((Class387_Sub2) this).aBoolean8126 = false;
		}
	}

	void method4472() {
		/* empty */
	}

	void bx() {
		for (int i = 0; i < ((Class387_Sub2) this).anInt8115; i++) {
			((Class387_Sub2) this).anIntArray8102[i] = ((Class387_Sub2) this).anIntArray8102[i] + 7 >> 4;
			((Class387_Sub2) this).anIntArray8110[i] = ((Class387_Sub2) this).anIntArray8110[i] + 7 >> 4;
			((Class387_Sub2) this).anIntArray8104[i] = ((Class387_Sub2) this).anIntArray8104[i] + 7 >> 4;
		}
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	void method4473(int i, int[] is, int i_789_, int i_790_, int i_791_, int i_792_, boolean bool) {
		int i_793_ = is.length;
		if (i == 0) {
			i_789_ <<= 4;
			i_790_ <<= 4;
			i_791_ <<= 4;
			int i_794_ = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (int i_795_ = 0; i_795_ < i_793_; i_795_++) {
				int i_796_ = is[i_795_];
				if (i_796_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_797_ = ((Class387_Sub2) this).anIntArrayArray8113[i_796_];
					for (int i_798_ = 0; i_798_ < is_797_.length; i_798_++) {
						int i_799_ = is_797_[i_798_];
						anInt8101 += ((Class387_Sub2) this).anIntArray8102[i_799_];
						anInt8111 += ((Class387_Sub2) this).anIntArray8110[i_799_];
						anInt8158 += ((Class387_Sub2) this).anIntArray8104[i_799_];
						i_794_++;
					}
				}
			}
			if (i_794_ > 0) {
				anInt8101 = anInt8101 / i_794_ + i_789_;
				anInt8111 = anInt8111 / i_794_ + i_790_;
				anInt8158 = anInt8158 / i_794_ + i_791_;
			} else {
				anInt8101 = i_789_;
				anInt8111 = i_790_;
				anInt8158 = i_791_;
			}
		} else if (i == 1) {
			i_789_ <<= 4;
			i_790_ <<= 4;
			i_791_ <<= 4;
			for (int i_800_ = 0; i_800_ < i_793_; i_800_++) {
				int i_801_ = is[i_800_];
				if (i_801_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_802_ = ((Class387_Sub2) this).anIntArrayArray8113[i_801_];
					for (int i_803_ = 0; i_803_ < is_802_.length; i_803_++) {
						int i_804_ = is_802_[i_803_];
						((Class387_Sub2) this).anIntArray8102[i_804_] += i_789_;
						((Class387_Sub2) this).anIntArray8110[i_804_] += i_790_;
						((Class387_Sub2) this).anIntArray8104[i_804_] += i_791_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_805_ = 0; i_805_ < i_793_; i_805_++) {
				int i_806_ = is[i_805_];
				if (i_806_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_807_ = ((Class387_Sub2) this).anIntArrayArray8113[i_806_];
					if ((i_792_ & 0x1) == 0) {
						for (int i_808_ = 0; i_808_ < is_807_.length; i_808_++) {
							int i_809_ = is_807_[i_808_];
							((Class387_Sub2) this).anIntArray8102[i_809_] -= anInt8101;
							((Class387_Sub2) this).anIntArray8110[i_809_] -= anInt8111;
							((Class387_Sub2) this).anIntArray8104[i_809_] -= anInt8158;
							if (i_791_ != 0) {
								int i_810_ = Class257.anIntArray2683[i_791_];
								int i_811_ = Class257.anIntArray2684[i_791_];
								int i_812_ = (((((Class387_Sub2) this).anIntArray8110[i_809_]) * i_810_ + (((Class387_Sub2) this).anIntArray8102[i_809_]) * i_811_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8110[i_809_] = ((((Class387_Sub2) this).anIntArray8110[i_809_]) * i_811_ - (((Class387_Sub2) this).anIntArray8102[i_809_]) * i_810_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8102[i_809_] = i_812_;
							}
							if (i_789_ != 0) {
								int i_813_ = Class257.anIntArray2683[i_789_];
								int i_814_ = Class257.anIntArray2684[i_789_];
								int i_815_ = (((((Class387_Sub2) this).anIntArray8110[i_809_]) * i_814_ - (((Class387_Sub2) this).anIntArray8104[i_809_]) * i_813_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8104[i_809_] = ((((Class387_Sub2) this).anIntArray8110[i_809_]) * i_813_ + (((Class387_Sub2) this).anIntArray8104[i_809_]) * i_814_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8110[i_809_] = i_815_;
							}
							if (i_790_ != 0) {
								int i_816_ = Class257.anIntArray2683[i_790_];
								int i_817_ = Class257.anIntArray2684[i_790_];
								int i_818_ = (((((Class387_Sub2) this).anIntArray8104[i_809_]) * i_816_ + (((Class387_Sub2) this).anIntArray8102[i_809_]) * i_817_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8104[i_809_] = ((((Class387_Sub2) this).anIntArray8104[i_809_]) * i_817_ - (((Class387_Sub2) this).anIntArray8102[i_809_]) * i_816_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8102[i_809_] = i_818_;
							}
							((Class387_Sub2) this).anIntArray8102[i_809_] += anInt8101;
							((Class387_Sub2) this).anIntArray8110[i_809_] += anInt8111;
							((Class387_Sub2) this).anIntArray8104[i_809_] += anInt8158;
						}
					} else {
						for (int i_819_ = 0; i_819_ < is_807_.length; i_819_++) {
							int i_820_ = is_807_[i_819_];
							((Class387_Sub2) this).anIntArray8102[i_820_] -= anInt8101;
							((Class387_Sub2) this).anIntArray8110[i_820_] -= anInt8111;
							((Class387_Sub2) this).anIntArray8104[i_820_] -= anInt8158;
							if (i_789_ != 0) {
								int i_821_ = Class257.anIntArray2683[i_789_];
								int i_822_ = Class257.anIntArray2684[i_789_];
								int i_823_ = (((((Class387_Sub2) this).anIntArray8110[i_820_]) * i_822_ - (((Class387_Sub2) this).anIntArray8104[i_820_]) * i_821_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8104[i_820_] = ((((Class387_Sub2) this).anIntArray8110[i_820_]) * i_821_ + (((Class387_Sub2) this).anIntArray8104[i_820_]) * i_822_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8110[i_820_] = i_823_;
							}
							if (i_791_ != 0) {
								int i_824_ = Class257.anIntArray2683[i_791_];
								int i_825_ = Class257.anIntArray2684[i_791_];
								int i_826_ = (((((Class387_Sub2) this).anIntArray8110[i_820_]) * i_824_ + (((Class387_Sub2) this).anIntArray8102[i_820_]) * i_825_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8110[i_820_] = ((((Class387_Sub2) this).anIntArray8110[i_820_]) * i_825_ - (((Class387_Sub2) this).anIntArray8102[i_820_]) * i_824_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8102[i_820_] = i_826_;
							}
							if (i_790_ != 0) {
								int i_827_ = Class257.anIntArray2683[i_790_];
								int i_828_ = Class257.anIntArray2684[i_790_];
								int i_829_ = (((((Class387_Sub2) this).anIntArray8104[i_820_]) * i_827_ + (((Class387_Sub2) this).anIntArray8102[i_820_]) * i_828_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8104[i_820_] = ((((Class387_Sub2) this).anIntArray8104[i_820_]) * i_828_ - (((Class387_Sub2) this).anIntArray8102[i_820_]) * i_827_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8102[i_820_] = i_829_;
							}
							((Class387_Sub2) this).anIntArray8102[i_820_] += anInt8101;
							((Class387_Sub2) this).anIntArray8110[i_820_] += anInt8111;
							((Class387_Sub2) this).anIntArray8104[i_820_] += anInt8158;
						}
					}
				}
			}
			if (bool) {
				for (int i_830_ = 0; i_830_ < i_793_; i_830_++) {
					int i_831_ = is[i_830_];
					if (i_831_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_832_ = (((Class387_Sub2) this).anIntArrayArray8113[i_831_]);
						for (int i_833_ = 0; i_833_ < is_832_.length; i_833_++) {
							int i_834_ = is_832_[i_833_];
							int i_835_ = (((Class387_Sub2) this).anIntArray8143[i_834_]);
							int i_836_ = (((Class387_Sub2) this).anIntArray8143[i_834_ + 1]);
							for (int i_837_ = i_835_; i_837_ < i_836_; i_837_++) {
								int i_838_ = ((((Class387_Sub2) this).aShortArray8144[i_837_]) - 1);
								if (i_838_ == -1)
									break;
								if (i_791_ != 0) {
									int i_839_ = Class257.anIntArray2683[i_791_];
									int i_840_ = Class257.anIntArray2684[i_791_];
									int i_841_ = (((((Class387_Sub2) this).aShortArray8109[i_838_]) * i_839_ + ((((Class387_Sub2) this).aShortArray8108[i_838_]) * i_840_) + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8109[i_838_] = (short) ((((((Class387_Sub2) this).aShortArray8109[i_838_]) * i_840_) - (((Class387_Sub2) this).aShortArray8108[i_838_]) * i_839_ + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8108[i_838_] = (short) i_841_;
								}
								if (i_789_ != 0) {
									int i_842_ = Class257.anIntArray2683[i_789_];
									int i_843_ = Class257.anIntArray2684[i_789_];
									int i_844_ = (((((Class387_Sub2) this).aShortArray8109[i_838_]) * i_843_ - ((((Class387_Sub2) this).aShortArray8095[i_838_]) * i_842_) + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8095[i_838_] = (short) ((((((Class387_Sub2) this).aShortArray8109[i_838_]) * i_842_) + (((Class387_Sub2) this).aShortArray8095[i_838_]) * i_843_ + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8109[i_838_] = (short) i_844_;
								}
								if (i_790_ != 0) {
									int i_845_ = Class257.anIntArray2683[i_790_];
									int i_846_ = Class257.anIntArray2684[i_790_];
									int i_847_ = (((((Class387_Sub2) this).aShortArray8095[i_838_]) * i_845_ + ((((Class387_Sub2) this).aShortArray8108[i_838_]) * i_846_) + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8095[i_838_] = (short) ((((((Class387_Sub2) this).aShortArray8095[i_838_]) * i_846_) - (((Class387_Sub2) this).aShortArray8108[i_838_]) * i_845_ + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8108[i_838_] = (short) i_847_;
								}
							}
						}
					}
				}
				if (((Class387_Sub2) this).aClass44_8127 == null && ((Class387_Sub2) this).aClass44_8105 != null)
					((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
				if (((Class387_Sub2) this).aClass44_8127 != null)
					((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = null;
			}
		} else if (i == 3) {
			for (int i_848_ = 0; i_848_ < i_793_; i_848_++) {
				int i_849_ = is[i_848_];
				if (i_849_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_850_ = ((Class387_Sub2) this).anIntArrayArray8113[i_849_];
					for (int i_851_ = 0; i_851_ < is_850_.length; i_851_++) {
						int i_852_ = is_850_[i_851_];
						((Class387_Sub2) this).anIntArray8102[i_852_] -= anInt8101;
						((Class387_Sub2) this).anIntArray8110[i_852_] -= anInt8111;
						((Class387_Sub2) this).anIntArray8104[i_852_] -= anInt8158;
						((Class387_Sub2) this).anIntArray8102[i_852_] = (((Class387_Sub2) this).anIntArray8102[i_852_] * i_789_) >> 7;
						((Class387_Sub2) this).anIntArray8110[i_852_] = (((Class387_Sub2) this).anIntArray8110[i_852_] * i_790_) >> 7;
						((Class387_Sub2) this).anIntArray8104[i_852_] = (((Class387_Sub2) this).anIntArray8104[i_852_] * i_791_) >> 7;
						((Class387_Sub2) this).anIntArray8102[i_852_] += anInt8101;
						((Class387_Sub2) this).anIntArray8110[i_852_] += anInt8111;
						((Class387_Sub2) this).anIntArray8104[i_852_] += anInt8158;
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub2) this).anIntArrayArray8123 != null) {
				for (int i_853_ = 0; i_853_ < i_793_; i_853_++) {
					int i_854_ = is[i_853_];
					if (i_854_ < ((Class387_Sub2) this).anIntArrayArray8123.length) {
						int[] is_855_ = (((Class387_Sub2) this).anIntArrayArray8123[i_854_]);
						for (int i_856_ = 0; i_856_ < is_855_.length; i_856_++) {
							int i_857_ = is_855_[i_856_];
							int i_858_ = (((((Class387_Sub2) this).aByteArray8136[i_857_]) & 0xff) + i_789_ * 8);
							if (i_858_ < 0)
								i_858_ = 0;
							else if (i_858_ > 255)
								i_858_ = 255;
							((Class387_Sub2) this).aByteArray8136[i_857_] = (byte) i_858_;
						}
						if (is_855_.length > 0 && ((Class387_Sub2) this).aClass44_8105 != null)
							((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
					}
				}
				if (((Class387_Sub2) this).aClass52Array8148 != null) {
					for (int i_859_ = 0; i_859_ < ((Class387_Sub2) this).anInt8147; i_859_++) {
						Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_859_];
						Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_859_];
						((Class40) class40).anInt428 = (((Class40) class40).anInt428 & 0xffffff | 255 - ((((Class387_Sub2) this).aByteArray8136[((Class52) class52).modelColorIndex]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub2) this).anIntArrayArray8123 != null) {
				for (int i_860_ = 0; i_860_ < i_793_; i_860_++) {
					int i_861_ = is[i_860_];
					if (i_861_ < ((Class387_Sub2) this).anIntArrayArray8123.length) {
						int[] is_862_ = (((Class387_Sub2) this).anIntArrayArray8123[i_861_]);
						for (int i_863_ = 0; i_863_ < is_862_.length; i_863_++) {
							int i_864_ = is_862_[i_863_];
							int i_865_ = ((((Class387_Sub2) this).modelColors[i_864_]) & 0xffff);
							int i_866_ = i_865_ >> 10 & 0x3f;
							int i_867_ = i_865_ >> 7 & 0x7;
							int i_868_ = i_865_ & 0x7f;
							i_866_ = i_866_ + i_789_ & 0x3f;
							i_867_ += i_790_ / 4;
							if (i_867_ < 0)
								i_867_ = 0;
							else if (i_867_ > 7)
								i_867_ = 7;
							i_868_ += i_791_;
							if (i_868_ < 0)
								i_868_ = 0;
							else if (i_868_ > 127)
								i_868_ = 127;
							((Class387_Sub2) this).modelColors[i_864_] = (short) (i_866_ << 10 | i_867_ << 7 | i_868_);
						}
						if (is_862_.length > 0 && ((Class387_Sub2) this).aClass44_8105 != null)
							((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
					}
				}
				if (((Class387_Sub2) this).aClass52Array8148 != null) {
					for (int i_869_ = 0; i_869_ < ((Class387_Sub2) this).anInt8147; i_869_++) {
						Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_869_];
						Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_869_];
						((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_870_ = 0; i_870_ < i_793_; i_870_++) {
					int i_871_ = is[i_870_];
					if (i_871_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_872_ = (((Class387_Sub2) this).anIntArrayArray8150[i_871_]);
						for (int i_873_ = 0; i_873_ < is_872_.length; i_873_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_872_[i_873_]]);
							((Class40) class40).anInt425 += i_789_;
							((Class40) class40).anInt427 += i_790_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_874_ = 0; i_874_ < i_793_; i_874_++) {
					int i_875_ = is[i_874_];
					if (i_875_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_876_ = (((Class387_Sub2) this).anIntArrayArray8150[i_875_]);
						for (int i_877_ = 0; i_877_ < is_876_.length; i_877_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_876_[i_877_]]);
							((Class40) class40).anInt429 = ((Class40) class40).anInt429 * i_789_ >> 7;
							((Class40) class40).anInt426 = ((Class40) class40).anInt426 * i_790_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_878_ = 0; i_878_ < i_793_; i_878_++) {
					int i_879_ = is[i_878_];
					if (i_879_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_880_ = (((Class387_Sub2) this).anIntArrayArray8150[i_879_]);
						for (int i_881_ = 0; i_881_ < is_880_.length; i_881_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_880_[i_881_]]);
							((Class40) class40).anInt424 = (((Class40) class40).anInt424 + i_789_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void method4474(int i, int[] is, int i_882_, int i_883_, int i_884_, int i_885_, boolean bool) {
		int i_886_ = is.length;
		if (i == 0) {
			i_882_ <<= 4;
			i_883_ <<= 4;
			i_884_ <<= 4;
			int i_887_ = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (int i_888_ = 0; i_888_ < i_886_; i_888_++) {
				int i_889_ = is[i_888_];
				if (i_889_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_890_ = ((Class387_Sub2) this).anIntArrayArray8113[i_889_];
					for (int i_891_ = 0; i_891_ < is_890_.length; i_891_++) {
						int i_892_ = is_890_[i_891_];
						anInt8101 += ((Class387_Sub2) this).anIntArray8102[i_892_];
						anInt8111 += ((Class387_Sub2) this).anIntArray8110[i_892_];
						anInt8158 += ((Class387_Sub2) this).anIntArray8104[i_892_];
						i_887_++;
					}
				}
			}
			if (i_887_ > 0) {
				anInt8101 = anInt8101 / i_887_ + i_882_;
				anInt8111 = anInt8111 / i_887_ + i_883_;
				anInt8158 = anInt8158 / i_887_ + i_884_;
			} else {
				anInt8101 = i_882_;
				anInt8111 = i_883_;
				anInt8158 = i_884_;
			}
		} else if (i == 1) {
			i_882_ <<= 4;
			i_883_ <<= 4;
			i_884_ <<= 4;
			for (int i_893_ = 0; i_893_ < i_886_; i_893_++) {
				int i_894_ = is[i_893_];
				if (i_894_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_895_ = ((Class387_Sub2) this).anIntArrayArray8113[i_894_];
					for (int i_896_ = 0; i_896_ < is_895_.length; i_896_++) {
						int i_897_ = is_895_[i_896_];
						((Class387_Sub2) this).anIntArray8102[i_897_] += i_882_;
						((Class387_Sub2) this).anIntArray8110[i_897_] += i_883_;
						((Class387_Sub2) this).anIntArray8104[i_897_] += i_884_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_898_ = 0; i_898_ < i_886_; i_898_++) {
				int i_899_ = is[i_898_];
				if (i_899_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_900_ = ((Class387_Sub2) this).anIntArrayArray8113[i_899_];
					if ((i_885_ & 0x1) == 0) {
						for (int i_901_ = 0; i_901_ < is_900_.length; i_901_++) {
							int i_902_ = is_900_[i_901_];
							((Class387_Sub2) this).anIntArray8102[i_902_] -= anInt8101;
							((Class387_Sub2) this).anIntArray8110[i_902_] -= anInt8111;
							((Class387_Sub2) this).anIntArray8104[i_902_] -= anInt8158;
							if (i_884_ != 0) {
								int i_903_ = Class257.anIntArray2683[i_884_];
								int i_904_ = Class257.anIntArray2684[i_884_];
								int i_905_ = (((((Class387_Sub2) this).anIntArray8110[i_902_]) * i_903_ + (((Class387_Sub2) this).anIntArray8102[i_902_]) * i_904_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8110[i_902_] = ((((Class387_Sub2) this).anIntArray8110[i_902_]) * i_904_ - (((Class387_Sub2) this).anIntArray8102[i_902_]) * i_903_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8102[i_902_] = i_905_;
							}
							if (i_882_ != 0) {
								int i_906_ = Class257.anIntArray2683[i_882_];
								int i_907_ = Class257.anIntArray2684[i_882_];
								int i_908_ = (((((Class387_Sub2) this).anIntArray8110[i_902_]) * i_907_ - (((Class387_Sub2) this).anIntArray8104[i_902_]) * i_906_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8104[i_902_] = ((((Class387_Sub2) this).anIntArray8110[i_902_]) * i_906_ + (((Class387_Sub2) this).anIntArray8104[i_902_]) * i_907_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8110[i_902_] = i_908_;
							}
							if (i_883_ != 0) {
								int i_909_ = Class257.anIntArray2683[i_883_];
								int i_910_ = Class257.anIntArray2684[i_883_];
								int i_911_ = (((((Class387_Sub2) this).anIntArray8104[i_902_]) * i_909_ + (((Class387_Sub2) this).anIntArray8102[i_902_]) * i_910_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8104[i_902_] = ((((Class387_Sub2) this).anIntArray8104[i_902_]) * i_910_ - (((Class387_Sub2) this).anIntArray8102[i_902_]) * i_909_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8102[i_902_] = i_911_;
							}
							((Class387_Sub2) this).anIntArray8102[i_902_] += anInt8101;
							((Class387_Sub2) this).anIntArray8110[i_902_] += anInt8111;
							((Class387_Sub2) this).anIntArray8104[i_902_] += anInt8158;
						}
					} else {
						for (int i_912_ = 0; i_912_ < is_900_.length; i_912_++) {
							int i_913_ = is_900_[i_912_];
							((Class387_Sub2) this).anIntArray8102[i_913_] -= anInt8101;
							((Class387_Sub2) this).anIntArray8110[i_913_] -= anInt8111;
							((Class387_Sub2) this).anIntArray8104[i_913_] -= anInt8158;
							if (i_882_ != 0) {
								int i_914_ = Class257.anIntArray2683[i_882_];
								int i_915_ = Class257.anIntArray2684[i_882_];
								int i_916_ = (((((Class387_Sub2) this).anIntArray8110[i_913_]) * i_915_ - (((Class387_Sub2) this).anIntArray8104[i_913_]) * i_914_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8104[i_913_] = ((((Class387_Sub2) this).anIntArray8110[i_913_]) * i_914_ + (((Class387_Sub2) this).anIntArray8104[i_913_]) * i_915_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8110[i_913_] = i_916_;
							}
							if (i_884_ != 0) {
								int i_917_ = Class257.anIntArray2683[i_884_];
								int i_918_ = Class257.anIntArray2684[i_884_];
								int i_919_ = (((((Class387_Sub2) this).anIntArray8110[i_913_]) * i_917_ + (((Class387_Sub2) this).anIntArray8102[i_913_]) * i_918_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8110[i_913_] = ((((Class387_Sub2) this).anIntArray8110[i_913_]) * i_918_ - (((Class387_Sub2) this).anIntArray8102[i_913_]) * i_917_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8102[i_913_] = i_919_;
							}
							if (i_883_ != 0) {
								int i_920_ = Class257.anIntArray2683[i_883_];
								int i_921_ = Class257.anIntArray2684[i_883_];
								int i_922_ = (((((Class387_Sub2) this).anIntArray8104[i_913_]) * i_920_ + (((Class387_Sub2) this).anIntArray8102[i_913_]) * i_921_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8104[i_913_] = ((((Class387_Sub2) this).anIntArray8104[i_913_]) * i_921_ - (((Class387_Sub2) this).anIntArray8102[i_913_]) * i_920_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8102[i_913_] = i_922_;
							}
							((Class387_Sub2) this).anIntArray8102[i_913_] += anInt8101;
							((Class387_Sub2) this).anIntArray8110[i_913_] += anInt8111;
							((Class387_Sub2) this).anIntArray8104[i_913_] += anInt8158;
						}
					}
				}
			}
			if (bool) {
				for (int i_923_ = 0; i_923_ < i_886_; i_923_++) {
					int i_924_ = is[i_923_];
					if (i_924_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_925_ = (((Class387_Sub2) this).anIntArrayArray8113[i_924_]);
						for (int i_926_ = 0; i_926_ < is_925_.length; i_926_++) {
							int i_927_ = is_925_[i_926_];
							int i_928_ = (((Class387_Sub2) this).anIntArray8143[i_927_]);
							int i_929_ = (((Class387_Sub2) this).anIntArray8143[i_927_ + 1]);
							for (int i_930_ = i_928_; i_930_ < i_929_; i_930_++) {
								int i_931_ = ((((Class387_Sub2) this).aShortArray8144[i_930_]) - 1);
								if (i_931_ == -1)
									break;
								if (i_884_ != 0) {
									int i_932_ = Class257.anIntArray2683[i_884_];
									int i_933_ = Class257.anIntArray2684[i_884_];
									int i_934_ = (((((Class387_Sub2) this).aShortArray8109[i_931_]) * i_932_ + ((((Class387_Sub2) this).aShortArray8108[i_931_]) * i_933_) + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8109[i_931_] = (short) ((((((Class387_Sub2) this).aShortArray8109[i_931_]) * i_933_) - (((Class387_Sub2) this).aShortArray8108[i_931_]) * i_932_ + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8108[i_931_] = (short) i_934_;
								}
								if (i_882_ != 0) {
									int i_935_ = Class257.anIntArray2683[i_882_];
									int i_936_ = Class257.anIntArray2684[i_882_];
									int i_937_ = (((((Class387_Sub2) this).aShortArray8109[i_931_]) * i_936_ - ((((Class387_Sub2) this).aShortArray8095[i_931_]) * i_935_) + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8095[i_931_] = (short) ((((((Class387_Sub2) this).aShortArray8109[i_931_]) * i_935_) + (((Class387_Sub2) this).aShortArray8095[i_931_]) * i_936_ + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8109[i_931_] = (short) i_937_;
								}
								if (i_883_ != 0) {
									int i_938_ = Class257.anIntArray2683[i_883_];
									int i_939_ = Class257.anIntArray2684[i_883_];
									int i_940_ = (((((Class387_Sub2) this).aShortArray8095[i_931_]) * i_938_ + ((((Class387_Sub2) this).aShortArray8108[i_931_]) * i_939_) + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8095[i_931_] = (short) ((((((Class387_Sub2) this).aShortArray8095[i_931_]) * i_939_) - (((Class387_Sub2) this).aShortArray8108[i_931_]) * i_938_ + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8108[i_931_] = (short) i_940_;
								}
							}
						}
					}
				}
				if (((Class387_Sub2) this).aClass44_8127 == null && ((Class387_Sub2) this).aClass44_8105 != null)
					((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
				if (((Class387_Sub2) this).aClass44_8127 != null)
					((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = null;
			}
		} else if (i == 3) {
			for (int i_941_ = 0; i_941_ < i_886_; i_941_++) {
				int i_942_ = is[i_941_];
				if (i_942_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_943_ = ((Class387_Sub2) this).anIntArrayArray8113[i_942_];
					for (int i_944_ = 0; i_944_ < is_943_.length; i_944_++) {
						int i_945_ = is_943_[i_944_];
						((Class387_Sub2) this).anIntArray8102[i_945_] -= anInt8101;
						((Class387_Sub2) this).anIntArray8110[i_945_] -= anInt8111;
						((Class387_Sub2) this).anIntArray8104[i_945_] -= anInt8158;
						((Class387_Sub2) this).anIntArray8102[i_945_] = (((Class387_Sub2) this).anIntArray8102[i_945_] * i_882_) >> 7;
						((Class387_Sub2) this).anIntArray8110[i_945_] = (((Class387_Sub2) this).anIntArray8110[i_945_] * i_883_) >> 7;
						((Class387_Sub2) this).anIntArray8104[i_945_] = (((Class387_Sub2) this).anIntArray8104[i_945_] * i_884_) >> 7;
						((Class387_Sub2) this).anIntArray8102[i_945_] += anInt8101;
						((Class387_Sub2) this).anIntArray8110[i_945_] += anInt8111;
						((Class387_Sub2) this).anIntArray8104[i_945_] += anInt8158;
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub2) this).anIntArrayArray8123 != null) {
				for (int i_946_ = 0; i_946_ < i_886_; i_946_++) {
					int i_947_ = is[i_946_];
					if (i_947_ < ((Class387_Sub2) this).anIntArrayArray8123.length) {
						int[] is_948_ = (((Class387_Sub2) this).anIntArrayArray8123[i_947_]);
						for (int i_949_ = 0; i_949_ < is_948_.length; i_949_++) {
							int i_950_ = is_948_[i_949_];
							int i_951_ = (((((Class387_Sub2) this).aByteArray8136[i_950_]) & 0xff) + i_882_ * 8);
							if (i_951_ < 0)
								i_951_ = 0;
							else if (i_951_ > 255)
								i_951_ = 255;
							((Class387_Sub2) this).aByteArray8136[i_950_] = (byte) i_951_;
						}
						if (is_948_.length > 0 && ((Class387_Sub2) this).aClass44_8105 != null)
							((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
					}
				}
				if (((Class387_Sub2) this).aClass52Array8148 != null) {
					for (int i_952_ = 0; i_952_ < ((Class387_Sub2) this).anInt8147; i_952_++) {
						Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_952_];
						Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_952_];
						((Class40) class40).anInt428 = (((Class40) class40).anInt428 & 0xffffff | 255 - ((((Class387_Sub2) this).aByteArray8136[((Class52) class52).modelColorIndex]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub2) this).anIntArrayArray8123 != null) {
				for (int i_953_ = 0; i_953_ < i_886_; i_953_++) {
					int i_954_ = is[i_953_];
					if (i_954_ < ((Class387_Sub2) this).anIntArrayArray8123.length) {
						int[] is_955_ = (((Class387_Sub2) this).anIntArrayArray8123[i_954_]);
						for (int i_956_ = 0; i_956_ < is_955_.length; i_956_++) {
							int i_957_ = is_955_[i_956_];
							int i_958_ = ((((Class387_Sub2) this).modelColors[i_957_]) & 0xffff);
							int i_959_ = i_958_ >> 10 & 0x3f;
							int i_960_ = i_958_ >> 7 & 0x7;
							int i_961_ = i_958_ & 0x7f;
							i_959_ = i_959_ + i_882_ & 0x3f;
							i_960_ += i_883_ / 4;
							if (i_960_ < 0)
								i_960_ = 0;
							else if (i_960_ > 7)
								i_960_ = 7;
							i_961_ += i_884_;
							if (i_961_ < 0)
								i_961_ = 0;
							else if (i_961_ > 127)
								i_961_ = 127;
							((Class387_Sub2) this).modelColors[i_957_] = (short) (i_959_ << 10 | i_960_ << 7 | i_961_);
						}
						if (is_955_.length > 0 && ((Class387_Sub2) this).aClass44_8105 != null)
							((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
					}
				}
				if (((Class387_Sub2) this).aClass52Array8148 != null) {
					for (int i_962_ = 0; i_962_ < ((Class387_Sub2) this).anInt8147; i_962_++) {
						Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_962_];
						Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_962_];
						((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_963_ = 0; i_963_ < i_886_; i_963_++) {
					int i_964_ = is[i_963_];
					if (i_964_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_965_ = (((Class387_Sub2) this).anIntArrayArray8150[i_964_]);
						for (int i_966_ = 0; i_966_ < is_965_.length; i_966_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_965_[i_966_]]);
							((Class40) class40).anInt425 += i_882_;
							((Class40) class40).anInt427 += i_883_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_967_ = 0; i_967_ < i_886_; i_967_++) {
					int i_968_ = is[i_967_];
					if (i_968_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_969_ = (((Class387_Sub2) this).anIntArrayArray8150[i_968_]);
						for (int i_970_ = 0; i_970_ < is_969_.length; i_970_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_969_[i_970_]]);
							((Class40) class40).anInt429 = ((Class40) class40).anInt429 * i_882_ >> 7;
							((Class40) class40).anInt426 = ((Class40) class40).anInt426 * i_883_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_971_ = 0; i_971_ < i_886_; i_971_++) {
					int i_972_ = is[i_971_];
					if (i_972_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_973_ = (((Class387_Sub2) this).anIntArrayArray8150[i_972_]);
						for (int i_974_ = 0; i_974_ < is_973_.length; i_974_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_973_[i_974_]]);
							((Class40) class40).anInt424 = (((Class40) class40).anInt424 + i_882_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void method4451(int i, int[] is, int i_975_, int i_976_, int i_977_, int i_978_, boolean bool) {
		int i_979_ = is.length;
		if (i == 0) {
			i_975_ <<= 4;
			i_976_ <<= 4;
			i_977_ <<= 4;
			int i_980_ = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (int i_981_ = 0; i_981_ < i_979_; i_981_++) {
				int i_982_ = is[i_981_];
				if (i_982_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_983_ = ((Class387_Sub2) this).anIntArrayArray8113[i_982_];
					for (int i_984_ = 0; i_984_ < is_983_.length; i_984_++) {
						int i_985_ = is_983_[i_984_];
						anInt8101 += ((Class387_Sub2) this).anIntArray8102[i_985_];
						anInt8111 += ((Class387_Sub2) this).anIntArray8110[i_985_];
						anInt8158 += ((Class387_Sub2) this).anIntArray8104[i_985_];
						i_980_++;
					}
				}
			}
			if (i_980_ > 0) {
				anInt8101 = anInt8101 / i_980_ + i_975_;
				anInt8111 = anInt8111 / i_980_ + i_976_;
				anInt8158 = anInt8158 / i_980_ + i_977_;
			} else {
				anInt8101 = i_975_;
				anInt8111 = i_976_;
				anInt8158 = i_977_;
			}
		} else if (i == 1) {
			i_975_ <<= 4;
			i_976_ <<= 4;
			i_977_ <<= 4;
			for (int i_986_ = 0; i_986_ < i_979_; i_986_++) {
				int i_987_ = is[i_986_];
				if (i_987_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_988_ = ((Class387_Sub2) this).anIntArrayArray8113[i_987_];
					for (int i_989_ = 0; i_989_ < is_988_.length; i_989_++) {
						int i_990_ = is_988_[i_989_];
						((Class387_Sub2) this).anIntArray8102[i_990_] += i_975_;
						((Class387_Sub2) this).anIntArray8110[i_990_] += i_976_;
						((Class387_Sub2) this).anIntArray8104[i_990_] += i_977_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_991_ = 0; i_991_ < i_979_; i_991_++) {
				int i_992_ = is[i_991_];
				if (i_992_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_993_ = ((Class387_Sub2) this).anIntArrayArray8113[i_992_];
					if ((i_978_ & 0x1) == 0) {
						for (int i_994_ = 0; i_994_ < is_993_.length; i_994_++) {
							int i_995_ = is_993_[i_994_];
							((Class387_Sub2) this).anIntArray8102[i_995_] -= anInt8101;
							((Class387_Sub2) this).anIntArray8110[i_995_] -= anInt8111;
							((Class387_Sub2) this).anIntArray8104[i_995_] -= anInt8158;
							if (i_977_ != 0) {
								int i_996_ = Class257.anIntArray2683[i_977_];
								int i_997_ = Class257.anIntArray2684[i_977_];
								int i_998_ = (((((Class387_Sub2) this).anIntArray8110[i_995_]) * i_996_ + (((Class387_Sub2) this).anIntArray8102[i_995_]) * i_997_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8110[i_995_] = ((((Class387_Sub2) this).anIntArray8110[i_995_]) * i_997_ - (((Class387_Sub2) this).anIntArray8102[i_995_]) * i_996_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8102[i_995_] = i_998_;
							}
							if (i_975_ != 0) {
								int i_999_ = Class257.anIntArray2683[i_975_];
								int i_1000_ = Class257.anIntArray2684[i_975_];
								int i_1001_ = (((((Class387_Sub2) this).anIntArray8110[i_995_]) * i_1000_ - (((Class387_Sub2) this).anIntArray8104[i_995_]) * i_999_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8104[i_995_] = ((((Class387_Sub2) this).anIntArray8110[i_995_]) * i_999_ + (((Class387_Sub2) this).anIntArray8104[i_995_]) * i_1000_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8110[i_995_] = i_1001_;
							}
							if (i_976_ != 0) {
								int i_1002_ = Class257.anIntArray2683[i_976_];
								int i_1003_ = Class257.anIntArray2684[i_976_];
								int i_1004_ = (((((Class387_Sub2) this).anIntArray8104[i_995_]) * i_1002_ + (((Class387_Sub2) this).anIntArray8102[i_995_]) * i_1003_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8104[i_995_] = ((((Class387_Sub2) this).anIntArray8104[i_995_]) * i_1003_ - (((Class387_Sub2) this).anIntArray8102[i_995_]) * i_1002_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8102[i_995_] = i_1004_;
							}
							((Class387_Sub2) this).anIntArray8102[i_995_] += anInt8101;
							((Class387_Sub2) this).anIntArray8110[i_995_] += anInt8111;
							((Class387_Sub2) this).anIntArray8104[i_995_] += anInt8158;
						}
					} else {
						for (int i_1005_ = 0; i_1005_ < is_993_.length; i_1005_++) {
							int i_1006_ = is_993_[i_1005_];
							((Class387_Sub2) this).anIntArray8102[i_1006_] -= anInt8101;
							((Class387_Sub2) this).anIntArray8110[i_1006_] -= anInt8111;
							((Class387_Sub2) this).anIntArray8104[i_1006_] -= anInt8158;
							if (i_975_ != 0) {
								int i_1007_ = Class257.anIntArray2683[i_975_];
								int i_1008_ = Class257.anIntArray2684[i_975_];
								int i_1009_ = (((((Class387_Sub2) this).anIntArray8110[i_1006_]) * i_1008_ - (((Class387_Sub2) this).anIntArray8104[i_1006_]) * i_1007_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8104[i_1006_] = ((((Class387_Sub2) this).anIntArray8110[i_1006_]) * i_1007_ + (((Class387_Sub2) this).anIntArray8104[i_1006_]) * i_1008_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8110[i_1006_] = i_1009_;
							}
							if (i_977_ != 0) {
								int i_1010_ = Class257.anIntArray2683[i_977_];
								int i_1011_ = Class257.anIntArray2684[i_977_];
								int i_1012_ = (((((Class387_Sub2) this).anIntArray8110[i_1006_]) * i_1010_ + (((Class387_Sub2) this).anIntArray8102[i_1006_]) * i_1011_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8110[i_1006_] = ((((Class387_Sub2) this).anIntArray8110[i_1006_]) * i_1011_ - (((Class387_Sub2) this).anIntArray8102[i_1006_]) * i_1010_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8102[i_1006_] = i_1012_;
							}
							if (i_976_ != 0) {
								int i_1013_ = Class257.anIntArray2683[i_976_];
								int i_1014_ = Class257.anIntArray2684[i_976_];
								int i_1015_ = (((((Class387_Sub2) this).anIntArray8104[i_1006_]) * i_1013_ + (((Class387_Sub2) this).anIntArray8102[i_1006_]) * i_1014_ + 16383) >> 14);
								((Class387_Sub2) this).anIntArray8104[i_1006_] = ((((Class387_Sub2) this).anIntArray8104[i_1006_]) * i_1014_ - (((Class387_Sub2) this).anIntArray8102[i_1006_]) * i_1013_ + 16383) >> 14;
								((Class387_Sub2) this).anIntArray8102[i_1006_] = i_1015_;
							}
							((Class387_Sub2) this).anIntArray8102[i_1006_] += anInt8101;
							((Class387_Sub2) this).anIntArray8110[i_1006_] += anInt8111;
							((Class387_Sub2) this).anIntArray8104[i_1006_] += anInt8158;
						}
					}
				}
			}
			if (bool) {
				for (int i_1016_ = 0; i_1016_ < i_979_; i_1016_++) {
					int i_1017_ = is[i_1016_];
					if (i_1017_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_1018_ = (((Class387_Sub2) this).anIntArrayArray8113[i_1017_]);
						for (int i_1019_ = 0; i_1019_ < is_1018_.length; i_1019_++) {
							int i_1020_ = is_1018_[i_1019_];
							int i_1021_ = (((Class387_Sub2) this).anIntArray8143[i_1020_]);
							int i_1022_ = (((Class387_Sub2) this).anIntArray8143[i_1020_ + 1]);
							for (int i_1023_ = i_1021_; i_1023_ < i_1022_; i_1023_++) {
								int i_1024_ = ((((Class387_Sub2) this).aShortArray8144[i_1023_]) - 1);
								if (i_1024_ == -1)
									break;
								if (i_977_ != 0) {
									int i_1025_ = Class257.anIntArray2683[i_977_];
									int i_1026_ = Class257.anIntArray2684[i_977_];
									int i_1027_ = (((((Class387_Sub2) this).aShortArray8109[i_1024_]) * i_1025_ + (((Class387_Sub2) this).aShortArray8108[i_1024_]) * i_1026_ + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8109[i_1024_] = (short) (((((Class387_Sub2) this).aShortArray8109[i_1024_]) * i_1026_ - (((Class387_Sub2) this).aShortArray8108[i_1024_]) * i_1025_ + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8108[i_1024_] = (short) i_1027_;
								}
								if (i_975_ != 0) {
									int i_1028_ = Class257.anIntArray2683[i_975_];
									int i_1029_ = Class257.anIntArray2684[i_975_];
									int i_1030_ = (((((Class387_Sub2) this).aShortArray8109[i_1024_]) * i_1029_ - (((Class387_Sub2) this).aShortArray8095[i_1024_]) * i_1028_ + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8095[i_1024_] = (short) (((((Class387_Sub2) this).aShortArray8109[i_1024_]) * i_1028_ + (((Class387_Sub2) this).aShortArray8095[i_1024_]) * i_1029_ + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8109[i_1024_] = (short) i_1030_;
								}
								if (i_976_ != 0) {
									int i_1031_ = Class257.anIntArray2683[i_976_];
									int i_1032_ = Class257.anIntArray2684[i_976_];
									int i_1033_ = (((((Class387_Sub2) this).aShortArray8095[i_1024_]) * i_1031_ + (((Class387_Sub2) this).aShortArray8108[i_1024_]) * i_1032_ + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8095[i_1024_] = (short) (((((Class387_Sub2) this).aShortArray8095[i_1024_]) * i_1032_ - (((Class387_Sub2) this).aShortArray8108[i_1024_]) * i_1031_ + 16383) >> 14);
									((Class387_Sub2) this).aShortArray8108[i_1024_] = (short) i_1033_;
								}
							}
						}
					}
				}
				if (((Class387_Sub2) this).aClass44_8127 == null && ((Class387_Sub2) this).aClass44_8105 != null)
					((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
				if (((Class387_Sub2) this).aClass44_8127 != null)
					((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = null;
			}
		} else if (i == 3) {
			for (int i_1034_ = 0; i_1034_ < i_979_; i_1034_++) {
				int i_1035_ = is[i_1034_];
				if (i_1035_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_1036_ = ((Class387_Sub2) this).anIntArrayArray8113[i_1035_];
					for (int i_1037_ = 0; i_1037_ < is_1036_.length; i_1037_++) {
						int i_1038_ = is_1036_[i_1037_];
						((Class387_Sub2) this).anIntArray8102[i_1038_] -= anInt8101;
						((Class387_Sub2) this).anIntArray8110[i_1038_] -= anInt8111;
						((Class387_Sub2) this).anIntArray8104[i_1038_] -= anInt8158;
						((Class387_Sub2) this).anIntArray8102[i_1038_] = (((Class387_Sub2) this).anIntArray8102[i_1038_] * i_975_) >> 7;
						((Class387_Sub2) this).anIntArray8110[i_1038_] = (((Class387_Sub2) this).anIntArray8110[i_1038_] * i_976_) >> 7;
						((Class387_Sub2) this).anIntArray8104[i_1038_] = (((Class387_Sub2) this).anIntArray8104[i_1038_] * i_977_) >> 7;
						((Class387_Sub2) this).anIntArray8102[i_1038_] += anInt8101;
						((Class387_Sub2) this).anIntArray8110[i_1038_] += anInt8111;
						((Class387_Sub2) this).anIntArray8104[i_1038_] += anInt8158;
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub2) this).anIntArrayArray8123 != null) {
				for (int i_1039_ = 0; i_1039_ < i_979_; i_1039_++) {
					int i_1040_ = is[i_1039_];
					if (i_1040_ < ((Class387_Sub2) this).anIntArrayArray8123.length) {
						int[] is_1041_ = (((Class387_Sub2) this).anIntArrayArray8123[i_1040_]);
						for (int i_1042_ = 0; i_1042_ < is_1041_.length; i_1042_++) {
							int i_1043_ = is_1041_[i_1042_];
							int i_1044_ = (((((Class387_Sub2) this).aByteArray8136[i_1043_]) & 0xff) + i_975_ * 8);
							if (i_1044_ < 0)
								i_1044_ = 0;
							else if (i_1044_ > 255)
								i_1044_ = 255;
							((Class387_Sub2) this).aByteArray8136[i_1043_] = (byte) i_1044_;
						}
						if (is_1041_.length > 0 && ((Class387_Sub2) this).aClass44_8105 != null)
							((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
					}
				}
				if (((Class387_Sub2) this).aClass52Array8148 != null) {
					for (int i_1045_ = 0; i_1045_ < ((Class387_Sub2) this).anInt8147; i_1045_++) {
						Class52 class52 = (((Class387_Sub2) this).aClass52Array8148[i_1045_]);
						Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[i_1045_]);
						((Class40) class40).anInt428 = (((Class40) class40).anInt428 & 0xffffff | 255 - ((((Class387_Sub2) this).aByteArray8136[((Class52) class52).modelColorIndex]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub2) this).anIntArrayArray8123 != null) {
				for (int i_1046_ = 0; i_1046_ < i_979_; i_1046_++) {
					int i_1047_ = is[i_1046_];
					if (i_1047_ < ((Class387_Sub2) this).anIntArrayArray8123.length) {
						int[] is_1048_ = (((Class387_Sub2) this).anIntArrayArray8123[i_1047_]);
						for (int i_1049_ = 0; i_1049_ < is_1048_.length; i_1049_++) {
							int i_1050_ = is_1048_[i_1049_];
							int i_1051_ = ((((Class387_Sub2) this).modelColors[i_1050_]) & 0xffff);
							int i_1052_ = i_1051_ >> 10 & 0x3f;
							int i_1053_ = i_1051_ >> 7 & 0x7;
							int i_1054_ = i_1051_ & 0x7f;
							i_1052_ = i_1052_ + i_975_ & 0x3f;
							i_1053_ += i_976_ / 4;
							if (i_1053_ < 0)
								i_1053_ = 0;
							else if (i_1053_ > 7)
								i_1053_ = 7;
							i_1054_ += i_977_;
							if (i_1054_ < 0)
								i_1054_ = 0;
							else if (i_1054_ > 127)
								i_1054_ = 127;
							((Class387_Sub2) this).modelColors[i_1050_] = (short) (i_1052_ << 10 | i_1053_ << 7 | i_1054_);
						}
						if (is_1048_.length > 0 && ((Class387_Sub2) this).aClass44_8105 != null)
							((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
					}
				}
				if (((Class387_Sub2) this).aClass52Array8148 != null) {
					for (int i_1055_ = 0; i_1055_ < ((Class387_Sub2) this).anInt8147; i_1055_++) {
						Class52 class52 = (((Class387_Sub2) this).aClass52Array8148[i_1055_]);
						Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[i_1055_]);
						((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_1056_ = 0; i_1056_ < i_979_; i_1056_++) {
					int i_1057_ = is[i_1056_];
					if (i_1057_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_1058_ = (((Class387_Sub2) this).anIntArrayArray8150[i_1057_]);
						for (int i_1059_ = 0; i_1059_ < is_1058_.length; i_1059_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_1058_[i_1059_]]);
							((Class40) class40).anInt425 += i_975_;
							((Class40) class40).anInt427 += i_976_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_1060_ = 0; i_1060_ < i_979_; i_1060_++) {
					int i_1061_ = is[i_1060_];
					if (i_1061_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_1062_ = (((Class387_Sub2) this).anIntArrayArray8150[i_1061_]);
						for (int i_1063_ = 0; i_1063_ < is_1062_.length; i_1063_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_1062_[i_1063_]]);
							((Class40) class40).anInt429 = ((Class40) class40).anInt429 * i_975_ >> 7;
							((Class40) class40).anInt426 = ((Class40) class40).anInt426 * i_976_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_1064_ = 0; i_1064_ < i_979_; i_1064_++) {
					int i_1065_ = is[i_1064_];
					if (i_1065_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_1066_ = (((Class387_Sub2) this).anIntArrayArray8150[i_1065_]);
						for (int i_1067_ = 0; i_1067_ < is_1066_.length; i_1067_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_1066_[i_1067_]]);
							((Class40) class40).anInt424 = (((Class40) class40).anInt424 + i_975_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void bu(int i, int i_1068_, int i_1069_, int i_1070_) {
		if (i == 0) {
			int i_1071_ = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (int i_1072_ = 0; i_1072_ < ((Class387_Sub2) this).anInt8130; i_1072_++) {
				anInt8101 += ((Class387_Sub2) this).anIntArray8102[i_1072_];
				anInt8111 += ((Class387_Sub2) this).anIntArray8110[i_1072_];
				anInt8158 += ((Class387_Sub2) this).anIntArray8104[i_1072_];
				i_1071_++;
			}
			if (i_1071_ > 0) {
				anInt8101 = anInt8101 / i_1071_ + i_1068_;
				anInt8111 = anInt8111 / i_1071_ + i_1069_;
				anInt8158 = anInt8158 / i_1071_ + i_1070_;
			} else {
				anInt8101 = i_1068_;
				anInt8111 = i_1069_;
				anInt8158 = i_1070_;
			}
		} else if (i == 1) {
			for (int i_1073_ = 0; i_1073_ < ((Class387_Sub2) this).anInt8130; i_1073_++) {
				((Class387_Sub2) this).anIntArray8102[i_1073_] += i_1068_;
				((Class387_Sub2) this).anIntArray8110[i_1073_] += i_1069_;
				((Class387_Sub2) this).anIntArray8104[i_1073_] += i_1070_;
			}
		} else if (i == 2) {
			for (int i_1074_ = 0; i_1074_ < ((Class387_Sub2) this).anInt8130; i_1074_++) {
				((Class387_Sub2) this).anIntArray8102[i_1074_] -= anInt8101;
				((Class387_Sub2) this).anIntArray8110[i_1074_] -= anInt8111;
				((Class387_Sub2) this).anIntArray8104[i_1074_] -= anInt8158;
				if (i_1070_ != 0) {
					int i_1075_ = Class257.anIntArray2683[i_1070_];
					int i_1076_ = Class257.anIntArray2684[i_1070_];
					int i_1077_ = (((((Class387_Sub2) this).anIntArray8110[i_1074_] * i_1075_) + (((Class387_Sub2) this).anIntArray8102[i_1074_] * i_1076_) + 16383) >> 14);
					((Class387_Sub2) this).anIntArray8110[i_1074_] = ((((Class387_Sub2) this).anIntArray8110[i_1074_] * i_1076_) - (((Class387_Sub2) this).anIntArray8102[i_1074_] * i_1075_) + 16383) >> 14;
					((Class387_Sub2) this).anIntArray8102[i_1074_] = i_1077_;
				}
				if (i_1068_ != 0) {
					int i_1078_ = Class257.anIntArray2683[i_1068_];
					int i_1079_ = Class257.anIntArray2684[i_1068_];
					int i_1080_ = (((((Class387_Sub2) this).anIntArray8110[i_1074_] * i_1079_) - (((Class387_Sub2) this).anIntArray8104[i_1074_] * i_1078_) + 16383) >> 14);
					((Class387_Sub2) this).anIntArray8104[i_1074_] = ((((Class387_Sub2) this).anIntArray8110[i_1074_] * i_1078_) + (((Class387_Sub2) this).anIntArray8104[i_1074_] * i_1079_) + 16383) >> 14;
					((Class387_Sub2) this).anIntArray8110[i_1074_] = i_1080_;
				}
				if (i_1069_ != 0) {
					int i_1081_ = Class257.anIntArray2683[i_1069_];
					int i_1082_ = Class257.anIntArray2684[i_1069_];
					int i_1083_ = (((((Class387_Sub2) this).anIntArray8104[i_1074_] * i_1081_) + (((Class387_Sub2) this).anIntArray8102[i_1074_] * i_1082_) + 16383) >> 14);
					((Class387_Sub2) this).anIntArray8104[i_1074_] = ((((Class387_Sub2) this).anIntArray8104[i_1074_] * i_1082_) - (((Class387_Sub2) this).anIntArray8102[i_1074_] * i_1081_) + 16383) >> 14;
					((Class387_Sub2) this).anIntArray8102[i_1074_] = i_1083_;
				}
				((Class387_Sub2) this).anIntArray8102[i_1074_] += anInt8101;
				((Class387_Sub2) this).anIntArray8110[i_1074_] += anInt8111;
				((Class387_Sub2) this).anIntArray8104[i_1074_] += anInt8158;
			}
		} else if (i == 3) {
			for (int i_1084_ = 0; i_1084_ < ((Class387_Sub2) this).anInt8130; i_1084_++) {
				((Class387_Sub2) this).anIntArray8102[i_1084_] -= anInt8101;
				((Class387_Sub2) this).anIntArray8110[i_1084_] -= anInt8111;
				((Class387_Sub2) this).anIntArray8104[i_1084_] -= anInt8158;
				((Class387_Sub2) this).anIntArray8102[i_1084_] = (((Class387_Sub2) this).anIntArray8102[i_1084_] * i_1068_ / 128);
				((Class387_Sub2) this).anIntArray8110[i_1084_] = (((Class387_Sub2) this).anIntArray8110[i_1084_] * i_1069_ / 128);
				((Class387_Sub2) this).anIntArray8104[i_1084_] = (((Class387_Sub2) this).anIntArray8104[i_1084_] * i_1070_ / 128);
				((Class387_Sub2) this).anIntArray8102[i_1084_] += anInt8101;
				((Class387_Sub2) this).anIntArray8110[i_1084_] += anInt8111;
				((Class387_Sub2) this).anIntArray8104[i_1084_] += anInt8158;
			}
		} else if (i == 5) {
			for (int i_1085_ = 0; i_1085_ < ((Class387_Sub2) this).anInt8089; i_1085_++) {
				int i_1086_ = ((((Class387_Sub2) this).aByteArray8136[i_1085_] & 0xff) + i_1068_ * 8);
				if (i_1086_ < 0)
					i_1086_ = 0;
				else if (i_1086_ > 255)
					i_1086_ = 255;
				((Class387_Sub2) this).aByteArray8136[i_1085_] = (byte) i_1086_;
			}
			if (((Class387_Sub2) this).aClass44_8105 != null)
				((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
			if (((Class387_Sub2) this).aClass52Array8148 != null) {
				for (int i_1087_ = 0; i_1087_ < ((Class387_Sub2) this).anInt8147; i_1087_++) {
					Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_1087_];
					Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_1087_];
					((Class40) class40).anInt428 = (((Class40) class40).anInt428 & 0xffffff | 255 - ((((Class387_Sub2) this).aByteArray8136[((Class52) class52).modelColorIndex]) & 0xff) << 24);
				}
			}
		} else if (i == 7) {
			for (int i_1088_ = 0; i_1088_ < ((Class387_Sub2) this).anInt8089; i_1088_++) {
				int i_1089_ = ((Class387_Sub2) this).modelColors[i_1088_] & 0xffff;
				int i_1090_ = i_1089_ >> 10 & 0x3f;
				int i_1091_ = i_1089_ >> 7 & 0x7;
				int i_1092_ = i_1089_ & 0x7f;
				i_1090_ = i_1090_ + i_1068_ & 0x3f;
				i_1091_ += i_1069_ / 4;
				if (i_1091_ < 0)
					i_1091_ = 0;
				else if (i_1091_ > 7)
					i_1091_ = 7;
				i_1092_ += i_1070_;
				if (i_1092_ < 0)
					i_1092_ = 0;
				else if (i_1092_ > 127)
					i_1092_ = 127;
				((Class387_Sub2) this).modelColors[i_1088_] = (short) (i_1090_ << 10 | i_1091_ << 7 | i_1092_);
			}
			if (((Class387_Sub2) this).aClass44_8105 != null)
				((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
			if (((Class387_Sub2) this).aClass52Array8148 != null) {
				for (int i_1093_ = 0; i_1093_ < ((Class387_Sub2) this).anInt8147; i_1093_++) {
					Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_1093_];
					Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_1093_];
					((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_1094_ = 0; i_1094_ < ((Class387_Sub2) this).anInt8147; i_1094_++) {
				Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_1094_];
				((Class40) class40).anInt425 += i_1068_;
				((Class40) class40).anInt427 += i_1069_;
			}
		} else if (i == 10) {
			for (int i_1095_ = 0; i_1095_ < ((Class387_Sub2) this).anInt8147; i_1095_++) {
				Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_1095_];
				((Class40) class40).anInt429 = ((Class40) class40).anInt429 * i_1068_ >> 7;
				((Class40) class40).anInt426 = ((Class40) class40).anInt426 * i_1069_ >> 7;
			}
		} else if (i == 9) {
			for (int i_1096_ = 0; i_1096_ < ((Class387_Sub2) this).anInt8147; i_1096_++) {
				Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_1096_];
				((Class40) class40).anInt424 = ((Class40) class40).anInt424 + i_1068_ & 0x3fff;
			}
		}
	}

	public void method4477(Class247 class247, int i, boolean bool) {
		if (((Class387_Sub2) this).aShortArray8106 != null) {
			Class247 class247_1097_ = class247;
			if (bool) {
				class247_1097_ = ((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aClass247_8360;
				class247_1097_.method2458(class247);
			}
			float[] fs = new float[3];
			for (int i_1098_ = 0; i_1098_ < ((Class387_Sub2) this).anInt8130; i_1098_++) {
				if ((i & ((Class387_Sub2) this).aShortArray8106[i_1098_]) != 0) {
					class247_1097_.method2465((float) (((Class387_Sub2) this).anIntArray8102[i_1098_]), (float) (((Class387_Sub2) this).anIntArray8110[i_1098_]), (float) (((Class387_Sub2) this).anIntArray8104[i_1098_]), fs);
					((Class387_Sub2) this).anIntArray8102[i_1098_] = (int) fs[0];
					((Class387_Sub2) this).anIntArray8110[i_1098_] = (int) fs[1];
					((Class387_Sub2) this).anIntArray8104[i_1098_] = (int) fs[2];
				}
			}
		}
	}

	public void method4478(Class247 class247, int i, boolean bool) {
		if (((Class387_Sub2) this).aShortArray8106 != null) {
			Class247 class247_1099_ = class247;
			if (bool) {
				class247_1099_ = ((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aClass247_8360;
				class247_1099_.method2458(class247);
			}
			float[] fs = new float[3];
			for (int i_1100_ = 0; i_1100_ < ((Class387_Sub2) this).anInt8130; i_1100_++) {
				if ((i & ((Class387_Sub2) this).aShortArray8106[i_1100_]) != 0) {
					class247_1099_.method2465((float) (((Class387_Sub2) this).anIntArray8102[i_1100_]), (float) (((Class387_Sub2) this).anIntArray8110[i_1100_]), (float) (((Class387_Sub2) this).anIntArray8104[i_1100_]), fs);
					((Class387_Sub2) this).anIntArray8102[i_1100_] = (int) fs[0];
					((Class387_Sub2) this).anIntArray8110[i_1100_] = (int) fs[1];
					((Class387_Sub2) this).anIntArray8104[i_1100_] = (int) fs[2];
				}
			}
		}
	}

	public void ed(int i) {
		int i_1101_ = Class257.anIntArray2683[i];
		int i_1102_ = Class257.anIntArray2684[i];
		for (int i_1103_ = 0; i_1103_ < ((Class387_Sub2) this).anInt8130; i_1103_++) {
			int i_1104_ = ((((Class387_Sub2) this).anIntArray8104[i_1103_] * i_1101_ + ((Class387_Sub2) this).anIntArray8102[i_1103_] * i_1102_) >> 14);
			((Class387_Sub2) this).anIntArray8104[i_1103_] = ((((Class387_Sub2) this).anIntArray8104[i_1103_] * i_1102_ - ((Class387_Sub2) this).anIntArray8102[i_1103_] * i_1101_) >> 14);
			((Class387_Sub2) this).anIntArray8102[i_1103_] = i_1104_;
		}
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public Class64[] method4452() {
		return ((Class387_Sub2) this).aClass64Array8146;
	}

	public void method4440(Class247 class247, Class80 class80, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (((Class387_Sub2) this).anInt8107 != 0) {
			Class249 class249 = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass249_8332);
			Class249 class249_1105_ = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass249_8430);
			Class249 class249_1106_ = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass249_8347);
			class249_1105_.method2508(class247);
			class249_1106_.method2510(class249_1105_);
			class249_1106_.method2483(((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aClass249_8422);
			if (!((Class387_Sub2) this).aBoolean8126)
				method4528();
			float[] fs = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloatArray8260);
			class249_1105_.method2511(0.0F, (float) (((Class387_Sub2) this).aShort8097), 0.0F, fs);
			float f = fs[0];
			float f_1107_ = fs[1];
			float f_1108_ = fs[2];
			class249_1105_.method2511(0.0F, (float) (((Class387_Sub2) this).aShort8100), 0.0F, fs);
			float f_1109_ = fs[0];
			float f_1110_ = fs[1];
			float f_1111_ = fs[2];
			for (int i_1112_ = 0; i_1112_ < 6; i_1112_++) {
				float[] fs_1113_ = (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloatArrayArray8303[i_1112_]);
				float f_1114_ = (fs_1113_[0] * f + fs_1113_[1] * f_1107_ + fs_1113_[2] * f_1108_ + fs_1113_[3] + (float) ((Class387_Sub2) this).anInt8134);
				float f_1115_ = (fs_1113_[0] * f_1109_ + fs_1113_[1] * f_1110_ + fs_1113_[2] * f_1111_ + fs_1113_[3] + (float) ((Class387_Sub2) this).anInt8134);
				if (f_1114_ < 0.0F && f_1115_ < 0.0F)
					return;
			}
			if (class80 != null) {
				boolean bool = false;
				boolean bool_1116_ = true;
				int i_1117_ = ((((Class387_Sub2) this).aShort8145 + ((Class387_Sub2) this).aShort8156) >> 1);
				int i_1118_ = ((((Class387_Sub2) this).aShort8140 + ((Class387_Sub2) this).aShort8141) >> 1);
				int i_1119_ = i_1117_;
				short i_1120_ = ((Class387_Sub2) this).aShort8097;
				int i_1121_ = i_1118_;
				float f_1122_ = (class249_1106_.aFloatArray2631[0] * (float) i_1119_ + class249_1106_.aFloatArray2631[4] * (float) i_1120_ + class249_1106_.aFloatArray2631[8] * (float) i_1121_ + class249_1106_.aFloatArray2631[12]);
				float f_1123_ = (class249_1106_.aFloatArray2631[1] * (float) i_1119_ + class249_1106_.aFloatArray2631[5] * (float) i_1120_ + class249_1106_.aFloatArray2631[9] * (float) i_1121_ + class249_1106_.aFloatArray2631[13]);
				float f_1124_ = (class249_1106_.aFloatArray2631[2] * (float) i_1119_ + class249_1106_.aFloatArray2631[6] * (float) i_1120_ + class249_1106_.aFloatArray2631[10] * (float) i_1121_ + class249_1106_.aFloatArray2631[14]);
				float f_1125_ = (class249_1106_.aFloatArray2631[3] * (float) i_1119_ + class249_1106_.aFloatArray2631[7] * (float) i_1120_ + class249_1106_.aFloatArray2631[11] * (float) i_1121_ + class249_1106_.aFloatArray2631[15]);
				if (f_1124_ >= -f_1125_) {
					class80.anInt669 = (int) ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloat8337) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338) * f_1122_ / f_1125_);
					class80.anInt670 = (int) ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloat8339) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8340) * f_1123_ / f_1125_);
				} else
					bool = true;
				i_1119_ = i_1117_;
				i_1120_ = ((Class387_Sub2) this).aShort8100;
				i_1121_ = i_1118_;
				float f_1126_ = (class249_1106_.aFloatArray2631[0] * (float) i_1119_ + class249_1106_.aFloatArray2631[4] * (float) i_1120_ + class249_1106_.aFloatArray2631[8] * (float) i_1121_ + class249_1106_.aFloatArray2631[12]);
				float f_1127_ = (class249_1106_.aFloatArray2631[1] * (float) i_1119_ + class249_1106_.aFloatArray2631[5] * (float) i_1120_ + class249_1106_.aFloatArray2631[9] * (float) i_1121_ + class249_1106_.aFloatArray2631[13]);
				float f_1128_ = (class249_1106_.aFloatArray2631[2] * (float) i_1119_ + class249_1106_.aFloatArray2631[6] * (float) i_1120_ + class249_1106_.aFloatArray2631[10] * (float) i_1121_ + class249_1106_.aFloatArray2631[14]);
				float f_1129_ = (class249_1106_.aFloatArray2631[3] * (float) i_1119_ + class249_1106_.aFloatArray2631[7] * (float) i_1120_ + class249_1106_.aFloatArray2631[11] * (float) i_1121_ + class249_1106_.aFloatArray2631[15]);
				if (f_1128_ >= -f_1129_) {
					class80.anInt668 = (int) ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloat8337) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338) * f_1126_ / f_1129_);
					class80.anInt672 = (int) ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloat8339) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8340) * f_1127_ / f_1129_);
				} else
					bool = true;
				if (bool) {
					if (f_1124_ < -f_1125_ && f_1128_ < -f_1129_)
						bool_1116_ = false;
					else if (f_1124_ < -f_1125_) {
						float f_1130_ = (f_1124_ + f_1125_) / (f_1128_ + f_1129_) - 1.0F;
						float f_1131_ = f_1122_ + f_1130_ * (f_1126_ - f_1122_);
						float f_1132_ = f_1123_ + f_1130_ * (f_1127_ - f_1123_);
						float f_1133_ = f_1125_ + f_1130_ * (f_1129_ - f_1125_);
						class80.anInt669 = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8337) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338 * f_1131_ / f_1133_));
						class80.anInt670 = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8339) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8340 * f_1132_ / f_1133_));
					} else if (f_1128_ < -f_1129_) {
						float f_1134_ = (f_1128_ + f_1129_) / (f_1124_ + f_1125_) - 1.0F;
						float f_1135_ = f_1126_ + f_1134_ * (f_1122_ - f_1126_);
						float f_1136_ = f_1127_ + f_1134_ * (f_1123_ - f_1127_);
						float f_1137_ = f_1129_ + f_1134_ * (f_1125_ - f_1129_);
						class80.anInt668 = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8337) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338 * f_1135_ / f_1137_));
						class80.anInt672 = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8339) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8340 * f_1136_ / f_1137_));
					}
				}
				if (bool_1116_) {
					if (f_1124_ / f_1125_ > f_1128_ / f_1129_) {
						float f_1138_ = (f_1122_ + (class249.aFloatArray2631[0] * (float) ((Class387_Sub2) this).anInt8134) + class249.aFloatArray2631[12]);
						float f_1139_ = (f_1125_ + (class249.aFloatArray2631[3] * (float) ((Class387_Sub2) this).anInt8134) + class249.aFloatArray2631[15]);
						class80.anInt673 = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8337) - (float) class80.anInt669 + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338 * f_1138_ / f_1139_));
					} else {
						float f_1140_ = (f_1126_ + (class249.aFloatArray2631[0] * (float) ((Class387_Sub2) this).anInt8134) + class249.aFloatArray2631[12]);
						float f_1141_ = (f_1129_ + (class249.aFloatArray2631[3] * (float) ((Class387_Sub2) this).anInt8134) + class249.aFloatArray2631[15]);
						class80.anInt673 = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8337) - (float) class80.anInt668 + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338 * f_1140_ / f_1141_));
					}
					class80.aBoolean671 = true;
				}
			}
			((Class387_Sub2) this).aClass_ra_Sub1_8092.method4840();
			((Class387_Sub2) this).aClass_ra_Sub1_8092.method4821(class249_1105_);
			method4520();
			((Class387_Sub2) this).aClass_ra_Sub1_8092.method4876();
			class249_1105_.method2483(((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aClass249_8378);
			method4522(class249_1105_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	public void wa() {
		for (int i = 0; i < ((Class387_Sub2) this).anInt8130; i++)
			((Class387_Sub2) this).anIntArray8104[i] = -((Class387_Sub2) this).anIntArray8104[i];
		for (int i = 0; i < ((Class387_Sub2) this).anInt8107; i++)
			((Class387_Sub2) this).aShortArray8095[i] = (short) -((Class387_Sub2) this).aShortArray8095[i];
		for (int i = 0; i < ((Class387_Sub2) this).anInt8089; i++) {
			short i_1142_ = ((Class387_Sub2) this).aShortArray8119[i];
			((Class387_Sub2) this).aShortArray8119[i] = ((Class387_Sub2) this).aShortArray8121[i];
			((Class387_Sub2) this).aShortArray8121[i] = i_1142_;
		}
		if (((Class387_Sub2) this).aClass44_8127 == null && ((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass44_8127 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass37_8087 != null)
			((Class37) ((Class387_Sub2) this).aClass37_8087).anInterface3_382 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public Class_na ce(Class_na class_na) {
		if (((Class387_Sub2) this).anInt8107 == 0)
			return null;
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		int i;
		int i_1143_;
		if ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8410) > 0) {
			i = ((((Class387_Sub2) this).aShort8145 - ((((Class387_Sub2) this).aShort8100 * ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8410) >> 8)) >> ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8296);
			i_1143_ = ((((Class387_Sub2) this).aShort8156 - ((((Class387_Sub2) this).aShort8097 * ((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).anInt8410) >> 8)) >> ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8296);
		} else {
			i = ((((Class387_Sub2) this).aShort8145 - ((((Class387_Sub2) this).aShort8097 * ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8410) >> 8)) >> ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8296);
			i_1143_ = ((((Class387_Sub2) this).aShort8156 - ((((Class387_Sub2) this).aShort8100 * ((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).anInt8410) >> 8)) >> ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8296);
		}
		int i_1144_;
		int i_1145_;
		if ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8379) > 0) {
			i_1144_ = ((((Class387_Sub2) this).aShort8140 - ((((Class387_Sub2) this).aShort8100 * ((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).anInt8379) >> 8)) >> ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8296);
			i_1145_ = ((((Class387_Sub2) this).aShort8141 - ((((Class387_Sub2) this).aShort8097 * ((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).anInt8379) >> 8)) >> ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8296);
		} else {
			i_1144_ = ((((Class387_Sub2) this).aShort8140 - ((((Class387_Sub2) this).aShort8097 * ((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).anInt8379) >> 8)) >> ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8296);
			i_1145_ = ((((Class387_Sub2) this).aShort8141 - ((((Class387_Sub2) this).aShort8100 * ((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).anInt8379) >> 8)) >> ((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anInt8296);
		}
		int i_1146_ = i_1143_ - i + 1;
		int i_1147_ = i_1145_ - i_1144_ + 1;
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		Class_na_Sub2 class_na_sub2_1148_;
		if (class_na_sub2 != null && class_na_sub2.method3531(i_1146_, i_1147_)) {
			class_na_sub2_1148_ = class_na_sub2;
			class_na_sub2_1148_.method3532();
		} else
			class_na_sub2_1148_ = new Class_na_Sub2(((Class387_Sub2) this).aClass_ra_Sub1_8092, i_1146_, i_1147_);
		class_na_sub2_1148_.method3530(i, i_1144_, i_1143_, i_1145_);
		method4525(class_na_sub2_1148_);
		return class_na_sub2_1148_;
	}

	public int c() {
		return ((Class387_Sub2) this).aShort8096;
	}

	public int cj() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).anInt8133;
	}

	public int cy() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).anInt8133;
	}

	public void method4466(Class387 class387, int i, int i_1149_, int i_1150_, boolean bool) {
		Class387_Sub2 class387_sub2_1151_ = (Class387_Sub2) class387;
		if (((Class387_Sub2) this).anInt8089 != 0 && ((Class387_Sub2) class387_sub2_1151_).anInt8089 != 0) {
			int i_1152_ = ((Class387_Sub2) class387_sub2_1151_).anInt8130;
			int[] is = ((Class387_Sub2) class387_sub2_1151_).anIntArray8102;
			int[] is_1153_ = ((Class387_Sub2) class387_sub2_1151_).anIntArray8110;
			int[] is_1154_ = ((Class387_Sub2) class387_sub2_1151_).anIntArray8104;
			short[] is_1155_ = ((Class387_Sub2) class387_sub2_1151_).aShortArray8108;
			short[] is_1156_ = ((Class387_Sub2) class387_sub2_1151_).aShortArray8109;
			short[] is_1157_ = ((Class387_Sub2) class387_sub2_1151_).aShortArray8095;
			byte[] is_1158_ = ((Class387_Sub2) class387_sub2_1151_).aByteArray8118;
			short[] is_1159_;
			short[] is_1160_;
			short[] is_1161_;
			byte[] is_1162_;
			if (((Class387_Sub2) this).aClass68_8112 != null) {
				is_1159_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray582);
				is_1160_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray583);
				is_1161_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray584);
				is_1162_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aByteArray585);
			} else {
				is_1159_ = null;
				is_1160_ = null;
				is_1161_ = null;
				is_1162_ = null;
			}
			short[] is_1163_;
			short[] is_1164_;
			short[] is_1165_;
			byte[] is_1166_;
			if (((Class387_Sub2) class387_sub2_1151_).aClass68_8112 != null) {
				is_1163_ = ((Class68) (((Class387_Sub2) class387_sub2_1151_).aClass68_8112)).aShortArray582;
				is_1164_ = ((Class68) (((Class387_Sub2) class387_sub2_1151_).aClass68_8112)).aShortArray583;
				is_1165_ = ((Class68) (((Class387_Sub2) class387_sub2_1151_).aClass68_8112)).aShortArray584;
				is_1166_ = ((Class68) (((Class387_Sub2) class387_sub2_1151_).aClass68_8112)).aByteArray585;
			} else {
				is_1163_ = null;
				is_1164_ = null;
				is_1165_ = null;
				is_1166_ = null;
			}
			int[] is_1167_ = ((Class387_Sub2) class387_sub2_1151_).anIntArray8143;
			short[] is_1168_ = ((Class387_Sub2) class387_sub2_1151_).aShortArray8144;
			if (!((Class387_Sub2) class387_sub2_1151_).aBoolean8126)
				class387_sub2_1151_.method4528();
			int i_1169_ = ((Class387_Sub2) class387_sub2_1151_).aShort8097;
			int i_1170_ = ((Class387_Sub2) class387_sub2_1151_).aShort8100;
			int i_1171_ = ((Class387_Sub2) class387_sub2_1151_).aShort8145;
			int i_1172_ = ((Class387_Sub2) class387_sub2_1151_).aShort8156;
			int i_1173_ = ((Class387_Sub2) class387_sub2_1151_).aShort8140;
			int i_1174_ = ((Class387_Sub2) class387_sub2_1151_).aShort8141;
			for (int i_1175_ = 0; i_1175_ < ((Class387_Sub2) this).anInt8130; i_1175_++) {
				int i_1176_ = ((Class387_Sub2) this).anIntArray8110[i_1175_] - i_1149_;
				if (i_1176_ >= i_1169_ && i_1176_ <= i_1170_) {
					int i_1177_ = ((Class387_Sub2) this).anIntArray8102[i_1175_] - i;
					if (i_1177_ >= i_1171_ && i_1177_ <= i_1172_) {
						int i_1178_ = (((Class387_Sub2) this).anIntArray8104[i_1175_] - i_1150_);
						if (i_1178_ >= i_1173_ && i_1178_ <= i_1174_) {
							int i_1179_ = -1;
							int i_1180_ = (((Class387_Sub2) this).anIntArray8143[i_1175_]);
							int i_1181_ = (((Class387_Sub2) this).anIntArray8143[i_1175_ + 1]);
							for (int i_1182_ = i_1180_; i_1182_ < i_1181_; i_1182_++) {
								i_1179_ = (((Class387_Sub2) this).aShortArray8144[i_1182_]) - 1;
								if (i_1179_ == -1 || (((Class387_Sub2) this).aByteArray8118[i_1179_]) != 0)
									break;
							}
							if (i_1179_ != -1) {
								for (int i_1183_ = 0; i_1183_ < i_1152_; i_1183_++) {
									if (i_1177_ == is[i_1183_] && i_1178_ == is_1154_[i_1183_] && i_1176_ == is_1153_[i_1183_]) {
										int i_1184_ = -1;
										i_1180_ = is_1167_[i_1183_];
										i_1181_ = is_1167_[i_1183_ + 1];
										for (int i_1185_ = i_1180_; i_1185_ < i_1181_; i_1185_++) {
											i_1184_ = is_1168_[i_1185_] - 1;
											if (i_1184_ == -1 || is_1158_[i_1184_] != 0)
												break;
										}
										if (i_1184_ != -1) {
											if (is_1159_ == null) {
												((Class387_Sub2) this).aClass68_8112 = new Class68();
												is_1159_ = ((Class68) (((Class387_Sub2) this).aClass68_8112)).aShortArray582 = (Class263_Sub4.method2637((((Class387_Sub2) this).aShortArray8108), 2033461305));
												is_1160_ = ((Class68) (((Class387_Sub2) this).aClass68_8112)).aShortArray583 = (Class263_Sub4.method2637((((Class387_Sub2) this).aShortArray8109), 1876535494));
												is_1161_ = ((Class68) (((Class387_Sub2) this).aClass68_8112)).aShortArray584 = (Class263_Sub4.method2637((((Class387_Sub2) this).aShortArray8095), 1486808295));
												is_1162_ = ((Class68) (((Class387_Sub2) this).aClass68_8112)).aByteArray585 = (IcmpService_Sub1.method6479((((Class387_Sub2) this).aByteArray8118), (byte) 2));
											}
											if (is_1163_ == null) {
												Class68 class68 = (((Class387_Sub2) class387_sub2_1151_).aClass68_8112 = new Class68());
												is_1163_ = ((Class68) class68).aShortArray582 = (Class263_Sub4.method2637(is_1155_, 1765560439));
												is_1164_ = ((Class68) class68).aShortArray583 = (Class263_Sub4.method2637(is_1156_, 1524089829));
												is_1165_ = ((Class68) class68).aShortArray584 = (Class263_Sub4.method2637(is_1157_, 1729817608));
												is_1166_ = ((Class68) class68).aByteArray585 = (IcmpService_Sub1.method6479(is_1158_, (byte) 2));
											}
											short i_1186_ = (((Class387_Sub2) this).aShortArray8108[i_1179_]);
											short i_1187_ = (((Class387_Sub2) this).aShortArray8109[i_1179_]);
											short i_1188_ = (((Class387_Sub2) this).aShortArray8095[i_1179_]);
											byte i_1189_ = (((Class387_Sub2) this).aByteArray8118[i_1179_]);
											i_1180_ = is_1167_[i_1183_];
											i_1181_ = is_1167_[i_1183_ + 1];
											for (int i_1190_ = i_1180_; i_1190_ < i_1181_; i_1190_++) {
												int i_1191_ = is_1168_[i_1190_] - 1;
												if (i_1191_ == -1)
													break;
												if (is_1166_[i_1191_] != 0) {
													is_1163_[i_1191_] += i_1186_;
													is_1164_[i_1191_] += i_1187_;
													is_1165_[i_1191_] += i_1188_;
													is_1166_[i_1191_] += i_1189_;
												}
											}
											i_1186_ = is_1155_[i_1184_];
											i_1187_ = is_1156_[i_1184_];
											i_1188_ = is_1157_[i_1184_];
											i_1189_ = is_1158_[i_1184_];
											i_1180_ = (((Class387_Sub2) this).anIntArray8143[i_1175_]);
											i_1181_ = (((Class387_Sub2) this).anIntArray8143[i_1175_ + 1]);
											for (int i_1192_ = i_1180_; i_1192_ < i_1181_; i_1192_++) {
												int i_1193_ = ((((Class387_Sub2) this).aShortArray8144[i_1192_]) - 1);
												if (i_1193_ == -1)
													break;
												if (is_1162_[i_1193_] != 0) {
													is_1159_[i_1193_] += i_1186_;
													is_1160_[i_1193_] += i_1187_;
													is_1161_[i_1193_] += i_1188_;
													is_1162_[i_1193_] += i_1189_;
												}
											}
											if ((((Class387_Sub2) this).aClass44_8127) == null && (((Class387_Sub2) this).aClass44_8105) != null)
												((Class44) (((Class387_Sub2) this).aClass44_8105)).anInterface1_441 = null;
											if ((((Class387_Sub2) this).aClass44_8127) != null)
												((Class44) (((Class387_Sub2) this).aClass44_8127)).anInterface1_441 = null;
											if ((((Class387_Sub2) class387_sub2_1151_).aClass44_8127) == null && (((Class387_Sub2) class387_sub2_1151_).aClass44_8105) != null)
												((Class44) (((Class387_Sub2) class387_sub2_1151_).aClass44_8105)).anInterface1_441 = null;
											if ((((Class387_Sub2) class387_sub2_1151_).aClass44_8127) != null)
												((Class44) (((Class387_Sub2) class387_sub2_1151_).aClass44_8127)).anInterface1_441 = null;
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

	public int ct() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).aShort8145;
	}

	void ka() {
		for (int i = 0; i < ((Class387_Sub2) this).anInt8115; i++) {
			((Class387_Sub2) this).anIntArray8102[i] = ((Class387_Sub2) this).anIntArray8102[i] + 7 >> 4;
			((Class387_Sub2) this).anIntArray8110[i] = ((Class387_Sub2) this).anIntArray8110[i] + 7 >> 4;
			((Class387_Sub2) this).anIntArray8104[i] = ((Class387_Sub2) this).anIntArray8104[i] + 7 >> 4;
		}
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public void method4490(Class387 class387, int i, int i_1194_, int i_1195_, boolean bool) {
		Class387_Sub2 class387_sub2_1196_ = (Class387_Sub2) class387;
		if (((Class387_Sub2) this).anInt8089 != 0 && ((Class387_Sub2) class387_sub2_1196_).anInt8089 != 0) {
			int i_1197_ = ((Class387_Sub2) class387_sub2_1196_).anInt8130;
			int[] is = ((Class387_Sub2) class387_sub2_1196_).anIntArray8102;
			int[] is_1198_ = ((Class387_Sub2) class387_sub2_1196_).anIntArray8110;
			int[] is_1199_ = ((Class387_Sub2) class387_sub2_1196_).anIntArray8104;
			short[] is_1200_ = ((Class387_Sub2) class387_sub2_1196_).aShortArray8108;
			short[] is_1201_ = ((Class387_Sub2) class387_sub2_1196_).aShortArray8109;
			short[] is_1202_ = ((Class387_Sub2) class387_sub2_1196_).aShortArray8095;
			byte[] is_1203_ = ((Class387_Sub2) class387_sub2_1196_).aByteArray8118;
			short[] is_1204_;
			short[] is_1205_;
			short[] is_1206_;
			byte[] is_1207_;
			if (((Class387_Sub2) this).aClass68_8112 != null) {
				is_1204_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray582);
				is_1205_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray583);
				is_1206_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray584);
				is_1207_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aByteArray585);
			} else {
				is_1204_ = null;
				is_1205_ = null;
				is_1206_ = null;
				is_1207_ = null;
			}
			short[] is_1208_;
			short[] is_1209_;
			short[] is_1210_;
			byte[] is_1211_;
			if (((Class387_Sub2) class387_sub2_1196_).aClass68_8112 != null) {
				is_1208_ = ((Class68) (((Class387_Sub2) class387_sub2_1196_).aClass68_8112)).aShortArray582;
				is_1209_ = ((Class68) (((Class387_Sub2) class387_sub2_1196_).aClass68_8112)).aShortArray583;
				is_1210_ = ((Class68) (((Class387_Sub2) class387_sub2_1196_).aClass68_8112)).aShortArray584;
				is_1211_ = ((Class68) (((Class387_Sub2) class387_sub2_1196_).aClass68_8112)).aByteArray585;
			} else {
				is_1208_ = null;
				is_1209_ = null;
				is_1210_ = null;
				is_1211_ = null;
			}
			int[] is_1212_ = ((Class387_Sub2) class387_sub2_1196_).anIntArray8143;
			short[] is_1213_ = ((Class387_Sub2) class387_sub2_1196_).aShortArray8144;
			if (!((Class387_Sub2) class387_sub2_1196_).aBoolean8126)
				class387_sub2_1196_.method4528();
			int i_1214_ = ((Class387_Sub2) class387_sub2_1196_).aShort8097;
			int i_1215_ = ((Class387_Sub2) class387_sub2_1196_).aShort8100;
			int i_1216_ = ((Class387_Sub2) class387_sub2_1196_).aShort8145;
			int i_1217_ = ((Class387_Sub2) class387_sub2_1196_).aShort8156;
			int i_1218_ = ((Class387_Sub2) class387_sub2_1196_).aShort8140;
			int i_1219_ = ((Class387_Sub2) class387_sub2_1196_).aShort8141;
			for (int i_1220_ = 0; i_1220_ < ((Class387_Sub2) this).anInt8130; i_1220_++) {
				int i_1221_ = ((Class387_Sub2) this).anIntArray8110[i_1220_] - i_1194_;
				if (i_1221_ >= i_1214_ && i_1221_ <= i_1215_) {
					int i_1222_ = ((Class387_Sub2) this).anIntArray8102[i_1220_] - i;
					if (i_1222_ >= i_1216_ && i_1222_ <= i_1217_) {
						int i_1223_ = (((Class387_Sub2) this).anIntArray8104[i_1220_] - i_1195_);
						if (i_1223_ >= i_1218_ && i_1223_ <= i_1219_) {
							int i_1224_ = -1;
							int i_1225_ = (((Class387_Sub2) this).anIntArray8143[i_1220_]);
							int i_1226_ = (((Class387_Sub2) this).anIntArray8143[i_1220_ + 1]);
							for (int i_1227_ = i_1225_; i_1227_ < i_1226_; i_1227_++) {
								i_1224_ = (((Class387_Sub2) this).aShortArray8144[i_1227_]) - 1;
								if (i_1224_ == -1 || (((Class387_Sub2) this).aByteArray8118[i_1224_]) != 0)
									break;
							}
							if (i_1224_ != -1) {
								for (int i_1228_ = 0; i_1228_ < i_1197_; i_1228_++) {
									if (i_1222_ == is[i_1228_] && i_1223_ == is_1199_[i_1228_] && i_1221_ == is_1198_[i_1228_]) {
										int i_1229_ = -1;
										i_1225_ = is_1212_[i_1228_];
										i_1226_ = is_1212_[i_1228_ + 1];
										for (int i_1230_ = i_1225_; i_1230_ < i_1226_; i_1230_++) {
											i_1229_ = is_1213_[i_1230_] - 1;
											if (i_1229_ == -1 || is_1203_[i_1229_] != 0)
												break;
										}
										if (i_1229_ != -1) {
											if (is_1204_ == null) {
												((Class387_Sub2) this).aClass68_8112 = new Class68();
												is_1204_ = ((Class68) (((Class387_Sub2) this).aClass68_8112)).aShortArray582 = (Class263_Sub4.method2637((((Class387_Sub2) this).aShortArray8108), 1943862827));
												is_1205_ = ((Class68) (((Class387_Sub2) this).aClass68_8112)).aShortArray583 = (Class263_Sub4.method2637((((Class387_Sub2) this).aShortArray8109), 1953356479));
												is_1206_ = ((Class68) (((Class387_Sub2) this).aClass68_8112)).aShortArray584 = (Class263_Sub4.method2637((((Class387_Sub2) this).aShortArray8095), 1926160390));
												is_1207_ = ((Class68) (((Class387_Sub2) this).aClass68_8112)).aByteArray585 = (IcmpService_Sub1.method6479((((Class387_Sub2) this).aByteArray8118), (byte) 2));
											}
											if (is_1208_ == null) {
												Class68 class68 = (((Class387_Sub2) class387_sub2_1196_).aClass68_8112 = new Class68());
												is_1208_ = ((Class68) class68).aShortArray582 = (Class263_Sub4.method2637(is_1200_, 1435030838));
												is_1209_ = ((Class68) class68).aShortArray583 = (Class263_Sub4.method2637(is_1201_, 1445247275));
												is_1210_ = ((Class68) class68).aShortArray584 = (Class263_Sub4.method2637(is_1202_, 2005637484));
												is_1211_ = ((Class68) class68).aByteArray585 = (IcmpService_Sub1.method6479(is_1203_, (byte) 2));
											}
											short i_1231_ = (((Class387_Sub2) this).aShortArray8108[i_1224_]);
											short i_1232_ = (((Class387_Sub2) this).aShortArray8109[i_1224_]);
											short i_1233_ = (((Class387_Sub2) this).aShortArray8095[i_1224_]);
											byte i_1234_ = (((Class387_Sub2) this).aByteArray8118[i_1224_]);
											i_1225_ = is_1212_[i_1228_];
											i_1226_ = is_1212_[i_1228_ + 1];
											for (int i_1235_ = i_1225_; i_1235_ < i_1226_; i_1235_++) {
												int i_1236_ = is_1213_[i_1235_] - 1;
												if (i_1236_ == -1)
													break;
												if (is_1211_[i_1236_] != 0) {
													is_1208_[i_1236_] += i_1231_;
													is_1209_[i_1236_] += i_1232_;
													is_1210_[i_1236_] += i_1233_;
													is_1211_[i_1236_] += i_1234_;
												}
											}
											i_1231_ = is_1200_[i_1229_];
											i_1232_ = is_1201_[i_1229_];
											i_1233_ = is_1202_[i_1229_];
											i_1234_ = is_1203_[i_1229_];
											i_1225_ = (((Class387_Sub2) this).anIntArray8143[i_1220_]);
											i_1226_ = (((Class387_Sub2) this).anIntArray8143[i_1220_ + 1]);
											for (int i_1237_ = i_1225_; i_1237_ < i_1226_; i_1237_++) {
												int i_1238_ = ((((Class387_Sub2) this).aShortArray8144[i_1237_]) - 1);
												if (i_1238_ == -1)
													break;
												if (is_1207_[i_1238_] != 0) {
													is_1204_[i_1238_] += i_1231_;
													is_1205_[i_1238_] += i_1232_;
													is_1206_[i_1238_] += i_1233_;
													is_1207_[i_1238_] += i_1234_;
												}
											}
											if ((((Class387_Sub2) this).aClass44_8127) == null && (((Class387_Sub2) this).aClass44_8105) != null)
												((Class44) (((Class387_Sub2) this).aClass44_8105)).anInterface1_441 = null;
											if ((((Class387_Sub2) this).aClass44_8127) != null)
												((Class44) (((Class387_Sub2) this).aClass44_8127)).anInterface1_441 = null;
											if ((((Class387_Sub2) class387_sub2_1196_).aClass44_8127) == null && (((Class387_Sub2) class387_sub2_1196_).aClass44_8105) != null)
												((Class44) (((Class387_Sub2) class387_sub2_1196_).aClass44_8105)).anInterface1_441 = null;
											if ((((Class387_Sub2) class387_sub2_1196_).aClass44_8127) != null)
												((Class44) (((Class387_Sub2) class387_sub2_1196_).aClass44_8127)).anInterface1_441 = null;
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

	public void paintTexture(short i, short i_1239_) {
		Interface_ma interface_ma = ((Class387_Sub2) this).aClass_ra_Sub1_8092.anInterface_ma4227;
		for (int i_1240_ = 0; i_1240_ < ((Class387_Sub2) this).anInt8089; i_1240_++) {
			if (((Class387_Sub2) this).modelTextures[i_1240_] == i)
				((Class387_Sub2) this).modelTextures[i_1240_] = i_1239_;
		}
		byte i_1241_ = 0;
		byte i_1242_ = 0;
		if (i != -1) {
			Class56 class56 = interface_ma.method221(i & 0xffff, -215101771);
			i_1241_ = class56.aByte529;
			i_1242_ = class56.aByte534;
		}
		byte i_1243_ = 0;
		byte i_1244_ = 0;
		if (i_1239_ != -1) {
			Class56 class56 = interface_ma.method221(i_1239_ & 0xffff, -1629780249);
			i_1243_ = class56.aByte529;
			i_1244_ = class56.aByte534;
			if (class56.aByte531 != 0 || class56.aByte530 != 0)
				((Class387_Sub2) this).aBoolean8153 = true;
		}
		if (i_1241_ != i_1243_ | i_1242_ != i_1244_) {
			if (((Class387_Sub2) this).aClass52Array8148 != null) {
				for (int i_1245_ = 0; i_1245_ < ((Class387_Sub2) this).anInt8147; i_1245_++) {
					Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_1245_];
					Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_1245_];
					((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
				}
			}
			if (((Class387_Sub2) this).aClass44_8105 != null)
				((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
		}
	}

	Class387 method4526(Class387_Sub2 class387_sub2_1246_, Class387_Sub2 class387_sub2_1247_, int i, boolean bool, boolean bool_1248_) {
		((Class387_Sub2) class387_sub2_1246_).aByte8138 = (byte) 0;
		((Class387_Sub2) class387_sub2_1246_).anInt8093 = i;
		((Class387_Sub2) class387_sub2_1246_).anInt8094 = ((Class387_Sub2) this).anInt8094;
		((Class387_Sub2) class387_sub2_1246_).aShort8096 = ((Class387_Sub2) this).aShort8096;
		((Class387_Sub2) class387_sub2_1246_).aShort8099 = ((Class387_Sub2) this).aShort8099;
		((Class387_Sub2) class387_sub2_1246_).anInt8115 = ((Class387_Sub2) this).anInt8115;
		((Class387_Sub2) class387_sub2_1246_).anInt8130 = ((Class387_Sub2) this).anInt8130;
		((Class387_Sub2) class387_sub2_1246_).anInt8107 = ((Class387_Sub2) this).anInt8107;
		((Class387_Sub2) class387_sub2_1246_).anInt8089 = ((Class387_Sub2) this).anInt8089;
		((Class387_Sub2) class387_sub2_1246_).anInt8116 = ((Class387_Sub2) this).anInt8116;
		((Class387_Sub2) class387_sub2_1246_).anInt8147 = ((Class387_Sub2) this).anInt8147;
		if ((i & 0x100) != 0)
			((Class387_Sub2) class387_sub2_1246_).aBoolean8098 = true;
		else
			((Class387_Sub2) class387_sub2_1246_).aBoolean8098 = ((Class387_Sub2) this).aBoolean8098;
		((Class387_Sub2) class387_sub2_1246_).aBoolean8153 = ((Class387_Sub2) this).aBoolean8153;
		boolean bool_1249_ = Class41.method549(i, ((Class387_Sub2) this).anInt8094);
		boolean bool_1250_ = Class41.method550(i, ((Class387_Sub2) this).anInt8094);
		boolean bool_1251_ = Class41.method551(i, ((Class387_Sub2) this).anInt8094);
		boolean bool_1252_ = bool_1249_ | bool_1250_ | bool_1251_;
		if (bool_1252_) {
			if (bool_1249_) {
				if ((((Class387_Sub2) class387_sub2_1247_).anIntArray8102 == null) || ((((Class387_Sub2) class387_sub2_1247_).anIntArray8102).length < ((Class387_Sub2) this).anInt8115))
					((Class387_Sub2) class387_sub2_1246_).anIntArray8102 = ((Class387_Sub2) class387_sub2_1247_).anIntArray8102 = new int[((Class387_Sub2) this).anInt8115];
				else
					((Class387_Sub2) class387_sub2_1246_).anIntArray8102 = ((Class387_Sub2) class387_sub2_1247_).anIntArray8102;
			} else
				((Class387_Sub2) class387_sub2_1246_).anIntArray8102 = ((Class387_Sub2) this).anIntArray8102;
			if (bool_1250_) {
				if ((((Class387_Sub2) class387_sub2_1247_).anIntArray8110 == null) || ((((Class387_Sub2) class387_sub2_1247_).anIntArray8110).length < ((Class387_Sub2) this).anInt8115))
					((Class387_Sub2) class387_sub2_1246_).anIntArray8110 = ((Class387_Sub2) class387_sub2_1247_).anIntArray8110 = new int[((Class387_Sub2) this).anInt8115];
				else
					((Class387_Sub2) class387_sub2_1246_).anIntArray8110 = ((Class387_Sub2) class387_sub2_1247_).anIntArray8110;
			} else
				((Class387_Sub2) class387_sub2_1246_).anIntArray8110 = ((Class387_Sub2) this).anIntArray8110;
			if (bool_1251_) {
				if ((((Class387_Sub2) class387_sub2_1247_).anIntArray8104 == null) || ((((Class387_Sub2) class387_sub2_1247_).anIntArray8104).length < ((Class387_Sub2) this).anInt8115))
					((Class387_Sub2) class387_sub2_1246_).anIntArray8104 = ((Class387_Sub2) class387_sub2_1247_).anIntArray8104 = new int[((Class387_Sub2) this).anInt8115];
				else
					((Class387_Sub2) class387_sub2_1246_).anIntArray8104 = ((Class387_Sub2) class387_sub2_1247_).anIntArray8104;
			} else
				((Class387_Sub2) class387_sub2_1246_).anIntArray8104 = ((Class387_Sub2) this).anIntArray8104;
			for (int i_1253_ = 0; i_1253_ < ((Class387_Sub2) this).anInt8115; i_1253_++) {
				if (bool_1249_)
					((Class387_Sub2) class387_sub2_1246_).anIntArray8102[i_1253_] = ((Class387_Sub2) this).anIntArray8102[i_1253_];
				if (bool_1250_)
					((Class387_Sub2) class387_sub2_1246_).anIntArray8110[i_1253_] = ((Class387_Sub2) this).anIntArray8110[i_1253_];
				if (bool_1251_)
					((Class387_Sub2) class387_sub2_1246_).anIntArray8104[i_1253_] = ((Class387_Sub2) this).anIntArray8104[i_1253_];
			}
		} else {
			((Class387_Sub2) class387_sub2_1246_).anIntArray8102 = ((Class387_Sub2) this).anIntArray8102;
			((Class387_Sub2) class387_sub2_1246_).anIntArray8110 = ((Class387_Sub2) this).anIntArray8110;
			((Class387_Sub2) class387_sub2_1246_).anIntArray8104 = ((Class387_Sub2) this).anIntArray8104;
		}
		if (Class41.method561(i, ((Class387_Sub2) this).anInt8094)) {
			if (bool)
				((Class387_Sub2) class387_sub2_1246_).aByte8138 |= 0x1;
			((Class387_Sub2) class387_sub2_1246_).aClass44_8125 = ((Class387_Sub2) class387_sub2_1247_).aClass44_8125;
			((Class44) ((Class387_Sub2) class387_sub2_1246_).aClass44_8125).aByte443 = ((Class44) ((Class387_Sub2) this).aClass44_8125).aByte443;
			((Class44) ((Class387_Sub2) class387_sub2_1246_).aClass44_8125).anInterface1_441 = (((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441);
		} else if (Class41.method573(i, ((Class387_Sub2) this).anInt8094))
			((Class387_Sub2) class387_sub2_1246_).aClass44_8125 = ((Class387_Sub2) this).aClass44_8125;
		else
			((Class387_Sub2) class387_sub2_1246_).aClass44_8125 = null;
		if (Class41.method554(i, ((Class387_Sub2) this).anInt8094)) {
			if (((Class387_Sub2) class387_sub2_1247_).modelColors == null || ((((Class387_Sub2) class387_sub2_1247_).modelColors).length < ((Class387_Sub2) this).anInt8089))
				((Class387_Sub2) class387_sub2_1246_).modelColors = ((Class387_Sub2) class387_sub2_1247_).modelColors = new short[((Class387_Sub2) this).anInt8089];
			else
				((Class387_Sub2) class387_sub2_1246_).modelColors = ((Class387_Sub2) class387_sub2_1247_).modelColors;
			for (int i_1254_ = 0; i_1254_ < ((Class387_Sub2) this).anInt8089; i_1254_++)
				((Class387_Sub2) class387_sub2_1246_).modelColors[i_1254_] = ((Class387_Sub2) this).modelColors[i_1254_];
		} else
			((Class387_Sub2) class387_sub2_1246_).modelColors = ((Class387_Sub2) this).modelColors;
		if (Class41.method570(i, ((Class387_Sub2) this).anInt8094)) {
			if (((Class387_Sub2) class387_sub2_1247_).aByteArray8136 == null || (((Class387_Sub2) class387_sub2_1247_).aByteArray8136.length < ((Class387_Sub2) this).anInt8089))
				((Class387_Sub2) class387_sub2_1246_).aByteArray8136 = ((Class387_Sub2) class387_sub2_1247_).aByteArray8136 = new byte[((Class387_Sub2) this).anInt8089];
			else
				((Class387_Sub2) class387_sub2_1246_).aByteArray8136 = ((Class387_Sub2) class387_sub2_1247_).aByteArray8136;
			for (int i_1255_ = 0; i_1255_ < ((Class387_Sub2) this).anInt8089; i_1255_++)
				((Class387_Sub2) class387_sub2_1246_).aByteArray8136[i_1255_] = ((Class387_Sub2) this).aByteArray8136[i_1255_];
		} else
			((Class387_Sub2) class387_sub2_1246_).aByteArray8136 = ((Class387_Sub2) this).aByteArray8136;
		if (Class41.method575(i, ((Class387_Sub2) this).anInt8094)) {
			if (bool)
				((Class387_Sub2) class387_sub2_1246_).aByte8138 |= 0x2;
			((Class387_Sub2) class387_sub2_1246_).aClass44_8105 = ((Class387_Sub2) class387_sub2_1247_).aClass44_8105;
			((Class44) ((Class387_Sub2) class387_sub2_1246_).aClass44_8105).aByte443 = ((Class44) ((Class387_Sub2) this).aClass44_8105).aByte443;
			((Class44) ((Class387_Sub2) class387_sub2_1246_).aClass44_8105).anInterface1_441 = (((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441);
		} else if (Class41.method558(i, ((Class387_Sub2) this).anInt8094))
			((Class387_Sub2) class387_sub2_1246_).aClass44_8105 = ((Class387_Sub2) this).aClass44_8105;
		else
			((Class387_Sub2) class387_sub2_1246_).aClass44_8105 = null;
		if (Class41.method553(i, ((Class387_Sub2) this).anInt8094)) {
			if (((Class387_Sub2) class387_sub2_1247_).aShortArray8108 == null || ((((Class387_Sub2) class387_sub2_1247_).aShortArray8108).length < ((Class387_Sub2) this).anInt8107)) {
				int i_1256_ = ((Class387_Sub2) this).anInt8107;
				((Class387_Sub2) class387_sub2_1246_).aShortArray8108 = ((Class387_Sub2) class387_sub2_1247_).aShortArray8108 = new short[i_1256_];
				((Class387_Sub2) class387_sub2_1246_).aShortArray8109 = ((Class387_Sub2) class387_sub2_1247_).aShortArray8109 = new short[i_1256_];
				((Class387_Sub2) class387_sub2_1246_).aShortArray8095 = ((Class387_Sub2) class387_sub2_1247_).aShortArray8095 = new short[i_1256_];
			} else {
				((Class387_Sub2) class387_sub2_1246_).aShortArray8108 = ((Class387_Sub2) class387_sub2_1247_).aShortArray8108;
				((Class387_Sub2) class387_sub2_1246_).aShortArray8109 = ((Class387_Sub2) class387_sub2_1247_).aShortArray8109;
				((Class387_Sub2) class387_sub2_1246_).aShortArray8095 = ((Class387_Sub2) class387_sub2_1247_).aShortArray8095;
			}
			if (((Class387_Sub2) this).aClass68_8112 != null) {
				if (((Class387_Sub2) class387_sub2_1247_).aClass68_8112 == null)
					((Class387_Sub2) class387_sub2_1247_).aClass68_8112 = new Class68();
				Class68 class68 = (((Class387_Sub2) class387_sub2_1246_).aClass68_8112 = ((Class387_Sub2) class387_sub2_1247_).aClass68_8112);
				if (((Class68) class68).aShortArray582 == null || (((Class68) class68).aShortArray582.length < ((Class387_Sub2) this).anInt8107)) {
					int i_1257_ = ((Class387_Sub2) this).anInt8107;
					((Class68) class68).aShortArray582 = new short[i_1257_];
					((Class68) class68).aShortArray583 = new short[i_1257_];
					((Class68) class68).aShortArray584 = new short[i_1257_];
					((Class68) class68).aByteArray585 = new byte[i_1257_];
				}
				for (int i_1258_ = 0; i_1258_ < ((Class387_Sub2) this).anInt8107; i_1258_++) {
					((Class387_Sub2) class387_sub2_1246_).aShortArray8108[i_1258_] = ((Class387_Sub2) this).aShortArray8108[i_1258_];
					((Class387_Sub2) class387_sub2_1246_).aShortArray8109[i_1258_] = ((Class387_Sub2) this).aShortArray8109[i_1258_];
					((Class387_Sub2) class387_sub2_1246_).aShortArray8095[i_1258_] = ((Class387_Sub2) this).aShortArray8095[i_1258_];
					((Class68) class68).aShortArray582[i_1258_] = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray582[i_1258_]);
					((Class68) class68).aShortArray583[i_1258_] = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray583[i_1258_]);
					((Class68) class68).aShortArray584[i_1258_] = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray584[i_1258_]);
					((Class68) class68).aByteArray585[i_1258_] = (((Class68) ((Class387_Sub2) this).aClass68_8112).aByteArray585[i_1258_]);
				}
			} else {
				for (int i_1259_ = 0; i_1259_ < ((Class387_Sub2) this).anInt8107; i_1259_++) {
					((Class387_Sub2) class387_sub2_1246_).aShortArray8108[i_1259_] = ((Class387_Sub2) this).aShortArray8108[i_1259_];
					((Class387_Sub2) class387_sub2_1246_).aShortArray8109[i_1259_] = ((Class387_Sub2) this).aShortArray8109[i_1259_];
					((Class387_Sub2) class387_sub2_1246_).aShortArray8095[i_1259_] = ((Class387_Sub2) this).aShortArray8095[i_1259_];
				}
			}
			((Class387_Sub2) class387_sub2_1246_).aByteArray8118 = ((Class387_Sub2) this).aByteArray8118;
		} else {
			((Class387_Sub2) class387_sub2_1246_).aClass68_8112 = ((Class387_Sub2) this).aClass68_8112;
			((Class387_Sub2) class387_sub2_1246_).aShortArray8108 = ((Class387_Sub2) this).aShortArray8108;
			((Class387_Sub2) class387_sub2_1246_).aShortArray8109 = ((Class387_Sub2) this).aShortArray8109;
			((Class387_Sub2) class387_sub2_1246_).aShortArray8095 = ((Class387_Sub2) this).aShortArray8095;
			((Class387_Sub2) class387_sub2_1246_).aByteArray8118 = ((Class387_Sub2) this).aByteArray8118;
		}
		if (Class41.method578(i, ((Class387_Sub2) this).anInt8094)) {
			if (bool)
				((Class387_Sub2) class387_sub2_1246_).aByte8138 |= 0x4;
			((Class387_Sub2) class387_sub2_1246_).aClass44_8127 = ((Class387_Sub2) class387_sub2_1247_).aClass44_8127;
			((Class44) ((Class387_Sub2) class387_sub2_1246_).aClass44_8127).aByte443 = ((Class44) ((Class387_Sub2) this).aClass44_8127).aByte443;
			((Class44) ((Class387_Sub2) class387_sub2_1246_).aClass44_8127).anInterface1_441 = (((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441);
		} else if (Class41.method562(i, ((Class387_Sub2) this).anInt8094))
			((Class387_Sub2) class387_sub2_1246_).aClass44_8127 = ((Class387_Sub2) this).aClass44_8127;
		else
			((Class387_Sub2) class387_sub2_1246_).aClass44_8127 = null;
		if (Class41.method555(i, ((Class387_Sub2) this).anInt8094)) {
			if (((Class387_Sub2) class387_sub2_1247_).aFloatArray8129 == null || ((((Class387_Sub2) class387_sub2_1247_).aFloatArray8129).length < ((Class387_Sub2) this).anInt8089)) {
				int i_1260_ = ((Class387_Sub2) this).anInt8107;
				((Class387_Sub2) class387_sub2_1246_).aFloatArray8129 = ((Class387_Sub2) class387_sub2_1247_).aFloatArray8129 = new float[i_1260_];
				((Class387_Sub2) class387_sub2_1246_).aFloatArray8114 = ((Class387_Sub2) class387_sub2_1247_).aFloatArray8114 = new float[i_1260_];
			} else {
				((Class387_Sub2) class387_sub2_1246_).aFloatArray8129 = ((Class387_Sub2) class387_sub2_1247_).aFloatArray8129;
				((Class387_Sub2) class387_sub2_1246_).aFloatArray8114 = ((Class387_Sub2) class387_sub2_1247_).aFloatArray8114;
			}
			for (int i_1261_ = 0; i_1261_ < ((Class387_Sub2) this).anInt8107; i_1261_++) {
				((Class387_Sub2) class387_sub2_1246_).aFloatArray8129[i_1261_] = ((Class387_Sub2) this).aFloatArray8129[i_1261_];
				((Class387_Sub2) class387_sub2_1246_).aFloatArray8114[i_1261_] = ((Class387_Sub2) this).aFloatArray8114[i_1261_];
			}
		} else {
			((Class387_Sub2) class387_sub2_1246_).aFloatArray8129 = ((Class387_Sub2) this).aFloatArray8129;
			((Class387_Sub2) class387_sub2_1246_).aFloatArray8114 = ((Class387_Sub2) this).aFloatArray8114;
		}
		if (Class41.method577(i, ((Class387_Sub2) this).anInt8094)) {
			if (bool)
				((Class387_Sub2) class387_sub2_1246_).aByte8138 |= 0x8;
			((Class387_Sub2) class387_sub2_1246_).aClass44_8128 = ((Class387_Sub2) class387_sub2_1247_).aClass44_8128;
			((Class44) ((Class387_Sub2) class387_sub2_1246_).aClass44_8128).aByte443 = ((Class44) ((Class387_Sub2) this).aClass44_8128).aByte443;
			((Class44) ((Class387_Sub2) class387_sub2_1246_).aClass44_8128).anInterface1_441 = (((Class44) ((Class387_Sub2) this).aClass44_8128).anInterface1_441);
		} else if (Class41.method559(i, ((Class387_Sub2) this).anInt8094))
			((Class387_Sub2) class387_sub2_1246_).aClass44_8128 = ((Class387_Sub2) this).aClass44_8128;
		else
			((Class387_Sub2) class387_sub2_1246_).aClass44_8128 = null;
		if (Class41.method580(i, ((Class387_Sub2) this).anInt8094)) {
			if (((Class387_Sub2) class387_sub2_1247_).aShortArray8119 == null || ((((Class387_Sub2) class387_sub2_1247_).aShortArray8119).length < ((Class387_Sub2) this).anInt8089)) {
				int i_1262_ = ((Class387_Sub2) this).anInt8089;
				((Class387_Sub2) class387_sub2_1246_).aShortArray8119 = ((Class387_Sub2) class387_sub2_1247_).aShortArray8119 = new short[i_1262_];
				((Class387_Sub2) class387_sub2_1246_).aShortArray8120 = ((Class387_Sub2) class387_sub2_1247_).aShortArray8120 = new short[i_1262_];
				((Class387_Sub2) class387_sub2_1246_).aShortArray8121 = ((Class387_Sub2) class387_sub2_1247_).aShortArray8121 = new short[i_1262_];
			} else {
				((Class387_Sub2) class387_sub2_1246_).aShortArray8119 = ((Class387_Sub2) class387_sub2_1247_).aShortArray8119;
				((Class387_Sub2) class387_sub2_1246_).aShortArray8120 = ((Class387_Sub2) class387_sub2_1247_).aShortArray8120;
				((Class387_Sub2) class387_sub2_1246_).aShortArray8121 = ((Class387_Sub2) class387_sub2_1247_).aShortArray8121;
			}
			for (int i_1263_ = 0; i_1263_ < ((Class387_Sub2) this).anInt8089; i_1263_++) {
				((Class387_Sub2) class387_sub2_1246_).aShortArray8119[i_1263_] = ((Class387_Sub2) this).aShortArray8119[i_1263_];
				((Class387_Sub2) class387_sub2_1246_).aShortArray8120[i_1263_] = ((Class387_Sub2) this).aShortArray8120[i_1263_];
				((Class387_Sub2) class387_sub2_1246_).aShortArray8121[i_1263_] = ((Class387_Sub2) this).aShortArray8121[i_1263_];
			}
		} else {
			((Class387_Sub2) class387_sub2_1246_).aShortArray8119 = ((Class387_Sub2) this).aShortArray8119;
			((Class387_Sub2) class387_sub2_1246_).aShortArray8120 = ((Class387_Sub2) this).aShortArray8120;
			((Class387_Sub2) class387_sub2_1246_).aShortArray8121 = ((Class387_Sub2) this).aShortArray8121;
		}
		if (Class41.method564(i, ((Class387_Sub2) this).anInt8094)) {
			if (bool)
				((Class387_Sub2) class387_sub2_1246_).aByte8138 |= 0x10;
			((Class387_Sub2) class387_sub2_1246_).aClass37_8087 = ((Class387_Sub2) class387_sub2_1247_).aClass37_8087;
			((Class37) ((Class387_Sub2) class387_sub2_1246_).aClass37_8087).anInterface3_382 = (((Class37) ((Class387_Sub2) this).aClass37_8087).anInterface3_382);
		} else if (Class41.method560(i, ((Class387_Sub2) this).anInt8094))
			((Class387_Sub2) class387_sub2_1246_).aClass37_8087 = ((Class387_Sub2) this).aClass37_8087;
		else
			((Class387_Sub2) class387_sub2_1246_).aClass37_8087 = null;
		if (Class41.method556(i, ((Class387_Sub2) this).anInt8094)) {
			if (((Class387_Sub2) class387_sub2_1247_).modelTextures == null || ((((Class387_Sub2) class387_sub2_1247_).modelTextures).length < ((Class387_Sub2) this).anInt8089)) {
				int i_1264_ = ((Class387_Sub2) this).anInt8089;
				((Class387_Sub2) class387_sub2_1246_).modelTextures = ((Class387_Sub2) class387_sub2_1247_).modelTextures = new short[i_1264_];
			} else
				((Class387_Sub2) class387_sub2_1246_).modelTextures = ((Class387_Sub2) class387_sub2_1247_).modelTextures;
			for (int i_1265_ = 0; i_1265_ < ((Class387_Sub2) this).anInt8089; i_1265_++)
				((Class387_Sub2) class387_sub2_1246_).modelTextures[i_1265_] = ((Class387_Sub2) this).modelTextures[i_1265_];
		} else
			((Class387_Sub2) class387_sub2_1246_).modelTextures = ((Class387_Sub2) this).modelTextures;
		if (Class41.method557(i, ((Class387_Sub2) this).anInt8094)) {
			if (((Class387_Sub2) class387_sub2_1247_).aClass40Array8149 == null || ((((Class387_Sub2) class387_sub2_1247_).aClass40Array8149).length < ((Class387_Sub2) this).anInt8147)) {
				int i_1266_ = ((Class387_Sub2) this).anInt8147;
				((Class387_Sub2) class387_sub2_1246_).aClass40Array8149 = ((Class387_Sub2) class387_sub2_1247_).aClass40Array8149 = new Class40[i_1266_];
				for (int i_1267_ = 0; i_1267_ < ((Class387_Sub2) this).anInt8147; i_1267_++)
					((Class387_Sub2) class387_sub2_1246_).aClass40Array8149[i_1267_] = ((Class387_Sub2) this).aClass40Array8149[i_1267_].method548();
			} else {
				((Class387_Sub2) class387_sub2_1246_).aClass40Array8149 = ((Class387_Sub2) class387_sub2_1247_).aClass40Array8149;
				for (int i_1268_ = 0; i_1268_ < ((Class387_Sub2) this).anInt8147; i_1268_++)
					((Class387_Sub2) class387_sub2_1246_).aClass40Array8149[i_1268_].method547(((Class387_Sub2) this).aClass40Array8149[i_1268_]);
			}
		} else
			((Class387_Sub2) class387_sub2_1246_).aClass40Array8149 = ((Class387_Sub2) this).aClass40Array8149;
		((Class387_Sub2) class387_sub2_1246_).aClass52Array8148 = ((Class387_Sub2) this).aClass52Array8148;
		if (((Class387_Sub2) this).aBoolean8126) {
			((Class387_Sub2) class387_sub2_1246_).anInt8133 = ((Class387_Sub2) this).anInt8133;
			((Class387_Sub2) class387_sub2_1246_).anInt8134 = ((Class387_Sub2) this).anInt8134;
			((Class387_Sub2) class387_sub2_1246_).aShort8145 = ((Class387_Sub2) this).aShort8145;
			((Class387_Sub2) class387_sub2_1246_).aShort8156 = ((Class387_Sub2) this).aShort8156;
			((Class387_Sub2) class387_sub2_1246_).aShort8097 = ((Class387_Sub2) this).aShort8097;
			((Class387_Sub2) class387_sub2_1246_).aShort8100 = ((Class387_Sub2) this).aShort8100;
			((Class387_Sub2) class387_sub2_1246_).aShort8140 = ((Class387_Sub2) this).aShort8140;
			((Class387_Sub2) class387_sub2_1246_).aShort8141 = ((Class387_Sub2) this).aShort8141;
			((Class387_Sub2) class387_sub2_1246_).aBoolean8126 = true;
		} else
			((Class387_Sub2) class387_sub2_1246_).aBoolean8126 = false;
		((Class387_Sub2) class387_sub2_1246_).anIntArrayArray8113 = ((Class387_Sub2) this).anIntArrayArray8113;
		((Class387_Sub2) class387_sub2_1246_).anIntArrayArray8123 = ((Class387_Sub2) this).anIntArrayArray8123;
		((Class387_Sub2) class387_sub2_1246_).anIntArrayArray8150 = ((Class387_Sub2) this).anIntArrayArray8150;
		((Class387_Sub2) class387_sub2_1246_).aShortArray8144 = ((Class387_Sub2) this).aShortArray8144;
		((Class387_Sub2) class387_sub2_1246_).anIntArray8143 = ((Class387_Sub2) this).anIntArray8143;
		((Class387_Sub2) class387_sub2_1246_).aShortArray8106 = ((Class387_Sub2) this).aShortArray8106;
		((Class387_Sub2) class387_sub2_1246_).aShortArray8124 = ((Class387_Sub2) this).aShortArray8124;
		((Class387_Sub2) class387_sub2_1246_).anIntArray8142 = ((Class387_Sub2) this).anIntArray8142;
		((Class387_Sub2) class387_sub2_1246_).aClass93Array8135 = ((Class387_Sub2) this).aClass93Array8135;
		((Class387_Sub2) class387_sub2_1246_).aClass64Array8146 = ((Class387_Sub2) this).aClass64Array8146;
		return class387_sub2_1246_;
	}

	void method4455() {
		/* empty */
	}

	public Class387 method4468(byte i, int i_1269_, boolean bool) {
		boolean bool_1270_ = false;
		Class387_Sub2 class387_sub2_1271_;
		Class387_Sub2 class387_sub2_1272_;
		if (i > 0 && i <= 7) {
			class387_sub2_1272_ = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass387_Sub2Array8433[i - 1]);
			class387_sub2_1271_ = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass387_Sub2Array8432[i - 1]);
			bool_1270_ = true;
		} else
			class387_sub2_1271_ = class387_sub2_1272_ = new Class387_Sub2(((Class387_Sub2) this).aClass_ra_Sub1_8092);
		return method4526(class387_sub2_1271_, class387_sub2_1272_, i_1269_, bool_1270_, bool);
	}

	public int ci() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).aShort8100;
	}

	public int cs() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).aShort8140;
	}

	public int cr() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).aShort8141;
	}

	public void cv(int i) {
		((Class387_Sub2) this).aShort8096 = (short) i;
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
	}

	public void ck(int i) {
		((Class387_Sub2) this).aShort8096 = (short) i;
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
	}

	public byte[] as() {
		return ((Class387_Sub2) this).aByteArray8136;
	}

	public void cp(int i) {
		((Class387_Sub2) this).aShort8096 = (short) i;
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
	}

	public void cf(int i) {
		((Class387_Sub2) this).aShort8099 = (short) i;
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass44_8127 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = null;
	}

	public void cu(int i) {
		((Class387_Sub2) this).aShort8099 = (short) i;
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass44_8127 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = null;
	}

	public int ca() {
		return ((Class387_Sub2) this).aShort8096;
	}

	public int cg() {
		return ((Class387_Sub2) this).aShort8096;
	}

	void method4527(boolean bool) {
		boolean bool_1273_ = (((Class387_Sub2) this).aClass44_8105 != null && (((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441) == null);
		boolean bool_1274_ = (((Class387_Sub2) this).aClass44_8127 != null && (((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441) == null);
		boolean bool_1275_ = (((Class387_Sub2) this).aClass44_8125 != null && (((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441) == null);
		boolean bool_1276_ = (((Class387_Sub2) this).aClass44_8128 != null && (((Class44) ((Class387_Sub2) this).aClass44_8128).anInterface1_441) == null);
		if (bool) {
			bool_1273_ = bool_1273_ & (((Class387_Sub2) this).aByte8138 & 0x2) != 0;
			bool_1274_ = bool_1274_ & (((Class387_Sub2) this).aByte8138 & 0x4) != 0;
			bool_1275_ = bool_1275_ & (((Class387_Sub2) this).aByte8138 & 0x1) != 0;
			bool_1276_ = bool_1276_ & (((Class387_Sub2) this).aByte8138 & 0x8) != 0;
		}
		byte i = 0;
		byte i_1277_ = 0;
		byte i_1278_ = 0;
		byte i_1279_ = 0;
		byte i_1280_ = 0;
		if (bool_1275_) {
			i_1277_ = i;
			i += 12;
		}
		if (bool_1273_) {
			i_1278_ = i;
			i += 4;
		}
		if (bool_1274_) {
			i_1279_ = i;
			i += 12;
		}
		if (bool_1276_) {
			i_1280_ = i;
			i += 8;
		}
		if (i != 0) {
			if ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass330_Sub46_Sub1_8381.payload).length < ((Class387_Sub2) this).anInt8107 * i)
				((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass330_Sub46_Sub1_8381 = new Class330_Sub46_Sub1((((Class387_Sub2) this).anInt8107 + 100) * i);
			else
				((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass330_Sub46_Sub1_8381.offset = 0;
			Class330_Sub46_Sub1 class330_sub46_sub1 = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass330_Sub46_Sub1_8381);
			if (bool_1275_) {
				if (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aBoolean8407) {
					for (int i_1281_ = 0; i_1281_ < ((Class387_Sub2) this).anInt8130; i_1281_++) {
						int i_1282_ = Stream.floatToRawIntBits((float) ((Class387_Sub2) this).anIntArray8102[i_1281_]);
						int i_1283_ = Stream.floatToRawIntBits((float) ((Class387_Sub2) this).anIntArray8110[i_1281_]);
						int i_1284_ = Stream.floatToRawIntBits((float) ((Class387_Sub2) this).anIntArray8104[i_1281_]);
						int i_1285_ = ((Class387_Sub2) this).anIntArray8143[i_1281_];
						int i_1286_ = (((Class387_Sub2) this).anIntArray8143[i_1281_ + 1]);
						for (int i_1287_ = i_1285_; i_1287_ < i_1286_; i_1287_++) {
							int i_1288_ = ((((Class387_Sub2) this).aShortArray8144[i_1287_]) - 1);
							if (i_1288_ == -1)
								break;
							class330_sub46_sub1.offset = i_1288_ * i * 323600977;
							class330_sub46_sub1.addInt(i_1282_, 1965508160);
							class330_sub46_sub1.addInt(i_1283_, 1965508160);
							class330_sub46_sub1.addInt(i_1284_, 1965508160);
						}
					}
				} else {
					for (int i_1289_ = 0; i_1289_ < ((Class387_Sub2) this).anInt8130; i_1289_++) {
						int i_1290_ = Stream.floatToRawIntBits((float) ((Class387_Sub2) this).anIntArray8102[i_1289_]);
						int i_1291_ = Stream.floatToRawIntBits((float) ((Class387_Sub2) this).anIntArray8110[i_1289_]);
						int i_1292_ = Stream.floatToRawIntBits((float) ((Class387_Sub2) this).anIntArray8104[i_1289_]);
						int i_1293_ = ((Class387_Sub2) this).anIntArray8143[i_1289_];
						int i_1294_ = (((Class387_Sub2) this).anIntArray8143[i_1289_ + 1]);
						for (int i_1295_ = i_1293_; i_1295_ < i_1294_; i_1295_++) {
							int i_1296_ = (((((Class387_Sub2) this).aShortArray8144[i_1295_]) & 0xffff) - 1);
							if (i_1296_ == -1)
								break;
							class330_sub46_sub1.offset = i_1296_ * i * 323600977;
							class330_sub46_sub1.method3813(i_1290_, (byte) 25);
							class330_sub46_sub1.method3813(i_1291_, (byte) 16);
							class330_sub46_sub1.method3813(i_1292_, (byte) 77);
						}
					}
				}
			}
			if (bool_1273_) {
				if (((Class387_Sub2) this).aClass44_8127 == null) {
					short[] is;
					short[] is_1297_;
					short[] is_1298_;
					byte[] is_1299_;
					if (((Class387_Sub2) this).aClass68_8112 != null) {
						is = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray582);
						is_1297_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray583);
						is_1298_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray584);
						is_1299_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aByteArray585);
					} else {
						is = ((Class387_Sub2) this).aShortArray8108;
						is_1297_ = ((Class387_Sub2) this).aShortArray8109;
						is_1298_ = ((Class387_Sub2) this).aShortArray8095;
						is_1299_ = ((Class387_Sub2) this).aByteArray8118;
					}
					float f = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloatArray8366[0]);
					float f_1300_ = (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloatArray8366[1]);
					float f_1301_ = (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloatArray8366[2]);
					float f_1302_ = (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8372);
					float f_1303_ = (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8373 * 768.0F / (float) ((Class387_Sub2) this).aShort8099);
					float f_1304_ = (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8374 * 768.0F / (float) ((Class387_Sub2) this).aShort8099);
					for (int i_1305_ = 0; i_1305_ < ((Class387_Sub2) this).anInt8089; i_1305_++) {
						int i_1306_ = method4519((((Class387_Sub2) this).modelColors[i_1305_]), (((Class387_Sub2) this).modelTextures[i_1305_]), ((Class387_Sub2) this).aShort8096, (((Class387_Sub2) this).aByteArray8136[i_1305_]));
						float f_1307_ = ((float) (i_1306_ >>> 24) * (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloat8250));
						float f_1308_ = ((float) (i_1306_ >> 16 & 0xff) * (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloat8370));
						float f_1309_ = ((float) (i_1306_ >> 8 & 0xff) * (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloat8371));
						int i_1310_ = ((Class387_Sub2) this).aShortArray8119[i_1305_];
						short i_1311_ = (short) is_1299_[i_1310_];
						float f_1312_;
						if (i_1311_ == 0)
							f_1312_ = ((f * (float) is[i_1310_] + f_1300_ * (float) is_1297_[i_1310_] + f_1301_ * (float) is_1298_[i_1310_]) * 0.0026041667F);
						else
							f_1312_ = ((f * (float) is[i_1310_] + f_1300_ * (float) is_1297_[i_1310_] + f_1301_ * (float) is_1298_[i_1310_]) / (float) (i_1311_ * 256));
						float f_1313_ = f_1302_ + f_1312_ * (f_1312_ < 0.0F ? f_1304_ : f_1303_);
						int i_1314_ = (int) (f_1307_ * f_1313_);
						if (i_1314_ < 0)
							i_1314_ = 0;
						else if (i_1314_ > 255)
							i_1314_ = 255;
						int i_1315_ = (int) (f_1308_ * f_1313_);
						if (i_1315_ < 0)
							i_1315_ = 0;
						else if (i_1315_ > 255)
							i_1315_ = 255;
						int i_1316_ = (int) (f_1309_ * f_1313_);
						if (i_1316_ < 0)
							i_1316_ = 0;
						else if (i_1316_ > 255)
							i_1316_ = 255;
						class330_sub46_sub1.offset = (i_1278_ + i_1310_ * i) * 323600977;
						class330_sub46_sub1.addByte(i_1314_, (byte) 41);
						class330_sub46_sub1.addByte(i_1315_, (byte) 57);
						class330_sub46_sub1.addByte(i_1316_, (byte) 105);
						class330_sub46_sub1.addByte(255 - ((((Class387_Sub2) this).aByteArray8136[i_1305_]) & 0xff), (byte) 47);
						i_1310_ = ((Class387_Sub2) this).aShortArray8120[i_1305_];
						i_1311_ = (short) is_1299_[i_1310_];
						if (i_1311_ == 0)
							f_1312_ = ((f * (float) is[i_1310_] + f_1300_ * (float) is_1297_[i_1310_] + f_1301_ * (float) is_1298_[i_1310_]) * 0.0026041667F);
						else
							f_1312_ = ((f * (float) is[i_1310_] + f_1300_ * (float) is_1297_[i_1310_] + f_1301_ * (float) is_1298_[i_1310_]) / (float) (i_1311_ * 256));
						f_1313_ = f_1302_ + f_1312_ * (f_1312_ < 0.0F ? f_1304_ : f_1303_);
						i_1314_ = (int) (f_1307_ * f_1313_);
						if (i_1314_ < 0)
							i_1314_ = 0;
						else if (i_1314_ > 255)
							i_1314_ = 255;
						i_1315_ = (int) (f_1308_ * f_1313_);
						if (i_1315_ < 0)
							i_1315_ = 0;
						else if (i_1315_ > 255)
							i_1315_ = 255;
						i_1316_ = (int) (f_1309_ * f_1313_);
						if (i_1316_ < 0)
							i_1316_ = 0;
						else if (i_1316_ > 255)
							i_1316_ = 255;
						class330_sub46_sub1.offset = (i_1278_ + i_1310_ * i) * 323600977;
						class330_sub46_sub1.addByte(i_1314_, (byte) 36);
						class330_sub46_sub1.addByte(i_1315_, (byte) 31);
						class330_sub46_sub1.addByte(i_1316_, (byte) 6);
						class330_sub46_sub1.addByte(255 - ((((Class387_Sub2) this).aByteArray8136[i_1305_]) & 0xff), (byte) 109);
						i_1310_ = ((Class387_Sub2) this).aShortArray8121[i_1305_];
						i_1311_ = (short) is_1299_[i_1310_];
						if (i_1311_ == 0)
							f_1312_ = ((f * (float) is[i_1310_] + f_1300_ * (float) is_1297_[i_1310_] + f_1301_ * (float) is_1298_[i_1310_]) * 0.0026041667F);
						else
							f_1312_ = ((f * (float) is[i_1310_] + f_1300_ * (float) is_1297_[i_1310_] + f_1301_ * (float) is_1298_[i_1310_]) / (float) (i_1311_ * 256));
						f_1313_ = f_1302_ + f_1312_ * (f_1312_ < 0.0F ? f_1304_ : f_1303_);
						i_1314_ = (int) (f_1307_ * f_1313_);
						if (i_1314_ < 0)
							i_1314_ = 0;
						else if (i_1314_ > 255)
							i_1314_ = 255;
						i_1315_ = (int) (f_1308_ * f_1313_);
						if (i_1315_ < 0)
							i_1315_ = 0;
						else if (i_1315_ > 255)
							i_1315_ = 255;
						i_1316_ = (int) (f_1309_ * f_1313_);
						if (i_1316_ < 0)
							i_1316_ = 0;
						else if (i_1316_ > 255)
							i_1316_ = 255;
						class330_sub46_sub1.offset = (i_1278_ + i_1310_ * i) * 323600977;
						class330_sub46_sub1.addByte(i_1314_, (byte) 92);
						class330_sub46_sub1.addByte(i_1315_, (byte) 117);
						class330_sub46_sub1.addByte(i_1316_, (byte) 39);
						class330_sub46_sub1.addByte(255 - ((((Class387_Sub2) this).aByteArray8136[i_1305_]) & 0xff), (byte) 100);
					}
				} else {
					for (int i_1317_ = 0; i_1317_ < ((Class387_Sub2) this).anInt8089; i_1317_++) {
						int i_1318_ = method4519((((Class387_Sub2) this).modelColors[i_1317_]), (((Class387_Sub2) this).modelTextures[i_1317_]), ((Class387_Sub2) this).aShort8096, (((Class387_Sub2) this).aByteArray8136[i_1317_]));
						class330_sub46_sub1.offset = (i_1278_ + ((((Class387_Sub2) this).aShortArray8119[i_1317_]) & 0xffff) * i) * 323600977;
						class330_sub46_sub1.addInt(i_1318_, 1965508160);
						class330_sub46_sub1.offset = (i_1278_ + ((((Class387_Sub2) this).aShortArray8120[i_1317_]) & 0xffff) * i) * 323600977;
						class330_sub46_sub1.addInt(i_1318_, 1965508160);
						class330_sub46_sub1.offset = (i_1278_ + ((((Class387_Sub2) this).aShortArray8121[i_1317_]) & 0xffff) * i) * 323600977;
						class330_sub46_sub1.addInt(i_1318_, 1965508160);
					}
				}
			}
			if (bool_1274_) {
				short[] is;
				short[] is_1319_;
				short[] is_1320_;
				byte[] is_1321_;
				if (((Class387_Sub2) this).aClass68_8112 != null) {
					is = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray582);
					is_1319_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray583);
					is_1320_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aShortArray584);
					is_1321_ = (((Class68) ((Class387_Sub2) this).aClass68_8112).aByteArray585);
				} else {
					is = ((Class387_Sub2) this).aShortArray8108;
					is_1319_ = ((Class387_Sub2) this).aShortArray8109;
					is_1320_ = ((Class387_Sub2) this).aShortArray8095;
					is_1321_ = ((Class387_Sub2) this).aByteArray8118;
				}
				float f = 3.0F / (float) ((Class387_Sub2) this).aShort8099;
				float f_1322_ = 3.0F / (float) (((Class387_Sub2) this).aShort8099 + ((Class387_Sub2) this).aShort8099 / 2);
				class330_sub46_sub1.offset = i_1279_ * 323600977;
				if (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aBoolean8407) {
					for (int i_1323_ = 0; i_1323_ < ((Class387_Sub2) this).anInt8107; i_1323_++) {
						int i_1324_ = is_1321_[i_1323_] & 0xff;
						if (i_1324_ == 0) {
							class330_sub46_sub1.method3819((float) is[i_1323_] * f_1322_);
							class330_sub46_sub1.method3819((float) (is_1319_[i_1323_]) * f_1322_);
							class330_sub46_sub1.method3819((float) (is_1320_[i_1323_]) * f_1322_);
						} else {
							float f_1325_ = f / (float) i_1324_;
							class330_sub46_sub1.method3819((float) is[i_1323_] * f_1325_);
							class330_sub46_sub1.method3819((float) (is_1319_[i_1323_]) * f_1325_);
							class330_sub46_sub1.method3819((float) (is_1320_[i_1323_]) * f_1325_);
						}
						class330_sub46_sub1.offset += (i - 12) * 323600977;
					}
				} else {
					for (int i_1326_ = 0; i_1326_ < ((Class387_Sub2) this).anInt8107; i_1326_++) {
						int i_1327_ = is_1321_[i_1326_] & 0xff;
						if (i_1327_ == 0) {
							class330_sub46_sub1.method3818((float) is[i_1326_] * f_1322_);
							class330_sub46_sub1.method3818((float) (is_1319_[i_1326_]) * f_1322_);
							class330_sub46_sub1.method3818((float) (is_1320_[i_1326_]) * f_1322_);
						} else {
							float f_1328_ = f / (float) i_1327_;
							class330_sub46_sub1.method3818((float) is[i_1326_] * f_1328_);
							class330_sub46_sub1.method3818((float) (is_1319_[i_1326_]) * f_1328_);
							class330_sub46_sub1.method3818((float) (is_1320_[i_1326_]) * f_1328_);
						}
						class330_sub46_sub1.offset += (i - 12) * 323600977;
					}
				}
			}
			if (bool_1276_) {
				class330_sub46_sub1.offset = i_1280_ * 323600977;
				if (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aBoolean8407) {
					for (int i_1329_ = 0; i_1329_ < ((Class387_Sub2) this).anInt8107; i_1329_++) {
						class330_sub46_sub1.method3819(((Class387_Sub2) this).aFloatArray8129[i_1329_]);
						class330_sub46_sub1.method3819(((Class387_Sub2) this).aFloatArray8114[i_1329_]);
						class330_sub46_sub1.offset += (i - 8) * 323600977;
					}
				} else {
					for (int i_1330_ = 0; i_1330_ < ((Class387_Sub2) this).anInt8107; i_1330_++) {
						class330_sub46_sub1.method3818(((Class387_Sub2) this).aFloatArray8129[i_1330_]);
						class330_sub46_sub1.method3818(((Class387_Sub2) this).aFloatArray8114[i_1330_]);
						class330_sub46_sub1.offset += (i - 8) * 323600977;
					}
				}
			}
			class330_sub46_sub1.offset = i * ((Class387_Sub2) this).anInt8107 * 323600977;
			Interface1 interface1;
			if (bool) {
				if (((Class387_Sub2) this).anInterface1_8131 == null)
					((Class387_Sub2) this).anInterface1_8131 = (((Class387_Sub2) this).aClass_ra_Sub1_8092.method4835(i, class330_sub46_sub1.payload, class330_sub46_sub1.offset * -824785231, true));
				else
					((Class387_Sub2) this).anInterface1_8131.method12(i, class330_sub46_sub1.payload, class330_sub46_sub1.offset * -824785231);
				interface1 = ((Class387_Sub2) this).anInterface1_8131;
				((Class387_Sub2) this).aByte8138 = (byte) 0;
			} else {
				interface1 = (((Class387_Sub2) this).aClass_ra_Sub1_8092.method4835(i, class330_sub46_sub1.payload, class330_sub46_sub1.offset * -824785231, false));
				((Class387_Sub2) this).aBoolean8132 = true;
			}
			if (bool_1275_) {
				((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = interface1;
				((Class44) ((Class387_Sub2) this).aClass44_8125).aByte443 = i_1277_;
			}
			if (bool_1276_) {
				((Class44) ((Class387_Sub2) this).aClass44_8128).anInterface1_441 = interface1;
				((Class44) ((Class387_Sub2) this).aClass44_8128).aByte443 = i_1280_;
			}
			if (bool_1273_) {
				((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = interface1;
				((Class44) ((Class387_Sub2) this).aClass44_8105).aByte443 = i_1278_;
			}
			if (bool_1274_) {
				((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = interface1;
				((Class44) ((Class387_Sub2) this).aClass44_8127).aByte443 = i_1279_;
			}
		}
	}

	boolean ei() {
		if (((Class387_Sub2) this).anIntArrayArray8113 == null)
			return false;
		for (int i = 0; i < ((Class387_Sub2) this).anInt8115; i++) {
			((Class387_Sub2) this).anIntArray8102[i] <<= 4;
			((Class387_Sub2) this).anIntArray8110[i] <<= 4;
			((Class387_Sub2) this).anIntArray8104[i] <<= 4;
		}
		anInt8101 = 0;
		anInt8111 = 0;
		anInt8158 = 0;
		return true;
	}

	public int db() {
		return ((Class387_Sub2) this).aShort8099;
	}

	void method4528() {
		int i = 32767;
		int i_1331_ = 32767;
		int i_1332_ = 32767;
		int i_1333_ = -32768;
		int i_1334_ = -32768;
		int i_1335_ = -32768;
		int i_1336_ = 0;
		int i_1337_ = 0;
		for (int i_1338_ = 0; i_1338_ < ((Class387_Sub2) this).anInt8130; i_1338_++) {
			int i_1339_ = ((Class387_Sub2) this).anIntArray8102[i_1338_];
			int i_1340_ = ((Class387_Sub2) this).anIntArray8110[i_1338_];
			int i_1341_ = ((Class387_Sub2) this).anIntArray8104[i_1338_];
			if (i_1339_ < i)
				i = i_1339_;
			if (i_1339_ > i_1333_)
				i_1333_ = i_1339_;
			if (i_1340_ < i_1331_)
				i_1331_ = i_1340_;
			if (i_1340_ > i_1334_)
				i_1334_ = i_1340_;
			if (i_1341_ < i_1332_)
				i_1332_ = i_1341_;
			if (i_1341_ > i_1335_)
				i_1335_ = i_1341_;
			int i_1342_ = i_1339_ * i_1339_ + i_1341_ * i_1341_;
			if (i_1342_ > i_1336_)
				i_1336_ = i_1342_;
			i_1342_ = i_1339_ * i_1339_ + i_1341_ * i_1341_ + i_1340_ * i_1340_;
			if (i_1342_ > i_1337_)
				i_1337_ = i_1342_;
		}
		((Class387_Sub2) this).aShort8145 = (short) i;
		((Class387_Sub2) this).aShort8156 = (short) i_1333_;
		((Class387_Sub2) this).aShort8097 = (short) i_1331_;
		((Class387_Sub2) this).aShort8100 = (short) i_1334_;
		((Class387_Sub2) this).aShort8140 = (short) i_1332_;
		((Class387_Sub2) this).aShort8141 = (short) i_1335_;
		((Class387_Sub2) this).anInt8134 = (int) (Math.sqrt((double) i_1336_) + 0.99);
		((Class387_Sub2) this).anInt8133 = (int) (Math.sqrt((double) i_1337_) + 0.99);
		((Class387_Sub2) this).aBoolean8126 = true;
	}

	public byte[] dg() {
		return ((Class387_Sub2) this).aByteArray8136;
	}

	public void pa(int i, int i_1343_, Class_xa class_xa, Class_xa class_xa_1344_, int i_1345_, int i_1346_, int i_1347_) {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		int i_1348_ = i_1345_ + ((Class387_Sub2) this).aShort8145;
		int i_1349_ = i_1345_ + ((Class387_Sub2) this).aShort8156;
		int i_1350_ = i_1347_ + ((Class387_Sub2) this).aShort8140;
		int i_1351_ = i_1347_ + ((Class387_Sub2) this).aShort8141;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_1348_ >= 0 && ((i_1349_ + class_xa.anInt6395 * 550173571 >> class_xa.anInt6396 * -1066304221) < class_xa.anInt6397 * 1972554729) && i_1350_ >= 0 && ((i_1351_ + class_xa.anInt6395 * 550173571 >> class_xa.anInt6396 * -1066304221) < class_xa.anInt6393 * 24567321))) {
			if (i == 4 || i == 5) {
				if (class_xa_1344_ == null || (i_1348_ < 0 || ((i_1349_ + class_xa_1344_.anInt6395 * 550173571 >> class_xa_1344_.anInt6396 * -1066304221) >= class_xa_1344_.anInt6397 * 1972554729) || i_1350_ < 0 || ((i_1351_ + class_xa_1344_.anInt6395 * 550173571 >> class_xa_1344_.anInt6396 * -1066304221) >= class_xa_1344_.anInt6393 * 24567321)))
					return;
			} else {
				i_1348_ >>= class_xa.anInt6396 * -1066304221;
				i_1349_ = (i_1349_ + (class_xa.anInt6395 * 550173571 - 1) >> class_xa.anInt6396 * -1066304221);
				i_1350_ >>= class_xa.anInt6396 * -1066304221;
				i_1351_ = (i_1351_ + (class_xa.anInt6395 * 550173571 - 1) >> class_xa.anInt6396 * -1066304221);
				if (class_xa.method6417(i_1348_, i_1350_, 963349488) == i_1346_ && (class_xa.method6417(i_1349_, i_1350_, -198118842) == i_1346_) && (class_xa.method6417(i_1348_, i_1351_, -1806710163) == i_1346_) && (class_xa.method6417(i_1349_, i_1351_, -1574718359) == i_1346_))
					return;
			}
			if (i == 1) {
				for (int i_1352_ = 0; i_1352_ < ((Class387_Sub2) this).anInt8130; i_1352_++)
					((Class387_Sub2) this).anIntArray8110[i_1352_] = (((Class387_Sub2) this).anIntArray8110[i_1352_] + class_xa.method6416(((((Class387_Sub2) this).anIntArray8102[i_1352_]) + i_1345_), ((((Class387_Sub2) this).anIntArray8104[i_1352_]) + i_1347_), 1880434010) - i_1346_);
			} else if (i == 2) {
				int i_1353_ = ((Class387_Sub2) this).aShort8097;
				if (i_1353_ == 0)
					return;
				for (int i_1354_ = 0; i_1354_ < ((Class387_Sub2) this).anInt8130; i_1354_++) {
					int i_1355_ = ((((Class387_Sub2) this).anIntArray8110[i_1354_] << 16) / i_1353_);
					if (i_1355_ < i_1343_)
						((Class387_Sub2) this).anIntArray8110[i_1354_] = (((Class387_Sub2) this).anIntArray8110[i_1354_] + (class_xa.method6416((((Class387_Sub2) this).anIntArray8102[i_1354_]) + i_1345_, (((Class387_Sub2) this).anIntArray8104[i_1354_]) + i_1347_, -864052559) - i_1346_) * (i_1343_ - i_1355_) / i_1343_);
				}
			} else if (i == 3) {
				int i_1356_ = (i_1343_ & 0xff) * 4;
				int i_1357_ = (i_1343_ >> 8 & 0xff) * 4;
				int i_1358_ = (i_1343_ >> 16 & 0xff) << 6;
				int i_1359_ = (i_1343_ >> 24 & 0xff) << 6;
				if (i_1345_ - (i_1356_ >> 1) < 0 || ((i_1345_ + (i_1356_ >> 1) + class_xa.anInt6395 * 550173571) >= (class_xa.anInt6397 * 1972554729 << class_xa.anInt6396 * -1066304221)) || i_1347_ - (i_1357_ >> 1) < 0 || ((i_1347_ + (i_1357_ >> 1) + class_xa.anInt6395 * 550173571) >= (class_xa.anInt6393 * 24567321 << class_xa.anInt6396 * -1066304221)))
					return;
				method4447(class_xa, i_1345_, i_1346_, i_1347_, i_1356_, i_1357_, i_1358_, i_1359_);
			} else if (i == 4) {
				int i_1360_ = (((Class387_Sub2) this).aShort8100 - ((Class387_Sub2) this).aShort8097);
				for (int i_1361_ = 0; i_1361_ < ((Class387_Sub2) this).anInt8130; i_1361_++)
					((Class387_Sub2) this).anIntArray8110[i_1361_] = (((Class387_Sub2) this).anIntArray8110[i_1361_] + (class_xa_1344_.method6416((((Class387_Sub2) this).anIntArray8102[i_1361_]) + i_1345_, (((Class387_Sub2) this).anIntArray8104[i_1361_]) + i_1347_, -1613302016) - i_1346_) + i_1360_);
			} else if (i == 5) {
				int i_1362_ = (((Class387_Sub2) this).aShort8100 - ((Class387_Sub2) this).aShort8097);
				for (int i_1363_ = 0; i_1363_ < ((Class387_Sub2) this).anInt8130; i_1363_++) {
					int i_1364_ = (((Class387_Sub2) this).anIntArray8102[i_1363_] + i_1345_);
					int i_1365_ = (((Class387_Sub2) this).anIntArray8104[i_1363_] + i_1347_);
					int i_1366_ = class_xa.method6416(i_1364_, i_1365_, -884313570);
					int i_1367_ = class_xa_1344_.method6416(i_1364_, i_1365_, 811146717);
					int i_1368_ = i_1366_ - i_1367_ - i_1343_;
					((Class387_Sub2) this).anIntArray8110[i_1363_] = ((((Class387_Sub2) this).anIntArray8110[i_1363_] << 8) / i_1362_ * i_1368_ >> 8) - (i_1346_ - i_1366_);
				}
			}
			if (((Class387_Sub2) this).aClass44_8125 != null)
				((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
			((Class387_Sub2) this).aBoolean8126 = false;
		}
	}

	public byte[] dr() {
		return ((Class387_Sub2) this).aByteArray8136;
	}

	public void method_do(short i, short i_1369_) {
		for (int i_1370_ = 0; i_1370_ < ((Class387_Sub2) this).anInt8089; i_1370_++) {
			if (((Class387_Sub2) this).modelColors[i_1370_] == i)
				((Class387_Sub2) this).modelColors[i_1370_] = i_1369_;
		}
		if (((Class387_Sub2) this).aClass52Array8148 != null) {
			for (int i_1371_ = 0; i_1371_ < ((Class387_Sub2) this).anInt8147; i_1371_++) {
				Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_1371_];
				Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_1371_];
				((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
	}

	public void da(short i, short i_1372_) {
		for (int i_1373_ = 0; i_1373_ < ((Class387_Sub2) this).anInt8089; i_1373_++) {
			if (((Class387_Sub2) this).modelColors[i_1373_] == i)
				((Class387_Sub2) this).modelColors[i_1373_] = i_1372_;
		}
		if (((Class387_Sub2) this).aClass52Array8148 != null) {
			for (int i_1374_ = 0; i_1374_ < ((Class387_Sub2) this).anInt8147; i_1374_++) {
				Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_1374_];
				Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_1374_];
				((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
	}

	public void dh(short i, short i_1375_) {
		for (int i_1376_ = 0; i_1376_ < ((Class387_Sub2) this).anInt8089; i_1376_++) {
			if (((Class387_Sub2) this).modelColors[i_1376_] == i)
				((Class387_Sub2) this).modelColors[i_1376_] = i_1375_;
		}
		if (((Class387_Sub2) this).aClass52Array8148 != null) {
			for (int i_1377_ = 0; i_1377_ < ((Class387_Sub2) this).anInt8147; i_1377_++) {
				Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_1377_];
				Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_1377_];
				((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
	}

	public void be(int i, int i_1378_, int i_1379_) {
		for (int i_1380_ = 0; i_1380_ < ((Class387_Sub2) this).anInt8130; i_1380_++) {
			if (i != 128)
				((Class387_Sub2) this).anIntArray8102[i_1380_] = ((Class387_Sub2) this).anIntArray8102[i_1380_] * i >> 7;
			if (i_1378_ != 128)
				((Class387_Sub2) this).anIntArray8110[i_1380_] = (((Class387_Sub2) this).anIntArray8110[i_1380_] * i_1378_ >> 7);
			if (i_1379_ != 128)
				((Class387_Sub2) this).anIntArray8104[i_1380_] = (((Class387_Sub2) this).anIntArray8104[i_1380_] * i_1379_ >> 7);
		}
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public int cm() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).aShort8097;
	}

	public void method4482(byte i, byte[] is) {
		if (is == null) {
			for (int i_1381_ = 0; i_1381_ < ((Class387_Sub2) this).anInt8089; i_1381_++)
				((Class387_Sub2) this).aByteArray8136[i_1381_] = i;
		} else {
			for (int i_1382_ = 0; i_1382_ < ((Class387_Sub2) this).anInt8089; i_1382_++) {
				int i_1383_ = 255 - ((255 - (is[i_1382_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class387_Sub2) this).aByteArray8136[i_1382_] = (byte) i_1383_;
			}
		}
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
	}

	public void method4486(byte i, byte[] is) {
		if (is == null) {
			for (int i_1384_ = 0; i_1384_ < ((Class387_Sub2) this).anInt8089; i_1384_++)
				((Class387_Sub2) this).aByteArray8136[i_1384_] = i;
		} else {
			for (int i_1385_ = 0; i_1385_ < ((Class387_Sub2) this).anInt8089; i_1385_++) {
				int i_1386_ = 255 - ((255 - (is[i_1385_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class387_Sub2) this).aByteArray8136[i_1385_] = (byte) i_1386_;
			}
		}
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
	}

	public void dj(short i, short i_1387_) {
		Interface_ma interface_ma = ((Class387_Sub2) this).aClass_ra_Sub1_8092.anInterface_ma4227;
		for (int i_1388_ = 0; i_1388_ < ((Class387_Sub2) this).anInt8089; i_1388_++) {
			if (((Class387_Sub2) this).modelTextures[i_1388_] == i)
				((Class387_Sub2) this).modelTextures[i_1388_] = i_1387_;
		}
		byte i_1389_ = 0;
		byte i_1390_ = 0;
		if (i != -1) {
			Class56 class56 = interface_ma.method221(i & 0xffff, 691779059);
			i_1389_ = class56.aByte529;
			i_1390_ = class56.aByte534;
		}
		byte i_1391_ = 0;
		byte i_1392_ = 0;
		if (i_1387_ != -1) {
			Class56 class56 = interface_ma.method221(i_1387_ & 0xffff, 894033081);
			i_1391_ = class56.aByte529;
			i_1392_ = class56.aByte534;
			if (class56.aByte531 != 0 || class56.aByte530 != 0)
				((Class387_Sub2) this).aBoolean8153 = true;
		}
		if (i_1389_ != i_1391_ | i_1390_ != i_1392_) {
			if (((Class387_Sub2) this).aClass52Array8148 != null) {
				for (int i_1393_ = 0; i_1393_ < ((Class387_Sub2) this).anInt8147; i_1393_++) {
					Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_1393_];
					Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_1393_];
					((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
				}
			}
			if (((Class387_Sub2) this).aClass44_8105 != null)
				((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
		}
	}

	public void dq(short i, short i_1394_) {
		for (int i_1395_ = 0; i_1395_ < ((Class387_Sub2) this).anInt8089; i_1395_++) {
			if (((Class387_Sub2) this).modelColors[i_1395_] == i)
				((Class387_Sub2) this).modelColors[i_1395_] = i_1394_;
		}
		if (((Class387_Sub2) this).aClass52Array8148 != null) {
			for (int i_1396_ = 0; i_1396_ < ((Class387_Sub2) this).anInt8147; i_1396_++) {
				Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_1396_];
				Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_1396_];
				((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
	}

	public void dm(int i, int i_1397_, int i_1398_, int i_1399_) {
		for (int i_1400_ = 0; i_1400_ < ((Class387_Sub2) this).anInt8089; i_1400_++) {
			int i_1401_ = ((Class387_Sub2) this).modelColors[i_1400_] & 0xffff;
			int i_1402_ = i_1401_ >> 10 & 0x3f;
			int i_1403_ = i_1401_ >> 7 & 0x7;
			int i_1404_ = i_1401_ & 0x7f;
			if (i != -1)
				i_1402_ += (i - i_1402_) * i_1399_ >> 7;
			if (i_1397_ != -1)
				i_1403_ += (i_1397_ - i_1403_) * i_1399_ >> 7;
			if (i_1398_ != -1)
				i_1404_ += (i_1398_ - i_1404_) * i_1399_ >> 7;
			((Class387_Sub2) this).modelColors[i_1400_] = (short) (i_1402_ << 10 | i_1403_ << 7 | i_1404_);
		}
		if (((Class387_Sub2) this).aClass52Array8148 != null) {
			for (int i_1405_ = 0; i_1405_ < ((Class387_Sub2) this).anInt8147; i_1405_++) {
				Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_1405_];
				Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_1405_];
				((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
	}

	public void du(int i, int i_1406_, int i_1407_, int i_1408_) {
		for (int i_1409_ = 0; i_1409_ < ((Class387_Sub2) this).anInt8089; i_1409_++) {
			int i_1410_ = ((Class387_Sub2) this).modelColors[i_1409_] & 0xffff;
			int i_1411_ = i_1410_ >> 10 & 0x3f;
			int i_1412_ = i_1410_ >> 7 & 0x7;
			int i_1413_ = i_1410_ & 0x7f;
			if (i != -1)
				i_1411_ += (i - i_1411_) * i_1408_ >> 7;
			if (i_1406_ != -1)
				i_1412_ += (i_1406_ - i_1412_) * i_1408_ >> 7;
			if (i_1407_ != -1)
				i_1413_ += (i_1407_ - i_1413_) * i_1408_ >> 7;
			((Class387_Sub2) this).modelColors[i_1409_] = (short) (i_1411_ << 10 | i_1412_ << 7 | i_1413_);
		}
		if (((Class387_Sub2) this).aClass52Array8148 != null) {
			for (int i_1414_ = 0; i_1414_ < ((Class387_Sub2) this).anInt8147; i_1414_++) {
				Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_1414_];
				Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_1414_];
				((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
	}

	public void df(int i, int i_1415_, int i_1416_, int i_1417_) {
		for (int i_1418_ = 0; i_1418_ < ((Class387_Sub2) this).anInt8089; i_1418_++) {
			int i_1419_ = ((Class387_Sub2) this).modelColors[i_1418_] & 0xffff;
			int i_1420_ = i_1419_ >> 10 & 0x3f;
			int i_1421_ = i_1419_ >> 7 & 0x7;
			int i_1422_ = i_1419_ & 0x7f;
			if (i != -1)
				i_1420_ += (i - i_1420_) * i_1417_ >> 7;
			if (i_1415_ != -1)
				i_1421_ += (i_1415_ - i_1421_) * i_1417_ >> 7;
			if (i_1416_ != -1)
				i_1422_ += (i_1416_ - i_1422_) * i_1417_ >> 7;
			((Class387_Sub2) this).modelColors[i_1418_] = (short) (i_1420_ << 10 | i_1421_ << 7 | i_1422_);
		}
		if (((Class387_Sub2) this).aClass52Array8148 != null) {
			for (int i_1423_ = 0; i_1423_ < ((Class387_Sub2) this).anInt8147; i_1423_++) {
				Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_1423_];
				Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_1423_];
				((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
			}
		}
		if (((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
	}

	public Class93[] method4476() {
		return ((Class387_Sub2) this).aClass93Array8135;
	}

	public boolean method4469(int i, int i_1424_, Class247 class247, boolean bool, int i_1425_) {
		Class249 class249 = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass249_8430);
		class249.method2508(class247);
		class249.method2483(((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass249_8422);
		boolean bool_1426_ = false;
		int i_1427_ = 2147483647;
		int i_1428_ = -2147483648;
		int i_1429_ = 2147483647;
		int i_1430_ = -2147483648;
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		int i_1431_ = ((((Class387_Sub2) this).aShort8156 - ((Class387_Sub2) this).aShort8145) >> 1);
		int i_1432_ = ((((Class387_Sub2) this).aShort8100 - ((Class387_Sub2) this).aShort8097) >> 1);
		int i_1433_ = ((((Class387_Sub2) this).aShort8141 - ((Class387_Sub2) this).aShort8140) >> 1);
		int i_1434_ = ((Class387_Sub2) this).aShort8145 + i_1431_;
		int i_1435_ = ((Class387_Sub2) this).aShort8097 + i_1432_;
		int i_1436_ = ((Class387_Sub2) this).aShort8140 + i_1433_;
		int i_1437_ = i_1434_ - (i_1431_ << i_1425_);
		int i_1438_ = i_1435_ - (i_1432_ << i_1425_);
		int i_1439_ = i_1436_ - (i_1433_ << i_1425_);
		int i_1440_ = i_1434_ + (i_1431_ << i_1425_);
		int i_1441_ = i_1435_ + (i_1432_ << i_1425_);
		int i_1442_ = i_1436_ + (i_1433_ << i_1425_);
		anIntArray8103[0] = i_1437_;
		anIntArray8154[0] = i_1438_;
		anIntArray8155[0] = i_1439_;
		anIntArray8103[1] = i_1440_;
		anIntArray8154[1] = i_1438_;
		anIntArray8155[1] = i_1439_;
		anIntArray8103[2] = i_1437_;
		anIntArray8154[2] = i_1441_;
		anIntArray8155[2] = i_1439_;
		anIntArray8103[3] = i_1440_;
		anIntArray8154[3] = i_1441_;
		anIntArray8155[3] = i_1439_;
		anIntArray8103[4] = i_1437_;
		anIntArray8154[4] = i_1438_;
		anIntArray8155[4] = i_1442_;
		anIntArray8103[5] = i_1440_;
		anIntArray8154[5] = i_1438_;
		anIntArray8155[5] = i_1442_;
		anIntArray8103[6] = i_1437_;
		anIntArray8154[6] = i_1441_;
		anIntArray8155[6] = i_1442_;
		anIntArray8103[7] = i_1440_;
		anIntArray8154[7] = i_1441_;
		anIntArray8155[7] = i_1442_;
		for (int i_1443_ = 0; i_1443_ < 8; i_1443_++) {
			int i_1444_ = anIntArray8103[i_1443_];
			int i_1445_ = anIntArray8154[i_1443_];
			int i_1446_ = anIntArray8155[i_1443_];
			float f = (class249.aFloatArray2631[2] * (float) i_1444_ + class249.aFloatArray2631[6] * (float) i_1445_ + class249.aFloatArray2631[10] * (float) i_1446_ + class249.aFloatArray2631[14]);
			float f_1447_ = (class249.aFloatArray2631[3] * (float) i_1444_ + class249.aFloatArray2631[7] * (float) i_1445_ + class249.aFloatArray2631[11] * (float) i_1446_ + class249.aFloatArray2631[15]);
			if (f >= -f_1447_) {
				float f_1448_ = (class249.aFloatArray2631[0] * (float) i_1444_ + class249.aFloatArray2631[4] * (float) i_1445_ + class249.aFloatArray2631[8] * (float) i_1446_ + class249.aFloatArray2631[12]);
				float f_1449_ = (class249.aFloatArray2631[1] * (float) i_1444_ + class249.aFloatArray2631[5] * (float) i_1445_ + class249.aFloatArray2631[9] * (float) i_1446_ + class249.aFloatArray2631[13]);
				int i_1450_ = (int) ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloat8337) + (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloat8338) * f_1448_ / f_1447_);
				int i_1451_ = (int) ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloat8339) + (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloat8340) * f_1449_ / f_1447_);
				if (i_1450_ < i_1427_)
					i_1427_ = i_1450_;
				if (i_1450_ > i_1428_)
					i_1428_ = i_1450_;
				if (i_1451_ < i_1429_)
					i_1429_ = i_1451_;
				if (i_1451_ > i_1430_)
					i_1430_ = i_1451_;
				bool_1426_ = true;
			}
		}
		if (bool_1426_ && i > i_1427_ && i < i_1428_ && i_1424_ > i_1429_ && i_1424_ < i_1430_) {
			if (bool)
				return true;
			if ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anIntArray8291).length < ((Class387_Sub2) this).anInt8107) {
				((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anIntArray8291 = new int[((Class387_Sub2) this).anInt8107];
				((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anIntArray8427 = new int[((Class387_Sub2) this).anInt8107];
			}
			int[] is = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anIntArray8291);
			int[] is_1452_ = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).anIntArray8427);
			for (int i_1453_ = 0; i_1453_ < ((Class387_Sub2) this).anInt8130; i_1453_++) {
				int i_1454_ = ((Class387_Sub2) this).anIntArray8102[i_1453_];
				int i_1455_ = ((Class387_Sub2) this).anIntArray8110[i_1453_];
				int i_1456_ = ((Class387_Sub2) this).anIntArray8104[i_1453_];
				float f = (class249.aFloatArray2631[2] * (float) i_1454_ + class249.aFloatArray2631[6] * (float) i_1455_ + class249.aFloatArray2631[10] * (float) i_1456_ + class249.aFloatArray2631[14]);
				float f_1457_ = (class249.aFloatArray2631[3] * (float) i_1454_ + class249.aFloatArray2631[7] * (float) i_1455_ + class249.aFloatArray2631[11] * (float) i_1456_ + class249.aFloatArray2631[15]);
				if (f >= -f_1457_) {
					float f_1458_ = (class249.aFloatArray2631[0] * (float) i_1454_ + class249.aFloatArray2631[4] * (float) i_1455_ + class249.aFloatArray2631[8] * (float) i_1456_ + class249.aFloatArray2631[12]);
					float f_1459_ = (class249.aFloatArray2631[1] * (float) i_1454_ + class249.aFloatArray2631[5] * (float) i_1455_ + class249.aFloatArray2631[9] * (float) i_1456_ + class249.aFloatArray2631[13]);
					int i_1460_ = ((Class387_Sub2) this).anIntArray8143[i_1453_];
					int i_1461_ = ((Class387_Sub2) this).anIntArray8143[i_1453_ + 1];
					for (int i_1462_ = i_1460_; i_1462_ < i_1461_; i_1462_++) {
						int i_1463_ = (((Class387_Sub2) this).aShortArray8144[i_1462_] - 1);
						if (i_1463_ == -1)
							break;
						is[i_1463_] = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8337) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338 * f_1458_ / f_1457_));
						is_1452_[i_1463_] = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8339) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8340 * f_1459_ / f_1457_));
					}
				} else {
					int i_1464_ = ((Class387_Sub2) this).anIntArray8143[i_1453_];
					int i_1465_ = ((Class387_Sub2) this).anIntArray8143[i_1453_ + 1];
					for (int i_1466_ = i_1464_; i_1466_ < i_1465_; i_1466_++) {
						int i_1467_ = (((Class387_Sub2) this).aShortArray8144[i_1466_] - 1);
						if (i_1467_ == -1)
							break;
						is[((Class387_Sub2) this).aShortArray8144[i_1466_] - 1] = -999999;
					}
				}
			}
			for (int i_1468_ = 0; i_1468_ < ((Class387_Sub2) this).anInt8089; i_1468_++) {
				if ((is[((Class387_Sub2) this).aShortArray8119[i_1468_]] != -999999) && (is[((Class387_Sub2) this).aShortArray8120[i_1468_]] != -999999) && (is[((Class387_Sub2) this).aShortArray8121[i_1468_]] != -999999) && method4521(i, i_1424_, is_1452_[(((Class387_Sub2) this).aShortArray8119[i_1468_])], is_1452_[(((Class387_Sub2) this).aShortArray8120[i_1468_])], is_1452_[(((Class387_Sub2) this).aShortArray8121[i_1468_])], is[(((Class387_Sub2) this).aShortArray8119[i_1468_])], is[(((Class387_Sub2) this).aShortArray8120[i_1468_])], is[(((Class387_Sub2) this).aShortArray8121[i_1468_])]))
					return true;
			}
		}
		return false;
	}

	public Class64[] method4484() {
		return ((Class387_Sub2) this).aClass64Array8146;
	}

	public Class64[] method4485() {
		return ((Class387_Sub2) this).aClass64Array8146;
	}

	public int ds() {
		return ((Class387_Sub2) this).aShort8099;
	}

	public boolean dp() {
		return ((Class387_Sub2) this).aBoolean8153;
	}

	void method4448() {
		/* empty */
	}

	public void bz(int i, int i_1469_, int i_1470_) {
		for (int i_1471_ = 0; i_1471_ < ((Class387_Sub2) this).anInt8130; i_1471_++) {
			if (i != 0)
				((Class387_Sub2) this).anIntArray8102[i_1471_] += i;
			if (i_1469_ != 0)
				((Class387_Sub2) this).anIntArray8110[i_1471_] += i_1469_;
			if (i_1470_ != 0)
				((Class387_Sub2) this).anIntArray8104[i_1471_] += i_1470_;
		}
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	void ee(int i, int[] is, int i_1472_, int i_1473_, int i_1474_, boolean bool, int i_1475_, int[] is_1476_) {
		int i_1477_ = is.length;
		if (i == 0) {
			i_1472_ <<= 4;
			i_1473_ <<= 4;
			i_1474_ <<= 4;
			int i_1478_ = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (int i_1479_ = 0; i_1479_ < i_1477_; i_1479_++) {
				int i_1480_ = is[i_1479_];
				if (i_1480_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_1481_ = ((Class387_Sub2) this).anIntArrayArray8113[i_1480_];
					for (int i_1482_ = 0; i_1482_ < is_1481_.length; i_1482_++) {
						int i_1483_ = is_1481_[i_1482_];
						if (((Class387_Sub2) this).aShortArray8106 == null || (i_1475_ & (((Class387_Sub2) this).aShortArray8106[i_1483_])) != 0) {
							anInt8101 += (((Class387_Sub2) this).anIntArray8102[i_1483_]);
							anInt8111 += (((Class387_Sub2) this).anIntArray8110[i_1483_]);
							anInt8158 += (((Class387_Sub2) this).anIntArray8104[i_1483_]);
							i_1478_++;
						}
					}
				}
			}
			if (i_1478_ > 0) {
				anInt8101 = anInt8101 / i_1478_ + i_1472_;
				anInt8111 = anInt8111 / i_1478_ + i_1473_;
				anInt8158 = anInt8158 / i_1478_ + i_1474_;
				aBoolean8159 = true;
			} else {
				anInt8101 = i_1472_;
				anInt8111 = i_1473_;
				anInt8158 = i_1474_;
			}
		} else if (i == 1) {
			if (is_1476_ != null) {
				int i_1484_ = ((is_1476_[0] * i_1472_ + is_1476_[1] * i_1473_ + is_1476_[2] * i_1474_ + 8192) >> 14);
				int i_1485_ = ((is_1476_[3] * i_1472_ + is_1476_[4] * i_1473_ + is_1476_[5] * i_1474_ + 8192) >> 14);
				int i_1486_ = ((is_1476_[6] * i_1472_ + is_1476_[7] * i_1473_ + is_1476_[8] * i_1474_ + 8192) >> 14);
				i_1472_ = i_1484_;
				i_1473_ = i_1485_;
				i_1474_ = i_1486_;
			}
			i_1472_ <<= 4;
			i_1473_ <<= 4;
			i_1474_ <<= 4;
			for (int i_1487_ = 0; i_1487_ < i_1477_; i_1487_++) {
				int i_1488_ = is[i_1487_];
				if (i_1488_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_1489_ = ((Class387_Sub2) this).anIntArrayArray8113[i_1488_];
					for (int i_1490_ = 0; i_1490_ < is_1489_.length; i_1490_++) {
						int i_1491_ = is_1489_[i_1490_];
						if (((Class387_Sub2) this).aShortArray8106 == null || (i_1475_ & (((Class387_Sub2) this).aShortArray8106[i_1491_])) != 0) {
							((Class387_Sub2) this).anIntArray8102[i_1491_] += i_1472_;
							((Class387_Sub2) this).anIntArray8110[i_1491_] += i_1473_;
							((Class387_Sub2) this).anIntArray8104[i_1491_] += i_1474_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1476_ != null) {
				int i_1492_ = is_1476_[9] << 4;
				int i_1493_ = is_1476_[10] << 4;
				int i_1494_ = is_1476_[11] << 4;
				int i_1495_ = is_1476_[12] << 4;
				int i_1496_ = is_1476_[13] << 4;
				int i_1497_ = is_1476_[14] << 4;
				if (aBoolean8159) {
					int i_1498_ = ((is_1476_[0] * anInt8101 + is_1476_[3] * anInt8111 + is_1476_[6] * anInt8158 + 8192) >> 14);
					int i_1499_ = ((is_1476_[1] * anInt8101 + is_1476_[4] * anInt8111 + is_1476_[7] * anInt8158 + 8192) >> 14);
					int i_1500_ = ((is_1476_[2] * anInt8101 + is_1476_[5] * anInt8111 + is_1476_[8] * anInt8158 + 8192) >> 14);
					i_1498_ += i_1495_;
					i_1499_ += i_1496_;
					i_1500_ += i_1497_;
					anInt8101 = i_1498_;
					anInt8111 = i_1499_;
					anInt8158 = i_1500_;
					aBoolean8159 = false;
				}
				int[] is_1501_ = new int[9];
				int i_1502_ = Class257.anIntArray2684[i_1472_];
				int i_1503_ = Class257.anIntArray2683[i_1472_];
				int i_1504_ = Class257.anIntArray2684[i_1473_];
				int i_1505_ = Class257.anIntArray2683[i_1473_];
				int i_1506_ = Class257.anIntArray2684[i_1474_];
				int i_1507_ = Class257.anIntArray2683[i_1474_];
				int i_1508_ = i_1503_ * i_1506_ + 8192 >> 14;
				int i_1509_ = i_1503_ * i_1507_ + 8192 >> 14;
				is_1501_[0] = i_1504_ * i_1506_ + i_1505_ * i_1509_ + 8192 >> 14;
				is_1501_[1] = -i_1504_ * i_1507_ + i_1505_ * i_1508_ + 8192 >> 14;
				is_1501_[2] = i_1505_ * i_1502_ + 8192 >> 14;
				is_1501_[3] = i_1502_ * i_1507_ + 8192 >> 14;
				is_1501_[4] = i_1502_ * i_1506_ + 8192 >> 14;
				is_1501_[5] = -i_1503_;
				is_1501_[6] = -i_1505_ * i_1506_ + i_1504_ * i_1509_ + 8192 >> 14;
				is_1501_[7] = i_1505_ * i_1507_ + i_1504_ * i_1508_ + 8192 >> 14;
				is_1501_[8] = i_1504_ * i_1502_ + 8192 >> 14;
				int i_1510_ = ((is_1501_[0] * -anInt8101 + is_1501_[1] * -anInt8111 + is_1501_[2] * -anInt8158 + 8192) >> 14);
				int i_1511_ = ((is_1501_[3] * -anInt8101 + is_1501_[4] * -anInt8111 + is_1501_[5] * -anInt8158 + 8192) >> 14);
				int i_1512_ = ((is_1501_[6] * -anInt8101 + is_1501_[7] * -anInt8111 + is_1501_[8] * -anInt8158 + 8192) >> 14);
				int i_1513_ = i_1510_ + anInt8101;
				int i_1514_ = i_1511_ + anInt8111;
				int i_1515_ = i_1512_ + anInt8158;
				int[] is_1516_ = new int[9];
				for (int i_1517_ = 0; i_1517_ < 3; i_1517_++) {
					for (int i_1518_ = 0; i_1518_ < 3; i_1518_++) {
						int i_1519_ = 0;
						for (int i_1520_ = 0; i_1520_ < 3; i_1520_++)
							i_1519_ += (is_1501_[i_1517_ * 3 + i_1520_] * is_1476_[i_1518_ * 3 + i_1520_]);
						is_1516_[i_1517_ * 3 + i_1518_] = i_1519_ + 8192 >> 14;
					}
				}
				int i_1521_ = ((is_1501_[0] * i_1495_ + is_1501_[1] * i_1496_ + is_1501_[2] * i_1497_ + 8192) >> 14);
				int i_1522_ = ((is_1501_[3] * i_1495_ + is_1501_[4] * i_1496_ + is_1501_[5] * i_1497_ + 8192) >> 14);
				int i_1523_ = ((is_1501_[6] * i_1495_ + is_1501_[7] * i_1496_ + is_1501_[8] * i_1497_ + 8192) >> 14);
				i_1521_ += i_1513_;
				i_1522_ += i_1514_;
				i_1523_ += i_1515_;
				int[] is_1524_ = new int[9];
				for (int i_1525_ = 0; i_1525_ < 3; i_1525_++) {
					for (int i_1526_ = 0; i_1526_ < 3; i_1526_++) {
						int i_1527_ = 0;
						for (int i_1528_ = 0; i_1528_ < 3; i_1528_++)
							i_1527_ += (is_1476_[i_1525_ * 3 + i_1528_] * is_1516_[i_1526_ + i_1528_ * 3]);
						is_1524_[i_1525_ * 3 + i_1526_] = i_1527_ + 8192 >> 14;
					}
				}
				int i_1529_ = ((is_1476_[0] * i_1521_ + is_1476_[1] * i_1522_ + is_1476_[2] * i_1523_ + 8192) >> 14);
				int i_1530_ = ((is_1476_[3] * i_1521_ + is_1476_[4] * i_1522_ + is_1476_[5] * i_1523_ + 8192) >> 14);
				int i_1531_ = ((is_1476_[6] * i_1521_ + is_1476_[7] * i_1522_ + is_1476_[8] * i_1523_ + 8192) >> 14);
				i_1529_ += i_1492_;
				i_1530_ += i_1493_;
				i_1531_ += i_1494_;
				for (int i_1532_ = 0; i_1532_ < i_1477_; i_1532_++) {
					int i_1533_ = is[i_1532_];
					if (i_1533_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_1534_ = (((Class387_Sub2) this).anIntArrayArray8113[i_1533_]);
						for (int i_1535_ = 0; i_1535_ < is_1534_.length; i_1535_++) {
							int i_1536_ = is_1534_[i_1535_];
							if (((Class387_Sub2) this).aShortArray8106 == null || ((i_1475_ & (((Class387_Sub2) this).aShortArray8106[i_1536_])) != 0)) {
								int i_1537_ = (is_1524_[0] * (((Class387_Sub2) this).anIntArray8102[i_1536_]) + is_1524_[1] * (((Class387_Sub2) this).anIntArray8110[i_1536_]) + is_1524_[2] * (((Class387_Sub2) this).anIntArray8104[i_1536_]) + 8192) >> 14;
								int i_1538_ = (is_1524_[3] * (((Class387_Sub2) this).anIntArray8102[i_1536_]) + is_1524_[4] * (((Class387_Sub2) this).anIntArray8110[i_1536_]) + is_1524_[5] * (((Class387_Sub2) this).anIntArray8104[i_1536_]) + 8192) >> 14;
								int i_1539_ = (is_1524_[6] * (((Class387_Sub2) this).anIntArray8102[i_1536_]) + is_1524_[7] * (((Class387_Sub2) this).anIntArray8110[i_1536_]) + is_1524_[8] * (((Class387_Sub2) this).anIntArray8104[i_1536_]) + 8192) >> 14;
								i_1537_ += i_1529_;
								i_1538_ += i_1530_;
								i_1539_ += i_1531_;
								((Class387_Sub2) this).anIntArray8102[i_1536_] = i_1537_;
								((Class387_Sub2) this).anIntArray8110[i_1536_] = i_1538_;
								((Class387_Sub2) this).anIntArray8104[i_1536_] = i_1539_;
							}
						}
					}
				}
			} else {
				for (int i_1540_ = 0; i_1540_ < i_1477_; i_1540_++) {
					int i_1541_ = is[i_1540_];
					if (i_1541_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_1542_ = (((Class387_Sub2) this).anIntArrayArray8113[i_1541_]);
						for (int i_1543_ = 0; i_1543_ < is_1542_.length; i_1543_++) {
							int i_1544_ = is_1542_[i_1543_];
							if (((Class387_Sub2) this).aShortArray8106 == null || ((i_1475_ & (((Class387_Sub2) this).aShortArray8106[i_1544_])) != 0)) {
								((Class387_Sub2) this).anIntArray8102[i_1544_] -= anInt8101;
								((Class387_Sub2) this).anIntArray8110[i_1544_] -= anInt8111;
								((Class387_Sub2) this).anIntArray8104[i_1544_] -= anInt8158;
								if (i_1474_ != 0) {
									int i_1545_ = Class257.anIntArray2683[i_1474_];
									int i_1546_ = Class257.anIntArray2684[i_1474_];
									int i_1547_ = ((((Class387_Sub2) this).anIntArray8110[i_1544_]) * i_1545_ + ((((Class387_Sub2) this).anIntArray8102[i_1544_]) * i_1546_) + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8110[i_1544_] = ((((Class387_Sub2) this).anIntArray8110[i_1544_]) * i_1546_ - ((((Class387_Sub2) this).anIntArray8102[i_1544_]) * i_1545_) + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8102[i_1544_] = i_1547_;
								}
								if (i_1472_ != 0) {
									int i_1548_ = Class257.anIntArray2683[i_1472_];
									int i_1549_ = Class257.anIntArray2684[i_1472_];
									int i_1550_ = ((((Class387_Sub2) this).anIntArray8110[i_1544_]) * i_1549_ - ((((Class387_Sub2) this).anIntArray8104[i_1544_]) * i_1548_) + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8104[i_1544_] = ((((Class387_Sub2) this).anIntArray8110[i_1544_]) * i_1548_ + ((((Class387_Sub2) this).anIntArray8104[i_1544_]) * i_1549_) + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8110[i_1544_] = i_1550_;
								}
								if (i_1473_ != 0) {
									int i_1551_ = Class257.anIntArray2683[i_1473_];
									int i_1552_ = Class257.anIntArray2684[i_1473_];
									int i_1553_ = ((((Class387_Sub2) this).anIntArray8104[i_1544_]) * i_1551_ + ((((Class387_Sub2) this).anIntArray8102[i_1544_]) * i_1552_) + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8104[i_1544_] = ((((Class387_Sub2) this).anIntArray8104[i_1544_]) * i_1552_ - ((((Class387_Sub2) this).anIntArray8102[i_1544_]) * i_1551_) + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8102[i_1544_] = i_1553_;
								}
								((Class387_Sub2) this).anIntArray8102[i_1544_] += anInt8101;
								((Class387_Sub2) this).anIntArray8110[i_1544_] += anInt8111;
								((Class387_Sub2) this).anIntArray8104[i_1544_] += anInt8158;
							}
						}
					}
				}
				if (bool) {
					for (int i_1554_ = 0; i_1554_ < i_1477_; i_1554_++) {
						int i_1555_ = is[i_1554_];
						if (i_1555_ < (((Class387_Sub2) this).anIntArrayArray8113).length) {
							int[] is_1556_ = (((Class387_Sub2) this).anIntArrayArray8113[i_1555_]);
							for (int i_1557_ = 0; i_1557_ < is_1556_.length; i_1557_++) {
								int i_1558_ = is_1556_[i_1557_];
								if ((((Class387_Sub2) this).aShortArray8106 == null) || ((i_1475_ & (((Class387_Sub2) this).aShortArray8106[i_1558_])) != 0)) {
									int i_1559_ = (((Class387_Sub2) this).anIntArray8143[i_1558_]);
									int i_1560_ = (((Class387_Sub2) this).anIntArray8143[i_1558_ + 1]);
									for (int i_1561_ = i_1559_; i_1561_ < i_1560_; i_1561_++) {
										int i_1562_ = ((((Class387_Sub2) this).aShortArray8144[i_1561_]) - 1);
										if (i_1562_ == -1)
											break;
										if (i_1474_ != 0) {
											int i_1563_ = (Class257.anIntArray2683[i_1474_]);
											int i_1564_ = (Class257.anIntArray2684[i_1474_]);
											int i_1565_ = (((((Class387_Sub2) this).aShortArray8109[i_1562_]) * i_1563_ + (((Class387_Sub2) this).aShortArray8108[i_1562_]) * i_1564_ + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8109[i_1562_] = (short) ((((((Class387_Sub2) this).aShortArray8109[i_1562_]) * i_1564_) - ((((Class387_Sub2) this).aShortArray8108[i_1562_]) * i_1563_) + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8108[i_1562_] = (short) i_1565_;
										}
										if (i_1472_ != 0) {
											int i_1566_ = (Class257.anIntArray2683[i_1472_]);
											int i_1567_ = (Class257.anIntArray2684[i_1472_]);
											int i_1568_ = (((((Class387_Sub2) this).aShortArray8109[i_1562_]) * i_1567_ - (((Class387_Sub2) this).aShortArray8095[i_1562_]) * i_1566_ + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8095[i_1562_] = (short) ((((((Class387_Sub2) this).aShortArray8109[i_1562_]) * i_1566_) + ((((Class387_Sub2) this).aShortArray8095[i_1562_]) * i_1567_) + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8109[i_1562_] = (short) i_1568_;
										}
										if (i_1473_ != 0) {
											int i_1569_ = (Class257.anIntArray2683[i_1473_]);
											int i_1570_ = (Class257.anIntArray2684[i_1473_]);
											int i_1571_ = (((((Class387_Sub2) this).aShortArray8095[i_1562_]) * i_1569_ + (((Class387_Sub2) this).aShortArray8108[i_1562_]) * i_1570_ + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8095[i_1562_] = (short) ((((((Class387_Sub2) this).aShortArray8095[i_1562_]) * i_1570_) - ((((Class387_Sub2) this).aShortArray8108[i_1562_]) * i_1569_) + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8108[i_1562_] = (short) i_1571_;
										}
									}
								}
							}
						}
					}
					if (((Class387_Sub2) this).aClass44_8127 == null && ((Class387_Sub2) this).aClass44_8105 != null)
						((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
					if (((Class387_Sub2) this).aClass44_8127 != null)
						((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = null;
				}
			}
		} else if (i == 3) {
			if (is_1476_ != null) {
				int i_1572_ = is_1476_[9] << 4;
				int i_1573_ = is_1476_[10] << 4;
				int i_1574_ = is_1476_[11] << 4;
				int i_1575_ = is_1476_[12] << 4;
				int i_1576_ = is_1476_[13] << 4;
				int i_1577_ = is_1476_[14] << 4;
				if (aBoolean8159) {
					int i_1578_ = ((is_1476_[0] * anInt8101 + is_1476_[3] * anInt8111 + is_1476_[6] * anInt8158 + 8192) >> 14);
					int i_1579_ = ((is_1476_[1] * anInt8101 + is_1476_[4] * anInt8111 + is_1476_[7] * anInt8158 + 8192) >> 14);
					int i_1580_ = ((is_1476_[2] * anInt8101 + is_1476_[5] * anInt8111 + is_1476_[8] * anInt8158 + 8192) >> 14);
					i_1578_ += i_1575_;
					i_1579_ += i_1576_;
					i_1580_ += i_1577_;
					anInt8101 = i_1578_;
					anInt8111 = i_1579_;
					anInt8158 = i_1580_;
					aBoolean8159 = false;
				}
				int i_1581_ = i_1472_ << 15 >> 7;
				int i_1582_ = i_1473_ << 15 >> 7;
				int i_1583_ = i_1474_ << 15 >> 7;
				int i_1584_ = i_1581_ * -anInt8101 + 8192 >> 14;
				int i_1585_ = i_1582_ * -anInt8111 + 8192 >> 14;
				int i_1586_ = i_1583_ * -anInt8158 + 8192 >> 14;
				int i_1587_ = i_1584_ + anInt8101;
				int i_1588_ = i_1585_ + anInt8111;
				int i_1589_ = i_1586_ + anInt8158;
				int[] is_1590_ = new int[9];
				is_1590_[0] = i_1581_ * is_1476_[0] + 8192 >> 14;
				is_1590_[1] = i_1581_ * is_1476_[3] + 8192 >> 14;
				is_1590_[2] = i_1581_ * is_1476_[6] + 8192 >> 14;
				is_1590_[3] = i_1582_ * is_1476_[1] + 8192 >> 14;
				is_1590_[4] = i_1582_ * is_1476_[4] + 8192 >> 14;
				is_1590_[5] = i_1582_ * is_1476_[7] + 8192 >> 14;
				is_1590_[6] = i_1583_ * is_1476_[2] + 8192 >> 14;
				is_1590_[7] = i_1583_ * is_1476_[5] + 8192 >> 14;
				is_1590_[8] = i_1583_ * is_1476_[8] + 8192 >> 14;
				int i_1591_ = i_1581_ * i_1575_ + 8192 >> 14;
				int i_1592_ = i_1582_ * i_1576_ + 8192 >> 14;
				int i_1593_ = i_1583_ * i_1577_ + 8192 >> 14;
				i_1591_ += i_1587_;
				i_1592_ += i_1588_;
				i_1593_ += i_1589_;
				int[] is_1594_ = new int[9];
				for (int i_1595_ = 0; i_1595_ < 3; i_1595_++) {
					for (int i_1596_ = 0; i_1596_ < 3; i_1596_++) {
						int i_1597_ = 0;
						for (int i_1598_ = 0; i_1598_ < 3; i_1598_++)
							i_1597_ += (is_1476_[i_1595_ * 3 + i_1598_] * is_1590_[i_1596_ + i_1598_ * 3]);
						is_1594_[i_1595_ * 3 + i_1596_] = i_1597_ + 8192 >> 14;
					}
				}
				int i_1599_ = ((is_1476_[0] * i_1591_ + is_1476_[1] * i_1592_ + is_1476_[2] * i_1593_ + 8192) >> 14);
				int i_1600_ = ((is_1476_[3] * i_1591_ + is_1476_[4] * i_1592_ + is_1476_[5] * i_1593_ + 8192) >> 14);
				int i_1601_ = ((is_1476_[6] * i_1591_ + is_1476_[7] * i_1592_ + is_1476_[8] * i_1593_ + 8192) >> 14);
				i_1599_ += i_1572_;
				i_1600_ += i_1573_;
				i_1601_ += i_1574_;
				for (int i_1602_ = 0; i_1602_ < i_1477_; i_1602_++) {
					int i_1603_ = is[i_1602_];
					if (i_1603_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_1604_ = (((Class387_Sub2) this).anIntArrayArray8113[i_1603_]);
						for (int i_1605_ = 0; i_1605_ < is_1604_.length; i_1605_++) {
							int i_1606_ = is_1604_[i_1605_];
							if (((Class387_Sub2) this).aShortArray8106 == null || ((i_1475_ & (((Class387_Sub2) this).aShortArray8106[i_1606_])) != 0)) {
								int i_1607_ = (is_1594_[0] * (((Class387_Sub2) this).anIntArray8102[i_1606_]) + is_1594_[1] * (((Class387_Sub2) this).anIntArray8110[i_1606_]) + is_1594_[2] * (((Class387_Sub2) this).anIntArray8104[i_1606_]) + 8192) >> 14;
								int i_1608_ = (is_1594_[3] * (((Class387_Sub2) this).anIntArray8102[i_1606_]) + is_1594_[4] * (((Class387_Sub2) this).anIntArray8110[i_1606_]) + is_1594_[5] * (((Class387_Sub2) this).anIntArray8104[i_1606_]) + 8192) >> 14;
								int i_1609_ = (is_1594_[6] * (((Class387_Sub2) this).anIntArray8102[i_1606_]) + is_1594_[7] * (((Class387_Sub2) this).anIntArray8110[i_1606_]) + is_1594_[8] * (((Class387_Sub2) this).anIntArray8104[i_1606_]) + 8192) >> 14;
								i_1607_ += i_1599_;
								i_1608_ += i_1600_;
								i_1609_ += i_1601_;
								((Class387_Sub2) this).anIntArray8102[i_1606_] = i_1607_;
								((Class387_Sub2) this).anIntArray8110[i_1606_] = i_1608_;
								((Class387_Sub2) this).anIntArray8104[i_1606_] = i_1609_;
							}
						}
					}
				}
			} else {
				for (int i_1610_ = 0; i_1610_ < i_1477_; i_1610_++) {
					int i_1611_ = is[i_1610_];
					if (i_1611_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_1612_ = (((Class387_Sub2) this).anIntArrayArray8113[i_1611_]);
						for (int i_1613_ = 0; i_1613_ < is_1612_.length; i_1613_++) {
							int i_1614_ = is_1612_[i_1613_];
							if (((Class387_Sub2) this).aShortArray8106 == null || ((i_1475_ & (((Class387_Sub2) this).aShortArray8106[i_1614_])) != 0)) {
								((Class387_Sub2) this).anIntArray8102[i_1614_] -= anInt8101;
								((Class387_Sub2) this).anIntArray8110[i_1614_] -= anInt8111;
								((Class387_Sub2) this).anIntArray8104[i_1614_] -= anInt8158;
								((Class387_Sub2) this).anIntArray8102[i_1614_] = (((Class387_Sub2) this).anIntArray8102[i_1614_]) * i_1472_ >> 7;
								((Class387_Sub2) this).anIntArray8110[i_1614_] = (((Class387_Sub2) this).anIntArray8110[i_1614_]) * i_1473_ >> 7;
								((Class387_Sub2) this).anIntArray8104[i_1614_] = (((Class387_Sub2) this).anIntArray8104[i_1614_]) * i_1474_ >> 7;
								((Class387_Sub2) this).anIntArray8102[i_1614_] += anInt8101;
								((Class387_Sub2) this).anIntArray8110[i_1614_] += anInt8111;
								((Class387_Sub2) this).anIntArray8104[i_1614_] += anInt8158;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub2) this).anIntArrayArray8123 != null) {
				for (int i_1615_ = 0; i_1615_ < i_1477_; i_1615_++) {
					int i_1616_ = is[i_1615_];
					if (i_1616_ < ((Class387_Sub2) this).anIntArrayArray8123.length) {
						int[] is_1617_ = (((Class387_Sub2) this).anIntArrayArray8123[i_1616_]);
						for (int i_1618_ = 0; i_1618_ < is_1617_.length; i_1618_++) {
							int i_1619_ = is_1617_[i_1618_];
							if (((Class387_Sub2) this).aShortArray8124 == null || ((i_1475_ & (((Class387_Sub2) this).aShortArray8124[i_1619_])) != 0)) {
								int i_1620_ = (((((Class387_Sub2) this).aByteArray8136[i_1619_]) & 0xff) + i_1472_ * 8);
								if (i_1620_ < 0)
									i_1620_ = 0;
								else if (i_1620_ > 255)
									i_1620_ = 255;
								((Class387_Sub2) this).aByteArray8136[i_1619_] = (byte) i_1620_;
								if (((Class387_Sub2) this).aClass44_8105 != null)
									((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
							}
						}
					}
				}
				if (((Class387_Sub2) this).aClass52Array8148 != null) {
					for (int i_1621_ = 0; i_1621_ < ((Class387_Sub2) this).anInt8147; i_1621_++) {
						Class52 class52 = (((Class387_Sub2) this).aClass52Array8148[i_1621_]);
						Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[i_1621_]);
						((Class40) class40).anInt428 = (((Class40) class40).anInt428 & 0xffffff | 255 - ((((Class387_Sub2) this).aByteArray8136[((Class52) class52).modelColorIndex]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub2) this).anIntArrayArray8123 != null) {
				for (int i_1622_ = 0; i_1622_ < i_1477_; i_1622_++) {
					int i_1623_ = is[i_1622_];
					if (i_1623_ < ((Class387_Sub2) this).anIntArrayArray8123.length) {
						int[] is_1624_ = (((Class387_Sub2) this).anIntArrayArray8123[i_1623_]);
						for (int i_1625_ = 0; i_1625_ < is_1624_.length; i_1625_++) {
							int i_1626_ = is_1624_[i_1625_];
							if (((Class387_Sub2) this).aShortArray8124 == null || ((i_1475_ & (((Class387_Sub2) this).aShortArray8124[i_1626_])) != 0)) {
								int i_1627_ = ((((Class387_Sub2) this).modelColors[i_1626_]) & 0xffff);
								int i_1628_ = i_1627_ >> 10 & 0x3f;
								int i_1629_ = i_1627_ >> 7 & 0x7;
								int i_1630_ = i_1627_ & 0x7f;
								i_1628_ = i_1628_ + i_1472_ & 0x3f;
								i_1629_ += i_1473_ / 4;
								if (i_1629_ < 0)
									i_1629_ = 0;
								else if (i_1629_ > 7)
									i_1629_ = 7;
								i_1630_ += i_1474_;
								if (i_1630_ < 0)
									i_1630_ = 0;
								else if (i_1630_ > 127)
									i_1630_ = 127;
								((Class387_Sub2) this).modelColors[i_1626_] = (short) (i_1628_ << 10 | i_1629_ << 7 | i_1630_);
								if (((Class387_Sub2) this).aClass44_8105 != null)
									((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
							}
						}
					}
				}
				if (((Class387_Sub2) this).aClass52Array8148 != null) {
					for (int i_1631_ = 0; i_1631_ < ((Class387_Sub2) this).anInt8147; i_1631_++) {
						Class52 class52 = (((Class387_Sub2) this).aClass52Array8148[i_1631_]);
						Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[i_1631_]);
						((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_1632_ = 0; i_1632_ < i_1477_; i_1632_++) {
					int i_1633_ = is[i_1632_];
					if (i_1633_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_1634_ = (((Class387_Sub2) this).anIntArrayArray8150[i_1633_]);
						for (int i_1635_ = 0; i_1635_ < is_1634_.length; i_1635_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_1634_[i_1635_]]);
							((Class40) class40).anInt425 += i_1472_;
							((Class40) class40).anInt427 += i_1473_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_1636_ = 0; i_1636_ < i_1477_; i_1636_++) {
					int i_1637_ = is[i_1636_];
					if (i_1637_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_1638_ = (((Class387_Sub2) this).anIntArrayArray8150[i_1637_]);
						for (int i_1639_ = 0; i_1639_ < is_1638_.length; i_1639_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_1638_[i_1639_]]);
							((Class40) class40).anInt429 = ((Class40) class40).anInt429 * i_1472_ >> 7;
							((Class40) class40).anInt426 = ((Class40) class40).anInt426 * i_1473_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_1640_ = 0; i_1640_ < i_1477_; i_1640_++) {
					int i_1641_ = is[i_1640_];
					if (i_1641_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_1642_ = (((Class387_Sub2) this).anIntArrayArray8150[i_1641_]);
						for (int i_1643_ = 0; i_1643_ < is_1642_.length; i_1643_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_1642_[i_1643_]]);
							((Class40) class40).anInt424 = (((Class40) class40).anInt424 + i_1472_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public void ej() {
		for (int i = 0; i < ((Class387_Sub2) this).anInt8130; i++)
			((Class387_Sub2) this).anIntArray8104[i] = -((Class387_Sub2) this).anIntArray8104[i];
		for (int i = 0; i < ((Class387_Sub2) this).anInt8107; i++)
			((Class387_Sub2) this).aShortArray8095[i] = (short) -((Class387_Sub2) this).aShortArray8095[i];
		for (int i = 0; i < ((Class387_Sub2) this).anInt8089; i++) {
			short i_1644_ = ((Class387_Sub2) this).aShortArray8119[i];
			((Class387_Sub2) this).aShortArray8119[i] = ((Class387_Sub2) this).aShortArray8121[i];
			((Class387_Sub2) this).aShortArray8121[i] = i_1644_;
		}
		if (((Class387_Sub2) this).aClass44_8127 == null && ((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass44_8127 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass37_8087 != null)
			((Class37) ((Class387_Sub2) this).aClass37_8087).anInterface3_382 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public int cq() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).aShort8100;
	}

	public int cb() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).anInt8133;
	}

	public boolean ew() {
		return ((Class387_Sub2) this).aBoolean8098;
	}

	public int cc() {
		return ((Class387_Sub2) this).aShort8096;
	}

	public boolean em() {
		return ((Class387_Sub2) this).aBoolean8098;
	}

	void method4489() {
		/* empty */
	}

	public void dl(short i, short i_1645_) {
		Interface_ma interface_ma = ((Class387_Sub2) this).aClass_ra_Sub1_8092.anInterface_ma4227;
		for (int i_1646_ = 0; i_1646_ < ((Class387_Sub2) this).anInt8089; i_1646_++) {
			if (((Class387_Sub2) this).modelTextures[i_1646_] == i)
				((Class387_Sub2) this).modelTextures[i_1646_] = i_1645_;
		}
		byte i_1647_ = 0;
		byte i_1648_ = 0;
		if (i != -1) {
			Class56 class56 = interface_ma.method221(i & 0xffff, 928757184);
			i_1647_ = class56.aByte529;
			i_1648_ = class56.aByte534;
		}
		byte i_1649_ = 0;
		byte i_1650_ = 0;
		if (i_1645_ != -1) {
			Class56 class56 = interface_ma.method221(i_1645_ & 0xffff, -2044424200);
			i_1649_ = class56.aByte529;
			i_1650_ = class56.aByte534;
			if (class56.aByte531 != 0 || class56.aByte530 != 0)
				((Class387_Sub2) this).aBoolean8153 = true;
		}
		if (i_1647_ != i_1649_ | i_1648_ != i_1650_) {
			if (((Class387_Sub2) this).aClass52Array8148 != null) {
				for (int i_1651_ = 0; i_1651_ < ((Class387_Sub2) this).anInt8147; i_1651_++) {
					Class52 class52 = ((Class387_Sub2) this).aClass52Array8148[i_1651_];
					Class40 class40 = ((Class387_Sub2) this).aClass40Array8149[i_1651_];
					((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
				}
			}
			if (((Class387_Sub2) this).aClass44_8105 != null)
				((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
		}
	}

	void er(int i, int[] is, int i_1652_, int i_1653_, int i_1654_, boolean bool, int i_1655_, int[] is_1656_) {
		int i_1657_ = is.length;
		if (i == 0) {
			i_1652_ <<= 4;
			i_1653_ <<= 4;
			i_1654_ <<= 4;
			int i_1658_ = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (int i_1659_ = 0; i_1659_ < i_1657_; i_1659_++) {
				int i_1660_ = is[i_1659_];
				if (i_1660_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_1661_ = ((Class387_Sub2) this).anIntArrayArray8113[i_1660_];
					for (int i_1662_ = 0; i_1662_ < is_1661_.length; i_1662_++) {
						int i_1663_ = is_1661_[i_1662_];
						if (((Class387_Sub2) this).aShortArray8106 == null || (i_1655_ & (((Class387_Sub2) this).aShortArray8106[i_1663_])) != 0) {
							anInt8101 += (((Class387_Sub2) this).anIntArray8102[i_1663_]);
							anInt8111 += (((Class387_Sub2) this).anIntArray8110[i_1663_]);
							anInt8158 += (((Class387_Sub2) this).anIntArray8104[i_1663_]);
							i_1658_++;
						}
					}
				}
			}
			if (i_1658_ > 0) {
				anInt8101 = anInt8101 / i_1658_ + i_1652_;
				anInt8111 = anInt8111 / i_1658_ + i_1653_;
				anInt8158 = anInt8158 / i_1658_ + i_1654_;
				aBoolean8159 = true;
			} else {
				anInt8101 = i_1652_;
				anInt8111 = i_1653_;
				anInt8158 = i_1654_;
			}
		} else if (i == 1) {
			if (is_1656_ != null) {
				int i_1664_ = ((is_1656_[0] * i_1652_ + is_1656_[1] * i_1653_ + is_1656_[2] * i_1654_ + 8192) >> 14);
				int i_1665_ = ((is_1656_[3] * i_1652_ + is_1656_[4] * i_1653_ + is_1656_[5] * i_1654_ + 8192) >> 14);
				int i_1666_ = ((is_1656_[6] * i_1652_ + is_1656_[7] * i_1653_ + is_1656_[8] * i_1654_ + 8192) >> 14);
				i_1652_ = i_1664_;
				i_1653_ = i_1665_;
				i_1654_ = i_1666_;
			}
			i_1652_ <<= 4;
			i_1653_ <<= 4;
			i_1654_ <<= 4;
			for (int i_1667_ = 0; i_1667_ < i_1657_; i_1667_++) {
				int i_1668_ = is[i_1667_];
				if (i_1668_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_1669_ = ((Class387_Sub2) this).anIntArrayArray8113[i_1668_];
					for (int i_1670_ = 0; i_1670_ < is_1669_.length; i_1670_++) {
						int i_1671_ = is_1669_[i_1670_];
						if (((Class387_Sub2) this).aShortArray8106 == null || (i_1655_ & (((Class387_Sub2) this).aShortArray8106[i_1671_])) != 0) {
							((Class387_Sub2) this).anIntArray8102[i_1671_] += i_1652_;
							((Class387_Sub2) this).anIntArray8110[i_1671_] += i_1653_;
							((Class387_Sub2) this).anIntArray8104[i_1671_] += i_1654_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1656_ != null) {
				int i_1672_ = is_1656_[9] << 4;
				int i_1673_ = is_1656_[10] << 4;
				int i_1674_ = is_1656_[11] << 4;
				int i_1675_ = is_1656_[12] << 4;
				int i_1676_ = is_1656_[13] << 4;
				int i_1677_ = is_1656_[14] << 4;
				if (aBoolean8159) {
					int i_1678_ = ((is_1656_[0] * anInt8101 + is_1656_[3] * anInt8111 + is_1656_[6] * anInt8158 + 8192) >> 14);
					int i_1679_ = ((is_1656_[1] * anInt8101 + is_1656_[4] * anInt8111 + is_1656_[7] * anInt8158 + 8192) >> 14);
					int i_1680_ = ((is_1656_[2] * anInt8101 + is_1656_[5] * anInt8111 + is_1656_[8] * anInt8158 + 8192) >> 14);
					i_1678_ += i_1675_;
					i_1679_ += i_1676_;
					i_1680_ += i_1677_;
					anInt8101 = i_1678_;
					anInt8111 = i_1679_;
					anInt8158 = i_1680_;
					aBoolean8159 = false;
				}
				int[] is_1681_ = new int[9];
				int i_1682_ = Class257.anIntArray2684[i_1652_];
				int i_1683_ = Class257.anIntArray2683[i_1652_];
				int i_1684_ = Class257.anIntArray2684[i_1653_];
				int i_1685_ = Class257.anIntArray2683[i_1653_];
				int i_1686_ = Class257.anIntArray2684[i_1654_];
				int i_1687_ = Class257.anIntArray2683[i_1654_];
				int i_1688_ = i_1683_ * i_1686_ + 8192 >> 14;
				int i_1689_ = i_1683_ * i_1687_ + 8192 >> 14;
				is_1681_[0] = i_1684_ * i_1686_ + i_1685_ * i_1689_ + 8192 >> 14;
				is_1681_[1] = -i_1684_ * i_1687_ + i_1685_ * i_1688_ + 8192 >> 14;
				is_1681_[2] = i_1685_ * i_1682_ + 8192 >> 14;
				is_1681_[3] = i_1682_ * i_1687_ + 8192 >> 14;
				is_1681_[4] = i_1682_ * i_1686_ + 8192 >> 14;
				is_1681_[5] = -i_1683_;
				is_1681_[6] = -i_1685_ * i_1686_ + i_1684_ * i_1689_ + 8192 >> 14;
				is_1681_[7] = i_1685_ * i_1687_ + i_1684_ * i_1688_ + 8192 >> 14;
				is_1681_[8] = i_1684_ * i_1682_ + 8192 >> 14;
				int i_1690_ = ((is_1681_[0] * -anInt8101 + is_1681_[1] * -anInt8111 + is_1681_[2] * -anInt8158 + 8192) >> 14);
				int i_1691_ = ((is_1681_[3] * -anInt8101 + is_1681_[4] * -anInt8111 + is_1681_[5] * -anInt8158 + 8192) >> 14);
				int i_1692_ = ((is_1681_[6] * -anInt8101 + is_1681_[7] * -anInt8111 + is_1681_[8] * -anInt8158 + 8192) >> 14);
				int i_1693_ = i_1690_ + anInt8101;
				int i_1694_ = i_1691_ + anInt8111;
				int i_1695_ = i_1692_ + anInt8158;
				int[] is_1696_ = new int[9];
				for (int i_1697_ = 0; i_1697_ < 3; i_1697_++) {
					for (int i_1698_ = 0; i_1698_ < 3; i_1698_++) {
						int i_1699_ = 0;
						for (int i_1700_ = 0; i_1700_ < 3; i_1700_++)
							i_1699_ += (is_1681_[i_1697_ * 3 + i_1700_] * is_1656_[i_1698_ * 3 + i_1700_]);
						is_1696_[i_1697_ * 3 + i_1698_] = i_1699_ + 8192 >> 14;
					}
				}
				int i_1701_ = ((is_1681_[0] * i_1675_ + is_1681_[1] * i_1676_ + is_1681_[2] * i_1677_ + 8192) >> 14);
				int i_1702_ = ((is_1681_[3] * i_1675_ + is_1681_[4] * i_1676_ + is_1681_[5] * i_1677_ + 8192) >> 14);
				int i_1703_ = ((is_1681_[6] * i_1675_ + is_1681_[7] * i_1676_ + is_1681_[8] * i_1677_ + 8192) >> 14);
				i_1701_ += i_1693_;
				i_1702_ += i_1694_;
				i_1703_ += i_1695_;
				int[] is_1704_ = new int[9];
				for (int i_1705_ = 0; i_1705_ < 3; i_1705_++) {
					for (int i_1706_ = 0; i_1706_ < 3; i_1706_++) {
						int i_1707_ = 0;
						for (int i_1708_ = 0; i_1708_ < 3; i_1708_++)
							i_1707_ += (is_1656_[i_1705_ * 3 + i_1708_] * is_1696_[i_1706_ + i_1708_ * 3]);
						is_1704_[i_1705_ * 3 + i_1706_] = i_1707_ + 8192 >> 14;
					}
				}
				int i_1709_ = ((is_1656_[0] * i_1701_ + is_1656_[1] * i_1702_ + is_1656_[2] * i_1703_ + 8192) >> 14);
				int i_1710_ = ((is_1656_[3] * i_1701_ + is_1656_[4] * i_1702_ + is_1656_[5] * i_1703_ + 8192) >> 14);
				int i_1711_ = ((is_1656_[6] * i_1701_ + is_1656_[7] * i_1702_ + is_1656_[8] * i_1703_ + 8192) >> 14);
				i_1709_ += i_1672_;
				i_1710_ += i_1673_;
				i_1711_ += i_1674_;
				for (int i_1712_ = 0; i_1712_ < i_1657_; i_1712_++) {
					int i_1713_ = is[i_1712_];
					if (i_1713_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_1714_ = (((Class387_Sub2) this).anIntArrayArray8113[i_1713_]);
						for (int i_1715_ = 0; i_1715_ < is_1714_.length; i_1715_++) {
							int i_1716_ = is_1714_[i_1715_];
							if (((Class387_Sub2) this).aShortArray8106 == null || ((i_1655_ & (((Class387_Sub2) this).aShortArray8106[i_1716_])) != 0)) {
								int i_1717_ = (is_1704_[0] * (((Class387_Sub2) this).anIntArray8102[i_1716_]) + is_1704_[1] * (((Class387_Sub2) this).anIntArray8110[i_1716_]) + is_1704_[2] * (((Class387_Sub2) this).anIntArray8104[i_1716_]) + 8192) >> 14;
								int i_1718_ = (is_1704_[3] * (((Class387_Sub2) this).anIntArray8102[i_1716_]) + is_1704_[4] * (((Class387_Sub2) this).anIntArray8110[i_1716_]) + is_1704_[5] * (((Class387_Sub2) this).anIntArray8104[i_1716_]) + 8192) >> 14;
								int i_1719_ = (is_1704_[6] * (((Class387_Sub2) this).anIntArray8102[i_1716_]) + is_1704_[7] * (((Class387_Sub2) this).anIntArray8110[i_1716_]) + is_1704_[8] * (((Class387_Sub2) this).anIntArray8104[i_1716_]) + 8192) >> 14;
								i_1717_ += i_1709_;
								i_1718_ += i_1710_;
								i_1719_ += i_1711_;
								((Class387_Sub2) this).anIntArray8102[i_1716_] = i_1717_;
								((Class387_Sub2) this).anIntArray8110[i_1716_] = i_1718_;
								((Class387_Sub2) this).anIntArray8104[i_1716_] = i_1719_;
							}
						}
					}
				}
			} else {
				for (int i_1720_ = 0; i_1720_ < i_1657_; i_1720_++) {
					int i_1721_ = is[i_1720_];
					if (i_1721_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_1722_ = (((Class387_Sub2) this).anIntArrayArray8113[i_1721_]);
						for (int i_1723_ = 0; i_1723_ < is_1722_.length; i_1723_++) {
							int i_1724_ = is_1722_[i_1723_];
							if (((Class387_Sub2) this).aShortArray8106 == null || ((i_1655_ & (((Class387_Sub2) this).aShortArray8106[i_1724_])) != 0)) {
								((Class387_Sub2) this).anIntArray8102[i_1724_] -= anInt8101;
								((Class387_Sub2) this).anIntArray8110[i_1724_] -= anInt8111;
								((Class387_Sub2) this).anIntArray8104[i_1724_] -= anInt8158;
								if (i_1654_ != 0) {
									int i_1725_ = Class257.anIntArray2683[i_1654_];
									int i_1726_ = Class257.anIntArray2684[i_1654_];
									int i_1727_ = ((((Class387_Sub2) this).anIntArray8110[i_1724_]) * i_1725_ + ((((Class387_Sub2) this).anIntArray8102[i_1724_]) * i_1726_) + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8110[i_1724_] = ((((Class387_Sub2) this).anIntArray8110[i_1724_]) * i_1726_ - ((((Class387_Sub2) this).anIntArray8102[i_1724_]) * i_1725_) + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8102[i_1724_] = i_1727_;
								}
								if (i_1652_ != 0) {
									int i_1728_ = Class257.anIntArray2683[i_1652_];
									int i_1729_ = Class257.anIntArray2684[i_1652_];
									int i_1730_ = ((((Class387_Sub2) this).anIntArray8110[i_1724_]) * i_1729_ - ((((Class387_Sub2) this).anIntArray8104[i_1724_]) * i_1728_) + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8104[i_1724_] = ((((Class387_Sub2) this).anIntArray8110[i_1724_]) * i_1728_ + ((((Class387_Sub2) this).anIntArray8104[i_1724_]) * i_1729_) + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8110[i_1724_] = i_1730_;
								}
								if (i_1653_ != 0) {
									int i_1731_ = Class257.anIntArray2683[i_1653_];
									int i_1732_ = Class257.anIntArray2684[i_1653_];
									int i_1733_ = ((((Class387_Sub2) this).anIntArray8104[i_1724_]) * i_1731_ + ((((Class387_Sub2) this).anIntArray8102[i_1724_]) * i_1732_) + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8104[i_1724_] = ((((Class387_Sub2) this).anIntArray8104[i_1724_]) * i_1732_ - ((((Class387_Sub2) this).anIntArray8102[i_1724_]) * i_1731_) + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8102[i_1724_] = i_1733_;
								}
								((Class387_Sub2) this).anIntArray8102[i_1724_] += anInt8101;
								((Class387_Sub2) this).anIntArray8110[i_1724_] += anInt8111;
								((Class387_Sub2) this).anIntArray8104[i_1724_] += anInt8158;
							}
						}
					}
				}
				if (bool) {
					for (int i_1734_ = 0; i_1734_ < i_1657_; i_1734_++) {
						int i_1735_ = is[i_1734_];
						if (i_1735_ < (((Class387_Sub2) this).anIntArrayArray8113).length) {
							int[] is_1736_ = (((Class387_Sub2) this).anIntArrayArray8113[i_1735_]);
							for (int i_1737_ = 0; i_1737_ < is_1736_.length; i_1737_++) {
								int i_1738_ = is_1736_[i_1737_];
								if ((((Class387_Sub2) this).aShortArray8106 == null) || ((i_1655_ & (((Class387_Sub2) this).aShortArray8106[i_1738_])) != 0)) {
									int i_1739_ = (((Class387_Sub2) this).anIntArray8143[i_1738_]);
									int i_1740_ = (((Class387_Sub2) this).anIntArray8143[i_1738_ + 1]);
									for (int i_1741_ = i_1739_; i_1741_ < i_1740_; i_1741_++) {
										int i_1742_ = ((((Class387_Sub2) this).aShortArray8144[i_1741_]) - 1);
										if (i_1742_ == -1)
											break;
										if (i_1654_ != 0) {
											int i_1743_ = (Class257.anIntArray2683[i_1654_]);
											int i_1744_ = (Class257.anIntArray2684[i_1654_]);
											int i_1745_ = (((((Class387_Sub2) this).aShortArray8109[i_1742_]) * i_1743_ + (((Class387_Sub2) this).aShortArray8108[i_1742_]) * i_1744_ + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8109[i_1742_] = (short) ((((((Class387_Sub2) this).aShortArray8109[i_1742_]) * i_1744_) - ((((Class387_Sub2) this).aShortArray8108[i_1742_]) * i_1743_) + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8108[i_1742_] = (short) i_1745_;
										}
										if (i_1652_ != 0) {
											int i_1746_ = (Class257.anIntArray2683[i_1652_]);
											int i_1747_ = (Class257.anIntArray2684[i_1652_]);
											int i_1748_ = (((((Class387_Sub2) this).aShortArray8109[i_1742_]) * i_1747_ - (((Class387_Sub2) this).aShortArray8095[i_1742_]) * i_1746_ + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8095[i_1742_] = (short) ((((((Class387_Sub2) this).aShortArray8109[i_1742_]) * i_1746_) + ((((Class387_Sub2) this).aShortArray8095[i_1742_]) * i_1747_) + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8109[i_1742_] = (short) i_1748_;
										}
										if (i_1653_ != 0) {
											int i_1749_ = (Class257.anIntArray2683[i_1653_]);
											int i_1750_ = (Class257.anIntArray2684[i_1653_]);
											int i_1751_ = (((((Class387_Sub2) this).aShortArray8095[i_1742_]) * i_1749_ + (((Class387_Sub2) this).aShortArray8108[i_1742_]) * i_1750_ + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8095[i_1742_] = (short) ((((((Class387_Sub2) this).aShortArray8095[i_1742_]) * i_1750_) - ((((Class387_Sub2) this).aShortArray8108[i_1742_]) * i_1749_) + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8108[i_1742_] = (short) i_1751_;
										}
									}
								}
							}
						}
					}
					if (((Class387_Sub2) this).aClass44_8127 == null && ((Class387_Sub2) this).aClass44_8105 != null)
						((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
					if (((Class387_Sub2) this).aClass44_8127 != null)
						((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = null;
				}
			}
		} else if (i == 3) {
			if (is_1656_ != null) {
				int i_1752_ = is_1656_[9] << 4;
				int i_1753_ = is_1656_[10] << 4;
				int i_1754_ = is_1656_[11] << 4;
				int i_1755_ = is_1656_[12] << 4;
				int i_1756_ = is_1656_[13] << 4;
				int i_1757_ = is_1656_[14] << 4;
				if (aBoolean8159) {
					int i_1758_ = ((is_1656_[0] * anInt8101 + is_1656_[3] * anInt8111 + is_1656_[6] * anInt8158 + 8192) >> 14);
					int i_1759_ = ((is_1656_[1] * anInt8101 + is_1656_[4] * anInt8111 + is_1656_[7] * anInt8158 + 8192) >> 14);
					int i_1760_ = ((is_1656_[2] * anInt8101 + is_1656_[5] * anInt8111 + is_1656_[8] * anInt8158 + 8192) >> 14);
					i_1758_ += i_1755_;
					i_1759_ += i_1756_;
					i_1760_ += i_1757_;
					anInt8101 = i_1758_;
					anInt8111 = i_1759_;
					anInt8158 = i_1760_;
					aBoolean8159 = false;
				}
				int i_1761_ = i_1652_ << 15 >> 7;
				int i_1762_ = i_1653_ << 15 >> 7;
				int i_1763_ = i_1654_ << 15 >> 7;
				int i_1764_ = i_1761_ * -anInt8101 + 8192 >> 14;
				int i_1765_ = i_1762_ * -anInt8111 + 8192 >> 14;
				int i_1766_ = i_1763_ * -anInt8158 + 8192 >> 14;
				int i_1767_ = i_1764_ + anInt8101;
				int i_1768_ = i_1765_ + anInt8111;
				int i_1769_ = i_1766_ + anInt8158;
				int[] is_1770_ = new int[9];
				is_1770_[0] = i_1761_ * is_1656_[0] + 8192 >> 14;
				is_1770_[1] = i_1761_ * is_1656_[3] + 8192 >> 14;
				is_1770_[2] = i_1761_ * is_1656_[6] + 8192 >> 14;
				is_1770_[3] = i_1762_ * is_1656_[1] + 8192 >> 14;
				is_1770_[4] = i_1762_ * is_1656_[4] + 8192 >> 14;
				is_1770_[5] = i_1762_ * is_1656_[7] + 8192 >> 14;
				is_1770_[6] = i_1763_ * is_1656_[2] + 8192 >> 14;
				is_1770_[7] = i_1763_ * is_1656_[5] + 8192 >> 14;
				is_1770_[8] = i_1763_ * is_1656_[8] + 8192 >> 14;
				int i_1771_ = i_1761_ * i_1755_ + 8192 >> 14;
				int i_1772_ = i_1762_ * i_1756_ + 8192 >> 14;
				int i_1773_ = i_1763_ * i_1757_ + 8192 >> 14;
				i_1771_ += i_1767_;
				i_1772_ += i_1768_;
				i_1773_ += i_1769_;
				int[] is_1774_ = new int[9];
				for (int i_1775_ = 0; i_1775_ < 3; i_1775_++) {
					for (int i_1776_ = 0; i_1776_ < 3; i_1776_++) {
						int i_1777_ = 0;
						for (int i_1778_ = 0; i_1778_ < 3; i_1778_++)
							i_1777_ += (is_1656_[i_1775_ * 3 + i_1778_] * is_1770_[i_1776_ + i_1778_ * 3]);
						is_1774_[i_1775_ * 3 + i_1776_] = i_1777_ + 8192 >> 14;
					}
				}
				int i_1779_ = ((is_1656_[0] * i_1771_ + is_1656_[1] * i_1772_ + is_1656_[2] * i_1773_ + 8192) >> 14);
				int i_1780_ = ((is_1656_[3] * i_1771_ + is_1656_[4] * i_1772_ + is_1656_[5] * i_1773_ + 8192) >> 14);
				int i_1781_ = ((is_1656_[6] * i_1771_ + is_1656_[7] * i_1772_ + is_1656_[8] * i_1773_ + 8192) >> 14);
				i_1779_ += i_1752_;
				i_1780_ += i_1753_;
				i_1781_ += i_1754_;
				for (int i_1782_ = 0; i_1782_ < i_1657_; i_1782_++) {
					int i_1783_ = is[i_1782_];
					if (i_1783_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_1784_ = (((Class387_Sub2) this).anIntArrayArray8113[i_1783_]);
						for (int i_1785_ = 0; i_1785_ < is_1784_.length; i_1785_++) {
							int i_1786_ = is_1784_[i_1785_];
							if (((Class387_Sub2) this).aShortArray8106 == null || ((i_1655_ & (((Class387_Sub2) this).aShortArray8106[i_1786_])) != 0)) {
								int i_1787_ = (is_1774_[0] * (((Class387_Sub2) this).anIntArray8102[i_1786_]) + is_1774_[1] * (((Class387_Sub2) this).anIntArray8110[i_1786_]) + is_1774_[2] * (((Class387_Sub2) this).anIntArray8104[i_1786_]) + 8192) >> 14;
								int i_1788_ = (is_1774_[3] * (((Class387_Sub2) this).anIntArray8102[i_1786_]) + is_1774_[4] * (((Class387_Sub2) this).anIntArray8110[i_1786_]) + is_1774_[5] * (((Class387_Sub2) this).anIntArray8104[i_1786_]) + 8192) >> 14;
								int i_1789_ = (is_1774_[6] * (((Class387_Sub2) this).anIntArray8102[i_1786_]) + is_1774_[7] * (((Class387_Sub2) this).anIntArray8110[i_1786_]) + is_1774_[8] * (((Class387_Sub2) this).anIntArray8104[i_1786_]) + 8192) >> 14;
								i_1787_ += i_1779_;
								i_1788_ += i_1780_;
								i_1789_ += i_1781_;
								((Class387_Sub2) this).anIntArray8102[i_1786_] = i_1787_;
								((Class387_Sub2) this).anIntArray8110[i_1786_] = i_1788_;
								((Class387_Sub2) this).anIntArray8104[i_1786_] = i_1789_;
							}
						}
					}
				}
			} else {
				for (int i_1790_ = 0; i_1790_ < i_1657_; i_1790_++) {
					int i_1791_ = is[i_1790_];
					if (i_1791_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_1792_ = (((Class387_Sub2) this).anIntArrayArray8113[i_1791_]);
						for (int i_1793_ = 0; i_1793_ < is_1792_.length; i_1793_++) {
							int i_1794_ = is_1792_[i_1793_];
							if (((Class387_Sub2) this).aShortArray8106 == null || ((i_1655_ & (((Class387_Sub2) this).aShortArray8106[i_1794_])) != 0)) {
								((Class387_Sub2) this).anIntArray8102[i_1794_] -= anInt8101;
								((Class387_Sub2) this).anIntArray8110[i_1794_] -= anInt8111;
								((Class387_Sub2) this).anIntArray8104[i_1794_] -= anInt8158;
								((Class387_Sub2) this).anIntArray8102[i_1794_] = (((Class387_Sub2) this).anIntArray8102[i_1794_]) * i_1652_ >> 7;
								((Class387_Sub2) this).anIntArray8110[i_1794_] = (((Class387_Sub2) this).anIntArray8110[i_1794_]) * i_1653_ >> 7;
								((Class387_Sub2) this).anIntArray8104[i_1794_] = (((Class387_Sub2) this).anIntArray8104[i_1794_]) * i_1654_ >> 7;
								((Class387_Sub2) this).anIntArray8102[i_1794_] += anInt8101;
								((Class387_Sub2) this).anIntArray8110[i_1794_] += anInt8111;
								((Class387_Sub2) this).anIntArray8104[i_1794_] += anInt8158;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub2) this).anIntArrayArray8123 != null) {
				for (int i_1795_ = 0; i_1795_ < i_1657_; i_1795_++) {
					int i_1796_ = is[i_1795_];
					if (i_1796_ < ((Class387_Sub2) this).anIntArrayArray8123.length) {
						int[] is_1797_ = (((Class387_Sub2) this).anIntArrayArray8123[i_1796_]);
						for (int i_1798_ = 0; i_1798_ < is_1797_.length; i_1798_++) {
							int i_1799_ = is_1797_[i_1798_];
							if (((Class387_Sub2) this).aShortArray8124 == null || ((i_1655_ & (((Class387_Sub2) this).aShortArray8124[i_1799_])) != 0)) {
								int i_1800_ = (((((Class387_Sub2) this).aByteArray8136[i_1799_]) & 0xff) + i_1652_ * 8);
								if (i_1800_ < 0)
									i_1800_ = 0;
								else if (i_1800_ > 255)
									i_1800_ = 255;
								((Class387_Sub2) this).aByteArray8136[i_1799_] = (byte) i_1800_;
								if (((Class387_Sub2) this).aClass44_8105 != null)
									((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
							}
						}
					}
				}
				if (((Class387_Sub2) this).aClass52Array8148 != null) {
					for (int i_1801_ = 0; i_1801_ < ((Class387_Sub2) this).anInt8147; i_1801_++) {
						Class52 class52 = (((Class387_Sub2) this).aClass52Array8148[i_1801_]);
						Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[i_1801_]);
						((Class40) class40).anInt428 = (((Class40) class40).anInt428 & 0xffffff | 255 - ((((Class387_Sub2) this).aByteArray8136[((Class52) class52).modelColorIndex]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub2) this).anIntArrayArray8123 != null) {
				for (int i_1802_ = 0; i_1802_ < i_1657_; i_1802_++) {
					int i_1803_ = is[i_1802_];
					if (i_1803_ < ((Class387_Sub2) this).anIntArrayArray8123.length) {
						int[] is_1804_ = (((Class387_Sub2) this).anIntArrayArray8123[i_1803_]);
						for (int i_1805_ = 0; i_1805_ < is_1804_.length; i_1805_++) {
							int i_1806_ = is_1804_[i_1805_];
							if (((Class387_Sub2) this).aShortArray8124 == null || ((i_1655_ & (((Class387_Sub2) this).aShortArray8124[i_1806_])) != 0)) {
								int i_1807_ = ((((Class387_Sub2) this).modelColors[i_1806_]) & 0xffff);
								int i_1808_ = i_1807_ >> 10 & 0x3f;
								int i_1809_ = i_1807_ >> 7 & 0x7;
								int i_1810_ = i_1807_ & 0x7f;
								i_1808_ = i_1808_ + i_1652_ & 0x3f;
								i_1809_ += i_1653_ / 4;
								if (i_1809_ < 0)
									i_1809_ = 0;
								else if (i_1809_ > 7)
									i_1809_ = 7;
								i_1810_ += i_1654_;
								if (i_1810_ < 0)
									i_1810_ = 0;
								else if (i_1810_ > 127)
									i_1810_ = 127;
								((Class387_Sub2) this).modelColors[i_1806_] = (short) (i_1808_ << 10 | i_1809_ << 7 | i_1810_);
								if (((Class387_Sub2) this).aClass44_8105 != null)
									((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
							}
						}
					}
				}
				if (((Class387_Sub2) this).aClass52Array8148 != null) {
					for (int i_1811_ = 0; i_1811_ < ((Class387_Sub2) this).anInt8147; i_1811_++) {
						Class52 class52 = (((Class387_Sub2) this).aClass52Array8148[i_1811_]);
						Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[i_1811_]);
						((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_1812_ = 0; i_1812_ < i_1657_; i_1812_++) {
					int i_1813_ = is[i_1812_];
					if (i_1813_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_1814_ = (((Class387_Sub2) this).anIntArrayArray8150[i_1813_]);
						for (int i_1815_ = 0; i_1815_ < is_1814_.length; i_1815_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_1814_[i_1815_]]);
							((Class40) class40).anInt425 += i_1652_;
							((Class40) class40).anInt427 += i_1653_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_1816_ = 0; i_1816_ < i_1657_; i_1816_++) {
					int i_1817_ = is[i_1816_];
					if (i_1817_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_1818_ = (((Class387_Sub2) this).anIntArrayArray8150[i_1817_]);
						for (int i_1819_ = 0; i_1819_ < is_1818_.length; i_1819_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_1818_[i_1819_]]);
							((Class40) class40).anInt429 = ((Class40) class40).anInt429 * i_1652_ >> 7;
							((Class40) class40).anInt426 = ((Class40) class40).anInt426 * i_1653_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_1820_ = 0; i_1820_ < i_1657_; i_1820_++) {
					int i_1821_ = is[i_1820_];
					if (i_1821_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_1822_ = (((Class387_Sub2) this).anIntArrayArray8150[i_1821_]);
						for (int i_1823_ = 0; i_1823_ < is_1822_.length; i_1823_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_1822_[i_1823_]]);
							((Class40) class40).anInt424 = (((Class40) class40).anInt424 + i_1652_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void en(int i, int[] is, int i_1824_, int i_1825_, int i_1826_, boolean bool, int i_1827_, int[] is_1828_) {
		int i_1829_ = is.length;
		if (i == 0) {
			i_1824_ <<= 4;
			i_1825_ <<= 4;
			i_1826_ <<= 4;
			int i_1830_ = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (int i_1831_ = 0; i_1831_ < i_1829_; i_1831_++) {
				int i_1832_ = is[i_1831_];
				if (i_1832_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_1833_ = ((Class387_Sub2) this).anIntArrayArray8113[i_1832_];
					for (int i_1834_ = 0; i_1834_ < is_1833_.length; i_1834_++) {
						int i_1835_ = is_1833_[i_1834_];
						if (((Class387_Sub2) this).aShortArray8106 == null || (i_1827_ & (((Class387_Sub2) this).aShortArray8106[i_1835_])) != 0) {
							anInt8101 += (((Class387_Sub2) this).anIntArray8102[i_1835_]);
							anInt8111 += (((Class387_Sub2) this).anIntArray8110[i_1835_]);
							anInt8158 += (((Class387_Sub2) this).anIntArray8104[i_1835_]);
							i_1830_++;
						}
					}
				}
			}
			if (i_1830_ > 0) {
				anInt8101 = anInt8101 / i_1830_ + i_1824_;
				anInt8111 = anInt8111 / i_1830_ + i_1825_;
				anInt8158 = anInt8158 / i_1830_ + i_1826_;
				aBoolean8159 = true;
			} else {
				anInt8101 = i_1824_;
				anInt8111 = i_1825_;
				anInt8158 = i_1826_;
			}
		} else if (i == 1) {
			if (is_1828_ != null) {
				int i_1836_ = ((is_1828_[0] * i_1824_ + is_1828_[1] * i_1825_ + is_1828_[2] * i_1826_ + 8192) >> 14);
				int i_1837_ = ((is_1828_[3] * i_1824_ + is_1828_[4] * i_1825_ + is_1828_[5] * i_1826_ + 8192) >> 14);
				int i_1838_ = ((is_1828_[6] * i_1824_ + is_1828_[7] * i_1825_ + is_1828_[8] * i_1826_ + 8192) >> 14);
				i_1824_ = i_1836_;
				i_1825_ = i_1837_;
				i_1826_ = i_1838_;
			}
			i_1824_ <<= 4;
			i_1825_ <<= 4;
			i_1826_ <<= 4;
			for (int i_1839_ = 0; i_1839_ < i_1829_; i_1839_++) {
				int i_1840_ = is[i_1839_];
				if (i_1840_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
					int[] is_1841_ = ((Class387_Sub2) this).anIntArrayArray8113[i_1840_];
					for (int i_1842_ = 0; i_1842_ < is_1841_.length; i_1842_++) {
						int i_1843_ = is_1841_[i_1842_];
						if (((Class387_Sub2) this).aShortArray8106 == null || (i_1827_ & (((Class387_Sub2) this).aShortArray8106[i_1843_])) != 0) {
							((Class387_Sub2) this).anIntArray8102[i_1843_] += i_1824_;
							((Class387_Sub2) this).anIntArray8110[i_1843_] += i_1825_;
							((Class387_Sub2) this).anIntArray8104[i_1843_] += i_1826_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1828_ != null) {
				int i_1844_ = is_1828_[9] << 4;
				int i_1845_ = is_1828_[10] << 4;
				int i_1846_ = is_1828_[11] << 4;
				int i_1847_ = is_1828_[12] << 4;
				int i_1848_ = is_1828_[13] << 4;
				int i_1849_ = is_1828_[14] << 4;
				if (aBoolean8159) {
					int i_1850_ = ((is_1828_[0] * anInt8101 + is_1828_[3] * anInt8111 + is_1828_[6] * anInt8158 + 8192) >> 14);
					int i_1851_ = ((is_1828_[1] * anInt8101 + is_1828_[4] * anInt8111 + is_1828_[7] * anInt8158 + 8192) >> 14);
					int i_1852_ = ((is_1828_[2] * anInt8101 + is_1828_[5] * anInt8111 + is_1828_[8] * anInt8158 + 8192) >> 14);
					i_1850_ += i_1847_;
					i_1851_ += i_1848_;
					i_1852_ += i_1849_;
					anInt8101 = i_1850_;
					anInt8111 = i_1851_;
					anInt8158 = i_1852_;
					aBoolean8159 = false;
				}
				int[] is_1853_ = new int[9];
				int i_1854_ = Class257.anIntArray2684[i_1824_];
				int i_1855_ = Class257.anIntArray2683[i_1824_];
				int i_1856_ = Class257.anIntArray2684[i_1825_];
				int i_1857_ = Class257.anIntArray2683[i_1825_];
				int i_1858_ = Class257.anIntArray2684[i_1826_];
				int i_1859_ = Class257.anIntArray2683[i_1826_];
				int i_1860_ = i_1855_ * i_1858_ + 8192 >> 14;
				int i_1861_ = i_1855_ * i_1859_ + 8192 >> 14;
				is_1853_[0] = i_1856_ * i_1858_ + i_1857_ * i_1861_ + 8192 >> 14;
				is_1853_[1] = -i_1856_ * i_1859_ + i_1857_ * i_1860_ + 8192 >> 14;
				is_1853_[2] = i_1857_ * i_1854_ + 8192 >> 14;
				is_1853_[3] = i_1854_ * i_1859_ + 8192 >> 14;
				is_1853_[4] = i_1854_ * i_1858_ + 8192 >> 14;
				is_1853_[5] = -i_1855_;
				is_1853_[6] = -i_1857_ * i_1858_ + i_1856_ * i_1861_ + 8192 >> 14;
				is_1853_[7] = i_1857_ * i_1859_ + i_1856_ * i_1860_ + 8192 >> 14;
				is_1853_[8] = i_1856_ * i_1854_ + 8192 >> 14;
				int i_1862_ = ((is_1853_[0] * -anInt8101 + is_1853_[1] * -anInt8111 + is_1853_[2] * -anInt8158 + 8192) >> 14);
				int i_1863_ = ((is_1853_[3] * -anInt8101 + is_1853_[4] * -anInt8111 + is_1853_[5] * -anInt8158 + 8192) >> 14);
				int i_1864_ = ((is_1853_[6] * -anInt8101 + is_1853_[7] * -anInt8111 + is_1853_[8] * -anInt8158 + 8192) >> 14);
				int i_1865_ = i_1862_ + anInt8101;
				int i_1866_ = i_1863_ + anInt8111;
				int i_1867_ = i_1864_ + anInt8158;
				int[] is_1868_ = new int[9];
				for (int i_1869_ = 0; i_1869_ < 3; i_1869_++) {
					for (int i_1870_ = 0; i_1870_ < 3; i_1870_++) {
						int i_1871_ = 0;
						for (int i_1872_ = 0; i_1872_ < 3; i_1872_++)
							i_1871_ += (is_1853_[i_1869_ * 3 + i_1872_] * is_1828_[i_1870_ * 3 + i_1872_]);
						is_1868_[i_1869_ * 3 + i_1870_] = i_1871_ + 8192 >> 14;
					}
				}
				int i_1873_ = ((is_1853_[0] * i_1847_ + is_1853_[1] * i_1848_ + is_1853_[2] * i_1849_ + 8192) >> 14);
				int i_1874_ = ((is_1853_[3] * i_1847_ + is_1853_[4] * i_1848_ + is_1853_[5] * i_1849_ + 8192) >> 14);
				int i_1875_ = ((is_1853_[6] * i_1847_ + is_1853_[7] * i_1848_ + is_1853_[8] * i_1849_ + 8192) >> 14);
				i_1873_ += i_1865_;
				i_1874_ += i_1866_;
				i_1875_ += i_1867_;
				int[] is_1876_ = new int[9];
				for (int i_1877_ = 0; i_1877_ < 3; i_1877_++) {
					for (int i_1878_ = 0; i_1878_ < 3; i_1878_++) {
						int i_1879_ = 0;
						for (int i_1880_ = 0; i_1880_ < 3; i_1880_++)
							i_1879_ += (is_1828_[i_1877_ * 3 + i_1880_] * is_1868_[i_1878_ + i_1880_ * 3]);
						is_1876_[i_1877_ * 3 + i_1878_] = i_1879_ + 8192 >> 14;
					}
				}
				int i_1881_ = ((is_1828_[0] * i_1873_ + is_1828_[1] * i_1874_ + is_1828_[2] * i_1875_ + 8192) >> 14);
				int i_1882_ = ((is_1828_[3] * i_1873_ + is_1828_[4] * i_1874_ + is_1828_[5] * i_1875_ + 8192) >> 14);
				int i_1883_ = ((is_1828_[6] * i_1873_ + is_1828_[7] * i_1874_ + is_1828_[8] * i_1875_ + 8192) >> 14);
				i_1881_ += i_1844_;
				i_1882_ += i_1845_;
				i_1883_ += i_1846_;
				for (int i_1884_ = 0; i_1884_ < i_1829_; i_1884_++) {
					int i_1885_ = is[i_1884_];
					if (i_1885_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_1886_ = (((Class387_Sub2) this).anIntArrayArray8113[i_1885_]);
						for (int i_1887_ = 0; i_1887_ < is_1886_.length; i_1887_++) {
							int i_1888_ = is_1886_[i_1887_];
							if (((Class387_Sub2) this).aShortArray8106 == null || ((i_1827_ & (((Class387_Sub2) this).aShortArray8106[i_1888_])) != 0)) {
								int i_1889_ = (is_1876_[0] * (((Class387_Sub2) this).anIntArray8102[i_1888_]) + is_1876_[1] * (((Class387_Sub2) this).anIntArray8110[i_1888_]) + is_1876_[2] * (((Class387_Sub2) this).anIntArray8104[i_1888_]) + 8192) >> 14;
								int i_1890_ = (is_1876_[3] * (((Class387_Sub2) this).anIntArray8102[i_1888_]) + is_1876_[4] * (((Class387_Sub2) this).anIntArray8110[i_1888_]) + is_1876_[5] * (((Class387_Sub2) this).anIntArray8104[i_1888_]) + 8192) >> 14;
								int i_1891_ = (is_1876_[6] * (((Class387_Sub2) this).anIntArray8102[i_1888_]) + is_1876_[7] * (((Class387_Sub2) this).anIntArray8110[i_1888_]) + is_1876_[8] * (((Class387_Sub2) this).anIntArray8104[i_1888_]) + 8192) >> 14;
								i_1889_ += i_1881_;
								i_1890_ += i_1882_;
								i_1891_ += i_1883_;
								((Class387_Sub2) this).anIntArray8102[i_1888_] = i_1889_;
								((Class387_Sub2) this).anIntArray8110[i_1888_] = i_1890_;
								((Class387_Sub2) this).anIntArray8104[i_1888_] = i_1891_;
							}
						}
					}
				}
			} else {
				for (int i_1892_ = 0; i_1892_ < i_1829_; i_1892_++) {
					int i_1893_ = is[i_1892_];
					if (i_1893_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_1894_ = (((Class387_Sub2) this).anIntArrayArray8113[i_1893_]);
						for (int i_1895_ = 0; i_1895_ < is_1894_.length; i_1895_++) {
							int i_1896_ = is_1894_[i_1895_];
							if (((Class387_Sub2) this).aShortArray8106 == null || ((i_1827_ & (((Class387_Sub2) this).aShortArray8106[i_1896_])) != 0)) {
								((Class387_Sub2) this).anIntArray8102[i_1896_] -= anInt8101;
								((Class387_Sub2) this).anIntArray8110[i_1896_] -= anInt8111;
								((Class387_Sub2) this).anIntArray8104[i_1896_] -= anInt8158;
								if (i_1826_ != 0) {
									int i_1897_ = Class257.anIntArray2683[i_1826_];
									int i_1898_ = Class257.anIntArray2684[i_1826_];
									int i_1899_ = ((((Class387_Sub2) this).anIntArray8110[i_1896_]) * i_1897_ + ((((Class387_Sub2) this).anIntArray8102[i_1896_]) * i_1898_) + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8110[i_1896_] = ((((Class387_Sub2) this).anIntArray8110[i_1896_]) * i_1898_ - ((((Class387_Sub2) this).anIntArray8102[i_1896_]) * i_1897_) + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8102[i_1896_] = i_1899_;
								}
								if (i_1824_ != 0) {
									int i_1900_ = Class257.anIntArray2683[i_1824_];
									int i_1901_ = Class257.anIntArray2684[i_1824_];
									int i_1902_ = ((((Class387_Sub2) this).anIntArray8110[i_1896_]) * i_1901_ - ((((Class387_Sub2) this).anIntArray8104[i_1896_]) * i_1900_) + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8104[i_1896_] = ((((Class387_Sub2) this).anIntArray8110[i_1896_]) * i_1900_ + ((((Class387_Sub2) this).anIntArray8104[i_1896_]) * i_1901_) + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8110[i_1896_] = i_1902_;
								}
								if (i_1825_ != 0) {
									int i_1903_ = Class257.anIntArray2683[i_1825_];
									int i_1904_ = Class257.anIntArray2684[i_1825_];
									int i_1905_ = ((((Class387_Sub2) this).anIntArray8104[i_1896_]) * i_1903_ + ((((Class387_Sub2) this).anIntArray8102[i_1896_]) * i_1904_) + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8104[i_1896_] = ((((Class387_Sub2) this).anIntArray8104[i_1896_]) * i_1904_ - ((((Class387_Sub2) this).anIntArray8102[i_1896_]) * i_1903_) + 16383) >> 14;
									((Class387_Sub2) this).anIntArray8102[i_1896_] = i_1905_;
								}
								((Class387_Sub2) this).anIntArray8102[i_1896_] += anInt8101;
								((Class387_Sub2) this).anIntArray8110[i_1896_] += anInt8111;
								((Class387_Sub2) this).anIntArray8104[i_1896_] += anInt8158;
							}
						}
					}
				}
				if (bool) {
					for (int i_1906_ = 0; i_1906_ < i_1829_; i_1906_++) {
						int i_1907_ = is[i_1906_];
						if (i_1907_ < (((Class387_Sub2) this).anIntArrayArray8113).length) {
							int[] is_1908_ = (((Class387_Sub2) this).anIntArrayArray8113[i_1907_]);
							for (int i_1909_ = 0; i_1909_ < is_1908_.length; i_1909_++) {
								int i_1910_ = is_1908_[i_1909_];
								if ((((Class387_Sub2) this).aShortArray8106 == null) || ((i_1827_ & (((Class387_Sub2) this).aShortArray8106[i_1910_])) != 0)) {
									int i_1911_ = (((Class387_Sub2) this).anIntArray8143[i_1910_]);
									int i_1912_ = (((Class387_Sub2) this).anIntArray8143[i_1910_ + 1]);
									for (int i_1913_ = i_1911_; i_1913_ < i_1912_; i_1913_++) {
										int i_1914_ = ((((Class387_Sub2) this).aShortArray8144[i_1913_]) - 1);
										if (i_1914_ == -1)
											break;
										if (i_1826_ != 0) {
											int i_1915_ = (Class257.anIntArray2683[i_1826_]);
											int i_1916_ = (Class257.anIntArray2684[i_1826_]);
											int i_1917_ = (((((Class387_Sub2) this).aShortArray8109[i_1914_]) * i_1915_ + (((Class387_Sub2) this).aShortArray8108[i_1914_]) * i_1916_ + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8109[i_1914_] = (short) ((((((Class387_Sub2) this).aShortArray8109[i_1914_]) * i_1916_) - ((((Class387_Sub2) this).aShortArray8108[i_1914_]) * i_1915_) + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8108[i_1914_] = (short) i_1917_;
										}
										if (i_1824_ != 0) {
											int i_1918_ = (Class257.anIntArray2683[i_1824_]);
											int i_1919_ = (Class257.anIntArray2684[i_1824_]);
											int i_1920_ = (((((Class387_Sub2) this).aShortArray8109[i_1914_]) * i_1919_ - (((Class387_Sub2) this).aShortArray8095[i_1914_]) * i_1918_ + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8095[i_1914_] = (short) ((((((Class387_Sub2) this).aShortArray8109[i_1914_]) * i_1918_) + ((((Class387_Sub2) this).aShortArray8095[i_1914_]) * i_1919_) + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8109[i_1914_] = (short) i_1920_;
										}
										if (i_1825_ != 0) {
											int i_1921_ = (Class257.anIntArray2683[i_1825_]);
											int i_1922_ = (Class257.anIntArray2684[i_1825_]);
											int i_1923_ = (((((Class387_Sub2) this).aShortArray8095[i_1914_]) * i_1921_ + (((Class387_Sub2) this).aShortArray8108[i_1914_]) * i_1922_ + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8095[i_1914_] = (short) ((((((Class387_Sub2) this).aShortArray8095[i_1914_]) * i_1922_) - ((((Class387_Sub2) this).aShortArray8108[i_1914_]) * i_1921_) + 16383) >> 14);
											((Class387_Sub2) this).aShortArray8108[i_1914_] = (short) i_1923_;
										}
									}
								}
							}
						}
					}
					if (((Class387_Sub2) this).aClass44_8127 == null && ((Class387_Sub2) this).aClass44_8105 != null)
						((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
					if (((Class387_Sub2) this).aClass44_8127 != null)
						((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = null;
				}
			}
		} else if (i == 3) {
			if (is_1828_ != null) {
				int i_1924_ = is_1828_[9] << 4;
				int i_1925_ = is_1828_[10] << 4;
				int i_1926_ = is_1828_[11] << 4;
				int i_1927_ = is_1828_[12] << 4;
				int i_1928_ = is_1828_[13] << 4;
				int i_1929_ = is_1828_[14] << 4;
				if (aBoolean8159) {
					int i_1930_ = ((is_1828_[0] * anInt8101 + is_1828_[3] * anInt8111 + is_1828_[6] * anInt8158 + 8192) >> 14);
					int i_1931_ = ((is_1828_[1] * anInt8101 + is_1828_[4] * anInt8111 + is_1828_[7] * anInt8158 + 8192) >> 14);
					int i_1932_ = ((is_1828_[2] * anInt8101 + is_1828_[5] * anInt8111 + is_1828_[8] * anInt8158 + 8192) >> 14);
					i_1930_ += i_1927_;
					i_1931_ += i_1928_;
					i_1932_ += i_1929_;
					anInt8101 = i_1930_;
					anInt8111 = i_1931_;
					anInt8158 = i_1932_;
					aBoolean8159 = false;
				}
				int i_1933_ = i_1824_ << 15 >> 7;
				int i_1934_ = i_1825_ << 15 >> 7;
				int i_1935_ = i_1826_ << 15 >> 7;
				int i_1936_ = i_1933_ * -anInt8101 + 8192 >> 14;
				int i_1937_ = i_1934_ * -anInt8111 + 8192 >> 14;
				int i_1938_ = i_1935_ * -anInt8158 + 8192 >> 14;
				int i_1939_ = i_1936_ + anInt8101;
				int i_1940_ = i_1937_ + anInt8111;
				int i_1941_ = i_1938_ + anInt8158;
				int[] is_1942_ = new int[9];
				is_1942_[0] = i_1933_ * is_1828_[0] + 8192 >> 14;
				is_1942_[1] = i_1933_ * is_1828_[3] + 8192 >> 14;
				is_1942_[2] = i_1933_ * is_1828_[6] + 8192 >> 14;
				is_1942_[3] = i_1934_ * is_1828_[1] + 8192 >> 14;
				is_1942_[4] = i_1934_ * is_1828_[4] + 8192 >> 14;
				is_1942_[5] = i_1934_ * is_1828_[7] + 8192 >> 14;
				is_1942_[6] = i_1935_ * is_1828_[2] + 8192 >> 14;
				is_1942_[7] = i_1935_ * is_1828_[5] + 8192 >> 14;
				is_1942_[8] = i_1935_ * is_1828_[8] + 8192 >> 14;
				int i_1943_ = i_1933_ * i_1927_ + 8192 >> 14;
				int i_1944_ = i_1934_ * i_1928_ + 8192 >> 14;
				int i_1945_ = i_1935_ * i_1929_ + 8192 >> 14;
				i_1943_ += i_1939_;
				i_1944_ += i_1940_;
				i_1945_ += i_1941_;
				int[] is_1946_ = new int[9];
				for (int i_1947_ = 0; i_1947_ < 3; i_1947_++) {
					for (int i_1948_ = 0; i_1948_ < 3; i_1948_++) {
						int i_1949_ = 0;
						for (int i_1950_ = 0; i_1950_ < 3; i_1950_++)
							i_1949_ += (is_1828_[i_1947_ * 3 + i_1950_] * is_1942_[i_1948_ + i_1950_ * 3]);
						is_1946_[i_1947_ * 3 + i_1948_] = i_1949_ + 8192 >> 14;
					}
				}
				int i_1951_ = ((is_1828_[0] * i_1943_ + is_1828_[1] * i_1944_ + is_1828_[2] * i_1945_ + 8192) >> 14);
				int i_1952_ = ((is_1828_[3] * i_1943_ + is_1828_[4] * i_1944_ + is_1828_[5] * i_1945_ + 8192) >> 14);
				int i_1953_ = ((is_1828_[6] * i_1943_ + is_1828_[7] * i_1944_ + is_1828_[8] * i_1945_ + 8192) >> 14);
				i_1951_ += i_1924_;
				i_1952_ += i_1925_;
				i_1953_ += i_1926_;
				for (int i_1954_ = 0; i_1954_ < i_1829_; i_1954_++) {
					int i_1955_ = is[i_1954_];
					if (i_1955_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_1956_ = (((Class387_Sub2) this).anIntArrayArray8113[i_1955_]);
						for (int i_1957_ = 0; i_1957_ < is_1956_.length; i_1957_++) {
							int i_1958_ = is_1956_[i_1957_];
							if (((Class387_Sub2) this).aShortArray8106 == null || ((i_1827_ & (((Class387_Sub2) this).aShortArray8106[i_1958_])) != 0)) {
								int i_1959_ = (is_1946_[0] * (((Class387_Sub2) this).anIntArray8102[i_1958_]) + is_1946_[1] * (((Class387_Sub2) this).anIntArray8110[i_1958_]) + is_1946_[2] * (((Class387_Sub2) this).anIntArray8104[i_1958_]) + 8192) >> 14;
								int i_1960_ = (is_1946_[3] * (((Class387_Sub2) this).anIntArray8102[i_1958_]) + is_1946_[4] * (((Class387_Sub2) this).anIntArray8110[i_1958_]) + is_1946_[5] * (((Class387_Sub2) this).anIntArray8104[i_1958_]) + 8192) >> 14;
								int i_1961_ = (is_1946_[6] * (((Class387_Sub2) this).anIntArray8102[i_1958_]) + is_1946_[7] * (((Class387_Sub2) this).anIntArray8110[i_1958_]) + is_1946_[8] * (((Class387_Sub2) this).anIntArray8104[i_1958_]) + 8192) >> 14;
								i_1959_ += i_1951_;
								i_1960_ += i_1952_;
								i_1961_ += i_1953_;
								((Class387_Sub2) this).anIntArray8102[i_1958_] = i_1959_;
								((Class387_Sub2) this).anIntArray8110[i_1958_] = i_1960_;
								((Class387_Sub2) this).anIntArray8104[i_1958_] = i_1961_;
							}
						}
					}
				}
			} else {
				for (int i_1962_ = 0; i_1962_ < i_1829_; i_1962_++) {
					int i_1963_ = is[i_1962_];
					if (i_1963_ < ((Class387_Sub2) this).anIntArrayArray8113.length) {
						int[] is_1964_ = (((Class387_Sub2) this).anIntArrayArray8113[i_1963_]);
						for (int i_1965_ = 0; i_1965_ < is_1964_.length; i_1965_++) {
							int i_1966_ = is_1964_[i_1965_];
							if (((Class387_Sub2) this).aShortArray8106 == null || ((i_1827_ & (((Class387_Sub2) this).aShortArray8106[i_1966_])) != 0)) {
								((Class387_Sub2) this).anIntArray8102[i_1966_] -= anInt8101;
								((Class387_Sub2) this).anIntArray8110[i_1966_] -= anInt8111;
								((Class387_Sub2) this).anIntArray8104[i_1966_] -= anInt8158;
								((Class387_Sub2) this).anIntArray8102[i_1966_] = (((Class387_Sub2) this).anIntArray8102[i_1966_]) * i_1824_ >> 7;
								((Class387_Sub2) this).anIntArray8110[i_1966_] = (((Class387_Sub2) this).anIntArray8110[i_1966_]) * i_1825_ >> 7;
								((Class387_Sub2) this).anIntArray8104[i_1966_] = (((Class387_Sub2) this).anIntArray8104[i_1966_]) * i_1826_ >> 7;
								((Class387_Sub2) this).anIntArray8102[i_1966_] += anInt8101;
								((Class387_Sub2) this).anIntArray8110[i_1966_] += anInt8111;
								((Class387_Sub2) this).anIntArray8104[i_1966_] += anInt8158;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub2) this).anIntArrayArray8123 != null) {
				for (int i_1967_ = 0; i_1967_ < i_1829_; i_1967_++) {
					int i_1968_ = is[i_1967_];
					if (i_1968_ < ((Class387_Sub2) this).anIntArrayArray8123.length) {
						int[] is_1969_ = (((Class387_Sub2) this).anIntArrayArray8123[i_1968_]);
						for (int i_1970_ = 0; i_1970_ < is_1969_.length; i_1970_++) {
							int i_1971_ = is_1969_[i_1970_];
							if (((Class387_Sub2) this).aShortArray8124 == null || ((i_1827_ & (((Class387_Sub2) this).aShortArray8124[i_1971_])) != 0)) {
								int i_1972_ = (((((Class387_Sub2) this).aByteArray8136[i_1971_]) & 0xff) + i_1824_ * 8);
								if (i_1972_ < 0)
									i_1972_ = 0;
								else if (i_1972_ > 255)
									i_1972_ = 255;
								((Class387_Sub2) this).aByteArray8136[i_1971_] = (byte) i_1972_;
								if (((Class387_Sub2) this).aClass44_8105 != null)
									((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
							}
						}
					}
				}
				if (((Class387_Sub2) this).aClass52Array8148 != null) {
					for (int i_1973_ = 0; i_1973_ < ((Class387_Sub2) this).anInt8147; i_1973_++) {
						Class52 class52 = (((Class387_Sub2) this).aClass52Array8148[i_1973_]);
						Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[i_1973_]);
						((Class40) class40).anInt428 = (((Class40) class40).anInt428 & 0xffffff | 255 - ((((Class387_Sub2) this).aByteArray8136[((Class52) class52).modelColorIndex]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub2) this).anIntArrayArray8123 != null) {
				for (int i_1974_ = 0; i_1974_ < i_1829_; i_1974_++) {
					int i_1975_ = is[i_1974_];
					if (i_1975_ < ((Class387_Sub2) this).anIntArrayArray8123.length) {
						int[] is_1976_ = (((Class387_Sub2) this).anIntArrayArray8123[i_1975_]);
						for (int i_1977_ = 0; i_1977_ < is_1976_.length; i_1977_++) {
							int i_1978_ = is_1976_[i_1977_];
							if (((Class387_Sub2) this).aShortArray8124 == null || ((i_1827_ & (((Class387_Sub2) this).aShortArray8124[i_1978_])) != 0)) {
								int i_1979_ = ((((Class387_Sub2) this).modelColors[i_1978_]) & 0xffff);
								int i_1980_ = i_1979_ >> 10 & 0x3f;
								int i_1981_ = i_1979_ >> 7 & 0x7;
								int i_1982_ = i_1979_ & 0x7f;
								i_1980_ = i_1980_ + i_1824_ & 0x3f;
								i_1981_ += i_1825_ / 4;
								if (i_1981_ < 0)
									i_1981_ = 0;
								else if (i_1981_ > 7)
									i_1981_ = 7;
								i_1982_ += i_1826_;
								if (i_1982_ < 0)
									i_1982_ = 0;
								else if (i_1982_ > 127)
									i_1982_ = 127;
								((Class387_Sub2) this).modelColors[i_1978_] = (short) (i_1980_ << 10 | i_1981_ << 7 | i_1982_);
								if (((Class387_Sub2) this).aClass44_8105 != null)
									((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
							}
						}
					}
				}
				if (((Class387_Sub2) this).aClass52Array8148 != null) {
					for (int i_1983_ = 0; i_1983_ < ((Class387_Sub2) this).anInt8147; i_1983_++) {
						Class52 class52 = (((Class387_Sub2) this).aClass52Array8148[i_1983_]);
						Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[i_1983_]);
						((Class40) class40).anInt428 = (((Class40) class40).anInt428 & ~0xffffff | ((Console.colorArray[(((Class387_Sub2) this).modelColors[((Class52) class52).modelColorIndex]) & 0xffff]) & 0xffffff));
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_1984_ = 0; i_1984_ < i_1829_; i_1984_++) {
					int i_1985_ = is[i_1984_];
					if (i_1985_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_1986_ = (((Class387_Sub2) this).anIntArrayArray8150[i_1985_]);
						for (int i_1987_ = 0; i_1987_ < is_1986_.length; i_1987_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_1986_[i_1987_]]);
							((Class40) class40).anInt425 += i_1824_;
							((Class40) class40).anInt427 += i_1825_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_1988_ = 0; i_1988_ < i_1829_; i_1988_++) {
					int i_1989_ = is[i_1988_];
					if (i_1989_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_1990_ = (((Class387_Sub2) this).anIntArrayArray8150[i_1989_]);
						for (int i_1991_ = 0; i_1991_ < is_1990_.length; i_1991_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_1990_[i_1991_]]);
							((Class40) class40).anInt429 = ((Class40) class40).anInt429 * i_1824_ >> 7;
							((Class40) class40).anInt426 = ((Class40) class40).anInt426 * i_1825_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub2) this).anIntArrayArray8150 != null) {
				for (int i_1992_ = 0; i_1992_ < i_1829_; i_1992_++) {
					int i_1993_ = is[i_1992_];
					if (i_1993_ < ((Class387_Sub2) this).anIntArrayArray8150.length) {
						int[] is_1994_ = (((Class387_Sub2) this).anIntArrayArray8150[i_1993_]);
						for (int i_1995_ = 0; i_1995_ < is_1994_.length; i_1995_++) {
							Class40 class40 = (((Class387_Sub2) this).aClass40Array8149[is_1994_[i_1995_]]);
							((Class40) class40).anInt424 = (((Class40) class40).anInt424 + i_1824_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public void method4461(Class247 class247, Class80 class80, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (((Class387_Sub2) this).anInt8107 != 0) {
			Class249 class249 = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass249_8332);
			Class249 class249_1996_ = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass249_8430);
			Class249 class249_1997_ = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass249_8347);
			class249_1996_.method2508(class247);
			class249_1997_.method2510(class249_1996_);
			class249_1997_.method2483(((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aClass249_8422);
			if (!((Class387_Sub2) this).aBoolean8126)
				method4528();
			float[] fs = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloatArray8260);
			class249_1996_.method2511(0.0F, (float) (((Class387_Sub2) this).aShort8097), 0.0F, fs);
			float f = fs[0];
			float f_1998_ = fs[1];
			float f_1999_ = fs[2];
			class249_1996_.method2511(0.0F, (float) (((Class387_Sub2) this).aShort8100), 0.0F, fs);
			float f_2000_ = fs[0];
			float f_2001_ = fs[1];
			float f_2002_ = fs[2];
			for (int i_2003_ = 0; i_2003_ < 6; i_2003_++) {
				float[] fs_2004_ = (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloatArrayArray8303[i_2003_]);
				float f_2005_ = (fs_2004_[0] * f + fs_2004_[1] * f_1998_ + fs_2004_[2] * f_1999_ + fs_2004_[3] + (float) ((Class387_Sub2) this).anInt8134);
				float f_2006_ = (fs_2004_[0] * f_2000_ + fs_2004_[1] * f_2001_ + fs_2004_[2] * f_2002_ + fs_2004_[3] + (float) ((Class387_Sub2) this).anInt8134);
				if (f_2005_ < 0.0F && f_2006_ < 0.0F)
					return;
			}
			if (class80 != null) {
				boolean bool = false;
				boolean bool_2007_ = true;
				int i_2008_ = ((((Class387_Sub2) this).aShort8145 + ((Class387_Sub2) this).aShort8156) >> 1);
				int i_2009_ = ((((Class387_Sub2) this).aShort8140 + ((Class387_Sub2) this).aShort8141) >> 1);
				int i_2010_ = i_2008_;
				short i_2011_ = ((Class387_Sub2) this).aShort8097;
				int i_2012_ = i_2009_;
				float f_2013_ = (class249_1997_.aFloatArray2631[0] * (float) i_2010_ + class249_1997_.aFloatArray2631[4] * (float) i_2011_ + class249_1997_.aFloatArray2631[8] * (float) i_2012_ + class249_1997_.aFloatArray2631[12]);
				float f_2014_ = (class249_1997_.aFloatArray2631[1] * (float) i_2010_ + class249_1997_.aFloatArray2631[5] * (float) i_2011_ + class249_1997_.aFloatArray2631[9] * (float) i_2012_ + class249_1997_.aFloatArray2631[13]);
				float f_2015_ = (class249_1997_.aFloatArray2631[2] * (float) i_2010_ + class249_1997_.aFloatArray2631[6] * (float) i_2011_ + class249_1997_.aFloatArray2631[10] * (float) i_2012_ + class249_1997_.aFloatArray2631[14]);
				float f_2016_ = (class249_1997_.aFloatArray2631[3] * (float) i_2010_ + class249_1997_.aFloatArray2631[7] * (float) i_2011_ + class249_1997_.aFloatArray2631[11] * (float) i_2012_ + class249_1997_.aFloatArray2631[15]);
				if (f_2015_ >= -f_2016_) {
					class80.anInt669 = (int) ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloat8337) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338) * f_2013_ / f_2016_);
					class80.anInt670 = (int) ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloat8339) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8340) * f_2014_ / f_2016_);
				} else
					bool = true;
				i_2010_ = i_2008_;
				i_2011_ = ((Class387_Sub2) this).aShort8100;
				i_2012_ = i_2009_;
				float f_2017_ = (class249_1997_.aFloatArray2631[0] * (float) i_2010_ + class249_1997_.aFloatArray2631[4] * (float) i_2011_ + class249_1997_.aFloatArray2631[8] * (float) i_2012_ + class249_1997_.aFloatArray2631[12]);
				float f_2018_ = (class249_1997_.aFloatArray2631[1] * (float) i_2010_ + class249_1997_.aFloatArray2631[5] * (float) i_2011_ + class249_1997_.aFloatArray2631[9] * (float) i_2012_ + class249_1997_.aFloatArray2631[13]);
				float f_2019_ = (class249_1997_.aFloatArray2631[2] * (float) i_2010_ + class249_1997_.aFloatArray2631[6] * (float) i_2011_ + class249_1997_.aFloatArray2631[10] * (float) i_2012_ + class249_1997_.aFloatArray2631[14]);
				float f_2020_ = (class249_1997_.aFloatArray2631[3] * (float) i_2010_ + class249_1997_.aFloatArray2631[7] * (float) i_2011_ + class249_1997_.aFloatArray2631[11] * (float) i_2012_ + class249_1997_.aFloatArray2631[15]);
				if (f_2019_ >= -f_2020_) {
					class80.anInt668 = (int) ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloat8337) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338) * f_2017_ / f_2020_);
					class80.anInt672 = (int) ((((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aFloat8339) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8340) * f_2018_ / f_2020_);
				} else
					bool = true;
				if (bool) {
					if (f_2015_ < -f_2016_ && f_2019_ < -f_2020_)
						bool_2007_ = false;
					else if (f_2015_ < -f_2016_) {
						float f_2021_ = (f_2015_ + f_2016_) / (f_2019_ + f_2020_) - 1.0F;
						float f_2022_ = f_2013_ + f_2021_ * (f_2017_ - f_2013_);
						float f_2023_ = f_2014_ + f_2021_ * (f_2018_ - f_2014_);
						float f_2024_ = f_2016_ + f_2021_ * (f_2020_ - f_2016_);
						class80.anInt669 = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8337) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338 * f_2022_ / f_2024_));
						class80.anInt670 = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8339) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8340 * f_2023_ / f_2024_));
					} else if (f_2019_ < -f_2020_) {
						float f_2025_ = (f_2019_ + f_2020_) / (f_2015_ + f_2016_) - 1.0F;
						float f_2026_ = f_2017_ + f_2025_ * (f_2013_ - f_2017_);
						float f_2027_ = f_2018_ + f_2025_ * (f_2014_ - f_2018_);
						float f_2028_ = f_2020_ + f_2025_ * (f_2016_ - f_2020_);
						class80.anInt668 = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8337) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338 * f_2026_ / f_2028_));
						class80.anInt672 = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8339) + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8340 * f_2027_ / f_2028_));
					}
				}
				if (bool_2007_) {
					if (f_2015_ / f_2016_ > f_2019_ / f_2020_) {
						float f_2029_ = (f_2013_ + (class249.aFloatArray2631[0] * (float) ((Class387_Sub2) this).anInt8134) + class249.aFloatArray2631[12]);
						float f_2030_ = (f_2016_ + (class249.aFloatArray2631[3] * (float) ((Class387_Sub2) this).anInt8134) + class249.aFloatArray2631[15]);
						class80.anInt673 = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8337) - (float) class80.anInt669 + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338 * f_2029_ / f_2030_));
					} else {
						float f_2031_ = (f_2017_ + (class249.aFloatArray2631[0] * (float) ((Class387_Sub2) this).anInt8134) + class249.aFloatArray2631[12]);
						float f_2032_ = (f_2020_ + (class249.aFloatArray2631[3] * (float) ((Class387_Sub2) this).anInt8134) + class249.aFloatArray2631[15]);
						class80.anInt673 = (int) ((((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8337) - (float) class80.anInt668 + (((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aFloat8338 * f_2031_ / f_2032_));
					}
					class80.aBoolean671 = true;
				}
			}
			((Class387_Sub2) this).aClass_ra_Sub1_8092.method4840();
			((Class387_Sub2) this).aClass_ra_Sub1_8092.method4821(class249_1996_);
			method4520();
			((Class387_Sub2) this).aClass_ra_Sub1_8092.method4876();
			class249_1996_.method2483(((Class_ra_Sub1) (((Class387_Sub2) this).aClass_ra_Sub1_8092)).aClass249_8378);
			method4522(class249_1996_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	public void bt(int i) {
		int i_2033_ = Class257.anIntArray2683[i];
		int i_2034_ = Class257.anIntArray2684[i];
		for (int i_2035_ = 0; i_2035_ < ((Class387_Sub2) this).anInt8130; i_2035_++) {
			int i_2036_ = ((((Class387_Sub2) this).anIntArray8104[i_2035_] * i_2033_ + ((Class387_Sub2) this).anIntArray8102[i_2035_] * i_2034_) >> 14);
			((Class387_Sub2) this).anIntArray8104[i_2035_] = ((((Class387_Sub2) this).anIntArray8104[i_2035_] * i_2034_ - ((Class387_Sub2) this).anIntArray8102[i_2035_] * i_2033_) >> 14);
			((Class387_Sub2) this).anIntArray8102[i_2035_] = i_2036_;
		}
		for (int i_2037_ = 0; i_2037_ < ((Class387_Sub2) this).anInt8107; i_2037_++) {
			int i_2038_ = ((((Class387_Sub2) this).aShortArray8095[i_2037_] * i_2033_ + (((Class387_Sub2) this).aShortArray8108[i_2037_] * i_2034_)) >> 14);
			((Class387_Sub2) this).aShortArray8095[i_2037_] = (short) (((((Class387_Sub2) this).aShortArray8095[i_2037_] * i_2034_) - (((Class387_Sub2) this).aShortArray8108[i_2037_] * i_2033_)) >> 14);
			((Class387_Sub2) this).aShortArray8108[i_2037_] = (short) i_2038_;
		}
		if (((Class387_Sub2) this).aClass44_8127 == null && ((Class387_Sub2) this).aClass44_8105 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8105).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass44_8127 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8127).anInterface1_441 = null;
		if (((Class387_Sub2) this).aClass44_8125 != null)
			((Class44) ((Class387_Sub2) this).aClass44_8125).anInterface1_441 = null;
		((Class387_Sub2) this).aBoolean8126 = false;
	}

	public int cw() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).aShort8100;
	}

	public int N() {
		if (!((Class387_Sub2) this).aBoolean8126)
			method4528();
		return ((Class387_Sub2) this).anInt8134;
	}

	public Class93[] method4483() {
		return ((Class387_Sub2) this).aClass93Array8135;
	}

	public void method4465(Class247 class247) {
		Class249 class249 = (((Class_ra_Sub1) ((Class387_Sub2) this).aClass_ra_Sub1_8092).aClass249_8430);
		class249.method2508(class247);
		if (((Class387_Sub2) this).aClass93Array8135 != null) {
			for (int i = 0; i < ((Class387_Sub2) this).aClass93Array8135.length; i++) {
				Class93 class93 = ((Class387_Sub2) this).aClass93Array8135[i];
				Class93 class93_2039_ = class93;
				if (class93.aClass93_833 != null)
					class93_2039_ = class93.aClass93_833;
				class93_2039_.anInt838 = ((int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub2) this).anIntArray8102[class93.anInt841 * -1670679901])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub2) this).anIntArray8110[(class93.anInt841 * -1670679901)])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub2) this).anIntArray8104[(class93.anInt841 * -1670679901)])))) * 432673201);
				class93_2039_.anInt832 = ((int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub2) this).anIntArray8102[class93.anInt841 * -1670679901])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub2) this).anIntArray8110[(class93.anInt841 * -1670679901)])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub2) this).anIntArray8104[(class93.anInt841 * -1670679901)])))) * -1138862783);
				class93_2039_.anInt840 = ((int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub2) this).anIntArray8102[class93.anInt841 * -1670679901])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub2) this).anIntArray8110[(class93.anInt841 * -1670679901)])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub2) this).anIntArray8104[(class93.anInt841 * -1670679901)])))) * -555868357);
				class93_2039_.anInt837 = ((int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub2) this).anIntArray8102[class93.anInt835 * -614748507])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub2) this).anIntArray8110[(class93.anInt835 * -614748507)])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub2) this).anIntArray8104[(class93.anInt835 * -614748507)])))) * -707023853);
				class93_2039_.anInt842 = ((int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub2) this).anIntArray8102[class93.anInt835 * -614748507])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub2) this).anIntArray8110[(class93.anInt835 * -614748507)])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub2) this).anIntArray8104[(class93.anInt835 * -614748507)])))) * -648890367);
				class93_2039_.anInt845 = ((int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub2) this).anIntArray8102[class93.anInt835 * -614748507])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub2) this).anIntArray8110[(class93.anInt835 * -614748507)])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub2) this).anIntArray8104[(class93.anInt835 * -614748507)])))) * -1672139309);
				class93_2039_.anInt839 = (int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub2) this).anIntArray8102[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub2) this).anIntArray8110[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub2) this).anIntArray8104[(class93.anInt836 * -878748965)])))) * 488615051;
				class93_2039_.anInt844 = (int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub2) this).anIntArray8102[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub2) this).anIntArray8110[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub2) this).anIntArray8104[(class93.anInt836 * -878748965)])))) * 197668655;
				class93_2039_.anInt846 = (int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub2) this).anIntArray8102[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub2) this).anIntArray8110[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub2) this).anIntArray8104[(class93.anInt836 * -878748965)])))) * 471540135;
			}
		}
		if (((Class387_Sub2) this).aClass64Array8146 != null) {
			for (int i = 0; i < ((Class387_Sub2) this).aClass64Array8146.length; i++) {
				Class64 class64 = ((Class387_Sub2) this).aClass64Array8146[i];
				Class64 class64_2040_ = class64;
				if (class64.aClass64_562 != null)
					class64_2040_ = class64.aClass64_562;
				if (class64.aClass249_568 != null)
					class64.aClass249_568.method2510(class249);
				else
					class64.aClass249_568 = new Class249(class249);
				class64_2040_.anInt565 = ((int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub2) this).anIntArray8102[class64.anInt566 * 1669844747])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub2) this).anIntArray8110[(class64.anInt566 * 1669844747)])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub2) this).anIntArray8104[(class64.anInt566 * 1669844747)])))) * -686746519);
				class64_2040_.anInt563 = ((int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub2) this).anIntArray8102[class64.anInt566 * 1669844747])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub2) this).anIntArray8110[(class64.anInt566 * 1669844747)])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub2) this).anIntArray8104[(class64.anInt566 * 1669844747)])))) * -635472619);
				class64_2040_.anInt567 = ((int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub2) this).anIntArray8102[class64.anInt566 * 1669844747])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub2) this).anIntArray8110[(class64.anInt566 * 1669844747)])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub2) this).anIntArray8104[(class64.anInt566 * 1669844747)])))) * 1225142127);
			}
		}
	}

	Class387_Sub2(Class_ra_Sub1 class_ra_sub1) {
		((Class387_Sub2) this).anInt8115 = 0;
		((Class387_Sub2) this).anInt8130 = 0;
		((Class387_Sub2) this).anInt8107 = 0;
		((Class387_Sub2) this).anInt8089 = 0;
		((Class387_Sub2) this).anInt8116 = 0;
		((Class387_Sub2) this).aBoolean8132 = true;
		((Class387_Sub2) this).aBoolean8126 = false;
		((Class387_Sub2) this).aClass_ra_Sub1_8092 = class_ra_sub1;
		((Class387_Sub2) this).aClass44_8125 = new Class44(null, 5126, 3, 0);
		((Class387_Sub2) this).aClass44_8128 = new Class44(null, 5126, 2, 0);
		((Class387_Sub2) this).aClass44_8127 = new Class44(null, 5126, 3, 0);
		((Class387_Sub2) this).aClass44_8105 = new Class44(null, 5121, 4, 0);
		((Class387_Sub2) this).aClass37_8087 = new Class37();
	}
}
