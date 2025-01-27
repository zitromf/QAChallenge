package steps;

import conf.Endpoints;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class GetSingleUser {

    public ValidatableResponse byId(Integer id) {
        return
                given()
                        .pathParam("userId", id)
                        .get(Endpoints.USERS.path())
                        .then();
    }

}
