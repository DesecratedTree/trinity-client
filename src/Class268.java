/* Class268 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class268 {
	IndexTable aClass280_2741;
	IndexTable aClass280_2742;
	Class367 aClass367_2743 = new Class367(64);
	static int anInt2744;
	static int anInt2745 = 0;
	static boolean aBoolean2746;
	static int anInt2747 = 32768;
	static int anInt2748;

	public Class330_Sub36_Sub9 method2659(int i, int i_0_) {
		try {
			Class330_Sub36_Sub9 class330_sub36_sub9 = ((Class330_Sub36_Sub9) ((Class268) this).aClass367_2743.get((long) i));
			if (class330_sub36_sub9 != null)
				return class330_sub36_sub9;
			byte[] is;
			if (i >= 32768)
				is = ((Class268) this).aClass280_2742.getFile(0, i & 0x7fff);
			else
				is = ((Class268) this).aClass280_2741.getFile(0, i);
			class330_sub36_sub9 = new Class330_Sub36_Sub9();
			if (null != is)
				class330_sub36_sub9.method3476(new Buffer(is), (byte) 1);
			if (i >= 32768)
				class330_sub36_sub9.method3479(-9525558);
			((Class268) this).aClass367_2743.put(class330_sub36_sub9, (long) i);
			return class330_sub36_sub9;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("le.r(").append(')').toString());
		}
	}

	public Class268(Class454 class454, IndexTable class280, IndexTable class280_1_) {
		((Class268) this).aClass280_2741 = class280;
		((Class268) this).aClass280_2742 = class280_1_;
		if (null != ((Class268) this).aClass280_2741)
			((Class268) this).aClass280_2741.method2763(0, -2141712958);
		if (((Class268) this).aClass280_2742 != null)
			((Class268) this).aClass280_2742.method2763(0, -2125762463);
	}

	public static Class366 method2660(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		try {
			Class363.aClass366_Sub6_3803.anInt3854 = -1089827279 * i;
			Class363.aClass366_Sub6_3803.anInt3853 = 1307742219 * i_2_;
			Class363.aClass366_Sub6_3803.anInt3852 = i_3_ * 1706819999;
			Class363.aClass366_Sub6_3803.anInt3855 = i_4_ * 1343860585;
			((Class366_Sub6) Class363.aClass366_Sub6_3803).anInt8009 = 1211992619 * i_5_;
			return Class363.aClass366_Sub6_3803;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("le.p(").append(')').toString());
		}
	}

	static final void method2661(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class24.method483(iComponentDefinitions, class430, -267729105);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("le.qb(").append(')').toString());
		}
	}

	static final void method2662(Class430 class430, byte i) {
		try {
			int i_7_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = Class146.method1738(i_7_, -849826454);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("le.zr(").append(')').toString());
		}
	}

	static final void method2663(int i) {
		try {
			Iterator iterator = client.aClass497_9216.iterator();
			while (iterator.hasNext()) {
				Class330_Sub36_Sub2 class330_sub36_sub2 = (Class330_Sub36_Sub2) iterator.next();
				Class432_Sub1_Sub1_Sub4 class432_sub1_sub1_sub4 = (((Class330_Sub36_Sub2) class330_sub36_sub2).aClass432_Sub1_Sub1_Sub4_9624);
				class432_sub1_sub1_sub4.method5499(1, 2131930905);
				if (class432_sub1_sub1_sub4.method5505(-1390004513)) {
					class330_sub36_sub2.method3252(-1452763994);
					class432_sub1_sub1_sub4.method5503(888749273);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("le.jc(").append(')').toString());
		}
	}
}
