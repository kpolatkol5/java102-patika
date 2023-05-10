public class BilgiIslem extends Memur {
    String gorev;

    BilgiIslem(String fullName, String mph, String email, String departman, String mesai, String gorev) {
        super(fullName, mph, email, departman, mesai);
        this.gorev = gorev;

    }

    @Override
    public void cikis() {
        System.out.println(this.fullName + " çıkış yaptı");

    }

    @Override
    public void yemekhane() {
        System.out.println(this.fullName + " yemekhaneye giriş yaptı");

    }

    @Override
    public void giris() {

        System.out.println(this.fullName + " giriş yaptı");
    }

    @Override
    public void calis() {
        System.out.println(this.fullName + " çalışmaya başladı");
    }
}
