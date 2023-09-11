package COMPANY;

import java.util.Scanner;

public class Search_6 {
    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }

    // Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found, return its index
            } else if (arr[mid] < target) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the element to search using Linear Search: ");
        int linearTarget = scanner.nextInt();

        // Linear Search
        int linearResult = linearSearch(arr, linearTarget);

        if (linearResult != -1) {
            System.out.println("Linear Search: Element found at index: " + linearResult);
        } else {
            System.out.println("Linear Search: Element not found in the array.");
        }

        // Binary Search
        System.out.print("Enter the element to search using Binary Search: ");
        int binaryTarget = scanner.nextInt();
        
        int binaryResult = binarySearch(arr, binaryTarget);

        if (binaryResult != -1) {
            System.out.println("Binary Search: Element found at index: " + binaryResult);
        } else {
            System.out.println("Binary Search: Element not found in the array.");
        }
        
        scanner.close();
    }
}
