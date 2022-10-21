import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder

object Request {

  def getEntity: ChainBuilder = {
    exec( http("getEntities")
      .get("/1")
      .check(status.is(200))
    ) } }
  /*
  def postOrder = {
    exec(
      http("new oder")
        .post("/1")
        .body(StringBody(
          """
            |{
            |"text":"Hello world",
            |"comment": "This comment katok"
            |}
            |""".stripMargin))
        .header("content-type", "aplication/json")
        .check(status.is(200))
    )
  } */

