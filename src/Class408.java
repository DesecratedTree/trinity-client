/* Class408 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class408 {
	public static short[][] modelColors;
	public static int anInt4200 = -2147483648;
	static int anInt4201 = 1073741823;
	static Class367 aClass367_4202;
	int[] anIntArray4203;
	ItemEquipDefinitions[] aClass518Array4204;
	public int[] anIntArray4205;
	public static int anInt4206 = 1073741824;
	static Class367 aClass367_4207;
	long aLong4208;
	long aLong4209;
	public int anInt4210 = -1218194931;
	public static short[][][] modifiedModelColors;
	static int[] anIntArray4212 = { 8, 11, 4, 6, 9, 7, 10, 0 };
	public boolean aBoolean4213;
	int anInt4214;

	public void method4757(int i, int[] is, ItemEquipDefinitions[] class518s, int[] is_0_, boolean bool, int i_1_, int i_2_) {
		try {
			if (((Class408) this).anInt4214 * -1023331473 != i)
				((Class408) this).anInt4214 = -343307377 * i;
			((Class408) this).anIntArray4203 = is;
			((Class408) this).aClass518Array4204 = class518s;
			anIntArray4205 = is_0_;
			aBoolean4213 = bool;
			anInt4210 = 1218194931 * i_1_;
			method4761(421989841);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qy.r(").append(')').toString());
		}
	}

	public void method4758(int i, int i_3_, int i_4_) {
		try {
			anIntArray4205[i] = i_3_;
			method4761(1029170245);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qy.i(").append(')').toString());
		}
	}

	public Class387 method4759(Class_ra class_ra, int i, Class169 class169, Class436 class436, Class477 class477, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			int i_9_ = null != class477 ? i | class477.method5975(-1598257004) : i;
			long l = (long) i_7_ << 32 | (long) (i_6_ << 16) | (long) i_5_;
			Class387 class387;
			synchronized (aClass367_4207) {
				class387 = (Class387) aClass367_4207.get(l);
			}
			do {
				if (null == class387 || class_ra.ct(class387.m(), i_9_) != 0) {
					if (class387 != null)
						i_9_ = class_ra.cd(i_9_, class387.m());
					int i_10_ = i_9_;
					Model[] class98s = new Model[3];
					int i_11_ = 0;
					if (class169.method2031(i_5_, (byte) -1).method1777((short) 22129) && class169.method2031(i_6_, (byte) -1).method1777((short) -4092) && class169.method2031(i_7_, (byte) -1).method1777((short) 20662)) {
						Model class98 = class169.method2031(i_5_, (byte) -1).method1778(-218128777);
						if (null != class98)
							class98s[i_11_++] = class98;
						class98 = class169.method2031(i_6_, (byte) -1).method1778(1772154646);
						if (class98 != null)
							class98s[i_11_++] = class98;
						class98 = class169.method2031(i_7_, (byte) -1).method1778(-750129393);
						if (null != class98)
							class98s[i_11_++] = class98;
						class98 = new Model(class98s, i_11_);
						i_10_ |= 0x4000;
						class387 = class_ra.cb(class98, i_10_, Class132.anInt1506 * -1224986751, 64, 768);
						for (int i_12_ = 0; i_12_ < 10; i_12_++) {
							for (int i_13_ = 0; i_13_ < modelColors[i_12_].length; i_13_++) {
								if (anIntArray4205[i_12_] < (modifiedModelColors[i_12_][i_13_]).length)
									class387.color((modelColors[i_12_][i_13_]), (modifiedModelColors[i_12_][i_13_][anIntArray4205[i_12_]]));
							}
						}
						class387.KA(i_9_);
						synchronized (aClass367_4207) {
							aClass367_4207.put(class387, l);
							break;
						}
					}
					return null;
				}
			} while (false);
			if (class477 == null)
				return class387;
			class387 = class387.method4446((byte) 4, i_9_, true);
			class477.method5976(class387, 0, 1902067144);
			return class387;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qy.w(").append(')').toString());
		}
	}

	public void method4760(int i, int i_14_, Class510 class510, int i_15_) {
		try {
			if (i_14_ == -1)
				((Class408) this).anIntArray4203[i] = 0;
			else if (class510.getItemDefinitions(i_14_, (byte) -123) != null) {
				((Class408) this).anIntArray4203[i] = i_14_ | 0x40000000;
				method4761(1297997246);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qy.o(").append(')').toString());
		}
	}

	void method4761(int i) {
		try {
			long[] ls = Buffer.aLongArray7850;
			((Class408) this).aLong4208 = 6646910376059525283L;
			((Class408) this).aLong4208 = (-8600325372958120715L * ((Class408) this).aLong4208 >>> 8 ^ ls[(int) (((((Class408) this).aLong4208 * -8600325372958120715L) ^ (long) ((-1023331473 * ((Class408) this).anInt4214) >> 8)) & 0xffL)]) * -6646910376059525283L;
			((Class408) this).aLong4208 = (-6646910376059525283L * (-8600325372958120715L * ((Class408) this).aLong4208 >>> 8 ^ ls[(int) (((-8600325372958120715L * ((Class408) this).aLong4208) ^ (long) (-1023331473 * ((Class408) this).anInt4214)) & 0xffL)]));
			for (int i_16_ = 0; i_16_ < ((Class408) this).anIntArray4203.length; i_16_++) {
				((Class408) this).aLong4208 = ((((Class408) this).aLong4208 * -8600325372958120715L >>> 8) ^ ls[(int) (((-8600325372958120715L * ((Class408) this).aLong4208) ^ (long) ((((Class408) this).anIntArray4203[i_16_]) >> 24)) & 0xffL)]) * -6646910376059525283L;
				((Class408) this).aLong4208 = ((((Class408) this).aLong4208 * -8600325372958120715L >>> 8) ^ ls[(int) (((-8600325372958120715L * ((Class408) this).aLong4208) ^ (long) ((((Class408) this).anIntArray4203[i_16_]) >> 16)) & 0xffL)]) * -6646910376059525283L;
				((Class408) this).aLong4208 = (-6646910376059525283L * ((((Class408) this).aLong4208 * -8600325372958120715L >>> 8) ^ ls[(int) (((-8600325372958120715L * ((Class408) this).aLong4208) ^ (long) ((((Class408) this).anIntArray4203[i_16_]) >> 8)) & 0xffL)]));
				((Class408) this).aLong4208 = (-6646910376059525283L * ((-8600325372958120715L * ((Class408) this).aLong4208 >>> 8) ^ ls[(int) (((((Class408) this).aLong4208 * -8600325372958120715L) ^ (long) (((Class408) this).anIntArray4203[i_16_])) & 0xffL)]));
			}
			if (null != ((Class408) this).aClass518Array4204) {
				for (int i_17_ = 0; i_17_ < ((Class408) this).aClass518Array4204.length; i_17_++) {
					if (((Class408) this).aClass518Array4204[i_17_] != null) {
						int[] is;
						int[] is_18_;
						if (aBoolean4213) {
							is = (((Class408) this).aClass518Array4204[i_17_].femaleEquipIds);
							is_18_ = (((Class408) this).aClass518Array4204[i_17_].archiveIds);
						} else {
							is = (((Class408) this).aClass518Array4204[i_17_].maleEquipIds);
							is_18_ = (((Class408) this).aClass518Array4204[i_17_].archiveIds2);
						}
						if (is != null) {
							for (int i_19_ = 0; i_19_ < is.length; i_19_++) {
								((Class408) this).aLong4208 = (-6646910376059525283L * ((-8600325372958120715L * ((Class408) this).aLong4208) >>> 8 ^ ls[(int) (((-8600325372958120715L * (((Class408) this).aLong4208)) ^ (long) (is[i_19_] >> 8)) & 0xffL)]));
								((Class408) this).aLong4208 = (-6646910376059525283L * ((-8600325372958120715L * ((Class408) this).aLong4208) >>> 8 ^ (ls[(int) ((((((Class408) this).aLong4208) * -8600325372958120715L) ^ (long) is[i_19_]) & 0xffL)])));
							}
						}
						if (is_18_ != null) {
							for (int i_20_ = 0; i_20_ < is_18_.length; i_20_++) {
								((Class408) this).aLong4208 = (-6646910376059525283L * ((-8600325372958120715L * ((Class408) this).aLong4208) >>> 8 ^ (ls[(int) ((((((Class408) this).aLong4208) * -8600325372958120715L) ^ (long) (is_18_[i_20_] >> 8)) & 0xffL)])));
								((Class408) this).aLong4208 = (((-8600325372958120715L * ((Class408) this).aLong4208) >>> 8 ^ ls[(int) (((-8600325372958120715L * (((Class408) this).aLong4208)) ^ (long) is_18_[i_20_]) & 0xffL)]) * -6646910376059525283L);
							}
						}
						if ((((Class408) this).aClass518Array4204[i_17_].moreModifiedColors) != null) {
							for (int i_21_ = 0; i_21_ < (((Class408) this).aClass518Array4204[i_17_].moreModifiedColors).length; i_21_++) {
								((Class408) this).aLong4208 = (((-8600325372958120715L * ((Class408) this).aLong4208) >>> 8 ^ (ls[(int) ((((((Class408) this).aLong4208) * -8600325372958120715L) ^ (long) ((((Class408) this).aClass518Array4204[i_17_].moreModifiedColors[i_21_]) >> 8)) & 0xffL)])) * -6646910376059525283L);
								((Class408) this).aLong4208 = (-6646910376059525283L * ((-8600325372958120715L * ((Class408) this).aLong4208) >>> 8 ^ (ls[(int) (((-8600325372958120715L * (((Class408) this).aLong4208)) ^ (long) (((Class408) this).aClass518Array4204[i_17_].moreModifiedColors[i_21_])) & 0xffL)])));
							}
						}
						if (null != (((Class408) this).aClass518Array4204[i_17_].aShortArray6009)) {
							for (int i_22_ = 0; i_22_ < (((Class408) this).aClass518Array4204[i_17_].aShortArray6009).length; i_22_++) {
								((Class408) this).aLong4208 = (((-8600325372958120715L * ((Class408) this).aLong4208) >>> 8 ^ (ls[(int) (((-8600325372958120715L * (((Class408) this).aLong4208)) ^ (long) ((((Class408) this).aClass518Array4204[i_17_].aShortArray6009[i_22_]) >> 8)) & 0xffL)])) * -6646910376059525283L);
								((Class408) this).aLong4208 = (((((Class408) this).aLong4208 * -8600325372958120715L) >>> 8 ^ (ls[(int) ((((((Class408) this).aLong4208) * -8600325372958120715L) ^ (long) (((Class408) this).aClass518Array4204[i_17_].aShortArray6009[i_22_])) & 0xffL)])) * -6646910376059525283L);
							}
						}
					}
				}
			}
			for (int i_23_ = 0; i_23_ < 10; i_23_++)
				((Class408) this).aLong4208 = (-6646910376059525283L * ((-8600325372958120715L * ((Class408) this).aLong4208 >>> 8) ^ ls[(int) (((-8600325372958120715L * ((Class408) this).aLong4208) ^ (long) anIntArray4205[i_23_]) & 0xffL)]));
			((Class408) this).aLong4208 = (-6646910376059525283L * (((Class408) this).aLong4208 * -8600325372958120715L >>> 8 ^ ls[(int) (((((Class408) this).aLong4208 * -8600325372958120715L) ^ (long) (aBoolean4213 ? 1 : 0)) & 0xffL)]));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qy.s(").append(')').toString());
		}
	}

	public Class387 method4762(Class_ra class_ra, int i, Class362 class362, Class169 class169, Class553 class553, Class510 class510, Class436 class436, Interface29 interface29, Class477 class477, Class477 class477_24_, Class477[] class477s, int[] is, int i_25_, boolean bool, Class421 class421, byte i_26_) {
		try {
			if (1648243515 * anInt4210 != -1)
				return (class553.method6392(1648243515 * anInt4210, 353699731).method6366(class_ra, i, class362, interface29, class477, class477_24_, class477s, is, i_25_, null, 550173571));
			int i_27_ = i;
			long l = ((Class408) this).aLong4208 * -8600325372958120715L;
			int[] is_28_ = ((Class408) this).anIntArray4203;
			boolean bool_29_ = false;
			boolean bool_30_ = false;
			if (class477 != null) {
				Class440 class440 = class477.method5986((byte) -70);
				if (class440 != null && (class440.anInt4474 * 1737111375 >= 0 || class440.anInt4462 * 1997090921 >= 0)) {
					is_28_ = new int[((Class408) this).anIntArray4203.length];
					for (int i_31_ = 0; i_31_ < is_28_.length; i_31_++)
						is_28_[i_31_] = ((Class408) this).anIntArray4203[i_31_];
					if (1737111375 * class440.anInt4474 >= 0 && class421.anInt4316 * 851828329 != -1) {
						bool_29_ = true;
						if (65535 == class440.anInt4474 * 1737111375) {
							is_28_[851828329 * class421.anInt4316] = 0;
							for (int i_32_ = 0; i_32_ < class421.anIntArray4314.length; i_32_++)
								is_28_[class421.anIntArray4314[i_32_]] = 0;
							l ^= ~0xffffffffL;
						} else {
							is_28_[class421.anInt4316 * 851828329] = class440.anInt4474 * 1737111375 | 0x40000000;
							for (int i_33_ = 0; i_33_ < class421.anIntArray4314.length; i_33_++)
								is_28_[class421.anIntArray4314[i_33_]] = 0;
							l ^= ((long) is_28_[851828329 * class421.anInt4316] << 32);
						}
					}
					if (1997090921 * class440.anInt4462 >= 0 && 755774931 * class421.anInt4310 != -1) {
						bool_30_ = true;
						if (1997090921 * class440.anInt4462 == 65535) {
							is_28_[class421.anInt4310 * 755774931] = 0;
							for (int i_34_ = 0; i_34_ < class421.anIntArray4317.length; i_34_++)
								is_28_[class421.anIntArray4317[i_34_]] = 0;
							l ^= 0xffffffffL;
						} else {
							is_28_[class421.anInt4310 * 755774931] = class440.anInt4462 * 1997090921 | 0x40000000;
							for (int i_35_ = 0; i_35_ < class421.anIntArray4317.length; i_35_++)
								is_28_[class421.anIntArray4317[i_35_]] = 0;
							l ^= (long) is_28_[755774931 * class421.anInt4310];
						}
					}
				}
			}
			boolean bool_36_ = false;
			int i_37_ = class477s != null ? class477s.length : 0;
			for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
				if (null != class477s[i_38_]) {
					i_27_ |= class477s[i_38_].method5975(-1188082523);
					bool_36_ = true;
				}
			}
			if (class477 != null) {
				i_27_ |= class477.method5975(-1557620791);
				bool_36_ = true;
			}
			if (class477_24_ != null) {
				i_27_ |= class477_24_.method5975(-1595693933);
				bool_36_ = true;
			}
			boolean bool_39_ = false;
			if (null != is) {
				for (int i_40_ = 0; i_40_ < is.length; i_40_++) {
					if (is[i_40_] != -1) {
						i_27_ |= 0x20;
						bool_39_ = true;
					}
				}
			}
			Class387 class387;
			synchronized (aClass367_4202) {
				class387 = (Class387) aClass367_4202.get(l);
			}
			Class364 class364 = null;
			if (-1 != ((Class408) this).anInt4214 * -1023331473)
				class364 = class362.method4254((((Class408) this).anInt4214 * -1023331473), 780247335);
			if (null == class387 || class_ra.ct(class387.m(), i_27_) != 0) {
				if (null != class387)
					i_27_ = class_ra.cd(i_27_, class387.m());
				int i_41_ = i_27_;
				boolean bool_42_ = false;
				for (int i_43_ = 0; i_43_ < is_28_.length; i_43_++) {
					int i_44_ = is_28_[i_43_];
					ItemEquipDefinitions class518 = null;
					boolean bool_45_ = false;
					if (bool_29_) {
						if (i_43_ == 851828329 * class421.anInt4316)
							bool_45_ = true;
						else {
							for (int i_46_ = 0; i_46_ < class421.anIntArray4314.length; i_46_++) {
								if (class421.anIntArray4314[i_46_] == i_43_) {
									bool_45_ = true;
									break;
								}
							}
						}
					}
					if (bool_30_) {
						if (i_43_ == 755774931 * class421.anInt4310)
							bool_45_ = true;
						else {
							for (int i_47_ = 0; i_47_ < class421.anIntArray4317.length; i_47_++) {
								if (class421.anIntArray4317[i_47_] == i_43_) {
									bool_45_ = true;
									break;
								}
							}
						}
					}
					if (0 != (i_44_ & 0x40000000)) {
						if (!bool_45_ && null != ((Class408) this).aClass518Array4204 && null != (((Class408) this).aClass518Array4204[i_43_]))
							class518 = ((Class408) this).aClass518Array4204[i_43_];
						if (!class510.getItemDefinitions(i_44_ & 0x3fffffff, (byte) -104).missingFile(aBoolean4213, class518, 1146675429))
							bool_42_ = true;
					} else if (0 != (i_44_ & ~0x7fffffff) && !class169.method2031(i_44_ & 0x3fffffff, (byte) -1).method1776(-941507301))
						bool_42_ = true;
				}
				if (bool_42_) {
					if (-1L != ((Class408) this).aLong4209 * 628887373775762719L) {
						synchronized (aClass367_4202) {
							class387 = (Class387) (aClass367_4202.get(((Class408) this).aLong4209 * 628887373775762719L));
						}
					}
					if (class387 == null || class_ra.ct(class387.m(), i_27_) != 0)
						return null;
				} else {
					Model[] class98s = new Model[is_28_.length];
					for (int i_48_ = 0; i_48_ < is_28_.length; i_48_++) {
						int i_49_ = is_28_[i_48_];
						ItemEquipDefinitions class518 = null;
						boolean bool_50_ = i_48_ == 5 && bool_29_ || 3 == i_48_ && bool_30_;
						if ((i_49_ & 0x40000000) != 0) {
							if (!bool_50_ && null != ((Class408) this).aClass518Array4204 && null != (((Class408) this).aClass518Array4204[i_48_]))
								class518 = (((Class408) this).aClass518Array4204[i_48_]);
							Model class98 = (class510.getItemDefinitions(i_49_ & 0x3fffffff, (byte) -117).getEquipmentInformation(aBoolean4213, class518, -439676113));
							if (null != class98)
								class98s[i_48_] = class98;
						} else if ((i_49_ & ~0x7fffffff) != 0) {
							Model class98 = class169.method2031(i_49_ & 0x3fffffff, (byte) -1).method1779((byte) 1);
							if (class98 != null)
								class98s[i_48_] = class98;
						}
					}
					if (class364 != null && null != class364.anIntArrayArray3807) {
						for (int i_51_ = 0; i_51_ < class364.anIntArrayArray3807.length; i_51_++) {
							if (null == class98s[i_51_]) {
								if (i_26_ >= 0) {
									/* empty */
								}
							} else {
								int i_52_ = 0;
								int i_53_ = 0;
								int i_54_ = 0;
								int i_55_ = 0;
								int i_56_ = 0;
								int i_57_ = 0;
								if (null != class364.anIntArrayArray3807[i_51_]) {
									i_52_ = (class364.anIntArrayArray3807[i_51_][0]);
									i_53_ = (class364.anIntArrayArray3807[i_51_][1]);
									i_54_ = (class364.anIntArrayArray3807[i_51_][2]);
									i_55_ = (class364.anIntArrayArray3807[i_51_][3]) << 3;
									i_56_ = (class364.anIntArrayArray3807[i_51_][4]) << 3;
									i_57_ = (class364.anIntArrayArray3807[i_51_][5]) << 3;
								}
								if (0 != i_55_ || i_56_ != 0 || 0 != i_57_)
									class98s[i_51_].method1195(i_55_, i_56_, i_57_);
								if (i_52_ != 0 || 0 != i_53_ || 0 != i_54_)
									class98s[i_51_].method1194(i_52_, i_53_, i_54_);
							}
						}
					}
					Model class98 = new Model(class98s, class98s.length);
					i_41_ |= 0x4000;
					class387 = class_ra.cb(class98, i_41_, -1224986751 * Class132.anInt1506, 64, 850);
					for (int i_58_ = 0; i_58_ < 10; i_58_++) {
						for (int i_59_ = 0; i_59_ < modelColors[i_58_].length; i_59_++) {
							if (anIntArray4205[i_58_] < (modifiedModelColors[i_58_][i_59_]).length)
								class387.color(modelColors[i_58_][i_59_], (modifiedModelColors[i_58_][i_59_][anIntArray4205[i_58_]]));
						}
					}
					if (bool) {
						class387.KA(i_27_);
						synchronized (aClass367_4202) {
							aClass367_4202.put(class387, l);
						}
						((Class408) this).aLong4209 = 6039853911722641119L * l;
					}
				}
			}
			Class387 class387_60_ = class387.method4446((byte) 4, i_27_, true);
			if (!bool_36_ && !bool_39_)
				return class387_60_;
			Class247[] class247s = null;
			if (class364 != null)
				class247s = class364.method4265(-1913882430);
			if (bool_39_ && class247s != null) {
				for (int i_61_ = 0; i_61_ < is.length; i_61_++) {
					if (class247s[i_61_] != null)
						class387_60_.method4488(class247s[i_61_], 1 << i_61_, true);
				}
			}
			int i_62_ = 0;
			int i_63_ = 1;
			while (i_62_ < i_37_) {
				if (class477s[i_62_] != null)
					class477s[i_62_].method5985(class387_60_, 0, i_63_, -2115574067);
				i_62_++;
				i_63_ <<= 1;
			}
			if (bool_39_) {
				for (i_62_ = 0; i_62_ < is.length; i_62_++) {
					if (-1 == is[i_62_]) {
						if (i_26_ >= 0)
							throw new IllegalStateException();
					} else {
						i_63_ = is[i_62_] - i_25_;
						i_63_ &= 0x3fff;
						Class247 class247 = new Class247();
						class247.method2473(0.0F, 1.0F, 0.0F, Class257.method2541(i_63_));
						class387_60_.method4488(class247, 1 << i_62_, false);
					}
				}
			}
			if (bool_39_ && null != class247s) {
				for (i_62_ = 0; i_62_ < is.length; i_62_++) {
					if (null != class247s[i_62_])
						class387_60_.method4488(class247s[i_62_], 1 << i_62_, false);
				}
			}
			if (class477 != null && null != class477_24_)
				Class111.method1368(class387_60_, class477, class477_24_, -962829138);
			else if (class477 != null)
				class477.method5976(class387_60_, 0, 65988315);
			else if (class477_24_ != null)
				class477_24_.method5976(class387_60_, 0, -755370773);
			return class387_60_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qy.f(").append(')').toString());
		}
	}

	static {
		aClass367_4202 = new Class367(260);
		aClass367_4207 = new Class367(5);
	}

	public void method4763(boolean bool, int i) {
		try {
			aBoolean4213 = bool;
			method4761(-578749264);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qy.p(").append(')').toString());
		}
	}

	public Class387 method4764(Class_ra class_ra, int i, Class169 class169, Class553 class553, Class510 class510, Class436 class436, Interface29 interface29, Class477 class477, byte i_64_) {
		try {
			if (-1 != 1648243515 * anInt4210) {
				if (i_64_ >= 0)
					throw new IllegalStateException();
				return (class553.method6392(anInt4210 * 1648243515, 152060119).method6368(class_ra, i, interface29, class477, null, 76438474));
			}
			int i_65_ = null != class477 ? i | class477.method5975(-1183186333) : i;
			Class387 class387;
			synchronized (aClass367_4207) {
				class387 = ((Class387) aClass367_4207.get(-8600325372958120715L * (((Class408) this).aLong4208)));
			}
			if (null == class387 || class_ra.ct(class387.m(), i_65_) != 0) {
				if (null != class387)
					i_65_ = class_ra.cd(i_65_, class387.m());
				int i_66_ = i_65_;
				boolean bool = false;
				for (int i_67_ = 0; i_67_ < ((Class408) this).anIntArray4203.length; i_67_++) {
					int i_68_ = ((Class408) this).anIntArray4203[i_67_];
					ItemEquipDefinitions class518 = null;
					if (0 != (i_68_ & 0x40000000)) {
						if (null != ((Class408) this).aClass518Array4204 && null != (((Class408) this).aClass518Array4204[i_67_]))
							class518 = ((Class408) this).aClass518Array4204[i_67_];
						if (!class510.getItemDefinitions(i_68_ & 0x3fffffff, (byte) -49).method6286(aBoolean4213, class518, 1790195679))
							bool = true;
					} else if ((i_68_ & ~0x7fffffff) != 0 && !class169.method2031(i_68_ & 0x3fffffff, (byte) -1).method1777((short) -583))
						bool = true;
				}
				if (bool)
					return null;
				Model[] class98s = new Model[((Class408) this).anIntArray4203.length];
				int i_69_ = 0;
				for (int i_70_ = 0; i_70_ < ((Class408) this).anIntArray4203.length; i_70_++) {
					int i_71_ = ((Class408) this).anIntArray4203[i_70_];
					ItemEquipDefinitions class518 = null;
					if (0 != (i_71_ & 0x40000000)) {
						if (null != ((Class408) this).aClass518Array4204 && null != (((Class408) this).aClass518Array4204[i_70_]))
							class518 = ((Class408) this).aClass518Array4204[i_70_];
						Model class98 = (class510.getItemDefinitions(i_71_ & 0x3fffffff, (byte) -7).getEquipmentInformation2(aBoolean4213, class518, (byte) 47));
						if (null != class98)
							class98s[i_69_++] = class98;
					} else if (0 != (i_71_ & ~0x7fffffff)) {
						Model class98 = class169.method2031(i_71_ & 0x3fffffff, (byte) -1).method1778(-1301059181);
						if (class98 != null)
							class98s[i_69_++] = class98;
					}
				}
				Model class98 = new Model(class98s, i_69_);
				i_66_ |= 0x4000;
				class387 = class_ra.cb(class98, i_66_, -1224986751 * Class132.anInt1506, 64, 768);
				for (int i_72_ = 0; i_72_ < 10; i_72_++) {
					for (int i_73_ = 0; i_73_ < modelColors[i_72_].length; i_73_++) {
						if (anIntArray4205[i_72_] < modifiedModelColors[i_72_][i_73_].length)
							class387.color(modelColors[i_72_][i_73_], (modifiedModelColors[i_72_][i_73_][anIntArray4205[i_72_]]));
					}
				}
				class387.KA(i_65_);
				synchronized (aClass367_4207) {
					aClass367_4207.put(class387, (((Class408) this).aLong4208 * -8600325372958120715L));
				}
			}
			if (null == class477)
				return class387;
			Class387 class387_74_ = class387.method4446((byte) 4, i_65_, true);
			class477.method5976(class387_74_, 0, 747808169);
			return class387_74_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qy.z(").append(')').toString());
		}
	}

	public void method4765(int i, int i_75_, Class169 class169, int i_76_) {
		try {
			int i_77_ = anIntArray4212[i];
			if (class169.method2031(i_75_, (byte) -1) != null) {
				((Class408) this).anIntArray4203[i_77_] = i_75_ | ~0x7fffffff;
				method4761(1645436933);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qy.j(").append(')').toString());
		}
	}

	static void method4766(int i) {
		try {
			if (Class457.aClass457_6837 != Class404.aClass457_4162)
				Class232.aClass232_2462.method2357(1209212315);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qy.nz(").append(')').toString());
		}
	}

	static final void method4767(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class285.method2861(iComponentDefinitions, class120, class430, 2136294518);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qy.ll(").append(')').toString());
		}
	}

	static void method4768(Class330_Sub36_Sub13 class330_sub36_sub13, int i) {
		try {
			boolean bool = false;
			class330_sub36_sub13.method3439((byte) -117);
			for (Class330_Sub36_Sub13 class330_sub36_sub13_78_ = ((Class330_Sub36_Sub13) Class484.aClass472_5793.method5884((byte) 22)); null != class330_sub36_sub13_78_; class330_sub36_sub13_78_ = ((Class330_Sub36_Sub13) Class484.aClass472_5793.method5886((short) 8192))) {
				if (Class232.method2361(class330_sub36_sub13.method3485((byte) 39), class330_sub36_sub13_78_.method3485((byte) 20), 1853612053)) {
					Class215.method2239(class330_sub36_sub13, class330_sub36_sub13_78_, -1994032275);
					bool = true;
					break;
				}
			}
			if (!bool)
				Class484.aClass472_5793.method5883(class330_sub36_sub13, -607920525);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qy.g(").append(')').toString());
		}
	}

	static final void method4769(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class375.method4354(iComponentDefinitions, class120, class430, (byte) -75);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qy.fh(").append(')').toString());
		}
	}
}
