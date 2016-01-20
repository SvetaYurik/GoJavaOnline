package lesson5;


public class OddNotOddSortOfArray {
    public static void main(String[] args) {
        double[] oddNotOddSort = {58.5, 53.9, 58.4, 2.7, 6.0, 89.0, 98.4, 64.1};
        boolean confirmation = true;


        while (confirmation) {
            confirmation = false;
            for (int i = 0; i < oddNotOddSort.length-1; i = i + 1) {
                if (oddNotOddSort[i] > oddNotOddSort[i + 1]) {
                    double oddValue = oddNotOddSort[i];


                    oddNotOddSort[i] = oddNotOddSort[i + 1];
                    oddNotOddSort[i + 1] = oddValue;

                    confirmation = true;


                }
            }
            for (int i = 1; i < oddNotOddSort.length-1; i = i + 1){
                if (oddNotOddSort[1] > oddNotOddSort[i+1]){
                    double notOddValue = oddNotOddSort[1];

                    oddNotOddSort[i] = oddNotOddSort[i+1];
                    oddNotOddSort[i+1] = notOddValue;

                    confirmation = true;
                }
            }

        }
        for (double element : oddNotOddSort) {
            System.out.println(element);
        }
    }
}