import matrix.Matrix
import org.scalatest.funsuite.AnyFunSuite

import scala.language.postfixOps

class MatrixTest extends AnyFunSuite:
  test("Make a matrix") {
    val arr1 = Array(1, 2)
    val arr2 = Array(3, 4)
    val myMatrix = Matrix(arr1, arr2)
    assert(myMatrix(0, 0) == 1)
    assert(myMatrix(0, 1) == 2)
    assert(myMatrix(1, 0) == 3)
    assert(myMatrix(1, 1) == 4)
  }
