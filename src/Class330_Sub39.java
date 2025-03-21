/* Class330_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.BitSet;

public class Class330_Sub39 extends Class330 {
	public String aString7757;
	boolean aBoolean7758 = true;
	public Class153[] aClass153Array7759;
	public int anInt7760 = 0;
	int[] anIntArray7761;
	long aLong7762;
	boolean aBoolean7763;
	public byte aByte7764;
	public byte aByte7765;
	public static int anInt7766;
	static int anInt7767;

	public Class330_Sub39(Buffer class330_sub46) {
		aString7757 = null;
		method3545(class330_sub46, 415958865);
	}

	void method3542(int i, byte i_0_) {
		try {
			if (aClass153Array7759 != null)
				Class453.method5641(aClass153Array7759, 0, aClass153Array7759 = new Class153[i], 0, anInt7760 * -576053059);
			else
				aClass153Array7759 = new Class153[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adt.r(").append(')').toString());
		}
	}

	void method3543(Class153 class153, byte i) {
		try {
			if (null == aClass153Array7759 || -576053059 * anInt7760 >= aClass153Array7759.length)
				method3542(anInt7760 * -576053059 + 5, (byte) -24);
			aClass153Array7759[(anInt7760 += 2132990613) * -576053059 - 1] = class153;
			((Class330_Sub39) this).anIntArray7761 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adt.i(").append(')').toString());
		}
	}

	public int method3544(String string, byte i) {
		try {
			for (int i_1_ = 0; i_1_ < -576053059 * anInt7760; i_1_++) {
				if (aClass153Array7759[i_1_].aString1633.equalsIgnoreCase(string))
					return i_1_;
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adt.o(").append(')').toString());
		}
	}

	void method3545(Buffer class330_sub46, int i) {
		try {
			int i_2_ = class330_sub46.readUnsignedByte(-10979315);
			if ((i_2_ & 0x1) != 0)
				((Class330_Sub39) this).aBoolean7763 = true;
			if (0 != (i_2_ & 0x2))
				((Class330_Sub39) this).aBoolean7758 = true;
			aLong3341 = class330_sub46.readLong(71676423) * -1420004262915178823L;
			((Class330_Sub39) this).aLong7762 = (class330_sub46.readLong(-1530886990) * 6220279094848042299L);
			aString7757 = class330_sub46.readString(685293473);
			class330_sub46.readUnsignedByte(-272150195);
			aByte7765 = class330_sub46.readByte((byte) 41);
			aByte7764 = class330_sub46.readByte((byte) 17);
			anInt7760 = class330_sub46.readUnsignedShort(166721554) * 2132990613;
			if (-576053059 * anInt7760 > 0) {
				aClass153Array7759 = new Class153[-576053059 * anInt7760];
				for (int i_3_ = 0; i_3_ < anInt7760 * -576053059; i_3_++) {
					Class153 class153 = new Class153();
					if (((Class330_Sub39) this).aBoolean7763)
						class330_sub46.readLong(650409941);
					if (((Class330_Sub39) this).aBoolean7758)
						class153.aString1633 = class330_sub46.readString(-1619970436);
					class153.aByte1632 = class330_sub46.readByte((byte) 20);
					class153.anInt1631 = class330_sub46.readUnsignedShort(2037161824) * 41095155;
					aClass153Array7759[i_3_] = class153;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adt.s(").append(')').toString());
		}
	}

	void method3546(int i, int i_4_) {
		try {
			anInt7760 -= 2132990613;
			if (0 == -576053059 * anInt7760)
				aClass153Array7759 = null;
			else
				Class453.method5641(aClass153Array7759, 1 + i, aClass153Array7759, i, anInt7760 * -576053059 - i);
			((Class330_Sub39) this).anIntArray7761 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adt.p(").append(')').toString());
		}
	}

	static {
		new BitSet(65536);
	}

	public int[] method3547(byte i) {
		try {
			if (((Class330_Sub39) this).anIntArray7761 == null) {
				String[] strings = new String[-576053059 * anInt7760];
				((Class330_Sub39) this).anIntArray7761 = new int[-576053059 * anInt7760];
				for (int i_5_ = 0; i_5_ < anInt7760 * -576053059; i_5_++) {
					strings[i_5_] = aClass153Array7759[i_5_].aString1633;
					((Class330_Sub39) this).anIntArray7761[i_5_] = i_5_;
				}
				Class105.method1308(strings, ((Class330_Sub39) this).anIntArray7761, -345551316);
			}
			return ((Class330_Sub39) this).anIntArray7761;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adt.j(").append(')').toString());
		}
	}

	public static Class330_Sub34 method3548(int i) {
		try {
			Class330_Sub34 class330_sub34 = Class239.method2383((byte) -18);
			((Class330_Sub34) class330_sub34).aClass234_7732 = null;
			((Class330_Sub34) class330_sub34).anInt7728 = 0;
			class330_sub34.aClass330_Sub46_Sub2_7729 = new Class330_Sub46_Sub2(5000);
			return class330_sub34;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adt.i(").append(')').toString());
		}
	}

	static void method3549(int i, boolean bool, int i_6_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(22, (long) i);
			class330_sub36_sub3.method3445((byte) 0);
			((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629 = (bool ? 1 : 0) * 229745735;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adt.ad(").append(')').toString());
		}
	}
}
