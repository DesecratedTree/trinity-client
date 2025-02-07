/* Class329 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;

public final class Partition {
	JagexFile data = null;
	static byte[] header = new byte[520];
	JagexFile idx = null;
	int anInt3493;
	int maxSize = -22135608;

	boolean put(int i, byte[] is, int size, boolean bool, int i_1_) {
		try {
			synchronized (((Partition) this).data) {
				boolean bool_2_;
				try {
					int i_3_;
					if (bool) {
						if (((Partition) this).idx.method6135(-1460152461) < (long) (i * 6 + 6)) {
							boolean bool_4_ = false;
							return bool_4_;
						}
						((Partition) this).idx.method6140((long) (6 * i));
						((Partition) this).idx.method6139(header, 0, 6, -1945961108);
						i_3_ = (((header[3] & 0xff) << 16) + ((header[4] & 0xff) << 8) + (header[5] & 0xff));
						if (i_3_ <= 0 || (long) i_3_ > (((Partition) this).data.method6135(-1513278544) / 520L)) {
							boolean bool_5_ = false;
							return bool_5_;
						}
					} else {
						i_3_ = (int) ((((Partition) this).data.method6135(-1893675250) + 519L) / 520L);
						if (i_3_ == 0)
							i_3_ = 1;
					}
					header[0] = (byte) (size >> 16);
					header[1] = (byte) (size >> 8);
					header[2] = (byte) size;
					header[3] = (byte) (i_3_ >> 16);
					header[4] = (byte) (i_3_ >> 8);
					header[5] = (byte) i_3_;
					((Partition) this).idx.method6140((long) (i * 6));
					((Partition) this).idx.method6134(header, 0, 6, 1699083209);
					int write = 0;
					int i_7_ = 0;
					while (write < size) {
						int nextBlock = 0;
						if (bool) {
							((Partition) this).data.method6140((long) (i_3_ * 520));
							int i_9_;
							int i_10_;
							int i_11_;
							if (i > 65535) {
								try {
									((Partition) this).data.method6139(header, 0, 10, -1753859317);
								} catch (EOFException eofexception) {
									eofexception.printStackTrace();
									break;
								}
								i_9_ = (((header[2] & 0xff) << 8) + (((header[0] & 0xff) << 24) + ((header[1] & 0xff) << 16)) + (header[3] & 0xff));
								i_10_ = ((header[5] & 0xff) + ((header[4] & 0xff) << 8));
								nextBlock = (((header[7] & 0xff) << 8) + ((header[6] & 0xff) << 16) + (header[8] & 0xff));
								i_11_ = header[9] & 0xff;
							} else {
								try {
									((Partition) this).data.method6139(header, 0, 8, -1374964621);
								} catch (EOFException eofexception) {
									eofexception.printStackTrace();
									break;
								}
								i_9_ = ((header[1] & 0xff) + ((header[0] & 0xff) << 8));
								i_10_ = (((header[2] & 0xff) << 8) + (header[3] & 0xff));
								nextBlock = ((header[6] & 0xff) + (((header[5] & 0xff) << 8) + ((header[4] & 0xff) << 16)));
								i_11_ = header[7] & 0xff;
							}
							if (i_9_ != i || i_7_ != i_10_ || i_11_ != (-1194991041 * ((Partition) this).anInt3493)) {
								boolean bool_12_ = false;
								return bool_12_;
							}
							if (nextBlock < 0 || ((long) nextBlock > ((Partition) this).data.method6135(-1633796509) / 520L)) {
								boolean bool_13_ = false;
								return bool_13_;
							}
						}
						if (nextBlock == 0) {
							bool = false;
							nextBlock = (int) ((((Partition) this).data.method6135(-1603705353) + 519L) / 520L);
							if (0 == nextBlock)
								nextBlock++;
							if (nextBlock == i_3_)
								nextBlock++;
						}
						if (size - write <= (i > 65535 ? 510 : 512))
							nextBlock = 0;
						if (i > 65535) {
							header[0] = (byte) (i >> 24);
							header[1] = (byte) (i >> 16);
							header[2] = (byte) (i >> 8);
							header[3] = (byte) i;
							header[4] = (byte) (i_7_ >> 8);
							header[5] = (byte) i_7_;
							header[6] = (byte) (nextBlock >> 16);
							header[7] = (byte) (nextBlock >> 8);
							header[8] = (byte) nextBlock;
							header[9] = (byte) (-1194991041 * ((Partition) this).anInt3493);
							((Partition) this).data.method6140((long) (i_3_ * 520));
							((Partition) this).data.method6134(header, 0, 10, 1531111935);
							int i_14_ = size - write;
							if (i_14_ > 510)
								i_14_ = 510;
							((Partition) this).data.method6134(is, write, i_14_, 1227506688);
							write += i_14_;
						} else {
							header[0] = (byte) (i >> 8);
							header[1] = (byte) i;
							header[2] = (byte) (i_7_ >> 8);
							header[3] = (byte) i_7_;
							header[4] = (byte) (nextBlock >> 16);
							header[5] = (byte) (nextBlock >> 8);
							header[6] = (byte) nextBlock;
							header[7] = (byte) (((Partition) this).anInt3493 * -1194991041);
							((Partition) this).data.method6140((long) (i_3_ * 520));
							((Partition) this).data.method6134(header, 0, 8, 1542282258);
							int i_15_ = size - write;
							if (i_15_ > 512)
								i_15_ = 512;
							((Partition) this).data.method6134(is, write, i_15_, 1907873622);
							write += i_15_;
						}
						i_3_ = nextBlock;
						i_7_++;
					}
					bool_2_ = true;
				} catch (IOException ioexception) {
					boolean bool_16_ = false;
					return bool_16_;
				}
				return bool_2_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ns.b(").append(')').toString());
		}
	}

	public byte[] get(int i, int i_17_) {
		try {
			synchronized (((Partition) this).data) {
				byte[] is;
				try {
					if (((Partition) this).idx.method6135(-1862419954) < (long) (6 * i + 6)) {
						byte[] is_18_ = null;
						return is_18_;
					}
					((Partition) this).idx.method6140((long) (6 * i));
					((Partition) this).idx.method6139(header, 0, 6, -1665251619);
					int length = (((header[0] & 0xff) << 16) + ((header[1] & 0xff) << 8) + (header[2] & 0xff));
					int block = ((header[5] & 0xff) + (((header[4] & 0xff) << 8) + ((header[3] & 0xff) << 16)));
					if (length < 0 || length > ((Partition) this).maxSize * -1289609275) {
						byte[] is_21_ = null;
						return is_21_;
					}
					if (block <= 0 || (long) block > (((Partition) this).data.method6135(-1393462746) / 520L)) {
						byte[] is_22_ = null;
						return is_22_;
					}
					byte[] is_23_ = new byte[length];
					int offset = 0;
					int i_25_ = 0;
					while (offset < length) {
						if (0 == block) {
							byte[] is_26_ = null;
							return is_26_;
						}
						((Partition) this).data.method6140((long) (520 * block));
						int dataSize = length - offset;
						int headerSize;
						int i_29_;
						int i_30_;
						int nextBlock;
						int i_32_;
						if (i > 65535) {
							if (dataSize > 510)
								dataSize = 510;
							headerSize = 10;
							((Partition) this).data.method6139(header, 0, headerSize + dataSize, -2124921702);
							i_29_ = (((header[2] & 0xff) << 8) + (((header[0] & 0xff) << 24) + ((header[1] & 0xff) << 16)) + (header[3] & 0xff));
							i_30_ = (((header[4] & 0xff) << 8) + (header[5] & 0xff));
							nextBlock = (((header[6] & 0xff) << 16) + ((header[7] & 0xff) << 8) + (header[8] & 0xff));
							i_32_ = header[9] & 0xff;
						} else {
							if (dataSize > 512)
								dataSize = 512;
							headerSize = 8;
							((Partition) this).data.method6139(header, 0, headerSize + dataSize, -1642020087);
							i_29_ = (((header[0] & 0xff) << 8) + (header[1] & 0xff));
							i_30_ = ((header[3] & 0xff) + ((header[2] & 0xff) << 8));
							nextBlock = (((header[5] & 0xff) << 8) + ((header[4] & 0xff) << 16) + (header[6] & 0xff));
							i_32_ = header[7] & 0xff;
						}
						if (i_29_ != i || i_30_ != i_25_ || (-1194991041 * ((Partition) this).anInt3493 != i_32_)) {
							byte[] is_33_ = null;
							return is_33_;
						}
						if (nextBlock < 0 || (long) nextBlock > (((Partition) this).data.method6135(-1934019874) / 520L)) {
							byte[] is_34_ = null;
							return is_34_;
						}
						int blockSize = dataSize + headerSize;
						for (int i_36_ = headerSize; i_36_ < blockSize; i_36_++)
							is_23_[offset++] = header[i_36_];
						block = nextBlock;
						i_25_++;
					}
					is = is_23_;
				} catch (IOException ioexception) {
					ioexception.printStackTrace();
					byte[] is_37_ = null;
					return is_37_;
				}
				return is;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ns.a(").append(')').toString());
		}
	}

	public boolean method3993(int i, byte[] is, int i_38_, int i_39_) {
		try {
			synchronized (((Partition) this).data) {
				if (i_38_ < 0 || i_38_ > -1289609275 * ((Partition) this).maxSize)
					throw new IllegalArgumentException();
				boolean bool = put(i, is, i_38_, true, 1494361890);
				if (!bool)
					bool = put(i, is, i_38_, false, 1552417971);
				boolean bool_40_ = bool;
				return bool_40_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ns.f(").append(')').toString());
		}
	}

	public String toString() {
		try {
			return new StringBuilder().append("").append(((Partition) this).anInt3493 * -1194991041).toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ns.toString(").append(')').toString());
		}
	}

	public Partition(int i, JagexFile class484, JagexFile class484_41_, int maxSize) {
		((Partition) this).anInt3493 = i * 576785855;
		((Partition) this).data = class484;
		((Partition) this).idx = class484_41_;
		((Partition) this).maxSize = maxSize * 1731069709;
	}

	static void method3994(byte i) {
		try {
			if (Class294.anIntArray3165 == null) {
				Class294.anIntArray3165 = new int[65536];
				Class379.anIntArray4098 = new int[65536];
				double d = 0.7 + (Math.random() * 0.03 - 0.015);
				for (int i_43_ = 0; i_43_ < 65536; i_43_++) {
					double d_44_ = (double) (i_43_ >> 10 & 0x3f) / 64.0 + 0.0078125;
					double d_45_ = 0.0625 + (double) (i_43_ >> 7 & 0x7) / 8.0;
					double d_46_ = (double) (i_43_ & 0x7f) / 128.0;
					double d_47_ = d_46_;
					double d_48_ = d_46_;
					double d_49_ = d_46_;
					if (0.0 != d_45_) {
						double d_50_;
						if (d_46_ < 0.5)
							d_50_ = d_46_ * (1.0 + d_45_);
						else
							d_50_ = d_46_ + d_45_ - d_46_ * d_45_;
						double d_51_ = d_46_ * 2.0 - d_50_;
						double d_52_ = d_44_ + 0.3333333333333333;
						if (d_52_ > 1.0)
							d_52_--;
						double d_53_ = d_44_;
						double d_54_ = d_44_ - 0.3333333333333333;
						if (d_54_ < 0.0)
							d_54_++;
						if (6.0 * d_52_ < 1.0)
							d_47_ = (d_50_ - d_51_) * 6.0 * d_52_ + d_51_;
						else if (d_52_ * 2.0 < 1.0)
							d_47_ = d_50_;
						else if (d_52_ * 3.0 < 2.0)
							d_47_ = d_51_ + 6.0 * ((d_50_ - d_51_) * (0.6666666666666666 - d_52_));
						else
							d_47_ = d_51_;
						if (6.0 * d_53_ < 1.0)
							d_48_ = d_51_ + (d_50_ - d_51_) * 6.0 * d_53_;
						else if (d_53_ * 2.0 < 1.0)
							d_48_ = d_50_;
						else if (3.0 * d_53_ < 2.0)
							d_48_ = 6.0 * ((0.6666666666666666 - d_53_) * (d_50_ - d_51_)) + d_51_;
						else
							d_48_ = d_51_;
						if (d_54_ * 6.0 < 1.0)
							d_49_ = d_54_ * ((d_50_ - d_51_) * 6.0) + d_51_;
						else if (2.0 * d_54_ < 1.0)
							d_49_ = d_50_;
						else if (3.0 * d_54_ < 2.0)
							d_49_ = 6.0 * ((0.6666666666666666 - d_54_) * (d_50_ - d_51_)) + d_51_;
						else
							d_49_ = d_51_;
					}
					d_47_ = Math.pow(d_47_, d);
					d_48_ = Math.pow(d_48_, d);
					d_49_ = Math.pow(d_49_, d);
					int i_55_ = (int) (256.0 * d_47_);
					int i_56_ = (int) (256.0 * d_48_);
					int i_57_ = (int) (256.0 * d_49_);
					int i_58_ = i_57_ + ((i_56_ << 8) + (i_55_ << 16));
					Class294.anIntArray3165[i_43_] = i_58_ & 0xffffff;
					int i_59_ = i_55_ + ((i_56_ << 8) + (i_57_ << 16));
					Class379.anIntArray4098[i_43_] = i_59_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ns.p(").append(')').toString());
		}
	}

	static final void method3995(ClientScript2 class403, byte i) {
		try {
			int i_60_ = (((ClientScript2) class403).integerstack[((ClientScript2) class403).integerPos * 1883543357]);
			String string = (((ClientScript2) class403).aClass162_5252.method1755(-937307905 * client.aClass411_8944.gameType << 16 | i_60_, -1713280768));
			String string_61_;
			if (null == string)
				string_61_ = "";
			else
				string_61_ = string;
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = string_61_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ns.bi(").append(')').toString());
		}
	}

	static final void method3996(ClientScript2 class403, int i) {
		try {
			int i_62_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			WidgetConfig class105 = Class50.getIComponentDefinitions(i_62_, (byte) -43);
			Class119 class119 = Class389.aClass119Array4165[i_62_ >> 16];
			Class231.method2131(class105, class119, class403, -2030984421);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ns.mi(").append(')').toString());
		}
	}

	static final void method3997(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2073, client.aClass25_8711.aClass449_330, (byte) 13);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(string.length() + 1);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string, 2108270585);
			client.aClass25_8711.method390(class298_sub36, (byte) -64);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ns.sn(").append(')').toString());
		}
	}
}
