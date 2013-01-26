import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

  val appName = "library-utils"
  val appVersion = "1.0.1"

  val appDependencies = Seq( // Add your project dependencies here,
  )

  val main = PlayProject(appName, appVersion, appDependencies).settings(
  organization := "com.mj",
  resolvers += Resolver.url("Markus Jura Play Libraries GitHub Repository", url("http://markusjura.github.com/play-libraries"))(Resolver.ivyStylePatterns))

}
