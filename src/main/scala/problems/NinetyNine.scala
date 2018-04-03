package main.scala.problems

import java.util

import scala.collection.immutable

/**
  * Created by vanosov on 02.04.2018.
  */
object NinetyNine{

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

  //P06 (*) Find out whether a list is a palindrome.
  def isPalindrome(list: List[Int]): Boolean = {
    if(list.equals(reverse(list)))
      true
    else
      false
  }

  //P07 (**) Flatten a nested list structure.
  def flatten(list: List[Any]): List[Any] = list flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }

  //P08 (**) Eliminate consecutive duplicates of list elements.
  //If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
  def compress(list: List[Any]): List[Any] = {
    if(list.isEmpty)
      Nil
    else if(!list.tail.isEmpty && (list.head == list.tail.head)){
      compress(list.tail)
    }
    else
      list.head +: compress(list.tail)
  }

  //P09 (**) Pack consecutive duplicates of list elements into sublists.
  //If a list contains repeated elements they should be placed in separate sublists.
  def pack(list: List[Any]): List[List[Any]] = {
    if(list.isEmpty)
      Nil
    List()
  }

}
