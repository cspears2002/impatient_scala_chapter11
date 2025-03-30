package nameWithTitle

import nameWithTitle.Title.Value

import scala.language.postfixOps

object Title extends Enumeration:
  val DR: Value = Value("Dr.")
  val MR: Value = Value("Mr.")
  val MRS: Value = Value("Mrs.")
  val MS: Value = Value("Ms.")

class NameWithTitle(val name: String)

object NameWithTitle:
  def apply(name: String) = s"$name"

  def unapplySeq(name: String): Option[(Any, Seq[String])] =
    val nameSeq: Seq[String] = name.split("\\s").toSeq
    val title = nameSeq.head match {
      case "Dr." => Title.DR
      case "Mr." => Title.MR
      case "Mrs." => Title.MRS
      case "Ms." => Title.MS
      case _ => None
    }
    if title != None then
      Some(title, nameSeq.tail)
    else
      None
      