import java.awt.*;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class Timers {

	
	private static final Map<Integer, Timer> timers = new HashMap<Integer, Timer>();
	private static final List<Timer> list = new LinkedList<Timer>();

	private static final int TYPE_ITEM = 0, TYPE_SPRITE = 1;
	
	public static Class264 font;
	public static Class505 metrics;
	
	private static class Timer {
	
		private int type, id;
		private Class57 spriteReference;
		private long time;
		
		public Timer(int type, int id) {
			this.type = type;
			this.id = id;
		}
		
		private boolean needsRemove() {
			return time < System.currentTimeMillis();
		}
		
	}
	
	public static int getHash(int type, int id) {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + type;
		return result;
	}
	
	public static void add(int type, int id, int time) {
		int hash = getHash(type, id);
		Timer timer = timers.get(hash);
		if (timer == null) 
			timers.put(hash, timer = new Timer(type, id));
		if (time <= 0)
			list.remove(timer);
		else {
			timer.time = time + System.currentTimeMillis();
			if (!list.contains(timer))
				list.add(timer);
		}
	}
	
	public static void draw() {
		if (font == null || metrics == null) {
			font = (Class264) (Class497.aClass197_6105.method1883(client.anInterface10_8700, 494, true, true, -2063324548));
			metrics = Class497.aClass197_6105.method1879(client.anInterface10_8700, 494, 522165232);
			return;
		}
		Iterator<Timer> it = list.iterator();
		int index = 0;
		while (it.hasNext()) {
			Timer timer = it.next();
			if (timer.needsRemove())
				it.remove();
			else
				if (draw(index, timer))
					index++;
		}
	}
	
	
	
	private static boolean draw(int index, Timer timer) {
		long timeLeft = timer.time - System.currentTimeMillis();
		if (timeLeft >= 120 * 60 * 1000) //limitedt o 1h atm
			return false;
		if (timer.spriteReference == null) {
			if (timer.type == TYPE_ITEM) {
				Canvas canvas = new Canvas();
				canvas.setSize(36, 32);
				GraphicsToolkit toolkit = Class523.method6334(0, canvas, Class253.anInterface_ma2785, Class82_Sub6.aClass243_6844, 0, -753690122);
				Class264 item = (toolkit.method5092(Class322.method3931(Class173.aClass243_1758, (399302739 * Class74.anInt691), 0, (byte) 78), Class89.getSprites(Class158.aClass243_6364, Class74.anInt691 * 399302739, 0), true));
				timer.spriteReference = Class298_Sub32_Sub14.aClass477_9400.getSpriteSmall(toolkit, FloorOverlay.graphics, timer.id, 1, 1, -13623264, true, false, 2, item, null, 1451736551);
				toolkit.dispose(0);
			} else if (timer.type == TYPE_SPRITE) {
				Class89 sprite = Class89.getSprite(SpriteTextureConfig.aClass243_9393, timer.id, 0);
				if (sprite == null)
					return false;
				timer.spriteReference = FloorOverlay.graphics.method5125(sprite, true);
				
			}
		}
		
		String text = String.format("%d:%02d",
                TimeUnit.MILLISECONDS.toMinutes(timeLeft),
                TimeUnit.MILLISECONDS.toSeconds(timeLeft) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(timeLeft)));

		Class119 chatInterface = Class389.aClass119Array4165[752];
		if (chatInterface == null)
			return false;
		WidgetConfig[] widgets = chatInterface.method1295((byte) -87);
		if (widgets == null)
			return false;
		
		//36, 32.
		
		
		int x = -2093041337 * widgets[0].anInt1156;
		int y = (-1111710645 * Class298_Sub40_Sub9.screenHeight) - (widgets[0].anInt1162 * 457937409);
		int minX = (timer.type == TYPE_SPRITE ? timer.id == 1583? 9 : timer.id == 1200 ? 8 : 4 : 0) + x - (index*36) - 16 - 30;
		if (minX <= 36)
			return false;
		font.method2475(text, x - (index*36) - 30, y + 33 - 63, 0, 0, -1, -1, 1, 1, 0, null, null, null, 0, 0, -45995166);
		timer.spriteReference.drawSprite(minX, (timer.type == TYPE_SPRITE ? timer.id == 1583 ? 10 : timer.id == 1200 ? 6 : 3 : 0) + y - 63);
		return true;
	}
	
	public static void reset() {
		font = null;
		metrics = null;
		for (Timer timer : timers.values())
			timer.spriteReference = null;
	}
	
	public static void logout() {
		list.clear();
	}
}
