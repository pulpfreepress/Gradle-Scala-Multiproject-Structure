import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TestSuite extends FunSuite {
  test("This is an empty test") {
    def shouldBeTrue = true
    assert(shouldBeTrue)
  }
}
