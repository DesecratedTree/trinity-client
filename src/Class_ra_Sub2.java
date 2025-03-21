/* Class_ra_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;

import jaclib.memory.DirectBufferHelper;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;

import sun.misc.Unsafe;

public abstract class Class_ra_Sub2 extends Class_ra {
	protected int anInt8445;
	Class555 aClass555_8446 = new Class555();
	protected int anInt8447;
	static int anInt8448 = 1;
	static int anInt8449 = 2;
	static int anInt8450 = 4;
	protected float[] aFloatArray8451;
	static int anInt8452 = 55;
	static int anInt8453 = 7;
	protected boolean aBoolean8454;
	Class186 aClass186_8455;
	Class77 aClass77_8456;
	float aFloat8457;
	public ByteBuffer aByteBuffer8458;
	public long aLong8459;
	int anInt8460 = 4194304;
	public Unsafe anUnsafe8461;
	float[] aFloatArray8462;
	NativeHeap aNativeHeap8463;
	Class471 aClass471_8464 = new Class471();
	public int anInt8465;
	public int anInt8466;
	int[] anIntArray8467;
	Class247 aClass247_8468 = new Class247();
	Class249 aClass249_8469 = new Class249();
	Class180 aClass180_8470;
	protected float aFloat8471;
	public Class249 aClass249_8472;
	Class249 aClass249_8473;
	Class140 aClass140_8474;
	Class249 aClass249_8475;
	protected int anInt8476;
	Class249 aClass249_8477;
	protected float aFloat8478;
	Class249 aClass249_8479;
	protected int anInt8480;
	float[] aFloatArray8481;
	boolean aBoolean8482;
	Class174 aClass174_8483;
	boolean aBoolean8484;
	Class249 aClass249_8485;
	Class249 aClass249_8486;
	boolean aBoolean8487;
	Class249 aClass249_8488;
	public float aFloat8489;
	public int anInt8490;
	public Class249 aClass249_8491;
	Class249 aClass249_8492;
	public Class249 aClass249_8493;
	float[][] aFloatArrayArray8494;
	float aFloat8495;
	protected boolean aBoolean8496;
	float aFloat8497;
	float aFloat8498;
	protected float aFloat8499;
	public float aFloat8500;
	Interface9_Impl1 anInterface9_Impl1_8501;
	protected boolean aBoolean8502;
	Interface11_Impl3 anInterface11_Impl3_8503;
	protected float aFloat8504;
	float aFloat8505;
	protected int anInt8506;
	protected static int anInt8507 = 100663296;
	static Class249 aClass249_8508;
	protected Class181[] aClass181Array8509;
	int anInt8510;
	int anInt8511;
	int anInt8512;
	Class247 aClass247_8513;
	protected boolean aBoolean8514;
	protected int anInt8515;
	protected int anInt8516;
	protected int anInt8517;
	protected int anInt8518;
	protected boolean aBoolean8519;
	static Object anObject8520 = new Object();
	protected int anInt8521;
	protected boolean aBoolean8522;
	protected boolean aBoolean8523;
	Class247 aClass247_8524 = new Class247();
	public float[] aFloatArray8525;
	protected boolean aBoolean8526;
	IndexTable aClass280_8527;
	float[] aFloatArray8528;
	int anInt8529;
	public float aFloat8530;
	protected int anInt8531;
	public float aFloat8532;
	protected float aFloat8533;
	Class387_Sub1[] aClass387_Sub1Array8534;
	protected float aFloat8535;
	int anInt8536;
	protected int anInt8537;
	protected int anInt8538;
	int anInt8539;
	int anInt8540;
	int anInt8541;
	Class155 aClass155_8542;
	protected int anInt8543;
	Class260 aClass260_8544;
	protected Class249[] aClass249Array8545;
	protected boolean aBoolean8546;
	protected Class179[] aClass179Array8547;
	protected Class179[] aClass179Array8548;
	Interface11[] anInterface11Array8549;
	static int anInt8550 = 8;
	public Interface11_Impl3 anInterface11_Impl3_8551;
	Class188 aClass188_8552;
	Class61_Sub1 aClass61_Sub1_8553;
	Class61_Sub1 aClass61_Sub1_8554;
	boolean aBoolean8555;
	Class187 aClass187_8556;
	Class164 aClass164_8557;
	Class164[] aClass164Array8558;
	Interface9_Impl2 anInterface9_Impl2_8559;
	protected int anInt8560;
	Class150 aClass150_8561;
	Class126 aClass126_8562;
	Class164_Sub1_Sub2 aClass164_Sub1_Sub2_8563;
	Class164_Sub1_Sub2 aClass164_Sub1_Sub2_8564;
	Class164_Sub1_Sub1 aClass164_Sub1_Sub1_8565;
	protected boolean aBoolean8566;
	protected int anInt8567;
	static int anInt8568 = 2;
	Class192[] aClass192Array8569;
	Class92_Sub1 aClass92_Sub1_8570;
	boolean aBoolean8571;
	boolean aBoolean8572;
	int anInt8573;
	static int anInt8574 = 128;
	protected boolean aBoolean8575;
	protected Class249 aClass249_8576;
	Class249 aClass249_8577;
	protected int anInt8578;
	Class249 aClass249_8579;
	protected float aFloat8580;
	protected float aFloat8581;
	int anInt8582;
	protected Class176 aClass176_8583;
	Class247 aClass247_8584;
	protected boolean aBoolean8585;
	static int anInt8586 = 1;
	Interface9_Impl1 anInterface9_Impl1_8587;
	public int anInt8588;
	boolean aBoolean8589;
	Class159 aClass159_8590;
	int anInt8591;
	public int anInt8592;
	protected int anInt8593;
	public boolean aBoolean8594;
	protected boolean aBoolean8595;
	Class247 aClass247_8596 = new Class247();
	int anInt8597;
	protected boolean aBoolean8598;
	int anInt8599;
	Interface9_Impl1 anInterface9_Impl1_8600;
	protected boolean aBoolean8601;
	Class184 aClass184_8602;
	Class184 aClass184_8603;
	Class184 aClass184_8604;
	Class184 aClass184_8605;
	Class184 aClass184_8606;
	protected Class330_Sub14[] aClass330_Sub14Array8607;
	float aFloat8608;
	Class387_Sub1[] aClass387_Sub1Array8609;
	protected int anInt8610;
	Class247 aClass247_8611;
	protected boolean aBoolean8612;
	protected int anInt8613;

	final void method4882(boolean bool) {
		if (bool != aBoolean8502) {
			aBoolean8502 = bool;
			method4974();
			((Class_ra_Sub2) this).anInt8540 &= ~0xf;
		}
	}

	public void method4883(Interface8 interface8) {
		((Class_ra_Sub2) this).aClass555_8446.method6397(interface8, -1956893969);
	}

	void method4884() {
		ArrayList arraylist = ((Class_ra_Sub2) this).aClass555_8446.method6400((byte) 2);
		Iterator iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			Interface8 interface8 = (Interface8) iterator.next();
			interface8.method53();
		}
	}

	final void method4885() {
		if (((Class_ra_Sub2) this).aClass174_8483 != Class174.aClass174_1735) {
			((Class_ra_Sub2) this).aClass174_8483 = Class174.aClass174_1735;
			method4919();
			method4929();
			((Class_ra_Sub2) this).aClass249_8577 = ((Class_ra_Sub2) this).aClass249_8488;
			method4930();
			method5018();
			((Class_ra_Sub2) this).anInt8540 &= ~0x7;
		}
	}

	public abstract boolean method4886();

	public abstract float method4887();

	public abstract Class105 method4888(String string);

	public final void method4889(int i) {
		switch (i) {
		case 4:
			method4958(Class179.aClass179_1761, Class179.aClass179_1761);
			break;
		case 3:
			method4958(Class179.aClass179_1758, Class179.aClass179_1757);
			break;
		case 1:
			method4958(Class179.aClass179_1759, Class179.aClass179_1759);
			break;
		case 2:
			method4958(Class179.aClass179_1760, Class179.aClass179_1759);
			break;
		case 0:
			method4958(Class179.aClass179_1757, Class179.aClass179_1757);
			break;
		}
	}

	Class113 method4890(byte[] is) {
		if (is == null)
			return null;
		Class113 class113;
		try {
			class113 = new Class113(is);
		} catch (Exception exception) {
			return null;
		}
		return class113;
	}

	public abstract void method4891(Class249 class249, Class249 class249_0_, Class249 class249_1_);

	public static boolean method4892() {
		return Class489.method6063(-1102372689).method327("jaclib", -1247511145);
	}

	Class_ra_Sub2(Interface_ma interface_ma, IndexTable class280, int i, int i_2_) {
		super(interface_ma);
		aClass249_8472 = new Class249();
		((Class_ra_Sub2) this).aClass249_8473 = new Class249();
		((Class_ra_Sub2) this).aClass247_8584 = new Class247();
		((Class_ra_Sub2) this).aClass249_8475 = new Class249();
		((Class_ra_Sub2) this).aClass247_8513 = new Class247();
		aClass249_8576 = new Class249();
		((Class_ra_Sub2) this).aClass249_8479 = new Class249();
		((Class_ra_Sub2) this).aClass260_8544 = new Class260();
		((Class_ra_Sub2) this).aFloatArray8481 = new float[4];
		((Class_ra_Sub2) this).aBoolean8482 = false;
		((Class_ra_Sub2) this).aClass174_8483 = Class174.aClass174_1736;
		((Class_ra_Sub2) this).aBoolean8484 = false;
		((Class_ra_Sub2) this).aClass249_8485 = new Class249();
		((Class_ra_Sub2) this).aClass249_8486 = new Class249();
		((Class_ra_Sub2) this).aBoolean8487 = false;
		((Class_ra_Sub2) this).aClass249_8488 = new Class249();
		((Class_ra_Sub2) this).aClass249_8477 = new Class249();
		((Class_ra_Sub2) this).aClass249_8577 = ((Class_ra_Sub2) this).aClass249_8477;
		aClass249_8491 = new Class249();
		((Class_ra_Sub2) this).aClass249_8492 = new Class249();
		aClass249_8493 = new Class249();
		((Class_ra_Sub2) this).aFloatArrayArray8494 = new float[6][4];
		aFloat8499 = 0.0F;
		aFloat8478 = 1.0F;
		((Class_ra_Sub2) this).aFloat8608 = 0.0F;
		((Class_ra_Sub2) this).aFloat8457 = 1.0F;
		aFloat8471 = 50.0F;
		aFloat8504 = 3584.0F;
		anInt8521 = 0;
		anInt8506 = 0;
		anInt8610 = 0;
		anInt8447 = 0;
		((Class_ra_Sub2) this).anInt8597 = 0;
		((Class_ra_Sub2) this).anInt8510 = 0;
		((Class_ra_Sub2) this).anInt8511 = 0;
		((Class_ra_Sub2) this).anInt8512 = 0;
		anInt8531 = 0;
		anInt8567 = 0;
		anInt8515 = 0;
		anInt8516 = 0;
		anInt8517 = 0;
		anInt8518 = 0;
		aBoolean8519 = true;
		aBoolean8454 = false;
		aBoolean8526 = false;
		aBoolean8522 = false;
		aBoolean8523 = true;
		aBoolean8575 = false;
		aFloatArray8525 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		aFloatArray8451 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };
		((Class_ra_Sub2) this).aFloatArray8462 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		((Class_ra_Sub2) this).aFloatArray8528 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		((Class_ra_Sub2) this).anInt8529 = 16777215;
		aFloat8530 = 1.0F;
		aFloat8500 = 1.0F;
		aFloat8532 = 1.0F;
		aFloat8533 = 1.0F;
		aFloat8489 = -1.0F;
		aFloat8535 = -1.0F;
		((Class_ra_Sub2) this).anInt8539 = 8;
		((Class_ra_Sub2) this).anInt8536 = 3;
		anInt8543 = 0;
		((Class_ra_Sub2) this).aBoolean8555 = false;
		((Class_ra_Sub2) this).aClass164Array8558 = new Class164[16];
		((Class_ra_Sub2) this).aClass192Array8569 = new Class192[2];
		((Class_ra_Sub2) this).aBoolean8572 = false;
		aBoolean8514 = true;
		anInt8476 = -1;
		anInt8578 = -1;
		anInt8560 = 0;
		((Class_ra_Sub2) this).anInt8582 = 1;
		aClass176_8583 = Class176.aClass176_1745;
		aBoolean8546 = true;
		aBoolean8585 = true;
		((Class_ra_Sub2) this).aBoolean8589 = false;
		new Stream();
		((Class_ra_Sub2) this).aClass387_Sub1Array8534 = new Class387_Sub1[7];
		((Class_ra_Sub2) this).aClass387_Sub1Array8609 = new Class387_Sub1[7];
		((Class_ra_Sub2) this).aClass249_8579 = new Class249();
		((Class_ra_Sub2) this).aClass247_8611 = new Class247();
		anInt8613 = -1;
		try {
			((Class_ra_Sub2) this).aClass280_8527 = class280;
			anInt8490 = i;
			((Class_ra_Sub2) this).anInt8591 = i_2_;
			Class318.method3166(false, true, -1368286637);
			if (anInterface_ma4227 != null)
				((Class_ra_Sub2) this).aClass188_8552 = new Class188(this, anInterface_ma4227);
			else
				((Class_ra_Sub2) this).aClass188_8552 = null;
			if (((Class_ra_Sub2) this).anInt8591 == 0)
				((Class_ra_Sub2) this).anIntArray8467 = Console.colorArray;
			else
				((Class_ra_Sub2) this).anIntArray8467 = Console.anIntArray4265;
			try {
				Field field = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
				field.setAccessible(true);
				anUnsafe8461 = (Unsafe) field.get(null);
			} catch (Exception exception) {
				/* empty */
			}
			aByteBuffer8458 = ByteBuffer.allocateDirect(4194304);
			aByteBuffer8458.order(ByteOrder.nativeOrder());
			aLong8459 = DirectBufferHelper.getDirectBufferAddress(aByteBuffer8458);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method4781(628001038);
			if (throwable instanceof OutOfMemoryError)
				throw (OutOfMemoryError) throwable;
			throw new RuntimeException("");
		}
		bm(bx(131072));
	}

	public Class247 ih() {
		return ((Class_ra_Sub2) this).aClass247_8524;
	}

	public abstract float method4893();

	Class164 method4894(int i) {
		return ((Class_ra_Sub2) this).aClass164Array8558[i];
	}

	void method4895() {
		method5040(7);
		method4999();
	}

	public final boolean ed() {
		return true;
	}

	final void method4896() {
		((Class_ra_Sub2) this).anInterface9_Impl1_8600 = method4976(false);
		int i = 160;
		((Class_ra_Sub2) this).anInterface9_Impl1_8600.method142(i, 32);
		aByteBuffer8458.clear();
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putInt(-1);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putFloat(1.0F);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putInt(-1);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putFloat(1.0F);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putFloat(1.0F);
		aByteBuffer8458.putFloat(1.0F);
		aByteBuffer8458.putFloat(1.0F);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putInt(-1);
		aByteBuffer8458.putFloat(1.0F);
		aByteBuffer8458.putFloat(1.0F);
		aByteBuffer8458.putFloat(1.0F);
		aByteBuffer8458.putFloat(1.0F);
		aByteBuffer8458.putFloat(1.0F);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putInt(-1);
		aByteBuffer8458.putFloat(1.0F);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putFloat(1.0F);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putInt(-1);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putFloat(0.0F);
		((Class_ra_Sub2) this).anInterface9_Impl1_8600.method97(0, aByteBuffer8458.position(), aLong8459);
		((Class_ra_Sub2) this).aClass184_8603 = method4977(new Class193[] { new Class193(new Class191[] { Class191.aClass191_1863, Class191.aClass191_1862, Class191.aClass191_1864, Class191.aClass191_1864 }) });
	}

	public void method4897(int i) {
		if (i != anInt8445) {
			anInt8445 = i;
			method4967();
		}
	}

	public abstract void method4898(Class199 class199, int i, int i_3_);

	abstract Interface11_Impl3 method4899(int i, int i_4_, boolean bool, int[] is, int i_5_, int i_6_);

	public final boolean a() {
		return true;
	}

	public final boolean em() {
		return true;
	}

	public final boolean t() {
		return true;
	}

	public final boolean ay() {
		return true;
	}

	public final Class61 gt(int i, int i_7_, boolean bool, boolean bool_8_) {
		return new Class61_Sub1(this, i, i_7_, bool, bool_8_);
	}

	public final boolean al() {
		return true;
	}

	public final boolean at() {
		return true;
	}

	abstract void method4900();

	public abstract float method4901();

	final void method4902() {
		((Class_ra_Sub2) this).aBoolean8484 = false;
		if (((Class_ra_Sub2) this).aClass174_8483 == Class174.aClass174_1737) {
			method5085();
			method4930();
		}
	}

	Class161 method4903() {
		if (((Class_ra_Sub2) this).aClass187_8556 == null)
			return Class161.aClass161_1688;
		return ((Class_ra_Sub2) this).aClass187_8556.method2091();
	}

	abstract Interface11_Impl3 method4904(Class72 class72, Class86 class86, int i, int i_9_);

	public final int dp() {
		return anInt8466 + anInt8465 + anInt8480;
	}

	public void method4797() {
		if (((Class_ra_Sub2) this).aClass187_8556 != null)
			((Class_ra_Sub2) this).aClass187_8556.method2090();
	}

	void method4905() {
		method4906();
	}

	void method4906() {
		method4902();
		method5099();
		method4924();
		au();
		L();
	}

	public final void il(int i) {
		((Class_ra_Sub2) this).anInt8536 = 0;
		for (/**/; i > 1; i >>= 1)
			((Class_ra_Sub2) this).anInt8536++;
		((Class_ra_Sub2) this).anInt8539 = 1 << ((Class_ra_Sub2) this).anInt8536;
	}

	public final void ca() {
		if (((Class_ra_Sub2) this).aClass192Array8569[1] != null && ((Class_ra_Sub2) this).aClass192Array8569[1].method2106()) {
			((Class_ra_Sub2) this).aClass180_8470.method2057(((Class_ra_Sub2) this).aClass192Array8569[1]);
			((Class_ra_Sub2) this).aClass188_8552.method2096();
		}
	}

	public final boolean cg() {
		return (((Class_ra_Sub2) this).aClass192Array8569[1] != null && ((Class_ra_Sub2) this).aClass192Array8569[1].method2106());
	}

	public final void fh(int i, int i_10_, int i_11_, int i_12_) {
		int i_13_;
		int i_14_;
		if (aClass76_4228 != null) {
			i_14_ = aClass76_4228.method856();
			i_13_ = aClass76_4228.method857();
		} else {
			i_13_ = 0;
			i_14_ = 0;
		}
		i = i >= 0 ? i : 0;
		i_11_ = i_11_ <= i_14_ ? i_11_ : i_14_;
		i_10_ = i_10_ >= 0 ? i_10_ : 0;
		i_12_ = i_12_ <= i_13_ ? i_12_ : i_13_;
		boolean bool = false;
		if (anInt8610 < i) {
			anInt8610 = i;
			bool = true;
		}
		if (anInt8447 > i_11_) {
			anInt8447 = i_11_;
			bool = true;
		}
		if (anInt8521 < i_10_) {
			anInt8521 = i_10_;
			bool = true;
		}
		if (anInt8506 > i_12_) {
			anInt8506 = i_12_;
			bool = true;
		}
		if (bool) {
			if (!aBoolean8612 && (((Class_ra_Sub2) this).aBoolean8555 || method4903() == Class161.aClass161_1688)) {
				aBoolean8612 = true;
				method4914();
			}
			method4913();
		}
	}

	abstract void method4907();

	public final void ds() {
		((Class_ra_Sub2) this).aClass180_8470.method2059();
	}

	public final Class_v bx(int i) {
		Class_v_Sub1 class_v_sub1 = new Class_v_Sub1(i);
		((Class_ra_Sub2) this).aClass471_8464.method5878(class_v_sub1, (short) 8192);
		return class_v_sub1;
	}

	public final void bm(Class_v class_v) {
		((Class_ra_Sub2) this).aNativeHeap8463 = ((Class_v_Sub1) (Class_v_Sub1) class_v).aNativeHeap9856;
	}

	public final NativeHeapBuffer method4908(int i, boolean bool) {
		return ((Class_ra_Sub2) this).aNativeHeap8463.j(i, bool);
	}

	final Interface9_Impl2 method4909(int i) {
		if (((Class_ra_Sub2) this).anInterface9_Impl2_8559.method93() < i * 2)
			((Class_ra_Sub2) this).anInterface9_Impl2_8559.method148(i);
		return ((Class_ra_Sub2) this).anInterface9_Impl2_8559;
	}

	public final int za() {
		return anInt8466 + anInt8465 + anInt8480;
	}

	public final Class61 bn(int i, int i_15_, boolean bool, boolean bool_16_) {
		return new Class61_Sub1(this, i, i_15_, bool, bool_16_);
	}

	public final Class61 bw(Class87 class87, boolean bool) {
		Class61 class61;
		if (class87.method986() != 0 && class87.method994() != 0) {
			int[] is = class87.method1031(false);
			class61 = method4795(is, 0, class87.method986(), class87.method986(), class87.method994(), (byte) -78);
		} else
			class61 = method4795(new int[] { 0 }, 0, 1, 1, 1, (byte) -70);
		class61.method717(class87.method983(), class87.method990(), class87.method989(), class87.method991());
		return class61;
	}

	public final Class61 bu(int[] is, int i, int i_17_, int i_18_, int i_19_, boolean bool) {
		return new Class61_Sub1(this, i_18_, i_19_, is, i, i_17_);
	}

	public final Class61 bj(int i, int i_20_, int i_21_, int i_22_, boolean bool) {
		Class61_Sub1 class61_sub1 = new Class61_Sub1(this, i_21_, i_22_, bool, false);
		class61_sub1.method737(0, 0, i_21_, i_22_, i, i_20_);
		return class61_sub1;
	}

	public final Class263 ce(Class524 class524, Class87_Sub2[] class87_sub2s, boolean bool) {
		return new Class263_Sub5(this, class524, class87_sub2s, bool);
	}

	public final Class_ta ch(int i, int i_23_, int[] is, int[] is_24_) {
		return Class_ta_Sub1.method5682(this, i, i_23_, is, is_24_);
	}

	public final void jq(int i, Class77 class77) {
		if (!((Class_ra_Sub2) this).aBoolean8571)
			throw new RuntimeException("");
		((Class_ra_Sub2) this).anInt8573 = i;
		((Class_ra_Sub2) this).aClass77_8456 = class77;
		if (((Class_ra_Sub2) this).aBoolean8572) {
			((Class_ra_Sub2) this).aClass164Array8558[3].method1930();
			((Class_ra_Sub2) this).aClass164Array8558[3].method1929();
		}
	}

	void di() {
		if (!((Class_ra_Sub2) this).aBoolean8589) {
			method4998();
			((Class_ra_Sub2) this).aClass188_8552.method2096();
			for (Class330 class330 = ((Class_ra_Sub2) this).aClass471_8464.method5869(539664854); class330 != null; class330 = ((Class_ra_Sub2) this).aClass471_8464.method5873((byte) -119))
				((Class_v_Sub1) class330).method3872();
			Class95_Sub12.method1137(false, true, 85010205);
			for (int i = 0; i < ((Class_ra_Sub2) this).aClass164Array8558.length; i++) {
				if (((Class_ra_Sub2) this).aClass164Array8558[i] != null) {
					((Class_ra_Sub2) this).aClass164Array8558[i].method1932();
					((Class_ra_Sub2) this).aClass164Array8558[i] = null;
				}
			}
			for (int i = 0; i < ((Class_ra_Sub2) this).aClass192Array8569.length; i++) {
				if (((Class_ra_Sub2) this).aClass192Array8569[i] != null) {
					((Class_ra_Sub2) this).aClass192Array8569[i].method2122();
					((Class_ra_Sub2) this).aClass192Array8569[i] = null;
				}
			}
			method4884();
			g(0);
			((Class_ra_Sub2) this).aBoolean8589 = true;
		}
	}

	public final int ct(int i, int i_25_) {
		return i & i_25_ ^ i_25_;
	}

	public final int cd(int i, int i_26_) {
		return i | i_26_;
	}

	public final Class_xa cn(int i, int i_27_, int[][] is, int[][] is_28_, int i_29_, int i_30_, int i_31_) {
		return new Class_xa_Sub2(this, i_30_, i_31_, i, i_27_, is, is_28_, i_29_);
	}

	public final Class249 cz() {
		return ((Class_ra_Sub2) this).aClass249_8579;
	}

	public final void method4910() {
		((Class_ra_Sub2) this).anInterface11Array8549 = new Interface11[anInt8592];
		aClass249Array8545 = new Class249[anInt8592];
		aClass181Array8509 = new Class181[anInt8592];
		aClass179Array8547 = new Class179[anInt8592];
		aClass179Array8548 = new Class179[anInt8592];
		for (int i = 0; i < anInt8592; i++) {
			aClass179Array8548[i] = Class179.aClass179_1757;
			aClass179Array8547[i] = Class179.aClass179_1757;
			aClass181Array8509[i] = Class181.aClass181_1784;
			aClass249Array8545[i] = new Class249();
		}
		aClass330_Sub14Array8607 = new Class330_Sub14[anInt8593 - 2];
		int[] is = { -1 };
		anInterface11_Impl3_8551 = method4950(1, 1, false, is, 0, 0);
		is[0] = -16777216;
		((Class_ra_Sub2) this).anInterface11_Impl3_8503 = method4950(1, 1, false, is, 0, 0);
		bm(new Class_v_Sub1(262144));
		((Class_ra_Sub2) this).aClass184_8606 = method4977(new Class193[] { new Class193(new Class191[] { Class191.aClass191_1863, Class191.aClass191_1864 }) });
		method4977(new Class193[] { new Class193(new Class191[] { Class191.aClass191_1863, Class191.aClass191_1862 }) });
		((Class_ra_Sub2) this).aClass184_8605 = method4977(new Class193[] { new Class193(Class191.aClass191_1863), new Class193(Class191.aClass191_1862), new Class193(Class191.aClass191_1864), new Class193(Class191.aClass191_1872) });
		((Class_ra_Sub2) this).aClass184_8604 = method4977(new Class193[] { new Class193(Class191.aClass191_1863), new Class193(Class191.aClass191_1862), new Class193(Class191.aClass191_1864) });
		for (int i = 0; i < 7; i++) {
			((Class_ra_Sub2) this).aClass387_Sub1Array8534[i] = new Class387_Sub1(this, 0, 0, false, false);
			((Class_ra_Sub2) this).aClass387_Sub1Array8609[i] = new Class387_Sub1(this, 0, 0, true, true);
		}
		method5039();
		((Class_ra_Sub2) this).anInterface9_Impl2_8559 = method4975(true);
		method4895();
		ag();
		L();
		am();
		((Class_ra_Sub2) this).aClass61_Sub1_8553 = new Class61_Sub1(this, anInterface11_Impl3_8551);
		((Class_ra_Sub2) this).aClass61_Sub1_8554 = new Class61_Sub1(this, (((Class_ra_Sub2) this).anInterface11_Impl3_8503));
		ba(3, 0);
	}

	public final Class92 cl(int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_) {
		return new Class92_Sub1_Sub1(this, i, i_32_, i_33_, i_34_, i_35_, i_36_);
	}

	public final void cf(Class92 class92) {
		((Class_ra_Sub2) this).aClass92_Sub1_8570 = (Class92_Sub1) class92;
	}

	public final Class61 ht(int i, int i_37_, int i_38_, int i_39_, boolean bool) {
		Class61_Sub1 class61_sub1 = new Class61_Sub1(this, i_38_, i_39_, bool, false);
		class61_sub1.method737(0, 0, i_38_, i_39_, i, i_37_);
		return class61_sub1;
	}

	public void ae(int i, int i_40_, int i_41_, int i_42_) {
		((Class_ra_Sub2) this).anInt8597 = i;
		((Class_ra_Sub2) this).anInt8510 = i_40_;
		((Class_ra_Sub2) this).anInt8511 = i_41_;
		((Class_ra_Sub2) this).anInt8512 = i_42_;
		method5018();
	}

	public void GA(float f, float f_43_) {
		((Class_ra_Sub2) this).aFloat8608 = f;
		((Class_ra_Sub2) this).aFloat8457 = f_43_;
		method5018();
	}

	public final void qa(int[] is) {
		is[0] = anInt8610;
		is[1] = anInt8521;
		is[2] = anInt8447;
		is[3] = anInt8506;
	}

	public final void L() {
		if (aClass76_4228 != null) {
			anInt8521 = 0;
			anInt8610 = 0;
			anInt8447 = aClass76_4228.method856();
			anInt8506 = aClass76_4228.method857();
		} else {
			anInt8506 = 0;
			anInt8447 = 0;
			anInt8521 = 0;
			anInt8610 = 0;
		}
		if (aBoolean8612) {
			aBoolean8612 = false;
			method4914();
		}
	}

	public final void ke() {
		if (aClass76_4228 != null) {
			anInt8521 = 0;
			anInt8610 = 0;
			anInt8447 = aClass76_4228.method856();
			anInt8506 = aClass76_4228.method857();
		} else {
			anInt8506 = 0;
			anInt8447 = 0;
			anInt8521 = 0;
			anInt8610 = 0;
		}
		if (aBoolean8612) {
			aBoolean8612 = false;
			method4914();
		}
	}

	public final void o(int i, int i_44_, int i_45_, int i_46_) {
		int i_47_;
		int i_48_;
		if (aClass76_4228 != null) {
			i_48_ = aClass76_4228.method856();
			i_47_ = aClass76_4228.method857();
		} else {
			i_47_ = 0;
			i_48_ = 0;
		}
		i = i >= 0 ? i : 0;
		i_45_ = i_45_ <= i_48_ ? i_45_ : i_48_;
		i_44_ = i_44_ >= 0 ? i_44_ : 0;
		i_46_ = i_46_ <= i_47_ ? i_46_ : i_47_;
		boolean bool = false;
		if (anInt8610 < i) {
			anInt8610 = i;
			bool = true;
		}
		if (anInt8447 > i_45_) {
			anInt8447 = i_45_;
			bool = true;
		}
		if (anInt8521 < i_44_) {
			anInt8521 = i_44_;
			bool = true;
		}
		if (anInt8506 > i_46_) {
			anInt8506 = i_46_;
			bool = true;
		}
		if (bool) {
			if (!aBoolean8612 && (((Class_ra_Sub2) this).aBoolean8555 || method4903() == Class161.aClass161_1688)) {
				aBoolean8612 = true;
				method4914();
			}
			method4913();
		}
	}

	public void method4911() {
		if (((Class_ra_Sub2) this).aClass187_8556 != null)
			((Class_ra_Sub2) this).aClass187_8556.method2090();
	}

	abstract void method4912();

	abstract void method4913();

	abstract void method4914();

	final Class249 method4915() {
		if (((Class_ra_Sub2) this).aClass174_8483 == Class174.aClass174_1735)
			return aClass249_8472;
		return aClass249_8508;
	}

	final Class249 method4916() {
		if (((Class_ra_Sub2) this).aClass174_8483 == Class174.aClass174_1735)
			return ((Class_ra_Sub2) this).aClass249_8473;
		return aClass249_8508;
	}

	public final void cw(Class247 class247) {
		((Class_ra_Sub2) this).aClass247_8524 = class247;
		aClass249_8472.method2508(((Class_ra_Sub2) this).aClass247_8524);
		((Class_ra_Sub2) this).aClass247_8596.method2454(class247);
		((Class_ra_Sub2) this).aClass247_8596.method2459();
		((Class_ra_Sub2) this).aClass249_8473.method2508(((Class_ra_Sub2) this).aClass247_8596);
		method4918();
		if (((Class_ra_Sub2) this).aClass174_8483 == Class174.aClass174_1735)
			method4919();
	}

	public Class247 cq() {
		return ((Class_ra_Sub2) this).aClass247_8524;
	}

	public abstract void method4917(Class249 class249);

	final void method4918() {
		((Class_ra_Sub2) this).aClass249_8492.method2510(aClass249_8472);
		((Class_ra_Sub2) this).aClass249_8492.method2483(((Class_ra_Sub2) this).aClass249_8488);
		((Class_ra_Sub2) this).aClass249_8492.method2499(((Class_ra_Sub2) this).aFloatArrayArray8494[0]);
		((Class_ra_Sub2) this).aClass249_8492.method2500(((Class_ra_Sub2) this).aFloatArrayArray8494[1]);
		((Class_ra_Sub2) this).aClass249_8492.method2497(((Class_ra_Sub2) this).aFloatArrayArray8494[2]);
		((Class_ra_Sub2) this).aClass249_8492.method2515(((Class_ra_Sub2) this).aFloatArrayArray8494[3]);
		((Class_ra_Sub2) this).aClass249_8492.method2512(((Class_ra_Sub2) this).aFloatArrayArray8494[4]);
		((Class_ra_Sub2) this).aClass249_8492.method2498(((Class_ra_Sub2) this).aFloatArrayArray8494[5]);
		aClass249_8493.method2510(((Class_ra_Sub2) this).aClass249_8492);
		method5103(aClass249_8493);
	}

	public final Class249 cs() {
		return ((Class_ra_Sub2) this).aClass249_8488;
	}

	final void method4919() {
		((Class_ra_Sub2) this).aBoolean8482 = false;
	}

	Class249 method4920() {
		if (((Class_ra_Sub2) this).aClass174_8483 == Class174.aClass174_1735) {
			if (!((Class_ra_Sub2) this).aBoolean8482)
				method4972();
			return ((Class_ra_Sub2) this).aClass249_8475;
		}
		return ((Class_ra_Sub2) this).aClass249_8469;
	}

	final Class249 method4921() {
		return aClass249_8493;
	}

	final Class249 method4922() {
		return aClass249_8491;
	}

	public abstract Class105 method4923(String string);

	final void method4924() {
		if (((Class_ra_Sub2) this).aClass174_8483 != Class174.aClass174_1736) {
			Class174 class174 = ((Class_ra_Sub2) this).aClass174_8483;
			((Class_ra_Sub2) this).aClass174_8483 = Class174.aClass174_1736;
			if (class174 == Class174.aClass174_1735)
				method4919();
			((Class_ra_Sub2) this).aClass249_8577 = ((Class_ra_Sub2) this).aClass249_8477;
			method4930();
			method5018();
			((Class_ra_Sub2) this).anInt8540 &= ~0xf;
		}
	}

	final void method4925() {
		if (((Class_ra_Sub2) this).aClass174_8483 != Class174.aClass174_1737) {
			Class174 class174 = ((Class_ra_Sub2) this).aClass174_8483;
			((Class_ra_Sub2) this).aClass174_8483 = Class174.aClass174_1737;
			if (class174 == Class174.aClass174_1735)
				method4919();
			method5085();
			((Class_ra_Sub2) this).aClass249_8577 = ((Class_ra_Sub2) this).aClass249_8485;
			method4930();
			method5018();
			((Class_ra_Sub2) this).anInt8540 &= ~0x8;
		}
	}

	public final void fg(int i, int i_49_, int i_50_, int i_51_) {
		int i_52_;
		int i_53_;
		if (aClass76_4228 != null) {
			i_53_ = aClass76_4228.method856();
			i_52_ = aClass76_4228.method857();
		} else {
			i_52_ = 0;
			i_53_ = 0;
		}
		if (i <= 0 && i_50_ >= i_53_ - 1 && i_49_ <= 0 && i_51_ >= i_52_ - 1)
			L();
		else {
			anInt8610 = i >= 0 ? i : 0;
			anInt8447 = i_50_ <= i_53_ ? i_50_ : i_53_;
			anInt8521 = i_49_ >= 0 ? i_49_ : 0;
			anInt8506 = i_51_ <= i_52_ ? i_51_ : i_52_;
			if (!aBoolean8612 && (((Class_ra_Sub2) this).aBoolean8555 || method4903() == Class161.aClass161_1688)) {
				aBoolean8612 = true;
				method4914();
			}
			method4913();
		}
	}

	public abstract void method4926(Class184 class184);

	abstract void method4927(int i, Class175 class175, boolean bool);

	public abstract Class105 method4928(String string);

	final void method4929() {
		if (!((Class_ra_Sub2) this).aBoolean8487)
			((Class_ra_Sub2) this).aBoolean8487 = true;
	}

	final void method4930() {
		aClass249_8491.method2510(((Class_ra_Sub2) this).aClass249_8577);
		method5103(aClass249_8491);
		aFloat8504 = ((aClass249_8491.aFloatArray2631[14] - aClass249_8491.aFloatArray2631[15]) / (aClass249_8491.aFloatArray2631[11] - aClass249_8491.aFloatArray2631[10]));
		aFloat8471 = (-aClass249_8491.aFloatArray2631[14] / aClass249_8491.aFloatArray2631[10]);
		method5015();
	}

	public final void RA(boolean bool) {
		aBoolean8519 = bool;
		method4933();
	}

	abstract Class184 method4931(Class193[] class193s);

	void u() {
		if (!((Class_ra_Sub2) this).aBoolean8589) {
			method4998();
			((Class_ra_Sub2) this).aClass188_8552.method2096();
			for (Class330 class330 = ((Class_ra_Sub2) this).aClass471_8464.method5869(539664854); class330 != null; class330 = ((Class_ra_Sub2) this).aClass471_8464.method5873((byte) -68))
				((Class_v_Sub1) class330).method3872();
			Class95_Sub12.method1137(false, true, -1141041502);
			for (int i = 0; i < ((Class_ra_Sub2) this).aClass164Array8558.length; i++) {
				if (((Class_ra_Sub2) this).aClass164Array8558[i] != null) {
					((Class_ra_Sub2) this).aClass164Array8558[i].method1932();
					((Class_ra_Sub2) this).aClass164Array8558[i] = null;
				}
			}
			for (int i = 0; i < ((Class_ra_Sub2) this).aClass192Array8569.length; i++) {
				if (((Class_ra_Sub2) this).aClass192Array8569[i] != null) {
					((Class_ra_Sub2) this).aClass192Array8569[i].method2122();
					((Class_ra_Sub2) this).aClass192Array8569[i] = null;
				}
			}
			method4884();
			g(0);
			((Class_ra_Sub2) this).aBoolean8589 = true;
		}
	}

	abstract void method4932();

	abstract void method4933();

	public void method_do(float f, float f_54_, float f_55_, float[] fs) {
		float f_56_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[15] + ((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[3] * f + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[7] * f_54_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[11] * f_55_));
		float f_57_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[12] + ((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[0] * f + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[4] * f_54_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[8] * f_55_));
		float f_58_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[13] + ((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[1] * f + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[5] * f_54_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[9] * f_55_));
		float f_59_ = (aClass249_8472.aFloatArray2631[14] + aClass249_8472.aFloatArray2631[2] * f + aClass249_8472.aFloatArray2631[6] * f_54_ + aClass249_8472.aFloatArray2631[10] * f_55_);
		fs[0] = (((Class_ra_Sub2) this).aFloat8495 + ((Class_ra_Sub2) this).aFloat8505 * f_57_ / f_56_);
		fs[1] = (((Class_ra_Sub2) this).aFloat8497 + ((Class_ra_Sub2) this).aFloat8498 * f_58_ / f_56_);
		fs[2] = f_59_;
	}

	public int bp(int i, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_) {
		int i_65_ = 0;
		float f = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[14] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[2] * (float) i) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[6] * (float) i_60_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[10] * (float) i_61_));
		float f_66_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[14] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[2] * (float) i_62_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[6] * (float) i_63_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[10] * (float) i_64_));
		float f_67_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[15] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[3] * (float) i) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[7] * (float) i_60_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[11] * (float) i_61_));
		float f_68_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[15] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[3] * (float) i_62_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[7] * (float) i_63_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[11] * (float) i_64_));
		if (f < -f_67_ && f_66_ < -f_68_)
			i_65_ |= 0x10;
		else if (f > f_67_ && f_66_ > f_68_)
			i_65_ |= 0x20;
		float f_69_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[12] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[0] * (float) i) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[4] * (float) i_60_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[8] * (float) i_61_));
		float f_70_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[12] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[0] * (float) i_62_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[4] * (float) i_63_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[8] * (float) i_64_));
		if (f_69_ < -f_67_ && f_70_ < -f_68_)
			i_65_ |= 0x1;
		if (f_69_ > f_67_ && f_70_ > f_68_)
			i_65_ |= 0x2;
		float f_71_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[13] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[1] * (float) i) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[5] * (float) i_60_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[9] * (float) i_61_));
		float f_72_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[13] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[1] * (float) i_62_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[5] * (float) i_63_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[9] * (float) i_64_));
		if (f_71_ < -f_67_ && f_72_ < -f_68_)
			i_65_ |= 0x4;
		if (f_71_ > f_67_ && f_72_ > f_68_)
			i_65_ |= 0x8;
		return i_65_;
	}

	public final int cr() {
		return anInt8593 - 2;
	}

	abstract void method4934();

	public final void ck(int i, Class330_Sub14[] class330_sub14s) {
		for (int i_73_ = 0; i_73_ < i; i_73_++)
			aClass330_Sub14Array8607[i_73_] = class330_sub14s[i_73_];
		anInt8538 = i;
		if (((Class_ra_Sub2) this).aClass174_8483 == Class174.aClass174_1735)
			method5007();
	}

	public void method4935() {
		if (((Class_ra_Sub2) this).aClass187_8556 != null)
			((Class_ra_Sub2) this).aClass187_8556.method2085();
	}

	public final void m(int i, float f, float f_74_, float f_75_, float f_76_, float f_77_) {
		boolean bool = ((Class_ra_Sub2) this).anInt8529 != i;
		if (bool || aFloat8489 != f || aFloat8535 != f_74_) {
			((Class_ra_Sub2) this).anInt8529 = i;
			aFloat8489 = f;
			aFloat8535 = f_74_;
			if (bool) {
				aFloat8530 = (float) (((Class_ra_Sub2) this).anInt8529 & 0xff0000) / 1.671168E7F;
				aFloat8500 = (float) (((Class_ra_Sub2) this).anInt8529 & 0xff00) / 65280.0F;
				aFloat8532 = ((float) (((Class_ra_Sub2) this).anInt8529 & 0xff) / 255.0F);
				method4937();
			}
			method4938();
		}
		if (((Class_ra_Sub2) this).aFloatArray8462[0] != f_75_ || ((Class_ra_Sub2) this).aFloatArray8462[1] != f_76_ || ((Class_ra_Sub2) this).aFloatArray8462[2] != f_77_) {
			((Class_ra_Sub2) this).aFloatArray8462[0] = f_75_;
			((Class_ra_Sub2) this).aFloatArray8462[1] = f_76_;
			((Class_ra_Sub2) this).aFloatArray8462[2] = f_77_;
			((Class_ra_Sub2) this).aFloatArray8528[0] = -f_75_;
			((Class_ra_Sub2) this).aFloatArray8528[1] = -f_76_;
			((Class_ra_Sub2) this).aFloatArray8528[2] = -f_77_;
			float f_78_ = (float) (1.0 / Math.sqrt((double) (f_75_ * f_75_ + f_76_ * f_76_ + f_77_ * f_77_)));
			aFloatArray8525[0] = f_75_ * f_78_;
			aFloatArray8525[1] = f_76_ * f_78_;
			aFloatArray8525[2] = f_77_ * f_78_;
			aFloatArray8451[0] = -aFloatArray8525[0];
			aFloatArray8451[1] = -aFloatArray8525[1];
			aFloatArray8451[2] = -aFloatArray8525[2];
			method4959();
			((Class_ra_Sub2) this).anInt8541 = (int) (f_75_ * 256.0F / f_76_);
			((Class_ra_Sub2) this).anInt8599 = (int) (f_77_ * 256.0F / f_76_);
		}
		method4939();
	}

	public final void J(int i) {
		((Class_ra_Sub2) this).anInt8536 = 0;
		for (/**/; i > 1; i >>= 1)
			((Class_ra_Sub2) this).anInt8536++;
		((Class_ra_Sub2) this).anInt8539 = 1 << ((Class_ra_Sub2) this).anInt8536;
	}

	abstract void method4936();

	abstract void method4937();

	abstract void method4938();

	public final boolean v() {
		return ((Class_ra_Sub2) this).aClass192Array8569[1] != null;
	}

	abstract void method4939();

	abstract void method4940();

	public abstract void method4941(Class249 class249, Class249 class249_79_, Class249 class249_80_);

	byte[] method4942(String string, String string_81_) {
		return ((Class_ra_Sub2) this).aClass280_8527.method2780(string, string_81_);
	}

	public final void method4943() {
		if (((Class_ra_Sub2) this).anInt8540 != 2) {
			method4925();
			method4882(false);
			method4995(false);
			method5005(false);
			method4962(false);
			((Class_ra_Sub2) this).anInt8540 = 2;
		}
	}

	final Interface11_Impl3 method4944(int i, int i_82_, boolean bool, int[] is) {
		return method4950(i, i_82_, bool, is, 0, 0);
	}

	final Interface11_Impl3 method4945(Class72 class72, int i, int i_83_, boolean bool, byte[] is) {
		return method4948(class72, i, i_83_, bool, is, 0, 0);
	}

	final Interface11_Impl3 method4946(Class72 class72, int i, int i_84_, boolean bool, float[] fs) {
		return method4949(class72, i, i_84_, bool, fs, 0, 0);
	}

	abstract void method4947(int i);

	abstract Interface11_Impl3 method4948(Class72 class72, int i, int i_85_, boolean bool, byte[] is, int i_86_, int i_87_);

	abstract Interface11_Impl3 method4949(Class72 class72, int i, int i_88_, boolean bool, float[] fs, int i_89_, int i_90_);

	abstract Interface11_Impl3 method4950(int i, int i_91_, boolean bool, int[] is, int i_92_, int i_93_);

	abstract Interface11_Impl1 method4951(int i, boolean bool, int[][] is);

	abstract Interface11_Impl2 method4952(Class72 class72, int i, int i_94_, int i_95_, boolean bool, byte[] is);

	abstract Interface11_Impl3_Impl1 method4953(Class72 class72, Class86 class86, int i, int i_96_);

	public final int method4954() {
		return anInt8543;
	}

	public final void method4955(int i) {
		if (anInt8543 != i) {
			anInt8543 = i;
			method4988();
		}
	}

	public final void method4956(Interface11 interface11) {
		if (((Class_ra_Sub2) this).anInterface11Array8549[anInt8543] != interface11) {
			((Class_ra_Sub2) this).anInterface11Array8549[anInt8543] = interface11;
			if (interface11 != null)
				interface11.method166();
			else
				anInterface11_Impl3_8551.method166();
			((Class_ra_Sub2) this).anInt8540 &= ~0x1;
		}
	}

	abstract Interface11_Impl1 method4957(int i, boolean bool, int[][] is);

	public void method4787(boolean bool) {
		((Class_ra_Sub2) this).aBoolean8555 = bool;
	}

	public final void method4958(Class179 class179, Class179 class179_97_) {
		boolean bool = false;
		if (aClass179Array8547[anInt8543] != class179) {
			aClass179Array8547[anInt8543] = class179;
			method5053();
			bool = true;
		}
		if (aClass179Array8548[anInt8543] != class179_97_) {
			aClass179Array8548[anInt8543] = class179_97_;
			method4968();
			bool = true;
		}
		if (bool)
			((Class_ra_Sub2) this).anInt8540 &= ~0xd;
	}

	abstract void method4959();

	abstract void method4960();

	public final void method4961(int i, Class175 class175) {
		method4927(i, class175, false);
	}

	public final Class61 hf(int i, int i_98_, int i_99_, int i_100_, boolean bool) {
		Class61_Sub1 class61_sub1 = new Class61_Sub1(this, i_99_, i_100_, bool, false);
		class61_sub1.method737(0, 0, i_99_, i_100_, i, i_98_);
		return class61_sub1;
	}

	final void method4962(boolean bool) {
		if (bool != aBoolean8454) {
			aBoolean8454 = bool;
			method4933();
			((Class_ra_Sub2) this).anInt8540 &= ~0xf;
		}
	}

	public final void hn(int i) {
		/* empty */
	}

	public final Class249 method4963() {
		return aClass249Array8545[anInt8543];
	}

	public final void method4964(Class181 class181) {
		aClass181Array8509[anInt8543] = class181;
		method4966();
	}

	final void method4965() {
		if (aClass181Array8509[anInt8543] != Class181.aClass181_1784) {
			aClass181Array8509[anInt8543] = Class181.aClass181_1784;
			aClass249Array8545[anInt8543].method2516();
			method4966();
		}
	}

	final void method4966() {
		method5076();
	}

	abstract void method4967();

	public void dr(float f, float f_101_, float f_102_, float[] fs) {
		float f_103_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[14] + ((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[2] * f + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[6] * f_101_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[10] * f_102_));
		float f_104_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[15] + ((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[3] * f + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[7] * f_101_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[11] * f_102_));
		if (f_103_ < -f_104_ || f_103_ > f_104_) {
			float[] fs_105_ = fs;
			float[] fs_106_ = fs;
			fs[2] = Float.NaN;
			fs_106_[1] = Float.NaN;
			fs_105_[0] = Float.NaN;
		} else {
			float f_107_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[12] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[0] * f) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[4] * f_101_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[8] * f_102_));
			if (f_107_ < -f_104_ || f_107_ > f_104_) {
				float[] fs_108_ = fs;
				float[] fs_109_ = fs;
				fs[2] = Float.NaN;
				fs_109_[1] = Float.NaN;
				fs_108_[0] = Float.NaN;
			} else {
				float f_110_ = ((((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[13]) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[1]) * f + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[5]) * f_101_ + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[9]) * f_102_);
				if (f_110_ < -f_104_ || f_110_ > f_104_) {
					float[] fs_111_ = fs;
					float[] fs_112_ = fs;
					fs[2] = Float.NaN;
					fs_112_[1] = Float.NaN;
					fs_111_[0] = Float.NaN;
				} else {
					float f_113_ = (aClass249_8472.aFloatArray2631[14] + aClass249_8472.aFloatArray2631[2] * f + aClass249_8472.aFloatArray2631[6] * f_101_ + aClass249_8472.aFloatArray2631[10] * f_102_);
					fs[0] = (((Class_ra_Sub2) this).aFloat8495 + (((Class_ra_Sub2) this).aFloat8505 * f_107_ / f_104_));
					fs[1] = (((Class_ra_Sub2) this).aFloat8497 + (((Class_ra_Sub2) this).aFloat8498 * f_110_ / f_104_));
					fs[2] = f_113_;
				}
			}
		}
	}

	public final boolean y() {
		return true;
	}

	abstract void method4968();

	Class77 method4969() {
		return ((Class_ra_Sub2) this).aClass77_8456;
	}

	public final void dz(int i, Class77 class77) {
		if (!((Class_ra_Sub2) this).aBoolean8571)
			throw new RuntimeException("");
		((Class_ra_Sub2) this).anInt8573 = i;
		((Class_ra_Sub2) this).aClass77_8456 = class77;
		if (((Class_ra_Sub2) this).aBoolean8572) {
			((Class_ra_Sub2) this).aClass164Array8558[3].method1930();
			((Class_ra_Sub2) this).aClass164Array8558[3].method1929();
		}
	}

	final void ju(float f, float f_114_, float f_115_, float f_116_, float f_117_, float f_118_) {
		Class192_Sub1.aFloat7341 = f;
		Class192_Sub1.aFloat7340 = f_114_;
		Class192_Sub1.aFloat7339 = f_115_;
		Class192_Sub1.aFloat7342 = f_118_;
	}

	final void method4970(int i) {
		if (((Class_ra_Sub2) this).anInt8582 != i) {
			Class176 class176;
			boolean bool;
			boolean bool_119_;
			if (i == 1) {
				class176 = Class176.aClass176_1745;
				bool = true;
				bool_119_ = true;
			} else if (i == 2) {
				class176 = Class176.aClass176_1744;
				bool = false;
				bool_119_ = true;
			} else if (i == 128) {
				class176 = Class176.aClass176_1743;
				bool = true;
				bool_119_ = true;
			} else {
				class176 = Class176.aClass176_1747;
				bool = false;
				bool_119_ = false;
			}
			if (bool != aBoolean8585) {
				aBoolean8585 = bool;
				method4973();
			}
			if (bool_119_ != aBoolean8546) {
				aBoolean8546 = bool_119_;
				method5112();
			}
			if (class176 != aClass176_8583) {
				aClass176_8583 = class176;
				method5014();
			}
			((Class_ra_Sub2) this).anInt8582 = i;
			((Class_ra_Sub2) this).anInt8540 &= ~0xc;
		}
	}

	final void method4971(int i) {
		if (anInt8613 != i) {
			anInt8613 = i;
			method5014();
		}
	}

	Class247 method4972() {
		if (((Class_ra_Sub2) this).aClass174_8483 == Class174.aClass174_1735) {
			if (!((Class_ra_Sub2) this).aBoolean8482) {
				((Class_ra_Sub2) this).aClass247_8584.method2454(((Class_ra_Sub2) this).aClass247_8468);
				((Class_ra_Sub2) this).aClass247_8584.method2467(((Class_ra_Sub2) this).aClass247_8524);
				((Class_ra_Sub2) this).aClass249_8475.method2508(((Class_ra_Sub2) this).aClass247_8584);
				((Class_ra_Sub2) this).aBoolean8482 = true;
			}
			return ((Class_ra_Sub2) this).aClass247_8584;
		}
		return ((Class_ra_Sub2) this).aClass247_8468;
	}

	abstract void method4973();

	public final void is(Class92 class92) {
		((Class_ra_Sub2) this).aClass92_Sub1_8570 = (Class92_Sub1) class92;
	}

	public final void gb(int i, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, byte[] is, int i_125_, int i_126_) {
		/* empty */
	}

	abstract void method4974();

	public final void gl(int i, int i_127_, int i_128_, int i_129_, int i_130_) {
		br(i, i_127_, i, i_127_ + i_128_, i_129_, i_130_);
	}

	abstract Interface9_Impl2 method4975(boolean bool);

	abstract Interface9_Impl1 method4976(boolean bool);

	abstract Class184 method4977(Class193[] class193s);

	public abstract void method4978(Class184 class184);

	public void jl(float f, float f_131_, float f_132_, float[] fs) {
		float f_133_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[14] + ((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[2] * f + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[6] * f_131_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[10] * f_132_));
		float f_134_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[15] + ((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[3] * f + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[7] * f_131_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[11] * f_132_));
		if (f_133_ < -f_134_ || f_133_ > f_134_) {
			float[] fs_135_ = fs;
			float[] fs_136_ = fs;
			fs[2] = Float.NaN;
			fs_136_[1] = Float.NaN;
			fs_135_[0] = Float.NaN;
		} else {
			float f_137_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[12] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[0] * f) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[4] * f_131_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[8] * f_132_));
			if (f_137_ < -f_134_ || f_137_ > f_134_) {
				float[] fs_138_ = fs;
				float[] fs_139_ = fs;
				fs[2] = Float.NaN;
				fs_139_[1] = Float.NaN;
				fs_138_[0] = Float.NaN;
			} else {
				float f_140_ = ((((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[13]) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[1]) * f + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[5]) * f_131_ + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[9]) * f_132_);
				if (f_140_ < -f_134_ || f_140_ > f_134_) {
					float[] fs_141_ = fs;
					float[] fs_142_ = fs;
					fs[2] = Float.NaN;
					fs_142_[1] = Float.NaN;
					fs_141_[0] = Float.NaN;
				} else {
					float f_143_ = (aClass249_8472.aFloatArray2631[14] + aClass249_8472.aFloatArray2631[2] * f + aClass249_8472.aFloatArray2631[6] * f_131_ + aClass249_8472.aFloatArray2631[10] * f_132_);
					fs[0] = (((Class_ra_Sub2) this).aFloat8495 + (((Class_ra_Sub2) this).aFloat8505 * f_137_ / f_134_));
					fs[1] = (((Class_ra_Sub2) this).aFloat8497 + (((Class_ra_Sub2) this).aFloat8498 * f_140_ / f_134_));
					fs[2] = f_143_;
				}
			}
		}
	}

	abstract void method4979(Interface9_Impl2 interface9_impl2);

	public final void DA(int i, Class_ta class_ta, int i_144_, int i_145_) {
		RA(false);
		((Class_ra_Sub2) this).aClass61_Sub1_8554.method703(0.0F, 0.0F, (float) method4782((byte) 0).method856(), 0.0F, 0.0F, (float) method4782((byte) 0).method857(), 0, class_ta, i_144_, i_145_);
		RA(true);
	}

	public final void B(int i, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_) {
		if (aBoolean8519) {
			RA(false);
			((Class_ra_Sub2) this).aClass61_Sub1_8553.method691(i, i_146_, i_147_, i_148_, 0, i_149_, i_150_);
			RA(true);
		} else
			((Class_ra_Sub2) this).aClass61_Sub1_8553.method691(i, i_146_, i_147_, i_148_, 0, i_149_, i_150_);
	}

	public final void bl(int i, int i_151_, int i_152_, int i_153_, int i_154_, int i_155_) {
		i_152_--;
		i_153_--;
		int i_156_ = 0;
		if (this instanceof Class_ra_Sub2_Sub1)
			i_156_ = -1;
		br(i, i_151_ + i_156_, i + i_152_, i_151_ + i_156_, i_154_, i_155_);
		br(i, i_151_ + i_153_ + i_156_, i + i_152_, i_151_ + i_153_ + i_156_, i_154_, i_155_);
		br(i, i_151_, i, i_151_ + i_153_, i_154_, i_155_);
		br(i + i_152_, i_151_, i + i_152_, i_151_ + i_153_, i_154_, i_155_);
	}

	public final void N(int i, int i_157_, int i_158_, int i_159_, int i_160_, int i_161_, byte[] is, int i_162_, int i_163_) {
		/* empty */
	}

	public final void bk(int i, int i_164_, float f, int i_165_, int i_166_, float f_167_, int i_168_, int i_169_, float f_170_, int i_171_, int i_172_, int i_173_, int i_174_) {
		/* empty */
	}

	final void CA(int i, int i_175_, int i_176_, int i_177_, int i_178_) {
		/* empty */
	}

	public final void XA(int i, int i_179_, int i_180_, int i_181_, int i_182_) {
		br(i, i_179_, i + i_180_, i_179_, i_181_, i_182_);
	}

	Class249 method4980() {
		return ((Class_ra_Sub2) this).aClass249_8469;
	}

	public final void br(int i, int i_183_, int i_184_, int i_185_, int i_186_, int i_187_) {
		by(i, i_183_, i_184_, i_185_, i_186_, 1, i_187_);
	}

	abstract void method4981();

	public void be(int i, int i_188_, int i_189_, int i_190_, int i_191_, int i_192_, Class_ta class_ta, int i_193_, int i_194_, int i_195_, int i_196_, int i_197_) {
		/* empty */
	}

	public final void bi(int i, int i_198_, int i_199_, int i_200_, int i_201_, int i_202_, Class_ta class_ta, int i_203_, int i_204_) {
		/* empty */
	}

	public final void by(int i, int i_205_, int i_206_, int i_207_, int i_208_, int i_209_, int i_210_) {
		i += 1.0F;
		i_205_ += 1.0F;
		i_206_ += 1.0F;
		i_207_ += 1.0F;
		float f = (float) (i_206_ - i);
		float f_211_ = (float) (i_207_ - i_205_);
		float f_212_ = 1.0F / (float) Math.sqrt((double) (f * f + f_211_ * f_211_));
		f *= f_212_;
		f_211_ *= f_212_;
		i -= f;
		i_205_ -= f_211_;
		float f_213_ = -f_211_;
		float f_214_ = f;
		f_213_ *= 0.5F * (float) i_209_;
		f_214_ *= 0.5F * (float) i_209_;
		((Class_ra_Sub2) this).aClass61_Sub1_8553.method715((float) i - f_213_, (float) i_205_ - f_214_, (float) i_206_ - f_213_, (float) i_207_ - f_214_, (float) i + f_213_, (float) i_205_ + f_214_, 0, i_208_, i_210_);
	}

	public final void cm(Class81 class81) {
		((Class_ra_Sub2) this).aClass186_8455.method2079(this, class81);
	}

	final void method4982() {
		method5081(0, ((Class_ra_Sub2) this).anInterface9_Impl1_8587);
		method4978(((Class_ra_Sub2) this).aClass184_8602);
		method4898(Class199.aClass199_1930, 0, 1);
	}

	public final void method4983() {
		method4984(Class199.aClass199_1929, 2);
	}

	final void method4984(Class199 class199, int i) {
		method5081(0, ((Class_ra_Sub2) this).anInterface9_Impl1_8600);
		method4978(((Class_ra_Sub2) this).aClass184_8603);
		method4898(class199, 0, i);
	}

	abstract void method4985(Interface9_Impl2 interface9_impl2, Class199 class199, int i, int i_215_, int i_216_, int i_217_);

	final void method4986() {
		((Class_ra_Sub2) this).anInterface9_Impl1_8587 = method4976(true);
		((Class_ra_Sub2) this).anInterface9_Impl1_8587.method142(24, 12);
		((Class_ra_Sub2) this).aClass184_8602 = method4977(new Class193[] { new Class193(Class191.aClass191_1863) });
	}

	public abstract void method4987(Class199 class199, int i, int i_218_, int i_219_, int i_220_);

	abstract void method4988();

	abstract void method4989();

	abstract void method4990(int i);

	static {
		aClass249_8508 = new Class249();
	}

	void dd() {
		if (!((Class_ra_Sub2) this).aBoolean8589) {
			method4998();
			((Class_ra_Sub2) this).aClass188_8552.method2096();
			for (Class330 class330 = ((Class_ra_Sub2) this).aClass471_8464.method5869(539664854); class330 != null; class330 = ((Class_ra_Sub2) this).aClass471_8464.method5873((byte) -24))
				((Class_v_Sub1) class330).method3872();
			Class95_Sub12.method1137(false, true, 2006123752);
			for (int i = 0; i < ((Class_ra_Sub2) this).aClass164Array8558.length; i++) {
				if (((Class_ra_Sub2) this).aClass164Array8558[i] != null) {
					((Class_ra_Sub2) this).aClass164Array8558[i].method1932();
					((Class_ra_Sub2) this).aClass164Array8558[i] = null;
				}
			}
			for (int i = 0; i < ((Class_ra_Sub2) this).aClass192Array8569.length; i++) {
				if (((Class_ra_Sub2) this).aClass192Array8569[i] != null) {
					((Class_ra_Sub2) this).aClass192Array8569[i].method2122();
					((Class_ra_Sub2) this).aClass192Array8569[i] = null;
				}
			}
			method4884();
			g(0);
			((Class_ra_Sub2) this).aBoolean8589 = true;
		}
	}

	void de() {
		if (!((Class_ra_Sub2) this).aBoolean8589) {
			method4998();
			((Class_ra_Sub2) this).aClass188_8552.method2096();
			for (Class330 class330 = ((Class_ra_Sub2) this).aClass471_8464.method5869(539664854); class330 != null; class330 = ((Class_ra_Sub2) this).aClass471_8464.method5873((byte) -21))
				((Class_v_Sub1) class330).method3872();
			Class95_Sub12.method1137(false, true, 1332184512);
			for (int i = 0; i < ((Class_ra_Sub2) this).aClass164Array8558.length; i++) {
				if (((Class_ra_Sub2) this).aClass164Array8558[i] != null) {
					((Class_ra_Sub2) this).aClass164Array8558[i].method1932();
					((Class_ra_Sub2) this).aClass164Array8558[i] = null;
				}
			}
			for (int i = 0; i < ((Class_ra_Sub2) this).aClass192Array8569.length; i++) {
				if (((Class_ra_Sub2) this).aClass192Array8569[i] != null) {
					((Class_ra_Sub2) this).aClass192Array8569[i].method2122();
					((Class_ra_Sub2) this).aClass192Array8569[i] = null;
				}
			}
			method4884();
			g(0);
			((Class_ra_Sub2) this).aBoolean8589 = true;
		}
	}

	void dn() {
		if (!((Class_ra_Sub2) this).aBoolean8589) {
			method4998();
			((Class_ra_Sub2) this).aClass188_8552.method2096();
			for (Class330 class330 = ((Class_ra_Sub2) this).aClass471_8464.method5869(539664854); class330 != null; class330 = ((Class_ra_Sub2) this).aClass471_8464.method5873((byte) 7))
				((Class_v_Sub1) class330).method3872();
			Class95_Sub12.method1137(false, true, 1566762825);
			for (int i = 0; i < ((Class_ra_Sub2) this).aClass164Array8558.length; i++) {
				if (((Class_ra_Sub2) this).aClass164Array8558[i] != null) {
					((Class_ra_Sub2) this).aClass164Array8558[i].method1932();
					((Class_ra_Sub2) this).aClass164Array8558[i] = null;
				}
			}
			for (int i = 0; i < ((Class_ra_Sub2) this).aClass192Array8569.length; i++) {
				if (((Class_ra_Sub2) this).aClass192Array8569[i] != null) {
					((Class_ra_Sub2) this).aClass192Array8569[i].method2122();
					((Class_ra_Sub2) this).aClass192Array8569[i] = null;
				}
			}
			method4884();
			g(0);
			((Class_ra_Sub2) this).aBoolean8589 = true;
		}
	}

	public void method4796() {
		if (((Class_ra_Sub2) this).aClass187_8556 != null)
			((Class_ra_Sub2) this).aClass187_8556.method2089();
	}

	public void dw(int i) {
		if (((Class_ra_Sub2) this).aClass188_8552 != null)
			((Class_ra_Sub2) this).aClass188_8552.method2097();
		anInt8588 = i & 0x7fffffff;
	}

	public final void fb(int i, int i_221_, int i_222_, int i_223_, int i_224_, int i_225_, byte[] is, int i_226_, int i_227_) {
		/* empty */
	}

	public final void IA(float f) {
		if (aFloat8533 != f) {
			aFloat8533 = f;
			method4937();
			method4939();
		}
	}

	public final boolean er() {
		return true;
	}

	public final boolean ew() {
		return true;
	}

	public final boolean el() {
		return true;
	}

	abstract void method4991();

	abstract void method4992();

	public final boolean ei() {
		return true;
	}

	public final void fd(int i, int i_228_, int i_229_, int i_230_, int i_231_, int i_232_) {
		if (aBoolean8519) {
			RA(false);
			((Class_ra_Sub2) this).aClass61_Sub1_8553.method691(i, i_228_, i_229_, i_230_, 0, i_231_, i_232_);
			RA(true);
		} else
			((Class_ra_Sub2) this).aClass61_Sub1_8553.method691(i, i_228_, i_229_, i_230_, 0, i_231_, i_232_);
	}

	public final boolean ee() {
		return true;
	}

	public final boolean ez() {
		return true;
	}

	public final boolean ex() {
		return true;
	}

	public final void ir(Class249 class249) {
		((Class_ra_Sub2) this).aClass249_8488.method2510(class249);
		method4918();
		if (((Class_ra_Sub2) this).aClass174_8483 == Class174.aClass174_1735)
			method4930();
	}

	public final boolean ep() {
		return aBoolean8566;
	}

	public void method4993(Interface8 interface8) {
		((Class_ra_Sub2) this).aClass555_8446.method6396(interface8, anObject8520, (byte) -112);
	}

	public final boolean et() {
		return true;
	}

	public final boolean ey() {
		return true;
	}

	public final boolean eq() {
		return true;
	}

	public final boolean ek() {
		return true;
	}

	final void method4994(int i, int i_233_) {
		anInt8517 = i;
		anInt8518 = i_233_;
		method4912();
		method4913();
	}

	public final boolean eg() {
		return false;
	}

	public void fo(int i, int i_234_, int i_235_, int i_236_) {
		((Class_ra_Sub2) this).anInt8597 = i;
		((Class_ra_Sub2) this).anInt8510 = i_234_;
		((Class_ra_Sub2) this).anInt8511 = i_235_;
		((Class_ra_Sub2) this).anInt8512 = i_236_;
		method5018();
	}

	public void fj(int i, int i_237_, int i_238_, int i_239_) {
		((Class_ra_Sub2) this).anInt8597 = i;
		((Class_ra_Sub2) this).anInt8510 = i_237_;
		((Class_ra_Sub2) this).anInt8511 = i_238_;
		((Class_ra_Sub2) this).anInt8512 = i_239_;
		method5018();
	}

	public void fa(int i, int i_240_, int i_241_, int i_242_) {
		((Class_ra_Sub2) this).anInt8597 = i;
		((Class_ra_Sub2) this).anInt8510 = i_240_;
		((Class_ra_Sub2) this).anInt8511 = i_241_;
		((Class_ra_Sub2) this).anInt8512 = i_242_;
		method5018();
	}

	public void fz(float f, float f_243_) {
		((Class_ra_Sub2) this).aFloat8608 = f;
		((Class_ra_Sub2) this).aFloat8457 = f_243_;
		method5018();
	}

	public final void fc(int i, int i_244_, int i_245_, int i_246_) {
		int i_247_;
		int i_248_;
		if (aClass76_4228 != null) {
			i_248_ = aClass76_4228.method856();
			i_247_ = aClass76_4228.method857();
		} else {
			i_247_ = 0;
			i_248_ = 0;
		}
		if (i <= 0 && i_245_ >= i_248_ - 1 && i_244_ <= 0 && i_246_ >= i_247_ - 1)
			L();
		else {
			anInt8610 = i >= 0 ? i : 0;
			anInt8447 = i_245_ <= i_248_ ? i_245_ : i_248_;
			anInt8521 = i_244_ >= 0 ? i_244_ : 0;
			anInt8506 = i_246_ <= i_247_ ? i_246_ : i_247_;
			if (!aBoolean8612 && (((Class_ra_Sub2) this).aBoolean8555 || method4903() == Class161.aClass161_1688)) {
				aBoolean8612 = true;
				method4914();
			}
			method4913();
		}
	}

	final void method4995(boolean bool) {
		if (bool != aBoolean8522) {
			aBoolean8522 = bool;
			method4936();
			((Class_ra_Sub2) this).anInt8540 &= ~0x7;
		}
	}

	public final void fy(int i, int i_249_, int i_250_, int i_251_) {
		int i_252_;
		int i_253_;
		if (aClass76_4228 != null) {
			i_253_ = aClass76_4228.method856();
			i_252_ = aClass76_4228.method857();
		} else {
			i_252_ = 0;
			i_253_ = 0;
		}
		i = i >= 0 ? i : 0;
		i_250_ = i_250_ <= i_253_ ? i_250_ : i_253_;
		i_249_ = i_249_ >= 0 ? i_249_ : 0;
		i_251_ = i_251_ <= i_252_ ? i_251_ : i_252_;
		boolean bool = false;
		if (anInt8610 < i) {
			anInt8610 = i;
			bool = true;
		}
		if (anInt8447 > i_250_) {
			anInt8447 = i_250_;
			bool = true;
		}
		if (anInt8521 < i_249_) {
			anInt8521 = i_249_;
			bool = true;
		}
		if (anInt8506 > i_251_) {
			anInt8506 = i_251_;
			bool = true;
		}
		if (bool) {
			if (!aBoolean8612 && (((Class_ra_Sub2) this).aBoolean8555 || method4903() == Class161.aClass161_1688)) {
				aBoolean8612 = true;
				method4914();
			}
			method4913();
		}
	}

	public final void fe(int i, int i_254_, int i_255_, int i_256_) {
		int i_257_;
		int i_258_;
		if (aClass76_4228 != null) {
			i_258_ = aClass76_4228.method856();
			i_257_ = aClass76_4228.method857();
		} else {
			i_257_ = 0;
			i_258_ = 0;
		}
		i = i >= 0 ? i : 0;
		i_255_ = i_255_ <= i_258_ ? i_255_ : i_258_;
		i_254_ = i_254_ >= 0 ? i_254_ : 0;
		i_256_ = i_256_ <= i_257_ ? i_256_ : i_257_;
		boolean bool = false;
		if (anInt8610 < i) {
			anInt8610 = i;
			bool = true;
		}
		if (anInt8447 > i_255_) {
			anInt8447 = i_255_;
			bool = true;
		}
		if (anInt8521 < i_254_) {
			anInt8521 = i_254_;
			bool = true;
		}
		if (anInt8506 > i_256_) {
			anInt8506 = i_256_;
			bool = true;
		}
		if (bool) {
			if (!aBoolean8612 && (((Class_ra_Sub2) this).aBoolean8555 || method4903() == Class161.aClass161_1688)) {
				aBoolean8612 = true;
				method4914();
			}
			method4913();
		}
	}

	abstract boolean method4996(Class72 class72, Class86 class86);

	public final void fl(int[] is) {
		is[0] = anInt8610;
		is[1] = anInt8521;
		is[2] = anInt8447;
		is[3] = anInt8506;
	}

	public final void fv(int[] is) {
		is[0] = anInt8610;
		is[1] = anInt8521;
		is[2] = anInt8447;
		is[3] = anInt8506;
	}

	public final void ff(int[] is) {
		is[0] = anInt8610;
		is[1] = anInt8521;
		is[2] = anInt8447;
		is[3] = anInt8506;
	}

	public final void fq(int i, int i_259_, int i_260_, int i_261_, int i_262_, int i_263_) {
		i_260_--;
		i_261_--;
		int i_264_ = 0;
		if (this instanceof Class_ra_Sub2_Sub1)
			i_264_ = -1;
		br(i, i_259_ + i_264_, i + i_260_, i_259_ + i_264_, i_262_, i_263_);
		br(i, i_259_ + i_261_ + i_264_, i + i_260_, i_259_ + i_261_ + i_264_, i_262_, i_263_);
		br(i, i_259_, i, i_259_ + i_261_, i_262_, i_263_);
		br(i + i_260_, i_259_, i + i_260_, i_259_ + i_261_, i_262_, i_263_);
	}

	public final int hj(int i, int i_265_) {
		return i | i_265_;
	}

	public final void fx(int i, int i_266_, int i_267_, int i_268_, int i_269_, int i_270_) {
		if (aBoolean8519) {
			RA(false);
			((Class_ra_Sub2) this).aClass61_Sub1_8553.method691(i, i_266_, i_267_, i_268_, 0, i_269_, i_270_);
			RA(true);
		} else
			((Class_ra_Sub2) this).aClass61_Sub1_8553.method691(i, i_266_, i_267_, i_268_, 0, i_269_, i_270_);
	}

	public final void fw(int i, int i_271_, int i_272_, int i_273_, int i_274_, int i_275_) {
		if (aBoolean8519) {
			RA(false);
			((Class_ra_Sub2) this).aClass61_Sub1_8553.method691(i, i_271_, i_272_, i_273_, 0, i_274_, i_275_);
			RA(true);
		} else
			((Class_ra_Sub2) this).aClass61_Sub1_8553.method691(i, i_271_, i_272_, i_273_, 0, i_274_, i_275_);
	}

	public final void fp(int i, int i_276_, int i_277_, int i_278_, int i_279_, int i_280_, byte[] is, int i_281_, int i_282_) {
		/* empty */
	}

	public final void im() {
		if (((Class_ra_Sub2) this).aClass192Array8569[1] != null && ((Class_ra_Sub2) this).aClass192Array8569[1].method2106()) {
			((Class_ra_Sub2) this).aClass180_8470.method2057(((Class_ra_Sub2) this).aClass192Array8569[1]);
			((Class_ra_Sub2) this).aClass188_8552.method2096();
		}
	}

	public final void ig(int i, int i_283_, int i_284_) {
		if (anInt8476 != i || anInt8578 != i_283_ || anInt8560 != i_284_) {
			anInt8476 = i;
			anInt8578 = i_283_;
			anInt8560 = i_284_;
			method5015();
			method4974();
		}
	}

	public void dk(int i) {
		if (((Class_ra_Sub2) this).aClass188_8552 != null)
			((Class_ra_Sub2) this).aClass188_8552.method2097();
		anInt8588 = i & 0x7fffffff;
	}

	public final void jr(int i, int i_285_, float f, int i_286_, int i_287_, float f_288_, int i_289_, int i_290_, float f_291_, int i_292_, int i_293_, int i_294_, int i_295_) {
		/* empty */
	}

	abstract void method4997();

	public final void ga(int i, int i_296_, int i_297_, int i_298_, int i_299_) {
		br(i, i_296_, i, i_296_ + i_297_, i_298_, i_299_);
	}

	public final Class61 gm(int i, int i_300_, boolean bool, boolean bool_301_) {
		return new Class61_Sub1(this, i, i_300_, bool, bool_301_);
	}

	public final void gz(int i, int i_302_, int i_303_, int i_304_, int i_305_, int i_306_) {
		by(i, i_302_, i_303_, i_304_, i_305_, 1, i_306_);
	}

	void method4998() {
		((Class_ra_Sub2) this).aClass180_8470.method2061();
		((Class_ra_Sub2) this).anInterface9_Impl1_8600.method53();
		((Class_ra_Sub2) this).anInterface9_Impl1_8587.method53();
		((Class_ra_Sub2) this).anInterface9_Impl1_8501.method53();
		for (int i = 0; i < 7; i++)
			((Class_ra_Sub2) this).aClass387_Sub1Array8609[i].method4511();
		((Class_ra_Sub2) this).aClass186_8455.method2080();
		((Class_ra_Sub2) this).anInterface9_Impl2_8559.method53();
		((Class_ra_Sub2) this).aClass187_8556.method2084();
		((Class_ra_Sub2) this).aClass187_8556 = null;
	}

	final void method4999() {
		method4937();
		method4938();
		method4936();
		method5007();
		method4959();
		method4939();
		method4940();
		method4932();
		method4933();
		method4974();
		method4900();
		method5112();
		method5014();
		method4973();
		for (int i = anInt8592 - 1; i >= 0; i--) {
			method4955(i);
			method5053();
			method4968();
			method4965();
		}
		method4967();
		method4912();
	}

	public final void ge(int i, int i_307_, int i_308_, int i_309_, int i_310_, int i_311_, int i_312_) {
		i += 1.0F;
		i_307_ += 1.0F;
		i_308_ += 1.0F;
		i_309_ += 1.0F;
		float f = (float) (i_308_ - i);
		float f_313_ = (float) (i_309_ - i_307_);
		float f_314_ = 1.0F / (float) Math.sqrt((double) (f * f + f_313_ * f_313_));
		f *= f_314_;
		f_313_ *= f_314_;
		i -= f;
		i_307_ -= f_313_;
		float f_315_ = -f_313_;
		float f_316_ = f;
		f_315_ *= 0.5F * (float) i_311_;
		f_316_ *= 0.5F * (float) i_311_;
		((Class_ra_Sub2) this).aClass61_Sub1_8553.method715((float) i - f_315_, (float) i_307_ - f_316_, (float) i_308_ - f_315_, (float) i_309_ - f_316_, (float) i + f_315_, (float) i_307_ + f_316_, 0, i_310_, i_312_);
	}

	abstract void method5000();

	public final void gq(int i, int i_317_, int i_318_, int i_319_, int i_320_, int i_321_, int i_322_) {
		i += 1.0F;
		i_317_ += 1.0F;
		i_318_ += 1.0F;
		i_319_ += 1.0F;
		float f = (float) (i_318_ - i);
		float f_323_ = (float) (i_319_ - i_317_);
		float f_324_ = 1.0F / (float) Math.sqrt((double) (f * f + f_323_ * f_323_));
		f *= f_324_;
		f_323_ *= f_324_;
		i -= f;
		i_317_ -= f_323_;
		float f_325_ = -f_323_;
		float f_326_ = f;
		f_325_ *= 0.5F * (float) i_321_;
		f_326_ *= 0.5F * (float) i_321_;
		((Class_ra_Sub2) this).aClass61_Sub1_8553.method715((float) i - f_325_, (float) i_317_ - f_326_, (float) i_318_ - f_325_, (float) i_319_ - f_326_, (float) i + f_325_, (float) i_317_ + f_326_, 0, i_320_, i_322_);
	}

	public final void gu(int i, int i_327_, int i_328_, int i_329_, int i_330_, int i_331_, int i_332_) {
		i += 1.0F;
		i_327_ += 1.0F;
		i_328_ += 1.0F;
		i_329_ += 1.0F;
		float f = (float) (i_328_ - i);
		float f_333_ = (float) (i_329_ - i_327_);
		float f_334_ = 1.0F / (float) Math.sqrt((double) (f * f + f_333_ * f_333_));
		f *= f_334_;
		f_333_ *= f_334_;
		i -= f;
		i_327_ -= f_333_;
		float f_335_ = -f_333_;
		float f_336_ = f;
		f_335_ *= 0.5F * (float) i_331_;
		f_336_ *= 0.5F * (float) i_331_;
		((Class_ra_Sub2) this).aClass61_Sub1_8553.method715((float) i - f_335_, (float) i_327_ - f_336_, (float) i_328_ - f_335_, (float) i_329_ - f_336_, (float) i + f_335_, (float) i_327_ + f_336_, 0, i_330_, i_332_);
	}

	public int gf(int i, int i_337_, int i_338_, int i_339_, int i_340_, int i_341_) {
		int i_342_ = 0;
		float f = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[14] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[2] * (float) i) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[6] * (float) i_337_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[10] * (float) i_338_));
		float f_343_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[14] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[2] * (float) i_339_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[6] * (float) i_340_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[10] * (float) i_341_));
		float f_344_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[15] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[3] * (float) i) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[7] * (float) i_337_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[11] * (float) i_338_));
		float f_345_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[15] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[3] * (float) i_339_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[7] * (float) i_340_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[11] * (float) i_341_));
		if (f < -f_344_ && f_343_ < -f_345_)
			i_342_ |= 0x10;
		else if (f > f_344_ && f_343_ > f_345_)
			i_342_ |= 0x20;
		float f_346_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[12] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[0] * (float) i) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[4] * (float) i_337_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[8] * (float) i_338_));
		float f_347_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[12] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[0] * (float) i_339_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[4] * (float) i_340_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[8] * (float) i_341_));
		if (f_346_ < -f_344_ && f_347_ < -f_345_)
			i_342_ |= 0x1;
		if (f_346_ > f_344_ && f_347_ > f_345_)
			i_342_ |= 0x2;
		float f_348_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[13] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[1] * (float) i) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[5] * (float) i_337_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[9] * (float) i_338_));
		float f_349_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[13] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[1] * (float) i_339_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[5] * (float) i_340_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[9] * (float) i_341_));
		if (f_348_ < -f_344_ && f_349_ < -f_345_)
			i_342_ |= 0x4;
		if (f_348_ > f_344_ && f_349_ > f_345_)
			i_342_ |= 0x8;
		return i_342_;
	}

	public final void je(int i, Class77 class77) {
		if (!((Class_ra_Sub2) this).aBoolean8571)
			throw new RuntimeException("");
		((Class_ra_Sub2) this).anInt8573 = i;
		((Class_ra_Sub2) this).aClass77_8456 = class77;
		if (((Class_ra_Sub2) this).aBoolean8572) {
			((Class_ra_Sub2) this).aClass164Array8558[3].method1930();
			((Class_ra_Sub2) this).aClass164Array8558[3].method1929();
		}
	}

	public final Class_v gi(int i) {
		Class_v_Sub1 class_v_sub1 = new Class_v_Sub1(i);
		((Class_ra_Sub2) this).aClass471_8464.method5878(class_v_sub1, (short) 8192);
		return class_v_sub1;
	}

	public final Class_v gs(int i) {
		Class_v_Sub1 class_v_sub1 = new Class_v_Sub1(i);
		((Class_ra_Sub2) this).aClass471_8464.method5878(class_v_sub1, (short) 8192);
		return class_v_sub1;
	}

	public final void go(Class_v class_v) {
		((Class_ra_Sub2) this).aNativeHeap8463 = ((Class_v_Sub1) (Class_v_Sub1) class_v).aNativeHeap9856;
	}

	public final void gp(Class_v class_v) {
		((Class_ra_Sub2) this).aNativeHeap8463 = ((Class_v_Sub1) (Class_v_Sub1) class_v).aNativeHeap9856;
	}

	public final void gc(Class_v class_v) {
		((Class_ra_Sub2) this).aNativeHeap8463 = ((Class_v_Sub1) (Class_v_Sub1) class_v).aNativeHeap9856;
	}

	abstract void method5001(int i, Class175 class175, boolean bool, boolean bool_350_);

	public final Class61 hz(int i, int i_351_, boolean bool, boolean bool_352_) {
		return new Class61_Sub1(this, i, i_351_, bool, bool_352_);
	}

	public final Class61 ha(int i, int i_353_, boolean bool, boolean bool_354_) {
		return new Class61_Sub1(this, i, i_353_, bool, bool_354_);
	}

	public final Class61 hm(int[] is, int i, int i_355_, int i_356_, int i_357_, boolean bool) {
		return new Class61_Sub1(this, i_356_, i_357_, is, i, i_355_);
	}

	public final Class61 hv(int[] is, int i, int i_358_, int i_359_, int i_360_, boolean bool) {
		return new Class61_Sub1(this, i_359_, i_360_, is, i, i_358_);
	}

	public final Class61 hi(Class87 class87, boolean bool) {
		Class61 class61;
		if (class87.method986() != 0 && class87.method994() != 0) {
			int[] is = class87.method1031(false);
			class61 = method4795(is, 0, class87.method986(), class87.method986(), class87.method994(), (byte) -67);
		} else
			class61 = method4795(new int[] { 0 }, 0, 1, 1, 1, (byte) -29);
		class61.method717(class87.method983(), class87.method990(), class87.method989(), class87.method991());
		return class61;
	}

	public final boolean ea() {
		return true;
	}

	public final Class61 hk(int i, int i_361_, int i_362_, int i_363_, boolean bool) {
		Class61_Sub1 class61_sub1 = new Class61_Sub1(this, i_362_, i_363_, bool, false);
		class61_sub1.method737(0, 0, i_362_, i_363_, i, i_361_);
		return class61_sub1;
	}

	public final int he(int i, int i_364_) {
		return i & i_364_ ^ i_364_;
	}

	public final Class_ta hc(int i, int i_365_, int[] is, int[] is_366_) {
		return Class_ta_Sub1.method5682(this, i, i_365_, is, is_366_);
	}

	public final Class_ta hy(int i, int i_367_, int[] is, int[] is_368_) {
		return Class_ta_Sub1.method5682(this, i, i_367_, is, is_368_);
	}

	public final void hw(int i) {
		/* empty */
	}

	public final Class387 hs(Model class98, int i, int i_369_, int i_370_, int i_371_) {
		return new Class387_Sub1(this, class98, i, i_370_, i_371_, i_369_);
	}

	public final Class387 hg(Model class98, int i, int i_372_, int i_373_, int i_374_) {
		return new Class387_Sub1(this, class98, i, i_373_, i_374_, i_372_);
	}

	public final Class387 hb(Model class98, int i, int i_375_, int i_376_, int i_377_) {
		return new Class387_Sub1(this, class98, i, i_376_, i_377_, i_375_);
	}

	public final void ik(int i, float f, float f_378_, float f_379_, float f_380_, float f_381_) {
		boolean bool = ((Class_ra_Sub2) this).anInt8529 != i;
		if (bool || aFloat8489 != f || aFloat8535 != f_378_) {
			((Class_ra_Sub2) this).anInt8529 = i;
			aFloat8489 = f;
			aFloat8535 = f_378_;
			if (bool) {
				aFloat8530 = (float) (((Class_ra_Sub2) this).anInt8529 & 0xff0000) / 1.671168E7F;
				aFloat8500 = (float) (((Class_ra_Sub2) this).anInt8529 & 0xff00) / 65280.0F;
				aFloat8532 = ((float) (((Class_ra_Sub2) this).anInt8529 & 0xff) / 255.0F);
				method4937();
			}
			method4938();
		}
		if (((Class_ra_Sub2) this).aFloatArray8462[0] != f_379_ || ((Class_ra_Sub2) this).aFloatArray8462[1] != f_380_ || ((Class_ra_Sub2) this).aFloatArray8462[2] != f_381_) {
			((Class_ra_Sub2) this).aFloatArray8462[0] = f_379_;
			((Class_ra_Sub2) this).aFloatArray8462[1] = f_380_;
			((Class_ra_Sub2) this).aFloatArray8462[2] = f_381_;
			((Class_ra_Sub2) this).aFloatArray8528[0] = -f_379_;
			((Class_ra_Sub2) this).aFloatArray8528[1] = -f_380_;
			((Class_ra_Sub2) this).aFloatArray8528[2] = -f_381_;
			float f_382_ = (float) (1.0 / Math.sqrt((double) (f_379_ * f_379_ + f_380_ * f_380_ + f_381_ * f_381_)));
			aFloatArray8525[0] = f_379_ * f_382_;
			aFloatArray8525[1] = f_380_ * f_382_;
			aFloatArray8525[2] = f_381_ * f_382_;
			aFloatArray8451[0] = -aFloatArray8525[0];
			aFloatArray8451[1] = -aFloatArray8525[1];
			aFloatArray8451[2] = -aFloatArray8525[2];
			method4959();
			((Class_ra_Sub2) this).anInt8541 = (int) (f_379_ * 256.0F / f_380_);
			((Class_ra_Sub2) this).anInt8599 = (int) (f_381_ * 256.0F / f_380_);
		}
		method4939();
	}

	abstract boolean method5002(Class72 class72, Class86 class86);

	public final Class_xa hx(int i, int i_383_, int[][] is, int[][] is_384_, int i_385_, int i_386_, int i_387_) {
		return new Class_xa_Sub2(this, i_386_, i_387_, i, i_383_, is, is_384_, i_385_);
	}

	public final Class_xa hp(int i, int i_388_, int[][] is, int[][] is_389_, int i_390_, int i_391_, int i_392_) {
		return new Class_xa_Sub2(this, i_391_, i_392_, i, i_388_, is, is_389_, i_390_);
	}

	public final void ii(int i, Class330_Sub14[] class330_sub14s) {
		for (int i_393_ = 0; i_393_ < i; i_393_++)
			aClass330_Sub14Array8607[i_393_] = class330_sub14s[i_393_];
		anInt8538 = i;
		if (((Class_ra_Sub2) this).aClass174_8483 == Class174.aClass174_1735)
			method5007();
	}

	abstract Class184 method5003(Class193[] class193s);

	public final Class249 io() {
		return ((Class_ra_Sub2) this).aClass249_8488;
	}

	public final Class249 ic() {
		return ((Class_ra_Sub2) this).aClass249_8488;
	}

	abstract void method5004(Interface9_Impl2 interface9_impl2);

	public final void ia(float f) {
		if (aFloat8533 != f) {
			aFloat8533 = f;
			method4937();
			method4939();
		}
	}

	final void method5005(boolean bool) {
		if (bool != aBoolean8526) {
			aBoolean8526 = bool;
			method4932();
			((Class_ra_Sub2) this).anInt8540 &= ~0xf;
		}
	}

	public final void iz(int i, float f, float f_394_, float f_395_, float f_396_, float f_397_) {
		boolean bool = ((Class_ra_Sub2) this).anInt8529 != i;
		if (bool || aFloat8489 != f || aFloat8535 != f_394_) {
			((Class_ra_Sub2) this).anInt8529 = i;
			aFloat8489 = f;
			aFloat8535 = f_394_;
			if (bool) {
				aFloat8530 = (float) (((Class_ra_Sub2) this).anInt8529 & 0xff0000) / 1.671168E7F;
				aFloat8500 = (float) (((Class_ra_Sub2) this).anInt8529 & 0xff00) / 65280.0F;
				aFloat8532 = ((float) (((Class_ra_Sub2) this).anInt8529 & 0xff) / 255.0F);
				method4937();
			}
			method4938();
		}
		if (((Class_ra_Sub2) this).aFloatArray8462[0] != f_395_ || ((Class_ra_Sub2) this).aFloatArray8462[1] != f_396_ || ((Class_ra_Sub2) this).aFloatArray8462[2] != f_397_) {
			((Class_ra_Sub2) this).aFloatArray8462[0] = f_395_;
			((Class_ra_Sub2) this).aFloatArray8462[1] = f_396_;
			((Class_ra_Sub2) this).aFloatArray8462[2] = f_397_;
			((Class_ra_Sub2) this).aFloatArray8528[0] = -f_395_;
			((Class_ra_Sub2) this).aFloatArray8528[1] = -f_396_;
			((Class_ra_Sub2) this).aFloatArray8528[2] = -f_397_;
			float f_398_ = (float) (1.0 / Math.sqrt((double) (f_395_ * f_395_ + f_396_ * f_396_ + f_397_ * f_397_)));
			aFloatArray8525[0] = f_395_ * f_398_;
			aFloatArray8525[1] = f_396_ * f_398_;
			aFloatArray8525[2] = f_397_ * f_398_;
			aFloatArray8451[0] = -aFloatArray8525[0];
			aFloatArray8451[1] = -aFloatArray8525[1];
			aFloatArray8451[2] = -aFloatArray8525[2];
			method4959();
			((Class_ra_Sub2) this).anInt8541 = (int) (f_395_ * 256.0F / f_396_);
			((Class_ra_Sub2) this).anInt8599 = (int) (f_397_ * 256.0F / f_396_);
		}
		method4939();
	}

	abstract boolean method5006(Class72 class72, Class86 class86);

	public final void iw(int i) {
		((Class_ra_Sub2) this).anInt8536 = 0;
		for (/**/; i > 1; i >>= 1)
			((Class_ra_Sub2) this).anInt8536++;
		((Class_ra_Sub2) this).anInt8539 = 1 << ((Class_ra_Sub2) this).anInt8536;
	}

	final void cc(float f, float f_399_, float f_400_, float f_401_, float f_402_, float f_403_) {
		Class192_Sub1.aFloat7341 = f;
		Class192_Sub1.aFloat7340 = f_399_;
		Class192_Sub1.aFloat7339 = f_400_;
		Class192_Sub1.aFloat7342 = f_403_;
	}

	public final void ib(int i, int i_404_, int i_405_) {
		if (anInt8476 != i || anInt8578 != i_404_ || anInt8560 != i_405_) {
			anInt8476 = i;
			anInt8578 = i_404_;
			anInt8560 = i_405_;
			method5015();
			method4974();
		}
	}

	public final boolean ku() {
		return ((Class_ra_Sub2) this).aClass192Array8569[1] != null;
	}

	public final Class92 ix(int i, int i_406_, int i_407_, int i_408_, int i_409_, int i_410_) {
		return new Class92_Sub1_Sub1(this, i, i_406_, i_407_, i_408_, i_409_, i_410_);
	}

	public final Class92 iq(int i, int i_411_, int i_412_, int i_413_, int i_414_, int i_415_) {
		return new Class92_Sub1_Sub1(this, i, i_411_, i_412_, i_413_, i_414_, i_415_);
	}

	public final Class92 ip(int i, int i_416_, int i_417_, int i_418_, int i_419_, int i_420_) {
		return new Class92_Sub1_Sub1(this, i, i_416_, i_417_, i_418_, i_419_, i_420_);
	}

	public final void kl(Class247 class247) {
		((Class_ra_Sub2) this).aClass247_8524 = class247;
		aClass249_8472.method2508(((Class_ra_Sub2) this).aClass247_8524);
		((Class_ra_Sub2) this).aClass247_8596.method2454(class247);
		((Class_ra_Sub2) this).aClass247_8596.method2459();
		((Class_ra_Sub2) this).aClass249_8473.method2508(((Class_ra_Sub2) this).aClass247_8596);
		method4918();
		if (((Class_ra_Sub2) this).aClass174_8483 == Class174.aClass174_1735)
			method4919();
	}

	public final boolean iv() {
		if (((Class_ra_Sub2) this).aClass192Array8569[1] != null && !((Class_ra_Sub2) this).aClass192Array8569[1].method2106()) {
			boolean bool = (((Class_ra_Sub2) this).aClass180_8470.method2062(((Class_ra_Sub2) this).aClass192Array8569[1]));
			if (bool)
				((Class_ra_Sub2) this).aClass188_8552.method2096();
			return bool;
		}
		return false;
	}

	public final boolean it() {
		if (((Class_ra_Sub2) this).aClass192Array8569[1] != null && !((Class_ra_Sub2) this).aClass192Array8569[1].method2106()) {
			boolean bool = (((Class_ra_Sub2) this).aClass180_8470.method2062(((Class_ra_Sub2) this).aClass192Array8569[1]));
			if (bool)
				((Class_ra_Sub2) this).aClass188_8552.method2096();
			return bool;
		}
		return false;
	}

	final void method5007() {
		if (method5082())
			method4981();
		anInt8537 = anInt8538;
		anInt8538 = 0;
	}

	public final boolean ie() {
		return (((Class_ra_Sub2) this).aClass192Array8569[1] != null && ((Class_ra_Sub2) this).aClass192Array8569[1].method2106());
	}

	public void method4804() {
		if (((Class_ra_Sub2) this).aClass187_8556 != null)
			((Class_ra_Sub2) this).aClass187_8556.method2085();
	}

	final void jc(float f, float f_421_, float f_422_, float f_423_, float f_424_, float f_425_) {
		Class192_Sub1.aFloat7341 = f;
		Class192_Sub1.aFloat7340 = f_421_;
		Class192_Sub1.aFloat7339 = f_422_;
		Class192_Sub1.aFloat7342 = f_425_;
	}

	final Class249 method5008() {
		return aClass249Array8545[anInt8543];
	}

	public final void jn(int i, int i_426_, int i_427_, int i_428_) {
		((Class_ra_Sub2) this).aClass180_8470.method2058(i, i_426_, i_427_, i_428_);
	}

	public final void jg(int i, int i_429_, int i_430_, int i_431_) {
		((Class_ra_Sub2) this).aClass180_8470.method2058(i, i_429_, i_430_, i_431_);
	}

	public final Class61 hl(int i, int i_432_, int i_433_, int i_434_, boolean bool) {
		Class61_Sub1 class61_sub1 = new Class61_Sub1(this, i_433_, i_434_, bool, false);
		class61_sub1.method737(0, 0, i_433_, i_434_, i, i_432_);
		return class61_sub1;
	}

	public abstract void method5009(Class184 class184);

	abstract void method5010();

	abstract void method5011();

	public final void jm(int i, Class77 class77) {
		((Class_ra_Sub2) this).anInt8573 = i;
		((Class_ra_Sub2) this).aClass77_8456 = class77;
		((Class_ra_Sub2) this).aBoolean8571 = true;
	}

	public final void jo(int i, Class77 class77) {
		((Class_ra_Sub2) this).anInt8573 = i;
		((Class_ra_Sub2) this).aClass77_8456 = class77;
		((Class_ra_Sub2) this).aBoolean8571 = true;
	}

	public final void jf(int i, Class77 class77) {
		((Class_ra_Sub2) this).anInt8573 = i;
		((Class_ra_Sub2) this).aClass77_8456 = class77;
		((Class_ra_Sub2) this).aBoolean8571 = true;
	}

	public final boolean ec() {
		return aBoolean8566;
	}

	public final void jj(int i, Class77 class77) {
		if (!((Class_ra_Sub2) this).aBoolean8571)
			throw new RuntimeException("");
		((Class_ra_Sub2) this).anInt8573 = i;
		((Class_ra_Sub2) this).aClass77_8456 = class77;
		if (((Class_ra_Sub2) this).aBoolean8572) {
			((Class_ra_Sub2) this).aClass164Array8558[3].method1930();
			((Class_ra_Sub2) this).aClass164Array8558[3].method1929();
		}
	}

	public void g(int i) {
		if (((Class_ra_Sub2) this).aClass188_8552 != null)
			((Class_ra_Sub2) this).aClass188_8552.method2097();
		anInt8588 = i & 0x7fffffff;
	}

	public final Interface11_Impl1 method5012() {
		return (((Class_ra_Sub2) this).aClass92_Sub1_8570 != null ? ((Class_ra_Sub2) this).aClass92_Sub1_8570.method1074() : null);
	}

	public final void jh() {
		((Class_ra_Sub2) this).aBoolean8571 = false;
	}

	public final int lo() {
		return anInt8593 - 2;
	}

	public final void G(int i, int i_435_, int i_436_, int i_437_, int i_438_) {
		br(i, i_435_, i, i_435_ + i_436_, i_437_, i_438_);
	}

	final void method5013() {
		if (((Class_ra_Sub2) this).anInt8540 != 8) {
			method4885();
			method4882(true);
			method5005(true);
			method4962(true);
			method4970(1);
			((Class_ra_Sub2) this).anInt8540 = 8;
		}
	}

	public final boolean ka() {
		return true;
	}

	public final boolean km() {
		return true;
	}

	public final boolean ky() {
		return ((Class_ra_Sub2) this).aClass192Array8569[1] != null;
	}

	public void kt(int i, int i_439_, int i_440_, int i_441_, int i_442_, int i_443_, Class_ta class_ta, int i_444_, int i_445_, int i_446_, int i_447_, int i_448_) {
		/* empty */
	}

	public void ki(int i, int i_449_, int i_450_, int i_451_, int i_452_, int i_453_, Class_ta class_ta, int i_454_, int i_455_, int i_456_, int i_457_, int i_458_) {
		/* empty */
	}

	public final Class249 kc() {
		return ((Class_ra_Sub2) this).aClass249_8579;
	}

	public final boolean en() {
		return true;
	}

	public final Class247 kx() {
		return ((Class_ra_Sub2) this).aClass247_8611;
	}

	final void gn(int i, int i_459_, int i_460_, int i_461_, int i_462_) {
		/* empty */
	}

	public void kk() {
		((Class_ra_Sub2) this).anInt8597 = 0;
		((Class_ra_Sub2) this).anInt8510 = 0;
		((Class_ra_Sub2) this).anInt8511 = aClass76_4228.method856();
		((Class_ra_Sub2) this).anInt8512 = aClass76_4228.method857();
		method5018();
	}

	public void kq() {
		((Class_ra_Sub2) this).anInt8597 = 0;
		((Class_ra_Sub2) this).anInt8510 = 0;
		((Class_ra_Sub2) this).anInt8511 = aClass76_4228.method856();
		((Class_ra_Sub2) this).anInt8512 = aClass76_4228.method857();
		method5018();
	}

	public void kg() {
		((Class_ra_Sub2) this).anInt8597 = 0;
		((Class_ra_Sub2) this).anInt8510 = 0;
		((Class_ra_Sub2) this).anInt8511 = aClass76_4228.method856();
		((Class_ra_Sub2) this).anInt8512 = aClass76_4228.method857();
		method5018();
	}

	abstract void method5014();

	public final void ko() {
		if (aClass76_4228 != null) {
			anInt8521 = 0;
			anInt8610 = 0;
			anInt8447 = aClass76_4228.method856();
			anInt8506 = aClass76_4228.method857();
		} else {
			anInt8506 = 0;
			anInt8447 = 0;
			anInt8521 = 0;
			anInt8610 = 0;
		}
		if (aBoolean8612) {
			aBoolean8612 = false;
			method4914();
		}
	}

	public final void kz() {
		if (aClass76_4228 != null) {
			anInt8521 = 0;
			anInt8610 = 0;
			anInt8447 = aClass76_4228.method856();
			anInt8506 = aClass76_4228.method857();
		} else {
			anInt8506 = 0;
			anInt8447 = 0;
			anInt8521 = 0;
			anInt8610 = 0;
		}
		if (aBoolean8612) {
			aBoolean8612 = false;
			method4914();
		}
	}

	final void method5015() {
		if (((Class_ra_Sub2) this).aClass164_8557 != null)
			((Class_ra_Sub2) this).aClass164_8557.method1929();
		method4900();
	}

	public final void kd(Class247 class247) {
		((Class_ra_Sub2) this).aClass247_8524 = class247;
		aClass249_8472.method2508(((Class_ra_Sub2) this).aClass247_8524);
		((Class_ra_Sub2) this).aClass247_8596.method2454(class247);
		((Class_ra_Sub2) this).aClass247_8596.method2459();
		((Class_ra_Sub2) this).aClass249_8473.method2508(((Class_ra_Sub2) this).aClass247_8596);
		method4918();
		if (((Class_ra_Sub2) this).aClass174_8483 == Class174.aClass174_1735)
			method4919();
	}

	public final void ks(boolean bool) {
		aBoolean8519 = bool;
		method4933();
	}

	public final void kr(boolean bool) {
		aBoolean8519 = bool;
		method4933();
	}

	public final void lp(boolean bool) {
		aBoolean8519 = bool;
		method4933();
	}

	public final int ln() {
		return anInt8593 - 2;
	}

	public void method5016(boolean bool) {
		((Class_ra_Sub2) this).aBoolean8555 = bool;
	}

	public void method5017(boolean bool) {
		((Class_ra_Sub2) this).aBoolean8555 = bool;
	}

	public final Class387 cb(Model class98, int i, int i_463_, int i_464_, int i_465_) {
		return new Class387_Sub1(this, class98, i, i_464_, i_465_, i_463_);
	}

	final void method5018() {
		if (((Class_ra_Sub2) this).aClass174_8483 == Class174.aClass174_1735) {
			anInt8531 = ((Class_ra_Sub2) this).anInt8597;
			anInt8567 = ((Class_ra_Sub2) this).anInt8510;
			anInt8515 = ((Class_ra_Sub2) this).anInt8511;
			anInt8516 = ((Class_ra_Sub2) this).anInt8512;
			aFloat8499 = ((Class_ra_Sub2) this).aFloat8608;
			aFloat8478 = ((Class_ra_Sub2) this).aFloat8457;
		} else {
			anInt8531 = 0;
			anInt8567 = 0;
			anInt8515 = aClass76_4228.method856();
			anInt8516 = aClass76_4228.method857();
			aFloat8499 = 0.0F;
			aFloat8478 = 1.0F;
		}
		method4912();
		((Class_ra_Sub2) this).aFloat8505 = (float) ((Class_ra_Sub2) this).anInt8511 / 2.0F;
		((Class_ra_Sub2) this).aFloat8498 = (float) ((Class_ra_Sub2) this).anInt8512 / 2.0F;
		((Class_ra_Sub2) this).aFloat8495 = ((float) ((Class_ra_Sub2) this).anInt8597 + ((Class_ra_Sub2) this).aFloat8505);
		((Class_ra_Sub2) this).aFloat8497 = ((float) ((Class_ra_Sub2) this).anInt8510 + ((Class_ra_Sub2) this).aFloat8498);
	}

	public void method5019() {
		if (((Class_ra_Sub2) this).aClass187_8556 != null)
			((Class_ra_Sub2) this).aClass187_8556.method2090();
	}

	public abstract void method5020(Class249 class249);

	public abstract boolean method5021();

	public abstract boolean method5022();

	public abstract boolean method5023();

	public abstract Class105 method5024(String string);

	public final boolean ej() {
		return true;
	}

	public final void ji(int i, int i_466_, int i_467_, int i_468_) {
		((Class_ra_Sub2) this).aClass180_8470.method2058(i, i_466_, i_467_, i_468_);
	}

	abstract void method5025();

	boolean method5026(float f, float f_469_, float f_470_, float f_471_, float f_472_, float f_473_) {
		aByteBuffer8458.clear();
		aByteBuffer8458.putFloat(f);
		aByteBuffer8458.putFloat(f_469_);
		aByteBuffer8458.putFloat(f_470_);
		aByteBuffer8458.putFloat(f_471_);
		aByteBuffer8458.putFloat(f_472_);
		aByteBuffer8458.putFloat(f_473_);
		return ((Class_ra_Sub2) this).anInterface9_Impl1_8587.method97(0, aByteBuffer8458.position(), aLong8459);
	}

	void method5027() {
		((Class_ra_Sub2) this).aClass180_8470.method2055();
		for (int i = 0; i < ((Class_ra_Sub2) this).aClass192Array8569.length; i++) {
			if (((Class_ra_Sub2) this).aClass192Array8569[i] != null && ((Class_ra_Sub2) this).aClass192Array8569[i].method2106())
				((Class_ra_Sub2) this).aClass192Array8569[i].method2102();
		}
		((Class_ra_Sub2) this).aClass186_8455 = new Class186(this);
		method4896();
		method4986();
		method5036();
		((Class_ra_Sub2) this).aClass186_8455.method2077(this);
		((Class_ra_Sub2) this).aClass187_8556 = new Class187(this, 1024);
	}

	public final void ci(Class249 class249) {
		((Class_ra_Sub2) this).aClass249_8488.method2510(class249);
		method4918();
		if (((Class_ra_Sub2) this).aClass174_8483 == Class174.aClass174_1735)
			method4930();
	}

	abstract void method5028();

	abstract void method5029();

	public final void O() {
		((Class_ra_Sub2) this).aBoolean8571 = false;
	}

	public final boolean ac() {
		return aBoolean8566;
	}

	public final void hu(int i, Class_ta class_ta, int i_474_, int i_475_) {
		RA(false);
		((Class_ra_Sub2) this).aClass61_Sub1_8554.method703(0.0F, 0.0F, (float) method4782((byte) 0).method856(), 0.0F, 0.0F, (float) method4782((byte) 0).method857(), 0, class_ta, i_474_, i_475_);
		RA(true);
	}

	public final void dg(int i, Class77 class77) {
		((Class_ra_Sub2) this).anInt8573 = i;
		((Class_ra_Sub2) this).aClass77_8456 = class77;
		((Class_ra_Sub2) this).aBoolean8571 = true;
	}

	public void gk(int i, int i_476_, int i_477_, int i_478_, int i_479_, int i_480_, int i_481_, int i_482_, int i_483_) {
		float f = (float) i_477_ - (float) i;
		float f_484_ = (float) i_478_ - (float) i_476_;
		if (f == 0.0F && f_484_ == 0.0F)
			f = 1.0F;
		else {
			float f_485_ = (float) (1.0 / Math.sqrt((double) (f * f + f_484_ * f_484_)));
			f *= f_485_;
			f_484_ *= f_485_;
		}
		method4925();
		Class164 class164 = ((Class_ra_Sub2) this).aClass164Array8558[13];
		class164.method1928();
		class164.method1927(i_479_);
		method4970(i_480_);
		class164.method1933();
		method5135(false);
		i_483_ %= i_482_ + i_481_;
		float f_486_ = f * (float) i_481_;
		float f_487_ = f_484_ * (float) i_481_;
		float f_488_ = 0.0F;
		float f_489_ = 0.0F;
		float f_490_ = f_486_;
		float f_491_ = f_487_;
		if (i_483_ > i_481_) {
			f_488_ = f * (float) (i_481_ + i_482_ - i_483_);
			f_489_ = f_484_ * (float) (i_481_ + i_482_ - i_483_);
		} else {
			f_490_ = f * (float) (i_481_ - i_483_);
			f_491_ = f_484_ * (float) (i_481_ - i_483_);
		}
		float f_492_ = (float) i + f_488_;
		float f_493_ = (float) i_476_ + f_489_;
		float f_494_ = f * (float) i_482_;
		float f_495_ = f_484_ * (float) i_482_;
		for (;;) {
			if (i_477_ > i) {
				if (f_492_ > (float) i_477_)
					break;
				if (f_492_ + f_490_ > (float) i_477_)
					f_490_ = (float) i_477_ - f_492_;
			} else {
				if (f_492_ < (float) i_477_)
					break;
				if (f_492_ + f_490_ < (float) i_477_)
					f_490_ = (float) i_477_ - f_492_;
			}
			if (i_478_ > i_476_) {
				if (f_493_ > (float) i_478_)
					break;
				if (f_493_ + f_491_ > (float) i_478_)
					f_491_ = (float) i_478_ - f_493_;
			} else {
				if (f_493_ < (float) i_478_)
					break;
				if (f_493_ + f_491_ < (float) i_478_)
					f_491_ = (float) i_478_ - f_493_;
			}
			if (!method5026(f_492_, f_493_, 0.0F, f_492_ + f_490_, f_493_ + f_491_, 0.0F))
				return;
			method4982();
			f_492_ += f_494_ + f_490_;
			f_493_ += f_495_ + f_491_;
			f_490_ = f_486_;
			f_491_ = f_487_;
		}
		method5135(true);
		class164.method1931();
	}

	public final boolean kj() {
		return true;
	}

	public final Class247 kw() {
		return ((Class_ra_Sub2) this).aClass247_8611;
	}

	abstract void method5030();

	public final void gr(int i, int i_496_, int i_497_, int i_498_, int i_499_, int i_500_) {
		by(i, i_496_, i_497_, i_498_, i_499_, 1, i_500_);
	}

	public abstract float method5031();

	public final void gd(int i, int i_501_, int i_502_, int i_503_, int i_504_) {
		br(i, i_501_, i + i_502_, i_501_, i_503_, i_504_);
	}

	abstract boolean method5032(Class72 class72, Class86 class86);

	public final void kn(Class81 class81) {
		((Class_ra_Sub2) this).aClass186_8455.method2079(this, class81);
	}

	public final Class61 hq(Class87 class87, boolean bool) {
		Class61 class61;
		if (class87.method986() != 0 && class87.method994() != 0) {
			int[] is = class87.method1031(false);
			class61 = method4795(is, 0, class87.method986(), class87.method986(), class87.method994(), (byte) -84);
		} else
			class61 = method4795(new int[] { 0 }, 0, 1, 1, 1, (byte) -6);
		class61.method717(class87.method983(), class87.method990(), class87.method989(), class87.method991());
		return class61;
	}

	public abstract void method5033(Class249 class249);

	public final void cy(int i) {
		/* empty */
	}

	abstract void method5034();

	public final Class263 ho(Class524 class524, Class87_Sub2[] class87_sub2s, boolean bool) {
		return new Class263_Sub5(this, class524, class87_sub2s, bool);
	}

	public final void id() {
		if (((Class_ra_Sub2) this).aClass192Array8569[1] != null && ((Class_ra_Sub2) this).aClass192Array8569[1].method2106()) {
			((Class_ra_Sub2) this).aClass180_8470.method2057(((Class_ra_Sub2) this).aClass192Array8569[1]);
			((Class_ra_Sub2) this).aClass188_8552.method2096();
		}
	}

	public final boolean aw() {
		return false;
	}

	abstract void method5035();

	public final Class249 kf() {
		return ((Class_ra_Sub2) this).aClass249_8579;
	}

	final void method5036() {
		((Class_ra_Sub2) this).anInterface9_Impl1_8501 = method4976(false);
		((Class_ra_Sub2) this).anInterface9_Impl1_8501.method142(3096, 12);
		aByteBuffer8458.clear();
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putFloat(0.0F);
		aByteBuffer8458.putFloat(0.0F);
		for (int i = 0; i <= 256; i++) {
			double d = (double) (i * 2) * 3.141592653589793 / 256.0;
			float f = (float) Math.cos(d);
			float f_505_ = (float) Math.sin(d);
			aByteBuffer8458.putFloat(f_505_);
			aByteBuffer8458.putFloat(f);
			aByteBuffer8458.putFloat(0.0F);
		}
		((Class_ra_Sub2) this).anInterface9_Impl1_8501.method97(0, aByteBuffer8458.position(), aLong8459);
	}

	public abstract Class105 method5037(String string);

	public abstract void method5038(Class199 class199, int i, int i_506_, int i_507_, int i_508_);

	final void method5039() {
		((Class_ra_Sub2) this).aClass155_8542 = new Class155(this);
		aBoolean8601 = false;
		try {
			((Class_ra_Sub2) this).aClass140_8474 = new Class140_Sub1(this);
			((Class_ra_Sub2) this).aClass159_8590 = new Class159_Sub1(this);
			((Class_ra_Sub2) this).aClass150_8561 = new Class150_Sub2(this);
			((Class_ra_Sub2) this).aClass126_8562 = new Class126_Sub2(this);
			((Class_ra_Sub2) this).aClass164_Sub1_Sub2_8563 = new Class164_Sub1_Sub2(this, ((Class_ra_Sub2) this).aClass155_8542, false);
			((Class_ra_Sub2) this).aClass164_Sub1_Sub2_8564 = new Class164_Sub1_Sub2(this, ((Class_ra_Sub2) this).aClass155_8542, true);
			((Class_ra_Sub2) this).aClass164_Sub1_Sub1_8565 = new Class164_Sub1_Sub1(this, (((Class_ra_Sub2) this).aClass155_8542));
		} catch (Exception exception) {
			exception.printStackTrace();
			((Class_ra_Sub2) this).aClass140_8474 = new Class140_Sub2(this);
			((Class_ra_Sub2) this).aClass159_8590 = new Class159_Sub2(this);
			((Class_ra_Sub2) this).aClass150_8561 = new Class150_Sub1(this);
			((Class_ra_Sub2) this).aClass126_8562 = new Class126_Sub1(this);
			((Class_ra_Sub2) this).aClass164_Sub1_Sub2_8563 = null;
			((Class_ra_Sub2) this).aClass164_Sub1_Sub2_8564 = null;
			((Class_ra_Sub2) this).aClass164_Sub1_Sub1_8565 = null;
			aBoolean8601 = true;
		}
		int i;
		int i_509_;
		if (aClass76_4228 != null) {
			i_509_ = aClass76_4228.method856();
			i = aClass76_4228.method857();
		} else {
			i = 0;
			i_509_ = 0;
		}
		((Class_ra_Sub2) this).aClass180_8470 = new Class180(this, i_509_, i);
		if (!aBoolean8601) {
			((Class_ra_Sub2) this).aClass192Array8569[1] = new Class192_Sub1(this);
			((Class_ra_Sub2) this).aClass180_8470.method2062(((Class_ra_Sub2) this).aClass192Array8569[1]);
		}
		if (((Class_ra_Sub2) this).aClass164_8557 != null) {
			((Class_ra_Sub2) this).aClass164_8557.method1931();
			((Class_ra_Sub2) this).aClass164_8557 = null;
		}
		method5027();
	}

	abstract void method5040(int i);

	public final void gj(int i, int i_510_, int i_511_, int i_512_, int i_513_) {
		br(i, i_510_, i, i_510_ + i_511_, i_512_, i_513_);
	}

	abstract void method5041();

	abstract void method5042();

	abstract void method5043();

	public void bz(int i, int i_514_, int i_515_, int i_516_, int i_517_, int i_518_, int i_519_, int i_520_, int i_521_) {
		float f = (float) i_515_ - (float) i;
		float f_522_ = (float) i_516_ - (float) i_514_;
		if (f == 0.0F && f_522_ == 0.0F)
			f = 1.0F;
		else {
			float f_523_ = (float) (1.0 / Math.sqrt((double) (f * f + f_522_ * f_522_)));
			f *= f_523_;
			f_522_ *= f_523_;
		}
		method4925();
		Class164 class164 = ((Class_ra_Sub2) this).aClass164Array8558[13];
		class164.method1928();
		class164.method1927(i_517_);
		method4970(i_518_);
		class164.method1933();
		method5135(false);
		i_521_ %= i_520_ + i_519_;
		float f_524_ = f * (float) i_519_;
		float f_525_ = f_522_ * (float) i_519_;
		float f_526_ = 0.0F;
		float f_527_ = 0.0F;
		float f_528_ = f_524_;
		float f_529_ = f_525_;
		if (i_521_ > i_519_) {
			f_526_ = f * (float) (i_519_ + i_520_ - i_521_);
			f_527_ = f_522_ * (float) (i_519_ + i_520_ - i_521_);
		} else {
			f_528_ = f * (float) (i_519_ - i_521_);
			f_529_ = f_522_ * (float) (i_519_ - i_521_);
		}
		float f_530_ = (float) i + f_526_;
		float f_531_ = (float) i_514_ + f_527_;
		float f_532_ = f * (float) i_520_;
		float f_533_ = f_522_ * (float) i_520_;
		for (;;) {
			if (i_515_ > i) {
				if (f_530_ > (float) i_515_)
					break;
				if (f_530_ + f_528_ > (float) i_515_)
					f_528_ = (float) i_515_ - f_530_;
			} else {
				if (f_530_ < (float) i_515_)
					break;
				if (f_530_ + f_528_ < (float) i_515_)
					f_528_ = (float) i_515_ - f_530_;
			}
			if (i_516_ > i_514_) {
				if (f_531_ > (float) i_516_)
					break;
				if (f_531_ + f_529_ > (float) i_516_)
					f_529_ = (float) i_516_ - f_531_;
			} else {
				if (f_531_ < (float) i_516_)
					break;
				if (f_531_ + f_529_ < (float) i_516_)
					f_529_ = (float) i_516_ - f_531_;
			}
			if (!method5026(f_530_, f_531_, 0.0F, f_530_ + f_528_, f_531_ + f_529_, 0.0F))
				return;
			method4982();
			f_530_ += f_532_ + f_528_;
			f_531_ += f_533_ + f_529_;
			f_528_ = f_524_;
			f_529_ = f_525_;
		}
		method5135(true);
		class164.method1931();
	}

	public final void jb(int i, Class77 class77) {
		((Class_ra_Sub2) this).anInt8573 = i;
		((Class_ra_Sub2) this).aClass77_8456 = class77;
		((Class_ra_Sub2) this).aBoolean8571 = true;
	}

	abstract void method5044();

	abstract void method5045();

	abstract void method5046();

	public final void js(int i, int i_534_, int i_535_, int i_536_) {
		((Class_ra_Sub2) this).aClass180_8470.method2058(i, i_534_, i_535_, i_536_);
	}

	abstract void method5047();

	public final void r(int i, int i_537_, int i_538_, int i_539_) {
		int i_540_;
		int i_541_;
		if (aClass76_4228 != null) {
			i_541_ = aClass76_4228.method856();
			i_540_ = aClass76_4228.method857();
		} else {
			i_540_ = 0;
			i_541_ = 0;
		}
		if (i <= 0 && i_538_ >= i_541_ - 1 && i_537_ <= 0 && i_539_ >= i_540_ - 1)
			L();
		else {
			anInt8610 = i >= 0 ? i : 0;
			anInt8447 = i_538_ <= i_541_ ? i_538_ : i_541_;
			anInt8521 = i_537_ >= 0 ? i_537_ : 0;
			anInt8506 = i_539_ <= i_540_ ? i_539_ : i_540_;
			if (!aBoolean8612 && (((Class_ra_Sub2) this).aBoolean8555 || method4903() == Class161.aClass161_1688)) {
				aBoolean8612 = true;
				method4914();
			}
			method4913();
		}
	}

	abstract void method5048();

	public final void ja(int i, Class77 class77) {
		((Class_ra_Sub2) this).anInt8573 = i;
		((Class_ra_Sub2) this).aClass77_8456 = class77;
		((Class_ra_Sub2) this).aBoolean8571 = true;
	}

	abstract void method5049();

	abstract void method5050();

	public abstract boolean method5051();

	abstract void method5052();

	abstract void method5053();

	public final boolean eb() {
		return true;
	}

	abstract void method5054();

	abstract void method5055();

	abstract boolean method5056(Class72 class72, Class86 class86);

	abstract boolean method5057(Class72 class72, Class86 class86);

	abstract Interface11_Impl3 method5058(Class72 class72, int i, int i_542_, boolean bool, float[] fs, int i_543_, int i_544_);

	public abstract void method5059();

	abstract Interface11_Impl3 method5060(Class72 class72, int i, int i_545_, boolean bool, byte[] is, int i_546_, int i_547_);

	abstract Interface11_Impl3 method5061(Class72 class72, int i, int i_548_, boolean bool, float[] fs, int i_549_, int i_550_);

	abstract Interface11_Impl3 method5062(Class72 class72, int i, int i_551_, boolean bool, float[] fs, int i_552_, int i_553_);

	abstract Interface11_Impl3 method5063(Class72 class72, int i, int i_554_, boolean bool, float[] fs, int i_555_, int i_556_);

	abstract Interface11_Impl3 method5064(Class72 class72, int i, int i_557_, boolean bool, float[] fs, int i_558_, int i_559_);

	abstract Interface11_Impl3 method5065(int i, int i_560_, boolean bool, int[] is, int i_561_, int i_562_);

	abstract Interface11_Impl3 method5066(int i, int i_563_, boolean bool, int[] is, int i_564_, int i_565_);

	abstract Interface11_Impl1 method5067(int i, boolean bool, int[][] is);

	public final int hd(int i, int i_566_) {
		return i | i_566_;
	}

	abstract Interface11_Impl1 method5068(int i, boolean bool, int[][] is);

	abstract Interface11_Impl2 method5069(Class72 class72, int i, int i_567_, int i_568_, boolean bool, byte[] is);

	abstract Interface11_Impl2 method5070(Class72 class72, int i, int i_569_, int i_570_, boolean bool, byte[] is);

	abstract Interface11_Impl2 method5071(Class72 class72, int i, int i_571_, int i_572_, boolean bool, byte[] is);

	abstract Interface11_Impl3_Impl1 method5072(Class72 class72, Class86 class86, int i, int i_573_);

	abstract Interface11_Impl3_Impl1 method5073(Class72 class72, Class86 class86, int i, int i_574_);

	abstract Interface11_Impl3_Impl1 method5074(Class72 class72, Class86 class86, int i, int i_575_);

	abstract void method5075();

	abstract void method5076();

	public abstract void method5077();

	public abstract void method5078();

	public final void ij(float f) {
		if (aFloat8533 != f) {
			aFloat8533 = f;
			method4937();
			method4939();
		}
	}

	abstract void method5079(int i, Class175 class175, boolean bool, boolean bool_576_);

	public final void hr(int i, Class_ta class_ta, int i_577_, int i_578_) {
		RA(false);
		((Class_ra_Sub2) this).aClass61_Sub1_8554.method703(0.0F, 0.0F, (float) method4782((byte) 0).method856(), 0.0F, 0.0F, (float) method4782((byte) 0).method857(), 0, class_ta, i_577_, i_578_);
		RA(true);
	}

	abstract void method5080(int i, Class175 class175, boolean bool, boolean bool_579_);

	public abstract void method5081(int i, Interface9_Impl1 interface9_impl1);

	final boolean method5082() {
		return aBoolean8601;
	}

	public int gv(int i, int i_580_, int i_581_, int i_582_, int i_583_, int i_584_) {
		int i_585_ = 0;
		float f = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[14] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[2] * (float) i) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[6] * (float) i_580_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[10] * (float) i_581_));
		float f_586_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[14] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[2] * (float) i_582_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[6] * (float) i_583_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[10] * (float) i_584_));
		float f_587_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[15] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[3] * (float) i) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[7] * (float) i_580_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[11] * (float) i_581_));
		float f_588_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[15] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[3] * (float) i_582_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[7] * (float) i_583_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[11] * (float) i_584_));
		if (f < -f_587_ && f_586_ < -f_588_)
			i_585_ |= 0x10;
		else if (f > f_587_ && f_586_ > f_588_)
			i_585_ |= 0x20;
		float f_589_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[12] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[0] * (float) i) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[4] * (float) i_580_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[8] * (float) i_581_));
		float f_590_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[12] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[0] * (float) i_582_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[4] * (float) i_583_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[8] * (float) i_584_));
		if (f_589_ < -f_587_ && f_590_ < -f_588_)
			i_585_ |= 0x1;
		if (f_589_ > f_587_ && f_590_ > f_588_)
			i_585_ |= 0x2;
		float f_591_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[13] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[1] * (float) i) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[5] * (float) i_580_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[9] * (float) i_581_));
		float f_592_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[13] + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[1] * (float) i_582_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[5] * (float) i_583_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[9] * (float) i_584_));
		if (f_591_ < -f_587_ && f_592_ < -f_588_)
			i_585_ |= 0x4;
		if (f_591_ > f_587_ && f_592_ > f_588_)
			i_585_ |= 0x8;
		return i_585_;
	}

	abstract void method5083();

	public final boolean e() {
		return true;
	}

	public final void c(int i, int i_593_, int i_594_) {
		if (anInt8476 != i || anInt8578 != i_593_ || anInt8560 != i_594_) {
			anInt8476 = i;
			anInt8578 = i_593_;
			anInt8560 = i_594_;
			method5015();
			method4974();
		}
	}

	abstract void method5084();

	final void method5085() {
		if (!((Class_ra_Sub2) this).aBoolean8484) {
			int i;
			int i_595_;
			if (aClass76_4228 != null) {
				i_595_ = aClass76_4228.method856();
				i = aClass76_4228.method857();
			} else {
				i = 0;
				i_595_ = 0;
			}
			Class249 class249 = ((Class_ra_Sub2) this).aClass249_8485;
			if (i_595_ != 0 && i != 0)
				class249.method2489(0.0F, (float) i_595_, 0.0F, (float) i, -1.0F, 1.0F);
			else
				class249.method2516();
			((Class_ra_Sub2) this).aClass249_8486.method2510(class249);
			method5103(((Class_ra_Sub2) this).aClass249_8486);
			((Class_ra_Sub2) this).aBoolean8484 = true;
		}
	}

	public void au() {
		((Class_ra_Sub2) this).anInt8597 = 0;
		((Class_ra_Sub2) this).anInt8510 = 0;
		((Class_ra_Sub2) this).anInt8511 = aClass76_4228.method856();
		((Class_ra_Sub2) this).anInt8512 = aClass76_4228.method857();
		method5018();
	}

	public final void db(int i, int i_596_, int i_597_, int i_598_) {
		((Class_ra_Sub2) this).aClass180_8470.method2058(i, i_596_, i_597_, i_598_);
	}

	abstract void method5086();

	abstract void method5087();

	public final Class247 cj() {
		return ((Class_ra_Sub2) this).aClass247_8611;
	}

	abstract void method5088();

	abstract void method5089();

	abstract void method5090();

	abstract void method5091();

	abstract void method5092();

	public void jd(float f, float f_599_, float f_600_, float[] fs) {
		float f_601_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[15] + ((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[3] * f + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[7] * f_599_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[11] * f_600_));
		float f_602_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[12] + ((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[0] * f + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[4] * f_599_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[8] * f_600_));
		float f_603_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[13] + ((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[1] * f + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[5] * f_599_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[9] * f_600_));
		float f_604_ = (aClass249_8472.aFloatArray2631[14] + aClass249_8472.aFloatArray2631[2] * f + aClass249_8472.aFloatArray2631[6] * f_599_ + aClass249_8472.aFloatArray2631[10] * f_600_);
		fs[0] = (((Class_ra_Sub2) this).aFloat8495 + ((Class_ra_Sub2) this).aFloat8505 * f_602_ / f_601_);
		fs[1] = (((Class_ra_Sub2) this).aFloat8497 + ((Class_ra_Sub2) this).aFloat8498 * f_603_ / f_601_);
		fs[2] = f_604_;
	}

	abstract void method5093(int i);

	abstract void method5094(int i);

	abstract void method5095();

	abstract void method5096();

	abstract void method5097();

	public abstract void method5098(Class184 class184);

	final void iy(float f, float f_605_, float f_606_, float f_607_, float f_608_, float f_609_) {
		Class192_Sub1.aFloat7341 = f;
		Class192_Sub1.aFloat7340 = f_605_;
		Class192_Sub1.aFloat7339 = f_606_;
		Class192_Sub1.aFloat7342 = f_609_;
	}

	public final boolean eh() {
		return true;
	}

	final void method5099() {
		((Class_ra_Sub2) this).aBoolean8487 = false;
		method4929();
		if (((Class_ra_Sub2) this).aClass174_8483 == Class174.aClass174_1735)
			method4930();
	}

	abstract void method5100();

	abstract void method5101();

	abstract void method5102(boolean bool);

	public abstract void method5103(Class249 class249);

	public abstract void method5104(Class199 class199, int i, int i_610_);

	public abstract void method5105(Class184 class184);

	public final void method_if(int i, int i_611_, int i_612_) {
		if (anInt8476 != i || anInt8578 != i_611_ || anInt8560 != i_612_) {
			anInt8476 = i;
			anInt8578 = i_611_;
			anInt8560 = i_612_;
			method5015();
			method4974();
		}
	}

	public abstract void method5106(int i, Interface9_Impl1 interface9_impl1);

	public abstract void method5107(int i, Interface9_Impl1 interface9_impl1);

	public final boolean cu() {
		if (((Class_ra_Sub2) this).aClass192Array8569[1] != null && !((Class_ra_Sub2) this).aClass192Array8569[1].method2106()) {
			boolean bool = (((Class_ra_Sub2) this).aClass180_8470.method2062(((Class_ra_Sub2) this).aClass192Array8569[1]));
			if (bool)
				((Class_ra_Sub2) this).aClass188_8552.method2096();
			return bool;
		}
		return false;
	}

	abstract void method5108(Interface9_Impl2 interface9_impl2);

	abstract void method5109(Interface9_Impl2 interface9_impl2);

	abstract void method5110(Interface9_Impl2 interface9_impl2);

	public void method5111() {
		if (((Class_ra_Sub2) this).aClass187_8556 != null)
			((Class_ra_Sub2) this).aClass187_8556.method2089();
	}

	abstract void method5112();

	public abstract void method5113(Class199 class199, int i, int i_613_);

	public final void method5114(int i, Class175 class175) {
		method5001(i, class175, false, false);
	}

	abstract void method5115(Interface9_Impl2 interface9_impl2, Class199 class199, int i, int i_614_, int i_615_, int i_616_);

	public abstract void method5116(Class199 class199, int i, int i_617_, int i_618_, int i_619_);

	public final boolean ev() {
		return aBoolean8566;
	}

	public final void gx(int i, int i_620_, int i_621_, int i_622_, int i_623_) {
		br(i, i_620_, i + i_621_, i_620_, i_622_, i_623_);
	}

	abstract void method5117(int i);

	abstract void method5118();

	abstract void method5119();

	abstract void method5120();

	abstract void method5121();

	public final void gw(int i, int i_624_, int i_625_, int i_626_, int i_627_, int i_628_, Class_ta class_ta, int i_629_, int i_630_) {
		/* empty */
	}

	abstract void method5122();

	abstract void method5123();

	public void jz(float f, float f_631_, float f_632_, float[] fs) {
		float f_633_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[15] + ((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[3] * f + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[7] * f_631_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[11] * f_632_));
		float f_634_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[12] + ((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[0] * f + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[4] * f_631_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[8] * f_632_));
		float f_635_ = (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[13] + ((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[1] * f + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[5] * f_631_) + (((Class_ra_Sub2) this).aClass249_8492.aFloatArray2631[9] * f_632_));
		float f_636_ = (aClass249_8472.aFloatArray2631[14] + aClass249_8472.aFloatArray2631[2] * f + aClass249_8472.aFloatArray2631[6] * f_631_ + aClass249_8472.aFloatArray2631[10] * f_632_);
		fs[0] = (((Class_ra_Sub2) this).aFloat8495 + ((Class_ra_Sub2) this).aFloat8505 * f_634_ / f_633_);
		fs[1] = (((Class_ra_Sub2) this).aFloat8497 + ((Class_ra_Sub2) this).aFloat8498 * f_635_ / f_633_);
		fs[2] = f_636_;
	}

	abstract void method5124();

	public final void jt() {
		((Class_ra_Sub2) this).aClass180_8470.method2059();
	}

	abstract boolean method5125(Class72 class72, Class86 class86);

	abstract void method5126();

	abstract void method5127();

	abstract void method5128();

	abstract void method5129();

	public final void gh(int i, int i_637_, int i_638_, int i_639_, int i_640_, int i_641_, int i_642_) {
		i += 1.0F;
		i_637_ += 1.0F;
		i_638_ += 1.0F;
		i_639_ += 1.0F;
		float f = (float) (i_638_ - i);
		float f_643_ = (float) (i_639_ - i_637_);
		float f_644_ = 1.0F / (float) Math.sqrt((double) (f * f + f_643_ * f_643_));
		f *= f_644_;
		f_643_ *= f_644_;
		i -= f;
		i_637_ -= f_643_;
		float f_645_ = -f_643_;
		float f_646_ = f;
		f_645_ *= 0.5F * (float) i_641_;
		f_646_ *= 0.5F * (float) i_641_;
		((Class_ra_Sub2) this).aClass61_Sub1_8553.method715((float) i - f_645_, (float) i_637_ - f_646_, (float) i_638_ - f_645_, (float) i_639_ - f_646_, (float) i + f_645_, (float) i_637_ + f_646_, 0, i_640_, i_642_);
	}

	abstract Interface9_Impl2 method5130(boolean bool);

	abstract Interface9_Impl1 method5131(boolean bool);

	abstract Interface9_Impl1 method5132(boolean bool);

	public abstract void method5133(Class249 class249, Class249 class249_647_, Class249 class249_648_);

	public abstract void method5134(Class249 class249, Class249 class249_649_, Class249 class249_650_);

	abstract void method5135(boolean bool);

	abstract Interface11_Impl3 method5136(Class72 class72, Class86 class86, int i, int i_651_);

	abstract Interface11_Impl3 method5137(Class72 class72, Class86 class86, int i, int i_652_);

	abstract Interface11_Impl3 method5138(Class72 class72, Class86 class86, int i, int i_653_);

	abstract void method5139(int i, Class175 class175, boolean bool);
}
