package d0_while;

import java.util.Scanner;

public class domenuwhie
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int conti;
        do
        {
            System.out.println("\f"); 
            System.out.println("1 for veg");
            System.out.println("2 or non veg");
            System.out.println("enter ur option");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("chole");
                break;
                case 2:
                System.out.println("mathew fish");
                break;
            }
            System.out.println("enter 1 to continue");
             conti=sc.nextInt();
        }
        while(conti==1);
        System.out.println("thanks");
    }
}

        
