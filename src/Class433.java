/* Class433 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class433 {
	Object[] anObjectArray4410;
	int anInt4411 = -458958079;
	int[] anIntArray4412;
	ClientScript aClass330_Sub36_Sub8_4413;
	long[] aLongArray4414;

	Class433() {
		/* empty */
	}

	static final void method5556(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= -1140096999;
			int i_0_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_1_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			int i_2_ = (((Class430) class430).anIntArray4387[2 + ((Class430) class430).anInt4376 * 1632830751]);
			int i_3_ = (((Class430) class430).anIntArray4387[3 + 1632830751 * ((Class430) class430).anInt4376]);
			int i_4_ = (((Class430) class430).anIntArray4387[4 + 1632830751 * ((Class430) class430).anInt4376]);
			boolean bool = 1 == (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 5]);
			int i_5_ = (((Class430) class430).anIntArray4387[6 + 1632830751 * ((Class430) class430).anInt4376]);
			if (Class401_Sub1.aClass145_Sub1_8249.method1693(756367168) != Class136.aClass136_1523)
				throw new RuntimeException();
			Class166_Sub2 class166_sub2 = ((Class166_Sub2) Class401_Sub1.aClass145_Sub1_8249.method1707(1672742978));
			Class244 class244 = new Class244();
			Class244 class244_6_ = new Class244();
			class244.method2427(0.0F, 1.0F, 0.0F, (float) (2.0 * ((double) i_4_ * 3.141592653589793) / 16384.0));
			Class260 class260 = new Class260(1.0F, 0.0F, 0.0F);
			class260.method2570(class244);
			class260.method2556();
			class244_6_.method2425(class260, (float) ((double) i_3_ * 3.141592653589793 * 2.0 / 16384.0));
			class244.method2429(class244_6_);
			Player class432_sub1_sub1_sub1_sub1 = Class263_Sub2.myPlayer;
			if (null != class432_sub1_sub1_sub1_sub1)
				class166_sub2.method2003(class432_sub1_sub1_sub1_sub1, new Class260((float) i_0_, (float) i_1_, (float) i_2_), class244, bool, i_5_, client.aClass304_9030.method2996((Class85.anInt712 * -127654579), 1875135057), (client.aClass304_9030.method3001((byte) 106).anIntArrayArrayArray2793), (short) 255);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rz.ahn(").append(')').toString());
		}
	}

	public static Object method5557(byte[] is, boolean bool, byte i) {
		try {
			if (null == is)
				return null;
			if (is.length > 136) {
				ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
				bytebuffer.position(0);
				bytebuffer.put(is);
				return bytebuffer;
			}
			if (bool)
				return Arrays.copyOf(is, is.length);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rz.r(").append(')').toString());
		}
	}

	static final void method5558(Class430 class430, byte i) {
		try {
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = (((Class430) class430).anObjectArray4375[(((Class430) class430).anIntArray4394[((Class430) class430).anInt4397 * -54918871])]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rz.aq(").append(')').toString());
		}
	}

	public static boolean method5559(int i) {
		try {
			do {
				boolean bool;
				try {
					if (IcmpService_Sub1.available())
						break;
					bool = false;
				} catch (Throwable throwable) {
					return false;
				}
				return bool;
			} while (false);
			if (Class509.anIcmpService_Sub1_5947 != null)
				throw new IllegalStateException("");
			Class509.anIcmpService_Sub1_5947 = new IcmpService_Sub1();
			Thread thread = new Thread(new Class431());
			thread.setDaemon(true);
			thread.start();
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rz.o(").append(')').toString());
		}
	}

	public static void method5560(IndexTable class280, Interface_ma interface_ma, int i) {
		try {
			Class126_Sub2.aClass280_7229 = class280;
			Class209.anInterface_ma1984 = interface_ma;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rz.r(").append(')').toString());
		}
	}

	public static final IComponentDefinitions method5561(Class120 class120, IComponentDefinitions iComponentDefinitions, int i) {
		try {
			if (-1 != 861085587 * iComponentDefinitions.anInt1211)
				return class120.method1440(861085587 * iComponentDefinitions.anInt1211, (byte) -22);
			if (!class120.aBoolean1402) {
				int i_7_ = iComponentDefinitions.anInt1196 * 751119487 >>> 16;
				Class508 class508 = new Class508(client.aClass497_9284);
				for (Class330_Sub48 class330_sub48 = (Class330_Sub48) class508.method6156(257803485); class330_sub48 != null; class330_sub48 = (Class330_Sub48) class508.next()) {
					if (i_7_ == 856598855 * class330_sub48.anInt7859)
						return (Class95.method1101((int) (class330_sub48.aLong3341 * -6154793640677333111L), 1095712662));
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rz.ko(").append(')').toString());
		}
	}

	static final void method5562(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (Class354.aClass330_Sub36_Sub12_3497 != null ? (-1647784587 * Class354.aClass330_Sub36_Sub12_3497.anInt9708) : -1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rz.afa(").append(')').toString());
		}
	}
}
