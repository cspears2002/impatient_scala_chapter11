package bitSequence

class BitSequence(myArray: Array[Long]):

  private val arrayBits = new Array[Long](64)
  for i <- myArray do arrayBits :+ i

  def apply(idx: Int): Long = arrayBits(idx)
  def update(idx: Int, newVal: Long): Unit =
    arrayBits(idx) = newVal