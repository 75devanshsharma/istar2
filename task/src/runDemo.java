class runDemo extends Thread
{  
 public void run()
 {  
  for(int i=1;i<5;i++)
  {  
    try
    {
    	Thread.sleep(500);
    	}
    catch(InterruptedException e)
    {
    	System.out.println(e);
    	}  
    System.out.println(i);  
  }  
 }  
 public static void main(String args[]){  
  runDemo t1=new runDemo();  
  runDemo t2=new runDemo();  
   
  t1.start();  
  t2.start(); 
  
 }  
}  