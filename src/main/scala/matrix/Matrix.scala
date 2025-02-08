package matrix

import scala.annotation.targetName

class Matrix(arr1: Array[Int], arr2: Array[Int]):

  private val arr: Array[Array[Int]] = Array.ofDim[Int](2, 2)
  for (i <- 0 until 2) {
    arr(0)(i) = arr1(i)
    arr(1)(i) = arr2(i)
  }

  def apply(row: Int, col: Int): Int = arr (row)(col)
  @targetName("multiply") def *(other: Int): Matrix =
    val myArr1 = new Array[Int](2)
    val myArr2 = new Array[Int](2)
    for (i <- 0 until 2) do
      myArr1(i) = arr(0)(i) * other
      myArr2(i) = arr(1)(i) * other
    Matrix(myArr1, myArr2)

  @targetName("multiply") def *(other: Matrix): Matrix =
    val val1 = (arr(0)(0) * other(0, 0)) + (arr(0)(1) * other(1, 0))
    val val2 = (arr(0)(0) * other(0, 1)) + (arr(0)(1) * other(1, 1))
    val val3 = (arr(1)(0) * other(0, 0)) + (arr(1)(1) * other(1, 0))
    val val4 = (arr(1)(0) * other(0, 1)) + (arr(1)(1) * other(1, 1))
    Matrix(Array(val1, val2), Array(val3, val4))