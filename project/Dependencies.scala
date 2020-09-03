import sbt._

object Dependencies {
	lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.1.1"
	lazy val redis = "net.debasishg" %% "redisclient" % "3.30"
	lazy val logback = "ch.qos.logback" % "logback-classic" % "1.2.3" 
	lazy val slf4jApi = "org.slf4j" % "slf4j-api" % "1.7.30"
}