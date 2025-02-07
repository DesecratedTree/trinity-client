
import java.util.HashMap;

public class GroundItemNames {

	public static void draw(int sx, int sy) {
		if (!Settings.ENABLE_GROUND_ITEM_NAMES || Class287.myPlayer == null)
			return;
		Map map = client.aClass283_8716.method2628(681479919);
		for (int x = 0; x < 104; x++) {
			for (int y = 0; y < 104; y++) {
				
				int worldY = 283514611 * map.gameSceneBaseY + y;
				int worldX = x + -1760580017 * map.gameSceneBaseX;
				int index = 1;
				GroundTile tile = ((GroundTile) (client.groundTiles.method5812((long) (Class287.myPlayer.plane << 28 | worldY << 14 | worldX))));
				if (tile != null) {
					HashMap<Integer, Integer> items = new HashMap<Integer, Integer>();
					for (Class298_Sub12 item = ((Class298_Sub12) tile.groundItems.method5939(1766612795)); null != item; item = (Class298_Sub12) tile.groundItems.method5944(49146)) {
						int id =  item.id * 1768239597; 
						int amt = (567630807 * item.anInt7256);
						Integer savedAmt = items.get(id);
						items.put(id, (savedAmt == null ? 0 : savedAmt) + amt);
					}
					
					for (int id : items.keySet()) {
						int amt = items.get(id);
						ItemConfig config = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(id);
						String name = config.name;
						//boolean stackable = config.stackable == 126481113;
						int height = (int) (index++ * 256 * Math.max(0.4, ((double)client.zoom / 1500d)));
						int color = 0xFFFFFF;
						try {
							Class139.tileTo2DCoords(Class287.myPlayer.plane, 256 + (x << 9), 256 + (y << 9), height, -549885479);
							Class101.aClass264_1084.method2490(name + (amt <= 1 ? "" : (amt >= 65535 ? ("(65k+)") : (" ("+amt+")"))), (int) ((float) sx + client.aFloatArray8891[0]), (int) (client.aFloatArray8891[1] + (float) sy), ~0xffffff | color, 0, 8619684);
						} catch (Throwable e) {
							
						}
					}
				}
			}
		}
			
	}
	
}
