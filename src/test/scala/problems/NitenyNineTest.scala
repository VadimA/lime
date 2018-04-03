package problems

import org.scalatest.FunSuite

/**
  * Created by vanosov on 03.04.2018.
  */
class NitenyNineTest extends FunSuite{

  test("NitenyNine.last") {
    assert(NitenyNine.last(List(1,2,3,4,5)) === 5)
  }

  test("NitenyNine.prelast") {
    assert(NitenyNine.prelast(List(1,2,3,4,5)) === 4)
  }

  test("NitenyNine.nth") {
    assert(NitenyNine.nth(3,List(1,2,3,1,5,13,567)) === 1)
  }

  test("NitenyNine.length") {
    assert(NitenyNine.length(List("12","324","1")) === 3)
  }

  test("NitenyNine.reverse") {
    assert(NitenyNine.reverse(List(1,2,3,1,5,13,567)) === List(567, 13, 5, 1, 3, 2, 1))
  }

  test("NitenyNine.isPalindrome") {
    assert(NitenyNine.isPalindrome(List(1,2,3,4,3,2,1)) === true)
  }

  test("NitenyNine.flatten") {
    assert(NitenyNine.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) === List(1, 1, 2, 3, 5, 8))
  }

  test("NitenyNine.compress") {
    assert(NitenyNine.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List('a, 'b, 'c, 'a, 'd, 'e))
  }
}
