package com.functions

object FunctionsWithParameters {
  
  def calculatePrice(price : Int , taxes : Double) : Any ={
    val res = price + taxes
    s"$res"
  }
  
//  default values to function parameters
  def defaultParameterValue1(amount : Double , paymentType : Any =calculatePrice(10, 10)) : Any = {
    amount+" "+paymentType
  }
  
  def defaultParameterValue2(amount : Double , paymentType : String = " PREPAY") : Any = {
    amount+paymentType
  }
  
  def main(args: Array[String]): Unit = {
    println(calculatePrice(11,12))
    
    println(defaultParameterValue1(100))
    
    println(defaultParameterValue2(100))
  }
}