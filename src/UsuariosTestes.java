import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;


public class UsuariosTestes {
    @Test

    public void testDadoUmUsuarioQuandoConsultaQuickMockerEntaoObtenhoStatusCode200() {
        //Configurar o caminho comum de acesso a minha API Rest

        baseURI = "https://g1lru963f9.api.quickmocker.com/";
        //port = 8090;
        basePath = "/api";

        String users = String.valueOf(given()
                .body("{\n}")
                .contentType(ContentType.JSON)

                .when()
                .get("https://g1lru963f9.api.quickmocker.com/")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200));

    }

}
