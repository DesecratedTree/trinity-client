/* Class76_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

public class Class76_Sub1_Sub1 extends Class76_Sub1 {
	Class_ra_Sub1 aClass_ra_Sub1_9365;
	OpenGL anOpenGL9366;
	int anInt9367;
	long aLong9368;
	int anInt9369;
	Canvas aCanvas9370;
	boolean aBoolean9371 = false;

	boolean method863() {
		return true;
	}

	Class76_Sub1_Sub1(Class_ra_Sub1 class_ra_sub1, Canvas canvas, long l) {
		((Class76_Sub1_Sub1) this).aClass_ra_Sub1_9365 = class_ra_sub1;
		((Class76_Sub1_Sub1) this).aCanvas9370 = canvas;
		((Class76_Sub1_Sub1) this).anOpenGL9366 = ((Class_ra_Sub1) class_ra_sub1).anOpenGL8309;
		((Class76_Sub1_Sub1) this).aLong9368 = l;
		method887();
	}

	boolean method176() {
		if (((Class76_Sub1_Sub1) this).aBoolean9371)
			throw new IllegalStateException();
		((Class76_Sub1_Sub1) this).anOpenGL9366.setSurface(((Class76_Sub1_Sub1) this).aLong9368);
		((Class76_Sub1_Sub1) this).aClass_ra_Sub1_9365.method4813();
		return true;
	}

	public int method875(int i, int i_0_) {
		return 0;
	}

	void method876(int i, int i_1_) {
		if (((Class76_Sub1_Sub1) this).aBoolean9371)
			throw new IllegalStateException();
		((Class76_Sub1_Sub1) this).anOpenGL9366.surfaceResized(((Class76_Sub1_Sub1) this).aLong9368);
		method887();
		if (this == ((Class76_Sub1_Sub1) this).aClass_ra_Sub1_9365.method4782((byte) 0))
			((Class76_Sub1_Sub1) this).aClass_ra_Sub1_9365.method4866();
	}

	void method887() {
		Dimension dimension = ((Class76_Sub1_Sub1) this).aCanvas9370.getSize();
		((Class76_Sub1_Sub1) this).anInt9367 = dimension.height;
		((Class76_Sub1_Sub1) this).anInt9369 = dimension.width;
	}

	public void method183() {
		if (((Class76_Sub1_Sub1) this).aBoolean9371)
			throw new IllegalStateException();
		((Class76_Sub1_Sub1) this).anOpenGL9366.releaseSurface(((Class76_Sub1_Sub1) this).aCanvas9370, ((Class76_Sub1_Sub1) this).aLong9368);
		((Class76_Sub1_Sub1) this).aBoolean9371 = true;
	}

	public int method883(int i, int i_2_) {
		return 0;
	}

	boolean method862() {
		return true;
	}

	public void method180() {
		if (((Class76_Sub1_Sub1) this).aBoolean9371)
			throw new IllegalStateException();
		((Class76_Sub1_Sub1) this).anOpenGL9366.releaseSurface(((Class76_Sub1_Sub1) this).aCanvas9370, ((Class76_Sub1_Sub1) this).aLong9368);
		((Class76_Sub1_Sub1) this).aBoolean9371 = true;
	}

	public void method179() {
		if (((Class76_Sub1_Sub1) this).aBoolean9371)
			throw new IllegalStateException();
		((Class76_Sub1_Sub1) this).anOpenGL9366.releaseSurface(((Class76_Sub1_Sub1) this).aCanvas9370, ((Class76_Sub1_Sub1) this).aLong9368);
		((Class76_Sub1_Sub1) this).aBoolean9371 = true;
	}

	public int method864() {
		return ((Class76_Sub1_Sub1) this).anInt9369;
	}

	public int method858() {
		return ((Class76_Sub1_Sub1) this).anInt9369;
	}

	public int method859() {
		return ((Class76_Sub1_Sub1) this).anInt9369;
	}

	public int method861() {
		return ((Class76_Sub1_Sub1) this).anInt9367;
	}

	public int method855() {
		return ((Class76_Sub1_Sub1) this).anInt9367;
	}

	public int method860() {
		return ((Class76_Sub1_Sub1) this).anInt9367;
	}

	Class76_Sub1_Sub1(Class_ra_Sub1 class_ra_sub1, Canvas canvas) {
		this(class_ra_sub1, canvas, ((Class_ra_Sub1) class_ra_sub1).anOpenGL8309.prepareSurface(canvas));
	}

	boolean method182() {
		if (((Class76_Sub1_Sub1) this).aBoolean9371)
			throw new IllegalStateException();
		((Class76_Sub1_Sub1) this).anOpenGL9366.setSurface(((Class76_Sub1_Sub1) this).aLong9368);
		((Class76_Sub1_Sub1) this).aClass_ra_Sub1_9365.method4813();
		return true;
	}

	boolean method178() {
		if (((Class76_Sub1_Sub1) this).aBoolean9371)
			throw new IllegalStateException();
		((Class76_Sub1_Sub1) this).anOpenGL9366.setSurface(((Class76_Sub1_Sub1) this).aLong9368);
		((Class76_Sub1_Sub1) this).aClass_ra_Sub1_9365.method4813();
		return true;
	}

	public int method856() {
		return ((Class76_Sub1_Sub1) this).anInt9369;
	}

	boolean method865() {
		return true;
	}

	public void method185() {
		if (((Class76_Sub1_Sub1) this).aBoolean9371)
			throw new IllegalStateException();
		((Class76_Sub1_Sub1) this).anOpenGL9366.releaseSurface(((Class76_Sub1_Sub1) this).aCanvas9370, ((Class76_Sub1_Sub1) this).aLong9368);
		((Class76_Sub1_Sub1) this).aBoolean9371 = true;
	}

	public int method857() {
		return ((Class76_Sub1_Sub1) this).anInt9367;
	}

	public void method181() {
		if (((Class76_Sub1_Sub1) this).aBoolean9371)
			throw new IllegalStateException();
		((Class76_Sub1_Sub1) this).anOpenGL9366.releaseSurface(((Class76_Sub1_Sub1) this).aCanvas9370, ((Class76_Sub1_Sub1) this).aLong9368);
		((Class76_Sub1_Sub1) this).aBoolean9371 = true;
	}

	boolean method174() {
		if (((Class76_Sub1_Sub1) this).aBoolean9371)
			throw new IllegalStateException();
		((Class76_Sub1_Sub1) this).anOpenGL9366.setSurface(((Class76_Sub1_Sub1) this).aLong9368);
		((Class76_Sub1_Sub1) this).aClass_ra_Sub1_9365.method4813();
		return true;
	}

	public int method877() {
		if (((Class76_Sub1_Sub1) this).aBoolean9371)
			throw new IllegalStateException();
		((Class76_Sub1_Sub1) this).anOpenGL9366.swapBuffers(((Class76_Sub1_Sub1) this).aLong9368);
		return 0;
	}

	public int method878() {
		if (((Class76_Sub1_Sub1) this).aBoolean9371)
			throw new IllegalStateException();
		((Class76_Sub1_Sub1) this).anOpenGL9366.swapBuffers(((Class76_Sub1_Sub1) this).aLong9368);
		return 0;
	}

	public int method879() {
		if (((Class76_Sub1_Sub1) this).aBoolean9371)
			throw new IllegalStateException();
		((Class76_Sub1_Sub1) this).anOpenGL9366.swapBuffers(((Class76_Sub1_Sub1) this).aLong9368);
		return 0;
	}

	public int method880(int i, int i_3_) {
		return 0;
	}

	public int method881(int i, int i_4_) {
		return 0;
	}

	public int method873(int i, int i_5_) {
		return 0;
	}

	public int method884(int i, int i_6_) {
		return 0;
	}

	public int method874() {
		if (((Class76_Sub1_Sub1) this).aBoolean9371)
			throw new IllegalStateException();
		((Class76_Sub1_Sub1) this).anOpenGL9366.swapBuffers(((Class76_Sub1_Sub1) this).aLong9368);
		return 0;
	}

	public int method885(int i, int i_7_) {
		return 0;
	}

	void method882(int i, int i_8_) {
		if (((Class76_Sub1_Sub1) this).aBoolean9371)
			throw new IllegalStateException();
		((Class76_Sub1_Sub1) this).anOpenGL9366.surfaceResized(((Class76_Sub1_Sub1) this).aLong9368);
		method887();
		if (this == ((Class76_Sub1_Sub1) this).aClass_ra_Sub1_9365.method4782((byte) 0))
			((Class76_Sub1_Sub1) this).aClass_ra_Sub1_9365.method4866();
	}
}
