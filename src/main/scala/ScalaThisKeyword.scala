//The "this" keyword refers to parameters of the class

//@main
//def thisKeyword(): Unit = {
//  val postIt = PostItNote()
//  println(postIt.message)
//}
//
//class PostItNote {
//  var message: String = "No message"
//}
//
//def updateMessage(message:String): Unit = {
//
//}
//
//
//@main
//def thisKeyword(): Unit = {
//  val myBox =Box()
//
//  println(s"The box contains ${myBox.contents}")
//
//  myBox.updateContents("jewellery")
//
//  println(s"The box contains ${myBox.contents}")
//}
//
//class Box:
//  var contents:""
//
//  def updateContents(contents:String): Unit =
//    this.contents=contents
//
//@main
//def thisKeyword(): Unit = {
//  val myBox = new Box()
//
//  println(s"The box contains ${myBox.contents}")
//
//  myBox.updateContents("jewellery")
//
//  println(s"The box contains ${myBox.contents}")
//}
//
//class Box {
//  var contents: String = ""
//
//  def updateContents(contents: String): Unit = {
//    this.contents = contents
//  }
//}


@main
def thisKeywordChallenge(): Unit = {

  val myTable = new table()

 myTable.updateTable(50,300)

  myTable.printTable()

}

class table{
  var height=120
  var size=200

  def updateTable(size:Int,height:Int): Unit = {
this.size = size
    this.height = height
  }

  def printTable(): Unit ={
    println(s"The table has ${size} and ${height}")
  } 

}



