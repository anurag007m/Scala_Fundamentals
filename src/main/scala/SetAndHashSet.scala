import scala.collection.mutable
// Set in Scala

//Set is a collection of unique elements in an undefined order.

// Set are immutable

//HashSet is a mutable set

//@main
//
//def hashSet():Unit ={
//  val hashSet = mutable.HashSet("John", "Jane", "Bob", "Jim")
//  hashSet += "Robin"
//  println(hashSet)
//  hashSet -= "Bob"
//  println(hashSet)
//}

@main
def set(): Unit = {
  val acceptedColors = mutable.HashSet("white", "black", "gray")

  val myColors = Set("red", "green", "blue","black")

  val colorsIcanWear = myColors.intersect(acceptedColors)

  println(colorsIcanWear)

  val colorsIcanNotWear = myColors.diff(acceptedColors)

  println(colorsIcanNotWear)

  acceptedColors += "red"

  println(acceptedColors)

}




