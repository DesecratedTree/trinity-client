/* Class414 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Console {
	static int anInt4261;
	static int anInt4262 = 0;
	//color arrays
	public static int[] anIntArray4263;
	public static int[] colorArray;
	public static int[] anIntArray4265;
	public static Class421 aClass421_4266;

	static {
		anInt4261 = 0;
	}

	Console() throws Throwable {
		throw new Error();
	}

	static final void method5240(Class430 class430, int i) {
		try {
			if (Class238.aClass355_2583.isKeyHeld(82, 50964531))
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 1;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rf.adb(").append(')').toString());
		}
	}

	public static void method5241(String string, boolean bool, boolean bool_0_, int i) {
		try {
			do {
				try {
					if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
						Class56.panelBoxMessage("commands - This command", 217077475);
						Class56.panelBoxMessage("cls - Clear console", -1411631737);
						Class56.panelBoxMessage("displayfps - Toggle FPS and other information", 1315064010);
						Class56.panelBoxMessage("renderer - Print graphics renderer information", 930159840);
						Class56.panelBoxMessage("heap - Print java memory information", 33489331);
						Class56.panelBoxMessage("getcamerapos - Print location and direction of camera for use in bug reports", -331045150);
						Class56.panelBoxMessage("voices - Turn voices on or off", -331045150);
						Class56.panelBoxMessage("addvoice/removevoice - Add or remove a player's name from the voices list", -331045150);
						Class56.panelBoxMessage("zoomin/zoomout - Zoom in or zoom out", -331045150);
					} else if (string.equalsIgnoreCase("cls")) {
						Class5.anInt71 = 0;
						Class5.anInt77 = 0;
					} else if (string.startsWith("changecolors")) {
						int itemId = Integer.parseInt(string.split(" ")[1]);
						int color = Integer.parseInt(string.split(" ")[2]);
						ItemDefinitions.changeColors(itemId, color);
					} else if (string.equalsIgnoreCase("zoomin")) {
						SpecialKeys.displayTheatre(1);
					} else if (string.equalsIgnoreCase("zoomout")) {
						SpecialKeys.displayTheatre(-1);
					} else if (string.equalsIgnoreCase("displayfps")) {
						client.aBoolean8983 = !client.aBoolean8983;
						if (client.aBoolean8983)
							Class56.panelBoxMessage("FPS on", 93254474);
						else
							Class56.panelBoxMessage("FPS off", -1679027115);
					} else if (string.equals("renderer")) {
						Class51 class51 = Class361.aClass_ra3793.f();
						Class56.panelBoxMessage(new StringBuilder().append("Toolkit ID: ").append(Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(869655613)).toString(), -563122681);
						Class56.panelBoxMessage(new StringBuilder().append("Vendor: ").append(class51.anInt488 * 239892561).toString(), 1436551699);
						Class56.panelBoxMessage(new StringBuilder().append("Name: ").append(class51.aString483).toString(), 130719993);
						Class56.panelBoxMessage(new StringBuilder().append("Version: ").append(-776662177 * class51.anInt490).toString(), -650994340);
						Class56.panelBoxMessage(new StringBuilder().append("Device: ").append(class51.aString484).toString(), -1812085083);
						Class56.panelBoxMessage(new StringBuilder().append("Driver Version: ").append(class51.aLong492 * -194081332353103341L).toString(), -709372634);
					} else if (string.equals("heap"))
						Class56.panelBoxMessage(new StringBuilder().append("Heap: ").append(Class332.anInt6617 * -270157335).append("MB").toString(), 851660487);
					else {
						if (!string.equalsIgnoreCase("getcamerapos"))
							break;
						Class381 class381 = client.aClass304_9030.method3022(-187074499);
						Class56.panelBoxMessage(new StringBuilder().append("Pos: ").append(Class263_Sub2.myPlayer.aByte8658).append(",").append(((-1795110955 * Class471.anInt5612 >> 9) + class381.gameSceneBaseX * -1261027839) >> 6).append(",").append(((Class325_Sub3.anInt7484 * 1947030235 >> 9) + -1542584207 * class381.gameSceneBaseY) >> 6).append(",").append(((-1795110955 * Class471.anInt5612 >> 9) + class381.gameSceneBaseX * -1261027839) & 0x3f).append(",").append(((Class325_Sub3.anInt7484 * 1947030235 >> 9) + class381.gameSceneBaseY * -1542584207) & 0x3f).append(" Height: ").append((Class431.method5342(-1795110955 * Class471.anInt5612, 1947030235 * Class325_Sub3.anInt7484, (Class263_Sub2.myPlayer.aByte8658), 1996761881)) - Gfx.anInt578 * 2005017147).toString(), 74641516);
						Class56.panelBoxMessage(new StringBuilder().append("Look: ").append(Class263_Sub2.myPlayer.aByte8658).append(",").append((class381.gameSceneBaseX * -1261027839 + 1926405341 * Class150_Sub2.anInt7270) >> 6).append(",").append((Class330_Sub39.anInt7766 * -592887685 + class381.gameSceneBaseY * -1542584207) >> 6).append(",").append((Class150_Sub2.anInt7270 * 1926405341 + class381.gameSceneBaseX * -1261027839) & 0x3f).append(",").append((Class330_Sub39.anInt7766 * -592887685 + class381.gameSceneBaseY * -1542584207) & 0x3f).append(" Height: ").append((Class431.method5342(Class150_Sub2.anInt7270 * 1926405341, Class330_Sub39.anInt7766 * -592887685, (Class263_Sub2.myPlayer.aByte8658), 1996761881)) - 1767087425 * Class366.anInt3856).toString(), 524539179);
					}
				} catch (Exception exception) {
					exception.printStackTrace();
					Class56.panelBoxMessage((Class526.aClass526_6139.method6257(Class429.aClass454_4369, 991479434)), 1164951932);
				}
				return;
			} while (false);
			if (Class457.aClass457_6834 != Class404.aClass457_4162 || -2051927139 * client.anInt9182 >= 2) {
				try {
					if (string.equalsIgnoreCase("wm1")) {
						Class96.method1182(1, -1, -1, false, -1188403631);
						if (Class545.method6347(1079239502) == 1)
							Class56.panelBoxMessage("Success", 1452127608);
						else
							Class56.panelBoxMessage("Failure", 1347710540);
						return;
					}
					if (string.equalsIgnoreCase("wm2")) {
						Class96.method1182(2, -1, -1, false, 207484190);
						if (Class545.method6347(1079239502) == 2)
							Class56.panelBoxMessage("Success", -1390408702);
						else
							Class56.panelBoxMessage("Failure", -2039683645);
						return;
					}
					if (Class503.aBoolean5914 && string.equalsIgnoreCase("wm3")) {
						Class96.method1182(3, 1024, 768, false, 500293700);
						if (Class545.method6347(1079239502) == 3)
							Class56.panelBoxMessage("Success", -1506610275);
						else
							Class56.panelBoxMessage("Failure", 2142657040);
						return;
					}
					if (string.startsWith("setlobby ")) {
						int i_1_ = -1;
						Object object = null;
						string = string.substring(9);
						int i_2_ = string.indexOf(' ');
						if (-1 == i_2_)
							Class56.panelBoxMessage("Failure", -567029659);
						else {
							try {
								i_1_ = Integer.parseInt(string.substring(0, i_2_));
							} catch (NumberFormatException numberformatexception) {
								/* empty */
							}
							if (i_1_ == -1)
								Class56.panelBoxMessage("Failure", -523890696);
							else {
								String string_3_ = new StringBuilder().append(string.substring(i_2_ + 1).trim()).append(".elveron.org").toString();
								Class273.method2683(string_3_, i_1_, -1019977290);
								Class56.panelBoxMessage("Success", -930515047);
								return;
							}
							return;
						}
						return;
					}
					if (string.equalsIgnoreCase("tk0")) {
						Class171.method2046(0, false, 1592920186);
						if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-1258817812) == 0) {
							Class56.panelBoxMessage("Success", 130798371);
							Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub23_7908), 0, 525979833);
							Class435.method5568(1714181576);
							client.aBoolean9194 = false;
						} else
							Class56.panelBoxMessage("Failure", -1675557792);
						return;
					}
					if (string.equalsIgnoreCase("tk1")) {
						Class171.method2046(1, false, -571581890);
						if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(677222180) == 1) {
							Class56.panelBoxMessage("Success", -1599774868);
							Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub23_7908), 1, -1294708163);
							Class435.method5568(2063196158);
							client.aBoolean9194 = false;
						} else
							Class56.panelBoxMessage("Failure", -1887360609);
						return;
					}
					if (string.equalsIgnoreCase("tk2")) {
						Class171.method2046(2, false, 1993347373);
						if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-1115136947) == 2) {
							Class56.panelBoxMessage("Success", -134410441);
							Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub23_7908), 2, -1265686675);
							Class435.method5568(1650338802);
							client.aBoolean9194 = false;
						} else
							Class56.panelBoxMessage("Failure", -1053896501);
						return;
					}
					if (string.equalsIgnoreCase("tk3")) {
						Class171.method2046(3, false, 1277022802);
						if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-1120470991) == 3) {
							Class56.panelBoxMessage("Success", 147005115);
							Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub23_7908), 3, 1945399125);
							Class435.method5568(1768990869);
							client.aBoolean9194 = false;
						} else
							Class56.panelBoxMessage("Failure", -116730447);
						return;
					}
					if (string.equalsIgnoreCase("tk5")) {
						Class171.method2046(5, false, -546015094);
						if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(348763082) == 5) {
							Class56.panelBoxMessage("Success", 586536021);
							Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub23_7908), 5, -1685255816);
							Class435.method5568(1648947477);
							client.aBoolean9194 = false;
						} else
							Class56.panelBoxMessage("Failure", 1073590096);
						return;
					}
					if (string.equalsIgnoreCase("clientdrop")) {
						if (client.anInt8995 * -296919301 == 1)
							Class291_Sub1.method2907(-1358731369);
						else if (16 == -296919301 * client.anInt8995)
							client.aClass1_9025.aBoolean37 = true;
						return;
					}
					if (string.equalsIgnoreCase("breakcon")) {
						Class1[] class1s = client.aClass1Array8963;
						for (int i_4_ = 0; i_4_ < class1s.length; i_4_++) {
							Class1 class1 = class1s[i_4_];
							if (class1.method380(2090846548) != null)
								class1.method380(2107724039).method4198((short) -1008);
						}
						Class140_Sub1.aClass285_7263.method2831(252096199);
						return;
					}
					if (string.startsWith("getclientvarpbit")) {
						int i_5_ = Integer.parseInt(string.substring(17));
						Class56.panelBoxMessage(new StringBuilder().append("varpbit=").append(Class158.aClass561_6474.method310(i_5_, -685300503)).toString(), 1671552469);
						return;
					}
					if (string.startsWith("getclientvarp")) {
						int i_6_ = Integer.parseInt(string.substring(14));
						Class56.panelBoxMessage(new StringBuilder().append("varp=").append(Class158.aClass561_6474.method306(i_6_, 969701794)).toString(), 1505940898);
						return;
					}
					if (string.startsWith("directlogin")) {
						String[] strings = Class226.method2309(string.substring(12), ' ', (byte) -15);
						if (2 == strings.length)
							Class138.method1605(strings[0], strings[1], 1743689662);
						return;
					}
					if (string.startsWith("snlogin ")) {
						String[] strings = Class226.method2309(string.substring(8), ' ', (byte) -16);
						int i_7_ = Integer.parseInt(strings[0]);
						Class396.method4655(i_7_, 189729556);
						return;
					}
					if (string.startsWith("setoutput ")) {
						File file = new File(string.substring(10));
						if (file.exists()) {
							file = new File(new StringBuilder().append(string.substring(10)).append(".").append(Class312.method3111((byte) 117)).append(".log").toString());
							if (file.exists()) {
								Class56.panelBoxMessage("file already exists!", 155792082);
								return;
							}
						}
						if (null != Class215.aFileOutputStream2086) {
							Class215.aFileOutputStream2086.close();
							Class215.aFileOutputStream2086 = null;
						}
						try {
							Class215.aFileOutputStream2086 = new FileOutputStream(file);
						} catch (FileNotFoundException filenotfoundexception) {
							Class56.panelBoxMessage(new StringBuilder().append("Could not create ").append(file.getName()).toString(), -2047691667);
						} catch (SecurityException securityexception) {
							Class56.panelBoxMessage(new StringBuilder().append("Cannot write to ").append(file.getName()).toString(), 1383320568);
						}
						return;
					}
					if (string.equals("closeoutput")) {
						if (Class215.aFileOutputStream2086 != null)
							Class215.aFileOutputStream2086.close();
						Class215.aFileOutputStream2086 = null;
						return;
					}
					if (string.startsWith("runscript ")) {
						File file = new File(string.substring(10));
						if (!file.exists()) {
							Class56.panelBoxMessage("No such file", 1854339861);
							return;
						}
						byte[] is = Class436.method5577(file, 689170094);
						if (null == is) {
							Class56.panelBoxMessage("Failed to read file", -1424851114);
							return;
						}
						String[] strings = (Class226.method2309((Class421.method5291(Class300.method2977(is, (byte) 0), '\r', "", -1794164394)), '\n', (byte) -111));
						Class352.method4072(strings, -2039971238);
					}
					if (client.anInt8995 * -296919301 == 1 || 15 == client.anInt8995 * -296919301) {
						Class1 class1 = Class426.method5317(1995385596);
						Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.COMMAND_PACKET, class1.aClass488_22, 250372184);
						class330_sub34.aClass330_Sub46_Sub2_7729.addByte(string.length() + 3, (byte) 115);
						class330_sub34.aClass330_Sub46_Sub2_7729.addByte(bool ? 1 : 0, (byte) 122);
						class330_sub34.aClass330_Sub46_Sub2_7729.addByte(bool_0_ ? 1 : 0, (byte) 10);
						class330_sub34.aClass330_Sub46_Sub2_7729.addString(string, (byte) -21);
						class1.method378(class330_sub34, -1876950532);
					}
				} catch (Exception exception) {
					Class56.panelBoxMessage((Class526.aClass526_6139.method6257(Class429.aClass454_4369, 991479434)), -2147346070);
					return;
				}
			}
			if (1 != client.anInt8995 * -296919301 && 15 != client.anInt8995 * -296919301)
				Class56.panelBoxMessage(new StringBuilder().append(Class526.aClass526_6040.method6257(Class429.aClass454_4369, 991479434)).append(string).toString(), 1838240178);
		} catch (RuntimeException runtimeexception) {
			runtimeexception.printStackTrace();
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rf.x(").append(')').toString());
		}
	}

	static final void method5242(Class430 class430, int i) {
		try {
			int i_8_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (Class556.aClass510_6392.getItemDefinitions(i_8_, (byte) -57).anInt6751) * -1484397883;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rf.aby(").append(')').toString());
		}
	}

	static final void method5243(Class430 class430, int i) {
		try {
			int i_9_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_9_, -287236116);
			Class120 class120 = Class3.aClass120Array56[i_9_ >> 16];
			Class439.method5599(iComponentDefinitions, class120, true, 0, class430, (byte) 37);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rf.hb(").append(')').toString());
		}
	}
}
