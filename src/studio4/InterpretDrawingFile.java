package studio4;

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
		int redComponent = 0;
		int greenComponent = 0;
		int blueComponent =0;
		boolean isFilled = true;
		double x = 0;
		double y = 0;
		double halfWidth = 0;
		double halfHeight = 0;
		   
		 if(shapeType.equals("rectangle")) {
				 redComponent = in.nextInt();
				 greenComponent = in.nextInt();
				 blueComponent = in.nextInt();
				 isFilled = in.nextBoolean();
				 x = in.nextDouble();
				 y = in.nextDouble();
				 halfWidth = in.nextDouble();
				 halfHeight = in.nextDouble();
				   StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		  if(isFilled == true)
		   StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
		  else
			  StdDraw.rectangle(x, y, halfWidth, halfHeight);
		 }

		 if(shapeType.equals("ellipse")) {
				 redComponent = in.nextInt();
				 greenComponent = in.nextInt();
				 blueComponent = in.nextInt();
				 isFilled = in.nextBoolean();
				 x = in.nextDouble();
				 y = in.nextDouble();
				 halfWidth = in.nextDouble();
				 halfHeight = in.nextDouble();
				   StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			 if(isFilled == true)
				   StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
				  else
					  StdDraw.ellipse(x, y, halfWidth, halfHeight);
				 }

		if 	(shapeType.equals("triangle")) {
	
			double [] x1 = new double [3];
			double [] y1 = new double [3];

			 redComponent = in.nextInt();
			 greenComponent = in.nextInt();
			 blueComponent = in.nextInt();
			 isFilled = in.nextBoolean();
			x1 [0] = in.nextDouble();
			x1 [1] = in.nextDouble();
			x1 [2] = in.nextDouble();
			y1 [0] = in.nextDouble();
			y1 [1] = in.nextDouble();
			y1 [2] = in.nextDouble();

			   StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			
			 if(isFilled == true)
				   StdDraw.filledPolygon(x1,y1);
			 else
				 StdDraw.polygon(x1,y1);

		}
	}
}
