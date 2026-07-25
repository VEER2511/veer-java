

public class primes 
{
    public static void main(String[] args) 
    {
        // int n = 50;
        // //int count =0;
        
        // int i;
        // int count = 0;
        // for(i=1; i<=n; i++)
        // {
        //     //int count =0;
        //    // for(int j=1; j<=i; j++)
        //   //  {
        //         if(n%i==0)
        //         {
        //              count++;
        //         }
        //     //}
           
        // }
        //  if(count ==2)
        //     {
        //         System.out.println("prime");
        //     }
        int num = 7;  // You can change this to test other numbers
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
   
}
