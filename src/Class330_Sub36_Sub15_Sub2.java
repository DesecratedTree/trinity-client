/* Class330_Sub36_Sub15_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub36_Sub15_Sub2 extends Class330_Sub36_Sub15 {
	float aFloat10142;
	float aFloat10143;
	Class141 aClass141_10144;
	float aFloat10145;

	public void method3496(Buffer class330_sub46, int i) {
		try {
			((Class330_Sub36_Sub15_Sub2) this).aClass141_10144 = Class217.method2247(class330_sub46.readUnsignedByte(333760996), -1946172084);
			((Class330_Sub36_Sub15_Sub2) this).aFloat10143 = class330_sub46.method3760(-1279245802);
			((Class330_Sub36_Sub15_Sub2) this).aFloat10145 = class330_sub46.method3760(-1279245802);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("all.p(").append(')').toString());
		}
	}

	Class330_Sub36_Sub15_Sub2(int i, Buffer class330_sub46) {
		super(i);
		((Class330_Sub36_Sub15_Sub2) this).aClass141_10144 = Class217.method2247(class330_sub46.readUnsignedByte(1297642114), -206582960);
		((Class330_Sub36_Sub15_Sub2) this).aFloat10143 = class330_sub46.method3760(-1279245802);
		((Class330_Sub36_Sub15_Sub2) this).aFloat10145 = class330_sub46.method3760(-1279245802);
	}

	public void method3502(float f, byte i) {
		try {
			((Class330_Sub36_Sub15_Sub2) this).aFloat10142 += f * ((Class330_Sub36_Sub15_Sub2) this).aFloat10145;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("all.j(").append(')').toString());
		}
	}

	public void method3495(Class138 class138, Class247 class247, Class249 class249, int i) {
		try {
			float f = (float) Math.sin((double) ((Class330_Sub36_Sub15_Sub2) this).aFloat10142);
			float f_0_ = ((Class330_Sub36_Sub15_Sub2) this).aFloat10143 * f;
			if (((Class330_Sub36_Sub15_Sub2) this).aClass141_10144 == Class141.aClass141_1560) {
				Class138 class138_1_;
				(class138_1_ = class138).anInt1532 = -581921585 * (int) (f_0_ + (float) (class138_1_.anInt1532 * -1708658129));
				class247.method2474(f_0_, 0.0F, 0.0F);
			} else if (((Class330_Sub36_Sub15_Sub2) this).aClass141_10144 == Class141.aClass141_1561) {
				Class138 class138_2_;
				(class138_2_ = class138).anInt1531 = (int) ((float) (-1724005309 * class138_2_.anInt1531) + f_0_) * 1868671083;
				class247.method2474(0.0F, f_0_, 0.0F);
			} else if (Class141.aClass141_1563 == ((Class330_Sub36_Sub15_Sub2) this).aClass141_10144) {
				Class138 class138_3_;
				(class138_3_ = class138).anInt1533 = (int) (f_0_ + (float) (class138_3_.anInt1533 * 1914258703)) * -950728209;
				class247.method2474(0.0F, 0.0F, f_0_);
			} else if (Class141.aClass141_1562 == ((Class330_Sub36_Sub15_Sub2) this).aClass141_10144)
				class247.method2462(1.0F, 0.0F, 0.0F, f_0_);
			else if (Class141.aClass141_1559 == ((Class330_Sub36_Sub15_Sub2) this).aClass141_10144)
				class247.method2462(0.0F, 1.0F, 0.0F, f_0_);
			else if (Class141.aClass141_1564 == ((Class330_Sub36_Sub15_Sub2) this).aClass141_10144)
				class247.method2462(0.0F, 0.0F, 1.0F, f_0_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("all.i(").append(')').toString());
		}
	}

	public void method3499(float f) {
		((Class330_Sub36_Sub15_Sub2) this).aFloat10142 += f * ((Class330_Sub36_Sub15_Sub2) this).aFloat10145;
	}

	public void method3497(float f) {
		((Class330_Sub36_Sub15_Sub2) this).aFloat10142 += f * ((Class330_Sub36_Sub15_Sub2) this).aFloat10145;
	}

	public void method3498(float f) {
		((Class330_Sub36_Sub15_Sub2) this).aFloat10142 += f * ((Class330_Sub36_Sub15_Sub2) this).aFloat10145;
	}

	public void method3501(Class138 class138, Class247 class247, Class249 class249) {
		float f = (float) Math.sin((double) ((Class330_Sub36_Sub15_Sub2) this).aFloat10142);
		float f_4_ = ((Class330_Sub36_Sub15_Sub2) this).aFloat10143 * f;
		if (((Class330_Sub36_Sub15_Sub2) this).aClass141_10144 == Class141.aClass141_1560) {
			Class138 class138_5_;
			(class138_5_ = class138).anInt1532 = -581921585 * (int) (f_4_ + (float) (class138_5_.anInt1532 * -1708658129));
			class247.method2474(f_4_, 0.0F, 0.0F);
		} else if (((Class330_Sub36_Sub15_Sub2) this).aClass141_10144 == Class141.aClass141_1561) {
			Class138 class138_6_;
			(class138_6_ = class138).anInt1531 = ((int) ((float) (-1724005309 * class138_6_.anInt1531) + f_4_) * 1868671083);
			class247.method2474(0.0F, f_4_, 0.0F);
		} else if (Class141.aClass141_1563 == ((Class330_Sub36_Sub15_Sub2) this).aClass141_10144) {
			Class138 class138_7_;
			(class138_7_ = class138).anInt1533 = ((int) (f_4_ + (float) (class138_7_.anInt1533 * 1914258703)) * -950728209);
			class247.method2474(0.0F, 0.0F, f_4_);
		} else if (Class141.aClass141_1562 == ((Class330_Sub36_Sub15_Sub2) this).aClass141_10144)
			class247.method2462(1.0F, 0.0F, 0.0F, f_4_);
		else if (Class141.aClass141_1559 == ((Class330_Sub36_Sub15_Sub2) this).aClass141_10144)
			class247.method2462(0.0F, 1.0F, 0.0F, f_4_);
		else if (Class141.aClass141_1564 == ((Class330_Sub36_Sub15_Sub2) this).aClass141_10144)
			class247.method2462(0.0F, 0.0F, 1.0F, f_4_);
	}

	public void method3494(Class138 class138, Class247 class247, Class249 class249) {
		float f = (float) Math.sin((double) ((Class330_Sub36_Sub15_Sub2) this).aFloat10142);
		float f_8_ = ((Class330_Sub36_Sub15_Sub2) this).aFloat10143 * f;
		if (((Class330_Sub36_Sub15_Sub2) this).aClass141_10144 == Class141.aClass141_1560) {
			Class138 class138_9_;
			(class138_9_ = class138).anInt1532 = -581921585 * (int) (f_8_ + (float) (class138_9_.anInt1532 * -1708658129));
			class247.method2474(f_8_, 0.0F, 0.0F);
		} else if (((Class330_Sub36_Sub15_Sub2) this).aClass141_10144 == Class141.aClass141_1561) {
			Class138 class138_10_;
			(class138_10_ = class138).anInt1531 = (int) ((float) (-1724005309 * class138_10_.anInt1531) + f_8_) * 1868671083;
			class247.method2474(0.0F, f_8_, 0.0F);
		} else if (Class141.aClass141_1563 == ((Class330_Sub36_Sub15_Sub2) this).aClass141_10144) {
			Class138 class138_11_;
			(class138_11_ = class138).anInt1533 = ((int) (f_8_ + (float) (class138_11_.anInt1533 * 1914258703)) * -950728209);
			class247.method2474(0.0F, 0.0F, f_8_);
		} else if (Class141.aClass141_1562 == ((Class330_Sub36_Sub15_Sub2) this).aClass141_10144)
			class247.method2462(1.0F, 0.0F, 0.0F, f_8_);
		else if (Class141.aClass141_1559 == ((Class330_Sub36_Sub15_Sub2) this).aClass141_10144)
			class247.method2462(0.0F, 1.0F, 0.0F, f_8_);
		else if (Class141.aClass141_1564 == ((Class330_Sub36_Sub15_Sub2) this).aClass141_10144)
			class247.method2462(0.0F, 0.0F, 1.0F, f_8_);
	}

	public void method3500(Class138 class138, Class247 class247, Class249 class249) {
		float f = (float) Math.sin((double) ((Class330_Sub36_Sub15_Sub2) this).aFloat10142);
		float f_12_ = ((Class330_Sub36_Sub15_Sub2) this).aFloat10143 * f;
		if (((Class330_Sub36_Sub15_Sub2) this).aClass141_10144 == Class141.aClass141_1560) {
			Class138 class138_13_;
			(class138_13_ = class138).anInt1532 = -581921585 * (int) (f_12_ + (float) (class138_13_.anInt1532 * -1708658129));
			class247.method2474(f_12_, 0.0F, 0.0F);
		} else if (((Class330_Sub36_Sub15_Sub2) this).aClass141_10144 == Class141.aClass141_1561) {
			Class138 class138_14_;
			(class138_14_ = class138).anInt1531 = (int) ((float) (-1724005309 * class138_14_.anInt1531) + f_12_) * 1868671083;
			class247.method2474(0.0F, f_12_, 0.0F);
		} else if (Class141.aClass141_1563 == ((Class330_Sub36_Sub15_Sub2) this).aClass141_10144) {
			Class138 class138_15_;
			(class138_15_ = class138).anInt1533 = (int) (f_12_ + (float) (class138_15_.anInt1533 * 1914258703)) * -950728209;
			class247.method2474(0.0F, 0.0F, f_12_);
		} else if (Class141.aClass141_1562 == ((Class330_Sub36_Sub15_Sub2) this).aClass141_10144)
			class247.method2462(1.0F, 0.0F, 0.0F, f_12_);
		else if (Class141.aClass141_1559 == ((Class330_Sub36_Sub15_Sub2) this).aClass141_10144)
			class247.method2462(0.0F, 1.0F, 0.0F, f_12_);
		else if (Class141.aClass141_1564 == ((Class330_Sub36_Sub15_Sub2) this).aClass141_10144)
			class247.method2462(0.0F, 0.0F, 1.0F, f_12_);
	}

	public Class330_Sub36_Sub15_Sub2(int i, Class141 class141, float f, float f_16_) {
		super(i);
		((Class330_Sub36_Sub15_Sub2) this).aClass141_10144 = class141;
		((Class330_Sub36_Sub15_Sub2) this).aFloat10143 = f;
		((Class330_Sub36_Sub15_Sub2) this).aFloat10145 = f_16_;
	}

	public void method3493(Buffer class330_sub46) {
		((Class330_Sub36_Sub15_Sub2) this).aClass141_10144 = Class217.method2247(class330_sub46.readUnsignedByte(1064307750), -1484218123);
		((Class330_Sub36_Sub15_Sub2) this).aFloat10143 = class330_sub46.method3760(-1279245802);
		((Class330_Sub36_Sub15_Sub2) this).aFloat10145 = class330_sub46.method3760(-1279245802);
	}
}
