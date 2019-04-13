package com.scalabasic
import java.util.Scanner;
object IfElseStatements {
  
  var input=new Scanner(System.in)
  println("Enter your age.")
  val age=input.nextInt()
  
  val status=if(age>=18)" eligible to vote. Your age is = "+(age) else "Sorry you are not eligible to vote"
  def main(args: Array[String]): Unit = {
    println(status)
    
  }
}