package remedo

import java.util.regex.Pattern

object ValidNumber 
{
  def isValid(str: String): Boolean = {
    val p = Pattern.compile("(0|91|91[-])?[7-9][0-9]{9}")
    val m = p.matcher(str)
    if(m.find() && m.group().equals(str))
      true
    else
      false
  }
  
  def main(args: Array[String])
  {
    val num: String = "91-8699176692";
    if(isValid(num))
      print("Valid Number!")
    else
      print("Invalid Number!")  
  }    
}