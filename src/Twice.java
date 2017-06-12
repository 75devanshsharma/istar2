public class Twice extends Thread{  
 public void run(){  
   System.out.println("running...");  
 }  
 public static void main(String args[]){  
  Twice t1=new Twice();  
  t1.start();  
  t1.start();
  
 }  
}  