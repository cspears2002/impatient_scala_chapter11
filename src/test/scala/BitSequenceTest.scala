import bitSequence.BitSequence
import org.scalatest.funsuite.AnyFunSuite

class BitSequenceTest extends AnyFunSuite:
  test("BitSequence.apply") {
    val myArray: Array[Long] = Array(1, 2, 3)
    val myBitSeq = BitSequence(myArray)
    assert(myBitSeq(0) == 1)
  }
  test("BitSequence.update") {
    val myArray: Array[Long] = Array(1)
    val myBitSeq = BitSequence(myArray)
    myBitSeq(0) = 2
    assert(myBitSeq(0) == 2)
  }
