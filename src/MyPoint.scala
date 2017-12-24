/**
  * Created by ta on 2017/12/03.
  */
class MyPoint(private val x: Int, private val y: Int) {
  def getX() = x

  def getY() = y

  def getR(): Double = math.sqrt(List(getX(), getY()).map(i => math.pow(i, 2)).sum)

  def getTheta(): Double = {
    val theta = math.atan2(getX(), getY())
    math.toDegrees(theta)
  }

  override def toString: String = getClass.getName + "(" + getX() + ", " + getY() + ")"
}
