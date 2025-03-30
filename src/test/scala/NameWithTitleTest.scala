import nameWithTitle.{NameWithTitle, Title}
import org.scalatest.funsuite.AnyFunSuite

class NameWithTitleTest extends AnyFunSuite:
  val peter: String = "Dr. Peter van der Linden"

  test("Make Name Components") {
    val petersName: String = NameWithTitle(peter)
    assert {
      peter == petersName
    }
  }

  test("Extract Name Components") {
    val NameWithTitle(title, firstName, van, der, lastName) = peter
    assert(title == Title.DR)
    assert(firstName == "Peter")
    assert(van == "van")
    assert(der == "der")
    assert(lastName == "Linden")
  }
