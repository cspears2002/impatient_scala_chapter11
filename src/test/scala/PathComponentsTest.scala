import java.nio.file.Path
import java.nio.file.Paths
import org.scalatest.funsuite.AnyFunSuite
import pathComponents.PathComponents

import scala.language.postfixOps

class PathComponentsTest extends AnyFunSuite:
  val pathStr: String = "/home/cay/readme.txt"
  val myPath: Path = Paths.get(pathStr)

  test("Make PathComponents") {
    val comps: String = PathComponents(myPath)
    assert(comps == pathStr)
    println(comps)
  }

  test("Destructure PathComponents") {
    val PathComponents(root, myDir, myFile) = myPath
    assert(root == "home")
    assert(myDir == "cay")
    assert(myFile == "readme.txt")
  }
