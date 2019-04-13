package com.scalabasic

object EscapeCharacters {
  val stripMargin: String =
    """
      |{
      |"donut_name":"Glazed Donut",
      |"taste_level":"Very Tasty",
      |"price":2.50
      |}
      """.stripMargin
  def strip(): String = {
    stripMargin
  }
  def main(args: Array[String]): Unit = {
    println(stripMargin)
    
    
  }
}