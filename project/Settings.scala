import sbt._
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

object Settings {

  val name = """mockup"""
  val version = "0.0.0"

  object versions {
    val react = "16.0.0"
    val reactDom = "16.1.0"
    val scala = "2.12.4"
    val scalaJsDom = "0.9.2"
    val scalaJsReact = "1.1.1"
  }

  val jsDependencies = Def.setting(Seq(
    "org.webjars.bower" % "react" % versions.react / "react.development.js" minified "react.production.min.js",
    "org.webjars.bower" % "react" % versions.react / "react-dom.development.js" minified "react-dom.production.min.js" dependsOn "react.development.js",
  ))

  val scalaJsDependencies = Def.setting(Seq(
    "org.scala-js" %%% "scalajs-dom" % versions.scalaJsDom,
    "com.github.japgolly.scalajs-react" %%% "core" % versions.scalaJsReact
  ))

}
