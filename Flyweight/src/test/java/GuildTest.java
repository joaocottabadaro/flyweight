import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GuildTest {


    @Test
    public void deveRetornarGuild() {
        Guild guild = new Guild();
        guild.createPlayer("Victor", "Khajid", "1392700", "452154125152");
        guild.createPlayer("Michael Scott", "Imperial", "299380700", "5215125512");
        guild.createPlayer("Lebron James", "Nordic", "245152152", "009750505");

        List<String> players = Arrays.asList(
                "Player{ name = Victor, race = Khajid, xLocation = 1392700, yLocation = 452154125152}\n",
                "Player{ name = Michael Scott, race = Imperial, xLocation = 299380700, yLocation = 5215125512}\n",
                "Player{ name = Lebron James, race = Nordic, xLocation = 245152152, yLocation = 009750505}\n");

        assertEquals(players, guild.getGuild());
    }
}
