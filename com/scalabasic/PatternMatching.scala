package com.scalabasic

object PatternMatching {

  val foodType = "NON-VEG"
//    NON-VEG   EGG-ONLY
  //  Type1 Basic Example
  def simplePatternMatching(args: Char): String = {
    val parameter = args
    var ret: String = null
    parameter match {
      case 'm' => ret = "Monday"
      case 't' => ret = "Tuesday"
      case 'w' => ret = "Wednesday"
      case _   => ret = "Not Matching..."
    }
    s"Answer is = $ret"
  }
  //  Type2 Pattern matching and return the result
  def returnTheResult(): String = {
    val answer = foodType match {
      case "VEG" | "EGG-ONLY" => "Fine..."
      case "NON-VEG" => "difficult to digiest..."
    }
    s"$foodType = $answer"
  }
//  
  def expressionsInPM(): String = {
    var answer = foodType match{
      case sType if(sType.contains("VEG") || sType.contains("EGG-ONLY")) => "Fine..."
      case "NON-VEG" => "difficult to digiest..."
    }
    s"$foodType = $answer"
  }
//Type5 Pattern matching by types
  def patternMatchingByTypes(price : Any) {
    var priceOfProduct : Any = price match {
      case value :Int => "Int"
        case value :Double => "Double"
        case value : Char => "Char"
        case _ : String => "String"
    }
    println(s" = $priceOfProduct")
  }
  
  
  def main(args: Array[String]): Unit = {
    println(simplePatternMatching('w'))
    println(returnTheResult())
    println(expressionsInPM())
    patternMatchingByTypes('c')

  }
}