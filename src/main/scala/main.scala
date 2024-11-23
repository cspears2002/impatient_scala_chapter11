import fraction.Fraction

@main
def main(): Unit =
  println("Hello world!")
  testFractions()

def testFractions(): Unit =
  val product = Fraction(1, 2) * Fraction(1, 2)
  println(s"The answer is $product.")

  val quotient = Fraction(2, 5) / Fraction(3, 10)
  println(s"The answer is $quotient.")

  val sum = Fraction(2, 21) + Fraction(1, 6)
  println(s"The answer is $sum.")

