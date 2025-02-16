package pathComponents

import java.nio.file.Path

class PathComponents(val myPath: Path)

object PathComponents:
  def apply(myPath: Path) = s"$myPath"

  def unapply(input: Path): (Path, Path) =
    (input.getParent, input.getFileName)
