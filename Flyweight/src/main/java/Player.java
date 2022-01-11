public class Player {

    private String name;
    private String race;
    private PlayerType playerType;

    public Player(String name, String race, PlayerType playerType) {
        this.name = name;
        this.race = race;
        this.playerType = playerType;
    }

    public String getPlayer() {
        return "Player{ " +
                "name = " + this.name +
                ", race = " + this.race  +
                ", xLocation = " + playerType.getXLocation() +
                ", yLocation = " + playerType.getYLocation() +
                "}\n";
    }
}
