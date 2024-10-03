package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledRectangle(0.5,0.5,0.4,0.25);
		StdDraw.setPenColor(Color.black);
		StdDraw.filledEllipse(0.55, 0.5, 0.3, 0.15);
		double []x =  {0.25, 0.55, 0.5};
		double [] y = {0.25, 0.25, 0.55};
		StdDraw.filledPolygon(x, y);
		
		
		
		
		
		
		
		
	}
}