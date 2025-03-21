/* Class315_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class315_Sub1 extends Class315 {
	long aLong7451 = 0L;
	long[] aLongArray7452;
	long aLong7453;
	int anInt7454;
	int anInt7455;
	long aLong7456 = 0L;

	void method3124(byte i) {
		try {
			((Class315_Sub1) this).aLong7453 = 0L;
			if (7483737380390534193L * ((Class315_Sub1) this).aLong7456 > ((Class315_Sub1) this).aLong7451 * -230295620616796697L)
				((Class315_Sub1) this).aLong7451 += (8124533024894302759L * ((Class315_Sub1) this).aLong7456 - 1L * ((Class315_Sub1) this).aLong7451);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abm.i(").append(')').toString());
		}
	}

	void method3129() {
		((Class315_Sub1) this).aLong7453 = 0L;
		if (7483737380390534193L * ((Class315_Sub1) this).aLong7456 > ((Class315_Sub1) this).aLong7451 * -230295620616796697L)
			((Class315_Sub1) this).aLong7451 += (8124533024894302759L * ((Class315_Sub1) this).aLong7456 - 1L * ((Class315_Sub1) this).aLong7451);
	}

	long method3125(byte i) {
		try {
			((Class315_Sub1) this).aLong7451 += method3141((byte) 61) * 5071007148181978583L;
			if (((Class315_Sub1) this).aLong7456 * 7483737380390534193L > ((Class315_Sub1) this).aLong7451 * -230295620616796697L)
				return (7483737380390534193L * ((Class315_Sub1) this).aLong7456 - (((Class315_Sub1) this).aLong7451 * -230295620616796697L)) / 1000000L;
			return 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abm.p(").append(')').toString());
		}
	}

	int method3126(long l) {
		try {
			if (7483737380390534193L * ((Class315_Sub1) this).aLong7456 > ((Class315_Sub1) this).aLong7451 * -230295620616796697L) {
				((Class315_Sub1) this).aLong7453 += (1692267118597678845L * ((Class315_Sub1) this).aLong7456 - (((Class315_Sub1) this).aLong7451 * 3212842177632124987L));
				((Class315_Sub1) this).aLong7451 += (((Class315_Sub1) this).aLong7456 * 8124533024894302759L - ((Class315_Sub1) this).aLong7451 * 1L);
				((Class315_Sub1) this).aLong7456 += -8292750810611426095L * l;
				return 1;
			}
			int i = 0;
			do {
				i++;
				((Class315_Sub1) this).aLong7456 += l * -8292750810611426095L;
			} while (i < 10 && ((((Class315_Sub1) this).aLong7456 * 7483737380390534193L) < (((Class315_Sub1) this).aLong7451 * -230295620616796697L)));
			if (7483737380390534193L * ((Class315_Sub1) this).aLong7456 < ((Class315_Sub1) this).aLong7451 * -230295620616796697L)
				((Class315_Sub1) this).aLong7456 = 7839755107425228183L * ((Class315_Sub1) this).aLong7451;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abm.o(").append(')').toString());
		}
	}

	long method3134(int i) {
		try {
			return -230295620616796697L * ((Class315_Sub1) this).aLong7451;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abm.s(").append(')').toString());
		}
	}

	long method3141(byte i) {
		try {
			long l = System.nanoTime();
			long l_0_ = l - 6753135946378412613L * ((Class315_Sub1) this).aLong7453;
			((Class315_Sub1) this).aLong7453 = l * 5611218515399622797L;
			if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
				((Class315_Sub1) this).aLongArray7452[((Class315_Sub1) this).anInt7455 * 783146471] = l_0_;
				((Class315_Sub1) this).anInt7455 = ((783146471 * ((Class315_Sub1) this).anInt7455 + 1) % 10 * -1974606377);
				if (-1554658081 * ((Class315_Sub1) this).anInt7454 < 1)
					((Class315_Sub1) this).anInt7454 += -727126241;
			}
			long l_1_ = 0L;
			for (int i_2_ = 1; i_2_ <= -1554658081 * ((Class315_Sub1) this).anInt7454; i_2_++)
				l_1_ += (((Class315_Sub1) this).aLongArray7452[(10 + (783146471 * ((Class315_Sub1) this).anInt7455 - i_2_)) % 10]);
			return (l_1_ / (long) (-1554658081 * ((Class315_Sub1) this).anInt7454));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abm.m(").append(')').toString());
		}
	}

	void method3127() {
		((Class315_Sub1) this).aLong7453 = 0L;
		if (7483737380390534193L * ((Class315_Sub1) this).aLong7456 > ((Class315_Sub1) this).aLong7451 * -230295620616796697L)
			((Class315_Sub1) this).aLong7451 += (8124533024894302759L * ((Class315_Sub1) this).aLong7456 - 1L * ((Class315_Sub1) this).aLong7451);
	}

	int method3132(long l) {
		if (7483737380390534193L * ((Class315_Sub1) this).aLong7456 > ((Class315_Sub1) this).aLong7451 * -230295620616796697L) {
			((Class315_Sub1) this).aLong7453 += (1692267118597678845L * ((Class315_Sub1) this).aLong7456 - ((Class315_Sub1) this).aLong7451 * 3212842177632124987L);
			((Class315_Sub1) this).aLong7451 += (((Class315_Sub1) this).aLong7456 * 8124533024894302759L - ((Class315_Sub1) this).aLong7451 * 1L);
			((Class315_Sub1) this).aLong7456 += -8292750810611426095L * l;
			return 1;
		}
		int i = 0;
		do {
			i++;
			((Class315_Sub1) this).aLong7456 += l * -8292750810611426095L;
		} while (i < 10 && (((Class315_Sub1) this).aLong7456 * 7483737380390534193L < (((Class315_Sub1) this).aLong7451 * -230295620616796697L)));
		if (7483737380390534193L * ((Class315_Sub1) this).aLong7456 < ((Class315_Sub1) this).aLong7451 * -230295620616796697L)
			((Class315_Sub1) this).aLong7456 = 7839755107425228183L * ((Class315_Sub1) this).aLong7451;
		return i;
	}

	void method3128() {
		((Class315_Sub1) this).aLong7453 = 0L;
		if (7483737380390534193L * ((Class315_Sub1) this).aLong7456 > ((Class315_Sub1) this).aLong7451 * -230295620616796697L)
			((Class315_Sub1) this).aLong7451 += (8124533024894302759L * ((Class315_Sub1) this).aLong7456 - 1L * ((Class315_Sub1) this).aLong7451);
	}

	Class315_Sub1() {
		((Class315_Sub1) this).aLong7453 = 0L;
		((Class315_Sub1) this).aLongArray7452 = new long[10];
		((Class315_Sub1) this).anInt7455 = 0;
		((Class315_Sub1) this).anInt7454 = -727126241;
		((Class315_Sub1) this).aLong7451 = System.nanoTime() * 5071007148181978583L;
		((Class315_Sub1) this).aLong7456 = System.nanoTime() * -8292750810611426095L;
	}

	long method3130() {
		((Class315_Sub1) this).aLong7451 += method3141((byte) 54) * 5071007148181978583L;
		if (((Class315_Sub1) this).aLong7456 * 7483737380390534193L > ((Class315_Sub1) this).aLong7451 * -230295620616796697L)
			return ((7483737380390534193L * ((Class315_Sub1) this).aLong7456 - ((Class315_Sub1) this).aLong7451 * -230295620616796697L) / 1000000L);
		return 0L;
	}

	long method3131() {
		((Class315_Sub1) this).aLong7451 += method3141((byte) 67) * 5071007148181978583L;
		if (((Class315_Sub1) this).aLong7456 * 7483737380390534193L > ((Class315_Sub1) this).aLong7451 * -230295620616796697L)
			return ((7483737380390534193L * ((Class315_Sub1) this).aLong7456 - ((Class315_Sub1) this).aLong7451 * -230295620616796697L) / 1000000L);
		return 0L;
	}

	void method3122() {
		((Class315_Sub1) this).aLong7453 = 0L;
		if (7483737380390534193L * ((Class315_Sub1) this).aLong7456 > ((Class315_Sub1) this).aLong7451 * -230295620616796697L)
			((Class315_Sub1) this).aLong7451 += (8124533024894302759L * ((Class315_Sub1) this).aLong7456 - 1L * ((Class315_Sub1) this).aLong7451);
	}

	long method3133() {
		return -230295620616796697L * ((Class315_Sub1) this).aLong7451;
	}

	long method3123() {
		return -230295620616796697L * ((Class315_Sub1) this).aLong7451;
	}

	public static void method3142(Class106 class106, int i, int i_3_) {
		try {
			i = i * Class448.aClass330_Sub50_5555.aClass464_Sub30_7898.method5841(-1817737087) >> 8;
			if (null == class106)
				Class365.method4271(-1851069635);
			else {
				Class83.method965(class106, i, 1936728164);
				Class444.method5618(-1328599937);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abm.a(").append(')').toString());
		}
	}

	public static void method3143(byte i) {
		try {
			if (6 == -296919301 * client.anInt8995 && (!Class434.method5564(-1788858406) && !Class509.method6165(47374417)))
				Class227.method2311(8, -1188873169);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abm.r(").append(')').toString());
		}
	}
}
