package org.tresata
package lowestmultiple

import scala.annotation.tailrec

object LowestMultiple {

  @tailrec
  private def gcd(a: Long, b: Long): Long = {
    if (b == 0) {
      a
    } else {
      gcd(b, a % b)
    }
  }

  private def lcm(n1: Long, n2: Long): Long = {
    (n1 * n2) / gcd(n1, n2)
  }

  def lowestMultiple(n: Int): Long = {
    if (n > 1)
      lcm(n, lowestMultiple(n - 1))
    else
      1
  }
}
