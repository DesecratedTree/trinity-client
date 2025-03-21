/* Class504 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class Class504 {
	DisplayMode aDisplayMode5917;
	GraphicsDevice aGraphicsDevice5918;

	int[] method6136(int i) {
		try {
			DisplayMode[] displaymodes = ((Class504) this).aGraphicsDevice5918.getDisplayModes();
			int[] is = new int[displaymodes.length << 2];
			for (int i_0_ = 0; i_0_ < displaymodes.length; i_0_++) {
				is[i_0_ << 2] = displaymodes[i_0_].getWidth();
				is[1 + (i_0_ << 2)] = displaymodes[i_0_].getHeight();
				is[(i_0_ << 2) + 2] = displaymodes[i_0_].getBitDepth();
				is[3 + (i_0_ << 2)] = displaymodes[i_0_].getRefreshRate();
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uv.r(").append(')').toString());
		}
	}

	void method6137(Frame frame, int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		try {
			((Class504) this).aDisplayMode5917 = ((Class504) this).aGraphicsDevice5918.getDisplayMode();
			if (((Class504) this).aDisplayMode5917 == null)
				throw new NullPointerException();
			frame.setUndecorated(true);
			frame.enableInputMethods(false);
			method6138(frame, (byte) 1);
			if (0 == i_3_) {
				int i_5_ = ((Class504) this).aDisplayMode5917.getRefreshRate();
				DisplayMode[] displaymodes = ((Class504) this).aGraphicsDevice5918.getDisplayModes();
				boolean bool = false;
				for (int i_6_ = 0; i_6_ < displaymodes.length; i_6_++) {
					if (displaymodes[i_6_].getWidth() == i && displaymodes[i_6_].getHeight() == i_1_ && displaymodes[i_6_].getBitDepth() == i_2_) {
						int i_7_ = displaymodes[i_6_].getRefreshRate();
						if (!bool || Math.abs(i_7_ - i_5_) < Math.abs(i_3_ - i_5_)) {
							i_3_ = i_7_;
							bool = true;
						}
					}
				}
				if (bool) {
					if (i_4_ != 624416167) {
						/* empty */
					}
				} else
					i_3_ = i_5_;
			}
			((Class504) this).aGraphicsDevice5918.setDisplayMode(new DisplayMode(i, i_1_, i_2_, i_3_));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uv.j(").append(')').toString());
		}
	}

	void method6138(Frame frame, byte i) {
		try {
			boolean bool = false;
			try {
				Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
				field.setAccessible(true);
				boolean bool_8_ = ((Boolean) field.get(((Class504) this).aGraphicsDevice5918)).booleanValue();
				if (bool_8_) {
					field.set(((Class504) this).aGraphicsDevice5918, Boolean.FALSE);
					bool = true;
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				((Class504) this).aGraphicsDevice5918.setFullScreenWindow(frame);
			} catch (RuntimeException object) {
				if (bool) {
					try {
						Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
						field.set(((Class504) this).aGraphicsDevice5918, Boolean.TRUE);
					} catch (Throwable throwable) {
						/* empty */
					}
				}
				throw object;
			}
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(((Class504) this).aGraphicsDevice5918, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uv.p(").append(')').toString());
		}
	}

	public Class504() throws Exception {
		GraphicsEnvironment graphicsenvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		((Class504) this).aGraphicsDevice5918 = graphicsenvironment.getDefaultScreenDevice();
		if (!((Class504) this).aGraphicsDevice5918.isFullScreenSupported()) {
			GraphicsDevice[] graphicsdevices = graphicsenvironment.getScreenDevices();
			GraphicsDevice[] graphicsdevices_9_ = graphicsdevices;
			for (int i = 0; i < graphicsdevices_9_.length; i++) {
				GraphicsDevice graphicsdevice = graphicsdevices_9_[i];
				if (graphicsdevice != null && graphicsdevice.isFullScreenSupported()) {
					((Class504) this).aGraphicsDevice5918 = graphicsdevice;
					return;
				}
			}
			throw new Exception();
		}
	}

	void method6139(int i) {
		try {
			if (((Class504) this).aDisplayMode5917 != null) {
				DisplayMode[] displaymodes = ((Class504) this).aGraphicsDevice5918.getDisplayModes();
				boolean bool = false;
				DisplayMode[] displaymodes_10_ = displaymodes;
				for (int i_11_ = 0; i_11_ < displaymodes_10_.length; i_11_++) {
					DisplayMode displaymode = displaymodes_10_[i_11_];
					if (displaymode.equals(((Class504) this).aDisplayMode5917)) {
						((Class504) this).aGraphicsDevice5918.setDisplayMode(((Class504) this).aDisplayMode5917);
						bool = true;
						break;
					}
				}
				if (!bool) {
					try {
						Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
						field.setAccessible(true);
						field.set(((Class504) this).aGraphicsDevice5918, null);
					} catch (Throwable throwable) {
						/* empty */
					}
				}
				((Class504) this).aDisplayMode5917 = null;
			}
			method6138(null, (byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uv.i(").append(')').toString());
		}
	}
}
