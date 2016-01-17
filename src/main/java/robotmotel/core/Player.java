package robotmotel.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

/**
 * Created by olivier on 16/01/2016.
 */
public class Player {

    private long id;

    @Length(max = 20)
    private String name;

    public Player() {
        // Jackson deserialization
    }

    public Player(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getName() {
        return name;
    }


}
