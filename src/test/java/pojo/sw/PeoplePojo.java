package pojo.sw;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
@Getter
@Setter
public class PeoplePojo {
    private int count;
    private String next;
    private int previous;
    private List<Object> results;
    private String name;
    private int height;
    private int mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private int birth_year;
    private String gender;
    private String homeworld;
    private List<String> films;
    private List<String> species;
    private List<String> vehicles;
    private List<String> starships;
    private String created;
    private String edited;
    private String url;
}