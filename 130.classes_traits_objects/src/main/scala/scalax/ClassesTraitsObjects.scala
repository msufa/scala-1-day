package scalax

import scala.collection.mutable.ListBuffer

object Make extends Enumeration {
  type Make = Value
  val BMW, Ford, Porsche, Toyota = Value
}

import Make._

object Garage {
  val vehicles = new ListBuffer[Vehicle]()

   /* ??? */
}

<<<<<<< HEAD
class Vehicle /* ??? */
=======
class Vehicle(make: Make, wheelCount: Int) /* ??? */
>>>>>>> f2e2e02... Reworked 130

class Truck /* ??? */

trait Convertible {
  ???
}

class SportsCar(make: Make) extends Vehicle(make, 4) with Convertible {
  ???
}

object SportsCar {
  ???
}

object ClassesTraitsObjects extends App {
<<<<<<< HEAD
  Garage.addVehicle(new SportsCar(Porsche))
  Garage.addVehicle(SportsCar("BMW"))
  Garage.addVehicle(new Truck(Ford))
  Garage.addVehicle(new Truck(Toyota))

  Garage.getVehicles.foreach { v =>
    println("This vehicle is a " + v.make + " and has " + v.wheelCount + " wheels")
    v match {
      case c: Convertible => {
        println("Oooh, this vehicle is a convertible. Let's play with the top!")
        c.openTop
        c.openTop
        c.closeTop
        c.closeTop
      }
      case _ => println("Not a convertible")
    }
  }
=======
//  Garage.addVehicle(new SportsCar(Porsche))
//  Garage.addVehicle(SportsCar("BMW"))
//  Garage.addVehicle(new Truck(Ford))
//  Garage.addVehicle(new Truck(Toyota))

//  Garage.getVehicles.foreach { v =>
//    println("This vehicle is a " + v.make + " and has " + v.wheelCount + " wheels")
//    v match {
//      case c: Convertible => {
//        println("Oooh, this vehicle is a convertible. Let's play with the top!")
//        c.openTop
//        c.openTop
//        c.closeTop
//        c.closeTop
//      }
//      case _ => println("Not a convertible")
//    }
//  }
>>>>>>> f2e2e02... Reworked 130
}
