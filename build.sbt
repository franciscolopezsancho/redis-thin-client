import Dependencies._

ThisBuild / scalaVersion := "2.13.2"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.ey"


lazy val root = (project in file("."))
	.settings(
		name := "redis-thin-client",
		libraryDependencies ++= Seq(
			redis,
			logback,
			scalaTest % Test
		)
	)
