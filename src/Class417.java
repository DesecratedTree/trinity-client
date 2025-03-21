/* Class417 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class Class417 {
	public int anInt4272;
	public int anInt4273 = 570725924;
	public int[] anIntArray4274 = null;
	public int[] anIntArray4275 = null;
	public boolean aBoolean4276;
	static int anInt4277 = 4;
	public int anInt4278;
	public int anInt4279;
	static int anInt4280 = 7;
	public int anInt4281;
	public int anInt4282;
	public int anInt4283;
	public int anInt4284;
	public boolean aBoolean4285;
	public short[][] aShortArrayArray4286;
	public short[][][] aShortArrayArrayArray4287;
	public boolean aBoolean4288;
	public int anInt4289;
	public int anInt4290 = 387803524;
	static int anInt4291 = 4;
	static int anInt4292 = 4;
	public int anInt4293;

	public Class417(IndexTable class280) {
		anInt4278 = -659826148;
		anInt4279 = 510033789;
		anInt4282 = -73099587;
		aBoolean4285 = true;
		aBoolean4288 = true;
		anInt4289 = -1522886358;
		aBoolean4276 = true;
		anInt4283 = 1527648897;
		anInt4281 = -870543541;
		anInt4293 = 2017118659;
		byte[] is = class280.method2761(41549091 * Class420.aClass420_4301.anInt4307, 1734979603);
		method5262(new Buffer(is), (byte) -35);
	}

	void method5262(Buffer class330_sub46, byte i) {
		try {
			boolean bool = false;
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(85719444);
				if (0 == i_0_) {
					if (i < 1)
						break;
					return;
				}
				if (i_0_ == 1) {
					if (null == anIntArray4274) {
						anInt4273 = 570725924;
						anIntArray4274 = new int[4];
						anIntArray4275 = new int[4];
					}
					for (int i_1_ = 0; i_1_ < anIntArray4274.length; i_1_++) {
						anIntArray4274[i_1_] = class330_sub46.readShort(-1100583751);
						anIntArray4275[i_1_] = class330_sub46.readShort(-1100583751);
					}
					bool = true;
				} else if (2 == i_0_)
					anInt4282 = class330_sub46.readBigSmart(-1788835665) * 73099587;
				else if (3 == i_0_) {
					anInt4273 = class330_sub46.readUnsignedByte(404441697) * -931060343;
					anIntArray4274 = new int[708108473 * anInt4273];
					anIntArray4275 = new int[708108473 * anInt4273];
				} else if (4 == i_0_)
					aBoolean4285 = false;
				else if (i_0_ == 5)
					anInt4272 = class330_sub46.readUnsignedTriByte(-1401356047) * -1308832307;
				else if (i_0_ == 6)
					anInt4284 = class330_sub46.readUnsignedTriByte(-1401356047) * -1148156881;
				else if (i_0_ == 7) {
					aShortArrayArray4286 = new short[10][4];
					aShortArrayArrayArray4287 = new short[10][4][];
					for (int i_2_ = 0; i_2_ < 10; i_2_++) {
						for (int i_3_ = 0; i_3_ < 4; i_3_++) {
							int i_4_ = class330_sub46.readUnsignedShort(-293304983);
							if (i_4_ == 65535)
								i_4_ = -1;
							aShortArrayArray4286[i_2_][i_3_] = (short) i_4_;
							int i_5_ = class330_sub46.readUnsignedShort(800949737);
							aShortArrayArrayArray4287[i_2_][i_3_] = new short[i_5_];
							for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
								int i_7_ = class330_sub46.readUnsignedShort(1871490898);
								if (i_7_ == 65535)
									i_7_ = -1;
								aShortArrayArrayArray4287[i_2_][i_3_][i_6_] = (short) i_7_;
							}
						}
					}
				} else if (i_0_ == 8)
					aBoolean4288 = false;
				else if (i_0_ == 9)
					anInt4289 = class330_sub46.readUnsignedByte(1589153418) * 1386040469;
				else if (i_0_ == 10)
					aBoolean4276 = false;
				else if (i_0_ == 11)
					anInt4283 = class330_sub46.readUnsignedByte(1968251310) * 509216299;
				else if (12 == i_0_) {
					anInt4281 = class330_sub46.readUnsignedShort(73008452) * 870543541;
					anInt4293 = class330_sub46.readUnsignedShort(1532066223) * -2017118659;
				} else if (13 == i_0_)
					anInt4278 = class330_sub46.readUnsignedByte(286251521) * 908785287;
				else if (14 == i_0_)
					anInt4290 = class330_sub46.readUnsignedByte(1159722223) * 96950881;
				else if (15 == i_0_)
					anInt4279 = class330_sub46.readUnsignedByte(405436408) * 1299995483;
			}
			if (!bool) {
				if (null == anIntArray4274) {
					anInt4273 = 570725924;
					anIntArray4274 = new int[4];
					anIntArray4275 = new int[4];
				}
				for (int i_8_ = 0; i_8_ < anIntArray4274.length; i_8_++) {
					anIntArray4274[i_8_] = 0;
					anIntArray4275[i_8_] = i_8_ * 20;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ri.r(").append(')').toString());
		}
	}

	static final void method5263(Class430 class430, int i) {
		try {
			int i_9_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = (Class556.aClass510_6392.getItemDefinitions(i_9_, (byte) -101).name);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ri.aap(").append(')').toString());
		}
	}

	static final void method5264(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.anInt9264 * -451821333;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ri.acz(").append(')').toString());
		}
	}

	static final void method5265(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class363.method4260(728983736);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ri.aea(").append(')').toString());
		}
	}

	static void method5266(int i) {
		try {
			synchronized (Class459.aClass367_5566) {
				Class459.aClass367_5566.method4296(-897157363);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ri.o(").append(')').toString());
		}
	}

	static final void method5267(Class430 class430, int i) {
		try {
			int i_10_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_10_, -1001187088);
			Class120 class120 = Class3.aClass120Array56[i_10_ >> 16];
			Class439.method5599(iComponentDefinitions, class120, false, 1, class430, (byte) 31);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ri.hd(").append(')').toString());
		}
	}

	public static void method5268(Class504 class504, Frame frame, int i) {
		try {
			class504.method6139(-870737308);
			frame.setVisible(false);
			frame.dispose();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ri.i(").append(')').toString());
		}
	}
}
