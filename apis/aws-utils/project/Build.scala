import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "api-aws-utils"
    val appVersion      = "1.3.1"

    val appDependencies = Seq(
      "com.mj" %% "library-utils" % "1.0.1"
    )
    
  val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
    organization := "com.mj",
    resolvers += Resolver.url("Markus Jura Play Libraries GitHub Repository", url("http://markusjura.github.com/play-libraries"))(Resolver.ivyStylePatterns))


}
