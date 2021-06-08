package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    System.out.println("The sum of the digits is number 125 is " + sumDigits((125)));
        System.out.println("The sum of the digits is number 125 is " + sumDigits((-125)));
        System.out.println("The sum of the digits is number 125 is " + sumDigits((4)));
        System.out.println("The sum of the digits is number 125 is " + sumDigits((32123)));
    }

    private static int sumDigits(int num) {
        if (num < 10) {
            return -1;
        }

        int sum = 0;

        // 125 -> 125 / 10 = 12 - 12 * 10 = 120 -> 125 - 120 = 5
        while(num > 0) {
            // extract the least significant digit
            int digit = num % 10;
            sum += digit;

            // drop least signifiicant digit
            num /= 10; // same as number = num / 10
        }
        return sum;
    }
}























