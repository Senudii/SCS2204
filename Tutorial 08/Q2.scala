object matching{
def PatternMatching(i: Int): Unit = {
  i match {
    case x if x <= 0 => println("Negative/Zero")
    case x if x % 2 == 0 => println("Even")
    case _ => println("Odd")
  }
}

def main(args: Array[String]): Unit = {
  print("Enter an integer: ")
  val i = scala.io.StdIn.readInt()
  PatternMatching(i)
}}