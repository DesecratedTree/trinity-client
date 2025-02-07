
public class Class407 {
	public static int anInt5275 = 125000;
	public static int anInt5276 = 1500;

	Class407() throws Throwable {
		throw new Error();
	}

	static int method4964(int i) {
		try {
			int i_0_;
			if (1126040225 * Class291.maximumMemory >= 96) {
				int i_1_ = Class390.method4871((byte) 12);
				if (i_1_ <= 101) {
					Class116.setHighPreferences(228176307);
					i_0_ = 4;
				} else if (i_1_ <= 503) {
					Class302_Sub3.setMidPreferences((short) 23256);
					i_0_ = 3;
				} else if (i_1_ <= 1003) {
					Class320.setLowPreferences(-342704858);
					i_0_ = 2;
				} else {
					Class69.setMinPreferences(true, -81404804);
					i_0_ = 1;
				}
			} else {
				Class69.setMinPreferences(true, -2081784265);
				i_0_ = 1;
			}
			i_0_ = 1;
			if (Class422_Sub25.preferences.graphicsMode.method5677(-1442149692) != 0) {
				Class422_Sub25.preferences.method3540(Class422_Sub25.preferences.aClass422_Sub14_7570, 0, -912094662);
				Class370.method4578(0, false, 622850291);
			} else
				Class422_Sub25.preferences.method3539(Class422_Sub25.preferences.graphicsMode, true, -1651026599);
			Class3.savePreferences(656179282);
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qx.p(").append(')').toString());
		}
	}
}
