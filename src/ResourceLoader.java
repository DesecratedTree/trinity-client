public class ResourceLoader {
    static Class330_Sub6 getFile(IndexTable class280, int i, int i_83_) {
        byte[] is = class280.getFile(i, i_83_);
        if (is == null)
            return null;
        return new Class330_Sub6(new Buffer(is));
    }
}
