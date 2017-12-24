/**
  * Created by ta on 2017/12/24.
  */
class MyLine(startPoint: MyPoint, endPoint: MyPoint) {
  def this(startX: Int, startY: Int, endX: Int, endY: Int) =
    this(new MyPoint(startX, startY), new MyPoint(endX, endY))

  def getStartX(): Int = startPoint.getX()

  def getStartY(): Int = startPoint.getY()

  def getEndX(): Int = endPoint.getX()

  def getEndY(): Int = endPoint.getY()

  def distance(): Double = startPoint.distance(endPoint)

  override def toString: String = getClass.getName + "(" + startPoint + ", " + endPoint + ")"
}
