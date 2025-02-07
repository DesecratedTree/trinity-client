

import java.awt.*;
import java.util.Arrays;

public class ItemConfig {
	public int team;
	public static int anInt5701 = 1;
	public boolean printModelColors;
	int scaleY;
	public int anInt5703;
	public int stackable;
	public static int anInt5705 = 2;
	short[] modifiedColors;
	public String name = "null";
	byte[] aByteArray5708;
	public int cert;
	int anInt5710;
	short[] originalTextures;
	short[] modifiedTextures;
	public int modelScale = 730923888;
	public int modelPitch = 0;
	public int modelRoll = 0;
	public int offsetX = 0;
	public int modelTranslateX = 0;
	public int modelTranslateY = 0;
	public int lendTemplate;

	public int lastManStanding, lastManStandingTemplate;
	public int anInt5720;
	public int value;
	public int anInt5722;
	public String[] groundOptions;
	public int maleModel1;
	public int anInt5725;
	public static int anInt5726 = 0;
	public int anInt5727;
	public int anInt5728;
	public int anInt5729;
	public int anInt5730;
	public boolean aBoolean5731;
	public String[] inventoryOptions;
	public int equipSlot;
	public boolean tradeable;
	public int anInt5735;
	public int anInt5736;
	int maleModel2;
	int model;
	int scaleZ;
	int itemId;
	int femaleModel3;
	int anInt5742;
	int anInt5743;
	int anInt5744;
	int anInt5745;
	int femaleModel2;
	public int femaleModel1;
	int anInt5748;
	int maleHeadModel2;
	int femaleHeadModel1;
	Class477 aClass477_5751;
	int[] stackIDs;
	int[] stackAmounts;
	short[] originalColors;
	public int certTemplate;
	int lend;
	public static short[] aShortArray5757 = new short[256];
	int scaleX;
	int maleModel3;
	int maleHeadModel1;
	int shadow;
	int lightness;
	public int anInt5763;
	int femaleHeadModel2;
	public int anInt5765;
	LinkedArrayList settings;
	public int[] anIntArray5767;
	public int anInt5768;
	int anInt5769;
	public int anInt5770;
	public boolean aBoolean5771;
	public int anInt5772;
	private byte[] aByteArray5904;
	private byte[] aByteArray5609;
	private int[] aByteIntArray5869;
	private int[] anIntArray5960;

	void method6025(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.a(").append(')').toString());
		}
	}

	void decode(RsByteBuffer class298_sub53, int type) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (i_0_ == 0) {
					break;
				}
				if (type == 1)
					decodeOSRS(class298_sub53, i_0_);
				else if (type == 2)
					decode685(class298_sub53, i_0_, false);
				else
					decode(class298_sub53, i_0_, false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.f(").append(')').toString());
		}
	}

