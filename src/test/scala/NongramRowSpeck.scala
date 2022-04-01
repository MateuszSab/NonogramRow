import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class NongramRowSpeck extends AnyFlatSpec with should.Matchers {

  "countNongram" should "Given a binary array of any length, return an array of positive integers " +
    "that represent the lengths of the sets of consecutive 1's in the input array, " +
    "in order from left to right." in {
    import NongramRow._
    countNongram(List(1, 1, 1, 0, 0, 0, 1, 1, 1)) shouldBe List(3, 3)
    countNongram(List(0, 0, 0, 0)) shouldBe List()
    countNongram(List()) shouldBe List()
  }

  "pack" should "create a list of lists with elements that repeats" in {
    import NongramRow._
    pack(List(1, 1, 1, 0, 0, 2, 2, 2, 3)) shouldBe List(List(1, 1, 1), List(0, 0), List(2, 2, 2), List(3))
  }

}
