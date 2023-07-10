object Question06{
  def main(args:Array[String]): Unit = {
    val num=8;
    println("First n Fibonacci numbers for number n is "+ fibonnacci(8)+".");
  }

  def fibonnacci(n:Int): Int = {
    if(n<=1){
      return n;
    }
    else{
    return fibonnacci(n-1)+fibonnacci(n-2);
    }
  }
}