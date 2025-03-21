/* Class298 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298 {
	int[] anIntArray3052;
	int anInt3053;
	int[] anIntArray3054;
	int anInt3055;

	Class298() {
		Class330_Sub41.method3694(16);
		((Class298) this).anInt3053 = (Class330_Sub41.method3698() != 0 ? Class330_Sub41.method3694(4) + 1 : 1);
		if (Class330_Sub41.method3698() != 0)
			Class330_Sub41.method3694(8);
		Class330_Sub41.method3694(2);
		if (((Class298) this).anInt3053 > 1)
			((Class298) this).anInt3055 = Class330_Sub41.method3694(4);
		((Class298) this).anIntArray3054 = new int[((Class298) this).anInt3053];
		((Class298) this).anIntArray3052 = new int[((Class298) this).anInt3053];
		for (int i = 0; i < ((Class298) this).anInt3053; i++) {
			Class330_Sub41.method3694(8);
			((Class298) this).anIntArray3054[i] = Class330_Sub41.method3694(8);
			((Class298) this).anIntArray3052[i] = Class330_Sub41.method3694(8);
		}
	}
}
