package com.example

import org.scalajs.dom
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js.annotation._

@JSExportTopLevel("Hello")
object Hello {
  @JSExport
  def main(root: dom.html.Div): Unit = {
    val HelloMessage = ScalaComponent.builder[String]("HelloMessage")
      .render($ => <.div("Hello ", $.props))
      .build

    HelloMessage("World").renderIntoDOM(root)
  }
}
