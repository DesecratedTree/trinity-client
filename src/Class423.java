/* Class423 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;

import jaclib.ping.Ping;

public class Class423 implements Runnable {
	Thread aThread4323;
	Object anObject4324 = new Object();
	Queue aQueue4325 = new LinkedList();

	public Class422 method5298(String string, int i) {
		try {
			if (((Class423) this).aThread4323 == null)
				throw new IllegalStateException("");
			if (null == string)
				throw new IllegalArgumentException("");
			Class422 class422 = new Class422(string);
			method5300(class422, 927494319);
			return class422;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rp.r(").append(')').toString());
		}
	}

	public void method5299(int i) {
		try {
			if (null != ((Class423) this).aThread4323) {
				method5300(((Class423) this).anObject4324, -1886794477);
				try {
					((Class423) this).aThread4323.join();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
				((Class423) this).aThread4323 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rp.j(").append(')').toString());
		}
	}

	void method5300(Object object, int i) {
		try {
			synchronized (((Class423) this).aQueue4325) {
				((Class423) this).aQueue4325.add(object);
				((Class423) this).aQueue4325.notify();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rp.i(").append(')').toString());
		}
	}

	public Class423() {
		((Class423) this).aThread4323 = new Thread(this);
		((Class423) this).aThread4323.setDaemon(true);
		((Class423) this).aThread4323.start();
	}

	public void run() {
		try {
			for (;;) {
				Class422 class422;
				synchronized (((Class423) this).aQueue4325) {
					Object object;
					for (object = ((Class423) this).aQueue4325.poll(); null == object; object = ((Class423) this).aQueue4325.poll()) {
						try {
							((Class423) this).aQueue4325.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
					if (object == ((Class423) this).anObject4324)
						break;
					class422 = (Class422) object;
				}
				int i;
				try {
					byte[] is = InetAddress.getByName(((Class422) class422).aString4320).getAddress();
					i = Ping.r(is[0], is[1], is[2], is[3], 1000L);
				} catch (Throwable throwable) {
					i = 1000;
				}
				class422.anInt4319 = -1427366157 * i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rp.run(").append(')').toString());
		}
	}

	public static void method5301(int i) {
		try {
			Class96.aShort865 = client.aShort9249;
			Class13.aShort175 = client.aShort8965;
			Class96.aShort859 = client.aShort9191;
			Class139.aShort1535 = client.aShort9203;
			Class96.aBoolean861 = true;
			Class96.anInt864 = -146369757 * Class333.musicId;
			if (0 != Class96.anInt860 * -67175071 && Class96.anInt863 * -15785987 != 0) {
				client.aShort9191 = (short) 334;
				client.aShort9203 = (short) 334;
				client.aShort8965 = client.aShort9249 = (short) (Class96.anInt860 * -33897984 / (-15785987 * Class96.anInt863));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rp.p(").append(')').toString());
		}
	}

	public static final Class330_Sub48 method5302(int i, Class330_Sub48 class330_sub48, int[] is, boolean bool, short i_0_) {
		try {
			Class330_Sub48 class330_sub48_1_ = (Class330_Sub48) client.aClass497_9284.method6094((long) i);
			if (class330_sub48_1_ != null)
				Class75.method854(class330_sub48_1_, (856598855 * class330_sub48.anInt7859 != class330_sub48_1_.anInt7859 * 856598855), bool, -875833488);
			client.aClass497_9284.method6097(class330_sub48, (long) i);
			Class441.method5610(class330_sub48.anInt7859 * 856598855, is, (byte) 6);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i, 94873876);
			if (null != iComponentDefinitions)
				Class404.method4738(iComponentDefinitions, 1825261932);
			if (client.aClass114_9078 != null) {
				Class404.method4738(client.aClass114_9078, 1190397429);
				client.aClass114_9078 = null;
			}
			Class70.method818(-239640105);
			if (null != iComponentDefinitions)
				Class156.method1829((Class3.aClass120Array56[751119487 * iComponentDefinitions.anInt1196 >>> 16]), iComponentDefinitions, !bool, 1339530533);
			if (!bool)
				Class460.method5692(class330_sub48.anInt7859 * 856598855, is, 344267282);
			if (!bool && client.windowPaneId * 1522181389 != -1)
				Class527.method6268(1522181389 * client.windowPaneId, 1, (byte) 49);
			return class330_sub48;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rp.lm(").append(')').toString());
		}
	}

	public static int method5303(int i, int i_2_, boolean bool, int i_3_) {
		try {
			Class330_Sub1 class330_sub1 = Class321.method3178(i, bool, (short) 25832);
			if (class330_sub1 == null)
				return -1;
			if (i_2_ < 0 || i_2_ >= (((Class330_Sub1) class330_sub1).anIntArray7500).length)
				return -1;
			return ((Class330_Sub1) class330_sub1).anIntArray7500[i_2_];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rp.r(").append(')').toString());
		}
	}

	static final void method5304(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class281.method2789(iComponentDefinitions, class120, class430, 878662689);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rp.fq(").append(')').toString());
		}
	}
}
