/* Class296_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

public class Class296_Sub1 extends Class296 {
	int anInt7445;
	SourceDataLine aSourceDataLine7446;
	boolean aBoolean7447 = false;
	byte[] aByteArray7448;
	AudioFormat anAudioFormat7449;
	boolean aBoolean7450 = false;

	void method2948() {
		if (!((Class296_Sub1) this).aBoolean7447) {
			int i = 256;
			if (aBoolean3023)
				i <<= 1;
			for (int i_0_ = 0; i_0_ < i; i_0_++) {
				int i_1_ = ((Class296_Sub1) this).anIntArray3028[i_0_];
				if ((i_1_ + 8388608 & ~0xffffff) != 0)
					i_1_ = 0x7fffff ^ i_1_ >> 31;
				((Class296_Sub1) this).aByteArray7448[i_0_ * 2] = (byte) (i_1_ >> 8);
				((Class296_Sub1) this).aByteArray7448[i_0_ * 2 + 1] = (byte) (i_1_ >> 16);
			}
			((Class296_Sub1) this).aSourceDataLine7446.write(((Class296_Sub1) this).aByteArray7448, 0, i << 1);
		}
	}

	void method2944(Component component) {
		Mixer.Info[] infos = AudioSystem.getMixerInfo();
		if (infos != null) {
			Mixer.Info[] infos_2_ = infos;
			for (int i = 0; i < infos_2_.length; i++) {
				Mixer.Info info = infos_2_[i];
				if (info != null) {
					String string = info.getName();
					if (string != null && string.toLowerCase().indexOf("soundmax") >= 0)
						((Class296_Sub1) this).aBoolean7450 = true;
				}
			}
		}
		((Class296_Sub1) this).anAudioFormat7449 = new AudioFormat((float) anInt3047, 16, aBoolean3023 ? 2 : 1, true, false);
		((Class296_Sub1) this).aByteArray7448 = new byte[256 << (aBoolean3023 ? 2 : 1)];
	}

	void method2950(int i) throws LineUnavailableException {
		if (((Class296_Sub1) this).aSourceDataLine7446 != null) {
			if (!((Class296_Sub1) this).aBoolean7447)
				throw new IllegalStateException("");
			if (i == ((Class296_Sub1) this).anInt7445) {
				((Class296_Sub1) this).aBoolean7447 = false;
				return;
			}
			if (!method2952())
				return;
		}
		try {
			DataLine.Info info = (new DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((Class296_Sub1) this).anAudioFormat7449, i << (aBoolean3023 ? 2 : 1)));
			((Class296_Sub1) this).aSourceDataLine7446 = (SourceDataLine) AudioSystem.getLine(info);
			((Class296_Sub1) this).aSourceDataLine7446.open();
			((Class296_Sub1) this).aSourceDataLine7446.start();
			((Class296_Sub1) this).anInt7445 = i;
			((Class296_Sub1) this).aBoolean7447 = false;
		} catch (LineUnavailableException lineunavailableexception) {
			if (IsaacCipher.method6046(i, 838000016) != 1)
				method2949(Class136.method1594(i, 1864323992));
			else {
				((Class296_Sub1) this).aBoolean7447 = true;
				throw lineunavailableexception;
			}
		}
	}

	int method2951() {
		return (((Class296_Sub1) this).anInt7445 - (((Class296_Sub1) this).aSourceDataLine7446.available() >> (aBoolean3023 ? 2 : 1)));
	}

	void method2945(boolean bool) {
		if (bool)
			method2952();
		else {
			try {
				method2946();
			} catch (LineUnavailableException lineunavailableexception) {
				/* empty */
			}
			((Class296_Sub1) this).aBoolean7447 = true;
		}
	}

	boolean method2952() {
		boolean bool = false;
		do {
			if (((Class296_Sub1) this).aSourceDataLine7446 != null) {
				Thread thread = new Thread(new Class303(this));
				thread.start();
				try {
					try {
						thread.join(2000L);
					} catch (InterruptedException interruptedexception) {
						if (((Class296_Sub1) this).aSourceDataLine7446 != null) {
							((Class296_Sub1) this).aSourceDataLine7446 = null;
							method2939();
						}
						bool = true;
						break;
					}
					if (((Class296_Sub1) this).aSourceDataLine7446 != null) {
						((Class296_Sub1) this).aSourceDataLine7446 = null;
						method2939();
					}
					bool = true;
				} catch (RuntimeException object) {
					if (((Class296_Sub1) this).aSourceDataLine7446 != null) {
						((Class296_Sub1) this).aSourceDataLine7446 = null;
						method2939();
					}
					bool = true;
					throw object;
				}
			}
		} while (false);
		return bool;
	}

	void method2946() throws LineUnavailableException {
		if (!((Class296_Sub1) this).aBoolean7447) {
			((Class296_Sub1) this).aSourceDataLine7446.flush();
			if (((Class296_Sub1) this).aBoolean7450) {
				if (method2952()) {
					DataLine.Info info = (new DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((Class296_Sub1) this).anAudioFormat7449, ((Class296_Sub1) this).anInt7445 << (aBoolean3023 ? 2 : 1)));
					((Class296_Sub1) this).aSourceDataLine7446 = (SourceDataLine) AudioSystem.getLine(info);
					((Class296_Sub1) this).aSourceDataLine7446.open();
					((Class296_Sub1) this).aSourceDataLine7446.start();
				}
			}
		}
	}

	void method2953(Component component) {
		Mixer.Info[] infos = AudioSystem.getMixerInfo();
		if (infos != null) {
			Mixer.Info[] infos_3_ = infos;
			for (int i = 0; i < infos_3_.length; i++) {
				Mixer.Info info = infos_3_[i];
				if (info != null) {
					String string = info.getName();
					if (string != null && string.toLowerCase().indexOf("soundmax") >= 0)
						((Class296_Sub1) this).aBoolean7450 = true;
				}
			}
		}
		((Class296_Sub1) this).anAudioFormat7449 = new AudioFormat((float) anInt3047, 16, aBoolean3023 ? 2 : 1, true, false);
		((Class296_Sub1) this).aByteArray7448 = new byte[256 << (aBoolean3023 ? 2 : 1)];
	}

	Class296_Sub1() {
		/* empty */
	}

	void method2954(int i) throws LineUnavailableException {
		if (((Class296_Sub1) this).aSourceDataLine7446 != null) {
			if (!((Class296_Sub1) this).aBoolean7447)
				throw new IllegalStateException("");
			if (i == ((Class296_Sub1) this).anInt7445) {
				((Class296_Sub1) this).aBoolean7447 = false;
				return;
			}
			if (!method2952())
				return;
		}
		try {
			DataLine.Info info = (new DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((Class296_Sub1) this).anAudioFormat7449, i << (aBoolean3023 ? 2 : 1)));
			((Class296_Sub1) this).aSourceDataLine7446 = (SourceDataLine) AudioSystem.getLine(info);
			((Class296_Sub1) this).aSourceDataLine7446.open();
			((Class296_Sub1) this).aSourceDataLine7446.start();
			((Class296_Sub1) this).anInt7445 = i;
			((Class296_Sub1) this).aBoolean7447 = false;
		} catch (LineUnavailableException lineunavailableexception) {
			if (IsaacCipher.method6046(i, 1883748665) != 1)
				method2949(Class136.method1594(i, 1997628858));
			else {
				((Class296_Sub1) this).aBoolean7447 = true;
				throw lineunavailableexception;
			}
		}
	}

	int method2940() {
		return (((Class296_Sub1) this).anInt7445 - (((Class296_Sub1) this).aSourceDataLine7446.available() >> (aBoolean3023 ? 2 : 1)));
	}

	int method2955() {
		return (((Class296_Sub1) this).anInt7445 - (((Class296_Sub1) this).aSourceDataLine7446.available() >> (aBoolean3023 ? 2 : 1)));
	}

	void method2956() {
		if (!((Class296_Sub1) this).aBoolean7447) {
			int i = 256;
			if (aBoolean3023)
				i <<= 1;
			for (int i_4_ = 0; i_4_ < i; i_4_++) {
				int i_5_ = ((Class296_Sub1) this).anIntArray3028[i_4_];
				if ((i_5_ + 8388608 & ~0xffffff) != 0)
					i_5_ = 0x7fffff ^ i_5_ >> 31;
				((Class296_Sub1) this).aByteArray7448[i_4_ * 2] = (byte) (i_5_ >> 8);
				((Class296_Sub1) this).aByteArray7448[i_4_ * 2 + 1] = (byte) (i_5_ >> 16);
			}
			((Class296_Sub1) this).aSourceDataLine7446.write(((Class296_Sub1) this).aByteArray7448, 0, i << 1);
		}
	}

	void method2949(int i) throws LineUnavailableException {
		if (((Class296_Sub1) this).aSourceDataLine7446 != null) {
			if (!((Class296_Sub1) this).aBoolean7447)
				throw new IllegalStateException("");
			if (i == ((Class296_Sub1) this).anInt7445) {
				((Class296_Sub1) this).aBoolean7447 = false;
				return;
			}
			if (!method2952())
				return;
		}
		try {
			DataLine.Info info = (new DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((Class296_Sub1) this).anAudioFormat7449, i << (aBoolean3023 ? 2 : 1)));
			((Class296_Sub1) this).aSourceDataLine7446 = (SourceDataLine) AudioSystem.getLine(info);
			((Class296_Sub1) this).aSourceDataLine7446.open();
			((Class296_Sub1) this).aSourceDataLine7446.start();
			((Class296_Sub1) this).anInt7445 = i;
			((Class296_Sub1) this).aBoolean7447 = false;
		} catch (LineUnavailableException lineunavailableexception) {
			if (IsaacCipher.method6046(i, 1436644909) != 1)
				method2949(Class136.method1594(i, 1827040006));
			else {
				((Class296_Sub1) this).aBoolean7447 = true;
				throw lineunavailableexception;
			}
		}
	}

	void method2957(Component component) {
		Mixer.Info[] infos = AudioSystem.getMixerInfo();
		if (infos != null) {
			Mixer.Info[] infos_6_ = infos;
			for (int i = 0; i < infos_6_.length; i++) {
				Mixer.Info info = infos_6_[i];
				if (info != null) {
					String string = info.getName();
					if (string != null && string.toLowerCase().indexOf("soundmax") >= 0)
						((Class296_Sub1) this).aBoolean7450 = true;
				}
			}
		}
		((Class296_Sub1) this).anAudioFormat7449 = new AudioFormat((float) anInt3047, 16, aBoolean3023 ? 2 : 1, true, false);
		((Class296_Sub1) this).aByteArray7448 = new byte[256 << (aBoolean3023 ? 2 : 1)];
	}

	void method2958() {
		if (!((Class296_Sub1) this).aBoolean7447) {
			int i = 256;
			if (aBoolean3023)
				i <<= 1;
			for (int i_7_ = 0; i_7_ < i; i_7_++) {
				int i_8_ = ((Class296_Sub1) this).anIntArray3028[i_7_];
				if ((i_8_ + 8388608 & ~0xffffff) != 0)
					i_8_ = 0x7fffff ^ i_8_ >> 31;
				((Class296_Sub1) this).aByteArray7448[i_7_ * 2] = (byte) (i_8_ >> 8);
				((Class296_Sub1) this).aByteArray7448[i_7_ * 2 + 1] = (byte) (i_8_ >> 16);
			}
			((Class296_Sub1) this).aSourceDataLine7446.write(((Class296_Sub1) this).aByteArray7448, 0, i << 1);
		}
	}

	void method2959(boolean bool) {
		if (bool)
			method2952();
		else {
			try {
				method2946();
			} catch (LineUnavailableException lineunavailableexception) {
				/* empty */
			}
			((Class296_Sub1) this).aBoolean7447 = true;
		}
	}

	void method2960() {
		if (!((Class296_Sub1) this).aBoolean7447) {
			int i = 256;
			if (aBoolean3023)
				i <<= 1;
			for (int i_9_ = 0; i_9_ < i; i_9_++) {
				int i_10_ = ((Class296_Sub1) this).anIntArray3028[i_9_];
				if ((i_10_ + 8388608 & ~0xffffff) != 0)
					i_10_ = 0x7fffff ^ i_10_ >> 31;
				((Class296_Sub1) this).aByteArray7448[i_9_ * 2] = (byte) (i_10_ >> 8);
				((Class296_Sub1) this).aByteArray7448[i_9_ * 2 + 1] = (byte) (i_10_ >> 16);
			}
			((Class296_Sub1) this).aSourceDataLine7446.write(((Class296_Sub1) this).aByteArray7448, 0, i << 1);
		}
	}

	void method2961() throws LineUnavailableException {
		if (!((Class296_Sub1) this).aBoolean7447) {
			((Class296_Sub1) this).aSourceDataLine7446.flush();
			if (((Class296_Sub1) this).aBoolean7450) {
				if (method2952()) {
					DataLine.Info info = (new DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((Class296_Sub1) this).anAudioFormat7449, ((Class296_Sub1) this).anInt7445 << (aBoolean3023 ? 2 : 1)));
					((Class296_Sub1) this).aSourceDataLine7446 = (SourceDataLine) AudioSystem.getLine(info);
					((Class296_Sub1) this).aSourceDataLine7446.open();
					((Class296_Sub1) this).aSourceDataLine7446.start();
				}
			}
		}
	}

	void method2962() throws LineUnavailableException {
		if (!((Class296_Sub1) this).aBoolean7447) {
			((Class296_Sub1) this).aSourceDataLine7446.flush();
			if (((Class296_Sub1) this).aBoolean7450) {
				if (method2952()) {
					DataLine.Info info = (new DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((Class296_Sub1) this).anAudioFormat7449, ((Class296_Sub1) this).anInt7445 << (aBoolean3023 ? 2 : 1)));
					((Class296_Sub1) this).aSourceDataLine7446 = (SourceDataLine) AudioSystem.getLine(info);
					((Class296_Sub1) this).aSourceDataLine7446.open();
					((Class296_Sub1) this).aSourceDataLine7446.start();
				}
			}
		}
	}

	void method2963() throws LineUnavailableException {
		if (!((Class296_Sub1) this).aBoolean7447) {
			((Class296_Sub1) this).aSourceDataLine7446.flush();
			if (((Class296_Sub1) this).aBoolean7450) {
				if (method2952()) {
					DataLine.Info info = (new DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((Class296_Sub1) this).anAudioFormat7449, ((Class296_Sub1) this).anInt7445 << (aBoolean3023 ? 2 : 1)));
					((Class296_Sub1) this).aSourceDataLine7446 = (SourceDataLine) AudioSystem.getLine(info);
					((Class296_Sub1) this).aSourceDataLine7446.open();
					((Class296_Sub1) this).aSourceDataLine7446.start();
				}
			}
		}
	}

	void method2964(boolean bool) {
		if (bool)
			method2952();
		else {
			try {
				method2946();
			} catch (LineUnavailableException lineunavailableexception) {
				/* empty */
			}
			((Class296_Sub1) this).aBoolean7447 = true;
		}
	}
}
