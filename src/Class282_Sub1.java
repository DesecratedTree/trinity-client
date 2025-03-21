/* Class282_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class Class282_Sub1 extends Class282 {
	byte[] aByteArray7414;
	Class285 aClass285_7415;
	Class267 aClass267_7416;
	Class339 aClass339_7417;
	Class339 aClass339_7418;
	Class330_Sub36_Sub16 aClass330_Sub36_Sub16_7419;
	boolean aBoolean7420;
	static int anInt7421 = 1;
	int anInt7422;
	Class278 aClass278_7423;
	static byte aByte7424 = 0;
	static byte aByte7425 = 1;
	static byte aByte7426 = -1;
	int anInt7427 = 0;
	int anInt7428;
	int anInt7429;
	boolean aBoolean7430;
	byte[] aByteArray7431;
	int anInt7432;
	Class471 aClass471_7433;
	Class471 aClass471_7434;
	static int anInt7435 = 0;
	long aLong7436;
	static int anInt7437 = 1000;
	static int anInt7438 = 250;
	Class497 aClass497_7439 = new Class497(16);
	static CRC32 aCRC32_7440 = new CRC32();
	boolean aBoolean7441;
	static int anInt7442 = 2;
	public static short[] aShortArray7443;

	int method2798(int i) {
		Class330_Sub36_Sub16 class330_sub36_sub16 = ((Class330_Sub36_Sub16) ((Class282_Sub1) this).aClass497_7439.method6094((long) i));
		if (class330_sub36_sub16 != null)
			return class330_sub36_sub16.method3506((byte) 33);
		return 0;
	}

	byte[] read(int i, byte i_0_) {
		try {
			Class330_Sub36_Sub16 class330_sub36_sub16 = method2821(i, 0, -708504793);
			if (class330_sub36_sub16 == null)
				return null;
			byte[] is = class330_sub36_sub16.method3511(356740128);
			class330_sub36_sub16.method3252(1336328257);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abu.j(").append(')').toString());
		}
	}

	public int method2814(int i) {
		try {
			if (((Class282_Sub1) this).aClass278_7423 == null)
				return 0;
			return ((((Class278) ((Class282_Sub1) this).aClass278_7423).anInt2883) * -1914660269);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abu.t(").append(')').toString());
		}
	}

	void method2815(int i) {
		try {
			if (null != ((Class282_Sub1) this).aClass471_7433 && method2804((byte) 37) != null) {
				for (Class330 class330 = ((Class282_Sub1) this).aClass471_7434.method5869(539664854); null != class330; class330 = ((Class282_Sub1) this).aClass471_7434.method5873((byte) -99)) {
					int i_1_ = (int) (class330.aLong3341 * -6154793640677333111L);
					if (i_1_ < 0 || i_1_ >= (1334516995 * ((Class278) (((Class282_Sub1) this).aClass278_7423)).archiveSize) || (((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2872[i_1_]) == 0)
						class330.method3252(-445398432);
					else {
						if (((Class282_Sub1) this).aByteArray7431[i_1_] == 0)
							method2821(i_1_, 1, 988876361);
						if (((Class282_Sub1) this).aByteArray7431[i_1_] == -1)
							method2821(i_1_, 2, -1716227022);
						if (1 == ((Class282_Sub1) this).aByteArray7431[i_1_])
							class330.method3252(745113656);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abu.e(").append(')').toString());
		}
	}

	void method2816(byte i) {
		try {
			if (((Class282_Sub1) this).aClass471_7433 != null) {
				if (method2804((byte) 105) == null)
					return;
				if (((Class282_Sub1) this).aBoolean7420) {
					boolean bool = true;
					for (Class330 class330 = ((Class282_Sub1) this).aClass471_7433.method5869(539664854); null != class330; class330 = ((Class282_Sub1) this).aClass471_7433.method5873((byte) -111)) {
						int i_2_ = (int) (-6154793640677333111L * class330.aLong3341);
						if (0 == ((Class282_Sub1) this).aByteArray7431[i_2_])
							method2821(i_2_, 1, -1108904907);
						if (0 != ((Class282_Sub1) this).aByteArray7431[i_2_])
							class330.method3252(-1761912239);
						else
							bool = false;
					}
					while (1888788063 * ((Class282_Sub1) this).anInt7432 < (((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2872).length) {
						if (0 == (((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2872[(((Class282_Sub1) this).anInt7432 * 1888788063)]))
							((Class282_Sub1) this).anInt7432 += -265601633;
						else {
							if ((((Class267) (((Class282_Sub1) this).aClass267_7416)).anInt2737 * -1056264315) >= 250) {
								bool = false;
								break;
							}
							if ((((Class282_Sub1) this).aByteArray7431[(((Class282_Sub1) this).anInt7432 * 1888788063)]) == 0)
								method2821((((Class282_Sub1) this).anInt7432 * 1888788063), 1, -1084005907);
							if ((((Class282_Sub1) this).aByteArray7431[(((Class282_Sub1) this).anInt7432 * 1888788063)]) == 0) {
								Class330 class330 = new Class330();
								class330.aLong3341 = ((long) ((Class282_Sub1) this).anInt7432 * -1770860201307327321L);
								((Class282_Sub1) this).aClass471_7433.method5878(class330, (short) 8192);
								bool = false;
							}
							((Class282_Sub1) this).anInt7432 += -265601633;
						}
					}
					if (bool) {
						((Class282_Sub1) this).aBoolean7420 = false;
						((Class282_Sub1) this).anInt7432 = 0;
					}
				} else if (((Class282_Sub1) this).aBoolean7430) {
					boolean bool = true;
					for (Class330 class330 = ((Class282_Sub1) this).aClass471_7433.method5869(539664854); null != class330; class330 = ((Class282_Sub1) this).aClass471_7433.method5873((byte) -41)) {
						int i_3_ = (int) (class330.aLong3341 * -6154793640677333111L);
						if (((Class282_Sub1) this).aByteArray7431[i_3_] != 1)
							method2821(i_3_, 2, 1876055387);
						if (((Class282_Sub1) this).aByteArray7431[i_3_] == 1)
							class330.method3252(-1939721848);
						else
							bool = false;
					}
					while (((Class282_Sub1) this).anInt7432 * 1888788063 < (((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2872).length) {
						if ((((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2872[1888788063 * ((Class282_Sub1) this).anInt7432]) == 0)
							((Class282_Sub1) this).anInt7432 += -265601633;
						else {
							if (((Class282_Sub1) this).aClass285_7415.method2844((byte) 7)) {
								bool = false;
								break;
							}
							if ((((Class282_Sub1) this).aByteArray7431[(1888788063 * ((Class282_Sub1) this).anInt7432)]) != 1)
								method2821(1888788063 * (((Class282_Sub1) this).anInt7432), 2, -1781992553);
							if ((((Class282_Sub1) this).aByteArray7431[(((Class282_Sub1) this).anInt7432 * 1888788063)]) != 1) {
								Class330 class330 = new Class330();
								class330.aLong3341 = ((long) ((Class282_Sub1) this).anInt7432 * -1770860201307327321L);
								((Class282_Sub1) this).aClass471_7433.method5878(class330, (short) 8192);
								bool = false;
							}
							((Class282_Sub1) this).anInt7432 += -265601633;
						}
					}
					if (bool) {
						((Class282_Sub1) this).aBoolean7430 = false;
						((Class282_Sub1) this).anInt7432 = 0;
					}
				} else
					((Class282_Sub1) this).aClass471_7433 = null;
			}
			if (((Class282_Sub1) this).aBoolean7441 && (Class312.method3111((byte) 22) >= (-5886078092207111931L * ((Class282_Sub1) this).aLong7436))) {
				for (Class330_Sub36_Sub16 class330_sub36_sub16 = (Class330_Sub36_Sub16) ((Class282_Sub1) this).aClass497_7439.method6099((byte) 54); class330_sub36_sub16 != null; class330_sub36_sub16 = ((Class330_Sub36_Sub16) ((Class282_Sub1) this).aClass497_7439.method6098((short) -32768))) {
					if (((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9721) {
						if (i <= 15)
							return;
					} else if (((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9722) {
						if (!((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9723)
							throw new RuntimeException();
						class330_sub36_sub16.method3252(1438559418);
					} else
						((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9722 = true;
				}
				((Class282_Sub1) this).aLong7436 = ((Class312.method3111((byte) 26) + 1000L) * 2758015620175520717L);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abu.m(").append(')').toString());
		}
	}

	Class282_Sub1(int i, Class339 class339, Class339 class339_4_, Class285 class285, Class267 class267, int i_5_, byte[] is, int i_6_, boolean bool) {
		((Class282_Sub1) this).anInt7432 = 0;
		((Class282_Sub1) this).aClass471_7434 = new Class471();
		((Class282_Sub1) this).aLong7436 = 0L;
		((Class282_Sub1) this).anInt7422 = 83252385 * i;
		((Class282_Sub1) this).aClass339_7417 = class339;
		if (((Class282_Sub1) this).aClass339_7417 == null)
			((Class282_Sub1) this).aBoolean7420 = false;
		else {
			((Class282_Sub1) this).aBoolean7420 = true;
			((Class282_Sub1) this).aClass471_7433 = new Class471();
		}
		((Class282_Sub1) this).aClass339_7418 = class339_4_;
		((Class282_Sub1) this).aClass285_7415 = class285;
		((Class282_Sub1) this).aClass267_7416 = class267;
		((Class282_Sub1) this).anInt7428 = -1516864853 * i_5_;
		((Class282_Sub1) this).aByteArray7414 = is;
		((Class282_Sub1) this).anInt7429 = i_6_ * -1512264545;
		((Class282_Sub1) this).aBoolean7441 = bool;
		if (null != ((Class282_Sub1) this).aClass339_7418)
			((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = (((Class282_Sub1) this).aClass267_7416.method2649(1726254945 * ((Class282_Sub1) this).anInt7422, ((Class282_Sub1) this).aClass339_7418, (byte) 9));
	}

	public int method2817(int i) {
		try {
			return 654102305 * ((Class282_Sub1) this).anInt7427;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abu.h(").append(')').toString());
		}
	}

	public int method2818(int i) {
		try {
			if (((Class282_Sub1) this).aClass278_7423 == null)
				return 0;
			if (!((Class282_Sub1) this).aBoolean7420)
				return ((((Class278) ((Class282_Sub1) this).aClass278_7423).anInt2883) * -1914660269);
			Class330 class330 = ((Class282_Sub1) this).aClass471_7433.method5869(539664854);
			if (class330 == null)
				return 0;
			return (int) (-6154793640677333111L * class330.aLong3341);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abu.y(").append(')').toString());
		}
	}

	public void method2819(int i) {
		try {
			if (((Class282_Sub1) this).aClass339_7417 != null) {
				((Class282_Sub1) this).aBoolean7430 = true;
				if (null == ((Class282_Sub1) this).aClass471_7433)
					((Class282_Sub1) this).aClass471_7433 = new Class471();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abu.v(").append(')').toString());
		}
	}

	void method2796(int i, int i_7_) {
		try {
			if (((Class282_Sub1) this).aClass339_7417 != null) {
				for (Class330 class330 = ((Class282_Sub1) this).aClass471_7434.method5869(539664854); null != class330; class330 = ((Class282_Sub1) this).aClass471_7434.method5873((byte) -46)) {
					if (-6154793640677333111L * class330.aLong3341 == (long) i)
						return;
				}
				Class330 class330 = new Class330();
				class330.aLong3341 = -1420004262915178823L * (long) i;
				((Class282_Sub1) this).aClass471_7434.method5878(class330, (short) 8192);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abu.i(").append(')').toString());
		}
	}

	int method2797(int i, short i_8_) {
		try {
			Class330_Sub36_Sub16 class330_sub36_sub16 = ((Class330_Sub36_Sub16) ((Class282_Sub1) this).aClass497_7439.method6094((long) i));
			if (class330_sub36_sub16 != null)
				return class330_sub36_sub16.method3506((byte) -21);
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abu.p(").append(')').toString());
		}
	}

	Class278 method2793() {
		if (null != ((Class282_Sub1) this).aClass278_7423)
			return ((Class282_Sub1) this).aClass278_7423;
		if (null == ((Class282_Sub1) this).aClass330_Sub36_Sub16_7419) {
			if (((Class282_Sub1) this).aClass285_7415.method2833((byte) 2))
				return null;
			((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = (((Class282_Sub1) this).aClass285_7415.method2832(255, ((Class282_Sub1) this).anInt7422 * 1726254945, (byte) 0, true, (byte) -115));
		}
		if (((Class330_Sub36_Sub16) ((Class282_Sub1) this).aClass330_Sub36_Sub16_7419).aBoolean9721)
			return null;
		byte[] is = ((Class282_Sub1) this).aClass330_Sub36_Sub16_7419.method3511(356740128);
		do {
			if (((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 instanceof Class330_Sub36_Sub16_Sub1) {
				try {
					if (is == null)
						throw new RuntimeException();
					((Class282_Sub1) this).aClass278_7423 = new Class278(is, (-1598705661 * ((Class282_Sub1) this).anInt7428), ((Class282_Sub1) this).aByteArray7414);
					if (187081643 * ((Class278) (((Class282_Sub1) this).aClass278_7423)).anInt2874 != -505581729 * ((Class282_Sub1) this).anInt7429)
						throw new RuntimeException();
					break;
				} catch (RuntimeException runtimeexception) {
					((Class282_Sub1) this).aClass278_7423 = null;
					if (((Class282_Sub1) this).aClass285_7415.method2833((byte) 2))
						((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = null;
					else
						((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = (((Class282_Sub1) this).aClass285_7415.method2832(255, ((Class282_Sub1) this).anInt7422 * 1726254945, (byte) 0, true, (byte) -85));
					return null;
				}
			}
			try {
				if (null == is)
					throw new RuntimeException();
				((Class282_Sub1) this).aClass278_7423 = new Class278(is, (-1598705661 * ((Class282_Sub1) this).anInt7428), ((Class282_Sub1) this).aByteArray7414);
			} catch (RuntimeException runtimeexception) {
				((Class282_Sub1) this).aClass285_7415.method2836(2109587941);
				((Class282_Sub1) this).aClass278_7423 = null;
				if (((Class282_Sub1) this).aClass285_7415.method2833((byte) 2))
					((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = null;
				else
					((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = (((Class282_Sub1) this).aClass285_7415.method2832(255, 1726254945 * ((Class282_Sub1) this).anInt7422, (byte) 0, true, (byte) -36));
				return null;
			}
			if (null != ((Class282_Sub1) this).aClass339_7418)
				((Class282_Sub1) this).aClass267_7416.method2652(((Class282_Sub1) this).anInt7422 * 1726254945, is, ((Class282_Sub1) this).aClass339_7418, -1869465837);
		} while (false);
		((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = null;
		if (((Class282_Sub1) this).aClass339_7417 != null) {
			((Class282_Sub1) this).aByteArray7431 = new byte[(((Class278) ((Class282_Sub1) this).aClass278_7423).archiveSize) * 1334516995];
			((Class282_Sub1) this).anInt7427 = 0;
		}
		return ((Class282_Sub1) this).aClass278_7423;
	}

	void method2805(int i) {
		if (((Class282_Sub1) this).aClass339_7417 != null) {
			for (Class330 class330 = ((Class282_Sub1) this).aClass471_7434.method5869(539664854); null != class330; class330 = ((Class282_Sub1) this).aClass471_7434.method5873((byte) -38)) {
				if (-6154793640677333111L * class330.aLong3341 == (long) i)
					return;
			}
			Class330 class330 = new Class330();
			class330.aLong3341 = -1420004262915178823L * (long) i;
			((Class282_Sub1) this).aClass471_7434.method5878(class330, (short) 8192);
		}
	}

	public int method2820(short i) {
		try {
			if (method2804((byte) 107) == null) {
				if (null == ((Class282_Sub1) this).aClass330_Sub36_Sub16_7419)
					return 0;
				return ((Class282_Sub1) this).aClass330_Sub36_Sub16_7419.method3506((byte) 79);
			}
			return 100;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abu.c(").append(')').toString());
		}
	}

	byte[] method2794(int i) {
		Class330_Sub36_Sub16 class330_sub36_sub16 = method2821(i, 0, -2006932428);
		if (class330_sub36_sub16 == null)
			return null;
		byte[] is = class330_sub36_sub16.method3511(356740128);
		class330_sub36_sub16.method3252(1005229954);
		return is;
	}

	byte[] method2802(int i) {
		Class330_Sub36_Sub16 class330_sub36_sub16 = method2821(i, 0, -1220713350);
		if (class330_sub36_sub16 == null)
			return null;
		byte[] is = class330_sub36_sub16.method3511(356740128);
		class330_sub36_sub16.method3252(-530121896);
		return is;
	}

	byte[] method2803(int i) {
		Class330_Sub36_Sub16 class330_sub36_sub16 = method2821(i, 0, -1637769584);
		if (class330_sub36_sub16 == null)
			return null;
		byte[] is = class330_sub36_sub16.method3511(356740128);
		class330_sub36_sub16.method3252(-1323530776);
		return is;
	}

	Class330_Sub36_Sub16 method2821(int i, int i_9_, int i_10_) {
		try {
			Class330_Sub36_Sub16 class330_sub36_sub16 = ((Class330_Sub36_Sub16) ((Class282_Sub1) this).aClass497_7439.method6094((long) i));
			if (null != class330_sub36_sub16 && i_9_ == 0 && !((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9723 && (((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9721)) {
				class330_sub36_sub16.method3252(-1174528287);
				class330_sub36_sub16 = null;
			}
			if (null == class330_sub36_sub16) {
				if (0 == i_9_) {
					if (null != ((Class282_Sub1) this).aClass339_7417 && -1 != ((Class282_Sub1) this).aByteArray7431[i])
						class330_sub36_sub16 = (((Class282_Sub1) this).aClass267_7416.method2649(i, ((Class282_Sub1) this).aClass339_7417, (byte) 122));
					else if (!((Class282_Sub1) this).aClass285_7415.method2833((byte) 2))
						class330_sub36_sub16 = (((Class282_Sub1) this).aClass285_7415.method2832(1726254945 * ((Class282_Sub1) this).anInt7422, i, (byte) 2, true, (byte) -109));
					else
						return null;
				} else if (i_9_ == 1) {
					if (null == ((Class282_Sub1) this).aClass339_7417)
						throw new RuntimeException();
					class330_sub36_sub16 = (((Class282_Sub1) this).aClass267_7416.method2651(i, ((Class282_Sub1) this).aClass339_7417, 650742825));
				} else if (2 == i_9_) {
					if (null == ((Class282_Sub1) this).aClass339_7417)
						throw new RuntimeException();
					if (((Class282_Sub1) this).aByteArray7431[i] != -1)
						throw new RuntimeException();
					if (!((Class282_Sub1) this).aClass285_7415.method2844((byte) 36))
						class330_sub36_sub16 = (((Class282_Sub1) this).aClass285_7415.method2832(1726254945 * ((Class282_Sub1) this).anInt7422, i, (byte) 2, false, (byte) -46));
					else
						return null;
				} else
					throw new RuntimeException();
				((Class282_Sub1) this).aClass497_7439.method6097(class330_sub36_sub16, (long) i);
			}
			if (((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9721)
				return null;
			byte[] is = class330_sub36_sub16.method3511(356740128);
			if (class330_sub36_sub16 instanceof Class330_Sub36_Sub16_Sub1) {
				Class330_Sub36_Sub16 class330_sub36_sub16_11_;
				try {
					if (is == null || is.length <= 2)
						throw new RuntimeException();
					aCRC32_7440.reset();
					aCRC32_7440.update(is, 0, is.length - 2);
					int i_12_ = (int) aCRC32_7440.getValue();
					if (i_12_ != (((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2878[i]))
						throw new RuntimeException();
					if ((null != (((Class278) ((Class282_Sub1) this).aClass278_7423).aByteArrayArray2879)) && null != (((Class278) ((Class282_Sub1) this).aClass278_7423).aByteArrayArray2879[i])) {
						byte[] is_13_ = (((Class278) (((Class282_Sub1) this).aClass278_7423)).aByteArrayArray2879[i]);
						byte[] is_14_ = Class562.method6473(is, 0, is.length - 2, (byte) -87);
						for (int i_15_ = 0; i_15_ < 64; i_15_++) {
							if (is_14_[i_15_] != is_13_[i_15_])
								throw new RuntimeException();
						}
					}
					int i_16_ = (((is[is.length - 2] & 0xff) << 8) + (is[is.length - 1] & 0xff));
					if (i_16_ != ((((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2880[i]) & 0xffff))
						throw new RuntimeException();
					if (((Class282_Sub1) this).aByteArray7431[i] != 1) {
						if (((Class282_Sub1) this).aByteArray7431[i] != 0) {
							/* empty */
						}
						((Class282_Sub1) this).anInt7427 += 2123592929;
						((Class282_Sub1) this).aByteArray7431[i] = (byte) 1;
					}
					if (!((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9723)
						class330_sub36_sub16.method3252(-247918713);
					class330_sub36_sub16_11_ = class330_sub36_sub16;
				} catch (Exception exception) {
					((Class282_Sub1) this).aByteArray7431[i] = (byte) -1;
					class330_sub36_sub16.method3252(375307671);
					if ((((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9723) && !((Class282_Sub1) this).aClass285_7415.method2833((byte) 2)) {
						Class330_Sub36_Sub16_Sub2 class330_sub36_sub16_sub2 = (((Class282_Sub1) this).aClass285_7415.method2832(1726254945 * ((Class282_Sub1) this).anInt7422, i, (byte) 2, true, (byte) -65));
						((Class282_Sub1) this).aClass497_7439.method6097(class330_sub36_sub16_sub2, (long) i);
					}
					return null;
				}
				return class330_sub36_sub16_11_;
			}
			try {
				if (is == null || is.length <= 2)
					throw new RuntimeException();
				aCRC32_7440.reset();
				aCRC32_7440.update(is, 0, is.length - 2);
				int i_17_ = (int) aCRC32_7440.getValue();
				if (i_17_ != (((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2878[i]))
					throw new RuntimeException();
				if ((((Class278) ((Class282_Sub1) this).aClass278_7423).aByteArrayArray2879) != null && (null != (((Class278) ((Class282_Sub1) this).aClass278_7423).aByteArrayArray2879[i]))) {
					byte[] is_18_ = (((Class278) ((Class282_Sub1) this).aClass278_7423).aByteArrayArray2879[i]);
					byte[] is_19_ = Class562.method6473(is, 0, is.length - 2, (byte) -125);
					for (int i_20_ = 0; i_20_ < 64; i_20_++) {
						if (is_19_[i_20_] != is_18_[i_20_])
							throw new RuntimeException();
					}
				}
				((Class282_Sub1) this).aClass285_7415.anInt2941 = 0;
				((Class282_Sub1) this).aClass285_7415.anInt2932 = 0;
			} catch (RuntimeException runtimeexception) {
				((Class282_Sub1) this).aClass285_7415.method2836(2028855050);
				class330_sub36_sub16.method3252(675504416);
				if (((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9723 && !((Class282_Sub1) this).aClass285_7415.method2833((byte) 2)) {
					Class330_Sub36_Sub16_Sub2 class330_sub36_sub16_sub2 = (((Class282_Sub1) this).aClass285_7415.method2832(1726254945 * ((Class282_Sub1) this).anInt7422, i, (byte) 2, true, (byte) -69));
					((Class282_Sub1) this).aClass497_7439.method6097(class330_sub36_sub16_sub2, (long) i);
				}
				return null;
			}
			is[is.length - 2] = (byte) ((((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2880[i]) >>> 8);
			is[is.length - 1] = (byte) (((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2880[i]);
			if (null != ((Class282_Sub1) this).aClass339_7417) {
				((Class282_Sub1) this).aClass267_7416.method2652(i, is, ((Class282_Sub1) this).aClass339_7417, 681967698);
				if (((Class282_Sub1) this).aByteArray7431[i] != 1) {
					((Class282_Sub1) this).anInt7427 += 2123592929;
					((Class282_Sub1) this).aByteArray7431[i] = (byte) 1;
				}
			}
			if (!((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9723)
				class330_sub36_sub16.method3252(24153533);
			return class330_sub36_sub16;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abu.a(").append(')').toString());
		}
	}

	void method2807(int i) {
		if (((Class282_Sub1) this).aClass339_7417 != null) {
			for (Class330 class330 = ((Class282_Sub1) this).aClass471_7434.method5869(539664854); null != class330; class330 = ((Class282_Sub1) this).aClass471_7434.method5873((byte) -105)) {
				if (-6154793640677333111L * class330.aLong3341 == (long) i)
					return;
			}
			Class330 class330 = new Class330();
			class330.aLong3341 = -1420004262915178823L * (long) i;
			((Class282_Sub1) this).aClass471_7434.method5878(class330, (short) 8192);
		}
	}

	Class330_Sub36_Sub16 method2822(int i, int i_21_) {
		Class330_Sub36_Sub16 class330_sub36_sub16 = ((Class330_Sub36_Sub16) ((Class282_Sub1) this).aClass497_7439.method6094((long) i));
		if (null != class330_sub36_sub16 && i_21_ == 0 && !((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9723 && ((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9721) {
			class330_sub36_sub16.method3252(396956555);
			class330_sub36_sub16 = null;
		}
		if (null == class330_sub36_sub16) {
			if (0 == i_21_) {
				if (null != ((Class282_Sub1) this).aClass339_7417 && -1 != ((Class282_Sub1) this).aByteArray7431[i])
					class330_sub36_sub16 = (((Class282_Sub1) this).aClass267_7416.method2649(i, ((Class282_Sub1) this).aClass339_7417, (byte) 108));
				else if (!((Class282_Sub1) this).aClass285_7415.method2833((byte) 2))
					class330_sub36_sub16 = (((Class282_Sub1) this).aClass285_7415.method2832(1726254945 * ((Class282_Sub1) this).anInt7422, i, (byte) 2, true, (byte) -106));
				else
					return null;
			} else if (i_21_ == 1) {
				if (null == ((Class282_Sub1) this).aClass339_7417)
					throw new RuntimeException();
				class330_sub36_sub16 = (((Class282_Sub1) this).aClass267_7416.method2651(i, ((Class282_Sub1) this).aClass339_7417, -1372477285));
			} else if (2 == i_21_) {
				if (null == ((Class282_Sub1) this).aClass339_7417)
					throw new RuntimeException();
				if (((Class282_Sub1) this).aByteArray7431[i] != -1)
					throw new RuntimeException();
				if (!((Class282_Sub1) this).aClass285_7415.method2844((byte) 56))
					class330_sub36_sub16 = (((Class282_Sub1) this).aClass285_7415.method2832(1726254945 * ((Class282_Sub1) this).anInt7422, i, (byte) 2, false, (byte) -33));
				else
					return null;
			} else
				throw new RuntimeException();
			((Class282_Sub1) this).aClass497_7439.method6097(class330_sub36_sub16, (long) i);
		}
		if (((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9721)
			return null;
		byte[] is = class330_sub36_sub16.method3511(356740128);
		if (class330_sub36_sub16 instanceof Class330_Sub36_Sub16_Sub1) {
			Class330_Sub36_Sub16 class330_sub36_sub16_22_;
			try {
				if (is == null || is.length <= 2)
					throw new RuntimeException();
				aCRC32_7440.reset();
				aCRC32_7440.update(is, 0, is.length - 2);
				int i_23_ = (int) aCRC32_7440.getValue();
				if (i_23_ != (((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2878[i]))
					throw new RuntimeException();
				if (null != (((Class278) ((Class282_Sub1) this).aClass278_7423).aByteArrayArray2879) && (null != (((Class278) ((Class282_Sub1) this).aClass278_7423).aByteArrayArray2879[i]))) {
					byte[] is_24_ = (((Class278) ((Class282_Sub1) this).aClass278_7423).aByteArrayArray2879[i]);
					byte[] is_25_ = Class562.method6473(is, 0, is.length - 2, (byte) -100);
					for (int i_26_ = 0; i_26_ < 64; i_26_++) {
						if (is_25_[i_26_] != is_24_[i_26_])
							throw new RuntimeException();
					}
				}
				int i_27_ = (((is[is.length - 2] & 0xff) << 8) + (is[is.length - 1] & 0xff));
				if (i_27_ != ((((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2880[i]) & 0xffff))
					throw new RuntimeException();
				if (((Class282_Sub1) this).aByteArray7431[i] != 1) {
					if (((Class282_Sub1) this).aByteArray7431[i] != 0) {
						/* empty */
					}
					((Class282_Sub1) this).anInt7427 += 2123592929;
					((Class282_Sub1) this).aByteArray7431[i] = (byte) 1;
				}
				if (!((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9723)
					class330_sub36_sub16.method3252(941346893);
				class330_sub36_sub16_22_ = class330_sub36_sub16;
			} catch (Exception exception) {
				((Class282_Sub1) this).aByteArray7431[i] = (byte) -1;
				class330_sub36_sub16.method3252(-772592185);
				if (((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9723 && !((Class282_Sub1) this).aClass285_7415.method2833((byte) 2)) {
					Class330_Sub36_Sub16_Sub2 class330_sub36_sub16_sub2 = (((Class282_Sub1) this).aClass285_7415.method2832(1726254945 * ((Class282_Sub1) this).anInt7422, i, (byte) 2, true, (byte) -6));
					((Class282_Sub1) this).aClass497_7439.method6097(class330_sub36_sub16_sub2, (long) i);
				}
				return null;
			}
			return class330_sub36_sub16_22_;
		}
		try {
			if (is == null || is.length <= 2)
				throw new RuntimeException();
			aCRC32_7440.reset();
			aCRC32_7440.update(is, 0, is.length - 2);
			int i_28_ = (int) aCRC32_7440.getValue();
			if (i_28_ != (((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2878[i]))
				throw new RuntimeException();
			if ((((Class278) ((Class282_Sub1) this).aClass278_7423).aByteArrayArray2879) != null && null != (((Class278) ((Class282_Sub1) this).aClass278_7423).aByteArrayArray2879[i])) {
				byte[] is_29_ = (((Class278) ((Class282_Sub1) this).aClass278_7423).aByteArrayArray2879[i]);
				byte[] is_30_ = Class562.method6473(is, 0, is.length - 2, (byte) -14);
				for (int i_31_ = 0; i_31_ < 64; i_31_++) {
					if (is_30_[i_31_] != is_29_[i_31_])
						throw new RuntimeException();
				}
			}
			((Class282_Sub1) this).aClass285_7415.anInt2941 = 0;
			((Class282_Sub1) this).aClass285_7415.anInt2932 = 0;
		} catch (RuntimeException runtimeexception) {
			((Class282_Sub1) this).aClass285_7415.method2836(1982838528);
			class330_sub36_sub16.method3252(1119055332);
			if (((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9723 && !((Class282_Sub1) this).aClass285_7415.method2833((byte) 2)) {
				Class330_Sub36_Sub16_Sub2 class330_sub36_sub16_sub2 = (((Class282_Sub1) this).aClass285_7415.method2832(1726254945 * ((Class282_Sub1) this).anInt7422, i, (byte) 2, true, (byte) -72));
				((Class282_Sub1) this).aClass497_7439.method6097(class330_sub36_sub16_sub2, (long) i);
			}
			return null;
		}
		is[is.length - 2] = (byte) ((((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2880[i]) >>> 8);
		is[is.length - 1] = (byte) (((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2880[i]);
		if (null != ((Class282_Sub1) this).aClass339_7417) {
			((Class282_Sub1) this).aClass267_7416.method2652(i, is, ((Class282_Sub1) this).aClass339_7417, 1741459170);
			if (((Class282_Sub1) this).aByteArray7431[i] != 1) {
				((Class282_Sub1) this).anInt7427 += 2123592929;
				((Class282_Sub1) this).aByteArray7431[i] = (byte) 1;
			}
		}
		if (!((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9723)
			class330_sub36_sub16.method3252(-589580067);
		return class330_sub36_sub16;
	}

	void method2806(int i) {
		if (((Class282_Sub1) this).aClass339_7417 != null) {
			for (Class330 class330 = ((Class282_Sub1) this).aClass471_7434.method5869(539664854); null != class330; class330 = ((Class282_Sub1) this).aClass471_7434.method5873((byte) -78)) {
				if (-6154793640677333111L * class330.aLong3341 == (long) i)
					return;
			}
			Class330 class330 = new Class330();
			class330.aLong3341 = -1420004262915178823L * (long) i;
			((Class282_Sub1) this).aClass471_7434.method5878(class330, (short) 8192);
		}
	}

	Class278 method2799() {
		if (null != ((Class282_Sub1) this).aClass278_7423)
			return ((Class282_Sub1) this).aClass278_7423;
		if (null == ((Class282_Sub1) this).aClass330_Sub36_Sub16_7419) {
			if (((Class282_Sub1) this).aClass285_7415.method2833((byte) 2))
				return null;
			((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = (((Class282_Sub1) this).aClass285_7415.method2832(255, ((Class282_Sub1) this).anInt7422 * 1726254945, (byte) 0, true, (byte) -56));
		}
		if (((Class330_Sub36_Sub16) ((Class282_Sub1) this).aClass330_Sub36_Sub16_7419).aBoolean9721)
			return null;
		byte[] is = ((Class282_Sub1) this).aClass330_Sub36_Sub16_7419.method3511(356740128);
		do {
			if (((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 instanceof Class330_Sub36_Sub16_Sub1) {
				try {
					if (is == null)
						throw new RuntimeException();
					((Class282_Sub1) this).aClass278_7423 = new Class278(is, (-1598705661 * ((Class282_Sub1) this).anInt7428), ((Class282_Sub1) this).aByteArray7414);
					if (187081643 * ((Class278) (((Class282_Sub1) this).aClass278_7423)).anInt2874 != -505581729 * ((Class282_Sub1) this).anInt7429)
						throw new RuntimeException();
					break;
				} catch (RuntimeException runtimeexception) {
					((Class282_Sub1) this).aClass278_7423 = null;
					if (((Class282_Sub1) this).aClass285_7415.method2833((byte) 2))
						((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = null;
					else
						((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = (((Class282_Sub1) this).aClass285_7415.method2832(255, ((Class282_Sub1) this).anInt7422 * 1726254945, (byte) 0, true, (byte) -43));
					return null;
				}
			}
			try {
				if (null == is)
					throw new RuntimeException();
				((Class282_Sub1) this).aClass278_7423 = new Class278(is, (-1598705661 * ((Class282_Sub1) this).anInt7428), ((Class282_Sub1) this).aByteArray7414);
			} catch (RuntimeException runtimeexception) {
				((Class282_Sub1) this).aClass285_7415.method2836(1990457273);
				((Class282_Sub1) this).aClass278_7423 = null;
				if (((Class282_Sub1) this).aClass285_7415.method2833((byte) 2))
					((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = null;
				else
					((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = (((Class282_Sub1) this).aClass285_7415.method2832(255, 1726254945 * ((Class282_Sub1) this).anInt7422, (byte) 0, true, (byte) -70));
				return null;
			}
			if (null != ((Class282_Sub1) this).aClass339_7418)
				((Class282_Sub1) this).aClass267_7416.method2652(((Class282_Sub1) this).anInt7422 * 1726254945, is, ((Class282_Sub1) this).aClass339_7418, -1475069715);
		} while (false);
		((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = null;
		if (((Class282_Sub1) this).aClass339_7417 != null) {
			((Class282_Sub1) this).aByteArray7431 = new byte[(((Class278) ((Class282_Sub1) this).aClass278_7423).archiveSize) * 1334516995];
			((Class282_Sub1) this).anInt7427 = 0;
		}
		return ((Class282_Sub1) this).aClass278_7423;
	}

	int method2809(int i) {
		Class330_Sub36_Sub16 class330_sub36_sub16 = ((Class330_Sub36_Sub16) ((Class282_Sub1) this).aClass497_7439.method6094((long) i));
		if (class330_sub36_sub16 != null)
			return class330_sub36_sub16.method3506((byte) 42);
		return 0;
	}

	Class330_Sub36_Sub16 method2823(int i, int i_32_) {
		Class330_Sub36_Sub16 class330_sub36_sub16 = ((Class330_Sub36_Sub16) ((Class282_Sub1) this).aClass497_7439.method6094((long) i));
		if (null != class330_sub36_sub16 && i_32_ == 0 && !((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9723 && ((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9721) {
			class330_sub36_sub16.method3252(1270212212);
			class330_sub36_sub16 = null;
		}
		if (null == class330_sub36_sub16) {
			if (0 == i_32_) {
				if (null != ((Class282_Sub1) this).aClass339_7417 && -1 != ((Class282_Sub1) this).aByteArray7431[i])
					class330_sub36_sub16 = (((Class282_Sub1) this).aClass267_7416.method2649(i, ((Class282_Sub1) this).aClass339_7417, (byte) 96));
				else if (!((Class282_Sub1) this).aClass285_7415.method2833((byte) 2))
					class330_sub36_sub16 = (((Class282_Sub1) this).aClass285_7415.method2832(1726254945 * ((Class282_Sub1) this).anInt7422, i, (byte) 2, true, (byte) -127));
				else
					return null;
			} else if (i_32_ == 1) {
				if (null == ((Class282_Sub1) this).aClass339_7417)
					throw new RuntimeException();
				class330_sub36_sub16 = (((Class282_Sub1) this).aClass267_7416.method2651(i, ((Class282_Sub1) this).aClass339_7417, -1315817421));
			} else if (2 == i_32_) {
				if (null == ((Class282_Sub1) this).aClass339_7417)
					throw new RuntimeException();
				if (((Class282_Sub1) this).aByteArray7431[i] != -1)
					throw new RuntimeException();
				if (!((Class282_Sub1) this).aClass285_7415.method2844((byte) 82))
					class330_sub36_sub16 = (((Class282_Sub1) this).aClass285_7415.method2832(1726254945 * ((Class282_Sub1) this).anInt7422, i, (byte) 2, false, (byte) -50));
				else
					return null;
			} else
				throw new RuntimeException();
			((Class282_Sub1) this).aClass497_7439.method6097(class330_sub36_sub16, (long) i);
		}
		if (((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9721)
			return null;
		byte[] is = class330_sub36_sub16.method3511(356740128);
		if (class330_sub36_sub16 instanceof Class330_Sub36_Sub16_Sub1) {
			Class330_Sub36_Sub16 class330_sub36_sub16_33_;
			try {
				if (is == null || is.length <= 2)
					throw new RuntimeException();
				aCRC32_7440.reset();
				aCRC32_7440.update(is, 0, is.length - 2);
				int i_34_ = (int) aCRC32_7440.getValue();
				if (i_34_ != (((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2878[i]))
					throw new RuntimeException();
				if (null != (((Class278) ((Class282_Sub1) this).aClass278_7423).aByteArrayArray2879) && (null != (((Class278) ((Class282_Sub1) this).aClass278_7423).aByteArrayArray2879[i]))) {
					byte[] is_35_ = (((Class278) ((Class282_Sub1) this).aClass278_7423).aByteArrayArray2879[i]);
					byte[] is_36_ = Class562.method6473(is, 0, is.length - 2, (byte) -34);
					for (int i_37_ = 0; i_37_ < 64; i_37_++) {
						if (is_36_[i_37_] != is_35_[i_37_])
							throw new RuntimeException();
					}
				}
				int i_38_ = (((is[is.length - 2] & 0xff) << 8) + (is[is.length - 1] & 0xff));
				if (i_38_ != ((((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2880[i]) & 0xffff))
					throw new RuntimeException();
				if (((Class282_Sub1) this).aByteArray7431[i] != 1) {
					if (((Class282_Sub1) this).aByteArray7431[i] != 0) {
						/* empty */
					}
					((Class282_Sub1) this).anInt7427 += 2123592929;
					((Class282_Sub1) this).aByteArray7431[i] = (byte) 1;
				}
				if (!((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9723)
					class330_sub36_sub16.method3252(-959928223);
				class330_sub36_sub16_33_ = class330_sub36_sub16;
			} catch (Exception exception) {
				((Class282_Sub1) this).aByteArray7431[i] = (byte) -1;
				class330_sub36_sub16.method3252(-855057364);
				if (((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9723 && !((Class282_Sub1) this).aClass285_7415.method2833((byte) 2)) {
					Class330_Sub36_Sub16_Sub2 class330_sub36_sub16_sub2 = (((Class282_Sub1) this).aClass285_7415.method2832(1726254945 * ((Class282_Sub1) this).anInt7422, i, (byte) 2, true, (byte) -114));
					((Class282_Sub1) this).aClass497_7439.method6097(class330_sub36_sub16_sub2, (long) i);
				}
				return null;
			}
			return class330_sub36_sub16_33_;
		}
		try {
			if (is == null || is.length <= 2)
				throw new RuntimeException();
			aCRC32_7440.reset();
			aCRC32_7440.update(is, 0, is.length - 2);
			int i_39_ = (int) aCRC32_7440.getValue();
			if (i_39_ != (((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2878[i]))
				throw new RuntimeException();
			if ((((Class278) ((Class282_Sub1) this).aClass278_7423).aByteArrayArray2879) != null && null != (((Class278) ((Class282_Sub1) this).aClass278_7423).aByteArrayArray2879[i])) {
				byte[] is_40_ = (((Class278) ((Class282_Sub1) this).aClass278_7423).aByteArrayArray2879[i]);
				byte[] is_41_ = Class562.method6473(is, 0, is.length - 2, (byte) -96);
				for (int i_42_ = 0; i_42_ < 64; i_42_++) {
					if (is_41_[i_42_] != is_40_[i_42_])
						throw new RuntimeException();
				}
			}
			((Class282_Sub1) this).aClass285_7415.anInt2941 = 0;
			((Class282_Sub1) this).aClass285_7415.anInt2932 = 0;
		} catch (RuntimeException runtimeexception) {
			((Class282_Sub1) this).aClass285_7415.method2836(1956559192);
			class330_sub36_sub16.method3252(-2026285854);
			if (((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9723 && !((Class282_Sub1) this).aClass285_7415.method2833((byte) 2)) {
				Class330_Sub36_Sub16_Sub2 class330_sub36_sub16_sub2 = (((Class282_Sub1) this).aClass285_7415.method2832(1726254945 * ((Class282_Sub1) this).anInt7422, i, (byte) 2, true, (byte) -121));
				((Class282_Sub1) this).aClass497_7439.method6097(class330_sub36_sub16_sub2, (long) i);
			}
			return null;
		}
		is[is.length - 2] = (byte) ((((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2880[i]) >>> 8);
		is[is.length - 1] = (byte) (((Class278) ((Class282_Sub1) this).aClass278_7423).anIntArray2880[i]);
		if (null != ((Class282_Sub1) this).aClass339_7417) {
			((Class282_Sub1) this).aClass267_7416.method2652(i, is, ((Class282_Sub1) this).aClass339_7417, 170355722);
			if (((Class282_Sub1) this).aByteArray7431[i] != 1) {
				((Class282_Sub1) this).anInt7427 += 2123592929;
				((Class282_Sub1) this).aByteArray7431[i] = (byte) 1;
			}
		}
		if (!((Class330_Sub36_Sub16) class330_sub36_sub16).aBoolean9723)
			class330_sub36_sub16.method3252(-854194468);
		return class330_sub36_sub16;
	}

	void method2795(int i) {
		if (((Class282_Sub1) this).aClass339_7417 != null) {
			for (Class330 class330 = ((Class282_Sub1) this).aClass471_7434.method5869(539664854); null != class330; class330 = ((Class282_Sub1) this).aClass471_7434.method5873((byte) -10)) {
				if (-6154793640677333111L * class330.aLong3341 == (long) i)
					return;
			}
			Class330 class330 = new Class330();
			class330.aLong3341 = -1420004262915178823L * (long) i;
			((Class282_Sub1) this).aClass471_7434.method5878(class330, (short) 8192);
		}
	}

	void method2824(int i, byte[] is, int i_43_, int i_44_) {
		try {
			if (((Class282_Sub1) this).anInt7428 * -1598705661 == i && ((Class282_Sub1) this).anInt7429 * -505581729 == i_43_) {
				boolean bool = true;
				for (int i_45_ = 0; i_45_ < ((Class282_Sub1) this).aByteArray7414.length; i_45_++) {
					if (((Class282_Sub1) this).aByteArray7414[i_45_] != is[i_45_]) {
						bool = false;
						break;
					}
				}
				if (bool)
					return;
			}
			((Class282_Sub1) this).anInt7428 = -1516864853 * i;
			((Class282_Sub1) this).aByteArray7414 = is;
			((Class282_Sub1) this).anInt7429 = i_43_ * -1512264545;
			((Class282_Sub1) this).aClass278_7423 = null;
			((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = null;
			if (!((Class282_Sub1) this).aClass285_7415.method2833((byte) 2))
				((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = (((Class282_Sub1) this).aClass285_7415.method2832(255, 1726254945 * ((Class282_Sub1) this).anInt7422, (byte) 0, true, (byte) -107));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abu.d(").append(')').toString());
		}
	}

	Class278 method2800() {
		if (null != ((Class282_Sub1) this).aClass278_7423)
			return ((Class282_Sub1) this).aClass278_7423;
		if (null == ((Class282_Sub1) this).aClass330_Sub36_Sub16_7419) {
			if (((Class282_Sub1) this).aClass285_7415.method2833((byte) 2))
				return null;
			((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = (((Class282_Sub1) this).aClass285_7415.method2832(255, ((Class282_Sub1) this).anInt7422 * 1726254945, (byte) 0, true, (byte) -1));
		}
		if (((Class330_Sub36_Sub16) ((Class282_Sub1) this).aClass330_Sub36_Sub16_7419).aBoolean9721)
			return null;
		byte[] is = ((Class282_Sub1) this).aClass330_Sub36_Sub16_7419.method3511(356740128);
		do {
			if (((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 instanceof Class330_Sub36_Sub16_Sub1) {
				try {
					if (is == null)
						throw new RuntimeException();
					((Class282_Sub1) this).aClass278_7423 = new Class278(is, (-1598705661 * ((Class282_Sub1) this).anInt7428), ((Class282_Sub1) this).aByteArray7414);
					if (187081643 * ((Class278) (((Class282_Sub1) this).aClass278_7423)).anInt2874 != -505581729 * ((Class282_Sub1) this).anInt7429)
						throw new RuntimeException();
					break;
				} catch (RuntimeException runtimeexception) {
					((Class282_Sub1) this).aClass278_7423 = null;
					if (((Class282_Sub1) this).aClass285_7415.method2833((byte) 2))
						((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = null;
					else
						((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = (((Class282_Sub1) this).aClass285_7415.method2832(255, ((Class282_Sub1) this).anInt7422 * 1726254945, (byte) 0, true, (byte) -113));
					return null;
				}
			}
			try {
				if (null == is)
					throw new RuntimeException();
				((Class282_Sub1) this).aClass278_7423 = new Class278(is, (-1598705661 * ((Class282_Sub1) this).anInt7428), ((Class282_Sub1) this).aByteArray7414);
			} catch (RuntimeException runtimeexception) {
				((Class282_Sub1) this).aClass285_7415.method2836(2005909325);
				((Class282_Sub1) this).aClass278_7423 = null;
				if (((Class282_Sub1) this).aClass285_7415.method2833((byte) 2))
					((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = null;
				else
					((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = (((Class282_Sub1) this).aClass285_7415.method2832(255, 1726254945 * ((Class282_Sub1) this).anInt7422, (byte) 0, true, (byte) -98));
				return null;
			}
			if (null != ((Class282_Sub1) this).aClass339_7418)
				((Class282_Sub1) this).aClass267_7416.method2652(((Class282_Sub1) this).anInt7422 * 1726254945, is, ((Class282_Sub1) this).aClass339_7418, -1865937593);
		} while (false);
		((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = null;
		if (((Class282_Sub1) this).aClass339_7417 != null) {
			((Class282_Sub1) this).aByteArray7431 = new byte[(((Class278) ((Class282_Sub1) this).aClass278_7423).archiveSize) * 1334516995];
			((Class282_Sub1) this).anInt7427 = 0;
		}
		return ((Class282_Sub1) this).aClass278_7423;
	}

	Class278 method2804(byte i) {
		try {
			if (null != ((Class282_Sub1) this).aClass278_7423)
				return ((Class282_Sub1) this).aClass278_7423;
			if (null == ((Class282_Sub1) this).aClass330_Sub36_Sub16_7419) {
				if (((Class282_Sub1) this).aClass285_7415.method2833((byte) 2))
					return null;
				((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = (((Class282_Sub1) this).aClass285_7415.method2832(255, ((Class282_Sub1) this).anInt7422 * 1726254945, (byte) 0, true, (byte) -109));
			}
			if (((Class330_Sub36_Sub16) ((Class282_Sub1) this).aClass330_Sub36_Sub16_7419).aBoolean9721)
				return null;
			byte[] is = ((Class282_Sub1) this).aClass330_Sub36_Sub16_7419.method3511(356740128);
			do {
				if (((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 instanceof Class330_Sub36_Sub16_Sub1) {
					try {
						if (is == null)
							throw new RuntimeException();
						((Class282_Sub1) this).aClass278_7423 = new Class278(is, -1598705661 * ((Class282_Sub1) this).anInt7428, (((Class282_Sub1) this).aByteArray7414));
						if (187081643 * (((Class278) (((Class282_Sub1) this).aClass278_7423)).anInt2874) != -505581729 * ((Class282_Sub1) this).anInt7429)
							throw new RuntimeException();
						break;
					} catch (RuntimeException runtimeexception) {
						((Class282_Sub1) this).aClass278_7423 = null;
						if (((Class282_Sub1) this).aClass285_7415.method2833((byte) 2))
							((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = null;
						else
							((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = (((Class282_Sub1) this).aClass285_7415.method2832(255, (((Class282_Sub1) this).anInt7422 * 1726254945), (byte) 0, true, (byte) -54));
						return null;
					}
				}
				try {
					if (null == is)
						throw new RuntimeException();
					((Class282_Sub1) this).aClass278_7423 = new Class278(is, (-1598705661 * ((Class282_Sub1) this).anInt7428), ((Class282_Sub1) this).aByteArray7414);
				} catch (RuntimeException runtimeexception) {
					((Class282_Sub1) this).aClass285_7415.method2836(2024384844);
					((Class282_Sub1) this).aClass278_7423 = null;
					if (((Class282_Sub1) this).aClass285_7415.method2833((byte) 2))
						((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = null;
					else
						((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = (((Class282_Sub1) this).aClass285_7415.method2832(255, 1726254945 * ((Class282_Sub1) this).anInt7422, (byte) 0, true, (byte) -63));
					return null;
				}
				if (null != ((Class282_Sub1) this).aClass339_7418)
					((Class282_Sub1) this).aClass267_7416.method2652(((Class282_Sub1) this).anInt7422 * 1726254945, is, ((Class282_Sub1) this).aClass339_7418, -2033978310);
			} while (false);
			((Class282_Sub1) this).aClass330_Sub36_Sub16_7419 = null;
			if (((Class282_Sub1) this).aClass339_7417 != null) {
				((Class282_Sub1) this).aByteArray7431 = (new byte[(((Class278) ((Class282_Sub1) this).aClass278_7423).archiveSize) * 1334516995]);
				((Class282_Sub1) this).anInt7427 = 0;
			}
			return ((Class282_Sub1) this).aClass278_7423;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abu.r(").append(')').toString());
		}
	}

	int method2808(int i) {
		Class330_Sub36_Sub16 class330_sub36_sub16 = ((Class330_Sub36_Sub16) ((Class282_Sub1) this).aClass497_7439.method6094((long) i));
		if (class330_sub36_sub16 != null)
			return class330_sub36_sub16.method3506((byte) -28);
		return 0;
	}
}
