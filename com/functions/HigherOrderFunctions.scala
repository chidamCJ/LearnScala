package com.functions

object HigherOrderFunctions {
  
  def passingFunctionsAsAParameter(amount : Double)(quantity : Int)(pass : Double => Double) :Double ={
    val total = amount*quantity
    pass(total)
  }
  
  
  val totalCost = passingFunctionsAsAParameter(33)(3){cost=>
    val disc=5
    cost- disc
    }
  
  println(s"$totalCost")
  def main(args: Array[String]): Unit = {
    
  }
  
}