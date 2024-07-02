import scala.io.StdIn
//Function Overloading

//Function overloading in Scala is a feature that allows you to define multiple functions with the same name but different parameter lists (either different number of parameters or different types of parameters).

//@main
//def functionOverloading():Unit = {
//  println(multiply(3))
//  println(multiply(4,5))
//}
//
//def multiply(number:Int): Int =number * 2
//
//def multiply(number:Int,multiplier:Int): Int = number * multiplier

//@main
//def functionOverloading ():Unit = {
//
////  sayHello("Alex")
////
////  sayHello(List("Alex", "Bob", "Cathy"))
//
//animals("cat")
//
// animals(Set("dog", "cat", "mouse"))
//
//}


//def sayHello(person:String): Unit = println(s"Hi $person")
//
//def sayHello(people:Iterable[String]):Unit = {
//    for(person<-people){
//      println(s"Hi $person")
//    }
//}

//def animals(animal: String): Unit = println(s"I like $animal")
//
//def animals(listOfAnimals:Iterable[String]): Unit
//=
//for (animal <- listOfAnimals) {
// animals(animal)
//}


//@main
//def printFun(): Unit = {
//  lengthFun("Hello")
//  lengthFun(5)
//}
//def lengthFun(message: String): Unit =
//  println(s"$message length is ${message.length}")
//def lengthFun (number: Int): Unit = {
//  var message =""
//  for (i <- 1 to number)
//    message += "a"
//  println(message)
//}
//
//@main
//def printFun(): Unit = {
//
// productInfo("milk", 2.5)
//
//  val products = Map("milk" -> 2.5, "eggs" -> 1.5, "bread" -> 3.0)
//  productInfo(products)
//
//}
//
//def productInfo(name: String, price: Double): Unit =
//  println(s"Product name: $name cost ${price * 1.2}")
//
//def productInfo(products:Map[String,Double]): Unit =
//    for (product <- products.keys)
//      productInfo(product, products(product))
//


//
//@main
//def main():Unit={
//
//  val parakeets = 5
//  buyMoreParakeets(parakeets)
//  println(s"You now have $parakeets parakeets")
//}
//
//def buyMoreParakeets(parakeets: Int):Unit =
//  val parakeets = 3


//SPLAT operator
//
//
//
//@main
//
//
//  def repeatedFunctions(): Unit = {
//  printHello(3, "Alex", "Bob", "Cathy")
//}
//
//def printHello(count:Int,names:String*): Unit = {
//for(name <- names) {
//  for(i <- 1 to count) {
//    println(s"Hello $name")
//  }
//  println()
//}
//}


//Local Functions

//A local function is a function defined inside another function.


//@main
//def mapUsersBankBalance(): Unit = {
//  val users = Map("Alex" -> 23, "Bob" -> 34, "Cathy" -> 45)
//
//  def doubleBalance(balance: Int): Int = {
//    balance * 2
//  }
//
//  for ((user, balance) <- users) {
//    val doubledBalance = doubleBalance(balance)
//
//    println(s"$user's balance is $doubledBalance")
//  }
//}


@main

def userName(): Unit = {
  printGreeting()
}

def printGreeting(): Unit = {

  def sayHi(name:String): Unit = println(s"Hi $name how are you")

  var currentName = "abc"
  while (!currentName.isEmpty)
    println(s"Enter your name")
    currentName = StdIn.readLine()

    if (currentName.isEmpty)
      println("Finished execution")
      else{
        sayHi(currentName)
      }
}



