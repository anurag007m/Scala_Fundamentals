import scala.io.StdIn
// Exception handling
// Try catch block
//Finally block
//Throw exception

// What are exceptions?
// An exception is an event that occurs during the execution of a program that disrupts the normal flow of the program.
//The system cannot recover from an exception.

//Throw

//A way to generate own exception


//@main
//def exception ():Unit= {
//  val input = StdIn.readLine()
////  throw IllegalStateException("I don't want this input") //Throw exception
//  try {
//    val numbers = input.toInt
//  } catch{
//    case f: NumberFormatException=>{
//      println("Number format exception")
//      f.printStackTrace()
//    }
//    case e: Exception => {
//      println("Exception occurred")
//    }
//} finally {
//    println("Finally block executed")
//  }
//  println("Cont..")
//}

//@main
//def exception(): Unit = {
//  val input = StdIn.readLine()
//  try {
//    val numbers = input.toInt
//    val inMiles = numbers * 0.62
//    println(inMiles)
//}catch {
//    case e: NumberFormatException => {
//      println(s"Cannot read distance")
//      e.printStackTrace()
//    }
//  }
//}

@main
def exception(): Unit = {

  println("Enter product name you want to buy")

  val inputProductName = StdIn.readLine()

  println(s"Enter number of $inputProductName you want to buy")

  val inputNumberOfProducts = StdIn.readLine().toInt

  try {
    val productPrice = 9.99

    val totalPriceOfAllProduct = productPrice * inputNumberOfProducts

    println(s"Total price of $inputProductName is $totalPriceOfAllProduct")
  }catch{
    case e: NumberFormatException => {
      println(s"Invalid input")
    }
  } finally {
    println("Transaction completed")
  }

}







