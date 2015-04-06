package myopenmoleplugin

object Hello {
  case class Result(value: Int)

  def world(i: Int) = i * 2
  def typedWorld(i: Int) = Result(world(i))
}

