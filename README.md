# CannonballTrack
Define a class Point that represents a Point in two dimensional plane. In this class,
define a parameterized constructor to create a Point at the given coordinates.
• Define getter and setter methods to get and set the value of xCoord and yCoord of
the point object.
• Override toString method to print the coordinates.
• Define a class Cannonball that represents a Cannon Ball. Import java.util.ArrayList.
• In this class, store the location and velocity of the ball in instance variables.
• Define a constructor to initialize the Cannonball to start at the given location.
• Define a method move that moves the ball to the next location after deltaSec time
period and returns the location as a Point object.
• Define method getLocation that returns the current location of the Cannonball.
• Define a method shoot that simulates the moving ball and stores the position of the
ball at the interval of deltaSec seconds in an ArrayList.
• In this method, define an ArrayList to store Point objects.
• Initialize the xVelocity and yVelocity using the given angle and initial velocity.
• Call move method and add the result to ArrayList.
Return the ArrayList.
• Use the class cannonBalltrajectory to plot the movement of the Cannonball.
