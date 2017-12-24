/**
  * Created by ta on 2017/12/03.
  */
class MyPoint(private val x: Int, private val y: Int) {
  def getX() = x

  def getY() = y

  def getR(): Double = distance(new MyPoint(0, 0))

  def getTheta(): Double = {
    val theta = math.atan2(getX(), getY())
    math.toDegrees(theta)
  }

  def equals(point: MyPoint): Boolean =
    getX() == point.getX() && getY() == point.getY()

  def distance(point: MyPoint): Double = {
    val diffX = getX() - point.getX()
    val diffY = getY() - point.getY()
    math.sqrt(List(diffX, diffY).map(i => math.pow(i, 2)).sum)
  }

  override def toString: String = getClass.getName + Array(getX(), getY()).mkString("(", ", ", ")")
}
