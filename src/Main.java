import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int t = (input.nextInt()*2);
        int n = input.nextInt();

        int res = 0;

        if (k == 0 || n == 0)
        {
            res = 0;
        } else if (k >= n)
        {
            res = t;
        } else
        {
            res = n / k * t;
            if (n % k != 0)
            {
                res += t;
            }
        }
        System.out.println(res);
    }
}