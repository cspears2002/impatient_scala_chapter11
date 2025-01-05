import HtmlTable.HtmlTable

import org.scalatest.funsuite.AnyFunSuite

class HtmlTableTest extends AnyFunSuite:
  test("Table") {
    val table = HtmlTable() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
    assert {
      table.toHtml == "<table><tr><td>Java</td><td>Scala</td></tr>" +
        "<tr><td>Gosling</td><td>Odersky</td></tr>" +
        "<tr><td>JVM</td><td>JVM, .NET</td></tr></table>"
    }
  }
