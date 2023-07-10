object fourth {
  def main(args: Array[String]): Unit = {
    println("5 is a " + Check_even(5))
    println("354 is a " + Check_even(354))

  }

  def Check_even(n: Int): String = n match {
    case x if x == 0 => "Even number"
    case x if x == 1 => "Odd number"
    case _ => Check_even(n - 2)
  }
}
