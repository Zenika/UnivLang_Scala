package univ.lang.scala

/**
 * Created by fsznajderman on 08/10/15.
 */

import org.specs2._

class HelloWorldSpec extends Specification {
  def is = s2"""

  This is a specification for the 'Hi' class with method
  envSbtValidation

  Call Hi with 'Hello' has parameter should 

    equals to 'Hello World'                          $e1
    contain 11 characters                            $e2
    start with 'Hello'                               $e3
    end with 'world'                                 $e4
                                                      """

  val r = Hi.envSbtValidation("Hello")

  def e1 = r == "Hello World";

  def e2 = r must haveSize(11)

  def e3 = r must startWith("Hello")

  def e4 = r must endWith("World")
}