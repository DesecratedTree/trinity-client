/* Class95_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class95_Sub20 extends Class95 {
	int anInt7199;
	long aLong7200;

	public void method1098() {
		Class330_Sub23 class330_sub23 = ((Class330_Sub23) Class96.aClass497_857.method6094(823773023202905717L * (((Class95_Sub20) this).aLong7200)));
		if (class330_sub23 != null)
			class330_sub23.anInt7693 = -703664395 * ((Class95_Sub20) this).anInt7199;
		else
			Class96.aClass497_857.method6097(new Class330_Sub23(((Class95_Sub20) this).anInt7199 * 1735903595), 823773023202905717L * ((Class95_Sub20) this).aLong7200);
	}

	public void method1095(int i) {
		try {
			Class330_Sub23 class330_sub23 = ((Class330_Sub23) Class96.aClass497_857.method6094(823773023202905717L * (((Class95_Sub20) this).aLong7200)));
			if (class330_sub23 != null)
				class330_sub23.anInt7693 = -703664395 * ((Class95_Sub20) this).anInt7199;
			else
				Class96.aClass497_857.method6097(new Class330_Sub23(((Class95_Sub20) this).anInt7199 * 1735903595), 823773023202905717L * ((Class95_Sub20) this).aLong7200);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zu.j(").append(')').toString());
		}
	}

	Class95_Sub20(Buffer class330_sub46, boolean bool) {
		super(class330_sub46);
		int i = class330_sub46.readUnsignedShort(-390518403);
		if (bool)
			((Class95_Sub20) this).aLong7200 = (0x100000000L | (long) i) * -3275904854131224099L;
		else
			((Class95_Sub20) this).aLong7200 = -3275904854131224099L * (long) i;
		((Class95_Sub20) this).anInt7199 = class330_sub46.readInt((byte) 68) * 775428931;
	}

	public void method1100() {
		Class330_Sub23 class330_sub23 = ((Class330_Sub23) Class96.aClass497_857.method6094(823773023202905717L * (((Class95_Sub20) this).aLong7200)));
		if (class330_sub23 != null)
			class330_sub23.anInt7693 = -703664395 * ((Class95_Sub20) this).anInt7199;
		else
			Class96.aClass497_857.method6097(new Class330_Sub23(((Class95_Sub20) this).anInt7199 * 1735903595), 823773023202905717L * ((Class95_Sub20) this).aLong7200);
	}

	public void method1099() {
		Class330_Sub23 class330_sub23 = ((Class330_Sub23) Class96.aClass497_857.method6094(823773023202905717L * (((Class95_Sub20) this).aLong7200)));
		if (class330_sub23 != null)
			class330_sub23.anInt7693 = -703664395 * ((Class95_Sub20) this).anInt7199;
		else
			Class96.aClass497_857.method6097(new Class330_Sub23(((Class95_Sub20) this).anInt7199 * 1735903595), 823773023202905717L * ((Class95_Sub20) this).aLong7200);
	}
}
