/* Class193 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class193 {
	long aLong1881;
	int anInt1882;

	Class193(Class191[] class191s) {
		for (int i = 0; i < class191s.length; i++)
			method2133(class191s[i]);
	}

	final void method2133(Class191 class191) {
		((Class193) this).aLong1881 |= (long) (((Class191) class191).anInt1875 << Class191.anInt1874 * ((Class193) this).anInt1882++);
	}

	public final Class191 method2134(int i) {
		return Class191.method2098(method2135(i));
	}

	final int method2135(int i) {
		return ((int) (((Class193) this).aLong1881 >> Class191.anInt1874 * i) & 0xf);
	}

	public final int method2136() {
		return ((Class193) this).anInt1882;
	}

	Class193(Class191 class191) {
		((Class193) this).aLong1881 = (long) ((Class191) class191).anInt1875;
		((Class193) this).anInt1882 = 1;
	}
}
