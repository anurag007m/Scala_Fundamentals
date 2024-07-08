//@main
//def initialization():Unit={
//  val myCar = Car5("Ferrari", 1001)
//}
//
//class Car5(brand:String,topSpeed:Int):
//  println(s"brand is $brand and top speed is $topSpeed")
//  canFly()
//
//  def canFly(): Unit =
//    if (topSpeed > 1000)
//      println("This car can fly")
//

//@main
//
//def initializationPractice():Unit = {
//  Laptop2("Windows")
//  Laptop2("Mac")
//  Laptop2("Linux")
//}
//
//class Laptop2(os: String){
//  println(s"os $os is initializing")
//}

//@main
//def initializationPractice(): Unit = {
//  webBrowser()
//}
//
//class
//webBrowser {
//  println(s"Web browser is connection")
//  println("https://www.google.com")
//}

//Scope and Access Modifiers

//Getters and Setters

//Allow us to change the way variables are assigned and retrieved

//Companion Object
//
//
//@main
//def companionObject(): Unit = {
//  Airplane.checkDescent(1000)
//  Airplane.checkDescent(100)
//  println()
//
//  val plane = Airplane()
//  plane.up()
//  plane.down()
//}
//
//class Airplane:
//
//  import Airplane.*
//
//  private val brand = "Airbus A380"
//  private var altitude = 1000
//
//  def up(): Unit =
//    altitude += 1000
//    println(s"$brand ascending to $altitude")
//
//  def down(): Unit =
//    if (checkDescent(altitude))
//      altitude -= 1000
//      println(s"$brand descending to $altitude")
//
//private object Airplane {
//  private def checkDescent(altitude: Int): Boolean = {
//    if (altitude <= 1000) {
//      println("Denied: you ae about to hit the ground")
//      false
//    } else {
//      println("Approved: You can descend")
//      true
//    }
//  }
//}

//@main
//def companionObject(): Unit = {
//  Airplane.checkDescent(1000)
//  Airplane.checkDescent(100)
//  println()
//
//  val plane = new Airplane()
//  plane.up()
//  plane.down()
//}
//
//class Airplane {
//
//  import Airplane.*
//
//  private val brand = "Airbus A380"
//  private var altitude = 1000
//
//  def up(): Unit = {
//    altitude += 1000
//    println(s"$brand ascending to $altitude")
//  }
//
//  def down(): Unit = {
//    if (checkDescent(altitude)) {
//      altitude -= 1000
//      println(s"$brand descending to $altitude")
//    }
//  }
//}
//
//object Airplane {
//  def apply(): Airplane = new Airplane()
//
//  def checkDescent(altitude: Int): Boolean = {
//    if (altitude <= 1000) {
//      println("Denied: you are about to hit the ground")
//      false
//    } else {
//      println("Approved: You can descend")
//      true
//    }
//  }
//}

//
//@main
//def companionObjectPractice():
//Unit = {
//  val correctKey = Lock.createKey()
//  val myLock=Lock(correctKey)
//  val randomKey= Lock.correctKey()
//  myLock.unlock(randomKey)
//}
//
//class Lock (key:Key):
//  private  val secretCode=generateSecret()
//    private def generateSecret()=Random.nextInt().toString
//  
//  
//def unlock(key: Key): Unit = {
//  if (key.getSecretCode == secretCode)
//    println("Lock is open")
//    else
//      println("Lock is closed")
//}
//  
//  class Key:
//    private var secretCode=""
//    def getSecretCode: String = secretCode
//    
//    def setSecretCode(secretCode:String): Unit =
//      if (this.secretCode == "")
//        this.secretCode= secretCode
//       
//    object Lock {
//      def createKey(): Key = Key()
//    }
//      


import scala.util.Random

@main
def companionObjectPractice(): Unit = {
  val correctKey = Lock.createKey()
  val myLock = new Lock(correctKey)
  val randomKey = Lock.createKey()
  myLock.unlock(randomKey)
}

class Lock(key: Key) {
  private val secretCode = generateSecret()
  key.setSecretCode(secretCode)

  private def generateSecret(): String = Random.nextInt().toString

  def unlock(key: Key): Unit = {
    if (key.getSecretCode == secretCode)
      println("Lock is open")
    else
      println("Lock is closed")
  }
}

class Key {
  private var secretCode = ""

  def getSecretCode: String = secretCode

  def setSecretCode(secretCode: String): Unit = {
    if (this.secretCode == "")
      this.secretCode = secretCode
  }
}

object Lock {
  def createKey(): Key = new Key()
}
