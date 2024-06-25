//import scala.io.StdIn
//import scala.io.StdIn
//
//@main
//
//def moreIfStatement(): Unit = {
//  var enterAge = StdIn.readLine("Enter age: ").toInt
//
//  if (enterAge <= 0) {
//   enterAge +=1
//    println(s"You are $enterAge years old")
//  }
//
//  if (enterAge <= 13) {
//    println("You are a child")
//  }else if (enterAge <= 18 && enterAge >= 13) {
//    println("You are a teenager")
//  }else{
//    println("You are an adult")
//  }
//}

//Ranges

//@main
//def range(): Unit = {
//  val range = 1 to 1000 by 17
//  println(range.toList)
//  println(range.length)
//
//}

//@main
//def range (): Unit = {
//  var inputMedsNum = StdIn.readLine("Enter number of meds: ")
//  var medsNum = inputMedsNum.toInt
//  if (1 to 3 contains(medsNum)) {
//    println("few meds")
//  }
//  else if (4 to 6 contains(medsNum)) {
//    println("several meds")
//  }
//  else if (medsNum >= 7) {
//    println("many meds")
//  }
//  else {
//    println("invalid number of meds")
//  }
//}

//@main
//def range(): Unit = {
//
//  var inputNum = StdIn.readLine("Enter number between 1 to 12: ")
//
//  var num= inputNum.toInt
//
//  val jan = 1 to 31 by 3
//  val feb = 1 to 28 by 3
//  val mar = 1 to 31 by 3
//  val apr = 1 to 30 by 3
//  val may = 1 to 31 by 3
//  val jun = 1 to 30 by 3
//  val jul = 1 to 31 by 3
//  val aug = 1 to 31 by 3
//  val sep = 1 to 30 by 3
//  val oct = 1 to 31 by 3
//  val nov = 1 to 30 by 3
//  val dec = 1 to 31 by 3
//
//
//  if (num==1) {
//    println(s"No of days plant need to watered is ${jan.toList}")
//  }else if (num == 2) {
//    println(s"No of days plant need to watered is ${feb.toList}")
//  }else if (num == 3) {
//    println(s"No of days plant need to watered is ${mar.toList}")
//  }else if (num == 4) {
//    println(s"No of days plant need to watered is ${apr.toList}")
//  } else if (num == 5) {
//    println(s"No of days plant need to watered is ${may.toList}")
//  } else if (num == 6) {
//    println(s"No of days plant need to watered is ${jun.toList}")
//  } else if (num == 7) {
//    println(s"No of days plant need to watered is ${jul.toList}")
//  }else if (num == 8) {
//    println(s"No of days plant need to watered is ${aug.toList}")
//  }else if (num == 9) {
//    println(s"No of days plant need to watered is ${sep.toList}")
//  }else if (num == 10) {
//    println(s"No of days plant need to watered is ${oct.toList}")
//  }else if (num == 11) {
//    println(s"No of days plant need to watered is ${nov.toList}")
//  }else if (num == 12) {
//    println(s"No of days plant need to watered is ${dec.toList}")
//  }else {
//    println("invalid number")
//  }


//}