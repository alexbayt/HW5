package org.example;

//import org.json.JSONObject;
//import jdk.nashorn.internal.parser.JSONParser;

//import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.FileReader;

//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import static io.restassured.RestAssured.given;

public class Main {

    private static final String way = "C:\\Users\\Mariya\\IdeaProjects\\BaytovA\\create.json";

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader (way);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            JSONArray fields = (JSONArray) io.get("fields");
            Iterator fieldsItr = fields.iterator();
            System.out.println("fields:");

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

}
