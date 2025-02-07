

public class Class349 {
	CachingHashMap aClass348_3706 = new CachingHashMap(64);
	Class405 aClass405_3707;
	public static StanceConfig aClass350_3708 = new StanceConfig();
	CacheIndex aClass243_3709;

	public void method4199(int i) {
		try {
			synchronized (((Class349) this).aClass348_3706) {
				((Class349) this).aClass348_3706.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oo.f(").append(')').toString());
		}
	}

	public void method4200(int i, byte i_0_) {
		try {
			synchronized (((Class349) this).aClass348_3706) {
				((Class349) this).aClass348_3706.method4186(i, 88605032);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oo.b(").append(')').toString());
		}
	}

	public void method4201(byte i) {
		try {
			synchronized (((Class349) this).aClass348_3706) {
				((Class349) this).aClass348_3706.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oo.p(").append(')').toString());
		}
	}
	
	private void createCustomStance(StanceConfig config, int id) {
		switch (id) { //id under 20k
		case 19999:
			config.standAnimation = 808  * -512849763; //27518
			config.walkAnimation = 27520  * -1216995793;
			config.runAnimation = 27519 * -1261244237;
			break;
		case 19998:
			config.standAnimation = 1836  * -512849763; //27518
			config.walkAnimation = 1836  * -1216995793;
			config.runAnimation = 1836 * -1261244237;
			break;
		}
	}

	public void createStance(StanceConfig config, NPCConfig npc) {
		config.standAnimation = npc.standAnimation  * -512849763;
		config.walkAnimation = npc.walkAnimation  * -1216995793;
		
		System.out.println("emotes :"+npc.standAnimation+", "+npc.walkAnimation);
		
	}
	
	public StanceConfig method4202(int i, byte i_1_) {
		try {
			StanceConfig class350;
			synchronized (((Class349) this).aClass348_3706) {
				class350 = (StanceConfig) ((Class349) this).aClass348_3706.get((long) i);
			}
			if (class350 != null)
				return class350;
			byte[] is;
			synchronized (((Class349) this).aClass243_3709) {
				is = (((Class349) this).aClass243_3709.getFileFromArchive(-1006924897 * ConfigFile.aClass120_1437.anInt1460, i, (byte) -42));
			}
			class350 = new StanceConfig();
			((StanceConfig) class350).loader = this;
			if (null != is)
				class350.decode(new RsByteBuffer(is), 162499609);
			
			if (i >= Settings.NPC_STANCE_OFFSET) {
				int npcID = i - Settings.NPC_STANCE_OFFSET;
				System.out.println("id :"+npcID);
				createStance(class350, Class15.aClass507_224.method6269(npcID, 0));
			}
			createCustomStance(class350, i);
			
			synchronized (((Class349) this).aClass348_3706) {
				((Class349) this).aClass348_3706.method4194(class350, (long) i);
			}
			return class350;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oo.a(").append(')').toString());
		}
	}

	public Class349(Class411 class411, Class429 class429, CacheIndex class243, Class405 class405) {
		((Class349) this).aClass243_3709 = class243;
		((Class349) this).aClass243_3709.method2316((-1006924897 * (ConfigFile.aClass120_1437.anInt1460)), -994427694);
		((Class349) this).aClass405_3707 = class405;
	}

	static final void method4203(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (((ClientScript2) class403).aClass298_Sub25_5237.anInt7356 * 649879491);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oo.xp(").append(')').toString());
		}
	}

	static final void method4204(ClientScript2 class403, byte i) {
		try {
			Class422_Sub25.preferences.method3540(Class422_Sub25.preferences.aClass422_Sub29_7583, (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]), 951880368);
			Class3.savePreferences(656179282);
			client.sentPreferences = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oo.aiy(").append(')').toString());
		}
	}

	static final void method4205(ClientScript2 class403, short i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_2_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_3_ = (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]);
			if (Class452.fullScreen) {
				Class357.method4276(3, i_2_, i_3_, false, -1076746695);
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = null != Class231.fullScreenFrame ? 1 : 0;
			} else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oo.aed(").append(')').toString());
		}
	}
}
