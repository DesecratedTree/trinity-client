
/* Class298_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AnimationFrameBase extends Class298 {
	public static int anInt7266 = 3;
	public static int anInt7267 = 1;
	int count;
	public static int anInt7269 = 0;
	public static int anInt7270 = 5;
	static int anInt7271 = 6;
	public static int anInt7272 = 7;
	public static int anInt7273 = 8;
	public static int anInt7274 = 9;
	boolean[] aBooleanArray7275;
	int key;
	public static int anInt7277 = 10;
	int[] transformationTypes;
	int[][] anIntArrayArray7279;
	int[] anIntArray7280;
	public static int anInt7281 = 2;
	
	AnimationFrameBase(int i, byte[] is, boolean osrs) {
		((AnimationFrameBase) this).key = 1362718155 * i;
		RsByteBuffer buffer = new RsByteBuffer(is);
		((AnimationFrameBase) this).count = (!osrs && Settings.RS3_ANIMATIONS ? buffer.readUnsignedShort() : buffer.readUnsignedByte()) * -1914825713;
		((AnimationFrameBase) this).transformationTypes = new int[92429039 * ((AnimationFrameBase) this).count];
		((AnimationFrameBase) this).anIntArrayArray7279 = new int[92429039 * ((AnimationFrameBase) this).count][];
		((AnimationFrameBase) this).aBooleanArray7275 = new boolean[((AnimationFrameBase) this).count * 92429039];
		((AnimationFrameBase) this).anIntArray7280 = new int[92429039 * ((AnimationFrameBase) this).count];
		
		
		for (int i_0_ = 0; i_0_ < 92429039 * ((AnimationFrameBase) this).count; i_0_++) {
			((AnimationFrameBase) this).transformationTypes[i_0_] = buffer.readUnsignedByte();
			if (((AnimationFrameBase) this).transformationTypes[i_0_] == 6)
				((AnimationFrameBase) this).transformationTypes[i_0_] = 2;
		}
		
		if (!osrs) {
			for (int i_1_ = 0; i_1_ < ((AnimationFrameBase) this).count * 92429039; i_1_++)
				((AnimationFrameBase) this).aBooleanArray7275[i_1_] = buffer.readUnsignedByte() == 1;
			for (int i_2_ = 0; i_2_ < ((AnimationFrameBase) this).count * 92429039; i_2_++)
				((AnimationFrameBase) this).anIntArray7280[i_2_] = buffer.readUnsignedShort();
		} else {
			for (int i_2_ = 0; i_2_ < ((AnimationFrameBase) this).count * 92429039; i_2_++)
				anIntArray7280[i_2_] = -1;
		}
		
		for (int i_3_ = 0; i_3_ < ((AnimationFrameBase) this).count * 92429039; i_3_++)
			((AnimationFrameBase) this).anIntArrayArray7279[i_3_] = new int[!osrs && Settings.RS3_ANIMATIONS ? buffer.readSmart((short) 0) : buffer.readUnsignedByte()];
		for (int i_4_ = 0; i_4_ < ((AnimationFrameBase) this).count * 92429039; i_4_++) {
			for (int i_5_ = 0; (i_5_ < ((AnimationFrameBase) this).anIntArrayArray7279[i_4_].length); i_5_++) {
				((AnimationFrameBase) this).anIntArrayArray7279[i_4_][i_5_] = !osrs && Settings.RS3_ANIMATIONS ? buffer.readSmart((short) 0) : buffer.readUnsignedByte();
			}
		}
	}

	static final void method2909(ClientScript2 class403, int i) {
		try {
			int i_6_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.aBooleanArray8957[i_6_] ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aax.wu(").append(')').toString());
		}
	}
}
