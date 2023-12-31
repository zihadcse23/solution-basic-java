//01.

//2. Largest Element in Array: Find and print the largest element in an array.

/*import java.util.Scanner;
public class Solution {
    public static void main(String args[]) {
        int arr[] = {12, 13, 1, 10, 34, 10};

        int max = arr[0];

        for (int i=0; i<arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }

        }

        System.out.print(max);
    }
}*/

//3. Even or Odd Numbers: Check if a given number is even or odd using if-else. (also count in an array)

/*public class Solution {
        public static void main(String args[]) {
            int a[]={1,2,3,4,5,6,7,8,9,10};
            System.out.println("Odd Numbers:");
            for (int i=0;i<a.length;i++){
                if(a[i]%2!=0){
                    System.out.println(a[i]);
                }
            }
            System.out.println("Even Numbers:");
            for (int i=0;i<a.length;i++){
                if(a[i]%2==0){
                    System.out.println(a[i]);
                }
            }
        }
}*/

//4. Reverse an Array: Reverse the elements of an array.

/*import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Input array
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Input Array :" + Arrays.toString(array));

        // In-place reversal of array
        for(int i = 0; i < array.length / 2; i++) {
            // Swapping the elements
            int j = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = j;
        }

        System.out.println("Reversed Array :" + Arrays.toString(array));
    }

}*/


//5. Factorial Calculation: Write a program to calculate the factorial of a given number.*** + recursive solution.

/*public class Solution {
    public static void main(String[] args) {
        int num = 6;
        long factorial = multiplyNumbers (num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long multiplyNumbers (int num)
    {
        if (num >= 1) {
            long l1 = num * multiplyNumbers (num - 1);
            return l1;
        } else
            return 1;
    }
}*/

//06. Palindrome Check: Check if a given string is a palindrome. (use char string)

/*public class Solution {
    public boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }
}*/

//7. Prime Number Check: Determine whether a given number is prime.

/*import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n == 1) {
            System.out.println("NO");
            return;
        }

        for(int i=2;i<n;i++) {
            if(n % i == 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}*/

//08. Fibonacci Series: Generate and print the first N elements of the Fibonacci series.**** + recursive solution.

/*public class Solution {
    public static void main(String[] args) {

        int maxNumber = 10;
        int previousNumber = 0;
        int nextNumber = 1;
        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
        for (int i = 1; i <= maxNumber; ++i)

        {
            System.out.print(previousNumber+" ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}*/

//09. Linear Search: Implement a linear search algorithm to find an element in an array. (true or false return type).


/*public class Solution {
    public static void main(String a[]) {
        int[] arr = {12, 5, 10, 15, 31, 20, 25, 2, 40};
        int dataToSearch = 40;
        boolean isFound = search(arr, dataToSearch);
        if (isFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match Not found");
        }
    }

    public static boolean search(int[] arr, int dataToSearch) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == dataToSearch){
                return true;
            }
        }
        return false;
    }
}*/

//10. Binary Search: Implement binary search for a sorted array.

/*import java.util.Scanner;

public class Solution {
    int binarySearch(int array[], int element, int low, int high) {

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (array[mid] == element)
                return mid;

            if (array[mid] < element)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String args[]) {

        Solution  obj = new Solution ();

        int[] array = { 3, 4, 5, 6, 7, 8, 9 };
        int n = array.length;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter element to be searched:");

        int element = input.nextInt();
        input.close();

        int result = obj.binarySearch(array, element, 0, n - 1);

        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}*/

//11. Duplicate Elements: Find and print duplicate elements in an array.

/*public class Solution {

    public static void main(String[] args) {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 7, 8, 3, 2};
        for (int i=0; i<my_array.length-1; i++) {
            for (int j=i+1; j<my_array.length; j++) {
                if ((my_array[i] == my_array[j]) && (i!=j)) {
                    System.out.println("Duplicate Element: " + my_array[j]);
                }
            }
        }
    }
}*/

//12. Count Vowels and Consonants: Count the number of vowels and consonants in a given string.

