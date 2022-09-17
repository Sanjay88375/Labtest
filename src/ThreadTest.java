class Thread1 implements Runnable    //Implementing Runnable interface
{
	public void run() //overriding of run method
	{
		int sum=0;
		
		for(int i=1;i<=50;i++)
		{
			sum = sum+i;
		}
		
		double avg = sum/50;
		
		System.out.println("\nAverage of first fifty numbers are: "+avg);
	}
}


public class ThreadTest implements Runnable   //implementing Runnable interface in main method 
{    
	public void run()
	{
		int arr[] = {10,15,20,25,30};
		int result[]=new int[arr.length];
		
		System.out.println("Square of arrays numbers indivisually are:");
		for(int i=0;i<arr.length;i++)
		{
			result[i] = arr[i]*arr[i];
			System.out.print(result[i]+" ");
		}
		
		
	}
    
		// main method  
		public static void main(String argvs[])  
		{   
			// creating an object of the class Thread1  
				Runnable t1 = new Thread1(); 
				
			// creating an object of the class ThreadTest which is main Thread
				Runnable t2 = new ThreadTest();
				
				
			// creating an object of the class Thread using Thread(Runnable r)  
				Thread th1 = new Thread(t1);    
				Thread th2 = new Thread(t2);
				
				
			// the start() method moves the thread to the active state  
				
				th1.start();
				th2.start();
  
				
}    
}    
