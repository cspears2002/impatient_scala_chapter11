import org.scalatest.funsuite.AnyFunSuite
import XMElement.XMLElement

import scala.xml.Elem

class XMElementTest extends AnyFunSuite:
  val testFile = "/Users/christopherspears/Documents/ScalaProjects/impatient_scala_chapter11/src/test/scala/test.html"
  val rootElement: Elem = scala.xml.XML.loadFile(testFile)
  test("Get Douglas Adams with XMLElement") {
    val myElement = XMLElement(rootElement)
    val author = myElement.html.body.ul(id="42").li
    assert(author == "Douglas Adams")
  }
  test("Get Douglas Adams With scala.xml.XML") {
    val authors = (rootElement \ "body" \ "ul").find(ul => (ul \@ "id") == "42").map(li => li.text).toList
    assert(authors.head.trim == "Douglas Adams")
  }
