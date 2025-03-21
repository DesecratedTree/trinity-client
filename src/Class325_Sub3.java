/* Class325_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class325_Sub3 extends Class325 {
	public Class325_Sub3 aClass325_Sub3_7482;
	public Class325_Sub3 aClass325_Sub3_7483;
	public static int anInt7484;

	public void method3216(byte i) {
		try {
			if (null != aClass325_Sub3_7482) {
				aClass325_Sub3_7482.aClass325_Sub3_7483 = aClass325_Sub3_7483;
				aClass325_Sub3_7483.aClass325_Sub3_7482 = aClass325_Sub3_7482;
				aClass325_Sub3_7483 = null;
				aClass325_Sub3_7482 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acg.j(").append(')').toString());
		}
	}
}
