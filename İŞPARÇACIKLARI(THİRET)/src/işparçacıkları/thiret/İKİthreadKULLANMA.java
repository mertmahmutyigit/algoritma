package işparçacıkları.thiret;
class threadk extends Thread{

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName()+"==>"+i);
        }
    }



}


class thrd implements Runnable{

    
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }


}
public class İKİthreadKULLANMA {
    public static void main(String[] args) {
        threadk x=new threadk();
        threadk y=new threadk();
        x.setName("t1");
        y.setName("t2");
        x.start(); 
        y.start();
        thrd n= new thrd();
        
        Thread j=new Thread(n);
        j.start();
    }
 
}
