import sbt._
import Keys._
object SbtMultiBuild extends Build {
    lazy val antCrawler = Project(id = "antCrawler",
                           base = file(".")) aggregate(download, storage,cleansing)
    lazy val download = Project(id = "download",
                           base = file("download"))
    lazy val storage = Project(id = "storage",
                           base = file("storage"))
    lazy val cleansing = Project(id = "cleansing",
                           base = file("cleansing"))

}
