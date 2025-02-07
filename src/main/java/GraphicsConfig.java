/* Class398 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GraphicsConfig {
	int id;
	int anInt5203;
	int model;
	public int animation = -761293581;
	short[] aShortArray5206;
	short[] aShortArray5207;
	short[] aShortArray5208;
	short[] aShortArray5209;
	Class389 aClass389_5210;
	int scaleY;
	int rotation;
	int shadow;
	int lightness;
	public boolean aBoolean5215;
	public byte aByte5216;
	int scaleXZ = -1498254464;

	void method4915(RsByteBuffer class298_sub53, byte i) {
		try {
			int id = this.id  * -559444237;
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (0 == i_0_) {
					if (i == -1)
						throw new IllegalStateException();
					break;
				}
				if (id >= Settings.OSRS_GRAPHICS_OFFSET)
					decodeOSRS(class298_sub53, i_0_, 84112235);
				else
					decode(class298_sub53, i_0_, 84112235);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.a(").append(')').toString());
		}
	}

	void decodeOSRS(RsByteBuffer buffer, int i, int i_1_) {
		try {
			if (1 == i)
				((GraphicsConfig) this).model = (buffer.readUnsignedShort() + Settings.OSRS_MODEL_OFFSET) * 422607467;
			else if (i == 2)
				animation = (buffer.readUnsignedShort() + Settings.OSRS_ANIMATIONS_OFFSET) * 761293581;
			else if (4 == i)
				((GraphicsConfig) this).scaleXZ = buffer.readUnsignedShort() * -1420991257;
			else if (i == 5)
				((GraphicsConfig) this).scaleY = buffer.readUnsignedShort() * -586540739;
			else if (i == 6)
				((GraphicsConfig) this).rotation = buffer.readUnsignedShort() * -79411937;
			else if (7 == i)
				((GraphicsConfig) this).shadow = buffer.readUnsignedByte() * 1905965041;
			else if (8 == i)
				((GraphicsConfig) this).lightness = buffer.readUnsignedByte() * -241990007;
			else if (40 == i) {
				int i_2_ = buffer.readUnsignedByte();
				((GraphicsConfig) this).aShortArray5206 = new short[i_2_];
				((GraphicsConfig) this).aShortArray5207 = new short[i_2_];
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
					((GraphicsConfig) this).aShortArray5206[i_3_] = (short) buffer.readUnsignedShort();
					((GraphicsConfig) this).aShortArray5207[i_3_] = (short) buffer.readUnsignedShort();
				}
			} else if (41 == i) {
				int i_4_ = buffer.readUnsignedByte();
				((GraphicsConfig) this).aShortArray5208 = new short[i_4_];
				((GraphicsConfig) this).aShortArray5209 = new short[i_4_];
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					((GraphicsConfig) this).aShortArray5208[i_5_] = (short) buffer.readUnsignedShort();
					((GraphicsConfig) this).aShortArray5209[i_5_] = (short) buffer.readUnsignedShort();
				}
			} else {
				System.out.println("missing graphics osrs opcode "+i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.f(").append(')').toString());
		}
	}
	
	void decode(RsByteBuffer class298_sub53, int i, int i_1_) {
		try {
			if (1 == i)
				((GraphicsConfig) this).model = class298_sub53.readBigSmart(1235052657) * 422607467;
			else if (i == 2)
				animation = class298_sub53.readBigSmart(1235052657) * 761293581;
			else if (4 == i)
				((GraphicsConfig) this).scaleXZ = class298_sub53.readUnsignedShort() * -1420991257;
			else if (i == 5)
				((GraphicsConfig) this).scaleY = class298_sub53.readUnsignedShort() * -586540739;
			else if (i == 6)
				((GraphicsConfig) this).rotation = class298_sub53.readUnsignedShort() * -79411937;
			else if (7 == i)
				((GraphicsConfig) this).shadow = class298_sub53.readUnsignedByte() * 1905965041;
			else if (8 == i)
				((GraphicsConfig) this).lightness = class298_sub53.readUnsignedByte() * -241990007;
			else if (9 == i) {
				aByte5216 = (byte) 3;
				((GraphicsConfig) this).anInt5203 = -1485189472;
			} else if (10 == i)
				aBoolean5215 = true;
			else if (i == 11)
				aByte5216 = (byte) 1;
			else if (12 == i)
				aByte5216 = (byte) 4;
			else if (i == 13)
				aByte5216 = (byte) 5;
			else if (14 == i) {
				aByte5216 = (byte) 2;
				((GraphicsConfig) this).anInt5203 = class298_sub53.readUnsignedByte() * -497453824;
			} else if (i == 15) {
				aByte5216 = (byte) 3;
				((GraphicsConfig) this).anInt5203 = class298_sub53.readUnsignedShort() * 48388469;
			} else if (16 == i) {
				aByte5216 = (byte) 3;
				((GraphicsConfig) this).anInt5203 = class298_sub53.readInt((byte) 52) * 48388469;
			} else if (40 == i) {
				int i_2_ = class298_sub53.readUnsignedByte();
				((GraphicsConfig) this).aShortArray5206 = new short[i_2_];
				((GraphicsConfig) this).aShortArray5207 = new short[i_2_];
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
					((GraphicsConfig) this).aShortArray5206[i_3_] = (short) class298_sub53.readUnsignedShort();
					((GraphicsConfig) this).aShortArray5207[i_3_] = (short) class298_sub53.readUnsignedShort();
				}
			} else if (41 == i) {
				int i_4_ = class298_sub53.readUnsignedByte();
				((GraphicsConfig) this).aShortArray5208 = new short[i_4_];
				((GraphicsConfig) this).aShortArray5209 = new short[i_4_];
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					((GraphicsConfig) this).aShortArray5208[i_5_] = (short) class298_sub53.readUnsignedShort();
					((GraphicsConfig) this).aShortArray5209[i_5_] = (short) class298_sub53.readUnsignedShort();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.f(").append(')').toString());
		}
	}

	public final Class387 method4917(GraphicsToolkit class_ra, int i, Class438 class438, byte i_6_, int i_7_) {
		try {
			return method4918(class_ra, i, false, null, null, 0, 0, 0, class438, i_6_, 1256553464);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.b(").append(')').toString());
		}
	}

	public final Class387 method4918(GraphicsToolkit class_ra, int i, boolean bool, Class_xa class_xa, Class_xa class_xa_8_, int i_9_, int i_10_, int i_11_, Class438 class438, byte i_12_, int i_13_) {
		try {
			int i_14_ = i;
			bool = bool & 0 != aByte5216;
			if (null != class438)
				i_14_ |= class438.method5829(-1790708337);
			if (bool)
				i_14_ = i_14_ | (aByte5216 == 3 ? 7 : 2);
			if (((GraphicsConfig) this).scaleY * -64059883 != 128)
				i_14_ |= 0x2;
			if (128 != ((GraphicsConfig) this).scaleXZ * -1869386025 || 0 != ((GraphicsConfig) this).rotation * -614140193)
				i_14_ |= 0x5;
			Class387 class387;
			synchronized (((Class389) ((GraphicsConfig) this).aClass389_5210).aClass348_4162) {
				class387 = ((Class387) (((Class389) ((GraphicsConfig) this).aClass389_5210).aClass348_4162.get((long) ((((GraphicsConfig) this).id = (1757755963 * ((-559444237 * ((GraphicsConfig) this).id) | (class_ra.anInt5298 * 580915349 << 29)))) * -559444237))));
			}
			if (class387 == null || class_ra.method5017(class387.m(), i_14_) != 0) {
				if (class387 != null)
					i_14_ = class_ra.method5004(i_14_, class387.m());
				int i_15_ = i_14_;
				if (((GraphicsConfig) this).aShortArray5206 != null)
					i_15_ |= 0x4000;
				if (((GraphicsConfig) this).aShortArray5208 != null)
					i_15_ |= 0x8000;
				Model class64 = Model.loadModel((((Class389) ((GraphicsConfig) this).aClass389_5210).aClass243_4160), (((GraphicsConfig) this).model * -283549117), 0);
				if (class64 == null)
					return null;
				if (class64.protocol < 13)
					class64.resize(2);
				
				//int id = this.id  * -559444237;
				//3878 9938 3
				class387 = (class_ra.method5037(class64, i_15_, -258957271 * ((Class389) (((GraphicsConfig) this).aClass389_5210)).anInt4163, 64 + -2043193071 * ((GraphicsConfig) this).shadow, 850 + 1459867577 * ((GraphicsConfig) this).lightness));
				if (null != ((GraphicsConfig) this).aShortArray5206) {
					for (int i_16_ = 0; i_16_ < ((GraphicsConfig) this).aShortArray5206.length; i_16_++)
						class387.X(((GraphicsConfig) this).aShortArray5206[i_16_], ((GraphicsConfig) this).aShortArray5207[i_16_]);
				}
				if (((GraphicsConfig) this).aShortArray5208 != null) {
					for (int i_17_ = 0; i_17_ < ((GraphicsConfig) this).aShortArray5208.length; i_17_++)
						class387.W(((GraphicsConfig) this).aShortArray5208[i_17_], ((GraphicsConfig) this).aShortArray5209[i_17_]);
				}
				
				
				
				class387.KA(i_14_);
				synchronized (((Class389) ((GraphicsConfig) this).aClass389_5210).aClass348_4162) {
					((Class389) ((GraphicsConfig) this).aClass389_5210).aClass348_4162.method4194(class387, (long) ((((GraphicsConfig) this).id = ((((GraphicsConfig) this).id * -559444237 | 580915349 * class_ra.anInt5298 << 29) * 1757755963)) * -559444237));
				}
			}
			Class387 class387_18_ = class387.method4755(i_12_, i_14_, true);
			if (class438 != null)
				class438.method5839(class387_18_, 0, -400006457);
			if (-1869386025 * ((GraphicsConfig) this).scaleXZ != 128 || ((GraphicsConfig) this).scaleY * -64059883 != 128)
				class387_18_.oa(-1869386025 * ((GraphicsConfig) this).scaleXZ, ((GraphicsConfig) this).scaleY * -64059883, -1869386025 * ((GraphicsConfig) this).scaleXZ);
			if (-614140193 * ((GraphicsConfig) this).rotation != 0) {
				if (((GraphicsConfig) this).rotation * -614140193 == 90)
					class387_18_.f(4096);
				if (-614140193 * ((GraphicsConfig) this).rotation == 180)
					class387_18_.f(8192);
				if (270 == -614140193 * ((GraphicsConfig) this).rotation)
					class387_18_.f(12288);
			}
			if (bool)
				class387_18_.pa(aByte5216, 167177949 * ((GraphicsConfig) this).anInt5203, class_xa, class_xa_8_, i_9_, i_10_, i_11_);
			class387_18_.KA(i);
			return class387_18_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.p(").append(')').toString());
		}
	}

	GraphicsConfig() {
		((GraphicsConfig) this).scaleY = -2062770560;
		((GraphicsConfig) this).rotation = 0;
		((GraphicsConfig) this).shadow = 0;
		((GraphicsConfig) this).lightness = 0;
		aBoolean5215 = false;
		aByte5216 = (byte) 0;
		((GraphicsConfig) this).anInt5203 = -48388469;
	}

	public final boolean method4919(byte i) {
		try {
			if (((GraphicsConfig) this).model * -283549117 == -1)
				return true;
			return (((Class389) ((GraphicsConfig) this).aClass389_5210).aClass243_4160.method2290(-283549117 * ((GraphicsConfig) this).model, 0, -676484272));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.i(").append(')').toString());
		}
	}

	static boolean method4920(int i, short i_19_) {
		try {
			if (i == 18 || 19 == i || 20 == i || i == 21 || 22 == i || 1004 == i)
				return true;
			if (17 == i)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.bo(").append(')').toString());
		}
	}

	public static boolean method4921(char c, int i) {
		try {
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				return true;
			if (c != 0) {
				char[] cs = Class419.aCharArray5340;
				for (int i_20_ = 0; i_20_ < cs.length; i_20_++) {
					char c_21_ = cs[i_20_];
					if (c_21_ == c)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.f(").append(')').toString());
		}
	}

	public static final void method4922(String string, int i) {
		try {
			if (Class82_Sub6.aClass7Array6846 != null) {
				Class25 class25 = Class429.method5760((short) 512);
				Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.KICK_FRIEND_CHAT_PACKET, class25.aClass449_330, (byte) 6);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(Class58.method693(string, 1482909411));
				class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string, 2132300359);
				class25.method390(class298_sub36, (byte) -58);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.mr(").append(')').toString());
		}
	}

	static final void method4923(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_) {
		try {
			if (i_23_ >= 1 && i_24_ >= 1 && i_23_ <= client.aClass283_8716.method2629(-1936425983) - 2 && (i_24_ <= client.aClass283_8716.method2630(-1245034974) - 2)) {
				int i_30_ = i;
				if (i_30_ < 3 && client.aClass283_8716.method2654(511320643).method2320(i_23_, i_24_, 549965572))
					i_30_++;
				if (client.aClass283_8716.method2675(-1611682495) != null) {
					client.aClass283_8716.method2644(-1368274969).method2234(FloorOverlay.graphics, i, i_22_, i_23_, i_24_, client.aClass283_8716.getSceneClipDataPlane(i), 366084983);
					if (i_25_ >= 0) {
						int i_31_ = Class422_Sub25.preferences.aClass422_Sub2_7547.method5629(-810781268);
						Class422_Sub25.preferences.method3540((Class422_Sub25.preferences.aClass422_Sub2_7547), 1, 650835797);
						client.aClass283_8716.method2644(-630573167).method2243(FloorOverlay.graphics, i_30_, i, i_23_, i_24_, i_25_, i_26_, i_27_, client.aClass283_8716.getSceneClipDataPlane(i), i_28_, 2073430416);
						Class422_Sub25.preferences.method3540((Class422_Sub25.preferences.aClass422_Sub2_7547), i_31_, 631929348);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.d(").append(')').toString());
		}
	}

	public static int method4924(CharSequence charsequence, int i, byte i_32_) {
		try {
			return Preference.method5619(charsequence, i, true, -566000595);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.k(").append(')').toString());
		}
	}

	static final void method4925(ClientScript2 class403, int i) {
		try {
			Class422_Sub25.preferences.method3540(Class422_Sub25.preferences.aClass422_Sub28_7573, (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]) != 0 ? 1 : 0, -856880407);
			Class3.savePreferences(656179282);
			client.aClass283_8716.method2667(1778418334);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qm.aip(").append(')').toString());
		}
	}
}
