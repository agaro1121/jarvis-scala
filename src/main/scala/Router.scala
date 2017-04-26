package mainrobot

import com.github.jarvis.Robot
import controllers.ExampleController

import scala.scalajs.js.annotation.JSExport

@JSExport
object Router {

  @JSExport("apply")
  def apply(robot: Robot) = {
    new ExampleController {
      def _robot = robot
    }
  }

}