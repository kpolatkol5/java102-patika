public class GuvenlikGorevlisi extends Memur {
    String belge;

    GuvenlikGorevlisi(String fullName, String mph, String email, String departman, String mesai, String belge) {
        super(fullName, mph, email, departman, mesai);
        this.belge = belge;
    }

    @Override
    public void calis() {
        System.out.println(this.fullName + " çalışmaya başladı");
    }

    @Override
    public void yemekhane() {
        System.out.println(this.fullName + " yemekhaye girdi");

    }

    @Override
    public void giris() {
        System.out.println(this.fullName + "  giriş yaptı");

    }

    @Override
    public void cikis() {
        System.out.println(this.fullName + "  çıkış yaptı");

    }

    public void nobet() {
        System.out.println(this.fullName + " nobette");
    }


}
