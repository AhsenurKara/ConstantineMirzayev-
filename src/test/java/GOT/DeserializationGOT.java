package GOT;

import com.fasterxml.jackson.databind.ObjectMapper;
import httpClient.HttpClientUtils;
import org.apache.http.HttpResponse;

import org.junit.Test;
import pojo.got.CharFullPojo;
import pojo.got.CharactersPojo;
import pojo.got.HousesPojo;
import pojo.got.LocationPojo;

import java.io.IOException;

public class DeserializationGOT {
    @Test
    public void getCharacter() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/map/characters");

        ObjectMapper objectMapper = new ObjectMapper();
        CharactersPojo character = objectMapper.readValue(response.getEntity().getContent(), CharactersPojo.class);

        System.out.println(character.getData());
    }

    @Test
    public void getHouses() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/book/houses");

        ObjectMapper objectMapper = new ObjectMapper();
        HousesPojo[] houses = objectMapper.readValue(response.getEntity().getContent(), HousesPojo[].class);

        for (HousesPojo house : houses) {
            System.out.println(house.getName());
        }
    }

    @Test
    public void getBookCharacters() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/book/characters/");

        ObjectMapper objectMapper = new ObjectMapper();
        CharFullPojo[] books = objectMapper.readValue(response.getEntity().getContent(), CharFullPojo[].class);

        for (CharFullPojo book : books) {
            System.out.println(book.getName());
        }
    }

    @Test
    public void getLocations() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/book/characterlocations");

        ObjectMapper objectMapper = new ObjectMapper();
        LocationPojo location = objectMapper.readValue(response.getEntity().getContent(), LocationPojo.class);

        System.out.println(location.getData());
    }
}

