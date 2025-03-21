/* Class315_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.nanotime.QueryPerformanceCounter;

public class Class315_Sub2 extends Class315 {
	long aLong7457;
	long aLong7458;
	int anInt7459;
	long[] aLongArray7460;
	long aLong7461 = 0L;
	int anInt7462;

	Class315_Sub2() {
		((Class315_Sub2) this).aLong7458 = 0L;
		((Class315_Sub2) this).aLong7457 = 0L;
		((Class315_Sub2) this).aLongArray7460 = new long[10];
		((Class315_Sub2) this).anInt7462 = 0;
		((Class315_Sub2) this).anInt7459 = -338037609;
		((Class315_Sub2) this).aLong7458 = ((((Class315_Sub2) this).aLong7461 = QueryPerformanceCounter.nanoTime() * -8434209449040725045L) * -984195251663896233L);
		if (7636820923378602467L * ((Class315_Sub2) this).aLong7461 == 0L)
			throw new RuntimeException();
	}

	long method3125(byte i) {
		try {
			((Class315_Sub2) this).aLong7461 += method3144(1569478359) * -8434209449040725045L;
			if (-5967653429068341163L * ((Class315_Sub2) this).aLong7458 > ((Class315_Sub2) this).aLong7461 * 7636820923378602467L)
				return (((((Class315_Sub2) this).aLong7458 * -5967653429068341163L) - (7636820923378602467L * ((Class315_Sub2) this).aLong7461)) / 1000000L);
			return 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aco.p(").append(')').toString());
		}
	}

	void method3122() {
		((Class315_Sub2) this).aLong7457 = 0L;
		if (((Class315_Sub2) this).aLong7458 * -5967653429068341163L > 7636820923378602467L * ((Class315_Sub2) this).aLong7461)
			((Class315_Sub2) this).aLong7461 += (((Class315_Sub2) this).aLong7458 * -8827772110618625433L - ((Class315_Sub2) this).aLong7461 * 1L);
	}

	long method3134(int i) {
		try {
			return 7636820923378602467L * ((Class315_Sub2) this).aLong7461;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aco.s(").append(')').toString());
		}
	}

	long method3144(int i) {
		try {
			long l = QueryPerformanceCounter.nanoTime();
			long l_0_ = l - ((Class315_Sub2) this).aLong7457 * 3645289767062017621L;
			((Class315_Sub2) this).aLong7457 = l * 1176766671369746173L;
			if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
				((Class315_Sub2) this).aLongArray7460[-1140441211 * ((Class315_Sub2) this).anInt7462] = l_0_;
				((Class315_Sub2) this).anInt7462 = (1703928141 * ((-1140441211 * ((Class315_Sub2) this).anInt7462 + 1) % 10));
				if (((Class315_Sub2) this).anInt7459 * -1930900697 < 1)
					((Class315_Sub2) this).anInt7459 += -338037609;
			}
			long l_1_ = 0L;
			for (int i_2_ = 1; i_2_ <= ((Class315_Sub2) this).anInt7459 * -1930900697; i_2_++)
				l_1_ += (((Class315_Sub2) this).aLongArray7460[(((Class315_Sub2) this).anInt7462 * -1140441211 - i_2_ + 10) % 10]);
			return (l_1_ / (long) (((Class315_Sub2) this).anInt7459 * -1930900697));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aco.m(").append(')').toString());
		}
	}

	void method3127() {
		((Class315_Sub2) this).aLong7457 = 0L;
		if (((Class315_Sub2) this).aLong7458 * -5967653429068341163L > 7636820923378602467L * ((Class315_Sub2) this).aLong7461)
			((Class315_Sub2) this).aLong7461 += (((Class315_Sub2) this).aLong7458 * -8827772110618625433L - ((Class315_Sub2) this).aLong7461 * 1L);
	}

	long method3130() {
		((Class315_Sub2) this).aLong7461 += method3144(2114520300) * -8434209449040725045L;
		if (-5967653429068341163L * ((Class315_Sub2) this).aLong7458 > ((Class315_Sub2) this).aLong7461 * 7636820923378602467L)
			return ((((Class315_Sub2) this).aLong7458 * -5967653429068341163L - 7636820923378602467L * ((Class315_Sub2) this).aLong7461) / 1000000L);
		return 0L;
	}

	void method3124(byte i) {
		try {
			((Class315_Sub2) this).aLong7457 = 0L;
			if (((Class315_Sub2) this).aLong7458 * -5967653429068341163L > 7636820923378602467L * ((Class315_Sub2) this).aLong7461)
				((Class315_Sub2) this).aLong7461 += ((((Class315_Sub2) this).aLong7458 * -8827772110618625433L) - ((Class315_Sub2) this).aLong7461 * 1L);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aco.i(").append(')').toString());
		}
	}

	void method3129() {
		((Class315_Sub2) this).aLong7457 = 0L;
		if (((Class315_Sub2) this).aLong7458 * -5967653429068341163L > 7636820923378602467L * ((Class315_Sub2) this).aLong7461)
			((Class315_Sub2) this).aLong7461 += (((Class315_Sub2) this).aLong7458 * -8827772110618625433L - ((Class315_Sub2) this).aLong7461 * 1L);
	}

	long method3123() {
		return 7636820923378602467L * ((Class315_Sub2) this).aLong7461;
	}

	long method3131() {
		((Class315_Sub2) this).aLong7461 += method3144(1970501286) * -8434209449040725045L;
		if (-5967653429068341163L * ((Class315_Sub2) this).aLong7458 > ((Class315_Sub2) this).aLong7461 * 7636820923378602467L)
			return ((((Class315_Sub2) this).aLong7458 * -5967653429068341163L - 7636820923378602467L * ((Class315_Sub2) this).aLong7461) / 1000000L);
		return 0L;
	}

	int method3132(long l) {
		if (((Class315_Sub2) this).aLong7458 * -5967653429068341163L > 7636820923378602467L * ((Class315_Sub2) this).aLong7461) {
			((Class315_Sub2) this).aLong7457 += (2643921447763386881L * ((Class315_Sub2) this).aLong7458 - (((Class315_Sub2) this).aLong7461 * -5460553301235921065L));
			((Class315_Sub2) this).aLong7461 += (-8827772110618625433L * ((Class315_Sub2) this).aLong7458 - ((Class315_Sub2) this).aLong7461 * 1L);
			((Class315_Sub2) this).aLong7458 += l * -628220625364411139L;
			return 1;
		}
		int i = 0;
		do {
			i++;
			((Class315_Sub2) this).aLong7458 += l * -628220625364411139L;
		} while (i < 10 && (-5967653429068341163L * ((Class315_Sub2) this).aLong7458 < (((Class315_Sub2) this).aLong7461 * 7636820923378602467L)));
		if (-5967653429068341163L * ((Class315_Sub2) this).aLong7458 < 7636820923378602467L * ((Class315_Sub2) this).aLong7461)
			((Class315_Sub2) this).aLong7458 = -984195251663896233L * ((Class315_Sub2) this).aLong7461;
		return i;
	}

	long method3133() {
		return 7636820923378602467L * ((Class315_Sub2) this).aLong7461;
	}

	int method3126(long l) {
		try {
			if (((Class315_Sub2) this).aLong7458 * -5967653429068341163L > 7636820923378602467L * ((Class315_Sub2) this).aLong7461) {
				((Class315_Sub2) this).aLong7457 += (2643921447763386881L * ((Class315_Sub2) this).aLong7458 - (((Class315_Sub2) this).aLong7461 * -5460553301235921065L));
				((Class315_Sub2) this).aLong7461 += ((-8827772110618625433L * ((Class315_Sub2) this).aLong7458) - ((Class315_Sub2) this).aLong7461 * 1L);
				((Class315_Sub2) this).aLong7458 += l * -628220625364411139L;
				return 1;
			}
			int i = 0;
			do {
				i++;
				((Class315_Sub2) this).aLong7458 += l * -628220625364411139L;
			} while (i < 10 && ((-5967653429068341163L * ((Class315_Sub2) this).aLong7458) < (((Class315_Sub2) this).aLong7461 * 7636820923378602467L)));
			if (-5967653429068341163L * ((Class315_Sub2) this).aLong7458 < 7636820923378602467L * ((Class315_Sub2) this).aLong7461)
				((Class315_Sub2) this).aLong7458 = -984195251663896233L * ((Class315_Sub2) this).aLong7461;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aco.o(").append(')').toString());
		}
	}

	void method3128() {
		((Class315_Sub2) this).aLong7457 = 0L;
		if (((Class315_Sub2) this).aLong7458 * -5967653429068341163L > 7636820923378602467L * ((Class315_Sub2) this).aLong7461)
			((Class315_Sub2) this).aLong7461 += (((Class315_Sub2) this).aLong7458 * -8827772110618625433L - ((Class315_Sub2) this).aLong7461 * 1L);
	}
}
