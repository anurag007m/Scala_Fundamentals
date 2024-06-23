import scala.collection.mutable.ArrayBuffer
//List can contain any type of data

//Set is a collection of unique elements

//Map is a collection of key value pairs

//Tuple is immutable

//Tuple can contain any type of data
//
//@main
//def list(): Unit = {
//  val list = List(1, 2, 3, 4, 5)
//  println(list.head)
//  println(list.tail)
//  println(list.tail.head)
//}

//Array and Array Buffer

//Array is a collection of elements of same type
// Array is mutable

//@main
//def array(): Unit = {
//  val array = Array(1, 2, 3, 4, true,"Arr")
//
//  println(array.toList)
//  println(array.mkString)
//
////
// val array2 = 0 +: array :+5
//  println(array2.toList)
//
//}


/**
 * Demonstrates the use of a List to store and access online medical store names.
 */

//@main
//  def medStore (): Unit = {
//
//  val onlineMedStore = List("FirstMedix", "EasyPharma", "1mg")
//
//  println(onlineMedStore)
//  println(onlineMedStore(1))
//
//}


//@main
//def list(): Unit = {
//  val items = ArrayBuffer("laptop","mouse","pen","paper","mug","phone" )
//
//  val removeItems = ArrayBuffer("pen","paper","mug","phone")
//
//  val remainingItems = items.diff(removeItems)
//
//   items --= removeItems
//
//  println(items)
//
//  println(remainingItems)
//
//}

//@main
//
//def list(): Unit = {
//  val winners = List("John", "Jane", "Jack", "Jill", "Joseph")
//
//  val JackIndex = winners.indexOf("Jack")+1
//
//  println(JackIndex)
//
//}

@main

def animals():Unit={
  val animals = ArrayBuffer("lion", "zebra", "chimp", "elephant")

  val animalsListWithPanda = animals.appended("panda")


  println(animalsListWithPanda)


  val animalsListWithoutLion = animalsListWithPanda.remove(animals.indexOf("lion"))

  println(animalsListWithoutLion)


  val ElephantAndGiraffesCheck = animalsListWithoutLion.contains("elephant","giraffe")

  println(ElephantAndGiraffesCheck)

}





