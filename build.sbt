name := "myopenmoleplugin"

version := "1.0"

scalaVersion := "2.11.8"

enablePlugins(SbtOsgi)


//osgiSettings

OsgiKeys.exportPackage := Seq("myopenmoleplugin.*")

OsgiKeys.importPackage := Seq("*;resolution:=optional")

OsgiKeys.privatePackage := Seq("*")

OsgiKeys.requireCapability := """osgi.ee;filter:="(&(osgi.ee=JavaSE)(version=1.8))""""
