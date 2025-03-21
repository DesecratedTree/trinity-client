/* Class95_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class95_Sub5 extends Class95 {
	int anInt7141;
	int anInt7142;
	int anInt7143;
	int anInt7144;
	int anInt7145;
	static Class422 aClass422_7146;

	Class95_Sub5(Buffer class330_sub46) {
		super(class330_sub46);
		((Class95_Sub5) this).anInt7145 = class330_sub46.readUnsignedShort(1163437215) * 1544623855;
		((Class95_Sub5) this).anInt7142 = class330_sub46.readUnsignedShort(932455748) * 1921488835;
		((Class95_Sub5) this).anInt7143 = class330_sub46.readUnsignedShort(100248835) * 1245075353;
		((Class95_Sub5) this).anInt7144 = class330_sub46.readUnsignedShort(718225832) * 1433260091;
		((Class95_Sub5) this).anInt7141 = class330_sub46.readUnsignedShort(325840605) * 1280411749;
	}

	public void method1095(int i) {
		try {
			Class437.method5587(-625289201 * ((Class95_Sub5) this).anInt7145, 625806505 * ((Class95_Sub5) this).anInt7143, ((Class95_Sub5) this).anInt7142 * 1317966059, 100, 100, false, (byte) 14);
			Class157.method1834(((Class95_Sub5) this).anInt7144 * -668169997, ((Class95_Sub5) this).anInt7141 * 415361389, 0, (byte) -90);
			client.aBoolean9039 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zd.j(").append(')').toString());
		}
	}

	public void method1100() {
		Class437.method5587(-625289201 * ((Class95_Sub5) this).anInt7145, 625806505 * ((Class95_Sub5) this).anInt7143, ((Class95_Sub5) this).anInt7142 * 1317966059, 100, 100, false, (byte) 14);
		Class157.method1834(((Class95_Sub5) this).anInt7144 * -668169997, ((Class95_Sub5) this).anInt7141 * 415361389, 0, (byte) -68);
		client.aBoolean9039 = true;
	}

	public void method1098() {
		Class437.method5587(-625289201 * ((Class95_Sub5) this).anInt7145, 625806505 * ((Class95_Sub5) this).anInt7143, ((Class95_Sub5) this).anInt7142 * 1317966059, 100, 100, false, (byte) 14);
		Class157.method1834(((Class95_Sub5) this).anInt7144 * -668169997, ((Class95_Sub5) this).anInt7141 * 415361389, 0, (byte) -78);
		client.aBoolean9039 = true;
	}

	public void method1099() {
		Class437.method5587(-625289201 * ((Class95_Sub5) this).anInt7145, 625806505 * ((Class95_Sub5) this).anInt7143, ((Class95_Sub5) this).anInt7142 * 1317966059, 100, 100, false, (byte) 14);
		Class157.method1834(((Class95_Sub5) this).anInt7144 * -668169997, ((Class95_Sub5) this).anInt7141 * 415361389, 0, (byte) 54);
		client.aBoolean9039 = true;
	}

	static void method1122(Buffer class330_sub46, byte i) {
		try {
			int i_0_ = class330_sub46.readSmart(-1328942451);
			Class315.aClass396Array3257 = new Class396[i_0_];
			for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
				Class315.aClass396Array3257[i_1_] = new Class396();
				Class315.aClass396Array3257[i_1_].anInt4106 = class330_sub46.readSmart(-328085595) * 767612165;
				Class315.aClass396Array3257[i_1_].aString4107 = class330_sub46.readJagString((byte) 6);
			}
			Class125.anInt1458 = class330_sub46.readSmart(-1898602598) * -1465754085;
			Class509.anInt5946 = class330_sub46.readSmart(-2086449085) * -1972011861;
			Class398.anInt4118 = class330_sub46.readSmart(49940895) * -334632289;
			Class132.aClass401_Sub1Array1505 = new Class401_Sub1[(-49635837 * Class509.anInt5946 - 1010387987 * Class125.anInt1458 + 1)];
			for (int i_2_ = 0; i_2_ < 1369616735 * Class398.anInt4118; i_2_++) {
				int i_3_ = class330_sub46.readSmart(-573404998);
				Class401_Sub1 class401_sub1 = (Class132.aClass401_Sub1Array1505[i_3_] = new Class401_Sub1());
				((Class401_Sub1) class401_sub1).anInt4127 = class330_sub46.readUnsignedByte(2140647806) * 724846977;
				class401_sub1.anInt4131 = class330_sub46.readInt((byte) 10) * 1452629057;
				class401_sub1.anInt8245 = 1158277279 * (1010387987 * Class125.anInt1458 + i_3_);
				class401_sub1.aString8246 = class330_sub46.readJagString((byte) 6);
				class401_sub1.aString8247 = class330_sub46.readJagString((byte) 6);
			}
			Class527.anInt6213 = class330_sub46.readInt((byte) 16) * 1871794529;
			Class398.aBoolean4117 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zd.i(").append(')').toString());
		}
	}
}
