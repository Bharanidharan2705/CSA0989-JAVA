
public class OddNumbersAndSum {
    public static void main(String[] args) {
        Thread oddNumbersThread = new Thread(new OddNumbers());
        Thread sumThread = new Thread(new SumOfOddNumbers());

        oddNumbersThread.start();
        sumThread.start();
    }
}

class OddNumbers implements Runnable {
    @Override
    public void run() {
        System.out.println("Odd Numbers up to 10 terms:");
        for (int i = 1; i < 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class SumOfOddNumbers implements Runnable {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i < 20; i += 2) {
            sum += i;
        }
        System.out.println("Sum of odd numbers up to 10 terms: " + sum);
    }
}
