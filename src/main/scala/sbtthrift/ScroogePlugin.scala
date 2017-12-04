package sbtthrift

import sbt.{Def, _}
import sbt.Keys._

object ScroogePlugin extends AutoPlugin {
  override def requires = sbt.plugins.JvmPlugin

  override def trigger = allRequirements

  override def projectSettings: Seq[Def.Setting[_]] =
    libraryDependencies ++= Seq(
      "org.apache.thrift" % "libthrift" % "0.9.2" % "provided",
      "com.twitter" %% "scrooge-core" % "4.6.0" % "provided",
      "com.twitter" %% "scrooge-serializer" % "4.6.0" % "provided"
    ) map (_ exclude ("com.twitter", "libthrift"))
}
