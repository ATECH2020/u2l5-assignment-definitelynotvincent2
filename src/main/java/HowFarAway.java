import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

         System.out.print("Enter the latitude of the starting location: ");
         double myLat1 = in.nextDouble();
         System.out.print("Enter the longitude of the starting location: ");
         double myLon1 = in.nextDouble();
         System.out.print("Enter the latitude of the ending location: ");
         double myLat2 = in.nextDouble();
         System.out.print("Enter the longitude of the ending location: ");
         double myLon2 = in.nextDouble();
         
         GeoLocation myG = new GeoLocation(myLat1, myLon1);
         GeoLocation myG2 = new GeoLocation(myLat2, myLon2);

         System.out.println("The distance is " + myG.distanceFrom(myG2) + " miles");

    }
}