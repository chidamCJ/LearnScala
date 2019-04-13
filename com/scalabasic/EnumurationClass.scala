package com.scalabasic

object EnumurationClass extends Enumeration {
  
 type EnumurationClass = Value
 
 val language = Value(77,"Tamil")
 val state = Value("TamilNadu")
 val education = Value("Msc")
 val gender = Value("Male")
 
 def main(args: Array[String]): Unit = {
   
   println(s"${EnumurationClass.gender}")

   println(s"${EnumurationClass.gender.id}")
   
   println(s"${EnumurationClass.values}")
   
   EnumurationClass.values.foreach{
     case a if (a == EnumurationClass.education) => println(s"${EnumurationClass.education}")
     case _ => None
   }
 }
}