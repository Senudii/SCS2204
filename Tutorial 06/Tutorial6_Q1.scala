import scala.io.StdIn

object Q {
  def main(args: Array[String]): Unit = {
    print("Shift the letters by: ")
    val shift = scala.io.StdIn.readInt()
    print("Enter to Encrypt : ")
    val str1 = scala.io.StdIn.readLine()
    print("Enter to Decrypt : ")
    val str2 = scala.io.StdIn.readLine()

    val s1 = Cipher(str1, shift, Encryption)
    println(s1)

    val s2 = Cipher(str2, shift, Decryption)
    println(s2)
  }

  def Encryption(s: String, shift: Int): String = {
    val res = new StringBuilder()
    //This line creates a mutable StringBuilder named res, which will be used to build the encrypted result.

    for (i <- 0 until s.length) {
      val char = s(i)
      val num = char.toInt
      //converts the character to its ASCII integer representation and assigns it to the num variable.
      if (num >= 65 && num <= 90) {
        val shifted = ((char.toInt + shift - 65) % 26 + 65)
        res.append(shifted.toChar)
      }
      else if (num >= 97 && num <= 122) {
        val shifted = ((char.toInt + shift - 97) % 26 + 97)
        res.append(shifted.toChar)
      }
      else {
        res.append(char)
      }

    }
    res.toString()//string is returned as the result of the Encryption function.
  }

  def Decryption(str: String, shift: Int): String = {
    val res = new StringBuilder()

    for (i <- 0 until str.length) {
      val char = str(i)
      val num = char.toInt

      if (num >= 65 && num <= 90) {
        val shifted = ((char.toInt - shift - 65 + 26) % 26) + 65
        res.append(shifted.toChar)
      }
      else if (num >= 97 && num <= 122) {
        val shifted = ((char.toInt - shift - 97 + 26) % 26) + 97
        res.append(shifted.toChar)
      }
      else {
        res.append(char)
      }

    }
    res.toString()
  }


  def Cipher(str: String, shift: Int, Operation: (String, Int) => String): String = {
    Operation(str, shift)
  }
}