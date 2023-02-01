import java.util.*;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();


        Team[] team = new Team[3];
        Player[] player = new Player[9];


        System.out.println("FANTASY HOCKEY APPLICATION");
        System.out.println("TEAM ENTRY");
        System.out.println("================================");

// Enter team name for 3 teams into team array, creating team object

        for (int i = 0; i < team.length; i++) {
            System.out.println("Please enter name for team #" + (i + 1));
            String teamName = input.nextLine();
            if (teamName.length() < 3) {
                System.out.println("Team name must be longer than 3 letters");
                System.out.println("Please try again");
                System.exit(0);
            } else {
                Team newTeam = new Team(teamName);
                team[i] = newTeam;
                System.out.println(team[i].getTeamName());
            }
        }


        System.out.println("");
        System.out.println("PLAYER ENTRY");
        System.out.println("================================");

// Enter player information (3 players, for 3 teams each) into player array:
        for (int i = 0; i < team.length; i++) {
            System.out.println("Enter players for " + team[i].getTeamName());
            //For-loop for 3 players (3 per team) below:
            for (int x = 0; x <= 2; x++) {
                System.out.println("Enter name for player #" + (x + 1));
                String playerName = input.nextLine();
                if (playerName.length() < 3) {
                    System.out.println("Team name must be longer than 3 letters");
                    System.out.println("Please try again");
                    System.exit(0);
                } else {

                    System.out.println("Enter number of goals for " + playerName);
                    int playerGoals = input.nextInt();
                    input.nextLine();
                    if (playerGoals < 0) {
                        System.out.println("Numbers must be greater than zero");
                        System.out.println("Please try again");
                        System.exit(0);
                    } else {
                        System.out.println("Enter number of assists for " + playerName);
                        int playerAssist = input.nextInt();
                        input.nextLine();
                        if (playerAssist < 0) {
                            System.out.println("Numbers must be greater than zero");
                            System.out.println("Please try again");
                            System.exit(0);
                        } else {

                            //creation of player object
                            Player newPlayer = new Player(playerName, playerGoals, playerAssist);
                            player[x] = newPlayer;

                        }
                    }
                }
            }
        }


                    // Stat report looped for the amount of teams in team arraylist
                    // WARNING: Currently presenting a NullPointerException
                    System.out.println("REPORT: Stats Per Team: ");
                    System.out.println("================================");
                    for (int i = 0; i < team.length; i++) {
                        System.out.println();
                        System.out.println(team[i].getTeamName() + ":     G - " + team[i].getTotalGoals() + "     A - " + team[i].getTotalAssists() + "     Total - " +
                                team[i].addGoalAssist() + "    Budget - " + fmt.format(team[i].getBudget()));
                        System.out.println("");

                        if (team[i].addGoalAssist() >= 20) {
                            System.out.println("Rating: *** stars");

                        } else if (team[i].addGoalAssist() >= 10) {
                            System.out.println("Rating: ** stars");

                        } else if (team[i].addGoalAssist() > 0) {
                            System.out.println("Rating: * stars");

                        } else {
                            System.out.println("Rating: 0 stars");
                        }
                    }

                    // Print individual player stats
                    System.out.println("REPORT: Stats Per Player: ");
                    System.out.println("================================");

                    //Nested for loop, so that after 3 players, the "x" counter increases to access the rest of the player array.
                    int x = 0;
                    for (int i = 0; i < team.length; i++) {
                        for (; x < 2; x += 3) {
                            System.out.println(team[i].getTeamName());
                            player[x].outputPlayerDetails();


                        }

                    }
                }
            }
