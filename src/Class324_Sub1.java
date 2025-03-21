/* Class324_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class324_Sub1 extends Class324 {
	IndexTable aClass280_7463;
	byte[][] aByteArrayArray7464 = new byte[10][];
	Buffer aClass330_Sub46_7465 = new Buffer(null);
	int anInt7466;
	int[] anIntArray7467;
	int anInt7468;
	static int anInt7469 = 10;
	Buffer aClass330_Sub46_7470 = new Buffer(null);

	int method3193(byte[] is) throws IOException {
		if (((Class324_Sub1) this).anIntArray7467 == null) {
			if (!((Class324_Sub1) this).aClass280_7463.hasStoredFile(((Class324_Sub1) this).anInt7466 * 768462489, 0, (byte) 32))
				return 0;
			byte[] is_0_ = (((Class324_Sub1) this).aClass280_7463.getFile(768462489 * ((Class324_Sub1) this).anInt7466, 0));
			if (null == is_0_)
				throw new IllegalStateException("");
			((Class324_Sub1) this).aClass330_Sub46_7470.payload = is_0_;
			((Class324_Sub1) this).aClass330_Sub46_7470.offset = 0;
			int i = is_0_.length >> 1;
			((Class324_Sub1) this).anIntArray7467 = new int[i];
			for (int i_1_ = 0; i_1_ < i; i_1_++)
				((Class324_Sub1) this).anIntArray7467[i_1_] = ((Class324_Sub1) this).aClass330_Sub46_7470.readUnsignedShort(1525848161);
		}
		if (-646405669 * ((Class324_Sub1) this).anInt7468 >= ((Class324_Sub1) this).anIntArray7467.length)
			return -1;
		method3203(-928633477);
		((Class324_Sub1) this).aClass330_Sub46_7470.payload = is;
		((Class324_Sub1) this).aClass330_Sub46_7470.offset = 0;
		while_11_: do {
			do {
				if ((((Class324_Sub1) this).aClass330_Sub46_7470.offset * -824785231) >= (((Class324_Sub1) this).aClass330_Sub46_7470.payload).length)
					break while_11_;
				if (null == (((Class324_Sub1) this).aClass330_Sub46_7465.payload)) {
					if (((Class324_Sub1) this).aByteArrayArray7464[0] == null) {
						((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
						return ((((Class324_Sub1) this).aClass330_Sub46_7470.offset) * -824785231);
					}
					((Class324_Sub1) this).aClass330_Sub46_7465.payload = ((Class324_Sub1) this).aByteArrayArray7464[0];
				}
				int i = ((((Class324_Sub1) this).aClass330_Sub46_7470.payload).length - -824785231 * (((Class324_Sub1) this).aClass330_Sub46_7470.offset));
				int i_2_ = ((((Class324_Sub1) this).aClass330_Sub46_7465.payload).length - -824785231 * (((Class324_Sub1) this).aClass330_Sub46_7465.offset));
				if (i < i_2_) {
					((Class324_Sub1) this).aClass330_Sub46_7465.readBytes((((Class324_Sub1) this).aClass330_Sub46_7470.payload), (((Class324_Sub1) this).aClass330_Sub46_7470.offset * -824785231), i, 1274334002);
					((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
					return is.length;
				}
				((Class324_Sub1) this).aClass330_Sub46_7470.method3749((((Class324_Sub1) this).aClass330_Sub46_7465.payload), (-824785231 * ((Class324_Sub1) this).aClass330_Sub46_7465.offset), i_2_, (byte) -93);
				((Class324_Sub1) this).aClass330_Sub46_7465.payload = null;
				((Class324_Sub1) this).aClass330_Sub46_7465.offset = 0;
				((Class324_Sub1) this).anInt7468 += -1032818093;
				for (int i_3_ = 0; i_3_ < 9; i_3_++)
					((Class324_Sub1) this).aByteArrayArray7464[i_3_] = ((Class324_Sub1) this).aByteArrayArray7464[1 + i_3_];
				((Class324_Sub1) this).aByteArrayArray7464[9] = null;
			} while (-646405669 * ((Class324_Sub1) this).anInt7468 < ((Class324_Sub1) this).anIntArray7467.length);
			((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
			return (-824785231 * ((Class324_Sub1) this).aClass330_Sub46_7470.offset);
		} while (false);
		((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
		return is.length;
	}

	int method3194(byte[] is) throws IOException {
		if (((Class324_Sub1) this).anIntArray7467 == null) {
			if (!((Class324_Sub1) this).aClass280_7463.hasStoredFile(((Class324_Sub1) this).anInt7466 * 768462489, 0, (byte) 32))
				return 0;
			byte[] is_4_ = (((Class324_Sub1) this).aClass280_7463.getFile(768462489 * ((Class324_Sub1) this).anInt7466, 0));
			if (null == is_4_)
				throw new IllegalStateException("");
			((Class324_Sub1) this).aClass330_Sub46_7470.payload = is_4_;
			((Class324_Sub1) this).aClass330_Sub46_7470.offset = 0;
			int i = is_4_.length >> 1;
			((Class324_Sub1) this).anIntArray7467 = new int[i];
			for (int i_5_ = 0; i_5_ < i; i_5_++)
				((Class324_Sub1) this).anIntArray7467[i_5_] = ((Class324_Sub1) this).aClass330_Sub46_7470.readUnsignedShort(1514042031);
		}
		if (-646405669 * ((Class324_Sub1) this).anInt7468 >= ((Class324_Sub1) this).anIntArray7467.length)
			return -1;
		method3203(-604233515);
		((Class324_Sub1) this).aClass330_Sub46_7470.payload = is;
		((Class324_Sub1) this).aClass330_Sub46_7470.offset = 0;
		while_12_: do {
			do {
				if ((((Class324_Sub1) this).aClass330_Sub46_7470.offset * -824785231) >= (((Class324_Sub1) this).aClass330_Sub46_7470.payload).length)
					break while_12_;
				if (null == (((Class324_Sub1) this).aClass330_Sub46_7465.payload)) {
					if (((Class324_Sub1) this).aByteArrayArray7464[0] == null) {
						((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
						return ((((Class324_Sub1) this).aClass330_Sub46_7470.offset) * -824785231);
					}
					((Class324_Sub1) this).aClass330_Sub46_7465.payload = ((Class324_Sub1) this).aByteArrayArray7464[0];
				}
				int i = ((((Class324_Sub1) this).aClass330_Sub46_7470.payload).length - -824785231 * (((Class324_Sub1) this).aClass330_Sub46_7470.offset));
				int i_6_ = ((((Class324_Sub1) this).aClass330_Sub46_7465.payload).length - -824785231 * (((Class324_Sub1) this).aClass330_Sub46_7465.offset));
				if (i < i_6_) {
					((Class324_Sub1) this).aClass330_Sub46_7465.readBytes((((Class324_Sub1) this).aClass330_Sub46_7470.payload), (((Class324_Sub1) this).aClass330_Sub46_7470.offset * -824785231), i, 1274334002);
					((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
					return is.length;
				}
				((Class324_Sub1) this).aClass330_Sub46_7470.method3749((((Class324_Sub1) this).aClass330_Sub46_7465.payload), (-824785231 * ((Class324_Sub1) this).aClass330_Sub46_7465.offset), i_6_, (byte) -76);
				((Class324_Sub1) this).aClass330_Sub46_7465.payload = null;
				((Class324_Sub1) this).aClass330_Sub46_7465.offset = 0;
				((Class324_Sub1) this).anInt7468 += -1032818093;
				for (int i_7_ = 0; i_7_ < 9; i_7_++)
					((Class324_Sub1) this).aByteArrayArray7464[i_7_] = ((Class324_Sub1) this).aByteArrayArray7464[1 + i_7_];
				((Class324_Sub1) this).aByteArrayArray7464[9] = null;
			} while (-646405669 * ((Class324_Sub1) this).anInt7468 < ((Class324_Sub1) this).anIntArray7467.length);
			((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
			return (-824785231 * ((Class324_Sub1) this).aClass330_Sub46_7470.offset);
		} while (false);
		((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
		return is.length;
	}

	int method3181(byte[] is, byte i) throws IOException {
		try {
			if (((Class324_Sub1) this).anIntArray7467 == null) {
				if (!((Class324_Sub1) this).aClass280_7463.hasStoredFile(((Class324_Sub1) this).anInt7466 * 768462489, 0, (byte) 32))
					return 0;
				byte[] is_8_ = (((Class324_Sub1) this).aClass280_7463.getFile(768462489 * ((Class324_Sub1) this).anInt7466, 0));
				if (null == is_8_)
					throw new IllegalStateException("");
				((Class324_Sub1) this).aClass330_Sub46_7470.payload = is_8_;
				((Class324_Sub1) this).aClass330_Sub46_7470.offset = 0;
				int i_9_ = is_8_.length >> 1;
				((Class324_Sub1) this).anIntArray7467 = new int[i_9_];
				for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
					((Class324_Sub1) this).anIntArray7467[i_10_] = ((Class324_Sub1) this).aClass330_Sub46_7470.readUnsignedShort(1692619087);
			}
			if (-646405669 * ((Class324_Sub1) this).anInt7468 >= ((Class324_Sub1) this).anIntArray7467.length)
				return -1;
			method3203(306486370);
			((Class324_Sub1) this).aClass330_Sub46_7470.payload = is;
			((Class324_Sub1) this).aClass330_Sub46_7470.offset = 0;
			while_13_: do {
				do {
					if ((((Class324_Sub1) this).aClass330_Sub46_7470.offset * -824785231) >= (((Class324_Sub1) this).aClass330_Sub46_7470.payload).length)
						break while_13_;
					if (null == (((Class324_Sub1) this).aClass330_Sub46_7465.payload)) {
						if (((Class324_Sub1) this).aByteArrayArray7464[0] == null) {
							((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
							return ((((Class324_Sub1) this).aClass330_Sub46_7470.offset) * -824785231);
						}
						((Class324_Sub1) this).aClass330_Sub46_7465.payload = ((Class324_Sub1) this).aByteArrayArray7464[0];
					}
					int i_11_ = ((((Class324_Sub1) this).aClass330_Sub46_7470.payload).length - -824785231 * (((Class324_Sub1) this).aClass330_Sub46_7470.offset));
					int i_12_ = ((((Class324_Sub1) this).aClass330_Sub46_7465.payload).length - -824785231 * (((Class324_Sub1) this).aClass330_Sub46_7465.offset));
					if (i_11_ < i_12_) {
						((Class324_Sub1) this).aClass330_Sub46_7465.readBytes((((Class324_Sub1) this).aClass330_Sub46_7470.payload), (((Class324_Sub1) this).aClass330_Sub46_7470.offset) * -824785231, i_11_, 1274334002);
						((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
						return is.length;
					}
					((Class324_Sub1) this).aClass330_Sub46_7470.method3749((((Class324_Sub1) this).aClass330_Sub46_7465.payload), -824785231 * (((Class324_Sub1) this).aClass330_Sub46_7465.offset), i_12_, (byte) -35);
					((Class324_Sub1) this).aClass330_Sub46_7465.payload = null;
					((Class324_Sub1) this).aClass330_Sub46_7465.offset = 0;
					((Class324_Sub1) this).anInt7468 += -1032818093;
					for (int i_13_ = 0; i_13_ < 9; i_13_++)
						((Class324_Sub1) this).aByteArrayArray7464[i_13_] = (((Class324_Sub1) this).aByteArrayArray7464[1 + i_13_]);
					((Class324_Sub1) this).aByteArrayArray7464[9] = null;
				} while (-646405669 * ((Class324_Sub1) this).anInt7468 < ((Class324_Sub1) this).anIntArray7467.length);
				((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
				return -824785231 * (((Class324_Sub1) this).aClass330_Sub46_7470.offset);
			} while (false);
			((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
			return is.length;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aen.r(").append(')').toString());
		}
	}

	int method3192(byte[] is) throws IOException {
		if (((Class324_Sub1) this).anIntArray7467 == null) {
			if (!((Class324_Sub1) this).aClass280_7463.hasStoredFile(((Class324_Sub1) this).anInt7466 * 768462489, 0, (byte) 32))
				return 0;
			byte[] is_14_ = (((Class324_Sub1) this).aClass280_7463.getFile(768462489 * ((Class324_Sub1) this).anInt7466, 0));
			if (null == is_14_)
				throw new IllegalStateException("");
			((Class324_Sub1) this).aClass330_Sub46_7470.payload = is_14_;
			((Class324_Sub1) this).aClass330_Sub46_7470.offset = 0;
			int i = is_14_.length >> 1;
			((Class324_Sub1) this).anIntArray7467 = new int[i];
			for (int i_15_ = 0; i_15_ < i; i_15_++)
				((Class324_Sub1) this).anIntArray7467[i_15_] = ((Class324_Sub1) this).aClass330_Sub46_7470.readUnsignedShort(1824220363);
		}
		if (-646405669 * ((Class324_Sub1) this).anInt7468 >= ((Class324_Sub1) this).anIntArray7467.length)
			return -1;
		method3203(957942079);
		((Class324_Sub1) this).aClass330_Sub46_7470.payload = is;
		((Class324_Sub1) this).aClass330_Sub46_7470.offset = 0;
		while_14_: do {
			do {
				if ((((Class324_Sub1) this).aClass330_Sub46_7470.offset * -824785231) >= (((Class324_Sub1) this).aClass330_Sub46_7470.payload).length)
					break while_14_;
				if (null == (((Class324_Sub1) this).aClass330_Sub46_7465.payload)) {
					if (((Class324_Sub1) this).aByteArrayArray7464[0] == null) {
						((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
						return ((((Class324_Sub1) this).aClass330_Sub46_7470.offset) * -824785231);
					}
					((Class324_Sub1) this).aClass330_Sub46_7465.payload = ((Class324_Sub1) this).aByteArrayArray7464[0];
				}
				int i = ((((Class324_Sub1) this).aClass330_Sub46_7470.payload).length - -824785231 * (((Class324_Sub1) this).aClass330_Sub46_7470.offset));
				int i_16_ = ((((Class324_Sub1) this).aClass330_Sub46_7465.payload).length - -824785231 * (((Class324_Sub1) this).aClass330_Sub46_7465.offset));
				if (i < i_16_) {
					((Class324_Sub1) this).aClass330_Sub46_7465.readBytes((((Class324_Sub1) this).aClass330_Sub46_7470.payload), (((Class324_Sub1) this).aClass330_Sub46_7470.offset * -824785231), i, 1274334002);
					((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
					return is.length;
				}
				((Class324_Sub1) this).aClass330_Sub46_7470.method3749((((Class324_Sub1) this).aClass330_Sub46_7465.payload), (-824785231 * ((Class324_Sub1) this).aClass330_Sub46_7465.offset), i_16_, (byte) -67);
				((Class324_Sub1) this).aClass330_Sub46_7465.payload = null;
				((Class324_Sub1) this).aClass330_Sub46_7465.offset = 0;
				((Class324_Sub1) this).anInt7468 += -1032818093;
				for (int i_17_ = 0; i_17_ < 9; i_17_++)
					((Class324_Sub1) this).aByteArrayArray7464[i_17_] = (((Class324_Sub1) this).aByteArrayArray7464[1 + i_17_]);
				((Class324_Sub1) this).aByteArrayArray7464[9] = null;
			} while (-646405669 * ((Class324_Sub1) this).anInt7468 < ((Class324_Sub1) this).anIntArray7467.length);
			((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
			return (-824785231 * ((Class324_Sub1) this).aClass330_Sub46_7470.offset);
		} while (false);
		((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
		return is.length;
	}

	public void method3203(int i) {
		try {
			if (((Class324_Sub1) this).anIntArray7467 != null) {
				for (int i_18_ = 0; (i_18_ < 10 && (i_18_ + ((Class324_Sub1) this).anInt7468 * -646405669 < ((Class324_Sub1) this).anIntArray7467.length)); i_18_++) {
					if ((((Class324_Sub1) this).aByteArrayArray7464[i_18_] == null) && (((Class324_Sub1) this).aClass280_7463.hasStoredFile((((Class324_Sub1) this).anIntArray7467[(-646405669 * ((Class324_Sub1) this).anInt7468 + i_18_)]), 0, (byte) 32)))
						((Class324_Sub1) this).aByteArrayArray7464[i_18_] = (((Class324_Sub1) this).aClass280_7463.getFile((((Class324_Sub1) this).anIntArray7467[(((Class324_Sub1) this).anInt7468 * -646405669) + i_18_]), 0));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aen.ah(").append(')').toString());
		}
	}

	public Class324_Sub1(int i, IndexTable class280, int i_19_) {
		super(i);
		((Class324_Sub1) this).aClass280_7463 = class280;
		((Class324_Sub1) this).anInt7466 = i_19_ * 1124771241;
	}

	int method3195(byte[] is) throws IOException {
		if (((Class324_Sub1) this).anIntArray7467 == null) {
			if (!((Class324_Sub1) this).aClass280_7463.hasStoredFile(((Class324_Sub1) this).anInt7466 * 768462489, 0, (byte) 32))
				return 0;
			byte[] is_20_ = (((Class324_Sub1) this).aClass280_7463.getFile(768462489 * ((Class324_Sub1) this).anInt7466, 0));
			if (null == is_20_)
				throw new IllegalStateException("");
			((Class324_Sub1) this).aClass330_Sub46_7470.payload = is_20_;
			((Class324_Sub1) this).aClass330_Sub46_7470.offset = 0;
			int i = is_20_.length >> 1;
			((Class324_Sub1) this).anIntArray7467 = new int[i];
			for (int i_21_ = 0; i_21_ < i; i_21_++)
				((Class324_Sub1) this).anIntArray7467[i_21_] = ((Class324_Sub1) this).aClass330_Sub46_7470.readUnsignedShort(-285198389);
		}
		if (-646405669 * ((Class324_Sub1) this).anInt7468 >= ((Class324_Sub1) this).anIntArray7467.length)
			return -1;
		method3203(-580793514);
		((Class324_Sub1) this).aClass330_Sub46_7470.payload = is;
		((Class324_Sub1) this).aClass330_Sub46_7470.offset = 0;
		while_15_: do {
			do {
				if ((((Class324_Sub1) this).aClass330_Sub46_7470.offset * -824785231) >= (((Class324_Sub1) this).aClass330_Sub46_7470.payload).length)
					break while_15_;
				if (null == (((Class324_Sub1) this).aClass330_Sub46_7465.payload)) {
					if (((Class324_Sub1) this).aByteArrayArray7464[0] == null) {
						((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
						return ((((Class324_Sub1) this).aClass330_Sub46_7470.offset) * -824785231);
					}
					((Class324_Sub1) this).aClass330_Sub46_7465.payload = ((Class324_Sub1) this).aByteArrayArray7464[0];
				}
				int i = ((((Class324_Sub1) this).aClass330_Sub46_7470.payload).length - -824785231 * (((Class324_Sub1) this).aClass330_Sub46_7470.offset));
				int i_22_ = ((((Class324_Sub1) this).aClass330_Sub46_7465.payload).length - -824785231 * (((Class324_Sub1) this).aClass330_Sub46_7465.offset));
				if (i < i_22_) {
					((Class324_Sub1) this).aClass330_Sub46_7465.readBytes((((Class324_Sub1) this).aClass330_Sub46_7470.payload), (((Class324_Sub1) this).aClass330_Sub46_7470.offset * -824785231), i, 1274334002);
					((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
					return is.length;
				}
				((Class324_Sub1) this).aClass330_Sub46_7470.method3749((((Class324_Sub1) this).aClass330_Sub46_7465.payload), (-824785231 * ((Class324_Sub1) this).aClass330_Sub46_7465.offset), i_22_, (byte) -43);
				((Class324_Sub1) this).aClass330_Sub46_7465.payload = null;
				((Class324_Sub1) this).aClass330_Sub46_7465.offset = 0;
				((Class324_Sub1) this).anInt7468 += -1032818093;
				for (int i_23_ = 0; i_23_ < 9; i_23_++)
					((Class324_Sub1) this).aByteArrayArray7464[i_23_] = (((Class324_Sub1) this).aByteArrayArray7464[1 + i_23_]);
				((Class324_Sub1) this).aByteArrayArray7464[9] = null;
			} while (-646405669 * ((Class324_Sub1) this).anInt7468 < ((Class324_Sub1) this).anIntArray7467.length);
			((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
			return (-824785231 * ((Class324_Sub1) this).aClass330_Sub46_7470.offset);
		} while (false);
		((Class324_Sub1) this).aClass330_Sub46_7470.payload = null;
		return is.length;
	}
}
