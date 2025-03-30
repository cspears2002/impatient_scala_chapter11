package nameWithTitle

import nameWithTitle.Title

class NameWithTitle(val name: String)

object NameWithTitle:
  def apply(name: String) = s"$name"

  def unapplySeq(name: String): Option[Seq[String]] =
    val nameSeq: Seq[String] = name.split("\\s").toSeq
    if nameSeq.nonEmpty then Some(nameSeq) else None
      