import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */

/**
 * @author dragonkk(Alex)
 * Sep 15, 2017
 *
 * TOO LAZY TO EDIT CACHE
 */
public class CustomItems {

    public static Map<Integer, Integer> customShopPrices = new HashMap<Integer, Integer>();

    public static void clearCustomShopPrices() {
        CustomItems.customShopPrices.clear();
    }


    public static void dumpItems() {
        ItemConfig c = null;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.home") + "/Desktop/Onyx item dump.txt", false))) {
            for (int i = 0; i < 82442; i++) {
                try {
                    c = null;
                    try {
                        c = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if(c == null) {
                        bw.write("" + i + " - " + (c.name == null ? "null" : "\"" + c.name + "\"") + "");
                        bw.newLine();
                    } else {
                        bw.write("" + i + " - null");
                        bw.newLine();
                    }
                } catch (Exception e) {
                    System.out.println("ERROR AT " +i);
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final int[] POST_IMBUED_RINGS =
            {15009, 15010, 15011, 15012, 15013, 15014, 15015, 15016, 15017, 15018, 15019, 15020, 15220, 43202, 42691, 42692, 49710, 51752, 42018};

    public static void makeNote(int noteID, int unnotedID) {
    	ItemConfig config = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(unnotedID);
    	config.cert = noteID  * -384973719;
    	ItemConfig note = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(noteID);
    	copy(4152, note);
    	note.name = config.name;
    	note.cert = unnotedID  * -384973719;
    	note.certTemplate = 799 * 1831957949;
    }
    
    public static boolean settedNotes;
    
    public static void makeNotes() {
    	settedNotes = true;
        for (int i = 0; i <= 35; i++) //overload and so on
        	makeNote(25703 + i, 15300 + i);
    }

    public static void modify(ItemConfig config) {
    	if (!settedNotes) 
    		makeNotes();
        int id = 1027112447 * config.itemId;
        for (int i : POST_IMBUED_RINGS) {
            if (id == i) {
                if (config.inventoryOptions[3] == null)
                    config.inventoryOptions[3] = "Uncharge";
                break;
            }
        }
        for (int i = 0; i < LUCKY_ITEMS.length; i += 2) {
            if (LUCKY_ITEMS[i] == id) {
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(LUCKY_ITEMS[i + 1]), config);
                config.name = "Lucky " + config.name.toLowerCase();
                config.inventoryOptions[4] = "Drop";//"Destroy";
                config.settings.method5817(new IntegerValue(1), 1397); //autokept on death
                break;
            }
        }
        if (config.name.startsWith("Lucky ")) { //tradeable & kept on death outside wild
            config.inventoryOptions[4] = "Drop";
            config.tradeable = false;
            config.name = config.name.replace("Lucky ", "");
            config.name = Character.toUpperCase(config.name.charAt(0)) + config.name.substring(1);
            config.name += " (d)";
        }

        if(id == 51079 || id == 51047 || id == 51034)
            config.tradeable = true;

        if ((id >= 15300 && id <= 15335) || (id >= 23483 && id <= 23536)) {
            config.tradeable = true;
            config.value *= 200; //makes selling them to shop good money
        } else if ((id >= 42695 && id <= 42702)) {
            config.tradeable = true;
            if (-1 == config.certTemplate * -1673957995)
                config.value *= 50; //makes selling them to shop good money
        } else if (id == 21630) {
            config.value *= 100;
        } else if (config.equipSlot * -906758929 == 14) { //aura slot
            int price = getAuraPrice(id);
            if (price > 0)
                config.value = price * -1375390745;
        }
        
        //2436 20 2440 20 2442 20 2444 20 3040 20 2434 50 2452 50

        switch (1027112447 * config.itemId) {
        case 2677:
        case 2801:
        case 2722:
        case 19043:
            config.inventoryOptions[3] = "Dig";
        break;
                //{ 1265, 1267, 1269, 1273, 1271, 1275, 15259 },
    	//{ 2347 },
    	//{ 1351, 1349, 1353, 1357, 1355, 1359, 6739},
        case 1267:
        case 1269:
        case 1273:
        case 1271:
        case 1275:
        case 15259:
        case 1349: 
        case 1353: 
        case 1357: 
        case 1355:
        case 1359:
        case 6739:
            config.inventoryOptions[3] = "Add-to-toolbelt";
        	break;
        case 25666:
        	
        	break;
            case 25665:
                copy(25474, config);
                config.name = "Tommy pet";
                break;
            case 25664: //dye
                copy(79675, config);
                config.inventoryOptions[0] = null;
                config.name = "<col=ff4242>Easter dye";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{ 4264, 4250, 5284,-31644, -31649, -31654};
                config.modifiedColors = new short[]{ -29090, -29090, 10351, -29090, 10351, -29090,};
                config.tradeable = true;
                break;
            case 25663: // easter llru
                copy(16955, config);
                config.name = "<col=ffff42>Legendary lightning rapier (u)";
                config.inventoryOptions[2] = "Revert";
                config.originalColors = new short[]{-27633, -27638, -27643, -27608, -27639, -27636, -27641, -27631, -27632, -27637,-27568, -27628, -27613, -27618, -27623, -27648};
                config.modifiedColors = new short[]{-29090, -29090, -29090, -29090, -29090,  -29090, -29090, -29090, -29090, -29090, 10351, 10351, 10351, 10351, 10351, 10351};
                config.setSpecialBar();
                config.tradeable = true;
                break;
            case 25662: // easter mk.2
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(50997), config);
                config.name = "<col=ff4242>Twisted bow Mk. II";
                config.inventoryOptions[2] = "Revert";
                config.maleModel2 = (68615) * 582597415;
                config.femaleModel2 = (68615) * -336299543;
                config.originalColors = new short[]{967, 779, 13223, 16, 8, 24, 33, 10318, 41, 10334, 0, 14236};
                config.modifiedColors = new short[]{-29090, -29090, 10351, -29090, 10351, -29090, 10351, -29090, 10351, 10351, 10351, 10351};
                config.tradeable = true;
                break;

            case 24474:
                //config.originalColors = new short[] {9947,9868,9936,945,9922,7994,968,2421,9894,9923,843,8008,940,860,9956,907,7072,8114,9909,9879,9938,7978,7985,9900,7986,7980,7988,511,732,8019,7087,9973,7984,7968,948,767,639,933,4321,5022,5033,5054,8102,5039,8142,5082,5023,4713,4351,9931,7965,9943,9958,383,7101,7118,7990,9940,9977,959,914,4028,3583,4702,5079,5045,};
                //config.modifiedColors = new short[] {-21963,13164,12307,-11855,-30982,-4788,-29654,20194,1497,8239,1614,23343,-27177,-10061,5491,-6989,5083,21163,-12361,-8422,-3741,-29775,-17543,-31774,-5938,-13016,2219,-29552,-30069,24429,-1423,10846,-26089,-17069,31042,-14090,9832,19921,-16788,-1022,-31376,-8180,-13995,20973,-8584,-7253,-10219,10248,-17426,-25014,27711,1712,12452,27791,32197,32393,31112,29726,23945,-1599,-22382,2401,29150,30400,-11729,29432,}
                config.printModelColors = true;
                break;
            case 25660:
                copy(8136, config);
                config.name = "Bl0aty";
                config.tradeable = false;
                break;
            case 25672:
                copy(22358, config);
                config.inventoryOptions[2] = null;
                config.name = "Gloves of the Gods";
                config.tradeable = true;
                config.printModelColors = true;
                config.originalColors = new short[] {10,15,5780,5795,20,5790,5810,5785,5800};
                config.modifiedColors = new short[] {930,4829,12703,-7907,-4086,987,15773,-24375,29857};
            	   break;
            case 25659: // melee
                copy(43239, config);
                config.inventoryOptions[2] = "Transform";
                config.name = "Boots of the Gods";
                config.setEquipmentOption1("Transform");
                config.tradeable = true;
                config.addTexture(new int[] {-22370, 127, 280, 538, 520, -22380}, Settings.OSRS_TEXTURE_OFFSET+59);
                config.originalColors = new short[] {924,920};
                config.modifiedColors = new short[] {10, 10};
                break;
            case 25671: // mage
                copy(43239, config);
                config.inventoryOptions[2] = "Transform";
                config.name = "Boots of the Gods";
                config.setEquipmentOption1("Transform");
                config.tradeable = true;
                config.addTexture(new int[] {-22370, 127, 280, 538, 520, -22380}, 2238);
                config.originalColors = new short[] {924,920};
                config.modifiedColors = new short[] {10, 10};
                break;
            case 25670: // range
                copy(43239, config);
                config.inventoryOptions[2] = "Transform";
                config.setEquipmentOption1("Transform");
                config.name = "Boots of the Gods";
                config.tradeable = true;
                config.addTexture(new int[] {-22370, 127, 280, 538, 520, -22380}, 2247);
                config.originalColors = new short[] {924,920};
                config.modifiedColors = new short[] {10, 10};
                break;
            case 25656:
                copy(15217, config);
                config.name = "Horrific right arm";
                config.inventoryOptions[0] = null;
                break;

            case 6570:
                config.printModelColors = true;
                break;

            case 25657:
                copy(15218, config);
                config.name = "Horrific left arm";
                config.inventoryOptions[0] = null;
                break;
            case 25658:
                copy(15219, config);
                config.name = "Horrific tail";
                config.inventoryOptions[0] = null;
                break;
            case 25655:
                copy(42399, config);
                config.name = "December 2020 top donator pet";
                break;
            case 25654:
                copy(50851, config);
                config.name = "Twisted olmlet";
                config.addTexture(new int[] {-32661,20411,24,12,33,15296}, 2247);
                break;
            case 25653:
                copy(50851, config);
                config.name = "Elder olmlet";
                config.originalColors = new short[] {-32655,-31645,-32678,18370,13248,-32647,-32715,-32690};
                config.modifiedColors = new short[] {5, 4, 5, 5, 5, 7, 8, 10};
                config.addTexture(new int[] {-32661,20411,24,12,33,15296}, Settings.OSRS_TEXTURE_OFFSET + 59);
                break;
            case 25652:
                copy(50851, config);
                config.name = "Ancestral olmlet";
                config.originalColors = new short[] {-32655,-31645,-32678,18370,13248,-32647,-32715,-32690};
                config.modifiedColors = new short[] {-22518, -22520, -22522, -22524, -22522, -22520, -22518, -22515};
                config.addTexture(new int[] {-32661,20411,24,12,33,15296}, 2238);
                break;
            case 25651:
                config.name = "Vespina"; // flying
                copy(52384, config);
                break;
            case 25650:
                config.name = "Olmlet"; // dusted
                copy(50851, config);
                break;
            case 25649:
                config.name = "Tektiny"; // enraged
                copy(52378, config);
                break;
            case 25642:
                copy(962, config);
                config.name = "Infernal cracker";
                config.inventoryOptions[0] = "Open";
                config.inventoryOptions[4] = "Drop";
                config.originalColors = new short[] {127};
                config.modifiedColors = new short[] {0};
                config.addTexture(new int[] {57, 11200}, Settings.OSRS_TEXTURE_OFFSET + 59);
                break;
            case 25643:
                copy(1038, config);
                config.name = "Infernal partyhat";
                config.addTexture(new int[] {926, 127}, Settings.OSRS_TEXTURE_OFFSET + 59);
                break;
            case 25644:
                copy(1038, config);
                config.name = "Lava partyhat";
                config.addTexture(new int[] {926, 127}, 40);
                break;
            case 25553:
                copy(6199, config);
                config.name = "<col=00ff00>Christmas box";
                config.tradeable = true;
                config.inventoryOptions[0] = "Open";
                config.inventoryOptions[2] = "Preview";
                config.inventoryOptions[4] = "Drop";
                config.stackable = 126481113;
                config.originalColors = new short[]{ 2999, 926, 22410};
                config.modifiedColors = new short[]{ 940, 21300, 21300};
                //infernal box
                //config.originalColors = new short[]{ /*2999,*/ 926, 22410};
                //config.modifiedColors = new short[]{ /*940, */0, 0};
                //config.addTexture(new int[] {2999}, Settings.OSRS_TEXTURE_OFFSET + 59);
                break;
            case 25647:
                copy(43453, config);
                config.name = "Shadow Callus";
                config.value = 100000000 * -1375390745;
                config.tradeable = false;
                config.originalColors = new short[] {421,295,536,908,1816,53,2859,0,545,792,412,10283};
                config.modifiedColors = new short[] {4,3,2,1,2,4,5,6,5,4,3,2};
                break;
            case 25646:
                copy(43465, config);
                config.name = "November 2020 top donator pet";
                config.value = 100000000 * -1375390745;
                config.tradeable = false;
                config.addTexture(new int[] {8404,8536,5442,8396,16495,13411,7446,7516,16,7322,423,547,542,427}, Settings.OSRS_TEXTURE_OFFSET + 59);
                break;
            case 25645:
                copy(43453, config);
                config.name = "<col=FF0000>Infernal imp pet";
                config.value = 100000000 * -1375390745;
                config.tradeable = false;
                config.addTexture(new int[] {421,295,536,908,1816,53,2859,0,545,792,412,10283}, Settings.OSRS_TEXTURE_OFFSET + 59);
                break;
            case 25634:
                copy(61050, config);
                config.name = "<col=FF0000>Infernal santa's hat";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{933};
                config.modifiedColors = new short[]{12};
                config.tradeable = true;
                config.addTexture(new int[] {10351}, Settings.OSRS_TEXTURE_OFFSET + 59);
                break;
            case 25635:
                copy(74600, config);
                config.name = "<col=FF0000>Infernal santa's robe top";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{940, 933, 924, 928, 75, -9208, -9199, 60, 9015, 9032};
                config.modifiedColors = new short[]{12, 12, 14, 14, 14, 14, 12, 14, 14, 14};
                config.tradeable = true;
                config.addTexture(new int[] {4550, 90, 105, 120, 5401, 5411, 8998, 5392, 12236, 20287, -31932, 31548}, Settings.OSRS_TEXTURE_OFFSET + 59);
                break;
            case 25637:
                copy(74603, config);
                config.name = "<col=FF0000>Infernal santa's robe bottoms";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{933, 940, 928, 924, 912};
                config.modifiedColors = new short[]{14, 14, 13, 12, 12};
                config.tradeable = true;
                config.addTexture(new int[] {90, 68, 81}, Settings.OSRS_TEXTURE_OFFSET + 59);
                break;
            case 25636:
                copy(74602, config);
                config.name = "<col=FF0000>Infernal santa's gloves";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{-9196, -9190};
                config.modifiedColors = new short[]{12, 14};
                config.tradeable = true;
                config.addTexture(new int[] {5401, 5220, 5240, 5230}, Settings.OSRS_TEXTURE_OFFSET + 59);
                break;
            case 25638:
                copy(74605, config);
                config.name = "<col=FF0000>Infernal santa's boots";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{-9202, -9198, -9194};
                config.modifiedColors = new short[]{12, 14, 14};
                config.tradeable = true;
                config.addTexture(new int[] {90, 120, 105}, Settings.OSRS_TEXTURE_OFFSET + 59);
                break;
            case 25640:
                copy(73902, config);
                config.name = "<col=FF0000>Infernal santa's warhammer";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{6224, 5406, 7221, 7226, 7231, 7233, 7228, 5394, 5388, 5185, 5403};
                config.modifiedColors = new short[]{12, 12, 12, 12, 14, 14, 14, 14, 12, 12, 12};
                config.tradeable = true;
                config.addTexture(new int[] {5400, 5405, 6204, 5170, 7223, 7213, 7208, 5397}, Settings.OSRS_TEXTURE_OFFSET + 59);
                break;
            case 25639:
                copy(51012, config);
                config.name = "<col=FF0000>Infernal santa's crossbow";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{-32647, -32661, -31645, 24, 13223, 33};
                config.modifiedColors = new short[]{12, 14, 14, 14, 14, 12, 12};
                config.tradeable = true;
                config.addTexture(new int[] {-32692, -32678, 14236, 15256}, Settings.OSRS_TEXTURE_OFFSET + 59);
                break;
            case 25641:
                copy(66914, config);
                config.name = "<col=FF0000>Infernal santa's wand";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{-22413, 8877, 9015, 4634, 3614, 7050};
                config.modifiedColors = new short[]{12, 14, 14, 14, 14, 12};
                config.tradeable = true;
                config.addTexture(new int[] {9024, 9009, 5652, 8070}, Settings.OSRS_TEXTURE_OFFSET + 59);
                break;
            case 25611:
                copy(25534, config);
                config.name = "<col=800080>Hallowed Mask";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{ 960};
                config.modifiedColors = new short[]{ -17500};
                config.tradeable = true;
                break;
            case 25612:
                copy(25535, config);
                config.name = "<col=800080>Hallowed Robe Top";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{ 960};
                config.modifiedColors = new short[]{ -17500};
                config.tradeable = true;
                break;
            case 25613:
                copy(25536, config);
                config.name = "<col=800080>Hallowed Gauntlets";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{ 960};
                config.modifiedColors = new short[]{ -17500};
                config.tradeable = true;
                break;
            case 25614:
                copy(25537, config);
                config.name = "<col=800080>Hallowed Robe Bottom";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{ 960};
                config.modifiedColors = new short[]{ -17500};
                config.tradeable = true;
                break;
            case 25615:
                copy(25538, config);
                config.name = "<col=800080>Hallowed Greaves";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{ 960};
                config.modifiedColors = new short[]{ -17500};
                config.tradeable = true;
                break;
            case 25616:
                copy(61055, config);
                config.name = "<col=800080>Hallowed H'ween Mask";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{ 0, 926, 10349, 127};
                config.modifiedColors = new short[]{ 0, -17500, 10349, 127};
                config.tradeable = true;
                break;
            case 25617:
                copy(25539, config);
                config.name = "<col=800080>Hallowed Fang";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{ 10417, 3974, 3594, 2576, 2454, 1436, 1571, 1575, 6808, 7331};
                config.modifiedColors = new short[]{ -17500, -17500, -16116, -17500, -17500, -16116, -16116, -17500, -17500, -17500};
                config.tradeable = true;
                break;
            case 25618:
                copy(25540, config);
                config.name = "<col=800080>Hallowed Bane";
                config.value = 100000000 * -1375390745;
                config.maleModel2 = (68615) * 582597415;
                config.femaleModel2 = (68615) * -336299543;
                config.originalColors = new short[]{ 967, 779, 24, 16, 790, 796, 784, 33, 41, 49, 536, 61, 78, 20, 28, 37};
                config.modifiedColors = new short[]{ (short) -17500  , (short) 10, 10, -17500, 10, 10, 10, 10, 10, 10, -17500, 10, -17500, 10, 10, 10};
                config.tradeable = true;
                break;
            case 25619:
                copy(74484, config);
                config.name = "<col=800080>Hallowed Claws";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{ 914, 922, 918, 934, 929};
                config.modifiedColors = new short[]{ -17500, -17505, -17503, -17505, -17500};
                config.tradeable = true;
                break;
            case 25620:
                copy(54423, config);
                config.name = "<col=800080>Hallowed Staff";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{ 7326, 7333, 7442, 16, -3938, -3698, -3818, 18, 39, 35, 28, 20, -3574, -29376, -29240};
                config.modifiedColors = new short[]{ -17500, -17500, -17500, 10, -17500, -17500, -17500, 10, 12, 12, 14, -17500, -17550, 12, -17550};
                config.tradeable = true;
                config.setAttackStyle(26);
                break;
            case 25621:
                copy(79675, config);
                config.name = "<col=800080>Hallowed dye";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{ 4264, 4250, -31644, 5284, -31649, -31654};
                config.modifiedColors = new short[]{ -16116, -16116, -17500, -16116, -17500, -17500};
                config.tradeable = true;
                break;
            case 25648:
                copy(79675, config);
                config.inventoryOptions[0] = null;
                config.name = "<col=ff0000>Infernal dye";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{ 4264, 4250, 5284,};
                config.modifiedColors = new short[]{ -16116, -16116, -16116,};
                config.addTexture(new int[] { -31644, -31649, -31654}, Settings.OSRS_TEXTURE_OFFSET + 59);
                config.tradeable = true;
                break;
            case 25622:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(23874), config);
                config.name = "Lucky wings";
                config.inventoryOptions[4] = "Drop";
                config.originalColors = new short[]{967, 779, -29539, 6825, 6891, 6835, 936};
                config.modifiedColors = new short[]{-11265, 926, -11265, 926, 926, -11265, 926};
                config.tradeable = true;
                break;
            case 25623:
                copy(11790, config);
                config.inventoryOptions[0] = null;
                config.inventoryOptions[1] = null;
                config.inventoryOptions[4] = "Drop";
                config.name = "Death Jr.";
                //config.model =  Class15.aClass507_224.method6269(1506, 0).models[0] * -1019082089;
                break;
            case 25624:
                copy(309, config);
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.name = "Zio's gilded whaler";
                config.inventoryOptions[0] = "Cast";
                config.maleModel2 = (562) * 582597415;
                config.femaleModel2 = (562) * -336299543;
                config.originalColors = new short[] {41,7070, 6024,61,0,};
                config.modifiedColors = new short[] {8035,8179,8035, 0,0, 8035};
                break;
            case 42317:
                System.out.println("Arr " + Arrays.toString(config.modifiedColors));
                break;
            case 25542:
                copy(6199, config);
                config.name = "<col=800080>Halloween box";
                config.originalColors = new short[]{ 2999, 926, 22410};
                config.modifiedColors = new short[]{ 6085, -17500, -17500};
                config.tradeable = true;
                config.inventoryOptions[0] = "Open";
                config.stackable = 126481113;
                break;
            case 27000:
                copy(405, config);
                config.name = "Small Slayer Casket";
                config.originalColors = new short[]{-22477, 7062, 13248};
                config.modifiedColors = new short[]{105, (short) 15916  , 105};
                config.tradeable = false;
                break;
            case 27001:
                copy(405, config);
                config.name = "Medium Slayer Casket";
                config.originalColors = new short[]{-22477, 7062, 13248};
                config.modifiedColors = new short[]{105, (short) 7100  , 105};
                config.tradeable = false;
                break;
            case 27002:
                copy(405, config);
                config.name = "Large Slayer Casket";
                config.originalColors = new short[]{-22477, 7062, 13248};
                config.modifiedColors = new short[]{105, (short) 925  , 105};
                config.tradeable = false;
                break;
            case 27003:
                copy(405, config);
                config.name = "Boss Slayer Casket";
                config.originalColors = new short[]{-22477, 7062, 13248};
                config.modifiedColors = new short[]{935, (short) 5 , 935};
                config.tradeable = false;
                break;
            case 27004:
                copy(50703, config);
                config.name = "Mystery Crate";
                config.originalColors = new short[]{6443, 6439, 6563, 6558, 6682, 6806};
                config.modifiedColors = new short[]{7121, 7098, 6085, 2999, 7127, 926};
                config.tradeable = true;
                config.inventoryOptions[4] = "Drop";
                break;
            case 27005:
                copy(68871, config);
                config.name = "Oversized Mystery Crate";
                config.originalColors = new short[]{5404, 8481, 6554};
                config.modifiedColors = new short[]{2999, 926, 7000};
                break;
            case 27006:
                copy(50703, config);
                config.name = "Slayer Resource Crate";
                config.tradeable = true;
                break;
            case 25700:
                copy(13746, config);
                config.name = "Catalyst sigil";
                config.value = 50000000 * -1375390745;
                config.tradeable = true;
                config.originalColors = new short[]{ 11576, 11433};
                config.modifiedColors = new short[]{ -29093, -29093};
                break;
            case 25702:
                copy(73738, config);
                config.name = "Catalyst Spirit Shield";
                config.value = 5000000 * -1375390745;
                config.tradeable = true;
                config.originalColors = new short[]{ 7121, 7098, 7092, 7101, 7127, 7050, 7061, 7104, 7056, 105, 7089, 901};
                config.modifiedColors = new short[]{ 5, -29164, -29164, -29164, 5, -29164, -29164, -29164, -29164, -29090, -29164, -29164};
                break;
            case 44702:
                copy(51018, config);
                config.name = "<col=00FFFF>Catalyst hat";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{6973, -21992, -22235, 6323, 6331, 5268, 6340, 6348, 6356, 6364};
                config.modifiedColors = new short[]{-29093, -29093, -29164, 10, 16, -29164, 16, -29164, -29093, -29093};
                config.tradeable = true;
                break;
            case 25695:
                copy(74497, config);
                config.name = "<col=00FFFF>Catalyst robe top";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{920, 16, 12, 28, 24, 7104, 7097, 8};
                config.modifiedColors = new short[]{-29093, 16, 12, 28, 24, -29164, -29164, -29093};
                config.tradeable = true;
                break;
            case 25696:
                copy(74501, config);
                config.name = "<col=00FFFF>Catalyst robe bottom";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{24, 16, 8, 920, 103, 0, 12};
                config.modifiedColors = new short[]{24, 16, 8, -29093, -29164, 0, 12};
                config.tradeable = true;
                break;
            case 25697:
                copy(66922, config);
                config.name = "<col=00FFFF>Catalyst gloves";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{10004};
                config.modifiedColors = new short[]{-29093};
                config.tradeable = true;
                break;
            case 25698:
                copy(66920, config);

                config.name = "<col=00FFFF>Catalyst boots";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-22248, 695, 9152, 0};
                config.modifiedColors = new short[]{-29164, 14, -29093, 10};
                config.tradeable = true;
                break;
            case 25701:
                copy(81775, config);
                config.name = "<col=00FFFF>Cataclysm orb";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{21431, 21437, 21423, 21408, 21414};
                config.modifiedColors = new short[]{-29093, -29093, -29093, -29093, -29093};
                config.tradeable = true;
                break;
            case 25699:
                copy(81777, config);
                config.name = "<col=00FFFF>Cataclysm";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{21431, 21437, 21424, 21414, 7479, 7471, 7510, 7460, 7485, 7733, 7851, 7462, 7453, 7445, 7439, 7469, 7463};
                config.modifiedColors = new short[]{-29093, -29093, -29093, -29093, 10, -29093, 12, 12, 14, 14, 12, 12, 10, -29093, 12, -29093, -29093};
                config.tradeable = true;
                config.setAttackStyle(26);
                break;
            case 18338: // gem bag
            case 18338 + Settings._685_ITEM_OFFSET:
                copy(42020, config);
                config.stackIDs = null;
                config.stackAmounts = null;
                break;
            case 18339: // coal bag
            case 18339 + Settings._685_ITEM_OFFSET:
                copy(42019, config);
                break;
            case 25587:
                copy(13731, config);
                config.name = "Upgrade fragments";
                //config.tradeable = true;
                config.inventoryOptions[0] = "Craft";
                config.inventoryOptions[4] = "Drop";
                config.stackable = 126481113;
                break;
            case 25586:
                copy(4565, config);
                config.name = "<col=FF5733>Easter Mystery Basket";
                config.tradeable = true;
                config.inventoryOptions[0] = "Open";
                config.inventoryOptions[4] = "Drop";
                config.stackable = 126481113;
                break;
            case 25584:
                copy(75241, config);
                config.name = "<col=00FFFF>Corrupted Cannon";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-29668, -29641, -29624, -29671, -29654, -29661, -29648, -29631, -29680, -29663, -29670, 6303, -29696, -29674, -29681, 6317, -29650, 1058, 1070, 1051, 1097, 54, 49, 39, 32, 64, 59, 45, 31, 40, 50, 23, 85};
                config.modifiedColors = new short[]{-29090, 10351, 10351, -29090, 10351, -29090, 10351, -29090, 10351, 10351, 10351, 10351, 10351, -29090, -29090, 10351, 10351, 10351, 10351, -29090, -29090, 10351, 10351, 10351, 10351, 10351, 10351, 10351, 10351, -29090, -29090, 10351, 10351};
                config.tradeable = true;
                config.inventoryOptions[4] = "Drop";
                break;
            case 25583: //dawnbringer
                copy(52516, config);
                config.name = "<col=00FFFF>Corrupted Eggbringer";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-9764, 9026, 33, 57, 8406, 37, 49, 61, -9803};
                config.modifiedColors = new short[]{-29090, 10351, -29090, 10351, -29090, 10351, -29090, 10351, 10351};
                config.tradeable = true;
                config.inventoryOptions[4] = "Drop";
                config.setAttackStyle(28);
                config.setSpecialBar();
                break;
            case 25582:
                copy(71021, config);
                config.name = "<col=00FFFF>Corrupted Chicken Head";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{972, 10471, 12599, 127, 6092, 0};
                config.modifiedColors = new short[]{-29090, 10351, 10351, -29090, 10351, 0};
                config.tradeable = true;
                config.inventoryOptions[4] = "Drop";
                break;
            case 25581:
                copy(71020, config);
                config.name = "<col=00FFFF>Corrupted Chicken Wings";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{10574, 10471, 103, 10438};
                config.modifiedColors = new short[]{10351, -29090, 10351, 10351};
                config.tradeable = true;
                config.inventoryOptions[4] = "Drop";
                break;
            case 25585:
                copy(74728, config);
                config.name = "<col=00FFFF>Corrupted Carrot";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{4643, 4646, 4652, 4658, 4151, 4161, 4663, 4673, 4127, 16788, 16801, 4156, 4141, 4638, 4648};
                config.modifiedColors = new short[]{10351, -29090, 10351, -29090, -29090, -29090, 10351, -29090, 10351, -29090, 10351, -29090, 10351, -29090, -29090};
                config.tradeable = true;
                config.inventoryOptions[4] = "Drop";
                break;
            case 25580:
                copy(71022, config);
                config.name = "<col=00FFFF>Corrupted Chicken Legs";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{10471, 10582, 9694};
                config.modifiedColors = new short[]{10351, 10351, -29090};
                config.tradeable = true;
                config.inventoryOptions[4] = "Drop";
                break;
            case 25579:
                copy(71019, config);
                config.name = "<col=00FFFF>Corrupted Chicken Feet";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{7104, 103, 7114, 0};
                config.modifiedColors = new short[]{10351, -29090, 10351, 10351};
                config.tradeable = true;
                config.inventoryOptions[4] = "Drop";
                break;
            case 25578:
                copy(54419, config);
                config.name = "<col=FF0000>Templar's Great Helm";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{37, 45, 0, 28, 16, 410, 412};
                config.modifiedColors = new short[]{37, 45, 9050, 9050, 16, 410, 412};
                config.tradeable = true;
                break;
            case 25577:
                copy(54420, config);
                config.name = "<col=FF0000>Templar's Hauberk";
                config.maleModel2 = (68615) * 582597415;
                config.femaleModel2 = (68615) * -336299543;
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{967, 779, 28, 16, 37, 45, 412, 33, 278, 268, 4, 3346, 5400};
                config.modifiedColors = new short[]{9000, 779, 28, 9050, 37, 45, 412, 33, 278, 268, 4, 3346, 5400};
                config.tradeable = true;
                break;
            case 25576:
                copy(54421, config);
                config.name = "<col=FF0000>Templar's Plateskirt";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{268, 4, 37, 20, 16, 45, 278, 28, 412, 3346, 5400, 398};
                config.modifiedColors = new short[]{9050, 4, 37, 9050, 9050, 45, 278, 28, 412, 3346, 5400, 398};
                config.tradeable = true;
                break;

