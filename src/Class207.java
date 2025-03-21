/* Class207 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.URL;

public class Class207 {
	public int anInt1941;
	static IndexTable aClass280_1942;
	static Class367 aClass367_1943 = new Class367(64);
	static int anInt1944 = 0;
	public int anInt1945;
	public int anInt1946;
	public int anInt1947;
	public boolean aBoolean1948;
	public boolean aBoolean1949;
	public int anInt1950 = 928045619;
	static boolean aBoolean1951;
	static Class339 aClass339_1952;

	void method2190(Buffer class330_sub46, int i, int i_0_) {
		try {
			for (;;) {
				int i_1_ = class330_sub46.readUnsignedByte(1027581275);
				if (i_1_ == 0) {
					if (i_0_ >= -1066304221) {
						/* empty */
					}
					break;
				}
				method2191(class330_sub46, i_1_, i, -1599540272);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("is.i(").append(')').toString());
		}
	}

	void method2191(Buffer class330_sub46, int i, int i_2_, int i_3_) {
		try {
			if (1 == i) {
				anInt1950 = class330_sub46.readUnsignedShort(2082800370) * -928045619;
				if (1569869573 * anInt1950 == 65535)
					anInt1950 = 928045619;
			} else if (i == 2) {
				anInt1945 = (class330_sub46.readUnsignedShort(120847192) + 1) * 1257061995;
				anInt1946 = (class330_sub46.readUnsignedShort(24504865) + 1) * 1662229365;
			} else if (i == 3)
				class330_sub46.readByte((byte) 32);
			else if (4 == i)
				anInt1947 = class330_sub46.readUnsignedByte(1515200924) * -1518099561;
			else if (i == 5)
				anInt1941 = class330_sub46.readUnsignedByte(1079274087) * -1753574315;
			else if (i == 6)
				aBoolean1949 = true;
			else if (7 == i)
				aBoolean1948 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("is.p(").append(')').toString());
		}
	}

	Class207() {
		anInt1945 = -1152410944;
		anInt1946 = -991503040;
		anInt1947 = 1258768174;
		anInt1941 = -1753574315;
		aBoolean1949 = false;
		aBoolean1948 = false;
	}

	static File method2192(String string, int i) {
		try {
			if (!Class317.aBoolean3275)
				throw new RuntimeException("");
			File file = (File) Class317.aHashtable3277.get(string);
			if (null != file)
				return file;
			File file_4_ = new File(Class317.aFile3276, string);
			RandomAccessFile randomaccessfile = null;
			File file_5_;
			try {
				File file_6_ = new File(file_4_.getParent());
				if (!file_6_.exists())
					throw new RuntimeException("");
				randomaccessfile = new RandomAccessFile(file_4_, "rw");
				int i_7_ = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i_7_);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				Class317.aHashtable3277.put(string, file_4_);
				file_5_ = file_4_;
			} catch (Exception exception) {
				try {
					if (null != randomaccessfile) {
						randomaccessfile.close();
						Object object = null;
					}
				} catch (Exception exception_8_) {
					/* empty */
				}
				throw new RuntimeException();
			}
			return file_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("is.j(").append(')').toString());
		}
	}

	static final void method2193(Class430 class430, int i) {
		try {
			int i_9_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_9_, 1591206865);
			Class120 class120 = Class3.aClass120Array56[i_9_ >> 16];
			Class152.method1784(iComponentDefinitions, class120, class430, (byte) -62);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("is.dk(").append(')').toString());
		}
	}

	static final void method2194(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			client.aShort8962 = (short) (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			if (client.aShort8962 <= 0)
				client.aShort8962 = (short) 256;
			client.aShort9067 = (short) (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			if (client.aShort9067 <= 0)
				client.aShort9067 = (short) 205;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("is.amn(").append(')').toString());
		}
	}

	public static void method2195(String string, Throwable throwable, int i) {
		try {
			try {
				String string_10_ = "";
				if (throwable != null)
					string_10_ = Class330_Sub31_Sub2.method3426(throwable, (byte) 103);
				if (null != string) {
					if (throwable != null)
						string_10_ = new StringBuilder().append(string_10_).append(" | ").toString();
					string_10_ = new StringBuilder().append(string_10_).append(string).toString();
				}
				Class477_Sub2.method6001(string_10_, (byte) 5);
				string_10_ = Class411.method5226(string_10_, (byte) -76);
				if (RuntimeException_Sub2.anApplet6443 != null) {
					String string_11_ = "Unknown";
					String string_12_ = "1.1";
					try {
						string_11_ = System.getProperty("java.vendor");
						string_12_ = System.getProperty("java.version");
					} catch (Exception exception) {
						/* empty */
					}
					URL url = (new URL(RuntimeException_Sub2.anApplet6443.getCodeBase(), new StringBuilder().append("clienterror.ws?c=").append(1152910903 * Exception_Sub2.anInt15).append("&cs=").append(RuntimeException_Sub2.anInt6441 * 812861449).append("&u=").append(RuntimeException_Sub2.aString6440 != null ? Class411.method5226((RuntimeException_Sub2.aString6440), (byte) -19) : new StringBuilder().append("").append(RuntimeException_Sub2.aLong6442 * -5675442636336852345L).toString()).append("&v1=").append(Class411.method5226(string_11_, (byte) -95)).append("&v2=").append(Class411.method5226(string_12_, (byte) -15)).append("&e=").append(string_10_).toString()));
					DataInputStream datainputstream = new DataInputStream(url.openStream());
					datainputstream.read();
					datainputstream.close();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("is.r(").append(')').toString());
		}
	}
}
