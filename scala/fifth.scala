object fifth {

  def main(args: Array[String]): Unit = {
    println(sumEven(10))
    println(sumEven(15))
    println(sumEven(5))

  }

  def sumEven(n: Int): Int = {
    if (n <= 0)
      0
    else if (n % 2 == 0)
      n + sumEven(n - 2)
    else
      sumEven(n - 1)
  }
}
