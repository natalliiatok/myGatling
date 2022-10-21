import io.gatling.core.Predef._
import io.gatling.http.Predef._
import Simulation._

class LoadTest extends Simulation {
  val httpConf = http.baseUrl( url = "https://192.168.88.216:5001/Crudilca")

  setUp(
    getEntitiesScen.inject(
      constantUsersPerSec(10) during 2
    ).protocols(httpConf)
  )
}