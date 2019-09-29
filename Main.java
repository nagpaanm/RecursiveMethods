/*
 Anmol Nagpal (Sheridan College)


Every method in this program is implemented using recursion. The purpose of this
program is to demonstrate my understanding of recursion, as well as to continiue
evolving as a programmer/thinker/problem-solver/developer.

 */
package recursionpractice;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(bunnyEars(20));
        System.out.println(bunnyEars2(3));
        System.out.println(fibonacci(12));
        System.out.println(sumDigits(999));
        System.out.println(sumDigitsSquared(20));
        System.out.println(count7(732));
        System.out.println(count8(888));
    }

    //factorial calculator
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    //counts the number of ears given the amount of bunnies. Each bunny has 2
    //ears
    public static int bunnyEars(int n) {
        if (n == 0) {
            return 0;
        }
        return 2 + bunnyEars(n - 1);
    }

    //counts the number of ears given the amount of bunnies. odd bunnies (1, 3
    //,5.. etc) have 2 ears, and even bunnies (2, 4, 6.. etc) have 3 ears.
    public static int bunnyEars2(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 2 == 0) {
            return 3 + bunnyEars2(n - 1);
        } else {
            return 2 + bunnyEars2(n - 1);
        }
    }

    //fibonacci sequence calculator
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //calculators the sum of digits given a number n
    public static int sumDigits(int n) {
        if (n / 10 == 0) {
            return n;
        }
        return sumDigits(n % 10) + sumDigits(n / 10);
    }

    //calculates the sum of digits squared given a number n;
    public static int sumDigitsSquared(int n) {
        if (n / 10 == 0) {
            return n * n;
        }
        return sumDigitsSquared(n % 10) + sumDigitsSquared(n / 10);
    }

    //calculate the number of times the digit 7 appears in the number n
    public static int count7(int n) {
        if (n / 10 == 0) {
            if (n == 7) {
                return 1;
            }
            return 0;
        }
        return count7(n % 10) + count7(n / 10);
    }

    //Count the number of 8's in the number n. If there is an 8 with another 8
    //immediatey to its left, count it as 2
    public static int count8(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 10 == 8) {
            if ((n / 10) % 10 == 8) {
                return 2 + count8(n / 10);
            }
            return 1 + count8(n / 10);
        }
        return count8(n / 10);
    }
}
