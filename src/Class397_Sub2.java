/* Class397_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;
import java.util.Queue;

public class Class397_Sub2 extends Class397 {
	Queue aQueue8244 = new LinkedList();

	void method4674() {
		Class330_Sub44_Sub1 class330_sub44_sub1 = (Class330_Sub44_Sub1) ((Class397_Sub2) this).aQueue8244.poll();
		if (class330_sub44_sub1 != null) {
			Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2529, client.aClass1_9025.aClass488_22, 1529257414);
			class330_sub34.aClass330_Sub46_Sub2_7729.addShortA(method4659(class330_sub44_sub1, 65535, 369986761), -1219491771);
			class330_sub34.aClass330_Sub46_Sub2_7729.method3777((class330_sub44_sub1.method3728((byte) 2) << 1 | class330_sub44_sub1.method3729(15132902) & 0x1), 5244230);
			class330_sub34.aClass330_Sub46_Sub2_7729.addLEInt((class330_sub44_sub1.method3710((byte) 69) | class330_sub44_sub1.method3711(1521581068) << 16), -2107203830);
			client.aClass1_9025.method378(class330_sub34, -990626825);
			class330_sub44_sub1.method3714(-1797026990);
		}
	}

	void method4682(Buffer class330_sub46, Class330_Sub44_Sub1 class330_sub44_sub1, int i) {
		try {
			class330_sub46.addByte(class330_sub44_sub1.method3729(1386621498), (byte) 54);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aeu.at(").append(')').toString());
		}
	}

	void method4662(int i) {
		try {
			Class330_Sub44_Sub1 class330_sub44_sub1 = ((Class330_Sub44_Sub1) ((Class397_Sub2) this).aQueue8244.poll());
			if (class330_sub44_sub1 != null) {
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2529, client.aClass1_9025.aClass488_22, -243561677);
				class330_sub34.aClass330_Sub46_Sub2_7729.addShortA(method4659(class330_sub44_sub1, 65535, -1353277479), -1923041846);
				class330_sub34.aClass330_Sub46_Sub2_7729.method3777((class330_sub44_sub1.method3728((byte) 2) << 1 | class330_sub44_sub1.method3729(1660742792) & 0x1), 23115214);
				class330_sub34.aClass330_Sub46_Sub2_7729.addLEInt((class330_sub44_sub1.method3710((byte) -31) | class330_sub44_sub1.method3711(1890236544) << 16), -2028369411);
				client.aClass1_9025.method378(class330_sub34, -449243582);
				class330_sub44_sub1.method3714(-1382640461);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aeu.f(").append(')').toString());
		}
	}

	boolean method4663(int i) {
		try {
			return (!((Class397_Sub2) this).aQueue8244.isEmpty() || (8681372172046252423L * ((Class397_Sub2) this).aLong4109 < Class312.method3111((byte) 124) - 2000L));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aeu.z(").append(')').toString());
		}
	}

	Class330_Sub34 method4664(int i) {
		try {
			return Class238.method2377(OutgoingPacket.aClass234_2566, client.aClass1_9025.aClass488_22, 1973880242);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aeu.w(").append(')').toString());
		}
	}

	void method4665() {
		Class330_Sub44_Sub1 class330_sub44_sub1 = (Class330_Sub44_Sub1) ((Class397_Sub2) this).aQueue8244.poll();
		if (class330_sub44_sub1 != null) {
			Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2529, client.aClass1_9025.aClass488_22, 690243530);
			class330_sub34.aClass330_Sub46_Sub2_7729.addShortA(method4659(class330_sub44_sub1, 65535, 1883690274), -1214867576);
			class330_sub34.aClass330_Sub46_Sub2_7729.method3777((class330_sub44_sub1.method3728((byte) 2) << 1 | class330_sub44_sub1.method3729(1437159430) & 0x1), 1458485344);
			class330_sub34.aClass330_Sub46_Sub2_7729.addLEInt((class330_sub44_sub1.method3710((byte) 2) | class330_sub44_sub1.method3711(328592958) << 16), -2119342207);
			client.aClass1_9025.method378(class330_sub34, -1452659867);
			class330_sub44_sub1.method3714(-777391456);
		}
	}

	int method4671() {
		return 1;
	}

	void method4661(Buffer class330_sub46, Class330_Sub44 class330_sub44, byte i) {
		try {
			method4682(class330_sub46, (Class330_Sub44_Sub1) class330_sub44, 1510357776);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aeu.s(").append(')').toString());
		}
	}

	void method4672(Buffer class330_sub46, Class330_Sub44 class330_sub44) {
		method4682(class330_sub46, (Class330_Sub44_Sub1) class330_sub44, 937458279);
	}

	void method4658(Buffer class330_sub46, Class330_Sub44 class330_sub44) {
		method4682(class330_sub46, (Class330_Sub44_Sub1) class330_sub44, 1457020410);
	}

	void method4683(Class330_Sub44_Sub1 class330_sub44_sub1, int i) {
		try {
			((Class397_Sub2) this).aQueue8244.add(class330_sub44_sub1);
			if (((Class397_Sub2) this).aQueue8244.size() > 10)
				((Class397_Sub2) this).aQueue8244.poll();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aeu.al(").append(')').toString());
		}
	}

	void method4666() {
		Class330_Sub44_Sub1 class330_sub44_sub1 = (Class330_Sub44_Sub1) ((Class397_Sub2) this).aQueue8244.poll();
		if (class330_sub44_sub1 != null) {
			Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2529, client.aClass1_9025.aClass488_22, 1291146733);
			class330_sub34.aClass330_Sub46_Sub2_7729.addShortA(method4659(class330_sub44_sub1, 65535, -484002938), -1097689748);
			class330_sub34.aClass330_Sub46_Sub2_7729.method3777((class330_sub44_sub1.method3728((byte) 2) << 1 | class330_sub44_sub1.method3729(28823761) & 0x1), 1556254189);
			class330_sub34.aClass330_Sub46_Sub2_7729.addLEInt((class330_sub44_sub1.method3710((byte) -31) | class330_sub44_sub1.method3711(1245112278) << 16), -2037425181);
			client.aClass1_9025.method378(class330_sub34, -802492897);
			class330_sub44_sub1.method3714(-1590026328);
		}
	}

	Class397_Sub2() {
		/* empty */
	}

	boolean method4668() {
		return (!((Class397_Sub2) this).aQueue8244.isEmpty() || (8681372172046252423L * ((Class397_Sub2) this).aLong4109 < Class312.method3111((byte) 24) - 2000L));
	}

	Class330_Sub34 method4657() {
		return Class238.method2377(OutgoingPacket.aClass234_2566, client.aClass1_9025.aClass488_22, 19474366);
	}

	Class330_Sub34 method4675() {
		return Class238.method2377(OutgoingPacket.aClass234_2566, client.aClass1_9025.aClass488_22, 757493463);
	}

	int method4660(int i) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aeu.o(").append(')').toString());
		}
	}

	int method4670() {
		return 1;
	}

	boolean method4667() {
		return (!((Class397_Sub2) this).aQueue8244.isEmpty() || (8681372172046252423L * ((Class397_Sub2) this).aLong4109 < Class312.method3111((byte) 59) - 2000L));
	}

	void method4676(Buffer class330_sub46, Class330_Sub44 class330_sub44) {
		method4682(class330_sub46, (Class330_Sub44_Sub1) class330_sub44, 1979086036);
	}
}
