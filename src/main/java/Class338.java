
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class338 {
	static int anInt3628 = -1;//TODO
	static int anInt3629 = 2;
	public static int anInt3630;
	static boolean aBoolean3631 = false;
	static int anInt3632 = 1;//TODO

	Class338() throws Throwable {
		throw new Error();
	}

	static final void method4113(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Interface class298_sub51 = ((Interface) client.aClass437_8841.method5812((long) i_0_));
			if (null != class298_sub51)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 1;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oc.rx(").append(')').toString());
		}
	}

	public static byte[] method4114(Object object, boolean bool, int i) {
		try {
			if (object == null)
				return null;
			if (object instanceof byte[]) {
				byte[] is = (byte[]) object;
				if (bool)
					return Arrays.copyOf(is, is.length);
				return is;
			}
			if (object instanceof ByteBuffer) {
				ByteBuffer bytebuffer = (ByteBuffer) object;
				byte[] is = new byte[bytebuffer.capacity()];
				bytebuffer.position(0);
				bytebuffer.get(is);
				return is;
			}
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oc.f(").append(')').toString());
		}
	}

	public static Class119 method4115(int i, int[] is, Class119 class119, boolean bool, byte i_1_) {
		try {
			if (!Class270.aClass243_2894.method2291(i, 2091513640))
				return null;
			int i_2_ = Class270.aClass243_2894.method2316(i, -1254954272);
			WidgetConfig[] class105s;
			if (i_2_ == 0)
				class105s = new WidgetConfig[0];
			else if (null == class119)
				class105s = new WidgetConfig[i_2_];
			else
				class105s = class119.components;
			if (class119 == null)
				class119 = new Class119(bool, class105s);
			else {
				class119.components = class105s;
				class119.aBoolean1403 = bool;
			}
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
				if (class119.components[i_3_] == null) {
					byte[] is_4_ = Class270.aClass243_2894.method2289(i, i_3_, is, -1925510913);
					if (null != is_4_) {
						WidgetConfig class105 = (class119.components[i_3_] = new WidgetConfig());
						class105.uid = (i_3_ + (i << 16)) * 533296807;
						class105.decode(new RsByteBuffer(is_4_), 1142190823);
					}
				}
			}
			if (i == 596) { //login screen
				class119.components[41].anObjectArray1244[2] = 19027; //mouse hover
				class119.components[41].anObjectArray1122[2] = 19026; //mouse leave
			}
			//TODO only for rezisable on osrs gameframe
			if (i == 748 && Class190.getDisplayMode((byte) -125) >= 2 && Settings.ENABLE_OSRS_GAMEFRAME) {
				WidgetConfig config = class119.components[1];
				config.setSize(8, 34);
				config.setPos(config.getX() + 8, config.getY());
				config = class119.components[2];
				config.setSize(8, 34);
				config.setPos(config.getX() + 8, config.getY());
			} else if ( i == 749 && Class190.getDisplayMode((byte) -125) >= 2 && Settings.ENABLE_OSRS_GAMEFRAME) {
					WidgetConfig config = class119.components[4];
					config.setSize(8, 34);
					config.setPos(config.getX() + 8, config.getY());
			} else if ( i == 750 && Class190.getDisplayMode((byte) -125) >= 2 && Settings.ENABLE_OSRS_GAMEFRAME) {
				WidgetConfig config = class119.components[4];
				config.setSize(8, 34);
				config.setPos(config.getX() + 8, config.getY());
			} else if ( i == 747 && Class190.getDisplayMode((byte) -125) >= 2 && Settings.ENABLE_OSRS_GAMEFRAME) {
				WidgetConfig config = class119.components[5];
				config.setSize(8, 34);
				config.setPos(config.getX() + 8, config.getY());
			} else if (i == 75) {
				class119.components[0].width  = 100 * -478399925; 
			} else if (i == 596) {
				Class491.hideWidget(39059544, Preferences.rememberUsername == 2 ? 0 : 1, -109953213);
			} else if (i == 893) {
				class119.components[7].anObjectArray1257 = null;
				class119.components[9].anObjectArray1257 = null;
				class119.components[11].anObjectArray1257 = null;
				class119.components[13].anObjectArray1257 = null;
				class119.components[15].anObjectArray1257 = null;
				class119.components[18].anObjectArray1257 = null;
			} else if (i == 1312) {
				int[] TEXT_COMPONENTS = new int[] { 38, 46, 54, 62, 70, 78, 86, 94, 102 };
				for (int k : TEXT_COMPONENTS)
					class119.components[k].anObjectArray1257 = null;
				class119.components[27].anObjectArray1257 = null;
			} else if (i == 925) {
				class119.components[0].anObjectArray1257 = null;
			} else if (i == 1015) {
				class119.components[144].options[0] = "Select";
				class119.components[146].options[0] = "Select";
				class119.components[148].options[0] = "Select";
				class119.components[150].options[0] = "Select";
				class119.components[152].options[0] = "Select";
				class119.components[154].options[0] = "Select";
				class119.components[156].options[0] = "Confirm";
				class119.components[155].x = 65 * 2145953887;
				class119.components[156].x = 65 * 2145953887;
				class119.components[155].y = 225 * 1215865909;
				class119.components[156].y = 225 * 1215865909;
			} else if (i == 1297) {
				class119.components[249].anObjectArray1257 = null;
				class119.components[273].anObjectArray1257 = null;
				class119.components[266].anObjectArray1257 = null;
				class119.components[259].anObjectArray1257 = null;
				
				
				/**
				 * for (int k = 0; k < class119.components.length; k++)
					class119.components[k].anObjectArray1257 = null;
				 */
				
			} else if (i == 1330) {
				class119.components[4].options[0] = "Select";
				class119.components[6].options[0] = "Select";
				class119.components[8].options[0] = "Select";
				class119.components[10].options[0] = "Select";
				class119.components[12].options[0] = "Select";
			} else if (i == 320) { //skill tab
				for (int k = 0; k < class119.components.length; k++) {
					if (class119.components[k].options != null
							&& class119.components[k].options[3].equals("Clear Target")) {
						class119.components[k].options = new String[] {"View Guide","Teleport", "Set Level Target", "Set XP Target", "Clear Target"};
						class119.components[k].aClass298_Sub38_1219 = new Class298_Sub38(46, -1);
					}
					//30, -1
				}
			} else if (i == 548) {

			/*	for (int k = 0; k < class119.components.length; k++) {
					if (class119.components[k].getSpriteID() != -1)
						System.out.println(k+", "+class119.components[k].getSpriteID());
					if (class119.components[k].options != null)
						System.out.println(k+", "+Arrays.toString(class119.components[k].options));
				}*/
				WidgetConfig config = class119.components[76];
				config.setSize(25, 25);
				config.setPos(config.getX() - 2, config.getY() - 4);
				/*class119.components[0].anObjectArray1245 = class119.components[5].anObjectArray1245;
				class119.components[5].anObjectArray1245 = null;
				System.out.println(class119.components[0].anObjectArray1245);*/
				
				
				if (Settings.ENABLE_OSRS_GAMEFRAME) {
					
					//fox pos
					config = class119.components[76]; //rollcost
					config.setPos(config.getX(), config.getY() - 2);
					
					config = class119.components[106]; //combat
					config.setSpriteID(20911);
					config.setPos(config.getX() - 3, config.getY() - 6);
					config.setSize(32, 36);
					
					
					config = class119.components[107]; //tp
					config.setPos(config.getX() - 1, config.getY() - 1);
					config.setSize(25, 25);
					
					config = class119.components[110]; //inv
					config.setSpriteID(20884);
					config.setPos(config.getX() - 4, config.getY() - 7);
					config.setSize(31, 34);
					
					config = class119.components[111]; //equipment
					config.setSpriteID(20885);
					config.setPos(156, 2);
					config.setSize(32, 36);
					
					config = class119.components[112]; //prayer
					config.setSpriteID(20886);
					config.setPos(config.getX() - 3, config.getY() - 5);
					config.setSize(31, 34);
					
					config = class119.components[113]; //mage
					config.setSpriteID(20887);
					config.setPos(config.getX() - 5, config.getY() - 7);
					config.setSize(31, 34);
					
					
					config = class119.components[77]; //friends
					config.setSpriteID(20888);
					config.setPos(config.getX() - 3, config.getY() - 5);
					config.setSize(31, 34);
					
					config = class119.components[78]; //fc  custom sprite
					config.setSpriteID(19998);
					config.setPos(config.getX() + 2 , config.getY() - 3);
					config.setSize(23, 27);
					
					config = class119.components[79]; //fc
					config.setSpriteID(20904);
					config.setPos(config.getX() - 3, config.getY() - 9);
					config.setSize(32, 36);
					
					config = class119.components[80]; //settings
					config.setSpriteID(20908);
					config.setPos(config.getX() - 3, config.getY() - 6);
					config.setSize(31, 35);
					
					
					config = class119.components[81]; //fc
					config.setSpriteID(20892);
					config.setPos(config.getX() - 3, config.getY() - 5);
					config.setSize(31, 34);
					
					config = class119.components[82]; //fc
					config.setSpriteID(20893);
					config.setPos(config.getX() - 3, config.getY() - 5);
					config.setSize(31, 34);
					
					config = class119.components[144]; //radar
					config.setSpriteID(19997);
					
					
				}
			} else if (i == 746) {

			//	class119.components[75].options[0] = "Teleports";


				WidgetConfig config = class119.components[66];
				config.setSize(25, 25);
				config.setPos(config.getX() + 3 , config.getY() + 5);


				if (Settings.ENABLE_OSRS_GAMEFRAME) {
					
					config = class119.components[190]; //radar
					config.setSize(160, 160);
					config.setPos(config.getX()+8, config.getY()+8);
					
					
					
					config = class119.components[58]; //combat
					config.setSpriteID(20911);
					
				
					
					config = class119.components[62]; //inv
					config.setSpriteID(20884);
					
					config = class119.components[63]; //equipment
					config.setSpriteID(20885);
					
					config = class119.components[64]; //prayer
					config.setSpriteID(20886);
					
					config = class119.components[65]; //mage
					config.setSpriteID(20887);
					
					
					config = class119.components[67]; //friends
					config.setSpriteID(20888);
					
					config = class119.components[68]; //fc  custom sprite
					config.setSpriteID(19998);
					config.setPos(config.getX() + 3, config.getY() + 4);
					config.setSize(22, 28);
					
					config = class119.components[69]; //fc
					config.setSpriteID(20904);
					
					config = class119.components[70]; //settings
					config.setSpriteID(20908);
					
					
					config = class119.components[71]; //anim
					config.setSpriteID(20892);
					
					config = class119.components[72]; //music
					config.setSpriteID(20893);
					
					config = class119.components[107];
					config.anObjectArray1257[0] = 582; //sets border
					
				}
			} else if (i == 3002) { 
				Class119 notesInter = Class338.method4115(34, is, Class389.aClass119Array4165[34], false, (byte) 3);
				if (notesInter == null)
					return null;
				class119.components[0] = notesInter.components[0];
				class119.components[1] = notesInter.components[4];
				class119.components[57] = notesInter.components[5];
				
				class119.components[62].options[0] = "Journal";
				class119.components[61].options[0] = "Quests";
				class119.components[60].options[0] = "Achievement Diary";
				class119.components[59].options[0] = "Completionist cape";
				class119.components[26].options[0] = "Presets";
			} 
			return class119;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oc.k(").append(')').toString());
		}
	}
}
