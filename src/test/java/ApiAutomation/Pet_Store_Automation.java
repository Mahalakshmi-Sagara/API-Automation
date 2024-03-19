package ApiAutomation;

import groovy.io.FileType;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.FileAssert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import java.io.File;


public class Pet_Store_Automation
{
    @Test
    public void create_user()
    {
       Response response = given()

               .header("accept","application/json")
                .header( "Content-Type", "application/json")
        .body("{\n" +
            "  \"id\": 1,\n" +
            "  \"username\": \"Maha\",\n" +
            "  \"firstName\": \"maha\",\n" +
            "  \"lastName\": \"rangnath\",\n" +
            "  \"email\": \"string\",\n" +
            "  \"password\": \"string\",\n" +
            "  \"phone\": \"redmi\",\n" +
            "  \"userStatus\": 0\n" +
            "}")
            .when()
            .post("https://petstore.swagger.io/v2/user");

         response.prettyPrint();
        response.then().statusCode(200);
    }
    @Test
    public void get_user()
    {
        Response response = given()
                .header("accept","application/json")
                .when()
                .get("\n" +
                                "https://petstore.swagger.io/v2/user/login?username=Maha&password=Maha1");

        response.prettyPrint();
        response.then().statusCode(200);
    }
    @Test
    public void update_user()
    {
        Response response = given()
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"username\": \"Mahaaaa\",\n" +
                        "  \"firstName\": \"\",\n" +
                        "  \"lastName\": \"string\",\n" +
                        "  \"email\": \"string\",\n" +
                        "  \"password\": \"string\",\n" +
                        "  \"phone\": \"redmi7\",\n" +
                        "  \"userStatus\": 0\n" +
                        "}")
                .when()
                .put("https://petstore.swagger.io/v2/user/Maha");
        response.prettyPrint();
        response.then().statusCode(200);
    }
    @Test
    public void delete_user()
    {
        Response response = given()
                .header("accept","application/json")

                .when()
                        .delete("https://petstore.swagger.io/v2/user/Pavithra");
        response.prettyPrint();
        response.then().statusCode(200);
    }
    @Test
    public void create_user_with_array()
    {
        Response response = given()
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .body("[\n" +
                        "  {\n" +
                        "    \"id\": 1,\n" +
                        "    \"username\": \"Maha\",\n" +
                        "    \"firstName\": \"maha\",\n" +
                        "    \"lastName\": \"rangnath\",\n" +
                        "    \"email\": \"maharangnath@gmail.com\",\n" +
                        "    \"password\": \"Maha@123\",\n" +
                        "    \"phone\": \"Redmi\",\n" +
                        "    \"userStatus\": 0\n" +
                        "  },\n" +
                        " {\n" +
                        "    \"id\": 2,\n" +
                        "    \"username\": \"Rakshu\",\n" +
                        "    \"firstName\": \"rakshu\",\n" +
                        "    \"lastName\": \"rangnath\",\n" +
                        "    \"email\": \"rakshurangnath@gmail.com\",\n" +
                        "    \"password\": \"Rakshu@123\",\n" +
                        "    \"phone\": \"Vivo\",\n" +
                        "    \"userStatus\": 0\n" +
                        "  },\n" +
                        " {\n" +
                        "    \"id\": 3,\n" +
                        "    \"username\": \"Pavithra\",\n" +
                        "    \"firstName\": \"pavithra\",\n" +
                        "    \"lastName\": \"rangnath\",\n" +
                        "    \"email\": \"pavithrarangnath@gmail.com\",\n" +
                        "    \"password\": \"Pavithra@123\",\n" +
                        "    \"phone\": \"Samsung\",\n" +
                        "    \"userStatus\": 0\n" +
                        "  },\n" +
                        " {\n" +
                        "    \"id\": 4,\n" +
                        "    \"username\": \"Hema\",\n" +
                        "    \"firstName\": \"hema\",\n" +
                        "    \"lastName\": \"rangnath\",\n" +
                        "    \"email\": \"hemarangnath@gmail.com\",\n" +
                        "    \"password\": \"Hema@123\",\n" +
                        "    \"phone\": \"Oppo\",\n" +
                        "    \"userStatus\": 0\n" +
                        "  },\n" +
                        "\n" +
                        "]")
                .when()
                        .post("https://petstore.swagger.io/v2/user/createWithArray");
        response.prettyPrint();
        response.then().statusCode(200);
    }
    @Test
    public void get_user_logout()
    {
        Response response = given()
                .header("accept","application/json")
                .when()
                        .get("https://petstore.swagger.io/v2/user/logout");
        response.prettyPrint();
        response.then().statusCode(200);
    }
    @Test
    public void get_user_into_system_login()
    {
        Response response = given()
                .header("accept","application/json")
//               .pathParams("un","Maha")
//                .pathParams("pass","Maha%40123")
                .queryParam("un","Maha")
               .queryParam("pass","Maha%40123")
                .when()
                .get("https://petstore.swagger.io/v2/user/login");
        response.prettyPrint();
        response.then().statusCode(200);
    }
    @Test
    public void get_user_by_user_name()
    {
        Response response = given()
                .header("accept","application/json")
               .pathParams("un","Maha")
               .pathParams("pass","Maha%40123")
             //   .queryParam("un","Maha")
            //    .queryParam("pass","Maha%40123")
                .when()
                .get("https://petstore.swagger.io/v2/user/Rakshu");
        response.prettyPrint();
        response.then().statusCode(200);
    }
    @Test
    public void place_an_order_for_a_pet()
    {
        Response response = given()
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "  \"id\": 11,\n" +
                        "  \"petId\": 111,\n" +
                        "  \"quantity\": 1,\n" +
                        "  \"shipDate\": \"2024-01-31T11:30:28.750Z\",\n" +
                        "  \"status\": \"placed\",\n" +
                        "  \"complete\": true\n" +
                        "}")
                .when()
                        .post("https://petstore.swagger.io/v2/store/order");
        response.prettyPrint();
        response.then().statusCode(200);
    }
    @Test
    public void find_purchase_order_by_id()
    {
        Response response = given()
                .header("accept","application/json")
                .when()
                .get("https://petstore.swagger.io/v2/store/order/2");
        response.prettyPrint();
        response.then().statusCode(200);
    }
    @Test
    public void returns_pet_inventories_by_status()
    {
        Response response = given()
                .header("accept","application/json")
                .when()
                .get("https://petstore.swagger.io/v2/store/inventory");
        response.prettyPrint();
        response.then().statusCode(200);
    }
    @Test
    public void delete_purchase_order_by_id()
    {
        Response response = given()
                .header("accept","application/json")
                .when()
                        .delete("https://petstore.swagger.io/v2/store/order/2");
        response.prettyPrint();
        response.then().statusCode(200);
    }
    @Test
    public void add_a_new_pet_to_the_store()
    {
        Response response = given()
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "  \"id\": 1,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 11,\n" +
                        "    \"name\": \"dog\"\n" +
                        "  },\n" +
                        "  \"name\": \"doggie\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"kissing\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 2,\n" +
                        "      \"name\": \"cat\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")
                .when()
                .post("https://petstore.swagger.io/v2/pet");
        response.prettyPrint();
        Assert.assertEquals(response.statusCode(),200);
    }
    @Test
    public void update_an_existing_pet()
    {
        Response response = given()
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "  \"id\": 1,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 11,\n" +
                        "    \"name\": \"doggy\"\n" +
                        "  },\n" +
                        "  \"name\": \"doggie\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"love\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 2,\n" +
                        "      \"name\": \"catty\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")
                .when()
                        .put("https://petstore.swagger.io/v2/pet");
        response.prettyPrint();
        String name = response.path("category.name");
        System.out.println(name);
        response.then().statusCode(200);
    }
    @Test
    public void finds_pets_by_status()
    {
        Response response = given()
                .header("accept","application/json")
                .when()
                        .get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
        response.prettyPrint();
        response.then().statusCode(200);
    }
    @Test
    public void find_pet_by_id()
    {
        Response response = given()
                .header("accept","application/json")
                .when()
                .get("https://petstore.swagger.io/v2/pet/1");
        response.prettyPrint();
        //response.then().statusCode(200);
        Assert.assertEquals(response.statusCode(),200);
    }
    @Test
    public void updates_a_pet_in_the_store_with_form_data()
    {
        Response response = given()
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .body("name=doggy&status=available")
                .when()
                .post("https://petstore.swagger.io/v2/pet/1");
        response.prettyPrint();

    }
    @Test
    public void user_creation()
    {
        Response response = given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "   \"id\": \"121\",\n" +
                        "   \"title\" : \"Performance Testing\",\n" +
                        "   \"author\": \"Kush\" \n" +
                        "   \n" +
                        "}")
                .when()
                .post("http://localhost:3000/posts");
        response.prettyPrint();

    }
    @Test
    public void image_uploaded()
    {
        File file = new File("C:\\Users\\HP\\Pictures\\Screenshots\\mypic.png");
        Response response = given()
                .header("accept","application/json")
                .header("Content-Type","multipart/form-data")
                .multiPart(file)
                .when()
                .post("https://petstore.swagger.io/v2/pet/1/uploadImage");
        response.prettyPrint();
    }














}
