package money:

  import scala.annotation.targetName
  
  class Money(var dollars: Int = 0, var cents: Int = 0):
    // override def toString: String = s"$dollars.$cents"
    @targetName("add") def+(other: Money): Money =
      val totalCents = cents + other.cents
      val totalDollars = dollars + other.dollars
      val newDollars = totalDollars + (totalCents / 100)
      val newCents = totalCents % 100
      Money(newDollars, newCents)
    @targetName("subtract") def-(other: Money): Money =
      val totalCents = (dollars * 100) + cents
      val otherTotalCents = {
        (other.dollars * 100) + other.cents
      }
      val diffInCents = totalCents - otherTotalCents
      Money(diffInCents / 100, diffInCents % 100)
