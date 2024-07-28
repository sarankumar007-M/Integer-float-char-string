package reverse.order;

import java.util.Scanner;
public class ReverseOrder {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array elements in reverse order are:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println("Element " + (size - i) + ": " + arr[i]);
        }

        scanner.close();
    }
}


