package com.functions

object TypedFunctions {
  
  def applyDiscount(s : String){
    println(s"$s")
  }
  
   def applyDiscount(d : Double){
    println(s"$d")
  }
   
  def applyDiscount[T] (dis : T){
    dis match {
      case d: String => println(s"$d have to apply")
      case d: Double => println(s"$d already applied")
      case _ => println("Not Supported")
    }
  }
   
   def main(args: Array[String]): Unit = {
     applyDiscount[Double](10)
     applyDiscount[String]("SCALA")
     applyDiscount(10)
     applyDiscount("SCALA")
     
   }
}