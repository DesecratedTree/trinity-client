/* Class330_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub38 extends Class330 {
	public int anInt7750;
	public int anInt7751;
	public boolean aBoolean7752;
	public int anInt7753;
	public int anInt7754;
	public int anInt7755 = -1960216279;
	public int anInt7756;

	Class330_Sub38(int i) {
		aBoolean7752 = false;
		anInt7755 = i * 1960216279;
	}

	static final void method3541(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, byte i_7_) {
		try {
			if (!Class397_Sub1.method4681(i, null, -1804335960)) {
				if (-1 != i_6_)
					client.aBooleanArray9230[i_6_] = true;
				else {
					for (int i_8_ = 0; i_8_ < 113; i_8_++)
						client.aBooleanArray9230[i_8_] = true;
				}
			} else
				Class556.method6408(Class3.aClass120Array56[i].method1442((byte) -103), -1, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_6_ < 0, -1160401233);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ads.kk(").append(')').toString());
		}
	}
}
