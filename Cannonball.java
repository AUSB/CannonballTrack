package Cannon_ball;

import java.util.ArrayList;

public class Cannonball {
	
	/**
	 * Attributes: Position of the Cannon, xVelocity and yVelocity of the Cannon Ball
	 */
	private Point position;
	private double xVelocity;
	private double yVelocity;
	
	/**
	 * Constructor: To create a new Cannon Ball with initial position and velocity.
	 * @param xPosition initializes the Position of the Cannon in x coordinates. y coordinates initially set to 0.
	 * 
	 */
	public Cannonball (double xPosition)
	{
		position=new Point (xPosition,0);
		xVelocity=0;
		yVelocity=0;
	}
	
	
	/**
	 * Method to move the  Cannon Ball
	 * @param deltaSec time to move the ball
	 * @return Point  the new position of the Cannon 
	 */
	private Point move(double deltaSec)
	{
		position.setxCoord(position.getxCoord()+xVelocity*deltaSec);
		position.setyCoord(position.getyCoord()+yVelocity*deltaSec-0.5*9.8*deltaSec*deltaSec);
		
		yVelocity-=9.81*deltaSec;
		return new Point(position.getxCoord(),position.getyCoord());
		
	}
	
	/**
	 * Method to get the current location of the ball
	 * 
	 * @return Point  representing the current location
	 */
	
	public Point getLocation()
	{
		return position;
	}
	
	
	/**
	 * Method to trace the trajectory of the Cannon ball for the given angle and velocity  over given time of the ball
	 * @param alpha angle
	 * @param v  velocity at given time
	 * @param deltaSec time elapsed
	 * @ return ArrayList array of points representing all locations
	 */
	
	public ArrayList<Point>shoot(double alpha, double v, double deltaSec)
	{
		ArrayList<Point>trajectory=new ArrayList<>();
		xVelocity=v*Math.cos(alpha*Math.PI/180);
		yVelocity=v*Math.sin(alpha*Math.PI/180);
		trajectory.add(new Point(position.getxCoord(), position.getyCoord()));
		
		do
		{
			trajectory.add(move(deltaSec));
		}
			
		
		while(position.getyCoord()>=0);
			{
				return trajectory;
			}
	}

}


