                                                                                                                                                                                                                                                                                                class armstrongthread extends Thread
{
 public void run()
	{	
for (int i = 1; i <= 1000; i++)
	 {
            int num = i;
            int sum = 0;
            while (num != 0)
	 {
                int digit = num % 10;
                sum += digit * digit * digit;
                num /= 10;
            }
            if (i == sum) {
                System.out.println("Armstrong Number: " + i);

	try
        {
	                 Thread.sleep(2000);
	}
	catch(InterruptedException e)
	{
	System.out.println(e);
	}
       }
     }
	System.out.println("Exiting Armstrong Thread");	
    }
}
class primethread extends Thread
{
	public void run()
	{
for (int i = 2; i < 6; i++) {
            if (6 % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
	
	try
	{
                    
           Thread.sleep(3000);
        }
	catch(InterruptedException e)
	{
	System.out.println(e);
         }
       }
     }
	System.out.println("Exiting  primeThread");	
     }
}
class Threading
{
	public static void main(String arg[])
	{
		ArmstrongThread armstrong = new ArmstrongThread();
        primeThread prime = new primeThread();
        armstrong.start();
        prime.start();
    }
}