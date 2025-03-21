/* Class330_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub34 extends Class330 {
	static int anInt7727;
	int anInt7728;
	public Class330_Sub46_Sub2 aClass330_Sub46_Sub2_7729;
	public int anInt7730;
	static Class330_Sub34[] aClass330_Sub34Array7731 = new Class330_Sub34[300];
	OutgoingPacket aClass234_7732;

	Class330_Sub34() {
		/* empty */
	}

	public void method3436(byte i) {
		try {
			if (anInt7727 * -431481119 < aClass330_Sub34Array7731.length)
				aClass330_Sub34Array7731[(anInt7727 += -1888639711) * -431481119 - 1] = this;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ado.p(").append(')').toString());
		}
	}

	static {
		anInt7727 = 0;
	}

	static void method3437(Class_ra class_ra, int i) {
		try {
			if (!Class484.aBoolean5807)
				Class345.method4009(class_ra, 251994479);
			else
				Class105.method1305(class_ra, 604046651);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ado.ag(").append(')').toString());
		}
	}

	static void method3438(IComponentDefinitions iComponentDefinitions, int i, int i_0_, byte i_1_) {
		try {
			if (client.aBoolean9150) {
				Class537 class537 = (-1 != OutgoingPacket.anInt2579 * 1552382549 ? Class301.aClass543_3059.method6339((1552382549 * (OutgoingPacket.anInt2579)), -185465328) : null);
				if (client.method3924(iComponentDefinitions).method3262((short) 2183) && 0 != (-1357430571 * Class503.anInt5916 & 0x20) && (null == class537 || (iComponentDefinitions.method1397((OutgoingPacket.anInt2579 * 1552382549), (-735399997 * class537.anInt6235), (byte) 75) != class537.anInt6235 * -735399997)))
					Class360.method4241(client.aString9152, new StringBuilder().append(client.aString9154).append(" ").append(Class215.aString2082).append(" ").append(iComponentDefinitions.aString1283).toString(), Class271.anInt2756 * -2126481065, 58, -1053848421 * iComponentDefinitions.anInt1335, 0L, -790144721 * iComponentDefinitions.anInt1287, 751119487 * iComponentDefinitions.anInt1196, true, false, (long) (iComponentDefinitions.anInt1287 * -790144721 << 32 | 751119487 * iComponentDefinitions.anInt1196), false, (short) 140);
			}
			for (int i_2_ = 9; i_2_ >= 5; i_2_--) {
				String string = Class131.method1563(iComponentDefinitions, i_2_, 428205142);
				if (null != string)
					Class360.method4241(string, iComponentDefinitions.aString1283, Class213.method2229(iComponentDefinitions, i_2_, 1987276202), 1007, iComponentDefinitions.anInt1335 * -1053848421, (long) (1 + i_2_), iComponentDefinitions.anInt1287 * -790144721, iComponentDefinitions.anInt1196 * 751119487, true, false, (long) (iComponentDefinitions.anInt1287 * -790144721 << 32 | iComponentDefinitions.anInt1196 * 751119487), false, (short) 140);
			}
			String string = Class473.method5911(iComponentDefinitions, 13707572);
			if (string != null)
				Class360.method4241(string, iComponentDefinitions.aString1283, -1591075201 * iComponentDefinitions.anInt1250, 25, iComponentDefinitions.anInt1335 * -1053848421, 0L, -790144721 * iComponentDefinitions.anInt1287, iComponentDefinitions.anInt1196 * 751119487, true, false, (long) ((-790144721 * iComponentDefinitions.anInt1287 << 32) | iComponentDefinitions.anInt1196 * 751119487), false, (short) 140);
			for (int i_3_ = 4; i_3_ >= 0; i_3_--) {
				String string_4_ = Class131.method1563(iComponentDefinitions, i_3_, 709719160);
				if (null != string_4_)
					Class360.method4241(string_4_, iComponentDefinitions.aString1283, Class213.method2229(iComponentDefinitions, i_3_, 1871119512), 57, -1053848421 * iComponentDefinitions.anInt1335, (long) (i_3_ + 1), iComponentDefinitions.anInt1287 * -790144721, iComponentDefinitions.anInt1196 * 751119487, true, false, (long) (iComponentDefinitions.anInt1287 * -790144721 << 32 | iComponentDefinitions.anInt1196 * 751119487), false, (short) 140);
			}
			if (client.method3924(iComponentDefinitions).method3263((byte) -14)) {
				if (iComponentDefinitions.aString1285 != null)
					Class360.method4241(iComponentDefinitions.aString1285, "", -1, 30, -1053848421 * iComponentDefinitions.anInt1335, 0L, iComponentDefinitions.anInt1287 * -790144721, 751119487 * iComponentDefinitions.anInt1196, true, false, (long) (-790144721 * iComponentDefinitions.anInt1287 << 32 | iComponentDefinitions.anInt1196 * 751119487), false, (short) 140);
				else
					Class360.method4241(Class526.aClass526_6051.method6257(Class429.aClass454_4369, 991479434), "", -1, 30, iComponentDefinitions.anInt1335 * -1053848421, 0L, -790144721 * iComponentDefinitions.anInt1287, 751119487 * iComponentDefinitions.anInt1196, true, false, (long) (-790144721 * iComponentDefinitions.anInt1287 << 32 | 751119487 * iComponentDefinitions.anInt1196), false, (short) 140);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ado.d(").append(')').toString());
		}
	}
}
