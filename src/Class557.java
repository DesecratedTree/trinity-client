/* Class557 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.Inflater;

public class Class557 {
	Inflater anInflater6398;
	static int anInt6399;

	public Class557() {
		this(-1, 1000000, 1000000);
	}

	Class557(int i, int i_0_, int i_1_) {
		/* empty */
	}

	public byte[] method6452(byte[] is, short i) {
		try {
			Buffer class330_sub46 = new Buffer(is);
			class330_sub46.offset = 323600977 * (is.length - 4);
			int i_2_ = class330_sub46.method3806((byte) 105);
			byte[] is_3_ = new byte[i_2_];
			class330_sub46.offset = 0;
			method6453(class330_sub46, is_3_, 646057109);
			return is_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("xf.r(").append(')').toString());
		}
	}

	public void method6453(Buffer class330_sub46, byte[] is, int i) {
		try {
			if ((class330_sub46.payload[class330_sub46.offset * -824785231]) != 31 || -117 != (class330_sub46.payload[1 + -824785231 * class330_sub46.offset]))
				throw new RuntimeException("");
			if (((Class557) this).anInflater6398 == null)
				((Class557) this).anInflater6398 = new Inflater(true);
			try {
				((Class557) this).anInflater6398.setInput(class330_sub46.payload, 10 + class330_sub46.offset * -824785231, (class330_sub46.payload.length - (10 + -824785231 * class330_sub46.offset + 8)));
				((Class557) this).anInflater6398.inflate(is);
			} catch (Exception exception) {
				((Class557) this).anInflater6398.reset();
				throw new RuntimeException("");
			}
			((Class557) this).anInflater6398.reset();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("xf.j(").append(')').toString());
		}
	}

	static String method6454(int i, int i_4_, int i_5_) {
		try {
			int i_6_ = i_4_ - i;
			if (i_6_ < -9)
				return Class146.method1738(16711680, -849826454);
			if (i_6_ < -6)
				return Class146.method1738(16723968, -849826454);
			if (i_6_ < -3)
				return Class146.method1738(16740352, -849826454);
			if (i_6_ < 0)
				return Class146.method1738(16756736, -849826454);
			if (i_6_ > 9)
				return Class146.method1738(65280, -849826454);
			if (i_6_ > 6)
				return Class146.method1738(4259584, -849826454);
			if (i_6_ > 3)
				return Class146.method1738(8453888, -849826454);
			if (i_6_ > 0)
				return Class146.method1738(12648192, -849826454);
			return Class146.method1738(16776960, -849826454);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("xf.bx(").append(')').toString());
		}
	}
}
