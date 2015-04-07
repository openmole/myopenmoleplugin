package myopenmoleplugin

object Hello extends Hello

case class Result(value: Int)

trait Hello {
  def world(i: Int) = i * 2
  def typedWorld(i: Int) = Result(world(i))
}




