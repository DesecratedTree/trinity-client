/* Class95_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class95_Sub17 extends Class95 {
	int anInt7191;
	int anInt7192;
	public static int anInt7193;

	public void method1098() {
		Class62.method767(((Class95_Sub17) this).anInt7192 * -818344037, 0, 971787539 * ((Class95_Sub17) this).anInt7191, 1691835845);
	}

	public void method1100() {
		Class62.method767(((Class95_Sub17) this).anInt7192 * -818344037, 0, 971787539 * ((Class95_Sub17) this).anInt7191, 55946479);
	}

	Class95_Sub17(Buffer class330_sub46) {
		super(class330_sub46);
		((Class95_Sub17) this).anInt7192 = class330_sub46.readUnsignedShort(667251924) * -907690349;
		((Class95_Sub17) this).anInt7191 = class330_sub46.readUnsignedByte(-139914095) * 234063131;
	}

	public void method1095(int i) {
		try {
			Class62.method767(((Class95_Sub17) this).anInt7192 * -818344037, 0, 971787539 * ((Class95_Sub17) this).anInt7191, 378178871);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zr.j(").append(')').toString());
		}
	}

	public void method1099() {
		Class62.method767(((Class95_Sub17) this).anInt7192 * -818344037, 0, 971787539 * ((Class95_Sub17) this).anInt7191, 649227307);
	}

	static final void method1158(Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1, byte i) {
		try {
			int i_0_ = (1960954555 * class432_sub1_sub1_sub1.anInt10058 - 822953439 * client.anInt8981);
			int i_1_ = (-914816512 * class432_sub1_sub1_sub1.anInt10034 + class432_sub1_sub1_sub1.method5453(-1588046513) * 256);
			int i_2_ = (class432_sub1_sub1_sub1.anInt10045 * -1443303936 + class432_sub1_sub1_sub1.method5453(-822870954) * 256);
			Class260 class260 = class432_sub1_sub1_sub1.method5346().aClass260_2606;
			class432_sub1_sub1_sub1.method5348((float) ((i_1_ - (int) class260.aFloat2716) / i_0_ + (int) class260.aFloat2716), (float) (int) class260.aFloat2715, (float) ((int) class260.aFloat2711 + (i_2_ - (int) class260.aFloat2711) / i_0_));
			class432_sub1_sub1_sub1.anInt10060 = 0;
			class432_sub1_sub1_sub1.method5410((class432_sub1_sub1_sub1.anInt10040) * 1381513579, (byte) -45);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zr.hd(").append(')').toString());
		}
	}

	static final void method1159(int i) {
		try {
			for (Class325_Sub1 class325_sub1 = ((Class325_Sub1) client.aClass467_9096.method5853((byte) 12)); class325_sub1 != null; class325_sub1 = ((Class325_Sub1) client.aClass467_9096.method5853((byte) 4)))
				Class149.method1760(class325_sub1, -128201692);
			int i_3_ = 0;
			int i_4_ = 3;
			if (0 == 1909266069 * client.anInt8987) {
				for (int i_5_ = i_3_; i_5_ <= i_4_; i_5_++)
					client.method3919(i_5_);
				client.method3920();
			} else {
				client.method3927();
				for (int i_6_ = i_3_; i_6_ <= i_4_; i_6_++) {
					client.method3912();
					client.method3915(i_6_);
					client.method3919(i_6_);
				}
				client.method3916();
				client.method3920();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zr.ip(").append(')').toString());
		}
	}

	static final void method1160(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, byte i) {
		try {
			int i_7_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (iComponentDefinitions.anInt1345 * 53799397 != i_7_) {
				if (-1 != i_7_) {
					if (iComponentDefinitions.aClass477_1344 == null)
						iComponentDefinitions.aClass477_1344 = new Class477_Sub1();
					iComponentDefinitions.aClass477_1344.method5988(i_7_, (byte) -23);
				} else
					iComponentDefinitions.aClass477_1344 = null;
				iComponentDefinitions.anInt1345 = 1043475437 * i_7_;
				Class404.method4738(iComponentDefinitions, 2120775554);
			}
			if (-1 == iComponentDefinitions.anInt1287 * -790144721 && !class120.aBoolean1402)
				Class558.method6457(iComponentDefinitions.anInt1196 * 751119487, 694142557);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zr.ej(").append(')').toString());
		}
	}
}
