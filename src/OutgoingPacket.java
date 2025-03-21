/* OutgoingPacket - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

public class OutgoingPacket {
	public static OutgoingPacket SWITCH_ITEM_INTERFACE_PACKET;
	public static OutgoingPacket ITEM_EXAMINE_PACKET;
	public static OutgoingPacket aClass234_2470;
	public static OutgoingPacket FRIENDS_CHAT_RANK_PACKET;
	public static OutgoingPacket ACTION_BUTTON1_PACKET;
	public static OutgoingPacket aClass234_2473;
	public static OutgoingPacket INTERFACE_ON_NPC_PACKET;
	public static OutgoingPacket CLOSE_WORLD_MAP_PACKET;
	public static OutgoingPacket aClass234_2476;
	public static OutgoingPacket aClass234_2477;
	public static OutgoingPacket aClass234_2478;
	public static OutgoingPacket aClass234_2479;
	public static OutgoingPacket WALKING_PACKET;
	public static OutgoingPacket ACTION_BUTTON3_PACKET;
	public static OutgoingPacket ACTION_BUTTON6_PACKET;
	public static OutgoingPacket NPC_CLICK4_PACKET;
	public static OutgoingPacket aClass234_2484;
	public static OutgoingPacket ATTACK_NPC;
	public static OutgoingPacket aClass234_2486;
	public static OutgoingPacket aClass234_2487;
	public static OutgoingPacket aClass234_2488;
	public static OutgoingPacket aClass234_2489;
	public static OutgoingPacket ACTION_BUTTON2_PACKET;
	public static OutgoingPacket aClass234_2491;
	public static OutgoingPacket aClass234_2492;
	public static OutgoingPacket CLOSE_INTERFACE_PACKET;
	public static OutgoingPacket KICK_FRIEND_CHAT_PACKET;
	public static OutgoingPacket aClass234_2495;
	public static OutgoingPacket OBJECT_EXAMINE_PACKET;
	public static OutgoingPacket aClass234_2497;
	public static OutgoingPacket PING_PACKET;
	public static OutgoingPacket SCREEN_PACKET;
	public static OutgoingPacket CHAT_PACKET;
	public static OutgoingPacket aClass234_2501;
	public static OutgoingPacket CAPE_COLOR_PACKET;
	public static OutgoingPacket PLAYER_OPTION7_PACKET;
	public static OutgoingPacket PLAYER_OPTION6_PACKET;
	public static OutgoingPacket INTERFACE_ON_PLAYER_PACKET;
	public static OutgoingPacket ADD_IGNORE_PACKET;
	public static OutgoingPacket WORLD_MAP_PACKET;
	public static OutgoingPacket OBJECT_CLICK1_PACKET;
	public static OutgoingPacket ACTION_BUTTON5_PACKET;
	public static OutgoingPacket aClass234_2510;
	public static OutgoingPacket NPC_CLICK2_PACKET;
	public static OutgoingPacket OBJECT_CLICK2_PACKET;
	public static OutgoingPacket aClass234_2513;
	public static OutgoingPacket aClass234_2514;
	public static OutgoingPacket aClass234_2515;
	public static OutgoingPacket aClass234_2516;
	public static OutgoingPacket ITEM_ON_ITEM_PACKET;
	public static OutgoingPacket aClass234_2518;
	public static OutgoingPacket aClass234_2519;
	public static OutgoingPacket FRIEND_QUICK_CHAT_PACKET;
	public static OutgoingPacket PLAYER_OPTION9_PACKET;
	public static OutgoingPacket SEND_PM_PACKET;
	public static OutgoingPacket aClass234_2523;
	public static OutgoingPacket aClass234_2524;
	public static OutgoingPacket aClass234_2525;
	public static OutgoingPacket PLAYER_OPTION4_PACKET;
	public static OutgoingPacket aClass234_2527;
	public static OutgoingPacket REMOVE_IGNORE_PACKET;
	public static OutgoingPacket aClass234_2529;
	public static OutgoingPacket TAKE_FLOOR_ITEM_PACKET;
	public static OutgoingPacket aClass234_2531;
	public static OutgoingPacket REGION_UPDATE_PACKET;
	public static OutgoingPacket ENTER_INTEGER_PACKET;
	public static OutgoingPacket aClass234_2534;
	public static OutgoingPacket aClass234_2535;
	public static OutgoingPacket ENTER_NAME_PACKET;
	public static OutgoingPacket ACTION_BUTTON8_PACKET;
	public static OutgoingPacket CHAT_TYPE_PACKET;
	public static OutgoingPacket ADD_FRIEND_PACKET;
	public static OutgoingPacket INTERFACE_ON_OBJECT_PACKET;
	public static OutgoingPacket aClass234_2541;
	public static OutgoingPacket aClass234_2542;
	public static OutgoingPacket aClass234_2543;
	public static OutgoingPacket ACTION_BUTTON4_PACKET;
	public static OutgoingPacket aClass234_2545;
	public static OutgoingPacket aClass234_2546;
	public static OutgoingPacket PLAYER_OPTION2_PACKET;
	public static OutgoingPacket OBJECT_CLICK3_PACKET;
	public static OutgoingPacket REMOVE_FRIEND_PACKET;
	public static OutgoingPacket OBJECT_CLICK5_PACKET;
	public static OutgoingPacket DIALOGUE_CONTINUE_PACKET;
	public static OutgoingPacket JOIN_FRIEND_CHAT_PACKET;
	public static OutgoingPacket OBJECT_CLICK4_PACKET;
	public static OutgoingPacket ACTION_BUTTON10_PACKET;
	public static OutgoingPacket QUICK_CHAT_PACKET;
	public static OutgoingPacket NPC_CLICK3_PACKET;
	public static OutgoingPacket COMMAND_PACKET;
	public static OutgoingPacket aClass234_2558;
	public static OutgoingPacket aClass234_2559;
	public static OutgoingPacket aClass234_2560;
	public static OutgoingPacket aClass234_2561;
	public static OutgoingPacket ENTER_LONG_PACKET;
	public static OutgoingPacket aClass234_2563;
	public static OutgoingPacket NPC_CLICK1_PACKET;
	public static OutgoingPacket aClass234_2565;
	public static OutgoingPacket aClass234_2566;
	public static OutgoingPacket aClass234_2567;
	public static OutgoingPacket PLAYER_OPTION1_PACKET;
	public static OutgoingPacket aClass234_2569;
	public static OutgoingPacket aClass234_2570;
	public static OutgoingPacket ACTION_BUTTON7_PACKET;
	public static OutgoingPacket PLAYER_OPTION3_PACKET;
	public static OutgoingPacket GE_SELECT_PACKET;
	public static OutgoingPacket aClass234_2574 = new OutgoingPacket(0, 3);
	public static OutgoingPacket WALKING_MINIMAP_PACKET;
	public static OutgoingPacket HOT_KEY_PACKET;
	int anInt2576;
	int anInt2577;
	public static Class341 aClass341_2578;
	static int anInt2579;
	public static Class534 aClass534_2580;
	
	static {
		aClass234_2524 = new OutgoingPacket(1, 1);
		aClass234_2473 = new OutgoingPacket(2, 1);
		OBJECT_CLICK2_PACKET = new OutgoingPacket(3, 9);
		ACTION_BUTTON1_PACKET = new OutgoingPacket(4, 8);
		CAPE_COLOR_PACKET = new OutgoingPacket(5, 2);
		INTERFACE_ON_NPC_PACKET = new OutgoingPacket(6, 11);
		SWITCH_ITEM_INTERFACE_PACKET = new OutgoingPacket(7, 16);
		aClass234_2476 = new OutgoingPacket(8, 4);
		aClass234_2478 = new OutgoingPacket(9, -1);
		aClass234_2542 = new OutgoingPacket(10, -2);
		aClass234_2479 = new OutgoingPacket(11, -2);
		aClass234_2543 = new OutgoingPacket(12, -1);
		ACTION_BUTTON3_PACKET = new OutgoingPacket(13, 8);
		aClass234_2525 = new OutgoingPacket(14, -2);
		aClass234_2484 = new OutgoingPacket(15, -1);
		OBJECT_CLICK3_PACKET = new OutgoingPacket(16, 9);
		REMOVE_IGNORE_PACKET = new OutgoingPacket(17, -1);
		aClass234_2486 = new OutgoingPacket(18, 2);
		aClass234_2487 = new OutgoingPacket(19, 4);
		COMMAND_PACKET = new OutgoingPacket(20, -1);
		ENTER_LONG_PACKET = new OutgoingPacket(21, -1);
		ACTION_BUTTON2_PACKET = new OutgoingPacket(22, 8);
		aClass234_2491 = new OutgoingPacket(23, 7);
		aClass234_2492 = new OutgoingPacket(24, -2);
		aClass234_2563 = new OutgoingPacket(25, -1);
		ITEM_ON_ITEM_PACKET = new OutgoingPacket(26, 16);
		aClass234_2495 = new OutgoingPacket(27, 7);
		ITEM_EXAMINE_PACKET = new OutgoingPacket(28, 8);
		aClass234_2497 = new OutgoingPacket(29, -2);
		PING_PACKET = new OutgoingPacket(30, 0);
		SCREEN_PACKET = new OutgoingPacket(31, 6);
		NPC_CLICK4_PACKET = new OutgoingPacket(32, 3);
		aClass234_2501 = new OutgoingPacket(33, 4);
		aClass234_2519 = new OutgoingPacket(34, 7);
		PLAYER_OPTION7_PACKET = new OutgoingPacket(35, 3);
		PLAYER_OPTION6_PACKET = new OutgoingPacket(36, 3);
		ACTION_BUTTON6_PACKET = new OutgoingPacket(37, 8);
		ADD_IGNORE_PACKET = new OutgoingPacket(38, -1);
		WORLD_MAP_PACKET = new OutgoingPacket(39, -1);
		OBJECT_CLICK1_PACKET = new OutgoingPacket(40, 9);
		WALKING_MINIMAP_PACKET = new OutgoingPacket(41, 18);
		aClass234_2510 = new OutgoingPacket(42, 7);
		NPC_CLICK2_PACKET = new OutgoingPacket(43, 3);
		PLAYER_OPTION1_PACKET = new OutgoingPacket(44, 3);
		KICK_FRIEND_CHAT_PACKET = new OutgoingPacket(45, -1);
		aClass234_2514 = new OutgoingPacket(46, 3);
		aClass234_2515 = new OutgoingPacket(47, -1);
		aClass234_2534 = new OutgoingPacket(48, 4);
		OBJECT_EXAMINE_PACKET = new OutgoingPacket(49, 9);
		aClass234_2518 = new OutgoingPacket(50, 3);
		aClass234_2527 = new OutgoingPacket(51, 7);
		FRIEND_QUICK_CHAT_PACKET = new OutgoingPacket(52, -1);
		PLAYER_OPTION9_PACKET = new OutgoingPacket(53, 3);
		ATTACK_NPC = new OutgoingPacket(54, 3);
		aClass234_2523 = new OutgoingPacket(55, 3);
		aClass234_2477 = new OutgoingPacket(56, 4);
		CLOSE_INTERFACE_PACKET = new OutgoingPacket(57, 0);
		PLAYER_OPTION4_PACKET = new OutgoingPacket(58, 3);
		ACTION_BUTTON5_PACKET = new OutgoingPacket(59, 8);
		aClass234_2516 = new OutgoingPacket(60, 4);
		aClass234_2529 = new OutgoingPacket(61, 7);
		TAKE_FLOOR_ITEM_PACKET = new OutgoingPacket(62, 7);
		aClass234_2531 = new OutgoingPacket(63, 2);
		REGION_UPDATE_PACKET = new OutgoingPacket(64, 0);
		ENTER_INTEGER_PACKET = new OutgoingPacket(65, 4);
		CLOSE_WORLD_MAP_PACKET = new OutgoingPacket(66, 4);
		aClass234_2535 = new OutgoingPacket(67, -1);
		ENTER_NAME_PACKET = new OutgoingPacket(68, -1);
		ACTION_BUTTON8_PACKET = new OutgoingPacket(69, 8);
		CHAT_TYPE_PACKET = new OutgoingPacket(70, 1);
		ADD_FRIEND_PACKET = new OutgoingPacket(71, -1);
		NPC_CLICK1_PACKET = new OutgoingPacket(72, 3);
		aClass234_2541 = new OutgoingPacket(73, 3);
		WALKING_PACKET = new OutgoingPacket(74, 5);
		FRIENDS_CHAT_RANK_PACKET = new OutgoingPacket(75, -1);
		ACTION_BUTTON4_PACKET = new OutgoingPacket(76, 8);
		aClass234_2545 = new OutgoingPacket(77, -1);
		aClass234_2488 = new OutgoingPacket(78, 4);
		PLAYER_OPTION2_PACKET = new OutgoingPacket(79, 3);
		ACTION_BUTTON10_PACKET = new OutgoingPacket(80, 8);
		REMOVE_FRIEND_PACKET = new OutgoingPacket(81, -1);
		OBJECT_CLICK5_PACKET = new OutgoingPacket(82, 9);
		DIALOGUE_CONTINUE_PACKET = new OutgoingPacket(83, 6);
		JOIN_FRIEND_CHAT_PACKET = new OutgoingPacket(84, -1);
		OBJECT_CLICK4_PACKET = new OutgoingPacket(85, 9);
		CHAT_PACKET = new OutgoingPacket(86, -1);
		QUICK_CHAT_PACKET = new OutgoingPacket(87, -1);
		NPC_CLICK3_PACKET = new OutgoingPacket(88, 3);
		aClass234_2513 = new OutgoingPacket(89, 15);
		aClass234_2558 = new OutgoingPacket(90, 6);
		aClass234_2559 = new OutgoingPacket(91, 9);
		aClass234_2560 = new OutgoingPacket(92, 1);
		aClass234_2561 = new OutgoingPacket(93, 4);
		aClass234_2489 = new OutgoingPacket(94, 1);
		SEND_PM_PACKET = new OutgoingPacket(95, -2);
		aClass234_2470 = new OutgoingPacket(96, 15);
		aClass234_2565 = new OutgoingPacket(97, -2);
		aClass234_2566 = new OutgoingPacket(98, -1);
		aClass234_2567 = new OutgoingPacket(99, 12);
		aClass234_2546 = new OutgoingPacket(100, 0);
		aClass234_2569 = new OutgoingPacket(101, -1);
		aClass234_2570 = new OutgoingPacket(102, -2);
		ACTION_BUTTON7_PACKET = new OutgoingPacket(103, 8);
		PLAYER_OPTION3_PACKET = new OutgoingPacket(104, 3);
		GE_SELECT_PACKET = new OutgoingPacket(105, 2);
		INTERFACE_ON_PLAYER_PACKET = new OutgoingPacket(106, 11);
		INTERFACE_ON_OBJECT_PACKET = new OutgoingPacket(107, 17);
		HOT_KEY_PACKET = new OutgoingPacket(108, 2);
	}
		
	OutgoingPacket(int i, int i_0_) {
		((OutgoingPacket) this).anInt2576 = 1131265331 * i;
		((OutgoingPacket) this).anInt2577 = i_0_ * -1831696337;
	}
	
	static final void method2366(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class215.method2237(iComponentDefinitions, class120, class430, (short) 21521);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ju.db(").append(')').toString());
		}
	}
	
	public static void method2367(Class316 class316, int i) {
		try {
			if (((Class316) class316).aClass330_Sub40_Sub3_3271 != null)
				Class511.aClass330_Sub40_Sub4_5951.method3685(((Class316) class316).aClass330_Sub40_Sub3_3271);
			else
				((Class316) class316).anInt3264 = -2147483648;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ju.h(").append(')').toString());
		}
	}
	
	static String method2368(long l) {
		try {
			return Class102.method1220(new Date(l), "EEE dd-MMM-yyyy HH:mm:ss zzz", 2144768774);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ju.nr(").append(')').toString());
		}
	}
}
