

object Main {
  def main(args: Array[String]): Unit = {
    val target = 600851475143L
    println(PrimeFactor.findPrimeFactors(target))
  }
}