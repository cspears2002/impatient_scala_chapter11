import asciiArt.ASCIIArt
import org.scalatest.funsuite.AnyFunSuite

import scala.language.postfixOps

class ASCIIArtTest extends AnyFunSuite:
  val cat: String =
    """ /\_/\
     |( ' ' )
     |(  -  )
     | | | |
     |(__|__)""".stripMargin

  val helloScalaCoder =
    """
    /\_/\     -----
   ( ' ' )   / Hello \
   (  -  )  <  Scala  |
    | | |    \ Coder  /
   (__|__)     -----
    """

  test("ASCIIArt addition") {
    val coolArt = new ASCIIArt +
      """ /\_/\""" +
      """( ' ' )""" +
      """(  -  )""" +
      """ | | |""" +
      """(__|__)"""

    println(coolArt.toString)
    println(cat)
    assert(coolArt.toString == cat)

    val result = coolArt | new ASCIIArt +
      """-----""" +
      """/ Hello \""" +
      """<  Scala  |""" +
      """\ Coder  /""" +
      """-----"""
  }


