package nisa;
public class Lab3 {
double n, r;
 

      void geometricseries() {
      for(int i= 0; i<n; i++)
      {
        double series = n * Math.pow(r , i);
        double sumGeometricSeries=0;
        SumGeoSeries+=series;
        System.out.println(sumGeoSeries + "/n");
      }
    }

      public static void main( String[] args ) {
      Lab3 g = new Lab3();
      g.n = 7 ;
      g.r = 2.1;
      g.geometricseries();
      }
}
