object first {
  def main(args: Array[String]): Unit = {
    print("Enter the number:");
    val input = scala.io.StdIn.readLine();
    val n = input.toInt;
    print(prime(n));
  }

  def prime(n: Int, i: Int = 2): Boolean = {
    if (n <= 2) {
      n == 2
    }
    else if (n % i == 0){
      false
    }
    else if (i * i > n) {
      true
    }
    else prime(n, i + 1)
  }
}




