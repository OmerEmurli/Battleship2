<<<<<<< HEAD
val scala3Version = "3.2.2"
=======

val scala3Version = "3.3.1"
>>>>>>> temp3

lazy val root = project
  .in(file("."))
  .settings(
<<<<<<< HEAD
    name := "Project1",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
=======
    name := "battleship2",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.14",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % "test",
     libraryDependencies += "org.scalatestplus" %% "mockito-3-4" % "3.2.9.0" % Test,
    libraryDependencies += "org.mockito" % "mockito-core" % "3.11.2" % Test,
     libraryDependencies += "org.scoverage" %% "scalac-scoverage-runtime" % "1.0.4"
>>>>>>> temp3
  )
