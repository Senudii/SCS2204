object Question05 {
  def main(args: Array[String]): Unit = {
    val n = 25
    val total = sum(n)
    println("The summation of even numbers less than "+n+" is "+total+".");
  }

  def sum(n: Int): Int = {
    if (n <= 0) {
      return 0;
    }
    else if (n % 2 == 0) {
     return n + sum(n - 2);
    } else
    {
      return sum(n - 1)
    }
  }
}
