
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scanner.nextLine();
        System.out.println("Team: ");
        String team = scanner.nextLine();
        
        ArrayList<String> matches = new ArrayList<>();
        int wins = 0;
        int losses = 0;
        
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeTeamScore = Integer.valueOf(parts[2]);
                int awayTeamScore = Integer.valueOf(parts[3]);

                if (homeTeam.equals(team)) {
                    if (homeTeamScore > awayTeamScore) {
                        wins++;
                        matches.add("W");
                    } else if (homeTeamScore < awayTeamScore) {
                        losses++;
                        matches.add("L");
                    }
                } else if (awayTeam.equals(team)) {
                    if (homeTeamScore > awayTeamScore) {
                        losses++;
                        matches.add("L");
                    } else if (homeTeamScore < awayTeamScore) {
                        wins++;
                        matches.add("W");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + matches.size());
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
