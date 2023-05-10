public class Asistan extends Akademisyen {
    public Asistan(String fullName, String mph, String email, String bolum, String unvan) {
        super(fullName, mph, email, bolum, unvan);
    }

    @Override
    public void derseGir() {
        System.out.println(this.fullName + "dersi başlattı");

    }

    @Override
    public void giris() {
        System.out.println(this.fullName + " giriş yaptı");

    }

    @Override
    public void cikis() {
        System.out.println(this.fullName + " çıkış yaptı");

    }

    @Override
    public void yemekhane() {
        System.out.println(this.fullName + "yemekhanye giriş yaptı");

    }

    public  void ofisSaati(String saat){
        System.out.println(String.format("%s asistanı saat %s de ofiste " , this.fullName , saat));
    }
    public void quizYap(){
        System.out.println(this.fullName+"quiz yaptı");
    }

}


