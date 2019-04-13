package com.basic

object StrongTyping
{
  def main(args:Array[String])
  {
      var x=100 //machine takes as int
      
//      x=x+"hello" cannot concat a string with int
//      gives error at compile time
      println ("hello")
      
  }
}