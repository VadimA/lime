package scala.problems

/**
  * Created by vanosov on 02.04.2018.
  */
object NinetyNine {

  //P01 (*) Find the last element of a list.
  def last(list: List[Int]): Int ={
    if(list.tail.isEmpty)
      list.head
    else
      last(list.tail)
  }

  //P02 (*) Find the last but one element of a list.
  def prelast(list: List[Int]): Int ={
    if(list.tail.size == 1)
      list.head
    else
      prelast(list.tail)
  }

  //P03 (*) Find the Kth element of a list.
  def nth(index:Int, list: List[Int]): Int = {
    if (list.isEmpty)
      -1
    else if (index == 0)
      list.head
    else
      nth(index - 1, list.tail)
  }

  //Find the number of elements of a list.
  def length[A](list: List[A]): Int = {
    if(list.isEmpty)
      0
    else
      1 + length(list.tail)
  }

  //P05 (*) Reverse a list.
  def reverse(list: List[Int]): List[Int] = {
    if(list.isEmpty)
      Nil
    else
      reverse(list.tail) :+ list.head
  }

  def main(args:Array[String]): Unit = {
    println(last(List(1,2,3,1,5,13,567)));
    println(prelast(List(1,2,3,1,5,13,567)));
    println(nth(6,List(1,2,3,1,5,13,567)));
    println(length(List("12","324","1")));
    println(reverse(List(1,2,3,1,5,13,567)));
  }
}
