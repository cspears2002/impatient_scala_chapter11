import money.Money
import org.scalatest.funsuite.AnyFunSuite

class MoneyTest extends AnyFunSuite:
  test("Money.+") {
    val sum = Money(1, 75) + Money(0, 50)
    assert(sum.dollars == 2)
    assert(sum.cents === 25)
  }
  test("Money.-") {
    val diff = Money(2, 25) - Money(0, 50)
    assert(diff.dollars == 1)
    assert(diff.cents === 75)
  }
