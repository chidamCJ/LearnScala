package com.scalabasic

object RangeSample {
  def main(args: Array[String]): Unit = {
    val from1To5 = 1 to 5
    println(s"Answer is = $from1To5")

    for {
      i <- 1 to 10
      if i < 4
    } println(i)
  }
}