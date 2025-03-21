/* IcmpService_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jaclib.ping.IcmpService;

public class IcmpService_Sub1 extends IcmpService {
	List aList8865 = new ArrayList();

	protected void notify(int i) {
		try {
			Iterator iterator = ((IcmpService_Sub1) this).aList8865.iterator();
			while (iterator.hasNext()) {
				Interface25 interface25 = (Interface25) iterator.next();
				interface25.method292(i == 0, -169269576);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aet.notify(").append(')').toString());
		}
	}

	protected void notify(int i, int i_0_, int i_1_) {
		try {
			Iterator iterator = ((IcmpService_Sub1) this).aList8865.iterator();
			while (iterator.hasNext()) {
				Interface25 interface25 = (Interface25) iterator.next();
				interface25.method293(i, i_0_, i_1_, -1809396048);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aet.notify(").append(')').toString());
		}
	}

	protected void i(int i, int i_2_, int i_3_) {
		Iterator iterator = ((IcmpService_Sub1) this).aList8865.iterator();
		while (iterator.hasNext()) {
			Interface25 interface25 = (Interface25) iterator.next();
			interface25.method293(i, i_2_, i_3_, -1809396048);
		}
	}

	IcmpService_Sub1() {
		/* empty */
	}

	protected void r(int i) {
		Iterator iterator = ((IcmpService_Sub1) this).aList8865.iterator();
		while (iterator.hasNext()) {
			Interface25 interface25 = (Interface25) iterator.next();
			interface25.method292(i == 0, -169269576);
		}
	}

	protected void j(int i) {
		Iterator iterator = ((IcmpService_Sub1) this).aList8865.iterator();
		while (iterator.hasNext()) {
			Interface25 interface25 = (Interface25) iterator.next();
			interface25.method292(i == 0, -169269576);
		}
	}

	static final void method6478(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_4_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_5_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			if (i_5_ == -1)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = Class370.aClass268_6770.method2659(i_4_, 1385760669).method3475((char) i_5_, -635872567);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aet.ade(").append(')').toString());
		}
	}

	public static byte[] method6479(byte[] is, byte i) {
		try {
			if (is == null)
				return null;
			byte[] is_6_ = new byte[is.length];
			System.arraycopy(is, 0, is_6_, 0, is.length);
			return is_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aet.r(").append(')').toString());
		}
	}
}
