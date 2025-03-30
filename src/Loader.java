import java.awt.*;
import java.net.URL;
import java.util.*;
import javax.swing.*;

/**
 * Loader class for the Trinity client that handles application initialization and UI setup.
 */
public class Loader extends JApplet {

	private static final long serialVersionUID = -3815183950296997504L;

	// Application version constants
	public static final int VERSION = 742;
	public static final int SUB_VERSION = 2;

	// Configuration settings
	private static final Dimension CLIENT_DIMENSION = new Dimension(765, 502);
	private static final String CLIENT_TITLE = "Trinity Client - 742 - Version 0.0.1";
	private static final int SPLASH_DURATION_MS = 2000;
	public static final boolean DISABLE_USELESS_PACKETS = false;

	// Server connection settings
	public static boolean isRS = false;
	public static String IP = "127.0.0.1";
	public static int PORT = 43594;

	// Security settings
	public static boolean rsaDisabled = false;
	public static boolean isaacDisabled = true;
	public static boolean LOBBY_ENABLED = false;

	// Singleton instance
	private static final Loader instance = new Loader();

	// UI components
	private static JFrame splashScreen;
	private Properties appletParameters;

	/**
	 * Main entry point for the application when run as a standalone program.
	 */
	public static void main(String[] args) {
		try {
			instance.startApplication();
		} catch (InterruptedException e) {
			System.err.println("Application startup interrupted: " + e.getMessage());
		}
	}

	/**
	 * Returns the singleton instance of the Loader.
	 */
	public static Loader getInstance() {
		return instance;
	}

	/**
	 * Initialize when run as an applet.
	 */
	@Override
	public void init() {
		initializeParameters();
		startClient();
	}

	/**
	 * Start the application as a standalone program.
	 */
	public void startApplication() throws InterruptedException {
		initializeParameters();
		showSplashScreen();
		Thread.sleep(SPLASH_DURATION_MS);
		closeSplashScreen();
		createMainWindow();
		startClient();
	}

	/**
	 * Creates and displays the splash screen.
	 */
	private void showSplashScreen() {
		splashScreen = new JFrame();

		// Load resources
		Image iconImage = loadResourceImage("icon.png");
		Image splashImage = loadResourceImage("splash2.gif");

		splashScreen.setIconImage(iconImage);
		splashScreen.add(new JLabel(new ImageIcon(splashImage)));

		// Configure window properties
		splashScreen.setUndecorated(true);
		splashScreen.setBackground(new Color(0, 0, 0, 0)); // Transparent background
		splashScreen.pack();
		splashScreen.setLocationRelativeTo(null); // Center on screen
		splashScreen.setAlwaysOnTop(true);
		splashScreen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		splashScreen.setVisible(true);
		splashScreen.toFront();
	}

	/**
	 * Closes the splash screen.
	 */
	private void closeSplashScreen() {
		if (splashScreen != null) {
			splashScreen.dispose();
			splashScreen = null;
		}
	}

	/**
	 * Creates and opens the main application window.
	 */
	private void createMainWindow() {
		JFrame clientFrame = new JFrame(CLIENT_TITLE);
		Image iconImage = loadResourceImage("icon.png");
		clientFrame.setIconImage(iconImage);

		// Configure layout
		clientFrame.setLayout(new BorderLayout());
		JPanel clientPanel = createClientPanel();
		clientFrame.getContentPane().add(clientPanel, BorderLayout.CENTER);

		// Configure window properties
		clientFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		clientFrame.setSize(CLIENT_DIMENSION);
		clientFrame.setLocationRelativeTo(null); // Center on screen
		clientFrame.pack();
		clientFrame.setVisible(true);
	}

