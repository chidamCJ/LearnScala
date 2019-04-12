package com.breakstatement
import scala.util.control.Breaks._
import scala.util.control.BreakControl

object break 
{
  def main(args : Array[String])
  {
    var sum=0
    for(i <-0 to 10 ) 
    {
      sum +=i
      print(i)
    }
    println()
    
      breakable
    {
      for(a <- 1 until 5)
      {
        if(a==2)
        {
          break
        }
        else
        println(a)
      }
    }
  }
}