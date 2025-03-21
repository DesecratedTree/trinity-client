/* Class323 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class Class323 {
	Robot aRobot3298;

	public void method3179(Component component, int[] is, int i, int i_0_, Point point) {
		try {
			if (null != is) {
				BufferedImage bufferedimage = new BufferedImage(i, i_0_, 2);
				bufferedimage.setRGB(0, 0, i, i_0_, is, 0, i);
				component.setCursor(component.getToolkit().createCustomCursor(bufferedimage, point, null));
			} else
				component.setCursor(null);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nl.setcustomcursor(").append(')').toString());
		}
	}

	public Class323() throws Exception {
		((Class323) this).aRobot3298 = new Robot();
	}

	public void method3180(int i, int i_1_) {
		try {
			((Class323) this).aRobot3298.mouseMove(i, i_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nl.movemouse(").append(')').toString());
		}
	}
}
