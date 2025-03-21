/* Class49_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class49_Sub2 extends Class49 {
	static String aString7038 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
	static String aString7039 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
	boolean aBoolean7040 = false;
	static String aString7041 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
	boolean aBoolean7042;
	static String aString7043 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
	boolean aBoolean7044;
	Class29 aClass29_7045;
	Class36_Sub1 aClass36_Sub1_7046;
	boolean aBoolean7047;
	Class29 aClass29_7048;
	Class29 aClass29_7049;
	Class29 aClass29_7050;
	static float[] aFloatArray7051 = { 0.0F, -1.0F, 0.0F, 0.0F };

	void method606(int i, int i_0_) {
		/* empty */
	}

	boolean method601() {
		return ((Class49_Sub2) this).aBoolean7042;
	}

	void method623() {
		if (((Class49_Sub2) this).aBoolean7044) {
			float f = (((Class_ra_Sub1) ((Class49_Sub2) this).aClass_ra_Sub1_478).aFloat8344);
			float f_1_ = (((Class_ra_Sub1) ((Class49_Sub2) this).aClass_ra_Sub1_478).aFloat8343);
			float f_2_ = f - (f - f_1_) * 0.125F;
			float f_3_ = f - (f - f_1_) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_3_, f_2_, 256.0F / (float) ((((Class_ra_Sub1) ((Class49_Sub2) this).aClass_ra_Sub1_478).aClass77_8391.anInt650) * -348036733), (float) ((((Class_ra_Sub1) ((Class49_Sub2) this).aClass_ra_Sub1_478).aClass77_8391.anInt651) * -892945375) / 255.0F);
			((Class49_Sub2) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub2) this).aClass_ra_Sub1_478.method4849((((Class_ra_Sub1) ((Class49_Sub2) this).aClass_ra_Sub1_478).aClass77_8391.anInt652) * -576105833);
			((Class49_Sub2) this).aClass_ra_Sub1_478.method4843(0);
		}
	}

	void method608(boolean bool) {
		/* empty */
	}

	void method604() {
		if (((Class49_Sub2) this).aBoolean7044) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			((Class49_Sub2) this).aBoolean7044 = false;
		}
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4843(1);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4844(null);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4831(8448, 8448);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(0, 5890, 768);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(2, 34166, 770);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4848(0, 5890, 770);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4843(0);
		if (((Class49_Sub2) this).aBoolean7040) {
			((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(0, 5890, 768);
			((Class49_Sub2) this).aClass_ra_Sub1_478.method4848(0, 5890, 770);
			((Class49_Sub2) this).aBoolean7040 = false;
		}
	}

	void method624() {
		Class249 class249 = (((Class_ra_Sub1) ((Class49_Sub2) this).aClass_ra_Sub1_478).aClass249_8378);
		if (((Class49_Sub2) this).aBoolean7047)
			OpenGL.glBindProgramARB(34336, ((((Class_ra_Sub1) ((Class49_Sub2) this).aClass_ra_Sub1_478).anInt8390) == 2147483647 ? ((Class29) ((Class49_Sub2) this).aClass29_7049).anInt338 : ((Class29) ((Class49_Sub2) this).aClass29_7045).anInt338));
		else
			OpenGL.glBindProgramARB(34336, ((((Class_ra_Sub1) ((Class49_Sub2) this).aClass_ra_Sub1_478).anInt8390) == 2147483647 ? ((Class29) ((Class49_Sub2) this).aClass29_7050).anInt338 : ((Class29) ((Class49_Sub2) this).aClass29_7048).anInt338));
		float f = (float) ((Class_ra_Sub1) ((Class49_Sub2) this).aClass_ra_Sub1_478).anInt8390;
		float f_4_ = class249.aFloatArray2631[4] * f + class249.aFloatArray2631[12];
		float f_5_ = class249.aFloatArray2631[5] * f + class249.aFloatArray2631[13];
		float f_6_ = class249.aFloatArray2631[6] * f + class249.aFloatArray2631[14];
		aFloatArray7051[0] = -class249.aFloatArray2631[4];
		aFloatArray7051[1] = -class249.aFloatArray2631[5];
		aFloatArray7051[2] = -class249.aFloatArray2631[6];
		aFloatArray7051[3] = -(aFloatArray7051[0] * f_4_ + aFloatArray7051[1] * f_5_ + aFloatArray7051[2] * f_6_);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray7051[0], aFloatArray7051[1], aFloatArray7051[2], aFloatArray7051[3]);
		OpenGL.glEnable(34336);
		((Class49_Sub2) this).aBoolean7044 = true;
		method623();
	}

	void method620(int i, int i_7_) {
		/* empty */
	}

	void method619(int i, int i_8_) {
		/* empty */
	}

	void method600(Class36 class36, int i) {
		if (class36 == null) {
			if (!((Class49_Sub2) this).aBoolean7040) {
				((Class49_Sub2) this).aClass_ra_Sub1_478.method4844(((Class_ra_Sub1) ((Class49_Sub2) this).aClass_ra_Sub1_478).aClass36_Sub1_8400);
				((Class49_Sub2) this).aClass_ra_Sub1_478.method4836(1);
				((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(0, 34168, 768);
				((Class49_Sub2) this).aClass_ra_Sub1_478.method4848(0, 34168, 770);
				((Class49_Sub2) this).aBoolean7040 = true;
			}
		} else {
			if (((Class49_Sub2) this).aBoolean7040) {
				((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(0, 5890, 768);
				((Class49_Sub2) this).aClass_ra_Sub1_478.method4848(0, 5890, 770);
				((Class49_Sub2) this).aBoolean7040 = false;
			}
			((Class49_Sub2) this).aClass_ra_Sub1_478.method4844(class36);
			((Class49_Sub2) this).aClass_ra_Sub1_478.method4836(i);
		}
	}

	boolean method605() {
		return ((Class49_Sub2) this).aBoolean7042;
	}

	void method616(Class36 class36, int i) {
		if (class36 == null) {
			if (!((Class49_Sub2) this).aBoolean7040) {
				((Class49_Sub2) this).aClass_ra_Sub1_478.method4844(((Class_ra_Sub1) ((Class49_Sub2) this).aClass_ra_Sub1_478).aClass36_Sub1_8400);
				((Class49_Sub2) this).aClass_ra_Sub1_478.method4836(1);
				((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(0, 34168, 768);
				((Class49_Sub2) this).aClass_ra_Sub1_478.method4848(0, 34168, 770);
				((Class49_Sub2) this).aBoolean7040 = true;
			}
		} else {
			if (((Class49_Sub2) this).aBoolean7040) {
				((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(0, 5890, 768);
				((Class49_Sub2) this).aClass_ra_Sub1_478.method4848(0, 5890, 770);
				((Class49_Sub2) this).aBoolean7040 = false;
			}
			((Class49_Sub2) this).aClass_ra_Sub1_478.method4844(class36);
			((Class49_Sub2) this).aClass_ra_Sub1_478.method4836(i);
		}
	}

	void method602(boolean bool) {
		((Class49_Sub2) this).aBoolean7047 = bool;
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4843(1);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4844(((Class49_Sub2) this).aClass36_Sub1_7046);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4831(34165, 7681);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(0, 34166, 768);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(2, 5890, 770);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4848(0, 34168, 770);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4843(0);
		method624();
	}

	void method610(boolean bool) {
		/* empty */
	}

	void method607(boolean bool) {
		/* empty */
	}

	void method612(boolean bool) {
		/* empty */
	}

	void method613() {
		if (((Class49_Sub2) this).aBoolean7044) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			((Class49_Sub2) this).aBoolean7044 = false;
		}
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4843(1);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4844(null);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4831(8448, 8448);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(0, 5890, 768);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(2, 34166, 770);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4848(0, 5890, 770);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4843(0);
		if (((Class49_Sub2) this).aBoolean7040) {
			((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(0, 5890, 768);
			((Class49_Sub2) this).aClass_ra_Sub1_478.method4848(0, 5890, 770);
			((Class49_Sub2) this).aBoolean7040 = false;
		}
	}

	boolean method611() {
		return ((Class49_Sub2) this).aBoolean7042;
	}

	void method603() {
		if (((Class49_Sub2) this).aBoolean7044) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			((Class49_Sub2) this).aBoolean7044 = false;
		}
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4843(1);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4844(null);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4831(8448, 8448);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(0, 5890, 768);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(2, 34166, 770);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4848(0, 5890, 770);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4843(0);
		if (((Class49_Sub2) this).aBoolean7040) {
			((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(0, 5890, 768);
			((Class49_Sub2) this).aClass_ra_Sub1_478.method4848(0, 5890, 770);
			((Class49_Sub2) this).aBoolean7040 = false;
		}
	}

	void method615(Class36 class36, int i) {
		if (class36 == null) {
			if (!((Class49_Sub2) this).aBoolean7040) {
				((Class49_Sub2) this).aClass_ra_Sub1_478.method4844(((Class_ra_Sub1) ((Class49_Sub2) this).aClass_ra_Sub1_478).aClass36_Sub1_8400);
				((Class49_Sub2) this).aClass_ra_Sub1_478.method4836(1);
				((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(0, 34168, 768);
				((Class49_Sub2) this).aClass_ra_Sub1_478.method4848(0, 34168, 770);
				((Class49_Sub2) this).aBoolean7040 = true;
			}
		} else {
			if (((Class49_Sub2) this).aBoolean7040) {
				((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(0, 5890, 768);
				((Class49_Sub2) this).aClass_ra_Sub1_478.method4848(0, 5890, 770);
				((Class49_Sub2) this).aBoolean7040 = false;
			}
			((Class49_Sub2) this).aClass_ra_Sub1_478.method4844(class36);
			((Class49_Sub2) this).aClass_ra_Sub1_478.method4836(i);
		}
	}

	void method617(int i, int i_9_) {
		/* empty */
	}

	void method618(int i, int i_10_) {
		/* empty */
	}

	void method614() {
		if (((Class49_Sub2) this).aBoolean7044) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			((Class49_Sub2) this).aBoolean7044 = false;
		}
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4843(1);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4844(null);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4831(8448, 8448);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(0, 5890, 768);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(2, 34166, 770);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4848(0, 5890, 770);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4843(0);
		if (((Class49_Sub2) this).aBoolean7040) {
			((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(0, 5890, 768);
			((Class49_Sub2) this).aClass_ra_Sub1_478.method4848(0, 5890, 770);
			((Class49_Sub2) this).aBoolean7040 = false;
		}
	}

	void method609(boolean bool) {
		((Class49_Sub2) this).aBoolean7047 = bool;
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4843(1);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4844(((Class49_Sub2) this).aClass36_Sub1_7046);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4831(34165, 7681);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(0, 34166, 768);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4847(2, 5890, 770);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4848(0, 34168, 770);
		((Class49_Sub2) this).aClass_ra_Sub1_478.method4843(0);
		method624();
	}

	void method621(int i, int i_11_) {
		/* empty */
	}

	Class49_Sub2(Class_ra_Sub1 class_ra_sub1) {
		super(class_ra_sub1);
		if (((Class_ra_Sub1) ((Class49_Sub2) this).aClass_ra_Sub1_478).aBoolean8425) {
			((Class49_Sub2) this).aClass29_7050 = (Class29.method497(((Class49_Sub2) this).aClass_ra_Sub1_478, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
			((Class49_Sub2) this).aClass29_7049 = (Class29.method497(((Class49_Sub2) this).aClass_ra_Sub1_478, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
			((Class49_Sub2) this).aClass29_7048 = (Class29.method497(((Class49_Sub2) this).aClass_ra_Sub1_478, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
			((Class49_Sub2) this).aClass29_7045 = (Class29.method497(((Class49_Sub2) this).aClass_ra_Sub1_478, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
			if (((Class49_Sub2) this).aClass29_7050 != null & ((Class49_Sub2) this).aClass29_7049 != null & ((Class49_Sub2) this).aClass29_7048 != null & ((Class49_Sub2) this).aClass29_7045 != null) {
				((Class49_Sub2) this).aClass36_Sub1_7046 = new Class36_Sub1(class_ra_sub1, 3553, Class72.aClass72_611, Class86.aClass86_714, 2, 1, false, new byte[] { 0, -1 }, Class72.aClass72_611, false);
				((Class49_Sub2) this).aClass36_Sub1_7046.method518(false, false);
				((Class49_Sub2) this).aBoolean7042 = true;
			} else
				((Class49_Sub2) this).aBoolean7042 = false;
		} else
			((Class49_Sub2) this).aBoolean7042 = false;
	}
}
