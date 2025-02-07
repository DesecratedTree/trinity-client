import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* Class432 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ObjectConfig {
	byte updateVertices;
	public int anInt5364;
	public int id;
	public int[] toObjectIDs;
	public short[] modifiedColors;
	public String name = "null";
	short[] originalColors;
	public int[] anIntArray5370;
	byte[] aByteArray5371;
	short[] originalTextures;
	public short[] modifiedTextures;
	public int[][] modelIDs;
	byte aByte5375;
	public int opcode23V;
	byte aByte5377 = 0;
	int[] animationIDs;
	int opcode70V;
	boolean printColors;
	public int cliped;
	public boolean aBoolean5381;
	public int optionType;
	public int sizeY;
	int updateVertices2;
	public boolean updateFaces;
	public int sizeX = -2144855351;
	public int anInt5387;
	public int anInt5388;
	public boolean aBoolean5389;
	int[] anIntArray5390;
	public int opcode28V;
	int shadow;
	int lightness;
	public String[] options;
	public boolean aBoolean5395;
	int opcode71V;
	public int anInt5397;
	public int anInt5398;
	public int mapIconID;
	public int objectIconID;
	public boolean aBoolean5401;
	public int anInt5402;
	Class433 aClass433_5403;
	public boolean reverse;
	public boolean hasShadow;
	int scaleX;
	int scaleY;
	public int opcode78V2;
	public int opcode75V;
	public boolean notDecoration;
	int opcode72V;
	int anInt5412;
	int anInt5413;
	int scaleZ;
	byte aByte5415;
	public boolean ignoreClipOnAlternativeRoute;
	byte aByte5417;
	public int anInt5418;
	int anInt5419;
	int varbit;
	int var;
	public int ambientSoundID;
	public static short[] aShortArray5423 = new short[256];
	public boolean solid;
	public int anInt5425;
	public boolean aBoolean5426;
	public int opcode79V1;
	public int opcode79V2;
	public int[] opcode79A;
	public byte[] modelTypes;
	public boolean aBoolean5431;
	public boolean aBoolean5432;
	public boolean scenaryShadows;
	public boolean aBoolean5434;
	LinkedArrayList aClass437_5435;
	public int anInt5436;
	public int anInt5437;
	public int anInt5438;
	public int anInt5439;
	public boolean aBoolean5440;
	public boolean aBoolean5441;
	private byte[] unknownArray3;
	private byte[] unknownArray4;
	private int[] aj;
	static int anInt5442 = 127007;

	
	public static final Map<Integer, Integer> osrsMapIcons = new HashMap<Integer, Integer>();
	static {
		Map<Integer, Integer> map = osrsMapIcons;
		map.put(0, 555);
		map.put(1, 556);
		map.put(2, 557);
		map.put(3, 558);
		map.put(4, 559);
		map.put(5, 560);
		map.put(6, 561);
		map.put(7, 562);
		map.put(8, 563);
		map.put(9, 564);
		map.put(10, 565);
		map.put(11, 566);
		map.put(12, 567);
		map.put(13, 567); //added manually dungeon2
		map.put(15, 569);
		map.put(16, 570);
		map.put(17, 571);
		map.put(18, 572);
		map.put(19, 573);
		map.put(20, 574);
		map.put(21, 575);
		map.put(22, 576);
		map.put(23, 577); //added manually
		map.put(24, 578);
		map.put(25, 579);
		map.put(26, 580);
		map.put(27, 581);
		map.put(28, 582);
		map.put(29, 583);
		map.put(30, 584);
		map.put(31, 585);
		map.put(32, 586);
		map.put(33, 587);
		map.put(34, 588);
		map.put(35, 589);
		map.put(36, 590);
		map.put(37, 591);
		map.put(38, 592);
		map.put(39, 593);
		map.put(40, 594);
		map.put(41, 595);
		map.put(42, 596);
		map.put(43, 597);
		map.put(44, 598);
		map.put(45, 599);
		map.put(46, 600);
		map.put(47, 601);
		map.put(48, 602);
		map.put(49, 603);
		map.put(50, 604);
		map.put(51, 605);
		map.put(52, 606);
		map.put(53, 607);
		map.put(54, 608);
		map.put(55, 611);
		map.put(56, 609);
		map.put(57, 610);
		map.put(58, 612);
		map.put(60, 613);
		map.put(61, 614);
		map.put(62, 615);
		map.put(63, 616);
		map.put(64, 617);
		map.put(65, 618); //added manually hunter
		//map.put(66, ); //added manually deposit box
		map.put(71, 625); //added manually agility shortcut
		
		//619 fur
		//620 quest
		//621 poh
		//622 state agent
		//623 sawmill
		//624 stonemanson
		//627 holiday event
	/*	for (int i = 0; i < 10; i++) {
			map.put(66 + i, 619 +i); //added manually
		}*/
	}

	void decodeOSRS(RsByteBuffer buffer, int opcode, int i_0_) {
		try {
			if (1 == opcode) { //done
				int i_1_ = buffer.readUnsignedByte();
				if (modelIDs == null) {
					modelTypes = new byte[i_1_];
					modelIDs = new int[i_1_][];
					for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
						modelIDs[i_2_] = new int[1]; //only 1 model per type on osrs
						modelIDs[i_2_][0] = buffer.readUnsignedShort() + Settings.OSRS_MODEL_OFFSET;
						modelTypes[i_2_] = (byte) buffer.readUnsignedByte(); //no type -1 on osrs
					}
				} else { //skip low quality models
					for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
						buffer.readUnsignedShort();
						buffer.readUnsignedByte();
					}
				}
			} else if (opcode == 5) { //done
				int length = buffer.readUnsignedByte();
				int[] ids = new int[length];
				for (int i = 0; i < length; i++) 
					ids[i] = buffer.readUnsignedShort() + Settings.OSRS_MODEL_OFFSET;
				if (modelIDs == null) { //skip low detail
					modelTypes = new byte[23];
					modelIDs = new int[23][];
					for (int i = 0; i <= 22; i++) {
						modelTypes[i] = (byte) i;
						modelIDs[i] = ids;
					}
				}
			} else if (opcode == 2)  //done
				name = buffer.readString(-1849485656);
			else if (14 == opcode) //done
				sizeX = buffer.readUnsignedByte() * -2144855351;
			else if (opcode == 15) //done
				sizeY = buffer.readUnsignedByte() * 44056569;
			else if (opcode == 17) { //done
				cliped = 0;
				solid = false;
			} else if (opcode == 18) //done
				solid = false;
			else if (19 == opcode) //done
				optionType = buffer.readUnsignedByte() * 455422743;
			else if (21 == opcode) //done. sets to 0 on rs.? default is 0 on this client so iguess its right
				((ObjectConfig) this).updateVertices = (byte) 1;
			else if (opcode == 22) //done. 
				updateFaces = true;
			else if (opcode == 23)  //done. 
				opcode23V = -580315545;
			else if (24 == opcode) {  //done
				int animation = buffer.readUnsignedShort();
				if (animation != -1)
					((ObjectConfig) this).animationIDs = new int[] { animation + Settings.OSRS_ANIMATIONS_OFFSET };
				
				int id = 1181652947 * this.id;
	/*			if (id == 137735)
					System.out.println("anim : "+animation);*/
				
			} else if (opcode == 27)  //done
				cliped = 268680417;
			else if (28 == opcode)  //done but on osrs no << 2. change if necessary
				opcode28V = ((buffer.readUnsignedByte() << 2) * 803995289);
			else if (opcode == 29) //done
				((ObjectConfig) this).shadow = buffer.readByte() * -62240291;
			else if (39 == opcode) //done
				((ObjectConfig) this).lightness = buffer.readByte() * -1530589831;
			else if (opcode >= 30 && opcode < 35) { //done
				options[opcode - 30] = buffer.readString(2140843487);
				if (options[opcode - 30].equalsIgnoreCase("hidden"))
					options[opcode - 30] = null;
			} else if (opcode == 40) { //done
				int i_6_ = buffer.readUnsignedByte();
				((ObjectConfig) this).originalColors = new short[i_6_];
				modifiedColors = new short[i_6_];
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
					((ObjectConfig) this).originalColors[i_7_] = (short) buffer.readUnsignedShort();
					modifiedColors[i_7_] = (short) buffer.readUnsignedShort();
				}
			} else if (opcode == 41) { //done but these ids may need change to osrs textures
				int i_8_ = buffer.readUnsignedByte();
				((ObjectConfig) this).originalTextures = new short[i_8_];
				modifiedTextures = new short[i_8_];
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
					((ObjectConfig) this).originalTextures[i_9_] = (short) ((short) buffer.readUnsignedShort()  + Settings.OSRS_TEXTURE_OFFSET);
					modifiedTextures[i_9_] = (short) ((short) buffer.readUnsignedShort()  + Settings.OSRS_TEXTURE_OFFSET);
				}
			} else if (opcode == 62) //done
				reverse = true;
			else if (64 == opcode) //done
				hasShadow = false;
			else if (65 == opcode) //done
				((ObjectConfig) this).scaleX = buffer.readUnsignedShort() * 929519655;
			else if (66 == opcode) //done
				((ObjectConfig) this).scaleY = buffer.readUnsignedShort() * -1076239419;
			else if (opcode == 67) //done
				((ObjectConfig) this).scaleZ = buffer.readUnsignedShort() * 1192395179;
			else if (opcode == 68) { //osrs map sprite. we dont use done
				int id = buffer.readUnsignedShort();
				objectIconID = id * 475870643;
				if (id == 88)
					objectIconID = 0;
				
			} else if (opcode == 69)
				
				
				buffer.readUnsignedByte(); //acessBlockFlag, used by routefinder, not by client done
			else if (opcode == 70) //done
				((ObjectConfig) this).opcode70V = (buffer.readShort(1954619354) << 2) * 804752437;
			else if (opcode == 71) //done
				((ObjectConfig) this).opcode71V = ((buffer.readShort(1981333343) << 2) * -830213317);
			else if (opcode == 72) //done
				((ObjectConfig) this).opcode72V = ((buffer.readShort(2079097901) << 2) * 1957563615);
			else if (opcode == 73) //done
				notDecoration = true;
			else if (opcode == 74) //done
				ignoreClipOnAlternativeRoute = true;
			else if (opcode == 75) //done
				opcode75V = buffer.readUnsignedByte() * 1763780945;
			else if (77 == opcode || 92 == opcode) { //done but disabled vars for osrs
				((ObjectConfig) this).varbit = buffer.readUnsignedShort() * -1228374415;
				if (65535 == 1064010385 * ((ObjectConfig) this).varbit || true)
					((ObjectConfig) this).varbit = 1228374415;
				((ObjectConfig) this).var = buffer.readUnsignedShort() * -2115564225;
				if (65535 == -1128963393 * ((ObjectConfig) this).var  || true)
					((ObjectConfig) this).var = 2115564225;
				int i_12_ = -1;
				if (92 == opcode) {
					i_12_ = buffer.readUnsignedShort();
					if (i_12_ == 65535)
						i_12_ = -1;
					else
						i_12_ += Settings.OSRS_OBJECT_OFFSET;
				}
				int i_13_ = buffer.readUnsignedByte();
				toObjectIDs = new int[2 + i_13_];
				for (int i_14_ = 0; i_14_ <= i_13_; i_14_++) {
					toObjectIDs[i_14_] = buffer.readUnsignedShort();
					if (toObjectIDs[i_14_] == 65535)
						toObjectIDs[i_14_] = -1;
					else
						toObjectIDs[i_14_] += Settings.OSRS_OBJECT_OFFSET;
				}
				toObjectIDs[i_13_ + 1] = i_12_;
			} else if (opcode == 78) { //done
				ambientSoundID = buffer.readUnsignedShort() * -349046175;
				opcode78V2 = buffer.readUnsignedByte() * -634552289;
			} else if (opcode == 79) {  //done
				opcode79V1 = buffer.readUnsignedShort() * 1882310759;
				opcode79V2 = buffer.readUnsignedShort() * 1376401661;
				opcode78V2 = buffer.readUnsignedByte() * -634552289;
				int i_15_ = buffer.readUnsignedByte();
				opcode79A = new int[i_15_];
				for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
					opcode79A[i_16_] = buffer.readUnsignedShort();
			} else if (81 == opcode) {
				((ObjectConfig) this).updateVertices = (byte) 2;
				((ObjectConfig) this).updateVertices2 = buffer.readUnsignedByte() * -1868938496;
			} else if (82 == opcode) { //mapIconID
				int mapIconId = buffer.readUnsignedShort();
				Integer realID = osrsMapIcons.get(mapIconId);
				if (realID != null)
					mapIconID = realID  * -779127471;
			} else if (opcode == 249) {
				int i_23_ = buffer.readUnsignedByte();
				if (((ObjectConfig) this).aClass437_5435 == null) {
					int i_24_ = Class416.method5590(i_23_, (byte) 16);
					((ObjectConfig) this).aClass437_5435 = new LinkedArrayList(i_24_);
				}
				for (int i_25_ = 0; i_25_ < i_23_; i_25_++) {
					boolean bool = buffer.readUnsignedByte() == 1;
					int i_26_ = buffer.read24BitUnsignedInteger((byte) 44);
					Class298 class298;
					if (bool)
						class298 = new ObjectValue(buffer.readString(-2143557829));
					else
						class298 = new IntegerValue(buffer.readInt((byte) -68));
					((ObjectConfig) this).aClass437_5435.method5817(class298, (long) i_26_);
				}
			} else {
				System.out.println("Missing opcode osrs object: "+opcode);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.f(").append(')').toString());
		}
	}
	
	void decode(RsByteBuffer stream, int i, int i_0_) {
		try {
			if (1 == i) {
				int i_1_ = stream.readUnsignedByte();
				modelTypes = new byte[i_1_];
				modelIDs = new int[i_1_][];
				for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
					modelTypes[i_2_] = stream.readByte();
					int i_3_ = stream.readUnsignedByte();
					modelIDs[i_2_] = new int[i_3_];
					for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
						modelIDs[i_2_][i_4_] = stream.readBigSmart(1235052657);
				}
			} else if (i == 2)
				name = stream.readString(-1849485656);
			else if (14 == i)
				sizeX = stream.readUnsignedByte() * -2144855351;
			else if (i == 15)
				sizeY = stream.readUnsignedByte() * 44056569;
			else if (i == 17) {
				cliped = 0;
				solid = false;
			} else if (i == 18)
				solid = false;
			else if (19 == i)
				optionType = stream.readUnsignedByte() * 455422743;
			else if (21 == i)
				((ObjectConfig) this).updateVertices = (byte) 1;
			else if (i == 22)
				updateFaces = true;
			else if (i == 23)
				opcode23V = -580315545;
			else if (24 == i) {
				int i_5_ = stream.readBigSmart(1235052657);
				if (i_5_ != -1)
					((ObjectConfig) this).animationIDs = new int[] { i_5_ };
			} else if (i == 27)
				cliped = 268680417;
			else if (28 == i)
				opcode28V = ((stream.readUnsignedByte() << 2) * 803995289);
			else if (i == 29)
				((ObjectConfig) this).shadow = stream.readByte() * -62240291;
			else if (39 == i)
				((ObjectConfig) this).lightness = stream.readByte() * -1530589831;
			else if (i >= 30 && i < 35)
				options[i - 30] = stream.readString(2140843487);
			else if (i == 40) {
				int i_6_ = stream.readUnsignedByte();
				((ObjectConfig) this).originalColors = new short[i_6_];
				modifiedColors = new short[i_6_];
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
					((ObjectConfig) this).originalColors[i_7_] = (short) stream.readUnsignedShort();
					modifiedColors[i_7_] = (short) stream.readUnsignedShort();
				}
			} else if (i == 41) {
				int i_8_ = stream.readUnsignedByte();
				((ObjectConfig) this).originalTextures = new short[i_8_];
				modifiedTextures = new short[i_8_];
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
					((ObjectConfig) this).originalTextures[i_9_] = (short) stream.readUnsignedShort();
					modifiedTextures[i_9_] = (short) stream.readUnsignedShort();
				}
			} else if (i == 42) {
				int i_10_ = stream.readUnsignedByte();
				((ObjectConfig) this).aByteArray5371 = new byte[i_10_];
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
					((ObjectConfig) this).aByteArray5371[i_11_] = stream.readByte();
			} else if (44 == i) {
				int i_86_ = (short) stream.readUnsignedShort();
				int i_87_ = 0;
				for (int i_88_ = i_86_; i_88_ > 0; i_88_ >>= 1)
					i_87_++;
				unknownArray3 = new byte[i_87_];
				byte i_89_ = 0;
				for (int i_90_ = 0; i_90_ < i_87_; i_90_++) {
					if ((i_86_ & 1 << i_90_) > 0) {
						unknownArray3[i_90_] = i_89_;
						i_89_++;
					} else
						unknownArray3[i_90_] = (byte) -1;
				}
			} else if (i == 45) {
				int i_91_ = (short) stream.readUnsignedShort();
				int i_92_ = 0;
				for (int i_93_ = i_91_; i_93_ > 0; i_93_ >>= 1)
					i_92_++;
				unknownArray4 = new byte[i_92_];
				byte i_94_ = 0;
				for (int i_95_ = 0; i_95_ < i_92_; i_95_++) {
					if ((i_91_ & 1 << i_95_) > 0) {
						unknownArray4[i_95_] = i_94_;
						i_94_++;
					} else
						unknownArray4[i_95_] = (byte) -1;
				}
			} else if (i == 62)
				reverse = true;
			else if (64 == i)
				hasShadow = false;
			else if (65 == i)
				((ObjectConfig) this).scaleX = stream.readUnsignedShort() * 929519655;
			else if (66 == i)
				((ObjectConfig) this).scaleY = stream.readUnsignedShort() * -1076239419;
			else if (i == 67)
				((ObjectConfig) this).scaleZ = stream.readUnsignedShort() * 1192395179;
			else if (i == 69)
				stream.readUnsignedByte();
			else if (i == 70)
				((ObjectConfig) this).opcode70V = (stream.readShort(1954619354) << 2) * 804752437;
			else if (i == 71)
				((ObjectConfig) this).opcode71V = ((stream.readShort(1981333343) << 2) * -830213317);
			else if (i == 72)
				((ObjectConfig) this).opcode72V = ((stream.readShort(2079097901) << 2) * 1957563615);
			else if (i == 73)
				notDecoration = true;
			else if (i == 74)
				ignoreClipOnAlternativeRoute = true;
			else if (i == 75)
				opcode75V = stream.readUnsignedByte() * 1763780945;
			else if (77 == i || 92 == i) {
				((ObjectConfig) this).varbit = stream.readUnsignedShort() * -1228374415;
				if (65535 == 1064010385 * ((ObjectConfig) this).varbit)
					((ObjectConfig) this).varbit = 1228374415;
				((ObjectConfig) this).var = stream.readUnsignedShort() * -2115564225;
				if (65535 == -1128963393 * ((ObjectConfig) this).var)
					((ObjectConfig) this).var = 2115564225;
				int i_12_ = -1;
				if (92 == i)
					i_12_ = stream.readBigSmart(1235052657);
				int i_13_ = stream.readUnsignedByte();
				toObjectIDs = new int[2 + i_13_];
				for (int i_14_ = 0; i_14_ <= i_13_; i_14_++)
					toObjectIDs[i_14_] = stream.readBigSmart(1235052657);
				toObjectIDs[i_13_ + 1] = i_12_;
			} else if (i == 78) {
				ambientSoundID = stream.readUnsignedShort() * -349046175;
				opcode78V2 = stream.readUnsignedByte() * -634552289;
			} else if (i == 79) {
				opcode79V1 = stream.readUnsignedShort() * 1882310759;
				opcode79V2 = stream.readUnsignedShort() * 1376401661;
				opcode78V2 = stream.readUnsignedByte() * -634552289;
				int i_15_ = stream.readUnsignedByte();
				opcode79A = new int[i_15_];
				for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
					opcode79A[i_16_] = stream.readUnsignedShort();
			} else if (81 == i) {
				((ObjectConfig) this).updateVertices = (byte) 2;
				((ObjectConfig) this).updateVertices2 = stream.readUnsignedByte() * -1868938496;
			} else if (i == 82)
				aBoolean5432 = true;
			else if (88 == i)
				scenaryShadows = false;
			else if (i == 89)
				aBoolean5431 = false;
			else if (91 == i)
				aBoolean5434 = true;
			else if (i == 93) {
				((ObjectConfig) this).updateVertices = (byte) 3;
				((ObjectConfig) this).updateVertices2 = stream.readUnsignedShort() * -242181565;
			} else if (i == 94)
				((ObjectConfig) this).updateVertices = (byte) 4;
			else if (95 == i) {
				((ObjectConfig) this).updateVertices = (byte) 5;
				((ObjectConfig) this).updateVertices2 = stream.readShort(2013201622) * -242181565;
			} else if (97 == i)
				aBoolean5401 = true;
			else if (98 == i)
				aBoolean5381 = true;
			else if (99 == i) {
				anInt5397 = stream.readUnsignedByte() * 2064530465;
				anInt5436 = stream.readUnsignedShort() * -1320066331;
			} else if (100 == i) {
				anInt5398 = stream.readUnsignedByte() * 1406097311;
				anInt5364 = stream.readUnsignedShort() * 474865427;
			} else if (101 == i)
				anInt5402 = stream.readUnsignedByte() * 1747447869;
			else if (i == 102) {
				objectIconID = stream.readUnsignedShort() * 475870643;
			}else if (103 == i)
				opcode23V = 0;
			else if (104 == i)
				anInt5425 = stream.readUnsignedByte() * 1861040235;
			else if (i == 105)
				aBoolean5440 = true;
			else if (106 == i) {
				int i_17_ = stream.readUnsignedByte();
				int i_18_ = 0;
				((ObjectConfig) this).animationIDs = new int[i_17_];
				((ObjectConfig) this).anIntArray5390 = new int[i_17_];
				for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
					((ObjectConfig) this).animationIDs[i_19_] = stream.readBigSmart(1235052657);
					i_18_ += ((ObjectConfig) this).anIntArray5390[i_19_] = stream.readUnsignedByte();
				}
				for (int i_20_ = 0; i_20_ < i_17_; i_20_++)
					((ObjectConfig) this).anIntArray5390[i_20_] = (65535 * ((ObjectConfig) this).anIntArray5390[i_20_] / i_18_);
			} else if (i == 107) {
				mapIconID = stream.readUnsignedShort() * -779127471;
			}else if (i >= 150 && i < 155) {
				options[i - 150] = stream.readString(67859332);
				if (!((Class433) ((ObjectConfig) this).aClass433_5403).aBoolean5445)
					options[i - 150] = null;
			} else if (160 == i) {
				int i_21_ = stream.readUnsignedByte();
				anIntArray5370 = new int[i_21_];
				for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
					anIntArray5370[i_22_] = stream.readUnsignedShort();
			} else if (i == 162) {
				((ObjectConfig) this).updateVertices = (byte) 3;
				((ObjectConfig) this).updateVertices2 = stream.readInt((byte) 30) * -242181565;
			} else if (i == 163) {
				((ObjectConfig) this).aByte5417 = stream.readByte();
				((ObjectConfig) this).aByte5375 = stream.readByte();
				((ObjectConfig) this).aByte5415 = stream.readByte();
				((ObjectConfig) this).aByte5377 = stream.readByte();
			} else if (i == 164)
				((ObjectConfig) this).anInt5412 = stream.readShort(2119621102) * -1121469985;
			else if (165 == i)
				((ObjectConfig) this).anInt5413 = stream.readShort(1762145274) * 1097094883;
			else if (166 == i)
				((ObjectConfig) this).anInt5419 = stream.readShort(1892618723) * -870210675;
			else if (i == 167)
				anInt5418 = stream.readUnsignedShort() * 597954411;
			else if (168 == i)
				aBoolean5426 = true;
			else if (169 == i)
				aBoolean5395 = true;
			else if (170 == i)
				anInt5387 = stream.readUnsignedSmart(1723054621) * -1277797453;
			else if (171 == i)
				anInt5388 = stream.readUnsignedSmart(1723054621) * 883280249;
			else if (i == 173) {
				anInt5438 = stream.readUnsignedShort() * 1097791615;
				anInt5439 = stream.readUnsignedShort() * -127624289;
			} else if (i == 177)
				aBoolean5389 = true;
			else if (178 == i)
				anInt5437 = stream.readUnsignedByte() * -1122029857;
			else if (i == 189)
				aBoolean5441 = true;
			else if (i >= 190 && i < 196) {
				if (aj == null) {
					aj = new int[6];
					Arrays.fill(aj, -1);
				}
				aj[i - 190] = stream.readUnsignedShort();
			} else if (i == 249) {
				int i_23_ = stream.readUnsignedByte();
				if (((ObjectConfig) this).aClass437_5435 == null) {
					int i_24_ = Class416.method5590(i_23_, (byte) 16);
					((ObjectConfig) this).aClass437_5435 = new LinkedArrayList(i_24_);
				}
				for (int i_25_ = 0; i_25_ < i_23_; i_25_++) {
					boolean bool = stream.readUnsignedByte() == 1;
					int i_26_ = stream.read24BitUnsignedInteger((byte) 44);
					Class298 class298;
					if (bool)
						class298 = new ObjectValue(stream.readString(-2143557829));
					else
						class298 = new IntegerValue(stream.readInt((byte) -68));
					((ObjectConfig) this).aClass437_5435.method5817(class298, (long) i_26_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.f(").append(')').toString());
		}
	}

	public String method5770(int i, String string, int i_27_) {
		try {
			if (((ObjectConfig) this).aClass437_5435 == null)
				return string;
			ObjectValue class298_sub29 = ((ObjectValue) ((ObjectConfig) this).aClass437_5435.method5812((long) i));
			if (class298_sub29 == null)
				return string;
			return (String) class298_sub29.value;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.q(").append(')').toString());
		}
	}

	public final boolean method5771(int i, byte i_28_) {
		try {
			if (modelIDs == null)
				return true;
			boolean bool = true;
			synchronized (((Class433) ((ObjectConfig) this).aClass433_5403).aClass243_5447) {
				for (int i_29_ = 0; i_29_ < modelTypes.length; i_29_++) {
					if (modelTypes[i_29_] == i) {
						for (int i_30_ = 0; i_30_ < modelIDs[i_29_].length; i_30_++) {
							if (!((Class433) ((ObjectConfig) this).aClass433_5403).aClass243_5447.method2290(modelIDs[i_29_][i_30_], 0, -1404450418))
								bool = false;
						}
					}
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.p(").append(')').toString());
		}
	}

	public final boolean method5772(int i) {
		try {
			if (modelIDs == null)
				return true;
			boolean bool = true;
			synchronized (((Class433) ((ObjectConfig) this).aClass433_5403).aClass243_5447) {
				for (int i_31_ = 0; i_31_ < modelIDs.length; i_31_++) {
					for (int i_32_ = 0; i_32_ < modelIDs[i_31_].length; i_32_++)
						bool &= (((Class433) ((ObjectConfig) this).aClass433_5403).aClass243_5447.method2290(modelIDs[i_31_][i_32_], 0, -1427920512));
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.i(").append(')').toString());
		}
	}

	public boolean method5773(int i, int i_33_) {
		try {
			if (((ObjectConfig) this).animationIDs != null && -1 != i) {
				for (int i_34_ = 0; i_34_ < ((ObjectConfig) this).animationIDs.length; i_34_++) {
					if (((ObjectConfig) this).animationIDs[i_34_] == i)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.h(").append(')').toString());
		}
	}

	public final synchronized Class387 method5774(GraphicsToolkit class_ra, int i, int i_35_, int i_36_, Class_xa class_xa, Class_xa class_xa_37_, int i_38_, int i_39_, int i_40_, Class438 class438, Class435 class435, byte i_41_) {
		try {
			if (Shortcut.method4261(i_35_, 1883717056))
				i_35_ = Class424.aClass424_6596.anInt6613 * -1976050083;
			long l = (long) (i_36_ + ((i_35_ << 3) + (1181652947 * id << 10)));
			int i_42_ = i;
			l |= (long) (class_ra.anInt5298 * 580915349 << 29);
			if (null != class435)
				l |= (((Class435) class435).aLong5460 * 2595045048596347611L << 32);
			if (class438 != null)
				i |= class438.method5829(-1790708337);
			if (((ObjectConfig) this).updateVertices == 3)
				i |= 0x7;
			else {
				if (((ObjectConfig) this).updateVertices != 0 || 0 != 52797131 * ((ObjectConfig) this).anInt5413)
					i |= 0x2;
				if (945504799 * ((ObjectConfig) this).anInt5412 != 0)
					i |= 0x1;
				if (0 != ((ObjectConfig) this).anInt5419 * 1782732613)
					i |= 0x4;
			}
			if (Class424.aClass424_6611.anInt6613 * -1976050083 == i_35_ && i_36_ > 3)
				i |= 0x5;
			Class387 class387;
			synchronized (((Class433) ((ObjectConfig) this).aClass433_5403).aClass348_5451) {
				class387 = (Class387) ((Class433) ((ObjectConfig) this).aClass433_5403).aClass348_5451.get(l);
			}
			if (class387 == null || class_ra.method5017(class387.m(), i) != 0) {
				if (class387 != null)
					i = class_ra.method5004(i, class387.m());
				class387 = method5775(class_ra, i, i_35_, i_36_, class435, 1981902641);
				if (null == class387)
					return null;
				synchronized (((Class433) ((ObjectConfig) this).aClass433_5403).aClass348_5451) {
					((Class433) ((ObjectConfig) this).aClass433_5403).aClass348_5451.method4194(class387, l);
				}
			}
			boolean bool = false;
			if (class438 != null) {
				class387 = class387.method4755((byte) 1, i, true);
				bool = true;
				class438.method5839(class387, i_36_ & 0x3, 1865606525);
			}
			if (i_35_ == -1976050083 * Class424.aClass424_6611.anInt6613 && i_36_ > 3) {
				if (!bool) {
					class387 = class387.method4755((byte) 3, i, true);
					bool = true;
				}
				class387.f(2048);
			}
			if (((ObjectConfig) this).updateVertices != 0) {
				if (!bool) {
					class387 = class387.method4755((byte) 3, i, true);
					bool = true;
				}
				class387.pa(((ObjectConfig) this).updateVertices, 1762198123 * ((ObjectConfig) this).updateVertices2, class_xa, class_xa_37_, i_38_, i_39_, i_40_);
			}
			if (945504799 * ((ObjectConfig) this).anInt5412 != 0 || 0 != ((ObjectConfig) this).anInt5413 * 52797131 || 0 != 1782732613 * ((ObjectConfig) this).anInt5419) {
				if (!bool) {
					class387 = class387.method4755((byte) 3, i, true);
					bool = true;
				}
				class387.ia(945504799 * ((ObjectConfig) this).anInt5412, ((ObjectConfig) this).anInt5413 * 52797131, 1782732613 * ((ObjectConfig) this).anInt5419);
			}
			if (bool)
				class387.KA(i_42_);
			return class387;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.d(").append(')').toString());
		}
	}

	Class387 method5775(GraphicsToolkit class_ra, int i, int i_43_, int i_44_, Class435 class435, int i_45_) {
		try {
			int i_46_ = ((ObjectConfig) this).shadow * -1536403851 + 64;
			int i_47_ = -2019557395 * ((ObjectConfig) this).lightness + 850;
			int i_48_ = i;
			boolean bool = (reverse || (i_43_ == Class424.aClass424_6593.anInt6613 * -1976050083 && i_44_ > 3));
			if (bool)
				i |= 0x10;
			if (i_44_ == 0) {
				if (-166422633 * ((ObjectConfig) this).scaleX != 128 || ((ObjectConfig) this).opcode70V * -1514641891 != 0)
					i |= 0x1;
				if (128 != ((ObjectConfig) this).scaleZ * -895192829 || 0 != 2145431327 * ((ObjectConfig) this).opcode72V)
					i |= 0x4;
			} else
				i |= 0xd;
			if (128 != 668312333 * ((ObjectConfig) this).scaleY || ((ObjectConfig) this).opcode71V * 1536191987 != 0)
				i |= 0x2;
			if (null != ((ObjectConfig) this).originalColors)
				i |= 0x4000;
			if (((ObjectConfig) this).originalTextures != null)
				i |= 0x8000;
			if (((ObjectConfig) this).aByte5377 != 0)
				i |= 0x80000;
			Class387 class387 = null;
			if (null != modelTypes) {
				int i_49_ = -1;
				for (int i_50_ = 0; i_50_ < modelTypes.length; i_50_++) {
					if (i_43_ == modelTypes[i_50_]) {
						i_49_ = i_50_;
						break;
					}
				}
				if (i_49_ == -1)
					return null;
				int[] is = ((class435 != null && ((Class435) class435).anIntArray5463 != null) ? ((Class435) class435).anIntArray5463 : modelIDs[i_49_]);
				int i_51_ = is.length;
				if (i_51_ > 0) {
					long l = (long) (580915349 * class_ra.anInt5298);
					for (int i_52_ = 0; i_52_ < i_51_; i_52_++)
						l = (long) is[i_52_] + 67783L * l;
					synchronized (((Class433) ((ObjectConfig) this).aClass433_5403).aClass348_5450) {
						class387 = ((Class387) ((Class433) ((ObjectConfig) this).aClass433_5403).aClass348_5450.get(l));
					}
					if (null != class387) {
						if (i_46_ != class387.c())
							i |= 0x1000;
						if (i_47_ != class387.Z())
							i |= 0x2000;
					}
					if (null == class387 || class_ra.method5017(class387.m(), i) != 0) {
						int i_53_ = i | 0x1f01f;
						if (class387 != null)
							i_53_ = class_ra.method5004(i_53_, class387.m());
						Model class64 = null;
						synchronized (((Class433) ((ObjectConfig) this).aClass433_5403).aClass64Array5443) {
							for (int i_54_ = 0; i_54_ < i_51_; i_54_++) {
									
								synchronized (((Class433) (((ObjectConfig) this).aClass433_5403)).aClass243_5447) {
									class64 = (Model.loadModel((((Class433) (((ObjectConfig) this).aClass433_5403)).aClass243_5447), is[i_54_], 0));
								}
								if (null == class64) {
									Class387 class387_55_ = null;
									return class387_55_;
								}

								/*if (notDecoration) {
									class64.translate(0, 5, 0);
								}*/
								if (class64.protocol < 13)
									class64.resize(2);
								int id = 1181652947 * this.id;
								if (id >= Settings.OSRS_OBJECT_OFFSET) 
										class64.translate(0, -i_54_ * 1, 0);
								
								if (i_51_ > 1)
									((Class433) ((ObjectConfig) this).aClass433_5403).aClass64Array5443[i_54_] = class64;
							}
							if (i_51_ > 1)
								class64 = new Model((((Class433) (((ObjectConfig) this).aClass433_5403)).aClass64Array5443), i_51_);

							if(printColors)
								class64.printSortedModelClrs();
						}
						int id = 1181652947 * this.id;
						if(id == 10050)
							class64.translate(0, 12, 0);

						if(retextureClr != null) {
							for(int tex = 0; tex < retextureClr.length; tex++) {
								class64.setTexture(new int[] {retextureClr[tex]}, retextureTexture[tex]);
							}
						}
						if (id >= Settings.OSRS_OBJECT_OFFSET) { //fix floor flikering
							//if (i_43_ == 22 || i_43_ == 10 || i_43_ == 11)
								class64.translate(0, i_43_ == 22 ? -4 : 1, 0);
							if (id == 132104 || id == 131670) //fix this object flikering
								class64.translate(0, -1, 0);
							else if ((id >= 132171 && id <= 132180))
								class64.translate(0, -4, 0);
							else if ((id >= 113705 && id <= 113714)  || id == 130034)
								class64.translate(0, -15, 0);
							else if (id >= 137670 && id <= 137950)
								class64.translate(0, -42, 0);
							else if (id == 136199 || id == 136200 ||  id == 130032) // cox
								class64.translate(0, -12, 0);
							else if (id >= 131486 && id <= 131553 && i_43_ == 10) //pk skull
									class64.translate(0, -12, 0);
							else if (id == 129820)
								class64.translate(0, -18, 0);
							else if ((id >= 129880 && id <= 129888) || id == 129823) // cox
								class64.translate(0, -2, 0);
							else if(id >= 130078 && id <= 130090)
								class64.translate(0, -4, 0);
							else if (id == 129734)
								class64.translate(0, -22, 0);

								
						}
						class387 = class_ra.method5037(class64, i_53_, (((Class433) (((ObjectConfig) this).aClass433_5403)).anInt5453) * -914670477, i_46_, i_47_);
						synchronized (((Class433) ((ObjectConfig) this).aClass433_5403).aClass348_5450) {
							((Class433) ((ObjectConfig) this).aClass433_5403).aClass348_5450.method4194(class387, l);
						}
					}
				}
			}
			if (null == class387)
				return null;
			Class387 class387_56_ = class387.method4755((byte) 0, i, true);
			if (i_46_ != class387.c())
				class387_56_.p(i_46_);
			if (i_47_ != class387.Z())
				class387_56_.Q(i_47_);
			if (bool)
				class387_56_.wa();
			if (i_43_ == Class424.aClass424_6596.anInt6613 * -1976050083 && i_44_ > 3) {
				class387_56_.S(2048);
				class387_56_.ia(180, 0, -180);
			}
			i_44_ &= 0x3;
			if (1 == i_44_)
				class387_56_.S(4096);
			else if (2 == i_44_)
				class387_56_.S(8192);
			else if (i_44_ == 3)
				class387_56_.S(12288);
			if (null != ((ObjectConfig) this).originalColors) {
				short[] is;
				if (class435 != null && ((Class435) class435).aShortArray5462 != null)
					is = ((Class435) class435).aShortArray5462;
				else
					is = modifiedColors;
				for (int i_57_ = 0; i_57_ < ((ObjectConfig) this).originalColors.length; i_57_++) {
					if (((ObjectConfig) this).aByteArray5371 != null && i_57_ < ((ObjectConfig) this).aByteArray5371.length)
						class387_56_.X((((ObjectConfig) this).originalColors[i_57_]), aShortArray5423[(((ObjectConfig) this).aByteArray5371[i_57_]) & 0xff]);
					else
						class387_56_.X((((ObjectConfig) this).originalColors[i_57_]), is[i_57_]);
				}
			}
			if (null != ((ObjectConfig) this).originalTextures) {
				short[] is;
				if (null != class435 && null != ((Class435) class435).aShortArray5461)
					is = ((Class435) class435).aShortArray5461;
				else
					is = modifiedTextures;
				for (int i_58_ = 0; i_58_ < ((ObjectConfig) this).originalTextures.length; i_58_++)
					class387_56_.W(((ObjectConfig) this).originalTextures[i_58_], is[i_58_]);
			}
			if (0 != ((ObjectConfig) this).aByte5377)
				class387_56_.PA(((ObjectConfig) this).aByte5417, ((ObjectConfig) this).aByte5375, ((ObjectConfig) this).aByte5415, ((ObjectConfig) this).aByte5377 & 0xff);
			if (-166422633 * ((ObjectConfig) this).scaleX != 128 || 668312333 * ((ObjectConfig) this).scaleY != 128 || 128 != -895192829 * ((ObjectConfig) this).scaleZ)
				class387_56_.oa(((ObjectConfig) this).scaleX * -166422633, ((ObjectConfig) this).scaleY * 668312333, ((ObjectConfig) this).scaleZ * -895192829);
			if (0 != ((ObjectConfig) this).opcode70V * -1514641891 || 0 != 1536191987 * ((ObjectConfig) this).opcode71V || 0 != ((ObjectConfig) this).opcode72V * 2145431327)
				class387_56_.ia(-1514641891 * ((ObjectConfig) this).opcode70V, ((ObjectConfig) this).opcode71V * 1536191987, ((ObjectConfig) this).opcode72V * 2145431327);
			class387_56_.KA(i_48_);
			return class387_56_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.u(").append(')').toString());
		}
	}

	public int method5776(int i, int i_59_, byte i_60_) {
		try {
			if (null == ((ObjectConfig) this).aClass437_5435)
				return i_59_;
			IntegerValue class298_sub35 = ((IntegerValue) ((ObjectConfig) this).aClass437_5435.method5812((long) i));
			if (null == class298_sub35)
				return i_59_;
			return -774922497 * class298_sub35.intValue;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.r(").append(')').toString());
		}
	}

	public static Map<Integer, Integer> osrsVars = new HashMap<Integer, Integer>();
	
	public boolean osrsVarEnabled;
	
	public final ObjectConfig method5777(Interface23 interface23, int i) {
		try {
			int i_61_ = -1;
			if (((ObjectConfig) this).varbit * 1064010385 != -1)
				i_61_ = interface23.method250((((ObjectConfig) this).varbit * 1064010385), (byte) 36);
			else if (-1128963393 * ((ObjectConfig) this).var != -1)
				i_61_ = interface23.method252((((ObjectConfig) this).var * -1128963393), (byte) 99);
			int id = 1181652947 * this.id;
			if (i_61_ == -1 && id >= Settings.OSRS_OBJECT_OFFSET) {
				Integer value = osrsVars.get(id);
				i_61_ = value != null ? value : (osrsVarEnabled ? 0 :toObjectIDs.length - 2); // last one
			}
			if (i_61_ < 0 || i_61_ >= toObjectIDs.length - 1 || -1 == toObjectIDs[i_61_]) {
				int i_62_ = toObjectIDs[toObjectIDs.length - 1];
				if (-1 != i_62_)
					return ((ObjectConfig) this).aClass433_5403.getObjectDefinitions(i_62_);
				return null;
			}
		return ((ObjectConfig) this).aClass433_5403.getObjectDefinitions(toObjectIDs[i_61_]);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.x(").append(')').toString());
		}
	}

	void method5778(int i) {
		try {
			if (1532834983 * optionType == -1) {
				optionType = 0;
				if (null != modelTypes && 1 == modelTypes.length && (modelTypes[0] == Class424.aClass424_6611.anInt6613 * -1976050083))
					optionType = 455422743;
				for (int i_63_ = 0; i_63_ < 5; i_63_++) {
					if (null != options[i_63_]) {
						optionType = 455422743;
						break;
					}
				}
			}
			if (512737201 * opcode75V == -1)
				opcode75V = 1763780945 * (cliped * -2144543407 != 0 ? 1 : 0);
			if (method5779(934270378) || aBoolean5381 || null != toObjectIDs)
				aBoolean5389 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.b(").append(')').toString());
		}
	}

	public boolean method5779(int i) {
		try {
			return ((ObjectConfig) this).animationIDs != null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.s(").append(')').toString());
		}
	}

	public boolean method5780(int i) {
		try {
			return (((ObjectConfig) this).animationIDs != null && ((ObjectConfig) this).animationIDs.length > 1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.z(").append(')').toString());
		}
	}

	public int method5781(byte i) {
		try {
			if (null != ((ObjectConfig) this).animationIDs) {
				if (((ObjectConfig) this).animationIDs.length > 1) {
					int i_64_ = (int) (Math.random() * 65535.0);
					for (int i_65_ = 0; i_65_ < ((ObjectConfig) this).animationIDs.length; i_65_++) {
						if (i_64_ <= ((ObjectConfig) this).anIntArray5390[i_65_])
							return ((ObjectConfig) this).animationIDs[i_65_];
						i_64_ -= ((ObjectConfig) this).anIntArray5390[i_65_];
					}
				} else
					return ((ObjectConfig) this).animationIDs[0];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.y(").append(')').toString());
		}
	}

	public int[] method5782(int i) {
		try {
			return ((ObjectConfig) this).animationIDs;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.t(").append(')').toString());
		}
	}

	void decode(RsByteBuffer class298_sub53, int i) {
		try {
			int id = 1181652947 * this.id;
			for (;;) {
				int i_66_ = class298_sub53.readUnsignedByte();
				if (i_66_ == 0) {
					if (i != -1780393822) {
						/* empty */
					}
					break;
				}
				if (id >= Settings.OSRS_OBJECT_OFFSET) {
					decodeOSRS(class298_sub53, i_66_, -537941504);
				} else
					
					decode(class298_sub53, i_66_, -537941504);
			}
			if (id >= Settings.OSRS_OBJECT_OFFSET) {
				if (this.updateFaces 
						|| (id >= 128680 && id <= 128830)
						|| (id >= 129000 && id <= 129916)
						|| (id >= 134559 && id <= 134561)
						|| (id >= 134565 - 5 && id <= 134565 + 10)
						|| (id >= 132944  && id <= 132944 + 30)
						|| (id >= 132862  && id <= 132862 + 5))
					scenaryShadows = false; //disable new shadows
				if (1532834983 * optionType == -1 && name != null && !name.equals("null") && modelIDs.length == 23)
					optionType = 1  * 455422743;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.a(").append(')').toString());
		}
	}

	ObjectConfig() {
		sizeY = 44056569;
		cliped = -2019485854;
		solid = true;
		optionType = -455422743;
		((ObjectConfig) this).updateVertices = (byte) 0;
		((ObjectConfig) this).updateVertices2 = 242181565;
		updateFaces = false;
		opcode23V = 325083707;
		anInt5387 = 1675091776;
		anInt5388 = 0;
		((ObjectConfig) this).animationIDs = null;
		((ObjectConfig) this).anIntArray5390 = null;
		opcode28V = -83909056;
		((ObjectConfig) this).shadow = 0;
		((ObjectConfig) this).lightness = 0;
		anInt5436 = 1320066331;
		anInt5364 = -474865427;
		anInt5397 = -2064530465;
		anInt5398 = -1406097311;
		mapIconID = 779127471;
		objectIconID = -475870643;
		aBoolean5401 = false;
		anInt5402 = 0;
		aBoolean5440 = false;
		reverse = false;
		hasShadow = true;
		((ObjectConfig) this).scaleX = -1280568448;
		((ObjectConfig) this).scaleY = -319692160;
		((ObjectConfig) this).scaleZ = -1992239744;
		((ObjectConfig) this).opcode70V = 0;
		((ObjectConfig) this).opcode71V = 0;
		((ObjectConfig) this).opcode72V = 0;
		((ObjectConfig) this).anInt5412 = 0;
		((ObjectConfig) this).anInt5413 = 0;
		((ObjectConfig) this).anInt5419 = 0;
		notDecoration = false;
		ignoreClipOnAlternativeRoute = false;
		opcode75V = -1763780945;
		anInt5418 = 0;
		((ObjectConfig) this).varbit = 1228374415;
		((ObjectConfig) this).var = 2115564225;
		ambientSoundID = 349046175;
		opcode78V2 = 0;
		anInt5437 = 0;
		anInt5425 = 2118857365;
		aBoolean5426 = false;
		opcode79V1 = 0;
		opcode79V2 = 0;
		aBoolean5395 = false;
		aBoolean5431 = true;
		aBoolean5432 = false;
		scenaryShadows = true;
		aBoolean5434 = false;
		aBoolean5381 = false;
		anInt5438 = 1861779200;
		anInt5439 = 1687920384;
		aBoolean5389 = false;
		aBoolean5441 = false;
	}

	public boolean method5784(int i) {
		try {
			if (null == toObjectIDs)
				return ambientSoundID * 393750945 != -1 || opcode79A != null;
			for (int i_67_ = 0; i_67_ < toObjectIDs.length; i_67_++) {
				if (toObjectIDs[i_67_] != -1) {
					ObjectConfig class432_68_ = ((ObjectConfig) this).aClass433_5403.getObjectDefinitions(toObjectIDs[i_67_]);
					if (-1 != 393750945 * class432_68_.ambientSoundID || null != class432_68_.opcode79A)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.n(").append(')').toString());
		}
	}

	public final synchronized Class454 method5785(GraphicsToolkit class_ra, int i, int i_69_, int i_70_, Class_xa class_xa, Class_xa class_xa_71_, int i_72_, int i_73_, int i_74_, boolean bool, Class435 class435, int i_75_) {
		try {
			if (Shortcut.method4261(i_69_, -1998635010))
				i_69_ = Class424.aClass424_6596.anInt6613 * -1976050083;
			long l = (long) ((1181652947 * id << 10) + (i_69_ << 3) + i_70_);
			l |= (long) (class_ra.anInt5298 * 580915349 << 29);
			if (class435 != null)
				l |= (2595045048596347611L * ((Class435) class435).aLong5460 << 32);
			int i_76_ = i;
			if (3 == ((ObjectConfig) this).updateVertices)
				i_76_ |= 0x7;
			else {
				if (0 != ((ObjectConfig) this).updateVertices || 52797131 * ((ObjectConfig) this).anInt5413 != 0)
					i_76_ |= 0x2;
				if (945504799 * ((ObjectConfig) this).anInt5412 != 0)
					i_76_ |= 0x1;
				if (1782732613 * ((ObjectConfig) this).anInt5419 != 0)
					i_76_ |= 0x4;
			}
			if (bool)
				i_76_ |= 0x40000;
			Class454 class454;
			synchronized (((Class433) ((ObjectConfig) this).aClass433_5403).aClass348_5452) {
				class454 = (Class454) ((Class433) ((ObjectConfig) this).aClass433_5403).aClass348_5452.get(l);
			}
			Class387 class387 = (Class387) (class454 != null ? class454.anObject5645 : null);
			Class_na class_na = null;
			do {
				if (class387 == null || class_ra.method5017(class387.m(), i_76_) != 0) {
					if (null != class387)
						i_76_ = class_ra.method5004(i_76_, class387.m());
					int i_77_ = i_76_;
					if ((i_69_ == Class424.aClass424_6611.anInt6613 * -1976050083) && i_70_ > 3)
						i_77_ |= 0x5;
					class387 = method5775(class_ra, i_77_, i_69_, i_70_, class435, 1553510063);
					if (class387 == null)
						return null;
					if ((i_69_ == Class424.aClass424_6611.anInt6613 * -1976050083) && i_70_ > 3)
						class387.f(2048);
					if (bool)
						class_na = class387.ga(null);
					class387.KA(i_76_);
					class454 = new Class454(class387, class_na);
					synchronized (((Class433) ((ObjectConfig) this).aClass433_5403).aClass348_5452) {
						((Class433) ((ObjectConfig) this).aClass433_5403).aClass348_5452.method4194(class454, l);
						break;
					}
				}
				class_na = (Class_na) class454.anObject5646;
				if (bool && class_na == null)
					class_na = (Class_na) (class454.anObject5646 = class387.ga(null));
			} while (false);
			boolean bool_78_ = (((ObjectConfig) this).updateVertices != 0 && (null != class_xa || class_xa_71_ != null));
			boolean bool_79_ = (((ObjectConfig) this).anInt5412 * 945504799 != 0 || ((ObjectConfig) this).anInt5413 * 52797131 != 0 || 0 != ((ObjectConfig) this).anInt5419 * 1782732613);
			if (bool_78_ || bool_79_) {
				class387 = class387.method4755((byte) 0, i_76_, true);
				if (bool_78_)
					class387.pa(((ObjectConfig) this).updateVertices, 1762198123 * ((ObjectConfig) this).updateVertices2, class_xa, class_xa_71_, i_72_, i_73_, i_74_);
				if (bool_79_)
					class387.ia(((ObjectConfig) this).anInt5412 * 945504799, 52797131 * ((ObjectConfig) this).anInt5413, ((ObjectConfig) this).anInt5419 * 1782732613);
				class387.KA(i);
			} else
				class387 = class387.method4755((byte) 0, i, true);
			((Class433) ((ObjectConfig) this).aClass433_5403).aClass454_5456.anObject5645 = class387;
			((Class433) ((ObjectConfig) this).aClass433_5403).aClass454_5456.anObject5646 = class_na;
			return (((Class433) ((ObjectConfig) this).aClass433_5403).aClass454_5456);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.k(").append(')').toString());
		}
	}

	public static Interface19 method5786(RsByteBuffer class298_sub53, byte i) {
		try {
			Class337 class337 = Class291.method2789(class298_sub53.readUnsignedByte(), (byte) -73);
			if (Class337.aClass337_3627 == class337)
				return Class238.method2201(class298_sub53, -1749563274);
			if (class337 == Class337.aClass337_3625)
				return Class237.method2195(class298_sub53, (byte) 1);
			if (class337 == Class337.aClass337_3624)
				return Class422_Sub7.method5651(class298_sub53, (byte) -67);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.a(").append(')').toString());
		}
	}

	static final void method5787(ClientScript2 class403, int i) {
		try {
			if (null != client.aByteArray8843)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 1;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.ahp(").append(')').toString());
		}
	}

	public static boolean method5788(char c, short i) {
		try {
			return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.y(").append(')').toString());
		}
	}

	static void method5789(int i) {
		try {
			Class305.method3751((byte) 127);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.aa(").append(')').toString());
		}
	}

	int[] retextureClr = null;
	int[] retextureTexture = null;
	/* replace a list of colors with 1 texture */
	public void addTexture(int[] clr, int tex) {
		int[] texs = new int[clr.length];
		for(int i = 0; i < clr.length; i++)
			texs[i] = tex;

		addTexture(clr, texs);
	}
	/* replac colors with specific textures */
	public void addTexture(int[] clr, int tex[]) {
		retextureClr = clr;
		retextureTexture = tex;
	}

	public boolean hasOption(String name) {
		for (String s : options)
			if (s != null && s.equalsIgnoreCase(name))
				return true;
		return false;

	}
}
