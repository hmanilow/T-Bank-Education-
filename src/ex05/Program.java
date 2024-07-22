package ex05;
import java.util.Scanner;
public class Program
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] field = new int[rows][cols];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                field[i][j] = scanner.nextInt();
            }
        }

        int queries = scanner.nextInt();
        for (int q = 0; q < queries; q++)
        {
            int x1 = scanner.nextInt() - 1;
            int y1 = scanner.nextInt() - 1;
            int x2 = scanner.nextInt() - 1;
            int y2 = scanner.nextInt() - 1;

            int sum = 0;
            if (y1 == y2 && x1 == x2)
                sum = field[x1][y1];
            else
            {
                for (int i = y1; i <= y2; i++)
                {
                    for (int j = x1; j <= x2; j++)
                    {
                        sum += field[i][j];
                    }
                }
            }
            System.out.println(sum);
        }
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        int i = 0;
//        int s = 0;
//        while (i < 2*n)
//        {
//            if (i%2==0)
//            {
//                if (i< n/2 | i>3*n/4)
//                {
//                    s +=i;
//                }
//            }
//            i += 1;
//        }
//        System.out.println(s);
    }
}
