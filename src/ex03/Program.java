package ex03;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//public class Program {
//    public static void main(String[] args)
//    {
//        int[][] pairs =
//                {
//                {220, 284},
//                {1184, 1210},
//                {2620, 2924},
//                {5020, 5564},
//                {6232, 6368},
//                {10744, 10856},
//                {12285, 14595},
//                {17296, 18416},
//                {63020, 76084},
//                {66928, 66992},
//                {67095, 69615},
//                {79750, 88730},
//                {100485, 122265},
//                {122368, 139815},
//                {141664, 142310},
//                {171856, 176272},
//                {185368, 196724},
//                {280540, 308620},
//                {319550, 356408},
//                {365084, 389924},
//                {437456, 469028},
//                {503056, 522405},
//                {600392, 609928},
//                {624184, 635624},
//                {643336, 667964},
//                {726104, 802725}
//                };
//        Scanner input = new Scanner(System.in);
//        int k = input.nextInt();
//        for (int[] pair : pairs)
//        {
//            if (pair[0] <= k && pair[1] <= k)
//            {
//                System.out.println(pair[0] + " " + pair[1]);
//            }
//        }
//    }
//}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int limit = scanner.nextInt();


        List<int[]> amicablePairs = findAmicablePairs(limit);


        for (int[] pair : amicablePairs) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }

    private static List<int[]> findAmicablePairs(int limit) {
        List<int[]> amicablePairs = new ArrayList<>();

        for (int num1 = 2; num1 < limit; num1++) {
            int sumOfDivisors1 = calculateSumOfDivisors(num1);

            if (sumOfDivisors1 <= limit && sumOfDivisors1 != num1) {

                int sumOfDivisors2 = calculateSumOfDivisors(sumOfDivisors1);


                if (num1 == sumOfDivisors2) {

                    int[] sortedPair = new int[]{Math.min(num1, sumOfDivisors1), Math.max(num1, sumOfDivisors1)};


                    boolean isDuplicate = false;
                    for (int[] existingPair : amicablePairs) {
                        if (Arrays.equals(existingPair, sortedPair)) {
                            isDuplicate = true;
                            break;
                        }
                    }

                    if (!isDuplicate) {
                        amicablePairs.add(sortedPair);
                    }
                }
            }
        }

        return amicablePairs;
    }

    private static int calculateSumOfDivisors(int num) {
        int sumOfDivisors = 1;

        for (int divisor = 2; divisor <= Math.sqrt(num); divisor++) {
            if (num % divisor == 0) {
                sumOfDivisors += divisor;
                if (divisor != num / divisor) {
                    sumOfDivisors += num / divisor;
                }
            }
        }

        return sumOfDivisors;
    }
}
