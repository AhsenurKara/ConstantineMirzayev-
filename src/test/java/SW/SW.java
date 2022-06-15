package SW;

import com.fasterxml.jackson.databind.ObjectMapper;
import httpClient.HttpClientUtils;
import org.apache.http.HttpResponse;
import org.junit.Test;
import pojo.sw.StarshipPojo;
import pojo.sw.PeoplePojo;
import pojo.sw.PlanetsPojo;

import java.io.IOException;

public class SW {
    @Test
    public void getPlanets() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://swapi.dev/api/planets?page=1");

        ObjectMapper objectMapper = new ObjectMapper();
        PlanetsPojo star = objectMapper.readValue(response.getEntity().getContent(), PlanetsPojo.class);

        System.out.println(star.getResults());
    }


    @Test
    public void getStarships() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://swapi.dev/api/starships/?page=1");

        ObjectMapper objectMapper = new ObjectMapper();
        StarshipPojo starship = objectMapper.readValue(response.getEntity().getContent(), StarshipPojo.class);

        System.out.println(starship.getResults());
    }

    @Test
    public void getPeople() throws IOException {

        HttpResponse response = HttpClientUtils.getGetResponse("https://swapi.dev/api/people/?page=1");

        ObjectMapper objectMapper = new ObjectMapper();
        PeoplePojo people = objectMapper.readValue(response.getEntity().getContent(), PeoplePojo.class);

        System.out.println(people.getResults());
    }
}
