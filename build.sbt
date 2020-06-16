name := "argyle"
organization := "com.joefkelley"
version := "0.99"
scalaVersion := "2.11.11"

resolvers += "Typesafe" at "https://repo.typesafe.com/typesafe/releases/"
resolvers += "Java.net Maven2 Repository" at "https://download.java.net/maven/2/"
resolvers += "Maven central" at "https://repo1.maven.org/maven2/"
resolvers += "Twitter Repository" at "https://maven.twttr.com"


libraryDependencies ++= Seq (
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "com.chuusai" %% "shapeless" % "2.3.2"
)
