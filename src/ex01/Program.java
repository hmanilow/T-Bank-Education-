package ex01;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int r = input.nextInt();
        int pairs = 0;

        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = input.nextInt();
        }

        for (int i = 0; i<n-1; i++)
        {
            for (int j = i; j<n; j++)
            {
                if (a[i]+r< a[j])
                    pairs +=1;
            }
        }
        System.out.println(pairs);
    }
}
