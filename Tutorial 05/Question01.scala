object Question1{
  def main(args:Array[String]): Unit = {
    val a:Int=2;
    if (prime(a))
       println("Yes."+a+" is a prime number.");
    else
      println("No."+a+"is not a prime number.");
  }

  def prime(n:Int,x:Int=2): Boolean = {
    if (n<=2){
      return (n==2)
    }
    if(n%x==0){
      return false;
    }
    if(x*x>n){
      return true;
    }
    return prime(n,x+1)
  }
}