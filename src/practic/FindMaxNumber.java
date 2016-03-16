package practic;

public class FindMaxNumber {
    public static void main(String[] args) {
        FindMaxNumber qwerty = new FindMaxNumber();
        qwerty.average(4, 4);
        System.out.println(qwerty);
    }
     public int average(int a, int b) {
        int number = 0;

        if (a >= 0 && b >= 0){
            number = (a/2 + b/2);

        }

        return number;
    }

}