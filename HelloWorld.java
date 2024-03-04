import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] doc) {
        Scanner zen = new Scanner(System.in);
        
        int arr[] = {1,2,3,2,6,5};

        System.out.print("Enter the index of element you want to see: ");
        int element = zen.nextInt();

        System.out.println("you are searching for "+arr[element]);
    }
}