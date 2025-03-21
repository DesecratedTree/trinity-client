/* Class402 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class402 {
	public int anInt4134;
	public int anInt4135;
	public int anInt4136;
	public char aChar4137;

	void method4723(Buffer class330_sub46, int i, int i_0_) {
		try {
			if (i == 1)
				aChar4137 = Class127.method1546(class330_sub46.readByte((byte) 51), -2134722093);
			else if (i == 2) {
				anInt4135 = class330_sub46.readUnsignedShort(733530470) * -703058313;
				anInt4136 = class330_sub46.readUnsignedByte(879759853) * -579979089;
				anInt4134 = class330_sub46.readUnsignedByte(863127587) * 2128451729;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qr.j(").append(')').toString());
		}
	}

	void method4724(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_1_ = class330_sub46.readUnsignedByte(180866196);
				if (0 == i_1_) {
					if (i >= 232040431) {
						/* empty */
					}
					break;
				}
				method4723(class330_sub46, i_1_, -1963315436);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qr.r(").append(')').toString());
		}
	}

	Class402() {
		/* empty */
	}

	static void createColorPallette(byte i) {
		try {
			if (Console.colorArray == null) {
				Console.colorArray = new int[65536];
				Console.anIntArray4265 = new int[65536];
				double d = 0.7 + (Math.random() * 0.03 - 0.015);//random, srs!!!
				for (int i_2_ = 0; i_2_ < 65536; i_2_++) {
					double d_3_ = (double) (i_2_ >> 10 & 0x3f) / 64.0 + 0.0078125;
					double d_4_ = (double) (i_2_ >> 7 & 0x7) / 8.0 + 0.0625;
					double d_5_ = (double) (i_2_ & 0x7f) / 128.0;
					double d_6_ = d_5_;
					double d_7_ = d_5_;
					double d_8_ = d_5_;
					if (d_4_ != 0.0) {
						double d_9_;
						if (d_5_ < 0.5)
							d_9_ = (1.0 + d_4_) * d_5_;
						else
							d_9_ = d_5_ + d_4_ - d_4_ * d_5_;
						double d_10_ = 2.0 * d_5_ - d_9_;
						double d_11_ = 0.3333333333333333 + d_3_;
						if (d_11_ > 1.0)
							d_11_--;
						double d_12_ = d_3_;
						double d_13_ = d_3_ - 0.3333333333333333;
						if (d_13_ < 0.0)
							d_13_++;
						if (6.0 * d_11_ < 1.0)
							d_6_ = d_11_ * (6.0 * (d_9_ - d_10_)) + d_10_;
						else if (d_11_ * 2.0 < 1.0)
							d_6_ = d_9_;
						else if (3.0 * d_11_ < 2.0)
							d_6_ = d_10_ + 6.0 * ((0.6666666666666666 - d_11_) * (d_9_ - d_10_));
						else
							d_6_ = d_10_;
						if (d_12_ * 6.0 < 1.0)
							d_7_ = d_10_ + 6.0 * (d_9_ - d_10_) * d_12_;
						else if (d_12_ * 2.0 < 1.0)
							d_7_ = d_9_;
						else if (d_12_ * 3.0 < 2.0)
							d_7_ = ((0.6666666666666666 - d_12_) * (d_9_ - d_10_) * 6.0) + d_10_;
						else
							d_7_ = d_10_;
						if (d_13_ * 6.0 < 1.0)
							d_8_ = d_10_ + (d_9_ - d_10_) * 6.0 * d_13_;
						else if (d_13_ * 2.0 < 1.0)
							d_8_ = d_9_;
						else if (d_13_ * 3.0 < 2.0)
							d_8_ = d_10_ + (d_9_ - d_10_) * (0.6666666666666666 - d_13_) * 6.0;
						else
							d_8_ = d_10_;
					}
					d_6_ = Math.pow(d_6_, d);
					d_7_ = Math.pow(d_7_, d);
					d_8_ = Math.pow(d_8_, d);
					// Color stuff
					int i_14_ = (int) (256.0 * d_6_);
					int i_15_ = (int) (d_7_ * 256.0);
					int i_16_ = (int) (d_8_ * 256.0);
					int i_17_ = i_16_ + ((i_15_ << 8) + (i_14_ << 16));
					Console.colorArray[i_2_] = i_17_ & 0xffffff;
					int i_18_ = (i_15_ << 8) + (i_16_ << 16) + i_14_;
					Console.anIntArray4265[i_2_] = i_18_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qr.p(").append(')').toString());
		}
	}

	static final void method4726(Class430 class430, byte i) {
		try {
			int i_19_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (Console.anIntArray4263[Class356.modifyColor(i_19_, (byte) 1) & 0xffff]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qr.ze(").append(')').toString());
		}
	}
}
