object abc{
  def main(args:Array[String]): Unit = {
    val a:Int=20;
    var i:Int=1;
    while(i<=a){
      if (prime(i))
        print(i+",");
      i=i+1;
    }
    println(" are prime numbers less than 20.");
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