package com.functions

object FunctionDemo 
{
  var  a=7;
  
  def ++= (a:Any)
  {
    println(this.a+"   "+a)
  }
  def main(args : Array[String])
  {
    ++=("scala")
    
  }
}