/* Class223_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class223_Sub2 extends Class223 {
	int anInt7360;
	int anInt7361;
	int anInt7362;
	int anInt7363;
	int anInt7364;
	int anInt7365;
	int anInt7366;
	int anInt7367;
	byte[] aByteArray7368;

	void method2275() {
		((Class223_Sub2) this).anInt7364 = 0;
		((Class223_Sub2) this).anInt7365 = 0;
	}

	void method2276(int i, int i_0_) {
		if (i != 0) {
			((Class223_Sub2) this).anInt7363 = (((Class223_Sub2) this).anInt7360 * ((Class223_Sub2) this).anInt7366) >> 12;
			if (((Class223_Sub2) this).anInt7363 < 0)
				((Class223_Sub2) this).anInt7363 = 0;
			else if (((Class223_Sub2) this).anInt7363 > 4096)
				((Class223_Sub2) this).anInt7363 = 4096;
			((Class223_Sub2) this).anInt7360 = ((Class223_Sub2) this).anInt7367 - (i_0_ < 0 ? -i_0_ : i_0_);
			((Class223_Sub2) this).anInt7360 = (((Class223_Sub2) this).anInt7360 * ((Class223_Sub2) this).anInt7360) >> 12;
			((Class223_Sub2) this).anInt7360 = (((Class223_Sub2) this).anInt7360 * ((Class223_Sub2) this).anInt7363) >> 12;
			((Class223_Sub2) this).anInt7365 += (((Class223_Sub2) this).anInt7360 * ((Class223_Sub2) this).anInt7361) >> 12;
			((Class223_Sub2) this).anInt7361 = (((Class223_Sub2) this).anInt7361 * ((Class223_Sub2) this).anInt7362) >> 12;
		} else {
			((Class223_Sub2) this).anInt7360 = ((Class223_Sub2) this).anInt7367 - (i_0_ < 0 ? -i_0_ : i_0_);
			((Class223_Sub2) this).anInt7360 = (((Class223_Sub2) this).anInt7360 * ((Class223_Sub2) this).anInt7360) >> 12;
			((Class223_Sub2) this).anInt7363 = 4096;
			((Class223_Sub2) this).anInt7365 = ((Class223_Sub2) this).anInt7360;
		}
	}

	void method2288() {
		((Class223_Sub2) this).anInt7361 = ((Class223_Sub2) this).anInt7362;
		((Class223_Sub2) this).anInt7365 >>= 4;
		if (((Class223_Sub2) this).anInt7365 < 0)
			((Class223_Sub2) this).anInt7365 = 0;
		else if (((Class223_Sub2) this).anInt7365 > 255)
			((Class223_Sub2) this).anInt7365 = 255;
		method2294(((Class223_Sub2) this).anInt7364++, (byte) ((Class223_Sub2) this).anInt7365);
		((Class223_Sub2) this).anInt7365 = 0;
	}

	Class223_Sub2(int i, int i_1_, int i_2_, int i_3_, int i_4_, float f, float f_5_, float f_6_) {
		super(i, i_1_, i_2_, i_3_, i_4_);
		((Class223_Sub2) this).anInt7366 = (int) (f_6_ * 4096.0F);
		((Class223_Sub2) this).anInt7367 = (int) (f_5_ * 4096.0F);
		((Class223_Sub2) this).anInt7361 = ((Class223_Sub2) this).anInt7362 = (int) (Math.pow(0.5, (double) -f) * 4096.0);
	}

	void method2287(int i, int i_7_) {
		if (i != 0) {
			((Class223_Sub2) this).anInt7363 = (((Class223_Sub2) this).anInt7360 * ((Class223_Sub2) this).anInt7366) >> 12;
			if (((Class223_Sub2) this).anInt7363 < 0)
				((Class223_Sub2) this).anInt7363 = 0;
			else if (((Class223_Sub2) this).anInt7363 > 4096)
				((Class223_Sub2) this).anInt7363 = 4096;
			((Class223_Sub2) this).anInt7360 = ((Class223_Sub2) this).anInt7367 - (i_7_ < 0 ? -i_7_ : i_7_);
			((Class223_Sub2) this).anInt7360 = (((Class223_Sub2) this).anInt7360 * ((Class223_Sub2) this).anInt7360) >> 12;
			((Class223_Sub2) this).anInt7360 = (((Class223_Sub2) this).anInt7360 * ((Class223_Sub2) this).anInt7363) >> 12;
			((Class223_Sub2) this).anInt7365 += (((Class223_Sub2) this).anInt7360 * ((Class223_Sub2) this).anInt7361) >> 12;
			((Class223_Sub2) this).anInt7361 = (((Class223_Sub2) this).anInt7361 * ((Class223_Sub2) this).anInt7362) >> 12;
		} else {
			((Class223_Sub2) this).anInt7360 = ((Class223_Sub2) this).anInt7367 - (i_7_ < 0 ? -i_7_ : i_7_);
			((Class223_Sub2) this).anInt7360 = (((Class223_Sub2) this).anInt7360 * ((Class223_Sub2) this).anInt7360) >> 12;
			((Class223_Sub2) this).anInt7363 = 4096;
			((Class223_Sub2) this).anInt7365 = ((Class223_Sub2) this).anInt7360;
		}
	}

	void method2283() {
		((Class223_Sub2) this).anInt7364 = 0;
		((Class223_Sub2) this).anInt7365 = 0;
	}

	void method2294(int i, byte i_8_) {
		((Class223_Sub2) this).aByteArray7368[i] = i_8_;
	}

	void method2281() {
		((Class223_Sub2) this).anInt7364 = 0;
		((Class223_Sub2) this).anInt7365 = 0;
	}

	void method2285() {
		((Class223_Sub2) this).anInt7361 = ((Class223_Sub2) this).anInt7362;
		((Class223_Sub2) this).anInt7365 >>= 4;
		if (((Class223_Sub2) this).anInt7365 < 0)
			((Class223_Sub2) this).anInt7365 = 0;
		else if (((Class223_Sub2) this).anInt7365 > 255)
			((Class223_Sub2) this).anInt7365 = 255;
		method2294(((Class223_Sub2) this).anInt7364++, (byte) ((Class223_Sub2) this).anInt7365);
		((Class223_Sub2) this).anInt7365 = 0;
	}

	void method2286() {
		((Class223_Sub2) this).anInt7361 = ((Class223_Sub2) this).anInt7362;
		((Class223_Sub2) this).anInt7365 >>= 4;
		if (((Class223_Sub2) this).anInt7365 < 0)
			((Class223_Sub2) this).anInt7365 = 0;
		else if (((Class223_Sub2) this).anInt7365 > 255)
			((Class223_Sub2) this).anInt7365 = 255;
		method2294(((Class223_Sub2) this).anInt7364++, (byte) ((Class223_Sub2) this).anInt7365);
		((Class223_Sub2) this).anInt7365 = 0;
	}

	void method2284() {
		((Class223_Sub2) this).anInt7364 = 0;
		((Class223_Sub2) this).anInt7365 = 0;
	}

	void method2282(int i, int i_9_) {
		if (i != 0) {
			((Class223_Sub2) this).anInt7363 = (((Class223_Sub2) this).anInt7360 * ((Class223_Sub2) this).anInt7366) >> 12;
			if (((Class223_Sub2) this).anInt7363 < 0)
				((Class223_Sub2) this).anInt7363 = 0;
			else if (((Class223_Sub2) this).anInt7363 > 4096)
				((Class223_Sub2) this).anInt7363 = 4096;
			((Class223_Sub2) this).anInt7360 = ((Class223_Sub2) this).anInt7367 - (i_9_ < 0 ? -i_9_ : i_9_);
			((Class223_Sub2) this).anInt7360 = (((Class223_Sub2) this).anInt7360 * ((Class223_Sub2) this).anInt7360) >> 12;
			((Class223_Sub2) this).anInt7360 = (((Class223_Sub2) this).anInt7360 * ((Class223_Sub2) this).anInt7363) >> 12;
			((Class223_Sub2) this).anInt7365 += (((Class223_Sub2) this).anInt7360 * ((Class223_Sub2) this).anInt7361) >> 12;
			((Class223_Sub2) this).anInt7361 = (((Class223_Sub2) this).anInt7361 * ((Class223_Sub2) this).anInt7362) >> 12;
		} else {
			((Class223_Sub2) this).anInt7360 = ((Class223_Sub2) this).anInt7367 - (i_9_ < 0 ? -i_9_ : i_9_);
			((Class223_Sub2) this).anInt7360 = (((Class223_Sub2) this).anInt7360 * ((Class223_Sub2) this).anInt7360) >> 12;
			((Class223_Sub2) this).anInt7363 = 4096;
			((Class223_Sub2) this).anInt7365 = ((Class223_Sub2) this).anInt7360;
		}
	}
}
