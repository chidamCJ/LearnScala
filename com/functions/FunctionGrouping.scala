package com.functions

object FunctionGrouping {
  
//  function currying
  def calculate(val1 : Int)(val2 : Double) (val3 : Long, val4 : String) : Double = {
    val1+val2+val3
  }
  
  def main(args: Array[String]): Unit = {
  
    println(calculate(1)(2)(3, " SCALA"))
    val functionCurrying = calculate(99)(1)_
    println(functionCurrying(3,"SCALA"))
  }
}