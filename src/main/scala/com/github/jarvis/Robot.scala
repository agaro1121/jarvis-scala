package com.github.jarvis

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
trait Robot extends js.Object {
  def hear(pattern: js.RegExp, callback: js.Function1[Message, Unit]): Unit;
  def respond(pattern: js.RegExp, callback: js.Function1[Message, Unit]): Unit;
}