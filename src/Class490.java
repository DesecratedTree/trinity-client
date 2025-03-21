/* Class490 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class490 {
	RandomAccessFile aRandomAccessFile5851;
	long aLong5852;
	long aLong5853;
	public static long aLong5854;

	public final void method6064(int i) throws IOException {
		try {
			if (null != ((Class490) this).aRandomAccessFile5851) {
				((Class490) this).aRandomAccessFile5851.close();
				((Class490) this).aRandomAccessFile5851 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ug.i(").append(')').toString());
		}
	}

	final void method6065(long l) throws IOException {
		try {
			((Class490) this).aRandomAccessFile5851.seek(l);
			((Class490) this).aLong5853 = -1737671012596616285L * l;
			//System.out.println("method6065: Loading long "+l);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ug.r(").append(')').toString());
		}
	}

	public final long method6066(int i) throws IOException {
		try {
			//System.out.println("method6066: returning length of file");
			return ((Class490) this).aRandomAccessFile5851.length();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ug.p(").append(')').toString());
		}
	}

	public final int method6067(byte[] is, int i, int i_0_, byte i_1_) throws IOException {
		try {
			int i_2_ = ((Class490) this).aRandomAccessFile5851.read(is, i, i_0_);
			////System.out.println("method6067: adding "+i_2_+" the long");
			if (i_2_ > 0)
				((Class490) this).aLong5853 += -1737671012596616285L * (long) i_2_;
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ug.o(").append(')').toString());
		}
	}

	protected void finalize() throws Throwable {
		try {
			if (null != ((Class490) this).aRandomAccessFile5851) {
				//System.out.println("");
				//System.out.println("finalize");
				method6064(-243446463);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ug.finalize(").append(')').toString());
		}
	}

	public Class490(File file, String string, long l) throws IOException {
		if (l == -1L)
			l = 9223372036854775807L;
		if (file.length() > l) {
			//System.out.println("Deleting the file? but why.");
			file.delete();
		}
		((Class490) this).aRandomAccessFile5851 = new RandomAccessFile(file, string);
		((Class490) this).aLong5852 = -6013243170120979181L * l;
		((Class490) this).aLong5853 = 0L;
		int i = ((Class490) this).aRandomAccessFile5851.read();
		if (i != -1 && !string.equals("r")) {
			((Class490) this).aRandomAccessFile5851.seek(0L);
			((Class490) this).aRandomAccessFile5851.write(i);
		}
		((Class490) this).aRandomAccessFile5851.seek(0L);
	}
	
	public final void method6068(byte[] is, int i, int i_3_, int i_4_) throws IOException {
		try {
			if (((long) i_3_ + -8687075902966573045L * ((Class490) this).aLong5853) > ((Class490) this).aLong5852 * 4216981759159280923L) {
				((Class490) this).aRandomAccessFile5851.seek(((Class490) this).aLong5852 * 4216981759159280923L);
				((Class490) this).aRandomAccessFile5851.write(1);
				throw new EOFException();
			}
			//System.out.println("method6068: adding to the long: "+i_3_);
			((Class490) this).aRandomAccessFile5851.write(is, i, i_3_);
			((Class490) this).aLong5853 += -1737671012596616285L * (long) i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ug.j(").append(')').toString());
		}
	}

	static void method6069(Class120 class120, IComponentDefinitions iComponentDefinitions, int i) {
		try {
			//System.out.println("method6069 iComponentDefinitions long method");
			if (null != iComponentDefinitions) {
				if (iComponentDefinitions.anInt1287 * -790144721 != -1) {
					IComponentDefinitions class114_5_ = class120.method1440(861085587 * iComponentDefinitions.anInt1211, (byte) -48);
					if (null != class114_5_) {
						if (class114_5_.aClass114Array1219 == class114_5_.aClass114Array1347) {
							class114_5_.aClass114Array1219 = (new IComponentDefinitions[class114_5_.aClass114Array1347.length]);
							class114_5_.aClass114Array1219[class114_5_.aClass114Array1219.length - 1] = iComponentDefinitions;
							Class453.method5641(class114_5_.aClass114Array1347, 0, class114_5_.aClass114Array1219, 0, (-790144721 * iComponentDefinitions.anInt1287));
							Class453.method5641(class114_5_.aClass114Array1347, -790144721 * iComponentDefinitions.anInt1287 + 1, class114_5_.aClass114Array1219, iComponentDefinitions.anInt1287 * -790144721, (class114_5_.aClass114Array1347.length - iComponentDefinitions.anInt1287 * -790144721 - 1));
						} else {
							int i_6_ = 0;
							IComponentDefinitions[] class114s;
							for (class114s = class114_5_.aClass114Array1219; i_6_ < class114s.length; i_6_++) {
								if (iComponentDefinitions == class114s[i_6_]) {
									if (i >= 16711935)
										throw new IllegalStateException();
									break;
								}
							}
							if (i_6_ < class114s.length) {
								Class453.method5641(class114s, i_6_ + 1, class114s, i_6_, (class114s.length - i_6_ - 1));
								class114s[class114_5_.aClass114Array1219.length - 1] = iComponentDefinitions;
							}
						}
					}
				} else {
					IComponentDefinitions[] class114s = class120.method1441(889022062);
					int i_7_;
					for (i_7_ = 0; i_7_ < class114s.length; i_7_++) {
						if (iComponentDefinitions == class114s[i_7_]) {
							if (i >= 16711935) {
								/* empty */
							}
							break;
						}
					}
					if (i_7_ < class114s.length) {
						Class453.method5641(class114s, i_7_ + 1, class114s, i_7_, class114s.length - i_7_ - 1);
						class114s[class114s.length - 1] = iComponentDefinitions;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ug.u(").append(')').toString());
		}
	}

	static final void method6070(int i) {
		try {
			client.anInt9265 = -608204173;
			client.anInt8987 = 244844922;
			Class140_Sub1.anIntArrayArray7262 = null;
			Class444.aClass330_Sub46_4496 = null;
			Class515.method6204(2056362057);
			//System.out.println("method6070 regular method");
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ug.gh(").append(')').toString());
		}
	}

	public static void method6071(int i) {
		try {
			//System.out.println("method6071 iComponentDefinitions");
			if (client.aBoolean9150) {
				IComponentDefinitions iComponentDefinitions = Class166.method1993(651152399 * Class368.anInt3869, client.anInt9151 * -1732113251, 534399539);
				if (iComponentDefinitions != null && iComponentDefinitions.anObjectArray1305 != null) {
					Class330_Sub42 class330_sub42 = new Class330_Sub42();
					class330_sub42.aClass114_7809 = iComponentDefinitions;
					class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1305;
					Class117.method1423(class330_sub42, -1631194987);
				}
				client.anInt9147 = 907195093;
				client.anInt9104 = 1909297841;
				client.aBoolean9150 = false;
				if (iComponentDefinitions != null)
					Class404.method4738(iComponentDefinitions, 1501884348);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ug.kt(").append(')').toString());
		}
	}
}
