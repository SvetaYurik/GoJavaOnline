package lesson5;


import java.util.Arrays;

public class MinMaxValueOfArray {
    public static void main (String[] args){
        int [] array = {5, 67, 23, 9, 3, 78, 25, 47, 23};
        Arrays.sort(array);
        System.out.println("Max value of array " + array[8]);
        System.out.println("Min value of array " + array[0]);

        }
}