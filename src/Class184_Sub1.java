/* Class184_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class184_Sub1 extends Class184 {
	long aLong8909 = 0L;
	Class_ra_Sub2_Sub2 aClass_ra_Sub2_Sub2_8910;

	void method2075(ByteBuffer bytebuffer, short i, short i_0_, byte i_1_, byte i_2_, byte i_3_, byte i_4_) {
		bytebuffer.putShort(i);
		bytebuffer.putShort(i_0_);
		bytebuffer.put(i_1_);
		bytebuffer.put(i_2_);
		bytebuffer.put(i_3_);
		bytebuffer.put(i_4_);
	}

	public void method53() {
		if (((Class184_Sub1) this).aLong8909 != 0L) {
			IUnknown.Release(((Class184_Sub1) this).aLong8909);
			((Class184_Sub1) this).aLong8909 = 0L;
		}
		((Class184_Sub1) this).aClass_ra_Sub2_Sub2_8910.method4883(this);
	}

	public void method52() {
		if (((Class184_Sub1) this).aLong8909 != 0L) {
			IUnknown.Release(((Class184_Sub1) this).aLong8909);
			((Class184_Sub1) this).aLong8909 = 0L;
		}
		((Class184_Sub1) this).aClass_ra_Sub2_Sub2_8910.method4883(this);
	}

	Class184_Sub1(Class_ra_Sub2_Sub2 class_ra_sub2_sub2, Class193[] class193s) {
		super(class193s);
		((Class184_Sub1) this).aClass_ra_Sub2_Sub2_8910 = class_ra_sub2_sub2;
		byte i = 0;
		ByteBuffer bytebuffer = ((Class184_Sub1) this).aClass_ra_Sub2_Sub2_8910.aByteBuffer8458;
		bytebuffer.clear();
		for (short i_5_ = 0; i_5_ < aClass193Array6483.length; i_5_++) {
			short i_6_ = 0;
			Class193 class193 = aClass193Array6483[i_5_];
			for (int i_7_ = 0; i_7_ < class193.method2136(); i_7_++) {
				Class191 class191 = class193.method2134(i_7_);
				if (class191 == Class191.aClass191_1863)
					method2075(bytebuffer, i_5_, i_6_, (byte) 2, (byte) 0, (byte) 0, (byte) 0);
				else if (class191 == Class191.aClass191_1872)
					method2075(bytebuffer, i_5_, i_6_, (byte) 2, (byte) 0, (byte) 3, (byte) 0);
				else if (class191 == Class191.aClass191_1862)
					method2075(bytebuffer, i_5_, i_6_, (byte) 4, (byte) 0, (byte) 10, (byte) 0);
				else if (class191 == Class191.aClass191_1861) {
					Class184_Sub1 class184_sub1_8_ = this;
					ByteBuffer bytebuffer_9_ = bytebuffer;
					short i_10_ = i_5_;
					short i_11_ = i_6_;
					byte i_12_ = 0;
					byte i_13_ = 0;
					byte i_14_ = 5;
					byte i_15_ = i;
					i++;
					class184_sub1_8_.method2075(bytebuffer_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_);
				} else if (class191 == Class191.aClass191_1864) {
					Class184_Sub1 class184_sub1_16_ = this;
					ByteBuffer bytebuffer_17_ = bytebuffer;
					short i_18_ = i_5_;
					short i_19_ = i_6_;
					byte i_20_ = 1;
					byte i_21_ = 0;
					byte i_22_ = 5;
					byte i_23_ = i;
					i++;
					class184_sub1_16_.method2075(bytebuffer_17_, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_);
				} else if (class191 == Class191.aClass191_1865) {
					Class184_Sub1 class184_sub1_24_ = this;
					ByteBuffer bytebuffer_25_ = bytebuffer;
					short i_26_ = i_5_;
					short i_27_ = i_6_;
					byte i_28_ = 2;
					byte i_29_ = 0;
					byte i_30_ = 5;
					byte i_31_ = i;
					i++;
					class184_sub1_24_.method2075(bytebuffer_25_, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_);
				} else if (class191 == Class191.aClass191_1866) {
					Class184_Sub1 class184_sub1_32_ = this;
					ByteBuffer bytebuffer_33_ = bytebuffer;
					short i_34_ = i_5_;
					short i_35_ = i_6_;
					byte i_36_ = 3;
					byte i_37_ = 0;
					byte i_38_ = 5;
					byte i_39_ = i;
					i++;
					class184_sub1_32_.method2075(bytebuffer_33_, i_34_, i_35_, i_36_, i_37_, i_38_, i_39_);
				}
				i_6_ += class191.anInt1876;
			}
		}
		method2075(bytebuffer, (short) 255, (short) 0, (byte) 17, (byte) 0, (byte) 0, (byte) 0);
		((Class184_Sub1) this).aLong8909 = (IDirect3DDevice.CreateVertexDeclaration(((Class_ra_Sub2_Sub2) ((Class184_Sub1) this).aClass_ra_Sub2_Sub2_8910).aLong9891, ((Class184_Sub1) this).aClass_ra_Sub2_Sub2_8910.aLong8459));
		((Class184_Sub1) this).aClass_ra_Sub2_Sub2_8910.method4993(this);
	}

	void method2076() {
		if (((Class184_Sub1) this).aLong8909 != 0L) {
			((Class184_Sub1) this).aClass_ra_Sub2_Sub2_8910.method5173(((Class184_Sub1) this).aLong8909);
			((Class184_Sub1) this).aLong8909 = 0L;
		}
	}
}
