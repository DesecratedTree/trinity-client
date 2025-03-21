import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Hashtable;

/* Class_ta_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class OldItems {
	
	//public static int[][] oldItemData = new int[][] {{}};
	
	private static final boolean DISABLED = false;
	
	private static final String path = "olditems.txt";
	
	public static Hashtable<Integer, int[]> oldItemData2;
	
	public static int[] getOldItemData(int itemId) {
		//if (itemId >= oldItemData.length) 
		//	return new int[] {};
		//return oldItemData[itemId];
		if (DISABLED)
			return null;
		if (oldItemData2 == null)
			init();
		int[] data = oldItemData2.get(itemId);
		return data;
	}
	
    public static void init() {
    	File file = new File(System.getProperty("java.io.tmpdir")+path);
    	if (file.exists())
    		file.delete();
    	Preferences.copyPreferenceFile(path, file);
    	loadPrices(file);
    }
	
	public static void loadPrices(File file) {
        try {
        	oldItemData2 = new Hashtable<Integer, int[]>();
            //Logger.log("gameAddons", "Loading custom prices");
            @SuppressWarnings("resource")
			BufferedReader bufferedreader = new BufferedReader(new FileReader(file));
            String s;
            while((s = bufferedreader.readLine()) != null) {
            	String s2[] = s.split(",");
            	if (s2.length <= 1)
            		continue;
            	int itemId = Integer.parseInt(s2[0]);
            	int[] data = new int[] {Integer.parseInt(s2[1]),
            							Integer.parseInt(s2[2]),
            							Integer.parseInt(s2[3]),
            							Integer.parseInt(s2[4]),
            							Integer.parseInt(s2[5]),
            							Integer.parseInt(s2[6]),
            							Integer.parseInt(s2[7]),
            							Integer.parseInt(s2[8]),
            							Integer.parseInt(s2[9]),
            							Integer.parseInt(s2[10]),
            							Integer.parseInt(s2[11]),
            							Integer.parseInt(s2[12]),
            							Integer.parseInt(s2[13])};
            	oldItemData2.put(itemId, data);
            }
        } catch(Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Loaded prices: "+oldItemData2.size());
	}
}
