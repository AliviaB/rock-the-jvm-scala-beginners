package lectures.part1basics

object Recursion extends App{

  def factorial (n:Int):BigInt={
    if (n<=1) 1
    else {
     val result= n * factorial(n-1)
      println("computed factorial of " + n+" is "+result)
      result
    }
  }
//rintln(factorial(20000))//Exception in thread "main" java.lang.StackOverflowError

  def anotherFactorial(n:Int):BigInt= {
    def factorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator)
    }

    factorialHelper(n, 1)
  }
  println(anotherFactorial(20000))



}
