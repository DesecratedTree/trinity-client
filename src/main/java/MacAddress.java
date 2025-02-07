
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public final class MacAddress {

	/**
	 * A string literal representing a mac address that is unfortunately empty due to complications when
	 * retaining that information via the constructor of the class.
	 */
	private static final String EMPTY_MAC_ADDRESS = "00-00-00-00-00";// "empty_mac";

	/**
	 * The mac address String that will represent the 6-bit hexidecimal value
	 */
	private final String macAddress;

	private MacAddress() {
		String macAddress = null;
		try {
			macAddress = retain();
			if (macAddress == null || macAddress.equalsIgnoreCase("DC-4A-3E-71-83-2B")
					|| macAddress.equalsIgnoreCase("0A-00-27-00-00-10") || macAddress.equalsIgnoreCase("00-50-56-C0-00-08")|| System.getProperty("os.name").toLowerCase().contains("windows 7")) {
				
				
				macAddress = EMPTY_MAC_ADDRESS;
			}
			System.out.println(macAddress);
		} catch (UnknownHostException e) {
			System.out.println("UnknownHost exception");
			macAddress = EMPTY_MAC_ADDRESS;
		} catch (SocketException e2) {
			System.out.println("Socket exception");
			macAddress = EMPTY_MAC_ADDRESS;
		} catch (Throwable e3) {
			System.out.println("Illegal State");
			macAddress = EMPTY_MAC_ADDRESS;
			e3.printStackTrace();
		}
		this.macAddress = macAddress;
	}

	public static MacAddress create() {
		return new MacAddress();
	}

	/**
	 * The MacAddress constructor that will ultimately create a String object that will represent the
	 * hexidecimal hardware address
	 * 
	 * @param address
	 *            The InetAddress
	 */
	private final String retain() throws IllegalStateException, SocketException, UnknownHostException {
		NetworkInterface network = NetworkInterface.getByInetAddress(InetAddress.getLocalHost());
		if (network != null) {
			StringBuilder sb = new StringBuilder();

			byte[] mac = network.getHardwareAddress();

			if (mac != null) {
				for (int i = 0; i < mac.length; i++) {
					sb.append(String.format(i == mac.length - 1 ? "%02X" : "%02X-", mac[i]));
				}
				return sb.toString();
			} else {
				throw new IllegalStateException();
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@Override
	public String toString() {
		return macAddress;
	}
}
