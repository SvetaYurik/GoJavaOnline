package lesson4.theDistanceBetweenTwoPoints;

import java.util.Scanner;


public class TheDistanceBetweenTwoPoints {
    public static void main (String[] args){
        System.out.println("enter the coordinates of A ");
        Scanner ss = new Scanner(System.in);
        double coordinateX1 = ss.nextDouble();
        ss = new Scanner(System.in);
        double coordinateY1 = ss.nextDouble();
        System.out.println("enter the coordinates of B");
        ss = new Scanner(System.in);
        double coordinateX2 = ss.nextDouble();
        ss = new Scanner(System.in);
        double coordinateY2 = ss.nextDouble();
        double distance = theDistanceBetweenTwoPoints(coordinateX1, coordinateY1, coordinateX2, coordinateY2);
        System.out.println("The distance between two points = " + distance);

    }

    private static double theDistanceBetweenTwoPoints(double coordinateX1, double coordinateY1,
                                                      double coordinateX2, double coordinateY2 ) {
        return Math.pow(Math.pow(coordinateX1-coordinateX2, 2) + Math.pow(coordinateY1-coordinateY2, 2), 0.5);
    }
}
