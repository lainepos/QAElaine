import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;


public class UserTestes01 {
    @Test

    public void testDadoUmUsuarioQuandoConsultaQuiCkMockerEntaoObtenhoQuantidadeUsuario2() {
        //Configurar o caminho comum de acesso a minha API Rest

        baseURI = "https://g1lru963f9.api.quickmocker.com/";
        //port = 8090;
        basePath = "/api";
        String users;
        ResponseSpecification response = responseSpecification;

        users = String.valueOf(given()
                        .body("{\n}")
                        .contentType(ContentType.JSON)
        .when()
                .get("https://g1lru963f9.api.quickmocker.com/"));
                 response.then()
                .log().all()
                .statusCode(200);


        // .body("users.name", equalTo("Margareth" )));

    }

}


