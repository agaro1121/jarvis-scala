package com.github.jarvis

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
trait Message extends js.Object {
  def send(message: String): Unit;
  def reply(message: String): Unit;
  def emote(message: String): Unit;
}