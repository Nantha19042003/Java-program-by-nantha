6. Reverse a Number

Example:

Input: 12345
Output: 54321
Code
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed Number = " + reverse);

        sc.close();
    }
}
Sample Output
Enter a number: 12345
Reversed Number = 54321
Logic
Read the number.
Get the last digit using % 10.

Add it to the reversed number:

reverse = reverse * 10 + digit;

Remove the last digit:

num = num / 10;
Repeat until the number becomes 0.

Dry Run (1234)

num	digit	reverse
1234	4	4
123	3	43
12	2	432
1	1	4321

Output

4321
