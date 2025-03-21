/* Class152 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Class152 implements Runnable {
	Class171[] aClass171Array1626;
	Thread aThread1627;
	volatile boolean aBoolean1628;
	public static String aString1629;
	static Class8 aClass8_1630;

	Class171 method1782(int i, int i_0_) {
		try {
			if (null == ((Class152) this).aClass171Array1626 || i < 0 || i >= ((Class152) this).aClass171Array1626.length)
				return null;
			return ((Class152) this).aClass171Array1626[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ge.r(").append(')').toString());
		}
	}

	public void run() {
		try {
			try {
				int i = (Class404.aClass457_4162 == Class457.aClass457_6834 ? 80 : (7000 + -115752509 * Class507.aClass498_5932.anInt5889));
				BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(new DataInputStream(new URL(new StringBuilder().append("http://").append(Class507.aClass498_5932.aString5886).append(":").append(i).append("/news.ws?game=").append(-1358018753 * (client.aClass435_9146.anInt4417)).toString()).openStream()))));
				String string = bufferedreader.readLine();
				ArrayList arraylist = new ArrayList();
				for (/**/; string != null; string = bufferedreader.readLine())
					arraylist.add(string);
				String[] strings = new String[arraylist.size()];
				arraylist.toArray(strings);
				if (strings.length % 3 != 0)
					return;
				((Class152) this).aClass171Array1626 = new Class171[strings.length / 3];
				for (int i_1_ = 0; i_1_ < strings.length; i_1_ += 3)
					((Class152) this).aClass171Array1626[i_1_ / 3] = new Class171(strings[i_1_], strings[1 + i_1_], strings[i_1_ + 2]);
			} catch (IOException ioexception) {
				/* empty */
			}
			((Class152) this).aBoolean1628 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ge.run(").append(')').toString());
		}
	}

	Class152() {
		/* empty */
	}

	boolean method1783(byte i) {
		try {
			if (((Class152) this).aBoolean1628)
				return true;
			if (((Class152) this).aThread1627 == null) {
				((Class152) this).aThread1627 = new Thread(this);
				((Class152) this).aThread1627.start();
			}
			return ((Class152) this).aBoolean1628;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ge.j(").append(')').toString());
		}
	}

	static final void method1784(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, byte i) {
		try {
			iComponentDefinitions.anInt1238 = 743404989;
			iComponentDefinitions.anInt1239 = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) * -1266970459;
			Class404.method4738(iComponentDefinitions, 1288744543);
			if (-790144721 * iComponentDefinitions.anInt1287 == -1 && !class120.aBoolean1402)
				Class70.method822(iComponentDefinitions.anInt1196 * 751119487, -1410831977);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ge.di(").append(')').toString());
		}
	}

	static final void method1785(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class363.method4259(iComponentDefinitions, class120, class430, (byte) 25);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ge.jk(").append(')').toString());
		}
	}

	static final void method1786(Class430 class430, byte i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = ((Class430) class430).aClass154_4391.anIntArray1652[i_2_];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ge.ya(").append(')').toString());
		}
	}

	static final void method1787(Class430 class430, byte i) {
		try {
			int i_3_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_3_, 1463804573);
			Class120 class120 = Class3.aClass120Array56[i_3_ >> 16];
			Class439.method5599(iComponentDefinitions, class120, true, 2, class430, (byte) 70);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ge.hs(").append(')').toString());
		}
	}

	static final void method1788(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			iComponentDefinitions.aStringArray1284 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ge.jj(").append(')').toString());
		}
	}

	static final void method1789(Class430 class430, int i) {
		try {
			int i_4_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class2.aClass523_44.method6233(i_4_, 2087882064).method3455(1839779665);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ge.adq(").append(')').toString());
		}
	}

	public static void method1790(int i, int i_5_) {
		try {
			if (i != -1 && !Class382.aBooleanArray6678[i]) {
				Class330_Sub12_Sub9.aClass280_9534.removeFromStore(i, (byte) -78);
				Class3.aClass120Array56[i] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ge.f(").append(')').toString());
		}
	}
}
