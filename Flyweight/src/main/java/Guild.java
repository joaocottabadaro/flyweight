import java.util.ArrayList;
import java.util.List;

public class Guild {


    private List<Player> players = new ArrayList<>();

    public void createPlayer(String name, String race, String xLocation, String yLocation) {
        PlayerType playerType = PlayerFactory.getPlayer(name, xLocation, yLocation);
        Player player = new Player(name,race, playerType);
        players.add(player);
    }

    public List<String> getGuild() {
        List<String> guild = new ArrayList<String>();
        for (Player player : this.players) {
            guild.add(player.getPlayer());
        }
        return guild;
    }
}
