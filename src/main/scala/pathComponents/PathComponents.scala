package pathComponents

import java.nio.file.Path

class PathComponents(val myPath: Path)

object PathComponents:
  def apply(myPath: Path) = s"$myPath"

  def unapplySeq(input: Path): Seq[String] = 
    input.toString.stripPrefix("/").split("/").toSeq
