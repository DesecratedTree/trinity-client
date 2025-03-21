/* Class438 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class438 {
	public int anInt4446;
	public int anInt4447;
	public int anInt4448;

	void method5591(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(1047134759);
				if (i_0_ == 0) {
					if (i <= 445883621) {
						/* empty */
					}
					break;
				}
				method5592(class330_sub46, i_0_, (byte) -2);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sd.r(").append(')').toString());
		}
	}

	Class438() {
		/* empty */
	}

	void method5592(Buffer class330_sub46, int i, byte i_1_) {
		try {
			if (i == 1) {
				anInt4447 = class330_sub46.readUnsignedShort(749305349) * -1918246379;
				anInt4446 = class330_sub46.readUnsignedByte(229662354) * 849653115;
				anInt4448 = class330_sub46.readUnsignedByte(-98296263) * 752997817;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sd.j(").append(')').toString());
		}
	}

	static boolean method5593(int i, int i_2_) {
		try {
			return 5 == i || 19 == i || i == 16 || i == 7 || i == 17;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sd.fk(").append(')').toString());
		}
	}

	static void method5594(IComponentDefinitions iComponentDefinitions, int i) {
		try {
			if (client.aBoolean9150) {
				if (iComponentDefinitions.anObjectArray1320 != null) {
					IComponentDefinitions class114_3_ = Class166.method1993(Class368.anInt3869 * 651152399, -1732113251 * client.anInt9151, 534399539);
					if (null != class114_3_) {
						Class330_Sub42 class330_sub42 = new Class330_Sub42();
						class330_sub42.aClass114_7809 = iComponentDefinitions;
						class330_sub42.aClass114_7813 = class114_3_;
						class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1320;
						Class117.method1423(class330_sub42, -1631194987);
					}
				}
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.ITEM_ON_ITEM_PACKET, client.aClass1_9025.aClass488_22, -448561751);
				class330_sub34.aClass330_Sub46_Sub2_7729.addShortA(client.anInt9151 * -1732113251, -1853989465);
				class330_sub34.aClass330_Sub46_Sub2_7729.addLEInt(751119487 * iComponentDefinitions.anInt1196, -2049848719);
				class330_sub34.aClass330_Sub46_Sub2_7729.addShort(iComponentDefinitions.anInt1335 * -1053848421, (byte) 104);
				class330_sub34.aClass330_Sub46_Sub2_7729.addLEShort(iComponentDefinitions.anInt1287 * -790144721, -676872267);
				class330_sub34.aClass330_Sub46_Sub2_7729.addShortA(client.anInt9104 * -830961233, -1322880411);
				class330_sub34.aClass330_Sub46_Sub2_7729.addInt(651152399 * Class368.anInt3869, 1965508160);
				client.aClass1_9025.method378(class330_sub34, -2007498610);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sd.kf(").append(')').toString());
		}
	}

	static void method5595(int i) {
		try {
			Class50.aClass145_Sub1_480 = new Class145_Sub1(client.aClass532_9236);
			Class50.aClass145_Sub1_480.method1673(Class130.aClass130_1495, (byte) 34);
			try {
				Class166_Sub1 class166_sub1 = ((Class166_Sub1) Class50.aClass145_Sub1_480.method1674((Class136.aClass136_1524), false, 561271987));
				Class475_Sub3 class475_sub3 = ((Class475_Sub3) Class50.aClass145_Sub1_480.method1696((Class146.aClass146_1610), false, (byte) -63));
				class166_sub1.method1997(Class401_Sub1.aClass145_Sub1_8249.method1694(65280), (byte) 12);
				class475_sub3.method5953(new Class244(0.0F, 0.0F, 0.0F), -1660529443);
			} catch (Exception_Sub4 exception_sub4) {
				/* empty */
			}
			Class50.anInt481 = (Class464_Sub23.aClass350_8712.method4030(34823472) * 1537690283);
			Class242.anInt6984 = (Class464_Sub23.aClass350_8712.method4031((short) 31180) * 295440893);
			Class50.aBoolean479 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sd.r(").append(')').toString());
		}
	}
}
