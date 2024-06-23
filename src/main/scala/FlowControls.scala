//////Flow control
////
//////Helps in making decisions
////
//////Runs a part of code multiple times
////
//////stop execution of a part of code
////
//////Match conditional


@main
def FlowControls(): Unit = {
  // For loop
  println("For loop:")
  for (i <- 1 to 5) {
    println(s"Iteration $i")
  }

  // While loop
  println("\nWhile loop:")
  var count = 0
  while (count <= 5) {
    println(s"Count is $count")
    count += 1
  }

  // Do-while loop
  println("\nDo-while loop:")
  var number = 10
  while {
    println(s"Number is $number")
    number -= 1
    number > 0
  } do ()
}

