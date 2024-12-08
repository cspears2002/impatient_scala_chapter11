import fraction.Fraction
import money.Money

@main
def main(): Unit =
  println("Hello world!")
  // testFractions()
  testMoney()

def testFractions(): Unit =
  val product = Fraction(1, 2) * Fraction(1, 2)
  println(s"The answer is $product.")

  val quotient = Fraction(2, 5) / Fraction(3, 10)
  println(s"The answer is $quotient.")

  val sum = Fraction(2, 21) + Fraction(1, 6)
  println(s"The answer is $sum.")

def testMoney(): Unit =
  val sum = Money(1, 75) + Money(0, 50)
  println(s"The answer is $sum")

  val difference = Money(1, 75) - Money(0, 50)
  println(s"The answer is $difference")

