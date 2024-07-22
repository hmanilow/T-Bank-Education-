package ex02;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String song = input.nextLine();
        String[] songarr = song.split(" ");

        String names = input.nextLine();
        String[] namesarr = names.split(" ");

        int lenS = songarr.length;
        int lenN = namesarr.length;
        int pos = 0;

        if (lenS > lenN)
        {
            pos = lenS % lenN;
            if (pos == 0)
                System.out.println(namesarr[lenN-1]);
            else
                System.out.println(namesarr[pos-1]);
        }
        else
        {
            System.out.println(namesarr[lenS - 1]);
        }
    }
}
