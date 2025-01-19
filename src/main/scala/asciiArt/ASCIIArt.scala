package asciiArt

import scala.annotation.targetName
import scala.collection.mutable.ArrayBuffer

class ASCIIArt(val rows: List[String] = Nil):

  @targetName("add")
  def +(row: String): ASCIIArt = new ASCIIArt(rows :+ row)

  def |(other: ASCIIArt): ASCIIArt = {
    ASCIIArt(List("Hello World"))
  }

  override def toString: String = rows.mkString("\n")





