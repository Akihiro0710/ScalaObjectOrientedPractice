

/**
  * Created by ta on 2017/12/24.
  */
class MyTriangle(point0: MyPoint, point1: MyPoint, point2: MyPoint) {
  private val points = Array(point0, point1, point2)

  def this(x0: Int, y0: Int, x1: Int, y1: Int, x2: Int, y2: Int) =
    this(new MyPoint(x0, y0), new MyPoint(x1, y1), new MyPoint(x2, y2))

  def getX(num: Int) = points(num).getX()

  def getY(num: Int) = points(num).getY()

  def distance(): Double = {
    def distance(i: Int): Double =
      if (i == 0) 0.0 else points(i - 1).distance(points(i % points.length)) + distance(i - 1)

    distance(points.length)
  }

  override def toString: String = getClass.getName + points.mkString("(", ", ", ")")
}
