import sbt.Keys.version

lazy val commonSetting = Seq(
    name := "code_template",
    version := "0.1.1",
    scalaVersion := "2.12.6"

)

val springVersion = "4.3.1.RELEASE"
lazy val commonLibrary = libraryDependencies ++= Seq(
    "org.springframework" % "spring-core" % springVersion,
    "org.springframework" % "spring-context" % springVersion,
    "org.springframework" % "spring-beans" % springVersion,
    "org.springframework" % "spring-context-support" % springVersion,
    "org.springframework" % "spring-webmvc" % springVersion,
    "org.springframework" % "spring-test" % springVersion % "test",
    "com.google.guava" % "guava" % "18.0"
)

lazy val root = Project("code_template",file(".")).settings(
    commonSetting,
    commonLibrary

)

//lazy val redis = project.dependsOn(root)
////  .settings(
////    libraryDependencies +=  "redis.clients" % "jedis" % "2.7.3"
////)

