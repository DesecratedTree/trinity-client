import java.io.IOException;

/* IncomingPacket - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class IncomingPacket {
	public static IncomingPacket GRAPHICS_PACKET;
	public static IncomingPacket aClass222_2188;
	public static IncomingPacket CAMERA_SHAKE_PACKET;
	public static IncomingPacket aClass222_2190;
	public static IncomingPacket SOUND_INDEX15_PACKET;
	public static IncomingPacket aClass222_2192;
	public static IncomingPacket CLAN_SETTINGS_PACKET;
	public static IncomingPacket aClass222_2194;
	public static IncomingPacket SET_MOUSE_PACKET;
	public static IncomingPacket aClass222_2196;
	public static IncomingPacket aClass222_2197;
	public static IncomingPacket aClass222_2198;
	public static IncomingPacket ALIVE_PACKET;
	public static IncomingPacket aClass222_2200;
	public static IncomingPacket ICOMPONENT_MODEL_PACKET;
	public static IncomingPacket GLOBAL_STRING1_PACKET;
	public static IncomingPacket aClass222_2203;
	public static IncomingPacket aClass222_2204;
	public static IncomingPacket SOUND_EFFECT_PACKET;
	public static IncomingPacket aClass222_2206;
	public static IncomingPacket aClass222_2207;
	public static IncomingPacket aClass222_2208;
	public static IncomingPacket GLOBAL_CONFIG1_PACKET;
	public static IncomingPacket aClass222_2210;
	public static IncomingPacket aClass222_2211;
	public static IncomingPacket aClass222_2212;
	public static IncomingPacket SOUND_INDEX14_PACKET;
	public static IncomingPacket aClass222_2214;
	public static IncomingPacket RESET_CAMERA_PACKET;
	public static IncomingPacket RUNSCRIPT_PACKET;
	public static IncomingPacket GROUND_ITEM_PACKET;
	public static IncomingPacket GAME_MESSAGE_PACKET;
	public static IncomingPacket aClass222_2219;
	public static IncomingPacket GAME_INTERFACE_PACKET;
	public static IncomingPacket aClass222_2221;
	public static IncomingPacket LOBBY_LOGOUT_PACKET;
	public static IncomingPacket aClass222_2223;
	public static IncomingPacket ITEM_WEIGHT_PACKET;
	public static IncomingPacket aClass222_2225;
	public static IncomingPacket RECEIVE_PRIVATE_MESSAGE_PACKET;
	public static IncomingPacket aClass222_2227;
	public static IncomingPacket aClass222_2228;
	public static IncomingPacket aClass222_2229;
	public static IncomingPacket aClass222_2230;
	public static IncomingPacket HINT_ICON_PACKET;
	public static IncomingPacket WINDOW_PANE_PACKET;
	public static IncomingPacket aClass222_2233;
	public static IncomingPacket VARP1_PACKET;
	public static IncomingPacket aClass222_2235;
	public static IncomingPacket aClass222_2236;
	public static IncomingPacket aClass222_2237;
	public static IncomingPacket aClass222_2238;
	public static IncomingPacket aClass222_2239;
	public static IncomingPacket aClass222_2240;
	public static IncomingPacket aClass222_2241;
	public static IncomingPacket GLOBAL_STRING2_PACKET;
	public static IncomingPacket CAMERA_ROTATION_PACKET;
	public static IncomingPacket aClass222_2244;
	public static IncomingPacket aClass222_2245;
	public static IncomingPacket aClass222_2246;
	public static IncomingPacket aClass222_2247;
	public static IncomingPacket SEND_URL_PACKET;
	public static IncomingPacket aClass222_2249;
	public static IncomingPacket aClass222_2250;
	public static IncomingPacket MUSIC_PACKET;
	public static IncomingPacket LARGE_NPC_UPDATE_PACKET;
	public static IncomingPacket aClass222_2253;
	public static IncomingPacket aClass222_2254;
	public static IncomingPacket aClass222_2255;
	public static IncomingPacket RUN_ENERGY_PACKET;
	public static IncomingPacket aClass222_2257;
	public static IncomingPacket REMOVE_GROUND_ITEM_PACKET;
	public static IncomingPacket NPC_UPDATE_PACKET;
	public static IncomingPacket PLAYERS_OVER_NPCS_PACKET;
	public static IncomingPacket GRAND_EXCHANGE_OFFER_PACKET;
	public static IncomingPacket GAME_BAR_STAGES_PACKET;
	public static IncomingPacket PRIVATE_GAME_BAR_STAGE_PACKET;
	public static IncomingPacket aClass222_2264;
	public static IncomingPacket CONFIG_BY_FILE1_PACKET;
	public static IncomingPacket aClass222_2266;
	public static IncomingPacket aClass222_2267;
	public static IncomingPacket aClass222_2268;
	public static IncomingPacket VARP2_PACKET;
	public static IncomingPacket ANIMATE_INTERFACE_PACKET;
	public static IncomingPacket aClass222_2271;
	public static IncomingPacket WORLD_TILE_PACKET;
	public static IncomingPacket SEND_FRIENDS_CHAT_MESSAGE_PACKET;
	public static IncomingPacket RECEIVE_FRIENDS_CHAT_MESSAGE_PACKET;
	public static IncomingPacket aClass222_2275;
	public static IncomingPacket MAP_REGION_PACKET;
	public static IncomingPacket PLAYERS_UPDATE_PACKET;
	public static IncomingPacket JOIN_CLAN_CHANNEL_PACKET;
	public static IncomingPacket aClass222_2279;
	public static IncomingPacket aClass222_2280;
	public static IncomingPacket UPDATE_ITEMS_PACKET;
	public static IncomingPacket aClass222_2282;
	public static IncomingPacket aClass222_2283;
	public static IncomingPacket INTERFACE_SPRIT_PACKET;
	public static IncomingPacket IGNORES_PACKET;
	public static IncomingPacket CONFIG_BY_FILE2_PACKET;
	public static IncomingPacket aClass222_2287;
	public static IncomingPacket PUBLIC_CHAT_PACKET;
	public static IncomingPacket aClass222_2289;
	public static IncomingPacket CAMERA_POSITION_PACKET;
	public static IncomingPacket aClass222_2291;
	public static IncomingPacket MINIMAP_FLAG_PACKET;
	public static IncomingPacket RECEIVE_CLAN_QUICKCHAT_MESSAGE_PACKET;
	public static IncomingPacket ICOMPONENT_TEXT_PACKET;
	public static IncomingPacket aClass222_2295;
	public static IncomingPacket CAMERA_LOOK_PACKET;
	public static IncomingPacket aClass222_2297;
	public static IncomingPacket aClass222_2298;
	public static IncomingPacket SPAWN_OBJECT_PACKET;
	public static IncomingPacket INTERFACE_CONFIG_PACKET;
	public static IncomingPacket WORLD_LIST_PACKET;
	public static IncomingPacket aClass222_2302;
	public static IncomingPacket aClass222_2303;
	public static IncomingPacket DESTROY_OBJECT_PACKET;
	public static IncomingPacket ACCESS_MASK_PACKET;
	public static IncomingPacket aClass222_2306;
	public static IncomingPacket RECEIVE_CLAN_CHAT_MESSAGE;
	public static IncomingPacket UNLOCK_IGNORES_LIST_PACKET;
	public static IncomingPacket aClass222_2309;
	public static IncomingPacket PLAYER_ON_INTERFACE_PACKET;
	public static IncomingPacket aClass222_2311;
	public static IncomingPacket aClass222_2312;
	public static IncomingPacket aClass222_2313;
	public static IncomingPacket PROJECTILE_PACKET;
	public static IncomingPacket aClass222_2315;
	public static IncomingPacket OBJECT_ANIMATION_PACKET;
	public static IncomingPacket aClass222_2317;
	public static IncomingPacket aClass222_2318;
	public static IncomingPacket aClass222_2319;
	public static IncomingPacket aClass222_2320;
	public static IncomingPacket NPC_ON_INTERFACE_PACKET;
	public static IncomingPacket SEND_ITEMS_PACKET;
	public static IncomingPacket ITEM_ON_INTERFACE_PACKET;
	public static IncomingPacket SEND_PRIVATE_MESSAGE_PACKET;
	public static IncomingPacket aClass222_2325;
	public static IncomingPacket aClass222_2326;
	public static IncomingPacket FRIENDS_PACKET;
	public static IncomingPacket LOGOUT_PACKET;
	public static IncomingPacket FRIENDS_CHAT_PACKET;
	public static IncomingPacket CUTSCENE_PACKET;
	public static IncomingPacket SKILL_STAT_PACKET;
	public static IncomingPacket aClass222_2332;
	public static IncomingPacket aClass222_2333;
	public static IncomingPacket SYSTEM_UPDATE_PACKET;
	public static IncomingPacket CLOSE_INTERFACE_PACKET;
	public static IncomingPacket aClass222_2336;
	public static IncomingPacket aClass222_2337;
	public static IncomingPacket PLAYER_OPTION_PACKET;
	public static IncomingPacket GLOBAL_CONFIG2_PACKET;
	public static IncomingPacket DYNAMIC_MAP_REGION_PACKET;
	public static IncomingPacket aClass222_2341;
	public static IncomingPacket aClass222_2342;
	public static IncomingPacket aClass222_2343;
	public static IncomingPacket aClass222_2344;
	public static IncomingPacket aClass222_2345;
	public static IncomingPacket MINIMAP_STATUS_PACKET;
	public static IncomingPacket SWITCH_WINDOW_PANE = new IncomingPacket(0, 8);
	public static IncomingPacket aClass222_2348;
	public static IncomingPacket aClass222_2349;
	public static IncomingPacket SWITCH_ITEMS_LOOK_PACKET;
	public static IncomingPacket VOICES_NAME_PACKET;
	public static IncomingPacket ONE_TWENTY_SKILLS_PACKET;
	public static IncomingPacket VERSION_PACKET;
	public static IncomingPacket NO_VOICES_PACKET;
	public static IncomingPacket CHANGE_PRICES_PACKET;
	public int anInt2350;
	public int anInt2351;

	static {
		CLAN_SETTINGS_PACKET = new IncomingPacket(1, -2);
		GAME_MESSAGE_PACKET = new IncomingPacket(2, -1);
		aClass222_2190 = new IncomingPacket(3, 10);
		SKILL_STAT_PACKET = new IncomingPacket(4, 6);
		aClass222_2241 = new IncomingPacket(5, 10);
		WORLD_TILE_PACKET = new IncomingPacket(6, 3);
		aClass222_2194 = new IncomingPacket(7, 32);
		SET_MOUSE_PACKET = new IncomingPacket(8, -1);
		aClass222_2230 = new IncomingPacket(9, 0);
		VARP1_PACKET = new IncomingPacket(10, 3);
		aClass222_2198 = new IncomingPacket(11, 2);
		ALIVE_PACKET = new IncomingPacket(12, 0);
		aClass222_2255 = new IncomingPacket(13, 8);
		ICOMPONENT_MODEL_PACKET = new IncomingPacket(14, 8);
		SOUND_INDEX14_PACKET = new IncomingPacket(15, 8);
		aClass222_2203 = new IncomingPacket(16, 8);
		ANIMATE_INTERFACE_PACKET = new IncomingPacket(17, 8);
		UNLOCK_IGNORES_LIST_PACKET = new IncomingPacket(18, 0);
		aClass222_2206 = new IncomingPacket(19, 0);
		aClass222_2207 = new IncomingPacket(20, 10);
		LOGOUT_PACKET = new IncomingPacket(21, 0);
		GLOBAL_CONFIG1_PACKET = new IncomingPacket(22, 3);
		FRIENDS_CHAT_PACKET = new IncomingPacket(23, -2);
		aClass222_2211 = new IncomingPacket(24, -2);
		CAMERA_POSITION_PACKET = new IncomingPacket(25, 6);
		SOUND_INDEX15_PACKET = new IncomingPacket(26, 6);
		aClass222_2247 = new IncomingPacket(27, 0);
		RESET_CAMERA_PACKET = new IncomingPacket(28, 0);
		RUNSCRIPT_PACKET = new IncomingPacket(29, -2);
		GROUND_ITEM_PACKET = new IncomingPacket(30, 5);
		aClass222_2325 = new IncomingPacket(31, -1);
		aClass222_2219 = new IncomingPacket(32, 1);
		aClass222_2236 = new IncomingPacket(33, 3);
		aClass222_2188 = new IncomingPacket(34, 0);
		LOBBY_LOGOUT_PACKET = new IncomingPacket(35, 0);
		aClass222_2223 = new IncomingPacket(36, -1);
		DESTROY_OBJECT_PACKET = new IncomingPacket(37, 2);
		aClass222_2343 = new IncomingPacket(38, 4);
		MUSIC_PACKET = new IncomingPacket(39, 4);
		aClass222_2227 = new IncomingPacket(40, 1);
		aClass222_2228 = new IncomingPacket(41, 7);
		ITEM_ON_INTERFACE_PACKET = new IncomingPacket(42, 10);
		SPAWN_OBJECT_PACKET = new IncomingPacket(43, 6);
		aClass222_2208 = new IncomingPacket(44, -1);
		WINDOW_PANE_PACKET = new IncomingPacket(45, 19);
		aClass222_2233 = new IncomingPacket(46, -1);
		GAME_INTERFACE_PACKET = new IncomingPacket(47, 23);
		aClass222_2235 = new IncomingPacket(48, 0);
		PLAYER_ON_INTERFACE_PACKET = new IncomingPacket(49, 4);
		GLOBAL_STRING1_PACKET = new IncomingPacket(50, -1);
		aClass222_2238 = new IncomingPacket(51, 5);
		aClass222_2239 = new IncomingPacket(52, 2);
		aClass222_2221 = new IncomingPacket(53, 6);
		aClass222_2197 = new IncomingPacket(54, 2);
		GLOBAL_STRING2_PACKET = new IncomingPacket(55, -2);
		CAMERA_ROTATION_PACKET = new IncomingPacket(56, 4);
		PUBLIC_CHAT_PACKET = new IncomingPacket(57, -1);
		ITEM_WEIGHT_PACKET = new IncomingPacket(58, -1);
		aClass222_2225 = new IncomingPacket(59, -2);
		RECEIVE_CLAN_QUICKCHAT_MESSAGE_PACKET = new IncomingPacket(60, -1);
		SEND_URL_PACKET = new IncomingPacket(61, -2);
		aClass222_2249 = new IncomingPacket(62, 3);
		aClass222_2229 = new IncomingPacket(63, 4);
		aClass222_2210 = new IncomingPacket(64, 25);
		LARGE_NPC_UPDATE_PACKET = new IncomingPacket(65, -2);
		aClass222_2253 = new IncomingPacket(66, 6);
		SEND_ITEMS_PACKET = new IncomingPacket(67, -2);
		GRAND_EXCHANGE_OFFER_PACKET = new IncomingPacket(68, 20);
		RUN_ENERGY_PACKET = new IncomingPacket(69, 1);
		aClass222_2317 = new IncomingPacket(70, 3);
		REMOVE_GROUND_ITEM_PACKET = new IncomingPacket(71, 3);
		NPC_UPDATE_PACKET = new IncomingPacket(72, -2);
		PLAYERS_OVER_NPCS_PACKET = new IncomingPacket(73, 1);
		HINT_ICON_PACKET = new IncomingPacket(74, 14);
		GAME_BAR_STAGES_PACKET = new IncomingPacket(75, 2);
		PRIVATE_GAME_BAR_STAGE_PACKET = new IncomingPacket(76, 1);
		aClass222_2264 = new IncomingPacket(77, 19);
		aClass222_2240 = new IncomingPacket(78, 8);
		aClass222_2266 = new IncomingPacket(79, 5);
		aClass222_2267 = new IncomingPacket(80, -1);
		aClass222_2268 = new IncomingPacket(81, 4);
		VARP2_PACKET = new IncomingPacket(82, 6);
		aClass222_2212 = new IncomingPacket(83, 5);
		aClass222_2271 = new IncomingPacket(84, 9);
		GRAPHICS_PACKET = new IncomingPacket(85, 12);
		SEND_FRIENDS_CHAT_MESSAGE_PACKET = new IncomingPacket(86, -1);
		RECEIVE_FRIENDS_CHAT_MESSAGE_PACKET = new IncomingPacket(87, 0);
		aClass222_2275 = new IncomingPacket(88, 28);
		MAP_REGION_PACKET = new IncomingPacket(89, -2);
		PLAYERS_UPDATE_PACKET = new IncomingPacket(90, -2);
		CAMERA_SHAKE_PACKET = new IncomingPacket(91, 6);
		aClass222_2279 = new IncomingPacket(92, 2);
		aClass222_2280 = new IncomingPacket(93, -2);
		UPDATE_ITEMS_PACKET = new IncomingPacket(94, -2);
		aClass222_2282 = new IncomingPacket(95, 6);
		aClass222_2283 = new IncomingPacket(96, 6);
		INTERFACE_SPRIT_PACKET = new IncomingPacket(97, 8);
		IGNORES_PACKET = new IncomingPacket(98, -2);
		CONFIG_BY_FILE2_PACKET = new IncomingPacket(99, 6);
		aClass222_2287 = new IncomingPacket(100, 8);
		MINIMAP_FLAG_PACKET = new IncomingPacket(101, 2);
		aClass222_2289 = new IncomingPacket(102, 4);
		aClass222_2204 = new IncomingPacket(103, 9);
		aClass222_2291 = new IncomingPacket(104, 2);
		aClass222_2196 = new IncomingPacket(105, 10);
		aClass222_2250 = new IncomingPacket(106, -2);
		ICOMPONENT_TEXT_PACKET = new IncomingPacket(107, -2);
		aClass222_2295 = new IncomingPacket(108, 6);
		CAMERA_LOOK_PACKET = new IncomingPacket(109, 6);
		aClass222_2297 = new IncomingPacket(110, 29);
		aClass222_2298 = new IncomingPacket(111, 1);
		aClass222_2257 = new IncomingPacket(112, 5);
		INTERFACE_CONFIG_PACKET = new IncomingPacket(113, 5);
		WORLD_LIST_PACKET = new IncomingPacket(114, -2);
		aClass222_2302 = new IncomingPacket(115, 10);
		aClass222_2303 = new IncomingPacket(116, -1);
		aClass222_2246 = new IncomingPacket(117, 11);
		ACCESS_MASK_PACKET = new IncomingPacket(118, 12);
		SOUND_EFFECT_PACKET = new IncomingPacket(119, 6);
		RECEIVE_CLAN_CHAT_MESSAGE = new IncomingPacket(120, -1);
		aClass222_2244 = new IncomingPacket(121, -1);
		aClass222_2309 = new IncomingPacket(122, 2);
		JOIN_CLAN_CHANNEL_PACKET = new IncomingPacket(123, -2);
		aClass222_2311 = new IncomingPacket(124, 1);
		aClass222_2312 = new IncomingPacket(125, 7);
		aClass222_2313 = new IncomingPacket(126, 10);
		PROJECTILE_PACKET = new IncomingPacket(127, 18);
		aClass222_2315 = new IncomingPacket(128, 3);
		OBJECT_ANIMATION_PACKET = new IncomingPacket(129, 9);
		aClass222_2254 = new IncomingPacket(130, -2);
		aClass222_2318 = new IncomingPacket(131, -1);
		aClass222_2319 = new IncomingPacket(132, -1);
		aClass222_2320 = new IncomingPacket(133, 10);
		NPC_ON_INTERFACE_PACKET = new IncomingPacket(134, 8);
		aClass222_2200 = new IncomingPacket(135, 0);
		RECEIVE_PRIVATE_MESSAGE_PACKET = new IncomingPacket(136, -2);
		SEND_PRIVATE_MESSAGE_PACKET = new IncomingPacket(137, -2);
		aClass222_2192 = new IncomingPacket(138, 0);
		aClass222_2326 = new IncomingPacket(139, -1);
		FRIENDS_PACKET = new IncomingPacket(140, -2);
		aClass222_2306 = new IncomingPacket(141, 21);
		aClass222_2245 = new IncomingPacket(142, 4);
		CUTSCENE_PACKET = new IncomingPacket(143, -2);
		aClass222_2214 = new IncomingPacket(144, -1);
		aClass222_2332 = new IncomingPacket(145, 2);
		aClass222_2333 = new IncomingPacket(146, -1);
		SYSTEM_UPDATE_PACKET = new IncomingPacket(147, 2);
		CLOSE_INTERFACE_PACKET = new IncomingPacket(148, 4);
		aClass222_2336 = new IncomingPacket(149, -2);
		aClass222_2337 = new IncomingPacket(150, 8);
		PLAYER_OPTION_PACKET = new IncomingPacket(151, -1);
		GLOBAL_CONFIG2_PACKET = new IncomingPacket(152, 6);
		DYNAMIC_MAP_REGION_PACKET = new IncomingPacket(153, -2);
		aClass222_2341 = new IncomingPacket(154, 1);
		aClass222_2342 = new IncomingPacket(155, 22);
		CONFIG_BY_FILE1_PACKET = new IncomingPacket(156, 3);
		aClass222_2344 = new IncomingPacket(157, 6);
		aClass222_2345 = new IncomingPacket(158, 1);
		MINIMAP_STATUS_PACKET = new IncomingPacket(159, 1);
		aClass222_2237 = new IncomingPacket(160, 25);
		aClass222_2348 = new IncomingPacket(161, -2);
		aClass222_2349 = new IncomingPacket(162, -2);
		SWITCH_ITEMS_LOOK_PACKET = new IncomingPacket(163, 1);
		VOICES_NAME_PACKET = new IncomingPacket(164, -2);
		ONE_TWENTY_SKILLS_PACKET = new IncomingPacket(165, 1);
		VERSION_PACKET = new IncomingPacket(166, 1);
		NO_VOICES_PACKET = new IncomingPacket(167, 1);
		CHANGE_PRICES_PACKET = new IncomingPacket(168, -2);
	}

	@SuppressWarnings("unused")
	private int opcode, size;

	IncomingPacket(int opcode, int size) {
		this.opcode = opcode;
		this.size = size;
		anInt2350 = opcode * -1877926575;
		anInt2351 = size * -1518297431;
	}

	static final boolean decodeIncomingPacket(Class1 class1, byte i) throws IOException {
		try {
			Class357 class357 = class1.method380(-1619413432);
			Class330_Sub46_Sub2 buffer = class1.aClass330_Sub46_Sub2_17;
			if (null == class357)
				return false;
			if (class1.currentIncomingPacket == null) {
				if (class1.aBoolean27) {
					if (!class357.method4194(1, -1020237123))
						return false;
					class357.method4195((class1.aClass330_Sub46_Sub2_17.payload), 0, 1, -206977139);
					class1.anInt31 += -1465637531;
					class1.anInt30 = 0;
					class1.aBoolean27 = false;
				}
				buffer.offset = 0;
				if (buffer.method3825((byte) 112)) {
					if (!class357.method4194(1, -1020237123))
						return false;
					class357.method4195((class1.aClass330_Sub46_Sub2_17.payload), 1, 1, -1966108589);
					class1.anInt31 += -1465637531;
					class1.anInt30 = 0;
				}
				class1.aBoolean27 = true;
				IncomingPacket[] class222s = Class386.method4431(1154287061);
				int i_1_ = buffer.method3826(-401075417);
				if (i_1_ < 0 || i_1_ >= class222s.length)
					throw new IOException(new StringBuilder().append(i_1_).append(" ").append(buffer.offset * -824785231).toString());
				class1.currentIncomingPacket = class222s[i_1_];
				class1.anInt26 = class1.currentIncomingPacket.anInt2351 * 2044972373;
			}
			if (-1 == class1.anInt26 * -275392715) {
				if (!class357.method4194(1, -1020237123))
					return false;
				class357.method4195(buffer.payload, 0, 1, 2052196055);
				class1.anInt26 = ((buffer.payload[0] & 0xff) * -2086862051);
				class1.anInt31 += -1465637531;
				class1.anInt30 = 0;
			}
			if (-2 == -275392715 * class1.anInt26) {
				if (!class357.method4194(2, -1020237123))
					return false;
				class357.method4195(buffer.payload, 0, 2, 32882663);
				buffer.offset = 0;
				class1.anInt26 = buffer.readUnsignedShort(-18636115) * -2086862051;
				class1.anInt31 += 1363692234;
				class1.anInt30 = 0;
			}
			if (-275392715 * class1.anInt26 > 0) {
				if (!class357.method4194((-275392715 * class1.anInt26), -1020237123))
					return false;
				buffer.offset = 0;
				class357.method4195(buffer.payload, 0, -275392715 * class1.anInt26, 1601804178);
				class1.anInt31 += -735276823 * class1.anInt26;
				class1.anInt30 = 0;
			}
			class1.aClass222_36 = class1.aClass222_35;
			class1.aClass222_35 = class1.aClass222_20;
			class1.aClass222_20 = class1.currentIncomingPacket;
			if (class1.aClass222_20.opcode != 12 && class1.aClass222_20.opcode != 90 && class1.aClass222_20.opcode != 72 && class1.aClass222_20.opcode != 118)
				/*System.out.println("WE HAS INCOMING PACKET " + class1.aClass222_20.opcode);*/
			if (SWITCH_ITEMS_LOOK_PACKET == class1.currentIncomingPacket) {
				boolean b = buffer.readByte((byte) 39) == 1;
				if(ItemDefinitions.OLD_ITEMS == b) {
					class1.currentIncomingPacket = null;
					return true;
				}
				ItemDefinitions.OLD_ITEMS = b;
				Class50.method632(false, (byte) 1);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (ONE_TWENTY_SKILLS_PACKET == class1.currentIncomingPacket) {
				boolean b = buffer.readUnsignedByte((byte) 39) == 1;
				if (b) {
					Class429.anIntArray4366 = new int[] { 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120 };
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (CHANGE_PRICES_PACKET == class1.currentIncomingPacket) {
				int slotsCount = buffer.readUnsignedShort(1114858842);
				for (int slot = 0; slot < slotsCount; slot++) {
					int price = buffer.readInt1((byte) 2);
					int id = buffer.readUnsignedShortA((byte) -115) - 1;
					if (price != -1 && id > 0)
						ItemDefinitions.changePrice(id, price);
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (VERSION_PACKET == class1.currentIncomingPacket) {
				int version = buffer.readUnsignedByte(822279483);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (WORLD_LIST_PACKET == class1.currentIncomingPacket) {
				boolean bool = buffer.readUnsignedByte(-1455800) == 1;
				byte[] is = new byte[class1.anInt26 * -275392715 - 1];
				buffer.readBytes(is, 0, (class1.anInt26 * -275392715) - 1, 1274334002);
				Class123.method1510(bool, is, (short) 255);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == LARGE_NPC_UPDATE_PACKET) {
				Class230.method2343(true, -387887132);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == HINT_ICON_PACKET) {
				int i_2_ = buffer.readUnsignedByte(1245914405);
				int i_3_ = i_2_ >> 5;
				int i_4_ = i_2_ & 0x1f;
				if (0 == i_4_) {
					client.aClass3Array8986[i_3_] = null;
					class1.currentIncomingPacket = null;
					return true;
				}
				Class3 class3 = new Class3();
				class3.anInt53 = 137241975 * i_4_;
				((Class3) class3).anInt46 = buffer.readUnsignedByte(1589744399) * -1193708591;
				if (((Class3) class3).anInt46 * -646855375 >= 0 && (((Class3) class3).anInt46 * -646855375 < Class125.aClass61Array1457.length)) {
					if (1 == -1598012345 * class3.anInt53 || 10 == -1598012345 * class3.anInt53) {
						class3.anInt47 = (buffer.readUnsignedShort(2125666124) * -1092243617);
						((Class3) class3).anInt54 = (buffer.readUnsignedShort(1959794116) * -702144025);
						buffer.offset += 1294403908;
					} else if (class3.anInt53 * -1598012345 >= 2 && -1598012345 * class3.anInt53 <= 6) {
						if (2 == class3.anInt53 * -1598012345) {
							class3.anInt51 = 1109046528;
							class3.anInt50 = -222582528;
						}
						if (-1598012345 * class3.anInt53 == 3) {
							class3.anInt51 = 0;
							class3.anInt50 = -222582528;
						}
						if (4 == class3.anInt53 * -1598012345) {
							class3.anInt51 = -2076874240;
							class3.anInt50 = -222582528;
						}
						if (5 == class3.anInt53 * -1598012345) {
							class3.anInt51 = 1109046528;
							class3.anInt50 = 0;
						}
						if (class3.anInt53 * -1598012345 == 6) {
							class3.anInt51 = 1109046528;
							class3.anInt50 = -445165056;
						}
						class3.anInt53 = 274483950;
						((Class3) class3).anInt48 = (buffer.readUnsignedByte(-280536378) * 1444303921);
						Class381 class381 = client.aClass304_9030.method3022(-369295592);
						class3.anInt51 += ((buffer.readUnsignedShort(1806442945) - class381.gameSceneBaseX * -1261027839) << 9) * 1614944949;
						class3.anInt50 += ((buffer.readUnsignedShort(1127723106) - -1542584207 * class381.gameSceneBaseY) << 9) * 200457129;
						((Class3) class3).anInt55 = ((buffer.readUnsignedByte(995192358) << 2) * -880843287);
						class3.anInt49 = (buffer.readUnsignedShort(1202069461) * -1788953349);
					}
					class3.anInt52 = (buffer.readInt((byte) 90) * 424526809);
					client.aClass3Array8986[i_3_] = class3;
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2341) {
				boolean bool = buffer.readUnsignedByte(1939490223) == 1;
				Class263_Sub3.method2630((byte) -43);
				Class211.aBoolean2061 = bool;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2291 == class1.currentIncomingPacket) {
				int i_5_ = buffer.readUnsignedLEShort(15163594);
				Class263_Sub3.method2630((byte) -114);
				Class95_Sub12_Sub1.method1140(i_5_, -1811134307);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2190 == class1.currentIncomingPacket) {
				int i_6_ = buffer.readUnsignedLEShort(15163594);
				int i_7_ = buffer.readUnsignedShort(395354870);
				int i_8_ = buffer.readInt1((byte) 2);
				int i_9_ = buffer.readUnsignedShort(1245397710);
				Class263_Sub3.method2630((byte) -95);
				Class228.method2316(i_8_, i_9_, i_6_, i_7_, -563985587);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2343 == class1.currentIncomingPacket) {
				int i_10_ = buffer.readInt((byte) 54);
				Class101.aClass148_6458 = new Class148(i_10_);
				Thread thread = new Thread(Class101.aClass148_6458);
				thread.setPriority(1);
				thread.start();
				class1.currentIncomingPacket = null;
				return true;
			}
			if (GRAND_EXCHANGE_OFFER_PACKET == class1.currentIncomingPacket) {
				int i_11_ = buffer.readUnsignedByte(576860694);
				if (buffer.readUnsignedByte(-76743863) == 0)
					client.aClass286Array9234[i_11_] = new Class286();
				else {
					buffer.offset -= 323600977;
					client.aClass286Array9234[i_11_] = new Class286(buffer);
				}
				client.anInt9202 = -1454106667 * client.anInt9268;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == OBJECT_ANIMATION_PACKET) {
				int i_12_ = buffer.readUnsignedByteC(-243015761);
				int i_13_ = i_12_ >> 2;
				int i_14_ = i_12_ & 0x3;
				int i_15_ = client.anIntArray9036[i_13_];
				int i_16_ = buffer.readInt((byte) 85);
				int i_17_ = i_16_ >> 28 & 0x3;
				int i_18_ = i_16_ >> 14 & 0x3fff;
				int i_19_ = i_16_ & 0x3fff;
				int i_20_ = buffer.readInt1((byte) 2);
				Class381 class381 = client.aClass304_9030.method3022(-646364676);
				i_18_ -= class381.gameSceneBaseX * -1261027839;
				i_19_ -= class381.gameSceneBaseY * -1542584207;
				Class147.method1744(i_17_, i_18_, i_19_, i_15_, i_13_, i_14_, i_20_, -1964924778);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (CONFIG_BY_FILE2_PACKET == class1.currentIncomingPacket) {
				int id = buffer.readUnsignedShortA((byte) -92);
				int value = buffer.readInt((byte) 4);
				Class158.aClass561_6474.sendConfigByFile(id, value, 16711935);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == RECEIVE_PRIVATE_MESSAGE_PACKET) {
				boolean bool = buffer.readUnsignedByte(34558536) == 1;
				String string = buffer.readString(-819401514);
				String string_23_ = string;
				if (bool)
					string_23_ = buffer.readString(246383565);
				long l = (long) buffer.readUnsignedShort(2086959762);
				long l_24_ = (long) buffer.readUnsignedTriByte(-1401356047);
				int rights = buffer.readUnsignedByte(489271900);
				long l_26_ = l_24_ + (l << 32);
				boolean bool_27_ = false;
				while_69_: do {
					for (int i_28_ = 0; i_28_ < 100; i_28_++) {
						if (client.aLongArray9064[i_28_] == l_26_) {
							bool_27_ = true;
							break while_69_;
						}
					}
					if (rights <= 1) {
						if (client.aBoolean9083 && !client.aBoolean9228
								|| client.aBoolean9073)
							bool_27_ = true;
						else if (Class65.foundPlayer(string_23_, -470807013))
							bool_27_ = true;
					}
				} while (false);
				if (!bool_27_) {
					client.aLongArray9064[34330819 * client.anInt9190] = l_26_;
					client.anInt9190 = 676829163 * ((34330819 * client.anInt9190 + 1) % 100);
					String string_29_ = (Class117
							.method1426(
									Class113.method1386(buffer, 1909155501),
									1201716859));
					if (rights == 2)
						Class81.sendSpeech(
								7,
								0,
								new StringBuilder()
										.append(Class325_Sub4.method3225(1,
												-2003475637)).append(string)
										.toString(),
								new StringBuilder()
										.append(Class325_Sub4.method3225(1,
												-1977796126))
										.append(string_23_).toString(), string,
								string_29_, null, -1, (byte) 35);
					else if (1 == rights)
						Class81.sendSpeech(
								7,
								0,
								new StringBuilder()
										.append(Class325_Sub4.method3225(0,
												-1032321354)).append(string)
										.toString(),
								new StringBuilder()
										.append(Class325_Sub4.method3225(0,
												720224291)).append(string_23_)
										.toString(), string, string_29_, null,
								-1, (byte) 33);
					else if(rights != 0)
						Class81.sendSpeech(3, 0, "<img="+rights+">"+string, "<img="+rights+">"+string_23_, string,
								string_29_, null, -1, (byte) 114);
					else
						Class81.sendSpeech(3, 0, string, string_23_, string,
								string_29_, null, -1, (byte) 114);
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == LOBBY_LOGOUT_PACKET) {
				Class330_Sub31.logout(Class360.lobby, 1317892923);
				class1.currentIncomingPacket = null;
				return false;
			}
			if (SWITCH_WINDOW_PANE == class1.currentIncomingPacket) {
				int fromHash = buffer.readLEInt(-4409072);
				int toHash = buffer.readInt2(-793658723);
				Class263_Sub3.method2630((byte) -33);
				Class330_Sub48 class330_sub48 = ((Class330_Sub48) client.aClass497_9284.method6094((long) fromHash));
				Class330_Sub48 class330_sub48_32_ = ((Class330_Sub48) client.aClass497_9284.method6094((long) toHash));
				if (class330_sub48_32_ != null)
					Class75.method854(class330_sub48_32_, (null == class330_sub48 || (class330_sub48.anInt7859 * 856598855 != 856598855 * (class330_sub48_32_.anInt7859))), false, -1649084571);
				if (null != class330_sub48) {
					class330_sub48.method3252(914366986);
					client.aClass497_9284.method6097(class330_sub48, (long) toHash);
				}
				IComponentDefinitions iComponentDefinitions = Class95.method1101(fromHash, -1756043255);
				if (iComponentDefinitions != null)
					Class404.method4738(iComponentDefinitions, 2059125602);
				iComponentDefinitions = Class95.method1101(toHash, 792113780);
				if (null != iComponentDefinitions) {
					Class404.method4738(iComponentDefinitions, 1810414351);
					Class156.method1829((Class3.aClass120Array56[(iComponentDefinitions.anInt1196 * 751119487 >>> 16)]), iComponentDefinitions, true, 392149236);
				}
				if (-1 != 1522181389 * client.windowPaneId)
					Class527.method6268(1522181389 * client.windowPaneId, 1, (byte) 54);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2337) {
				int i_33_ = buffer.readInt((byte) 21);
				int i_34_ = buffer.readInt((byte) 99);
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2559, class1.aClass488_22, 1787093595);
				class330_sub34.aClass330_Sub46_Sub2_7729.addInt2(i_33_, (byte) 1);
				class330_sub34.aClass330_Sub46_Sub2_7729.addInt2(i_34_, (byte) 1);
				class330_sub34.aClass330_Sub46_Sub2_7729.addByteS(client.anInt6603 * 2061800443, 698603049);
				class1.method378(class330_sub34, -1277754960);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2311 == class1.currentIncomingPacket) {
				int i_35_ = buffer.readUnsignedByte(1295400337);
				Class468 class468 = ((Class468) Class479.method6015(Class430.method5336(1109274241), i_35_, (byte) 69));
				if (null == class468)
					class468 = Class468.aClass468_6856;
				Class103.method1239(class468, (byte) -5);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2237) {
				int i_36_ = buffer.readInt1((byte) 2);
				int i_37_ = buffer.readUnsignedLEShortA(1433401916);
				int i_38_ = buffer.readInt((byte) 118);
				int i_39_ = buffer.readInt((byte) 58);
				int i_40_ = buffer.readUnsignedLEShortA(139057160);
				int i_41_ = buffer.readLEInt(-88067930);
				int i_42_ = buffer.readLEInt(570804311);
				int i_43_ = buffer.readUnsignedByte(734349342);
				Class263_Sub3.method2630((byte) -96);
				Class423.method5302(i_36_, new Class330_Sub48_Sub4(i_40_, i_43_, i_37_), new int[] { i_42_, i_41_, i_38_, i_39_ }, false, (short) 16385);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2253) {
				int i_44_ = buffer.readUnsignedLEShort(15163594);
				int i_45_ = buffer.readInt((byte) 31);
				Class263_Sub3.method2630((byte) -42);
				Class512.method6191(i_45_, i_44_, (byte) -17);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2188 == class1.currentIncomingPacket) {
				Class43.method591(-475877905);
				class1.currentIncomingPacket = null;
				return false;
			}
			if (class1.currentIncomingPacket == aClass222_2206) {
				Class158.aClass561_6474.method6463((short) -8466);
				client.anInt9186 += -1700491104;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (FRIENDS_PACKET == class1.currentIncomingPacket) {
				while (buffer.offset * -824785231 < -275392715 * class1.anInt26) {
					boolean bool = buffer.readUnsignedByte(2102327633) == 1;
					String string = buffer.readString(-905856779);
					String string_46_ = buffer.readString(1991129033);
					int i_47_ = buffer.readUnsignedShort(344113898);
					int i_48_ = buffer.readUnsignedByte(-241542926);
					boolean bool_49_ = buffer.readUnsignedByte(763393499) == 1;
					String string_50_ = "";
					int i_51_ = -1;
					int i_52_ = 0;
					if (i_47_ > 0) {
						string_50_ = buffer.readString(731507504);
						i_51_ = buffer.readUnsignedByte(1580020473);
						i_52_ = buffer.readInt((byte) 23);
					}
					for (int i_53_ = 0; i_53_ < 652732387 * client.anInt9256; i_53_++) {
						Class99 class99 = client.aClass99Array9259[i_53_];
						if (!bool) {
							if (string.equals(class99.aString915)) {
								if (1409329275 * class99.anInt911 != i_47_) {
									boolean bool_54_ = true;
									for (Class325_Sub5 class325_sub5 = ((Class325_Sub5) client.aClass467_9260.method5854(-857586788)); null != class325_sub5; class325_sub5 = ((Class325_Sub5) (client.aClass467_9260.method5857(-1547254846)))) {
										if (((Class325_Sub5) class325_sub5).aString7488.equals(string)) {
											if (0 != i_47_ && 0 == (((Class325_Sub5) class325_sub5).aShort7489)) {
												class325_sub5.method3204(590285252);
												bool_54_ = false;
											} else if (i_47_ == 0 && (0 != (((Class325_Sub5) class325_sub5).aShort7489))) {
												class325_sub5.method3204(1411096364);
												bool_54_ = false;
											}
										}
									}
									if (bool_54_)
										client.aClass467_9260.method5852(new Class325_Sub5(string, i_47_), (byte) 1);
									class99.anInt911 = -1649609037 * i_47_;
								}
								class99.aString910 = string_46_;
								class99.aString912 = string_50_;
								class99.anInt913 = 1920533125 * i_48_;
								class99.anInt914 = 417327293 * i_51_;
								class99.aBoolean909 = bool_49_;
								class99.anInt916 = -724645087 * i_52_;
								string = null;
								break;
							}
						} else if (string_46_.equals(class99.aString915)) {
							class99.aString915 = string;
							class99.aString910 = string_46_;
							string = null;
							break;
						}
					}
					if (string != null && 652732387 * client.anInt9256 < 200) {
						Class99 class99 = new Class99();
						client.aClass99Array9259[652732387 * client.anInt9256] = class99;
						class99.aString915 = string;
						class99.aString910 = string_46_;
						class99.anInt911 = i_47_ * -1649609037;
						class99.aString912 = string_50_;
						class99.anInt913 = 1920533125 * i_48_;
						class99.anInt914 = 417327293 * i_51_;
						class99.aBoolean909 = bool_49_;
						class99.anInt916 = i_52_ * -724645087;
						client.anInt9256 += -192113205;
					}
				}
				client.anInt9257 = -310010570;
				client.anInt9023 = 640746829 * client.anInt9268;
				boolean bool = false;
				int i_55_ = client.anInt9256 * 652732387;
				while_70_: do {
					do {
						if (i_55_ <= 0)
							break while_70_;
						bool = true;
						i_55_--;
						for (int i_56_ = 0; i_56_ < i_55_; i_56_++) {
							boolean bool_57_ = false;
							Class99 class99 = client.aClass99Array9259[i_56_];
							Class99 class99_58_ = client.aClass99Array9259[i_56_ + 1];
							if ((-115752509 * Class507.aClass498_5930.anInt5889 != 1409329275 * class99.anInt911) && (1409329275 * class99_58_.anInt911 == (Class507.aClass498_5930.anInt5889 * -115752509)))
								bool_57_ = true;
							if (!bool_57_ && 0 == 1409329275 * class99.anInt911 && class99_58_.anInt911 * 1409329275 != 0)
								bool_57_ = true;
							if (!bool_57_ && !class99.aBoolean909 && class99_58_.aBoolean909)
								bool_57_ = true;
							if (bool_57_) {
								Class99 class99_59_ = client.aClass99Array9259[i_56_];
								client.aClass99Array9259[i_56_] = client.aClass99Array9259[i_56_ + 1];
								client.aClass99Array9259[i_56_ + 1] = class99_59_;
								bool = false;
							}
						}
					} while (!bool);
					if (i <= 5)
						throw new IllegalStateException();
				} while (false);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (INTERFACE_SPRIT_PACKET == class1.currentIncomingPacket) {
				int i_60_ = buffer.readLEInt(17871800);
				int i_61_ = buffer.readInt1((byte) 2);
				Class263_Sub3.method2630((byte) -32);
				Class418.method5275(i_61_, i_60_, -403992181);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2348) {
				client.anInt9129 = 843193695 * client.anInt9268;
				boolean bool = buffer.readUnsignedByte(-41972783) == 1;
				Class170 class170 = new Class170(buffer);
				Class154 class154;
				if (bool)
					class154 = CacheIndex.aClass154_1450;
				else
					class154 = Class412.aClass154_4258;
				class170.method2037(class154, 2005549821);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (ITEM_ON_INTERFACE_PACKET == class1.currentIncomingPacket) {
				int i_62_ = buffer.readLEInt(79079617);
				int i_63_ = buffer.readUnsignedLEShort(15163594);
				if (i_63_ == 65535)
					i_63_ = -1;
				int i_64_ = buffer.readInt((byte) 23);
				Class263_Sub3.method2630((byte) -59);
				Class475_Sub4.method5957(i_62_, i_63_, i_64_, 2131353002);
				ItemDefinitions itemDefinitions = Class556.aClass510_6392.getItemDefinitions(i_63_, (byte) -51);
				Class228.method2316(i_62_, itemDefinitions.modelRotation1 * -1571069891, -946761133 * itemDefinitions.modelRotation2, itemDefinitions.modelZoom * -1740972253, -563985587);
				Class123.method1512(i_62_, itemDefinitions.modelOffset1 * -405699209, itemDefinitions.modelOffset2 * 1949126593, itemDefinitions.anInt6717 * 1180323099, (byte) -72);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (VARP1_PACKET == class1.currentIncomingPacket) {
				int id = buffer.readUnsignedLEShort(15163594);
				byte value = buffer.readByte((byte) 39);
				Class158.aClass561_6474.sendConfig(id, value, -1099000711);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2302 == class1.currentIncomingPacket) {
				int i_67_ = buffer.readInt2(-793658723);
				int i_68_ = buffer.readUnsignedLEShort(15163594);
				int i_69_ = buffer.readUnsignedShortA((byte) -43);
				int i_70_ = buffer.readUnsignedShortA((byte) -74);
				Class263_Sub3.method2630((byte) -13);
				Class134.method1577(i_67_, 7, i_68_ << 16 | i_70_, i_69_, 1533112188);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2342) {
				int i_71_ = buffer.readUnsignedByteC(-243015761);
				int i_72_ = buffer.readUnsignedByteC(-243015761) * 4;
				int i_73_ = buffer.method3801((byte) 0);
				int i_74_ = buffer.readByte((byte) 13);
				int i_75_ = buffer.readUnsignedShortA((byte) -102);
				int i_76_ = buffer.readUnsignedLEShortA(-1183541044);
				int i_77_ = buffer.readUnsignedShort(449606983);
				int i_78_ = buffer.readUnsignedShortA((byte) -31);
				int i_79_ = buffer.readUnsignedByte(1147067054);
				if (255 == i_79_)
					i_79_ = -1;
				int i_80_ = buffer.readUnsignedByteA(-741334169);
				int i_81_ = buffer.readUnsignedShort(1771761051);
				int i_82_ = buffer.readUnsignedShortA((byte) -2);
				int i_83_ = buffer.readByteC(-1921170978);
				int i_84_ = buffer.readShort(-1100583751);
				boolean bool = (i_71_ & 0x1) != 0;
				boolean bool_85_ = 0 != (i_71_ & 0x2);
				int i_86_ = bool_85_ ? i_71_ >> 2 : -1;
				if (bool_85_)
					i_80_ = (byte) i_80_;
				else
					i_80_ *= 4;
				Class381 class381 = client.aClass304_9030.method3022(-136879538);
				int i_87_ = i_75_ - 1772911618 * class381.gameSceneBaseX;
				int i_88_ = i_81_ - 1209798882 * class381.gameSceneBaseY;
				i_83_ += i_87_;
				i_74_ += i_88_;
				if (i_87_ >= 0 && i_88_ >= 0 && (i_87_ < client.aClass304_9030.method2990(-1667294495) * 2) && (i_88_ < client.aClass304_9030.method2990(-1129238636) * 2) && i_83_ >= 0 && i_74_ >= 0 && i_83_ < client.aClass304_9030.method3033((byte) -37) * 2 && i_74_ < client.aClass304_9030.method3033((byte) 6) * 2 && 65535 != i_82_) {
					i_87_ = 256 * i_87_;
					i_88_ *= 256;
					i_83_ *= 256;
					i_74_ = 256 * i_74_;
					i_80_ <<= 2;
					i_72_ <<= 2;
					i_77_ <<= 2;
					Class288.method2889(i_82_, i_73_, i_84_, i_86_, i_80_, i_72_, i_87_, i_88_, i_83_, i_74_, i_78_, i_76_, i_79_, i_77_, bool, 0, -1810287182);
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2192 == class1.currentIncomingPacket) {
				Class263_Sub2.method2625((byte) 119);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (PLAYERS_UPDATE_PACKET == class1.currentIncomingPacket) {
				Class537.method6323(buffer, -275392715 * class1.anInt26, 1270159900);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2257) {
				boolean bool = buffer.readUnsignedByteS(-400233324) == 1;
				int i_89_ = buffer.readLEInt(1878176116);
				Class263_Sub3.method2630((byte) -94);
				Class76_Sub2_Sub1.method915(i_89_, bool, (byte) -53);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2320) {
				Class204.method2182(Class213.aClass213_2075, 1543610202);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2230 == class1.currentIncomingPacket) {
				Class263_Sub3.method2630((byte) -82);
				Class166_Sub1.method1998((byte) 76);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2250) {
				byte[] is = new byte[class1.anInt26 * -275392715];
				buffer.method3828(is, 0, (-275392715 * class1.anInt26), 1689124730);
				String string = Class125.method1525(is, 0, (-275392715 * class1.anInt26), (byte) 1);
				if (client.aBoolean9198) {
					try {
						Class232.aClass232_2463.method2355(new Object[] { string }, -390918712);
					} catch (Throwable throwable) {
						/* empty */
					}
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == SOUND_INDEX14_PACKET) {
				int i_90_ = buffer.readUnsignedShort(2119426489);
				if (i_90_ == 65535)
					i_90_ = -1;
				int i_91_ = buffer.readUnsignedByte(1704805286);
				int i_92_ = buffer.readUnsignedShort(308544235);
				int i_93_ = buffer.readUnsignedByte(1195504038);
				int i_94_ = buffer.readUnsignedShort(861141133);
				Class115.method1415(i_90_, i_91_, i_92_, i_93_, i_94_, (byte) -1);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2313) {
				int i_95_ = buffer.readInt((byte) 118);
				int i_96_ = buffer.readUnsignedShort(370248487);
				if (65535 == i_96_)
					i_96_ = -1;
				int i_97_ = buffer.readUnsignedShortA((byte) -114);
				if (65535 == i_97_)
					i_97_ = -1;
				int i_98_ = buffer.readUnsignedShort(1015482386);
				Class263_Sub3.method2630((byte) -6);
				for (int i_99_ = i_97_; i_99_ <= i_96_; i_99_++) {
					long l = (long) i_99_ + ((long) i_95_ << 32);
					Class330_Sub2 class330_sub2 = (Class330_Sub2) client.aClass497_9211.method6094(l);
					Class330_Sub2 class330_sub2_100_;
					if (class330_sub2 == null) {
						if (i_99_ == -1)
							class330_sub2_100_ = new Class330_Sub2((Class95.method1101(i_95_, 29266536).aClass330_Sub2_1273.anInt7510) * -1700263873, i_98_);
						else
							class330_sub2_100_ = new Class330_Sub2(0, i_98_);
					} else {
						class330_sub2_100_ = new Class330_Sub2((class330_sub2.anInt7510 * -1700263873), i_98_);
						class330_sub2.method3252(388187907);
					}
					client.aClass497_9211.method6097(class330_sub2_100_, l);
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2275 == class1.currentIncomingPacket) {
				buffer.offset += 470892764;
				if (buffer.method3776(1250364350))
					Class79.method943(buffer, (buffer.offset * -824785231) - 28, -835307723);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2194) {
				int i_101_ = buffer.readInt((byte) 4);
				int i_102_ = buffer.readLEInt(-2072128558);
				Class381 class381 = new Class381(buffer.readInt2(-793658723));
				int i_103_ = buffer.readInt2(-793658723);
				int i_104_ = buffer.readInt((byte) 101);
				int i_105_ = buffer.readLEInt(-882162775);
				int i_106_ = buffer.readUnsignedByteS(-400233324);
				int i_107_ = buffer.readUnsignedByteS(-400233324);
				int i_108_ = i_107_ >> 2;
				int i_109_ = i_107_ & 0x3;
				int i_110_ = buffer.readUnsignedLEShort(15163594);
				int i_111_ = buffer.readInt((byte) 29);
				Class263_Sub3.method2630((byte) -5);
				Class423.method5302(i_103_, new Class330_Sub48_Sub2(i_110_, i_106_, new Class427(class381, i_108_, i_109_, i_101_)), new int[] { i_104_, i_102_, i_105_, i_111_ }, false, (short) 16385);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2197) {
				client.anInt9160 = buffer.readShort(-1100583751) * 964130077;
				client.anInt9208 = 1439714889 * client.anInt9268;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2227 == class1.currentIncomingPacket) {
				int i_112_ = buffer.readUnsignedByte(535010269);
				Class470 class470 = ((Class470) Class479.method6015(Class416.method5255(1588658766), i_112_, (byte) 90));
				if (class470 == null)
					class470 = Class470.aClass470_6869;
				Class279.method2746(class470, -1366788533);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2312 == class1.currentIncomingPacket) {
				Class204.method2182(Class213.aClass213_2066, 1806687096);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2245 == class1.currentIncomingPacket) {
				int i_113_ = buffer.readInt((byte) 29);
				Class263_Sub3.method2630((byte) -90);
				Class134.method1577(i_113_, 5, client.anInt9121 * 1478725729, 0, 1910565966);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == NPC_UPDATE_PACKET) {
				Class230.method2343(false, -387887132);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2332) {
				int i_114_ = buffer.readUnsignedShort(505367749);
				Class72.method828(i_114_, (byte) 101);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == VARP2_PACKET) {
				int value = buffer.readInt2(-793658723);
				int id = buffer.readUnsignedShortA((byte) -107);
				Class158.aClass561_6474.sendConfig(id, value, -1099000711);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == JOIN_CLAN_CHANNEL_PACKET) {
				client.anInt9181 = client.anInt9268 * -598315273;
				boolean bool = buffer.readUnsignedByte(737631490) == 1;
				if (1 == class1.anInt26 * -275392715) {
					if (bool)
						Class106.aClass330_Sub39_1009 = null;
					else
						Class_ra_Sub3.aClass330_Sub39_8652 = null;
					class1.currentIncomingPacket = null;
					return true;
				}
				if (bool)
					Class106.aClass330_Sub39_1009 = new Class330_Sub39(buffer);
				else
					Class_ra_Sub3.aClass330_Sub39_8652 = new Class330_Sub39(buffer);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == CONFIG_BY_FILE1_PACKET) {
				int value = buffer.readUnsignedByteA(-741334169);
				int id = buffer.readUnsignedLEShortA(970841134);
				Class158.aClass561_6474.sendConfigByFile(id, value, 16711935);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2287) {
				int i_119_ = buffer.readUnsignedShort(1593170244);
				if (65535 == i_119_)
					i_119_ = -1;
				int i_120_ = buffer.readUnsignedByte(350342883);
				int i_121_ = buffer.readUnsignedShort(104850184);
				int i_122_ = buffer.readUnsignedByte(-312083744);
				int i_123_ = buffer.readUnsignedShort(1659175048);
				Class197.method2147(i_119_, i_120_, i_121_, i_122_, false, i_123_, -1019729296);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2318) {
				Preferences.method2928(buffer.readString(1457499185), -1775509070);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2271) {
				int i_124_ = buffer.readInt2(-793658723);
				int i_125_ = buffer.readUnsignedByteS(-400233324);
				int i_126_ = buffer.readUnsignedLEShort(15163594);
				int i_127_ = buffer.readUnsignedLEShort(15163594);
				Class263_Sub3.method2630((byte) -110);
				Class432_Sub1_Sub3_Sub2.method5534(i_124_, i_125_, i_127_, i_126_, 1218955319);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == SEND_ITEMS_PACKET) {
				int containerKey = buffer.readUnsignedShort(1614115364);
				int keyAsInteger = buffer.readUnsignedByte(876389591);
				boolean negativeKey = 1 == (keyAsInteger & 0x1);
				Class473.method5912(containerKey, negativeKey, -1295864621);
				int slotsCount = buffer.readUnsignedShort(1114858842);
				for (int slot = 0; slot < slotsCount; slot++) {
					int amount = buffer.readUnsignedByteA(-741334169);
					if (255 == amount)
						amount = buffer.readInt1((byte) 2);
					int id = buffer.readUnsignedShortA((byte) -115);
					Class88.method1054(containerKey, slot, id - 1, amount, negativeKey, -1424974565);
				}
				client.anIntArray9187[(client.anInt9188 += 1359200273) * -182112015 - 1 & 0x1f] = containerKey;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2254) {
				int i_134_ = buffer.readUnsignedByte(952039832);
				int i_135_ = buffer.readBigSmart(-854154941);
				if (null != client.aClass327Array8999[i_134_]) {
					client.aClass327Array8999[i_134_].method3234(client.aClass304_9030.method3023(-400722441), -1282901725);
					client.aClass327Array8999[i_134_] = null;
				}
				if (i_135_ != -1) {
					client.aClass327Array8999[i_134_] = new Class327(Class361.aClass_ra3793, buffer, i_135_);
					client.aClass327Array8999[i_134_].method3233(client.aClass304_9030.method3023(-400722441), (byte) 0);
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == CAMERA_POSITION_PACKET) {
				int speed1 = buffer.readUnsignedByte(1938508456);
				int moveLocalX = buffer.readUnsignedByteS(-400233324);
				int speed2 = buffer.readUnsignedByteA(-741334169);
				int moveZ = buffer.readUnsignedLEShortA(-177515651) << 2;
				int moveLocalY = buffer.readUnsignedByteA(-741334169);
				Class263_Sub3.method2630((byte) -92);
				Class437.method5587(moveLocalX, moveLocalY, moveZ, speed2, speed1, true, (byte) 14);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2238 == class1.currentIncomingPacket) {
				Class204.method2182(Class213.aClass213_2073, -1227417923);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (GAME_BAR_STAGES_PACKET == class1.currentIncomingPacket) {
				client.anInt9227 = buffer.readUnsignedByteC(-243015761) * 742657285;
				client.anInt9264 = buffer.readUnsignedByteS(-400233324) * 1370679235;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2283 == class1.currentIncomingPacket) {
				Class204.method2182(Class213.aClass213_2071, 2118646851);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (CUTSCENE_PACKET == class1.currentIncomingPacket) {
				int i_141_ = buffer.readUnsignedShort(-384319976);
				client.anInt9040 = 777947407;
				client.anInt9265 = 608204173 * i_141_;
				client.anInt8987 = 489689844;
				Class76_Sub1.aClass280_7096.method2750(-358951611 * client.anInt9265, -1715573463);
				Class513.method6194((byte) 17);
				Class_ta.method5676(1217282492);
				int i_142_ = buffer.readUnsignedShort(284626571);
				Class140_Sub1.anIntArrayArray7262 = new int[i_142_][4];
				for (int i_143_ = 0; i_143_ < i_142_; i_143_++) {
					for (int i_144_ = 0; i_144_ < 4; i_144_++)
						Class140_Sub1.anIntArrayArray7262[i_143_][i_144_] = buffer.readInt((byte) 15);
				}
				int i_145_ = buffer.readUnsignedByte(1587415762);
				Class444.aClass330_Sub46_4496 = new Buffer(i_145_);
				Class444.aClass330_Sub46_4496.method3749(buffer.payload, -824785231 * buffer.offset, i_145_, (byte) 45);
				buffer.offset += 323600977 * i_145_;
				class1.currentIncomingPacket = null;
				return false;
			}
			if (WORLD_TILE_PACKET == class1.currentIncomingPacket) {
				Class1.anInt39 = buffer.readUnsignedByte(903435007) * -1376163033;
				IsaacCipher.anInt5837 = ((buffer.readByteC(-2067496350) << 3) * 635277037);
				Class153.anInt1634 = ((buffer.readByteC(-2143138940) << 3) * 859389701);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == ITEM_WEIGHT_PACKET) {
				int i_146_ = buffer.readUnsignedShort(331295435);
				String string = buffer.readString(738620093);
				boolean bool = buffer.readUnsignedByte(1598620189) == 1;
				Class357.aClass498_3703 = Class507.aClass498_5930;
				Class330_Sub3.aBoolean7514 = bool;
				IndexTable.method2783(i_146_, string, -428054553);
				// Object object = null;
				Class227.method2311(0, -1188873169);
				class1.currentIncomingPacket = null;
				return false;
			}
			if (class1.currentIncomingPacket == aClass222_2208) {
				boolean bool = buffer.readUnsignedByte(1890975973) == 1;
				String string = buffer.readString(-133006074);
				String string_147_ = string;
				if (bool)
					string_147_ = buffer.readString(1360282706);
				long l = buffer.readLong(-687700802);
				long l_148_ = (long) buffer.readUnsignedShort(125498032);
				long l_149_ = (long) buffer.readUnsignedTriByte(-1401356047);
				int i_150_ = buffer.readUnsignedByte(893638496);
				int i_151_ = buffer.readUnsignedShort(1654584233);
				long l_152_ = (l_148_ << 32) + l_149_;
				boolean bool_153_ = false;
				while_71_: do {
					for (int i_154_ = 0; i_154_ < 100; i_154_++) {
						if (client.aLongArray9064[i_154_] == l_152_) {
							bool_153_ = true;
							break while_71_;
						}
					}
					if (i_150_ <= 1 && Class65.foundPlayer(string_147_, -56580872))
						bool_153_ = true;
				} while (false);
				if (!bool_153_) {
					client.aLongArray9064[client.anInt9190 * 34330819] = l_152_;
					client.anInt9190 = 676829163 * ((1 + client.anInt9190 * 34330819) % 100);
					String string_155_ = Class2.aClass523_44.method6233(i_151_, 1627805447).method3457(buffer, 1850474658);
					if (i_150_ == 2)
						Class81.sendSpeech(20, 0, new StringBuilder().append(Class325_Sub4.method3225(1, 1409982546)).append(string).toString(), new StringBuilder().append(Class325_Sub4.method3225(1, -1777400868)).append(string_147_).toString(), string, string_155_, Class211.method2222(l), i_151_, (byte) 62);
					else if (i_150_ == 1)
						Class81.sendSpeech(20, 0, new StringBuilder().append(Class325_Sub4.method3225(0, 791904680)).append(string).toString(), new StringBuilder().append(Class325_Sub4.method3225(0, -944386485)).append(string_147_).toString(), string, string_155_, Class211.method2222(l), i_151_, (byte) 58);
					else
						Class81.sendSpeech(20, 0, string, string_147_, string, string_155_, Class211.method2222(l), i_151_, (byte) 74);
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (MINIMAP_STATUS_PACKET == class1.currentIncomingPacket) {
				Class9.anInt140 = buffer.readUnsignedByte(822279483) * -670589357;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (REMOVE_GROUND_ITEM_PACKET == class1.currentIncomingPacket) {
				Class204.method2182(Class213.aClass213_2072, 2098230110);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == MAP_REGION_PACKET) {
				Class330_Sub46_Sub2 class330_sub46_sub2_156_ = new Class330_Sub46_Sub2(-275392715 * class1.anInt26);
				System.arraycopy((class1.aClass330_Sub46_Sub2_17.payload), (class1.aClass330_Sub46_Sub2_17.offset) * -824785231, class330_sub46_sub2_156_.payload, 0, -275392715 * class1.anInt26);
				Class490.method6070(1018061315);
				if (Class448.aClass330_Sub50_5555.aClass464_Sub24_7904.method5825((byte) -17) == 1)
					Class43.aClass276_10073.method2725(new Class300(OutgoingPacketManager.aClass310_3210, class330_sub46_sub2_156_), (byte) 69);
				else
					client.aClass304_9030.method3026(new Class300(OutgoingPacketManager.aClass310_3210, class330_sub46_sub2_156_), 2025629542);
				class1.currentIncomingPacket = null;
				return false;
			}
			if (class1.currentIncomingPacket == aClass222_2196) {
				int i_157_ = buffer.readInt((byte) 72);
				int i_158_ = buffer.readUnsignedShort(462810155);
				int i_159_ = buffer.readLEInt(-1474622740);
				Class263_Sub3.method2630((byte) -58);
				Class134.method1577(i_157_, 5, i_158_, i_159_, 2005541031);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2266) {
				boolean bool = buffer.readUnsignedByte(-230332474) == 1;
				int i_160_ = buffer.readInt2(-793658723);
				if (bool != Class330_Sub36.aBoolean7737 || Class330_Sub10.anInt7590 * 1381829115 != i_160_) {
					Class330_Sub36.aBoolean7737 = bool;
					Class330_Sub10.anInt7590 = i_160_ * -847210189;
					Class230.method2339(Class545.aClass545_7003, -1, -1, 338846247);
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (RECEIVE_CLAN_QUICKCHAT_MESSAGE_PACKET == class1.currentIncomingPacket) {
				boolean bool = buffer.readUnsignedByte(1767452287) == 1;
				String string = buffer.readString(1471271186);
				long l = (long) buffer.readUnsignedShort(1675192756);
				long l_161_ = (long) buffer.readUnsignedTriByte(-1401356047);
				int i_162_ = buffer.readUnsignedByte(-178615331);
				int i_163_ = buffer.readUnsignedShort(1962991193);
				long l_164_ = (l << 32) + l_161_;
				boolean bool_165_ = false;
				Object object = null;
				Class330_Sub39 class330_sub39 = (bool ? Class106.aClass330_Sub39_1009 : Class_ra_Sub3.aClass330_Sub39_8652);
				while_72_: do {
					if (class330_sub39 == null)
						bool_165_ = true;
					else {
						for (int i_166_ = 0; i_166_ < 100; i_166_++) {
							if (client.aLongArray9064[i_166_] == l_164_) {
								bool_165_ = true;
								break while_72_;
							}
						}
						if (i_162_ <= 1 && Class65.foundPlayer(string, -1595229469))
							bool_165_ = true;
					}
				} while (false);
				if (!bool_165_) {
					client.aLongArray9064[client.anInt9190 * 34330819] = l_164_;
					client.anInt9190 = 676829163 * ((client.anInt9190 * 34330819 + 1) % 100);
					String string_167_ = Class2.aClass523_44.method6233(i_163_, 1082439719).method3457(buffer, 2104386322);
					int i_168_ = bool ? 42 : 45;
					if (2 == i_162_ || i_162_ == 3)
						Class81.sendSpeech(i_168_, 0, new StringBuilder().append(Class325_Sub4.method3225(1, 1756600827)).append(string).toString(), new StringBuilder().append(Class325_Sub4.method3225(1, -1664418511)).append(string).toString(), string, string_167_, class330_sub39.aString7757, i_163_, (byte) 73);
					else if (i_162_ == 1)
						Class81.sendSpeech(i_168_, 0, new StringBuilder().append(Class325_Sub4.method3225(0, 2111141153)).append(string).toString(), new StringBuilder().append(Class325_Sub4.method3225(0, 195438119)).append(string).toString(), string, string_167_, class330_sub39.aString7757, i_163_, (byte) 32);
					else
						Class81.sendSpeech(i_168_, 0, string, string, string, string_167_, class330_sub39.aString7757, i_163_, (byte) 100);
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2249 == class1.currentIncomingPacket) {
				Class1.anInt39 = buffer.readUnsignedByteC(-243015761) * -1376163033;
				IsaacCipher.anInt5837 = ((buffer.readByteA(-838454832) << 3) * 635277037);
				Class153.anInt1634 = ((buffer.readByteC(-2002872660) << 3) * 859389701);
				Class381 class381 = client.aClass304_9030.method3022(-1623295537);
				for (Class330_Sub9 class330_sub9 = ((Class330_Sub9) client.aClass497_9138.method6099((byte) 48)); null != class330_sub9; class330_sub9 = (Class330_Sub9) client.aClass497_9138.method6098((short) -32768)) {
					int i_169_ = (int) ((-6154793640677333111L * class330_sub9.aLong3341) >> 28 & 0x3L);
					int i_170_ = (int) ((-6154793640677333111L * class330_sub9.aLong3341) & 0x3fffL);
					int i_171_ = i_170_ - -1261027839 * class381.gameSceneBaseX;
					int i_172_ = (int) ((-6154793640677333111L * class330_sub9.aLong3341) >> 14 & 0x3fffL);
					int i_173_ = i_172_ - -1542584207 * class381.gameSceneBaseY;
					if (i_169_ == -2027989865 * Class1.anInt39 && i_171_ >= Class153.anInt1634 * -1437420083 && i_171_ < -1437420083 * Class153.anInt1634 + 8 && i_173_ >= IsaacCipher.anInt5837 * -520028443 && i_173_ < IsaacCipher.anInt5837 * -520028443 + 8) {
						class330_sub9.method3252(1498984882);
						if (i_171_ >= 0 && i_173_ >= 0 && (i_171_ < client.aClass304_9030.method2990(-585228026)) && i_173_ < client.aClass304_9030.method3033((byte) -108))
							Class343.method4001(-2027989865 * Class1.anInt39, i_171_, i_173_, -334637075);
					}
				}
				for (Class330_Sub10 class330_sub10 = (Class330_Sub10) Class330_Sub10.aClass471_7587.method5869(539664854); class330_sub10 != null; class330_sub10 = (Class330_Sub10) Class330_Sub10.aClass471_7587.method5873((byte) -36)) {
					if ((class330_sub10.anInt7582 * -533165901 >= Class153.anInt1634 * -1437420083) && (class330_sub10.anInt7582 * -533165901 < 8 + Class153.anInt1634 * -1437420083) && (class330_sub10.anInt7577 * 2127793995 >= -520028443 * IsaacCipher.anInt5837) && (2127793995 * class330_sub10.anInt7577 < -520028443 * IsaacCipher.anInt5837 + 8) && (((Class330_Sub10) class330_sub10).anInt7581 * 525431007) == Class1.anInt39 * -2027989865)
						((Class330_Sub10) class330_sub10).aBoolean7586 = true;
				}
				for (Class330_Sub10 class330_sub10 = (Class330_Sub10) Class330_Sub10.aClass471_7588.method5869(539664854); null != class330_sub10; class330_sub10 = (Class330_Sub10) Class330_Sub10.aClass471_7588.method5873((byte) 9)) {
					if ((-533165901 * class330_sub10.anInt7582 >= Class153.anInt1634 * -1437420083) && (class330_sub10.anInt7582 * -533165901 < -1437420083 * Class153.anInt1634 + 8) && (class330_sub10.anInt7577 * 2127793995 >= IsaacCipher.anInt5837 * -520028443) && (class330_sub10.anInt7577 * 2127793995 < 8 + IsaacCipher.anInt5837 * -520028443) && (Class1.anInt39 * -2027989865 == (((Class330_Sub10) class330_sub10).anInt7581 * 525431007)))
						((Class330_Sub10) class330_sub10).aBoolean7586 = true;
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == UPDATE_ITEMS_PACKET) {
				int containerKey = buffer.readUnsignedShort(307095930);
				int negativeKeyAsInt = buffer.readUnsignedByte(1074636966);
				boolean negativeKey = 1 == (negativeKeyAsInt & 0x1);
				while (-824785231 * buffer.offset < -275392715 * class1.anInt26) {
					int slot = buffer.readSmart(-611134765);
					int id = buffer.readUnsignedShort(1076638498);
					int amount = 0;
					if (id != 0) {
						amount = buffer.readUnsignedByte(1103320415);
						if (amount == 255)
							amount = buffer.readInt((byte) 80);
					}
					Class88.method1054(containerKey, slot, id - 1, amount, negativeKey, -1424974565);
				}
				client.anIntArray9187[(client.anInt9188 += 1359200273) * -182112015 - 1 & 0x1f] = containerKey;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (PLAYER_ON_INTERFACE_PACKET == class1.currentIncomingPacket) {
				int i_179_ = buffer.readInt1((byte) 2);
				Class263_Sub3.method2630((byte) -47);
				Class134.method1577(i_179_, 3, 1478725729 * client.anInt9121, 0, 2009983975);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2295 == class1.currentIncomingPacket) {
				int i_180_ = buffer.readUnsignedShort(2110953313);
				int i_181_ = buffer.readInt((byte) 49);
				Class263_Sub3.method2630((byte) -79);
				Class461.method5701(i_181_, i_180_, 612169738);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == GROUND_ITEM_PACKET) {
				Class204.method2182(Class213.aClass213_2074, 1321498744);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (MUSIC_PACKET == class1.currentIncomingPacket) {
				int volume = buffer.readUnsignedByteS(-400233324);
				int delay = buffer.readUnsignedByteC(-243015761);
				int musicId = buffer.readUnsignedShort(765264701);
				if (musicId == 65535)
					musicId = -1;
				Class18.method452(musicId, volume, delay, 1839365861);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2241) {
				int i_185_ = buffer.readInt((byte) 19);
				int i_186_ = buffer.readInt2(-793658723);
				int i_187_ = buffer.readUnsignedLEShortA(-124742140);
				Class263_Sub3.method2630((byte) -117);
				Class134.method1577(i_186_, 3, i_187_, i_185_, 2035333022);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2303) {
				String string = buffer.readString(1700264470);
				Console.method5241(string, false, false, -84872792);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2204) {
				int i_188_ = buffer.readUnsignedLEShortA(1295932173);
				int i_189_ = buffer.readUnsignedByteA(-741334169);
				int i_190_ = buffer.readUnsignedLEShort(15163594);
				int i_191_ = buffer.readLEInt(180647467);
				Class263_Sub3.method2630((byte) -79);
				Class521.method6225(i_191_, i_189_, i_188_, i_190_, -121826812);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (SOUND_EFFECT_PACKET == class1.currentIncomingPacket) {
				int unknown = buffer.read24BitUnsignedIntegerV2((byte) 71);
				int soundId = buffer.readUnsignedShort(-164705324);
				if (65535 == soundId)
					soundId = -1;
				int volume = buffer.readUnsignedByteS(-400233324);
				Class62.method767(soundId, unknown, volume, 889451349);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2210) {
				int i_195_ = buffer.readInt1((byte) 2);
				int i_196_ = buffer.readInt((byte) 13);
				int i_197_ = buffer.readInt2(-793658723);
				int i_198_ = buffer.readInt1((byte) 2);
				int i_199_ = buffer.readUnsignedShortA((byte) -42);
				int i_200_ = buffer.readLEInt(-479634473);
				int i_201_ = buffer.readUnsignedByteS(-400233324);
				int i_202_ = buffer.readUnsignedShortA((byte) -91);
				Class263_Sub3.method2630((byte) -16);
				Class423.method5302(i_197_, new Class330_Sub48_Sub3(i_202_, i_201_, i_199_), new int[] { i_196_, i_195_, i_198_, i_200_ }, false, (short) 16385);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2255 == class1.currentIncomingPacket) {
				int i_203_ = buffer.readUnsignedLEShortA(1559589562);
				int i_204_ = buffer.readUnsignedShortA((byte) -6);
				int i_205_ = buffer.readInt2(-793658723);
				Class263_Sub3.method2630((byte) -127);
				Class330_Sub12_Sub6.method3305(i_205_, (i_203_ << 16) + i_204_, 14451499);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (SET_MOUSE_PACKET == class1.currentIncomingPacket) {
				Class276.aString2861 = (-275392715 * class1.anInt26 > 2 ? buffer.readString(151563408) : Class526.aClass526_6166.method6257(Class429.aClass454_4369, 991479434));
				client.anInt9137 = ((class1.anInt26 * -275392715 > 0 ? buffer.readUnsignedShort(1768918355) : -1) * 1863513823);
				if (client.anInt9137 * -417970913 == 65535)
					client.anInt9137 = -1863513823;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (PLAYER_OPTION_PACKET == class1.currentIncomingPacket) {
				String string = buffer.readString(540768413);
				int i_206_ = buffer.readUnsignedByteS(-400233324);
				int i_207_ = buffer.readUnsignedShortA((byte) -84);
				if (i_207_ == 65535)
					i_207_ = -1;
				int i_208_ = buffer.readUnsignedByteA(-741334169);
				if (i_206_ >= 1 && i_206_ <= 8) {
					if (string.equalsIgnoreCase("null"))
						string = null;
					client.aStringArray9167[i_206_ - 1] = string;
					client.anIntArray9134[i_206_ - 1] = i_207_;
					client.aBooleanArray9136[i_206_ - 1] = 0 == i_208_;
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2207 == class1.currentIncomingPacket) {
				int i_209_ = buffer.readUnsignedShort(1671227642);
				long l = buffer.readLong(78006376);
				if (Class332.anObjectArray6640 == null)
					Class332.anObjectArray6640 = new Object[(Class95_Sub7.aClass536_7157.anInt6230 * 1615917779)];
				Class332.anObjectArray6640[i_209_] = new Long(l);
				client.anIntArray9195[(client.anInt9196 += 432619797) * -1800337859 - 1 & 0x1f] = i_209_;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2223) {
				int i_210_ = buffer.readUnsignedShort(850301831);
				String string = buffer.readString(-619417190);
				if (null == Class332.anObjectArray6640)
					Class332.anObjectArray6640 = new Object[(Class95_Sub7.aClass536_7157.anInt6230 * 1615917779)];
				Class332.anObjectArray6640[i_210_] = string;
				client.anIntArray9195[(client.anInt9196 += 432619797) * -1800337859 - 1 & 0x1f] = i_210_;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (GAME_INTERFACE_PACKET == class1.currentIncomingPacket) {
				int overlay = buffer.readUnsignedByteS(-400233324);
				int interfaceId = buffer.readUnsignedLEShortA(1937198032);
				int windowHash = buffer.readInt2(-793658723);
				int i_214_ = buffer.readInt2(-793658723);
				int i_215_ = buffer.readInt1((byte) 2);
				int i_216_ = buffer.readInt2(-793658723);
				int i_217_ = buffer.readInt((byte) 118);
				System.out.println("Overlay: " + overlay + ", Interface ID: " + interfaceId + ", Window Hash = " + windowHash);
				Class263_Sub3.method2630((byte) -81);
				Class423.method5302(windowHash, new Class330_Sub48(interfaceId, overlay), new int[] { i_214_, i_215_, i_217_, i_216_ }, false, (short) 16385);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2326 == class1.currentIncomingPacket) {
				boolean bool = buffer.readUnsignedByte(959323780) == 1;
				String string = buffer.readString(104924925);
				String string_218_ = string;
				if (bool)
					string_218_ = buffer.readString(193968778);
				int i_219_ = buffer.readUnsignedByte(1282493055);
				int i_220_ = buffer.readUnsignedShort(980299530);
				boolean bool_221_ = false;
				if (i_219_ <= 1 && Class65.foundPlayer(string_218_, -28797826))
					bool_221_ = true;
				if (!bool_221_) {
					String string_222_ = Class2.aClass523_44.method6233(i_220_, 1055327717).method3457(buffer, 18923371);
					if (2 == i_219_)
						Class81.sendSpeech(25, 0, new StringBuilder().append(Class325_Sub4.method3225(1, 1633376072)).append(string).toString(), new StringBuilder().append(Class325_Sub4.method3225(1, 1825382120)).append(string_218_).toString(), string, string_222_, null, i_220_, (byte) 13);
					else if (i_219_ == 1)
						Class81.sendSpeech(25, 0, new StringBuilder().append(Class325_Sub4.method3225(0, 727795150)).append(string).toString(), new StringBuilder().append(Class325_Sub4.method3225(0, 16890533)).append(string_218_).toString(), string, string_222_, null, i_220_, (byte) 107);
					else
						Class81.sendSpeech(25, 0, string, string_218_, string, string_222_, null, i_220_, (byte) 124);
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2246 == class1.currentIncomingPacket) {
				int i_223_ = buffer.readUnsignedByte(-304703759);
				int i_224_ = buffer.readInt1((byte) 2);
				int i_225_ = buffer.readInt2(-793658723);
				int i_226_ = buffer.readUnsignedByte(1748519037);
				int i_227_ = buffer.readUnsignedByte(62912620);
				int i_228_ = i_224_ >> 28;
				int i_229_ = i_224_ >> 14 & 0x3fff;
				int i_230_ = i_224_ & 0x3fff;
				Class_ra.method4808(i_228_, i_229_, i_230_, i_223_, i_227_, i_225_, i_226_, -1973334292);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2344 == class1.currentIncomingPacket) {
				Class204.method2182(Class213.aClass213_2067, -175679184);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == RUN_ENERGY_PACKET) {
				client.anInt9159 = buffer.readUnsignedByte(142775009) * -983265357;
				client.anInt9208 = client.anInt9268 * 1439714889;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2214) {//friends chat packet
				String string = buffer.readString(1202328641);
				boolean bool = buffer.readUnsignedByte(1121975335) == 1;
				String string_231_;
				if (bool)
					string_231_ = buffer.readString(-34152931);
				else
					string_231_ = string;
				int i_232_ = buffer.readUnsignedShort(1750183152);
				byte i_233_ = buffer.readByte((byte) 13);
				boolean bool_234_ = false;
				if (i_233_ == -128)
					bool_234_ = true;
				if (bool_234_) {
					if (0 == Class452.anInt5561 * 1374414177) {
						class1.currentIncomingPacket = null;
						return true;
					}
					boolean bool_235_ = false;
					int i_236_;
					for (i_236_ = 0; i_236_ < Class452.anInt5561 * 1374414177; i_236_++) {
						if (Class95_Sub22.aClass13Array7210[i_236_].aString171.equals(string_231_) && i_232_ == -1945514607 * (Class95_Sub22.aClass13Array7210[i_236_].anInt169)) {
							if (i <= 5)
								throw new IllegalStateException();
							break;
						}
					}
					if (i_236_ < Class452.anInt5561 * 1374414177) {
						for (/**/; i_236_ < Class452.anInt5561 * 1374414177 - 1; i_236_++)
							Class95_Sub22.aClass13Array7210[i_236_] = Class95_Sub22.aClass13Array7210[i_236_ + 1];
						Class452.anInt5561 -= 958365345;
						Class95_Sub22.aClass13Array7210[(Class452.anInt5561 * 1374414177)] = null;
					}
				} else {
					String string_237_ = buffer.readString(-1399862228);
					Class13 class13 = new Class13();
					class13.aString172 = string;
					class13.aString171 = string_231_;
					((Class13) class13).aString170 = Class531.method6297(class13.aString171, -1877688524);
					class13.anInt169 = i_232_ * -75328655;
					class13.aByte173 = i_233_;
					class13.aString168 = string_237_;
					int i_238_;
					for (i_238_ = Class452.anInt5561 * 1374414177 - 1; i_238_ >= 0; i_238_--) {
						int i_239_ = ((Class13) Class95_Sub22.aClass13Array7210[i_238_]).aString170.compareTo(((Class13) class13).aString170);
						if (0 == i_239_) {
							Class95_Sub22.aClass13Array7210[i_238_].anInt169 = -75328655 * i_232_;
							Class95_Sub22.aClass13Array7210[i_238_].aByte173 = i_233_;
							Class95_Sub22.aClass13Array7210[i_238_].aString168 = string_237_;
							if (string_231_.equals(Class263_Sub2.myPlayer.aString10221))
								Class513.aByte5966 = i_233_;
							client.anInt9109 = 221217995 * client.anInt9268;
							class1.currentIncomingPacket = null;
							return true;
						}
						if (i_239_ < 0) {
							if (i <= 5) {
								/* empty */
							}
							break;
						}
					}
					if (1374414177 * Class452.anInt5561 >= Class95_Sub22.aClass13Array7210.length) {
						class1.currentIncomingPacket = null;
						return true;
					}
					for (int i_240_ = 1374414177 * Class452.anInt5561 - 1; i_240_ > i_238_; i_240_--)
						Class95_Sub22.aClass13Array7210[i_240_ + 1] = Class95_Sub22.aClass13Array7210[i_240_];
					if (0 == 1374414177 * Class452.anInt5561)
						Class95_Sub22.aClass13Array7210 = new Class13[100];
					Class95_Sub22.aClass13Array7210[i_238_ + 1] = class13;
					Class452.anInt5561 += 958365345;
					if (string_231_.equals(Class263_Sub2.myPlayer.aString10221))
						Class513.aByte5966 = i_233_;
				}
				client.anInt9109 = client.anInt9268 * 221217995;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == GLOBAL_STRING2_PACKET) {
				int i_241_ = buffer.readUnsignedLEShortA(890687899);
				String string = buffer.readString(975385092);
				Class263_Sub3.method2630((byte) -53);
				Class_ra_Sub3.method5217(i_241_, string, -1374652876);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (GAME_MESSAGE_PACKET == class1.currentIncomingPacket) {
				int type = buffer.readSmart(-643024765);
				int i_243_ = buffer.readInt((byte) 110);
				int i_244_ = buffer.readUnsignedByte(948789157);
				String string = "";
				String playerName = string;
				if ((i_244_ & 0x1) != 0) {
					string = buffer.readString(931998484);
					if ((i_244_ & 0x2) != 0)
						playerName = buffer.readString(-1266183473);
					else
						playerName = string;
				}
				String text = buffer.readString(-467763289);
				if (type == 99)
					Class56.panelBoxMessage(text, -1971837846);
				else if (98 == type)
					Class154.method1821(text, 974586738);
				else {
					if (!playerName.equals("") && Class65.foundPlayer(playerName, -473410086)) {
						class1.currentIncomingPacket = null;
						return true;
					}
					Class556.method6406(type, i_243_, string, playerName, string, text, -1981632762);
					String withoutSigns = text.replaceAll("<.+?>", "");
					System.out.println(withoutSigns);
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2319 == class1.currentIncomingPacket) {
				Class204.method2182(Class213.aClass213_2068, 962524669);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (SKILL_STAT_PACKET == class1.currentIncomingPacket) {
				int i_247_ = buffer.readUnsignedByteS(-400233324);
				int i_248_ = buffer.readUnsignedByteA(-741334169);
				int i_249_ = buffer.readLEInt(1909900765);
				client.anIntArray9144[i_247_] = i_249_;
				client.anIntArray9117[i_247_] = i_248_;
				client.anIntArray9143[i_247_] = 1;
				int i_250_ = Class429.anIntArray4366[i_247_] - 1;
				for (int i_251_ = 0; i_251_ < i_250_; i_251_++) {
					if (i_249_ >= Class429.anIntArray4365[i_251_])
						client.anIntArray9143[i_247_] = 2 + i_251_;
				}
				client.anIntArray9189[(client.anInt9247 += 93294437) * 1741556333 - 1 & 0x1f] = i_247_;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (CAMERA_ROTATION_PACKET == class1.currentIncomingPacket) {
				int i_252_ = buffer.readUnsignedShort(1638886828);
				int i_253_ = buffer.readUnsignedShort(1066169125);
				Class263_Sub3.method2630((byte) -3);
				Class157.method1834(i_252_, i_253_, 0, (byte) 68);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2229) {
				int i_254_ = buffer.readInt((byte) 125);
				Class263_Sub3.method2630((byte) -61);
				if (i_254_ == -1) {
					Class457.anInt6844 = 1651776935;
					Class439.anInt4456 = 1180637393;
				} else {
					Class381 class381 = client.aClass304_9030.method3022(179397726);
					int i_255_ = i_254_ >> 14 & 0x3fff;
					int i_256_ = i_254_ & 0x3fff;
					i_255_ -= class381.gameSceneBaseX * -1261027839;
					if (i_255_ < 0)
						i_255_ = 0;
					else if (i_255_ >= client.aClass304_9030.method2990(-1505560219))
						i_255_ = client.aClass304_9030.method2990(-2034925469);
					i_256_ -= -1542584207 * class381.gameSceneBaseY;
					if (i_256_ < 0)
						i_256_ = 0;
					else if (i_256_ >= client.aClass304_9030.method3033((byte) -63))
						i_256_ = client.aClass304_9030.method3033((byte) -108);
					Class457.anInt6844 = -1651776935 * (256 + (i_255_ << 9));
					Class439.anInt4456 = -1180637393 * (256 + (i_256_ << 9));
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2315 == class1.currentIncomingPacket) {
				int i_257_ = buffer.readUnsignedLEShort(15163594);
				int i_258_ = buffer.readUnsignedByteC(-243015761);
				Class263_Sub3.method2630((byte) -34);
				Class415.method5246(i_257_, i_258_, true, -1549035603);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2203 == class1.currentIncomingPacket) {
				int i_259_ = buffer.readInt((byte) 36);
				int i_260_ = buffer.method3801((byte) 0);
				int i_261_ = buffer.method3797((short) -4291);
				Class263_Sub3.method2630((byte) -8);
				Class305.method3050(i_259_, i_260_, i_261_, (byte) 123);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == GRAPHICS_PACKET) {
				int slotId = buffer.readUnsignedByteS(-400233324);
				int hash = buffer.readUnsignedByteA(-741334169);
				int graphicsHeight = buffer.readUnsignedShortA((byte) -88);
				int speed = buffer.readUnsignedShort(745084552);
				int targetHash = buffer.readInt((byte) 110);
				int graphicsId = buffer.readUnsignedShort(2028049331);
				if (65535 == graphicsId)
					graphicsId = -1;
				int i_268_ = hash & 0x7;
				int i_269_ = hash >> 3 & 0xf;
				if (15 == i_269_)
					i_269_ = -1;
				boolean bool = (hash >> 7 & 0x1) == 1;
				if (0 != targetHash >> 30) {//worldtile
					Class381 class381 = client.aClass304_9030.method3022(2131803749);
					int i_270_ = targetHash >> 28 & 0x3;
					int i_271_ = ((targetHash >> 14 & 0x3fff) - class381.gameSceneBaseX * -1261027839);
					int i_272_ = (targetHash & 0x3fff) - class381.gameSceneBaseY * -1542584207;
					if (i_271_ >= 0 && i_272_ >= 0 && (i_271_ < client.aClass304_9030.method2990(-1555329862)) && (i_272_ < client.aClass304_9030.method3033((byte) -49))) {
						if (graphicsId == -1) {
							Class330_Sub36_Sub2 class330_sub36_sub2 = ((Class330_Sub36_Sub2) (client.aClass497_9216.method6094((long) (i_271_ << 16 | i_272_))));
							if (class330_sub36_sub2 != null) {
								((Class330_Sub36_Sub2) class330_sub36_sub2).aClass432_Sub1_Sub1_Sub4_9624.method5503(888749273);
								class330_sub36_sub2.method3252(-538178536);
							}
						} else {
							int i_273_ = 256 + i_271_ * 512;
							int i_274_ = 256 + 512 * i_272_;
							int i_275_ = i_270_;
							if (i_275_ < 3 && client.aClass304_9030.method2995(1184381119).method2788(i_271_, i_272_, (byte) -40))
								i_275_++;
							Class432_Sub1_Sub1_Sub4 class432_sub1_sub1_sub4 = (new Class432_Sub1_Sub1_Sub4(client.aClass304_9030.method3023(-400722441), graphicsId, speed, i_270_, i_275_, i_273_, Class431.method5342(i_273_, i_274_, i_270_, 1996761881) - graphicsHeight, i_274_, i_271_, i_271_, i_272_, i_272_, i_268_, bool, 0));
							client.aClass497_9216.method6097((new Class330_Sub36_Sub2(class432_sub1_sub1_sub4)), (long) (i_271_ << 16 | i_272_));
						}
					}
				} else if (targetHash >> 29 != 0) {//npc
					int i_276_ = targetHash & 0xffff;
					Class330_Sub35 class330_sub35 = ((Class330_Sub35) client.aClass497_9014.method6094((long) i_276_));
					if (null != class330_sub35) {
						NPC npc = ((NPC) class330_sub35.anObject7733);
						Gfx class66 = (npc.graphics[slotId]);
						if (65535 == graphicsId)
							graphicsId = -1;
						boolean bool_277_ = true;
						int i_278_ = 888084571 * class66.id;
						if (graphicsId != -1 && -1 != i_278_) {
							if (graphicsId == i_278_) {
								Class437 class437 = Class136.aClass416_1527.method5254(graphicsId, -987037057);
								if (class437.aBoolean4443 && -1 != class437.anInt4431 * 1258856743) {
									Class440 class440 = (Class201.aClass436_6511.method5570(class437.anInt4431 * 1258856743, -1403698335));
									int i_279_ = class440.anInt4472 * -2030693815;
									if (i_279_ == 0 || i_279_ == 2)
										bool_277_ = false;
									else if (i_279_ == 1)
										bool_277_ = true;
								}
							} else {
								Class437 class437 = Class136.aClass416_1527.method5254(graphicsId, -348164064);
								Class437 class437_280_ = Class136.aClass416_1527.method5254(i_278_, -687784550);
								if (-1 != class437.anInt4431 * 1258856743 && (1258856743 * class437_280_.anInt4431 != -1)) {
									Class440 class440 = (Class201.aClass436_6511.method5570(class437.anInt4431 * 1258856743, 1212545554));
									Class440 class440_281_ = (Class201.aClass436_6511.method5570((class437_280_.anInt4431 * 1258856743), -500759808));
									if (class440.anInt4470 * -233463405 < class440_281_.anInt4470 * -233463405)
										bool_277_ = false;
								}
							}
						}
						if (bool_277_) {
							class66.id = -1988601901 * graphicsId;
							class66.height = graphicsHeight * 1203531965;
							class66.anInt572 = i_269_ * -761522437;
							if (graphicsId != -1) {
								Class437 class437 = Class136.aClass416_1527.method5254(graphicsId, -1540491307);
								int i_282_ = class437.aBoolean4443 ? 0 : 2;
								if (bool)
									i_282_ = 1;
								class66.aClass477_573.method5970(class437.anInt4431 * 1258856743, speed, i_282_, false, -2030493597);
							} else
								class66.aClass477_573.method5988(-1, (byte) -46);
						}
					}
				} else if (0 != targetHash >> 28) {//player
					int i_283_ = targetHash & 0xffff;
					Player player;
					if (i_283_ == client.anInt9121 * 1478725729)
						player = Class263_Sub2.myPlayer;
					else
						player = (client.players[i_283_]);
					if (player != null) {
						Gfx class66 = (player.graphics[slotId]);
						if (65535 == graphicsId)
							graphicsId = -1;
						boolean bool_284_ = true;
						int i_285_ = class66.id * 888084571;
						if (graphicsId != -1 && i_285_ != -1) {
							if (graphicsId == i_285_) {
								Class437 class437 = Class136.aClass416_1527.method5254(graphicsId, -830528614);
								if (class437.aBoolean4443 && 1258856743 * class437.anInt4431 != -1) {
									Class440 class440 = (Class201.aClass436_6511.method5570(1258856743 * class437.anInt4431, -1885475118));
									int i_286_ = class440.anInt4472 * -2030693815;
									if (i_286_ == 0 || 2 == i_286_)
										bool_284_ = false;
									else if (1 == i_286_)
										bool_284_ = true;
								}
							} else {
								Class437 class437 = Class136.aClass416_1527.method5254(graphicsId, -1297358829);
								Class437 class437_287_ = Class136.aClass416_1527.method5254(i_285_, -1738714106);
								if (1258856743 * class437.anInt4431 != -1 && (1258856743 * class437_287_.anInt4431 != -1)) {
									Class440 class440 = (Class201.aClass436_6511.method5570(1258856743 * class437.anInt4431, 1195995432));
									Class440 class440_288_ = (Class201.aClass436_6511.method5570((1258856743 * class437_287_.anInt4431), -717538406));
									if (-233463405 * class440.anInt4470 < class440_288_.anInt4470 * -233463405)
										bool_284_ = false;
								}
							}
						}
						if (bool_284_) {
							class66.id = -1988601901 * graphicsId;
							class66.height = graphicsHeight * 1203531965;
							class66.anInt572 = i_269_ * -761522437;
							class66.anInt575 = i_268_ * -1423578783;
							if (-1 != graphicsId) {
								Class437 class437 = Class136.aClass416_1527.method5254(graphicsId, 1025764732);
								int i_289_ = class437.aBoolean4443 ? 0 : 2;
								if (bool)
									i_289_ = 1;
								class66.aClass477_573.method5970(class437.anInt4431 * 1258856743, speed, i_289_, false, -1967272801);
							} else
								class66.aClass477_573.method5988(-1, (byte) -6);
						}
					}
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == CLOSE_INTERFACE_PACKET) {
				int i_290_ = buffer.readInt2(-793658723);
				Class263_Sub3.method2630((byte) -32);
				Class330_Sub48 class330_sub48 = ((Class330_Sub48) client.aClass497_9284.method6094((long) i_290_));
				if (class330_sub48 != null)
					Class75.method854(class330_sub48, true, false, -1235540325);
				if (null != client.aClass114_9078) {
					Class404.method4738(client.aClass114_9078, 1862969853);
					client.aClass114_9078 = null;
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (SYSTEM_UPDATE_PACKET == class1.currentIncomingPacket) {
				if (Class226.method2307(-296919301 * client.anInt8995, (byte) 49))
					client.anInt9026 = (int) ((float) buffer.readUnsignedShort(1803791689) * 2.5F) * 473233063;
				else
					client.anInt9026 = (buffer.readUnsignedShort(-68807800) * 1312090002);
				client.anInt9208 = 1439714889 * client.anInt9268;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == SPAWN_OBJECT_PACKET) {
				Class204.method2182(Class213.aClass213_2069, -1499871138);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (RESET_CAMERA_PACKET == class1.currentIncomingPacket) {
				Class263_Sub3.method2630((byte) -18);
				Class340.method3971(1518850702);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2235 == class1.currentIncomingPacket) {
				if (-1 != client.windowPaneId * 1522181389)
					Class527.method6268(1522181389 * client.windowPaneId, 0, (byte) 54);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (MINIMAP_FLAG_PACKET == class1.currentIncomingPacket) {
				int i_291_ = buffer.readUnsignedByteA(-741334169);
				int i_292_ = buffer.readUnsignedByteC(-243015761);
				if (255 == i_292_) {
					i_292_ = -1;
					i_291_ = -1;
				}
				Class487.method6037(i_292_, i_291_, 1573515222);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (CAMERA_LOOK_PACKET == class1.currentIncomingPacket) {
				int viewZ = buffer.readUnsignedShortA((byte) -96) << 2;
				int viewLocalY = buffer.readUnsignedByte(795090636);
				int speed1 = buffer.readUnsignedByteS(-400233324);
				int speed2 = buffer.readUnsignedByteC(-243015761);
				int viewLocalX = buffer.readUnsignedByteS(-400233324);
				Class263_Sub3.method2630((byte) -111);
				Class102.method1223(viewLocalX, viewLocalY, viewZ, speed1, speed2, -1397321747);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (ICOMPONENT_TEXT_PACKET == class1.currentIncomingPacket) {
				String string = buffer.readString(1884188541);
				int i_298_ = buffer.readInt((byte) 33);
				Class263_Sub3.method2630((byte) -127);
				Class443.method5615(i_298_, string, 1079947428);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (LOGOUT_PACKET == class1.currentIncomingPacket) {
				Class330_Sub31.logout(false, 828998931);
				class1.currentIncomingPacket = null;
				return false;
			}
			if (aClass222_2309 == class1.currentIncomingPacket) {
				int i_299_ = buffer.readUnsignedShort(392467685);
				Class263_Sub3.method2630((byte) 0);
				Class502.method6132(i_299_, (byte) -126);
				class1.currentIncomingPacket = null;
				return true;
			}
			// idk
			if (aClass222_2298 == class1.currentIncomingPacket) {
				client.aBoolean9130 = buffer.readUnsignedByte(1842939030) == 1;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (UNLOCK_IGNORES_LIST_PACKET == class1.currentIncomingPacket) {
				client.anInt9257 = 1992478363;
				client.anInt9023 = 640746829 * client.anInt9268;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2228 == class1.currentIncomingPacket) {
				Class204.method2182(Class213.aClass213_2077, 1310020029);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (PROJECTILE_PACKET == class1.currentIncomingPacket) {
				Class204.method2182(Class213.aClass213_2065, -1574534106);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2280) {
				client.anInt9181 = -598315273 * client.anInt9268;
				boolean bool = buffer.readUnsignedByte(1155609136) == 1;
				Class167 class167 = new Class167(buffer);
				Class330_Sub39 class330_sub39;
				if (bool)
					class330_sub39 = Class106.aClass330_Sub39_1009;
				else
					class330_sub39 = Class_ra_Sub3.aClass330_Sub39_8652;
				class167.method2018(class330_sub39, -1998750649);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2349 == class1.currentIncomingPacket) {
				Class153.anInt1634 = ((buffer.readByteC(-1966501238) << 3) * 859389701);
				Class1.anInt39 = buffer.readUnsignedByteC(-243015761) * -1376163033;
				IsaacCipher.anInt5837 = (buffer.readByteS((byte) 98) << 3) * 635277037;
				while (-824785231 * buffer.offset < class1.anInt26 * -275392715) {
					Class213 class213 = (Class70.method820((byte) 16)[buffer.readUnsignedByte(1454028747)]);
					Class204.method2182(class213, 624159477);
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2264) {
				int i_300_ = buffer.readUnsignedShort(23637310);
				int i_301_ = buffer.readUnsignedByteS(-400233324);
				int[] is = new int[Class487_Sub1.method6040(757986984).length];
				for (int i_302_ = 0; i_302_ < Class487_Sub1.method6040(654045840).length; i_302_++)
					is[i_302_] = buffer.readInt1((byte) 2);
				Class330_Sub35 class330_sub35 = ((Class330_Sub35) client.aClass497_9014.method6094((long) i_300_));
				if (class330_sub35 != null)
					Class150_Sub2.method1772(((Class432_Sub1_Sub1_Sub1) class330_sub35.anObject7733), is, i_301_, true, (byte) -25);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == ANIMATE_INTERFACE_PACKET) {
				int i_303_ = buffer.readInt((byte) 95);
				int i_304_ = buffer.readInt2(-793658723);
				Class263_Sub3.method2630((byte) -110);
				Class157.method1835(i_303_, i_304_, -1269295745);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2221) {
				int i_305_ = buffer.readLEInt(-75833772);
				int i_306_ = buffer.readUnsignedLEShortA(1555968511);
				Class263_Sub3.method2630((byte) -98);
				Class95.method1105(i_305_, i_306_, (byte) 126);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2198) {
				client.anInt9158 = buffer.readShort(-1100583751) * 1733649975;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (SEND_PRIVATE_MESSAGE_PACKET == class1.currentIncomingPacket) {
				String string = buffer.readString(-484242470);
				String string_307_ = (Class117.method1426(Class113.method1386(buffer, 1211547434), 1201716859));
				Class556.method6406(6, 0, string, string, string, string_307_, -1960907748);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2239) {
				int i_308_ = buffer.readUnsignedByteC(-243015761);
				byte i_309_ = buffer.readByteC(-2145772726);
				Class263_Sub3.method2630((byte) -97);
				Class464_Sub10.method5775(i_309_, i_308_, -643686455);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (ACCESS_MASK_PACKET == class1.currentIncomingPacket) {
				int min = buffer.readUnsignedShort(1251569904);
				if (65535 == min)
					min = -1;
				int value = buffer.readLEInt(-1949204286);
				int hash = buffer.readInt2(-793658723);
				int max = buffer.readUnsignedLEShort(15163594);
				if (65535 == max)
					max = -1;
				Class263_Sub3.method2630((byte) -13);
				for (int i_314_ = min; i_314_ <= max; i_314_++) {
					long l = ((long) hash << 32) + (long) i_314_;
					Class330_Sub2 class330_sub2 = (Class330_Sub2) client.aClass497_9211.method6094(l);
					Class330_Sub2 class330_sub2_315_;
					if (class330_sub2 == null) {
						if (i_314_ == -1)
							class330_sub2_315_ = new Class330_Sub2(value, (Class95.method1101(hash, 767255701).aClass330_Sub2_1273.anInt7502) * -968253727);
						else
							class330_sub2_315_ = new Class330_Sub2(value, -1);
					} else {
						class330_sub2_315_ = new Class330_Sub2(value, (class330_sub2.anInt7502 * -968253727));
						class330_sub2.method3252(751041187);
					}
					client.aClass497_9211.method6097(class330_sub2_315_, l);
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == DESTROY_OBJECT_PACKET) {
				Class204.method2182(Class213.aClass213_2064, -1757997412);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == SEND_URL_PACKET) {
				if (Class503.aBoolean5914 && Class130.aFrame1498 != null)
					Class96.method1182(Class448.aClass330_Sub50_5555.aClass464_Sub8_7897.method5763(2127349097), -1, -1, false, 1938001314);
				byte[] is = new byte[-275392715 * class1.anInt26 - 1];
				boolean bool = buffer.readUnsignedByte(1843525994) == 1;
				buffer.method3828(is, 0, (class1.anInt26 * -275392715) - 1, 1689124730);
				Buffer class330_sub46 = new Buffer(is);
				String string = class330_sub46.readString(-1048963236);
				if (bool) {
					String string_316_ = class330_sub46.readString(1137254293);
					if (string_316_.length() == 0)
						string_316_ = string;
					if (!client.aBoolean9198 || Class212.aString6533.startsWith("mac") || !Class239.method2379(string, 1, Class232.aClass232_2450.method2354((byte) -80), (byte) 0))
						Class532.openLink(string_316_, true, Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-971274358) == 5, client.aBoolean9042, client.aBoolean8966, 724806507);
				} else
					Class532.openLink(string, true, Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-729786679) == 5, client.aBoolean9042, client.aBoolean8966, 2124849645);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == GLOBAL_CONFIG2_PACKET) {
				int id = buffer.readUnsignedLEShortA(-1749423903);
				int value = buffer.readLEInt(-58148179);
				Class263_Sub3.method2630((byte) -14);
				Class200.sendGlobalConfig(id, value, (byte) 83);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2336 == class1.currentIncomingPacket) {
				Class401_Sub1.aClass145_Sub1_8249.method1727(buffer, class1.anInt26 * -275392715, -1709230766);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == RECEIVE_FRIENDS_CHAT_MESSAGE_PACKET) {
				Class332.anObjectArray6640 = null;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == RUNSCRIPT_PACKET) {
				String string = buffer.readString(1655520377);
				Object[] objects = new Object[string.length() + 1];
				for (int i_319_ = string.length() - 1; i_319_ >= 0; i_319_--) {
					if (string.charAt(i_319_) == 's')
						objects[1 + i_319_] = buffer.readString(1093254579);
					else
						objects[i_319_ + 1] = new Integer(buffer.readInt((byte) 49));
				}
				objects[0] = new Integer(buffer.readInt((byte) 65));
				Class263_Sub3.method2630((byte) -114);
				Class330_Sub42 class330_sub42 = new Class330_Sub42();
				class330_sub42.anObjectArray7817 = objects;
				Class117.method1423(class330_sub42, -1631194987);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2306 == class1.currentIncomingPacket) {
				Class204.method2182(Class213.aClass213_2070, 1882674060);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2219) {
				boolean bool = buffer.readUnsignedByte(1841895275) == 1;
				if (bool)
					Class147.anInt1621 = 1757310610;
				else
					Class340.method3971(-593752096);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (PUBLIC_CHAT_PACKET == class1.currentIncomingPacket) {
				int i_320_ = buffer.readUnsignedShort(1299175654);
				Player class432_sub1_sub1_sub1_sub1;
				if (i_320_ == client.anInt9121 * 1478725729)
					class432_sub1_sub1_sub1_sub1 = Class263_Sub2.myPlayer;
				else {
					class432_sub1_sub1_sub1_sub1 = (client.players[i_320_]);
				}
				if (class432_sub1_sub1_sub1_sub1 == null) {
					class1.currentIncomingPacket = null;
					return true;
				}
				int i_321_ = buffer.readUnsignedShort(1873996381);
				int rights = buffer.readUnsignedByte(1636004997);
				boolean bool = (i_321_ & 0x8000) != 0;
				if (class432_sub1_sub1_sub1_sub1.aString10221 != null && null != class432_sub1_sub1_sub1_sub1.aClass408_10240) {
					boolean bool_323_ = false;
					if (rights <= 1) {
						if (!bool && (client.aBoolean9083 && !client.aBoolean9228 || client.aBoolean9073))
							bool_323_ = true;
						else if (Class65.foundPlayer(class432_sub1_sub1_sub1_sub1.aString10221, -305178755))
							bool_323_ = true;
					}
					if (!bool_323_) {
						int i_324_ = -1;
						String string;
						if (bool) {
							i_321_ &= 0x7fff;
							Class209 class209 = Class540.method6328(buffer, -1657511033);
							i_324_ = class209.anInt1981 * 1955043023;
							string = (class209.aClass330_Sub36_Sub4_1982.method3457(buffer, 854331544));
						} else
							string = (Class117.method1426(Class113.method1386(buffer, 1364608687), 1201716859));
						class432_sub1_sub1_sub1_sub1.method5466(string.trim(), i_321_ >> 8, i_321_ & 0xff, -1947216170);
						int i_325_;
						if (rights == 1 || rights == 2)
							i_325_ = bool ? 17 : 1;
						else
							i_325_ = bool ? 17 : 2;
						if (2 == rights)
							Class81.sendSpeech(i_325_, 0, new StringBuilder().append(Class325_Sub4.method3225(1, -597373685)).append(class432_sub1_sub1_sub1_sub1.method5471(true, 1310534929)).toString(), new StringBuilder().append(Class325_Sub4.method3225(1, -1423176618)).append(class432_sub1_sub1_sub1_sub1.method5460(false, 1255321384)).toString(), class432_sub1_sub1_sub1_sub1.displayName, string, null, i_324_, (byte) 25);
						else if (rights == 1)
							Class81.sendSpeech(i_325_, 0, new StringBuilder().append(Class325_Sub4.method3225(0, -487501015)).append(class432_sub1_sub1_sub1_sub1.method5471(true, 1014786357)).toString(), new StringBuilder().append(Class325_Sub4.method3225(0, -851149307)).append(class432_sub1_sub1_sub1_sub1.method5460(false, 1768626005)).toString(), class432_sub1_sub1_sub1_sub1.displayName, string, null, i_324_, (byte) 98);
						else if (rights != 0)
							Class81.sendSpeech(i_325_, 0, "<img=" + rights + ">" + class432_sub1_sub1_sub1_sub1.method5471(true, 1429690474), "<img=" + rights + ">" + class432_sub1_sub1_sub1_sub1.method5460(false, -12839585), class432_sub1_sub1_sub1_sub1.displayName, string, null, i_324_, (byte) 99);
						else
							Class81.sendSpeech(i_325_, 0, class432_sub1_sub1_sub1_sub1.method5471(true, 1429690474), class432_sub1_sub1_sub1_sub1.method5460(false, -12839585), class432_sub1_sub1_sub1_sub1.displayName, string, null, i_324_, (byte) 99);
					}
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == RECEIVE_CLAN_CHAT_MESSAGE) {
				boolean bool = buffer.readUnsignedByte(937580412) == 1;
				String string = buffer.readString(289976021);
				long l = (long) buffer.readUnsignedShort(-123862598);
				long l_326_ = (long) buffer.readUnsignedTriByte(-1401356047);
				int i_327_ = buffer.readUnsignedByte(1266062639);
				long l_328_ = l_326_ + (l << 32);
				boolean bool_329_ = false;
				Object object = null;
				Class330_Sub39 class330_sub39 = (bool ? Class106.aClass330_Sub39_1009 : Class_ra_Sub3.aClass330_Sub39_8652);
				while_73_: do {
					if (class330_sub39 == null)
						bool_329_ = true;
					else {
						for (int i_330_ = 0; i_330_ < 100; i_330_++) {
							if (client.aLongArray9064[i_330_] == l_328_) {
								bool_329_ = true;
								break while_73_;
							}
						}
						if (i_327_ <= 1) {
							if (client.aBoolean9083 && !client.aBoolean9228 || client.aBoolean9073)
								bool_329_ = true;
							else if (Class65.foundPlayer(string, 444189205))
								bool_329_ = true;
						}
					}
				} while (false);
				if (!bool_329_) {
					client.aLongArray9064[client.anInt9190 * 34330819] = l_328_;
					client.anInt9190 = (1 + client.anInt9190 * 34330819) % 100 * 676829163;
					String string_331_ = (Class117.method1426(Class113.method1386(buffer, 844497971), 1201716859));
					int i_332_ = bool ? 41 : 44;
					if (2 == i_327_ || 3 == i_327_)
						Class81.sendSpeech(i_332_, 0, new StringBuilder().append(Class325_Sub4.method3225(1, -628307992)).append(string).toString(), new StringBuilder().append(Class325_Sub4.method3225(1, 71699746)).append(string).toString(), string, string_331_, class330_sub39.aString7757, -1, (byte) 88);
					else if (1 == i_327_)
						Class81.sendSpeech(i_332_, 0, new StringBuilder().append(Class325_Sub4.method3225(0, -160595588)).append(string).toString(), new StringBuilder().append(Class325_Sub4.method3225(0, 359005140)).append(string).toString(), string, string_331_, class330_sub39.aString7757, -1, (byte) 40);
					else
						Class81.sendSpeech(i_332_, 0, string, string, string, string_331_, class330_sub39.aString7757, -1, (byte) 108);
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2247) {
				Class332.anObjectArray6640 = (new Object[1615917779 * Class95_Sub7.aClass536_7157.anInt6230]);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2345 == class1.currentIncomingPacket) {
				client.aByte9283 = buffer.readByteS((byte) -21);
				if (0 == client.aByte9283 || 1 == client.aByte9283)
					client.aBoolean9120 = true;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == IGNORES_PACKET) {
				while (buffer.offset * -824785231 < -275392715 * class1.anInt26) {
					int i_333_ = buffer.readUnsignedByte(259209473);
					boolean bool = (i_333_ & 0x1) == 1;
					String string = buffer.readString(1519053343);
					String string_334_ = buffer.readString(1985096744);
					for (int i_335_ = 0; i_335_ < -1187306419 * client.anInt9261; i_335_++) {
						Class75 class75 = client.aClass75Array8982[i_335_];
						if (bool) {
							if (string_334_.equals(class75.aString646)) {
								class75.aString646 = string;
								class75.aString647 = string_334_;
								string = null;
								break;
							}
						} else if (string.equals(class75.aString646)) {
							class75.aString646 = string;
							class75.aString647 = string_334_;
							string = null;
							break;
						}
					}
					if (null != string && client.anInt9261 * -1187306419 < 100) {
						Class75 class75 = new Class75();
						client.aClass75Array8982[(-1187306419 * client.anInt9261)] = class75;
						class75.aString646 = string;
						class75.aString647 = string_334_;
						class75.aBoolean648 = 2 == (i_333_ & 0x2);
						client.anInt9261 += 1237365893;
					}
				}
				client.anInt9023 = 640746829 * client.anInt9268;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == GLOBAL_CONFIG1_PACKET) {
				int id = buffer.readUnsignedShortA((byte) -117);
				byte value = buffer.readByteS((byte) -86);
				Class263_Sub3.method2630((byte) -39);
				Class200.sendGlobalConfig(id, value, (byte) 37);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2200 == class1.currentIncomingPacket) {
				for (int i_338_ = 0; (i_338_ < client.players.length); i_338_++) {
					if (null != (client.players[i_338_])) {
						client.players[i_338_].anIntArray10030 = null;
						client.players[i_338_].aClass477_10032.method5988(-1, (byte) 90);
					}
				}
				for (int i_339_ = 0; i_339_ < client.anInt9232 * -1183709625; i_339_++) {
					((Class432_Sub1_Sub1_Sub1) client.aClass330_Sub35Array9015[i_339_].anObject7733).anIntArray10030 = null;
					((Class432_Sub1_Sub1_Sub1) client.aClass330_Sub35Array9015[i_339_].anObject7733).aClass477_10032.method5988(-1, (byte) -89);
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2289 == class1.currentIncomingPacket) {
				Class284.anInt2928 = buffer.readTriByte(-616992913) * 931546611;
				client.aBoolean9083 = buffer.readUnsignedByte(749513996) == 1;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2236) {
				int i_340_ = buffer.readUnsignedByteA(-741334169);
				int i_341_ = buffer.readUnsignedShort(1174113920);
				boolean bool = (i_340_ & 0x1) == 1;
				Class95_Sub15.method1157(i_341_, bool, 1110304166);
				client.anIntArray9187[(client.anInt9188 += 1359200273) * -182112015 - 1 & 0x1f] = i_341_;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (DYNAMIC_MAP_REGION_PACKET == class1.currentIncomingPacket) {
				Class330_Sub46_Sub2 class330_sub46_sub2_342_ = new Class330_Sub46_Sub2(-275392715 * class1.anInt26);
				System.arraycopy((class1.aClass330_Sub46_Sub2_17.payload), -824785231 * (class1.aClass330_Sub46_Sub2_17.offset), class330_sub46_sub2_342_.payload, 0, -275392715 * class1.anInt26);
				Class490.method6070(424511141);
				if (Class448.aClass330_Sub50_5555.aClass464_Sub24_7904.method5825((byte) -17) == 1)
					Class43.aClass276_10073.method2725(new Class300(OutgoingPacketManager.aClass310_3209, class330_sub46_sub2_342_), (byte) 32);
				else
					client.aClass304_9030.method3026(new Class300(OutgoingPacketManager.aClass310_3209, class330_sub46_sub2_342_), 1971978149);
				class1.currentIncomingPacket = null;
				return false;
			}
			if (aClass222_2268 == class1.currentIncomingPacket) {
				int i_343_ = buffer.readInt1((byte) 2);
				if (Class243.anInt6988 * -2096566971 != i_343_) {
					Class243.anInt6988 = i_343_ * 1818926477;
					Class230.method2339(Class545.aClass545_7011, -1, -1, -1901949920);
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (SEND_FRIENDS_CHAT_MESSAGE_PACKET == class1.currentIncomingPacket) {
				boolean bool = buffer.readUnsignedByte(-48607419) == 1;
				String string = buffer.readString(823991415);
				String string_344_ = string;
				if (bool)
					string_344_ = buffer.readString(809788616);
				long l = buffer.readLong(-576592454);
				long l_345_ = (long) buffer.readUnsignedShort(1513973837);
				long l_346_ = (long) buffer.readUnsignedTriByte(-1401356047);
				int rights = buffer.readUnsignedByte(1817442976);
				long l_348_ = (l_345_ << 32) + l_346_;
				boolean bool_349_ = false;
				while_74_: do {
					for (int i_350_ = 0; i_350_ < 100; i_350_++) {
						if (client.aLongArray9064[i_350_] == l_348_) {
							bool_349_ = true;
							break while_74_;
						}
					}
					if (rights <= 1) {
						if (client.aBoolean9083 && !client.aBoolean9228 || client.aBoolean9073)
							bool_349_ = true;
						else if (Class65.foundPlayer(string_344_, -1163243353))
							bool_349_ = true;
					}
				} while (false);
				if (!bool_349_) {
					client.aLongArray9064[client.anInt9190 * 34330819] = l_348_;
					client.anInt9190 = 676829163 * ((client.anInt9190 * 34330819 + 1) % 100);
					String string_351_ = (Class117.method1426(Class113.method1386(buffer, 1791936037), 1201716859));
					if (2 == rights || 3 == rights)
						Class81.sendSpeech(9, 0, new StringBuilder().append(Class325_Sub4.method3225(1, 943658578)).append(string).toString(), new StringBuilder().append(Class325_Sub4.method3225(1, 55789380)).append(string_344_).toString(), string, string_351_, Class211.method2222(l), -1, (byte) 81);
					else if (1 == rights)
						Class81.sendSpeech(9, 0, new StringBuilder().append(Class325_Sub4.method3225(0, 1070138339)).append(string).toString(), new StringBuilder().append(Class325_Sub4.method3225(0, -1978322191)).append(string_344_).toString(), string, string_351_, Class211.method2222(l), -1, (byte) 88);
					else if (rights != 0)
						Class81.sendSpeech(9, 0, "<img=" + rights + ">" + string, "<img=" + rights + ">" + string_344_, string, string_351_, Class211.method2222(l), -1, (byte) 37);
					else
						Class81.sendSpeech(9, 0, string, string_344_, string, string_351_, Class211.method2222(l), -1, (byte) 37);
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2297) {
				int i_352_ = buffer.readUnsignedShort(301980835);
				int i_353_ = buffer.readInt((byte) 66);
				int i_354_ = buffer.readInt((byte) 37);
				int i_355_ = buffer.readUnsignedLEShort(15163594);
				int i_356_ = buffer.readInt1((byte) 2);
				int i_357_ = buffer.readUnsignedByteA(-741334169);
				int i_358_ = buffer.readInt2(-793658723);
				int i_359_ = buffer.readInt((byte) 9);
				Class381 class381 = new Class381(buffer.readInt1((byte) 2));
				Class263_Sub3.method2630((byte) -114);
				Class423.method5302(i_358_, new Class330_Sub48_Sub1(i_355_, i_357_, new Class410(class381, i_352_)), new int[] { i_356_, i_354_, i_359_, i_353_ }, false, (short) 16385);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2279 == class1.currentIncomingPacket) {
				int i_360_ = buffer.readUnsignedShortA((byte) -36);
				if (i_360_ == 65535)
					i_360_ = -1;
				Class386.method4432(i_360_, (byte) -89);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2233 == class1.currentIncomingPacket) {
				Class204.method2182(Class213.aClass213_2076, 1836335497);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == NPC_ON_INTERFACE_PACKET) {
				int i_361_ = buffer.readLEInt(552539919);
				int i_362_ = buffer.readInt((byte) 119);
				Class263_Sub3.method2630((byte) -29);
				Class134.method1577(i_362_, 2, i_361_, -1, 2036251640);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2211 == class1.currentIncomingPacket) {
				Class556.method6410(buffer, class1.anInt26 * -275392715, (byte) -61);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2282) {
				int i_363_ = buffer.readUnsignedShort(-390184880);
				int i_364_ = buffer.readInt((byte) 15);
				if (null == Class332.anObjectArray6640)
					Class332.anObjectArray6640 = new Object[1615917779 * (Class95_Sub7.aClass536_7157.anInt6230)];
				Class332.anObjectArray6640[i_363_] = new Integer(i_364_);
				client.anIntArray9195[(client.anInt9196 += 432619797) * -1800337859 - 1 & 0x1f] = i_363_;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (SOUND_INDEX15_PACKET == class1.currentIncomingPacket) {
				int i_365_ = buffer.readUnsignedShort(-414372455);
				if (i_365_ == 65535)
					i_365_ = -1;
				int i_366_ = buffer.readUnsignedByte(966490640);
				int i_367_ = buffer.readUnsignedShort(2114960894);
				int i_368_ = buffer.readUnsignedByte(1905105031);
				Class197.method2147(i_365_, i_366_, i_367_, i_368_, true, 256, -1387880432);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2212) {
				int i_369_ = buffer.readInt((byte) 99);
				boolean bool = buffer.readUnsignedByteC(-243015761) == 1;
				Class263_Sub3.method2630((byte) -96);
				Class330_Sub39.method3549(i_369_, bool, 440022729);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (ICOMPONENT_MODEL_PACKET == class1.currentIncomingPacket) {
				int i_370_ = buffer.readInt2(-793658723);
				int i_371_ = buffer.readLEInt(-1307375289);
				Class263_Sub3.method2630((byte) -119);
				Class501.method6127(i_371_, i_370_, 405227913);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == GLOBAL_STRING1_PACKET) {
				int i_372_ = buffer.readUnsignedLEShort(15163594);
				String string = buffer.readString(-282862135);
				Class263_Sub3.method2630((byte) -26);
				Class_ra_Sub3.method5217(i_372_, string, -1246980806);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2267 == class1.currentIncomingPacket) {
				boolean bool = buffer.readUnsignedByte(1470080781) == 1;
				String string = buffer.readString(1608409669);
				String string_373_ = string;
				if (bool)
					string_373_ = buffer.readString(-235036424);
				int i_374_ = buffer.readUnsignedByte(499236154);
				boolean bool_375_ = false;
				if (i_374_ <= 1) {
					if (client.aBoolean9083 && !client.aBoolean9228 || client.aBoolean9073)
						bool_375_ = true;
					else if (i_374_ <= 1 && Class65.foundPlayer(string_373_, -60452439))
						bool_375_ = true;
				}
				if (!bool_375_) {
					String string_376_ = (Class117.method1426(Class113.method1386(buffer, 1376413205), 1201716859));
					if (2 == i_374_)
						Class81.sendSpeech(24, 0, new StringBuilder().append(Class325_Sub4.method3225(1, 1218900616)).append(string).toString(), new StringBuilder().append(Class325_Sub4.method3225(1, 272972033)).append(string_373_).toString(), string, string_376_, null, -1, (byte) 64);
					else if (i_374_ == 1)
						Class81.sendSpeech(24, 0, new StringBuilder().append(Class325_Sub4.method3225(0, -1133550009)).append(string).toString(), new StringBuilder().append(Class325_Sub4.method3225(0, -1445613684)).append(string_373_).toString(), string, string_376_, null, -1, (byte) 67);
					else
						Class81.sendSpeech(24, 0, string, string_373_, string, string_376_, null, -1, (byte) 92);
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2317) {
				int i_377_ = buffer.readUnsignedShort(474099602);
				byte i_378_ = buffer.readByte((byte) 16);
				if (Class332.anObjectArray6640 == null)
					Class332.anObjectArray6640 = new Object[1615917779 * (Class95_Sub7.aClass536_7157.anInt6230)];
				Class332.anObjectArray6640[i_377_] = new Integer(i_378_);
				client.anIntArray9195[(client.anInt9196 += 432619797) * -1800337859 - 1 & 0x1f] = i_377_;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2333 == class1.currentIncomingPacket) {
				String string = buffer.readString(408243882);
				int i_379_ = buffer.readUnsignedShort(-250798994);
				String string_380_ = Class2.aClass523_44.method6233(i_379_, 1251417634).method3457(buffer, -88636053);
				Class81.sendSpeech(19, 0, string, string, string, string_380_, null, i_379_, (byte) 82);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2244 == class1.currentIncomingPacket) {
				int i_381_ = buffer.readUnsignedShort(-149414326);
				int i_382_ = buffer.readUnsignedShort(864199094);
				int i_383_ = buffer.readUnsignedShort(1027815394);
				Class263_Sub3.method2630((byte) -14);
				if (null != Class3.aClass120Array56[i_381_]) {
					for (int i_384_ = i_382_; i_384_ < i_383_; i_384_++) {
						int i_385_ = buffer.readUnsignedTriByte(-1401356047);
						if (i_384_ < (Class3.aClass120Array56[i_381_].aClass114Array1400).length && null != (Class3.aClass120Array56[i_381_].aClass114Array1400[i_384_]))
							Class3.aClass120Array56[i_381_].aClass114Array1400[i_384_].anInt1195 = 1397867453 * i_385_;
					}
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2225) {
				if (Class503.aBoolean5914 && Class130.aFrame1498 != null)
					Class96.method1182(Class448.aClass330_Sub50_5555.aClass464_Sub8_7897.method5763(1958801047), -1, -1, false, -1547781361);
				byte[] is = new byte[-275392715 * class1.anInt26];
				buffer.method3828(is, 0, (-275392715 * class1.anInt26), 1689124730);
				String string = Class125.method1525(is, 0, (-275392715 * class1.anInt26), (byte) 1);
				String string_386_ = "opensn";
				if (!client.aBoolean9198 || !Class239.method2379(string, 1, string_386_, (byte) 0))
					Class562.method6471(string, true, Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-709195805) == 5, string_386_, client.aBoolean9042, client.aBoolean8966, (byte) 1);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (CAMERA_SHAKE_PACKET == class1.currentIncomingPacket) {
				int i_387_ = buffer.readUnsignedShortA((byte) -41);
				int i_388_ = buffer.readUnsignedByte(1152013990);
				int i_389_ = buffer.readUnsignedByteC(-243015761);
				int slotId = buffer.readUnsignedByteC(-243015761);
				int i_391_ = buffer.readUnsignedByteS(-400233324);
				Class263_Sub3.method2630((byte) -1);
				client.aBooleanArray9238[slotId] = true;
				client.anIntArray9239[slotId] = i_389_;
				client.anIntArray9240[slotId] = i_388_;
				client.anIntArray9106[slotId] = i_387_;
				client.anIntArray9046[slotId] = i_391_;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (WINDOW_PANE_PACKET == class1.currentIncomingPacket) {
				int i_392_ = buffer.readInt1((byte) 2);
				int i_393_ = buffer.readUnsignedByteS(-400233324);
				int i_394_ = buffer.readInt((byte) 119);
				int i_395_ = buffer.readLEInt(-800887494);
				int i_396_ = buffer.readUnsignedShortA((byte) -121);
				int i_397_ = buffer.readInt2(-793658723);
				Class263_Sub3.method2630((byte) -63);
				if (2 == i_393_)
					Class134.method1575((byte) 49);
				int[] is = { i_394_, i_395_, i_397_, i_392_ };
				client.windowPaneId = i_396_ * 1292218821;
				Class441.method5610(i_396_, is, (byte) 95);
				Class476.method5960(false, (short) 2499);
				Class460.method5692(1522181389 * client.windowPaneId, is, 63416877);
				for (int i_398_ = 0; i_398_ < 113; i_398_++)
					client.aBooleanArray9230[i_398_] = true;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == aClass222_2240) {
				int i_399_ = buffer.readInt1((byte) 2);
				int i_400_ = buffer.readInt((byte) 98);
				Class263_Sub3.method2630((byte) -34);
				Class134.method1577(i_400_, 1, i_399_, -1, 1813890882);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == CLAN_SETTINGS_PACKET) {
				client.anInt9129 = client.anInt9268 * 843193695;
				boolean bool = buffer.readUnsignedByte(1848547137) == 1;
				if (1 == -275392715 * class1.anInt26) {
					if (bool)
						CacheIndex.aClass154_1450 = null;
					else
						Class412.aClass154_4258 = null;
					class1.currentIncomingPacket = null;
					return true;
				}
				if (bool)
					CacheIndex.aClass154_1450 = new Class154(buffer);
				else
					Class412.aClass154_4258 = new Class154(buffer);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == PLAYERS_OVER_NPCS_PACKET) {
				int i_401_ = buffer.readUnsignedByte(1429984549);
				Class263_Sub3.method2630((byte) -128);
				client.anInt9097 = i_401_ * 356792759;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (INTERFACE_CONFIG_PACKET == class1.currentIncomingPacket) {
				int i_402_ = buffer.readUnsignedByteS(-400233324);
				int i_403_ = buffer.readInt((byte) 45);
				Class263_Sub3.method2630((byte) -112);
				Class99.method1205(i_403_, i_402_, (byte) 124);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (FRIENDS_CHAT_PACKET == class1.currentIncomingPacket) {
				client.anInt9109 = client.anInt9268 * 221217995;
				if (0 == -275392715 * class1.anInt26) {
					client.aString8968 = null;
					client.aString9233 = null;
					Class452.anInt5561 = 0;
					Class95_Sub22.aClass13Array7210 = null;
					class1.currentIncomingPacket = null;
					return true;
				}
				client.aString9233 = buffer.readString(2138616559);
				boolean bool = buffer.readUnsignedByte(1537832088) == 1;
				if (bool)
					buffer.readString(1140202240);
				long l = buffer.readLong(-1783989611);
				client.aString8968 = Class360.method4244(l);
				Class291.aByte2979 = buffer.readByte((byte) -1);
				int i_404_ = buffer.readUnsignedByte(1930447454);
				if (255 == i_404_) {
					class1.currentIncomingPacket = null;
					return true;
				}
				Class452.anInt5561 = 958365345 * i_404_;
				Class13[] class13s = new Class13[100];
				for (int i_405_ = 0; i_405_ < 1374414177 * Class452.anInt5561; i_405_++) {
					if (i_405_ > 99)
						break;
					class13s[i_405_] = new Class13();
					class13s[i_405_].aString172 = buffer.readString(287108437);
					bool = buffer.readUnsignedByte(1705805630) == 1;
					if (bool)
						class13s[i_405_].aString171 = buffer.readString(-1275755565);
					else
						class13s[i_405_].aString171 = class13s[i_405_].aString172;
					((Class13) class13s[i_405_]).aString170 = Class531.method6297(class13s[i_405_].aString171, -1668568374);
					class13s[i_405_].anInt169 = (buffer.readUnsignedShort(555486020) * -75328655);
					class13s[i_405_].aByte173 = buffer.readByte((byte) -7);
					class13s[i_405_].aString168 = buffer.readString(-1367936345);
					if (class13s[i_405_].aString171.equals(Class263_Sub2.myPlayer.aString10221))
						Class513.aByte5966 = class13s[i_405_].aByte173;
				}
				boolean bool_406_ = false;
				int i_407_ = 1374414177 * Class452.anInt5561;
				while_75_: do {
					do {
						if (i_407_ <= 0)
							break while_75_;
						bool_406_ = true;
						i_407_--;
						for (int i_408_ = 0; i_408_ < i_407_; i_408_++) {
							if ((((Class13) class13s[i_408_]).aString170.compareTo(((Class13) class13s[i_408_ + 1]).aString170)) > 0) {
								Class13 class13 = class13s[i_408_];
								class13s[i_408_] = class13s[1 + i_408_];
								class13s[i_408_ + 1] = class13;
								bool_406_ = false;
							}
						}
					} while (!bool_406_);
					if (i <= 5) {
						/* empty */
					}
				} while (false);
				Class95_Sub22.aClass13Array7210 = class13s;
				class1.currentIncomingPacket = null;
				return true;
			}
			if (class1.currentIncomingPacket == ALIVE_PACKET) {
				class1.currentIncomingPacket = null;
				return false;
			}
			if (class1.currentIncomingPacket == PRIVATE_GAME_BAR_STAGE_PACKET) {
				Class355.aClass496_3639 = Class501.method6123(buffer.readUnsignedByte(-53027625), (byte) 47);
				class1.currentIncomingPacket = null;
				return true;
			}
			if (aClass222_2325 == class1.currentIncomingPacket) {
				boolean bool = buffer.readUnsignedByte(1383513682) == 1;
				String string = buffer.readString(1812903645);
				String string_409_ = string;
				if (bool)
					string_409_ = buffer.readString(-130543702);
				long l = (long) buffer.readUnsignedShort(1431695309);
				long l_410_ = (long) buffer.readUnsignedTriByte(-1401356047);
				int i_411_ = buffer.readUnsignedByte(1359011459);
				int i_412_ = buffer.readUnsignedShort(294517201);
				long l_413_ = l_410_ + (l << 32);
				boolean bool_414_ = false;
				while_76_: do {
					for (int i_415_ = 0; i_415_ < 100; i_415_++) {
						if (client.aLongArray9064[i_415_] == l_413_) {
							bool_414_ = true;
							break while_76_;
						}
					}
					if (i_411_ <= 1 && Class65.foundPlayer(string_409_, -1099153198))
						bool_414_ = true;
				} while (false);
				if (!bool_414_) {
					client.aLongArray9064[client.anInt9190 * 34330819] = l_413_;
					client.anInt9190 = (client.anInt9190 * 34330819 + 1) % 100 * 676829163;
					String string_416_ = Class2.aClass523_44.method6233(i_412_, 1527228650).method3457(buffer, 743111992);
					if (2 == i_411_)
						Class81.sendSpeech(18, 0, new StringBuilder().append(Class325_Sub4.method3225(1, 1453501599)).append(string).toString(), new StringBuilder().append(Class325_Sub4.method3225(1, -1738837264)).append(string_409_).toString(), string, string_416_, null, i_412_, (byte) 67);
					else if (i_411_ == 1)
						Class81.sendSpeech(18, 0, new StringBuilder().append(Class325_Sub4.method3225(0, -1047996574)).append(string).toString(), new StringBuilder().append(Class325_Sub4.method3225(0, -1679432416)).append(string_409_).toString(), string, string_416_, null, i_412_, (byte) 19);
					else
						Class81.sendSpeech(18, 0, string, string_409_, string, string_416_, null, i_412_, (byte) 72);
				}
				class1.currentIncomingPacket = null;
				return true;
			}
			Class207.method2195(new StringBuilder().append(class1.currentIncomingPacket != null ? 575949745 * class1.currentIncomingPacket.anInt2350 : -1).append(Class215.aString2081).append(class1.aClass222_35 != null ? 575949745 * class1.aClass222_35.anInt2350 : -1).append(Class215.aString2081).append(class1.aClass222_36 != null ? 575949745 * class1.aClass222_36.anInt2350 : -1).append(" ").append(-275392715 * class1.anInt26).toString(), new RuntimeException(), -306254718);
			Class330_Sub31.logout(false, 1784034144);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lg.jy(").append(')').toString());
		}
	}

	public static void method2272(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		try {
			Class330_Sub10 class330_sub10 = null;
			for (Class330_Sub10 class330_sub10_8_ = ((Class330_Sub10) Class330_Sub10.aClass471_7587.method5869(539664854)); null != class330_sub10_8_; class330_sub10_8_ = (Class330_Sub10) Class330_Sub10.aClass471_7587.method5873((byte) -62)) {
				if (i == (((Class330_Sub10) class330_sub10_8_).anInt7581 * 525431007) && -533165901 * class330_sub10_8_.anInt7582 == i_1_ && i_2_ == class330_sub10_8_.anInt7577 * 2127793995 && i_3_ == 1982913715 * ((Class330_Sub10) class330_sub10_8_).anInt7575) {
					class330_sub10 = class330_sub10_8_;
					break;
				}
			}
			if (class330_sub10 == null) {
				class330_sub10 = new Class330_Sub10();
				((Class330_Sub10) class330_sub10).anInt7581 = i * 254692127;
				((Class330_Sub10) class330_sub10).anInt7575 = i_3_ * 1114190459;
				class330_sub10.anInt7582 = i_1_ * 1369794171;
				class330_sub10.anInt7577 = -275578269 * i_2_;
				if (i_1_ >= 0 && i_2_ >= 0 && i_1_ < client.aClass304_9030.method2990(-1666536826) && i_2_ < client.aClass304_9030.method3033((byte) 9))
					Class313.method3117(class330_sub10, -727050650);
				Class330_Sub10.aClass471_7587.method5878(class330_sub10, (short) 8192);
			}
			((Class330_Sub10) class330_sub10).anInt7589 = i_4_ * 1410924489;
			((Class330_Sub10) class330_sub10).anInt7585 = 1162271155 * i_5_;
			((Class330_Sub10) class330_sub10).anInt7574 = i_6_ * -753980223;
			((Class330_Sub10) class330_sub10).aBoolean7583 = true;
			((Class330_Sub10) class330_sub10).aBoolean7586 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ji.r(").append(')').toString());
		}
	}

	static int[] method2273(Class330_Sub34 class330_sub34, byte i) {
		try {
			Buffer class330_sub46 = new Buffer(518);
			int[] is = new int[4];
			for (int i_9_ = 0; i_9_ < 4; i_9_++)
				is[i_9_] = (int) (Math.random() * 9.9999999E7);
			class330_sub46.addByte(10, (byte) 90);
			class330_sub46.addInt(is[0], 1965508160);
			class330_sub46.addInt(is[1], 1965508160);
			class330_sub46.addInt(is[2], 1965508160);
			class330_sub46.addInt(is[3], 1965508160);
			for (int i_10_ = 0; i_10_ < 10; i_10_++)
				class330_sub46.addInt((int) (Math.random() * 9.9999999E7), 1965508160);
			class330_sub46.addShort((int) (Math.random() * 9.9999999E7), (byte) 42);
			class330_sub46.applyRSA(Class2.LoginRSAExponent, Class2.LoginRSANumber, -666670013);
			class330_sub34.aClass330_Sub46_Sub2_7729.method3749(class330_sub46.payload, 0, -824785231 * class330_sub46.offset, (byte) 71);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ji.k(").append(')').toString());
		}
	}
}
