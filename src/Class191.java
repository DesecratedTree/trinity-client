/* Class191 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class191 {
	public int anInt1860;
	public static Class191 aClass191_1861;
	public static Class191 aClass191_1862;
	public static Class191 aClass191_1863 = new Class191(6, 0, 3, Class86.aClass86_717);
	public static Class191 aClass191_1864;
	public static Class191 aClass191_1865;
	public static Class191 aClass191_1866;
	Class86 aClass86_1867;
	static Class191 aClass191_1868;
	static Class191 aClass191_1869;
	static Class191 aClass191_1870;
	static Class191 aClass191_1871;
	public static Class191 aClass191_1872 = new Class191(8, 1, 3, Class86.aClass86_717);
	static int anInt1873 = 16;
	static int anInt1874;
	int anInt1875;
	public int anInt1876;
	int anInt1877;
	static Class191 aClass191_1878;

	Class191(int i, int i_0_, int i_1_, Class86 class86) {
		anInt1860 = i;
		((Class191) this).anInt1875 = i_0_;
		((Class191) this).anInt1877 = i_1_;
		((Class191) this).aClass86_1867 = class86;
		anInt1876 = (((Class191) this).anInt1877 * (((Class191) this).aClass86_1867.anInt724 * -1615628035));
		if (((Class191) this).anInt1875 >= 16)
			throw new RuntimeException();
	}

	static Class191 method2098(int i) {
		switch (i) {
		case 1:
			return aClass191_1872;
		case 6:
			return aClass191_1866;
		case 2:
			return aClass191_1862;
		case 5:
			return aClass191_1865;
		case 0:
			return aClass191_1863;
		case 3:
			return aClass191_1861;
		case 4:
			return aClass191_1864;
		default:
			return null;
		}
	}

	static {
		aClass191_1862 = new Class191(1, 2, 4, Class86.aClass86_714);
		aClass191_1861 = new Class191(7, 3, 1, Class86.aClass86_717);
		aClass191_1864 = new Class191(3, 4, 2, Class86.aClass86_717);
		aClass191_1865 = new Class191(0, 5, 3, Class86.aClass86_717);
		aClass191_1866 = new Class191(5, 6, 4, Class86.aClass86_717);
		aClass191_1878 = new Class191(11, 7, 4, Class86.aClass86_717);
		aClass191_1868 = new Class191(10, 8, 4, Class86.aClass86_717);
		aClass191_1869 = new Class191(2, 9, 4, Class86.aClass86_717);
		aClass191_1870 = new Class191(4, 10, 3, Class86.aClass86_717);
		aClass191_1871 = new Class191(9, 11, 3, Class86.aClass86_717);
		anInt1874 = Class64.method779(16, -1003506360);
	}
}
