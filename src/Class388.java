/* Class388 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class388 {
	public boolean aBoolean3992 = false;
	boolean aBoolean3993 = false;
	Class325_Sub3_Sub1_Sub1[] aClass325_Sub3_Sub1_Sub1Array3994;
	int anInt3995 = 0;
	Class81 aClass81_3996;
	long aLong3997;
	List aList3998 = new LinkedList();
	int anInt3999 = 0;
	List aList4000 = new LinkedList();
	boolean aBoolean4001;
	int anInt4002 = 0;
	boolean aBoolean4003;
	int anInt4004;
	static boolean[] aBooleanArray4005;
	static boolean[] aBooleanArray4006 = new boolean[32];
	long aLong4007;

	static {
		aBooleanArray4005 = new boolean[8];
	}

	boolean method4561(Class_ra class_ra, long l) {
		if (((Class388) this).aLong3997 != ((Class388) this).aLong4007)
			method4572();
		else
			method4569();
		if (l - ((Class388) this).aLong3997 > 750L) {
			method4564();
			return false;
		}
		int i = (int) (l - ((Class388) this).aLong4007);
		if (((Class388) this).aBoolean4001) {
			Iterator iterator = ((Class388) this).aList3998.iterator();
			while (iterator.hasNext()) {
				Class406 class406 = (Class406) iterator.next();
				for (int i_0_ = 0; i_0_ < (((Class406) class406).aClass210_4176.anInt2048 * 899694153); i_0_++)
					class406.method4749(class_ra, l, 1, !((Class388) this).aBoolean3993, -2004023818);
			}
			((Class388) this).aBoolean4001 = false;
		}
		Iterator iterator = ((Class388) this).aList3998.iterator();
		while (iterator.hasNext()) {
			Class406 class406 = (Class406) iterator.next();
			class406.method4749(class_ra, l, i, !((Class388) this).aBoolean3993, 2046690814);
		}
		((Class388) this).aLong4007 = l;
		return true;
	}

	void method4562(int i, boolean bool) {
		Class391.aList4056.add(this);
		((Class388) this).aLong3997 = (long) i;
		((Class388) this).aLong4007 = (long) i;
		((Class388) this).aBoolean4001 = true;
		((Class388) this).aBoolean4003 = bool;
	}

	public void method4563() {
		((Class388) this).aBoolean4001 = true;
	}

	void method4564() {
		aBoolean3992 = true;
		Iterator iterator = ((Class388) this).aList4000.iterator();
		while (iterator.hasNext()) {
			Class330_Sub21 class330_sub21 = (Class330_Sub21) iterator.next();
			if ((((Class330_Sub21) class330_sub21).aClass208_7685.anInt1968 * 1443671963) == 1)
				class330_sub21.method3252(-1370135506);
		}
		for (int i = 0; i < ((Class388) this).aClass325_Sub3_Sub1_Sub1Array3994.length; i++) {
			if (((Class388) this).aClass325_Sub3_Sub1_Sub1Array3994[i] != null) {
				((Class388) this).aClass325_Sub3_Sub1_Sub1Array3994[i].method3221();
				((Class388) this).aClass325_Sub3_Sub1_Sub1Array3994[i] = null;
			}
		}
		((Class388) this).anInt3995 = 0;
		((Class388) this).aList3998 = new LinkedList();
		((Class388) this).anInt3999 = 0;
		((Class388) this).aList4000 = new LinkedList();
		((Class388) this).anInt4002 = 0;
	}

	public void method4565(long l) {
		((Class388) this).aLong3997 = l;
	}

	void method4566(Class_ra class_ra, Class93[] class93s, boolean bool) {
		for (int i = 0; i < 32; i++)
			aBooleanArray4006[i] = false;
		Iterator iterator = ((Class388) this).aList3998.iterator();
		while_96_: while (iterator.hasNext()) {
			Class406 class406 = (Class406) iterator.next();
			if (class93s != null) {
				for (int i = 0; i < class93s.length; i++) {
					if (((Class406) class406).aClass93_4178 == class93s[i] || (((Class406) class406).aClass93_4178 == class93s[i].aClass93_833)) {
						aBooleanArray4006[i] = true;
						class406.method4748(674084352);
						((Class406) class406).aBoolean4187 = false;
						continue while_96_;
					}
				}
			}
			if (!bool) {
				if (((Class406) class406).anInt4180 * -485245129 == 0) {
					iterator.remove();
					((Class388) this).anInt3999--;
				} else
					((Class406) class406).aBoolean4187 = true;
			}
		}
		if (class93s != null) {
			for (int i = 0; (i < class93s.length && i != 32 && ((Class388) this).anInt3999 != 32); i++) {
				if (!aBooleanArray4006[i]) {
					Class406 class406 = new Class406(class_ra, class93s[i], this, ((Class388) this).aLong3997);
					((Class388) this).aList3998.add(class406);
					((Class388) this).anInt3999++;
					aBooleanArray4006[i] = true;
				}
			}
		}
	}

	void method4567(Class356 class356, Class_ra class_ra) {
		((Class388) this).aClass81_3996.aClass461_675.method5696(217714469);
		Iterator iterator = ((Class388) this).aList3998.iterator();
		while (iterator.hasNext()) {
			Class406 class406 = (Class406) iterator.next();
			class406.method4750(class356, class_ra, ((Class388) this).aLong4007);
		}
	}

	public void method4568(Class_ra class_ra, long l, Class93[] class93s, Class64[] class64s, boolean bool) {
		if (!aBoolean3992) {
			method4566(class_ra, class93s, bool);
			method4575(class64s, bool);
			((Class388) this).aLong3997 = l;
		}
	}

	void method4569() {
		((Class388) this).aBoolean3993 = false;
	}

	public Class81 method4570() {
		return ((Class388) this).aClass81_3996;
	}

	public static Class388 method4571(int i, boolean bool) {
		if (Class391.anInt4057 * -1415763739 != Class391.anInt4060 * -834667313) {
			Class388 class388 = Class50.aClass388Array482[Class391.anInt4060 * -834667313];
			Class391.anInt4060 = ((Class391.anInt4060 * -834667313 + 1 & Class91.anIntArray821[Class391.anInt4053 * 1896992813]) * 1421314607);
			class388.method4562(i, bool);
			return class388;
		}
		return new Class388(i, bool);
	}

	public void method4572() {
		((Class388) this).aBoolean3993 = true;
	}

	public void method4573(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		((Class388) this).anInt4004 = i;
	}

	public Class81 method4574() {
		((Class388) this).aClass81_3996.aClass461_675.method5696(90717493);
		for (int i = 0; i < ((Class388) this).aClass325_Sub3_Sub1_Sub1Array3994.length; i++) {
			if (((Class388) this).aClass325_Sub3_Sub1_Sub1Array3994[i] != null && (((Class325_Sub3_Sub1_Sub1) ((Class388) this).aClass325_Sub3_Sub1_Sub1Array3994[i]).aClass406_10127) != null)
				((Class388) this).aClass81_3996.aClass461_675.method5693(((Class388) this).aClass325_Sub3_Sub1_Sub1Array3994[i], 72631206);
		}
		return ((Class388) this).aClass81_3996;
	}

	void method4575(Class64[] class64s, boolean bool) {
		for (int i = 0; i < 8; i++)
			aBooleanArray4005[i] = false;
		Iterator iterator = ((Class388) this).aList4000.iterator();
		while_97_: while (iterator.hasNext()) {
			Class330_Sub21 class330_sub21 = (Class330_Sub21) iterator.next();
			if (class64s != null) {
				for (int i = 0; i < class64s.length; i++) {
					if ((((Class330_Sub21) class330_sub21).aClass64_7690 == class64s[i]) || (((Class330_Sub21) class330_sub21).aClass64_7690 == class64s[i].aClass64_562)) {
						aBooleanArray4005[i] = true;
						class330_sub21.method3375((byte) 92);
						continue while_97_;
					}
				}
			}
			if (!bool) {
				class330_sub21.method3252(544644437);
				((Class388) this).anInt4002--;
				if (class330_sub21.method3251(122249317)) {
					class330_sub21.method3252(50520538);
					Class391.anInt4061 -= 809889659;
				}
			}
		}
		if (class64s != null) {
			for (int i = 0; (i < class64s.length && i != 8 && ((Class388) this).anInt4002 != 8); i++) {
				if (!aBooleanArray4005[i]) {
					Class330_Sub21 class330_sub21 = null;
					if ((class64s[i].method771(-1671982278).anInt1968 * 1443671963) == 1 && Class391.anInt4061 * -1727490125 < 32) {
						class330_sub21 = new Class330_Sub21(class64s[i], this);
						Class391.aClass497_4062.method6097(class330_sub21, (long) (class64s[i].anInt564 * 918085747));
						Class391.anInt4061 += 809889659;
					}
					if (class330_sub21 == null)
						class330_sub21 = new Class330_Sub21(class64s[i], this);
					((Class388) this).aList4000.add(class330_sub21);
					((Class388) this).anInt4002++;
					aBooleanArray4005[i] = true;
				}
			}
		}
	}

	Class388(int i, boolean bool) {
		((Class388) this).aBoolean4001 = false;
		((Class388) this).aBoolean4003 = false;
		((Class388) this).aClass81_3996 = new Class81();
		((Class388) this).aClass325_Sub3_Sub1_Sub1Array3994 = new Class325_Sub3_Sub1_Sub1[8192];
		method4562(i, bool);
	}
}
