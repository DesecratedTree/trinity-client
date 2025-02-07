

public class SceneObject {
	SceneObject aClass365_3956;
	Class235 aClass235_3957;
	Class235 aClass235_3958 = new Class235();
	Class235 aClass235_3959;
	boolean aBoolean3960;
	boolean aBoolean3961;
	Class222 aClass222_3962;
	SceneObject aClass365_3963;
	boolean aBoolean3964;
	SceneObject aClass365_3965;

	public final Class235 method4337() {
		if (((SceneObject) this).aBoolean3964) {
			((SceneObject) this).aBoolean3964 = false;
			if (((SceneObject) this).aClass365_3963 != null) {
				((SceneObject) this).aClass235_3957.method2186(((SceneObject) this).aClass235_3958);
				((SceneObject) this).aClass235_3957.method2187(((SceneObject) this).aClass365_3963.method4337());
			} else
				((SceneObject) this).aClass235_3957.method2186(((SceneObject) this).aClass235_3958);
		}
		return ((SceneObject) this).aClass235_3957;
	}

	final Class235 method4338() {
		if (((SceneObject) this).aBoolean3960) {
			((SceneObject) this).aBoolean3960 = false;
			((SceneObject) this).aClass235_3959.method2186(method4337());
			((SceneObject) this).aClass235_3959.method2185();
		}
		return ((SceneObject) this).aClass235_3957;
	}

	final void method4339(Class235 class235) {
		if (((SceneObject) this).aClass365_3963 != null) {
			Class235 class235_0_ = new Class235(class235);
			class235_0_.method2187(((SceneObject) this).aClass365_3963.method4338());
			method4348(class235_0_);
		} else
			method4348(class235);
	}

	public final void setPosition(SceneObjectPosition class217) {
		((SceneObject) this).aClass235_3958.aClass217_2599.method2013(class217);
		method4344();
		if (((SceneObject) this).aClass365_3956 != null)
			((SceneObject) this).aClass365_3956.method4342();
	}

	public final void method4341(float f, float f_1_, float f_2_) {
		((SceneObject) this).aClass235_3958.aClass217_2599.method2007(f, f_1_, f_2_);
		method4344();
		if (((SceneObject) this).aClass365_3956 != null)
			((SceneObject) this).aClass365_3956.method4342();
	}

	final void method4342() {
		method4344();
		if (((SceneObject) this).aClass365_3956 != null)
			((SceneObject) this).aClass365_3956.method4342();
		if (((SceneObject) this).aClass365_3965 != null)
			((SceneObject) this).aClass365_3965.method4342();
	}

	public final Class235 method4343() {
		return ((SceneObject) this).aClass235_3958;
	}

	final void method4344() {
		((SceneObject) this).aBoolean3964 = true;
		((SceneObject) this).aBoolean3960 = true;
		((SceneObject) this).aBoolean3961 = true;
	}

	public final void method4345() {
		if (((SceneObject) this).aClass365_3963 != null) {
			SceneObject class365_3_ = ((SceneObject) ((SceneObject) this).aClass365_3963).aClass365_3956;
			if (class365_3_ == this)
				((SceneObject) ((SceneObject) this).aClass365_3963).aClass365_3956 = ((SceneObject) this).aClass365_3965;
			else {
				for (/**/; ((SceneObject) class365_3_).aClass365_3965 != this; class365_3_ = ((SceneObject) class365_3_).aClass365_3965) {
					/* empty */
				}
				((SceneObject) class365_3_).aClass365_3965 = ((SceneObject) this).aClass365_3965;
			}
		}
		method4344();
		if (((SceneObject) this).aClass365_3956 != null) {
			((SceneObject) this).aClass365_3956.method4342();
			SceneObject class365_4_ = ((SceneObject) this).aClass365_3956;
			for (;;) {
				((SceneObject) class365_4_).aClass235_3958.method2187(((SceneObject) this).aClass235_3958);
				((SceneObject) class365_4_).aClass365_3963 = ((SceneObject) this).aClass365_3963;
				if (((SceneObject) class365_4_).aClass365_3965 == null) {
					((SceneObject) class365_4_).aClass365_3965 = (((SceneObject) ((SceneObject) this).aClass365_3963).aClass365_3956);
					break;
				}
				class365_4_ = ((SceneObject) class365_4_).aClass365_3965;
			}
			((SceneObject) ((SceneObject) this).aClass365_3963).aClass365_3956 = ((SceneObject) this).aClass365_3956;
		}
		((SceneObject) this).aClass365_3963 = null;
		((SceneObject) this).aClass365_3965 = null;
		((SceneObject) this).aClass365_3956 = null;
	}

	public final void method4346(Class218 class218) {
		((SceneObject) this).aClass235_3958.aClass218_2600.method2022(class218);
		method4344();
		if (((SceneObject) this).aClass365_3956 != null)
			((SceneObject) this).aClass365_3956.method4342();
	}

	final Class222 method4347() {
		if (((SceneObject) this).aBoolean3961) {
			((SceneObject) this).aBoolean3961 = false;
			((SceneObject) this).aClass222_3962.method2076(method4337());
		}
		return ((SceneObject) this).aClass222_3962;
	}

	SceneObject() {
		((SceneObject) this).aClass235_3957 = new Class235();
		((SceneObject) this).aBoolean3964 = true;
		((SceneObject) this).aClass235_3959 = new Class235();
		((SceneObject) this).aBoolean3960 = true;
		new Matrix();
		new Matrix();
		((SceneObject) this).aClass222_3962 = new Class222();
		((SceneObject) this).aBoolean3961 = true;
		((SceneObject) this).aClass365_3963 = null;
		((SceneObject) this).aClass365_3956 = null;
		((SceneObject) this).aClass365_3965 = null;
	}

	final void method4348(Class235 class235) {
		((SceneObject) this).aClass235_3958.method2186(class235);
		method4344();
		if (((SceneObject) this).aClass365_3956 != null)
			((SceneObject) this).aClass365_3956.method4342();
	}
}
