public class Team {
    private String name;
    private int games;
            // siege,unendschieden,niederlage
    private int[] gamesArr = new int[3];
            //geschossen,bekommen
    private int[] goals = new int[2];

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGamesWin() {
        this.gamesArr[0]++;
    }

    public void setGamesDraw() {
        this.gamesArr[1]++;
    }

    public void setGamesLoss() {
        this.gamesArr[2]++;
    }

    public void setGoalsup(int bekommen, int geschossen) {
        this.goals[0] += geschossen; // this.goals[0] + geschossen
        this.goals[1] += bekommen;
    }

    public void addGame(){
        this.games++;
    }

    public int getGamesWins() {
        return gamesArr[0];
    }
    public int getGamesDraw() {
        return gamesArr[1];
    }
    public int getGamesLoss() {
        return gamesArr[2];
    }
}
