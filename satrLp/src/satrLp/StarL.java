package satrLp;

import java.util.Scanner;

public class StarL {

	public static void main(String[] args) {
		System.out.print("enter a number");
		Scanner sc=new Scanner(System.in);
		int height=sc.nextInt();
		int width=sc.nextInt();
		int i, j, half = (height / 2);
    width--;
    for (i = 0; i < height; i++)
    {
        for (j = 0; j < width; j++)
        {
            if ((i == 0 || i == height - 1)
                && (j == 0 || j == width - 1))
                System.out.printf(" ");
            else if (j == 0)
                System.out.printf("*");
            else if (i == 0 && j <= height)
                System.out.printf("*");
            else if (i == height / 2
                    && j > height / 2)
                System.out.printf("*");
            else if (i > height / 2
                    && j == width - 1)
                System.out.printf("*");
            else if (i == height - 1
                    && j < width)
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        System.out.printf("\n");
    }
	}

}
