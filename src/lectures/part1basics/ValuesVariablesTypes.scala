package lectures.part1basics

object ValuesVariablesTypes extends App{

  val x:Int=36
  println(x)

  // VAL ARE IMMUTABLE
  // COMPILERS CAN INFER TYPE (:Int is optional)
  val aChar:Char ='a'
  val aString:String="Hello"
  val anInt:Int =45
  val aShort:Short=4213
  val aLong:Long=28176243L
  val aFloat:Float=2.0f
  val aDouble:Double=3.14

  //Variables
  var aVariable:Int =43
  aVariable=45
  println(aVariable)


}
