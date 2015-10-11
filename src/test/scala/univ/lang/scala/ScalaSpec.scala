

/**
 * Created by fsznajderman on 08/10/15.
 */
import org.specs2._


class HelloWorldSpec extends Specification {
  def is = s2"""

  This is a specification for the 'Hello world' string

  The 'Hello world' string should
    contain 11 characters                             $e1
    start with 'Hello'                                $e2
    end with 'world'                                  $e3
                                                      """

  def e1 = "Hello world" must haveSize(13)

  def e2 = "Hello world" must startWith("HelloE")

  def e3 = "Hello world" must endWith("world")
}