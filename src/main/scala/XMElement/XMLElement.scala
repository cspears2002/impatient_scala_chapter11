package XMElement

import scala.language.dynamics
import scala.xml.{Elem, Node, NodeSeq, XML}

class XMLElement(val elems: Elem, val propName: String = "", val prop: Option[NodeSeq] = None) extends Dynamic:
  def selectDynamic(name: String): XMLElement =
    val newName = if propName.isEmpty then name else propName + "." + name
    val newProp = Option(elems \ "newName")
    XMElement.XMLElement(elems, newName, newProp)

