/* za - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Frame;

public class za extends Class76_Sub1 implements Interface28 {
	int anInt9294;
	Canvas aCanvas9295;
	int anInt9296;
	ja aJa9297;
	long nativeid;
	static boolean aBoolean9298 = false;
	static long aLong9299;

	boolean method863() {
		return true;
	}

	public int method857() {
		return ((za) this).anInt9296;
	}

	public native void ma(boolean bool);

	void method896(Exception exception) {
		if (!aBoolean9298) {
			aLong9299 = Class312.method3111((byte) 28);
			aBoolean9298 = true;
		} else if (Class312.method3111((byte) 65) - aLong9299 < 30000L)
			((za) this).aCanvas9295.repaint();
		else
			throw new RuntimeException(exception.getMessage());
	}

	native void n(ja var_ja, Canvas canvas, int i, int i_0_);

	native void H(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_);

	native void aa(Canvas canvas, int i, int i_8_);

	public int method874() {
		return method883(0, 0);
	}

	boolean method182() {
		((za) this).aJa9297.PA(this);
		return true;
	}

	void method876(int i, int i_9_) {
		((za) this).anInt9294 = i;
		((za) this).anInt9296 = i_9_;
		wa(((za) this).aCanvas9295, i, i_9_);
		if (((za) this).aJa9297.method4782((byte) 0) == this)
			method174();
	}

	public int method856() {
		return ((za) this).anInt9294;
	}

	public void method185() {
		if (((za) this).aJa9297.method4782((byte) 0) == this)
			method862();
		ma(true);
		((za) this).nativeid = 0L;
		((za) this).aCanvas9295 = null;
	}

	public void method179() {
		if (((za) this).aJa9297.method4782((byte) 0) == this)
			method862();
		ma(true);
		((za) this).nativeid = 0L;
		((za) this).aCanvas9295 = null;
	}

	boolean method174() {
		((za) this).aJa9297.PA(this);
		return true;
	}

	boolean method862() {
		return true;
	}

	public int method864() {
		return ((za) this).anInt9294;
	}

	public int method858() {
		return ((za) this).anInt9294;
	}

	public int method873(int i, int i_10_) {
		try {
			synchronized (((za) this).aCanvas9295.getTreeLock()) {
				Component component = ((za) this).aCanvas9295;
				int i_11_ = 0;
				int i_12_ = 0;
				int i_13_ = 0;
				int i_14_ = ((za) this).aCanvas9295.getWidth();
				java.awt.Container container;
				for (/**/; component != null; component = container) {
					container = component.getParent();
					if (container instanceof Frame)
						i_13_ = ((Frame) container).getInsets().top;
					if (container == null)
						break;
					i_11_ += component.getX();
					i_12_ += component.getY();
					int i_15_ = component.getWidth();
					if (i_15_ < i_14_)
						i_14_ = i_15_;
				}
				H(i, i_10_, i_11_, i_12_, ((za) this).anInt9294, ((za) this).anInt9296, i_14_, i_13_);
				aBoolean9298 = false;
			}
		} catch (Exception exception) {
			method896(exception);
			return -1;
		}
		return 0;
	}

	public native void x(boolean bool);

	public int method855() {
		return ((za) this).anInt9296;
	}

	public int method861() {
		return ((za) this).anInt9296;
	}

	boolean method176() {
		((za) this).aJa9297.PA(this);
		return true;
	}

	za(ja var_ja, Canvas canvas, int i, int i_16_) {
		((za) this).aJa9297 = var_ja;
		((za) this).aCanvas9295 = canvas;
		((za) this).anInt9294 = i;
		((za) this).anInt9296 = i_16_;
		n(var_ja, ((za) this).aCanvas9295, i, i_16_);
	}

	boolean method178() {
		((za) this).aJa9297.PA(this);
		return true;
	}

	native void wa(Canvas canvas, int i, int i_17_);

	public int method860() {
		return ((za) this).anInt9296;
	}

	native void ak(Canvas canvas, int i, int i_18_);

	public void method180() {
		if (((za) this).aJa9297.method4782((byte) 0) == this)
			method862();
		ma(true);
		((za) this).nativeid = 0L;
		((za) this).aCanvas9295 = null;
	}

	public void method181() {
		if (((za) this).aJa9297.method4782((byte) 0) == this)
			method862();
		ma(true);
		((za) this).nativeid = 0L;
		((za) this).aCanvas9295 = null;
	}

	protected void finalize() {
		if (((za) this).nativeid != 0L)
			Class71.method827(this, 1711061246);
	}

	public int method883(int i, int i_19_) {
		try {
			synchronized (((za) this).aCanvas9295.getTreeLock()) {
				Component component = ((za) this).aCanvas9295;
				int i_20_ = 0;
				int i_21_ = 0;
				int i_22_ = 0;
				int i_23_ = ((za) this).aCanvas9295.getWidth();
				java.awt.Container container;
				for (/**/; component != null; component = container) {
					container = component.getParent();
					if (container instanceof Frame)
						i_22_ = ((Frame) container).getInsets().top;
					if (container == null)
						break;
					i_20_ += component.getX();
					i_21_ += component.getY();
					int i_24_ = component.getWidth();
					if (i_24_ < i_23_)
						i_23_ = i_24_;
				}
				H(i, i_19_, i_20_, i_21_, ((za) this).anInt9294, ((za) this).anInt9296, i_23_, i_22_);
				aBoolean9298 = false;
			}
		} catch (Exception exception) {
			method896(exception);
			return -1;
		}
		return 0;
	}

	public int method878() {
		return method883(0, 0);
	}

	public int method879() {
		return method883(0, 0);
	}

	public int method880(int i, int i_25_) {
		try {
			synchronized (((za) this).aCanvas9295.getTreeLock()) {
				Component component = ((za) this).aCanvas9295;
				int i_26_ = 0;
				int i_27_ = 0;
				int i_28_ = 0;
				int i_29_ = ((za) this).aCanvas9295.getWidth();
				java.awt.Container container;
				for (/**/; component != null; component = container) {
					container = component.getParent();
					if (container instanceof Frame)
						i_28_ = ((Frame) container).getInsets().top;
					if (container == null)
						break;
					i_26_ += component.getX();
					i_27_ += component.getY();
					int i_30_ = component.getWidth();
					if (i_30_ < i_29_)
						i_29_ = i_30_;
				}
				H(i, i_25_, i_26_, i_27_, ((za) this).anInt9294, ((za) this).anInt9296, i_29_, i_28_);
				aBoolean9298 = false;
			}
		} catch (Exception exception) {
			method896(exception);
			return -1;
		}
		return 0;
	}

	public int method881(int i, int i_31_) {
		try {
			synchronized (((za) this).aCanvas9295.getTreeLock()) {
				Component component = ((za) this).aCanvas9295;
				int i_32_ = 0;
				int i_33_ = 0;
				int i_34_ = 0;
				int i_35_ = ((za) this).aCanvas9295.getWidth();
				java.awt.Container container;
				for (/**/; component != null; component = container) {
					container = component.getParent();
					if (container instanceof Frame)
						i_34_ = ((Frame) container).getInsets().top;
					if (container == null)
						break;
					i_32_ += component.getX();
					i_33_ += component.getY();
					int i_36_ = component.getWidth();
					if (i_36_ < i_35_)
						i_35_ = i_36_;
				}
				H(i, i_31_, i_32_, i_33_, ((za) this).anInt9294, ((za) this).anInt9296, i_35_, i_34_);
				aBoolean9298 = false;
			}
		} catch (Exception exception) {
			method896(exception);
			return -1;
		}
		return 0;
	}

	public int method875(int i, int i_37_) {
		try {
			synchronized (((za) this).aCanvas9295.getTreeLock()) {
				Component component = ((za) this).aCanvas9295;
				int i_38_ = 0;
				int i_39_ = 0;
				int i_40_ = 0;
				int i_41_ = ((za) this).aCanvas9295.getWidth();
				java.awt.Container container;
				for (/**/; component != null; component = container) {
					container = component.getParent();
					if (container instanceof Frame)
						i_40_ = ((Frame) container).getInsets().top;
					if (container == null)
						break;
					i_38_ += component.getX();
					i_39_ += component.getY();
					int i_42_ = component.getWidth();
					if (i_42_ < i_41_)
						i_41_ = i_42_;
				}
				H(i, i_37_, i_38_, i_39_, ((za) this).anInt9294, ((za) this).anInt9296, i_41_, i_40_);
				aBoolean9298 = false;
			}
		} catch (Exception exception) {
			method896(exception);
			return -1;
		}
		return 0;
	}

	public int method884(int i, int i_43_) {
		try {
			synchronized (((za) this).aCanvas9295.getTreeLock()) {
				Component component = ((za) this).aCanvas9295;
				int i_44_ = 0;
				int i_45_ = 0;
				int i_46_ = 0;
				int i_47_ = ((za) this).aCanvas9295.getWidth();
				java.awt.Container container;
				for (/**/; component != null; component = container) {
					container = component.getParent();
					if (container instanceof Frame)
						i_46_ = ((Frame) container).getInsets().top;
					if (container == null)
						break;
					i_44_ += component.getX();
					i_45_ += component.getY();
					int i_48_ = component.getWidth();
					if (i_48_ < i_47_)
						i_47_ = i_48_;
				}
				H(i, i_43_, i_44_, i_45_, ((za) this).anInt9294, ((za) this).anInt9296, i_47_, i_46_);
				aBoolean9298 = false;
			}
		} catch (Exception exception) {
			method896(exception);
			return -1;
		}
		return 0;
	}

	boolean method865() {
		return true;
	}

	public int method885(int i, int i_49_) {
		try {
			synchronized (((za) this).aCanvas9295.getTreeLock()) {
				Component component = ((za) this).aCanvas9295;
				int i_50_ = 0;
				int i_51_ = 0;
				int i_52_ = 0;
				int i_53_ = ((za) this).aCanvas9295.getWidth();
				java.awt.Container container;
				for (/**/; component != null; component = container) {
					container = component.getParent();
					if (container instanceof Frame)
						i_52_ = ((Frame) container).getInsets().top;
					if (container == null)
						break;
					i_50_ += component.getX();
					i_51_ += component.getY();
					int i_54_ = component.getWidth();
					if (i_54_ < i_53_)
						i_53_ = i_54_;
				}
				H(i, i_49_, i_50_, i_51_, ((za) this).anInt9294, ((za) this).anInt9296, i_53_, i_52_);
				aBoolean9298 = false;
			}
		} catch (Exception exception) {
			method896(exception);
			return -1;
		}
		return 0;
	}

	void method897() {
		if (((za) this).nativeid != 0L)
			Class71.method827(this, 1087476729);
	}

	void method898() {
		if (((za) this).nativeid != 0L)
			Class71.method827(this, 1431873371);
	}

	void method882(int i, int i_55_) {
		((za) this).anInt9294 = i;
		((za) this).anInt9296 = i_55_;
		wa(((za) this).aCanvas9295, i, i_55_);
		if (((za) this).aJa9297.method4782((byte) 0) == this)
			method174();
	}

	public void method183() {
		if (((za) this).aJa9297.method4782((byte) 0) == this)
			method862();
		ma(true);
		((za) this).nativeid = 0L;
		((za) this).aCanvas9295 = null;
	}

	public int method859() {
		return ((za) this).anInt9294;
	}

	native void y(int i, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_);

	native void af(int i, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_);

	native void aq(Canvas canvas, int i, int i_70_);

	native void h(ja var_ja, Canvas canvas, int i, int i_71_);

	native void ab(Canvas canvas, int i, int i_72_);

	public int method877() {
		return method883(0, 0);
	}

	native void ag(Canvas canvas, int i, int i_73_);

	native void az(Canvas canvas, int i, int i_74_);
}
