import scala.collection.immutable.Range

/**
 * Created by adrianhp on 3/11/2015.
 */
object Test1 extends App {

  def calcUpToNtypical(num: Int): Int = {

    var k = 0
    for (i <- 0 to num) {
      k += i
    }

    k
  }

  def calcUpToN(num: Int): Int = {

    (num * (num + 1)) / 2
  }

  def calcUpToNr(num: Int): Int = {
    if (num > 0)
      num + calcUpToNr(num - 1)
    else
      0
  }

  //n= 6 : 1,2,3,4,5 = 15
  println(calcUpToN(5))
  println(calcUpToNtypical(5))
  println(calcUpToNr(5))


}

0000
000x
00xx
0xxx