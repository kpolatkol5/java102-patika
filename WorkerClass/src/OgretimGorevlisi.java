public class OgretimGorevlisi extends Akademisyen {
    String kapiNo;

    OgretimGorevlisi(String fullName, String mph, String email, String bolum, String unvan, String kapiNo) {
        super(fullName, mph, email, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    @Override
    public void derseGir() {
        System.out.println(this.fullName + "eğitim görevlisi derse girdi");
    }

    @Override
    public void cikis() {
        System.out.println(this.fullName + "çıkış yaptı");
    }

    @Override
    public void giris() {
        System.out.println(this.fullName + "giriş yaptı");
    }

    @Override
    public void yemekhane() {
        System.out.println(this.fullName + "yemekhaneye giriş yaptı");
    }


    public void senatoToplantisi() {

        System.out.println(this.fullName + "senato  toplantısına katıldı");
    }

    public void sinavYap() {

        System.out.println(this.fullName + "Sınavı baslatti");
    }

}
