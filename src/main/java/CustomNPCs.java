/**
 *
 */

/**
 * @author dragonkk(Alex)
 * Oct 18, 2017
 */
public class CustomNPCs {

    public static void modify(NPCConfig config) {
    	
    	
    	/*int size = config.anInt6187 * -2095128707;
    	int scaleSZ = config.scaleXZ * -2086573057;
    	int scaleY = config.scaleY * -1282053981;
    	
    	config.anInt6187 = (int) (size * 2) * -1690840619;
    	 
    	 config.scaleXZ = (int) (scaleSZ * 2) * -1227975681;
         config.scaleY = (int) (scaleY * 2) * 745310987;*/
    	
        int id = config.id * -407713023;
        if ((id >= 6565 && id <= 6603) || (id >= 13296 && id <= 13299))
            config.actions[1] = "Loot-all";
        if (id >= 28196 && id <= 28205) {
            config.actions = new String[]{"Talk-to", null, "Pick-up", "Metamorphosis", null, "Examine"};
        }

        if (config.hasOption("bank") && config.hasOption("collect")) {
            config.actions[4] = "Clan-Bank";
        }
        switch (id) {
            case 28491:
                config.actions[3] = "Watch-Matrix-End";
                break;
			/*case 27316: // trade lisa
				config.actions = new String[]{"Talk-to", null, "Trade", null, null, "Examine"};
				break;*/
            case 21230: //giant mimic
                copy(28633, config);
                config.scaleXZ *= 2;
                config.scaleY *= 2;
                config.anInt6187 *= 2;
                config.combatLevel = 1860 * 954057527;
                config.name = "Giant Mimic";
                break;
            case 21229: // tommy royal top donor pet
                copy(28387, config);
                config.name = "Tommy";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 24 * -1227975681;
                config.scaleY = 24 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 21224:
                copy(9181, config);
                config.name = "Horrific right arm";
                config.actions = new String[]{"Talk-to", null, "Pick-up", "Metamorphosis", null, "Examine"};
                break;
            case 21225:
                copy(9182, config);
                config.name = "Horrific left arm";
                config.actions = new String[]{"Talk-to", null, "Pick-up", "Metamorphosis", null, "Examine"};
                break;
            case 21226:
                copy(9183, config);
                config.actions = new String[]{"Talk-to", null, "Pick-up", "Metamorphosis", null, "Examine"};
                config.name = "Horrific tail";
                break;
            case 7711: // somebody changed this to 'cerberis' -- priest in peril guardian dog
                config.name = "Temple guardian";
                break;
            case 21220:
                copy(27520, config);
                config.name = "Twisted olmlet";
                config.addTexture(new int[]{-32661, 20411, 24, 12, 33, 15296}, 2247);
                break;
            case 21221:
                copy(27520, config);
                config.name = "Elder olmlet";
                config.originalColors = new short[]{-32655, -31645, -32678, 18370, 13248, -32647, -32715, -32690};
                config.modifiedColors = new short[]{5, 4, 5, 5, 5, 7, 8, 10};
                config.addTexture(new int[]{-32661, 20411, 24, 12, 33, 15296}, Settings.OSRS_TEXTURE_OFFSET + 59);
                break;
            case 21222:
                copy(27520, config);
                config.name = "Ancestral olmlet";
                config.originalColors = new short[]{-32655, -31645, -32678, 18370, 13248, -32647, -32715, -32690};
                config.modifiedColors = new short[]{-22518, -22520, -22522, -22524, -22522, -22520, -22518, -22515};
                config.addTexture(new int[]{-32661, 20411, 24, 12, 33, 15296}, 2238);
                break;
            case 21999:
                copy(27520, config);
                config.name = "Monk's fish";
                config.originalColors = new short[]{-32655, -32661, -31645, -32678, -32647, -32715, -32690, 15296};
                config.modifiedColors = new short[]{
                        20, 26, 10, 43, 13, 0, 55, -15626};
                break;
            case 21998:
                copy(27520, config);
                config.printModelColors = true;
                config.name = "Ziomlet";
                config.originalColors = new short[]{-32655, -32661, -31645, -32678, -32647, -32715, -32690, 15296};
                config.modifiedColors = new short[]{
                        20, 26, 10, 43, 13, 0, 55, -15626};
                break;
            case 28205:
                config.standAnimation = 27453;
                config.walkAnimation = 27453;
                config.walkBackwardsAnimation = 27453;
                break;
            case 28202:
                config.standAnimation = 27490;
                config.walkAnimation = 27486;
                config.walkBackwardsAnimation = 27486;
                break;
            case 8536:
                config.name = "Infernal imp";
                config.originalColors = new short[]{908, 3893, 10306, 7469,};
                config.modifiedColors = new short[]{
                        3, 1, 8, 11,};
                config.actions = new String[]{"Pelt", null, null, null, null, "Examine"};
                config.addTexture(new int[]{-26835, -24921, -25941, -24911, -25035, -25693, -24802, -29488, -26833, -29637, -25685, -26841, -29542, -25159, -29529, -29645, -25043, -25933,}, Settings.OSRS_TEXTURE_OFFSET + 59);
                break;

            case 21997:
                copy(8536, config);
                config.name = "<col=ff0000>Infernal imp pet";
                config.originalColors = new short[]{908, 3893, 10306, 7469,};
                config.modifiedColors = new short[]{
                        3, 1, 8, 11,};
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.addTexture(new int[]{-26835, -24921, -25941, -24911, -25035, -25693, -24802, -29488, -26833, -29637, -25685, -26841, -29542, -25159, -29529, -29645, -25043, -25933,}, Settings.OSRS_TEXTURE_OFFSET + 59);
                break;
            case 1553:
                copy(1552, config);
                config.scaleXZ = 256 * -1227975681;
                config.scaleY = 256 * 745310987;
                config.anInt6187 = 2 * -1690840619;
                config.name = "Infernal Santa";
                config.originalColors = config.modifiedColors = null;
                //[6798, , 8741, 25238, , 5400]
                //[86, , 933, 933, , 0]
                config.originalColors = new short[]{933, /*6798,*/ 8741, 25238, 5400};
                config.modifiedColors = new short[]{
                        15,/*0,*/10, 2, 8};
                config.addTexture(new int[]{6798, 908, 8078, 6587, 68, 127, 10351, -27381, -22464},
                        Settings.OSRS_TEXTURE_OFFSET + 59);
                config.combatLevel = 5 * 954057527;
                config.actions = new String[]{null, "Attack", null, null, null, "Examine"};
                break;

            case 27533: // cox npc clickbox
            case 27553:
            case 27555:
            case 27554:
            case 27552:
            case 27551:
            case 27550:
                config.models = Class15.aClass507_224.method6269(27709, 0).models;
                break;
            case 27690:
                config.actions[0] = "Boss assignment";
                config.actions[2] = "Exchange cape";// previously "exchange"
                break;
            case 2024:
            case 1835:

            case 1918:
            case 3709:
                config.actions[2] = "Trade";
                break;

            case 1694:
                config.name = "Voting guide";
                config.actions[2] = "Trade";
                break;
            case 9085:
                config.actions[1] = null;//"Get-boss-task";
                break;
            case 6537:
            case 943:
            case 2253:
                config.actions[2] = "Trade";
                break;
            case 949: //starter guide
                config.name = "Skilling guide";
                config.actions[2] = "Trade";
                break;
            case 944: //starter guide
                config.name = "Gear guide";
                config.actions[2] = "Trade";
                break;
            case 945: //starter guide
                config.name = "Pure guide";
                config.actions[2] = "Trade";
                break;
            case 13727:
                config.actions[2] = "Trade";
                config.actions[3] = null;
                break;
            case 954:
                config.name = "Loyal Dan";
                config.actions[2] = "Trade";
                break;
            case 946:
                config.name = "Matrix guide";
                config.actions[2] = "Trade";
                config.actions[3] = "Teleport";
                break;
            case 947:
                config.name = "Skilling secondaries guide";
                config.actions[2] = "Trade";
                break;
            //16k start custom
            case 16000:
                copy(22668, config);
                config.actions[0] = config.actions[2] = config.actions[3] = config.actions[4] = null;
                break;
            case 16001:
                copy(22668, config);
                config.name = "DZ Combat Dummy";
                config.actions[0] = config.actions[2] = config.actions[3] = config.actions[4] = null;
                break;
            case 16002:
                copy(15211, config);
                config.name = "Shrimpy";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 24 * -1227975681;
                config.scaleY = 24 * 745310987;
                config.anInt6187 = 2 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                break;
            case 16003:
                copy(13447, config);
                config.name = "Nexterminator";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 48 * -1227975681;
                config.scaleY = 48 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 16004:
                copy(15454, config);
                config.name = "Queen Black Dragonling";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 8 * -1227975681;
                config.scaleY = 8 * 745310987;
                config.anInt6187 = 2 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                break;
            case 16027:
                copy(16025, config);
                config.name = "Wolpertinger pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 36 * -1227975681;
                config.scaleY = 36 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 16028:
                copy(409, config);
                config.name = "Genie pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 75 * -1227975681;
                config.scaleY = 75 * 745310987;
                config.anInt6187 = 2 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;

            case 21950:
                copy(347, config);
                config.name = "Covid";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 60 * -1227975681;
                config.scaleY = 60 * 745310987;
                config.anInt6187 = 2 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 21951:
                copy(653, config);
                config.name = "Pet fairy queen";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 75 * -1227975681;
                config.scaleY = 75 * 745310987;
                config.anInt6187 = 2 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;

            case 21930:
                copy(26593, config);
                config.name = "Baby lava dragon";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 50 * -1227975681;
                config.scaleY = 50 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 21931:
                copy(28633, config);
                config.name = "Mimi";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 25 * -1227975681;
                config.scaleY = 25 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 21932:
                copy(27039, config);
                config.name = "Superior slayer pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", "Metamorphosis", null, "Examine"};
                config.scaleXZ = 33 * -1227975681;
                config.scaleY = 33 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                config.modifiedColors = new short[]{0};
                config.originalColors = new short[]{0};
                break;
            case 21939:
                copy(27038, config);
                config.name = "Superior slayer pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", "Metamorphosis", null, "Examine"};
                config.scaleXZ = 50 * -1227975681;
                config.scaleY = 50 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 21940:
                copy(27024, config);
                config.name = "Superior slayer pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", "Metamorphosis", null, "Examine"};
                config.scaleXZ = 50 * -1227975681;
                config.scaleY = 50 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 21941:
                copy(27020, config);
                config.name = "Lil'Hazey";
                config.actions = new String[]{"Talk-to", null, "Pick-up", "Metamorphosis", null, "Examine"};
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 21942:
                config.originalColors = new short[]{6340, 5281, 2332, 6315, 103, 6336, 16, 0, 6323, 18, -21608,};
                config.modifiedColors = new short[]{
                        30247, -16626, 7443, 5755, 2376, -22137, -11395, -23475, 10915, 15183, -25171,};
                break;
            case 21943:
                copy(28008, config);
                config.name = "Kai's Shadow Critter";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.originalColors = new short[]{6340, 5281, 2332, 6315, 103, 6336, 16, 0, 6323, 18, -21608,};
                config.modifiedColors = new short[]{8, -17500, 10, 12, 67, 12, -17500, 10, -17500, 8, 0};
                break;
            case 21944:
                copy(14387, config);
                config.name = "Death Jr.";
                config.scaleXZ = 50 * -1227975681;
                config.scaleY = 50 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                break;
            case 21945:
                copy(25491, config);
                config.originalColors = new short[]{-10292};
                config.modifiedColors = new short[]{-11265};
                config.name = "Lucky's Balloon Boi";
                config.actions = new String[]{"Talk-to", null, "Pick-up", "Metamorphosis", null, "Examine"};
                break;
            case 21991:
                copy(25493, config);
                config.originalColors = new short[]{-10292};
                config.modifiedColors = new short[]{-11265};
                config.name = "Lucky's Balloon Boi";
                config.actions = new String[]{"Talk-to", null, "Pick-up", "Metamorphosis", null, "Examine"};
                break;
            case 21947:
                copy(25489, config);
                config.originalColors = new short[]{-10292};
                config.modifiedColors = new short[]{-11265};
                config.name = "Lucky's Balloon Boi";
                config.actions = new String[]{"Talk-to", null, "Pick-up", "Metamorphosis", null, "Examine"};
                break;
            case 9687:
                System.out.println("Bun " + config.standAnimation + " st " + config.stanceID * 525312939);
                break;
            case 21948:
                copy(1, config);
                config.stanceID = config.walkAnimation = config.standAnimation = config.walkBackwardsAnimation = 912;
                config.anInt6187 = 1 * -1690840619;
                config.models = new int[]{237};
                config.originalColors = new short[]{-16940, -28340, -12369};
                config.modifiedColors = new short[]{22143, 22143, 22143};
                config.combatLevel = 0;
                config.name = "<col=00ffff>Flowers";
                config.actions = new String[]{"Talk-to", null, "Pick-up", "Metamorphosis", null, "Examine"};
                break;
            case 21949:
                copy(1, config);
                config.stanceID = config.walkAnimation = config.standAnimation = config.walkBackwardsAnimation = 912;
                config.anInt6187 = 1 * -1690840619;
                config.models = new int[]{237};
                config.combatLevel = 0;
                config.originalColors = new short[]{-16940, -28340, -12369};
                config.modifiedColors = new short[]{32767, 127, 127};
                config.name = "<col=00ffff>Flowers";
                config.actions = new String[]{"Talk-to", null, "Pick-up", "Metamorphosis", null, "Examine"};
                break;
            case 21990:
                copy(1, config);
                config.stanceID = config.walkAnimation = config.standAnimation = config.walkBackwardsAnimation = 912;
                config.anInt6187 = 1 * -1690840619;
                config.models = new int[]{237};
                config.combatLevel = 0;
                config.originalColors = new short[]{-16940, -28340, -12369};
                config.modifiedColors = new short[]{0, 0, 0};
                config.name = "<col=00ffff>Flowers";
                config.actions = new String[]{"Talk-to", null, "Pick-up", "Metamorphosis", null, "Examine"};
                break;
            case 89:
              /*  config.name = "Unic0rn";
                config.addTexture(new int[]{119, 111, 127, 6364, 7646, 7766, 7516, 6241, 6340,},
                        Settings.OSRS_TEXTURE_OFFSET + 59);*/
                break;
            case 21993:
                copy(89, config);
                config.name = "Infernal unicorn";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.addTexture(new int[]{119, 111, 127, 6364, 7646, 7766, 7516, 6241, 6340,},
                        Settings.OSRS_TEXTURE_OFFSET + 59);
                config.scaleXZ = 50 * -1227975681;
                config.scaleY = 50 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                break;


			case 21227:
				copy(28359, config);
				config.anInt6187 = 1 * -1690840619;
				config.name = "Bl0aty";
				config.scaleXZ = 36 * -1227975681;
				config.scaleY = 36 * 745310987;
				config.combatLevel = 0;
				config.standAnimation = 28082;
                config.priority = false;
                config.visibleOnMap = false;
				config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
				break;
            case 21223:
                copy(22112, config);
                config.name = "Wise old man (Zipfer)";
                config.scaleXZ = 64 * -1227975681;
                config.scaleY = 64 * 745310987;
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.modifiedTextures = null;
				config.models = new int[]{200187, 209103, 204925, 200292, 233103, 200170, 200176, 203711, 200265, 200181};
                break;
            case 21952:
                copy(27881, config);
                config.name = "Lil'Smokey";
                config.actions = new String[]{"Talk-to", null, "Pick-up", "Metamorphosis", null, "Examine"};
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 21927:
            case 21928:
            case 21929:
                copy(14304 - (21929 - id), config);
                config.name = "Callus' offspring";
                config.actions = new String[]{"Talk-to", null, "Pick-up", "Metamorphosis", null, "Examine"};
                config.scaleXZ = 75 * -1227975681;
                config.scaleY = 75 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 21992:
                copy(14304, config);
                config.name = "Shadow Callus";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 75 * -1227975681;
                config.scaleY = 75 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                config.originalColors = new short[]{-25686, -25618, -25728, -25700, -25681, -25716, -25611, -25638, -25633, -25648, -25642, -25701, -25667, -25709, -25651, -25718, -25669, -25702, -25705, -25715, -25708, -25692, -25654, -25666, -25665, -25695, -25668, -25699, -25677, -25636, -25703, -25680, -25674, -25661, -25664, -22668, -25693, -25641, -25679, -25624, -25615, -25663, -25698, -25659, -25671, -25714, -25673, -25675, -25717, -25653, -25685, -25704, -25652, -25660, -25614, -25684, -25711, -25632, -25725, -25662, -25657, -25645, -25719, -25649, -25723, -25658, -25672, -25629, -25637, -25690, -25625, -25650, -25630, -25688, -25697, -25670, -25655,};
                config.modifiedColors = new short[]{
                        2, 14, 0, 8, 7, 12, 4, 11, 9, 13, 1, 4, 6, 2, 4, 10, 8, 13, 9, 14, 6, 0, 10, 1, 4, 0, 11, 6, 5, 11, 2, 2, 9, 12, 1, 2, 12, 5, 13, 0, 7, 6, 3, 7, 11, 11, 8, 1, 11, 13, 8, 2, 10, 10, 2, 6, 6, 0, 0, 4, 4, 2, 11, 9, 1, 0, 14, 0, 1, 5, 5, 10, 2, 4, 6, 8, 0,};

                break;
            case 16030:
                copy(24724, config);
                config.name = "The Horde Slave";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 60 * -1227975681;
                config.scaleY = 60 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 16031:
                copy(12379, config);
                config.actions = new String[]{null, "Attack", null, null, null, "Examine"};
                config.showOptionsFirst = 0;
                config.priority = true;
                config.visibleOnMap = true;
                config.scaleXZ = 192 * -1227975681;
                config.scaleY = 192 * 745310987;
                config.anInt6187 = 3 * -1690840619;
                break;
            case 16032:
                copy(6743, config);
                config.name = "Evil Snowman";
                config.actions = new String[]{null, "Attack", null, null, null, "Examine"};
                config.showOptionsFirst = 0;
                config.priority = true;
                config.visibleOnMap = true;
                config.scaleXZ = 512 * -1227975681;
                config.scaleY = 512 * 745310987;
                config.anInt6187 = 4 * -1690840619;
                config.originalColors = new short[]{914, 929, 933, 7054, 37, 20};
                config.modifiedColors = new short[]{5, 5, 5, 938, 938, 938};
                break;
            case 16029:
                //copy(27315, config);
                config.models = new int[]{Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(50997).model * 381556007};
                config.name = "Twisted bow pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                config.originalColors = new short[]{8, 24, 33, 41};
                config.modifiedColors = new short[]{926, 1100, 926, (short) 302770};
                break;
            case 16005:
                copy(28097, config);
                config.name = "Galvek pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 24 * -1227975681;
                config.scaleY = 24 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 16033:
                copy(15147, config);
                config.name = "LolthenKILL pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 64 * -1227975681;
                config.scaleY = 64 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 16034:
                copy(4397, config);
                config.name = "Catablepon pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 64 * -1227975681;
                config.scaleY = 64 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 16035:
                copy(3077, config);
                config.name = "Dead Monk pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 64 * -1227975681;
                config.scaleY = 64 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 16007:
                copy(956, config);
                config.name = "Drunken Dwarf pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.priority = false;
                config.visibleOnMap = false;
                config.scaleXZ = 75 * -1227975681;
                config.scaleY = 75 * 745310987;
                config.anInt6187 = 2 * -1690840619;
                break;
            case 16008:
                copy(22668, config);
                config.name = "Maxhit Combat Dummy";
                config.actions[0] = config.actions[2] = config.actions[3] = config.actions[4] = null;
                break;
            case 16009:
                copy(27315, config);
                config.name = "Coins pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 16010:
                copy(21672, config);
                config.name = "Ahrim pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.priority = false;
                config.visibleOnMap = false;
                config.scaleXZ = 64 * -1227975681;
                config.scaleY = 64 * 745310987;
                break;
            case 16011:
                copy(21673, config);
                config.name = "Dharok pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.priority = false;
                config.visibleOnMap = false;
                config.scaleXZ = 64 * -1227975681;
                config.scaleY = 64 * 745310987;
                break;
            case 16012:
                copy(21674, config);
                config.name = "Guthan pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.priority = false;
                config.visibleOnMap = false;
                config.scaleXZ = 64 * -1227975681;
                config.scaleY = 64 * 745310987;
                break;
            case 16013:
                copy(21675, config);
                config.name = "Karil pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.priority = false;
                config.visibleOnMap = false;
                config.scaleXZ = 64 * -1227975681;
                config.scaleY = 64 * 745310987;
                break;
            case 16014:
                copy(21676, config);
                config.name = "Torag pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.priority = false;
                config.visibleOnMap = false;
                config.scaleXZ = 64 * -1227975681;
                config.scaleY = 64 * 745310987;
                break;
            case 16015:
                copy(21677, config);
                config.name = "Verac pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.priority = false;
                config.visibleOnMap = false;
                config.scaleXZ = 64 * -1227975681;
                config.scaleY = 64 * 745310987;
                break;
            case 16016:
                copy(15186, config);
                config.name = "Matrix pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 36 * -1227975681;
                config.scaleY = 36 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 16017:
                copy(15184, config);
                config.name = "Matrix pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 36 * -1227975681;
                config.scaleY = 36 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 16023:
                copy(15185, config);
                config.name = "Onyx pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 42 * -1227975681;
                config.scaleY = 42 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 16024:
                copy(22668, config);
                config.name = "Combat Dummy pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 42 * -1227975681;
                config.scaleY = 42 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 16025:
                copy(6990, config);
                config.name = "Corrupted Wolpertinger";
                config.actions = new String[]{null, "Attack", null, null, null, "Examine"};
                config.combatLevel = 1900 * 954057527;
                config.scaleXZ = 512 * -1227975681;
                config.scaleY = 512 * 745310987;
                config.anInt6187 = ((config.anInt6187 * -2095128707) * 4) * -1690840619;
                config.originalColors = new short[]{144, 136, 153, 266, 8380, 8389, 3479, 3497, 8398, 1678, 1674, 8366, 3482, 6311, 6290, 6301, 6295, 7488, 1554, 976, 960, 1420, 1693, 951, 1701, 1813, 1542, 8388, 1431, 7458, 1811, 8379, 8404, 5559, 1689, 8384, 8390, 8382, 7476, 7493, 3609, 1564, 1584, 1566, 1792, 2564, 8383, 7498, 7503, 1686, 1696, 6463, 6468, 6469, 8411, 6474, 6478, 1705, 8394, 8407, 1694, 151, 3488, 3483, 3475, 161, 1805, -27429, 277, 8386, 155, 154, 3492, 3471, 3486, 3477, 3499, 6322, 8377, 8387, 6462, 6490, -27417};
                config.modifiedColors = config.originalColors.clone();
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] += -80000;
                config.showOptionsFirst = 0;
                config.priority = true;
                config.visibleOnMap = true;
                break;
            case 16026:
                copy(6990, config);
                config.name = "Dark Wolpertinger";
                config.actions = new String[]{null, "Attack", null, null, null, "Examine"};
                config.combatLevel = 475 * 954057527;
                config.scaleXZ = 256 * -1227975681;
                config.scaleY = 256 * 745310987;
                config.anInt6187 = ((config.anInt6187 * -2095128707) * 2) * -1690840619;
                config.originalColors = new short[]{144, 136, 153, 266, 8380, 8389, 3479, 3497, 8398, 1678, 1674, 8366, 3482, 6311, 6290, 6301, 6295, 7488, 1554, 976, 960, 1420, 1693, 951, 1701, 1813, 1542, 8388, 1431, 7458, 1811, 8379, 8404, 5559, 1689, 8384, 8390, 8382, 7476, 7493, 3609, 1564, 1584, 1566, 1792, 2564, 8383, 7498, 7503, 1686, 1696, 6463, 6468, 6469, 8411, 6474, 6478, 1705, 8394, 8407, 1694, 151, 3488, 3483, 3475, 161, 1805, -27429, 277, 8386, 155, 154, 3492, 3471, 3486, 3477, 3499, 6322, 8377, 8387, 6462, 6490, -27417};
                config.modifiedColors = config.originalColors.clone();
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] += -5000;
                config.showOptionsFirst = 0;
                config.priority = true;
                config.visibleOnMap = true;
                break;
            case 16018:
                copy(648, config);
                config.name = "Dicing King";
                config.standAnimation = 4117;
                config.walkAnimation = 4117;
                config.walkBackwardsAnimation = 4117;
                config.actions = new String[]{"Gamble-with", null, null, null, null, "Examine"};
                break;
            case 16019:
                copy(8528, config);
                config.name = "Nomad pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 64 * -1227975681;
                config.scaleY = 64 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 16021:
                copy(28387, config);
                config.name = "Sotetseg pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 24 * -1227975681;
                config.scaleY = 24 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 16022:
                copy(8597, config);
                config.name = "Avatar of Creation pet";
                config.actions = new String[]{"Talk-to", null, "Pick-up", null, null, "Examine"};
                config.scaleXZ = 16 * -1227975681;
                config.scaleY = 16 * 745310987;
                config.anInt6187 = 1 * -1690840619;
                config.combatLevel = 0;
                config.priority = false;
                config.visibleOnMap = false;
                break;
            case 16020:
                copy(7585, config);
                config.name = "Donation guide";
                config.originalColors = new short[]{
                        16, 12, 20, 24, 10332, 10337, 4680, 4544, 8};
                config.modifiedColors = new short[config.originalColors.length];
                for (int i = 0; i < config.modifiedColors.length; i++)
                    config.modifiedColors[i] = (short) (338770 + (i * 3));
                config.scaleXZ = 128 * -1227975681;
                config.scaleY = 128 * 745310987;
                config.actions[0] = "Talk-to";
                config.actions[2] = "Trade";
                break;
            case 16006:
                copy(1303, config);
                config.name = "Fremennik guide";
                break;
            case 15186:
            case 15185:
            case 15184:
                config.priority = true;
                config.name = "Matrix";
                config.scaleXZ = 256 * -1227975681;
                config.scaleY = 256 * 745310987;
                config.anInt6187 = ((config.anInt6187 * -2095128707) * 2) * -1690840619;
                break;
            case 21212:
                copy(14304, config);
                config.priority = true;
                config.name = "Callus Frostborne";
                config.scaleXZ = 384 * -1227975681;
                config.scaleY = 384 * 745310987;
                config.anInt6187 = ((config.anInt6187 * -2095128707) * 3) * -1690840619;

                break;
            case 21200:
                copy(14304, config);
                config.priority = true;
                config.name = "Callus (Enduring)";
                config.scaleXZ = 384 * -1227975681;
                config.scaleY = 384 * 745310987;
                config.anInt6187 = ((config.anInt6187 * -2095128707) * 3) * -1690840619;
                break;
            case 21201:
                copy(14303, config);
                config.priority = true;
                config.name = "Callus (Sapping)";
                config.scaleXZ = 384 * -1227975681;
                config.scaleY = 384 * 745310987;
                config.anInt6187 = ((config.anInt6187 * -2095128707) * 3) * -1690840619;
                //System.out.println("ff" + Arrays.toString(config.modifiedColors));
                break;
            case 21202:
                copy(14302, config);
                config.priority = true;
                config.name = "Callus (Unstable)";
                config.scaleXZ = 384 * -1227975681;
                config.scaleY = 384 * 745310987;
                config.anInt6187 = ((config.anInt6187 * -2095128707) * 3) * -1690840619;
                break;
            case 21203:
                //copy(83, config);
                config.priority = true;
                config.anInt6187 = 2 * -1690840619;
                config.name = "Burning Brazier";
                config.combatLevel = 0;
                config.actions = new String[]{null, null, null, null, null, "Examine"};
                //origg [8146, 7104, 5056]
                //modd  [15314, 15296, 18368]
                config.models = new int[]{232270, 232269};
                config.originalColors = new short[]{8146, 7104, 5056};
                config.modifiedColors = new short[]{-32000, -31000, -31000};
                config.visibleOnMap = false;
                config.standAnimation = 27321;
                config.walkAnimation = 27321;
                config.walkBackwardsAnimation = 27321;
			/*config.scaleXZ = 384 * -1227975681;
			config.scaleY = 384 * 745310987;
			config.anInt6187 = ((config.anInt6187 * -2095128707) * 3)  * -1690840619;*/
                break;
            case 21204:
                //copy(83, config);
                config.priority = true;
                config.anInt6187 = 2 * -1690840619;
                config.name = "Brazier";
                config.combatLevel = 0;
                config.actions = new String[]{"Attack", null, null, null, null, "Examine"};
                config.models = new int[]{232266};
                //947, -21581, 11200, 6057, -21581, 6057
                config.visibleOnMap = false;
		/*config.scaleXZ = 384 * -1227975681;
		config.scaleY = 384 * 745310987;
		config.anInt6187 = ((config.anInt6187 * -2095128707) * 3)  * -1690840619;*/
                break;
        }
    }


    public static int getOldLookNPC(int id) {
        switch (id) {
            case 50: //kbd
                return 20239;


            case 6260: //- General Graardor
                return 22215;
            case 6261: //- Sergeant Strongstack
                return 22216;
            case 6263: //- Sergeant Steelwill
                return 22217;
            case 6265: //- Sergeant Grimspike
                return 22218;


            case 6247: //- Commander Zilyana
                return 22205;
            case 6248:// - Starlight
                return 22206;
            case 6250:// - Growler
                return 22207;
            case 6252:// - Bree
                return 22208;


            case 6203: //- K'ril Tsutsaroth
                return 23129;
            case 6204:// - Tstanon Karlak
                return 23130;
            case 6206: //- Zakl'n Gritch
                return 23131;
            case 6208:// - Balfrug Kreeyath
                return 23132;

            case 6222: //- Kree'arra
                return 23162;
            case 6223:// - Wingman Skree
                return 23163;
            case 6225:// - Flockleader Geerin
                return 23164;
            case 6227:// - Flight Kilisa
                return 23165;

            case 2025: //- ahrim
                return 21672;
            case 2026: //- Dharok the Wretched
                return 21673;
            case 2027: //- Guthan the Infested
                return 21674;
            case 2028: //- Karil the Tainted
                return 21675;
            case 2029: //- Torag the Corrupted
                return 21676;
            case 2030: //- Verac the Defiled
                return 21677;
        }
        return id;
    }


    public static void copy(int id, NPCConfig to) {
        copy(Class15.aClass507_224.method6269(id, 0), to);
    }


    public static void copy(NPCConfig from, NPCConfig to) {
        to.name = from.name;
        to.actions = from.actions.clone();
        to.models = from.models;
        to.headModels = from.headModels;
        to.scaleXZ = from.scaleXZ;
        to.scaleY = from.scaleY;
        to.shadow = from.shadow;
        to.lightness = from.lightness;
        to.aClass437_6159 = from.aClass437_6159;
        to.visibleOnMap = from.visibleOnMap;
        to.priority = from.priority;
        to.standAnimation = from.standAnimation;
        to.walkAnimation = from.walkAnimation;
        to.opcode15V = from.opcode15V;
        to.opcode16V = from.opcode16V;
        to.anInt6187 = from.anInt6187; //size
        to.combatLevel = from.combatLevel;
        to.stanceID = from.stanceID;
        if (from.originalColors != null) {
            to.originalColors = from.originalColors.clone();
            to.modifiedColors = from.modifiedColors.clone();
        }
    }

}
