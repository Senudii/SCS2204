object Q2 {
  def main(args: Array[String]): Unit = {
    println("Enter the integer number:")
    patternMatching()
  }

  def patternMatching(): Unit = {
    val int = scala.io.StdIn.readInt()
    val result = int match {
      case x if x <= 0       => s"$x is a negative/zero value."
      case x if x % 2 == 0  => s"$x is an even number."
      case x if x % 2 != 0  => s"$x is an odd number."
    }
    println(result)
  }
}
