object Q3{
  def main(args:Array[String]):Unit={
      val num=8;
    if(num<0){
      println("Enter positive Integer.")
    }
    else{
      println("Total of the numbers="+sum(num));
    }
  }

  def sum(n:Int): Int = {
       if(n<=1){
         return n;
       }
       else{
         return n+sum(n-1);
       }
  }
}