
import com.GameClient;
import net.runelite.client.RuneLite;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.*;
import java.util.Properties;


public class Loader extends Applet {

	private static final long serialVersionUID = 7639088664641445302L;

	public static final Properties client_parameters = new Properties();

	private static JFrame splash;

	public static void showSplash() {
		splash = new JFrame("\\u00A9 2022 Matrix RSPS ~ All rights reserved");
		splash.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("icon.png")));
		splash.add(new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("logo.png")))));
		splash.setUndecorated(true);
		splash.setBackground(new Color(0, 0, 0, 0));
		splash.pack();
		splash.setLocationRelativeTo((Component)null);
		splash.setAlwaysOnTop(true);
		splash.setDefaultCloseOperation(3);
		long time = System.currentTimeMillis();
		splash.setVisible(true);
		splash.toFront();
	}

	public static void main(String[] args) throws Exception {
		System.setProperty("java.net.preferIPv4Stack", "true");
		System.setProperty("java.net.preferIPv6Addresses", "false");



		GameClient.setParams(Settings.IP);
		client c =  new client();
		c.supplyApplet(c);
		RuneLite.clientA = c;

		showSplash(); //as these resources take time to load
		Class224.load = Class224.method2089("load.gif", -2141223361);
		Class224.load2 = Class224.method2089("load2.gif", -2141223361);
		splash.dispose();

		RuneLite.main(new String[] {});
		Discord.init();
	}

	public static Socket method6056(int i) throws IOException {
		try {
			return new Socket(InetAddress.getByName(Settings.IP), RuneLite.getRuneLite().getConfig().beta() ? 43595 : 43594);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tk.a(").append(')').toString());
		}
	}


	public static void main2(String[] args) throws IOException {

        System.setProperty("java.net.preferIPv4Stack", "true");
        System.setProperty("java.net.preferIPv6Addresses", "false");
        setParams();


		client client = new client();
		Loader loader = new Loader();
		client.supplyApplet(loader);

		showSplash(); //as these resources take time to load
		Class224.load = Class224.method2089("load.gif", -2141223361);
		Class224.load2 = Class224.method2089("load2.gif", -2141223361);
		splash.dispose();



       if (System.getProperty("os.name").toLowerCase().contains("mac")) {
        	try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Throwable e2) {
				e2.printStackTrace();
			}
        } else {
		   try {
			   UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		   } catch (Throwable e3) {
			   e3.printStackTrace();
			   System.out.println("Theme not detected, reverting to OS Default.");
			   try {
				   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			   } catch (Throwable e2) {
				   e2.printStackTrace();
			   }
		   }
        }


		frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(loader);
		panel.setPreferredSize(new Dimension(768, 503));
		frame.setMinimumSize(new Dimension(768, 503 + 60)); //works fine
		panel.setBackground(Color.BLACK);

		JMenuBar bar = new JMenuBar();

		for(Option o : Option.values()) {
			MenuButton menu = new MenuButton(o.name);
			menu.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						Desktop.getDesktop().browse(new URI(o.url));
					} catch (IOException | URISyntaxException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub

				}

			});

			bar.add(menu);
		}
		frame.setJMenuBar(bar);
		frame.setTitle("Matrix RSPS");
		frame.setResizable(true);
	//	frame.addWindowListener(client);
		frame.getContentPane().add(panel, "Center");
	//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		        if (JOptionPane.showConfirmDialog(frame,
		            "Are you sure to close this window?", "Really Closing?",
		            JOptionPane.YES_NO_OPTION,
		            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
		        	if (trayIcon != null)
		        		SystemTray.getSystemTray().remove(trayIcon);
		        	System.exit(0);
		        }
		    }
		});
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("icon.png")));
		frame.pack();
		frame.setLocationRelativeTo(null);

		setTrayIcon();

		frame.setVisible(true);
		frame.toFront();
        client.init();
        client.start();

        Discord.init();
	}

	private static TrayIcon trayIcon;
	private static JFrame frame;

	public static void setTrayIcon() {
		if (!SystemTray.isSupported())
			return;
		try {
			SystemTray tray = SystemTray.getSystemTray();
			trayIcon = new TrayIcon(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("icon.png")), "Matrix RSPS");
			trayIcon.setImageAutoSize(true);

		       // Bring to front when tray icon is clicked
	        trayIcon.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                frame.setVisible(true);
	                frame.setState(Frame.NORMAL); // Unminimize
	            }
	        });
		    tray.add(trayIcon);
		} catch (AWTException e) {
		    System.err.println("TrayIcon could not be added.");
		}

	}


	static void setParams() {
		client_parameters.put("separate_jvm", "true");
		client_parameters.put("boxbgcolor", "black");
		client_parameters.put("image", "http://www.runescape.com/img/game/splash2.gif");
		client_parameters.put("centerimage", "true");
		client_parameters.put("boxborder", "false");
		client_parameters.put("java_arguments", Settings.JVM_ARGS+ " -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC");
		client_parameters.put("27", "0");
		client_parameters.put("1", "0");
		client_parameters.put("16", "false");
		client_parameters.put("17", "false");
		client_parameters.put("21", "1"); // WORLD ID
		client_parameters.put("30", "false"); //frame
		client_parameters.put("20", Settings.LOBBY_IP);
		client_parameters.put("29", "");
		client_parameters.put("11", "true");
		client_parameters.put("25", "1378752098");
		client_parameters.put("28", "0");
		client_parameters.put("8", ".runescape.com");
		client_parameters.put("23", "false");
		client_parameters.put("32", "0");
		client_parameters.put("15", "wwGlrZHF5gKN6D3mDdihco3oPeYN2KFybL9hUUFqOvk");
		client_parameters.put("0", "IjGJjn4L3q5lRpOR9ClzZQ");
		client_parameters.put("2", "");
		client_parameters.put("4", "1"); // WORLD ID
		client_parameters.put("14", "");
		client_parameters.put("5", "8194");
		client_parameters.put("-1", "QlwePyRU5GcnAn1lr035ag");
		client_parameters.put("6", "0");
		client_parameters.put("24", "true,false,0,43,200,18,0,21,354,-15,Verdana,11,0xF4ECE9,candy_bar_middle.gif,candy_bar_back.gif,candy_bar_outline_left.gif,candy_bar_outline_right.gif,candy_bar_outline_top.gif,candy_bar_outline_bottom.gif,loadbar_body_left.gif,loadbar_body_right.gif,loadbar_body_fill.gif,6");
		client_parameters.put("3", "hAJWGrsaETglRjuwxMwnlA/d5W6EgYWx");
		client_parameters.put("12", "false");
		client_parameters.put("13", "0");
		client_parameters.put("26", "0");
		client_parameters.put("9", "77");
		client_parameters.put("22", "false");
		client_parameters.put("18", "false");
		client_parameters.put("33", "");
		client_parameters.put("haveie6", "false");
	}

	public static enum Option {
		HOME("Forums", "http://onyxftw.com/forum/"),
	//	FORUMS("Forums", "http://onyxftw.com/forum/"),
		DONATE("Store", "https://onyxftw.com/webstore/store.php?id=7"),
		VOTE("Vote", "https://onyxftw.com/vote/"),
		HIGHSCORES("Hiscores", "https://onyxftw.com/hiscores/"),
		WIKI("Guides", "http://onyxftw.com/forum/index.php?/forum/16-guides/"),
		TEAMSPEAK("Discord", "https://discord.gg/7fhC7948kN"),
		SUPPORT("Help", "http://onyxftw.com/forum/");


		private String name, url;

		private Option(String name, String url) {
			this.name = name;
			this.url = url;
		}
	}

	public String getParameter(String string) {
		return (String) client_parameters.get(string);
	}

	public URL getDocumentBase() {
		return getCodeBase();
	}

	public URL getCodeBase() {
		try {
			return new URL("http://" + Settings.IP);
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
	}

	public static void openURL(String url) {
		try {
			Desktop.getDesktop().browse(new URI(url));
		} catch (IOException | URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
