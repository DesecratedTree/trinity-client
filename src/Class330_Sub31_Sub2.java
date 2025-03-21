/* Class330_Sub31_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public class Class330_Sub31_Sub2 extends Class330_Sub31 {
	static int anInt9598 = 0;
	float aFloat9599;
	int anInt9600;
	int anInt9601;
	String aString9602;
	static int anInt9603 = 128;
	float aFloat9604;
	String aString9605;
	String aString9606;

	String method3422(int i) {
		try {
			return ((Class330_Sub31_Sub2) this).aString9605;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajx.n(").append(')').toString());
		}
	}

	public float method3423(byte i) {
		try {
			return ((Class330_Sub31_Sub2) this).aFloat9599;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajx.l(").append(')').toString());
		}
	}

	void method3413(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajx.i(").append(')').toString());
		}
	}

	Class330_Sub31_Sub2(OggStreamState oggstreamstate) {
		super(oggstreamstate);
	}

	void method3412(OggPacket oggpacket) {
		if (-983895715 * ((Class330_Sub31_Sub2) this).anInt7723 <= 0 || "SUB".equals(((Class330_Sub31_Sub2) this).aString9602)) {
			Buffer class330_sub46 = new Buffer(oggpacket.getData());
			int i = class330_sub46.readUnsignedByte(-168325988);
			if (-983895715 * ((Class330_Sub31_Sub2) this).anInt7723 <= 8) {
				if (0 == (i | 0x80))
					throw new IllegalStateException();
				if (0 == ((Class330_Sub31_Sub2) this).anInt7723 * -983895715) {
					class330_sub46.offset += -1147112121;
					((Class330_Sub31_Sub2) this).anInt9600 = class330_sub46.method3806((byte) 105) * -1895997225;
					((Class330_Sub31_Sub2) this).anInt9601 = class330_sub46.method3806((byte) 105) * 48056121;
					if ((1570083559 * ((Class330_Sub31_Sub2) this).anInt9600 == 0) || 0 == (((Class330_Sub31_Sub2) this).anInt9601 * -704284919))
						throw new IllegalStateException();
					Buffer class330_sub46_0_ = new Buffer(16);
					class330_sub46.readBytes(class330_sub46_0_.payload, 0, 16, 1274334002);
					((Class330_Sub31_Sub2) this).aString9605 = class330_sub46_0_.readString(946459803);
					class330_sub46_0_.offset = 0;
					class330_sub46.readBytes(class330_sub46_0_.payload, 0, 16, 1274334002);
					((Class330_Sub31_Sub2) this).aString9602 = class330_sub46_0_.readString(-494726313);
				}
			} else {
				if (0 == i) {
					long l = class330_sub46.method3798((short) -614);
					long l_1_ = class330_sub46.method3798((short) 7625);
					long l_2_ = class330_sub46.method3798((short) -14701);
					if (l < 0L || l_1_ < 0L || l_2_ < 0L || l_2_ > l)
						throw new IllegalStateException();
					((Class330_Sub31_Sub2) this).aFloat9599 = ((float) (l * (long) (-704284919 * (((Class330_Sub31_Sub2) this).anInt9601))) / (float) (((Class330_Sub31_Sub2) this).anInt9600 * 1570083559));
					((Class330_Sub31_Sub2) this).aFloat9604 = ((float) ((l + l_1_) * (long) (-704284919 * (((Class330_Sub31_Sub2) this).anInt9601))) / (float) (((Class330_Sub31_Sub2) this).anInt9600 * 1570083559));
					int i_3_ = class330_sub46.method3806((byte) 105);
					if (i_3_ < 0 || i_3_ > (class330_sub46.payload.length - -824785231 * class330_sub46.offset))
						throw new IllegalStateException();
					((Class330_Sub31_Sub2) this).aString9606 = Class330.method3257(class330_sub46.payload, (class330_sub46.offset * -824785231), i_3_, 2053819586);
				}
				if (0 != (i | 0x80))
					return;
			}
		}
	}

	void method3414() {
		/* empty */
	}

	public String method3424(byte i) {
		try {
			return ((Class330_Sub31_Sub2) this).aString9606;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajx.u(").append(')').toString());
		}
	}

	void method3415() {
		/* empty */
	}

	void method3411(OggPacket oggpacket, int i) {
		try {
			if (-983895715 * ((Class330_Sub31_Sub2) this).anInt7723 <= 0 || "SUB".equals(((Class330_Sub31_Sub2) this).aString9602)) {
				Buffer class330_sub46 = new Buffer(oggpacket.getData());
				int i_4_ = class330_sub46.readUnsignedByte(-103232237);
				if (-983895715 * ((Class330_Sub31_Sub2) this).anInt7723 <= 8) {
					if (0 == (i_4_ | 0x80))
						throw new IllegalStateException();
					if (0 == (((Class330_Sub31_Sub2) this).anInt7723 * -983895715)) {
						class330_sub46.offset += -1147112121;
						((Class330_Sub31_Sub2) this).anInt9600 = (class330_sub46.method3806((byte) 105) * -1895997225);
						((Class330_Sub31_Sub2) this).anInt9601 = class330_sub46.method3806((byte) 105) * 48056121;
						if ((1570083559 * ((Class330_Sub31_Sub2) this).anInt9600) == 0 || 0 == (((Class330_Sub31_Sub2) this).anInt9601 * -704284919))
							throw new IllegalStateException();
						Buffer class330_sub46_5_ = new Buffer(16);
						class330_sub46.readBytes((class330_sub46_5_.payload), 0, 16, 1274334002);
						((Class330_Sub31_Sub2) this).aString9605 = class330_sub46_5_.readString(995705068);
						class330_sub46_5_.offset = 0;
						class330_sub46.readBytes((class330_sub46_5_.payload), 0, 16, 1274334002);
						((Class330_Sub31_Sub2) this).aString9602 = class330_sub46_5_.readString(-1627694041);
					}
				} else {
					if (0 == i_4_) {
						long l = class330_sub46.method3798((short) 2131);
						long l_6_ = class330_sub46.method3798((short) 23229);
						long l_7_ = class330_sub46.method3798((short) 15847);
						if (l < 0L || l_6_ < 0L || l_7_ < 0L || l_7_ > l)
							throw new IllegalStateException();
						((Class330_Sub31_Sub2) this).aFloat9599 = ((float) (l * (long) (-704284919 * ((Class330_Sub31_Sub2) this).anInt9601)) / (float) ((((Class330_Sub31_Sub2) this).anInt9600) * 1570083559));
						((Class330_Sub31_Sub2) this).aFloat9604 = ((float) ((l + l_6_) * (long) (-704284919 * ((Class330_Sub31_Sub2) this).anInt9601)) / (float) ((((Class330_Sub31_Sub2) this).anInt9600) * 1570083559));
						int i_8_ = class330_sub46.method3806((byte) 105);
						if (i_8_ < 0 || (i_8_ > (class330_sub46.payload.length - -824785231 * class330_sub46.offset)))
							throw new IllegalStateException();
						((Class330_Sub31_Sub2) this).aString9606 = Class330.method3257((class330_sub46.payload), (class330_sub46.offset * -824785231), i_8_, 1825097092);
					}
					if (0 != (i_4_ | 0x80))
						return;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajx.j(").append(')').toString());
		}
	}

	public float method3425(int i) {
		try {
			return ((Class330_Sub31_Sub2) this).aFloat9604;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajx.b(").append(')').toString());
		}
	}

	static String method3426(Throwable throwable, byte i) throws IOException {
		try {
			String string;
			if (throwable instanceof RuntimeException_Sub2) {
				RuntimeException_Sub2 runtimeexception_sub2 = (RuntimeException_Sub2) throwable;
				string = new StringBuilder().append(((RuntimeException_Sub2) runtimeexception_sub2).aString6444).append(" | ").toString();
				throwable = (((RuntimeException_Sub2) runtimeexception_sub2).aThrowable6445);
			} else
				string = "";
			StringWriter stringwriter = new StringWriter();
			PrintWriter printwriter = new PrintWriter(stringwriter);
			throwable.printStackTrace(printwriter);
			printwriter.close();
			String string_9_ = stringwriter.toString();
			BufferedReader bufferedreader = new BufferedReader(new StringReader(string_9_));
			String string_10_ = bufferedreader.readLine();
			for (;;) {
				String string_11_ = bufferedreader.readLine();
				if (null == string_11_) {
					if (i <= 1)
						throw new IllegalStateException();
					break;
				}
				int i_12_ = string_11_.indexOf('(');
				int i_13_ = string_11_.indexOf(')', 1 + i_12_);
				String string_14_;
				if (i_12_ != -1)
					string_14_ = string_11_.substring(0, i_12_);
				else
					string_14_ = string_11_;
				string_14_ = string_14_.trim();
				string_14_ = string_14_.substring(string_14_.lastIndexOf(' ') + 1);
				string_14_ = string_14_.substring(string_14_.lastIndexOf('\t') + 1);
				string = new StringBuilder().append(string).append(string_14_).toString();
				if (-1 != i_12_ && -1 != i_13_) {
					int i_15_ = string_11_.indexOf(".java:", i_12_);
					if (i_15_ >= 0)
						string = new StringBuilder().append(string).append(string_11_.substring(i_15_ + 5, i_13_)).toString();
				}
				string = new StringBuilder().append(string).append(' ').toString();
			}
			string = new StringBuilder().append(string).append("| ").append(string_10_).toString();
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajx.i(").append(')').toString());
		}
	}
}
