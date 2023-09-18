
def calculateAverage(list : List[Int]) : Double = list.map(c => c * (9.0 / 5) + 32).reduce((x, y) => x+y) / list.length

def main(args: Array[String]): Unit = {
  print("Enter the temperatures seperated only by commas : ")
  val list = scala.io.StdIn.readLine().split(",").map(_.toInt).toList
  print("Average Fahrenheit Temperature : " + calculateAverage(list))
}
