

import java.awt.*;

public final class Canvas_Sub1 extends Canvas {
	/**
	 * 
	 */
	private static final long serialVersionUID = -935799942818107126L;
	Component aComponent10;

	@Override
	public void setSize(int x, int y) {
	//	System.out.println("s "+x+", "+y);
		super.setSize(x, y);
	}
	
	@Override
	public void setSize(Dimension d) {
		System.out.println("d "+d);
		super.setSize(d);
	}
	
	public final void update(Graphics graphics) {
		try {
			((Canvas_Sub1) this).aComponent10.update(graphics);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajk.update(").append(')').toString());
		}
	}

	public final void paint(Graphics graphics) {
		try {
			((Canvas_Sub1) this).aComponent10.paint(graphics);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajk.paint(").append(')').toString());
		}
	}

	Canvas_Sub1(Component component) {
		((Canvas_Sub1) this).aComponent10 = component;
	}
}
