package lesson4.transformationTemperature;

import java.util.Objects;
import java.util.Scanner;

public class ConvertTemperature {
    public static void main (String[] args){
        System.out.print("Enter the temperature: ");
        Scanner ss = new Scanner(System.in);
        double temperatureValue = ss.nextDouble();
        System.out.println("Select units (C - Celsius, F - Fahrenheit)" );
        ss = new Scanner(System.in);
        String units = ss.nextLine();
        double tempRez = conversionOfTemperature(temperatureValue, units);
        System.out.println("Temperature value = " + tempRez);
    }

    private static double conversionOfTemperature(double temperatureValue, String units) {
        if (Objects.equals(units, "F")){
            return (temperatureValue * 1.8) + 32;

        }  else if (Objects.equals(units, "C")){
            return (temperatureValue - 32) / 1.8;
        }else return 0;
    }

}
