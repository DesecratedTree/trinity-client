public class MusicManager {
    static Class330_Sub6 currentMusicFile;
    static int musicId;
    static int musicIndex;
    static int currentState = 0;

    public static boolean loadMusic(int musicId) {
        try {
            do {
                boolean bool;
                try {
                    if (currentState * 242692185 != 2)
                        break;
                    if (currentMusicFile == null) {
                        System.out.println("Playing music ID: " + (MusicManager.musicId * 1899606887));
                        currentMusicFile = ResourceLoader.getFile(Class110.musicArchive, (MusicManager.musicId * 1899606887), (musicIndex * 1738365065));
                        if (null == currentMusicFile)
                            return false;
                    }
                    if (Class57.aClass305_6600 == null)
                        Class57.aClass305_6600 = new Class305(Class110.aClass280_1154, Class110.aClass280_1153);
                    Class330_Sub40_Sub2 class330_sub40_sub2 = Class110.aClass330_Sub40_Sub2_1155;
                    if (null != Class288.aClass330_Sub40_Sub2_2955)
                        class330_sub40_sub2 = Class288.aClass330_Sub40_Sub2_2955;
                    if (!class330_sub40_sub2.method3615((currentMusicFile), (Class110.aClass280_1160), Class57.aClass305_6600, 22050, (short) 32191))
                        break;
                    Class110.aClass330_Sub40_Sub2_1155 = class330_sub40_sub2;
                    Class110.aClass330_Sub40_Sub2_1155.method3613(-1903555119);
                    if (Class559.anInt6433 * -1271508923 > 0) {
                        currentState = -69253189;
                        Class110.aClass330_Sub40_Sub2_1155.method3586(((-1271508923 * Class559.anInt6433 > Class121.volume * -509814145) ? -509814145 * Class121.volume : -1271508923 * Class559.anInt6433), 2109696806);
                        for (int i_80_ = 0; i_80_ < Class85.anIntArray711.length; i_80_++) {
                            Class110.aClass330_Sub40_Sub2_1155.method3589(i_80_, Class85.anIntArray711[i_80_], 999768506);
                            Class85.anIntArray711[i_80_] = 255;
                        }
                    } else {
                        currentState = 0;
                        Class110.aClass330_Sub40_Sub2_1155.method3586(-509814145 * Class121.volume, 1853037667);
                        for (int i_81_ = 0; i_81_ < Class85.anIntArray711.length; i_81_++) {
                            Class110.aClass330_Sub40_Sub2_1155.method3589(i_81_, Class85.anIntArray711[i_81_], 2103681777);
                            Class85.anIntArray711[i_81_] = 255;
                        }
                    }
                    if (Class288.aClass330_Sub40_Sub2_2955 == null) {
                        if (Class72.aLong621 * -3481658226435046551L > 0L)
                            Class110.aClass330_Sub40_Sub2_1155.method3593(currentMusicFile, Class268.aBoolean2746, true, -3481658226435046551L * Class72.aLong621);
                        else
                            Class110.aClass330_Sub40_Sub2_1155.method3591(currentMusicFile, Class268.aBoolean2746, -1543176376);
                        if (null != Class403.aClass111_4138)
                            Class403.aClass111_4138.method1364(-130832991);
                    }
                    if (Class539.aClass296_6244 != null)
                        Class539.aClass296_6244.method2935(Class110.aClass330_Sub40_Sub2_1155);
                    currentMusicFile = null;
                    Class57.aClass305_6600 = null;
                    Class110.musicArchive = null;
                    Class72.aLong621 = 0L;
                    Class288.aClass330_Sub40_Sub2_2955 = null;
                    Class403.aClass111_4138 = null;
                    bool = true;
                } catch (Exception exception) {
                    exception.printStackTrace();
                    Class110.aClass330_Sub40_Sub2_1155.method3594(-2080270116);
                    Class121.method1448((byte) -9);
                    break;
                }
                return bool;
            } while (false);
            return false;
        } catch (RuntimeException runtimeexception) {
            throw Class476.method5964(runtimeexception, new StringBuilder().append("ee.x(").append(')').toString());
        }
    }
}
