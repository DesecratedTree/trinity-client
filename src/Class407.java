/* Class407 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class407 {
	IndexTable aClass280_4196;
	int anInt4197;
	Class395[] aClass395Array4198;

	public Class407(Class435 class435, Class454 class454, IndexTable class280, boolean bool) {
		((Class407) this).aClass280_4196 = class280;
		if (((Class407) this).aClass280_4196 != null)
			((Class407) this).anInt4197 = (((Class407) this).aClass280_4196.method2763(((Class103.aClass103_959.anInt982) * -989081113), -2049992517) * 1670621549);
		else
			((Class407) this).anInt4197 = 0;
		if (bool) {
			((Class407) this).aClass395Array4198 = new Class395[1883621477 * ((Class407) this).anInt4197];
			for (int i = 0; i < 1883621477 * ((Class407) this).anInt4197; i++) {
				byte[] is;
				synchronized (((Class407) this).aClass280_4196) {
					is = (((Class407) this).aClass280_4196.getFile(Class103.aClass103_959.anInt982 * -989081113, i));
				}
				Class395 class395 = new Class395();
				if (is != null)
					class395.method4635(new Buffer(is), -292477397);
				class395.method4645(-122396692);
				((Class407) this).aClass395Array4198[i] = class395;
				((Class395) ((Class407) this).aClass395Array4198[i]).aClass407_4090 = this;
			}
		}
	}

	public Class395 method4752(int i, int i_0_) {
		try {//probably objects
			return ((Class407) this).aClass395Array4198[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qx.r(").append(')').toString());
		}
	}

	int method4753(Interface29 interface29, int i) {
		try {
			int i_1_ = 0;
			for (int i_2_ = 0; i_2_ < 1883621477 * ((Class407) this).anInt4197; i_2_++) {
				Class395 class395 = method4752(i_2_, -1688473696);
				if (class395.method4636(interface29, -1939811453))
					i_1_ += 1279611097 * class395.anInt4083;
			}
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qx.j(").append(')').toString());
		}
	}

	static final void method4754(Class430 class430, int i) {
		try {
			int i_3_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			int i_4_ = client.aClass286Array9234[i_3_].method2868(2034062860);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_4_ == 0 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qx.yx(").append(')').toString());
		}
	}

	static final void method4755(Class430 class430, int i) {
		try {
			Class330_Sub28 class330_sub28 = (Class330_Sub28) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class401_Sub1.aClass145_Sub1_8249.method1718(2031388488) != Class146.aClass146_1607)
				throw new RuntimeException();
			Class475_Sub4 class475_sub4 = ((Class475_Sub4) Class401_Sub1.aClass145_Sub1_8249.method1715(254385052));
			class475_sub4.method5956(class330_sub28, -160088326);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qx.ahr(").append(')').toString());
		}
	}

	static final void method4756(Class430 class430, int i) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub25_7896, (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) == 1 ? 2 : 0, -1400058673);
			client.aClass304_9030.method3032(-628584915);
			Class435.method5568(1535525093);
			client.aBoolean9194 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qx.akb(").append(')').toString());
		}
	}
}
