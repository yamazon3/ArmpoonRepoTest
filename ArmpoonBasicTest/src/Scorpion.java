//MIKE YAMSEK
//This program creates a scorpion and allows for his movements...

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Random;

public class Scorpion {
	
//	top left pixel location relative to panel (for the sprite) (x-axis)
	private double x_loc;
	//top left pixel location relative to panel (for the sprite) (y-axis)
	private double y_loc;
	
	// Self explanatory
	private boolean movingUp;
	private boolean movingLeft;
	private boolean movingDown;
	private boolean movingRight;
	
	//x & y velocities
	//while probably not needed, possibly for running or jumping
	private double xVelocity;
	private double yVelocity;
	
	//size of the scorpions sprite
	public static int WIDTH;
	public static int HEIGHT;
	//color of certain parts of scorpion
	private Color color;
	
	public Scorpion(){
		WIDTH = 60;
		HEIGHT = 30;
		x_loc = 200;
		y_loc = 100;
		halt();
	}
	
	public Scorpion(int w){
		WIDTH = w;
		HEIGHT = w/2;
		x_loc = 200;
		y_loc = 100;
		halt();
	}
	
	public Scorpion(int w, int h){
		WIDTH = w;
		HEIGHT = h;
		x_loc = 200;
		y_loc = 100;
		halt();
	}
	
	public void draw(Graphics2D g2){
		//draw scorion here
		Ellipse2D.Double ball = new Ellipse2D.Double(x_loc,y_loc,48,48);
		g2.setColor(Color.RED);
		g2.draw(ball);
		g2.fill(ball);
		//draw three circles for an arm
		
		//draw two elipses for the body
		
		//draw 5 or 6 circles for the tail
		
	}
	
	public void move(){
		
	}
	
	private void halt() {
		movingUp = false;
		movingLeft = false;
		movingDown = false;
		movingRight = false;
	}
	
	public double getX_Loc() {
		return x_loc;
	}
	
	public double getY_Loc() {
		return y_loc;
	}
	
	public void setX_Loc(int x_loc) {
		this.x_loc = x_loc;
	}
	
	public void setY_Loc(int y_loc) {
		this.y_loc = y_loc;
	}
	
	public void setMovingUp(boolean movingUp) {
		this.movingUp = movingUp;
	}
	
	public void setMovingLeft(boolean movingLeft) {
		this.movingLeft = movingLeft;
	}
	
	public void setMovingDown(boolean movingDown) {
		this.movingDown = movingDown;
	}
	
	public void setMovingRight(boolean movingRight) {
		this.movingRight = movingRight;
	}
	
	
}
