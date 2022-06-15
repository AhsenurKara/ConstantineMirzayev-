package pojo.sw;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StarshipPojo {
    private int count;
    private String next;
    private int previous;
    private List<Object> results;
    private String name;
    private String model;
    private String manufacturer;
    private int cost_in_credits;
    private int length;
    private int max_atmosphering_speed;
    private int crew;
    private int passengers;
    private int cargo_capacity;
    private int consumables;
    private int hyperdrive_rating;
    private int MGLT;
    private String starship_class;
    private List<String> pilots;
    private List<String> films;
    private List<String> created;
    private List<String> edited;
    private String url;

}

