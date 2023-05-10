public abstract class Memur extends Worker {

    String departman;
    String mesai;

    Memur(String fullName, String mph, String email, String departman, String mesai) {
        super(fullName, mph, email);
        this.departman = departman;
        this.mesai = mesai;
    }

    public abstract void calis();
}
