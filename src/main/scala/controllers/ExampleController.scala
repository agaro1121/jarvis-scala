package controllers

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

trait ExampleController extends Controller {

  hear("test1") { msg =>
    msg.send("aaa")
  }

  hear("test2") { msg =>
    msg.send("bbb")
  }

  respond("test3") { msg =>
    msg.send("ccc")
  }

  respond("testfuture") { msg =>
    val f = Future{
      "testfutureresponse"
    }

    val url = "https://api.github.com/users/agaro1121"

    f.foreach(msg.send)
  }

}
