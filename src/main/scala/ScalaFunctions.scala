import scala.io.StdIn
//@main
//def fun():Unit = {
//  for(i<-1 to 10){
//    println("Hello")
//  }
//}
//def printFun ():Unit = {
//println(fun())
//}

//@main
//
//def printFun(): Unit = {
//  for(i <- 1 to 3 )
//    fun()
//}
//
//def fun(): Unit = {
//  println("Enter a number")
//  val input = StdIn.readLine()
//  val number = input.toInt
//  println(s"$number*17 = ${number*17}")
//}


//@main
//def fun(): Unit = {
//  printFun()
//}
//
//def printFun(): Unit = {
//  println("Enter User name")
//  val input = StdIn.readLine().toString
//  println("Enter DOB:")
//  val dob = StdIn.readLine().toInt
//  println(s"Hello $input, your age is ${2024-dob}")
//}

//Function Parameters(arguments)

//@main
//def fun(): Unit = {
////  printFun(2,5)
////printProducts()
//}


//def printFun(num1:Int,num2:Int): Unit = {
//  var i = 0
//  for(i <- 1 to 3 ) {
//    var sum = num1 + num2
//    println(s"The sum is $sum")
//  }
//}

//def printProducts(): Unit =
//{
//  val products = Map ("Shoes"-> 9.99, "Socks" -> 5.99, "Jeans" -> 39.99)
//
//  val tax = 20.0 / 100
//
//  val input = StdIn.readLine("Enter product name: ")
//
//
//  input match {
//    case "Shoes" => println(s"The price of $input is ${products(input) + (products(input) * tax)}")
//
//    case "Socks" => println(s"The price of $input is ${products(input) + (products(input) * tax)}")
//
//    case "Jeans" => println(s"The price of $input is ${products(input) + (products(input) * tax)}")
//
//    case _ => println("Invalid product")
//
//  }
//
//}

@main
def funChallenge(): Unit = {
println("Enter animal name")
  val animal = StdIn.readLine()
  val lifespan = getLifeSpan(animal)
  println(s"The life span of $animal is $lifespan")
}

def getLifeSpan(name:String): Int = name match
    case "cat" => 15
    case "dog" => 10
    case "rabbit" => 1
    case _ => 20

