package com.functions

object Functions1 {

//  creating basic function in scala using of def keyword
  def name(name : String) : String = {
    "Welcome to learning of scala "+s"$name"
  }
  val nm = name("chida")
  
//  defining a function without parenthesis 
  def withoutParenthesis = name(nm)
  
//  A function do not have return type
  def noReturnType() : Unit ={
    println("noReturnType")
  }
  
  def main(args: Array[String]): Unit = {
    println(nm)
    
    println(withoutParenthesis)
    
    noReturnType()
  }
}