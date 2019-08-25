package com.objectoriented

  //  class will act as class as well as Primary Constructor
class ScalaConstructor(firstName: String) {
  //  In scala we can create a class like java class using of *class* keyword.
  //  A class body is its constructor.
  //  (name: String) this represents primary constructor of ScalaClass.

  //  Auxiliary Constructor
  def this(firstName: String, lastName: String) {
  //  Invoking primary constructor
    this(firstName + " " + lastName)
  }
  //  primary constructor args value passing into result object
  val result = firstName

  def printName() {
  //  prints result object.
    println(this.result)
  }
  //  From any class or companion object we can call printName function
}