object Q3{
  def main(args:Array[String]):Unit={
    println("Benny=>"+formatNames("Benny", toUpper))
    println("Niroshan=>"+formatNames("Niroshan", changeCharacters))
    println("Saman=>"+formatNames("Saman",toLower))
    println("Kumara=>"+formatNames("Kumara",changeCharacters))
  }

  def toUpper(name : String) : String = {
    name.toUpperCase()
}

def toLower(name : String) : String = {
    name.toLowerCase()
}

def formatNames(name : String, opr: String => String) : String = {
      opr(name)
}

def changeCharacters(name : String) : String = {
        print("Enter an index you need to format: ")
        val n = scala.io.StdIn.readInt()
        if(n < 0 || n >= name.length())
            return "Error."
        else {
            return name.updated(n, if(name(n).isLower) name(n).toUpper else name(n))
        }
}
}


