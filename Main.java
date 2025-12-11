// Name: Mirsab Sohail
// Class: CS143
// Asssignment: HW Extra Credit 
// Problem Used: arrayMystery3 from Week 1 Code StepByStep

// Prompt Given: I want you to write a Java program, specifically a method called "indexOf". 
// I want the program to return an index of a value in a array of integers. 
// The method itself should return the index of the of the target value in its first 
// occurrence in the array. If the value isn't in the array, then the value returned should 
// be -1. You should also write out an example of the method working, preferably an example 
// of the number inside the array with a returning index number and another example of the 
// number not being inside the array and returning a 1. Here is an example: If an array 
// called list stores the following values: int[] list = {42, 7, -9, 14, 8, 39, 42, 8, 19, 0};
// Then calling the method "indexOf(list, 8)" should return 4 because the value 8 returns at 
// index 4. Calling the method "indexOf(list, 2)" should return -1 because 2 is not a value 
// in the array.

public class Main {

    // Method returns the index of the first occurrence of target in array
    public static int indexOf(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;            // return index when target is found
            }
        }
        return -1;                   // return -1 if target not found
    }

    public static void main(String[] args) {
        int[] list = {42, 7, -9, 14, 8, 39, 42, 8, 19, 0};

        // Example 1: target is inside the array
        int result1 = indexOf(list, 8);
        System.out.println("indexOf(list, 8) = " + result1);  
        // Output: indexOf(list, 8) = 4

        // Example 2: target is NOT inside the array
        int result2 = indexOf(list, 2);
        System.out.println("indexOf(list, 2) = " + result2);  
        // Output: indexOf(list, 2) = -1
    }
}

//ChatGPT's output:
// indexOf(list, 8) = 4
// indexOf(list, 2) = -1

// Comments: Using ChatGPT to write a Java program was relatively simple. Maybe because
// the problem is much more simpler is why the program was made with no issues the first time,
// but giving the specific guidelines with an example gave me a perfectly working program
// on its first try with no issues. In terms of coding, ChatGPT is very helpful. I guess it
// being a program itself it would know how to be very helpful in all types of coding 
// languages. Definitely useful when struggling with troubleshooting an error in code
// or helping figure out the next step in what needs to be done.