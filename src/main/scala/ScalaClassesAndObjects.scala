
@main
def oopClassesAndObjects(): Unit = {

  val l: Iterable[String]=List("abc")

  val animals = List("lion", "zebra", "chimp", "elephant")

  println(animals.size)
  println(animals.isEmpty)

  val table =new Table()
  println(table.color)

  val myGarage = new Garage()
  myGarage.bike.drive()
  
}

class Table {
  val color: String = "white"
}

class MBike {
  def drive(): Unit = println(
    "Driving a moto bike"
  )
}
  class Garage {
    val bike = new MBike()
  }
