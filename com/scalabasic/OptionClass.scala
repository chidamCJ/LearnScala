package com.scalabasic

object OptionClass {
  def main(args: Array[String]): Unit = {
    //  How To Use Option - Avoid Null & NullPointerException
//    Way1
    val paymentType: Option[String] = Some("CASH")
    println(paymentType.get.equals("scala").==(false))
    
//    Way2
    val none: Option[String] = None
    if (none.!=(null))
      println(none.getOrElse("scala"))

      val n : Option[String] = None
      println(n.get)
      
      
      
  }
}