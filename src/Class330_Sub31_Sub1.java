/* Class330_Sub31_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;

public class Class330_Sub31_Sub1 extends Class330_Sub31 {
	DSPState aDSPState9590;
	Preferences aClass294_9591;
	VorbisComment aVorbisComment9592;
	VorbisBlock aVorbisBlock9593;
	VorbisInfo aVorbisInfo9594 = new VorbisInfo();
	Class330_Sub40_Sub1 aClass330_Sub40_Sub1_9595;
	double aDouble9596;
	int anInt9597;

	public Class330_Sub40_Sub1 method3419(int i) {
		try {
			return ((Class330_Sub31_Sub1) this).aClass330_Sub40_Sub1_9595;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajo.l(").append(')').toString());
		}
	}

	void method3412(OggPacket oggpacket) {
		if (-983895715 * ((Class330_Sub31_Sub1) this).anInt7723 < 3) {
			int i = (((Class330_Sub31_Sub1) this).aVorbisInfo9594.headerIn(((Class330_Sub31_Sub1) this).aVorbisComment9592, oggpacket));
			if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
			if (2 == -983895715 * ((Class330_Sub31_Sub1) this).anInt7723) {
				if (((Class330_Sub31_Sub1) this).aVorbisInfo9594.channels > 2 || (((Class330_Sub31_Sub1) this).aVorbisInfo9594.channels < 1))
					throw new RuntimeException(new StringBuilder().append("").append(((Class330_Sub31_Sub1) this).aVorbisInfo9594.channels).toString());
				((Class330_Sub31_Sub1) this).aDSPState9590 = new DSPState(((Class330_Sub31_Sub1) this).aVorbisInfo9594);
				((Class330_Sub31_Sub1) this).aVorbisBlock9593 = new VorbisBlock(((Class330_Sub31_Sub1) this).aDSPState9590);
				((Class330_Sub31_Sub1) this).aClass294_9591 = new Preferences((((Class330_Sub31_Sub1) this).aVorbisInfo9594.rate), Class296.anInt3047);
				((Class330_Sub31_Sub1) this).aClass330_Sub40_Sub1_9595 = new Class330_Sub40_Sub1(((Class330_Sub31_Sub1) this).aVorbisInfo9594.channels);
			}
		} else {
			if (((Class330_Sub31_Sub1) this).aVorbisBlock9593.synthesis(oggpacket) == 0)
				((Class330_Sub31_Sub1) this).aDSPState9590.blockIn(((Class330_Sub31_Sub1) this).aVorbisBlock9593);
			float[][] fs = (((Class330_Sub31_Sub1) this).aDSPState9590.pcmOut(((Class330_Sub31_Sub1) this).aVorbisInfo9594.channels));
			((Class330_Sub31_Sub1) this).aDouble9596 = ((Class330_Sub31_Sub1) this).aDSPState9590.granuleTime();
			if (-1.0 == ((Class330_Sub31_Sub1) this).aDouble9596)
				((Class330_Sub31_Sub1) this).aDouble9596 = (double) ((float) (-316058849 * (((Class330_Sub31_Sub1) this).anInt9597)) / (float) (((Class330_Sub31_Sub1) this).aVorbisInfo9594.rate));
			((Class330_Sub31_Sub1) this).aDSPState9590.read(fs[0].length);
			((Class330_Sub31_Sub1) this).anInt9597 += 356804831 * fs[0].length;
			Class330_Sub32 class330_sub32 = (((Class330_Sub31_Sub1) this).aClass330_Sub40_Sub1_9595.method3574(fs[0].length, ((Class330_Sub31_Sub1) this).aDouble9596));
			Class397.method4679(fs, (((Class330_Sub32) class330_sub32).aShortArrayArray7725), (byte) 100);
			for (int i = 0; i < ((Class330_Sub31_Sub1) this).aVorbisInfo9594.channels; i++)
				((Class330_Sub32) class330_sub32).aShortArrayArray7725[i] = (((Class330_Sub31_Sub1) this).aClass294_9591.method2918((((Class330_Sub32) class330_sub32).aShortArrayArray7725[i]), -2065903957));
			((Class330_Sub31_Sub1) this).aClass330_Sub40_Sub1_9595.method3575(class330_sub32, (byte) 10);
		}
	}

	Class330_Sub31_Sub1(OggStreamState oggstreamstate) {
		super(oggstreamstate);
		((Class330_Sub31_Sub1) this).aVorbisComment9592 = new VorbisComment();
	}

	double method3420(int i) {
		try {
			double d = ((Class330_Sub31_Sub1) this).aDouble9596;
			if (((Class330_Sub31_Sub1) this).aClass330_Sub40_Sub1_9595 != null) {
				d = ((Class330_Sub31_Sub1) this).aClass330_Sub40_Sub1_9595.method3576(-1833838076);
				if (d < 0.0)
					d = ((Class330_Sub31_Sub1) this).aDouble9596;
			}
			return d - (double) (256.0F / (float) Class296.anInt3047);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajo.b(").append(')').toString());
		}
	}

	int method3421(byte i) {
		try {
			return ((((Class330_Sub31_Sub1) this).aClass330_Sub40_Sub1_9595 == null) ? 0 : ((Class330_Sub31_Sub1) this).aClass330_Sub40_Sub1_9595.method3579(1920490265));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajo.u(").append(')').toString());
		}
	}

	void method3413(int i) {
		try {
			if (((Class330_Sub31_Sub1) this).aVorbisBlock9593 != null)
				((Class330_Sub31_Sub1) this).aVorbisBlock9593.j();
			if (null != ((Class330_Sub31_Sub1) this).aDSPState9590)
				((Class330_Sub31_Sub1) this).aDSPState9590.j();
			((Class330_Sub31_Sub1) this).aVorbisComment9592.j();
			((Class330_Sub31_Sub1) this).aVorbisInfo9594.j();
			if (null != ((Class330_Sub31_Sub1) this).aClass330_Sub40_Sub1_9595)
				((Class330_Sub31_Sub1) this).aClass330_Sub40_Sub1_9595.method3577((byte) 6);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajo.i(").append(')').toString());
		}
	}

	void method3414() {
		if (((Class330_Sub31_Sub1) this).aVorbisBlock9593 != null)
			((Class330_Sub31_Sub1) this).aVorbisBlock9593.j();
		if (null != ((Class330_Sub31_Sub1) this).aDSPState9590)
			((Class330_Sub31_Sub1) this).aDSPState9590.j();
		((Class330_Sub31_Sub1) this).aVorbisComment9592.j();
		((Class330_Sub31_Sub1) this).aVorbisInfo9594.j();
		if (null != ((Class330_Sub31_Sub1) this).aClass330_Sub40_Sub1_9595)
			((Class330_Sub31_Sub1) this).aClass330_Sub40_Sub1_9595.method3577((byte) 6);
	}

	void method3415() {
		if (((Class330_Sub31_Sub1) this).aVorbisBlock9593 != null)
			((Class330_Sub31_Sub1) this).aVorbisBlock9593.j();
		if (null != ((Class330_Sub31_Sub1) this).aDSPState9590)
			((Class330_Sub31_Sub1) this).aDSPState9590.j();
		((Class330_Sub31_Sub1) this).aVorbisComment9592.j();
		((Class330_Sub31_Sub1) this).aVorbisInfo9594.j();
		if (null != ((Class330_Sub31_Sub1) this).aClass330_Sub40_Sub1_9595)
			((Class330_Sub31_Sub1) this).aClass330_Sub40_Sub1_9595.method3577((byte) 6);
	}

	void method3411(OggPacket oggpacket, int i) {
		try {
			if (-983895715 * ((Class330_Sub31_Sub1) this).anInt7723 < 3) {
				int i_0_ = (((Class330_Sub31_Sub1) this).aVorbisInfo9594.headerIn(((Class330_Sub31_Sub1) this).aVorbisComment9592, oggpacket));
				if (i_0_ < 0)
					throw new IllegalStateException(new StringBuilder().append("").append(i_0_).toString());
				if (2 == -983895715 * ((Class330_Sub31_Sub1) this).anInt7723) {
					if ((((Class330_Sub31_Sub1) this).aVorbisInfo9594.channels > 2) || (((Class330_Sub31_Sub1) this).aVorbisInfo9594.channels) < 1)
						throw new RuntimeException(new StringBuilder().append("").append(((Class330_Sub31_Sub1) this).aVorbisInfo9594.channels).toString());
					((Class330_Sub31_Sub1) this).aDSPState9590 = new DSPState(((Class330_Sub31_Sub1) this).aVorbisInfo9594);
					((Class330_Sub31_Sub1) this).aVorbisBlock9593 = new VorbisBlock(((Class330_Sub31_Sub1) this).aDSPState9590);
					((Class330_Sub31_Sub1) this).aClass294_9591 = new Preferences((((Class330_Sub31_Sub1) this).aVorbisInfo9594.rate), Class296.anInt3047);
					((Class330_Sub31_Sub1) this).aClass330_Sub40_Sub1_9595 = new Class330_Sub40_Sub1(((Class330_Sub31_Sub1) this).aVorbisInfo9594.channels);
				}
			} else {
				if (((Class330_Sub31_Sub1) this).aVorbisBlock9593.synthesis(oggpacket) == 0)
					((Class330_Sub31_Sub1) this).aDSPState9590.blockIn(((Class330_Sub31_Sub1) this).aVorbisBlock9593);
				float[][] fs = (((Class330_Sub31_Sub1) this).aDSPState9590.pcmOut(((Class330_Sub31_Sub1) this).aVorbisInfo9594.channels));
				((Class330_Sub31_Sub1) this).aDouble9596 = ((Class330_Sub31_Sub1) this).aDSPState9590.granuleTime();
				if (-1.0 == ((Class330_Sub31_Sub1) this).aDouble9596)
					((Class330_Sub31_Sub1) this).aDouble9596 = (double) ((float) (-316058849 * (((Class330_Sub31_Sub1) this).anInt9597)) / (float) (((Class330_Sub31_Sub1) this).aVorbisInfo9594.rate));
				((Class330_Sub31_Sub1) this).aDSPState9590.read(fs[0].length);
				((Class330_Sub31_Sub1) this).anInt9597 += 356804831 * fs[0].length;
				Class330_Sub32 class330_sub32 = (((Class330_Sub31_Sub1) this).aClass330_Sub40_Sub1_9595.method3574(fs[0].length, ((Class330_Sub31_Sub1) this).aDouble9596));
				Class397.method4679(fs, (((Class330_Sub32) class330_sub32).aShortArrayArray7725), (byte) 67);
				for (int i_1_ = 0; (i_1_ < ((Class330_Sub31_Sub1) this).aVorbisInfo9594.channels); i_1_++)
					((Class330_Sub32) class330_sub32).aShortArrayArray7725[i_1_] = (((Class330_Sub31_Sub1) this).aClass294_9591.method2918((((Class330_Sub32) class330_sub32).aShortArrayArray7725[i_1_]), -1808376719));
				((Class330_Sub31_Sub1) this).aClass330_Sub40_Sub1_9595.method3575(class330_sub32, (byte) 10);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajo.j(").append(')').toString());
		}
	}
}
