import scala.io.StdIn
//@main
//def moreIfStatement():Unit ={
//  val medStore = List("med1", "med2", "med3")
//  val hasMed = true
//  if (medStore.contains("med1"))
//    if(hasMed)
//      println("med1 is in the store")
//    else
//      println("Buy med1")
//      else
//    println("Ask medStore to add med1")
//}

//@main
//def moreIfStatement(): Unit = {
//
//  val isKeyPresent = StdIn.readLine(s"Do you have the car key: " )
//
//  if (isKeyPresent == "yes" ) {
//    println("You have the key car will start")
//  } else{
//      println("You don't have the key car can't start")
//    }
//}

//import scala.io.StdIn
//
//@main
//def moreIfStatement(): Unit = {
//  val isKeyPresent = StdIn.readLine("Do you have the car key: ")
//  try {
//    if (isKeyPresent.toLowerCase == "yes") {
//      println("You have the key, car will start")
//    } else if (isKeyPresent.toLowerCase == "no") {
//      println("You don't have the key, car can't start")
//    } else {
//      throw new IllegalArgumentException("Invalid input. Please enter 'yes' or 'no'.")
//    }
//  } catch {
//    case e: IllegalArgumentException =>
//      println(e.getMessage)
//  }
//}

//@main
//def moreIfStatement(): Unit = {
//  val enterTime = StdIn.readLine("Enter time: ")
//  try {
//    if (enterTime.toInt < 12) {
//      println(s"Time is $enterTime AM")
//    } else if (enterTime.toInt > 12) {
//      println(s"Time is $enterTime PM")
//    } else if (enterTime.toInt == 12) {
//      println(s"Time is $enterTime PM")
//    } else if (enterTime.toInt == 24) {
//      println(s"Time is $enterTime AM")
//    }
//
//  } catch
//    case e: NumberFormatException =>
//      println(s"Cannot read that time")
//      e.printStackTrace()
//
//}


//@main
//def moreIfStatement(): Unit = {
//
//  var hasEggs = false
//  var hasBacon = false
//
//  val oneEggPrice = 5
//  val onePacketBacon = 20
//  var totalPrice = 0
//
//  val inputEggs = StdIn.readLine("Do store has eggs yes/no : ")
//  if (inputEggs == "yes")
//    hasEggs = true
//
//    println("Buy 12 eggs")
//
//    val inputBacon = StdIn.readLine("Do store has bacon yes/no : ")
//    if (inputBacon == "yes")
//      hasBacon = true
//
//      println("Buy two packet bacon")
//
//
//
//  if (hasEggs)
//    totalPrice += 12 * oneEggPrice
//
//    if (hasBacon)
//      totalPrice += onePacketBacon * 2
//    else
//    println("No bacon available")
//
//  else
//  println("No eggs available")
//
//  println(s"Total price is $totalPrice")
//
//}
//
//
//@main
//def moreIfStatement(): Unit = {
//  var totalPoints = 100
//  val inputPoints = StdIn.readLine("Enter points 1 to 100: ").toInt
//
//  if (inputPoints > 100) {
//    println("You have entered invalid points")
//  }
//
//  if(inputPoints <= 100 && inputPoints >= 90) {
//    println("You have a A grade")
//  }else if (inputPoints <= 89 && inputPoints >= 80) {
//    println("You have a B grade")
//  }else if (inputPoints <= 79 && inputPoints >= 70) {
//
//    println("You have a C grade")
//  }else if (inputPoints <= 69 && inputPoints >= 60) {
//    println("You have a D grade")
//  }else if (inputPoints <= 59 && inputPoints >= 50) {
//    println("You have a E grade")
//  }else if (inputPoints <= 49 && inputPoints >= 0) {
//    println("You have a F grade")
//  }
//}



