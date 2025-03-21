/* FileFilter_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

import javax.swing.filechooser.FileFilter;

public class FileFilter_Sub1 extends FileFilter {
	Class19 aClass19_6451;
	Class19 aClass19_6452;

	public String getDescription() {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("agz.getDescription(").append(')').toString());
		}
	}

	public boolean accept(File file) {
		try {
			if (((FileFilter_Sub1) this).aClass19_6451.method456(876607843) && file.isDirectory())
				return true;
			if (!((FileFilter_Sub1) this).aClass19_6451.method456(-402144774))
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("agz.accept(").append(')').toString());
		}
	}

	FileFilter_Sub1(Class19 class19, Class19 class19_0_) {
		((FileFilter_Sub1) this).aClass19_6451 = class19_0_;
	}

	static void method6487(int i) {
		try {
			if (null != Class333.aClass326_3362) {
				Class260 class260 = (Class260.method2549(Class263_Sub2.myPlayer.method5346().aClass260_2606));
				Class381 class381 = client.aClass304_9030.method3022(423449266);
				class260.aFloat2716 += (float) (class381.gameSceneBaseX * -1261027839 << 9);
				class260.aFloat2711 += (float) (class381.gameSceneBaseY * -1542584207 << 9);
				class260.method2579((float) (594097599 * (((Class326) Class333.aClass326_3362).anInt3319)), class260.aFloat2715, (float) (((Class326) Class333.aClass326_3362).anInt3317 * -1108123167));
				float f = class260.method2565();
				class260.method2550();
				float f_1_ = 0.0F;
				if (f < (float) (-378040947 * (((Class326) Class333.aClass326_3362).anInt3318)))
					f_1_ = 1.0F;
				else if (f > (float) (1148779729 * (((Class326) Class333.aClass326_3362).anInt3316)))
					f_1_ = 0.0F;
				else {
					f -= (float) (-378040947 * (((Class326) Class333.aClass326_3362).anInt3318));
					f_1_ = 1.0F - f / (float) (179466225 * (((Class326) Class333.aClass326_3362).anInt3320));
				}
				Class374.method4341((int) (256.0F * f_1_), (short) 7091);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("agz.g(").append(')').toString());
		}
	}
}
