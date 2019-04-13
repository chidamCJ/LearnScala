package com.basic
import java.util.{Date,Locale}
import java.text.DateFormat._

object Demo 
{
  def main(args : Array[String])
  {
    val now=new Date
//    print("Time is --> "+now)
    val df=getDateInstance(LONG,Locale.CANADA)
    println(df format now) // we can write in this way too print(df.format(now))
    print(333333.!=(333333))
  }
}