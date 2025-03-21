/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Vector;

public class Class180 {
	Class76_Sub2 aClass76_Sub2_1762;
	Class76_Sub2 aClass76_Sub2_1763;
	Interface11_Impl3_Impl1 anInterface11_Impl3_Impl1_1764;
	Interface8_Impl1_Impl2 anInterface8_Impl1_Impl2_1765;
	Class86 aClass86_1766;
	Interface11_Impl3_Impl1 anInterface11_Impl3_Impl1_1767;
	Interface8_Impl1_Impl2 anInterface8_Impl1_Impl2_1768;
	int anInt1769;
	Interface8_Impl1_Impl2 anInterface8_Impl1_Impl2_1770;
	Interface8_Impl1_Impl2 anInterface8_Impl1_Impl2_1771;
	Class_ra_Sub2 aClass_ra_Sub2_1772;
	Interface8_Impl1_Impl1 anInterface8_Impl1_Impl1_1773;
	int anInt1774;
	int anInt1775;
	Interface11_Impl3_Impl1 anInterface11_Impl3_Impl1_1776;
	boolean aBoolean1777;
	Vector aVector1778 = new Vector();
	Interface9_Impl1 anInterface9_Impl1_1779;
	Class184 aClass184_1780;
	int anInt1781;
	Interface8_Impl1_Impl1 anInterface8_Impl1_Impl1_1782;

	void method2053() {
		if (((Class180) this).anInterface9_Impl1_1779 == null) {
			((Class180) this).anInterface9_Impl1_1779 = ((Class180) this).aClass_ra_Sub2_1772.method4976(false);
			((Class180) this).anInterface9_Impl1_1779.method142(12, 4);
			ByteBuffer bytebuffer = ((Class180) this).aClass_ra_Sub2_1772.aByteBuffer8458;
			bytebuffer.clear();
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(2.0F);
			((Class180) this).anInterface9_Impl1_1779.method97(0, bytebuffer.position(), ((Class180) this).aClass_ra_Sub2_1772.aLong8459);
			((Class180) this).aClass184_1780 = (((Class180) this).aClass_ra_Sub2_1772.method4977(new Class193[] { new Class193(Class191.aClass191_1861) }));
		}
	}

	void method2054() {
		((Class180) this).aClass_ra_Sub2_1772.method5081(0, ((Class180) this).anInterface9_Impl1_1779);
		((Class180) this).aClass_ra_Sub2_1772.method4978(((Class180) this).aClass184_1780);
		((Class180) this).aClass_ra_Sub2_1772.method4898(Class199.aClass199_1926, 0, 1);
	}

