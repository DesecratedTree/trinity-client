
import java.io.EOFException;
import java.io.IOException;

public class JagexFile {
	JagexFile2 aClass476_6045;
	static int anInt6046 = 200000000;
	long aLong6047;
	long aLong6048 = -8905853134302459951L;
	int anInt6049;
	byte[] aByteArray6050;
	long aLong6051 = -483645590008820269L;
	byte[] aByteArray6052;
	int anInt6053 = 0;
	long aLong6054;
	long aLong6055;
	long aLong6056;
	static int anInt6057;

	public void method6133(int i) throws IOException {
		try {
			method6138((byte) 63);
			((JagexFile) this).aClass476_6045.method6079(1916877965);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ty.a(").append(')').toString());
		}
	}

	public void method6134(byte[] is, int i, int i_0_, int i_1_) throws IOException {
		try {
			do {
				try {
					if ((2482753095985495469L * ((JagexFile) this).aLong6047 + (long) i_0_) > ((JagexFile) this).aLong6055 * -7034414526671508465L)
						((JagexFile) this).aLong6055 = ((2482753095985495469L * ((JagexFile) this).aLong6047) + (long) i_0_) * 1637511753732440815L;
					if (-1L != (-3151226325898744411L * ((JagexFile) this).aLong6051) && ((2482753095985495469L * ((JagexFile) this).aLong6047 < (-3151226325898744411L * ((JagexFile) this).aLong6051)) || ((((JagexFile) this).aLong6047 * 2482753095985495469L) > ((-3151226325898744411L * ((JagexFile) this).aLong6051) + (long) (447269525 * ((JagexFile) this).anInt6053)))))
						method6138((byte) 104);
					if ((-3151226325898744411L * ((JagexFile) this).aLong6051 != -1L) && ((long) i_0_ + (2482753095985495469L * ((JagexFile) this).aLong6047) > ((-3151226325898744411L * ((JagexFile) this).aLong6051) + (long) (((JagexFile) this).aByteArray6050).length))) {
						int i_2_ = (int) ((long) (((JagexFile) this).aByteArray6050).length - ((2482753095985495469L * ((JagexFile) this).aLong6047) - (((JagexFile) this).aLong6051 * -3151226325898744411L)));
						System.arraycopy(is, i, ((JagexFile) this).aByteArray6050, (int) ((2482753095985495469L * ((JagexFile) this).aLong6047) - (((JagexFile) this).aLong6051 * -3151226325898744411L)), i_2_);
						((JagexFile) this).aLong6047 += -4167043960764305883L * (long) i_2_;
						i += i_2_;
						i_0_ -= i_2_;
						((JagexFile) this).anInt6053 = (44871869 * ((JagexFile) this).aByteArray6050.length);
						method6138((byte) 18);
					}
					if (i_0_ > ((JagexFile) this).aByteArray6050.length) {
						if (-6802897060071190031L * ((JagexFile) this).aLong6056 != (2482753095985495469L * ((JagexFile) this).aLong6047)) {
							((JagexFile) this).aClass476_6045.method6077(((JagexFile) this).aLong6047 * 2482753095985495469L);
							((JagexFile) this).aLong6056 = (((JagexFile) this).aLong6047 * -4798501635493713027L);
						}
						((JagexFile) this).aClass476_6045.method6078(is, i, i_0_, -590463539);
						((JagexFile) this).aLong6056 += (long) i_0_ * -6791912350805098735L;
						if (-6802897060071190031L * ((JagexFile) this).aLong6056 > (4615439178561396315L * ((JagexFile) this).aLong6054))
							((JagexFile) this).aLong6054 = (((JagexFile) this).aLong6056 * -4019893457238828381L);
						long l = -1L;
						long l_3_ = -1L;
						if ((2482753095985495469L * ((JagexFile) this).aLong6047 >= (((JagexFile) this).aLong6048 * -6509381880913424689L)) && ((((JagexFile) this).aLong6047 * 2482753095985495469L) < ((-6509381880913424689L * ((JagexFile) this).aLong6048) + (long) (((JagexFile) this).anInt6049 * 998848593))))
							l = (((JagexFile) this).aLong6047 * 2482753095985495469L);
						else if (((-6509381880913424689L * ((JagexFile) this).aLong6048) >= (((JagexFile) this).aLong6047 * 2482753095985495469L)) && ((-6509381880913424689L * ((JagexFile) this).aLong6048) < ((2482753095985495469L * ((JagexFile) this).aLong6047) + (long) i_0_)))
							l = (((JagexFile) this).aLong6048 * -6509381880913424689L);
						if (((long) i_0_ + (2482753095985495469L * ((JagexFile) this).aLong6047) > (-6509381880913424689L * ((JagexFile) this).aLong6048)) && ((long) i_0_ + (2482753095985495469L * ((JagexFile) this).aLong6047) <= ((long) (998848593 * ((JagexFile) this).anInt6049) + (((JagexFile) this).aLong6048 * -6509381880913424689L))))
							l_3_ = ((long) i_0_ + (2482753095985495469L * ((JagexFile) this).aLong6047));
						else if ((((((JagexFile) this).aLong6048 * -6509381880913424689L) + (long) (((JagexFile) this).anInt6049 * 998848593)) > (((JagexFile) this).aLong6047 * 2482753095985495469L)) && (((long) (998848593 * ((JagexFile) this).anInt6049) + (((JagexFile) this).aLong6048 * -6509381880913424689L)) <= ((2482753095985495469L * ((JagexFile) this).aLong6047) + (long) i_0_)))
							l_3_ = ((long) (((JagexFile) this).anInt6049 * 998848593) + (((JagexFile) this).aLong6048 * -6509381880913424689L));
						if (l > -1L && l_3_ > l) {
							int i_4_ = (int) (l_3_ - l);
							System.arraycopy(is, (int) ((long) i + l - (2482753095985495469L * ((JagexFile) this).aLong6047)), ((JagexFile) this).aByteArray6052, (int) (l - (((JagexFile) this).aLong6048 * -6509381880913424689L)), i_4_);
						}
						((JagexFile) this).aLong6047 += (long) i_0_ * -4167043960764305883L;
					} else {
						if (i_0_ <= 0)
							break;
						if (-1L == (-3151226325898744411L * ((JagexFile) this).aLong6051))
							((JagexFile) this).aLong6051 = (2209468448714957161L * ((JagexFile) this).aLong6047);
						System.arraycopy(is, i, ((JagexFile) this).aByteArray6050, (int) ((((JagexFile) this).aLong6047 * 2482753095985495469L) - (((JagexFile) this).aLong6051 * -3151226325898744411L)), i_0_);
						((JagexFile) this).aLong6047 += -4167043960764305883L * (long) i_0_;
						if ((2482753095985495469L * ((JagexFile) this).aLong6047 - (-3151226325898744411L * ((JagexFile) this).aLong6051)) > (long) (((JagexFile) this).anInt6053 * 447269525))
							((JagexFile) this).anInt6053 = (44871869 * (int) ((2482753095985495469L * ((JagexFile) this).aLong6047) - (-3151226325898744411L * (((JagexFile) this).aLong6051))));
					}
				} catch (IOException ioexception) {
					((JagexFile) this).aLong6056 = 6791912350805098735L;
					throw ioexception;
				}
				break;
			} while (false);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ty.d(").append(')').toString());
		}
	}

	public long method6135(int i) {
		try {
			return ((JagexFile) this).aLong6055 * -7034414526671508465L;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ty.b(").append(')').toString());
		}
	}

	public void method6136(byte[] is, int i) throws IOException {
		try {
			method6139(is, 0, is.length, -1421240116);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ty.p(").append(')').toString());
		}
	}

	void method6137(int i) throws IOException {
		try {
			((JagexFile) this).anInt6049 = 0;
			if (2482753095985495469L * ((JagexFile) this).aLong6047 != -6802897060071190031L * ((JagexFile) this).aLong6056) {
				((JagexFile) this).aClass476_6045.method6077(2482753095985495469L * ((JagexFile) this).aLong6047);
				((JagexFile) this).aLong6056 = -4798501635493713027L * ((JagexFile) this).aLong6047;
			}
			((JagexFile) this).aLong6048 = -3797790670521537853L * ((JagexFile) this).aLong6047;
			int i_5_;
			for (/**/; (998848593 * ((JagexFile) this).anInt6049 < ((JagexFile) this).aByteArray6052.length); ((JagexFile) this).anInt6049 += i_5_ * -1121251151) {
				int i_6_ = (((JagexFile) this).aByteArray6052.length - ((JagexFile) this).anInt6049 * 998848593);
				if (i_6_ > 200000000)
					i_6_ = 200000000;
				i_5_ = (((JagexFile) this).aClass476_6045.method6081(((JagexFile) this).aByteArray6052, ((JagexFile) this).anInt6049 * 998848593, i_6_, (short) 2486));
				if (-1 == i_5_) {
					if (i == 65346295) {
						/* empty */
					}
					break;
				}
				((JagexFile) this).aLong6056 += (long) i_5_ * -6791912350805098735L;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ty.k(").append(')').toString());
		}
	}

	void method6138(byte i) throws IOException {
		try {
			if (-3151226325898744411L * ((JagexFile) this).aLong6051 != -1L) {
				if (-3151226325898744411L * ((JagexFile) this).aLong6051 != ((JagexFile) this).aLong6056 * -6802897060071190031L) {
					((JagexFile) this).aClass476_6045.method6077(((JagexFile) this).aLong6051 * -3151226325898744411L);
					((JagexFile) this).aLong6056 = ((JagexFile) this).aLong6051 * 8772800544907846389L;
				}
				((JagexFile) this).aClass476_6045.method6078(((JagexFile) this).aByteArray6050, 0, ((JagexFile) this).anInt6053 * 447269525, -372145186);
				((JagexFile) this).aLong6056 += (-7564286584664531227L * (long) ((JagexFile) this).anInt6053);
				if (-6802897060071190031L * ((JagexFile) this).aLong6056 > ((JagexFile) this).aLong6054 * 4615439178561396315L)
					((JagexFile) this).aLong6054 = -4019893457238828381L * ((JagexFile) this).aLong6056;
				long l = -1L;
				long l_7_ = -1L;
				if ((-3151226325898744411L * ((JagexFile) this).aLong6051 >= ((JagexFile) this).aLong6048 * -6509381880913424689L) && (((JagexFile) this).aLong6051 * -3151226325898744411L < (-6509381880913424689L * ((JagexFile) this).aLong6048 + (long) (((JagexFile) this).anInt6049 * 998848593))))
					l = ((JagexFile) this).aLong6051 * -3151226325898744411L;
				else if ((((JagexFile) this).aLong6048 * -6509381880913424689L >= (((JagexFile) this).aLong6051 * -3151226325898744411L)) && ((-6509381880913424689L * ((JagexFile) this).aLong6048) < ((-3151226325898744411L * ((JagexFile) this).aLong6051) + (long) (447269525 * ((JagexFile) this).anInt6053))))
					l = -6509381880913424689L * ((JagexFile) this).aLong6048;
				if (((-3151226325898744411L * ((JagexFile) this).aLong6051 + (long) (((JagexFile) this).anInt6053 * 447269525)) > -6509381880913424689L * ((JagexFile) this).aLong6048) && (((long) (447269525 * ((JagexFile) this).anInt6053) + ((JagexFile) this).aLong6051 * -3151226325898744411L) <= ((long) (998848593 * ((JagexFile) this).anInt6049) + (-6509381880913424689L * ((JagexFile) this).aLong6048))))
					l_7_ = (((JagexFile) this).aLong6051 * -3151226325898744411L + (long) (((JagexFile) this).anInt6053 * 447269525));
				else if ((((long) (998848593 * ((JagexFile) this).anInt6049) + (((JagexFile) this).aLong6048 * -6509381880913424689L)) > (((JagexFile) this).aLong6051 * -3151226325898744411L)) && (((((JagexFile) this).aLong6048 * -6509381880913424689L) + (long) (((JagexFile) this).anInt6049 * 998848593)) <= ((-3151226325898744411L * ((JagexFile) this).aLong6051) + (long) (447269525 * ((JagexFile) this).anInt6053))))
					l_7_ = ((long) (998848593 * ((JagexFile) this).anInt6049) + (((JagexFile) this).aLong6048 * -6509381880913424689L));
				if (l > -1L && l_7_ > l) {
					int i_8_ = (int) (l_7_ - l);
					System.arraycopy(((JagexFile) this).aByteArray6050, (int) (l - (-3151226325898744411L * ((JagexFile) this).aLong6051)), ((JagexFile) this).aByteArray6052, (int) (l - (((JagexFile) this).aLong6048 * -6509381880913424689L)), i_8_);
				}
				((JagexFile) this).aLong6051 = -483645590008820269L;
				((JagexFile) this).anInt6053 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ty.u(").append(')').toString());
		}
	}

	public void method6139(byte[] is, int i, int i_9_, int i_10_) throws IOException {
		try {
			try {
				if (i_9_ + i > is.length)
					throw new ArrayIndexOutOfBoundsException(i + i_9_ - is.length);
				if (-1L != -3151226325898744411L * ((JagexFile) this).aLong6051 && (((JagexFile) this).aLong6047 * 2482753095985495469L >= -3151226325898744411L * ((JagexFile) this).aLong6051) && ((2482753095985495469L * ((JagexFile) this).aLong6047 + (long) i_9_) <= ((long) (447269525 * ((JagexFile) this).anInt6053) + (((JagexFile) this).aLong6051 * -3151226325898744411L)))) {
					System.arraycopy(((JagexFile) this).aByteArray6050, (int) ((2482753095985495469L * ((JagexFile) this).aLong6047) - (((JagexFile) this).aLong6051 * -3151226325898744411L)), is, i, i_9_);
					((JagexFile) this).aLong6047 += -4167043960764305883L * (long) i_9_;
					return;
				}
				long l = 2482753095985495469L * ((JagexFile) this).aLong6047;
				int i_11_ = i;
				int i_12_ = i_9_;
				if ((((JagexFile) this).aLong6047 * 2482753095985495469L >= -6509381880913424689L * ((JagexFile) this).aLong6048) && (2482753095985495469L * ((JagexFile) this).aLong6047 < ((long) (998848593 * ((JagexFile) this).anInt6049) + (-6509381880913424689L * ((JagexFile) this).aLong6048)))) {
					int i_13_ = (int) ((long) (((JagexFile) this).anInt6049 * 998848593) - ((((JagexFile) this).aLong6047 * 2482753095985495469L) - (-6509381880913424689L * ((JagexFile) this).aLong6048)));
					if (i_13_ > i_9_)
						i_13_ = i_9_;
					System.arraycopy(((JagexFile) this).aByteArray6052, (int) ((2482753095985495469L * ((JagexFile) this).aLong6047) - (-6509381880913424689L * ((JagexFile) this).aLong6048)), is, i, i_13_);
					((JagexFile) this).aLong6047 += (long) i_13_ * -4167043960764305883L;
					i += i_13_;
					i_9_ -= i_13_;
				}
				if (i_9_ > ((JagexFile) this).aByteArray6052.length) {
					((JagexFile) this).aClass476_6045.method6077(2482753095985495469L * ((JagexFile) this).aLong6047);
					((JagexFile) this).aLong6056 = ((JagexFile) this).aLong6047 * -4798501635493713027L;
					int i_14_;
					for (/**/; i_9_ > 0; i_9_ -= i_14_) {
						i_14_ = ((JagexFile) this).aClass476_6045.method6081(is, i, i_9_, (short) 17941);
						if (i_14_ == -1) {
							if (i_10_ >= -1248661228) {
								/* empty */
							}
							break;
						}
						((JagexFile) this).aLong6056 += -6791912350805098735L * (long) i_14_;
						((JagexFile) this).aLong6047 += -4167043960764305883L * (long) i_14_;
						i += i_14_;
					}
				} else if (i_9_ > 0) {
					method6137(334196140);
					int i_15_ = i_9_;
					if (i_15_ > 998848593 * ((JagexFile) this).anInt6049)
						i_15_ = 998848593 * ((JagexFile) this).anInt6049;
					System.arraycopy(((JagexFile) this).aByteArray6052, 0, is, i, i_15_);
					i += i_15_;
					i_9_ -= i_15_;
					((JagexFile) this).aLong6047 += -4167043960764305883L * (long) i_15_;
				}
				if (-3151226325898744411L * ((JagexFile) this).aLong6051 != -1L) {
					if ((-3151226325898744411L * ((JagexFile) this).aLong6051 > 2482753095985495469L * ((JagexFile) this).aLong6047) && i_9_ > 0) {
						int i_16_ = i + (int) ((-3151226325898744411L * ((JagexFile) this).aLong6051) - (2482753095985495469L * ((JagexFile) this).aLong6047));
						if (i_16_ > i_9_ + i)
							i_16_ = i + i_9_;
						while (i < i_16_) {
							is[i++] = (byte) 0;
							i_9_--;
							((JagexFile) this).aLong6047 += -4167043960764305883L;
						}
					}
					long l_17_ = -1L;
					long l_18_ = -1L;
					if ((((JagexFile) this).aLong6051 * -3151226325898744411L >= l) && (((JagexFile) this).aLong6051 * -3151226325898744411L < (long) i_12_ + l))
						l_17_ = (-3151226325898744411L * ((JagexFile) this).aLong6051);
					else if (l >= (((JagexFile) this).aLong6051 * -3151226325898744411L) && l < ((long) (447269525 * ((JagexFile) this).anInt6053) + (-3151226325898744411L * ((JagexFile) this).aLong6051)))
						l_17_ = l;
					if (((-3151226325898744411L * ((JagexFile) this).aLong6051 + (long) (((JagexFile) this).anInt6053 * 447269525)) > l) && ((long) (447269525 * ((JagexFile) this).anInt6053) + (((JagexFile) this).aLong6051 * -3151226325898744411L)) <= (long) i_12_ + l)
						l_18_ = ((((JagexFile) this).aLong6051 * -3151226325898744411L) + (long) (((JagexFile) this).anInt6053 * 447269525));
					else if (l + (long) i_12_ > (-3151226325898744411L * ((JagexFile) this).aLong6051) && (l + (long) i_12_ <= ((-3151226325898744411L * ((JagexFile) this).aLong6051) + (long) (447269525 * (((JagexFile) this).anInt6053)))))
						l_18_ = (long) i_12_ + l;
					if (l_17_ > -1L && l_18_ > l_17_) {
						int i_19_ = (int) (l_18_ - l_17_);
						System.arraycopy(((JagexFile) this).aByteArray6050, (int) (l_17_ - (-3151226325898744411L * (((JagexFile) this).aLong6051))), is, i_11_ + (int) (l_17_ - l), i_19_);
						if (l_18_ > (2482753095985495469L * ((JagexFile) this).aLong6047)) {
							i_9_ -= l_18_ - (((JagexFile) this).aLong6047 * 2482753095985495469L);
							((JagexFile) this).aLong6047 = -4167043960764305883L * l_18_;
						}
					}
				}
			} catch (IOException ioexception) {
				((JagexFile) this).aLong6056 = 6791912350805098735L;
				throw ioexception;
			}
			if (i_9_ > 0)
				throw new EOFException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ty.i(").append(')').toString());
		}
	}

	public void method6140(long l) throws IOException {
		try {
			if (l < 0L)
				throw new IOException();
			((JagexFile) this).aLong6047 = l * -4167043960764305883L;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ty.f(").append(')').toString());
		}
	}

	public JagexFile(JagexFile2 class476, int i, int i_20_) throws IOException {
		((JagexFile) this).aClass476_6045 = class476;
		((JagexFile) this).aLong6055 = ((((JagexFile) this).aLong6054 = class476.method6080(-248360076) * -2138022200351563309L) * 4755452723842239733L);
		((JagexFile) this).aByteArray6052 = new byte[i];
		((JagexFile) this).aByteArray6050 = new byte[i_20_];
		((JagexFile) this).aLong6047 = 0L;
	}

	static void method6141(int i, byte i_21_) {
		try {
			HintIcon.aClass348_264.method4186(i, 266431320);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ty.p(").append(')').toString());
		}
	}

	static final void method6142(WidgetConfig class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= 1943683162;
			class105.anInt1297 = ((((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]) * -2075416171);
			class105.anInt1248 = (-1373128517 * (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]));
			class105.anInt1190 = (-801721775 * (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 2]));
			class105.anInt1262 = ((((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 3]) * 1590511671);
			class105.anInt1192 = ((((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 4]) * -2064327287);
			class105.anInt1284 = (-1066050969 * (((ClientScript2) class403).anIntArray5244[5 + 681479919 * ((ClientScript2) class403).anInt5239]));
			Tradution.method6054(class105, -212905305);
			if (class105.anInt1154 * -1309843523 == -1 && !class119.aBoolean1403) {
				Class509.method6286(class105.uid * -440872681, 1280161457);
				Class70.method808(class105.uid * -440872681, 1365886574);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ty.dw(").append(')').toString());
		}
	}
}
