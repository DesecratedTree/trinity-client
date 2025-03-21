/* Class471 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Collection;
import java.util.Iterator;

public class Class471 implements Iterable, Collection {
	Class330 aClass330_5610;
	public Class330 aClass330_5611 = new Class330();
	public static int anInt5612;

	public Class471() {
		aClass330_5611.aClass330_3340 = aClass330_5611;
		aClass330_5611.aClass330_3342 = aClass330_5611;
	}

	public void method5866(int i) {
		try {
			while (aClass330_5611.aClass330_3340 != aClass330_5611)
				aClass330_5611.aClass330_3340.method3252(-2140518504);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.r(").append(')').toString());
		}
	}

	public Class330 method5867(short i) {
		try {
			Class330 class330 = aClass330_5611.aClass330_3340;
			if (aClass330_5611 == class330)
				return null;
			class330.method3252(-1917353511);
			return class330;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.o(").append(')').toString());
		}
	}

	public void method5868(Class471 class471_0_, int i) {
		try {
			if (aClass330_5611 != aClass330_5611.aClass330_3340)
				method5881(class471_0_, aClass330_5611.aClass330_3340, -2034260786);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.f(").append(')').toString());
		}
	}

	public Class330 method5869(int i) {
		try {
			return method5870(null, (byte) 114);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.z(").append(')').toString());
		}
	}

	Class330 method5870(Class330 class330, byte i) {
		try {
			Class330 class330_1_;
			if (class330 == null)
				class330_1_ = aClass330_5611.aClass330_3340;
			else
				class330_1_ = class330;
			if (class330_1_ == aClass330_5611) {
				((Class471) this).aClass330_5610 = null;
				return null;
			}
			((Class471) this).aClass330_5610 = class330_1_.aClass330_3340;
			return class330_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.w(").append(')').toString());
		}
	}

	public Class330 method5871(byte i) {
		try {
			return method5872(null, 719943586);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.n(").append(')').toString());
		}
	}

	Class330 method5872(Class330 class330, int i) {
		try {
			Class330 class330_2_;
			if (class330 == null)
				class330_2_ = aClass330_5611.aClass330_3342;
			else
				class330_2_ = class330;
			if (class330_2_ == aClass330_5611) {
				((Class471) this).aClass330_5610 = null;
				return null;
			}
			((Class471) this).aClass330_5610 = class330_2_.aClass330_3342;
			return class330_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.l(").append(')').toString());
		}
	}

	public Class330 method5873(byte i) {
		try {
			Class330 class330 = ((Class471) this).aClass330_5610;
			if (aClass330_5611 == class330) {
				((Class471) this).aClass330_5610 = null;
				return null;
			}
			((Class471) this).aClass330_5610 = class330.aClass330_3340;
			return class330;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.b(").append(')').toString());
		}
	}

	public Class330 method5874(int i) {
		try {
			Class330 class330 = ((Class471) this).aClass330_5610;
			if (class330 == aClass330_5611) {
				((Class471) this).aClass330_5610 = null;
				return null;
			}
			((Class471) this).aClass330_5610 = class330.aClass330_3342;
			return class330;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.k(").append(')').toString());
		}
	}

	public int method5875(int i) {
		try {
			int i_3_ = 0;
			for (Class330 class330 = aClass330_5611.aClass330_3340; class330 != aClass330_5611; class330 = class330.aClass330_3340)
				i_3_++;
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.q(").append(')').toString());
		}
	}

	public boolean method5876(int i) {
		try {
			return aClass330_5611.aClass330_3340 == aClass330_5611;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.u(").append(')').toString());
		}
	}

	Class330[] method5877(int i) {
		try {
			Class330[] class330s = new Class330[method5875(-71234698)];
			int i_4_ = 0;
			for (Class330 class330 = aClass330_5611.aClass330_3340; class330 != aClass330_5611; class330 = class330.aClass330_3340)
				class330s[i_4_++] = class330;
			return class330s;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.x(").append(')').toString());
		}
	}

	public Iterator iterator() {
		try {
			return new Class474(this);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.iterator(").append(')').toString());
		}
	}

	public int size() {
		try {
			return method5875(70865779);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.size(").append(')').toString());
		}
	}

	public boolean isEmpty() {
		try {
			return method5876(-1982313833);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.isEmpty(").append(')').toString());
		}
	}

	public void method5878(Class330 class330, short i) {
		try {
			if (null != class330.aClass330_3342)
				class330.method3252(-2003600256);
			class330.aClass330_3342 = aClass330_5611.aClass330_3342;
			class330.aClass330_3340 = aClass330_5611;
			class330.aClass330_3342.aClass330_3340 = class330;
			class330.aClass330_3340.aClass330_3342 = class330;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.j(").append(')').toString());
		}
	}

	public Object[] toArray(Object[] objects) {
		try {
			int i = 0;
			for (Class330 class330 = aClass330_5611.aClass330_3340; aClass330_5611 != class330; class330 = class330.aClass330_3340)
				objects[i++] = class330;
			return objects;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.toArray(").append(')').toString());
		}
	}

	boolean method5879(Class330 class330, int i) {
		try {
			method5878(class330, (short) 8192);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.g(").append(')').toString());
		}
	}

	public boolean remove(Object object) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.remove(").append(')').toString());
		}
	}

	public boolean containsAll(Collection collection) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.containsAll(").append(')').toString());
		}
	}

	public boolean removeAll(Collection collection) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.removeAll(").append(')').toString());
		}
	}

	public void clear() {
		try {
			method5866(613065745);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.clear(").append(')').toString());
		}
	}

	public boolean add(Object object) {
		try {
			return method5879((Class330) object, -1191937432);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.add(").append(')').toString());
		}
	}

	public boolean equals(Object object) {
		try {
			return super.equals(object);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.equals(").append(')').toString());
		}
	}

	public int hashCode() {
		try {
			return super.hashCode();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.hashCode(").append(')').toString());
		}
	}

	public boolean retainAll(Collection collection) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.retainAll(").append(')').toString());
		}
	}

	public Object[] toArray() {
		try {
			return method5877(394530557);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.toArray(").append(')').toString());
		}
	}

	public void method5880(Class330 class330, int i) {
		try {
			if (null != class330.aClass330_3342)
				class330.method3252(-2084037272);
			class330.aClass330_3342 = aClass330_5611;
			class330.aClass330_3340 = aClass330_5611.aClass330_3340;
			class330.aClass330_3342.aClass330_3340 = class330;
			class330.aClass330_3340.aClass330_3342 = class330;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.i(").append(')').toString());
		}
	}

	public boolean contains(Object object) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.contains(").append(')').toString());
		}
	}

	public boolean addAll(Collection collection) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.addAll(").append(')').toString());
		}
	}

	void method5881(Class471 class471_5_, Class330 class330, int i) {
		try {
			Class330 class330_6_ = aClass330_5611.aClass330_3342;
			aClass330_5611.aClass330_3342 = class330.aClass330_3342;
			class330.aClass330_3342.aClass330_3340 = aClass330_5611;
			if (aClass330_5611 != class330) {
				class330.aClass330_3342 = class471_5_.aClass330_5611.aClass330_3342;
				class330.aClass330_3342.aClass330_3340 = class330;
				class330_6_.aClass330_3340 = class471_5_.aClass330_5611;
				class471_5_.aClass330_5611.aClass330_3342 = class330_6_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.s(").append(')').toString());
		}
	}

	static final void method5882(Class430 class430, byte i) {
		try {
			int i_7_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_7_, 1276123904);
			Class120 class120 = Class3.aClass120Array56[i_7_ >> 16];
			Class101.method1216(iComponentDefinitions, class120, class430, 705611080);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tn.ia(").append(')').toString());
		}
	}
}
