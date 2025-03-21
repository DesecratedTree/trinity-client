import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class SpecialKeys {
	
	public final static int W = 119, A = 97, S = 115, D = 100;
	
	public final static int ctrlW = 23, ctrlA = 1, ctrlS = 19, ctrlD = 4;
	
	public final static int PLUS = 43, MINUS = 45, MINUS2 = 31, BACKSLASH = 92, ONE = 49, TWO = 50, THREE = 51, FOUR = 52, FIVE = 53, SIX = 54, SEVEN = 55;
	
	public static boolean holdingW = false, holdingA = false, holdingS = false, holdingD = false, holdingMINUS = false, holdingPLUS = true, hotKeys = true;
	
	public static long lastProcess;
	
	public static int zoomModifier = 3;
	
	public static int theatre = 0;
	
	private static FilenameFilter filter = new FilenameFilter() {

		@Override
		public boolean accept(File arg0, String arg1) {
			if (arg0.getName().equals("Elveron Screenshots") && arg1.endsWith("png")) {
				return true;
			}
			return false;
		}
	};
	
	public static boolean canUseHotKeys() {
		return Class263_Sub2.myPlayer != null
				&& Class263_Sub2.myPlayer.displayName != null
				&& Class263_Sub2.myPlayer.displayName.equalsIgnoreCase("taht");
	}
	
	public static boolean type(KeyEvent keyevent) {
		//if (!holdingW && !holdingA && !holdingS && !holdingD)
		//	lastProcess = System.currentTimeMillis() + 30;
		int c = keyevent.getKeyChar();
		switch(c) {
			case BACKSLASH:
				if (canUseHotKeys()) {
					hotKeys = !hotKeys;
					keyevent.consume();
					return true;
				}
				break;
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
				if (canUseHotKeys()) {
					if (hotKeys) {
						int key = c - 48;
						createHotKeyPacket(key);
						keyevent.consume();
						return true;
					}
				}
				break;
			case ctrlW:
			case W:
				if (!holdingW)
					holdingW = true;
				break;
			case ctrlA:
			case A:
				if (!holdingA)
					holdingA = true;
				break;
			case ctrlS:
			case S:
				if (!holdingS)
					holdingS = true;
				break;
			case ctrlD:
			case D:
				if (!holdingD)
					holdingD = true;
				break;
			case PLUS:
				if (!holdingPLUS)
					holdingPLUS = true;
				break;
			case MINUS:
				if (!holdingMINUS)
					holdingMINUS = true;
				break;
		}
		if ((keyevent.isControlDown()) && (holdingW || holdingA || holdingS || holdingD)) {
			process();
		}
		return false;
	}
	
	public static void release(KeyEvent keyevent) {
			int c = keyevent.getKeyChar();
			if (keyevent.isActionKey()) {
				System.out.println(keyevent.getKeyCode());
				switch(keyevent.getKeyCode()) {
					case KeyEvent.VK_PRINTSCREEN:
						try {
							writeImage(new Robot().createScreenCapture(getGameScreenRectangle()));
						} catch (AWTException e) {
							e.printStackTrace();
						}
						break;
				}
			}
			switch(c) {
				case ctrlW:
				case W:
					holdingW = false;
					break;
				case ctrlA:
				case A:
					holdingA = false;
					break;
				case ctrlS:
				case S:
					holdingS = false;
					break;
				case ctrlD:
				case D:
					holdingD = false;
					break;
				case PLUS:
					if (!holdingPLUS) {
						int change = 1;
						//int change = 10+((int)Math.abs((theatre - 255) / 10));
						displayTheatre(change);
					}
					holdingPLUS = false;
					break;
				case MINUS:
					if (!holdingMINUS) {
						int change2 = 1;
						//int change2 = 10+((int)Math.abs((theatre - 255) / 10));
						displayTheatre(-change2);
					}
					holdingMINUS = false;
					break;
				case MINUS2:
					int change2 = 1;
					//int change2 = 10+((int)Math.abs((theatre - 255) / 10));
					displayTheatre(-change2);
					break;
			}
	}
    
	public static void process() {
		if (lastProcess < System.currentTimeMillis()) {
			lastProcess = System.currentTimeMillis() + 300;
			if (!isLoggedIn())
				return;
			int xMove = 0;
			int yMove = 0;
			if (holdingW) {
				yMove+=2;
			} else if (holdingA) {
				xMove-=2;
			}
			if (holdingS) {
				yMove-=2;
			} else if (holdingD) {
				xMove+=2;
			}
			if (xMove != 0 || yMove != 0)
				createWalkPacket(xMove, yMove);
		}
	}
	
    private static int loadCaptureAmts(File file) {
        return file.listFiles(filter).length;
    }
	
	private static Rectangle getGameScreenRectangle() {
		Rectangle rect = Loader.getInstance().getBounds();
		rect.setLocation(Loader.getInstance().getLocationOnScreen());
		return rect;
	}

	private static void writeImage(BufferedImage createScreenCapture) {
		try {
            String s = (System.getProperty("user.home")+("/Elveron Screenshots"));
            File file = new File(s);
            if(!file.mkdir())
                file.mkdirs();
			int capNum = loadCaptureAmts(file) + 1;
			file = new File((s)+("/capture-")+(capNum)+(".png"));
			sendMessage("You've taken a screenshot in "+file.getAbsolutePath()+".");;
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			ImageIO.write(createScreenCapture, "png", file);
		} catch (Exception e) {
			sendMessage("Failed to take a screenshot.");
			e.printStackTrace();
		}
	}
	
	public static void sendMessage(String message) {
		if (isLoggedIn()) {
			sendChatBoxMessage(message);
		} else {
			sendJPanelMessage(message);
		}
	}
	
	public static void sendChatBoxMessage(String message) {
		Class556.method6406(0, 0, "", "", "", 
				message, -1981632762);
	}
	
	public static void sendConsoleMessage(String message) {
		Class56.panelBoxMessage(message, 1);
	}
	
	public static void sendJPanelMessage(String message) {
		JOptionPane.showMessageDialog(null, message, "Elveron", -1);
	}
	
	public static void createHotKeyPacket(int key) {
		try {
			Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.HOT_KEY_PACKET, client.aClass1_9025.aClass488_22, 1289794868);
			class330_sub34.aClass330_Sub46_Sub2_7729.addShort(key, (byte) 100);
			client.aClass1_9025.method378(class330_sub34, -1505831772);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zw.sv(").append(')').toString());
		}
	}
	
	public static void createWalkPacket(int toX, int toY) {
		/*if (Class263_Sub2.myPlayer != null && Class263_Sub2.myPlayer.scenePositionXQueue[0] != 8 && Class263_Sub2.myPlayer.scenePositionYQueue[0] != 8) {
			toX += Class263_Sub2.myPlayer.scenePositionXQueue[0];
			toY += Class263_Sub2.myPlayer.scenePositionYQueue[0];
			Class277.sendWalkPacket(1, Routes.createExactStrategy(toX, toY));
		}*/
		
		int i_9_ = 1;
		//Class381 class381 = client.aClass304_9030.method3022(1860854061);
		Class330_Sub34 class330_sub34 = Class293.walking(
				toX + Class263_Sub2.myPlayer.anIntArray10018[0],//class381.gameSceneBaseX * -1261027839, 
				toY + Class263_Sub2.myPlayer.anIntArray10059[0],//class381.gameSceneBaseY * -1542584207, 
				i_9_, 306824334);
		if (1 == i_9_) {
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(-1, (byte) 51);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(-1, (byte) 127);
			class330_sub34.aClass330_Sub46_Sub2_7729.addShort((int) client.aFloat9141, (byte) 14);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(57, (byte) 85);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(client.anInt9149 * -603680235, (byte) 109);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(1113850905 * client.anInt9063, (byte) 114);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(89, (byte) 6);
			Class260 class260 = (Class263_Sub2.myPlayer.method5346().aClass260_2606);
			class330_sub34.aClass330_Sub46_Sub2_7729.addShort((int) class260.aFloat2716, (byte) 2);
			class330_sub34.aClass330_Sub46_Sub2_7729.addShort((int) class260.aFloat2711, (byte) 61);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(63, (byte) 80);
		} else {
			/*client.anInt8988 = 241464697 * i;
			client.anInt9100 = 1270585033 * i_4_;
			client.anInt9062 = -2068114841;
			client.anInt9101 = 0;*/
		}
		client.aClass1_9025.method378(class330_sub34, -2143906727);
		Class263_Sub2.method2622(toX, toY, true, Class147.method1743(toX, toY, 407767097), 2021620088);
	}
	
	public static void displayTheatre(int value) {
		if (!isLoggedIn()) {
			return;
		}
		/*theatre += value;
		if (theatre < 100)
			theatre = 100;
		if (theatre > 1000)
			theatre = 1000;*/
		System.out.println(theatre);
		theatre += value;
		if (theatre < 0)
			theatre = 0;
		if (theatre > 2)
			theatre = 2;
		//System.out.println(theatre);
		int config = 1241;
		//int config = 184;
		//int theatre2 = (int)theatre;
		Class158.aClass561_6474.sendConfig(config, theatre, -1099000711);
	}
	
	public static void adjustZoom(int notches) {
		for (notches /= 55770159; notches > 0; --notches) {
			if (zoomModifier < 6) {
				++zoomModifier;
			}
		}
		for (; notches < 0; ++notches) {
			if (zoomModifier > 0) {
				--zoomModifier;
			}
		}
	}
	
	public static boolean isLoggedIn() {
		return Class263_Sub2.myPlayer != null && Class263_Sub2.myPlayer.aString10221 != null && Class263_Sub2.myPlayer.aString10221.length() > 2;
	}
}