import conf.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Paths;
import static io.restassured.RestAssured.given;
import static io.restassured.path.json.JsonPath.from;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

public class ReqResTests extends BaseTest {

    @Given("^I am testing API$")
    public void i_am_testig_API() throws Throwable {

    }

    @When("^I want see all records$")
    public void i_want_see_all_records() throws Throwable {

    }
    @When("^I want delete a pet$")
    public void i_want_delete_a_pet() throws Throwable {

    }
    @When("^I want see id records$")
    public void i_want_see_id_records() throws Throwable {

    }
    @When("^I want add a new pet$")
    public void i_want_add_new_pet() throws Throwable {

    }
    @When("^I want update a pet$")
    public void i_want_update_a_pet() throws Throwable {

    }


    @Then("^I should be able te see all available records$")
    public void i_should_be_able_te_see_all_available_records() throws Throwable {
        given()
                .body("")
                .get("https://petstore3.swagger.io/api/v3/pet/findByStatus?status=available")
                .then()
                .log()
                .all()
                .extract()
                .asString();
    }
    @Then("^I should be able te see all pending records$")
    public void i_should_be_able_te_see_all_pending_records() throws Throwable {
        given()
                .body("")
                .get("https://petstore3.swagger.io/api/v3/pet/findByStatus?status=pending")
                .then()
                .log()
                .all()
                .extract()
                .asString();
    }
    @Then("^I should be able te see all sold records$")
    public void i_should_be_able_te_see_all_sold_records() throws Throwable {
        given()
                .body("")
                .get("https://petstore3.swagger.io/api/v3/pet/findByStatus?status=sold")
                .then()
                .log()
                .all()
                .extract()
                .asString();
    }

    @Then("^I should be able te see record id$")
    public void i_should_be_able_te_see_id() throws Throwable {

        given()
                .body("")
                .get("https://petstore3.swagger.io/api/v3/pet/1")
                .then()
                .log()
                .all()
                .extract()
                .asString();
    }

    @Then("^I add a pet$")
    public static void i_update_a_new_pet() throws Exception {
        String filePath = "src/test/java/steps/requestBody.json";
        String requestBody = new String(Files.readAllBytes(Paths.get(filePath)));
        given()
                .body(requestBody) // Cuerpo leído del archivo
                .contentType("application/json")
                .post("https://petstore3.swagger.io/api/v3/pet")
                .then()
                .log().all(); // Registrar la respuesta para depuración
    }
    @Then("^I update a existing pet$")
    public static void i_update_a_existing_pet() throws Exception {
        String filePath2 = "src/test/java/steps/requestBody2.json";
        String requestBody2 = new String(Files.readAllBytes(Paths.get(filePath2)));
        given()
                .body(requestBody2) // Cuerpo leído del archivo
                .contentType("application/json")
                .put("https://petstore3.swagger.io/api/v3/pet")
                .then()
                .log().all(); // Registrar la respuesta para depuración
    }
    @Then("^I delete a pet$")
    public void deletePet() throws Throwable {

        given()
                .body("")
                .delete("https://petstore3.swagger.io/api/v3/pet/1012")
                .then()
                .log()
                .all()
                .extract()
                .asString();
    }
}
