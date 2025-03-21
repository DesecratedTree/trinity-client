/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class12 implements Interface8_Impl1_Impl2 {
	int anInt10074;
	int anInt10075;
	int[] anIntArray10076;
	static Class61[] aClass61Array10077;

	public int method57() {
		return ((Class12) this).anInt10075 * -917921863;
	}

	Class12(int i, int i_0_, int[] is) {
		((Class12) this).anInt10075 = i * -26429815;
		((Class12) this).anInt10074 = 736022019 * i_0_;
		((Class12) this).anIntArray10076 = is;
	}

	public void method52() {
		/* empty */
	}

	public int method55() {
		try {
			return ((Class12) this).anInt10074 * -78197589;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("am.i(").append(')').toString());
		}
	}

	public void method53() {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("am.p(").append(')').toString());
		}
	}

	Class12(int i, int i_1_) {
		this(i, i_1_, new int[i * i_1_]);
	}

	public int method61() {
		return ((Class12) this).anInt10074 * -78197589;
	}

	public int method56() {
		return ((Class12) this).anInt10075 * -917921863;
	}

	public int method59() {
		return ((Class12) this).anInt10074 * -78197589;
	}

	public int method60() {
		return ((Class12) this).anInt10074 * -78197589;
	}

	public int method54() {
		try {
			return ((Class12) this).anInt10075 * -917921863;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("am.r(").append(')').toString());
		}
	}

	public int method58() {
		return ((Class12) this).anInt10075 * -917921863;
	}

	static final void method434(Class430 class430, int i) {
		try {
			boolean bool = false;
			if (client.aBoolean9198) {
				try {
					Object object = (Class232.aClass232_2453.method2355((new Object[] { Integer.valueOf(-340927685 * Class284.anInt2928), (Boolean.valueOf(1 == (Class263_Sub2.myPlayer.female))), Integer.valueOf(((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) }), 522592630));
					if (null != object)
						bool = ((Boolean) object).booleanValue();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = bool ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("am.apo(").append(')').toString());
		}
	}

	public static void method435(Class330_Sub46_Sub2 class330_sub46_sub2, byte i) {
		try {
			Class330_Sub47 class330_sub47 = ((Class330_Sub47) Class520.aClass471_6016.method5869(539664854));
			if (null != class330_sub47) {
				int i_2_ = -824785231 * class330_sub46_sub2.offset;
				class330_sub46_sub2.addInt(173838349 * (((Class330_Sub47) class330_sub47).anInt7856), 1965508160);
				for (int i_3_ = 0; i_3_ < (((Class330_Sub47) class330_sub47).anInt7852 * -1406671615); i_3_++) {
					if (((Class330_Sub47) class330_sub47).anIntArray7851[i_3_] != 0)
						class330_sub46_sub2.addByte((((Class330_Sub47) class330_sub47).anIntArray7851[i_3_]), (byte) 83);
					else {
						try {
							int i_4_ = (((Class330_Sub47) class330_sub47).anIntArray7853[i_3_]);
							if (0 == i_4_) {
								Field field = (((Class330_Sub47) class330_sub47).aFieldArray7855[i_3_]);
								int i_5_ = field.getInt(null);
								class330_sub46_sub2.addByte(0, (byte) 89);
								class330_sub46_sub2.addInt(i_5_, 1965508160);
							} else if (1 == i_4_) {
								Field field = (((Class330_Sub47) class330_sub47).aFieldArray7855[i_3_]);
								field.setInt(null, (((Class330_Sub47) class330_sub47).anIntArray7854[i_3_]));
								class330_sub46_sub2.addByte(0, (byte) 47);
							} else if (i_4_ == 2) {
								Field field = (((Class330_Sub47) class330_sub47).aFieldArray7855[i_3_]);
								int i_6_ = field.getModifiers();
								class330_sub46_sub2.addByte(0, (byte) 1);
								class330_sub46_sub2.addInt(i_6_, 1965508160);
							}
							if (i_4_ == 3) {
								Method method = (((Class330_Sub47) class330_sub47).aMethodArray7857[i_3_]);
								byte[][] is = (((Class330_Sub47) class330_sub47).aByteArrayArrayArray7858[i_3_]);
								Object[] objects = new Object[is.length];
								for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
									ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_7_])));
									objects[i_7_] = objectinputstream.readObject();
								}
								Object object = method.invoke(null, objects);
								if (null == object)
									class330_sub46_sub2.addByte(0, (byte) 108);
								else if (object instanceof Number) {
									class330_sub46_sub2.addByte(1, (byte) 49);
									class330_sub46_sub2.writeInt64BE(((Number) object).longValue());
								} else if (object instanceof String) {
									class330_sub46_sub2.addByte(2, (byte) 127);
									class330_sub46_sub2.addString(((String) object), (byte) -58);
								} else
									class330_sub46_sub2.addByte(4, (byte) 16);
							} else if (4 == i_4_) {
								Method method = (((Class330_Sub47) class330_sub47).aMethodArray7857[i_3_]);
								int i_8_ = method.getModifiers();
								class330_sub46_sub2.addByte(0, (byte) 68);
								class330_sub46_sub2.addInt(i_8_, 1965508160);
							}
						} catch (ClassNotFoundException classnotfoundexception) {
							class330_sub46_sub2.addByte(-10, (byte) 72);
						} catch (InvalidClassException invalidclassexception) {
							class330_sub46_sub2.addByte(-11, (byte) 99);
						} catch (StreamCorruptedException streamcorruptedexception) {
							class330_sub46_sub2.addByte(-12, (byte) 11);
						} catch (OptionalDataException optionaldataexception) {
							class330_sub46_sub2.addByte(-13, (byte) 39);
						} catch (IllegalAccessException illegalaccessexception) {
							class330_sub46_sub2.addByte(-14, (byte) 91);
						} catch (IllegalArgumentException illegalargumentexception) {
							class330_sub46_sub2.addByte(-15, (byte) 1);
						} catch (InvocationTargetException invocationtargetexception) {
							class330_sub46_sub2.addByte(-16, (byte) 89);
						} catch (SecurityException securityexception) {
							class330_sub46_sub2.addByte(-17, (byte) 26);
						} catch (IOException ioexception) {
							class330_sub46_sub2.addByte(-18, (byte) 90);
						} catch (NullPointerException nullpointerexception) {
							class330_sub46_sub2.addByte(-19, (byte) 78);
						} catch (Exception exception) {
							class330_sub46_sub2.addByte(-20, (byte) 19);
						} catch (Throwable throwable) {
							class330_sub46_sub2.addByte(-21, (byte) 46);
						}
					}
				}
				class330_sub46_sub2.method3775(i_2_, 1246563230);
				class330_sub47.method3252(1096719115);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("am.i(").append(')').toString());
		}
	}

	static void method436(IComponentDefinitions iComponentDefinitions, IComponentDefinitions class114_9_, int i) {
		try {
			Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.SWITCH_ITEM_INTERFACE_PACKET, client.aClass1_9025.aClass488_22, 978508465);
			class330_sub34.aClass330_Sub46_Sub2_7729.addShort(iComponentDefinitions.anInt1287 * -790144721, (byte) 81);
			class330_sub34.aClass330_Sub46_Sub2_7729.addLEShortA(iComponentDefinitions.anInt1335 * -1053848421, 205372277);
			class330_sub34.aClass330_Sub46_Sub2_7729.addShortA(class114_9_.anInt1335 * -1053848421, -1051905614);
			class330_sub34.aClass330_Sub46_Sub2_7729.addLEShort(-790144721 * class114_9_.anInt1287, -676872267);
			class330_sub34.aClass330_Sub46_Sub2_7729.addLEInt(751119487 * iComponentDefinitions.anInt1196, -2117284179);
			class330_sub34.aClass330_Sub46_Sub2_7729.addInt(class114_9_.anInt1196 * 751119487, 1965508160);
			client.aClass1_9025.method378(class330_sub34, -827529014);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("am.kc(").append(')').toString());
		}
	}

	static boolean method437(Class_ra class_ra, Class330_Sub38 class330_sub38, Class372 class372, int i, int i_10_, int i_11_) {
		try {
			int i_12_ = 2147483647;
			int i_13_ = -2147483648;
			int i_14_ = 2147483647;
			int i_15_ = -2147483648;
			if (class372.anIntArray3897 != null) {
				i_12_ = (((Class354_Sub1.anInt3511 - Class354_Sub1.anInt3527) * (-1917247207 * class330_sub38.anInt7756 + class372.anInt3898 * 2083089585 - Class354_Sub1.anInt3523) / (Class354_Sub1.anInt3514 - Class354_Sub1.anInt3523)) + Class354_Sub1.anInt3527);
				i_13_ = (((Class354_Sub1.anInt3511 - Class354_Sub1.anInt3527) * (-1917247207 * class330_sub38.anInt7756 + 1744437513 * class372.anInt3870 - Class354_Sub1.anInt3523) / (Class354_Sub1.anInt3514 - Class354_Sub1.anInt3523)) + Class354_Sub1.anInt3527);
				i_15_ = (Class354_Sub1.anInt3530 - ((class372.anInt3899 * 821827611 + class330_sub38.anInt7753 * 779987703 - Class354_Sub1.anInt3526) * (Class354_Sub1.anInt3530 - Class354_Sub1.anInt3528) / (Class354_Sub1.anInt3494 - Class354_Sub1.anInt3526)));
				i_14_ = (Class354_Sub1.anInt3530 - ((Class354_Sub1.anInt3530 - Class354_Sub1.anInt3528) * (1993049113 * class372.anInt3892 + class330_sub38.anInt7753 * 779987703 - Class354_Sub1.anInt3526) / (Class354_Sub1.anInt3494 - Class354_Sub1.anInt3526)));
			}
			Class61 class61 = null;
			int i_16_ = 0;
			int i_17_ = 0;
			int i_18_ = 0;
			int i_19_ = 0;
			if (-19592741 * class372.anInt3872 != -1) {
				if (class330_sub38.aBoolean7752 && 1889129817 * class372.anInt3873 != -1)
					class61 = class372.method4325(class_ra, true, -1705907130);
				else
					class61 = class372.method4325(class_ra, false, -2080797751);
				if (class61 != null) {
					i_16_ = (class330_sub38.anInt7754 * 1175619289 - (class61.method318() + 1 >> 1));
					if (i_16_ < i_12_)
						i_12_ = i_16_;
					i_17_ = (1175619289 * class330_sub38.anInt7754 + (class61.method318() + 1 >> 1));
					if (i_17_ > i_13_)
						i_13_ = i_17_;
					i_18_ = (1653279497 * class330_sub38.anInt7750 - (class61.method683() + 1 >> 1));
					if (i_18_ < i_14_)
						i_14_ = i_18_;
					i_19_ = (class330_sub38.anInt7750 * 1653279497 + (class61.method683() + 1 >> 1));
					if (i_19_ > i_15_)
						i_15_ = i_19_;
				}
			}
			Class8 class8 = null;
			int i_20_ = 0;
			int i_21_ = 0;
			int i_22_ = 0;
			int i_23_ = 0;
			int i_24_ = 0;
			int i_25_ = 0;
			int i_26_ = 0;
			int i_27_ = 0;
			if (null != class372.aString3909) {
				class8 = Buffer.method3816((class372.anInt3876 * 1422337301), 1307075156);
				if (class8 != null) {
					i_20_ = (Class543.aClass524_6254.method6244(class372.aString3909, null, Class354_Sub1.aStringArray7988, null, 1783245796));
					i_21_ = ((-398525601 * class372.anInt3901 * (Class354_Sub1.anInt3511 - Class354_Sub1.anInt3527) / (Class354_Sub1.anInt3514 - Class354_Sub1.anInt3523)) + class330_sub38.anInt7754 * 1175619289);
					i_22_ = (class330_sub38.anInt7750 * 1653279497 - (class372.anInt3877 * 1178890149 * (Class354_Sub1.anInt3530 - Class354_Sub1.anInt3528) / (Class354_Sub1.anInt3494 - Class354_Sub1.anInt3526)));
					if (null == class61)
						i_22_ -= class8.method415() * i_20_ / 2;
					else
						i_22_ -= ((class61.method683() >> 1) + class8.method420() * i_20_);
					for (int i_28_ = 0; i_28_ < i_20_; i_28_++) {
						String string = Class354_Sub1.aStringArray7988[i_28_];
						if (i_28_ < i_20_ - 1)
							string = string.substring(0, string.length() - 4);
						int i_29_ = class8.method417(string);
						if (i_29_ > i_23_)
							i_23_ = i_29_;
					}
					i_24_ = i + (i_21_ - i_23_ / 2);
					if (i_24_ < i_12_)
						i_12_ = i_24_;
					i_25_ = i + (i_23_ / 2 + i_21_);
					if (i_25_ > i_13_)
						i_13_ = i_25_;
					i_26_ = i_10_ + i_22_;
					if (i_26_ < i_14_)
						i_14_ = i_26_;
					i_27_ = i_22_ + i_20_ * class8.method420() + i_10_;
					if (i_27_ > i_15_)
						i_15_ = i_27_;
				}
			}
			if (i_13_ < Class354_Sub1.anInt3527 || i_12_ > Class354_Sub1.anInt3511 || i_15_ < Class354_Sub1.anInt3528 || i_14_ > Class354_Sub1.anInt3530)
				return true;
			Class354_Sub1.method4097(class_ra, class330_sub38, class372);
			if (class61 != null) {
				if (Class448.anInt5556 * -927753929 > 0 && ((Class354_Sub1.anInt7987 * -409726815 != -1 && (-409726815 * Class354_Sub1.anInt7987 == class330_sub38.anInt7755 * -558904089)) || (-1 != Class354_Sub1.anInt7980 * -173343463 && (-173343463 * Class354_Sub1.anInt7980 == -546800133 * class372.anInt3911)))) {
					int i_30_;
					if (-1484286815 * Class101.anInt6456 > 50)
						i_30_ = 200 - Class101.anInt6456 * 1326393666;
					else
						i_30_ = Class101.anInt6456 * 1326393666;
					int i_31_ = i_30_ << 24 | 0xffff00;
					class_ra.method4793(1175619289 * class330_sub38.anInt7754, 1653279497 * class330_sub38.anInt7750, class61.method681() / 2 + 7, i_31_, -1750445026);
					class_ra.method4793(class330_sub38.anInt7754 * 1175619289, class330_sub38.anInt7750 * 1653279497, class61.method681() / 2 + 5, i_31_, -1974497261);
					class_ra.method4793(1175619289 * class330_sub38.anInt7754, 1653279497 * class330_sub38.anInt7750, class61.method681() / 2 + 3, i_31_, -1063125568);
					class_ra.method4793(1175619289 * class330_sub38.anInt7754, class330_sub38.anInt7750 * 1653279497, class61.method681() / 2 + 1, i_31_, 188638214);
					class_ra.method4793(class330_sub38.anInt7754 * 1175619289, class330_sub38.anInt7750 * 1653279497, class61.method681() / 2, i_31_, 164670799);
				}
				class61.method687((class330_sub38.anInt7754 * 1175619289 - (class61.method318() >> 1)), (class330_sub38.anInt7750 * 1653279497 - (class61.method683() >> 1)));
			}
			if (class372.aString3909 != null && null != class8)
				Class232.method2359(class_ra, class330_sub38, class372, i_20_, i_21_, i_22_, i_23_, class8, (byte) -12);
			if (class372.anInt3872 * -19592741 != -1 || class372.aString3909 != null) {
				Class330_Sub7 class330_sub7 = new Class330_Sub7(class330_sub38);
				((Class330_Sub7) class330_sub7).anInt7546 = i_16_ * 1951011357;
				((Class330_Sub7) class330_sub7).anInt7553 = i_17_ * -463713427;
				((Class330_Sub7) class330_sub7).anInt7548 = 950469751 * i_18_;
				((Class330_Sub7) class330_sub7).anInt7545 = i_19_ * 1512582467;
				((Class330_Sub7) class330_sub7).anInt7549 = i_24_ * 1358995639;
				((Class330_Sub7) class330_sub7).anInt7550 = i_25_ * 1642847929;
				((Class330_Sub7) class330_sub7).anInt7551 = 2144115257 * i_26_;
				((Class330_Sub7) class330_sub7).anInt7547 = -2081742315 * i_27_;
				Class171.aClass471_1730.method5878(class330_sub7, (short) 8192);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("am.cy(").append(')').toString());
		}
	}
}
