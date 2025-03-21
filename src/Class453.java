/* Class453 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class453 {
	public static void method5638(byte[] is, int i, byte[] is_0_, int i_1_, int i_2_) {
		if (is == is_0_) {
			if (i == i_1_)
				return;
			if (i_1_ > i && i_1_ < i + i_2_) {
				i_2_--;
				i += i_2_;
				i_1_ += i_2_;
				i_2_ = i - i_2_;
				i_2_ += 7;
				while (i >= i_2_) {
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
				}
				i_2_ -= 7;
				while (i >= i_2_)
					is_0_[i_1_--] = is[i--];
				return;
			}
		}
		i_2_ += i;
		i_2_ -= 7;
		while (i < i_2_) {
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
		}
		i_2_ += 7;
		while (i < i_2_)
			is_0_[i_1_++] = is[i++];
	}

	public static void method5639(long[] ls, int i, long[] ls_3_, int i_4_, int i_5_) {
		if (ls == ls_3_) {
			if (i == i_4_)
				return;
			if (i_4_ > i && i_4_ < i + i_5_) {
				i_5_--;
				i += i_5_;
				i_4_ += i_5_;
				i_5_ = i - i_5_;
				i_5_ += 3;
				while (i >= i_5_) {
					ls_3_[i_4_--] = ls[i--];
					ls_3_[i_4_--] = ls[i--];
					ls_3_[i_4_--] = ls[i--];
					ls_3_[i_4_--] = ls[i--];
				}
				i_5_ -= 3;
				while (i >= i_5_)
					ls_3_[i_4_--] = ls[i--];
				return;
			}
		}
		i_5_ += i;
		i_5_ -= 3;
		while (i < i_5_) {
			ls_3_[i_4_++] = ls[i++];
			ls_3_[i_4_++] = ls[i++];
			ls_3_[i_4_++] = ls[i++];
			ls_3_[i_4_++] = ls[i++];
		}
		i_5_ += 3;
		while (i < i_5_)
			ls_3_[i_4_++] = ls[i++];
	}

	public static void method5640(float[] fs, int i, float[] fs_6_, int i_7_, int i_8_) {
		if (fs == fs_6_) {
			if (i == i_7_)
				return;
			if (i_7_ > i && i_7_ < i + i_8_) {
				i_8_--;
				i += i_8_;
				i_7_ += i_8_;
				i_8_ = i - i_8_;
				i_8_ += 7;
				while (i >= i_8_) {
					fs_6_[i_7_--] = fs[i--];
					fs_6_[i_7_--] = fs[i--];
					fs_6_[i_7_--] = fs[i--];
					fs_6_[i_7_--] = fs[i--];
					fs_6_[i_7_--] = fs[i--];
					fs_6_[i_7_--] = fs[i--];
					fs_6_[i_7_--] = fs[i--];
					fs_6_[i_7_--] = fs[i--];
				}
				i_8_ -= 7;
				while (i >= i_8_)
					fs_6_[i_7_--] = fs[i--];
				return;
			}
		}
		i_8_ += i;
		i_8_ -= 7;
		while (i < i_8_) {
			fs_6_[i_7_++] = fs[i++];
			fs_6_[i_7_++] = fs[i++];
			fs_6_[i_7_++] = fs[i++];
			fs_6_[i_7_++] = fs[i++];
			fs_6_[i_7_++] = fs[i++];
			fs_6_[i_7_++] = fs[i++];
			fs_6_[i_7_++] = fs[i++];
			fs_6_[i_7_++] = fs[i++];
		}
		i_8_ += 7;
		while (i < i_8_)
			fs_6_[i_7_++] = fs[i++];
	}

	public static void method5641(Object[] objects, int i, Object[] objects_9_, int i_10_, int i_11_) {
		if (objects == objects_9_) {
			if (i == i_10_)
				return;
			if (i_10_ > i && i_10_ < i + i_11_) {
				i_11_--;
				i += i_11_;
				i_10_ += i_11_;
				i_11_ = i - i_11_;
				i_11_ += 7;
				while (i >= i_11_) {
					objects_9_[i_10_--] = objects[i--];
					objects_9_[i_10_--] = objects[i--];
					objects_9_[i_10_--] = objects[i--];
					objects_9_[i_10_--] = objects[i--];
					objects_9_[i_10_--] = objects[i--];
					objects_9_[i_10_--] = objects[i--];
					objects_9_[i_10_--] = objects[i--];
					objects_9_[i_10_--] = objects[i--];
				}
				i_11_ -= 7;
				while (i >= i_11_)
					objects_9_[i_10_--] = objects[i--];
				return;
			}
		}
		i_11_ += i;
		i_11_ -= 7;
		while (i < i_11_) {
			objects_9_[i_10_++] = objects[i++];
			objects_9_[i_10_++] = objects[i++];
			objects_9_[i_10_++] = objects[i++];
			objects_9_[i_10_++] = objects[i++];
			objects_9_[i_10_++] = objects[i++];
			objects_9_[i_10_++] = objects[i++];
			objects_9_[i_10_++] = objects[i++];
			objects_9_[i_10_++] = objects[i++];
		}
		i_11_ += 7;
		while (i < i_11_)
			objects_9_[i_10_++] = objects[i++];
	}

	public static void method5642(int[] is, int i, int[] is_12_, int i_13_, int i_14_) {
		if (is == is_12_) {
			if (i == i_13_)
				return;
			if (i_13_ > i && i_13_ < i + i_14_) {
				i_14_--;
				i += i_14_;
				i_13_ += i_14_;
				i_14_ = i - i_14_;
				i_14_ += 7;
				while (i >= i_14_) {
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
				}
				i_14_ -= 7;
				while (i >= i_14_)
					is_12_[i_13_--] = is[i--];
				return;
			}
		}
		i_14_ += i;
		i_14_ -= 7;
		while (i < i_14_) {
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
		}
		i_14_ += 7;
		while (i < i_14_)
			is_12_[i_13_++] = is[i++];
	}

	Class453() throws Throwable {
		throw new Error();
	}

	public static void method5643(int[] is, int i, int i_15_, int i_16_) {
		i_15_ = i + i_15_ - 7;
		while (i < i_15_) {
			is[i++] = i_16_;
			is[i++] = i_16_;
			is[i++] = i_16_;
			is[i++] = i_16_;
			is[i++] = i_16_;
			is[i++] = i_16_;
			is[i++] = i_16_;
			is[i++] = i_16_;
		}
		i_15_ += 7;
		while (i < i_15_)
			is[i++] = i_16_;
	}
}
