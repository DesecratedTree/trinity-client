/* Class76_Sub1_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

public class Class76_Sub1_Sub2_Sub2 extends Class76_Sub1_Sub2 {
	Canvas aCanvas10097;
	OpenGL anOpenGL10098;
	long aLong10099;
	int anInt10100;
	int anInt10101;

	void method876(int i, int i_0_) {
		((Class76_Sub1_Sub2_Sub2) this).anOpenGL10098.surfaceResized(((Class76_Sub1_Sub2_Sub2) this).aLong10099);
		method889();
		super.method876(i, i_0_);
	}

	Class76_Sub1_Sub2_Sub2(Class_ra_Sub2_Sub1 class_ra_sub2_sub1, Canvas canvas, long l) {
		super(class_ra_sub2_sub1);
		((Class76_Sub1_Sub2_Sub2) this).aCanvas10097 = canvas;
		((Class76_Sub1_Sub2_Sub2) this).anOpenGL10098 = ((Class_ra_Sub2_Sub1) class_ra_sub2_sub1).anOpenGL9881;
		((Class76_Sub1_Sub2_Sub2) this).aLong10099 = l;
		method889();
	}

	public int method873(int i, int i_1_) {
		return 0;
	}

	public int method857() {
		return ((Class76_Sub1_Sub2_Sub2) this).anInt10101;
	}

	public int method880(int i, int i_2_) {
		return 0;
	}

	public int method861() {
		return ((Class76_Sub1_Sub2_Sub2) this).anInt10101;
	}

	public int method874() {
		((Class76_Sub1_Sub2_Sub2) this).anOpenGL10098.swapBuffers(((Class76_Sub1_Sub2_Sub2) this).aLong10099);
		return 0;
	}

	public int method883(int i, int i_3_) {
		return 0;
	}

	boolean method174() {
		return (((Class76_Sub1_Sub2_Sub2) this).anOpenGL10098.setSurface(((Class76_Sub1_Sub2_Sub2) this).aLong10099) && super.method174());
	}

	public int method856() {
		return ((Class76_Sub1_Sub2_Sub2) this).anInt10100;
	}

	public void method179() {
		((Class76_Sub1_Sub2_Sub2) this).anOpenGL10098.releaseSurface(((Class76_Sub1_Sub2_Sub2) this).aCanvas10097, ((Class76_Sub1_Sub2_Sub2) this).aLong10099);
	}

	public int method864() {
		return ((Class76_Sub1_Sub2_Sub2) this).anInt10100;
	}

	void method889() {
		Dimension dimension = ((Class76_Sub1_Sub2_Sub2) this).aCanvas10097.getSize();
		((Class76_Sub1_Sub2_Sub2) this).anInt10101 = dimension.height;
		((Class76_Sub1_Sub2_Sub2) this).anInt10100 = dimension.width;
	}

	public int method859() {
		return ((Class76_Sub1_Sub2_Sub2) this).anInt10100;
	}

	public int method860() {
		return ((Class76_Sub1_Sub2_Sub2) this).anInt10101;
	}

	public int method855() {
		return ((Class76_Sub1_Sub2_Sub2) this).anInt10101;
	}

	public int method884(int i, int i_4_) {
		return 0;
	}

	boolean method176() {
		return (((Class76_Sub1_Sub2_Sub2) this).anOpenGL10098.setSurface(((Class76_Sub1_Sub2_Sub2) this).aLong10099) && super.method174());
	}

	boolean method182() {
		return (((Class76_Sub1_Sub2_Sub2) this).anOpenGL10098.setSurface(((Class76_Sub1_Sub2_Sub2) this).aLong10099) && super.method174());
	}

	public int method875(int i, int i_5_) {
		return 0;
	}

	boolean method863() {
		return true;
	}

	public int method881(int i, int i_6_) {
		return 0;
	}

	public void method185() {
		((Class76_Sub1_Sub2_Sub2) this).anOpenGL10098.releaseSurface(((Class76_Sub1_Sub2_Sub2) this).aCanvas10097, ((Class76_Sub1_Sub2_Sub2) this).aLong10099);
	}

	public void method180() {
		((Class76_Sub1_Sub2_Sub2) this).anOpenGL10098.releaseSurface(((Class76_Sub1_Sub2_Sub2) this).aCanvas10097, ((Class76_Sub1_Sub2_Sub2) this).aLong10099);
	}

	Class76_Sub1_Sub2_Sub2(Class_ra_Sub2_Sub1 class_ra_sub2_sub1, Canvas canvas) {
		this(class_ra_sub2_sub1, canvas, ((Class_ra_Sub2_Sub1) class_ra_sub2_sub1).anOpenGL9881.prepareSurface(canvas));
	}

	public void method183() {
		((Class76_Sub1_Sub2_Sub2) this).anOpenGL10098.releaseSurface(((Class76_Sub1_Sub2_Sub2) this).aCanvas10097, ((Class76_Sub1_Sub2_Sub2) this).aLong10099);
	}

	public int method877() {
		((Class76_Sub1_Sub2_Sub2) this).anOpenGL10098.swapBuffers(((Class76_Sub1_Sub2_Sub2) this).aLong10099);
		return 0;
	}

	public int method878() {
		((Class76_Sub1_Sub2_Sub2) this).anOpenGL10098.swapBuffers(((Class76_Sub1_Sub2_Sub2) this).aLong10099);
		return 0;
	}

	public int method879() {
		((Class76_Sub1_Sub2_Sub2) this).anOpenGL10098.swapBuffers(((Class76_Sub1_Sub2_Sub2) this).aLong10099);
		return 0;
	}

	boolean method178() {
		return (((Class76_Sub1_Sub2_Sub2) this).anOpenGL10098.setSurface(((Class76_Sub1_Sub2_Sub2) this).aLong10099) && super.method174());
	}

	public void method181() {
		((Class76_Sub1_Sub2_Sub2) this).anOpenGL10098.releaseSurface(((Class76_Sub1_Sub2_Sub2) this).aCanvas10097, ((Class76_Sub1_Sub2_Sub2) this).aLong10099);
	}

	void method882(int i, int i_7_) {
		((Class76_Sub1_Sub2_Sub2) this).anOpenGL10098.surfaceResized(((Class76_Sub1_Sub2_Sub2) this).aLong10099);
		method889();
		super.method876(i, i_7_);
	}

	boolean method862() {
		return true;
	}

	public int method858() {
		return ((Class76_Sub1_Sub2_Sub2) this).anInt10100;
	}

	public int method885(int i, int i_8_) {
		return 0;
	}

	boolean method865() {
		return true;
	}
}
