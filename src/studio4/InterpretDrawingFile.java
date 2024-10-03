package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		
		int redComponent = in.nextInt();
		
		int greenComponent = in.nextInt();
		
		int blueComponent = in.nextInt(); 
		
		boolean isFilled = in.nextBoolean();
		
		double x = in.nextDouble();
	
		double y = in.nextDouble();
		
		double halfWidth = in.nextDouble();
		
		double halfHeight = in.nextDouble();
		
		double trianglex = in.nextDouble();
		
		double triangley = in.nextDouble();
		

		
		Color machine = new Color (redComponent, greenComponent, blueComponent);
		
		StdDraw.setPenColor(machine);
			if (shapeType.equals("rectangle")) {
				if (isFilled==true) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
				}
				else {
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
				}
			}
			if (shapeType.equals("ellipse")) {
				if(isFilled==true) {
				StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
				}
				else {
				StdDraw.ellipse(x, y, halfWidth, halfHeight);
				}
			}
			
			double []shook = {x, y, halfWidth};
			
			double [] doug = {halfHeight, trianglex, triangley};
			
			StdDraw.polygon(shook, doug);
			
		
	}
}