	void method2055() {
		method2053();
		switch (((Class180) this).anInt1774) {
		case 0:
			((Class180) this).aClass86_1766 = Class86.aClass86_714;
			break;
		default:
			throw new RuntimeException();
		case 2:
			((Class180) this).aClass86_1766 = Class86.aClass86_717;
			break;
		case 1:
			((Class180) this).aClass86_1766 = Class86.aClass86_716;
		}
		((Class180) this).aClass76_Sub2_1762 = ((Class180) this).aClass_ra_Sub2_1772.ag();
		if (((Class180) this).aClass_ra_Sub2_1772.anInt8490 > 1 && ((Class180) this).aClass_ra_Sub2_1772.aBoolean8595 && ((Class180) this).aClass_ra_Sub2_1772.aBoolean8496) {
			((Class180) this).aClass76_Sub2_1763 = ((Class180) this).aClass_ra_Sub2_1772.ag();
			((Class180) this).anInterface8_Impl1_Impl2_1771 = (((Class180) this).aClass_ra_Sub2_1772.az(((Class180) this).anInt1781, ((Class180) this).anInt1775, Class72.aClass72_620, ((Class180) this).aClass86_1766, ((Class180) this).aClass_ra_Sub2_1772.anInt8490));
			((Class180) this).anInterface8_Impl1_Impl1_1773 = (((Class180) this).aClass_ra_Sub2_1772.av(((Class180) this).anInt1781, ((Class180) this).anInt1775, ((Class180) this).aClass_ra_Sub2_1772.anInt8490));
		}
		((Class180) this).anInterface11_Impl3_Impl1_1764 = (((Class180) this).aClass_ra_Sub2_1772.method4953(Class72.aClass72_620, ((Class180) this).aClass86_1766, ((Class180) this).anInt1781, ((Class180) this).anInt1775));
		((Class180) this).anInterface8_Impl1_Impl2_1768 = ((Class180) this).anInterface11_Impl3_Impl1_1764.method169(0);
		((Class180) this).anInterface11_Impl3_Impl1_1776 = (((Class180) this).aClass_ra_Sub2_1772.method4953(Class72.aClass72_620, ((Class180) this).aClass86_1766, ((Class180) this).anInt1781, ((Class180) this).anInt1775));
		((Class180) this).anInterface8_Impl1_Impl2_1765 = ((Class180) this).anInterface11_Impl3_Impl1_1776.method169(0);
		((Class180) this).anInterface11_Impl3_Impl1_1767 = (((Class180) this).aClass_ra_Sub2_1772.method4953(Class72.aClass72_620, ((Class180) this).aClass86_1766, ((Class180) this).anInt1781, ((Class180) this).anInt1775));
		((Class180) this).anInterface8_Impl1_Impl2_1770 = ((Class180) this).anInterface11_Impl3_Impl1_1767.method169(0);
		((Class180) this).anInterface8_Impl1_Impl1_1782 = ((Class180) this).aClass_ra_Sub2_1772.ah((((Class180) this).anInt1781), (((Class180) this).anInt1775));
		int i = ((Class180) this).aVector1778.size();
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			Class192 class192 = (Class192) ((Class180) this).aVector1778.elementAt(i_0_);
			class192.method2103(((Class180) this).anInt1781, ((Class180) this).anInt1775);
		}
	}

	boolean method2056(int i, Class192 class192) {
		if (class192.method2099() || class192.method2110()) {
			((Class180) this).aVector1778.insertElementAt(class192, i);
			class192.method2103(((Class180) this).anInt1781, ((Class180) this).anInt1775);
			int i_1_ = class192.method2107();
			if (i_1_ > ((Class180) this).anInt1774)
				((Class180) this).anInt1774 = i_1_;
			((Class192) class192).aBoolean1880 = true;
			return true;
		}
		method2057(class192);
		return true;
	}

	void method2057(Class192 class192) {
		class192.method2101();
		((Class192) class192).aBoolean1880 = false;
		((Class180) this).aVector1778.removeElement(class192);
	}

	boolean method2058(int i, int i_2_, int i_3_, int i_4_) {
		if (((Class180) this).aVector1778.isEmpty())
			return false;
		if (((Class180) this).anInt1781 != i_3_ || ((Class180) this).anInt1775 != i_4_ || (((Class180) this).aClass_ra_Sub2_1772.anInt8490 != ((Class180) this).anInt1769)) {
			((Class180) this).anInt1769 = ((Class180) this).aClass_ra_Sub2_1772.anInt8490;
			((Class180) this).anInt1781 = i_3_;
			((Class180) this).anInt1775 = i_4_;
			method2061();
			method2055();
		}
		((Class180) this).aClass76_Sub2_1762.method901(0, ((Class180) this).anInterface8_Impl1_Impl2_1770);
		if (((Class180) this).anInterface8_Impl1_Impl1_1782 != null)
			((Class180) this).aClass76_Sub2_1762.method900(((Class180) this).anInterface8_Impl1_Impl1_1782);
		if (((Class180) this).aClass76_Sub2_1763 != null) {
			((Class180) this).aClass76_Sub2_1763.method901(0, ((Class180) this).anInterface8_Impl1_Impl2_1771);
			((Class180) this).aClass76_Sub2_1763.method900(((Class180) this).anInterface8_Impl1_Impl1_1773);
			((Class180) this).aClass_ra_Sub2_1772.method4785(((Class180) this).aClass76_Sub2_1763, (byte) 1);
		} else
			((Class180) this).aClass_ra_Sub2_1772.method4785(((Class180) this).aClass76_Sub2_1762, (byte) 1);
		((Class180) this).aClass_ra_Sub2_1772.ba(3, -16777216);
		((Class180) this).aClass_ra_Sub2_1772.method5040(15);
		((Class180) this).aClass_ra_Sub2_1772.method4971(0);
		if (!((Class180) this).aClass76_Sub2_1762.method902())
			throw new RuntimeException("");
		((Class180) this).aBoolean1777 = true;
		return true;
	}

	void method2059() {
		if (((Class180) this).aBoolean1777) {
			if (((Class180) this).aClass76_Sub2_1763 != null) {
				((Class180) this).aClass_ra_Sub2_1772.method4802(((Class180) this).aClass76_Sub2_1763, (byte) 0);
				((Class180) this).aClass_ra_Sub2_1772.method4785(((Class180) this).aClass76_Sub2_1762, (byte) 1);
				((Class180) this).aClass76_Sub2_1763.method903(0, 0, ((Class180) this).anInt1781, ((Class180) this).anInt1775, 0, 0, true, ((Class180) this).anInterface8_Impl1_Impl1_1782 != null);
			}
			method2060();
			((Class180) this).aBoolean1777 = false;
		}
	}

	void method2060() {
		((Class180) this).aClass_ra_Sub2_1772.method4787(true);
		((Class180) this).aClass_ra_Sub2_1772.method4943();
		((Class180) this).aClass_ra_Sub2_1772.method4970(0);
		((Class180) this).aClass_ra_Sub2_1772.method4889(1);
		((Class180) this).aClass_ra_Sub2_1772.L();
		((Class180) this).aClass76_Sub2_1762.method900(null);
		((Class180) this).aClass_ra_Sub2_1772.method4994(0, 0);
		int i = ((Class180) this).aVector1778.size();
		((Class180) this).anInterface11_Impl3_Impl1_1767.method115();
		for (int i_5_ = 0; i_5_ < i; i_5_++) {
			Class192 class192 = (Class192) ((Class180) this).aVector1778.elementAt(i_5_);
			int i_6_ = class192.method2105();
			boolean bool = i_5_ == i - 1;
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
				if (bool && i_7_ == i_6_ - 1)
					((Class180) this).aClass_ra_Sub2_1772.method4802(((Class180) this).aClass76_Sub2_1762, (byte) 0);
				else
					((Class180) this).aClass76_Sub2_1762.method901(0, ((Class180) this).anInterface8_Impl1_Impl2_1765);
				Interface11_Impl3_Impl1 interface11_impl3_impl1 = ((Class180) this).anInterface11_Impl3_Impl1_1764;
				if (i_7_ == 0)
					interface11_impl3_impl1 = ((Class180) this).anInterface11_Impl3_Impl1_1767;
				class192.method2104(i_7_, ((Class180) this).aClass76_Sub2_1762, interface11_impl3_impl1, (((Class180) this).anInterface8_Impl1_Impl1_1782), (((Class180) this).anInterface11_Impl3_Impl1_1767));
				method2054();
				class192.method2120(i_7_);
				Interface11_Impl3_Impl1 interface11_impl3_impl1_8_ = ((Class180) this).anInterface11_Impl3_Impl1_1764;
				((Class180) this).anInterface11_Impl3_Impl1_1764 = ((Class180) this).anInterface11_Impl3_Impl1_1776;
				((Class180) this).anInterface11_Impl3_Impl1_1776 = interface11_impl3_impl1_8_;
				Interface8_Impl1_Impl2 interface8_impl1_impl2 = ((Class180) this).anInterface8_Impl1_Impl2_1768;
				((Class180) this).anInterface8_Impl1_Impl2_1768 = ((Class180) this).anInterface8_Impl1_Impl2_1765;
				((Class180) this).anInterface8_Impl1_Impl2_1765 = interface8_impl1_impl2;
			}
		}
		((Class180) this).aClass_ra_Sub2_1772.method4970(1);
		((Class180) this).aClass_ra_Sub2_1772.method4889(0);
		((Class180) this).aClass_ra_Sub2_1772.method4787(false);
	}

	void method2061() {
		if (((Class180) this).aClass76_Sub2_1763 != null) {
			((Class180) this).aClass76_Sub2_1763.method179();
			((Class180) this).aClass76_Sub2_1763 = null;
		}
		if (((Class180) this).anInterface8_Impl1_Impl2_1771 != null) {
			((Class180) this).anInterface8_Impl1_Impl2_1771.method53();
			((Class180) this).anInterface8_Impl1_Impl2_1771 = null;
		}
		if (((Class180) this).anInterface8_Impl1_Impl1_1773 != null) {
			((Class180) this).anInterface8_Impl1_Impl1_1773.method53();
			((Class180) this).anInterface8_Impl1_Impl1_1773 = null;
		}
		((Class180) this).aClass76_Sub2_1762.method179();
		((Class180) this).anInterface8_Impl1_Impl2_1768.method53();
		((Class180) this).anInterface8_Impl1_Impl2_1765.method53();
		((Class180) this).anInterface8_Impl1_Impl2_1770.method53();
		((Class180) this).anInterface11_Impl3_Impl1_1764.method53();
		((Class180) this).anInterface11_Impl3_Impl1_1776.method53();
		((Class180) this).anInterface11_Impl3_Impl1_1767.method53();
		((Class180) this).anInterface8_Impl1_Impl1_1782.method53();
		int i = ((Class180) this).aVector1778.size();
		for (int i_9_ = 0; i_9_ < i; i_9_++) {
			Class192 class192 = (Class192) ((Class180) this).aVector1778.elementAt(i_9_);
			class192.method2101();
		}
	}

	boolean method2062(Class192 class192) {
		return method2056(((Class180) this).aVector1778.size(), class192);
	}

	Class180(Class_ra_Sub2 class_ra_sub2, int i, int i_10_) {
		((Class180) this).anInt1774 = 0;
		((Class180) this).anInt1769 = 0;
		((Class180) this).aClass_ra_Sub2_1772 = class_ra_sub2;
		((Class180) this).aClass86_1766 = Class86.aClass86_714;
		((Class180) this).anInt1781 = i;
		((Class180) this).anInt1775 = i_10_;
	}
}
