import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
  * 5879801
  * 3202986138
  * 5872242
  * @author Taht one guy
  *
  */

public class ItemPrices {
	
	public static final boolean TIP_IT_ONLY = false, LOAD_INTO_TABLE = true;
	
	private static final String path = "p.txt";
	
	private static Hashtable<String, Integer> priceTable;
	
	private static List<PriceKey> priceList;
	
	public static ItemPrices instance = new ItemPrices();
	
    public static void init() {
    	File file = new File(System.getProperty("java.io.tmpdir")+path);
    	if (file.exists())
    		file.delete();
    	Preferences.copyPreferenceFile(path, file);
    	loadPrices(file);
    }
    
	public static int getValue(String name, int modelId, int cacheValue) {
		if (LOAD_INTO_TABLE) {
			if (priceTable == null)
				init();
			String key = name + modelId;
			if (priceTable.containsKey(key)) {
				int price = priceTable.get(key);
				//System.out.println("Loaded price for: "+name);
				return price;
			}
		} else {
			if (priceList == null)
				init();
			for(int i = 0; i < priceList.size(); i++) {
				if (priceList.get(i) != null) {
					int price = priceList.get(i).getPrice(name, modelId, cacheValue);
					if (price != -1) {
						//System.out.println("Loaded price for: "+name);
						return price;
					}
				}
			}
		}
		return cacheValue;
	}
	
	public static void loadPrices(File file) {
		priceList = new ArrayList<PriceKey>();
		priceTable = new Hashtable<String, Integer>();
        try {
            //Logger.log("gameAddons", "Loading custom prices");
            @SuppressWarnings("resource")
			BufferedReader bufferedreader = new BufferedReader(new FileReader(file));
            String s;
            while((s = bufferedreader.readLine()) != null) {
            	String s2[] = s.split("!");
            	String name = s2[0];
            	int modelId = Integer.parseInt(s2[1]);
            	int cacheValue = Integer.parseInt(s2[2]);
            	int price = Integer.parseInt(s2[3]);
            	if (price <= 1)
            		continue;
            	if (name.contains(" rune"))
            		continue;
            	if (LOAD_INTO_TABLE)
            		priceTable.put(name + modelId, price);
            	else
            		priceList.add(instance.new PriceKey(name, modelId, cacheValue, price));
            }
        } catch(Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Loaded prices: "+priceList.size());
	}
	
	public class PriceKey {
		
		String name;
		int modelId;
		int cacheValue;
		int price;
		
		public PriceKey(String name, int modelId, int cacheValue, int price) {
			this.name = name;
			this.modelId = modelId;
			this.cacheValue = cacheValue;
			this.price = price;
		}
		
		public boolean matches(String name, int modelId, int cacheValue) {
			return this.name.equals(name) && this.modelId == modelId && this.cacheValue == cacheValue;
		}
		
		public int getPrice(String name, int modelId, int cacheValue) {
			if (matches(name, modelId, cacheValue))
				return price;
			return -1;
		}
	}
}
