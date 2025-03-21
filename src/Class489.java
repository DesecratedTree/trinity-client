/* Class489 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;

public class Class489 {
	long aLong5839;
	static int anInt5840 = 200000000;
	Class490 aClass490_5841;
	long aLong5842;
	int anInt5843;
	byte[] aByteArray5844;
	long aLong5845;
	int anInt5846;
	long aLong5847;
	long aLong5848;
	long aLong5849 = -1836456033195565795L;
	byte[] aByteArray5850;

	public void method6053(byte[] is, int i, int i_0_, int i_1_) throws IOException {
		try {
			do {
				try {
					if (((long) i_0_ + ((Class489) this).aLong5847 * -2439095217875665539L) > ((Class489) this).aLong5848 * 2554419189542343491L)
						((Class489) this).aLong5848 = (((long) i_0_ + (-2439095217875665539L * ((Class489) this).aLong5847)) * 4121314604049420651L);
					if ((-1L != 2296638437513057463L * ((Class489) this).aLong5845) && (((-2439095217875665539L * ((Class489) this).aLong5847) < (((Class489) this).aLong5845 * 2296638437513057463L)) || ((-2439095217875665539L * ((Class489) this).aLong5847) > ((long) (831954171 * ((Class489) this).anInt5846) + (((Class489) this).aLong5845 * 2296638437513057463L)))))
						method6058(-2071072981);
					if ((((Class489) this).aLong5845 * 2296638437513057463L != -1L) && ((-2439095217875665539L * ((Class489) this).aLong5847) + (long) i_0_ > ((long) ((Class489) this).aByteArray5844.length + (2296638437513057463L * ((Class489) this).aLong5845)))) {
						int i_2_ = (int) ((long) (((Class489) this).aByteArray5844).length - ((-2439095217875665539L * ((Class489) this).aLong5847) - (((Class489) this).aLong5845 * 2296638437513057463L)));
						System.arraycopy(is, i, ((Class489) this).aByteArray5844, (int) ((-2439095217875665539L * ((Class489) this).aLong5847) - (2296638437513057463L * (((Class489) this).aLong5845))), i_2_);
						((Class489) this).aLong5847 += (long) i_2_ * -7137420749440195627L;
						i += i_2_;
						i_0_ -= i_2_;
						((Class489) this).anInt5846 = (-655684045 * ((Class489) this).aByteArray5844.length);
						method6058(-2085612550);
					}
					if (i_0_ > ((Class489) this).aByteArray5844.length) {
						if (2427296405366063677L * ((Class489) this).aLong5839 != (((Class489) this).aLong5847 * -2439095217875665539L)) {
							((Class489) this).aClass490_5841.method6065(((Class489) this).aLong5847 * -2439095217875665539L);
							((Class489) this).aLong5839 = (6284359785425624129L * ((Class489) this).aLong5847);
						}
						((Class489) this).aClass490_5841.method6068(is, i, i_0_, -1154489731);
						((Class489) this).aLong5839 += -2558839114724154091L * (long) i_0_;
						if (2427296405366063677L * ((Class489) this).aLong5839 > (((Class489) this).aLong5842 * -480505339313566611L))
							((Class489) this).aLong5842 = (625611406385908497L * ((Class489) this).aLong5839);
						long l = -1L;
						long l_3_ = -1L;
						if (((((Class489) this).aLong5847 * -2439095217875665539L) >= (((Class489) this).aLong5849 * -5491186694213225781L)) && ((((Class489) this).aLong5847 * -2439095217875665539L) < ((long) (((Class489) this).anInt5843 * -1662140281) + (((Class489) this).aLong5849 * -5491186694213225781L))))
							l = (-2439095217875665539L * ((Class489) this).aLong5847);
						else if (((-5491186694213225781L * ((Class489) this).aLong5849) >= (-2439095217875665539L * ((Class489) this).aLong5847)) && ((((Class489) this).aLong5849 * -5491186694213225781L) < ((-2439095217875665539L * ((Class489) this).aLong5847) + (long) i_0_)))
							l = (((Class489) this).aLong5849 * -5491186694213225781L);
						if (((((Class489) this).aLong5847 * -2439095217875665539L) + (long) i_0_ > (((Class489) this).aLong5849 * -5491186694213225781L)) && ((long) i_0_ + (-2439095217875665539L * ((Class489) this).aLong5847) <= ((long) (((Class489) this).anInt5843 * -1662140281) + (-5491186694213225781L * ((Class489) this).aLong5849))))
							l_3_ = ((long) i_0_ + (-2439095217875665539L * ((Class489) this).aLong5847));
						else if ((((((Class489) this).aLong5849 * -5491186694213225781L) + (long) (((Class489) this).anInt5843 * -1662140281)) > (((Class489) this).aLong5847 * -2439095217875665539L)) && (((-5491186694213225781L * ((Class489) this).aLong5849) + (long) (((Class489) this).anInt5843 * -1662140281)) <= ((long) i_0_ + (-2439095217875665539L * ((Class489) this).aLong5847))))
							l_3_ = ((-5491186694213225781L * ((Class489) this).aLong5849) + (long) (-1662140281 * ((Class489) this).anInt5843));
						if (l > -1L && l_3_ > l) {
							int i_4_ = (int) (l_3_ - l);
							System.arraycopy(is, (int) ((long) i + l - (-2439095217875665539L * ((Class489) this).aLong5847)), ((Class489) this).aByteArray5850, (int) (l - (((Class489) this).aLong5849 * -5491186694213225781L)), i_4_);
						}
						((Class489) this).aLong5847 += -7137420749440195627L * (long) i_0_;
					} else {
						if (i_0_ <= 0)
							break;
						if (-1L == (((Class489) this).aLong5845 * 2296638437513057463L))
							((Class489) this).aLong5845 = (((Class489) this).aLong5847 * -5897227645339610261L);
						System.arraycopy(is, i, ((Class489) this).aByteArray5844, (int) ((((Class489) this).aLong5847 * -2439095217875665539L) - (((Class489) this).aLong5845 * 2296638437513057463L)), i_0_);
						((Class489) this).aLong5847 += (long) i_0_ * -7137420749440195627L;
						if (((((Class489) this).aLong5847 * -2439095217875665539L) - (((Class489) this).aLong5845 * 2296638437513057463L)) > (long) (831954171 * ((Class489) this).anInt5846))
							((Class489) this).anInt5846 = ((int) ((((Class489) this).aLong5847 * -2439095217875665539L) - (((Class489) this).aLong5845 * 2296638437513057463L)) * -655684045);
					}
				} catch (IOException ioexception) {
					((Class489) this).aLong5839 = 2558839114724154091L;
					throw ioexception;
				}
				break;
			} while (false);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uf.f(").append(')').toString());
		}
	}

	public void method6054(int i) throws IOException {
		try {
			method6058(-2102590674);
			((Class489) this).aClass490_5841.method6064(-148524324);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uf.r(").append(')').toString());
		}
	}

	public void method6055(long l) throws IOException {
		try {
			if (l < 0L)
				throw new IOException();
			((Class489) this).aLong5847 = l * -7137420749440195627L;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uf.j(").append(')').toString());
		}
	}

	public long method6056(int i) {
		try {
			return ((Class489) this).aLong5848 * 2554419189542343491L;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uf.i(").append(')').toString());
		}
	}

	public void method6057(byte[] is, int i, int i_5_, byte i_6_) throws IOException {
		try {
			try {
				if (i_5_ + i > is.length)
					throw new ArrayIndexOutOfBoundsException(i + i_5_ - is.length);
				if (2296638437513057463L * ((Class489) this).aLong5845 != -1L && (-2439095217875665539L * ((Class489) this).aLong5847 >= ((Class489) this).aLong5845 * 2296638437513057463L) && ((((Class489) this).aLong5847 * -2439095217875665539L + (long) i_5_) <= ((long) (831954171 * ((Class489) this).anInt5846) + (2296638437513057463L * ((Class489) this).aLong5845)))) {
					System.arraycopy(((Class489) this).aByteArray5844, (int) ((-2439095217875665539L * ((Class489) this).aLong5847) - (2296638437513057463L * ((Class489) this).aLong5845)), is, i, i_5_);
					((Class489) this).aLong5847 += (long) i_5_ * -7137420749440195627L;
					return;
				}
				long l = ((Class489) this).aLong5847 * -2439095217875665539L;
				int i_7_ = i;
				int i_8_ = i_5_;
				if ((((Class489) this).aLong5847 * -2439095217875665539L >= -5491186694213225781L * ((Class489) this).aLong5849) && (-2439095217875665539L * ((Class489) this).aLong5847 < (-5491186694213225781L * ((Class489) this).aLong5849 + (long) (((Class489) this).anInt5843 * -1662140281)))) {
					int i_9_ = (int) ((long) (-1662140281 * ((Class489) this).anInt5843) - ((-2439095217875665539L * ((Class489) this).aLong5847) - (((Class489) this).aLong5849 * -5491186694213225781L)));
					if (i_9_ > i_5_)
						i_9_ = i_5_;
					System.arraycopy(((Class489) this).aByteArray5850, (int) ((((Class489) this).aLong5847 * -2439095217875665539L) - (-5491186694213225781L * ((Class489) this).aLong5849)), is, i, i_9_);
					((Class489) this).aLong5847 += -7137420749440195627L * (long) i_9_;
					i += i_9_;
					i_5_ -= i_9_;
				}
				if (i_5_ > ((Class489) this).aByteArray5850.length) {
					((Class489) this).aClass490_5841.method6065(((Class489) this).aLong5847 * -2439095217875665539L);
					((Class489) this).aLong5839 = ((Class489) this).aLong5847 * 6284359785425624129L;
					int i_10_;
					for (/**/; i_5_ > 0; i_5_ -= i_10_) {
						i_10_ = ((Class489) this).aClass490_5841.method6067(is, i, i_5_, (byte) 58);
						if (-1 == i_10_) {
							if (i_6_ == 0)
								break;
							return;
						}
						((Class489) this).aLong5839 += -2558839114724154091L * (long) i_10_;
						((Class489) this).aLong5847 += -7137420749440195627L * (long) i_10_;
						i += i_10_;
					}
				} else if (i_5_ > 0) {
					method6059((byte) -82);
					int i_11_ = i_5_;
					if (i_11_ > ((Class489) this).anInt5843 * -1662140281)
						i_11_ = ((Class489) this).anInt5843 * -1662140281;
					System.arraycopy(((Class489) this).aByteArray5850, 0, is, i, i_11_);
					i += i_11_;
					i_5_ -= i_11_;
					((Class489) this).aLong5847 += -7137420749440195627L * (long) i_11_;
				}
				if (((Class489) this).aLong5845 * 2296638437513057463L != -1L) {
					if ((2296638437513057463L * ((Class489) this).aLong5845 > -2439095217875665539L * ((Class489) this).aLong5847) && i_5_ > 0) {
						int i_12_ = i + (int) ((((Class489) this).aLong5845 * 2296638437513057463L) - (((Class489) this).aLong5847 * -2439095217875665539L));
						if (i_12_ > i_5_ + i)
							i_12_ = i_5_ + i;
						while (i < i_12_) {
							is[i++] = (byte) 0;
							i_5_--;
							((Class489) this).aLong5847 += -7137420749440195627L;
						}
					}
					long l_13_ = -1L;
					long l_14_ = -1L;
					if (2296638437513057463L * ((Class489) this).aLong5845 >= l && (((Class489) this).aLong5845 * 2296638437513057463L < (long) i_8_ + l))
						l_13_ = (((Class489) this).aLong5845 * 2296638437513057463L);
					else if (l >= (2296638437513057463L * ((Class489) this).aLong5845) && l < ((((Class489) this).aLong5845 * 2296638437513057463L) + (long) (((Class489) this).anInt5846 * 831954171)))
						l_13_ = l;
					if (((((Class489) this).aLong5845 * 2296638437513057463L + (long) (((Class489) this).anInt5846 * 831954171)) > l) && (((long) (831954171 * ((Class489) this).anInt5846) + (2296638437513057463L * ((Class489) this).aLong5845)) <= (long) i_8_ + l))
						l_14_ = ((long) (831954171 * ((Class489) this).anInt5846) + (2296638437513057463L * ((Class489) this).aLong5845));
					else if (l + (long) i_8_ > (2296638437513057463L * ((Class489) this).aLong5845) && ((long) i_8_ + l <= ((long) (((Class489) this).anInt5846 * 831954171) + (2296638437513057463L * ((Class489) this).aLong5845))))
						l_14_ = (long) i_8_ + l;
					if (l_13_ > -1L && l_14_ > l_13_) {
						int i_15_ = (int) (l_14_ - l_13_);
						System.arraycopy(((Class489) this).aByteArray5844, (int) (l_13_ - (((Class489) this).aLong5845 * 2296638437513057463L)), is, i_7_ + (int) (l_13_ - l), i_15_);
						if (l_14_ > (-2439095217875665539L * ((Class489) this).aLong5847)) {
							i_5_ -= l_14_ - (((Class489) this).aLong5847 * -2439095217875665539L);
							((Class489) this).aLong5847 = -7137420749440195627L * l_14_;
						}
					}
				}
			} catch (IOException ioexception) {
				((Class489) this).aLong5839 = 2558839114724154091L;
				throw ioexception;
			}
			if (i_5_ > 0)
				throw new EOFException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uf.o(").append(')').toString());
		}
	}

	void method6058(int i) throws IOException {
		try {
			if (-1L != 2296638437513057463L * ((Class489) this).aLong5845) {
				if (2427296405366063677L * ((Class489) this).aLong5839 != ((Class489) this).aLong5845 * 2296638437513057463L) {
					((Class489) this).aClass490_5841.method6065(((Class489) this).aLong5845 * 2296638437513057463L);
					((Class489) this).aLong5839 = ((Class489) this).aLong5845 * -5049896360361941501L;
				}
				((Class489) this).aClass490_5841.method6068(((Class489) this).aByteArray5844, 0, ((Class489) this).anInt5846 * 831954171, -1154489731);
				((Class489) this).aLong5839 += ((long) ((Class489) this).anInt5846 * -3786663182595627113L);
				if (((Class489) this).aLong5839 * 2427296405366063677L > -480505339313566611L * ((Class489) this).aLong5842)
					((Class489) this).aLong5842 = ((Class489) this).aLong5839 * 625611406385908497L;
				long l = -1L;
				long l_16_ = -1L;
				if ((2296638437513057463L * ((Class489) this).aLong5845 >= -5491186694213225781L * ((Class489) this).aLong5849) && (((Class489) this).aLong5845 * 2296638437513057463L < ((long) (-1662140281 * ((Class489) this).anInt5843) + (((Class489) this).aLong5849 * -5491186694213225781L))))
					l = ((Class489) this).aLong5845 * 2296638437513057463L;
				else if ((((Class489) this).aLong5849 * -5491186694213225781L >= (((Class489) this).aLong5845 * 2296638437513057463L)) && ((((Class489) this).aLong5849 * -5491186694213225781L) < ((2296638437513057463L * ((Class489) this).aLong5845) + (long) (((Class489) this).anInt5846 * 831954171))))
					l = -5491186694213225781L * ((Class489) this).aLong5849;
				if (((2296638437513057463L * ((Class489) this).aLong5845 + (long) (831954171 * ((Class489) this).anInt5846)) > ((Class489) this).aLong5849 * -5491186694213225781L) && ((((Class489) this).aLong5845 * 2296638437513057463L + (long) (831954171 * ((Class489) this).anInt5846)) <= ((long) (-1662140281 * ((Class489) this).anInt5843) + (((Class489) this).aLong5849 * -5491186694213225781L))))
					l_16_ = ((long) (((Class489) this).anInt5846 * 831954171) + (2296638437513057463L * ((Class489) this).aLong5845));
				else if ((((long) (((Class489) this).anInt5843 * -1662140281) + (-5491186694213225781L * ((Class489) this).aLong5849)) > ((Class489) this).aLong5845 * 2296638437513057463L) && (((-5491186694213225781L * ((Class489) this).aLong5849) + (long) (((Class489) this).anInt5843 * -1662140281)) <= ((((Class489) this).aLong5845 * 2296638437513057463L) + (long) (((Class489) this).anInt5846 * 831954171))))
					l_16_ = (-5491186694213225781L * ((Class489) this).aLong5849 + (long) (-1662140281 * ((Class489) this).anInt5843));
				if (l > -1L && l_16_ > l) {
					int i_17_ = (int) (l_16_ - l);
					System.arraycopy(((Class489) this).aByteArray5844, (int) (l - (((Class489) this).aLong5845 * 2296638437513057463L)), ((Class489) this).aByteArray5850, (int) (l - (((Class489) this).aLong5849 * -5491186694213225781L)), i_17_);
				}
				((Class489) this).aLong5845 = 2504659363584685817L;
				((Class489) this).anInt5846 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uf.z(").append(')').toString());
		}
	}

	void method6059(byte i) throws IOException {
		try {
			((Class489) this).anInt5843 = 0;
			if (-2439095217875665539L * ((Class489) this).aLong5847 != 2427296405366063677L * ((Class489) this).aLong5839) {
				((Class489) this).aClass490_5841.method6065(((Class489) this).aLong5847 * -2439095217875665539L);
				((Class489) this).aLong5839 = ((Class489) this).aLong5847 * 6284359785425624129L;
			}
			((Class489) this).aLong5849 = ((Class489) this).aLong5847 * -1896005018480992297L;
			int i_18_;
			for (/**/; (((Class489) this).anInt5843 * -1662140281 < ((Class489) this).aByteArray5850.length); ((Class489) this).anInt5843 += 298779959 * i_18_) {
				int i_19_ = (((Class489) this).aByteArray5850.length - -1662140281 * ((Class489) this).anInt5843);
				if (i_19_ > 200000000)
					i_19_ = 200000000;
				i_18_ = (((Class489) this).aClass490_5841.method6067(((Class489) this).aByteArray5850, -1662140281 * ((Class489) this).anInt5843, i_19_, (byte) 8));
				if (i_18_ == -1) {
					if (i >= -1) {
						/* empty */
					}
					break;
				}
				((Class489) this).aLong5839 += -2558839114724154091L * (long) i_18_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uf.s(").append(')').toString());
		}
	}

	public void method6060(byte[] is, short i) throws IOException {
		try {
			method6057(is, 0, is.length, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uf.p(").append(')').toString());
		}
	}

	public Class489(Class490 class490, int i, int i_20_) throws IOException {
		((Class489) this).aLong5845 = 2504659363584685817L;
		((Class489) this).anInt5846 = 0;
		((Class489) this).aClass490_5841 = class490;
		((Class489) this).aLong5848 = ((((Class489) this).aLong5842 = class490.method6066(1742373643) * 7249499188047551845L) * -7744861864551649649L);
		((Class489) this).aByteArray5850 = new byte[i];
		((Class489) this).aByteArray5844 = new byte[i_20_];
		((Class489) this).aLong5847 = 0L;
	}

	static final void method6061(Class430 class430, int i) {
		try {
			int i_21_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_21_, 850500310);
			Class120 class120 = Class3.aClass120Array56[i_21_ >> 16];
			Class100.method1208(iComponentDefinitions, class120, class430, 423212371);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uf.mn(").append(')').toString());
		}
	}

	static final void method6062(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class464_Sub23.aClass350_8712.method4030(34823472);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uf.vq(").append(')').toString());
		}
	}

	public static Interface33 method6063(int i) {
		try {
			if (Class544.anInterface33_6256 == null)
				throw new IllegalStateException("");
			return Class544.anInterface33_6256;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uf.j(").append(')').toString());
		}
	}
}
