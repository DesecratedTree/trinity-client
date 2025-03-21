/* Class535 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class535 {
	public int anInt6225;
	public int anInt6226;
	public char aChar6227;
	public int anInt6228;

	void method6308(Buffer class330_sub46, short i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(663941675);
				if (i_0_ == 0) {
					if (i < 255)
						break;
					break;
				}
				method6309(class330_sub46, i_0_, -1648106698);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("we.r(").append(')').toString());
		}
	}

	void method6309(Buffer class330_sub46, int i, int i_1_) {
		try {
			if (1 == i)
				aChar6227 = Class127.method1546(class330_sub46.readByte((byte) 32), -2146625067);
			else if (3 == i) {
				anInt6226 = class330_sub46.readUnsignedShort(1323145111) * 1833007861;
				anInt6228 = class330_sub46.readUnsignedByte(837142210) * 273733907;
				anInt6225 = class330_sub46.readUnsignedByte(14473167) * -1497308295;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("we.j(").append(')').toString());
		}
	}

	Class535() {
		/* empty */
	}

	public static String method6310(Class330_Sub36_Sub10 class330_sub36_sub10, int i) {
		try {
			if (Class484.aBoolean5782 || class330_sub36_sub10 == null)
				return "";
			int[] is = Class22.method471(class330_sub36_sub10, 1955685818);
			if (null == is)
				return "";
			return Class431.method5343(is, -1410668725);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("we.aa(").append(')').toString());
		}
	}

	static final int method6311(int i, int i_2_) {
		try {
			return i >> 11 & 0x7f;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("we.p(").append(')').toString());
		}
	}

	public static byte[] method6312(Object object, int i, int i_3_, int i_4_) {
		try {
			if (null == object)
				return null;
			if (object instanceof byte[]) {
				byte[] is = (byte[]) object;
				return Arrays.copyOfRange(is, i, i + i_3_);
			}
			if (object instanceof ByteBuffer) {
				ByteBuffer bytebuffer = (ByteBuffer) object;
				byte[] is = new byte[i_3_];
				bytebuffer.position(i);
				bytebuffer.get(is, 0, i_3_);
				return is;
			}
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("we.i(").append(')').toString());
		}
	}

	static final void method6313(Class430 class430, byte i) {
		try {
			if (Class401_Sub1.aClass145_Sub1_8249.method1693(-662919830) != Class136.aClass136_1525)
				throw new RuntimeException();
			Class166_Sub3 class166_sub3 = ((Class166_Sub3) Class401_Sub1.aClass145_Sub1_8249.method1707(1915121166));
			class166_sub3.method2012(Class374.aClass245_6659, -1, 1379251543);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("we.ahv(").append(')').toString());
		}
	}

	static void method6314(int i, int i_5_, IComponentDefinitions iComponentDefinitions, Class122 class122, int i_6_, int i_7_, int i_8_) {
		try {
			Class3[] class3s = client.aClass3Array8986;
			for (int i_9_ = 0; i_9_ < class3s.length; i_9_++) {
				Class3 class3 = class3s[i_9_];
				if (null != class3 && 0 != class3.anInt53 * -1598012345 && 822953439 * client.anInt8981 % 20 < 10) {
					if (1 == -1598012345 * class3.anInt53) {
						Class330_Sub35 class330_sub35 = ((Class330_Sub35) (client.aClass497_9014.method6094((long) (class3.anInt47 * 539258015))));
						if (null != class330_sub35) {
							NPC class432_sub1_sub1_sub1_sub2 = ((NPC) class330_sub35.anObject7733);
							Class260 class260 = (class432_sub1_sub1_sub1_sub2.method5346().aClass260_2606);
							int i_10_ = (int) class260.aFloat2716 / 128 - i / 128;
							int i_11_ = (int) class260.aFloat2711 / 128 - i_5_ / 128;
							Class201_Sub1.method2169(iComponentDefinitions, class122, i_6_, i_7_, i_10_, i_11_, (-646855375 * (((Class3) class3).anInt46)), 360000L);
						}
					}
					if (2 == -1598012345 * class3.anInt53) {
						int i_12_ = class3.anInt51 * -729840739 / 128 - i / 128;
						int i_13_ = -848947047 * class3.anInt50 / 128 - i_5_ / 128;
						long l = (long) (-1507987917 * class3.anInt49 << 7);
						l *= l;
						Class201_Sub1.method2169(iComponentDefinitions, class122, i_6_, i_7_, i_12_, i_13_, (-646855375 * ((Class3) class3).anInt46), l);
					}
					if (class3.anInt53 * -1598012345 == 10 && class3.anInt47 * 539258015 >= 0 && (539258015 * class3.anInt47 < (client.players).length)) {
						Player class432_sub1_sub1_sub1_sub1 = (client.players[539258015 * class3.anInt47]);
						if (class432_sub1_sub1_sub1_sub1 != null) {
							Class260 class260 = (class432_sub1_sub1_sub1_sub1.method5346().aClass260_2606);
							int i_14_ = (int) class260.aFloat2716 / 128 - i / 128;
							int i_15_ = (int) class260.aFloat2711 / 128 - i_5_ / 128;
							Class201_Sub1.method2169(iComponentDefinitions, class122, i_6_, i_7_, i_14_, i_15_, (-646855375 * (((Class3) class3).anInt46)), 360000L);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("we.k(").append(')').toString());
		}
	}
}
