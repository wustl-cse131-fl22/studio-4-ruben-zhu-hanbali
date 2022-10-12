package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		 StdDraw.setXscale(0, 22);
		 StdDraw.setYscale(0, 16);
		 
		 StdDraw.setPenColor(100, 42, 201);
		   StdDraw.filledRectangle(3, 3, 3, 3);
		   StdDraw.filledRectangle(3, 13, 3, 3);
		   StdDraw.filledRectangle(16, 3, 6, 3);
		   StdDraw.filledRectangle(16, 13, 6, 3);
		   StdDraw.setPenColor(75, 142, 127);
		   StdDraw.filledRectangle(11, 8, 11, 1);
		   StdDraw.filledRectangle(8, 8, 1, 8);
	}
	}
