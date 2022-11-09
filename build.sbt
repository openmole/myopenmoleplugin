name := "myopenmoleplugin"

version := "1.0"

scalaVersion := "3.2.1"

enablePlugins(SbtOsgi)

OsgiKeys.exportPackage := Seq("myopenmoleplugin.*")

OsgiKeys.importPackage := Seq("*;resolution:=optional")

OsgiKeys.privatePackage := Seq("!scala.*", "*")

OsgiKeys.requireCapability := """osgi.ee;filter:="(&(osgi.ee=JavaSE)(version=1.8))""""

