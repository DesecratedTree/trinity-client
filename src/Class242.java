/* Class242 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class242 implements Interface31 {
	boolean aBoolean6983;
	static int anInt6984;
	String aString6985;

	public int method321(byte i) {
		try {
			if (((Class242) this).aBoolean6983)
				return 100;
			int i_0_ = Class263.aClass321_2734.method3171(((Class242) this).aString6985, (byte) -55);
			if (i_0_ >= 0 && i_0_ <= 100)
				return i_0_;
			((Class242) this).aBoolean6983 = true;
			return 100;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kd.r(").append(')').toString());
		}
	}

	Class242(String string) {
		((Class242) this).aString6985 = string;
	}

	public Class513 method319(int i) {
		try {
			return Class513.aClass513_5963;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kd.j(").append(')').toString());
		}
	}

	public int method322() {
		if (((Class242) this).aBoolean6983)
			return 100;
		int i = Class263.aClass321_2734.method3171(((Class242) this).aString6985, (byte) -81);
		if (i >= 0 && i <= 100)
			return i;
		((Class242) this).aBoolean6983 = true;
		return 100;
	}

	public int method323() {
		if (((Class242) this).aBoolean6983)
			return 100;
		int i = Class263.aClass321_2734.method3171(((Class242) this).aString6985, (byte) 11);
		if (i >= 0 && i <= 100)
			return i;
		((Class242) this).aBoolean6983 = true;
		return 100;
	}

	public Class513 method324() {
		return Class513.aClass513_5963;
	}

	public Class513 method325() {
		return Class513.aClass513_5963;
	}

	public int method320() {
		if (((Class242) this).aBoolean6983)
			return 100;
		int i = Class263.aClass321_2734.method3171(((Class242) this).aString6985, (byte) -42);
		if (i >= 0 && i <= 100)
			return i;
		((Class242) this).aBoolean6983 = true;
		return 100;
	}

	boolean method2403(short i) {
		try {
			return ((Class242) this).aBoolean6983;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kd.z(").append(')').toString());
		}
	}

	static final void method2404(Class430 class430, short i) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub22_7892, (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) == 1 ? 1 : 0, 111225986);
			Class435.method5568(1963696193);
			client.aBoolean9194 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kd.aki(").append(')').toString());
		}
	}

	static final void method2405(Class430 class430, int i) {
		try {
			int i_1_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_1_, 523199475);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = iComponentDefinitions.anInt1354 * -1843384083;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kd.rz(").append(')').toString());
		}
	}

	static final void method2406(Class430 class430, int i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_2_, -1379234975);
			Class120 class120 = Class3.aClass120Array56[i_2_ >> 16];
			Gfx.method789(iComponentDefinitions, class120, class430, 48470572);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kd.jf(").append(')').toString());
		}
	}
}
