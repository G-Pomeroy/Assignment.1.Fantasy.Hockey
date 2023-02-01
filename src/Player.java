public class Player {

    private String playerName;
    private int playerGoals;
    private int playerAssists;
    private int totalStats;

    //Establish Player Setters

    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }

    public void setPlayerGoals(int playerGoals){
        this.playerGoals = playerGoals;
    }

    public void setPlayerAssists(int playerAssists){
        this.playerAssists = playerAssists;
    }

    public void setTotalStats(int totalStats){
        this.totalStats = totalStats;
    }

    //Establish Player Getters

    public String getPlayerName(){
        return playerName;
    }

    public int getPlayerGoals(){
        return playerGoals;
    }

    public int getPlayerAssists(){
        return playerAssists;
    }

    public int getTotalStats() {
        return totalStats;
    }

    //Constructor

    public Player (String playerName, int playerGoals, int playerAssists){
        this.playerName = playerName;
        this.playerGoals = playerGoals;
        this.playerAssists = playerAssists;
    }

    public Player (String playerName){
        this.playerName = playerName;

    }

    public Player (int playerGoals){
        this.playerGoals = playerGoals;

    }

    public void outputPlayerDetails(){
        totalStats = playerGoals + playerAssists;
        System.out.print(playerName +":     G - " + playerGoals + "     A - " + playerAssists + "      Total:  " + totalStats);
    }

}
