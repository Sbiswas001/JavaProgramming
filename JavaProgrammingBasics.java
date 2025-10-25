// ================================================================
// File Name   : JavaProgrammingBasics.java
// Author      : Agnibesh Maity
// Description : A beginner-friendly Java program demonstrating
//               basic programming concepts:
//               1. Class and Object
//               2. Methods and User Input
//               3. Conditional Statements
//               4. Loops and Function Calls
// Created On  : October 2025
// ================================================================

import java.util.Scanner;

// ---------------------------------------------------------------
// A simple class with some basic Java functionalities
// ---------------------------------------------------------------
class JavaProgrammingBasics {

    // Method to display a greeting
    void printGreeting() {
        System.out.println("\n👋 Hello! Welcome to Java Programming Basics!");
        System.out.println("Let's explore some simple operations in Java.\n");
    }

    // Method to calculate the sum of two numbers
    void sumOfNumbers(Scanner sc) {
        System.out.println("=== SUM OF TWO NUMBERS ===");
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("✅ Sum = " + (a + b));
    }

    // Method to check even or odd
    void checkEvenOdd(Scanner sc) {
        System.out.println("\n=== EVEN OR ODD CHECKER ===");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println(n + " is Even ✅");
        else
            System.out.println(n + " is Odd ✅");
    }

    // Method to print a simple pattern
    void printPattern() {
        System.out.println("\n=== SIMPLE PATTERN ===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to calculate factorial
    void factorialCalculator(Scanner sc) {
        System.out.println("\n=== FACTORIAL CALCULATOR ===");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        System.out.println("Factorial of " + n + " = " + fact);
    }

    // ---------------------------------------------------------------
    // Main Menu
    // ---------------------------------------------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JavaProgrammingBasics obj = new JavaProgrammingBasics();
        int choice;

        obj.printGreeting();

        do {
            System.out.println("===========================================");
            System.out.println("🎯 JAVA PROGRAMMING MENU 🎯");
            System.out.println("===========================================");
            System.out.println("1️⃣  Print Greeting");
            System.out.println("2️⃣  Sum of Two Numbers");
            System.out.println("3️⃣  Check Even or Odd");
            System.out.println("4️⃣  Print Star Pattern");
            System.out.println("5️⃣  Find Factorial");
            System.out.println("6️⃣  Exit");
            System.out.println("-------------------------------------------");
            System.out.print("Enter your choice (1-6): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> obj.printGreeting();
                case 2 -> obj.sumOfNumbers(sc);
                case 3 -> obj.checkEvenOdd(sc);
                case 4 -> obj.printPattern();
                case 5 -> obj.factorialCalculator(sc);
                case 6 -> System.out.println("\n👋 Exiting... Thank you for learning Java!");
                default -> System.out.println("\n⚠️ Invalid choice! Please try again.");
            }
            System.out.println();

        } while (choice != 6);

        sc.close();
    }
}

