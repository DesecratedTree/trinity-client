/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class65 {
	Class497 aClass497_570;
	int anInt571;

	public int method780(int i, byte i_0_) {
		try {
			Class330_Sub23 class330_sub23 = ((Class330_Sub23) ((Class65) this).aClass497_570.method6094((long) i));
			if (null != class330_sub23)
				return class330_sub23.anInt7693 * 393599711;
			Class221 class221 = Class366_Sub4.aClass231_8007.method2346(i, -380087586);
			if ('i' != class221.aChar6673)
				return -1;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cq.i(").append(')').toString());
		}
	}

	public void method781(int i, int i_1_, short i_2_) {
		try {
			if (((Class65) this).aClass497_570 == null)
				((Class65) this).aClass497_570 = new Class497(((Class65) this).anInt571 * 1910180951);
			Class330_Sub23 class330_sub23 = ((Class330_Sub23) ((Class65) this).aClass497_570.method6094((long) i));
			if (null != class330_sub23)
				class330_sub23.anInt7693 = -457940705 * i_1_;
			else {
				class330_sub23 = new Class330_Sub23(i_1_);
				((Class65) this).aClass497_570.method6097(class330_sub23, (long) i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cq.j(").append(')').toString());
		}
	}

	Class65(int i) {
		((Class65) this).anInt571 = i * -588472473;
	}

	public int method782(int i, byte i_3_) {
		try {
			Class382 class382 = Class428.aClass370_4364.method4312(i, (byte) -104);
			int i_4_ = class382.anInt6675 * -1094124161;
			int i_5_ = (31 == class382.anInt6677 * 151044347 ? -1 : (1 << 1 + 151044347 * class382.anInt6677) - 1);
			return ((method780(i_4_, (byte) 59) & i_5_) >>> class382.anInt6676 * 946379215);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cq.p(").append(')').toString());
		}
	}

	public void method783(byte i) {
		try {
			if (((Class65) this).aClass497_570 != null)
				((Class65) this).aClass497_570.method6100(65280);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cq.r(").append(')').toString());
		}
	}

	static final void method784(IComponentDefinitions iComponentDefinitions, Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_6_ = ((((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]) - 1);
			int i_7_ = (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			if (i_6_ < 0 || i_6_ > 9)
				throw new RuntimeException();
			Class431.method5337(iComponentDefinitions, i_6_, i_7_, class430, 1470577267);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cq.kh(").append(')').toString());
		}
	}

	static final void method785(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class499.method6117(iComponentDefinitions, class120, class430, (byte) -9);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cq.me(").append(')').toString());
		}
	}
	
	public static boolean foundPlayer(String username, int i) {
		try {
			if (null == username)
				return false;
			for (int i_8_ = 0; i_8_ < client.anInt9261 * -1187306419; i_8_++) {
				Class75 class75 = client.aClass75Array8982[i_8_];
				if (username.equalsIgnoreCase(class75.aString646))
					return true;
				if (username.equalsIgnoreCase(class75.aString647))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cq.mx(").append(')').toString());
		}
	}
	
	static final void method787(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			StringBuilder stringbuilder = new StringBuilder(string.length());
			boolean bool = false;
			for (int i_9_ = 0; i_9_ < string.length(); i_9_++) {
				char c = string.charAt(i_9_);
				if ('<' == c)
					bool = true;
				else if (c == '>')
					bool = false;
				else if (!bool)
					stringbuilder.append(c);
			}
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cq.aao(").append(')').toString());
		}
	}
}
