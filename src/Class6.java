/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Class6 {
	Class247 aClass247_83;
	float[] aFloatArray84;
	static float aFloat85 = 255.0F;
	boolean aBoolean86;
	float aFloat87 = 0.85F;
	int anInt88;
	float[] aFloatArray89;
	int anInt90;
	boolean aBoolean91;
	int anInt92;
	int anInt93;
	Class38 aClass38_94;
	Class249 aClass249_95;
	int[] anIntArray96;
	float[] aFloatArray97;
	Class247 aClass247_98;
	Class249 aClass249_99;
	Class249 aClass249_100;
	Runnable aRunnable101;
	Class387_Sub3[] aClass387_Sub3Array102;
	float[] aFloatArray103;
	float aFloat104 = 1.0F - ((Class6) this).aFloat87;
	float[] aFloatArray105;
	int[] anIntArray106;
	int[] anIntArray107;
	int[] anIntArray108;
	int[] anIntArray109;
	int[] anIntArray110;
	boolean aBoolean111;
	float aFloat112;
	float aFloat113;
	float aFloat114;
	float aFloat115;
	float aFloat116;
	float[] aFloatArray117;
	float aFloat118;
	int anInt119;
	float[] aFloatArray120;
	Class387_Sub3[] aClass387_Sub3Array121;
	float[] aFloatArray122;
	int[] anIntArray123;
	float aFloat124;
	float[] aFloatArray125;
	float[] aFloatArray126;
	float[] aFloatArray127;
	Class_ra_Sub3 aClass_ra_Sub3_128;

	void method401(int i) {
		try {
			((Class6) this).aClass38_94 = new Class38(((Class6) this).aClass_ra_Sub3_128, this);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ag.r(").append(')').toString());
		}
	}

	Class6(Class_ra_Sub3 class_ra_sub3) {
		((Class6) this).anInt88 = 0;
		((Class6) this).anInt90 = 0;
		((Class6) this).aBoolean91 = false;
		((Class6) this).anInt92 = 0;
		((Class6) this).anInt93 = 0;
		((Class6) this).aBoolean111 = true;
		((Class6) this).aClass249_95 = new Class249();
		((Class6) this).aClass247_83 = new Class247();
		((Class6) this).aClass247_98 = new Class247();
		((Class6) this).aClass249_99 = new Class249();
		((Class6) this).aClass249_100 = new Class249();
		((Class6) this).anIntArray123 = new int[Class387_Sub3.anInt8222];
		((Class6) this).aFloatArray117 = new float[Class387_Sub3.anInt8222];
		((Class6) this).aFloatArray103 = new float[Class387_Sub3.anInt8222];
		((Class6) this).aFloatArray120 = new float[Class387_Sub3.anInt8222];
		((Class6) this).aFloatArray105 = new float[Class387_Sub3.anInt8222];
		((Class6) this).anIntArray106 = new int[8];
		((Class6) this).anIntArray107 = new int[8];
		((Class6) this).anIntArray108 = new int[8];
		((Class6) this).anIntArray109 = new int[10000];
		((Class6) this).anIntArray110 = new int[10000];
		((Class6) this).aFloat116 = 1.0F;
		((Class6) this).aFloat124 = 0.0F;
		((Class6) this).aFloat118 = 1.0F;
		((Class6) this).aFloatArray97 = new float[2];
		((Class6) this).aClass387_Sub3Array121 = new Class387_Sub3[7];
		((Class6) this).aClass387_Sub3Array102 = new Class387_Sub3[7];
		((Class6) this).aFloatArray84 = new float[64];
		((Class6) this).aFloatArray122 = new float[64];
		((Class6) this).aFloatArray125 = new float[64];
		((Class6) this).aFloatArray126 = new float[64];
		((Class6) this).aFloatArray127 = new float[64];
		((Class6) this).aFloatArray89 = new float[3];
		((Class6) this).aClass_ra_Sub3_128 = class_ra_sub3;
		((Class6) this).aClass38_94 = new Class38(class_ra_sub3, this);
		for (int i = 0; i < 7; i++) {
			((Class6) this).aClass387_Sub3Array121[i] = new Class387_Sub3(((Class6) this).aClass_ra_Sub3_128);
			((Class6) this).aClass387_Sub3Array102[i] = new Class387_Sub3(((Class6) this).aClass_ra_Sub3_128);
		}
		((Class6) this).anIntArray96 = new int[Class387_Sub3.anInt8166];
		for (int i = 0; i < Class387_Sub3.anInt8166; i++)
			((Class6) this).anIntArray96[i] = -1;
	}

	void method402(Runnable runnable, byte i) {
		try {
			((Class6) this).aRunnable101 = runnable;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ag.j(").append(')').toString());
		}
	}

	public static final void method403(int i, String string, Color color, Color color_0_, Color color_1_, int i_2_) {
		try {
			do {
				try {
					Graphics graphics = Class475.aCanvas5700.getGraphics();
					if (Class338.aFont3374 == null)
						Class338.aFont3374 = new Font("Helvetica", 1, 13);
					if (color == null)
						color = new Color(140, 17, 17);
					if (color_0_ == null)
						color_0_ = new Color(140, 17, 17);
					if (color_1_ == null)
						color_1_ = new Color(255, 255, 255);
					try {
						if (null == Class464_Sub18.anImage8701)
							Class464_Sub18.anImage8701 = (Class475.aCanvas5700.createImage(Class300.anInt3058 * -1969079741, -1548608507 * Class146.anInt1615));
						Graphics graphics_3_ = Class464_Sub18.anImage8701.getGraphics();
						graphics_3_.setColor(Color.black);
						graphics_3_.fillRect(0, 0, Class300.anInt3058 * -1969079741, Class146.anInt1615 * -1548608507);
						int i_4_ = -1969079741 * Class300.anInt3058 / 2 - 152;
						int i_5_ = -1548608507 * Class146.anInt1615 / 2 - 18;
						graphics_3_.setColor(color_0_);
						graphics_3_.drawRect(i_4_, i_5_, 303, 33);
						graphics_3_.setColor(color);
						graphics_3_.fillRect(2 + i_4_, 2 + i_5_, i * 3, 30);
						graphics_3_.setColor(Color.black);
						graphics_3_.drawRect(1 + i_4_, 1 + i_5_, 301, 31);
						graphics_3_.fillRect(i_4_ + 2 + i * 3, 2 + i_5_, 300 - i * 3, 30);
						graphics_3_.setFont(Class338.aFont3374);
						graphics_3_.setColor(color_1_);
						graphics_3_.drawString(string, i_4_ + ((304 - string.length() * 6) / 2), 22 + i_5_);
						if (null != Class332.aString6613) {
							graphics_3_.setFont(Class338.aFont3374);
							graphics_3_.setColor(color_1_);
							graphics_3_.drawString(Class332.aString6613, (-1969079741 * Class300.anInt3058 / 2 - Class332.aString6613.length() * 6 / 2), Class146.anInt1615 * -1548608507 / 2 - 26);
						}
						graphics.drawImage(Class464_Sub18.anImage8701, 0, 0, null);
					} catch (Exception exception) {
						graphics.setColor(Color.black);
						graphics.fillRect(0, 0, -1969079741 * Class300.anInt3058, Class146.anInt1615 * -1548608507);
						int i_6_ = -1969079741 * Class300.anInt3058 / 2 - 152;
						int i_7_ = -1548608507 * Class146.anInt1615 / 2 - 18;
						graphics.setColor(color_0_);
						graphics.drawRect(i_6_, i_7_, 303, 33);
						graphics.setColor(color);
						graphics.fillRect(2 + i_6_, i_7_ + 2, i * 3, 30);
						graphics.setColor(Color.black);
						graphics.drawRect(i_6_ + 1, i_7_ + 1, 301, 31);
						graphics.fillRect(i_6_ + 2 + 3 * i, i_7_ + 2, 300 - i * 3, 30);
						graphics.setFont(Class338.aFont3374);
						graphics.setColor(color_1_);
						if (null != Class332.aString6613) {
							graphics.setFont(Class338.aFont3374);
							graphics.setColor(color_1_);
							graphics.drawString(Class332.aString6613, (Class300.anInt3058 * -1969079741 / 2 - Class332.aString6613.length() * 6 / 2), -1548608507 * Class146.anInt1615 / 2 - 26);
						}
						graphics.drawString(string, i_6_ + ((304 - string.length() * 6) / 2), 22 + i_7_);
						break;
					}
					break;
				} catch (Exception exception) {
					Class475.aCanvas5700.repaint();
					break;
				}
			} while (false);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ag.aj(").append(')').toString());
		}
	}

	static final void method404(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class439.method5599(iComponentDefinitions, class120, false, 2, class430, (byte) 34);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ag.ho(").append(')').toString());
		}
	}

	static final void method405(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 124953757;
			int i_8_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_9_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			int i_10_ = (((Class430) class430).anIntArray4387[2 + ((Class430) class430).anInt4376 * 1632830751]);
			Class498.method6110(3, i_8_ << 16 | i_9_, i_10_, "", (byte) -60);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ag.anl(").append(')').toString());
		}
	}

	public static void method406(Class325 class325, Class325 class325_11_, byte i) {
		try {
			if (class325.aClass325_3315 != null)
				class325.method3204(-661346054);
			class325.aClass325_3315 = class325_11_;
			class325.aClass325_3314 = class325_11_.aClass325_3314;
			class325.aClass325_3315.aClass325_3314 = class325;
			class325.aClass325_3314.aClass325_3315 = class325;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ag.p(").append(')').toString());
		}
	}

	static final void method407(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= -1140096999;
			int i_12_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_13_ = ((((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]) << 1);
			int i_14_ = (((Class430) class430).anIntArray4387[2 + ((Class430) class430).anInt4376 * 1632830751]);
			int i_15_ = (((Class430) class430).anIntArray4387[3 + ((Class430) class430).anInt4376 * 1632830751]);
			int i_16_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 4]);
			int i_17_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 5]);
			int i_18_ = (((Class430) class430).anIntArray4387[6 + 1632830751 * ((Class430) class430).anInt4376]);
			if (i_12_ >= 0 && i_12_ < 2 && client.anIntArrayArrayArray9082[i_12_] != null && i_13_ >= 0 && i_13_ < client.anIntArrayArrayArray9082[i_12_].length) {
				client.anIntArrayArrayArray9082[i_12_][i_13_] = new int[] { (i_14_ >> 14 & 0x3fff) << 9, i_15_ << 2, (i_14_ & 0x3fff) << 9, i_18_ };
				client.anIntArrayArrayArray9082[i_12_][1 + i_13_] = new int[] { (i_16_ >> 14 & 0x3fff) << 9, i_17_ << 2, (i_16_ & 0x3fff) << 9 };
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ag.afb(").append(')').toString());
		}
	}

	public static void method408(int i, IndexTable class280, int i_19_, int i_20_, int i_21_, boolean bool, int i_22_) {
		try {
			MusicManager.currentState = 1408571369;
			Class110.musicArchive = class280;
			MusicManager.musicId = 717142103 * i_19_;
			MusicManager.musicIndex = i_20_ * 38247865;
			Class288.aClass330_Sub40_Sub2_2955 = null;
			Class121.volume = 1178920319 * i_21_;
			Class268.aBoolean2746 = bool;
			Class457.anInt6843 = -1168308059 * i;
			Class403.aClass111_4138 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ag.n(").append(')').toString());
		}
	}
}
