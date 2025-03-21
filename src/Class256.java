/* Class256 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class256 {
	static float[] aFloatArray2665 = new float[16384];
	static float[] aFloatArray2666 = new float[16384];

	Class256() throws Throwable {
		throw new Error();
	}

	static {
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			aFloatArray2665[i] = (float) Math.sin((double) i * d);
			aFloatArray2666[i] = (float) Math.cos((double) i * d);
		}
	}
}
