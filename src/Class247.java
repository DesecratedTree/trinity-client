/* Class247 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class247 {
	float aFloat2617;
	float aFloat2618;
	float aFloat2619;
	float aFloat2620;
	public static Class247 aClass247_2621 = new Class247();
	float aFloat2622;
	float aFloat2623;
	float aFloat2624;
	float aFloat2625;
	float aFloat2626;
	float aFloat2627;
	float aFloat2628;
	float aFloat2629;

	public Class247(Class247 class247_0_) {
		method2454(class247_0_);
	}

	public void method2454(Class247 class247_1_) {
		((Class247) this).aFloat2618 = ((Class247) class247_1_).aFloat2618;
		((Class247) this).aFloat2620 = ((Class247) class247_1_).aFloat2620;
		((Class247) this).aFloat2626 = ((Class247) class247_1_).aFloat2626;
		((Class247) this).aFloat2627 = ((Class247) class247_1_).aFloat2627;
		((Class247) this).aFloat2619 = ((Class247) class247_1_).aFloat2619;
		((Class247) this).aFloat2622 = ((Class247) class247_1_).aFloat2622;
		((Class247) this).aFloat2625 = ((Class247) class247_1_).aFloat2625;
		((Class247) this).aFloat2628 = ((Class247) class247_1_).aFloat2628;
		((Class247) this).aFloat2617 = ((Class247) class247_1_).aFloat2617;
		((Class247) this).aFloat2623 = ((Class247) class247_1_).aFloat2623;
		((Class247) this).aFloat2624 = ((Class247) class247_1_).aFloat2624;
		((Class247) this).aFloat2629 = ((Class247) class247_1_).aFloat2629;
	}

	public void method2455(Class241 class241) {
		method2464(class241.aClass244_2607);
		method2466(class241.aClass260_2606);
	}

	public void method2456(Class241 class241) {
		float f = (class241.aClass244_2607.aFloat2614 * class241.aClass244_2607.aFloat2614);
		float f_2_ = (class241.aClass244_2607.aFloat2614 * class241.aClass244_2607.aFloat2608);
		float f_3_ = (class241.aClass244_2607.aFloat2614 * class241.aClass244_2607.aFloat2612);
		float f_4_ = (class241.aClass244_2607.aFloat2614 * class241.aClass244_2607.aFloat2613);
		float f_5_ = (class241.aClass244_2607.aFloat2608 * class241.aClass244_2607.aFloat2608);
		float f_6_ = (class241.aClass244_2607.aFloat2608 * class241.aClass244_2607.aFloat2612);
		float f_7_ = (class241.aClass244_2607.aFloat2608 * class241.aClass244_2607.aFloat2613);
		float f_8_ = (class241.aClass244_2607.aFloat2612 * class241.aClass244_2607.aFloat2612);
		float f_9_ = (class241.aClass244_2607.aFloat2612 * class241.aClass244_2607.aFloat2613);
		float f_10_ = (class241.aClass244_2607.aFloat2613 * class241.aClass244_2607.aFloat2613);
		((Class247) this).aFloat2618 = f_5_ + f - f_10_ - f_8_;
		((Class247) this).aFloat2619 = f_6_ + f_4_ + f_6_ + f_4_;
		((Class247) this).aFloat2617 = f_7_ - f_3_ - f_3_ + f_7_;
		((Class247) this).aFloat2620 = f_6_ - f_4_ - f_4_ + f_6_;
		((Class247) this).aFloat2622 = f_8_ + f - f_5_ - f_10_;
		((Class247) this).aFloat2623 = f_9_ + f_2_ + f_9_ + f_2_;
		((Class247) this).aFloat2626 = f_7_ + f_3_ + f_7_ + f_3_;
		((Class247) this).aFloat2625 = f_9_ - f_2_ - f_2_ + f_9_;
		((Class247) this).aFloat2624 = f_10_ + f - f_8_ - f_5_;
		((Class247) this).aFloat2627 = class241.aClass260_2606.aFloat2716;
		((Class247) this).aFloat2628 = class241.aClass260_2606.aFloat2715;
		((Class247) this).aFloat2629 = class241.aClass260_2606.aFloat2711;
	}

	public void method2457(float f, float f_11_, float f_12_, float f_13_, float f_14_, float f_15_, float f_16_, float f_17_, float f_18_) {
		float f_19_ = f_13_ - f;
		float f_20_ = f_14_ - f_11_;
		float f_21_ = f_15_ - f_12_;
		float f_22_ = f_17_ * f_21_ - f_18_ * f_20_;
		float f_23_ = f_18_ * f_19_ - f_16_ * f_21_;
		float f_24_ = f_16_ * f_20_ - f_17_ * f_19_;
		float f_25_ = (float) (1.0 / Math.sqrt((double) (f_22_ * f_22_ + f_23_ * f_23_ + f_24_ * f_24_)));
		float f_26_ = (float) (1.0 / Math.sqrt((double) (f_19_ * f_19_ + f_20_ * f_20_ + f_21_ * f_21_)));
		((Class247) this).aFloat2618 = f_22_ * f_25_;
		((Class247) this).aFloat2620 = f_23_ * f_25_;
		((Class247) this).aFloat2626 = f_24_ * f_25_;
		((Class247) this).aFloat2617 = f_19_ * f_26_;
		((Class247) this).aFloat2623 = f_20_ * f_26_;
		((Class247) this).aFloat2624 = f_21_ * f_26_;
		((Class247) this).aFloat2619 = (((Class247) this).aFloat2623 * ((Class247) this).aFloat2626 - ((Class247) this).aFloat2624 * ((Class247) this).aFloat2620);
		((Class247) this).aFloat2622 = (((Class247) this).aFloat2624 * ((Class247) this).aFloat2618 - ((Class247) this).aFloat2617 * ((Class247) this).aFloat2626);
		((Class247) this).aFloat2625 = (((Class247) this).aFloat2617 * ((Class247) this).aFloat2620 - ((Class247) this).aFloat2623 * ((Class247) this).aFloat2618);
		((Class247) this).aFloat2627 = -(f * ((Class247) this).aFloat2618 + f_11_ * ((Class247) this).aFloat2620 + f_12_ * ((Class247) this).aFloat2626);
		((Class247) this).aFloat2628 = -(f * ((Class247) this).aFloat2619 + f_11_ * ((Class247) this).aFloat2622 + f_12_ * ((Class247) this).aFloat2625);
		((Class247) this).aFloat2629 = -(f * ((Class247) this).aFloat2617 + f_11_ * ((Class247) this).aFloat2623 + f_12_ * ((Class247) this).aFloat2624);
	}

	public void method2458(Class247 class247_27_) {
		if (class247_27_ == this)
			method2459();
		else {
			((Class247) this).aFloat2618 = ((Class247) class247_27_).aFloat2618;
			((Class247) this).aFloat2620 = ((Class247) class247_27_).aFloat2619;
			((Class247) this).aFloat2626 = ((Class247) class247_27_).aFloat2617;
			((Class247) this).aFloat2619 = ((Class247) class247_27_).aFloat2620;
			((Class247) this).aFloat2622 = ((Class247) class247_27_).aFloat2622;
			((Class247) this).aFloat2625 = ((Class247) class247_27_).aFloat2623;
			((Class247) this).aFloat2617 = ((Class247) class247_27_).aFloat2626;
			((Class247) this).aFloat2623 = ((Class247) class247_27_).aFloat2625;
			((Class247) this).aFloat2624 = ((Class247) class247_27_).aFloat2624;
			((Class247) this).aFloat2627 = -((((Class247) class247_27_).aFloat2627 * ((Class247) this).aFloat2618) + (((Class247) class247_27_).aFloat2628 * ((Class247) this).aFloat2620) + (((Class247) class247_27_).aFloat2629 * ((Class247) this).aFloat2626));
			((Class247) this).aFloat2628 = -((((Class247) class247_27_).aFloat2627 * ((Class247) this).aFloat2619) + (((Class247) class247_27_).aFloat2628 * ((Class247) this).aFloat2622) + (((Class247) class247_27_).aFloat2629 * ((Class247) this).aFloat2625));
			((Class247) this).aFloat2629 = -((((Class247) class247_27_).aFloat2627 * ((Class247) this).aFloat2617) + (((Class247) class247_27_).aFloat2628 * ((Class247) this).aFloat2623) + (((Class247) class247_27_).aFloat2629 * ((Class247) this).aFloat2624));
		}
	}

	public void method2459() {
		float f = ((Class247) this).aFloat2627;
		float f_28_ = ((Class247) this).aFloat2628;
		float f_29_ = ((Class247) this).aFloat2620;
		((Class247) this).aFloat2620 = ((Class247) this).aFloat2619;
		((Class247) this).aFloat2619 = f_29_;
		float f_30_ = ((Class247) this).aFloat2626;
		((Class247) this).aFloat2626 = ((Class247) this).aFloat2617;
		((Class247) this).aFloat2617 = f_30_;
		float f_31_ = ((Class247) this).aFloat2625;
		((Class247) this).aFloat2625 = ((Class247) this).aFloat2623;
		((Class247) this).aFloat2623 = f_31_;
		((Class247) this).aFloat2627 = -(f * ((Class247) this).aFloat2618 + f_28_ * ((Class247) this).aFloat2620 + ((Class247) this).aFloat2629 * ((Class247) this).aFloat2626);
		((Class247) this).aFloat2628 = -(f * ((Class247) this).aFloat2619 + f_28_ * ((Class247) this).aFloat2622 + ((Class247) this).aFloat2629 * ((Class247) this).aFloat2625);
		((Class247) this).aFloat2629 = -(f * ((Class247) this).aFloat2617 + f_28_ * ((Class247) this).aFloat2623 + ((Class247) this).aFloat2629 * ((Class247) this).aFloat2624);
	}

	public void method2460() {
		((Class247) this).aFloat2629 = 0.0F;
		((Class247) this).aFloat2628 = 0.0F;
		((Class247) this).aFloat2627 = 0.0F;
		((Class247) this).aFloat2625 = 0.0F;
		((Class247) this).aFloat2626 = 0.0F;
		((Class247) this).aFloat2623 = 0.0F;
		((Class247) this).aFloat2620 = 0.0F;
		((Class247) this).aFloat2617 = 0.0F;
		((Class247) this).aFloat2619 = 0.0F;
		((Class247) this).aFloat2624 = 1.0F;
		((Class247) this).aFloat2622 = 1.0F;
		((Class247) this).aFloat2618 = 1.0F;
	}

	void method2461(float f, float f_32_, float f_33_, float f_34_) {
		float f_35_ = f * f;
		float f_36_ = f * f_32_;
		float f_37_ = f * f_33_;
		float f_38_ = f * f_34_;
		float f_39_ = f_32_ * f_32_;
		float f_40_ = f_32_ * f_33_;
		float f_41_ = f_32_ * f_34_;
		float f_42_ = f_33_ * f_33_;
		float f_43_ = f_33_ * f_34_;
		((Class247) this).aFloat2618 = 1.0F - 2.0F * (f_39_ + f_42_);
		((Class247) this).aFloat2620 = 2.0F * (f_36_ - f_43_);
		((Class247) this).aFloat2626 = 2.0F * (f_37_ + f_41_);
		((Class247) this).aFloat2619 = 2.0F * (f_36_ + f_43_);
		((Class247) this).aFloat2622 = 1.0F - 2.0F * (f_35_ + f_42_);
		((Class247) this).aFloat2625 = 2.0F * (f_40_ - f_38_);
		((Class247) this).aFloat2617 = 2.0F * (f_37_ - f_41_);
		((Class247) this).aFloat2623 = 2.0F * (f_40_ + f_38_);
		((Class247) this).aFloat2624 = 1.0F - 2.0F * (f_35_ + f_39_);
		((Class247) this).aFloat2629 = 0.0F;
		((Class247) this).aFloat2628 = 0.0F;
		((Class247) this).aFloat2627 = 0.0F;
	}

	public void method2462(float f, float f_44_, float f_45_, float f_46_) {
		float f_47_ = (float) Math.cos((double) f_46_);
		float f_48_ = (float) Math.sin((double) f_46_);
		float f_49_ = f_47_ + f * f * (1.0F - f_47_);
		float f_50_ = f_45_ * f_48_ + f_44_ * f * (1.0F - f_47_);
		float f_51_ = -f_44_ * f_48_ + f_45_ * f * (1.0F - f_47_);
		float f_52_ = -f_45_ * f_48_ + f * f_44_ * (1.0F - f_47_);
		float f_53_ = f_47_ + f_44_ * f_44_ * (1.0F - f_47_);
		float f_54_ = f * f_48_ + f_45_ * f_44_ * (1.0F - f_47_);
		float f_55_ = f_44_ * f_48_ + f * f_45_ * (1.0F - f_47_);
		float f_56_ = -f * f_48_ + f_44_ * f_45_ * (1.0F - f_47_);
		float f_57_ = f_47_ + f_45_ * f_45_ * (1.0F - f_47_);
		float f_58_ = ((Class247) this).aFloat2618;
		float f_59_ = ((Class247) this).aFloat2619;
		float f_60_ = ((Class247) this).aFloat2620;
		float f_61_ = ((Class247) this).aFloat2622;
		float f_62_ = ((Class247) this).aFloat2626;
		float f_63_ = ((Class247) this).aFloat2625;
		float f_64_ = ((Class247) this).aFloat2627;
		float f_65_ = ((Class247) this).aFloat2628;
		((Class247) this).aFloat2618 = (f_58_ * f_49_ + f_59_ * f_52_ + ((Class247) this).aFloat2617 * f_55_);
		((Class247) this).aFloat2619 = (f_58_ * f_50_ + f_59_ * f_53_ + ((Class247) this).aFloat2617 * f_56_);
		((Class247) this).aFloat2617 = (f_58_ * f_51_ + f_59_ * f_54_ + ((Class247) this).aFloat2617 * f_57_);
		((Class247) this).aFloat2620 = (f_60_ * f_49_ + f_61_ * f_52_ + ((Class247) this).aFloat2623 * f_55_);
		((Class247) this).aFloat2622 = (f_60_ * f_50_ + f_61_ * f_53_ + ((Class247) this).aFloat2623 * f_56_);
		((Class247) this).aFloat2623 = (f_60_ * f_51_ + f_61_ * f_54_ + ((Class247) this).aFloat2623 * f_57_);
		((Class247) this).aFloat2626 = (f_62_ * f_49_ + f_63_ * f_52_ + ((Class247) this).aFloat2624 * f_55_);
		((Class247) this).aFloat2625 = (f_62_ * f_50_ + f_63_ * f_53_ + ((Class247) this).aFloat2624 * f_56_);
		((Class247) this).aFloat2624 = (f_62_ * f_51_ + f_63_ * f_54_ + ((Class247) this).aFloat2624 * f_57_);
		((Class247) this).aFloat2627 = (f_64_ * f_49_ + f_65_ * f_52_ + ((Class247) this).aFloat2629 * f_55_);
		((Class247) this).aFloat2628 = (f_64_ * f_50_ + f_65_ * f_53_ + ((Class247) this).aFloat2629 * f_56_);
		((Class247) this).aFloat2629 = (f_64_ * f_51_ + f_65_ * f_54_ + ((Class247) this).aFloat2629 * f_57_);
	}

	public void method2463(float f, float f_66_, float f_67_) {
		((Class247) this).aFloat2618 = f;
		((Class247) this).aFloat2620 = 0.0F;
		((Class247) this).aFloat2626 = 0.0F;
		((Class247) this).aFloat2627 = 0.0F;
		((Class247) this).aFloat2619 = 0.0F;
		((Class247) this).aFloat2622 = f_66_;
		((Class247) this).aFloat2625 = 0.0F;
		((Class247) this).aFloat2628 = 0.0F;
		((Class247) this).aFloat2617 = 0.0F;
		((Class247) this).aFloat2623 = 0.0F;
		((Class247) this).aFloat2624 = f_67_;
		((Class247) this).aFloat2629 = 0.0F;
	}

	public void method2464(Class244 class244) {
		method2461(class244.aFloat2608, class244.aFloat2612, class244.aFloat2613, class244.aFloat2614);
	}

	public void method2465(float f, float f_68_, float f_69_, float[] fs) {
		fs[0] = (((Class247) this).aFloat2618 * f + ((Class247) this).aFloat2620 * f_68_ + ((Class247) this).aFloat2626 * f_69_ + ((Class247) this).aFloat2627);
		fs[1] = (((Class247) this).aFloat2619 * f + ((Class247) this).aFloat2622 * f_68_ + ((Class247) this).aFloat2625 * f_69_ + ((Class247) this).aFloat2628);
		fs[2] = (((Class247) this).aFloat2617 * f + ((Class247) this).aFloat2623 * f_68_ + ((Class247) this).aFloat2624 * f_69_ + ((Class247) this).aFloat2629);
	}

	public void method2466(Class260 class260) {
		method2474(class260.aFloat2716, class260.aFloat2715, class260.aFloat2711);
	}

	public void method2467(Class247 class247_70_) {
		float f = ((Class247) this).aFloat2618;
		float f_71_ = ((Class247) this).aFloat2619;
		float f_72_ = ((Class247) this).aFloat2620;
		float f_73_ = ((Class247) this).aFloat2622;
		float f_74_ = ((Class247) this).aFloat2626;
		float f_75_ = ((Class247) this).aFloat2625;
		float f_76_ = ((Class247) this).aFloat2627;
		float f_77_ = ((Class247) this).aFloat2628;
		float f_78_ = ((Class247) this).aFloat2617;
		float f_79_ = ((Class247) this).aFloat2623;
		float f_80_ = ((Class247) this).aFloat2624;
		float f_81_ = ((Class247) this).aFloat2629;
		((Class247) this).aFloat2618 = (f * ((Class247) class247_70_).aFloat2618 + f_71_ * ((Class247) class247_70_).aFloat2620 + f_78_ * ((Class247) class247_70_).aFloat2626);
		((Class247) this).aFloat2619 = (f * ((Class247) class247_70_).aFloat2619 + f_71_ * ((Class247) class247_70_).aFloat2622 + f_78_ * ((Class247) class247_70_).aFloat2625);
		((Class247) this).aFloat2617 = (f * ((Class247) class247_70_).aFloat2617 + f_71_ * ((Class247) class247_70_).aFloat2623 + f_78_ * ((Class247) class247_70_).aFloat2624);
		((Class247) this).aFloat2620 = (f_72_ * ((Class247) class247_70_).aFloat2618 + f_73_ * ((Class247) class247_70_).aFloat2620 + f_79_ * ((Class247) class247_70_).aFloat2626);
		((Class247) this).aFloat2622 = (f_72_ * ((Class247) class247_70_).aFloat2619 + f_73_ * ((Class247) class247_70_).aFloat2622 + f_79_ * ((Class247) class247_70_).aFloat2625);
		((Class247) this).aFloat2623 = (f_72_ * ((Class247) class247_70_).aFloat2617 + f_73_ * ((Class247) class247_70_).aFloat2623 + f_79_ * ((Class247) class247_70_).aFloat2624);
		((Class247) this).aFloat2626 = (f_74_ * ((Class247) class247_70_).aFloat2618 + f_75_ * ((Class247) class247_70_).aFloat2620 + f_80_ * ((Class247) class247_70_).aFloat2626);
		((Class247) this).aFloat2625 = (f_74_ * ((Class247) class247_70_).aFloat2619 + f_75_ * ((Class247) class247_70_).aFloat2622 + f_80_ * ((Class247) class247_70_).aFloat2625);
		((Class247) this).aFloat2624 = (f_74_ * ((Class247) class247_70_).aFloat2617 + f_75_ * ((Class247) class247_70_).aFloat2623 + f_80_ * ((Class247) class247_70_).aFloat2624);
		((Class247) this).aFloat2627 = (f_76_ * ((Class247) class247_70_).aFloat2618 + f_77_ * ((Class247) class247_70_).aFloat2620 + f_81_ * ((Class247) class247_70_).aFloat2626 + ((Class247) class247_70_).aFloat2627);
		((Class247) this).aFloat2628 = (f_76_ * ((Class247) class247_70_).aFloat2619 + f_77_ * ((Class247) class247_70_).aFloat2622 + f_81_ * ((Class247) class247_70_).aFloat2625 + ((Class247) class247_70_).aFloat2628);
		((Class247) this).aFloat2629 = (f_76_ * ((Class247) class247_70_).aFloat2617 + f_77_ * ((Class247) class247_70_).aFloat2623 + f_81_ * ((Class247) class247_70_).aFloat2624 + ((Class247) class247_70_).aFloat2629);
	}

	public void method2468(float f, float f_82_, float f_83_) {
		((Class247) this).aFloat2618 *= f;
		((Class247) this).aFloat2620 *= f;
		((Class247) this).aFloat2626 *= f;
		((Class247) this).aFloat2627 *= f;
		((Class247) this).aFloat2619 *= f_82_;
		((Class247) this).aFloat2622 *= f_82_;
		((Class247) this).aFloat2625 *= f_82_;
		((Class247) this).aFloat2628 *= f_82_;
		((Class247) this).aFloat2617 *= f_83_;
		((Class247) this).aFloat2623 *= f_83_;
		((Class247) this).aFloat2624 *= f_83_;
		((Class247) this).aFloat2629 *= f_83_;
	}

	public void method2469(float f, float f_84_, float f_85_, float[] fs) {
		f -= ((Class247) this).aFloat2627;
		f_84_ -= ((Class247) this).aFloat2628;
		f_85_ -= ((Class247) this).aFloat2629;
		fs[0] = (float) (int) (((Class247) this).aFloat2618 * f + ((Class247) this).aFloat2619 * f_84_ + ((Class247) this).aFloat2617 * f_85_);
		fs[1] = (float) (int) (((Class247) this).aFloat2620 * f + ((Class247) this).aFloat2622 * f_84_ + ((Class247) this).aFloat2623 * f_85_);
		fs[2] = (float) (int) (((Class247) this).aFloat2626 * f + ((Class247) this).aFloat2625 * f_84_ + ((Class247) this).aFloat2624 * f_85_);
	}

	public void method2470(float[] fs) {
		float f = fs[0] - ((Class247) this).aFloat2627;
		float f_86_ = fs[1] - ((Class247) this).aFloat2628;
		float f_87_ = fs[2] - ((Class247) this).aFloat2629;
		fs[0] = (float) (int) (((Class247) this).aFloat2618 * f + ((Class247) this).aFloat2619 * f_86_ + ((Class247) this).aFloat2617 * f_87_);
		fs[1] = (float) (int) (((Class247) this).aFloat2620 * f + ((Class247) this).aFloat2622 * f_86_ + ((Class247) this).aFloat2623 * f_87_);
		fs[2] = (float) (int) (((Class247) this).aFloat2626 * f + ((Class247) this).aFloat2625 * f_86_ + ((Class247) this).aFloat2624 * f_87_);
	}

	public void method2471(float[] fs) {
		float f = fs[0];
		float f_88_ = fs[1];
		float f_89_ = fs[2];
		fs[0] = (((Class247) this).aFloat2618 * f + ((Class247) this).aFloat2619 * f_88_ + ((Class247) this).aFloat2617 * f_89_);
		fs[1] = (((Class247) this).aFloat2620 * f + ((Class247) this).aFloat2622 * f_88_ + ((Class247) this).aFloat2623 * f_89_);
		fs[2] = (((Class247) this).aFloat2626 * f + ((Class247) this).aFloat2625 * f_88_ + ((Class247) this).aFloat2624 * f_89_);
	}

	public float[] method2472(float[] fs) {
		fs[0] = ((Class247) this).aFloat2627;
		fs[1] = ((Class247) this).aFloat2628;
		fs[2] = ((Class247) this).aFloat2629;
		return fs;
	}

	public void method2473(float f, float f_90_, float f_91_, float f_92_) {
		float f_93_ = (float) Math.cos((double) f_92_);
		float f_94_ = (float) Math.sin((double) f_92_);
		((Class247) this).aFloat2618 = f_93_ + f * f * (1.0F - f_93_);
		((Class247) this).aFloat2619 = f_91_ * f_94_ + f_90_ * f * (1.0F - f_93_);
		((Class247) this).aFloat2617 = -f_90_ * f_94_ + f_91_ * f * (1.0F - f_93_);
		((Class247) this).aFloat2620 = -f_91_ * f_94_ + f * f_90_ * (1.0F - f_93_);
		((Class247) this).aFloat2622 = f_93_ + f_90_ * f_90_ * (1.0F - f_93_);
		((Class247) this).aFloat2623 = f * f_94_ + f_91_ * f_90_ * (1.0F - f_93_);
		((Class247) this).aFloat2626 = f_90_ * f_94_ + f * f_91_ * (1.0F - f_93_);
		((Class247) this).aFloat2625 = -f * f_94_ + f_90_ * f_91_ * (1.0F - f_93_);
		((Class247) this).aFloat2624 = f_93_ + f_91_ * f_91_ * (1.0F - f_93_);
		((Class247) this).aFloat2629 = 0.0F;
		((Class247) this).aFloat2628 = 0.0F;
		((Class247) this).aFloat2627 = 0.0F;
	}

	public void method2474(float f, float f_95_, float f_96_) {
		((Class247) this).aFloat2627 += f;
		((Class247) this).aFloat2628 += f_95_;
		((Class247) this).aFloat2629 += f_96_;
	}

	public void method2475(int i, int i_97_, int i_98_, float f, float f_99_, float f_100_) {
		if (i != 0) {
			float f_101_ = Class256.aFloatArray2666[i & 0x3fff];
			float f_102_ = Class256.aFloatArray2665[i & 0x3fff];
			((Class247) this).aFloat2624 = 1.0F;
			((Class247) this).aFloat2625 = 0.0F;
			((Class247) this).aFloat2626 = 0.0F;
			((Class247) this).aFloat2623 = 0.0F;
			((Class247) this).aFloat2617 = 0.0F;
			((Class247) this).aFloat2618 = 2.0F * f_101_ * (float) i_97_;
			((Class247) this).aFloat2622 = 2.0F * f_101_ * (float) i_98_;
			((Class247) this).aFloat2619 = 2.0F * f_102_ * (float) i_97_;
			((Class247) this).aFloat2620 = -2.0F * f_102_ * (float) i_98_;
			((Class247) this).aFloat2627 = (float) (2 * i_97_) * (0.5F * f_102_ - 0.5F * f_101_) + f;
			((Class247) this).aFloat2628 = ((float) (2 * i_98_) * (-0.5F * f_102_ - 0.5F * f_101_) + f_99_);
			((Class247) this).aFloat2629 = f_100_;
		} else {
			((Class247) this).aFloat2625 = 0.0F;
			((Class247) this).aFloat2626 = 0.0F;
			((Class247) this).aFloat2623 = 0.0F;
			((Class247) this).aFloat2620 = 0.0F;
			((Class247) this).aFloat2617 = 0.0F;
			((Class247) this).aFloat2619 = 0.0F;
			((Class247) this).aFloat2618 = (float) (2 * i_97_);
			((Class247) this).aFloat2622 = (float) (2 * i_98_);
			((Class247) this).aFloat2624 = 1.0F;
			((Class247) this).aFloat2627 = f - (float) i_97_;
			((Class247) this).aFloat2628 = f_99_ - (float) i_98_;
			((Class247) this).aFloat2629 = f_100_;
		}
	}

	public void method2476(float f, float f_103_, float f_104_) {
		((Class247) this).aFloat2625 = 0.0F;
		((Class247) this).aFloat2626 = 0.0F;
		((Class247) this).aFloat2623 = 0.0F;
		((Class247) this).aFloat2620 = 0.0F;
		((Class247) this).aFloat2617 = 0.0F;
		((Class247) this).aFloat2619 = 0.0F;
		((Class247) this).aFloat2624 = 1.0F;
		((Class247) this).aFloat2622 = 1.0F;
		((Class247) this).aFloat2618 = 1.0F;
		((Class247) this).aFloat2627 = f;
		((Class247) this).aFloat2628 = f_103_;
		((Class247) this).aFloat2629 = f_104_;
	}

	public void method2477(float f, float f_105_, float f_106_, float f_107_, float f_108_, float f_109_, float f_110_, float f_111_, float f_112_) {
		((Class247) this).aFloat2618 = f;
		((Class247) this).aFloat2620 = f_107_;
		((Class247) this).aFloat2626 = f_110_;
		((Class247) this).aFloat2627 = 0.0F;
		((Class247) this).aFloat2619 = f_105_;
		((Class247) this).aFloat2622 = f_108_;
		((Class247) this).aFloat2625 = f_111_;
		((Class247) this).aFloat2628 = 0.0F;
		((Class247) this).aFloat2617 = f_106_;
		((Class247) this).aFloat2623 = f_109_;
		((Class247) this).aFloat2624 = f_112_;
		((Class247) this).aFloat2629 = 0.0F;
	}

	public void method2478(Class247 class247_113_, Class247 class247_114_) {
		((Class247) this).aFloat2618 = ((((Class247) class247_113_).aFloat2618 * ((Class247) class247_114_).aFloat2618) + (((Class247) class247_113_).aFloat2619 * ((Class247) class247_114_).aFloat2620) + (((Class247) class247_113_).aFloat2617 * ((Class247) class247_114_).aFloat2626));
		((Class247) this).aFloat2619 = ((((Class247) class247_113_).aFloat2618 * ((Class247) class247_114_).aFloat2619) + (((Class247) class247_113_).aFloat2619 * ((Class247) class247_114_).aFloat2622) + (((Class247) class247_113_).aFloat2617 * ((Class247) class247_114_).aFloat2625));
		((Class247) this).aFloat2617 = ((((Class247) class247_113_).aFloat2618 * ((Class247) class247_114_).aFloat2617) + (((Class247) class247_113_).aFloat2619 * ((Class247) class247_114_).aFloat2623) + (((Class247) class247_113_).aFloat2617 * ((Class247) class247_114_).aFloat2624));
		((Class247) this).aFloat2620 = ((((Class247) class247_113_).aFloat2620 * ((Class247) class247_114_).aFloat2618) + (((Class247) class247_113_).aFloat2622 * ((Class247) class247_114_).aFloat2620) + (((Class247) class247_113_).aFloat2623 * ((Class247) class247_114_).aFloat2626));
		((Class247) this).aFloat2622 = ((((Class247) class247_113_).aFloat2620 * ((Class247) class247_114_).aFloat2619) + (((Class247) class247_113_).aFloat2622 * ((Class247) class247_114_).aFloat2622) + (((Class247) class247_113_).aFloat2623 * ((Class247) class247_114_).aFloat2625));
		((Class247) this).aFloat2623 = ((((Class247) class247_113_).aFloat2620 * ((Class247) class247_114_).aFloat2617) + (((Class247) class247_113_).aFloat2622 * ((Class247) class247_114_).aFloat2623) + (((Class247) class247_113_).aFloat2623 * ((Class247) class247_114_).aFloat2624));
		((Class247) this).aFloat2626 = ((((Class247) class247_113_).aFloat2626 * ((Class247) class247_114_).aFloat2618) + (((Class247) class247_113_).aFloat2625 * ((Class247) class247_114_).aFloat2620) + (((Class247) class247_113_).aFloat2624 * ((Class247) class247_114_).aFloat2626));
		((Class247) this).aFloat2625 = ((((Class247) class247_113_).aFloat2626 * ((Class247) class247_114_).aFloat2619) + (((Class247) class247_113_).aFloat2625 * ((Class247) class247_114_).aFloat2622) + (((Class247) class247_113_).aFloat2624 * ((Class247) class247_114_).aFloat2625));
		((Class247) this).aFloat2624 = ((((Class247) class247_113_).aFloat2626 * ((Class247) class247_114_).aFloat2617) + (((Class247) class247_113_).aFloat2625 * ((Class247) class247_114_).aFloat2623) + (((Class247) class247_113_).aFloat2624 * ((Class247) class247_114_).aFloat2624));
		((Class247) this).aFloat2627 = ((((Class247) class247_113_).aFloat2627 * ((Class247) class247_114_).aFloat2618) + (((Class247) class247_113_).aFloat2628 * ((Class247) class247_114_).aFloat2620) + (((Class247) class247_113_).aFloat2629 * ((Class247) class247_114_).aFloat2626) + ((Class247) class247_114_).aFloat2627);
		((Class247) this).aFloat2628 = ((((Class247) class247_113_).aFloat2627 * ((Class247) class247_114_).aFloat2619) + (((Class247) class247_113_).aFloat2628 * ((Class247) class247_114_).aFloat2622) + (((Class247) class247_113_).aFloat2629 * ((Class247) class247_114_).aFloat2625) + ((Class247) class247_114_).aFloat2628);
		((Class247) this).aFloat2629 = ((((Class247) class247_113_).aFloat2627 * ((Class247) class247_114_).aFloat2617) + (((Class247) class247_113_).aFloat2628 * ((Class247) class247_114_).aFloat2623) + (((Class247) class247_113_).aFloat2629 * ((Class247) class247_114_).aFloat2624) + ((Class247) class247_114_).aFloat2629);
	}

	public Class247() {
		method2460();
	}
}
