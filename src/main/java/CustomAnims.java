
public class CustomAnims {

	public static void modify(AnimationConfig config) {
		int id = config.id * -1945308871;
		switch(id) {
		case 4411: //veng other
		case 4410: //veng
		case 912:
			config.resetOnMovement = 1 * -1424483545;
			break;
		case 25061: //blowpipe anim
			config.leftHandItem = -1297220983;
			config.rightHandItem = 556718803;
			break;
		case 11359: //blowpipe anim
			config.leftHandItem = -1;
			config.rightHandItem = -1;
			break;
		}
	}
}
