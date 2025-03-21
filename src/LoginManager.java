public class LoginManager {

    private static final long SESSION_TOKEN = -3985504141288601873L;
    private static final long CLIENT_TOKEN = 5419119047825010711L;

    static Buffer buildEncryptedLoginPacket(int i) {
        try {
            Buffer loginBuffer = Class336.method3945((byte) -40);
            loginBuffer.writeInt64BE(0L);
            loginBuffer.addString(Class360.password, (byte) -13);
            loginBuffer.writeInt64BE(SESSION_TOKEN * Class360.socialName);
            loginBuffer.writeInt64BE(CLIENT_TOKEN * client.clientToken);
            loginBuffer.applyRSA(Class2.LoginRSAExponent, Class2.LoginRSANumber, -1219170947);
            return loginBuffer;
        } catch (RuntimeException runtimeexception) {
            throw Class476.method5964(runtimeexception, new StringBuilder().append("dg.h(").append(')').toString());
        }
    }
}
