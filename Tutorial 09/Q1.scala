object T9_q1 {

  class rational(number: Int) {
    def nu = number
    def neg() = -nu
  }

  def main(args: Array[String]): Unit = {
    val in = scala.io.StdIn.readLine("Enter value to turn into negative: ")
    val numm: Array[String] = in.split("/")

    if (numm.length >= 2) { // Check if both numerator and denominator are provided
      val num = numm.map(_.toInt)

      if (num(1) != 0) {
        if (num(0) == 0) {
          println("0")
        } else {
          val rat1 = new rational(num(0))
          println("Negative value is " + rat1.neg() + "/" + num(1))
        }
      } else {
        println("Denominator cannot be 0")
      }
    } else {
      println("Please provide both numerator and denominator separated by a /")
    }
  }
}
