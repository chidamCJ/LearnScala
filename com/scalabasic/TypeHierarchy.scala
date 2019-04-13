package com.scalabasic
import com.functions._
object TypeHierarchy {
  
  def main(args: Array[String]): Unit = {
    val name1 : Any = "Hello"
   
    val name2 : AnyVal = 100
    
    val name3 : AnyRef = List(100,'c')
    
     print(name1+" "+name2+" "+name3)
     
  }
}