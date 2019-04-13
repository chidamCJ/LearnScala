

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Welcome to Scala Programmaing...");
    
//    Immutable object
      val immutable=10;
      
//    Mutable object
      var mutable="hello"
      println(mutable)
      mutable="hello scala"
      println(mutable)
      
//      Lazy initialization
      lazy val lazyI=11.22
      print(lazyI)
   
      
  }
}