package işparçacıkları.thiret;
class mert implements Runnable{
private char chartoprint;
private int times;
public mert(char c, int t){
chartoprint=c;
times=t;


}

    public void run() {
        for (int i = 0; i <times; i++) {
            System.out.println(chartoprint );   
        }
 
    }
}





public class ekraaAABBBCCCyazma {
    public static void main(String[] args) {
       Runnable pt=new mert('f',100);
        mert x= new mert('A',100);
        mert y= new mert('B', 100);
        mert z=new mert('C',100);
        Thread x1= new Thread(x);
        Thread y1=new Thread(y);
        Thread z1= new Thread(z);
        x1.start();
        z1.start();
        y1.start();
    }
  
}
