/* Class528 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.TimeZone;

public class Class528 {
	public static long aLong6214 = 1000L;
	static Calendar aCalendar6215;
	static String[][] aStringArrayArray6216 = { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil", "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };
	static Calendar aCalendar6217;

	static {
		aCalendar6215 = Calendar.getInstance();
		aCalendar6217 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	Class528() throws Throwable {
		throw new Error();
	}

	static void method6271(Class_ra class_ra, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		try {
			if ((null == Class326.aClass61_3321 || null == Class330_Sub36_Sub12.aClass61_9714 || Class291.aClass61_2980 == null) && Class540.aClass280_6249.method2750(-319726995 * Class486.anInt5825, 677988541) && Class540.aClass280_6249.method2750(1638486247 * IndexTable.anInt2908, 2015924560) && Class540.aClass280_6249.method2750((Class484.anInt5808 * -1498962013), 1607149368)) {
				Class87 class87 = Class53.method643(Class540.aClass280_6249, IndexTable.anInt2908 * 1638486247, 0);
				Class330_Sub36_Sub12.aClass61_9714 = class_ra.bw(class87, true);
				class87.method998();
				Class99.aClass61_918 = class_ra.bw(class87, true);
				Class326.aClass61_3321 = class_ra.bw(Class53.method643(Class540.aClass280_6249, (Class486.anInt5825 * -319726995), 0), true);
				Class87 class87_5_ = Class53.method643(Class540.aClass280_6249, Class484.anInt5808 * -1498962013, 0);
				Class291.aClass61_2980 = class_ra.bw(class87_5_, true);
				class87_5_.method998();
				Class150_Sub2.aClass61_7271 = class_ra.bw(class87_5_, true);
			}
			if (Class326.aClass61_3321 != null && null != Class330_Sub36_Sub12.aClass61_9714 && Class291.aClass61_2980 != null) {
				int i_6_ = ((i_1_ - Class291.aClass61_2980.method681() * 2) / Class326.aClass61_3321.method681());
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
					Class326.aClass61_3321.method687((i + Class291.aClass61_2980.method681() + i_7_ * Class326.aClass61_3321.method681()), i_2_ + i_0_ - Class326.aClass61_3321.method682());
				int i_8_ = ((i_2_ - i_3_ - Class291.aClass61_2980.method682()) / Class330_Sub36_Sub12.aClass61_9714.method682());
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
					Class330_Sub36_Sub12.aClass61_9714.method687(i, i_3_ + i_0_ + i_9_ * Class330_Sub36_Sub12.aClass61_9714.method682());
					Class99.aClass61_918.method687(i + i_1_ - Class99.aClass61_918.method681(), i_3_ + i_0_ + i_9_ * Class330_Sub36_Sub12.aClass61_9714.method682());
				}
				Class291.aClass61_2980.method687(i, (i_0_ + i_2_ - Class291.aClass61_2980.method682()));
				Class150_Sub2.aClass61_7271.method687(i + i_1_ - Class291.aClass61_2980.method681(), i_2_ + i_0_ - Class291.aClass61_2980.method682());
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vw.ao(").append(')').toString());
		}
	}

	static boolean method6272(boolean bool, boolean bool_10_, String string, String string_11_, long l) {
		try {
			Class360.aBoolean3748 = bool;
			if (!bool_10_)
				Class360.anInt3749 = -203611577;
			Class360.aBoolean3773 = bool_10_;
			Class360.username = string;
			Class360.password = string_11_;
			Class360.aLong3750 = l * -717415731737899667L;
			if (!Class360.aBoolean3773 && (Class360.username.equals("") || Class360.password.equals(""))) {
				Class281.method2792(3, -1676918787);
				Class325_Sub1.method3213(954083232);
				return false;
			}
			if (108 != 1260801089 * Class360.anInt3791) {
				Class360.anInt3786 = 0;
				Class360.anInt3756 = -1763756225;
				Class360.anInt3787 = -322612985;
			}
			Class360.aClass1_3783.aBoolean37 = false;
			Class281.method2792(-3, -730227313);
			Class360.anInt3769 = 220680212;
			Class360.anInt3779 = 0;
			Class360.anInt3780 = 0;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vw.a(").append(')').toString());
		}
	}
}
