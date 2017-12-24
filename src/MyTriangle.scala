

/**
  * Created by ta on 2017/12/24.
  */
class MyTriangle(x0: Int, y0: Int, x1: Int, y1: Int, x2: Int, y2: Int) {
  private val points = new Array[MyPoint](3)
  points(0) = new MyPoint(x0, y0)
  points(1) = new MyPoint(x1, y1)
  points(2) = new MyPoint(x2, y2)

  def getX(num: Int) = points(num).getX()

  def getY(num: Int) = points(num).getY()

  def distance(): Double = {
    def distance(i: Int): Double =
      if (i == 0) 0.0 else points(i - 1).distance(points(i % points.length)) + distance(i - 1)

    distance(points.length)
  }

  override def toString: String = getClass.getName + points.mkString("(", ", ", ")")
}
