/**
 * 
 */

/**
 * @author dragonkk(Alex)
 * Oct 8, 2017
 */
public class CustomItemContainerConfig {

	public static void modify(int id, ItemContainerConfig config) {
		switch (id) {
		case 139:  //general store
		case 661: //non general store
			config.length = 200 * -1816799395;
			config.ids = new int[0];
			config.amounts = new int[0];
			config.size = 0;
			break;
		case 95: //bank space
			config.length = 1000 * -1816799395;
			break;
		}
	}
}
