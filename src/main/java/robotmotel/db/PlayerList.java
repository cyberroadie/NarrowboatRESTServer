package robotmotel.db;

import robotmotel.core.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by olivier on 17/01/2016.
 */
public class PlayerList {

    final private Map<Long, Player> playerList;

    public PlayerList() {
        playerList = new HashMap<Long, Player>();
    }

    public void addPlayer(Player player) {
        playerList.put(player.getId(), player);
    }

    public void removePlayer(Player player) {
        playerList.remove(player.getId());
    }

    public Player getPLayer(Long id) {
        return playerList.get(id);
    }

    public Map<Long, Player> getAllPlayers() {
        return playerList;
    }
}
