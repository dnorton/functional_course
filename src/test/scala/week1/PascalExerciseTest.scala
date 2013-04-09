package week1

import org.scalatest.junit.AssertionsForJUnit

import org.junit.Assert._
import org.junit.Test
import org.junit.Before

/**
 * Created with IntelliJ IDEA.
 */
class PascalExerciseTest extends AssertionsForJUnit{

  import PascalExercise.pascal
  @Test def testPascal() {
    assertEquals(1, pascal(0, 1))
    assertEquals(6, pascal(2,4))
  }


}
