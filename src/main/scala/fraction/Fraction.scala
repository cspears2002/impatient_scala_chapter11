package fraction:
  import scala.annotation.{tailrec, targetName}
  import scala.math.abs
  
  class Fraction(n: Int, d: Int):
    private val num: Int = if d == 0 then 1 else n * sign(d) / gcd(n, d)
    private val den: Int = if d == 0 then 0 else d * sign(d) / gcd(n, d)

    override def toString: String = s"$num/$den"
    private def sign(a: Int): Int = if a > 0 then 1 else if a < 0 then -1 else 0
    @tailrec
    private def gcd(a: Int, b: Int): Int = if b == 0 then abs(a) else gcd(b, a % b)
    private def lcm(a: Int, b: Int): Int = abs(a * b) / gcd(a, b)

    @targetName("multiply") def *(other: Fraction) = Fraction(num * other.num, den * other.den)
    @targetName("divide") def /(other: Fraction) = Fraction(num * other.den, den * other.num)
    @targetName("add") def +(other: Fraction): Fraction =
      val lcd = lcm(den, other.den)
      val newNum = num * (lcd / den)
      val newOtherNum = other.num * (lcd / other.den)
      val newOtherDen = other.den * (lcd / other.den)
      Fraction(newNum + newOtherNum, newOtherDen)


