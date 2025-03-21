/* Class396 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;

public class Class396 {
	public int anInt4106;
	public String aString4107;
	public static Class417 aClass417_4108;

	Class396() {
		/* empty */
	}

	static final void method4652(Class430 class430, byte i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, -1482024627);
			Class120 class120 = Class3.aClass120Array56[i_0_ >> 16];
			Class450.method5630(iComponentDefinitions, class120, class430, -1722324680);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qj.hl(").append(')').toString());
		}
	}

	static byte[] method4653(File file, int i, int i_1_) {
		try {
			byte[] is;
			try {
				byte[] is_2_ = new byte[i];
				Class355.method4124(file, is_2_, i, 528294285);
				is = is_2_;
			} catch (IOException ioexception) {
				return null;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qj.j(").append(')').toString());
		}
	}

	public static void method4654(Interface25 interface25, int i) {
		try {
			if (Class509.anIcmpService_Sub1_5947 == null)
				throw new IllegalStateException("");
			((IcmpService_Sub1) Class509.anIcmpService_Sub1_5947).aList8865.add(interface25);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qj.p(").append(')').toString());
		}
	}

	public static void method4655(int i, int i_3_) {
		try {
			if (Class527.method6269(-818108865)) {
				if (i != Class360.anInt3749 * -1208084343)
					Class360.aLong3750 = 717415731737899667L;
				Class360.anInt3749 = 203611577 * i;
				Class227.method2311(18, -1188873169);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qj.w(").append(')').toString());
		}
	}
}
