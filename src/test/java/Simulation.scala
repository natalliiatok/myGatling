import io.gatling.core.Predef._
import Request._
import io.gatling.core.structure.ScenarioBuilder

object Simulation {
  def getEntitiesScen: ScenarioBuilder = scenario( "first scenario")
    .exec(getEntity)
//    .exec(postOrder)
}
