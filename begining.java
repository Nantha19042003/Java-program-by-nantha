1. Hello World
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
2. Even or Odd Number
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        sc.close();
    }
}
3. Factorial of a Number
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
        sc.close();
    }
}
4. Fibonacci Series
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
5. Prime Number
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean prime = true;

        if (n <= 1)
            prime = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");

        sc.close();
    }
}
Good programs to practice next
Reverse a number
Palindrome number
Armstrong number
Calculator using switch
Student Management System
Bank Management System
Library Management System
ATM Simulation
Employee Management System
Hotel Booking System
Inventory Management System
Tic-Tac-Toe Game
Snake Game
File Handling Project
JDBC CRUD Application
Spring Boot REST API
