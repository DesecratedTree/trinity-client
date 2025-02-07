/* Class298_Sub37_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub37_Sub4 extends Class298_Sub37 {
	AnimationFrame[] aClass96Array9579;
	int skeletonID;
	byte[][] skeletonFiles;
	static CacheIndex aClass243_9582;

	public static boolean skipOSRSSkin(int id, int skin) {
		return /*id != 7403 && */skin == 0;//skin == 0;
	}
	
	public boolean method3412(byte i) {
		try {
			if (((Class298_Sub37_Sub4) this).aClass96Array9579 != null)
				return true;
			int id = skeletonID * 1899473659;
			boolean osrs = skeletonID * 1899473659 >= Settings.OSRS_SKELETONS_OFFSET;
			boolean forceOSRS = skeletonID * 1899473659 >= Settings.FORCE_OSRS_SKELETONS_OFFSET;
			if (forceOSRS)
				id -= Settings.FORCE_OSRS_SKELETONS_OFFSET;
			if (((Class298_Sub37_Sub4) this).skeletonFiles == null) {
				synchronized (Class317.aClass243_3321) {
					if (!Class317.aClass243_3321.method2291(id, 334179097)) {
						boolean bool = false;
						return bool;
					}
					int[] is = (Class317.aClass243_3321.getFileIds(id, -2074944518));
					((Class298_Sub37_Sub4) this).skeletonFiles = new byte[is.length][];
					for (int i_0_ = 0; i_0_ < is.length; i_0_++)
						((Class298_Sub37_Sub4) this).skeletonFiles[i_0_] = (Class317.aClass243_3321.getFileFromArchive(id, is[i_0_], (byte) -7));
				}
			}
			boolean bool = true;
			for (int i_1_ = 0; (i_1_ < ((Class298_Sub37_Sub4) this).skeletonFiles.length); i_1_++) {
				byte[] is = ((Class298_Sub37_Sub4) this).skeletonFiles[i_1_];
				RsByteBuffer buffer = new RsByteBuffer(is);
				if (!osrs)
					buffer.index = 116413311;
				int skinID = buffer.readUnsignedShort();
				if (osrs && (!skipOSRSSkin(id, skinID) || forceOSRS))
					skinID += Settings.OSRS_SKINS_OFFSET;
				synchronized (aClass243_9582) {
					bool &= aClass243_9582.method2310(skinID, -457216440);
				}
			}
			if (!bool)
				return false;
			Class458 class458 = new Class458();
			int[] is;
			synchronized (Class317.aClass243_3321) {
				int i_3_ = (Class317.aClass243_3321.method2316(id, -222662329));
				((Class298_Sub37_Sub4) this).aClass96Array9579 = new AnimationFrame[i_3_];
				is = Class317.aClass243_3321.getFileIds(id, -2046558264);
			}
			for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
				byte[] is_5_ = ((Class298_Sub37_Sub4) this).skeletonFiles[i_4_];
				RsByteBuffer buffer = new RsByteBuffer(is_5_);
				if (!osrs)
					buffer.index = 116413311;
				int skinID = buffer.readUnsignedShort();
				if (osrs && (!skipOSRSSkin(id, skinID) || forceOSRS))
					skinID += Settings.OSRS_SKINS_OFFSET;
				
				AnimationFrameBase class298_sub15 = null;
				for (AnimationFrameBase class298_sub15_7_ = (AnimationFrameBase) class458.method5967(2084946117); class298_sub15_7_ != null; class298_sub15_7_ = (AnimationFrameBase) class458.method5969((byte) -23)) {
					if (skinID == (((AnimationFrameBase) class298_sub15_7_).key * 1029066723)) {
						class298_sub15 = class298_sub15_7_;
						break;
					}
				}
				if (null == class298_sub15) {
					synchronized (aClass243_9582) {
						class298_sub15 = (new AnimationFrameBase(skinID, aClass243_9582.method2294(skinID, (byte) 34), osrs && (!skipOSRSSkin(id, skinID) || forceOSRS)));
					}
					class458.method5968(class298_sub15, 805140432);
				}
				((Class298_Sub37_Sub4) this).aClass96Array9579[is[i_4_]] = /*osrs ?  new AnimationFrame(is_5_, class298_sub15) :*/ new AnimationFrame(is_5_, class298_sub15, osrs);
			}
			((Class298_Sub37_Sub4) this).skeletonFiles = null;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aih.f(").append(')').toString());
		}
	}

	public boolean method3413(int i, byte i_8_) {
		try {
			return (((AnimationFrame) ((Class298_Sub37_Sub4) this).aClass96Array9579[i]).modifiesColour);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aih.p(").append(')').toString());
		}
	}

	public boolean method3414(int i, byte i_9_) {
		try {
			return (((AnimationFrame) ((Class298_Sub37_Sub4) this).aClass96Array9579[i]).aBoolean941);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aih.i(").append(')').toString());
		}
	}

	public Class298_Sub37_Sub4(int i) {
		((Class298_Sub37_Sub4) this).skeletonID = -2073571277 * i;
	}

	public boolean method3415(int i, int i_10_) {
		try {
			return (((AnimationFrame) ((Class298_Sub37_Sub4) this).aClass96Array9579[i]).modifiesAlpha);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aih.b(").append(')').toString());
		}
	}
}
