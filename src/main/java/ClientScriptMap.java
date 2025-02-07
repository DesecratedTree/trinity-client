

import java.applet.Applet;
import java.io.Serializable;
import java.util.*;

public class ClientScriptMap {
	public int id;
	int anInt6036;
	public char aChar6037;
	int anInt6038;
	@SuppressWarnings("rawtypes")
	HashMap aHashMap6039;
	java.util.Map<Integer, Serializable> aMap6040;
	Object[] anObjectArray6041;
	public char aChar6042;
	String aString6043 = "null";
	public static Applet anApplet6044;

	public String method6122(int i, byte i_0_) {
		try {
			Object object = method6126(i, (short) 5996);
			if (object == null)
				return ((ClientScriptMap) this).aString6043;
			return (String) object;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tx.p(").append(')').toString());
		}
	}

	void method6123(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_1_ = class298_sub53.readUnsignedByte();
				if (0 == i_1_) {
					if (i >= 1635270652) {
						/* empty */
					}
					break;
				}
				method6124(class298_sub53, i_1_, 950174382);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tx.a(").append(')').toString());
		}
	}

	void method6124(RsByteBuffer class298_sub53, int i, int i_2_) {
		try {
			if (1 == i)
				aChar6042 = Class493.method6190(class298_sub53.readByte(), 2015897871);
			else if (i == 2)
				aChar6037 = Class493.method6190(class298_sub53.readByte(), 1877656812);
			else if (3 == i)
				((ClientScriptMap) this).aString6043 = class298_sub53.readString(1756453424);
			else if (4 == i)
				((ClientScriptMap) this).anInt6038 = class298_sub53.readInt((byte) 94) * -1961153765;
			else if (i == 5 || i == 6) {
				((ClientScriptMap) this).anInt6036 = class298_sub53.readUnsignedShort() * -1158380671;
				((ClientScriptMap) this).aMap6040 = new HashMap<Integer, Serializable>(-1179140991 * ((ClientScriptMap) this).anInt6036);
				for (int i_3_ = 0; i_3_ < ((ClientScriptMap) this).anInt6036 * -1179140991; i_3_++) {
					int i_4_ = class298_sub53.readInt((byte) -59);
					java.io.Serializable serializable;
					if (i == 5)
						serializable = class298_sub53.readString(-968722088);
					else
						serializable = new Integer(class298_sub53.readInt((byte) -67));
					((ClientScriptMap) this).aMap6040.put(new Integer(i_4_), serializable);
				}
			} else if (7 == i || 8 == i) {
				int i_5_ = class298_sub53.readUnsignedShort();
				((ClientScriptMap) this).anInt6036 = class298_sub53.readUnsignedShort() * -1158380671;
				((ClientScriptMap) this).anObjectArray6041 = new Object[i_5_];
				for (int i_6_ = 0; i_6_ < -1179140991 * ((ClientScriptMap) this).anInt6036; i_6_++) {
					int i_7_ = class298_sub53.readUnsignedShort();
					if (i == 7)
						((ClientScriptMap) this).anObjectArray6041[i_7_] = class298_sub53.readString(1730348772);
					else
						((ClientScriptMap) this).anObjectArray6041[i_7_] = new Integer(class298_sub53.readInt((byte) -14));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tx.f(").append(')').toString());
		}
	}

	public int method6125(int i, int i_8_) {
		try {
			Object object = method6126(i, (short) 31709);
			if (null == object)
				return ((ClientScriptMap) this).anInt6038 * -1363462381;
			return ((Integer) object).intValue();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tx.b(").append(')').toString());
		}
	}

	Object method6126(int i, short i_9_) {
		try {
			if (((ClientScriptMap) this).anObjectArray6041 != null) {
				if (i < 0 || i >= ((ClientScriptMap) this).anObjectArray6041.length)
					return null;
				return ((ClientScriptMap) this).anObjectArray6041[i];
			}
			if (null != ((ClientScriptMap) this).aMap6040)
				return ((ClientScriptMap) this).aMap6040.get(new Integer(i));
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tx.i(").append(')').toString());
		}
	}

	public boolean method6127(Object object, byte i) {
		try {
			if (((ClientScriptMap) this).anInt6036 * -1179140991 == 0)
				return false;
			if (((ClientScriptMap) this).aHashMap6039 == null)
				method6130(671224629);
			return ((ClientScriptMap) this).aHashMap6039.containsKey(object);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tx.k(").append(')').toString());
		}
	}

	public int[] method6128(Object object, short i) {
		try {
			if (0 == ((ClientScriptMap) this).anInt6036 * -1179140991)
				return null;
			if (((ClientScriptMap) this).aHashMap6039 == null)
				method6130(817562642);
			return (int[]) ((ClientScriptMap) this).aHashMap6039.get(object);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tx.d(").append(')').toString());
		}
	}

	public int method6129(byte i) {
		try {
			return ((ClientScriptMap) this).anInt6036 * -1179140991;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tx.u(").append(')').toString());
		}
	}

	ClientScriptMap() {
		((ClientScriptMap) this).anInt6036 = 0;
	}
	

	public static void modify(ClientScriptMap config, int id) {
		if (id == 200)  {
			config.aMap6040.put(13157, 2444); //vyre corspe. changed sprite;
			config.aMap6040.put(25434, 2445); //vyre corspe. changed sprite;
			config.aMap6040.put(43307, 322); //blood coins. changed sprite;
			config.aMap6040.put(25447, 2877); //aura tokens. changed sprite;
			config.aMap6040.put(25459, 2877); //vote tokens. changed sprite;
			config.aMap6040.put(25458, 63); //barrow tokens. changed sprite;
			config.aMap6040.put(52820, 43);
			config.aMap6040.put(4149, 216); //slayer shop
			config.aMap6040.put(1961, 1355); //easter shop
			//2983_0_0 shard
			config.aMap6040.put(25472, 3074); 
		} else if (id == 2535){
			config.anObjectArray6041[4] = "Myth's  Guild";
		} else if (id == 1446){
			config.anObjectArray6041 = Arrays.copyOf(config.anObjectArray6041, 31);
		} else if (id == 2279){ //normal prayer book
			config.anObjectArray6041[9] = 668;
			config.anObjectArray6041[10] = 680;
			config.anObjectArray6041[11] = 681;
			config.anObjectArray6041[12] = 669;
			config.anObjectArray6041[13] = 670;
			config.anObjectArray6041[14] = 671;
			config.anObjectArray6041[15] = 684;
			config.anObjectArray6041[16] = 672;
			config.anObjectArray6041[17] = 673;
			config.anObjectArray6041[18] = 674;
			config.anObjectArray6041[19] = 682;
			config.anObjectArray6041[20] = 683;
			config.anObjectArray6041[21] = 675;
			config.anObjectArray6041[22] = 676;
			config.anObjectArray6041[23] = 677;
			config.anObjectArray6041[24] = 667;
			config.anObjectArray6041[25] = 685;
			config.anObjectArray6041[26] = 1005;
			config.anObjectArray6041[27] = 686;
			config.anObjectArray6041[28] = 1029;
			config.anObjectArray6041[29] = 1006;
		}
	
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	void method6130(int i) {
		try {
			HashMap hashmap = new HashMap();
			if (null != ((ClientScriptMap) this).anObjectArray6041) {
				for (int i_10_ = 0; i_10_ < ((ClientScriptMap) this).anObjectArray6041.length; i_10_++) {
					if (null == ((ClientScriptMap) this).anObjectArray6041[i_10_]) {
						if (i <= 49152) {
							/* empty */
						}
					} else {
						Object object = ((ClientScriptMap) this).anObjectArray6041[i_10_];
						List list = (List) hashmap.get(object);
						if (null == list) {
							list = new LinkedList();
							hashmap.put(object, list);
						}
						list.add(new Integer(i_10_));
					}
				}
			} else if (null != ((ClientScriptMap) this).aMap6040) {
				Iterator iterator = ((ClientScriptMap) this).aMap6040.keySet().iterator();
				while (iterator.hasNext()) {
					Object key = iterator.next();
					Object object = aMap6040.get(key);
					List list = (List) object;
					if (list == null) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(key);
				}
			} else
				throw new IllegalStateException();
			((ClientScriptMap) this).aHashMap6039 = new HashMap();
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Object key = iterator.next();
				Object object = hashmap.get(key);
				List list = (List) object;
				int[] is = new int[list.size()];
				int i_11_ = 0;
				Iterator iterator_12_ = list.iterator();
				while (iterator_12_.hasNext()) {
					Integer integer = (Integer) iterator_12_.next();
					is[i_11_++] = integer.intValue();
				}
				((ClientScriptMap) this).aHashMap6039.put(key, is);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tx.x(").append(')').toString());
		}
	}
	
	public static String recoverPassLink(byte i) {
		return Settings.RECOVER_PASS_LINK;
	}

	static void method6132(int i, int i_15_, int i_16_, byte i_17_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(11, (long) i);
			class298_sub37_sub12.method3449((byte) 23);
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610 = 1274450087 * i_15_;
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9608 = i_16_ * 293101103;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tx.aj(").append(')').toString());
		}
	}

}
