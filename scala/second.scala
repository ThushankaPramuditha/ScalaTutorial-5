object second {

  def main(args: Array[String]): Unit = {
    primeSeq(10)
  }

  def primeSeq(n: Int): Unit = {
    def isPrime(k: Int, i: Int): Boolean = {
      if (i <= 1)
        true
      else if (k % i == 0)
        false
      else
        isPrime(k, i - 1)
    }

    def printPrimes(k: Int): Unit = {
      if (k < 2)
        return
      if (isPrime(k, math.sqrt(k).toInt))
        printPrimes(k - 1)
      else {
        printPrimes(k - 1)
        println(k)
      }
    }

    printPrimes(n - 1)
  }
}

