public abstract class Worker {
    String fullName;
    String mph;
    String email;

    Worker(String fullName, String mph, String email) {
        this.fullName = fullName;
        this.mph = mph;
        this.email = email;

    }

    public abstract void giris();

    public abstract void cikis();

    public abstract void yemekhane();

}
