public class prime_number {


	   public static void main(String args[])
	   {
	      int n;
	      boolean status = true;
	      int num = 3;
	      System.out.println("First 100 prime numbers are:");   
	      System.out.println(2);
	      for ( int i = 2 ; i <=100 ;  )
	      {
	         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
	         {
	            if ( num%j == 0 )
	            {
	               status = false;
	               break;
	            }
	         }
	         if ( status != false )
	         {
	            System.out.println(num);
	            i++;
	         }
	         status = true;
	         num++;
	      }         
	   }
	}

