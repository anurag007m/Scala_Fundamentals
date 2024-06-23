//tuple

//Tuple is immutable group of elements

//@main
//def tuples (): Unit = {
//
//  val conn = (1, 10.5)
//
//
//  println(conn._1)
//  println(conn.productArity)
//
//  println(conn.swap)
//
//}

@main

def tuple(): Unit = {
  val stores = (("DownTown", 10000), ("EastSide", 20000), ("WestSide", 30000))

  val totalRevenue = stores._1._2 + stores._2._2 + stores._3._2

  println(totalRevenue)

}

