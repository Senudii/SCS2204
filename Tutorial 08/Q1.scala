object deposit {

  def interest(deposit: Double): Double = {
    val interestRate: Double = deposit match {
      case d if d <= 20000 => 0.02
      case d if d <= 200000 => 0.04
      case d if d <= 2000000 => 0.035
      case _ => 0.065
    }

    interestRate * deposit
  }

  def main(args: Array[String]): Unit = {
    print("Enter the deposit amount : ")
    val deposit = scala.io.StdIn.readDouble()
    if (deposit < 0) {
      println("Invalid deposit amount.")
      return
    }

    println(s"Interest : ${interest(deposit)}")
  }
}