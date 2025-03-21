/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Class57 implements Interface_ma {
	int anInt6595;
	IndexTable aClass280_6596;
	IndexTable aClass280_6597;
	Class56[] aClass56Array6598;
	public static Class61[] aClass61Array6599;
	static Class305 aClass305_6600;

	public int method235() {
		return ((Class57) this).anInt6595 * -756608695;
	}

	public int method219(int i) {
		try {
			return ((Class57) this).anInt6595 * -756608695;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cg.r(").append(')').toString());
		}
	}

	public boolean method237(int i, Class377 class377, float f, int i_0_, int i_1_, boolean bool, int i_2_) {
		try {
			boolean bool_3_ = true;
			if (((Class57) this).aClass56Array6598[i].aBoolean508)
				bool_3_ = ((Class57) this).aClass280_6597.method2750(i, -1388100207);
			bool_3_ &= ((Class57) this).aClass280_6596.method2750(i, -644820171);
			return bool_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cg.j(").append(')').toString());
		}
	}

	int[] method648(int i, int i_4_) {
		try {
			int[] is = method651(i, -1853234902);
			for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
				if (0 != (is[i_5_] & 0xffffff))
					is[i_5_] = is[i_5_] | ~0xffffff;
				else
					is[i_5_] = is[i_5_] & 0xffffff;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cg.i(").append(')').toString());
		}
	}

	float[] method649(int i, int i_6_) {
		try {
			int[] is = method651(i, -1853234902);
			if (is == null)
				return null;
			int[] is_7_ = null;
			int i_8_ = -1963453415 * ((Class57) this).aClass56Array6598[i].anInt532;
			if (((Class57) this).aClass56Array6598[i].aBoolean508) {
				byte[] is_9_ = ((Class57) this).aClass280_6597.method2761(i, 1773308989);
				if (is_9_ != null) {
					try {
						is_7_ = method650(is_9_, -107277330);
						for (int i_10_ = 0; i_10_ < is_7_.length; i_10_++)
							is_7_[i_10_] = is_7_[i_10_] & 0xfff;
					} catch (IOException ioexception) {
						/* empty */
					}
				}
			}
			if (is_7_ == null)
				is_7_ = new int[i_8_ * i_8_];
			float[] fs = new float[is.length * 4];
			int i_11_ = 0;
			for (int i_12_ = 0; i_12_ < is.length; i_12_++) {
				int i_13_ = is[i_12_];
				int i_14_ = i_13_ >>> 24;
				int i_15_ = (i_13_ & 0xff0000) >> 16;
				int i_16_ = (i_13_ & 0xff00) >> 8;
				int i_17_ = i_13_ & 0xff;
				float f = (float) is_7_[i_12_] * 31.0F / 4096.0F + 1.0F;
				fs[i_11_++] = f * (float) i_15_ / 255.0F;
				fs[i_11_++] = (float) i_16_ * f / 255.0F;
				fs[i_11_++] = f * (float) i_17_ / 255.0F;
				fs[i_11_++] = (float) i_14_ / 255.0F;
			}
			return fs;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cg.o(").append(')').toString());
		}
	}

	public Class56 method221(int i, int i_18_) {
		try {
			return ((Class57) this).aClass56Array6598[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cg.s(").append(')').toString());
		}
	}

	public void method224(short i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cg.f(").append(')').toString());
		}
	}

	public int method225() {
		return ((Class57) this).anInt6595 * -756608695;
	}

	public int[] method231(int i, float f, int i_19_, int i_20_, boolean bool, int i_21_) {
		try {
			return method651(i, -1853234902);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cg.w(").append(')').toString());
		}
	}

	public float[] method222(int i, float f, int i_22_, int i_23_, boolean bool, short i_24_) {
		try {
			return method649(i, 218224621);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cg.n(").append(')').toString());
		}
	}

	int[] method650(byte[] is, int i) throws IOException {
		try {
			BufferedImage bufferedimage = ImageIO.read(new ByteArrayInputStream(is));
			if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
				int[] is_25_ = null;
				is_25_ = bufferedimage.getRaster().getPixels(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), is_25_);
				int[] is_26_ = (new int[bufferedimage.getWidth() * bufferedimage.getHeight()]);
				if (bufferedimage.getType() == 10) {
					for (int i_27_ = 0; i_27_ < is_26_.length; i_27_++)
						is_26_[i_27_] = -16777216 + ((is_25_[i_27_] << 16) + (is_25_[i_27_] << 8) + is_25_[i_27_]);
				} else {
					for (int i_28_ = 0; i_28_ < is_26_.length; i_28_++) {
						int i_29_ = i_28_ * 2;
						is_26_[i_28_] = ((is_25_[i_29_] << 16) + (is_25_[i_29_] << 8) + (is_25_[i_29_] + (is_25_[i_29_ + 1] << 24)));
					}
				}
				return is_26_;
			}
			return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), null, 0, bufferedimage.getWidth());
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cg.l(").append(')').toString());
		}
	}

	int[] method651(int i, int i_30_) {
		try {
			byte[] is = ((Class57) this).aClass280_6596.method2761(i, 391937457);
			if (null == is)
				return null;
			int[] is_31_;
			try {
				int[] is_32_ = method650(is, -107277330);
				is_31_ = is_32_;
			} catch (IOException ioexception) {
				return null;
			}
			return is_31_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cg.p(").append(')').toString());
		}
	}

	public int[] method226(int i, float f, int i_33_, int i_34_, boolean bool) {
		return method651(i, -1853234902);
	}

	// texture loader??
	public Class57(IndexTable class280, IndexTable class280_35_, IndexTable class280_36_) {
		((Class57) this).aClass280_6596 = class280_35_;
		((Class57) this).aClass280_6597 = class280_36_;
		Buffer class330_sub46 = new Buffer(class280.getFile(0, 0));
		((Class57) this).anInt6595 = class330_sub46.readUnsignedShort(923327562) * -194072327;
		((Class57) this).aClass56Array6598 = new Class56[((Class57) this).anInt6595 * -756608695];
		for (int i = 0; i < ((Class57) this).anInt6595 * -756608695; i++) {
			if (class330_sub46.readUnsignedByte(1748979937) == 1)
				((Class57) this).aClass56Array6598[i] = new Class56();
		}
		for (int i = 0; i < -756608695 * ((Class57) this).anInt6595; i++) {
			if (null != ((Class57) this).aClass56Array6598[i])
				((Class57) this).aClass56Array6598[i].aBoolean533 = class330_sub46.readUnsignedByte(2037018342) == 0;
		}
		for (int i = 0; i < ((Class57) this).anInt6595 * -756608695; i++) {
			if (((Class57) this).aClass56Array6598[i] != null)
				((Class57) this).aClass56Array6598[i].anInt532 = Class286.method2872(class330_sub46.readUnsignedByte(2120271196), -497372353) * -1086060503;
		}
		for (int i = 0; i < -756608695 * ((Class57) this).anInt6595; i++) {
			if (((Class57) this).aClass56Array6598[i] != null)
				((Class57) this).aClass56Array6598[i].aBoolean519 = class330_sub46.readUnsignedByte(117129674) == 1;
		}
		for (int i = 0; i < -756608695 * ((Class57) this).anInt6595; i++) {
			if (((Class57) this).aClass56Array6598[i] != null)
				((Class57) this).aClass56Array6598[i].aByte534 = class330_sub46.readByte((byte) -15);
		}
		for (int i = 0; i < ((Class57) this).anInt6595 * -756608695; i++) {
			if (((Class57) this).aClass56Array6598[i] != null)
				((Class57) this).aClass56Array6598[i].aByte529 = class330_sub46.readByte((byte) 64);
		}
		for (int i = 0; i < -756608695 * ((Class57) this).anInt6595; i++) {
			if (((Class57) this).aClass56Array6598[i] != null)
				((Class57) this).aClass56Array6598[i].aByte525 = class330_sub46.readByte((byte) 41);
		}
		for (int i = 0; i < -756608695 * ((Class57) this).anInt6595; i++) {
			if (null != ((Class57) this).aClass56Array6598[i])
				((Class57) this).aClass56Array6598[i].aByte526 = class330_sub46.readByte((byte) 22);
		}
		for (int i = 0; i < ((Class57) this).anInt6595 * -756608695; i++) {
			if (((Class57) this).aClass56Array6598[i] != null)
				((Class57) this).aClass56Array6598[i].aShort523 = (short) class330_sub46.readUnsignedShort(679553769);
		}
		for (int i = 0; i < -756608695 * ((Class57) this).anInt6595; i++) {
			if (null != ((Class57) this).aClass56Array6598[i])
				((Class57) this).aClass56Array6598[i].aByte531 = class330_sub46.readByte((byte) -61);
		}
		for (int i = 0; i < ((Class57) this).anInt6595 * -756608695; i++) {
			if (((Class57) this).aClass56Array6598[i] != null)
				((Class57) this).aClass56Array6598[i].aByte530 = class330_sub46.readByte((byte) -22);
		}
		for (int i = 0; i < -756608695 * ((Class57) this).anInt6595; i++) {
			if (null != ((Class57) this).aClass56Array6598[i])
				((Class57) this).aClass56Array6598[i].aBoolean517 = class330_sub46.readUnsignedByte(1789346909) == 1;
		}
		for (int i = 0; i < -756608695 * ((Class57) this).anInt6595; i++) {
			if (null != ((Class57) this).aClass56Array6598[i])
				((Class57) this).aClass56Array6598[i].aBoolean514 = class330_sub46.readUnsignedByte(1299676868) == 1;
		}
		for (int i = 0; i < ((Class57) this).anInt6595 * -756608695; i++) {
			if (null != ((Class57) this).aClass56Array6598[i])
				((Class57) this).aClass56Array6598[i].aByte538 = class330_sub46.readByte((byte) 96);
		}
		for (int i = 0; i < ((Class57) this).anInt6595 * -756608695; i++) {
			if (((Class57) this).aClass56Array6598[i] != null)
				((Class57) this).aClass56Array6598[i].aBoolean536 = class330_sub46.readUnsignedByte(63712429) == 1;
		}
		for (int i = 0; i < ((Class57) this).anInt6595 * -756608695; i++) {
			if (null != ((Class57) this).aClass56Array6598[i])
				((Class57) this).aClass56Array6598[i].aBoolean537 = class330_sub46.readUnsignedByte(473587085) == 1;
		}
		for (int i = 0; i < ((Class57) this).anInt6595 * -756608695; i++) {
			if (((Class57) this).aClass56Array6598[i] != null)
				((Class57) this).aClass56Array6598[i].aBoolean508 = class330_sub46.readUnsignedByte(1781059489) == 1;
		}
		for (int i = 0; i < ((Class57) this).anInt6595 * -756608695; i++) {
			if (((Class57) this).aClass56Array6598[i] != null)
				((Class57) this).aClass56Array6598[i].anInt520 = class330_sub46.readUnsignedByte(570105285) * 1396477331;
		}
		for (int i = 0; i < -756608695 * ((Class57) this).anInt6595; i++) {
			if (null != ((Class57) this).aClass56Array6598[i])
				((Class57) this).aClass56Array6598[i].anInt527 = class330_sub46.readInt((byte) 20) * 1851609729;
		}
		for (int i = 0; i < -756608695 * ((Class57) this).anInt6595; i++) {
			if (null != ((Class57) this).aClass56Array6598[i])
				((Class57) this).aClass56Array6598[i].aClass369_524 = ((Class369) Class479.method6015(Class300.method2974(-1171009251), class330_sub46.readUnsignedByte(128260349), (byte) 6));
		}
	}

	public boolean method228(int i, Class377 class377, float f, int i_37_, int i_38_, boolean bool) {
		boolean bool_39_ = true;
		if (((Class57) this).aClass56Array6598[i].aBoolean508)
			bool_39_ = ((Class57) this).aClass280_6597.method2750(i, -341415260);
		bool_39_ &= ((Class57) this).aClass280_6596.method2750(i, 387951612);
		return bool_39_;
	}

	public boolean method229(int i, Class377 class377, float f, int i_40_, int i_41_, boolean bool) {
		boolean bool_42_ = true;
		if (((Class57) this).aClass56Array6598[i].aBoolean508)
			bool_42_ = ((Class57) this).aClass280_6597.method2750(i, 1075127438);
		bool_42_ &= ((Class57) this).aClass280_6596.method2750(i, -1279341546);
		return bool_42_;
	}

	public int[] method234(int i, float f, int i_43_, int i_44_, boolean bool) {
		return method648(i, 1175437794);
	}

	public Class56 method230(int i) {
		return ((Class57) this).aClass56Array6598[i];
	}

	public void method218() {
		/* empty */
	}

	public void method232() {
		/* empty */
	}

	public void method233() {
		/* empty */
	}

	public float[] method238(int i, float f, int i_45_, int i_46_, boolean bool) {
		return method649(i, 718279427);
	}

	public int[] method223(int i, float f, int i_47_, int i_48_, boolean bool) {
		return method651(i, -1853234902);
	}

	public int[] method236(int i, float f, int i_49_, int i_50_, boolean bool) {
		return method651(i, -1853234902);
	}

	public int method227() {
		return ((Class57) this).anInt6595 * -756608695;
	}

	public int[] method220(int i, float f, int i_51_, int i_52_, boolean bool, int i_53_) {
		try {
			return method648(i, 1175437794);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cg.z(").append(')').toString());
		}
	}

	static final int method652(int i, int i_54_, int i_55_, int i_56_) {
		try {
			int i_57_ = i / i_55_;
			int i_58_ = i & i_55_ - 1;
			int i_59_ = i_54_ / i_55_;
			int i_60_ = i_54_ & i_55_ - 1;
			int i_61_ = Class170.method2039(i_57_, i_59_, (byte) -24);
			int i_62_ = Class170.method2039(1 + i_57_, i_59_, (byte) -102);
			int i_63_ = Class170.method2039(i_57_, 1 + i_59_, (byte) -113);
			int i_64_ = Class170.method2039(1 + i_57_, 1 + i_59_, (byte) -69);
			int i_65_ = Class20.method466(i_61_, i_62_, i_58_, i_55_, (byte) 40);
			int i_66_ = Class20.method466(i_63_, i_64_, i_58_, i_55_, (byte) 99);
			return Class20.method466(i_65_, i_66_, i_60_, i_55_, (byte) 84);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cg.t(").append(')').toString());
		}
	}

	static final void method653(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Gfx.method788(iComponentDefinitions, class430, 647540302);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cg.qz(").append(')').toString());
		}
	}

	static final void method654(Class430 class430, byte i) {
		try {
			int i_67_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (Class556.aClass510_6392.getItemDefinitions(i_67_, (byte) 6).value) * -1519860237;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cg.abv(").append(')').toString());
		}
	}

	static final void method655(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4378 -= -119156554;
			String string = (String) (((Class430) class430).anObjectArray4386[((Class430) class430).anInt4378 * -1378875437]);
			String string_68_ = ((String) (((Class430) class430).anObjectArray4386[1 + -1378875437 * ((Class430) class430).anInt4378]));
			Class243.method2409(string, string_68_, 2145635979);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cg.ajh(").append(')').toString());
		}
	}

	static void method656(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 - 1] = (Class131.aClass407_1502.method4752((((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 - 1]), -1796414105).anInt4083) * 1279611097;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cg.s(").append(')').toString());
		}
	}

	static final void method657(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 124953757;
			int i_69_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_70_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			int i_71_ = (((Class430) class430).anIntArray4387[2 + 1632830751 * ((Class430) class430).anInt4376]);
			Class498.method6110(8, i_69_ << 16 | i_70_, i_71_, "", (byte) -8);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cg.anm(").append(')').toString());
		}
	}

	static final void method658(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class473.method5913(iComponentDefinitions, class120, class430, 2112186201);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cg.cw(").append(')').toString());
		}
	}

	public static int method659(String string, int i) {
		try {
			return string.length() + 1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cg.u(").append(')').toString());
		}
	}
}
