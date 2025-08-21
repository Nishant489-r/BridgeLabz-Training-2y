package ProgrammingElements.Level1;

public class VolOfEarth {
    public static void main(String[]args){
        double radiusKm = 6378;

        
        double volumeKm3 = (4.0 / 3.0) * 3.14 * radiusKm*radiusKm*radiusKm;

    
        double radiusMiles = radiusKm * 0.621371;

        double volumeMi3 = (4.0 / 3.0) * 3.14*radiusMiles*radiusMiles*radiusMiles;

        System.out.println("The volume of Earth in cubic kilometers is " + String.format("%.2f", volumeKm3)+"and in miles is "+ String.format("%.2f", volumeMi3));
    

    }
}
