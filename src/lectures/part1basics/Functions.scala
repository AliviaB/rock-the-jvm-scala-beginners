package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String =
    a + "  " + b * b * b

  println(aFunction("Hello", 88))


  def aParameterLess(): String = "You are awesome"

  println(aParameterLess)

  def aRecursiveFunc(aString: String, n: Int): String = {
    if (n == 1) aString
    else
      aString + " " + aRecursiveFunc(aString, n - 1)

  } // When you NEED a LOOP use Recursion

  println(aRecursiveFunc("Alivia", n = 7))

  def aFunctionWithSideEffect(aString: String): Unit = print(aString) //{}

  println(aFunctionWithSideEffect("Fun"))

  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a - b

    aSmallFunction(n, n - 1)
  }

  println(aBigFunction(89))

  //1. A greetings function
  def aGreeting(name: String, age: Int): String = "Hi, my name is " + name + " and I am " + age + " years old"

  println(aGreeting("Alivia", 36))
  //2.Factorial Function
  def aFactorialFunction(n:Int):Int=
    {
      if (n<=0) 1
      else
        n*aFactorialFunction(n-1)
    }
    println(aFactorialFunction(4))
  //3 a fibonacci function
  def aFibonacci(n:Int):Int=
    {
      if (n<=2) 1
      else aFibonacci(n-1)+aFibonacci(n-2)
      // 1 1 2 3 5 8 13 21 34
    }
    println(aFibonacci(9))

  // Test Prime
def aPrimeCheck(n:Int):String= {
  def aPrimeTest(n: Int, a: Int = 2): Boolean = {
    if (n == a) true
    else if (n % a == 0) false
    else
      aPrimeTest(n, a + 1)
  }
  if(aPrimeTest(n)) n+" is a Prime number"
  else n +" is not a Prime Number"
}
      println(aPrimeCheck(37*19))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 19))


}