            case 25575: //Versace's Rage
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(50997), config);
                config.name = "Versace's Rage";
                config.maleModel2 = (68615) * 582597415;
                config.femaleModel2 = (68615) * -336299543;
                config.originalColors = new short[]{967, 779, 13223, 16, 8, 24, 33, 10318, 41, 10334, 0, 14236};
                config.modifiedColors = new short[]{(short) 10, (short) 5, 5, 20, 20, 10, 10, 0, 0, 0, 0, 0};
                config.setSpecialBar();
                break;
            case 54424: ///nightmare staff upgraded
            case 54425:
                config.setAttackStyle(26);
                config.setSpecialBar();
                break;
            case 54422: ///nightmare staff
                config.setAttackStyle(26);
                config.tradeable = true;
                break;
            case 54423:///nightmare staff harmonized
                config.setAttackStyle(26);
                break;
            case 54511: //nightmare staff orbs
            case 54514:
            case 54517:
                config.tradeable = true;
                break;
            case 54417://nightmare mace
                config.setAttackStyle(8);
                config.tradeable = true;
                break;
            case 25574:
                copy(14471, config);
                config.name = "Keepsake key";
                config.inventoryOptions[4] = "Drop";
                config.tradeable = true;
                config.stackable = 126481113;
                config.value = 3000000 * -1375390745;
                break;
            case 25573:
                copy(80135, config);
                config.name = "<col=FF0000>Ultimate Torva Full Helmet";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{12, 45, 90, 30, 40, 25, 31, 34, 35, 80, 56, 24, 18, 26, 15, 20, 37, 58, 55, 64, 50, 11, 21, 33, 43, 41, 44, 38, 79, 27, 81, 70, 32, 36, 39, 74, 46, 29, 88};
                config.modifiedColors = new short[]{10, 935, 935, 12, 12, 12, 12, 12, 14, 14, 14, 14, 14, 14, 14, 14, 14, 935, 935, 935, 935, 935, 935, 935, 14, 935, 935, 14, 14, 14, 12, 12, 12, 12, 12, 12, 10, 10, 10};
                config.tradeable = true;
                break;
            case 25572:
                copy(20139, config);
                config.name = "<col=FF0000>Ultimate Torva Chestplate";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{12236, 20287, -31932, 31548, 4550, 71, -16999, -17353, -17005, -17398, -17380, -17390, -17386, -16887, -17389, -17404, 525, 529, 533, -16878, -16882, -17378, -17138, -17395, -17394, -17364, -17400, 520, -22518, -17393, -16884, -16870, -17374, -22520, -22513, -22515, 53, -22516, -22494, -22524, -22512, -22504, -22498, -22473, -22502, -22482, -22486, -17144, 57, -17354, -22509, -22507, -17405, -22505, -22519, -17401, -22485, -22491, -28650, -28653, -28636, -28623, -28634, -28618, -28644, -28658, -28660, -28654, -17408, -17365, -10666, -28638, -28649, -17384, -28632, 65, -28637, -28642, -10713, -28655, -28611, -28641};
                config.modifiedColors = new short[]{12, 935, 10, 12, 935, 935, 12, 935, 12, 12, 12, 12, 12, 935, 935, 14, 14, 935, 14, 14, 935, 12, 935, 935, 935, 935, 14, 935, 14, 935, 12, 12, 12, 12, 12, 12, 12, 935, 10, 12, 12, 12, 12, 12, 12, 12, 10, 935, 935, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 935, 14, 14, 14, 14, 14, 14, 14, 12, 12, 14, 14, 14, 14, 14, 14, 14, 14, 12, 12, 12, 12, 12, 12, 12, 12, 10, 12, 12, 12, 12, 12, 12, 12, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                config.tradeable = true;
                break;
            case 25571:
                copy(80139, config);
                config.name = "<col=FF0000>Ultimate Torva Chestplate";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-16587, 33, 17, 20, 24, 0, 47, 19, 1, 63, 27, 547, 554, 560, 50, 67, 45, 6, 15, 13, -32749, 29, 37, 43, 40, 46, 80, 32, 91, 18, 42, 12, -32746, -32753, 22, 41, 34, 110, 81, 7, -16812, -16835, 39, 31, 55, -16866, 77, -16855, -16849, 68, 54, 49, 100, 25, 89, 7446};
                config.modifiedColors = new short[]{10, 10, 10, 12, 12, 935, 935, 12, 12, 12, 12, 12, 14, 14, 14, 14, 14, 14, 14, 14, 12, 12, 14, 14, 14, 14, 14, 935, 935, 14, 935, 12, 12, 12, 12, 12, 12, 935, 935, 935, 935, 12, 12, 12, 12, 12, 10, 10, 12, 12, 12, 14, 12, 12, 10, 10};
                config.tradeable = true;
                break;
            case 25570:
                copy(80143, config);
                config.name = "<col=FF0000>Ultimate Torva Platelegs";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{22, 13, 19, 81, 63, 25, -12152, 34, -12151, -12149, -12158, 49, 14, 100, 42, 90, 70, 12, -31726, -12030};
                config.modifiedColors = new short[]{935, 935, 12, 935, 935, 12, 12, 14, 12, 12, 14, 935, 12, 935, 12, 935, 935, 12, 935, 12};
                config.tradeable = true;
                break;
            case 25569:
                copy(24977, config);
                config.name = "<col=FF0000>Ultimate Torva Gloves";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-28667, -17405, -17398, -22516, -22492, -22485, -22509, -22513, -22519, 71};
                config.modifiedColors = new short[]{935, 12, 12, 935, 12, 935, 12, 12, 12, 12};
                config.tradeable = true;
                break;
            case 25568:
                copy(24983, config);
                config.name = "<col=FF0000>Ultimate Torva Boots";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-17008, -17399, -17003, -17010, 67, -17015, -17012, -17004, -17392, -17022};
                config.modifiedColors = new short[]{935, 12, 12, 935, 12, 935, 12, 12, 935, 935};
                config.tradeable = true;
                break;
            case 25567:
                copy(80147, config);
                config.name = "<col=00FF0F>Ultimate Pernix Cowl";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{17, 12, -15959, 22, -15954, -15956, -15963, 10, 25, 4, 6, 8};
                config.modifiedColors = new short[]{10, 12, 12, 12, 13223, 13223, 13223, 13223, 13223, 12, 12, 10};
                config.tradeable = true;
                break;
            case 25566:
                copy(20151, config);
                config.name = "<col=00FF0F>Ultimate Pernix Body";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{20287, -21386, -21397, -21377, -21405, -21412, -21429, -21411, -21420, -21380, -21379, -21421, -21430, -21390, -21436, -21445, -21458, -21484, -21396, -21473, -21459, -21435, -21398, -21394, -21383, -21393, -21423, -21432, -21424, -21407, -21414, -21402, -21389, -21382, -21422, -19309, -19259, 13325, -19288, -19283, 13330, 13331, 13326, 13329, -19292, -21442, 13333, 13337, -19301, 13320, 13323, 13321, -19297, 13318, -21425, 13343, 13319, -19286, 13324, -19302, -19308, -3429, -3423, -3419, -3418, -3412, -3407, -19296, -3425, -3409, 13327, -21417, -21410, -21498};
                config.modifiedColors = new short[]{13223, 13223, 12, 12, 12, 12, 12, 13223, 13223, 13223, 13223, 12, 13223, 13223, 13223, 14, 14, 14, 14, 14, 12, 12, 14, 14, 14, 14, 14, 14, 14, 14, 12, 12, 12, 12, 12, 12, 12, 13223, 10, 13223, 13223, 12, 12, 12, 12, 12, 10, 13223, 13223, 12, 13223, 13223, 12, 12, 12, 13223, 14, 14, 14, 14, 14, 14, 14, 12, 12, 14, 14, 14, 14, 14, 14, 14, 14, 12, 12, 12, 12, 12, 12, 12, 13223, 13223, 12, 13223, 13223, 12, 12, 12, 13223, 14, 14, 14, 14, 14, 14, 14, 12, 12, 14, 14, 14, 14, 14, 14, 14, 14, 12, 12, 12, 12, 12, 12, 12};
                config.tradeable = true;
                break;
            case 25565:
                copy(80151, config);
                config.name = "<col=00FF0F>Ultimate Pernix Body";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{12, 10, 931, 914, 10329, 927, 23, 10356, 16, -13915, -13894, 10285, 10323, -22499, 24, -13927, 8, 35, 10277, 47, 22, 81, 57, 23567, -22504, -22512, -11243, 10290, -22491, 10360, 10273, 10286, 934, 10284, 10312, 10300, 10324, 10306, -11253, 40, 10291, -13899, 10294, 10295, 10307, 10301, -13875, -13890, 4106};
                config.modifiedColors = new short[]{10, 12, 12, 12, 12, 12, 13223, 13223, 13223, 13223, 13223, 12, 12, 12, 12, 14, 14, 14, 13223, 13223, 12, 12, 14, 14, 14, 12, 12, 12, 12, 12, 12, 13223, 13223, 13223, 13223, 13223, 13223, 12, 12, 12, 12, 14, 14, 14, 14, 12, 12, 13223, 13223};
                config.tradeable = true;
                break;
            case 25564:
                copy(80155, config);
                config.name = "<col=00FF0F>Ultimate Pernix Chaps";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-11253, 10360, 10286, -11251, 914, 10320, 10356, 10273, -11239, -11242, -11244, -11247, 10263, -11264, -13910, -13917, -13926, -11249, 10300, 10341, 31, 43, 24, 19, 38, 51, 17, 30};
                config.modifiedColors = new short[]{12, 13223, 14, 12, 13223, 13223, 12, 12, 14, 10, 13223, 14, 13223, 12, 14, 14, 14, 13223, 13223, 13223, 12, 12, 12, 12, 12, 12, 13223, 13223};
                config.tradeable = true;
                break;
            case 25563:
                copy(24974, config);
                config.name = "<col=00FF0F>Ultimate Pernix Gloves";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{13327, 8, 13335, 13331};
                config.modifiedColors = new short[]{12, 13223, 13223, 12};
                config.tradeable = true;
                break;
            case 25562:
                copy(24989, config);
                config.name = "<col=00FF0F>Ultimate Pernix Boots";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{13327, 8, 13342, 13323, 13333, 13329, -21396, 13337, 13320};
                config.modifiedColors = new short[]{13223, 12, 12, 13223, 12, 13223, 12, 12, 13223};
                config.tradeable = true;
                break;
            case 25561:
                copy(80159, config);
                config.name = "<col=002EFF>Ultimate Virtus Mask";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-31711, 10356, -31702, -31728, 10343, -31692, -31686, -31720, -31723, 10320, 10332, -31744, -31704, -31694, -31707, -31709, -31672, 10309, 10315, 10314, 10325, -31639, -15954, 20, 10304, -15959, 6221, 10322, 18, 12};
                config.modifiedColors = new short[]{10, 10, 10, 12, 12, 12, 12, 12, -19500, -19500, -19500, -19500, -19500, -19500, 12, 12, 12, -19500, -19500, -19500, -19500, -19500, -19500, -19500, -19500, 12, 12, 12, 12, 10, 10, 10};
                config.tradeable = true;
                break;
            case 25560:
                copy(20163, config);
                config.name = "<col=002EFF>Ultimate Virtus Robe Top";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-3013, -2948, 11138, -3050, 17, -3004, 15, 55, 53, 62, 24, -2982, 37, -2557, -3060, -3053, -3057, -3062, 13, -18004, -3064, 8, 23, 64, -3024, 653, -3031, -3035, -3032, -3030, 20, 42, -17992, -18021, -18015, 4352, 67, 24580, 24576, -3054};
                config.modifiedColors = new short[]{10, -19500, -19500, 12, -19500, -19500, -19500, 12, 12, 12, -19500, -19500, -19500, -19500, -19500, 12, -19500, 12, 12, 12, -19500, -19500, 12, 12, 12, 12, -19500, -19500, -19500, -19500, -19500, -19500, -19500, -19500, -19500, -19500, -19500, 12, 12, 12};
                config.tradeable = true;
                break;
            case 25559:
                copy(80163, config);
                config.name = "<col=002EFF>Ultimate Virtus Robe Top";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{10356, 10336, 23601, 23611, 10329, 10309, 10297, 23571, 23586, -30709, -30698, 10294, 10279, 914, 6298, 6308, 931, -30700, -15964, -30712, -15959, 10341, 10331, -15954, 10351, -30684, -30689, -30320, -30693, 10343, -30679, -30694, 10332, -30683, -30692, -30701, 6226, -30702, -30688, 6354, 6318, 23581, 23591};
                config.modifiedColors = new short[]{-19500, -19500, -19500, -19500, -19500, -19500, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, -19500, -19500, 12, 12, -19500, -19500, -19500, -19500, -19500, -19500, 10, 10, -19500, -19500, 12, 12, 14, 14, 14, 14, 14, 12, 12, 12, -19500, -19500, -19500, -19500, 12, 12, 12, 10, 10};
                config.tradeable = true;
                break;
            case 25558:
                copy(80167, config);
                config.name = "<col=002EFF>Ultimate Virtus Robe Legs";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{10271, -11251, 6309, 10281, 10340, 10334, 10356, 10360, 921, 10318, -11244, 10286, -11239, -11247, -15954, 914, -15964, -15959, 10320, 4106};
                config.modifiedColors = new short[]{-19500, -19500, -19500, 12, 12, 12, 12, 12, 14, -19500, 14, -19500, 14, -19500, -19500, 14, -19500, -19500, -19500, -19500};
                config.tradeable = true;
                break;
            case 25557:
                copy(24980, config);
                config.name = "<col=002EFF>Ultimate Virtus Gloves";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{31, 23, 15, 20, 27, 29, 12, 16, 19, 11, 7};
                config.modifiedColors = new short[]{-19500, 10, 12, 12, 12, 14, 14, 14, 12, 12, -19500};
                config.tradeable = true;
                break;
            case 25556:
                copy(24986, config);
                config.name = "<col=002EFF>Ultimate Virtus Boots";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-11256, -11247, -11246, -11241, -11251, -11243};
                config.modifiedColors = new short[]{-19500, 10, 12, 12, 12, 14};
                config.tradeable = true;
                break;

            case 25555:
                config.name = "LolthenKILL pet";
                config.model = Class15.aClass507_224.method6269(16033, 0).models[0] * -1019082089;
                break;
            case 25554:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(23874), config);
                config.name = "Wrath of the Horde";
                config.inventoryOptions[4] = "Drop";
                config.originalColors = new short[]{967, 779, -29539, 6825, 6891, 6835, 936};
                config.modifiedColors = new short[]{(short) 76770, (short) 8128, (short) 76770, (short) 8128, (short) 8128, 127, (short) 8128};
                config.tradeable = true;
                break;
            case 25552:
                copy(61050, config);
                config.name = "<col=FF0000> Evil Santa's Hat";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{933, 10351};
                config.modifiedColors = new short[]{12, 938};
                config.tradeable = true;
                break;
            case 25551:
                copy(74600, config);
                config.name = "<col=FF0000> Evil Santa's Robe Top";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{940, 4550, 933, 924, 90, 105, 120, 928, 75, -9208, -9199, 60, 5401, 5411, 9015, 9032, 8998, 5392, 12236, 20287, -31932, 31548};
                config.modifiedColors = new short[]{12, 938, 12, 14, 938, 938, 938, 14, 14, 14, 12, 14, 938, 938, 14, 14, 938, 938, 938, 938, 938, 938};
                config.tradeable = true;
                break;
            case 25550:
                copy(74603, config);
                config.name = "<col=FF0000> Evil Santa's Robe Bottoms";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{90, 68, 81, 933, 940, 928, 924, 912};
                config.modifiedColors = new short[]{938, 938, 938, 14, 14, 13, 12, 12};
                config.tradeable = true;
                break;
            case 25549:
                copy(74602, config);
                config.name = "<col=FF0000> Evil Santa's Gloves";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{-9196, -9190, 5401, 5220, 5240, 5230};
                config.modifiedColors = new short[]{12, 14, 938, 938, 938, 938};
                config.tradeable = true;
                break;
            case 25548:
                copy(74605, config);
                config.name = "<col=FF0000> Evil Santa's Boots";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{-9202, -9198, 90, -9194, 120, 105};
                config.modifiedColors = new short[]{12, 14, 938, 14, 938, 938};
                config.tradeable = true;
                break;
            case 25547:
                copy(73902, config);
                config.name = "<col=FF0000> Evil Santa's warhammer";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{5400, 5405, 6224, 6204, 5170, 7223, 5406, 7221, 7226, 7231, 7233, 7228, 7213, 7208, 5394, 5397, 5388, 5185, 5403};
                config.modifiedColors = new short[]{938, 938, 12, 938, 938, 938, 12, 12, 12, 14, 14, 14, 938, 938, 14, 938, 12, 12, 12};
                config.tradeable = true;
                break;
            case 25546:
                copy(51012, config);
                config.name = "<col=FF0000>Evil Santa's crossbow";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{-32647, -32661, -31645, -32692, -32678, 24, 13223, 33, 14236, 15256};
                config.modifiedColors = new short[]{12, 14, 14, 14, 938, 938, 14, 12, 12, 938, 938};
                config.tradeable = true;
                break;
            case 25545:
                copy(66914, config);
                config.name = "<col=FF0000>Evil Santa's wand";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{-22413, 8877, 9024, 9015, 9009, 5652, 4634, 3614, 7050, 8070};
                config.modifiedColors = new short[]{12, 14, 938, 14, 938, 938, 14, 14, 12, 938};
                config.tradeable = true;
                break;


            case 19784:
                config.value *= 10;
                break;
            case 989:
            case 53083:
            case 53951:
                config.inventoryOptions[0] = "Teleport";
                break;
            case 54034: //helm
            case 54037: //body
            case 54040: //legs
            case 54043: //boots
            case 54046:
                config.tradeable = true;
                break;
            case 562:
            case 560:
            case 565:
            case 566:
            case 561:
            case 563:
            case 564:
            case 9075:
            case 888:
            case 890:
            case 892:
            case 11212:
            case 9244:
            case 9245:
            case 51944:
            case 51946:
            case 51948:
                config.value = ((config.value * 785788887) / 3) * -1375390745;
                config.tradeable = true;
                break;
            case 53943:
            case 54268:
                config.tradeable = true;
                break;
            case 25532: //zio pet
                copy(18648, config);
                config.name = "Slave pet";
                config.originalColors = new short[]{8, 24, 33, 41};
                config.modifiedColors = new short[]{926, 1100, 926, (short) 302770};
                config.inventoryOptions = new String[config.inventoryOptions.length];
                config.inventoryOptions[4] = "Drop";
                break;

            case 25531:
                copy(20068, config);
                config.name = "Ava's blessing";
                config.originalColors = new short[]{24723, 6410, 24710, 6420, 24730, 24740, 7604, 7575, 7589, 7594, 7599, 6415, 7583, 7560, 6223, 6435, 6342, 6352, 6362, 6347, 6357, 6372, 818, 6213, 6203, 6198, 6193, 6208, 6188, 6183, 803, 793};
                config.modifiedColors = config.originalColors.clone();
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] += 3600;
                break;
            case 25530: //tbow pet
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(50997), config);
                config.name = "Twisted bow pet";
                config.originalColors = new short[]{8, 24, 33, 41};
                config.modifiedColors = new short[]{926, 1100, 926, (short) 302770};
                config.inventoryOptions = new String[config.inventoryOptions.length];
                config.inventoryOptions[4] = "Drop";
                break;
            case 25529:
                copy(16955, config);
                config.name = "<col=ffff00>Legendary lightning rapier (u)";
                config.inventoryOptions[2] = "";
                config.originalColors = new short[]{-27633, -27638, -27643, -27608, -27568, -27628, -27613, -27618, -27623, -27648, -27639, -27636, -27641, -27631, -27632, -27637};
                config.modifiedColors = new short[]{7000, 900, 900, 0, 0, 900, 900, 900, 900, 900, 900, 6900, 6900, 6900, 6900, 6900};
                config.setSpecialBar();
                config.tradeable = true;
                break;
            case 25661:
                copy(16955, config);
                config.name = "<col=21ff81>Rapier of insanity";
                config.inventoryOptions[2] = "";
                config.originalColors = new short[]{-27633, -27638, -27643, -27608, -27639, -27636, -27641, -27631, -27632, -27637};
                config.modifiedColors = new short[]{42, 35, 20, 0, 0,  20, 20, 20, 20, 20};
                config.addTexture(new int[] {-27568, -27628, -27613, -27618, -27623, -27648,}, 2247);
                config.setSpecialBar();
                config.tradeable = true;
                break;
            case 25588://nightmare mace
                copy(24455, config);
                config.name = "<col=FF0000>Templar's mace";
                config.value = 1000000 * -1375390745;
                //[242, 709, 697, 733, 745, 680, 692, 167, 155, 214, 342, 307, 729, 670, 714]
                //    config.originalColors = new short[]{ 670, 680, 692, 697, 709, 714, 729, 733, 745 };
                //    config.modifiedColors = new short[]{ 9050,9050, 9050, 9050, 9050, 9050, 9050, 9050, 9050};
                config.originalColors = new short[]{242, 214, 670, 680, 692, 697, 709, 714, 729, 733, 745};
                config.modifiedColors = new short[]{9050, 9050, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78};
                config.tradeable = true;
                break;
            case 25589://nightmare mace (u)
                copy(24455, config);
                config.name = "<col=FF0000>Templar's mace (u)";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{242, 214, 670, 680, 692, 697, 709, 714, 729, 733, 745};
                config.modifiedColors = new short[]{9050, 9050, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78};
                config.tradeable = true;
                break;
            case 25590:
                config.name = "Catablepon pet";
                config.model = Class15.aClass507_224.method6269(16034, 0).models[0] * -1019082089;
                break;
            case 25593:
                config.model = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(542).model;
                config.name = "Dead Monk pet";
                //	config.model =  Class15.aClass507_224.method6269(16035, 0).models[0] * -1019082089;
                break;
            case 25594:
                copy(6199, config);
                config.name = "Minigame Box";
                config.tradeable = true;
                config.value = 100000 * -1375390745;
                config.modifiedColors[0] = (short) 76770;
                break;

            case 25528:
                copy(20771, config);
                config.name = "Elite completionist cape";
                break;
            case 25527:
                copy(71704, config);
                config.name = "Almighty hilt";
                config.tradeable = true;
                config.originalColors = new short[]{21541, -22477, -22464, 21530, 21522};
                config.modifiedColors = new short[]{9152, 920, 9152, 920, 9152};
                break;
            case 25526:
                copy(71696, config);
                config.name = "Almighty godsword";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{
                        -22477, 21541, -22464, 21530, -22423, -22444, -22415, -22419, -22440,

                        21522, 21514, 21555, 21533, -22484, -22463, -22470, -22507, -22461, -22506, -22440, -22447, -23469, -23492, -23503, -23526, -22493, -22486, -23480, -23498, -23521, -22459, -22473, -22450, -22436, -22428, -22409, -22508, -22482, -22496, -22451, -22432, -22485, -22495, -22489, -22453, -23467, -23483, -23514, -23478, -23491, -23489};
                config.modifiedColors = new short[]{
                        9152, 920, 9152, 920, 9152, 920, 9152, 920, 9152,

                        920, 12, 920, 920, 8, 8, 8, 10, 10, 12, 12, 12, 9152, 9152, 9152, 9152, 12, 12, 9152, 9152, 9152, 920, 12, 920, 920, 920, 920, 920, 920, 920, 920, 920, 12, 12, 12, 12, 9152, 9152, 9152, 9152, 9152, 9152};
                config.tradeable = true;
                break;
            case 25524:
                copy(71724, config);
                config.name = "<col=ff0000>Ultimate bandos chestplate";
                config.originalColors = new short[]{22, 8367, 8384, 8375, 10266, 9523, 9515, 10502, 163, 8076, 10275, 7050, 142, 10291, 10283, 10287};
                config.modifiedColors = new short[]{5, 900, 942, 920, 5, 9523, 9515, 10502, 9523, 8076, 5, 7050, 142, 0, 5, 910};

                break;
            case 25525:
                copy(71720, config);
                config.name = "<col=ff0000>Ultimate armadyl chestplate";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-22440, 4550, -22489, -22448, 8658, 8650, -22460, -22452, -22464};
                config.modifiedColors = new short[]{0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12};
                break;
            case 25505:
                copy(11724, config);
                config.name = "<col=ff0000>Ultimate bandos chestplate";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{61, 10306, 10295, 5181, 10312, 5190, 10320, 22, 7622, 4, 12, 7597, 10, 7574, 16, 40, 64, 3334, 3346, 7648, 7630, 7624, 10262, 10268, 7618, 10256, 1434, 1440, 1446, 45, 95, 91, 87, 83, 76, 1430, 1426, 1432, 1436, 1424, 1416, 1410, 1422, 82, 68, 2320, 53, 36, 88, 7589, 2328, 268, 8};
                config.modifiedColors = new short[]{5, 900, 942, 920, 5, 9523, 9515, 10502, 9523, 8076, 5, 7050, 142, 0, 5, 910, 5, 900, 942, 920, 5, 9523, 9515, 10502, 9523, 8076, 5, 7050, 142, 0, 5, 910, 5, 900, 942, 920, 5, 9523, 9515, 10502, 9523, 8076, 5, 7050, 142, 0, 5, 910, 5, 900, 942, 920, 5};
                config.tradeable = true;
                break;
            case 25506:
                copy(71726, config);
                config.name = "<col=ff0000>Ultimate bandos tassets";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{163, 39, 8390, 9523, 24, 29, 34, 22};
                config.modifiedColors = new short[]{9500, 5, 920, 9523, 24, 29, 34, 9};
                config.tradeable = true;
                break;
            case 25507:
                copy(25022, config);
                config.name = "<col=ff0000>Ultimate bandos helmet";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{5254, 5281, 5287, 5267, 5260, 5248, 5318, 5280, 5294, 5276, 5306, 9011, 5265, 9040, 5279, 5288, 5283, 5366, 5357, 5353, 5326, 5302, 5324, 5310, 2992};
                config.modifiedColors = new short[]{942, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 942, 10, 942, 920, 920, 920, 942, 920, 942, 920, 920, 942};
                config.tradeable = true;
                break;
            case 25508:
                copy(25025, config);
                config.name = "<col=ff0000>Ultimate bandos gloves";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{4632, 4622, 4617, 4637, 4627, 4654};
                config.modifiedColors = new short[]{920, 5, 920, 920, 10, 10};
                config.tradeable = true;
                break;
            case 25509:
                copy(71728, config);
                config.name = "<col=ff0000>Ultimate bandos boots";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{10291, 22, 6550};
                config.modifiedColors = new short[]{920, 10, 6550};
                config.tradeable = true;
                break;
            case 25510:
                copy(25019, config);
                config.name = "<col=ff0000>Ultimate bandos warshield";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{127, 4003, 4272, 4232, 4256, 4254, 4291, 4332, 4312, 4300, 4288, 4276, 4268, 4283, 4271, 4242, 4261, 18969, 4305, 4260, 4284, 4302, 4286, 4250, 4278, 5394, 10508, 4238, 4262, 5418, 4274, 5386};
                config.modifiedColors = new short[]{942, 10, 942, 10, 942, 10, 10, 10, 942, 10, 942, 10, 10, 942, 10, 942, 10, 942, 10, 10, 10, 942, 10, 942, 10, 10, 942, 10, 942, 10, 942, 10};
                config.tradeable = true;
                break;
            case 25511:
                copy(71718, config);
                config.name = "<col=ff0000>Ultimate armadyl helmet";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-22452, -22460, -22506, 8650, -22456, -22448};
                config.modifiedColors = new short[]{10, 12, 13223, 13223, 12, 13223};
                config.tradeable = true;
                break;
            case 25512:
                copy(11720, config);
                config.name = "<col=ff0000>Ultimate armadyl chestplate";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-22412, -22401, -22440, -22495, -22447, -22427, -22467, -22457, -22437, 7086, 7077, -11263, -27247, -22424, -22402, -27615, -27608, -27609, -27620, -27242, -22468, -22458, -22408, 7098, -27595, -27587, -27241, -27234, -27238, -22413, -27246, -22443, -22433, -22421, -22410, -27231, -27240, -22463, -27222, -27221, -27227, -27237, -22446, -22448, -22432, -22411, -22405, -27644, -27643, -27257, -22477, -22460, -27250, -22441, -22438, -27581, -27335, -27593, -27599, -27576, -27585, -27598, -27232, -22442, -27236, 7093, -22417, 7109, -22461, -22506, -22492, 7114, -22493, 7087, -22488, 7124, 7129, 7134, 7142, 7149, 7073, 7058, 7052, 7104, 7123, 7115, 7131, 7140, -22406, 7113, 7117, -27245, 7135, -27954, -27916, -22462, -22428, -22414, -22416, 7120, -27502, 12236, 20287, 22332, 31548, -31932};
                config.modifiedColors = new short[]{0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223};
                config.tradeable = true;
                break;
            case 25513:
                copy(71722, config);
                config.name = "<col=ff0000>Ultimate armadyl chainskirt";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{8650, -22440, -22489, -22448, 0, -22464, -22473, -22456};
                config.modifiedColors = new short[]{10, 5, 13223, 10, 12, 12, 12, 12};
                config.tradeable = true;
                break;
            case 25514:
                copy(25016, config);
                config.name = "<col=ff0000>Ultimate armadyl gloves";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-27246, 7081, -27260, -27237, 7101, 7090, -22455, -22441, -22427, -22410, 7093, -22424, 7104};
                config.modifiedColors = new short[]{10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 13223, 12, 13223};
                config.tradeable = true;
                break;
            case 25515:
                copy(25010, config);
                config.name = "<col=ff0000>Ultimate armadyl boots";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-22447, -27633, -27632, 7124, 7098, -22437, -17399, -17003, -17015, -27594, 7142, -17392, 7109, -22427, 7114, 7129, 7134, -22410, -22417, 7094, -22442, -22432, -22425, 7127, 7119, 7099, 7083};
                config.modifiedColors = new short[]{10, 10, 10, 13223, 13223, 10, 13223, 13223, 10, 10, 10, 13223, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13223, 12};
                config.tradeable = true;
                break;
            case 25516:
                copy(25013, config);
                config.name = "<col=ff0000>Ultimate armadyl buckler";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{7040, 7052, -22440, -22416, -22404, -22464, -22485, 7112, 7136, 7124, -27245, 7148, -22401, -22428, 7100, 7079, 7160, -27953, -27929, -27905, -22473, -22461, -22449, 7142, 7104, 7060};
                config.modifiedColors = new short[]{13223, 10, 10, 10, 10, 13223, 10, 10, 10, 10, 12, 13223, 12, 12, 12, 13223, 12, 12, 13223, 13223, 13223, 12, 12, 12, 13223, 13223};
                config.tradeable = true;
                break;
            case 25517:
                copy(24992, config);
                config.name = "<col=ff0000>Ultimate hood of subjugation";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-22515, -22525, -22502, -22521, -23548, -18423, -16371, -24538, -24544, -23523, -16382, -22513, -24530, -24537, -22499, -25565, -25545, -22511, -24520, -18417, -25530, -24513, -25555, -22505, -24550, -16361, -27381, 919, -26588, 928, 954, 4533, 4540, 4550, 4554, 674, 6788, 6798, 6, 1023};
                config.modifiedColors = new short[]{-19500, 10, 10, 10, 10, 10, 10, 10, 10, -19500, 0, 10, -19500, -19500, -19500, -19500, -19500, -19500, -19500, 10, -19500, -19500, -19500, -19500, -19500, -19500, -19500, -19500, -19500, -19500, -19500, -19500, -19500, 10, 10, -19500, 10, -19500, -19500, -19500};
                config.tradeable = true;
                break;
            case 25518:
                copy(24995, config);
                config.name = "<col=ff0000>Ultimate garb of subjugation";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-22515, -22525, -22511, -16361, 4551, 4540, -22505, -24550, -22499, -22502, -24544, -24538, 4555, -22519, -22521, -23548, -18421, -1906, -18423, -25600, -24576, -1900, -2925, -23537, -22509, -22518, -17369, -2922, -2920, -2892, -1899, -872, -1915, -1896, -868, -22482, -2914, -2910, -1890, -1893, -2917, -20468, -18417, -22479, -22508, -24518, -19416, -19431, -19421, -19411, -17359, -18348, 837, -18378, -17379, -18358, -18389, -18399, -18368, 677, 683, 674, -22468, -23523, -26557, -25565, -25540, 20287};
                config.modifiedColors = new short[]{0, 10, 10, 10, -19500, -19500, -19500, -19500, -19500, 10, -19500, -19500, -19500, 10, 10, 12, -19500, 12, 12, -19500, -19500, -19500, -19500, -19500, 12, 12, 12, 12, 12, 14, 14, 12, 12, 10, 10, -19500, 10, 10, 12, 10, -19500, -19500, 10, -19500, -19500, -19500, 10, 12, -19500, -19500, -19500, -19500, 14, 14, -19500, -19500, -19500, -19500, 12, -19500, 0, -19500, 10, 12, 14, -19500, -19500, -19500};
                config.tradeable = true;
                break;
            case 25519:
                copy(24998, config);
                config.name = "<col=ff0000>Ultimate gown of subjugation";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-2920, -2922, -2935, -22528, -22521, -2915, -2889, -25600, -22525, -22515, 4555, -22400, -25592, 4540, 4551, -22511, -16361, -18422, -16371, -19421, -17359, 685, 690, 676, 684, 688, -19411, -19425, -21464, -19390, -19383, -18356, -20410, 656, 665, 668, 670};
                config.modifiedColors = new short[]{14, 10, -19500, -19500, 10, 10, 10, -19500, -19500, 10, -19500, -19500, -19500, 10, 10, 12, 12, 12, 12, 10, 0, 10, 10, 10, 12, 12, 12, 12, 12, 14, 14, 12, 12, 10, 10, 12, 10};
                config.tradeable = true;
                break;
            case 25520:
                copy(25001, config);
                config.name = "<col=ff0000>Ultimate ward of subjugation";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-22492, 808, 845, -22515, -22494, -22486, -22499, -22501, -22475, -22513, -22506, -22456, -22498, -22490, -22503, 821, -22493, -22528, -22470, -22512, -22526, -22507};
                config.modifiedColors = new short[]{0, 10, 10, 10, 10, -19500, -19500, 10, 10, 10, 0, 10, 10, 10, 10, 12, 12, 12, -19500, -19500, -19500, -19500};
                config.tradeable = true;
                break;
            case 25521:
                copy(25004, config);
                config.name = "<col=ff0000>Ultimate boots of subjugation";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-24544, -22499, -24538, -25581, -23537, -22511, -22515, 4533, 4540, -16361, -24550, -22505};
                config.modifiedColors = new short[]{0, -19500, -19500, -19500, -19500, 12, 12, 12, 12, 10, 0, 10};
                config.tradeable = true;
                break;
            case 25522:
                copy(25007, config);
                config.name = "<col=ff0000>Ultimate gloves of subjugation";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{4540, 4551, 4555, -19446, -22511, -16361, -23537, -22515, -17379};
                config.modifiedColors = new short[]{-19500, -19500, 10, 10, 10, 12, 12, 12, 12};
                config.tradeable = true;
                break;
            case 25504:
                copy(16955, config);
                config.name = "<col=ffff00>Legendary lightning rapier";
                config.inventoryOptions[2] = "";
                config.originalColors = new short[]{-27633, -27638, -27643, -27608, -27568, -27628, -27613, -27618, -27623, -27648, -27639, -27636, -27641, -27631, -27632, -27637};
                config.modifiedColors = new short[]{7000, 930, 930, 0, 0, 930, 930, 930, 930, 930, 930, 6900, 6900, 6900, 6900, 6900};
                config.setSpecialBar();
                config.tradeable = true;
                break;
            case 1038:
            case 1040:
            case 1042:
            case 1044:
            case 1046:
            case 1048:
                config.value = 150000000 * -1375390745;
                break;
            case 19785:
            case 19787:
            case 19789:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(8839).value;
                break;
            case 19786:
            case 19788:
            case 19790:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(8840).value;
                break;
            case 23679:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(11694).value;
                break;
            case 23680:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(11696).value;
                break;
            case 23681:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(11698).value;
                break;
            case 23682:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(11700).value;
                break;
            case 23683:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(11716).value;
                break;
            case 23684:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(11718).value;
                break;
            case 23685:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(11720).value;
                break;
            case 23686:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(11722).value;
                break;
            case 23687:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(11724).value;
                break;
            case 23688:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(11726).value;
                break;
            case 23689:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(11728).value;
                break;
            case 23690:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(11730).value;
                break;
            case 23691:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(4151).value;
                break;
            case 23692:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(11335).value;
                break;
            case 23693:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(14479).value;
                break;
            case 23694:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(3140).value;
                break;
            case 23695:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(14484).value;
                break;
            case 23696:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(7158).value;
                break;
            case 23697:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(13738).value;
                break;
            case 23698:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(13740).value;
                break;
            case 23699:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(13742).value;
                break;
            case 23700:
                config.value = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(13744).value;
                break;
            case 53995:
                config.setAttackStyle(6);
                config.tradeable = true;
                break;
            case 52545:
                config.setAttackStyle(8);
                config.tradeable = true;
                break;
            case 52550:
                config.setAttackStyle(17);
                config.tradeable = true;
                break;
            case 52555:
                config.setAttackStyle(3);
                config.tradeable = true;
                break;
            case 51009: //dragon sword
            case 51028:
            case 51031:
                config.setSpecialBar();
                config.setAttackStyle(5);
                config.tradeable = true;
                break;
            case 53762:
                config.setSpecialBar();
                config.setAttackStyle(5);
                break;
            case 50849: //dragon thrownaxe
            case 52804:
            case 52806:
            case 52808:
            case 52810:
                config.setSpecialBar();
                config.setAttackStyle(17);
                config.tradeable = true;
                break;
            case 52325:
                config.setAttackStyle(22);
                config.tradeable = true;
                break;
            case 25476:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(52325), config);
                config.name = "Onyx blood scythe";
                config.maleModel2 = (68615) * 582597415;
                config.femaleModel2 = (68615) * -336299543;
                config.originalColors = new short[]{78, 967, 779, 24, 16, 33, 41, 49, 61, 20, 28, 37};
                config.modifiedColors = new short[]{0, 967, 0, 0, 0, 0, 0, 784, 796, 0, 0, 0};
                config.tradeable = true;
                config.setSpecialBar();
                break;
            case 25477:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(23874), config);
                config.name = "Wings of wealth";
                config.inventoryOptions[4] = "Drop";
                config.originalColors = new short[]{967, 779, -29539, 6825, 6891, 6835, 936};
                config.modifiedColors = new short[]{78, 0, 78, 100, 0, 78, 0};
                config.tradeable = true;
                break;
            case 25478:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(1603), config);
                config.name = "Onyx blood gem";
                config.tradeable = true;
                break;
            case 25523:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(51270), config);
                config.name = "Upgrade gem";
                config.inventoryOptions = new String[config.inventoryOptions.length];
                config.inventoryOptions[0] = "Teleport";
                config.inventoryOptions[4] = "Drop";
                config.originalColors = new short[]{10365, 478, 931, 918};
                config.modifiedColors = new short[]{7000, 7000, 7000, 7000};
                config.tradeable = true;
                break;
            case 51015: //Dinh's bulwark
                config.setSpecialBar();
                config.setAttackStyle(10);
                config.tradeable = true;
                break;
            case 41941:
            case 42791:
                config.settings = new LinkedArrayList(2);
                config.settings.method5817(new IntegerValue(1), 1397); //autokept on death
                break;
            case 15263:
                config.value = 500 * -1375390745;
                break;
            case 9040:
                config.value = 750 * -1375390745;
                break;
            case 9028:
                config.value = 1000 * -1375390745;
                break;
            case 9034:
                config.value = 1250 * -1375390745;
                break;
            case 20795:
                config.value = 1000 * -1375390745;
                break;
            case 20796:
                config.value = 10000 * -1375390745;
                break;
            case 20797:
            case 24454:
                config.value = 100000 * -1375390745;
                break;
            case 20798:
                config.value = 1000000 * -1375390745;
                break;
            case 20799:
                config.value = 3000000 * -1375390745;
                break;
            case 20800:
                config.value = 10000000 * -1375390745;
                break;
            case 24455:
            case 24456:
            case 24457:
                config.tradeable = true;
                config.value = 10000000 * -1375390745;
                break;
            case 43576://dragon warhammer
            case 51742: //granite hammer
                config.setSpecialBar();
                config.setAttackStyle(10);
                config.tradeable = true;
                break;
            case 52324:  //Ghrazi rapier
                config.setAttackStyle(5);
                config.tradeable = true;
                break;
            case 51003: //elder maul
                config.setAttackStyle(10);
                config.tradeable = true;
                break;
            case 51006: //kodai wand
                config.setAttackStyle(1);
                config.tradeable = true;
                break;
            case 15403:
            case 23674:
            case 41862: //black phat
            case 20120: //frozen key
            case 15426:
            case 14595:
            case 14596:
            case 14603:
            case 14602:
            case 14605:
            case 15422:
            case 15423:
            case 15425:
                config.inventoryOptions[4] = "Drop";
                config.tradeable = true;
                break;
            case 25037: //armadyl cbow
                config.setSpecialBar();
                break;
            case 51902:
                config.setAttackStyle(17);
                config.setSpecialBar();
                config.tradeable = true;
                break;
            case 51012:
                config.setAttackStyle(17);
                config.tradeable = true;
                break;
            case 42422:
                config.setAttackStyle(1);
                config.tradeable = true;
                break;
            case 42426: //3rd age longsword
            case 51646: //granite longsword
                config.setAttackStyle(6);
                config.tradeable = true;
                break;
            case 50011:
                config.setAttackStyle(2);
                config.tradeable = true;
                break;
            case 50014:
                config.setAttackStyle(4);
                config.tradeable = true;
                break;
            case 50727:
                config.setAttackStyle(2);
                config.tradeable = true;
                break;
            case 3150:
                config.stackable = 126481113;
                break;
            case 49675:
                config.setAttackStyle(6);
                config.setSpecialBar();
                break;
            case 24338: //royal crossbow
            case 14684:
            case 10887:
            case 19748:
                //halloween event
            case 9920:
            case 9921:
            case 9922:
            case 9923:
            case 9924:
            case 9225:
            case 43343:
            case 43344:
            case 43307:
                config.tradeable = true;
                config.inventoryOptions[4] = "Drop";
                break;
            case 23643:
                config.value = 50000 * -1375390745;
                break;
            case 41889: //zamorakian hasta
            case 52731:
            case 52734:
            case 52737:
            case 52740:
            case 52743:
                config.tradeable = true;
                config.setAttackStyle(14);
                config.setSpecialBar();
                break;
            case 52978:  //dragon hunter lance
                config.tradeable = true;
                config.setAttackStyle(14);
                break;
            //blisterwood
            case 21580:
            case 21582:
                config.value = 100 * -1375390745;
                break;
            case 21581:
                config.value = 1 * -1375390745;
                break;
            case 13157: //vyre corpse
                config.stackable = 126481113;
                break;
            case 25441: //twisted bow (u)
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(50997), config);
                config.name += " (u)";
                break;
            case 25442: //armadyl staff (u)
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(21777), config);
                config.name += " (u)";
                break;
            case 25443:
                config.name = "Shrimpy";
                config.model = Class15.aClass507_224.method6269(16002, 0).models[0] * -1019082089;
                break;
            case 25444:
                config.name = "Nexterminator";
                config.model = Class15.aClass507_224.method6269(16003, 0).models[0] * -1019082089;
                break;
            case 25445:
                config.name = "Queen black dragonling";
                config.model = Class15.aClass507_224.method6269(16004, 0).models[0] * -1019082089;
                break;
            case 25446:
                config.name = "Galvek pet";
                config.model = Class15.aClass507_224.method6269(16005, 0).models[0] * -1019082089;
                break;
            case 25454:
                config.name = "Drunken dwarf pet";
                config.model = Class15.aClass507_224.method6269(16007, 0).models[0] * -1019082089;
                break;
            case 25501:
                config.name = "Genie pet";
                config.model = Class15.aClass507_224.method6269(16028, 0).models[0] * -1019082089;
                break;
            case 25600:
                copy(1506, config);
                config.name = "Covid";
                //config.model =  Class15.aClass507_224.method6269(1506, 0).models[0] * -1019082089;
                break;
            case 25601:
                copy(9017, config);
                config.name = "Pet fairy queen";
                //config.model =  Class15.aClass507_224.method6269(1506, 0).models[0] * -1019082089;
                break;
            case 25602:
                copy(3257, config);
                config.name = "Lil'smokey";
                //config.model =  Class15.aClass507_224.method6269(1506, 0).models[0] * -1019082089;
                break;
            case 25603:
            case 25604:
            case 25605:
                copy(36696, config);
                config.name = "Mini callus";
                //config.model =  Class15.aClass507_224.method6269(1506, 0).models[0] * -1019082089;
                break;
            case 25606:
                copy(12476, config);
                config.name = "August 2020 top donator pet";
                //config.model =  Class15.aClass507_224.method6269(1506, 0).models[0] * -1019082089;
                break;
            case 25607:
                copy(53184, config);
                config.name = "Mimi";
                config.inventoryOptions[0] = null;
                config.inventoryOptions[1] = null;
                //config.model =  Class15.aClass507_224.method6269(1506, 0).models[0] * -1019082089;
                break;
            case 25608:
                copy(43510, config);
                config.name = "Superior slayer pet";
                config.inventoryOptions[0] = null;
                config.inventoryOptions[1] = null;
                //config.model =  Class15.aClass507_224.method6269(1506, 0).models[0] * -1019082089;
                break;
            case 25609:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(50997), config);
                config.name = "<col=FF0000>Psykotix Venom Rain";
                config.maleModel2 = (68615) * 582597415;
                config.femaleModel2 = (68615) * -336299543;
                config.originalColors = new short[]{ 967, 779,13223, 16, 8, 24, 33, 10318, 41, 10334, 0, 14236};
                config.modifiedColors = new short[]{ (short) 920  , (short) 5, 10, 915, 918, 922, 910, 913, 910, 8, 6, 5};
                break;
            case 25610:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(52318), config);
                config.name = "September 2020 top donator pet";
                config.originalColors = new short[] {6340,5281,2332,6315,103,6336,16,0,6323,18,-21608,};
                config.modifiedColors = new short[] {8, -17500, 10, 12, 67, 12, -17500, 10, -17500, 8, 0};
                break;
            case 25625:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(39940), config);
                config.name = "October 2020 top donator pet (Lucky)";
                config.originalColors = new short[] {78,5454,5462,5342,6563,5351,};
                config.modifiedColors = new short[] {
                        926,-11265,-11265,-11265,926,-11265};
                break;
            case 25633:
                copy(74484, config);
                config.name = "<col=800080>Dragonhunter claws";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{ 914, 922, 918, 934, 929};
                config.modifiedColors = new short[]{ 20150, 20000, 20150, 98, 95};
                config.tradeable = true;
                break;
            case 25632:
                copy(69016, config);
                config.name = "<col=800080>Olm's claw";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{ 97, 80, 64, 142};
                config.modifiedColors = new short[]{ 20150, 95, 95, 20000};
                config.tradeable = true;
                break;
            case 25631:
                copy(54463, config);
                config.name = "<col=ff6800>Tekton's blueprints";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{ -25301, -21874, -25062, 103};
                config.modifiedColors = new short[]{ 15, 20, 8125, 5056};
                config.tradeable = true;
                config.inventoryOptions = new String[]{null, null, null, null, "Drop"};
                break;
            case 25630:
                copy(73902, config);
                config.name = "<col=ff6800>Elder warhammer";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{ 5400, 5405, 6224, 6204, 5170, 7223, 5406, 7221, 7226, 7231, 7233, 7228, 7213, 7208, 5394, 5397, 5388, 5185, 5403};
                config.modifiedColors = new short[]{ 8125, 5056, 16, 5056, 8125, 5056, 0, 16, 20, 16, 20, 16, 8125, 5056, 0, 5056, 33, 20, 33};
                config.tradeable = true;
                break;
            case 25629:
                copy(8880, config);
                config.name = "<col=FF0000>Dragonshredder crossbow";
                config.value = 100000000 * -1375390745;
                //   config.originalColors = new short[]{ 29850, 29734, 29746, 4240, 29758, 29740, 4700, 4129, 4117, 29765, 4502, 10475, 49, 10471, 4141, 4161};
                //   config.modifiedColors = new short[]{ 20000, 20150, 16, 20150, 20000, 20150, 0, 16, 20, 16, 20, 16, 20000, 20150, 0, 20150};
                config.originalColors = new short[]{ 29850, 29734, 29746, 4240, 29758, 29740, 4700, 4129, 4117, 29765, 4502, 10475,    49, 10471, 4141, 4161};
                config.modifiedColors = new short[]{ 29850, 29734,    16,4240, 29758, 29740,    0,   16,   20,     16,  20,    16, 49, 10471,    0, 4161};
                config.addTexture(new int[] {29850, 29734, 4240, 29758, 29740, 10471, 4161}, 2247);
                config.tradeable = true;
                config.stackable = 0;
                break;
            case 25628:
                copy(73744, config);
                config.name = "Corrosive spirit shield";
                config.value = 5000000 * -1375390745;
                config.tradeable = true;
                config.originalColors = new short[]{ -20901, -20924, -20930, -20921, -20895, -20972, -20961, -20918, 105, -20966, -20933, 4495};
                config.modifiedColors = new short[]{ 5, 20000, 20000, 20000, 5, 20000, 20000, 20000, 20150, 20000, 20000, 20000};
                break;
            case 25627:
                copy(13752, config);
                config.name = "Corrosive sigil";
                config.value = 50000000 * -1375390745;
                config.tradeable = true;
                config.originalColors = new short[]{ -21335, -21351};
                config.modifiedColors = new short[]{ 20150, 20150};
                break;
            case 25626:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(299), config);
                config.name = "October 2020 top donator pet (Bigzy)";
                config.stackable = 0;
                config.originalColors = new short[] {-22248,9123,8090,};
                config.modifiedColors = new short[] {
                        8015,926,926,};
                config.inventoryOptions = new String[]{null, null, null, null, "Drop"};
                break;
            case 25502:
                copy(42926, config);
                config.name = "Infernal Blowpipe";
                config.tradeable = true;
                config.value = 10000000 * -1375390745;
                config.originalColors = new short[]{-31846, -31856, 29603, -31844, -31862, -31868, 29656, -17481, -16467,
                        -17491, -15422, -16453};
                config.modifiedColors = new short[]{4027, 666, 677, 5056, 788, 0, -32750, 687, -32738, 7104, 5056, 0};
                config.setSpecialBar();
                break;
            case 25455:
                copy(780, config);
                config.inventoryOptions[0] = "Repair";
                config.inventoryOptions[2] = "Info";
                config.name = "Pandora key fragment";
                config.tradeable = true;
                config.stackable = 126481113;
                break;
            case 25456:
                copy(6754, config);
                config.name = "Pandora key";
                config.inventoryOptions[0] = "Info";
                config.inventoryOptions[4] = "Drop";
                config.tradeable = true;
                config.stackable = 126481113;
                break;
            case 25457:
                config.name = "Coins pet";
                config.model = Class15.aClass507_224.method6269(27315, 0).models[0] * -1019082089;
                break;
            case 25461:
                config.name = "Ahrim pet";
                config.model = Class15.aClass507_224.method6269(16010, 0).models[0] * -1019082089;
                break;
            case 25462:
                config.name = "Dharok pet";
                config.model = Class15.aClass507_224.method6269(16015, 0).models[0] * -1019082089;
                break;
            case 25463:
                config.name = "Guthan pet";
                config.model = Class15.aClass507_224.method6269(16015, 0).models[0] * -1019082089;
                break;
            case 25464:
                config.name = "Karil pet";
                config.model = Class15.aClass507_224.method6269(16013, 0).models[0] * -1019082089;
                break;
            case 25465:
                config.name = "Torag pet";
                config.model = Class15.aClass507_224.method6269(16015, 0).models[0] * -1019082089;
                break;
            case 25466:
                config.name = "Verac pet";
                config.model = Class15.aClass507_224.method6269(16015, 0).models[0] * -1019082089;
                break;
            case 25467:
                config.name = "Onyx pet";
                config.model = Class15.aClass507_224.method6269(16016, 0).models[0] * -1019082089;
                break;
            case 25468:
                config.name = "Onyx pet";
                config.model = Class15.aClass507_224.method6269(16017, 0).models[0] * -1019082089;
                break;
            case 25482:
                config.name = "Onyx pet";
                config.model = Class15.aClass507_224.method6269(16023, 0).models[0] * -1019082089;
                break;
            case 25469: //ny bow hallowe
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(50997), config);
                config.name = "Twisted bow (New Year)";
                config.originalColors = new short[]{8, 24, 33, 41};
                config.modifiedColors = new short[]{926, 1100, 926, 926};
                config.tradeable = true;
                break;
            case 25533: //ny bow hallowe
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(50997), config);
                config.name = "Twisted bow Mk. II";
                config.maleModel2 = (68615) * 582597415;
                config.femaleModel2 = (68615) * -336299543;
                config.originalColors = new short[]{967, 779,
                        8, 24, 33, 41};
                config.modifiedColors = new short[]{(short) 356770, (short) 33,
                        8, 24, 33, 41
                };


                //config.originalColors = new short[]{ 78, 967, 779, 24, 16, 33, 41, 49, 61, 20, 28, 37};
                //config.modifiedColors = new short[]{ 0, 967, 0, 0, 0, 0, 0, 784,  796, 0, 0, 0};
                config.tradeable = true;
                break;
            case 25534:
                copy(50095, config);
                config.name = "<col=ff6800>Demonic Reaper's Mask";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{960};
                config.modifiedColors = new short[]{6075};
                config.tradeable = true;
                break;
            case 25535:
                copy(50098, config);
                config.name = "<col=ff6800>Demonic Reaper's Robe Top";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{960};
                config.modifiedColors = new short[]{6075};
                config.tradeable = true;
                break;
            case 25536:
                copy(50101, config);
                config.name = "<col=ff6800>Demonic Reaper's Gauntlets";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{960};
                config.modifiedColors = new short[]{6075};
                config.tradeable = true;
                break;
            case 25537:
                copy(50104, config);
                config.name = "<col=ff6800>Demonic Reaper's Robe Bottom";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{960};
                config.modifiedColors = new short[]{6075};
                config.tradeable = true;
                break;
            case 25538:
                copy(50107, config);
                config.name = "<col=ff6800>Demonic Reaper's Greaves";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{960};
                config.modifiedColors = new short[]{6075};
                config.tradeable = true;
                break;
            case 25539:
                copy(11235, config);
                config.name = "<col=ff6800>Demonic Reaper's Fang";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{10417, 3974, 3594, 2576, 2454, 1436, 1571, 1575, 6808, 7331};
                config.modifiedColors = new short[]{6075, 6075, -16116, 6075, 6075, -16116, -16116, 6075, 6075, 6075};
                config.tradeable = true;
                break;
            case 25540:
                copy(52325, config);
                config.name = "<col=ff6800>Demonic Reaper's Bane";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{24, 16, 790, 796, 784, 33, 41, 49, 536, 61, 78, 20, 28, 37};
                config.modifiedColors = new short[]{-16116, 6075, -16116, -16116, -16116, -16116, -16116, -16116, 6075, -16116, 6075, -16116, -16116, -16116};
                config.tradeable = true;
                break;
            case 25591:
                copy(52325, config);
                config.name = "<col=ffffff>Scythe of Shalit";
                config.value = 100000000 * -1375390745;
                config.maleModel2 = (68615) * 582597415;
                config.femaleModel2 = (68615) * -336299543;
                config.originalColors = new short[]{967, 779, 24, 16, 790, 796, 784, 33, 41, 49, 536, 61, 78, 20, 28, 37};
                config.modifiedColors = new short[]{(short) 50, (short) 10, 10, 125, 10, 10, 10, 10, 10, 10, 125, 10, 125, 10, 10, 10};
                config.tradeable = true;
                config.setSpecialBar();
                break;
            case 25592:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(50997), config);
                config.name = "<col=008080>Apologyse's Toxic Rain";
                config.maleModel2 = (68615) * 582597415;
                config.femaleModel2 = (68615) * -336299543;
                config.originalColors = new short[]{967, 779, 13223, 16, 8, 24, 33, 10318, 41, 10334, 0, 14236};
                config.modifiedColors = new short[]{(short) -19500, (short) -31856, -31846, -31856, 29603, -31844, -31862, -31868, 29656, -19500, -19500, -19500};
                config.setSpecialBar();
                break;
            case 25541:
                copy(42902, config);
                config.name = "<col=ff6800>Demonic Staff";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{-16116, 15405, 15902, 10448, 127, 10462, -10992, -10736, -10602, -10596, 78};
                config.modifiedColors = new short[]{-16116, 6000, 6050, 6075, 6100, 6125, 6125, 6150, 6150, 6150, 6150};
                config.setSpecialBar();
                config.tradeable = true;
                break;
            case 25544:
                copy(52550, config);
                config.name = "<col=E3E3E3>Night's End";
                config.value = 100000000 * -1375390745;
                config.originalColors = new short[]{-22440, 6736, 6709, -6087, 6602, -22242, -22225, 3346, 6699, -6099, -22448, -22431, 7124};
                config.modifiedColors = new short[]{10, -19500, -19500, -19500, -19500, 12, 14, -19500, -19500, -19500, 14, 12, -19500};
                config.tradeable = true;
                break;
            case 25543:
                copy(9920, config);
                config.name = "Flaming Jack-O-Lantern";
                break;
            case 25470: //looter neck
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(14599), config);
                config.name = "Looter's amulet";
                config.inventoryOptions[4] = "Drop";
                config.originalColors = new short[]{-30337, -30365, -30344, -30358, -30351};
                config.modifiedColors = new short[]{926, 1100, 926, 926, 1100};
                config.tradeable = true;
                config.inventoryOptions[2] = "Switch auto-loot";
                break;

            case 9683: //Skilling neck
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(14599), config);
                config.name = "Skilling amulet";
                config.inventoryOptions[4] = "Drop";
                config.inventoryOptions[2] = "Switch auto-loot";
                config.originalColors = new short[]{-30337, -30365, -30344, -30358, -30351};
                config.modifiedColors = new short[]{ 127, 21887, 24575, 21887, 25215};
                config.tradeable = true;
                break;

            case 25479: //looter neck
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(14599), config);
                config.name = "Looter's amulet of torture";
                config.inventoryOptions[4] = "Drop";
                config.inventoryOptions[2] = "Switch auto-loot";
                config.originalColors = new short[]{-30337, -30365, -30344, -30358, -30351};
                config.modifiedColors = new short[]{ 5056, 1100, 5056, 5056, 1100 };
                config.tradeable = true;
                break;
            case 25480: //looter neck
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(14599), config);
                config.name = "Looter's necklace of anguish";
                config.inventoryOptions[4] = "Drop";
                config.inventoryOptions[2] = "Switch auto-loot";
                config.originalColors = new short[]{-30337, -30365, -30344, -30358, -30351};
                config.modifiedColors = new short[]{3008, 1100, 3008, 3008, 1100};
                config.tradeable = true;
                break;
            case 25481:
                copy(1505, config);
                config.name = "Imbue scroll";
                config.tradeable = true;
                break;
           case 25739:
                copy(1505, config);
                config.name = "<col=800080>Infinity imbue scroll";
                config.tradeable = true;
                config.originalColors = new short[]{10351,7070};
                config.modifiedColors = new short[]{10351,7070};
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] += 50;
                break;
           case 25740: //25486
               copy(17291, config);
               config.name = "<col=800080>Infinity necklace (i)";
               config.inventoryOptions[4] = "Drop";
               config.inventoryOptions[2] = "Switch auto-loot";
               config.originalColors = new short[]{2826, 2816, 7241, 7221, 7214, 7234, 7236, 7256, 2836, 2863, 2831, 2851, 2841, 2843, 23, 9, 37, 7241, 7256, 7236, 7221, 2865, 2858, 2883, 2890, 2879, 2872, 7205, 7254, 7234, 2848, 2839, 2863, 2849, 2874, 7214};
               config.modifiedColors = config.originalColors.clone();
               for (int i = 0; i < config.modifiedColors.length; i++)
                   config.modifiedColors[i] += -1850;
               config.modifiedColors[0] = -22450;
               config.modifiedColors[1] = -22430;
               break;
           case 25741: //25488
               copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(49550), config);
               config.name = "<col=800080>Infinity ring (i)";

               config.originalColors = new short[]{3008, -22491, -22483, 5056};
               config.modifiedColors = new short[]{(short) 700, (short) 78, (short) 933, 933};
               break;
            case 25742:
                copy(11724, config);
                config.name = "<col=ff0000>Ultimate bandos chestplate (i)";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{61, 10306, 10295, 5181, 10312, 5190, 10320, 22, 7622, 4, 12, 7597, 10, 7574, 16, 40, 64, 3334, 3346, 7648, 7630, 7624, 10262, 10268, 7618, 10256, 1434, 1440, 1446, 45, 95, 91, 87, 83, 76, 1430, 1426, 1432, 1436, 1424, 1416, 1410, 1422, 82, 68, 2320, 53, 36, 88, 7589, 2328, 268, 8};
                config.modifiedColors = new short[]{5, 900, 942, 920, 5, 9523, 9515, 10502, 9523, 8076, 5, 7050, 142, 0, 5, 910, 5, 900, 942, 920, 5, 9523, 9515, 10502, 9523, 8076, 5, 7050, 142, 0, 5, 910, 5, 900, 942, 920, 5, 9523, 9515, 10502, 9523, 8076, 5, 7050, 142, 0, 5, 910, 5, 900, 942, 920, 5};
                config.tradeable = true;
                break;
            case 25743:
                copy(71726, config);
                config.name = "<col=ff0000>Ultimate bandos tassets (i)";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{163, 39, 8390, 9523, 24, 29, 34, 22};
                config.modifiedColors = new short[]{9500, 5, 920, 9523, 24, 29, 34, 9};
                config.tradeable = true;
                break;
            case 25744:
                copy(25022, config);
                config.name = "<col=ff0000>Ultimate bandos helmet (i)";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{5254, 5281, 5287, 5267, 5260, 5248, 5318, 5280, 5294, 5276, 5306, 9011, 5265, 9040, 5279, 5288, 5283, 5366, 5357, 5353, 5326, 5302, 5324, 5310, 2992};
                config.modifiedColors = new short[]{942, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 942, 10, 942, 920, 920, 920, 942, 920, 942, 920, 920, 942};
                config.tradeable = true;
                break;
            case 25745:
                copy(25025, config);
                config.name = "<col=ff0000>Ultimate bandos gloves (i)";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{4632, 4622, 4617, 4637, 4627, 4654};
                config.modifiedColors = new short[]{920, 5, 920, 920, 10, 10};
                config.tradeable = true;
                break;
            case 25746:
                copy(71728, config);
                config.name = "<col=ff0000>Ultimate bandos boots (i)";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{10291, 22, 6550};
                config.modifiedColors = new short[]{920, 10, 6550};
                config.tradeable = true;
                break;
            case 25747:
                copy(25019, config);
                config.name = "<col=ff0000>Ultimate bandos warshield (i)";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{127, 4003, 4272, 4232, 4256, 4254, 4291, 4332, 4312, 4300, 4288, 4276, 4268, 4283, 4271, 4242, 4261, 18969, 4305, 4260, 4284, 4302, 4286, 4250, 4278, 5394, 10508, 4238, 4262, 5418, 4274, 5386};
                config.modifiedColors = new short[]{942, 10, 942, 10, 942, 10, 10, 10, 942, 10, 942, 10, 10, 942, 10, 942, 10, 942, 10, 10, 10, 942, 10, 942, 10, 10, 942, 10, 942, 10, 942, 10};
                config.tradeable = true;
                break;
            case 25748:
                copy(71718, config);
                config.name = "<col=ff0000>Ultimate armadyl helmet (i)";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-22452, -22460, -22506, 8650, -22456, -22448};
                config.modifiedColors = new short[]{10, 12, 13223, 13223, 12, 13223};
                config.tradeable = true;
                break;
            case 25749:
                copy(11720, config);
                config.name = "<col=ff0000>Ultimate armadyl chestplate (i)";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-22412, -22401, -22440, -22495, -22447, -22427, -22467, -22457, -22437, 7086, 7077, -11263, -27247, -22424, -22402, -27615, -27608, -27609, -27620, -27242, -22468, -22458, -22408, 7098, -27595, -27587, -27241, -27234, -27238, -22413, -27246, -22443, -22433, -22421, -22410, -27231, -27240, -22463, -27222, -27221, -27227, -27237, -22446, -22448, -22432, -22411, -22405, -27644, -27643, -27257, -22477, -22460, -27250, -22441, -22438, -27581, -27335, -27593, -27599, -27576, -27585, -27598, -27232, -22442, -27236, 7093, -22417, 7109, -22461, -22506, -22492, 7114, -22493, 7087, -22488, 7124, 7129, 7134, 7142, 7149, 7073, 7058, 7052, 7104, 7123, 7115, 7131, 7140, -22406, 7113, 7117, -27245, 7135, -27954, -27916, -22462, -22428, -22414, -22416, 7120, -27502, 12236, 20287, 22332, 31548, -31932};
                config.modifiedColors = new short[]{0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223, 13223, 12, 0, 0, 4550, 10, 13223, 13223, 12, 13223};
                config.tradeable = true;
                break;
            case 25750:
                copy(71722, config);
                config.name = "<col=ff0000>Ultimate armadyl chainskirt (i)";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{8650, -22440, -22489, -22448, 0, -22464, -22473, -22456};
                config.modifiedColors = new short[]{10, 5, 13223, 10, 12, 12, 12, 12};
                config.tradeable = true;
                break;
            case 25751:
                copy(25016, config);
                config.name = "<col=ff0000>Ultimate armadyl gloves (i)";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-27246, 7081, -27260, -27237, 7101, 7090, -22455, -22441, -22427, -22410, 7093, -22424, 7104};
                config.modifiedColors = new short[]{10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 13223, 12, 13223};
                config.tradeable = true;
                break;
            case 25752:
                copy(25010, config);
                config.name = "<col=ff0000>Ultimate armadyl boots (i)";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-22447, -27633, -27632, 7124, 7098, -22437, -17399, -17003, -17015, -27594, 7142, -17392, 7109, -22427, 7114, 7129, 7134, -22410, -22417, 7094, -22442, -22432, -22425, 7127, 7119, 7099, 7083};
                config.modifiedColors = new short[]{10, 10, 10, 13223, 13223, 10, 13223, 13223, 10, 10, 10, 13223, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13223, 12};
                config.tradeable = true;
                break;
            case 25753:
                copy(25013, config);
                config.name = "<col=ff0000>Ultimate armadyl buckler (i)";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{7040, 7052, -22440, -22416, -22404, -22464, -22485, 7112, 7136, 7124, -27245, 7148, -22401, -22428, 7100, 7079, 7160, -27953, -27929, -27905, -22473, -22461, -22449, 7142, 7104, 7060};
                config.modifiedColors = new short[]{13223, 10, 10, 10, 10, 13223, 10, 10, 10, 10, 12, 13223, 12, 12, 12, 13223, 12, 12, 13223, 13223, 13223, 12, 12, 12, 13223, 13223};
                config.tradeable = true;
                break;
            case 25754:
                copy(24992, config);
                config.name = "<col=ff0000>Ultimate hood of subjugation (i)";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-22515, -22525, -22502, -22521, -23548, -18423, -16371, -24538, -24544, -23523, -16382, -22513, -24530, -24537, -22499, -25565, -25545, -22511, -24520, -18417, -25530, -24513, -25555, -22505, -24550, -16361, -27381, 919, -26588, 928, 954, 4533, 4540, 4550, 4554, 674, 6788, 6798, 6, 1023};
                config.modifiedColors = new short[]{-19500, 10, 10, 10, 10, 10, 10, 10, 10, -19500, 0, 10, -19500, -19500, -19500, -19500, -19500, -19500, -19500, 10, -19500, -19500, -19500, -19500, -19500, -19500, -19500, -19500, -19500, -19500, -19500, -19500, -19500, 10, 10, -19500, 10, -19500, -19500, -19500};
                config.tradeable = true;
                break;
            case 25755:
                copy(24995, config);
                config.name = "<col=ff0000>Ultimate garb of subjugation (i)";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-22515, -22525, -22511, -16361, 4551, 4540, -22505, -24550, -22499, -22502, -24544, -24538, 4555, -22519, -22521, -23548, -18421, -1906, -18423, -25600, -24576, -1900, -2925, -23537, -22509, -22518, -17369, -2922, -2920, -2892, -1899, -872, -1915, -1896, -868, -22482, -2914, -2910, -1890, -1893, -2917, -20468, -18417, -22479, -22508, -24518, -19416, -19431, -19421, -19411, -17359, -18348, 837, -18378, -17379, -18358, -18389, -18399, -18368, 677, 683, 674, -22468, -23523, -26557, -25565, -25540, 20287};
                config.modifiedColors = new short[]{0, 10, 10, 10, -19500, -19500, -19500, -19500, -19500, 10, -19500, -19500, -19500, 10, 10, 12, -19500, 12, 12, -19500, -19500, -19500, -19500, -19500, 12, 12, 12, 12, 12, 14, 14, 12, 12, 10, 10, -19500, 10, 10, 12, 10, -19500, -19500, 10, -19500, -19500, -19500, 10, 12, -19500, -19500, -19500, -19500, 14, 14, -19500, -19500, -19500, -19500, 12, -19500, 0, -19500, 10, 12, 14, -19500, -19500, -19500};
                config.tradeable = true;
                break;
            case 25756:
                copy(24998, config);
                config.name = "<col=ff0000>Ultimate gown of subjugation (i)";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-2920, -2922, -2935, -22528, -22521, -2915, -2889, -25600, -22525, -22515, 4555, -22400, -25592, 4540, 4551, -22511, -16361, -18422, -16371, -19421, -17359, 685, 690, 676, 684, 688, -19411, -19425, -21464, -19390, -19383, -18356, -20410, 656, 665, 668, 670};
                config.modifiedColors = new short[]{14, 10, -19500, -19500, 10, 10, 10, -19500, -19500, 10, -19500, -19500, -19500, 10, 10, 12, 12, 12, 12, 10, 0, 10, 10, 10, 12, 12, 12, 12, 12, 14, 14, 12, 12, 10, 10, 12, 10};
                config.tradeable = true;
                break;
            case 25757:
                copy(25001, config);
                config.name = "<col=ff0000>Ultimate ward of subjugation (i)";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-22492, 808, 845, -22515, -22494, -22486, -22499, -22501, -22475, -22513, -22506, -22456, -22498, -22490, -22503, 821, -22493, -22528, -22470, -22512, -22526, -22507};
                config.modifiedColors = new short[]{0, 10, 10, 10, 10, -19500, -19500, 10, 10, 10, 0, 10, 10, 10, 10, 12, 12, 12, -19500, -19500, -19500, -19500};
                config.tradeable = true;
                break;
            case 25758:
                copy(25004, config);
                config.name = "<col=ff0000>Ultimate boots of subjugation (i)";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{-24544, -22499, -24538, -25581, -23537, -22511, -22515, 4533, 4540, -16361, -24550, -22505};
                config.modifiedColors = new short[]{0, -19500, -19500, -19500, -19500, 12, 12, 12, 12, 10, 0, 10};
                config.tradeable = true;
                break;
            case 25759:
                copy(25007, config);
                config.name = "<col=ff0000>Ultimate gloves of subjugation (i)";
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{4540, 4551, 4555, -19446, -22511, -16361, -23537, -22515, -17379};
                config.modifiedColors = new short[]{-19500, -19500, 10, 10, 10, 12, 12, 12, 12};
                config.tradeable = true;
                break;
            case 25760:
                copy(1505, config);
                config.name = "<col=800080>Bandos imbue scroll";
                config.tradeable = true;
                config.originalColors = new short[]{10351,7070};
                config.modifiedColors = new short[]{10351,7070};
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] += 50;
                break;
            case 25761:
                copy(1505, config);
                config.name = "<col=800080>Armadyl imbue scroll";
                config.tradeable = true;
                config.originalColors = new short[]{10351,7070};
                config.modifiedColors = new short[]{10351,7070};
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] += 50;
                break;
            case 25762:
                copy(1505, config);
                config.name = "<col=800080>Subjugation imbue scroll";
                config.tradeable = true;
                config.originalColors = new short[]{10351,7070};
                config.modifiedColors = new short[]{10351,7070};
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] += 50;
                break;
            case 25483:
                copy(14646, config);
                config.name = "Soul stone";
                config.stackable = 0;
                break;
            case 25484: //combo with occult
                copy(6585, config);
                config.name = "Soul necklace";
                config.originalColors = new short[]{-22372, -22462, -22510, 0, -22450};
                config.modifiedColors = new short[]{(short) 491770, (short) 34770, (short) 491770, (short) 34770, (short) 491770};
                config.tradeable = true;
                break;
            case 25485:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(14599), config);
                config.name = "Looter's soul necklace";
                config.inventoryOptions[4] = "Drop";
                config.inventoryOptions[2] = "Switch auto-loot";
                config.originalColors = new short[]{-30337, -30365, -30344, -30358, -30351};
                config.modifiedColors = new short[]{(short) 34770, (short) 491770, (short) 34770, (short) 34770, (short) 491770};
                config.tradeable = true;
                break;
            case 25486:
                copy(17291, config);
                config.name = "Infinity necklace";
                config.inventoryOptions[4] = "Drop";
                config.inventoryOptions[2] = "Switch auto-loot";
                config.originalColors = new short[]{2826, 2816, 7241, 7221, 7214, 7234, 7236, 7256, 2836, 2863, 2831, 2851, 2841, 2843, 23, 9, 37, 7241, 7256, 7236, 7221, 2865, 2858, 2883, 2890, 2879, 2872, 7205, 7254, 7234, 2848, 2839, 2863, 2849, 2874, 7214};
                config.modifiedColors = config.originalColors.clone();
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] += -1850;
                config.modifiedColors[0] = -22450;
                config.modifiedColors[1] = -22430;
                config.tradeable = true;
                break;
            case 25487:
                config.name = "Combat dummy pet";
                config.model = Class15.aClass507_224.method6269(16024, 0).models[0] * -1019082089;
                break;
            case 25488:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(49550), config);
                config.name = "Infinity ring";

                config.originalColors = new short[]{3008, -22491, -22483, 5056};
                config.modifiedColors = new short[]{(short) 700, (short) 78, (short) 933, 933};
                config.tradeable = true;
                break;
            case 25471:
                config.name = "Nomad pet";
                config.model = Class15.aClass507_224.method6269(16019, 0).models[0] * -1019082089;
                break;
            case 25474:
                config.name = "Sotetseg pet";
                config.model = Class15.aClass507_224.method6269(16021, 0).models[0] * -1019082089;
                break;
            case 25475:
                config.name = "Avatar of Creation pet";
                config.model = Class15.aClass507_224.method6269(16022, 0).models[0] * -1019082089;
                break;
            case 25472:
                copy(12183, config);
                config.name = "<col=00cc00>Donator Shards";
                config.originalColors = new short[]{7406};
                config.modifiedColors = new short[]{926};
                config.tradeable = false;
                break;
            case 25447:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(3706), config);
                config.name = "Aura token";
                config.stackable = 126481113;
                config.tradeable = true;
                config.inventoryOptions[4] = "Drop";
                break;
            case 25448:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(1633), config);
                config.name = "Crushed sapphire";
                config.value = 3000 * -1375390745;
                config.tradeable = true;
                break;
            case 25449:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(1633), config);
                config.name = "Crushed emerald";
                config.value = 3750 * -1375390745;
                config.tradeable = true;
                break;
            case 25450:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(1633), config);
                config.name = "Crushed ruby";
                config.value = 4500 * -1375390745;
                config.tradeable = true;
                break;
            case 25451:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(1633), config);
                config.name = "Crushed diamond";
                config.value = 6000 * -1375390745;
                config.tradeable = true;
                break;
            case 25452:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(1633), config);
                config.name = "Crushed onyx";
                config.value = 7500 * -1375390745;
                config.tradeable = true;
                break;
            case 25473:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(1633), config);
                config.name = "Crushed zenyte";
                config.value = 9000 * -1375390745;
                config.tradeable = true;
                break;
            case 25453: //god mystery box
                copy(6199, config);
                config.name = "God Mystery Box";
                config.tradeable = true;
                config.value = 15000000 * -1375390745;
                config.modifiedColors[0] = 24000;
                break;
            case 25763: // aura mystery box
                copy(10025, config);
                config.name = "Aura Mystery Box";
                config.tradeable = true;
                config.value = 50000 * -1375390745;
                config.inventoryOptions[0] = "Open";
                config.inventoryOptions[1] = "Quick-open";
                config.inventoryOptions[2] = "Preview";
                config.stackable = 126481113;
                break;
            case 25764:
                copy(52323, config);
                config.name = "Lucien's staff";
                config.tradeable = true;
                //config.printModelColors = true;
                config.originalColors = new short[] {3127,24,28,156,20,3140,49,142,33,836,41,57,16,284,37,};
                config.modifiedColors = new short[] {
                        6075,6075,6075,6075,6075,6075,-1805,7116,7116,2894,7116,-241,7116,7116,9461,};
                break;
            case 25765:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(51270), config);
                config.name = "Lucien empowered gem";
                config.inventoryOptions = new String[config.inventoryOptions.length];
                config.inventoryOptions[4] = "Drop";
                config.originalColors = new short[]{10365, 478, 931, 918};
                config.modifiedColors = new short[]{6075, 6075, 6075, 6075};
                config.tradeable = true;
                break;
            case 25458:
                copy(15378, config);
                config.name = "Barrow token";
                config.inventoryOptions[4] = "Drop";
                config.tradeable = true;
                config.stackable = 126481113;
                break;
            case 25459:
                copy(5023, config);
                config.name = "Vote ticket";
                config.inventoryOptions[4] = "Drop";
                config.stackable = 126481113;
                config.tradeable = true;
                break;
            case 25460: //twisted bow hallowe
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(50997), config);
                config.name = "Twisted bow (Halloween)";
                config.originalColors = new short[]{8, 24, 33, 41};
                config.modifiedColors = new short[]{6075, 7116, 6075, 6075};
                config.tradeable = true;
                break;
            case 50997: //twisted bow
            case 42424: //3rd age bow
                config.tradeable = true;
                config.setAttackStyle(17);
                break;
            case 42808:
                config.settings = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(11730).settings;
                config.tradeable = true;
                break;
            case 42809:
                config.settings = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(11730).settings;
                break;
            case 42788: //magic shortbow (i)
                config.settings = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(861).settings;
                config.tradeable = true;
                break;
            case 49669://redwood
                config.tradeable = true;
                config.inventoryOptions[0] = "Craft";
                config.inventoryOptions[1] = "Light";
                break;
            case 49496://uncut zenyte
            case 43383: //xerican fabric
                config.tradeable = true;
                config.inventoryOptions[0] = "Craft";
                break;
            case 52826:
            case 52829:
            case 52832:
            case 52835:
                config.inventoryOptions[0] = "Gut";
                config.tradeable = true;
                break;
            case 49478:
            case 49481:
                config.setAttackStyle(17);
                config.setSpecialBar();
                config.tradeable = true;
                break;
            case 53622:
                System.out.println((config.maleModel1 * 1343198193) + "   " + config.maleModel2* 34210967 + "    " + config.maleModel3* 1313278521);
                break;
            case 43241: //infernal axe
            	   config.settings = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(6739).settings;
                   break;
            case 53673:
            	config.inventoryOptions[3] = "Add-to-toolbelt";
                config.settings = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(6739).settings;
                break;
            case 43243: //infernal pickaxe
            	   config.settings = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(15259).settings;
                   break;
            case 53680:
                config.settings = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(15259).settings;
                config.inventoryOptions[3] = "Add-to-toolbelt";
                break;
            case 43263:
                config.setAttackStyle(10);
                config.setSpecialBar();
                config.tradeable = true;
                break;
            case 42899://trident of the swamp
            case 42900:
                config.setAttackStyle(28);
                if (id == 42900)
                    config.tradeable = true;
                break;
            case 41905:
            case 41908:
            case 52323:
                config.setAttackStyle(28);
                config.tradeable = true;
                break;

            case 25496:
                copy(52323, config);
                config.name = "Empowered sanguinesti staff";
                config.tradeable = true;
                break;
            case 25497:
                copy(13750, config);
                config.name = "Almighty sigil";
                config.value = 50000000 * -1375390745;
                config.tradeable = true;
                config.originalColors = new short[]{ -29527, -29539};
                config.modifiedColors = new short[]{ 100, 100};
                break;

            case 25498:
                copy(964, config);
                config.name = "Corrupted curse";
                config.value = 20000000 * -1375390745;
                config.tradeable = true;
                config.inventoryOptions[4] = "Drop";
                break;
            case 25499:
                copy(15492, config);
                config.name = "Eternal slayer helmet";
                config.value = 5000000 * -1375390745;
                config.originalColors = new short[]{930, -26624, -26334, -26319, -26329, -26324, -26354, -26339, -26359, -26357, -26356, -26314, -26358, -26549, -26604, -26606, -26619, -26562, 8426, 8406, 8396, 8386, 8346, -26341, 8416, 8376, 8366, 8326, 8436, -26368, -26355, -25709, -25697, -26614, -26595, -26559, -26592, -26569, -26589, -26596, -26579, -26573, -26587, -26577, -26622, -26599, -26594, -26623, -26574, -26609, -25718, -25706, -25660, -25654, -25688, -26603, 923, 948, -26601, -25639, -25633, -26585};
                config.modifiedColors = new short[]{0, 865, 0, 0, 0, 0, 0, 30, -30, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 30, 40, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 30, 40, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 30, 40, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 30, 40, 0, 0, 0, 20, 0};
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] += 50;
                break;
            case 25500:
                copy(8921, config);
                config.inventoryOptions = new String[]{null, null, null, null, "Drop"};
                config.name = "Eternal slayer enchantment";
                config.tradeable = true;
                config.originalColors = new short[]{10378, 10258};
                config.modifiedColors = new short[]{967, 0};
                break;
            case 52516: //dawnbringer
                config.setAttackStyle(28);
                config.setSpecialBar();
                config.tradeable = true;
                break;
            case 41907:
                config.setAttackStyle(28);
                break;
            case 42000:
                config.setAttackStyle(26);
                config.tradeable = true;
                break;
            case 42006:
                config.setAttackStyle(11);
                config.setSpecialBar();
                break;
            case 42926:
                config.setAttackStyle(18);
                config.setSpecialBar();
                break;
            case 42904:
                config.setAttackStyle(26);
                config.setSpecialBar();
                break;
            case 41791:
            case 42902:
                config.setAttackStyle(26);
                config.setSpecialBar();
                config.tradeable = true;
                break;
	/*	case 43387:  //xeric body
			config.tradeable = true;
			ItemConfig fake = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(3793 + (Class477.OLD_ITEMS ?  Settings._685_ITEM_OFFSET : 0));
			config.maleModel1 = fake.maleModel1;
			config.femaleModel1 = fake.femaleModel1;
			config.anInt5737 = fake.anInt5737;
			config.anInt5746 = fake.anInt5746;
			config.originalColors = fake.originalColors.clone();
			config.modifiedColors = fake.modifiedColors.clone();
			break;*/
		/*case 51301: //obsidan pl8
			//[10283, 10277]
			config.tradeable = true;
			fake = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(10564 + (Class477.OLD_ITEMS ?  Settings._685_ITEM_OFFSET : 0));
			config.maleModel1 = fake.maleModel1;
			config.femaleModel1 = fake.femaleModel1;
			config.anInt5737 = fake.anInt5737;
			config.anInt5746 = fake.anInt5746;
			//[24, 20, 28, 943, 530, 152]
			config.originalColors = new short[]{10283, 10277};
			config.modifiedColors = new short[]{943, 530};
			break;*/
		/*case 50517: //elder gear top
			config.tradeable = true;
			fake = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(1035 + Settings._685_ITEM_OFFSET);
			config.maleModel1 = fake.maleModel1;
			config.femaleModel1 = fake.femaleModel1;
			config.anInt5737 = fake.anInt5737;
			config.anInt5746 = fake.anInt5746;
			config.originalColors = fake.originalColors;
			config.modifiedColors = fake.modifiedColors;
			break;*/
            case 41959: //black chincompa
                config.tradeable = true;
                config.setAttackStyle(19);
                break;
            case 43204: //platinum coins
            	 config.tradeable = true;
            	 config.inventoryOptions[3] = "Add-to-pouch";
                 break;
            case 42004:
            case 42775: //teleports
            case 42776:
            case 42777:
            case 42778:
            case 42779:
            case 42780:
            case 42781:
            case 42782:
            case 42601: //ring of the gods
            case 42603: //ring of the gods
            case 42605: //ring of the gods
            case 41990: //fedora
            case 41924:
            case 41926:
            case 41928:
            case 41929:
            case 41930:
            case 41931:
            case 41932:
            case 41933:
            case 41934: //dark crab
            case 41940:
            case 49484: //dragon javelin
            case 49486:
            case 49488:
            case 49490:
            case 49570: //javelin heads
            case 49572:
            case 49574:
            case 49576:
            case 49578:
            case 49580:
            case 49582:
            case 49584: //javelin shaft
            case 41992:
            case 41994:
            case 41951: //extended antifires
            case 41953:
            case 41955:
            case 41957:
            case 50520:
            case 50595:
            case 49707: //amulet of eternal glory
            case 42927:
            case 42929:
            case 42924:
            case 42922:
            case 42932:
            case 42938:
            case 41943:
            case 43227: //cerberus
            case 43229:
            case 43231:
            case 43233:
            case 43235:
            case 43237:
            case 43239:
            case 49493://zenyte
            case 49538:
            case 49535:
            case 49541:
            case 49532:
            case 49550:
            case 49547:
            case 49553:
            case 49544:
            case 42934: //zulrah scales
            case 43439: //raw angler fish
            case 43431: //sand worms
            case 51298: //obsidian helmet
            case 51301:
            case 51304: //obsidian legs
            case 52111: //dragonbone neck
            case 51952: //magic stock
            case 51918: //dragon limbs
            case 51921: //dragon cbow (u)
            case 52124: //superior dragon bone
            case 52003: //dragonfire ward
            case 51634: //skeletal ward
            case 51880: //wrath rune
            case 51930: //dragon bolts unf
            case 51905: //dragon bolts
            case 51924:
            case 51926:
            case 51928:
            case 51932:
            case 51934:
            case 51936:
            case 51938:
            case 51940:
            case 51942:
	/*	case 51944:
		case 51946:
		case 51948:*/
            case 51950:
            case 51955:
            case 51957:
            case 51959:
            case 51961:
            case 51963:
            case 51965:
            case 51967:
            case 51969:
            case 51971:
            case 51973:
            case 53037: //boots of stone
            case 52951: //boots of brimestone
            case 52975: //brimstone ring
            case 52954: //devout boots
            case 52988: //hydra tail
            case 52981: //ferocious gloves
            case 52966: //hydra claw
                config.tradeable = true;
                break;
            case 42002: //occult neck
                config.tradeable = true;
                break;
            case 43092: //crystal hally
                copy(53987, config);
                config.setSpecialBar();
                config.setAttackStyle(15);
                config.value = 2225000 * -1375390745;
                break;
            case 43265: //abyssal dagger
            case 43267:
            case 43269:
            case 43271:
                config.tradeable = true;
                config.setSpecialBar();
                config.setAttackStyle(5);
                break;

            case 6199: //mystery box
            case 6199 + Settings._685_ITEM_OFFSET:
                config.name = "Super " + config.name.toLowerCase();
                config.tradeable = true;
                config.value = 5000000 * -1375390745;
                config.inventoryOptions[1] = "Quick-open";
                config.inventoryOptions[2] = "Preview";
                config.stackable = 126481113;
                config.modifiedColors[0] = 7000;
                break;

            case 36199: //mystery box
            case 36199 + Settings._685_ITEM_OFFSET:
                copy(6199, config);
                config.name = "Voting Box";
                config.tradeable = true;
                config.value = 500000 * -1375390745;
                config.inventoryOptions[1] = "Quick-open";
                config.inventoryOptions[2] = "Preview";
                config.stackable = 126481113;
                config.modifiedColors[0] = (short) 36479;
                break;

            case 9699: //mystery box
            case 9699 + Settings._685_ITEM_OFFSET:
                copy(6199, config);
                config.name = "Weapon Box";
                config.tradeable = true;
                config.value = 500000 * -1375390745;
                config.inventoryOptions[1] = "Quick-open";
                config.inventoryOptions[2] = "Preview";
                config.stackable = 126481113;
                config.modifiedColors[0] = 5119;
                break;

            case 9700: //mystery box
            case 9700 + Settings._685_ITEM_OFFSET:
                copy(6199, config);
                config.name = "Armour Box";
                config.printModelColors = true;
                config.tradeable = true;
                config.value = 500000 * -1375390745;
                config.inventoryOptions[1] = "Quick-open";
                config.inventoryOptions[2] = "Preview";
                config.stackable = 126481113;
                config.modifiedColors[0] = (short) 926;
                break;


            case 2436:
            case 2440:
            case 2442:
            case 2444:
            case 3040:
            case 2452:
            case 3024:
            case 6685:
            case 2434:
            case 12140:
                config.value *= 25;
                break;
            //bolts
            case 9140:
                config.value = 20 * -1375390745;
                break;
            case 9141:
                config.value = 40 * -1375390745;
                break;
            case 9142:
                config.value = 76 * -1375390745;
                break;
            case 9143:
                config.value = 172 * -1375390745;
                break;
            case 9144:
                config.value = 510 * -1375390745;
                break;
            case 10498:
                config.value = 5000 * -1375390745;
                break;
            case 10499:
                config.value = 50000 * -1375390745;
                break;
            case 20068:
                config.value = 100000 * -1375390745;
                break;
            case 3105:
                config.value = 12 * -1375390745;
                break;
            case 385: //shark
                config.value = 2000 * -1375390745;
                break;
            case 43441:
                config.tradeable = true;
                config.value = 5000 * -1375390745;
                break;
            case 15272:
                config.value = 5000 * -1375390745;
                break;
            case 41936:
                config.tradeable = true;
                config.value = 3000 * -1375390745;
                break;
            case 391:
                config.value = 3000 * -1375390745;
                break;
            case 7946: //monkfish
                config.value = 600 * -1375390745;
                break;
            case 12936: //leather coifs
            case 12943:
            case 12950:
            case 12957:
            case 24388:
                config.name = config.name.replace(" 100", "");
                config.tradeable = true;
                break;
            case 15432: //nomad capes
            case 15433:
                config.value = 100000 * -1375390745;
                break;
            case 7461: //dragon gloves
                config.value = 50000 * -1375390745;
                break;
            //25354+  custom
            case 25354:
                config.name = "Attack master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100000 * -1019082089;
                config.maleModel1 = 100000 * -1612514031;
                config.femaleModel1 = 100000 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25355:
                config.name = "Defence master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100001 * -1019082089;
                config.maleModel1 = 100001 * -1612514031;
                config.femaleModel1 = 100001 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25356:
                config.name = "Strength master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100002 * -1019082089;
                config.maleModel1 = 100002 * -1612514031;
                config.femaleModel1 = 100002 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25357:
                config.name = "Constitution master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100003 * -1019082089;
                config.maleModel1 = 100003 * -1612514031;
                config.femaleModel1 = 100003 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25358:
                config.name = "Ranged master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100004 * -1019082089;
                config.maleModel1 = 100004 * -1612514031;
                config.femaleModel1 = 100004 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25359:
                config.name = "Prayer master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100005 * -1019082089;
                config.maleModel1 = 100005 * -1612514031;
                config.femaleModel1 = 100005 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25360:
                config.name = "Magic master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100006 * -1019082089;
                config.maleModel1 = 100006 * -1612514031;
                config.femaleModel1 = 100006 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25361:
                config.name = "Cooking master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100007 * -1019082089;
                config.maleModel1 = 100007 * -1612514031;
                config.femaleModel1 = 100007 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25362:
                config.name = "Woodcutting master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100008 * -1019082089;
                config.maleModel1 = 100008 * -1612514031;
                config.femaleModel1 = 100008 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25363:
                config.name = "Fletching master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100009 * -1019082089;
                config.maleModel1 = 100009 * -1612514031;
                config.femaleModel1 = 100009 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25364:
                config.name = "Fishing master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100010 * -1019082089;
                config.maleModel1 = 100010 * -1612514031;
                config.femaleModel1 = 100010 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25365:
                config.name = "Firemaking master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100011 * -1019082089;
                config.maleModel1 = 100011 * -1612514031;
                config.femaleModel1 = 100011 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25366:
                config.name = "Crafting master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100012 * -1019082089;
                config.maleModel1 = 100012 * -1612514031;
                config.femaleModel1 = 100012 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25367:
                config.name = "Smithing master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100013 * -1019082089;
                config.maleModel1 = 100013 * -1612514031;
                config.femaleModel1 = 100013 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25368:
                config.name = "Mining master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100014 * -1019082089;
                config.maleModel1 = 100014 * -1612514031;
                config.femaleModel1 = 100014 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25369:
                config.name = "Herblore master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100015 * -1019082089;
                config.maleModel1 = 100015 * -1612514031;
                config.femaleModel1 = 100015 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25370:
                config.name = "Agility master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100016 * -1019082089;
                config.maleModel1 = 100016 * -1612514031;
                config.femaleModel1 = 100016 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25371:
                config.name = "Thieving master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100017 * -1019082089;
                config.maleModel1 = 100017 * -1612514031;
                config.femaleModel1 = 100017 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25372:
                config.name = "Slayer master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100018 * -1019082089;
                config.maleModel1 = 100018 * -1612514031;
                config.femaleModel1 = 100018 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25373:
                config.name = "Farming master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100019 * -1019082089;
                config.maleModel1 = 100019 * -1612514031;
                config.femaleModel1 = 100019 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25374:
                config.name = "Runecrafting master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100020 * -1019082089;
                config.maleModel1 = 100020 * -1612514031;
                config.femaleModel1 = 100020 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25375:
                config.name = "Hunter master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100021 * -1019082089;
                config.maleModel1 = 100021 * -1612514031;
                config.femaleModel1 = 100021 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25376:
                config.name = "Construction master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100022 * -1019082089;
                config.maleModel1 = 100022 * -1612514031;
                config.femaleModel1 = 100022 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25377:
                config.name = "Summoning master cape";
                config.inventoryOptions = new String[]{null, "Wear", null, null, "Drop"};
                config.value = 120000 * -1375390745;
                config.equipSlot = 1 * -2026784241;
                config.model = 100023 * -1019082089;
                config.maleModel1 = 100023 * -1612514031;
                config.femaleModel1 = 100023 * -1430077763;
                config.modelScale = 2400 * -1885125181;
                config.modelRoll = 1200 * -629359451;
                config.shadow = 25 * 712208909;
                config.lightness = 75 * -1050247335;
                break;
            case 25378:
                copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(23659), config);
                config.model = 100032 * -1019082089;
                config.maleModel1 = 100025 * -1612514031;
                config.femaleModel1 = 100026 * -1430077763;
                break;
            case 25425: //saphire ticket
                copy(43190, config);
                config.name = "<col=0033cc>Donator ticket";
                config.inventoryOptions[4] = "Drop";
                config.tradeable = true;
                config.value = 5000000 * -1375390745;
                config.originalColors = new short[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11092, 9152, 7087, -32715, -32690, 7997, 8117, -32707, -32698, 22464
                };
                config.modifiedColors = new short[config.originalColors.length];
                for (int i = 0; i < 11; i++)
                    config.modifiedColors[i] = (short) (359770 + (i * 10));
                for (int i = 11; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] = (short) (22424 + (i * 10));
                break;
            case 25426: //emerald ticket
                copy(43190, config);
                config.name = "<col=00cc00>Super Donator ticket";
                config.inventoryOptions[4] = "Drop";
                config.tradeable = true;
                config.value = 10000000 * -1375390745;
                config.originalColors = new short[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11092, 9152, 7087, -32715, -32690, 7997, 8117, -32707, -32698, 22464
                };
                config.modifiedColors = new short[config.originalColors.length];
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] = (short) (22424 + (i * 10));
                break;
            case 25427: //ruby ticket
                copy(43190, config);
                config.name = "<col=990000>Extreme Donator ticket";
                config.inventoryOptions[4] = "Drop";
                config.tradeable = true;
                config.value = 20000000 * -1375390745;
                config.originalColors = new short[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11092, 9152, 7087, -32715, -32690, 7997, 8117, -32707, -32698, 22464
                };
                config.modifiedColors = new short[config.originalColors.length];
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] = (short) (926 + (i * 10));
                break;
            case 25428: //diamond ticket
                copy(43190, config);
                config.name = "<col=ffffff>Legendary Donator ticket";
                config.inventoryOptions[4] = "Drop";
                config.tradeable = true;
                config.value = 40000000 * -1375390745;
                config.originalColors = new short[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11092, 9152, 7087, -32715, -32690, 7997, 8117, -32707, -32698, 22464
                };
                config.modifiedColors = new short[config.originalColors.length];
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] = (short) (127 + (i * 10));
                break;
            case 25429: //onyx ticket
                copy(43190, config);
                config.name = "<col=003300>VIP Donator ticket";
                config.inventoryOptions[4] = "Drop";
                config.tradeable = true;
                config.value = 8000000 * -1375390745;
                config.originalColors = new short[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11092, 9152, 7087, -32715, -32690, 7997, 8117, -32707, -32698, 22464
                };
                config.modifiedColors = new short[config.originalColors.length];
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] = (short) (10349 + (i * 10));
                break;
            case 25430:
                copy(23531, config);
                config.name = "Overload (Special)";
                config.value = 0;
                break;
            case 25431:
                copy(15272, config);
                config.name = "Rocktail (Special)";
                config.value = 0;
                break;
            case 25432: //mystery box
                copy(6199, config);
                config.name = "Pet Mystery Box";
                config.tradeable = true;
                config.value = 10000000 * -1375390745;
                config.modifiedColors[0] = 5000;
                break;
            case 25433:
                copy(8013, config);
                config.name = "<col=FF0040>PK tablet";
                config.inventoryOptions[1] = null;
                config.tradeable = true;
                config.originalColors = new short[]{49, -21544};
                config.modifiedColors = new short[]{-70, -20};
                config.value = 30000 * -1375390745;
                //	-21544, 49, 127, 24, 53
                break;
            case 25434:
                copy(12852, config);
                config.name = "<col=ffffff>Loyalty token";
                break;
            case 25435:
                copy(13663, config);
                config.name = "200k Coins ticket";
                config.value = 1 * -1375390745;
                config.inventoryOptions[4] = "Drop";
                break;
            case 25436: //mystery box
                copy(6199, config);
                config.name = "Premium mystery box";
                config.tradeable = true;
                config.value = 8000000 * -1375390745;
                config.modifiedColors[0] = 6500;
                break;
            case 25503: //mystery box
                copy(6199, config);
                config.name = "Millionaire's box";
                config.tradeable = true;
                config.value = 1000000 * -1375390745;
                config.originalColors = new short[]{2999, 926, 22410};
                config.modifiedColors = new short[]{7000, 926, 926};
                break;
            case 25489:
                copy(405, config);
                config.name = "Corrupted casket";
                config.originalColors = new short[]{-22477, 7062, 13248};
                config.modifiedColors = new short[]{61, (short) 53000, 61};
                config.stackable = 126481113;
                config.tradeable = true;
                break;
            case 25490:
                copy(4084, config);
                config.name = "Purple Sled";
                config.originalColors = new short[]{5799, 6594, 5559, 5524};
                config.modifiedColors = new short[]{119, -15464, -15464, -21620};
                config.tradeable = true;
                break;
            case 25492: //Beginner mystery box
                copy(6199, config);
                config.name = "Mystery Box";
                config.value = 50000 * -1375390745;
                config.originalColors = new short[]{2999, 926, 22410};
                config.modifiedColors = new short[]{127, 933, 933};
                break;
            case 25491:
                config.name = "Wolpertinger pet";
                config.model = Class15.aClass507_224.method6269(16027, 0).models[0] * -1019082089;
                break;
            case 25437: //emerald ticket
                copy(43190, config);
                config.name = "<col=00cc00>Normal-Super Donator ticket";
                config.inventoryOptions[4] = "Drop";
                config.tradeable = true;
                config.value = 5000000 * -1375390745;
                config.originalColors = new short[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11092, 9152, 7087, -32715, -32690, 7997, 8117, -32707, -32698, 22464
                };
                config.modifiedColors = new short[config.originalColors.length];
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] = (short) (22424 + (i * 10));

                break;
            case 25438: //ruby ticket
                copy(43190, config);
                config.name = "<col=990000>Super-Extreme Donator ticket";
                config.inventoryOptions[4] = "Drop";
                config.tradeable = true;
                config.value = 10000000 * -1375390745;
                config.originalColors = new short[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11092, 9152, 7087, -32715, -32690, 7997, 8117, -32707, -32698, 22464
                };
                config.modifiedColors = new short[config.originalColors.length];
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] = (short) (926 + (i * 10));
                break;
            case 25439: //diamond ticket
                copy(43190, config);
                config.name = "<col=ffffff>Extreme-Legendary Donator ticket";
                config.inventoryOptions[4] = "Drop";
                config.tradeable = true;
                config.value = 20000000 * -1375390745;
                config.originalColors = new short[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11092, 9152, 7087, -32715, -32690, 7997, 8117, -32707, -32698, 22464
                };
                config.modifiedColors = new short[config.originalColors.length];
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] = (short) (127 + (i * 10));
                break;
            case 25440: //onyx ticket
                copy(43190, config);
                config.name = "<col=003300>Legendary-VIP Donator ticket";
                config.inventoryOptions[4] = "Drop";
                config.tradeable = true;
                config.value = 4000000 * -1375390745;
                config.originalColors = new short[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11092, 9152, 7087, -32715, -32690, 7997, 8117, -32707, -32698, 22464
                };
                config.modifiedColors = new short[config.originalColors.length];
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] = (short) (10349 + (i * 10));
                break;
            case 25493: //zenyte donator ticket
                copy(43190, config);
                config.name = "<col=ffff00>Supreme VIP Donator ticket";
                config.inventoryOptions[4] = "Drop";
                config.tradeable = true;
                config.value = 8000000 * -1375390745;
                config.originalColors = new short[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11092, 9152, 7087, -32715, -32690, 7997, 8117, -32707, -32698, 22464
                };
                config.modifiedColors = new short[config.originalColors.length];
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] = (short) (6075 + (i * 10));
                break;
            case 25494: //zenyte donator ticket
                copy(43190, config);
                config.name = "<col=ffff00>VIP-Supreme VIP Donator ticket";
                config.inventoryOptions[4] = "Drop";
                config.tradeable = true;
                config.value = 8000000 * -1375390745;
                config.originalColors = new short[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11092, 9152, 7087, -32715, -32690, 7997, 8117, -32707, -32698, 22464
                }; //7116
                config.modifiedColors = new short[config.originalColors.length];
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] = (short) (6075 + (i * 10));
                break;
            case 25495:
                copy(13742, config);
                config.name = "Almighty Spirit Shield";
                config.value = 5000000 * -1375390745;
                config.tradeable = true;
                config.originalColors = new short[]{ 105, -29093, -29087, -29116, -29113, -29122, -29164, -29110, 4495, -29125, -29158, -29153};
                config.modifiedColors = new short[]{ 90, 5, 5, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
                break;

            case 19709: //dung master cape fix
            case 19710:
                config.value = 99000 * -1375390745;
                break;
            case 23713: //small lamp
                config.value = 10 * -1375390745;
                break;
            case 24154: //spins
                config.value = 10 * -1375390745;
                config.name = "150k Coins Ticket";
                config.inventoryOptions[0] = "Tear";
                config.stackable = 126481113;
                break;
            case 24155:
                config.name = "300k Coins Ticket";
                config.inventoryOptions[0] = "Tear";
                config.stackable = 126481113;
                break;
            case 24108: //tophats
            case 24110:
            case 24112:
            case 24114:
                config.value = 100 * -1375390745;
                break;
            case 21258: //robin hats
            case 21260:
            case 21262:
            case 21264:
                config.value = 175 * -1375390745;
                break;
            case 19747: //rainbow
                config.value = 75 * -1375390745;
                break;
            case 7003: //camel mask
                config.value = 50 * -1375390745;
                break;
            case 24317: //monkey cape
                config.value = 275 * -1375390745;
                break;
            case 7927: //easter ring
                config.value = 350 * -1375390745;
                break;
            case 5607: //fox
            case 5608: //chicken
            case 5609: //bag
                config.value = 187 * -1375390745;
                break;
            case 4566: //rubber chicken
                config.value = 500 * -1375390745;
                break;
            case 4084: //sled
                config.value = 3000 * -1375390745;
                break;
            case 20765: //cape1
                config.value = 6000 * -1375390745;
                break;
            case 20763: //cape2
                config.value = 9000 * -1375390745;
                break;
            case 24709: //cape3
                config.value = 12000 * -1375390745;
                break;
            case 15441:
            case 15442:
            case 15443:
            case 15444:
            case 15701:
            case 15702:
            case 15703:
            case 15704:
                config.value = 300 * -1375390745;
                break;
            case 22207:
            case 22209:
            case 22211:
            case 22213:
                config.value = 500 * -1375390745;
                break;
            case 15600:
            case 15602:
            case 15604:
            case 15606:
            case 15608:
            case 15610:
            case 15612:
            case 15614:
            case 15616:
            case 15618:
            case 15620:
            case 15622:
            case 10547:
            case 10548:
            case 10549:
            case 10550:
            case 10551: //figher torso
            case 10552:
            case 10553:
            case 10555:
            case 41942: //ecu key
            case 52251://osrs wood shields
            case 52254:
            case 52257:
            case 52260:
            case 52263:
            case 52266:
            case 52269:
            case 52272:
            case 52275:
            case 52278:
            case 52281:
            case 52284:
            case 43385:
            case 43389:
            case 51739: //granite ring
            case 51643: //granite boots
            case 51736: //granite gloves
            case 51733: //guardian boots
            case 51730: //black tourmaline core
            case 51637: //wrym visage
            case 51728: //granite balls
            case 21776: //armadyl shards
            case 20115:
            case 20116:
            case 20117:
            case 20118:
            case 20119:
            case 50714: //tome of fire
            case 42785: //ring of wealth (i)
            case 52477: //defender hilt
            case 52557: //amulet of avarince
            case 42695:
            case 42697:
            case 42699:
            case 42701:
            case 52326:
            case 52327:
            case 54439:
            case 54419:
            case 54420:
            case 54421:
            case 52328:
            case 51018:
            case 51021:
            case 51024:
            case 21024:
            case 52780: //new bones
            case 52783:
            case 52786:
            case 51000:
            case 24974:
            case 24989:
            case 24980:
            case 24986:
            case 24977:
            case 24983:
            case 50095:
            case 50098:
            case 50101:
            case 50104:
            case 50107:
            case 53242: //3rd age plateskirt
                config.tradeable = true;
                break;

            case 15098: //dicebag
                config.tradeable = true;
                config.inventoryOptions[1] = "Roll";
                config.value = 10000000 * -1375390745;
                break;
        }
    }

    private static int getAuraPrice(int id) {
        for (Object value : Class51.aClass475_506.getClientScriptMap(5182, 1528209569).anObjectArray6041) {
            ClientScriptEnum data = Class477.aClass500_6001.method6219((int) value, 685502248);
            if (data.method3425(1935, -1, (short) 0) == id)
                return data.method3425(1932, 1, (short) 0);

        }
        for (Object value : Class51.aClass475_506.getClientScriptMap(5724, 1528209569).anObjectArray6041) {
            ClientScriptEnum data = Class477.aClass500_6001.method6219((int) value, 685502248);
            if (data.method3425(1935, -1, (short) 0) == id)
                return data.method3425(1932, 1, (short) 0);
        }
        return 0;
    }

    //new, old
    private static final int[] LUCKY_ITEMS = new int[]{
            25379, 15486, //sol
            25380, 11235, //dbow
            25381, 4087, //dragon
            25382, 4585,
            25383, 24365,
            25384, 11732,
            25385, 4708, //ahrim
            25386, 4710,
            25387, 4712,
            25388, 4714,
            25389, 4716, //dharok
            25390, 4718,
            25391, 4720,
            25392, 4722,
            25393, 4724,  //guthan
            25394, 4726,
            25395, 4728,
            25396, 4730,
            25397, 4732, //karil
            25398, 4734,
            25399, 4736,
            25400, 4738,
            25401, 4745, //torag
            25402, 4747,
            25403, 4749,
            25404, 4751,
            25405, 4753, //verac
            25406, 4755,
            25407, 4757,
            25408, 4759,
            25409, 21736, //Akrisae
            25410, 21744,
            25411, 21752,
            25412, 21760,
            25413, 25019, //bandos
            25414, 25022,
            25415, 25025,
            25416, 25010, //armadyl
            25417, 25013,
            25418, 25016,
            25419, 24992, //subjugation
            25420, 24995,
            25421, 24998,
            25422, 25001,
            25423, 25004,
            25424, 25007
    };


    public static int getOldLookItem(int id, boolean female) {
        for (int i = 0; i < LUCKY_ITEMS.length; i += 2)
            if (LUCKY_ITEMS[i] == id)
                return LUCKY_ITEMS[i + 1];

        if (Class477.OLD_ITEMS) {
            if (!female && ((id >= 863 && id <= 876) || (id >= 5654 && id <= 5667)))
                return id;
            if (id == 13157 || id == 22448 || id == 301 || id == 3242 || id == 8855 || id == 4056 || id == 4057 || id == 4058 || id == 13242) //fix graphicsl bug
                return id;

            if (id == 25572) // old ultimate
                return 25571;
            if (id == 25566)// old ultimate
                return 25565;
            if (id == 25560)// old ultimate
                return 25559;


            if (id == 25505 || id == 25742) //old ultimate bandos
                return 25524;
            if (id == 25512 || id == 25749)//old ultimate armadyl
                return 25525;
            if (id == 23659) //old kiln
                return 25378;
            if (id == 24365) //old dragon kite
                return 51895;
            if (id == 25037)
                return 41785;
            if (id >= 1265 && id <= 1334)
                return id + Settings.OSRS_ITEM_OFFSET;

            if (id == 7158 || id == 1305 || id == 4587 || id == 2402 || id == 6746)
                return id + Settings.OSRS_ITEM_OFFSET;

            if (id < 22443)
                return id + Settings._685_ITEM_OFFSET;

                //lucky to non lucky
            else if (id == 23679)
                id = 11694;
            else if (id == 23680)
                id = 11696;
            else if (id == 23681)
                id = 11698;
            else if (id == 23682)
                id = 11700;
            else if (id == 23683)
                id = 11716;
            else if (id == 23684)
                id = 11718;
            else if (id == 23685)
                id = 11720;
            else if (id == 23686)
                id = 11722;
            else if (id == 23687)
                id = 11724;
            else if (id == 23688)
                id = 11726;
            else if (id == 23689)
                id = 11728;
            else if (id == 23690)
                id = 11730;
            else if (id == 23691)
                id = 4151;
            else if (id == 23692)
                id = 11335;
            else if (id == 23693)
                id = 14479;
            else if (id == 23694)
                id = 3140;
            else if (id == 23695)
                id = 14484;
            else if (id == 23696)
                id = 7158;
            else if (id == 23697)
                id = 13738;
            else if (id == 23698)
                id = 13740;
            else if (id == 23699)
                id = 13742;
            else if (id == 23700)
                id = 13744;

        } else { //temporary fix
            if (id == 25535 || id == 50098)
                return 9924;
            if (id == 52327 || id == 54420 || id == 25577)
                return 5575;
            if (id == 51021)
                return 4111;
            if (id == 53975)
                return 17255;
            if (id == 51301)
                return 10564;
            if (id == 50517)
                return 1035;
            if (id == 43387)
                return 3793;

        }
        return id;
    }

    public static void modifyModel(boolean female, ItemConfig config, int slot, Model model, int modelSlot) {
        int id = 1027112447 * config.itemId;
		/*if (id == 23659 && Class477.OLD_ITEMS) {
			model.translate(0, 0, 100);
			return;
		}*/

        if ((id == 25659 || id == 25670 || id == 25671) && modelSlot == 4) {
            int[] indexes = {20, 40, 50, 260, 270, 280, 290, 300};
            /*if (id == 25505) {
                for (int i = 0; i < indexes.length; i++)
                    indexes[i] += 15;
            }*/
            model.particles = new Class85[indexes.length];
            //198 good
            for (int i = 0; i < indexes.length; i++)
                model.particles[i] = new Class85(id == 25659 ? 198 : id == 25670 ? 197 : 195, model.faces_a[indexes[i]], model.faces_b[indexes[i]], model.faces_c[indexes[i]], (byte) 4);
        }

        if (id >= 25568 && id <= 25573 && modelSlot == 4)
            model.setTexture(new int[]{935}, Settings.OSRS_TEXTURE_OFFSET + 59);
        else if (id >= 25562 && id <= 25567 && modelSlot == 4)
            model.setTexture(new int[]{13223}, 2247);
        else if (id >= 25556 && id <= 25561 && modelSlot == 4)
            model.setTexture(new int[]{-19500}, 2241);

        if(config.retextureClr != null) {
            for(int tex = 0; tex < config.retextureClr.length; tex++) {
                model.setTexture(new int[] {config.retextureClr[tex]}, config.retextureTexture[tex]);
            }
        }
        //190 good for a ucustom fire item
        //gfx 199 maybe for subj
        if (id == 25528 && modelSlot == 1) {
            //System.out.println(model.particles[0].anInt778 * 108680029);
			/*Class85[] old = model.particles.clone();
			for (int i = 0; i < model.particles.length; i++)
				model.particles[i].anInt778 = 171 * 2033948917;*/
            int oldSize = model.particles.length;
            model.particles = Arrays.copyOf(model.particles, oldSize/* + 7*/);
            for (int i = 0; i < 7; i++) {

                model.particles[i].anInt778 = 1404 * 2033948917;
            }


			/*for (int i = 0; i < 7; i++) {
				model.particles[oldSize + i] = new Class85(171, model.particles[i].anInt773 * -710317103,
						model.particles[i].anInt774 * 1705862021,
						model.particles[i].anInt775 * 1636170731,
						model.particles[i].aByte780
						);
			}*/

            ///System.arraycopy(old, 0, model.particles, model.particles.length - old.length, old.length);
        } else if ((id == 25505 || id == 25524 || id == 25742) && modelSlot == 1) {
            int[] indexes = {65, 145, 165, 185};
            if (id == 25505) {
                for (int i = 0; i < indexes.length; i++)
                    indexes[i] += 15;
            }
            model.particles = new Class85[indexes.length];
            //198 good
            for (int i = 0; i < indexes.length; i++)
                model.particles[i] = new Class85(175, model.faces_a[indexes[i]], model.faces_b[indexes[i]], model.faces_c[indexes[i]], (byte) 4);
        } else if ((id == 25525) && modelSlot == 1) {
            int[] indexes = {45, 145};
            model.particles = new Class85[indexes.length];
            //198 good
            for (int i = 0; i < indexes.length; i++)
                model.particles[i] = new Class85(175, model.faces_a[indexes[i]], model.faces_b[indexes[i]], model.faces_c[indexes[i]], (byte) 4);
        } else if ((id == 25755 || id == 25518) && modelSlot == 1) {
            int[] indexes = {421};
            model.particles = new Class85[indexes.length];
            //198 good
            for (int i = 0; i < indexes.length; i++)
                model.particles[i] = new Class85(201, model.faces_a[indexes[i]], model.faces_b[indexes[i]], model.faces_c[indexes[i]], (byte) 4);
        } else if ((id == 25486 || id == 25740) && modelSlot == 1) {
            model.aClass84Array649 = new Class84[1];
            ///81, 72
            model.aClass84Array649[0] = new Class84(53, 72, 255, -10);
        } else if ((id == 25495) && modelSlot == 1) {
            int[] indexes = {20};
            model.particles = new Class85[indexes.length];
            //198 good (RED)
            for (int i = 0; i < indexes.length; i++)
                model.particles[i] = new Class85(198, model.faces_a[indexes[i]], model.faces_b[indexes[i]], model.faces_c[indexes[i]], (byte) 4);
        } else if ((id == 25533 || id == 25662 || id == 25586) && modelSlot == 1) {
            int[] indexes = {1};
            model.particles = new Class85[indexes.length];
            //198 good
            for (int i = 0; i < indexes.length; i++)
                model.particles[i] = new Class85(id == 25662 || id == 25586 ? 0x0051 : 197, model.faces_a[indexes[i]], model.faces_b[indexes[i]], model.faces_c[indexes[i]], (byte) 4);
        } else if ((id == 25575) && modelSlot == 1) {
            int[] indexes = {1};
            model.particles = new Class85[indexes.length];
            //198 good
            for (int i = 0; i < indexes.length; i++)
                model.particles[i] = new Class85(198, model.faces_a[indexes[i]], model.faces_b[indexes[i]], model.faces_c[indexes[i]], (byte) 4);
        } else if ((id == 25592) && modelSlot == 1) {
            int[] indexes = {1};
            model.particles = new Class85[indexes.length];
            //198 good
            for (int i = 0; i < indexes.length; i++)
                model.particles[i] = new Class85(199, model.faces_a[indexes[i]], model.faces_b[indexes[i]], model.faces_c[indexes[i]], (byte) 4);

        } else if ((id == 25529 || id == 25504) && modelSlot == 1) {
			/*
			 *  30,
					50, 70, 90, 110, 130, 150, 170
			 */

            int[] indexes = {30, 40, 50};//30
            model.particles = new Class85[indexes.length];
            //199 good,223
            //247 fire weap
            //257 super cool
            //287 lego
            for (int i = 0; i < indexes.length; i++) {
                model.particles[i] = new Class85(199, model.faces_a[indexes[i]], model.faces_b[indexes[i]], model.faces_c[indexes[i]], (byte) 4);
            }
        } else if ((id == 25663) && modelSlot == 1) {
			/*
			 *  30,
					50, 70, 90, 110, 130, 150, 170
			 */

            int[] indexes = {90, 150, 170};//30
            model.particles = new Class85[indexes.length];
            //199 good,223
            //247 fire weap
            //257 super cool
            //287 lego
            for (int i = 0; i < indexes.length; i++) {
                model.particles[i] = new Class85(0x0051, model.faces_a[indexes[i]], model.faces_b[indexes[i]], model.faces_c[indexes[i]], (byte) 2);
            }
        } else if ((id == 25589 || id == 25504) && modelSlot == 1) {
            int[] indexes = {15};//30
            model.particles = new Class85[indexes.length];
            //199 good,223
            //247 fire weap
            //257 super cool
            //287 lego
            for (int i = 0; i < indexes.length; i++) {
                model.particles[i] = new Class85(198, model.faces_a[indexes[i]], model.faces_b[indexes[i]], model.faces_c[indexes[i]], (byte) 4);
            }
        }

        if ((id >= Settings._685_ITEM_OFFSET || id < Settings.OSRS_ITEM_OFFSET) && id != 25441 && id != 25460 && id != 25575 && id != 25533 && id != 25469
                && id != 25476 && id != 25502
                && !(id >= 25534 && id <= 25538)
                && id != 25540 && id != 25541
                && id != 25591 && id != 25592
                && id != 25544
                && id != 25579
                && id != 25578
                && id != 25577
                && id != 25583)
            return;

        //	System.out.println(id+", "+slot+", "+modelSlot);

        if (slot == 4 && Class477.OLD_ITEMS) { //TODO fix for new items look

            if (female) {
                model.translate(0, 45, 10);
                if (modelSlot == 2) {
                    model.scale(145, 147, 140);
                    model.translate(0, 20, -2);
                } else {
                    model.scale(145, 147, 140);
                    //	model.scale(140, 165, 128);
                    model.translate(0, 20, -2);
					/*if (id == 54420 || id == 25577 || id == 52327) {
						model.scale(124, 128, 128);
					}*/
                }
            } else {
                if (modelSlot == 2) {
                    model.scale(145, 140, 128);
                    model.translate(0, 40, -0);

                    if (id == 42894 || id == 42888 || id == 51301 || id == 43387 || id == 25535 || id == 50098) { //some body pieces need exeptions
                        model.scale(128, 140, 128);
                        model.translate(0, 80, -0);
                    }
                } else {
                    if (id == 54420 || id == 25577 || id == 52327) {
                        model.scale(138, 150, 128);
                        model.translate(0, 95, -0);
                    } else {
                        model.scale(140, 165, 128);
                        model.translate(0, 165, -0);
                    }

                }
            }
        }


        if (modelSlot == 1) {
            if (slot == 3) { //weapon
                if (Class477.OLD_ITEMS && female)
                    model.translate(0, -5, 0);
                else
                    model.translate(-10, female ? 30 : 35, -20);

                if (id == 49478 || id == 49481) //balista
                    model.translate(0, 0, -200);
            } else if (slot == 5) {
                if (Class477.OLD_ITEMS && female)
                    model.translate(5, -40, 0);
                else
                    model.translate(female ? 15 : -5, female ? 10 : 20, -20);
            } else if (slot == 1) { //cape
                model.translate(0, 0, 20);
            } else if (slot == 10) { //boots
                if (Class477.OLD_ITEMS && female)
                    model.translate(0, -25, 5);
            } else if (slot == 0) { //hat
                if (id == 42931 || id == 51298 || id == 52326 || id == 54419 || id == 54271
                        || id == 25534 || id == 50095) //exeption for serpentine helm
                    model.translate(0, Class477.OLD_ITEMS ? 20 : 10, 0);

                if (Class477.OLD_ITEMS && female)
                    model.translate(0, -50, 20);
                else
                    model.translate(0, Class477.OLD_ITEMS ? -30 : -20, 15);
            } else if (slot == 9) { //gloves
                model.translate(0, (Class477.OLD_ITEMS ? (female ? -5 : 3) : (female ? -120 : -5)), female ? (!Class477.OLD_ITEMS ? -5 : 14) : -3);
                model.scale(female && !Class477.OLD_ITEMS ? 175 : 144, Class477.OLD_ITEMS ? (female ? 140 : 120) : (female ? 95 : 116), 145);
            } else if (slot == 2) { //amulet
                if (Class477.OLD_ITEMS && female)
                    model.translate(0, -50, 5);
                else
                    model.translate(0, -23, -16);
            } else if (slot == 7) {
                model.translate(0, 5, Class477.OLD_ITEMS && female ? 12 : 0);
                model.scale(128, 135, 128);
            }
            //	System.out.println(slot+", "+config.name);

        }
    }

    public static void copy(int id, ItemConfig to) {
        copy(Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(id), to);
    }


    public static void copy(ItemConfig from, ItemConfig to) {
        to.name = from.name;
        to.inventoryOptions = from.inventoryOptions.clone();
        to.equipSlot = from.equipSlot;
        to.anInt5772 = from.anInt5772;
        to.model = from.model;
        to.maleModel1 = from.maleModel1;
        to.femaleModel1 = from.femaleModel1;
        to.maleModel2 = from.maleModel2;
        to.femaleModel2 = from.femaleModel2;
        to.modelScale = from.modelScale;
        to.modelRoll = from.modelRoll;
        to.modelPitch = from.modelPitch;
        to.offsetX = from.offsetX;
        to.modelTranslateX = from.modelTranslateX;
        to.modelTranslateY = from.modelTranslateY;
        to.scaleX = from.scaleX;
        to.scaleY = from.scaleY;
        to.scaleZ = from.scaleZ;
        to.shadow = from.shadow;
        to.lightness = from.lightness;
        to.settings = from.settings;
        to.value = from.value;
        to.stackable = from.stackable;
        if (from.aByteArray5708 != null)
            to.aByteArray5708 = from.aByteArray5708.clone();

        if (from.originalColors != null) {
            to.originalColors = from.originalColors.clone();
            to.modifiedColors = from.modifiedColors.clone();
        }
        if (from.originalTextures != null) {
            to.originalTextures = from.originalTextures.clone();
            to.modifiedTextures = from.modifiedTextures.clone();
        }
    }

}
