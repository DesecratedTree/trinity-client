/* Class330_Sub26_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub26_Sub3 extends Class330_Sub26 {
	String aString9577;
	byte aByte9578;
	byte aByte9579;
	Class167 aClass167_9580;

	void method3391(Class330_Sub39 class330_sub39) {
		class330_sub39.aString7757 = ((Class330_Sub26_Sub3) this).aString9577;
		if (null != ((Class330_Sub26_Sub3) this).aString9577) {
			class330_sub39.aByte7764 = ((Class330_Sub26_Sub3) this).aByte9578;
			class330_sub39.aByte7765 = ((Class330_Sub26_Sub3) this).aByte9579;
		}
	}

	void method3388(Buffer class330_sub46, int i) {
		try {
			((Class330_Sub26_Sub3) this).aString9577 = class330_sub46.method3761(1797122681);
			if (((Class330_Sub26_Sub3) this).aString9577 != null) {
				class330_sub46.readUnsignedByte(1453451408);
				((Class330_Sub26_Sub3) this).aByte9578 = class330_sub46.readByte((byte) -2);
				((Class330_Sub26_Sub3) this).aByte9579 = class330_sub46.readByte((byte) -23);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aio.r(").append(')').toString());
		}
	}

	void method3389(Class330_Sub39 class330_sub39, int i) {
		try {
			class330_sub39.aString7757 = ((Class330_Sub26_Sub3) this).aString9577;
			if (null != ((Class330_Sub26_Sub3) this).aString9577) {
				class330_sub39.aByte7764 = ((Class330_Sub26_Sub3) this).aByte9578;
				class330_sub39.aByte7765 = ((Class330_Sub26_Sub3) this).aByte9579;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aio.j(").append(')').toString());
		}
	}

	void method3390(Buffer class330_sub46) {
		((Class330_Sub26_Sub3) this).aString9577 = class330_sub46.method3761(1962340130);
		if (((Class330_Sub26_Sub3) this).aString9577 != null) {
			class330_sub46.readUnsignedByte(-35595207);
			((Class330_Sub26_Sub3) this).aByte9578 = class330_sub46.readByte((byte) 61);
			((Class330_Sub26_Sub3) this).aByte9579 = class330_sub46.readByte((byte) 0);
		}
	}

	void method3387(Class330_Sub39 class330_sub39) {
		class330_sub39.aString7757 = ((Class330_Sub26_Sub3) this).aString9577;
		if (null != ((Class330_Sub26_Sub3) this).aString9577) {
			class330_sub39.aByte7764 = ((Class330_Sub26_Sub3) this).aByte9578;
			class330_sub39.aByte7765 = ((Class330_Sub26_Sub3) this).aByte9579;
		}
	}

	Class330_Sub26_Sub3(Class167 class167) {
		/* empty */
	}

	void method3392(Class330_Sub39 class330_sub39) {
		class330_sub39.aString7757 = ((Class330_Sub26_Sub3) this).aString9577;
		if (null != ((Class330_Sub26_Sub3) this).aString9577) {
			class330_sub39.aByte7764 = ((Class330_Sub26_Sub3) this).aByte9578;
			class330_sub39.aByte7765 = ((Class330_Sub26_Sub3) this).aByte9579;
		}
	}

	public static void method3396(int i, byte i_0_) {
		try {
			if (Class527.method6269(1974121162)) {
				if (-1208084343 * Class360.anInt3749 != i)
					Class360.aLong3750 = 717415731737899667L;
				Class360.anInt3749 = 203611577 * i;
				client.aClass1_9060.method379(1175619289);
				Class227.method2311(3, -1188873169);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aio.l(").append(')').toString());
		}
	}
}
