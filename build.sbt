val flink_scala_0_10_0 = "org.apache.flink" % "flink-scala" % "0.10.0"
val flink_clients_0_10_0 = "org.apache.flink" % "flink-clients" % "0.10.0"

lazy val commonSettings = Seq(
  organization := "io.allthingsdata",
  version := "0.1.0",
  scalaVersion := "2.11.7"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "flink-sbt",
    libraryDependencies += flink_scala_0_10_0,
    libraryDependencies += flink_clients_0_10_0
  )
