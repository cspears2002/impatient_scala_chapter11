package Product

class Product(val n: Int, val d: Int):
  def _1: Int = n
  def _2: Int = d

class MyProduct(override val n: Int, override val d: Int) extends Product(n: Int, d: Int):
  def unapply(input: MyProduct): MyProduct = MyProduct(input._1, input._2)
