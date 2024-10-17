package firstThingsOfJava;

import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        if (number == 1){
            System.out.println("you have entered 1");
        }else {
            System.out.println("no no");
        }

        int a,b,c;
        a = 14;
        b = a++;
        c = ++a;

        System.out.format("a = %d\n",a);
        System.out.format("b = %d\n",b);
        System.out.format("c = %d\n",c);

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = input2.nextInt();

        String type = (n % 2 == 0) ? "even" : "odd";
        System.out.format("The number %d is an %s number.",n,type);

    }
}
