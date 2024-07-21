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

        if (k < n && k != 0)
        {
            res = n / k * t + t;
            System.out.println(res);
        } else if (k == 0 | n == 0)
        {
            System.out.println(0);
        } else
        {
            System.out.println(t);
        }
    }
}