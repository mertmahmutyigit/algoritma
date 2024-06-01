
package işparçacıkları.thiret;
class t1 implements Runnable{

  
    public void run() {
        
        System.out.println("merhaba");

    }}
    
    
 class t2 extends Thread{
 public void run(){
 
     System.out.println("selam  "+this.getName());
 
 }
 
 
 }
    
    

public class NewClass {
    public static void main(String[] args) {
        t1 k=new t1();
        Thread j =new Thread(k);
        j.start();
        
        t2 l=new t2();
        l.setName("t");
      l.start();
    }
}
