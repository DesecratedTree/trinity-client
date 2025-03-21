/* Class330_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub17 extends Class330 {
	public int anInt7621;
	public int anInt7622;
	public int anInt7623;
	public int anInt7624;
	public int anInt7625;
	public int anInt7626;
	public int anInt7627;
	public int anInt7628;
	public int anInt7629;

	Class330_Sub17(Buffer class330_sub46) {
		int i = class330_sub46.readInt((byte) 94);
		anInt7625 = -531709089 * (i >>> 28);
		anInt7622 = (i >>> 14 & 0x3fff) * -1237103341;
		anInt7627 = (i & 0x3fff) * 1642723157;
		anInt7624 = class330_sub46.readUnsignedByte(1657586499) * -592796627;
		anInt7628 = class330_sub46.readUnsignedByte(1297016395) * -181452483;
		anInt7621 = class330_sub46.readUnsignedByte(1579865698) * -1309403503;
		anInt7623 = class330_sub46.readUnsignedByte(882237985) * -650605641;
		anInt7626 = class330_sub46.readUnsignedByte(1240712095) * 830330029;
		anInt7629 = class330_sub46.readUnsignedByte(108629629) * -1385938565;
	}
}
