package com.functions

class FunctionNamesAsSymbols {
//  function name starts in alphabets
  def minus(value1 : Int, value2 : Int) : Double ={
    value1 * value2
  }
//  function name starts in symbol or symbols
  def -(value1 : Int, value2 : Int) : Double ={
    value1 * value2
  }
}

object Caller{
  def main(args: Array[String]): Unit = {
    
    val name = new FunctionNamesAsSymbols()
    println(s"${name.minus(2, 2)}")
    
    println(s"${name.-(3 , 3)}")
  }
}