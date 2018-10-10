public class ZajeciaPierwsze {
    /*
    Exercise 1:
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, print to console true if one or the other is teen, but not both.
Example:
int a = 1;
int b = 13;
if a or b is "teen" print "teen"
     */

    public static void oneTeen(int a, int b) {

        if ((a < 12 || a > 20) && (b > 11 && b < 20)) System.out.println("True");
        if ((a > 11 && a < 20) && (b < 12 || b > 20)) System.out.println("True");
    }

    /*
    Exercise 2:
    Given 3 int values, a b c, print to console their sum.
    However, if one of the values is 13 then it does not count towards the sum and values to its right do not count.
    So for example, if b is 13, then both b and c do not count.
    Example:
    int a = 1;
    int b = 13;
    int c = 2;
    should print 1
     */
    public static void not13(int a, int b, int c) {
        int suma = 0;
        if (a != 13 && b != 13 && c != 13)
            System.out.println(suma = a + b + c);
        else if (a != 13 && b != 13 && c == 13)
            System.out.println(suma = a + b);
        else if (a != 13 && b == 13)
            System.out.println(suma = a);
        else {
            System.out.println(suma);
        }
    }

    /*
    Exercise 3:
    Given an array of ints, print to console true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
    Example:
    int[] array = {3,2,14,1,2,3,6};
    should print true
    */
    public static void Array123(int n) {
        int[] array = {3, 2, 14, 1, 2, 1, 6, 1, 1, 3};
        for (int i = 0; i < n; i++) {
            if (array[i] == 1 && array[i + 1] == 2 && array[i + 2] == 3) {
                System.out.println("True");
            }
        }
    }
}
