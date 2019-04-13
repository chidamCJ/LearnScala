package com.scalabasic

object StringInterpolation {
// We can use string interpolation of Scala in 6 ways 
  
  //  StringInterpolation
  val interpolation = "scala programming"

//  evaluateExpression
  val exp=100
  //  Type1    $ symbol represents for StringInterpolation
  def interpolate(stringPolate: String): String = {
    //  We've prefixed the s at the beginning of our statement.
    //  We also used the dollar sign $ to refer to our variable.
    s"Welcome to = $stringPolate"
  }
  
//  Type2 Using String interpolation on object properties
  case class Payment(amount: Int, cardType: String)
  //      Using String interpolation on object properties
  def payment(payment: Payment): String = {
    s"payment1 amount is = ${payment.amount}, type= ${payment.cardType}"
  }
//  Type3 Using String interpolation to evaluate expressions
  def evaluateExp(age :Int){
    exp==age
    println(s"Result is = ${age>=18}")
  }
//  Type4 Using String interpolation for formatting text
  def formattingText(name: String, level : String) : String = {
    f"$name%20s $level"
  }
//  Type5 Using f interpolation to format numbers
  def formattingNumber(price:Double){
   
    print(f"Formatted = $price%.3f")
  }
  
//  Type6 Using Raw interpolation
  def rawInterpolation(){
    val name="scala programming"
    println("\n Using raw interpolation")
    println(raw"Name is \t $name")
  }
  def main(args: Array[String]): Unit = {
    //  Here we don't want an object to call interpolate method because this is singleton object.
    println(interpolate(interpolation))

    println(payment(Payment.apply(10, "VISA")))
    
    evaluateExp(20)
    
    println(formattingText("hello Welcome to","scala"))
    
    formattingNumber(22.50)
    
    rawInterpolation()
  }
}