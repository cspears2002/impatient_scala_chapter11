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

  test("Multiply another matrix") {
    val arr3: Array[Int] = Array(2, 3)
    val arr4: Array[Int] = Array(4, 5)
    val matrixB = Matrix(arr3, arr4)
    
    val prodMatrix = myMatrix * matrixB
    assert(prodMatrix(0, 0) == 10)
    assert(prodMatrix(0, 1) == 13)
    assert(prodMatrix(1, 0) == 22)
    assert(prodMatrix(1, 1) == 29)
  }

  test("Add to another matrix") {
    val arr5: Array[Int] = Array(1, 1)
    val arr6: Array[Int] = Array(1, 1)
    val matrixC = Matrix(arr5, arr6)
    
    val sumMatrix = myMatrix + matrixC
    assert(sumMatrix(0, 0) == 2)
    assert(sumMatrix(0, 1) == 3)
    assert(sumMatrix(1, 0) == 4)
    assert(sumMatrix(1, 1) == 5)
  }