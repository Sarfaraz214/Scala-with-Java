package remedo

import java.util.Scanner

object Factorial 
{
  def findFactorial(n: Int): Int = {
    if (n == 1)
      1
    else
      n * findFactorial(n - 1)
  }
  
  def main(args: Array[String])
  {
    val sc = new Scanner(System.in)
    print("Enter a number: ")
    try
    {
      val n: Int = sc.nextInt() 
      val res: Int = findFactorial(n)
      println("Result is : " + res)
    }
    catch {
      case ex: Exception => println("Exception Occured : " + ex) 
    }
    
  }
}