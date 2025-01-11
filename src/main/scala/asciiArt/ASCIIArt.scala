package asciiArt

import scala.collection.mutable.ArrayBuffer

class ASCIIArt(art: String):

  // Need to read the ascii art into this buffer
  private val myArtArray = art.split("\n")

  override def toString: String = {
    myArtArray.mkString("\n")
  }
  


