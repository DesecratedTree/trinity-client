/* Class309 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class309 {
	int[] anIntArray3195;
	int anInt3196;
	int anInt3197;
	int anInt3198;
	int[] anIntArray3199;
	int anInt3200 = 2;
	int anInt3201;
	int anInt3202;
	int anInt3203;
	int anInt3204;
	int anInt3205;

	final void method3093(Buffer class330_sub46) {
		((Class309) this).anInt3196 = class330_sub46.readUnsignedByte(1722023152);
		((Class309) this).anInt3198 = class330_sub46.readInt((byte) 78);
		((Class309) this).anInt3197 = class330_sub46.readInt((byte) 77);
		method3094(class330_sub46);
	}

	final void method3094(Buffer class330_sub46) {
		((Class309) this).anInt3200 = class330_sub46.readUnsignedByte(2067351052);
		((Class309) this).anIntArray3195 = new int[((Class309) this).anInt3200];
		((Class309) this).anIntArray3199 = new int[((Class309) this).anInt3200];
		for (int i = 0; i < ((Class309) this).anInt3200; i++) {
			((Class309) this).anIntArray3195[i] = class330_sub46.readUnsignedShort(599821793);
			((Class309) this).anIntArray3199[i] = class330_sub46.readUnsignedShort(1746180964);
		}
	}

	final int method3095(int i) {
		if (((Class309) this).anInt3205 >= ((Class309) this).anInt3201) {
			((Class309) this).anInt3204 = (((Class309) this).anIntArray3199[((Class309) this).anInt3202++]) << 15;
			if (((Class309) this).anInt3202 >= ((Class309) this).anInt3200)
				((Class309) this).anInt3202 = ((Class309) this).anInt3200 - 1;
			((Class309) this).anInt3201 = (int) ((double) (((Class309) this).anIntArray3195[((Class309) this).anInt3202]) / 65536.0 * (double) i);
			if (((Class309) this).anInt3201 > ((Class309) this).anInt3205)
				((Class309) this).anInt3203 = ((((((Class309) this).anIntArray3199[((Class309) this).anInt3202]) << 15) - ((Class309) this).anInt3204) / (((Class309) this).anInt3201 - ((Class309) this).anInt3205));
		}
		((Class309) this).anInt3204 += ((Class309) this).anInt3203;
		((Class309) this).anInt3205++;
		return ((Class309) this).anInt3204 - ((Class309) this).anInt3203 >> 15;
	}

	final void method3096() {
		((Class309) this).anInt3201 = 0;
		((Class309) this).anInt3202 = 0;
		((Class309) this).anInt3203 = 0;
		((Class309) this).anInt3204 = 0;
		((Class309) this).anInt3205 = 0;
	}

	Class309() {
		((Class309) this).anIntArray3195 = new int[2];
		((Class309) this).anIntArray3199 = new int[2];
		((Class309) this).anIntArray3195[0] = 0;
		((Class309) this).anIntArray3195[1] = 65535;
		((Class309) this).anIntArray3199[0] = 0;
		((Class309) this).anIntArray3199[1] = 65535;
	}
}
