/* Class354 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Class354 {
	static byte[] aByteArray3491;
	static Class499 aClass499_3492;
	protected static Class552 aClass552_3493;
	protected static int anInt3494;
	static short[] aShortArray3495;
	protected static Interface29 anInterface29_3496;
	public static Class330_Sub36_Sub12 aClass330_Sub36_Sub12_3497;
	protected static IndexTable aClass280_3498;
	static int[] anIntArray3499;
	protected static int anInt3500;
	protected static int anInt3501;
	protected static byte[][][] aByteArrayArrayArray3502;
	static byte[] aByteArray3503;
	static int[] anIntArray3504;
	static byte[] aByteArray3505;
	static byte[] aByteArray3506;
	public static float aFloat3507;
	protected static Class351 aClass351_3508;
	protected static Class471 aClass471_3509;
	public static int anInt3510;
	protected static int anInt3511;
	static Class497 aClass497_3512 = new Class497(16);
	protected static int anInt3513;
	protected static int anInt3514;
	protected static Class463 aClass463_3515;
	public static int anInt3516;
	static Class418 aClass418_3517;
	static byte[] aByteArray3518;
	static byte[] aByteArray3519;
	public static float aFloat3520;
	protected static int anInt3521;
	static ArrayList[][][] anArrayListArrayArrayArray3522;
	protected static int anInt3523;
	protected static int anInt3524;
	static Object[] anObjectArray3525;
	protected static int anInt3526;
	protected static int anInt3527;
	protected static int anInt3528;
	protected static Class380 aClass380_3529;
	protected static int anInt3530;

	public static Class472 method4082(int i, int i_0_) {
		Class472 class472 = new Class472();
		for (Class330_Sub36_Sub12 class330_sub36_sub12 = ((Class330_Sub36_Sub12) aClass497_3512.method6099((byte) -14)); class330_sub36_sub12 != null; class330_sub36_sub12 = ((Class330_Sub36_Sub12) aClass497_3512.method6098((short) -32768))) {
			if (((Class330_Sub36_Sub12) class330_sub36_sub12).aBoolean9713 && class330_sub36_sub12.method3480(i, i_0_, 186068006))
				class472.method5883(class330_sub36_sub12, -2014201527);
		}
		return class472;
	}

	public static Class330_Sub36_Sub12 method4083(int i) {
		return (Class330_Sub36_Sub12) aClass497_3512.method6094((long) i);
	}

	static void method4084(Class_ra class_ra, Buffer class330_sub46, int i, int i_1_, int i_2_, int i_3_, int[] is, int[] is_4_) {
		int i_5_ = class330_sub46.readUnsignedByte(1894579091);
		if ((i_5_ & 0x1) == 0) {
			boolean bool = (i_5_ & 0x2) == 0;
			int i_6_ = i_5_ >> 2 & 0x3f;
			if (i_6_ != 62) {
				if (i_6_ == 63)
					i_6_ = class330_sub46.readUnsignedByte(1222543454);
				else if (bool)
					i_6_ = is[i_6_];
				else
					i_6_ = is_4_[i_6_];
				if (bool) {
					aByteArray3503[i_2_ + i_3_ * anInt3524] = (byte) i_6_;
					aByteArray3518[i_2_ + i_3_ * anInt3524] = (byte) 0;
				} else {
					aByteArray3518[i_2_ + i_3_ * anInt3524] = (byte) i_6_;
					aByteArray3519[i_2_ + i_3_ * anInt3524] = (byte) 0;
					aByteArray3503[i_2_ + i_3_ * anInt3524] = class330_sub46.readByte((byte) -24);
				}
			}
		} else {
			int i_7_ = (i_5_ >> 1 & 0x3) + 1;
			boolean bool = (i_5_ & 0x8) != 0;
			boolean bool_8_ = (i_5_ & 0x10) != 0;
			for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
				int i_10_ = class330_sub46.readUnsignedByte(971991338);
				int i_11_ = 0;
				int i_12_ = 0;
				if (bool) {
					i_11_ = class330_sub46.readUnsignedByte(1500204813);
					i_12_ = class330_sub46.readUnsignedByte(1789880578);
				}
				int i_13_ = 0;
				if (bool_8_)
					i_13_ = class330_sub46.readUnsignedByte(70912409);
				if (i_9_ == 0) {
					aByteArray3503[i_2_ + i_3_ * anInt3524] = (byte) i_10_;
					aByteArray3518[i_2_ + i_3_ * anInt3524] = (byte) i_11_;
					aByteArray3519[i_2_ + i_3_ * anInt3524] = (byte) i_12_;
					if (i_13_ == 1) {
						anObjectArray3525[i_2_ + i_3_ * anInt3524] = new Integer(class330_sub46.readBigSmart(-1416659845));
						aByteArray3491[i_2_ + i_3_ * anInt3524] = class330_sub46.readByte((byte) 89);
					} else if (i_13_ > 1) {
						int[] is_14_ = new int[i_13_];
						byte[] is_15_ = new byte[i_13_];
						for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
							is_14_[i_16_] = class330_sub46.readBigSmart(-1172089841);
							is_15_[i_16_] = class330_sub46.readByte((byte) -75);
						}
						anObjectArray3525[i_2_ + i_3_ * anInt3524] = new Class330_Sub30(is_14_, is_15_);
					}
				} else {
					int[] is_17_ = null;
					byte[] is_18_ = null;
					if (i_13_ > 0) {
						is_17_ = new int[i_13_];
						is_18_ = new byte[i_13_];
						for (int i_19_ = 0; i_19_ < i_13_; i_19_++) {
							is_17_[i_19_] = class330_sub46.readBigSmart(-754013505);
							is_18_[i_19_] = class330_sub46.readByte((byte) 112);
						}
					}
					if ((anArrayListArrayArrayArray3522[i_9_ - 1][i - (anInt3510 >> 6)][i_1_ - (anInt3516 >> 6)]) == null)
						anArrayListArrayArrayArray3522[i_9_ - 1][i - (anInt3510 >> 6)][i_1_ - (anInt3516 >> 6)] = new ArrayList();
					Class322 class322 = new Class322(i_2_ & 0x3f, i_3_ & 0x3f, i_10_, i_11_, i_12_, is_17_, is_18_);
					anArrayListArrayArrayArray3522[i_9_ - 1][i - (anInt3510 >> 6)][i_1_ - (anInt3516 >> 6)].add(class322);
				}
			}
		}
	}

	static int method4085(Interface_ma interface_ma, int i, int i_20_, int i_21_) {
		Class425 class425 = aClass418_3517.method5271(i, -2022786456);
		if (class425 == null)
			return 0;
		int i_22_ = class425.anInt4331 * -946700571;
		if (i_22_ >= 0 && interface_ma.method221(i_22_, 1093520953).aBoolean533)
			i_22_ = -1;
		int i_23_;
		if (class425.anInt4340 * 2023656477 >= 0) {
			int i_24_ = class425.anInt4340 * 2023656477;
			int i_25_ = (i_24_ & 0x7f) + i_21_;
			if (i_25_ < 0)
				i_25_ = 0;
			else if (i_25_ > 127)
				i_25_ = 127;
			int i_26_ = (i_24_ + i_20_ & 0xfc00) + (i_24_ & 0x380) + i_25_;
			i_23_ = (~0xffffff | (Console.anIntArray4263[Class356.modifyColor(Class523.method6236(i_26_, 96, 1998005279), (byte) 1) & 0xffff]));
		} else if (i_22_ >= 0)
			i_23_ = (~0xffffff | (Console.anIntArray4263[Class356.modifyColor(Class523.method6236((interface_ma.method221(i_22_, 447964561).aShort523), 96, 1836836783), (byte) 1) & 0xffff]));
		else if (class425.anInt4330 * -865055911 == -1)
			i_23_ = 0;
		else {
			int i_27_ = class425.anInt4330 * -865055911;
			int i_28_ = (i_27_ & 0x7f) + i_21_;
			if (i_28_ < 0)
				i_28_ = 0;
			else if (i_28_ > 127)
				i_28_ = 127;
			int i_29_ = (i_27_ + i_20_ & 0xfc00) + (i_27_ & 0x380) + i_28_;
			i_23_ = (~0xffffff | (Console.anIntArray4263[Class356.modifyColor(Class523.method6236(i_29_, 96, 2017441943), (byte) 1) & 0xffff]));
		}
		return i_23_;
	}

	public static byte[] getBytesFromFile(File file) {
		try {
			InputStream is = new FileInputStream(file);

			long length = file.length();

			if (length > Integer.MAX_VALUE) {
				// File is too large
			}

			byte[] bytes = new byte[(int) length];

			int offset = 0;
			int numRead = 0;
			while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
				offset += numRead;
			}

			if (offset < bytes.length) {
				is.close();
				throw new IOException("Could not completely read file " + file.getName());
			}

			is.close();
			return bytes;
		} catch (Exception e) {
			return null;
		}
	}

	static void loadMap(Class_ra class_ra, int i, int i_30_) {
		Buffer buf = null;
		if (aClass330_Sub36_Sub12_3497.mapLocation.equals("main")) {
			try {
				DataInputStream in = new DataInputStream(Loader.class.getResourceAsStream("main_area.dat"));
				byte[] data = new byte[in.available()];
				in.readFully(data);
				buf = new Buffer(data);
			} catch (Exception e) {
				buf = new Buffer(aClass280_3498.method2780(aClass330_Sub36_Sub12_3497.mapLocation, "area"));
			}
		} else {
			buf = new Buffer(aClass280_3498.method2780(aClass330_Sub36_Sub12_3497.mapLocation, "area"));
		}
		int i_31_ = buf.readUnsignedByte(153066050);
		int[] is = new int[i_31_];
		for (int i_32_ = 0; i_32_ < i_31_; i_32_++)
			is[i_32_] = buf.readUnsignedByte(1525859959);
		int i_33_ = buf.readUnsignedByte(1763654871);
		int[] is_34_ = new int[i_33_];
		for (int i_35_ = 0; i_35_ < i_33_; i_35_++)
			is_34_[i_35_] = buf.readUnsignedByte(665850047);
		while (buf.offset * -824785231 < buf.payload.length) {
			if (buf.readUnsignedByte(-110501283) == 0) {
				int i_36_ = buf.readUnsignedByte(1940128613);
				int i_37_ = buf.readUnsignedByte(31366818);
				for (int i_38_ = 0; i_38_ < 64; i_38_++) {
					for (int i_39_ = 0; i_39_ < 64; i_39_++) {
						int i_40_ = i_36_ * 64 + i_38_ - anInt3510;
						int i_41_ = i_37_ * 64 + i_39_ - anInt3516;
						method4084(class_ra, buf, i_36_, i_37_, i_40_, i_41_, is, is_34_);
					}
				}
			} else {
				int i_42_ = buf.readUnsignedByte(270237170);
				int i_43_ = buf.readUnsignedByte(-207237399);
				int i_44_ = buf.readUnsignedByte(2058177858);
				int i_45_ = buf.readUnsignedByte(148329398);
				for (int i_46_ = 0; i_46_ < 8; i_46_++) {
					for (int i_47_ = 0; i_47_ < 8; i_47_++) {
						int i_48_ = i_42_ * 64 + i_44_ * 8 + i_46_ - anInt3510;
						int i_49_ = i_43_ * 64 + i_45_ * 8 + i_47_ - anInt3516;
						method4084(class_ra, buf, i_42_, i_43_, i_48_, i_49_, is, is_34_);
					}
				}
			}
		}
		Object object = null;
		aByteArray3506 = new byte[anInt3524 * anInt3513];
		aShortArray3495 = new short[anInt3524 * anInt3513];
		for (int i_50_ = 0; i_50_ < 3; i_50_++) {
			byte[] is_51_ = new byte[anInt3524 * anInt3513];
			for (int i_52_ = 0; i_52_ < anArrayListArrayArrayArray3522[i_50_].length; i_52_++) {
				for (int i_53_ = 0; i_53_ < anArrayListArrayArrayArray3522[i_50_][0].length; i_53_++) {
					ArrayList arraylist = anArrayListArrayArrayArray3522[i_50_][i_52_][i_53_];
					if (arraylist != null) {
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class322 class322 = (Class322) iterator.next();
							is_51_[(i_52_ * 64 + ((Class322) class322).aByte3293 + ((i_53_ * 64 + ((Class322) class322).aByte3294) * anInt3524))] = (byte) ((Class322) class322).anInt3291;
						}
					}
				}
			}
			method4088(is_51_, aByteArray3506, aShortArray3495, i, i_30_);
			for (int i_54_ = 0; i_54_ < anArrayListArrayArrayArray3522[i_50_].length; i_54_++) {
				for (int i_55_ = 0; i_55_ < anArrayListArrayArrayArray3522[i_50_][0].length; i_55_++) {
					ArrayList arraylist = anArrayListArrayArrayArray3522[i_50_][i_54_][i_55_];
					if (arraylist != null) {
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class322 class322 = (Class322) iterator.next();
							int i_56_ = (i_54_ * 64 + ((Class322) class322).aByte3293 + ((i_55_ * 64 + ((Class322) class322).aByte3294) * anInt3524));
							((Class322) class322).anInt3291 = ((aByteArray3506[i_56_] & 0xff) << 16 | aShortArray3495[i_56_] & 0xffff);
							if (((Class322) class322).anInt3291 != 0)
								((Class322) class322).anInt3291 |= ~0xffffff;
						}
					}
				}
			}
		}
		method4088(aByteArray3503, aByteArray3506, aShortArray3495, i, i_30_);
		aByteArray3503 = null;
		method4087();
	}

	static void method4087() {
		for (int i = 0; i < anInt3524; i++) {
			for (int i_57_ = 0; i_57_ < anInt3513; i_57_++) {
				Object object = anObjectArray3525[i + i_57_ * anInt3524];
				if (object != null) {
					if (object instanceof Class330_Sub30) {
						Class330_Sub30 class330_sub30 = (Class330_Sub30) object;
						if (class330_sub30 != null) {
							for (int i_58_ = 0; i_58_ < (((Class330_Sub30) class330_sub30).anIntArray7722).length; i_58_++) {
								Class473 class473 = (aClass463_3515.method5705((((Class330_Sub30) class330_sub30).anIntArray7722[i_58_]), (byte) -11));
								int i_59_ = class473.anInt5651 * 1552992833;
								if (class473.anIntArray5678 != null) {
									class473 = (class473.method5900(anInterface29_3496, (byte) -4));
									if (class473 != null)
										i_59_ = class473.anInt5651 * 1552992833;
								}
								if (i_59_ != -1) {
									Class330_Sub38 class330_sub38 = new Class330_Sub38(i_59_);
									class330_sub38.anInt7756 = i * -1209095383;
									class330_sub38.anInt7753 = i_57_ * -1480575289;
									aClass471_3509.method5878(class330_sub38, (short) 8192);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						Class473 class473 = aClass463_3515.method5705(integer.intValue(), (byte) 19);
						int i_60_ = class473.anInt5651 * 1552992833;
						if (class473.anIntArray5678 != null) {
							class473 = class473.method5900(anInterface29_3496, (byte) 67);
							if (class473 != null)
								i_60_ = class473.anInt5651 * 1552992833;
						}
						if (i_60_ != -1) {
							Class330_Sub38 class330_sub38 = new Class330_Sub38(i_60_);
							class330_sub38.anInt7756 = i * -1209095383;
							class330_sub38.anInt7753 = i_57_ * -1480575289;
							aClass471_3509.method5878(class330_sub38, (short) 8192);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_61_ = 0; i_61_ < anArrayListArrayArrayArray3522[0].length; i_61_++) {
				for (int i_62_ = 0; i_62_ < anArrayListArrayArrayArray3522[0][0].length; i_62_++) {
					ArrayList arraylist = anArrayListArrayArrayArray3522[i][i_61_][i_62_];
					if (arraylist != null) {
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class322 class322 = (Class322) iterator.next();
							if (((Class322) class322).anIntArray3296 != null) {
								for (int i_63_ = 0; i_63_ < (((Class322) class322).anIntArray3296).length; i_63_++) {
									Class473 class473 = (aClass463_3515.method5705((((Class322) class322).anIntArray3296[i_63_]), (byte) -119));
									int i_64_ = class473.anInt5651 * 1552992833;
									if (class473.anIntArray5678 != null) {
										class473 = (class473.method5900(anInterface29_3496, (byte) -40));
										if (class473 != null)
											i_64_ = (class473.anInt5651 * 1552992833);
									}
									if (i_64_ != -1) {
										Class330_Sub38 class330_sub38 = new Class330_Sub38(i_64_);
										class330_sub38.anInt7756 = ((i_61_ + (anInt3510 >> 6)) * 64 + (((Class322) class322).aByte3293) - anInt3510) * -1209095383;
										class330_sub38.anInt7753 = ((i_62_ + (anInt3516 >> 6)) * 64 + (((Class322) class322).aByte3294) - anInt3516) * -1480575289;
										aClass471_3509.method5878(class330_sub38, (short) 8192);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method4088(byte[] is, byte[] is_65_, short[] is_66_, int i, int i_67_) {
		int[] is_68_ = new int[anInt3513];
		int[] is_69_ = new int[anInt3513];
		int[] is_70_ = new int[anInt3513];
		int[] is_71_ = new int[anInt3513];
		int[] is_72_ = new int[anInt3513];
		for (int i_73_ = -5; i_73_ < anInt3524; i_73_++) {
			int i_74_ = i_73_ + 5;
			int i_75_ = i_73_ - 5;
			for (int i_76_ = 0; i_76_ < anInt3513; i_76_++) {
				if (i_74_ < anInt3524) {
					int i_77_ = is[i_74_ + i_76_ * anInt3524] & 0xff;
					if (i_77_ > 0) {
						Class491 class491 = aClass499_3492.method6111(i_77_ - 1, -1294922636);
						is_68_[i_76_] += class491.anInt5855 * 373696947;
						is_69_[i_76_] += class491.anInt5861 * -1366776891;
						is_70_[i_76_] += class491.anInt5862 * -2143339753;
						is_71_[i_76_] += class491.anInt5863 * -201962627;
						is_72_[i_76_]++;
					}
				}
				if (i_75_ >= 0) {
					int i_78_ = is[i_75_ + i_76_ * anInt3524] & 0xff;
					if (i_78_ > 0) {
						Class491 class491 = aClass499_3492.method6111(i_78_ - 1, -641967869);
						is_68_[i_76_] -= class491.anInt5855 * 373696947;
						is_69_[i_76_] -= class491.anInt5861 * -1366776891;
						is_70_[i_76_] -= class491.anInt5862 * -2143339753;
						is_71_[i_76_] -= class491.anInt5863 * -201962627;
						is_72_[i_76_]--;
					}
				}
			}
			if (i_73_ >= 0) {
				int i_79_ = 0;
				int i_80_ = 0;
				int i_81_ = 0;
				int i_82_ = 0;
				int i_83_ = 0;
				for (int i_84_ = -5; i_84_ < anInt3513; i_84_++) {
					int i_85_ = i_84_ + 5;
					if (i_85_ < anInt3513) {
						i_79_ += is_68_[i_85_];
						i_80_ += is_69_[i_85_];
						i_81_ += is_70_[i_85_];
						i_82_ += is_71_[i_85_];
						i_83_ += is_72_[i_85_];
					}
					int i_86_ = i_84_ - 5;
					if (i_86_ >= 0) {
						i_79_ -= is_68_[i_86_];
						i_80_ -= is_69_[i_86_];
						i_81_ -= is_70_[i_86_];
						i_82_ -= is_71_[i_86_];
						i_83_ -= is_72_[i_86_];
					}
					if (i_84_ >= 0 && i_83_ > 0) {
						if ((is[i_73_ + i_84_ * anInt3524] & 0xff) == 0) {
							int i_87_ = i_73_ + i_84_ * anInt3524;
							is_65_[i_87_] = (byte) 0;
							is_66_[i_87_] = (short) 0;
						} else {
							int i_88_ = (i_82_ == 0 ? 0 : Class230.method2338(i_79_ * 256 / i_82_, i_80_ / i_83_, i_81_ / i_83_, 816171094));
							int i_89_ = (i_88_ & 0x7f) + i_67_;
							if (i_89_ < 0)
								i_89_ = 0;
							else if (i_89_ > 127)
								i_89_ = 127;
							int i_90_ = ((i_88_ + i & 0xfc00) + (i_88_ & 0x380) + i_89_);
							int i_91_ = i_73_ + i_84_ * anInt3524;
							int i_92_ = (Console.anIntArray4263[(Class356.modifyColor(Class220.method2264(i_90_, 96, 49356574), (byte) 1)) & 0xffff]);
							is_65_[i_91_] = (byte) (i_92_ >> 16 & 0xff);
							is_66_[i_91_] = (short) (i_92_ & 0xffff);
						}
					}
				}
			}
		}
	}

	static void method4089() {
		int[] is = new int[3];
		for (int i = 0; i < aClass351_3508.anInt3479 * 733593777; i++) {
			boolean bool = (aClass330_Sub36_Sub12_3497.method3484(aClass351_3508.anIntArray3480[i] >> 28 & 0x3, aClass351_3508.anIntArray3480[i] >> 14 & 0x3fff, aClass351_3508.anIntArray3480[i] & 0x3fff, is, (byte) -60));
			if (bool) {
				Class330_Sub38 class330_sub38 = new Class330_Sub38(aClass351_3508.anIntArray3481[i]);
				class330_sub38.anInt7756 = (is[1] - anInt3510) * -1209095383;
				class330_sub38.anInt7753 = (is[2] - anInt3516) * -1480575289;
				aClass471_3509.method5878(class330_sub38, (short) 8192);
			}
		}
	}

	static void method4090(int i, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_) {
		anInt3523 = i - anInt3510;
		anInt3494 = i_93_ - anInt3516;
		anInt3514 = i_94_ - anInt3510;
		anInt3526 = i_95_ - anInt3516;
		anInt3527 = i_96_;
		anInt3528 = i_97_;
		anInt3511 = i_98_;
		anInt3530 = i_99_;
	}

	static void method4091(Class_ra class_ra) {
		int i = anInt3514 - anInt3523;
		int i_100_ = anInt3494 - anInt3526;
		int i_101_ = (anInt3511 - anInt3527 << 16) / i;
		int i_102_ = (anInt3530 - anInt3528 << 16) / i_100_;
		method4092(class_ra, i_101_, i_102_, 0, 0);
	}

	static void method4092(Class_ra class_ra, int i, int i_103_, int i_104_, int i_105_) {
		int i_106_ = anInt3514 - anInt3523;
		int i_107_ = anInt3494 - anInt3526;
		if (anInt3514 < anInt3524)
			i_106_++;
		if (anInt3494 < anInt3513)
			i_107_++;
		for (int i_108_ = 0; i_108_ < i_106_; i_108_++) {
			int i_109_ = (i_104_ + i * i_108_ >> 16) + anInt3527;
			int i_110_ = (i_104_ + i * (i_108_ + 1) >> 16) + anInt3527;
			int i_111_ = i_110_ - i_109_;
			if (i_111_ > 0) {
				int i_112_ = anInt3523 + i_108_;
				if (i_112_ < 0 || i_112_ >= anInt3524) {
					for (int i_113_ = 0; i_113_ < i_107_; i_113_++) {
						int i_114_ = (anInt3530 - (i_105_ + i_103_ * (i_113_ + 1) >> 16));
						int i_115_ = anInt3530 - (i_105_ + i_103_ * i_113_ >> 16);
						int i_116_ = i_115_ - i_114_;
						int i_117_;
						if (((Class330_Sub36_Sub12) aClass330_Sub36_Sub12_3497).anInt9707 * 2074159051 != -1)
							i_117_ = ~0xffffff | (((Class330_Sub36_Sub12) aClass330_Sub36_Sub12_3497).anInt9707) * 2074159051;
						else if ((i_108_ + anInt3523 & 0x4) != (i_113_ + anInt3494 & 0x4))
							i_117_ = -11840664;
						else
							i_117_ = anIntArray3499[(aClass418_3517.anInt4294 * -1703080475) + 1];
						if (i_117_ == 0)
							i_117_ = -16777216;
						class_ra.B(i_109_, i_114_, i_111_, i_116_, i_117_, 0);
					}
				} else {
					for (int i_118_ = 0; i_118_ < i_107_; i_118_++) {
						int i_119_ = (anInt3530 - (i_105_ + i_103_ * (i_118_ + 1) >> 16));
						int i_120_ = anInt3530 - (i_105_ + i_103_ * i_118_ >> 16);
						int i_121_ = i_120_ - i_119_;
						if (i_121_ > 0) {
							int i_122_ = i_118_ + anInt3526;
							int i_123_ = i_112_ + i_122_ * anInt3524;
							int i_124_ = 0;
							int i_125_ = 0;
							Object object = null;
							if (i_122_ >= 0 && i_122_ < anInt3513) {
								i_124_ = ((aByteArray3506[i_123_] & 0xff) << 16 | aShortArray3495[i_123_] & 0xffff);
								if (i_124_ != 0)
									i_124_ |= ~0xffffff;
								i_125_ = aByteArray3518[i_123_] & 0xff;
								object = anObjectArray3525[i_123_];
							}
							if (i_124_ == 0 && i_125_ == 0 && object == null) {
								if ((((Class330_Sub36_Sub12) aClass330_Sub36_Sub12_3497).anInt9707 * 2074159051) != -1)
									i_124_ = (~0xffffff | (((Class330_Sub36_Sub12) aClass330_Sub36_Sub12_3497).anInt9707) * 2074159051);
								else if ((i_108_ + anInt3523 & 0x4) != (i_118_ + anInt3494 & 0x4))
									i_124_ = -11840664;
								else
									i_124_ = (anIntArray3499[(aClass418_3517.anInt4294 * -1703080475) + 1]);
								if (i_124_ == 0)
									i_124_ = -16777216;
								class_ra.B(i_109_, i_119_, i_111_, i_121_, i_124_, 0);
							} else if (object != null) {
								if (object instanceof Class330_Sub30) {
									Class330_Sub30 class330_sub30 = (Class330_Sub30) object;
									if (class330_sub30 != null)
										method4093(class_ra, i_109_, i_119_, i_111_, i_121_, i_124_, i_125_, aByteArray3519[i_123_], (((Class330_Sub30) class330_sub30).anIntArray7722), (((Class330_Sub30) class330_sub30).aByteArray7721), true);
								} else {
									Integer integer = (Integer) object;
									anIntArray3504[0] = integer.intValue();
									aByteArray3505[0] = aByteArray3491[i_123_];
									method4093(class_ra, i_109_, i_119_, i_111_, i_121_, i_124_, i_125_, aByteArray3519[i_123_], anIntArray3504, aByteArray3505, true);
								}
							} else
								method4093(class_ra, i_109_, i_119_, i_111_, i_121_, i_124_, i_125_, aByteArray3519[i_123_], null, null, true);
						}
					}
				}
			}
		}
		for (int i_126_ = -16; i_126_ < i_106_ + 16; i_126_++) {
			int i_127_ = (i_104_ + i * i_126_ >> 16) + anInt3527;
			int i_128_ = (i_104_ + i * (i_126_ + 1) >> 16) + anInt3527;
			int i_129_ = i_128_ - i_127_;
			if (i_129_ > 0) {
				int i_130_ = i_126_ + anInt3523;
				if (i_130_ >= 0 && i_130_ < anInt3524) {
					for (int i_131_ = -16; i_131_ < i_107_ + 16; i_131_++) {
						int i_132_ = (anInt3530 - (i_105_ + i_103_ * (i_131_ + 1) >> 16));
						int i_133_ = anInt3530 - (i_105_ + i_103_ * i_131_ >> 16);
						int i_134_ = i_133_ - i_132_;
						if (i_134_ > 0) {
							int i_135_ = i_131_ + anInt3526;
							if (i_135_ >= 0 && i_135_ < anInt3513) {
								Object object = (anObjectArray3525[i_130_ + i_135_ * anInt3524]);
								if (object != null) {
									if (object instanceof Class330_Sub30) {
										Class330_Sub30 class330_sub30 = (Class330_Sub30) object;
										if (class330_sub30 != null)
											method4094(class_ra, i_127_, i_132_, i_129_, i_134_, (((Class330_Sub30) class330_sub30).anIntArray7722), (((Class330_Sub30) class330_sub30).aByteArray7721));
									} else {
										Integer integer = (Integer) object;
										anIntArray3504[0] = integer.intValue();
										aByteArray3505[0] = (aByteArray3491[i_130_ + i_135_ * anInt3524]);
										method4094(class_ra, i_127_, i_132_, i_129_, i_134_, anIntArray3504, aByteArray3505);
									}
								} else
									method4094(class_ra, i_127_, i_132_, i_129_, i_134_, null, null);
							}
						}
					}
				}
			}
		}
		int i_136_ = anInt3523 >> 6;
		int i_137_ = anInt3526 >> 6;
		if (i_136_ < 0)
			i_136_ = 0;
		if (i_137_ < 0)
			i_137_ = 0;
		int i_138_ = anInt3514 >> 6;
		int i_139_ = anInt3494 >> 6;
		if (i_138_ >= anArrayListArrayArrayArray3522[0].length)
			i_138_ = anArrayListArrayArrayArray3522[0].length - 1;
		if (i_139_ >= anArrayListArrayArrayArray3522[0][0].length)
			i_139_ = anArrayListArrayArrayArray3522[0][0].length - 1;
		for (int i_140_ = 0; i_140_ < 3; i_140_++) {
			for (int i_141_ = i_136_; i_141_ <= i_138_; i_141_++) {
				for (int i_142_ = i_137_; i_142_ <= i_139_; i_142_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3522[i_140_][i_141_][i_142_]);
					if (arraylist != null) {
						int i_143_ = (i_141_ + (anInt3510 >> 6)) * 64;
						int i_144_ = (i_142_ + (anInt3516 >> 6)) * 64;
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class322 class322 = (Class322) iterator.next();
							int i_145_ = (i_143_ + ((Class322) class322).aByte3293 - anInt3510 - anInt3523);
							int i_146_ = (i_144_ + ((Class322) class322).aByte3294 - anInt3516 - anInt3526);
							int i_147_ = (i_104_ + i * i_145_ >> 16) + anInt3527;
							int i_148_ = ((i_104_ + i * (i_145_ + 1) >> 16) + anInt3527);
							int i_149_ = (anInt3530 - (i_105_ + i_103_ * (i_146_ + 1) >> 16));
							int i_150_ = anInt3530 - (i_105_ + i_103_ * i_146_ >> 16);
							method4093(class_ra, i_147_, i_149_, i_148_ - i_147_, i_150_ - i_149_, ((Class322) class322).anInt3291, ((Class322) class322).aByte3292 & 0xff, ((Class322) class322).aByte3295, ((Class322) class322).anIntArray3296, ((Class322) class322).aByteArray3297, false);
						}
					}
				}
			}
			for (int i_151_ = i_136_; i_151_ <= i_138_; i_151_++) {
				for (int i_152_ = i_137_; i_152_ <= i_139_; i_152_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3522[i_140_][i_151_][i_152_]);
					if (arraylist != null) {
						int i_153_ = (i_151_ + (anInt3510 >> 6)) * 64;
						int i_154_ = (i_152_ + (anInt3516 >> 6)) * 64;
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class322 class322 = (Class322) iterator.next();
							int i_155_ = (i_153_ + ((Class322) class322).aByte3293 - anInt3510 - anInt3523);
							int i_156_ = (i_154_ + ((Class322) class322).aByte3294 - anInt3516 - anInt3526);
							int i_157_ = (i_104_ + i * i_155_ >> 16) + anInt3527;
							int i_158_ = ((i_104_ + i * (i_155_ + 1) >> 16) + anInt3527);
							int i_159_ = (anInt3530 - (i_105_ + i_103_ * (i_156_ + 1) >> 16));
							int i_160_ = anInt3530 - (i_105_ + i_103_ * i_156_ >> 16);
							method4094(class_ra, i_157_, i_159_, i_158_ - i_157_, i_160_ - i_159_, ((Class322) class322).anIntArray3296, ((Class322) class322).aByteArray3297);
						}
					}
				}
			}
		}
	}

	static void method4093(Class_ra class_ra, int i, int i_161_, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_, int[] is, byte[] is_167_, boolean bool) {
		if (bool || i_164_ != 0 || i_165_ > 0) {
			if (i_165_ == 0)
				class_ra.B(i, i_161_, i_162_, i_163_, i_164_, 0);
			else {
				int i_168_ = i_166_ & 0x3f;
				if (i_168_ == 0 || i_162_ <= 1 || i_163_ <= 1) {
					int i_169_ = anIntArray3499[i_165_];
					if (bool || i_169_ != 0)
						class_ra.B(i, i_161_, i_162_, i_163_, i_169_, 0);
				} else {
					int i_170_ = bool ? 0 : 1;
					Class464_Sub21.method5812(class_ra, aByteArrayArrayArray3502, anInt3521, i, i_161_, i_164_, anIntArray3499[i_165_], i_162_, i_163_, i_168_, i_166_ >> 6 & 0x3, i_170_, (byte) 13);
				}
			}
		}
		if (is != null) {
			int i_171_;
			if (i_162_ == 1)
				i_171_ = i;
			else
				i_171_ = i + i_162_ - 1;
			int i_172_;
			if (i_163_ == 1)
				i_172_ = i_161_;
			else
				i_172_ = i_161_ + i_163_ - 1;
			for (int i_173_ = 0; i_173_ < is.length; i_173_++) {
				int i_174_ = is_167_[i_173_] & 0x3f;
				if (i_174_ == Class476.aClass476_6883.anInt6882 * -344921723 || i_174_ == Class476.aClass476_6880.anInt6882 * -344921723 || i_174_ == Class476.aClass476_6881.anInt6882 * -344921723 || (i_174_ == Class476.aClass476_6902.anInt6882 * -344921723)) {
					Class473 class473 = aClass463_3515.method5705(is[i_173_], (byte) -55);
					if (class473.anInt5652 * -573273839 == -1) {
						int i_175_ = -3355444;
						if (class473.anInt5637 * -1012368965 == 1)
							i_175_ = -3407872;
						int i_176_ = is_167_[i_173_] >> 6 & 0x3;
						if (i_174_ == (Class476.aClass476_6883.anInt6882 * -344921723)) {
							if (i_176_ == 0)
								class_ra.G(i, i_161_, i_163_, i_175_, 0);
							else if (i_176_ == 1)
								class_ra.XA(i, i_161_, i_162_, i_175_, 0);
							else if (i_176_ == 2)
								class_ra.G(i_171_, i_161_, i_163_, i_175_, 0);
							else
								class_ra.XA(i, i_172_, i_162_, i_175_, 0);
						} else if (i_174_ == (Class476.aClass476_6880.anInt6882 * -344921723)) {
							if (i_176_ == 0) {
								class_ra.G(i, i_161_, i_163_, -1, 0);
								class_ra.XA(i, i_161_, i_162_, i_175_, 0);
							} else if (i_176_ == 1) {
								class_ra.G(i_171_, i_161_, i_163_, -1, 0);
								class_ra.XA(i, i_161_, i_162_, i_175_, 0);
							} else if (i_176_ == 2) {
								class_ra.G(i_171_, i_161_, i_163_, -1, 0);
								class_ra.XA(i, i_172_, i_162_, i_175_, 0);
							} else {
								class_ra.G(i, i_161_, i_163_, -1, 0);
								class_ra.XA(i, i_172_, i_162_, i_175_, 0);
							}
						} else if (i_174_ == (Class476.aClass476_6881.anInt6882 * -344921723)) {
							if (i_176_ == 0)
								class_ra.XA(i, i_161_, 1, i_175_, 0);
							else if (i_176_ == 1)
								class_ra.XA(i_171_, i_161_, 1, i_175_, 0);
							else if (i_176_ == 2)
								class_ra.XA(i_171_, i_172_, 1, i_175_, 0);
							else
								class_ra.XA(i, i_172_, 1, i_175_, 0);
						} else if (i_174_ == (Class476.aClass476_6902.anInt6882 * -344921723)) {
							if (i_176_ == 0 || i_176_ == 2) {
								for (int i_177_ = 0; i_177_ < i_163_; i_177_++)
									class_ra.XA(i + i_177_, i_172_ - i_177_, 1, i_175_, 0);
							} else {
								for (int i_178_ = 0; i_178_ < i_163_; i_178_++)
									class_ra.XA(i + i_178_, i_161_ + i_178_, 1, i_175_, 0);
							}
						}
					}
				}
			}
		}
	}

	static void method4094(Class_ra class_ra, int i, int i_179_, int i_180_, int i_181_, int[] is, byte[] is_182_) {
		if (is != null) {
			for (int i_183_ = 0; i_183_ < is.length; i_183_++) {
				Class473 class473 = aClass463_3515.method5705(is[i_183_], (byte) -3);
				int i_184_ = class473.anInt5652 * -573273839;
				if (i_184_ != -1) {
					Class522 class522 = aClass552_3493.method6382(i_184_, 1896915915);
					Class61 class61 = class522.method6227(class_ra, (class473.aBoolean5653 ? is_182_[i_183_] >> 6 & 0x3 : 0), (class473.aBoolean5655 ? class473.aBoolean5656 : false), (byte) 119);
					if (class61 != null) {
						int i_185_ = i_180_ * class61.method318() >> 2;
						int i_186_ = i_181_ * class61.method683() >> 2;
						if (class522.aBoolean6018) {
							int i_187_ = class473.anInt5674 * 564595847;
							int i_188_ = class473.anInt5680 * -639841087;
							if ((is_182_[i_183_] >> 6 & 0x1) == 1) {
								int i_189_ = i_187_;
								i_187_ = i_188_;
								i_188_ = i_189_;
							}
							i_185_ = i_187_ * i_180_;
							i_186_ = i_188_ * i_181_;
						}
						if (i_185_ != 0 && i_186_ != 0) {
							if (class522.anInt6020 * 116608347 != 0)
								class61.method691(i, i_179_ - i_186_ + i_181_, i_185_, i_186_, 0, (~0xffffff | (class522.anInt6020 * 116608347)), 1);
							else
								class61.method690(i, i_179_ - i_186_ + i_181_, i_185_, i_186_);
						}
					}
				}
			}
		}
	}

	static Class471 method4095(Class_ra class_ra, int i, int i_190_, int i_191_, int i_192_) {
		for (Class330_Sub38 class330_sub38 = (Class330_Sub38) aClass471_3509.method5869(539664854); class330_sub38 != null; class330_sub38 = (Class330_Sub38) aClass471_3509.method5873((byte) -24))
			method4101(class_ra, class330_sub38, i, i_190_, i_191_, i_192_);
		return aClass471_3509;
	}

	static void method4096(int i) {
		aClass330_Sub36_Sub12_3497 = (Class330_Sub36_Sub12) aClass497_3512.method6094((long) i);
	}

	static void method4097(Class_ra class_ra, Class330_Sub38 class330_sub38, Class372 class372) {
		if (class372.anIntArray3897 != null) {
			int[] is = new int[class372.anIntArray3897.length];
			for (int i = 0; i < is.length / 2; i++) {
				int i_193_ = (class372.anIntArray3897[i * 2] + class330_sub38.anInt7756 * -1917247207);
				int i_194_ = (class372.anIntArray3897[i * 2 + 1] + class330_sub38.anInt7753 * 779987703);
				is[i * 2] = anInt3527 + ((anInt3511 - anInt3527) * (i_193_ - anInt3523) / (anInt3514 - anInt3523));
				is[i * 2 + 1] = anInt3530 - ((anInt3530 - anInt3528) * (i_194_ - anInt3526) / (anInt3494 - anInt3526));
			}
			Class82.method956(class_ra, is, class372.anInt3900 * -321787043);
			if (class372.anInt3875 * -212754189 > 0) {
				for (int i = 0; i < is.length / 2 - 1; i++) {
					int i_195_ = is[i * 2];
					int i_196_ = is[i * 2 + 1];
					int i_197_ = is[(i + 1) * 2];
					int i_198_ = is[(i + 1) * 2 + 1];
					if (i_197_ < i_195_) {
						int i_199_ = i_195_;
						int i_200_ = i_196_;
						i_195_ = i_197_;
						i_196_ = i_198_;
						i_197_ = i_199_;
						i_198_ = i_200_;
					} else if (i_197_ == i_195_ && i_198_ < i_196_) {
						int i_201_ = i_196_;
						i_196_ = i_198_;
						i_198_ = i_201_;
					}
					class_ra.bz(i_195_, i_196_, i_197_, i_198_, (class372.anIntArray3908[class372.aByteArray3912[i] & 0xff]), 1, class372.anInt3875 * -212754189, class372.anInt3881 * -1858380137, class372.anInt3905 * -1758479397);
				}
				int i = is[is.length - 2];
				int i_202_ = is[is.length - 1];
				int i_203_ = is[0];
				int i_204_ = is[1];
				if (i_203_ < i) {
					int i_205_ = i;
					int i_206_ = i_202_;
					i = i_203_;
					i_202_ = i_204_;
					i_203_ = i_205_;
					i_204_ = i_206_;
				} else if (i_203_ == i && i_204_ < i_202_) {
					int i_207_ = i_202_;
					i_202_ = i_204_;
					i_204_ = i_207_;
				}
				class_ra.bz(i, i_202_, i_203_, i_204_, (class372.anIntArray3908[(class372.aByteArray3912[class372.aByteArray3912.length - 1]) & 0xff]), 1, class372.anInt3875 * -212754189, class372.anInt3881 * -1858380137, class372.anInt3905 * -1758479397);
			} else {
				for (int i = 0; i < is.length / 2 - 1; i++)
					class_ra.method4791(is[i * 2], is[i * 2 + 1], is[(i + 1) * 2], is[(i + 1) * 2 + 1], (class372.anIntArray3908[class372.aByteArray3912[i] & 0xff]), (byte) -94);
				class_ra.method4791(is[is.length - 2], is[is.length - 1], is[0], is[1], (class372.anIntArray3908[((class372.aByteArray3912[class372.aByteArray3912.length - 1]) & 0xff)]), (byte) -51);
			}
		}
	}

	static {
		anInt3500 = (int) (Math.random() * 11.0) - 5;
		anInt3501 = (int) (Math.random() * 17.0) - 8;
		anIntArray3504 = new int[1];
		aByteArray3505 = new byte[1];
		aClass471_3509 = new Class471();
	}

	static Class471 method4098(Class_ra class_ra) {
		int i = anInt3514 - anInt3523;
		int i_208_ = anInt3494 - anInt3526;
		int i_209_ = (anInt3511 - anInt3527 << 16) / i;
		int i_210_ = (anInt3530 - anInt3528 << 16) / i_208_;
		return method4095(class_ra, i_209_, i_210_, 0, 0);
	}

	static void method4099() {
		aByteArray3503 = new byte[anInt3524 * anInt3513];
		aByteArray3518 = new byte[anInt3524 * anInt3513];
		aByteArray3519 = new byte[anInt3524 * anInt3513];
		anObjectArray3525 = new Object[anInt3524 * anInt3513];
		aByteArray3491 = new byte[anInt3524 * anInt3513];
		anArrayListArrayArrayArray3522 = new ArrayList[3][anInt3524 >> 6][anInt3513 >> 6];
		anIntArray3499 = new int[aClass418_3517.anInt4295 * 272571743 + 1];
	}

	public static Class330_Sub36_Sub12 method4100(int i, int i_211_) {
		for (Class330_Sub36_Sub12 class330_sub36_sub12 = (Class330_Sub36_Sub12) aClass497_3512.method6099((byte) 95); class330_sub36_sub12 != null; class330_sub36_sub12 = ((Class330_Sub36_Sub12) aClass497_3512.method6098((short) -32768))) {
			if (((Class330_Sub36_Sub12) class330_sub36_sub12).aBoolean9713 && class330_sub36_sub12.method3480(i, i_211_, 1390104192))
				return class330_sub36_sub12;
		}
		return null;
	}

	static void method4101(Class_ra class_ra, Class330_Sub38 class330_sub38, int i, int i_212_, int i_213_, int i_214_) {
		class330_sub38.anInt7754 = (anInt3527 + (i_213_ + i * (class330_sub38.anInt7756 * -1917247207 - anInt3523) >> 16)) * 1390909801;
		class330_sub38.anInt7750 = (anInt3530 - (i_214_ + i_212_ * (class330_sub38.anInt7753 * 779987703 - anInt3526) >> 16)) * -28708039;
	}

	public static void method4102(IndexTable class280, Class418 class418, Class499 class499, Class463 class463, Class380 class380, Class552 class552, Interface29 interface29) {
		aClass280_3498 = class280;
		aClass418_3517 = class418;
		aClass499_3492 = class499;
		aClass463_3515 = class463;
		aClass380_3529 = class380;
		aClass552_3493 = class552;
		anInterface29_3496 = interface29;
		aClass497_3512.method6100(65280);
		int i = aClass280_3498.method2754("details", 323600977);
		int[] is = aClass280_3498.method2762(i, (byte) -46);
		if (is != null) {
			for (int i_215_ = 0; i_215_ < is.length; i_215_++) {
				Class330_Sub36_Sub12 class330_sub36_sub12 = Class286.method2875(aClass280_3498, i, is[i_215_], (byte) -23);
				aClass497_3512.method6097(class330_sub36_sub12, (long) ((class330_sub36_sub12.anInt9708) * -1647784587));
			}
		}
		Class318.method3166(true, false, -1368286637);
	}

	static void method4103() {
		aByteArray3503 = null;
		aByteArray3506 = null;
		aShortArray3495 = null;
		aByteArray3518 = null;
		aByteArray3519 = null;
		anObjectArray3525 = null;
		aByteArray3491 = null;
		anArrayListArrayArrayArray3522 = null;
		anIntArray3499 = null;
	}

	Class354() throws Throwable {
		throw new Error();
	}

	static void method4104(Interface_ma interface_ma, int i, int i_216_) {
		for (int i_217_ = 0; i_217_ < aClass418_3517.anInt4295 * 272571743; i_217_++)
			anIntArray3499[i_217_ + 1] = method4085(interface_ma, i_217_, i, i_216_);
	}
}
