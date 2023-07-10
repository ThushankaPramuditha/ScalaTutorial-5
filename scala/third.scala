object third {

    def main(args: Array[String]): Unit = {
      println(sum(5))
      println(sum(10))
      println(sum(0))
    }

    def sum(n: Int): Int = {
      if (n <= 0)
        0
      else
        n + sum(n - 1)
    }


}
