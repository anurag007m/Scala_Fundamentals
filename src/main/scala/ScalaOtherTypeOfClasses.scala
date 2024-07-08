import scala.collection.mutable.ArrayBuffer
import scala.util.Random
//Case classes

//Enum classes

//Sealed classes

//Nested classes

//Case classes
//Commonly create classes just for storing data
//
//@main
//
//def caseClasses(): Unit = {
//
//  val v1 = User("Alex","alex@gmail.com", "123456")
//  val r1 = regularUser("Alex","alex@gmail.com", "123456")
//  println(v1)
//  println(r1)
//}
//
//
//
//case class User(
//                 name: String,
//                 email: String,
//                 password: String
//               )
//
//class regularUser (
//                    name: String,
//                    email: String,
//                    password: String
//                  )

//Automatically generated case classes
//.toString()-> Prints out variable names and data
//.equals()-> Checks if 2 objects are equal
//.copy()-> Creates a copy with only some data changed


//Exercise
//
//@main
//def networkServer():Unit={
//    val articles = ArrayBuffer[blogArticle]()
//
//  articles.addOne(blogArticle("Title 1", "Content 1", "100"))
//  articles.addOne(blogArticle("Title 2", "Content 2", "200"))
//
//  val newArticles= ArrayBuffer[blogArticle]()
//    for(article<-articles)
//
//
//        val newArticle = article.copy(title = article.title + "for my blog")
//        newArticles.addOne(newArticle)
//
//          articles.addAll(newArticles)
//           articles.foreach(println)
//}
//
//case class blogArticle(
//  title: String,
//  content:String,
//  NumberOfReaders:String
//)
//
//def getRandomArticle: Any ={
//  Article(
//    s"Title ${Random.nextInt(1000)}",
//    s"Some content ${Random.nextInt(10)}",
//    Random.nextInt(10_000)
//  )
//}


//Enum Class

//Defines a collection of constants


//Sealed classes
//Can only be extended in same file

//abstract by default so cannot be instantiated

//Useful in match expressions
//import scala.util.Random
//
//@main
//def sealedClasses(): Unit = {
//  val somePlant = getPlant
//  somePlant match {
//    case _: Apple => println("Apple")
//    case _: Potato => println("Potato")
//    case _ => println("Unknown")
//  }
//}
//
//abstract class Plant
//
//sealed class Fruit extends Plant
//
//sealed class Vegetable extends Plant
//
//class Apple extends Fruit
//
//class Potato extends Vegetable
//
//def getPlant: Plant = {
//  if (Random.nextInt(100) % 2 == 0) new Apple() else new Potato()
//}

//Nested classes
//A nested class is a class that is defined inside another class




