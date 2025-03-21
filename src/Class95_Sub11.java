/* Class95_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class95_Sub11 extends Class95 {
	public static Class296 aClass296_7171;
	public static IndexTable aClass280_7172;
	public static IndexTable clientScriptMap;

	public void method1100() {
		Class10.method426(true, 609697129);
	}

	public void method1099() {
		Class10.method426(true, 609697129);
	}

	public void method1095(int i) {
		try {
			Class10.method426(true, 609697129);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zk.j(").append(')').toString());
		}
	}

	public void method1098() {
		Class10.method426(true, 609697129);
	}

	Class95_Sub11(Buffer class330_sub46) {
		super(class330_sub46);
	}

	public static void method1129(int i, int i_0_, int i_1_) {
		try {
			if (0 != 242692185 * MusicManager.currentState) {
				if (i < 0) {
					for (int i_2_ = 0; i_2_ < 16; i_2_++)
						Class85.anIntArray711[i_2_] = i_0_;
				} else
					Class85.anIntArray711[i] = i_0_;
			}
			Class110.aClass330_Sub40_Sub2_1155.method3589(i, i_0_, 1311262507);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zk.z(").append(')').toString());
		}
	}

	static void method1130(byte i) {
		try {
			Class490 class490 = null;
			try {
				class490 = Preferences.loadPreferences("2", client.aClass435_9146.aString4422, false, 833381223);
				byte[] is = new byte[(int) class490.method6066(1742373643)];
				int i_3_;
				for (int i_4_ = 0; i_4_ < is.length; i_4_ += i_3_) {
					i_3_ = class490.method6067(is, i_4_, is.length - i_4_, (byte) 14);
					if (-1 == i_3_)
						throw new IOException();
				}
				Class102.method1225(new Buffer(is), -1430716501);
			} catch (Exception exception) {
				/* empty */
			}
			try {
				if (null != class490)
					class490.method6064(-476721617);
			} catch (Exception exception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zk.l(").append(')').toString());
		}
	}

	static final void method1131(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_5_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_6_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 0 != (i_5_ & 1 << i_6_) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zk.zm(").append(')').toString());
		}
	}
}
