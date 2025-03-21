/* Class352 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class352 {
	static int anInt3482 = 0;
	public Class352 aClass352_3483;
	public Class432_Sub1_Sub1 aClass432_Sub1_Sub1_3484;
	static Class352 aClass352_3485;
	static int anInt3486;

	Class352() {
		/* empty */
	}

	void method4070(int i) {
		try {
			if (anInt3482 * 311553635 < 500) {
				aClass432_Sub1_Sub1_3484 = null;
				aClass352_3483 = aClass352_3485;
				aClass352_3485 = this;
				anInt3482 += 284951371;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("or.j(").append(')').toString());
		}
	}

	static final void method4071(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_0_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_1_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			int i_2_ = (Class2.aClass523_44.method6233(i_0_, 1516842767).method3452(i_1_, -805639208).anInt4048 * 1105478913);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("or.adc(").append(')').toString());
		}
	}

	static void method4072(String[] strings, int i) {
		try {
			if (strings.length > 1) {
				for (int i_3_ = 0; i_3_ < strings.length; i_3_++) {
					if (strings[i_3_].startsWith("pause")) {
						int i_4_ = 5;
						try {
							i_4_ = Integer.parseInt(strings[i_3_].substring(6));
						} catch (Exception exception) {
							/* empty */
						}
						Class56.panelBoxMessage(new StringBuilder().append("Pausing for ").append(i_4_).append(" seconds...").toString(), 691120450);
						Class380.aStringArray3960 = strings;
						Class5.anInt79 = 1934803477 * (1 + i_3_);
						Class5.aLong74 = (Class312.method3111((byte) 19) + (long) (i_4_ * 1000)) * -942728182570139579L;
						break;
					}
					Class5.aString73 = strings[i_3_];
					Class201.method2164(false, (byte) 10);
				}
			} else {
				Class5.aString73 = new StringBuilder().append(Class5.aString73).append(strings[0]).toString();
				Class5.anInt76 += strings[0].length() * 616558173;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("or.f(").append(')').toString());
		}
	}
}
