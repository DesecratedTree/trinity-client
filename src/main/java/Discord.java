
import net.arikia.dev.drpc.DiscordEventHandlers;
import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordRichPresence;

public class Discord extends Thread {

    private static Thread callbackRunner;
	private static final long START = System.currentTimeMillis();
	private static String currentName = "none";
	
	public static void init() {
		try {
			// don't use discord locally
			if(Settings.local.equals("127.0.0.1"))
				return;

			Runtime.getRuntime().addShutdownHook(new Thread(() -> {
				DiscordRPC.discordShutdown();
			}));

			DiscordRPC.discordInitialize("898210088412647466", new DiscordEventHandlers(), true);
			if (callbackRunner == null) {
				(callbackRunner = new Thread(() -> {
					while (!Thread.currentThread().isInterrupted()) {
						if (currentName != RuntimeException_Sub2.aString6305) {
							currentName = RuntimeException_Sub2.aString6305;
							updatePresence();
						}
						DiscordRPC.discordRunCallbacks();
						try {
							Thread.sleep(30);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					return;
				}, "RPC-Callback-Handler")).start();
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	private static void updatePresence() {
		try {
			 DiscordRichPresence.Builder presence;
			if (currentName != null && !currentName.isEmpty()) {
				presence = new DiscordRichPresence.Builder("Logged in as " + currentName);
				presence.setDetails("Playing [matrixrsps.io]");
			} else
				presence = new DiscordRichPresence.Builder("Playing [matrixrsps.io]");
			presence.setBigImage("mx512d", "Matrix RSPS");
			presence.setStartTimestamps(START);
			presence.setSecrets("MTI4NzM0OjFpMmhuZToxMjMxMjM= ", ""/*"MTIzNDV8MTIzNDV8MTMyNDU0"*/);
			DiscordRPC.discordUpdatePresence(presence.build());
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
