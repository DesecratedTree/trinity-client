/* Class145_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class145_Sub1 extends Class145 {
	int anInt7264 = 0;
	public static IndexTable aClass280_7265;
	public static int anInt7266;

	public Class145_Sub1(Interface4 interface4) {
		super(Class132.aClass132_1503, interface4);
	}

	public void method1727(Buffer class330_sub46, int i, int i_0_) {
		try {
			int i_1_ = class330_sub46.offset * -824785231;
			int i_2_ = class330_sub46.readUnsignedByte(1317483128);
			method1673(Class129.method1555(i_2_ & 0x1, 2072699582), (byte) 55);
			Class146 class146 = Class96.method1180(i_2_ >> 1 & 0x3, 308874360);
			if (((Class145_Sub1) this).aClass146_1603 != class146) {
				try {
					method1696(class146, true, (byte) -118);
				} catch (Exception_Sub4 exception_sub4) {
					exception_sub4.printStackTrace();
				}
			}
			Class136 class136 = Class386.method4430(i_2_ >> 3 & 0x3, (byte) 69);
			if (((Class145_Sub1) this).aClass136_1591 != class136) {
				try {
					method1674(class136, true, 1046104551);
				} catch (Exception_Sub4 exception_sub4) {
					exception_sub4.printStackTrace();
				}
			}
			if ((i_2_ >> 7 & 0x1) == 1) {
				int i_3_ = class330_sub46.readUnsignedShort(717579802);
				if (1 == (i_3_ >> (((Class129) Class129.aClass129_1481).anInt1486 * -1011394123) & 0x1))
					((Class145_Sub1) this).aClass260_1589.method2552(class330_sub46);
				if (1 == (i_3_ >> (-1011394123 * (((Class129) Class129.aClass129_1480).anInt1486)) & 0x1))
					((Class145_Sub1) this).aClass260_1579.method2552(class330_sub46);
				if (1 == (i_3_ >> (((Class129) Class129.aClass129_1483).anInt1486 * -1011394123) & 0x1))
					((Class145_Sub1) this).aClass260_1592.method2552(class330_sub46);
				if ((i_3_ >> (-1011394123 * ((Class129) Class129.aClass129_1487).anInt1486) & 0x1) == 1)
					((Class145_Sub1) this).aClass260_1593.method2552(class330_sub46);
				if (1 == (i_3_ >> (((Class129) Class129.aClass129_1479).anInt1486 * -1011394123) & 0x1)) {
					((Class145_Sub1) this).aFloat1598 = class330_sub46.method3760(-1279245802);
					((Class145_Sub1) this).aFloat1599 = class330_sub46.method3760(-1279245802);
				}
				if ((i_3_ >> (((Class129) Class129.aClass129_1484).anInt1486 * -1011394123) & 0x1) == 1) {
					((Class145_Sub1) this).aFloat1587 = class330_sub46.method3760(-1279245802);
					((Class145_Sub1) this).aFloat1601 = class330_sub46.method3760(-1279245802);
				}
				if (1 == (i_3_ >> (-1011394123 * (((Class129) Class129.aClass129_1485).anInt1486)) & 0x1))
					((Class145_Sub1) this).aClass133_1580 = Class330_Sub5.method3273(class330_sub46.readUnsignedByte(1292420589), 1803946782);
				if (1 == (i_3_ >> (((Class129) Class129.aClass129_1488).anInt1486 * -1011394123) & 0x1)) {
					((Class145_Sub1) this).anInt1590 = class330_sub46.readUnsignedTriByte(-1401356047) * 1513019215;
					class330_sub46.readUnsignedByte(1183260959);
				}
				if (1 == (i_3_ >> (-1011394123 * (((Class129) Class129.aClass129_1482).anInt1486)) & 0x1)) {
					int i_4_ = class330_sub46.readUnsignedByte(202100840);
					((Class145_Sub1) this).aBoolean1602 = (i_4_ & 0x1) == 1;
					((Class145_Sub1) this).aBoolean1583 = 2 == (i_4_ & 0x2);
				}
				if (1 == (i_3_ >> (-1011394123 * (((Class129) Class129.aClass129_1494).anInt1486)) & 0x1)) {
					int i_5_ = class330_sub46.readUnsignedByte(-200578333);
					for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
						int i_7_ = class330_sub46.readUnsignedByte(-196566626);
						int i_8_ = class330_sub46.readUnsignedByte(1928000123);
						if (0 == i_7_)
							method1717(i_8_, 177236322);
						else {
							Class137 class137 = (Class383.method4409(class330_sub46.readUnsignedByte(1153037376), (byte) 94));
							boolean bool = true;
							Iterator iterator = ((Class145_Sub1) this).aClass497_1606.iterator();
							while_0_: do {
								Class330_Sub36_Sub15 class330_sub36_sub15;
								do {
									if (!iterator.hasNext())
										break while_0_;
									class330_sub36_sub15 = ((Class330_Sub36_Sub15) iterator.next());
								} while (i_8_ != (class330_sub36_sub15.anInt9720 * 514349311));
								class330_sub36_sub15.method3496(class330_sub46, 1850389994);
								bool = false;
							} while (false);
							if (bool)
								method1702(Class153.method1796(i_8_, class137, class330_sub46, 2023911982), 1403027746);
						}
					}
				}
				if ((i_3_ >> (-1011394123 * ((Class129) Class129.aClass129_1489).anInt1486) & 0x1) == 1) {
					((Class145_Sub1) this).anInt1604 = class330_sub46.readUnsignedShort(963581451) * 369391943;
					((Class145_Sub1) this).aFloat1605 = class330_sub46.method3760(-1279245802);
				}
				if (1 == (i_3_ >> (((Class129) Class129.aClass129_1490).anInt1486 * -1011394123) & 0x1))
					((Class145_Sub1) this).aClass144_1586 = Preferences.method2922(class330_sub46.readUnsignedByte(1852968428), 1612656512);
				if (1 == (i_3_ >> (((Class129) Class129.aClass129_1491).anInt1486 * -1011394123) & 0x1)) {
					((Class145_Sub1) this).aClass260_1594.method2552(class330_sub46);
					((Class145_Sub1) this).aClass260_1595.method2552(class330_sub46);
					((Class145_Sub1) this).aFloat1596 = class330_sub46.method3760(-1279245802);
					((Class145_Sub1) this).aFloat1597 = class330_sub46.method3760(-1279245802);
				}
				if (1 == (i_3_ >> (((Class129) Class129.aClass129_1492).anInt1486 * -1011394123) & 0x1))
					class330_sub46.method3760(-1279245802);
				if ((i_3_ >> (-1011394123 * ((Class129) Class129.aClass129_1493).anInt1486) & 0x1) == 1)
					((Class145_Sub1) this).aFloat1588 = class330_sub46.method3760(-1279245802);
			}
			if (((Class145_Sub1) this).aClass475_1582 != null && (i_2_ >> 5 & 0x1) == 1)
				((Class145_Sub1) this).aClass475_1582.method5925(class330_sub46, 1768937742);
			if (null != ((Class145_Sub1) this).aClass166_1600 && (i_2_ >> 6 & 0x1) == 1)
				((Class145_Sub1) this).aClass166_1600.method1974(class330_sub46, (short) 780);
			if (-824785231 * class330_sub46.offset - i_1_ != i)
				throw new RuntimeException(new StringBuilder().append((-824785231 * class330_sub46.offset) - i_1_).append(",").append(i).toString());
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aae.fa(").append(')').toString());
		}
	}

	public int method1728(int i) {
		try {
			((Class145_Sub1) this).anInt7264 += -850780673;
			if (126 == 1597104639 * ((Class145_Sub1) this).anInt7264)
				((Class145_Sub1) this).anInt7264 = 0;
			return ((Class145_Sub1) this).anInt7264 * 1597104639;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aae.fj(").append(')').toString());
		}
	}

	static final void method1729(Class430 class430, byte i) {
		try {
			String string;
			if (Class263_Sub2.myPlayer != null && (Class263_Sub2.myPlayer.displayName) != null)
				string = Class263_Sub2.myPlayer.method5460(false, -1136046573);
			else
				string = "";
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aae.act(").append(')').toString());
		}
	}
}
