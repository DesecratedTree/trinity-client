/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class117 {
	public String aString1377;
	public int anInt1378;
	public int anInt1379;
	public int anInt1380;
	public int anInt1381 = Class99.method1202(476297814) * 1402426965;
	public String aString1382;
	public String aString1383;
	public String aString1384;
	public int anInt1385;
	public String aString1386;
	public static IndexTable aClass280_1387;

	Class117(int i, int i_0_, String string, String string_1_, String string_2_, String string_3_, int i_4_, String string_5_) {
		anInt1378 = client.anInt8981 * -1624077879;
		anInt1379 = -295852011 * i;
		anInt1380 = -2030933253 * i_0_;
		aString1377 = string;
		aString1383 = string_1_;
		aString1382 = string_2_;
		aString1384 = string_3_;
		anInt1385 = i_4_ * -181258837;
		aString1386 = string_5_;
	}

	void method1422(int i, int i_6_, String string, String string_7_, String string_8_, String string_9_, int i_10_, String string_11_, int i_12_) {
		try {
			anInt1381 = Class99.method1202(476297814) * 1402426965;
			anInt1378 = client.anInt8981 * -1624077879;
			anInt1379 = i * -295852011;
			anInt1380 = i_6_ * -2030933253;
			aString1377 = string;
			aString1383 = string_7_;
			aString1382 = string_8_;
			aString1384 = string_9_;
			anInt1385 = -181258837 * i_10_;
			aString1386 = string_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("es.r(").append(')').toString());
		}
	}

	public static void method1423(Class330_Sub42 class330_sub42, int i) {
		try {
			Class163.method1921(class330_sub42, 200000, (byte) -38);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("es.i(").append(')').toString());
		}
	}

	static boolean method1424(CharSequence charsequence, int i, boolean bool, int i_13_) {
		try {
			if (i < 2 || i > 36)
				throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
			boolean bool_14_ = false;
			boolean bool_15_ = false;
			int i_16_ = 0;
			int i_17_ = charsequence.length();
			for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
				int i_19_ = charsequence.charAt(i_18_);
				if (0 == i_18_) {
					if (i_19_ == 45) {
						bool_14_ = true;
						continue;
					}
					if (43 == i_19_ && bool) {
						if (i_13_ == -1201022853)
							throw new IllegalStateException();
						continue;
					}
				}
				if (i_19_ >= 48 && i_19_ <= 57)
					i_19_ -= 48;
				else if (i_19_ >= 65 && i_19_ <= 90)
					i_19_ -= 55;
				else if (i_19_ >= 97 && i_19_ <= 122)
					i_19_ -= 87;
				else
					return false;
				if (i_19_ >= i)
					return false;
				if (bool_14_)
					i_19_ = -i_19_;
				int i_20_ = i_16_ * i + i_19_;
				if (i_16_ != i_20_ / i)
					return false;
				i_16_ = i_20_;
				bool_15_ = true;
			}
			return bool_15_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("es.p(").append(')').toString());
		}
	}

	static Class496[] method1425(int i) {
		try {
			return (new Class496[] { Class496.aClass496_5874, Class496.aClass496_5875, Class496.aClass496_5873 });
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("es.r(").append(')').toString());
		}
	}

	public static String method1426(String string, int i) {
		try {
			int i_21_ = string.length();
			int i_22_ = 0;
			for (int i_23_ = 0; i_23_ < i_21_; i_23_++) {
				char c = string.charAt(i_23_);
				if (c == '<' || '>' == c)
					i_22_ += 3;
			}
			StringBuilder stringbuilder = new StringBuilder(i_21_ + i_22_);
			for (int i_24_ = 0; i_24_ < i_21_; i_24_++) {
				char c = string.charAt(i_24_);
				if (c == '<')
					stringbuilder.append("<lt>");
				else if ('>' == c)
					stringbuilder.append("<gt>");
				else
					stringbuilder.append(c);
			}
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("es.r(").append(')').toString());
		}
	}
}
