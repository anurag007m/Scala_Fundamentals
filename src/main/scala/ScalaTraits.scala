//Trait
//A trait is a definition of a part of a class.
//
//@main
//def traitsImplementation():Unit={
//  val myOven: Oven = getOven
//  myOven.turnOn()
//  myOven.cook(180)
//  myOven.turnOff()
//}
//
//trait Oven{
//  val temperature:Int
//  def turnOn():Unit
//  def turnOff():Unit
//  def cook(temp:Int): Unit =println(s"Cooking at $temp degrees")
//}
//  class LGOven extends Oven {
//    val temperature: Int = 180
//
//    def turnOn(): Unit = println("Oven is on")
//
//    def turnOff(): Unit = println("Oven is off")
//  }
//
//def getOven:Oven = new LGOven()

//@main
//def traitPractice():Unit = {
//  
//}
//
//trait Restaurant:
//  def provideFood():Unit
//  def provideBill():Unit
//  
//class LocalRestaurant extends Restaurant
//:
//  override def provideFood(): Unit = println("Your local restaurant is providing food")
//  
//  override def provideBill(): Unit = println("Your local restaurant is providing bill")
//  
//  class FancyRestaurant extends Restaurant
//  
//  override def provideFood():Unit = println("Your fancy restaurant is providing food")
//  
//  override def provideBill(): Unit = println("Your fancy restaurant is providing bill")
//  
//  
//
//@main
//def traitPractice(): Unit = {
//  val localRestaurant = new LocalRestaurant()
//  localRestaurant.provideFood()
//  localRestaurant.provideBill()
//
//  val fancyRestaurant = new FancyRestaurant()
//  fancyRestaurant.provideFood()
//  fancyRestaurant.provideBill()
//}
//
//trait Restaurant {
//  def provideFood(): Unit
//  def provideBill(): Unit
//}
//
//class LocalRestaurant extends Restaurant {
//  override def provideFood(): Unit = println("Your local restaurant is providing food")
//
//  override def provideBill(): Unit = println("Your local restaurant is providing bill")
//}
//
//class FancyRestaurant extends Restaurant {
//  override def provideFood(): Unit = println("Your fancy restaurant is providing food")
//
//  override def provideBill(): Unit = println("Your fancy restaurant is providing bill")
//}


//@main
//def traitsPractice(): Unit = {
//  
//  val myCar:Car7=CarFactory.provideCar()
//  
//  myCar.drive()
//  myCar.park()
//  
//}
//
//trait Car7:
//  val speed:Int
//  def drive(): Unit
//  def park():Unit
//  
//  def stop(): Unit = println("Stopping")
//  
//class BMW extends Car7:
//
//  override val speed: Int = 200
//
//  override def drive(): Unit = println("Driving at 200 kph")
//
//  override def park(): Unit = println("Parking")
//
//object CarFactory:
//  def provideCar()= new BMW()


//Extending multiple traits

//@main
//def traitMore(): Unit = {
//  val myCouch = couch()
//  myCouch.sit()
//  myCouch.sleep()
//}
//
//trait PlaceToSit {
//  def sit(): Unit
//}
//  trait PlaceToSleep {
//    def sleep(): Unit
//  }
//
//class couch extends PlaceToSit, PlaceToSleep {
//  override def sit(): Unit = println("Sit on the couch and watch some TV")
//
//  override def sleep(): Unit = println("Sleep on the couch")
//}



