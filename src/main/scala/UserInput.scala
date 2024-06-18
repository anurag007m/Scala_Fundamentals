import scala.io.StdIn
//import scala.util.Random
//
//@main
//def userInput():Unit ={
//println("Type something")
//  val input = StdIn.readLine()
//  println(input)
//
//  //toInt
//
//  val number = input.toInt
//  println(number*2)

// println(Random.nextInt(1000))
//
//}
//
//@main def userInput():Unit={
// println("Number")
// val number = StdIn.readLine().toInt
// println(s"$number * 5 = ${number*5}")
//}

//Age calc

@main

def calculator():Unit={

 println("Enter Your birth year")

 val yearOfBirth = StdIn.readLine().toInt

 val currentYear = 2024
 
 val finalAge = currentYear-yearOfBirth

 println(s"Your Age = $finalAge")

}



