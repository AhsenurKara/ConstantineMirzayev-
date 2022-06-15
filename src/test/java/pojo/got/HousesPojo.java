package pojo.got;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class HousesPojo {
    private List<String> titles;
    private List<String> overlords;
    private List<String> ancestralWeapon;
    private String _id;
    private String name;
    private String image;
    private String coatOfArms;
    private String words;
    private String currentLord;
    private String seat;
    private String region;
    private int founded;
    private String founder;
    private String cadetBranch;
    private String heir;
    private Boolean isExtinct;
    private String createdAt;
    private String updatedAt;
    private int __v;
}
