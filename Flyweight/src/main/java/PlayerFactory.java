import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {

    private static Map<String, PlayerType> players = new HashMap<>();

    public static PlayerType getPlayer(String name, String xLocation, String yLocation) {
        PlayerType playerType = players.get(name);
        if(playerType == null) {
            playerType = new PlayerType(xLocation, yLocation);
            players.put(name, playerType);
        }
        return playerType;
    }

    public static int getNumeroEstrelas() {
        return players.size();
    }
}
