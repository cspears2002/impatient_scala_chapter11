import nameWithTitle.{NameWithTitle, Title}
import org.scalatest.funsuite.AnyFunSuite

class NameWithTitleTest extends AnyFunSuite:
  test("Extract Name Components") {
    val peter: String = "Dr. Peter van der Linden"
    val NameWithTitle(title, nameComps) = peter
  }
