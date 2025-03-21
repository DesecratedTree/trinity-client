/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class Gfx {
	public int anInt572;
	public Class477 aClass477_573;
	public int height;
	public int anInt575;
	public int id = 1988601901;
	protected static Class323 aClass323_577;
	static int anInt578;

	Gfx(Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1) {
		aClass477_573 = new Class477_Sub2(class432_sub1_sub1_sub1, false);
	}

	static final void method788(IComponentDefinitions iComponentDefinitions, Class430 class430, int i) {
		try {
			Class524 class524 = iComponentDefinitions.method1405(Class219.aClass230_2183, client.anInterface12_9243, 2130672865);
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Point point = class524.method6242(iComponentDefinitions.aString1266, iComponentDefinitions.anInt1210 * -681123409, -427156389 * iComponentDefinitions.anInt1267, i_0_, Class57.aClass61Array6599, 1054666483);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = point.x;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = point.y;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cr.qh(").append(')').toString());
		}
	}

	static final void method789(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			iComponentDefinitions.aString1194 = (String) (((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 -= 2087905371) * -1378875437)]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cr.jo(").append(')').toString());
		}
	}
}
