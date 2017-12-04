lazy val root = (project in file("."))
  .settings(
    name := "sbt-thrift-test",
    libraryDependencies ++= Seq(
      "org.apache.thrift" % "libthrift" % "0.9.2",
      "com.twitter" %% "scrooge-core" % "4.6.0",
      "com.twitter" %% "scrooge-serializer" % "4.6.0"
    ) map (_ exclude ("com.twitter", "libthrift"))
  )
