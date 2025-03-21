/* Class357_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class Class357_Sub1 extends Class357 {
	Socket aSocket8000;
	Class359 aClass359_8001;
	Class345 aClass345_8002;

	public boolean method4194(int i, int i_0_) throws IOException {
		try {
			return ((Class357_Sub1) this).aClass359_8001.method4235(i, -2044719181);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aeb.j(").append(')').toString());
		}
	}

	public void method4197(int i) {
		try {
			((Class357_Sub1) this).aClass345_8002.method4004(-2030879973);
			try {
				((Class357_Sub1) this).aSocket8000.close();
			} catch (IOException ioexception) {
				/* empty */
			}
			((Class357_Sub1) this).aClass359_8001.method4234(65280);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aeb.s(").append(')').toString());
		}
	}

	public int method4204(int i) throws IOException {
		try {
			return ((Class357_Sub1) this).aClass359_8001.method4232((byte) 48);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aeb.i(").append(')').toString());
		}
	}

	public boolean method4199(int i) throws IOException {
		return ((Class357_Sub1) this).aClass359_8001.method4235(i, -658678883);
	}

	public void method4210(byte[] is, int i, int i_1_, byte i_2_) throws IOException {
		try {
			((Class357_Sub1) this).aClass345_8002.method4006(is, i, i_1_, (byte) -73);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aeb.o(").append(')').toString());
		}
	}

	Class357_Sub1(Socket socket, int i) throws IOException {
		((Class357_Sub1) this).aSocket8000 = socket;
		((Class357_Sub1) this).aSocket8000.setSoTimeout(30000);
		((Class357_Sub1) this).aSocket8000.setTcpNoDelay(true);
		((Class357_Sub1) this).aClass359_8001 = new Class359(((Class357_Sub1) this).aSocket8000.getInputStream(), i);
		((Class357_Sub1) this).aClass345_8002 = new Class345(((Class357_Sub1) this).aSocket8000.getOutputStream(), i);
	}

	public void method4198(short i) {
		try {
			((Class357_Sub1) this).aClass359_8001.method4233(-48853683);
			((Class357_Sub1) this).aClass345_8002.method4005(-129205854);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aeb.f(").append(')').toString());
		}
	}

	protected void finalize() {
		try {
			method4197(1463544803);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aeb.finalize(").append(')').toString());
		}
	}

	public int method4202() throws IOException {
		return ((Class357_Sub1) this).aClass359_8001.method4232((byte) 8);
	}

	public boolean method4200(int i) throws IOException {
		return ((Class357_Sub1) this).aClass359_8001.method4235(i, -632452247);
	}

	public int method4207(byte[] is, int i, int i_3_) throws IOException {
		return ((Class357_Sub1) this).aClass359_8001.method4236(is, i, i_3_, 377082629);
	}

	public void method4196(byte[] is, int i, int i_4_) throws IOException {
		((Class357_Sub1) this).aClass345_8002.method4006(is, i, i_4_, (byte) -23);
	}

	public int method4203(byte[] is, int i, int i_5_) throws IOException {
		return ((Class357_Sub1) this).aClass359_8001.method4236(is, i, i_5_, 1551196575);
	}

	public boolean method4201(int i) throws IOException {
		return ((Class357_Sub1) this).aClass359_8001.method4235(i, -851479904);
	}

	public int method4205(byte[] is, int i, int i_6_) throws IOException {
		return ((Class357_Sub1) this).aClass359_8001.method4236(is, i, i_6_, -994480924);
	}

	public int method4195(byte[] is, int i, int i_7_, int i_8_) throws IOException {
		try {
			return ((Class357_Sub1) this).aClass359_8001.method4236(is, i, i_7_, 465986220);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aeb.p(").append(')').toString());
		}
	}

	public void method4206(byte[] is, int i, int i_9_) throws IOException {
		((Class357_Sub1) this).aClass345_8002.method4006(is, i, i_9_, (byte) -94);
	}

	public void method4193() {
		((Class357_Sub1) this).aClass345_8002.method4004(-2062238258);
		try {
			((Class357_Sub1) this).aSocket8000.close();
		} catch (IOException ioexception) {
			/* empty */
		}
		((Class357_Sub1) this).aClass359_8001.method4234(65280);
	}

	public void method4208() {
		((Class357_Sub1) this).aClass345_8002.method4004(-2064240908);
		try {
			((Class357_Sub1) this).aSocket8000.close();
		} catch (IOException ioexception) {
			/* empty */
		}
		((Class357_Sub1) this).aClass359_8001.method4234(65280);
	}

	public void method4209() {
		((Class357_Sub1) this).aClass359_8001.method4233(-192128115);
		((Class357_Sub1) this).aClass345_8002.method4005(-307280088);
	}
}
