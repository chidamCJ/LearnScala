package com.functions

object OptionInParameters {
  
  def parameterInOption(amount : Int , couponType : Option[String]) {
    
    couponType match {
      case  Some(coupon) =>
        val disc = 0.123
        val estimated = 25 * amount - (1-disc) 
        estimated
      case None =>  println(2.50 * amount)
    }
  }
  
  def optionParamater(couponType : Option[String] = None) : Any ={
    couponType
  }
  
  def main(args: Array[String]): Unit = {
    println(parameterInOption(10 , None))
    
    println(optionParamater(Some("hello")))
  }
}