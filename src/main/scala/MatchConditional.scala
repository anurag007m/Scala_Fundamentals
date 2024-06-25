import scala.io.StdIn
//Pattern Matching Conditional
//

//@main
//def PatternMatching ():Unit ={
//  println("Type an animal")
//  val input = StdIn.readLine()
//    var action = input match
//    case "dog" => "bark"
//    case "cat" => "meow"
//    case "cow" => "moo"
//    case _ => "unknown"
//
//    println(action)
//}




//Guards in Pattern Matching

//@main
//def patternMatching():Unit={
//  val meals = StdIn.readLine("How many meals do you have per day?").toInt
//
//  meals match
//    case x if 0 to 2 contains meals => println("eat more")
//
//    case 3 => println("Perfect")
//
//    case _ =>println("You should eat less")
//
//
//}

//@main
//def patternMatching(): Unit = {
//  println("Enter your name")
//  val name = StdIn.readLine().toUpperCase()
//
//  name(0) match
//    case 'A' | 'B' | 'C' => println(s"Hello $name")
//
//    case x if 'D' to 'H' contains name(0) => println(s"Hi $name")
//
//    case _ => println("Namaste")
//
//}



