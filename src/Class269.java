/* Class269 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jaggl.OpenGL;

public class Class269 {
	Class269() throws Throwable {
		throw new Error();
	}

	public static Class_ra method2664(Canvas canvas, Interface_ma interface_ma, IndexTable class280, int i) {
		Class_ra_Sub2_Sub1 class_ra_sub2_sub1;
		try {
			boolean bool = Class_ra_Sub2.method4892();
			if (!bool)
				throw new RuntimeException("");
			if (!Class489.method6063(-1102372689).method327("jaggl", -35742694))
				throw new RuntimeException("");
			Class377.method4375(canvas, -1433851980);
			OpenGL opengl = new OpenGL();
			long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
			if (l == 0L)
				throw new RuntimeException("");
			Class_ra_Sub2_Sub1 class_ra_sub2_sub1_0_ = new Class_ra_Sub2_Sub1(opengl, canvas, l, interface_ma, class280, i);
			class_ra_sub2_sub1_0_.method4910();
			class_ra_sub2_sub1 = class_ra_sub2_sub1_0_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
		return class_ra_sub2_sub1;
	}

	public static Class_ra method2665(Canvas canvas, Interface_ma interface_ma, IndexTable class280, int i) {
		Class_ra_Sub2_Sub1 class_ra_sub2_sub1;
		try {
			boolean bool = Class_ra_Sub2.method4892();
			if (!bool)
				throw new RuntimeException("");
			if (!Class489.method6063(-1102372689).method327("jaggl", -146321456))
				throw new RuntimeException("");
			Class377.method4375(canvas, -1433851980);
			OpenGL opengl = new OpenGL();
			long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
			if (l == 0L)
				throw new RuntimeException("");
			Class_ra_Sub2_Sub1 class_ra_sub2_sub1_1_ = new Class_ra_Sub2_Sub1(opengl, canvas, l, interface_ma, class280, i);
			class_ra_sub2_sub1_1_.method4910();
			class_ra_sub2_sub1 = class_ra_sub2_sub1_1_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
		return class_ra_sub2_sub1;
	}
}
