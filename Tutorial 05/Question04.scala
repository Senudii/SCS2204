object Question04{
  def main(args:Array[String]):Unit= {
          oddOReven(16);
  }

  def oddOReven(n:Int):Unit={
    if (n<0) {
      return false
    }
    if(n%2==0){
      println(n+" is an even number.");
    }
    else {
      println(n+" is an odd number.")
    }
    return oddOReven(n-1)
    ;


  }

}