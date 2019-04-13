package com.functions

object OptionReturnType {
  
  def paymentType() : Option[String] = {
    
    val mode = "CASH"
    Option(mode).filter(_.nonEmpty)
  }
  def main(args: Array[String]): Unit = {
    
    println(paymentType())
    
    val tp : Option[String] = paymentType()
    println(s"${tp.getOrElse("Not Accepted")}")
    
    paymentType() match {
      case Some(pay) => println(s"$pay")
      case None => println(s"Not Accepted")
      
      paymentType().map(pay => println(s"type = $pay"))



    }
  }
}
