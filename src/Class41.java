/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class41 {
	static final boolean method549(int i, int i_0_) {
		return (i & 0x21) != 0;
	}

	static final boolean method550(int i, int i_1_) {
		return (i & 0x22) != 0;
	}

	static final boolean method551(int i, int i_2_) {
		return (i & 0x34) != 0;
	}

	static final boolean method552(int i, int i_3_) {
		return (i & 0x37) != 0;
	}

	static final boolean method553(int i, int i_4_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method554(int i, int i_5_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method555(int i, int i_6_) {
		return false;
	}

	static final boolean method556(int i, int i_7_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method557(int i, int i_8_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method558(int i, int i_9_) {
		return (i & 0x800) != 0;
	}

	static final boolean method559(int i, int i_10_) {
		return (i & 0x800) != 0;
	}

	static final boolean method560(int i, int i_11_) {
		return (i & 0x800) != 0;
	}

	static final boolean method561(int i, int i_12_) {
		return ((method549(i, i_12_) | method550(i, i_12_) | method551(i, i_12_)) & method573(i, i_12_));
	}

	static final boolean method562(int i, int i_13_) {
		return (i & 0x800) != 0 && (i_13_ & 0x37) != 0;
	}

	static final boolean method563(int i, int i_14_) {
		return (i & 0x70000) != 0 | method549(i, i_14_) || method561(i, i_14_);
	}

	static final boolean method564(int i, int i_15_) {
		return method580(i, i_15_) & method560(i, i_15_);
	}

	static final boolean method565(int i, int i_16_) {
		return (i & 0x70000) != 0 | method550(i, i_16_) || method561(i, i_16_);
	}

	static final boolean method566(int i, int i_17_) {
		return (i & 0x70000) != 0 | method551(i, i_17_) || method561(i, i_17_);
	}

	static final boolean method567(int i, int i_18_) {
		if ((i & 0x10000) != 0 | method553(i, i_18_) || method578(i, i_18_))
			return true;
		return (i_18_ & 0x37) == 0 && method575(i, i_18_);
	}

	static final boolean method568(int i, int i_19_) {
		return method554(i, i_19_) || method575(i, i_19_);
	}

	static final boolean method569(int i, int i_20_) {
		return method555(i, i_20_) || method577(i, i_20_);
	}

	static final boolean method570(int i, int i_21_) {
		return (i & 0x100100) != 0;
	}

	static final boolean method571(int i, int i_22_) {
		return (i & 0x180) != 0;
	}

	static final boolean method572(int i, int i_23_) {
		return ((i & 0x60000) != 0 | method580(i, i_23_) || method575(i, i_23_) || method564(i, i_23_));
	}

	static final boolean method573(int i, int i_24_) {
		return (i & 0x800) != 0;
	}

	static final boolean method574(int i, int i_25_) {
		return (i & 0x400) != 0;
	}

	Class41() throws Throwable {
		throw new Error();
	}

	static final boolean method575(int i, int i_26_) {
		if (!method558(i, i_26_))
			return false;
		if ((i & 0xb000) != 0 | method554(i, i_26_) | method570(i, i_26_))
			return true;
		return ((i_26_ & 0x37) == 0 & (method553(i, i_26_) | method582(i, i_26_)));
	}

	static final boolean method576(int i, int i_27_) {
		return (i & 0x800) != 0 | method556(i, i_27_) || method575(i, i_27_);
	}

	static final boolean method577(int i, int i_28_) {
		return method555(i, i_28_) & method559(i, i_28_);
	}

	static final boolean method578(int i, int i_29_) {
		return (((i & 0x2000) != 0 | method553(i, i_29_) | method582(i, i_29_)) & method562(i, i_29_));
	}

	static final boolean method579(int i, int i_30_) {
		return (i & 0x40000) != 0 | method570(i, i_30_) || method575(i, i_30_);
	}

	static final boolean method580(int i, int i_31_) {
		return (i & 0x10) != 0;
	}

	static final boolean method581(int i, int i_32_) {
		return (i & 0x20) != 0;
	}

	static final boolean method582(int i, int i_33_) {
		return (i & 0x10000) != 0;
	}
}
