package HtmlTable

import scala.collection.mutable.ListBuffer

class HtmlTable:

  private val table = new ListBuffer[ListBuffer[String]]

  def|(data: String): HtmlTable =
    if (table.isEmpty) {
      table += new ListBuffer[String]
    }
    table.last += data
    this


