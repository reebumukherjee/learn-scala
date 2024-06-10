
import scala.annotation.tailrec

object PrimeFactor {

  def findPrimeFactors(target : Long)  : Long = {
    @tailrec
    def findFactor(x: Long, a: Int = 2, max: Long=1): Long = (a * a > x, x % a) match {
      case (false, 0) => findFactor(x / a, a, Math.max(max,a) )
      case (false, _) => findFactor(x, a + 1, max)
      case _ => Math.max(x,max)
    }
    findFactor(target)
  }
}
