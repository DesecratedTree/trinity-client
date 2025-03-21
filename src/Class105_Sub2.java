/* Class105_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class105_Sub2 extends Class105 {
	Class_ra_Sub2_Sub1 aClass_ra_Sub2_Sub1_7220;
	Class123_Sub2 aClass123_Sub2_7221;
	int anInt7222;

	public void method1294() {
		if ((((Class_ra_Sub2_Sub1) ((Class105_Sub2) this).aClass_ra_Sub2_Sub1_7220).aClass123_Sub2_9875) != ((Class105_Sub2) this).aClass123_Sub2_7221) {
			if (((Class105_Sub2) this).aClass123_Sub2_7221 == null)
				throw new RuntimeException_Sub1();
			OpenGL.glUseProgram(((Class105_Sub2) this).anInt7222);
			((Class_ra_Sub2_Sub1) ((Class105_Sub2) this).aClass_ra_Sub2_Sub1_7220).aClass123_Sub2_9875 = ((Class105_Sub2) this).aClass123_Sub2_7221;
		}
	}

	Class123 method1278(Class_ra_Sub2 class_ra_sub2, Class118 class118) {
		return new Class123_Sub2((Class_ra_Sub2_Sub1) class_ra_sub2, this, class118);
	}

	public void method1285() {
		if ((((Class_ra_Sub2_Sub1) ((Class105_Sub2) this).aClass_ra_Sub2_Sub1_7220).aClass123_Sub2_9875) != ((Class105_Sub2) this).aClass123_Sub2_7221) {
			if (((Class105_Sub2) this).aClass123_Sub2_7221 == null)
				throw new RuntimeException_Sub1();
			OpenGL.glUseProgram(((Class105_Sub2) this).anInt7222);
			((Class_ra_Sub2_Sub1) ((Class105_Sub2) this).aClass_ra_Sub2_Sub1_7220).aClass123_Sub2_9875 = ((Class105_Sub2) this).aClass123_Sub2_7221;
		}
	}

	public boolean method1293(Class123 class123) {
		if (((Class105_Sub2) this).aClass123_Sub2_7221 == class123)
			return true;
		if (!class123.method1454())
			return false;
		boolean bool = method1251();
		((Class105_Sub2) this).aClass123_Sub2_7221 = (Class123_Sub2) class123;
		anInt998 = method1297(class123, -825848568) * -207157191;
		if (anInt998 * -861247991 == -1)
			throw new IllegalArgumentException();
		((Class105_Sub2) this).anInt7222 = (((Class123_Sub2) ((Class105_Sub2) this).aClass123_Sub2_7221).anInt8906);
		if (bool) {
			OpenGL.glUseProgram(((Class105_Sub2) this).anInt7222);
			((Class_ra_Sub2_Sub1) ((Class105_Sub2) this).aClass_ra_Sub2_Sub1_7220).aClass123_Sub2_9875 = ((Class105_Sub2) this).aClass123_Sub2_7221;
		}
		return true;
	}

	public void method1249() {
		if ((((Class_ra_Sub2_Sub1) ((Class105_Sub2) this).aClass_ra_Sub2_Sub1_7220).aClass123_Sub2_9875) != ((Class105_Sub2) this).aClass123_Sub2_7221) {
			if (((Class105_Sub2) this).aClass123_Sub2_7221 == null)
				throw new RuntimeException_Sub1();
			OpenGL.glUseProgram(((Class105_Sub2) this).anInt7222);
			((Class_ra_Sub2_Sub1) ((Class105_Sub2) this).aClass_ra_Sub2_Sub1_7220).aClass123_Sub2_9875 = ((Class105_Sub2) this).aClass123_Sub2_7221;
		}
	}

	public void method1250() {
		/* empty */
	}

	public boolean method1251() {
		return ((((Class_ra_Sub2_Sub1) ((Class105_Sub2) this).aClass_ra_Sub2_Sub1_7220).aClass123_Sub2_9875) == ((Class105_Sub2) this).aClass123_Sub2_7221);
	}

	void method1265() {
		for (int i = 0; i < method1255((byte) 4); i++)
			((Class123_Sub2) method1256(i, -109397407)).method53();
		super.method1265();
	}

	public void method1273() {
		/* empty */
	}

	Class123 method1289(Class_ra_Sub2 class_ra_sub2, Class118 class118) {
		return new Class123_Sub2((Class_ra_Sub2_Sub1) class_ra_sub2, this, class118);
	}

	void method1313() {
		for (int i = 0; i < method1255((byte) -39); i++)
			((Class123_Sub2) method1256(i, -2128919157)).method53();
		super.method1265();
	}

	Class330_Sub15_Sub1 method1261(Class104 class104) {
		return new Class330_Sub15_Sub1_Sub1(this, class104);
	}

	public boolean method1258(Class123 class123) {
		if (((Class105_Sub2) this).aClass123_Sub2_7221 == class123)
			return true;
		if (!class123.method1454())
			return false;
		boolean bool = method1251();
		((Class105_Sub2) this).aClass123_Sub2_7221 = (Class123_Sub2) class123;
		anInt998 = method1297(class123, 945945069) * -207157191;
		if (anInt998 * -861247991 == -1)
			throw new IllegalArgumentException();
		((Class105_Sub2) this).anInt7222 = (((Class123_Sub2) ((Class105_Sub2) this).aClass123_Sub2_7221).anInt8906);
		if (bool) {
			OpenGL.glUseProgram(((Class105_Sub2) this).anInt7222);
			((Class_ra_Sub2_Sub1) ((Class105_Sub2) this).aClass_ra_Sub2_Sub1_7220).aClass123_Sub2_9875 = ((Class105_Sub2) this).aClass123_Sub2_7221;
		}
		return true;
	}

	public void method1286() {
		/* empty */
	}

	Class105_Sub2(Class_ra_Sub2_Sub1 class_ra_sub2_sub1, Class113 class113) {
		super((Class_ra_Sub2) class_ra_sub2_sub1, class113);
		((Class105_Sub2) this).aClass_ra_Sub2_Sub1_7220 = class_ra_sub2_sub1;
	}

	Class123 method1302(Class_ra_Sub2 class_ra_sub2, Class118 class118) {
		return new Class123_Sub2((Class_ra_Sub2_Sub1) class_ra_sub2, this, class118);
	}

	public boolean method1303() {
		return ((((Class_ra_Sub2_Sub1) ((Class105_Sub2) this).aClass_ra_Sub2_Sub1_7220).aClass123_Sub2_9875) == ((Class105_Sub2) this).aClass123_Sub2_7221);
	}

	public boolean method1300() {
		return ((((Class_ra_Sub2_Sub1) ((Class105_Sub2) this).aClass_ra_Sub2_Sub1_7220).aClass123_Sub2_9875) == ((Class105_Sub2) this).aClass123_Sub2_7221);
	}

	Class123 method1299(Class_ra_Sub2 class_ra_sub2, Class118 class118) {
		return new Class123_Sub2((Class_ra_Sub2_Sub1) class_ra_sub2, this, class118);
	}

	Class123 method1296(Class_ra_Sub2 class_ra_sub2, Class118 class118) {
		return new Class123_Sub2((Class_ra_Sub2_Sub1) class_ra_sub2, this, class118);
	}

	public void method1284() {
		if ((((Class_ra_Sub2_Sub1) ((Class105_Sub2) this).aClass_ra_Sub2_Sub1_7220).aClass123_Sub2_9875) != ((Class105_Sub2) this).aClass123_Sub2_7221) {
			if (((Class105_Sub2) this).aClass123_Sub2_7221 == null)
				throw new RuntimeException_Sub1();
			OpenGL.glUseProgram(((Class105_Sub2) this).anInt7222);
			((Class_ra_Sub2_Sub1) ((Class105_Sub2) this).aClass_ra_Sub2_Sub1_7220).aClass123_Sub2_9875 = ((Class105_Sub2) this).aClass123_Sub2_7221;
		}
	}

	public boolean method1291(Class123 class123) {
		if (((Class105_Sub2) this).aClass123_Sub2_7221 == class123)
			return true;
		if (!class123.method1454())
			return false;
		boolean bool = method1251();
		((Class105_Sub2) this).aClass123_Sub2_7221 = (Class123_Sub2) class123;
		anInt998 = method1297(class123, 1403656261) * -207157191;
		if (anInt998 * -861247991 == -1)
			throw new IllegalArgumentException();
		((Class105_Sub2) this).anInt7222 = (((Class123_Sub2) ((Class105_Sub2) this).aClass123_Sub2_7221).anInt8906);
		if (bool) {
			OpenGL.glUseProgram(((Class105_Sub2) this).anInt7222);
			((Class_ra_Sub2_Sub1) ((Class105_Sub2) this).aClass_ra_Sub2_Sub1_7220).aClass123_Sub2_9875 = ((Class105_Sub2) this).aClass123_Sub2_7221;
		}
		return true;
	}

	public boolean method1292(Class123 class123) {
		if (((Class105_Sub2) this).aClass123_Sub2_7221 == class123)
			return true;
		if (!class123.method1454())
			return false;
		boolean bool = method1251();
		((Class105_Sub2) this).aClass123_Sub2_7221 = (Class123_Sub2) class123;
		anInt998 = method1297(class123, 1054459423) * -207157191;
		if (anInt998 * -861247991 == -1)
			throw new IllegalArgumentException();
		((Class105_Sub2) this).anInt7222 = (((Class123_Sub2) ((Class105_Sub2) this).aClass123_Sub2_7221).anInt8906);
		if (bool) {
			OpenGL.glUseProgram(((Class105_Sub2) this).anInt7222);
			((Class_ra_Sub2_Sub1) ((Class105_Sub2) this).aClass_ra_Sub2_Sub1_7220).aClass123_Sub2_9875 = ((Class105_Sub2) this).aClass123_Sub2_7221;
		}
		return true;
	}

	void method1314() {
		for (int i = 0; i < method1255((byte) 65); i++)
			((Class123_Sub2) method1256(i, -798756920)).method53();
		super.method1265();
	}

	public boolean method1287() {
		return ((((Class_ra_Sub2_Sub1) ((Class105_Sub2) this).aClass_ra_Sub2_Sub1_7220).aClass123_Sub2_9875) == ((Class105_Sub2) this).aClass123_Sub2_7221);
	}

	void method1315() {
		for (int i = 0; i < method1255((byte) 17); i++)
			((Class123_Sub2) method1256(i, -601410052)).method53();
		super.method1265();
	}

	Class330_Sub15_Sub1 method1304(Class104 class104) {
		return new Class330_Sub15_Sub1_Sub1(this, class104);
	}
}
