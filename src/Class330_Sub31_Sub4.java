/* Class330_Sub31_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;

public class Class330_Sub31_Sub4 extends Class330_Sub31 {
	double aDouble9607;
	static int anInt9608 = 1024;
	boolean aBoolean9609;
	TheoraInfo aTheoraInfo9610;
	TheoraComment aTheoraComment9611;
	DecoderContext aDecoderContext9612;
	boolean aBoolean9613;
	Frame aFrame9614;
	SetupInfo aSetupInfo9615 = new SetupInfo();
	long aLong9616;
	boolean aBoolean9617;
	boolean aBoolean9618;
	int anInt9619;
	int anInt9620;
	GranulePos aGranulePos9621;
	Object anObject9622;
	static int anInt9623 = 2048;

	double method3427(byte i) {
		try {
			return ((Class330_Sub31_Sub4) this).aDouble9607;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajz.b(").append(')').toString());
		}
	}

	void method3428(int i, int i_0_) {
		try {
			((Class330_Sub31_Sub4) this).anInt9620 = -534008793 * i;
			if (((Class330_Sub31_Sub4) this).aBoolean9617) {
				if (1369375639 * ((Class330_Sub31_Sub4) this).anInt9620 > ((Class330_Sub31_Sub4) this).anInt9619 * -341384243)
					((Class330_Sub31_Sub4) this).anInt9620 = -1427541957 * ((Class330_Sub31_Sub4) this).anInt9619;
				if (1369375639 * ((Class330_Sub31_Sub4) this).anInt9620 < 0)
					((Class330_Sub31_Sub4) this).anInt9620 = 0;
				((Class330_Sub31_Sub4) this).aDecoderContext9612.setPostProcessingLevel(((Class330_Sub31_Sub4) this).anInt9620 * 1369375639);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajz.n(").append(')').toString());
		}
	}

	float method3429(int i) {
		try {
			if (!((Class330_Sub31_Sub4) this).aBoolean9617 || ((Class330_Sub31_Sub4) this).aTheoraInfo9610.r())
				return 0.0F;
			return ((float) (((Class330_Sub31_Sub4) this).aTheoraInfo9610.fpsNumerator) / (float) (((Class330_Sub31_Sub4) this).aTheoraInfo9610.fpsDenominator));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajz.l(").append(')').toString());
		}
	}

	long method3430(int i) {
		try {
			return (((Class330_Sub31_Sub4) this).aLong9616 * -9036900450658019819L);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajz.u(").append(')').toString());
		}
	}

	void method3412(OggPacket oggpacket) {
		if (!((Class330_Sub31_Sub4) this).aBoolean9617) {
			int i = (((Class330_Sub31_Sub4) this).aSetupInfo9615.decodeHeader(((Class330_Sub31_Sub4) this).aTheoraInfo9610, ((Class330_Sub31_Sub4) this).aTheoraComment9611, oggpacket));
			if (0 == i) {
				((Class330_Sub31_Sub4) this).aBoolean9617 = true;
				if ((((Class330_Sub31_Sub4) this).aTheoraInfo9610.frameWidth > 2048) || (((Class330_Sub31_Sub4) this).aTheoraInfo9610.frameHeight) > 1024)
					throw new IllegalStateException();
				((Class330_Sub31_Sub4) this).aDecoderContext9612 = new DecoderContext((((Class330_Sub31_Sub4) this).aTheoraInfo9610), (((Class330_Sub31_Sub4) this).aSetupInfo9615));
				((Class330_Sub31_Sub4) this).aGranulePos9621 = new GranulePos();
				((Class330_Sub31_Sub4) this).aFrame9614 = new Frame((((Class330_Sub31_Sub4) this).aTheoraInfo9610.frameWidth), (((Class330_Sub31_Sub4) this).aTheoraInfo9610.frameHeight));
				((Class330_Sub31_Sub4) this).anInt9619 = ((Class330_Sub31_Sub4) this).aDecoderContext9612.getMaxPostProcessingLevel() * -469712635;
				method3428(((Class330_Sub31_Sub4) this).anInt9620 * 1369375639, -1867337667);
			} else if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
		} else {
			((Class330_Sub31_Sub4) this).aLong9616 = Class312.method3111((byte) 90) * -5588995573861709507L;
			int i = (((Class330_Sub31_Sub4) this).aDecoderContext9612.decodePacketIn(oggpacket, ((Class330_Sub31_Sub4) this).aGranulePos9621));
			if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
			((Class330_Sub31_Sub4) this).aDecoderContext9612.granuleFrame(((Class330_Sub31_Sub4) this).aGranulePos9621);
			((Class330_Sub31_Sub4) this).aDouble9607 = (((Class330_Sub31_Sub4) this).aDecoderContext9612.granuleTime(((Class330_Sub31_Sub4) this).aGranulePos9621));
			if (((Class330_Sub31_Sub4) this).aBoolean9609) {
				boolean bool = oggpacket.isKeyFrame() == 1;
				if (bool)
					((Class330_Sub31_Sub4) this).aBoolean9609 = false;
				else
					return;
			}
			if (!((Class330_Sub31_Sub4) this).aBoolean9618 || oggpacket.isKeyFrame() == 1) {
				if (((Class330_Sub31_Sub4) this).aDecoderContext9612.decodeFrame(((Class330_Sub31_Sub4) this).aFrame9614) != 0)
					throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
				((Class330_Sub31_Sub4) this).aBoolean9613 = true;
			}
		}
	}

	boolean method3431(byte i) {
		try {
			return ((Class330_Sub31_Sub4) this).aBoolean9617;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajz.x(").append(')').toString());
		}
	}

	public Object method3432(Interface17 interface17, int i) {
		try {
			if (null == ((Class330_Sub31_Sub4) this).aFrame9614)
				return null;
			if (!((Class330_Sub31_Sub4) this).aBoolean9613 && ((Class330_Sub31_Sub4) this).anObject9622 != null)
				return ((Class330_Sub31_Sub4) this).anObject9622;
			((Class330_Sub31_Sub4) this).anObject9622 = (interface17.method261(((Class330_Sub31_Sub4) this).aFrame9614.pixels, 0, ((Class330_Sub31_Sub4) this).aFrame9614.r * -1182431711, -1182431711 * ((Class330_Sub31_Sub4) this).aFrame9614.r, 1293562869 * ((Class330_Sub31_Sub4) this).aFrame9614.j, false, -1798977563));
			((Class330_Sub31_Sub4) this).aBoolean9613 = false;
			return ((Class330_Sub31_Sub4) this).anObject9622;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajz.c(").append(')').toString());
		}
	}

	void method3414() {
		if (((Class330_Sub31_Sub4) this).aFrame9614 != null)
			((Class330_Sub31_Sub4) this).aFrame9614.j();
		if (((Class330_Sub31_Sub4) this).aDecoderContext9612 != null) {
			((Class330_Sub31_Sub4) this).aDecoderContext9612.j();
			((Class330_Sub31_Sub4) this).aDecoderContext9612 = null;
		}
		if (null != ((Class330_Sub31_Sub4) this).aGranulePos9621) {
			((Class330_Sub31_Sub4) this).aGranulePos9621.j();
			((Class330_Sub31_Sub4) this).aGranulePos9621 = null;
		}
		((Class330_Sub31_Sub4) this).aTheoraInfo9610.j();
		((Class330_Sub31_Sub4) this).aTheoraComment9611.j();
		((Class330_Sub31_Sub4) this).aSetupInfo9615.j();
	}

	void method3413(int i) {
		try {
			if (((Class330_Sub31_Sub4) this).aFrame9614 != null)
				((Class330_Sub31_Sub4) this).aFrame9614.j();
			if (((Class330_Sub31_Sub4) this).aDecoderContext9612 != null) {
				((Class330_Sub31_Sub4) this).aDecoderContext9612.j();
				((Class330_Sub31_Sub4) this).aDecoderContext9612 = null;
			}
			if (null != ((Class330_Sub31_Sub4) this).aGranulePos9621) {
				((Class330_Sub31_Sub4) this).aGranulePos9621.j();
				((Class330_Sub31_Sub4) this).aGranulePos9621 = null;
			}
			((Class330_Sub31_Sub4) this).aTheoraInfo9610.j();
			((Class330_Sub31_Sub4) this).aTheoraComment9611.j();
			((Class330_Sub31_Sub4) this).aSetupInfo9615.j();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajz.i(").append(')').toString());
		}
	}

	void method3411(OggPacket oggpacket, int i) {
		try {
			if (!((Class330_Sub31_Sub4) this).aBoolean9617) {
				int i_1_ = (((Class330_Sub31_Sub4) this).aSetupInfo9615.decodeHeader(((Class330_Sub31_Sub4) this).aTheoraInfo9610, ((Class330_Sub31_Sub4) this).aTheoraComment9611, oggpacket));
				if (0 == i_1_) {
					((Class330_Sub31_Sub4) this).aBoolean9617 = true;
					if ((((Class330_Sub31_Sub4) this).aTheoraInfo9610.frameWidth) > 2048 || (((Class330_Sub31_Sub4) this).aTheoraInfo9610.frameHeight) > 1024)
						throw new IllegalStateException();
					((Class330_Sub31_Sub4) this).aDecoderContext9612 = new DecoderContext((((Class330_Sub31_Sub4) this).aTheoraInfo9610), (((Class330_Sub31_Sub4) this).aSetupInfo9615));
					((Class330_Sub31_Sub4) this).aGranulePos9621 = new GranulePos();
					((Class330_Sub31_Sub4) this).aFrame9614 = new Frame((((Class330_Sub31_Sub4) this).aTheoraInfo9610.frameWidth), (((Class330_Sub31_Sub4) this).aTheoraInfo9610.frameHeight));
					((Class330_Sub31_Sub4) this).anInt9619 = ((Class330_Sub31_Sub4) this).aDecoderContext9612.getMaxPostProcessingLevel() * -469712635;
					method3428((((Class330_Sub31_Sub4) this).anInt9620 * 1369375639), -1778143550);
				} else if (i_1_ < 0)
					throw new IllegalStateException(new StringBuilder().append("").append(i_1_).toString());
			} else {
				((Class330_Sub31_Sub4) this).aLong9616 = Class312.method3111((byte) 35) * -5588995573861709507L;
				int i_2_ = (((Class330_Sub31_Sub4) this).aDecoderContext9612.decodePacketIn(oggpacket, ((Class330_Sub31_Sub4) this).aGranulePos9621));
				if (i_2_ < 0)
					throw new IllegalStateException(new StringBuilder().append("").append(i_2_).toString());
				((Class330_Sub31_Sub4) this).aDecoderContext9612.granuleFrame(((Class330_Sub31_Sub4) this).aGranulePos9621);
				((Class330_Sub31_Sub4) this).aDouble9607 = (((Class330_Sub31_Sub4) this).aDecoderContext9612.granuleTime(((Class330_Sub31_Sub4) this).aGranulePos9621));
				if (((Class330_Sub31_Sub4) this).aBoolean9609) {
					boolean bool = oggpacket.isKeyFrame() == 1;
					if (bool)
						((Class330_Sub31_Sub4) this).aBoolean9609 = false;
					else
						return;
				}
				if (!((Class330_Sub31_Sub4) this).aBoolean9618 || oggpacket.isKeyFrame() == 1) {
					if ((((Class330_Sub31_Sub4) this).aDecoderContext9612.decodeFrame(((Class330_Sub31_Sub4) this).aFrame9614)) != 0)
						throw new IllegalStateException(new StringBuilder().append("").append(i_2_).toString());
					((Class330_Sub31_Sub4) this).aBoolean9613 = true;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajz.j(").append(')').toString());
		}
	}

	void method3415() {
		if (((Class330_Sub31_Sub4) this).aFrame9614 != null)
			((Class330_Sub31_Sub4) this).aFrame9614.j();
		if (((Class330_Sub31_Sub4) this).aDecoderContext9612 != null) {
			((Class330_Sub31_Sub4) this).aDecoderContext9612.j();
			((Class330_Sub31_Sub4) this).aDecoderContext9612 = null;
		}
		if (null != ((Class330_Sub31_Sub4) this).aGranulePos9621) {
			((Class330_Sub31_Sub4) this).aGranulePos9621.j();
			((Class330_Sub31_Sub4) this).aGranulePos9621 = null;
		}
		((Class330_Sub31_Sub4) this).aTheoraInfo9610.j();
		((Class330_Sub31_Sub4) this).aTheoraComment9611.j();
		((Class330_Sub31_Sub4) this).aSetupInfo9615.j();
	}

	Class330_Sub31_Sub4(OggStreamState oggstreamstate) {
		super(oggstreamstate);
		((Class330_Sub31_Sub4) this).aTheoraInfo9610 = new TheoraInfo();
		((Class330_Sub31_Sub4) this).aTheoraComment9611 = new TheoraComment();
	}
}
