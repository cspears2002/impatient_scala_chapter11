import asciiArt.ASCIIArt
import org.scalatest.funsuite.AnyFunSuite

class ASCIIArtTest extends AnyFunSuite:
  test("ASCIIArt.toString") {
    val cat = """
        /\_/\
       ( ' ' )
       (  -  )
        | | |
       (__|__)"""
    val myArt = ASCIIArt(cat)
    assert(myArt.toString() == cat)
  }
