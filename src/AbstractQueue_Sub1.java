/* AbstractQueue_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AbstractQueue_Sub1 extends AbstractQueue {
	Comparator aComparator6446;
	Map aMap6447;
	Class196[] aClass196Array6448;
	int anInt6449;
	int anInt6450 = 0;

	AbstractQueue_Sub1(int i, Comparator comparator) {
		((AbstractQueue_Sub1) this).aClass196Array6448 = new Class196[i];
		((AbstractQueue_Sub1) this).aMap6447 = new HashMap();
		((AbstractQueue_Sub1) this).aComparator6446 = comparator;
	}

	void method6483(int i) {
		try {
			int i_0_ = ((((AbstractQueue_Sub1) this).aClass196Array6448.length << 1) + 1);
			((AbstractQueue_Sub1) this).aClass196Array6448 = (Class196[]) Arrays.copyOf((((AbstractQueue_Sub1) this).aClass196Array6448), i_0_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akf.r(").append(')').toString());
		}
	}

	public AbstractQueue_Sub1(int i) {
		this(i, null);
	}

	public boolean offer(Object object) {
		try {
			if (((AbstractQueue_Sub1) this).aMap6447.containsKey(object))
				throw new IllegalArgumentException("");
			((AbstractQueue_Sub1) this).anInt6450 += -1184463599;
			int i = 899290169 * ((AbstractQueue_Sub1) this).anInt6449;
			if (i >= ((AbstractQueue_Sub1) this).aClass196Array6448.length)
				method6483(1197059748);
			((AbstractQueue_Sub1) this).anInt6449 += 918788617;
			if (0 == i) {
				((AbstractQueue_Sub1) this).aClass196Array6448[0] = new Class196(object, 0);
				((AbstractQueue_Sub1) this).aMap6447.put(object, (((AbstractQueue_Sub1) this).aClass196Array6448[0]));
			} else {
				((AbstractQueue_Sub1) this).aClass196Array6448[i] = new Class196(object, i);
				((AbstractQueue_Sub1) this).aMap6447.put(object, (((AbstractQueue_Sub1) this).aClass196Array6448[i]));
				method6484(i, (byte) 80);
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akf.offer(").append(')').toString());
		}
	}

	void method6484(int i, byte i_1_) {
		try {
			Class196 class196 = ((AbstractQueue_Sub1) this).aClass196Array6448[i];
			int i_2_;
			for (/**/; i > 0; i = i_2_) {
				i_2_ = i - 1 >>> 1;
				Class196 class196_3_ = ((AbstractQueue_Sub1) this).aClass196Array6448[i_2_];
				if (null != ((AbstractQueue_Sub1) this).aComparator6446) {
					if ((((AbstractQueue_Sub1) this).aComparator6446.compare(((Class196) class196).anObject1891, ((Class196) class196_3_).anObject1891)) >= 0) {
						if (i_1_ <= 2) {
							/* empty */
						}
						break;
					}
				} else if ((((Comparable) ((Class196) class196).anObject1891).compareTo(((Class196) class196_3_).anObject1891)) >= 0) {
					if (i_1_ > 2)
						break;
					return;
				}
				((AbstractQueue_Sub1) this).aClass196Array6448[i] = class196_3_;
				((Class196) ((AbstractQueue_Sub1) this).aClass196Array6448[i]).anInt1890 = 1540934421 * i;
			}
			((AbstractQueue_Sub1) this).aClass196Array6448[i] = class196;
			((Class196) ((AbstractQueue_Sub1) this).aClass196Array6448[i]).anInt1890 = 1540934421 * i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akf.j(").append(')').toString());
		}
	}

	public Object poll() {
		try {
			if (899290169 * ((AbstractQueue_Sub1) this).anInt6449 == 0)
				return null;
			((AbstractQueue_Sub1) this).anInt6450 += -1184463599;
			Object object = (((Class196) (((AbstractQueue_Sub1) this).aClass196Array6448[0])).anObject1891);
			((AbstractQueue_Sub1) this).aMap6447.remove(object);
			((AbstractQueue_Sub1) this).anInt6449 -= 918788617;
			if (899290169 * ((AbstractQueue_Sub1) this).anInt6449 == 0)
				((AbstractQueue_Sub1) this).aClass196Array6448[((AbstractQueue_Sub1) this).anInt6449 * 899290169] = null;
			else {
				((AbstractQueue_Sub1) this).aClass196Array6448[0] = (((AbstractQueue_Sub1) this).aClass196Array6448[((AbstractQueue_Sub1) this).anInt6449 * 899290169]);
				((Class196) ((AbstractQueue_Sub1) this).aClass196Array6448[0]).anInt1890 = 0;
				((AbstractQueue_Sub1) this).aClass196Array6448[((AbstractQueue_Sub1) this).anInt6449 * 899290169] = null;
				method6485(0, (byte) 113);
			}
			return object;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akf.poll(").append(')').toString());
		}
	}

	public boolean remove(Object object) {
		try {
			Class196 class196 = ((Class196) ((AbstractQueue_Sub1) this).aMap6447.remove(object));
			if (class196 == null)
				return false;
			((AbstractQueue_Sub1) this).anInt6450 += -1184463599;
			((AbstractQueue_Sub1) this).anInt6449 -= 918788617;
			if (((Class196) class196).anInt1890 * 1286614077 == ((AbstractQueue_Sub1) this).anInt6449 * 899290169) {
				((AbstractQueue_Sub1) this).aClass196Array6448[899290169 * ((AbstractQueue_Sub1) this).anInt6449] = null;
				return true;
			}
			Class196 class196_4_ = (((AbstractQueue_Sub1) this).aClass196Array6448[899290169 * ((AbstractQueue_Sub1) this).anInt6449]);
			((AbstractQueue_Sub1) this).aClass196Array6448[((AbstractQueue_Sub1) this).anInt6449 * 899290169] = null;
			((AbstractQueue_Sub1) this).aClass196Array6448[1286614077 * ((Class196) class196).anInt1890] = class196_4_;
			((Class196) (((AbstractQueue_Sub1) this).aClass196Array6448[1286614077 * ((Class196) class196).anInt1890])).anInt1890 = ((Class196) class196).anInt1890 * 1;
			method6485(1286614077 * ((Class196) class196).anInt1890, (byte) 85);
			if (class196_4_ == (((AbstractQueue_Sub1) this).aClass196Array6448[1286614077 * ((Class196) class196).anInt1890]))
				method6484(((Class196) class196).anInt1890 * 1286614077, (byte) 29);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akf.remove(").append(')').toString());
		}
	}

	void method6485(int i, byte i_5_) {
		try {
			Class196 class196 = ((AbstractQueue_Sub1) this).aClass196Array6448[i];
			int i_6_;
			for (int i_7_ = ((AbstractQueue_Sub1) this).anInt6449 * 899290169 >>> 1; i < i_7_; i = i_6_) {
				int i_8_ = 1 + (i << 1);
				Class196 class196_9_ = ((AbstractQueue_Sub1) this).aClass196Array6448[i_8_];
				int i_10_ = 2 + (i << 1);
				Class196 class196_11_ = ((AbstractQueue_Sub1) this).aClass196Array6448[i_10_];
				if (null != ((AbstractQueue_Sub1) this).aComparator6446) {
					if ((i_10_ < 899290169 * ((AbstractQueue_Sub1) this).anInt6449) && (((AbstractQueue_Sub1) this).aComparator6446.compare(((Class196) class196_9_).anObject1891, ((Class196) class196_11_).anObject1891)) > 0)
						i_6_ = i_10_;
					else
						i_6_ = i_8_;
				} else if (i_10_ < (899290169 * ((AbstractQueue_Sub1) this).anInt6449) && (((Comparable) ((Class196) class196_9_).anObject1891).compareTo(((Class196) class196_11_).anObject1891)) > 0)
					i_6_ = i_10_;
				else
					i_6_ = i_8_;
				if (null != ((AbstractQueue_Sub1) this).aComparator6446) {
					if ((((AbstractQueue_Sub1) this).aComparator6446.compare(((Class196) class196).anObject1891, (((Class196) (((AbstractQueue_Sub1) this).aClass196Array6448[i_6_])).anObject1891))) <= 0) {
						if (i_5_ <= 8)
							throw new IllegalStateException();
						break;
					}
				} else if ((((Comparable) ((Class196) class196).anObject1891).compareTo(((Class196) (((AbstractQueue_Sub1) this).aClass196Array6448[i_6_])).anObject1891)) <= 0) {
					if (i_5_ <= 8) {
						/* empty */
					}
					break;
				}
				((AbstractQueue_Sub1) this).aClass196Array6448[i] = ((AbstractQueue_Sub1) this).aClass196Array6448[i_6_];
				((Class196) ((AbstractQueue_Sub1) this).aClass196Array6448[i]).anInt1890 = i * 1540934421;
			}
			((AbstractQueue_Sub1) this).aClass196Array6448[i] = class196;
			((Class196) ((AbstractQueue_Sub1) this).aClass196Array6448[i]).anInt1890 = 1540934421 * i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akf.i(").append(')').toString());
		}
	}

	public boolean contains(Object object) {
		try {
			return ((AbstractQueue_Sub1) this).aMap6447.containsKey(object);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akf.contains(").append(')').toString());
		}
	}

	public Iterator iterator() {
		try {
			return new Class202(this);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akf.iterator(").append(')').toString());
		}
	}

	public Object[] toArray() {
		try {
			Object[] objects = super.toArray();
			if (((AbstractQueue_Sub1) this).aComparator6446 != null)
				Arrays.sort(objects, ((AbstractQueue_Sub1) this).aComparator6446);
			else
				Arrays.sort(objects);
			return objects;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akf.toArray(").append(')').toString());
		}
	}

	public int size() {
		try {
			return ((AbstractQueue_Sub1) this).anInt6449 * 899290169;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akf.size(").append(')').toString());
		}
	}

	public Object peek() {
		try {
			if (((AbstractQueue_Sub1) this).anInt6449 * 899290169 == 0)
				return null;
			return (((Class196) ((AbstractQueue_Sub1) this).aClass196Array6448[0]).anObject1891);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akf.peek(").append(')').toString());
		}
	}

	static final int method6486(int i, int i_12_, byte i_13_) {
		try {
			int i_14_ = i + i_12_ * 57;
			i_14_ = i_14_ << 13 ^ i_14_;
			int i_15_ = (1376312589 + (789221 + 15731 * (i_14_ * i_14_)) * i_14_ & 0x7fffffff);
			return i_15_ >> 19 & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akf.v(").append(')').toString());
		}
	}
}
