public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        LabAsistani lab1 = new LabAsistani("kadir polatkol", "0323234234", "asdas@gmail.com", "MBG", "labASisit");
        BilgiIslem bilgi1 = new BilgiIslem("kadir polatkol ", "sdfsdfsd", "asdasd@asdasd", "asdas", "112", "asdas");
        OgretimGorevlisi ogretim1 = new OgretimGorevlisi("kadir asdasd", "234234", "sdfsd@sdfsdf", "mbg", "doçent ", "21");
        Asistan asistan1 = new Asistan("kadir ", "2312321323", "asdasd@asdasasd", "mbg", "öğretim görevlisi asistanı");
        GuvenlikGorevlisi guvenlik = new GuvenlikGorevlisi("asdasd", "123123", "asdasd@dasdas", "İİBF", "8:00 , 20:00", "1.jpg");

        guvenlik.nobet();
        asistan1.ofisSaati("3");
        bilgi1.calis();
        ogretim1.senatoToplantisi();
        lab1.labGir();
    }
}