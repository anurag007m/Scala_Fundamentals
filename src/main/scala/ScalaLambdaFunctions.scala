import scala.util.Random
//What are scala lambda functions

//A lambda function is an anonymous function that has no name.

//Normal function
//@main
//def printMessage(name:String):Unit={
//  println(s"Hello $name")
//}

//Lambda function
//def lambdaFunction():Unit={
//val myLambdaFun=(names:String)=> println(s"Hello $names")
//  myLambdaFun("Anurag")
//}

//Higher order function

//A HOF is a that takes another function as a parameter.


//@main
//def highOrderFunction(): Unit = {
//  val name = List("Mary", "John", "Bob")
//  val myLambda = (names: String) => println(s"Hello $names")
//  sayHello(name, myLambda)
//}
//
//def sayHello(names: List[String], doSomething: String => Unit):Unit={
//  for (name <- names) {
//    doSomething(name)
//  }
//}

//@main
//def lambdaPractice (): Unit = {
//
//  val numbers = Array[Double](2,8, 3, 5, 1, 4, 9, 6, 7)
//
// println(numbers.toList)
//  val newNumbers = update(numbers,(number:Double)=>number/10)
//  println(newNumbers.toList)
//}
//
//def update(numbers:Array[Double],lbd:Double=> Double): Array[Double] = {
//  for(i <- numbers.indices)
//    if (numbers(i) % 2 == 0)
//      numbers(i) = lbd(numbers(i))
//  numbers
//}




//@main
//def commonHighOrderFunctionsPractice(): Unit = {
//
//  val numbers = (1 to 20).map(_ =>Random.nextInt(200))
//
//  println(numbers)
//
//  println(numbers.filter(_.toString.length == 2))
//
//  println(numbers.filter(nb=>9 < nb && nb < 100))
//
//}


