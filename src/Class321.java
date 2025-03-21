/* Class321 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class Class321 implements Interface33 {
	IndexTable aClass280_7014;
	String ProcessorDirectory;
	Hashtable aHashtable7016 = new Hashtable();
	Hashtable aHashtable7017 = new Hashtable();
	static int anInt7018;

	public int method3171(String string, byte i) {
		try {
			if (((Class321) this).aHashtable7016.containsKey(string))
				return 100;
			String string_0_ = Class70.method814(string, 881221455);
			if (null == string_0_)
				return -1;
			String string_1_ = null;
			if (string_1_ == null) {
				string_1_ = new StringBuilder().append(((Class321) this).ProcessorDirectory).append(string_0_).toString();
				if (!((Class321) this).aClass280_7014.method2770(string_1_, "", 104585600))
					return -1;
			}
			if (!((Class321) this).aClass280_7014.method2773(string_1_, -144918384))
				return ((Class321) this).aClass280_7014.method2775(string_1_, (byte) -36);
			byte[] is = ((Class321) this).aClass280_7014.method2780(string_1_, "");
			Object object = null;
			File file;
			try {
				file = Class207.method2192(string_0_, -126784919);
			} catch (RuntimeException runtimeexception) {
				return -1;
			}
			if (null != is && null != file) {
				boolean bool = true;
				byte[] is_2_ = Class436.method5577(file, -1773344124);
				if (null != is_2_ && is.length == is_2_.length) {
					for (int i_3_ = 0; i_3_ < is_2_.length; i_3_++) {
						if (is[i_3_] != is_2_[i_3_]) {
							bool = false;
							break;
						}
					}
				} else
					bool = false;
				try {
					if (!bool) {
						try {
							FileOutputStream fileoutputstream = new FileOutputStream(file);
							fileoutputstream.write(is, 0, is.length);
							fileoutputstream.close();
						} catch (IOException ioexception) {
							throw new RuntimeException();
						}
					}
				} catch (Throwable throwable) {
					return -1;
				}
				method3172(string, file, (byte) 1);
				return 100;
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nj.j(").append(')').toString());
		}
	}

	void method3172(String string, File file, byte i) {
		try {
			((Class321) this).aHashtable7016.put(string, file);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nj.i(").append(')').toString());
		}
	}

	public boolean method331(String string, int i) {
		try {
			return ((Class321) this).aHashtable7016.containsKey(string);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nj.p(").append(')').toString());
		}
	}

	public boolean method3173(String string, int i) {
		try {
			return ((Class321) this).aHashtable7017.containsKey(string);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nj.o(").append(')').toString());
		}
	}

	public boolean method336() {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = ((Class321) this).aHashtable7017.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, ((Class321) this).aHashtable7017.get(string));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_4_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_4_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = ((Class321) this).aHashtable7017.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = ((File) ((Class321) this).aHashtable7016.get(string));
						Class var_class_5_ = ((Class) ((Class321) this).aHashtable7017.get(string));
						Vector vector = ((Vector) field.get(var_class_5_.getClassLoader()));
						for (int i = 0; i < vector.size(); i++) {
							try {
								Object object = vector.elementAt(i);
								Field field_6_ = object.getClass().getDeclaredField("name");
								method.invoke(field_6_, new Object[] { Boolean.TRUE });
								try {
									String string_7_ = (String) field_6_.get(object);
									if (null != string_7_ && (string_7_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_8_ = object.getClass().getDeclaredField("handle");
										Method method_9_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_8_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_9_, (new Object[] { Boolean.TRUE }));
										try {
											method_9_.invoke(object, new Object[0]);
											field_8_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_9_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_8_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_6_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			method.invoke(field, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
			/* empty */
		}
		((Class321) this).aHashtable7017 = hashtable;
		return ((Class321) this).aHashtable7017.isEmpty();
	}

	public Class321(IndexTable class280) {
		((Class321) this).aClass280_7014 = class280;
		String directory = "";
		if (Class550.OSName.startsWith("win") || Class550.OSName.startsWith("windows 7"))
			directory = new StringBuilder().append(directory).append("windows/").toString();
		else if (Class550.OSName.startsWith("linux"))
			directory = new StringBuilder().append(directory).append("linux/").toString();
		else if (Class550.OSName.startsWith("mac"))
			directory = new StringBuilder().append(directory).append("macos/").toString();
		if (Class550.processorName.startsWith("amd64") || Class550.processorName.startsWith("x86_64"))
			directory = new StringBuilder().append(directory).append("x86_64/").toString();
		else if (Class550.processorName.startsWith("i386") || Class550.processorName.startsWith("i486") || Class550.processorName.startsWith("i586") || Class550.processorName.startsWith("x86"))
			directory = new StringBuilder().append(directory).append("x86/").toString();
		else if (Class550.processorName.startsWith("ppc"))
			directory = new StringBuilder().append(directory).append("ppc/").toString();
		else
			directory = new StringBuilder().append(directory).append("universal/").toString();
		((Class321) this).ProcessorDirectory = directory;
	}

	public boolean method330(String string) {
		return ((Class321) this).aHashtable7016.containsKey(string);
	}

	public boolean method329(String string) {
		return ((Class321) this).aHashtable7016.containsKey(string);
	}

	public boolean method327(String string, int i) {
		try {
			return method3175(string, Class329.class, (byte) 59);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nj.s(").append(')').toString());
		}
	}

	public boolean method326(String string) {
		return ((Class321) this).aHashtable7016.containsKey(string);
	}

	public int method3174(String string) {
		if (((Class321) this).aHashtable7016.containsKey(string))
			return 100;
		String string_10_ = Class70.method814(string, -2003442980);
		if (null == string_10_)
			return -1;
		String string_11_ = null;
		if (string_11_ == null) {
			string_11_ = new StringBuilder().append(((Class321) this).ProcessorDirectory).append(string_10_).toString();
			if (!((Class321) this).aClass280_7014.method2770(string_11_, "", -353721800))
				return -1;
		}
		if (!((Class321) this).aClass280_7014.method2773(string_11_, -1571296841))
			return ((Class321) this).aClass280_7014.method2775(string_11_, (byte) 16);
		byte[] is = ((Class321) this).aClass280_7014.method2780(string_11_, "");
		Object object = null;
		File file;
		try {
			file = Class207.method2192(string_10_, -126784919);
		} catch (RuntimeException runtimeexception) {
			return -1;
		}
		if (null != is && null != file) {
			boolean bool = true;
			byte[] is_12_ = Class436.method5577(file, 470206274);
			if (null != is_12_ && is.length == is_12_.length) {
				for (int i = 0; i < is_12_.length; i++) {
					if (is[i] != is_12_[i]) {
						bool = false;
						break;
					}
				}
			} else
				bool = false;
			try {
				if (!bool) {
					try {
						FileOutputStream fileoutputstream = new FileOutputStream(file);
						fileoutputstream.write(is, 0, is.length);
						fileoutputstream.close();
					} catch (IOException ioexception) {
						throw new RuntimeException();
					}
				}
			} catch (Throwable throwable) {
				return -1;
			}
			method3172(string, file, (byte) 1);
			return 100;
		}
		return -1;
	}

	boolean method3175(String string, Class var_class, byte i) {
		try {
			Class var_class_13_ = (Class) ((Class321) this).aHashtable7017.get(string);
			if (var_class_13_ != null) {
				if (var_class_13_.getClassLoader() != var_class.getClassLoader())
					return false;
				return true;
			}
			File file = null;
			if (null == file)
				file = (File) ((Class321) this).aHashtable7016.get(string);
			do {
				if (file != null) {
					boolean bool;
					try {
						file = new File(file.getCanonicalPath());
						Class var_class_14_ = Class.forName("java.lang.Runtime");
						Class var_class_15_ = (Class.forName("java.lang.reflect.AccessibleObject"));
						Method method = var_class_15_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
						Method method_16_ = (var_class_14_.getDeclaredMethod("load0", (new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") })));
						method.invoke(method_16_, new Object[] { Boolean.TRUE });
						method_16_.invoke(Runtime.getRuntime(), new Object[] { var_class, file.getPath() });
						method.invoke(method_16_, new Object[] { Boolean.FALSE });
						((Class321) this).aHashtable7017.put(string, var_class);
						bool = true;
					} catch (NoSuchMethodException nosuchmethodexception) {
						System.load(file.getPath());
						((Class321) this).aHashtable7017.put(string, Class329.class);
						return true;
					} catch (Throwable throwable) {
						break;
					}
					return bool;
				}
			} while (false);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nj.f(").append(')').toString());
		}
	}

	public boolean method335(String string) {
		return method3175(string, Class329.class, (byte) 121);
	}

	public boolean method333(String string) {
		return method3175(string, Class329.class, (byte) 33);
	}

	public boolean method334(String string) {
		return method3175(string, Class329.class, (byte) -82);
	}

	public boolean method328() {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = ((Class321) this).aHashtable7017.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, ((Class321) this).aHashtable7017.get(string));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_17_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_17_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = ((Class321) this).aHashtable7017.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = ((File) ((Class321) this).aHashtable7016.get(string));
						Class var_class_18_ = ((Class) ((Class321) this).aHashtable7017.get(string));
						Vector vector = ((Vector) field.get(var_class_18_.getClassLoader()));
						for (int i = 0; i < vector.size(); i++) {
							try {
								Object object = vector.elementAt(i);
								Field field_19_ = object.getClass().getDeclaredField("name");
								method.invoke(field_19_, new Object[] { Boolean.TRUE });
								try {
									String string_20_ = (String) field_19_.get(object);
									if (null != string_20_ && (string_20_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_21_ = object.getClass().getDeclaredField("handle");
										Method method_22_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_21_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_22_, (new Object[] { Boolean.TRUE }));
										try {
											method_22_.invoke(object, new Object[0]);
											field_21_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_22_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_21_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_19_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			method.invoke(field, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
			/* empty */
		}
		((Class321) this).aHashtable7017 = hashtable;
		return ((Class321) this).aHashtable7017.isEmpty();
	}

	public boolean method332(byte i) {
		try {
			Hashtable hashtable = new Hashtable();
			Enumeration enumeration = ((Class321) this).aHashtable7017.keys();
			while (enumeration.hasMoreElements()) {
				String string = (String) enumeration.nextElement();
				hashtable.put(string, ((Class321) this).aHashtable7017.get(string));
			}
			try {
				Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
				Class var_class_23_ = Class.forName("java.lang.ClassLoader");
				Field field = var_class_23_.getDeclaredField("nativeLibraries");
				Method method = var_class.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
				method.invoke(field, new Object[] { Boolean.TRUE });
				try {
					enumeration = ((Class321) this).aHashtable7017.keys();
					while (enumeration.hasMoreElements()) {
						String string = (String) enumeration.nextElement();
						try {
							File file = (File) ((Class321) this).aHashtable7016.get(string);
							Class var_class_24_ = (Class) ((Class321) this).aHashtable7017.get(string);
							Vector vector = ((Vector) field.get(var_class_24_.getClassLoader()));
							for (int i_25_ = 0; i_25_ < vector.size(); i_25_++) {
								try {
									Object object = vector.elementAt(i_25_);
									Field field_26_ = object.getClass().getDeclaredField("name");
									method.invoke(field_26_, (new Object[] { Boolean.TRUE }));
									try {
										String string_27_ = (String) field_26_.get(object);
										if (null != string_27_ && (string_27_.equalsIgnoreCase(file.getCanonicalPath()))) {
											Field field_28_ = (object.getClass().getDeclaredField("handle"));
											Method method_29_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
											method.invoke(field_28_, (new Object[] { Boolean.TRUE }));
											method.invoke(method_29_, (new Object[] { Boolean.TRUE }));
											try {
												method_29_.invoke(object, (new Object[0]));
												field_28_.set(object, new Integer(0));
												hashtable.remove(string);
											} catch (Throwable throwable) {
												/* empty */
											}
											method.invoke(method_29_, (new Object[] { Boolean.FALSE }));
											method.invoke(field_28_, (new Object[] { Boolean.FALSE }));
										}
									} catch (Throwable throwable) {
										/* empty */
									}
									method.invoke(field_26_, (new Object[] { Boolean.FALSE }));
								} catch (Throwable throwable) {
									/* empty */
								}
							}
						} catch (Throwable throwable) {
							/* empty */
						}
					}
				} catch (Throwable throwable) {
					/* empty */
				}
				method.invoke(field, new Object[] { Boolean.FALSE });
			} catch (Throwable throwable) {
				/* empty */
			}
			((Class321) this).aHashtable7017 = hashtable;
			return ((Class321) this).aHashtable7017.isEmpty();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nj.z(").append(')').toString());
		}
	}

	static final void method3176(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class384.method4422(iComponentDefinitions, class120, class430, -1921545318);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nj.ff(").append(')').toString());
		}
	}

	static boolean method3177(int i, byte i_30_) {
		try {
			return 6 == i || 3 == i || 18 == i || 14 == i || i == 8 || i == 17;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nj.fj(").append(')').toString());
		}
	}

	static Class330_Sub1 method3178(int i, boolean bool, short i_31_) {
		try {
			long l = (long) (i | (bool ? -2147483648 : 0));
			return (Class330_Sub1) Class330_Sub1.aClass497_7501.method6094(l);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nj.s(").append(')').toString());
		}
	}
}
