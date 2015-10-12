val scalaTest = "org.scalatest" % "scalatest_2.10" % "2.0" % "test"
val scalaSpec = "org.specs2" %% "specs2-core" % "3.6.4" % "test"
val guava = "com.google.guava" % "guava" % "18.0"

lazy val root = (project in file(".")).
  settings(
    name := "UnivLang_Scala",
    version := "0.1.0",
    scalaVersion := "2.10.4",
    libraryDependencies += scalaTest,
    libraryDependencies += scalaSpec,
    libraryDependencies += guava

  )