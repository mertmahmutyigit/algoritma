package işparçacıkları.thiret;

public class ROBOTPRİORTY extends Thread{
    public ROBOTPRİORTY(String isim){
    
   super(isim); }
    
    
    public void run(){
        try {
             for (int i = 0; i <5; i++) {
            System.out.println("öncelik ="+this.getPriority()+ "  "+ this.getName()+"=== " +i);
        }
        } catch (Exception e) {
        }
 
    
    }
    
    
    public static void main(String[] args) {
     
        ROBOTPRİORTY k=new ROBOTPRİORTY("A");
        ROBOTPRİORTY j= new ROBOTPRİORTY("B");
        ROBOTPRİORTY l=new ROBOTPRİORTY("C");
        ROBOTPRİORTY Ş=new ROBOTPRİORTY("D");
        k.setPriority(MIN_PRIORITY);
        j.setPriority(NORM_PRIORITY);
        l.setPriority(MAX_PRIORITY);
        Ş.setPriority(MAX_PRIORITY-2);
        k.start();
        j.start();
        l.start();
        Ş.start();
    }

  
 
}
