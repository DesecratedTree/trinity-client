/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class1 {
	Class330_Sub46_Sub2 aClass330_Sub46_Sub2_17;
	int anInt18;
	Class357 aClass357_19;
	IncomingPacket aClass222_20;
	Buffer aClass330_Sub46_21;
	public IsaacCipher aClass488_22;
	Class471 aClass471_23 = new Class471();
	IsaacCipher aClass488_24;
	IncomingPacket currentIncomingPacket;
	int anInt26;
	boolean aBoolean27;
	int anInt28;
	public int anInt29;
	int anInt30;
	int anInt31;
	static int anInt32 = 15000;
	int anInt33 = 0;
	int anInt34;
	IncomingPacket aClass222_35;
	IncomingPacket aClass222_36;
	public boolean aBoolean37;
	Class409 aClass409_38;
	static int anInt39;

	void method377(int i) {
		try {
			((Class1) this).aClass357_19 = null;
			((Class1) this).aClass409_38.method4770(null, (short) -26864);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ab.f(").append(')').toString());
		}
	}

	Class1() {
		((Class1) this).aClass330_Sub46_21 = new Buffer(1600);
		((Class1) this).aClass330_Sub46_Sub2_17 = new Class330_Sub46_Sub2(15000);
		((Class1) this).currentIncomingPacket = null;
		((Class1) this).anInt26 = 0;
		((Class1) this).aBoolean27 = true;
		((Class1) this).anInt30 = 0;
		anInt29 = 0;
		aBoolean37 = false;
		((Class1) this).aClass409_38 = new Class409();
		Thread thread = new Thread(((Class1) this).aClass409_38);
		thread.setPriority(1);
		thread.start();
	}

	public final void method378(Class330_Sub34 class330_sub34, int i) {
		try {
			((Class1) this).aClass471_23.method5878(class330_sub34, (short) 8192);
			class330_sub34.anInt7730 = (class330_sub34.aClass330_Sub46_Sub2_7729.offset * -2134336539);
			class330_sub34.aClass330_Sub46_Sub2_7729.offset = 0;
			((Class1) this).anInt33 += class330_sub34.anInt7730 * 1112557035;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ab.i(").append(')').toString());
		}
	}

	void method379(int i) {
		try {
			if (((Class1) this).aClass357_19 != null) {
				((Class1) this).aClass357_19.method4197(1463544803);
				((Class1) this).aClass357_19 = null;
			}
			((Class1) this).aClass409_38.method4770(null, (short) -22999);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ab.s(").append(')').toString());
		}
	}

	public Class357 method380(int i) {
		try {
			return ((Class1) this).aClass357_19;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ab.z(").append(')').toString());
		}
	}

	public final void method381(int i) throws IOException {
		try {
			if (null != ((Class1) this).aClass357_19 && 898078807 * ((Class1) this).anInt33 > 0) {
				((Class1) this).aClass330_Sub46_21.offset = 0;
				for (;;) {
					Class330_Sub34 class330_sub34 = ((Class330_Sub34) ((Class1) this).aClass471_23.method5869(539664854));
					if (null == class330_sub34) {
						if (i <= -1053848421) {
							/* empty */
						}
						break;
					}
					if (-1195881763 * class330_sub34.anInt7730 > ((((Class1) this).aClass330_Sub46_21.payload).length - (((Class1) this).aClass330_Sub46_21.offset * -824785231))) {
						if (i <= -1053848421) {
							/* empty */
						}
						break;
					}
					((Class1) this).aClass330_Sub46_21.method3749((class330_sub34.aClass330_Sub46_Sub2_7729.payload), 0, -1195881763 * class330_sub34.anInt7730, (byte) -19);
					((Class1) this).anInt33 -= class330_sub34.anInt7730 * 1112557035;
					class330_sub34.method3252(-516875287);
					class330_sub34.aClass330_Sub46_Sub2_7729.method3739((byte) -6);
					class330_sub34.method3436((byte) -63);
				}
				((Class1) this).aClass357_19.method4210(((Class1) this).aClass330_Sub46_21.payload, 0, -824785231 * ((Class1) this).aClass330_Sub46_21.offset, (byte) -38);
				((Class1) this).anInt34 += (((Class1) this).aClass330_Sub46_21.offset * 1988507329);
				anInt29 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ab.j(").append(')').toString());
		}
	}

	final void method382(int i) {
		try {
			((Class1) this).aClass471_23.method5866(613065745);
			((Class1) this).anInt33 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ab.r(").append(')').toString());
		}
	}

	void method383(int i) {
		try {
			if (822953439 * client.anInt8981 % 50 == 0) {
				((Class1) this).anInt28 = -427136259 * ((Class1) this).anInt34;
				((Class1) this).anInt34 = 0;
				((Class1) this).anInt18 = ((Class1) this).anInt31 * 922287347;
				((Class1) this).anInt31 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ab.p(").append(')').toString());
		}
	}

	void method384(Class357 class357, String string, int i) {
		try {
			((Class1) this).aClass357_19 = class357;
			((Class1) this).aClass409_38.method4770(string, (short) -28342);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ab.o(").append(')').toString());
		}
	}

	static void method385(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 - 2] = (Class131.aClass407_1502.method4752((((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 - 2]), -1365920612).method4640(Class158.aClass561_6474, (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 - 1]), -628759703)) ? 1 : 0;
			((Class430) class430).anInt4376 -= -1390004513;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ab.d(").append(')').toString());
		}
	}

	static final void method386(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 124953757;
			iComponentDefinitions.anInt1268 = ((((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]) * -1884121533);
			iComponentDefinitions.anInt1279 = (1812861885 * (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]));
			iComponentDefinitions.anInt1267 = (2058728403 * (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 2]));
			Class404.method4738(iComponentDefinitions, 707454434);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ab.ey(").append(')').toString());
		}
	}

	static final void method387(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class462.method5704(iComponentDefinitions, class120, class430, (byte) -47);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ab.et(").append(')').toString());
		}
	}

	static final void method388(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 178880377 * Class360.anInt3781;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ab.ajr(").append(')').toString());
		}
	}

	static final void method389(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (null != client.aString8968 && i_0_ < Class452.anInt5561 * 1374414177)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = (Class95_Sub22.aClass13Array7210[i_0_].anInt169 * -1945514607);
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ab.wk(").append(')').toString());
		}
	}
}
