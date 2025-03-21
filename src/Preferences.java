/* Preferences - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.channels.FileChannel;

public class Preferences {
	static int anInt3007 = 7;
	static int anInt3008 = 14;
	static int anInt3009 = 6;
	int[][] anIntArrayArray3010;
	int anInt3011;
	int anInt3012;
	
	public short[] method2918(short[] is, int i) {
		try {
			if (((Preferences) this).anIntArrayArray3010 != null) {
				int i_0_ = 14 + (int) ((long) (((Preferences) this).anInt3011 * 587587057) * (long) is.length / (long) (-1143685883 * ((Preferences) this).anInt3012));
				int[] is_1_ = new int[i_0_];
				int i_2_ = 0;
				int i_3_ = 0;
				for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
					int i_5_ = is[i_4_];
					int[] is_6_ = ((Preferences) this).anIntArrayArray3010[i_3_];
					for (int i_7_ = 0; i_7_ < 14; i_7_++)
						is_1_[i_7_ + i_2_] += i_5_ * is_6_[i_7_] >> 2;
					i_3_ += 587587057 * ((Preferences) this).anInt3011;
					int i_8_ = i_3_ / (-1143685883 * ((Preferences) this).anInt3012);
					i_2_ += i_8_;
					i_3_ -= i_8_ * (-1143685883 * ((Preferences) this).anInt3012);
				}
				is = new short[i_0_];
				for (int i_9_ = 0; i_9_ < i_0_; i_9_++) {
					int i_10_ = is_1_[i_9_] + 8192 >> 14;
					if (i_10_ < -32768)
						is[i_9_] = (short) -32768;
					else if (i_10_ > 32767)
						is[i_9_] = (short) 32767;
					else
						is[i_9_] = (short) i_10_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mh.j(").append(')').toString());
		}
	}

	int method2919(int i, int i_11_) {
		try {
			if (((Preferences) this).anIntArrayArray3010 != null)
				i = (int) ((long) (((Preferences) this).anInt3011 * 587587057) * (long) i / (long) (((Preferences) this).anInt3012 * -1143685883)) + 6;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mh.p(").append(')').toString());
		}
	}

	byte[] method2920(byte[] is, byte i) {
		try {
			if (null != ((Preferences) this).anIntArrayArray3010) {
				int i_12_ = 14 + (int) ((long) is.length * (long) (((Preferences) this).anInt3011 * 587587057) / (long) (-1143685883 * ((Preferences) this).anInt3012));
				int[] is_13_ = new int[i_12_];
				int i_14_ = 0;
				int i_15_ = 0;
				for (int i_16_ = 0; i_16_ < is.length; i_16_++) {
					int i_17_ = is[i_16_];
					int[] is_18_ = ((Preferences) this).anIntArrayArray3010[i_15_];
					for (int i_19_ = 0; i_19_ < 14; i_19_++)
						is_13_[i_19_ + i_14_] += i_17_ * is_18_[i_19_];
					i_15_ += ((Preferences) this).anInt3011 * 587587057;
					int i_20_ = i_15_ / (-1143685883 * ((Preferences) this).anInt3012);
					i_14_ += i_20_;
					i_15_ -= i_20_ * (-1143685883 * ((Preferences) this).anInt3012);
				}
				is = new byte[i_12_];
				for (int i_21_ = 0; i_21_ < i_12_; i_21_++) {
					int i_22_ = 32768 + is_13_[i_21_] >> 16;
					if (i_22_ < -128)
						is[i_21_] = (byte) -128;
					else if (i_22_ > 127)
						is[i_21_] = (byte) 127;
					else
						is[i_21_] = (byte) i_22_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mh.r(").append(')').toString());
		}
	}

	public Preferences(int i, int i_23_) {
		if (i_23_ != i) {
			int i_24_ = Class428.method5324(i, i_23_, 743404989);
			i /= i_24_;
			i_23_ /= i_24_;
			((Preferences) this).anInt3012 = i * -1261729843;
			((Preferences) this).anInt3011 = 1400468241 * i_23_;
			((Preferences) this).anIntArrayArray3010 = new int[i][14];
			for (int i_25_ = 0; i_25_ < i; i_25_++) {
				int[] is = ((Preferences) this).anIntArrayArray3010[i_25_];
				double d = 6.0 + (double) i_25_ / (double) i;
				int i_26_ = (int) Math.floor(d - 7.0 + 1.0);
				if (i_26_ < 0)
					i_26_ = 0;
				int i_27_ = (int) Math.ceil(7.0 + d);
				if (i_27_ > 14)
					i_27_ = 14;
				double d_28_ = (double) i_23_ / (double) i;
				for (/**/; i_26_ < i_27_; i_26_++) {
					double d_29_ = ((double) i_26_ - d) * 3.141592653589793;
					double d_30_ = d_28_;
					if (d_29_ < -1.0E-4 || d_29_ > 1.0E-4)
						d_30_ *= Math.sin(d_29_) / d_29_;
					d_30_ *= 0.54 + 0.46 * Math.cos(0.2243994752564138 * ((double) i_26_ - d));
					is[i_26_] = (int) Math.floor(0.5 + 65536.0 * d_30_);
				}
			}
		}
	}

	int method2921(int i, int i_31_) {
		try {
			if (((Preferences) this).anIntArrayArray3010 != null)
				i = (int) ((long) (((Preferences) this).anInt3011 * 587587057) * (long) i / (long) (((Preferences) this).anInt3012 * -1143685883));
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mh.i(").append(')').toString());
		}
	}

	public static Class144 method2922(int i, int i_32_) {
		try {
			if (((Class144) Class144.aClass144_1572).anInt1575 * 1638740267 == i)
				return Class144.aClass144_1572;
			if (i == ((Class144) Class144.aClass144_1576).anInt1575 * 1638740267)
				return Class144.aClass144_1576;
			if (((Class144) Class144.aClass144_1574).anInt1575 * 1638740267 == i)
				return Class144.aClass144_1574;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mh.r(").append(')').toString());
		}
	}

	static final void method2923(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			iComponentDefinitions.anInt1232 = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) * -419306979;
			Class404.method4738(iComponentDefinitions, 1970192974);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mh.fu(").append(')').toString());
		}
	}

	static final void method2924(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = ((Class430) class430).aClass154_4391.aByte1645;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mh.xe(").append(')').toString());
		}
	}

	static final void method2925(Class430 class430, byte i) {
		try {
			if (null != client.aByteArray8959)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 1;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mh.ajg(").append(')').toString());
		}
	}

	static final void method2926(Class430 class430, int i) {
		try {
			Class472.method5891((String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]), (byte) -82);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mh.ty(").append(')').toString());
		}
	}

	static void method2927(Class249 class249, boolean bool, float f, float f_33_, float f_34_, float f_35_, int i, int i_36_, int i_37_) {
		try {
			int i_38_ = client.aClass304_9030.method2993(-194911978);
			int i_39_ = client.aClass304_9030.method2992(1403532609);
			class249.method2493(f, f_33_, f_34_, f_35_, (float) i_39_, (float) i_38_, (float) i, (float) i_36_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mh.fx(").append(')').toString());
		}
	}

	static void method2928(String string, int i) {
		try {
			client.aString9111 = string;
			if (Class147.method1739((byte) -48) != Class331.aClass331_3343) {
				try {
					String string_40_ = Class293.anApplet6804.getParameter(Class219.aClass219_2166.aString2175);
					String string_41_ = Class293.anApplet6804.getParameter(Class219.aClass219_2151.aString2175);
					String string_42_ = new StringBuilder().append(string_40_).append("settings=").append(string).append("; version=1; path=/; domain=").append(string_41_).toString();
					if (string.length() == 0)
						string_42_ = new StringBuilder().append(string_42_).append("; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0").toString();
					else
						string_42_ = new StringBuilder().append(string_42_).append("; Expires=").append(OutgoingPacket.method2368(Class312.method3111((byte) 115) + 94608000000L)).append("; Max-Age=").append(94608000L).toString();
					Class492.method6077(Class293.anApplet6804, new StringBuilder().append("document.cookie=\"").append(string_42_).append("\"").toString(), -756985264);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mh.nf(").append(')').toString());
		}
	}

	public static Class490 loadPreferences(String string, String string_43_, boolean bool, int i) {
		try {
			File file = new File(Class60.aFile559, new StringBuilder().append("preferences").append(string).append(".dat").toString());
			/*if (!file.exists()) {
				System.out.println(file.getAbsolutePath()+" doesn't exist.");
				copyPreferenceFile(new StringBuilder().append("preferences").append(string).append(".dat").toString(), file);
				if (!file.exists()) {
					System.out.println(file.getAbsolutePath()+" still doesn't exist.");
				}
			}*/
			do {
				if (file.exists()) {
					Class490 class490 = null;
					try {
						Class490 class490_44_ = new Class490(file, "rw", 10000L);
						class490 = class490_44_;
					} catch (IOException ioexception) {
						ioexception.printStackTrace();
					}
					return class490;
				}
			} while (false);
			String string_45_ = "";
			if (-2030411149 * Class330_Sub26_Sub1.anInt9571 == 33)
				string_45_ = "_rc";
			else if (34 == Class330_Sub26_Sub1.anInt9571 * -2030411149)
				string_45_ = "_wip";
			File file_46_ = new File(Class291.aString2978, new StringBuilder().append("jagex_").append(string_43_).append("_preferences").append(string).append(string_45_).append(".dat").toString());
			System.out.println(file_46_.getAbsolutePath()+" being loaded.");
			do {
				if (!bool && file_46_.exists()) {
					Class490 class490;
					try {
						Class490 class490_47_ = new Class490(file_46_, "rw", 10000L);
						class490 = class490_47_;
					} catch (IOException ioexception) {
						break;
					}
					return class490;
				}
			} while (false);
			Class490 class490;
			try {
				Class490 class490_48_ = new Class490(file, "rw", 10000L);
				class490 = class490_48_;
			} catch (IOException ioexception) {
				throw new RuntimeException();
			}
			return class490;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mh.z(").append(')').toString());
		}
	}
	
	public static boolean isMac() {
		if (Class550.OSName != null)
			if (Class550.OSName.startsWith("mac"))
				return true;
		if (Class212.aString6533 != null)
			if (Class212.aString6533.startsWith("mac"))
				return true;
		return false;
	}
	
	public static File copyPreferenceFile(String resource, File original) {
		ClassLoader cl = Loader.class.getClassLoader();
        File file = null;
        FileResource fileResource = new URLClassLoaderFileResource(cl, resource);
        try {
            file = fileResource.getFile();
            //SpecialKeys.sendConsoleMessage("Loading from url.");
            copyFile(file, original);
        } catch (IOException e) {
            try {
            	InputStream cpResource = cl.getResourceAsStream(resource);
				copyInputStreamToFile(cpResource, original);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
            //SpecialKeys.sendConsoleMessage("Loading from classpath.");
        }
        return original;
	}
	
	 private static File getResourceAsFile(String resource) throws IOException {
	        ClassLoader cl = Loader.class.getClassLoader();
	        File file = null;
	        FileResource fileResource = new URLClassLoaderFileResource(cl, resource);
	        try {
	            file = fileResource.getFile();
	            //SpecialKeys.sendConsoleMessage("Loading from url.");
	        } catch (IOException e) {
	            fileResource = new ClasspathResourceFileResource(cl, resource);
	            file = fileResource.getFile();
	            //SpecialKeys.sendConsoleMessage("Loading from classpath.");
	        }
	        return file;
	    }
	 
	    public static interface FileResource {

	        public File getFile() throws IOException;

	    }
	    
	    public static class ClasspathResourceFileResource implements FileResource {
	    	
	        private ClassLoader cl;
	        private String resource;
	        
	        public ClasspathResourceFileResource(ClassLoader cl, String resource) {
	            this.cl = cl;
	            this.resource = resource;
	        }
	        
	        public File getFile() throws IOException {
	            InputStream cpResource = cl.getResourceAsStream(resource);
	            File tmpFile = File.createTempFile("file", "temp");
	            copyInputStreamToFile(cpResource, tmpFile);
	            tmpFile.deleteOnExit();
	            return tmpFile;
	        }
	    }
	    
	    public static class URLClassLoaderFileResource implements FileResource {
	    	
	        private ClassLoader cl;
	        private String resource;
	        
	        public URLClassLoaderFileResource(ClassLoader cl, String resourcePath) {
	            this.cl = cl;
	            this.resource = resourcePath;
	        }
	        
	        public File getFile() throws IOException {
	            File resourceFile = null;
	            if (cl instanceof URLClassLoader) {
	                URLClassLoader urlClassLoader = URLClassLoader.class.cast(cl);
	                URL resourceUrl = urlClassLoader.findResource(resource);
	                if ("file".equals(resourceUrl.getProtocol())) {
	                    try {
	                        URI uri = resourceUrl.toURI();
	                        resourceFile = new File(uri);
	                    } catch (URISyntaxException e) {
	                        IOException ioException = new IOException(
	                                "Unable to get file through class loader: "
	                                        + cl);
	                        ioException.initCause(e);
	                        throw ioException;
	                    }

	                }
	            }
	            if (resourceFile == null) {
	                throw new IOException(
	                        "Unable to get file through class loader: " + cl);
	            }
	            return resourceFile;
	        }
	    }
	    
	    public static void copyInputStreamToFile(InputStream source, File destination) throws IOException {
	    	        try {
	    	           FileOutputStream output = openOutputStream(destination);
	    	            try {
	    	                copy(source, output);
	    	            } finally {
	    	                closeQuietly(output);
	    	            }
	    	        } finally {
	    	            closeQuietly(source);
	    	        }
	    	    }
	    
	    public static void closeQuietly(OutputStream output) {
	    	  closeQuietly((Closeable)output);
	    }
	    
	    public static void closeQuietly(Closeable closeable) {
	        try {
	            if (closeable != null) {
	               closeable.close();
	            }
	    } catch (IOException ioe) {
	            // ignore
	        }
	    }
	    
	    public static FileOutputStream openOutputStream(File file) throws IOException {
	    	        return openOutputStream(file, false);
	    	    }
	    
	    public static FileOutputStream openOutputStream(File file, boolean append) throws IOException {
	    	    if (file.exists()) {
	    	         if (file.isDirectory()) {
	    	          throw new IOException("File '" + file + "' exists but is a directory");
	    	         }
	    	       if (file.canWrite() == false) {
	    	           throw new IOException("File '" + file + "' cannot be written to");
	    	       }
	    	    } else {
	    	        File parent = file.getParentFile();
	    	          if (parent != null) {
	    	             if (!parent.mkdirs() && !parent.isDirectory()) {
	    	                 throw new IOException("Directory '" + parent + "' could not be created");
	    	         }
	    	         }
	    	    }
	    	     return new FileOutputStream(file, append);
	    	}
	    
	    public static int copy(InputStream input, OutputStream output) throws IOException {
	    	 long count = copyLarge(input, output);
	    	  if (count > Integer.MAX_VALUE) {
	    	       return -1;
	    	  }
	    	    return (int) count;
	     }
	    
	    public static long copyLarge(InputStream input, OutputStream output)
	           throws IOException {
	        byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];
	      long count = 0;
	         int n = 0;
	        while (-1 != (n = input.read(buffer))) {
	          output.write(buffer, 0, n);
	            count += n;
	       }
	        return count;
	    }
	    
	    public static void copyFile(File srcFile, File destFile) throws IOException {
	    	copyFile(srcFile, destFile, true);
	    }
	    
	    public static void copyFile(File srcFile, File destFile,
	    	            boolean preserveFileDate) throws IOException {
	    	         if (srcFile == null) {
	    		             throw new NullPointerException("Source must not be null");
	    		         }
	    		         if (destFile == null) {
	    		             throw new NullPointerException("Destination must not be null");
	    		         }
	    		         if (srcFile.exists() == false) {
	    		             throw new FileNotFoundException("Source '" + srcFile + "' does not exist");
	    		         }
	    		         if (srcFile.isDirectory()) {
	    		             throw new IOException("Source '" + srcFile + "' exists but is a directory");
	    		         }
	    		         if (srcFile.getCanonicalPath().equals(destFile.getCanonicalPath())) {
	    		             throw new IOException("Source '" + srcFile + "' and destination '" + destFile + "' are the same");
	    		         }
	    		         File parentFile = destFile.getParentFile();
	    		     if (parentFile != null) {
	    		       if (!parentFile.mkdirs() && !parentFile.isDirectory()) {
	    		       throw new IOException("Destination '" + parentFile + "' directory cannot be created");
	    	     }
	    	 }
	    	  if (destFile.exists() && destFile.canWrite() == false) {
	    	        throw new IOException("Destination '" + destFile + "' exists but is read-only");
	    	    }
	    	      doCopyFile(srcFile, destFile, preserveFileDate);
	    	}
	    
	    private static void doCopyFile(File srcFile, File destFile, boolean preserveFileDate) throws IOException {
	    	    if (destFile.exists() && destFile.isDirectory()) {
	    	        throw new IOException("Destination '" + destFile + "' exists but is a directory");
	    	      }
	    	
	    	    FileInputStream fis = null;
	    	  FileOutputStream fos = null;
	    	     FileChannel input = null;
	    	    FileChannel output = null;
	    	    try {
	    	       fis = new FileInputStream(srcFile);
	    	       fos = new FileOutputStream(destFile);
	    	       input  = fis.getChannel();
	    	       output = fos.getChannel();
	    	       long size = input.size();
	    	       long pos = 0;
	    	      long count = 0;
	    	      while (pos < size) {
	    	         count = (size - pos) > FILE_COPY_BUFFER_SIZE ? FILE_COPY_BUFFER_SIZE : (size - pos);
	             pos += output.transferFrom(input, pos, count);
	    	     }
	    	    } finally {
	    	      closeQuietly(output);
	    	      closeQuietly(fos);
	    	    closeQuietly(input);
	    	     closeQuietly(fis);
	        }
	   
	         if (srcFile.length() != destFile.length()) {
	              throw new IOException("Failed to copy full contents from '" +
	                      srcFile + "' to '" + destFile + "'");
	           }
	         if (preserveFileDate) {
	              destFile.setLastModified(srcFile.lastModified());
	           }
	    }
	    
	    private static final int DEFAULT_BUFFER_SIZE = 1024 * 4;
	    
	    public static final long ONE_KB = 1024;
	    public static final long ONE_MB = ONE_KB * ONE_KB;
	    private static final long FILE_COPY_BUFFER_SIZE = ONE_MB * 30;
}
