package org.tresata
package largestpallidrome

object LargestPallidrome {

  def isPallidrome(num : Int) : Boolean = {
    val numStr = num.toString
    val revNum = numStr.reverse
    revNum==numStr
  }

  def findLargestPallidromeProduct() : Int = {
    val list = for {
      i <- Range.inclusive(999, 100, -1)
      j <- Range.inclusive(999, 100, -1)
      if isPallidrome(i * j)
    }
    yield i * j
    list.max

  }

}
