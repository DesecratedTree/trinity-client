/* Class202 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class202 implements Iterator {
	int anInt1933 = 0;
	int anInt1934;
	AbstractQueue_Sub1 anAbstractQueue_Sub1_1935;
	static int anInt1936;

	public boolean hasNext() {
		try {
			return (((Class202) this).anInt1933 * -535274707 < 899290169 * ((AbstractQueue_Sub1) (((Class202) this).anAbstractQueue_Sub1_1935)).anInt6449);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("im.hasNext(").append(')').toString());
		}
	}

	public void remove() {
		try {
			throw new UnsupportedOperationException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("im.remove(").append(')').toString());
		}
	}

	Class202(AbstractQueue_Sub1 abstractqueue_sub1) {
		((Class202) this).anInt1934 = -1049356529 * (((AbstractQueue_Sub1) ((Class202) this).anAbstractQueue_Sub1_1935).anInt6450);
		((Class202) this).anAbstractQueue_Sub1_1935 = abstractqueue_sub1;
	}

	public Object next() {
		try {
			if (1584729073 * (((AbstractQueue_Sub1) ((Class202) this).anAbstractQueue_Sub1_1935).anInt6450) != ((Class202) this).anInt1934 * -294867713)
				throw new ConcurrentModificationException();
			if (((Class202) this).anInt1933 * -535274707 < 899290169 * (((AbstractQueue_Sub1) ((Class202) this).anAbstractQueue_Sub1_1935).anInt6449)) {
				Object object = (((Class196) (((AbstractQueue_Sub1) ((Class202) this).anAbstractQueue_Sub1_1935).aClass196Array6448[-535274707 * ((Class202) this).anInt1933])).anObject1891);
				((Class202) this).anInt1933 += 1243065509;
				return object;
			}
			throw new NoSuchElementException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("im.next(").append(')').toString());
		}
	}

	static final void method2172(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class457.method5661(iComponentDefinitions, class120, class430, (short) -26820);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("im.dq(").append(')').toString());
		}
	}

	static boolean method2173(Interface2 interface2, int i) {
		try {
			Class473 class473 = (client.aClass304_9030.method3025((byte) 13).method5705(interface2.method34((short) -10103), (byte) -34));
			if (-573273839 * class473.anInt5652 == -1)
				return true;
			Class522 class522 = Class497.aClass552_5884.method6382(-573273839 * class473.anInt5652, 1416209437);
			if (-1 == -1331179567 * class522.anInt6019)
				return true;
			return class522.method6229(1913467043);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("im.f(").append(')').toString());
		}
	}

	static final void method2174(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = -106182925 * iComponentDefinitions.anInt1321;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("im.pf(").append(')').toString());
		}
	}
}
