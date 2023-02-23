package HW5.empty;

//import org.json.JSONObject;
//import jdk.nashorn.internal.parser.JSONParser;

//import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.FileReader;

//import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import static io.restassured.RestAssured.given;

public class CreateIssue {

    private static final String way = "C:\\Users\\Mariya\\IdeaProjects\\BaytovA\\create.json";

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader (way);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            String project = (String) jsonObject.get("project");
           System.out.println(project);

            // получение номера из объекта
         /*   long id =  (long) jsonObject.get("id");
          System.out.println(id);

            String summary = (String) jsonObject.get("summary");
           System.out.println(summary);

            String description = (String) jsonObject.get("description");
           System.out.println(description);

            String issuetype = (String) jsonObject.get("issuetype");
            System.out.println(issuetype);

            long id2 =  (long) jsonObject.get("id2");
            System.out.println(id2);*/

            String  getId = jsonObject.get(project).toString();
            System.out.println(getId);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }

  /*  public static void local(String id) {
        Response gettinglocal = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" + id)
                .then()
                .extract()
                .response();
      String  getId = (new org.json.simple.JSONObject(jsonObject.getBody().asString()).get("location").toString());
        speciesBlim = (new org.json.JSONObject(gettinglocal.getBody().asString()).get("species").toString());
        //    int lastEpisode = Integer.parseInt(new JSONObject(gettingEpisode.getBody().asString()).getJSONArray("episode").get(episode).toString().replaceAll("[^0-9]", ""));
        System.out.println("\nГде Blim Blam:\n" + locationBlim + "\nТип Blim Blam\n" + speciesBlim);

    }*/
}
