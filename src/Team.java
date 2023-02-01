public class Team {

    private String teamName;
    private Player[] playerList;
    private int total_players;
    private int teamSize;
    private float budget;


    //Establish Team Setters
    public void setTeamName(String teamName) {
        this.teamName = teamName;

    }

    public String getTeamName() {
        return teamName;
    }

    public Team(String teamName, int teamSize, Player[] playerList, float budget) {
        this.teamName = teamName;
        this.teamSize = teamSize;
        this.playerList = new Player[teamSize];
        this.total_players = 0;
        this.budget = (float) (Math.random() * 100000.00);
    }

    public Team(String teamName){
        this.teamName = teamName;
    }

    public float getBudget() {
        return this.budget;
    }

    public int getTotalPlayers() {
        return this.total_players;
    }

    public int getTeamSize(){
        return this.teamSize;
    }


    public void addPlayer(Player newPlayer) {
        this.playerList[total_players] = newPlayer;
        total_players++;
    }

    public int getTotalGoals() {

        int totalGoals = 0;
        for (int i = 0; i <= total_players; i++) {

            totalGoals += playerList[i].getPlayerGoals();

        }
        return totalGoals;
    }

    public int getTotalAssists() {

         int totalAssists = 0;
         for (int i = 0; i <= total_players; i++) {

             totalAssists += playerList[i].getPlayerAssists();

            }

        return totalAssists;
    }

    public int addGoalAssist(){
        int totalScore = 0;
        for(int i = 0; i <= total_players; i++) {
            totalScore = getTotalAssists() + getTotalGoals();
        }
        return totalScore;
    }
}

