// A class is a blueprint for components(objects)

//A class has
//Variables
//Methods(functions)
//
//@main
//
//def oopClasses(): Unit = {
//  val myCar = Car()
//  val yourCar = Car()
//  println(myCar)
//  println(yourCar)
//  myCar.brand = "Tesla"
//  yourCar.brand = "Rolls Royce"
//  println(myCar.brand)
//  println(yourCar.brand)
//
//
//  myCar.start()
//  myCar.drive(100)
//}
//
//class Car:
//  var brand:String="Toyota"
//  var topSpeed = 100
//
//
//  def start(): Unit = println(s"Starting the $brand")
//
//  def drive(speed:Int): Unit =println(s"Driving at $speed")

//
//@main
//def oopObjectChallenge(): Unit = {
//
//  val math = SimpleMath()
//  println(s"3+7=${math.add(3, 7)}")
//
//  println(s"3-7=${math.subtract(3, 7)}")
//
//  println(s"3*7=${math.multiply(3, 7)}")
//
//  println(s"3/7=${math.divide(3, 7)}")
//}
//
//class SimpleMath:
//
//  def add(a:Int,b:Int) =  a+b
//
//  def subtract(a: Int, b: Int)= a - b
//
//  def multiply(a: Int, b: Int)= a * b
//
//  def divide(a: Int, b: Int)= a.toDouble / b

//
//@main def oopObjectChallenge(): Unit = {
//  val math =  SimpleMath()
//  println(s"3+7=${math.add(3, 7)}")
//  println(s"3-7=${math.subtract(3, 7)}")
//  println(s"3*7=${math.multiply(3, 7)}")
//  println(s"3/7=${math.divide(3, 7)}")
//}
//
//class SimpleMath {
//  def add(a: Int, b: Int): Int = a + b
//
//  def subtract(a: Int, b: Int): Int = a - b
//
//  def multiply(a: Int, b: Int): Int = a * b
//
//  def divide(a: Int, b: Int): Double = a.toDouble / b
//}
//

//
//@main
//
//def oopObjectChallenge(): Unit = {
//  val calc =new SimpleCalculator()
//  calc.add(3)
//  calc.mul(4)
//  calc.div(23)
//  calc.subtract(34)
//  calc.reset()
//}
//
//class SimpleCalculator {
//
//  private var total = 0d
//
//  def add(a: Double): Unit = {
//    total += a
//    println(s"+ $a = $total")
//  }
//
//
//  def subtract(a: Double): Unit = {
//    total -= a
//    println(s"+ $a = $total")
//  }
//
//
//  def mul(a: Double): Unit = {
//    total *= a
//    println(s"+ $a = $total")
//  }
//
//
//  def div(a: Double): Unit = {
//    total /= a
//    println(s"+ $a = $total")
//  }
//
//
//  def reset(): Unit = {
//    total = 0
//    println(s"+ $a = $total")
//  }
//
//}

@main def oopObjectChallenge(): Unit = {
  
  val calc = new SimpleCalculator()
  calc.add(3)
  calc.mul(4)
  calc.div(23)
  calc.subtract(34)
  calc.reset()
}

class SimpleCalculator {
  private var total = 0d

  def add(a: Double): Unit = {
    total += a
    println(s"+ $a = $total")
  }

  def subtract(a: Double): Unit = {
    total -= a
    println(s"- $a = $total")
  }

  def mul(a: Double): Unit = {
    total *= a
    println(s"* $a = $total")
  }

  def div(a: Double): Unit = {
    if (a != 0) {
      total /= a
      println(s"/ $a = $total")
    } else {
      println("Division by zero is not allowed")
    }
  }

  def reset(): Unit = {
    total = 0
    println(s"Reset = $total")
  }
}


