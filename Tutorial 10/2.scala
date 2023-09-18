
def countLetterOccurrences(list : List[String]) : Int = list.map(word => word.size).reduce((x, y) => x+y)

def main(args: Array[String]): Unit = {
  print("Enter the words seperated only by commas : ") 
  val list = scala.io.StdIn.readLine().split(" ").toList
  print("Total count of letter occurrences : " + countLetterOccurrences(list))
}
