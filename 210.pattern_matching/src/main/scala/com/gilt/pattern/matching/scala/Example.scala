package com.gilt.pattern.matching.scala

sealed trait Item {
  def price: Int
}

case class Book(price: Int) extends Item

case class Clothes(price: Int) extends Item

case class Food(price: Int) extends Item

case class ShoppingCart(items: Set[Item]) {
  lazy val computeTax = {
    items.map {
      case Book(price) => price * 0.05
      case Clothes(price) => price * 0.08
      case Food(price) => price * 0.09
    }.sum
  }
}

object ShoppingCart {
  def apply(items: Item*): ShoppingCart = new ShoppingCart(items.toSet)
}

object Example extends App {
  val cart = ShoppingCart(Book(10), Clothes(40), Food(12))
  println(s"tax = ${cart.computeTax}")
}
