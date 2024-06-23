import scala.io.StdIn
//@main
//
//def numBer(): Unit = {
//
//  var cost=29.99
//
//
//  println(cost/3)
//
//}

//@main
//def amount(): Unit = {
//  println("Enter a amount")
//  val input = StdIn.readLine()
//  val number = input.toInt
//
//
//  println(number*3)
//
//}
//
//@main
//
//def amounts (): Unit = {
//
//
//  println("Enter a amount")
//  val input = StdIn.readLine()
//  val number = input.toInt
//
//  val intrestRate = 5.5/100
//
//  val totalYear = 5
//
//  val totalIntrest = totalYear * intrestRate
//
//
//
//
//  val result = number+( number * totalIntrest)
//
//  println(result)
//
//
//
//}

//@main
//
//def amounts(): Unit = {
//  val bool = (true && false) || (false || true)
//  println(bool)
//}

@main

def amounts(): Unit = {
  val totalAnimal =3
  val animalProduceMilk = true
  val toatalChildern = 2
  val farmer =1
 val totalMember = toatalChildern +farmer

  val willRecieveFunding=  (totalAnimal<=5 && animalProduceMilk) && (totalMember>=3)


  println(willRecieveFunding)

}










