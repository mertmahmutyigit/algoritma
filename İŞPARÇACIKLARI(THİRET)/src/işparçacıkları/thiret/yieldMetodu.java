package işparçacıkları.thiret;


public class yieldMetodu extends Thread {
    public yieldMetodu(String name){
    
    super(name);
    
    }
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println(getName());
            yield();
        }
    
    }
    public static void main(String[] args) {
        yieldMetodu k = new yieldMetodu("t1");
        yieldMetodu t = new yieldMetodu("t2");
        k.start();
        t.start();
    }
}
