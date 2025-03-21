/* Class164_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class164_Sub1_Sub1 extends Class164_Sub1 {
	public int anInt9431;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9432;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9433;
	float[] aFloatArray9434;
	Class123 aClass123_9435;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9436;
	public Class249 aClass249_9437 = new Class249();
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9438;
	Class123 aClass123_9439;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9440;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9441;
	Class155 aClass155_9442;
	float[] aFloatArray9443;
	float aFloat9444;
	public int anInt9445;
	public Class249 aClass249_9446 = new Class249();
	public int anInt9447;
	public int anInt9448;

	public Class164_Sub1_Sub1(Class_ra_Sub2 class_ra_sub2, Class155 class155) throws Exception_Sub2 {
		super(class_ra_sub2);
		((Class164_Sub1_Sub1) this).aFloatArray9434 = new float[4];
		((Class164_Sub1_Sub1) this).aFloatArray9443 = new float[4];
		((Class164_Sub1_Sub1) this).aClass155_9442 = class155;
		if (((Class164_Sub1_Sub1) this).aClass155_9442.method1825() && class_ra_sub2.method5051())
			method1939("Waterfall");
	}

	public void method1952(int i, int i_0_, int i_1_) {
		try {
			float f = -5.0E-4F * (float) ((i & 0x3) + 1);
			float f_2_ = (float) (1 + (i >> 3 & 0x3)) * 5.0E-4F;
			float f_3_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
			boolean bool = 0 != (i & 0x80);
			if (bool) {
				((Class164_Sub1_Sub1) this).aFloatArray9434[0] = f_3_;
				((Class164_Sub1_Sub1) this).aFloatArray9434[1] = 0.0F;
				((Class164_Sub1_Sub1) this).aFloatArray9434[2] = 0.0F;
				((Class164_Sub1_Sub1) this).aFloatArray9434[3] = 0.0F;
			} else {
				((Class164_Sub1_Sub1) this).aFloatArray9434[0] = 0.0F;
				((Class164_Sub1_Sub1) this).aFloatArray9434[1] = 0.0F;
				((Class164_Sub1_Sub1) this).aFloatArray9434[2] = f_3_;
				((Class164_Sub1_Sub1) this).aFloatArray9434[3] = 0.0F;
			}
			((Class164_Sub1_Sub1) this).aFloatArray9443[0] = 0.0F;
			((Class164_Sub1_Sub1) this).aFloatArray9443[1] = f_3_;
			((Class164_Sub1_Sub1) this).aFloatArray9443[2] = 0.0F;
			((Class164_Sub1_Sub1) this).aFloatArray9443[3] = (float) aClass_ra_Sub2_1694.anInt8588 * f % 1.0F;
			if (!((Class164_Sub1_Sub1) this).aClass155_9442.aBoolean1669) {
				int i_4_ = (int) (16.0F * (f_2_ * (float) aClass_ra_Sub2_1694.anInt8588));
				aClass_ra_Sub2_1694.method4956(((Class164_Sub1_Sub1) this).aClass155_9442.anInterface11_Impl3Array1672[i_4_ % 16]);
			} else
				((Class164_Sub1_Sub1) this).aFloat9444 = (float) ((double) f_2_ * (double) aClass_ra_Sub2_1694.anInt8588 % 1.0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahr.bl(").append(')').toString());
		}
	}

	public void method1953(int i) {
		try {
			if (((Class164_Sub1_Sub1) this).aClass155_9442.aBoolean1669)
				aClass105_7310.method1258(((Class164_Sub1_Sub1) this).aClass123_9439);
			else
				aClass105_7310.method1258(((Class164_Sub1_Sub1) this).aClass123_9435);
			aClass105_7310.method1249();
			if (((Class164_Sub1_Sub1) this).aClass155_9442.aBoolean1669)
				aClass105_7310.method1270((((Class164_Sub1_Sub1) this).aClass330_Sub15_Sub1_9441), 0, (((Class164_Sub1_Sub1) this).aClass155_9442.anInterface11_Impl2_1675), (byte) 43);
			aClass105_7310.method1253((((Class164_Sub1_Sub1) this).aClass330_Sub15_Sub1_9438), aClass249_9446, -1543727077);
			aClass105_7310.method1253((((Class164_Sub1_Sub1) this).aClass330_Sub15_Sub1_9436), aClass249_9437, -550899517);
			aClass105_7310.method1266(((Class164_Sub1_Sub1) this).aClass330_Sub15_Sub1_9440, new Class261(((Class164_Sub1_Sub1) this).aFloatArray9434[0], ((Class164_Sub1_Sub1) this).aFloatArray9434[1], ((Class164_Sub1_Sub1) this).aFloatArray9434[2], ((Class164_Sub1_Sub1) this).aFloatArray9434[3]), 658911699);
			aClass105_7310.method1266(((Class164_Sub1_Sub1) this).aClass330_Sub15_Sub1_9433, new Class261(((Class164_Sub1_Sub1) this).aFloatArray9443[0], ((Class164_Sub1_Sub1) this).aFloatArray9443[1], ((Class164_Sub1_Sub1) this).aFloatArray9443[2], ((Class164_Sub1_Sub1) this).aFloatArray9443[3]), -55982157);
			aClass105_7310.method1266((((Class164_Sub1_Sub1) this).aClass330_Sub15_Sub1_9432), new Class261((((Class164_Sub1_Sub1) this).aFloat9444), 0.0F, 0.0F, 0.0F), 1827940407);
			aClass_ra_Sub2_1694.method4987(Class199.aClass199_1926, 430894665 * anInt9445, -906679641 * anInt9431, anInt9447 * -539435271, anInt9448 * 1405728641);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahr.bk(").append(')').toString());
		}
	}

	boolean method1947() throws Exception_Sub2 {
		((Class164_Sub1_Sub1) this).aClass330_Sub15_Sub1_9438 = aClass105_7310.method1295("WorldMatrix", (byte) -2);
		((Class164_Sub1_Sub1) this).aClass330_Sub15_Sub1_9436 = aClass105_7310.method1295("WVPMatrix", (byte) -83);
		((Class164_Sub1_Sub1) this).aClass330_Sub15_Sub1_9440 = aClass105_7310.method1295("UGenerationPlane", (byte) -56);
		((Class164_Sub1_Sub1) this).aClass330_Sub15_Sub1_9433 = aClass105_7310.method1295("VGenerationPlane", (byte) -60);
		((Class164_Sub1_Sub1) this).aClass330_Sub15_Sub1_9432 = aClass105_7310.method1295("Time", (byte) -74);
		((Class164_Sub1_Sub1) this).aClass330_Sub15_Sub1_9441 = aClass105_7310.method1295("billowSampler3D", (byte) -100);
		if (((Class164_Sub1_Sub1) this).aClass155_9442.aBoolean1669) {
			((Class164_Sub1_Sub1) this).aClass123_9439 = aClass105_7310.method1254("Waterfall3D", 973263999);
			aClass105_7310.method1258(((Class164_Sub1_Sub1) this).aClass123_9439);
		} else {
			((Class164_Sub1_Sub1) this).aClass123_9435 = aClass105_7310.method1254("Waterfall2D", -1675802056);
			aClass105_7310.method1258(((Class164_Sub1_Sub1) this).aClass123_9435);
		}
		return true;
	}

	boolean method1938() throws Exception_Sub2 {
		try {
			((Class164_Sub1_Sub1) this).aClass330_Sub15_Sub1_9438 = aClass105_7310.method1295("WorldMatrix", (byte) -53);
			((Class164_Sub1_Sub1) this).aClass330_Sub15_Sub1_9436 = aClass105_7310.method1295("WVPMatrix", (byte) -92);
			((Class164_Sub1_Sub1) this).aClass330_Sub15_Sub1_9440 = aClass105_7310.method1295("UGenerationPlane", (byte) -102);
			((Class164_Sub1_Sub1) this).aClass330_Sub15_Sub1_9433 = aClass105_7310.method1295("VGenerationPlane", (byte) -52);
			((Class164_Sub1_Sub1) this).aClass330_Sub15_Sub1_9432 = aClass105_7310.method1295("Time", (byte) -84);
			((Class164_Sub1_Sub1) this).aClass330_Sub15_Sub1_9441 = aClass105_7310.method1295("billowSampler3D", (byte) -74);
			if (((Class164_Sub1_Sub1) this).aClass155_9442.aBoolean1669) {
				((Class164_Sub1_Sub1) this).aClass123_9439 = aClass105_7310.method1254("Waterfall3D", 318605156);
				aClass105_7310.method1258(((Class164_Sub1_Sub1) this).aClass123_9439);
			} else {
				((Class164_Sub1_Sub1) this).aClass123_9435 = aClass105_7310.method1254("Waterfall2D", -1892758550);
				aClass105_7310.method1258(((Class164_Sub1_Sub1) this).aClass123_9435);
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahr.m(").append(')').toString());
		}
	}
}
