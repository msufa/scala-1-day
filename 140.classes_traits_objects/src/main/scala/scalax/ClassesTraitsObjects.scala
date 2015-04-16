package scalax

import scala.collection.mutable.ListBuffer

object Make extends Enumeration {
  type Make = Value
  val BMW, Ford, Porsche, Toyota = Value
}

import Make._

object Garage {
  val vehicles = new ListBuffer[Vehicle]()

  def addVehicle(vehicle: Vehicle) = vehicles.append(vehicle)
  def getVehicles() = vehicles
}

class Vehicle(val make: Make, val wheelCount: Int)

class Truck(make: Make) extends Vehicle(make, 18)

class Car(make: Make) extends Vehicle(make, 4)

trait Convertible {
  def openTop()
  def closeTop()
}

class SportsCar(make: Make) extends Car(make) with Convertible {
  private var topOpen = false

  override def openTop() = {
    if (topOpen) println("Top is open")
    else {
      println("Opening top")
      topOpen = true
    }
  }

  override def closeTop() = {
    if (topOpen) {
      println("Closing top")
      topOpen = false
    }
    else println("Top is closed")
  }
}

object SportsCar {
  def apply(makeStr: String): SportsCar = {
    val make = Make.withName(makeStr)
    new SportsCar(make)
  }
}

object ClassesTraitsObjects extends App {
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
}
