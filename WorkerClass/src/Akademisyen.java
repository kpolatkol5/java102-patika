import java.net.CacheRequest;

public abstract  class Akademisyen extends Worker {
    String bolum;
    String unvan;

    public Akademisyen(String fullName, String mph, String email, String bolum, String unvan) {
        super(fullName, mph, email);
        this.bolum = bolum;
        this.unvan = unvan;
    }


    public abstract void derseGir();


}
