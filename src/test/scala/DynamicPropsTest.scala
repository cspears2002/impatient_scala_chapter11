import dynamicProperties.DynamicProps
import org.scalatest.funsuite.AnyFunSuite

class DynamicPropsTest extends AnyFunSuite:
  test("Set username") {
    val sysProps = DynamicProps(System.getProperties)
    sysProps.username = "Fred"
    assert(sysProps.username == "Fred")
  }
  test("Assign java.home") {
    val sysProps = DynamicProps(System.getProperties)
    val home = sysProps.java_home
    val javaHome = System.getProperty("java.home")
    assert(home == javaHome)
  }
  test("Add key/value pairs") {
    val sysProps = DynamicProps(System.getProperties)
    sysProps.add(username="Fred", password="Secret")
    assert(sysProps.username == "Fred")
    assert(sysProps.password == "Secret")
  }
