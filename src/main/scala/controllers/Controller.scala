package controllers

import com.github.jarvis.{Message, Robot}

import scala.language.implicitConversions
import scala.scalajs.js

trait Controller {
  implicit def convert(s: String): js.RegExp = js.RegExp(s)

  def _robot: Robot

  def hear(pattern: js.RegExp)(callback: Message => Unit): Unit = _robot.hear(pattern, callback)
  def respond(pattern: js.RegExp)(callback: Message => Unit): Unit = _robot.respond(pattern, callback)
}