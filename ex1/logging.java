package ex1;

public class logging {
    private static logging instance;
    private String mesaj;
    public static logging getInstance() {
        if( null == instance) {
            instance = new logging();
        }
        return instance;
    }
    public void setMesaj(String mesaj)
    {
        this.mesaj = mesaj;
    }
}
