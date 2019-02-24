package Cannon_ball;

/**
 * A simple class for representing points in 2D Cartesian coordinates. Every
 * <code>Point</code> instance has an x and y coordinate.
 * 
 * 
 *
 */
public class Point {
	
	                                                          
private double xCoord;

private double yCoord;

/**
 * Initialize the point to have coordinates <code>(xCoord, yCoord)</code>.
 * 
 * @param xCoord
 *            the x-coordinate of the point
 * @param yCoord
 *            the y-coordinate of the point
 */
public Point(double xCoord, double yCoord)
{
	this.xCoord=xCoord;
	this.yCoord=yCoord;
	}

/**
 * Returns the xCoord component of the vector.
 * 
 * @return the xCoord component of the vector.
 */
public double getxCoord()
{return xCoord;
}

/**
 * Returns the yCoord component of the vector.
 * 
 * @return the yCoord component of the vector.
 */
public double getyCoord()
{return yCoord;
}

/**
 * Sets the xCoord component of the vector.
 * 
 * @param xCoord the new value of the x component.
 */
public void setxCoord(double xCoord)
{this.xCoord=xCoord;}

/**
 * Sets the yCoord component of the vector.
 * 
 * @param yCoord the new value of the y component.
 */
public void setyCoord(double yCoord)
{this.yCoord=yCoord;}


@Override
/**
 * Returns a string representation. 
 * 
 * @return a string representation of the point
 */
public String toString()
{
	return"("+xCoord+","+yCoord+")";
	
}
}
