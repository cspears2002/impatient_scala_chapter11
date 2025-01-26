package asciiArt

import scala.annotation.targetName
import scala.collection.mutable.ArrayBuffer

class ASCIIArt(val rows: List[String] = Nil):

  @targetName("add")
  def +(row: String): ASCIIArt = new ASCIIArt(rows :+ row)

  def |(other: ASCIIArt): ASCIIArt = {
    val padLen = rows.foldLeft(0) {(len, s) =>
      if (len > s.length) len
      else s.length
    }
    val result = new ArrayBuffer[String]()
    result ++= rows

    val buf = new StringBuilder()
    var i = 0
    for (row <- other.rows) {
      if(i >= result.length) {
        result += ""
      }

      buf.clear()
      buf ++= result(i)
      while (buf.length < padLen) {
        buf.append(" ")
      }

      buf ++= row
      result(i) = buf.toString()
      i += 1
    }
    new ASCIIArt(result.toList)
  }

  override def toString: String = rows.mkString("\n")





