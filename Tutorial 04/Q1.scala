object q1{
  def main(args:Array[String]):Unit={
     calc_interest();
  }

  def calc_interest():Unit={
    val depositedAmount=scala.io.StdIn.readInt();
    println("The value of a Deposited amount is " + depositedAmount);
    var interest:Double=0;
    if(depositedAmount<20000){
      interest=(depositedAmount*0.02);
    }
    else if(20000<depositedAmount && depositedAmount<200000){
      interest=depositedAmount*0.04
    }
    else if(200000<depositedAmount && depositedAmount<2000000){
      interest=(depositedAmount*0.035)
    }
    else{
      interest=depositedAmount*0.065;
    }
    println("Interest is "+interest);
  }
}
