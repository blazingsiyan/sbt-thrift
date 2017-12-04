organization in ThisBuild := "com.doubajam"

version in ThisBuild := "0.0.1-SNAPSHOT"

scalaVersion in ThisBuild := "2.10.6"

lazy val root = (project in file("."))
  .settings(
    name := "sbt-thrift",
    description := "sbt plugin for thrift and scrooge",
    sbtPlugin := true,
    addSbtPlugin(
      "com.twitter" % "scrooge-sbt-plugin" % "4.5.0"
        exclude ("com.twitter", "libthrift")
        exclude ("org.apache.thrift", "libthrift")),
    publishArtifact in Test := false
  )