	void method6027(ItemConfig class468_1_, ItemConfig class468_2_, int i) {
		try {
			((ItemConfig) this).model = ((ItemConfig) class468_1_).model * 1;
			modelScale = class468_1_.modelScale * 1;
			modelPitch = class468_1_.modelPitch * 1;
			modelRoll = class468_1_.modelRoll * 1;
			offsetX = 1 * class468_1_.offsetX;
			modelTranslateX = class468_1_.modelTranslateX * 1;
			modelTranslateY = class468_1_.modelTranslateY * 1;
			((ItemConfig) this).originalColors = ((ItemConfig) class468_1_).originalColors;
			((ItemConfig) this).modifiedColors = ((ItemConfig) class468_1_).modifiedColors;
			((ItemConfig) this).aByteArray5708 = ((ItemConfig) class468_1_).aByteArray5708;
			((ItemConfig) this).originalTextures = ((ItemConfig) class468_1_).originalTextures;
			((ItemConfig) this).modifiedTextures = ((ItemConfig) class468_1_).modifiedTextures;
			name = class468_2_.name;
			aBoolean5731 = class468_2_.aBoolean5731;
			value = class468_2_.value * 1;
			stackable = 126481113;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.p(").append(')').toString());
		}
	}
	
	public final Model getWearModel(boolean female, Class464 class464, int i) {
		try {
			
			int id = 1027112447 * ((ItemConfig) this).itemId;
			
			int lookID = CustomItems.getOldLookItem(id, female);
			if (lookID != id) 
				return Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(lookID, false).getWearModel(female, class464, i);
			
			
			int model1;
			int model2;
			int model3;
			if (female) {
				if (class464 != null && class464.anIntArray5695 != null) {
					model1 = class464.anIntArray5695[0];
					model2 = class464.anIntArray5695[1];
					model3 = class464.anIntArray5695[2];
				} else {
					model1 = femaleModel1 * 1585491093;
					model2 = ((ItemConfig) this).femaleModel2 * -1284247975;
					model3 = ((ItemConfig) this).femaleModel3 * -1767718263;
				}
			} else if (class464 != null && null != class464.anIntArray5694) {
				model1 = class464.anIntArray5694[0];
				model2 = class464.anIntArray5694[1];
				model3 = class464.anIntArray5694[2];
			} else {
				model1 = maleModel1 * 1343198193;
				model2 = ((ItemConfig) this).maleModel2 * 34210967;
				model3 = ((ItemConfig) this).maleModel3 * 1313278521;
			}
			
			
			
			if (model1 == -1)
				return null;
			Model model = Model.loadModel((((Class477) (((ItemConfig) this).aClass477_5751)).aClass243_5992), model1, 0);
			if (model == null)
				return null;
			if (model.protocol < 13)
				model.resize(2);
			CustomItems.modifyModel(female, this, i, model, 1);
			/*if (equipSlot == 2026784241 && i == 4) { //chest
				model.scale(128, 145, 128);
				model.translate(0, -33 + 88, 0);
			}*/
			
			if (model2 != -1) {
				Model model_2 = Model.loadModel((((Class477) ((ItemConfig) this).aClass477_5751).aClass243_5992), model2, 0);
				if (model_2.protocol < 13)
					model_2.resize(2);
				CustomItems.modifyModel(female, this, i, model_2, 2);
				
				/*if (equipSlot == 2026784241 && i == 4) { //chest
					model_2.scale(150, 190, 128);
					model_2.translate(0, 188 + 72, 0);
				}*/
				
				if (model3 != -1) {
					Model class64_7_ = Model.loadModel((((Class477) ((ItemConfig) this).aClass477_5751).aClass243_5992), model3, 0);
					if (class64_7_.protocol < 13)
						class64_7_.resize(2);
					CustomItems.modifyModel(female, this, i, class64_7_, 3);
					Model[] class64s = { model, model_2, class64_7_ };
					model = new Model(class64s, 3);
				} else {
					Model[] class64s = { model, model_2 };
					model = new Model(class64s, 2);
				}
			}
			if (!female && (0 != ((ItemConfig) this).anInt5742 * -1268579363 || 345393423 * ((ItemConfig) this).anInt5744 != 0 || 0 != ((ItemConfig) this).anInt5748 * 669576861))
				model.translate(((ItemConfig) this).anInt5742 * -1268579363, 345393423 * ((ItemConfig) this).anInt5744, 669576861 * ((ItemConfig) this).anInt5748);
			if (female && (0 != -1436808331 * ((ItemConfig) this).anInt5743 || -92251131 * ((ItemConfig) this).anInt5745 != 0 || ((ItemConfig) this).anInt5710 * 1813909637 != 0))
				model.translate(((ItemConfig) this).anInt5743 * -1436808331, ((ItemConfig) this).anInt5745 * -92251131, 1813909637 * ((ItemConfig) this).anInt5710);
			
			
			/*if (equipSlot == 2026784241) { //-1
				if (i == 3) { //weapon
					model.translate(-5, 20, -20);
				}else if (i == 1) { //cape
					model.translate(0, 0, 10);
				}else if (i == 4) { //chest
					/*model.scale(150, 170, 128);
					model.translate(0, 188, 0);

					model.faceSkinWeight = null;*/
			/*	}else if (i == 7) { //leg
					model.scale(128, 128, 128);
					model.translate(0, 10, 0);
				}

				System.out.println(i+", "+name+", "+model+", "+model2+", "+model3);
			}*/
			
			if (null != ((ItemConfig) this).originalColors) {
				short[] is;
				if (class464 != null && class464.aShortArray5698 != null)
					is = class464.aShortArray5698;
				else
					is = ((ItemConfig) this).modifiedColors;
				for (int i_8_ = 0; i_8_ < ((ItemConfig) this).originalColors.length; i_8_++)
					model.recolor(((ItemConfig) this).originalColors[i_8_], is[i_8_]);
			}
			
			if (null != ((ItemConfig) this).originalTextures) {
				short[] is;
				if (class464 != null && null != class464.aShortArray5699)
					is = class464.aShortArray5699;
				else
					is = ((ItemConfig) this).modifiedTextures;
				for (int i_9_ = 0; i_9_ < ((ItemConfig) this).originalTextures.length; i_9_++)
					model.retexture(((ItemConfig) this).originalTextures[i_9_], is[i_9_]);
			}
			CustomItems.modifyModel(female, this, i, model, 4);
			
			//int itemid = 1027112447 * ((ItemConfig) this).itemId;
			return model;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.z(").append(')').toString());
		}
	}

	public final Class387 method6029(GraphicsToolkit class_ra, int i, int amount, Class366 class366, Class438 class438, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
		try {
			int id = 1027112447 * ((ItemConfig) this).itemId;
			int lookID = CustomItems.getOldLookItem(id, false);
			if (lookID != id) 
				return Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(lookID, false).method6029(class_ra, i, amount, class366, class438, i_11_, i_12_, i_13_, i_14_, i_15_);
			
			
			
			if (null != ((ItemConfig) this).stackIDs && amount > 1) {
				int i_16_ = -1;
				for (int i_17_ = 0; i_17_ < 10; i_17_++) {
					if (amount >= ((ItemConfig) this).stackAmounts[i_17_] && 0 != ((ItemConfig) this).stackAmounts[i_17_])
						i_16_ = ((ItemConfig) this).stackIDs[i_17_];
				}
				if (i_16_ != -1)
					return (((ItemConfig) this).aClass477_5751.getItemDefinitions(i_16_).method6029(class_ra, i, 1, class366, class438, i_11_, i_12_, i_13_, i_14_, 2041211835));
			}
			int i_18_ = i;
			if (null != class438)
				i_18_ |= class438.method5829(-1790708337);
			Class387 class387;
			synchronized (((Class477) ((ItemConfig) this).aClass477_5751).aClass348_5994) {
				class387 = ((Class387) (((Class477) ((ItemConfig) this).aClass477_5751).aClass348_5994.get((long) (1027112447 * ((ItemConfig) this).itemId | class_ra.anInt5298 * 580915349 << 29))));
			}
			if (null == class387 || class_ra.method5017(class387.m(), i_18_) != 0) {
				if (null != class387)
					i_18_ = class_ra.method5004(i_18_, class387.m());
				int i_19_ = i_18_;
				if (((ItemConfig) this).originalTextures != null)
					i_19_ |= 0x8000;
				if (null != ((ItemConfig) this).originalColors || class366 != null)
					i_19_ |= 0x4000;
				if (128 != ((ItemConfig) this).scaleX * -1773084507)
					i_19_ |= 0x1;
				if (128 != ((ItemConfig) this).scaleX * -1773084507)
					i_19_ |= 0x2;
				if (((ItemConfig) this).scaleX * -1773084507 != 128)
					i_19_ |= 0x4;
				Model class64 = Model.loadModel((((Class477) ((ItemConfig) this).aClass477_5751).aClass243_5992), (((ItemConfig) this).model * 381556007), 0);
				if (null == class64)
					return null;
				if(printModelColors) {
					class64.printSortedModelClrs();
				}
			//	class64.printColors();


				if(retextureClr != null) {
					for(int tex = 0; tex < retextureClr.length; tex++) {
						class64.setTexture(new int[] {retextureClr[tex]}, retextureTexture[tex]);
					}
				}
				if (class64.protocol < 13)
					class64.resize(2);
				class387 = (class_ra.method5037(class64, i_19_, (((Class477) ((ItemConfig) this).aClass477_5751).anInt5991) * -424819635, 64 + 856370373 * ((ItemConfig) this).shadow, ((ItemConfig) this).lightness * 1055603853 + 850));
				if (-1773084507 * ((ItemConfig) this).scaleX != 128 || 128 != ((ItemConfig) this).scaleY * 902366341 || 128 != -230848851 * ((ItemConfig) this).scaleZ)
					class387.oa(-1773084507 * ((ItemConfig) this).scaleX, 902366341 * ((ItemConfig) this).scaleY, ((ItemConfig) this).scaleZ * -230848851);
				if (((ItemConfig) this).originalColors != null) {
					for (int i_20_ = 0; i_20_ < ((ItemConfig) this).originalColors.length; i_20_++) {
						if (((ItemConfig) this).aByteArray5708 != null && i_20_ < ((ItemConfig) this).aByteArray5708.length)
							class387.X((((ItemConfig) this).originalColors[i_20_]), aShortArray5757[(((ItemConfig) this).aByteArray5708[i_20_]) & 0xff]);
						else
							class387.X((((ItemConfig) this).originalColors[i_20_]), (((ItemConfig) this).modifiedColors[i_20_]));
					}
				}
				if (null != ((ItemConfig) this).originalTextures) {
					for (int i_21_ = 0; i_21_ < ((ItemConfig) this).originalTextures.length; i_21_++)
						class387.W(((ItemConfig) this).originalTextures[i_21_], ((ItemConfig) this).modifiedTextures[i_21_]);
				}
				if (null != class366) {
					for (int i_22_ = 0; i_22_ < 10; i_22_++) {
						for (int i_23_ = 0; (i_23_ < Class366.aShortArrayArray3970[i_22_].length); i_23_++) {
							if (class366.anIntArray3973[i_22_] < (Class22.appearenceColors[i_22_][i_23_]).length)
								class387.X((Class366.aShortArrayArray3970[i_22_][i_23_]), (Class22.appearenceColors[i_22_][i_23_][class366.anIntArray3973[i_22_]]));
						}
					}
				}
				class387.KA(i_18_);
				synchronized (((Class477) ((ItemConfig) this).aClass477_5751).aClass348_5994) {
					((Class477) ((ItemConfig) this).aClass477_5751).aClass348_5994.method4194(class387, (long) (((ItemConfig) this).itemId * 1027112447 | class_ra.anInt5298 * 580915349 << 29));
				}
			}
			if (null != class438 || 0 != i_14_) {
				class387 = class387.method4755((byte) 1, i_18_, true);
				if (null != class438)
					class438.method5839(class387, 0, -1330952412);
				if (0 != i_14_)
					class387.PA(i_11_, i_12_, i_13_, i_14_);
			}
			class387.KA(i);
			return class387;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.d(").append(')').toString());
		}
	}

	public ItemConfig method6030(int i, int i_24_) {
		try {
			if (null != ((ItemConfig) this).stackIDs && i > 1) {
				int i_25_ = -1;
				for (int i_26_ = 0; i_26_ < 10; i_26_++) {
					if (i >= ((ItemConfig) this).stackAmounts[i_26_] && 0 != ((ItemConfig) this).stackAmounts[i_26_])
						i_25_ = ((ItemConfig) this).stackIDs[i_26_];
				}
				if (-1 != i_25_)
					return ((ItemConfig) this).aClass477_5751.getItemDefinitions(i_25_);
			}
			return this;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.u(").append(')').toString());
		}
	}

	int[] method6031(GraphicsToolkit class_ra, GraphicsToolkit class_ra_27_, int amount, int selection, int i_29_, boolean small, int i_30_, Class264 class264, Class366 class366, int i_31_) {
		int id = 1027112447 * ((ItemConfig) this).itemId;
		int lookID = CustomItems.getOldLookItem(id, false);
		if (lookID != id) 
			return Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(lookID, false).method6031(class_ra, class_ra_27_, amount, selection, i_29_, small, i_30_, class264, class366, i_31_);
		boolean placeholder = false;
		if (amount == -2) { //bank preset
			amount = 0;
			placeholder = true;
		}
		// class_ra beeing used to draw
		try {
			Model class64 = Model.loadModel((((Class477) ((ItemConfig) this).aClass477_5751).aClass243_5992), 381556007 * ((ItemConfig) this).model, 0);
			if (null == class64)
				return null;
			if(printModelColors) {
				class64.printSortedModelClrs();
			}
			if (class64.protocol < 13)
				class64.resize(2);
			if (null != ((ItemConfig) this).originalColors) {
				for (int i_32_ = 0; i_32_ < ((ItemConfig) this).originalColors.length; i_32_++) {
					if (((ItemConfig) this).aByteArray5708 != null && i_32_ < ((ItemConfig) this).aByteArray5708.length)
						class64.recolor((((ItemConfig) this).originalColors[i_32_]), aShortArray5757[(((ItemConfig) this).aByteArray5708[i_32_]) & 0xff]);
					else
						class64.recolor((((ItemConfig) this).originalColors[i_32_]), (((ItemConfig) this).modifiedColors[i_32_]));
				}
			}

			if(retextureClr != null) {
				for(int tex = 0; tex < retextureClr.length; tex++) {
					class64.setTexture(new int[] {retextureClr[tex]}, retextureTexture[tex]);
				}
			}
			if (null != ((ItemConfig) this).originalTextures) {
				for (int i_33_ = 0; i_33_ < ((ItemConfig) this).originalTextures.length; i_33_++)
					class64.retexture(((ItemConfig) this).originalTextures[i_33_], (((ItemConfig) this).modifiedTextures[i_33_]));
			}
			if (null != class366) {
				for (int i_34_ = 0; i_34_ < 10; i_34_++) {
					for (int i_35_ = 0; i_35_ < Class366.aShortArrayArray3970[i_34_].length; i_35_++) {
						if (class366.anIntArray3973[i_34_] < (Class22.appearenceColors[i_34_][i_35_]).length)
							class64.recolor((Class366.aShortArrayArray3970[i_34_][i_35_]), (Class22.appearenceColors[i_34_][i_35_][(class366.anIntArray3973[i_34_])]));
					}
				}
			}
			int i_36_ = 2048;
			boolean bool_37_ = false;
			if (-1773084507 * ((ItemConfig) this).scaleX != 128 || 128 != 902366341 * ((ItemConfig) this).scaleY || ((ItemConfig) this).scaleZ * -230848851 != 128) {
				bool_37_ = true;
				i_36_ |= 0x7;
			}
			Class387 class387 = class_ra.method5037(class64, i_36_, 64, (((ItemConfig) this).shadow * 856370373 + 64), 768 + (((ItemConfig) this).lightness * 1055603853));
			if (!class387.method4743())
				return null;
			if (bool_37_)
				class387.oa(-1773084507 * ((ItemConfig) this).scaleX, 902366341 * ((ItemConfig) this).scaleY, ((ItemConfig) this).scaleZ * -230848851);
			Class57 class57 = null;
			if (-1 != -1673957995 * certTemplate) {
				class57 = (((ItemConfig) this).aClass477_5751.method6086(class_ra, class_ra_27_, 809765849 * cert, 10, 1, 0, true, true, 0, class264, class366, -1795675060));
				if (null == class57)
					return null;
			} else if (465190555 * lendTemplate != -1) {
				class57 = (((ItemConfig) this).aClass477_5751.method6086(class_ra, class_ra_27_, ((ItemConfig) this).lend * -783380935, amount, selection, i_29_, false, true, 0, class264, class366, 1124646536));
				if (null == class57)
					return null;
			} else if (-1 != anInt5770 * 2083650097) {
				class57 = (((ItemConfig) this).aClass477_5751.method6086(class_ra, class_ra_27_, 1981372535 * ((ItemConfig) this).anInt5769, amount, selection, i_29_, false, true, 0, class264, class366, 311548691));
				if (null == class57)
					return null;
			}
			int i_38_;
			if (small)
				i_38_ = (int) ((double) (1396167403 * modelScale) * 1.5) << 2;
			else if (2 == selection)
				i_38_ = (int) ((double) (1396167403 * modelScale) * 1.04) << 2;
			else
				i_38_ = modelScale * 1396167403 << 2;
			Matrix class233 = class_ra.method5045();
			Matrix class233_39_ = class_ra.method5036();
			class233_39_.method2152(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) class_ra.method4992((short) -14576).method545(), (float) class_ra.method4992((short) -3255).method552());
			class_ra.method5182(class233_39_);
			class_ra.method5187(0, 0, class_ra.method4992((short) 19509).method545(), class_ra.method4992((short) 21763).method552());
			Class222 class222 = new Class222();
			class_ra.method5043(class222);
			class_ra.IA(0.95F + (float) (Math.random() / 10.0));
			class_ra.m(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0), -50.0F, -10.0F, -50.0F);
			Class222 class222_40_ = class_ra.method5178(); // draws it seems
			class222_40_.method2059(0.0F, 0.0F, 1.0F, Class220.method2049(-(offsetX * -1368639199) << 3));
			class222_40_.method2071(0.0F, 1.0F, 0.0F, Class220.method2049(modelRoll * -3355859 << 3));
			class222_40_.method2064((float) (252709809 * modelTranslateX << 2), (float) ((((Class220.anIntArray2483[330519029 * modelPitch << 3]) * i_38_) >> 14) - class387.YA() / 2 + (-1811316489 * modelTranslateY << 2)), (float) ((((Class220.anIntArray2474[330519029 * modelPitch << 3]) * i_38_) >> 14) + (modelTranslateY * -1811316489 << 2)));
			class222_40_.method2071(1.0F, 0.0F, 0.0F, Class220.method2049((modelPitch * 330519029) << 3));
			class_ra.ba(2, 0);
			class_ra.L();
			class_ra.B(0, 0, 36, 32, 0, 0);
			class387.drawModel(class222_40_, null, 1);
			class_ra.method5182(class233);
			int[] is = class_ra.aq(0, 0, 36, 32);
			if (selection >= 1) {
				is = method6032(is, -16777214, 224723616);
				if (selection >= 2)
					is = method6032(is, -1, 1899522127);
			}
			if (0 != i_29_)
				method6033(is, i_29_, 1738452390);
			if (-1 != 465190555 * lendTemplate)
				class57.drawSprite(0, 0);
			else if (-1 != anInt5770 * 2083650097)
				class57.drawSprite(0, 0);
			class_ra.method5031(is, 0, 36, 36, 32, -1432690829).drawSprite(0, 0);
			if (-1 != certTemplate * -1673957995)
				class57.drawSprite(0, 0);
			if (1 == i_30_ || 2 == i_30_ && (stackable * 789409129 == 1 || 1 != amount) && amount != -1)
				class264.drawText(Class108.method1149(amount, (((Class477) (((ItemConfig) this).aClass477_5751)).aClass429_5997), -2134002342), 0, 9, -256, -16777215, 1072909030);
			is = class_ra.aq(0, 0, 36, 32);
			

			
			for (int i_41_ = 0; i_41_ < is.length; i_41_++) {
				if (0 == (is[i_41_] & 0xffffff))
					is[i_41_] = 0;
				else
					is[i_41_] |= ~0xffffff;
			}
			if (placeholder) {
				/*for (int i_41_ = 0; i_41_ < is.length; i_41_++) 
					if (0 != (is[i_41_] & 0xffffff))
						is[i_41_] |= 64;*/
				greyScale(is);
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.x(").append(')').toString());
		}
	}
	
	
	public void greyScale(int[] rgbArray) {
		for (int index = 0; index < rgbArray.length; index++) {
			/*int alpha = rgbArray[index] >>> 24;
			int red = rgbArray[index] >>> 16 & 0xff;
			int green = rgbArray[index] >>> 8 & 0xff;
			int blue = rgbArray[index] & 0xff;
			//int delta = (red + green + blue) / 3;
			rgbArray[index] = (blue / 2) | (green / 2) << 8 | (red / 2) << 16 | (alpha / 2) << 24;*/
			if (0 != (rgbArray[index])) {
				
				Color color = new Color(rgbArray[index]);
			//	Color newcolor = new Color(color.getRed(), color.getGreen(), color.getBlue());
				/*public static Color newColorWithAlpha(Color original, int alpha) {
				    return new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha);
				}*/
				
				rgbArray[index] = blend(color, Color.DARK_GRAY, 0.4f).getRGB();
			//	rgbArray[index] = newcolor.getRGB(); //(blue ) | (green ) << 8 | (red ) << 16 | (alpha ) << 24;
			
			
				//	rgbArray[index] |= 64;
			}
		}

	}
	
	static Color blend( Color c1, Color c2, float ratio ) {
	    if ( ratio > 1f ) ratio = 1f;
	    else if ( ratio < 0f ) ratio = 0f;
	    float iRatio = 1.0f - ratio;

	    int i1 = c1.getRGB();
	    int i2 = c2.getRGB();

	    int a1 = (i1 >> 24 & 0xff);
	    int r1 = ((i1 & 0xff0000) >> 16);
	    int g1 = ((i1 & 0xff00) >> 8);
	    int b1 = (i1 & 0xff);

	    int a2 = (i2 >> 24 & 0xff);
	    int r2 = ((i2 & 0xff0000) >> 16);
	    int g2 = ((i2 & 0xff00) >> 8);
	    int b2 = (i2 & 0xff);

	    int a = (int)((a1 * iRatio) + (a2 * ratio));
	    int r = (int)((r1 * iRatio) + (r2 * ratio));
	    int g = (int)((g1 * iRatio) + (g2 * ratio));
	    int b = (int)((b1 * iRatio) + (b2 * ratio));

	    return new Color( a << 24 | r << 16 | g << 8 | b );
	}
	

	int[] method6032(int[] is, int i, int i_42_) {
		try {
			int[] is_43_ = new int[1152];
			int i_44_ = 0;
			for (int i_45_ = 0; i_45_ < 32; i_45_++) {
				for (int i_46_ = 0; i_46_ < 36; i_46_++) {
					int i_47_ = is[i_44_];
					if (i_47_ == 0) {
						if (i_46_ > 0 && 0 != is[i_44_ - 1])
							i_47_ = i;
						else if (i_45_ > 0 && is[i_44_ - 36] != 0)
							i_47_ = i;
						else if (i_46_ < 35 && 0 != is[1 + i_44_])
							i_47_ = i;
						else if (i_45_ < 31 && 0 != is[i_44_ + 36])
							i_47_ = i;
					}
					is_43_[i_44_++] = i_47_;
				}
			}
			return is_43_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.r(").append(')').toString());
		}
	}

	void method6033(int[] is, int i, int i_48_) {
		try {
			for (int i_49_ = 31; i_49_ > 0; i_49_--) {
				int i_50_ = i_49_ * 36;
				for (int i_51_ = 35; i_51_ > 0; i_51_--) {
					if (is[i_51_ + i_50_] == 0 && 0 != is[i_50_ + i_51_ - 1 - 36])
						is[i_50_ + i_51_] = i;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.q(").append(')').toString());
		}
	}

	public final boolean method6034(boolean bool, Class464 class464, byte i) {
		try {
			
			
			int id = 1027112447 * ((ItemConfig) this).itemId;
			
			int lookID = CustomItems.getOldLookItem(id, bool);
			if (lookID != id) 
				return Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(lookID, false).method6034(bool, class464, i);
			
			
			int i_52_;
			int i_53_;
			int i_54_;
			if (bool) {
				if (class464 != null && class464.anIntArray5695 != null) {
					i_52_ = class464.anIntArray5695[0];
					i_53_ = class464.anIntArray5695[1];
					i_54_ = class464.anIntArray5695[2];
				} else {
					i_52_ = femaleModel1 * 1585491093;
					i_53_ = -1284247975 * ((ItemConfig) this).femaleModel2;
					i_54_ = ((ItemConfig) this).femaleModel3 * -1767718263;
				}
			} else if (class464 != null && null != class464.anIntArray5694) {
				i_52_ = class464.anIntArray5694[0];
				i_53_ = class464.anIntArray5694[1];
				i_54_ = class464.anIntArray5694[2];
			} else {
				i_52_ = maleModel1 * 1343198193;
				i_53_ = ((ItemConfig) this).maleModel2 * 34210967;
				i_54_ = 1313278521 * ((ItemConfig) this).maleModel3;
			}
			if (-1 == i_52_)
				return true;
			boolean bool_55_ = true;
			if (!((Class477) ((ItemConfig) this).aClass477_5751).aClass243_5992.method2290(i_52_, 0, -870541215))
				bool_55_ = false;
			if (i_53_ != -1 && !((Class477) ((ItemConfig) this).aClass477_5751).aClass243_5992.method2290(i_53_, 0, -1713048725))
				bool_55_ = false;
			if (i_54_ != -1 && !((Class477) ((ItemConfig) this).aClass477_5751).aClass243_5992.method2290(i_54_, 0, -818152674))
				bool_55_ = false;
			return bool_55_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.s(").append(')').toString());
		}
	}


	public final boolean method6035(boolean bool, Class464 class464, byte i) {
		try {
			
			int id = 1027112447 * ((ItemConfig) this).itemId;
			
			int lookID = CustomItems.getOldLookItem(id, bool);
			if (lookID != id) 
				return Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(lookID, false).method6035(bool, class464, i);
		
			
			int i_56_;
			int i_57_;
			if (bool) {
				if (null != class464 && class464.anIntArray5697 != null) {
					i_56_ = class464.anIntArray5697[0];
					i_57_ = class464.anIntArray5697[1];
				} else {
					i_56_ = -1531415419 * ((ItemConfig) this).femaleHeadModel1;
					i_57_ = ((ItemConfig) this).femaleHeadModel2 * 1578724433;
				}
			} else if (null != class464 && null != class464.anIntArray5690) {
				i_56_ = class464.anIntArray5690[0];
				i_57_ = class464.anIntArray5690[1];
			} else {
				i_56_ = ((ItemConfig) this).maleHeadModel1 * -1282951055;
				i_57_ = ((ItemConfig) this).maleHeadModel2 * 86274879;
			}
			if (i_56_ == -1)
				return true;
			boolean bool_58_ = true;
			if (!((Class477) ((ItemConfig) this).aClass477_5751).aClass243_5992.method2290(i_56_, 0, -1403829212))
				bool_58_ = false;
			if (-1 != i_57_ && !((Class477) ((ItemConfig) this).aClass477_5751).aClass243_5992.method2290(i_57_, 0, -1542572465))
				bool_58_ = false;
			return bool_58_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.y(").append(')').toString());
		}
	}

	void method6036(ItemConfig class468_59_, ItemConfig class468_60_, int i) {
		try {
			value = 0;
			((ItemConfig) this).model = 1 * ((ItemConfig) class468_59_).model;
			modelScale = class468_59_.modelScale * 1;
			modelPitch = class468_59_.modelPitch * 1;
			modelRoll = 1 * class468_59_.modelRoll;
			offsetX = 1 * class468_59_.offsetX;
			modelTranslateX = class468_59_.modelTranslateX * 1;
			modelTranslateY = class468_59_.modelTranslateY * 1;
			((ItemConfig) this).originalColors = ((ItemConfig) class468_60_).originalColors;
			((ItemConfig) this).modifiedColors = ((ItemConfig) class468_60_).modifiedColors;
			((ItemConfig) this).aByteArray5708 = ((ItemConfig) class468_60_).aByteArray5708;
			((ItemConfig) this).originalTextures = ((ItemConfig) class468_60_).originalTextures;
			((ItemConfig) this).modifiedTextures = ((ItemConfig) class468_60_).modifiedTextures;
			name = class468_60_.name;
			aBoolean5731 = class468_60_.aBoolean5731;
			equipSlot = class468_60_.equipSlot * 1;
			anInt5772 = class468_60_.anInt5772 * 1;
			anInt5735 = class468_60_.anInt5735 * 1;
			maleModel1 = 1 * class468_60_.maleModel1;
			((ItemConfig) this).maleModel2 = 1 * ((ItemConfig) class468_60_).maleModel2;
			((ItemConfig) this).maleModel3 = ((ItemConfig) class468_60_).maleModel3 * 1;
			femaleModel1 = 1 * class468_60_.femaleModel1;
			((ItemConfig) this).femaleModel2 = ((ItemConfig) class468_60_).femaleModel2 * 1;
			((ItemConfig) this).femaleModel3 = 1 * ((ItemConfig) class468_60_).femaleModel3;
			((ItemConfig) this).anInt5742 = 1 * ((ItemConfig) class468_60_).anInt5742;
			((ItemConfig) this).anInt5743 = 1 * ((ItemConfig) class468_60_).anInt5743;
			((ItemConfig) this).anInt5744 = 1 * ((ItemConfig) class468_60_).anInt5744;
			((ItemConfig) this).anInt5745 = ((ItemConfig) class468_60_).anInt5745 * 1;
			((ItemConfig) this).anInt5748 = ((ItemConfig) class468_60_).anInt5748 * 1;
			((ItemConfig) this).anInt5710 = 1 * ((ItemConfig) class468_60_).anInt5710;
			((ItemConfig) this).maleHeadModel1 = ((ItemConfig) class468_60_).maleHeadModel1 * 1;
			((ItemConfig) this).maleHeadModel2 = ((ItemConfig) class468_60_).maleHeadModel2 * 1;
			((ItemConfig) this).femaleHeadModel1 = ((ItemConfig) class468_60_).femaleHeadModel1 * 1;
			((ItemConfig) this).femaleHeadModel2 = ((ItemConfig) class468_60_).femaleHeadModel2 * 1;
			team = 1 * class468_60_.team;
			groundOptions = class468_60_.groundOptions;
			((ItemConfig) this).settings = ((ItemConfig) class468_60_).settings;
			stackable = 1 * class468_60_.stackable;
			inventoryOptions = new String[5];
			if (null != class468_60_.inventoryOptions) {
				for (int i_61_ = 0; i_61_ < 4; i_61_++)
					inventoryOptions[i_61_] = class468_60_.inventoryOptions[i_61_];
			}
			inventoryOptions[4] = Tradution.aClass470_5903.method6049((((Class477) (((ItemConfig) this).aClass477_5751)).aClass429_5997), -875414210);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.k(").append(')').toString());
		}
	}

	public int method6037(int i, int i_62_, int i_63_) {
		try {
			if (null == ((ItemConfig) this).settings)
				return i_62_;
			IntegerValue class298_sub35 = ((IntegerValue) ((ItemConfig) this).settings.method5812((long) i));
			if (null == class298_sub35)
				return i_62_;
			return class298_sub35.intValue * -774922497;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.h(").append(')').toString());
		}
	}

	void decodeOSRS(RsByteBuffer stream, int opcode) {
		try {
			if (1 == opcode)
				((ItemConfig) this).model = (stream.readCustomUnsignedShort() + Settings.OSRS_MODEL_OFFSET) * -1019082089;
			else if (2 == opcode)
				name = stream.readString(1338906243);// name
			else if (opcode == 4)
				modelScale = stream.readUnsignedShort() * -1885125181;
			else if (5 == opcode)
				modelPitch = stream.readUnsignedShort() * -2068311459;
			else if (6 == opcode)
				modelRoll = stream.readUnsignedShort() * -629359451;
			else if (7 == opcode) {
				modelTranslateX = stream.readUnsignedShort() * -1497539247;
				if (modelTranslateX * 252709809 > 32767)
					modelTranslateX -= 1565589504;
			} else if (opcode == 8) {
				modelTranslateY = stream.readUnsignedShort() * -572964665;
				if (-1811316489 * modelTranslateY > 32767)
					modelTranslateY -= 1086783488;
			} else if (opcode == 11) //checked
				stackable = 126481113;
			else if (12 == opcode) //checked
				value = stream.readInt((byte) -4) * -1375390745;
			else if (16 == opcode) //checked
				aBoolean5731 = true;
			else if (opcode == 23) { //checked
				maleModel1 = (stream.readCustomUnsignedShort() + Settings.OSRS_MODEL_OFFSET) * -1612514031;
				int maleOffsetY = stream.readUnsignedByte(); //TODO
			}	else if (opcode == 24) { //check
				((ItemConfig) this).maleModel2 = (stream.readCustomUnsignedShort() + Settings.OSRS_MODEL_OFFSET) * 582597415;
			}	else if (25 == opcode) { //check
				femaleModel1 = (stream.readCustomUnsignedShort() + Settings.OSRS_MODEL_OFFSET) * -1430077763;
				int femaleOffsetY = stream.readUnsignedByte(); //TODO
			} else if (26 == opcode) { //check
				((ItemConfig) this).femaleModel2 = (stream.readCustomUnsignedShort() + Settings.OSRS_MODEL_OFFSET) * -336299543;
			} else if (opcode >= 30 && opcode < 35) //check
				groundOptions[opcode - 30] = stream.readString(2111111360);
			else if (opcode >= 35 && opcode < 40) //check
				inventoryOptions[opcode - 35] = stream.readString(-101192414);
			else if (40 == opcode) {//check
				int i_65_ = stream.readUnsignedByte();
				((ItemConfig) this).originalColors = new short[i_65_];
				((ItemConfig) this).modifiedColors = new short[i_65_];
				for (int i_66_ = 0; i_66_ < i_65_; i_66_++) {
					((ItemConfig) this).originalColors[i_66_] = (short) stream.readUnsignedShort();
					((ItemConfig) this).modifiedColors[i_66_] = (short) stream.readUnsignedShort();
				}
			} else if (41 == opcode) {//check
				int i_67_ = stream.readUnsignedByte();
				((ItemConfig) this).originalTextures = new short[i_67_];
				((ItemConfig) this).modifiedTextures = new short[i_67_];
				for (int i_68_ = 0; i_68_ < i_67_; i_68_++) {
					((ItemConfig) this).originalTextures[i_68_] = (short) ((short) stream.readUnsignedShort()  + Settings.OSRS_TEXTURE_OFFSET);
					((ItemConfig) this).modifiedTextures[i_68_] = (short) ((short) stream.readUnsignedShort()  + Settings.OSRS_TEXTURE_OFFSET);
				}
			} else if (opcode == 42) { //check
				stream.readByte(); //TODO
			} else if (65 == opcode) //check
				tradeable = false;
			else if (78 == opcode)
				((ItemConfig) this).maleModel3 = (stream.readCustomUnsignedShort() + Settings.OSRS_MODEL_OFFSET) * 756401161;
			else if (opcode == 79)
				((ItemConfig) this).femaleModel3 = (stream.readCustomUnsignedShort() + Settings.OSRS_MODEL_OFFSET) * 2098680761;
			else if (opcode == 90)
				((ItemConfig) this).maleHeadModel1 = (stream.readCustomUnsignedShort() + Settings.OSRS_MODEL_OFFSET) * 1319962769;
			else if (opcode == 91)
				((ItemConfig) this).femaleHeadModel1 = (stream.readCustomUnsignedShort() + Settings.OSRS_MODEL_OFFSET) * 1598907469;
			else if (opcode == 92)
				((ItemConfig) this).maleHeadModel2 = (stream.readCustomUnsignedShort() + Settings.OSRS_MODEL_OFFSET) * -1935344449;
			else if (93 == opcode)
				((ItemConfig) this).femaleHeadModel2 = (stream.readCustomUnsignedShort() + Settings.OSRS_MODEL_OFFSET) * -1194369871;
			else if (95 == opcode) //check
				offsetX = stream.readUnsignedShort() * -883520799;
			else if (opcode == 97)
				cert = (stream.readUnsignedShort() + Settings.OSRS_ITEM_OFFSET) * -384973719;
			else if (98 == opcode)
				certTemplate = (stream.readUnsignedShort() + Settings.OSRS_ITEM_OFFSET) * 1831957949;
			else if (opcode >= 100 && opcode < 110) {
				if (((ItemConfig) this).stackIDs == null) {
					((ItemConfig) this).stackIDs = new int[10];
					((ItemConfig) this).stackAmounts = new int[10];
				}
				((ItemConfig) this).stackIDs[opcode - 100] = stream.readUnsignedShort() + Settings.OSRS_ITEM_OFFSET;
				((ItemConfig) this).stackAmounts[opcode - 100] = stream.readUnsignedShort();
			} else if (opcode == 110)
				((ItemConfig) this).scaleX = stream.readUnsignedShort() * -237762771;
			else if (111 == opcode)
				((ItemConfig) this).scaleY = stream.readUnsignedShort() * 355882061;
			else if (opcode == 112)
				((ItemConfig) this).scaleZ = stream.readUnsignedShort() * 1219480869;
			else if (opcode == 113)
				((ItemConfig) this).shadow = stream.readByte() * 712208909;
			else if (opcode == 114)
				((ItemConfig) this).lightness = stream.readByte() * -1050247335;
			else if (115 == opcode)
				team = stream.readUnsignedByte() * 1325490629;
			else if (139 == opcode) //fixed
				((ItemConfig) this).lend = (stream.readUnsignedShort() + Settings.OSRS_ITEM_OFFSET) * -970653687;
			else if (140 == opcode)  //fixed
				lendTemplate = (stream.readUnsignedShort() + Settings.OSRS_ITEM_OFFSET) * 2015131539;
			else if (148 == opcode) {
				lastManStanding = (stream.readUnsignedShort() + Settings.OSRS_ITEM_OFFSET); //TODO
			}else if (149 == opcode) {
				lastManStandingTemplate = (stream.readUnsignedShort() + Settings.OSRS_ITEM_OFFSET); //TODO
			} else if (249 == opcode) {
				int i_73_ = stream.readUnsignedByte();
				if (null == ((ItemConfig) this).settings) {
					int i_74_ = Class416.method5590(i_73_, (byte) 16);
					((ItemConfig) this).settings = new LinkedArrayList(i_74_);
				}
				for (int i_75_ = 0; i_75_ < i_73_; i_75_++) {// client script
																// map
					boolean bool = stream.readUnsignedByte() == 1;
					int i_76_ = stream.read24BitUnsignedInteger((byte) 15);
					if (i_76_ == 451) //convert from osrs to rs2
						i_76_ = 528;
					if (i_76_ == 452) //convert from osrs to rs2
						i_76_ = 529;
					if (i_76_ == 453) //convert from osrs to rs2
						i_76_ = 530;
					if (i_76_ == 454) //convert from osrs to rs2
						i_76_ = 531;
					Class298 class298;
					if (bool)
						class298 = new ObjectValue(stream.readString(-1208778402));
					else
						class298 = new IntegerValue(stream.readInt((byte) 69));
					((ItemConfig) this).settings.method5817(class298, (long) i_76_);
				}
			} else {
				System.out.println("MISSING OPCODE osrs: " + opcode);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.b(").append(')').toString());
		}
	}
	
	void decode685(RsByteBuffer stream, int opcode, boolean oldItems) {
		try {
			if (1 == opcode)
				((ItemConfig) this).model = (stream.readBigSmart(1235052657) + Settings._685_MODEL_OFFSET) * -1019082089;// model
																																					// id
			else if (2 == opcode)
				name = stream.readString(1338906243);// name
			else if (opcode == 4)
				modelScale = stream.readUnsignedShort() * -1885125181;
			else if (5 == opcode)
				modelPitch = stream.readUnsignedShort() * -2068311459;
			else if (6 == opcode)
				modelRoll = stream.readUnsignedShort() * -629359451;
			else if (7 == opcode) {
				modelTranslateX = stream.readUnsignedShort() * -1497539247;
				if (modelTranslateX * 252709809 > 32767)
					modelTranslateX -= 1565589504;
			} else if (opcode == 8) {
				modelTranslateY = stream.readUnsignedShort() * -572964665;
				if (-1811316489 * modelTranslateY > 32767)
					modelTranslateY -= 1086783488;
			} else if (opcode == 11)
				stackable = 126481113;
			else if (12 == opcode)
				value = stream.readInt((byte) -4) * -1375390745;
			else if (opcode == 13)
				equipSlot = stream.readUnsignedByte() * -2026784241;
			else if (14 == opcode)
				anInt5772 = stream.readUnsignedByte() * -583083477;
			else if (16 == opcode)
				aBoolean5731 = true;
			else if (18 == opcode)
				anInt5720 = stream.readUnsignedShort() * -1741576309;
			else if (opcode == 23)
				maleModel1 = (stream.readBigSmart(1235052657)  + Settings._685_MODEL_OFFSET) * -1612514031;
			else if (opcode == 24)
				((ItemConfig) this).maleModel2 = (stream.readBigSmart(1235052657)  + Settings._685_MODEL_OFFSET) * 582597415;
			else if (25 == opcode)
				femaleModel1 = (stream.readBigSmart(1235052657)  + Settings._685_MODEL_OFFSET) * -1430077763;
			else if (26 == opcode)
				((ItemConfig) this).femaleModel2 = (stream.readBigSmart(1235052657) + Settings._685_MODEL_OFFSET) * -336299543;
			else if (opcode == 27)
				anInt5735 = stream.readUnsignedByte() * -1438605935;
			else if (opcode >= 30 && opcode < 35)
				groundOptions[opcode - 30] = stream.readString(2111111360);
			else if (opcode >= 35 && opcode < 40)
				inventoryOptions[opcode - 35] = stream.readString(-101192414);
			else if (40 == opcode) {
				int i_65_ = stream.readUnsignedByte();
				((ItemConfig) this).originalColors = new short[i_65_];
				((ItemConfig) this).modifiedColors = new short[i_65_];
				for (int i_66_ = 0; i_66_ < i_65_; i_66_++) {
					((ItemConfig) this).originalColors[i_66_] = (short) stream.readUnsignedShort();
					((ItemConfig) this).modifiedColors[i_66_] = (short) stream.readUnsignedShort();
				}
			} else if (41 == opcode) {
				int i_67_ = stream.readUnsignedByte();
				((ItemConfig) this).originalTextures = new short[i_67_];
				((ItemConfig) this).modifiedTextures = new short[i_67_];
				for (int i_68_ = 0; i_68_ < i_67_; i_68_++) {
					((ItemConfig) this).originalTextures[i_68_] = (short) stream.readUnsignedShort();
					((ItemConfig) this).modifiedTextures[i_68_] = (short) stream.readUnsignedShort();
				}
			} else if (opcode == 42) {
				int i_69_ = stream.readUnsignedByte();
				((ItemConfig) this).aByteArray5708 = new byte[i_69_];
				for (int i_70_ = 0; i_70_ < i_69_; i_70_++)
					((ItemConfig) this).aByteArray5708[i_70_] = stream.readByte();
			} else if (43 == opcode) {
				anInt5763 = stream.readInt((byte) 6) * 682064309;
				aBoolean5771 = true;
			} else if (44 == opcode) {
				int i_92_ = (short) stream.readUnsignedShort();
				int i_93_ = 0;
				for (int i_94_ = i_92_; i_94_ > 0; i_94_ >>= 1)
					i_93_++;
				aByteArray5609 = new byte[i_93_];
				byte i_95_ = 0;
				for (int i_96_ = 0; i_96_ < i_93_; i_96_++) {
					if ((i_92_ & 1 << i_96_) > 0) {
						aByteArray5609[i_96_] = i_95_;
						i_95_++;
					} else
						aByteArray5609[i_96_] = (byte) -1;
				}
			} else if (45 == opcode) {
				int i_97_ = (short) stream.readUnsignedShort();
				int i_98_ = 0;
				for (int i_99_ = i_97_; i_99_ > 0; i_99_ >>= 1)
					i_98_++;
				aByteArray5904 = new byte[i_98_];
				byte i_100_ = 0;
				for (int i_101_ = 0; i_101_ < i_98_; i_101_++) {
					if ((i_97_ & 1 << i_101_) > 0) {
						aByteArray5904[i_101_] = i_100_;
						i_100_++;
					} else
						aByteArray5904[i_101_] = (byte) -1;
				}
			} else if (65 == opcode)
				tradeable = false; //true
			else if (78 == opcode)
				((ItemConfig) this).maleModel3 = (stream.readBigSmart(1235052657)  + Settings._685_MODEL_OFFSET) * 756401161;
			else if (opcode == 79)
				((ItemConfig) this).femaleModel3 = (stream.readBigSmart(1235052657)  + Settings._685_MODEL_OFFSET) * 2098680761;
			else if (opcode == 90)
				((ItemConfig) this).maleHeadModel1 = (stream.readBigSmart(1235052657)  + Settings._685_MODEL_OFFSET) * 1319962769;
			else if (opcode == 91)
				((ItemConfig) this).femaleHeadModel1 = (stream.readBigSmart(1235052657)  + Settings._685_MODEL_OFFSET) * 1598907469;
			else if (opcode == 92)
				((ItemConfig) this).maleHeadModel2 = (stream.readBigSmart(1235052657)  + Settings._685_MODEL_OFFSET) * -1935344449;
			else if (93 == opcode)
				((ItemConfig) this).femaleHeadModel2 = (stream.readBigSmart(1235052657)  + Settings._685_MODEL_OFFSET) * -1194369871;
			else if (95 == opcode)
				offsetX = stream.readUnsignedShort() * -883520799;
			else if (96 == opcode)
				anInt5765 = stream.readUnsignedByte() * 135187667;
			else if (opcode == 97)
				cert = (stream.readUnsignedShort() + Settings._685_ITEM_OFFSET) * -384973719;
			else if (98 == opcode)
				certTemplate = (stream.readUnsignedShort() + Settings._685_ITEM_OFFSET) * 1831957949;
			else if (opcode >= 100 && opcode < 110) {
				if (((ItemConfig) this).stackIDs == null) {
					((ItemConfig) this).stackIDs = new int[10];
					((ItemConfig) this).stackAmounts = new int[10];
				}
				((ItemConfig) this).stackIDs[opcode - 100] = stream.readUnsignedShort() + Settings._685_ITEM_OFFSET;
				((ItemConfig) this).stackAmounts[opcode - 100] = stream.readUnsignedShort();
			} else if (opcode == 110)
				((ItemConfig) this).scaleX = stream.readUnsignedShort() * -237762771;
			else if (111 == opcode)
				((ItemConfig) this).scaleY = stream.readUnsignedShort() * 355882061;
			else if (opcode == 112)
				((ItemConfig) this).scaleZ = stream.readUnsignedShort() * 1219480869;
			else if (opcode == 113)
				((ItemConfig) this).shadow = stream.readByte() * 712208909;
			else if (opcode == 114)
				((ItemConfig) this).lightness = stream.readByte() * -1050247335;
			else if (115 == opcode)
				team = stream.readUnsignedByte() * 1325490629;
			else if (121 == opcode)
				((ItemConfig) this).lend = (stream.readUnsignedShort() + Settings._685_ITEM_OFFSET) * -970653687;
			else if (122 == opcode)
				lendTemplate = (stream.readUnsignedShort() + Settings._685_ITEM_OFFSET) * 2015131539;
			else if (opcode == 125) {
				((ItemConfig) this).anInt5742 = ((stream.readByte() << 2) * -1833538443);
				((ItemConfig) this).anInt5744 = (stream.readByte() << 2) * -25983505;
				((ItemConfig) this).anInt5748 = (stream.readByte() << 2) * 1243416501;
			} else if (opcode == 126) {
				((ItemConfig) this).anInt5743 = ((stream.readByte() << 2) * -1039520547);
				((ItemConfig) this).anInt5745 = (stream.readByte() << 2) * 1803423949;
				((ItemConfig) this).anInt5710 = (stream.readByte() << 2) * 519268429;
			} else if (opcode == 127) {
				anInt5729 = stream.readUnsignedByte() * 947829311;
				anInt5725 = stream.readUnsignedShort() * 300082645;
			} else if (128 == opcode) {
				anInt5730 = stream.readUnsignedByte() * -1036837039;
				anInt5703 = stream.readUnsignedShort() * 1829509431;
			} else if (129 == opcode) {
				anInt5736 = stream.readUnsignedByte() * -2098727417;
				anInt5727 = stream.readUnsignedShort() * -48114927;
			} else if (opcode == 130) {
				anInt5722 = stream.readUnsignedByte() * -969618575;
				anInt5728 = stream.readUnsignedShort() * -1531140281;
			} else if (132 == opcode) {
				int i_71_ = stream.readUnsignedByte();
				anIntArray5767 = new int[i_71_];
				for (int i_72_ = 0; i_72_ < i_71_; i_72_++)
					anIntArray5767[i_72_] = stream.readUnsignedShort();
			} else if (134 == opcode)
				anInt5768 = stream.readUnsignedByte() * 1394978643;
			else if (139 == opcode)
				((ItemConfig) this).anInt5769 = (stream.readUnsignedShort() + Settings._685_ITEM_OFFSET) * 257950023;
			else if (opcode == 140)
				anInt5770 = (stream.readUnsignedShort() + Settings._685_ITEM_OFFSET) * 78716625;
			else if (opcode >= 142 && opcode < 147) {
				if (aByteIntArray5869 == null) {
					aByteIntArray5869 = new int[6];
					Arrays.fill(aByteIntArray5869, -1);
				}
				aByteIntArray5869[opcode - 142] = (short) stream.readUnsignedShort();
			} else if (opcode >= 150 && opcode < 155) {
				if (null == anIntArray5960) {
					anIntArray5960 = new int[5];
					Arrays.fill(anIntArray5960, -1);
				}
				anIntArray5960[opcode - 150] = (short) stream.readUnsignedShort();
			} else if (249 == opcode) {
				int i_73_ = stream.readUnsignedByte();
				if (null == ((ItemConfig) this).settings) {
					int i_74_ = Class416.method5590(i_73_, (byte) 16);
					((ItemConfig) this).settings = new LinkedArrayList(i_74_);
				}
				for (int i_75_ = 0; i_75_ < i_73_; i_75_++) {// client script
																// map
					boolean bool = stream.readUnsignedByte() == 1;
					int i_76_ = stream.read24BitUnsignedInteger((byte) 15);
					Class298 class298;
					if (bool)
						class298 = new ObjectValue(stream.readString(-1208778402));
					else
						class298 = new IntegerValue(stream.readInt((byte) 69));
					((ItemConfig) this).settings.method5817(class298, (long) i_76_);
				}
			} else {
				System.out.println("MISSING OPCODE 685: " + opcode);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.b(").append(')').toString());
		}
	}

	
	void decode(RsByteBuffer stream, int opcode, boolean oldItems) {
		int id = 1027112447 * ((ItemConfig) this).itemId;
		try {
			if (1 == opcode)
				((ItemConfig) this).model = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * -1019082089;// model
																																					// id
			else if (2 == opcode)
				name = stream.readString(1338906243);// name
			else if (opcode == 4)
				modelScale = stream.readUnsignedShort() * -1885125181;
			else if (5 == opcode)
				modelPitch = stream.readUnsignedShort() * -2068311459;
			else if (6 == opcode)
				modelRoll = stream.readUnsignedShort() * -629359451;
			else if (7 == opcode) {
				modelTranslateX = stream.readUnsignedShort() * -1497539247;
				if (modelTranslateX * 252709809 > 32767)
					modelTranslateX -= 1565589504;
			} else if (opcode == 8) {
				modelTranslateY = stream.readUnsignedShort() * -572964665;
				if (-1811316489 * modelTranslateY > 32767)
					modelTranslateY -= 1086783488;
			} else if (opcode == 11)
				stackable = 126481113;
			else if (12 == opcode)
				value = stream.readInt((byte) -4) * -1375390745;
			else if (opcode == 13)
				equipSlot = stream.readUnsignedByte() * -2026784241;
			else if (14 == opcode)
				anInt5772 = stream.readUnsignedByte() * -583083477;
			else if (16 == opcode)
				aBoolean5731 = true;
			else if (18 == opcode)
				anInt5720 = stream.readUnsignedShort() * -1741576309;
			else if (opcode == 23)
				maleModel1 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * -1612514031;
			else if (opcode == 24)
				((ItemConfig) this).maleModel2 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * 582597415;
			else if (25 == opcode)
				femaleModel1 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * -1430077763;
			else if (26 == opcode)
				((ItemConfig) this).femaleModel2 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * -336299543;
			else if (opcode == 27)
				anInt5735 = stream.readUnsignedByte() * -1438605935;
			else if (opcode >= 30 && opcode < 35)
				groundOptions[opcode - 30] = stream.readString(2111111360);
			else if (opcode >= 35 && opcode < 40)
				inventoryOptions[opcode - 35] = stream.readString(-101192414);
			else if (40 == opcode) {
				int i_65_ = stream.readUnsignedByte();
				((ItemConfig) this).originalColors = new short[i_65_];
				((ItemConfig) this).modifiedColors = new short[i_65_];
				for (int i_66_ = 0; i_66_ < i_65_; i_66_++) {
					((ItemConfig) this).originalColors[i_66_] = (short) stream.readUnsignedShort();
					((ItemConfig) this).modifiedColors[i_66_] = (short) stream.readUnsignedShort();
				}
			} else if (41 == opcode) {
				int i_67_ = stream.readUnsignedByte();
				((ItemConfig) this).originalTextures = new short[i_67_];
				((ItemConfig) this).modifiedTextures = new short[i_67_];
				for (int i_68_ = 0; i_68_ < i_67_; i_68_++) {
					((ItemConfig) this).originalTextures[i_68_] = (short) stream.readUnsignedShort();
					((ItemConfig) this).modifiedTextures[i_68_] = (short) stream.readUnsignedShort();
				}
			} else if (opcode == 42) {
				int i_69_ = stream.readUnsignedByte();
				((ItemConfig) this).aByteArray5708 = new byte[i_69_];
				for (int i_70_ = 0; i_70_ < i_69_; i_70_++)
					((ItemConfig) this).aByteArray5708[i_70_] = stream.readByte();
			} else if (43 == opcode) {
				anInt5763 = stream.readInt((byte) 6) * 682064309;
				aBoolean5771 = true;
			} else if (44 == opcode) {
				int i_92_ = (short) stream.readUnsignedShort();
				int i_93_ = 0;
				for (int i_94_ = i_92_; i_94_ > 0; i_94_ >>= 1)
					i_93_++;
				aByteArray5609 = new byte[i_93_];
				byte i_95_ = 0;
				for (int i_96_ = 0; i_96_ < i_93_; i_96_++) {
					if ((i_92_ & 1 << i_96_) > 0) {
						aByteArray5609[i_96_] = i_95_;
						i_95_++;
					} else
						aByteArray5609[i_96_] = (byte) -1;
				}
			} else if (45 == opcode) {
				int i_97_ = (short) stream.readUnsignedShort();
				int i_98_ = 0;
				for (int i_99_ = i_97_; i_99_ > 0; i_99_ >>= 1)
					i_98_++;
				aByteArray5904 = new byte[i_98_];
				byte i_100_ = 0;
				for (int i_101_ = 0; i_101_ < i_98_; i_101_++) {
					if ((i_97_ & 1 << i_101_) > 0) {
						aByteArray5904[i_101_] = i_100_;
						i_100_++;
					} else
						aByteArray5904[i_101_] = (byte) -1;
				}
			} else if (65 == opcode)
				tradeable = true;
			else if (78 == opcode)
				((ItemConfig) this).maleModel3 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * 756401161;
			else if (opcode == 79)
				((ItemConfig) this).femaleModel3 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * 2098680761;
			else if (opcode == 90)
				((ItemConfig) this).maleHeadModel1 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * 1319962769;
			else if (opcode == 91)
				((ItemConfig) this).femaleHeadModel1 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * 1598907469;
			else if (opcode == 92)
				((ItemConfig) this).maleHeadModel2 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * -1935344449;
			else if (93 == opcode)
				((ItemConfig) this).femaleHeadModel2 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * -1194369871;
			else if (95 == opcode)
				offsetX = stream.readUnsignedShort() * -883520799;
			else if (96 == opcode)
				anInt5765 = stream.readUnsignedByte() * 135187667;
			else if (opcode == 97)
				cert = stream.readUnsignedShort() * -384973719;
			else if (98 == opcode)
				certTemplate = stream.readUnsignedShort() * 1831957949;
			else if (opcode >= 100 && opcode < 110) {
				if (((ItemConfig) this).stackIDs == null) {
					((ItemConfig) this).stackIDs = new int[10];
					((ItemConfig) this).stackAmounts = new int[10];
				}
				((ItemConfig) this).stackIDs[opcode - 100] = stream.readUnsignedShort();
				((ItemConfig) this).stackAmounts[opcode - 100] = stream.readUnsignedShort();
			} else if (opcode == 110)
				((ItemConfig) this).scaleX = stream.readUnsignedShort() * -237762771;
			else if (111 == opcode)
				((ItemConfig) this).scaleY = stream.readUnsignedShort() * 355882061;
			else if (opcode == 112)
				((ItemConfig) this).scaleZ = stream.readUnsignedShort() * 1219480869;
			else if (opcode == 113)
				((ItemConfig) this).shadow = stream.readByte() * 712208909;
			else if (opcode == 114)
				((ItemConfig) this).lightness = stream.readByte() * -1050247335;
			else if (115 == opcode)
				team = stream.readUnsignedByte() * 1325490629;
			else if (121 == opcode)
				((ItemConfig) this).lend = stream.readUnsignedShort() * -970653687;
			else if (122 == opcode)
				lendTemplate = stream.readUnsignedShort() * 2015131539;
			else if (opcode == 125) {
				((ItemConfig) this).anInt5742 = ((stream.readByte() << 2) * -1833538443);
				((ItemConfig) this).anInt5744 = (stream.readByte() << 2) * -25983505;
				((ItemConfig) this).anInt5748 = (stream.readByte() << 2) * 1243416501;
			} else if (opcode == 126) {
				((ItemConfig) this).anInt5743 = ((stream.readByte() << 2) * -1039520547);
				((ItemConfig) this).anInt5745 = (stream.readByte() << 2) * 1803423949;
				((ItemConfig) this).anInt5710 = (stream.readByte() << 2) * 519268429;
			} else if (opcode == 127) {
				anInt5729 = stream.readUnsignedByte() * 947829311;
				anInt5725 = stream.readUnsignedShort() * 300082645;
			} else if (128 == opcode) {
				anInt5730 = stream.readUnsignedByte() * -1036837039;
				anInt5703 = stream.readUnsignedShort() * 1829509431;
			} else if (129 == opcode) {
				anInt5736 = stream.readUnsignedByte() * -2098727417;
				anInt5727 = stream.readUnsignedShort() * -48114927;
			} else if (opcode == 130) {
				anInt5722 = stream.readUnsignedByte() * -969618575;
				anInt5728 = stream.readUnsignedShort() * -1531140281;
			} else if (132 == opcode) {
				int i_71_ = stream.readUnsignedByte();
				anIntArray5767 = new int[i_71_];
				for (int i_72_ = 0; i_72_ < i_71_; i_72_++)
					anIntArray5767[i_72_] = stream.readUnsignedShort();
			} else if (134 == opcode)
				anInt5768 = stream.readUnsignedByte() * 1394978643;
			else if (139 == opcode)
				((ItemConfig) this).anInt5769 = stream.readUnsignedShort() * 257950023;
			else if (opcode == 140)
				anInt5770 = stream.readUnsignedShort() * 78716625;
			else if (opcode >= 142 && opcode < 147) {
				if (aByteIntArray5869 == null) {
					aByteIntArray5869 = new int[6];
					Arrays.fill(aByteIntArray5869, -1);
				}
				aByteIntArray5869[opcode - 142] = (short) stream.readUnsignedShort();
			} else if (opcode >= 150 && opcode < 155) {
				if (null == anIntArray5960) {
					anIntArray5960 = new int[5];
					Arrays.fill(anIntArray5960, -1);
				}
				anIntArray5960[opcode - 150] = (short) stream.readUnsignedShort();
			} else if (249 == opcode) {
				int i_73_ = stream.readUnsignedByte();
				if (null == ((ItemConfig) this).settings) {
					int i_74_ = Class416.method5590(i_73_, (byte) 16);
					((ItemConfig) this).settings = new LinkedArrayList(i_74_);
				}
				for (int i_75_ = 0; i_75_ < i_73_; i_75_++) {// client script
																// map
					boolean bool = stream.readUnsignedByte() == 1;
					int i_76_ = stream.read24BitUnsignedInteger((byte) 15);
					Class298 class298;
					if (bool)
						class298 = new ObjectValue(stream.readString(-1208778402));
					else
						class298 = new IntegerValue(stream.readInt((byte) 69));
					((ItemConfig) this).settings.method5817(class298, (long) i_76_);
				}
			} else {
				System.out.println("MISSING OPCODE 742: " + opcode);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.b(").append(')').toString());
		}
	}

	void method6039(ItemConfig class468_77_, ItemConfig class468_78_, int i) {
		try {
			value = 0;
			((ItemConfig) this).model = 1 * ((ItemConfig) class468_77_).model;
			modelScale = class468_77_.modelScale * 1;
			modelPitch = 1 * class468_77_.modelPitch;
			modelRoll = class468_77_.modelRoll * 1;
			offsetX = class468_77_.offsetX * 1;
			modelTranslateX = 1 * class468_77_.modelTranslateX;
			modelTranslateY = 1 * class468_77_.modelTranslateY;
			((ItemConfig) this).originalColors = ((ItemConfig) class468_78_).originalColors;
			((ItemConfig) this).modifiedColors = ((ItemConfig) class468_78_).modifiedColors;
			((ItemConfig) this).aByteArray5708 = ((ItemConfig) class468_78_).aByteArray5708;
			((ItemConfig) this).originalTextures = ((ItemConfig) class468_78_).originalTextures;
			((ItemConfig) this).modifiedTextures = ((ItemConfig) class468_78_).modifiedTextures;
			name = class468_78_.name;
			aBoolean5731 = class468_78_.aBoolean5731;
			equipSlot = 1 * class468_78_.equipSlot;
			anInt5772 = class468_78_.anInt5772 * 1;
			anInt5735 = class468_78_.anInt5735 * 1;
			maleModel1 = class468_78_.maleModel1 * 1;
			((ItemConfig) this).maleModel2 = ((ItemConfig) class468_78_).maleModel2 * 1;
			((ItemConfig) this).maleModel3 = 1 * ((ItemConfig) class468_78_).maleModel3;
			femaleModel1 = 1 * class468_78_.femaleModel1;
			((ItemConfig) this).femaleModel2 = ((ItemConfig) class468_78_).femaleModel2 * 1;
			((ItemConfig) this).femaleModel3 = ((ItemConfig) class468_78_).femaleModel3 * 1;
			((ItemConfig) this).anInt5742 = ((ItemConfig) class468_78_).anInt5742 * 1;
			((ItemConfig) this).anInt5743 = 1 * ((ItemConfig) class468_78_).anInt5743;
			((ItemConfig) this).anInt5744 = ((ItemConfig) class468_78_).anInt5744 * 1;
			((ItemConfig) this).anInt5745 = 1 * ((ItemConfig) class468_78_).anInt5745;
			((ItemConfig) this).anInt5748 = 1 * ((ItemConfig) class468_78_).anInt5748;
			((ItemConfig) this).anInt5710 = 1 * ((ItemConfig) class468_78_).anInt5710;
			((ItemConfig) this).maleHeadModel1 = 1 * ((ItemConfig) class468_78_).maleHeadModel1;
			((ItemConfig) this).maleHeadModel2 = 1 * ((ItemConfig) class468_78_).maleHeadModel2;
			((ItemConfig) this).femaleHeadModel1 = 1 * ((ItemConfig) class468_78_).femaleHeadModel1;
			((ItemConfig) this).femaleHeadModel2 = 1 * ((ItemConfig) class468_78_).femaleHeadModel2;
			team = 1 * class468_78_.team;
			groundOptions = class468_78_.groundOptions;
			((ItemConfig) this).settings = ((ItemConfig) class468_78_).settings;
			inventoryOptions = new String[5];
			if (class468_78_.inventoryOptions != null) {
				for (int i_79_ = 0; i_79_ < 4; i_79_++)
					inventoryOptions[i_79_] = class468_78_.inventoryOptions[i_79_];
			}
			inventoryOptions[4] = Tradution.aClass470_5855.method6049((((Class477) (((ItemConfig) this).aClass477_5751)).aClass429_5997), -875414210);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.i(").append(')').toString());
		}
	}

	public final Model method6040(boolean bool, Class464 class464, int i) {
		try {
			int id = 1027112447 * ((ItemConfig) this).itemId;
			
			int lookID = CustomItems.getOldLookItem(id, bool);
			if (lookID != id) 
				return Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(lookID, false).method6040(bool, class464, i);
		
			int i_80_;
			int i_81_;
			if (bool) {
				if (class464 != null && null != class464.anIntArray5697) {
					i_80_ = class464.anIntArray5697[0];
					i_81_ = class464.anIntArray5697[1];
				} else {
					i_80_ = ((ItemConfig) this).femaleHeadModel1 * -1531415419;
					i_81_ = 1578724433 * ((ItemConfig) this).femaleHeadModel2;
				}
			} else if (null != class464 && null != class464.anIntArray5690) {
				i_80_ = class464.anIntArray5690[0];
				i_81_ = class464.anIntArray5690[1];
			} else {
				i_80_ = -1282951055 * ((ItemConfig) this).maleHeadModel1;
				i_81_ = ((ItemConfig) this).maleHeadModel2 * 86274879;
			}
			if (-1 == i_80_)
				return null;
			Model class64 = Model.loadModel((((Class477) (((ItemConfig) this).aClass477_5751)).aClass243_5992), i_80_, 0);

			if(printModelColors) {
				class64.printSortedModelClrs();
			}
			if (class64.protocol < 13)
				class64.resize(2);
			if (-1 != i_81_) {
				Model class64_82_ = Model.loadModel((((Class477) ((ItemConfig) this).aClass477_5751).aClass243_5992), i_81_, 0);
				if (class64_82_.protocol < 13)
					class64_82_.resize(2);
				Model[] class64s = { class64, class64_82_ };
				class64 = new Model(class64s, 2);
			}
			if (null != ((ItemConfig) this).originalColors) {
				short[] is;
				if (class464 != null && null != class464.aShortArray5698)
					is = class464.aShortArray5698;
				else
					is = ((ItemConfig) this).modifiedColors;
				for (int i_83_ = 0; i_83_ < ((ItemConfig) this).originalColors.length; i_83_++)
					class64.recolor(((ItemConfig) this).originalColors[i_83_], is[i_83_]);
			}
			if(retextureClr != null) {
				for(int tex = 0; tex < retextureClr.length; tex++) {
					class64.setTexture(new int[] {retextureClr[tex]}, retextureTexture[tex]);
				}
			}
			if (null != ((ItemConfig) this).originalTextures) {
				short[] is;
				if (null != class464 && class464.aShortArray5699 != null)
					is = class464.aShortArray5699;
				else
					is = ((ItemConfig) this).modifiedTextures;
				for (int i_84_ = 0; i_84_ < ((ItemConfig) this).originalTextures.length; i_84_++)
					class64.retexture(((ItemConfig) this).originalTextures[i_84_], is[i_84_]);
			}
			return class64;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.t(").append(')').toString());
		}
	}

	public String method6041(int i, String string, short i_85_) {
		try {
			if (((ItemConfig) this).settings == null)
				return string;
			ObjectValue class298_sub29 = ((ObjectValue) ((ItemConfig) this).settings.method5812((long) i));
			if (class298_sub29 == null)
				return string;
			return (String) class298_sub29.value;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.v(").append(')').toString());
		}
	}

	ItemConfig() {
		stackable = 0;
		anInt5720 = 1741576309;
		value = -1375390745;
		aBoolean5731 = false;
		anInt5725 = -300082645;
		anInt5703 = -1829509431;
		anInt5727 = 48114927;
		anInt5728 = 1531140281;
		anInt5729 = -947829311;
		anInt5730 = 1036837039;
		anInt5736 = 2098727417;
		anInt5722 = 969618575;
		equipSlot = 2026784241;
		anInt5772 = 583083477;
		anInt5735 = 1438605935;
		maleModel1 = 1612514031;
		((ItemConfig) this).maleModel2 = -582597415;
		femaleModel1 = 1430077763;
		((ItemConfig) this).femaleModel2 = 336299543;
		((ItemConfig) this).maleModel3 = -756401161;
		((ItemConfig) this).femaleModel3 = -2098680761;
		((ItemConfig) this).anInt5742 = 0;
		((ItemConfig) this).anInt5743 = 0;
		((ItemConfig) this).anInt5744 = 0;
		((ItemConfig) this).anInt5745 = 0;
		((ItemConfig) this).anInt5748 = 0;
		((ItemConfig) this).anInt5710 = 0;
		((ItemConfig) this).maleHeadModel1 = -1319962769;
		((ItemConfig) this).maleHeadModel2 = 1935344449;
		((ItemConfig) this).femaleHeadModel1 = -1598907469;
		((ItemConfig) this).femaleHeadModel2 = 1194369871;
		cert = 384973719;
		certTemplate = -1831957949;
		((ItemConfig) this).lend = 970653687;
		lendTemplate = -2015131539;
		((ItemConfig) this).scaleX = -368863616;
		((ItemConfig) this).scaleY = -1691736448;
		((ItemConfig) this).scaleZ = 1474728576;
		((ItemConfig) this).shadow = 0;
		((ItemConfig) this).lightness = 0;
		team = 0;
		tradeable = false;
		anInt5765 = 0;
		anInt5768 = 0;
		((ItemConfig) this).anInt5769 = -257950023;
		anInt5770 = -78716625;
		aBoolean5771 = false;
	}

	static final void method6042(int i, int i_86_, int i_87_) {
		try {
			if (Class301_Sub1.aFloat3233 < Class301_Sub1.aFloat3234) {
				Class301_Sub1.aFloat3233 += (double) Class301_Sub1.aFloat3233 / 30.0;
				if (Class301_Sub1.aFloat3233 > Class301_Sub1.aFloat3234)
					Class301_Sub1.aFloat3233 = Class301_Sub1.aFloat3234;
				Class225.method2103(65536);
				Class301_Sub1.anInt3254 = (int) Class301_Sub1.aFloat3233 >> 1;
				Class301_Sub1.aByteArrayArrayArray3229 = IcmpService_Sub1.method6381(Class301_Sub1.anInt3254, 818170582);
			} else if (Class301_Sub1.aFloat3233 > Class301_Sub1.aFloat3234) {
				Class301_Sub1.aFloat3233 -= (double) Class301_Sub1.aFloat3233 / 30.0;
				if (Class301_Sub1.aFloat3233 < Class301_Sub1.aFloat3234)
					Class301_Sub1.aFloat3233 = Class301_Sub1.aFloat3234;
				Class225.method2103(65536);
				Class301_Sub1.anInt3254 = (int) Class301_Sub1.aFloat3233 >> 1;
				Class301_Sub1.aByteArrayArrayArray3229 = IcmpService_Sub1.method6381(Class301_Sub1.anInt3254, 1742182898);
			}
			if (Class301_Sub1.anInt7632 * -1198160439 != -1 && -1 != -19739017 * Class301_Sub1.anInt7627) {
				int i_88_ = (-1198160439 * Class301_Sub1.anInt7632 - Class82_Sub14.anInt6875 * 1196508279);
				if (i_88_ < 2 || i_88_ > 2)
					i_88_ /= 8;
				int i_89_ = (Class301_Sub1.anInt7627 * -19739017 - Class376.anInt4090 * 1882038855);
				if (i_89_ < 2 || i_89_ > 2)
					i_89_ /= 8;
				Class82_Sub14.anInt6875 = ((i_88_ + Class82_Sub14.anInt6875 * 1196508279) * -2076584633);
				Class376.anInt4090 = (i_89_ + 1882038855 * Class376.anInt4090) * -435591305;
				if (i_88_ == 0 && i_89_ == 0) {
					Class301_Sub1.anInt7632 = 433609607;
					Class301_Sub1.anInt7627 = 789877945;
				}
				Class225.method2103(65536);
			}
			if (Class137_Sub1.anInt6991 * -1983068885 > 0) {
				Class88.anInt810 -= -1077128129;
				if (0 == Class88.anInt810 * -1581933633) {
					Class137_Sub1.anInt6991 -= -63057533;
					Class88.anInt810 = -338630500;
				}
			} else {
				Class301_Sub1.anInt7633 = -2138103821;
				Class301_Sub1.anInt7630 = -1998014133;
			}
			if (Class301_Sub1.aBoolean7628 && JagexFile2.aClass453_5986 != null) {
				for (Class298_Sub6 class298_sub6 = ((Class298_Sub6) JagexFile2.aClass453_5986.method5939(1766612795)); null != class298_sub6; class298_sub6 = (Class298_Sub6) JagexFile2.aClass453_5986.method5944(49146)) {
					Class352 class352 = (Class301_Sub1.aClass339_3251.method4116(-530122905 * (((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.mapAreaID), -1186797555));
					if (class298_sub6.method2862(i, i_86_, (byte) 19)) {
						if (class352.aStringArray3778 != null) {
							if (null != class352.aStringArray3778[4])
								Class234.method2174(class352.aStringArray3778[4], class352.aString3789, -1, 1012, -1, (long) ((((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.mapAreaID) * -530122905), class352.anInt3817 * -804513353, 0, true, false, (long) ((((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.mapAreaID) * -530122905), false, -1324353170);
							if (class352.aStringArray3778[3] != null)
								Class234.method2174(class352.aStringArray3778[3], class352.aString3789, -1, 1011, -1, (long) (-530122905 * (((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.mapAreaID)), class352.anInt3817 * -804513353, 0, true, false, (long) ((((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.mapAreaID) * -530122905), false, -1509752920);
							if (class352.aStringArray3778[2] != null)
								Class234.method2174(class352.aStringArray3778[2], class352.aString3789, -1, 1010, -1, (long) ((((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.mapAreaID) * -530122905), class352.anInt3817 * -804513353, 0, true, false, (long) (-530122905 * (((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.mapAreaID)), false, -1074248386);
							if (class352.aStringArray3778[1] != null)
								Class234.method2174(class352.aStringArray3778[1], class352.aString3789, -1, 1009, -1, (long) (-530122905 * (((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.mapAreaID)), class352.anInt3817 * -804513353, 0, true, false, (long) ((((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.mapAreaID) * -530122905), false, -1424985903);
							if (null != class352.aStringArray3778[0])
								Class234.method2174(class352.aStringArray3778[0], class352.aString3789, -1, 1008, -1, (long) ((((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.mapAreaID) * -530122905), class352.anInt3817 * -804513353, 0, true, false, (long) ((((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.mapAreaID) * -530122905), false, -2019134484);
						}
						if (!((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.aBoolean7611) {
							((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.aBoolean7611 = true;
							Class126.method1405(Class502.aClass502_6727, -530122905 * (((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.mapAreaID), class352.anInt3817 * -804513353, 20917601);
						}
						if (((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.aBoolean7611)
							Class126.method1405(Class502.aClass502_6721, -530122905 * (((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.mapAreaID), class352.anInt3817 * -804513353, -1586023399);
					} else if (((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.aBoolean7611) {
						((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.aBoolean7611 = false;
						Class126.method1405(Class502.aClass502_6718, (-530122905 * (((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.mapAreaID)), -804513353 * class352.anInt3817, -1187185253);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.bz(").append(')').toString());
		}
	}

	public static int method6043(int i, int i_90_, int i_91_) {
		try {
			if (LinkedArrayList.WIDGET_DETAILS.anInt4035 * -1919698893 == -1)
				return 1;
			if (i != Class422_Sub25.preferences.graphicsMode.method5677(-2106508116)) {
				WidgetDetails.method4584(i, (Tradution.PROFILING_MESSAGE.method6049(Class321.aClass429_3357, -875414210)), true, (byte) 53);
				if (Class422_Sub25.preferences.graphicsMode.method5677(-1001808225) != i)
					return -1;
			}
			int i_92_;
			try {
				Dimension dimension = Class52_Sub2_Sub1.aCanvas9079.getSize();
				Class139.drawText(Tradution.PROFILING_MESSAGE.method6049(Class321.aClass429_3357, -875414210), true, FloorOverlay.graphics, Class343.aClass264_3673, Class422_Sub2.aClass505_8369, (byte) 5);
				Model class64 = Model.loadModel(Map.aClass243_3646, (-1919698893 * LinkedArrayList.WIDGET_DETAILS.anInt4035), 0);

				long l = Class122.method1319((byte) 1);
				FloorOverlay.graphics.L();
				client.aClass222_8871.method2062(0.0F, 256.0F, 0.0F);
				FloorOverlay.graphics.method5043(client.aClass222_8871);
				Matrix class233 = FloorOverlay.graphics.method5036();
				class233.method2152((float) (dimension.width / 2), (float) (dimension.height / 2), 512.0F, 512.0F, (float) client.aClass283_8716.method2634((byte) -121), (float) client.aClass283_8716.method2635(1789119116), (float) dimension.width, (float) dimension.height);
				FloorOverlay.graphics.method5182(class233);
				FloorOverlay.graphics.IA(1.0F);
				FloorOverlay.graphics.m(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
				Class387 class387 = FloorOverlay.graphics.method5037(class64, 2048, 64, 64, 768);
				int i_93_ = 0;
				while_107_: for (int i_94_ = 0; i_94_ < 500; i_94_++) {
					FloorOverlay.graphics.ba(3, 0);
					for (int i_95_ = 15; i_95_ >= 0; i_95_--) {
						for (int i_96_ = 0; i_96_ <= i_95_; i_96_++) {
							client.aClass222_8968.method2062((float) (int) (512.0F * ((float) i_96_ - (float) i_95_ / 2.0F)), 0.0F, (float) ((1 + i_95_) * 512));
							class387.drawModel(client.aClass222_8968, null, 0);
							i_93_++;
							if (Class122.method1319((byte) 1) - l >= (long) i_90_) {
								if (i_91_ >= 1017103058)
									throw new IllegalStateException();
								break while_107_;
							}
						}
					}
				}
				FloorOverlay.graphics.method5075();
				long l_97_ = ((long) (i_93_ * 1000) / (Class122.method1319((byte) 1) - l));
				FloorOverlay.graphics.ba(3, 0);
				i_92_ = (int) l_97_;
			} catch (Throwable throwable) {
				throwable.printStackTrace();
				return -1;
			}
			return i_92_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.gt(").append(')').toString());
		}
	}
	
	public void setAttackStyle(int style) {
		if (settings == null)
			settings = new LinkedArrayList(1);
		settings.method5817(new IntegerValue(style), 686);
	}
	
	public void setSpecialBar() {
		if (settings == null)
			settings = new LinkedArrayList(1);
		settings.method5817(new IntegerValue(1), 687);
	}
	
	public void setEquipmentOption1(String option) {
		if (settings == null)
			settings = new LinkedArrayList(1);
		settings.method5817(new ObjectValue(option), 528);
	}


	int[] retextureClr = null;
	int[] retextureTexture = null;
	/* replace a list of colors with 1 texture */
	public void addTexture(int[] clr, int tex) {
		int[] texs = new int[clr.length];
		for(int i = 0; i < clr.length; i++)
			texs[i] = tex;

		addTexture(clr, texs);
	}
	/* replac colors with specific textures */
	public void addTexture(int[] clr, int tex[]) {
		retextureClr = clr;
		retextureTexture = tex;
	}
}
