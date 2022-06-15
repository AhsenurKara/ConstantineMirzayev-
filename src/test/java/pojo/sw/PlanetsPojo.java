package pojo.sw;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class PlanetsPojo {

    private int count;
    private String next;
    private int previous;
    private List<Object> results;
    private List<String> name;
    private int rotation_period;
    private int orbital_period;
    private int diameter;
    private String climate;
    private String terrain;
    private int surface_water;
    private int population;
    private List<String> residents;
    private List<String> films;
    private String created;
    private String edited;
    private String url;
}