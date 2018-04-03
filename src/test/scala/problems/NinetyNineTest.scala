package problems

import main.scala.problems.NinetyNine
import org.scalatest.FunSuite

/**
  * Created by vanosov on 03.04.2018.
  */
class NinetyNineTest extends FunSuite{

  test("NinetyNine.last") {
    assert(NinetyNine.last(List(1,2,3,4,5)) === 5)
  }

  test("NinetyNine.prelast") {
    assert(NinetyNine.prelast(List(1,2,3,4,5)) === 4)
  }

  test("NinetyNine.nth") {
    assert(NinetyNine.nth(3,List(1,2,3,1,5,13,567)) === 1)
  }

  test("NinetyNine.length") {
    assert(NinetyNine.length(List("12","324","1")) === 3)
  }

  test("NinetyNine.reverse") {
    assert(NinetyNine.reverse(List(1,2,3,1,5,13,567)) === List(567, 13, 5, 1, 3, 2, 1))
  }

  test("NinetyNine.isPalindrome") {
    assert(NinetyNine.isPalindrome(List(1,2,3,4,3,2,1)) === true)
  }

  test("NinetyNine.flatten") {
    assert(NinetyNine.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) === List(1, 1, 2, 3, 5, 8))
  }

  test("NinetyNine.compress") {
    assert(NinetyNine.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List('a, 'b, 'c, 'a, 'd, 'e))
  }
}
