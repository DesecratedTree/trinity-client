/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class84 {
	static short[] aShortArray684;
	static short[] aShortArray685;
	int anInt686;
	static short[] aShortArray687;
	static int anInt688 = 2;
	static byte[] aByteArray689;
	static short[] aShortArray690;
	short[] aShortArray691;
	Class330_Sub18 aClass330_Sub18_692 = null;
	short[] aShortArray693;
	short[] aShortArray694;
	short[] aShortArray695;
	short[] aShortArray696;
	byte[] aByteArray697;
	boolean aBoolean698;
	boolean aBoolean699;
	boolean aBoolean700;
	static int anInt701 = 1;
	static short[] aShortArray702 = new short[500];
	static int anInt703 = 2;

	static {
		aShortArray684 = new short[500];
		aShortArray690 = new short[500];
		aShortArray687 = new short[500];
		aShortArray685 = new short[500];
		aByteArray689 = new byte[500];
	}

	Class84(byte[] is, Class330_Sub18 class330_sub18) {
		((Class84) this).anInt686 = 0;
		((Class84) this).aBoolean698 = false;
		((Class84) this).aBoolean699 = false;
		((Class84) this).aBoolean700 = false;
		((Class84) this).aClass330_Sub18_692 = class330_sub18;
		try {
			Buffer class330_sub46 = new Buffer(is);
			Buffer class330_sub46_0_ = new Buffer(is);
			class330_sub46.readUnsignedByte(691373128);
			class330_sub46.offset += 647201954;
			int i = class330_sub46.readUnsignedShort(1609296968);
			int i_1_ = 0;
			int i_2_ = -1;
			int i_3_ = -1;
			class330_sub46_0_.offset = (class330_sub46.offset * -824785231 + i) * 323600977;
			for (int i_4_ = 0; i_4_ < i; i_4_++) {
				int i_5_ = (((Class330_Sub18) ((Class84) this).aClass330_Sub18_692).anIntArray7642[i_4_]);
				if (i_5_ == 0)
					i_2_ = i_4_;
				int i_6_ = class330_sub46.readUnsignedByte(-68632903);
				if (i_6_ > 0) {
					if (i_5_ == 0)
						i_3_ = i_4_;
					aShortArray702[i_1_] = (short) i_4_;
					short i_7_ = 0;
					if (i_5_ == 3 || i_5_ == 10)
						i_7_ = (short) 128;
					if ((i_6_ & 0x1) != 0)
						aShortArray684[i_1_] = (short) class330_sub46_0_.method3764((byte) -109);
					else
						aShortArray684[i_1_] = i_7_;
					if ((i_6_ & 0x2) != 0)
						aShortArray690[i_1_] = (short) class330_sub46_0_.method3764((byte) -55);
					else
						aShortArray690[i_1_] = i_7_;
					if ((i_6_ & 0x4) != 0)
						aShortArray687[i_1_] = (short) class330_sub46_0_.method3764((byte) -68);
					else
						aShortArray687[i_1_] = i_7_;
					aByteArray689[i_1_] = (byte) (i_6_ >>> 3 & 0x3);
					if (i_5_ == 2 || i_5_ == 9) {
						aShortArray684[i_1_] = (short) (aShortArray684[i_1_] << 2 & 0x3fff);
						aShortArray690[i_1_] = (short) (aShortArray690[i_1_] << 2 & 0x3fff);
						aShortArray687[i_1_] = (short) (aShortArray687[i_1_] << 2 & 0x3fff);
					}
					aShortArray685[i_1_] = (short) -1;
					if (i_5_ == 1 || i_5_ == 2 || i_5_ == 3) {
						if (i_2_ > i_3_) {
							aShortArray685[i_1_] = (short) i_2_;
							i_3_ = i_2_;
						}
					} else if (i_5_ == 5)
						((Class84) this).aBoolean698 = true;
					else if (i_5_ == 7)
						((Class84) this).aBoolean699 = true;
					else if (i_5_ == 9 || i_5_ == 10 || i_5_ == 8)
						((Class84) this).aBoolean700 = true;
					i_1_++;
				}
			}
			if (class330_sub46_0_.offset * -824785231 != is.length)
				throw new RuntimeException();
			((Class84) this).anInt686 = i_1_;
			((Class84) this).aShortArray696 = new short[i_1_];
			((Class84) this).aShortArray691 = new short[i_1_];
			((Class84) this).aShortArray694 = new short[i_1_];
			((Class84) this).aShortArray695 = new short[i_1_];
			((Class84) this).aShortArray693 = new short[i_1_];
			((Class84) this).aByteArray697 = new byte[i_1_];
			for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
				((Class84) this).aShortArray696[i_8_] = aShortArray702[i_8_];
				((Class84) this).aShortArray691[i_8_] = aShortArray684[i_8_];
				((Class84) this).aShortArray694[i_8_] = aShortArray690[i_8_];
				((Class84) this).aShortArray695[i_8_] = aShortArray687[i_8_];
				((Class84) this).aShortArray693[i_8_] = aShortArray685[i_8_];
				((Class84) this).aByteArray697[i_8_] = aByteArray689[i_8_];
			}
		} catch (Exception exception) {
			((Class84) this).anInt686 = 0;
			((Class84) this).aBoolean698 = false;
			((Class84) this).aBoolean699 = false;
		}
	}
}
