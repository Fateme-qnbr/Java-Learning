public class App {
    public static void main(String[] args) throws Exception {
        String str = "test";
        System.out.println("String is: "+str);

        String str1 = new String("test");
        System.out.println("Another string: "+str1);

        int arr[];
        arr = new int[4];
        arr[0]= 0;
        arr[1]= 1;
        arr[2]= 2;
        System.out.println(arr);
        System.out.println(arr[2]);

    }
}