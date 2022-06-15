package pojo.got;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
@Getter
@Setter
public class LocationPojo {
    private String message;
    private List<Object> data;
    private List<String> locations;
    private int _id;
    private String name;
    private String slug;
    private int __v;
}