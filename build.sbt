name := "myopenmoleplugin"

version := "1.0"

scalaVersion := "2.11.2"

osgiSettings

OsgiKeys.exportPackage := Seq("myopenmoleplugin.*")

OsgiKeys.importPackage := Seq("*;resolution:=optional")

OsgiKeys.privatePackage := Seq("!scala.*,*")

scalariformSettings

