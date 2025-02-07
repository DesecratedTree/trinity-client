

public final class Class467 {
	Class467() throws Throwable {
		throw new Error();
	}

	static final void method6023(int i) {
		try {
			RsBitsBuffer class298_sub53_sub2 = ((Class25) client.aClass25_8711).aClass298_Sub53_Sub2_333;
			class298_sub53_sub2.initBitAccess(1157167964);
			int i_0_ = class298_sub53_sub2.readBits(8);
			if (i_0_ < client.anInt8703 * -1230451913) {
				for (int i_1_ = i_0_; i_1_ < -1230451913 * client.anInt8703; i_1_++)
					client.anIntArray8709[(client.anInt8708 += 107511579) * -1508392173 - 1] = client.anIntArray8699[i_1_];
			}
			if (i_0_ > client.anInt8703 * -1230451913)
				throw new RuntimeException();
			client.anInt8703 = 0;
			for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
				int i_3_ = client.anIntArray8699[i_2_];
				NPC class365_sub1_sub1_sub2_sub1 = ((NPC) (((ObjectValue) client.aClass437_8696.method5812((long) i_3_)).value));
				int i_4_ = class298_sub53_sub2.readBits(1);
				if (i_4_ == 0) {
					client.anIntArray8699[(client.anInt8703 += -409937273) * -1230451913 - 1] = i_3_;
					class365_sub1_sub1_sub2_sub1.anInt10075 = -3704423 * client.anInt8707;
				} else {
					int i_5_ = class298_sub53_sub2.readBits(2);
					if (0 == i_5_) {
						client.anIntArray8699[((client.anInt8703 += -409937273) * -1230451913) - 1] = i_3_;
						class365_sub1_sub1_sub2_sub1.anInt10075 = -3704423 * client.anInt8707;
						client.anIntArray8706[(client.anInt8808 += -386992021) * -976358333 - 1] = i_3_;
					} else if (1 == i_5_) {
						client.anIntArray8699[((client.anInt8703 += -409937273) * -1230451913) - 1] = i_3_;
						class365_sub1_sub1_sub2_sub1.anInt10075 = client.anInt8707 * -3704423;
						Class274 class274 = ((Class274) (Class422_Sub20.method5701(Class299.method3680(-2130206915), class298_sub53_sub2.readBits(3), (byte) 2)));
						class365_sub1_sub1_sub2_sub1.method4455(class274, Class282.aClass282_6540.aByte6542, (short) 32767);
						int i_6_ = class298_sub53_sub2.readBits(1);
						if (1 == i_6_)
							client.anIntArray8706[((client.anInt8808 += -386992021) * -976358333 - 1)] = i_3_;
					} else if (i_5_ == 2) {
						client.anIntArray8699[((client.anInt8703 += -409937273) * -1230451913) - 1] = i_3_;
						class365_sub1_sub1_sub2_sub1.anInt10075 = -3704423 * client.anInt8707;
						if (class298_sub53_sub2.readBits(1) == 1) {
							Class274 class274 = ((Class274) (Class422_Sub20.method5701(Class299.method3680(-2113999549), class298_sub53_sub2.readBits(3), (byte) 2)));
							class365_sub1_sub1_sub2_sub1.method4455(class274, Class282.aClass282_6541.aByte6542, (short) 32767);
							Class274 class274_7_ = ((Class274) (Class422_Sub20.method5701(Class299.method3680(-1890825389), class298_sub53_sub2.readBits(3), (byte) 2)));
							class365_sub1_sub1_sub2_sub1.method4455(class274_7_, Class282.aClass282_6541.aByte6542, (short) 32767);
						} else {
							Class274 class274 = ((Class274) (Class422_Sub20.method5701(Class299.method3680(-2012553016), class298_sub53_sub2.readBits(3), (byte) 2)));
							class365_sub1_sub1_sub2_sub1.method4455(class274, Class282.aClass282_6545.aByte6542, (short) 32767);
						}
						int i_8_ = class298_sub53_sub2.readBits(1);
						if (1 == i_8_)
							client.anIntArray8706[((client.anInt8808 += -386992021) * -976358333 - 1)] = i_3_;
					} else if (i_5_ == 3)
						client.anIntArray8709[(client.anInt8708 += 107511579) * -1508392173 - 1] = i_3_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tg.jn(").append(')').toString());
		}
	}

	static final void method6024(ClientScript2 from, int i) {
		try {
			int i_9_ = (((ClientScript2) from).integerstack[1883543357 * ((ClientScript2) from).integerPos]);
			ClientScript script = Class216.getClientScript(i_9_, (byte) 1);
			if (null == script)
				return;
				//throw new RuntimeException();
			int[] is = new int[script.anInt9679 * -1516159487];
			Object[] objects = new Object[1787035509 * script.anInt9680];
			long[] ls = new long[script.anInt9681 * 1679522843];
			for (int i_10_ = 0; i_10_ < script.anInt9682 * -1249619929; i_10_++)
				is[i_10_] = (((ClientScript2) from).anIntArray5244[(681479919 * ((ClientScript2) from).anInt5239 - -1249619929 * script.anInt9682 + i_10_)]);
			for (int i_11_ = 0; i_11_ < 2027436935 * script.anInt9674; i_11_++)
				objects[i_11_] = (((ClientScript2) from).anObjectArray5240[(i_11_ + (-203050393 * ((ClientScript2) from).anInt5241 - 2027436935 * script.anInt9674))]);
			for (int i_12_ = 0; i_12_ < script.anInt9684 * -1520504699; i_12_++)
				ls[i_12_] = (((ClientScript2) from).aLongArray5251[(i_12_ + (1685767703 * ((ClientScript2) from).anInt5245 - script.anInt9684 * -1520504699))]);
			((ClientScript2) from).anInt5239 -= -238333367 * script.anInt9682;
			((ClientScript2) from).anInt5241 -= 258390497 * script.anInt9674;
			((ClientScript2) from).anInt5245 -= script.anInt9684 * 1071348675;
			Class402 class402 = new Class402();
			((Class402) class402).aClass298_Sub37_Sub17_5229 = ((ClientScript2) from).aClass298_Sub37_Sub17_5260;
			((Class402) class402).anInt5226 = -985206291 * ((ClientScript2) from).integerPos;
			((Class402) class402).anIntArray5228 = ((ClientScript2) from).anIntArray5248;
			((Class402) class402).stringstack = ((ClientScript2) from).stringstack;
			((Class402) class402).aLongArray5230 = ((ClientScript2) from).aLongArray5235;
			if (((ClientScript2) from).anInt5250 * -932179775 >= ((ClientScript2) from).aClass402Array5249.length)
				throw new RuntimeException();
			((ClientScript2) from).aClass402Array5249[((((ClientScript2) from).anInt5250 += 373063489) * -932179775 - 1)] = class402;
			((ClientScript2) from).aClass298_Sub37_Sub17_5260 = script;
			((ClientScript2) from).aClass394Array5258 = (((ClientScript2) from).aClass298_Sub37_Sub17_5260.data);
			((ClientScript2) from).integerstack = (((ClientScript2) from).aClass298_Sub37_Sub17_5260.anIntArray9676);
			((ClientScript2) from).integerPos = -286750741;
			((ClientScript2) from).anIntArray5248 = is;
			((ClientScript2) from).stringstack = objects;
			((ClientScript2) from).aLongArray5235 = ls;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tg.ay(").append(')').toString());
		}
	}
}
