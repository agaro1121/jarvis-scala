import com.github.jarvis.Robot
import controllers.ExampleController
import scala.scalajs.js.JSApp



object Main extends JSApp {
  override def main(): Unit = {
    println("Saluton Mondo!")
    new ExampleController {
      override def _robot: Robot = ???
    }
  }
}
