/* Class385 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
public class Atmosphere {
	SceneObjectPosition aClass217_4129;
	float sunShineness;
	float sunX;
	float aFloat4132;
	int sunColor;
	int skyColor;
	int anInt4135;
	Class66 aClass66_4136;
	float sunY;
	float aFloat4138;
	float aFloat4139;
	Class277 aClass277_4140;
	public static client aClient4141;
	static Class89 aClass89_4142;

	public Atmosphere(RsByteBuffer class298_sub53, Class364 class364) {
		decodeGeneric(class298_sub53, class364, (short) 9475);
	}
	
	void setOSRSAtmosphere(int mapID) {
		if (mapID == 14386 || mapID == 14642 || mapID == 14643 || mapID == 14898 || mapID == 14899 || mapID == 14900 || mapID == 14901) { //tob entrance,vampyre
			skyColor = 884153872;
			anInt4135 = 1816106143;
		} else if (mapID == 23948 || mapID == 9008 || mapID == 9007 || mapID == 8751 || mapID == 5177 || mapID == 5176 || mapID == 4920  || mapID == 4664
				) {
			
			//poison swamp
			skyColor = 1987367270;
			anInt4135 = -411328286;
			sunColor = -1749420244;
			sunY = 0.77734375f;
			sunX = 1.0195312f;
			sunShineness = 1.2617188f;
			anInt4135 = -411328286;
		} else if (mapID == 5179 || mapID == 5435 || mapID == 14142 || mapID == 5434 || mapID == 5433 || mapID == 5689 || mapID == 5690) {
			//mount ka, wild
			skyColor = -1627176635;
			anInt4135 = 1413882585;
			sunColor = 1722715501;
			sunY = 1.2f;
			sunX = 0.69921875f;
			sunShineness = 1.1523438f;
			anInt4135 = 1413882585;
		} else if (mapID == 9023 || mapID == 6462 || mapID == 6461 || mapID == 6204) {
			//snow
			skyColor = -277111353;
			anInt4135 = -571229848;
			sunColor = 1722715501;
			sunY = 1.2f;
			sunX = 0.69921875f;
			sunShineness = 1.1523438f;
			anInt4135 = -571229848;
		} else if (mapID == 11851 || mapID == 11850 || mapID == 12106 || mapID == 12362 || mapID == 12363) { //abbys
			skyColor = 1336541184;
			anInt4135 = -2035814320;
			sunColor = 1722715501;
			sunY = 1.2f;
			sunX = 0.69921875f;
			sunShineness = 0.6015625f;
			anInt4135 = -2035814320;
		} else if (Settings.isZeahMap(mapID)) {
			if(Settings.HALLOWEEN_FOG && (mapID == 12342 || mapID == 12341)) {
				// halloween
				skyColor = -1627176635;
				anInt4135 = 1413882585;
				sunColor = 1722715501;
				sunY = 1.2f;
				sunX = 0.69921875f;
				sunShineness = 1.1523438f;
				anInt4135 = 1413882585;
			} else {
				skyColor = -1815584728;
				anInt4135 = 1355384797;
				sunColor = 1459977379;
				sunY = 0.37890625f;
				sunX = 1.15625f;
				sunShineness = 1.2929688f;
				anInt4135 = 1355384797;
			}
		} else {
			skyColor = 0;
		}
	}

	void method4704(Atmosphere class385_0_, byte i) {
		try {
			((Atmosphere) this).sunColor = ((Atmosphere) class385_0_).sunColor * 1;
			((Atmosphere) this).sunShineness = ((Atmosphere) class385_0_).sunShineness;
			((Atmosphere) this).sunX = ((Atmosphere) class385_0_).sunX;
			((Atmosphere) this).sunY = ((Atmosphere) class385_0_).sunY;
			((Atmosphere) this).aClass217_4129.method2013(((Atmosphere) class385_0_).aClass217_4129);
			((Atmosphere) this).skyColor = ((Atmosphere) class385_0_).skyColor * 1;
			((Atmosphere) this).anInt4135 = 1 * ((Atmosphere) class385_0_).anInt4135;
			((Atmosphere) this).aClass66_4136 = ((Atmosphere) class385_0_).aClass66_4136;
			((Atmosphere) this).aFloat4139 = ((Atmosphere) class385_0_).aFloat4139;
			((Atmosphere) this).aFloat4138 = ((Atmosphere) class385_0_).aFloat4138;
			((Atmosphere) this).aFloat4132 = ((Atmosphere) class385_0_).aFloat4132;
			((Atmosphere) this).aClass277_4140 = ((Atmosphere) class385_0_).aClass277_4140;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.f(").append(')').toString());
		}
	}

	void method4705(GraphicsToolkit class_ra, Atmosphere class385_1_, Atmosphere class385_2_, float f, int i) {
		try {
			((Atmosphere) this).sunColor = StanceConfig.method4215((-1951302757 * ((Atmosphere) class385_1_).sunColor), (((Atmosphere) class385_2_).sunColor * -1951302757), f * 255.0F, -394247366) * 743535251;
			((Atmosphere) this).sunX = (f * (((Atmosphere) class385_2_).sunX - ((Atmosphere) class385_1_).sunX) + ((Atmosphere) class385_1_).sunX);
			((Atmosphere) this).sunY = ((((Atmosphere) class385_2_).sunY - ((Atmosphere) class385_1_).sunY) * f + ((Atmosphere) class385_1_).sunY);
			((Atmosphere) this).sunShineness = (f * (((Atmosphere) class385_2_).sunShineness - ((Atmosphere) class385_1_).sunShineness) + ((Atmosphere) class385_1_).sunShineness);
			((Atmosphere) this).aFloat4132 = ((((Atmosphere) class385_2_).aFloat4132 - ((Atmosphere) class385_1_).aFloat4132) * f + ((Atmosphere) class385_1_).aFloat4132);
			((Atmosphere) this).aFloat4139 = (((Atmosphere) class385_1_).aFloat4139 + f * (((Atmosphere) class385_2_).aFloat4139 - ((Atmosphere) class385_1_).aFloat4139));
			((Atmosphere) this).aFloat4138 = (((Atmosphere) class385_1_).aFloat4138 + f * (((Atmosphere) class385_2_).aFloat4138 - ((Atmosphere) class385_1_).aFloat4138));
			((Atmosphere) this).skyColor = StanceConfig.method4215((((Atmosphere) class385_1_).skyColor * -1269717659), (-1269717659 * ((Atmosphere) class385_2_).skyColor), f * 255.0F, 561967704) * -316996499;
			((Atmosphere) this).anInt4135 = (1820271565 * (int) ((float) (((Atmosphere) class385_1_).anInt4135 * -1939701499) + f * (float) ((((Atmosphere) class385_2_).anInt4135 * -1939701499) - (((Atmosphere) class385_1_).anInt4135) * -1939701499)));
			if (((Atmosphere) class385_1_).aClass66_4136 != ((Atmosphere) class385_2_).aClass66_4136)
				((Atmosphere) this).aClass66_4136 = class_ra.method5179((((Atmosphere) class385_1_).aClass66_4136), (((Atmosphere) class385_2_).aClass66_4136), f, ((Atmosphere) this).aClass66_4136);
			if (((Atmosphere) class385_2_).aClass277_4140 != ((Atmosphere) class385_1_).aClass277_4140) {
				if (null == ((Atmosphere) class385_1_).aClass277_4140) {
					((Atmosphere) this).aClass277_4140 = ((Atmosphere) class385_2_).aClass277_4140;
					if (((Atmosphere) this).aClass277_4140 != null)
						((Atmosphere) this).aClass277_4140.method2583((int) (f * 255.0F), 0, -909735354);
				} else {
					((Atmosphere) this).aClass277_4140 = ((Atmosphere) class385_1_).aClass277_4140;
					if (((Atmosphere) this).aClass277_4140 != null)
						((Atmosphere) this).aClass277_4140.method2583((int) (f * 255.0F), 255, 398258366);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.b(").append(')').toString());
		}
	}

	public void decodeGeneric(RsByteBuffer class298_sub53, Class364 class364, short i) {
		try {
			int i_3_ = class298_sub53.readUnsignedByte();
			if (Class422_Sub25.preferences.aClass422_Sub15_7560.method5684(-1934130167) == 1 && FloorOverlay.graphics.method5048() > 0) {
				if (0 != (i_3_ & 0x1))
					((Atmosphere) this).sunColor = class298_sub53.readInt((byte) 33) * 743535251;
				else
					((Atmosphere) this).sunColor = -980012211 * Class364.anInt3952;
				if ((i_3_ & 0x2) != 0)
					((Atmosphere) this).sunShineness = ((float) class298_sub53.readUnsignedShort() / 256.0F);
				else
					((Atmosphere) this).sunShineness = 1.1523438F;
				if (0 != (i_3_ & 0x4))
					((Atmosphere) this).sunX = ((float) class298_sub53.readUnsignedShort() / 256.0F);
				else
					((Atmosphere) this).sunX = 0.69921875F;
				if (0 != (i_3_ & 0x8))
					((Atmosphere) this).sunY = ((float) class298_sub53.readUnsignedShort() / 256.0F);
				else
					((Atmosphere) this).sunY = 1.2F;
			} else {
				if ((i_3_ & 0x1) != 0)
					class298_sub53.readInt((byte) 50);
				if ((i_3_ & 0x2) != 0)
					class298_sub53.readUnsignedShort();
				if ((i_3_ & 0x4) != 0)
					class298_sub53.readUnsignedShort();
				if ((i_3_ & 0x8) != 0)
					class298_sub53.readUnsignedShort();
				((Atmosphere) this).sunColor = Class364.anInt3952 * -980012211;
				((Atmosphere) this).sunY = 1.2F;
				((Atmosphere) this).sunX = 0.69921875F;
				((Atmosphere) this).sunShineness = 1.1523438F;
			}
			if ((i_3_ & 0x10) != 0)
				((Atmosphere) this).aClass217_4129 = SceneObjectPosition.method2004((float) class298_sub53.readShort(2126608204), (float) class298_sub53.readShort(1708860776), (float) class298_sub53.readShort(1771057202));
			else
				((Atmosphere) this).aClass217_4129 = SceneObjectPosition.method2004(-50.0F, -60.0F, -50.0F);
			if ((i_3_ & 0x20) != 0) {
				((Atmosphere) this).skyColor = class298_sub53.readInt((byte) 9) * -316996499;
			} else
				((Atmosphere) this).skyColor = Class364.DEFAULT_SKY_COLOR * 1359380751;
			if (0 != (i_3_ & 0x40))
				((Atmosphere) this).anInt4135 = class298_sub53.readUnsignedShort() * 1820271565;
			else
				((Atmosphere) this).anInt4135 = 0;
			if (0 != (i_3_ & 0x80)) {
				int i_4_ = class298_sub53.readUnsignedShort();
				int i_5_ = class298_sub53.readUnsignedShort();
				int i_6_ = class298_sub53.readUnsignedShort();
				int i_7_ = class298_sub53.readUnsignedShort();
				int i_8_ = class298_sub53.readUnsignedShort();
				int i_9_ = class298_sub53.readUnsignedShort();
				((Atmosphere) this).aClass66_4136 = class364.method4329(i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, 257018874);
			} else
				((Atmosphere) this).aClass66_4136 = Class82_Sub12.aClass66_6864;
			
			
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.p(").append(')').toString());
		}
	}

	public void method4707(RsByteBuffer class298_sub53, int i) {
		try {
			((Atmosphere) this).aFloat4139 = (float) (class298_sub53.readUnsignedByte() * 8) / 255.0F;
			((Atmosphere) this).aFloat4138 = (float) (class298_sub53.readUnsignedByte() * 8) / 255.0F;
			((Atmosphere) this).aFloat4132 = ((float) (class298_sub53.readUnsignedByte() * 8) / 255.0F);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.i(").append(')').toString());
		}
	}

	public Atmosphere() {
		setDefault((byte) 115);
	}

	boolean method4708(Atmosphere class385_10_, int i) {
		try {
			return ((-1951302757 * ((Atmosphere) class385_10_).sunColor == ((Atmosphere) this).sunColor * -1951302757) && (((Atmosphere) this).sunShineness == ((Atmosphere) class385_10_).sunShineness) && (((Atmosphere) class385_10_).sunX == ((Atmosphere) this).sunX) && (((Atmosphere) class385_10_).sunY == ((Atmosphere) this).sunY) && (((Atmosphere) class385_10_).aFloat4138 == ((Atmosphere) this).aFloat4138) && (((Atmosphere) this).aFloat4139 == ((Atmosphere) class385_10_).aFloat4139) && (((Atmosphere) class385_10_).aFloat4132 == ((Atmosphere) this).aFloat4132) && (-1269717659 * ((Atmosphere) this).skyColor == ((Atmosphere) class385_10_).skyColor * -1269717659) && (((Atmosphere) class385_10_).anInt4135 * -1939701499 == ((Atmosphere) this).anInt4135 * -1939701499) && (((Atmosphere) class385_10_).aClass66_4136 == ((Atmosphere) this).aClass66_4136) && (((Atmosphere) class385_10_).aClass277_4140 == ((Atmosphere) this).aClass277_4140));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.d(").append(')').toString());
		}
	}

	public int method4709(int i) {
		try {
			return -1269717659 * ((Atmosphere) this).skyColor;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.u(").append(')').toString());
		}
	}

	public Class277 method4710(byte i) {
		try {
			return ((Atmosphere) this).aClass277_4140;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.x(").append(')').toString());
		}
	}

	void setDefault(byte i) {
		try {
			((Atmosphere) this).sunColor = Class364.anInt3952 * -980012211;
			((Atmosphere) this).aClass217_4129 = SceneObjectPosition.method2004(-50.0F, -60.0F, -50.0F);
			((Atmosphere) this).sunShineness = 1.1523438F;
			((Atmosphere) this).sunX = 0.69921875F;
			((Atmosphere) this).sunY = 1.2F;
			((Atmosphere) this).skyColor = Class364.DEFAULT_SKY_COLOR * 1359380751;
			((Atmosphere) this).anInt4135 = 0;
			((Atmosphere) this).aClass66_4136 = Class82_Sub12.aClass66_6864;
			((Atmosphere) this).aFloat4139 = 1.0F;
			((Atmosphere) this).aFloat4138 = 0.25F;
			((Atmosphere) this).aFloat4132 = 1.0F;
			((Atmosphere) this).aClass277_4140 = Class254.aClass277_2789;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.a(").append(')').toString());
		}
	}

	public void method4712(RsByteBuffer class298_sub53, Class364 class364, byte i) {
		try {
			int i_11_ = class298_sub53.readUnsignedShort();
			int i_12_ = class298_sub53.readShort(2107553233);
			int i_13_ = class298_sub53.readShort(1662518170);
			int i_14_ = class298_sub53.readShort(2045049677);
			int i_15_ = class298_sub53.readUnsignedShort();
			Class163.anInt1685 = 1827318333 * i_15_;
			((Atmosphere) this).aClass277_4140 = class364.method4328(i_11_, i_12_, i_13_, i_14_, (short) -3311);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.k(").append(')').toString());
		}
	}

	static final void method4713(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.aByte8959;
			if (client.aByte8959 != -1)
				client.aByte8959 = (byte) -6;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.abk(").append(')').toString());
		}
	}

	public static void method4714(int i) {
		try {
			if (IcmpService_Sub1.anIcmpService_Sub1_8551 != null) {
				try {
					IcmpService_Sub1.anIcmpService_Sub1_8551.quit();
				} catch (Throwable throwable) {
					/* empty */
				}
				IcmpService_Sub1.anIcmpService_Sub1_8551 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.d(").append(')').toString());
		}
	}

	static final void method4715(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5241 -= 969361751;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.aj(").append(')').toString());
		}
	}

	public static Class343_Sub1 method4716(byte i) {
		try {
			Class474.anInt5977 = 0;
			return Class365_Sub1_Sub5_Sub2.method4537(-1079868050);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.i(").append(')').toString());
		}
	}
}
