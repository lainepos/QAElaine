import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;



public class ValidaCamposApi {
    @Test

    public void testDadoUmUsuarioQuandoConsultaQuickMockerEntaoObtenhoDadosDoUsuarioEDadosEnderecoStatusCode200() {

        baseURI = "https://g1lru963f9.api.quickmocker.com/";
        //port = 8090;
        basePath = "/api";
        final ValidatableResponse body;
        body = when().
                get("https://g1lru963f9.api.quickmocker.com/").
                then().
                log().all()
                .assertThat()

                .body("users.name", equalTo("Michael"));
        //   .body("users.last_name", is("Jackson"));
                //       .body("users.age", is(33))
        //        .body("users.date_nasc", is("10/07/1988"))
        //       .body("users.name", is("Margareth"))
        //       .body("users.last_name", is("Thatcher"))
        //       .body("users.age", is(50))
        //       .body("users.date_nasc", is("date_nasc"));

        //        .body("address.city", is("São Paulo"))
        //       .body("street", is("Avenida das Oliveiras"))
        //       .body("number", is(99))
        //       .body("UF", is("SP"))
        //      .body("geo[0].state.lat", is("4514.13515"))
        //      .body("geo[0].state.long", is("15132534"))
        //     .body("geo[0].state.planet[0]", is("Earth"));

    }

}






