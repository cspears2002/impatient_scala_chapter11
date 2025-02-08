import matrix.Matrix
import org.scalatest.funsuite.AnyFunSuite

import scala.language.postfixOps

class MatrixTest extends AnyFunSuite:
  val arr1: Array[Int] = Array(1, 2)
  val arr2: Array[Int] = Array(3, 4)
  val myMatrix = Matrix(arr1, arr2)

  test("Make a matrix") {
    assert(myMatrix(0, 0) == 1)
    assert(myMatrix(0, 1) == 2)
    assert(myMatrix(1, 0) == 3)
    assert(myMatrix(1, 1) == 4)
  }

  test("Multiply a scalar") {
    val newMatrix = myMatrix * 2

    assert(newMatrix(0, 0) == 2)
    assert(newMatrix(0, 1) == 4)
    assert(newMatrix(1, 0) == 6)
    assert(newMatrix(1, 1) == 8)
  }
