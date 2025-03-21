/* Class360 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class360 {
	static int anInt3743 = 55;
	static int anInt3744 = 288;
	static boolean lobby;
	static int anInt3746 = 96;
	static int anInt3747 = 182;
	static boolean aBoolean3748;
	static int anInt3749;
	static long aLong3750;
	static int anInt3751 = 4;
	static int anInt3752 = 1;
	public static int anInt3753;
	public static int anInt3754;
	static int anInt3755 = 40;
	public static int anInt3756;
	static int anInt3757 = 68;
	static int anInt3758 = 78;
	static int anInt3759 = 108;
	public static int anInt3760;
	static int anInt3761 = 155;
	static int anInt3762 = 115;
	static int anInt3763 = 122;
	static int anInt3764 = 137;
	static int anInt3765 = 227;
	static int anInt3766 = 12;
	static int anInt3767 = 168;
	static int anInt3768 = 172;
	static int anInt3769;
	static int anInt3770 = 193;
	static int anInt3771 = 204;
	static int anInt3772 = 215;
	static boolean aBoolean3773 = false;
	static int anInt3774 = 236;
	public static int anInt3775;
	static long socialName;
	public static String username;
	static int anInt3778 = 140;
	static int anInt3779;
	static int anInt3780;
	public static int anInt3781;
	public static String password;
	static Class1 aClass1_3783;
	public static int anInt3784;
	public static int anInt3785;
	public static int anInt3786;
	public static int anInt3787;
	static int anInt3788 = 34;
	static int anInt3789 = 87;
	static int anInt3790 = 103;
	static int anInt3791;
	static boolean aBoolean3792;

	static {
		aBoolean3748 = false;
		anInt3749 = -203611577;
		aLong3750 = 717415731737899667L;
		anInt3769 = 1450045783;
		socialName = 0L;
		username = "";
		password = "";
		anInt3779 = 0;
		anInt3780 = 0;
		anInt3781 = 253004398;
		anInt3775 = -538850970;
		anInt3760 = 1929169398;
		anInt3784 = 1231360841;
		anInt3785 = 251114653;
		anInt3786 = 0;
		anInt3787 = -322612985;
		anInt3756 = -1763756225;
		anInt3753 = 0;
		lobby = false;
		anInt3754 = 0;
		aBoolean3792 = false;
	}

	Class360() throws Throwable {
		throw new Error();
	}

	static void method4241(String string, String string_0_, int i, int i_1_, int i_2_, long l, int i_3_, int i_4_, boolean bool, boolean bool_5_, long l_6_, boolean bool_7_, short i_8_) {
		try {
			if (!Class484.aBoolean5782 && -2008486989 * Class484.anInt5786 < 520) {
				i = i != -1 ? i : client.anInt9147 * -1676605053;
				Class330_Sub36_Sub10 class330_sub36_sub10 = new Class330_Sub36_Sub10(string, string_0_, i, i_1_, i_2_, l, i_3_, i_4_, bool, bool_5_, l_6_, bool_7_);
				Class153.method1793(class330_sub36_sub10, (byte) 124);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("p.u(").append(')').toString());
		}
	}

	public static boolean method4242(int i) {
		try {
			return 242692185 * MusicManager.currentState != 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("p.q(").append(')').toString());
		}
	}

	static Class95 method4243(Buffer class330_sub46, int i) {
		try {
			int i_9_ = class330_sub46.readUnsignedByte(1779729665);
			Class558 class558 = Class394.method4632(i_9_, (byte) 54);
			Class95 class95 = null;
			switch (3667851 * class558.anInt6426) {
			case 8:
				class95 = new Class95_Sub3(class330_sub46, 0, 0);
				break;
			case 18:
				class95 = new Class95_Sub12_Sub1(class330_sub46);
				break;
			case 20:
				class95 = new Class95_Sub4(class330_sub46);
				break;
			case 26:
				class95 = new Class95_Sub17(class330_sub46);
				break;
			case 6:
				class95 = new Class95_Sub21(class330_sub46);
				break;
			case 13:
				class95 = new Class95_Sub10(class330_sub46);
				break;
			case 23:
				class95 = new Class95_Sub19(class330_sub46);
				break;
			case 9:
				class95 = new Class95_Sub20(class330_sub46, true);
				break;
			case 4:
				class95 = new Class95_Sub22(class330_sub46);
				break;
			case 11:
				class95 = new Class95_Sub3(class330_sub46, 0, 1);
				break;
			case 22:
				class95 = new Class95_Sub9(class330_sub46);
				break;
			case 15:
				class95 = new Class95_Sub12_Sub2(class330_sub46);
				break;
			case 0:
				class95 = new Class95_Sub8(class330_sub46);
				break;
			case 27:
				class95 = new Class95_Sub16(class330_sub46);
				break;
			case 5:
				class95 = new Class95_Sub5(class330_sub46);
				break;
			case 17:
				class95 = new Class95_Sub14(class330_sub46);
				break;
			case 19:
				class95 = new Class95_Sub3(class330_sub46, 1, 0);
				break;
			case 10:
				class95 = new Class95_Sub1(class330_sub46);
				break;
			case 25:
				class95 = new Class95_Sub11(class330_sub46);
				break;
			case 30:
				class95 = new Class95_Sub6(class330_sub46);
				break;
			case 2:
				class95 = new Class95_Sub2(class330_sub46);
				break;
			default:
				break;
			case 1:
				class95 = new Class95_Sub15(class330_sub46);
				break;
			case 3:
				class95 = new Class95_Sub13(class330_sub46);
				break;
			case 29:
				class95 = new Class95_Sub3(class330_sub46, 1, 1);
				break;
			case 28:
				class95 = new Class95_Sub23(class330_sub46);
				break;
			case 7:
				class95 = new Class95_Sub7(class330_sub46);
				break;
			case 16:
				class95 = new Class95_Sub20(class330_sub46, false);
				break;
			case 12:
				class95 = new Class95_Sub18(class330_sub46);
			}
			return class95;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("p.r(").append(')').toString());
		}
	}

	public static String method4244(long l) {
		try {
			if (l <= 0L || l >= 6582952005840035281L)
				return null;
			if (0L == l % 37L)
				return null;
			int i = 0;
			for (long l_10_ = l; l_10_ != 0L; l_10_ /= 37L)
				i++;
			StringBuilder stringbuilder = new StringBuilder(i);
			while (0L != l) {
				long l_11_ = l;
				l /= 37L;
				stringbuilder.append(Class443.aCharArray4493[(int) (l_11_ - 37L * l)]);
			}
			return stringbuilder.reverse().toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("p.j(").append(')').toString());
		}
	}

	static final void method4245(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class110.method1362(iComponentDefinitions, class120, class430, (byte) 116);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("p.mt(").append(')').toString());
		}
	}

	static final void method4246(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_12_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_13_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			if (null == Class3.aClass120Array56[i_12_])
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1723527275 * (Class3.aClass120Array56[i_12_].aClass114Array1400[i_13_].anInt1195);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("p.anp(").append(')').toString());
		}
	}
}
