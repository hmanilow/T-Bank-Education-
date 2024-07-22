package ex04;
import java.math.BigInteger;
import java.util.Scanner;
public class Program
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();


        double slope = Math.sqrt(2);


        double x = 0;
        double y = 0;


        int corner = 0;

        while (true)
        {
            x += slope;
            y += slope;

            if (y >= height || y <= 0)
            {
                slope *= -1;

                if (y >= height)
                {
                    corner = 2;
                } else
                {
                    corner = 3;
                }


                break;
            }


            if (x >= width || x <= 0)
            {

                slope *= -1;

                if (y > 0) {
                    if (x > 0)
                    {
                        corner = 2;
                    } else
                    {
                        corner = 1;
                    }
                } else
                {
                    if (x > 0)
                    {
                        corner = 4;
                    } else
                    {
                        corner = 3;
                    }
                }
                break;
            }
        }

        System.out.println(corner);
    }
}
