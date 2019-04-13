package com.scalabasic

object ForComprehension {

  def main(args: Array[String]): Unit = {
    //    Type1   it iterators till 5
    for (forC1 <- 1 to 5) {
      println(s" = $forC1")
    }
    //    Type2   it iterators till 4
    for (forC2 <- 1 until 5) {
      println(s" # $forC2")
      //      Above two iterations uses for avoid <= and < operator in oops languages like java , .net etc...
    }
    //    Type3 We can apply if statement through iteration
    val washingPowders = List("nirma", "ariel", "rin", "tide", "henko", "surf")
    for (myPowder <- washingPowders if myPowder.equals("nirma")) {
      println(myPowder)
    }

    //     Type4 filter using yield keyword
    val powders = for {
      myPower <- washingPowders
      if (myPower == "nirma" || myPower == "rin" || myPower == "surf")
    } yield myPower
    println(s"MyPowder is = $powders")

    //     Type5
    val twoDimensionalArray = Array.ofDim[String](2, 2)
    twoDimensionalArray(0)(0) = "flour"
    twoDimensionalArray(0)(1) = "sugar"
    twoDimensionalArray(1)(0) = "egg"
    twoDimensionalArray(1)(1) = "syrup"
    for {
      x <- 0 until 2
      y <- 0 until 2
    } println(s"Donut ingredient at index ${(x, y)} = ${twoDimensionalArray(x)(y)}")
 

  }
}