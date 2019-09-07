package com.objectoriented

// A case class is similar to any other classes except that it also
// creates the Companion Object. In addition, a case class will automatically
// create the apply(),  toString(), hashCode and equals() methods for you.

case class CaseClass(bookName: String, bookPrice: Float)

// we don't want to use 'new' keyword to create an instance for case class
// The case class will automatically create the Companion Object.
// Fields defined on case class are immutable by default and as such
// you cannot modify them.

object CaseClassSample {

  val book1 = CaseClass("agniSiragugal", 100)
  println(s"First book is : ${book1.bookName}")

  val book2 = CaseClass("Java 8 ", 500)
  println(s"Second book is : ${book2.bookName + "& price is " + book2.bookPrice}")
}