/* Class332 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.nanotime.QueryPerformanceCounter;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

public abstract class Class332 implements Interface16, Runnable, FocusListener, WindowListener {
	static String aString6601 = "main_file_cache.idx";
	static long aLong6602 = 4754180109254367488L;
	public static int anInt6603 = 0;
	public static Class315 aClass315_6604;
	static int anInt6605 = 32;
	static long[] aLongArray6606 = new long[32];
	static Class489 aClass489_6607;
	static int anInt6608;
	protected static int anInt6609;
	protected static volatile boolean aBoolean6610;
	public static int anInt6611;
	public static int anInt6612;
	protected static String aString6613;
	static Class489 aClass489_6614;
	static int anInt6615;
	static long[] aLongArray6616 = new long[32];
	public static int anInt6617;
	protected static boolean aBoolean6618;
	protected static volatile boolean aBoolean6619;
	boolean aBoolean6620 = false;
	static int anInt6621 = 1048576;
	static String aString6622 = "rw";
	static String aString6623 = "main_file_cache.dat2";
	protected static Class489 aClass489_6624;
	static String aString6625 = "main_file_cache.idx255";
	static String aString6626 = "random.dat";
	static volatile long aLong6627;
	static int anInt6628 = 786432000;
	public static String aString6629;
	static int anInt6630 = 0;
	static int anInt6631 = 1;
	static Class331 aClass331_6632;
	static long aLong6633;
	static boolean aBoolean6634;
	public static int anInt6635;
	static int anInt6636;
	public static int anInt6637;
	boolean aBoolean6638 = false;
	static volatile boolean aBoolean6639;
	public static Object[] anObjectArray6640;

	public void supplyApplet(Applet applet) {
		try {
			Class293.anApplet6804 = applet;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.supplyApplet(").append(')').toString());
		}
	}

	final void method3878(Class318 class318, String string, String string_0_, int cacheIndex, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_) {
		try {
			try {
				method3892(Class331.aClass331_3344, bool, (byte) 1);
				anInt6609 = ((Class300.anInt3058 = class318.method3154(1978419644) * 944530027) * 797254155);
				Class520.anInt6017 = ((Class146.anInt1615 = class318.method3155((byte) 8) * -343519027) * -536154087);
				anInt6611 = 0;
				anInt6612 = 0;
				if (Class147.method1739((byte) -49) == Class331.aClass331_3345) {
					anInt6609 += -1377640142 * class318.method3156(1481579281);
					Class520.anInt6017 += -406837238 * class318.method3157((byte) 0);
					method3881(class318.method3153(-819003973), -1184595387);
				}
				RuntimeException_Sub2.anApplet6443 = Class293.anApplet6804;
				method3879(string, string_0_, cacheIndex, i_1_, i_2_, i_3_, 675863176);
			} catch (Throwable throwable) {
				Class207.method2195(null, throwable, -306254718);
				method3890("crash", -450435261);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.r(").append(')').toString());
		}
	}

	final void method3879(String string, String string_5_, int cacheIndex, int i_6_, int i_7_, int i_8_, int i_9_) throws Exception {
		try {
			Class197.anInt1913 = 1617871159 * i_6_;
			Class330_Sub26_Sub1.anInt9571 = cacheIndex * 1637487291;
			Exception_Sub2.anInt15 = -966488185 * i_7_;
			RuntimeException_Sub2.anInt6441 = i_8_ * 53397049;
			Class556.aString6391 = "Unknown";
			Class116.aString1375 = "1.1";
			try {
				Class556.aString6391 = System.getProperty("java.vendor");
				Class116.aString1375 = System.getProperty("java.version");
			} catch (Exception exception) {
				/* empty */
			}
			try {
				Class314.aString3255 = System.getProperty("os.name");
			} catch (Exception exception) {
				Class314.aString3255 = "Unknown";
			}
			Class212.aString6533 = Class314.aString3255.toLowerCase();
			try {
				Class152.aString1629 = System.getProperty("os.arch").toLowerCase();
			} catch (Exception exception) {
				Class152.aString1629 = "";
			}
			try {
				aString6629 = System.getProperty("os.version").toLowerCase();
			} catch (Exception exception) {
				aString6629 = "";
			}
			try {
				Class291.aString2978 = System.getProperty("user.home");
				if (Class291.aString2978 != null)
					Class291.aString2978 = new StringBuilder().append(Class291.aString2978).append("/").toString();
			} catch (Exception exception) {
				/* empty */
			}
			try {
				if (Class212.aString6533.startsWith("win")) {
					if (null == Class291.aString2978)
						Class291.aString2978 = System.getenv("USERPROFILE");
				} else if (null == Class291.aString2978)
					Class291.aString2978 = System.getenv("HOME");
				if (Class291.aString2978 != null)
					Class291.aString2978 = new StringBuilder().append(Class291.aString2978).append("/").toString();
			} catch (Exception exception) {
				/* empty */
			}
			if (Class291.aString2978 == null)
				Class291.aString2978 = "~/";
			try {
				Class170.anEventQueue1724 = Toolkit.getDefaultToolkit().getSystemEventQueue();
			} catch (Throwable throwable) {
				/* empty */
			}
			Class455.aStringArray5562 = new String[] { "c:/elvycache/", "/elvycache/", "c:/windows/", "c:/winnt/", "c:/", Class291.aString2978, "/tmp/", "" };
			Class22.aStringArray303 = (new String[] { new StringBuilder().append(".rn_cache_").append(Class330_Sub26_Sub1.anInt9571 * -2030411149).toString(), new StringBuilder().append(".file_store_").append(-2030411149 * Class330_Sub26_Sub1.anInt9571).toString() });
			while_86_: for (int i_10_ = 0; i_10_ < 4; i_10_++) {
				Class60.aFile559 = method3904(string, string_5_, i_10_, 559009002);
				if (!Class60.aFile559.exists())
					Class60.aFile559.mkdirs();
				File[] files = Class60.aFile559.listFiles();
				if (files == null)
					break;
				File[] files_11_ = files;
				int i_12_ = 0;
				for (;;) {
					if (i_12_ >= files_11_.length)
						break while_86_;
					File file = files_11_[i_12_];
					if (!method3900(file, false, -254652209)) {
						if (i_9_ <= -16777216)
							throw new IllegalStateException();
						break;
					}
					i_12_++;
				}
			}
			File file = new File(Class60.aFile559, new StringBuilder().append("preferences").append("").append(".dat").toString());
			if (!file.exists()) {
				System.out.println(file.getAbsolutePath()+" doesn't exist.");
				Preferences.copyPreferenceFile(new StringBuilder().append("preferences").append("").append(".dat").toString(), file);
				if (!file.exists()) {
					System.out.println(file.getAbsolutePath()+" still doesn't exist.");
				}
			}
			file = new File(Class60.aFile559, new StringBuilder().append("preferences").append("2").append(".dat").toString());
			if (!file.exists()) {
				System.out.println(file.getAbsolutePath()+" doesn't exist.");
				Preferences.copyPreferenceFile(new StringBuilder().append("preferences").append("2").append(".dat").toString(), file);
				if (!file.exists()) {
					System.out.println(file.getAbsolutePath()+" still doesn't exist.");
				}
			}
			Class464_Sub2.method5739(Class60.aFile559, -1156589125);
			Class75.method852(-1395436150);
			aClass489_6624 = (new Class489(new Class490(Class207.method2192("main_file_cache.dat2", -126784919), "rw", 786432000L), 5200, 0));
			aClass489_6614 = (new Class489(new Class490(Class207.method2192("main_file_cache.idx255", -126784919), "rw", 1048576L), 6000, 0));
			Class440.aClass489Array4481 = new Class489[1889977479 * Class197.anInt1913];
			for (int i_13_ = 0; i_13_ < 1889977479 * Class197.anInt1913; i_13_++)
				Class440.aClass489Array4481[i_13_] = new Class489(new Class490((Class207.method2192(new StringBuilder().append("main_file_cache.idx").append(i_13_).toString(), -126784919)), "rw", 1048576L), 6000, 0);
			try {
				Class203.aClass504_6790 = new Class504();
			} catch (Exception exception) {
				Class503.aBoolean5914 = false;
			}
			Gfx.aClass323_577 = new Class323();
			ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
			for (ThreadGroup threadgroup_14_ = threadgroup.getParent(); threadgroup_14_ != null; threadgroup_14_ = threadgroup.getParent())
				threadgroup = threadgroup_14_;
			Thread[] threads = new Thread[1000];
			threadgroup.enumerate(threads);
			for (int i_15_ = 0; i_15_ < threads.length; i_15_++) {
				if (threads[i_15_] != null && threads[i_15_].getName().startsWith("AWT"))
					threads[i_15_].setPriority(1);
			}
			Thread thread = new Thread(this);
			thread.setDaemon(true);
			thread.start();
			thread.setPriority(1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.j(").append(')').toString());
		}
	}

	public boolean method3880(File file, int i) {
		try {
			if (null == file)
				return false;
			if (!file.exists())
				return false;
			if (!file.isDirectory())
				return false;
			if (file.listFiles().length != 0)
				return false;
			if (!method3900(new File(file, "test.dat"), true, -1330938325))
				return false;
			method3908(file, Class60.aFile559, 1295811465);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.p(").append(')').toString());
		}
	}

	public abstract void init();

	synchronized void method3881(String string, int i) {
		try {
			Class267.aFrame2740 = new Frame();
			Class267.aFrame2740.setTitle(string);
			Class267.aFrame2740.setResizable(true);
			Class267.aFrame2740.addWindowListener(this);
			Class267.aFrame2740.setBackground(Color.black);
			Class267.aFrame2740.setVisible(true);
			Class267.aFrame2740.toFront();
			Insets insets = Class267.aFrame2740.getInsets();
			Class267.aFrame2740.setSize((insets.left + -1408375895 * anInt6609 + insets.right), (394893517 * Class520.anInt6017 + insets.top + insets.bottom));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.x(").append(')').toString());
		}
	}

	public final void update(Graphics graphics) {
		try {
			method241(graphics);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.update(").append(')').toString());
		}
	}

	void method3882(Container container, int i) {
		try {
			container.setBackground(Color.black);
			container.setLayout(null);
			container.add(Class475.aCanvas5700);
			Class475.aCanvas5700.setSize(Class300.anInt3058 * -1969079741, -1548608507 * Class146.anInt1615);
			Class475.aCanvas5700.setVisible(true);
			if (container == Class267.aFrame2740) {
				Insets insets = Class267.aFrame2740.getInsets();
				Class475.aCanvas5700.setLocation((insets.left + anInt6611 * -1722268593), (1819216065 * anInt6612 + insets.top));
			} else
				Class475.aCanvas5700.setLocation(-1722268593 * anInt6611, 1819216065 * anInt6612);
			Class475.aCanvas5700.addFocusListener(this);
			Class475.aCanvas5700.requestFocus();
			Class76_Sub1_Sub3.aBoolean9380 = true;
			aBoolean6639 = true;
			Class475.aCanvas5700.setFocusTraversalKeysEnabled(false);
			aBoolean6619 = true;
			aBoolean6610 = false;
			aLong6627 = Class312.method3111((byte) 74) * 5057132460779437087L;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.c(").append(')').toString());
		}
	}

	abstract void method3883(byte i);

	final boolean method3884(byte i) {
		try {
			String string = Class293.anApplet6804.getDocumentBase().getHost().toLowerCase();
			if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
				return true;
			if (string.equals("runescape.com") || string.endsWith(".runescape.com"))
				return true;
			if (string.equals("stellardawn.com") || string.endsWith(".stellardawn.com"))
				return true;
			if (string.endsWith("127.0.0.1"))
				return true;
			if (string.contains("elveron.no-ip.org") || string.contains("192.99.200.222"))
				return true;
			for (/**/; (string.length() > 0 && string.charAt(string.length() - 1) >= '0' && string.charAt(string.length() - 1) <= '9'); string = string.substring(0, string.length() - 1)) {
				/* empty */
			}
			if (string.endsWith("192.168.1."))
				return true;
			//if (string.equals("69.60.190.231"))
			//	return true;
			//method3890("invalidhost", -445883910);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.e(").append(')').toString());
		}
	}

	public void run() {
		try {
			do {
				try {
					try {
						method3885(1062864240);
					} catch (ThreadDeath threaddeath) {
						throw threaddeath;
					} catch (Throwable throwable) {
						Class207.method2195(method3886(732713930), throwable, -306254718);
						method3890("crash", -1023255260);
						method3888(true, -1413853800);
						break;
					}
					method3888(true, -504562400);
				} catch (RuntimeException object) {
					method3888(true, 1147040293);
					throw object;
				}
			} while (false);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.run(").append(')').toString());
		}
	}

	void method3885(int i) {
		try {
			if (null != Class556.aString6391) {
				String string = Class556.aString6391.toLowerCase();
				if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
					String string_16_ = Class116.aString1375;
					if (string_16_.equals("1.1") || string_16_.startsWith("1.1.") || string_16_.equals("1.2") || string_16_.startsWith("1.2.") || string_16_.equals("1.3") || string_16_.startsWith("1.3.") || string_16_.equals("1.4") || string_16_.startsWith("1.4.") || string_16_.equals("1.5") || string_16_.startsWith("1.5.") || string_16_.equals("1.6.0")) {
						method3890("wrongjava", -764074340);
						return;
					}
					if (string_16_.startsWith("1.6.0_")) {
						int i_17_;
						for (i_17_ = 6; (i_17_ < string_16_.length() && Class67.method795(string_16_.charAt(i_17_), (short) 30164)); i_17_++) {
							/* empty */
						}
						String string_18_ = string_16_.substring(6, i_17_);
						if (Class72.method829(string_18_, 1416815884) && (Class204.method2185(string_18_, (byte) -76) < 10)) {
							method3890("wrongjava", -141255499);
							return;
						}
					}
				}
			}
			Class432_Sub1_Sub3_Sub1.method5526((byte) 54).setFocusCycleRoot(true);
			anInt6617 = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 752266841;
			anInt6637 = Runtime.getRuntime().availableProcessors() * -488766623;
			method3901((byte) -21);
			method3898(-553488135);
			aClass315_6604 = Class93.method1087((byte) -102);
			while (0L == aLong6633 * -3305886959092370751L || (Class312.method3111((byte) 95) < -3305886959092370751L * aLong6633)) {
				anInt6636 = aClass315_6604.method3135(-3139639382665622347L * aLong6602) * -290505375;
				for (int i_19_ = 0; i_19_ < 560866977 * anInt6636; i_19_++)
					method3893(1149689938);
				method3887(-2117112672);
				Class285.method2862(Class475.aCanvas5700, -852498511);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.m(").append(')').toString());
		}
	}

	String method3886(int i) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.v(").append(')').toString());
		}
	}

	void method3887(int i) {
		try {
			long l = Class312.method3111((byte) 77);
			long l_20_ = aLongArray6606[Class451.anInt6642 * 1984457857];
			aLongArray6606[1984457857 * Class451.anInt6642] = l;
			Class451.anInt6642 = (1 + Class451.anInt6642 * 1984457857 & 0x1f) * 1720963969;
			if (l_20_ != 0L && l > l_20_) {
				int i_21_ = (int) (l - l_20_);
				anInt6603 = (32000 + (i_21_ >> 1)) / i_21_ * -1567129805;
			}
			if ((anInt6615 += -1748030413) * -472404229 - 1 > 50) {
				anInt6615 -= -1502174730;
				aBoolean6619 = true;
				Class475.aCanvas5700.setSize(Class300.anInt3058 * -1969079741, -1548608507 * Class146.anInt1615);
				Class475.aCanvas5700.setVisible(true);
				if (null != Class267.aFrame2740 && null == Class130.aFrame1498) {
					Insets insets = Class267.aFrame2740.getInsets();
					Class475.aCanvas5700.setLocation(insets.left + -1722268593 * anInt6611, insets.top + 1819216065 * anInt6612);
				} else
					Class475.aCanvas5700.setLocation(anInt6611 * -1722268593, anInt6612 * 1819216065);
			}
			method3889((byte) -52);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.y(").append(')').toString());
		}
	}

	public final synchronized void method241(Graphics graphics) {
		try {
			if (!aBoolean6634) {
				aBoolean6619 = true;
				if ((Class312.method3111((byte) 33) - -8798482640098983969L * aLong6627) > 1000L) {
					Rectangle rectangle = graphics.getClipBounds();
					if (null == rectangle || (rectangle.width >= anInt6609 * -1408375895 && (rectangle.height >= 394893517 * Class520.anInt6017)))
						aBoolean6610 = true;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.paint(").append(')').toString());
		}
	}

	final void method3888(boolean bool, int i) {
		try {
			synchronized (this) {
				if (aBoolean6634)
					return;
				aBoolean6634 = true;
			}
			try {
				method3903(1368964899);
			} catch (Exception exception) {
				/* empty */
			}
			try {
				aClass489_6624.method6054(-306678499);
				for (int i_22_ = 0; i_22_ < 1889977479 * Class197.anInt1913; i_22_++)
					Class440.aClass489Array4481[i_22_].method6054(-1999662828);
				aClass489_6614.method6054(-274595212);
				aClass489_6607.method6054(-1472163246);
			} catch (Exception exception) {
				/* empty */
			}
			if (((Class332) this).aBoolean6638) {
				try {
					QueryPerformanceCounter.quit();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			Class71.method825(true, (short) -6428);
			if (Class384.method4421((byte) 76))
				Class489.method6063(-1102372689).method332((byte) 116);
			if (Class475.aCanvas5700 != null) {
				try {
					Class475.aCanvas5700.removeFocusListener(this);
					Class475.aCanvas5700.getParent().remove(Class475.aCanvas5700);
				} catch (Exception exception) {
					/* empty */
				}
			}
			if (Class267.aFrame2740 != null) {
				Class267.aFrame2740.setVisible(false);
				Class267.aFrame2740.dispose();
				Class267.aFrame2740 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.ay(").append(')').toString());
		}
	}

	public void start() {
		try {
			if (!aBoolean6634)
				aLong6633 = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.start(").append(')').toString());
		}
	}

	public final void windowDeiconified(WindowEvent windowevent) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.windowDeiconified(").append(')').toString());
		}
	}

	public void destroy() {
		try {
			if (!aBoolean6634) {
				aLong6633 = Class312.method3111((byte) 75) * -3296245712228999871L;
				Class464_Sub21.method5813(5000L);
				method3888(false, -479606648);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.destroy(").append(')').toString());
		}
	}

	public final void focusGained(FocusEvent focusevent) {
		try {
			aBoolean6639 = true;
			aBoolean6619 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.focusGained(").append(')').toString());
		}
	}

	public final void focusLost(FocusEvent focusevent) {
		try {
			aBoolean6639 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.focusLost(").append(')').toString());
		}
	}

	public final void windowActivated(WindowEvent windowevent) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.windowActivated(").append(')').toString());
		}
	}

	public final void windowClosing(WindowEvent windowevent) {
		try {
			aBoolean6618 = true;
			destroy();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.windowClosing(").append(')').toString());
		}
	}

	public final void windowDeactivated(WindowEvent windowevent) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.windowDeactivated(").append(')').toString());
		}
	}

	public final void windowIconified(WindowEvent windowevent) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.windowIconified(").append(')').toString());
		}
	}

	public final void windowOpened(WindowEvent windowevent) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.windowOpened(").append(')').toString());
		}
	}

	abstract void method3889(byte i);

	void method3890(String string, int i) {
		try {
			if (!((Class332) this).aBoolean6620) {
				((Class332) this).aBoolean6620 = true;
				System.out.println(new StringBuilder().append("error_game_").append(string).toString());
				try {
					Class492.method6078(Class293.anApplet6804, "loggedout", (byte) 1);
				} catch (Throwable throwable) {
					/* empty */
				}
				try {
					Class293.anApplet6804.getAppletContext().showDocument(new URL(// Class293.anApplet6804.getCodeBase(),
							new StringBuilder().append("http://elveron.org/").append("error_game_").append(string).append(".ws").toString()), "_top");
				} catch (Exception exception) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.ad(").append(')').toString());
		}
	}

	public boolean method3891(byte i) {
		try {
			return Class489.method6063(-1102372689).method327("jagtheora", 838091566);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.af(").append(')').toString());
		}
	}

	void method3892(Class331 class331, boolean bool, byte i) {
		try {
			if (null == class331)
				throw new NullPointerException();
			if (class331 != Class331.aClass331_3344 && class331 != Class331.aClass331_3343)
				throw new IllegalStateException();
			aClass331_6632 = class331;
			if (Class331.aClass331_3343 != aClass331_6632) {
				if (bool)
					aClass331_6632 = Class331.aClass331_3345;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.aq(").append(')').toString());
		}
	}

	static {
		anInt6611 = 0;
		anInt6612 = 0;
		aString6613 = null;
		aBoolean6619 = true;
		anInt6615 = -2136845412;
		aBoolean6610 = false;
		aLong6627 = 0L;
		aBoolean6618 = false;
		aBoolean6639 = true;
		aClass489_6607 = null;
		aClass489_6624 = null;
		aClass489_6614 = null;
		aClass331_6632 = null;
		aLong6633 = 0L;
		aBoolean6634 = false;
		anInt6617 = -752266841;
		anInt6637 = -488766623;
	}

	void method3893(int i) {
		try {
			long l = Class312.method3111((byte) 119);
			long l_23_ = aLongArray6616[-2064103267 * anInt6608];
			aLongArray6616[anInt6608 * -2064103267] = l;
			anInt6608 = (1 + -2064103267 * anInt6608 & 0x1f) * 1962966453;
			if (0L != l_23_ && l <= l_23_) {
				/* empty */
			}
			synchronized (this) {
				Class76_Sub1_Sub3.aBoolean9380 = aBoolean6639;
			}
			method3883((byte) -42);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.h(").append(')').toString());
		}
	}

	abstract void method3894();

	abstract void method3895();

	abstract void method3896();

	abstract void method3897();

	public void method242(Applet applet) {
		Class293.anApplet6804 = applet;
	}

	public void method252(Applet applet) {
		Class293.anApplet6804 = applet;
	}

	abstract void method3898(int i);

	abstract void method3899();

	boolean method3900(File file, boolean bool, int i) {
		try {
			boolean bool_24_;
			try {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i_25_ = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i_25_);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				if (bool)
					file.delete();
				bool_24_ = true;
			} catch (Exception exception) {
				return false;
			}
			return bool_24_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.s(").append(')').toString());
		}
	}

	synchronized void method3901(byte i) {
		try {
			method3906(-987136161);
			Container container = Class432_Sub1_Sub3_Sub1.method5526((byte) 68);
			Class475.aCanvas5700 = new Canvas_Sub1(container);
			method3882(container, 1438883820);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.g(").append(')').toString());
		}
	}

	public void stop() {
		try {
			if (!aBoolean6634)
				aLong6633 = ((Class312.method3111((byte) 29) + 4000L) * -3296245712228999871L);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.stop(").append(')').toString());
		}
	}

	public boolean method3902(short i) {
		try {
			((Class332) this).aBoolean6638 = Class489.method6063(-1102372689).method327("jaclib", -1337218933);
			if (((Class332) this).aBoolean6638) {
				try {
					QueryPerformanceCounter.init();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			return ((Class332) this).aBoolean6638;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.an(").append(')').toString());
		}
	}

	public void method244(Applet applet) {
		Class293.anApplet6804 = applet;
	}

	abstract void method3903(int i);

	File method3904(String string, String string_26_, int i, int i_27_) {
		try {
			String string_28_ = (0 == i ? "" : new StringBuilder().append("").append(i).toString());
			Class398.aFile4116 = new File(Class291.aString2978, new StringBuilder().append("rn_cl_").append(string).append("_").append(string_26_).append(string_28_).append(".dat").toString());
			String string_29_ = null;
			String string_30_ = null;
			boolean bool = false;
			if (Class398.aFile4116.exists()) {
				try {
					Class490 class490 = new Class490(Class398.aFile4116, "rw", 10000L);
					int i_31_;
					Buffer class330_sub46;
					for (class330_sub46 = (new Buffer((int) class490.method6066(1742373643))); (class330_sub46.offset * -824785231 < class330_sub46.payload.length); class330_sub46.offset += i_31_ * 323600977) {
						i_31_ = (class490.method6067(class330_sub46.payload, -824785231 * class330_sub46.offset, (class330_sub46.payload.length - -824785231 * class330_sub46.offset), (byte) 83));
						if (-1 == i_31_)
							throw new IOException();
					}
					class330_sub46.offset = 0;
					i_31_ = class330_sub46.readUnsignedByte(1436566972);
					if (i_31_ < 1 || i_31_ > 3)
						throw new IOException(new StringBuilder().append("").append(i_31_).toString());
					int i_32_ = 0;
					if (i_31_ > 1)
						i_32_ = class330_sub46.readUnsignedByte(1685879586);
					if (i_31_ <= 2) {
						string_29_ = class330_sub46.readJagString((byte) 6);
						if (i_32_ == 1)
							string_30_ = class330_sub46.readJagString((byte) 6);
					} else {
						string_29_ = class330_sub46.method3804(-1057524025);
						if (i_32_ == 1)
							string_30_ = class330_sub46.method3804(-1898776352);
					}
					class490.method6064(-1941031576);
				} catch (IOException ioexception) {
					ioexception.printStackTrace();
				}
				if (string_29_ != null) {
					File file = new File(string_29_);
					if (!file.exists())
						string_29_ = null;
				}
				if (string_29_ != null) {
					File file = new File(string_29_, "test.dat");
					if (!method3900(file, true, 1333923828))
						string_29_ = null;
				}
			}
			if (null == string_29_ && i == 0) {
				while_87_: for (int i_33_ = 0; i_33_ < Class22.aStringArray303.length; i_33_++) {
					for (int i_34_ = 0; i_34_ < Class455.aStringArray5562.length; i_34_++) {
						File file = new File(new StringBuilder().append(Class455.aStringArray5562[i_34_]).append(Class22.aStringArray303[i_33_]).append(File.separatorChar).append(string).append(File.separatorChar).toString());
						if (file.exists() && method3900(new File(file, "test.dat"), true, 472896489)) {
							string_29_ = file.toString();
							bool = true;
							break while_87_;
						}
					}
				}
			}
			if (string_29_ == null) {
				string_29_ = new StringBuilder().append(Class291.aString2978).append(File.separatorChar).append("elvycache").append(string_28_).append(File.separatorChar).append(string).append(File.separatorChar).append(string_26_).append(File.separatorChar).toString();
				bool = true;
			}
			if (string_30_ != null) {
				File file = new File(string_30_);
				File file_35_ = new File(string_29_);
				try {
					File[] files = file.listFiles();
					File[] files_36_ = files;
					for (int i_37_ = 0; i_37_ < files_36_.length; i_37_++) {
						File file_38_ = files_36_[i_37_];
						File file_39_ = new File(file_35_, file_38_.getName());
						boolean bool_40_ = file_38_.renameTo(file_39_);
						if (!bool_40_)
							throw new IOException();
					}
				} catch (Exception exception) {
					exception.printStackTrace();
				}
				bool = true;
			}
			if (bool)
				method3908(new File(string_29_), null, 1367213427);
			return new File(string_29_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.i(").append(')').toString());
		}
	}

	abstract void method3905();

	public final void windowClosed(WindowEvent windowevent) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.windowClosed(").append(')').toString());
		}
	}

	public void method246() {
		if (!aBoolean6634)
			aLong6633 = 0L;
	}

	public void method247() {
		if (!aBoolean6634)
			aLong6633 = 0L;
	}

	public void method248() {
		if (!aBoolean6634)
			aLong6633 = 0L;
	}

	public void method249() {
		if (!aBoolean6634)
			aLong6633 = ((Class312.method3111((byte) 66) + 4000L) * -3296245712228999871L);
	}

	public void method250() {
		if (!aBoolean6634)
			aLong6633 = ((Class312.method3111((byte) 88) + 4000L) * -3296245712228999871L);
	}

	public void method251() {
		if (!aBoolean6634) {
			aLong6633 = Class312.method3111((byte) 3) * -3296245712228999871L;
			Class464_Sub21.method5813(5000L);
			method3888(false, 1059359432);
		}
	}

	public final void method240(Graphics graphics) {
		method241(graphics);
	}

	public final synchronized void method254(Graphics graphics) {
		if (!aBoolean6634) {
			aBoolean6619 = true;
			if ((Class312.method3111((byte) 104) - -8798482640098983969L * aLong6627) > 1000L) {
				Rectangle rectangle = graphics.getClipBounds();
				if (null == rectangle || (rectangle.width >= anInt6609 * -1408375895 && rectangle.height >= 394893517 * Class520.anInt6017))
					aBoolean6610 = true;
			}
		}
	}

	public final void method253(Graphics graphics) {
		method241(graphics);
	}

	public void method243() {
		if (!aBoolean6634)
			aLong6633 = ((Class312.method3111((byte) 127) + 4000L) * -3296245712228999871L);
	}

	public void method245() {
		if (!aBoolean6634)
			aLong6633 = 0L;
	}

	void method3906(int i) {
		try {
			if (null != Class475.aCanvas5700) {
				Class475.aCanvas5700.removeFocusListener(this);
				Class475.aCanvas5700.getParent().setBackground(Color.black);
				Class475.aCanvas5700.getParent().remove(Class475.aCanvas5700);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.a(").append(')').toString());
		}
	}

	public final void method239(Graphics graphics) {
		method241(graphics);
	}

	public abstract void method255();

	public abstract void method258();

	public abstract void method257();

	public abstract void method259();

	Class332() {
		/* empty */
	}

	abstract void method3907();

	void method3908(File file, File file_41_, int i) {
		try {
			try {
				Class490 class490 = new Class490(Class398.aFile4116, "rw", 10000L);
				Buffer class330_sub46 = new Buffer(500);
				class330_sub46.addByte(3, (byte) 77);
				class330_sub46.addByte(file_41_ != null ? 1 : 0, (byte) 12);
				class330_sub46.method3799(file.getPath(), (byte) -80);
				if (null != file_41_)
					class330_sub46.method3799(file_41_.getPath(), (byte) -55);
				class490.method6068(class330_sub46.payload, 0, -824785231 * class330_sub46.offset, -1154489731);
				class490.method6064(-889895048);
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.o(").append(')').toString());
		}
	}

	public abstract void method256();

	static int method3909(int i) {
		try {
			int i_42_ = -1090237427 * Class134.aClass258_1518.anInt2703;
			if (i_42_ < Class239.aClass258Array2585.length - 1)
				Class134.aClass258_1518 = Class239.aClass258Array2585[1 + i_42_];
			return 100;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.f(").append(')').toString());
		}
	}

	static final void method3910(Class430 class430, byte i) {
		try {
			int i_43_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_43_, -1791037003);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 694142557 * iComponentDefinitions.anInt1348;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nv.rc(").append(')').toString());
		}
	}
}
