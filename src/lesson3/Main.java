package lesson3;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> musicInstrument = Arrays.asList("drum", "guitare", "piano", "trumpet");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Hello! you are in a music store ;) Please, choose instrument for you like: drum, or piano, or trumpet, or guitare ");
            try {
                String instrument = sc.nextLine();

                if (musicInstrument.contains(instrument)) {

                    System.out.println("You have a good taste!");
                } else {
                    throw new IllegalArgumentException();

                }
                System.out.println("Choose three tools to create a rock band");

                sc = new Scanner(System.in);
                String firstRockBandInstrument = sc.nextLine();
                String secondRockBandInstrument = sc.nextLine();
                String thirdRockBandInstrument = sc.nextLine();

                if ((!(musicInstrument.contains(firstRockBandInstrument))) ||
                        (!(musicInstrument.contains(secondRockBandInstrument))) ||
                        (!(musicInstrument.contains(thirdRockBandInstrument)))) {
                    throw new IllegalArgumentException();
                } else if ((firstRockBandInstrument.equals(secondRockBandInstrument) &&
                        secondRockBandInstrument.equals(thirdRockBandInstrument))) {
                    throw new RochBandException();
                } else {
                    System.out.println("OOO, good choice! You're the rock star");
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Sorry! enter the instruments that are in stock!");
            } catch (RochBandException e) {
                System.out.println("problems with sound :( Choose three different instruments");
            }

        }


    }
}