/*import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String str;
        char ch;
        int len, i, vowel=0, consonant=0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the String: ");
        str = s.nextLine();

        len = str.length();
        for(i=0; i<len; i++)
        {
            ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                vowel++;
            else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                vowel++;
            else
            {
                int ascii = ch;
                if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122))
                    consonant++;
            }
        }

        System.out.println("\nTotal Vowels = " +vowel);
        System.out.println("Total Consonants = " +consonant);
    }
}*/

//13. Print the multiplication table for a given number.

/*import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Number: ");

        int num1 = in.nextInt();
        for (int i=0; i<10; i++) {
            System.out.println(num1 + "x" + (i+1)+"= "+(num1*(i+1)));
        }
    }
}*/

//14.

//15. Calculate the average of elements in an array.

/*public class Solution {
    public static void main(String[] args) {
        int[] numbers = new int[]{20, 30, 25, 45, -16, 60, -100};
        int sum = 0;
         for (int i= 0; i< numbers.length; i++) {
             sum=sum + numbers[i];
         }
         double average = (double) sum /numbers.length;
        System.out.println("Average value of the array elements: "+ average);
    }
}*/

//16. Determine whether a given year is a leap year.
/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int year;
        System.out.print("Choice a Year: ");
                Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!=0)) || (year%400 == 0))
            System.out.println("Your Choice year is a leap year");
        else
            System.out.println("Your Choice year is not a leap year");
    }
}
*/

//17.


//18. String Reversal: Reverse a given string without using built-in functions. apple, elppa

/*
public class Solution {
    public static void main(String[] args) {
        System.out.print("Main String: ");

        StringBuilder str = new StringBuilder("apple");
        System.out.println(str.toString());

        str.reverse();
        System.out.println("Reverse String: " + str.toString());
    }
}
 */

//19. Check if a number is an Armstrong number
/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int num= s.nextInt();

        int sNum = num;
        int cNum = 0;
        int r;

        while(num>0) {
            r= num % 10;
            cNum = cNum + (r*r*r);
            num= num/10;
        }
        if(sNum==cNum) {
            System.out.println(sNum + " It an Armstrong Number");
        }
        else {
            System.out.println(sNum + " It Not an Armstrong Number");
        }
    }
}
 */

//20. Find Minimum and Maximum: Write a program to find the minimum and maximum values in an array.
/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[] array = {5, 12, 9, 18, 3, 21};
        int max = array[0]; // Assume the first element is the maximum initially
        int min = array[0]; // Assume the first element is the minimum initially
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update maximum value
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
*/

//21. Calculate the simple interest for given principal, rate of interest, and time.
/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter the rate: ");
        double rate = input.nextDouble();

        System.out.print("Enter the time: ");
        double time = input.nextDouble();

        double interest = (principal * time * rate) / 100;

        System.out.println("Principal: " + principal);
        System.out.println("Interest Rate: " + rate);
        System.out.println("Time Duration: " + time);
        System.out.println("Simple Interest: " + interest);
    }
}
 */

//22. Write a program to convert temperatures from Celsius to Fahrenheit and vice versa.
/*
import java.util.Scanner;

public class Solution {
    static void convert() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value in Celcius: ");
        double cel = sc.nextDouble();
        double fa = ((9.0 / 5) * cel) + 32;
        System.out.println("Temperature in Fahrenheit: " + fa);
    }
    public static void main(String[] args) {
        convert();
    }
}
*/


//23. Write a program that checks whether the input character is an uppercase letter, lowercase letter, a digit, or a special 24. character.
/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char c = sc.next().charAt(0);
        int n = c;

        if (c >= 65 && c <= 90)
            System.out.println("Its Uppercase");

        else if (c >= 97 && c <= 122)
            System.out.println("Its Lowercase");

        else if (c >= 48 && c <= 57)
            System.out.println("Its Digit");

        else
            System.out.println("Special Character");
        System.out.println("ASCII value : " + n);
    }
}

 */


//24.

//25.

import java.util.Scanner;

public class Solution {
    private static int sumOfdigits(String number) {
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            if (Character.isDigit(ch)) {

                int value = Character.getNumericValue(ch);
                sum += value;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = scan.next();

        int sum = sumOfdigits(str);
        System.out.println("The sum of " + " digits in the string " + str + " = " + sum);
        scan.close();
    }
}