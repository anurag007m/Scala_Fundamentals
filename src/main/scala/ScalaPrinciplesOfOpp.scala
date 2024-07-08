//The 4 principles

//Inheritance
//Encapsulation
//Abstraction
//Polymorphism

//A set of guidelines that make a language object-oriented

//Help developers write clean,maintainable and reusable code

//Help guide how a program is divided into components

//Inheritance
//Classes can inherit methods and parameters from other classes

//Encapsulation

//Hiding data and inner workings of a class from other classes that don't need to know how something is done

//Abstraction
//A common feature of 2 classes should be abstracted in a third class

//Polymorphism
//Same name many forms


//Inheritance
//Classes can inherit methods and parameters from other classes

//to make a class inherit from another class, use the open keyword

//Example
//
//@main
//def principlesInheritance(): Unit = {
//  val carol = Daughter("english")
//  println(carol.hairColor)
//  println(carol.eyeColor)
//  carol.say("Hi")
//}
//
//open class Mom(nativeTongue: String):
//  val hairColor = "Brown"
//  val eyeColor = "blue"
//  def say(message: String): Unit = println(s"Mom says: $message in $nativeTongue")
//
//class Daughter(nativeTongue: String) extends Mom(nativeTongue)
//
//
//

//Inheritance exercise
//
//@main
//def principalInheritancePractice(): Unit = {
//  val myParakeet = Parakeet()
//  myParakeet.fly()
//}
//
//open class Bird:
//  def color = "grey"
//  def speed = 50
//  def fly(): Unit = println(s"A $color bird can fly up to $speed kph")
//
//class Parakeet extends Bird
//  :
//  override def speed = 200
//
//  override def color = "white"
//
//  override def fly(): Unit =
//    super.fly()
//    println(s"A ${super.color} parakeet can fly up to ${super.speed} kph")
//
//@main
//def principlesInheritanceChallenge(): Unit = {
//  val me = Son()
//  me.printName()
//}
//
//open class Father:
//  def firstName = "John"
//  val lastName="Smith"
//
//  def printName(): Unit= println(s"My name is $firstName $lastName")
//
//class Son extends Father
//:
//  override def firstName = "Anurag"
//
//  override def printName():Unit=super.printName()
//  println(s"My name is ${super.firstName} $lastName")

//

//Encapsulation

//Hiding data and inner workings of a class from other classes that don't need to know how something is done
//
//@main
//def principalsEncapsulation(): Unit = {
//  val plane = Airplane3()
//  plane.fly()
//}
//
//open class Airplane3
//  :
//  protected var name = "Boeing"
//  private def runEngines(): Unit = println("Turn on engines")
//  def fly(): Unit =
//  runEngines()
//  println(s"$name flying")

//
//@main
//def principlesEncapsulationPractice():Unit = {
//
//  val myLock = EncryptionLock(40)
//
//  println(s"Does the key unlock my lock? ${myLock.unlock(100)}")
//  println(s"Does the key unlock my lock? ${myLock.unlock(70)}")
//
//  println(s"Does the key unlock my lock? ${myLock.unlock(20)}")
//
//}
//
//class EncryptionLock(private val privateKey: Int) {
//  private def formula(publicKey: Int) = publicKey /  2*5
//
//  def unlock(publicKey:Int): Any =formula(publicKey)==privateKey
//
//
//}

//@main
//def principlesEncapsulationChallenege(): Unit = {
//
// val myRestaurant = Franchise()
//  myRestaurant.prepareBurgers()
//
//}
//
//open class OriginalRestaurant:
// protected def applyFormula(): Unit = println(("Prepare burgers with love and care"))
//
// class Franchise extends OriginalRestaurant:
//
//  def prepareBurgers(): Unit = println("Prepare burgers according to secret formula")
//
// applyFormula()

//@main
//def principlesEncapsulationChallenge(): Unit = {
//  val myRestaurant = new Franchise()
//  myRestaurant.prepareBurgers()
//}
//
//open class OriginalRestaurant:
//  protected def applyFormula(): Unit = println("Prepare burgers with love and care")
//
//class Franchise extends OriginalRestaurant:
//  def prepareBurgers(): Unit = {
//    println("Prepare burgers according to secret formula")
//    applyFormula()
//  }

//Abstraction

//Reduces code duplication

//
//@main
//def principlesAbstractionPractice():Unit = {
//  val pug =Pug()
//  pug.bark()
//  pug.run()
//  pug.play()
//
//  val corgi = Corgi()
//  corgi.bark()
//  corgi.run()
//  corgi.play()
//}
//
//abstract class Dog(val name:String):
//  def run(): Unit = println(s"A $name can run")
//
//  def bark(): Unit = println(s"A $name can bark")
//
//  def play(): Unit = println(s"A $name can play")
//
//class Pug extends Dog("pug"):
//  override def bark(): Unit = println(s"A $name cannot bark")
//
//class Corgi extends Dog("corgi")
//  :
//  override def run(): Unit = println(s"A $name cannot run")

//
//@main
//def principlesAbstractionPractice(): Unit = {
//  val pug = new Pug()
//  pug.bark()
//  pug.run()
//  pug.play()
//
//  val corgi = new Corgi()
//  corgi.bark()
//  corgi.run()
//  corgi.play()
//}
//
//
//
//abstract class Dog(val name: String) {
//  def run(): Unit = println(s"A $name can run")
//
//  def bark(): Unit = println(s"A $name can bark")
//
//  def play(): Unit = println(s"A $name can play")
//}
//
//class Pug extends Dog("pug") {
//  override def bark(): Unit = println(s"A $name cannot bark")
//}
//
//class Corgi extends Dog("corgi") {
//  override def run(): Unit = println(s"A $name cannot run")
//}

//Polymorphism

//A method / function can do different things in different situations

//2 types

//1. Dynamic
//2. Static

//Final classes cannot be extended
//
//@main
//def principlesPolymorphismPractice(): Unit = {
//  val translator =  Translator()
//  translator.sayHello("Hindi")
//  translator.sayHello("German")
//  translator.sayHello("spanish")
//}
//
//class Translator:
//  def sayHello(language:String): Unit =
//    language match {
//      case "Hindi" => println("Namaste")
//      case "German" => println("Hallo")
//      
//      
//      case _ => println("Hello")
//    }

