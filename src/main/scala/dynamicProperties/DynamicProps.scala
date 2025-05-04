package dynamicProperties

import scala.language.dynamics

class DynamicProps(val props: java.util.Properties, val propName: String = "", val prop: Option[String] = None) extends Dynamic:
  def updateDynamic(name: String)(value: String): AnyRef =
    val newName = if propName.isEmpty then name else propName + "." + name
    props.setProperty(newName, value)
  def selectDynamic(name: String): DynamicProps =
    val newName = if propName.isEmpty then name else propName + "." + name
    val newProp = Option(props.getProperty(newName))
    DynamicProps(props, newName, newProp)
  def applyDynamicNamed(name: String)(args: (String, String)*): Any =
    if name != "add" then throw IllegalArgumentException()
    for (k, v) <- args do
      props.setProperty(k, v)

  override def toString: String = prop.getOrElse("n/a")
