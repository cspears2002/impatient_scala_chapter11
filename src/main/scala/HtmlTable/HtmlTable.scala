package HtmlTable

import scala.collection.mutable.ListBuffer

class HtmlTable:

  private val table = new ListBuffer[ListBuffer[String]]

  def |(data: String): HtmlTable = {
    if (table.isEmpty) {
      table += new ListBuffer[String]
    }
    table.last += data
    this
  }

  def ||(data: String): HtmlTable = {
    table += new ListBuffer[String]
    table.last += data
    this
  }

  def toHtml: String = {
    val sb = new StringBuilder("<table>")
    for (row <- table) {
      sb ++= "<tr>"
      for (cell <- row) {
        sb ++= "<td>"
        sb ++= cell
        sb ++= "</td>"
      }
      sb ++= "</tr>"
    }
    sb ++= "</table>"
    sb.toString()
  }


