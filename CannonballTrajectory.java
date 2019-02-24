package Cannon_ball;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class CannonballTrajectory extends JPanel {
	ArrayList<Point> trajectory;
	public CannonballTrajectory(ArrayList<Point>trajectory)
	{
		this.trajectory=trajectory;
	}
	
public void paintComponent(Graphics g)
{
	Graphics2D g2=(Graphics2D)g;
	int height=getHeight();
	Point start=trajectory.get(0);
	Point current;
	g2.setColor(Color.BLACK);
	for(int idx=1; idx<trajectory.size(); idx++)
	{
		current=trajectory.get(idx);
		g2.drawLine((int)start.getxCoord(),height-(int)start.getyCoord(),(int)current.getxCoord(),height-(int)current.getyCoord());
	start=current;
	}
}

//
public static void main(String[]args)
{
	JFrame frame=new JFrame("Cannon Ball" + "Trajectory");
	Cannonball myCannon=new Cannonball(0);
	CannonballTrajectory trajectory=new CannonballTrajectory(myCannon.shoot(45,70,1));
	CannonballTrajectory trajectory1=new CannonballTrajectory(myCannon.shoot(70,80,1));
	frame.add(trajectory);
	frame.setSize(550,350);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
