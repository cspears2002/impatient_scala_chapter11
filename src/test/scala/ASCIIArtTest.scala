import asciiArt.ASCIIArt
import org.scalatest.funsuite.AnyFunSuite

class ASCIIArtTest extends AnyFunSuite:
  val cat =
    """
    /\_/\
   ( ' ' )
   (  -  )
    | | |
   (__|__)"""

  val helloScalaCoder =
    """
      -----
    / Hello \
   <  Scala  |
    \ Coder  /
      -----
    """

  test("ASCIIArt.toString") {
    val myArt = ASCIIArt(cat)
    assert(myArt.toString() == cat)
  }

  test("ASCIIArt addition") {
    val coolArt = ASCIIArt(cat) + ASCIIArt(helloScalaCoder)
    val answer: String =
      """
      /\_/\      -----
     ( ' ' )   / Hello \
     (  -  )  <  Scala  |
      | | |    \ Coder  /
     (__|__)     -----"""
    assert(coolArt.toString() == answer)
  }
