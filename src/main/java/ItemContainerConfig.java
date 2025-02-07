/* Class298_Sub37_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ItemContainerConfig extends Class298_Sub37 {
	public int[] ids;
	static Class95 aClass95_9602;
	public int[] amounts;
	public int length;
	public int size = 0;

	void method3443(RsByteBuffer class298_sub53, int i, byte i_0_) {
		try {
			if (2 == i)
				length = class298_sub53.readUnsignedShort() * -1816799395;
			else if (4 == i) {
				size = class298_sub53.readUnsignedByte() * 2106966585;
				ids = new int[-408056823 * size];
				amounts = new int[-408056823 * size];
				for (int i_1_ = 0; i_1_ < size * -408056823; i_1_++) {
					ids[i_1_] = class298_sub53.readUnsignedShort();
					amounts[i_1_] = class298_sub53.readUnsignedShort();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aiq.f(").append(')').toString());
		}
	}

	void method3444(RsByteBuffer class298_sub53, byte i) {
		try {
			for (;;) {
				int i_2_ = class298_sub53.readUnsignedByte();
				if (0 == i_2_) {
					if (i >= 1) {
						/* empty */
					}
					break;
				}
				method3443(class298_sub53, i_2_, (byte) -87);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aiq.a(").append(')').toString());
		}
	}

	ItemContainerConfig() {
		length = 0;
	}
}
