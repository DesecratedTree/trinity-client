/* Class427 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class427 {
	int anInt4347;
	Class381 aClass381_4348;
	int anInt4349;
	static Preferences aClass294_4350;

	Interface2 method5319(byte i) {
		try {
			int i_0_ = 664489493 * ((Class427) this).aClass381_4348.anInt3963;
			Class381 class381 = client.aClass304_9030.method3022(-355131208);
			int i_1_ = (-1261027839 * ((Class427) this).aClass381_4348.gameSceneBaseX - -1261027839 * class381.gameSceneBaseX);
			int i_2_ = (-1542584207 * ((Class427) this).aClass381_4348.gameSceneBaseY - class381.gameSceneBaseY * -1542584207);
			if (i_1_ < 0 || i_2_ < 0 || i_1_ >= client.aClass304_9030.method2990(-1909689917) || i_2_ >= client.aClass304_9030.method3033((byte) -53))
				return null;
			switch (method5321(-1627650745)) {
			case 2:
				return (Interface2) (client.aClass304_9030.method3023(-400722441).method4158(i_0_, i_1_, i_2_, client.anInterface19_9266, (byte) 41));
			default:
				return null;
			case 0:
				return ((Interface2) client.aClass304_9030.method3023(-400722441).method4154(i_0_, i_1_, i_2_, -2040838155));
			case 1:
				return ((Interface2) client.aClass304_9030.method3023(-400722441).method4156(i_0_, i_1_, i_2_, -1679447298));
			case 3:
				return ((Interface2) client.aClass304_9030.method3023(-400722441).method4177(i_0_, i_1_, i_2_, 1315717432));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rt.i(").append(')').toString());
		}
	}

	public Interface2 method5320(byte i) {
		try {
			Interface2 interface2 = method5319((byte) 3);
			if (interface2 == null)
				return null;
			if (interface2.method34((short) -2203) != ((Class427) this).anInt4347 * 652694783)
				return null;
			return interface2;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rt.j(").append(')').toString());
		}
	}

	public Class427(Class381 class381, int i, int i_3_, int i_4_) {
		((Class427) this).aClass381_4348 = class381;
		((Class427) this).anInt4349 = -1704818599 * i;
		((Class427) this).anInt4347 = i_4_ * 1776265983;
	}

	int method5321(int i) {
		try {
			return (client.anIntArray9036[((Class427) this).anInt4349 * -1973141527]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rt.r(").append(')').toString());
		}
	}

	public static int method5322(int i, int i_5_, int i_6_, int i_7_) {
		try {
			if (-1755364031 * Class354_Sub1.anInt7977 < 100)
				return -2;
			int i_8_ = -2;
			int i_9_ = 2147483647;
			int i_10_ = i_5_ - Class354_Sub1.anInt3510;
			int i_11_ = i_6_ - Class354_Sub1.anInt3516;
			for (Class330_Sub38 class330_sub38 = ((Class330_Sub38) Class354_Sub1.aClass471_3509.method5869(539664854)); class330_sub38 != null; class330_sub38 = ((Class330_Sub38) Class354_Sub1.aClass471_3509.method5873((byte) -34))) {
				if (class330_sub38.anInt7755 * -558904089 != i) {
					if (i_7_ >= -708765691)
						throw new IllegalStateException();
				} else {
					int i_12_ = -1917247207 * class330_sub38.anInt7756;
					int i_13_ = 779987703 * class330_sub38.anInt7753;
					int i_14_ = (Class354_Sub1.anInt3510 + i_12_ << 14 | Class354_Sub1.anInt3516 + i_13_);
					int i_15_ = ((i_10_ - i_12_) * (i_10_ - i_12_) + (i_11_ - i_13_) * (i_11_ - i_13_));
					if (i_8_ < 0 || i_15_ < i_9_) {
						i_8_ = i_14_;
						i_9_ = i_15_;
					}
				}
			}
			return i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rt.ca(").append(')').toString());
		}
	}
}
