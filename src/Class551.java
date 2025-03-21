/* Class551 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class Class551 {
	public int anInt6290;
	public byte[] aByteArray6291;
	Class553 aClass553_6292;
	public int anInt6293;
	static int anInt6294 = 6;
	public int anInt6295;
	public int[] anIntArray6296;
	public int[] anIntArray6297;
	int[][] anIntArrayArray6298;
	public int anInt6299;
	short[] aShortArray6300;
	public short[] aShortArray6301;
	byte[] aByteArray6302;
	short[] aShortArray6303;
	int anInt6304;
	byte aByte6305;
	public byte[] aByteArray6306;
	int[] anIntArray6307;
	public boolean aBoolean6308;
	byte aByte6309;
	byte aByte6310;
	public String[] aStringArray6311;
	int anInt6312;
	public int anInt6313;
	public boolean aBoolean6314;
	public Class293 aClass293_6315;
	int anInt6316;
	byte aByte6317;
	public boolean aBoolean6318;
	public boolean aBoolean6319;
	public int anInt6320;
	public int anInt6321;
	public byte aByte6322;
	public String aString6323 = "null";
	public int anInt6324;
	public int anInt6325;
	public int[] anIntArray6326;
	int anInt6327;
	int anInt6328;
	public boolean aBoolean6329;
	public boolean aBoolean6330;
	public boolean aBoolean6331;
	public short aShort6332;
	public short aShort6333;
	public byte aByte6334;
	public byte aByte6335;
	public int[] anIntArray6336;
	public static int anInt6337 = 2;
	public int anInt6338;
	public int anInt6339;
	public int anInt6340;
	public int anInt6341;
	public int anInt6342;
	public int anInt6343;
	public byte aByte6344;
	public static int anInt6345 = 1;
	public boolean aBoolean6346;
	Class497 aClass497_6347;
	public int anInt6348;
	public short[] aShortArray6349;
	public int anInt6350;
	public static short[] aShortArray6351 = new short[256];
	int anInt6352;
	public int anInt6353;
	public int anInt6354;
	public int anInt6355;
	public int anInt6356;
	public boolean aBoolean6357;

	void method6365(Buffer class330_sub46, short i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(1475737705);
				if (0 == i_0_) {
					if (i > 16384)
						break;
					break;
				}
				method6373(class330_sub46, i_0_, 1922895806);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wu.r(").append(')').toString());
		}
	}

	public final Class387 method6366(Class_ra class_ra, int i, Class362 class362, Interface29 interface29, Class477 class477, Class477 class477_1_, Class477[] class477s, int[] is, int i_2_, Class538 class538, int i_3_) {
		try {
			return method6367(class_ra, i, class362, interface29, class477, class477_1_, class477s, is, i_2_, class538, anInt6338 * -1303151019, true, -326113681);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wu.p(").append(')').toString());
		}
	}

	public final Class387 method6367(Class_ra class_ra, int i, Class362 class362, Interface29 interface29, Class477 class477, Class477 class477_4_, Class477[] class477s, int[] is, int i_5_, Class538 class538, int i_6_, boolean bool, int i_7_) {
		try {
			if (null != anIntArray6326) {
				Class551 class551_8_ = method6371(interface29, (byte) 121);
				if (null == class551_8_)
					return null;
				return class551_8_.method6367(class_ra, i, class362, interface29, class477, class477_4_, class477s, is, i_5_, class538, i_6_, bool, -94788529);
			}
			int i_9_ = i;
			if (128 != 879373251 * ((Class551) this).anInt6352)
				i_9_ |= 0x2;
			if (128 != 1236731435 * ((Class551) this).anInt6316)
				i_9_ |= 0x5;
			boolean bool_10_ = false;
			int i_11_ = null != class477s ? class477s.length : 0;
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
				if (null != class477s[i_12_]) {
					i_9_ |= class477s[i_12_].method5975(-521138286);
					bool_10_ = true;
				}
			}
			if (null != class477) {
				i_9_ |= class477.method5975(13912008);
				bool_10_ = true;
			}
			if (class477_4_ != null) {
				i_9_ |= class477_4_.method5975(-482862605);
				bool_10_ = true;
			}
			long l = (long) (-554355565 * anInt6293 | class_ra.anInt4226 * 1409150453 << 16);
			if (null != class538)
				l |= class538.aLong6242 * 2409609981796081031L << 24;
			Class387 class387;
			synchronized (((Class553) ((Class551) this).aClass553_6292).aClass367_6370) {
				class387 = (Class387) ((Class553) ((Class551) this).aClass553_6292).aClass367_6370.get(l);
			}
			Class364 class364 = null;
			if (!bool && -1 != i_6_)
				class364 = class362.method4254(i_6_, 2092775193);
			else if (-1 != anInt6338 * -1303151019)
				class364 = class362.method4254(-1303151019 * anInt6338, 1112094706);
			if (class387 == null || (class387.m() & i_9_) != i_9_) {
				if (null != class387)
					i_9_ |= class387.m();
				int i_13_ = i_9_;
				if (((Class551) this).aShortArray6300 != null)
					i_13_ |= 0x4000;
				if (null != ((Class551) this).aShortArray6303)
					i_13_ |= 0x8000;
				if (0 != ((Class551) this).aByte6310)
					i_13_ |= 0x80000;
				int[] is_14_ = (class538 != null && null != class538.anIntArray6240 ? class538.anIntArray6240 : anIntArray6296);
				boolean bool_15_ = false;
				synchronized (((Class553) ((Class551) this).aClass553_6292).aClass280_6368) {
					for (int i_16_ = 0; i_16_ < is_14_.length; i_16_++) {
						if (is_14_[i_16_] == -1) {
							if (i_7_ >= 324769319)
								throw new IllegalStateException();
						} else if (!((Class553) ((Class551) this).aClass553_6292).aClass280_6368.hasStoredFile(is_14_[i_16_], 0, (byte) 32))
							bool_15_ = true;
					}
				}
				if (bool_15_)
					return null;
				Model[] class98s = new Model[is_14_.length];
				for (int i_17_ = 0; i_17_ < is_14_.length; i_17_++) {
					if (is_14_[i_17_] == -1) {
						if (i_7_ >= 324769319)
							throw new IllegalStateException();
					} else {
						synchronized (((Class553) ((Class551) this).aClass553_6292).aClass280_6368) {
							class98s[i_17_] = Model.loadModel((((Class553) (((Class551) this).aClass553_6292)).aClass280_6368), is_14_[i_17_], 0);
						}
						if (null != class98s[i_17_]) {
							if (class98s[i_17_].anInt881 < 13)
								class98s[i_17_].method1196(2);
							if (null != ((Class551) this).anIntArrayArray6298 && (((Class551) this).anIntArrayArray6298[i_17_]) != null)
								class98s[i_17_].method1194((((Class551) this).anIntArrayArray6298[i_17_][0]), (((Class551) this).anIntArrayArray6298[i_17_][1]), (((Class551) this).anIntArrayArray6298[i_17_][2]));
						}
					}
				}
				if (class364 != null && class364.anIntArrayArray3807 != null) {
					for (int i_18_ = 0; i_18_ < class364.anIntArrayArray3807.length; i_18_++) {
						if (i_18_ < class98s.length) {
							if (null == class98s[i_18_]) {
								if (i_7_ >= 324769319) {
									/* empty */
								}
							} else {
								int i_19_ = 0;
								int i_20_ = 0;
								int i_21_ = 0;
								int i_22_ = 0;
								int i_23_ = 0;
								int i_24_ = 0;
								if (null != class364.anIntArrayArray3807[i_18_]) {
									i_19_ = (class364.anIntArrayArray3807[i_18_][0]);
									i_20_ = (class364.anIntArrayArray3807[i_18_][1]);
									i_21_ = (class364.anIntArrayArray3807[i_18_][2]);
									i_22_ = (class364.anIntArrayArray3807[i_18_][3]) << 3;
									i_23_ = (class364.anIntArrayArray3807[i_18_][4]) << 3;
									i_24_ = (class364.anIntArrayArray3807[i_18_][5]) << 3;
								}
								if (i_22_ != 0 || i_23_ != 0 || i_24_ != 0)
									class98s[i_18_].method1195(i_22_, i_23_, i_24_);
								if (i_19_ != 0 || i_20_ != 0 || 0 != i_21_)
									class98s[i_18_].method1194(i_19_, i_20_, i_21_);
							}
						}
					}
				}
				Model class98;
				if (class98s.length == 1)
					class98 = class98s[0];
				else
					class98 = new Model(class98s, class98s.length);
				class387 = class_ra.cb(class98, i_13_, (((Class553) ((Class551) this).aClass553_6292).anInt6372) * 2000635313, 64 + (-947790747 * ((Class551) this).anInt6304), 850 + (-432544355 * ((Class551) this).anInt6312));
				if (null != ((Class551) this).aShortArray6300) {
					short[] is_25_;
					if (null != class538 && class538.aShortArray6241 != null)
						is_25_ = class538.aShortArray6241;
					else
						is_25_ = aShortArray6301;
					for (int i_26_ = 0; i_26_ < ((Class551) this).aShortArray6300.length; i_26_++) {
						if (null != ((Class551) this).aByteArray6302 && i_26_ < ((Class551) this).aByteArray6302.length)
							class387.color((((Class551) this).aShortArray6300[i_26_]), aShortArray6351[(((Class551) this).aByteArray6302[i_26_]) & 0xff]);
						else
							class387.color((((Class551) this).aShortArray6300[i_26_]), is_25_[i_26_]);
					}
				}
				if (((Class551) this).aShortArray6303 != null) {
					short[] is_27_;
					if (class538 != null && null != class538.aShortArray6239)
						is_27_ = class538.aShortArray6239;
					else
						is_27_ = aShortArray6349;
					for (int i_28_ = 0; i_28_ < ((Class551) this).aShortArray6303.length; i_28_++)
						class387.paintTexture(((Class551) this).aShortArray6303[i_28_], is_27_[i_28_]);
				}
				if (0 != ((Class551) this).aByte6310)
					class387.PA(((Class551) this).aByte6317, ((Class551) this).aByte6305, ((Class551) this).aByte6309, ((Class551) this).aByte6310 & 0xff);
				class387.KA(i_9_);
				synchronized (((Class553) ((Class551) this).aClass553_6292).aClass367_6370) {
					((Class553) ((Class551) this).aClass553_6292).aClass367_6370.put(class387, l);
				}
			}
			Class387 class387_29_ = class387.method4446((byte) 4, i_9_, true);
			boolean bool_30_ = false;
			if (null != is) {
				for (int i_31_ = 0; i_31_ < 12; i_31_++) {
					if (is[i_31_] != -1)
						bool_30_ = true;
				}
			}
			if (!bool_10_ && !bool_30_)
				return class387_29_;
			Class247[] class247s = null;
			if (null != class364)
				class247s = class364.method4265(-635324641);
			if (bool_30_ && null != class247s) {
				for (int i_32_ = 0; i_32_ < 12; i_32_++) {
					if (null != class247s[i_32_])
						class387_29_.method4488(class247s[i_32_], 1 << i_32_, true);
				}
			}
			int i_33_ = 0;
			int i_34_ = 1;
			while (i_33_ < i_11_) {
				if (null == class477s[i_33_]) {
					if (i_7_ >= 324769319) {
						/* empty */
					}
				} else
					class477s[i_33_].method5985(class387_29_, 0, i_34_, -2114260894);
				i_33_++;
				i_34_ <<= 1;
			}
			if (bool_30_) {
				for (i_33_ = 0; i_33_ < 12; i_33_++) {
					if (is[i_33_] == -1) {
						if (i_7_ >= 324769319)
							throw new IllegalStateException();
					} else {
						i_34_ = is[i_33_] - i_5_;
						i_34_ &= 0x3fff;
						Class247 class247 = new Class247();
						class247.method2473(0.0F, 1.0F, 0.0F, Class257.method2541(i_34_));
						class387_29_.method4488(class247, 1 << i_33_, false);
					}
				}
			}
			if (bool_30_ && class247s != null) {
				for (i_33_ = 0; i_33_ < 12; i_33_++) {
					if (null != class247s[i_33_])
						class387_29_.method4488(class247s[i_33_], 1 << i_33_, false);
				}
			}
			if (class477 != null && null != class477_4_)
				Class111.method1368(class387_29_, class477, class477_4_, -962829138);
			else if (class477 != null)
				class477.method5976(class387_29_, 0, 419422254);
			else if (null != class477_4_)
				class477_4_.method5976(class387_29_, 0, 1608185694);
			if (1236731435 * ((Class551) this).anInt6316 != 128 || 128 != ((Class551) this).anInt6352 * 879373251)
				class387_29_.oa(1236731435 * ((Class551) this).anInt6316, 879373251 * ((Class551) this).anInt6352, ((Class551) this).anInt6316 * 1236731435);
			class387_29_.KA(i);
			return class387_29_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wu.o(").append(')').toString());
		}
	}

	public final Class387 method6368(Class_ra class_ra, int i, Interface29 interface29, Class477 class477, Class538 class538, int i_35_) {
		try {
			if (null != anIntArray6326) {
				Class551 class551_36_ = method6371(interface29, (byte) 24);
				if (null == class551_36_)
					return null;
				return class551_36_.method6368(class_ra, i, interface29, class477, class538, 76438474);
			}
			if (anIntArray6297 == null && (class538 == null || null == class538.anIntArray6240))
				return null;
			int i_37_ = i;
			if (null != class477)
				i_37_ |= class477.method5975(-570515503);
			long l = (long) (anInt6293 * -554355565 | 1409150453 * class_ra.anInt4226 << 16);
			if (null != class538)
				l |= class538.aLong6242 * 2409609981796081031L << 24;
			Class387 class387;
			synchronized (((Class553) ((Class551) this).aClass553_6292).aClass367_6367) {
				class387 = (Class387) ((Class553) ((Class551) this).aClass553_6292).aClass367_6367.get(l);
			}
			if (null == class387 || (class387.m() & i_37_) != i_37_) {
				if (null != class387)
					i_37_ |= class387.m();
				int i_38_ = i_37_;
				if (null != ((Class551) this).aShortArray6300)
					i_38_ |= 0x4000;
				if (null != ((Class551) this).aShortArray6303)
					i_38_ |= 0x8000;
				if (0 != ((Class551) this).aByte6310)
					i_38_ |= 0x80000;
				int[] is = (class538 != null && class538.anIntArray6240 != null ? class538.anIntArray6240 : anIntArray6297);
				boolean bool = false;
				synchronized (((Class553) ((Class551) this).aClass553_6292).aClass280_6368) {
					for (int i_39_ = 0; i_39_ < is.length; i_39_++) {
						if (!((Class553) ((Class551) this).aClass553_6292).aClass280_6368.hasStoredFile(is[i_39_], 0, (byte) 32))
							bool = true;
					}
				}
				if (bool)
					return null;
				Model[] class98s = new Model[is.length];
				synchronized (((Class553) ((Class551) this).aClass553_6292).aClass280_6368) {
					for (int i_40_ = 0; i_40_ < is.length; i_40_++)
						class98s[i_40_] = Model.loadModel((((Class553) (((Class551) this).aClass553_6292)).aClass280_6368), is[i_40_], 0);
				}
				for (int i_41_ = 0; i_41_ < is.length; i_41_++) {
					if (class98s[i_41_] != null && class98s[i_41_].anInt881 < 13)
						class98s[i_41_].method1196(2);
				}
				Model class98;
				if (1 == class98s.length)
					class98 = class98s[0];
				else
					class98 = new Model(class98s, class98s.length);
				class387 = class_ra.cb(class98, i_38_, 2000635313 * (((Class553) (((Class551) this).aClass553_6292)).anInt6372), 64, 768);
				if (null != ((Class551) this).aShortArray6300) {
					short[] is_42_;
					if (null != class538 && null != class538.aShortArray6241)
						is_42_ = class538.aShortArray6241;
					else
						is_42_ = aShortArray6301;
					for (int i_43_ = 0; i_43_ < ((Class551) this).aShortArray6300.length; i_43_++) {
						if (null != ((Class551) this).aByteArray6302 && i_43_ < ((Class551) this).aByteArray6302.length)
							class387.color((((Class551) this).aShortArray6300[i_43_]), aShortArray6351[(((Class551) this).aByteArray6302[i_43_]) & 0xff]);
						else
							class387.color((((Class551) this).aShortArray6300[i_43_]), is_42_[i_43_]);
					}
				}
				if (null != ((Class551) this).aShortArray6303) {
					short[] is_44_;
					if (class538 != null && class538.aShortArray6239 != null)
						is_44_ = class538.aShortArray6239;
					else
						is_44_ = aShortArray6349;
					for (int i_45_ = 0; i_45_ < ((Class551) this).aShortArray6303.length; i_45_++)
						class387.paintTexture(((Class551) this).aShortArray6303[i_45_], is_44_[i_45_]);
				}
				if (((Class551) this).aByte6310 != 0)
					class387.PA(((Class551) this).aByte6317, ((Class551) this).aByte6305, ((Class551) this).aByte6309, ((Class551) this).aByte6310 & 0xff);
				class387.KA(i_37_);
				synchronized (((Class553) ((Class551) this).aClass553_6292).aClass367_6367) {
					((Class553) ((Class551) this).aClass553_6292).aClass367_6367.put(class387, l);
				}
			}
			if (class477 != null) {
				class387 = class387.method4446((byte) 1, i_37_, true);
				class477.method5976(class387, 0, 266829811);
			}
			class387.KA(i);
			return class387;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wu.s(").append(')').toString());
		}
	}

	public final boolean method6369(int i) {
		try {
			if (anIntArray6296 == null)
				return true;
			boolean bool = true;
			int[] is = anIntArray6296;
			for (int i_46_ = 0; i_46_ < is.length; i_46_++) {
				int i_47_ = is[i_46_];
				if (!((Class553) ((Class551) this).aClass553_6292).aClass280_6368.hasStoredFile(i_47_, 0, (byte) 32))
					bool = false;
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wu.f(").append(')').toString());
		}
	}

	public int method6370(int i, int i_48_, byte i_49_) {
		try {
			if (((Class551) this).aClass497_6347 == null)
				return i_48_;
			Class330_Sub23 class330_sub23 = ((Class330_Sub23) ((Class551) this).aClass497_6347.method6094((long) i));
			if (null == class330_sub23)
				return i_48_;
			return 393599711 * class330_sub23.anInt7693;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wu.z(").append(')').toString());
		}
	}

	public final Class551 method6371(Interface29 interface29, byte i) {
		try {
			int i_50_ = -1;
			if (((Class551) this).anInt6327 * 49830755 != -1)
				i_50_ = interface29.method310((((Class551) this).anInt6327 * 49830755), -1142236263);
			else if (-1 != ((Class551) this).anInt6328 * 1748316681)
				i_50_ = interface29.method306((((Class551) this).anInt6328 * 1748316681), 1874006054);
			if (i_50_ < 0 || i_50_ >= anIntArray6326.length - 1) {
				int i_51_ = anIntArray6326[anIntArray6326.length - 1];
				if (-1 != i_51_)
					return ((Class551) this).aClass553_6292.method6392(i_51_, 1281974313);
				return null;
			}
			if (anIntArray6326[i_50_] == -1)
				return null;
			return ((Class551) this).aClass553_6292.method6392(anIntArray6326[i_50_], 143121426);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wu.n(").append(')').toString());
		}
	}

	public boolean method6372(byte i) {
		try {
			if (anIntArray6326 == null)
				return (-1778637787 * anInt6339 != -1 || anInt6341 * 439966927 != -1 || -1 != -49424971 * anInt6342);
			for (int i_52_ = 0; i_52_ < anIntArray6326.length; i_52_++) {
				if (-1 != anIntArray6326[i_52_]) {
					Class551 class551_53_ = ((Class551) this).aClass553_6292.method6392(anIntArray6326[i_52_], 1363655041);
					if (class551_53_.anInt6339 * -1778637787 != -1 || class551_53_.anInt6341 * 439966927 != -1 || -49424971 * class551_53_.anInt6342 != -1)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wu.b(").append(')').toString());
		}
	}

	void method6373(Buffer class330_sub46, int i, int i_54_) {
		try {
			if (i == 1) {
				int i_55_ = class330_sub46.readUnsignedByte(321830034);
				anIntArray6296 = new int[i_55_];
				for (int i_56_ = 0; i_56_ < i_55_; i_56_++)
					anIntArray6296[i_56_] = class330_sub46.readBigSmart(-799971705);
			} else if (2 == i)
				aString6323 = class330_sub46.readString(-529191054);
			else if (i == 12)
				anInt6295 = class330_sub46.readUnsignedByte(-229231230) * -510585889;
			else if (i >= 30 && i < 35)
				aStringArray6311[i - 30] = class330_sub46.readString(-142659655);
			else if (40 == i) {
				int i_57_ = class330_sub46.readUnsignedByte(1623069605);
				((Class551) this).aShortArray6300 = new short[i_57_];
				aShortArray6301 = new short[i_57_];
				for (int i_58_ = 0; i_58_ < i_57_; i_58_++) {
					((Class551) this).aShortArray6300[i_58_] = (short) class330_sub46.readUnsignedShort(2058054360);
					aShortArray6301[i_58_] = (short) class330_sub46.readUnsignedShort(768707700);
				}
			} else if (i == 41) {
				int i_59_ = class330_sub46.readUnsignedByte(62108810);
				((Class551) this).aShortArray6303 = new short[i_59_];
				aShortArray6349 = new short[i_59_];
				for (int i_60_ = 0; i_60_ < i_59_; i_60_++) {
					((Class551) this).aShortArray6303[i_60_] = (short) class330_sub46.readUnsignedShort(1115056775);
					aShortArray6349[i_60_] = (short) class330_sub46.readUnsignedShort(1938176657);
				}
			} else if (42 == i) {
				int i_61_ = class330_sub46.readUnsignedByte(1360093741);
				((Class551) this).aByteArray6302 = new byte[i_61_];
				for (int i_62_ = 0; i_62_ < i_61_; i_62_++)
					((Class551) this).aByteArray6302[i_62_] = class330_sub46.readByte((byte) -17);
			} else if (44 == i) {
				int i_63_ = class330_sub46.readUnsignedShort(1742323043);
				int i_64_ = 0;
				for (int i_65_ = i_63_; i_65_ > 0; i_65_ >>= 1)
					i_64_++;
				aByteArray6291 = new byte[i_64_];
				byte i_66_ = 0;
				for (int i_67_ = 0; i_67_ < i_64_; i_67_++) {
					if ((i_63_ & 1 << i_67_) > 0) {
						aByteArray6291[i_67_] = i_66_;
						i_66_++;
					} else
						aByteArray6291[i_67_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_68_ = class330_sub46.readUnsignedShort(1101995272);
				int i_69_ = 0;
				for (int i_70_ = i_68_; i_70_ > 0; i_70_ >>= 1)
					i_69_++;
				aByteArray6306 = new byte[i_69_];
				byte i_71_ = 0;
				for (int i_72_ = 0; i_72_ < i_69_; i_72_++) {
					if ((i_68_ & 1 << i_72_) > 0) {
						aByteArray6306[i_72_] = i_71_;
						i_71_++;
					} else
						aByteArray6306[i_72_] = (byte) -1;
				}
			} else if (60 == i) {
				int i_73_ = class330_sub46.readUnsignedByte(1088971499);
				anIntArray6297 = new int[i_73_];
				for (int i_74_ = 0; i_74_ < i_73_; i_74_++)
					anIntArray6297[i_74_] = class330_sub46.readBigSmart(-523404175);
			} else if (i == 93)
				aBoolean6314 = false;
			else if (95 == i)
				anInt6348 = class330_sub46.readUnsignedShort(1303622023) * -1433285655;
			else if (i == 97)
				((Class551) this).anInt6316 = class330_sub46.readUnsignedShort(-380251340) * 884181123;
			else if (98 == i)
				((Class551) this).anInt6352 = class330_sub46.readUnsignedShort(578071546) * -709518101;
			else if (i == 99)
				aBoolean6318 = true;
			else if (100 == i)
				((Class551) this).anInt6304 = class330_sub46.readByte((byte) -65) * 1491039597;
			else if (i == 101)
				((Class551) this).anInt6312 = class330_sub46.readByte((byte) 37) * -1680086135;
			else if (i == 102)
				anInt6321 = class330_sub46.readUnsignedShort(1204879437) * 78296525;
			else if (103 == i)
				anInt6325 = class330_sub46.readUnsignedShort(1962479815) * -975333173;
			else if (106 == i || 118 == i) {
				((Class551) this).anInt6327 = class330_sub46.readUnsignedShort(1214687029) * 1518075467;
				if (65535 == 49830755 * ((Class551) this).anInt6327)
					((Class551) this).anInt6327 = -1518075467;
				((Class551) this).anInt6328 = class330_sub46.readUnsignedShort(1356373965) * 359660601;
				if (65535 == ((Class551) this).anInt6328 * 1748316681)
					((Class551) this).anInt6328 = -359660601;
				int i_75_ = -1;
				if (118 == i) {
					i_75_ = class330_sub46.readUnsignedShort(128559206);
					if (65535 == i_75_)
						i_75_ = -1;
				}
				int i_76_ = class330_sub46.readUnsignedByte(600700587);
				anIntArray6326 = new int[2 + i_76_];
				for (int i_77_ = 0; i_77_ <= i_76_; i_77_++) {
					anIntArray6326[i_77_] = class330_sub46.readUnsignedShort(1555762412);
					if (anIntArray6326[i_77_] == 65535)
						anIntArray6326[i_77_] = -1;
				}
				anIntArray6326[i_76_ + 1] = i_75_;
			} else if (107 == i)
				aBoolean6329 = false;
			else if (i == 109)
				aBoolean6330 = false;
			else if (111 == i)
				aBoolean6331 = false;
			else if (113 == i) {
				aShort6332 = (short) class330_sub46.readUnsignedShort(323887);
				aShort6333 = (short) class330_sub46.readUnsignedShort(1277075153);
			} else if (i == 114) {
				aByte6334 = class330_sub46.readByte((byte) -32);
				aByte6335 = class330_sub46.readByte((byte) 0);
			} else if (i == 119)
				aByte6322 = class330_sub46.readByte((byte) -44);
			else if (i == 121) {
				((Class551) this).anIntArrayArray6298 = new int[anIntArray6296.length][];
				int i_78_ = class330_sub46.readUnsignedByte(6417905);
				for (int i_79_ = 0; i_79_ < i_78_; i_79_++) {
					int i_80_ = class330_sub46.readUnsignedByte(384889471);
					int[] is = (((Class551) this).anIntArrayArray6298[i_80_] = new int[3]);
					is[0] = class330_sub46.readByte((byte) 7);
					is[1] = class330_sub46.readByte((byte) 16);
					is[2] = class330_sub46.readByte((byte) -48);
				}
			} else if (123 == i)
				anInt6299 = class330_sub46.readUnsignedShort(1191032372) * -1694477663;
			else if (i == 125)
				aClass293_6315 = ((Class293) Class479.method6015(Class476.method5962(-1715692560), class330_sub46.readByte((byte) -1), (byte) 43));
			else if (i == 127)
				anInt6338 = class330_sub46.readUnsignedShort(1911036068) * 1288015613;
			else if (128 == i)
				Class479.method6015(Class487_Sub1.method6040(298230347), class330_sub46.readUnsignedByte(162213543), (byte) 2);
			else if (i == 134) {
				anInt6339 = class330_sub46.readUnsignedShort(931471899) * 1360484269;
				if (-1778637787 * anInt6339 == 65535)
					anInt6339 = -1360484269;
				anInt6355 = class330_sub46.readUnsignedShort(1819902961) * -979859037;
				if (65535 == anInt6355 * -1078791669)
					anInt6355 = 979859037;
				anInt6341 = class330_sub46.readUnsignedShort(125265806) * -1855837649;
				if (65535 == anInt6341 * 439966927)
					anInt6341 = 1855837649;
				anInt6342 = class330_sub46.readUnsignedShort(787333018) * -1008062307;
				if (anInt6342 * -49424971 == 65535)
					anInt6342 = 1008062307;
				anInt6343 = class330_sub46.readUnsignedByte(-111917808) * 164373543;
			} else if (135 == i || 136 == i) {
				class330_sub46.readUnsignedByte(1996675522);
				class330_sub46.readUnsignedShort(-237983780);
			} else if (137 == i)
				anInt6313 = class330_sub46.readUnsignedShort(1368912621) * 653253299;
			else if (138 == i)
				anInt6324 = class330_sub46.readBigSmart(-878599376) * 682471325;
			else if (140 == i)
				anInt6320 = class330_sub46.readUnsignedByte(1477308551) * 163511191;
			else if (141 == i)
				aBoolean6308 = true;
			else if (i == 142)
				anInt6340 = class330_sub46.readUnsignedShort(1262250102) * 216235277;
			else if (143 == i)
				aBoolean6319 = true;
			else if (i >= 150 && i < 155) {
				aStringArray6311[i - 150] = class330_sub46.readString(2004353721);
				if (!((Class553) ((Class551) this).aClass553_6292).aBoolean6366)
					aStringArray6311[i - 150] = null;
			} else if (155 == i) {
				((Class551) this).aByte6317 = class330_sub46.readByte((byte) -58);
				((Class551) this).aByte6305 = class330_sub46.readByte((byte) -101);
				((Class551) this).aByte6309 = class330_sub46.readByte((byte) 113);
				((Class551) this).aByte6310 = class330_sub46.readByte((byte) 1);
			} else if (158 == i)
				aByte6344 = (byte) 1;
			else if (i == 159)
				aByte6344 = (byte) 0;
			else if (i == 160) {
				int i_81_ = class330_sub46.readUnsignedByte(2102111820);
				anIntArray6336 = new int[i_81_];
				for (int i_82_ = 0; i_82_ < i_81_; i_82_++)
					anIntArray6336[i_82_] = class330_sub46.readUnsignedShort(1619146285);
			} else if (162 == i)
				aBoolean6346 = true;
			else if (163 == i)
				anInt6353 = class330_sub46.readUnsignedByte(-107010477) * 601162125;
			else if (i == 164) {
				anInt6354 = class330_sub46.readUnsignedShort(575380044) * -650897939;
				anInt6350 = class330_sub46.readUnsignedShort(1839780279) * 182227773;
			} else if (165 == i)
				anInt6356 = class330_sub46.readUnsignedByte(1286810705) * 1282493907;
			else if (168 == i)
				anInt6290 = class330_sub46.readUnsignedByte(861675360) * 1995363;
			else if (169 == i)
				aBoolean6357 = false;
			else if (i >= 170 && i < 176) {
				if (((Class551) this).anIntArray6307 == null) {
					((Class551) this).anIntArray6307 = new int[6];
					Arrays.fill(((Class551) this).anIntArray6307, -1);
				}
				int i_83_ = class330_sub46.readUnsignedShort(838443585);
				if (i_83_ == 65535)
					i_83_ = -1;
				((Class551) this).anIntArray6307[i - 170] = i_83_;
			} else if (i == 249) {
				int i_84_ = class330_sub46.readUnsignedByte(595449270);
				if (((Class551) this).aClass497_6347 == null) {
					int i_85_ = Class136.method1594(i_84_, 1940839529);
					((Class551) this).aClass497_6347 = new Class497(i_85_);
				}
				for (int i_86_ = 0; i_86_ < i_84_; i_86_++) {
					boolean bool = class330_sub46.readUnsignedByte(-6646822) == 1;
					int i_87_ = class330_sub46.readUnsignedTriByte(-1401356047);
					Class330 class330;
					if (bool)
						class330 = new Class330_Sub35(class330_sub46.readString(-1277658405));
					else
						class330 = new Class330_Sub23(class330_sub46.readInt((byte) 114));
					((Class551) this).aClass497_6347.method6097(class330, (long) i_87_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wu.j(").append(')').toString());
		}
	}

	Class551() {
		anInt6295 = -510585889;
		anInt6338 = -1288015613;
		((Class551) this).aByte6310 = (byte) 0;
		anInt6313 = -653253299;
		aBoolean6314 = true;
		anInt6348 = 1433285655;
		((Class551) this).anInt6316 = 1506034048;
		((Class551) this).anInt6352 = -624003712;
		aBoolean6318 = false;
		aBoolean6319 = false;
		aBoolean6308 = false;
		((Class551) this).anInt6304 = 0;
		((Class551) this).anInt6312 = 0;
		anInt6321 = -78296525;
		anInt6324 = -682471325;
		anInt6325 = -1145890464;
		((Class551) this).anInt6327 = -1518075467;
		((Class551) this).anInt6328 = -359660601;
		aBoolean6329 = true;
		aBoolean6330 = true;
		aBoolean6331 = true;
		aShort6332 = (short) 0;
		aShort6333 = (short) 0;
		aByte6334 = (byte) -96;
		aByte6335 = (byte) -16;
		aByte6322 = (byte) 0;
		anInt6339 = -1360484269;
		anInt6355 = 979859037;
		anInt6341 = 1855837649;
		anInt6342 = 1008062307;
		anInt6343 = 0;
		anInt6290 = 0;
		anInt6320 = -1254319255;
		anInt6299 = 1694477663;
		aClass293_6315 = Class293.aClass293_6798;
		anInt6340 = -216235277;
		aByte6344 = (byte) -1;
		anInt6353 = -601162125;
		anInt6354 = 873852160;
		anInt6350 = -594330368;
		anInt6356 = 0;
		aBoolean6357 = true;
	}

	public boolean method6374(Interface29 interface29, byte i) {
		try {
			if (anIntArray6326 == null)
				return true;
			int i_88_ = -1;
			if (((Class551) this).anInt6327 * 49830755 != -1)
				i_88_ = interface29.method310((((Class551) this).anInt6327 * 49830755), -876083746);
			else if (((Class551) this).anInt6328 * 1748316681 != -1)
				i_88_ = interface29.method306((1748316681 * ((Class551) this).anInt6328), 758010653);
			if (i_88_ < 0 || i_88_ >= anIntArray6326.length - 1) {
				int i_89_ = anIntArray6326[anIntArray6326.length - 1];
				if (-1 != i_89_)
					return true;
				return false;
			}
			if (-1 == anIntArray6326[i_88_])
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wu.l(").append(')').toString());
		}
	}

	void method6375(int i) {
		try {
			if (anIntArray6296 == null)
				anIntArray6296 = new int[0];
			if (-1 == aByte6344) {
				if (Class435.aClass435_4421 == (((Class553) ((Class551) this).aClass553_6292).aClass435_6369))
					aByte6344 = (byte) 1;
				else
					aByte6344 = (byte) 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wu.i(").append(')').toString());
		}
	}

	public String method6376(int i, String string, int i_90_) {
		try {
			if (null == ((Class551) this).aClass497_6347)
				return string;
			Class330_Sub35 class330_sub35 = ((Class330_Sub35) ((Class551) this).aClass497_6347.method6094((long) i));
			if (null == class330_sub35)
				return string;
			return (String) class330_sub35.anObject7733;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wu.w(").append(')').toString());
		}
	}

	public int method6377(int i, int i_91_) {
		try {
			if (((Class551) this).anIntArray6307 == null)
				return -1;
			return ((Class551) this).anIntArray6307[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wu.k(").append(')').toString());
		}
	}

	static final void method6378(int i) {
		try {
			Class360.aLong3750 = 717415731737899667L;
			Class360.socialName = 0L;
			Class360.anInt3749 = -203611577;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wu.p(").append(')').toString());
		}
	}

	static final void method6379(int i, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_) {
		try {
			if (i_93_ >= 1 && i_94_ >= 1 && i_93_ <= client.aClass304_9030.method2990(-688342294) - 2 && i_94_ <= client.aClass304_9030.method3033((byte) -64) - 2) {
				int i_100_ = i;
				if (i_100_ < 3 && client.aClass304_9030.method2995(1233922452).method2788(i_93_, i_94_, (byte) -8))
					i_100_++;
				if (client.aClass304_9030.method3023(-400722441) != null) {
					client.aClass304_9030.method3001((byte) 65).method2706(Class361.aClass_ra3793, i, i_92_, i_93_, i_94_, client.aClass304_9030.method2996(i, 1875135057), 2082517705);
					if (i_95_ >= 0) {
						int i_101_ = Class448.aClass330_Sub50_5555.aClass464_Sub6_7882.method5757(65535);
						Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub6_7882, 1, 712398265);
						client.aClass304_9030.method3001((byte) 59).method2711(Class361.aClass_ra3793, i_100_, i, i_93_, i_94_, i_95_, i_96_, i_97_, client.aClass304_9030.method2996(i, 1875135057), i_98_, 291744390);
						Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub6_7882, i_101_, -1402163528);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wu.f(").append(')').toString());
		}
	}

	static final void method6380(Class430 class430, byte i) {
		try {
			int i_102_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_102_, -17131347);
			Class120 class120 = Class3.aClass120Array56[i_102_ >> 16];
			Class384.method4422(iComponentDefinitions, class120, class430, -2137936648);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wu.fv(").append(')').toString());
		}
	}

	static final void method6381(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_103_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_104_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_103_ & i_104_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wu.zu(").append(')').toString());
		}
	}
}
