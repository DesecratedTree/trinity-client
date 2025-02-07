
import java.awt.*;

/**
 * 
 */

/**
 * @author dragonkk(Alex)
 * Nov 15, 2017
 */
public class Hitbox {

	
	private static Class264 font;
	private static Class505 metrics;
	public static String name;
	public static int currentHP, maxHP;
	
	public static void logout() {
		name = null;
		currentHP = maxHP = 0;
	}
	
	public static void reset() {
		font = null;
		metrics = null;
	}
	public static void draw() {
	if (name == null || maxHP <= 0)
		return;
		if (font == null || metrics == null) {
			font = (Class264) (Class497.aClass197_6105.method1883(client.anInterface10_8700, 3794, true, true, -2063324548));
			metrics = Class497.aClass197_6105.method1879(client.anInterface10_8700, 3794, 522165232);
			return;
		}
		double scale = 0.75;
		int height = 3;
		double percentage = Math.min(1, (double)currentHP / (double)maxHP); 
		int width = (int) ((200 - 6) * percentage);
		FloorOverlay.graphics.B((int) (10 * scale), (int) (30 * scale) + height, (int) (200 * scale), (int) (48 * scale), new Color(1,1,1, 150).getRGB(), 1);
		FloorOverlay.graphics.method5019((int) (10 * scale), (int) (30 * scale) + height, (int) (200 * scale), (int) (48 * scale), Color.DARK_GRAY.getRGB(), 1);
		FloorOverlay.graphics.B((int) (13 * scale), (int) (54 * scale) + height, (int) (width * scale), (int) (20  * scale), new Color(0,150,0, 150).getRGB(), 1);
		FloorOverlay.graphics.B((int) ((13 + width) * scale), (int) (54  * scale) + height, (int) ((194 - width)  * scale), (int) (20  * scale), new Color(150, 0, 0, 150).getRGB(), 1);
		int textWidth = metrics.method6259(name, 50, null, -570698918);
		font.method2475(name, (int) (100 * scale), (int) (41 * scale) + height, textWidth / 2, 0, -1, -1, 1, 1, 0, null, null, null, 0, 0, -45995166);
		int currentHPD = (currentHP / (Settings.ENABLE_X1_HITS ? 10 : 1));
		if (currentHP > 0 && currentHPD == 0)
			currentHPD = 1;
		String live = currentHPD+ " / " + (maxHP / (Settings.ENABLE_X1_HITS ? 10 : 1));
		textWidth = metrics.method6259(live, 50, null, -570698918);
		font.method2475(live, (int) (100 * scale), (int) (63 * scale) + height, textWidth / 2, 0, -1, -1, 1, 1, 0, null, null, null, 0, 0, -45995166);

		}

	
}
