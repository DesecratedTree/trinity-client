/* Class324 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;

public abstract class Class324 {
	boolean aBoolean3299;
	static int anInt3300 = 50;
	byte[] aByteArray3301;
	boolean aBoolean3302;
	boolean aBoolean3303;
	OggSyncState anOggSyncState3304;
	Class497 aClass497_3305;
	static int anInt3306 = 10;
	OggPage anOggPage3307;
	boolean aBoolean3308;
	Class330_Sub31_Sub4 aClass330_Sub31_Sub4_3309;
	Class330_Sub31_Sub1 aClass330_Sub31_Sub1_3310;
	Class330_Sub31_Sub2 aClass330_Sub31_Sub2_3311;
	String aString3312;
	OggPacket anOggPacket3313;

	abstract int method3181(byte[] is, byte i) throws IOException;

	void method3182(int i) {
		try {
			for (Class330_Sub31 class330_sub31 = ((Class330_Sub31) ((Class324) this).aClass497_3305.method6099((byte) 3)); class330_sub31 != null; class330_sub31 = (Class330_Sub31) ((Class324) this).aClass497_3305.method6098((short) -32768)) {
				if (!(class330_sub31 instanceof Class330_Sub31_Sub2)) {
					if (i == 1900723246)
						throw new IllegalStateException();
				} else {
					Class330_Sub31_Sub2 class330_sub31_sub2 = (Class330_Sub31_Sub2) class330_sub31;
					while (((((Class330_Sub31_Sub2) class330_sub31_sub2).anInt7723) * -983895715 <= 8 || (method3191(-1633803161) > (double) class330_sub31_sub2.method3425(369738377))) && (((Class330_Sub31_Sub2) class330_sub31_sub2).anOggStreamState7724.packetOut(((Class324) this).anOggPacket3313)) == 1)
						class330_sub31_sub2.method3410((((Class324) this).anOggPacket3313), (byte) 17);
				}
			}
			method3190(((Class324) this).aString3312, 42983231);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nm.o(").append(')').toString());
		}
	}

	boolean method3183(int i) {
		try {
			if (((Class324) this).aClass330_Sub31_Sub1_3310 != null)
				return (!((Class324) this).aClass330_Sub31_Sub4_3309.method3431((byte) -25) || (method3191(1126982676) > ((Class324) this).aClass330_Sub31_Sub4_3309.method3427((byte) 3)));
			double d = (double) ((Class324) this).aClass330_Sub31_Sub4_3309.method3429(1492625308);
			return (d == 0.0 || ((double) Class312.method3111((byte) 26) >= (double) ((Class324) this).aClass330_Sub31_Sub4_3309.method3430(-387739358) + 1000.0 / d));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nm.s(").append(')').toString());
		}
	}

	void method3184(int i) {
		try {
			for (Class330_Sub31 class330_sub31 = (Class330_Sub31) ((Class324) this).aClass497_3305.method6099((byte) -23); class330_sub31 != null; class330_sub31 = (Class330_Sub31) ((Class324) this).aClass497_3305.method6098((short) -32768)) {
				if (((Class324) this).aClass330_Sub31_Sub4_3309 == class330_sub31) {
					if (i >= 525431007) {
						/* empty */
					}
				} else {
					while (((Class330_Sub31) class330_sub31).anOggStreamState7724.packetOut() == 1)
						class330_sub31.method3410((((Class324) this).anOggPacket3313), (byte) 56);
				}
			}
			if (((Class324) this).aClass330_Sub31_Sub4_3309 != null) {
				for (int i_0_ = 0; i_0_ < 10 && method3183(-432857350); i_0_++) {
					if (((Class330_Sub31_Sub4) ((Class324) this).aClass330_Sub31_Sub4_3309).anOggStreamState7724.packetOut() != 1) {
						method3185(-439053011);
						break;
					}
					((Class324) this).aClass330_Sub31_Sub4_3309.method3410(((Class324) this).anOggPacket3313, (byte) 77);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nm.f(").append(')').toString());
		}
	}

	public void method3185(int i) {
		try {
			if (!((Class324) this).aBoolean3302) {
				for (Class330_Sub31 class330_sub31 = (Class330_Sub31) ((Class324) this).aClass497_3305.method6099((byte) 48); null != class330_sub31; class330_sub31 = (Class330_Sub31) ((Class324) this).aClass497_3305.method6098((short) -32768)) {
					class330_sub31.method3413(-337458341);
					((Class330_Sub31) class330_sub31).anOggStreamState7724.j();
				}
				((Class324) this).anOggPacket3313.j();
				((Class324) this).anOggPage3307.j();
				((Class324) this).anOggSyncState3304.j();
				((Class324) this).aBoolean3302 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nm.z(").append(')').toString());
		}
	}

	public Class330_Sub31_Sub4 method3186(byte i) {
		try {
			return ((Class324) this).aClass330_Sub31_Sub4_3309;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nm.w(").append(')').toString());
		}
	}

	public Class330_Sub31_Sub1 method3187(int i) {
		try {
			return ((Class324) this).aClass330_Sub31_Sub1_3310;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nm.n(").append(')').toString());
		}
	}

	public Class330_Sub31_Sub2 method3188(int i) {
		try {
			return ((Class324) this).aClass330_Sub31_Sub2_3311;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nm.l(").append(')').toString());
		}
	}

	public void method3189(boolean bool, byte i) {
		try {
			if (((Class324) this).aClass330_Sub31_Sub1_3310 != null) {
				Class330_Sub40_Sub1 class330_sub40_sub1 = ((Class324) this).aClass330_Sub31_Sub1_3310.method3419(1292286263);
				if (class330_sub40_sub1 != null)
					class330_sub40_sub1.method3583(bool, -632648443);
			}
			((Class324) this).aBoolean3299 = !((Class324) this).aBoolean3299;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nm.u(").append(')').toString());
		}
	}

	public void method3190(String string, int i) {
		try {
			((Class324) this).aString3312 = string;
			if (((Class324) this).aString3312 == null)
				((Class324) this).aClass330_Sub31_Sub2_3311 = null;
			else {
				if (null != ((Class324) this).aClass330_Sub31_Sub2_3311 && !(((Class324) this).aString3312.equals(((Class324) this).aClass330_Sub31_Sub2_3311.method3422(-1113295978))))
					((Class324) this).aClass330_Sub31_Sub2_3311 = null;
				if (null == ((Class324) this).aClass330_Sub31_Sub2_3311) {
					for (Class330_Sub31 class330_sub31 = (Class330_Sub31) ((Class324) this).aClass497_3305.method6099((byte) -26); null != class330_sub31; class330_sub31 = ((Class330_Sub31) ((Class324) this).aClass497_3305.method6098((short) -32768))) {
						if (class330_sub31 instanceof Class330_Sub31_Sub2) {
							Class330_Sub31_Sub2 class330_sub31_sub2 = (Class330_Sub31_Sub2) class330_sub31;
							if (((Class324) this).aString3312.equals(class330_sub31_sub2.method3422(-1023990558))) {
								((Class324) this).aClass330_Sub31_Sub2_3311 = class330_sub31_sub2;
								break;
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nm.k(").append(')').toString());
		}
	}

	public double method3191(int i) {
		try {
			if (((Class324) this).aClass330_Sub31_Sub1_3310 != null)
				return ((Class324) this).aClass330_Sub31_Sub1_3310.method3420(1181725581);
			if (null != ((Class324) this).aClass330_Sub31_Sub4_3309)
				return ((Class324) this).aClass330_Sub31_Sub4_3309.method3427((byte) 3);
			return 0.0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nm.q(").append(')').toString());
		}
	}

	abstract int method3192(byte[] is) throws IOException;

	abstract int method3193(byte[] is) throws IOException;

	abstract int method3194(byte[] is) throws IOException;

	abstract int method3195(byte[] is) throws IOException;

	Class324(int i) {
		if (!Class489.method6063(-1102372689).method327("jagtheora", 55579657))
			throw new RuntimeException("");
		((Class324) this).aByteArray3301 = new byte[i];
		((Class324) this).anOggSyncState3304 = new OggSyncState();
		((Class324) this).anOggPage3307 = new OggPage();
		((Class324) this).anOggPacket3313 = new OggPacket();
		((Class324) this).aClass497_3305 = new Class497(8);
	}

	Class330_Sub31 method3196(int i) throws IOException {
		try {
			if (((Class324) this).aBoolean3302)
				throw new IllegalStateException();
			if (((Class324) this).aBoolean3308)
				return null;
			while_82_: do {
				int i_1_;
				do {
					if (((Class324) this).anOggSyncState3304.pageOut(((Class324) this).anOggPage3307) > 0)
						break while_82_;
					i_1_ = method3181(((Class324) this).aByteArray3301, (byte) -119);
					if (-1 == i_1_) {
						((Class324) this).aBoolean3308 = true;
						return null;
					}
					if (0 == i_1_)
						return null;
				} while (((Class324) this).anOggSyncState3304.write(((Class324) this).aByteArray3301, i_1_));
				throw new RuntimeException("");
			} while (false);
			int i_2_ = ((Class324) this).anOggPage3307.getSerialNumber();
			if (((Class324) this).anOggPage3307.isBOS()) {
				OggStreamState oggstreamstate = new OggStreamState(i_2_);
				if (!oggstreamstate.pageIn(((Class324) this).anOggPage3307))
					throw new IllegalStateException();
				if (oggstreamstate.packetPeek(((Class324) this).anOggPacket3313) != 1)
					throw new IllegalStateException();
				Class330_Sub31 class330_sub31;
				if (((Class324) this).aClass330_Sub31_Sub4_3309 == null && ((Class324) this).anOggPacket3313.isTheora()) {
					((Class324) this).aClass330_Sub31_Sub4_3309 = new Class330_Sub31_Sub4(oggstreamstate);
					class330_sub31 = ((Class324) this).aClass330_Sub31_Sub4_3309;
				} else if (((Class324) this).aClass330_Sub31_Sub1_3310 == null && ((Class324) this).anOggPacket3313.isVorbis()) {
					((Class324) this).aClass330_Sub31_Sub1_3310 = new Class330_Sub31_Sub1(oggstreamstate);
					class330_sub31 = ((Class324) this).aClass330_Sub31_Sub1_3310;
				} else {
					byte[] is = ((Class324) this).anOggPacket3313.getData();
					StringBuilder stringbuilder = new StringBuilder();
					for (int i_3_ = 1; i_3_ < is.length; i_3_++) {
						if (!Character.isLetterOrDigit((char) is[i_3_])) {
							if (i != 1337095293) {
								/* empty */
							}
							break;
						}
						stringbuilder.append((char) is[i_3_]);
					}
					String string = stringbuilder.toString();
					if (string.equals("kate"))
						class330_sub31 = new Class330_Sub31_Sub2(oggstreamstate);
					else
						class330_sub31 = new Class330_Sub31_Sub3(oggstreamstate);
				}
				((Class324) this).aClass497_3305.method6097(class330_sub31, (long) i_2_);
				return class330_sub31;
			}
			Class330_Sub31 class330_sub31 = ((Class330_Sub31) ((Class324) this).aClass497_3305.method6094((long) i_2_));
			if (!((Class330_Sub31) class330_sub31).anOggStreamState7724.pageIn(((Class324) this).anOggPage3307))
				throw new IllegalStateException();
			return class330_sub31;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nm.j(").append(')').toString());
		}
	}

	public boolean method3197(int i) {
		try {
			if (!((Class324) this).aBoolean3302 && !((Class324) this).aBoolean3308)
				return false;
			if (null != ((Class324) this).aClass330_Sub31_Sub1_3310 && ((Class324) this).aClass330_Sub31_Sub1_3310.method3421((byte) 7) > 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nm.b(").append(')').toString());
		}
	}

	void method3198(byte i) throws IOException {
		try {
			while (((Class330_Sub31_Sub4) ((Class324) this).aClass330_Sub31_Sub4_3309).anOggStreamState7724.packetOut(((Class324) this).anOggPacket3313) != 1) {
				Class330_Sub31 class330_sub31 = method3196(1337095293);
				if (null == class330_sub31) {
					if (((Class324) this).aBoolean3308)
						method3184(-1885477849);
					return;
				}
				if (((Class324) this).aClass330_Sub31_Sub2_3311 == class330_sub31)
					method3182(-321141857);
			}
			((Class324) this).aClass330_Sub31_Sub4_3309.method3410(((Class324) this).anOggPacket3313, (byte) 46);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nm.p(").append(')').toString());
		}
	}

	public void method3199(byte i) throws IOException {
		try {
			if (!((Class324) this).aBoolean3299) {
				while_84_: for (/**/; !((Class324) this).aBoolean3302; ((Class324) this).aBoolean3303 = false) {
					Class330_Sub31 class330_sub31;
					if (!((Class324) this).aBoolean3303) {
						class330_sub31 = method3196(1337095293);
						if (class330_sub31 == null) {
							if (((Class324) this).aBoolean3308)
								method3184(-1629070816);
							break;
						}
						if (class330_sub31 == null)
							throw new IllegalStateException();
						((Class324) this).aBoolean3303 = true;
					} else
						class330_sub31 = ((Class330_Sub31) (((Class324) this).aClass497_3305.method6094((long) ((Class324) this).anOggPage3307.getSerialNumber())));
					if (((Class324) this).aClass330_Sub31_Sub1_3310 == class330_sub31) {
						if (((Class324) this).aClass330_Sub31_Sub1_3310.method3421((byte) 24) < 50) {
							do {
								if ((((Class330_Sub31_Sub1) (((Class324) this).aClass330_Sub31_Sub1_3310)).anOggStreamState7724.packetOut(((Class324) this).anOggPacket3313)) != 1)
									continue while_84_;
								((Class324) this).aClass330_Sub31_Sub1_3310.method3410(((Class324) this).anOggPacket3313, (byte) 20);
								method3182(1084560151);
								if (null != (((Class324) this).aClass330_Sub31_Sub4_3309)) {
									double d = ((Class324) this).aClass330_Sub31_Sub4_3309.method3427((byte) 3);
									for (int i_4_ = 0; i_4_ < 10 && method3183(-804655726); i_4_++) {
										method3198((byte) -72);
										if (((Class324) this).aBoolean3302)
											return;
									}
									if (d < ((Class324) this).aClass330_Sub31_Sub4_3309.method3427((byte) 3))
										break;
								}
							} while (((Class324) this).aClass330_Sub31_Sub1_3310.method3421((byte) 101) < 50);
							break;
						}
						break;
					}
					if (class330_sub31 instanceof Class330_Sub31_Sub2)
						method3182(1230937354);
					else if (class330_sub31 != ((Class324) this).aClass330_Sub31_Sub4_3309) {
						while ((((Class330_Sub31) class330_sub31).anOggStreamState7724.packetOut(((Class324) this).anOggPacket3313)) == 1) {
							if (1 == (((Class330_Sub31) class330_sub31).anInt7723) * -983895715 && (class330_sub31 instanceof Class330_Sub31_Sub2))
								method3190(((Class324) this).aString3312, 2066770735);
							class330_sub31.method3410((((Class324) this).anOggPacket3313), (byte) -15);
						}
					} else if ((((Class324) this).aClass330_Sub31_Sub1_3310 == null) && !((Class324) this).aBoolean3299) {
						for (int i_5_ = 0; i_5_ < 10 && method3183(-1912888496); i_5_++) {
							method3198((byte) -7);
							if (((Class324) this).aBoolean3302)
								break;
						}
						break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nm.i(").append(')').toString());
		}
	}

	static final void method3200(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub6_7882.method5757(65535) == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nm.alg(").append(')').toString());
		}
	}

	static final void method3201(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			if (5 == iComponentDefinitions.anInt1198 * 1849136745)
				Class464_Sub1.method5734(iComponentDefinitions, class120, class430, -1626253272);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nm.gu(").append(')').toString());
		}
	}

	public static void method3202(NPC class432_sub1_sub1_sub1_sub2, int i) {
		try {
			for (Class330_Sub20 class330_sub20 = ((Class330_Sub20) Class330_Sub20.aClass471_7650.method5869(539664854)); null != class330_sub20; class330_sub20 = (Class330_Sub20) Class330_Sub20.aClass471_7650.method5873((byte) -102)) {
				if ((((Class330_Sub20) class330_sub20).aClass432_Sub1_Sub1_Sub1_Sub2_7661) == class432_sub1_sub1_sub1_sub2) {
					if ((((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7675) != null) {
						Class511.aClass330_Sub40_Sub4_5951.method3685(((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7675);
						((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7675 = null;
					}
					class330_sub20.method3252(373408543);
					break;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nm.s(").append(')').toString());
		}
	}
}
