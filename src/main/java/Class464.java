

public class Class464 {
	public int[] anIntArray5690;
	static int anInt5691 = 2;
	static int anInt5692 = 4;
	static int anInt5693 = 1;
	public int[] anIntArray5694 = new int[3];
	public int[] anIntArray5695 = new int[3];
	static int anInt5696 = 8;
	public int[] anIntArray5697;
	public short[] aShortArray5698;
	public short[] aShortArray5699;

	Class464(ItemConfig class468) {
		anIntArray5690 = new int[2];
		anIntArray5697 = new int[2];
		anIntArray5694[0] = 1343198193 * class468.maleModel1;
		anIntArray5694[1] = ((ItemConfig) class468).maleModel2 * 34210967;
		anIntArray5694[2] = ((ItemConfig) class468).maleModel3 * 1313278521;
		anIntArray5695[0] = 1585491093 * class468.femaleModel1;
		anIntArray5695[1] = ((ItemConfig) class468).femaleModel2 * -1284247975;
		anIntArray5695[2] = ((ItemConfig) class468).femaleModel3 * -1767718263;
		anIntArray5690[0] = ((ItemConfig) class468).maleHeadModel1 * -1282951055;
		anIntArray5690[1] = 86274879 * ((ItemConfig) class468).maleHeadModel2;
		anIntArray5697[0] = ((ItemConfig) class468).femaleHeadModel1 * -1531415419;
		anIntArray5697[1] = ((ItemConfig) class468).femaleHeadModel2 * 1578724433;
		if (((ItemConfig) class468).modifiedColors != null) {
			aShortArray5698 = new short[((ItemConfig) class468).modifiedColors.length];
			System.arraycopy(((ItemConfig) class468).modifiedColors, 0, aShortArray5698, 0, aShortArray5698.length);
		}
		if (null != ((ItemConfig) class468).modifiedTextures) {
			aShortArray5699 = new short[((ItemConfig) class468).modifiedTextures.length];
			System.arraycopy(((ItemConfig) class468).modifiedTextures, 0, aShortArray5699, 0, aShortArray5699.length);
		}
	}

	public static final void method6015(int i) {
		try {
			if (!client.aBoolean8762) {
				client.aFloat8759 += (-24.0F - client.aFloat8759) / 2.0F;
				client.aBoolean8763 = true;
				client.aBoolean8762 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("td.hr(").append(')').toString());
		}
	}

	static final void method6016(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).integerstack[((ClientScript2) class403).integerPos * 1883543357]);
			ClientScriptsExecutor.aStringArray4126[i_0_] = (String) (((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 -= 969361751) * -203050393)]);
			Class272.method2558(i_0_, 1525227442);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("td.am(").append(')').toString());
		}
	}
}
