//Demonstrate read line function using Scala
object Rline
{
def main(args: Array[String]) 
{
while (true) {
    val result = scala.io.StdIn.readLine()
    printf("Enter the String: %s", result)
    println()
     }
   }
}
//Access Modifier : Private
class Abc
{ 
    private var a:Int = 123
    def display()
    {
        a = 8
        println(a)
    }
}
  
object access extends App
{
    var e = new Abc()
    e.display()
    //e.a=8
    //println(e.a)
}
//Access Modifier : Protected
class abc
{ 
    // declaration of protected member
    protected var a:Int = 123
    def display()
    {
        a = 8
        println(a)
    }
}
  
// class new1 extends by class abc
class new1 extends abc
{
    def display1()
    {
        a = 9
        println(a)
    }
}
  
object access extends App
{
    // class abc is accessible because this
    // is in the same enclosing scope
    var e = new abc()
    e.display()
    var e1 = new new1()
     e1.display1()
          
}
//Access Modifier : Public
class abc
{
    var a:Int = 123
}
object access extends App
{
    var e = new abc()
    e.a = 444    
    println(e.a)
}
//function to add two numbers using mutable and immutable values
object add {
  def test(x:Int, y:Int) : Int = x + y
     
   def main(args: Array[String]): Unit = {
   	val a:Int =5
   	val b:Int =5
    println("Result: " + test(a, b));
    //a=10
    //b=10
    println("Result: " + test(a, b));
   }
}
//mutable
object add {
  def test(x:Int, y:Int) : Int = x + y
     
   def main(args: Array[String]): Unit = {
   	var a:Int =5
   	var b:Int =5
    println("Result: " + test(a, b));
    //a=10
    //b=10
    println("Result: " + test(a, b));
   }
}
