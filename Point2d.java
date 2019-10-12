//LAB #6 Nisa nur yümlü 150201008
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Point {

    private double x;
    private double y;
    private string color;

    public Point () {
       x=0;
       y=0;
       color="black";
    }
    
    public Point(double x, double y) { 
  
       this.x=x;
       this.y=y;
       color="black";
    }

    
     public Point(double x, double y, String color) { 
      
       this.x=x;
       this.y=y;
       this.color=color;
    }

    public double getX() {

       return x;
    }

    public void setX(double x) {

      this.x=x;
    }

    
    public double getY() {

       return y;
    }

    public void setY(double y) {

      this.y=y;
    }
 
     
    public double getColor() {

       return color;
    }

    public void setColor(double color) {

      this.color=color;
    }
     
public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(new File("points-data.txt"));
		
		
		int nPoints = input.nextInt();
		
		
		double[] x = new double[7];	
		double[] y = new double[7];		
		String[] color = new String [7];
		
		
		for (int i = 0; i < nPoints; i++) {
			
			
			if (input.hasNextLine()) {
				
				String line = input.nextLine();
                                x[i] = Double.parseDouble(input.next());
                                y[i] = Double.parseDouble(input.next());
				
				
				
				
				
			} 
			
		} 
		 
     double distance(Point p) {


		double maxDistance = 0;
		double minDistance = Double.MAX_VALUE;
		 
                 for( int j=0; j<nPoints; j++) {
                    for(int k=j+1 ; k<nPoints; k++) {
                     double distance=points[j]..distance(points[k]);
                     if(distance>maxDistance)
                         maxDistance=distance;
                     if(distance>minDistance)
                         minDistance=distance;
             
                     }
                 }
           System.out.println("The maximum distance between two point is;"+(float) maxDistance);
           System.out.println("The minimum distanc between two point is;" +(float) minDistance);



    
}












