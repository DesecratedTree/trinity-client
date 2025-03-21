/* Class49_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class49_Sub4 extends Class49 {
	static char aChar7056 = '\001';
	Class33 aClass33_7057;
	float[] aFloatArray7058;
	static char aChar7059 = '\0';
	int anInt7060;
	static String aString7061 = "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";
	float aFloat7062;
	Class29 aClass29_7063;
	Class47 aClass47_7064;
	static float[] aFloatArray7065 = new float[4];

	void method602(boolean bool) {
		if (((Class49_Sub4) this).aClass33_7057 != null) {
			((Class49_Sub4) this).aClass33_7057.method503('\0');
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aClass249_8359.aFloatArray2631), 0);
			OpenGL.glMatrixMode(5888);
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(0);
			if (((Class49_Sub4) this).anInt7060 != (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).anInt8304)) {
				int i = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).anInt8304 % 5000 * 128 / 5000);
				for (int i_0_ = 0; i_0_ < 64; i_0_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_0_, (((Class49_Sub4) this).aFloatArray7058), i);
					i += 2;
				}
				if (((Class47) ((Class49_Sub4) this).aClass47_7064).aBoolean462)
					((Class49_Sub4) this).aFloat7062 = (float) ((((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).anInt8304) % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				((Class49_Sub4) this).anInt7060 = ((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).anInt8304;
			}
		}
	}

	void method625() {
		((Class49_Sub4) this).aClass33_7057 = new Class33(((Class49_Sub4) this).aClass_ra_Sub1_478, 2);
		((Class49_Sub4) this).aClass33_7057.method504(0);
		((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(1);
		((Class49_Sub4) this).aClass_ra_Sub1_478.method4849(-16777216);
		((Class49_Sub4) this).aClass_ra_Sub1_478.method4831(260, 7681);
		((Class49_Sub4) this).aClass_ra_Sub1_478.method4848(0, 34166, 770);
		((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(0);
		OpenGL.glBindProgramARB(34336, ((Class29) (((Class49_Sub4) this).aClass29_7063)).anInt338);
		OpenGL.glEnable(34336);
		((Class49_Sub4) this).aClass33_7057.method502();
		((Class49_Sub4) this).aClass33_7057.method504(1);
		((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		((Class49_Sub4) this).aClass_ra_Sub1_478.method4836(0);
		((Class49_Sub4) this).aClass_ra_Sub1_478.method4848(0, 5890, 770);
		((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		((Class49_Sub4) this).aClass33_7057.method502();
	}

	void method612(boolean bool) {
		/* empty */
	}

	void method608(boolean bool) {
		/* empty */
	}

	void method604() {
		if (((Class49_Sub4) this).aClass33_7057 != null) {
			((Class49_Sub4) this).aClass33_7057.method503('\001');
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(0);
		}
	}

	void method606(int i, int i_1_) {
		if (((Class49_Sub4) this).aClass33_7057 != null) {
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(1);
			if ((i & 0x80) == 0) {
				if ((i_1_ & 0x1) == 1) {
					if (!((Class47) ((Class49_Sub4) this).aClass47_7064).aBoolean462) {
						int i_2_ = ((((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).anInt8304) % 4000 * 16 / 4000);
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub1Array461[i_2_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub2_464);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, ((Class49_Sub4) this).aFloat7062, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (((Class47) ((Class49_Sub4) this).aClass47_7064).aBoolean462)
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub2_464);
					else
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub1Array461[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(0);
			if ((i & 0x40) == 0) {
				aFloatArray7065[0] = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aFloat8372 * ((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).aFloat8250);
				aFloatArray7065[1] = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aFloat8372 * ((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).aFloat8370);
				aFloatArray7065[2] = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aFloat8372 * ((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).aFloat8371);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray7065, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_3_ = i & 0x3;
			if (i_3_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_3_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method614() {
		if (((Class49_Sub4) this).aClass33_7057 != null) {
			((Class49_Sub4) this).aClass33_7057.method503('\001');
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(0);
		}
	}

	void method619(int i, int i_4_) {
		if (((Class49_Sub4) this).aClass33_7057 != null) {
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(1);
			if ((i & 0x80) == 0) {
				if ((i_4_ & 0x1) == 1) {
					if (!((Class47) ((Class49_Sub4) this).aClass47_7064).aBoolean462) {
						int i_5_ = ((((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).anInt8304) % 4000 * 16 / 4000);
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub1Array461[i_5_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub2_464);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, ((Class49_Sub4) this).aFloat7062, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (((Class47) ((Class49_Sub4) this).aClass47_7064).aBoolean462)
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub2_464);
					else
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub1Array461[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(0);
			if ((i & 0x40) == 0) {
				aFloatArray7065[0] = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aFloat8372 * ((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).aFloat8250);
				aFloatArray7065[1] = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aFloat8372 * ((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).aFloat8370);
				aFloatArray7065[2] = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aFloat8372 * ((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).aFloat8371);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray7065, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_6_ = i & 0x3;
			if (i_6_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_6_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	boolean method611() {
		return true;
	}

	void method610(boolean bool) {
		/* empty */
	}

	void method600(Class36 class36, int i) {
		((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(class36);
		((Class49_Sub4) this).aClass_ra_Sub1_478.method4836(i);
	}

	void method609(boolean bool) {
		if (((Class49_Sub4) this).aClass33_7057 != null) {
			((Class49_Sub4) this).aClass33_7057.method503('\0');
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aClass249_8359.aFloatArray2631), 0);
			OpenGL.glMatrixMode(5888);
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(0);
			if (((Class49_Sub4) this).anInt7060 != (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).anInt8304)) {
				int i = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).anInt8304 % 5000 * 128 / 5000);
				for (int i_7_ = 0; i_7_ < 64; i_7_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_7_, (((Class49_Sub4) this).aFloatArray7058), i);
					i += 2;
				}
				if (((Class47) ((Class49_Sub4) this).aClass47_7064).aBoolean462)
					((Class49_Sub4) this).aFloat7062 = (float) ((((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).anInt8304) % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				((Class49_Sub4) this).anInt7060 = ((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).anInt8304;
			}
		}
	}

	void method616(Class36 class36, int i) {
		((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(class36);
		((Class49_Sub4) this).aClass_ra_Sub1_478.method4836(i);
	}

	void method607(boolean bool) {
		/* empty */
	}

	boolean method605() {
		return true;
	}

	void method617(int i, int i_8_) {
		if (((Class49_Sub4) this).aClass33_7057 != null) {
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(1);
			if ((i & 0x80) == 0) {
				if ((i_8_ & 0x1) == 1) {
					if (!((Class47) ((Class49_Sub4) this).aClass47_7064).aBoolean462) {
						int i_9_ = ((((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).anInt8304) % 4000 * 16 / 4000);
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub1Array461[i_9_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub2_464);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, ((Class49_Sub4) this).aFloat7062, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (((Class47) ((Class49_Sub4) this).aClass47_7064).aBoolean462)
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub2_464);
					else
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub1Array461[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(0);
			if ((i & 0x40) == 0) {
				aFloatArray7065[0] = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aFloat8372 * ((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).aFloat8250);
				aFloatArray7065[1] = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aFloat8372 * ((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).aFloat8370);
				aFloatArray7065[2] = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aFloat8372 * ((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).aFloat8371);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray7065, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_10_ = i & 0x3;
			if (i_10_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_10_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method613() {
		if (((Class49_Sub4) this).aClass33_7057 != null) {
			((Class49_Sub4) this).aClass33_7057.method503('\001');
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(0);
		}
	}

	void method615(Class36 class36, int i) {
		((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(class36);
		((Class49_Sub4) this).aClass_ra_Sub1_478.method4836(i);
	}

	void method603() {
		if (((Class49_Sub4) this).aClass33_7057 != null) {
			((Class49_Sub4) this).aClass33_7057.method503('\001');
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(0);
		}
	}

	boolean method601() {
		return true;
	}

	void method618(int i, int i_11_) {
		if (((Class49_Sub4) this).aClass33_7057 != null) {
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(1);
			if ((i & 0x80) == 0) {
				if ((i_11_ & 0x1) == 1) {
					if (!((Class47) ((Class49_Sub4) this).aClass47_7064).aBoolean462) {
						int i_12_ = ((((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).anInt8304) % 4000 * 16 / 4000);
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub1Array461[i_12_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub2_464);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, ((Class49_Sub4) this).aFloat7062, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (((Class47) ((Class49_Sub4) this).aClass47_7064).aBoolean462)
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub2_464);
					else
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub1Array461[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(0);
			if ((i & 0x40) == 0) {
				aFloatArray7065[0] = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aFloat8372 * ((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).aFloat8250);
				aFloatArray7065[1] = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aFloat8372 * ((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).aFloat8370);
				aFloatArray7065[2] = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aFloat8372 * ((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).aFloat8371);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray7065, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_13_ = i & 0x3;
			if (i_13_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_13_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	Class49_Sub4(Class_ra_Sub1 class_ra_sub1, Class47 class47) {
		super(class_ra_sub1);
		((Class49_Sub4) this).aClass47_7064 = class47;
		if ((((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aBoolean8425) && (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).anInt8409) >= 2) {
			((Class49_Sub4) this).aClass29_7063 = (Class29.method497(((Class49_Sub4) this).aClass_ra_Sub1_478, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND"));
			if (((Class49_Sub4) this).aClass29_7063 != null) {
				int[][] is = Class330_Sub22.method3378(64, 256, 0, 4, 4, 3, 0.4F, false, -1001769298);
				int[][] is_14_ = Class330_Sub22.method3378(64, 256, 8, 4, 4, 3, 0.4F, false, -1849448326);
				int i = 0;
				((Class49_Sub4) this).aFloatArray7058 = new float[32768];
				for (int i_15_ = 0; i_15_ < 256; i_15_++) {
					int[] is_16_ = is[i_15_];
					int[] is_17_ = is_14_[i_15_];
					for (int i_18_ = 0; i_18_ < 64; i_18_++) {
						((Class49_Sub4) this).aFloatArray7058[i++] = (float) is_16_[i_18_] / 4096.0F;
						((Class49_Sub4) this).aFloatArray7058[i++] = (float) is_17_[i_18_] / 4096.0F;
					}
				}
				method625();
			}
		}
	}

	void method620(int i, int i_19_) {
		if (((Class49_Sub4) this).aClass33_7057 != null) {
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(1);
			if ((i & 0x80) == 0) {
				if ((i_19_ & 0x1) == 1) {
					if (!((Class47) ((Class49_Sub4) this).aClass47_7064).aBoolean462) {
						int i_20_ = ((((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).anInt8304) % 4000 * 16 / 4000);
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub1Array461[i_20_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub2_464);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, ((Class49_Sub4) this).aFloat7062, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (((Class47) ((Class49_Sub4) this).aClass47_7064).aBoolean462)
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub2_464);
					else
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub1Array461[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(0);
			if ((i & 0x40) == 0) {
				aFloatArray7065[0] = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aFloat8372 * ((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).aFloat8250);
				aFloatArray7065[1] = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aFloat8372 * ((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).aFloat8370);
				aFloatArray7065[2] = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aFloat8372 * ((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).aFloat8371);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray7065, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_21_ = i & 0x3;
			if (i_21_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_21_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method621(int i, int i_22_) {
		if (((Class49_Sub4) this).aClass33_7057 != null) {
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(1);
			if ((i & 0x80) == 0) {
				if ((i_22_ & 0x1) == 1) {
					if (!((Class47) ((Class49_Sub4) this).aClass47_7064).aBoolean462) {
						int i_23_ = ((((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).anInt8304) % 4000 * 16 / 4000);
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub1Array461[i_23_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub2_464);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, ((Class49_Sub4) this).aFloat7062, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (((Class47) ((Class49_Sub4) this).aClass47_7064).aBoolean462)
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub2_464);
					else
						((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub4) this).aClass47_7064).aClass36_Sub1Array461[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				((Class49_Sub4) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub4) this).aClass_ra_Sub1_478.method4843(0);
			if ((i & 0x40) == 0) {
				aFloatArray7065[0] = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aFloat8372 * ((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).aFloat8250);
				aFloatArray7065[1] = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aFloat8372 * ((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).aFloat8370);
				aFloatArray7065[2] = (((Class_ra_Sub1) ((Class49_Sub4) this).aClass_ra_Sub1_478).aFloat8372 * ((Class_ra_Sub1) (((Class49_Sub4) this).aClass_ra_Sub1_478)).aFloat8371);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray7065, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_24_ = i & 0x3;
			if (i_24_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_24_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}
}
