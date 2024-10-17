package firstThingsOfJava;
import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

//      primitive data type
//      byte , short , int , long , float , double
//      boolean , char


        String str = "test";
        System.out.println("String is: "+str);

        String str1 = "test";
        System.out.println("Another string: "+str1);

        int[] arr;
        arr = new int[4];
        arr[0]= 0;
        arr[1]= 1;
        arr[2]= 2;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);

        double pi = Math.PI;
        System.out.format("pi = %f\n",pi);


        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.format("n  = %08d\n",n);
    }
}