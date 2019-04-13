package com.conditionalexpressions

class ForLoop 
{
  def forloop()
  {
//    Type 1
    for(x  <-1 until 5)  // we can use until or to keyword
        print(x+" ")
    
println()
    
//    Type 2  for-loop filtering and nested if
    for(s <- 1 to 10 if (s>5) if(s>7) if(s>=9))
        print(s+" ")
            
println()
        
    for (c <-1 to 10 if(c%2==0))
        print(c+" ")
println()
//    for loop with yield keyword
        var aa=for(a <- 11 to 20) yield a*2
        for(x<-aa)
        {
          print(x+" ")
        }
  }
}