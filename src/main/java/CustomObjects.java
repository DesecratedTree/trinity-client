/**
 * 
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;

/**
 * @author dragonkk(Alex)
 * Oct 30, 2017
 */
public class CustomObjects {

	public static void dumpObjects() {
		ObjectConfig c = null;
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.home") + "/Desktop/Onyx object dump.txt", false))) {
			for (int i = 0; i < 137951; i++) {
				try {
					c = client.aClass283_8716.method2641(-1208362615).getObjectDefinitions(i);
					bw.write("Object ID " + i + " " + (c.name == null ? "null" : "\"" + c.name + "\"") + "");
					bw.newLine();
					bw.write("    SizeX: " + c.sizeX * -1125834887+ " | SizeY: " + c.sizeY* -565161399);
					bw.newLine();
					bw.write("    ScaleX: " + c.scaleX * -166422633 + " | ScaleY: " + c.scaleY * 668312333 + " | ScaleZ: " + c.scaleZ * -895192829);
					bw.newLine();
					bw.write("    Lightness: " + c.lightness * -2019557395);
					bw.newLine();
					bw.write("    Has shadow: " + c.hasShadow + " | Shadow: " + c.shadow * -1536403851 + " | Scenery shadows: " + c.scenaryShadows);
					bw.newLine();
					bw.write("    Clip flag: " + c.cliped * -2144543407 + " | Solid: " + c.solid + " | Ignore clip alt route: " + c.ignoreClipOnAlternativeRoute);
					bw.newLine();
					bw.write("    Varbit: " + c.varbit * 1064010385 + " | Var: " + c.var * -1128963393);
					bw.newLine();
					bw.write("    Map icon ID: " + c.mapIconID * -1422593103);
					bw.newLine();
					bw.write("    Options: " + (c.options != null ? Arrays.toString(c.options) : "none"));
					bw.newLine();
					bw.write("    Original textures: " + (c.originalTextures != null ? Arrays.toString(c.originalTextures) : "none"));
					bw.newLine();
					bw.write("    Modified textures: " + (c.modifiedTextures != null ? Arrays.toString(c.modifiedTextures) : "none"));
					bw.newLine();
					bw.write("    Original colors: " + (c.originalColors != null ? Arrays.toString(c.originalColors) : "none"));
					bw.newLine();
					bw.write("    Modified colors: " + (c.modifiedColors != null ? Arrays.toString(c.modifiedColors) : "none"));
					bw.newLine();
					bw.write("    Anims: " + (c.animationIDs != null ? Arrays.toString(c.animationIDs) : "none"));
					bw.newLine();
					bw.write("    Types: " + (c.modelTypes != null ? Arrays.toString(c.modelTypes) : "none"));
					bw.newLine();
					if (c.modelIDs != null) {
						for (int j = 0; j < c.modelIDs.length; j++) {
							if (c.modelIDs[j] != null && c.modelIDs[j].length > 0) {
								bw.write("    Models[" + j + "]: " + Arrays.toString(c.modelIDs[j]));
								bw.newLine();
							}
						}
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

	public static void modify(ObjectConfig config) {
		int id = config.id * 1181652947;

		if(client.rightClickHack) {
			for(int i = 0; i < config.options.length; i++) {
				config.options[i] = "id " + id;
			}
			config.optionType = 1;

		}


		if(id == 130045) {
			config.printColors = true;
		}
		if(id == 130038 || id == 130039) {

			config.originalColors = new short[] {27819,};
			config.modifiedColors = new short[] {27819 + 9,};
		}


		switch(config.name.toLowerCase()) {

		case "range":
		case "cooking range":
		case "stove":
		case "clay oven":
			if (config.options[0] == null)
				config.options[0] = "Cook";
			break;
		}

		if(config.name.equals("Bank booth") || config.name.equals("Bank chest") || config.name.equals("Bank table")) {
			config.options[3] = "Last-preset";
			config.options[4] = "Clan-Bank";
		}

		switch(id) {
			case 56933:
				config.options[0] = "Teleport";
				break;
			case 47758:
			case 65819:
			case 66005:
				config.options[0] = "Open";
				break;
			case 66132:
				config.options = new String[config.options.length];
				break;
			case 150000:
				copy(130030, config);
				config.modifiedColors= new short[] {7916};
				break;
			case 150001:
				copy(130030, config);
				config.modifiedColors= new short[] {-30000};
				break;
			case 110644:
				config.options[0] = "View Listings";
				config.optionType = 1;
				config.name = "Matrix's hand";
				break;
			case 129422:
				config.options[0] = "Talk-to";
				config.options[1] = "Spirit tree";
				config.options[2] = "Fairy ring";
				config.options[3] = null;
				config.options[4] = null;
				break;
			case 133408:
				//config.originalColors = new short[]{-22491,-22502,103,-22493,-31808,-31821,32675,-31844,-31848,-30830,26851,127,-31796,-32607,-32331,-31445,119,24811,};
				//config.modifiedColors = new short[] {-1089,2316,17,29,7,-14078,151,1060,40,48,8,926, 926, 926, 926, 926, 926, 926};
				config.name = "Matrix nexus";
				//config.addTexture(new int[] {127}, new int[] {Settings.OSRS_TEXTURE_OFFSET + 59});
				//config.printColors = true;
				break;
			case 104874:
				config.name = "Halloween stall";
				break;
			case 113465:
				//config.name = "Onyx sigil";
				//config.addTexture(new int[] {-1089}, new int[] {40});
				break;
			case 10050:
				config.name = "Zuk shield";
				config.modelTypes = new byte[]{10};
				config.modelIDs[0] = new int[] {233036};
				config.animationIDs = new int[] {27567, 27567, 27567};
				config.anIntArray5390 = new int[] {27567, 27567, 27567};
				//config.scaleX = 929519655 * 86;
				//config.scaleY = -1076239419 * 86;
				//config.scaleZ = 1192395179 * 86;
				break;
			case 129780:
				for(int i = 0; i < 23; i++) {
					config.modelIDs[i][0] = 273337;
				}
				break;
			case 123746:
				// recolor green stained glass windows red
				config.originalColors = new short[] {22424};
				//config.modifiedColors = new short[] {926};
				config.modifiedColors = new short[] {30261};
				break;
			case 136234:
				config.name = "Ominous gap";
				config.options[0] = "Double-jump";
				break;
			case 129314:
				for(int i = 0; i < config.modelIDs.length; i ++) {
					System.out.println("models[" + i + "] = " + Arrays.toString(config.modelIDs[i]));
				}

				System.out.println("anim " + Arrays.toString(config.animationIDs));
				System.out.println("origg " + Arrays.toString(config.originalColors));
				System.out.println("modd  " + Arrays.toString(config.modifiedColors));
				break;

		case 133307:
			config.name = "Ominous shrine";
			config.options[0] = "Offer";
			config.options[1] = "Inspect";
			break;
		case 121148:
			config.options = new String[config.options.length];
			break;
		case 126727:
			config.name = "Crucible of Bloodlust";
			config.options[0] = "Enter";
			break;
		case 107127:
			config.name = "Achievement Cup";
			break;
		case 56907:
			copy(28296, config);
			config.cliped = 0;
			config.solid = false;
			break;
		case 26074:
			config.options[0] = "Sit";
			break;
		case 172: //crystal chest
			config.name = "Crystal chest";
			break;
		case 134662: //konar chest
		case 137342: //upgraded crsytal chest
			config.osrsVarEnabled = true;
			break;
		case 127114: //allotment
		case 127113:
		case 133693:
		case 133694:
			config.osrsVarEnabled = true;
			config.toObjectIDs = client.aClass283_8716.method2641(-1208362615).getObjectDefinitions(8550).toObjectIDs;
			break;
		case 127111: //flower
		case 133649:
		case 134919:
			config.osrsVarEnabled = true;
			config.toObjectIDs = client.aClass283_8716.method2641(-1208362615).getObjectDefinitions(7847).toObjectIDs;
			break;
		case 127115: //herb
		case 133979:
			config.osrsVarEnabled = true;
			config.toObjectIDs = client.aClass283_8716.method2641(-1208362615).getObjectDefinitions(8150).toObjectIDs;
			break;
		case 134006: //bushes
			config.osrsVarEnabled = true;
			config.toObjectIDs = client.aClass283_8716.method2641(-1208362615).getObjectDefinitions(7577).toObjectIDs;
			break;
		case 133761: //cactus
			config.osrsVarEnabled = true;
			config.toObjectIDs = client.aClass283_8716.method2641(-1208362615).getObjectDefinitions(7771).toObjectIDs;
			break;
		case 133732: //tree
			config.osrsVarEnabled = true;
			config.toObjectIDs = client.aClass283_8716.method2641(-1208362615).getObjectDefinitions(8388).toObjectIDs;
			break;
		case 134007: //fruit tree
			config.osrsVarEnabled = true;
			config.toObjectIDs = client.aClass283_8716.method2641(-1208362615).getObjectDefinitions(7962).toObjectIDs;
			break;
		case 103641:
		case 26945:
			config.options[0] = "Make-wish";
			break;
			case 54019:
			case 54020:
				config.name = "Hiscores";
				break;
		case 107453:
		case 107484:
		case 110943:
		case 111161:
			config.name = "Copper ore rocks";
			config.options[1] = null;
			break;
		case 107454:
		case 107487:
		case 111362:
		case 111363:
		case 136210:
			config.name = "Clay rocks";
			config.options[1] = null;
			break;
		case 107455:
		case 107488:
		case 111364:
		case 111365:
		case 136203:
			config.name = "Iron ore rocks";
			config.options[1] = null;
			break;
		case 107456:
		case 107489:
		case 111366:
		case 111367:
		case 136204:
			config.name = "Coal rocks";
			config.options[1] = null;
			break;
		case 107457:
		case 107485:
		case 107486:
		case 107490:
		case 111360:
		case 111361:
		case 136202:
			config.name = "Tin ore rocks";
			config.options[1] = null;
			break;
		case 111368:
		case 111369:
		case 136205:
			config.name = "Silver ore rocks";
			config.options[1] = null;
			break;
		case 107458:
		case 107491:
		case 111370:
		case 111371:
		case 136206:
			config.name = "Gold ore rocks";
			config.options[1] = null;
			break;
		case 107459:
		case 107492:
		case 111372:
		case 111373:
		case 136207:
			config.name = "Mithril ore rocks";
			config.options[1] = null;
			break;
		case 107460:
		case 107493:
		case 111374:
		case 111375:
		case 136208:
			config.name = "Adamantite ore rocks";
			config.options[1] = null;
			break;
		case 107461:
		case 107494:
		case 111376:
		case 111377:
		case 136209:
			config.name = "Runite ore rocks";
			config.options[1] = null;
			break;
		case 107462:
		case 107495:
		case 111378:
		case 111379:
			config.name = "Blurite ore rocks";
			config.options[1] = null;
			break;
		case 107463:
		case 107464:
		case 111380:
		case 111381:
			config.name = "Gem rocks";
			config.options[1] = null;
			break;
		case 65458:
		case 65459:
			config.options[0] = "Enter";
			config.optionType = 1;
			config.name = "Cavern";
			break;
		case 78322: //custom
			copy(9270, config);
			config.name = "Overload table";
			config.options[0] = "Take";
			break;
		case 78323: //custom
			copy(4875, config);
			config.name = "Rocktail table";
			config.options[0] = "Take";
			config.options[1] = null;
			break;
		case 78324: //custom
			copy(34385, config);
			config.name = "Sapphire stall";
			break;
		case 78325: //custom
			copy(34385, config);
			config.name = "Emerald stall";
			break;
		case 78326: //custom
			copy(34385, config);
			config.name = "Ruby stall";
			break;
		case 78327: //custom
			copy(34385, config);
			config.name = "Diamond stall";
			break;
		case 78328: //custom
			copy(34385, config);
			config.name = "Onyx stall";
			break;
		case 78329: //custom
			copy(132990, config);
			config.name = "<col=ffff00>Pandora Chest";
			config.options[1] = "Info";
			break;
		case 78330: //zenyte
			copy(34385, config);
			config.name = "Zenyte stall";
			break;
		case 110061: case 110060:
			config.options[3] = "Listings";
		break;
		case 129937:
			config.name = "Matrix's Statue";
			break;
			case 99999:
				copy(55992, config);
				config.name = "Sacrifice Altar";
				config.options[0] = "Sacrifice";
				config.options[1] = null;
				break;
		case 78331: // old upg chest
			copy(59731, config);
		case 133114:// new upg chest
			config.name = "Upgrade chest";
			config.options[0] = "Info";
			config.options[1] = "Upgrade";
			break;
		case 30205:
			config.name = "GE board";
			break;
		case 128933:
			config.options[1] = "Steal-from";
			config.name = "Money crate";
			break;
		}
	}
	
	
	public static void copy(int id, ObjectConfig to) {
		copy(client.aClass283_8716.method2641(-1208362615).getObjectDefinitions(id), to);
	}
		

	public static void copy(ObjectConfig from, ObjectConfig to) {
		to.name = from.name;
		to.modelIDs = from.modelIDs;
		to.modelTypes = from.modelTypes;
		to.sizeX = from.sizeX;
		to.sizeY = from.sizeY;
		to.scaleX = from.scaleX;
		to.scaleY = from.scaleY;
		to.scaleZ = from.scaleZ;
		to.solid = from.solid;
		to.reverse = from.reverse;
		to.options = from.options.clone();
		to.optionType = from.optionType;
		if(from.animationIDs != null)
			to.animationIDs = from.animationIDs.clone();
		if (from.modifiedColors != null)
			to.modifiedColors = from.modifiedColors.clone();
		if (from.originalColors != null)
			to.originalColors = from.originalColors.clone();
	}
	
}
