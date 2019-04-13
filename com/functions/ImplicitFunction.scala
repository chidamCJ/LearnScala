package com.functions

class ImplicitFunction (s : String){
  
  def isBoolean : Boolean = s == "SCALA"
    
}

object Implicit{
  implicit def impli(s : String) = new ImplicitFunction(s)
  
  val name = "SCALA"
  
  println(s"${name}")
}

