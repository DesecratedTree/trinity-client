/* Class506 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Class506 {
	public char aChar5921;
	Object[] anObjectArray5922;
	String aString5923 = "null";
	int anInt5924;
	Map aMap5925;
	public char aChar5926;
	int anInt5927 = 0;
	HashMap aHashMap5928;

	Class506() {
		/* empty */
	}

	void method6142(Buffer class330_sub46, int i, int i_0_) {
		try {
			if (1 == i)
				aChar5926 = Class127.method1546(class330_sub46.readByte((byte) 52), -1876839012);
			else if (2 == i)
				aChar5921 = Class127.method1546(class330_sub46.readByte((byte) 73), -2044637400);
			else if (i == 3)
				((Class506) this).aString5923 = class330_sub46.readString(-967113629);
			else if (i == 4)
				((Class506) this).anInt5924 = class330_sub46.readInt((byte) 52) * 1476798777;
			else if (5 == i || i == 6) {
				((Class506) this).anInt5927 = class330_sub46.readUnsignedShort(1911403885) * 1604800501;
				((Class506) this).aMap5925 = new HashMap(-2002541475 * ((Class506) this).anInt5927);
				for (int i_1_ = 0; i_1_ < -2002541475 * ((Class506) this).anInt5927; i_1_++) {
					int i_2_ = class330_sub46.readInt((byte) 59);
					java.io.Serializable serializable;
					if (5 == i)
						serializable = class330_sub46.readString(-62627479);
					else
						serializable = new Integer(class330_sub46.readInt((byte) 49));
					((Class506) this).aMap5925.put(new Integer(i_2_), serializable);
				}
			} else if (7 == i || i == 8) {
				int i_3_ = class330_sub46.readUnsignedShort(1026066243);
				((Class506) this).anInt5927 = class330_sub46.readUnsignedShort(2048176061) * 1604800501;
				((Class506) this).anObjectArray5922 = new Object[i_3_];
				for (int i_4_ = 0; i_4_ < -2002541475 * ((Class506) this).anInt5927; i_4_++) {
					int i_5_ = class330_sub46.readUnsignedShort(1967644521);
					if (i == 7)
						((Class506) this).anObjectArray5922[i_5_] = class330_sub46.readString(-462775013);
					else
						((Class506) this).anObjectArray5922[i_5_] = new Integer(class330_sub46.readInt((byte) 93));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ux.j(").append(')').toString());
		}
	}

	public int method6143(int i, int i_6_) {
		try {
			Object object = method6145(i, (byte) -15);
			if (object == null)
				return 1845359881 * ((Class506) this).anInt5924;
			return ((Integer) object).intValue();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ux.i(").append(')').toString());
		}
	}

	public String method6144(int i, byte i_7_) {
		try {
			Object object = method6145(i, (byte) -115);
			if (null == object)
				return ((Class506) this).aString5923;
			return (String) object;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ux.p(").append(')').toString());
		}
	}

	Object method6145(int i, byte i_8_) {
		try {
			if (null != ((Class506) this).anObjectArray5922) {
				if (i < 0 || i >= ((Class506) this).anObjectArray5922.length)
					return null;
				return ((Class506) this).anObjectArray5922[i];
			}
			if (((Class506) this).aMap5925 != null)
				return ((Class506) this).aMap5925.get(new Integer(i));
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ux.o(").append(')').toString());
		}
	}

	public boolean method6146(Object object, byte i) {
		try {
			if (-2002541475 * ((Class506) this).anInt5927 == 0)
				return false;
			if (null == ((Class506) this).aHashMap5928)
				method6149(16711680);
			return ((Class506) this).aHashMap5928.containsKey(object);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ux.s(").append(')').toString());
		}
	}

	public int[] method6147(Object object, int i) {
		try {
			if (0 == -2002541475 * ((Class506) this).anInt5927)
				return null;
			if (((Class506) this).aHashMap5928 == null)
				method6149(16711680);
			return (int[]) ((Class506) this).aHashMap5928.get(object);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ux.f(").append(')').toString());
		}
	}

	public int method6148(int i) {
		try {
			return ((Class506) this).anInt5927 * -2002541475;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ux.z(").append(')').toString());
		}
	}

	void method6149(int i) {
		try {
			HashMap hashmap = new HashMap();
			if (null != ((Class506) this).anObjectArray5922) {
				for (int i_9_ = 0; i_9_ < ((Class506) this).anObjectArray5922.length; i_9_++) {
					if (((Class506) this).anObjectArray5922[i_9_] == null) {
						if (i != 16711680)
							return;
					} else {
						Object object = ((Class506) this).anObjectArray5922[i_9_];
						List list = (List) hashmap.get(object);
						if (null == list) {
							list = new LinkedList();
							hashmap.put(object, list);
						}
						list.add(new Integer(i_9_));
					}
				}
			} else if (null != ((Class506) this).aMap5925) {
				Iterator iterator = ((Class506) this).aMap5925.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry entry = (Map.Entry) iterator.next();
					Object object = entry.getValue();
					List list = (List) hashmap.get(object);
					if (list == null) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(entry.getKey());
				}
			} else
				throw new IllegalStateException();
			((Class506) this).aHashMap5928 = new HashMap();
			Iterator iterator = hashmap.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				List list = (List) entry.getValue();
				int[] is = new int[list.size()];
				int i_10_ = 0;
				Iterator iterator_11_ = list.iterator();
				while (iterator_11_.hasNext()) {
					Integer integer = (Integer) iterator_11_.next();
					is[i_10_++] = integer.intValue();
				}
				if (((Class506) this).anObjectArray5922 == null)
					Arrays.sort(is);
				((Class506) this).aHashMap5928.put(entry.getKey(), is);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ux.w(").append(')').toString());
		}
	}

	void method6150(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_12_ = class330_sub46.readUnsignedByte(1699817699);
				if (0 == i_12_) {
					if (i != 1505010051) {
						/* empty */
					}
					break;
				}
				method6142(class330_sub46, i_12_, -1278885461);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ux.r(").append(')').toString());
		}
	}

	public static final void method6151(byte i) {
		try {
			if (!client.aBoolean9075) {
				client.aFloat9072 += (24.0F - client.aFloat9072) / 2.0F;
				client.aBoolean9038 = true;
				client.aBoolean9075 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ux.hc(").append(')').toString());
		}
	}
}
