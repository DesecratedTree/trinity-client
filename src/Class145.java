/* Class145 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public abstract class Class145 {
	Class130 aClass130_1578;
	Class260 aClass260_1579;
	Class133 aClass133_1580;
	Class132 aClass132_1581;
	Class475 aClass475_1582;
	boolean aBoolean1583;
	public static float aFloat1584 = Float.POSITIVE_INFINITY;
	Interface4 anInterface4_1585;
	Class144 aClass144_1586;
	float aFloat1587;
	float aFloat1588;
	Class260 aClass260_1589 = new Class260();
	int anInt1590;
	Class136 aClass136_1591;
	Class260 aClass260_1592;
	Class260 aClass260_1593;
	Class260 aClass260_1594;
	Class260 aClass260_1595;
	float aFloat1596;
	float aFloat1597;
	float aFloat1598;
	float aFloat1599;
	Class166 aClass166_1600;
	float aFloat1601;
	boolean aBoolean1602;
	Class146 aClass146_1603;
	int anInt1604;
	float aFloat1605;
	Class497 aClass497_1606;

	public void method1672(boolean bool, float f, Class260 class260, Class244 class244, Class260 class260_0_, Class260 class260_1_, int i) {
		try {
			if (Class144.aClass144_1572 == ((Class145) this).aClass144_1586)
				Class395.method4648(f, class260, class260_0_, class260_1_, (bool ? ((Class145) this).aClass260_1593 : ((Class145) this).aClass260_1592), (bool ? ((Class145) this).aClass260_1579 : ((Class145) this).aClass260_1589), (float) (-829988745 * ((Class145) this).anInt1604), ((Class145) this).aFloat1605, (byte) 52);
			else if (Class144.aClass144_1576 == ((Class145) this).aClass144_1586)
				Class373.method4336(f, class260, class244, class260_0_, class260_1_, (bool ? ((Class145) this).aClass260_1593 : ((Class145) this).aClass260_1592), (bool ? ((Class145) this).aClass260_1579 : ((Class145) this).aClass260_1589), (float) (-829988745 * ((Class145) this).anInt1604), ((Class145) this).aFloat1605, -1906950552);
			else if (Class144.aClass144_1574 == ((Class145) this).aClass144_1586)
				Class342.method3990(f, class260, class244, class260_0_, class260_1_, (bool ? ((Class145) this).aClass260_1595 : ((Class145) this).aClass260_1594), (bool ? ((Class145) this).aFloat1597 : ((Class145) this).aFloat1596), -1698325368);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.i(").append(')').toString());
		}
	}

	public void method1673(Class130 class130, byte i) {
		try {
			((Class145) this).aClass130_1578 = class130;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.p(").append(')').toString());
		}
	}

	public Class166 method1674(Class136 class136, boolean bool, int i) throws Exception_Sub4 {
		try {
			if (((Class145) this).aClass130_1578 == Class130.aClass130_1497 && !bool)
				throw new Exception_Sub4();
			((Class145) this).aClass136_1591 = class136;
			if (Class136.aClass136_1523 == class136)
				((Class145) this).aClass166_1600 = new Class166_Sub2(this);
			else if (class136 == Class136.aClass136_1524)
				((Class145) this).aClass166_1600 = new Class166_Sub1(this);
			else if (Class136.aClass136_1525 == class136)
				((Class145) this).aClass166_1600 = new Class166_Sub3_Sub1(this);
			else if (Class136.aClass136_1526 == class136)
				((Class145) this).aClass166_1600 = new Class166_Sub3_Sub2(this);
			return ((Class145) this).aClass166_1600;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.s(").append(')').toString());
		}
	}

	public void method1675(float f, int i) throws Exception_Sub4 {
		try {
			if (!method1710((byte) 31))
				throw new Exception_Sub4();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.z(").append(')').toString());
		}
	}

	public void method1676(Class260 class260, int i) throws Exception_Sub4 {
		try {
			if (!method1710((byte) 19) || !((Class144) ((Class145) this).aClass144_1586).aBoolean1573)
				throw new Exception_Sub4();
			((Class145) this).aClass260_1592.method2582(class260);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.l(").append(')').toString());
		}
	}

	public void method1677(float f, Class307 class307, int[][][] is, int i) {
		try {
			if (null != ((Class145) this).aClass475_1582)
				((Class145) this).aClass475_1582.method5923(f, -2006090027);
			if (((Class145) this).aClass166_1600 != null)
				((Class145) this).aClass166_1600.method1966(f, class307, is, 50036488);
			Iterator iterator = ((Class145) this).aClass497_1606.iterator();
			while (iterator.hasNext()) {
				Class330_Sub36_Sub15 class330_sub36_sub15 = (Class330_Sub36_Sub15) iterator.next();
				class330_sub36_sub15.method3502(f, (byte) 8);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.j(").append(')').toString());
		}
	}

	public void method1678(Class260 class260, byte i) throws Exception_Sub4 {
		try {
			if (!method1710((byte) 49) || !((Class144) ((Class145) this).aClass144_1586).aBoolean1573)
				throw new Exception_Sub4();
			((Class145) this).aClass260_1579.method2582(class260);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.q(").append(')').toString());
		}
	}

	public void method1679(Class260 class260, float f, int i) throws Exception_Sub4 {
		try {
			if (!method1710((byte) 43) || ((Class144) ((Class145) this).aClass144_1586).aBoolean1573)
				throw new Exception_Sub4();
			((Class145) this).aClass260_1594.method2582(class260);
			((Class145) this).aClass260_1595.method2582(class260);
			((Class145) this).aFloat1596 = f;
			((Class145) this).aFloat1597 = f;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.u(").append(')').toString());
		}
	}

	public void method1680(Class260 class260, float f, int i) throws Exception_Sub4 {
		try {
			if (!method1710((byte) -46) || ((Class144) ((Class145) this).aClass144_1586).aBoolean1573)
				throw new Exception_Sub4();
			((Class145) this).aClass260_1594.method2582(class260);
			((Class145) this).aFloat1596 = f;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.x(").append(')').toString());
		}
	}

	public void method1681(Class260 class260, float f, short i) throws Exception_Sub4 {
		try {
			if (!method1710((byte) -32) || ((Class144) ((Class145) this).aClass144_1586).aBoolean1573)
				throw new Exception_Sub4();
			((Class145) this).aClass260_1595.method2582(class260);
			((Class145) this).aFloat1597 = f;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.g(").append(')').toString());
		}
	}

	public void method1682(float f, float f_2_, byte i) throws Exception_Sub4 {
		try {
			if (!method1710((byte) -53))
				throw new Exception_Sub4();
			((Class145) this).aFloat1598 = f;
			((Class145) this).aFloat1599 = f_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.d(").append(')').toString());
		}
	}

	public void method1683(int i, float f, int i_3_) throws Exception_Sub4 {
		try {
			if (!method1710((byte) 47) || !((Class144) ((Class145) this).aClass144_1586).aBoolean1573)
				throw new Exception_Sub4();
			((Class145) this).anInt1604 = 369391943 * i;
			((Class145) this).aFloat1605 = f;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.e(").append(')').toString());
		}
	}

	public void method1684(Class260 class260, byte i) throws Exception_Sub4 {
		try {
			if (!method1710((byte) 54) || !((Class144) ((Class145) this).aClass144_1586).aBoolean1573)
				throw new Exception_Sub4();
			((Class145) this).aClass260_1593.method2582(class260);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.b(").append(')').toString());
		}
	}

	public Class330_Sub36_Sub15 method1685(int i, int i_4_) {
		try {
			return ((Class330_Sub36_Sub15) ((Class145) this).aClass497_1606.method6094((long) i));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.h(").append(')').toString());
		}
	}

	public void method1686(int i) {
		try {
			((Class145) this).aClass497_1606.method6100(65280);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.y(").append(')').toString());
		}
	}

	public boolean method1687(byte i) {
		try {
			if (null == ((Class145) this).aClass475_1582 || ((Class145) this).aClass166_1600 == null)
				return false;
			if (!((Class145) this).aClass475_1582.method5924(-821839442))
				return false;
			if (!((Class145) this).aClass166_1600.method1985(-1085885033))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.v(").append(')').toString());
		}
	}

	public void method1688(Class138 class138, Class247 class247, Class249 class249, int i, int i_5_, int i_6_) {
		try {
			if (null != ((Class145) this).aClass475_1582 && null != ((Class145) this).aClass166_1600) {
				((Class145) this).aClass475_1582.method5922(class138, class247, i, i_5_, 880244218);
				((Class145) this).aClass166_1600.method1970(class138, i, i_5_, (byte) 1);
				if (((Class145) this).aClass133_1580 == Class133.aClass133_1508)
					class249.method2490(((Class145) this).aFloat1598, ((Class145) this).aFloat1599, ((Class145) this).aFloat1587, ((Class145) this).aFloat1601);
				else
					class249.method2491(((Class145) this).aFloat1598, ((Class145) this).aFloat1599, (float) (-243015761 * (((Class145) this).anInt1590)));
				Iterator iterator = ((Class145) this).aClass497_1606.iterator();
				while (iterator.hasNext()) {
					Class330_Sub36_Sub15 class330_sub36_sub15 = (Class330_Sub36_Sub15) iterator.next();
					class330_sub36_sub15.method3495(class138, class247, class249, 456307467);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.ay(").append(')').toString());
		}
	}

	public Class130 method1689(int i) {
		try {
			return ((Class145) this).aClass130_1578;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.ac(").append(')').toString());
		}
	}

	public void method1690(float f, float f_7_, int i) throws Exception_Sub4 {
		try {
			if (!method1710((byte) -88))
				throw new Exception_Sub4();
			((Class145) this).aFloat1587 = f;
			((Class145) this).aFloat1601 = f_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.c(").append(')').toString());
		}
	}

	public Interface4 method1691(int i) {
		try {
			return ((Class145) this).anInterface4_1585;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.aw(").append(')').toString());
		}
	}

	public void method1692(Class144 class144, int i) throws Exception_Sub4 {
		try {
			if (!method1710((byte) -24))
				throw new Exception_Sub4();
			((Class145) this).aClass144_1586 = class144;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.n(").append(')').toString());
		}
	}

	public Class136 method1693(int i) {
		try {
			return ((Class145) this).aClass136_1591;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.ai(").append(')').toString());
		}
	}

	public Class330_Sub28 method1694(int i) {
		try {
			if (((Class145) this).aClass166_1600 == null)
				return null;
			return ((Class145) this).aClass166_1600.method1969((byte) 39);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.ax(").append(')').toString());
		}
	}

	Class260 method1695(byte i) {
		try {
			if (((Class145) this).aClass475_1582 == null)
				return null;
			return ((Class145) this).aClass475_1582.method5932(-491773170);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.aj(").append(')').toString());
		}
	}

	public Class475 method1696(Class146 class146, boolean bool, byte i) throws Exception_Sub4 {
		try {
			if (Class130.aClass130_1497 == ((Class145) this).aClass130_1578 && !bool)
				throw new Exception_Sub4();
			((Class145) this).aClass146_1603 = class146;
			if (Class146.aClass146_1611 == class146)
				((Class145) this).aClass475_1582 = new Class475_Sub1(this);
			else if (class146 == Class146.aClass146_1610)
				((Class145) this).aClass475_1582 = new Class475_Sub3(this);
			else if (class146 == Class146.aClass146_1607)
				((Class145) this).aClass475_1582 = new Class475_Sub4(this);
			else if (class146 == Class146.aClass146_1609)
				((Class145) this).aClass475_1582 = new Class475_Sub2_Sub2(this);
			else if (class146 == Class146.aClass146_1608)
				((Class145) this).aClass475_1582 = new Class475_Sub2_Sub1(this);
			else if (class146 == Class146.aClass146_1612)
				((Class145) this).aClass475_1582 = new Class475_Sub5(this);
			return ((Class145) this).aClass475_1582;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.o(").append(')').toString());
		}
	}

	public boolean method1697(int i) {
		try {
			return ((Class145) this).aBoolean1602;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.ar(").append(')').toString());
		}
	}

	public Class260 method1698(int i) {
		try {
			return ((Class145) this).aClass260_1592;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.aa(").append(')').toString());
		}
	}

	public Class260 method1699(int i) {
		try {
			return ((Class145) this).aClass260_1593;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.ab(").append(')').toString());
		}
	}

	public float method1700(byte i) {
		try {
			return ((Class145) this).aFloat1588;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.ak(").append(')').toString());
		}
	}

	public Class260 method1701(short i) {
		try {
			return ((Class145) this).aClass260_1589;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.ag(").append(')').toString());
		}
	}

	public void method1702(Class330_Sub36_Sub15 class330_sub36_sub15, int i) {
		try {
			((Class145) this).aClass497_1606.method6097(class330_sub36_sub15, (long) (514349311 * class330_sub36_sub15.anInt9720));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.m(").append(')').toString());
		}
	}

	public float method1703(int i) {
		try {
			return ((Class145) this).aFloat1598;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.ah(").append(')').toString());
		}
	}

	public float method1704(int i) {
		try {
			return ((Class145) this).aFloat1599;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.av(").append(')').toString());
		}
	}

	public Class260 method1705(int i) {
		try {
			if (null == ((Class145) this).aClass166_1600)
				return null;
			return ((Class145) this).aClass166_1600.method1968((byte) -1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.as(").append(')').toString());
		}
	}

	public boolean method1706(int i) {
		try {
			return ((Class145) this).aBoolean1583;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.am(").append(')').toString());
		}
	}

	public Class166 method1707(int i) {
		try {
			return ((Class145) this).aClass166_1600;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.al(").append(')').toString());
		}
	}

	public Class260 method1708(int i) {
		try {
			return ((Class145) this).aClass260_1579;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.az(").append(')').toString());
		}
	}

	public void method1709(boolean bool, boolean bool_8_, byte i) throws Exception_Sub4 {
		try {
			if (!method1710((byte) 6))
				throw new Exception_Sub4();
			((Class145) this).aBoolean1602 = bool;
			((Class145) this).aBoolean1583 = bool_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.a(").append(')').toString());
		}
	}

	boolean method1710(byte i) {
		try {
			if (((Class145) this).aClass132_1581 == Class132.aClass132_1504 && ((Class145) this).aClass130_1578 == Class130.aClass130_1497)
				return true;
			if (Class132.aClass132_1503 == ((Class145) this).aClass132_1581 && ((Class145) this).aClass130_1578 == Class130.aClass130_1495)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.f(").append(')').toString());
		}
	}

	float method1711(byte i) {
		try {
			Class260 class260 = method1705(-1961940011);
			Class260 class260_9_ = method1695((byte) 3);
			float f = 0.0F;
			if (null != class260 && class260_9_ != null) {
				Class260 class260_10_ = Class260.method2561(class260_9_, class260);
				float f_11_ = (float) Math.sqrt((double) ((class260_10_.aFloat2711 * class260_10_.aFloat2711) + (class260_10_.aFloat2716 * (class260_10_.aFloat2716))));
				f = (float) Math.atan2((double) -class260_10_.aFloat2715, (double) f_11_);
				class260.method2550();
				class260_9_.method2550();
			}
			return f;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.ad(").append(')').toString());
		}
	}

	public Class244 method1712(int i) {
		try {
			Class244 class244 = Class244.method2428();
			class244.method2420(method1713(1933043069), method1711((byte) 2), method1720((short) 941));
			return class244;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.aq(").append(')').toString());
		}
	}

	public float method1713(int i) {
		try {
			Class260 class260 = method1705(1309596061);
			Class260 class260_12_ = method1695((byte) 3);
			float f = 0.0F;
			if (null != class260 && class260_12_ != null) {
				Class260 class260_13_ = Class260.method2561(class260, class260_12_);
				class260_13_.aFloat2715 = 0.0F;
				f = (float) Math.atan2((double) class260_13_.aFloat2716, (double) class260_13_.aFloat2711);
				class260.method2550();
				class260_12_.method2550();
			}
			return (float) (3.141592653589793 - (double) f);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.an(").append(')').toString());
		}
	}

	void method1714(boolean bool, int i) {
		try {
			((Class145) this).aClass133_1580 = Class133.aClass133_1508;
			((Class145) this).aClass146_1603 = null;
			((Class145) this).aClass475_1582 = null;
			((Class145) this).aClass136_1591 = null;
			((Class145) this).aClass166_1600 = null;
			if (((Class145) this).aClass132_1581 == Class132.aClass132_1504 || !bool)
				((Class145) this).aClass130_1578 = Class130.aClass130_1497;
			else
				((Class145) this).aClass130_1578 = Class130.aClass130_1495;
			((Class145) this).aClass144_1586 = Class144.aClass144_1576;
			((Class145) this).aClass260_1589.method2553(100.0F, 100.0F, 100.0F);
			((Class145) this).aClass260_1579.method2553(100.0F, 100.0F, 100.0F);
			((Class145) this).aFloat1588 = 0.05F;
			((Class145) this).aClass260_1592.method2553(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
			((Class145) this).aClass260_1593.method2553(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
			((Class145) this).aClass260_1594.method2553(1.0F, 1.0F, 1.0F);
			((Class145) this).aClass260_1595.method2553(1.0F, 1.0F, 1.0F);
			((Class145) this).aFloat1596 = 1.1F;
			((Class145) this).aFloat1597 = 1.1F;
			((Class145) this).aFloat1598 = 50.0F;
			((Class145) this).aFloat1599 = 10000.0F;
			((Class145) this).aFloat1601 = 1.5707964F;
			((Class145) this).aFloat1587 = 1.5707964F;
			((Class145) this).anInt1590 = -1024838517;
			((Class145) this).aBoolean1602 = true;
			((Class145) this).aBoolean1583 = true;
			((Class145) this).anInt1604 = 0;
			((Class145) this).aFloat1605 = 1.0F;
			((Class145) this).aClass497_1606.method6100(65280);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.r(").append(')').toString());
		}
	}

	public Class475 method1715(int i) {
		try {
			return ((Class145) this).aClass475_1582;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.at(").append(')').toString());
		}
	}

	public void method1716(Class260 class260, int i) throws Exception_Sub4 {
		try {
			if (!method1710((byte) -50) || !((Class144) ((Class145) this).aClass144_1586).aBoolean1573)
				throw new Exception_Sub4();
			((Class145) this).aClass260_1589.method2582(class260);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.k(").append(')').toString());
		}
	}

	public void method1717(int i, int i_14_) {
		try {
			Class330_Sub36_Sub15 class330_sub36_sub15 = ((Class330_Sub36_Sub15) ((Class145) this).aClass497_1606.method6094((long) i));
			if (class330_sub36_sub15 != null)
				class330_sub36_sub15.method3252(-2078176685);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.t(").append(')').toString());
		}
	}

	public Class146 method1718(int i) {
		try {
			return ((Class145) this).aClass146_1603;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.ap(").append(')').toString());
		}
	}

	public void method1719(float f, int i) throws Exception_Sub4 {
		try {
			if (!method1710((byte) -57))
				throw new Exception_Sub4();
			((Class145) this).aFloat1588 = f;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.w(").append(')').toString());
		}
	}

	Class145(Class132 class132, Interface4 interface4) {
		((Class145) this).aClass260_1579 = new Class260();
		((Class145) this).aClass260_1592 = new Class260();
		((Class145) this).aClass260_1593 = new Class260();
		((Class145) this).aClass260_1594 = new Class260();
		((Class145) this).aClass260_1595 = new Class260();
		((Class145) this).anInt1604 = 0;
		((Class145) this).aFloat1605 = 1.0F;
		((Class145) this).aClass497_1606 = new Class497(8);
		((Class145) this).aClass132_1581 = class132;
		((Class145) this).anInterface4_1585 = interface4;
		method1714(true, -1876289556);
	}

	float method1720(short i) {
		try {
			return 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.af(").append(')').toString());
		}
	}

	static final void method1721(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1889819541;
			Class195[] class195s = Class457.method5665(-1882618819);
			Class211[] class211s = Class7.method412((byte) -79);
			Class_na.method3518(class195s[(((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376])], (class211s[(((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751])]), (((Class430) class430).anIntArray4387[2 + 1632830751 * ((Class430) class430).anInt4376]), (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 3]), (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 4]), (((Class430) class430).anIntArray4387[5 + ((Class430) class430).anInt4376 * 1632830751]), (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 6]), (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 7]), (((Class430) class430).anIntArray4387[8 + 1632830751 * ((Class430) class430).anInt4376]), (((Class430) class430).anIntArray4387[9 + ((Class430) class430).anInt4376 * 1632830751]), (((Class430) class430).anIntArray4387[10 + 1632830751 * ((Class430) class430).anInt4376]), 1523385482);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.tm(").append(')').toString());
		}
	}

	static final void method1722(Class430 class430, short i) {
		try {
			int i_15_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class396.method4655(i_15_, 1841589740);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.ajb(").append(')').toString());
		}
	}

	static final void method1723(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (Class448.aClass330_Sub50_5555.aClass464_Sub9_7899.method5767(1840616943) && Class361.aClass_ra3793.ac() ? 1 : 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.apd(").append(')').toString());
		}
	}

	static final void method1724(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = ((Class430) class430).aClass432_Sub1_Sub2_Sub1_4390.method5363(-1869787685);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.arm(").append(')').toString());
		}
	}

	public static int method1725(CharSequence charsequence, CharSequence charsequence_16_, Class454 class454, int i) {
		try {
			int i_17_ = charsequence.length();
			int i_18_ = charsequence_16_.length();
			int i_19_ = 0;
			int i_20_ = 0;
			char c = '\0';
			char c_21_ = '\0';
			while_66_: do {
				char c_22_;
				char c_23_;
				for (;;) {
					if (i_19_ - c >= i_17_ && i_20_ - c_21_ >= i_18_) {
						if (i >= -336792257) {
							/* empty */
						}
						break while_66_;
					}
					if (i_19_ - c >= i_17_)
						return -1;
					if (i_20_ - c_21_ >= i_18_)
						return 1;
					if (0 != c) {
						c_22_ = c;
						boolean bool = false;
					} else
						c_22_ = charsequence.charAt(i_19_++);
					if (c_21_ != 0) {
						c_23_ = c_21_;
						boolean bool = false;
					} else
						c_23_ = charsequence_16_.charAt(i_20_++);
					c = Class359.method4240(c_22_, 709416512);
					c_21_ = Class359.method4240(c_23_, -884728575);
					c_22_ = Class424.method5305(c_22_, class454, (byte) 71);
					c_23_ = Class424.method5305(c_23_, class454, (byte) 26);
					if (c_22_ != c_23_ && (Character.toUpperCase(c_22_) != Character.toUpperCase(c_23_))) {
						c_22_ = Character.toLowerCase(c_22_);
						c_23_ = Character.toLowerCase(c_23_);
						if (c_23_ != c_22_)
							break;
					}
				}
				return (Class330_Sub9.method3285(c_22_, class454, 896185717) - Class330_Sub9.method3285(c_23_, class454, 896185717));
			} while (false);
			int i_24_ = Math.min(i_17_, i_18_);
			for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
				if (Class454.aClass454_6830 == class454) {
					i_19_ = i_17_ - 1 - i_25_;
					i_20_ = i_18_ - 1 - i_25_;
				} else
					i_19_ = i_20_ = i_25_;
				char c_26_ = charsequence.charAt(i_19_);
				char c_27_ = charsequence_16_.charAt(i_20_);
				if (c_27_ != c_26_ && (Character.toUpperCase(c_26_) != Character.toUpperCase(c_27_))) {
					c_26_ = Character.toLowerCase(c_26_);
					c_27_ = Character.toLowerCase(c_27_);
					if (c_26_ != c_27_)
						return (Class330_Sub9.method3285(c_26_, class454, 896185717) - Class330_Sub9.method3285(c_27_, class454, 896185717));
				}
			}
			int i_28_ = i_17_ - i_18_;
			if (i_28_ != 0)
				return i_28_;
			for (int i_29_ = 0; i_29_ < i_24_; i_29_++) {
				char c_30_ = charsequence.charAt(i_29_);
				char c_31_ = charsequence_16_.charAt(i_29_);
				if (c_30_ != c_31_)
					return (Class330_Sub9.method3285(c_30_, class454, 896185717) - Class330_Sub9.method3285(c_31_, class454, 896185717));
			}
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.r(").append(')').toString());
		}
	}

	static final void method1726(Class330_Sub48 class330_sub48, int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, short i_40_) {
		try {
			if (Class397_Sub1.method4681(i, null, 1346530658)) {
				if (null != class330_sub48 && !class330_sub48.method3831((byte) -1))
					Class75.method854(class330_sub48, true, false, 508568198);
				else {
					Class120 class120 = Class3.aClass120Array56[i];
					client.method3917(class120, class120.method1442((byte) 4), -1, i_32_, i_33_, i_34_, i_35_, i_36_, i_37_, i_38_, i_39_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fw.ld(").append(')').toString());
		}
	}
}
