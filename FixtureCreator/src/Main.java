import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Teams> teams = new ArrayList<>();
        teams.add(new Teams("Galatasaray"));
        teams.add(new Teams("Bursaspor"));
        teams.add(new Teams("Fenerbahçe"));
        teams.add(new Teams("Beşiktaş"));
        teams.add(new Teams("Başakşehir"));
        teams.add(new Teams("Trabzonspor"));


        Fixture fixture = new Fixture(teams);
        List<String> strList = fixture.genereteFixture();

        for (String i : strList){
            System.out.println(i);
        }

    }


}