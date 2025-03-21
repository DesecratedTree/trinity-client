/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class160 {
	static final boolean method1878(int i, int i_0_) {
		return (i & 0x21) != 0;
	}

	static final boolean method1879(int i, int i_1_) {
		return (i & 0x22) != 0;
	}

	static final boolean method1880(int i, int i_2_) {
		return (i & 0x34) != 0;
	}

	static final boolean method1881(int i, int i_3_) {
		return (i & 0x37) != 0;
	}

	static final boolean method1882(int i, int i_4_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method1883(int i, int i_5_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method1884(int i, int i_6_) {
		return (i & 0x100) != 0;
	}

	static final boolean method1885(int i, int i_7_) {
		boolean bool = (i_7_ & 0x37) != 0 ? method1893(i, i_7_) : method1908(i, i_7_);
		return (i & 0x10000) != 0 | method1882(i, i_7_) | bool;
	}

	Class160() throws Throwable {
		throw new Error();
	}

	static final boolean method1886(int i, int i_8_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method1887(int i, int i_9_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method1888(int i, int i_10_) {
		return (i & 0x800) != 0 && (i_10_ & 0x37) != 0;
	}

	static final boolean method1889(int i, int i_11_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1890(int i, int i_12_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1891(int i, int i_13_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1892(int i, int i_14_) {
		return ((method1878(i, i_14_) | method1879(i, i_14_) | method1880(i, i_14_)) & method1899(i, i_14_));
	}

	static final boolean method1893(int i, int i_15_) {
		return method1888(i, i_15_) & ((i & 0x2000) != 0 | method1882(i, i_15_) | method1887(i, i_15_));
	}

	static final boolean method1894(int i, int i_16_) {
		return method1906(i, i_16_) & method1890(i, i_16_);
	}

	static final boolean method1895(int i, int i_17_) {
		return method1910(i, i_17_) & method1891(i, i_17_);
	}

	static final boolean method1896(int i, int i_18_) {
		return ((i & 0x70000) != 0 || method1878(i, i_18_) || method1892(i, i_18_));
	}

	static final boolean method1897(int i, int i_19_) {
		return ((i & 0x70000) != 0 || method1879(i, i_19_) || method1892(i, i_19_));
	}

	static final boolean method1898(int i, int i_20_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method1899(int i, int i_21_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1900(int i, int i_22_) {
		return ((i & 0x40000) != 0 | method1884(i, i_22_) || method1908(i, i_22_));
	}

	static final boolean method1901(int i, int i_23_) {
		return method1906(i, i_23_) || method1894(i, i_23_);
	}

	static final boolean method1902(int i, int i_24_) {
		return (i & 0x180) != 0;
	}

	static final boolean method1903(int i, int i_25_) {
		return (i & 0x20) != 0;
	}

	static final boolean method1904(int i, int i_26_) {
		return (i & 0x400) != 0;
	}

	static final boolean method1905(int i, int i_27_) {
		return (i & 0x800) != 0 | method1898(i, i_27_) || method1908(i, i_27_);
	}

	static final boolean method1906(int i, int i_28_) {
		return false;
	}

	static final boolean method1907(int i, int i_29_) {
		return ((i & 0x60000) != 0 | method1910(i, i_29_) || method1895(i, i_29_));
	}

	static final boolean method1908(int i, int i_30_) {
		if (!method1889(i, i_30_))
			return false;
		if ((i & 0x9000) != 0 | method1883(i, i_30_) | method1884(i, i_30_))
			return true;
		return (i_30_ & 0x37) == 0 & ((i & 0x2000) != 0 | method1882(i, i_30_) | method1887(i, i_30_));
	}

	static final boolean method1909(int i, int i_31_) {
		return ((i & 0x70000) != 0 || method1880(i, i_31_) || method1892(i, i_31_));
	}

	static final boolean method1910(int i, int i_32_) {
		return (i & 0x10) != 0;
	}

	static final boolean method1911(int i, int i_33_) {
		return method1883(i, i_33_) || method1908(i, i_33_);
	}
}
