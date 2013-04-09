
//def abs(x:Double) = if (x >= 0) x else -x
//
//abs(-124)

def pascal(c: Int, r: Int): Int = {
  if (c == 0) {
    1
  } else if ( c > r) {
    0
  } else  {
    pascal(c-1, r-1) + pascal(c, r-1)
  }
}

pascal(2,4)

/**
* Exercise 2
*/
def balance(chars: List[Char]): Boolean = {
  def iter(chars: List[Char], count:Int):Int = {

    if (count < 0 || chars.isEmpty) {
      count
    } else {
      val head:Char = chars.head

      if (head == '(' && count >= 0) iter(chars.tail, count + 1)
      else if (head == ')') iter(chars.tail, count - 1)
      else iter(chars.tail, count)

    }
  }
  iter(chars, 0) == 0

}

/**
* Exercise 3
*/
def countChange(money: Int, coins: List[Int]): Int = {
    def iter(money:Int, coins: List[Int], count:Int):Int = {
      if (money == 0) count + 1
      else if (coins.isEmpty || money < 0) count
      else {
        iter(money, coins.tail, count) + iter(money - coins.head, coins, count)
      }
    }
    iter(money, coins, 0)
}
