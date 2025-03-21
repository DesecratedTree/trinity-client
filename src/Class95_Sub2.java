/* Class95_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;

public class Class95_Sub2 extends Class95 {
	int anInt7118;
	int anInt7119;
	int anInt7120;

	Class95_Sub2(Buffer class330_sub46) {
		super(class330_sub46);
		((Class95_Sub2) this).anInt7120 = class330_sub46.readUnsignedShort(903863929) * 905120373;
		((Class95_Sub2) this).anInt7119 = class330_sub46.readUnsignedShort(1244011079) * -1970416541;
		((Class95_Sub2) this).anInt7118 = class330_sub46.readUnsignedByte(566553593) * 1179516099;
	}

	public void method1098() {
		Class85 class85 = (Class96.aClass85Array854[((Class95_Sub2) this).anInt7120 * 834074077]);
		Class89 class89 = (Class96.aClass89Array862[-1132769973 * ((Class95_Sub2) this).anInt7119]);
		class89.method1056(class85, -1739090965 * ((Class95_Sub2) this).anInt7118, 1985092595);
	}

	public void method1100() {
		Class85 class85 = (Class96.aClass85Array854[((Class95_Sub2) this).anInt7120 * 834074077]);
		Class89 class89 = (Class96.aClass89Array862[-1132769973 * ((Class95_Sub2) this).anInt7119]);
		class89.method1056(class85, -1739090965 * ((Class95_Sub2) this).anInt7118, 322516079);
	}

	public void method1095(int i) {
		try {
			Class85 class85 = (Class96.aClass85Array854[((Class95_Sub2) this).anInt7120 * 834074077]);
			Class89 class89 = (Class96.aClass89Array862[-1132769973 * ((Class95_Sub2) this).anInt7119]);
			class89.method1056(class85, -1739090965 * ((Class95_Sub2) this).anInt7118, 979792392);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aaf.j(").append(')').toString());
		}
	}

	public void method1099() {
		Class85 class85 = (Class96.aClass85Array854[((Class95_Sub2) this).anInt7120 * 834074077]);
		Class89 class89 = (Class96.aClass89Array862[-1132769973 * ((Class95_Sub2) this).anInt7119]);
		class89.method1056(class85, -1739090965 * ((Class95_Sub2) this).anInt7118, 1706964216);
	}

	static String method1109(long l, int i, boolean bool, int i_0_) {
		try {
			Calendar calendar;
			if (bool) {
				Class22.method475(l);
				calendar = Class528.aCalendar6217;
			} else {
				Class452.method5637(l);
				calendar = Class528.aCalendar6215;
			}
			int i_1_ = calendar.get(5);
			int i_2_ = calendar.get(2) + 1;
			int i_3_ = calendar.get(1);
			int i_4_ = calendar.get(11);
			int i_5_ = calendar.get(12);
			return new StringBuilder().append(Integer.toString(i_1_ / 10)).append(i_1_ % 10).append("/").append(i_2_ / 10).append(i_2_ % 10).append("/").append(i_3_ % 100 / 10).append(i_3_ % 10).append(" ").append(i_4_ / 10).append(i_4_ % 10).append(":").append(i_5_ / 10).append(i_5_ % 10).toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aaf.i(").append(')').toString());
		}
	}

	static Class352 method1110(Class432_Sub1_Sub1 class432_sub1_sub1, int i) {
		try {
			Class352 class352;
			if (null == Class352.aClass352_3485)
				class352 = new Class352();
			else {
				class352 = Class352.aClass352_3485;
				Class352.aClass352_3485 = Class352.aClass352_3485.aClass352_3483;
				class352.aClass352_3483 = null;
				Class352.anInt3482 -= 284951371;
			}
			class352.aClass432_Sub1_Sub1_3484 = class432_sub1_sub1;
			return class352;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aaf.r(").append(')').toString());
		}
	}
}
