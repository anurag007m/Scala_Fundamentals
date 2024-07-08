//Inheritance

//We can apply variables and methods from the parent class to the child class.

//@main
//def inheritance():Unit = {
//  val myDog:Dog= Corgi()
//  println(myDog.size)
//  myDog.bark()
//  myDog.play()
//}
//
//open class Dog
//
//  var size:Int=0
//
//  def bark(): Unit = println("Bark")
//
//  def play(): Unit =
//  println("Play")
//
//class Corgi extends Dog

//Inheritance
//
//@main
//def inheritancePractice(): Unit = {
//  val myLaptop =new Laptop()
//  val myApple =new Apple()
//  myApple.screenSize = 10
//  myApple.name = "Macbook"
//  myLaptop.run()
//  myApple.run()
//}
//
//open class Laptop {
//  var screenSize = 15
//  var speed = 1200
//  var name = "Generic Laptop"
//
//  def run(): Unit ={
//    println(s"Running laptop $name  at $speed with screen size $screenSize")
//  }
//}
//
//class Apple extends Laptop
//
//
//@main
//def inheritancePractice(): Unit = {
//  val myLaptop = new Laptop()
//  val myApple = new Apple()
//  myApple.screenSize = 10
//  myApple.name = "Macbook"
//  myApple.run()
//  myLaptop.run()
//}
//
//open class Laptop {
//  var screenSize = 15
//  var speed = 1200
//  var name = "Generic Laptop"
//
//  def run(): Unit = {
//    println(s"Running laptop $name at $speed with screen size $screenSize")
//  }
//}
//
//class Apple extends Laptop
//
//
//
//@main
//def inheritancePractice2(): Unit = {
//
//  val b747 = Boeing()
//  val a320 = Airbus()
//
//  b747.speed = 700
//  a320.name = "Airbus A380"
//
//  b747.ascend()
//  a320.descend()
//
//}
//
//open class Airplane {
//  var name = "Generic Airplane"
//  var speed = 1000
//  var altitude = 20_000
//  def descend(): Unit = {
//    altitude -= 1000
//    println(s"$name is descending at $speed and altitude is $altitude")
//  }
//
//  def ascend():Unit={
//    altitude += 1000
//    descend()
//  }
//}
//
//class Boeing extends Airplane
//class Airbus extends Airplane

@main
def main(): Unit = {
  var engineer = new Engineer()
  engineer.salary = 1000000
  engineer.name = "Anurag"
  val doctor = new Doctor()
  doctor.salary = 100000
  doctor.name = "Dr. APJ"
  engineer.study()
  engineer.study()
  engineer.work()
  engineer.work()
  engineer.work()
  engineer.work()
  doctor.study()
  doctor.study()
  doctor.study()
  doctor.work()
}

open class Job{
  var name: String = "Generic Name"
  var revenue: Double = 0
  var salary: Double = 100_000
  
  
  def work(): Unit = {
    revenue += salary
    println(s"$name revenue is $revenue")
  }
  
  def study():Unit = {
    salary += 1000
    println(s"$name salary is $salary")
  }
}

class Engineer extends Job

class Doctor extends Job

