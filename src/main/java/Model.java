
import java.util.*;

/* Model - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Model {
	public Class68[] aClass68Array613;
	public int num_vertices;
	public short[] aShortArray615;
	public int[] vertices_x;
	public short[] faces_material;
	public int[] vertices_z;
	public int[] vertices_label;
	public short[] aShortArray620;
	public int num_faces;
	public byte[] textures_mapping;
	public short[] textures_mapping_p;
	public short[] faces_c;
	public byte[] faces_type;
	public int highest_used_vertex;
	public byte[] faces_trans;
	public byte[] aByteArray628;
	public short[] faces_colour;
	public int protocol = 12;
	public int[] face_labels;
	public byte priority;
	public byte[] faces_layer;
	public int num_textures;
	public byte[] faces_mapping;
	public short[] textures_mapping_m;
	public int[] anIntArray637;
	public short[] textures_mapping_n;
	public int[] anIntArray639;
	public int[] anIntArray640;
	public int[] anIntArray641;
	public int[] vertices_y;
	public int[] anIntArray643;
	public short[] faces_a;
	public byte[] aByteArray645;
	public short[] faces_b;
	public Class85[] particles;
	public int[] anIntArray648;
	public Class84[] aClass84Array649;
	private int id = -1;

	Model(int id, byte[] is) {
		this.id = id;
		num_vertices = 0;
		highest_used_vertex = 0;
		num_faces = 0;
		priority = (byte) 0;
		num_textures = 0;

		if (id >= Settings.OSRS_MODEL_OFFSET) {
			if (is[is.length - 1] == -1 && is[is.length - 2] == -1) //622 format
				decodeModel622(is);
			else
				decodeModel317(is);
		} else if (is[is.length - 1] == -1 && is[is.length - 2] == -1) //622 format
			decodeModel622(is);
		else// if (is[0] != 1)
			decodeModel317(is);
	/*	else
			decodeModel830(is);*/
		if (id >= Settings.OSRS_MODEL_OFFSET && id < Settings._685_MODEL_OFFSET)
			setOSRSTextures(id);
	/*	
		if (id == 68615)
			this.printColors();*/
	}
	
	public Model(int i, int i_0_, int i_1_) {
		num_vertices = 0;
		highest_used_vertex = 0;
		num_faces = 0;
		priority = (byte) 0;
		num_textures = 0;
		vertices_x = new int[i];
		vertices_y = new int[i];
		vertices_z = new int[i];
		vertices_label = new int[i];
		faces_a = new short[i_0_];
		faces_b = new short[i_0_];
		faces_c = new short[i_0_];
		faces_type = new byte[i_0_];
		faces_layer = new byte[i_0_];
		faces_trans = new byte[i_0_];
		faces_mapping = new byte[i_0_];
		faces_colour = new short[i_0_];
		faces_material = new short[i_0_];
		face_labels = new int[i_0_];
		if (i_1_ > 0) {
			textures_mapping = new byte[i_1_];
			textures_mapping_p = new short[i_1_];
			textures_mapping_m = new short[i_1_];
			textures_mapping_n = new short[i_1_];
			anIntArray639 = new int[i_1_];
			anIntArray640 = new int[i_1_];
			anIntArray641 = new int[i_1_];
			aByteArray645 = new byte[i_1_];
			aByteArray628 = new byte[i_1_];
			anIntArray637 = new int[i_1_];
			anIntArray643 = new int[i_1_];
			anIntArray648 = new int[i_1_];
		}
	}

	public Model(Model[] class64s, int i) {
		num_vertices = 0;
		highest_used_vertex = 0;
		num_faces = 0;
		priority = (byte) 0;
		num_textures = 0;
		num_vertices = 0;
		num_faces = 0;
		num_textures = 0;
		int i_2_ = 0;
		int i_3_ = 0;
		int i_4_ = 0;
		boolean bool = false;
		boolean bool_5_ = false;
		boolean bool_6_ = false;
		boolean bool_7_ = false;
		boolean bool_8_ = false;
		boolean bool_9_ = false;
		priority = (byte) -1;
		for (int i_10_ = 0; i_10_ < i; i_10_++) {
			Model class64_11_ = class64s[i_10_];
			if (class64_11_ != null) {
				num_vertices += class64_11_.num_vertices;
				num_faces += class64_11_.num_faces;
				num_textures += class64_11_.num_textures;
				if (class64_11_.particles != null)
					i_2_ += class64_11_.particles.length;
				if (class64_11_.aClass68Array613 != null)
					i_3_ += class64_11_.aClass68Array613.length;
				if (class64_11_.aClass84Array649 != null)
					i_4_ += class64_11_.aClass84Array649.length;
				bool = bool | class64_11_.faces_type != null;
				if (class64_11_.faces_layer != null)
					bool_5_ = true;
				else {
					if (priority == -1)
						priority = class64_11_.priority;
					if (priority != class64_11_.priority)
						bool_5_ = true;
				}
				bool_6_ = bool_6_ | class64_11_.faces_trans != null;
				bool_7_ = bool_7_ | class64_11_.faces_mapping != null;
				bool_8_ = bool_8_ | class64_11_.faces_material != null;
				bool_9_ = bool_9_ | class64_11_.face_labels != null;
			}
		}
		vertices_x = new int[num_vertices];
		vertices_y = new int[num_vertices];
		vertices_z = new int[num_vertices];
		vertices_label = new int[num_vertices];
		aShortArray620 = new short[num_vertices];
		faces_a = new short[num_faces];
		faces_b = new short[num_faces];
		faces_c = new short[num_faces];
		if (bool)
			faces_type = new byte[num_faces];
		if (bool_5_)
			faces_layer = new byte[num_faces];
		if (bool_6_)
			faces_trans = new byte[num_faces];
		if (bool_7_)
			faces_mapping = new byte[num_faces];
		faces_colour = new short[num_faces];
		if (bool_8_)
			faces_material = new short[num_faces];
		if (bool_9_)
			face_labels = new int[num_faces];
		aShortArray615 = new short[num_faces];
		if (num_textures > 0) {
			textures_mapping = new byte[num_textures];
			textures_mapping_p = new short[num_textures];
			textures_mapping_m = new short[num_textures];
			textures_mapping_n = new short[num_textures];
			anIntArray639 = new int[num_textures];
			anIntArray640 = new int[num_textures];
			anIntArray641 = new int[num_textures];
			aByteArray645 = new byte[num_textures];
			aByteArray628 = new byte[num_textures];
			anIntArray637 = new int[num_textures];
			anIntArray643 = new int[num_textures];
			anIntArray648 = new int[num_textures];
		}
		if (i_4_ > 0)
			aClass84Array649 = new Class84[i_4_];
		if (i_2_ > 0)
			particles = new Class85[i_2_];
		if (i_3_ > 0)
			aClass68Array613 = new Class68[i_3_];
		num_vertices = 0;
		num_faces = 0;
		num_textures = 0;
		i_2_ = 0;
		i_3_ = 0;
		i_4_ = 0;
		for (int i_12_ = 0; i_12_ < i; i_12_++) {
			short i_13_ = (short) (1 << i_12_);
			Model class64_14_ = class64s[i_12_];
			if (class64_14_ != null) {
				if (class64_14_.aClass84Array649 != null) {
					for (int i_15_ = 0; i_15_ < class64_14_.aClass84Array649.length; i_15_++) {
						Class84 class84 = class64_14_.aClass84Array649[i_15_];
						aClass84Array649[i_4_++] = class84.method945((class84.anInt767 * 1512514121 + num_faces), 214949543);
					}
				}
				for (int i_16_ = 0; i_16_ < class64_14_.num_faces; i_16_++) {
					if (bool && class64_14_.faces_type != null)
						faces_type[num_faces] = class64_14_.faces_type[i_16_];
					if (bool_5_) {
						if (class64_14_.faces_layer != null)
							faces_layer[num_faces] = class64_14_.faces_layer[i_16_];
						else
							faces_layer[num_faces] = class64_14_.priority;
					}
					if (bool_6_ && class64_14_.faces_trans != null)
						faces_trans[num_faces] = class64_14_.faces_trans[i_16_];
					if (bool_8_) {
						if (class64_14_.faces_material != null)
							faces_material[num_faces] = class64_14_.faces_material[i_16_];
						else
							faces_material[num_faces] = (short) -1;
					}
					if (bool_9_) {
						if (class64_14_.face_labels != null)
							face_labels[num_faces] = class64_14_.face_labels[i_16_];
						else
							face_labels[num_faces] = -1;
					}
					faces_a[num_faces] = (short) method743(class64_14_, class64_14_.faces_a[i_16_], i_13_);
					faces_b[num_faces] = (short) method743(class64_14_, class64_14_.faces_b[i_16_], i_13_);
					faces_c[num_faces] = (short) method743(class64_14_, class64_14_.faces_c[i_16_], i_13_);
					aShortArray615[num_faces] = i_13_;
					faces_colour[num_faces] = class64_14_.faces_colour[i_16_];
					num_faces++;
				}
				if (class64_14_.particles != null) {
					for (int i_17_ = 0; i_17_ < class64_14_.particles.length; i_17_++) {
						int i_18_ = method743(class64_14_, (class64_14_.particles[i_17_].anInt773) * -710317103, i_13_);
						int i_19_ = method743(class64_14_, (class64_14_.particles[i_17_].anInt774) * 1705862021, i_13_);
						int i_20_ = method743(class64_14_, (class64_14_.particles[i_17_].anInt775) * 1636170731, i_13_);
						particles[i_2_] = class64_14_.particles[i_17_].method954(i_18_, i_19_, i_20_, -1991744488);
						i_2_++;
					}
				}
				if (class64_14_.aClass68Array613 != null) {
					for (int i_21_ = 0; i_21_ < class64_14_.aClass68Array613.length; i_21_++) {
						int i_22_ = method743(class64_14_, (class64_14_.aClass68Array613[i_21_].anInt674) * -180596249, i_13_);
						aClass68Array613[i_3_] = class64_14_.aClass68Array613[i_21_].method776(i_22_, (byte) 0);
						i_3_++;
					}
				}
			}
		}
		int i_23_ = 0;
		highest_used_vertex = num_vertices;
		for (int i_24_ = 0; i_24_ < i; i_24_++) {
			short i_25_ = (short) (1 << i_24_);
			Model class64_26_ = class64s[i_24_];
			if (class64_26_ != null) {
				for (int i_27_ = 0; i_27_ < class64_26_.num_faces; i_27_++) {
					if (bool_7_)
						faces_mapping[i_23_++] = (byte) ((class64_26_.faces_mapping != null && (class64_26_.faces_mapping[i_27_] != -1)) ? (class64_26_.faces_mapping[i_27_] + num_textures) : -1);
				}
				for (int i_28_ = 0; i_28_ < class64_26_.num_textures; i_28_++) {
					byte i_29_ = (textures_mapping[num_textures] = class64_26_.textures_mapping[i_28_]);
					if (i_29_ == 0) {
						textures_mapping_p[num_textures] = (short) method743(class64_26_, (class64_26_.textures_mapping_p[i_28_]), i_25_);
						textures_mapping_m[num_textures] = (short) method743(class64_26_, (class64_26_.textures_mapping_m[i_28_]), i_25_);
						textures_mapping_n[num_textures] = (short) method743(class64_26_, (class64_26_.textures_mapping_n[i_28_]), i_25_);
					}
					if (i_29_ >= 1 && i_29_ <= 3) {
						textures_mapping_p[num_textures] = class64_26_.textures_mapping_p[i_28_];
						textures_mapping_m[num_textures] = class64_26_.textures_mapping_m[i_28_];
						textures_mapping_n[num_textures] = class64_26_.textures_mapping_n[i_28_];
						anIntArray639[num_textures] = class64_26_.anIntArray639[i_28_];
						anIntArray640[num_textures] = class64_26_.anIntArray640[i_28_];
						anIntArray641[num_textures] = class64_26_.anIntArray641[i_28_];
						aByteArray645[num_textures] = class64_26_.aByteArray645[i_28_];
						aByteArray628[num_textures] = class64_26_.aByteArray628[i_28_];
						anIntArray637[num_textures] = class64_26_.anIntArray637[i_28_];
					}
					if (i_29_ == 2) {
						anIntArray643[num_textures] = class64_26_.anIntArray643[i_28_];
						anIntArray648[num_textures] = class64_26_.anIntArray648[i_28_];
					}
					num_textures++;
				}
			}
		}
	}

	final int method743(Model class64_30_, int i, short i_31_) {
		int i_32_ = class64_30_.vertices_x[i];
		int i_33_ = class64_30_.vertices_y[i];
		int i_34_ = class64_30_.vertices_z[i];
		for (int i_35_ = 0; i_35_ < num_vertices; i_35_++) {
			if (i_32_ == vertices_x[i_35_] && i_33_ == vertices_y[i_35_] && i_34_ == vertices_z[i_35_]) {
				aShortArray620[i_35_] |= i_31_;
				return i_35_;
			}
		}
		vertices_x[num_vertices] = i_32_;
		vertices_y[num_vertices] = i_33_;
		vertices_z[num_vertices] = i_34_;
		aShortArray620[num_vertices] = i_31_;
		vertices_label[num_vertices] = (class64_30_.vertices_label != null ? class64_30_.vertices_label[i] : -1);
		return num_vertices++;
	}

	void calculateMaxDepth(RsByteBuffer class298_sub53, RsByteBuffer class298_sub53_36_) {
		short i = 0;
		short i_37_ = 0;
		short i_38_ = 0;
		int i_39_ = 0;
		for (int i_40_ = 0; i_40_ < num_faces; i_40_++) {
			int i_41_ = class298_sub53_36_.readUnsignedByte();
			if (i_41_ == 1) {
				i = (short) (class298_sub53.gSmart1or2s() + i_39_);
				i_39_ = i;
				i_37_ = (short) (class298_sub53.gSmart1or2s() + i_39_);
				i_39_ = i_37_;
				i_38_ = (short) (class298_sub53.gSmart1or2s() + i_39_);
				i_39_ = i_38_;
				faces_a[i_40_] = i;
				faces_b[i_40_] = i_37_;
				faces_c[i_40_] = i_38_;
				if (i > highest_used_vertex)
					highest_used_vertex = i;
				if (i_37_ > highest_used_vertex)
					highest_used_vertex = i_37_;
				if (i_38_ > highest_used_vertex)
					highest_used_vertex = i_38_;
			}
			if (i_41_ == 2) {
				i_37_ = i_38_;
				i_38_ = (short) (class298_sub53.gSmart1or2s() + i_39_);
				i_39_ = i_38_;
				faces_a[i_40_] = i;
				faces_b[i_40_] = i_37_;
				faces_c[i_40_] = i_38_;
				if (i_38_ > highest_used_vertex)
					highest_used_vertex = i_38_;
			}
			if (i_41_ == 3) {
				i = i_38_;
				i_38_ = (short) (class298_sub53.gSmart1or2s() + i_39_);
				i_39_ = i_38_;
				faces_a[i_40_] = i;
				faces_b[i_40_] = i_37_;
				faces_c[i_40_] = i_38_;
				if (i_38_ > highest_used_vertex)
					highest_used_vertex = i_38_;
			}
			if (i_41_ == 4) {
				short i_42_ = i;
				i = i_37_;
				i_37_ = i_42_;
				i_38_ = (short) (class298_sub53.gSmart1or2s() + i_39_);
				i_39_ = i_38_;
				faces_a[i_40_] = i;
				faces_b[i_40_] = i_37_;
				faces_c[i_40_] = i_38_;
				if (i_38_ > highest_used_vertex)
					highest_used_vertex = i_38_;
			}
		}
		highest_used_vertex++;
	}

	void decodeTexturedTriangles(RsByteBuffer class298_sub53, RsByteBuffer class298_sub53_43_, RsByteBuffer class298_sub53_44_, RsByteBuffer class298_sub53_45_, RsByteBuffer class298_sub53_46_, RsByteBuffer class298_sub53_47_) {
		for (int i = 0; i < num_textures; i++) {
			int i_48_ = textures_mapping[i] & 0xff;
			if (i_48_ == 0) {
				textures_mapping_p[i] = (short) class298_sub53.readUnsignedShort();
				textures_mapping_m[i] = (short) class298_sub53.readUnsignedShort();
				textures_mapping_n[i] = (short) class298_sub53.readUnsignedShort();
			}
			if (i_48_ == 1) {
				textures_mapping_p[i] = (short) class298_sub53_43_.readUnsignedShort();
				textures_mapping_m[i] = (short) class298_sub53_43_.readUnsignedShort();
				textures_mapping_n[i] = (short) class298_sub53_43_.readUnsignedShort();
				if (protocol < 15) {
					anIntArray639[i] = class298_sub53_44_.readUnsignedShort();
					if (protocol < 14)
						anIntArray640[i] = class298_sub53_44_.readUnsignedShort();
					else
						anIntArray640[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) -55);
					anIntArray641[i] = class298_sub53_44_.readUnsignedShort();
				} else {
					anIntArray639[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) 73);
					anIntArray640[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) -3);
					anIntArray641[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) 48);
				}
				aByteArray645[i] = class298_sub53_45_.readByte();
				aByteArray628[i] = class298_sub53_46_.readByte();
				anIntArray637[i] = class298_sub53_47_.readByte();
			}
			if (i_48_ == 2) {
				textures_mapping_p[i] = (short) class298_sub53_43_.readUnsignedShort();
				textures_mapping_m[i] = (short) class298_sub53_43_.readUnsignedShort();
				textures_mapping_n[i] = (short) class298_sub53_43_.readUnsignedShort();
				if (protocol < 15) {
					anIntArray639[i] = class298_sub53_44_.readUnsignedShort();
					if (protocol < 14)
						anIntArray640[i] = class298_sub53_44_.readUnsignedShort();
					else
						anIntArray640[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) -37);
					anIntArray641[i] = class298_sub53_44_.readUnsignedShort();
				} else {
					anIntArray639[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) -91);
					anIntArray640[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) 78);
					anIntArray641[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) 37);
				}
				aByteArray645[i] = class298_sub53_45_.readByte();
				aByteArray628[i] = class298_sub53_46_.readByte();
				anIntArray637[i] = class298_sub53_47_.readByte();
				anIntArray643[i] = class298_sub53_47_.readByte();
				anIntArray648[i] = class298_sub53_47_.readByte();
			}
			if (i_48_ == 3) {
				textures_mapping_p[i] = (short) class298_sub53_43_.readUnsignedShort();
				textures_mapping_m[i] = (short) class298_sub53_43_.readUnsignedShort();
				textures_mapping_n[i] = (short) class298_sub53_43_.readUnsignedShort();
				if (protocol < 15) {
					anIntArray639[i] = class298_sub53_44_.readUnsignedShort();
					if (protocol < 14)
						anIntArray640[i] = class298_sub53_44_.readUnsignedShort();
					else
						anIntArray640[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) 6);
					anIntArray641[i] = class298_sub53_44_.readUnsignedShort();
				} else {
					anIntArray639[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) -35);
					anIntArray640[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) -11);
					anIntArray641[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) -24);
				}
				aByteArray645[i] = class298_sub53_45_.readByte();
				aByteArray628[i] = class298_sub53_46_.readByte();
				anIntArray637[i] = class298_sub53_47_.readByte();
			}
		}
	}

	void decodeModel317(byte[] is) {
		boolean usesFacesLighting = false;
		boolean usesMaterials = false;
		RsByteBuffer first = new RsByteBuffer(is);
		RsByteBuffer second = new RsByteBuffer(is);
		RsByteBuffer third = new RsByteBuffer(is);
		RsByteBuffer fourth = new RsByteBuffer(is);
		RsByteBuffer fifth = new RsByteBuffer(is);
		first.index = (is.length - 18) * 116413311;
		num_vertices = first.readUnsignedShort();
		num_faces = first.readUnsignedShort();
		num_textures = first.readUnsignedByte();
		int modifyFace = first.readUnsignedByte();
		int priority = first.readUnsignedByte();
		int opacityFlag = first.readUnsignedByte();
		int skinWeightFlag = first.readUnsignedByte();
		int skinFlag = first.readUnsignedByte();
		int c = first.readUnsignedShort();
		int i_59_ = first.readUnsignedShort();
		int i_60_ = first.readUnsignedShort();
		int i_61_ = first.readUnsignedShort();
		int i_62_ = 0;
		int i_63_ = i_62_;
		i_62_ += num_vertices;
		int i_64_ = i_62_;
		i_62_ += num_faces;
		int i_65_ = i_62_;
		if (priority == 255)
			i_62_ += num_faces;
		int i_66_ = i_62_;
		if (skinWeightFlag == 1)
			i_62_ += num_faces;
		int i_67_ = i_62_;
		if (modifyFace == 1)
			i_62_ += num_faces;
		int i_68_ = i_62_;
		if (skinFlag == 1)
			i_62_ += num_vertices;
		int i_69_ = i_62_;
		if (opacityFlag == 1)
			i_62_ += num_faces;
		int i_70_ = i_62_;
		i_62_ += i_61_;
		int i_71_ = i_62_;
		i_62_ += num_faces * 2;
		int i_72_ = i_62_;
		i_62_ += num_textures * 6;
		int i_73_ = i_62_;
		i_62_ += c;
		int i_74_ = i_62_;
		i_62_ += i_59_;
		int i_75_ = i_62_;
		i_62_ += i_60_;
		vertices_x = new int[num_vertices];
		vertices_y = new int[num_vertices];
		vertices_z = new int[num_vertices];
		faces_a = new short[num_faces];
		faces_b = new short[num_faces];
		faces_c = new short[num_faces];
		if (num_textures > 0) {
			textures_mapping = new byte[num_textures];
			textures_mapping_p = new short[num_textures];
			textures_mapping_m = new short[num_textures];
			textures_mapping_n = new short[num_textures];
		}
		if (skinFlag == 1)
			vertices_label = new int[num_vertices];
		if (modifyFace == 1) {
			faces_type = new byte[num_faces];
			faces_mapping = new byte[num_faces];
			faces_material = new short[num_faces];
		}
		if (priority == 255)
			faces_layer = new byte[num_faces];
		else
			this.priority = (byte) priority;
		if (opacityFlag == 1)
			faces_trans = new byte[num_faces];
		if (skinWeightFlag == 1)
			face_labels = new int[num_faces];
		faces_colour = new short[num_faces];
		first.index = i_63_ * 116413311;
		second.index = i_73_ * 116413311;
		third.index = i_74_ * 116413311;
		fourth.index = i_75_ * 116413311;
		fifth.index = i_68_ * 116413311;
		int i_76_ = 0;
		int i_77_ = 0;
		int i_78_ = 0;
		for (int i_79_ = 0; i_79_ < num_vertices; i_79_++) {
			int i_80_ = first.readUnsignedByte();
			int i_81_ = 0;
			if ((i_80_ & 0x1) != 0)
				i_81_ = second.gSmart1or2s();
			int i_82_ = 0;
			if ((i_80_ & 0x2) != 0)
				i_82_ = third.gSmart1or2s();
			int i_83_ = 0;
			if ((i_80_ & 0x4) != 0)
				i_83_ = fourth.gSmart1or2s();
			vertices_x[i_79_] = i_76_ + i_81_;
			vertices_y[i_79_] = i_77_ + i_82_;
			vertices_z[i_79_] = i_78_ + i_83_;
			i_76_ = vertices_x[i_79_];
			i_77_ = vertices_y[i_79_];
			i_78_ = vertices_z[i_79_];
			if (skinFlag == 1)
				vertices_label[i_79_] = fifth.readUnsignedByte();
		}
		first.index = i_71_ * 116413311;
		second.index = i_67_ * 116413311;
		third.index = i_65_ * 116413311;
		fourth.index = i_69_ * 116413311;
		fifth.index = i_66_ * 116413311;
		for (int i_84_ = 0; i_84_ < num_faces; i_84_++) {
			faces_colour[i_84_] = (short) first.readUnsignedShort();
			if (modifyFace == 1) {
				int i_85_ = second.readUnsignedByte();
				if ((i_85_ & 0x1) == 1) {
					faces_type[i_84_] = (byte) 1;
					usesFacesLighting = true;
				} else
					faces_type[i_84_] = (byte) 0;
				if ((i_85_ & 0x2) == 2) {
					faces_mapping[i_84_] = (byte) (i_85_ >> 2);
					faces_material[i_84_] = faces_colour[i_84_];
					faces_colour[i_84_] = (short) 127;
					if (faces_material[i_84_] != -1)
						usesMaterials = true;
				} else {
					faces_mapping[i_84_] = (byte) -1;
					faces_material[i_84_] = (short) -1;
				}
			}
			if (priority == 255)
				faces_layer[i_84_] = third.readByte();
			if (opacityFlag == 1)
				faces_trans[i_84_] = fourth.readByte();
			if (skinWeightFlag == 1)
				face_labels[i_84_] = fifth.readUnsignedByte();
		}
		highest_used_vertex = -1;
		first.index = i_70_ * 116413311;
		second.index = i_64_ * 116413311;
		short i_86_ = 0;
		short i_87_ = 0;
		short i_88_ = 0;
		int i_89_ = 0;
		for (int i_90_ = 0; i_90_ < num_faces; i_90_++) {
			int i_91_ = second.readUnsignedByte();
			if (i_91_ == 1) {
				i_86_ = (short) (first.gSmart1or2s() + i_89_);
				i_89_ = i_86_;
				i_87_ = (short) (first.gSmart1or2s() + i_89_);
				i_89_ = i_87_;
				i_88_ = (short) (first.gSmart1or2s() + i_89_);
				i_89_ = i_88_;
				faces_a[i_90_] = i_86_;
				faces_b[i_90_] = i_87_;
				faces_c[i_90_] = i_88_;
				if (i_86_ > highest_used_vertex)
					highest_used_vertex = i_86_;
				if (i_87_ > highest_used_vertex)
					highest_used_vertex = i_87_;
				if (i_88_ > highest_used_vertex)
					highest_used_vertex = i_88_;
			}
			if (i_91_ == 2) {
				i_87_ = i_88_;
				i_88_ = (short) (first.gSmart1or2s() + i_89_);
				i_89_ = i_88_;
				faces_a[i_90_] = i_86_;
				faces_b[i_90_] = i_87_;
				faces_c[i_90_] = i_88_;
				if (i_88_ > highest_used_vertex)
					highest_used_vertex = i_88_;
			}
			if (i_91_ == 3) {
				i_86_ = i_88_;
				i_88_ = (short) (first.gSmart1or2s() + i_89_);
				i_89_ = i_88_;
				faces_a[i_90_] = i_86_;
				faces_b[i_90_] = i_87_;
				faces_c[i_90_] = i_88_;
				if (i_88_ > highest_used_vertex)
					highest_used_vertex = i_88_;
			}
			if (i_91_ == 4) {
				short i_92_ = i_86_;
				i_86_ = i_87_;
				i_87_ = i_92_;
				i_88_ = (short) (first.gSmart1or2s() + i_89_);
				i_89_ = i_88_;
				faces_a[i_90_] = i_86_;
				faces_b[i_90_] = i_87_;
				faces_c[i_90_] = i_88_;
				if (i_88_ > highest_used_vertex)
					highest_used_vertex = i_88_;
			}
		}
		highest_used_vertex++;
		first.index = i_72_ * 116413311;
		for (int i_93_ = 0; i_93_ < num_textures; i_93_++) {
			textures_mapping[i_93_] = (byte) 0;
			textures_mapping_p[i_93_] = (short) first.readUnsignedShort();
			textures_mapping_m[i_93_] = (short) first.readUnsignedShort();
			textures_mapping_n[i_93_] = (short) first.readUnsignedShort();
		}
		if (faces_mapping != null) {
			boolean bool_94_ = false;
			for (int i_95_ = 0; i_95_ < num_faces; i_95_++) {
				int i_96_ = faces_mapping[i_95_] & 0xff;
				if (i_96_ != 255) {
					if (((textures_mapping_p[i_96_] & 0xffff) == faces_a[i_95_]) && ((textures_mapping_m[i_96_] & 0xffff) == faces_b[i_95_]) && ((textures_mapping_n[i_96_] & 0xffff) == faces_c[i_95_]))
						faces_mapping[i_95_] = (byte) -1;
					else
						bool_94_ = true;
				}
			}
			if (!bool_94_)
				faces_mapping = null;
		}
		if (!usesMaterials)
			faces_material = null;
		if (!usesFacesLighting)
			faces_type = null;
	}

	public int method747(int i, int i_97_, int i_98_) {
		for (int i_99_ = 0; i_99_ < num_vertices; i_99_++) {
			if (vertices_x[i_99_] == i && vertices_y[i_99_] == i_97_ && vertices_z[i_99_] == i_98_)
				return i_99_;
		}
		vertices_x[num_vertices] = i;
		vertices_y[num_vertices] = i_97_;
		vertices_z[num_vertices] = i_98_;
		highest_used_vertex = num_vertices + 1;
		return num_vertices++;
	}

	public int method748(int i, int i_100_, int i_101_, byte i_102_, byte i_103_, short i_104_, byte i_105_, short i_106_) {
		faces_a[num_faces] = (short) i;
		faces_b[num_faces] = (short) i_100_;
		faces_c[num_faces] = (short) i_101_;
		faces_type[num_faces] = i_102_;
		faces_mapping[num_faces] = i_103_;
		faces_colour[num_faces] = i_104_;
		faces_trans[num_faces] = i_105_;
		faces_material[num_faces] = i_106_;
		return num_faces++;
	}

	public int[][] method749(boolean bool) {
		int[] is = new int[256];
		int i = 0;
		int i_107_ = bool ? num_vertices : highest_used_vertex;
		for (int i_108_ = 0; i_108_ < i_107_; i_108_++) {
			int i_109_ = vertices_label[i_108_];
			if (i_109_ >= 0) {
				is[i_109_]++;
				if (i_109_ > i)
					i = i_109_;
			}
		}
		int[][] is_110_ = new int[i + 1][];
		for (int i_111_ = 0; i_111_ <= i; i_111_++) {
			is_110_[i_111_] = new int[is[i_111_]];
			is[i_111_] = 0;
		}
		for (int i_112_ = 0; i_112_ < i_107_; i_112_++) {
			int i_113_ = vertices_label[i_112_];
			if (i_113_ >= 0)
				is_110_[i_113_][is[i_113_]++] = i_112_;
		}
		return is_110_;
	}

	public int[][] method750() {
		int[] is = new int[256];
		int i = 0;
		for (int i_114_ = 0; i_114_ < num_faces; i_114_++) {
			int i_115_ = face_labels[i_114_];
			if (i_115_ >= 0) {
				is[i_115_]++;
				if (i_115_ > i)
					i = i_115_;
			}
		}
		int[][] is_116_ = new int[i + 1][];
		for (int i_117_ = 0; i_117_ <= i; i_117_++) {
			is_116_[i_117_] = new int[is[i_117_]];
			is[i_117_] = 0;
		}
		for (int i_118_ = 0; i_118_ < num_faces; i_118_++) {
			int i_119_ = face_labels[i_118_];
			if (i_119_ >= 0)
				is_116_[i_119_][is[i_119_]++] = i_118_;
		}
		return is_116_;
	}

	public static Model loadModel(CacheIndex class243, int i, int i_120_) {
		byte[] is = class243.getFileFromArchive(i, i_120_, (byte) -97);
		if (is == null)
			return null;
		return new Model(i, is);
	}

	public void translate(int i, int i_123_, int i_124_) {
		for (int i_125_ = 0; i_125_ < num_vertices; i_125_++) {
			vertices_x[i_125_] += i;
			vertices_y[i_125_] += i_123_;
			vertices_z[i_125_] += i_124_;
		}
	}
	
	public void scale(int i, int i_123_, int i_124_) {
		for (int i_125_ = 0; i_125_ < num_vertices; i_125_++) {
			vertices_x[i_125_] *= i;
			vertices_y[i_125_] *= i_123_;
			vertices_z[i_125_] *= i_124_;
			vertices_x[i_125_] /= 128;
			vertices_y[i_125_] /= 128;
			vertices_z[i_125_] /= 128;
		}
	}

	public void method754(int i, int i_126_, int i_127_) {
		if (i_127_ != 0) {
			int i_128_ = Class220.anIntArray2483[i_127_];
			int i_129_ = Class220.anIntArray2474[i_127_];
			for (int i_130_ = 0; i_130_ < num_vertices; i_130_++) {
				int i_131_ = ((vertices_y[i_130_] * i_128_ + vertices_x[i_130_] * i_129_) >> 14);
				vertices_y[i_130_] = (vertices_y[i_130_] * i_129_ - vertices_x[i_130_] * i_128_) >> 14;
				vertices_x[i_130_] = i_131_;
			}
		}
		if (i != 0) {
			int i_132_ = Class220.anIntArray2483[i];
			int i_133_ = Class220.anIntArray2474[i];
			for (int i_134_ = 0; i_134_ < num_vertices; i_134_++) {
				int i_135_ = ((vertices_y[i_134_] * i_133_ - vertices_z[i_134_] * i_132_) >> 14);
				vertices_z[i_134_] = (vertices_y[i_134_] * i_132_ + vertices_z[i_134_] * i_133_) >> 14;
				vertices_y[i_134_] = i_135_;
			}
		}
		if (i_126_ != 0) {
			int i_136_ = Class220.anIntArray2483[i_126_];
			int i_137_ = Class220.anIntArray2474[i_126_];
			for (int i_138_ = 0; i_138_ < num_vertices; i_138_++) {
				int i_139_ = ((vertices_z[i_138_] * i_136_ + vertices_x[i_138_] * i_137_) >> 14);
				vertices_z[i_138_] = (vertices_z[i_138_] * i_137_ - vertices_x[i_138_] * i_136_) >> 14;
				vertices_x[i_138_] = i_139_;
			}
		}
	}

	public void resize(int i) {
		for (int i_140_ = 0; i_140_ < num_vertices; i_140_++) {
			vertices_x[i_140_] <<= i;
			vertices_y[i_140_] <<= i;
			vertices_z[i_140_] <<= i;
		}
		if (num_textures > 0 && anIntArray639 != null) {
			for (int i_141_ = 0; i_141_ < anIntArray639.length; i_141_++) {
				anIntArray639[i_141_] <<= i;
				anIntArray640[i_141_] <<= i;
				if (textures_mapping[i_141_] != 1)
					anIntArray641[i_141_] <<= i;
			}
		}
		
		if (id == 234692 || id == 231394 || id == 231395 || id == 231369 || id == 231392) {
			//System.out.println(faceCount+" count");
			moveY(0, 34, 1);
		}else if (id == 231373 || id == 231396) {
			moveY(0, 10, 1);
		}else if (id == 229930 || id == 229934) {
			moveY(50, 85, 1);
		} else if (id == 236429 || id == 236423 || id == 236438) {
			moveY(82, 83, 1);
		} else if (id == 201067 || id == 201134) {
			moveY(0, 3, 1);
		}else if (id == 230268) {
			moveY(21, 22, 1);
		} else if (id == 232818 || id == 232819 || (id <= 230271 && id >= 230252)
				 ) {
			moveY(0, 10, -1);
		}else if (id == 234690 || (id <= 230251 && id >= 230248)) 
			moveY(0, 12, -1);
		else if ( id == 234695)
			moveY(0, 14, -1);
		else if (id == 234681)
			moveY(0, 16, -1);
		else if (id == 234697 ||id == 234709)
			moveY(0, 24, -1);
	}

	private void moveY(int from, int to, int quantity) {
		for (int i2 = from; i2 < to; i2++) {
			vertices_y[this.faces_a[i2]] += quantity;
			vertices_y[this.faces_b[i2]] += quantity;
			vertices_y[this.faces_c[i2]] += quantity;
		}
	}
	
	public void setTexture(int[] fromColor, int tex) {
		try {
			
			//aShortArray623[i] = (short) class298_sub53.readUnsignedShort();
			//aShortArray636[i] = (short) class298_sub53.readUnsignedShort();
			//aShortArray638[i]
			System.out.println("counttt: "+ num_textures);
		num_textures++;
		if (num_textures == 1) {
			textures_mapping = new byte[1];
			textures_mapping_p = new short[1];
			textures_mapping_m = new short[1];
			textures_mapping_n = new short[1];
		} else {
			textures_mapping = Arrays.copyOf(textures_mapping, num_textures);
			textures_mapping_p = Arrays.copyOf(textures_mapping_p, num_textures);
			textures_mapping_m = Arrays.copyOf(textures_mapping_m, num_textures);
			textures_mapping_n = Arrays.copyOf(textures_mapping_n, num_textures);
		}
		//lX, lY, lZ
		//hX, hY, lZ
		//lX, lY, hZ
		int lx  = Integer.MAX_VALUE;
		int ly = Integer.MAX_VALUE;
		int lz = Integer.MAX_VALUE;
		int hx = Integer.MIN_VALUE;
		int hy = Integer.MIN_VALUE;
		int hz = Integer.MIN_VALUE;
		for (int x : vertices_x) {
			if (x < lx)
				lx = x;
			if (x > hx)
				hx = x;
		}
		for (int y : vertices_y) {
			if (y < ly)
				ly = y;
			if (y > hy)
				hy = y;
		}
		for (int z : vertices_z) {
			if (z < lz)
				lz = z;
			if (z > hz)
				hz = z;
		}
		textures_mapping[num_textures -1] = 0;
		textures_mapping_p[num_textures -1] = (short) num_vertices;
		textures_mapping_m[num_textures -1] = (short) (num_vertices +1);
		textures_mapping_n[num_textures -1] = (short) (num_vertices +2);
		//adding new vertex
		num_vertices++;
		vertices_x = Arrays.copyOf(vertices_x, num_vertices);
		vertices_y = Arrays.copyOf(vertices_y, num_vertices);
		vertices_z = Arrays.copyOf(vertices_z, num_vertices);
		if (vertices_label != null)
			vertices_label = Arrays.copyOf(vertices_label, num_vertices);
		vertices_x[num_vertices -1] = (lx + hx) / 2;
		vertices_y[num_vertices -1] = ly;
		vertices_z[num_vertices -1] = lz;
		
		num_vertices++;
		vertices_x = Arrays.copyOf(vertices_x, num_vertices);
		vertices_y = Arrays.copyOf(vertices_y, num_vertices);
		vertices_z = Arrays.copyOf(vertices_z, num_vertices);
		if (vertices_label != null)
			vertices_label = Arrays.copyOf(vertices_label, num_vertices);
		vertices_x[num_vertices -1] = (lx + hx) / 2;
		vertices_y[num_vertices -1] = hy;
		vertices_z[num_vertices -1] = lz;
		
		num_vertices++;
		vertices_x = Arrays.copyOf(vertices_x, num_vertices);
		vertices_y = Arrays.copyOf(vertices_y, num_vertices);
		vertices_z = Arrays.copyOf(vertices_z, num_vertices);
		if (vertices_label != null)
			vertices_label = Arrays.copyOf(vertices_label, num_vertices);
		
		vertices_x[num_vertices -1] = (lx + hx) / 2;
		vertices_y[num_vertices -1] = ly;
		vertices_z[num_vertices -1] = hz;
		
		/*if (faceType == null) 
			faceType = new byte[faceCount];*/
		if (faces_mapping == null) {
			faces_mapping = new byte[num_faces];
			Arrays.fill(faces_mapping, (byte) -1);
		}
		if (faces_material == null) {
			faces_material = new short[num_faces];
			Arrays.fill(faces_material, (short) -1);
		}
		if (faces_colour == null)
			faces_colour = new short[num_faces];
			for (int i = 0; i < num_faces; i++) {
			for (int fC : fromColor) {
				if (fC == faces_material[i]
						|| fC == faces_colour[i]) {
					faces_material[i] = (short) tex;
				//	System.out.println("count: "+texturedFaceCount);
					faces_mapping[i] = (byte) (num_textures - 1);
					faces_colour[i] = (short) 127;
				//	faceType[i] = 0;//(byte) ((2 + ((texturedFaceCount-1) * 4)) / 4);
				}
			}
		}
    	} catch (Throwable e) {
    		e.printStackTrace();
    	}
	}
	
	public void retexture(short i, short i_121_) {
		i = (short) TextureLoader.replaceTexture(i);
		i_121_ = (short) TextureLoader.replaceTexture(i_121_);
		if (faces_material != null) {
			for (int i_122_ = 0; i_122_ < num_faces; i_122_++) {
				if (faces_material[i_122_] == i)
					faces_material[i_122_] = i_121_;
			}
		}
	}
	
	public void recolor(short i, short i_142_) {
		for (int i_143_ = 0; i_143_ < num_faces; i_143_++) {
			if (faces_colour[i_143_] == i)
				faces_colour[i_143_] = i_142_;
		}
	}

	private class Clr {
		public short clr;
		public int uses;
		public Clr(short clr, int uses) {
			this.clr = clr;
			this.uses = uses;
		}
	}

	public void printSortedModelClrs() {
		ArrayList<Clr> clrs = new ArrayList<>();
		for (int i_143_ = 0; i_143_ < num_faces; i_143_++) {
			short faceClr = faces_colour[i_143_];
			Optional<Clr> c = clrs.stream().filter(clr1 -> clr1.clr==faceClr).findFirst();
			c.ifPresent(clr1 -> clr1.uses++);
			if(!c.isPresent())
				clrs.add(new Clr(faceClr, 1));
		}




		Collections.sort(clrs, (o1, o2) -> o2.uses - o1.uses);
		clrs.stream().forEach(clr -> System.out.println(clr.clr + " [uses: " + clr.uses + "]"));
		System.out.println("id for original colours " + this.id);
		System.out.print("config.originalColors = new short[] {");
		clrs.stream().forEach(clr -> System.out.print(clr.clr + ","));
		System.out.println("};");

		System.out.print("config.originalTextures = new short[] {");
		clrs.stream().forEach(clr -> System.out.print(clr.clr + ","));
		System.out.println("};");

		System.out.println("config.modifiedColors = new short[] {");
		clrs.stream().forEach(clr -> System.out.print((short) (Short.MIN_VALUE + Math.random() * (Short.MAX_VALUE*2)) + ","));
		System.out.println("};");
	}

	public byte method757(short i, short i_144_, short i_145_, short i_146_, short i_147_, short i_148_, byte i_149_, byte i_150_, byte i_151_) {
		if (num_textures >= 255)
			throw new IllegalStateException();
		textures_mapping[num_textures] = (byte) 3;
		textures_mapping_p[num_textures] = i;
		textures_mapping_m[num_textures] = i_144_;
		textures_mapping_n[num_textures] = i_145_;
		anIntArray639[num_textures] = i_146_;
		anIntArray640[num_textures] = i_147_;
		anIntArray641[num_textures] = i_148_;
		aByteArray645[num_textures] = i_149_;
		aByteArray628[num_textures] = i_150_;
		anIntArray637[num_textures] = i_151_;
		return (byte) num_textures++;
	}

	private int numUVCoords;
	
	public void decodeModel830(byte[] is) {
		RsByteBuffer buffer1 = new RsByteBuffer(is);
		RsByteBuffer buffer2 = new RsByteBuffer(is);
		RsByteBuffer buffer3 = new RsByteBuffer(is);
		RsByteBuffer buffer4 = new RsByteBuffer(is);
		RsByteBuffer buffer5 = new RsByteBuffer(is);
		RsByteBuffer buffer6 = new RsByteBuffer(is);
		RsByteBuffer buffer7 = new RsByteBuffer(is);
		
		int format = buffer1.readUnsignedByte();
		if (format != 1)
			throw new RuntimeException("Not 830 format.");
		buffer1.readUnsignedByte(); //skip 2nd byte
		protocol = buffer1.readUnsignedByte();
		buffer1.index = (is.length - 26) * 116413311;
		num_vertices = buffer1.readUnsignedShort();
		num_faces = buffer1.readUnsignedShort();
		num_textures = buffer1.readUnsignedShort();
		int settings = buffer1.readUnsignedByte();
		boolean setAttributes = (settings & 0x1) == 1;
		boolean setParticlesEffects = (settings & 0x2) == 2;
		boolean setBillboards = (settings & 0x4) == 4;
		//830 format
		boolean setLargeVertexSkins = (settings & 0x10) == 16;
		boolean setLargeTriangleSkins = (settings & 0x20) == 32;
		boolean setLargeBillboardGroups = (settings & 0x40) == 64;
		boolean setUVCoordinates = (settings & 0x80) == 128;
		int priority = buffer1.readUnsignedByte();
		int opacityFlag = buffer1.readUnsignedByte();
		int skinWeightFlag = buffer1.readUnsignedByte();
		int skinFlag = buffer1.readUnsignedByte();
		int hasVertexSkins = buffer1.readUnsignedByte();
		int modelVerticesX = buffer1.readUnsignedShort();
		int modelVerticesY = buffer1.readUnsignedShort();
		int modelVerticesZ = buffer1.readUnsignedShort();
		int modelVertexPoint = buffer1.readUnsignedShort();
		int modelTextureCoords = buffer1.readUnsignedShort();
		int vertices = buffer1.readUnsignedShort();
		int faces = buffer1.readUnsignedShort();
		
		if (!setLargeVertexSkins) {
			if (hasVertexSkins == 1) {
				vertices = num_vertices;
			} else {
				vertices = 0;
			}
		}
		if (!setLargeTriangleSkins) {
			if (skinFlag == 1) {
				faces = num_faces;
			} else {
				faces = 0;
			}
		}
		
		int simpleTextureFaceCount = 0;
		int complexTextureFaceCount = 0;
		int cubeTextureFaceCount = 0;
		if (num_textures > 0) {
			textures_mapping = new byte[num_textures];
			
			buffer1.index =/* 0;*/ 3 * 116413311;
			for (int i_174_ = 0; i_174_ < num_textures; i_174_++) {
				byte i_175_ = (textures_mapping[i_174_] = buffer1.readByte());
				if (i_175_ == 0)
					simpleTextureFaceCount++;
				if (i_175_ >= 1 && i_175_ <= 3)
					complexTextureFaceCount++;
				if (i_175_ == 2)
					cubeTextureFaceCount++;
			}
		}
		int pos = 3 + num_textures;
		int vertexFlagsPos = pos;
		pos += num_vertices;
		int renderTypePos = pos;
		if (setAttributes) {
			pos += num_faces;
		}
		int depthTriTypeOffset = pos;
		pos += num_faces;
		int priorityPos = pos;
		if (priority == 255) {
			pos += num_faces;
		}

		System.out.println(pos+", "+ num_faces);
		int triangleSkinPos = pos;
		pos += num_faces;
		int vertexSkinsPos = pos;
		pos += vertices;
		int alphaPos = pos;
		if (opacityFlag == 1) {
			pos += num_faces;
		}

		System.out.println(pos+", "+ num_faces);
		int depthTriViewspaceOffset = pos;
		pos += modelVertexPoint;
		int texturePos = pos;
		if (skinFlag == 1) {
			pos += num_faces * 2;
		}

		System.out.println(pos+", "+ num_faces +", "+modelVertexPoint);
		int textureCoordPos = pos;
		pos += modelTextureCoords;
		int colorPos = pos;
		pos += num_faces * 2;
		int vertexXOffsetPos = pos;
		pos += modelVerticesX;
		int vertexYOffsetPos = pos;
		pos += modelVerticesY;
		int vertexZOffsetPos = pos;
		pos += modelVerticesZ;
		int texturedTriangleType0Offset = pos;
		pos += simpleTextureFaceCount * 6;
		int texturedTriangleOffset = pos;
		pos += complexTextureFaceCount * 6;
		int particleSize = 6;
		if (protocol == 14) {
			particleSize = 7;
		} else if (protocol >= 15) {
			particleSize = 9;
		}
		int particleDirectionOffset = pos;
		pos += complexTextureFaceCount * particleSize;
		int particleXLifespanOffset = pos;
		pos += complexTextureFaceCount;
		int particleYLifespanOffset = pos;
		pos += complexTextureFaceCount;
		int particleZLifespanAndTextureColorOffset = pos;
		pos += complexTextureFaceCount + cubeTextureFaceCount * 2;
		int particlesOffset = pos;
		int uvFaceIndexOffset = is.length;
		int vertexUVOffset = is.length;
		int texCoordUPos = is.length;
		int texCoordVPos = is.length;
		if (setUVCoordinates) { //TODO
			System.out.println("TODO");
		}
		
		
		vertices_x = new int[num_vertices];
		vertices_y = new int[num_vertices];
		vertices_z = new int[num_vertices];
		faces_a = new short[num_faces];
		faces_b = new short[num_faces];
		faces_c = new short[num_faces];
		if (hasVertexSkins == 1)
			vertices_label = new int[num_vertices];
		if (setAttributes)
			faces_type = new byte[num_faces];
		if (priority == 255)
			faces_layer = new byte[num_faces];
		else
			this.priority = (byte) priority;
		if (opacityFlag == 1)
			faces_trans = new byte[num_faces];
		if (skinWeightFlag == 1)
			face_labels = new int[num_faces];
		if (skinFlag == 1)
			faces_material = new short[num_faces];
		if (skinFlag == 1 && (num_textures > 0 || numUVCoords > 0))
			faces_mapping = new byte[num_faces];
		faces_colour = new short[num_faces];
		if (num_textures > 0) {
			textures_mapping_p = new short[num_textures];
			textures_mapping_m = new short[num_textures];
			textures_mapping_n = new short[num_textures];
			if (complexTextureFaceCount > 0) {
				anIntArray639 = new int[complexTextureFaceCount];
				anIntArray640 = new int[complexTextureFaceCount];
				anIntArray641 = new int[complexTextureFaceCount];
				aByteArray645 = new byte[complexTextureFaceCount];
				aByteArray628 = new byte[complexTextureFaceCount];
				anIntArray637 = new int[complexTextureFaceCount];
			}
			if (cubeTextureFaceCount > 0) {
				anIntArray643 = new int[cubeTextureFaceCount];
				anIntArray648 = new int[cubeTextureFaceCount];
			}
		}
		buffer1.index = vertexFlagsPos * 116413311;
		buffer2.index = vertexXOffsetPos * 116413311;
		buffer3.index = vertexYOffsetPos * 116413311;
		buffer4.index = vertexZOffsetPos * 116413311;
		buffer5.index = vertexSkinsPos * 116413311;
		int i_199_ = 0;
		int i_200_ = 0;
		int i_201_ = 0;
		for (int i_202_ = 0; i_202_ < num_vertices; i_202_++) {
			int i_203_ = buffer1.readUnsignedByte();
			int i_204_ = 0;
			if ((i_203_ & 0x1) != 0)
				i_204_ = buffer2.gSmart1or2s();
			int i_205_ = 0;
			if ((i_203_ & 0x2) != 0)
				i_205_ = buffer3.gSmart1or2s();
			int i_206_ = 0;
			if ((i_203_ & 0x4) != 0)
				i_206_ = buffer4.gSmart1or2s();
			vertices_x[i_202_] = i_199_ + i_204_;
			vertices_y[i_202_] = i_200_ + i_205_;
			vertices_z[i_202_] = i_201_ + i_206_;
			i_199_ = vertices_x[i_202_];
			i_200_ = vertices_y[i_202_];
			i_201_ = vertices_z[i_202_];
			if (hasVertexSkins == 1) {
				if (setLargeVertexSkins) {
					vertices_label[i_202_] = buffer5.readSmartShortMinusOne();
				} else {
					vertices_label[i_202_] = buffer5.readUnsignedByte();
					if (vertices_label[i_202_] == 255)
						vertices_label[i_202_] = -1;
				}
			}
		}
		if (numUVCoords > 0) {
			System.out.println("TODO!");
		}
		buffer1.index = colorPos * 116413311;
		buffer2.index = renderTypePos * 116413311;
		buffer3.index = priorityPos * 116413311;
		buffer4.index = alphaPos * 116413311;
		buffer5.index = triangleSkinPos * 116413311;
		buffer6.index = texturePos * 116413311;
		buffer7.index = textureCoordPos * 116413311;
		for (int i_207_ = 0; i_207_ < num_faces; i_207_++) {
			faces_colour[i_207_] = (short) buffer1.readUnsignedShort();
			if (setAttributes)
				faces_type[i_207_] = buffer2.readByte();
			if (priority == 255)
				faces_layer[i_207_] = buffer3.readByte();
			if (opacityFlag == 1)
				faces_trans[i_207_] = buffer4.readByte();
			if (skinWeightFlag == 1) {
				if (setLargeTriangleSkins) {
					face_labels[i_207_] = buffer5.readSmartShortMinusOne();
				} else {
					face_labels[i_207_] = buffer5.readUnsignedByte();
					if (face_labels[i_207_] == 255)
						face_labels[i_207_] = -1;
				}
			}
			if (skinFlag == 1)
				faces_material[i_207_] = (short) (buffer6.readUnsignedShort() - 1);
			if (faces_mapping != null) {
				if (faces_material[i_207_] != -1)  {
					if (protocol >= 16) {
						faces_mapping[i_207_] = (byte) (buffer7.readUnsignedSmart(0) - 1);
					} else
						faces_mapping[i_207_] = (byte) (buffer7.readUnsignedByte() - 1);
				}else
					faces_mapping[i_207_] = (byte) -1;
			}
		}
		highest_used_vertex = -1;
		buffer1.index = depthTriViewspaceOffset * 116413311;
		buffer2.index = depthTriTypeOffset * 116413311;
		calculateMaxDepth(buffer1, buffer2);
		buffer1.index = texturedTriangleType0Offset * 116413311;
		buffer2.index = texturedTriangleOffset * 116413311;
		buffer3.index = particleDirectionOffset * 116413311;
		buffer4.index = particleXLifespanOffset * 116413311;
		buffer5.index = particleYLifespanOffset * 116413311;
		buffer6.index = particleZLifespanAndTextureColorOffset * 116413311;
		decodeTexturedTriangles(buffer1, buffer2, buffer3, buffer4, buffer5, buffer6);
		buffer1.index = particlesOffset * 116413311;
		if (setParticlesEffects) {
			int i_208_ = buffer1.readUnsignedByte();
			if (i_208_ > 0) {
				particles = new Class85[i_208_];
				for (int i_209_ = 0; i_209_ < i_208_; i_209_++) {
					int i_210_ = buffer1.readUnsignedShort();
					int i_211_ = buffer1.readUnsignedShort();
					byte i_212_;
					if (priority == 255)
						i_212_ = faces_layer[i_211_];
					else
						i_212_ = (byte) priority;
					particles[i_209_] = new Class85(i_210_, faces_a[i_211_], faces_b[i_211_], faces_c[i_211_], i_212_);
				}
			}
			int i_213_ = buffer1.readUnsignedByte();
			if (i_213_ > 0) {
				aClass68Array613 = new Class68[i_213_];
				for (int i_214_ = 0; i_214_ < i_213_; i_214_++) {
					int i_215_ = buffer1.readUnsignedShort();
					int i_216_ = buffer1.readUnsignedShort();
					aClass68Array613[i_214_] = new Class68(i_215_, i_216_);
				}
			}
		}
		if (setBillboards) {
			int i_217_ = buffer1.readUnsignedByte();
			if (i_217_ > 0) {
				aClass84Array649 = new Class84[i_217_];
				for (int i_218_ = 0; i_218_ < i_217_; i_218_++) {
					int i_219_ = buffer1.readUnsignedShort();
					int i_220_ = buffer1.readUnsignedShort();
					int i_221_ = buffer1.readUnsignedByte();
					byte i_222_ = buffer1.readByte();
					aClass84Array649[i_218_] = new Class84(i_219_, i_220_, i_221_, i_222_);
				}
			}
		}
	}

	
	void decodeModel622(byte[] is) {
		RsByteBuffer buffer1 = new RsByteBuffer(is);
		RsByteBuffer buffer2 = new RsByteBuffer(is);
		RsByteBuffer buffer3 = new RsByteBuffer(is);
		RsByteBuffer buffer4 = new RsByteBuffer(is);
		RsByteBuffer buffer5 = new RsByteBuffer(is);
		RsByteBuffer buffer6 = new RsByteBuffer(is);
		RsByteBuffer buffer7 = new RsByteBuffer(is);
		buffer1.index = (is.length - 23) * 116413311;
		num_vertices = buffer1.readUnsignedShort();
		num_faces = buffer1.readUnsignedShort();
		num_textures = buffer1.readUnsignedByte();
		int i = buffer1.readUnsignedByte();
		boolean bool = (i & 0x1) == 1;
		boolean bool_158_ = (i & 0x2) == 2;
		boolean bool_159_ = (i & 0x4) == 4;
		boolean bool_160_ = (i & 0x8) == 8;
		if (bool_160_) {
			buffer1.index -= 814893177;
			protocol = buffer1.readUnsignedByte();
			buffer1.index += 698479866;
		}
		int i_161_ = buffer1.readUnsignedByte();
		int i_162_ = buffer1.readUnsignedByte();
		int i_163_ = buffer1.readUnsignedByte();
		int i_164_ = buffer1.readUnsignedByte();
		int i_165_ = buffer1.readUnsignedByte();
		int i_166_ = buffer1.readUnsignedShort();
		int i_167_ = buffer1.readUnsignedShort();
		int i_168_ = buffer1.readUnsignedShort();
		int i_169_ = buffer1.readUnsignedShort();
		int i_170_ = buffer1.readUnsignedShort();
		int i_171_ = 0;
		int i_172_ = 0;
		int i_173_ = 0;
		if (num_textures > 0) {
			textures_mapping = new byte[num_textures];
			buffer1.index = 0;
			for (int i_174_ = 0; i_174_ < num_textures; i_174_++) {
				byte i_175_ = (textures_mapping[i_174_] = buffer1.readByte());
				if (i_175_ == 0)
					i_171_++;
				if (i_175_ >= 1 && i_175_ <= 3)
					i_172_++;
				if (i_175_ == 2)
					i_173_++;
			}
		}
		int i_176_ = num_textures;
		int i_177_ = i_176_;
		i_176_ += num_vertices;
		int i_178_ = i_176_;
		if (bool)
			i_176_ += num_faces;
		int i_179_ = i_176_;
		i_176_ += num_faces;
		int i_180_ = i_176_;
		if (i_161_ == 255)
			i_176_ += num_faces;
		int i_181_ = i_176_;
		if (i_163_ == 1)
			i_176_ += num_faces;
		int i_182_ = i_176_;
		if (i_165_ == 1)
			i_176_ += num_vertices;
		int i_183_ = i_176_;
		if (i_162_ == 1)
			i_176_ += num_faces;
		int i_184_ = i_176_;
		i_176_ += i_169_;
		int i_185_ = i_176_;
		if (i_164_ == 1)
			i_176_ += num_faces * 2;
		int i_186_ = i_176_;
		i_176_ += i_170_;
		int i_187_ = i_176_;
		i_176_ += num_faces * 2;
		int i_188_ = i_176_;
		i_176_ += i_166_;
		int i_189_ = i_176_;
		i_176_ += i_167_;
		int i_190_ = i_176_;
		i_176_ += i_168_;
		int i_191_ = i_176_;
		i_176_ += i_171_ * 6;
		int i_192_ = i_176_;
		i_176_ += i_172_ * 6;
		int i_193_ = 6;
		if (protocol == 14)
			i_193_ = 7;
		else if (protocol >= 15)
			i_193_ = 9;
		int i_194_ = i_176_;
		i_176_ += i_172_ * i_193_;
		int i_195_ = i_176_;
		i_176_ += i_172_;
		int i_196_ = i_176_;
		i_176_ += i_172_;
		int i_197_ = i_176_;
		i_176_ += i_172_ + i_173_ * 2;
		int i_198_ = i_176_;
		vertices_x = new int[num_vertices];
		vertices_y = new int[num_vertices];
		vertices_z = new int[num_vertices];
		faces_a = new short[num_faces];
		faces_b = new short[num_faces];
		faces_c = new short[num_faces];
		if (i_165_ == 1)
			vertices_label = new int[num_vertices];
		if (bool)
			faces_type = new byte[num_faces];
		if (i_161_ == 255)
			faces_layer = new byte[num_faces];
		else
			priority = (byte) i_161_;
		if (i_162_ == 1)
			faces_trans = new byte[num_faces];
		if (i_163_ == 1)
			face_labels = new int[num_faces];
		if (i_164_ == 1)
			faces_material = new short[num_faces];
		if (i_164_ == 1 && num_textures > 0)
			faces_mapping = new byte[num_faces];
		faces_colour = new short[num_faces];
		if (num_textures > 0) {
			textures_mapping_p = new short[num_textures];
			textures_mapping_m = new short[num_textures];
			textures_mapping_n = new short[num_textures];
			if (i_172_ > 0) {
				anIntArray639 = new int[i_172_];
				anIntArray640 = new int[i_172_];
				anIntArray641 = new int[i_172_];
				aByteArray645 = new byte[i_172_];
				aByteArray628 = new byte[i_172_];
				anIntArray637 = new int[i_172_];
			}
			if (i_173_ > 0) {
				anIntArray643 = new int[i_173_];
				anIntArray648 = new int[i_173_];
			}
		}
		buffer1.index = i_177_ * 116413311;
		buffer2.index = i_188_ * 116413311;
		buffer3.index = i_189_ * 116413311;
		buffer4.index = i_190_ * 116413311;
		buffer5.index = i_182_ * 116413311;
		int i_199_ = 0;
		int i_200_ = 0;
		int i_201_ = 0;
		for (int i_202_ = 0; i_202_ < num_vertices; i_202_++) {
			int i_203_ = buffer1.readUnsignedByte();
			int i_204_ = 0;
			if ((i_203_ & 0x1) != 0)
				i_204_ = buffer2.gSmart1or2s();
			int i_205_ = 0;
			if ((i_203_ & 0x2) != 0)
				i_205_ = buffer3.gSmart1or2s();
			int i_206_ = 0;
			if ((i_203_ & 0x4) != 0)
				i_206_ = buffer4.gSmart1or2s();
			vertices_x[i_202_] = i_199_ + i_204_;
			vertices_y[i_202_] = i_200_ + i_205_;
			vertices_z[i_202_] = i_201_ + i_206_;
			i_199_ = vertices_x[i_202_];
			i_200_ = vertices_y[i_202_];
			i_201_ = vertices_z[i_202_];
			if (i_165_ == 1)
				vertices_label[i_202_] = buffer5.readUnsignedByte();
		}
		buffer1.index = i_187_ * 116413311;
		buffer2.index = i_178_ * 116413311;
		buffer3.index = i_180_ * 116413311;
		buffer4.index = i_183_ * 116413311;
		buffer5.index = i_181_ * 116413311;
		buffer6.index = i_185_ * 116413311;
		buffer7.index = i_186_ * 116413311;
		for (int i_207_ = 0; i_207_ < num_faces; i_207_++) {
			faces_colour[i_207_] = (short) buffer1.readUnsignedShort();
			if (bool)
				faces_type[i_207_] = buffer2.readByte();
			if (i_161_ == 255)
				faces_layer[i_207_] = buffer3.readByte();
			if (i_162_ == 1)
				faces_trans[i_207_] = buffer4.readByte();
			if (i_163_ == 1)
				face_labels[i_207_] = buffer5.readUnsignedByte();
			if (i_164_ == 1)
				faces_material[i_207_] = (short) (buffer6.readUnsignedShort() - 1);
			if (faces_mapping != null) {
				if (faces_material[i_207_] != -1)
					faces_mapping[i_207_] = (byte) (buffer7.readUnsignedByte() - 1);
				else
					faces_mapping[i_207_] = (byte) -1;
			}
		}
		highest_used_vertex = -1;
		buffer1.index = i_184_ * 116413311;
		buffer2.index = i_179_ * 116413311;
		calculateMaxDepth(buffer1, buffer2);
		buffer1.index = i_191_ * 116413311;
		buffer2.index = i_192_ * 116413311;
		buffer3.index = i_194_ * 116413311;
		buffer4.index = i_195_ * 116413311;
		buffer5.index = i_196_ * 116413311;
		buffer6.index = i_197_ * 116413311;
		decodeTexturedTriangles(buffer1, buffer2, buffer3, buffer4, buffer5, buffer6);
		buffer1.index = i_198_ * 116413311;
		if (bool_158_) {
			int i_208_ = buffer1.readUnsignedByte();
			if (i_208_ > 0) {
				particles = new Class85[i_208_];
				for (int i_209_ = 0; i_209_ < i_208_; i_209_++) {
					int i_210_ = buffer1.readUnsignedShort();
					int i_211_ = buffer1.readUnsignedShort();
					byte i_212_;
					if (i_161_ == 255)
						i_212_ = faces_layer[i_211_];
					else
						i_212_ = (byte) i_161_;
					particles[i_209_] = new Class85(i_210_, faces_a[i_211_], faces_b[i_211_], faces_c[i_211_], i_212_);
				}
			}
			int i_213_ = buffer1.readUnsignedByte();
			if (i_213_ > 0) {
				aClass68Array613 = new Class68[i_213_];
				for (int i_214_ = 0; i_214_ < i_213_; i_214_++) {
					int i_215_ = buffer1.readUnsignedShort();
					int i_216_ = buffer1.readUnsignedShort();
					aClass68Array613[i_214_] = new Class68(i_215_, i_216_);
				}
			}
		}
		if (bool_159_) {
			int i_217_ = buffer1.readUnsignedByte();
			if (i_217_ > 0) { //glow
				aClass84Array649 = new Class84[i_217_];
				for (int i_218_ = 0; i_218_ < i_217_; i_218_++) {
					int i_219_ = buffer1.readUnsignedShort();
					int i_220_ = buffer1.readUnsignedShort();
					int i_221_ = buffer1.readUnsignedByte();
					byte i_222_ = buffer1.readByte();
					aClass84Array649[i_218_] = new Class84(i_219_, i_220_, i_221_, i_222_);
				}
			}
		}
	}

	public int[][] method759() {
		int[] is = new int[256];
		int i = 0;
		for (int i_223_ = 0; i_223_ < aClass84Array649.length; i_223_++) {
			int i_224_ = aClass84Array649[i_223_].anInt766 * -1606786303;
			if (i_224_ >= 0) {
				is[i_224_]++;
				if (i_224_ > i)
					i = i_224_;
			}
		}
		int[][] is_225_ = new int[i + 1][];
		for (int i_226_ = 0; i_226_ <= i; i_226_++) {
			is_225_[i_226_] = new int[is[i_226_]];
			is[i_226_] = 0;
		}
		for (int i_227_ = 0; i_227_ < aClass84Array649.length; i_227_++) {
			int i_228_ = aClass84Array649[i_227_].anInt766 * -1606786303;
			if (i_228_ >= 0)
				is_225_[i_228_][is[i_228_]++] = i_227_;
		}
		return is_225_;
	}
	
	public void printColors() {
		List<Integer> colors = new ArrayList<Integer>();
		for (int color : faces_colour) {
			if (!colors.contains(color))
				colors.add(color);
		}
		System.out.println(colors);
	}
	
	//127659
	public void setOSRSTextures(int id) {
		if (faces_material != null) {
			for (int i = 0; i < faces_material.length; i++) {
				if (faces_material[i] != -1) {
					faces_material[i] += Settings.OSRS_TEXTURE_OFFSET;
					faces_material[i] = (short) TextureLoader.replaceTexture(faces_material[i]);
				}
			}
		}
	}
}
