/* Class298_Sub37_Sub16_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub37_Sub16_Sub1 extends Class298_Sub37_Sub16 {
	byte headerSize;
	RsByteBuffer aClass298_Sub53_10004;
	int stage;

	int method3472() {
		if (null == ((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004)
			return 0;
		return (-149528164 * (((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.index) / ((((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.buffer).length - ((Class298_Sub37_Sub16_Sub1) this).headerSize));
	}

	byte[] get(short i) {
		try {
			if (((Class298_Sub37_Sub16_Sub1) this).downloading || ((((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.index) * 385051775 < ((((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.buffer).length - ((Class298_Sub37_Sub16_Sub1) this).headerSize)))
				throw new RuntimeException();
			return (((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.buffer);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akb.a(").append(')').toString());
		}
	}

	int method3468(int i) {
		try {
			if (null == ((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004)
				return 0;
			return (-149528164 * (((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.index) / ((((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.buffer).length - ((Class298_Sub37_Sub16_Sub1) this).headerSize));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akb.f(").append(')').toString());
		}
	}

	byte[] method3467() {
		if (((Class298_Sub37_Sub16_Sub1) this).downloading || ((((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.index) * 385051775 < ((((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.buffer).length - ((Class298_Sub37_Sub16_Sub1) this).headerSize)))
			throw new RuntimeException();
		return (((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.buffer);
	}

	byte[] method3466() {
		if (((Class298_Sub37_Sub16_Sub1) this).downloading || ((((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.index) * 385051775 < ((((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.buffer).length - ((Class298_Sub37_Sub16_Sub1) this).headerSize)))
			throw new RuntimeException();
		return (((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.buffer);
	}

	byte[] method3469() {
		if (((Class298_Sub37_Sub16_Sub1) this).downloading || ((((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.index) * 385051775 < ((((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.buffer).length - ((Class298_Sub37_Sub16_Sub1) this).headerSize)))
			throw new RuntimeException();
		return (((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.buffer);
	}

	int method3470() {
		if (null == ((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004)
			return 0;
		return (-149528164 * (((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.index) / ((((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.buffer).length - ((Class298_Sub37_Sub16_Sub1) this).headerSize));
	}

	int method3471() {
		if (null == ((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004)
			return 0;
		return (-149528164 * (((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.index) / ((((Class298_Sub37_Sub16_Sub1) this).aClass298_Sub53_10004.buffer).length - ((Class298_Sub37_Sub16_Sub1) this).headerSize));
	}

	Class298_Sub37_Sub16_Sub1() {
		/* empty */
	}
}
