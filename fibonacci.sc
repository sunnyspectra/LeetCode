object Main extends App {
    val fib: Stream[Int] = 1 #:: fib.scanLeft(1)(_ + _)
    print((fib take 10 toList).mkString(" "))
}
