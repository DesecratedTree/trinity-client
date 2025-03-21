/* Class76_Sub1_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class76_Sub1_Sub3_Sub1 extends Class76_Sub1_Sub3 {
	Image anImage10102;

	public final int method884(int i, int i_0_) {
		Graphics graphics = ((Class76_Sub1_Sub3_Sub1) this).aCanvas9374.getGraphics();
		if (null == graphics)
			return 0;
		graphics.drawImage(((Class76_Sub1_Sub3_Sub1) this).anImage10102, i, i_0_, ((Class76_Sub1_Sub3_Sub1) this).aCanvas9374);
		return 0;
	}

	void method890(byte i) {
		try {
			super.method890((byte) 1);
			DataBufferInt databufferint = new DataBufferInt((((Class76_Sub1_Sub3_Sub1) this).anIntArray9377), (((Class76_Sub1_Sub3_Sub1) this).anIntArray9377).length);
			DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
			WritableRaster writableraster = (Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(((Class76_Sub1_Sub3_Sub1) this).anInt9379 * -287027923, (-1203505521 * ((Class76_Sub1_Sub3_Sub1) this).anInt9373))), databufferint, null));
			((Class76_Sub1_Sub3_Sub1) this).anImage10102 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akp.x(").append(')').toString());
		}
	}

	public int method874() {
		try {
			return method883(0, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akp.v(").append(')').toString());
		}
	}

	public final int method880(int i, int i_1_) {
		Graphics graphics = ((Class76_Sub1_Sub3_Sub1) this).aCanvas9374.getGraphics();
		if (null == graphics)
			return 0;
		graphics.drawImage(((Class76_Sub1_Sub3_Sub1) this).anImage10102, i, i_1_, ((Class76_Sub1_Sub3_Sub1) this).aCanvas9374);
		return 0;
	}

	public void method179() {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akp.i(").append(')').toString());
		}
	}

	public void method185() {
		/* empty */
	}

	public final int method883(int i, int i_2_) {
		try {
			Graphics graphics = ((Class76_Sub1_Sub3_Sub1) this).aCanvas9374.getGraphics();
			if (null == graphics)
				return 0;
			graphics.drawImage(((Class76_Sub1_Sub3_Sub1) this).anImage10102, i, i_2_, ((Class76_Sub1_Sub3_Sub1) this).aCanvas9374);
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akp.ay(").append(')').toString());
		}
	}

	void method892() {
		super.method890((byte) 1);
		DataBufferInt databufferint = new DataBufferInt(((Class76_Sub1_Sub3_Sub1) this).anIntArray9377, (((Class76_Sub1_Sub3_Sub1) this).anIntArray9377).length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster writableraster = (Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(((Class76_Sub1_Sub3_Sub1) this).anInt9379 * -287027923, -1203505521 * ((Class76_Sub1_Sub3_Sub1) this).anInt9373)), databufferint, null));
		((Class76_Sub1_Sub3_Sub1) this).anImage10102 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
	}

	public void method183() {
		/* empty */
	}

	public void method181() {
		/* empty */
	}

	public final int method873(int i, int i_3_) {
		Graphics graphics = ((Class76_Sub1_Sub3_Sub1) this).aCanvas9374.getGraphics();
		if (null == graphics)
			return 0;
		graphics.drawImage(((Class76_Sub1_Sub3_Sub1) this).anImage10102, i, i_3_, ((Class76_Sub1_Sub3_Sub1) this).aCanvas9374);
		return 0;
	}

	void method893() {
		super.method890((byte) 1);
		DataBufferInt databufferint = new DataBufferInt(((Class76_Sub1_Sub3_Sub1) this).anIntArray9377, (((Class76_Sub1_Sub3_Sub1) this).anIntArray9377).length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster writableraster = (Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(((Class76_Sub1_Sub3_Sub1) this).anInt9379 * -287027923, -1203505521 * ((Class76_Sub1_Sub3_Sub1) this).anInt9373)), databufferint, null));
		((Class76_Sub1_Sub3_Sub1) this).anImage10102 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
	}

	Class76_Sub1_Sub3_Sub1(Class_ra_Sub3 class_ra_sub3, Canvas canvas, int i, int i_4_) {
		super(class_ra_sub3, canvas, i, i_4_);
		new Rectangle();
		method890((byte) 1);
	}

	public int method877() {
		return method883(0, 0);
	}

	public int method878() {
		return method883(0, 0);
	}

	public int method879() {
		return method883(0, 0);
	}

	public void method180() {
		/* empty */
	}

	public final int method881(int i, int i_5_) {
		Graphics graphics = ((Class76_Sub1_Sub3_Sub1) this).aCanvas9374.getGraphics();
		if (null == graphics)
			return 0;
		graphics.drawImage(((Class76_Sub1_Sub3_Sub1) this).anImage10102, i, i_5_, ((Class76_Sub1_Sub3_Sub1) this).aCanvas9374);
		return 0;
	}

	public final int method875(int i, int i_6_) {
		Graphics graphics = ((Class76_Sub1_Sub3_Sub1) this).aCanvas9374.getGraphics();
		if (null == graphics)
			return 0;
		graphics.drawImage(((Class76_Sub1_Sub3_Sub1) this).anImage10102, i, i_6_, ((Class76_Sub1_Sub3_Sub1) this).aCanvas9374);
		return 0;
	}

	void method894() {
		super.method890((byte) 1);
		DataBufferInt databufferint = new DataBufferInt(((Class76_Sub1_Sub3_Sub1) this).anIntArray9377, (((Class76_Sub1_Sub3_Sub1) this).anIntArray9377).length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster writableraster = (Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(((Class76_Sub1_Sub3_Sub1) this).anInt9379 * -287027923, -1203505521 * ((Class76_Sub1_Sub3_Sub1) this).anInt9373)), databufferint, null));
		((Class76_Sub1_Sub3_Sub1) this).anImage10102 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
	}

	void method895() {
		super.method890((byte) 1);
		DataBufferInt databufferint = new DataBufferInt(((Class76_Sub1_Sub3_Sub1) this).anIntArray9377, (((Class76_Sub1_Sub3_Sub1) this).anIntArray9377).length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster writableraster = (Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(((Class76_Sub1_Sub3_Sub1) this).anInt9379 * -287027923, -1203505521 * ((Class76_Sub1_Sub3_Sub1) this).anInt9373)), databufferint, null));
		((Class76_Sub1_Sub3_Sub1) this).anImage10102 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
	}

	public final int method885(int i, int i_7_) {
		Graphics graphics = ((Class76_Sub1_Sub3_Sub1) this).aCanvas9374.getGraphics();
		if (null == graphics)
			return 0;
		graphics.drawImage(((Class76_Sub1_Sub3_Sub1) this).anImage10102, i, i_7_, ((Class76_Sub1_Sub3_Sub1) this).aCanvas9374);
		return 0;
	}
}
