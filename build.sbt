name := "jobbroker-common"
organization := "com.ruimo"
scalaVersion := "2.12.6"

publishTo := Some(
  Resolver.file(
    "jobbroker-common",
    new File(Option(System.getenv("RELEASE_DIR")).getOrElse("/tmp"))
  )
)

resolvers += "ruimo.com" at "http://static.ruimo.com/release"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies += "org.specs2" %% "specs2-core" % "4.3.3" % Test
