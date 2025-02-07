import java.awt.event.KeyEvent;
import java.util.HashMap;

/**
 * @author Simplex
 * @since May 05, 2020
 */
public class Keybinds {

    private static HashMap<Key, Integer> keybinds = new HashMap<Key, Integer>();

    public static boolean escapeToClose = false;
    public static boolean setTab;

    public static void update(Object[] objects) {
        try {
            escapeToClose = (int) (objects[1]) == 1;
            keybinds.clear();
            for(int i = 2; i < objects.length; i+=2) {
                Key key = Key.values()[(int) objects[i]];
                Tab tab = Tab.values()[(int) objects[i+1]];
                keybinds.put(key, tab.getTabId());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean keyIntercept(KeyEvent evt) {
        if(keybinds == null || keybinds.size() == 0) {
            return false;
        }
       // System.out.println(evt.getKeyCode());
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            Integer tab = keybinds.get(Key.ESC);
            if (tab == null)
            	return !escapeToClose;
            int currentTab = Class374.anIntArray4078[168];
         	Class374.anIntArray4078[168] = currentTab == tab ? -1 : tab;
        	client.aBoolean8736 |= Class254.aBooleanArray2790[168];
			client.anIntArray8876[((client.anInt8877 += 163718667) * 116700579) - 1 & 0x1f] = (int) 168;
            return !escapeToClose;
        }

        if(evt.getKeyCode() >= KeyEvent.VK_F1 && evt.getKeyCode() <= KeyEvent.VK_F12) {
            int fkey = evt.getKeyCode() - KeyEvent.VK_F1;
            if(setTab) {
                Class419.sendCommand("setfkey " + fkey);
                setTab = false;
            } else {
                Integer tab = keybinds.get(Key.values()[fkey]);
                if (tab == null)
                	return true;
                int currentTab = Class374.anIntArray4078[168];
                //Class305.method3752(168, currentTab == tab ? -1 : tab, 644551429);
            	Class374.anIntArray4078[168] = currentTab == tab ? -1 : tab;
            	client.aBoolean8736 |= Class254.aBooleanArray2790[168];
    			client.anIntArray8876[((client.anInt8877 += 163718667) * 116700579) - 1 & 0x1f] = (int) 168;
            }
            return true;
        }
        return false;
    }

    enum Key {
        F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, ESC, NONE
    }

    enum Tab {
        COMBAT(0, 0), TELES(1, -1), SKILLS(2, 1), QUESTS(3, 2), INV(4, 3), GEAR(5, 4), PRAYER(6, 5), MAGIC(7, 6),
        SQUEAL(8, -1), FRIENDS(9, 7), C_CHAT(11, 8), F_CHAT(10, 9), NOTES(15, 10), SETTINGS(12, 11), EMOTES(13, 12), MUSIC(14, 13),  LOGOUT(16, 14);

        int tabId = 0;
        int component = 1;

        Tab(int tab, int component) {
            this.tabId = tab;
            this.component = component;
        }

        public int getTabId() {
            return tabId;
        }

        public int getComponent() {
            return component;
        }
    }
}
