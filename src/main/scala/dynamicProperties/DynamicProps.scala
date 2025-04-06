package dynamicProperties

import scala.language.dynamics

class DynamicProps(val props: java.util.Properties) extends Dynamic:
  def updateDynamic(name: String)(value: String): AnyRef =
    props.setProperty(name.replaceAll("_", ".'"), value)
  def selectDynamic(name: String): String =
    props.getProperty(name.replaceAll("_", "."))
  def applyDynamicNamed(name: String)(args: (String, String)*): Any =
    if name != "add" then throw IllegalArgumentException()
    for (k, v) <- args do
      props.setProperty(k.replaceAll("_", "."), v)
