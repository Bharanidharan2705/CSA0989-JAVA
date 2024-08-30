import java.util.Scanner;

class PalindromeChecker extends Thread {
    private int number;

    public PalindromeChecker(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    private boolean isPalindrome(int num) {
        int reversed = 0, original = num;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
}

class PrimeChecker extends Thread {
    private int number;

    public PrimeChecker(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        PalindromeChecker palindromeChecker = new PalindromeChecker(number);
        PrimeChecker primeChecker = new PrimeChecker(number);

        palindromeChecker.start();
        primeChecker.start();
        
        try {
            palindromeChecker.join();
            primeChecker.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        scanner.close();
    }
}
