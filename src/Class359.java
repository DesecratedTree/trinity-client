/* Class359 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class Class359 implements Runnable {
	int anInt3736;
	byte[] aByteArray3737;
	InputStream anInputStream3738;
	int anInt3739 = 0;
	Thread aThread3740;
	int anInt3741 = 0;
	IOException anIOException3742;

	Class359(InputStream inputstream, int i) {
		((Class359) this).anInputStream3738 = inputstream;
		((Class359) this).anInt3736 = -752141141 * (i + 1);
		((Class359) this).aByteArray3737 = new byte[((Class359) this).anInt3736 * 329702915];
		((Class359) this).aThread3740 = new Thread(this);
		((Class359) this).aThread3740.setDaemon(true);
		((Class359) this).aThread3740.start();
	}

	int method4232(byte i) throws IOException {
		try {
			synchronized (this) {
				int i_0_;
				if (-573054167 * ((Class359) this).anInt3739 <= 504491459 * ((Class359) this).anInt3741)
					i_0_ = (504491459 * ((Class359) this).anInt3741 - ((Class359) this).anInt3739 * -573054167);
				else
					i_0_ = (504491459 * ((Class359) this).anInt3741 + (((Class359) this).anInt3736 * 329702915 - -573054167 * ((Class359) this).anInt3739));
				if (null != ((Class359) this).anIOException3742)
					throw new IOException(((Class359) this).anIOException3742.toString());
				this.notifyAll();
				int i_1_ = i_0_;
				return i_1_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oz.j(").append(')').toString());
		}
	}

	public void run() {
		try {
			for (;;) {
				int i;
				synchronized (this) {
					for (;;) {
						if (null != ((Class359) this).anIOException3742)
							return;
						if (((Class359) this).anInt3739 * -573054167 == 0)
							i = (((Class359) this).anInt3736 * 329702915 - ((Class359) this).anInt3741 * 504491459 - 1);
						else if (-573054167 * ((Class359) this).anInt3739 <= ((Class359) this).anInt3741 * 504491459)
							i = (329702915 * ((Class359) this).anInt3736 - 504491459 * ((Class359) this).anInt3741);
						else
							i = (((Class359) this).anInt3739 * -573054167 - ((Class359) this).anInt3741 * 504491459 - 1);
						if (i > 0)
							break;
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				int i_2_;
				try {
					i_2_ = (((Class359) this).anInputStream3738.read(((Class359) this).aByteArray3737, 504491459 * ((Class359) this).anInt3741, i));
					if (i_2_ == -1)
						throw new EOFException();
				} catch (IOException ioexception) {
					synchronized (this) {
						((Class359) this).anIOException3742 = ioexception;
						break;
					}
				}
				synchronized (this) {
					((Class359) this).anInt3741 = ((504491459 * ((Class359) this).anInt3741 + i_2_) % (((Class359) this).anInt3736 * 329702915) * -1727501589);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oz.run(").append(')').toString());
		}
	}

	void method4233(int i) {
		try {
			((Class359) this).anInputStream3738 = new InputStream_Sub1();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oz.o(").append(')').toString());
		}
	}

	void method4234(int i) {
		try {
			synchronized (this) {
				if (null == ((Class359) this).anIOException3742)
					((Class359) this).anIOException3742 = new IOException("");
				this.notifyAll();
			}
			try {
				((Class359) this).aThread3740.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oz.p(").append(')').toString());
		}
	}

	boolean method4235(int i, int i_3_) throws IOException {
		try {
			if (i <= 0 || i >= ((Class359) this).anInt3736 * 329702915)
				throw new IOException();
			synchronized (this) {
				int i_4_;
				if (-573054167 * ((Class359) this).anInt3739 <= 504491459 * ((Class359) this).anInt3741)
					i_4_ = (504491459 * ((Class359) this).anInt3741 - -573054167 * ((Class359) this).anInt3739);
				else
					i_4_ = (329702915 * ((Class359) this).anInt3736 - ((Class359) this).anInt3739 * -573054167 + 504491459 * ((Class359) this).anInt3741);
				if (i_4_ < i) {
					if (null != ((Class359) this).anIOException3742)
						throw new IOException(((Class359) this).anIOException3742.toString());
					this.notifyAll();
					boolean bool = false;
					return bool;
				}
				boolean bool = true;
				return bool;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oz.r(").append(')').toString());
		}
	}

	int method4236(byte[] is, int i, int i_5_, int i_6_) throws IOException {
		try {
			if (i_5_ < 0 || i < 0 || i + i_5_ > is.length)
				throw new IOException();
			synchronized (this) {
				int i_7_;
				if (((Class359) this).anInt3739 * -573054167 <= ((Class359) this).anInt3741 * 504491459)
					i_7_ = (504491459 * ((Class359) this).anInt3741 - ((Class359) this).anInt3739 * -573054167);
				else
					i_7_ = (329702915 * ((Class359) this).anInt3736 - -573054167 * ((Class359) this).anInt3739 + ((Class359) this).anInt3741 * 504491459);
				if (i_5_ > i_7_)
					i_5_ = i_7_;
				if (0 == i_5_ && ((Class359) this).anIOException3742 != null)
					throw new IOException(((Class359) this).anIOException3742.toString());
				if (-573054167 * ((Class359) this).anInt3739 + i_5_ <= 329702915 * ((Class359) this).anInt3736)
					System.arraycopy(((Class359) this).aByteArray3737, ((Class359) this).anInt3739 * -573054167, is, i, i_5_);
				else {
					int i_8_ = (329702915 * ((Class359) this).anInt3736 - ((Class359) this).anInt3739 * -573054167);
					System.arraycopy(((Class359) this).aByteArray3737, -573054167 * ((Class359) this).anInt3739, is, i, i_8_);
					System.arraycopy(((Class359) this).aByteArray3737, 0, is, i_8_ + i, i_5_ - i_8_);
				}
				((Class359) this).anInt3739 = (178743577 * ((i_5_ + -573054167 * ((Class359) this).anInt3739) % (((Class359) this).anInt3736 * 329702915)));
				this.notifyAll();
				int i_9_ = i_5_;
				return i_9_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oz.i(").append(')').toString());
		}
	}

	static final void method4237(Class430 class430, int i) {
		try {
			int i_10_ = (((Class430) class430).anIntArray4394[((Class430) class430).anInt4397 * -54918871]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = ((Player) ((Class430) class430).aClass432_Sub1_Sub1_Sub1_4396).aClass65_10249.method780(i_10_, (byte) 40);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oz.al(").append(')').toString());
		}
	}

	static final void method4238(byte i) {
		try {
			Class330_Sub46_Sub2 class330_sub46_sub2 = ((Class1) client.aClass1_9025).aClass330_Sub46_Sub2_17;
			class330_sub46_sub2.method3820(1283857115);
			int i_11_ = class330_sub46_sub2.readBits(8);
			if (i_11_ < -823688441 * client.anInt9017) {
				for (int i_12_ = i_11_; i_12_ < client.anInt9017 * -823688441; i_12_++)
					client.anIntArray9021[(client.anInt9022 += -78342409) * 1143933639 - 1] = client.anIntArray9018[i_12_];
			}
			if (i_11_ > -823688441 * client.anInt9017)
				throw new RuntimeException();
			client.anInt9017 = 0;
			for (int i_13_ = 0; i_13_ < i_11_; i_13_++) {
				int i_14_ = client.anIntArray9018[i_13_];
				NPC class432_sub1_sub1_sub1_sub2 = ((NPC) (((Class330_Sub35) client.aClass497_9014.method6094((long) i_14_)).anObject7733));
				int requiredType = class330_sub46_sub2.readBits(1);
				if (requiredType == 0) {//no update
					client.anIntArray9018[(client.anInt9017 += -948929865) * -823688441 - 1] = i_14_;
					class432_sub1_sub1_sub1_sub2.anInt10069 = client.anInt8996 * -1342092209;
				} else {
					int updateType = class330_sub46_sub2.readBits(2);
					if (updateType == 0) {//update requested
						client.anIntArray9018[(client.anInt9017 += -948929865) * -823688441 - 1] = i_14_;
						class432_sub1_sub1_sub1_sub2.anInt10069 = -1342092209 * client.anInt8996;
						client.anIntArray9020[(client.anInt9019 += 808038027) * -351876829 - 1] = i_14_;
					} else if (updateType == 1) {//walk
						client.anIntArray9018[(client.anInt9017 += -948929865) * -823688441 - 1] = i_14_;
						class432_sub1_sub1_sub1_sub2.anInt10069 = -1342092209 * client.anInt8996;
						Class293 class293 = ((Class293) (Class479.method6015(Class476.method5962(-2003654600), class330_sub46_sub2.readBits(3), (byte) 17)));
						class432_sub1_sub1_sub1_sub2.method5477(class293, Class299.aClass299_6807.aByte6805, (byte) -32);
						int i_17_ = class330_sub46_sub2.readBits(1);
						if (i_17_ == 1)
							client.anIntArray9020[((client.anInt9019 += 808038027) * -351876829 - 1)] = i_14_;
					} else if (2 == updateType) {//run
						client.anIntArray9018[(client.anInt9017 += -948929865) * -823688441 - 1] = i_14_;
						class432_sub1_sub1_sub1_sub2.anInt10069 = client.anInt8996 * -1342092209;
						if (class330_sub46_sub2.readBits(1) == 1) {
							Class293 class293 = ((Class293) (Class479.method6015(Class476.method5962(-1628524193), class330_sub46_sub2.readBits(3), (byte) 0)));
							class432_sub1_sub1_sub1_sub2.method5477(class293, Class299.aClass299_6808.aByte6805, (byte) -111);
							Class293 class293_18_ = ((Class293) (Class479.method6015(Class476.method5962(-2100325618), class330_sub46_sub2.readBits(3), (byte) 2)));
							class432_sub1_sub1_sub1_sub2.method5477(class293_18_, Class299.aClass299_6808.aByte6805, (byte) -73);
						} else {
							Class293 class293 = ((Class293) (Class479.method6015(Class476.method5962(-312582088), class330_sub46_sub2.readBits(3), (byte) 110)));
							class432_sub1_sub1_sub1_sub2.method5477(class293, Class299.aClass299_6806.aByte6805, (byte) -27);
						}
						int i_19_ = class330_sub46_sub2.readBits(1);
						if (i_19_ == 1)
							client.anIntArray9020[((client.anInt9019 += 808038027) * -351876829 - 1)] = i_14_;
					} else if (updateType == 3)
						client.anIntArray9021[(client.anInt9022 += -78342409) * 1143933639 - 1] = i_14_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oz.kp(").append(')').toString());
		}
	}

	static Class524 method4239(byte i) {
		try {
			Class524 class524;
			if (Class484.aBoolean5807) {
				if (Class483.aClass263_5775 != null && Class384.aClass524_3969 != null)
					class524 = Class384.aClass524_3969;
				else
					class524 = Class477_Sub1.aClass524_8749;
			} else
				class524 = Class477_Sub1.aClass524_8749;
			Class484.anInt5779 = (class524.anInt6033 * -1099108829 + 1676341573 * class524.anInt6035);
			return class524;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oz.b(").append(')').toString());
		}
	}

	static char method4240(char c, int i) {
		try {
			if (c == '\u00c6')
				return 'E';
			if (c == '\u00e6')
				return 'e';
			if (c == '\u00df')
				return 's';
			if ('\u0152' == c)
				return 'E';
			if ('\u0153' == c)
				return 'e';
			return '\0';
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oz.i(").append(')').toString());
		}
	}
}
