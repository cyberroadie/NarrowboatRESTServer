package robotmotel.resources;

import com.codahale.metrics.annotation.Timed;
import robotmotel.core.Player;
import robotmotel.db.PlayerList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by olivier on 16/01/2016.
 */
@Path("/player")
@Produces(MediaType.APPLICATION_JSON)
public class PlayerResource {

    private final String template;
    private final String defaultName;
    private final AtomicLong counter;
    private final PlayerList playerList = new PlayerList();

    public PlayerResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public Player getPlayer(@QueryParam("id") Long id) {
        return playerList.getPLayer(id);
    }

    @POST
    public void addPlayer(Player player) {
        playerList.addPlayer(player);
    }

    @GET
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    public Map<Long, Player> getAllPlayers () {
        return playerList.getAllPlayers();
    }
}
