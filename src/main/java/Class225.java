
import java.math.BigInteger;

public class Class225 {
	Class255 aClass255_2505;
	BigInteger aBigInteger2506;
	Class298_Sub37_Sub16_Sub1 aClass298_Sub37_Sub16_Sub1_2507;
	BigInteger aBigInteger2508;
	Class247 updateServer;
	RsByteBuffer archive255_255Data;
	GrabFolder[] grabFolders;
	public static Class162 aClass162_2512;

	public boolean method2094(int i) {
		try {
			if (((Class225) this).archive255_255Data != null)
				return true;
			if (null == ((Class225) this).aClass298_Sub37_Sub16_Sub1_2507) {
				if (((Class225) this).updateServer.method2340((byte) 14))
					return false;
				((Class225) this).aClass298_Sub37_Sub16_Sub1_2507 = ((Class225) this).updateServer.requestArchive(255, 255, (byte) 0, true, 503469901);
			}
			if (((Class298_Sub37_Sub16_Sub1) ((Class225) this).aClass298_Sub37_Sub16_Sub1_2507).downloading)
				return false;
			RsByteBuffer buffer = new RsByteBuffer(((Class225) this).aClass298_Sub37_Sub16_Sub1_2507.get((short) 8819));
			buffer.index = 582066555;
			int i_0_ = buffer.readUnsignedByte();
			buffer.index += -208176200 * i_0_;
			byte[] is = new byte[(buffer.buffer.length - 385051775 * buffer.index)];
			buffer.readBytes(is, 0, is.length, -953523806);
			byte[] hash;
			if (null == ((Class225) this).aBigInteger2506 || ((Class225) this).aBigInteger2508 == null || Settings.DISABLE_RSA)
				hash = is;
			else {
				BigInteger biginteger = new BigInteger(is);
				BigInteger biginteger_2_ = biginteger.modPow(((Class225) this).aBigInteger2506, ((Class225) this).aBigInteger2508);
				hash = biginteger_2_.toByteArray();
			}
			if (hash.length != 64 && hash.length != 65)
				throw new RuntimeException();
			byte[] is_3_ = Class152.method1654(buffer.buffer, 5, (385051775 * buffer.index - is.length - 5), (byte) -63);
			for (int i_4_ = 0; i_4_ < 64; i_4_++) {
				if (is_3_[i_4_] != hash[i_4_] && is_3_[i_4_] != hash[i_4_ + 1]) {
					throw new RuntimeException();
				}
			}
			((Class225) this).grabFolders = new GrabFolder[i_0_];
			((Class225) this).archive255_255Data = buffer;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jn.a(").append(')').toString());
		}
	}

	public GrabFolder method2095(int i, Partition class329, Partition class329_5_, int i_6_) {
		try {
			return method2096(i, class329, class329_5_, true, 2087192447);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jn.f(").append(')').toString());
		}
	}

	GrabFolder method2096(int i, Partition class329, Partition class329_7_, boolean bool, int i_8_) {
		try {
			if (null == ((Class225) this).archive255_255Data)
				throw new RuntimeException();
			if (i < 0 || i >= ((Class225) this).grabFolders.length)
				throw new RuntimeException();
			if (((Class225) this).grabFolders[i] != null)
				return ((Class225) this).grabFolders[i];
			((Class225) this).archive255_255Data.index = 698479866 + i * -208176200;
			int checksum = ((Class225) this).archive255_255Data.readInt((byte) 13);
			int revision = ((Class225) this).archive255_255Data.readInt((byte) 84);
			byte[] checksumBlock = new byte[64];
			((Class225) this).archive255_255Data.readBytes(checksumBlock, 0, 64, -953523806);
			GrabFolder class242_sub1 = new GrabFolder(i, class329, class329_7_, ((Class225) this).updateServer, ((Class225) this).aClass255_2505, checksum, checksumBlock, revision, bool);
			((Class225) this).grabFolders[i] = class242_sub1;
			return class242_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jn.b(").append(')').toString());
		}
	}

	public void method2097(int i) {
		try {
			if (((Class225) this).grabFolders != null) {
				for (int i_11_ = 0; i_11_ < ((Class225) this).grabFolders.length; i_11_++) {
					if (((Class225) this).grabFolders[i_11_] != null)
						((Class225) this).grabFolders[i_11_].method2272((byte) 32);
				}
				for (int i_12_ = 0; i_12_ < ((Class225) this).grabFolders.length; i_12_++) {
					if (((Class225) this).grabFolders[i_12_] != null)
						((Class225) this).grabFolders[i_12_].method2273(437628699);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jn.p(").append(')').toString());
		}
	}

	public Class225(Class247 class247, Class255 class255, BigInteger biginteger, BigInteger biginteger_13_) {
		((Class225) this).updateServer = class247;
		((Class225) this).aClass255_2505 = class255;
		((Class225) this).aBigInteger2506 = biginteger;
		((Class225) this).aBigInteger2508 = biginteger_13_;
		if (!((Class225) this).updateServer.method2340((byte) 14))
			((Class225) this).aClass298_Sub37_Sub16_Sub1_2507 = ((Class225) this).updateServer.requestArchive(255, 255, (byte) 0, true, -562787120);
	}

	static final void method2098(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class485.anInt6059 * 551398421;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jn.ams(").append(')').toString());
		}
	}

	static final void method2099(Class298_Sub1 class298_sub1, boolean bool, byte i) {
		try {
			if (((Class298_Sub1) class298_sub1).aBoolean7160) {
				if (-1188221251 * ((Class298_Sub1) class298_sub1).anInt7148 < 0 || Class140.method1559(client.aClass283_8716.method2641(681883413), (-1188221251 * (((Class298_Sub1) class298_sub1).anInt7148)), (-366156959 * (((Class298_Sub1) class298_sub1).anInt7154)), (byte) -3)) {
					if (!bool)
						GraphicsConfig.method4923((((Class298_Sub1) class298_sub1).anInt7151 * 2108312995), (((Class298_Sub1) class298_sub1).anInt7157 * -431456739), class298_sub1.anInt7150 * 634196087, class298_sub1.anInt7155 * -2146829167, (((Class298_Sub1) class298_sub1).anInt7148 * -1188221251), (((Class298_Sub1) class298_sub1).anInt7161 * -1234291173), (-366156959 * ((Class298_Sub1) class298_sub1).anInt7154), -1, -1628738260);
					else
						Class516.method6300((((Class298_Sub1) class298_sub1).anInt7151 * 2108312995), (((Class298_Sub1) class298_sub1).anInt7157 * -431456739), class298_sub1.anInt7150 * 634196087, class298_sub1.anInt7155 * -2146829167, null, (byte) 68);
					class298_sub1.remove(-1460969981);
				}
			} else if (((Class298_Sub1) class298_sub1).aBoolean7159 && 634196087 * class298_sub1.anInt7150 >= 1 && class298_sub1.anInt7155 * -2146829167 >= 1 && (634196087 * class298_sub1.anInt7150 <= (client.aClass283_8716.method2629(-2002349453) - 2)) && (class298_sub1.anInt7155 * -2146829167 <= client.aClass283_8716.method2630(1538814162) - 2) && ((((Class298_Sub1) class298_sub1).anInt7156 * 856355825) < 0 || (Class140.method1559(client.aClass283_8716.method2641(-2135125377), (((Class298_Sub1) class298_sub1).anInt7156 * 856355825), (205923815 * ((Class298_Sub1) class298_sub1).anInt7153), (byte) -66)))) {
				if (!bool)
					GraphicsConfig.method4923((((Class298_Sub1) class298_sub1).anInt7151 * 2108312995), (-431456739 * ((Class298_Sub1) class298_sub1).anInt7157), class298_sub1.anInt7150 * 634196087, class298_sub1.anInt7155 * -2146829167, 856355825 * ((Class298_Sub1) class298_sub1).anInt7156, (((Class298_Sub1) class298_sub1).anInt7149 * -674934345), ((Class298_Sub1) class298_sub1).anInt7153 * 205923815, -1, 628810012);
				else
					Class516.method6300((((Class298_Sub1) class298_sub1).anInt7151) * 2108312995, (((Class298_Sub1) class298_sub1).anInt7157) * -431456739, class298_sub1.anInt7150 * 634196087, class298_sub1.anInt7155 * -2146829167, (((Class298_Sub1) class298_sub1).aClass435_7158), (byte) 110);
				((Class298_Sub1) class298_sub1).aBoolean7159 = false;
				if (!bool && (856355825 * ((Class298_Sub1) class298_sub1).anInt7156 == (-1188221251 * ((Class298_Sub1) class298_sub1).anInt7148)) && (-1188221251 * ((Class298_Sub1) class298_sub1).anInt7148 == -1))
					class298_sub1.remove(-1460969981);
				else if (!bool && ((((Class298_Sub1) class298_sub1).anInt7148 * -1188221251) == (856355825 * ((Class298_Sub1) class298_sub1).anInt7156)) && ((((Class298_Sub1) class298_sub1).anInt7161 * -1234291173) == (((Class298_Sub1) class298_sub1).anInt7149 * -674934345)) && ((205923815 * ((Class298_Sub1) class298_sub1).anInt7153) == (-366156959 * ((Class298_Sub1) class298_sub1).anInt7154)))
					class298_sub1.remove(-1460969981);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jn.k(").append(')').toString());
		}
	}

	static final void method2100(ClientScript2 class403, int i) {
		try {
			int i_14_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			WidgetConfig class105 = Class50.getIComponentDefinitions(i_14_, (byte) 21);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class105.anInt1284 * -261021353;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jn.ri(").append(')').toString());
		}
	}

	static final void method2101(WidgetConfig class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			class105.textShadowed = (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) == 1;
			Tradution.method6054(class105, 664370665);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jn.ed(").append(')').toString());
		}
	}

	static final void method2102(WidgetConfig class105, Class119 class119, ClientScript2 class403, short i) {
		try {
			class105.aString1237 = (String) (((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 -= 969361751) * -203050393)]);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jn.jg(").append(')').toString());
		}
	}

	static void method2103(int i) {
		try {

			if (1196508279 * Class82_Sub14.anInt6875 < 0) {
				Class82_Sub14.anInt6875 = 0;
				Class301_Sub1.anInt7632 = 433609607;
				Class301_Sub1.anInt7627 = 789877945;
			}
			if (1196508279 * Class82_Sub14.anInt6875 > Class301_Sub1.mapWidth) {
				Class82_Sub14.anInt6875 = Class301_Sub1.mapWidth * -2076584633;
				Class301_Sub1.anInt7632 = 433609607;
				Class301_Sub1.anInt7627 = 789877945;
			}
			if (Class376.anInt4090 * 1882038855 < 0) {
				Class376.anInt4090 = 0;
				Class301_Sub1.anInt7632 = 433609607;
				Class301_Sub1.anInt7627 = 789877945;
			}
			if (1882038855 * Class376.anInt4090 > Class301_Sub1.mapHeight) {
				Class376.anInt4090 = Class301_Sub1.mapHeight * -435591305;
				Class301_Sub1.anInt7632 = 433609607;
				Class301_Sub1.anInt7627 = 789877945;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jn.bg(").append(')').toString());
		}
	}
}