	/**
	 * Creates the client panel that holds the applet.
	 */
	private JPanel createClientPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(this);
		panel.setPreferredSize(CLIENT_DIMENSION);
		return panel;
	}

	/**
	 * Loads an image from the application resources.
	 */
	private Image loadResourceImage(String resourceName) {
		return Toolkit.getDefaultToolkit().getImage(
				ClassLoader.getSystemResource(resourceName));
	}

	/**
	 * Initializes and starts the client.
	 */
	private void startClient() {
		client clientInstance = new client();
		clientInstance.supplyApplet(this);
		clientInstance.init();
		clientInstance.start();
	}

	/**
	 * Initializes the applet parameters.
	 */
	private void initializeParameters() {
		appletParameters = new Properties();

		// Core parameters
		setJvmParameters();
		setUiParameters();
		setConnectionParameters();

		// Client-specific parameters
		setClientParameters();
	}

	/**
	 * Sets JVM-related parameters.
	 */
	private void setJvmParameters() {
		appletParameters.put("separate_jvm", "true");
		appletParameters.put("java_arguments", "-Xmx256m-Xss2m-Dsun.java2d.noddraw=true-XX:CompileThreshold=1500" + "-Xincgc-XX:+UseConcMarkSweepGC-XX:+UseParNewGC");
		appletParameters.put("haveie6", "false");
	}

	/**
	 * Sets UI-related parameters.
	 */
	private void setUiParameters() {
		appletParameters.put("image", "splash2.gif");
		appletParameters.put("centerimage", "true");
		appletParameters.put("boxborder", "false");
		appletParameters.put("boxbgcolor", "black");
	}

	/**
	 * Sets connection-related parameters.
	 */
	private void setConnectionParameters() {
		appletParameters.put("10", IP);
		appletParameters.put("3", ".runescape.com");
	}

	/**
	 * Sets client-specific parameters.
	 */
	private void setClientParameters() {
		Map<String, String> params = new HashMap<>();

		params.put("5", "true,false,0,43,200,18,0,21,354,-15,Verdana,11,0xF4ECE9,candy_bar_middle.gif," +
				"candy_bar_back.gif,candy_bar_outline_left.gif,candy_bar_outline_right.gif," +
				"candy_bar_outline_top.gif,candy_bar_outline_bottom.gif,loadbar_body_left.gif," +
				"loadbar_body_right.gif,loadbar_body_fill.gif,6");
		params.put("11", "0");
		params.put("34", "225");
		params.put("30", "MpanIDx68ZShS/0wQc60lSvsuExhgYKEW");
		params.put("9", "false");
		params.put("32", "7E38D137C0C97EAC1B89C07E1823D93B92621D5FF287F27135B71ECF61D4B07BDF4D957CA0C90F16707EE156B23C4365");
		params.put("25", "false");
		params.put("0", "gBY1FFD2PtHXiWDimCyWmg");
		params.put("12", "false");
		params.put("21", "true");
		params.put("28", "t6VmPGef1q2SfGVu5*Boi1FauurdIIXIIXzRjGVy4Yo");
		params.put("7", "0");
		params.put("35", "0");
		params.put("24", "");
		params.put("-1", "7KYq*VzZDycfkn7KXq98Xg");
		params.put("23", "");
		params.put("1", "410601069");
		params.put("13", "0");
		params.put("29", "");
		params.put("18", "1");
		params.put("6", "28348");
		params.put("26", "true");
		params.put("4", "");
		params.put("33", "0");
		params.put("16", "0");
		params.put("15", "false");
		params.put("8", "1107");
		params.put("14", "false");
		params.put("20", "0");
		params.put("27", "false");
		params.put("2", "");

		// Add all client parameters to main parameters
		appletParameters.putAll(params);
	}

	/**
	 * Gets a parameter value by name.
	 */
	@Override
	public String getParameter(String paramName) {
		return (String) appletParameters.get(paramName);
	}

	/**
	 * Gets the document base URL.
	 */
	@Override
	public URL getDocumentBase() {
		return getCodeBase();
	}

	/**
	 * Gets the code base URL.
	 */
	@Override
	public URL getCodeBase() {
		try {
			return new URL("https://" + IP);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}