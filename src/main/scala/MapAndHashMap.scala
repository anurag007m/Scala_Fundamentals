

import scala.collection.mutable
// Map is a collection of key value pairs

//@main

//def map(): Unit = {
//
//val count = Map (1 -> "one", 2 -> "two", 3 -> "three")
//println(count)
//}


//HashMap is a mutable map


//Map Function

//@main
//def mapFunction(): Unit = {
//  val count = Map(1 -> "one", 2 -> "two", 3 -> "three")
//  println(count.size)
//  println(count.contains(3))
//  println(count.contains(5))
//
//  println(count.head)
//  println(count.tail)
//
//}

//@main
//
//def mapFunction(): Unit = {
//  val count = mutable.HashMap(1 -> "un", 2 -> "deux", 3 -> "trois")
//
//    count += 4 -> "quatre"
//
//
//
//  println(count)
//}

@main

def mapFunction(): Unit = {
  val attendance = mutable.HashMap("23/09"->3726,"24/09"->4735, "25/09" -> 2000)
  attendance += "26/09" -> 3000

  val totalAttendees = attendance("25/09") + attendance("26/09")


  println(totalAttendees)

  val dataCheck= attendance.contains("22/09")


  println(dataCheck)


}


