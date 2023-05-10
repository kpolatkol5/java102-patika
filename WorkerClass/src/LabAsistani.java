public class LabAsistani extends Asistan {


    LabAsistani(String fullName, String mph, String email, String bolum, String unvan) {
        super(fullName, mph, email, bolum, unvan);
    }

    public void labGir() {
        System.out.println(this.fullName + "laba girdi");

    }

}

