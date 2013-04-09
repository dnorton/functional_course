package week1

/**
 * Created with IntelliJ IDEA.
 */
object PascalExercise {

  def pascal(c: Int, r: Int): Int = {
    if (c == 0) {
      1
    } else if ( c > r) {
      0
    } else  {
      pascal(c-1, r-1) + pascal(c, r-1)
    }
  }

}
