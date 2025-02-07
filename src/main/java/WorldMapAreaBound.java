/* Class298_Sub42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class WorldMapAreaBound extends Class298 {
	int fromX;
	int vToY;
	int vFromX;
	int vToX;
	int toX;
	int vFromY;
	int fromY;
	int height;
	int toY;

	boolean method3520(int i, int i_0_, int i_1_, int i_2_) {
		try {
			if (height * -206354885 == i && i_0_ >= vFromX * -731405573 && i_0_ <= 480895455 * vToX && i_1_ >= -1728316981 * vFromY && i_1_ <= -176293349 * vToY) {
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aca.f(").append(')').toString());
		}
	}

	boolean method3521(int i, int i_3_, int i_4_) {
		try {
			if (i >= vFromX * -731405573 && i <= 480895455 * vToX && i_3_ >= -1728316981 * vFromY && i_3_ <= -176293349 * vToY) {
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aca.a(").append(')').toString());
		}
	}

	boolean method3522(int i, int i_5_, byte i_6_) {
		try {
			if (i >= fromX * 1528024175 && i <= toX * 37578241 && i_5_ >= 50981941 * fromY && i_5_ <= toY * 1374138429) {
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aca.b(").append(')').toString());
		}
	}

	void method3523(int i, int i_7_, int[] is, int i_8_) {
		try {
			is[0] = -206354885 * height;
			is[1] = (-731405573 * vFromX - 1528024175 * fromX + i);
			is[2] = i_7_ + (vFromY * -1728316981 - 50981941 * fromY);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aca.p(").append(')').toString());
		}
	}

	WorldMapAreaBound(int height, int vFromX, int vFromY, int vToX, int vToY, int fromX, int fromY, int toX, int toY) {
		//System.out.println("Them values! " + i + ", " + i_9_ + ", " + i_10_ + ", " + i_11_ + ", " + i_12_ + ", " + i_13_ + ", " + i_14_ + ", " + i_15_ + ", " + i_16_);
		this.height = 301572851 * height;
		this.vFromX = vFromX * 868816947;
		this.vFromY = -1243061277 * vFromY;
		this.vToX = vToX * 992156191;
		this.vToY = 878333971 * vToY;
		this.fromX = fromX * -134278513;
		this.fromY = 1339754013 * fromY;
		this.toX = toX * 1785108993;
		this.toY = toY * 734947093;
	}

	void method3524(int i, int i_17_, int[] is, int i_18_) {
		try {
			is[0] = 0;
			is[1] = (fromX * 1528024175 - vFromX * -731405573 + i);
			is[2] = (50981941 * fromY - -1728316981 * vFromY + i_17_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aca.i(").append(')').toString());
		}
	}
}
