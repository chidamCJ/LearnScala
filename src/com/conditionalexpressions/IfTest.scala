package com.conditionalexpressions

class IfTest 
{
  var a=100
  var b:Int=200
//  using if and else here instead of ternary operator
  val x= if(a<b) a else  b 
//  using if condition to a method return type 
  def met(aa:Int,bb:Int) = if(aa>=bb)99.999 else 88.888
}