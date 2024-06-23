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

@main
def moreIfStatement(): Unit = {
  val enterTime = StdIn.readLine("Enter time: ")
  try {
    if (enterTime.toInt < 12) {
      println(s"Time is $enterTime AM")
    } else if (enterTime.toInt > 12) {
      println(s"Time is $enterTime PM")
    } else if (enterTime.toInt == 12) {
      println(s"Time is $enterTime PM")
    } else if (enterTime.toInt == 24) {
      println(s"Time is $enterTime AM")
    }

  } catch
    case e: NumberFormatException => {
      println(s"Cannot read that time")
      e.printStackTrace()
    }
}

