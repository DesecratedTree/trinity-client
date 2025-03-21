/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class55 {
	static float[] aFloatArray506 = new float[16384];
	static float[] aFloatArray507 = new float[16384];

	static {
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			aFloatArray506[i] = (float) Math.sin((double) i * d);
			aFloatArray507[i] = (float) Math.cos((double) i * d);
		}
	}

	Class55() throws Throwable {
		throw new Error();
	}
}
