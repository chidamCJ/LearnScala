package com.functions

object VariableArgumentFunction {
  
  def report(repo : String*){
    println(s"""Reports ${repo.mkString(" * ")}""")
  }
  
  def main(args: Array[String]): Unit = {
    report()
    report("12","ennaval")
    report("abc","efg","hij")
    
    val list : List[String] =List("efg","hij","abc")
    report(list:_*)
    
    val seq : Seq[String] = Seq("1","2","3")
    report(seq:_*)
    
    val arr : Array[String] = Array("HELLO","SCALA")
    report(arr:_*)
  }
}