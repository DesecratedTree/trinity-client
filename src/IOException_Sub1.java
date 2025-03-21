/* IOException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class IOException_Sub1 extends IOException {
	IOException_Sub1(String string) {
		super(string);
	}

	static final void method339(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1333 = Class288.method2886(string, class430, 1314260191);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akm.od(").append(')').toString());
		}
	}
}
