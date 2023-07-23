import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fixture {

    private ArrayList<Teams> teams;

    private ArrayList<String> fixtures;

    public Fixture(ArrayList<Teams> teams) {
        this.teams = teams;
        this.fixtures = new ArrayList<String>();
    }

    private void evenTeam() {
        if (this.teams.size() % 2 != 0) {
            this.teams.add(new Teams("Bay"));
        }
    }

    private int getTotalMatch() {
        this.evenTeam();
        return (this.teams.size() - 1) * 2;
    }

    private void randomTeams() {
        Collections.shuffle(this.teams);//listedeki elemanları rastgele karıştırıyor.
    }

    public ArrayList<String> genereteFixture() {

        int totalRounds = this.getTotalMatch();
        this.randomTeams();

        int matchesPerRound = this.teams.size() / 2;

        // bu kısmı yapay zeka yazdı.Döngüsel indeks hesaplama diye bir kavram daha önce duymamıştım öğrenmiş oldum...

        for (int round = 0; round < totalRounds; round++) {
            StringBuilder roundFixtures = new StringBuilder();// string objesi üretiyor daha az kaynak tüketir.

            for (int match = 0; match < matchesPerRound; match++) {

                int homeTeamIndex = (round + match) % teams.size();
                int awayTeamIndex = (round + teams.size() - match) % teams.size();

                if (homeTeamIndex != awayTeamIndex) {
                    //takımlar kendileri ile maç yapamaz
                    Teams homeTeam = teams.get(homeTeamIndex);
                    Teams awayTeam = teams.get(awayTeamIndex);
                    roundFixtures.append(homeTeam.getTeamName()).append(" vs ").append(awayTeam.getTeamName()).append("\n");
                }
            }
            fixtures.add(roundFixtures.toString());

        }
        return this.fixtures;

    }
}
