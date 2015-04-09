package myopenmoleplugin

import org.openmole.core.dsl._
import org.openmole.core.workflow.data._
import org.openmole.plugin.task.scala._

object HelloTask {
  def apply(output: Prototype[String]) =
    ScalaTask(
      s"""
         |val ${output.name} = "Hello world!"
       """.stripMargin) set (
        outputs += output
      )
}

