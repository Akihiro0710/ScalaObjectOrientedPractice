/**
  * Created by ta on 2017/12/24.
  */
class MyLine(startX: Int, startY: Int, endX: Int, endY: Int) {
  private val startPoint = new MyPoint(startX, startY)
  private val endPoint = new MyPoint(endX, endY)

  def getStartX(): Int = startPoint.getX()

  def getStartY(): Int = startPoint.getY()

  def getEndX(): Int = endPoint.getX()

  def getEndY(): Int = endPoint.getY()

  def distance(): Double = startPoint.distance(endPoint)

  override def toString: String = getClass.getName + "(" + startPoint + ", " + endPoint + ")"
}
