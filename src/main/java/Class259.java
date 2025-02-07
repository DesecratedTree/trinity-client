

import jaggl.OpenGL;

import java.awt.*;

public class Class259 {
	public static GraphicsToolkit method2455(Canvas canvas, Interface_ma interface_ma, CacheIndex class243, int i) {
		OpenGLToolkit class_ra_sub3_sub1;
		try {
			boolean bool = ModernToolkit.supportsJaclib();
			if (!bool)
				throw new RuntimeException("");
			if (!Class85.method955(124070140).method265("jaggl", 1929575447))
				throw new RuntimeException("");
			Class298_Sub19_Sub3.method3041(canvas, (short) 27333);
			OpenGL opengl = new OpenGL();
			long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
			if (l == 0L)
				throw new RuntimeException("");
			OpenGLToolkit class_ra_sub3_sub1_0_ = new OpenGLToolkit(opengl, canvas, l, interface_ma, class243, i);
			class_ra_sub3_sub1_0_.method5302();
			class_ra_sub3_sub1 = class_ra_sub3_sub1_0_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
		return class_ra_sub3_sub1;
	}

	public static GraphicsToolkit getOpenGLTK(Canvas canvas, Interface_ma interface_ma, CacheIndex class243, int i) {
		OpenGLToolkit class_ra_sub3_sub1;
		try {
			boolean bool = ModernToolkit.supportsJaclib();
			if (!bool)
				throw new RuntimeException("");
			if (!Class85.method955(-1548451136).method265("jaggl", 2093277458))
				throw new RuntimeException("");
			Class298_Sub19_Sub3.method3041(canvas, (short) 29057);
			OpenGL opengl = new OpenGL();
			long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
			if (l == 0L)
				throw new RuntimeException("");
			OpenGLToolkit class_ra_sub3_sub1_1_ = new OpenGLToolkit(opengl, canvas, l, interface_ma, class243, i);
			class_ra_sub3_sub1_1_.method5302();
			class_ra_sub3_sub1 = class_ra_sub3_sub1_1_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
		return class_ra_sub3_sub1;
	}

	public static GraphicsToolkit method2457(Canvas canvas, Interface_ma interface_ma, CacheIndex class243, int i) {
		OpenGLToolkit class_ra_sub3_sub1;
		try {
			boolean bool = ModernToolkit.supportsJaclib();
			if (!bool)
				throw new RuntimeException("");
			if (!Class85.method955(-411038665).method265("jaggl", 997775077))
				throw new RuntimeException("");
			Class298_Sub19_Sub3.method3041(canvas, (short) 12847);
			OpenGL opengl = new OpenGL();
			long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
			if (l == 0L)
				throw new RuntimeException("");
			OpenGLToolkit class_ra_sub3_sub1_2_ = new OpenGLToolkit(opengl, canvas, l, interface_ma, class243, i);
			class_ra_sub3_sub1_2_.method5302();
			class_ra_sub3_sub1 = class_ra_sub3_sub1_2_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
		return class_ra_sub3_sub1;
	}

	Class259() throws Throwable {
		throw new Error();
	}
}
