/* Class432_Sub1_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class432_Sub1_Sub5 extends Class432_Sub1 {
	public static int anInt9928 = 8;
	public static int anInt9929 = 4;
	public static int anInt9930 = 1;
	public short aShort9931;
	public static int anInt9932 = 16;
	public static int anInt9933 = 32;
	public static int anInt9934 = 64;
	public static int anInt9935 = 2;
	static int[] anIntArray9936 = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	public static int anInt9937 = 128;

	boolean method5372(Class_ra class_ra, int i) {
		try {
			Class260 class260 = method5346().aClass260_2606;
			return (aClass356_8655.aClass358_3649.method4230(this, aByte8654, ((int) class260.aFloat2716 >> aClass356_8655.anInt3641 * 916917461), ((int) class260.aFloat2711 >> 916917461 * aClass356_8655.anInt3641)));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akq.gb(").append(')').toString());
		}
	}

	boolean method5365(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		return (aClass356_8655.aClass358_3649.method4230(this, aByte8654, ((int) class260.aFloat2716 >> aClass356_8655.anInt3641 * 916917461), ((int) class260.aFloat2711 >> 916917461 * aClass356_8655.anInt3641)));
	}

	int method5368(Class330_Sub14[] class330_sub14s, byte i) {
		try {
			Class260 class260 = method5346().aClass260_2606;
			int i_0_ = ((int) class260.aFloat2716 >> 916917461 * aClass356_8655.anInt3641);
			int i_1_ = ((int) class260.aFloat2711 >> aClass356_8655.anInt3641 * 916917461);
			int i_2_ = 0;
			if (i_0_ == 315907165 * ((Class356) aClass356_8655).anInt3640)
				i_2_++;
			else if (315907165 * ((Class356) aClass356_8655).anInt3640 < i_0_)
				i_2_ += 2;
			if (i_1_ == 875564685 * ((Class356) aClass356_8655).anInt3651)
				i_2_ += 3;
			else if (875564685 * ((Class356) aClass356_8655).anInt3651 > i_1_)
				i_2_ += 6;
			int i_3_ = anIntArray9936[i_2_];
			if ((aShort9931 & i_3_) != 0)
				return method5371(i_0_, i_1_, class330_sub14s, (byte) 58);
			if (1 == aShort9931 && i_0_ > 0)
				return method5371(i_0_ - 1, i_1_, class330_sub14s, (byte) 107);
			if (4 == aShort9931 && i_0_ <= -265955713 * aClass356_8655.anInt3667)
				return method5371(i_0_ + 1, i_1_, class330_sub14s, (byte) 52);
			if (aShort9931 == 8 && i_1_ > 0)
				return method5371(i_0_, i_1_ - 1, class330_sub14s, (byte) 82);
			if (2 == aShort9931 && i_1_ <= 95955317 * aClass356_8655.anInt3654)
				return method5371(i_0_, 1 + i_1_, class330_sub14s, (byte) 37);
			if (16 == aShort9931 && i_0_ > 0 && i_1_ <= aClass356_8655.anInt3654 * 95955317)
				return method5371(i_0_ - 1, 1 + i_1_, class330_sub14s, (byte) 23);
			if (aShort9931 == 32 && i_0_ <= aClass356_8655.anInt3667 * -265955713 && i_1_ <= aClass356_8655.anInt3654 * 95955317)
				return method5371(1 + i_0_, i_1_ + 1, class330_sub14s, (byte) 20);
			if (128 == aShort9931 && i_0_ > 0 && i_1_ > 0)
				return method5371(i_0_ - 1, i_1_ - 1, class330_sub14s, (byte) 20);
			if (64 == aShort9931 && i_0_ <= -265955713 * aClass356_8655.anInt3667 && i_1_ > 0)
				return method5371(1 + i_0_, i_1_ - 1, class330_sub14s, (byte) 21);
			throw new RuntimeException("");
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akq.fb(").append(')').toString());
		}
	}

	boolean method5367(byte i) {
		try {
			Class260 class260 = method5346().aClass260_2606;
			return (((Class356) aClass356_8655).aBooleanArrayArray3700[(((int) class260.aFloat2716 >> aClass356_8655.anInt3641 * 916917461) - 315907165 * ((Class356) aClass356_8655).anInt3640 + 316617313 * ((Class356) aClass356_8655).anInt3673)][(((Class356) aClass356_8655).anInt3673 * 316617313 + (((int) class260.aFloat2711 >> 916917461 * aClass356_8655.anInt3641) - (((Class356) aClass356_8655).anInt3651 * 875564685)))]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akq.gn(").append(')').toString());
		}
	}

	int method5398(Class330_Sub14[] class330_sub14s) {
		Class260 class260 = method5346().aClass260_2606;
		int i = ((int) class260.aFloat2716 >> 916917461 * aClass356_8655.anInt3641);
		int i_4_ = ((int) class260.aFloat2711 >> aClass356_8655.anInt3641 * 916917461);
		int i_5_ = 0;
		if (i == 315907165 * ((Class356) aClass356_8655).anInt3640)
			i_5_++;
		else if (315907165 * ((Class356) aClass356_8655).anInt3640 < i)
			i_5_ += 2;
		if (i_4_ == 875564685 * ((Class356) aClass356_8655).anInt3651)
			i_5_ += 3;
		else if (875564685 * ((Class356) aClass356_8655).anInt3651 > i_4_)
			i_5_ += 6;
		int i_6_ = anIntArray9936[i_5_];
		if ((aShort9931 & i_6_) != 0)
			return method5371(i, i_4_, class330_sub14s, (byte) 49);
		if (1 == aShort9931 && i > 0)
			return method5371(i - 1, i_4_, class330_sub14s, (byte) 16);
		if (4 == aShort9931 && i <= -265955713 * aClass356_8655.anInt3667)
			return method5371(i + 1, i_4_, class330_sub14s, (byte) 76);
		if (aShort9931 == 8 && i_4_ > 0)
			return method5371(i, i_4_ - 1, class330_sub14s, (byte) 116);
		if (2 == aShort9931 && i_4_ <= 95955317 * aClass356_8655.anInt3654)
			return method5371(i, 1 + i_4_, class330_sub14s, (byte) 53);
		if (16 == aShort9931 && i > 0 && i_4_ <= aClass356_8655.anInt3654 * 95955317)
			return method5371(i - 1, 1 + i_4_, class330_sub14s, (byte) 113);
		if (aShort9931 == 32 && i <= aClass356_8655.anInt3667 * -265955713 && i_4_ <= aClass356_8655.anInt3654 * 95955317)
			return method5371(1 + i, i_4_ + 1, class330_sub14s, (byte) 73);
		if (128 == aShort9931 && i > 0 && i_4_ > 0)
			return method5371(i - 1, i_4_ - 1, class330_sub14s, (byte) 33);
		if (64 == aShort9931 && i <= -265955713 * aClass356_8655.anInt3667 && i_4_ > 0)
			return method5371(1 + i, i_4_ - 1, class330_sub14s, (byte) 109);
		throw new RuntimeException("");
	}

	int method5399(Class330_Sub14[] class330_sub14s) {
		Class260 class260 = method5346().aClass260_2606;
		int i = ((int) class260.aFloat2716 >> 916917461 * aClass356_8655.anInt3641);
		int i_7_ = ((int) class260.aFloat2711 >> aClass356_8655.anInt3641 * 916917461);
		int i_8_ = 0;
		if (i == 315907165 * ((Class356) aClass356_8655).anInt3640)
			i_8_++;
		else if (315907165 * ((Class356) aClass356_8655).anInt3640 < i)
			i_8_ += 2;
		if (i_7_ == 875564685 * ((Class356) aClass356_8655).anInt3651)
			i_8_ += 3;
		else if (875564685 * ((Class356) aClass356_8655).anInt3651 > i_7_)
			i_8_ += 6;
		int i_9_ = anIntArray9936[i_8_];
		if ((aShort9931 & i_9_) != 0)
			return method5371(i, i_7_, class330_sub14s, (byte) 126);
		if (1 == aShort9931 && i > 0)
			return method5371(i - 1, i_7_, class330_sub14s, (byte) 123);
		if (4 == aShort9931 && i <= -265955713 * aClass356_8655.anInt3667)
			return method5371(i + 1, i_7_, class330_sub14s, (byte) 76);
		if (aShort9931 == 8 && i_7_ > 0)
			return method5371(i, i_7_ - 1, class330_sub14s, (byte) 89);
		if (2 == aShort9931 && i_7_ <= 95955317 * aClass356_8655.anInt3654)
			return method5371(i, 1 + i_7_, class330_sub14s, (byte) 107);
		if (16 == aShort9931 && i > 0 && i_7_ <= aClass356_8655.anInt3654 * 95955317)
			return method5371(i - 1, 1 + i_7_, class330_sub14s, (byte) 77);
		if (aShort9931 == 32 && i <= aClass356_8655.anInt3667 * -265955713 && i_7_ <= aClass356_8655.anInt3654 * 95955317)
			return method5371(1 + i, i_7_ + 1, class330_sub14s, (byte) 8);
		if (128 == aShort9931 && i > 0 && i_7_ > 0)
			return method5371(i - 1, i_7_ - 1, class330_sub14s, (byte) 94);
		if (64 == aShort9931 && i <= -265955713 * aClass356_8655.anInt3667 && i_7_ > 0)
			return method5371(1 + i, i_7_ - 1, class330_sub14s, (byte) 30);
		throw new RuntimeException("");
	}

	boolean method5400(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		return (aClass356_8655.aClass358_3649.method4230(this, aByte8654, ((int) class260.aFloat2716 >> aClass356_8655.anInt3641 * 916917461), ((int) class260.aFloat2711 >> 916917461 * aClass356_8655.anInt3641)));
	}

	Class432_Sub1_Sub5(Class356 class356, int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
		super(class356);
		aByte8658 = (byte) i_12_;
		aByte8654 = (byte) i_13_;
		aShort9931 = (short) i_14_;
		method5349(new Class260((float) i, (float) i_10_, (float) i_11_));
	}

	boolean method5402(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		return (aClass356_8655.aClass358_3649.method4230(this, aByte8654, ((int) class260.aFloat2716 >> aClass356_8655.anInt3641 * 916917461), ((int) class260.aFloat2711 >> 916917461 * aClass356_8655.anInt3641)));
	}

	boolean method5403() {
		Class260 class260 = method5346().aClass260_2606;
		return (((Class356) aClass356_8655).aBooleanArrayArray3700[(((int) class260.aFloat2716 >> aClass356_8655.anInt3641 * 916917461) - 315907165 * ((Class356) aClass356_8655).anInt3640 + 316617313 * ((Class356) aClass356_8655).anInt3673)][(((Class356) aClass356_8655).anInt3673 * 316617313 + (((int) class260.aFloat2711 >> 916917461 * aClass356_8655.anInt3641) - ((Class356) aClass356_8655).anInt3651 * 875564685))]);
	}
}
