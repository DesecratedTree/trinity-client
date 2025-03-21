/* Class330_Sub46_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;

public class Class330_Sub46_Sub1 extends Buffer {
	void method3818(float f) {
		int i = Stream.floatToRawIntBits(f);
		payload[(offset += 323600977) * -824785231 - 1] = (byte) i;
		payload[(offset += 323600977) * -824785231 - 1] = (byte) (i >> 8);
		payload[(offset += 323600977) * -824785231 - 1] = (byte) (i >> 16);
		payload[(offset += 323600977) * -824785231 - 1] = (byte) (i >> 24);
	}

	void method3819(float f) {
		int i = Stream.floatToRawIntBits(f);
		payload[(offset += 323600977) * -824785231 - 1] = (byte) (i >> 24);
		payload[(offset += 323600977) * -824785231 - 1] = (byte) (i >> 16);
		payload[(offset += 323600977) * -824785231 - 1] = (byte) (i >> 8);
		payload[(offset += 323600977) * -824785231 - 1] = (byte) i;
	}

	Class330_Sub46_Sub1(int i) {
		super(i);
	}
}
