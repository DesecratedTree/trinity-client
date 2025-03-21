/* Class366_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class366_Sub5 extends Class366 {
	int anInt8008;

	Class366_Sub5() {
		/* empty */
	}

	public boolean method4274(int i, int i_0_, int i_1_, Class307 class307, int i_2_) {
		try {
			return class307.method3069(i_0_, i_1_, i, i, -216790319 * anInt3854, anInt3853 * 1420524451, -1343825313 * anInt3852, -1402089255 * anInt3855, (292058949 * ((Class366_Sub5) this).anInt8008), (byte) -9);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aem.r(").append(')').toString());
		}
	}

	public boolean method4275(int i, int i_3_, int i_4_, Class307 class307) {
		return class307.method3069(i_3_, i_4_, i, i, -216790319 * anInt3854, anInt3853 * 1420524451, -1343825313 * anInt3852, -1402089255 * anInt3855, (292058949 * ((Class366_Sub5) this).anInt8008), (byte) -115);
	}

	public boolean method4273(int i, int i_5_, int i_6_, Class307 class307) {
		return class307.method3069(i_5_, i_6_, i, i, -216790319 * anInt3854, anInt3853 * 1420524451, -1343825313 * anInt3852, -1402089255 * anInt3855, (292058949 * ((Class366_Sub5) this).anInt8008), (byte) -73);
	}

	static final void method4280(Class430 class430, int i) {
		try {
			String string = null;
			if (Class101.aClass148_6458 != null)
				string = Class101.aClass148_6458.method1746(369318015);
			if (null == string)
				string = "";
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aem.aos(").append(')').toString());
		}
	}

	static final void method4281(Class430 class430, int i) {
		try {
			long l = Class312.method3111((byte) 35);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class291.method2905(l);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aem.ama(").append(')').toString());
		}
	}

	public static String method4282(String string, byte i) {
		try {
			StringBuilder stringbuilder = new StringBuilder();
			int i_7_ = string.length();
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
				char c = string.charAt(i_8_);
				if (37 == c && i_7_ > 2 + i_8_) {
					c = string.charAt(i_8_ + 1);
					boolean bool = false;
					int i_9_;
					if (c >= 48 && c <= 57)
						i_9_ = c - 48;
					else if (c >= 97 && c <= 102)
						i_9_ = c + 10 - 97;
					else if (c >= 65 && c <= 70)
						i_9_ = 10 + c - 65;
					else {
						stringbuilder.append('%');
						continue;
					}
					i_9_ *= 16;
					int i_10_ = string.charAt(i_8_ + 2);
					if (i_10_ >= 48 && i_10_ <= 57)
						i_9_ += i_10_ - 48;
					else if (i_10_ >= 97 && i_10_ <= 102)
						i_9_ += 10 + i_10_ - 97;
					else if (i_10_ >= 65 && i_10_ <= 70)
						i_9_ += i_10_ + 10 - 65;
					else {
						stringbuilder.append('%');
						continue;
					}
					if (0 != i_9_ && Class230.method2342((byte) i_9_, -1801160988))
						stringbuilder.append(Class127.method1546((byte) i_9_, -2112614321));
					i_8_ += 2;
				} else if (c == 43)
					stringbuilder.append(' ');
				else
					stringbuilder.append(c);
			}
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aem.r(").append(')').toString());
		}
	}

	static final void method4283(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class360.anInt3787 * 1514976073;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aem.ajw(").append(')').toString());
		}
	}

	public static File method4284(byte i) {
		try {
			return Class60.aFile559;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aem.f(").append(')').toString());
		}
	}
}
