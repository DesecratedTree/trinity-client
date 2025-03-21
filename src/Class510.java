/* Class510 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class510 implements Interface23 {
	Class435 aClass435_6772;
	Class367 aClass367_6773;
	boolean aBoolean6774;
	IndexTable aClass280_6775;
	IndexTable modelIndex;
	public int anInt6777;
	Class367 itemDefinitions = new Class367(64);
	String[] otherInventoryOptions;
	public Class399 aClass399_6780;
	Class521 aClass521_6781;
	Class543 aClass543_6782;
	int anInt6783;
	String[] otherGroundOptions;
	Class454 aClass454_6785;

	public void method6166(int i) {
		try {
			synchronized (((Class510) this).aClass367_6773) {
				((Class510) this).aClass367_6773.method4298((byte) 51);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vc.z(").append(')').toString());
		}
	}

	public Class61 method6167(Class_ra class_ra, int i, int i_0_, int i_1_, int i_2_, int i_3_, Class408 class408, int i_4_) {
		try {
			((Class521) ((Class510) this).aClass521_6781).anInt6754 = class_ra.anInt4226 * 142237733;
			((Class521) ((Class510) this).aClass521_6781).anInt6759 = i * -12920157;
			((Class521) ((Class510) this).aClass521_6781).anInt6755 = i_0_ * -1215030443;
			((Class521) ((Class510) this).aClass521_6781).anInt6757 = i_1_ * -203011843;
			((Class521) ((Class510) this).aClass521_6781).anInt6753 = i_2_ * -94525101;
			((Class521) ((Class510) this).aClass521_6781).anInt6758 = i_3_ * -530271063;
			((Class521) ((Class510) this).aClass521_6781).aBoolean6756 = class408 != null;
			return (Class61) aClass399_6780.method4688(((Class510) this).aClass521_6781);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vc.j(").append(')').toString());
		}
	}

	public Class61 method6168(Class_ra class_ra, Class_ra class_ra_5_, int i, int i_6_, int i_7_, int i_8_, boolean bool, boolean bool_9_, int i_10_, Class263 class263, Class408 class408, short i_11_) {
		try {
			if (!bool_9_) {
				Class61 class61 = method6167(class_ra_5_, i, i_6_, i_7_, i_8_, i_10_, class408, 1880167665);
				if (null != class61)
					return class61;
			}
			ItemDefinitions itemDefinitions = getItemDefinitions(i, (byte) -57);
			if (i_6_ > 1 && null != ((ItemDefinitions) itemDefinitions).stackIds) {
				int i_12_ = -1;
				for (int i_13_ = 0; i_13_ < 10; i_13_++) {
					if (i_6_ >= ((ItemDefinitions) itemDefinitions).stackAmounts[i_13_] && 0 != ((ItemDefinitions) itemDefinitions).stackAmounts[i_13_])
						i_12_ = ((ItemDefinitions) itemDefinitions).stackIds[i_13_];
				}
				if (i_12_ != -1)
					itemDefinitions = getItemDefinitions(i_12_, (byte) -25);
			}
			int[] is = itemDefinitions.method6279(class_ra, class_ra_5_, i_6_, i_7_, i_8_, bool, i_10_, class263, class408, (byte) -34);
			if (null == is)
				return null;
			Class61 class61;
			if (bool_9_)
				class61 = class_ra.method4795(is, 0, 36, 36, 32, (byte) -80);
			else
				class61 = class_ra_5_.method4795(is, 0, 36, 36, 32, (byte) -89);
			if (!bool_9_) {
				Class521 class521 = new Class521();
				((Class521) class521).anInt6754 = 142237733 * class_ra_5_.anInt4226;
				((Class521) class521).anInt6759 = i * -12920157;
				((Class521) class521).anInt6755 = -1215030443 * i_6_;
				((Class521) class521).anInt6757 = -203011843 * i_7_;
				((Class521) class521).anInt6753 = i_8_ * -94525101;
				((Class521) class521).anInt6758 = -530271063 * i_10_;
				((Class521) class521).aBoolean6756 = class408 != null;
				aClass399_6780.method4696(class61, class521);
			}
			return class61;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vc.i(").append(')').toString());
		}
	}

	public void method6169(boolean bool, byte i) {
		try {
			if (((Class510) this).aBoolean6774 != bool) {
				((Class510) this).aBoolean6774 = bool;
				method6170(-1390004513);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vc.p(").append(')').toString());
		}
	}

	public Class510(Class435 class435, Class454 class454, boolean bool, Class543 class543, IndexTable class280, IndexTable class280_14_) {
		((Class510) this).aClass367_6773 = new Class367(50);
		aClass399_6780 = new Class399(250);
		((Class510) this).aClass521_6781 = new Class521();
		((Class510) this).aClass435_6772 = class435;
		((Class510) this).aClass454_6785 = class454;
		((Class510) this).aBoolean6774 = bool;
		((Class510) this).aClass543_6782 = class543;
		((Class510) this).aClass280_6775 = class280;
		((Class510) this).modelIndex = class280_14_;
		if (null != ((Class510) this).aClass280_6775) {
			int i = ((Class510) this).aClass280_6775.method2764(1749280935) - 1;
			anInt6777 = (i * Class103.aClass103_934.method1226((byte) 0) + ((Class510) this).aClass280_6775.method2763(i, -2011555083)) * 1754265747;
		} else
			anInt6777 = 0;
		if (Class435.aClass435_4421 == ((Class510) this).aClass435_6772)
			((Class510) this).otherGroundOptions = (new String[] { null, null, Class526.aClass526_6047.method6257((((Class510) this).aClass454_6785), 991479434), null, null, Class526.aClass526_6068.method6257((((Class510) this).aClass454_6785), 991479434) });
		else
			((Class510) this).otherGroundOptions = (new String[] { null, null, Class526.aClass526_6047.method6257((((Class510) this).aClass454_6785), 991479434), null, null, null });
		((Class510) this).otherInventoryOptions = (new String[] { null, null, null, null, Class526.aClass526_6048.method6257((((Class510) this).aClass454_6785), 991479434) });
	}

	public void method6170(int i) {
		try {
			synchronized (((Class510) this).itemDefinitions) {
				((Class510) this).itemDefinitions.method4298((byte) 56);
			}
			synchronized (((Class510) this).aClass367_6773) {
				((Class510) this).aClass367_6773.method4298((byte) 15);
			}
			synchronized (aClass399_6780) {
				aClass399_6780.method4692();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vc.s(").append(')').toString());
		}
	}

	public void method6171(int i) {
		try {
			synchronized (aClass399_6780) {
				aClass399_6780.method4692();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vc.f(").append(')').toString());
		}
	}

	public void method6172(int i, int i_15_) {
		try {
			synchronized (((Class510) this).itemDefinitions) {
				((Class510) this).itemDefinitions.method4292(i, (byte) 115);
			}
			synchronized (((Class510) this).aClass367_6773) {
				((Class510) this).aClass367_6773.method4292(i, (byte) 33);
			}
			synchronized (aClass399_6780) {
				aClass399_6780.method4691(i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vc.w(").append(')').toString());
		}
	}

	public void method6173(byte i) {
		try {
			synchronized (((Class510) this).itemDefinitions) {
				((Class510) this).itemDefinitions.method4296(322278293);
			}
			synchronized (((Class510) this).aClass367_6773) {
				((Class510) this).aClass367_6773.method4296(-1465132910);
			}
			synchronized (aClass399_6780) {
				aClass399_6780.method4693();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vc.n(").append(')').toString());
		}
	}
	
	public ItemDefinitions getItemDefinitions(int itemId, byte i_16_) {
		try {
			ItemDefinitions itemDefinitions;
			synchronized (((Class510) this).itemDefinitions) {
				itemDefinitions = (ItemDefinitions) ((Class510) this).itemDefinitions.get((long) itemId);
			}
			if (itemDefinitions != null)
				return itemDefinitions;
			byte[] is;
			synchronized (((Class510) this).aClass280_6775) {
				//int archiveId = Class103.aClass103_934.method1228(i, 60502773);
				//int fileId = Class103.aClass103_934.method1227(i, (byte) -84);
				is = (((Class510) this).aClass280_6775.getFile(Class103.aClass103_934.method1228(itemId, 60502773), Class103.aClass103_934.method1227(itemId, (byte) -84)));
			}
			itemDefinitions = new ItemDefinitions();
			((ItemDefinitions) itemDefinitions).aClass510_6712 = this;
			((ItemDefinitions) itemDefinitions).anInt6688 = 437889861 * itemId;
			itemDefinitions.groundOptions = (String[]) ((Class510) this).otherGroundOptions.clone();
			itemDefinitions.inventoryOptions = (String[]) ((Class510) this).otherInventoryOptions.clone();
			if (null != is)
				itemDefinitions.method6293(new Buffer(is), 1740721735);
			itemDefinitions.method6277((byte) -26);
			if (1693216917 * itemDefinitions.notedItemId != -1)
				itemDefinitions.method6294(getItemDefinitions(1693216917 * itemDefinitions.notedItemId, (byte) -68), getItemDefinitions(itemDefinitions.switchNoteItemId * 933834055, (byte) -40), (byte) 0);
			if (556764869 * itemDefinitions.anInt6720 != -1)
				itemDefinitions.method6280(getItemDefinitions(itemDefinitions.anInt6720 * 556764869, (byte) -52), getItemDefinitions((-1479330021 * (((ItemDefinitions) itemDefinitions).anInt6735)), (byte) -19), -1476387507);
			if (381773869 * itemDefinitions.anInt6728 != -1)
				itemDefinitions.method6283(getItemDefinitions(381773869 * itemDefinitions.anInt6728, (byte) -45), getItemDefinitions((-1068547881 * (((ItemDefinitions) itemDefinitions).anInt6748)), (byte) -34), -1580853885);
			if (!((Class510) this).aBoolean6774 && itemDefinitions.aBoolean6707) {
				itemDefinitions.anInt6742 = 0;
				itemDefinitions.groundOptions = ((Class510) this).otherGroundOptions;
				itemDefinitions.inventoryOptions = ((Class510) this).otherInventoryOptions;
				itemDefinitions.aBoolean6702 = false;
				itemDefinitions.anIntArray6701 = null;
				if (null != ((ItemDefinitions) itemDefinitions).aClass497_6745) {
					boolean bool = false;
					for (Class330 class330 = ((ItemDefinitions) itemDefinitions).aClass497_6745.method6099((byte) -55); class330 != null; class330 = ((ItemDefinitions) itemDefinitions).aClass497_6745.method6098((short) -32768)) {
						Class537 class537 = (((Class510) this).aClass543_6782.method6339((int) (class330.aLong3341 * -6154793640677333111L), -237698921));
						if (class537.aBoolean6237)
							class330.method3252(603654864);
						else
							bool = true;
					}
					if (!bool)
						((ItemDefinitions) itemDefinitions).aClass497_6745 = null;
				}
			}
			synchronized (((Class510) this).itemDefinitions) {
				((Class510) this).itemDefinitions.put(itemDefinitions, (long) itemId);
			}
			return itemDefinitions;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vc.r(").append(')').toString());
		}
	}

	public void method6175(int i, int i_17_) {
		try {
			((Class510) this).anInt6783 = 219550487 * i;
			synchronized (((Class510) this).aClass367_6773) {
				((Class510) this).aClass367_6773.method4298((byte) 82);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vc.o(").append(')').toString());
		}
	}
}
