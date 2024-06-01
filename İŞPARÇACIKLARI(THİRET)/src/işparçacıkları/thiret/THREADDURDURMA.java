package işparçacıkları.thiret;


public class THREADDURDURMA extends Thread{
   
      private int donguSayisi; 
      public THREADDURDURMA(String isim, int donguSayisi) {
             super(isim);
             this.donguSayisi = donguSayisi;
       }
public void run() {
  try {
       if (donguSayisi == 0) {
            return; // is parcacigini sonlandir.
        }
       for (int i=0; i<donguSayisi; i++) {
            System.out.println(this.getName()+"-->"+i);
      }
     } catch (Exception ex) {
            System.out.println("Hata olustu -->"+ ex);
      }

}

    public static void main(String args[]) {
         THREADDURDURMA r1 = new THREADDURDURMA("A", 2);
         THREADDURDURMA r2 = new THREADDURDURMA("B", 3);
         THREADDURDURMA r3 = new THREADDURDURMA("C", 3);
         THREADDURDURMA r4 = new THREADDURDURMA("D", 2);
               r1.start();	// dikkat
               r2.start();	// dikkat
               r3.start();	// dikkat
               r4.start();	// dikkat
	}
}
 

