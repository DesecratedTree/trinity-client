/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class Canvas_Sub1 extends Canvas {
	static int[] anIntArray10;
	Component aComponent11;

	Canvas_Sub1(Component component) {
		((Canvas_Sub1) this).aComponent11 = component;
	}

	public final void update(Graphics graphics) {
		try {
			((Canvas_Sub1) this).aComponent11.update(graphics);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akk.update(").append(')').toString());
		}
	}

	public final void paint(Graphics graphics) {
		try {
			((Canvas_Sub1) this).aComponent11.paint(graphics);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akk.paint(").append(')').toString());
		}
	}
}
