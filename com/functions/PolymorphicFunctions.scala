package com.functions

object PolymorphicFunctions {
  
  def applyReturnType[T](disc : T) : Seq[T] = {
    disc match {
      case x : String => println(s" $x")
      Seq[T](disc)
      case y : Double => println(s" $y")
      Seq[T](disc)
      case x @ _ => 
        Seq[T](disc)
    }
  }
  def main(args: Array[String]): Unit = {
    println(applyReturnType[Double](100))
//    println()
//    println(applyReturnType[String]("SCALA"))
//    println()
//    println(applyReturnType[Char]('C'))
    
  }
}