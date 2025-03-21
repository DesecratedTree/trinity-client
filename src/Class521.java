/* Class521 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class521 implements Interface22 {
	int anInt6753;
	int anInt6754;
	int anInt6755;
	boolean aBoolean6756;
	int anInt6757;
	int anInt6758;
	int anInt6759;

	public boolean method287(Interface22 interface22) {
		try {
			if (!(interface22 instanceof Class521))
				return false;
			Class521 class521_0_ = (Class521) interface22;
			if (((Class521) this).anInt6754 * -1801599599 != -1801599599 * ((Class521) class521_0_).anInt6754)
				return false;
			if (377596171 * ((Class521) class521_0_).anInt6759 != 377596171 * ((Class521) this).anInt6759)
				return false;
			if (((Class521) this).anInt6755 * -1795225091 != ((Class521) class521_0_).anInt6755 * -1795225091)
				return false;
			if (-49408939 * ((Class521) this).anInt6757 != ((Class521) class521_0_).anInt6757 * -49408939)
				return false;
			if (((Class521) this).anInt6753 * 638354139 != ((Class521) class521_0_).anInt6753 * 638354139)
				return false;
			if (-1549979751 * ((Class521) class521_0_).anInt6758 != ((Class521) this).anInt6758 * -1549979751)
				return false;
			if (((Class521) class521_0_).aBoolean6756 != ((Class521) this).aBoolean6756)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vn.j(").append(')').toString());
		}
	}

	public long method288() {
		try {
			long[] ls = Buffer.aLongArray7850;
			long l = -1L;
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (-1801599599 * ((Class521) this).anInt6754)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) ((((Class521) this).anInt6759 * 377596171) >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (377596171 * ((Class521) this).anInt6759)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) ((-1795225091 * ((Class521) this).anInt6755) >> 24)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) ((-1795225091 * ((Class521) this).anInt6755) >> 16)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) ((-1795225091 * ((Class521) this).anInt6755) >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class521) this).anInt6755 * -1795225091)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (-49408939 * ((Class521) this).anInt6757)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) ((((Class521) this).anInt6753 * 638354139) >> 24)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (638354139 * (((Class521) this).anInt6753) >> 16)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (638354139 * (((Class521) this).anInt6753) >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (638354139 * ((Class521) this).anInt6753)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (-1549979751 * ((Class521) this).anInt6758)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class521) this).aBoolean6756 ? 1 : 0)) & 0xffL)];
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vn.r(").append(')').toString());
		}
	}

	Class521() {
		/* empty */
	}

	public long method286() {
		long[] ls = Buffer.aLongArray7850;
		long l = -1L;
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-1801599599 * ((Class521) this).anInt6754)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (((Class521) this).anInt6759 * 377596171 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (377596171 * ((Class521) this).anInt6759)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (-1795225091 * ((Class521) this).anInt6755 >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (-1795225091 * ((Class521) this).anInt6755 >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (-1795225091 * ((Class521) this).anInt6755 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class521) this).anInt6755 * -1795225091)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-49408939 * ((Class521) this).anInt6757)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (((Class521) this).anInt6753 * 638354139 >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (638354139 * ((Class521) this).anInt6753 >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (638354139 * ((Class521) this).anInt6753 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (638354139 * ((Class521) this).anInt6753)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-1549979751 * ((Class521) this).anInt6758)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class521) this).aBoolean6756 ? 1 : 0)) & 0xffL)];
		return l;
	}

	public boolean method289(Interface22 interface22) {
		if (!(interface22 instanceof Class521))
			return false;
		Class521 class521_1_ = (Class521) interface22;
		if (((Class521) this).anInt6754 * -1801599599 != -1801599599 * ((Class521) class521_1_).anInt6754)
			return false;
		if (377596171 * ((Class521) class521_1_).anInt6759 != 377596171 * ((Class521) this).anInt6759)
			return false;
		if (((Class521) this).anInt6755 * -1795225091 != ((Class521) class521_1_).anInt6755 * -1795225091)
			return false;
		if (-49408939 * ((Class521) this).anInt6757 != ((Class521) class521_1_).anInt6757 * -49408939)
			return false;
		if (((Class521) this).anInt6753 * 638354139 != ((Class521) class521_1_).anInt6753 * 638354139)
			return false;
		if (-1549979751 * ((Class521) class521_1_).anInt6758 != ((Class521) this).anInt6758 * -1549979751)
			return false;
		if (((Class521) class521_1_).aBoolean6756 != ((Class521) this).aBoolean6756)
			return false;
		return true;
	}

	public static final void method6224(int i) {
		try {
			if (!client.aBoolean9074) {
				client.aFloat9124 += (12.0F - client.aFloat9124) / 2.0F;
				client.aBoolean9038 = true;
				client.aBoolean9074 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vn.hf(").append(')').toString());
		}
	}

	static void method6225(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(18, (long) i_2_ << 32 | (long) i);
			class330_sub36_sub3.method3445((byte) 0);
			((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629 = i_3_ * 229745735;
			((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9626 = i_4_ * 1924827181;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vn.bg(").append(')').toString());
		}
	}
}
