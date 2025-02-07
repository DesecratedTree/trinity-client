

public class AnimationFrame {
	int anInt925;
	static short[] bufferX;
	static short[] indicesBuffer = new short[500];
	static short[] bufferZ;
	static short[] skipped;
	short[] bufferYA;
	AnimationFrameBase base = null;
	static short[] bufferY;
	short[] aShortArray933;
	short[] aShortArray934;
	static int anInt935 = 2;
	short[] aShortArray936;
	short[] skippedA;
	byte[] aByteArray938;
	boolean modifiesAlpha;
	boolean modifiesColour;
	boolean aBoolean941;
	static int anInt942 = 1;
	static int anInt943 = 2;
	static byte[] flagsBuffer;
	boolean osrs;

	AnimationFrame(byte[] is, AnimationFrameBase class298_sub15, boolean osrs) {
		((AnimationFrame) this).anInt925 = 0;
		((AnimationFrame) this).modifiesAlpha = false;
		((AnimationFrame) this).modifiesColour = false;
		((AnimationFrame) this).aBoolean941 = false;
		((AnimationFrame) this).base = class298_sub15;
		try {
			RsByteBuffer attributes = new RsByteBuffer(is);
			RsByteBuffer transformations = new RsByteBuffer(is);
			int version = !osrs ? attributes.readUnsignedByte() : 0;
			attributes.index += 232826622;
			int count = !osrs && Settings.RS3_ANIMATIONS ? attributes.readUnsignedShort() : attributes.readUnsignedByte();
			int used = 0;
			int i_2_ = -1;
			int lastUsed = -1;
			transformations.index = (attributes.index * 385051775 + count) * 116413311;
			for (int index_ = 0; index_ < count; index_++) {
				if (index_ >= base.transformationTypes.length)
					break;
				int type = (((AnimationFrameBase) ((AnimationFrame) this).base).transformationTypes[index_]);
				if (type == 0)
					i_2_ = index_;
				int attribute = attributes.readUnsignedByte();
				if (attribute > 0) {
		            /*if(this.base.transformationTypes[index_] != 0) {
		                for(int var5 = index_ - 1; var5 > lastUsed; --var5) {
		                   if(this.base.transformationTypes[var5] == 0) {
		                	   indicesBuffer[used] = (short) var5;
		                      bufferX[used] = 0;
		                      bufferY[used] = 0;
		                      bufferZ[used] = 0;
		                      ++used;
		                      break;
		                   }
		                }
		             }*/
					if (type == 0)
						lastUsed = index_;
					indicesBuffer[used] = (short) index_;
					short value = 0;
					if (type == 3 || type == 10)
						value = (short) 128;
					if (version >= 2 && type == 7) {
						if ((attribute & 0x1) != 0) {
							bufferX[used] = (short) transformations.gSmart1or2s();
							transformations.gSmart1or2s();
						} else {
							bufferX[used] = value;
						}

						if ((attribute & 0x2) != 0) {
							bufferY[used] = (short) transformations.gSmart1or2s();
							transformations.gSmart1or2s();
						} else {
							bufferY[used] = value;
						}

						if ((attribute & 0x4) != 0) {
							bufferZ[used] = (short) transformations.gSmart1or2s();
							transformations.gSmart1or2s();
						} else {
							bufferZ[used] = value;
						}
					} else {
						if ((attribute & 0x1) != 0) {
							bufferX[used] = (short) transformations.gSmart1or2s();
						} else {
							bufferX[used] = value;
						}

						if ((attribute & 0x2) != 0) {
							bufferY[used] = (short) transformations.gSmart1or2s();
						} else {
							bufferY[used] = value;
						}

						if ((attribute & 0x4) != 0) {
							bufferZ[used] = (short) transformations.gSmart1or2s();
						} else {
							bufferZ[used] = value;
						}
					}
					//if (!osrs)
						flagsBuffer[used] = (byte) (attribute >>> 3 & 0x3);
					if (osrs && type == 1) {
						bufferX[used] *= 4;
						bufferY[used] *= 4;
						bufferZ[used] *= 4;
					}
					if (type == 2  || type == 9) {
						if (osrs) {
							bufferX[used] *= 16;
							bufferY[used] *= 16;
							bufferZ[used] *= 16;
						} 
						bufferX[used] = (short) (bufferX[used] << 2 & 0x3fff);
						bufferY[used] = (short) (bufferY[used] << 2 & 0x3fff);
						bufferZ[used] = (short) (bufferZ[used] << 2 & 0x3fff);
					}
					
					skipped[used] = (short) -1;
					if (type == 1 || type == 2 || type == 3) {
						if (i_2_ > lastUsed) {
							skipped[used] = (short) i_2_;
							lastUsed = i_2_;
						}
					} else if (type == 5)
						((AnimationFrame) this).modifiesAlpha = true;
					else if (type == 7)
						((AnimationFrame) this).modifiesColour = true;
					else if (type == 9 || type == 10 || type == 8)
						((AnimationFrame) this).aBoolean941 = true;
					used++;
				}
			}
			/*if (transformations.index * 385051775 != is.length)
				throw new RuntimeException();*/
			((AnimationFrame) this).anInt925 = used;
			((AnimationFrame) this).aShortArray933 = new short[used];
			((AnimationFrame) this).aShortArray934 = new short[used];
			((AnimationFrame) this).bufferYA = new short[used];
			((AnimationFrame) this).aShortArray936 = new short[used];
			((AnimationFrame) this).skippedA = new short[used];
			((AnimationFrame) this).aByteArray938 = new byte[used];
			for (int i_8_ = 0; i_8_ < used; i_8_++) {
				((AnimationFrame) this).aShortArray933[i_8_] = indicesBuffer[i_8_];
				((AnimationFrame) this).aShortArray934[i_8_] = bufferX[i_8_];
				((AnimationFrame) this).bufferYA[i_8_] = bufferY[i_8_];
				((AnimationFrame) this).aShortArray936[i_8_] = bufferZ[i_8_];
				((AnimationFrame) this).skippedA[i_8_] = skipped[i_8_];
				((AnimationFrame) this).aByteArray938[i_8_] = flagsBuffer[i_8_];
			}
		} catch (Exception exception) {
			exception.printStackTrace();
			
			((AnimationFrame) this).anInt925 = 0;
			((AnimationFrame) this).modifiesAlpha = false;
			((AnimationFrame) this).modifiesColour = false;
		}
	}
	
	
	/*
	 * osrs
	 */
	AnimationFrame(byte[] is, AnimationFrameBase class298_sub15) {
		osrs = true;
		((AnimationFrame) this).anInt925 = 0;
		((AnimationFrame) this).modifiesAlpha = false;
		((AnimationFrame) this).modifiesColour = false;
		((AnimationFrame) this).aBoolean941 = false;
		((AnimationFrame) this).base = class298_sub15;
			RsByteBuffer header = new RsByteBuffer(is);
			RsByteBuffer buffer = new RsByteBuffer(is);
			header.index += 232826622;
			int count = header.readUnsignedByte();
			int var10 = -1;
			int var3 = 0;
			buffer.index = (header.index * 385051775 + count) * 116413311;
			int index_;
			for (index_ = 0; index_ < count; ++index_) {
				int var9 = header.readUnsignedByte();
				if (var9 > 0) {
					if (this.base.transformationTypes[index_] != 0) {
						for (int var5 = index_ - 1; var5 > var10; --var5) {
							if (this.base.transformationTypes[var5] == 0) {
								indicesBuffer[var3] = (short) var5;
								bufferX[var3] = 0;
								bufferY[var3] = 0;
								bufferZ[var3] = 0;
								++var3;
								break;
							}
						}
					}

					indicesBuffer[var3] = (short) index_;
					short var11 = 0;
					if (this.base.transformationTypes[index_] == 3) {
						var11 = 128;
					}

					if ((var9 & 1) != 0) {
						bufferX[var3] = (short) buffer.gSmart1or2s();
					} else {
						bufferX[var3] = var11;
					}

					if ((var9 & 2) != 0) {
						bufferY[var3] = (short) buffer.gSmart1or2s();
					} else {
						bufferY[var3] = var11;
					}

					if ((var9 & 4) != 0) {
						bufferZ[var3] = (short) buffer.gSmart1or2s();
					} else {
						bufferZ[var3] = var11;
					}
					
					if (this.base.transformationTypes[index_]  == 2 || this.base.transformationTypes[index_]  == 9) {
						bufferX[var3] *= 16;
						bufferY[var3] *= 16;
						bufferZ[var3] *= 16;
						bufferX[var3] = (short) (bufferX[var3] << 2 & 0x3fff);
						bufferY[var3] = (short) (bufferY[var3] << 2 & 0x3fff);
						bufferZ[var3] = (short) (bufferZ[var3] << 2 & 0x3fff);
					}
					var10 = index_;
					++var3;
					if (this.base.transformationTypes[index_] == 5) {
						this.modifiesAlpha = true;
					}
				}
			}
			if (buffer.index * 385051775 != is.length)
				throw new RuntimeException();
			((AnimationFrame) this).anInt925 = var3;
			((AnimationFrame) this).aShortArray933 = new short[var3];
			((AnimationFrame) this).aShortArray934 = new short[var3];
			((AnimationFrame) this).bufferYA = new short[var3];
			((AnimationFrame) this).aShortArray936 = new short[var3];
			((AnimationFrame) this).skippedA = new short[var3];
			((AnimationFrame) this).aByteArray938 = new byte[var3];
			for (int i_8_ = 0; i_8_ < var3; i_8_++) {
				((AnimationFrame) this).aShortArray933[i_8_] = indicesBuffer[i_8_];
				((AnimationFrame) this).aShortArray934[i_8_] = bufferX[i_8_];
				((AnimationFrame) this).bufferYA[i_8_] = bufferY[i_8_];
				((AnimationFrame) this).aShortArray936[i_8_] = bufferZ[i_8_];
				((AnimationFrame) this).skippedA[i_8_] = -1;//skipped[i_8_];
				((AnimationFrame) this).aByteArray938[i_8_] = flagsBuffer[i_8_];
			}
	}

	static {
		bufferX = new short[500];
		bufferY = new short[500];
		bufferZ = new short[500];
		skipped = new short[500];
		flagsBuffer = new byte[500];
	}
}
