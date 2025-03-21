/* Class345 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.io.OutputStream;

public class Class345 implements Runnable {
	boolean aBoolean3411;
	OutputStream anOutputStream3412;
	Thread aThread3413;
	byte[] aByteArray3414;
	int anInt3415 = 0;
	int anInt3416 = 0;
	IOException anIOException3417;
	int anInt3418;

	void method4004(int i) {
		try {
			synchronized (this) {
				((Class345) this).aBoolean3411 = true;
				this.notifyAll();
			}
			try {
				((Class345) this).aThread3413.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oj.i(").append(')').toString());
		}
	}

	public void run() {
		try {
			do {
				int i;
				synchronized (this) {
					for (;;) {
						if (null != ((Class345) this).anIOException3417)
							return;
						if (((Class345) this).anInt3415 * -110623021 <= 1987427969 * ((Class345) this).anInt3416)
							i = (1987427969 * ((Class345) this).anInt3416 - ((Class345) this).anInt3415 * -110623021);
						else
							i = (378002199 * ((Class345) this).anInt3418 - ((Class345) this).anInt3415 * -110623021 + ((Class345) this).anInt3416 * 1987427969);
						if (i > 0)
							break;
						try {
							((Class345) this).anOutputStream3412.flush();
						} catch (IOException ioexception) {
							((Class345) this).anIOException3417 = ioexception;
							return;
						}
						if (method4007(-2024573179))
							return;
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				try {
					if (((Class345) this).anInt3415 * -110623021 + i <= ((Class345) this).anInt3418 * 378002199)
						((Class345) this).anOutputStream3412.write(((Class345) this).aByteArray3414, ((Class345) this).anInt3415 * -110623021, i);
					else {
						int i_0_ = (((Class345) this).anInt3418 * 378002199 - -110623021 * ((Class345) this).anInt3415);
						((Class345) this).anOutputStream3412.write(((Class345) this).aByteArray3414, -110623021 * ((Class345) this).anInt3415, i_0_);
						((Class345) this).anOutputStream3412.write(((Class345) this).aByteArray3414, 0, i - i_0_);
					}
				} catch (IOException ioexception) {
					synchronized (this) {
						((Class345) this).anIOException3417 = ioexception;
						break;
					}
				}
				synchronized (this) {
					((Class345) this).anInt3415 = (2119057755 * ((-110623021 * ((Class345) this).anInt3415 + i) % (378002199 * ((Class345) this).anInt3418)));
				}
			} while (!method4007(-1464936691));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oj.run(").append(')').toString());
		}
	}

	Class345(OutputStream outputstream, int i) {
		((Class345) this).anOutputStream3412 = outputstream;
		((Class345) this).anInt3418 = 1050479783 * (1 + i);
		((Class345) this).aByteArray3414 = new byte[378002199 * ((Class345) this).anInt3418];
		((Class345) this).aThread3413 = new Thread(this);
		((Class345) this).aThread3413.setDaemon(true);
		((Class345) this).aThread3413.start();
	}

	void method4005(int i) {
		try {
			((Class345) this).anOutputStream3412 = new OutputStream_Sub1();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oj.p(").append(')').toString());
		}
	}

	void method4006(byte[] is, int i, int i_1_, byte i_2_) throws IOException {
		try {
			if (i_1_ < 0 || i < 0 || i_1_ + i > is.length)
				throw new IOException();
			synchronized (this) {
				if (((Class345) this).anIOException3417 != null)
					throw new IOException(((Class345) this).anIOException3417.toString());
				int i_3_;
				if (((Class345) this).anInt3415 * -110623021 <= ((Class345) this).anInt3416 * 1987427969)
					i_3_ = (((Class345) this).anInt3418 * 378002199 - ((Class345) this).anInt3416 * 1987427969 + ((Class345) this).anInt3415 * -110623021 - 1);
				else
					i_3_ = (((Class345) this).anInt3415 * -110623021 - ((Class345) this).anInt3416 * 1987427969 - 1);
				if (i_3_ < i_1_)
					throw new IOException("");
				if (i_1_ + ((Class345) this).anInt3416 * 1987427969 <= 378002199 * ((Class345) this).anInt3418)
					System.arraycopy(is, i, ((Class345) this).aByteArray3414, 1987427969 * ((Class345) this).anInt3416, i_1_);
				else {
					int i_4_ = (((Class345) this).anInt3418 * 378002199 - ((Class345) this).anInt3416 * 1987427969);
					System.arraycopy(is, i, ((Class345) this).aByteArray3414, ((Class345) this).anInt3416 * 1987427969, i_4_);
					System.arraycopy(is, i_4_ + i, ((Class345) this).aByteArray3414, 0, i_1_ - i_4_);
				}
				((Class345) this).anInt3416 = (2074902913 * ((i_1_ + ((Class345) this).anInt3416 * 1987427969) % (378002199 * ((Class345) this).anInt3418)));
				this.notifyAll();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oj.j(").append(')').toString());
		}
	}

	boolean method4007(int i) {
		try {
			if (((Class345) this).aBoolean3411) {
				try {
					((Class345) this).anOutputStream3412.close();
					if (((Class345) this).anIOException3417 == null)
						((Class345) this).anIOException3417 = new IOException("");
				} catch (IOException ioexception) {
					if (((Class345) this).anIOException3417 == null)
						((Class345) this).anIOException3417 = new IOException(ioexception);
				}
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oj.r(").append(')').toString());
		}
	}

	static final void method4008(Class430 class430, int i) {
		try {
			String string = "";
			if (Class391.aClipboard4063 != null) {
				Transferable transferable = Class391.aClipboard4063.getContents(null);
				if (transferable != null) {
					try {
						string = ((String) transferable.getTransferData(DataFlavor.stringFlavor));
						if (string == null)
							string = "";
					} catch (Exception exception) {
						/* empty */
					}
				}
			}
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oj.agg(").append(')').toString());
		}
	}

	static void method4009(Class_ra class_ra, int i) {
		try {
			int i_5_ = -10660793;
			Class436.method5576(class_ra, Class89.anInt736 * 1574464115, Class85.anInt713 * 1798024257, Class550.anInt6288 * 1151799299, 691561767 * Class406.anInt4194, i_5_, -16777216, (byte) -76);
			Class166_Sub3_Sub2.aClass263_9483.method2594(Class526.aClass526_6062.method6257(Class429.aClass454_4369, 991479434), 3 + 1574464115 * Class89.anInt736, Class85.anInt713 * 1798024257 + 14, i_5_, -1, 1330171679);
			int i_6_ = Class464_Sub23.aClass350_8712.method4030(34823472);
			int i_7_ = Class464_Sub23.aClass350_8712.method4031((short) 28704);
			if (!Class484.aBoolean5783) {
				int i_8_ = 0;
				for (Class330_Sub36_Sub10 class330_sub36_sub10 = ((Class330_Sub36_Sub10) Class484.aClass471_5791.method5869(539664854)); null != class330_sub36_sub10; class330_sub36_sub10 = ((Class330_Sub36_Sub10) Class484.aClass471_5791.method5873((byte) -87))) {
					int i_9_ = (31 + 1798024257 * Class85.anInt713 + ((-2008486989 * Class484.anInt5786 - 1 - i_8_) * (Class484.anInt5779 * 1764744137)));
					Class330_Sub36_Sub5.method3462(i_6_, i_7_, 1574464115 * Class89.anInt736, Class85.anInt713 * 1798024257, 1151799299 * Class550.anInt6288, Class406.anInt4194 * 691561767, i_9_, class330_sub36_sub10, Class166_Sub3_Sub2.aClass263_9483, Class477_Sub1.aClass524_8749, -1, -256, -1690337276);
					i_8_++;
				}
			} else {
				int i_10_ = 0;
				for (Class330_Sub36_Sub13 class330_sub36_sub13 = ((Class330_Sub36_Sub13) Class484.aClass472_5793.method5884((byte) 72)); class330_sub36_sub13 != null; class330_sub36_sub13 = ((Class330_Sub36_Sub13) Class484.aClass472_5793.method5886((short) 8192))) {
					int i_11_ = (1764744137 * Class484.anInt5779 * i_10_ + (31 + 1798024257 * Class85.anInt713));
					if (1 == -213703795 * ((Class330_Sub36_Sub13) class330_sub36_sub13).anInt9715)
						Class330_Sub36_Sub5.method3462(i_6_, i_7_, Class89.anInt736 * 1574464115, 1798024257 * Class85.anInt713, Class550.anInt6288 * 1151799299, 691561767 * Class406.anInt4194, i_11_, ((Class330_Sub36_Sub10) (((Class330_Sub36_Sub13) class330_sub36_sub13).aClass472_9716.aClass330_Sub36_5613.aClass330_Sub36_7735)), Class166_Sub3_Sub2.aClass263_9483, Class477_Sub1.aClass524_8749, -1, -256, -863786004);
					else
						Class392.method4613(i_6_, i_7_, 1574464115 * Class89.anInt736, Class85.anInt713 * 1798024257, Class550.anInt6288 * 1151799299, Class406.anInt4194 * 691561767, i_11_, class330_sub36_sub13, Class166_Sub3_Sub2.aClass263_9483, Class477_Sub1.aClass524_8749, -1, -256, 337718199);
					i_10_++;
				}
				if (Class484.aClass330_Sub36_Sub13_5784 != null) {
					Class436.method5576(class_ra, Class62.anInt561 * -165713069, Class246.anInt6586 * 1131870491, Class116.anInt1374 * 1702380591, -37503925 * Class95_Sub13.anInt7181, i_5_, -16777216, (byte) 0);
					Class166_Sub3_Sub2.aClass263_9483.method2594(((Class330_Sub36_Sub13) Class484.aClass330_Sub36_Sub13_5784).aString9717, 3 + Class62.anInt561 * -165713069, 1131870491 * Class246.anInt6586 + 14, i_5_, -1, -287485124);
					i_10_ = 0;
					for (Class330_Sub36_Sub10 class330_sub36_sub10 = ((Class330_Sub36_Sub10) ((Class330_Sub36_Sub13) Class484.aClass330_Sub36_Sub13_5784).aClass472_9716.method5884((byte) 124)); class330_sub36_sub10 != null; class330_sub36_sub10 = ((Class330_Sub36_Sub10) ((Class330_Sub36_Sub13) Class484.aClass330_Sub36_Sub13_5784).aClass472_9716.method5886((short) 8192))) {
						int i_12_ = (31 + 1131870491 * Class246.anInt6586 + i_10_ * (Class484.anInt5779 * 1764744137));
						Class330_Sub36_Sub5.method3462(i_6_, i_7_, -165713069 * Class62.anInt561, Class246.anInt6586 * 1131870491, 1702380591 * Class116.anInt1374, Class95_Sub13.anInt7181 * -37503925, i_12_, class330_sub36_sub10, Class166_Sub3_Sub2.aClass263_9483, Class477_Sub1.aClass524_8749, -1, -256, -1478355531);
						i_10_++;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oj.au(").append(')').toString());
		}
	}

	static void method4010(int i, int i_13_, int i_14_) {
		try {
			if (1 == 1628070505 * Class484.anInt5816)
				Class243.method2413(Class79.aClass330_Sub36_Sub10_667, i, i_13_, (byte) -24);
			else if (Class484.anInt5816 * 1628070505 == 2)
				Class330.method3258(i, i_13_, 957698344);
			Class484.anInt5816 = 0;
			Class79.aClass330_Sub36_Sub10_667 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oj.z(").append(')').toString());
		}
	}

	public static int method4011(int i, boolean bool, int i_15_) {
		try {
			if (bool)
				return 0;
			Class330_Sub1 class330_sub1 = Class321.method3178(i, bool, (short) 26739);
			if (null == class330_sub1)
				return ((OutgoingPacket.aClass534_2580.method6305(i, (byte) 120).anInt9290) * 445679805);
			int i_16_ = 0;
			for (int i_17_ = 0; i_17_ < ((Class330_Sub1) class330_sub1).anIntArray7500.length; i_17_++) {
				if (-1 == ((Class330_Sub1) class330_sub1).anIntArray7500[i_17_])
					i_16_++;
			}
			i_16_ += ((OutgoingPacket.aClass534_2580.method6305(i, (byte) 34).anInt9290 * 445679805) - ((Class330_Sub1) class330_sub1).anIntArray7500.length);
			return i_16_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oj.o(").append(')').toString());
		}
	}

	public static void method4012(Class549_Sub1 class549_sub1, short i) {
		try {
			Class128.method1551(class549_sub1, -8248891);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oj.r(").append(')').toString());
		}
	}

	static final void method4013(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Exception_Sub2.method343(212104928);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oj.alz(").append(')').toString());
		}
	}
}
