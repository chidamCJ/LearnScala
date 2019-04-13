package com.functions

object ImplicitParameters {
  
//  single implicit parameter processing 
  def foodBill1(amount : Int, flavour : String) (implicit discount : Double): Double = {
   val billAmount = amount - discount 
   billAmount
  }
  implicit val discount : Double = 10
  println(s"${discount * 1} %")
  
//  multiple implicit parameter processing
  def foodBill2(amount : Int, flavour : String)(implicit discForTax : Int, discForBillAmount : Long) : Double ={
    val billAmount = amount - discForTax - discForBillAmount
    billAmount
  }
  implicit val discForTax : Int = 33
  implicit val discForBillAmount : Long = 10
  
  def main(args: Array[String]): Unit = {
//    println(s"${foodBill1(100,"veg-food")}")
    println(foodBill1(100, "veg"))
//    println(foodBill2(100, "non-veg")(11,12))
    println(foodBill2(100, "non-veg"))
  }
}