package com.scalabasic

object TupleSample {
  
  def main(args: Array[String]): Unit = {
    val tup1= new Tuple2(10,11.11)
    val tup2= new Tuple4('c',"scala",10,11.11)
    val tup3= new Tuple1("scala programming")
    val tup4= new Tuple3(22,22.33,'s')
    
    println(tup1._1)
    println(tup2._4)
    println(tup2._2)
    val allTuple = List(tup1)
    allTuple.foreach{tup => {
      tup match {
        case (pos1,pos2) => println(s" pos1 is = $pos1 pos2 is = $pos2")
        
      }
    }
  }
    }
  
}