
import java.util.zip.CRC32;

public class GrabFolder extends Class242 {
	LinkedArrayList aClass437_7085;
	Class247 aClass247_7086;
	byte[] checksumBlock;
	int folder;
	Partition headerPartition;
	Class298_Sub37_Sub16 aClass298_Sub37_Sub16_7090;
	Class255 updateServer;
	int anInt7092 = 0;
	Partition partition;
	Class226 header;
	static byte aByte7095 = 0;
	static byte aByte7096 = 1;
	static byte aByte7097 = -1;
	byte[] aByteArray7098;
	static int anInt7099 = 1000;
	Class453 aClass453_7100;
	int anInt7101;
	boolean aBoolean7102;
	int revision;
	static int anInt7104 = 0;
	Class453 aClass453_7105;
	boolean aBoolean7106;
	long aLong7107;
	int checksum;
	static int anInt7109 = 250;
	static CRC32 aCRC32_7110 = new CRC32();
	boolean aBoolean7111;
	static int anInt7112 = 1;
	static int anInt7113 = 2;

	public int headerPercentage(int i) {
		try {
			if (method2250(2127930788) == null) {
				if (null == ((GrabFolder) this).aClass298_Sub37_Sub16_7090)
					return 0;
				return ((GrabFolder) this).aClass298_Sub37_Sub16_7090.method3468(-2104540777);
			}
			return 100;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.v(").append(')').toString());
		}
	}

	void method2260(int i) {
		if (null != ((GrabFolder) this).partition) {
			for (Class298 class298 = ((GrabFolder) this).aClass453_7105.method5939(1766612795); null != class298; class298 = ((GrabFolder) this).aClass453_7105.method5944(49146)) {
				if (7051297995265073167L * class298.aLong3188 == (long) i)
					return;
			}
			Class298 class298 = new Class298();
			class298.aLong3188 = (long) i * 4191220306876042991L;
			((GrabFolder) this).aClass453_7105.add(class298, 1807588241);
		}
	}

	void method2256(int i, short i_0_) {
		try {
			if (null != ((GrabFolder) this).partition) {
				for (Class298 class298 = ((GrabFolder) this).aClass453_7105.method5939(1766612795); null != class298; class298 = ((GrabFolder) this).aClass453_7105.method5944(49146)) {
					if (7051297995265073167L * class298.aLong3188 == (long) i)
						return;
				}
				Class298 class298 = new Class298();
				class298.aLong3188 = (long) i * 4191220306876042991L;
				((GrabFolder) this).aClass453_7105.add(class298, -68518310);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.b(").append(')').toString());
		}
	}

	Class298_Sub37_Sub16 method2271(int i, int i_1_, byte i_2_) {
		try {
			Class298_Sub37_Sub16 class298_sub37_sub16 = ((Class298_Sub37_Sub16) ((GrabFolder) this).aClass437_7085.method5812((long) i));
			if (class298_sub37_sub16 != null && 0 == i_1_ && !((Class298_Sub37_Sub16) class298_sub37_sub16).priority && (((Class298_Sub37_Sub16) class298_sub37_sub16).downloading)) {
				class298_sub37_sub16.remove(-1460969981);
				class298_sub37_sub16 = null;
			}
			if (null == class298_sub37_sub16) {
				if (i_1_ == 0) {
					if (((GrabFolder) this).partition != null && ((GrabFolder) this).aByteArray7098[i] != -1)
						class298_sub37_sub16 = (((GrabFolder) this).updateServer.method2430(i, ((GrabFolder) this).partition, -1787098666));
					else if (!((GrabFolder) this).aClass247_7086.method2340((byte) 14))
						class298_sub37_sub16 = (((GrabFolder) this).aClass247_7086.requestArchive(-553176479 * ((GrabFolder) this).folder, i, (byte) 2, true, -393413622));
					else
						return null;
				} else if (i_1_ == 1) {
					if (((GrabFolder) this).partition == null)
						throw new RuntimeException();
					class298_sub37_sub16 = (((GrabFolder) this).updateServer.method2429(i, ((GrabFolder) this).partition, (byte) -18));
				} else if (2 == i_1_) {
					if (null == ((GrabFolder) this).partition)
						throw new RuntimeException();
					if (-1 != ((GrabFolder) this).aByteArray7098[i])
						throw new RuntimeException();
					if (!((GrabFolder) this).aClass247_7086.method2347((byte) -70))
						class298_sub37_sub16 = (((GrabFolder) this).aClass247_7086.requestArchive(((GrabFolder) this).folder * -553176479, i, (byte) 2, false, 67458398));
					else
						return null;
				} else
					throw new RuntimeException();
				((GrabFolder) this).aClass437_7085.method5817(class298_sub37_sub16, (long) i);
			}
			if (((Class298_Sub37_Sub16) class298_sub37_sub16).downloading)
				return null;
			byte[] is = class298_sub37_sub16.get((short) 657);
			if (class298_sub37_sub16 instanceof Class298_Sub37_Sub16_Sub2) {
				Class298_Sub37_Sub16 class298_sub37_sub16_3_;
				try {
					if (null == is || is.length <= 2)
						throw new RuntimeException();
					aCRC32_7110.reset();
					aCRC32_7110.update(is, 0, is.length - 2);
					int i_4_ = (int) aCRC32_7110.getValue();
					if ((((Class226) ((GrabFolder) this).header).anIntArray2522[i]) != i_4_)
						throw new RuntimeException();
					if ((((Class226) ((GrabFolder) this).header).aByteArrayArray2516) != null && null != (((Class226) ((GrabFolder) this).header).aByteArrayArray2516[i])) {
						byte[] is_5_ = (((Class226) ((GrabFolder) this).header).aByteArrayArray2516[i]);
						byte[] is_6_ = Class152.method1654(is, 0, is.length - 2, (byte) 21);
						for (int i_7_ = 0; i_7_ < 64; i_7_++) {
							if (is_5_[i_7_] != is_6_[i_7_])
								throw new RuntimeException();
						}
					}
					int i_8_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
					if (i_8_ != ((((Class226) ((GrabFolder) this).header).anIntArray2514[i]) & 0xffff))
						throw new RuntimeException();
					if (((GrabFolder) this).aByteArray7098[i] != 1) {
						if (((GrabFolder) this).aByteArray7098[i] != 0) {
							/* empty */
						}
						((GrabFolder) this).anInt7092 += 13538129;
						((GrabFolder) this).aByteArray7098[i] = (byte) 1;
					}
					if (!((Class298_Sub37_Sub16) class298_sub37_sub16).priority)
						class298_sub37_sub16.remove(-1460969981);
					class298_sub37_sub16_3_ = class298_sub37_sub16;
				} catch (Exception exception) {
					((GrabFolder) this).aByteArray7098[i] = (byte) -1;
					class298_sub37_sub16.remove(-1460969981);
					if ((((Class298_Sub37_Sub16) class298_sub37_sub16).priority) && !((GrabFolder) this).aClass247_7086.method2340((byte) 14)) {
						Class298_Sub37_Sub16_Sub1 class298_sub37_sub16_sub1 = (((GrabFolder) this).aClass247_7086.requestArchive(-553176479 * ((GrabFolder) this).folder, i, (byte) 2, true, 61291917));
						((GrabFolder) this).aClass437_7085.method5817(class298_sub37_sub16_sub1, (long) i);
					}
					return null;
				}
				return class298_sub37_sub16_3_;
			}
			try {
				if (is == null || is.length <= 2)
					throw new RuntimeException();
				aCRC32_7110.reset();
				aCRC32_7110.update(is, 0, is.length - 2);
				int i_9_ = (int) aCRC32_7110.getValue();
				if (i_9_ != (((Class226) ((GrabFolder) this).header).anIntArray2522[i]))
					throw new RuntimeException();
				if ((((Class226) ((GrabFolder) this).header).aByteArrayArray2516) != null && (null != (((Class226) ((GrabFolder) this).header).aByteArrayArray2516[i]))) {
					byte[] is_10_ = (((Class226) ((GrabFolder) this).header).aByteArrayArray2516[i]);
					byte[] is_11_ = Class152.method1654(is, 0, is.length - 2, (byte) -6);
					for (int i_12_ = 0; i_12_ < 64; i_12_++) {
						if (is_10_[i_12_] != is_11_[i_12_])
							throw new RuntimeException();
					}
				}
				((GrabFolder) this).aClass247_7086.anInt2735 = 0;
				((GrabFolder) this).aClass247_7086.anInt2745 = 0;
			} catch (RuntimeException runtimeexception) {
				((GrabFolder) this).aClass247_7086.method2359(-1195501767);
				class298_sub37_sub16.remove(-1460969981);
				if (((Class298_Sub37_Sub16) class298_sub37_sub16).priority && !((GrabFolder) this).aClass247_7086.method2340((byte) 14)) {
					Class298_Sub37_Sub16_Sub1 class298_sub37_sub16_sub1 = (((GrabFolder) this).aClass247_7086.requestArchive(-553176479 * ((GrabFolder) this).folder, i, (byte) 2, true, -791962540));
					((GrabFolder) this).aClass437_7085.method5817(class298_sub37_sub16_sub1, (long) i);
				}
				return null;
			}
			is[is.length - 2] = (byte) ((((Class226) ((GrabFolder) this).header).anIntArray2514[i]) >>> 8);
			is[is.length - 1] = (byte) (((Class226) ((GrabFolder) this).header).anIntArray2514[i]);
			if (((GrabFolder) this).partition != null) {
				((GrabFolder) this).updateServer.method2431(i, is, ((GrabFolder) this).partition, -645332532);
				if (((GrabFolder) this).aByteArray7098[i] != 1) {
					((GrabFolder) this).anInt7092 += 13538129;
					((GrabFolder) this).aByteArray7098[i] = (byte) 1;
				}
			}
			if (!((Class298_Sub37_Sub16) class298_sub37_sub16).priority)
				class298_sub37_sub16.remove(-1460969981);
			return class298_sub37_sub16;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.g(").append(')').toString());
		}
	}

	void method2272(byte i) {
		try {
			if (null != ((GrabFolder) this).aClass453_7100 && method2250(2079218396) != null) {
				for (Class298 class298 = ((GrabFolder) this).aClass453_7105.method5939(1766612795); class298 != null; class298 = ((GrabFolder) this).aClass453_7105.method5944(49146)) {
					int i_13_ = (int) (7051297995265073167L * class298.aLong3188);
					if (i_13_ < 0 || i_13_ >= -1583970959 * ((Class226) (((GrabFolder) this).header)).anInt2521 || 0 == (((Class226) ((GrabFolder) this).header).anIntArray2525[i_13_]))
						class298.remove(-1460969981);
					else {
						if (((GrabFolder) this).aByteArray7098[i_13_] == 0)
							method2271(i_13_, 1, (byte) 96);
						if (-1 == ((GrabFolder) this).aByteArray7098[i_13_])
							method2271(i_13_, 2, (byte) 26);
						if (1 == ((GrabFolder) this).aByteArray7098[i_13_])
							class298.remove(-1460969981);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.e(").append(')').toString());
		}
	}

	void method2273(int i) {
		try {
			if (null != ((GrabFolder) this).aClass453_7100) {
				if (method2250(2060715797) == null)
					return;
				if (((GrabFolder) this).aBoolean7102) {
					boolean bool = true;
					for (Class298 class298 = ((GrabFolder) this).aClass453_7100.method5939(1766612795); null != class298; class298 = ((GrabFolder) this).aClass453_7100.method5944(49146)) {
						int i_14_ = (int) (class298.aLong3188 * 7051297995265073167L);
						if (((GrabFolder) this).aByteArray7098[i_14_] == 0)
							method2271(i_14_, 1, (byte) 113);
						if (0 != ((GrabFolder) this).aByteArray7098[i_14_])
							class298.remove(-1460969981);
						else
							bool = false;
					}
					while (((GrabFolder) this).anInt7101 * 2044090087 < (((Class226) ((GrabFolder) this).header).anIntArray2525).length) {
						if (0 == (((Class226) ((GrabFolder) this).header).anIntArray2525[(2044090087 * ((GrabFolder) this).anInt7101)]))
							((GrabFolder) this).anInt7101 += -303145769;
						else {
							if ((-2031048721 * ((Class255) (((GrabFolder) this).updateServer)).anInt2793) >= 250) {
								bool = false;
								break;
							}
							if ((((GrabFolder) this).aByteArray7098[(2044090087 * ((GrabFolder) this).anInt7101)]) == 0)
								method2271(2044090087 * (((GrabFolder) this).anInt7101), 1, (byte) 122);
							if ((((GrabFolder) this).aByteArray7098[(((GrabFolder) this).anInt7101 * 2044090087)]) == 0) {
								Class298 class298 = new Class298();
								class298.aLong3188 = ((long) ((GrabFolder) this).anInt7101 * -1525375729483922519L);
								((GrabFolder) this).aClass453_7100.add(class298, 2047339116);
								bool = false;
							}
							((GrabFolder) this).anInt7101 += -303145769;
						}
					}
					if (bool) {
						((GrabFolder) this).aBoolean7102 = false;
						((GrabFolder) this).anInt7101 = 0;
					}
				} else if (((GrabFolder) this).aBoolean7111) {
					boolean bool = true;
					for (Class298 class298 = ((GrabFolder) this).aClass453_7100.method5939(1766612795); null != class298; class298 = ((GrabFolder) this).aClass453_7100.method5944(49146)) {
						int i_15_ = (int) (7051297995265073167L * class298.aLong3188);
						if (((GrabFolder) this).aByteArray7098[i_15_] != 1)
							method2271(i_15_, 2, (byte) 80);
						if (1 == ((GrabFolder) this).aByteArray7098[i_15_])
							class298.remove(-1460969981);
						else
							bool = false;
					}
					while (2044090087 * ((GrabFolder) this).anInt7101 < (((Class226) ((GrabFolder) this).header).anIntArray2525).length) {
						if ((((Class226) ((GrabFolder) this).header).anIntArray2525[2044090087 * ((GrabFolder) this).anInt7101]) == 0)
							((GrabFolder) this).anInt7101 += -303145769;
						else {
							if (((GrabFolder) this).aClass247_7086.method2347((byte) 57)) {
								bool = false;
								break;
							}
							if (1 != (((GrabFolder) this).aByteArray7098[(2044090087 * ((GrabFolder) this).anInt7101)]))
								method2271((((GrabFolder) this).anInt7101 * 2044090087), 2, (byte) 99);
							if (1 != (((GrabFolder) this).aByteArray7098[(((GrabFolder) this).anInt7101 * 2044090087)])) {
								Class298 class298 = new Class298();
								class298.aLong3188 = (-1525375729483922519L * (long) (((GrabFolder) this).anInt7101));
								((GrabFolder) this).aClass453_7100.add(class298, 120115319);
								bool = false;
							}
							((GrabFolder) this).anInt7101 += -303145769;
						}
					}
					if (bool) {
						((GrabFolder) this).aBoolean7111 = false;
						((GrabFolder) this).anInt7101 = 0;
					}
				} else
					((GrabFolder) this).aClass453_7100 = null;
			}
			if (((GrabFolder) this).aBoolean7106 && (Class122.method1319((byte) 1) >= (((GrabFolder) this).aLong7107 * 2822951764100643313L))) {
				for (Class298_Sub37_Sub16 class298_sub37_sub16 = (Class298_Sub37_Sub16) ((GrabFolder) this).aClass437_7085.method5816(1614241493); null != class298_sub37_sub16; class298_sub37_sub16 = ((Class298_Sub37_Sub16) ((GrabFolder) this).aClass437_7085.method5815((byte) -12))) {
					if (((Class298_Sub37_Sub16) class298_sub37_sub16).downloading) {
						if (i == -1065641321)
							return;
					} else if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9671) {
						if (!((Class298_Sub37_Sub16) class298_sub37_sub16).priority)
							throw new RuntimeException();
						class298_sub37_sub16.remove(-1460969981);
					} else
						((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9671 = true;
				}
				((GrabFolder) this).aLong7107 = ((Class122.method1319((byte) 1) + 1000L) * -7842795960219478255L);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.c(").append(')').toString());
		}
	}

	GrabFolder(int i, Partition partition, Partition class329_16_, Class247 class247, Class255 updateServer, int i_17_, byte[] is, int i_18_, boolean bool) {
		((GrabFolder) this).aClass437_7085 = new LinkedArrayList(16);
		((GrabFolder) this).anInt7101 = 0;
		((GrabFolder) this).aClass453_7105 = new Class453();
		((GrabFolder) this).aLong7107 = 0L;
		((GrabFolder) this).folder = i * 160231841;
		((GrabFolder) this).partition = partition;
		if (null == ((GrabFolder) this).partition)
			((GrabFolder) this).aBoolean7102 = false;
		else {
			((GrabFolder) this).aBoolean7102 = true;
			((GrabFolder) this).aClass453_7100 = new Class453();
		}
		((GrabFolder) this).headerPartition = class329_16_;
		((GrabFolder) this).aClass247_7086 = class247;
		((GrabFolder) this).updateServer = updateServer;
		((GrabFolder) this).checksum = i_17_ * 235523743;
		((GrabFolder) this).checksumBlock = is;
		((GrabFolder) this).revision = 1761064455 * i_18_;
		((GrabFolder) this).aBoolean7106 = bool;
		if (null != ((GrabFolder) this).headerPartition) 
			((GrabFolder) this).aClass298_Sub37_Sub16_7090 = (((GrabFolder) this).updateServer.method2430(((GrabFolder) this).folder * -553176479, ((GrabFolder) this).headerPartition, -1787098666));
		}

	public int method2274(byte i) {
		try {
			return ((GrabFolder) this).anInt7092 * -150039119;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.w(").append(')').toString());
		}
	}

	public int method2275(int i) {
		try {
			if (null == ((GrabFolder) this).header)
				return 0;
			if (!((GrabFolder) this).aBoolean7102)
				return (-2145352941 * (((Class226) ((GrabFolder) this).header).anInt2527));
			Class298 class298 = ((GrabFolder) this).aClass453_7100.method5939(1766612795);
			if (null == class298)
				return 0;
			return (int) (7051297995265073167L * class298.aLong3188);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.j(").append(')').toString());
		}
	}

	byte[] method2252(int i) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = method2271(i, 0, (byte) 95);
		if (null == class298_sub37_sub16)
			return null;
		byte[] is = class298_sub37_sub16.get((short) 9305);
		class298_sub37_sub16.remove(-1460969981);
		return is;
	}

	Class226 method2264() {
		if (((GrabFolder) this).header != null)
			return ((GrabFolder) this).header;
		if (null == ((GrabFolder) this).aClass298_Sub37_Sub16_7090) {
			if (((GrabFolder) this).aClass247_7086.method2340((byte) 14))
				return null;
			((GrabFolder) this).aClass298_Sub37_Sub16_7090 = (((GrabFolder) this).aClass247_7086.requestArchive(255, -553176479 * ((GrabFolder) this).folder, (byte) 0, true, 1341135400));
		}
		if (((Class298_Sub37_Sub16) ((GrabFolder) this).aClass298_Sub37_Sub16_7090).downloading)
			return null;
		byte[] is = ((GrabFolder) this).aClass298_Sub37_Sub16_7090.get((short) -18101);
		do {
			if (((GrabFolder) this).aClass298_Sub37_Sub16_7090 instanceof Class298_Sub37_Sub16_Sub2) {
				try {
					if (null == is)
						throw new RuntimeException();
					((GrabFolder) this).header = new Class226(is, (28953951 * ((GrabFolder) this).checksum), ((GrabFolder) this).checksumBlock);
					if (1598805943 * ((GrabFolder) this).revision != 201380083 * (((Class226) ((GrabFolder) this).header).anInt2529))
						throw new RuntimeException();
					break;
				} catch (RuntimeException runtimeexception) {
					((GrabFolder) this).header = null;
					if (((GrabFolder) this).aClass247_7086.method2340((byte) 14))
						((GrabFolder) this).aClass298_Sub37_Sub16_7090 = null;
					else
						((GrabFolder) this).aClass298_Sub37_Sub16_7090 = (((GrabFolder) this).aClass247_7086.requestArchive(255, -553176479 * ((GrabFolder) this).folder, (byte) 0, true, 694224083));
					return null;
				}
			}
			try {
				if (null == is)
					throw new RuntimeException();
				((GrabFolder) this).header = new Class226(is, 28953951 * ((GrabFolder) this).checksum, ((GrabFolder) this).checksumBlock);
			} catch (RuntimeException runtimeexception) {
				((GrabFolder) this).aClass247_7086.method2359(-1690580411);
				((GrabFolder) this).header = null;
				if (((GrabFolder) this).aClass247_7086.method2340((byte) 14))
					((GrabFolder) this).aClass298_Sub37_Sub16_7090 = null;
				else
					((GrabFolder) this).aClass298_Sub37_Sub16_7090 = (((GrabFolder) this).aClass247_7086.requestArchive(255, ((GrabFolder) this).folder * -553176479, (byte) 0, true, -1212933335));
				return null;
			}
			if (((GrabFolder) this).headerPartition != null)
				((GrabFolder) this).updateServer.method2431(-553176479 * ((GrabFolder) this).folder, is, ((GrabFolder) this).headerPartition, 628603077);
		} while (false);
		((GrabFolder) this).aClass298_Sub37_Sub16_7090 = null;
		if (((GrabFolder) this).partition != null) {
			((GrabFolder) this).aByteArray7098 = new byte[(((Class226) ((GrabFolder) this).header).anInt2521) * -1583970959];
			((GrabFolder) this).anInt7092 = 0;
		}
		return ((GrabFolder) this).header;
	}

	int method2253(int i, int i_19_) {
		try {
			Class298_Sub37_Sub16 class298_sub37_sub16 = ((Class298_Sub37_Sub16) ((GrabFolder) this).aClass437_7085.method5812((long) i));
			if (class298_sub37_sub16 != null)
				return class298_sub37_sub16.method3468(-2048847327);
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.p(").append(')').toString());
		}
	}

	Class226 method2254() {
		if (((GrabFolder) this).header != null)
			return ((GrabFolder) this).header;
		if (null == ((GrabFolder) this).aClass298_Sub37_Sub16_7090) {
			if (((GrabFolder) this).aClass247_7086.method2340((byte) 14))
				return null;
			((GrabFolder) this).aClass298_Sub37_Sub16_7090 = (((GrabFolder) this).aClass247_7086.requestArchive(255, -553176479 * ((GrabFolder) this).folder, (byte) 0, true, -1923437147));
		}
		if (((Class298_Sub37_Sub16) ((GrabFolder) this).aClass298_Sub37_Sub16_7090).downloading)
			return null;
		byte[] is = ((GrabFolder) this).aClass298_Sub37_Sub16_7090.get((short) 17552);
		do {
			if (((GrabFolder) this).aClass298_Sub37_Sub16_7090 instanceof Class298_Sub37_Sub16_Sub2) {
				try {
					if (null == is)
						throw new RuntimeException();
					((GrabFolder) this).header = new Class226(is, (28953951 * ((GrabFolder) this).checksum), ((GrabFolder) this).checksumBlock);
					if (1598805943 * ((GrabFolder) this).revision != 201380083 * (((Class226) ((GrabFolder) this).header).anInt2529))
						throw new RuntimeException();
					break;
				} catch (RuntimeException runtimeexception) {
					((GrabFolder) this).header = null;
					if (((GrabFolder) this).aClass247_7086.method2340((byte) 14))
						((GrabFolder) this).aClass298_Sub37_Sub16_7090 = null;
					else
						((GrabFolder) this).aClass298_Sub37_Sub16_7090 = (((GrabFolder) this).aClass247_7086.requestArchive(255, -553176479 * ((GrabFolder) this).folder, (byte) 0, true, -313120105));
					return null;
				}
			}
			try {
				if (null == is)
					throw new RuntimeException();
				((GrabFolder) this).header = new Class226(is, 28953951 * ((GrabFolder) this).checksum, ((GrabFolder) this).checksumBlock);
			} catch (RuntimeException runtimeexception) {
				((GrabFolder) this).aClass247_7086.method2359(-1420399817);
				((GrabFolder) this).header = null;
				if (((GrabFolder) this).aClass247_7086.method2340((byte) 14))
					((GrabFolder) this).aClass298_Sub37_Sub16_7090 = null;
				else
					((GrabFolder) this).aClass298_Sub37_Sub16_7090 = (((GrabFolder) this).aClass247_7086.requestArchive(255, ((GrabFolder) this).folder * -553176479, (byte) 0, true, 76396423));
				return null;
			}
			if (((GrabFolder) this).headerPartition != null)
				((GrabFolder) this).updateServer.method2431(-553176479 * ((GrabFolder) this).folder, is, ((GrabFolder) this).headerPartition, -1430287423);
		} while (false);
		((GrabFolder) this).aClass298_Sub37_Sub16_7090 = null;
		if (((GrabFolder) this).partition != null) {
			((GrabFolder) this).aByteArray7098 = new byte[(((Class226) ((GrabFolder) this).header).anInt2521) * -1583970959];
			((GrabFolder) this).anInt7092 = 0;
		}
		return ((GrabFolder) this).header;
	}

	byte[] method2251(int i, byte i_20_) {
		try {
			Class298_Sub37_Sub16 class298_sub37_sub16 = method2271(i, 0, (byte) 38);
			if (null == class298_sub37_sub16)
				return null;
			byte[] is = class298_sub37_sub16.get((short) 6593);
			class298_sub37_sub16.remove(-1460969981);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.f(").append(')').toString());
		}
	}

	byte[] method2258(int i) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = method2271(i, 0, (byte) 21);
		if (null == class298_sub37_sub16)
			return null;
		byte[] is = class298_sub37_sub16.get((short) -8951);
		class298_sub37_sub16.remove(-1460969981);
		return is;
	}

	byte[] method2259(int i) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = method2271(i, 0, (byte) 38);
		if (null == class298_sub37_sub16)
			return null;
		byte[] is = class298_sub37_sub16.get((short) -19395);
		class298_sub37_sub16.remove(-1460969981);
		return is;
	}

	int method2257(int i) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = ((Class298_Sub37_Sub16) ((GrabFolder) this).aClass437_7085.method5812((long) i));
		if (class298_sub37_sub16 != null)
			return class298_sub37_sub16.method3468(-2007766703);
		return 0;
	}

	int method2261(int i) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = ((Class298_Sub37_Sub16) ((GrabFolder) this).aClass437_7085.method5812((long) i));
		if (class298_sub37_sub16 != null)
			return class298_sub37_sub16.method3468(-2126560995);
		return 0;
	}

	Class298_Sub37_Sub16 method2277(int i, int i_32_) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = ((Class298_Sub37_Sub16) ((GrabFolder) this).aClass437_7085.method5812((long) i));
		if (class298_sub37_sub16 != null && 0 == i_32_ && !((Class298_Sub37_Sub16) class298_sub37_sub16).priority && ((Class298_Sub37_Sub16) class298_sub37_sub16).downloading) {
			class298_sub37_sub16.remove(-1460969981);
			class298_sub37_sub16 = null;
		}
		if (null == class298_sub37_sub16) {
			if (i_32_ == 0) {
				if (((GrabFolder) this).partition != null && ((GrabFolder) this).aByteArray7098[i] != -1)
					class298_sub37_sub16 = (((GrabFolder) this).updateServer.method2430(i, ((GrabFolder) this).partition, -1787098666));
				else if (!((GrabFolder) this).aClass247_7086.method2340((byte) 14))
					class298_sub37_sub16 = (((GrabFolder) this).aClass247_7086.requestArchive(-553176479 * ((GrabFolder) this).folder, i, (byte) 2, true, 1037407823));
				else
					return null;
			} else if (i_32_ == 1) {
				if (((GrabFolder) this).partition == null)
					throw new RuntimeException();
				class298_sub37_sub16 = (((GrabFolder) this).updateServer.method2429(i, ((GrabFolder) this).partition, (byte) -21));
			} else if (2 == i_32_) {
				if (null == ((GrabFolder) this).partition)
					throw new RuntimeException();
				if (-1 != ((GrabFolder) this).aByteArray7098[i])
					throw new RuntimeException();
				if (!((GrabFolder) this).aClass247_7086.method2347((byte) -55))
					class298_sub37_sub16 = (((GrabFolder) this).aClass247_7086.requestArchive(((GrabFolder) this).folder * -553176479, i, (byte) 2, false, -835440234));
				else
					return null;
			} else
				throw new RuntimeException();
			((GrabFolder) this).aClass437_7085.method5817(class298_sub37_sub16, (long) i);
		}
		if (((Class298_Sub37_Sub16) class298_sub37_sub16).downloading)
			return null;
		byte[] is = class298_sub37_sub16.get((short) -10519);
		if (class298_sub37_sub16 instanceof Class298_Sub37_Sub16_Sub2) {
			Class298_Sub37_Sub16 class298_sub37_sub16_33_;
			try {
				if (null == is || is.length <= 2)
					throw new RuntimeException();
				aCRC32_7110.reset();
				aCRC32_7110.update(is, 0, is.length - 2);
				int i_34_ = (int) aCRC32_7110.getValue();
				if ((((Class226) ((GrabFolder) this).header).anIntArray2522[i]) != i_34_)
					throw new RuntimeException();
				if ((((Class226) ((GrabFolder) this).header).aByteArrayArray2516) != null && (null != (((Class226) ((GrabFolder) this).header).aByteArrayArray2516[i]))) {
					byte[] is_35_ = (((Class226) ((GrabFolder) this).header).aByteArrayArray2516[i]);
					byte[] is_36_ = Class152.method1654(is, 0, is.length - 2, (byte) 67);
					for (int i_37_ = 0; i_37_ < 64; i_37_++) {
						if (is_35_[i_37_] != is_36_[i_37_])
							throw new RuntimeException();
					}
				}
				int i_38_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
				if (i_38_ != ((((Class226) ((GrabFolder) this).header).anIntArray2514[i]) & 0xffff))
					throw new RuntimeException();
				if (((GrabFolder) this).aByteArray7098[i] != 1) {
					if (((GrabFolder) this).aByteArray7098[i] != 0) {
						/* empty */
					}
					((GrabFolder) this).anInt7092 += 13538129;
					((GrabFolder) this).aByteArray7098[i] = (byte) 1;
				}
				if (!((Class298_Sub37_Sub16) class298_sub37_sub16).priority)
					class298_sub37_sub16.remove(-1460969981);
				class298_sub37_sub16_33_ = class298_sub37_sub16;
			} catch (Exception exception) {
				((GrabFolder) this).aByteArray7098[i] = (byte) -1;
				class298_sub37_sub16.remove(-1460969981);
				if (((Class298_Sub37_Sub16) class298_sub37_sub16).priority && !((GrabFolder) this).aClass247_7086.method2340((byte) 14)) {
					Class298_Sub37_Sub16_Sub1 class298_sub37_sub16_sub1 = (((GrabFolder) this).aClass247_7086.requestArchive(-553176479 * ((GrabFolder) this).folder, i, (byte) 2, true, -155086608));
					((GrabFolder) this).aClass437_7085.method5817(class298_sub37_sub16_sub1, (long) i);
				}
				return null;
			}
			return class298_sub37_sub16_33_;
		}
		try {
			if (is == null || is.length <= 2)
				throw new RuntimeException();
			aCRC32_7110.reset();
			aCRC32_7110.update(is, 0, is.length - 2);
			int i_39_ = (int) aCRC32_7110.getValue();
			if (i_39_ != (((Class226) ((GrabFolder) this).header).anIntArray2522[i]))
				throw new RuntimeException();
			if ((((Class226) ((GrabFolder) this).header).aByteArrayArray2516) != null && null != (((Class226) ((GrabFolder) this).header).aByteArrayArray2516[i])) {
				byte[] is_40_ = (((Class226) ((GrabFolder) this).header).aByteArrayArray2516[i]);
				byte[] is_41_ = Class152.method1654(is, 0, is.length - 2, (byte) -11);
				for (int i_42_ = 0; i_42_ < 64; i_42_++) {
					if (is_40_[i_42_] != is_41_[i_42_])
						throw new RuntimeException();
				}
			}
			((GrabFolder) this).aClass247_7086.anInt2735 = 0;
			((GrabFolder) this).aClass247_7086.anInt2745 = 0;
		} catch (RuntimeException runtimeexception) {
			((GrabFolder) this).aClass247_7086.method2359(556604655);
			class298_sub37_sub16.remove(-1460969981);
			if (((Class298_Sub37_Sub16) class298_sub37_sub16).priority && !((GrabFolder) this).aClass247_7086.method2340((byte) 14)) {
				Class298_Sub37_Sub16_Sub1 class298_sub37_sub16_sub1 = (((GrabFolder) this).aClass247_7086.requestArchive(-553176479 * ((GrabFolder) this).folder, i, (byte) 2, true, -1299366949));
				((GrabFolder) this).aClass437_7085.method5817(class298_sub37_sub16_sub1, (long) i);
			}
			return null;
		}
		is[is.length - 2] = (byte) ((((Class226) ((GrabFolder) this).header).anIntArray2514[i]) >>> 8);
		is[is.length - 1] = (byte) (((Class226) ((GrabFolder) this).header).anIntArray2514[i]);
		if (((GrabFolder) this).partition != null) {
			((GrabFolder) this).updateServer.method2431(i, is, ((GrabFolder) this).partition, 1120335343);
			if (((GrabFolder) this).aByteArray7098[i] != 1) {
				((GrabFolder) this).anInt7092 += 13538129;
				((GrabFolder) this).aByteArray7098[i] = (byte) 1;
			}
		}
		if (!((Class298_Sub37_Sub16) class298_sub37_sub16).priority)
			class298_sub37_sub16.remove(-1460969981);
		return class298_sub37_sub16;
	}

	Class226 method2255() {
		if (((GrabFolder) this).header != null)
			return ((GrabFolder) this).header;
		if (null == ((GrabFolder) this).aClass298_Sub37_Sub16_7090) {
			if (((GrabFolder) this).aClass247_7086.method2340((byte) 14))
				return null;
			((GrabFolder) this).aClass298_Sub37_Sub16_7090 = (((GrabFolder) this).aClass247_7086.requestArchive(255, -553176479 * ((GrabFolder) this).folder, (byte) 0, true, -1646455310));
		}
		if (((Class298_Sub37_Sub16) ((GrabFolder) this).aClass298_Sub37_Sub16_7090).downloading)
			return null;
		byte[] is = ((GrabFolder) this).aClass298_Sub37_Sub16_7090.get((short) 15445);
		do {
			if (((GrabFolder) this).aClass298_Sub37_Sub16_7090 instanceof Class298_Sub37_Sub16_Sub2) {
				try {
					if (null == is)
						throw new RuntimeException();
					((GrabFolder) this).header = new Class226(is, (28953951 * ((GrabFolder) this).checksum), ((GrabFolder) this).checksumBlock);
					if (1598805943 * ((GrabFolder) this).revision != 201380083 * (((Class226) ((GrabFolder) this).header).anInt2529))
						throw new RuntimeException();
					break;
				} catch (RuntimeException runtimeexception) {
					((GrabFolder) this).header = null;
					if (((GrabFolder) this).aClass247_7086.method2340((byte) 14))
						((GrabFolder) this).aClass298_Sub37_Sub16_7090 = null;
					else
						((GrabFolder) this).aClass298_Sub37_Sub16_7090 = (((GrabFolder) this).aClass247_7086.requestArchive(255, -553176479 * ((GrabFolder) this).folder, (byte) 0, true, -1760474693));
					return null;
				}
			}
			try {
				if (null == is)
					throw new RuntimeException();
				((GrabFolder) this).header = new Class226(is, 28953951 * ((GrabFolder) this).checksum, ((GrabFolder) this).checksumBlock);
			} catch (RuntimeException runtimeexception) {
				((GrabFolder) this).aClass247_7086.method2359(-1856562324);
				((GrabFolder) this).header = null;
				if (((GrabFolder) this).aClass247_7086.method2340((byte) 14))
					((GrabFolder) this).aClass298_Sub37_Sub16_7090 = null;
				else
					((GrabFolder) this).aClass298_Sub37_Sub16_7090 = (((GrabFolder) this).aClass247_7086.requestArchive(255, ((GrabFolder) this).folder * -553176479, (byte) 0, true, 1078557293));
				return null;
			}
			if (((GrabFolder) this).headerPartition != null)
				((GrabFolder) this).updateServer.method2431(-553176479 * ((GrabFolder) this).folder, is, ((GrabFolder) this).headerPartition, -1078065022);
		} while (false);
		((GrabFolder) this).aClass298_Sub37_Sub16_7090 = null;
		if (((GrabFolder) this).partition != null) {
			((GrabFolder) this).aByteArray7098 = new byte[(((Class226) ((GrabFolder) this).header).anInt2521) * -1583970959];
			((GrabFolder) this).anInt7092 = 0;
		}
		return ((GrabFolder) this).header;
	}

	public void method2278(byte i) {
		try {
			if (((GrabFolder) this).partition != null) {
				((GrabFolder) this).aBoolean7111 = true;
				if (((GrabFolder) this).aClass453_7100 == null)
					((GrabFolder) this).aClass453_7100 = new Class453();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.o(").append(')').toString());
		}
	}

	Class226 method2250(int i) {
		try {
			if (((GrabFolder) this).header != null)
				return ((GrabFolder) this).header;
			if (null == ((GrabFolder) this).aClass298_Sub37_Sub16_7090) {
				if (((GrabFolder) this).aClass247_7086.method2340((byte) 14))
					return null;
				((GrabFolder) this).aClass298_Sub37_Sub16_7090 = (((GrabFolder) this).aClass247_7086.requestArchive(255, -553176479 * ((GrabFolder) this).folder, (byte) 0, true, -1469164318));
			}
			if (((Class298_Sub37_Sub16) ((GrabFolder) this).aClass298_Sub37_Sub16_7090).downloading)
				return null;
			byte[] is = ((GrabFolder) this).aClass298_Sub37_Sub16_7090.get((short) -4612);
			do {
				if (((GrabFolder) this).aClass298_Sub37_Sub16_7090 instanceof Class298_Sub37_Sub16_Sub2) {
					try {
						if (null == is)
							throw new RuntimeException();
						((GrabFolder) this).header = new Class226(is, 28953951 * (((GrabFolder) this).checksum), (((GrabFolder) this).checksumBlock));
						if (1598805943 * ((GrabFolder) this).revision != 201380083 * (((Class226) (((GrabFolder) this).header)).anInt2529)) {
							throw new RuntimeException();
						}
						break;
					} catch (RuntimeException runtimeexception) {
						((GrabFolder) this).header = null;
						if (((GrabFolder) this).aClass247_7086.method2340((byte) 14))
							((GrabFolder) this).aClass298_Sub37_Sub16_7090 = null;
						else
							((GrabFolder) this).aClass298_Sub37_Sub16_7090 = (((GrabFolder) this).aClass247_7086.requestArchive(255, (-553176479 * ((GrabFolder) this).folder), (byte) 0, true, -165290458));
						return null;
					}
				}
				try {
					if (null == is)
						throw new RuntimeException();
					((GrabFolder) this).header = new Class226(is, (28953951 * ((GrabFolder) this).checksum), ((GrabFolder) this).checksumBlock);
				} catch (RuntimeException runtimeexception) {
					((GrabFolder) this).aClass247_7086.method2359(674708053);
					((GrabFolder) this).header = null;
					if (((GrabFolder) this).aClass247_7086.method2340((byte) 14))
						((GrabFolder) this).aClass298_Sub37_Sub16_7090 = null;
					else
						((GrabFolder) this).aClass298_Sub37_Sub16_7090 = (((GrabFolder) this).aClass247_7086.requestArchive(255, ((GrabFolder) this).folder * -553176479, (byte) 0, true, 1947550865));
					return null;
				}
				if (((GrabFolder) this).headerPartition != null)
					((GrabFolder) this).updateServer.method2431(-553176479 * ((GrabFolder) this).folder, is, ((GrabFolder) this).headerPartition, -586951023);
			} while (false);
			((GrabFolder) this).aClass298_Sub37_Sub16_7090 = null;
			if (((GrabFolder) this).partition != null) {
				((GrabFolder) this).aByteArray7098 = (new byte[(((Class226) ((GrabFolder) this).header).anInt2521) * -1583970959]);
				((GrabFolder) this).anInt7092 = 0;
			}
			return ((GrabFolder) this).header;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.a(").append(')').toString());
		}
	}

	byte[] method2262(int i) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = method2271(i, 0, (byte) 124);
		if (null == class298_sub37_sub16)
			return null;
		byte[] is = class298_sub37_sub16.get((short) 20083);
		class298_sub37_sub16.remove(-1460969981);
		return is;
	}

	void method2263(int i) {
		if (null != ((GrabFolder) this).partition) {
			for (Class298 class298 = ((GrabFolder) this).aClass453_7105.method5939(1766612795); null != class298; class298 = ((GrabFolder) this).aClass453_7105.method5944(49146)) {
				if (7051297995265073167L * class298.aLong3188 == (long) i)
					return;
			}
			Class298 class298 = new Class298();
			class298.aLong3188 = (long) i * 4191220306876042991L;
			((GrabFolder) this).aClass453_7105.add(class298, 1192203281);
		}
	}

	public int method2279(int i) {
		try {
			if (((GrabFolder) this).header == null)
				return 0;
			return ((((Class226) ((GrabFolder) this).header).anInt2527) * -2145352941);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.m(").append(')').toString());
		}
	}

	void method2249(int i) {
		if (null != ((GrabFolder) this).partition) {
			for (Class298 class298 = ((GrabFolder) this).aClass453_7105.method5939(1766612795); null != class298; class298 = ((GrabFolder) this).aClass453_7105.method5944(49146)) {
				if (7051297995265073167L * class298.aLong3188 == (long) i)
					return;
			}
			Class298 class298 = new Class298();
			class298.aLong3188 = (long) i * 4191220306876042991L;
			((GrabFolder) this).aClass453_7105.add(class298, 429546119);
		}
	}

	void method2265(int i) {
		if (null != ((GrabFolder) this).partition) {
			for (Class298 class298 = ((GrabFolder) this).aClass453_7105.method5939(1766612795); null != class298; class298 = ((GrabFolder) this).aClass453_7105.method5944(49146)) {
				if (7051297995265073167L * class298.aLong3188 == (long) i)
					return;
			}
			Class298 class298 = new Class298();
			class298.aLong3188 = (long) i * 4191220306876042991L;
			((GrabFolder) this).aClass453_7105.add(class298, 1262906259);
		}
	}

	static void method2280(int i, byte i_43_) {
		try {
			for (Class298 class298 = client.settings.method5816(2109381941); null != class298; class298 = client.settings.method5815((byte) -58)) {
				if ((long) i == (7051297995265073167L * class298.aLong3188 >> 48 & 0xffffL))
					class298.remove(-1460969981);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.mu(").append(')').toString());
		}
	}

	static final void method2281(ClientScript2 class403, short i) {
		try {
			Class346.method4172(ClientScriptMap.recoverPassLink((byte) -59), true,
					Class422_Sub25.preferences.graphicsMode
							.method5677(-1851684401) == 5, client.aBoolean8867,
					client.aBoolean8651, (byte) 49);
		} catch (RuntimeException runtimeexception) {

		}
	}

	public static void method2282(int i, int i_45_, String string, String string_46_, String string_47_, String string_48_, int i_49_) {
		try {
			Class25.method393(i, i_45_, string, string_46_, string_47_, string_48_, null, -1, 1446000206);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.p(").append(')').toString());
		}
	}

	static void method2283(byte i) {
		try {
			int i_50_ = 0;
			if (Class422_Sub25.preferences != null)
				i_50_ = Class422_Sub25.preferences.aClass422_Sub8_7566.method5654(-1747444886);
			if (i_50_ == 2) {
				int i_51_ = (-639974669 * Class78.anInt733 > 800 ? 800 : Class78.anInt733 * -639974669);
				int i_52_ = (client.anInt6472 * 1282634425 > 600 ? 600 : 1282634425 * client.anInt6472);
				Class462.screenWidth = -2010408377 * i_51_;
				client.anInt6473 = -753018213 * ((Class78.anInt733 * -639974669 - i_51_) / 2);
				Class298_Sub40_Sub9.screenHeight = 1445266787 * i_52_;
				client.anInt6474 = 0;
			} else if (i_50_ == 1) {
				int i_53_ = (-639974669 * Class78.anInt733 > 1024 ? 1024 : Class78.anInt733 * -639974669);
				int i_54_ = (client.anInt6472 * 1282634425 > 768 ? 768 : client.anInt6472 * 1282634425);
				Class462.screenWidth = i_53_ * -2010408377;
				client.anInt6473 = -753018213 * ((-639974669 * Class78.anInt733 - i_53_) / 2);
				Class298_Sub40_Sub9.screenHeight = 1445266787 * i_54_;
				client.anInt6474 = 0;
			} else {
				Class462.screenWidth = Class78.anInt733 * -607961243;
				client.anInt6473 = 0;
				Class298_Sub40_Sub9.screenHeight = client.anInt6472 * -1935672693;
				client.anInt6474 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaz.gm(").append(')').toString());
		}
	}
		
}
