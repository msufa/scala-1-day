package solution;

import collection.immutable._
import scala.collection.mutable.ListBuffer

object Garage {
  val vehicles = new ListBuffer[Vehicle]()

  def addVehicle(vehicle: Vehicle) =  { vehicles += vehicle; this }
  def removeVehicle(vehicle: Vehicle) = { vehicles -= vehicle; this }
  def getVehicles() : List[Vehicle] = vehicles.toList
}

case class Vehicle(make: String, wheelCount : Int)
class Car(make: String) extends Vehicle(make, 4) 
class Truck(make: String) extends Vehicle(make, 18) 

trait Convertible {
  def openTop() { println("Top is open") }
  def closeTop() { println("Top is closed") }
}

class SportsCar(make: String) extends Vehicle(make, 4) with Convertible

object ClassesTraitsObjects {
  def main(args: Array[String]): Unit = {
    val garage = Garage
    garage.addVehicle(new Car("BMW"))
    garage.addVehicle(new SportsCar("Maserati"))
    garage.addVehicle(new Truck("Scania"))

    garage.getVehicles foreach {
      v => println("This vehicle is a " + v.make + " and has " + v.wheelCount + " wheels");

      v match {
        case c:Convertible => {
                  println("Oooh, this vehicle is a convertible. Let's play with the top!")
                  c.openTop()
                  c.closeTop()
        }
        case _ =>
      }
    }
  }
}
