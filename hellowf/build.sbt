name := "myopenmoleplugin"

version := "1.0"

scalaVersion := "2.11.6"

osgiSettings

OsgiKeys.exportPackage := Seq("myopenmoleplugin.*")

OsgiKeys.importPackage := Seq("*;resolution:=optional")

OsgiKeys.privatePackage := Seq("!scala.*,*")

scalariformSettings

resolvers += "ISC-PIF Release" at "http://maven.iscpif.fr/public/"

val openMOLEVersion = "5.0-SNAPSHOT"

libraryDependencies += "org.openmole" %% "org-openmole-core-dsl" % openMOLEVersion

libraryDependencies += "org.openmole" %% "org-openmole-plugin-task-scala" % openMOLEVersion


