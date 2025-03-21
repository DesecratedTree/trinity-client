/* Class325_Sub3_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class325_Sub3_Sub1_Sub1 extends Class325_Sub3_Sub1 {
	short aShort10120;
	short aShort10121;
	short aShort10122;
	short aShort10123;
	int anInt10124;
	int anInt10125;
	short aShort10126;
	Class406 aClass406_10127;
	short aShort10128;

	void method3217() {
		int i = (((Class388) ((Class406) (((Class325_Sub3_Sub1_Sub1) this).aClass406_10127)).aClass388_4177).anInt3995);
		if ((((Class388) ((Class406) (((Class325_Sub3_Sub1_Sub1) this).aClass406_10127)).aClass388_4177).aClass325_Sub3_Sub1_Sub1Array3994[i]) != null)
			((Class388) ((Class406) (((Class325_Sub3_Sub1_Sub1) this).aClass406_10127)).aClass388_4177).aClass325_Sub3_Sub1_Sub1Array3994[i].method3221();
		((Class388) (((Class406) ((Class325_Sub3_Sub1_Sub1) this).aClass406_10127).aClass388_4177)).aClass325_Sub3_Sub1_Sub1Array3994[i] = this;
		((Class325_Sub3_Sub1_Sub1) this).aShort10121 = (short) ((Class388) (((Class406) ((Class325_Sub3_Sub1_Sub1) this).aClass406_10127).aClass388_4177)).anInt3995;
		((Class388) ((Class406) (((Class325_Sub3_Sub1_Sub1) this).aClass406_10127)).aClass388_4177).anInt3995 = i + 1 & 0x1fff;
		((Class406) ((Class325_Sub3_Sub1_Sub1) this).aClass406_10127).aClass467_4179.method5852(this, (byte) 1);
	}

	void method3218(Class406 class406, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, boolean bool, boolean bool_10_) {
		((Class325_Sub3_Sub1_Sub1) this).aClass406_10127 = class406;
		anInt9497 = i << 12;
		anInt9493 = i_0_ << 12;
		anInt9489 = i_1_ << 12;
		anInt9490 = i_7_;
		((Class325_Sub3_Sub1_Sub1) this).aShort10120 = ((Class325_Sub3_Sub1_Sub1) this).aShort10123 = (short) i_6_;
		anInt9494 = i_8_;
		anInt9492 = i_9_;
		aBoolean9496 = bool_10_;
		((Class325_Sub3_Sub1_Sub1) this).aShort10126 = (short) i_2_;
		((Class325_Sub3_Sub1_Sub1) this).aShort10122 = (short) i_3_;
		((Class325_Sub3_Sub1_Sub1) this).aShort10128 = (short) i_4_;
		((Class325_Sub3_Sub1_Sub1) this).anInt10125 = i_5_;
		aByte9488 = (((Class406) ((Class325_Sub3_Sub1_Sub1) this).aClass406_10127).aClass93_4178.aByte834);
		method3217();
	}

	void method3219(long l, int i) {
		((Class325_Sub3_Sub1_Sub1) this).aShort10123 -= i;
		if (((Class325_Sub3_Sub1_Sub1) this).aShort10123 <= 0)
			method3221();
		else {
			int i_11_ = anInt9497 >> 12;
			int i_12_ = anInt9493 >> 12;
			int i_13_ = anInt9489 >> 12;
			Class388 class388 = (((Class406) (((Class325_Sub3_Sub1_Sub1) this).aClass406_10127)).aClass388_4177);
			Class210 class210 = (((Class406) (((Class325_Sub3_Sub1_Sub1) this).aClass406_10127)).aClass210_4176);
			if (class210.anInt2044 * 182143239 != 0) {
				if ((((Class325_Sub3_Sub1_Sub1) this).aShort10120 - ((Class325_Sub3_Sub1_Sub1) this).aShort10123) <= class210.anInt2022 * 1274998635) {
					int i_14_ = ((anInt9490 >> 8 & 0xff00) + (((Class325_Sub3_Sub1_Sub1) this).anInt10124 >> 16 & 0xff) + class210.anInt2042 * -876696935 * i);
					int i_15_ = ((anInt9490 & 0xff00) + (((Class325_Sub3_Sub1_Sub1) this).anInt10124 >> 8 & 0xff) + class210.anInt2051 * -320648131 * i);
					int i_16_ = ((anInt9490 << 8 & 0xff00) + (((Class325_Sub3_Sub1_Sub1) this).anInt10124 & 0xff) + class210.anInt2052 * 1552415613 * i);
					if (i_14_ < 0)
						i_14_ = 0;
					else if (i_14_ > 65535)
						i_14_ = 65535;
					if (i_15_ < 0)
						i_15_ = 0;
					else if (i_15_ > 65535)
						i_15_ = 65535;
					if (i_16_ < 0)
						i_16_ = 0;
					else if (i_16_ > 65535)
						i_16_ = 65535;
					anInt9490 &= ~0xffffff;
					anInt9490 |= (((i_14_ & 0xff00) << 8) + (i_15_ & 0xff00) + ((i_16_ & 0xff00) >> 8));
					((Class325_Sub3_Sub1_Sub1) this).anInt10124 &= ~0xffffff;
					((Class325_Sub3_Sub1_Sub1) this).anInt10124 |= (((i_14_ & 0xff) << 16) + ((i_15_ & 0xff) << 8) + (i_16_ & 0xff));
				}
				if ((((Class325_Sub3_Sub1_Sub1) this).aShort10120 - ((Class325_Sub3_Sub1_Sub1) this).aShort10123) <= class210.anInt2023 * 1284743067) {
					int i_17_ = ((anInt9490 >> 16 & 0xff00) + (((Class325_Sub3_Sub1_Sub1) this).anInt10124 >> 24 & 0xff) + class210.anInt1989 * -1664227921 * i);
					if (i_17_ < 0)
						i_17_ = 0;
					else if (i_17_ > 65535)
						i_17_ = 65535;
					anInt9490 &= 0xffffff;
					anInt9490 |= (i_17_ & 0xff00) << 16;
					((Class325_Sub3_Sub1_Sub1) this).anInt10124 &= 0xffffff;
					((Class325_Sub3_Sub1_Sub1) this).anInt10124 |= (i_17_ & 0xff) << 24;
				}
			}
			if (class210.anInt1999 * -1723018725 != -1 && ((((Class325_Sub3_Sub1_Sub1) this).aShort10120 - ((Class325_Sub3_Sub1_Sub1) this).aShort10123) <= class210.anInt2054 * 115397281))
				((Class325_Sub3_Sub1_Sub1) this).anInt10125 += class210.anInt2055 * -1150564589 * i;
			if (class210.anInt2024 * 1303909117 != -1 && ((((Class325_Sub3_Sub1_Sub1) this).aShort10120 - ((Class325_Sub3_Sub1_Sub1) this).aShort10123) <= class210.anInt2056 * 1327988493))
				anInt9494 += class210.anInt2057 * -609807549 * i;
			double d = (double) ((Class325_Sub3_Sub1_Sub1) this).aShort10126;
			double d_18_ = (double) ((Class325_Sub3_Sub1_Sub1) this).aShort10122;
			double d_19_ = (double) ((Class325_Sub3_Sub1_Sub1) this).aShort10128;
			boolean bool = false;
			if (class210.anInt1997 * -358839855 == 1) {
				int i_20_ = (i_11_ - ((Class405) (((Class406) ((Class325_Sub3_Sub1_Sub1) this).aClass406_10127).aClass405_4182)).anInt4165 * 536331609);
				int i_21_ = (i_12_ - ((Class405) (((Class406) ((Class325_Sub3_Sub1_Sub1) this).aClass406_10127).aClass405_4182)).anInt4173 * 327971141);
				int i_22_ = (i_13_ - ((Class405) (((Class406) ((Class325_Sub3_Sub1_Sub1) this).aClass406_10127).aClass405_4182)).anInt4169 * -80060749);
				int i_23_ = ((int) Math.sqrt((double) (i_20_ * i_20_ + i_21_ * i_21_ + i_22_ * i_22_)) >> 2);
				long l_24_ = (long) (class210.anInt1998 * 1755209929 * i_23_ * i);
				((Class325_Sub3_Sub1_Sub1) this).anInt10125 -= ((long) ((Class325_Sub3_Sub1_Sub1) this).anInt10125 * l_24_) >> 18;
			} else if (class210.anInt1997 * -358839855 == 2) {
				int i_25_ = (i_11_ - ((Class405) (((Class406) ((Class325_Sub3_Sub1_Sub1) this).aClass406_10127).aClass405_4182)).anInt4165 * 536331609);
				int i_26_ = (i_12_ - ((Class405) (((Class406) ((Class325_Sub3_Sub1_Sub1) this).aClass406_10127).aClass405_4182)).anInt4173 * 327971141);
				int i_27_ = (i_13_ - ((Class405) (((Class406) ((Class325_Sub3_Sub1_Sub1) this).aClass406_10127).aClass405_4182)).anInt4169 * -80060749);
				int i_28_ = i_25_ * i_25_ + i_26_ * i_26_ + i_27_ * i_27_;
				long l_29_ = (long) (class210.anInt1998 * 1755209929 * i_28_ * i);
				((Class325_Sub3_Sub1_Sub1) this).anInt10125 -= ((long) ((Class325_Sub3_Sub1_Sub1) this).anInt10125 * l_29_) >> 28;
			}
			if (class210.anIntArray2016 != null) {
				Iterator iterator = ((Class388) class388).aList4000.iterator();
				while (iterator.hasNext()) {
					Class330_Sub21 class330_sub21 = (Class330_Sub21) iterator.next();
					Class208 class208 = ((Class330_Sub21) class330_sub21).aClass208_7685;
					if (class208.anInt1968 * 1443671963 != 1) {
						boolean bool_30_ = false;
						for (int i_31_ = 0; i_31_ < class210.anIntArray2016.length; i_31_++) {
							if (class210.anIntArray2016[i_31_] == class208.anInt1967 * -905559703) {
								bool_30_ = true;
								break;
							}
						}
						if (bool_30_) {
							double d_32_ = (double) (i_11_ - (((Class330_Sub21) class330_sub21).anInt7686 * -1317420693));
							double d_33_ = (double) (i_12_ - (((Class330_Sub21) class330_sub21).anInt7687 * -84163125));
							double d_34_ = (double) (i_13_ - (((Class330_Sub21) class330_sub21).anInt7689 * 40126837));
							double d_35_ = (d_32_ * d_32_ + d_33_ * d_33_ + d_34_ * d_34_);
							if (!(d_35_ > (double) (class208.aLong1978 * -3534237462716707063L))) {
								double d_36_ = Math.sqrt(d_35_);
								if (d_36_ == 0.0)
									d_36_ = 1.0;
								double d_37_ = ((d_32_ * (double) (((Class330_Sub21) class330_sub21).aFloat7684) + d_33_ * (double) (class208.anInt1953 * -460016343) + d_34_ * (double) (((Class330_Sub21) class330_sub21).aFloat7688)) * 65535.0 / ((double) (class208.anInt1962 * -769927561) * d_36_));
								if (!(d_37_ < (double) (class208.anInt1980 * -303133911))) {
									double d_38_ = 0.0;
									if (class208.anInt1959 * -117675743 == 1)
										d_38_ = (d_36_ / 16.0 * (double) (class208.anInt1974 * 624635041));
									else if (class208.anInt1959 * -117675743 == 2)
										d_38_ = (d_36_ / 16.0 * (d_36_ / 16.0) * (double) (class208.anInt1974 * 624635041));
									if (class208.anInt1976 * 480358899 == 0) {
										if (class208.anInt1965 * 880559601 == 0) {
											d += ((double) (((Class330_Sub21) class330_sub21).aFloat7684) - d_38_) * (double) i;
											d_18_ += ((double) ((class208.anInt1953) * -460016343) - d_38_) * (double) i;
											d_19_ += ((double) (((Class330_Sub21) class330_sub21).aFloat7688) - d_38_) * (double) i;
											bool = true;
										} else {
											anInt9497 += ((double) (((Class330_Sub21) class330_sub21).aFloat7684) - d_38_) * (double) i;
											anInt9493 += ((double) ((class208.anInt1953) * -460016343) - d_38_) * (double) i;
											anInt9489 += ((double) (((Class330_Sub21) class330_sub21).aFloat7688) - d_38_) * (double) i;
										}
									} else {
										double d_39_ = (d_32_ / d_36_ * (double) (class208.anInt1962 * -769927561));
										double d_40_ = (d_33_ / d_36_ * (double) (class208.anInt1962 * -769927561));
										double d_41_ = (d_34_ / d_36_ * (double) (class208.anInt1962 * -769927561));
										if (class208.anInt1965 * 880559601 == 0) {
											d += d_39_ * (double) i;
											d_18_ += d_40_ * (double) i;
											d_19_ += d_41_ * (double) i;
											bool = true;
										} else {
											anInt9497 += d_39_ * (double) i;
											anInt9493 += d_40_ * (double) i;
											anInt9489 += d_41_ * (double) i;
										}
									}
								}
							}
						}
					}
				}
			}
			if (class210.anIntArray2017 != null) {
				for (int i_42_ = 0; i_42_ < class210.anIntArray2017.length; i_42_++) {
					Class330_Sub21 class330_sub21 = ((Class330_Sub21) (Class391.aClass497_4062.method6094((long) class210.anIntArray2017[i_42_])));
					while (class330_sub21 != null) {
						Class208 class208 = ((Class330_Sub21) class330_sub21).aClass208_7685;
						double d_43_ = (double) (i_11_ - (((Class330_Sub21) class330_sub21).anInt7686) * -1317420693);
						double d_44_ = (double) (i_12_ - (((Class330_Sub21) class330_sub21).anInt7687) * -84163125);
						double d_45_ = (double) (i_13_ - (((Class330_Sub21) class330_sub21).anInt7689) * 40126837);
						double d_46_ = d_43_ * d_43_ + d_44_ * d_44_ + d_45_ * d_45_;
						if (d_46_ > (double) (class208.aLong1978 * -3534237462716707063L))
							class330_sub21 = (Class330_Sub21) Class391.aClass497_4062.method6095(1390003649);
						else {
							double d_47_ = Math.sqrt(d_46_);
							if (d_47_ == 0.0)
								d_47_ = 1.0;
							double d_48_ = ((d_43_ * (double) (((Class330_Sub21) class330_sub21).aFloat7684) + d_44_ * (double) (class208.anInt1953 * -460016343) + d_45_ * (double) (((Class330_Sub21) class330_sub21).aFloat7688)) * 65535.0 / ((double) (class208.anInt1962 * -769927561) * d_47_));
							if (d_48_ < (double) (class208.anInt1980 * -303133911))
								class330_sub21 = ((Class330_Sub21) Class391.aClass497_4062.method6095(101274128));
							else {
								double d_49_ = 0.0;
								if (class208.anInt1959 * -117675743 == 1)
									d_49_ = (d_47_ / 16.0 * (double) (class208.anInt1974 * 624635041));
								else if (class208.anInt1959 * -117675743 == 2)
									d_49_ = (d_47_ / 16.0 * (d_47_ / 16.0) * (double) (class208.anInt1974 * 624635041));
								if (class208.anInt1976 * 480358899 == 0) {
									if (class208.anInt1965 * 880559601 == 0) {
										d += ((double) (((Class330_Sub21) class330_sub21).aFloat7684) - d_49_) * (double) i;
										d_18_ += ((double) (class208.anInt1953 * -460016343) - d_49_) * (double) i;
										d_19_ += ((double) (((Class330_Sub21) class330_sub21).aFloat7688) - d_49_) * (double) i;
										bool = true;
									} else {
										anInt9497 += ((double) (((Class330_Sub21) class330_sub21).aFloat7684) - d_49_) * (double) i;
										anInt9493 += ((double) (class208.anInt1953 * -460016343) - d_49_) * (double) i;
										anInt9489 += ((double) (((Class330_Sub21) class330_sub21).aFloat7688) - d_49_) * (double) i;
									}
								} else {
									double d_50_ = (d_43_ / d_47_ * (double) (class208.anInt1962 * -769927561));
									double d_51_ = (d_44_ / d_47_ * (double) (class208.anInt1962 * -769927561));
									double d_52_ = (d_45_ / d_47_ * (double) (class208.anInt1962 * -769927561));
									if (class208.anInt1965 * 880559601 == 0) {
										d += d_50_ * (double) i;
										d_18_ += d_51_ * (double) i;
										d_19_ += d_52_ * (double) i;
										bool = true;
									} else {
										anInt9497 += d_50_ * (double) i;
										anInt9493 += d_51_ * (double) i;
										anInt9489 += d_52_ * (double) i;
									}
								}
								class330_sub21 = ((Class330_Sub21) Class391.aClass497_4062.method6095(1220121017));
							}
						}
					}
				}
			}
			if (class210.anIntArray2018 != null) {
				if (class210.anIntArray2019 == null) {
					class210.anIntArray2019 = new int[class210.anIntArray2018.length];
					for (int i_53_ = 0; i_53_ < class210.anIntArray2018.length; i_53_++) {
						Class539.method6326(class210.anIntArray2018[i_53_], -40784406);
						class210.anIntArray2019[i_53_] = (((Class330_Sub23) (Class208.aClass497_1964.method6094((long) class210.anIntArray2018[i_53_]))).anInt7693) * 393599711;
					}
				}
				for (int i_54_ = 0; i_54_ < class210.anIntArray2019.length; i_54_++) {
					Class208 class208 = (Class208.aClass208Array1963[class210.anIntArray2019[i_54_]]);
					if (class208.anInt1965 * 880559601 == 0) {
						d += (double) (class208.anInt1970 * 2018198101 * i);
						d_18_ += (double) (class208.anInt1953 * -460016343 * i);
						d_19_ += (double) (class208.anInt1972 * -602604801 * i);
						bool = true;
					} else {
						anInt9497 += class208.anInt1970 * 2018198101 * i;
						anInt9493 += class208.anInt1953 * -460016343 * i;
						anInt9489 += class208.anInt1972 * -602604801 * i;
					}
				}
			}
			if (bool) {
				while (d > 32767.0 || d_18_ > 32767.0 || d_19_ > 32767.0 || d < -32767.0 || d_18_ < -32767.0 || d_19_ < -32767.0) {
					d /= 2.0;
					d_18_ /= 2.0;
					d_19_ /= 2.0;
					((Class325_Sub3_Sub1_Sub1) this).anInt10125 <<= 1;
				}
				((Class325_Sub3_Sub1_Sub1) this).aShort10126 = (short) (int) d;
				((Class325_Sub3_Sub1_Sub1) this).aShort10122 = (short) (int) d_18_;
				((Class325_Sub3_Sub1_Sub1) this).aShort10128 = (short) (int) d_19_;
			}
			anInt9497 += (((long) ((Class325_Sub3_Sub1_Sub1) this).aShort10126 * (long) (((Class325_Sub3_Sub1_Sub1) this).anInt10125 << 2)) >> 23) * (long) i;
			anInt9493 += (((long) ((Class325_Sub3_Sub1_Sub1) this).aShort10122 * (long) (((Class325_Sub3_Sub1_Sub1) this).anInt10125 << 2)) >> 23) * (long) i;
			anInt9489 += (((long) ((Class325_Sub3_Sub1_Sub1) this).aShort10128 * (long) (((Class325_Sub3_Sub1_Sub1) this).anInt10125 << 2)) >> 23) * (long) i;
		}
	}

	void method3220(Class356 class356, Class_ra class_ra, long l) {
		int i = anInt9497 >> 12 + class356.anInt3641 * 916917461;
		int i_55_ = anInt9489 >> 12 + class356.anInt3641 * 916917461;
		int i_56_ = anInt9493 >> 12;
		if (i_56_ > 262144 || i_56_ < -262144 || i < 0 || i >= class356.anInt3667 * -265955713 || i_55_ < 0 || i_55_ >= class356.anInt3654 * 95955317)
			method3221();
		else {
			Class388 class388 = (((Class406) (((Class325_Sub3_Sub1_Sub1) this).aClass406_10127)).aClass388_4177);
			Class210 class210 = (((Class406) (((Class325_Sub3_Sub1_Sub1) this).aClass406_10127)).aClass210_4176);
			Class_xa[] class_xas = class356.aClass_xaArray3676;
			int i_57_ = ((Class388) class388).anInt4004;
			Class340 class340 = (class356.aClass340ArrayArrayArray3653[((Class388) class388).anInt4004][i][i_55_]);
			if (class340 != null)
				i_57_ = class340.aByte3381;
			int i_58_ = class_xas[i_57_].method6417(i, i_55_, 1230044336);
			int i_59_;
			if (i_57_ < class356.anInt3650 * 1886598059 - 1)
				i_59_ = class_xas[i_57_ + 1].method6417(i, i_55_, 1604783685);
			else
				i_59_ = i_58_ - (8 << class356.anInt3641 * 916917461);
			if (class210.aBoolean2035) {
				if (class210.anInt2021 * 1407400653 == -1 && i_56_ > i_58_) {
					method3221();
					return;
				}
				if (class210.anInt2021 * 1407400653 >= 0 && i_56_ > class_xas[class210.anInt2021 * 1407400653].method6417(i, i_55_, 1362596885)) {
					method3221();
					return;
				}
				if (class210.anInt2053 * 1072133629 == -1 && i_56_ < i_59_) {
					method3221();
					return;
				}
				if (class210.anInt2053 * 1072133629 >= 0 && i_56_ < class_xas[class210.anInt2053 * 1072133629 + 1].method6417(i, i_55_, 218365687)) {
					method3221();
					return;
				}
			}
			int i_60_;
			for (i_60_ = class356.anInt3650 * 1886598059 - 1; (i_60_ > 0 && i_56_ > class_xas[i_60_].method6417(i, i_55_, 326686185)); i_60_--) {
				/* empty */
			}
			if (class210.aBoolean2034 && i_60_ == 0 && i_56_ > class_xas[0].method6417(i, i_55_, 880417465))
				method3221();
			else if (i_60_ == class356.anInt3650 * 1886598059 - 1 && (class_xas[i_60_].method6417(i, i_55_, 152523206) - i_56_) > 8 << class356.anInt3641 * 916917461)
				method3221();
			else {
				class340 = class356.aClass340ArrayArrayArray3653[i_60_][i][i_55_];
				if (class340 == null) {
					if (i_60_ == 0 || (class356.aClass340ArrayArrayArray3653[0][i][i_55_] == null))
						class340 = class356.aClass340ArrayArrayArray3653[0][i][i_55_] = new Class340(0);
					boolean bool = ((class356.aClass340ArrayArrayArray3653[0][i][i_55_].aClass340_3380) != null);
					if (i_60_ == 3 && bool) {
						method3221();
						return;
					}
					for (int i_61_ = 1; i_61_ <= i_60_; i_61_++) {
						if ((class356.aClass340ArrayArrayArray3653[i_61_][i][i_55_]) == null) {
							class340 = class356.aClass340ArrayArrayArray3653[i_61_][i][i_55_] = new Class340(i_61_);
							if (bool)
								class340.aByte3381++;
						}
					}
				}
				if (class210.aBoolean2026) {
					int i_62_ = anInt9497 >> 12;
					int i_63_ = anInt9489 >> 12;
					if (class340.aClass432_Sub1_Sub5_3382 != null) {
						Class348 class348 = class340.aClass432_Sub1_Sub5_3382.method5383(class_ra, -296919301);
						if (class348 != null && class348.method4019(i_62_, i_56_, i_63_)) {
							method3221();
							return;
						}
					}
					if (class340.aClass432_Sub1_Sub5_3383 != null) {
						Class348 class348 = class340.aClass432_Sub1_Sub5_3383.method5383(class_ra, -296919301);
						if (class348 != null && class348.method4019(i_62_, i_56_, i_63_)) {
							method3221();
							return;
						}
					}
					if (class340.aClass432_Sub1_Sub4_3386 != null) {
						Class348 class348 = class340.aClass432_Sub1_Sub4_3386.method5383(class_ra, -296919301);
						if (class348 != null && class348.method4019(i_62_, i_56_, i_63_)) {
							method3221();
							return;
						}
					}
					for (Class352 class352 = class340.aClass352_3388; class352 != null; class352 = class352.aClass352_3483) {
						Class348 class348 = class352.aClass432_Sub1_Sub1_3484.method5383(class_ra, -296919301);
						if (class348 != null && class348.method4019(i_62_, i_56_, i_63_)) {
							method3221();
							return;
						}
					}
				}
				((Class388) class388).aClass81_3996.aClass461_675.method5693(this, -56061671);
			}
		}
	}

	Class325_Sub3_Sub1_Sub1(Class406 class406, int i, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_, boolean bool, boolean bool_74_) {
		((Class325_Sub3_Sub1_Sub1) this).aClass406_10127 = class406;
		anInt9497 = i << 12;
		anInt9493 = i_64_ << 12;
		anInt9489 = i_65_ << 12;
		anInt9490 = i_71_;
		((Class325_Sub3_Sub1_Sub1) this).aShort10120 = ((Class325_Sub3_Sub1_Sub1) this).aShort10123 = (short) i_70_;
		anInt9494 = i_72_;
		anInt9492 = i_73_;
		aBoolean9496 = bool_74_;
		((Class325_Sub3_Sub1_Sub1) this).aShort10126 = (short) i_66_;
		((Class325_Sub3_Sub1_Sub1) this).aShort10122 = (short) i_67_;
		((Class325_Sub3_Sub1_Sub1) this).aShort10128 = (short) i_68_;
		((Class325_Sub3_Sub1_Sub1) this).anInt10125 = i_69_;
		aByte9488 = (((Class406) ((Class325_Sub3_Sub1_Sub1) this).aClass406_10127).aClass93_4178.aByte834);
		method3217();
	}

	void method3221() {
		((Class388) ((Class406) (((Class325_Sub3_Sub1_Sub1) this).aClass406_10127)).aClass388_4177).aClass325_Sub3_Sub1_Sub1Array3994[((Class325_Sub3_Sub1_Sub1) this).aShort10121] = null;
		Class391.aClass325_Sub3_Sub1_Sub1Array4052[(Class391.anInt4055 * 2094566277)] = this;
		Class391.anInt4055 = (Class391.anInt4055 * 2094566277 + 1 & 0x3ff) * -702171827;
		method3204(364680980);
		method3216((byte) -74);
	}
}
