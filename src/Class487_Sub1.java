/* Class487_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public class Class487_Sub1 extends Class487 {
	static String aString8753 = "java.net.useSystemProxies";
	ProxySelector aProxySelector8754 = ProxySelector.getDefault();

	public Socket method6035() throws IOException {
		boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
		if (!bool)
			System.setProperty("java.net.useSystemProxies", "true");
		boolean bool_0_ = 443 == ((Class487_Sub1) this).anInt5826 * 1320395777;
		List list;
		List list_1_;
		try {
			list = (((Class487_Sub1) this).aProxySelector8754.select(new URI(new StringBuilder().append(bool_0_ ? "https" : "http").append("://").append(((Class487_Sub1) this).aString5827).toString())));
			list_1_ = (((Class487_Sub1) this).aProxySelector8754.select(new URI(new StringBuilder().append(bool_0_ ? "http" : "https").append("://").append(((Class487_Sub1) this).aString5827).toString())));
		} catch (URISyntaxException urisyntaxexception) {
			return method6033((short) 18708);
		}
		list.addAll(list_1_);
		Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		Object[] objects_2_ = objects;
		for (int i = 0; i < objects_2_.length; i++) {
			Object object = objects_2_[i];
			Proxy proxy = (Proxy) object;
			Socket socket;
			try {
				Socket socket_3_ = method6038(proxy, -838580961);
				if (socket_3_ == null)
					continue;
				socket = socket_3_;
			} catch (IOException_Sub1 ioexception_sub1_4_) {
				ioexception_sub1 = ioexception_sub1_4_;
				continue;
			} catch (IOException ioexception) {
				continue;
			}
			return socket;
		}
		if (null != ioexception_sub1)
			throw ioexception_sub1;
		return method6033((short) 13419);
	}

	Socket method6038(Proxy proxy, int i) throws IOException {
		try {
			if (proxy.type() == Proxy.Type.DIRECT)
				return method6033((short) 27097);
			java.net.SocketAddress socketaddress = proxy.address();
			if (!(socketaddress instanceof InetSocketAddress))
				return null;
			InetSocketAddress inetsocketaddress = (InetSocketAddress) socketaddress;
			if (proxy.type() == Proxy.Type.HTTP) {
				String string = null;
				try {
					Class var_class = (Class.forName("sun.net.www.protocol.http.AuthenticationInfo"));
					Method method = (var_class.getDeclaredMethod("getProxyAuth", new Class[] { Class.forName("java.lang.String"), Integer.TYPE }));
					method.setAccessible(true);
					Object object = method.invoke(null, (new Object[] { inetsocketaddress.getHostName(), new Integer(inetsocketaddress.getPort()) }));
					if (object != null) {
						Method method_5_ = (var_class.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]));
						method_5_.setAccessible(true);
						if (((Boolean) method_5_.invoke(object, new Object[0])).booleanValue()) {
							Method method_6_ = var_class.getDeclaredMethod("getHeaderName", new Class[0]);
							method_6_.setAccessible(true);
							Method method_7_ = (var_class.getDeclaredMethod("getHeaderValue", (new Class[] { Class.forName("java.net.URL"), Class.forName("java.lang.String") })));
							method_7_.setAccessible(true);
							String string_8_ = ((String) method_6_.invoke(object, new Object[0]));
							String string_9_ = ((String) (method_7_.invoke(object, (new Object[] { new URL(new StringBuilder().append("https://").append(((Class487_Sub1) this).aString5827).append("/").toString()), "https" }))));
							string = new StringBuilder().append(string_8_).append(": ").append(string_9_).toString();
						}
					}
				} catch (Exception exception) {
					/* empty */
				}
				return method6039(inetsocketaddress.getHostName(), inetsocketaddress.getPort(), string, -1964047254);
			}
			if (proxy.type() == Proxy.Type.SOCKS) {
				Socket socket = new Socket(proxy);
				socket.connect(new InetSocketAddress((((Class487_Sub1) this).aString5827), (1320395777 * (((Class487_Sub1) this).anInt5826))));
				return socket;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("agq.z(").append(')').toString());
		}
	}

	Class487_Sub1() {
		/* empty */
	}

	public Socket method6034() throws IOException {
		boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
		if (!bool)
			System.setProperty("java.net.useSystemProxies", "true");
		boolean bool_10_ = 443 == ((Class487_Sub1) this).anInt5826 * 1320395777;
		List list;
		List list_11_;
		try {
			list = (((Class487_Sub1) this).aProxySelector8754.select(new URI(new StringBuilder().append(bool_10_ ? "https" : "http").append("://").append(((Class487_Sub1) this).aString5827).toString())));
			list_11_ = (((Class487_Sub1) this).aProxySelector8754.select(new URI(new StringBuilder().append(bool_10_ ? "http" : "https").append("://").append(((Class487_Sub1) this).aString5827).toString())));
		} catch (URISyntaxException urisyntaxexception) {
			return method6033((short) 6623);
		}
		list.addAll(list_11_);
		Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		Object[] objects_12_ = objects;
		for (int i = 0; i < objects_12_.length; i++) {
			Object object = objects_12_[i];
			Proxy proxy = (Proxy) object;
			Socket socket;
			try {
				Socket socket_13_ = method6038(proxy, -1591044308);
				if (socket_13_ == null)
					continue;
				socket = socket_13_;
			} catch (IOException_Sub1 ioexception_sub1_14_) {
				ioexception_sub1 = ioexception_sub1_14_;
				continue;
			} catch (IOException ioexception) {
				continue;
			}
			return socket;
		}
		if (null != ioexception_sub1)
			throw ioexception_sub1;
		return method6033((short) 15869);
	}

	Socket method6039(String string, int i, String string_15_, int i_16_) throws IOException {
		try {
			Socket socket = new Socket(string, i);
			socket.setSoTimeout(10000);
			OutputStream outputstream = socket.getOutputStream();
			if (null == string_15_)
				outputstream.write(new StringBuilder().append("CONNECT ").append(((Class487_Sub1) this).aString5827).append(":").append(((Class487_Sub1) this).anInt5826 * 1320395777).append(" HTTP/1.0\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
			else
				outputstream.write(new StringBuilder().append("CONNECT ").append(((Class487_Sub1) this).aString5827).append(":").append(1320395777 * ((Class487_Sub1) this).anInt5826).append(" HTTP/1.0\n").append(string_15_).append("\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
			outputstream.flush();
			BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(socket.getInputStream())));
			String string_17_ = bufferedreader.readLine();
			if (null != string_17_) {
				if (string_17_.startsWith("HTTP/1.0 200") || string_17_.startsWith("HTTP/1.1 200"))
					return socket;
				if (string_17_.startsWith("HTTP/1.0 407") || string_17_.startsWith("HTTP/1.1 407")) {
					int i_18_ = 0;
					String string_19_ = "proxy-authenticate: ";
					for (string_17_ = bufferedreader.readLine(); string_17_ != null && i_18_ < 50; i_18_++) {
						if (string_17_.toLowerCase().startsWith(string_19_)) {
							string_17_ = string_17_.substring(string_19_.length()).trim();
							int i_20_ = string_17_.indexOf(' ');
							if (i_20_ != -1)
								string_17_ = string_17_.substring(0, i_20_);
							throw new IOException_Sub1(string_17_);
						}
						string_17_ = bufferedreader.readLine();
					}
					throw new IOException_Sub1("");
				}
			}
			outputstream.close();
			bufferedreader.close();
			socket.close();
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("agq.w(").append(')').toString());
		}
	}

	public Socket method6036(int i) throws IOException {
		try {
			boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
			if (!bool)
				System.setProperty("java.net.useSystemProxies", "true");
			boolean bool_21_ = 443 == ((Class487_Sub1) this).anInt5826 * 1320395777;
			List list;
			List list_22_;
			try {
				list = (((Class487_Sub1) this).aProxySelector8754.select(new URI(new StringBuilder().append(bool_21_ ? "https" : "http").append("://").append(((Class487_Sub1) this).aString5827).toString())));
				list_22_ = (((Class487_Sub1) this).aProxySelector8754.select(new URI(new StringBuilder().append(bool_21_ ? "http" : "https").append("://").append(((Class487_Sub1) this).aString5827).toString())));
			} catch (URISyntaxException urisyntaxexception) {
				return method6033((short) 13748);
			}
			list.addAll(list_22_);
			Object[] objects = list.toArray();
			IOException_Sub1 ioexception_sub1 = null;
			Object[] objects_23_ = objects;
			for (int i_24_ = 0; i_24_ < objects_23_.length; i_24_++) {
				Object object = objects_23_[i_24_];
				Proxy proxy = (Proxy) object;
				Socket socket;
				try {
					Socket socket_25_ = method6038(proxy, -709740602);
					if (socket_25_ == null)
						continue;
					socket = socket_25_;
				} catch (IOException_Sub1 ioexception_sub1_26_) {
					ioexception_sub1 = ioexception_sub1_26_;
					continue;
				} catch (IOException ioexception) {
					continue;
				}
				return socket;
			}
			if (null != ioexception_sub1)
				throw ioexception_sub1;
			return method6033((short) 28412);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("agq.j(").append(')').toString());
		}
	}

	public static Class299[] method6040(int i) {
		try {
			return (new Class299[] { Class299.aClass299_6809, Class299.aClass299_6806, Class299.aClass299_6808, Class299.aClass299_6807 });
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("agq.r(").append(')').toString());
		}
	}

	static boolean method6041(int i, int i_27_) {
		try {
			if (18 == i || 19 == i || 20 == i || i == 21 || i == 22 || i == 1004)
				return true;
			if (i == 17)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("agq.bk(").append(')').toString());
		}
	}
}
