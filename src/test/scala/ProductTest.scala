import org.scalatest.funsuite.AnyFunSuite
import Product.MyProduct

import scala.language.postfixOps

class ProductTest extends AnyFunSuite:

  test("Unapply") {
    val myProd: MyProduct = MyProduct(1, 2)
    assert(myProd.n == 1)
    assert(myProd.d == 2)
    assert(myProd._1 == 1)
    assert(myProd._2 == 2)
  }
