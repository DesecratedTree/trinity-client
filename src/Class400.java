/* Class400 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class400 {
	Class367 aClass367_4124 = new Class367(64);
	IndexTable aClass280_4125;
	public static IndexTable clientVarpBitDefinitions;

	public void method4698(byte i) {
		try {
			synchronized (((Class400) this).aClass367_4124) {
				((Class400) this).aClass367_4124.method4298((byte) 31);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qn.j(").append(')').toString());
		}
	}

	public void method4699(int i) {
		try {
			synchronized (((Class400) this).aClass367_4124) {
				((Class400) this).aClass367_4124.method4296(-370493554);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qn.p(").append(')').toString());
		}
	}

	public Class402 method4700(int i, int i_0_) {
		try {
			Class402 class402;
			synchronized (((Class400) this).aClass367_4124) {
				class402 = (Class402) ((Class400) this).aClass367_4124.get((long) i);
			}
			if (class402 != null)
				return class402;
			byte[] is;
			synchronized (((Class400) this).aClass280_4125) {
				is = (((Class400) this).aClass280_4125.getFile(Class103.aClass103_977.anInt982 * -989081113, i));
			}
			class402 = new Class402();
			if (is != null)
				class402.method4724(new Buffer(is), -1390213322);
			synchronized (((Class400) this).aClass367_4124) {
				((Class400) this).aClass367_4124.put(class402, (long) i);
			}
			return class402;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qn.r(").append(')').toString());
		}
	}

	public void method4701(int i, int i_1_) {
		try {
			synchronized (((Class400) this).aClass367_4124) {
				((Class400) this).aClass367_4124.method4292(i, (byte) 121);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qn.i(").append(')').toString());
		}
	}

	public Class400(Class435 class435, Class454 class454, IndexTable class280) {
		((Class400) this).aClass280_4125 = class280;
		if (null != ((Class400) this).aClass280_4125)
			((Class400) this).aClass280_4125.method2763(-989081113 * Class103.aClass103_977.anInt982, -2048999840);
	}

	static final void method4702(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = iComponentDefinitions.anInt1211 * 861085587;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qn.pq(").append(')').toString());
		}
	}

	static final void method4703(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_2_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			boolean bool = 1 == (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			if (null != Class354_Sub1.aClass497_7991) {
				Class330 class330 = Class354_Sub1.aClass497_7991.method6094((long) i_2_);
				if (null != class330 && !bool)
					class330.method3252(-10324747);
				else if (class330 == null && bool) {
					class330 = new Class330();
					Class354_Sub1.aClass497_7991.method6097(class330, (long) i_2_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qn.aey(").append(')').toString());
		}
	}

	public static void method4704(int i, byte i_3_) {
		try {
			MusicManager.currentState = 1408571369;
			Class110.musicArchive = null;
			MusicManager.musicId = -717142103;
			MusicManager.musicIndex = -38247865;
			Class288.aClass330_Sub40_Sub2_2955 = null;
			Class121.volume = 0;
			Class268.aBoolean2746 = false;
			Class457.anInt6843 = -1168308059 * i;
			Class403.aClass111_4138 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qn.l(").append(')').toString());
		}
	}

	static final void method4705(Class430 class430, byte i) {
		try {
			int i_4_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_4_, -2111697421);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = iComponentDefinitions.anInt1222 * -527289817;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qn.rp(").append(')').toString());
		}
	}

	static final void method4706(Class430 class430, byte i) {
		try {
			Class432_Sub1_Sub4_Sub1.method5540(class430, -1157517901);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qn.sq(").append(')').toString());
		}
	}

	public static byte[] method4707(Object object, boolean bool, int i) {
		try {
			if (null == object)
				return null;
			if (object instanceof byte[]) {
				byte[] is = (byte[]) object;
				if (bool)
					return Arrays.copyOf(is, is.length);
				return is;
			}
			if (object instanceof ByteBuffer) {
				ByteBuffer bytebuffer = (ByteBuffer) object;
				byte[] is = new byte[bytebuffer.capacity()];
				bytebuffer.position(0);
				bytebuffer.get(is);
				return is;
			}
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qn.j(").append(')').toString());
		}
	}

	public static void method4708(IComponentDefinitions iComponentDefinitions, int i, int i_5_, int i_6_) {
		try {
			if (iComponentDefinitions != null) {
				if (null != iComponentDefinitions.anObjectArray1304) {
					Class330_Sub42 class330_sub42 = new Class330_Sub42();
					class330_sub42.aClass114_7809 = iComponentDefinitions;
					class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1304;
					Class117.method1423(class330_sub42, -1631194987);
				}
				client.aBoolean9150 = true;
				Class368.anInt3869 = iComponentDefinitions.anInt1196 * -1400117103;
				client.anInt9151 = iComponentDefinitions.anInt1287 * -694229701;
				Class503.anInt5916 = i * -1023674243;
				OutgoingPacket.anInt2579 = 98153213 * i_5_;
				client.anInt9104 = 1288725205 * iComponentDefinitions.anInt1335;
				Class271.anInt2756 = -1543661463 * iComponentDefinitions.anInt1216;
				client.anInt9147 = iComponentDefinitions.anInt1217 * 353289541;
				Class404.method4738(iComponentDefinitions, 2005050657);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qn.ku(").append(')').toString());
		}
	}
}
