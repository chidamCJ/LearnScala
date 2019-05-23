package com.functions

object FunctionUsingValKey {
  
//  A function using val keyword
  val function = (cost : Int) =>{
    val disc=10
    cost - disc
  }
  def main(args: Array[String]): Unit = {
    print(function(9))
   
  }
}