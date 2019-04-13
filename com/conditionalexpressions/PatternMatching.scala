package com.conditionalexpressions

class PatternMatching 
{
    def patternM(a:Int)= a match
    {
      case 1 => println("1")
      case _ => println("_")
    }     
}