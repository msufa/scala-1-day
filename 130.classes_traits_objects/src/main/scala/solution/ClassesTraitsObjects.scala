package solution

import scala.collection.mutable.ListBuffer

object Garage {
  val vehicles = new ListBuffer[Vehicle]()

  def addVehicle(vehicle: Vehicle): Unit = vehicles += vehicle
  def removeVehicle(vehicle: Vehicle): Unit = vehicles -= vehicle
  def getVehicles: List[Vehicle] = vehicles.toList
}

case class Vehicle(make: String, wheelCount : Int)
class Car(make: String) extends Vehicle(make, 4)
class Truck(make: String) extends Vehicle(make, 18)

trait Convertible {
  def openTop: Unit = println("Top is open")
  def closeTop: Unit = println("Top is closed")
}

class SportsCar(make: String) extends Vehicle(make, 4) with Convertible

object ClassesTraitsObjects extends App {
  val garage = Garage
  garage.addVehicle(new Car("BMW"))
  garage.addVehicle(new SportsCar("Maserati"))
  garage.addVehicle(new Truck("Scania"))

  garage.getVehicles.foreach(v => {
    println("This vehicle is a " + v.make + " and has " + v.wheelCount + " wheels")
    v match {
      case c: Convertible => {
        println("Oooh, this vehicle is a convertible. Let's play with the top!")
        c.openTop
        c.closeTop
      }
      case _ => println("Not a convertible")
    }}
  )
}
