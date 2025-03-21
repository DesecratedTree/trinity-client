/* Class540 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class540 {
	IndexTable aClass280_6247;
	public int anInt6248;
	public static IndexTable aClass280_6249;

	public Class540(Class435 class435, Class454 class454, IndexTable class280) {
		new Class367(64);
		((Class540) this).aClass280_6247 = class280;
		anInt6248 = (((Class540) this).aClass280_6247.method2763(((Class103.aClass103_939.anInt982) * -989081113), -2017620823) * -1261163691);
	}

	static void method6327(IComponentDefinitions[] class114s, IComponentDefinitions iComponentDefinitions, boolean bool, int i) {
		try {
			int i_0_ = (iComponentDefinitions.anInt1222 * -527289817 != 0 ? -527289817 * iComponentDefinitions.anInt1222 : -681123409 * iComponentDefinitions.anInt1210);
			int i_1_ = (-284059687 * iComponentDefinitions.anInt1223 != 0 ? iComponentDefinitions.anInt1223 * -284059687 : iComponentDefinitions.anInt1348 * 694142557);
			ItemEquipDefinitions.method6214(class114s, 751119487 * iComponentDefinitions.anInt1196, i_0_, i_1_, bool, (byte) 65);
			if (null != iComponentDefinitions.aClass114Array1219)
				ItemEquipDefinitions.method6214(iComponentDefinitions.aClass114Array1219, iComponentDefinitions.anInt1196 * 751119487, i_0_, i_1_, bool, (byte) 65);
			Class330_Sub48 class330_sub48 = ((Class330_Sub48) client.aClass497_9284.method6094((long) (iComponentDefinitions.anInt1196 * 751119487)));
			if (class330_sub48 != null)
				Class559.method6458(856598855 * class330_sub48.anInt7859, i_0_, i_1_, bool, 29658018);
			if (iComponentDefinitions == client.aClass114_9163) {
				int i_2_ = -1468156857 * Class15.anInt192;
				int[] is = Class15.anIntArray187;
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
					Player class432_sub1_sub1_sub1_sub1 = (client.players[is[i_3_]]);
					if (null != class432_sub1_sub1_sub1_sub1)
						class432_sub1_sub1_sub1_sub1.method5433(i_0_, i_1_, bool, 1977009717);
				}
				for (int i_4_ = 0; i_4_ < client.anInt9017 * -823688441; i_4_++) {
					int i_5_ = client.anIntArray9018[i_4_];
					Class330_Sub35 class330_sub35 = ((Class330_Sub35) client.aClass497_9014.method6094((long) i_5_));
					if (null != class330_sub35)
						((Class432_Sub1_Sub1_Sub1) class330_sub35.anObject7733).method5433(i_0_, i_1_, bool, 1160835437);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wj.ks(").append(')').toString());
		}
	}

	public static Class209 method6328(Buffer class330_sub46, int i) {
		try {
			Class209 class209 = new Class209();
			class209.anInt1981 = class330_sub46.readUnsignedShort(1148369639) * 822325295;
			class209.aClass330_Sub36_Sub4_1982 = Class2.aClass523_44.method6233(1955043023 * class209.anInt1981, 1358793636);
			return class209;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wj.r(").append(')').toString());
		}
	}
}
