/* ItemDefinitions - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class ItemDefinitions implements Interface21 {
	
	public static boolean OLD_ITEMS = false;
	int archiveID4;
	public static int anInt6682 = 1;
	public static int anInt6683 = 2;
	int maleEquip1;
	static int anInt6685 = 5;
	public static short[] otherModifiedModelColors = new short[256];
	public int modelOffset1;
	int anInt6688;
	int[] anIntArray6689;
	public String name = "null";
	short[] modelColors;
	int anInt6692;
	byte[] otherModifiedModelColorsAmount;
	short[] modelTextures;
	short[] modifiedModelTextures;
	byte[] aByteArray6696;
	byte[] aByteArray6697;
	int femaleEquip3;
	public int modelZoom = 533118448;
	int maleEquip2;
	public int[] anIntArray6701;
	public boolean aBoolean6702;
	public int modelOffset2;
	public int equipType;
	public int anInt6705;
	public int value;
	public boolean aBoolean6707;
	public String[] groundOptions;
	public String[] inventoryOptions;
	static int anInt6710 = 6;
	int[] anIntArray6711;
	Class510 aClass510_6712;
	public int anInt6713;
	public int anInt6714;
	public int modelRotation2;
	public boolean aBoolean6716;
	public int anInt6717;
	int archiveID2;
	int maleEquip3;
	public int anInt6720;
	int anInt6721;
	int anInt6722;
	int anInt6723;
	int anInt6724;
	int anInt6725;
	int anInt6726;
	int archiveID3;
	public int anInt6728;
	int archiveID;
	public int modelRotation1 = 0;
	int[] stackIds;
	int[] stackAmounts;
	public int switchNoteItemId;
	public int notedItemId;
	int anInt6735;
	public int anInt6736;
	int anInt6737;
	int anInt6738;
	int anInt6739;
	public static int anInt6740 = 0;
	int anInt6741;
	public int anInt6742;
	short[] modifiedModelColors;
	public int anInt6744;
	Class497 aClass497_6745;
	int femaleEquip1;
	public int anInt6747;
	int anInt6748;
	int modelId;
	int femaleEquip2;
	public int anInt6751;
	public static IndexTable aClass280_6752;
	
	//Old stuff:
	
	public int oldInvModel = -1;
	public int oldInvZoom = -1;
	
	public int oldModelRotation1 = -1;
	public int oldModelRotation2 = -1;
	public int oldModelOffset1 = -1;
	public int oldModelOffset2 = -1;
	
	public int oldMaleEquip1 = -1;
	public int oldMaleEquip2 = -1;
	public int oldMaleEquip3 = -1;
	
	public int oldFemaleEquip1 = -1;
	public int oldFemaleEquip2 = -1;
	public int oldFemaleEquip3 = -1;

    public int oldEquipType = -1;

    public short[] oldModelColors, oldModifiedModelColors;

    public short[] oldModelTextures, oldModifiedModelTextures;

	void method6277(byte i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vy.r(").append(')').toString());
		}
	}

	void method6278(Buffer buffer, int opcode, int i_0_) {
		try {
			if (1 == opcode)
				modelId = buffer.readBigSmart(-1613790124) * -746618911;
			else if (opcode == 2)
				name = buffer.readString(-622109814);
			else if (opcode == 4)
				modelZoom = buffer.readUnsignedShort(-148876235) * 1099778187;
			else if (5 == opcode)
				modelRotation1 = buffer.readUnsignedShort(1684233619) * -1721485547;
			else if (6 == opcode)
				modelRotation2 = buffer.readUnsignedShort(738803449) * 1708425691;
			else if (opcode == 7) {
				modelOffset1 = buffer.readUnsignedShort(54632649) * -1884625849;
				if (-405699209 * modelOffset1 > 32767)
					modelOffset1 -= -465108992;
			} else if (opcode == 8) {
				modelOffset2 = buffer.readUnsignedShort(1464543210) * 808370241;
				if (modelOffset2 * 1949126593 > 32767)
					modelOffset2 -= -1069481984;
			} else if (11 == opcode)
				anInt6736 = -1428413705;
			else if (opcode == 12)
				value = buffer.readInt((byte) 59) * -506504389;
			else if (13 == opcode) {//
				anInt6751 = buffer.readUnsignedByte(-84505818) * 2104314893;
			} else if (opcode == 14) {
				equipType = buffer.readUnsignedByte(1027080989) * 1601832419;
				//System.out.println("equipType: "+equipType);
			} else if (16 == opcode)
				aBoolean6707 = true;
			else if (opcode == 18) {//
				anInt6705 = buffer.readUnsignedShort(408025704) * -1139330501;
			} else if (23 == opcode)
				maleEquip1 = buffer.readBigSmart(-496276360) * -562026033;
			else if (24 == opcode)
				maleEquip2 = buffer.readBigSmart(-1925997134) * 525850731;
			else if (opcode == 25)
				femaleEquip1 = buffer.readBigSmart(-777686532) * -1702059071;
			else if (26 == opcode)
				femaleEquip2 = buffer.readBigSmart(-1971120789) * 301143411;
			else if (27 == opcode)//
				anInt6714 = buffer.readUnsignedByte(1772243667) * -1979242081;
			else if (opcode >= 30 && opcode < 35) {
				groundOptions[opcode - 30] = buffer.readString(-331564843);
			} else if (opcode >= 35 && opcode < 40) {
				inventoryOptions[opcode - 35] = buffer.readString(-85715624);
			} else if (40 == opcode) {
				int i_1_ = buffer.readUnsignedByte(758252286);
				modelColors = new short[i_1_];
				modifiedModelColors = new short[i_1_];
				for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
					modelColors[i_2_] = (short) buffer.readUnsignedShort(987130499);
					short modifiedModelColor = (short) buffer.readUnsignedShort(1594018709);
					modifiedModelColors[i_2_] = modifiedModelColor;//(short) color;//(short) buffer.readUnsignedShort(1594018709);
					//SpecialKeys.sendChatBoxMessage("Color: "+modifiedModelColor);
				}
			} else if (41 == opcode) {
				int i_3_ = buffer.readUnsignedByte(1860039806);
				modelTextures = new short[i_3_];
				modifiedModelTextures = new short[i_3_];
				for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
					modelTextures[i_4_] = (short) buffer.readUnsignedShort(1650149039);
					modifiedModelTextures[i_4_] = (short) buffer.readUnsignedShort(437062664);
				}
			} else if (42 == opcode) {
				int i_5_ = buffer.readUnsignedByte(1152898340);
				otherModifiedModelColorsAmount = new byte[i_5_];
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
					otherModifiedModelColorsAmount[i_6_] = buffer.readByte((byte) -3);
			} else if (43 == opcode) {
				anInt6713 = buffer.readInt((byte) 31) * -877985683;
				aBoolean6716 = true;
			} else if (opcode == 44) {
				int i_7_ = buffer.readUnsignedShort(247305726);
				int i_8_ = 0;
				for (int i_9_ = i_7_; i_9_ > 0; i_9_ >>= 1)
					i_8_++;
				aByteArray6696 = new byte[i_8_];
				byte i_10_ = 0;
				for (int i_11_ = 0; i_11_ < i_8_; i_11_++) {
					if ((i_7_ & 1 << i_11_) > 0) {
						aByteArray6696[i_11_] = i_10_;
						i_10_++;
					} else
						aByteArray6696[i_11_] = (byte) -1;
				}
			} else if (45 == opcode) {
				int i_12_ = buffer.readUnsignedShort(1208804691);
				int i_13_ = 0;
				for (int i_14_ = i_12_; i_14_ > 0; i_14_ >>= 1)
					i_13_++;
				aByteArray6697 = new byte[i_13_];
				byte i_15_ = 0;
				for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
					if ((i_12_ & 1 << i_16_) > 0) {
						aByteArray6697[i_16_] = i_15_;
						i_15_++;
					} else
						aByteArray6697[i_16_] = (byte) -1;
				}
			} else if (opcode == 65)
				aBoolean6702 = true;
			else if (opcode == 78)
				maleEquip3 = buffer.readBigSmart(-1704693689) * -28993671;
			else if (opcode == 79)
				femaleEquip3 = buffer.readBigSmart(-1822951487) * 716863097;
			else if (opcode == 90)
				archiveID3 = buffer.readBigSmart(-559153014) * -1206809503;
			else if (91 == opcode)
				archiveID = buffer.readBigSmart(-739062506) * -394015195;
			else if (opcode == 92)
				archiveID4 = buffer.readBigSmart(-897563730) * -1769567427;
			else if (opcode == 93)
				archiveID2 = buffer.readBigSmart(-1921407615) * -2042479193;
			else if (opcode == 95)
				anInt6717 = buffer.readUnsignedShort(1362853391) * -305380077;
			else if (96 == opcode)//
				anInt6744 = buffer.readUnsignedByte(2029250804) * 2071566323;
			else if (opcode == 97)
				switchNoteItemId = buffer.readUnsignedShort(-138150219) * -1381077897;
			else if (98 == opcode)
				notedItemId = buffer.readUnsignedShort(1217514548) * 281729725;
			else if (opcode >= 100 && opcode < 110) {
				if (null == stackIds) {
					stackIds = new int[10];
					stackAmounts = new int[10];
				}
				stackIds[opcode - 100] = buffer.readUnsignedShort(1043545976);
				stackAmounts[opcode - 100] = buffer.readUnsignedShort(1781818998);
			} else if (opcode == 110)
				anInt6737 = buffer.readUnsignedShort(476812583) * 1962592849;
			else if (111 == opcode)
				anInt6738 = buffer.readUnsignedShort(1313433291) * -768646527;
			else if (112 == opcode)
				anInt6692 = buffer.readUnsignedShort(1670514410) * 252276601;
			else if (opcode == 113)
				anInt6739 = buffer.readByte((byte) -52) * 1649713357;
			else if (opcode == 114)
				anInt6741 = buffer.readByte((byte) -80) * 1817196437;
			else if (115 == opcode)
				anInt6742 = buffer.readUnsignedByte(585137420) * -122795729;
			else if (121 == opcode)
				anInt6735 = buffer.readUnsignedShort(-261448121) * 459950867;
			else if (122 == opcode)
				anInt6720 = buffer.readUnsignedShort(1391954987) * -409288691;
			else if (opcode == 125) {
				anInt6721 = ((buffer.readByte((byte) -43) << 2) * -1578213885);
				anInt6723 = (buffer.readByte((byte) 52) << 2) * 1309246793;
				anInt6725 = (buffer.readByte((byte) 34) << 2) * -10308367;
			} else if (126 == opcode) {
				anInt6722 = (buffer.readByte((byte) 16) << 2) * 1511486057;
				anInt6724 = (buffer.readByte((byte) 1) << 2) * 132709649;
				anInt6726 = (buffer.readByte((byte) 29) << 2) * -33379811;
			} else if (opcode == 127 || opcode == 128 || opcode == 129 || opcode == 130) {
				buffer.readUnsignedByte(683614788);
				buffer.readUnsignedShort(-347986364);
			} else if (opcode == 132) {
				int i_17_ = buffer.readUnsignedByte(1074439978);
				anIntArray6701 = new int[i_17_];
				for (int i_18_ = 0; i_18_ < i_17_; i_18_++)
					anIntArray6701[i_18_] = buffer.readUnsignedShort(909770562);
			} else if (134 == opcode)
				anInt6747 = buffer.readUnsignedByte(1023172850) * -1050163623;
			else if (opcode == 139)
				anInt6748 = buffer.readUnsignedShort(1284695047) * -437144857;
			else if (140 == opcode)
				anInt6728 = buffer.readUnsignedShort(1772400168) * -755161179;
			else if (opcode >= 142 && opcode < 147) {
				if (anIntArray6689 == null) {
					anIntArray6689 = new int[6];
					Arrays.fill(anIntArray6689, -1);
				}
				anIntArray6689[opcode - 142] = buffer.readUnsignedShort(1064131342);
			} else if (opcode >= 150 && opcode < 155) {
				if (anIntArray6711 == null) {
					anIntArray6711 = new int[5];
					Arrays.fill(anIntArray6711, -1);
				}
				anIntArray6711[opcode - 150] = buffer.readUnsignedShort(1379296576);
			} else if(opcode == 242) {
				oldInvModel = buffer.readBigSmart(-1613790124);
				oldInvZoom = buffer.readBigSmart(-1613790124);
			} else if(opcode == 243) {
				oldMaleEquip3 = buffer.readBigSmart(-1613790124);
			} else if(opcode == 244) {
				oldFemaleEquip3 = buffer.readBigSmart(-1613790124);
			} else if(opcode == 245) {
				oldMaleEquip2 = buffer.readBigSmart(-1613790124);
			} else if(opcode == 246) {
				oldFemaleEquip2 = buffer.readBigSmart(-1613790124);
			} else if(opcode == 247) {
				oldMaleEquip1 = buffer.readBigSmart(-1613790124);
			} else if(opcode == 248) {
				oldFemaleEquip1 = buffer.readBigSmart(-1613790124);
			} else if(opcode == 250) {
	            oldEquipType = buffer.readUnsignedByte(611610382);
	        } else if(opcode == 251) {
	            int length = buffer.readUnsignedByte(611610382);
	            oldModelColors = new short[length];
	            oldModifiedModelColors = new short[length];
	            for(int i = 0; i < length; i++) {
	                oldModelColors[i] = (short) buffer.readUnsignedShort(1064131342);
	                oldModifiedModelColors[i] = (short) buffer.readUnsignedShort(1064131342);
	            }
	        } else if(opcode == 252) {
	            int length = buffer.readUnsignedByte(611610382);
	            oldModelTextures = new short[length];
	            oldModifiedModelTextures = new short[length];
	            for(int i = 0; i < length; i++) {
	                oldModelTextures[i] = (short) buffer.readUnsignedShort(1064131342);
	                oldModifiedModelTextures[i] = (short) buffer.readUnsignedShort(1064131342);
	            }
	        } else if(opcode == 253) {
	        	oldModelRotation1 = buffer.readUnsignedShort(1772400168);
	        	oldModelRotation2 = buffer.readUnsignedShort(1772400168);
	        	oldModelOffset1 = buffer.readUnsignedShort(1772400168);
	        	oldModelOffset2 = buffer.readUnsignedShort(1772400168);
			} else if (249 == opcode) {
				int i_19_ = buffer.readUnsignedByte(611610382);
				if (aClass497_6745 == null) {
					int i_20_ = Class136.method1594(i_19_, 1720258284);
					aClass497_6745 = new Class497(i_20_);
				}
				for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
					boolean bool = buffer.readUnsignedByte(86814745) == 1;
					int i_22_ = buffer.readUnsignedTriByte(-1401356047);
					Class330 class330;
					if (bool)
						class330 = new Class330_Sub35(buffer.readString(400565905));
					else
						class330 = new Class330_Sub23(buffer.readInt((byte) 45));
					aClass497_6745.method6097(class330, (long) i_22_);
				}
			} else {
				System.out.println("Opcode missing? "+opcode);
			}
			if (name != null && !name.equals("null")) {
				value = ItemPrices.getValue(name, modelId * -726596575, value * -1519860237) * -506504389;
				if (name.equals("Dragonfire shield")) {
					//
				}
				if (getItemId() == 1205) {
					//System.out.println("d1: "+anInt6751);
					//System.out.println("d2: "+anInt6714);
					//System.out.println("d3: "+anInt6705);
					System.out.println("dagger opcode: "+opcode);//2, 97, 249, 144, 151
				} else if (name.contains("longsword")) {
					//System.out.println("l1: "+anInt6751);
					//System.out.println("l2: "+anInt6714);
					//System.out.println("l3: "+anInt6705);
				} else if (getItemId() == 1333) {//2, 4, 5, 6, 7, 8, 12, 13, 14, 23, 25, 36, 65, 97, 121, 144, 151, 249
					//4, 5, 6, 7, 
					//8, 
					//12, 
					//sus 13
					//sus 14, 
					//23, 25, 
					//36, 65, 
					//sus 121
					
					System.out.println("scim opcode: "+opcode);
				}
			}
			//equipType = 1;
			//value = 1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vy.i(").append(')').toString());
		}
	}
	
	int[] method6279(Class_ra class_ra, Class_ra class_ra_23_, int i, int i_24_, int i_25_, boolean bool, int i_26_, Class263 class263, Class408 class408, byte i_27_) {
		try {
			Model class98 = Model.loadModel((((Class510) aClass510_6712).modelIndex), -726596575 * modelId, 0);
			if (class98 == null)
				return null;
			if (class98.anInt881 < 13)
				class98.method1196(2);
			if (modelColors != null) {
				for (int i_28_ = 0; i_28_ < modelColors.length; i_28_++) {
					if (null != otherModifiedModelColorsAmount && i_28_ < otherModifiedModelColorsAmount.length)
						class98.color((modelColors[i_28_]), otherModifiedModelColors[(((ItemDefinitions) this).otherModifiedModelColorsAmount[i_28_]) & 0xff]);
					else
						class98.color((modelColors[i_28_]), (modifiedModelColors[i_28_]));
				}
			}
			if (modelTextures != null) {
				for (int i_29_ = 0; i_29_ < modelTextures.length; i_29_++)
					class98.method1200((modelTextures[i_29_]), (modifiedModelTextures[i_29_]));
			}
			if (class408 != null) {
				for (int i_30_ = 0; i_30_ < 10; i_30_++) {
					for (int i_31_ = 0; i_31_ < Class408.modelColors[i_30_].length; i_31_++) {
						if (class408.anIntArray4205[i_30_] < (Class408.modifiedModelColors[i_30_][i_31_]).length)
							class98.color(Class408.modelColors[i_30_][i_31_], (Class408.modifiedModelColors[i_30_][i_31_][class408.anIntArray4205[i_30_]]));
					}
				}
			}
			int i_32_ = 2048;
			boolean bool_33_ = false;
			if (651345585 * anInt6737 != 128 || 128 != 924245377 * anInt6738 || 128 != 1244842697 * anInt6692) {
				bool_33_ = true;
				i_32_ |= 0x7;
			}
			Class387 class387 = class_ra.cb(class98, i_32_, 64, 64 + anInt6739 * 386681861, 768 + anInt6741 * -361313615);
			if (!class387.method4462())
				return null;
			if (bool_33_)
				class387.oa(anInt6737 * 651345585, 924245377 * anInt6738, 1244842697 * anInt6692);
			Class61 class61 = null;
			if (notedItemId * 1693216917 != -1) {
				class61 = (aClass510_6712.method6168(class_ra, class_ra_23_, switchNoteItemId * 933834055, 10, 1, 0, true, true, 0, class263, class408, (short) 1759));
				if (null == class61)
					return null;
			} else if (anInt6720 * 556764869 != -1) {
				class61 = (aClass510_6712.method6168(class_ra, class_ra_23_, -1479330021 * anInt6735, i, i_24_, i_25_, false, true, 0, class263, class408, (short) -1197));
				if (null == class61)
					return null;
			} else if (381773869 * anInt6728 != -1) {
				class61 = (aClass510_6712.method6168(class_ra, class_ra_23_, -1068547881 * anInt6748, i, i_24_, i_25_, false, true, 0, class263, class408, (short) -345));
				if (class61 == null)
					return null;
			}
			int i_34_;
			if (bool)
				i_34_ = (int) ((double) (modelZoom * -1740972253) * 1.5) << 2;
			else if (2 == i_24_)
				i_34_ = (int) (1.04 * (double) (-1740972253 * modelZoom)) << 2;
			else
				i_34_ = modelZoom * -1740972253 << 2;
			Class249 class249 = class_ra.cs();
			Class249 class249_35_ = class_ra.cz();
			class249_35_.method2493(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) class_ra.method4782((byte) 0).method856(), (float) class_ra.method4782((byte) 0).method857());
			class_ra.ci(class249_35_);
			class_ra.ae(0, 0, class_ra.method4782((byte) 0).method856(), class_ra.method4782((byte) 0).method857());
			Class247 class247 = new Class247();
			class_ra.cw(class247);
			class_ra.IA(0.95F + (float) (Math.random() / 10.0));
			class_ra.m(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0), -50.0F, -10.0F, -50.0F);
			Class247 class247_36_ = class_ra.cj();
			class247_36_.method2473(0.0F, 0.0F, 1.0F, Class257.method2541(-(1180323099 * anInt6717) << 3));
			class247_36_.method2462(0.0F, 1.0F, 0.0F, Class257.method2541(modelRotation2 * -946761133 << 3));
			class247_36_.method2474((float) (modelOffset1 * -405699209 << 2), (float) ((i_34_ * (Class257.anIntArray2683[modelRotation1 * -1571069891 << 3]) >> 14) - class387.YA() / 2 + (modelOffset2 * 1949126593 << 2)), (float) ((1949126593 * modelOffset2 << 2) + ((Class257.anIntArray2684[-1571069891 * modelRotation1 << 3]) * i_34_ >> 14)));
			class247_36_.method2462(1.0F, 0.0F, 0.0F, Class257.method2541(-1571069891 * modelRotation1 << 3));
			class_ra.r(0, 0, 36, 32);
			class_ra.ba(2, 0);
			class_ra.B(0, 0, 36, 32, 0, 0);
			class_ra.c(0, -1, 0);
			class387.method4475(class247_36_, null, 1);
			class_ra.ci(class249);
			int[] is = class_ra.ar(0, 0, 36, 32);
			if (i_24_ >= 1) {
				is = method6284(is, -16777214, 719425834);
				if (i_24_ >= 2)
					is = method6284(is, -1, 276442950);
			}
			if (i_25_ != 0)
				method6285(is, i_25_, 116650912);
			if (-1 != anInt6720 * 556764869)
				class61.method687(0, 0);
			else if (anInt6728 * 381773869 != -1)
				class61.method687(0, 0);
			class_ra.method4795(is, 0, 36, 36, 32, (byte) -84).method687(0, 0);
			if (1693216917 * notedItemId != -1)
				class61.method687(0, 0);
			if (1 == i_26_ || 2 == i_26_ && (anInt6736 * 1369390791 == 1 || i != 1) && i != -1)
				class263.method2594(Class_ta_Sub3.method5686(i, (((Class510) (((ItemDefinitions) this).aClass510_6712)).aClass454_6785), 2103862546), 0, 9, -256, -16777215, 1465945162);
			is = class_ra.ar(0, 0, 36, 32);
			for (int i_37_ = 0; i_37_ < is.length; i_37_++) {
				if (0 == (is[i_37_] & 0xffffff))
					is[i_37_] = 0;
				else
					is[i_37_] |= ~0xffffff;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vy.w(").append(')').toString());
		}
	}
	
	void method6280(ItemDefinitions class530_38_, ItemDefinitions class530_39_, int i) {
		try {
			value = 0;
			modelId = ((ItemDefinitions) class530_38_).modelId * 1;
			modelZoom = 1 * class530_38_.modelZoom;
			modelRotation1 = class530_38_.modelRotation1 * 1;
			modelRotation2 = 1 * class530_38_.modelRotation2;
			anInt6717 = 1 * class530_38_.anInt6717;
			modelOffset1 = class530_38_.modelOffset1 * 1;
			modelOffset2 = 1 * class530_38_.modelOffset2;
			modelColors = ((ItemDefinitions) class530_39_).modelColors;
			modifiedModelColors = ((ItemDefinitions) class530_39_).modifiedModelColors;
			otherModifiedModelColorsAmount = ((ItemDefinitions) class530_39_).otherModifiedModelColorsAmount;
			modelTextures = ((ItemDefinitions) class530_39_).modelTextures;
			modifiedModelTextures = ((ItemDefinitions) class530_39_).modifiedModelTextures;
			name = class530_39_.name;
			aBoolean6707 = class530_39_.aBoolean6707;
			anInt6751 = 1 * class530_39_.anInt6751;
			equipType = class530_39_.equipType * 1;
			anInt6714 = 1 * class530_39_.anInt6714;
			maleEquip1 = ((ItemDefinitions) class530_39_).maleEquip1 * 1;
			maleEquip2 = ((ItemDefinitions) class530_39_).maleEquip2 * 1;
			maleEquip3 = 1 * ((ItemDefinitions) class530_39_).maleEquip3;
			femaleEquip1 = ((ItemDefinitions) class530_39_).femaleEquip1 * 1;
			femaleEquip2 = ((ItemDefinitions) class530_39_).femaleEquip2 * 1;
			femaleEquip3 = ((ItemDefinitions) class530_39_).femaleEquip3 * 1;

			anInt6721 = ((ItemDefinitions) class530_39_).anInt6721 * 1;
			anInt6722 = ((ItemDefinitions) class530_39_).anInt6722 * 1;
			anInt6723 = 1 * ((ItemDefinitions) class530_39_).anInt6723;
			anInt6724 = 1 * ((ItemDefinitions) class530_39_).anInt6724;
			anInt6725 = ((ItemDefinitions) class530_39_).anInt6725 * 1;
			anInt6726 = 1 * ((ItemDefinitions) class530_39_).anInt6726;
			archiveID3 = 1 * ((ItemDefinitions) class530_39_).archiveID3;
			archiveID4 = 1 * ((ItemDefinitions) class530_39_).archiveID4;
			archiveID = ((ItemDefinitions) class530_39_).archiveID * 1;
			archiveID2 = 1 * ((ItemDefinitions) class530_39_).archiveID2;
			anInt6742 = 1 * class530_39_.anInt6742;
			groundOptions = class530_39_.groundOptions;
			aClass497_6745 = ((ItemDefinitions) class530_39_).aClass497_6745;
			inventoryOptions = new String[5];
			if (class530_39_.inventoryOptions != null) {
				for (int i_40_ = 0; i_40_ < 4; i_40_++) {
					inventoryOptions[i_40_] = class530_39_.inventoryOptions[i_40_];
				}
			}
			inventoryOptions[4] = Class526.aClass526_6045.method6257((((Class510) (((ItemDefinitions) this).aClass510_6712)).aClass454_6785), 991479434);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vy.o(").append(')').toString());
		}
	}

	ItemDefinitions() {
		modelRotation2 = 0;
		anInt6717 = 0;
		modelOffset1 = 0;
		modelOffset2 = 0;
		anInt6736 = 0;
		anInt6705 = 1139330501;
		value = -506504389;
		aBoolean6707 = false;
		anInt6751 = -2104314893;
		equipType = -1601832419;
		//equipType = 0;
		
		anInt6714 = 1979242081;
		maleEquip1 = 562026033;
		maleEquip2 = -525850731;
		femaleEquip1 = 1702059071;
		femaleEquip2 = -301143411;
		maleEquip3 = 28993671;
		femaleEquip3 = -716863097;
		anInt6721 = 0;
		anInt6722 = 0;
		anInt6723 = 0;
		anInt6724 = 0;
		anInt6725 = 0;
		anInt6726 = 0;
		archiveID3 = 1206809503;
		archiveID4 = 1769567427;
		archiveID = 394015195;
		archiveID2 = 2042479193;
		switchNoteItemId = 1381077897;
		notedItemId = -281729725;
		anInt6735 = -459950867;
		anInt6720 = 409288691;
		anInt6737 = 2103781504;
		anInt6738 = 397492352;
		anInt6692 = -2068333440;
		anInt6739 = 0;
		anInt6741 = 0;
		anInt6742 = 0;
		aBoolean6702 = false;
		anInt6744 = 0;
		anInt6747 = 0;
		anInt6748 = 437144857;
		anInt6728 = 755161179;
		aBoolean6716 = false;
	}
	
	public static final void changePrice(int itemId, int price) {
		ItemDefinitions defs = Class556.aClass510_6392.getItemDefinitions(itemId, (byte) -51);
		defs.value = price * -506504389;
	}
	
	public static int color = 0;
	
	/**
	 * method6279 - loading item
	 * method6281 - loading item 2
	 * getEquipmentInformation
	 * method6295
	 */
	public static final void changeColors(int itemId, int color) {
		ItemDefinitions.color = color;
		Class556.aClass510_6392.itemDefinitions.put(null, itemId);
		ItemDefinitions defs = Class556.aClass510_6392.getItemDefinitions(itemId, (byte) -51);
		defs.method6281((Class361.aClass_ra3793), 131072, -2, null, null, 0, 0, 0, 0, 1863127057);
	}
	
	//-525, -400, -425
	
	/**
	 * Red = null
	 * Purple = -14400
	 * Blue = 926, -21568
	 * Green = 926, 22464
	 * Yellow = 926, 11200
	 * White = 127
	 * 50 = grey
	 * 
		Yellow = 926, 11200
		Blue = 926, -21568
		Green = 926, 22464
		Purple = -14400
		White = 127
	 */
	
	public final Class387 method6281(Class_ra class_ra, int i, int itemId2, Class408 class408, Class477 class477, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_) {
		try {
			if (null != stackIds && itemId2 > 1) {
				int itemId = -1;
				for (int i_48_ = 0; i_48_ < 10; i_48_++) {
					if (itemId2 >= stackAmounts[i_48_] && 0 != stackAmounts[i_48_])
						itemId = stackIds[i_48_];
				}
				if (-1 != itemId)
					return (aClass510_6712.getItemDefinitions(itemId, (byte) -72).method6281(class_ra, i, 1, class408, class477, i_42_, i_43_, i_44_, i_45_, 1863127057));
			}
			int i_49_ = i;
			if (class477 != null)
				i_49_ |= class477.method5975(-536499054);
			Class387 class387;
			synchronized (((Class510) aClass510_6712).aClass367_6773) {
				class387 = ((Class387) (((Class510) aClass510_6712).aClass367_6773.get((long) (anInt6688 * 888090509 | 1409150453 * class_ra.anInt4226 << 29))));
			}
			if (class387 == null || class_ra.ct(class387.m(), i_49_) != 0) {
				if (null != class387)
					i_49_ = class_ra.cd(i_49_, class387.m());
				int i_50_ = i_49_;
				if (null != modelTextures)
					i_50_ |= 0x8000;
				if (null != modelColors || null != class408)
					i_50_ |= 0x4000;
				if (128 != 651345585 * anInt6737)
					i_50_ |= 0x1;
				if (anInt6737 * 651345585 != 128)
					i_50_ |= 0x2;
				if (128 != 651345585 * anInt6737)
					i_50_ |= 0x4;
				Model class98 = Model.loadModel((((Class510) aClass510_6712).modelIndex), (-726596575 * modelId), 0);
				if (null == class98)
					return null;
				if (class98.anInt881 < 13)
					class98.method1196(2);
				class387 = class_ra.cb(class98, i_50_, (((Class510) aClass510_6712).anInt6783 * -132492121), 386681861 * anInt6739 + 64, (anInt6741 * -361313615 + 850));
				if (anInt6737 * 651345585 != 128 || 924245377 * anInt6738 != 128 || anInt6692 * 1244842697 != 128)
					class387.oa(651345585 * anInt6737, 924245377 * anInt6738, 1244842697 * anInt6692);
				if (null != modelColors) {
					//color appears to do absoluetly nothing
					for (int i_51_ = 0; i_51_ < modelColors.length; i_51_++) {
						if (otherModifiedModelColorsAmount != null && i_51_ < otherModifiedModelColorsAmount.length)
							class387.color((modelColors[i_51_]), otherModifiedModelColors[(((ItemDefinitions) this).otherModifiedModelColorsAmount[i_51_]) & 0xff]);
						else
							class387.color((modelColors[i_51_]), (modifiedModelColors[i_51_]));
					}
				}
				if (null != modelTextures) {
					for (int i_52_ = 0; i_52_ < modelTextures.length; i_52_++)
						class387.paintTexture(modelTextures[i_52_], modifiedModelTextures[i_52_]);
				}
				if (class408 != null) {
					for (int i_53_ = 0; i_53_ < 10; i_53_++) {
						for (int i_54_ = 0; (i_54_ < Class408.modelColors[i_53_].length); i_54_++) {
							if (class408.anIntArray4205[i_53_] < (Class408.modifiedModelColors[i_53_][i_54_]).length)
								class387.color((Class408.modelColors[i_53_][i_54_]), 
										(Class408.modifiedModelColors[i_53_][i_54_][class408.anIntArray4205[i_53_]]));
						}
					}
				}
				class387.KA(i_49_);
				synchronized (((Class510) aClass510_6712).aClass367_6773) {
					((Class510) aClass510_6712).aClass367_6773.put(class387, (long) (888090509 * anInt6688 | class_ra.anInt4226 * 1409150453 << 29));
				}
			}
			if (class477 != null || i_45_ != 0) {
				class387 = class387.method4446((byte) 1, i_49_, true);
				if (null != class477)
					class477.method5976(class387, 0, -1785935258);
				if (0 != i_45_)
					class387.PA(i_42_, i_43_, i_44_, i_45_);
			}
			class387.KA(i);
			return class387;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vy.f(").append(')').toString());
		}
	}

	public ItemDefinitions method6282(int i, byte i_55_) {
		try {
			if (null != stackIds && i > 1) {
				int i_56_ = -1;
				for (int i_57_ = 0; i_57_ < 10; i_57_++) {
					if (i >= stackAmounts[i_57_] && stackAmounts[i_57_] != 0)
						i_56_ = stackIds[i_57_];
				}
				if (i_56_ != -1)
					return aClass510_6712.getItemDefinitions(i_56_, (byte) -7);
			}
			return this;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vy.z(").append(')').toString());
		}
	}

	void method6283(ItemDefinitions class530_58_, ItemDefinitions class530_59_, int i) {
		try {
			value = 0;
			modelId = 1 * ((ItemDefinitions) class530_58_).modelId;
			modelZoom = 1 * class530_58_.modelZoom;
			modelRotation1 = class530_58_.modelRotation1 * 1;
			modelRotation2 = 1 * class530_58_.modelRotation2;
			anInt6717 = class530_58_.anInt6717 * 1;
			modelOffset1 = class530_58_.modelOffset1 * 1;
			modelOffset2 = class530_58_.modelOffset2 * 1;
			modelColors = ((ItemDefinitions) class530_59_).modelColors;
			modifiedModelColors = ((ItemDefinitions) class530_59_).modifiedModelColors;
			otherModifiedModelColorsAmount = ((ItemDefinitions) class530_59_).otherModifiedModelColorsAmount;
			modelTextures = ((ItemDefinitions) class530_59_).modelTextures;
			modifiedModelTextures = ((ItemDefinitions) class530_59_).modifiedModelTextures;
			name = class530_59_.name;
			aBoolean6707 = class530_59_.aBoolean6707;
			anInt6751 = 1 * class530_59_.anInt6751;
			equipType = 1 * class530_59_.equipType;
			anInt6714 = class530_59_.anInt6714 * 1;

			maleEquip1 = ((ItemDefinitions) class530_59_).maleEquip1 * 1;
			maleEquip2 = ((ItemDefinitions) class530_59_).maleEquip2 * 1;
			maleEquip3 = 1 * ((ItemDefinitions) class530_59_).maleEquip3;
			femaleEquip1 = 1 * ((ItemDefinitions) class530_59_).femaleEquip1;
			femaleEquip2 = ((ItemDefinitions) class530_59_).femaleEquip2 * 1;
			femaleEquip3 = 1 * ((ItemDefinitions) class530_59_).femaleEquip3;

			anInt6721 = ((ItemDefinitions) class530_59_).anInt6721 * 1;
			anInt6722 = 1 * ((ItemDefinitions) class530_59_).anInt6722;
			anInt6723 = 1 * ((ItemDefinitions) class530_59_).anInt6723;
			anInt6724 = 1 * ((ItemDefinitions) class530_59_).anInt6724;
			anInt6725 = ((ItemDefinitions) class530_59_).anInt6725 * 1;
			anInt6726 = ((ItemDefinitions) class530_59_).anInt6726 * 1;
			archiveID3 = 1 * ((ItemDefinitions) class530_59_).archiveID3;
			archiveID4 = 1 * ((ItemDefinitions) class530_59_).archiveID4;
			archiveID = ((ItemDefinitions) class530_59_).archiveID * 1;
			archiveID2 = ((ItemDefinitions) class530_59_).archiveID2 * 1;
			anInt6742 = class530_59_.anInt6742 * 1;
			groundOptions = class530_59_.groundOptions;
			aClass497_6745 = ((ItemDefinitions) class530_59_).aClass497_6745;
			anInt6736 = 1 * class530_59_.anInt6736;
			inventoryOptions = new String[5];
			if (null != class530_59_.inventoryOptions) {
				for (int i_60_ = 0; i_60_ < 4; i_60_++) {
					inventoryOptions[i_60_] = class530_59_.inventoryOptions[i_60_];
				}
			}
			inventoryOptions[4] = Class526.aClass526_6107.method6257((((Class510) (((ItemDefinitions) this).aClass510_6712)).aClass454_6785), 991479434);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vy.s(").append(')').toString());
		}
	}

	int[] method6284(int[] is, int i, int i_61_) {
		try {
			int[] is_62_ = new int[1152];
			int i_63_ = 0;
			for (int i_64_ = 0; i_64_ < 32; i_64_++) {
				for (int i_65_ = 0; i_65_ < 36; i_65_++) {
					int i_66_ = is[i_63_];
					if (i_66_ == 0) {
						if (i_65_ > 0 && is[i_63_ - 1] != 0)
							i_66_ = i;
						else if (i_64_ > 0 && is[i_63_ - 36] != 0)
							i_66_ = i;
						else if (i_65_ < 35 && 0 != is[i_63_ + 1])
							i_66_ = i;
						else if (i_64_ < 31 && is[36 + i_63_] != 0)
							i_66_ = i;
					}
					is_62_[i_63_++] = i_66_;
				}
			}
			return is_62_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vy.n(").append(')').toString());
		}
	}

	void method6285(int[] is, int i, int i_67_) {
		try {
			for (int i_68_ = 31; i_68_ > 0; i_68_--) {
				int i_69_ = i_68_ * 36;
				for (int i_70_ = 35; i_70_ > 0; i_70_--) {
					if (is[i_69_ + i_70_] == 0 && 0 != is[i_69_ + i_70_ - 1 - 36])
						is[i_70_ + i_69_] = i;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vy.l(").append(')').toString());
		}
	}

	public final boolean method6286(boolean bool, ItemEquipDefinitions class518, int i) {
		try {
			int i_71_;
			int i_72_;
			if (bool) {
				if (null != class518 && null != class518.archiveIds) {
					i_71_ = class518.archiveIds[0];
					i_72_ = class518.archiveIds[1];
				} else {
					i_71_ = -1993499219 * archiveID;
					i_72_ = archiveID2 * 203069975;
				}
			} else if (class518 != null && null != class518.archiveIds2) {
				i_71_ = class518.archiveIds2[0];
				i_72_ = class518.archiveIds2[1];
			} else {
				i_71_ = -1751509087 * archiveID3;
				i_72_ = archiveID4 * 654976021;
			}
			if (i_71_ == -1)
				return true;
			boolean bool_73_ = true;
			if (!((Class510) aClass510_6712).modelIndex.hasStoredFile(i_71_, 0, (byte) 32))
				bool_73_ = false;
			if (i_72_ != -1 && !((Class510) aClass510_6712).modelIndex.hasStoredFile(i_72_, 0, (byte) 32))
				bool_73_ = false;
			return bool_73_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vy.u(").append(')').toString());
		}
	}

	public int method6287(int i, int i_74_, int i_75_) {
		try {
			if (null == aClass497_6745)
				return i_74_;
			Class330_Sub23 class330_sub23 = ((Class330_Sub23) aClass497_6745.method6094((long) i));
			if (class330_sub23 == null)
				return i_74_;
			return 393599711 * class330_sub23.anInt7693;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vy.g(").append(')').toString());
		}
	}

	public String method6288(int i, String string, byte i_76_) {
		try {
			if (null == aClass497_6745)
				return string;
			Class330_Sub35 class330_sub35 = ((Class330_Sub35) aClass497_6745.method6094((long) i));
			if (null == class330_sub35)
				return string;
			return (String) class330_sub35.anObject7733;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vy.d(").append(')').toString());
		}
	}

	public int method6289(int i, int i_77_) {
		try {
			if (null == anIntArray6689)
				return -1;
			return anIntArray6689[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vy.c(").append(')').toString());
		}
	}

	public int method6290(int i, int i_78_) {
		try {
			if (null == anIntArray6711)
				return -1;
			return anIntArray6711[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vy.a(").append(')').toString());
		}
	}

	public final boolean missingFile(boolean female, ItemEquipDefinitions class518, int i) {
		try {
			int archiveId1;
			int archiveId2;
			int archiveId3;
			if (female) {
				if (null != class518 && class518.femaleEquipIds != null) {
					archiveId1 = class518.femaleEquipIds[0];
					archiveId2 = class518.femaleEquipIds[1];
					archiveId3 = class518.femaleEquipIds[2];
				} else {
					archiveId1 = 376794177 * femaleEquip1;
					archiveId2 = -789178437 * femaleEquip2;
					archiveId3 = 1740510153 * femaleEquip3;
				}
			} else if (class518 != null && class518.maleEquipIds != null) {
				archiveId1 = class518.maleEquipIds[0];
				archiveId2 = class518.maleEquipIds[1];
				archiveId3 = class518.maleEquipIds[2];
			} else {
				archiveId1 = -1243726545 * maleEquip1;
				archiveId2 = -1680993213 * maleEquip2;
				archiveId3 = 833495753 * maleEquip3;
			}
			if (-1 == archiveId1)
				return true;
			boolean missingFile = true;
			if (!((Class510) aClass510_6712).modelIndex.hasStoredFile(archiveId1, 0, (byte) 32))
				missingFile = false;
			if (archiveId2 != -1 && !((Class510) aClass510_6712).modelIndex.hasStoredFile(archiveId2, 0, (byte) 32))
				missingFile = false;
			if (-1 != archiveId3 && !((Class510) aClass510_6712).modelIndex.hasStoredFile(archiveId3, 0, (byte) 32))
				missingFile = false;
			return missingFile;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vy.k(").append(')').toString());
		}
	}
	
	/**
	 * Colors and Equipment information
	 */
	public final Model getEquipmentInformation(boolean female, ItemEquipDefinitions class518, int i) {
		try {
			int archiveId1;
			int archiveId2;
			int archiveId3;
			if (female) {//method6292
				if (null != class518 && class518.femaleEquipIds != null) {
					archiveId1 = class518.femaleEquipIds[0];
					archiveId2 = class518.femaleEquipIds[1];
					archiveId3 = class518.femaleEquipIds[2];
				} else {
					archiveId1 = femaleEquip1 * 376794177;
					archiveId2 = femaleEquip2 * -789178437;
					archiveId3 = femaleEquip3 * 1740510153;
				}
			} else if (class518 != null && class518.maleEquipIds != null) {
				archiveId1 = class518.maleEquipIds[0];
				archiveId2 = class518.maleEquipIds[1];
				archiveId3 = class518.maleEquipIds[2];
			} else {
				archiveId1 = -1243726545 * maleEquip1;
				archiveId2 = -1680993213 * maleEquip2;
				archiveId3 = 833495753 * maleEquip3;
			}
			if (archiveId1 == -1)
				return null;
			Model class98 = Model.loadModel((((Class510) aClass510_6712).modelIndex), archiveId1, 0);
			if (null == class98)
				return null;
			if (class98.anInt881 < 13)
				class98.method1196(2);
			if (-1 != archiveId2) {
				Model class98_86_ = Model.loadModel((((Class510) aClass510_6712).modelIndex), archiveId2, 0);
				if (class98_86_.anInt881 < 13)
					class98_86_.method1196(2);
				if (archiveId3 != -1) {
					Model class98_87_ = Model.loadModel((((Class510) (((ItemDefinitions) this).aClass510_6712)).modelIndex), archiveId3, 0);
					if (class98_87_.anInt881 < 13)
						class98_87_.method1196(2);
					Model[] class98s = { class98, class98_86_, class98_87_ };
					class98 = new Model(class98s, 3);
				} else {
					Model[] class98s = { class98, class98_86_ };
					class98 = new Model(class98s, 2);
				}
			}
			if (!female && (0 != anInt6721 * -499139413 || 280919289 * anInt6723 != 0 || 0 != anInt6725 * -492717039))
				class98.method1194(anInt6721 * -499139413, 280919289 * anInt6723, -492717039 * anInt6725);
			if (female && (anInt6722 * -1219150375 != 0 || 0 != anInt6724 * -221670415 || -838637515 * anInt6726 != 0))
				class98.method1194(anInt6722 * -1219150375, anInt6724 * -221670415, -838637515 * anInt6726);
			if (modelColors != null) {
				short[] is;
				if (class518 != null && class518.moreModifiedColors != null)
					is = class518.moreModifiedColors;
				else
					is = modifiedModelColors;
				for (int i_88_ = 0; i_88_ < modelColors.length; i_88_++)
					class98.color((modelColors[i_88_]), is[i_88_]);
			}
			if (null != modelTextures) {
				short[] is;
				if (class518 != null && class518.aShortArray6009 != null)
					is = class518.aShortArray6009;
				else
					is = modifiedModelTextures;
				for (int i_89_ = 0; i_89_ < modelTextures.length; i_89_++)
					class98.method1200((modelTextures[i_89_]), is[i_89_]);
			}
			return class98;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vy.q(").append(')').toString());
		}
	}

	void method6293(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_90_ = class330_sub46.readUnsignedByte(-178251306);
				if (0 == i_90_) {
					if (i <= -1682046256)
						throw new IllegalStateException();
					break;
				}
				//System.out.println(getItemId());
				method6278(class330_sub46, i_90_, 1876120180);
			}
			if(OLD_ITEMS) {
		        String name = this.name.toLowerCase();
		        if
		                (name.contains("d'hide body")
		                || name.contains("dragonhide body")
		                || name.equals("stripy pirate shirt")
		                || (name.contains("chainbody")
		                && (name.contains("iron") || name.contains("bronze")
		                || name.contains("steel")
		                || name.contains("black")
		                || name.contains("mithril")
		                || name.contains("adamant")
		                || name.contains("rune")
		                || name.contains("white")))
		                || name.equals("leather body")
		                || name.equals("hardleather body")
		                || name.contains("studded body"))
		            return;
		        int[] oldDefs = OldItems.getOldItemData(getItemId());
		        if (oldDefs == null || oldDefs.length == 0)
		        	return;
				oldInvModel = oldDefs[0];
				oldInvZoom = oldDefs[1];
				oldModelRotation1 = oldDefs[2];
				oldModelRotation2 = oldDefs[3];
				oldModelOffset1 = oldDefs[4];
				oldModelOffset2 = oldDefs[5];
				oldMaleEquip1 = oldDefs[6];
				oldMaleEquip2 = oldDefs[7];
				oldMaleEquip3 = oldDefs[8];
				oldFemaleEquip1 = oldDefs[9];
				oldFemaleEquip2 = oldDefs[10];
				oldFemaleEquip3 = oldDefs[11];
				oldEquipType = oldDefs[12];
				if(oldInvModel != -1)
					modelId = oldInvModel * -746618911;
				if(oldInvZoom != -1)
					modelZoom = oldInvZoom * 1099778187;
				if(oldModelRotation1 != -1)
					modelRotation1 = oldModelRotation1 * -1721485547;
				if(oldModelRotation2 != -1)
					modelRotation2 = oldModelRotation2 * 1708425691; 
				if(oldModelOffset1 != -1) {
					modelOffset1 = oldModelOffset1 * -1884625849;
					if (-405699209 * modelOffset1 > 32767)
						modelOffset1 -= -465108992;
				}
				if(oldModelOffset2 != -1) {
					modelOffset2 = oldModelOffset2 * 808370241;
					if (modelOffset2 * 1949126593 > 32767)
						modelOffset2 -= -1069481984;
				}
				if(oldMaleEquip1 != -1)
					maleEquip1 = oldMaleEquip1 * -562026033;
				if(oldMaleEquip2 != -1)
					maleEquip2 = oldMaleEquip2 * 525850731;
				if(oldMaleEquip3 != -1)
					maleEquip3 = oldMaleEquip3 * -28993671;
				if(oldFemaleEquip1 != -1)
					femaleEquip1 = oldFemaleEquip1 * -1702059071;
				if(oldFemaleEquip2 != -1)
					femaleEquip2 = oldFemaleEquip2 * 301143411;
				if(oldFemaleEquip3 != -1)
					femaleEquip3 = oldFemaleEquip3 * 716863097;
				if(oldEquipType != -1)
					equipType = oldEquipType * 1601832419;
				if(oldModelColors != null) {
					modelColors = oldModelColors;
					modifiedModelColors = oldModifiedModelColors;
				}
				if(oldModelTextures != null) {
					modelTextures = oldModelTextures;
					modifiedModelTextures = oldModifiedModelTextures;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vy.j(").append(')').toString());
		}
	}
	
	public int getItemId() {
		return anInt6688 * 888090509;// | 1409150453 * class_ra.anInt4226 << 29
	}

	void method6294(ItemDefinitions class530_91_, ItemDefinitions class530_92_, byte i) {
		try {
			modelId = ((ItemDefinitions) class530_91_).modelId * 1;
			modelZoom = 1 * class530_91_.modelZoom;
			modelRotation1 = 1 * class530_91_.modelRotation1;
			modelRotation2 = 1 * class530_91_.modelRotation2;
			anInt6717 = class530_91_.anInt6717 * 1;
			modelOffset1 = class530_91_.modelOffset1 * 1;
			modelOffset2 = class530_91_.modelOffset2 * 1;
			modelColors = ((ItemDefinitions) class530_91_).modelColors;
			modifiedModelColors = ((ItemDefinitions) class530_91_).modifiedModelColors;
			otherModifiedModelColorsAmount = ((ItemDefinitions) class530_91_).otherModifiedModelColorsAmount;
			modelTextures = ((ItemDefinitions) class530_91_).modelTextures;
			modifiedModelTextures = ((ItemDefinitions) class530_91_).modifiedModelTextures;
			name = class530_92_.name;
			aBoolean6707 = class530_92_.aBoolean6707;
			value = 1 * class530_92_.value;
			anInt6736 = -1428413705;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vy.p(").append(')').toString());
		}
	}
	
	public final Model getEquipmentInformation2(boolean bool, ItemEquipDefinitions class518, byte i) {
		try {
			int archiveId;
			int archiveId2;
			if (bool) {
				if (null != class518 && class518.archiveIds != null) {
					archiveId = class518.archiveIds[0];
					archiveId2 = class518.archiveIds[1];
				} else {
					archiveId = -1993499219 * archiveID;
					archiveId2 = archiveID2 * 203069975;
				}
			} else if (class518 != null && null != class518.archiveIds2) {
				archiveId = class518.archiveIds2[0];
				archiveId2 = class518.archiveIds2[1];
			} else {
				archiveId = -1751509087 * archiveID3;
				archiveId2 = archiveID4 * 654976021;
			}
			if (archiveId == -1)
				return null;
			Model model = Model.loadModel((((Class510) aClass510_6712).modelIndex), archiveId, 0);
			if (model.anInt881 < 13)
				model.method1196(2);
			if (-1 != archiveId2) {
				Model model2 = Model.loadModel((((Class510) aClass510_6712).modelIndex), archiveId2, 0);
				if (model2.anInt881 < 13)
					model2.method1196(2);
				Model[] class98s = { model, model2 };
				model = new Model(class98s, 2);
			}
			if (modelColors != null) {
				short[] modifiedColors;
				if (null != class518 && class518.moreModifiedColors != null)
					modifiedColors = class518.moreModifiedColors;
				else
					modifiedColors = modifiedModelColors;
				for (int index = 0; index < modelColors.length; index++)
					model.color((modelColors[index]), modifiedColors[index]);
			}
			if (null != modelTextures) {
				short[] is;
				if (null != class518 && class518.aShortArray6009 != null)
					is = class518.aShortArray6009;
				else
					is = modifiedModelTextures;
				for (int i_97_ = 0; i_97_ < modelTextures.length; i_97_++)
					model.method1200((modelTextures[i_97_]), is[i_97_]);
			}
			return model;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vy.x(").append(')').toString());
		}
	}
}
