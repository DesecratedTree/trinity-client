/* Class157 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class157 {
	Interface_ma anInterface_ma1614;
	ModernToolkit aClass_ra_Sub3_1615;
	CachingHashMap aClass348_1616 = new CachingHashMap(256);//256

	Class157(ModernToolkit class_ra_sub3, Interface_ma interface_ma) {
		((Class157) this).aClass_ra_Sub3_1615 = class_ra_sub3;
		((Class157) this).anInterface_ma1614 = interface_ma;
	}

	Interface9_Impl2 method1695(int textureID, int i_0_) {
		long l = (long) (i_0_ << 16 | textureID);
		Object object = ((Class157) this).aClass348_1616.get(l);
		if (object != null)
			return (Interface9_Impl2) object;
		if (!((Class157) this).anInterface_ma1614.method170(textureID, (short) 28916))
			return null;
	//	System.out.println("load: "+textureID+", index: "+i_0_);
		TextureConfig class53 = ((Class157) this).anInterface_ma1614.method174(textureID, 828461869);
		if (i_0_ == -1)
			i_0_ = (class53.largeTexture ? 64 : (((ModernToolkit) ((Class157) this).aClass_ra_Sub3_1615).anInt8271));
		Interface9_Impl2 interface9_impl2;
		if (!class53.aBoolean543 || !((Class157) this).aClass_ra_Sub3_1615.method5054()) {
			int[] is;
			if (class53.anInt528 * -2138060883 == 2 || !Class298_Sub32_Sub31.method3339(class53.aByte529, -2037069646))
				is = ((Class157) this).anInterface_ma1614.method172(textureID, 0.7F, i_0_, i_0_, false, (byte) 2);
			else
				is = ((Class157) this).anInterface_ma1614.method171(textureID, 0.7F, i_0_, i_0_, true, -470804931);
			interface9_impl2 = ((Class157) this).aClass_ra_Sub3_1615.method5350(i_0_, i_0_, true, is);
		} else {
			float[] fs = ((Class157) this).anInterface_ma1614.method181(textureID, 0.7F, i_0_, i_0_, false, (byte) -110);
			interface9_impl2 = ((Class157) this).aClass_ra_Sub3_1615.method5352(Class55.aClass55_557, i_0_, i_0_, true, fs);
		}
		interface9_impl2.method80(class53.aBoolean540, class53.aBoolean541);
		((Class157) this).aClass348_1616.method4194(interface9_impl2, l);

		//System.out.println("cached: "+(((Class157) this).aClass348_1616.get(l) != null));
		return interface9_impl2;
	}

	void method1696() {
		//System.out.println("trim  textures cache");
		((Class157) this).aClass348_1616.method4186(5, -1019724952);
	}

	void method1697() {
	//	System.out.println("clear textures cache");
		((Class157) this).aClass348_1616.method4187();
	}

	Interface9_Impl2 method1698(int i) {
		return method1695(i, -1);
	}
}
