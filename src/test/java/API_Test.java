import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

public class API_Test {

    @Test
    public void verifyThatFieldNameHasCorrectValue() {
        given()
                .when()
                .get("https://swapi.dev/api/starships/9/")
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .body("name", equalTo("Death Star"));
    }
}
